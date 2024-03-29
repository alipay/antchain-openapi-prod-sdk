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
    public Long skuId;

    // INIT("INIT", "初始化"),
    // PROCESSING("PROCESSING", "资产创建中"),
    // FINISH("FINISH", "资产初始化完毕"),
    // ;
    @NameInMap("sku_status")
    public String skuStatus;

    // NFT商品的名称
    @NameInMap("sku_name")
    public String skuName;

    // 作者的名称
    @NameInMap("author_name")
    public String authorName;

    // 发行方的名称
    @NameInMap("issuer_name")
    public String issuerName;

    // 缩略图展示路径
    @NameInMap("mini_image_path")
    public String miniImagePath;

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

    public QueryNftCreateResponse setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public QueryNftCreateResponse setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

    public QueryNftCreateResponse setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public QueryNftCreateResponse setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public QueryNftCreateResponse setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public QueryNftCreateResponse setMiniImagePath(String miniImagePath) {
        this.miniImagePath = miniImagePath;
        return this;
    }
    public String getMiniImagePath() {
        return this.miniImagePath;
    }

}
