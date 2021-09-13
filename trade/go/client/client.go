// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
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

// 商品属性结构
type CommodityAttribute struct {
	// 属性编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 属性名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 默认值
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty" require:"true"`
	// 属性值类型，离散值：DISCRETE，数值：NUMBER
	ValueType *string `json:"value_type,omitempty" xml:"value_type,omitempty" require:"true"`
	// 当是离散值类型时，为多个离散值逗号分隔
	// 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
	ValueRange *string `json:"value_range,omitempty" xml:"value_range,omitempty" require:"true"`
	// 展示类型
	DisplayType *string `json:"display_type,omitempty" xml:"display_type,omitempty" require:"true"`
	// 提示文案
	Tips *string `json:"tips,omitempty" xml:"tips,omitempty" require:"true"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
}

func (s CommodityAttribute) String() string {
	return tea.Prettify(s)
}

func (s CommodityAttribute) GoString() string {
	return s.String()
}

func (s *CommodityAttribute) SetCode(v string) *CommodityAttribute {
	s.Code = &v
	return s
}

func (s *CommodityAttribute) SetName(v string) *CommodityAttribute {
	s.Name = &v
	return s
}

func (s *CommodityAttribute) SetDefaultValue(v string) *CommodityAttribute {
	s.DefaultValue = &v
	return s
}

func (s *CommodityAttribute) SetValueType(v string) *CommodityAttribute {
	s.ValueType = &v
	return s
}

func (s *CommodityAttribute) SetValueRange(v string) *CommodityAttribute {
	s.ValueRange = &v
	return s
}

func (s *CommodityAttribute) SetDisplayType(v string) *CommodityAttribute {
	s.DisplayType = &v
	return s
}

func (s *CommodityAttribute) SetTips(v string) *CommodityAttribute {
	s.Tips = &v
	return s
}

func (s *CommodityAttribute) SetUnit(v string) *CommodityAttribute {
	s.Unit = &v
	return s
}

// 套餐内商品订单结构
type ComboCommodityOrder struct {
	// 商品编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 实例ID列表
	InstanceIds []*string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" require:"true" type:"Repeated"`
}

func (s ComboCommodityOrder) String() string {
	return tea.Prettify(s)
}

func (s ComboCommodityOrder) GoString() string {
	return s.String()
}

func (s *ComboCommodityOrder) SetCommodityCode(v string) *ComboCommodityOrder {
	s.CommodityCode = &v
	return s
}

func (s *ComboCommodityOrder) SetStatus(v string) *ComboCommodityOrder {
	s.Status = &v
	return s
}

func (s *ComboCommodityOrder) SetInstanceIds(v []*string) *ComboCommodityOrder {
	s.InstanceIds = v
	return s
}

// 套餐内商品结构
type ComboCommodity struct {
	// 商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty" require:"true"`
	// 商品主数据编码
	InnerCode *string `json:"inner_code,omitempty" xml:"inner_code,omitempty" require:"true"`
	// 商品类型，资源包：attach
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 付费方式，预付：PREPAY，按量付费：POSTPAY
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty" require:"true"`
	// 销售属性列表
	Attrs []*CommodityAttribute `json:"attrs,omitempty" xml:"attrs,omitempty" require:"true" type:"Repeated"`
	// 商品数量
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 扩展信息，JSON结构，包含标签、个性化配置等数据
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty" require:"true"`
}

func (s ComboCommodity) String() string {
	return tea.Prettify(s)
}

func (s ComboCommodity) GoString() string {
	return s.String()
}

func (s *ComboCommodity) SetName(v string) *ComboCommodity {
	s.Name = &v
	return s
}

func (s *ComboCommodity) SetUniqueCode(v string) *ComboCommodity {
	s.UniqueCode = &v
	return s
}

func (s *ComboCommodity) SetInnerCode(v string) *ComboCommodity {
	s.InnerCode = &v
	return s
}

func (s *ComboCommodity) SetType(v string) *ComboCommodity {
	s.Type = &v
	return s
}

func (s *ComboCommodity) SetChargeType(v string) *ComboCommodity {
	s.ChargeType = &v
	return s
}

func (s *ComboCommodity) SetAttrs(v []*CommodityAttribute) *ComboCommodity {
	s.Attrs = v
	return s
}

func (s *ComboCommodity) SetQuantity(v int64) *ComboCommodity {
	s.Quantity = &v
	return s
}

func (s *ComboCommodity) SetExtendsConfig(v string) *ComboCommodity {
	s.ExtendsConfig = &v
	return s
}

// 套餐结构
type Combo struct {
	// 套餐名称
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 套餐编码
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 套餐版本号
	Vid *string `json:"vid,omitempty" xml:"vid,omitempty" require:"true"`
	// 套餐描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 扩展信息，JSON结构，包含标签、个性化配置等数据
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 套餐内商品列表
	Commodities []*ComboCommodity `json:"commodities,omitempty" xml:"commodities,omitempty" require:"true" type:"Repeated"`
}

func (s Combo) String() string {
	return tea.Prettify(s)
}

func (s Combo) GoString() string {
	return s.String()
}

func (s *Combo) SetCode(v string) *Combo {
	s.Code = &v
	return s
}

func (s *Combo) SetName(v string) *Combo {
	s.Name = &v
	return s
}

func (s *Combo) SetVid(v string) *Combo {
	s.Vid = &v
	return s
}

func (s *Combo) SetDescription(v string) *Combo {
	s.Description = &v
	return s
}

func (s *Combo) SetExtendsConfig(v string) *Combo {
	s.ExtendsConfig = &v
	return s
}

func (s *Combo) SetStatus(v string) *Combo {
	s.Status = &v
	return s
}

func (s *Combo) SetCommodities(v []*ComboCommodity) *Combo {
	s.Commodities = v
	return s
}

// 资源包结构
type InstanceCapacity struct {
	// 实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 当前剩余容量
	CurrentCapacity *string `json:"current_capacity,omitempty" xml:"current_capacity,omitempty" require:"true"`
	// 初始容量
	InitialCapacity *string `json:"initial_capacity,omitempty" xml:"initial_capacity,omitempty" require:"true"`
	// 起始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 截止时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Valid：有效；Closed：已用完；Expired:已到期
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 资源包对应商品码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 关联按量商品码
	RelPostpayCommodity *string `json:"rel_postpay_commodity,omitempty" xml:"rel_postpay_commodity,omitempty" require:"true"`
}

func (s InstanceCapacity) String() string {
	return tea.Prettify(s)
}

func (s InstanceCapacity) GoString() string {
	return s.String()
}

func (s *InstanceCapacity) SetInstanceId(v string) *InstanceCapacity {
	s.InstanceId = &v
	return s
}

func (s *InstanceCapacity) SetCurrentCapacity(v string) *InstanceCapacity {
	s.CurrentCapacity = &v
	return s
}

func (s *InstanceCapacity) SetInitialCapacity(v string) *InstanceCapacity {
	s.InitialCapacity = &v
	return s
}

func (s *InstanceCapacity) SetStartTime(v string) *InstanceCapacity {
	s.StartTime = &v
	return s
}

func (s *InstanceCapacity) SetEndTime(v string) *InstanceCapacity {
	s.EndTime = &v
	return s
}

func (s *InstanceCapacity) SetStatus(v string) *InstanceCapacity {
	s.Status = &v
	return s
}

func (s *InstanceCapacity) SetCommodityCode(v string) *InstanceCapacity {
	s.CommodityCode = &v
	return s
}

