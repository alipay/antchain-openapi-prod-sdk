// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class SignApplicationResumeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源id
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 用户唯一id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static SignApplicationResumeRequest build(java.util.Map<String, ?> map) throws Exception {
        SignApplicationResumeRequest self = new SignApplicationResumeRequest();
        return TeaModel.build(map, self);
    }

    public SignApplicationResumeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignApplicationResumeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignApplicationResumeRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public SignApplicationResumeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
