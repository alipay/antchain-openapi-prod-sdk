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

// 约束条件列表
type PriceConstraintConditionVO struct {
	// 约束ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 价格约束ID
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 规格条件CODE
	SpecConditionCode *string `json:"spec_condition_code,omitempty" xml:"spec_condition_code,omitempty"`
	// 条件关系比较符
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 待比较对象的值
	TargetValue *string `json:"target_value,omitempty" xml:"target_value,omitempty"`
	// 特定场景下set才会有值
	SpecConditionName *string `json:"spec_condition_name,omitempty" xml:"spec_condition_name,omitempty"`
	// 特定场景下set才会有值
	TargetValueName *string `json:"target_value_name,omitempty" xml:"target_value_name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s PriceConstraintConditionVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintConditionVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintConditionVO) SetId(v int64) *PriceConstraintConditionVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintConditionVO) SetPriceConstraintId(v int64) *PriceConstraintConditionVO {
	s.PriceConstraintId = &v
	return s
}

func (s *PriceConstraintConditionVO) SetSpecConditionCode(v string) *PriceConstraintConditionVO {
	s.SpecConditionCode = &v
	return s
}

func (s *PriceConstraintConditionVO) SetOperator(v string) *PriceConstraintConditionVO {
	s.Operator = &v
	return s
}

func (s *PriceConstraintConditionVO) SetTargetValue(v string) *PriceConstraintConditionVO {
	s.TargetValue = &v
	return s
}

func (s *PriceConstraintConditionVO) SetSpecConditionName(v string) *PriceConstraintConditionVO {
	s.SpecConditionName = &v
	return s
}

func (s *PriceConstraintConditionVO) SetTargetValueName(v string) *PriceConstraintConditionVO {
	s.TargetValueName = &v
	return s
}

func (s *PriceConstraintConditionVO) SetDescription(v string) *PriceConstraintConditionVO {
	s.Description = &v
	return s
}

// l5数据
type OfferMaster struct {
	// 内部商品码
	InnerCode *string `json:"inner_code,omitempty" xml:"inner_code,omitempty" require:"true"`
	// 用于展示的格式化商品编码
	FormatCode *string `json:"format_code,omitempty" xml:"format_code,omitempty" require:"true"`
	// 外部商品编码
	OuterCode *string `json:"outer_code,omitempty" xml:"outer_code,omitempty" require:"true"`
	// 商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 渠道产品编码
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// l4编码
	SpuCode *string `json:"spu_code,omitempty" xml:"spu_code,omitempty" require:"true"`
}

func (s OfferMaster) String() string {
	return tea.Prettify(s)
}

func (s OfferMaster) GoString() string {
	return s.String()
}

func (s *OfferMaster) SetInnerCode(v string) *OfferMaster {
	s.InnerCode = &v
	return s
}

func (s *OfferMaster) SetFormatCode(v string) *OfferMaster {
	s.FormatCode = &v
	return s
}

func (s *OfferMaster) SetOuterCode(v string) *OfferMaster {
	s.OuterCode = &v
	return s
}

func (s *OfferMaster) SetName(v string) *OfferMaster {
	s.Name = &v
	return s
}

func (s *OfferMaster) SetDescription(v string) *OfferMaster {
	s.Description = &v
	return s
}

func (s *OfferMaster) SetProductCode(v string) *OfferMaster {
	s.ProductCode = &v
	return s
}

func (s *OfferMaster) SetServiceCode(v string) *OfferMaster {
	s.ServiceCode = &v
	return s
}

func (s *OfferMaster) SetSpuCode(v string) *OfferMaster {
	s.SpuCode = &v
	return s
}

// 约束结果
type PriceConstraintResultVO struct {
	// 价格id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 价格约束ID
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 基础价格费率
	BasePrice *string `json:"base_price,omitempty" xml:"base_price,omitempty"`
	// 基础保底价
	AdjustPrice *string `json:"adjust_price,omitempty" xml:"adjust_price,omitempty"`
	// BD销售最低价费率
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 成本价费率
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
	// 阶梯区间最小值
	LadderStart *string `json:"ladder_start,omitempty" xml:"ladder_start,omitempty"`
	// 阶梯区间结束值
	LadderEnd *string `json:"ladder_end,omitempty" xml:"ladder_end,omitempty"`
	// 价格单位，例如：元/每次
	PriceUnit *string `json:"price_unit,omitempty" xml:"price_unit,omitempty"`
	// 是否阶梯固定价
	LadderPriceFixed *bool `json:"ladder_price_fixed,omitempty" xml:"ladder_price_fixed,omitempty"`
}

func (s PriceConstraintResultVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintResultVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintResultVO) SetId(v int64) *PriceConstraintResultVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintResultVO) SetPriceConstraintId(v int64) *PriceConstraintResultVO {
	s.PriceConstraintId = &v
	return s
}

func (s *PriceConstraintResultVO) SetBasePrice(v string) *PriceConstraintResultVO {
	s.BasePrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetAdjustPrice(v string) *PriceConstraintResultVO {
	s.AdjustPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetBdPrice(v string) *PriceConstraintResultVO {
	s.BdPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetCostPrice(v string) *PriceConstraintResultVO {
	s.CostPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderStart(v string) *PriceConstraintResultVO {
	s.LadderStart = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderEnd(v string) *PriceConstraintResultVO {
	s.LadderEnd = &v
	return s
}

func (s *PriceConstraintResultVO) SetPriceUnit(v string) *PriceConstraintResultVO {
	s.PriceUnit = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderPriceFixed(v bool) *PriceConstraintResultVO {
	s.LadderPriceFixed = &v
	return s
}

// 潜客接受度市场逻辑明细
type AcceptanceDetail struct {
	// 客户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 客户价格
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
}

func (s AcceptanceDetail) String() string {
	return tea.Prettify(s)
}

func (s AcceptanceDetail) GoString() string {
	return s.String()
}

func (s *AcceptanceDetail) SetName(v string) *AcceptanceDetail {
	s.Name = &v
	return s
}

func (s *AcceptanceDetail) SetPrice(v string) *AcceptanceDetail {
	s.Price = &v
	return s
}

// 基于竞品及加成市场逻辑明细
type AdditionDetail struct {
	// 友商名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 友商价格
	Profit *string `json:"profit,omitempty" xml:"profit,omitempty"`
	// 技术分调整
	TechnicalScore *string `json:"technical_score,omitempty" xml:"technical_score,omitempty"`
	// 品牌分调整
	BrandScore *string `json:"brand_score,omitempty" xml:"brand_score,omitempty"`
	// BD权限价预估
	BdPricePredict *string `json:"bd_price_predict,omitempty" xml:"bd_price_predict,omitempty"`
}

func (s AdditionDetail) String() string {
	return tea.Prettify(s)
}

func (s AdditionDetail) GoString() string {
	return s.String()
}

func (s *AdditionDetail) SetName(v string) *AdditionDetail {
	s.Name = &v
	return s
}

func (s *AdditionDetail) SetProfit(v string) *AdditionDetail {
	s.Profit = &v
	return s
}

func (s *AdditionDetail) SetTechnicalScore(v string) *AdditionDetail {
	s.TechnicalScore = &v
	return s
}

func (s *AdditionDetail) SetBrandScore(v string) *AdditionDetail {
	s.BrandScore = &v
	return s
}

func (s *AdditionDetail) SetBdPricePredict(v string) *AdditionDetail {
	s.BdPricePredict = &v
	return s
}

// 成本法信息
type CostInfo struct {
	// 成本法原因
	CostReason *string `json:"cost_reason,omitempty" xml:"cost_reason,omitempty"`
	// 预期毛利率
	PredictProfit *string `json:"predict_profit,omitempty" xml:"predict_profit,omitempty"`
}

func (s CostInfo) String() string {
	return tea.Prettify(s)
}

func (s CostInfo) GoString() string {
	return s.String()
}

func (s *CostInfo) SetCostReason(v string) *CostInfo {
	s.CostReason = &v
	return s
}

func (s *CostInfo) SetPredictProfit(v string) *CostInfo {
	s.PredictProfit = &v
	return s
}

// 定价计划对应的约束
type PriceConstraintVO struct {
	// 定价计划ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 定价计划ID
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 定价计划名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 约束条件列表
	PriceConstraintConditionVoList []*PriceConstraintConditionVO `json:"price_constraint_condition_vo_list,omitempty" xml:"price_constraint_condition_vo_list,omitempty" type:"Repeated"`
	// 约束结果列表
	PriceConstraintResultVoList []*PriceConstraintResultVO `json:"price_constraint_result_vo_list,omitempty" xml:"price_constraint_result_vo_list,omitempty" type:"Repeated"`
}

func (s PriceConstraintVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintVO) SetId(v int64) *PriceConstraintVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintVO) SetPricePlanId(v int64) *PriceConstraintVO {
	s.PricePlanId = &v
	return s
}

func (s *PriceConstraintVO) SetName(v string) *PriceConstraintVO {
	s.Name = &v
	return s
}

func (s *PriceConstraintVO) SetDescription(v string) *PriceConstraintVO {
	s.Description = &v
	return s
}

func (s *PriceConstraintVO) SetPriceConstraintConditionVoList(v []*PriceConstraintConditionVO) *PriceConstraintVO {
	s.PriceConstraintConditionVoList = v
	return s
}

func (s *PriceConstraintVO) SetPriceConstraintResultVoList(v []*PriceConstraintResultVO) *PriceConstraintVO {
	s.PriceConstraintResultVoList = v
	return s
}

// 客户价价值法信息
type CustomerValueDetail struct {
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 友商价格
	Profit *string `json:"profit,omitempty" xml:"profit,omitempty"`
	// 蚂蚁收益
	AntDivide *string `json:"ant_divide,omitempty" xml:"ant_divide,omitempty"`
	// BD权限价预估
	BdPricePredict *string `json:"bd_price_predict,omitempty" xml:"bd_price_predict,omitempty"`
}

func (s CustomerValueDetail) String() string {
	return tea.Prettify(s)
}

func (s CustomerValueDetail) GoString() string {
	return s.String()
}

func (s *CustomerValueDetail) SetName(v string) *CustomerValueDetail {
	s.Name = &v
	return s
}

func (s *CustomerValueDetail) SetProfit(v string) *CustomerValueDetail {
	s.Profit = &v
	return s
}

func (s *CustomerValueDetail) SetAntDivide(v string) *CustomerValueDetail {
	s.AntDivide = &v
	return s
}

func (s *CustomerValueDetail) SetBdPricePredict(v string) *CustomerValueDetail {
	s.BdPricePredict = &v
	return s
}

// 价格限制策略
// 目前只支持保底价格配置
type PriceLimitStrategyDTO struct {
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改人
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 是否删除
	Deleted *bool `json:"deleted,omitempty" xml:"deleted,omitempty"`
	// 定价计划ID
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 保底周期,year年、month月
	DurationType *string `json:"duration_type,omitempty" xml:"duration_type,omitempty"`
	// 保底价格
	GuaranteePrice *string `json:"guarantee_price,omitempty" xml:"guarantee_price,omitempty"`
	// 产品成本
	GuaranteeCostPrice *string `json:"guarantee_cost_price,omitempty" xml:"guarantee_cost_price,omitempty"`
}

func (s PriceLimitStrategyDTO) String() string {
	return tea.Prettify(s)
}

func (s PriceLimitStrategyDTO) GoString() string {
	return s.String()
}

func (s *PriceLimitStrategyDTO) SetCreator(v string) *PriceLimitStrategyDTO {
	s.Creator = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetModifier(v string) *PriceLimitStrategyDTO {
	s.Modifier = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetDeleted(v bool) *PriceLimitStrategyDTO {
	s.Deleted = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetPricePlanId(v int64) *PriceLimitStrategyDTO {
	s.PricePlanId = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetDurationType(v string) *PriceLimitStrategyDTO {
	s.DurationType = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetGuaranteePrice(v string) *PriceLimitStrategyDTO {
	s.GuaranteePrice = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetGuaranteeCostPrice(v string) *PriceLimitStrategyDTO {
	s.GuaranteeCostPrice = &v
	return s
}

// 市场法信息
type MarketInfo struct {
	// 市场逻辑
	MarketLogic *string `json:"market_logic,omitempty" xml:"market_logic,omitempty"`
	// 潜客接受度
	AcceptanceDetails []*AcceptanceDetail `json:"acceptance_details,omitempty" xml:"acceptance_details,omitempty" type:"Repeated"`
	// 基于竞品及加成
	AdditionDetails []*AdditionDetail `json:"addition_details,omitempty" xml:"addition_details,omitempty" type:"Repeated"`
}

func (s MarketInfo) String() string {
	return tea.Prettify(s)
}

func (s MarketInfo) GoString() string {
	return s.String()
}

func (s *MarketInfo) SetMarketLogic(v string) *MarketInfo {
	s.MarketLogic = &v
	return s
}

func (s *MarketInfo) SetAcceptanceDetails(v []*AcceptanceDetail) *MarketInfo {
	s.AcceptanceDetails = v
	return s
}

func (s *MarketInfo) SetAdditionDetails(v []*AdditionDetail) *MarketInfo {
	s.AdditionDetails = v
	return s
}

// 产品线SPU
type ProductSpu struct {
	// SPU编码
	SpuCode *string `json:"spu_code,omitempty" xml:"spu_code,omitempty" require:"true"`
	// SPU名称
	SpuName *string `json:"spu_name,omitempty" xml:"spu_name,omitempty" require:"true"`
	// spu描述
	SpuDesc *string `json:"spu_desc,omitempty" xml:"spu_desc,omitempty" require:"true"`
	// 交付模式，ONLINE/OFFLINE
	DeliveryMode *string `json:"delivery_mode,omitempty" xml:"delivery_mode,omitempty" require:"true"`
	// 归属产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 是否涉及一方化
	InvolvedOneParty *bool `json:"involved_one_party,omitempty" xml:"involved_one_party,omitempty" require:"true"`
	// technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
	Segment *string `json:"segment,omitempty" xml:"segment,omitempty" require:"true"`
	// sku数据
	OfferMaster []*OfferMaster `json:"offer_master,omitempty" xml:"offer_master,omitempty" require:"true" type:"Repeated"`
}

func (s ProductSpu) String() string {
	return tea.Prettify(s)
}

func (s ProductSpu) GoString() string {
	return s.String()
}

func (s *ProductSpu) SetSpuCode(v string) *ProductSpu {
	s.SpuCode = &v
	return s
}

func (s *ProductSpu) SetSpuName(v string) *ProductSpu {
	s.SpuName = &v
	return s
}

func (s *ProductSpu) SetSpuDesc(v string) *ProductSpu {
	s.SpuDesc = &v
	return s
}

func (s *ProductSpu) SetDeliveryMode(v string) *ProductSpu {
	s.DeliveryMode = &v
	return s
}

func (s *ProductSpu) SetProductCode(v string) *ProductSpu {
	s.ProductCode = &v
	return s
}

func (s *ProductSpu) SetInvolvedOneParty(v bool) *ProductSpu {
	s.InvolvedOneParty = &v
	return s
}

func (s *ProductSpu) SetSegment(v string) *ProductSpu {
	s.Segment = &v
	return s
}

func (s *ProductSpu) SetOfferMaster(v []*OfferMaster) *ProductSpu {
	s.OfferMaster = v
	return s
}

// L3
type BusinessProduct struct {
	// 业务产品code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品线名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 归属业务线
	BusinessLine *string `json:"business_line,omitempty" xml:"business_line,omitempty" require:"true"`
	// 归属产品线
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// spu列表
	ProductSpu []*ProductSpu `json:"product_spu,omitempty" xml:"product_spu,omitempty" require:"true" type:"Repeated"`
}

func (s BusinessProduct) String() string {
	return tea.Prettify(s)
}

func (s BusinessProduct) GoString() string {
	return s.String()
}

func (s *BusinessProduct) SetCode(v string) *BusinessProduct {
	s.Code = &v
	return s
}

func (s *BusinessProduct) SetName(v string) *BusinessProduct {
	s.Name = &v
	return s
}

func (s *BusinessProduct) SetBusinessLine(v string) *BusinessProduct {
	s.BusinessLine = &v
	return s
}

func (s *BusinessProduct) SetProductLine(v string) *BusinessProduct {
	s.ProductLine = &v
	return s
}

func (s *BusinessProduct) SetProductSpu(v []*ProductSpu) *BusinessProduct {
	s.ProductSpu = v
	return s
}

// 定价计划
type PricePlanVO struct {
	// 定价计划ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 商品CODE
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 定价对象CODE
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty" require:"true"`
	// 定价计划名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 定价计划类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 合同ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 政策ID
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty"`
	// 商务项目ID
	BusinessProjectId *string `json:"business_project_id,omitempty" xml:"business_project_id,omitempty"`
	// 执行条件
	ExecuteCondition *string `json:"execute_condition,omitempty" xml:"execute_condition,omitempty"`
	// 优先级
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 价格匹配不到处理策略：抛异常，继续询价
	NoMatchRule *string `json:"no_match_rule,omitempty" xml:"no_match_rule,omitempty"`
	// 计价模式：公式、阶梯、自定义
	PricingMode *string `json:"pricing_mode,omitempty" xml:"pricing_mode,omitempty"`
	// 计价方法：具体公式、阶梯方法、自定义
	PricingMethod *string `json:"pricing_method,omitempty" xml:"pricing_method,omitempty"`
	// 阶梯区间类型，左开右闭/左闭右开
	LadderIntervalType *string `json:"ladder_interval_type,omitempty" xml:"ladder_interval_type,omitempty"`
	// 父定价计划ID
	ParentPricePlanId *int64 `json:"parent_price_plan_id,omitempty" xml:"parent_price_plan_id,omitempty"`
	// 定价计划状态，编辑中、预发生效、线上生效、失效
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 生效起始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改者
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 是否是基础价格
	Basis *string `json:"basis,omitempty" xml:"basis,omitempty"`
	// 价格条件，多个以分号分隔
	PriceConditionCodes *string `json:"price_condition_codes,omitempty" xml:"price_condition_codes,omitempty"`
	// 价格安全区间，格式 min,max如0,100
	PriceSafeArea *string `json:"price_safe_area,omitempty" xml:"price_safe_area,omitempty" require:"true"`
	// 关联模板
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 关联审批流程
	BpmsProcessId *string `json:"bpms_process_id,omitempty" xml:"bpms_process_id,omitempty"`
	// 定价策略
	Strategy *string `json:"strategy,omitempty" xml:"strategy,omitempty"`
	// 定价阶段
	PriceStage *string `json:"price_stage,omitempty" xml:"price_stage,omitempty"`
	// 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
	PriceConstraintVoList []*PriceConstraintVO `json:"price_constraint_vo_list,omitempty" xml:"price_constraint_vo_list,omitempty" type:"Repeated"`
	// 价格限制策略
	PriceLimitStrategyDto []*PriceLimitStrategyDTO `json:"price_limit_strategy_dto,omitempty" xml:"price_limit_strategy_dto,omitempty" type:"Repeated"`
	// 销售渠道
	SaleChannel []*string `json:"sale_channel,omitempty" xml:"sale_channel,omitempty" type:"Repeated"`
	// 官网售卖折扣设置
	OfficialSellDiscount *string `json:"official_sell_discount,omitempty" xml:"official_sell_discount,omitempty"`
	// 客户法详情
	CustomerValueInfo *CustomerValueDetail `json:"customer_value_info,omitempty" xml:"customer_value_info,omitempty"`
	// 市场法详情
	MarketInfo *MarketInfo `json:"market_info,omitempty" xml:"market_info,omitempty"`
	// 成本法详情
	CostInfo *CostInfo `json:"cost_info,omitempty" xml:"cost_info,omitempty"`
}

