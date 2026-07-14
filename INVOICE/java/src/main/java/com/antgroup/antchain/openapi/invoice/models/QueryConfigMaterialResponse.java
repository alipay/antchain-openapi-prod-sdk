// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryConfigMaterialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 允许的开票介质列表
    @NameInMap("data_list")
    public java.util.List<InvoiceMaterialVO> dataList;

    public static QueryConfigMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigMaterialResponse self = new QueryConfigMaterialResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigMaterialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConfigMaterialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConfigMaterialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConfigMaterialResponse setDataList(java.util.List<InvoiceMaterialVO> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<InvoiceMaterialVO> getDataList() {
        return this.dataList;
    }

}
