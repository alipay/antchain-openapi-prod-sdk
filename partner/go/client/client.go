// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
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

// 支出配置单商品价格条件属性
type ExpenditureQuotationOfferPriceConditionAttr struct {
	// 属性code
	AttrCode *string `json:"attr_code,omitempty" xml:"attr_code,omitempty" require:"true"`
	// 属性值code
	AttrValueCode *string `json:"attr_value_code,omitempty" xml:"attr_value_code,omitempty" require:"true"`
	// 属性值名称
	AttrValueName *string `json:"attr_value_name,omitempty" xml:"attr_value_name,omitempty" require:"true"`
	// 运算符
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s ExpenditureQuotationOfferPriceConditionAttr) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotationOfferPriceConditionAttr) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotationOfferPriceConditionAttr) SetAttrCode(v string) *ExpenditureQuotationOfferPriceConditionAttr {
	s.AttrCode = &v
	return s
}

func (s *ExpenditureQuotationOfferPriceConditionAttr) SetAttrValueCode(v string) *ExpenditureQuotationOfferPriceConditionAttr {
	s.AttrValueCode = &v
	return s
}

func (s *ExpenditureQuotationOfferPriceConditionAttr) SetAttrValueName(v string) *ExpenditureQuotationOfferPriceConditionAttr {
	s.AttrValueName = &v
	return s
}

func (s *ExpenditureQuotationOfferPriceConditionAttr) SetOperator(v string) *ExpenditureQuotationOfferPriceConditionAttr {
	s.Operator = &v
	return s
}

// 合作方签约文件
type PartnerSignFile struct {
	// 文件类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 可预览地址
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty" require:"true"`
}

func (s PartnerSignFile) String() string {
	return tea.Prettify(s)
}

func (s PartnerSignFile) GoString() string {
	return s.String()
}

func (s *PartnerSignFile) SetType(v string) *PartnerSignFile {
	s.Type = &v
	return s
}

func (s *PartnerSignFile) SetName(v string) *PartnerSignFile {
	s.Name = &v
	return s
}

func (s *PartnerSignFile) SetOssUrl(v string) *PartnerSignFile {
	s.OssUrl = &v
	return s
}

// 支出配置单商品价格
type ExpenditureQuotationOfferPrice struct {
	// 定价条件
	ConditionAttrs []*ExpenditureQuotationOfferPriceConditionAttr `json:"condition_attrs,omitempty" xml:"condition_attrs,omitempty" type:"Repeated"`
	// 阶梯起始值
	LadderStart *string `json:"ladder_start,omitempty" xml:"ladder_start,omitempty" require:"true"`
	// 阶梯结束值
	LadderEnd *string `json:"ladder_end,omitempty" xml:"ladder_end,omitempty" require:"true"`
	// 价格
	Price *string `json:"price,omitempty" xml:"price,omitempty" require:"true"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
}

func (s ExpenditureQuotationOfferPrice) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotationOfferPrice) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotationOfferPrice) SetConditionAttrs(v []*ExpenditureQuotationOfferPriceConditionAttr) *ExpenditureQuotationOfferPrice {
	s.ConditionAttrs = v
	return s
}

func (s *ExpenditureQuotationOfferPrice) SetLadderStart(v string) *ExpenditureQuotationOfferPrice {
	s.LadderStart = &v
	return s
}

func (s *ExpenditureQuotationOfferPrice) SetLadderEnd(v string) *ExpenditureQuotationOfferPrice {
	s.LadderEnd = &v
	return s
}

func (s *ExpenditureQuotationOfferPrice) SetPrice(v string) *ExpenditureQuotationOfferPrice {
	s.Price = &v
	return s
}

func (s *ExpenditureQuotationOfferPrice) SetCurrency(v string) *ExpenditureQuotationOfferPrice {
	s.Currency = &v
	return s
}

// 签约记录
type SignRecord struct {
	// 合同类型：标准、自定义
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
	SealMode *string `json:"seal_mode,omitempty" xml:"seal_mode,omitempty" require:"true"`
	// 签约状态
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
	// 签约记录关联的文件信息
	Files []*PartnerSignFile `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s SignRecord) String() string {
	return tea.Prettify(s)
}

func (s SignRecord) GoString() string {
	return s.String()
}

func (s *SignRecord) SetContractType(v string) *SignRecord {
	s.ContractType = &v
	return s
}

func (s *SignRecord) SetSealMode(v string) *SignRecord {
	s.SealMode = &v
	return s
}

func (s *SignRecord) SetSignStatus(v string) *SignRecord {
	s.SignStatus = &v
	return s
}

func (s *SignRecord) SetFiles(v []*PartnerSignFile) *SignRecord {
	s.Files = v
	return s
}

// 支出结算规则
type ExpenditureSettlementRule struct {
	// 支付方式
	//     Alipay("01","Alipay","ALIPAYACCOUNT", "企业支付宝账号"),
	//     BankCard("02","BankCard", "BANKCARD", "银行卡账号")
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" require:"true"`
	// 银行卡账号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 银行用户名称
	BankAccountName *string `json:"bank_account_name,omitempty" xml:"bank_account_name,omitempty"`
	// 开户行支行名称
	BankBranchName *string `json:"bank_branch_name,omitempty" xml:"bank_branch_name,omitempty"`
	// 支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
}

func (s ExpenditureSettlementRule) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureSettlementRule) GoString() string {
	return s.String()
}

func (s *ExpenditureSettlementRule) SetPayType(v string) *ExpenditureSettlementRule {
	s.PayType = &v
	return s
}

func (s *ExpenditureSettlementRule) SetBankNo(v string) *ExpenditureSettlementRule {
	s.BankNo = &v
	return s
}

func (s *ExpenditureSettlementRule) SetBankAccountName(v string) *ExpenditureSettlementRule {
	s.BankAccountName = &v
	return s
}

func (s *ExpenditureSettlementRule) SetBankBranchName(v string) *ExpenditureSettlementRule {
	s.BankBranchName = &v
	return s
}

func (s *ExpenditureSettlementRule) SetAlipayAccount(v string) *ExpenditureSettlementRule {
	s.AlipayAccount = &v
	return s
}

// 支出配置单商品
type ExpenditureQuotationOffer struct {
	// 支出配置单商品主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 一客一价
	PersonalPrice []*ExpenditureQuotationOfferPrice `json:"personal_price,omitempty" xml:"personal_price,omitempty" type:"Repeated"`
	// 外部业务单据号
	OutBusinessNo *string `json:"out_business_no,omitempty" xml:"out_business_no,omitempty"`
	// 支出订购id
	ArrangementNo *string `json:"arrangement_no,omitempty" xml:"arrangement_no,omitempty"`
}

func (s ExpenditureQuotationOffer) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotationOffer) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotationOffer) SetId(v int64) *ExpenditureQuotationOffer {
	s.Id = &v
	return s
}

func (s *ExpenditureQuotationOffer) SetPersonalPrice(v []*ExpenditureQuotationOfferPrice) *ExpenditureQuotationOffer {
	s.PersonalPrice = v
	return s
}

func (s *ExpenditureQuotationOffer) SetOutBusinessNo(v string) *ExpenditureQuotationOffer {
	s.OutBusinessNo = &v
	return s
}

func (s *ExpenditureQuotationOffer) SetArrangementNo(v string) *ExpenditureQuotationOffer {
	s.ArrangementNo = &v
	return s
}

// 支出配置单
type ExpenditureQuotation struct {
	// 支出配置单商品
	QuotationOffers []*ExpenditureQuotationOffer `json:"quotation_offers,omitempty" xml:"quotation_offers,omitempty" type:"Repeated"`
}

