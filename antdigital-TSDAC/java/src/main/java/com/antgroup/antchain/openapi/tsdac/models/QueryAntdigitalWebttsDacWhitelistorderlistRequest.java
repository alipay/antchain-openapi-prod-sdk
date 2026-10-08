// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacWhitelistorderlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 链名称
    @NameInMap("blockchain")
    public String blockchain;

    // 白名单地址
    @NameInMap("whitelist_address")
    public String whitelistAddress;

    // 提交开始时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("submit_start_time")
    public String submitStartTime;

    // 提交结束时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("submit_end_time")
    public String submitEndTime;

    // 状态
    @NameInMap("status")
    public String status;

    // 当前第几个分页，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 每页展示条数，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAntdigitalWebttsDacWhitelistorderlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacWhitelistorderlistRequest self = new QueryAntdigitalWebttsDacWhitelistorderlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setSubmitStartTime(String submitStartTime) {
        this.submitStartTime = submitStartTime;
        return this;
    }
    public String getSubmitStartTime() {
        return this.submitStartTime;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setSubmitEndTime(String submitEndTime) {
        this.submitEndTime = submitEndTime;
        return this;
    }
    public String getSubmitEndTime() {
        return this.submitEndTime;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