func (s *InstanceCapacity) SetRelPostpayCommodity(v string) *InstanceCapacity {
	s.RelPostpayCommodity = &v
	return s
}

// 商品定价结构
type CommodityPricing struct {
}

func (s CommodityPricing) String() string {
	return tea.Prettify(s)
}

func (s CommodityPricing) GoString() string {
	return s.String()
}

// 优惠券模型
type Coupon struct {
	// 优惠券ID
	//
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 优惠券名称,前端展示
	//
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 优惠券模板名称
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 优惠券金额，单位（分）
	//
	AmountInCent *string `json:"amount_in_cent,omitempty" xml:"amount_in_cent,omitempty"`
	// 已使用金额，单位(分）
	//
	UsedAmountInCent *string `json:"used_amount_in_cent,omitempty" xml:"used_amount_in_cent,omitempty"`
	// 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期开始时间
	//
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间
	//
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模板id
	//
	YouhuiTemplateId *int64 `json:"youhui_template_id,omitempty" xml:"youhui_template_id,omitempty" require:"true"`
	// 优惠券=折扣券时使用，如0.75
	//
	DiscountRate *string `json:"discount_rate,omitempty" xml:"discount_rate,omitempty"`
	// 优惠券类型=满减券时使用，如满200000分
	//
	FullAmountInCent *string `json:"full_amount_in_cent,omitempty" xml:"full_amount_in_cent,omitempty"`
	// 可以使用的总次数
	//
	UsageCount *int64 `json:"usage_count,omitempty" xml:"usage_count,omitempty" require:"true"`
	// 已使用次数（冻结次数）
	//
	UsedCount *int64 `json:"used_count,omitempty" xml:"used_count,omitempty" require:"true"`
	// 适用产品：通用/ECS/RDS
	ProductList *string `json:"product_list,omitempty" xml:"product_list,omitempty" require:"true"`
	// 适用订单类型
	//
	OrderTypeList *string `json:"order_type_list,omitempty" xml:"order_type_list,omitempty" require:"true"`
}

func (s Coupon) String() string {
	return tea.Prettify(s)
}

func (s Coupon) GoString() string {
	return s.String()
}

func (s *Coupon) SetId(v int64) *Coupon {
	s.Id = &v
	return s
}

func (s *Coupon) SetDisplayName(v string) *Coupon {
	s.DisplayName = &v
	return s
}

func (s *Coupon) SetName(v string) *Coupon {
	s.Name = &v
	return s
}

func (s *Coupon) SetType(v string) *Coupon {
	s.Type = &v
	return s
}

func (s *Coupon) SetAmountInCent(v string) *Coupon {
	s.AmountInCent = &v
	return s
}

func (s *Coupon) SetUsedAmountInCent(v string) *Coupon {
	s.UsedAmountInCent = &v
	return s
}

func (s *Coupon) SetStatus(v string) *Coupon {
	s.Status = &v
	return s
}

func (s *Coupon) SetStartTime(v string) *Coupon {
	s.StartTime = &v
	return s
}

func (s *Coupon) SetEndTime(v string) *Coupon {
	s.EndTime = &v
	return s
}

func (s *Coupon) SetYouhuiTemplateId(v int64) *Coupon {
	s.YouhuiTemplateId = &v
	return s
}

func (s *Coupon) SetDiscountRate(v string) *Coupon {
	s.DiscountRate = &v
	return s
}

func (s *Coupon) SetFullAmountInCent(v string) *Coupon {
	s.FullAmountInCent = &v
	return s
}

func (s *Coupon) SetUsageCount(v int64) *Coupon {
	s.UsageCount = &v
	return s
}

func (s *Coupon) SetUsedCount(v int64) *Coupon {
	s.UsedCount = &v
	return s
}

func (s *Coupon) SetProductList(v string) *Coupon {
	s.ProductList = &v
	return s
}

func (s *Coupon) SetOrderTypeList(v string) *Coupon {
	s.OrderTypeList = &v
	return s
}

// 商品询价结构
type CommodityEnquiryPrice struct {
	// 商品主数据编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 商品名称
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 预付-支付金额
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" require:"true"`
	// 预付费-原始金额
	OriginalAmount *string `json:"original_amount,omitempty" xml:"original_amount,omitempty" require:"true"`
	// 预付费-折扣金额
	DiscountAmount *string `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 命中的活动编码
	ActivityCode *string `json:"activity_code,omitempty" xml:"activity_code,omitempty" require:"true"`
	// 命中的活动名称
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty" require:"true"`
	// 命中的定价计划ID
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 命中的定价约束ID
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 币种，元：CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
}

func (s CommodityEnquiryPrice) String() string {
	return tea.Prettify(s)
}

func (s CommodityEnquiryPrice) GoString() string {
	return s.String()
}

func (s *CommodityEnquiryPrice) SetCommodityCode(v string) *CommodityEnquiryPrice {
	s.CommodityCode = &v
	return s
}