func (s PricePlanVO) String() string {
	return tea.Prettify(s)
}

func (s PricePlanVO) GoString() string {
	return s.String()
}

func (s *PricePlanVO) SetId(v int64) *PricePlanVO {
	s.Id = &v
	return s
}

func (s *PricePlanVO) SetCommodityCode(v string) *PricePlanVO {
	s.CommodityCode = &v
	return s
}

func (s *PricePlanVO) SetPriceObjectCode(v string) *PricePlanVO {
	s.PriceObjectCode = &v
	return s
}

func (s *PricePlanVO) SetName(v string) *PricePlanVO {
	s.Name = &v
	return s
}

func (s *PricePlanVO) SetType(v string) *PricePlanVO {
	s.Type = &v
	return s
}

func (s *PricePlanVO) SetTenantId(v string) *PricePlanVO {
	s.TenantId = &v
	return s
}

func (s *PricePlanVO) SetContractId(v string) *PricePlanVO {
	s.ContractId = &v
	return s
}

func (s *PricePlanVO) SetPolicyId(v string) *PricePlanVO {
	s.PolicyId = &v
	return s
}

func (s *PricePlanVO) SetBusinessProjectId(v string) *PricePlanVO {
	s.BusinessProjectId = &v
	return s
}

func (s *PricePlanVO) SetExecuteCondition(v string) *PricePlanVO {
	s.ExecuteCondition = &v
	return s
}

