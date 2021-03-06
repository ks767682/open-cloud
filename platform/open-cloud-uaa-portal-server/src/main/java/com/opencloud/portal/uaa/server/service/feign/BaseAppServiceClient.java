package com.opencloud.portal.uaa.server.service.feign;

import com.unicom.base.client.service.IBaseAppServiceClient;
import com.unicom.base.client.constants.BaseConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: liuyadu
 * @date: 2018/10/24 16:49
 * @description:
 */
@Component
@FeignClient(value = BaseConstants.BASE_SERVER)
public interface BaseAppServiceClient extends IBaseAppServiceClient {


}
