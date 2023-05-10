// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d9fd09cd1986473d9a4b8dde727aa361.models;

import com.aliyun.tea.*;

public class MatchInternationalDemoZolozFacecompareRequest extends TeaModel {
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

    public static MatchInternationalDemoZolozFacecompareRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchInternationalDemoZolozFacecompareRequest self = new MatchInternationalDemoZolozFacecompareRequest();
        return TeaModel.build(map, self);
    }

    public MatchInternationalDemoZolozFacecompareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchInternationalDemoZolozFacecompareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchInternationalDemoZolozFacecompareRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MatchInternationalDemoZolozFacecompareRequest setFace1(FaceImage face1) {
        this.face1 = face1;
        return this;
    }
    public FaceImage getFace1() {
        return this.face1;
    }

    public MatchInternationalDemoZolozFacecompareRequest setFace2(FaceImage face2) {
        this.face2 = face2;
        return this;
    }
    public FaceImage getFace2() {
        return this.face2;
    }

}
