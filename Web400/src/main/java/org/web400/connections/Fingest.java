package org.web400.connections;

import java.beans.PropertyVetoException;
import java.io.IOException;

import com.ibm.as400.access.AS400Exception;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Exception;
import com.ibm.as400.access.AS400File;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.CommandCall;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.Record;
import com.ibm.as400.access.SequentialFile;

public class Fingest {

	public String url = "fingest.its.it", user = null, password = null;
	
	//GET user, password from API REST
	
	public AS400 as400 = new AS400(url, user, password);
	
}




