// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationDriverlicensecertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 驾驶证信息
    @NameInMap("driver_license_info")
    public DriverLicenseInfo driverLicenseInfo;

    // 身份证与姓名是否一致
    @NameInMap("cert_result")
    public String certResult;

    public static QueryApplicationDriverlicensecertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDriverlicensecertResponse self = new QueryApplicationDriverlicensecertResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDriverlicensecertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationDriverlicensecertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationDriverlicensecertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationDriverlicensecertResponse setDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        this.driverLicenseInfo = driverLicenseInfo;
        return this;
    }
    public DriverLicenseInfo getDriverLicenseInfo() {
        return this.driverLicenseInfo;
    }

    public QueryApplicationDriverlicensecertResponse setCertResult(String certResult) {
        this.certResult = certResult;
        return this;
    }
    public String getCertResult() {
        return this.certResult;
    }

}
