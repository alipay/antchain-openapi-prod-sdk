// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicControlconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备品类编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 管控模式
    @NameInMap("control_model")
    @Validation(required = true)
    public String controlModel;

    // 是否上链--注册设备后需上链存证，记录存证hash
    @NameInMap("if_put_chain")
    @Validation(required = true)
    public String ifPutChain;

    // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
    @NameInMap("if_standard_device")
    @Validation(required = true)
    public String ifStandardDevice;

    // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
    @NameInMap("if_generate_screct")
    @Validation(required = true)
    public String ifGenerateScrect;

    // 接口地址
    @NameInMap("interface_address")
    public String interfaceAddress;

    // 接口参数
    @NameInMap("interface_params")
    public String interfaceParams;

    // 操作类型
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 操作人id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 参数签名校验
    @NameInMap("param_sign")
    @Validation(required = true)
    public String paramSign;

    public static OperateIotbasicControlconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicControlconfigRequest self = new OperateIotbasicControlconfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicControlconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicControlconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicControlconfigRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public OperateIotbasicControlconfigRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public OperateIotbasicControlconfigRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public OperateIotbasicControlconfigRequest setControlModel(String controlModel) {
        this.controlModel = controlModel;
        return this;
    }
    public String getControlModel() {
        return this.controlModel;
    }

    public OperateIotbasicControlconfigRequest setIfPutChain(String ifPutChain) {
        this.ifPutChain = ifPutChain;
        return this;
    }
    public String getIfPutChain() {
        return this.ifPutChain;
    }

    public OperateIotbasicControlconfigRequest setIfStandardDevice(String ifStandardDevice) {
        this.ifStandardDevice = ifStandardDevice;
        return this;
    }
    public String getIfStandardDevice() {
        return this.ifStandardDevice;
    }

    public OperateIotbasicControlconfigRequest setIfGenerateScrect(String ifGenerateScrect) {
        this.ifGenerateScrect = ifGenerateScrect;
        return this;
    }
    public String getIfGenerateScrect() {
        return this.ifGenerateScrect;
    }

    public OperateIotbasicControlconfigRequest setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress;
        return this;
    }
    public String getInterfaceAddress() {
        return this.interfaceAddress;
    }

    public OperateIotbasicControlconfigRequest setInterfaceParams(String interfaceParams) {
        this.interfaceParams = interfaceParams;
        return this;
    }
    public String getInterfaceParams() {
        return this.interfaceParams;
    }

    public OperateIotbasicControlconfigRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicControlconfigRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicControlconfigRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
