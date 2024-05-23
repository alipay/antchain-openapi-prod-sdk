// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSignfieldsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署区列表
    @NameInMap("sign_field_list")
    public String signFieldList;

    public static QueryInnerSignfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSignfieldsResponse self = new QueryInnerSignfieldsResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSignfieldsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSignfieldsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSignfieldsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSignfieldsResponse setSignFieldList(String signFieldList) {
        this.signFieldList = signFieldList;
        return this;
    }
    public String getSignFieldList() {
        return this.signFieldList;
    }

}
