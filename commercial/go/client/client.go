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

// 定价约束信息VO
type PriceConstraintVO struct {
	// 规格条件Code
	SpecConditionCode *string `json:"spec_condition_code,omitempty" xml:"spec_condition_code,omitempty" require:"true"`
	// 当前规格条件下可选值
	TargetValue *string `json:"target_value,omitempty" xml:"target_value,omitempty" require:"true"`
	// 基础价格
	BasePrice *string `json:"base_price,omitempty" xml:"base_price,omitempty" require:"true"`
	// bd价格
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty" require:"true"`
	// 成本价格
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty" require:"true"`
}

func (s PriceConstraintVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintVO) SetSpecConditionCode(v string) *PriceConstraintVO {
	s.SpecConditionCode = &v
	return s
}

func (s *PriceConstraintVO) SetTargetValue(v string) *PriceConstraintVO {
	s.TargetValue = &v
	return s
}

func (s *PriceConstraintVO) SetBasePrice(v string) *PriceConstraintVO {
	s.BasePrice = &v
	return s
}

func (s *PriceConstraintVO) SetBdPrice(v string) *PriceConstraintVO {
	s.BdPrice = &v
	return s
}

func (s *PriceConstraintVO) SetCostPrice(v string) *PriceConstraintVO {
	s.CostPrice = &v
	return s
}

// 政策信息
type Policy struct {
	// 政策id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
	// 政策名称
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty" require:"true"`
	// 政策类型
	PolicyType *string `json:"policy_type,omitempty" xml:"policy_type,omitempty" require:"true"`
	// 政策生效时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 政策失效时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 下架时间
	OfflineTime *string `json:"offline_time,omitempty" xml:"offline_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 政策状态
	PolicyStatus *string `json:"policy_status,omitempty" xml:"policy_status,omitempty" require:"true"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 修改者
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s Policy) String() string {
	return tea.Prettify(s)
}

func (s Policy) GoString() string {
	return s.String()
}

func (s *Policy) SetPolicyId(v string) *Policy {
	s.PolicyId = &v
	return s
}

func (s *Policy) SetPolicyName(v string) *Policy {
	s.PolicyName = &v
	return s
}

func (s *Policy) SetPolicyType(v string) *Policy {
	s.PolicyType = &v
	return s
}

func (s *Policy) SetStartTime(v string) *Policy {
	s.StartTime = &v
	return s
}

func (s *Policy) SetEndTime(v string) *Policy {
	s.EndTime = &v
	return s
}

func (s *Policy) SetOfflineTime(v string) *Policy {
	s.OfflineTime = &v
	return s
}

func (s *Policy) SetPolicyStatus(v string) *Policy {
	s.PolicyStatus = &v
	return s
}

func (s *Policy) SetCreator(v string) *Policy {
	s.Creator = &v
	return s
}

func (s *Policy) SetModifier(v string) *Policy {
	s.Modifier = &v
	return s
}

func (s *Policy) SetGmtCreate(v string) *Policy {
	s.GmtCreate = &v
	return s
}

func (s *Policy) SetGmtModified(v string) *Policy {
	s.GmtModified = &v
	return s
}

// 政策关联商品信息
type PolicyCommodity struct {
	// 政策id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 商品名称
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 商品描述
	CommodityDesc *string `json:"commodity_desc,omitempty" xml:"commodity_desc,omitempty"`
}

func (s PolicyCommodity) String() string {
	return tea.Prettify(s)
}

func (s PolicyCommodity) GoString() string {
	return s.String()
}

func (s *PolicyCommodity) SetPolicyId(v string) *PolicyCommodity {
	s.PolicyId = &v
	return s
}

func (s *PolicyCommodity) SetCommodityCode(v string) *PolicyCommodity {
	s.CommodityCode = &v
	return s
}

func (s *PolicyCommodity) SetCommodityName(v string) *PolicyCommodity {
	s.CommodityName = &v
	return s
}

func (s *PolicyCommodity) SetCommodityDesc(v string) *PolicyCommodity {
	s.CommodityDesc = &v
	return s
}

// 类目信息
type Catalog struct {
	// 类目id
	CatalogId *int64 `json:"catalog_id,omitempty" xml:"catalog_id,omitempty" require:"true"`
	// 类目名称
	CatalogName *string `json:"catalog_name,omitempty" xml:"catalog_name,omitempty" require:"true"`
}

func (s Catalog) String() string {
	return tea.Prettify(s)
}

func (s Catalog) GoString() string {
	return s.String()
}

func (s *Catalog) SetCatalogId(v int64) *Catalog {
	s.CatalogId = &v
	return s
}

func (s *Catalog) SetCatalogName(v string) *Catalog {
	s.CatalogName = &v
	return s
}

// 定价计划信息VO
type PricePlanVO struct {
	// 规格Code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 定价类型
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty" require:"true"`
	// 定价计划描述
	PricePlanDesc *string `json:"price_plan_desc,omitempty" xml:"price_plan_desc,omitempty" require:"true"`
	// 定价约束列表
	PriceConstraint []*PriceConstraintVO `json:"price_constraint,omitempty" xml:"price_constraint,omitempty" require:"true" type:"Repeated"`
}

func (s PricePlanVO) String() string {
	return tea.Prettify(s)
}

func (s PricePlanVO) GoString() string {
	return s.String()
}

func (s *PricePlanVO) SetSpecCode(v string) *PricePlanVO {
	s.SpecCode = &v
	return s
}

func (s *PricePlanVO) SetPriceType(v string) *PricePlanVO {
	s.PriceType = &v
	return s
}

func (s *PricePlanVO) SetPricePlanDesc(v string) *PricePlanVO {
	s.PricePlanDesc = &v
	return s
}

func (s *PricePlanVO) SetPriceConstraint(v []*PriceConstraintVO) *PricePlanVO {
	s.PriceConstraint = v
	return s
}

// Pair
type Pair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Pair) String() string {
	return tea.Prettify(s)
}

func (s Pair) GoString() string {
	return s.String()
}

func (s *Pair) SetKey(v string) *Pair {
	s.Key = &v
	return s
}

func (s *Pair) SetValue(v string) *Pair {
	s.Value = &v
	return s
}

// MultiCurrencyMoneyVO
type MultiCurrencyMoneyVO struct {
	// amount
	Amt *string `json:"amt,omitempty" xml:"amt,omitempty" require:"true"`
	// ccy
	Ccy *string `json:"ccy,omitempty" xml:"ccy,omitempty" require:"true"`
}

func (s MultiCurrencyMoneyVO) String() string {
	return tea.Prettify(s)
}

func (s MultiCurrencyMoneyVO) GoString() string {
	return s.String()
}

func (s *MultiCurrencyMoneyVO) SetAmt(v string) *MultiCurrencyMoneyVO {
	s.Amt = &v
	return s
}

func (s *MultiCurrencyMoneyVO) SetCcy(v string) *MultiCurrencyMoneyVO {
	s.Ccy = &v
	return s
}

// 发票电子邮箱
type InvoiceEmail struct {
	// 电子邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 唯一id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s InvoiceEmail) String() string {
	return tea.Prettify(s)
}

func (s InvoiceEmail) GoString() string {
	return s.String()
}

func (s *InvoiceEmail) SetEmail(v string) *InvoiceEmail {
	s.Email = &v
	return s
}

func (s *InvoiceEmail) SetId(v int64) *InvoiceEmail {
	s.Id = &v
	return s
}

func (s *InvoiceEmail) SetUniqueId(v string) *InvoiceEmail {
	s.UniqueId = &v
	return s
}

// 政策信息扩展
type PolicyDTO struct {
	// 政策信息
	Policy *Policy `json:"policy,omitempty" xml:"policy,omitempty" require:"true"`
	// 政策关联商品
	PolicyCommodity *PolicyCommodity `json:"policy_commodity,omitempty" xml:"policy_commodity,omitempty" require:"true"`
	// 合同id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty"`
	// 签约状态
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
}

func (s PolicyDTO) String() string {
	return tea.Prettify(s)
}

func (s PolicyDTO) GoString() string {
	return s.String()
}

func (s *PolicyDTO) SetPolicy(v *Policy) *PolicyDTO {
	s.Policy = v
	return s
}

func (s *PolicyDTO) SetPolicyCommodity(v *PolicyCommodity) *PolicyDTO {
	s.PolicyCommodity = v
	return s
}

func (s *PolicyDTO) SetAgreementId(v string) *PolicyDTO {
	s.AgreementId = &v
	return s
}

func (s *PolicyDTO) SetSignStatus(v string) *PolicyDTO {
	s.SignStatus = &v
	return s
}

// 规格信息VO
type SpecVO struct {
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 规格名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// 主要付款方式
	MainPayMethod *string `json:"main_pay_method,omitempty" xml:"main_pay_method,omitempty" require:"true"`
	// 售卖模式
	SalesMode *string `json:"sales_mode,omitempty" xml:"sales_mode,omitempty" require:"true"`
	// 规格状态
	SpecStatus *string `json:"spec_status,omitempty" xml:"spec_status,omitempty" require:"true"`
	// 规格描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s SpecVO) String() string {
	return tea.Prettify(s)
}

func (s SpecVO) GoString() string {
	return s.String()
}

func (s *SpecVO) SetSpecCode(v string) *SpecVO {
	s.SpecCode = &v
	return s
}

func (s *SpecVO) SetSpecName(v string) *SpecVO {
	s.SpecName = &v
	return s
}

func (s *SpecVO) SetMainPayMethod(v string) *SpecVO {
	s.MainPayMethod = &v
	return s
}

func (s *SpecVO) SetSalesMode(v string) *SpecVO {
	s.SalesMode = &v
	return s
}

func (s *SpecVO) SetSpecStatus(v string) *SpecVO {
	s.SpecStatus = &v
	return s
}

func (s *SpecVO) SetDesc(v string) *SpecVO {
	s.Desc = &v
	return s
}

// 产品信息VO
type ProductVO struct {
	// 商品Code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品oxm类型
	OxmType *string `json:"oxm_type,omitempty" xml:"oxm_type,omitempty" require:"true"`
	// 产品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s ProductVO) String() string {
	return tea.Prettify(s)
}

func (s ProductVO) GoString() string {
	return s.String()
}

func (s *ProductVO) SetProductCode(v string) *ProductVO {
	s.ProductCode = &v
	return s
}

func (s *ProductVO) SetProductName(v string) *ProductVO {
	s.ProductName = &v
	return s
}

func (s *ProductVO) SetOxmType(v string) *ProductVO {
	s.OxmType = &v
	return s
}

func (s *ProductVO) SetDesc(v string) *ProductVO {
	s.Desc = &v
	return s
}

// 发票寄送地址
type InvoiceAddress struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 收件人
	Addressee *string `json:"addressee,omitempty" xml:"addressee,omitempty" require:"true"`
	// 地区
	Area *string `json:"area,omitempty" xml:"area,omitempty" require:"true"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 电话
	Telephone *string `json:"telephone,omitempty" xml:"telephone,omitempty" require:"true"`
	// 邮编
	PostCode *string `json:"post_code,omitempty" xml:"post_code,omitempty" require:"true"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 唯一id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s InvoiceAddress) String() string {
	return tea.Prettify(s)
}

func (s InvoiceAddress) GoString() string {
	return s.String()
}

func (s *InvoiceAddress) SetId(v int64) *InvoiceAddress {
	s.Id = &v
	return s
}

func (s *InvoiceAddress) SetUserId(v string) *InvoiceAddress {
	s.UserId = &v
	return s
}

func (s *InvoiceAddress) SetAddressee(v string) *InvoiceAddress {
	s.Addressee = &v
	return s
}

func (s *InvoiceAddress) SetArea(v string) *InvoiceAddress {
	s.Area = &v
	return s
}

func (s *InvoiceAddress) SetAddress(v string) *InvoiceAddress {
	s.Address = &v
	return s
}

func (s *InvoiceAddress) SetTelephone(v string) *InvoiceAddress {
	s.Telephone = &v
	return s
}

func (s *InvoiceAddress) SetPostCode(v string) *InvoiceAddress {
	s.PostCode = &v
	return s
}

func (s *InvoiceAddress) SetGmtModified(v string) *InvoiceAddress {
	s.GmtModified = &v
	return s
}

func (s *InvoiceAddress) SetGmtCreate(v string) *InvoiceAddress {
	s.GmtCreate = &v
	return s
}

func (s *InvoiceAddress) SetUniqueId(v string) *InvoiceAddress {
	s.UniqueId = &v
	return s
}

// 新增规格VO
type SpecAddVO struct {
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 产品Code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 售卖模式
	SalesMode *string `json:"sales_mode,omitempty" xml:"sales_mode,omitempty" require:"true"`
	// 付费方式
	MainPayMethod *string `json:"main_pay_method,omitempty" xml:"main_pay_method,omitempty" require:"true"`
	// 规格描述
	SpecDesc *string `json:"spec_desc,omitempty" xml:"spec_desc,omitempty" require:"true"`
	// 规格名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// 定价计划
	PricePlan *PricePlanVO `json:"price_plan,omitempty" xml:"price_plan,omitempty" require:"true"`
}

func (s SpecAddVO) String() string {
	return tea.Prettify(s)
}

func (s SpecAddVO) GoString() string {
	return s.String()
}

func (s *SpecAddVO) SetSpecCode(v string) *SpecAddVO {
	s.SpecCode = &v
	return s
}

func (s *SpecAddVO) SetProductCode(v string) *SpecAddVO {
	s.ProductCode = &v
	return s
}

func (s *SpecAddVO) SetCommodityCode(v string) *SpecAddVO {
	s.CommodityCode = &v
	return s
}

func (s *SpecAddVO) SetSalesMode(v string) *SpecAddVO {
	s.SalesMode = &v
	return s
}

func (s *SpecAddVO) SetMainPayMethod(v string) *SpecAddVO {
	s.MainPayMethod = &v
	return s
}

func (s *SpecAddVO) SetSpecDesc(v string) *SpecAddVO {
	s.SpecDesc = &v
	return s
}

func (s *SpecAddVO) SetSpecName(v string) *SpecAddVO {
	s.SpecName = &v
	return s
}

func (s *SpecAddVO) SetPricePlan(v *PricePlanVO) *SpecAddVO {
	s.PricePlan = v
	return s
}

// 类目VO
type CatalogVO struct {
	// 类目Id
	CatalogId *int64 `json:"catalog_id,omitempty" xml:"catalog_id,omitempty" require:"true"`
	// 类目名称
	CatalogName *string `json:"catalog_name,omitempty" xml:"catalog_name,omitempty" require:"true"`
	// 子类目列表
	ChildCatalogs []*Catalog `json:"child_catalogs,omitempty" xml:"child_catalogs,omitempty" require:"true" type:"Repeated"`
}

func (s CatalogVO) String() string {
	return tea.Prettify(s)
}

