// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcEpcertificationUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // // 响应为表单格式，可嵌入页面，具体以返回的结果为准
    @NameInMap("result_body")
    public String resultBody;

    // 订单号（但入参为out_biz_no时传入）
    @NameInMap("biz_no")
    public String bizNo;

    public static QueryAntsaasStaffingcEpcertificationUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcEpcertificationUrlResponse self = new QueryAntsaasStaffingcEpcertificationUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcEpcertificationUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsaasStaffingcEpcertificationUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsaasStaffingcEpcertificationUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsaasStaffingcEpcertificationUrlResponse setResultBody(String resultBody) {
        this.resultBody = resultBody;
        return this;
    }
    public String getResultBody() {
        return this.resultBody;
    }

    public QueryAntsaasStaffingcEpcertificationUrlResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
