// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CheckCreditWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 运单列表
    @NameInMap("waybill_list")
    @Validation(required = true)
    public java.util.List<String> waybillList;

    public static CheckCreditWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreditWaybillRequest self = new CheckCreditWaybillRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreditWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCreditWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckCreditWaybillRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CheckCreditWaybillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CheckCreditWaybillRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CheckCreditWaybillRequest setWaybillList(java.util.List<String> waybillList) {
        this.waybillList = waybillList;
        return this;
    }
    public java.util.List<String> getWaybillList() {
        return this.waybillList;
    }

}
