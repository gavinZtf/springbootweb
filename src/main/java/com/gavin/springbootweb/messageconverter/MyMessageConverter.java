package com.gavin.springbootweb.messageconverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import com.gavin.springbootweb.domain.DemoObj;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
	
	 

	public MyMessageConverter() {
		super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));
	}

	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> arg0, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
		String[] tempAir = temp.split("-");
		return new DemoObj(new Long(tempAir[0]), tempAir[1]);
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		
		return DemoObj.class.isAssignableFrom(clazz);
	}

	@Override
	protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out = "hello : " + obj.getId() + "-" + obj.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
