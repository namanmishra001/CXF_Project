package org.naman;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService(serviceName="Operations")
@SOAPBinding(style=Style.RPC)
public class OperationService {

	@WebMethod
	@WebResult(name = "AdditionResult")
	public int add(@WebParam(name = "FirstNo") int numberOne,
				   @WebParam(name = "SecondNo") int numberTwo) {
			return numberOne + numberTwo;
	}
	@WebMethod
	@WebResult(name = "SubtractionResult")
	public int sub(@WebParam(name = "FirstNo") int numberOne,
				   @WebParam(name = "SecondNo") int numberTwo) {
			return numberOne - numberTwo;
	}
}
