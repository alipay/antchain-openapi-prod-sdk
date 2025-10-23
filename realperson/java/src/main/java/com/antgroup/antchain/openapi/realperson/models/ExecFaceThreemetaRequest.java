// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ExecFaceThreemetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 真实姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 商户请求的唯一标识。 
    // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 固定值,BASE64
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 待比对的图像，BASE64 格式
    @NameInMap("facial_picture_auth")
    @Validation(required = true)
    public String facialPictureAuth;

    public static ExecFaceThreemetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecFaceThreemetaRequest self = new ExecFaceThreemetaRequest();
        return TeaModel.build(map, self);
    }

    public ExecFaceThreemetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecFaceThreemetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecFaceThreemetaRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ExecFaceThreemetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ExecFaceThreemetaRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ExecFaceThreemetaRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ExecFaceThreemetaRequest setFacialPictureAuth(String facialPictureAuth) {
        this.facialPictureAuth = facialPictureAuth;
        return this;
    }
    public String getFacialPictureAuth() {
        return this.facialPictureAuth;
    }

}
