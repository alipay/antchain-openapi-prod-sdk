// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightStatistictableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 自定义统计的指标ID
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 多个维度名称，空表示所有维度
    @NameInMap("dimensions")
    public java.util.List<String> dimensions;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 页码
    @NameInMap("page_no")
    public Long pageNo;

    public static QueryChaininsightStatistictableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightStatistictableRequest self = new QueryChaininsightStatistictableRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightStatistictableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightStatistictableRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightStatistictableRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightStatistictableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryChaininsightStatistictableRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryChaininsightStatistictableRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryChaininsightStatistictableRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

}
