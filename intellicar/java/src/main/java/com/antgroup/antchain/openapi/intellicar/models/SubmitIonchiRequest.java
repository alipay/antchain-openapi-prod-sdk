// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SubmitIonchiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 线索唯一标识
    @NameInMap("submit_id")
    @Validation(required = true)
    public String submitId;

    // 手机号md5
    @NameInMap("mobile_md5")
    @Validation(required = true)
    public String mobileMd5;

    public static SubmitIonchiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIonchiRequest self = new SubmitIonchiRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIonchiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitIonchiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitIonchiRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public SubmitIonchiRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

}
