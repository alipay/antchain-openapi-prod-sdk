// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryEducationInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 用户是否授权
    @NameInMap("authorized")
    @Validation(required = true)
    public Boolean authorized;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryEducationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEducationInfoRequest self = new QueryEducationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEducationInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEducationInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEducationInfoRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryEducationInfoRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryEducationInfoRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public QueryEducationInfoRequest setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public QueryEducationInfoRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
