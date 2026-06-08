// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class WxStockData extends TeaModel {
    // 【批次号】 微信为每个代金券批次分配的唯一id。
    /**
     * <strong>example:</strong>
     * <p>9836588</p>
     */
    @NameInMap("stock_id")
    @Validation(required = true)
    public String stockId;

    // 【批次创建方商户号】 微信为创建方商户分配的商户号
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("stock_creator_mchid")
    @Validation(required = true)
    public String stockCreatorMchid;

    // 【批次名称】 批次名称
    /**
     * <strong>example:</strong>
     * <p>微信支付批次</p>
     */
    @NameInMap("stock_name")
    @Validation(required = true)
    public String stockName;

    // 【批次状态】 批次状态，枚举值：
    // unactivated：未激活
    // audit：审核中
    // running：运行中
    // stoped：已停止
    // paused：暂停发放
    /**
     * <strong>example:</strong>
     * <p>paused</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * <strong>example:</strong>
     * <p>2015-05-20T13:29:35.120+08:00</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 【使用说明】 批次描述信息
    /**
     * <strong>example:</strong>
     * <p>微信支付营销</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
    /**
     * <strong>example:</strong>
     * <p>{         &quot;max_coupons&quot; : 100,         &quot;max_amount&quot; : 5000,         &quot;max_amount_by_day&quot; : 400,         &quot;fixed_normal_coupon&quot; : {           &quot;coupon_amount&quot; : 100,           &quot;transaction_minimum&quot; : 100         }</p>
     */
    @NameInMap("stock_use_rule")
    public StockUseRule stockUseRule;

    // 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * <strong>example:</strong>
     * <p>2015-05-20T13:29:35.120+08:00</p>
     */
    @NameInMap("available_begin_time")
    @Validation(required = true)
    public String availableBeginTime;

    // 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * <strong>example:</strong>
     * <p>2015-05-20T13:29:35.120+08:00</p>
     */
    @NameInMap("available_end_time")
    @Validation(required = true)
    public String availableEndTime;

    // 【已发券或消费金数量】 已发券或消费金数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("distributed_coupons")
    @Validation(required = true)
    public Long distributedCoupons;

    // 【是否无资金流】 是否无资金流。枚举值：
    // true：是
    // false：否
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("no_cash")
    @Validation(required = true)
    public Boolean noCash;

    // 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * <strong>example:</strong>
     * <p>2015-05-20T13:29:35.120+08:00</p>
     */
    @NameInMap("start_time")
    public String startTime;

    // 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
    /**
     * <strong>example:</strong>
     * <p>2015-05-20T13:29:35.120+08:00</p>
     */
    @NameInMap("stop_time")
    public String stopTime;

    // 【减至批次特定信息】 单品优惠特定信息
    /**
     * <strong>example:</strong>
     * <p>{         &quot;single_price_max&quot; : 100,         &quot;cut_to_price&quot; : 80       }</p>
     */
    @NameInMap("cut_to_message")
    public CutToMessage cutToMessage;

    // 【是否单品优惠】 枚举值：
    // true：是
    // false：否
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("singleitem")
    @Validation(required = true)
    public Boolean singleitem;

    // 【批次类型】 批次类型
    // 枚举值：
    // NORMAL：代金券批次
    // DISCOUNT_CUT：立减与折扣
    // OTHER：其他
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("stock_type")
    @Validation(required = true)
    public String stockType;

    // 【卡包ID】 微信卡包ID
    /**
     * <strong>example:</strong>
     * <p>pX2-vjoeC94Nn-r2g5GjDwkfFH7E</p>
     */
    @NameInMap("card_id")
    public String cardId;

    // 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
    // MULTIUSE：消费金
    // 可选取值
    // MULTIUSE:  消费金类型
    /**
     * <strong>example:</strong>
     * <p>MULTIUSE</p>
     */
    @NameInMap("business_type")
    public String businessType;

    // 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
    /**
     * <strong>example:</strong>
     * <p>[         {           &quot;type&quot; : &quot;PROVINCE&quot;,           &quot;province&quot; : &quot;广东省&quot;,           &quot;city&quot; : &quot;深圳市&quot;,           &quot;district&quot; : &quot;南山区&quot;,           &quot;country&quot; : &quot;中国大陆&quot;         }       ]</p>
     */
    @NameInMap("available_region_list")
    public java.util.List<AvailableRegion> availableRegionList;

    // 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
    /**
     * <strong>example:</strong>
     * <p>[         &quot;餐饮&quot;       ]</p>
     */
    @NameInMap("available_industry_list")
    public java.util.List<String> availableIndustryList;

    public static WxStockData build(java.util.Map<String, ?> map) throws Exception {
        WxStockData self = new WxStockData();
        return TeaModel.build(map, self);
    }

    public WxStockData setStockId(String stockId) {
        this.stockId = stockId;
        return this;
    }
    public String getStockId() {
        return this.stockId;
    }

    public WxStockData setStockCreatorMchid(String stockCreatorMchid) {
        this.stockCreatorMchid = stockCreatorMchid;
        return this;
    }
    public String getStockCreatorMchid() {
        return this.stockCreatorMchid;
    }

    public WxStockData setStockName(String stockName) {
        this.stockName = stockName;
        return this;
    }
    public String getStockName() {
        return this.stockName;
    }

    public WxStockData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WxStockData setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public WxStockData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WxStockData setStockUseRule(StockUseRule stockUseRule) {
        this.stockUseRule = stockUseRule;
        return this;
    }
    public StockUseRule getStockUseRule() {
        return this.stockUseRule;
    }

    public WxStockData setAvailableBeginTime(String availableBeginTime) {
        this.availableBeginTime = availableBeginTime;
        return this;
    }
    public String getAvailableBeginTime() {
        return this.availableBeginTime;
    }

    public WxStockData setAvailableEndTime(String availableEndTime) {
        this.availableEndTime = availableEndTime;
        return this;
    }
    public String getAvailableEndTime() {
        return this.availableEndTime;
    }

    public WxStockData setDistributedCoupons(Long distributedCoupons) {
        this.distributedCoupons = distributedCoupons;
        return this;
    }
    public Long getDistributedCoupons() {
        return this.distributedCoupons;
    }

    public WxStockData setNoCash(Boolean noCash) {
        this.noCash = noCash;
        return this;
    }
    public Boolean getNoCash() {
        return this.noCash;
    }

    public WxStockData setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public WxStockData setStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public String getStopTime() {
        return this.stopTime;
    }

    public WxStockData setCutToMessage(CutToMessage cutToMessage) {
        this.cutToMessage = cutToMessage;
        return this;
    }
    public CutToMessage getCutToMessage() {
        return this.cutToMessage;
    }

    public WxStockData setSingleitem(Boolean singleitem) {
        this.singleitem = singleitem;
        return this;
    }
    public Boolean getSingleitem() {
        return this.singleitem;
    }

    public WxStockData setStockType(String stockType) {
        this.stockType = stockType;
        return this;
    }
    public String getStockType() {
        return this.stockType;
    }

    public WxStockData setCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }
    public String getCardId() {
        return this.cardId;
    }

    public WxStockData setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public WxStockData setAvailableRegionList(java.util.List<AvailableRegion> availableRegionList) {
        this.availableRegionList = availableRegionList;
        return this;
    }
    public java.util.List<AvailableRegion> getAvailableRegionList() {
        return this.availableRegionList;
    }

    public WxStockData setAvailableIndustryList(java.util.List<String> availableIndustryList) {
        this.availableIndustryList = availableIndustryList;
        return this;
    }
    public java.util.List<String> getAvailableIndustryList() {
        return this.availableIndustryList;
    }

}
