// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CertifyCertifyFirmmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义唯一id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 租户类型
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 企业名称
    @NameInMap("firm_name")
    @Validation(required = true)
    public String firmName;

    // 企业营业执照号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 法人姓名
    @NameInMap("lp_cert_name")
    @Validation(required = true)
    public String lpCertName;

    // 法人身份证号
    @NameInMap("lp_cert_no")
    @Validation(required = true)
    public String lpCertNo;

    public static CertifyCertifyFirmmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyCertifyFirmmetaRequest self = new CertifyCertifyFirmmetaRequest();
        return TeaModel.build(map, self);
    }

    public CertifyCertifyFirmmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyCertifyFirmmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyCertifyFirmmetaRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertifyCertifyFirmmetaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CertifyCertifyFirmmetaRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CertifyCertifyFirmmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CertifyCertifyFirmmetaRequest setLpCertName(String lpCertName) {
        this.lpCertName = lpCertName;
        return this;
    }
    public String getLpCertName() {
        return this.lpCertName;
    }

    public CertifyCertifyFirmmetaRequest setLpCertNo(String lpCertNo) {
        this.lpCertNo = lpCertNo;
        return this;
    }
    public String getLpCertNo() {
        return this.lpCertNo;
    }

}
