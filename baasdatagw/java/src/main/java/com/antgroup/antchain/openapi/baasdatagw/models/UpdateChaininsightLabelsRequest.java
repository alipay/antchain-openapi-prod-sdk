// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class UpdateChaininsightLabelsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链上地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 更新的 label 内容
    @NameInMap("label")
    @Validation(required = true)
    public ChainInsightAddressLabel label;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static UpdateChaininsightLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChaininsightLabelsRequest self = new UpdateChaininsightLabelsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChaininsightLabelsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChaininsightLabelsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChaininsightLabelsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateChaininsightLabelsRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public UpdateChaininsightLabelsRequest setLabel(ChainInsightAddressLabel label) {
        this.label = label;
        return this;
    }
    public ChainInsightAddressLabel getLabel() {
        return this.label;
    }

    public UpdateChaininsightLabelsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
