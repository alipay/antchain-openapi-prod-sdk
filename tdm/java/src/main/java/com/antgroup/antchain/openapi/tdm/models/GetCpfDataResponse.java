// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class GetCpfDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // PDF、或结构化信息、或加密数据
    @NameInMap("trust_data")
    public String trustData;

    // 数据hash，数据验真时用
    @NameInMap("data_hash")
    public String dataHash;

    public static GetCpfDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCpfDataResponse self = new GetCpfDataResponse();
        return TeaModel.build(map, self);
    }

    public GetCpfDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCpfDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCpfDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCpfDataResponse setTrustData(String trustData) {
        this.trustData = trustData;
        return this;
    }
    public String getTrustData() {
        return this.trustData;
    }

    public GetCpfDataResponse setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

}
