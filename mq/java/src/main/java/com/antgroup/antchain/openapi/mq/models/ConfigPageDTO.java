// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConfigPageDTO extends TeaModel {
    // config page
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<ConfigDTO> content;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总量
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static ConfigPageDTO build(java.util.Map<String, ?> map) throws Exception {
        ConfigPageDTO self = new ConfigPageDTO();
        return TeaModel.build(map, self);
    }

    public ConfigPageDTO setContent(java.util.List<ConfigDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ConfigDTO> getContent() {
        return this.content;
    }

    public ConfigPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ConfigPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ConfigPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
