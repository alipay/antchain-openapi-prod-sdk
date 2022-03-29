// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessageGetPageDTO extends TeaModel {
    // 消息的详细信息
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<MessageGetDTO> content;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 第一次新建查询时返回的查询任务 ID，用于后续获取消息。
    @NameInMap("task_id")
    public String taskId;

    // 总页数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static MessageGetPageDTO build(java.util.Map<String, ?> map) throws Exception {
        MessageGetPageDTO self = new MessageGetPageDTO();
        return TeaModel.build(map, self);
    }

    public MessageGetPageDTO setContent(java.util.List<MessageGetDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MessageGetDTO> getContent() {
        return this.content;
    }

    public MessageGetPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public MessageGetPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public MessageGetPageDTO setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public MessageGetPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
