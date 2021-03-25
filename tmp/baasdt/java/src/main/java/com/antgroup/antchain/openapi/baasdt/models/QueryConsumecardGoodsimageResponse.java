// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardGoodsimageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 图片的临时可访问url列表，url过期时间2小时
    @NameInMap("temporary_urls")
    public java.util.List<String> temporaryUrls;

    public static QueryConsumecardGoodsimageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardGoodsimageResponse self = new QueryConsumecardGoodsimageResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardGoodsimageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardGoodsimageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardGoodsimageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardGoodsimageResponse setTemporaryUrls(java.util.List<String> temporaryUrls) {
        this.temporaryUrls = temporaryUrls;
        return this;
    }
    public java.util.List<String> getTemporaryUrls() {
        return this.temporaryUrls;
    }

}
