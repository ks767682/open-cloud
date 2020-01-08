package com.unicom.base.server.mapper;

import com.unicom.base.client.model.IpLimitApi;
import com.unicom.common.mybatis.base.mapper.SuperMapper;
import com.unicom.base.client.model.entity.GatewayIpLimitApi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuyadu
 */
@Repository
public interface GatewayIpLimitApisMapper extends SuperMapper<GatewayIpLimitApi> {

    List<IpLimitApi> selectIpLimitApi(@Param("policyType") int policyType);
}
