// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthMeteringResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 计量数据
    @NameInMap("metering_data")
    public MeteringData meteringData;

    public static QueryFaceauthMeteringResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthMeteringResponse self = new QueryFaceauthMeteringResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthMeteringResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFaceauthMeteringResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFaceauthMeteringResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFaceauthMeteringResponse setMeteringData(MeteringData meteringData) {
        this.meteringData = meteringData;
        return this;
    }
    public MeteringData getMeteringData() {
        return this.meteringData;
    }

}
