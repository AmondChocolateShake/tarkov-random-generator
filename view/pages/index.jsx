import React,{useState} from "react"
import Link from "next/link"

const App=()=>{
    const [username,setUsername]=useState("");

    return(
        <div>
            <label>
                username
                <input value={username} onChange={(e)=>setUsername(e.target.value)} />
            </label>
            <p>{username} 깃허브 검색하기</p>
            <Link href={`/users/${username}`}>검색하기</Link>
        </div>
    )    

}


export default App;