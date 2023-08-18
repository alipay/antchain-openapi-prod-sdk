// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclCertifyInfo extends TeaModel {
    // 认证id
    @NameInMap("certify_id")
    public String certifyId;

    // 认证url 如果status待认证,该字段非空,
    // 如果认证失败,这里的新的认证链接,支持重复认证
    @NameInMap("certify_url")
    public String certifyUrl;

    // 认证描述
    @NameInMap("result_desc")
    public String resultDesc;

    // 认证状态 
    // 1.待认证：INIT 
    // 2.认证成功：PASS 
    // 3.认证失败：FAIL
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static BclCertifyInfo build(java.util.Map<String, ?> map) throws Exception {
        BclCertifyInfo self = new BclCertifyInfo();
        return TeaModel.build(map, self);
    }

    public BclCertifyInfo setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public BclCertifyInfo setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

    public BclCertifyInfo setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public String getResultDesc() {
        return this.resultDesc;
    }

    public BclCertifyInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
