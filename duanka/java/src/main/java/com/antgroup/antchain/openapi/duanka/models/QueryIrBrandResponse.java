// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryIrBrandResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("data_list")
    public java.util.List<ZhxIrResultStruct> dataList;

    public static QueryIrBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIrBrandResponse self = new QueryIrBrandResponse();
        return TeaModel.build(map, self);
    }

    public QueryIrBrandResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIrBrandResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIrBrandResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIrBrandResponse setDataList(java.util.List<ZhxIrResultStruct> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ZhxIrResultStruct> getDataList() {
        return this.dataList;
    }

}
