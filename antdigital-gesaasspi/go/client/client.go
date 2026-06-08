// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
)

/**
 * Model for initing client
 */
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	Socks5NetWork *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
	// 长链接最大空闲时长
	MaxIdleTimeMillis *int `json:"maxIdleTimeMillis,omitempty" xml:"maxIdleTimeMillis,omitempty"`
	// 长链接最大连接时长
	KeepAliveDurationMillis *int `json:"keepAliveDurationMillis,omitempty" xml:"keepAliveDurationMillis,omitempty"`
	// 最大连接数（长链接最大总数）
	MaxRequests *int `json:"maxRequests,omitempty" xml:"maxRequests,omitempty"`
	// 每个目标主机的最大连接数（分主机域名的长链接最大总数
	MaxRequestsPerHost *int `json:"maxRequestsPerHost,omitempty" xml:"maxRequestsPerHost,omitempty"`
}

func (s Config) String() string {
	return tea.Prettify(s)
}

func (s Config) GoString() string {
	return s.String()
}

func (s *Config) SetAccessKeyId(v string) *Config {
	s.AccessKeyId = &v
	return s
}

func (s *Config) SetAccessKeySecret(v string) *Config {
	s.AccessKeySecret = &v
	return s
}

func (s *Config) SetSecurityToken(v string) *Config {
	s.SecurityToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetReadTimeout(v int) *Config {
	s.ReadTimeout = &v
	return s
}

func (s *Config) SetConnectTimeout(v int) *Config {
	s.ConnectTimeout = &v
	return s
}

func (s *Config) SetHttpProxy(v string) *Config {
	s.HttpProxy = &v
	return s
}

func (s *Config) SetHttpsProxy(v string) *Config {
	s.HttpsProxy = &v
	return s
}

func (s *Config) SetEndpoint(v string) *Config {
	s.Endpoint = &v
	return s
}

func (s *Config) SetNoProxy(v string) *Config {
	s.NoProxy = &v
	return s
}

func (s *Config) SetMaxIdleConns(v int) *Config {
	s.MaxIdleConns = &v
	return s
}

func (s *Config) SetUserAgent(v string) *Config {
	s.UserAgent = &v
	return s
}

func (s *Config) SetSocks5Proxy(v string) *Config {
	s.Socks5Proxy = &v
	return s
}

func (s *Config) SetSocks5NetWork(v string) *Config {
	s.Socks5NetWork = &v
	return s
}

func (s *Config) SetMaxIdleTimeMillis(v int) *Config {
	s.MaxIdleTimeMillis = &v
	return s
}

func (s *Config) SetKeepAliveDurationMillis(v int) *Config {
	s.KeepAliveDurationMillis = &v
	return s
}

func (s *Config) SetMaxRequests(v int) *Config {
	s.MaxRequests = &v
	return s
}

func (s *Config) SetMaxRequestsPerHost(v int) *Config {
	s.MaxRequestsPerHost = &v
	return s
}

// 【固定折扣特定信息】
type FixedDiscountCoupon struct {
	// 【最高折扣金额】 最高折扣金额，单位分
	DiscountAmountMax *int64 `json:"discount_amount_max,omitempty" xml:"discount_amount_max,omitempty" require:"true"`
	// 【折扣百分比】 折扣百分比，例如88-八八折
	DiscountPercent *int64 `json:"discount_percent,omitempty" xml:"discount_percent,omitempty" require:"true"`
	// 【门槛】 使用券金额门槛，单位分
	TransactionMinimum *int64 `json:"transaction_minimum,omitempty" xml:"transaction_minimum,omitempty"`
}

func (s FixedDiscountCoupon) String() string {
	return tea.Prettify(s)
}

func (s FixedDiscountCoupon) GoString() string {
	return s.String()
}

func (s *FixedDiscountCoupon) SetDiscountAmountMax(v int64) *FixedDiscountCoupon {
	s.DiscountAmountMax = &v
	return s
}

func (s *FixedDiscountCoupon) SetDiscountPercent(v int64) *FixedDiscountCoupon {
	s.DiscountPercent = &v
	return s
}

func (s *FixedDiscountCoupon) SetTransactionMinimum(v int64) *FixedDiscountCoupon {
	s.TransactionMinimum = &v
	return s
}

// 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
type FixedNormalCoupon struct {
	// 【面额】 面额，单位：分。
	CouponAmount *int64 `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty" require:"true"`
	// 【门槛】 使用券金额门槛，单位：分。
	TransactionMinimum *int64 `json:"transaction_minimum,omitempty" xml:"transaction_minimum,omitempty" require:"true"`
}

func (s FixedNormalCoupon) String() string {
	return tea.Prettify(s)
}

func (s FixedNormalCoupon) GoString() string {
	return s.String()
}

func (s *FixedNormalCoupon) SetCouponAmount(v int64) *FixedNormalCoupon {
	s.CouponAmount = &v
	return s
}

func (s *FixedNormalCoupon) SetTransactionMinimum(v int64) *FixedNormalCoupon {
	s.TransactionMinimum = &v
	return s
}

// 返回体度量
type RultMetric struct {
	// 度量编码
	MetricCode *string `json:"metric_code,omitempty" xml:"metric_code,omitempty" require:"true"`
	// 度量聚合结果
	MetricValue *string `json:"metric_value,omitempty" xml:"metric_value,omitempty" require:"true"`
}

func (s RultMetric) String() string {
	return tea.Prettify(s)
}

func (s RultMetric) GoString() string {
	return s.String()
}

func (s *RultMetric) SetMetricCode(v string) *RultMetric {
	s.MetricCode = &v
	return s
}

func (s *RultMetric) SetMetricValue(v string) *RultMetric {
	s.MetricValue = &v
	return s
}

// 【减至批次特定信息】 单品优惠特定信息
type CutToMessage struct {
	// 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
	SinglePriceMax *int64 `json:"single_price_max,omitempty" xml:"single_price_max,omitempty" require:"true"`
	// 【减至后的优惠单价】 减至后的优惠单价，单位：分。
	CutToPrice *int64 `json:"cut_to_price,omitempty" xml:"cut_to_price,omitempty" require:"true"`
}

func (s CutToMessage) String() string {
	return tea.Prettify(s)
}

func (s CutToMessage) GoString() string {
	return s.String()
}

func (s *CutToMessage) SetSinglePriceMax(v int64) *CutToMessage {
	s.SinglePriceMax = &v
	return s
}

func (s *CutToMessage) SetCutToPrice(v int64) *CutToMessage {
	s.CutToPrice = &v
	return s
}

// 【消费金可用地域】 消费金可用地域
type AvailableRegion struct {
	// 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
	// 可选取值
	// PROVINCE:  地域信息精确到省级
	// CITY:  地域信息精确到市级
	// DISTRICT:  地域信息精确到区级
	// COUNTRY:  地域信息精确到国家级
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 【省】 消费金可用省
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
	// 【市】 消费金可用
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 【区】 消费金可用区
	District *string `json:"district,omitempty" xml:"district,omitempty"`
	// 【国家】 消费金可用国家
	Country *string `json:"country,omitempty" xml:"country,omitempty"`
}

func (s AvailableRegion) String() string {
	return tea.Prettify(s)
}

func (s AvailableRegion) GoString() string {
	return s.String()
}

func (s *AvailableRegion) SetType(v string) *AvailableRegion {
	s.Type = &v
	return s
}

func (s *AvailableRegion) SetProvince(v string) *AvailableRegion {
	s.Province = &v
	return s
}

func (s *AvailableRegion) SetCity(v string) *AvailableRegion {
	s.City = &v
	return s
}

func (s *AvailableRegion) SetDistrict(v string) *AvailableRegion {
	s.District = &v
	return s
}

func (s *AvailableRegion) SetCountry(v string) *AvailableRegion {
	s.Country = &v
	return s
}

// 维度
type Dimension struct {
	// 维度
	Dimension *string `json:"dimension,omitempty" xml:"dimension,omitempty" require:"true"`
	// 维度值
	DimensionValue *string `json:"dimension_value,omitempty" xml:"dimension_value,omitempty" require:"true"`
}

func (s Dimension) String() string {
	return tea.Prettify(s)
}

func (s Dimension) GoString() string {
	return s.String()
}

func (s *Dimension) SetDimension(v string) *Dimension {
	s.Dimension = &v
	return s
}

func (s *Dimension) SetDimensionValue(v string) *Dimension {
	s.DimensionValue = &v
	return s
}

// 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
type StockUseRule struct {
	// 【发放总上限】 最大发券数
	MaxCoupons *int64 `json:"max_coupons,omitempty" xml:"max_coupons,omitempty" require:"true"`
	// 【总预算】 总消耗金额，单位：分。
	MaxAmount *int64 `json:"max_amount,omitempty" xml:"max_amount,omitempty" require:"true"`
	// 【单天发放上限金额】 单天最高消耗金额，单位：分。
	MaxAmountByDay *int64 `json:"max_amount_by_day,omitempty" xml:"max_amount_by_day,omitempty" require:"true"`
	// 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
	FixedNormalCoupon *FixedNormalCoupon `json:"fixed_normal_coupon,omitempty" xml:"fixed_normal_coupon,omitempty" require:"true"`
	// 【单个用户可领个数】 单个用户可领个数
	MaxCouponsPerUser *int64 `json:"max_coupons_per_user,omitempty" xml:"max_coupons_per_user,omitempty" require:"true"`
	// 【券或消费金类型】 券或消费金类型
	// 枚举值：
	// NORMAL：满减券
	// CUT_TO：减至券
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
	// 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
	GoodsTag []*string `json:"goods_tag,omitempty" xml:"goods_tag,omitempty" type:"Repeated"`
	// 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
	// 可选取值
	// MICROAPP:  小程序支付
	// APPPAY:  APP支付
	// PPAY:  免密支付
	// CARD:  刷卡支付
	// FACE:  人脸支付
	// OTHER:  其他支付，公众号、扫码等
	TradeType []*string `json:"trade_type,omitempty" xml:"trade_type,omitempty" type:"Repeated"`
	// 【是否可叠加其他优惠】 枚举值：
	// true：是
	// false：否
	CombineUse *bool `json:"combine_use,omitempty" xml:"combine_use,omitempty"`
	// 【固定折扣特定信息】
	FixedDiscountCoupon *FixedDiscountCoupon `json:"fixed_discount_coupon,omitempty" xml:"fixed_discount_coupon,omitempty"`
}

func (s StockUseRule) String() string {
	return tea.Prettify(s)
}

func (s StockUseRule) GoString() string {
	return s.String()
}

func (s *StockUseRule) SetMaxCoupons(v int64) *StockUseRule {
	s.MaxCoupons = &v
	return s
}

func (s *StockUseRule) SetMaxAmount(v int64) *StockUseRule {
	s.MaxAmount = &v
	return s
}

func (s *StockUseRule) SetMaxAmountByDay(v int64) *StockUseRule {
	s.MaxAmountByDay = &v
	return s
}

func (s *StockUseRule) SetFixedNormalCoupon(v *FixedNormalCoupon) *StockUseRule {
	s.FixedNormalCoupon = v
	return s
}

func (s *StockUseRule) SetMaxCouponsPerUser(v int64) *StockUseRule {
	s.MaxCouponsPerUser = &v
	return s
}

func (s *StockUseRule) SetCouponType(v string) *StockUseRule {
	s.CouponType = &v
	return s
}

func (s *StockUseRule) SetGoodsTag(v []*string) *StockUseRule {
	s.GoodsTag = v
	return s
}

func (s *StockUseRule) SetTradeType(v []*string) *StockUseRule {
	s.TradeType = v
	return s
}

func (s *StockUseRule) SetCombineUse(v bool) *StockUseRule {
	s.CombineUse = &v
	return s
}

func (s *StockUseRule) SetFixedDiscountCoupon(v *FixedDiscountCoupon) *StockUseRule {
	s.FixedDiscountCoupon = v
	return s
}

// 【批次详情】 批次详情
type WxStockData struct {
	// 【批次号】 微信为每个代金券批次分配的唯一id。
	StockId *string `json:"stock_id,omitempty" xml:"stock_id,omitempty" require:"true"`
	// 【批次创建方商户号】 微信为创建方商户分配的商户号
	StockCreatorMchid *string `json:"stock_creator_mchid,omitempty" xml:"stock_creator_mchid,omitempty" require:"true"`
	// 【批次名称】 批次名称
	StockName *string `json:"stock_name,omitempty" xml:"stock_name,omitempty" require:"true"`
	// 【批次状态】 批次状态，枚举值：
	// unactivated：未激活
	// audit：审核中
	// running：运行中
	// stoped：已停止
	// paused：暂停发放
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 【使用说明】 批次描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
	StockUseRule *StockUseRule `json:"stock_use_rule,omitempty" xml:"stock_use_rule,omitempty"`
	// 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
	AvailableBeginTime *string `json:"available_begin_time,omitempty" xml:"available_begin_time,omitempty" require:"true"`
	// 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
	AvailableEndTime *string `json:"available_end_time,omitempty" xml:"available_end_time,omitempty" require:"true"`
	// 【已发券或消费金数量】 已发券或消费金数量
	DistributedCoupons *int64 `json:"distributed_coupons,omitempty" xml:"distributed_coupons,omitempty" require:"true"`
	// 【是否无资金流】 是否无资金流。枚举值：
	// true：是
	// false：否
	NoCash *bool `json:"no_cash,omitempty" xml:"no_cash,omitempty" require:"true"`
	// 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
	StopTime *string `json:"stop_time,omitempty" xml:"stop_time,omitempty"`
	// 【减至批次特定信息】 单品优惠特定信息
	CutToMessage *CutToMessage `json:"cut_to_message,omitempty" xml:"cut_to_message,omitempty"`
	// 【是否单品优惠】 枚举值：
	// true：是
	// false：否
	Singleitem *bool `json:"singleitem,omitempty" xml:"singleitem,omitempty" require:"true"`
	// 【批次类型】 批次类型
	// 枚举值：
	// NORMAL：代金券批次
	// DISCOUNT_CUT：立减与折扣
	// OTHER：其他
	StockType *string `json:"stock_type,omitempty" xml:"stock_type,omitempty" require:"true"`
	// 【卡包ID】 微信卡包ID
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	// 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
	// MULTIUSE：消费金
	// 可选取值
	// MULTIUSE:  消费金类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
	AvailableRegionList []*AvailableRegion `json:"available_region_list,omitempty" xml:"available_region_list,omitempty" type:"Repeated"`
	// 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
	AvailableIndustryList []*string `json:"available_industry_list,omitempty" xml:"available_industry_list,omitempty" type:"Repeated"`
}

func (s WxStockData) String() string {
	return tea.Prettify(s)
}

func (s WxStockData) GoString() string {
	return s.String()
}

func (s *WxStockData) SetStockId(v string) *WxStockData {
	s.StockId = &v
	return s
}

func (s *WxStockData) SetStockCreatorMchid(v string) *WxStockData {
	s.StockCreatorMchid = &v
	return s
}

func (s *WxStockData) SetStockName(v string) *WxStockData {
	s.StockName = &v
	return s
}

func (s *WxStockData) SetStatus(v string) *WxStockData {
	s.Status = &v
	return s
}

func (s *WxStockData) SetCreateTime(v string) *WxStockData {
	s.CreateTime = &v
	return s
}

func (s *WxStockData) SetDescription(v string) *WxStockData {
	s.Description = &v
	return s
}

func (s *WxStockData) SetStockUseRule(v *StockUseRule) *WxStockData {
	s.StockUseRule = v
	return s
}

func (s *WxStockData) SetAvailableBeginTime(v string) *WxStockData {
	s.AvailableBeginTime = &v
	return s
}

func (s *WxStockData) SetAvailableEndTime(v string) *WxStockData {
	s.AvailableEndTime = &v
	return s
}

func (s *WxStockData) SetDistributedCoupons(v int64) *WxStockData {
	s.DistributedCoupons = &v
	return s
}

func (s *WxStockData) SetNoCash(v bool) *WxStockData {
	s.NoCash = &v
	return s
}

func (s *WxStockData) SetStartTime(v string) *WxStockData {
	s.StartTime = &v
	return s
}

func (s *WxStockData) SetStopTime(v string) *WxStockData {
	s.StopTime = &v
	return s
}

func (s *WxStockData) SetCutToMessage(v *CutToMessage) *WxStockData {
	s.CutToMessage = v
	return s
}

func (s *WxStockData) SetSingleitem(v bool) *WxStockData {
	s.Singleitem = &v
	return s
}

func (s *WxStockData) SetStockType(v string) *WxStockData {
	s.StockType = &v
	return s
}

func (s *WxStockData) SetCardId(v string) *WxStockData {
	s.CardId = &v
	return s
}

func (s *WxStockData) SetBusinessType(v string) *WxStockData {
	s.BusinessType = &v
	return s
}

func (s *WxStockData) SetAvailableRegionList(v []*AvailableRegion) *WxStockData {
	s.AvailableRegionList = v
	return s
}

func (s *WxStockData) SetAvailableIndustryList(v []*string) *WxStockData {
	s.AvailableIndustryList = v
	return s
}

// 度量
type Metric struct {
	// 度量编码
	MetricCode *string `json:"metric_code,omitempty" xml:"metric_code,omitempty" require:"true"`
	// 计算列
	MetricColumn *string `json:"metric_column,omitempty" xml:"metric_column,omitempty" require:"true"`
	// 计算方式
	FunctionType *string `json:"function_type,omitempty" xml:"function_type,omitempty"`
}

func (s Metric) String() string {
	return tea.Prettify(s)
}

func (s Metric) GoString() string {
	return s.String()
}

func (s *Metric) SetMetricCode(v string) *Metric {
	s.MetricCode = &v
	return s
}

func (s *Metric) SetMetricColumn(v string) *Metric {
	s.MetricColumn = &v
	return s
}

func (s *Metric) SetFunctionType(v string) *Metric {
	s.FunctionType = &v
	return s
}

// 业务号条件
type BizNoCondition struct {
	// 枚举
	// CITY 城市
	// BLOCK 区县
	// AGE 年龄
	Dimension *string `json:"dimension,omitempty" xml:"dimension,omitempty" require:"true"`
	// 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
	// CITY:区划码
	// BLOCK:区划码（底包暂不支持）
	// AGE:30+、40+、50+（底包暂不支持
	ValueScope []*string `json:"value_scope,omitempty" xml:"value_scope,omitempty" require:"true" type:"Repeated"`
}

func (s BizNoCondition) String() string {
	return tea.Prettify(s)
}

func (s BizNoCondition) GoString() string {
	return s.String()
}

func (s *BizNoCondition) SetDimension(v string) *BizNoCondition {
	s.Dimension = &v
	return s
}

func (s *BizNoCondition) SetValueScope(v []*string) *BizNoCondition {
	s.ValueScope = v
	return s
}

// 批处理结果
type BatchResult struct {
	// 业务号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true" maxLength:"64"`
	// 业务号类型
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"32"`
	// 结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 结果码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
}

func (s BatchResult) String() string {
	return tea.Prettify(s)
}

func (s BatchResult) GoString() string {
	return s.String()
}

func (s *BatchResult) SetBizNo(v string) *BatchResult {
	s.BizNo = &v
	return s
}

func (s *BatchResult) SetBizNoType(v string) *BatchResult {
	s.BizNoType = &v
	return s
}

func (s *BatchResult) SetResult(v string) *BatchResult {
	s.Result = &v
	return s
}

func (s *BatchResult) SetResultCode(v string) *BatchResult {
	s.ResultCode = &v
	return s
}

// 任务详细结果包含任务的统计数据信息
type TaskDetailResult struct {
	// 总数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 成功数量
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数量
	FailCount *int64 `json:"fail_count,omitempty" xml:"fail_count,omitempty"`
	// 处理中数量
	ProcessingCount *int64 `json:"processing_count,omitempty" xml:"processing_count,omitempty"`
	// 当状态为无效时，显示具体的错误信息
	ErrorInfo *string `json:"error_info,omitempty" xml:"error_info,omitempty"`
}

func (s TaskDetailResult) String() string {
	return tea.Prettify(s)
}

func (s TaskDetailResult) GoString() string {
	return s.String()
}

func (s *TaskDetailResult) SetTotalCount(v int64) *TaskDetailResult {
	s.TotalCount = &v
	return s
}

func (s *TaskDetailResult) SetSuccessCount(v int64) *TaskDetailResult {
	s.SuccessCount = &v
	return s
}

func (s *TaskDetailResult) SetFailCount(v int64) *TaskDetailResult {
	s.FailCount = &v
	return s
}

func (s *TaskDetailResult) SetProcessingCount(v int64) *TaskDetailResult {
	s.ProcessingCount = &v
	return s
}

func (s *TaskDetailResult) SetErrorInfo(v string) *TaskDetailResult {
	s.ErrorInfo = &v
	return s
}

// 聚合查询结果
type DwsResult struct {
	// 维度列表
	DimensionList []*Dimension `json:"dimension_list,omitempty" xml:"dimension_list,omitempty" require:"true" type:"Repeated"`
	// 度量列表
	MetricList []*RultMetric `json:"metric_list,omitempty" xml:"metric_list,omitempty" require:"true" type:"Repeated"`
}

func (s DwsResult) String() string {
	return tea.Prettify(s)
}

func (s DwsResult) GoString() string {
	return s.String()
}

func (s *DwsResult) SetDimensionList(v []*Dimension) *DwsResult {
	s.DimensionList = v
	return s
}

func (s *DwsResult) SetMetricList(v []*RultMetric) *DwsResult {
	s.MetricList = v
	return s
}

// 过滤条件
type FilterCondition struct {
	// 过滤列
	FilterColumn *string `json:"filter_column,omitempty" xml:"filter_column,omitempty" require:"true"`
	// 过滤方式
	FilterType *string `json:"filter_type,omitempty" xml:"filter_type,omitempty"`
	// 值列表
	ValueList []*string `json:"value_list,omitempty" xml:"value_list,omitempty" require:"true" type:"Repeated"`
}

func (s FilterCondition) String() string {
	return tea.Prettify(s)
}

func (s FilterCondition) GoString() string {
	return s.String()
}

func (s *FilterCondition) SetFilterColumn(v string) *FilterCondition {
	s.FilterColumn = &v
	return s
}

func (s *FilterCondition) SetFilterType(v string) *FilterCondition {
	s.FilterType = &v
	return s
}

func (s *FilterCondition) SetValueList(v []*string) *FilterCondition {
	s.ValueList = v
	return s
}

// 地址，包含省、市、区(县)
type Address struct {
	// 市级
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true" maxLength:"6" minLength:"6"`
	// 区、县级
	District *string `json:"district,omitempty" xml:"district,omitempty" maxLength:"6" minLength:"6"`
}

func (s Address) String() string {
	return tea.Prettify(s)
}

func (s Address) GoString() string {
	return s.String()
}

func (s *Address) SetCity(v string) *Address {
	s.City = &v
	return s
}

func (s *Address) SetDistrict(v string) *Address {
	s.District = &v
	return s
}

// 发放订单明细
type GrantOrderDetail struct {
	// 券编码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
}

func (s GrantOrderDetail) String() string {
	return tea.Prettify(s)
}

func (s GrantOrderDetail) GoString() string {
	return s.String()
}

func (s *GrantOrderDetail) SetVoucherCode(v string) *GrantOrderDetail {
	s.VoucherCode = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type SubmitAntchainSdsScenedataTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 【场景】约定的场景枚举
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"32"`
	// 【业务号类型】该字段逐步废弃，枚举-PHONE_SHA1，PHONE_MD5
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" maxLength:"32"`
	// 【来源标识】适配客户的来源，可能是客户的任务/AK
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty" maxLength:"32"`
	// 【动态参数】任务动态参数信息
	ExpectCondition []*BizNoCondition `json:"expect_condition,omitempty" xml:"expect_condition,omitempty" type:"Repeated"`
	// 【外部批次号】和任务类型组成唯一键
	OutBatchNo *string `json:"out_batch_no,omitempty" xml:"out_batch_no,omitempty"`
	// 【任务类型】SDS根据类型触发异步处理流程
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty"`
}

func (s SubmitAntchainSdsScenedataTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainSdsScenedataTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetAuthToken(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetProductInstanceId(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetScene(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetBizNoType(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.BizNoType = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetSourceMark(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.SourceMark = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetExpectCondition(v []*BizNoCondition) *SubmitAntchainSdsScenedataTaskRequest {
	s.ExpectCondition = v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetOutBatchNo(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.OutBatchNo = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskRequest) SetTaskType(v string) *SubmitAntchainSdsScenedataTaskRequest {
	s.TaskType = &v
	return s
}

type SubmitAntchainSdsScenedataTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建任务成功后，返回批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
}

func (s SubmitAntchainSdsScenedataTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainSdsScenedataTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainSdsScenedataTaskResponse) SetReqMsgId(v string) *SubmitAntchainSdsScenedataTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskResponse) SetResultCode(v string) *SubmitAntchainSdsScenedataTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskResponse) SetResultMsg(v string) *SubmitAntchainSdsScenedataTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainSdsScenedataTaskResponse) SetBatchNo(v string) *SubmitAntchainSdsScenedataTaskResponse {
	s.BatchNo = &v
	return s
}

type UploadAntchainSdsScenedataFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true" maxLength:"64"`
	// 文件参数
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadAntchainSdsScenedataFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainSdsScenedataFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainSdsScenedataFileRequest) SetAuthToken(v string) *UploadAntchainSdsScenedataFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileRequest) SetProductInstanceId(v string) *UploadAntchainSdsScenedataFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileRequest) SetBatchNo(v string) *UploadAntchainSdsScenedataFileRequest {
	s.BatchNo = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileRequest) SetFileObject(v io.Reader) *UploadAntchainSdsScenedataFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainSdsScenedataFileRequest) SetFileObjectName(v string) *UploadAntchainSdsScenedataFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileRequest) SetFileId(v string) *UploadAntchainSdsScenedataFileRequest {
	s.FileId = &v
	return s
}

type UploadAntchainSdsScenedataFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// batchNo对应的任务状态，上传后，返回RECEIVED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UploadAntchainSdsScenedataFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainSdsScenedataFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainSdsScenedataFileResponse) SetReqMsgId(v string) *UploadAntchainSdsScenedataFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileResponse) SetResultCode(v string) *UploadAntchainSdsScenedataFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileResponse) SetResultMsg(v string) *UploadAntchainSdsScenedataFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainSdsScenedataFileResponse) SetStatus(v string) *UploadAntchainSdsScenedataFileResponse {
	s.Status = &v
	return s
}

type BatchqueryAntchainSdsScenedataTaskresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true" maxLength:"64"`
	// 游标，上一次的最后一条
	Cursor *string `json:"cursor,omitempty" xml:"cursor,omitempty" maxLength:"256"`
	// 本次同步数量
	SyncNum *int64 `json:"sync_num,omitempty" xml:"sync_num,omitempty"`
}

func (s BatchqueryAntchainSdsScenedataTaskresultRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryAntchainSdsScenedataTaskresultRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryAntchainSdsScenedataTaskresultRequest) SetAuthToken(v string) *BatchqueryAntchainSdsScenedataTaskresultRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultRequest) SetProductInstanceId(v string) *BatchqueryAntchainSdsScenedataTaskresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultRequest) SetBatchNo(v string) *BatchqueryAntchainSdsScenedataTaskresultRequest {
	s.BatchNo = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultRequest) SetCursor(v string) *BatchqueryAntchainSdsScenedataTaskresultRequest {
	s.Cursor = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultRequest) SetSyncNum(v int64) *BatchqueryAntchainSdsScenedataTaskresultRequest {
	s.SyncNum = &v
	return s
}

