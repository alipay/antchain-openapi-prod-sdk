// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryMerchantUgcimagesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入参中id对应的图片列表
    @NameInMap("img_list")
    public java.util.List<String> imgList;

    public static QueryMerchantUgcimagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantUgcimagesResponse self = new QueryMerchantUgcimagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantUgcimagesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantUgcimagesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantUgcimagesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantUgcimagesResponse setImgList(java.util.List<String> imgList) {
        this.imgList = imgList;
        return this;
    }
    public java.util.List<String> getImgList() {
        return this.imgList;
    }

}