func (s CatalogVO) GoString() string {
	return s.String()
}

func (s *CatalogVO) SetCatalogId(v int64) *CatalogVO {
	s.CatalogId = &v
	return s
}

func (s *CatalogVO) SetCatalogName(v string) *CatalogVO {
	s.CatalogName = &v
	return s
}

func (s *CatalogVO) SetChildCatalogs(v []*Catalog) *CatalogVO {
	s.ChildCatalogs = v
	return s
}

// 规格售卖模式
type SpecSalesMode struct {
	// 规格售卖模式
	SalesModeCode *string `json:"sales_mode_code,omitempty" xml:"sales_mode_code,omitempty" require:"true"`
	// 售卖模式
	SalesModeName *string `json:"sales_mode_name,omitempty" xml:"sales_mode_name,omitempty" require:"true"`
}

func (s SpecSalesMode) String() string {
	return tea.Prettify(s)
}

func (s SpecSalesMode) GoString() string {
	return s.String()
}

func (s *SpecSalesMode) SetSalesModeCode(v string) *SpecSalesMode {
	s.SalesModeCode = &v
	return s
}

func (s *SpecSalesMode) SetSalesModeName(v string) *SpecSalesMode {
	s.SalesModeName = &v
	return s
}

// 产品信息扩展
type ProductDTO struct {
	// 产品信息
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品oxm类型
	OxmType *string `json:"oxm_type,omitempty" xml:"oxm_type,omitempty" require:"true"`
	// 产品一级类目
	L1CatalogId *int64 `json:"l1_catalog_id,omitempty" xml:"l1_catalog_id,omitempty" require:"true"`
	// 产品二级类目
	L2CatalogId *int64 `json:"l2_catalog_id,omitempty" xml:"l2_catalog_id,omitempty" require:"true"`
	// 产品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s ProductDTO) String() string {
	return tea.Prettify(s)
}

func (s ProductDTO) GoString() string {
	return s.String()
}

func (s *ProductDTO) SetProductCode(v string) *ProductDTO {
	s.ProductCode = &v
	return s
}

func (s *ProductDTO) SetProductName(v string) *ProductDTO {
	s.ProductName = &v
	return s
}

func (s *ProductDTO) SetOxmType(v string) *ProductDTO {
	s.OxmType = &v
	return s
}

func (s *ProductDTO) SetL1CatalogId(v int64) *ProductDTO {
	s.L1CatalogId = &v
	return s
}

func (s *ProductDTO) SetL2CatalogId(v int64) *ProductDTO {
	s.L2CatalogId = &v
	return s
}

func (s *ProductDTO) SetDesc(v string) *ProductDTO {
	s.Desc = &v
	return s
}

// 签约信息
type PartnerPolicyRelation struct {
	// 合同id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 服务商id
	SpId *string `json:"sp_id,omitempty" xml:"sp_id,omitempty" require:"true"`
	// 合同生效时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 合同失效时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 合同取消时间
	CancelTime *string `json:"cancel_time,omitempty" xml:"cancel_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 政策id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
	// 政策名称
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty" require:"true"`
	// 政策类型
	PolicyType *string `json:"policy_type,omitempty" xml:"policy_type,omitempty" require:"true"`
	// 政策link
	PolicyLink *string `json:"policy_link,omitempty" xml:"policy_link,omitempty"`
	// 政策所属ou
	PolicyOu *string `json:"policy_ou,omitempty" xml:"policy_ou,omitempty"`
	// 结算类型
	SettleType *string `json:"settle_type,omitempty" xml:"settle_type,omitempty" require:"true"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s PartnerPolicyRelation) String() string {
	return tea.Prettify(s)
}

func (s PartnerPolicyRelation) GoString() string {
	return s.String()
}

func (s *PartnerPolicyRelation) SetAgreementId(v string) *PartnerPolicyRelation {
	s.AgreementId = &v
	return s
}

func (s *PartnerPolicyRelation) SetSpId(v string) *PartnerPolicyRelation {
	s.SpId = &v
	return s
}

func (s *PartnerPolicyRelation) SetStartTime(v string) *PartnerPolicyRelation {
	s.StartTime = &v
	return s
}

func (s *PartnerPolicyRelation) SetEndTime(v string) *PartnerPolicyRelation {
	s.EndTime = &v
	return s
}

func (s *PartnerPolicyRelation) SetCancelTime(v string) *PartnerPolicyRelation {
	s.CancelTime = &v
	return s
}

func (s *PartnerPolicyRelation) SetPolicyId(v string) *PartnerPolicyRelation {
	s.PolicyId = &v
	return s
}

func (s *PartnerPolicyRelation) SetPolicyName(v string) *PartnerPolicyRelation {
	s.PolicyName = &v
	return s
}

func (s *PartnerPolicyRelation) SetPolicyType(v string) *PartnerPolicyRelation {
	s.PolicyType = &v
	return s
}

func (s *PartnerPolicyRelation) SetPolicyLink(v string) *PartnerPolicyRelation {
	s.PolicyLink = &v
	return s
}

func (s *PartnerPolicyRelation) SetPolicyOu(v string) *PartnerPolicyRelation {
	s.PolicyOu = &v
	return s
}

func (s *PartnerPolicyRelation) SetSettleType(v string) *PartnerPolicyRelation {
	s.SettleType = &v
	return s
}

func (s *PartnerPolicyRelation) SetGmtModified(v string) *PartnerPolicyRelation {
	s.GmtModified = &v
	return s
}

func (s *PartnerPolicyRelation) SetGmtCreate(v string) *PartnerPolicyRelation {
	s.GmtCreate = &v
	return s
}

// 发票信息
type Invoice struct {
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 纳税人类型
	TaxpayerType *string `json:"taxpayer_type,omitempty" xml:"taxpayer_type,omitempty" require:"true"`
	// 纳税人名称
	TaxpayerName *string `json:"taxpayer_name,omitempty" xml:"taxpayer_name,omitempty"`
	// 纳税人识别号
	TaxpayerNo *string `json:"taxpayer_no,omitempty" xml:"taxpayer_no,omitempty"`
	// 开户行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 开户行账号
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty"`
	// 开户行地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 开户行电话
	Telephone *string `json:"telephone,omitempty" xml:"telephone,omitempty"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 唯一id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s Invoice) String() string {
	return tea.Prettify(s)
}

func (s Invoice) GoString() string {
	return s.String()
}

func (s *Invoice) SetId(v int64) *Invoice {
	s.Id = &v
	return s
}

func (s *Invoice) SetUserId(v string) *Invoice {
	s.UserId = &v
	return s
}

func (s *Invoice) SetTaxpayerType(v string) *Invoice {
	s.TaxpayerType = &v
	return s
}

func (s *Invoice) SetTaxpayerName(v string) *Invoice {
	s.TaxpayerName = &v
	return s
}

func (s *Invoice) SetTaxpayerNo(v string) *Invoice {
	s.TaxpayerNo = &v
	return s
}

func (s *Invoice) SetBankName(v string) *Invoice {
	s.BankName = &v
	return s
}

func (s *Invoice) SetBankAccount(v string) *Invoice {
	s.BankAccount = &v
	return s
}

func (s *Invoice) SetAddress(v string) *Invoice {
	s.Address = &v
	return s
}

func (s *Invoice) SetTelephone(v string) *Invoice {
	s.Telephone = &v
	return s
}

func (s *Invoice) SetGmtModified(v string) *Invoice {
	s.GmtModified = &v
	return s
}

func (s *Invoice) SetGmtCreate(v string) *Invoice {
	s.GmtCreate = &v
	return s
}

func (s *Invoice) SetUniqueId(v string) *Invoice {
	s.UniqueId = &v
	return s
}

// 已购买的规格实例信息(用于控制台查询)
type PaidSpecInstance struct {
	// 规格实例id
	SpecInstanceId *string `json:"spec_instance_id,omitempty" xml:"spec_instance_id,omitempty" require:"true"`
	// 规格名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// 规格配置(描述)
	SpecConf *string `json:"spec_conf,omitempty" xml:"spec_conf,omitempty"`
	// 实例开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 实例到期时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 规格实例的运行状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s PaidSpecInstance) String() string {
	return tea.Prettify(s)
}

func (s PaidSpecInstance) GoString() string {
	return s.String()
}

func (s *PaidSpecInstance) SetSpecInstanceId(v string) *PaidSpecInstance {
	s.SpecInstanceId = &v
	return s
}

func (s *PaidSpecInstance) SetSpecName(v string) *PaidSpecInstance {
	s.SpecName = &v
	return s
}

func (s *PaidSpecInstance) SetSpecConf(v string) *PaidSpecInstance {
	s.SpecConf = &v
	return s
}

func (s *PaidSpecInstance) SetStartTime(v string) *PaidSpecInstance {
	s.StartTime = &v
	return s
}

func (s *PaidSpecInstance) SetEndTime(v string) *PaidSpecInstance {
	s.EndTime = &v
	return s
}

func (s *PaidSpecInstance) SetStatus(v string) *PaidSpecInstance {
	s.Status = &v
	return s
}

// 订单信息VO
type MainOrderVO struct {
	// order_no
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// buyer
	Buyer *string `json:"buyer,omitempty" xml:"buyer,omitempty" require:"true"`
	// seller
	Seller *string `json:"seller,omitempty" xml:"seller,omitempty" require:"true"`
	// sp_id
	SpId *string `json:"sp_id,omitempty" xml:"sp_id,omitempty" require:"true"`
	// login_account
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty" require:"true"`
	// product_name
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// money
	Money *MultiCurrencyMoneyVO `json:"money,omitempty" xml:"money,omitempty" require:"true"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_close
	GmtClose *string `json:"gmt_close,omitempty" xml:"gmt_close,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_pay_success
	GmtPaySuccess *string `json:"gmt_pay_success,omitempty" xml:"gmt_pay_success,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// order_status
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// order_type
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// order_origin
	OrderOrigin *string `json:"order_origin,omitempty" xml:"order_origin,omitempty" require:"true"`
	// order_level
	OrderLevel *string `json:"order_level,omitempty" xml:"order_level,omitempty" require:"true"`
	// pay_method
	PayMethod *string `json:"pay_method,omitempty" xml:"pay_method,omitempty" require:"true"`
	// orde_duration
	OrderDuration *string `json:"order_duration,omitempty" xml:"order_duration,omitempty" require:"true"`
	// parent_order_no
	ParentOrderNo *string `json:"parent_order_no,omitempty" xml:"parent_order_no,omitempty" require:"true"`
	// commodity_name
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// spec_code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// spec_name
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// spec_desc
	SpecDesc *string `json:"spec_desc,omitempty" xml:"spec_desc,omitempty" require:"true"`
	// order_detail
	OrderDetail *string `json:"order_detail,omitempty" xml:"order_detail,omitempty" require:"true"`
	// sub_order_include
	SubOrderInclude *bool `json:"sub_order_include,omitempty" xml:"sub_order_include,omitempty" require:"true"`
	// spec_props
	SpecProps []*Pair `json:"spec_props,omitempty" xml:"spec_props,omitempty" require:"true" type:"Repeated"`
	// ext_params
	ExtParams []*Pair `json:"ext_params,omitempty" xml:"ext_params,omitempty" require:"true" type:"Repeated"`
}

func (s MainOrderVO) String() string {
	return tea.Prettify(s)
}

func (s MainOrderVO) GoString() string {
	return s.String()
}

func (s *MainOrderVO) SetOrderNo(v string) *MainOrderVO {
	s.OrderNo = &v
	return s
}

func (s *MainOrderVO) SetBuyer(v string) *MainOrderVO {
	s.Buyer = &v
	return s
}

func (s *MainOrderVO) SetSeller(v string) *MainOrderVO {
	s.Seller = &v
	return s
}

func (s *MainOrderVO) SetSpId(v string) *MainOrderVO {
	s.SpId = &v
	return s
}

func (s *MainOrderVO) SetLoginAccount(v string) *MainOrderVO {
	s.LoginAccount = &v
	return s
}

func (s *MainOrderVO) SetProductName(v string) *MainOrderVO {
	s.ProductName = &v
	return s
}

func (s *MainOrderVO) SetMoney(v *MultiCurrencyMoneyVO) *MainOrderVO {
	s.Money = v
	return s
}

func (s *MainOrderVO) SetGmtCreate(v string) *MainOrderVO {
	s.GmtCreate = &v
	return s
}

func (s *MainOrderVO) SetGmtModified(v string) *MainOrderVO {
	s.GmtModified = &v
	return s
}

func (s *MainOrderVO) SetGmtClose(v string) *MainOrderVO {
	s.GmtClose = &v
	return s
}

func (s *MainOrderVO) SetGmtPaySuccess(v string) *MainOrderVO {
	s.GmtPaySuccess = &v
	return s
}

func (s *MainOrderVO) SetOrderStatus(v string) *MainOrderVO {
	s.OrderStatus = &v
	return s
}

func (s *MainOrderVO) SetOrderType(v string) *MainOrderVO {
	s.OrderType = &v
	return s
}

func (s *MainOrderVO) SetOrderOrigin(v string) *MainOrderVO {
	s.OrderOrigin = &v
	return s
}

func (s *MainOrderVO) SetOrderLevel(v string) *MainOrderVO {
	s.OrderLevel = &v
	return s
}

func (s *MainOrderVO) SetPayMethod(v string) *MainOrderVO {
	s.PayMethod = &v
	return s
}

func (s *MainOrderVO) SetOrderDuration(v string) *MainOrderVO {
	s.OrderDuration = &v
	return s
}

func (s *MainOrderVO) SetParentOrderNo(v string) *MainOrderVO {
	s.ParentOrderNo = &v
	return s
}

func (s *MainOrderVO) SetCommodityName(v string) *MainOrderVO {
	s.CommodityName = &v
	return s
}

func (s *MainOrderVO) SetSpecCode(v string) *MainOrderVO {
	s.SpecCode = &v
	return s
}

func (s *MainOrderVO) SetSpecName(v string) *MainOrderVO {
	s.SpecName = &v
	return s
}

func (s *MainOrderVO) SetSpecDesc(v string) *MainOrderVO {
	s.SpecDesc = &v
	return s
}

func (s *MainOrderVO) SetOrderDetail(v string) *MainOrderVO {
	s.OrderDetail = &v
	return s
}

func (s *MainOrderVO) SetSubOrderInclude(v bool) *MainOrderVO {
	s.SubOrderInclude = &v
	return s
}

func (s *MainOrderVO) SetSpecProps(v []*Pair) *MainOrderVO {
	s.SpecProps = v
	return s
}

func (s *MainOrderVO) SetExtParams(v []*Pair) *MainOrderVO {
	s.ExtParams = v
	return s
}

// 商品信息VO
type CommodityVO struct {
	// 商品Code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 商品名称
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 商品服务类型
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 商品来源
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty" require:"true"`
	// 商品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s CommodityVO) String() string {
	return tea.Prettify(s)
}

