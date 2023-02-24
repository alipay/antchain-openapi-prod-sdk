// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationDriverlicenseinfoResponse extends TeaModel {
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
    @NameInMap("data")
    public DriverLicenseInfo data;

    public static QueryApplicationDriverlicenseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDriverlicenseinfoResponse self = new QueryApplicationDriverlicenseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDriverlicenseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationDriverlicenseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationDriverlicenseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationDriverlicenseinfoResponse setData(DriverLicenseInfo data) {
        this.data = data;
        return this;
    }
    public DriverLicenseInfo getData() {
        return this.data;
    }

}
