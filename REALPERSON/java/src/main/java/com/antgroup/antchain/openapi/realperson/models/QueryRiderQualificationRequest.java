// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryRiderQualificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // NONE明问，MD5：手机号码字段为MD5加密后的字符串，为空默认明文
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryRiderQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiderQualificationRequest self = new QueryRiderQualificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiderQualificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiderQualificationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiderQualificationRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryRiderQualificationRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryRiderQualificationRequest setReqEncType(String reqEncType) {
        this.reqEncType = reqEncType;
        return this;
    }
    public String getReqEncType() {
        return this.reqEncType;
    }

    public QueryRiderQualificationRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
