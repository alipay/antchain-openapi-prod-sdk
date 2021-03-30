// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateWaybillorderPlatformdidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 新平台diid
    @NameInMap("new_platform_did")
    @Validation(required = true)
    public String newPlatformDid;

    // 老平台did
    @NameInMap("old_platform_did")
    @Validation(required = true)
    public String oldPlatformDid;

    // 运单号
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static UpdateWaybillorderPlatformdidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaybillorderPlatformdidRequest self = new UpdateWaybillorderPlatformdidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaybillorderPlatformdidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWaybillorderPlatformdidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateWaybillorderPlatformdidRequest setNewPlatformDid(String newPlatformDid) {
        this.newPlatformDid = newPlatformDid;
        return this;
    }
    public String getNewPlatformDid() {
        return this.newPlatformDid;
    }

    public UpdateWaybillorderPlatformdidRequest setOldPlatformDid(String oldPlatformDid) {
        this.oldPlatformDid = oldPlatformDid;
        return this;
    }
    public String getOldPlatformDid() {
        return this.oldPlatformDid;
    }

    public UpdateWaybillorderPlatformdidRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
