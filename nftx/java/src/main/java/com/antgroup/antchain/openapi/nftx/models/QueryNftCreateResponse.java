// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // NFT发行成功的商品id
    @NameInMap("sku_id")
    public String skuId;

    // INIT("INIT", "初始化"),
    // PROCESSING("PROCESSING", "资产创建中"),
    // FINISH("FINISH", "资产初始化完毕"),
    // ;
    @NameInMap("sku_status")
    public String skuStatus;

    public static QueryNftCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNftCreateResponse self = new QueryNftCreateResponse();
        return TeaModel.build(map, self);
    }

    public QueryNftCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNftCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNftCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNftCreateResponse setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryNftCreateResponse setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

}
