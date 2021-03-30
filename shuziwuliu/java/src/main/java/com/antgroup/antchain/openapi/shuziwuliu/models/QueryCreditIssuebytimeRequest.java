// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuebytimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定查询者分布式数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 查询截止时间
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 是否只返回已发行凭证信息
    @NameInMap("issued_only")
    @Validation(required = true)
    public Boolean issuedOnly;

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示数量 不超过100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 目前填PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 查询起始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    public static QueryCreditIssuebytimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuebytimeRequest self = new QueryCreditIssuebytimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuebytimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditIssuebytimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditIssuebytimeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditIssuebytimeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCreditIssuebytimeRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuebytimeRequest setIssuedOnly(Boolean issuedOnly) {
        this.issuedOnly = issuedOnly;
        return this;
    }
    public Boolean getIssuedOnly() {
        return this.issuedOnly;
    }

    public QueryCreditIssuebytimeRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditIssuebytimeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditIssuebytimeRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuebytimeRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditIssuebytimeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
