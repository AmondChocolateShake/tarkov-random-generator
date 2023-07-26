// const { json } = require("stream/consumers");

// fetch('https://api.tarkov.dev/graphql', {
//   method: 'POST',
//   headers: {
//     'Content-Type': 'application/json',
//     'Accept': 'application/json',
//   },
//   body: JSON.stringify({query: `{
//     items(name: "m855a1") {
//         id
//         name
//         shortName
//     }
// }`})
// })
//   .then(r => r.json())
//   .then(data => console.log('data returned:', data))


// const url = 'https://api.tarkov.dev/graphql'
// fetch(url)
//   .then((res) => console.log(res))
//   .then((data) => JSON.stringify(data))
//   .then((data) => console.dir(data))

fetch('https://api.tarkov.dev/graphql', {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
  },
  body: JSON.stringify({ query: `{
    __schema {
      types {
        name
        description
        fields {
          name
          description
        }
      }
    }
  }`})
})
  .then(r => r.json())
  .then(data => console.log('schema information:', data));
