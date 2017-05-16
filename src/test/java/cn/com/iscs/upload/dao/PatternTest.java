package cn.com.iscs.upload.dao;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by chunchun.xu on 2017/1/3.
 */
public class PatternTest {

		@Test
		public void testPattern() throws Exception {
			String testStr =
					"fdsfdsfdsafdsa\n" +
							"@ApiRequestParamsDes\n" +
							"fdsfdsafdsafdsafdsa\n" +
							"@ApiResponseParamsDes\n"+
							"-----------------";
			Pattern methodParamsDesPattern = Pattern.compile("(@ApiRequestParamsDes){1,}");
			System.out.println(methodParamsDesPattern.split(testStr).toString());
		}
}
