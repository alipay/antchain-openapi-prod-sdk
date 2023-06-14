// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryResourceImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // nftID 藏品素材nftId，type为NFT时有值
    @NameInMap("nft_id")
    public String nftId;

    // 具体藏品名称，type为NFT时有值
    @NameInMap("sku_name")
    public String skuName;

    // nftId 的 算法计算的hash，该藏品唯一标识，type为NFT时有值
    @NameInMap("uni_hash")
    public String uniHash;

    // Date	藏品铸造上链生成时间，例如2021.09.22 20:22:19，type为NFT时有值
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTime;

    // url列表
    @NameInMap("img_urls")
    public java.util.List<CToMResourceImg> imgUrls;

    // int	高清图状态
    // 0 需要等待
    // 1 已完成
    @NameInMap("high_definition_status")
    public Long highDefinitionStatus;

    public static QueryResourceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceImageResponse self = new QueryResourceImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceImageResponse setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public QueryResourceImageResponse setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public QueryResourceImageResponse setUniHash(String uniHash) {
        this.uniHash = uniHash;
        return this;
    }
    public String getUniHash() {
        return this.uniHash;
    }

    public QueryResourceImageResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public QueryResourceImageResponse setImgUrls(java.util.List<CToMResourceImg> imgUrls) {
        this.imgUrls = imgUrls;
        return this;
    }
    public java.util.List<CToMResourceImg> getImgUrls() {
        return this.imgUrls;
    }

    public QueryResourceImageResponse setHighDefinitionStatus(Long highDefinitionStatus) {
        this.highDefinitionStatus = highDefinitionStatus;
        return this;
    }
    public Long getHighDefinitionStatus() {
        return this.highDefinitionStatus;
    }

}