func (s *PricePlanVO) SetPriority(v int64) *PricePlanVO {
	s.Priority = &v
	return s
}

func (s *PricePlanVO) SetNoMatchRule(v string) *PricePlanVO {
	s.NoMatchRule = &v
	return s
}

func (s *PricePlanVO) SetPricingMode(v string) *PricePlanVO {
	s.PricingMode = &v
	return s
}

func (s *PricePlanVO) SetPricingMethod(v string) *PricePlanVO {
	s.PricingMethod = &v
	return s
}

func (s *PricePlanVO) SetLadderIntervalType(v string) *PricePlanVO {
	s.LadderIntervalType = &v
	return s
}

func (s *PricePlanVO) SetParentPricePlanId(v int64) *PricePlanVO {
	s.ParentPricePlanId = &v
	return s
}

func (s *PricePlanVO) SetStatus(v string) *PricePlanVO {
	s.Status = &v
	return s
}

func (s *PricePlanVO) SetStartTime(v string) *PricePlanVO {
	s.StartTime = &v
	return s
}

func (s *PricePlanVO) SetEndTime(v string) *PricePlanVO {
	s.EndTime = &v
	return s
}

func (s *PricePlanVO) SetCreator(v string) *PricePlanVO {
	s.Creator = &v
	return s
}

