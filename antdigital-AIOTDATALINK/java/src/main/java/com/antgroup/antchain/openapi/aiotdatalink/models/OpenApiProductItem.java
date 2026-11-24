// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiProductItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
    /**
     * <strong>example:</strong>
     * <p>business_instance_example</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>测试产品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>示例说明</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("service_form")
    @Validation(required = true)
    public String serviceForm;

    // 枚举:LICENSE,INSTANCE
    /**
     * <strong>example:</strong>
     * <p>LICENSE</p>
     */
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public String authorizationMode;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("activation_type")
    @Validation(required = true)
    public String activationType;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("network_mode")
    public String networkMode;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("external_id")
    public String externalId;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("long_memory_enabled")
    @Validation(required = true)
    public Boolean longMemoryEnabled;

    /**
     * <strong>example:</strong>
     * <p>2026-11-17T00:00:00+08:00</p>
     */
    @NameInMap("created_at")
    @Validation(required = true)
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("default_template")
    @Validation(required = true)
    public OpenApiTemplateInfo defaultTemplate;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("plugins")
    @Validation(required = true)
    public java.util.List<OpenApiPluginInfo> plugins;

    public static OpenApiProductItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiProductItem self = new OpenApiProductItem();
        return TeaModel.build(map, self);
    }

    public OpenApiProductItem setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public OpenApiProductItem setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenApiProductItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiProductItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenApiProductItem setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public OpenApiProductItem setServiceForm(String serviceForm) {
        this.serviceForm = serviceForm;
        return this;
    }
    public String getServiceForm() {
        return this.serviceForm;
    }

    public OpenApiProductItem setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public OpenApiProductItem setActivationType(String activationType) {
        this.activationType = activationType;
        return this;
    }
    public String getActivationType() {
        return this.activationType;
    }

    public OpenApiProductItem setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public OpenApiProductItem setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public OpenApiProductItem setLongMemoryEnabled(Boolean longMemoryEnabled) {
        this.longMemoryEnabled = longMemoryEnabled;
        return this;
    }
    public Boolean getLongMemoryEnabled() {
        return this.longMemoryEnabled;
    }

    public OpenApiProductItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public OpenApiProductItem setDefaultTemplate(OpenApiTemplateInfo defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public OpenApiTemplateInfo getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public OpenApiProductItem setPlugins(java.util.List<OpenApiPluginInfo> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.List<OpenApiPluginInfo> getPlugins() {
        return this.plugins;
    }

}
