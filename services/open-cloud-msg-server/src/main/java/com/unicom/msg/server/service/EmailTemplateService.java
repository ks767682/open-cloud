package com.unicom.msg.server.service;

import com.unicom.msg.client.model.entity.EmailTemplate;
import com.unicom.common.mybatis.base.service.IBaseService;

/**
 * 邮件模板配置 服务类
 *
 * @author admin
 * @date 2019-07-25
 */
public interface EmailTemplateService extends IBaseService<EmailTemplate> {

    EmailTemplate getByCode(String code);
}
