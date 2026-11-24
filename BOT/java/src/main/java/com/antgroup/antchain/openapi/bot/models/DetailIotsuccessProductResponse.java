// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DetailIotsuccessProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    @NameInMap("service_form")
    @Validation(required = true)
    public String serviceForm;

    // 枚举:LICENSE,INSTANCE
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public String authorizationMode;

    @NameInMap("activation_type")
    @Validation(required = true)
    public String activationType;

    @NameInMap("network_mode")
    public String networkMode;

    @NameInMap("external_id")
    public String externalId;

    @NameInMap("long_memory_enabled")
    @Validation(required = true)
    public Boolean longMemoryEnabled;

    @NameInMap("created_at")
    @Validation(required = true)
    public String createdAt;

    @NameInMap("default_template")
    @Validation(required = true)
    public OpenApiTemplateInfo defaultTemplate;

    @NameInMap("plugins")
    @Validation(required = true)
    public java.util.List<OpenApiPluginInfo> plugins;

    public static DetailIotsuccessProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailIotsuccessProductResponse self = new DetailIotsuccessProductResponse();
        return TeaModel.build(map, self);
    }

    public DetailIotsuccessProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailIotsuccessProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailIotsuccessProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailIotsuccessProductResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DetailIotsuccessProductResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetailIotsuccessProductResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailIotsuccessProductResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailIotsuccessProductResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DetailIotsuccessProductResponse setServiceForm(String serviceForm) {
        this.serviceForm = serviceForm;
        return this;
    }
    public String getServiceForm() {
        return this.serviceForm;
    }

    public DetailIotsuccessProductResponse setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public DetailIotsuccessProductResponse setActivationType(String activationType) {
        this.activationType = activationType;
        return this;
    }
    public String getActivationType() {
        return this.activationType;
    }

    public DetailIotsuccessProductResponse setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public DetailIotsuccessProductResponse setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public DetailIotsuccessProductResponse setLongMemoryEnabled(Boolean longMemoryEnabled) {
        this.longMemoryEnabled = longMemoryEnabled;
        return this;
    }
    public Boolean getLongMemoryEnabled() {
        return this.longMemoryEnabled;
    }

    public DetailIotsuccessProductResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DetailIotsuccessProductResponse setDefaultTemplate(OpenApiTemplateInfo defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public OpenApiTemplateInfo getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public DetailIotsuccessProductResponse setPlugins(java.util.List<OpenApiPluginInfo> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.List<OpenApiPluginInfo> getPlugins() {
        return this.plugins;
    }

}
