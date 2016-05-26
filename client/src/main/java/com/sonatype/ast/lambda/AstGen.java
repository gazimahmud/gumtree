package com.sonatype.ast.lambda;
import com.amazonaws.services.lambda.runtime.Context; 


public class AstGen {
	public String myHandler(int myCount, Context context) {
		myCount = 10000;
        return String.valueOf(myCount);
    }
}
