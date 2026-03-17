// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class BatchqueryRightsprodVoucherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 券基本信息列表
    @NameInMap("list")
    public java.util.List<VoucherBaseInfoVO> list;

    public static BatchqueryRightsprodVoucherResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryRightsprodVoucherResponse self = new BatchqueryRightsprodVoucherResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryRightsprodVoucherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryRightsprodVoucherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryRightsprodVoucherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryRightsprodVoucherResponse setList(java.util.List<VoucherBaseInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<VoucherBaseInfoVO> getList() {
        return this.list;
    }

}
