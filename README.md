# Micro-Service
1. Naming-server
   * http://localhost:8761
2. Currency-Exchange-Service
   * http://localhost:8000/currency-exchange/from/USD/to/INR 
3. Currency-Conversion-Service
   * http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/27500
   * http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/27500
4. Api-Gateway
   * http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/2700
   * http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/2700
   * http://localhost:8765/currency-exchange/from/USD/to/INR
