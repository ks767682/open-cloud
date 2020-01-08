package com.unicom.msg.server.service.impl;

import com.unicom.common.mybatis.base.service.impl.BaseServiceImpl;
import com.unicom.msg.client.model.entity.EmailLogs;
import com.unicom.msg.server.mapper.EmailLogsMapper;
import com.unicom.msg.server.service.EmailLogsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 邮件发送日志 服务实现类
 *
 * @author liuyadu
 * @date 2019-07-17
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmailLogsServiceImpl extends BaseServiceImpl<EmailLogsMapper, EmailLogs> implements EmailLogsService {

}
