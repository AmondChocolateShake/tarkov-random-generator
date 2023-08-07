import Link from "next/link"
import ModeListBox from "./components/modeListBox";
import React from "react";


const App = () => {

    return (
        <body>
            <div>
                <Link href='/' legacyBehavior>
                    <a><h1>Escape from Tarkov</h1></a>
                </Link>
                <ModeListBox />
            </div>
            <style sjx>{
                `body {
                    background-Color : black;
                }`
                }
            </style>
        </body>
    )

}


export default App;