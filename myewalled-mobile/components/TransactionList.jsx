import React from "react";
import { View, Text, FlatList, StyleSheet } from "react-native";

const transactions = [
  { id: "1", description: "Grocery Shopping", amount: "-$50" },
  { id: "2", description: "Salary", amount: "+$2000" },
  { id: "3", description: "Electricity Bill", amount: "-$100" },
];

function TransactionList() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Recent Transactions</Text>
      <FlatList
        data={transactions}
        keyExtractor={(item) => item.id}
        renderItem={({ item }) => (
          <View style={styles.transaction}>
            <Text style={styles.description}>{item.description}</Text>
            <Text style={styles.amount}>{item.amount}</Text>
          </View>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    marginVertical: 20,
    paddingHorizontal: 20,
  },
  title: {
    fontSize: 18,
    fontWeight: "bold",
    marginBottom: 10,
  },
  transaction: {
    flexDirection: "row",
    justifyContent: "space-between",
    padding: 10,
    backgroundColor: "#fff",
    borderRadius: 8,
    marginBottom: 5,
    shadowColor: "#000",
    shadowOpacity: 0.1,
    shadowRadius: 5,
    elevation: 3,
  },
  description: {
    fontSize: 16,
  },
  amount: {
    fontSize: 16,
    fontWeight: "bold",
  },
});

export default TransactionList;