func (s CommodityVO) GoString() string {
	return s.String()
}

func (s *CommodityVO) SetCommodityCode(v string) *CommodityVO {
	s.CommodityCode = &v
	return s
}

func (s *CommodityVO) SetCommodityName(v string) *CommodityVO {
	s.CommodityName = &v
	return s
}

func (s *CommodityVO) SetServiceType(v string) *CommodityVO {
	s.ServiceType = &v
	return s
}

func (s *CommodityVO) SetSourceType(v string) *CommodityVO {
	s.SourceType = &v
	return s
}

func (s *CommodityVO) SetDesc(v string) *CommodityVO {
	s.Desc = &v
	return s
}

// 财务ap账单
type ApBill struct {
}

func (s ApBill) String() string {
	return tea.Prettify(s)
}

func (s ApBill) GoString() string {
	return s.String()
}

// 纳税信息
type TaxInfo struct {
	// 纳税人名称
	TaxpayerName *string `json:"taxpayer_name,omitempty" xml:"taxpayer_name,omitempty" require:"true"`
	// 纳税人识别号
	TaxpayerNo *string `json:"taxpayer_no,omitempty" xml:"taxpayer_no,omitempty" require:"true"`
	// 开户行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 开户行账号
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty"`
	// 开户行地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 开户行电话
	Telephone *string `json:"telephone,omitempty" xml:"telephone,omitempty"`
}

func (s TaxInfo) String() string {
	return tea.Prettify(s)
}

func (s TaxInfo) GoString() string {
	return s.String()
}

func (s *TaxInfo) SetTaxpayerName(v string) *TaxInfo {
	s.TaxpayerName = &v
	return s
}

func (s *TaxInfo) SetTaxpayerNo(v string) *TaxInfo {
	s.TaxpayerNo = &v
	return s
}

func (s *TaxInfo) SetBankName(v string) *TaxInfo {
	s.BankName = &v
	return s
}

func (s *TaxInfo) SetBankAccount(v string) *TaxInfo {
	s.BankAccount = &v
	return s
}

func (s *TaxInfo) SetAddress(v string) *TaxInfo {
	s.Address = &v
	return s
}

func (s *TaxInfo) SetTelephone(v string) *TaxInfo {
	s.Telephone = &v
	return s
}

// 服务商开票信息
type InvoiceInfo struct {
	// 发票类型
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty" require:"true"`
	// 发票编码
	InvoiceCode *string `json:"invoice_code,omitempty" xml:"invoice_code,omitempty" require:"true"`
	// 开票日期
	InvoiceDate *string `json:"invoice_date,omitempty" xml:"invoice_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发票信息槽
	InvoiceSlots *string `json:"invoice_slots,omitempty" xml:"invoice_slots,omitempty" require:"true"`
	// 税价合计
	TotalAmt *string `json:"total_amt,omitempty" xml:"total_amt,omitempty" require:"true"`
}

func (s InvoiceInfo) String() string {
	return tea.Prettify(s)
}

func (s InvoiceInfo) GoString() string {
	return s.String()
}

func (s *InvoiceInfo) SetInvoiceType(v string) *InvoiceInfo {
	s.InvoiceType = &v
	return s
}

func (s *InvoiceInfo) SetInvoiceCode(v string) *InvoiceInfo {
	s.InvoiceCode = &v
	return s
}

func (s *InvoiceInfo) SetInvoiceDate(v string) *InvoiceInfo {
	s.InvoiceDate = &v
	return s
}

func (s *InvoiceInfo) SetInvoiceSlots(v string) *InvoiceInfo {
	s.InvoiceSlots = &v
	return s
}

func (s *InvoiceInfo) SetTotalAmt(v string) *InvoiceInfo {
	s.TotalAmt = &v
	return s
}

// 产品code列表
type ProductCodes struct {
	// 产品code列表
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true" type:"Repeated"`
}

func (s ProductCodes) String() string {
	return tea.Prettify(s)
}

func (s ProductCodes) GoString() string {
	return s.String()
}

func (s *ProductCodes) SetProductCodes(v []*string) *ProductCodes {
	s.ProductCodes = v
	return s
}

// 已售规格实例详细信息(用于开发商查询)
type SoldSpecInstance struct {
	// 规格码
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 规格实例id
	SpecInstanceId *string `json:"spec_instance_id,omitempty" xml:"spec_instance_id,omitempty" require:"true"`
	// 规格实例运行状态.
	// 实例状态 STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 实例生效时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实例计划停服时间
	PlanStopTime *string `json:"plan_stop_time,omitempty" xml:"plan_stop_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实例实际停服时间
	ActualStopTime *string `json:"actual_stop_time,omitempty" xml:"actual_stop_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 购买规格实例的商户id(商业中台用来唯一标识商户的id)
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s SoldSpecInstance) String() string {
	return tea.Prettify(s)
}

func (s SoldSpecInstance) GoString() string {
	return s.String()
}

func (s *SoldSpecInstance) SetSpecCode(v string) *SoldSpecInstance {
	s.SpecCode = &v
	return s
}

func (s *SoldSpecInstance) SetSpecInstanceId(v string) *SoldSpecInstance {
	s.SpecInstanceId = &v
	return s
}

func (s *SoldSpecInstance) SetStatus(v string) *SoldSpecInstance {
	s.Status = &v
	return s
}

func (s *SoldSpecInstance) SetStartTime(v string) *SoldSpecInstance {
	s.StartTime = &v
	return s
}

func (s *SoldSpecInstance) SetPlanStopTime(v string) *SoldSpecInstance {
	s.PlanStopTime = &v
	return s
}

func (s *SoldSpecInstance) SetActualStopTime(v string) *SoldSpecInstance {
	s.ActualStopTime = &v
	return s
}

func (s *SoldSpecInstance) SetMerchantId(v string) *SoldSpecInstance {
	s.MerchantId = &v
	return s
}

// 商品来源
type CommoditySourceType struct {
	// 商品来源code
	TypeCode *string `json:"type_code,omitempty" xml:"type_code,omitempty" require:"true"`
	// 商品来源描述
	TypeDesc *string `json:"type_desc,omitempty" xml:"type_desc,omitempty" require:"true"`
}

func (s CommoditySourceType) String() string {
	return tea.Prettify(s)
}

func (s CommoditySourceType) GoString() string {
	return s.String()
}

func (s *CommoditySourceType) SetTypeCode(v string) *CommoditySourceType {
	s.TypeCode = &v
	return s
}

func (s *CommoditySourceType) SetTypeDesc(v string) *CommoditySourceType {
	s.TypeDesc = &v
	return s
}

type QueryBillingcoreInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryBillingcoreInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreInvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreInvoiceRequest) SetAuthToken(v string) *QueryBillingcoreInvoiceRequest {
	s.AuthToken = &v
	return s
}

type QueryBillingcoreInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty"`
}

func (s QueryBillingcoreInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreInvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreInvoiceResponse) SetReqMsgId(v string) *QueryBillingcoreInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBillingcoreInvoiceResponse) SetResultCode(v string) *QueryBillingcoreInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBillingcoreInvoiceResponse) SetResultMsg(v string) *QueryBillingcoreInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBillingcoreInvoiceResponse) SetInvoice(v *Invoice) *QueryBillingcoreInvoiceResponse {
	s.Invoice = v
	return s
}

type QueryBillingcoreInvoicelocRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryBillingcoreInvoicelocRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreInvoicelocRequest) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreInvoicelocRequest) SetAuthToken(v string) *QueryBillingcoreInvoicelocRequest {
	s.AuthToken = &v
	return s
}

type QueryBillingcoreInvoicelocResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty"`
	// 发票寄送地址
	InvoiceAddress *InvoiceAddress `json:"invoice_address,omitempty" xml:"invoice_address,omitempty"`
	// 发票电子邮箱
	InvoiceEmail *InvoiceEmail `json:"invoice_email,omitempty" xml:"invoice_email,omitempty"`
}

func (s QueryBillingcoreInvoicelocResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreInvoicelocResponse) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreInvoicelocResponse) SetReqMsgId(v string) *QueryBillingcoreInvoicelocResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBillingcoreInvoicelocResponse) SetResultCode(v string) *QueryBillingcoreInvoicelocResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBillingcoreInvoicelocResponse) SetResultMsg(v string) *QueryBillingcoreInvoicelocResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBillingcoreInvoicelocResponse) SetInvoice(v *Invoice) *QueryBillingcoreInvoicelocResponse {
	s.Invoice = v
	return s
}

func (s *QueryBillingcoreInvoicelocResponse) SetInvoiceAddress(v *InvoiceAddress) *QueryBillingcoreInvoicelocResponse {
	s.InvoiceAddress = v
	return s
}

func (s *QueryBillingcoreInvoicelocResponse) SetInvoiceEmail(v *InvoiceEmail) *QueryBillingcoreInvoicelocResponse {
	s.InvoiceEmail = v
	return s
}

type AddBillingcoreInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
}

func (s AddBillingcoreInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceRequest) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceRequest) SetAuthToken(v string) *AddBillingcoreInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBillingcoreInvoiceRequest) SetRequestUniqueId(v string) *AddBillingcoreInvoiceRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *AddBillingcoreInvoiceRequest) SetInvoice(v *Invoice) *AddBillingcoreInvoiceRequest {
	s.Invoice = v
	return s
}

type AddBillingcoreInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddBillingcoreInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceResponse) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceResponse) SetReqMsgId(v string) *AddBillingcoreInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBillingcoreInvoiceResponse) SetResultCode(v string) *AddBillingcoreInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBillingcoreInvoiceResponse) SetResultMsg(v string) *AddBillingcoreInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBillingcoreInvoiceResponse) SetSuccess(v bool) *AddBillingcoreInvoiceResponse {
	s.Success = &v
	return s
}

type UpdateBillingcoreInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
}

func (s UpdateBillingcoreInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceRequest) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceRequest) SetAuthToken(v string) *UpdateBillingcoreInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBillingcoreInvoiceRequest) SetRequestUniqueId(v string) *UpdateBillingcoreInvoiceRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *UpdateBillingcoreInvoiceRequest) SetInvoice(v *Invoice) *UpdateBillingcoreInvoiceRequest {
	s.Invoice = v
	return s
}

type UpdateBillingcoreInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateBillingcoreInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceResponse) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceResponse) SetReqMsgId(v string) *UpdateBillingcoreInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBillingcoreInvoiceResponse) SetResultCode(v string) *UpdateBillingcoreInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBillingcoreInvoiceResponse) SetResultMsg(v string) *UpdateBillingcoreInvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBillingcoreInvoiceResponse) SetSuccess(v bool) *UpdateBillingcoreInvoiceResponse {
	s.Success = &v
	return s
}

type AddBillingcoreInvoiceaddressRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 发票寄送地址
	InvoiceAddress *InvoiceAddress `json:"invoice_address,omitempty" xml:"invoice_address,omitempty" require:"true"`
}

func (s AddBillingcoreInvoiceaddressRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceaddressRequest) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceaddressRequest) SetAuthToken(v string) *AddBillingcoreInvoiceaddressRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBillingcoreInvoiceaddressRequest) SetRequestUniqueId(v string) *AddBillingcoreInvoiceaddressRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *AddBillingcoreInvoiceaddressRequest) SetInvoiceAddress(v *InvoiceAddress) *AddBillingcoreInvoiceaddressRequest {
	s.InvoiceAddress = v
	return s
}

type AddBillingcoreInvoiceaddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddBillingcoreInvoiceaddressResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceaddressResponse) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceaddressResponse) SetReqMsgId(v string) *AddBillingcoreInvoiceaddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBillingcoreInvoiceaddressResponse) SetResultCode(v string) *AddBillingcoreInvoiceaddressResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBillingcoreInvoiceaddressResponse) SetResultMsg(v string) *AddBillingcoreInvoiceaddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBillingcoreInvoiceaddressResponse) SetSuccess(v bool) *AddBillingcoreInvoiceaddressResponse {
	s.Success = &v
	return s
}

type UpdateBillingcoreInvoiceaddressRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 发票寄送地址
	InvoiceAddress *InvoiceAddress `json:"invoice_address,omitempty" xml:"invoice_address,omitempty" require:"true"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
}

func (s UpdateBillingcoreInvoiceaddressRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceaddressRequest) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceaddressRequest) SetAuthToken(v string) *UpdateBillingcoreInvoiceaddressRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBillingcoreInvoiceaddressRequest) SetInvoiceAddress(v *InvoiceAddress) *UpdateBillingcoreInvoiceaddressRequest {
	s.InvoiceAddress = v
	return s
}

func (s *UpdateBillingcoreInvoiceaddressRequest) SetRequestUniqueId(v string) *UpdateBillingcoreInvoiceaddressRequest {
	s.RequestUniqueId = &v
	return s
}

type UpdateBillingcoreInvoiceaddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateBillingcoreInvoiceaddressResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceaddressResponse) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceaddressResponse) SetReqMsgId(v string) *UpdateBillingcoreInvoiceaddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBillingcoreInvoiceaddressResponse) SetResultCode(v string) *UpdateBillingcoreInvoiceaddressResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBillingcoreInvoiceaddressResponse) SetResultMsg(v string) *UpdateBillingcoreInvoiceaddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBillingcoreInvoiceaddressResponse) SetSuccess(v bool) *UpdateBillingcoreInvoiceaddressResponse {
	s.Success = &v
	return s
}

type AddBillingcoreInvoiceemailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 发票电子邮箱
	InvoiceEmail *InvoiceEmail `json:"invoice_email,omitempty" xml:"invoice_email,omitempty" require:"true"`
}

func (s AddBillingcoreInvoiceemailRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceemailRequest) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceemailRequest) SetAuthToken(v string) *AddBillingcoreInvoiceemailRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBillingcoreInvoiceemailRequest) SetRequestUniqueId(v string) *AddBillingcoreInvoiceemailRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *AddBillingcoreInvoiceemailRequest) SetInvoiceEmail(v *InvoiceEmail) *AddBillingcoreInvoiceemailRequest {
	s.InvoiceEmail = v
	return s
}

type AddBillingcoreInvoiceemailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddBillingcoreInvoiceemailResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBillingcoreInvoiceemailResponse) GoString() string {
	return s.String()
}

func (s *AddBillingcoreInvoiceemailResponse) SetReqMsgId(v string) *AddBillingcoreInvoiceemailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBillingcoreInvoiceemailResponse) SetResultCode(v string) *AddBillingcoreInvoiceemailResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBillingcoreInvoiceemailResponse) SetResultMsg(v string) *AddBillingcoreInvoiceemailResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBillingcoreInvoiceemailResponse) SetSuccess(v bool) *AddBillingcoreInvoiceemailResponse {
	s.Success = &v
	return s
}

type UpdateBillingcoreInvoiceemailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一id，可以是时间戳
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 发票电子邮件信息
	InvoiceEmail *InvoiceEmail `json:"invoice_email,omitempty" xml:"invoice_email,omitempty" require:"true"`
}

func (s UpdateBillingcoreInvoiceemailRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceemailRequest) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceemailRequest) SetAuthToken(v string) *UpdateBillingcoreInvoiceemailRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBillingcoreInvoiceemailRequest) SetRequestUniqueId(v string) *UpdateBillingcoreInvoiceemailRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *UpdateBillingcoreInvoiceemailRequest) SetInvoiceEmail(v *InvoiceEmail) *UpdateBillingcoreInvoiceemailRequest {
	s.InvoiceEmail = v
	return s
}

type UpdateBillingcoreInvoiceemailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateBillingcoreInvoiceemailResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBillingcoreInvoiceemailResponse) GoString() string {
	return s.String()
}

func (s *UpdateBillingcoreInvoiceemailResponse) SetReqMsgId(v string) *UpdateBillingcoreInvoiceemailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBillingcoreInvoiceemailResponse) SetResultCode(v string) *UpdateBillingcoreInvoiceemailResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBillingcoreInvoiceemailResponse) SetResultMsg(v string) *UpdateBillingcoreInvoiceemailResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBillingcoreInvoiceemailResponse) SetSuccess(v bool) *UpdateBillingcoreInvoiceemailResponse {
	s.Success = &v
	return s
}

type ApplyBillingcoreMerchantinvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
	// 发票寄送地址
	InvoiceAddress *InvoiceAddress `json:"invoice_address,omitempty" xml:"invoice_address,omitempty"`
	// 发票电子邮箱
	InvoiceEmail *InvoiceEmail `json:"invoice_email,omitempty" xml:"invoice_email,omitempty"`
}

func (s ApplyBillingcoreMerchantinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyBillingcoreMerchantinvoiceRequest) GoString() string {
	return s.String()
}

func (s *ApplyBillingcoreMerchantinvoiceRequest) SetAuthToken(v string) *ApplyBillingcoreMerchantinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceRequest) SetOrderNo(v string) *ApplyBillingcoreMerchantinvoiceRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceRequest) SetInvoice(v *Invoice) *ApplyBillingcoreMerchantinvoiceRequest {
	s.Invoice = v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceRequest) SetInvoiceAddress(v *InvoiceAddress) *ApplyBillingcoreMerchantinvoiceRequest {
	s.InvoiceAddress = v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceRequest) SetInvoiceEmail(v *InvoiceEmail) *ApplyBillingcoreMerchantinvoiceRequest {
	s.InvoiceEmail = v
	return s
}

type ApplyBillingcoreMerchantinvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ApplyBillingcoreMerchantinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyBillingcoreMerchantinvoiceResponse) GoString() string {
	return s.String()
}

func (s *ApplyBillingcoreMerchantinvoiceResponse) SetReqMsgId(v string) *ApplyBillingcoreMerchantinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceResponse) SetResultCode(v string) *ApplyBillingcoreMerchantinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceResponse) SetResultMsg(v string) *ApplyBillingcoreMerchantinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyBillingcoreMerchantinvoiceResponse) SetSuccess(v bool) *ApplyBillingcoreMerchantinvoiceResponse {
	s.Success = &v
	return s
}

type QueryBillingcoreMerchantinvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryBillingcoreMerchantinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreMerchantinvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreMerchantinvoiceRequest) SetAuthToken(v string) *QueryBillingcoreMerchantinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceRequest) SetOrderNo(v string) *QueryBillingcoreMerchantinvoiceRequest {
	s.OrderNo = &v
	return s
}

type QueryBillingcoreMerchantinvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 商户id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 订单金额
	OrderAmt *string `json:"order_amt,omitempty" xml:"order_amt,omitempty"`
	// 币种
	Ccy *string `json:"ccy,omitempty" xml:"ccy,omitempty"`
	// 发票信息
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty"`
	// 发票寄送地址
	InvoiceAddress *InvoiceAddress `json:"invoice_address,omitempty" xml:"invoice_address,omitempty"`
	// 发票电子邮箱
	InvoiceEmail *InvoiceEmail `json:"invoice_email,omitempty" xml:"invoice_email,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryBillingcoreMerchantinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreMerchantinvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetReqMsgId(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetResultCode(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetResultMsg(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetId(v int64) *QueryBillingcoreMerchantinvoiceResponse {
	s.Id = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetMerchantId(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetOrderNo(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.OrderNo = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetOrderAmt(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.OrderAmt = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetCcy(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.Ccy = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetInvoice(v *Invoice) *QueryBillingcoreMerchantinvoiceResponse {
	s.Invoice = v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetInvoiceAddress(v *InvoiceAddress) *QueryBillingcoreMerchantinvoiceResponse {
	s.InvoiceAddress = v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetInvoiceEmail(v *InvoiceEmail) *QueryBillingcoreMerchantinvoiceResponse {
	s.InvoiceEmail = v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetGmtCreate(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.GmtCreate = &v
	return s
}

func (s *QueryBillingcoreMerchantinvoiceResponse) SetGmtModified(v string) *QueryBillingcoreMerchantinvoiceResponse {
	s.GmtModified = &v
	return s
}

type QueryBillingcoreSpbillRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 账单id
	BillId *string `json:"bill_id,omitempty" xml:"bill_id,omitempty" require:"true"`
}

func (s QueryBillingcoreSpbillRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreSpbillRequest) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreSpbillRequest) SetAuthToken(v string) *QueryBillingcoreSpbillRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBillingcoreSpbillRequest) SetBillId(v string) *QueryBillingcoreSpbillRequest {
	s.BillId = &v
	return s
}

type QueryBillingcoreSpbillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ap账单
	ApBill *ApBill `json:"ap_bill,omitempty" xml:"ap_bill,omitempty"`
}

func (s QueryBillingcoreSpbillResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBillingcoreSpbillResponse) GoString() string {
	return s.String()
}

func (s *QueryBillingcoreSpbillResponse) SetReqMsgId(v string) *QueryBillingcoreSpbillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBillingcoreSpbillResponse) SetResultCode(v string) *QueryBillingcoreSpbillResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBillingcoreSpbillResponse) SetResultMsg(v string) *QueryBillingcoreSpbillResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBillingcoreSpbillResponse) SetApBill(v *ApBill) *QueryBillingcoreSpbillResponse {
	s.ApBill = v
	return s
}

type PagequeryBillingcoreSpbillRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 账单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PagequeryBillingcoreSpbillRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryBillingcoreSpbillRequest) GoString() string {
	return s.String()
}

func (s *PagequeryBillingcoreSpbillRequest) SetAuthToken(v string) *PagequeryBillingcoreSpbillRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryBillingcoreSpbillRequest) SetCurrent(v int64) *PagequeryBillingcoreSpbillRequest {
	s.Current = &v
	return s
}

func (s *PagequeryBillingcoreSpbillRequest) SetPageSize(v int64) *PagequeryBillingcoreSpbillRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryBillingcoreSpbillRequest) SetStartDate(v string) *PagequeryBillingcoreSpbillRequest {
	s.StartDate = &v
	return s
}

func (s *PagequeryBillingcoreSpbillRequest) SetEndDate(v string) *PagequeryBillingcoreSpbillRequest {
	s.EndDate = &v
	return s
}

func (s *PagequeryBillingcoreSpbillRequest) SetStatus(v string) *PagequeryBillingcoreSpbillRequest {
	s.Status = &v
	return s
}

type PagequeryBillingcoreSpbillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 账单列表
	Data *ApBill `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryBillingcoreSpbillResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryBillingcoreSpbillResponse) GoString() string {
	return s.String()
}

func (s *PagequeryBillingcoreSpbillResponse) SetReqMsgId(v string) *PagequeryBillingcoreSpbillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetResultCode(v string) *PagequeryBillingcoreSpbillResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetResultMsg(v string) *PagequeryBillingcoreSpbillResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetTotalPages(v int64) *PagequeryBillingcoreSpbillResponse {
	s.TotalPages = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetCurrent(v int64) *PagequeryBillingcoreSpbillResponse {
	s.Current = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetPageSize(v int64) *PagequeryBillingcoreSpbillResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetTotal(v int64) *PagequeryBillingcoreSpbillResponse {
	s.Total = &v
	return s
}

func (s *PagequeryBillingcoreSpbillResponse) SetData(v *ApBill) *PagequeryBillingcoreSpbillResponse {
	s.Data = v
	return s
}

type ApplyBillingcoreSpinvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 账单号，多个时逗号分隔
	BillNos *string `json:"bill_nos,omitempty" xml:"bill_nos,omitempty" require:"true"`
	// 账单总金额
	BillAmt *string `json:"bill_amt,omitempty" xml:"bill_amt,omitempty" require:"true"`
	// 币种
	Ccy *string `json:"ccy,omitempty" xml:"ccy,omitempty" require:"true"`
	// 销售方信息
	SellerInfo *TaxInfo `json:"seller_info,omitempty" xml:"seller_info,omitempty" require:"true"`
	// 购买方信息
	BuyerInfo *TaxInfo `json:"buyer_info,omitempty" xml:"buyer_info,omitempty" require:"true"`
	// 发票信息
	InvoiceInfos []*InvoiceInfo `json:"invoice_infos,omitempty" xml:"invoice_infos,omitempty" require:"true" type:"Repeated"`
}

func (s ApplyBillingcoreSpinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyBillingcoreSpinvoiceRequest) GoString() string {
	return s.String()
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetAuthToken(v string) *ApplyBillingcoreSpinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetBillNos(v string) *ApplyBillingcoreSpinvoiceRequest {
	s.BillNos = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetBillAmt(v string) *ApplyBillingcoreSpinvoiceRequest {
	s.BillAmt = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetCcy(v string) *ApplyBillingcoreSpinvoiceRequest {
	s.Ccy = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetSellerInfo(v *TaxInfo) *ApplyBillingcoreSpinvoiceRequest {
	s.SellerInfo = v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetBuyerInfo(v *TaxInfo) *ApplyBillingcoreSpinvoiceRequest {
	s.BuyerInfo = v
	return s
}

func (s *ApplyBillingcoreSpinvoiceRequest) SetInvoiceInfos(v []*InvoiceInfo) *ApplyBillingcoreSpinvoiceRequest {
	s.InvoiceInfos = v
	return s
}

type ApplyBillingcoreSpinvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ApplyBillingcoreSpinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyBillingcoreSpinvoiceResponse) GoString() string {
	return s.String()
}

func (s *ApplyBillingcoreSpinvoiceResponse) SetReqMsgId(v string) *ApplyBillingcoreSpinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceResponse) SetResultCode(v string) *ApplyBillingcoreSpinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceResponse) SetResultMsg(v string) *ApplyBillingcoreSpinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyBillingcoreSpinvoiceResponse) SetSuccess(v bool) *ApplyBillingcoreSpinvoiceResponse {
	s.Success = &v
	return s
}

type AllCommercialcoreCatalogRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s AllCommercialcoreCatalogRequest) String() string {
	return tea.Prettify(s)
}

func (s AllCommercialcoreCatalogRequest) GoString() string {
	return s.String()
}

func (s *AllCommercialcoreCatalogRequest) SetAuthToken(v string) *AllCommercialcoreCatalogRequest {
	s.AuthToken = &v
	return s
}

type AllCommercialcoreCatalogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 全部类目树结构体
	CatalogTrees []*CatalogVO `json:"catalog_trees,omitempty" xml:"catalog_trees,omitempty" type:"Repeated"`
}

func (s AllCommercialcoreCatalogResponse) String() string {
	return tea.Prettify(s)
}

func (s AllCommercialcoreCatalogResponse) GoString() string {
	return s.String()
}

func (s *AllCommercialcoreCatalogResponse) SetReqMsgId(v string) *AllCommercialcoreCatalogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllCommercialcoreCatalogResponse) SetResultCode(v string) *AllCommercialcoreCatalogResponse {
	s.ResultCode = &v
	return s
}

func (s *AllCommercialcoreCatalogResponse) SetResultMsg(v string) *AllCommercialcoreCatalogResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllCommercialcoreCatalogResponse) SetCatalogTrees(v []*CatalogVO) *AllCommercialcoreCatalogResponse {
	s.CatalogTrees = v
	return s
}

type ListCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 类目id
	CatalogId *int64 `json:"catalog_id,omitempty" xml:"catalog_id,omitempty" require:"true"`
}

func (s ListCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreProductRequest) SetAuthToken(v string) *ListCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCommercialcoreProductRequest) SetCatalogId(v int64) *ListCommercialcoreProductRequest {
	s.CatalogId = &v
	return s
}

type ListCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品列表
	Products []*ProductVO `json:"products,omitempty" xml:"products,omitempty" type:"Repeated"`
}

func (s ListCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreProductResponse) SetReqMsgId(v string) *ListCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCommercialcoreProductResponse) SetResultCode(v string) *ListCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCommercialcoreProductResponse) SetResultMsg(v string) *ListCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCommercialcoreProductResponse) SetProducts(v []*ProductVO) *ListCommercialcoreProductResponse {
	s.Products = v
	return s
}

type ListCommercialcoreCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s ListCommercialcoreCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreCommodityRequest) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreCommodityRequest) SetAuthToken(v string) *ListCommercialcoreCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCommercialcoreCommodityRequest) SetProductCode(v string) *ListCommercialcoreCommodityRequest {
	s.ProductCode = &v
	return s
}

type ListCommercialcoreCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品列表
	Commodities []*CommodityVO `json:"commodities,omitempty" xml:"commodities,omitempty" type:"Repeated"`
}

func (s ListCommercialcoreCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreCommodityResponse) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreCommodityResponse) SetReqMsgId(v string) *ListCommercialcoreCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCommercialcoreCommodityResponse) SetResultCode(v string) *ListCommercialcoreCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCommercialcoreCommodityResponse) SetResultMsg(v string) *ListCommercialcoreCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCommercialcoreCommodityResponse) SetCommodities(v []*CommodityVO) *ListCommercialcoreCommodityResponse {
	s.Commodities = v
	return s
}

type ListCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
}

func (s ListCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreSpecRequest) SetAuthToken(v string) *ListCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCommercialcoreSpecRequest) SetCommodityCode(v string) *ListCommercialcoreSpecRequest {
	s.CommodityCode = &v
	return s
}

type ListCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 规格列表
	Specs []*SpecVO `json:"specs,omitempty" xml:"specs,omitempty" type:"Repeated"`
}

