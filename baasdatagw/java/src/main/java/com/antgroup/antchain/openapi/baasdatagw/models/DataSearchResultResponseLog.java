// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DataSearchResultResponseLog extends TeaModel {
    // 数据关联的合约Meta信息
    @NameInMap("meta_id")
    @Validation(required = true)
    public String metaId;

    // 交易调用的函数名称
    @NameInMap("function")
    public String function;

    // 交易产生的事件名称
    @NameInMap("topic")
    public String topic;

    // 交易所在的区块高度
    @NameInMap("block_num")
    @Validation(required = true)
    public Long blockNum;

    // 交易ID
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // Json 序列化的交易请求参数
    @NameInMap("data")
    public String data;

    // 交易中合约输出的日志内容
    @NameInMap("log")
    public String log;

    // 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 交易上链时间戳，单位毫秒
    @NameInMap("tx_timestamp")
    @Validation(required = true)
    public Long txTimestamp;

    public static DataSearchResultResponseLog build(java.util.Map<String, ?> map) throws Exception {
        DataSearchResultResponseLog self = new DataSearchResultResponseLog();
        return TeaModel.build(map, self);
    }

    public DataSearchResultResponseLog setMetaId(String metaId) {
        this.metaId = metaId;
        return this;
    }
    public String getMetaId() {
        return this.metaId;
    }

    public DataSearchResultResponseLog setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public DataSearchResultResponseLog setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DataSearchResultResponseLog setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
        return this;
    }
    public Long getBlockNum() {
        return this.blockNum;
    }

    public DataSearchResultResponseLog setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public DataSearchResultResponseLog setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DataSearchResultResponseLog setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public DataSearchResultResponseLog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataSearchResultResponseLog setTxTimestamp(Long txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public Long getTxTimestamp() {
        return this.txTimestamp;
    }

}
