// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyDataassertregisterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据资产ID
    @NameInMap("data_id")
    public String dataId;

    public static StartMydidcommunAgencyDataassertregisterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyDataassertregisterResponse self = new StartMydidcommunAgencyDataassertregisterResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyDataassertregisterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunAgencyDataassertregisterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunAgencyDataassertregisterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunAgencyDataassertregisterResponse setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
