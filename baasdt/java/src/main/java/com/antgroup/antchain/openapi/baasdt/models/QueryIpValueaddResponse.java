// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpValueaddResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 增值服务详情
    @NameInMap("value_added_info")
    public ValueAddedServiceInfoWithSku valueAddedInfo;

    public static QueryIpValueaddResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpValueaddResponse self = new QueryIpValueaddResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpValueaddResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpValueaddResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpValueaddResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpValueaddResponse setValueAddedInfo(ValueAddedServiceInfoWithSku valueAddedInfo) {
        this.valueAddedInfo = valueAddedInfo;
        return this;
    }
    public ValueAddedServiceInfoWithSku getValueAddedInfo() {
        return this.valueAddedInfo;
    }

}
