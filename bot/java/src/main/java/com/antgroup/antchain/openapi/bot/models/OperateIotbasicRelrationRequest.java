// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicRelrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备属性关系id
    @NameInMap("id")
    public Long id;

    // 设备品类名称
    @NameInMap("device_category")
    @Validation(required = true)
    public String deviceCategory;

    // 数据关系类型
    @NameInMap("relation_type")
    @Validation(required = true)
    public String relationType;

    // 厂商名称
    @NameInMap("corp_name")
    public String corpName;

    // TPS980	设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 设备规格
    @NameInMap("device_specs")
    public String deviceSpecs;

    // 硬件模块
    @NameInMap("hardware_module")
    public String hardwareModule;

    // ADD,EDIT,DELETE，QUERY；选择操作
    @NameInMap("operate")
    @Validation(required = true)
    public String operate;

    // 参数签名校验
    @NameInMap("param_sign")
    public String paramSign;

    public static OperateIotbasicRelrationRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicRelrationRequest self = new OperateIotbasicRelrationRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicRelrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicRelrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicRelrationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OperateIotbasicRelrationRequest setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
        return this;
    }
    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    public OperateIotbasicRelrationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public OperateIotbasicRelrationRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public OperateIotbasicRelrationRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public OperateIotbasicRelrationRequest setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public OperateIotbasicRelrationRequest setHardwareModule(String hardwareModule) {
        this.hardwareModule = hardwareModule;
        return this;
    }
    public String getHardwareModule() {
        return this.hardwareModule;
    }

    public OperateIotbasicRelrationRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public OperateIotbasicRelrationRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
