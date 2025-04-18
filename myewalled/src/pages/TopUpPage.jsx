import Nav from "../components/Nav";
import "../styles/TopUpPage.css";
import DropdownInput from "../components/DropdownInput";
import AmountInput from "../components/AmountInput";
import NoteInput from "../components/PrimaryButton";
import PrimaryButton from "../components/PrimaryButton";

function TopUpPage() {
  return (
    <>
      <Nav />
      <div className="topup-page">
        <div className="topup-container">
          <h1 className="topup-heading">Top Up</h1>
          <div className="topup-card">
            <AmountInput
              label="Amount"
              value="IDR 150.000,00"
              balance="IDR 10.000.000"
            />
            <DropdownInput label="From" value="Credit Card" />
            <NoteInput />
            <PrimaryButton text="Top Up" />
          </div>
        </div>
      </div>
    </>
  );
}

export default TopUpPage;