// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InitEkytFaceverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 加密方式；0：明文；1：RSA；2：SM2
    @NameInMap("enc_type")
    public String encType;

    // 商户请求的唯一标识
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    public static InitEkytFaceverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEkytFaceverifyRequest self = new InitEkytFaceverifyRequest();
        return TeaModel.build(map, self);
    }

    public InitEkytFaceverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitEkytFaceverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitEkytFaceverifyRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public InitEkytFaceverifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitEkytFaceverifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitEkytFaceverifyRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public InitEkytFaceverifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

}
