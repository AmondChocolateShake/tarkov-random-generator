import fetch from "isomorphic-unfetch"

const App=({user})=>{
    const username=user&&user.name;

    return <div>{username}</div>
}

export const getServerSideProps=async()=>{
    try{
        const res=await fetch("https://api.github.com/users/AmondChocolateShake");
        if(res.status==200){
            const user=await res.json();
            return {props:{user}}
        }
        return{props:{}};
    }catch(e){
        console.log(e);
        return{props:{}};
    }
};



export default App;