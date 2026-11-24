// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ImportBlockchainBotIotsuccessProductDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前租户业务产品标识
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 设备MAC列表；沿已有校验、去重与数量限制
    @NameInMap("uid_list")
    @Validation(required = true)
    public java.util.List<String> uidList;

    // 可选产品模板标识，适配为已有templateAgentId
    @NameInMap("template_id")
    public String templateId;

    public static ImportBlockchainBotIotsuccessProductDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportBlockchainBotIotsuccessProductDeviceRequest self = new ImportBlockchainBotIotsuccessProductDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportBlockchainBotIotsuccessProductDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportBlockchainBotIotsuccessProductDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportBlockchainBotIotsuccessProductDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ImportBlockchainBotIotsuccessProductDeviceRequest setUidList(java.util.List<String> uidList) {
        this.uidList = uidList;
        return this;
    }
    public java.util.List<String> getUidList() {
        return this.uidList;
    }

    public ImportBlockchainBotIotsuccessProductDeviceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
