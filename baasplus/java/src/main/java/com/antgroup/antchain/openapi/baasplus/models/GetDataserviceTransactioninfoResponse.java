// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetDataserviceTransactioninfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链唯一性标识
    @NameInMap("bizid")
    public String bizid;

    // category
    @NameInMap("category")
    public Long category;

    // 交易发起时间
    @NameInMap("create_time")
    public Long createTime;

    // 交易发起方哈希
    @NameInMap("from_hash")
    public String fromHash;

    // 交易哈希
    @NameInMap("hash")
    public String hash;

    // 块高
    @NameInMap("height")
    public Long height;

    // 交易接收方哈希
    @NameInMap("to_hash")
    public String toHash;

    // 交易类型
    @NameInMap("type")
    public Long type;

    public static GetDataserviceTransactioninfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataserviceTransactioninfoResponse self = new GetDataserviceTransactioninfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDataserviceTransactioninfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDataserviceTransactioninfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDataserviceTransactioninfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDataserviceTransactioninfoResponse setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetDataserviceTransactioninfoResponse setCategory(Long category) {
        this.category = category;
        return this;
    }
    public Long getCategory() {
        return this.category;
    }

    public GetDataserviceTransactioninfoResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetDataserviceTransactioninfoResponse setFromHash(String fromHash) {
        this.fromHash = fromHash;
        return this;
    }
    public String getFromHash() {
        return this.fromHash;
    }

    public GetDataserviceTransactioninfoResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public GetDataserviceTransactioninfoResponse setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public GetDataserviceTransactioninfoResponse setToHash(String toHash) {
        this.toHash = toHash;
        return this;
    }
    public String getToHash() {
        return this.toHash;
    }

    public GetDataserviceTransactioninfoResponse setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
