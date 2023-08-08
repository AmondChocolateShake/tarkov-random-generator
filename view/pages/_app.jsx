// _app.jsx은 Next.js에서 공식적으로 전역 상태 관리 기능을 제공하도록 만들어놓은 파일이다.

import '../src/styles/styles.css'
export default function App({Component, pageProps}){
    return <Component {...pageProps} />
}