import { Routes, Route } from "react-router-dom";
import HomePage from "./pages/HomePage";
import LoginPage from "./pages/LoginPage";
import RegisterPage from "./pages/RegisterPage";
import TransferPage from "./pages/TransferPage";
import TopUpPage from "./pages/TopUpPage";

function App() {
  return (
    <Routes>
      <Route path="/" element={<HomePage />} />
      <Route path="/login" element={<LoginPage />} />
      <Route path="/register" element={<RegisterPage />} />
      <Route path="/transfer" element={<TransferPage />} />
      <Route path="/topup" element={<TopUpPage />} />
    </Routes>
  );
}

export default App;