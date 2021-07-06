// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitIndividualidImageauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // Base64编码的人脸正面照片
    @NameInMap("encoded_facial_picture_front")
    @Validation(required = true)
    public String encodedFacialPictureFront;

    public static InitIndividualidImageauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIndividualidImageauthRequest self = new InitIndividualidImageauthRequest();
        return TeaModel.build(map, self);
    }

    public InitIndividualidImageauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIndividualidImageauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIndividualidImageauthRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitIndividualidImageauthRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitIndividualidImageauthRequest setEncodedFacialPictureFront(String encodedFacialPictureFront) {
        this.encodedFacialPictureFront = encodedFacialPictureFront;
        return this;
    }
    public String getEncodedFacialPictureFront() {
        return this.encodedFacialPictureFront;
    }

}
