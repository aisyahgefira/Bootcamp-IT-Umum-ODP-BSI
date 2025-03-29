import React, { useState } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  Image,
  CheckBox,
} from "react-native";

function RegisterPage() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [avatar, setAvatar] = useState("");
  const [isChecked, setIsChecked] = useState(false);

  return (
    <View style={styles.container}>
      <Image
        source={require("../../assets/images/walled-icon.png")}
        style={styles.logo}
      />

      <TextInput
        style={styles.input}
        placeholder="Fullname"
        value={name}
        onChangeText={setName}
        autoCapitalize="words"
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
      <TextInput
        style={styles.input}
        placeholder="Avatar Url"
        value={avatar}
        onChangeText={setAvatar}
      />

      <View style={styles.checkboxContainer}>
        <CheckBox
          value={isChecked}
          onValueChange={setIsChecked}
          style={styles.checkbox}
        />
        <Text style={styles.checkboxText}>
          I have read and agree to the{" "}
          <Text style={styles.link}>Terms and Conditions</Text> *
        </Text>
      </View>

      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Register</Text>
      </TouchableOpacity>

      <Text style={styles.footerText}>
        Have an account? <Text style={styles.link}>Login here</Text>
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
  checkboxContainer: {
    flexDirection: "row",
    alignItems: "center",
    width: "100%",
    marginBottom: 15,
  },
  checkbox: {
    marginRight: 10,
  },
  checkboxText: {
    fontSize: 14,
  },
  link: {
    color: "#0061FF",
    fontWeight: "bold",
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
});

export default RegisterPage;
