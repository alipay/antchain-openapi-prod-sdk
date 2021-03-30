// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditStatementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需查询对象分布式数字身份不能为空
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

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示数量 最多100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 查询起始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    public static QueryCreditStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditStatementRequest self = new QueryCreditStatementRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditStatementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditStatementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditStatementRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditStatementRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCreditStatementRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditStatementRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditStatementRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditStatementRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditStatementRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditStatementRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