func (s *PricePlanVO) SetModifier(v string) *PricePlanVO {
	s.Modifier = &v
	return s
}

func (s *PricePlanVO) SetGmtCreate(v string) *PricePlanVO {
	s.GmtCreate = &v
	return s
}

func (s *PricePlanVO) SetGmtModified(v string) *PricePlanVO {
	s.GmtModified = &v
	return s
}

func (s *PricePlanVO) SetBasis(v string) *PricePlanVO {
	s.Basis = &v
	return s
}

func (s *PricePlanVO) SetPriceConditionCodes(v string) *PricePlanVO {
	s.PriceConditionCodes = &v
	return s
}

func (s *PricePlanVO) SetPriceSafeArea(v string) *PricePlanVO {
	s.PriceSafeArea = &v
	return s
}

func (s *PricePlanVO) SetTemplateCode(v string) *PricePlanVO {
	s.TemplateCode = &v
	return s
}

func (s *PricePlanVO) SetBpmsProcessId(v string) *PricePlanVO {
	s.BpmsProcessId = &v
	return s
}

func (s *PricePlanVO) SetStrategy(v string) *PricePlanVO {
	s.Strategy = &v
	return s
}

func (s *PricePlanVO) SetPriceStage(v string) *PricePlanVO {
	s.PriceStage = &v
	return s
}

