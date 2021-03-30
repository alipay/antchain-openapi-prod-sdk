// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CancelCreditIssuebatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 货主分布式数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id 
    // A模式：PRODUCT_MYBANK，
    // A+模式：PRODUCT_MYBANK_A_PLUS，
    // B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static CancelCreditIssuebatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCreditIssuebatchRequest self = new CancelCreditIssuebatchRequest();
        return TeaModel.build(map, self);
    }

    public CancelCreditIssuebatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelCreditIssuebatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelCreditIssuebatchRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CancelCreditIssuebatchRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public CancelCreditIssuebatchRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CancelCreditIssuebatchRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CancelCreditIssuebatchRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