func (s ExpenditureQuotation) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotation) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotation) SetQuotationOffers(v []*ExpenditureQuotationOffer) *ExpenditureQuotation {
	s.QuotationOffers = v
	return s
}

// 合作方（伙伴、商家）基本信息
type PartnerBasicInformation struct {
	// 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 企业法人
	EnterpriseLegalPerson *string `json:"enterprise_legal_person,omitempty" xml:"enterprise_legal_person,omitempty" require:"true"`
	// 注册资本
	RegisteredCapital *string `json:"registered_capital,omitempty" xml:"registered_capital,omitempty" require:"true"`
	// 人员规模
	EmployeeCount *string `json:"employee_count,omitempty" xml:"employee_count,omitempty" require:"true"`
	// 企业注册省份
	EnterpriseRegisterProvince *string `json:"enterprise_register_province,omitempty" xml:"enterprise_register_province,omitempty" require:"true"`
	// 企业注册城市
	EnterpriseRegisterCity *string `json:"enterprise_register_city,omitempty" xml:"enterprise_register_city,omitempty" require:"true"`
	// 公司官网地址
	CompanyUrl *string `json:"company_url,omitempty" xml:"company_url,omitempty" require:"true"`
	// 是否上市公司
	Listed *bool `json:"listed,omitempty" xml:"listed,omitempty" require:"true"`
	// 企业简介
	BriefIntroduction *string `json:"brief_introduction,omitempty" xml:"brief_introduction,omitempty" require:"true"`
	// 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
	SubIndustry *string `json:"sub_industry,omitempty" xml:"sub_industry,omitempty"`
}

func (s PartnerBasicInformation) String() string {
	return tea.Prettify(s)
}

func (s PartnerBasicInformation) GoString() string {
	return s.String()
}

func (s *PartnerBasicInformation) SetIndustry(v string) *PartnerBasicInformation {
	s.Industry = &v
	return s
}

func (s *PartnerBasicInformation) SetEnterpriseLegalPerson(v string) *PartnerBasicInformation {
	s.EnterpriseLegalPerson = &v
	return s
}

func (s *PartnerBasicInformation) SetRegisteredCapital(v string) *PartnerBasicInformation {
	s.RegisteredCapital = &v
	return s
}

func (s *PartnerBasicInformation) SetEmployeeCount(v string) *PartnerBasicInformation {
	s.EmployeeCount = &v
	return s
}

func (s *PartnerBasicInformation) SetEnterpriseRegisterProvince(v string) *PartnerBasicInformation {
	s.EnterpriseRegisterProvince = &v
	return s
}

func (s *PartnerBasicInformation) SetEnterpriseRegisterCity(v string) *PartnerBasicInformation {
	s.EnterpriseRegisterCity = &v
	return s
}

func (s *PartnerBasicInformation) SetCompanyUrl(v string) *PartnerBasicInformation {
	s.CompanyUrl = &v
	return s
}

func (s *PartnerBasicInformation) SetListed(v bool) *PartnerBasicInformation {
	s.Listed = &v
	return s
}

func (s *PartnerBasicInformation) SetBriefIntroduction(v string) *PartnerBasicInformation {
	s.BriefIntroduction = &v
	return s
}

func (s *PartnerBasicInformation) SetSubIndustry(v string) *PartnerBasicInformation {
	s.SubIndustry = &v
	return s
}

// 支出合同
type ExpenditureContract struct {
	// 支出合同id
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 支出合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同状态：
	//     INIT("INIT","草稿", ""),
	//     VALID("VALID","正式", ""),
	//     INVALID("INVALID","作废", ""),
	//     AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
	//     AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
	//     AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期开始时间
	GmtStart *string `json:"gmt_start,omitempty" xml:"gmt_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间
	GmtEnd *string `json:"gmt_end,omitempty" xml:"gmt_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 签约记录
	SigningRecord *SignRecord `json:"signing_record,omitempty" xml:"signing_record,omitempty"`
	// 支出结算规则
	SettlementRule *ExpenditureSettlementRule `json:"settlement_rule,omitempty" xml:"settlement_rule,omitempty"`
	// 扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
}

func (s ExpenditureContract) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureContract) GoString() string {
	return s.String()
}

func (s *ExpenditureContract) SetContractId(v string) *ExpenditureContract {
	s.ContractId = &v
	return s
}

func (s *ExpenditureContract) SetContractName(v string) *ExpenditureContract {
	s.ContractName = &v
	return s
}

func (s *ExpenditureContract) SetStatus(v string) *ExpenditureContract {
	s.Status = &v
	return s
}

func (s *ExpenditureContract) SetGmtStart(v string) *ExpenditureContract {
	s.GmtStart = &v
	return s
}

func (s *ExpenditureContract) SetGmtEnd(v string) *ExpenditureContract {
	s.GmtEnd = &v
	return s
}

func (s *ExpenditureContract) SetSigningRecord(v *SignRecord) *ExpenditureContract {
	s.SigningRecord = v
	return s
}

func (s *ExpenditureContract) SetSettlementRule(v *ExpenditureSettlementRule) *ExpenditureContract {
	s.SettlementRule = v
	return s
}

func (s *ExpenditureContract) SetExtendInfo(v string) *ExpenditureContract {
	s.ExtendInfo = &v
	return s
}

// 合作方（伙伴、商家）联系信息
type PartnerContactInformation struct {
	// 企业联系人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 企业联系人手机
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 企业联系邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 通信邮编
	PostCode *string `json:"post_code,omitempty" xml:"post_code,omitempty" require:"true"`
	// 通信地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s PartnerContactInformation) String() string {
	return tea.Prettify(s)
}

func (s PartnerContactInformation) GoString() string {
	return s.String()
}

func (s *PartnerContactInformation) SetName(v string) *PartnerContactInformation {
	s.Name = &v
	return s
}

func (s *PartnerContactInformation) SetPhone(v string) *PartnerContactInformation {
	s.Phone = &v
	return s
}

func (s *PartnerContactInformation) SetEmail(v string) *PartnerContactInformation {
	s.Email = &v
	return s
}

func (s *PartnerContactInformation) SetPostCode(v string) *PartnerContactInformation {
	s.PostCode = &v
	return s
}

func (s *PartnerContactInformation) SetAddress(v string) *PartnerContactInformation {
	s.Address = &v
	return s
}

// 支出配置单对象
type ExpenditureQuotationItem struct {
	// 外部唯一id，sku-id
	OutUniqueId *string `json:"out_unique_id,omitempty" xml:"out_unique_id,omitempty" require:"true"`
	// 配置单商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 支出配置单对象描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 预估交易金额（分）
	PredictTransactionAmount *int64 `json:"predict_transaction_amount,omitempty" xml:"predict_transaction_amount,omitempty" require:"true"`
}

func (s ExpenditureQuotationItem) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotationItem) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotationItem) SetOutUniqueId(v string) *ExpenditureQuotationItem {
	s.OutUniqueId = &v
	return s
}

func (s *ExpenditureQuotationItem) SetName(v string) *ExpenditureQuotationItem {
	s.Name = &v
	return s
}

func (s *ExpenditureQuotationItem) SetDescription(v string) *ExpenditureQuotationItem {
	s.Description = &v
	return s
}

func (s *ExpenditureQuotationItem) SetPredictTransactionAmount(v int64) *ExpenditureQuotationItem {
	s.PredictTransactionAmount = &v
	return s
}

// 结算请求
type SettlementRequest struct {
	// 结算方式：
	// 企业支付宝账号 Alipay
	// 银行卡账号 BankCard
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" require:"true"`
	// 银行卡账号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 银行卡用户名称
	BankAccountName *string `json:"bank_account_name,omitempty" xml:"bank_account_name,omitempty"`
	// 银行支行名称
	BankBranchName *string `json:"bank_branch_name,omitempty" xml:"bank_branch_name,omitempty"`
	// 支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
}

