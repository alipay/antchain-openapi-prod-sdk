// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签，做code数据隔离使用
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(required = true, maxLength = 160, minLength = 1)
    public String code;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true, maximum = 200)
    public Long pageSize;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    // 绑定信息记录唯一标识
    @NameInMap("unique_id")
    @Validation(maxLength = 64, minLength = 1)
    public String uniqueId;

    // 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
    @NameInMap("status")
    @Validation(maxLength = 256, minLength = 1)
    public String status;

    // 仅能取如下值范围： 1. ASC 按注册时间升序 2. DESC 按注册时间降序 默认降序
    @NameInMap("sort_type")
    public String sortType;

    public static QueryCodeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeRelationRequest self = new QueryCodeRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryCodeRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCodeRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCodeRelationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCodeRelationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCodeRelationRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCodeRelationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCodeRelationRequest setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

    public QueryCodeRelationRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public QueryCodeRelationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCodeRelationRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
