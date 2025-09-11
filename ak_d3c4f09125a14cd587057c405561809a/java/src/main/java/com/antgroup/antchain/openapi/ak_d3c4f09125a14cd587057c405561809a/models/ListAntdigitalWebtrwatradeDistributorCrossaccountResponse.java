// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeDistributorCrossaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跨链账号明细
    @NameInMap("data")
    public java.util.List<CrossAccountListVO> data;

    public static ListAntdigitalWebtrwatradeDistributorCrossaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeDistributorCrossaccountResponse self = new ListAntdigitalWebtrwatradeDistributorCrossaccountResponse();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountResponse setData(java.util.List<CrossAccountListVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CrossAccountListVO> getData() {
        return this.data;
    }

}
