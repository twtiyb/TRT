package cn.com.iscs.upload.action;

import cn.com.iscs.upload.entity.AbsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@ResponseBody
@RequestMapping(value = "/test")
@RestController
public class testEmptyAction {
	public final static String FILE_CONTAINER = "temp";
	@RequestMapping(value = "/testEmpty")
	public AbsResponse testEmpty(HttpServletRequest request) throws Exception {
		return new AbsResponse();
	}

	@RequestMapping(value = "/testSleep")
	public AbsResponse testSlepp(HttpServletRequest request) throws Exception {
		Long timeMillis = new Long(request.getParameter("timeMillis"));
		Thread.sleep(timeMillis);
		AbsResponse abs = new AbsResponse();
		abs.setData(timeMillis);
		return abs;
	}
}