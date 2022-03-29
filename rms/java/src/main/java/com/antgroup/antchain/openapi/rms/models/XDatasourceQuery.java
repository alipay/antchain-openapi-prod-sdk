// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XDatasourceQuery extends TeaModel {
    //  
    @NameInMap("uuid")
    public String uuid;

    //  
    @NameInMap("parent_uuid")
    public String parentUuid;

    //  
    @NameInMap("name")
    public String name;

    //  
    @NameInMap("enabled")
    public Boolean enabled;

    //  
    @NameInMap("target_resource_kind")
    public String targetResourceKind;

    //  
    @NameInMap("target_resource_name")
    public String targetResourceName;

    //  
    @NameInMap("rule_type")
    public String ruleType;

    //  
    @NameInMap("created_by")
    public String createdBy;

    public static XDatasourceQuery build(java.util.Map<String, ?> map) throws Exception {
        XDatasourceQuery self = new XDatasourceQuery();
        return TeaModel.build(map, self);
    }

    public XDatasourceQuery setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public XDatasourceQuery setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public XDatasourceQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XDatasourceQuery setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public XDatasourceQuery setTargetResourceKind(String targetResourceKind) {
        this.targetResourceKind = targetResourceKind;
        return this;
    }
    public String getTargetResourceKind() {
        return this.targetResourceKind;
    }

    public XDatasourceQuery setTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }
    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public XDatasourceQuery setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public XDatasourceQuery setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

}
