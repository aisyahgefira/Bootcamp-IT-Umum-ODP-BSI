import React, { useState } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
} from "react-native";

function TransferPage() {
  const [amount, setAmount] = useState("");
  const [notes, setNotes] = useState("");
  const balance = 10000000; // Saldo dalam IDR
  const receiver = "9000008940208"; // Nomor tujuan transfer

  return (
    <View style={styles.container}>
      {/* Header Transfer */}
      <Text style={styles.header}>Transfer</Text>

      {/* Penerima */}
      <View style={styles.receiverContainer}>
        <Text style={styles.receiverText}>To: {receiver}</Text>
      </View>

      {/* Input Amount */}
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
        <Text style={styles.balanceText}>
          Balance{" "}
          <Text style={styles.balanceAmount}>
            IDR {balance.toLocaleString()}
          </Text>
        </Text>
      </View>

      {/* Input Notes */}
      <Text style={styles.label}>Notes</Text>
      <TextInput
        style={styles.notesInput}
        placeholder=""
        value={notes}
        onChangeText={setNotes}
      />

      {/* Tombol Transfer */}
      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Transfer</Text>
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
  receiverContainer: {
    backgroundColor: "#0061FF",
    padding: 15,
    borderRadius: 8,
    marginBottom: 20,
  },
  receiverText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "bold",
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
  balanceText: {
    fontSize: 12,
    color: "#777",
    marginTop: 5,
  },
  balanceAmount: {
    color: "#0061FF",
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

export default TransferPage;