type BatchqueryAntchainSdsScenedataTaskresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0-未开始
	// 1-可继续
	// 2-结束
	SyncStatus *string `json:"sync_status,omitempty" xml:"sync_status,omitempty"`
	// 本次的最后一个游标，保存起来下一次使用
	LastCursor *string `json:"last_cursor,omitempty" xml:"last_cursor,omitempty"`
	// 结果列表
	ResultList []*BatchResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchqueryAntchainSdsScenedataTaskresultResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryAntchainSdsScenedataTaskresultResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetReqMsgId(v string) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetResultCode(v string) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetResultMsg(v string) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetSyncStatus(v string) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.SyncStatus = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetLastCursor(v string) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.LastCursor = &v
	return s
}

func (s *BatchqueryAntchainSdsScenedataTaskresultResponse) SetResultList(v []*BatchResult) *BatchqueryAntchainSdsScenedataTaskresultResponse {
	s.ResultList = v
	return s
}

type QueryAntchainSdsScenedataTaskinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
}

func (s QueryAntchainSdsScenedataTaskinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSdsScenedataTaskinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainSdsScenedataTaskinfoRequest) SetAuthToken(v string) *QueryAntchainSdsScenedataTaskinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoRequest) SetProductInstanceId(v string) *QueryAntchainSdsScenedataTaskinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoRequest) SetBatchNo(v string) *QueryAntchainSdsScenedataTaskinfoRequest {
	s.BatchNo = &v
	return s
}

type QueryAntchainSdsScenedataTaskinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -1-无效，0-待处理，1-处理中，2-处理完成
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
	// 业务日期
	BizDate *string `json:"biz_date,omitempty" xml:"biz_date,omitempty"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 任务类型
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty"`
	// 批次所属租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 来源标识
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty"`
	// 任务创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 批次统计结果信息
	Result *TaskDetailResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAntchainSdsScenedataTaskinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSdsScenedataTaskinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetReqMsgId(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetResultCode(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetResultMsg(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetTaskStatus(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.TaskStatus = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetBizDate(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.BizDate = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetScene(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.Scene = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetTaskType(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.TaskType = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetTenantId(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.TenantId = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetSourceMark(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.SourceMark = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetCreateTime(v string) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryAntchainSdsScenedataTaskinfoResponse) SetResult(v *TaskDetailResult) *QueryAntchainSdsScenedataTaskinfoResponse {
	s.Result = v
	return s
}

type QueryAntchainSdsFavorStocksRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 【分页页码】 页码从0开始，默认第0页
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty" require:"true"`
	// 【分页大小】 分页大小，最大10
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty" require:"true"`
	// 【创建批次的商户号】 批次创建方商户号。
	// 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
	StockCreatorMchid *string `json:"stock_creator_mchid,omitempty" xml:"stock_creator_mchid,omitempty" require:"true"`
	// 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
	// 校验规则：get请求，参数在 url中，需要进行 url 编码传递
	CreateStartTime *string `json:"create_start_time,omitempty" xml:"create_start_time,omitempty"`
	// 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
	// 校验规则：get请求，参数在 url中，需要进行 url 编码传递
	CreateEndTime *string `json:"create_end_time,omitempty" xml:"create_end_time,omitempty"`
	// 【批次状态】 批次状态，枚举值：
	// unactivated：未激活
	// audit：审核中
	// running：运行中
	// stoped：已停止
	// paused：暂停发放
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryAntchainSdsFavorStocksRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSdsFavorStocksRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainSdsFavorStocksRequest) SetAuthToken(v string) *QueryAntchainSdsFavorStocksRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetProductInstanceId(v string) *QueryAntchainSdsFavorStocksRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetOffset(v int64) *QueryAntchainSdsFavorStocksRequest {
	s.Offset = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetLimit(v int64) *QueryAntchainSdsFavorStocksRequest {
	s.Limit = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetStockCreatorMchid(v string) *QueryAntchainSdsFavorStocksRequest {
	s.StockCreatorMchid = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetCreateStartTime(v string) *QueryAntchainSdsFavorStocksRequest {
	s.CreateStartTime = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetCreateEndTime(v string) *QueryAntchainSdsFavorStocksRequest {
	s.CreateEndTime = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksRequest) SetStatus(v string) *QueryAntchainSdsFavorStocksRequest {
	s.Status = &v
	return s
}

type QueryAntchainSdsFavorStocksResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 【批次总数】 经过条件筛选，查询到的批次总数量。
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 【批次详情】 批次详情
	Data []*WxStockData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 【分页大小】 分页大小，最大10
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty"`
	// 【分页页码】 页码从0开始，默认第0页
	Offset *int64 `json:"offset,omitempty" xml:"offset,omitempty"`
}

func (s QueryAntchainSdsFavorStocksResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSdsFavorStocksResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainSdsFavorStocksResponse) SetReqMsgId(v string) *QueryAntchainSdsFavorStocksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetResultCode(v string) *QueryAntchainSdsFavorStocksResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetResultMsg(v string) *QueryAntchainSdsFavorStocksResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetTotalCount(v int64) *QueryAntchainSdsFavorStocksResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetData(v []*WxStockData) *QueryAntchainSdsFavorStocksResponse {
	s.Data = v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetLimit(v int64) *QueryAntchainSdsFavorStocksResponse {
	s.Limit = &v
	return s
}

func (s *QueryAntchainSdsFavorStocksResponse) SetOffset(v int64) *QueryAntchainSdsFavorStocksResponse {
	s.Offset = &v
	return s
}

type DownloadAntchainSdsStockUseflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 格式：yyyy-MM-DD，仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty" require:"true"`
	// 【批次号】单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减
	StockId *string `json:"stock_id,omitempty" xml:"stock_id,omitempty" require:"true"`
}

func (s DownloadAntchainSdsStockUseflowRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadAntchainSdsStockUseflowRequest) GoString() string {
	return s.String()
}

func (s *DownloadAntchainSdsStockUseflowRequest) SetAuthToken(v string) *DownloadAntchainSdsStockUseflowRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowRequest) SetProductInstanceId(v string) *DownloadAntchainSdsStockUseflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowRequest) SetBillDate(v string) *DownloadAntchainSdsStockUseflowRequest {
	s.BillDate = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowRequest) SetStockId(v string) *DownloadAntchainSdsStockUseflowRequest {
	s.StockId = &v
	return s
}

type DownloadAntchainSdsStockUseflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 【下载链接】流水文件下载链接，30s内有效
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 【核销批次账单文件摘要】默认算法SHA1
	StockUseflowHash *string `json:"stock_useflow_hash,omitempty" xml:"stock_useflow_hash,omitempty"`
	// 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
	StockUseflowCount *int64 `json:"stock_useflow_count,omitempty" xml:"stock_useflow_count,omitempty"`
}

func (s DownloadAntchainSdsStockUseflowResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadAntchainSdsStockUseflowResponse) GoString() string {
	return s.String()
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetReqMsgId(v string) *DownloadAntchainSdsStockUseflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetResultCode(v string) *DownloadAntchainSdsStockUseflowResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetResultMsg(v string) *DownloadAntchainSdsStockUseflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetUrl(v string) *DownloadAntchainSdsStockUseflowResponse {
	s.Url = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetStockUseflowHash(v string) *DownloadAntchainSdsStockUseflowResponse {
	s.StockUseflowHash = &v
	return s
}

func (s *DownloadAntchainSdsStockUseflowResponse) SetStockUseflowCount(v int64) *DownloadAntchainSdsStockUseflowResponse {
	s.StockUseflowCount = &v
	return s
}

type DownloadAntchainSdsStockRefundflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 格式yyyy-MM- dd仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty" require:"true"`
	// 单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减。
	StockId *string `json:"stock_id,omitempty" xml:"stock_id,omitempty" require:"true"`
}

func (s DownloadAntchainSdsStockRefundflowRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadAntchainSdsStockRefundflowRequest) GoString() string {
	return s.String()
}

func (s *DownloadAntchainSdsStockRefundflowRequest) SetAuthToken(v string) *DownloadAntchainSdsStockRefundflowRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowRequest) SetProductInstanceId(v string) *DownloadAntchainSdsStockRefundflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowRequest) SetBillDate(v string) *DownloadAntchainSdsStockRefundflowRequest {
	s.BillDate = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowRequest) SetStockId(v string) *DownloadAntchainSdsStockRefundflowRequest {
	s.StockId = &v
	return s
}

type DownloadAntchainSdsStockRefundflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 【下载链接】流水文件下载链接，30s内有效
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 【退款批次账单文件摘要】默认算法SHA1
	StockRefundflowHash *string `json:"stock_refundflow_hash,omitempty" xml:"stock_refundflow_hash,omitempty"`
	// 【退款批次账单记录总条数】记录该批次在请求日期下的退款记录条数
	StockRefundflowCount *int64 `json:"stock_refundflow_count,omitempty" xml:"stock_refundflow_count,omitempty"`
}

func (s DownloadAntchainSdsStockRefundflowResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadAntchainSdsStockRefundflowResponse) GoString() string {
	return s.String()
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetReqMsgId(v string) *DownloadAntchainSdsStockRefundflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetResultCode(v string) *DownloadAntchainSdsStockRefundflowResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetResultMsg(v string) *DownloadAntchainSdsStockRefundflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetUrl(v string) *DownloadAntchainSdsStockRefundflowResponse {
	s.Url = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetStockRefundflowHash(v string) *DownloadAntchainSdsStockRefundflowResponse {
	s.StockRefundflowHash = &v
	return s
}

func (s *DownloadAntchainSdsStockRefundflowResponse) SetStockRefundflowCount(v int64) *DownloadAntchainSdsStockRefundflowResponse {
	s.StockRefundflowCount = &v
	return s
}

type UpdateAntchainSdsScenedataTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 【批次号】submit接口返回的批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 【异步任务上下线】INIT-初始化异步任务，异步任务开始执行，同时可以修改拓展参数，必须先下线才能初始化。INVALID-下线异步任务，停止异步任务执行。传空不修改。一次只能提一个任务状态变更。
	AsyncTaskStatus *string `json:"async_task_status,omitempty" xml:"async_task_status,omitempty" require:"true"`
	// 【拓展参数】下线后，可以修改拓展参数，再次上线后生效。处理该拓展参数的任务，需要对参数做校验，避免参数改动太大，任务恢复异常。
	ExpectCondition []*BizNoCondition `json:"expect_condition,omitempty" xml:"expect_condition,omitempty" type:"Repeated"`
}

func (s UpdateAntchainSdsScenedataTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainSdsScenedataTaskRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntchainSdsScenedataTaskRequest) SetAuthToken(v string) *UpdateAntchainSdsScenedataTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskRequest) SetProductInstanceId(v string) *UpdateAntchainSdsScenedataTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskRequest) SetBatchNo(v string) *UpdateAntchainSdsScenedataTaskRequest {
	s.BatchNo = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskRequest) SetAsyncTaskStatus(v string) *UpdateAntchainSdsScenedataTaskRequest {
	s.AsyncTaskStatus = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskRequest) SetExpectCondition(v []*BizNoCondition) *UpdateAntchainSdsScenedataTaskRequest {
	s.ExpectCondition = v
	return s
}

type UpdateAntchainSdsScenedataTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAntchainSdsScenedataTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainSdsScenedataTaskResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntchainSdsScenedataTaskResponse) SetReqMsgId(v string) *UpdateAntchainSdsScenedataTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskResponse) SetResultCode(v string) *UpdateAntchainSdsScenedataTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntchainSdsScenedataTaskResponse) SetResultMsg(v string) *UpdateAntchainSdsScenedataTaskResponse {
	s.ResultMsg = &v
	return s
}

type CallbackAntdigitalGesaasspiRightsprodStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 券码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 券变更状态
	// V_USE（使用）
	// V_REFUND（退款）
	// V_EXPIRE（过期）
	// V_INVALID（作废）
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s CallbackAntdigitalGesaasspiRightsprodStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalGesaasspiRightsprodStatusRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusRequest) SetAuthToken(v string) *CallbackAntdigitalGesaasspiRightsprodStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusRequest) SetProductInstanceId(v string) *CallbackAntdigitalGesaasspiRightsprodStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusRequest) SetRightsCode(v string) *CallbackAntdigitalGesaasspiRightsprodStatusRequest {
	s.RightsCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusRequest) SetVoucherCode(v string) *CallbackAntdigitalGesaasspiRightsprodStatusRequest {
	s.VoucherCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusRequest) SetStatus(v string) *CallbackAntdigitalGesaasspiRightsprodStatusRequest {
	s.Status = &v
	return s
}

