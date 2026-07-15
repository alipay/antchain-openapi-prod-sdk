// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseRentalverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 约定的合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 核验类型
    @NameInMap("proof_type")
    @Validation(required = true)
    public String proofType;

    // 还款流水号
    @NameInMap("return_voucher_serial")
    @Validation(required = true)
    public String returnVoucherSerial;

    // 归还期数
    @NameInMap("return_term")
    @Validation(required = true)
    public Long returnTerm;

    // 租赁商户的id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    public static QueryLeaseRentalverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseRentalverifyRequest self = new QueryLeaseRentalverifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseRentalverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseRentalverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseRentalverifyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseRentalverifyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseRentalverifyRequest setProofType(String proofType) {
        this.proofType = proofType;
        return this;
    }
    public String getProofType() {
        return this.proofType;
    }

    public QueryLeaseRentalverifyRequest setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public QueryLeaseRentalverifyRequest setReturnTerm(Long returnTerm) {
        this.returnTerm = returnTerm;
        return this;
    }
    public Long getReturnTerm() {
        return this.returnTerm;
    }

    public QueryLeaseRentalverifyRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

}
