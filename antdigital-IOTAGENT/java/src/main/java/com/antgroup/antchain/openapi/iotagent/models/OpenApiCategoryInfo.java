// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiCategoryInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    /**
     * <strong>example:</strong>
     * <p>测试产品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("service_forms")
    @Validation(required = true)
    public java.util.List<String> serviceForms;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("network_modes")
    @Validation(required = true)
    public java.util.List<String> networkModes;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("activation_types")
    @Validation(required = true)
    public java.util.List<String> activationTypes;

    public static OpenApiCategoryInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiCategoryInfo self = new OpenApiCategoryInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiCategoryInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpenApiCategoryInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiCategoryInfo setServiceForms(java.util.List<String> serviceForms) {
        this.serviceForms = serviceForms;
        return this;
    }
    public java.util.List<String> getServiceForms() {
        return this.serviceForms;
    }

    public OpenApiCategoryInfo setNetworkModes(java.util.List<String> networkModes) {
        this.networkModes = networkModes;
        return this;
    }
    public java.util.List<String> getNetworkModes() {
        return this.networkModes;
    }

    public OpenApiCategoryInfo setActivationTypes(java.util.List<String> activationTypes) {
        this.activationTypes = activationTypes;
        return this;
    }
    public java.util.List<String> getActivationTypes() {
        return this.activationTypes;
    }

}
