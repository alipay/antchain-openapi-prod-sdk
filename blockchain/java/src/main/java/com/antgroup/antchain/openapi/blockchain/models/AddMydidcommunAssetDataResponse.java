// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddMydidcommunAssetDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据DID，用于唯一标示数据
    @NameInMap("data_did")
    public String dataDid;

    public static AddMydidcommunAssetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMydidcommunAssetDataResponse self = new AddMydidcommunAssetDataResponse();
        return TeaModel.build(map, self);
    }

    public AddMydidcommunAssetDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddMydidcommunAssetDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddMydidcommunAssetDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddMydidcommunAssetDataResponse setDataDid(String dataDid) {
        this.dataDid = dataDid;
        return this;
    }
    public String getDataDid() {
        return this.dataDid;
    }

}
