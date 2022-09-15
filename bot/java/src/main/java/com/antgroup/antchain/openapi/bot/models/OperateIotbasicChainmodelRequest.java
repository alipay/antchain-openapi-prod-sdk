// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicChainmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    // 所属业务
    @NameInMap("business")
    @Validation(required = true)
    public String business;

    // 资产数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 资产ID-key
    @NameInMap("assets_id_key")
    @Validation(required = true)
    public String assetsIdKey;

    // 资产ID-类型
    @NameInMap("assets_id_type")
    @Validation(required = true)
    public String assetsIdType;

    // 签名验证方式
    @NameInMap("signature_check_type")
    @Validation(required = true)
    public String signatureCheckType;

    public static OperateIotbasicChainmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicChainmodelRequest self = new OperateIotbasicChainmodelRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicChainmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicChainmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicChainmodelRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicChainmodelRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicChainmodelRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

    public OperateIotbasicChainmodelRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public OperateIotbasicChainmodelRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public OperateIotbasicChainmodelRequest setAssetsIdKey(String assetsIdKey) {
        this.assetsIdKey = assetsIdKey;
        return this;
    }
    public String getAssetsIdKey() {
        return this.assetsIdKey;
    }

    public OperateIotbasicChainmodelRequest setAssetsIdType(String assetsIdType) {
        this.assetsIdType = assetsIdType;
        return this;
    }
    public String getAssetsIdType() {
        return this.assetsIdType;
    }

    public OperateIotbasicChainmodelRequest setSignatureCheckType(String signatureCheckType) {
        this.signatureCheckType = signatureCheckType;
        return this;
    }
    public String getSignatureCheckType() {
        return this.signatureCheckType;
    }

}