func (s *PricePlanVO) SetPriceConstraintVoList(v []*PriceConstraintVO) *PricePlanVO {
	s.PriceConstraintVoList = v
	return s
}

func (s *PricePlanVO) SetPriceLimitStrategyDto(v []*PriceLimitStrategyDTO) *PricePlanVO {
	s.PriceLimitStrategyDto = v
	return s
}

func (s *PricePlanVO) SetSaleChannel(v []*string) *PricePlanVO {
	s.SaleChannel = v
	return s
}

func (s *PricePlanVO) SetOfficialSellDiscount(v string) *PricePlanVO {
	s.OfficialSellDiscount = &v
	return s
}

func (s *PricePlanVO) SetCustomerValueInfo(v *CustomerValueDetail) *PricePlanVO {
	s.CustomerValueInfo = v
	return s
}

func (s *PricePlanVO) SetMarketInfo(v *MarketInfo) *PricePlanVO {
	s.MarketInfo = v
	return s
}

func (s *PricePlanVO) SetCostInfo(v *CostInfo) *PricePlanVO {
	s.CostInfo = v
	return s
}

// L2
type ProductLine struct {
	// 溯源产品
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品线名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 业务产品线code
	BusinessLineCode *string `json:"business_line_code,omitempty" xml:"business_line_code,omitempty" require:"true"`
	// l3
	BusinessProduct []*BusinessProduct `json:"business_product,omitempty" xml:"business_product,omitempty" require:"true" type:"Repeated"`
}

func (s ProductLine) String() string {
	return tea.Prettify(s)
}

func (s ProductLine) GoString() string {
	return s.String()
}

func (s *ProductLine) SetCode(v string) *ProductLine {
	s.Code = &v
	return s
}

func (s *ProductLine) SetName(v string) *ProductLine {
	s.Name = &v
	return s
}

func (s *ProductLine) SetBusinessLineCode(v string) *ProductLine {
	s.BusinessLineCode = &v
	return s
}

func (s *ProductLine) SetBusinessProduct(v []*BusinessProduct) *ProductLine {
	s.BusinessProduct = v
	return s
}

// 收费项结果明细
type PriceObjectFee struct {
	// 收费项CODE
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty"`
	// 收费项名称
	PriceObjectName *string `json:"price_object_name,omitempty" xml:"price_object_name,omitempty"`
	// 高精度价格12位
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 价格类型，标准价格，一客一价
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty"`
	// 结算信息
	SettleType *string `json:"settle_type,omitempty" xml:"settle_type,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 命中的定价计划
	PricePlanVo *PricePlanVO `json:"price_plan_vo,omitempty" xml:"price_plan_vo,omitempty"`
	// 命中的定价计划约束
	PriceConstraintVo *PriceConstraintVO `json:"price_constraint_vo,omitempty" xml:"price_constraint_vo,omitempty"`
	// 扩展信息
	ExtendsMap *string `json:"extends_map,omitempty" xml:"extends_map,omitempty"`
	// BD销售价格区间
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 最低成本价
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
}

func (s PriceObjectFee) String() string {
	return tea.Prettify(s)
}

func (s PriceObjectFee) GoString() string {
	return s.String()
}

func (s *PriceObjectFee) SetPriceObjectCode(v string) *PriceObjectFee {
	s.PriceObjectCode = &v
	return s
}

func (s *PriceObjectFee) SetPriceObjectName(v string) *PriceObjectFee {
	s.PriceObjectName = &v
	return s
}

func (s *PriceObjectFee) SetPrice(v string) *PriceObjectFee {
	s.Price = &v
	return s
}

func (s *PriceObjectFee) SetPriceType(v string) *PriceObjectFee {
	s.PriceType = &v
	return s
}

func (s *PriceObjectFee) SetSettleType(v string) *PriceObjectFee {
	s.SettleType = &v
	return s
}

func (s *PriceObjectFee) SetCurrency(v string) *PriceObjectFee {
	s.Currency = &v
	return s
}

func (s *PriceObjectFee) SetPricePlanVo(v *PricePlanVO) *PriceObjectFee {
	s.PricePlanVo = v
	return s
}

func (s *PriceObjectFee) SetPriceConstraintVo(v *PriceConstraintVO) *PriceObjectFee {
	s.PriceConstraintVo = v
	return s
}

func (s *PriceObjectFee) SetExtendsMap(v string) *PriceObjectFee {
	s.ExtendsMap = &v
	return s
}

func (s *PriceObjectFee) SetBdPrice(v string) *PriceObjectFee {
	s.BdPrice = &v
	return s
}

func (s *PriceObjectFee) SetCostPrice(v string) *PriceObjectFee {
	s.CostPrice = &v
	return s
}

// Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
type ProductBaseInfo struct {
	// 产品码，系统内部识别
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品英文名称
	NameEn *string `json:"name_en,omitempty" xml:"name_en,omitempty"`
	// 产品短码，管理维度识别
	ShortCode *string `json:"short_code,omitempty" xml:"short_code,omitempty" require:"true"`
}

func (s ProductBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductBaseInfo) GoString() string {
	return s.String()
}

func (s *ProductBaseInfo) SetCode(v string) *ProductBaseInfo {
	s.Code = &v
	return s
}

func (s *ProductBaseInfo) SetName(v string) *ProductBaseInfo {
	s.Name = &v
	return s
}

func (s *ProductBaseInfo) SetNameEn(v string) *ProductBaseInfo {
	s.NameEn = &v
	return s
}

func (s *ProductBaseInfo) SetShortCode(v string) *ProductBaseInfo {
	s.ShortCode = &v
	return s
}

// L1
type BusinessLine struct {
	// 产品线code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 1级产品线name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// L2
	ProductLine []*ProductLine `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true" type:"Repeated"`
}

