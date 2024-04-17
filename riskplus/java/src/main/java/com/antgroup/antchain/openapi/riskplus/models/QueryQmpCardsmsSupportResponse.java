// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpCardsmsSupportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 手机号卡片短信支持信息
    @NameInMap("datas")
    public String datas;

    public static QueryQmpCardsmsSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpCardsmsSupportResponse self = new QueryQmpCardsmsSupportResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpCardsmsSupportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpCardsmsSupportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpCardsmsSupportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpCardsmsSupportResponse setDatas(String datas) {
        this.datas = datas;
        return this;
    }
    public String getDatas() {
        return this.datas;
    }

}
