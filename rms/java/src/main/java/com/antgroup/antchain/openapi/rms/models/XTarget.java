// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTarget extends TeaModel {
    // target type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // resource kind
    @NameInMap("metadata_kind")
    public String metadataKind;

    // resource name
    @NameInMap("metadata_name")
    public String metadataName;

    // where 条件
    @NameInMap("conditions")
    public java.util.List<XCondition> conditions;

    //  
    @NameInMap("front_type")
    public String frontType;

    //  
    @NameInMap("from_datasource_uuid")
    public String fromDatasourceUuid;

    //  
    @NameInMap("from_datasource_name")
    public String fromDatasourceName;

    //  
    @NameInMap("from_datasource_md5")
    public String fromDatasourceMd5;

    //  
    @NameInMap("from_datasource_metric_name")
    public String fromDatasourceMetricName;

    public static XTarget build(java.util.Map<String, ?> map) throws Exception {
        XTarget self = new XTarget();
        return TeaModel.build(map, self);
    }

    public XTarget setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XTarget setMetadataKind(String metadataKind) {
        this.metadataKind = metadataKind;
        return this;
    }
    public String getMetadataKind() {
        return this.metadataKind;
    }

    public XTarget setMetadataName(String metadataName) {
        this.metadataName = metadataName;
        return this;
    }
    public String getMetadataName() {
        return this.metadataName;
    }

    public XTarget setConditions(java.util.List<XCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<XCondition> getConditions() {
        return this.conditions;
    }

    public XTarget setFrontType(String frontType) {
        this.frontType = frontType;
        return this;
    }
    public String getFrontType() {
        return this.frontType;
    }

    public XTarget setFromDatasourceUuid(String fromDatasourceUuid) {
        this.fromDatasourceUuid = fromDatasourceUuid;
        return this;
    }
    public String getFromDatasourceUuid() {
        return this.fromDatasourceUuid;
    }

    public XTarget setFromDatasourceName(String fromDatasourceName) {
        this.fromDatasourceName = fromDatasourceName;
        return this;
    }
    public String getFromDatasourceName() {
        return this.fromDatasourceName;
    }

    public XTarget setFromDatasourceMd5(String fromDatasourceMd5) {
        this.fromDatasourceMd5 = fromDatasourceMd5;
        return this;
    }
    public String getFromDatasourceMd5() {
        return this.fromDatasourceMd5;
    }

    public XTarget setFromDatasourceMetricName(String fromDatasourceMetricName) {
        this.fromDatasourceMetricName = fromDatasourceMetricName;
        return this;
    }
    public String getFromDatasourceMetricName() {
        return this.fromDatasourceMetricName;
    }

}