func (s SettlementRequest) String() string {
	return tea.Prettify(s)
}

func (s SettlementRequest) GoString() string {
	return s.String()
}

func (s *SettlementRequest) SetPayType(v string) *SettlementRequest {
	s.PayType = &v
	return s
}

func (s *SettlementRequest) SetBankNo(v string) *SettlementRequest {
	s.BankNo = &v
	return s
}

func (s *SettlementRequest) SetBankAccountName(v string) *SettlementRequest {
	s.BankAccountName = &v
	return s
}

func (s *SettlementRequest) SetBankBranchName(v string) *SettlementRequest {
	s.BankBranchName = &v
	return s
}

func (s *SettlementRequest) SetAlipayAccount(v string) *SettlementRequest {
	s.AlipayAccount = &v
	return s
}

// 银行支行信息
type PbcInfo struct {
	// 支行名称
	BranchName *string `json:"branch_name,omitempty" xml:"branch_name,omitempty" require:"true"`
	// 联行号数据
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
}

func (s PbcInfo) String() string {
	return tea.Prettify(s)
}

func (s PbcInfo) GoString() string {
	return s.String()
}

func (s *PbcInfo) SetBranchName(v string) *PbcInfo {
	s.BranchName = &v
	return s
}

func (s *PbcInfo) SetBankCode(v string) *PbcInfo {
	s.BankCode = &v
	return s
}

// 商品及归属政策相关信息
type CommodityPolicyRelation struct {
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 政策ID
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
}

func (s CommodityPolicyRelation) String() string {
	return tea.Prettify(s)
}

func (s CommodityPolicyRelation) GoString() string {
	return s.String()
}

func (s *CommodityPolicyRelation) SetCommodityCode(v string) *CommodityPolicyRelation {
	s.CommodityCode = &v
	return s
}

func (s *CommodityPolicyRelation) SetPolicyId(v string) *CommodityPolicyRelation {
	s.PolicyId = &v
	return s
}

// 参与人
type Participant struct {
	// 参与人角色
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 参与人工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty" require:"true"`
}

func (s Participant) String() string {
	return tea.Prettify(s)
}

func (s Participant) GoString() string {
	return s.String()
}

func (s *Participant) SetRole(v string) *Participant {
	s.Role = &v
	return s
}

func (s *Participant) SetWorkNo(v string) *Participant {
	s.WorkNo = &v
	return s
}

// 合作方标准合同查询扩展选项
type PartnerStandardContractQueryOption struct {
	// 是否渲染
	RenderContract *bool `json:"render_contract,omitempty" xml:"render_contract,omitempty" require:"true"`
	// 合同渲染上下文，jsonString格式，key值需要提前约定好
	//
	RenderContext *string `json:"render_context,omitempty" xml:"render_context,omitempty" require:"true"`
}

func (s PartnerStandardContractQueryOption) String() string {
	return tea.Prettify(s)
}

func (s PartnerStandardContractQueryOption) GoString() string {
	return s.String()
}

func (s *PartnerStandardContractQueryOption) SetRenderContract(v bool) *PartnerStandardContractQueryOption {
	s.RenderContract = &v
	return s
}

func (s *PartnerStandardContractQueryOption) SetRenderContext(v string) *PartnerStandardContractQueryOption {
	s.RenderContext = &v
	return s
}

// 支出配置单请求
type ExpenditureQuotationRequest struct {
	// 定价模式：
	//     Standard("Standard", "标准价"),
	//     Customer("Customer", "自定义价格"),
	PriceMode *string `json:"price_mode,omitempty" xml:"price_mode,omitempty" require:"true"`
	// 支出配置单对象列表
	QuotationItems []*ExpenditureQuotationItem `json:"quotation_items,omitempty" xml:"quotation_items,omitempty" require:"true" type:"Repeated"`
}

func (s ExpenditureQuotationRequest) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureQuotationRequest) GoString() string {
	return s.String()
}

func (s *ExpenditureQuotationRequest) SetPriceMode(v string) *ExpenditureQuotationRequest {
	s.PriceMode = &v
	return s
}

func (s *ExpenditureQuotationRequest) SetQuotationItems(v []*ExpenditureQuotationItem) *ExpenditureQuotationRequest {
	s.QuotationItems = v
	return s
}

// 省份信息
type Province struct {
	// 省份名称
	ProvinceName *string `json:"province_name,omitempty" xml:"province_name,omitempty" require:"true"`
}

func (s Province) String() string {
	return tea.Prettify(s)
}

func (s Province) GoString() string {
	return s.String()
}

func (s *Province) SetProvinceName(v string) *Province {
	s.ProvinceName = &v
	return s
}

// 支出项目
type ExpenditureProject struct {
	// 项目阶段：
	//     REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
	//     SOLUTION("SOLUTION", "方案沟通", "TALKS"),
	//     TALKS("TALKS", "商务谈判", "SIGNED"),
	//     SIGNED("SIGNED", "签约完成", "SIGNED"),
	//     ABORT("ABORT", "项目终止", "ABORT"),
	//
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty" require:"true"`
	// 项目状态：
	//     DOING("DOING","进行中"),
	//     ABORTED("ABORTED","已终止"),
	//     FINISHED("FINISHED","已完成"),
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 支出合同信息
	Contract *ExpenditureContract `json:"contract,omitempty" xml:"contract,omitempty"`
	// 支出配置单信息
	Quotation *ExpenditureQuotation `json:"quotation,omitempty" xml:"quotation,omitempty"`
	// 合作计划id
	CollaborationPlanId *int64 `json:"collaboration_plan_id,omitempty" xml:"collaboration_plan_id,omitempty"`
}

func (s ExpenditureProject) String() string {
	return tea.Prettify(s)
}

func (s ExpenditureProject) GoString() string {
	return s.String()
}

func (s *ExpenditureProject) SetStage(v string) *ExpenditureProject {
	s.Stage = &v
	return s
}

func (s *ExpenditureProject) SetStatus(v string) *ExpenditureProject {
	s.Status = &v
	return s
}

func (s *ExpenditureProject) SetContract(v *ExpenditureContract) *ExpenditureProject {
	s.Contract = v
	return s
}

func (s *ExpenditureProject) SetQuotation(v *ExpenditureQuotation) *ExpenditureProject {
	s.Quotation = v
	return s
}

func (s *ExpenditureProject) SetCollaborationPlanId(v int64) *ExpenditureProject {
	s.CollaborationPlanId = &v
	return s
}

// 银行顶级机构信息
type Institution struct {
	// 机构id
	InstId *string `json:"inst_id,omitempty" xml:"inst_id,omitempty" require:"true"`
	// 机构名称
	InstName *string `json:"inst_name,omitempty" xml:"inst_name,omitempty" require:"true"`
	// 机构code
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
}

func (s Institution) String() string {
	return tea.Prettify(s)
}

func (s Institution) GoString() string {
	return s.String()
}

func (s *Institution) SetInstId(v string) *Institution {
	s.InstId = &v
	return s
}

func (s *Institution) SetInstName(v string) *Institution {
	s.InstName = &v
	return s
}

func (s *Institution) SetInstCode(v string) *Institution {
	s.InstCode = &v
	return s
}

// 城市信息
type City struct {
	// 城市名称
	CityName *string `json:"city_name,omitempty" xml:"city_name,omitempty" require:"true"`
}

func (s City) String() string {
	return tea.Prettify(s)
}

func (s City) GoString() string {
	return s.String()
}

func (s *City) SetCityName(v string) *City {
	s.CityName = &v
	return s
}

