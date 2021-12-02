// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckAnticheatPersonalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求id
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 主体姓名
    @NameInMap("cert_name")
    public String certName;

    // 主体身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 受雇企业
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 组织机构代码
    @NameInMap("company_no")
    public String companyNo;

    // 扩展字段，json格式
    @NameInMap("extern_param")
    public String externParam;

    public static CheckAnticheatPersonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAnticheatPersonalRequest self = new CheckAnticheatPersonalRequest();
        return TeaModel.build(map, self);
    }

    public CheckAnticheatPersonalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAnticheatPersonalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckAnticheatPersonalRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckAnticheatPersonalRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckAnticheatPersonalRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckAnticheatPersonalRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CheckAnticheatPersonalRequest setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
        return this;
    }
    public String getCompanyNo() {
        return this.companyNo;
    }

    public CheckAnticheatPersonalRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
