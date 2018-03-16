package com.kingdee.youshang.katcat.entity;
/**
 * <p><b>Description:</b> 常量类 <p>
 * <b>Company:</b> 
 *
 * @author created by fw at 22:49 on 2017-10-23
 * @version V0.1
 */
public class MQConstants {
	
	/**你的业务交换机名称*/
	public static final String BUSINESS_EXCHANGE = "business.exchange";
	/**你的业务队列名称*/
	public static final String BUSINESS_QUEUE = "business.queue";
	/**你的业务key*/
	public static final String BUSINESS_KEY = "business.key";
	
	
	public static final String MQ_PRODUCER_RETRY_KEY = "mq.producer.retry.key";
	public static final String MQ_CONSUMER_RETRY_COUNT_KEY = "mq.consumer.retry.count.key";
	/**死信队列配置*/
	public static final String DLX_EXCHANGE = "dlx.exchange";
	public static final String DLX_QUEUE = "dlx.queue";
	public static final String DLX_ROUTING_KEY = "dlx.routing.key";
	
	/** 最大重试次数 */
	public static final int MAX_CONSUMER_COUNT = 5; 
	/** 递增时的基本常量 */
	public static final int BASE_NUM = 2;
	/** 空的字符串 */
	public static final String BLANK_STR = "";
	
	

}
