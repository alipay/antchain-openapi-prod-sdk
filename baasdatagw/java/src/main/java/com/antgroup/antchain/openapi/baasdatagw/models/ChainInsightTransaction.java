// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightTransaction extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 交易ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 交易类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 交易状态，VALID 表示合法，其它为错误码
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 交易发起者地址
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 交易目标地址
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 交易原始输入，hex编码
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // 交易调用的函数名
    @NameInMap("function")
    public String function;

    // 交易输入解析后的 json string
    @NameInMap("input_decoded")
    public String inputDecoded;

    // 交易的返回值
    @NameInMap("output")
    public String output;

    // 交易返回值解析后的 json string
    @NameInMap("output_decoded")
    public String outputDecoded;

    // 交易所在区块高度
    @NameInMap("block_num")
    @Validation(required = true)
    public Long blockNum;

    // 交易所在区块中的 index
    @NameInMap("tx_index")
    @Validation(required = true)
    public Long txIndex;

    // 原始交易的 json string
    @NameInMap("data")
    public String data;

    // 交易中的事件
    @NameInMap("events")
    public java.util.List<ChainInsightEvent> events;

    // 交易时间戳（单位：毫秒）
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static ChainInsightTransaction build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightTransaction self = new ChainInsightTransaction();
        return TeaModel.build(map, self);
    }

    public ChainInsightTransaction setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightTransaction setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightTransaction setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainInsightTransaction setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightTransaction setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ChainInsightTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ChainInsightTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ChainInsightTransaction setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ChainInsightTransaction setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public ChainInsightTransaction setInputDecoded(String inputDecoded) {
        this.inputDecoded = inputDecoded;
        return this;
    }
    public String getInputDecoded() {
        return this.inputDecoded;
    }

    public ChainInsightTransaction setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ChainInsightTransaction setOutputDecoded(String outputDecoded) {
        this.outputDecoded = outputDecoded;
        return this;
    }
    public String getOutputDecoded() {
        return this.outputDecoded;
    }

    public ChainInsightTransaction setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
        return this;
    }
    public Long getBlockNum() {
        return this.blockNum;
    }

    public ChainInsightTransaction setTxIndex(Long txIndex) {
        this.txIndex = txIndex;
        return this;
    }
    public Long getTxIndex() {
        return this.txIndex;
    }

    public ChainInsightTransaction setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ChainInsightTransaction setEvents(java.util.List<ChainInsightEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ChainInsightEvent> getEvents() {
        return this.events;
    }

    public ChainInsightTransaction setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