// 合作方（伙伴、商家）信息
type PartnerInformation struct {
	// 合作方（商家、伙伴）用户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 合作方（商家、伙伴）基本信息
	BasicInformation *PartnerBasicInformation `json:"basic_information,omitempty" xml:"basic_information,omitempty" require:"true"`
	// 联系信息
	ContactInformation *PartnerContactInformation `json:"contact_information,omitempty" xml:"contact_information,omitempty" require:"true"`
	// 除约定属性外的，其余商家主要信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
}

func (s PartnerInformation) String() string {
	return tea.Prettify(s)
}

func (s PartnerInformation) GoString() string {
	return s.String()
}

func (s *PartnerInformation) SetTenantId(v string) *PartnerInformation {
	s.TenantId = &v
	return s
}

func (s *PartnerInformation) SetBasicInformation(v *PartnerBasicInformation) *PartnerInformation {
	s.BasicInformation = v
	return s
}

func (s *PartnerInformation) SetContactInformation(v *PartnerContactInformation) *PartnerInformation {
	s.ContactInformation = v
	return s
}

func (s *PartnerInformation) SetExtendInfo(v string) *PartnerInformation {
	s.ExtendInfo = &v
	return s
}

// 合作方标准合同版本信息
type PartnerStandardContractVersion struct {
	// 协议名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 协议可预览地址
	PreviewUrl *string `json:"preview_url,omitempty" xml:"preview_url,omitempty" require:"true"`
	// 协议版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s PartnerStandardContractVersion) String() string {
	return tea.Prettify(s)
}

func (s PartnerStandardContractVersion) GoString() string {
	return s.String()
}

func (s *PartnerStandardContractVersion) SetName(v string) *PartnerStandardContractVersion {
	s.Name = &v
	return s
}

func (s *PartnerStandardContractVersion) SetPreviewUrl(v string) *PartnerStandardContractVersion {
	s.PreviewUrl = &v
	return s
}

func (s *PartnerStandardContractVersion) SetVersion(v string) *PartnerStandardContractVersion {
	s.Version = &v
	return s
}

// 签约请求
type SignRequest struct {
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 签约模式
	SealMode *string `json:"seal_mode,omitempty" xml:"seal_mode,omitempty" require:"true"`
}

func (s SignRequest) String() string {
	return tea.Prettify(s)
}

func (s SignRequest) GoString() string {
	return s.String()
}

func (s *SignRequest) SetContractType(v string) *SignRequest {
	s.ContractType = &v
	return s
}

func (s *SignRequest) SetSealMode(v string) *SignRequest {
	s.SealMode = &v
	return s
}

type QueryEcoCommodityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户name
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 商品信息列表
	OfferCodes []*string `json:"offer_codes,omitempty" xml:"offer_codes,omitempty" require:"true" type:"Repeated"`
}

func (s QueryEcoCommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEcoCommodityRequest) GoString() string {
	return s.String()
}

func (s *QueryEcoCommodityRequest) SetAuthToken(v string) *QueryEcoCommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEcoCommodityRequest) SetTenantName(v string) *QueryEcoCommodityRequest {
	s.TenantName = &v
	return s
}

func (s *QueryEcoCommodityRequest) SetOfferCodes(v []*string) *QueryEcoCommodityRequest {
	s.OfferCodes = v
	return s
}

type QueryEcoCommodityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品及其归属政策信息
	CommodityPolicyInfo []*CommodityPolicyRelation `json:"commodity_policy_info,omitempty" xml:"commodity_policy_info,omitempty" type:"Repeated"`
}

func (s QueryEcoCommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEcoCommodityResponse) GoString() string {
	return s.String()
}

func (s *QueryEcoCommodityResponse) SetReqMsgId(v string) *QueryEcoCommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEcoCommodityResponse) SetResultCode(v string) *QueryEcoCommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEcoCommodityResponse) SetResultMsg(v string) *QueryEcoCommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEcoCommodityResponse) SetCommodityPolicyInfo(v []*CommodityPolicyRelation) *QueryEcoCommodityResponse {
	s.CommodityPolicyInfo = v
	return s
}

type ApplyPartnerSettleinRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 入驻的一级伙伴类型
	L1PartnerType *string `json:"l1_partner_type,omitempty" xml:"l1_partner_type,omitempty" require:"true"`
	// 入驻的二级合作类型
	L2PartnerType *string `json:"l2_partner_type,omitempty" xml:"l2_partner_type,omitempty" require:"true"`
	// 入驻申请业务单据号-幂等使用
	BusinessNo *string `json:"business_no,omitempty" xml:"business_no,omitempty" require:"true"`
	// 合作方信息
	PartnerInformation *PartnerInformation `json:"partner_information,omitempty" xml:"partner_information,omitempty" require:"true"`
	// 参与人列表
	Participants []*Participant `json:"participants,omitempty" xml:"participants,omitempty" require:"true" type:"Repeated"`
	// 签约请求
	SignRequest *SignRequest `json:"sign_request,omitempty" xml:"sign_request,omitempty" require:"true"`
	// 入驻申请扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 入驻申请时间
	ApplyTime *string `json:"apply_time,omitempty" xml:"apply_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 入驻申请类型：新签、改签、续签
	ApplyOperateType *string `json:"apply_operate_type,omitempty" xml:"apply_operate_type,omitempty" require:"true"`
}

func (s ApplyPartnerSettleinRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyPartnerSettleinRequest) GoString() string {
	return s.String()
}

func (s *ApplyPartnerSettleinRequest) SetAuthToken(v string) *ApplyPartnerSettleinRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetSource(v string) *ApplyPartnerSettleinRequest {
	s.Source = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetL1PartnerType(v string) *ApplyPartnerSettleinRequest {
	s.L1PartnerType = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetL2PartnerType(v string) *ApplyPartnerSettleinRequest {
	s.L2PartnerType = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetBusinessNo(v string) *ApplyPartnerSettleinRequest {
	s.BusinessNo = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetPartnerInformation(v *PartnerInformation) *ApplyPartnerSettleinRequest {
	s.PartnerInformation = v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetParticipants(v []*Participant) *ApplyPartnerSettleinRequest {
	s.Participants = v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetSignRequest(v *SignRequest) *ApplyPartnerSettleinRequest {
	s.SignRequest = v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetExtendInfo(v string) *ApplyPartnerSettleinRequest {
	s.ExtendInfo = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetApplyTime(v string) *ApplyPartnerSettleinRequest {
	s.ApplyTime = &v
	return s
}

func (s *ApplyPartnerSettleinRequest) SetApplyOperateType(v string) *ApplyPartnerSettleinRequest {
	s.ApplyOperateType = &v
	return s
}

type ApplyPartnerSettleinResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果编码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 入驻申请记录id
	ApplyId *int64 `json:"apply_id,omitempty" xml:"apply_id,omitempty"`
}

func (s ApplyPartnerSettleinResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyPartnerSettleinResponse) GoString() string {
	return s.String()
}

func (s *ApplyPartnerSettleinResponse) SetReqMsgId(v string) *ApplyPartnerSettleinResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyPartnerSettleinResponse) SetResultCode(v string) *ApplyPartnerSettleinResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyPartnerSettleinResponse) SetResultMsg(v string) *ApplyPartnerSettleinResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyPartnerSettleinResponse) SetCode(v string) *ApplyPartnerSettleinResponse {
	s.Code = &v
	return s
}

func (s *ApplyPartnerSettleinResponse) SetErrorMessage(v string) *ApplyPartnerSettleinResponse {
	s.ErrorMessage = &v
	return s
}

func (s *ApplyPartnerSettleinResponse) SetApplyId(v int64) *ApplyPartnerSettleinResponse {
	s.ApplyId = &v
	return s
}

type CancelPartnerSettleinRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 入驻申请id
	ApplyId *int64 `json:"apply_id,omitempty" xml:"apply_id,omitempty" require:"true"`
}

func (s CancelPartnerSettleinRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelPartnerSettleinRequest) GoString() string {
	return s.String()
}

func (s *CancelPartnerSettleinRequest) SetAuthToken(v string) *CancelPartnerSettleinRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelPartnerSettleinRequest) SetSource(v string) *CancelPartnerSettleinRequest {
	s.Source = &v
	return s
}

func (s *CancelPartnerSettleinRequest) SetApplyId(v int64) *CancelPartnerSettleinRequest {
	s.ApplyId = &v
	return s
}

type CancelPartnerSettleinResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s CancelPartnerSettleinResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelPartnerSettleinResponse) GoString() string {
	return s.String()
}

func (s *CancelPartnerSettleinResponse) SetReqMsgId(v string) *CancelPartnerSettleinResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelPartnerSettleinResponse) SetResultCode(v string) *CancelPartnerSettleinResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelPartnerSettleinResponse) SetResultMsg(v string) *CancelPartnerSettleinResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelPartnerSettleinResponse) SetCode(v string) *CancelPartnerSettleinResponse {
	s.Code = &v
	return s
}

func (s *CancelPartnerSettleinResponse) SetErrorMessage(v string) *CancelPartnerSettleinResponse {
	s.ErrorMessage = &v
	return s
}

type QueryPartnerSettleinRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 入驻申请时，返回的申请id
	ApplyId *int64 `json:"apply_id,omitempty" xml:"apply_id,omitempty" require:"true"`
}

func (s QueryPartnerSettleinRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnerSettleinRequest) GoString() string {
	return s.String()
}

func (s *QueryPartnerSettleinRequest) SetAuthToken(v string) *QueryPartnerSettleinRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPartnerSettleinRequest) SetSource(v string) *QueryPartnerSettleinRequest {
	s.Source = &v
	return s
}

func (s *QueryPartnerSettleinRequest) SetApplyId(v int64) *QueryPartnerSettleinRequest {
	s.ApplyId = &v
	return s
}

type QueryPartnerSettleinResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 签约状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 开始时间
	GmtStart *string `json:"gmt_start,omitempty" xml:"gmt_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	GmtEnd *string `json:"gmt_end,omitempty" xml:"gmt_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 签约信息
	SignRecord *SignRecord `json:"sign_record,omitempty" xml:"sign_record,omitempty"`
}