func (s *CommodityEnquiryPrice) SetCommodityName(v string) *CommodityEnquiryPrice {
	s.CommodityName = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPayAmount(v string) *CommodityEnquiryPrice {
	s.PayAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetOriginalAmount(v string) *CommodityEnquiryPrice {
	s.OriginalAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetDiscountAmount(v string) *CommodityEnquiryPrice {
	s.DiscountAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetActivityCode(v string) *CommodityEnquiryPrice {
	s.ActivityCode = &v
	return s
}

func (s *CommodityEnquiryPrice) SetActivityName(v string) *CommodityEnquiryPrice {
	s.ActivityName = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPricePlanId(v int64) *CommodityEnquiryPrice {
	s.PricePlanId = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPriceConstraintId(v int64) *CommodityEnquiryPrice {
	s.PriceConstraintId = &v
	return s
}

func (s *CommodityEnquiryPrice) SetCurrency(v string) *CommodityEnquiryPrice {
	s.Currency = &v
	return s
}

// 支付选项
type PayOptions struct {
	// 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
}

func (s PayOptions) String() string {
	return tea.Prettify(s)
}

func (s PayOptions) GoString() string {
	return s.String()
}

func (s *PayOptions) SetPayChannel(v string) *PayOptions {
	s.PayChannel = &v
	return s
}

// 下单返回接口
type CreateOrderResult struct {
	// 下单时指定的业务流水号。二级订单号
	BsnNo *string `json:"bsn_no,omitempty" xml:"bsn_no,omitempty" require:"true"`
	// 一级订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 二级订单号
	NormalOrderLineId *string `json:"normal_order_line_id,omitempty" xml:"normal_order_line_id,omitempty" require:"true"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 实例列表
	InstanceIds *string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" require:"true"`
	// 订购错误码
	OrderErrorCode *string `json:"order_error_code,omitempty" xml:"order_error_code,omitempty" require:"true"`
	// 订购错误描述
	OrderErrorDescription *string `json:"order_error_description,omitempty" xml:"order_error_description,omitempty" require:"true"`
}

func (s CreateOrderResult) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderResult) GoString() string {
	return s.String()
}

func (s *CreateOrderResult) SetBsnNo(v string) *CreateOrderResult {
	s.BsnNo = &v
	return s
}

func (s *CreateOrderResult) SetOrderId(v string) *CreateOrderResult {
	s.OrderId = &v
	return s
}

func (s *CreateOrderResult) SetNormalOrderLineId(v string) *CreateOrderResult {
	s.NormalOrderLineId = &v
	return s
}

func (s *CreateOrderResult) SetOrderStatus(v string) *CreateOrderResult {
	s.OrderStatus = &v
	return s
}

func (s *CreateOrderResult) SetInstanceIds(v string) *CreateOrderResult {
	s.InstanceIds = &v
	return s
}

func (s *CreateOrderResult) SetOrderErrorCode(v string) *CreateOrderResult {
	s.OrderErrorCode = &v
	return s
}

func (s *CreateOrderResult) SetOrderErrorDescription(v string) *CreateOrderResult {
	s.OrderErrorDescription = &v
	return s
}

// 订单周期结构
type OrderDuration struct {
	// 周期类型，YEAR：年；MONTH：月；DAY：日
	DurationType *string `json:"duration_type,omitempty" xml:"duration_type,omitempty" require:"true"`
	// 订购周期值
	DurationValue *int64 `json:"duration_value,omitempty" xml:"duration_value,omitempty" require:"true"`
}

func (s OrderDuration) String() string {
	return tea.Prettify(s)
}

func (s OrderDuration) GoString() string {
	return s.String()
}

func (s *OrderDuration) SetDurationType(v string) *OrderDuration {
	s.DurationType = &v
	return s
}

func (s *OrderDuration) SetDurationValue(v int64) *OrderDuration {
	s.DurationValue = &v
	return s
}

// 标签对象
type InstanceLabel struct {
	// 标签名。
	// 传递isvId
	InstanceKey *string `json:"instance_key,omitempty" xml:"instance_key,omitempty" require:"true"`
	// 标签值
	InstanceValue *string `json:"instance_value,omitempty" xml:"instance_value,omitempty" require:"true"`
}

func (s InstanceLabel) String() string {
	return tea.Prettify(s)
}

func (s InstanceLabel) GoString() string {
	return s.String()
}

func (s *InstanceLabel) SetInstanceKey(v string) *InstanceLabel {
	s.InstanceKey = &v
	return s
}

func (s *InstanceLabel) SetInstanceValue(v string) *InstanceLabel {
	s.InstanceValue = &v
	return s
}

// 商品订购属性结构
type CommodityOrderAttribute struct {
	// 属性编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 属性值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
	ValueUnit *string `json:"value_unit,omitempty" xml:"value_unit,omitempty" require:"true"`
}

func (s CommodityOrderAttribute) String() string {
	return tea.Prettify(s)
}

func (s CommodityOrderAttribute) GoString() string {
	return s.String()
}

func (s *CommodityOrderAttribute) SetCode(v string) *CommodityOrderAttribute {
	s.Code = &v
	return s
}

func (s *CommodityOrderAttribute) SetValue(v string) *CommodityOrderAttribute {
	s.Value = &v
	return s
}

func (s *CommodityOrderAttribute) SetValueUnit(v string) *CommodityOrderAttribute {
	s.ValueUnit = &v
	return s
}

// 履约选项
type FulfillmentOptions struct {
	// 是否延迟履约，默认false
	Deplay *bool `json:"deplay,omitempty" xml:"deplay,omitempty"`
	// 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
	SpiSkip *bool `json:"spi_skip,omitempty" xml:"spi_skip,omitempty"`
}

func (s FulfillmentOptions) String() string {
	return tea.Prettify(s)
}

func (s FulfillmentOptions) GoString() string {
	return s.String()
}

func (s *FulfillmentOptions) SetDeplay(v bool) *FulfillmentOptions {
	s.Deplay = &v
	return s
}

func (s *FulfillmentOptions) SetStartTime(v string) *FulfillmentOptions {
	s.StartTime = &v
	return s
}

func (s *FulfillmentOptions) SetSpiSkip(v bool) *FulfillmentOptions {
	s.SpiSkip = &v
	return s
}

// 套餐订单结构
type ComboOrder struct {
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 套餐订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 套餐编码
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty" require:"true"`
	// 套餐名称，下单时的套餐名称
	ComboName *string `json:"combo_name,omitempty" xml:"combo_name,omitempty" require:"true"`
	// 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
	ProvisionStatus *string `json:"provision_status,omitempty" xml:"provision_status,omitempty" require:"true"`
	// 订单原始金额
	OriginalAmount *string `json:"original_amount,omitempty" xml:"original_amount,omitempty" require:"true"`
	// 折扣金额
	DiscountAmount *string `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 优惠金额
	CouponAmount *string `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty" require:"true"`
	// 实付金额
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" require:"true"`
	// 下单时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 套餐内商品订单列表
	CommodityOrders []*ComboCommodityOrder `json:"commodity_orders,omitempty" xml:"commodity_orders,omitempty" require:"true" type:"Repeated"`
	// 支付完成时间
	PayTime *string `json:"pay_time,omitempty" xml:"pay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 支付渠道
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
}

func (s ComboOrder) String() string {
	return tea.Prettify(s)
}

func (s ComboOrder) GoString() string {
	return s.String()
}

func (s *ComboOrder) SetTenantId(v string) *ComboOrder {
	s.TenantId = &v
	return s
}

func (s *ComboOrder) SetBizNo(v string) *ComboOrder {
	s.BizNo = &v
	return s
}

func (s *ComboOrder) SetOrderId(v string) *ComboOrder {
	s.OrderId = &v
	return s
}

func (s *ComboOrder) SetComboCode(v string) *ComboOrder {
	s.ComboCode = &v
	return s
}

func (s *ComboOrder) SetComboName(v string) *ComboOrder {
	s.ComboName = &v
	return s
}

func (s *ComboOrder) SetStatus(v string) *ComboOrder {
	s.Status = &v
	return s
}

func (s *ComboOrder) SetProvisionStatus(v string) *ComboOrder {
	s.ProvisionStatus = &v
	return s
}

func (s *ComboOrder) SetOriginalAmount(v string) *ComboOrder {
	s.OriginalAmount = &v
	return s
}

func (s *ComboOrder) SetDiscountAmount(v string) *ComboOrder {
	s.DiscountAmount = &v
	return s
}

func (s *ComboOrder) SetCouponAmount(v string) *ComboOrder {
	s.CouponAmount = &v
	return s
}

func (s *ComboOrder) SetPayAmount(v string) *ComboOrder {
	s.PayAmount = &v
	return s
}

func (s *ComboOrder) SetGmtCreate(v string) *ComboOrder {
	s.GmtCreate = &v
	return s
}

func (s *ComboOrder) SetCommodityOrders(v []*ComboCommodityOrder) *ComboOrder {
	s.CommodityOrders = v
	return s
}

func (s *ComboOrder) SetPayTime(v string) *ComboOrder {
	s.PayTime = &v
	return s
}

func (s *ComboOrder) SetPayChannel(v string) *ComboOrder {
	s.PayChannel = &v
	return s
}

// 实例
type Instance struct {
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 商品code
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty" require:"true"`
	// 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s Instance) String() string {
	return tea.Prettify(s)
}

func (s Instance) GoString() string {
	return s.String()
}

func (s *Instance) SetTenantId(v string) *Instance {
	s.TenantId = &v
	return s
}

func (s *Instance) SetInstanceId(v string) *Instance {
	s.InstanceId = &v
	return s
}

func (s *Instance) SetProductName(v string) *Instance {
	s.ProductName = &v
	return s
}

func (s *Instance) SetChargeType(v string) *Instance {
	s.ChargeType = &v
	return s
}

func (s *Instance) SetStatus(v string) *Instance {
	s.Status = &v
	return s
}

type QueryInstanceCapacityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID，和租户名称二选一必填
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 8位租户名，和租户ID二选一必填
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资源包商品码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty"`
}

func (s QueryInstanceCapacityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInstanceCapacityRequest) GoString() string {
	return s.String()
}

func (s *QueryInstanceCapacityRequest) SetAuthToken(v string) *QueryInstanceCapacityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInstanceCapacityRequest) SetTenantId(v string) *QueryInstanceCapacityRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInstanceCapacityRequest) SetTenantName(v string) *QueryInstanceCapacityRequest {
	s.TenantName = &v
	return s
}

func (s *QueryInstanceCapacityRequest) SetStatus(v string) *QueryInstanceCapacityRequest {
	s.Status = &v
	return s
}

func (s *QueryInstanceCapacityRequest) SetCommodityCode(v string) *QueryInstanceCapacityRequest {
	s.CommodityCode = &v
	return s
}

type QueryInstanceCapacityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实例容量列表
	InstanceCapacitys []*InstanceCapacity `json:"instance_capacitys,omitempty" xml:"instance_capacitys,omitempty" type:"Repeated"`
}

func (s QueryInstanceCapacityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInstanceCapacityResponse) GoString() string {
	return s.String()
}

func (s *QueryInstanceCapacityResponse) SetReqMsgId(v string) *QueryInstanceCapacityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInstanceCapacityResponse) SetResultCode(v string) *QueryInstanceCapacityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInstanceCapacityResponse) SetResultMsg(v string) *QueryInstanceCapacityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInstanceCapacityResponse) SetInstanceCapacitys(v []*InstanceCapacity) *QueryInstanceCapacityResponse {
	s.InstanceCapacitys = v
	return s
}

type QueryMarketingCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true" type:"Repeated"`
	// 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 业务发生时间
	BizTime *string `json:"biz_time,omitempty" xml:"biz_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryMarketingCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMarketingCouponRequest) GoString() string {
	return s.String()
}

func (s *QueryMarketingCouponRequest) SetAuthToken(v string) *QueryMarketingCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMarketingCouponRequest) SetTenantId(v string) *QueryMarketingCouponRequest {
	s.TenantId = &v
	return s
}

func (s *QueryMarketingCouponRequest) SetProductCodes(v []*string) *QueryMarketingCouponRequest {
	s.ProductCodes = v
	return s
}

func (s *QueryMarketingCouponRequest) SetCouponType(v string) *QueryMarketingCouponRequest {
	s.CouponType = &v
	return s
}

func (s *QueryMarketingCouponRequest) SetBizTime(v string) *QueryMarketingCouponRequest {
	s.BizTime = &v
	return s
}

type QueryMarketingCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券列表
	CouponList []*Coupon `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
}

func (s QueryMarketingCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMarketingCouponResponse) GoString() string {
	return s.String()
}

func (s *QueryMarketingCouponResponse) SetReqMsgId(v string) *QueryMarketingCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMarketingCouponResponse) SetResultCode(v string) *QueryMarketingCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMarketingCouponResponse) SetResultMsg(v string) *QueryMarketingCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMarketingCouponResponse) SetCouponList(v []*Coupon) *QueryMarketingCouponResponse {
	s.CouponList = v
	return s
}

type SendMarketingCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 外部业务流水号，用于幂等判断
	//
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 租户ID
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 优惠券模板ID，营销后台申请获取
	//
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s SendMarketingCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s SendMarketingCouponRequest) GoString() string {
	return s.String()
}

func (s *SendMarketingCouponRequest) SetAuthToken(v string) *SendMarketingCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *SendMarketingCouponRequest) SetBizNo(v string) *SendMarketingCouponRequest {
	s.BizNo = &v
	return s
}

func (s *SendMarketingCouponRequest) SetTenantId(v string) *SendMarketingCouponRequest {
	s.TenantId = &v
	return s
}

func (s *SendMarketingCouponRequest) SetTemplateId(v string) *SendMarketingCouponRequest {
	s.TemplateId = &v
	return s
}

type SendMarketingCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券id
	//
	CouponId *int64 `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s SendMarketingCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s SendMarketingCouponResponse) GoString() string {
	return s.String()
}

func (s *SendMarketingCouponResponse) SetReqMsgId(v string) *SendMarketingCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendMarketingCouponResponse) SetResultCode(v string) *SendMarketingCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *SendMarketingCouponResponse) SetResultMsg(v string) *SendMarketingCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendMarketingCouponResponse) SetCouponId(v int64) *SendMarketingCouponResponse {
	s.CouponId = &v
	return s
}

type CreateOrderAfterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 待开通类商品列表
	ProductList []*string `json:"product_list,omitempty" xml:"product_list,omitempty" require:"true" type:"Repeated"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 下单交易流水号，唯一
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 标签对象
	InstanceLabels []*InstanceLabel `json:"instance_labels,omitempty" xml:"instance_labels,omitempty" type:"Repeated"`
}

func (s CreateOrderAfterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderAfterRequest) GoString() string {
	return s.String()
}

func (s *CreateOrderAfterRequest) SetAuthToken(v string) *CreateOrderAfterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOrderAfterRequest) SetProductList(v []*string) *CreateOrderAfterRequest {
	s.ProductList = v
	return s
}

func (s *CreateOrderAfterRequest) SetTenantId(v string) *CreateOrderAfterRequest {
	s.TenantId = &v
	return s
}

func (s *CreateOrderAfterRequest) SetBizNo(v string) *CreateOrderAfterRequest {
	s.BizNo = &v
	return s
}

func (s *CreateOrderAfterRequest) SetInstanceLabels(v []*InstanceLabel) *CreateOrderAfterRequest {
	s.InstanceLabels = v
	return s
}

type CreateOrderAfterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 下单返回值。里面有实例id和二级订单号等关键字段。
	CreateOrderResponseList []*CreateOrderResult `json:"create_order_response_list,omitempty" xml:"create_order_response_list,omitempty" type:"Repeated"`
}

func (s CreateOrderAfterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderAfterResponse) GoString() string {
	return s.String()
}

func (s *CreateOrderAfterResponse) SetReqMsgId(v string) *CreateOrderAfterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOrderAfterResponse) SetResultCode(v string) *CreateOrderAfterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOrderAfterResponse) SetResultMsg(v string) *CreateOrderAfterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOrderAfterResponse) SetBizNo(v string) *CreateOrderAfterResponse {
	s.BizNo = &v
	return s
}

func (s *CreateOrderAfterResponse) SetCreateOrderResponseList(v []*CreateOrderResult) *CreateOrderAfterResponse {
	s.CreateOrderResponseList = v
	return s
}

type CreateOrderWorkflowRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 待开通类商品列表
	ProductList []*string `json:"product_list,omitempty" xml:"product_list,omitempty" require:"true" type:"Repeated"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 下单交易流水号，唯一
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 标签对象
	InstanceLabels []*InstanceLabel `json:"instance_labels,omitempty" xml:"instance_labels,omitempty" require:"true" type:"Repeated"`
}

func (s CreateOrderWorkflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderWorkflowRequest) GoString() string {
	return s.String()
}

func (s *CreateOrderWorkflowRequest) SetAuthToken(v string) *CreateOrderWorkflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOrderWorkflowRequest) SetProductList(v []*string) *CreateOrderWorkflowRequest {
	s.ProductList = v
	return s
}

func (s *CreateOrderWorkflowRequest) SetTenantId(v string) *CreateOrderWorkflowRequest {
	s.TenantId = &v
	return s
}

func (s *CreateOrderWorkflowRequest) SetBizNo(v string) *CreateOrderWorkflowRequest {
	s.BizNo = &v
	return s
}

func (s *CreateOrderWorkflowRequest) SetInstanceLabels(v []*InstanceLabel) *CreateOrderWorkflowRequest {
	s.InstanceLabels = v
	return s
}

type CreateOrderWorkflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下单返回值。里面有实例id和二级订单号等关键字段。
	CreateOrderResponseList []*CreateOrderResult `json:"create_order_response_list,omitempty" xml:"create_order_response_list,omitempty" type:"Repeated"`
	// 下单流水号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s CreateOrderWorkflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderWorkflowResponse) GoString() string {
	return s.String()
}

func (s *CreateOrderWorkflowResponse) SetReqMsgId(v string) *CreateOrderWorkflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOrderWorkflowResponse) SetResultCode(v string) *CreateOrderWorkflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOrderWorkflowResponse) SetResultMsg(v string) *CreateOrderWorkflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOrderWorkflowResponse) SetCreateOrderResponseList(v []*CreateOrderResult) *CreateOrderWorkflowResponse {
	s.CreateOrderResponseList = v
	return s
}

func (s *CreateOrderWorkflowResponse) SetBizNo(v string) *CreateOrderWorkflowResponse {
	s.BizNo = &v
	return s
}

type GetComboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐编码
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty" require:"true"`
}

func (s GetComboRequest) String() string {
	return tea.Prettify(s)
}

func (s GetComboRequest) GoString() string {
	return s.String()
}

func (s *GetComboRequest) SetAuthToken(v string) *GetComboRequest {
	s.AuthToken = &v
	return s
}

func (s *GetComboRequest) SetComboCode(v string) *GetComboRequest {
	s.ComboCode = &v
	return s
}

type GetComboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐结构
	Combo *Combo `json:"combo,omitempty" xml:"combo,omitempty"`
}

func (s GetComboResponse) String() string {
	return tea.Prettify(s)
}

func (s GetComboResponse) GoString() string {
	return s.String()
}

func (s *GetComboResponse) SetReqMsgId(v string) *GetComboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetComboResponse) SetResultCode(v string) *GetComboResponse {
	s.ResultCode = &v
	return s
}

func (s *GetComboResponse) SetResultMsg(v string) *GetComboResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetComboResponse) SetCombo(v *Combo) *GetComboResponse {
	s.Combo = v
	return s
}

type QueryComboPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐编码
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty" require:"true"`
	// 租户ID，和租户名二选一必填
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 8位租户名，和租户ID二选一必填
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 订单类型，新购：NEW，不填则默认NEW
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty"`
	// 优惠券ID
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s QueryComboPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryComboPriceRequest) GoString() string {
	return s.String()
}

func (s *QueryComboPriceRequest) SetAuthToken(v string) *QueryComboPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryComboPriceRequest) SetComboCode(v string) *QueryComboPriceRequest {
	s.ComboCode = &v
	return s
}

func (s *QueryComboPriceRequest) SetTenantId(v string) *QueryComboPriceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryComboPriceRequest) SetTenantName(v string) *QueryComboPriceRequest {
	s.TenantName = &v
	return s
}

func (s *QueryComboPriceRequest) SetOrderType(v string) *QueryComboPriceRequest {
	s.OrderType = &v
	return s
}

func (s *QueryComboPriceRequest) SetCouponId(v string) *QueryComboPriceRequest {
	s.CouponId = &v
	return s
}

type QueryComboPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐付款金额
	ComboPayAmount *string `json:"combo_pay_amount,omitempty" xml:"combo_pay_amount,omitempty"`
	// 套餐优惠金额
	ComboCouponAmount *string `json:"combo_coupon_amount,omitempty" xml:"combo_coupon_amount,omitempty"`
	// 套餐折扣金额
	ComboDiscountAmount *string `json:"combo_discount_amount,omitempty" xml:"combo_discount_amount,omitempty"`
	// 套餐原始金额
	ComboOriginalAmount *string `json:"combo_original_amount,omitempty" xml:"combo_original_amount,omitempty"`
	// 币种，元：CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 商品询价明细
	CommodityEnquiryPrices []*CommodityEnquiryPrice `json:"commodity_enquiry_prices,omitempty" xml:"commodity_enquiry_prices,omitempty" type:"Repeated"`
}

func (s QueryComboPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryComboPriceResponse) GoString() string {
	return s.String()
}

func (s *QueryComboPriceResponse) SetReqMsgId(v string) *QueryComboPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryComboPriceResponse) SetResultCode(v string) *QueryComboPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryComboPriceResponse) SetResultMsg(v string) *QueryComboPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryComboPriceResponse) SetComboPayAmount(v string) *QueryComboPriceResponse {
	s.ComboPayAmount = &v
	return s
}

func (s *QueryComboPriceResponse) SetComboCouponAmount(v string) *QueryComboPriceResponse {
	s.ComboCouponAmount = &v
	return s
}

func (s *QueryComboPriceResponse) SetComboDiscountAmount(v string) *QueryComboPriceResponse {
	s.ComboDiscountAmount = &v
	return s
}

func (s *QueryComboPriceResponse) SetComboOriginalAmount(v string) *QueryComboPriceResponse {
	s.ComboOriginalAmount = &v
	return s
}

func (s *QueryComboPriceResponse) SetCurrency(v string) *QueryComboPriceResponse {
	s.Currency = &v
	return s
}

func (s *QueryComboPriceResponse) SetCommodityEnquiryPrices(v []*CommodityEnquiryPrice) *QueryComboPriceResponse {
	s.CommodityEnquiryPrices = v
	return s
}

type CreateComboOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 场景接入码，中台分配
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 业务流水号，用于幂等
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 套餐编码
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty" require:"true"`
	// 租户ID，和租户名二选一必填
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 8位租户名，和租户ID二选一必填
	//
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 操作人ID，为空则等于当前租户ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	// 订购周期，当套餐中包含包周期型的商品，必填
	Duration *OrderDuration `json:"duration,omitempty" xml:"duration,omitempty"`
	// 优惠券ID
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
	// [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
	InstanceLabels []*InstanceLabel `json:"instance_labels,omitempty" xml:"instance_labels,omitempty" type:"Repeated"`
}

func (s CreateComboOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateComboOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateComboOrderRequest) SetAuthToken(v string) *CreateComboOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateComboOrderRequest) SetSceneCode(v string) *CreateComboOrderRequest {
	s.SceneCode = &v
	return s
}

func (s *CreateComboOrderRequest) SetBizNo(v string) *CreateComboOrderRequest {
	s.BizNo = &v
	return s
}

func (s *CreateComboOrderRequest) SetComboCode(v string) *CreateComboOrderRequest {
	s.ComboCode = &v
	return s
}

func (s *CreateComboOrderRequest) SetTenantId(v string) *CreateComboOrderRequest {
	s.TenantId = &v
	return s
}

func (s *CreateComboOrderRequest) SetTenantName(v string) *CreateComboOrderRequest {
	s.TenantName = &v
	return s
}

func (s *CreateComboOrderRequest) SetOperatorId(v string) *CreateComboOrderRequest {
	s.OperatorId = &v
	return s
}

func (s *CreateComboOrderRequest) SetDuration(v *OrderDuration) *CreateComboOrderRequest {
	s.Duration = v
	return s
}

func (s *CreateComboOrderRequest) SetCouponId(v string) *CreateComboOrderRequest {
	s.CouponId = &v
	return s
}

func (s *CreateComboOrderRequest) SetInstanceLabels(v []*InstanceLabel) *CreateComboOrderRequest {
	s.InstanceLabels = v
	return s
}

type CreateComboOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐下单订单号
	ComboOrderId *string `json:"combo_order_id,omitempty" xml:"combo_order_id,omitempty"`
}

func (s CreateComboOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateComboOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateComboOrderResponse) SetReqMsgId(v string) *CreateComboOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateComboOrderResponse) SetResultCode(v string) *CreateComboOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateComboOrderResponse) SetResultMsg(v string) *CreateComboOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateComboOrderResponse) SetComboOrderId(v string) *CreateComboOrderResponse {
	s.ComboOrderId = &v
	return s
}

type QueryComboOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID，租户ID和租户名称二选一必填
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 租户名称，租户ID和租户名称二选一必填
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 订单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 套餐编码
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty"`
	// 下单开始时间
	BeginTime *string `json:"begin_time,omitempty" xml:"begin_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 下单结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 每页数量，不传默认20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页数，不传则默认1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
}

func (s QueryComboOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryComboOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryComboOrderRequest) SetAuthToken(v string) *QueryComboOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryComboOrderRequest) SetTenantId(v string) *QueryComboOrderRequest {
	s.TenantId = &v
	return s
}

func (s *QueryComboOrderRequest) SetTenantName(v string) *QueryComboOrderRequest {
	s.TenantName = &v
	return s
}

func (s *QueryComboOrderRequest) SetStatus(v string) *QueryComboOrderRequest {
	s.Status = &v
	return s
}

func (s *QueryComboOrderRequest) SetComboCode(v string) *QueryComboOrderRequest {
	s.ComboCode = &v
	return s
}

func (s *QueryComboOrderRequest) SetBeginTime(v string) *QueryComboOrderRequest {
	s.BeginTime = &v
	return s
}

func (s *QueryComboOrderRequest) SetEndTime(v string) *QueryComboOrderRequest {
	s.EndTime = &v
	return s
}

func (s *QueryComboOrderRequest) SetPageSize(v int64) *QueryComboOrderRequest {
	s.PageSize = &v
	return s
}

func (s *QueryComboOrderRequest) SetPageNo(v int64) *QueryComboOrderRequest {
	s.PageNo = &v
	return s
}

type QueryComboOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐订单列表
	Orders []*ComboOrder `json:"orders,omitempty" xml:"orders,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 当前页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryComboOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryComboOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryComboOrderResponse) SetReqMsgId(v string) *QueryComboOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryComboOrderResponse) SetResultCode(v string) *QueryComboOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryComboOrderResponse) SetResultMsg(v string) *QueryComboOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryComboOrderResponse) SetOrders(v []*ComboOrder) *QueryComboOrderResponse {
	s.Orders = v
	return s
}

func (s *QueryComboOrderResponse) SetTotalCount(v int64) *QueryComboOrderResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryComboOrderResponse) SetPageNo(v int64) *QueryComboOrderResponse {
	s.PageNo = &v
	return s
}

func (s *QueryComboOrderResponse) SetPageSize(v int64) *QueryComboOrderResponse {
	s.PageSize = &v
	return s
}

type QueryComboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 类目编码
	CategoryCode *string `json:"category_code,omitempty" xml:"category_code,omitempty" require:"true"`
}

func (s QueryComboRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryComboRequest) GoString() string {
	return s.String()
}

func (s *QueryComboRequest) SetAuthToken(v string) *QueryComboRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryComboRequest) SetCategoryCode(v string) *QueryComboRequest {
	s.CategoryCode = &v
	return s
}

type QueryComboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐列表
	Combos []*Combo `json:"combos,omitempty" xml:"combos,omitempty" type:"Repeated"`
}

func (s QueryComboResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryComboResponse) GoString() string {
	return s.String()
}

func (s *QueryComboResponse) SetReqMsgId(v string) *QueryComboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryComboResponse) SetResultCode(v string) *QueryComboResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryComboResponse) SetResultMsg(v string) *QueryComboResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryComboResponse) SetCombos(v []*Combo) *QueryComboResponse {
	s.Combos = v
	return s
}

type PayComboOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐订单号
	ComboOrderId *string `json:"combo_order_id,omitempty" xml:"combo_order_id,omitempty" require:"true"`
	// 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
	// 支付通模式只支持PAGE
	PayMode *string `json:"pay_mode,omitempty" xml:"pay_mode,omitempty" require:"true"`
	// 支付回跳地址，当pay_mode=PAGE时，必传
	PayReturnUrl *string `json:"pay_return_url,omitempty" xml:"pay_return_url,omitempty"`
}

func (s PayComboOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s PayComboOrderRequest) GoString() string {
	return s.String()
}

func (s *PayComboOrderRequest) SetAuthToken(v string) *PayComboOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *PayComboOrderRequest) SetComboOrderId(v string) *PayComboOrderRequest {
	s.ComboOrderId = &v
	return s
}

func (s *PayComboOrderRequest) SetPayChannel(v string) *PayComboOrderRequest {
	s.PayChannel = &v
	return s
}

func (s *PayComboOrderRequest) SetPayMode(v string) *PayComboOrderRequest {
	s.PayMode = &v
	return s
}

func (s *PayComboOrderRequest) SetPayReturnUrl(v string) *PayComboOrderRequest {
	s.PayReturnUrl = &v
	return s
}

type PayComboOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页面支付地址
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 支付订单号
	PayOrderId *string `json:"pay_order_id,omitempty" xml:"pay_order_id,omitempty"`
	// 支付状态，
	// SUCCESS：已支付;
	// INIT：未支付;
	// PROCESS：支付中;
	// CANCEL：取消支付;
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty"`
}

func (s PayComboOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s PayComboOrderResponse) GoString() string {
	return s.String()
}

func (s *PayComboOrderResponse) SetReqMsgId(v string) *PayComboOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayComboOrderResponse) SetResultCode(v string) *PayComboOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *PayComboOrderResponse) SetResultMsg(v string) *PayComboOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayComboOrderResponse) SetPayUrl(v string) *PayComboOrderResponse {
	s.PayUrl = &v
	return s
}

func (s *PayComboOrderResponse) SetPayOrderId(v string) *PayComboOrderResponse {
	s.PayOrderId = &v
	return s
}

func (s *PayComboOrderResponse) SetPayStatus(v string) *PayComboOrderResponse {
	s.PayStatus = &v
	return s
}

type CreateOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务流水号，调用方指定，幂等号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 租户ID，和租户名称二选一必填
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 租户名称，和租户ID二选一必填
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 操作人ID，不填则默认和租户ID一致
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	// 商品编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 订单类型，NEW：新购；RENEW：续费
	// 不填默认新购
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty"`
	// 订购周期对象，当商品是周期订阅类型时，必填
	Duration *OrderDuration `json:"duration,omitempty" xml:"duration,omitempty"`
	// 优惠券ID
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
	// 数量，不填默认1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty"`
	// 商品订购属性，开通型商品部需要填写
	CommodityAttrs []*CommodityOrderAttribute `json:"commodity_attrs,omitempty" xml:"commodity_attrs,omitempty" type:"Repeated"`
	// 履约选项
	FulfillmentOptions *FulfillmentOptions `json:"fulfillment_options,omitempty" xml:"fulfillment_options,omitempty"`
	// 支付选项
	PayOptions *PayOptions `json:"pay_options,omitempty" xml:"pay_options,omitempty"`
}

