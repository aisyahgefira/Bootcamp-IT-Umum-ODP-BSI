import React from "react";
import { View, Text, Image, StyleSheet } from "react-native";

function Profile() {
  return (
    <View style={styles.container}>
      <Image
        source={{ uri: "https://via.placeholder.com/100" }}
        style={styles.avatar}
      />
      <Text style={styles.name}>John Doe</Text>
      <Text style={styles.balance}>Balance: $1,500</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    alignItems: "center",
    marginVertical: 20,
  },
  avatar: {
    width: 100,
    height: 100,
    borderRadius: 50,
    marginBottom: 10,
  },
  name: {
    fontSize: 18,
    fontWeight: "bold",
  },
  balance: {
    fontSize: 16,
    color: "#555",
  },
});

export default Profile;