func (s QueryPartnerSettleinResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPartnerSettleinResponse) GoString() string {
	return s.String()
}

func (s *QueryPartnerSettleinResponse) SetReqMsgId(v string) *QueryPartnerSettleinResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetResultCode(v string) *QueryPartnerSettleinResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetResultMsg(v string) *QueryPartnerSettleinResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetCode(v string) *QueryPartnerSettleinResponse {
	s.Code = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetErrorMessage(v string) *QueryPartnerSettleinResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetStatus(v string) *QueryPartnerSettleinResponse {
	s.Status = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetGmtStart(v string) *QueryPartnerSettleinResponse {
	s.GmtStart = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetGmtEnd(v string) *QueryPartnerSettleinResponse {
	s.GmtEnd = &v
	return s
}

func (s *QueryPartnerSettleinResponse) SetSignRecord(v *SignRecord) *QueryPartnerSettleinResponse {
	s.SignRecord = v
	return s
}

type QuerySettleinContractRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用户租户间功能和数据隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 一级合作类型
	L1PartnerType *string `json:"l1_partner_type,omitempty" xml:"l1_partner_type,omitempty" require:"true"`
	// 二级合作类型
	L2PartnerType *string `json:"l2_partner_type,omitempty" xml:"l2_partner_type,omitempty" require:"true"`
	// 伙伴标准合同查询扩展选项
	Option *PartnerStandardContractQueryOption `json:"option,omitempty" xml:"option,omitempty"`
	// 合同渲染上下文，jsonString格式，key值需要提前约定好
	RenderContext *string `json:"render_context,omitempty" xml:"render_context,omitempty"`
}

func (s QuerySettleinContractRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySettleinContractRequest) GoString() string {
	return s.String()
}

func (s *QuerySettleinContractRequest) SetAuthToken(v string) *QuerySettleinContractRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySettleinContractRequest) SetSource(v string) *QuerySettleinContractRequest {
	s.Source = &v
	return s
}

func (s *QuerySettleinContractRequest) SetL1PartnerType(v string) *QuerySettleinContractRequest {
	s.L1PartnerType = &v
	return s
}

func (s *QuerySettleinContractRequest) SetL2PartnerType(v string) *QuerySettleinContractRequest {
	s.L2PartnerType = &v
	return s
}

func (s *QuerySettleinContractRequest) SetOption(v *PartnerStandardContractQueryOption) *QuerySettleinContractRequest {
	s.Option = v
	return s
}

func (s *QuerySettleinContractRequest) SetRenderContext(v string) *QuerySettleinContractRequest {
	s.RenderContext = &v
	return s
}

type QuerySettleinContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 生效的标准合同版本
	ValidVersion *PartnerStandardContractVersion `json:"valid_version,omitempty" xml:"valid_version,omitempty"`
}

func (s QuerySettleinContractResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySettleinContractResponse) GoString() string {
	return s.String()
}

func (s *QuerySettleinContractResponse) SetReqMsgId(v string) *QuerySettleinContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySettleinContractResponse) SetResultCode(v string) *QuerySettleinContractResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySettleinContractResponse) SetResultMsg(v string) *QuerySettleinContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySettleinContractResponse) SetCode(v string) *QuerySettleinContractResponse {
	s.Code = &v
	return s
}

func (s *QuerySettleinContractResponse) SetErrorMessage(v string) *QuerySettleinContractResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QuerySettleinContractResponse) SetValidVersion(v *PartnerStandardContractVersion) *QuerySettleinContractResponse {
	s.ValidVersion = v
	return s
}

type CreateExpenditureProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户间功能和数据隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 合作计划id
	CooperationPlanId *int64 `json:"cooperation_plan_id,omitempty" xml:"cooperation_plan_id,omitempty" require:"true"`
	// 业务单据号-用于幂等
	BusinessNo *string `json:"business_no,omitempty" xml:"business_no,omitempty" require:"true"`
	// 合作方-用户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 参与人列表
	Participants []*Participant `json:"participants,omitempty" xml:"participants,omitempty" require:"true" type:"Repeated"`
	// 支出配置单请求信息
	ExpenditureQuotationRequest *ExpenditureQuotationRequest `json:"expenditure_quotation_request,omitempty" xml:"expenditure_quotation_request,omitempty" require:"true"`
	// 签约请求
	SignRequest *SignRequest `json:"sign_request,omitempty" xml:"sign_request,omitempty" require:"true"`
	// 结算请求
	SettlementRequest *SettlementRequest `json:"settlement_request,omitempty" xml:"settlement_request,omitempty" require:"true"`
	// 生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 扩展信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
}

