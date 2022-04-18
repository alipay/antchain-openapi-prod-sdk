// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SetProductOperateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求入参
    @NameInMap("input_json")
    @Validation(required = true)
    public String inputJson;

    // 操作类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    public static SetProductOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetProductOperateRequest self = new SetProductOperateRequest();
        return TeaModel.build(map, self);
    }

    public SetProductOperateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetProductOperateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetProductOperateRequest setInputJson(String inputJson) {
        this.inputJson = inputJson;
        return this;
    }
    public String getInputJson() {
        return this.inputJson;
    }

    public SetProductOperateRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