type CallbackAntdigitalGesaasspiRightsprodStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果 success 同步成功
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackAntdigitalGesaasspiRightsprodStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalGesaasspiRightsprodStatusResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusResponse) SetReqMsgId(v string) *CallbackAntdigitalGesaasspiRightsprodStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusResponse) SetResultCode(v string) *CallbackAntdigitalGesaasspiRightsprodStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusResponse) SetResultMsg(v string) *CallbackAntdigitalGesaasspiRightsprodStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodStatusResponse) SetResult(v string) *CallbackAntdigitalGesaasspiRightsprodStatusResponse {
	s.Result = &v
	return s
}

type CallbackAntdigitalGesaasspiRightsprodOperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 券码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 通知ID(幂等)
	NotifyId *string `json:"notify_id,omitempty" xml:"notify_id,omitempty" require:"true"`
	// 业务类型
	// V_REFUND（退款）
	// V_EXPIRE（过期）
	// V_INVALID（作废）
	// V_USE（使用）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 支付订单号
	PayOrderNo *string `json:"pay_order_no,omitempty" xml:"pay_order_no,omitempty"`
	// 券面额
	FaceAmount *string `json:"face_amount,omitempty" xml:"face_amount,omitempty"`
	// 流通金额（核销、退款时 金额）
	FluxAmount *string `json:"flux_amount,omitempty" xml:"flux_amount,omitempty"`
}

