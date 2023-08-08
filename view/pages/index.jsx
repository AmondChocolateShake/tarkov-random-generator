import Link from "next/link"
import ModeListBox from "../src/components/modeListBox";
import React from "react";
import style from '../styles/styles.module.css'

const App = () => {

    return (
        <body className={style.body}>
            <div>
                <Link href='/' legacyBehavior>
                    <a><h1>Escape from Tarkov random weapon generator</h1></a>
                </Link>
                <ModeListBox />
            </div>
        </body>
    )

}


export default App;