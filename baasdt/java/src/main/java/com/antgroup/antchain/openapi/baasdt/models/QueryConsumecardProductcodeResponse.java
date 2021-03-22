// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardProductcodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 场景码配置信息列表
    @NameInMap("product_code_infos")
    public java.util.List<ProductCodeInfo> productCodeInfos;

    public static QueryConsumecardProductcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardProductcodeResponse self = new QueryConsumecardProductcodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardProductcodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardProductcodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardProductcodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardProductcodeResponse setProductCodeInfos(java.util.List<ProductCodeInfo> productCodeInfos) {
        this.productCodeInfos = productCodeInfos;
        return this;
    }
    public java.util.List<ProductCodeInfo> getProductCodeInfos() {
        return this.productCodeInfos;
    }

}
