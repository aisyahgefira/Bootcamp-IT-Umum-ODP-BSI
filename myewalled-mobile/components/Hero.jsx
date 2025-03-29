import React from "react";
import { View, Text, StyleSheet } from "react-native";

function Hero() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Welcome to Your Wallet</Text>
      <Text style={styles.subtitle}>Manage your transactions easily</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: 20,
    backgroundColor: "#007bff",
    borderRadius: 10,
    alignItems: "center",
    marginBottom: 20,
  },
  title: {
    fontSize: 22,
    fontWeight: "bold",
    color: "#fff",
  },
  subtitle: {
    fontSize: 16,
    color: "#e0e0e0",
    marginTop: 5,
  },
});

export default Hero;
