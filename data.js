import { graphql, GraphQLSchema, GraphQLObjectType, GraphQLString } from 'graphql';

// 스키마에 사용될 타입 정의
const ItemType = new GraphQLObjectType({
  name: 'Item',
  fields: {
    name: { type: GraphQLString },
    category: { type: GraphQLString },
  },
});

// Query 타입 정의
const RootQueryType = new GraphQLObjectType({
  name: 'Query',
  fields: {
    items: {
      type: ItemType,
      resolve: () => {
        // items 데이터를 반환하는 로직 구현
      },
    },
  },
});

// 스키마 생성
const schema = new GraphQLSchema({
  query: RootQueryType,
});

const query = `
  query {
    items {
      name
      category {
        name
      }
    }
  }
`;

graphql(schema, query)
  .then(result => {
    // 결과 처리
    const filteredItems = result.data.items.filter(item => item.category.name === "Assault rifle");
    console.log(filteredItems);
  })
  .catch(error => {
    // 오류 처리
    console.error("GraphQL 오류 발생:", error.message);
  });
