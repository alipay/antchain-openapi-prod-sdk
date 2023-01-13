// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DataSearchRequest extends TeaModel {
    // 所有请求字符串，支持使用 and, or 逻辑连接词和括号
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 分页，返回数据结果起始位置
    @NameInMap("offset")
    public Long offset;

    // 请求的结果数量，默认值 10
    @NameInMap("size")
    public Long size;

    // 是否按时间降序排列
    @NameInMap("reverse")
    public Boolean reverse;

    // 检索数据的截止时间范围，Unix时间戳（秒）
    @NameInMap("to")
    public Long to;

    // 检索结果的总条数
    @NameInMap("total")
    public Long total;

    public static DataSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        DataSearchRequest self = new DataSearchRequest();
        return TeaModel.build(map, self);
    }

    public DataSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DataSearchRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public DataSearchRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DataSearchRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public DataSearchRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public DataSearchRequest setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
