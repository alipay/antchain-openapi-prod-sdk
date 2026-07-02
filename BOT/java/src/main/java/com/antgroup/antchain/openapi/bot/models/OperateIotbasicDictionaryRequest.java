// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicDictionaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    public Long id;

    // 设备品类编码
    @NameInMap("device_category")
    public String deviceCategory;

    // 字典数据类型
    @NameInMap("dictionary_type")
    public String dictionaryType;

    // 字典数据名称
    @NameInMap("dictionary_name")
    public String dictionaryName;

    // 字典数据值
    @NameInMap("dictionary_value")
    public String dictionaryValue;

    // 硬件模块参数
    @NameInMap("dictionary_param")
    public String dictionaryParam;

    // 选择操作
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 参数签名校验
    @NameInMap("param_sign")
    public String paramSign;

    public static OperateIotbasicDictionaryRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicDictionaryRequest self = new OperateIotbasicDictionaryRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicDictionaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicDictionaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicDictionaryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OperateIotbasicDictionaryRequest setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
        return this;
    }
    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    public OperateIotbasicDictionaryRequest setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType;
        return this;
    }
    public String getDictionaryType() {
        return this.dictionaryType;
    }

    public OperateIotbasicDictionaryRequest setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
        return this;
    }
    public String getDictionaryName() {
        return this.dictionaryName;
    }

    public OperateIotbasicDictionaryRequest setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue;
        return this;
    }
    public String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public OperateIotbasicDictionaryRequest setDictionaryParam(String dictionaryParam) {
        this.dictionaryParam = dictionaryParam;
        return this;
    }
    public String getDictionaryParam() {
        return this.dictionaryParam;
    }

    public OperateIotbasicDictionaryRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicDictionaryRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
