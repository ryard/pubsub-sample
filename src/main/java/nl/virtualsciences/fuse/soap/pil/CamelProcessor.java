package nl.virtualsciences.fuse.soap.pil;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import ns.cdm.reisinformatie.message.landelijkbericht._1.PutReisInformatieBoodschapOut;
import ns.cdm.reisinformatie.message.landelijkbericht._1.ReisInformatieProductPILResponse;



public class CamelProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
//        OutputSOATest out = new OutputSOATest();
//        List soaList = exchange.getIn().getBody(List.class);
//        InputSOATest inputSOATest = (InputSOATest) soaList.get(0);
//        out.setResult("Welcome " + inputSOATest.getTest().toString());
//        exchange.getMessage().setBody(out);
    	
    	PutReisInformatieBoodschapOut putReisInformatieBoodschapOut = new PutReisInformatieBoodschapOut();
    	ReisInformatieProductPILResponse reisInformatieProductPILResponse = new ReisInformatieProductPILResponse();
    	reisInformatieProductPILResponse.setSuccess("OK");
    	putReisInformatieBoodschapOut.setReisInformatieProductPILResponse(reisInformatieProductPILResponse);
    	exchange.getOut().setBody(putReisInformatieBoodschapOut);
    }

}