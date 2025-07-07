// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCaritemsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 车五项信息
    @NameInMap("car_items_info")
    public CarItemsInfo carItemsInfo;

    public static QueryAuthCaritemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCaritemsResponse self = new QueryAuthCaritemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthCaritemsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthCaritemsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthCaritemsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthCaritemsResponse setCarItemsInfo(CarItemsInfo carItemsInfo) {
        this.carItemsInfo = carItemsInfo;
        return this;
    }
    public CarItemsInfo getCarItemsInfo() {
        return this.carItemsInfo;
    }

}
