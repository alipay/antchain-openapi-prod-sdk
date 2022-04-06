// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class IaasConnMetadata extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // iaas_provider_id
    @NameInMap("iaas_provider_id")
    @Validation(required = true)
    public String iaasProviderId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // iaas_conn_type
    @NameInMap("iaas_conn_type")
    @Validation(required = true)
    public String iaasConnType;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // available_features
    @NameInMap("available_features")
    public java.util.List<String> availableFeatures;

    // endpoint
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // region_ids
    @NameInMap("region_ids")
    @Validation(required = true)
    public java.util.List<String> regionIds;

    // is_default
    @NameInMap("is_default")
    @Validation(required = true)
    public Boolean isDefault;

    // utc_create
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    public static IaasConnMetadata build(java.util.Map<String, ?> map) throws Exception {
        IaasConnMetadata self = new IaasConnMetadata();
        return TeaModel.build(map, self);
    }

    public IaasConnMetadata setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IaasConnMetadata setIaasProviderId(String iaasProviderId) {
        this.iaasProviderId = iaasProviderId;
        return this;
    }
    public String getIaasProviderId() {
        return this.iaasProviderId;
    }

    public IaasConnMetadata setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IaasConnMetadata setIaasConnType(String iaasConnType) {
        this.iaasConnType = iaasConnType;
        return this;
    }
    public String getIaasConnType() {
        return this.iaasConnType;
    }

    public IaasConnMetadata setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IaasConnMetadata setAvailableFeatures(java.util.List<String> availableFeatures) {
        this.availableFeatures = availableFeatures;
        return this;
    }
    public java.util.List<String> getAvailableFeatures() {
        return this.availableFeatures;
    }

    public IaasConnMetadata setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public IaasConnMetadata setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public IaasConnMetadata setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public IaasConnMetadata setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

}
