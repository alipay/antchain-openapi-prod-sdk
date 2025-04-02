// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ZhimaQueryResp extends TeaModel {
    // 认证的企业证件号
    @NameInMap("ep_cert_no")
    public String epCertNo;

    // 认证的企业名
    @NameInMap("ep_name")
    public String epName;

    // 认证不通过的错误码
    @NameInMap("failed_code")
    public String failedCode;

    // 认证是否通过，通过为true，不通过为false
    @NameInMap("passed")
    public String passed;

    //  10000是成功，其余是失败
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    //  
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    //  
    @NameInMap("sub_code")
    public String subCode;

    //  
    @NameInMap("sub_msg")
    public String subMsg;

    public static ZhimaQueryResp build(java.util.Map<String, ?> map) throws Exception {
        ZhimaQueryResp self = new ZhimaQueryResp();
        return TeaModel.build(map, self);
    }

    public ZhimaQueryResp setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public ZhimaQueryResp setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public ZhimaQueryResp setFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }
    public String getFailedCode() {
        return this.failedCode;
    }

    public ZhimaQueryResp setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public ZhimaQueryResp setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ZhimaQueryResp setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ZhimaQueryResp setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ZhimaQueryResp setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
