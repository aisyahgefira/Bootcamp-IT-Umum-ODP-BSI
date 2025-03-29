import React from "react";
import { View, TouchableOpacity, Text, StyleSheet } from "react-native";

function Control() {
  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Send Money</Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Top Up</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexDirection: "row",
    justifyContent: "space-around",
    marginVertical: 20,
  },
  button: {
    backgroundColor: "#28a745",
    padding: 15,
    borderRadius: 8,
    alignItems: "center",
    width: "45%",
  },
  buttonText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "bold",
  },
});

export default Control;
