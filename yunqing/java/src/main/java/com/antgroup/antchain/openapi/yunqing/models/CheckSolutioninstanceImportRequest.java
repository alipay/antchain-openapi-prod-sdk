// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CheckSolutioninstanceImportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
    @NameInMap("box_data")
    @Validation(required = true)
    public String boxData;

    public static CheckSolutioninstanceImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSolutioninstanceImportRequest self = new CheckSolutioninstanceImportRequest();
        return TeaModel.build(map, self);
    }

    public CheckSolutioninstanceImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSolutioninstanceImportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSolutioninstanceImportRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CheckSolutioninstanceImportRequest setBoxData(String boxData) {
        this.boxData = boxData;
        return this;
    }
    public String getBoxData() {
        return this.boxData;
    }

}
