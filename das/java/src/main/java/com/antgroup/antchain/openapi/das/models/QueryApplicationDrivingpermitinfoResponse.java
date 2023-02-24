// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationDrivingpermitinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 行驶证核验结果
    @NameInMap("check_result")
    public DrivingPermitCheckResult checkResult;

    // 行驶证信息
    @NameInMap("data")
    public DrivingPermitInfo data;

    public static QueryApplicationDrivingpermitinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDrivingpermitinfoResponse self = new QueryApplicationDrivingpermitinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDrivingpermitinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationDrivingpermitinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationDrivingpermitinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationDrivingpermitinfoResponse setCheckResult(DrivingPermitCheckResult checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public DrivingPermitCheckResult getCheckResult() {
        return this.checkResult;
    }

    public QueryApplicationDrivingpermitinfoResponse setData(DrivingPermitInfo data) {
        this.data = data;
        return this;
    }
    public DrivingPermitInfo getData() {
        return this.data;
    }

}
