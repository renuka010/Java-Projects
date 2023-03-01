
# Dynamic PDF Creator

This is an Spring Boot Application with REST API, that generates dynamic PDF based on the recieved data in a predefined format.

This application uses iText Library for creating PDF and stores it in local storage.


## API Reference

#### Generate PDF

```http
  POST /createpdf
```
#### Input format
```json
{
   "seller": "XYZ Pvt. Ltd.",
   "sellerGstin": "29AABBCCDD121ZD",
   "sellerAddress": "New Delhi, India",
   "buyer": "Vedant Computers",
   "buyerGstin": "29AABBCCDD131ZD",
   "buyerAddress": "New Delhi, India",
   "items": 
   [      
      {
         "name": "Product 1",
         "quantity": "12 Nos",
         "rate": 123,
         "amount": 1476
      }
   ]
}
```
