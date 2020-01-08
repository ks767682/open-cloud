package com.unicom.base.server.mapper;

import com.unicom.base.client.model.RateLimitApi;
import com.unicom.common.mybatis.base.mapper.SuperMapper;
import com.unicom.base.client.model.entity.GatewayRateLimitApi;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuyadu
 */
@Repository
public interface GatewayRateLimitApisMapper extends SuperMapper<GatewayRateLimitApi> {

    List<RateLimitApi> selectRateLimitApi();

}
