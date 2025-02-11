// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class AssetElementInfo extends TeaModel {
    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 要素ID
    @NameInMap("element_id")
    @Validation(required = true)
    public String elementId;

    // 要素名称
    @NameInMap("element_name")
    public String elementName;

    // 要素类型
    @NameInMap("element_type")
    @Validation(required = true)
    public String elementType;

    // 数据来源渠道， 物理要素非必填；数据要素必填；
    @NameInMap("from_type")
    public String fromType;

    // 平台领域类型， 物理要素非必填；数据要素必填；
    @NameInMap("data_element_type")
    public String dataElementType;

    // 属性列表， 物理要素非必填；数据要素必填；
    @NameInMap("property_list")
    public String propertyList;

    // 格式处理过的属性列表（支持泛型反序列化）
    @NameInMap("transform_property_list")
    public String transformPropertyList;

    // 数据上报频率
    @NameInMap("frequency")
    public String frequency;

    // 物理要素类型码，包含iot和资管的
    @NameInMap("physics_element_type_code")
    @Validation(required = true)
    public String physicsElementTypeCode;

    // 业务类型
    @NameInMap("biz_type")
    public String bizType;

    // 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
    @NameInMap("persistent_location")
    public String persistentLocation;

    // 要素实例信息，用于捞取最小闭环数据
    @NameInMap("element_instance_config")
    public String elementInstanceConfig;

    // 要素实例
    @NameInMap("element_instance_info")
    public String elementInstanceInfo;

    // 属性列表来源平台 1.IOT 2.DM 
    @NameInMap("property_source_type")
    public Long propertySourceType;

    // 拉取数据字段code请求值
    @NameInMap("property_source_id")
    public String propertySourceId;

    // 要素主键字段信息
    @NameInMap("primary_key_info")
    public String primaryKeyInfo;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static AssetElementInfo build(java.util.Map<String, ?> map) throws Exception {
        AssetElementInfo self = new AssetElementInfo();
        return TeaModel.build(map, self);
    }

    public AssetElementInfo setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssetElementInfo setElementId(String elementId) {
        this.elementId = elementId;
        return this;
    }
    public String getElementId() {
        return this.elementId;
    }

    public AssetElementInfo setElementName(String elementName) {
        this.elementName = elementName;
        return this;
    }
    public String getElementName() {
        return this.elementName;
    }

    public AssetElementInfo setElementType(String elementType) {
        this.elementType = elementType;
        return this;
    }
    public String getElementType() {
        return this.elementType;
    }

    public AssetElementInfo setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }
    public String getFromType() {
        return this.fromType;
    }

    public AssetElementInfo setDataElementType(String dataElementType) {
        this.dataElementType = dataElementType;
        return this;
    }
    public String getDataElementType() {
        return this.dataElementType;
    }

    public AssetElementInfo setPropertyList(String propertyList) {
        this.propertyList = propertyList;
        return this;
    }
    public String getPropertyList() {
        return this.propertyList;
    }

    public AssetElementInfo setTransformPropertyList(String transformPropertyList) {
        this.transformPropertyList = transformPropertyList;
        return this;
    }
    public String getTransformPropertyList() {
        return this.transformPropertyList;
    }

    public AssetElementInfo setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public AssetElementInfo setPhysicsElementTypeCode(String physicsElementTypeCode) {
        this.physicsElementTypeCode = physicsElementTypeCode;
        return this;
    }
    public String getPhysicsElementTypeCode() {
        return this.physicsElementTypeCode;
    }

    public AssetElementInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AssetElementInfo setPersistentLocation(String persistentLocation) {
        this.persistentLocation = persistentLocation;
        return this;
    }
    public String getPersistentLocation() {
        return this.persistentLocation;
    }

    public AssetElementInfo setElementInstanceConfig(String elementInstanceConfig) {
        this.elementInstanceConfig = elementInstanceConfig;
        return this;
    }
    public String getElementInstanceConfig() {
        return this.elementInstanceConfig;
    }

    public AssetElementInfo setElementInstanceInfo(String elementInstanceInfo) {
        this.elementInstanceInfo = elementInstanceInfo;
        return this;
    }
    public String getElementInstanceInfo() {
        return this.elementInstanceInfo;
    }

    public AssetElementInfo setPropertySourceType(Long propertySourceType) {
        this.propertySourceType = propertySourceType;
        return this;
    }
    public Long getPropertySourceType() {
        return this.propertySourceType;
    }

    public AssetElementInfo setPropertySourceId(String propertySourceId) {
        this.propertySourceId = propertySourceId;
        return this;
    }
    public String getPropertySourceId() {
        return this.propertySourceId;
    }

    public AssetElementInfo setPrimaryKeyInfo(String primaryKeyInfo) {
        this.primaryKeyInfo = primaryKeyInfo;
        return this;
    }
    public String getPrimaryKeyInfo() {
        return this.primaryKeyInfo;
    }

    public AssetElementInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