func (s ListCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *ListCommercialcoreSpecResponse) SetReqMsgId(v string) *ListCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCommercialcoreSpecResponse) SetResultCode(v string) *ListCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCommercialcoreSpecResponse) SetResultMsg(v string) *ListCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCommercialcoreSpecResponse) SetSpecs(v []*SpecVO) *ListCommercialcoreSpecResponse {
	s.Specs = v
	return s
}

type QueryCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
}

func (s QueryCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreSpecRequest) SetAuthToken(v string) *QueryCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommercialcoreSpecRequest) SetSpecCode(v string) *QueryCommercialcoreSpecRequest {
	s.SpecCode = &v
	return s
}

type QueryCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 定价计划
	PricePlan *PricePlanVO `json:"price_plan,omitempty" xml:"price_plan,omitempty"`
}

func (s QueryCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreSpecResponse) SetReqMsgId(v string) *QueryCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommercialcoreSpecResponse) SetResultCode(v string) *QueryCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommercialcoreSpecResponse) SetResultMsg(v string) *QueryCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommercialcoreSpecResponse) SetPricePlan(v *PricePlanVO) *QueryCommercialcoreSpecResponse {
	s.PricePlan = v
	return s
}

type AddCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品oxm类型
	OxmType *string `json:"oxm_type,omitempty" xml:"oxm_type,omitempty" require:"true"`
	// 产品一级类目
	L1CatalogId *int64 `json:"l1_catalog_id,omitempty" xml:"l1_catalog_id,omitempty" require:"true"`
	// 产品二级类目
	L2CatalogId *int64 `json:"l2_catalog_id,omitempty" xml:"l2_catalog_id,omitempty" require:"true"`
	// 产品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s AddCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreProductRequest) SetAuthToken(v string) *AddCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetProductCode(v string) *AddCommercialcoreProductRequest {
	s.ProductCode = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetProductName(v string) *AddCommercialcoreProductRequest {
	s.ProductName = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetOxmType(v string) *AddCommercialcoreProductRequest {
	s.OxmType = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetL1CatalogId(v int64) *AddCommercialcoreProductRequest {
	s.L1CatalogId = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetL2CatalogId(v int64) *AddCommercialcoreProductRequest {
	s.L2CatalogId = &v
	return s
}

func (s *AddCommercialcoreProductRequest) SetDesc(v string) *AddCommercialcoreProductRequest {
	s.Desc = &v
	return s
}

type AddCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreProductResponse) SetReqMsgId(v string) *AddCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCommercialcoreProductResponse) SetResultCode(v string) *AddCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCommercialcoreProductResponse) SetResultMsg(v string) *AddCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCommercialcoreProductResponse) SetSuccess(v bool) *AddCommercialcoreProductResponse {
	s.Success = &v
	return s
}

type UpdateCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 产品oxm类型
	OxmType *string `json:"oxm_type,omitempty" xml:"oxm_type,omitempty" require:"true"`
	// 产品一级类目
	L1CatalogId *int64 `json:"l1_catalog_id,omitempty" xml:"l1_catalog_id,omitempty" require:"true"`
	// 产品二级类目
	L2CatalogId *int64 `json:"l2_catalog_id,omitempty" xml:"l2_catalog_id,omitempty" require:"true"`
	// 产品描述xxx
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s UpdateCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreProductRequest) SetAuthToken(v string) *UpdateCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetProductCode(v string) *UpdateCommercialcoreProductRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetProductName(v string) *UpdateCommercialcoreProductRequest {
	s.ProductName = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetOxmType(v string) *UpdateCommercialcoreProductRequest {
	s.OxmType = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetL1CatalogId(v int64) *UpdateCommercialcoreProductRequest {
	s.L1CatalogId = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetL2CatalogId(v int64) *UpdateCommercialcoreProductRequest {
	s.L2CatalogId = &v
	return s
}

func (s *UpdateCommercialcoreProductRequest) SetDesc(v string) *UpdateCommercialcoreProductRequest {
	s.Desc = &v
	return s
}

type UpdateCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreProductResponse) SetReqMsgId(v string) *UpdateCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCommercialcoreProductResponse) SetResultCode(v string) *UpdateCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCommercialcoreProductResponse) SetResultMsg(v string) *UpdateCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCommercialcoreProductResponse) SetSuccess(v bool) *UpdateCommercialcoreProductResponse {
	s.Success = &v
	return s
}

type BatchqueryCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s BatchqueryCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryCommercialcoreProductRequest) SetAuthToken(v string) *BatchqueryCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

type BatchqueryCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品code列表
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" type:"Repeated"`
}

func (s BatchqueryCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryCommercialcoreProductResponse) SetReqMsgId(v string) *BatchqueryCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryCommercialcoreProductResponse) SetResultCode(v string) *BatchqueryCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryCommercialcoreProductResponse) SetResultMsg(v string) *BatchqueryCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryCommercialcoreProductResponse) SetProductCodes(v []*string) *BatchqueryCommercialcoreProductResponse {
	s.ProductCodes = v
	return s
}

type QueryCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s QueryCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreProductRequest) SetAuthToken(v string) *QueryCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommercialcoreProductRequest) SetProductCode(v string) *QueryCommercialcoreProductRequest {
	s.ProductCode = &v
	return s
}

type QueryCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品信息
	Product *ProductDTO `json:"product,omitempty" xml:"product,omitempty"`
}

func (s QueryCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreProductResponse) SetReqMsgId(v string) *QueryCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommercialcoreProductResponse) SetResultCode(v string) *QueryCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommercialcoreProductResponse) SetResultMsg(v string) *QueryCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommercialcoreProductResponse) SetProduct(v *ProductDTO) *QueryCommercialcoreProductResponse {
	s.Product = v
	return s
}

type QueryCommercialcoreCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s QueryCommercialcoreCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreCommodityRequest) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreCommodityRequest) SetAuthToken(v string) *QueryCommercialcoreCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommercialcoreCommodityRequest) SetProductCode(v string) *QueryCommercialcoreCommodityRequest {
	s.ProductCode = &v
	return s
}

type QueryCommercialcoreCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品来源列表
	SourceTypes []*CommoditySourceType `json:"source_types,omitempty" xml:"source_types,omitempty" type:"Repeated"`
}

func (s QueryCommercialcoreCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommercialcoreCommodityResponse) GoString() string {
	return s.String()
}

func (s *QueryCommercialcoreCommodityResponse) SetReqMsgId(v string) *QueryCommercialcoreCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommercialcoreCommodityResponse) SetResultCode(v string) *QueryCommercialcoreCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommercialcoreCommodityResponse) SetResultMsg(v string) *QueryCommercialcoreCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommercialcoreCommodityResponse) SetSourceTypes(v []*CommoditySourceType) *QueryCommercialcoreCommodityResponse {
	s.SourceTypes = v
	return s
}

type AddCommercialcoreCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商品名称
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 商品服务类型
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 商品来源
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty" require:"true"`
	// 商品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s AddCommercialcoreCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreCommodityRequest) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreCommodityRequest) SetAuthToken(v string) *AddCommercialcoreCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetCommodityCode(v string) *AddCommercialcoreCommodityRequest {
	s.CommodityCode = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetProductCode(v string) *AddCommercialcoreCommodityRequest {
	s.ProductCode = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetCommodityName(v string) *AddCommercialcoreCommodityRequest {
	s.CommodityName = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetServiceType(v string) *AddCommercialcoreCommodityRequest {
	s.ServiceType = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetSourceType(v string) *AddCommercialcoreCommodityRequest {
	s.SourceType = &v
	return s
}

func (s *AddCommercialcoreCommodityRequest) SetDesc(v string) *AddCommercialcoreCommodityRequest {
	s.Desc = &v
	return s
}

type AddCommercialcoreCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddCommercialcoreCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreCommodityResponse) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreCommodityResponse) SetReqMsgId(v string) *AddCommercialcoreCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCommercialcoreCommodityResponse) SetResultCode(v string) *AddCommercialcoreCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCommercialcoreCommodityResponse) SetResultMsg(v string) *AddCommercialcoreCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCommercialcoreCommodityResponse) SetSuccess(v bool) *AddCommercialcoreCommodityResponse {
	s.Success = &v
	return s
}

type UpdateCommercialcoreCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商品名称
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 商品服务类型
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 商品来源
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty" require:"true"`
	// 商品描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s UpdateCommercialcoreCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreCommodityRequest) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreCommodityRequest) SetAuthToken(v string) *UpdateCommercialcoreCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetCommodityCode(v string) *UpdateCommercialcoreCommodityRequest {
	s.CommodityCode = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetProductCode(v string) *UpdateCommercialcoreCommodityRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetCommodityName(v string) *UpdateCommercialcoreCommodityRequest {
	s.CommodityName = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetServiceType(v string) *UpdateCommercialcoreCommodityRequest {
	s.ServiceType = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetSourceType(v string) *UpdateCommercialcoreCommodityRequest {
	s.SourceType = &v
	return s
}

func (s *UpdateCommercialcoreCommodityRequest) SetDesc(v string) *UpdateCommercialcoreCommodityRequest {
	s.Desc = &v
	return s
}

type UpdateCommercialcoreCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateCommercialcoreCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreCommodityResponse) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreCommodityResponse) SetReqMsgId(v string) *UpdateCommercialcoreCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCommercialcoreCommodityResponse) SetResultCode(v string) *UpdateCommercialcoreCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCommercialcoreCommodityResponse) SetResultMsg(v string) *UpdateCommercialcoreCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCommercialcoreCommodityResponse) SetSuccess(v bool) *UpdateCommercialcoreCommodityResponse {
	s.Success = &v
	return s
}

type BatchqueryCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
}

func (s BatchqueryCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryCommercialcoreSpecRequest) SetAuthToken(v string) *BatchqueryCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryCommercialcoreSpecRequest) SetCommodityCode(v string) *BatchqueryCommercialcoreSpecRequest {
	s.CommodityCode = &v
	return s
}

type BatchqueryCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 规格售卖模式列表
	SalesModes []*SpecSalesMode `json:"sales_modes,omitempty" xml:"sales_modes,omitempty" type:"Repeated"`
}

func (s BatchqueryCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryCommercialcoreSpecResponse) SetReqMsgId(v string) *BatchqueryCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryCommercialcoreSpecResponse) SetResultCode(v string) *BatchqueryCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryCommercialcoreSpecResponse) SetResultMsg(v string) *BatchqueryCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryCommercialcoreSpecResponse) SetSalesModes(v []*SpecSalesMode) *BatchqueryCommercialcoreSpecResponse {
	s.SalesModes = v
	return s
}

type AddCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 售卖模式
	SalesMode *string `json:"sales_mode,omitempty" xml:"sales_mode,omitempty" require:"true"`
	// 主要付款方式
	MainPayMethod *string `json:"main_pay_method,omitempty" xml:"main_pay_method,omitempty" require:"true"`
	// 规格描述
	SpecDesc *string `json:"spec_desc,omitempty" xml:"spec_desc,omitempty"`
	// 规格名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// 定价计划
	PricePlan *PricePlanVO `json:"price_plan,omitempty" xml:"price_plan,omitempty" require:"true"`
}

func (s AddCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreSpecRequest) SetAuthToken(v string) *AddCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetSpecCode(v string) *AddCommercialcoreSpecRequest {
	s.SpecCode = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetProductCode(v string) *AddCommercialcoreSpecRequest {
	s.ProductCode = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetCommodityCode(v string) *AddCommercialcoreSpecRequest {
	s.CommodityCode = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetSalesMode(v string) *AddCommercialcoreSpecRequest {
	s.SalesMode = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetMainPayMethod(v string) *AddCommercialcoreSpecRequest {
	s.MainPayMethod = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetSpecDesc(v string) *AddCommercialcoreSpecRequest {
	s.SpecDesc = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetSpecName(v string) *AddCommercialcoreSpecRequest {
	s.SpecName = &v
	return s
}

func (s *AddCommercialcoreSpecRequest) SetPricePlan(v *PricePlanVO) *AddCommercialcoreSpecRequest {
	s.PricePlan = v
	return s
}

type AddCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s AddCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *AddCommercialcoreSpecResponse) SetReqMsgId(v string) *AddCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddCommercialcoreSpecResponse) SetResultCode(v string) *AddCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *AddCommercialcoreSpecResponse) SetResultMsg(v string) *AddCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddCommercialcoreSpecResponse) SetSuccess(v bool) *AddCommercialcoreSpecResponse {
	s.Success = &v
	return s
}

type UpdateCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 规格名称
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// 主要付款方式
	MainPayMethod *string `json:"main_pay_method,omitempty" xml:"main_pay_method,omitempty"`
	// 售卖模式
	SalesMode *string `json:"sales_mode,omitempty" xml:"sales_mode,omitempty"`
	// 规格描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s UpdateCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreSpecRequest) SetAuthToken(v string) *UpdateCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCommercialcoreSpecRequest) SetSpecCode(v string) *UpdateCommercialcoreSpecRequest {
	s.SpecCode = &v
	return s
}

func (s *UpdateCommercialcoreSpecRequest) SetSpecName(v string) *UpdateCommercialcoreSpecRequest {
	s.SpecName = &v
	return s
}

func (s *UpdateCommercialcoreSpecRequest) SetMainPayMethod(v string) *UpdateCommercialcoreSpecRequest {
	s.MainPayMethod = &v
	return s
}

func (s *UpdateCommercialcoreSpecRequest) SetSalesMode(v string) *UpdateCommercialcoreSpecRequest {
	s.SalesMode = &v
	return s
}

func (s *UpdateCommercialcoreSpecRequest) SetDesc(v string) *UpdateCommercialcoreSpecRequest {
	s.Desc = &v
	return s
}

type UpdateCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *UpdateCommercialcoreSpecResponse) SetReqMsgId(v string) *UpdateCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCommercialcoreSpecResponse) SetResultCode(v string) *UpdateCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCommercialcoreSpecResponse) SetResultMsg(v string) *UpdateCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCommercialcoreSpecResponse) SetSuccess(v bool) *UpdateCommercialcoreSpecResponse {
	s.Success = &v
	return s
}

type AuthCommercialcoreSpecRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 规格code
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 规格状态
	SpecStatus *string `json:"spec_status,omitempty" xml:"spec_status,omitempty" require:"true"`
}

func (s AuthCommercialcoreSpecRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthCommercialcoreSpecRequest) GoString() string {
	return s.String()
}

func (s *AuthCommercialcoreSpecRequest) SetAuthToken(v string) *AuthCommercialcoreSpecRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthCommercialcoreSpecRequest) SetSpecCode(v string) *AuthCommercialcoreSpecRequest {
	s.SpecCode = &v
	return s
}

func (s *AuthCommercialcoreSpecRequest) SetSpecStatus(v string) *AuthCommercialcoreSpecRequest {
	s.SpecStatus = &v
	return s
}

type AuthCommercialcoreSpecResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AuthCommercialcoreSpecResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthCommercialcoreSpecResponse) GoString() string {
	return s.String()
}

func (s *AuthCommercialcoreSpecResponse) SetReqMsgId(v string) *AuthCommercialcoreSpecResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthCommercialcoreSpecResponse) SetResultCode(v string) *AuthCommercialcoreSpecResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthCommercialcoreSpecResponse) SetResultMsg(v string) *AuthCommercialcoreSpecResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthCommercialcoreSpecResponse) SetSuccess(v bool) *AuthCommercialcoreSpecResponse {
	s.Success = &v
	return s
}

type CheckCommercialcoreProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s CheckCommercialcoreProductRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckCommercialcoreProductRequest) GoString() string {
	return s.String()
}

func (s *CheckCommercialcoreProductRequest) SetAuthToken(v string) *CheckCommercialcoreProductRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckCommercialcoreProductRequest) SetProductCode(v string) *CheckCommercialcoreProductRequest {
	s.ProductCode = &v
	return s
}

type CheckCommercialcoreProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true: code已存在 ；false : code不存在
	IsDuplicate *bool `json:"is_duplicate,omitempty" xml:"is_duplicate,omitempty"`
}

func (s CheckCommercialcoreProductResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckCommercialcoreProductResponse) GoString() string {
	return s.String()
}

func (s *CheckCommercialcoreProductResponse) SetReqMsgId(v string) *CheckCommercialcoreProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckCommercialcoreProductResponse) SetResultCode(v string) *CheckCommercialcoreProductResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckCommercialcoreProductResponse) SetResultMsg(v string) *CheckCommercialcoreProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckCommercialcoreProductResponse) SetIsDuplicate(v bool) *CheckCommercialcoreProductResponse {
	s.IsDuplicate = &v
	return s
}

type AddPartnercoreSignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 政策id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
}

func (s AddPartnercoreSignRequest) String() string {
	return tea.Prettify(s)
}

func (s AddPartnercoreSignRequest) GoString() string {
	return s.String()
}

func (s *AddPartnercoreSignRequest) SetAuthToken(v string) *AddPartnercoreSignRequest {
	s.AuthToken = &v
	return s
}

func (s *AddPartnercoreSignRequest) SetPolicyId(v string) *AddPartnercoreSignRequest {
	s.PolicyId = &v
	return s
}

type AddPartnercoreSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddPartnercoreSignResponse) String() string {
	return tea.Prettify(s)
}

func (s AddPartnercoreSignResponse) GoString() string {
	return s.String()
}

func (s *AddPartnercoreSignResponse) SetReqMsgId(v string) *AddPartnercoreSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddPartnercoreSignResponse) SetResultCode(v string) *AddPartnercoreSignResponse {
	s.ResultCode = &v
	return s
}

func (s *AddPartnercoreSignResponse) SetResultMsg(v string) *AddPartnercoreSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddPartnercoreSignResponse) SetSuccess(v bool) *AddPartnercoreSignResponse {
	s.Success = &v
	return s
}

type QueryPartnercorePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 政策id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
}

func (s QueryPartnercorePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnercorePolicyRequest) GoString() string {
	return s.String()
}

func (s *QueryPartnercorePolicyRequest) SetAuthToken(v string) *QueryPartnercorePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPartnercorePolicyRequest) SetPolicyId(v string) *QueryPartnercorePolicyRequest {
	s.PolicyId = &v
	return s
}

type QueryPartnercorePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 政策信息扩展
	PolicyDto *PolicyDTO `json:"policy_dto,omitempty" xml:"policy_dto,omitempty"`
}

func (s QueryPartnercorePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnercorePolicyResponse) GoString() string {
	return s.String()
}

func (s *QueryPartnercorePolicyResponse) SetReqMsgId(v string) *QueryPartnercorePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPartnercorePolicyResponse) SetResultCode(v string) *QueryPartnercorePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPartnercorePolicyResponse) SetResultMsg(v string) *QueryPartnercorePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPartnercorePolicyResponse) SetPolicyDto(v *PolicyDTO) *QueryPartnercorePolicyResponse {
	s.PolicyDto = v
	return s
}

type PagequeryPartnercorePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 政策名称（字段保留） 不做调用
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty"`
	// 政策状态（字段保留） 不做调用
	PolicyStatus *string `json:"policy_status,omitempty" xml:"policy_status,omitempty"`
	// 签约状态 SIGNED已签约 UNSIGNED 待签约
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryPartnercorePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryPartnercorePolicyRequest) GoString() string {
	return s.String()
}

func (s *PagequeryPartnercorePolicyRequest) SetAuthToken(v string) *PagequeryPartnercorePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryPartnercorePolicyRequest) SetPolicyName(v string) *PagequeryPartnercorePolicyRequest {
	s.PolicyName = &v
	return s
}

func (s *PagequeryPartnercorePolicyRequest) SetPolicyStatus(v string) *PagequeryPartnercorePolicyRequest {
	s.PolicyStatus = &v
	return s
}

func (s *PagequeryPartnercorePolicyRequest) SetSignStatus(v string) *PagequeryPartnercorePolicyRequest {
	s.SignStatus = &v
	return s
}

func (s *PagequeryPartnercorePolicyRequest) SetCurrent(v int64) *PagequeryPartnercorePolicyRequest {
	s.Current = &v
	return s
}

func (s *PagequeryPartnercorePolicyRequest) SetPageSize(v int64) *PagequeryPartnercorePolicyRequest {
	s.PageSize = &v
	return s
}

type PagequeryPartnercorePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 政策信息扩展
	Data []*PolicyDTO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
}

func (s PagequeryPartnercorePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryPartnercorePolicyResponse) GoString() string {
	return s.String()
}

func (s *PagequeryPartnercorePolicyResponse) SetReqMsgId(v string) *PagequeryPartnercorePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetResultCode(v string) *PagequeryPartnercorePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetResultMsg(v string) *PagequeryPartnercorePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetData(v []*PolicyDTO) *PagequeryPartnercorePolicyResponse {
	s.Data = v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetCurrent(v int64) *PagequeryPartnercorePolicyResponse {
	s.Current = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetPageSize(v int64) *PagequeryPartnercorePolicyResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetTotal(v int64) *PagequeryPartnercorePolicyResponse {
	s.Total = &v
	return s
}

func (s *PagequeryPartnercorePolicyResponse) SetTotalPages(v int64) *PagequeryPartnercorePolicyResponse {
	s.TotalPages = &v
	return s
}

type QueryPartnercoreSignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 合同id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
}

func (s QueryPartnercoreSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnercoreSignRequest) GoString() string {
	return s.String()
}

func (s *QueryPartnercoreSignRequest) SetAuthToken(v string) *QueryPartnercoreSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPartnercoreSignRequest) SetAgreementId(v string) *QueryPartnercoreSignRequest {
	s.AgreementId = &v
	return s
}

type QueryPartnercoreSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合同信息
	PartnerPolicyRelation *PartnerPolicyRelation `json:"partner_policy_relation,omitempty" xml:"partner_policy_relation,omitempty"`
	// 政策信息扩展
	PolicyDto *PolicyDTO `json:"policy_dto,omitempty" xml:"policy_dto,omitempty"`
}

func (s QueryPartnercoreSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnercoreSignResponse) GoString() string {
	return s.String()
}

func (s *QueryPartnercoreSignResponse) SetReqMsgId(v string) *QueryPartnercoreSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPartnercoreSignResponse) SetResultCode(v string) *QueryPartnercoreSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPartnercoreSignResponse) SetResultMsg(v string) *QueryPartnercoreSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPartnercoreSignResponse) SetPartnerPolicyRelation(v *PartnerPolicyRelation) *QueryPartnercoreSignResponse {
	s.PartnerPolicyRelation = v
	return s
}

func (s *QueryPartnercoreSignResponse) SetPolicyDto(v *PolicyDTO) *QueryPartnercoreSignResponse {
	s.PolicyDto = v
	return s
}

type BatchqueryTradecorePaidspecinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业中台用来唯一标记商户的id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s BatchqueryTradecorePaidspecinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecorePaidspecinstanceRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecorePaidspecinstanceRequest) SetAuthToken(v string) *BatchqueryTradecorePaidspecinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryTradecorePaidspecinstanceRequest) SetMerchantId(v string) *BatchqueryTradecorePaidspecinstanceRequest {
	s.MerchantId = &v
	return s
}

type BatchqueryTradecorePaidspecinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 所有符合条件的规格实例的部分信息
	PaidSpecInstances []*PaidSpecInstance `json:"paid_spec_instances,omitempty" xml:"paid_spec_instances,omitempty" type:"Repeated"`
}

func (s BatchqueryTradecorePaidspecinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecorePaidspecinstanceResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecorePaidspecinstanceResponse) SetReqMsgId(v string) *BatchqueryTradecorePaidspecinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryTradecorePaidspecinstanceResponse) SetResultCode(v string) *BatchqueryTradecorePaidspecinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryTradecorePaidspecinstanceResponse) SetResultMsg(v string) *BatchqueryTradecorePaidspecinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryTradecorePaidspecinstanceResponse) SetPaidSpecInstances(v []*PaidSpecInstance) *BatchqueryTradecorePaidspecinstanceResponse {
	s.PaidSpecInstances = v
	return s
}

type BatchqueryTradecoreSoldspecinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业中台用来唯一标记商户的id
	// merchant_id 与 merchant_login_main_id至少填一个
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商户(买家)登录主账号
	// merchant_id 与 merchant_login_main_id至少填一个
	MerchantLoginMainId *string `json:"merchant_login_main_id,omitempty" xml:"merchant_login_main_id,omitempty"`
}

func (s BatchqueryTradecoreSoldspecinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecoreSoldspecinstanceRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetAuthToken(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetMerchantId(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.MerchantId = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetMerchantLoginMainId(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.MerchantLoginMainId = &v
	return s
}

type BatchqueryTradecoreSoldspecinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 某开发商已售给某商户的所有规格实例信息
	SoldSpecInstances []*SoldSpecInstance `json:"sold_spec_instances,omitempty" xml:"sold_spec_instances,omitempty" type:"Repeated"`
}

func (s BatchqueryTradecoreSoldspecinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecoreSoldspecinstanceResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetReqMsgId(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetResultCode(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetResultMsg(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetSoldSpecInstances(v []*SoldSpecInstance) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.SoldSpecInstances = v
	return s
}

type QueryTradecoreMerchantinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业中台唯一标识商户的id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryTradecoreMerchantinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreMerchantinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTradecoreMerchantinfoRequest) SetAuthToken(v string) *QueryTradecoreMerchantinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradecoreMerchantinfoRequest) SetMerchantId(v string) *QueryTradecoreMerchantinfoRequest {
	s.MerchantId = &v
	return s
}

type QueryTradecoreMerchantinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
}

func (s QueryTradecoreMerchantinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreMerchantinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTradecoreMerchantinfoResponse) SetReqMsgId(v string) *QueryTradecoreMerchantinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetResultCode(v string) *QueryTradecoreMerchantinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetResultMsg(v string) *QueryTradecoreMerchantinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetMerchantName(v string) *QueryTradecoreMerchantinfoResponse {
	s.MerchantName = &v
	return s
}

type CreateTradecorePayRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 交易渠道编号
	ChannelNo *string `json:"channel_no,omitempty" xml:"channel_no,omitempty" require:"true"`
}

func (s CreateTradecorePayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTradecorePayRequest) GoString() string {
	return s.String()
}

func (s *CreateTradecorePayRequest) SetAuthToken(v string) *CreateTradecorePayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTradecorePayRequest) SetOrderNo(v string) *CreateTradecorePayRequest {
	s.OrderNo = &v
	return s
}

func (s *CreateTradecorePayRequest) SetChannelNo(v string) *CreateTradecorePayRequest {
	s.ChannelNo = &v
	return s
}

type CreateTradecorePayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// form表单信息
	FormData *string `json:"form_data,omitempty" xml:"form_data,omitempty"`
}

func (s CreateTradecorePayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTradecorePayResponse) GoString() string {
	return s.String()
}

func (s *CreateTradecorePayResponse) SetReqMsgId(v string) *CreateTradecorePayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTradecorePayResponse) SetResultCode(v string) *CreateTradecorePayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTradecorePayResponse) SetResultMsg(v string) *CreateTradecorePayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTradecorePayResponse) SetFormData(v string) *CreateTradecorePayResponse {
	s.FormData = &v
	return s
}

type ReceiveTradecorePayRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 支付宝回调参数，参数可能变化，返回字符串
	NotifyData *string `json:"notify_data,omitempty" xml:"notify_data,omitempty" require:"true"`
}

func (s ReceiveTradecorePayRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveTradecorePayRequest) GoString() string {
	return s.String()
}

func (s *ReceiveTradecorePayRequest) SetAuthToken(v string) *ReceiveTradecorePayRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveTradecorePayRequest) SetNotifyData(v string) *ReceiveTradecorePayRequest {
	s.NotifyData = &v
	return s
}

type ReceiveTradecorePayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回success表示成功，否则失败
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ReceiveTradecorePayResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveTradecorePayResponse) GoString() string {
	return s.String()
}

func (s *ReceiveTradecorePayResponse) SetReqMsgId(v string) *ReceiveTradecorePayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveTradecorePayResponse) SetResultCode(v string) *ReceiveTradecorePayResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveTradecorePayResponse) SetResultMsg(v string) *ReceiveTradecorePayResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReceiveTradecorePayResponse) SetResult(v string) *ReceiveTradecorePayResponse {
	s.Result = &v
	return s
}

type CancelTradecoreOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CancelTradecoreOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelTradecoreOrderRequest) GoString() string {
	return s.String()
}

func (s *CancelTradecoreOrderRequest) SetAuthToken(v string) *CancelTradecoreOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelTradecoreOrderRequest) SetOrderNo(v string) *CancelTradecoreOrderRequest {
	s.OrderNo = &v
	return s
}

type CancelTradecoreOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// main_order
	MainOrder *MainOrderVO `json:"main_order,omitempty" xml:"main_order,omitempty"`
}

func (s CancelTradecoreOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelTradecoreOrderResponse) GoString() string {
	return s.String()
}

func (s *CancelTradecoreOrderResponse) SetReqMsgId(v string) *CancelTradecoreOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelTradecoreOrderResponse) SetResultCode(v string) *CancelTradecoreOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelTradecoreOrderResponse) SetResultMsg(v string) *CancelTradecoreOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelTradecoreOrderResponse) SetMainOrder(v *MainOrderVO) *CancelTradecoreOrderResponse {
	s.MainOrder = v
	return s
}

type CreateTradecoreOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// seller
	Seller *string `json:"seller,omitempty" xml:"seller,omitempty" require:"true"`
	// 开发环境可以用：0016010039
	SpId *string `json:"sp_id,omitempty" xml:"sp_id,omitempty" require:"true"`
	// product_name
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 开发环境可以用：3000.00  单位是元
	Amt *string `json:"amt,omitempty" xml:"amt,omitempty" require:"true"`
	// ccy
	Ccy *string `json:"ccy,omitempty" xml:"ccy,omitempty"`
	// 固定填写OFFICIAL_SITE
	OrderOrigin *string `json:"order_origin,omitempty" xml:"order_origin,omitempty" require:"true"`
	// LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
	PayMethod *string `json:"pay_method,omitempty" xml:"pay_method,omitempty" require:"true"`
	// order_duration
	OrderDuration *string `json:"order_duration,omitempty" xml:"order_duration,omitempty" require:"true"`
	// commodity_name
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 开发环境可以用：10007
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// spec_name
	SpecName *string `json:"spec_name,omitempty" xml:"spec_name,omitempty" require:"true"`
	// spec_desc
	SpecDesc *string `json:"spec_desc,omitempty" xml:"spec_desc,omitempty"`
	// order_detail
	OrderDetail *string `json:"order_detail,omitempty" xml:"order_detail,omitempty"`
	// spec_props
	SpecProps []*Pair `json:"spec_props,omitempty" xml:"spec_props,omitempty" require:"true" type:"Repeated"`
	// ext_params
	ExtParams []*Pair `json:"ext_params,omitempty" xml:"ext_params,omitempty" type:"Repeated"`
}

func (s CreateTradecoreOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTradecoreOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateTradecoreOrderRequest) SetAuthToken(v string) *CreateTradecoreOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSeller(v string) *CreateTradecoreOrderRequest {
	s.Seller = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSpId(v string) *CreateTradecoreOrderRequest {
	s.SpId = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetProductName(v string) *CreateTradecoreOrderRequest {
	s.ProductName = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetAmt(v string) *CreateTradecoreOrderRequest {
	s.Amt = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetCcy(v string) *CreateTradecoreOrderRequest {
	s.Ccy = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetOrderOrigin(v string) *CreateTradecoreOrderRequest {
	s.OrderOrigin = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetPayMethod(v string) *CreateTradecoreOrderRequest {
	s.PayMethod = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetOrderDuration(v string) *CreateTradecoreOrderRequest {
	s.OrderDuration = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetCommodityName(v string) *CreateTradecoreOrderRequest {
	s.CommodityName = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSpecCode(v string) *CreateTradecoreOrderRequest {
	s.SpecCode = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSpecName(v string) *CreateTradecoreOrderRequest {
	s.SpecName = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSpecDesc(v string) *CreateTradecoreOrderRequest {
	s.SpecDesc = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetOrderDetail(v string) *CreateTradecoreOrderRequest {
	s.OrderDetail = &v
	return s
}

func (s *CreateTradecoreOrderRequest) SetSpecProps(v []*Pair) *CreateTradecoreOrderRequest {
	s.SpecProps = v
	return s
}

func (s *CreateTradecoreOrderRequest) SetExtParams(v []*Pair) *CreateTradecoreOrderRequest {
	s.ExtParams = v
	return s
}

type CreateTradecoreOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// main_order
	MainOrder *MainOrderVO `json:"main_order,omitempty" xml:"main_order,omitempty"`
}

func (s CreateTradecoreOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTradecoreOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateTradecoreOrderResponse) SetReqMsgId(v string) *CreateTradecoreOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTradecoreOrderResponse) SetResultCode(v string) *CreateTradecoreOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTradecoreOrderResponse) SetResultMsg(v string) *CreateTradecoreOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTradecoreOrderResponse) SetMainOrder(v *MainOrderVO) *CreateTradecoreOrderResponse {
	s.MainOrder = v
	return s
}

type QueryTradecoreOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryTradecoreOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryTradecoreOrderRequest) SetAuthToken(v string) *QueryTradecoreOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradecoreOrderRequest) SetOrderNo(v string) *QueryTradecoreOrderRequest {
	s.OrderNo = &v
	return s
}

type QueryTradecoreOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// main_order
	MainOrder *MainOrderVO `json:"main_order,omitempty" xml:"main_order,omitempty"`
}

func (s QueryTradecoreOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryTradecoreOrderResponse) SetReqMsgId(v string) *QueryTradecoreOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradecoreOrderResponse) SetResultCode(v string) *QueryTradecoreOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradecoreOrderResponse) SetResultMsg(v string) *QueryTradecoreOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradecoreOrderResponse) SetMainOrder(v *MainOrderVO) *QueryTradecoreOrderResponse {
	s.MainOrder = v
	return s
}

type PagequeryTradecoreOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 取值范围：NEW
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty"`
	// 取值范围：INIT、PAY_SUCCESS、CLOSED
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
	SortColumn *string `json:"sort_column,omitempty" xml:"sort_column,omitempty"`
	// 取值范围：ASC（升序）、DESC（降序）
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// page_num
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s PagequeryTradecoreOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryTradecoreOrderRequest) GoString() string {
	return s.String()
}

func (s *PagequeryTradecoreOrderRequest) SetAuthToken(v string) *PagequeryTradecoreOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetOrderType(v string) *PagequeryTradecoreOrderRequest {
	s.OrderType = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetOrderStatus(v string) *PagequeryTradecoreOrderRequest {
	s.OrderStatus = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetSortColumn(v string) *PagequeryTradecoreOrderRequest {
	s.SortColumn = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetSortType(v string) *PagequeryTradecoreOrderRequest {
	s.SortType = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetPageNum(v int64) *PagequeryTradecoreOrderRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryTradecoreOrderRequest) SetPageSize(v int64) *PagequeryTradecoreOrderRequest {
	s.PageSize = &v
	return s
}

type PagequeryTradecoreOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// total
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// order_list
	OrderList []*MainOrderVO `json:"order_list,omitempty" xml:"order_list,omitempty" type:"Repeated"`
}

func (s PagequeryTradecoreOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryTradecoreOrderResponse) GoString() string {
	return s.String()
}

func (s *PagequeryTradecoreOrderResponse) SetReqMsgId(v string) *PagequeryTradecoreOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetResultCode(v string) *PagequeryTradecoreOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetResultMsg(v string) *PagequeryTradecoreOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetPages(v int64) *PagequeryTradecoreOrderResponse {
	s.Pages = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetPageNum(v int64) *PagequeryTradecoreOrderResponse {
	s.PageNum = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetPageSize(v int64) *PagequeryTradecoreOrderResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetTotal(v int64) *PagequeryTradecoreOrderResponse {
	s.Total = &v
	return s
}

func (s *PagequeryTradecoreOrderResponse) SetOrderList(v []*MainOrderVO) *PagequeryTradecoreOrderResponse {
	s.OrderList = v
	return s
}

type CheckTradecoreSpRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 服务商id
	SpId *string `json:"sp_id,omitempty" xml:"sp_id,omitempty" require:"true"`
}

func (s CheckTradecoreSpRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTradecoreSpRequest) GoString() string {
	return s.String()
}

func (s *CheckTradecoreSpRequest) SetAuthToken(v string) *CheckTradecoreSpRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTradecoreSpRequest) SetSpId(v string) *CheckTradecoreSpRequest {
	s.SpId = &v
	return s
}

type CheckTradecoreSpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CheckTradecoreSpResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTradecoreSpResponse) GoString() string {
	return s.String()
}

func (s *CheckTradecoreSpResponse) SetReqMsgId(v string) *CheckTradecoreSpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTradecoreSpResponse) SetResultCode(v string) *CheckTradecoreSpResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTradecoreSpResponse) SetResultMsg(v string) *CheckTradecoreSpResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.26"),
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
 * Description: 发票信息查询
 * Summary: 发票信息查询
 */
