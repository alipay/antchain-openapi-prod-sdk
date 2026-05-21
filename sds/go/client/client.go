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

type JudgeCrowdPrefermentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 业务号类型：1-手机号，2-支付宝用户id
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true"`
	// 加密方式：0-不加密，1-SHA1，2-MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// json结构，可以传递自定义参数
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty" maxLength:"512"`
}

func (s JudgeCrowdPrefermentRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeCrowdPrefermentRequest) GoString() string {
	return s.String()
}

func (s *JudgeCrowdPrefermentRequest) SetAuthToken(v string) *JudgeCrowdPrefermentRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetProductInstanceId(v string) *JudgeCrowdPrefermentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetBizNo(v string) *JudgeCrowdPrefermentRequest {
	s.BizNo = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetBizNoType(v string) *JudgeCrowdPrefermentRequest {
	s.BizNoType = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetEncryptType(v string) *JudgeCrowdPrefermentRequest {
	s.EncryptType = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetProperties(v string) *JudgeCrowdPrefermentRequest {
	s.Properties = &v
	return s
}

type JudgeCrowdPrefermentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否优待群体：YES-是，NO-否
	IsPreferment *string `json:"is_preferment,omitempty" xml:"is_preferment,omitempty"`
}

func (s JudgeCrowdPrefermentResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeCrowdPrefermentResponse) GoString() string {
	return s.String()
}

func (s *JudgeCrowdPrefermentResponse) SetReqMsgId(v string) *JudgeCrowdPrefermentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetResultCode(v string) *JudgeCrowdPrefermentResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetResultMsg(v string) *JudgeCrowdPrefermentResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetIsPreferment(v string) *JudgeCrowdPrefermentResponse {
	s.IsPreferment = &v
	return s
}

type SubmitScenedataTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 约定的场景枚举
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"32"`
	// 枚举
	// PHONE_SHA1
	// PHONE_MD5
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"32"`
	// 适配客户的来源
	// 可能是客户的任务/AK
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty" maxLength:"32"`
	// 业务号预期条件
	ExpectCondition []*BizNoCondition `json:"expect_condition,omitempty" xml:"expect_condition,omitempty" type:"Repeated"`
}

func (s SubmitScenedataTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitScenedataTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitScenedataTaskRequest) SetAuthToken(v string) *SubmitScenedataTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetProductInstanceId(v string) *SubmitScenedataTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetScene(v string) *SubmitScenedataTaskRequest {
	s.Scene = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetBizNoType(v string) *SubmitScenedataTaskRequest {
	s.BizNoType = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetSourceMark(v string) *SubmitScenedataTaskRequest {
	s.SourceMark = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetExpectCondition(v []*BizNoCondition) *SubmitScenedataTaskRequest {
	s.ExpectCondition = v
	return s
}

type SubmitScenedataTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建任务成功后，返回批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
}

func (s SubmitScenedataTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitScenedataTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitScenedataTaskResponse) SetReqMsgId(v string) *SubmitScenedataTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetResultCode(v string) *SubmitScenedataTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetResultMsg(v string) *SubmitScenedataTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetBatchNo(v string) *SubmitScenedataTaskResponse {
	s.BatchNo = &v
	return s
}

type UploadScenedataFileRequest struct {
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

func (s UploadScenedataFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadScenedataFileRequest) GoString() string {
	return s.String()
}

func (s *UploadScenedataFileRequest) SetAuthToken(v string) *UploadScenedataFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadScenedataFileRequest) SetProductInstanceId(v string) *UploadScenedataFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadScenedataFileRequest) SetBatchNo(v string) *UploadScenedataFileRequest {
	s.BatchNo = &v
	return s
}

func (s *UploadScenedataFileRequest) SetFileObject(v io.Reader) *UploadScenedataFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadScenedataFileRequest) SetFileObjectName(v string) *UploadScenedataFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadScenedataFileRequest) SetFileId(v string) *UploadScenedataFileRequest {
	s.FileId = &v
	return s
}

type UploadScenedataFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// batchNo对应的任务状态，上传后，返回RECEIVED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UploadScenedataFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadScenedataFileResponse) GoString() string {
	return s.String()
}

func (s *UploadScenedataFileResponse) SetReqMsgId(v string) *UploadScenedataFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadScenedataFileResponse) SetResultCode(v string) *UploadScenedataFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadScenedataFileResponse) SetResultMsg(v string) *UploadScenedataFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadScenedataFileResponse) SetStatus(v string) *UploadScenedataFileResponse {
	s.Status = &v
	return s
}

type BatchqueryScenedataTaskresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true" maxLength:"64"`
	// 游标，上一次的最后一条
	Cursor *string `json:"cursor,omitempty" xml:"cursor,omitempty" maxLength:"256"`
	// 本次同步数量
	SyncNum *int64 `json:"sync_num,omitempty" xml:"sync_num,omitempty" maximum:"100"`
}

func (s BatchqueryScenedataTaskresultRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryScenedataTaskresultRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryScenedataTaskresultRequest) SetAuthToken(v string) *BatchqueryScenedataTaskresultRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetProductInstanceId(v string) *BatchqueryScenedataTaskresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetBatchNo(v string) *BatchqueryScenedataTaskresultRequest {
	s.BatchNo = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetCursor(v string) *BatchqueryScenedataTaskresultRequest {
	s.Cursor = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetSyncNum(v int64) *BatchqueryScenedataTaskresultRequest {
	s.SyncNum = &v
	return s
}

type BatchqueryScenedataTaskresultResponse struct {
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

func (s BatchqueryScenedataTaskresultResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryScenedataTaskresultResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryScenedataTaskresultResponse) SetReqMsgId(v string) *BatchqueryScenedataTaskresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultCode(v string) *BatchqueryScenedataTaskresultResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultMsg(v string) *BatchqueryScenedataTaskresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetSyncStatus(v string) *BatchqueryScenedataTaskresultResponse {
	s.SyncStatus = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetLastCursor(v string) *BatchqueryScenedataTaskresultResponse {
	s.LastCursor = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultList(v []*BatchResult) *BatchqueryScenedataTaskresultResponse {
	s.ResultList = v
	return s
}

type QueryScenedataOnlineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号，根据biz_no_type修改类型
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true" maxLength:"256"`
	// 业务号类型
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"64"`
	// 场景，根据此参数路由适配到不同数据源
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"32"`
	// 来源标识
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty" maxLength:"32"`
	// 条件，目前只支持IN的逻辑
	Condition *BizNoCondition `json:"condition,omitempty" xml:"condition,omitempty"`
}

func (s QueryScenedataOnlineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataOnlineRequest) GoString() string {
	return s.String()
}

func (s *QueryScenedataOnlineRequest) SetAuthToken(v string) *QueryScenedataOnlineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetProductInstanceId(v string) *QueryScenedataOnlineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetBizNo(v string) *QueryScenedataOnlineRequest {
	s.BizNo = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetBizNoType(v string) *QueryScenedataOnlineRequest {
	s.BizNoType = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetScene(v string) *QueryScenedataOnlineRequest {
	s.Scene = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetSourceMark(v string) *QueryScenedataOnlineRequest {
	s.SourceMark = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetCondition(v *BizNoCondition) *QueryScenedataOnlineRequest {
	s.Condition = v
	return s
}

type QueryScenedataOnlineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果字段，可以是Y/程度值/自定义加密串
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryScenedataOnlineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataOnlineResponse) GoString() string {
	return s.String()
}

func (s *QueryScenedataOnlineResponse) SetReqMsgId(v string) *QueryScenedataOnlineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResultCode(v string) *QueryScenedataOnlineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResultMsg(v string) *QueryScenedataOnlineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResult(v string) *QueryScenedataOnlineResponse {
	s.Result = &v
	return s
}

type QueryScenedataTaskinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
}

func (s QueryScenedataTaskinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataTaskinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryScenedataTaskinfoRequest) SetAuthToken(v string) *QueryScenedataTaskinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScenedataTaskinfoRequest) SetProductInstanceId(v string) *QueryScenedataTaskinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScenedataTaskinfoRequest) SetBatchNo(v string) *QueryScenedataTaskinfoRequest {
	s.BatchNo = &v
	return s
}

type QueryScenedataTaskinfoResponse struct {
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

func (s QueryScenedataTaskinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataTaskinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryScenedataTaskinfoResponse) SetReqMsgId(v string) *QueryScenedataTaskinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResultCode(v string) *QueryScenedataTaskinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResultMsg(v string) *QueryScenedataTaskinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTaskStatus(v string) *QueryScenedataTaskinfoResponse {
	s.TaskStatus = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetBizDate(v string) *QueryScenedataTaskinfoResponse {
	s.BizDate = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetScene(v string) *QueryScenedataTaskinfoResponse {
	s.Scene = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTaskType(v string) *QueryScenedataTaskinfoResponse {
	s.TaskType = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTenantId(v string) *QueryScenedataTaskinfoResponse {
	s.TenantId = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetSourceMark(v string) *QueryScenedataTaskinfoResponse {
	s.SourceMark = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetCreateTime(v string) *QueryScenedataTaskinfoResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResult(v *TaskDetailResult) *QueryScenedataTaskinfoResponse {
	s.Result = v
	return s
}

type QueryScenedataDwsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 维度列表
	DimensionList []*string `json:"dimension_list,omitempty" xml:"dimension_list,omitempty" require:"true" type:"Repeated"`
	// 度量列表
	MetricList []*Metric `json:"metric_list,omitempty" xml:"metric_list,omitempty" require:"true" type:"Repeated"`
	// 过滤条件列表
	FilterConditionList []*FilterCondition `json:"filter_condition_list,omitempty" xml:"filter_condition_list,omitempty" type:"Repeated"`
	// 页码,默认1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数量,默认50
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryScenedataDwsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataDwsRequest) GoString() string {
	return s.String()
}

func (s *QueryScenedataDwsRequest) SetAuthToken(v string) *QueryScenedataDwsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScenedataDwsRequest) SetProductInstanceId(v string) *QueryScenedataDwsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScenedataDwsRequest) SetBatchNo(v string) *QueryScenedataDwsRequest {
	s.BatchNo = &v
	return s
}

func (s *QueryScenedataDwsRequest) SetBizType(v string) *QueryScenedataDwsRequest {
	s.BizType = &v
	return s
}

func (s *QueryScenedataDwsRequest) SetDimensionList(v []*string) *QueryScenedataDwsRequest {
	s.DimensionList = v
	return s
}

func (s *QueryScenedataDwsRequest) SetMetricList(v []*Metric) *QueryScenedataDwsRequest {
	s.MetricList = v
	return s
}

func (s *QueryScenedataDwsRequest) SetFilterConditionList(v []*FilterCondition) *QueryScenedataDwsRequest {
	s.FilterConditionList = v
	return s
}

func (s *QueryScenedataDwsRequest) SetPageNum(v int64) *QueryScenedataDwsRequest {
	s.PageNum = &v
	return s
}

func (s *QueryScenedataDwsRequest) SetPageSize(v int64) *QueryScenedataDwsRequest {
	s.PageSize = &v
	return s
}

type QueryScenedataDwsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 结果列表
	ResultList []*DwsResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s QueryScenedataDwsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataDwsResponse) GoString() string {
	return s.String()
}

func (s *QueryScenedataDwsResponse) SetReqMsgId(v string) *QueryScenedataDwsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetResultCode(v string) *QueryScenedataDwsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetResultMsg(v string) *QueryScenedataDwsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetTotalSize(v int64) *QueryScenedataDwsResponse {
	s.TotalSize = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetPageNum(v int64) *QueryScenedataDwsResponse {
	s.PageNum = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetPageSize(v int64) *QueryScenedataDwsResponse {
	s.PageSize = &v
	return s
}

func (s *QueryScenedataDwsResponse) SetResultList(v []*DwsResult) *QueryScenedataDwsResponse {
	s.ResultList = v
	return s
}

type QueryFavorStocksRequest struct {
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

func (s QueryFavorStocksRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFavorStocksRequest) GoString() string {
	return s.String()
}

func (s *QueryFavorStocksRequest) SetAuthToken(v string) *QueryFavorStocksRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFavorStocksRequest) SetProductInstanceId(v string) *QueryFavorStocksRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFavorStocksRequest) SetOffset(v int64) *QueryFavorStocksRequest {
	s.Offset = &v
	return s
}

func (s *QueryFavorStocksRequest) SetLimit(v int64) *QueryFavorStocksRequest {
	s.Limit = &v
	return s
}

func (s *QueryFavorStocksRequest) SetStockCreatorMchid(v string) *QueryFavorStocksRequest {
	s.StockCreatorMchid = &v
	return s
}

func (s *QueryFavorStocksRequest) SetCreateStartTime(v string) *QueryFavorStocksRequest {
	s.CreateStartTime = &v
	return s
}

func (s *QueryFavorStocksRequest) SetCreateEndTime(v string) *QueryFavorStocksRequest {
	s.CreateEndTime = &v
	return s
}

func (s *QueryFavorStocksRequest) SetStatus(v string) *QueryFavorStocksRequest {
	s.Status = &v
	return s
}

type QueryFavorStocksResponse struct {
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

func (s QueryFavorStocksResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFavorStocksResponse) GoString() string {
	return s.String()
}

func (s *QueryFavorStocksResponse) SetReqMsgId(v string) *QueryFavorStocksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFavorStocksResponse) SetResultCode(v string) *QueryFavorStocksResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFavorStocksResponse) SetResultMsg(v string) *QueryFavorStocksResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFavorStocksResponse) SetTotalCount(v int64) *QueryFavorStocksResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryFavorStocksResponse) SetData(v []*WxStockData) *QueryFavorStocksResponse {
	s.Data = v
	return s
}

func (s *QueryFavorStocksResponse) SetLimit(v int64) *QueryFavorStocksResponse {
	s.Limit = &v
	return s
}

func (s *QueryFavorStocksResponse) SetOffset(v int64) *QueryFavorStocksResponse {
	s.Offset = &v
	return s
}

type DownloadStockUseflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 格式：yyyy-MM-DD，仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty" require:"true"`
	// 【批次号】单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减
	StockId *string `json:"stock_id,omitempty" xml:"stock_id,omitempty" require:"true"`
}

func (s DownloadStockUseflowRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadStockUseflowRequest) GoString() string {
	return s.String()
}

func (s *DownloadStockUseflowRequest) SetAuthToken(v string) *DownloadStockUseflowRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadStockUseflowRequest) SetProductInstanceId(v string) *DownloadStockUseflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadStockUseflowRequest) SetBillDate(v string) *DownloadStockUseflowRequest {
	s.BillDate = &v
	return s
}

func (s *DownloadStockUseflowRequest) SetStockId(v string) *DownloadStockUseflowRequest {
	s.StockId = &v
	return s
}

type DownloadStockUseflowResponse struct {
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

func (s DownloadStockUseflowResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadStockUseflowResponse) GoString() string {
	return s.String()
}

func (s *DownloadStockUseflowResponse) SetReqMsgId(v string) *DownloadStockUseflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadStockUseflowResponse) SetResultCode(v string) *DownloadStockUseflowResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadStockUseflowResponse) SetResultMsg(v string) *DownloadStockUseflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadStockUseflowResponse) SetUrl(v string) *DownloadStockUseflowResponse {
	s.Url = &v
	return s
}

