import Link from "next/link";

const App=()=>{

    return(
        <div>
            <h2>Link to tomato page</h2>
            <Link href='/tomato'>
                <a>move to '/tomato'</a>
            </Link>
        </div>
    )
}