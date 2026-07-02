// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTrippointsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("success")
    public Boolean success;

    // List<String>	["123.1223456_12.123456", "123.1223456_12.123456"]
    @NameInMap("trip_points")
    public java.util.List<String> tripPoints;

    public static QueryElectrocarTrippointsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTrippointsResponse self = new QueryElectrocarTrippointsResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTrippointsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTrippointsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTrippointsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTrippointsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarTrippointsResponse setTripPoints(java.util.List<String> tripPoints) {
        this.tripPoints = tripPoints;
        return this;
    }
    public java.util.List<String> getTripPoints() {
        return this.tripPoints;
    }

}
