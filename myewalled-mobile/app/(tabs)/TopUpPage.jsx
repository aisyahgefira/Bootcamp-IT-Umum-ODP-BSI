import React, { useState } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
} from "react-native";

function TopUpPage() {
  const [amount, setAmount] = useState("");
  const [notes, setNotes] = useState("");
  const [selectedMethod, setSelectedMethod] = useState("Bank Transfer");

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Top Up</Text>

      <View style={styles.amountContainer}>
        <Text style={styles.label}>Amount</Text>
        <View style={styles.amountInput}>
          <Text style={styles.currency}>IDR</Text>
          <TextInput
            style={styles.amountText}
            placeholder="0"
            value={amount}
            onChangeText={setAmount}
            keyboardType="numeric"
          />
        </View>
      </View>

      <Text style={styles.label}>Payment Method</Text>
      <View style={styles.paymentContainer}>
        {["Bank Transfer", "Credit Card"].map((method) => (
          <TouchableOpacity
            key={method}
            style={[
              styles.paymentButton,
              selectedMethod === method && styles.paymentButtonSelected,
            ]}
            onPress={() => setSelectedMethod(method)}
          >
            <Text
              style={[
                styles.paymentText,
                selectedMethod === method && styles.paymentTextSelected,
              ]}
            >
              {method}
            </Text>
          </TouchableOpacity>
        ))}
      </View>

      <Text style={styles.label}>Notes</Text>
      <TextInput
        style={styles.notesInput}
        placeholder=""
        value={notes}
        onChangeText={setNotes}
      />

      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Top Up</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: "#f5f5f5",
  },
  header: {
    fontSize: 20,
    fontWeight: "bold",
    marginBottom: 10,
  },
  amountContainer: {
    backgroundColor: "#fff",
    padding: 15,
    borderRadius: 8,
    marginBottom: 10,
    shadowColor: "#000",
    shadowOpacity: 0.1,
    shadowRadius: 5,
    elevation: 3,
  },
  label: {
    fontSize: 14,
    color: "#777",
    marginBottom: 5,
  },
  amountInput: {
    flexDirection: "row",
    alignItems: "center",
  },
  currency: {
    fontSize: 18,
    fontWeight: "bold",
    marginRight: 10,
  },
  amountText: {
    fontSize: 32,
    fontWeight: "bold",
    flex: 1,
  },
  paymentContainer: {
    flexDirection: "row",
    justifyContent: "space-between",
    marginBottom: 15,
  },
  paymentButton: {
    flex: 1,
    padding: 10,
    marginHorizontal: 5,
    borderRadius: 8,
    alignItems: "center",
    backgroundColor: "#f0f0f0",
  },
  paymentButtonSelected: {
    backgroundColor: "#0061FF",
  },
  paymentText: {
    fontSize: 14,
    color: "#333",
  },
  paymentTextSelected: {
    color: "#fff",
    fontWeight: "bold",
  },
  notesInput: {
    height: 40,
    backgroundColor: "#fff",
    borderRadius: 8,
    paddingHorizontal: 10,
    marginBottom: 20,
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
  },
  buttonText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "bold",
  },
});

export default TopUpPage;
