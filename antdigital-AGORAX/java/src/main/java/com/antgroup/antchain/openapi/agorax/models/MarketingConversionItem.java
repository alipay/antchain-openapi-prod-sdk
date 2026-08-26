// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class MarketingConversionItem extends TeaModel {
    // 单条转化记录业务唯一标识
    /**
     * <strong>example:</strong>
     * <p>53cecfb2f3cd461a9b061c5bbc4d99db</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 此前调用 antchain.das.application.unifiedentrance.query 后取得的网关请求唯一 ID
    /**
     * <strong>example:</strong>
     * <p>1d0bdfd22527430dbc6aa6dfb74bfebb</p>
     */
    @NameInMap("query_req_msg_id")
    @Validation(required = true)
    public String queryReqMsgId;

    // 是否转化：0-未转化，1-已转化
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("converted")
    @Validation(required = true)
    public Long converted;

    // 转化时间戳，converted=1` 时必填，`converted=0` 时可缺
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("conversion_timestamp")
    public String conversionTimestamp;

    // 投放平台
    /**
     * <strong>example:</strong>
     * <p>淘宝</p>
     */
    @NameInMap("advertising_platform")
    @Validation(required = true)
    public String advertisingPlatform;

    // 投放产品
    /**
     * <strong>example:</strong>
     * <p>xx保健品</p>
     */
    @NameInMap("advertised_product")
    @Validation(required = true)
    public String advertisedProduct;

    // 扩展信息1
    /**
     * <strong>example:</strong>
     * <p>xx面馆活动</p>
     */
    @NameInMap("extra_info_1")
    public String extraInfo1;

    // 扩展信息2
    /**
     * <strong>example:</strong>
     * <p>xx面馆活动</p>
     */
    @NameInMap("extra_info_2")
    public String extraInfo2;

    // 扩展信息3
    /**
     * <strong>example:</strong>
     * <p>满100元可用</p>
     */
    @NameInMap("extra_info_3")
    public String extraInfo3;

    public static MarketingConversionItem build(java.util.Map<String, ?> map) throws Exception {
        MarketingConversionItem self = new MarketingConversionItem();
        return TeaModel.build(map, self);
    }

    public MarketingConversionItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MarketingConversionItem setQueryReqMsgId(String queryReqMsgId) {
        this.queryReqMsgId = queryReqMsgId;
        return this;
    }
    public String getQueryReqMsgId() {
        return this.queryReqMsgId;
    }

    public MarketingConversionItem setConverted(Long converted) {
        this.converted = converted;
        return this;
    }
    public Long getConverted() {
        return this.converted;
    }

    public MarketingConversionItem setConversionTimestamp(String conversionTimestamp) {
        this.conversionTimestamp = conversionTimestamp;
        return this;
    }
    public String getConversionTimestamp() {
        return this.conversionTimestamp;
    }

    public MarketingConversionItem setAdvertisingPlatform(String advertisingPlatform) {
        this.advertisingPlatform = advertisingPlatform;
        return this;
    }
    public String getAdvertisingPlatform() {
        return this.advertisingPlatform;
    }

    public MarketingConversionItem setAdvertisedProduct(String advertisedProduct) {
        this.advertisedProduct = advertisedProduct;
        return this;
    }
    public String getAdvertisedProduct() {
        return this.advertisedProduct;
    }

    public MarketingConversionItem setExtraInfo1(String extraInfo1) {
        this.extraInfo1 = extraInfo1;
        return this;
    }
    public String getExtraInfo1() {
        return this.extraInfo1;
    }

    public MarketingConversionItem setExtraInfo2(String extraInfo2) {
        this.extraInfo2 = extraInfo2;
        return this;
    }
    public String getExtraInfo2() {
        return this.extraInfo2;
    }

    public MarketingConversionItem setExtraInfo3(String extraInfo3) {
        this.extraInfo3 = extraInfo3;
        return this;
    }
    public String getExtraInfo3() {
        return this.extraInfo3;
    }

}