func (s BusinessLine) String() string {
	return tea.Prettify(s)
}

func (s BusinessLine) GoString() string {
	return s.String()
}

func (s *BusinessLine) SetCode(v string) *BusinessLine {
	s.Code = &v
	return s
}

func (s *BusinessLine) SetName(v string) *BusinessLine {
	s.Name = &v
	return s
}

func (s *BusinessLine) SetProductLine(v []*ProductLine) *BusinessLine {
	s.ProductLine = v
	return s
}

// 客户价值法信息
type CustomerValueInfo struct {
	// 客户价价值法信息
	CustomerValueDetails []*CustomerValueDetail `json:"customer_value_details,omitempty" xml:"customer_value_details,omitempty" type:"Repeated"`
}

func (s CustomerValueInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerValueInfo) GoString() string {
	return s.String()
}

func (s *CustomerValueInfo) SetCustomerValueDetails(v []*CustomerValueDetail) *CustomerValueInfo {
	s.CustomerValueDetails = v
	return s
}

// 返回高精度12位价格,其他精度可使用工具类处理
type InquiryPriceResponse struct {
	// 高精度12位价格
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// BD销售价格(高精度12位)
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 最低成本价(高精度12位)
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
	// 收费项结果明细列表
	PriceObjectFeeList []*PriceObjectFee `json:"price_object_fee_list,omitempty" xml:"price_object_fee_list,omitempty" type:"Repeated"`
}

func (s InquiryPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s InquiryPriceResponse) GoString() string {
	return s.String()
}

func (s *InquiryPriceResponse) SetPrice(v string) *InquiryPriceResponse {
	s.Price = &v
	return s
}

func (s *InquiryPriceResponse) SetCurrency(v string) *InquiryPriceResponse {
	s.Currency = &v
	return s
}

func (s *InquiryPriceResponse) SetBdPrice(v string) *InquiryPriceResponse {
	s.BdPrice = &v
	return s
}

func (s *InquiryPriceResponse) SetCostPrice(v string) *InquiryPriceResponse {
	s.CostPrice = &v
	return s
}

func (s *InquiryPriceResponse) SetPriceObjectFeeList(v []*PriceObjectFee) *InquiryPriceResponse {
	s.PriceObjectFeeList = v
	return s
}

// 商品结构
type Commodity struct {
	// 商品编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s Commodity) String() string {
	return tea.Prettify(s)
}

func (s Commodity) GoString() string {
	return s.String()
}

func (s *Commodity) SetCode(v string) *Commodity {
	s.Code = &v
	return s
}

func (s *Commodity) SetName(v string) *Commodity {
	s.Name = &v
	return s
}

func (s *Commodity) SetStatus(v string) *Commodity {
	s.Status = &v
	return s
}

type QueryProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码,可以为空
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s QueryProductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProductRequest) GoString() string {
	return s.String()
}

func (s *QueryProductRequest) SetAuthToken(v string) *QueryProductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProductRequest) SetCode(v string) *QueryProductRequest {
	s.Code = &v
	return s
}

type QueryProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品列表
	ProductArray []*ProductBaseInfo `json:"product_array,omitempty" xml:"product_array,omitempty" type:"Repeated"`
}

func (s QueryProductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProductResponse) GoString() string {
	return s.String()
}

func (s *QueryProductResponse) SetReqMsgId(v string) *QueryProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProductResponse) SetResultCode(v string) *QueryProductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProductResponse) SetResultMsg(v string) *QueryProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProductResponse) SetProductArray(v []*ProductBaseInfo) *QueryProductResponse {
	s.ProductArray = v
	return s
}

type ExportCommodityConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
}

func (s ExportCommodityConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportCommodityConfigRequest) GoString() string {
	return s.String()
}

func (s *ExportCommodityConfigRequest) SetAuthToken(v string) *ExportCommodityConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportCommodityConfigRequest) SetCommodityCode(v string) *ExportCommodityConfigRequest {
	s.CommodityCode = &v
	return s
}

type ExportCommodityConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 导出的商品配置数据
	Config *string `json:"config,omitempty" xml:"config,omitempty"`
}

func (s ExportCommodityConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportCommodityConfigResponse) GoString() string {
	return s.String()
}

