import Link from "next/link";

const Tomato = () => {
  return(
    <div>
      <h2>Link to 'main' page</h2>
      <Link href='/' legacyBehavior>
        <a>Move to '/'</a>
      </Link>
    </div>
  )
}

export default Tomato