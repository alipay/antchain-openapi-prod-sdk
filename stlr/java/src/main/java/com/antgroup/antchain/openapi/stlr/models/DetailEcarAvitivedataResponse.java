// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarAvitivedataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业排放数据录入明细编码
    @NameInMap("emission_data_entry_item_no")
    public String emissionDataEntryItemNo;

    // 企业业务单号
    @NameInMap("enterprise_biz_no")
    public String enterpriseBizNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
    @NameInMap("occurrence_start_time")
    public String occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
    @NameInMap("occurrence_end_time")
    public String occurrenceEndTime;

    // 链上交易Hash
    @NameInMap("carbon_chain_trade_hash")
    public String carbonChainTradeHash;

    // 总的碳排放用量，按字符串输出，最多保留6位小数
    @NameInMap("emission_statistical_amount")
    public String emissionStatisticalAmount;

    // 排放源编码
    @NameInMap("emission_source_no")
    public String emissionSourceNo;

    // 排放源名称
    @NameInMap("emission_source_name")
    public String emissionSourceName;

    // 排放单元编码
    @NameInMap("enterprise_location_no")
    public String enterpriseLocationNo;

    // 排放单元名称
    @NameInMap("enterprise_location_name")
    public String enterpriseLocationName;

    public static DetailEcarAvitivedataResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarAvitivedataResponse self = new DetailEcarAvitivedataResponse();
        return TeaModel.build(map, self);
    }

    public DetailEcarAvitivedataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailEcarAvitivedataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailEcarAvitivedataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailEcarAvitivedataResponse setEmissionDataEntryItemNo(String emissionDataEntryItemNo) {
        this.emissionDataEntryItemNo = emissionDataEntryItemNo;
        return this;
    }
    public String getEmissionDataEntryItemNo() {
        return this.emissionDataEntryItemNo;
    }

    public DetailEcarAvitivedataResponse setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

    public DetailEcarAvitivedataResponse setOccurrenceStartTime(String occurrenceStartTime) {
        this.occurrenceStartTime = occurrenceStartTime;
        return this;
    }
    public String getOccurrenceStartTime() {
        return this.occurrenceStartTime;
    }

    public DetailEcarAvitivedataResponse setOccurrenceEndTime(String occurrenceEndTime) {
        this.occurrenceEndTime = occurrenceEndTime;
        return this;
    }
    public String getOccurrenceEndTime() {
        return this.occurrenceEndTime;
    }

    public DetailEcarAvitivedataResponse setCarbonChainTradeHash(String carbonChainTradeHash) {
        this.carbonChainTradeHash = carbonChainTradeHash;
        return this;
    }
    public String getCarbonChainTradeHash() {
        return this.carbonChainTradeHash;
    }

    public DetailEcarAvitivedataResponse setEmissionStatisticalAmount(String emissionStatisticalAmount) {
        this.emissionStatisticalAmount = emissionStatisticalAmount;
        return this;
    }
    public String getEmissionStatisticalAmount() {
        return this.emissionStatisticalAmount;
    }

    public DetailEcarAvitivedataResponse setEmissionSourceNo(String emissionSourceNo) {
        this.emissionSourceNo = emissionSourceNo;
        return this;
    }
    public String getEmissionSourceNo() {
        return this.emissionSourceNo;
    }

    public DetailEcarAvitivedataResponse setEmissionSourceName(String emissionSourceName) {
        this.emissionSourceName = emissionSourceName;
        return this;
    }
    public String getEmissionSourceName() {
        return this.emissionSourceName;
    }

    public DetailEcarAvitivedataResponse setEnterpriseLocationNo(String enterpriseLocationNo) {
        this.enterpriseLocationNo = enterpriseLocationNo;
        return this;
    }
    public String getEnterpriseLocationNo() {
        return this.enterpriseLocationNo;
    }

    public DetailEcarAvitivedataResponse setEnterpriseLocationName(String enterpriseLocationName) {
        this.enterpriseLocationName = enterpriseLocationName;
        return this;
    }
    public String getEnterpriseLocationName() {
        return this.enterpriseLocationName;
    }

}
