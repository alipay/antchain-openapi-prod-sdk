// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckRouteTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 使用场景（不再使用）
    @NameInMap("scene")
    public String scene;

    // map结果的json数据格式，预留字段
    // 
    @NameInMap("extern_param")
    public String externParam;

    // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 用于入参加密的AES密钥
    @NameInMap("enc_token")
    public String encToken;

    public static CheckRouteTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRouteTwometaRequest self = new CheckRouteTwometaRequest();
        return TeaModel.build(map, self);
    }

    public CheckRouteTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckRouteTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckRouteTwometaRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckRouteTwometaRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckRouteTwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckRouteTwometaRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CheckRouteTwometaRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public CheckRouteTwometaRequest setReqEncType(String reqEncType) {
        this.reqEncType = reqEncType;
        return this;
    }
    public String getReqEncType() {
        return this.reqEncType;
    }

    public CheckRouteTwometaRequest setEncToken(String encToken) {
        this.encToken = encToken;
        return this;
    }
    public String getEncToken() {
        return this.encToken;
    }

}
