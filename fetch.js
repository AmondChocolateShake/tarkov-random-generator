import { graphql } from 'graphql'


const query = `
query {
  items(where: { category: { name: { eq: "Assault rifle" } } }) {
    name
    category {
      name
    }
  }
}
`;

graphql(schema, query).then(result => {
  // 결과 처리
  const filteredItems = result.data.items.filter(item => item.category.name === "Assault rifle");
  console.log(filteredItems);
});
