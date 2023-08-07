import Link from 'next/link'

const App = () => {
    return (
        <div>
            <h2>Link to 'tomato; page</h2>
            <Link href="/tomato" legacyBehavior>
                <a>Move to '/tomato'</a>
            </Link>
        </div>
    )
}

export default App;