func (s CreateExpenditureProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateExpenditureProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateExpenditureProjectRequest) SetAuthToken(v string) *CreateExpenditureProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetSource(v string) *CreateExpenditureProjectRequest {
	s.Source = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetCooperationPlanId(v int64) *CreateExpenditureProjectRequest {
	s.CooperationPlanId = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetBusinessNo(v string) *CreateExpenditureProjectRequest {
	s.BusinessNo = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetTenantId(v string) *CreateExpenditureProjectRequest {
	s.TenantId = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetParticipants(v []*Participant) *CreateExpenditureProjectRequest {
	s.Participants = v
	return s
}

func (s *CreateExpenditureProjectRequest) SetExpenditureQuotationRequest(v *ExpenditureQuotationRequest) *CreateExpenditureProjectRequest {
	s.ExpenditureQuotationRequest = v
	return s
}

func (s *CreateExpenditureProjectRequest) SetSignRequest(v *SignRequest) *CreateExpenditureProjectRequest {
	s.SignRequest = v
	return s
}

func (s *CreateExpenditureProjectRequest) SetSettlementRequest(v *SettlementRequest) *CreateExpenditureProjectRequest {
	s.SettlementRequest = v
	return s
}

func (s *CreateExpenditureProjectRequest) SetValidTime(v string) *CreateExpenditureProjectRequest {
	s.ValidTime = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetInvalidTime(v string) *CreateExpenditureProjectRequest {
	s.InvalidTime = &v
	return s
}

func (s *CreateExpenditureProjectRequest) SetExtendInfo(v string) *CreateExpenditureProjectRequest {
	s.ExtendInfo = &v
	return s
}

type CreateExpenditureProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 项目id，用于后续交互使用
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s CreateExpenditureProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateExpenditureProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateExpenditureProjectResponse) SetReqMsgId(v string) *CreateExpenditureProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateExpenditureProjectResponse) SetResultCode(v string) *CreateExpenditureProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateExpenditureProjectResponse) SetResultMsg(v string) *CreateExpenditureProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateExpenditureProjectResponse) SetCode(v string) *CreateExpenditureProjectResponse {
	s.Code = &v
	return s
}

func (s *CreateExpenditureProjectResponse) SetErrorMessage(v string) *CreateExpenditureProjectResponse {
	s.ErrorMessage = &v
	return s
}

func (s *CreateExpenditureProjectResponse) SetProjectId(v int64) *CreateExpenditureProjectResponse {
	s.ProjectId = &v
	return s
}

type QueryExpenditureProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户间功能和数据的隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 项目id
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s QueryExpenditureProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryExpenditureProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryExpenditureProjectRequest) SetAuthToken(v string) *QueryExpenditureProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryExpenditureProjectRequest) SetSource(v string) *QueryExpenditureProjectRequest {
	s.Source = &v
	return s
}

func (s *QueryExpenditureProjectRequest) SetProjectId(v int64) *QueryExpenditureProjectRequest {
	s.ProjectId = &v
	return s
}

type QueryExpenditureProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 支出项目信息
	Detail *ExpenditureProject `json:"detail,omitempty" xml:"detail,omitempty"`
}

func (s QueryExpenditureProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryExpenditureProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryExpenditureProjectResponse) SetReqMsgId(v string) *QueryExpenditureProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryExpenditureProjectResponse) SetResultCode(v string) *QueryExpenditureProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryExpenditureProjectResponse) SetResultMsg(v string) *QueryExpenditureProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryExpenditureProjectResponse) SetCode(v string) *QueryExpenditureProjectResponse {
	s.Code = &v
	return s
}

func (s *QueryExpenditureProjectResponse) SetErrorMessage(v string) *QueryExpenditureProjectResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryExpenditureProjectResponse) SetDetail(v *ExpenditureProject) *QueryExpenditureProjectResponse {
	s.Detail = v
	return s
}

type CancelExpenditureProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用于租户间功能和数据的隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 项目id
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s CancelExpenditureProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelExpenditureProjectRequest) GoString() string {
	return s.String()
}

func (s *CancelExpenditureProjectRequest) SetAuthToken(v string) *CancelExpenditureProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelExpenditureProjectRequest) SetSource(v string) *CancelExpenditureProjectRequest {
	s.Source = &v
	return s
}

func (s *CancelExpenditureProjectRequest) SetProjectId(v int64) *CancelExpenditureProjectRequest {
	s.ProjectId = &v
	return s
}

type CancelExpenditureProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s CancelExpenditureProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelExpenditureProjectResponse) GoString() string {
	return s.String()
}

func (s *CancelExpenditureProjectResponse) SetReqMsgId(v string) *CancelExpenditureProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelExpenditureProjectResponse) SetResultCode(v string) *CancelExpenditureProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelExpenditureProjectResponse) SetResultMsg(v string) *CancelExpenditureProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelExpenditureProjectResponse) SetCode(v string) *CancelExpenditureProjectResponse {
	s.Code = &v
	return s
}

func (s *CancelExpenditureProjectResponse) SetErrorMessage(v string) *CancelExpenditureProjectResponse {
	s.ErrorMessage = &v
	return s
}

type ConfirmExpenditureProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 项目id
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 客户确认时间
	ConfirmTime *string `json:"confirm_time,omitempty" xml:"confirm_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ConfirmExpenditureProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExpenditureProjectRequest) GoString() string {
	return s.String()
}

func (s *ConfirmExpenditureProjectRequest) SetAuthToken(v string) *ConfirmExpenditureProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmExpenditureProjectRequest) SetSource(v string) *ConfirmExpenditureProjectRequest {
	s.Source = &v
	return s
}

func (s *ConfirmExpenditureProjectRequest) SetProjectId(v int64) *ConfirmExpenditureProjectRequest {
	s.ProjectId = &v
	return s
}

func (s *ConfirmExpenditureProjectRequest) SetConfirmTime(v string) *ConfirmExpenditureProjectRequest {
	s.ConfirmTime = &v
	return s
}

type ConfirmExpenditureProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s ConfirmExpenditureProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmExpenditureProjectResponse) GoString() string {
	return s.String()
}

func (s *ConfirmExpenditureProjectResponse) SetReqMsgId(v string) *ConfirmExpenditureProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmExpenditureProjectResponse) SetResultCode(v string) *ConfirmExpenditureProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmExpenditureProjectResponse) SetResultMsg(v string) *ConfirmExpenditureProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmExpenditureProjectResponse) SetCode(v string) *ConfirmExpenditureProjectResponse {
	s.Code = &v
	return s
}

func (s *ConfirmExpenditureProjectResponse) SetErrorMessage(v string) *ConfirmExpenditureProjectResponse {
	s.ErrorMessage = &v
	return s
}

type QueryStandardAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户来源-用户租户间功能和数据隔离
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 一级合作类型
	//
	L1PartnerType *string `json:"l1_partner_type,omitempty" xml:"l1_partner_type,omitempty" require:"true"`
	// 二级合作类型
	L2PartnerType *string `json:"l2_partner_type,omitempty" xml:"l2_partner_type,omitempty" require:"true"`
	// 标准额合同场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 伙伴标准合同查询扩展选项
	//
	Option *PartnerStandardContractQueryOption `json:"option,omitempty" xml:"option,omitempty"`
	// 合同渲染上下文，jsonString格式，key值需要提前约定好
	RenderContext *string `json:"render_context,omitempty" xml:"render_context,omitempty"`
}

func (s QueryStandardAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStandardAgreementRequest) GoString() string {
	return s.String()
}

func (s *QueryStandardAgreementRequest) SetAuthToken(v string) *QueryStandardAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStandardAgreementRequest) SetSource(v string) *QueryStandardAgreementRequest {
	s.Source = &v
	return s
}

func (s *QueryStandardAgreementRequest) SetL1PartnerType(v string) *QueryStandardAgreementRequest {
	s.L1PartnerType = &v
	return s
}

func (s *QueryStandardAgreementRequest) SetL2PartnerType(v string) *QueryStandardAgreementRequest {
	s.L2PartnerType = &v
	return s
}

func (s *QueryStandardAgreementRequest) SetScene(v string) *QueryStandardAgreementRequest {
	s.Scene = &v
	return s
}

func (s *QueryStandardAgreementRequest) SetOption(v *PartnerStandardContractQueryOption) *QueryStandardAgreementRequest {
	s.Option = v
	return s
}

func (s *QueryStandardAgreementRequest) SetRenderContext(v string) *QueryStandardAgreementRequest {
	s.RenderContext = &v
	return s
}

type QueryStandardAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 生效的标准合同版本
	ValidVersion *PartnerStandardContractVersion `json:"valid_version,omitempty" xml:"valid_version,omitempty"`
}

func (s QueryStandardAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStandardAgreementResponse) GoString() string {
	return s.String()
}

func (s *QueryStandardAgreementResponse) SetReqMsgId(v string) *QueryStandardAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStandardAgreementResponse) SetResultCode(v string) *QueryStandardAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStandardAgreementResponse) SetResultMsg(v string) *QueryStandardAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStandardAgreementResponse) SetCode(v string) *QueryStandardAgreementResponse {
	s.Code = &v
	return s
}

func (s *QueryStandardAgreementResponse) SetErrorMessage(v string) *QueryStandardAgreementResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryStandardAgreementResponse) SetValidVersion(v *PartnerStandardContractVersion) *QueryStandardAgreementResponse {
	s.ValidVersion = v
	return s
}

type QueryAreaProvinceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 省份, 空:全部省份, 不为空筛选关键字省份
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
}

func (s QueryAreaProvinceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAreaProvinceRequest) GoString() string {
	return s.String()
}

func (s *QueryAreaProvinceRequest) SetAuthToken(v string) *QueryAreaProvinceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAreaProvinceRequest) SetProvince(v string) *QueryAreaProvinceRequest {
	s.Province = &v
	return s
}

type QueryAreaProvinceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 省份信息列表
	Provinces []*Province `json:"provinces,omitempty" xml:"provinces,omitempty" type:"Repeated"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s QueryAreaProvinceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAreaProvinceResponse) GoString() string {
	return s.String()
}