func (s CallbackAntdigitalGesaasspiRightsprodOperationRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalGesaasspiRightsprodOperationRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetAuthToken(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetProductInstanceId(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetRightsCode(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.RightsCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetVoucherCode(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.VoucherCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetNotifyId(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.NotifyId = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetBizType(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.BizType = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetPayOrderNo(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.PayOrderNo = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetFaceAmount(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.FaceAmount = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationRequest) SetFluxAmount(v string) *CallbackAntdigitalGesaasspiRightsprodOperationRequest {
	s.FluxAmount = &v
	return s
}

type CallbackAntdigitalGesaasspiRightsprodOperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果
	// success 为同步成功其他均为失败
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackAntdigitalGesaasspiRightsprodOperationResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntdigitalGesaasspiRightsprodOperationResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationResponse) SetReqMsgId(v string) *CallbackAntdigitalGesaasspiRightsprodOperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationResponse) SetResultCode(v string) *CallbackAntdigitalGesaasspiRightsprodOperationResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationResponse) SetResultMsg(v string) *CallbackAntdigitalGesaasspiRightsprodOperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntdigitalGesaasspiRightsprodOperationResponse) SetResult(v string) *CallbackAntdigitalGesaasspiRightsprodOperationResponse {
	s.Result = &v
	return s
}

type PushAntdigitalGesaasspiRightsprodGrantrightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 商户编码
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 发放数量，可根据权益信息grantMulti判断是否可发多张
	GrantNum *int64 `json:"grant_num,omitempty" xml:"grant_num,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
	// 发放扩展信息，如活动ID等信息，暂时可以不传
	GrantInfo *string `json:"grant_info,omitempty" xml:"grant_info,omitempty"`
}

func (s PushAntdigitalGesaasspiRightsprodGrantrightsRequest) String() string {
	return tea.Prettify(s)
}

func (s PushAntdigitalGesaasspiRightsprodGrantrightsRequest) GoString() string {
	return s.String()
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetAuthToken(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.AuthToken = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetProductInstanceId(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetUserId(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.UserId = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetPhoneNumber(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.PhoneNumber = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetMerchantNo(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.MerchantNo = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetRightsCode(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.RightsCode = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetGrantNum(v int64) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.GrantNum = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetOutGrantOrderNo(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.OutGrantOrderNo = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) SetGrantInfo(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsRequest {
	s.GrantInfo = &v
	return s
}

type PushAntdigitalGesaasspiRightsprodGrantrightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发放状态：
	// GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
	GrantStatus *string `json:"grant_status,omitempty" xml:"grant_status,omitempty"`
	// 过期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效时间
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放订单明细数据
	OrderDetails []*GrantOrderDetail `json:"order_details,omitempty" xml:"order_details,omitempty" type:"Repeated"`
}

func (s PushAntdigitalGesaasspiRightsprodGrantrightsResponse) String() string {
	return tea.Prettify(s)
}

func (s PushAntdigitalGesaasspiRightsprodGrantrightsResponse) GoString() string {
	return s.String()
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetReqMsgId(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetResultCode(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.ResultCode = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetResultMsg(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetGrantStatus(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.GrantStatus = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetExpireTime(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.ExpireTime = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetEffectTime(v string) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.EffectTime = &v
	return s
}

func (s *PushAntdigitalGesaasspiRightsprodGrantrightsResponse) SetOrderDetails(v []*GrantOrderDetail) *PushAntdigitalGesaasspiRightsprodGrantrightsResponse {
	s.OrderDetails = v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
	return s
}

type Client struct {
	Endpoint                *string
	RegionId                *string
	AccessKeyId             *string
	AccessKeySecret         *string
	Protocol                *string
	UserAgent               *string
	ReadTimeout             *int
	ConnectTimeout          *int
	HttpProxy               *string
	HttpsProxy              *string
	Socks5Proxy             *string
	Socks5NetWork           *string
	NoProxy                 *string
	MaxIdleConns            *int
	SecurityToken           *string
	MaxIdleTimeMillis       *int
	KeepAliveDurationMillis *int
	MaxRequests             *int
	MaxRequestsPerHost      *int
}

/**
 * Init client with Config
 * @param config config contains the necessary information to create a client
 */
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(tea.ToMap(config))) {
		_err = tea.NewSDKError(map[string]interface{}{
			"code":    "ParameterMissing",
			"message": "'config' can not be unset",
		})
		return _err
	}

	client.AccessKeyId = config.AccessKeyId
	client.AccessKeySecret = config.AccessKeySecret
	client.SecurityToken = config.SecurityToken
	client.Endpoint = config.Endpoint
	client.Protocol = config.Protocol
	client.UserAgent = config.UserAgent
	client.ReadTimeout = util.DefaultNumber(config.ReadTimeout, tea.Int(20000))
	client.ConnectTimeout = util.DefaultNumber(config.ConnectTimeout, tea.Int(20000))
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = util.DefaultNumber(config.MaxIdleConns, tea.Int(60000))
	client.MaxIdleTimeMillis = util.DefaultNumber(config.MaxIdleTimeMillis, tea.Int(5))
	client.KeepAliveDurationMillis = util.DefaultNumber(config.KeepAliveDurationMillis, tea.Int(5000))
	client.MaxRequests = util.DefaultNumber(config.MaxRequests, tea.Int(100))
	client.MaxRequestsPerHost = util.DefaultNumber(config.MaxRequestsPerHost, tea.Int(100))
	return nil
}

/**
 * Encapsulate the request and invoke the network
 * @param action api name
 * @param protocol http or https
 * @param method e.g. GET
 * @param pathname pathname of every api
 * @param request which contains request params
 * @param runtime which controls some details of call api, such as retry times
 * @return the response
 */
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, headers map[string]*string, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":          "retry",
		"readTimeout":        tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":     tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":          tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":         tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":            tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":       tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":  tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDuration":  tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":        tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost": tea.IntValue(client.MaxRequestsPerHost),
		"retry": map[string]interface{}{
			"retryable":   tea.BoolValue(runtime.Autoretry),
			"maxAttempts": tea.IntValue(util.DefaultNumber(runtime.MaxAttempts, tea.Int(3))),
		},
		"backoff": map[string]interface{}{
			"policy": tea.StringValue(util.DefaultString(runtime.BackoffPolicy, tea.String("no"))),
			"period": tea.IntValue(util.DefaultNumber(runtime.BackoffPeriod, tea.Int(1))),
		},
		"ignoreSSL": tea.BoolValue(runtime.IgnoreSSL),
	}

	_resp := make(map[string]interface{})
	for _retryTimes := 0; tea.BoolValue(tea.AllowRetry(_runtime["retry"], tea.Int(_retryTimes))); _retryTimes++ {
		if _retryTimes > 0 {
			_backoffTime := tea.GetBackoffTime(_runtime["backoff"], tea.Int(_retryTimes))
			if tea.IntValue(_backoffTime) > 0 {
				tea.Sleep(_backoffTime)
			}
		}

		_resp, _err = func() (map[string]interface{}, error) {
			request_ := tea.NewRequest()
			request_.Protocol = util.DefaultString(client.Protocol, protocol)
			request_.Method = method
			request_.Pathname = pathname
			request_.Query = map[string]*string{
				"method":           action,
				"version":          version,
				"sign_type":        tea.String("HmacSHA1"),
				"req_time":         antchainutil.GetTimestamp(),
				"req_msg_id":       antchainutil.GetNonce(),
				"access_key":       client.AccessKeyId,
				"base_sdk_version": tea.String("TeaSDK-2.0"),
				"sdk_version":      tea.String("1.5.1"),
				"_prod_code":       tea.String("GESAASSPI"),
				"_prod_channel":    tea.String("default"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("openapi.antchain.antgroup.com")),
				"user-agent": util.GetUserAgent(client.UserAgent),
			}, headers)
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = antchainutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			raw, _err := util.ReadAsString(response_.Body)
			if _err != nil {
				return _result, _err
			}

			obj := util.ParseJSON(raw)
			res, _err := util.AssertAsMap(obj)
			if _err != nil {
				return _result, _err
			}

			resp, _err := util.AssertAsMap(res["response"])
			if _err != nil {
				return _result, _err
			}

			if tea.BoolValue(antchainutil.HasError(raw, client.AccessKeySecret)) {
				_err = tea.NewSDKError(map[string]interface{}{
					"message": resp["result_msg"],
					"data":    resp,
					"code":    resp["result_code"],
				})
				return _result, _err
			}

			_result = resp
			return _result, _err
		}()
		if !tea.BoolValue(tea.Retryable(_err)) {
			break
		}
	}

	return _resp, _err
}

/**
 * Description: 创建任务，获取批次号。
 * Summary: 创建任务，获取批次号。
 */
func (client *Client) SubmitAntchainSdsScenedataTask(request *SubmitAntchainSdsScenedataTaskRequest) (_result *SubmitAntchainSdsScenedataTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainSdsScenedataTaskResponse{}
	_body, _err := client.SubmitAntchainSdsScenedataTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建任务，获取批次号。
 * Summary: 创建任务，获取批次号。
 */
func (client *Client) SubmitAntchainSdsScenedataTaskEx(request *SubmitAntchainSdsScenedataTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainSdsScenedataTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainSdsScenedataTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.task.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批次数据文件上传
 * Summary: 批次数据文件上传
 */
func (client *Client) UploadAntchainSdsScenedataFile(request *UploadAntchainSdsScenedataFileRequest) (_result *UploadAntchainSdsScenedataFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainSdsScenedataFileResponse{}
	_body, _err := client.UploadAntchainSdsScenedataFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批次数据文件上传
 * Summary: 批次数据文件上传
 */
func (client *Client) UploadAntchainSdsScenedataFileEx(request *UploadAntchainSdsScenedataFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainSdsScenedataFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.sds.scenedata.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadAntchainSdsScenedataFileResponse := &UploadAntchainSdsScenedataFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainSdsScenedataFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntchainSdsScenedataFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 任务结果查询
 * Summary: 任务结果查询
 */
func (client *Client) BatchqueryAntchainSdsScenedataTaskresult(request *BatchqueryAntchainSdsScenedataTaskresultRequest) (_result *BatchqueryAntchainSdsScenedataTaskresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryAntchainSdsScenedataTaskresultResponse{}
	_body, _err := client.BatchqueryAntchainSdsScenedataTaskresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 任务结果查询
 * Summary: 任务结果查询
 */
func (client *Client) BatchqueryAntchainSdsScenedataTaskresultEx(request *BatchqueryAntchainSdsScenedataTaskresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryAntchainSdsScenedataTaskresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryAntchainSdsScenedataTaskresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskresult.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 通过批次号查询任务详细信息
 */
func (client *Client) QueryAntchainSdsScenedataTaskinfo(request *QueryAntchainSdsScenedataTaskinfoRequest) (_result *QueryAntchainSdsScenedataTaskinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainSdsScenedataTaskinfoResponse{}
	_body, _err := client.QueryAntchainSdsScenedataTaskinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 通过批次号查询任务详细信息
 */
func (client *Client) QueryAntchainSdsScenedataTaskinfoEx(request *QueryAntchainSdsScenedataTaskinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainSdsScenedataTaskinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainSdsScenedataTaskinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
 * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
 */
func (client *Client) QueryAntchainSdsFavorStocks(request *QueryAntchainSdsFavorStocksRequest) (_result *QueryAntchainSdsFavorStocksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainSdsFavorStocksResponse{}
	_body, _err := client.QueryAntchainSdsFavorStocksEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
 * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
 */
func (client *Client) QueryAntchainSdsFavorStocksEx(request *QueryAntchainSdsFavorStocksRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainSdsFavorStocksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainSdsFavorStocksResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.favor.stocks.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 微信核销账单接口
 * Summary: 微信核销账单接口
 */
func (client *Client) DownloadAntchainSdsStockUseflow(request *DownloadAntchainSdsStockUseflowRequest) (_result *DownloadAntchainSdsStockUseflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadAntchainSdsStockUseflowResponse{}
	_body, _err := client.DownloadAntchainSdsStockUseflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 微信核销账单接口
 * Summary: 微信核销账单接口
 */
func (client *Client) DownloadAntchainSdsStockUseflowEx(request *DownloadAntchainSdsStockUseflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadAntchainSdsStockUseflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadAntchainSdsStockUseflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.stock.useflow.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 微信退款账单接口
 * Summary: 微信退款账单接口
 */
func (client *Client) DownloadAntchainSdsStockRefundflow(request *DownloadAntchainSdsStockRefundflowRequest) (_result *DownloadAntchainSdsStockRefundflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadAntchainSdsStockRefundflowResponse{}
	_body, _err := client.DownloadAntchainSdsStockRefundflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 微信退款账单接口
 * Summary: 微信退款账单接口
 */
func (client *Client) DownloadAntchainSdsStockRefundflowEx(request *DownloadAntchainSdsStockRefundflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadAntchainSdsStockRefundflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadAntchainSdsStockRefundflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.stock.refundflow.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
 * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
 */
func (client *Client) UpdateAntchainSdsScenedataTask(request *UpdateAntchainSdsScenedataTaskRequest) (_result *UpdateAntchainSdsScenedataTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntchainSdsScenedataTaskResponse{}
	_body, _err := client.UpdateAntchainSdsScenedataTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
 * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
 */
func (client *Client) UpdateAntchainSdsScenedataTaskEx(request *UpdateAntchainSdsScenedataTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntchainSdsScenedataTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntchainSdsScenedataTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.task.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益中心券状态变更回调通知
 * Summary: 权益中心券状态变更回调通知
 */
func (client *Client) CallbackAntdigitalGesaasspiRightsprodStatus(request *CallbackAntdigitalGesaasspiRightsprodStatusRequest) (_result *CallbackAntdigitalGesaasspiRightsprodStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntdigitalGesaasspiRightsprodStatusResponse{}
	_body, _err := client.CallbackAntdigitalGesaasspiRightsprodStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益中心券状态变更回调通知
 * Summary: 权益中心券状态变更回调通知
 */
func (client *Client) CallbackAntdigitalGesaasspiRightsprodStatusEx(request *CallbackAntdigitalGesaasspiRightsprodStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntdigitalGesaasspiRightsprodStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntdigitalGesaasspiRightsprodStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.status.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 券操作回调通知
 * Summary: 券操作回调通知
 */
func (client *Client) CallbackAntdigitalGesaasspiRightsprodOperation(request *CallbackAntdigitalGesaasspiRightsprodOperationRequest) (_result *CallbackAntdigitalGesaasspiRightsprodOperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntdigitalGesaasspiRightsprodOperationResponse{}
	_body, _err := client.CallbackAntdigitalGesaasspiRightsprodOperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 券操作回调通知
 * Summary: 券操作回调通知
 */
func (client *Client) CallbackAntdigitalGesaasspiRightsprodOperationEx(request *CallbackAntdigitalGesaasspiRightsprodOperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntdigitalGesaasspiRightsprodOperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntdigitalGesaasspiRightsprodOperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.operation.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益供应商权益发放spi
 * Summary: 权益供应商权益发放spi
 */
func (client *Client) PushAntdigitalGesaasspiRightsprodGrantrights(request *PushAntdigitalGesaasspiRightsprodGrantrightsRequest) (_result *PushAntdigitalGesaasspiRightsprodGrantrightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushAntdigitalGesaasspiRightsprodGrantrightsResponse{}
	_body, _err := client.PushAntdigitalGesaasspiRightsprodGrantrightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益供应商权益发放spi
 * Summary: 权益供应商权益发放spi
 */
func (client *Client) PushAntdigitalGesaasspiRightsprodGrantrightsEx(request *PushAntdigitalGesaasspiRightsprodGrantrightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushAntdigitalGesaasspiRightsprodGrantrightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushAntdigitalGesaasspiRightsprodGrantrightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.grantrights.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
