/**
 * gomeo2o.com 
 * Copyright (c) 2015-2025 All Rights Reserved.
 * @Description TODO 
 * @author fengxin
 * @date 2016年3月8日 下午2:01:46
 */
package com.SpringAnnotation.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description TODO 
 * @author fengxin
 * @date 2016年3月8日 下午2:01:46
 */
@Component
public class testInitializingBean implements InitializingBean{

	/**
	 * @Description TODO 
	 * @author fengxin
	 * @date 2016年3月8日 下午2:01:59
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("fegxin");
		
	}

}
