import Nav from "../components/Nav";
import "../styles/TransferPage.css";
import DropdownInput from "../components/DropdownInput";
import AmountInput from "../components/AmountInput";
import NoteInput from "../components/PrimaryButton";
import PrimaryButton from "../components/PrimaryButton";

function TransferPage() {
  return (
    <>
      <Nav />
      <div className="transfer-page">
        <div className="transfer-container">
          <h1 className="transfer-heading">Transfer</h1>
          <div className="transfer-card">
            <DropdownInput label="To" value="0914449798 (Aisyah Gefira)" />
            <AmountInput
              label="Amount"
              value="IDR 150.000,00"
              balance="IDR 10.000.000"
            />
            <NoteInput />
            <PrimaryButton text="Transfer" />
          </div>
        </div>
      </div>
    </>
  );
}

export default TransferPage;