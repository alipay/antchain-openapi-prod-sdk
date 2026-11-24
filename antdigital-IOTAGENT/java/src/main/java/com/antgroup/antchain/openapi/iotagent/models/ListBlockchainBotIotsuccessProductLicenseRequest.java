// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductLicenseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    // 枚举:INACTIVE,ACTIVE,EXPIRED
    @NameInMap("activation_state")
    public String activationState;

    public static ListBlockchainBotIotsuccessProductLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductLicenseRequest self = new ListBlockchainBotIotsuccessProductLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotsuccessProductLicenseRequest setActivationState(String activationState) {
        this.activationState = activationState;
        return this;
    }
    public String getActivationState() {
        return this.activationState;
    }

}
