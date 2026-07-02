// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CheckAiidentificationGoodspointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品鉴定点检测响应数据
    @NameInMap("data")
    public BaiGoodsPointCheckRespData data;

    public static CheckAiidentificationGoodspointResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAiidentificationGoodspointResponse self = new CheckAiidentificationGoodspointResponse();
        return TeaModel.build(map, self);
    }

    public CheckAiidentificationGoodspointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAiidentificationGoodspointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAiidentificationGoodspointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAiidentificationGoodspointResponse setData(BaiGoodsPointCheckRespData data) {
        this.data = data;
        return this;
    }
    public BaiGoodsPointCheckRespData getData() {
        return this.data;
    }

}
