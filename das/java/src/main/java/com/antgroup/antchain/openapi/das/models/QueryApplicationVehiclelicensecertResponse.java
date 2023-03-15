// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationVehiclelicensecertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 行驶证信息
    @NameInMap("vehicle_license_info")
    public VehicleLicenseInfo vehicleLicenseInfo;

    // 行驶证核验结果
    @NameInMap("vehicle_license_cert_result")
    public VehicleLicenseCertResult vehicleLicenseCertResult;

    public static QueryApplicationVehiclelicensecertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationVehiclelicensecertResponse self = new QueryApplicationVehiclelicensecertResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationVehiclelicensecertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationVehiclelicensecertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationVehiclelicensecertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationVehiclelicensecertResponse setVehicleLicenseInfo(VehicleLicenseInfo vehicleLicenseInfo) {
        this.vehicleLicenseInfo = vehicleLicenseInfo;
        return this;
    }
    public VehicleLicenseInfo getVehicleLicenseInfo() {
        return this.vehicleLicenseInfo;
    }

    public QueryApplicationVehiclelicensecertResponse setVehicleLicenseCertResult(VehicleLicenseCertResult vehicleLicenseCertResult) {
        this.vehicleLicenseCertResult = vehicleLicenseCertResult;
        return this;
    }
    public VehicleLicenseCertResult getVehicleLicenseCertResult() {
        return this.vehicleLicenseCertResult;
    }

}
