package com.unicom.task.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unicom.task.client.model.entity.TaskJobLogs;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerJobLogsMapper extends BaseMapper<TaskJobLogs> {
}
