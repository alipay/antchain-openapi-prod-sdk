// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckIndividualidTwometaRequest extends TeaModel {
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

    // 身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // map结果的json数据格式，预留字段
    @NameInMap("extern_param")
    public String externParam;

    // 认证子类型
    @NameInMap("scene")
    public String scene;

    public static CheckIndividualidTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIndividualidTwometaRequest self = new CheckIndividualidTwometaRequest();
        return TeaModel.build(map, self);
    }

    public CheckIndividualidTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIndividualidTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIndividualidTwometaRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckIndividualidTwometaRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckIndividualidTwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckIndividualidTwometaRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public CheckIndividualidTwometaRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
