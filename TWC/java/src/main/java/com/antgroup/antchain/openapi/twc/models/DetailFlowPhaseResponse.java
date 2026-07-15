// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DetailFlowPhaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 阶段存证交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
    @NameInMap("data_type")
    public String dataType;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则返回存证时Hash，如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
    @NameInMap("notary_content")
    public String notaryContent;

    // 结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
    // 
    @NameInMap("data_type_key")
    public String dataTypeKey;

    // 阶段存证内容csv下载地址，暂时预留，存证内容过大时采用文件形式输出，有效期1个小时
    @NameInMap("url")
    public String url;

    // 交易所在的区块Hash
    @NameInMap("block_hash")
    public String blockHash;

    // 交易所在的区块高
    @NameInMap("block_height")
    public String blockHeight;

    // 阶段注册成功时间戳
    @NameInMap("register_time")
    public Long registerTime;

    public static DetailFlowPhaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailFlowPhaseResponse self = new DetailFlowPhaseResponse();
        return TeaModel.build(map, self);
    }

    public DetailFlowPhaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailFlowPhaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailFlowPhaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailFlowPhaseResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DetailFlowPhaseResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DetailFlowPhaseResponse setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public DetailFlowPhaseResponse setDataTypeKey(String dataTypeKey) {
        this.dataTypeKey = dataTypeKey;
        return this;
    }
    public String getDataTypeKey() {
        return this.dataTypeKey;
    }

    public DetailFlowPhaseResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DetailFlowPhaseResponse setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public DetailFlowPhaseResponse setBlockHeight(String blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public String getBlockHeight() {
        return this.blockHeight;
    }

    public DetailFlowPhaseResponse setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

}
