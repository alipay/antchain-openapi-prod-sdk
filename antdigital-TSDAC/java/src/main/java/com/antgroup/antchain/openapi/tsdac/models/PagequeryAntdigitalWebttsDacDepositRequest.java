// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class PagequeryAntdigitalWebttsDacDepositRequest extends TeaModel {
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

    // 操作类型：DEPOSIT
    @NameInMap("operation_type")
    public String operationType;

    // 状态过滤
    @NameInMap("status")
    public String status;

    // 币种过滤
    @NameInMap("token_symbol")
    public String tokenSymbol;

    // 提交时间范围起，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("submit_time_from")
    public String submitTimeFrom;

    // 提交时间范围止，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("submit_time_to")
    public String submitTimeTo;

    // 页码，默认1
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数，默认20，最大100
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryAntdigitalWebttsDacDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAntdigitalWebttsDacDepositRequest self = new PagequeryAntdigitalWebttsDacDepositRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setSubmitTimeFrom(String submitTimeFrom) {
        this.submitTimeFrom = submitTimeFrom;
        return this;
    }
    public String getSubmitTimeFrom() {
        return this.submitTimeFrom;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setSubmitTimeTo(String submitTimeTo) {
        this.submitTimeTo = submitTimeTo;
        return this;
    }
    public String getSubmitTimeTo() {
        return this.submitTimeTo;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryAntdigitalWebttsDacDepositRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
