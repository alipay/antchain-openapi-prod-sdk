// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushInsuranceOlpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被保人证件号
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 50)
    public String bbrIdNo;

    // 被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人类型, 1-个人 2-企业	
    // 
    @NameInMap("bbr_type")
    @Validation(required = true, maxLength = 10)
    public String bbrType;

    // 保险公司编码
    @NameInMap("channel_code")
    @Validation(required = true, maxLength = 50)
    public String channelCode;

    // 保险公司名称
    @NameInMap("channel_name")
    @Validation(required = true, maxLength = 100)
    public String channelName;

    // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，CLAIMED: 已理赔
    @NameInMap("claim_status")
    @Validation(required = true, maxLength = 12)
    public String claimStatus;

    // 投保时间	
    @NameInMap("insure_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureDate;

    // 保险止期
    @NameInMap("insure_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureEnd;

    // 保险起期
    @NameInMap("insure_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureStart;

    // 存证平台编码
    @NameInMap("platform_consumer_code")
    @Validation(required = true, maxLength = 50)
    public String platformConsumerCode;

    // 存证平台名称
    @NameInMap("platform_consumer_name")
    @Validation(required = true, maxLength = 100)
    public String platformConsumerName;

    // 保单文件id，可支持多个，逗号隔开
    @NameInMap("pol_file_ids")
    @Validation(maxLength = 3200)
    public String polFileIds;

    // 保单号
    @NameInMap("pol_no")
    @Validation(required = true, maxLength = 100)
    public String polNo;

    // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,	
    @NameInMap("pol_status")
    @Validation(required = true, maxLength = 12)
    public String polStatus;

    // 电子保单url地址
    @NameInMap("pol_url")
    @Validation(maxLength = 500)
    public String polUrl;

    // 保费
    @NameInMap("premium")
    @Validation(required = true, maxLength = 20)
    public String premium;

    // 险种代码
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 50)
    public String productCode;

    // 险种名称
    @NameInMap("product_name")
    @Validation(required = true, maxLength = 100)
    public String productName;

    // 退保时间
    @NameInMap("surrender_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String surrenderTime;

    // 投保人证件号
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 50)
    public String tbrIdNo;

    // 投保人名称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人类型, 1-个人 2-企业
    @NameInMap("tbr_type")
    @Validation(required = true, maxLength = 10)
    public String tbrType;

    // 交易流水号
    @NameInMap("trade_no")
    @Validation(maxLength = 200)
    public String tradeNo;

    public static PushInsuranceOlpRequest build(java.util.Map<String, ?> map) throws Exception {
        PushInsuranceOlpRequest self = new PushInsuranceOlpRequest();
        return TeaModel.build(map, self);
    }

    public PushInsuranceOlpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushInsuranceOlpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushInsuranceOlpRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public PushInsuranceOlpRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public PushInsuranceOlpRequest setBbrType(String bbrType) {
        this.bbrType = bbrType;
        return this;
    }
    public String getBbrType() {
        return this.bbrType;
    }

    public PushInsuranceOlpRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public PushInsuranceOlpRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public PushInsuranceOlpRequest setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
        return this;
    }
    public String getClaimStatus() {
        return this.claimStatus;
    }

    public PushInsuranceOlpRequest setInsureDate(String insureDate) {
        this.insureDate = insureDate;
        return this;
    }
    public String getInsureDate() {
        return this.insureDate;
    }

    public PushInsuranceOlpRequest setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

    public PushInsuranceOlpRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public PushInsuranceOlpRequest setPlatformConsumerCode(String platformConsumerCode) {
        this.platformConsumerCode = platformConsumerCode;
        return this;
    }
    public String getPlatformConsumerCode() {
        return this.platformConsumerCode;
    }

    public PushInsuranceOlpRequest setPlatformConsumerName(String platformConsumerName) {
        this.platformConsumerName = platformConsumerName;
        return this;
    }
    public String getPlatformConsumerName() {
        return this.platformConsumerName;
    }

    public PushInsuranceOlpRequest setPolFileIds(String polFileIds) {
        this.polFileIds = polFileIds;
        return this;
    }
    public String getPolFileIds() {
        return this.polFileIds;
    }

    public PushInsuranceOlpRequest setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public PushInsuranceOlpRequest setPolStatus(String polStatus) {
        this.polStatus = polStatus;
        return this;
    }
    public String getPolStatus() {
        return this.polStatus;
    }

    public PushInsuranceOlpRequest setPolUrl(String polUrl) {
        this.polUrl = polUrl;
        return this;
    }
    public String getPolUrl() {
        return this.polUrl;
    }

    public PushInsuranceOlpRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public PushInsuranceOlpRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushInsuranceOlpRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PushInsuranceOlpRequest setSurrenderTime(String surrenderTime) {
        this.surrenderTime = surrenderTime;
        return this;
    }
    public String getSurrenderTime() {
        return this.surrenderTime;
    }

    public PushInsuranceOlpRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public PushInsuranceOlpRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public PushInsuranceOlpRequest setTbrType(String tbrType) {
        this.tbrType = tbrType;
        return this;
    }
    public String getTbrType() {
        return this.tbrType;
    }

    public PushInsuranceOlpRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