func (s *DownloadStockUseflowResponse) SetStockUseflowHash(v string) *DownloadStockUseflowResponse {
	s.StockUseflowHash = &v
	return s
}

func (s *DownloadStockUseflowResponse) SetStockUseflowCount(v int64) *DownloadStockUseflowResponse {
	s.StockUseflowCount = &v
	return s
}

type DownloadStockRefundflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 格式yyyy-MM- dd仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
	BillDate *string `json:"bill_date,omitempty" xml:"bill_date,omitempty" require:"true"`
	// 单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减。
	StockId *string `json:"stock_id,omitempty" xml:"stock_id,omitempty" require:"true"`
}

func (s DownloadStockRefundflowRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadStockRefundflowRequest) GoString() string {
	return s.String()
}

func (s *DownloadStockRefundflowRequest) SetAuthToken(v string) *DownloadStockRefundflowRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadStockRefundflowRequest) SetProductInstanceId(v string) *DownloadStockRefundflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadStockRefundflowRequest) SetBillDate(v string) *DownloadStockRefundflowRequest {
	s.BillDate = &v
	return s
}

func (s *DownloadStockRefundflowRequest) SetStockId(v string) *DownloadStockRefundflowRequest {
	s.StockId = &v
	return s
}

type DownloadStockRefundflowResponse struct {
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

func (s DownloadStockRefundflowResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadStockRefundflowResponse) GoString() string {
	return s.String()
}

func (s *DownloadStockRefundflowResponse) SetReqMsgId(v string) *DownloadStockRefundflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadStockRefundflowResponse) SetResultCode(v string) *DownloadStockRefundflowResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadStockRefundflowResponse) SetResultMsg(v string) *DownloadStockRefundflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadStockRefundflowResponse) SetUrl(v string) *DownloadStockRefundflowResponse {
	s.Url = &v
	return s
}