func (client *Client) QueryBillingcoreInvoice(request *QueryBillingcoreInvoiceRequest) (_result *QueryBillingcoreInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBillingcoreInvoiceResponse{}
	_body, _err := client.QueryBillingcoreInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发票信息查询
 * Summary: 发票信息查询
 */
func (client *Client) QueryBillingcoreInvoiceEx(request *QueryBillingcoreInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBillingcoreInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBillingcoreInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发票地址信息查询
 * Summary: 发票地址信息查询
 */
func (client *Client) QueryBillingcoreInvoiceloc(request *QueryBillingcoreInvoicelocRequest) (_result *QueryBillingcoreInvoicelocResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBillingcoreInvoicelocResponse{}
	_body, _err := client.QueryBillingcoreInvoicelocEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发票地址信息查询
 * Summary: 发票地址信息查询
 */
func (client *Client) QueryBillingcoreInvoicelocEx(request *QueryBillingcoreInvoicelocRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBillingcoreInvoicelocResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBillingcoreInvoicelocResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoiceloc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增发票信息
 * Summary: 新增发票信息
 */
func (client *Client) AddBillingcoreInvoice(request *AddBillingcoreInvoiceRequest) (_result *AddBillingcoreInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddBillingcoreInvoiceResponse{}
	_body, _err := client.AddBillingcoreInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增发票信息
 * Summary: 新增发票信息
 */
func (client *Client) AddBillingcoreInvoiceEx(request *AddBillingcoreInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddBillingcoreInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBillingcoreInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoice.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新发票信息
 * Summary: 更新发票信息
 */
func (client *Client) UpdateBillingcoreInvoice(request *UpdateBillingcoreInvoiceRequest) (_result *UpdateBillingcoreInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBillingcoreInvoiceResponse{}
	_body, _err := client.UpdateBillingcoreInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新发票信息
 * Summary: 更新发票信息
 */
func (client *Client) UpdateBillingcoreInvoiceEx(request *UpdateBillingcoreInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBillingcoreInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBillingcoreInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoice.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增发票地址
 * Summary: 新增发票地址
 */
func (client *Client) AddBillingcoreInvoiceaddress(request *AddBillingcoreInvoiceaddressRequest) (_result *AddBillingcoreInvoiceaddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddBillingcoreInvoiceaddressResponse{}
	_body, _err := client.AddBillingcoreInvoiceaddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增发票地址
 * Summary: 新增发票地址
 */
func (client *Client) AddBillingcoreInvoiceaddressEx(request *AddBillingcoreInvoiceaddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddBillingcoreInvoiceaddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBillingcoreInvoiceaddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoiceaddress.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新发票地址信息
 * Summary: 更新发票地址信息
 */
func (client *Client) UpdateBillingcoreInvoiceaddress(request *UpdateBillingcoreInvoiceaddressRequest) (_result *UpdateBillingcoreInvoiceaddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBillingcoreInvoiceaddressResponse{}
	_body, _err := client.UpdateBillingcoreInvoiceaddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新发票地址信息
 * Summary: 更新发票地址信息
 */
func (client *Client) UpdateBillingcoreInvoiceaddressEx(request *UpdateBillingcoreInvoiceaddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBillingcoreInvoiceaddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBillingcoreInvoiceaddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoiceaddress.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增发票电子邮箱
 * Summary: 新增发票电子邮箱
 */
func (client *Client) AddBillingcoreInvoiceemail(request *AddBillingcoreInvoiceemailRequest) (_result *AddBillingcoreInvoiceemailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddBillingcoreInvoiceemailResponse{}
	_body, _err := client.AddBillingcoreInvoiceemailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增发票电子邮箱
 * Summary: 新增发票电子邮箱
 */
func (client *Client) AddBillingcoreInvoiceemailEx(request *AddBillingcoreInvoiceemailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddBillingcoreInvoiceemailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBillingcoreInvoiceemailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoiceemail.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新发票电子邮箱
 * Summary: 更新发票电子邮箱
 */
func (client *Client) UpdateBillingcoreInvoiceemail(request *UpdateBillingcoreInvoiceemailRequest) (_result *UpdateBillingcoreInvoiceemailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBillingcoreInvoiceemailResponse{}
	_body, _err := client.UpdateBillingcoreInvoiceemailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新发票电子邮箱
 * Summary: 更新发票电子邮箱
 */
func (client *Client) UpdateBillingcoreInvoiceemailEx(request *UpdateBillingcoreInvoiceemailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBillingcoreInvoiceemailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBillingcoreInvoiceemailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.invoiceemail.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户开票申请
 * Summary: 商户开票申请
 */
func (client *Client) ApplyBillingcoreMerchantinvoice(request *ApplyBillingcoreMerchantinvoiceRequest) (_result *ApplyBillingcoreMerchantinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyBillingcoreMerchantinvoiceResponse{}
	_body, _err := client.ApplyBillingcoreMerchantinvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户开票申请
 * Summary: 商户开票申请
 */
func (client *Client) ApplyBillingcoreMerchantinvoiceEx(request *ApplyBillingcoreMerchantinvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyBillingcoreMerchantinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyBillingcoreMerchantinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.merchantinvoice.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户开票查询
 * Summary: 商户开票查询
 */
func (client *Client) QueryBillingcoreMerchantinvoice(request *QueryBillingcoreMerchantinvoiceRequest) (_result *QueryBillingcoreMerchantinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBillingcoreMerchantinvoiceResponse{}
	_body, _err := client.QueryBillingcoreMerchantinvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户开票查询
 * Summary: 商户开票查询
 */
func (client *Client) QueryBillingcoreMerchantinvoiceEx(request *QueryBillingcoreMerchantinvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBillingcoreMerchantinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBillingcoreMerchantinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.merchantinvoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询服务商账单
 * Summary: 查询服务商账单
 */
func (client *Client) QueryBillingcoreSpbill(request *QueryBillingcoreSpbillRequest) (_result *QueryBillingcoreSpbillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBillingcoreSpbillResponse{}
	_body, _err := client.QueryBillingcoreSpbillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询服务商账单
 * Summary: 查询服务商账单
 */
func (client *Client) QueryBillingcoreSpbillEx(request *QueryBillingcoreSpbillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBillingcoreSpbillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBillingcoreSpbillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.spbill.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询服务商账单
 * Summary: 分页查询服务商账单
 */
func (client *Client) PagequeryBillingcoreSpbill(request *PagequeryBillingcoreSpbillRequest) (_result *PagequeryBillingcoreSpbillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryBillingcoreSpbillResponse{}
	_body, _err := client.PagequeryBillingcoreSpbillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询服务商账单
 * Summary: 分页查询服务商账单
 */
func (client *Client) PagequeryBillingcoreSpbillEx(request *PagequeryBillingcoreSpbillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryBillingcoreSpbillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryBillingcoreSpbillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.spbill.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 服务商结算申请
 * Summary: 服务商结算申请
 */
func (client *Client) ApplyBillingcoreSpinvoice(request *ApplyBillingcoreSpinvoiceRequest) (_result *ApplyBillingcoreSpinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyBillingcoreSpinvoiceResponse{}
	_body, _err := client.ApplyBillingcoreSpinvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 服务商结算申请
 * Summary: 服务商结算申请
 */
func (client *Client) ApplyBillingcoreSpinvoiceEx(request *ApplyBillingcoreSpinvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyBillingcoreSpinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyBillingcoreSpinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.billingcore.spinvoice.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所有类目树
 * Summary: 查询所有类目树
 */
func (client *Client) AllCommercialcoreCatalog(request *AllCommercialcoreCatalogRequest) (_result *AllCommercialcoreCatalogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllCommercialcoreCatalogResponse{}
	_body, _err := client.AllCommercialcoreCatalogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所有类目树
 * Summary: 查询所有类目树
 */
func (client *Client) AllCommercialcoreCatalogEx(request *AllCommercialcoreCatalogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllCommercialcoreCatalogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllCommercialcoreCatalogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.catalog.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据类目id查询产品列表
 * Summary: 查询产品列表
 */
func (client *Client) ListCommercialcoreProduct(request *ListCommercialcoreProductRequest) (_result *ListCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCommercialcoreProductResponse{}
	_body, _err := client.ListCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据类目id查询产品列表
 * Summary: 查询产品列表
 */
func (client *Client) ListCommercialcoreProductEx(request *ListCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据产品Code查询商品列表
 * Summary: 查询商品列表
 */
func (client *Client) ListCommercialcoreCommodity(request *ListCommercialcoreCommodityRequest) (_result *ListCommercialcoreCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCommercialcoreCommodityResponse{}
	_body, _err := client.ListCommercialcoreCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据产品Code查询商品列表
 * Summary: 查询商品列表
 */
func (client *Client) ListCommercialcoreCommodityEx(request *ListCommercialcoreCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCommercialcoreCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCommercialcoreCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.commodity.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商品code查询规格列表
 * Summary: 查询规格列表
 */
func (client *Client) ListCommercialcoreSpec(request *ListCommercialcoreSpecRequest) (_result *ListCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCommercialcoreSpecResponse{}
	_body, _err := client.ListCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商品code查询规格列表
 * Summary: 查询规格列表
 */
func (client *Client) ListCommercialcoreSpecEx(request *ListCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据规格code查询规格定价计划
 * Summary: 查询规格定价计划
 */
func (client *Client) QueryCommercialcoreSpec(request *QueryCommercialcoreSpecRequest) (_result *QueryCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommercialcoreSpecResponse{}
	_body, _err := client.QueryCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据规格code查询规格定价计划
 * Summary: 查询规格定价计划
 */
func (client *Client) QueryCommercialcoreSpecEx(request *QueryCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增产品
 * Summary: 新增产品
 */
func (client *Client) AddCommercialcoreProduct(request *AddCommercialcoreProductRequest) (_result *AddCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCommercialcoreProductResponse{}
	_body, _err := client.AddCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增产品
 * Summary: 新增产品
 */
func (client *Client) AddCommercialcoreProductEx(request *AddCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新产品
 * Summary: 更新产品
 */
func (client *Client) UpdateCommercialcoreProduct(request *UpdateCommercialcoreProductRequest) (_result *UpdateCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCommercialcoreProductResponse{}
	_body, _err := client.UpdateCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新产品
 * Summary: 更新产品
 */
func (client *Client) UpdateCommercialcoreProductEx(request *UpdateCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品code列表
 * Summary: 查询产品code列表
 */
func (client *Client) BatchqueryCommercialcoreProduct(request *BatchqueryCommercialcoreProductRequest) (_result *BatchqueryCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryCommercialcoreProductResponse{}
	_body, _err := client.BatchqueryCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品code列表
 * Summary: 查询产品code列表
 */
func (client *Client) BatchqueryCommercialcoreProductEx(request *BatchqueryCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据产品code查询产品信息
 * Summary: 查询产品
 */
func (client *Client) QueryCommercialcoreProduct(request *QueryCommercialcoreProductRequest) (_result *QueryCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommercialcoreProductResponse{}
	_body, _err := client.QueryCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据产品code查询产品信息
 * Summary: 查询产品
 */
func (client *Client) QueryCommercialcoreProductEx(request *QueryCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据产品code查询商品来源
 * Summary: 查询商品来源
 */
func (client *Client) QueryCommercialcoreCommodity(request *QueryCommercialcoreCommodityRequest) (_result *QueryCommercialcoreCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommercialcoreCommodityResponse{}
	_body, _err := client.QueryCommercialcoreCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据产品code查询商品来源
 * Summary: 查询商品来源
 */
func (client *Client) QueryCommercialcoreCommodityEx(request *QueryCommercialcoreCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommercialcoreCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommercialcoreCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.commodity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增商品
 * Summary: 新增商品
 */
func (client *Client) AddCommercialcoreCommodity(request *AddCommercialcoreCommodityRequest) (_result *AddCommercialcoreCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCommercialcoreCommodityResponse{}
	_body, _err := client.AddCommercialcoreCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增商品
 * Summary: 新增商品
 */
func (client *Client) AddCommercialcoreCommodityEx(request *AddCommercialcoreCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCommercialcoreCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCommercialcoreCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.commodity.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新商品
 * Summary: 更新商品
 */
func (client *Client) UpdateCommercialcoreCommodity(request *UpdateCommercialcoreCommodityRequest) (_result *UpdateCommercialcoreCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCommercialcoreCommodityResponse{}
	_body, _err := client.UpdateCommercialcoreCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新商品
 * Summary: 更新商品
 */
func (client *Client) UpdateCommercialcoreCommodityEx(request *UpdateCommercialcoreCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCommercialcoreCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCommercialcoreCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.commodity.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商品code查询规格售卖模式
 * Summary: 查询规格售卖模式
 */
func (client *Client) BatchqueryCommercialcoreSpec(request *BatchqueryCommercialcoreSpecRequest) (_result *BatchqueryCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryCommercialcoreSpecResponse{}
	_body, _err := client.BatchqueryCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商品code查询规格售卖模式
 * Summary: 查询规格售卖模式
 */
func (client *Client) BatchqueryCommercialcoreSpecEx(request *BatchqueryCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增规格与定价计划
 * Summary: 新增规格与定价计划
 */
func (client *Client) AddCommercialcoreSpec(request *AddCommercialcoreSpecRequest) (_result *AddCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddCommercialcoreSpecResponse{}
	_body, _err := client.AddCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增规格与定价计划
 * Summary: 新增规格与定价计划
 */
func (client *Client) AddCommercialcoreSpecEx(request *AddCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新规格
 * Summary: 更新规格
 */
func (client *Client) UpdateCommercialcoreSpec(request *UpdateCommercialcoreSpecRequest) (_result *UpdateCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCommercialcoreSpecResponse{}
	_body, _err := client.UpdateCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新规格
 * Summary: 更新规格
 */
func (client *Client) UpdateCommercialcoreSpecEx(request *UpdateCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改规格状态
 * Summary: 修改规格状态
 */
func (client *Client) AuthCommercialcoreSpec(request *AuthCommercialcoreSpecRequest) (_result *AuthCommercialcoreSpecResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthCommercialcoreSpecResponse{}
	_body, _err := client.AuthCommercialcoreSpecEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改规格状态
 * Summary: 修改规格状态
 */
func (client *Client) AuthCommercialcoreSpecEx(request *AuthCommercialcoreSpecRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthCommercialcoreSpecResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthCommercialcoreSpecResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.spec.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品code查重校验
 * Summary: 产品code查重校验
 */
func (client *Client) CheckCommercialcoreProduct(request *CheckCommercialcoreProductRequest) (_result *CheckCommercialcoreProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckCommercialcoreProductResponse{}
	_body, _err := client.CheckCommercialcoreProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品code查重校验
 * Summary: 产品code查重校验
 */
func (client *Client) CheckCommercialcoreProductEx(request *CheckCommercialcoreProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckCommercialcoreProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckCommercialcoreProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.commercialcore.product.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增签约接口
 * Summary: 新增签约接口
 */
func (client *Client) AddPartnercoreSign(request *AddPartnercoreSignRequest) (_result *AddPartnercoreSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddPartnercoreSignResponse{}
	_body, _err := client.AddPartnercoreSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增签约接口
 * Summary: 新增签约接口
 */
func (client *Client) AddPartnercoreSignEx(request *AddPartnercoreSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddPartnercoreSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddPartnercoreSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.partnercore.sign.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 政策详情查询
 * Summary: 政策详情查询
 */
func (client *Client) QueryPartnercorePolicy(request *QueryPartnercorePolicyRequest) (_result *QueryPartnercorePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPartnercorePolicyResponse{}
	_body, _err := client.QueryPartnercorePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 政策详情查询
 * Summary: 政策详情查询
 */
func (client *Client) QueryPartnercorePolicyEx(request *QueryPartnercorePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPartnercorePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPartnercorePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.partnercore.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 政策分页查询
 * Summary: 政策分页查询
 */
func (client *Client) PagequeryPartnercorePolicy(request *PagequeryPartnercorePolicyRequest) (_result *PagequeryPartnercorePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryPartnercorePolicyResponse{}
	_body, _err := client.PagequeryPartnercorePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 政策分页查询
 * Summary: 政策分页查询
 */
func (client *Client) PagequeryPartnercorePolicyEx(request *PagequeryPartnercorePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryPartnercorePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryPartnercorePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.partnercore.policy.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 签约信息查询
 * Summary: 签约信息查询
 */
func (client *Client) QueryPartnercoreSign(request *QueryPartnercoreSignRequest) (_result *QueryPartnercoreSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPartnercoreSignResponse{}
	_body, _err := client.QueryPartnercoreSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 签约信息查询
 * Summary: 签约信息查询
 */
func (client *Client) QueryPartnercoreSignEx(request *QueryPartnercoreSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPartnercoreSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPartnercoreSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.partnercore.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
 * Summary: 批量获取商户已购规格实例信息-控制台用
 */
func (client *Client) BatchqueryTradecorePaidspecinstance(request *BatchqueryTradecorePaidspecinstanceRequest) (_result *BatchqueryTradecorePaidspecinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryTradecorePaidspecinstanceResponse{}
	_body, _err := client.BatchqueryTradecorePaidspecinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
 * Summary: 批量获取商户已购规格实例信息-控制台用
 */
func (client *Client) BatchqueryTradecorePaidspecinstanceEx(request *BatchqueryTradecorePaidspecinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryTradecorePaidspecinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryTradecorePaidspecinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.paidspecinstance.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
 * Summary: 获取已售给商户的规格实例信息-开发商用
 */
func (client *Client) BatchqueryTradecoreSoldspecinstance(request *BatchqueryTradecoreSoldspecinstanceRequest) (_result *BatchqueryTradecoreSoldspecinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryTradecoreSoldspecinstanceResponse{}
	_body, _err := client.BatchqueryTradecoreSoldspecinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
 * Summary: 获取已售给商户的规格实例信息-开发商用
 */
func (client *Client) BatchqueryTradecoreSoldspecinstanceEx(request *BatchqueryTradecoreSoldspecinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryTradecoreSoldspecinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryTradecoreSoldspecinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.soldspecinstance.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
 * Summary: 获取商户信息-开发商用
 */
func (client *Client) QueryTradecoreMerchantinfo(request *QueryTradecoreMerchantinfoRequest) (_result *QueryTradecoreMerchantinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradecoreMerchantinfoResponse{}
	_body, _err := client.QueryTradecoreMerchantinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
 * Summary: 获取商户信息-开发商用
 */
func (client *Client) QueryTradecoreMerchantinfoEx(request *QueryTradecoreMerchantinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradecoreMerchantinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradecoreMerchantinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.merchantinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建支付单，调用支付宝接口获取收银台触发表单
 * Summary: 支付创建
 */
func (client *Client) CreateTradecorePay(request *CreateTradecorePayRequest) (_result *CreateTradecorePayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTradecorePayResponse{}
	_body, _err := client.CreateTradecorePayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建支付单，调用支付宝接口获取收银台触发表单
 * Summary: 支付创建
 */
func (client *Client) CreateTradecorePayEx(request *CreateTradecorePayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTradecorePayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTradecorePayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.pay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝支付结果回调
 * Summary: 支付结果回调
 */
func (client *Client) ReceiveTradecorePay(request *ReceiveTradecorePayRequest) (_result *ReceiveTradecorePayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveTradecorePayResponse{}
	_body, _err := client.ReceiveTradecorePayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝支付结果回调
 * Summary: 支付结果回调
 */
func (client *Client) ReceiveTradecorePayEx(request *ReceiveTradecorePayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveTradecorePayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveTradecorePayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.pay.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单取消
 * Summary: 订单取消
 */
func (client *Client) CancelTradecoreOrder(request *CancelTradecoreOrderRequest) (_result *CancelTradecoreOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelTradecoreOrderResponse{}
	_body, _err := client.CancelTradecoreOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单取消
 * Summary: 订单取消
 */
func (client *Client) CancelTradecoreOrderEx(request *CancelTradecoreOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelTradecoreOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelTradecoreOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.order.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单创建
 * Summary: 订单创建
 */
func (client *Client) CreateTradecoreOrder(request *CreateTradecoreOrderRequest) (_result *CreateTradecoreOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTradecoreOrderResponse{}
	_body, _err := client.CreateTradecoreOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单创建
 * Summary: 订单创建
 */
func (client *Client) CreateTradecoreOrderEx(request *CreateTradecoreOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTradecoreOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTradecoreOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单查询
 * Summary: 订单查询
 */
func (client *Client) QueryTradecoreOrder(request *QueryTradecoreOrderRequest) (_result *QueryTradecoreOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradecoreOrderResponse{}
	_body, _err := client.QueryTradecoreOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单查询
 * Summary: 订单查询
 */
func (client *Client) QueryTradecoreOrderEx(request *QueryTradecoreOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradecoreOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradecoreOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单分页查询
 * Summary: 订单分页查询
 */
func (client *Client) PagequeryTradecoreOrder(request *PagequeryTradecoreOrderRequest) (_result *PagequeryTradecoreOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryTradecoreOrderResponse{}
	_body, _err := client.PagequeryTradecoreOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单分页查询
 * Summary: 订单分页查询
 */
func (client *Client) PagequeryTradecoreOrderEx(request *PagequeryTradecoreOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryTradecoreOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryTradecoreOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.order.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 服务商信息校验
 * Summary: 服务商信息校验
 */
func (client *Client) CheckTradecoreSp(request *CheckTradecoreSpRequest) (_result *CheckTradecoreSpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckTradecoreSpResponse{}
	_body, _err := client.CheckTradecoreSpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 服务商信息校验
 * Summary: 服务商信息校验
 */
func (client *Client) CheckTradecoreSpEx(request *CheckTradecoreSpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckTradecoreSpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTradecoreSpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercial.tradecore.sp.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
