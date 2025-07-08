// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryLoginSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 门店签约信息
    @NameInMap("store_info")
    public SimStoreInfo storeInfo;

    public static QueryLoginSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoginSignResponse self = new QueryLoginSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoginSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoginSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoginSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoginSignResponse setStoreInfo(SimStoreInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }
    public SimStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

}