func (s *DownloadStockRefundflowResponse) SetStockRefundflowHash(v string) *DownloadStockRefundflowResponse {
	s.StockRefundflowHash = &v
	return s
}

func (s *DownloadStockRefundflowResponse) SetStockRefundflowCount(v int64) *DownloadStockRefundflowResponse {
	s.StockRefundflowCount = &v
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
				"sdk_version":      tea.String("1.6.0"),
				"_prod_code":       tea.String("SDS"),
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
 * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
 * Summary: 优待人群判断
 */
func (client *Client) JudgeCrowdPreferment(request *JudgeCrowdPrefermentRequest) (_result *JudgeCrowdPrefermentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeCrowdPrefermentResponse{}
	_body, _err := client.JudgeCrowdPrefermentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
 * Summary: 优待人群判断
 */
func (client *Client) JudgeCrowdPrefermentEx(request *JudgeCrowdPrefermentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeCrowdPrefermentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeCrowdPrefermentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.crowd.preferment.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
 * Summary: 场景数据批处理任务提交
 */
func (client *Client) SubmitScenedataTask(request *SubmitScenedataTaskRequest) (_result *SubmitScenedataTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitScenedataTaskResponse{}
	_body, _err := client.SubmitScenedataTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
 * Summary: 场景数据批处理任务提交
 */
func (client *Client) SubmitScenedataTaskEx(request *SubmitScenedataTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitScenedataTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitScenedataTaskResponse{}
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
func (client *Client) UploadScenedataFile(request *UploadScenedataFileRequest) (_result *UploadScenedataFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadScenedataFileResponse{}
	_body, _err := client.UploadScenedataFileEx(request, headers, runtime)
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
func (client *Client) UploadScenedataFileEx(request *UploadScenedataFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadScenedataFileResponse, _err error) {
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
			uploadScenedataFileResponse := &UploadScenedataFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadScenedataFileResponse
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
	_result = &UploadScenedataFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
 * Summary: 场景数据任务结果批量查询
 */
func (client *Client) BatchqueryScenedataTaskresult(request *BatchqueryScenedataTaskresultRequest) (_result *BatchqueryScenedataTaskresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryScenedataTaskresultResponse{}
	_body, _err := client.BatchqueryScenedataTaskresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
 * Summary: 场景数据任务结果批量查询
 */
func (client *Client) BatchqueryScenedataTaskresultEx(request *BatchqueryScenedataTaskresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryScenedataTaskresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryScenedataTaskresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskresult.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景数据在线查询，仅支持单条匹配
 * Summary: 场景数据在线查询
 */
func (client *Client) QueryScenedataOnline(request *QueryScenedataOnlineRequest) (_result *QueryScenedataOnlineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScenedataOnlineResponse{}
	_body, _err := client.QueryScenedataOnlineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景数据在线查询，仅支持单条匹配
 * Summary: 场景数据在线查询
 */
func (client *Client) QueryScenedataOnlineEx(request *QueryScenedataOnlineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScenedataOnlineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScenedataOnlineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.online.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 批次任务信息查询
 */
func (client *Client) QueryScenedataTaskinfo(request *QueryScenedataTaskinfoRequest) (_result *QueryScenedataTaskinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScenedataTaskinfoResponse{}
	_body, _err := client.QueryScenedataTaskinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 批次任务信息查询
 */
func (client *Client) QueryScenedataTaskinfoEx(request *QueryScenedataTaskinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScenedataTaskinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScenedataTaskinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批次计算结果聚合，任务为ready状态时，返回分页列表数据
 * Summary: 批次结果聚合查询
 */
func (client *Client) QueryScenedataDws(request *QueryScenedataDwsRequest) (_result *QueryScenedataDwsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScenedataDwsResponse{}
	_body, _err := client.QueryScenedataDwsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批次计算结果聚合，任务为ready状态时，返回分页列表数据
 * Summary: 批次结果聚合查询
 */
func (client *Client) QueryScenedataDwsEx(request *QueryScenedataDwsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScenedataDwsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScenedataDwsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.dws.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryFavorStocks(request *QueryFavorStocksRequest) (_result *QueryFavorStocksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFavorStocksResponse{}
	_body, _err := client.QueryFavorStocksEx(request, headers, runtime)
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
func (client *Client) QueryFavorStocksEx(request *QueryFavorStocksRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFavorStocksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFavorStocksResponse{}
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
func (client *Client) DownloadStockUseflow(request *DownloadStockUseflowRequest) (_result *DownloadStockUseflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadStockUseflowResponse{}
	_body, _err := client.DownloadStockUseflowEx(request, headers, runtime)
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
func (client *Client) DownloadStockUseflowEx(request *DownloadStockUseflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadStockUseflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadStockUseflowResponse{}
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
func (client *Client) DownloadStockRefundflow(request *DownloadStockRefundflowRequest) (_result *DownloadStockRefundflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadStockRefundflowResponse{}
	_body, _err := client.DownloadStockRefundflowEx(request, headers, runtime)
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
func (client *Client) DownloadStockRefundflowEx(request *DownloadStockRefundflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadStockRefundflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadStockRefundflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.stock.refundflow.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
