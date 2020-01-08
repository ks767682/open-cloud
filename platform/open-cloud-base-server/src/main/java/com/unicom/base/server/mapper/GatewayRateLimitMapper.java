package com.unicom.base.server.mapper;

import com.unicom.base.client.model.entity.GatewayRateLimit;
import com.unicom.common.mybatis.base.mapper.SuperMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayRateLimitMapper extends SuperMapper<GatewayRateLimit> {
}
