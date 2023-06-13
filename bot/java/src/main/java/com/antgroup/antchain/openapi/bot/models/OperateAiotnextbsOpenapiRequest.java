// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateAiotnextbsOpenapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 参数签名
    @NameInMap("param_sign")
    @Validation(required = true)
    public String paramSign;

    // 业务操作类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 操作人id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 类名（实现类），首字母小写
    @NameInMap("interface_name")
    @Validation(required = true)
    public String interfaceName;

    // 方法名
    @NameInMap("method_name")
    @Validation(required = true)
    public String methodName;

    // 参数类路径
    @NameInMap("param_class")
    @Validation(required = true)
    public String paramClass;

    // 参数数据
    @NameInMap("param_list")
    @Validation(required = true)
    public String paramList;

    public static OperateAiotnextbsOpenapiRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAiotnextbsOpenapiRequest self = new OperateAiotnextbsOpenapiRequest();
        return TeaModel.build(map, self);
    }

    public OperateAiotnextbsOpenapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateAiotnextbsOpenapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateAiotnextbsOpenapiRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateAiotnextbsOpenapiRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

    public OperateAiotnextbsOpenapiRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateAiotnextbsOpenapiRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateAiotnextbsOpenapiRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public OperateAiotnextbsOpenapiRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public OperateAiotnextbsOpenapiRequest setParamClass(String paramClass) {
        this.paramClass = paramClass;
        return this;
    }
    public String getParamClass() {
        return this.paramClass;
    }

    public OperateAiotnextbsOpenapiRequest setParamList(String paramList) {
        this.paramList = paramList;
        return this;
    }
    public String getParamList() {
        return this.paramList;
    }

}
