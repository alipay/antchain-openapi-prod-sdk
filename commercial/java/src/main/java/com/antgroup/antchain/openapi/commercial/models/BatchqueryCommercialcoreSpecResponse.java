// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryCommercialcoreSpecResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 规格售卖模式列表
    @NameInMap("sales_modes")
    public java.util.List<SpecSalesMode> salesModes;

    public static BatchqueryCommercialcoreSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCommercialcoreSpecResponse self = new BatchqueryCommercialcoreSpecResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryCommercialcoreSpecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryCommercialcoreSpecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryCommercialcoreSpecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryCommercialcoreSpecResponse setSalesModes(java.util.List<SpecSalesMode> salesModes) {
        this.salesModes = salesModes;
        return this;
    }
    public java.util.List<SpecSalesMode> getSalesModes() {
        return this.salesModes;
    }

}
