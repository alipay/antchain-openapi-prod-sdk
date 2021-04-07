// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SecurityGroupVO extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // iaasIds
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    // name
    @NameInMap("name")
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // instanceCount
    @NameInMap("instance_count")
    public Long instanceCount;

    public static SecurityGroupVO build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroupVO self = new SecurityGroupVO();
        return TeaModel.build(map, self);
    }

    public SecurityGroupVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SecurityGroupVO setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public SecurityGroupVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SecurityGroupVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroupVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SecurityGroupVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SecurityGroupVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public SecurityGroupVO setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

}
