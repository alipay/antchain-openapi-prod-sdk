// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotDeviceAttributeRelationshipData extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    // 设备品类名称
    /**
     * <strong>example:</strong>
     * <p>智能防疫机一体机</p>
     */
    @NameInMap("device_category")
    @Validation(required = true)
    public String deviceCategory;

    // 关系类型
    /**
     * <strong>example:</strong>
     * <p>CORP</p>
     */
    @NameInMap("relation_type")
    @Validation(required = true)
    public String relationType;

    // 厂商名称
    /**
     * <strong>example:</strong>
     * <p>天波</p>
     */
    @NameInMap("corp_name")
    public String corpName;

    // 设备型号
    /**
     * <strong>example:</strong>
     * <p>TPS980</p>
     */
    @NameInMap("device_model")
    public String deviceModel;

    // 设备规格
    /**
     * <strong>example:</strong>
     * <p>安卓标准版</p>
     */
    @NameInMap("device_specs")
    public String deviceSpecs;

    // 硬件模块
    /**
     * <strong>example:</strong>
     * <p>测温头</p>
     */
    @NameInMap("hardware_module")
    public String hardwareModule;

    public static IotDeviceAttributeRelationshipData build(java.util.Map<String, ?> map) throws Exception {
        IotDeviceAttributeRelationshipData self = new IotDeviceAttributeRelationshipData();
        return TeaModel.build(map, self);
    }

    public IotDeviceAttributeRelationshipData setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public IotDeviceAttributeRelationshipData setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
        return this;
    }
    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    public IotDeviceAttributeRelationshipData setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public IotDeviceAttributeRelationshipData setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public IotDeviceAttributeRelationshipData setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public IotDeviceAttributeRelationshipData setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public IotDeviceAttributeRelationshipData setHardwareModule(String hardwareModule) {
        this.hardwareModule = hardwareModule;
        return this;
    }
    public String getHardwareModule() {
        return this.hardwareModule;
    }

}
