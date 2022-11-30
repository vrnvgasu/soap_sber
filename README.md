### Postman settings
```
HEADERS
Content-Type: text/xml
```
```
Body
raw: text
```

### REQUEST examples:
```xml
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <helloWorldRequest>
    </helloWorldRequest>
  </soap:Body>
</soap:Envelope>
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <cityInfoReq>
        <id>test</id>
    </cityInfoReq>
  </soap:Body>
</soap:Envelope>
```