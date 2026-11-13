// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalLogisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 物流信息，RentalLogisticsResp 列表的JSON数组字符串
    @NameInMap("data_list")
    public String dataList;

    public static QueryRentalLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalLogisticsResponse self = new QueryRentalLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRentalLogisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRentalLogisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRentalLogisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRentalLogisticsResponse setDataList(String dataList) {
        this.dataList = dataList;
        return this;
    }
    public String getDataList() {
        return this.dataList;
    }

}
