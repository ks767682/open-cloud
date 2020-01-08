package com.unicom.base.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.unicom.base.client.model.entity.GatewayAccessLogs;
import com.unicom.common.model.PageParams;

/**
 * 网关访问日志
 * @author liuyadu
 */
public interface GatewayAccessLogsService {
    /**
     * 分页查询
     *
     * @param pageParams
     * @return
     */
    IPage<GatewayAccessLogs> findListPage(PageParams pageParams);
}
