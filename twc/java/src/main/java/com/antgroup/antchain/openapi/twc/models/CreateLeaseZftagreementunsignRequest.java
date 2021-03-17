// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseZftagreementunsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 租赁方金融科技租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 直付通网商模式代扣协议号
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    // 直付通代扣协议解约时间
    @NameInMap("unsign_time")
    @Validation(required = true)
    public String unsignTime;

    public static CreateLeaseZftagreementunsignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseZftagreementunsignRequest self = new CreateLeaseZftagreementunsignRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseZftagreementunsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseZftagreementunsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseZftagreementunsignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseZftagreementunsignRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseZftagreementunsignRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseZftagreementunsignRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public CreateLeaseZftagreementunsignRequest setUnsignTime(String unsignTime) {
        this.unsignTime = unsignTime;
        return this;
    }
    public String getUnsignTime() {
        return this.unsignTime;
    }

}