func (s *QueryAreaProvinceResponse) SetReqMsgId(v string) *QueryAreaProvinceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAreaProvinceResponse) SetResultCode(v string) *QueryAreaProvinceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAreaProvinceResponse) SetResultMsg(v string) *QueryAreaProvinceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAreaProvinceResponse) SetProvinces(v []*Province) *QueryAreaProvinceResponse {
	s.Provinces = v
	return s
}

func (s *QueryAreaProvinceResponse) SetErrorMessage(v string) *QueryAreaProvinceResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryAreaProvinceResponse) SetCode(v string) *QueryAreaProvinceResponse {
	s.Code = &v
	return s
}

type QueryAreaCityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 省份名称
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 城市
	City *string `json:"city,omitempty" xml:"city,omitempty"`
}

func (s QueryAreaCityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAreaCityRequest) GoString() string {
	return s.String()
}

func (s *QueryAreaCityRequest) SetAuthToken(v string) *QueryAreaCityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAreaCityRequest) SetProvince(v string) *QueryAreaCityRequest {
	s.Province = &v
	return s
}

func (s *QueryAreaCityRequest) SetCity(v string) *QueryAreaCityRequest {
	s.City = &v
	return s
}

type QueryAreaCityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 城市列表
	Cities []*City `json:"cities,omitempty" xml:"cities,omitempty" type:"Repeated"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s QueryAreaCityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAreaCityResponse) GoString() string {
	return s.String()
}

func (s *QueryAreaCityResponse) SetReqMsgId(v string) *QueryAreaCityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAreaCityResponse) SetResultCode(v string) *QueryAreaCityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAreaCityResponse) SetResultMsg(v string) *QueryAreaCityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAreaCityResponse) SetCities(v []*City) *QueryAreaCityResponse {
	s.Cities = v
	return s
}

func (s *QueryAreaCityResponse) SetCode(v string) *QueryAreaCityResponse {
	s.Code = &v
	return s
}

func (s *QueryAreaCityResponse) SetErrorMessage(v string) *QueryAreaCityResponse {
	s.ErrorMessage = &v
	return s
}

type QueryPbcInstitutionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 机构名称关键字
	InstName *string `json:"inst_name,omitempty" xml:"inst_name,omitempty" require:"true"`
}

func (s QueryPbcInstitutionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPbcInstitutionRequest) GoString() string {
	return s.String()
}

func (s *QueryPbcInstitutionRequest) SetAuthToken(v string) *QueryPbcInstitutionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPbcInstitutionRequest) SetInstName(v string) *QueryPbcInstitutionRequest {
	s.InstName = &v
	return s
}

type QueryPbcInstitutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行机构信息列表
	Institutions []*Institution `json:"institutions,omitempty" xml:"institutions,omitempty" type:"Repeated"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s QueryPbcInstitutionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPbcInstitutionResponse) GoString() string {
	return s.String()
}

func (s *QueryPbcInstitutionResponse) SetReqMsgId(v string) *QueryPbcInstitutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPbcInstitutionResponse) SetResultCode(v string) *QueryPbcInstitutionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPbcInstitutionResponse) SetResultMsg(v string) *QueryPbcInstitutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPbcInstitutionResponse) SetInstitutions(v []*Institution) *QueryPbcInstitutionResponse {
	s.Institutions = v
	return s
}

func (s *QueryPbcInstitutionResponse) SetCode(v string) *QueryPbcInstitutionResponse {
	s.Code = &v
	return s
}

func (s *QueryPbcInstitutionResponse) SetErrorMessage(v string) *QueryPbcInstitutionResponse {
	s.ErrorMessage = &v
	return s
}

type QueryPbcNameRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 省份名称
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 城市名称
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 银行机构id
	InstId *string `json:"inst_id,omitempty" xml:"inst_id,omitempty" require:"true"`
	// 支行名称关键字
	BranchName *string `json:"branch_name,omitempty" xml:"branch_name,omitempty" require:"true"`
}

func (s QueryPbcNameRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPbcNameRequest) GoString() string {
	return s.String()
}

func (s *QueryPbcNameRequest) SetAuthToken(v string) *QueryPbcNameRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPbcNameRequest) SetProvince(v string) *QueryPbcNameRequest {
	s.Province = &v
	return s
}

func (s *QueryPbcNameRequest) SetCity(v string) *QueryPbcNameRequest {
	s.City = &v
	return s
}

func (s *QueryPbcNameRequest) SetInstId(v string) *QueryPbcNameRequest {
	s.InstId = &v
	return s
}

func (s *QueryPbcNameRequest) SetBranchName(v string) *QueryPbcNameRequest {
	s.BranchName = &v
	return s
}

type QueryPbcNameResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询到的支行信息列表
	PbcInfos []*PbcInfo `json:"pbc_infos,omitempty" xml:"pbc_infos,omitempty" type:"Repeated"`
	// 错误描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s QueryPbcNameResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPbcNameResponse) GoString() string {
	return s.String()
}

func (s *QueryPbcNameResponse) SetReqMsgId(v string) *QueryPbcNameResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPbcNameResponse) SetResultCode(v string) *QueryPbcNameResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPbcNameResponse) SetResultMsg(v string) *QueryPbcNameResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPbcNameResponse) SetPbcInfos(v []*PbcInfo) *QueryPbcNameResponse {
	s.PbcInfos = v
	return s
}

