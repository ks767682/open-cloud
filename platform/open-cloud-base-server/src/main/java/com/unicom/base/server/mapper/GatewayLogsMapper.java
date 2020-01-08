package com.unicom.base.server.mapper;

import com.unicom.base.client.model.entity.GatewayAccessLogs;
import com.unicom.common.mybatis.base.mapper.SuperMapper;
import org.springframework.stereotype.Repository;

/**
 * @author liuyadu
 */
@Repository
public interface GatewayLogsMapper extends SuperMapper<GatewayAccessLogs> {
}
