// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryZolozFacecompareRequest extends TeaModel {
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

    public static QueryZolozFacecompareRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryZolozFacecompareRequest self = new QueryZolozFacecompareRequest();
        return TeaModel.build(map, self);
    }

    public QueryZolozFacecompareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryZolozFacecompareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryZolozFacecompareRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryZolozFacecompareRequest setFace1(FaceImage face1) {
        this.face1 = face1;
        return this;
    }
    public FaceImage getFace1() {
        return this.face1;
    }

    public QueryZolozFacecompareRequest setFace2(FaceImage face2) {
        this.face2 = face2;
        return this;
    }
    public FaceImage getFace2() {
        return this.face2;
    }

}
