# xades-signer-cr
Este proyecto realiza el firmado digital de los XMLs de factura electrónica para Costa Rica.

En la carpeta https://github.com/johann04/xades-signer-cr/tree/master/xadessignercr/release está el jar ya compilado:

```
Usage:
java -jar xades-signer-cr sign <keyPath> <keyPassword> <xmlInPath> <xmlOutPath> <type>
java -jar xades-signer-cr send <endPoint> <xmlPath> <username> <password> <type>
java -jar xades-signer-cr query <endPoint> <xmlPath> <username> <password> <type>
```

**sign** firma el xml.

**send** envía el xml a hacienda.

**query** consulta el status de una factura basado en su xml (lee el consecutivo del archivo y consulta ese consecutivo).

**<keypath>** Ruta de la llave (archivo .p12) generado en ATV (https://www.hacienda.go.cr/ATV/login.aspx).

**<keyPassword>** Pin elegido a la hora de descargar la llave.

**<endPoint>** Endpoint para enviar/recibir la información a hacienda (igual ATV lo proporciona, varía entre producción y desarrollo).

**<username>** Nombre de usuario generado en ATV.

**<password>** Password generado en ATV.
  
**<type>** Tipo de documento -> FacturaElectronica | NotaCreditoElectronica | TiqueteElectronico | NotaDebitoElectronica
  
Este proyecto iba a ser utilizado en la implementación de firma digital de mi proyecto https://www.facebook.com/workoutstudioapp pero finalmente no lo utilicé... si le pareció útil siempre me puede colaborar con un like.
