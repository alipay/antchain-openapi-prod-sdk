// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_55afdde95cc7448bad87a98d904c1f44.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanRobotResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果json字符串
    @NameInMap("result_data")
    public String resultData;

    public static QueryUniversalsaasDigitalhumanRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanRobotResponse self = new QueryUniversalsaasDigitalhumanRobotResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanRobotResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUniversalsaasDigitalhumanRobotResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUniversalsaasDigitalhumanRobotResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUniversalsaasDigitalhumanRobotResponse setResultData(String resultData) {
        this.resultData = resultData;
        return this;
    }
    public String getResultData() {
        return this.resultData;
    }

}
