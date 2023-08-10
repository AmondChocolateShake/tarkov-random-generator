import Link from "next/link"
import ModeListBox from "../src/components/modeListBox";
import React from "react";
import styles from '../styles/index.module.css'

const App = () => {

    return (
        // <body className={styles.bodyStyle}>
            <div>
                <Link href='/'>
                    <h1>Escape from Tarkov random weapon generator</h1>
                </Link>
                <div>
                    <h2>modeListBox</h2>
                </div>
            </div>
        // </body>
    )

}


export default App;