func (s CreateOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateOrderRequest) SetAuthToken(v string) *CreateOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOrderRequest) SetBizNo(v string) *CreateOrderRequest {
	s.BizNo = &v
	return s
}

func (s *CreateOrderRequest) SetTenantId(v string) *CreateOrderRequest {
	s.TenantId = &v
	return s
}

func (s *CreateOrderRequest) SetTenantName(v string) *CreateOrderRequest {
	s.TenantName = &v
	return s
}

func (s *CreateOrderRequest) SetOperatorId(v string) *CreateOrderRequest {
	s.OperatorId = &v
	return s
}

func (s *CreateOrderRequest) SetCommodityCode(v string) *CreateOrderRequest {
	s.CommodityCode = &v
	return s
}

func (s *CreateOrderRequest) SetOrderType(v string) *CreateOrderRequest {
	s.OrderType = &v
	return s
}

func (s *CreateOrderRequest) SetDuration(v *OrderDuration) *CreateOrderRequest {
	s.Duration = v
	return s
}

func (s *CreateOrderRequest) SetCouponId(v string) *CreateOrderRequest {
	s.CouponId = &v
	return s
}

func (s *CreateOrderRequest) SetQuantity(v int64) *CreateOrderRequest {
	s.Quantity = &v
	return s
}

func (s *CreateOrderRequest) SetCommodityAttrs(v []*CommodityOrderAttribute) *CreateOrderRequest {
	s.CommodityAttrs = v
	return s
}

func (s *CreateOrderRequest) SetFulfillmentOptions(v *FulfillmentOptions) *CreateOrderRequest {
	s.FulfillmentOptions = v
	return s
}

func (s *CreateOrderRequest) SetPayOptions(v *PayOptions) *CreateOrderRequest {
	s.PayOptions = v
	return s
}

type CreateOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 实例ID列表
	InstanceIds []*string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" type:"Repeated"`
	// 支付状态
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty"`
}

func (s CreateOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateOrderResponse) SetReqMsgId(v string) *CreateOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOrderResponse) SetResultCode(v string) *CreateOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOrderResponse) SetResultMsg(v string) *CreateOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOrderResponse) SetOrderId(v string) *CreateOrderResponse {
	s.OrderId = &v
	return s
}

func (s *CreateOrderResponse) SetInstanceIds(v []*string) *CreateOrderResponse {
	s.InstanceIds = v
	return s
}

func (s *CreateOrderResponse) SetPayStatus(v string) *CreateOrderResponse {
	s.PayStatus = &v
	return s
}

type ExistPricePersonalizedRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 收费项编码，只有当商品存在多收费项的时候需要传入
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty"`
}

func (s ExistPricePersonalizedRequest) String() string {
	return tea.Prettify(s)
}

func (s ExistPricePersonalizedRequest) GoString() string {
	return s.String()
}

func (s *ExistPricePersonalizedRequest) SetAuthToken(v string) *ExistPricePersonalizedRequest {
	s.AuthToken = &v
	return s
}

func (s *ExistPricePersonalizedRequest) SetTenantId(v string) *ExistPricePersonalizedRequest {
	s.TenantId = &v
	return s
}

func (s *ExistPricePersonalizedRequest) SetProductCode(v string) *ExistPricePersonalizedRequest {
	s.ProductCode = &v
	return s
}

func (s *ExistPricePersonalizedRequest) SetPriceObjectCode(v string) *ExistPricePersonalizedRequest {
	s.PriceObjectCode = &v
	return s
}

type ExistPricePersonalizedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否存在
	Exist *bool `json:"exist,omitempty" xml:"exist,omitempty"`
}

func (s ExistPricePersonalizedResponse) String() string {
	return tea.Prettify(s)
}

func (s ExistPricePersonalizedResponse) GoString() string {
	return s.String()
}

func (s *ExistPricePersonalizedResponse) SetReqMsgId(v string) *ExistPricePersonalizedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExistPricePersonalizedResponse) SetResultCode(v string) *ExistPricePersonalizedResponse {
	s.ResultCode = &v
	return s
}

func (s *ExistPricePersonalizedResponse) SetResultMsg(v string) *ExistPricePersonalizedResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExistPricePersonalizedResponse) SetExist(v bool) *ExistPricePersonalizedResponse {
	s.Exist = &v
	return s
}

type QueryPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品主数据编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 租户ID，和租户名称二选一必填
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 8位租户名，和租户ID二选一必选
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
	// 商品数量，不传则默认1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty"`
	// 业务发生时间，不传则默认当前时间
	BizTime *string `json:"biz_time,omitempty" xml:"biz_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订购周期，周期型商品必填，如资源包/包年包月商品
	OrderDuration *OrderDuration `json:"order_duration,omitempty" xml:"order_duration,omitempty"`
	// 商品规格列表
	// 针对量价型商品，统一使用SYS_USAGE_AMOUNT
	// 针对资源包商品，统一使用CAPACITY
	CommodityOrderAttrs []*CommodityOrderAttribute `json:"commodity_order_attrs,omitempty" xml:"commodity_order_attrs,omitempty" type:"Repeated"`
	// 币种，元：CNY，不传默认CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 优惠券ID
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s QueryPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPriceRequest) GoString() string {
	return s.String()
}

func (s *QueryPriceRequest) SetAuthToken(v string) *QueryPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPriceRequest) SetCommodityCode(v string) *QueryPriceRequest {
	s.CommodityCode = &v
	return s
}

func (s *QueryPriceRequest) SetTenantId(v string) *QueryPriceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryPriceRequest) SetTenantName(v string) *QueryPriceRequest {
	s.TenantName = &v
	return s
}

func (s *QueryPriceRequest) SetQuantity(v int64) *QueryPriceRequest {
	s.Quantity = &v
	return s
}

func (s *QueryPriceRequest) SetBizTime(v string) *QueryPriceRequest {
	s.BizTime = &v
	return s
}

func (s *QueryPriceRequest) SetOrderDuration(v *OrderDuration) *QueryPriceRequest {
	s.OrderDuration = v
	return s
}

func (s *QueryPriceRequest) SetCommodityOrderAttrs(v []*CommodityOrderAttribute) *QueryPriceRequest {
	s.CommodityOrderAttrs = v
	return s
}

func (s *QueryPriceRequest) SetCurrency(v string) *QueryPriceRequest {
	s.Currency = &v
	return s
}

func (s *QueryPriceRequest) SetCouponId(v string) *QueryPriceRequest {
	s.CouponId = &v
	return s
}

type QueryPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品询价结果
	CommodityEnquiryPrice *CommodityEnquiryPrice `json:"commodity_enquiry_price,omitempty" xml:"commodity_enquiry_price,omitempty"`
}

func (s QueryPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPriceResponse) GoString() string {
	return s.String()
}

func (s *QueryPriceResponse) SetReqMsgId(v string) *QueryPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPriceResponse) SetResultCode(v string) *QueryPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPriceResponse) SetResultMsg(v string) *QueryPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPriceResponse) SetCommodityEnquiryPrice(v *CommodityEnquiryPrice) *QueryPriceResponse {
	s.CommodityEnquiryPrice = v
	return s
}

type QueryWareslifeInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true" type:"Repeated"`
}

func (s QueryWareslifeInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWareslifeInstanceRequest) GoString() string {
	return s.String()
}

func (s *QueryWareslifeInstanceRequest) SetAuthToken(v string) *QueryWareslifeInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWareslifeInstanceRequest) SetTenantId(v string) *QueryWareslifeInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryWareslifeInstanceRequest) SetProductCodes(v []*string) *QueryWareslifeInstanceRequest {
	s.ProductCodes = v
	return s
}

type QueryWareslifeInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实例列表
	Instances []*Instance `json:"instances,omitempty" xml:"instances,omitempty" type:"Repeated"`
}

func (s QueryWareslifeInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWareslifeInstanceResponse) GoString() string {
	return s.String()
}

func (s *QueryWareslifeInstanceResponse) SetReqMsgId(v string) *QueryWareslifeInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWareslifeInstanceResponse) SetResultCode(v string) *QueryWareslifeInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWareslifeInstanceResponse) SetResultMsg(v string) *QueryWareslifeInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWareslifeInstanceResponse) SetInstances(v []*Instance) *QueryWareslifeInstanceResponse {
	s.Instances = v
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
		"timeouted":               "retry",
		"readTimeout":             tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":          tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":               tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":              tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":                 tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":            tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":       tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDurationMillis": tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":             tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost":      tea.IntValue(client.MaxRequestsPerHost),
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
				"sdk_version":      tea.String("3.6.3"),
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
			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
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
 * Description: 查询租户实例容量信息
 * Summary: 查询租户实例容量信息
 */
func (client *Client) QueryInstanceCapacity(request *QueryInstanceCapacityRequest) (_result *QueryInstanceCapacityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInstanceCapacityResponse{}
	_body, _err := client.QueryInstanceCapacityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户实例容量信息
 * Summary: 查询租户实例容量信息
 */
func (client *Client) QueryInstanceCapacityEx(request *QueryInstanceCapacityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInstanceCapacityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInstanceCapacityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.instance.capacity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券列表查询接口
 * Summary: 优惠券列表查询接口
 */
func (client *Client) QueryMarketingCoupon(request *QueryMarketingCouponRequest) (_result *QueryMarketingCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMarketingCouponResponse{}
	_body, _err := client.QueryMarketingCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券列表查询接口
 * Summary: 优惠券列表查询接口
 */
func (client *Client) QueryMarketingCouponEx(request *QueryMarketingCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMarketingCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMarketingCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.marketing.coupon.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口
 */
func (client *Client) SendMarketingCoupon(request *SendMarketingCouponRequest) (_result *SendMarketingCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendMarketingCouponResponse{}
	_body, _err := client.SendMarketingCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口
 */
func (client *Client) SendMarketingCouponEx(request *SendMarketingCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendMarketingCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendMarketingCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.marketing.coupon.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
 * Summary: 开通类商品自动下单接口
 */
func (client *Client) CreateOrderAfter(request *CreateOrderAfterRequest) (_result *CreateOrderAfterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOrderAfterResponse{}
	_body, _err := client.CreateOrderAfterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
 * Summary: 开通类商品自动下单接口
 */
func (client *Client) CreateOrderAfterEx(request *CreateOrderAfterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOrderAfterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrderAfterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.order.after.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 流程编排，创建商品开通接口
 * Summary: 能力编排-商品开通
 */
func (client *Client) CreateOrderWorkflow(request *CreateOrderWorkflowRequest) (_result *CreateOrderWorkflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOrderWorkflowResponse{}
	_body, _err := client.CreateOrderWorkflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 流程编排，创建商品开通接口
 * Summary: 能力编排-商品开通
 */
func (client *Client) CreateOrderWorkflowEx(request *CreateOrderWorkflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOrderWorkflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrderWorkflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.order.workflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取套餐详情接口
 * Summary: 获取套餐详情
 */
func (client *Client) GetCombo(request *GetComboRequest) (_result *GetComboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetComboResponse{}
	_body, _err := client.GetComboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取套餐详情接口
 * Summary: 获取套餐详情
 */
func (client *Client) GetComboEx(request *GetComboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetComboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetComboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 套餐询价接口
 * Summary: 套餐询价接口
 */
func (client *Client) QueryComboPrice(request *QueryComboPriceRequest) (_result *QueryComboPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryComboPriceResponse{}
	_body, _err := client.QueryComboPriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 套餐询价接口
 * Summary: 套餐询价接口
 */
func (client *Client) QueryComboPriceEx(request *QueryComboPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryComboPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryComboPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.price.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 套餐下单接口，支持部分渠道的自动支付
 * Summary: 套餐下单接口
 */
func (client *Client) CreateComboOrder(request *CreateComboOrderRequest) (_result *CreateComboOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateComboOrderResponse{}
	_body, _err := client.CreateComboOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 套餐下单接口，支持部分渠道的自动支付
 * Summary: 套餐下单接口
 */
func (client *Client) CreateComboOrderEx(request *CreateComboOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateComboOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateComboOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 套餐订单列表分页查询接口
 * Summary: 套餐订单列表分页查询接口
 */
func (client *Client) QueryComboOrder(request *QueryComboOrderRequest) (_result *QueryComboOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryComboOrderResponse{}
	_body, _err := client.QueryComboOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 套餐订单列表分页查询接口
 * Summary: 套餐订单列表分页查询接口
 */
func (client *Client) QueryComboOrderEx(request *QueryComboOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryComboOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryComboOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询套餐列表，支持分页查询
 * Summary: 查询套餐列表
 */
func (client *Client) QueryCombo(request *QueryComboRequest) (_result *QueryComboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryComboResponse{}
	_body, _err := client.QueryComboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询套餐列表，支持分页查询
 * Summary: 查询套餐列表
 */
func (client *Client) QueryComboEx(request *QueryComboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryComboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryComboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 套餐订单支付接口
 * Summary: 套餐订单支付接口
 */
func (client *Client) PayComboOrder(request *PayComboOrderRequest) (_result *PayComboOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayComboOrderResponse{}
	_body, _err := client.PayComboOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 套餐订单支付接口
 * Summary: 套餐订单支付接口
 */
func (client *Client) PayComboOrderEx(request *PayComboOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayComboOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayComboOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.order.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
 * Summary: 通用下单接口
 */
func (client *Client) CreateOrder(request *CreateOrderRequest) (_result *CreateOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOrderResponse{}
	_body, _err := client.CreateOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
 * Summary: 通用下单接口
 */
func (client *Client) CreateOrderEx(request *CreateOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
 * Summary: 判断租户是否存在个性化定价
 */
func (client *Client) ExistPricePersonalized(request *ExistPricePersonalizedRequest) (_result *ExistPricePersonalizedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExistPricePersonalizedResponse{}
	_body, _err := client.ExistPricePersonalizedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
 * Summary: 判断租户是否存在个性化定价
 */
func (client *Client) ExistPricePersonalizedEx(request *ExistPricePersonalizedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExistPricePersonalizedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExistPricePersonalizedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.price.personalized.exist"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
 * Summary: 商品询价接口
 */
func (client *Client) QueryPrice(request *QueryPriceRequest) (_result *QueryPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPriceResponse{}
	_body, _err := client.QueryPriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
 * Summary: 商品询价接口
 */
func (client *Client) QueryPriceEx(request *QueryPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.price.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实例接口查询
 * Summary: 实例接口查询
 */
func (client *Client) QueryWareslifeInstance(request *QueryWareslifeInstanceRequest) (_result *QueryWareslifeInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWareslifeInstanceResponse{}
	_body, _err := client.QueryWareslifeInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实例接口查询
 * Summary: 实例接口查询
 */
func (client *Client) QueryWareslifeInstanceEx(request *QueryWareslifeInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWareslifeInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWareslifeInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.wareslife.instance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
