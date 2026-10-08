// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class AmountcumulativeAntdigitalWebttsDacTransactionRequest extends TeaModel {
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

    // 网络标识（不传默认为 DEFAULT）
    @NameInMap("network")
    public String network;

    // 时间类型:daily/weekly/monthly
    @NameInMap("period_type")
    @Validation(required = true)
    public String periodType;

    // 查询额度类型：withdraw/deposit
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // 页号
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static AmountcumulativeAntdigitalWebttsDacTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        AmountcumulativeAntdigitalWebttsDacTransactionRequest self = new AmountcumulativeAntdigitalWebttsDacTransactionRequest();
        return TeaModel.build(map, self);
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public AmountcumulativeAntdigitalWebttsDacTransactionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