func (s *ExportCommodityConfigResponse) SetReqMsgId(v string) *ExportCommodityConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportCommodityConfigResponse) SetResultCode(v string) *ExportCommodityConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportCommodityConfigResponse) SetResultMsg(v string) *ExportCommodityConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportCommodityConfigResponse) SetConfig(v string) *ExportCommodityConfigResponse {
	s.Config = &v
	return s
}

type PagequeryCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 商品状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 页数，不填则默认1
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页页数，不填则默认20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s PagequeryCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryCommodityRequest) GoString() string {
	return s.String()
}

func (s *PagequeryCommodityRequest) SetAuthToken(v string) *PagequeryCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryCommodityRequest) SetProductCode(v string) *PagequeryCommodityRequest {
	s.ProductCode = &v
	return s
}

func (s *PagequeryCommodityRequest) SetStatus(v string) *PagequeryCommodityRequest {
	s.Status = &v
	return s
}

func (s *PagequeryCommodityRequest) SetPageNo(v int64) *PagequeryCommodityRequest {
	s.PageNo = &v
	return s
}

func (s *PagequeryCommodityRequest) SetPageSize(v int64) *PagequeryCommodityRequest {
	s.PageSize = &v
	return s
}

type PagequeryCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品列表
	Commodities []*Commodity `json:"commodities,omitempty" xml:"commodities,omitempty" type:"Repeated"`
	// 商品总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 当前页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页页数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s PagequeryCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryCommodityResponse) GoString() string {
	return s.String()
}

func (s *PagequeryCommodityResponse) SetReqMsgId(v string) *PagequeryCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryCommodityResponse) SetResultCode(v string) *PagequeryCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryCommodityResponse) SetResultMsg(v string) *PagequeryCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryCommodityResponse) SetCommodities(v []*Commodity) *PagequeryCommodityResponse {
	s.Commodities = v
	return s
}

func (s *PagequeryCommodityResponse) SetTotalCount(v int64) *PagequeryCommodityResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryCommodityResponse) SetPageNo(v int64) *PagequeryCommodityResponse {
	s.PageNo = &v
	return s
}

func (s *PagequeryCommodityResponse) SetPageSize(v int64) *PagequeryCommodityResponse {
	s.PageSize = &v
	return s
}

type ImportProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 幂等编码，需要唯一
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 所属业务线
	BusinessLine *string `json:"business_line,omitempty" xml:"business_line,omitempty" require:"true"`
	// 所属产品线
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// pd
	Pds []*string `json:"pds,omitempty" xml:"pds,omitempty" require:"true" type:"Repeated"`
	// pd负责人
	PdLeaders []*string `json:"pd_leaders,omitempty" xml:"pd_leaders,omitempty" require:"true" type:"Repeated"`
	// 研发负责人
	DevLeaders []*string `json:"dev_leaders,omitempty" xml:"dev_leaders,omitempty" require:"true" type:"Repeated"`
	// 研发人员
	Devs []*string `json:"devs,omitempty" xml:"devs,omitempty" type:"Repeated"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s ImportProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportProductRequest) GoString() string {
	return s.String()
}

func (s *ImportProductRequest) SetAuthToken(v string) *ImportProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportProductRequest) SetBizNo(v string) *ImportProductRequest {
	s.BizNo = &v
	return s
}

func (s *ImportProductRequest) SetBusinessLine(v string) *ImportProductRequest {
	s.BusinessLine = &v
	return s
}

func (s *ImportProductRequest) SetProductLine(v string) *ImportProductRequest {
	s.ProductLine = &v
	return s
}

func (s *ImportProductRequest) SetName(v string) *ImportProductRequest {
	s.Name = &v
	return s
}

func (s *ImportProductRequest) SetDescription(v string) *ImportProductRequest {
	s.Description = &v
	return s
}

func (s *ImportProductRequest) SetPds(v []*string) *ImportProductRequest {
	s.Pds = v
	return s
}

func (s *ImportProductRequest) SetPdLeaders(v []*string) *ImportProductRequest {
	s.PdLeaders = v
	return s
}

func (s *ImportProductRequest) SetDevLeaders(v []*string) *ImportProductRequest {
	s.DevLeaders = v
	return s
}

func (s *ImportProductRequest) SetDevs(v []*string) *ImportProductRequest {
	s.Devs = v
	return s
}

func (s *ImportProductRequest) SetOperator(v string) *ImportProductRequest {
	s.Operator = &v
	return s
}

type ImportProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportProductResponse) GoString() string {
	return s.String()
}

func (s *ImportProductResponse) SetReqMsgId(v string) *ImportProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportProductResponse) SetResultCode(v string) *ImportProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportProductResponse) SetResultMsg(v string) *ImportProductResponse {
	s.ResultMsg = &v
	return s
}

type QueryCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 关键词，模糊查询商品名称、商品code、商品格式化编码
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 搜索返回条数限制
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty"`
}

func (s QueryCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommodityRequest) GoString() string {
	return s.String()
}

func (s *QueryCommodityRequest) SetAuthToken(v string) *QueryCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommodityRequest) SetKeyword(v string) *QueryCommodityRequest {
	s.Keyword = &v
	return s
}

func (s *QueryCommodityRequest) SetLimit(v int64) *QueryCommodityRequest {
	s.Limit = &v
	return s
}

type QueryCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品列表
	Commoditys []*Commodity `json:"commoditys,omitempty" xml:"commoditys,omitempty" type:"Repeated"`
}

func (s QueryCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommodityResponse) GoString() string {
	return s.String()
}

func (s *QueryCommodityResponse) SetReqMsgId(v string) *QueryCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommodityResponse) SetResultCode(v string) *QueryCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommodityResponse) SetResultMsg(v string) *QueryCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommodityResponse) SetCommoditys(v []*Commodity) *QueryCommodityResponse {
	s.Commoditys = v
	return s
}

type BindCommodityAccessRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品编码
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 服务接入码
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true"`
}

func (s BindCommodityAccessRequest) String() string {
	return tea.Prettify(s)
}

func (s BindCommodityAccessRequest) GoString() string {
	return s.String()
}

func (s *BindCommodityAccessRequest) SetAuthToken(v string) *BindCommodityAccessRequest {
	s.AuthToken = &v
	return s
}

func (s *BindCommodityAccessRequest) SetCommodityCode(v string) *BindCommodityAccessRequest {
	s.CommodityCode = &v
	return s
}

func (s *BindCommodityAccessRequest) SetAccessCode(v string) *BindCommodityAccessRequest {
	s.AccessCode = &v
	return s
}

type BindCommodityAccessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindCommodityAccessResponse) String() string {
	return tea.Prettify(s)
}

func (s BindCommodityAccessResponse) GoString() string {
	return s.String()
}

func (s *BindCommodityAccessResponse) SetReqMsgId(v string) *BindCommodityAccessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindCommodityAccessResponse) SetResultCode(v string) *BindCommodityAccessResponse {
	s.ResultCode = &v
	return s
}

func (s *BindCommodityAccessResponse) SetResultMsg(v string) *BindCommodityAccessResponse {
	s.ResultMsg = &v
	return s
}

type QueryProductLineRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 是否查询l3级产品
	NeedProduct *bool `json:"need_product,omitempty" xml:"need_product,omitempty" require:"true"`
	// 是否查询l5
	NeedSku *bool `json:"need_sku,omitempty" xml:"need_sku,omitempty" require:"true"`
}

func (s QueryProductLineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProductLineRequest) GoString() string {
	return s.String()
}

func (s *QueryProductLineRequest) SetAuthToken(v string) *QueryProductLineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProductLineRequest) SetNeedProduct(v bool) *QueryProductLineRequest {
	s.NeedProduct = &v
	return s
}

func (s *QueryProductLineRequest) SetNeedSku(v bool) *QueryProductLineRequest {
	s.NeedSku = &v
	return s
}

type QueryProductLineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品树JSON字符串
	ProductTree []*BusinessLine `json:"product_tree,omitempty" xml:"product_tree,omitempty" type:"Repeated"`
}

func (s QueryProductLineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProductLineResponse) GoString() string {
	return s.String()
}

func (s *QueryProductLineResponse) SetReqMsgId(v string) *QueryProductLineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProductLineResponse) SetResultCode(v string) *QueryProductLineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProductLineResponse) SetResultMsg(v string) *QueryProductLineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProductLineResponse) SetProductTree(v []*BusinessLine) *QueryProductLineResponse {
	s.ProductTree = v
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
				"sdk_version":      tea.String("1.3.7"),
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
 * Description: 产品列表查询接口
 * Summary: 产品列表查询接口
 */
func (client *Client) QueryProduct(request *QueryProductRequest) (_result *QueryProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProductResponse{}
	_body, _err := client.QueryProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品列表查询接口
 * Summary: 产品列表查询接口
 */
func (client *Client) QueryProductEx(request *QueryProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.product.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导出商品配置数据，用于同步线上数据到线下
 * Summary: 导出商品配置数据
 */
func (client *Client) ExportCommodityConfig(request *ExportCommodityConfigRequest) (_result *ExportCommodityConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportCommodityConfigResponse{}
	_body, _err := client.ExportCommodityConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导出商品配置数据，用于同步线上数据到线下
 * Summary: 导出商品配置数据
 */
func (client *Client) ExportCommodityConfigEx(request *ExportCommodityConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportCommodityConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportCommodityConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.commodity.config.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询智科商品列表
 * Summary: 分页查询智科商品列表
 */
func (client *Client) PagequeryCommodity(request *PagequeryCommodityRequest) (_result *PagequeryCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryCommodityResponse{}
	_body, _err := client.PagequeryCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询智科商品列表
 * Summary: 分页查询智科商品列表
 */
func (client *Client) PagequeryCommodityEx(request *PagequeryCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.commodity.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部调用创建l3
 * Summary: 外部调用创建l3
 */
func (client *Client) ImportProduct(request *ImportProductRequest) (_result *ImportProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportProductResponse{}
	_body, _err := client.ImportProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部调用创建l3
 * Summary: 外部调用创建l3
 */
func (client *Client) ImportProductEx(request *ImportProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.product.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
 * Summary: 按照商品名称模糊搜索商品
 */
func (client *Client) QueryCommodity(request *QueryCommodityRequest) (_result *QueryCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommodityResponse{}
	_body, _err := client.QueryCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
 * Summary: 按照商品名称模糊搜索商品
 */
func (client *Client) QueryCommodityEx(request *QueryCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.commodity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品绑定服务接入码access_code
 * Summary: 商品绑定服务接入码
 */
func (client *Client) BindCommodityAccess(request *BindCommodityAccessRequest) (_result *BindCommodityAccessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindCommodityAccessResponse{}
	_body, _err := client.BindCommodityAccessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品绑定服务接入码access_code
 * Summary: 商品绑定服务接入码
 */
func (client *Client) BindCommodityAccessEx(request *BindCommodityAccessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindCommodityAccessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindCommodityAccessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.commodity.access.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
 * Summary: 查询产品树
 */
func (client *Client) QueryProductLine(request *QueryProductLineRequest) (_result *QueryProductLineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProductLineResponse{}
	_body, _err := client.QueryProductLineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
 * Summary: 查询产品树
 */
func (client *Client) QueryProductLineEx(request *QueryProductLineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProductLineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProductLineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.product.line.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
