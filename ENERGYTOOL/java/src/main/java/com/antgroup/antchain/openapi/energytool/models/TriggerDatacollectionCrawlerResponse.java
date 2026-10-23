// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class TriggerDatacollectionCrawlerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("issuccess")
    public Boolean issuccess;

    public static TriggerDatacollectionCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerDatacollectionCrawlerResponse self = new TriggerDatacollectionCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public TriggerDatacollectionCrawlerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TriggerDatacollectionCrawlerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TriggerDatacollectionCrawlerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TriggerDatacollectionCrawlerResponse setIssuccess(Boolean issuccess) {
        this.issuccess = issuccess;
        return this;
    }
    public Boolean getIssuccess() {
        return this.issuccess;
    }

}
