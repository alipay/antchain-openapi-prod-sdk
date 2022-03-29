// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class WarnLogPageDTO extends TeaModel {
    // 报警日志信息
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<WarnLogDTO> content;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总条数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static WarnLogPageDTO build(java.util.Map<String, ?> map) throws Exception {
        WarnLogPageDTO self = new WarnLogPageDTO();
        return TeaModel.build(map, self);
    }

    public WarnLogPageDTO setContent(java.util.List<WarnLogDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<WarnLogDTO> getContent() {
        return this.content;
    }

    public WarnLogPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public WarnLogPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public WarnLogPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
