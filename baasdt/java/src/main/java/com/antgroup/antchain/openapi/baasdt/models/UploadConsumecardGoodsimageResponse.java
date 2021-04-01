// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadConsumecardGoodsimageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 临时可访问的url列表，过期时间2小时
    @NameInMap("temporary_urls")
    public java.util.List<String> temporaryUrls;

    // 图片的不可访问url列表，发布商品时使用
    @NameInMap("urls")
    public java.util.List<String> urls;

    public static UploadConsumecardGoodsimageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadConsumecardGoodsimageResponse self = new UploadConsumecardGoodsimageResponse();
        return TeaModel.build(map, self);
    }

    public UploadConsumecardGoodsimageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadConsumecardGoodsimageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadConsumecardGoodsimageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadConsumecardGoodsimageResponse setTemporaryUrls(java.util.List<String> temporaryUrls) {
        this.temporaryUrls = temporaryUrls;
        return this;
    }
    public java.util.List<String> getTemporaryUrls() {
        return this.temporaryUrls;
    }

    public UploadConsumecardGoodsimageResponse setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

}
