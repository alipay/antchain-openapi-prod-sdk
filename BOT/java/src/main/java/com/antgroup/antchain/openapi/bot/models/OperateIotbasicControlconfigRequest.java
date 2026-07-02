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
    @NameInMap("is_register_notify")
    @Validation(required = true)
    public String isRegisterNotify;

    // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
    @NameInMap("is_standard")
    @Validation(required = true)
    public String isStandard;

    // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
    @NameInMap("is_gen_secret")
    @Validation(required = true)
    public String isGenSecret;

    // 接口地址
    @NameInMap("service_provider")
    public String serviceProvider;

    // 接口参数
    @NameInMap("control_param")
    public String controlParam;

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

    // 是否接入安全认证
    @NameInMap("is_support_sec")
    @Validation(required = true)
    public String isSupportSec;

    // 设备规格ID
    @NameInMap("device_specs")
    public Long deviceSpecs;

    // 厂商ID
    @NameInMap("corp_id")
    @Validation(required = true)
    public Long corpId;

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

    public OperateIotbasicControlconfigRequest setIsRegisterNotify(String isRegisterNotify) {
        this.isRegisterNotify = isRegisterNotify;
        return this;
    }
    public String getIsRegisterNotify() {
        return this.isRegisterNotify;
    }

    public OperateIotbasicControlconfigRequest setIsStandard(String isStandard) {
        this.isStandard = isStandard;
        return this;
    }
    public String getIsStandard() {
        return this.isStandard;
    }

    public OperateIotbasicControlconfigRequest setIsGenSecret(String isGenSecret) {
        this.isGenSecret = isGenSecret;
        return this;
    }
    public String getIsGenSecret() {
        return this.isGenSecret;
    }

    public OperateIotbasicControlconfigRequest setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public OperateIotbasicControlconfigRequest setControlParam(String controlParam) {
        this.controlParam = controlParam;
        return this;
    }
    public String getControlParam() {
        return this.controlParam;
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

    public OperateIotbasicControlconfigRequest setIsSupportSec(String isSupportSec) {
        this.isSupportSec = isSupportSec;
        return this;
    }
    public String getIsSupportSec() {
        return this.isSupportSec;
    }

    public OperateIotbasicControlconfigRequest setDeviceSpecs(Long deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public Long getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public OperateIotbasicControlconfigRequest setCorpId(Long corpId) {
        this.corpId = corpId;
        return this;
    }
    public Long getCorpId() {
        return this.corpId;
    }

}
