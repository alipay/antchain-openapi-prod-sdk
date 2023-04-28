// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ee637c8293f64104af9686dc12e0cd18.models;

import com.aliyun.tea.*;

public class QueryDemoZolozFacecompareRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 123
    @NameInMap("face1")
    public FaceImage face1;

    // 123
    @NameInMap("face2")
    public FaceImage face2;

    public static QueryDemoZolozFacecompareRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoZolozFacecompareRequest self = new QueryDemoZolozFacecompareRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoZolozFacecompareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoZolozFacecompareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoZolozFacecompareRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDemoZolozFacecompareRequest setFace1(FaceImage face1) {
        this.face1 = face1;
        return this;
    }
    public FaceImage getFace1() {
        return this.face1;
    }

    public QueryDemoZolozFacecompareRequest setFace2(FaceImage face2) {
        this.face2 = face2;
        return this;
    }
    public FaceImage getFace2() {
        return this.face2;
    }

}