func (s *QueryPbcNameResponse) SetErrorMessage(v string) *QueryPbcNameResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryPbcNameResponse) SetCode(v string) *QueryPbcNameResponse {
	s.Code = &v
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
				"sdk_version":      tea.String("1.0.20"),
				"_prod_code":       tea.String("PARTNER"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 获取合作伙伴销售商品对应的政策ID
 * Summary: 获取合作伙伴销售商品对应的政策ID
 */
func (client *Client) QueryEcoCommodity(request *QueryEcoCommodityRequest) (_result *QueryEcoCommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEcoCommodityResponse{}
	_body, _err := client.QueryEcoCommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取合作伙伴销售商品对应的政策ID
 * Summary: 获取合作伙伴销售商品对应的政策ID
 */
func (client *Client) QueryEcoCommodityEx(request *QueryEcoCommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEcoCommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEcoCommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.eco.commodity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻申请
 * Summary: 合作方（伙伴、商家等）入驻申请
 */
func (client *Client) ApplyPartnerSettlein(request *ApplyPartnerSettleinRequest) (_result *ApplyPartnerSettleinResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyPartnerSettleinResponse{}
	_body, _err := client.ApplyPartnerSettleinEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻申请
 * Summary: 合作方（伙伴、商家等）入驻申请
 */
func (client *Client) ApplyPartnerSettleinEx(request *ApplyPartnerSettleinRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyPartnerSettleinResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyPartnerSettleinResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.partner.settlein.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻撤销
 * Summary: 合作方（伙伴、商家等）入驻撤销
 */
func (client *Client) CancelPartnerSettlein(request *CancelPartnerSettleinRequest) (_result *CancelPartnerSettleinResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelPartnerSettleinResponse{}
	_body, _err := client.CancelPartnerSettleinEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻撤销
 * Summary: 合作方（伙伴、商家等）入驻撤销
 */
func (client *Client) CancelPartnerSettleinEx(request *CancelPartnerSettleinRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelPartnerSettleinResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelPartnerSettleinResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.partner.settlein.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻申请结果查询
 * Summary: 合作方（伙伴、商家等）入驻申请结果查询
 */
func (client *Client) QueryPartnerSettlein(request *QueryPartnerSettleinRequest) (_result *QueryPartnerSettleinResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPartnerSettleinResponse{}
	_body, _err := client.QueryPartnerSettleinEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻申请结果查询
 * Summary: 合作方（伙伴、商家等）入驻申请结果查询
 */
func (client *Client) QueryPartnerSettleinEx(request *QueryPartnerSettleinRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPartnerSettleinResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPartnerSettleinResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.partner.settlein.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻标准合同查询
 * Summary: 合作方（伙伴、商家等）入驻标准合同查询
 */
func (client *Client) QuerySettleinContract(request *QuerySettleinContractRequest) (_result *QuerySettleinContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySettleinContractResponse{}
	_body, _err := client.QuerySettleinContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）入驻标准合同查询
 * Summary: 合作方（伙伴、商家等）入驻标准合同查询
 */
func (client *Client) QuerySettleinContractEx(request *QuerySettleinContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySettleinContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySettleinContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.settlein.contract.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目创建接口
 * Summary: 合作方（伙伴、商家等）支出项目创建接口
 */
func (client *Client) CreateExpenditureProject(request *CreateExpenditureProjectRequest) (_result *CreateExpenditureProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateExpenditureProjectResponse{}
	_body, _err := client.CreateExpenditureProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目创建接口
 * Summary: 合作方（伙伴、商家等）支出项目创建接口
 */
func (client *Client) CreateExpenditureProjectEx(request *CreateExpenditureProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateExpenditureProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateExpenditureProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.expenditure.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目查询接口
 * Summary: 合作方（伙伴、商家等）支出项目查询接口
 */
func (client *Client) QueryExpenditureProject(request *QueryExpenditureProjectRequest) (_result *QueryExpenditureProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryExpenditureProjectResponse{}
	_body, _err := client.QueryExpenditureProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目查询接口
 * Summary: 合作方（伙伴、商家等）支出项目查询接口
 */
func (client *Client) QueryExpenditureProjectEx(request *QueryExpenditureProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryExpenditureProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryExpenditureProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.expenditure.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目撤销接口
 * Summary: 合作方（伙伴、商家等）支出项目撤销接口
 */
func (client *Client) CancelExpenditureProject(request *CancelExpenditureProjectRequest) (_result *CancelExpenditureProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelExpenditureProjectResponse{}
	_body, _err := client.CancelExpenditureProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）支出项目撤销接口
 * Summary: 合作方（伙伴、商家等）支出项目撤销接口
 */
func (client *Client) CancelExpenditureProjectEx(request *CancelExpenditureProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelExpenditureProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelExpenditureProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.expenditure.project.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支出项目合同确认接口
 * Summary: 支出项目合同确认接口
 */
func (client *Client) ConfirmExpenditureProject(request *ConfirmExpenditureProjectRequest) (_result *ConfirmExpenditureProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmExpenditureProjectResponse{}
	_body, _err := client.ConfirmExpenditureProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支出项目合同确认接口
 * Summary: 支出项目合同确认接口
 */
func (client *Client) ConfirmExpenditureProjectEx(request *ConfirmExpenditureProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmExpenditureProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmExpenditureProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.expenditure.project.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）标准额合同查询接口
 * Summary: 合作方（伙伴、商家等）标准额合同查询接口
 */
func (client *Client) QueryStandardAgreement(request *QueryStandardAgreementRequest) (_result *QueryStandardAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStandardAgreementResponse{}
	_body, _err := client.QueryStandardAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）标准额合同查询接口
 * Summary: 合作方（伙伴、商家等）标准额合同查询接口
 */
func (client *Client) QueryStandardAgreementEx(request *QueryStandardAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStandardAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStandardAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.standard.agreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生态伙伴区域省份查询接口
 * Summary: 生态伙伴区域省份查询接口
 */
func (client *Client) QueryAreaProvince(request *QueryAreaProvinceRequest) (_result *QueryAreaProvinceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAreaProvinceResponse{}
	_body, _err := client.QueryAreaProvinceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生态伙伴区域省份查询接口
 * Summary: 生态伙伴区域省份查询接口
 */
func (client *Client) QueryAreaProvinceEx(request *QueryAreaProvinceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAreaProvinceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAreaProvinceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.area.province.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
 * Summary: 合作方（伙伴、商家等）区域信息查询
 */
func (client *Client) QueryAreaCity(request *QueryAreaCityRequest) (_result *QueryAreaCityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAreaCityResponse{}
	_body, _err := client.QueryAreaCityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
 * Summary: 合作方（伙伴、商家等）区域信息查询
 */
func (client *Client) QueryAreaCityEx(request *QueryAreaCityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAreaCityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAreaCityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.area.city.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 联行号关联银行机构信息查询
 * Summary: 联行号关联银行机构信息查询
 */
func (client *Client) QueryPbcInstitution(request *QueryPbcInstitutionRequest) (_result *QueryPbcInstitutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPbcInstitutionResponse{}
	_body, _err := client.QueryPbcInstitutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 联行号关联银行机构信息查询
 * Summary: 联行号关联银行机构信息查询
 */
func (client *Client) QueryPbcInstitutionEx(request *QueryPbcInstitutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPbcInstitutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPbcInstitutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.pbc.institution.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
 * Summary: 合作方（伙伴、商家等）支行信息查询
 */
func (client *Client) QueryPbcName(request *QueryPbcNameRequest) (_result *QueryPbcNameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPbcNameResponse{}
	_body, _err := client.QueryPbcNameEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
 * Summary: 合作方（伙伴、商家等）支行信息查询
 */
func (client *Client) QueryPbcNameEx(request *QueryPbcNameRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPbcNameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPbcNameResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.partner.pbc.name.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
