// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QuerySocialriskBriefRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 场景编号
    @NameInMap("scene")
    public String scene;

    // 入参加密模式： NONE：不加密； RSA：RSA加密； SM2：SM2加密。
    @NameInMap("enc_type")
    @Validation(required = true)
    public String encType;

    // 	
    // 姓名（根据enc_type决定加密方式）
    @NameInMap("cert_name")
    public String certName;

    // 身份证号（根据enc_type决定加密方式）
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QuerySocialriskBriefRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySocialriskBriefRequest self = new QuerySocialriskBriefRequest();
        return TeaModel.build(map, self);
    }

    public QuerySocialriskBriefRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySocialriskBriefRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySocialriskBriefRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QuerySocialriskBriefRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QuerySocialriskBriefRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public QuerySocialriskBriefRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QuerySocialriskBriefRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QuerySocialriskBriefRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
