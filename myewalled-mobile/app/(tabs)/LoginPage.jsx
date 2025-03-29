import React, { useState } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  Image,
} from "react-native";

function LoginPage() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  return (
    <View style={styles.container}>
      <Image
        source={require("../../assets/images/walled-icon.png")}
        style={styles.logo}
      />

      <TextInput
        style={styles.input}
        placeholder="Email"
        value={email}
        onChangeText={setEmail}
        keyboardType="email-address"
        autoCapitalize="none"
      />
      <TextInput
        style={styles.input}
        placeholder="Password"
        value={password}
        onChangeText={setPassword}
        secureTextEntry
      />

      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Login</Text>
      </TouchableOpacity>

      <Text style={styles.footerText}>
        Don’t have an account? <Text style={styles.link}>Register here</Text>
      </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#f5f5f5",
    padding: 20,
  },
  logo: {
    marginBottom: 10,
  },
  title: {
    fontSize: 28,
    fontWeight: "bold",
    marginBottom: 20,
  },
  input: {
    width: "100%",
    height: 50,
    borderRadius: 10,
    paddingHorizontal: 15,
    marginBottom: 10,
    backgroundColor: "#fff",
    fontSize: 16,
    shadowColor: "#000",
    shadowOpacity: 0.1,
    shadowRadius: 5,
    elevation: 3,
  },
  button: {
    backgroundColor: "#0061FF",
    padding: 15,
    borderRadius: 8,
    alignItems: "center",
    width: "100%",
  },
  buttonText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "bold",
  },
  footerText: {
    marginTop: 15,
    fontSize: 14,
  },
  link: {
    color: "#0061FF",
    fontWeight: "bold",
  },
});

export default LoginPage;
