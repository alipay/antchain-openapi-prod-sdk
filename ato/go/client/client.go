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

// 文件信息
type FileInfo struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s FileInfo) String() string {
	return tea.Prettify(s)
}

func (s FileInfo) GoString() string {
	return s.String()
}

func (s *FileInfo) SetFileName(v string) *FileInfo {
	s.FileName = &v
	return s
}

func (s *FileInfo) SetFileKey(v string) *FileInfo {
	s.FileKey = &v
	return s
}

// 订单还款计划
type PromiseInfo struct {
}

func (s PromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s PromiseInfo) GoString() string {
	return s.String()
}

// 同步订单中的下单人信息
type UserSyncInfo struct {
}

func (s UserSyncInfo) String() string {
	return tea.Prettify(s)
}

func (s UserSyncInfo) GoString() string {
	return s.String()
}

// 公司信息
type CompanyInfo struct {
	// 营业执照文件信息
	BusinessLicenseFile *FileInfo `json:"business_license_file,omitempty" xml:"business_license_file,omitempty" require:"true"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty" require:"true"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 公司别名
	CompanyAliasName *string `json:"company_alias_name,omitempty" xml:"company_alias_name,omitempty" require:"true"`
	// 公司数科租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户类型： 01：企业；07：个体工商户
	// 默认不填为01
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty"`
	// 公司联系电话
	CompanyMobile *string `json:"company_mobile,omitempty" xml:"company_mobile,omitempty" require:"true"`
	// 公司联系地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty" require:"true"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系人手机号码
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty" require:"true"`
	// 绑定企业支付宝账号
	BindAlipayNo *string `json:"bind_alipay_no,omitempty" xml:"bind_alipay_no,omitempty" require:"true"`
	// 结算企业支付宝账号
	SettleAlipayNo *string `json:"settle_alipay_no,omitempty" xml:"settle_alipay_no,omitempty" require:"true"`
	// 绑定支付宝uid
	BindAlipayUid *string `json:"bind_alipay_uid,omitempty" xml:"bind_alipay_uid,omitempty" require:"true"`
}

func (s CompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfo) GoString() string {
	return s.String()
}

func (s *CompanyInfo) SetBusinessLicenseFile(v *FileInfo) *CompanyInfo {
	s.BusinessLicenseFile = v
	return s
}

func (s *CompanyInfo) SetProductMainClass(v string) *CompanyInfo {
	s.ProductMainClass = &v
	return s
}

func (s *CompanyInfo) SetCompanyName(v string) *CompanyInfo {
	s.CompanyName = &v
	return s
}

func (s *CompanyInfo) SetCompanyAliasName(v string) *CompanyInfo {
	s.CompanyAliasName = &v
	return s
}

func (s *CompanyInfo) SetTenantId(v string) *CompanyInfo {
	s.TenantId = &v
	return s
}

func (s *CompanyInfo) SetMerchantId(v string) *CompanyInfo {
	s.MerchantId = &v
	return s
}

func (s *CompanyInfo) SetMerchantType(v string) *CompanyInfo {
	s.MerchantType = &v
	return s
}

func (s *CompanyInfo) SetCompanyMobile(v string) *CompanyInfo {
	s.CompanyMobile = &v
	return s
}

func (s *CompanyInfo) SetCompanyAddress(v string) *CompanyInfo {
	s.CompanyAddress = &v
	return s
}

func (s *CompanyInfo) SetContactName(v string) *CompanyInfo {
	s.ContactName = &v
	return s
}

func (s *CompanyInfo) SetContactMobile(v string) *CompanyInfo {
	s.ContactMobile = &v
	return s
}

func (s *CompanyInfo) SetBindAlipayNo(v string) *CompanyInfo {
	s.BindAlipayNo = &v
	return s
}

func (s *CompanyInfo) SetSettleAlipayNo(v string) *CompanyInfo {
	s.SettleAlipayNo = &v
	return s
}

func (s *CompanyInfo) SetBindAlipayUid(v string) *CompanyInfo {
	s.BindAlipayUid = &v
	return s
}

// 租户协议分页对象
type AgreementPage struct {
	// 协议id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 代理企业名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty" require:"true"`
	// 协议类型 枚举
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 租户签约状态 枚举
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
}

func (s AgreementPage) String() string {
	return tea.Prettify(s)
}

func (s AgreementPage) GoString() string {
	return s.String()
}

func (s *AgreementPage) SetAgreementId(v string) *AgreementPage {
	s.AgreementId = &v
	return s
}

func (s *AgreementPage) SetMerchantName(v string) *AgreementPage {
	s.MerchantName = &v
	return s
}

func (s *AgreementPage) SetTenantId(v string) *AgreementPage {
	s.TenantId = &v
	return s
}

func (s *AgreementPage) SetProductMainClass(v string) *AgreementPage {
	s.ProductMainClass = &v
	return s
}

func (s *AgreementPage) SetAgreementType(v string) *AgreementPage {
	s.AgreementType = &v
	return s
}

func (s *AgreementPage) SetSignStatus(v string) *AgreementPage {
	s.SignStatus = &v
	return s
}

// 风险场景的决策结果
type RiskScene struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该场景的风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
}

func (s RiskScene) String() string {
	return tea.Prettify(s)
}

func (s RiskScene) GoString() string {
	return s.String()
}

func (s *RiskScene) SetSceneCode(v string) *RiskScene {
	s.SceneCode = &v
	return s
}

func (s *RiskScene) SetDecision(v string) *RiskScene {
	s.Decision = &v
	return s
}

// 策略结果详情
type RiskStrategy struct {
	// 策略ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 策略决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s RiskStrategy) String() string {
	return tea.Prettify(s)
}

func (s RiskStrategy) GoString() string {
	return s.String()
}

func (s *RiskStrategy) SetId(v string) *RiskStrategy {
	s.Id = &v
	return s
}

func (s *RiskStrategy) SetName(v string) *RiskStrategy {
	s.Name = &v
	return s
}

func (s *RiskStrategy) SetDecision(v string) *RiskStrategy {
	s.Decision = &v
	return s
}

func (s *RiskStrategy) SetSceneCode(v string) *RiskStrategy {
	s.SceneCode = &v
	return s
}

// 分账关系页对象
type RelationPage struct {
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 分账公司名称统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s RelationPage) String() string {
	return tea.Prettify(s)
}

func (s RelationPage) GoString() string {
	return s.String()
}

func (s *RelationPage) SetRelationId(v string) *RelationPage {
	s.RelationId = &v
	return s
}

func (s *RelationPage) SetCompanyName(v string) *RelationPage {
	s.CompanyName = &v
	return s
}

func (s *RelationPage) SetMerchantId(v string) *RelationPage {
	s.MerchantId = &v
	return s
}

func (s *RelationPage) SetStatus(v string) *RelationPage {
	s.Status = &v
	return s
}

//  公司信息修改
type CompanyInfoUpdate struct {
	// 营业执照文件信息
	BusinessLicenseFile *FileInfo `json:"business_license_file,omitempty" xml:"business_license_file,omitempty"`
	// 业务类型 枚举
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 公司别名
	CompanyAliasName *string `json:"company_alias_name,omitempty" xml:"company_alias_name,omitempty"`
	// 公司数科租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 公司联系电话
	CompanyMobile *string `json:"company_mobile,omitempty" xml:"company_mobile,omitempty"`
	// 公司联系地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty"`
	// 联系人手机号码
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty"`
}

func (s CompanyInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfoUpdate) GoString() string {
	return s.String()
}

func (s *CompanyInfoUpdate) SetBusinessLicenseFile(v *FileInfo) *CompanyInfoUpdate {
	s.BusinessLicenseFile = v
	return s
}

func (s *CompanyInfoUpdate) SetProductMainClass(v string) *CompanyInfoUpdate {
	s.ProductMainClass = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyName(v string) *CompanyInfoUpdate {
	s.CompanyName = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyAliasName(v string) *CompanyInfoUpdate {
	s.CompanyAliasName = &v
	return s
}

func (s *CompanyInfoUpdate) SetTenantId(v string) *CompanyInfoUpdate {
	s.TenantId = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyMobile(v string) *CompanyInfoUpdate {
	s.CompanyMobile = &v
	return s
}

func (s *CompanyInfoUpdate) SetCompanyAddress(v string) *CompanyInfoUpdate {
	s.CompanyAddress = &v
	return s
}

func (s *CompanyInfoUpdate) SetContactName(v string) *CompanyInfoUpdate {
	s.ContactName = &v
	return s
}

func (s *CompanyInfoUpdate) SetContactMobile(v string) *CompanyInfoUpdate {
	s.ContactMobile = &v
	return s
}

// 进件分页对象
type MerchantAgentPage struct {
	// 进件id
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	//
	// 代理企业名称
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 进件审核状态 枚举
	PayExpandStatus *string `json:"pay_expand_status,omitempty" xml:"pay_expand_status,omitempty" require:"true"`
}

func (s MerchantAgentPage) String() string {
	return tea.Prettify(s)
}

func (s MerchantAgentPage) GoString() string {
	return s.String()
}

func (s *MerchantAgentPage) SetPayExpandId(v string) *MerchantAgentPage {
	s.PayExpandId = &v
	return s
}

func (s *MerchantAgentPage) SetAgentName(v string) *MerchantAgentPage {
	s.AgentName = &v
	return s
}

func (s *MerchantAgentPage) SetTenantId(v string) *MerchantAgentPage {
	s.TenantId = &v
	return s
}

func (s *MerchantAgentPage) SetBizType(v string) *MerchantAgentPage {
	s.BizType = &v
	return s
}

func (s *MerchantAgentPage) SetPayExpandStatus(v string) *MerchantAgentPage {
	s.PayExpandStatus = &v
	return s
}

// 订单消息结构体
type OrderMsgInfo struct {
	// 订单id
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息ID
	//
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 消息类型
	//
	MsgPublishType *string `json:"msg_publish_type,omitempty" xml:"msg_publish_type,omitempty" require:"true"`
	// 消息创建时间
	//
	MsgCreateTime *string `json:"msg_create_time,omitempty" xml:"msg_create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
	MsgStatus *string `json:"msg_status,omitempty" xml:"msg_status,omitempty" require:"true"`
	// 消息重投次数
	//
	MsgRetryTime *int64 `json:"msg_retry_time,omitempty" xml:"msg_retry_time,omitempty" require:"true"`
	// 消息体内容
	MsgContent *string `json:"msg_content,omitempty" xml:"msg_content,omitempty" require:"true"`
	// 消息回调地址
	MsgCallbackUrl *string `json:"msg_callback_url,omitempty" xml:"msg_callback_url,omitempty" require:"true"`
	// 新回调地址
	NewMsgCallbackUrl *string `json:"new_msg_callback_url,omitempty" xml:"new_msg_callback_url,omitempty" require:"true"`
}

func (s OrderMsgInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderMsgInfo) GoString() string {
	return s.String()
}

func (s *OrderMsgInfo) SetOrderId(v string) *OrderMsgInfo {
	s.OrderId = &v
	return s
}

func (s *OrderMsgInfo) SetMsgId(v string) *OrderMsgInfo {
	s.MsgId = &v
	return s
}

func (s *OrderMsgInfo) SetMsgPublishType(v string) *OrderMsgInfo {
	s.MsgPublishType = &v
	return s
}

func (s *OrderMsgInfo) SetMsgCreateTime(v string) *OrderMsgInfo {
	s.MsgCreateTime = &v
	return s
}

func (s *OrderMsgInfo) SetMsgStatus(v string) *OrderMsgInfo {
	s.MsgStatus = &v
	return s
}

func (s *OrderMsgInfo) SetMsgRetryTime(v int64) *OrderMsgInfo {
	s.MsgRetryTime = &v
	return s
}

func (s *OrderMsgInfo) SetMsgContent(v string) *OrderMsgInfo {
	s.MsgContent = &v
	return s
}

func (s *OrderMsgInfo) SetMsgCallbackUrl(v string) *OrderMsgInfo {
	s.MsgCallbackUrl = &v
	return s
}

func (s *OrderMsgInfo) SetNewMsgCallbackUrl(v string) *OrderMsgInfo {
	s.NewMsgCallbackUrl = &v
	return s
}

// 主订单信息
type OrderInfo struct {
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

// 主动支付单据
type ActivePayOrder struct {
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态
	// INIT：交易创建
	// FAILED：付款失败
	// SUCCESS：付款成功
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态原因码
	StatusReasonCode *string `json:"status_reason_code,omitempty" xml:"status_reason_code,omitempty" minLength:"1"`
	// 超时关闭
	StatusReasonMsg *string `json:"status_reason_msg,omitempty" xml:"status_reason_msg,omitempty" minLength:"1"`
	// 本次交易支付的订单金额，单位为分
	// 付款成功或付款成功之后的状态必填
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" minimum:"1"`
	// 用户在交易中支付的金额，单位为分
	// 付款成功的状态必填
	PaidAmount *int64 `json:"paid_amount,omitempty" xml:"paid_amount,omitempty" minimum:"1"`
	// 商家在交易中实际收到的款项，单位为分
	// 付款成功的状态必填
	ReceiptAmount *int64 `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty" minimum:"1"`
	// 交易支付时间
	// 付款成功的状态必填
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ActivePayOrder) String() string {
	return tea.Prettify(s)
}

func (s ActivePayOrder) GoString() string {
	return s.String()
}

func (s *ActivePayOrder) SetTradeNo(v string) *ActivePayOrder {
	s.TradeNo = &v
	return s
}

func (s *ActivePayOrder) SetTradeStatus(v string) *ActivePayOrder {
	s.TradeStatus = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonCode(v string) *ActivePayOrder {
	s.StatusReasonCode = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonMsg(v string) *ActivePayOrder {
	s.StatusReasonMsg = &v
	return s
}

func (s *ActivePayOrder) SetTotalAmount(v int64) *ActivePayOrder {
	s.TotalAmount = &v
	return s
}

func (s *ActivePayOrder) SetPaidAmount(v int64) *ActivePayOrder {
	s.PaidAmount = &v
	return s
}

func (s *ActivePayOrder) SetReceiptAmount(v int64) *ActivePayOrder {
	s.ReceiptAmount = &v
	return s
}

func (s *ActivePayOrder) SetGmtPay(v string) *ActivePayOrder {
	s.GmtPay = &v
	return s
}

// 应用信息
type ApplicationInfo struct {
	// 应用场景
	// MINI_APP 小程序
	// APP 自有app
	// ALL 两种都有
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty" require:"true"`
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty" require:"true"`
	// 小程序名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty" require:"true"`
	// 网站地址
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty" require:"true"`
	// 商户名称。
	// 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户服务名称。
	// 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty" require:"true"`
	// 商户服务描述。
	// 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
	MerchantServiceDesc *string `json:"merchant_service_desc,omitempty" xml:"merchant_service_desc,omitempty" require:"true"`
}

func (s ApplicationInfo) String() string {
	return tea.Prettify(s)
}

func (s ApplicationInfo) GoString() string {
	return s.String()
}

func (s *ApplicationInfo) SetApplicationScene(v string) *ApplicationInfo {
	s.ApplicationScene = &v
	return s
}

func (s *ApplicationInfo) SetTinyAppId(v string) *ApplicationInfo {
	s.TinyAppId = &v
	return s
}

func (s *ApplicationInfo) SetSiteName(v string) *ApplicationInfo {
	s.SiteName = &v
	return s
}

func (s *ApplicationInfo) SetSitUrl(v string) *ApplicationInfo {
	s.SitUrl = &v
	return s
}

func (s *ApplicationInfo) SetMerchantName(v string) *ApplicationInfo {
	s.MerchantName = &v
	return s
}

func (s *ApplicationInfo) SetMerchantServiceName(v string) *ApplicationInfo {
	s.MerchantServiceName = &v
	return s
}

func (s *ApplicationInfo) SetMerchantServiceDesc(v string) *ApplicationInfo {
	s.MerchantServiceDesc = &v
	return s
}

// 订单商品信息
type GoodsInfo struct {
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

// 分页查询对象
type PageQuery struct {
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
}

func (s PageQuery) String() string {
	return tea.Prettify(s)
}

func (s PageQuery) GoString() string {
	return s.String()
}

func (s *PageQuery) SetPageSize(v int64) *PageQuery {
	s.PageSize = &v
	return s
}

func (s *PageQuery) SetPageIndex(v int64) *PageQuery {
	s.PageIndex = &v
	return s
}

// 应用信息修改
type ApplicationInfoUpdate struct {
	// 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty"`
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 小程序名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// http://asdasas.com
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty"`
	// 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
	// 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
	MerchantServiceDesc *string `json:"merchant_service_desc,omitempty" xml:"merchant_service_desc,omitempty"`
}

func (s ApplicationInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s ApplicationInfoUpdate) GoString() string {
	return s.String()
}

func (s *ApplicationInfoUpdate) SetApplicationScene(v string) *ApplicationInfoUpdate {
	s.ApplicationScene = &v
	return s
}

func (s *ApplicationInfoUpdate) SetTinyAppId(v string) *ApplicationInfoUpdate {
	s.TinyAppId = &v
	return s
}

func (s *ApplicationInfoUpdate) SetSiteName(v string) *ApplicationInfoUpdate {
	s.SiteName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetSitUrl(v string) *ApplicationInfoUpdate {
	s.SitUrl = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantName(v string) *ApplicationInfoUpdate {
	s.MerchantName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantServiceName(v string) *ApplicationInfoUpdate {
	s.MerchantServiceName = &v
	return s
}

func (s *ApplicationInfoUpdate) SetMerchantServiceDesc(v string) *ApplicationInfoUpdate {
	s.MerchantServiceDesc = &v
	return s
}

// 法人信息
type LegalInfo struct {
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 法人证件号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty" require:"true"`
	// 法人证件正面
	LegalCertFrontFile *FileInfo `json:"legal_cert_front_file,omitempty" xml:"legal_cert_front_file,omitempty" require:"true"`
	// 法人证件反面
	LegalCertBackFile *FileInfo `json:"legal_cert_back_file,omitempty" xml:"legal_cert_back_file,omitempty" require:"true"`
}

func (s LegalInfo) String() string {
	return tea.Prettify(s)
}

func (s LegalInfo) GoString() string {
	return s.String()
}

func (s *LegalInfo) SetLegalName(v string) *LegalInfo {
	s.LegalName = &v
	return s
}

func (s *LegalInfo) SetLegalCertNo(v string) *LegalInfo {
	s.LegalCertNo = &v
	return s
}

func (s *LegalInfo) SetLegalCertFrontFile(v *FileInfo) *LegalInfo {
	s.LegalCertFrontFile = v
	return s
}

func (s *LegalInfo) SetLegalCertBackFile(v *FileInfo) *LegalInfo {
	s.LegalCertBackFile = v
	return s
}

// 审核信息
type AuditInfo struct {
	// 审核步骤
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty" require:"true"`
	// 审核主体
	AuditSubject *string `json:"audit_subject,omitempty" xml:"audit_subject,omitempty" require:"true"`
	// 审核状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 审核时间
	ApplyDateStr *string `json:"apply_date_str,omitempty" xml:"apply_date_str,omitempty" require:"true"`
	// 审核失败描述
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty" require:"true"`
}

func (s AuditInfo) String() string {
	return tea.Prettify(s)
}

func (s AuditInfo) GoString() string {
	return s.String()
}

func (s *AuditInfo) SetStage(v string) *AuditInfo {
	s.Stage = &v
	return s
}

func (s *AuditInfo) SetAuditSubject(v string) *AuditInfo {
	s.AuditSubject = &v
	return s
}

func (s *AuditInfo) SetStatus(v string) *AuditInfo {
	s.Status = &v
	return s
}

func (s *AuditInfo) SetApplyDateStr(v string) *AuditInfo {
	s.ApplyDateStr = &v
	return s
}

func (s *AuditInfo) SetFailReason(v string) *AuditInfo {
	s.FailReason = &v
	return s
}

// 模型结果详情
type RiskModel struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该风险场景的风险分值
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s RiskModel) String() string {
	return tea.Prettify(s)
}

func (s RiskModel) GoString() string {
	return s.String()
}

func (s *RiskModel) SetSceneCode(v string) *RiskModel {
	s.SceneCode = &v
	return s
}

func (s *RiskModel) SetScore(v string) *RiskModel {
	s.Score = &v
	return s
}

// 订单包含的单个商品模型
type OrderGoodsModel struct {
}

func (s OrderGoodsModel) String() string {
	return tea.Prettify(s)
}

func (s OrderGoodsModel) GoString() string {
	return s.String()
}

// 法人信息修改
type LegalInfoUpdate struct {
	// 法人名称
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 法人证件号
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty"`
	// 法人证件正面
	LegalCertFrontFile *FileInfo `json:"legal_cert_front_file,omitempty" xml:"legal_cert_front_file,omitempty"`
	// 法人证件反面
	LegalCertBackFile *FileInfo `json:"legal_cert_back_file,omitempty" xml:"legal_cert_back_file,omitempty"`
}

func (s LegalInfoUpdate) String() string {
	return tea.Prettify(s)
}

func (s LegalInfoUpdate) GoString() string {
	return s.String()
}

func (s *LegalInfoUpdate) SetLegalName(v string) *LegalInfoUpdate {
	s.LegalName = &v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertNo(v string) *LegalInfoUpdate {
	s.LegalCertNo = &v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertFrontFile(v *FileInfo) *LegalInfoUpdate {
	s.LegalCertFrontFile = v
	return s
}

func (s *LegalInfoUpdate) SetLegalCertBackFile(v *FileInfo) *LegalInfoUpdate {
	s.LegalCertBackFile = v
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

type SyncFundSplittingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资方订单号
	FundNo *string `json:"fund_no,omitempty" xml:"fund_no,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的数科租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期，例如：2表示第二期
	TermNum *int64 `json:"term_num,omitempty" xml:"term_num,omitempty" require:"true"`
	// 扣款时间， yyyy-MM-dd HH:mm:ss 格式
	DeductionTime *string `json:"deduction_time,omitempty" xml:"deduction_time,omitempty" require:"true"`
	// 扣款金额，单位精确到分， 例如：12462300为124623.00元
	DeductionAmount *int64 `json:"deduction_amount,omitempty" xml:"deduction_amount,omitempty" require:"true"`
	// 商户分账金额，单位精确到分，比如：666601 = 6666.01元
	MerchantSplitAmount *int64 `json:"merchant_split_amount,omitempty" xml:"merchant_split_amount,omitempty" require:"true"`
	// 资方分账金额，单位精确到分。比如：666610 = 6666.10元
	FundSplitAmount *int64 `json:"fund_split_amount,omitempty" xml:"fund_split_amount,omitempty" require:"true"`
	// 其他参与方分账信息，JSON格式的数组，样例：
	// [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
	OtherSplitInfo *string `json:"other_split_info,omitempty" xml:"other_split_info,omitempty"`
}

func (s SyncFundSplittingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingRequest) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingRequest) SetAuthToken(v string) *SyncFundSplittingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundSplittingRequest) SetProductInstanceId(v string) *SyncFundSplittingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundNo(v string) *SyncFundSplittingRequest {
	s.FundNo = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOrderId(v string) *SyncFundSplittingRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantTenantId(v string) *SyncFundSplittingRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetTermNum(v int64) *SyncFundSplittingRequest {
	s.TermNum = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionTime(v string) *SyncFundSplittingRequest {
	s.DeductionTime = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionAmount(v int64) *SyncFundSplittingRequest {
	s.DeductionAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantSplitAmount(v int64) *SyncFundSplittingRequest {
	s.MerchantSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundSplitAmount(v int64) *SyncFundSplittingRequest {
	s.FundSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOtherSplitInfo(v string) *SyncFundSplittingRequest {
	s.OtherSplitInfo = &v
	return s
}

type SyncFundSplittingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流水同步描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundSplittingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingResponse) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingResponse) SetReqMsgId(v string) *SyncFundSplittingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultCode(v string) *SyncFundSplittingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultMsg(v string) *SyncFundSplittingResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResponseData(v string) *SyncFundSplittingResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科的租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单融资唯一标识
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 订单融资状态：1-成功；2-失败
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 融资结果描述，长度不超过64
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" maxLength:"64"`
	// 额外信息
	Extras *string `json:"extras,omitempty" xml:"extras,omitempty"`
}

func (s SyncFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialRequest) SetAuthToken(v string) *SyncFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetOrderId(v string) *SyncFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetApplicationId(v string) *SyncFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetStatus(v int64) *SyncFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetReason(v string) *SyncFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetExtras(v string) *SyncFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialResponse) SetReqMsgId(v string) *SyncFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultCode(v string) *SyncFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultMsg(v string) *SyncFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResponseData(v string) *SyncFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type SyncFundWithholdingcontractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家在数科注册的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 代扣协议号
	WithholdingContractId *string `json:"withholding_contract_id,omitempty" xml:"withholding_contract_id,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// json的字符串，存储额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 签署状态：
	// - ACCEPT : 接受
	// - REFUSE : 拒绝
	// - TIMEOUT : 超时
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s SyncFundWithholdingcontractRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractRequest) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractRequest) SetAuthToken(v string) *SyncFundWithholdingcontractRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetProductInstanceId(v string) *SyncFundWithholdingcontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetOrderId(v string) *SyncFundWithholdingcontractRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetMerchantTenantId(v string) *SyncFundWithholdingcontractRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetWithholdingContractId(v string) *SyncFundWithholdingcontractRequest {
	s.WithholdingContractId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetExtraInfo(v string) *SyncFundWithholdingcontractRequest {
	s.ExtraInfo = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetStatus(v string) *SyncFundWithholdingcontractRequest {
	s.Status = &v
	return s
}

type SyncFundWithholdingcontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存储成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundWithholdingcontractResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractResponse) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractResponse) SetReqMsgId(v string) *SyncFundWithholdingcontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultCode(v string) *SyncFundWithholdingcontractResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultMsg(v string) *SyncFundWithholdingcontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResponseData(v string) *SyncFundWithholdingcontractResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租期编号
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty" require:"true"`
	// 剩余归还期数
	RemainTerm *int64 `json:"remain_term,omitempty" xml:"remain_term,omitempty" require:"true"`
	// 总期数
	TotalTerm *int64 `json:"total_term,omitempty" xml:"total_term,omitempty" require:"true"`
	// 租金归还状态，
	// RETURN_FULL : 足额归还 【终态】
	// NOT_RETURN : 未归还
	// CANCEL : 取消 【终态】
	RentalReturnState *string `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty" require:"true"`
	// 租金归还金额,精确到分，即1234表示12.34元
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 罚息金额，分，1234表示12.34元
	PenaltyFeeMoney *int64 `json:"penalty_fee_money,omitempty" xml:"penalty_fee_money,omitempty" require:"true"`
	// 总金额，单位分
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty" require:"true"`
	// 归还时间，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 归还方式，
	// ANTDIGITAL： 数科代扣
	// FUND : 资方代扣
	// BANK : 银行转账
	// WECHAT : 微信支付
	ReturnWay *string `json:"return_way,omitempty" xml:"return_way,omitempty"`
	// 还款凭证编号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty" maxLength:"127" minLength:"1"`
	// 银行名字
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" maxLength:"127"`
}

func (s SyncFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentRequest) SetAuthToken(v string) *SyncFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetProductInstanceId(v string) *SyncFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *SyncFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetOrderId(v string) *SyncFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetLeaseTermIndex(v int64) *SyncFundOrderfulfillmentRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRemainTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.RemainTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalReturnState(v string) *SyncFundOrderfulfillmentRequest {
	s.RentalReturnState = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.RentalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetPenaltyFeeMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.PenaltyFeeMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnTime(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnTime = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnWay(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnWay = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnVoucherSerial(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetBankName(v string) *SyncFundOrderfulfillmentRequest {
	s.BankName = &v
	return s
}

type SyncFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentResponse) SetReqMsgId(v string) *SyncFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultCode(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultMsg(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResponseData(v string) *SyncFundOrderfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租赁订单所属商家租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 期数
	// 如果填入，获取term_idx下的履约记录
	// 如果不填入，获取order_id下的所有履约记录
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentRequest) SetAuthToken(v string) *GetFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetProductInstanceId(v string) *GetFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetOrderId(v string) *GetFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *GetFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetTermIdx(v int64) *GetFundOrderfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单履约信息的列表数组
	// List<OrderFulfillment> 的jsonArray.toString
	OrderFulfillmentDataList *string `json:"order_fulfillment_data_list,omitempty" xml:"order_fulfillment_data_list,omitempty"`
}

func (s GetFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentResponse) SetReqMsgId(v string) *GetFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultCode(v string) *GetFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultMsg(v string) *GetFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetOrderFulfillmentDataList(v string) *GetFundOrderfulfillmentResponse {
	s.OrderFulfillmentDataList = &v
	return s
}

type UploadFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 返回的文件fileItemNo编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s UploadFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadFundFlowRequest) SetAuthToken(v string) *UploadFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFundFlowRequest) SetProductInstanceId(v string) *UploadFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFundFlowRequest) SetMerchantId(v string) *UploadFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadFundFlowRequest) SetOrderId(v string) *UploadFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadFundFlowRequest) SetSignNo(v string) *UploadFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileItemNo(v string) *UploadFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileObject(v io.Reader) *UploadFundFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadFundFlowRequest) SetFileObjectName(v string) *UploadFundFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileId(v string) *UploadFundFlowRequest {
	s.FileId = &v
	return s
}

func (s *UploadFundFlowRequest) SetFundId(v string) *UploadFundFlowRequest {
	s.FundId = &v
	return s
}

type UploadFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadFundFlowResponse) SetReqMsgId(v string) *UploadFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultCode(v string) *UploadFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultMsg(v string) *UploadFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s GetFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowRequest) GoString() string {
	return s.String()
}

func (s *GetFundFlowRequest) SetAuthToken(v string) *GetFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundFlowRequest) SetProductInstanceId(v string) *GetFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundFlowRequest) SetMerchantId(v string) *GetFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundFlowRequest) SetOrderId(v string) *GetFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowRequest) SetContractType(v string) *GetFundFlowRequest {
	s.ContractType = &v
	return s
}

func (s *GetFundFlowRequest) SetFundId(v string) *GetFundFlowRequest {
	s.FundId = &v
	return s
}

type GetFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 需要落章的合同列表，需要status状态为FINISH可以落章
	ContractList *string `json:"contract_list,omitempty" xml:"contract_list,omitempty"`
}

func (s GetFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowResponse) GoString() string {
	return s.String()
}

func (s *GetFundFlowResponse) SetReqMsgId(v string) *GetFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundFlowResponse) SetResultCode(v string) *GetFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundFlowResponse) SetResultMsg(v string) *GetFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundFlowResponse) SetOrderId(v string) *GetFundFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowResponse) SetContractList(v string) *GetFundFlowResponse {
	s.ContractList = &v
	return s
}

type RefuseFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 填写拒绝落章原因，如果同意则不用填写
	SignReason *string `json:"sign_reason,omitempty" xml:"sign_reason,omitempty"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s RefuseFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowRequest) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowRequest) SetAuthToken(v string) *RefuseFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseFundFlowRequest) SetProductInstanceId(v string) *RefuseFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetMerchantId(v string) *RefuseFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetOrderId(v string) *RefuseFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignNo(v string) *RefuseFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignReason(v string) *RefuseFundFlowRequest {
	s.SignReason = &v
	return s
}

func (s *RefuseFundFlowRequest) SetFundId(v string) *RefuseFundFlowRequest {
	s.FundId = &v
	return s
}

type RefuseFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowResponse) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowResponse) SetReqMsgId(v string) *RefuseFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultCode(v string) *RefuseFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultMsg(v string) *RefuseFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type AuthFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 签署区域的tag，和发起签署流程的机构的tag对应
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
}

func (s AuthFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthFundFlowRequest) SetAuthToken(v string) *AuthFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthFundFlowRequest) SetProductInstanceId(v string) *AuthFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthFundFlowRequest) SetMerchantId(v string) *AuthFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthFundFlowRequest) SetOrderId(v string) *AuthFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *AuthFundFlowRequest) SetSignNo(v string) *AuthFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthFundFlowRequest) SetTag(v string) *AuthFundFlowRequest {
	s.Tag = &v
	return s
}

type AuthFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthFundFlowResponse) SetReqMsgId(v string) *AuthFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultCode(v string) *AuthFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultMsg(v string) *AuthFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthFundFlowResponse) SetSignFieldIds(v string) *AuthFundFlowResponse {
	s.SignFieldIds = &v
	return s
}

type CancelFundPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 取消原因
	// ACTIVE_REDEEM:自主赎回
	// RENTING_OUT_REDEEM:退租赎回
	// RENTING_AND_RESALE_REDEEM:租转售赎回
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true"`
	// 融资单的资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s CancelFundPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelFundPlanRequest) SetAuthToken(v string) *CancelFundPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelFundPlanRequest) SetProductInstanceId(v string) *CancelFundPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelFundPlanRequest) SetOrderId(v string) *CancelFundPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelFundPlanRequest) SetMerchantId(v string) *CancelFundPlanRequest {
	s.MerchantId = &v
	return s
}

func (s *CancelFundPlanRequest) SetCancelReason(v string) *CancelFundPlanRequest {
	s.CancelReason = &v
	return s
}

func (s *CancelFundPlanRequest) SetFundId(v string) *CancelFundPlanRequest {
	s.FundId = &v
	return s
}

type CancelFundPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelFundPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelFundPlanResponse) SetReqMsgId(v string) *CancelFundPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultCode(v string) *CancelFundPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultMsg(v string) *CancelFundPlanResponse {
	s.ResultMsg = &v
	return s
}

type CallbackFundNotifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ASYNC_UNSIGN_APPLY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CallbackFundNotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyRequest) SetAuthToken(v string) *CallbackFundNotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetProductInstanceId(v string) *CallbackFundNotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetType(v string) *CallbackFundNotifyRequest {
	s.Type = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetData(v string) *CallbackFundNotifyRequest {
	s.Data = &v
	return s
}

type CallbackFundNotifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackFundNotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyResponse) SetReqMsgId(v string) *CallbackFundNotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultCode(v string) *CallbackFundNotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultMsg(v string) *CallbackFundNotifyResponse {
	s.ResultMsg = &v
	return s
}

type SyncFundMerchantpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// json字符串,填入「MerchantPromiseReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
	// 资方公司社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s SyncFundMerchantpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseRequest) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseRequest) SetAuthToken(v string) *SyncFundMerchantpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetProductInstanceId(v string) *SyncFundMerchantpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetOrderId(v string) *SyncFundMerchantpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetMerchantId(v string) *SyncFundMerchantpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetBizContent(v string) *SyncFundMerchantpromiseRequest {
	s.BizContent = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetFundId(v string) *SyncFundMerchantpromiseRequest {
	s.FundId = &v
	return s
}

type SyncFundMerchantpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商家社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncFundMerchantpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseResponse) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseResponse) SetReqMsgId(v string) *SyncFundMerchantpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultCode(v string) *SyncFundMerchantpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultMsg(v string) *SyncFundMerchantpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetOrderId(v string) *SyncFundMerchantpromiseResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetMerchantId(v string) *SyncFundMerchantpromiseResponse {
	s.MerchantId = &v
	return s
}

type SyncFundFinanceloanresultsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// json字符串,填入「FinanceLoanResultsReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s SyncFundFinanceloanresultsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsRequest) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsRequest) SetAuthToken(v string) *SyncFundFinanceloanresultsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetProductInstanceId(v string) *SyncFundFinanceloanresultsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetOrderId(v string) *SyncFundFinanceloanresultsRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetMerchantId(v string) *SyncFundFinanceloanresultsRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetBizContent(v string) *SyncFundFinanceloanresultsRequest {
	s.BizContent = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetFundId(v string) *SyncFundFinanceloanresultsRequest {
	s.FundId = &v
	return s
}

type SyncFundFinanceloanresultsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// "ERROR": 放款同步异常
	// “SUCCESS":放款同步成功
	LoanResult *string `json:"loan_result,omitempty" xml:"loan_result,omitempty"`
}

func (s SyncFundFinanceloanresultsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsResponse) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsResponse) SetReqMsgId(v string) *SyncFundFinanceloanresultsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultCode(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultMsg(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetOrderId(v string) *SyncFundFinanceloanresultsResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetMerchantId(v string) *SyncFundFinanceloanresultsResponse {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetLoanResult(v string) *SyncFundFinanceloanresultsResponse {
	s.LoanResult = &v
	return s
}

type GetFundUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
}

func (s GetFundUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseRequest) SetAuthToken(v string) *GetFundUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetProductInstanceId(v string) *GetFundUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetOrderId(v string) *GetFundUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetMerchantId(v string) *GetFundUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetFundId(v string) *GetFundUserpromiseRequest {
	s.FundId = &v
	return s
}

type GetFundUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为「OrderPromise」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseResponse) SetReqMsgId(v string) *GetFundUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultCode(v string) *GetFundUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultMsg(v string) *GetFundUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResponseData(v string) *GetFundUserpromiseResponse {
	s.ResponseData = &v
	return s
}

type GetFundUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资公司的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceRequest) SetAuthToken(v string) *GetFundUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetProductInstanceId(v string) *GetFundUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetOrderId(v string) *GetFundUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetMerchantId(v string) *GetFundUserperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetFundId(v string) *GetFundUserperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceResponse) SetReqMsgId(v string) *GetFundUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultCode(v string) *GetFundUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultMsg(v string) *GetFundUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResponseData(v string) *GetFundUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceRequest) SetAuthToken(v string) *GetFundMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetProductInstanceId(v string) *GetFundMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetOrderId(v string) *GetFundMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetMerchantId(v string) *GetFundMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetFundId(v string) *GetFundMerchantperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceResponse) SetReqMsgId(v string) *GetFundMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultCode(v string) *GetFundMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultMsg(v string) *GetFundMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResponseData(v string) *GetFundMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfullinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单Id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetFundOrderfullinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoRequest) SetAuthToken(v string) *GetFundOrderfullinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetProductInstanceId(v string) *GetFundOrderfullinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetOrderId(v string) *GetFundOrderfullinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetMerchantId(v string) *GetFundOrderfullinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetFundId(v string) *GetFundOrderfullinfoRequest {
	s.FundId = &v
	return s
}

type GetFundOrderfullinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OrderFullInfoResp的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundOrderfullinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoResponse) SetReqMsgId(v string) *GetFundOrderfullinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultCode(v string) *GetFundOrderfullinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultMsg(v string) *GetFundOrderfullinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResponseData(v string) *GetFundOrderfullinfoResponse {
	s.ResponseData = &v
	return s
}

type NotifyFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 返回的文件fileItemNo编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s NotifyFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyFundFlowRequest) GoString() string {
	return s.String()
}

func (s *NotifyFundFlowRequest) SetAuthToken(v string) *NotifyFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyFundFlowRequest) SetProductInstanceId(v string) *NotifyFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetMerchantId(v string) *NotifyFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetOrderId(v string) *NotifyFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *NotifyFundFlowRequest) SetSignNo(v string) *NotifyFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *NotifyFundFlowRequest) SetFileItemNo(v string) *NotifyFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *NotifyFundFlowRequest) SetFundId(v string) *NotifyFundFlowRequest {
	s.FundId = &v
	return s
}

type NotifyFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyFundFlowResponse) GoString() string {
	return s.String()
}

func (s *NotifyFundFlowResponse) SetReqMsgId(v string) *NotifyFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyFundFlowResponse) SetResultCode(v string) *NotifyFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyFundFlowResponse) SetResultMsg(v string) *NotifyFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type UploadFundCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 凭证类型
	CreditType *string `json:"credit_type,omitempty" xml:"credit_type,omitempty" require:"true"`
	// 凭证名称
	CreditName *string `json:"credit_name,omitempty" xml:"credit_name,omitempty"`
	// 文本类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 文本下载链接，如果类型是FILE则必填
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s UploadFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFundCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadFundCreditRequest) SetAuthToken(v string) *UploadFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFundCreditRequest) SetProductInstanceId(v string) *UploadFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFundCreditRequest) SetOrderNoType(v string) *UploadFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadFundCreditRequest) SetOrderNo(v string) *UploadFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadFundCreditRequest) SetFundId(v string) *UploadFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *UploadFundCreditRequest) SetCreditType(v string) *UploadFundCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadFundCreditRequest) SetCreditName(v string) *UploadFundCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadFundCreditRequest) SetContentType(v string) *UploadFundCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadFundCreditRequest) SetFileUrl(v string) *UploadFundCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadFundCreditRequest) SetContent(v string) *UploadFundCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadFundCreditRequest) SetMerchantId(v string) *UploadFundCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFundCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadFundCreditResponse) SetReqMsgId(v string) *UploadFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFundCreditResponse) SetResultCode(v string) *UploadFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFundCreditResponse) SetResultMsg(v string) *UploadFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadFundCreditResponse) SetContentId(v string) *UploadFundCreditResponse {
	s.ContentId = &v
	return s
}

type QueryFundCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCreditRequest) GoString() string {
	return s.String()
}

func (s *QueryFundCreditRequest) SetAuthToken(v string) *QueryFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFundCreditRequest) SetProductInstanceId(v string) *QueryFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFundCreditRequest) SetOrderNoType(v string) *QueryFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QueryFundCreditRequest) SetOrderNo(v string) *QueryFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryFundCreditRequest) SetFundId(v string) *QueryFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *QueryFundCreditRequest) SetMerchantId(v string) *QueryFundCreditRequest {
	s.MerchantId = &v
	return s
}

type QueryFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QueryFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFundCreditResponse) GoString() string {
	return s.String()
}

func (s *QueryFundCreditResponse) SetReqMsgId(v string) *QueryFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFundCreditResponse) SetResultCode(v string) *QueryFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFundCreditResponse) SetResultMsg(v string) *QueryFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFundCreditResponse) SetContentInfo(v string) *QueryFundCreditResponse {
	s.ContentInfo = &v
	return s
}

type GetInnerProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户在数科的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 商品id
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商品版本
	ProductVersion *string `json:"product_version,omitempty" xml:"product_version,omitempty" require:"true" maxLength:"10" minLength:"1"`
}

func (s GetInnerProductRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerProductRequest) GoString() string {
	return s.String()
}

func (s *GetInnerProductRequest) SetAuthToken(v string) *GetInnerProductRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerProductRequest) SetProductInstanceId(v string) *GetInnerProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerProductRequest) SetMerchantTenantId(v string) *GetInnerProductRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetInnerProductRequest) SetMerchantId(v string) *GetInnerProductRequest {
	s.MerchantId = &v
	return s
}

func (s *GetInnerProductRequest) SetProductId(v string) *GetInnerProductRequest {
	s.ProductId = &v
	return s
}

func (s *GetInnerProductRequest) SetProductVersion(v string) *GetInnerProductRequest {
	s.ProductVersion = &v
	return s
}

type GetInnerProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetInnerProductResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerProductResponse) GoString() string {
	return s.String()
}

func (s *GetInnerProductResponse) SetReqMsgId(v string) *GetInnerProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerProductResponse) SetResultCode(v string) *GetInnerProductResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerProductResponse) SetResultMsg(v string) *GetInnerProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerProductResponse) SetResponseData(v string) *GetInnerProductResponse {
	s.ResponseData = &v
	return s
}

type GetInnerTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户在数科的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
}

func (s GetInnerTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTenantRequest) GoString() string {
	return s.String()
}

func (s *GetInnerTenantRequest) SetAuthToken(v string) *GetInnerTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerTenantRequest) SetProductInstanceId(v string) *GetInnerTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerTenantRequest) SetMerchantTenantId(v string) *GetInnerTenantRequest {
	s.MerchantTenantId = &v
	return s
}

type GetInnerTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}租户信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetInnerTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTenantResponse) GoString() string {
	return s.String()
}

func (s *GetInnerTenantResponse) SetReqMsgId(v string) *GetInnerTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerTenantResponse) SetResultCode(v string) *GetInnerTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerTenantResponse) SetResultMsg(v string) *GetInnerTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerTenantResponse) SetResponseData(v string) *GetInnerTenantResponse {
	s.ResponseData = &v
	return s
}

type SyncInnerMeterforwholeorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 商户购买的产品code
	MeterProductCode *string `json:"meter_product_code,omitempty" xml:"meter_product_code,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 订单总租期
	OrderRentTerm *int64 `json:"order_rent_term,omitempty" xml:"order_rent_term,omitempty" require:"true"`
	// 订单总租金，单位为分
	OrderTotalMoney *int64 `json:"order_total_money,omitempty" xml:"order_total_money,omitempty" require:"true"`
	// 系统名称
	SysName *string `json:"sys_name,omitempty" xml:"sys_name,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 订单产品的二级类目
	OrderProductSubclass *string `json:"order_product_subclass,omitempty" xml:"order_product_subclass,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s SyncInnerMeterforwholeorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforwholeorderRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforwholeorderRequest) SetAuthToken(v string) *SyncInnerMeterforwholeorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetProductInstanceId(v string) *SyncInnerMeterforwholeorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMerchantTenantId(v string) *SyncInnerMeterforwholeorderRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMerchantId(v string) *SyncInnerMeterforwholeorderRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetMeterProductCode(v string) *SyncInnerMeterforwholeorderRequest {
	s.MeterProductCode = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderId(v string) *SyncInnerMeterforwholeorderRequest {
	s.OrderId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderRentTerm(v int64) *SyncInnerMeterforwholeorderRequest {
	s.OrderRentTerm = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderTotalMoney(v int64) *SyncInnerMeterforwholeorderRequest {
	s.OrderTotalMoney = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetSysName(v string) *SyncInnerMeterforwholeorderRequest {
	s.SysName = &v
	return s
}

func (s *SyncInnerMeterforwholeorderRequest) SetOrderProductSubclass(v string) *SyncInnerMeterforwholeorderRequest {
	s.OrderProductSubclass = &v
	return s
}

type SyncInnerMeterforwholeorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncInnerMeterforwholeorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforwholeorderResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforwholeorderResponse) SetReqMsgId(v string) *SyncInnerMeterforwholeorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerMeterforwholeorderResponse) SetResultCode(v string) *SyncInnerMeterforwholeorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerMeterforwholeorderResponse) SetResultMsg(v string) *SyncInnerMeterforwholeorderResponse {
	s.ResultMsg = &v
	return s
}

type SyncInnerMeterforagsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 计量上报Code
	MeterProductCode *string `json:"meter_product_code,omitempty" xml:"meter_product_code,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 系统名字
	SysName *string `json:"sys_name,omitempty" xml:"sys_name,omitempty" require:"true" maxLength:"32" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 合同编号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s SyncInnerMeterforagsignRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforagsignRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforagsignRequest) SetAuthToken(v string) *SyncInnerMeterforagsignRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetProductInstanceId(v string) *SyncInnerMeterforagsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMerchantTenantId(v string) *SyncInnerMeterforagsignRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMerchantId(v string) *SyncInnerMeterforagsignRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetMeterProductCode(v string) *SyncInnerMeterforagsignRequest {
	s.MeterProductCode = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetSysName(v string) *SyncInnerMeterforagsignRequest {
	s.SysName = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetOrderId(v string) *SyncInnerMeterforagsignRequest {
	s.OrderId = &v
	return s
}

func (s *SyncInnerMeterforagsignRequest) SetSignNo(v string) *SyncInnerMeterforagsignRequest {
	s.SignNo = &v
	return s
}

type SyncInnerMeterforagsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncInnerMeterforagsignResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerMeterforagsignResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerMeterforagsignResponse) SetReqMsgId(v string) *SyncInnerMeterforagsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerMeterforagsignResponse) SetResultCode(v string) *SyncInnerMeterforagsignResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerMeterforagsignResponse) SetResultMsg(v string) *SyncInnerMeterforagsignResponse {
	s.ResultMsg = &v
	return s
}

type AllInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分页查询结构体
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 魔法库模板文件名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 线上模板ID
	TemplateCodeProd *string `json:"template_code_prod,omitempty" xml:"template_code_prod,omitempty"`
}

func (s AllInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllInnerTemplateRequest) SetAuthToken(v string) *AllInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllInnerTemplateRequest) SetProductInstanceId(v string) *AllInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllInnerTemplateRequest) SetPageInfo(v *PageQuery) *AllInnerTemplateRequest {
	s.PageInfo = v
	return s
}

func (s *AllInnerTemplateRequest) SetTenantId(v string) *AllInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateCode(v string) *AllInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateName(v string) *AllInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

func (s *AllInnerTemplateRequest) SetTemplateCodeProd(v string) *AllInnerTemplateRequest {
	s.TemplateCodeProd = &v
	return s
}

type AllInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板列表数据
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllInnerTemplateResponse) SetReqMsgId(v string) *AllInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllInnerTemplateResponse) SetResultCode(v string) *AllInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllInnerTemplateResponse) SetResultMsg(v string) *AllInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllInnerTemplateResponse) SetTemplateList(v string) *AllInnerTemplateResponse {
	s.TemplateList = &v
	return s
}

type ListInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分页查询
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
}

func (s ListInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s ListInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *ListInnerTemplateRequest) SetAuthToken(v string) *ListInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *ListInnerTemplateRequest) SetProductInstanceId(v string) *ListInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListInnerTemplateRequest) SetPageInfo(v *PageQuery) *ListInnerTemplateRequest {
	s.PageInfo = v
	return s
}

func (s *ListInnerTemplateRequest) SetTenantId(v string) *ListInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *ListInnerTemplateRequest) SetTemplateCode(v string) *ListInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

type ListInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板列表数据
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s ListInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s ListInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *ListInnerTemplateResponse) SetReqMsgId(v string) *ListInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListInnerTemplateResponse) SetResultCode(v string) *ListInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *ListInnerTemplateResponse) SetResultMsg(v string) *ListInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListInnerTemplateResponse) SetTemplateList(v string) *ListInnerTemplateResponse {
	s.TemplateList = &v
	return s
}

type DetailInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s DetailInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *DetailInnerTemplateRequest) SetAuthToken(v string) *DetailInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetProductInstanceId(v string) *DetailInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTenantId(v string) *DetailInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTemplateCode(v string) *DetailInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *DetailInnerTemplateRequest) SetTemplateVersion(v string) *DetailInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

type DetailInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板详情信息
	TemplateInfo *string `json:"template_info,omitempty" xml:"template_info,omitempty"`
}

func (s DetailInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *DetailInnerTemplateResponse) SetReqMsgId(v string) *DetailInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetResultCode(v string) *DetailInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetResultMsg(v string) *DetailInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailInnerTemplateResponse) SetTemplateInfo(v string) *DetailInnerTemplateResponse {
	s.TemplateInfo = &v
	return s
}

type CreateInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 创建的模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true" maxLength:"32"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 模板文件的名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
}

func (s CreateInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplateRequest) SetAuthToken(v string) *CreateInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetProductInstanceId(v string) *CreateInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetTenantId(v string) *CreateInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetTemplateName(v string) *CreateInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetFileKey(v string) *CreateInnerTemplateRequest {
	s.FileKey = &v
	return s
}

func (s *CreateInnerTemplateRequest) SetFileName(v string) *CreateInnerTemplateRequest {
	s.FileName = &v
	return s
}

type CreateInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
}

func (s CreateInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplateResponse) SetReqMsgId(v string) *CreateInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetResultCode(v string) *CreateInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetResultMsg(v string) *CreateInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerTemplateResponse) SetTemplateCode(v string) *CreateInnerTemplateResponse {
	s.TemplateCode = &v
	return s
}

type SaveInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 文件预览地址
	PreviewAddress *string `json:"preview_address,omitempty" xml:"preview_address,omitempty" require:"true"`
	// 创建模板的元素列表
	TemplateElementList *string `json:"template_element_list,omitempty" xml:"template_element_list,omitempty"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
	// 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
	Confirm *bool `json:"confirm,omitempty" xml:"confirm,omitempty" require:"true"`
}

func (s SaveInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *SaveInnerTemplateRequest) SetAuthToken(v string) *SaveInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetProductInstanceId(v string) *SaveInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTenantId(v string) *SaveInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateCode(v string) *SaveInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateVersion(v string) *SaveInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetPreviewAddress(v string) *SaveInnerTemplateRequest {
	s.PreviewAddress = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetTemplateElementList(v string) *SaveInnerTemplateRequest {
	s.TemplateElementList = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetFileKey(v string) *SaveInnerTemplateRequest {
	s.FileKey = &v
	return s
}

func (s *SaveInnerTemplateRequest) SetConfirm(v bool) *SaveInnerTemplateRequest {
	s.Confirm = &v
	return s
}

type SaveInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *SaveInnerTemplateResponse) SetReqMsgId(v string) *SaveInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveInnerTemplateResponse) SetResultCode(v string) *SaveInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveInnerTemplateResponse) SetResultMsg(v string) *SaveInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type SaveInnerSignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 模板签署区列表
	SignFieldList *string `json:"sign_field_list,omitempty" xml:"sign_field_list,omitempty" require:"true"`
}

func (s SaveInnerSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *SaveInnerSignfieldsRequest) SetAuthToken(v string) *SaveInnerSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetProductInstanceId(v string) *SaveInnerSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTenantId(v string) *SaveInnerSignfieldsRequest {
	s.TenantId = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTemplateCode(v string) *SaveInnerSignfieldsRequest {
	s.TemplateCode = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetTemplateVersion(v string) *SaveInnerSignfieldsRequest {
	s.TemplateVersion = &v
	return s
}

func (s *SaveInnerSignfieldsRequest) SetSignFieldList(v string) *SaveInnerSignfieldsRequest {
	s.SignFieldList = &v
	return s
}

type SaveInnerSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveInnerSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveInnerSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *SaveInnerSignfieldsResponse) SetReqMsgId(v string) *SaveInnerSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveInnerSignfieldsResponse) SetResultCode(v string) *SaveInnerSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveInnerSignfieldsResponse) SetResultMsg(v string) *SaveInnerSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

type PublishInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库版本id
	TemplateVersionId *string `json:"template_version_id,omitempty" xml:"template_version_id,omitempty" require:"true"`
}

func (s PublishInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *PublishInnerTemplateRequest) SetAuthToken(v string) *PublishInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetProductInstanceId(v string) *PublishInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTenantId(v string) *PublishInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTemplateCode(v string) *PublishInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *PublishInnerTemplateRequest) SetTemplateVersionId(v string) *PublishInnerTemplateRequest {
	s.TemplateVersionId = &v
	return s
}

type PublishInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PublishInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *PublishInnerTemplateResponse) SetReqMsgId(v string) *PublishInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishInnerTemplateResponse) SetResultCode(v string) *PublishInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishInnerTemplateResponse) SetResultMsg(v string) *PublishInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type PreviewInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件oss存储的key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s PreviewInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *PreviewInnerTemplateRequest) SetAuthToken(v string) *PreviewInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetProductInstanceId(v string) *PreviewInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetTenantId(v string) *PreviewInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *PreviewInnerTemplateRequest) SetFileKey(v string) *PreviewInnerTemplateRequest {
	s.FileKey = &v
	return s
}

type PreviewInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预览接口返回
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PreviewInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *PreviewInnerTemplateResponse) SetReqMsgId(v string) *PreviewInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetResultCode(v string) *PreviewInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetResultMsg(v string) *PreviewInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewInnerTemplateResponse) SetData(v string) *PreviewInnerTemplateResponse {
	s.Data = &v
	return s
}

type DeleteInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 魔法库模板版本id
	TemplateVersionId *string `json:"template_version_id,omitempty" xml:"template_version_id,omitempty" require:"true"`
}

func (s DeleteInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *DeleteInnerTemplateRequest) SetAuthToken(v string) *DeleteInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetProductInstanceId(v string) *DeleteInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTenantId(v string) *DeleteInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateCode(v string) *DeleteInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateVersion(v string) *DeleteInnerTemplateRequest {
	s.TemplateVersion = &v
	return s
}

func (s *DeleteInnerTemplateRequest) SetTemplateVersionId(v string) *DeleteInnerTemplateRequest {
	s.TemplateVersionId = &v
	return s
}

type DeleteInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *DeleteInnerTemplateResponse) SetReqMsgId(v string) *DeleteInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteInnerTemplateResponse) SetResultCode(v string) *DeleteInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteInnerTemplateResponse) SetResultMsg(v string) *DeleteInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type CloneInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库对应模板的模板复制id
	VoucherId *string `json:"voucher_id,omitempty" xml:"voucher_id,omitempty" require:"true"`
}

func (s CloneInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplateRequest) SetAuthToken(v string) *CloneInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetProductInstanceId(v string) *CloneInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetTenantId(v string) *CloneInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetTemplateCode(v string) *CloneInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *CloneInnerTemplateRequest) SetVoucherId(v string) *CloneInnerTemplateRequest {
	s.VoucherId = &v
	return s
}

type CloneInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloneInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplateResponse) SetReqMsgId(v string) *CloneInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloneInnerTemplateResponse) SetResultCode(v string) *CloneInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CloneInnerTemplateResponse) SetResultMsg(v string) *CloneInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type UploadInnerFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// ● BUSINESS_LICENSE 营业执照
	// ● CARD_FRONT 身份证正面
	// ● CARD_BACK 身份证反面
	// ● SPLITTING 分账
	// ● CONTRACT_TEMPLATE 合同模板
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s UploadInnerFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerFileRequest) GoString() string {
	return s.String()
}

func (s *UploadInnerFileRequest) SetAuthToken(v string) *UploadInnerFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadInnerFileRequest) SetProductInstanceId(v string) *UploadInnerFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadInnerFileRequest) SetTenantId(v string) *UploadInnerFileRequest {
	s.TenantId = &v
	return s
}

func (s *UploadInnerFileRequest) SetFileName(v string) *UploadInnerFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadInnerFileRequest) SetBizScene(v string) *UploadInnerFileRequest {
	s.BizScene = &v
	return s
}

type UploadInnerFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s UploadInnerFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadInnerFileResponse) GoString() string {
	return s.String()
}

func (s *UploadInnerFileResponse) SetReqMsgId(v string) *UploadInnerFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadInnerFileResponse) SetResultCode(v string) *UploadInnerFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadInnerFileResponse) SetResultMsg(v string) *UploadInnerFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadInnerFileResponse) SetUploadUrl(v string) *UploadInnerFileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadInnerFileResponse) SetFileKey(v string) *UploadInnerFileResponse {
	s.FileKey = &v
	return s
}

type DownloadInnerFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s DownloadInnerFileRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadInnerFileRequest) GoString() string {
	return s.String()
}

func (s *DownloadInnerFileRequest) SetAuthToken(v string) *DownloadInnerFileRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadInnerFileRequest) SetProductInstanceId(v string) *DownloadInnerFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadInnerFileRequest) SetTenantId(v string) *DownloadInnerFileRequest {
	s.TenantId = &v
	return s
}

func (s *DownloadInnerFileRequest) SetFileKey(v string) *DownloadInnerFileRequest {
	s.FileKey = &v
	return s
}

type DownloadInnerFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件临时下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
}

func (s DownloadInnerFileResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadInnerFileResponse) GoString() string {
	return s.String()
}

func (s *DownloadInnerFileResponse) SetReqMsgId(v string) *DownloadInnerFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadInnerFileResponse) SetResultCode(v string) *DownloadInnerFileResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadInnerFileResponse) SetResultMsg(v string) *DownloadInnerFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadInnerFileResponse) SetDownloadUrl(v string) *DownloadInnerFileResponse {
	s.DownloadUrl = &v
	return s
}

type GetInnerTemplateofficeurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s GetInnerTemplateofficeurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTemplateofficeurlRequest) GoString() string {
	return s.String()
}

func (s *GetInnerTemplateofficeurlRequest) SetAuthToken(v string) *GetInnerTemplateofficeurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetProductInstanceId(v string) *GetInnerTemplateofficeurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTenantId(v string) *GetInnerTemplateofficeurlRequest {
	s.TenantId = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTemplateCode(v string) *GetInnerTemplateofficeurlRequest {
	s.TemplateCode = &v
	return s
}

func (s *GetInnerTemplateofficeurlRequest) SetTemplateVersion(v string) *GetInnerTemplateofficeurlRequest {
	s.TemplateVersion = &v
	return s
}

type GetInnerTemplateofficeurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetInnerTemplateofficeurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInnerTemplateofficeurlResponse) GoString() string {
	return s.String()
}

func (s *GetInnerTemplateofficeurlResponse) SetReqMsgId(v string) *GetInnerTemplateofficeurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetResultCode(v string) *GetInnerTemplateofficeurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetResultMsg(v string) *GetInnerTemplateofficeurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInnerTemplateofficeurlResponse) SetData(v string) *GetInnerTemplateofficeurlResponse {
	s.Data = &v
	return s
}

type RefreshInnerTemplatetokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// accessToken
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// refreshToekn
	RefreshToken *string `json:"refresh_token,omitempty" xml:"refresh_token,omitempty" require:"true"`
}

func (s RefreshInnerTemplatetokenRequest) String() string {
	return tea.Prettify(s)
}

func (s RefreshInnerTemplatetokenRequest) GoString() string {
	return s.String()
}

func (s *RefreshInnerTemplatetokenRequest) SetAuthToken(v string) *RefreshInnerTemplatetokenRequest {
	s.AuthToken = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetProductInstanceId(v string) *RefreshInnerTemplatetokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetTenantId(v string) *RefreshInnerTemplatetokenRequest {
	s.TenantId = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetAccessToken(v string) *RefreshInnerTemplatetokenRequest {
	s.AccessToken = &v
	return s
}

func (s *RefreshInnerTemplatetokenRequest) SetRefreshToken(v string) *RefreshInnerTemplatetokenRequest {
	s.RefreshToken = &v
	return s
}

type RefreshInnerTemplatetokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RefreshInnerTemplatetokenResponse) String() string {
	return tea.Prettify(s)
}

func (s RefreshInnerTemplatetokenResponse) GoString() string {
	return s.String()
}

func (s *RefreshInnerTemplatetokenResponse) SetReqMsgId(v string) *RefreshInnerTemplatetokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetResultCode(v string) *RefreshInnerTemplatetokenResponse {
	s.ResultCode = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetResultMsg(v string) *RefreshInnerTemplatetokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *RefreshInnerTemplatetokenResponse) SetData(v string) *RefreshInnerTemplatetokenResponse {
	s.Data = &v
	return s
}

type CreateInnerTemplatetextareaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板版本号
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
	// 组件类型，INPUT:单行文本 TEXTAREA:多行文本
	ComponentType *string `json:"component_type,omitempty" xml:"component_type,omitempty" require:"true"`
	// 组件名称（占位符）
	ComponentName *string `json:"component_name,omitempty" xml:"component_name,omitempty" require:"true"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
}

func (s CreateInnerTemplatetextareaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplatetextareaRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplatetextareaRequest) SetAuthToken(v string) *CreateInnerTemplatetextareaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetProductInstanceId(v string) *CreateInnerTemplatetextareaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTenantId(v string) *CreateInnerTemplatetextareaRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTemplateCode(v string) *CreateInnerTemplatetextareaRequest {
	s.TemplateCode = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetTemplateVersion(v string) *CreateInnerTemplatetextareaRequest {
	s.TemplateVersion = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetComponentType(v string) *CreateInnerTemplatetextareaRequest {
	s.ComponentType = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetComponentName(v string) *CreateInnerTemplatetextareaRequest {
	s.ComponentName = &v
	return s
}

func (s *CreateInnerTemplatetextareaRequest) SetRequired(v bool) *CreateInnerTemplatetextareaRequest {
	s.Required = &v
	return s
}

type CreateInnerTemplatetextareaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建成功的文本域组件信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateInnerTemplatetextareaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerTemplatetextareaResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerTemplatetextareaResponse) SetReqMsgId(v string) *CreateInnerTemplatetextareaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetResultCode(v string) *CreateInnerTemplatetextareaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetResultMsg(v string) *CreateInnerTemplatetextareaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerTemplatetextareaResponse) SetData(v string) *CreateInnerTemplatetextareaResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateimageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页查询结构体
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateimageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateimageRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateimageRequest) SetAuthToken(v string) *QueryInnerTemplateimageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetProductInstanceId(v string) *QueryInnerTemplateimageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTenantId(v string) *QueryInnerTemplateimageRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetPageInfo(v *PageQuery) *QueryInnerTemplateimageRequest {
	s.PageInfo = v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTemplateCode(v string) *QueryInnerTemplateimageRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateimageRequest) SetTemplateVersion(v string) *QueryInnerTemplateimageRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateimageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板图片列表
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateimageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateimageResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateimageResponse) SetReqMsgId(v string) *QueryInnerTemplateimageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetResultCode(v string) *QueryInnerTemplateimageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetResultMsg(v string) *QueryInnerTemplateimageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateimageResponse) SetData(v string) *QueryInnerTemplateimageResponse {
	s.Data = &v
	return s
}

type CreateInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 第一次暂存或提交可以不传，由后端生成
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 分账公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 分账合同或协议
	ContractFiles []*FileInfo `json:"contract_files,omitempty" xml:"contract_files,omitempty" type:"Repeated"`
	// 分账关系说明
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 分账方企业pid
	AlipayPid *string `json:"alipay_pid,omitempty" xml:"alipay_pid,omitempty"`
	// 分账方企业支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 是否直接提交
	// SUBMITTED 直接提交
	// STAGE 暂存
	Submit *string `json:"submit,omitempty" xml:"submit,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s CreateInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerFunddividerelationRequest) SetAuthToken(v string) *CreateInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetProductInstanceId(v string) *CreateInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetTenantId(v string) *CreateInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetRelationId(v string) *CreateInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetCompanyName(v string) *CreateInnerFunddividerelationRequest {
	s.CompanyName = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetMerchantId(v string) *CreateInnerFunddividerelationRequest {
	s.MerchantId = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetContractFiles(v []*FileInfo) *CreateInnerFunddividerelationRequest {
	s.ContractFiles = v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetDesc(v string) *CreateInnerFunddividerelationRequest {
	s.Desc = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetAlipayPid(v string) *CreateInnerFunddividerelationRequest {
	s.AlipayPid = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetAlipayAccount(v string) *CreateInnerFunddividerelationRequest {
	s.AlipayAccount = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetSubmit(v string) *CreateInnerFunddividerelationRequest {
	s.Submit = &v
	return s
}

func (s *CreateInnerFunddividerelationRequest) SetUserName(v string) *CreateInnerFunddividerelationRequest {
	s.UserName = &v
	return s
}

type CreateInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty"`
}

func (s CreateInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerFunddividerelationResponse) SetReqMsgId(v string) *CreateInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetResultCode(v string) *CreateInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetResultMsg(v string) *CreateInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerFunddividerelationResponse) SetRelationId(v string) *CreateInnerFunddividerelationResponse {
	s.RelationId = &v
	return s
}

type SubmitInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s SubmitInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerFunddividerelationRequest) SetAuthToken(v string) *SubmitInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetProductInstanceId(v string) *SubmitInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetTenantId(v string) *SubmitInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetRelationId(v string) *SubmitInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

func (s *SubmitInnerFunddividerelationRequest) SetUserName(v string) *SubmitInnerFunddividerelationRequest {
	s.UserName = &v
	return s
}

type SubmitInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerFunddividerelationResponse) SetReqMsgId(v string) *SubmitInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerFunddividerelationResponse) SetResultCode(v string) *SubmitInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerFunddividerelationResponse) SetResultMsg(v string) *SubmitInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分账关系id
	RelationId *string `json:"relation_id,omitempty" xml:"relation_id,omitempty" require:"true"`
}

func (s QueryInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerFunddividerelationRequest) SetAuthToken(v string) *QueryInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetProductInstanceId(v string) *QueryInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetTenantId(v string) *QueryInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerFunddividerelationRequest) SetRelationId(v string) *QueryInnerFunddividerelationRequest {
	s.RelationId = &v
	return s
}

type QueryInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分账公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 分账主体企业统一社会信用代码
	SubjectMerchantId *string `json:"subject_merchant_id,omitempty" xml:"subject_merchant_id,omitempty"`
	// 分账对象统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 分账合同或协议
	ContractFiles []*FileInfo `json:"contract_files,omitempty" xml:"contract_files,omitempty" type:"Repeated"`
	// 分账关系说明
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 分账方企业pid
	AlipayPid *string `json:"alipay_pid,omitempty" xml:"alipay_pid,omitempty"`
	// 分账方企业支付宝账号
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 审核列表
	AuditInfos []*AuditInfo `json:"audit_infos,omitempty" xml:"audit_infos,omitempty" type:"Repeated"`
	// INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
	RelationStatus *string `json:"relation_status,omitempty" xml:"relation_status,omitempty"`
	// 分账关系绑定失败原因
	RelationFailReason *string `json:"relation_fail_reason,omitempty" xml:"relation_fail_reason,omitempty"`
}

func (s QueryInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerFunddividerelationResponse) SetReqMsgId(v string) *QueryInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetResultCode(v string) *QueryInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetResultMsg(v string) *QueryInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetCompanyName(v string) *QueryInnerFunddividerelationResponse {
	s.CompanyName = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetSubjectMerchantId(v string) *QueryInnerFunddividerelationResponse {
	s.SubjectMerchantId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetMerchantId(v string) *QueryInnerFunddividerelationResponse {
	s.MerchantId = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetContractFiles(v []*FileInfo) *QueryInnerFunddividerelationResponse {
	s.ContractFiles = v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetDesc(v string) *QueryInnerFunddividerelationResponse {
	s.Desc = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAlipayPid(v string) *QueryInnerFunddividerelationResponse {
	s.AlipayPid = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAlipayAccount(v string) *QueryInnerFunddividerelationResponse {
	s.AlipayAccount = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetAuditInfos(v []*AuditInfo) *QueryInnerFunddividerelationResponse {
	s.AuditInfos = v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetRelationStatus(v string) *QueryInnerFunddividerelationResponse {
	s.RelationStatus = &v
	return s
}

func (s *QueryInnerFunddividerelationResponse) SetRelationFailReason(v string) *QueryInnerFunddividerelationResponse {
	s.RelationFailReason = &v
	return s
}

type PagequeryInnerFunddividerelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页查询对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerFunddividerelationRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerFunddividerelationRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerFunddividerelationRequest) SetAuthToken(v string) *PagequeryInnerFunddividerelationRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetProductInstanceId(v string) *PagequeryInnerFunddividerelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetTenantId(v string) *PagequeryInnerFunddividerelationRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationRequest) SetPageInfo(v *PageQuery) *PagequeryInnerFunddividerelationRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerFunddividerelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 分账关系页对象列表
	Relations []*RelationPage `json:"relations,omitempty" xml:"relations,omitempty" type:"Repeated"`
}

func (s PagequeryInnerFunddividerelationResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerFunddividerelationResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerFunddividerelationResponse) SetReqMsgId(v string) *PagequeryInnerFunddividerelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetResultCode(v string) *PagequeryInnerFunddividerelationResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetResultMsg(v string) *PagequeryInnerFunddividerelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetTotalSize(v int64) *PagequeryInnerFunddividerelationResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerFunddividerelationResponse) SetRelations(v []*RelationPage) *PagequeryInnerFunddividerelationResponse {
	s.Relations = v
	return s
}

type CreateInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 协议编号
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
	// 签署动作
	SignAction *string `json:"sign_action,omitempty" xml:"sign_action,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s CreateInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantagreementRequest) SetAuthToken(v string) *CreateInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetProductInstanceId(v string) *CreateInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetTenantId(v string) *CreateInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetAgreementId(v string) *CreateInnerMerchantagreementRequest {
	s.AgreementId = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetSignAction(v string) *CreateInnerMerchantagreementRequest {
	s.SignAction = &v
	return s
}

func (s *CreateInnerMerchantagreementRequest) SetUserName(v string) *CreateInnerMerchantagreementRequest {
	s.UserName = &v
	return s
}

type CreateInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantagreementResponse) SetReqMsgId(v string) *CreateInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerMerchantagreementResponse) SetResultCode(v string) *CreateInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerMerchantagreementResponse) SetResultMsg(v string) *CreateInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 协议id
	AgreementId *string `json:"agreement_id,omitempty" xml:"agreement_id,omitempty" require:"true"`
}

func (s QueryInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantagreementRequest) SetAuthToken(v string) *QueryInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetProductInstanceId(v string) *QueryInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetTenantId(v string) *QueryInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerMerchantagreementRequest) SetAgreementId(v string) *QueryInnerMerchantagreementRequest {
	s.AgreementId = &v
	return s
}

type QueryInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约状态 枚举
	// TOBE 待签
	// FAIL 签约失败
	// SUCCESS 签约成功
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty"`
	// 签约时间
	SignDateStr *string `json:"sign_date_str,omitempty" xml:"sign_date_str,omitempty"`
	// 协议内容 富文本
	AgreementContent *string `json:"agreement_content,omitempty" xml:"agreement_content,omitempty"`
}

func (s QueryInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantagreementResponse) SetReqMsgId(v string) *QueryInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetResultCode(v string) *QueryInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetResultMsg(v string) *QueryInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetSignStatus(v string) *QueryInnerMerchantagreementResponse {
	s.SignStatus = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetSignDateStr(v string) *QueryInnerMerchantagreementResponse {
	s.SignDateStr = &v
	return s
}

func (s *QueryInnerMerchantagreementResponse) SetAgreementContent(v string) *QueryInnerMerchantagreementResponse {
	s.AgreementContent = &v
	return s
}

type PagequeryInnerMerchantagreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分页对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerMerchantagreementRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagreementRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagreementRequest) SetAuthToken(v string) *PagequeryInnerMerchantagreementRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetProductInstanceId(v string) *PagequeryInnerMerchantagreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetTenantId(v string) *PagequeryInnerMerchantagreementRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementRequest) SetPageInfo(v *PageQuery) *PagequeryInnerMerchantagreementRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerMerchantagreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 协议分页对象
	AgreementPage []*AgreementPage `json:"agreement_page,omitempty" xml:"agreement_page,omitempty" type:"Repeated"`
}

func (s PagequeryInnerMerchantagreementResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagreementResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagreementResponse) SetReqMsgId(v string) *PagequeryInnerMerchantagreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetResultCode(v string) *PagequeryInnerMerchantagreementResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetResultMsg(v string) *PagequeryInnerMerchantagreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetTotalSize(v int64) *PagequeryInnerMerchantagreementResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerMerchantagreementResponse) SetAgreementPage(v []*AgreementPage) *PagequeryInnerMerchantagreementResponse {
	s.AgreementPage = v
	return s
}

type CreateInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 是否直接提交
	// SUBMITTED 直接提交
	// STAGE 暂存
	Submit *string `json:"submit,omitempty" xml:"submit,omitempty" require:"true"`
	// 进件模式
	// DIRECT(直连进件)
	// AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
	// expand_mode=_AGENT_ 必填
	SubTenantId *string `json:"sub_tenant_id,omitempty" xml:"sub_tenant_id,omitempty"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 第一次暂存或保存可以不传，后端直接生成
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s CreateInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantpayexpandRequest) SetAuthToken(v string) *CreateInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *CreateInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetTenantId(v string) *CreateInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetCompanyInfo(v *CompanyInfo) *CreateInnerMerchantpayexpandRequest {
	s.CompanyInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetLegalInfo(v *LegalInfo) *CreateInnerMerchantpayexpandRequest {
	s.LegalInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetApplicationInfo(v *ApplicationInfo) *CreateInnerMerchantpayexpandRequest {
	s.ApplicationInfo = v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetSubmit(v string) *CreateInnerMerchantpayexpandRequest {
	s.Submit = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetExpandMode(v string) *CreateInnerMerchantpayexpandRequest {
	s.ExpandMode = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetSubTenantId(v string) *CreateInnerMerchantpayexpandRequest {
	s.SubTenantId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetUserName(v string) *CreateInnerMerchantpayexpandRequest {
	s.UserName = &v
	return s
}

func (s *CreateInnerMerchantpayexpandRequest) SetPayExpandId(v string) *CreateInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

type CreateInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s CreateInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *CreateInnerMerchantpayexpandResponse) SetReqMsgId(v string) *CreateInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetResultCode(v string) *CreateInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetResultMsg(v string) *CreateInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateInnerMerchantpayexpandResponse) SetPayExpandId(v string) *CreateInnerMerchantpayexpandResponse {
	s.PayExpandId = &v
	return s
}

type SubmitInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 进件id
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	// 操作人名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s SubmitInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *SubmitInnerMerchantpayexpandRequest) SetAuthToken(v string) *SubmitInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetTenantId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetPayExpandId(v string) *SubmitInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandRequest) SetUserName(v string) *SubmitInnerMerchantpayexpandRequest {
	s.UserName = &v
	return s
}

type SubmitInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *SubmitInnerMerchantpayexpandResponse) SetReqMsgId(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandResponse) SetResultCode(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInnerMerchantpayexpandResponse) SetResultMsg(v string) *SubmitInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerMerchantpayexpandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
}

func (s QueryInnerMerchantpayexpandRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantpayexpandRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantpayexpandRequest) SetAuthToken(v string) *QueryInnerMerchantpayexpandRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetProductInstanceId(v string) *QueryInnerMerchantpayexpandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetTenantId(v string) *QueryInnerMerchantpayexpandRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetPayExpandId(v string) *QueryInnerMerchantpayexpandRequest {
	s.PayExpandId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandRequest) SetExpandMode(v string) *QueryInnerMerchantpayexpandRequest {
	s.ExpandMode = &v
	return s
}

type QueryInnerMerchantpayexpandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty"`
	// 审核列表
	AuditInfos []*AuditInfo `json:"audit_infos,omitempty" xml:"audit_infos,omitempty" type:"Repeated"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty"`
	// INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
	ExpandStatus *string `json:"expand_status,omitempty" xml:"expand_status,omitempty"`
	// 进件失败描述
	ExpandFailReason *string `json:"expand_fail_reason,omitempty" xml:"expand_fail_reason,omitempty"`
}

func (s QueryInnerMerchantpayexpandResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerMerchantpayexpandResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerMerchantpayexpandResponse) SetReqMsgId(v string) *QueryInnerMerchantpayexpandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetResultCode(v string) *QueryInnerMerchantpayexpandResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetResultMsg(v string) *QueryInnerMerchantpayexpandResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetCompanyInfo(v *CompanyInfo) *QueryInnerMerchantpayexpandResponse {
	s.CompanyInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetLegalInfo(v *LegalInfo) *QueryInnerMerchantpayexpandResponse {
	s.LegalInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetApplicationInfo(v *ApplicationInfo) *QueryInnerMerchantpayexpandResponse {
	s.ApplicationInfo = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetAuditInfos(v []*AuditInfo) *QueryInnerMerchantpayexpandResponse {
	s.AuditInfos = v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetPayExpandId(v string) *QueryInnerMerchantpayexpandResponse {
	s.PayExpandId = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandMode(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandMode = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandStatus(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandStatus = &v
	return s
}

func (s *QueryInnerMerchantpayexpandResponse) SetExpandFailReason(v string) *QueryInnerMerchantpayexpandResponse {
	s.ExpandFailReason = &v
	return s
}

type PagequeryInnerMerchantagentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 代理商户名称
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 进件状态
	PayExpandStatus *string `json:"pay_expand_status,omitempty" xml:"pay_expand_status,omitempty"`
	// 分页对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerMerchantagentRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagentRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagentRequest) SetAuthToken(v string) *PagequeryInnerMerchantagentRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetProductInstanceId(v string) *PagequeryInnerMerchantagentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetTenantId(v string) *PagequeryInnerMerchantagentRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetAgentName(v string) *PagequeryInnerMerchantagentRequest {
	s.AgentName = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetPayExpandStatus(v string) *PagequeryInnerMerchantagentRequest {
	s.PayExpandStatus = &v
	return s
}

func (s *PagequeryInnerMerchantagentRequest) SetPageInfo(v *PageQuery) *PagequeryInnerMerchantagentRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerMerchantagentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 代理租户分页对象
	MerchantAgentPage []*MerchantAgentPage `json:"merchant_agent_page,omitempty" xml:"merchant_agent_page,omitempty" type:"Repeated"`
}

func (s PagequeryInnerMerchantagentResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerMerchantagentResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerMerchantagentResponse) SetReqMsgId(v string) *PagequeryInnerMerchantagentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetResultCode(v string) *PagequeryInnerMerchantagentResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetResultMsg(v string) *PagequeryInnerMerchantagentResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetTotalSize(v int64) *PagequeryInnerMerchantagentResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerMerchantagentResponse) SetMerchantAgentPage(v []*MerchantAgentPage) *PagequeryInnerMerchantagentResponse {
	s.MerchantAgentPage = v
	return s
}

type CloneInnerTemplatefileaddressRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty" require:"true"`
}

func (s CloneInnerTemplatefileaddressRequest) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplatefileaddressRequest) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplatefileaddressRequest) SetAuthToken(v string) *CloneInnerTemplatefileaddressRequest {
	s.AuthToken = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetProductInstanceId(v string) *CloneInnerTemplatefileaddressRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetTenantId(v string) *CloneInnerTemplatefileaddressRequest {
	s.TenantId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetTemplateCode(v string) *CloneInnerTemplatefileaddressRequest {
	s.TemplateCode = &v
	return s
}

func (s *CloneInnerTemplatefileaddressRequest) SetFileKey(v string) *CloneInnerTemplatefileaddressRequest {
	s.FileKey = &v
	return s
}

type CloneInnerTemplatefileaddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 拷贝后的文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s CloneInnerTemplatefileaddressResponse) String() string {
	return tea.Prettify(s)
}

func (s CloneInnerTemplatefileaddressResponse) GoString() string {
	return s.String()
}

func (s *CloneInnerTemplatefileaddressResponse) SetReqMsgId(v string) *CloneInnerTemplatefileaddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetResultCode(v string) *CloneInnerTemplatefileaddressResponse {
	s.ResultCode = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetResultMsg(v string) *CloneInnerTemplatefileaddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloneInnerTemplatefileaddressResponse) SetFileKey(v string) *CloneInnerTemplatefileaddressResponse {
	s.FileKey = &v
	return s
}

type QueryInnerSignfieldsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 魔法库模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerSignfieldsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSignfieldsRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerSignfieldsRequest) SetAuthToken(v string) *QueryInnerSignfieldsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetProductInstanceId(v string) *QueryInnerSignfieldsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTenantId(v string) *QueryInnerSignfieldsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTemplateCode(v string) *QueryInnerSignfieldsRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerSignfieldsRequest) SetTemplateVersion(v string) *QueryInnerSignfieldsRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerSignfieldsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署区列表
	SignFieldList *string `json:"sign_field_list,omitempty" xml:"sign_field_list,omitempty"`
}

func (s QueryInnerSignfieldsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerSignfieldsResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerSignfieldsResponse) SetReqMsgId(v string) *QueryInnerSignfieldsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetResultCode(v string) *QueryInnerSignfieldsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetResultMsg(v string) *QueryInnerSignfieldsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerSignfieldsResponse) SetSignFieldList(v string) *QueryInnerSignfieldsResponse {
	s.SignFieldList = &v
	return s
}

type SyncInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 来源魔法库模板code
	SourceTemplateCode *string `json:"source_template_code,omitempty" xml:"source_template_code,omitempty" require:"true"`
	// 目标魔法库模板名称
	TargetTemplateName *string `json:"target_template_name,omitempty" xml:"target_template_name,omitempty"`
	// 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 魔法库来源模板版本
	SourceTemplateVersion *string `json:"source_template_version,omitempty" xml:"source_template_version,omitempty" require:"true"`
}

func (s SyncInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *SyncInnerTemplateRequest) SetAuthToken(v string) *SyncInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetProductInstanceId(v string) *SyncInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetTenantId(v string) *SyncInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetSourceTemplateCode(v string) *SyncInnerTemplateRequest {
	s.SourceTemplateCode = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetTargetTemplateName(v string) *SyncInnerTemplateRequest {
	s.TargetTemplateName = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetScene(v string) *SyncInnerTemplateRequest {
	s.Scene = &v
	return s
}

func (s *SyncInnerTemplateRequest) SetSourceTemplateVersion(v string) *SyncInnerTemplateRequest {
	s.SourceTemplateVersion = &v
	return s
}

type SyncInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步后的新模板code
	TargetTemplateCode *string `json:"target_template_code,omitempty" xml:"target_template_code,omitempty"`
}

func (s SyncInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *SyncInnerTemplateResponse) SetReqMsgId(v string) *SyncInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetResultCode(v string) *SyncInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetResultMsg(v string) *SyncInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncInnerTemplateResponse) SetTargetTemplateCode(v string) *SyncInnerTemplateResponse {
	s.TargetTemplateCode = &v
	return s
}

type UpdateInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户对应租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 魔法库版本id
	TemplateVersionId *string `json:"template_version_id,omitempty" xml:"template_version_id,omitempty" require:"true"`
	// 模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
}

func (s UpdateInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *UpdateInnerTemplateRequest) SetAuthToken(v string) *UpdateInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetProductInstanceId(v string) *UpdateInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTenantId(v string) *UpdateInnerTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTemplateVersionId(v string) *UpdateInnerTemplateRequest {
	s.TemplateVersionId = &v
	return s
}

func (s *UpdateInnerTemplateRequest) SetTemplateName(v string) *UpdateInnerTemplateRequest {
	s.TemplateName = &v
	return s
}

type UpdateInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *UpdateInnerTemplateResponse) SetReqMsgId(v string) *UpdateInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInnerTemplateResponse) SetResultCode(v string) *UpdateInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInnerTemplateResponse) SetResultMsg(v string) *UpdateInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

type QueryInnerTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 租户8位id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryInnerTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateRequest) SetAuthToken(v string) *QueryInnerTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetProductInstanceId(v string) *QueryInnerTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetTemplateCode(v string) *QueryInnerTemplateRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateRequest) SetTenantId(v string) *QueryInnerTemplateRequest {
	s.TenantId = &v
	return s
}

type QueryInnerTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板的基本信息，json格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateResponse) SetReqMsgId(v string) *QueryInnerTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetResultCode(v string) *QueryInnerTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetResultMsg(v string) *QueryInnerTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateResponse) SetData(v string) *QueryInnerTemplateResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateelementlinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板版本
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateelementlinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateelementlinkRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateelementlinkRequest) SetAuthToken(v string) *QueryInnerTemplateelementlinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetProductInstanceId(v string) *QueryInnerTemplateelementlinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTenantId(v string) *QueryInnerTemplateelementlinkRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTemplateCode(v string) *QueryInnerTemplateelementlinkRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateelementlinkRequest) SetTemplateVersion(v string) *QueryInnerTemplateelementlinkRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateelementlinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板元素列表，json格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateelementlinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateelementlinkResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateelementlinkResponse) SetReqMsgId(v string) *QueryInnerTemplateelementlinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetResultCode(v string) *QueryInnerTemplateelementlinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetResultMsg(v string) *QueryInnerTemplateelementlinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateelementlinkResponse) SetData(v string) *QueryInnerTemplateelementlinkResponse {
	s.Data = &v
	return s
}

type QueryInnerTemplateversionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 模板编码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模板的版本号，示例：1、2、3等
	TemplateVersion *string `json:"template_version,omitempty" xml:"template_version,omitempty" require:"true"`
}

func (s QueryInnerTemplateversionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateversionRequest) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateversionRequest) SetAuthToken(v string) *QueryInnerTemplateversionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetProductInstanceId(v string) *QueryInnerTemplateversionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTenantId(v string) *QueryInnerTemplateversionRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTemplateCode(v string) *QueryInnerTemplateversionRequest {
	s.TemplateCode = &v
	return s
}

func (s *QueryInnerTemplateversionRequest) SetTemplateVersion(v string) *QueryInnerTemplateversionRequest {
	s.TemplateVersion = &v
	return s
}

type QueryInnerTemplateversionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板的版本详情信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryInnerTemplateversionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInnerTemplateversionResponse) GoString() string {
	return s.String()
}

func (s *QueryInnerTemplateversionResponse) SetReqMsgId(v string) *QueryInnerTemplateversionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetResultCode(v string) *QueryInnerTemplateversionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetResultMsg(v string) *QueryInnerTemplateversionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInnerTemplateversionResponse) SetData(v string) *QueryInnerTemplateversionResponse {
	s.Data = &v
	return s
}

type PagequeryInnerOrdermsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户8位id
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息类型
	MsgPublishType *string `json:"msg_publish_type,omitempty" xml:"msg_publish_type,omitempty"`
	// 消息创建时间起始
	MsgCreateTimeFrom *string `json:"msg_create_time_from,omitempty" xml:"msg_create_time_from,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 消息创建时间结束
	MsgCreateTimeTo *string `json:"msg_create_time_to,omitempty" xml:"msg_create_time_to,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// SANDBOX 沙箱 ；PROD 生产
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 分页查询对象
	PageInfo *PageQuery `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s PagequeryInnerOrdermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrdermsgRequest) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrdermsgRequest) SetAuthToken(v string) *PagequeryInnerOrdermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetProductInstanceId(v string) *PagequeryInnerOrdermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetTenantId(v string) *PagequeryInnerOrdermsgRequest {
	s.TenantId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetOrderId(v string) *PagequeryInnerOrdermsgRequest {
	s.OrderId = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgPublishType(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgPublishType = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgCreateTimeFrom(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgCreateTimeFrom = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetMsgCreateTimeTo(v string) *PagequeryInnerOrdermsgRequest {
	s.MsgCreateTimeTo = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetEnv(v string) *PagequeryInnerOrdermsgRequest {
	s.Env = &v
	return s
}

func (s *PagequeryInnerOrdermsgRequest) SetPageInfo(v *PageQuery) *PagequeryInnerOrdermsgRequest {
	s.PageInfo = v
	return s
}

type PagequeryInnerOrdermsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据总量
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 消息内容列表
	OrderMsgInfos []*OrderMsgInfo `json:"order_msg_infos,omitempty" xml:"order_msg_infos,omitempty" type:"Repeated"`
}

func (s PagequeryInnerOrdermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryInnerOrdermsgResponse) GoString() string {
	return s.String()
}

func (s *PagequeryInnerOrdermsgResponse) SetReqMsgId(v string) *PagequeryInnerOrdermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetResultCode(v string) *PagequeryInnerOrdermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetResultMsg(v string) *PagequeryInnerOrdermsgResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetTotalSize(v int64) *PagequeryInnerOrdermsgResponse {
	s.TotalSize = &v
	return s
}

func (s *PagequeryInnerOrdermsgResponse) SetOrderMsgInfos(v []*OrderMsgInfo) *PagequeryInnerOrdermsgResponse {
	s.OrderMsgInfos = v
	return s
}

type RetryInnerOrdermsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// SANDBOX 沙箱 PROD 生产
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 订单id
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 消息ID
	//
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 使用租户新回调地址
	UsingNewCallbackUrl *bool `json:"using_new_callback_url,omitempty" xml:"using_new_callback_url,omitempty" require:"true"`
}

func (s RetryInnerOrdermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryInnerOrdermsgRequest) GoString() string {
	return s.String()
}

func (s *RetryInnerOrdermsgRequest) SetAuthToken(v string) *RetryInnerOrdermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetProductInstanceId(v string) *RetryInnerOrdermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetTenantId(v string) *RetryInnerOrdermsgRequest {
	s.TenantId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetEnv(v string) *RetryInnerOrdermsgRequest {
	s.Env = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetOrderId(v string) *RetryInnerOrdermsgRequest {
	s.OrderId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetMsgId(v string) *RetryInnerOrdermsgRequest {
	s.MsgId = &v
	return s
}

func (s *RetryInnerOrdermsgRequest) SetUsingNewCallbackUrl(v bool) *RetryInnerOrdermsgRequest {
	s.UsingNewCallbackUrl = &v
	return s
}

type RetryInnerOrdermsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息重试结果
	RetryResult *string `json:"retry_result,omitempty" xml:"retry_result,omitempty"`
}

func (s RetryInnerOrdermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryInnerOrdermsgResponse) GoString() string {
	return s.String()
}

func (s *RetryInnerOrdermsgResponse) SetReqMsgId(v string) *RetryInnerOrdermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetResultCode(v string) *RetryInnerOrdermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetResultMsg(v string) *RetryInnerOrdermsgResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryInnerOrdermsgResponse) SetRetryResult(v string) *RetryInnerOrdermsgResponse {
	s.RetryResult = &v
	return s
}

type RegisterMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfo `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfo `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfo `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 进件模式 DIRECT(直连进件) AGENT(代理进件)
	ExpandMode *string `json:"expand_mode,omitempty" xml:"expand_mode,omitempty" require:"true"`
	// expand_mode=_AGENT_ 必填
	SubTenantId *string `json:"sub_tenant_id,omitempty" xml:"sub_tenant_id,omitempty"`
}

func (s RegisterMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *RegisterMerchantexpandMerchantRequest) SetAuthToken(v string) *RegisterMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetProductInstanceId(v string) *RegisterMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfo) *RegisterMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfo) *RegisterMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfo) *RegisterMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetExpandMode(v string) *RegisterMerchantexpandMerchantRequest {
	s.ExpandMode = &v
	return s
}

func (s *RegisterMerchantexpandMerchantRequest) SetSubTenantId(v string) *RegisterMerchantexpandMerchantRequest {
	s.SubTenantId = &v
	return s
}

type RegisterMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s RegisterMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *RegisterMerchantexpandMerchantResponse) SetReqMsgId(v string) *RegisterMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetResultCode(v string) *RegisterMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetResultMsg(v string) *RegisterMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterMerchantexpandMerchantResponse) SetPayExpandId(v string) *RegisterMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type UploadMerchantexpandFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称 包含后缀
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s UploadMerchantexpandFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantexpandFileRequest) GoString() string {
	return s.String()
}

func (s *UploadMerchantexpandFileRequest) SetAuthToken(v string) *UploadMerchantexpandFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetProductInstanceId(v string) *UploadMerchantexpandFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetFileName(v string) *UploadMerchantexpandFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadMerchantexpandFileRequest) SetBizScene(v string) *UploadMerchantexpandFileRequest {
	s.BizScene = &v
	return s
}

type UploadMerchantexpandFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时上传文件地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s UploadMerchantexpandFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantexpandFileResponse) GoString() string {
	return s.String()
}

func (s *UploadMerchantexpandFileResponse) SetReqMsgId(v string) *UploadMerchantexpandFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetResultCode(v string) *UploadMerchantexpandFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetResultMsg(v string) *UploadMerchantexpandFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetUploadUrl(v string) *UploadMerchantexpandFileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadMerchantexpandFileResponse) SetFileKey(v string) *UploadMerchantexpandFileResponse {
	s.FileKey = &v
	return s
}

type QueryMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户入驻返回的进件编号 expand_mode=AGENT必填
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
}

func (s QueryMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandMerchantRequest) SetAuthToken(v string) *QueryMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantexpandMerchantRequest) SetProductInstanceId(v string) *QueryMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMerchantexpandMerchantRequest) SetPayExpandId(v string) *QueryMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

type QueryMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户入驻状态
	// INIT 入驻中
	// SUCCESS 入驻成功
	// FAIL 入驻失败
	EnrollmentStatus *string `json:"enrollment_status,omitempty" xml:"enrollment_status,omitempty"`
	// 入驻失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
}

func (s QueryMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantexpandMerchantResponse) SetReqMsgId(v string) *QueryMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetResultCode(v string) *QueryMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetResultMsg(v string) *QueryMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetEnrollmentStatus(v string) *QueryMerchantexpandMerchantResponse {
	s.EnrollmentStatus = &v
	return s
}

func (s *QueryMerchantexpandMerchantResponse) SetFailReason(v string) *QueryMerchantexpandMerchantResponse {
	s.FailReason = &v
	return s
}

type UpdateMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司信息
	CompanyInfo *CompanyInfoUpdate `json:"company_info,omitempty" xml:"company_info,omitempty" require:"true"`
	// 法人信息
	LegalInfo *LegalInfoUpdate `json:"legal_info,omitempty" xml:"legal_info,omitempty" require:"true"`
	// 应用信息
	ApplicationInfo *ApplicationInfoUpdate `json:"application_info,omitempty" xml:"application_info,omitempty" require:"true"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
	// 社会统一信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s UpdateMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *UpdateMerchantexpandMerchantRequest) SetAuthToken(v string) *UpdateMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetProductInstanceId(v string) *UpdateMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfoUpdate) *UpdateMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetPayExpandId(v string) *UpdateMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantRequest) SetMerchantId(v string) *UpdateMerchantexpandMerchantRequest {
	s.MerchantId = &v
	return s
}

type UpdateMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s UpdateMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *UpdateMerchantexpandMerchantResponse) SetReqMsgId(v string) *UpdateMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetResultCode(v string) *UpdateMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetResultMsg(v string) *UpdateMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateMerchantexpandMerchantResponse) SetPayExpandId(v string) *UpdateMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type CreateRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证方案枚举
	// APP（客户端android/ios方案）
	// H5（网页）
	// ZFB（支付宝客户端H5方案）
	SolutionType *string `json:"solution_type,omitempty" xml:"solution_type,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 身份信息来源类型
	// IDENTITY_CARD（身份证）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 【solution_type=ZFB使用】
	// reserve（保存活体人脸 默认值）
	// never（不保存活体人脸）
	FaceReserveStrategy *string `json:"face_reserve_strategy,omitempty" xml:"face_reserve_strategy,omitempty"`
	// 【solution_type=ZFB使用】
	// 认证成功后需要跳转的地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
}

func (s CreateRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfRequest) SetAuthToken(v string) *CreateRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetSolutionType(v string) *CreateRealpersonFacevrfRequest {
	s.SolutionType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertName(v string) *CreateRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertNo(v string) *CreateRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertType(v string) *CreateRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetFaceReserveStrategy(v string) *CreateRealpersonFacevrfRequest {
	s.FaceReserveStrategy = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

type CreateRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一ID标识，为空则是异常
	RealPersonVerificationCode *string `json:"real_person_verification_code,omitempty" xml:"real_person_verification_code,omitempty"`
	// 【solution_type=H5 | ZFB返回】
	// 人脸核身url地址
	WebUrl *string `json:"web_url,omitempty" xml:"web_url,omitempty"`
}

func (s CreateRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultCode(v string) *CreateRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultMsg(v string) *CreateRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetRealPersonVerificationCode(v string) *CreateRealpersonFacevrfResponse {
	s.RealPersonVerificationCode = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetWebUrl(v string) *CreateRealpersonFacevrfResponse {
	s.WebUrl = &v
	return s
}

type QueryRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信实人认证的唯一标识
	RealPersonVerificationCode *string `json:"real_person_verification_code,omitempty" xml:"real_person_verification_code,omitempty" require:"true"`
}

func (s QueryRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfRequest) SetAuthToken(v string) *QueryRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetRealPersonVerificationCode(v string) *QueryRealpersonFacevrfRequest {
	s.RealPersonVerificationCode = &v
	return s
}

type QueryRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证结果
	// PROCESSING（初始化）
	// SUCCESS（认证通过）FAIL（认证不通过）
	CertifyState *string `json:"certify_state,omitempty" xml:"certify_state,omitempty"`
	// 【solution_type=H5 | APP 返回】
	// 本次认证是否存在安全风险
	// true(检测到安全风险)
	// false(未检测到安全风险)
	AttackFlag *string `json:"attack_flag,omitempty" xml:"attack_flag,omitempty"`
	// 【solution_type=H5 | APP 返回】
	// base64过后的二值化图片
	AlivePhoto *string `json:"alive_photo,omitempty" xml:"alive_photo,omitempty"`
}

func (s QueryRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultCode(v string) *QueryRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultMsg(v string) *QueryRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetCertifyState(v string) *QueryRealpersonFacevrfResponse {
	s.CertifyState = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetAttackFlag(v string) *QueryRealpersonFacevrfResponse {
	s.AttackFlag = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetAlivePhoto(v string) *QueryRealpersonFacevrfResponse {
	s.AlivePhoto = &v
	return s
}

type QueryRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 用户ip地址
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
}

func (s QueryRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskRequest) SetAuthToken(v string) *QueryRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskRequest) SetProductInstanceId(v string) *QueryRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskRequest) SetUserId(v string) *QueryRiskRequest {
	s.UserId = &v
	return s
}

func (s *QueryRiskRequest) SetUserName(v string) *QueryRiskRequest {
	s.UserName = &v
	return s
}

func (s *QueryRiskRequest) SetCertNo(v string) *QueryRiskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryRiskRequest) SetMobile(v string) *QueryRiskRequest {
	s.Mobile = &v
	return s
}

func (s *QueryRiskRequest) SetIp(v string) *QueryRiskRequest {
	s.Ip = &v
	return s
}

type QueryRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一ID标识，为空则是异常
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 风险场景的决策结果
	Scenes []*RiskScene `json:"scenes,omitempty" xml:"scenes,omitempty" type:"Repeated"`
	// 策略结果详情
	Strategies []*RiskStrategy `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 模型结果详情
	Models []*RiskModel `json:"models,omitempty" xml:"models,omitempty" type:"Repeated"`
}

func (s QueryRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskResponse) SetReqMsgId(v string) *QueryRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskResponse) SetResultCode(v string) *QueryRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskResponse) SetResultMsg(v string) *QueryRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskResponse) SetSecurityId(v string) *QueryRiskResponse {
	s.SecurityId = &v
	return s
}

func (s *QueryRiskResponse) SetDecision(v string) *QueryRiskResponse {
	s.Decision = &v
	return s
}

func (s *QueryRiskResponse) SetScenes(v []*RiskScene) *QueryRiskResponse {
	s.Scenes = v
	return s
}

func (s *QueryRiskResponse) SetStrategies(v []*RiskStrategy) *QueryRiskResponse {
	s.Strategies = v
	return s
}

func (s *QueryRiskResponse) SetModels(v []*RiskModel) *QueryRiskResponse {
	s.Models = v
	return s
}

type AllSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同类型，如果不传则返回所有
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 商户统一社会信用代码，SIT环境，非融必填
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" maxLength:"42"`
	// ● FINANCE 融资
	// ● NON_FINANCE 非融资
	FundType *string `json:"fund_type,omitempty" xml:"fund_type,omitempty"`
	// 查询融资类型时，需要传入资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s AllSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllSignTemplateRequest) SetAuthToken(v string) *AllSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllSignTemplateRequest) SetProductInstanceId(v string) *AllSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllSignTemplateRequest) SetContractType(v string) *AllSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *AllSignTemplateRequest) SetMerchantId(v string) *AllSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundType(v string) *AllSignTemplateRequest {
	s.FundType = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundId(v string) *AllSignTemplateRequest {
	s.FundId = &v
	return s
}

type AllSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// List<Object>格式，详细参考：
	// [
	//         {
	//             "templateCode": "TEST_001",
	//             "tenantId": "BIPCCOQY",
	//             "agreementType": "SERVICE_LEASE",
	//             "fileName": "测试模板之协议签署证明",
	//             "templateId": "f28038577d664015bfc1034c4a125121",
	//             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
	//             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
	//             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
	//         }
	//     ]
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllSignTemplateResponse) SetReqMsgId(v string) *AllSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultCode(v string) *AllSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultMsg(v string) *AllSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllSignTemplateResponse) SetTemplateList(v string) *AllSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 签署完成跳转链接
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
	// {
	// templateId:__, // String格式
	// templateArgs: {
	//     "模板参数key":"模板参数值", // 必须为String
	//   }
	// }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"20" minLength:"12"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true" maxLength:"256" minLength:"2"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"0"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty" maximum:"10000" minimum:"1"`
	// CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"20" minLength:"6"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true" maxLength:"1000" minLength:"4"`
	// 法人姓名，需要RSA加密传输
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty" minLength:"0"`
}

func (s SubmitSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowRequest) SetAuthToken(v string) *SubmitSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitSignFlowRequest) SetProductInstanceId(v string) *SubmitSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetOrderId(v string) *SubmitSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdType(v string) *SubmitSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdNumber(v string) *SubmitSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserName(v string) *SubmitSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserMobile(v string) *SubmitSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserEmail(v string) *SubmitSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignValidity(v string) *SubmitSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitSignFlowRequest) SetFlowNotifyType(v string) *SubmitSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetBusinessScene(v string) *SubmitSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitSignFlowRequest) SetTemplateList(v string) *SubmitSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitSignFlowRequest) SetAlipayUserId(v string) *SubmitSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantName(v string) *SubmitSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantTag(v string) *SubmitSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSealId(v string) *SubmitSignFlowRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdType(v string) *SubmitSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalName(v string) *SubmitSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetThirdSigner(v string) *SubmitSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署附加信息，用于获取签署链接等。JSON格式的字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowResponse) SetReqMsgId(v string) *SubmitSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultCode(v string) *SubmitSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultMsg(v string) *SubmitSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignNo(v string) *SubmitSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitSignFlowResponse) SetFlowId(v string) *SubmitSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetAccountId(v string) *SubmitSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignInfo(v string) *SubmitSignFlowResponse {
	s.SignInfo = &v
	return s
}

type GetSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetSignFlowRequest) SetAuthToken(v string) *GetSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSignFlowRequest) SetProductInstanceId(v string) *GetSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSignFlowRequest) SetSignNo(v string) *GetSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署文件列表，参考：
	// _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
	DocList *string `json:"doc_list,omitempty" xml:"doc_list,omitempty"`
	// 业务场景，主要用于签署合同的标题描述
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 签署合同中的订单的uid。
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty"`
	// 签署扩展信息，用于获取签署链接等。JSON格式字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s GetSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetSignFlowResponse) SetReqMsgId(v string) *GetSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSignFlowResponse) SetResultCode(v string) *GetSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSignFlowResponse) SetResultMsg(v string) *GetSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSignFlowResponse) SetSignNo(v string) *GetSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetSignFlowResponse) SetOrderId(v string) *GetSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetSignFlowResponse) SetAccountId(v string) *GetSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetSignFlowResponse) SetStatus(v string) *GetSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetSignFlowResponse) SetFlowId(v string) *GetSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetSignFlowResponse) SetDocList(v string) *GetSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetSignFlowResponse) SetBusinessScene(v string) *GetSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetSignFlowResponse) SetAlipayUserId(v string) *GetSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

func (s *GetSignFlowResponse) SetSignInfo(v string) *GetSignFlowResponse {
	s.SignInfo = &v
	return s
}

type AuthSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true" maxLength:"64" minLength:"6"`
	// 签署区域的tag，和发起签署流程的机构的tag对应。
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署服务返回的biz_flow_id
	BizFlowId *string `json:"biz_flow_id,omitempty" xml:"biz_flow_id,omitempty" maxLength:"64" minLength:"4"`
	// 电子合同签署服务的返回的account_id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" maxLength:"64" minLength:"4"`
}

func (s AuthSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthSignFlowRequest) SetAuthToken(v string) *AuthSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthSignFlowRequest) SetProductInstanceId(v string) *AuthSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthSignFlowRequest) SetSignNo(v string) *AuthSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthSignFlowRequest) SetTag(v string) *AuthSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthSignFlowRequest) SetBizFlowId(v string) *AuthSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthSignFlowRequest) SetAccountId(v string) *AuthSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthSignFlowResponse) SetReqMsgId(v string) *AuthSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultCode(v string) *AuthSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultMsg(v string) *AuthSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthSignFlowResponse) SetSignFieldIds(v string) *AuthSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type SubmitFrontSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"4"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true" maxLength:"40" minLength:"4"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	//
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	//
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 签署完成跳转链接
	//
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"24" minLength:"4"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// CRED_ORG_USCC：统一社会信用代码，
	// CRED_ORG_REGCODE：工商注册号，
	// 只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"32" minLength:"4"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true"`
	// 法人姓名，需要RSA加密传输
	//
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	//
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty"`
}

func (s SubmitFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignRequest) SetAuthToken(v string) *SubmitFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitFrontSignRequest) SetProductInstanceId(v string) *SubmitFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetOrderId(v string) *SubmitFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdType(v string) *SubmitFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdNumber(v string) *SubmitFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserName(v string) *SubmitFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserMobile(v string) *SubmitFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserEmail(v string) *SubmitFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignValidity(v string) *SubmitFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitFrontSignRequest) SetFlowNotifyType(v string) *SubmitFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetBusinessScene(v string) *SubmitFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitFrontSignRequest) SetTemplateList(v string) *SubmitFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitFrontSignRequest) SetAlipayUserId(v string) *SubmitFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantName(v string) *SubmitFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantTag(v string) *SubmitFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSealId(v string) *SubmitFrontSignRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdType(v string) *SubmitFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalName(v string) *SubmitFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetThirdSigner(v string) *SubmitFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitFrontSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	//
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署扩展信息，用于获取签署链接等。JSON格式字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignResponse) SetReqMsgId(v string) *SubmitFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultCode(v string) *SubmitFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultMsg(v string) *SubmitFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignNo(v string) *SubmitFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitFrontSignResponse) SetFlowId(v string) *SubmitFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetAccountId(v string) *SubmitFrontSignResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignInfo(v string) *SubmitFrontSignResponse {
	s.SignInfo = &v
	return s
}

type UploadSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	//
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadSignFlowRequest) SetAuthToken(v string) *UploadSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignFlowRequest) SetProductInstanceId(v string) *UploadSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignFlowRequest) SetMerchantId(v string) *UploadSignFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadSignFlowRequest) SetOrderId(v string) *UploadSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignNo(v string) *UploadSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadSignFlowRequest) SetTemplateId(v string) *UploadSignFlowRequest {
	s.TemplateId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignTime(v string) *UploadSignFlowRequest {
	s.SignTime = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileObject(v io.Reader) *UploadSignFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadSignFlowRequest) SetFileObjectName(v string) *UploadSignFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileId(v string) *UploadSignFlowRequest {
	s.FileId = &v
	return s
}

type UploadSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty"`
}

func (s UploadSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadSignFlowResponse) SetReqMsgId(v string) *UploadSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultCode(v string) *UploadSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultMsg(v string) *UploadSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignFlowResponse) SetFileItemNo(v string) *UploadSignFlowResponse {
	s.FileItemNo = &v
	return s
}

type UploadSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 模板类型
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 签署区坐标配置
	PosConf *string `json:"pos_conf,omitempty" xml:"pos_conf,omitempty" require:"true"`
	// 模板参数
	TemplateArgs *string `json:"template_args,omitempty" xml:"template_args,omitempty"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *UploadSignTemplateRequest) SetAuthToken(v string) *UploadSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignTemplateRequest) SetProductInstanceId(v string) *UploadSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignTemplateRequest) SetMerchantId(v string) *UploadSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadSignTemplateRequest) SetContractType(v string) *UploadSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *UploadSignTemplateRequest) SetAgreementType(v string) *UploadSignTemplateRequest {
	s.AgreementType = &v
	return s
}

func (s *UploadSignTemplateRequest) SetPosConf(v string) *UploadSignTemplateRequest {
	s.PosConf = &v
	return s
}

func (s *UploadSignTemplateRequest) SetTemplateArgs(v string) *UploadSignTemplateRequest {
	s.TemplateArgs = &v
	return s
}

func (s *UploadSignTemplateRequest) SetFileObject(v io.Reader) *UploadSignTemplateRequest {
	s.FileObject = v
	return s
}

func (s *UploadSignTemplateRequest) SetFileObjectName(v string) *UploadSignTemplateRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadSignTemplateRequest) SetFileId(v string) *UploadSignTemplateRequest {
	s.FileId = &v
	return s
}

type UploadSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传模板后返回的模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s UploadSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *UploadSignTemplateResponse) SetReqMsgId(v string) *UploadSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignTemplateResponse) SetResultCode(v string) *UploadSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignTemplateResponse) SetResultMsg(v string) *UploadSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignTemplateResponse) SetTemplateId(v string) *UploadSignTemplateResponse {
	s.TemplateId = &v
	return s
}

type UploadSignCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 凭证合同类型
	CreditType *string `json:"credit_type,omitempty" xml:"credit_type,omitempty" require:"true"`
	// 凭证名称
	CreditName *string `json:"credit_name,omitempty" xml:"credit_name,omitempty"`
	// 文本类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 文本下载链接，如果类型是FILE则必填
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s UploadSignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadSignCreditRequest) SetAuthToken(v string) *UploadSignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignCreditRequest) SetProductInstanceId(v string) *UploadSignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignCreditRequest) SetOrderNoType(v string) *UploadSignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadSignCreditRequest) SetOrderNo(v string) *UploadSignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadSignCreditRequest) SetCreditType(v string) *UploadSignCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadSignCreditRequest) SetCreditName(v string) *UploadSignCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadSignCreditRequest) SetContentType(v string) *UploadSignCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadSignCreditRequest) SetFileUrl(v string) *UploadSignCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSignCreditRequest) SetContent(v string) *UploadSignCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadSignCreditRequest) SetMerchantId(v string) *UploadSignCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadSignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadSignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadSignCreditResponse) SetReqMsgId(v string) *UploadSignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignCreditResponse) SetResultCode(v string) *UploadSignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignCreditResponse) SetResultMsg(v string) *UploadSignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignCreditResponse) SetContentId(v string) *UploadSignCreditResponse {
	s.ContentId = &v
	return s
}

type QuerySignCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号类型
	OrderNoType *string `json:"order_no_type,omitempty" xml:"order_no_type,omitempty" require:"true"`
	// 订单号，或资产包号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 商户统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s QuerySignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySignCreditRequest) GoString() string {
	return s.String()
}

func (s *QuerySignCreditRequest) SetAuthToken(v string) *QuerySignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySignCreditRequest) SetProductInstanceId(v string) *QuerySignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySignCreditRequest) SetOrderNoType(v string) *QuerySignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QuerySignCreditRequest) SetOrderNo(v string) *QuerySignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QuerySignCreditRequest) SetMerchantId(v string) *QuerySignCreditRequest {
	s.MerchantId = &v
	return s
}

type QuerySignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QuerySignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySignCreditResponse) GoString() string {
	return s.String()
}

func (s *QuerySignCreditResponse) SetReqMsgId(v string) *QuerySignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySignCreditResponse) SetResultCode(v string) *QuerySignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySignCreditResponse) SetResultMsg(v string) *QuerySignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySignCreditResponse) SetContentInfo(v string) *QuerySignCreditResponse {
	s.ContentInfo = &v
	return s
}

type CancelSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 默认:“撤销”
	RevokeReason *string `json:"revoke_reason,omitempty" xml:"revoke_reason,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
}

func (s CancelSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelSignFlowRequest) GoString() string {
	return s.String()
}

func (s *CancelSignFlowRequest) SetAuthToken(v string) *CancelSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelSignFlowRequest) SetProductInstanceId(v string) *CancelSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelSignFlowRequest) SetSignNo(v string) *CancelSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *CancelSignFlowRequest) SetRevokeReason(v string) *CancelSignFlowRequest {
	s.RevokeReason = &v
	return s
}

func (s *CancelSignFlowRequest) SetOperatorId(v string) *CancelSignFlowRequest {
	s.OperatorId = &v
	return s
}

type CancelSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelSignFlowResponse) GoString() string {
	return s.String()
}

func (s *CancelSignFlowResponse) SetReqMsgId(v string) *CancelSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelSignFlowResponse) SetResultCode(v string) *CancelSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelSignFlowResponse) SetResultMsg(v string) *CancelSignFlowResponse {
	s.ResultMsg = &v
	return s
}

type SyncTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务字段，具体传入信息需参考文档
	// 传入格式需为json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口执行类型
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s SyncTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeRequest) SetAuthToken(v string) *SyncTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeRequest) SetProductInstanceId(v string) *SyncTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeRequest) SetBizContent(v string) *SyncTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncTradeRequest) SetType(v string) *SyncTradeRequest {
	s.Type = &v
	return s
}

type SyncTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeResponse) SetReqMsgId(v string) *SyncTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeResponse) SetResultCode(v string) *SyncTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeResponse) SetResultMsg(v string) *SyncTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeResponse) SetResponseData(v string) *SyncTradeResponse {
	s.ResponseData = &v
	return s
}

type GetTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeRequest) GoString() string {
	return s.String()
}

func (s *GetTradeRequest) SetAuthToken(v string) *GetTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeRequest) SetProductInstanceId(v string) *GetTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeRequest) SetBizContent(v string) *GetTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetTradeRequest) SetType(v string) *GetTradeRequest {
	s.Type = &v
	return s
}

type GetTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeResponse) GoString() string {
	return s.String()
}

func (s *GetTradeResponse) SetReqMsgId(v string) *GetTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeResponse) SetResultCode(v string) *GetTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeResponse) SetResultMsg(v string) *GetTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeResponse) SetResponseData(v string) *GetTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeRequest) SetAuthToken(v string) *SyncFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFrontTradeRequest) SetProductInstanceId(v string) *SyncFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFrontTradeRequest) SetType(v string) *SyncFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncFrontTradeRequest) SetBizContent(v string) *SyncFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeResponse) SetReqMsgId(v string) *SyncFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultCode(v string) *SyncFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultMsg(v string) *SyncFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResponseData(v string) *SyncFrontTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeFinanceloanapplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 融资放款申请接口
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" maxLength:"64"`
	// 类型
	// ● 默认为：ORDER, 单订单申请
	// ● PACKAGE_ORDER , 资产包订单模式
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 资产包id
	// type = PACKAGE_ORDER ， 必填
	AssetPackageId *string `json:"asset_package_id,omitempty" xml:"asset_package_id,omitempty" maxLength:"50" minLength:"6"`
	// type = PACKAGE_ORDER ， 必填
	//
	// ● APPEND: 追加订单列表
	// ● FINIISH : 结束
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty"`
	// 订单id列表的jsonArray
	OrderIdList *string `json:"order_id_list,omitempty" xml:"order_id_list,omitempty"`
}

func (s SyncTradeFinanceloanapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyRequest) SetAuthToken(v string) *SyncTradeFinanceloanapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetProductInstanceId(v string) *SyncTradeFinanceloanapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetOrderId(v string) *SyncTradeFinanceloanapplyRequest {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantId(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantName(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantName = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetFundId(v string) *SyncTradeFinanceloanapplyRequest {
	s.FundId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetType(v string) *SyncTradeFinanceloanapplyRequest {
	s.Type = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetAssetPackageId(v string) *SyncTradeFinanceloanapplyRequest {
	s.AssetPackageId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetStage(v string) *SyncTradeFinanceloanapplyRequest {
	s.Stage = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetOrderIdList(v string) *SyncTradeFinanceloanapplyRequest {
	s.OrderIdList = &v
	return s
}

type SyncTradeFinanceloanapplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncTradeFinanceloanapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyResponse) SetReqMsgId(v string) *SyncTradeFinanceloanapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultCode(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultMsg(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetOrderId(v string) *SyncTradeFinanceloanapplyResponse {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetMerchantId(v string) *SyncTradeFinanceloanapplyResponse {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 履约期数，不填返回为所有履约期的履约信息
	// - 如果有填写，返回当前期数的履约信息，列表长度为1
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetTradeMerchantfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentRequest) SetAuthToken(v string) *GetTradeMerchantfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetProductInstanceId(v string) *GetTradeMerchantfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetOrderId(v string) *GetTradeMerchantfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetMerchantId(v string) *GetTradeMerchantfulfillmentRequest {
	s.MerchantId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetTermIdx(v int64) *GetTradeMerchantfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetTradeMerchantfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为 「MerchantFulfillmentResp」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentResponse) SetReqMsgId(v string) *GetTradeMerchantfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultCode(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultMsg(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResponseData(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetTradeUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceRequest) SetAuthToken(v string) *GetTradeUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetProductInstanceId(v string) *GetTradeUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetOrderId(v string) *GetTradeUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetMerchantId(v string) *GetTradeUserperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceResponse) SetReqMsgId(v string) *GetTradeUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultCode(v string) *GetTradeUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultMsg(v string) *GetTradeUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResponseData(v string) *GetTradeUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetTradeMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceRequest) SetAuthToken(v string) *GetTradeMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetProductInstanceId(v string) *GetTradeMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetOrderId(v string) *GetTradeMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetMerchantId(v string) *GetTradeMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceResponse) SetReqMsgId(v string) *GetTradeMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultCode(v string) *GetTradeMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultMsg(v string) *GetTradeMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResponseData(v string) *GetTradeMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type UpdateTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"6"`
	// 商家社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"199" minLength:"1"`
	// 修改的用户履约期数
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty" require:"true"`
	// 更新后的租金，单位为分
	// 1234=12.34元
	UpdatedRentalMoney *int64 `json:"updated_rental_money,omitempty" xml:"updated_rental_money,omitempty" require:"true"`
	// 调整原因，枚举
	// ● A01 : 违章罚金
	// ● A02 : 水电煤费用
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" require:"true" maxLength:"10" minLength:"1"`
	// 调整说明，本说明同步到支付宝账户备注中，需准确填写
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s UpdateTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *UpdateTradeUserpromiseRequest) SetAuthToken(v string) *UpdateTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetProductInstanceId(v string) *UpdateTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetOrderId(v string) *UpdateTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetMerchantId(v string) *UpdateTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetTermIdx(v int64) *UpdateTradeUserpromiseRequest {
	s.TermIdx = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetUpdatedRentalMoney(v int64) *UpdateTradeUserpromiseRequest {
	s.UpdatedRentalMoney = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetReason(v string) *UpdateTradeUserpromiseRequest {
	s.Reason = &v
	return s
}

func (s *UpdateTradeUserpromiseRequest) SetDesc(v string) *UpdateTradeUserpromiseRequest {
	s.Desc = &v
	return s
}

type UpdateTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *UpdateTradeUserpromiseResponse) SetReqMsgId(v string) *UpdateTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTradeUserpromiseResponse) SetResultCode(v string) *UpdateTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTradeUserpromiseResponse) SetResultMsg(v string) *UpdateTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

type SyncFrontIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncFrontIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncFrontIndirectorderRequest) SetAuthToken(v string) *SyncFrontIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFrontIndirectorderRequest) SetProductInstanceId(v string) *SyncFrontIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFrontIndirectorderRequest) SetBizContent(v string) *SyncFrontIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncFrontIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值，json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFrontIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncFrontIndirectorderResponse) SetReqMsgId(v string) *SyncFrontIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResultCode(v string) *SyncFrontIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResultMsg(v string) *SyncFrontIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFrontIndirectorderResponse) SetResponseData(v string) *SyncFrontIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncTradeIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeIndirectorderRequest) SetAuthToken(v string) *SyncTradeIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeIndirectorderRequest) SetProductInstanceId(v string) *SyncTradeIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeIndirectorderRequest) SetBizContent(v string) *SyncTradeIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncTradeIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回业务参数，json.toString
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncTradeIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeIndirectorderResponse) SetReqMsgId(v string) *SyncTradeIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResultCode(v string) *SyncTradeIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResultMsg(v string) *SyncTradeIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeIndirectorderResponse) SetResponseData(v string) *SyncTradeIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type CreateWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户id，使用签约能力前时候进行向平台申请
	AlipayMerchantId *string `json:"alipay_merchant_id,omitempty" xml:"alipay_merchant_id,omitempty" maxLength:"20"`
	// 支付宝商户名称，会展示在支付并签约界面
	AlipayMerchantName *string `json:"alipay_merchant_name,omitempty" xml:"alipay_merchant_name,omitempty" maxLength:"50"`
	// 支付宝商户服务名称，会展示在支付并签约界面
	AlipayMerchantServiceName *string `json:"alipay_merchant_service_name,omitempty" xml:"alipay_merchant_service_name,omitempty" maxLength:"50"`
	// 支付宝商户服务描述，会展示在支付并签约界面
	AlipayMerchantServiceDescription *string `json:"alipay_merchant_service_description,omitempty" xml:"alipay_merchant_service_description,omitempty" maxLength:"150"`
	// 支付宝uid，非必填
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" maxLength:"128"`
	// 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" maxLength:"256"`
}

func (s CreateWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignRequest) SetAuthToken(v string) *CreateWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdSignRequest) SetProductInstanceId(v string) *CreateWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetOrderId(v string) *CreateWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantId(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayUserId(v string) *CreateWithholdSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetReturnUrl(v string) *CreateWithholdSignRequest {
	s.ReturnUrl = &v
	return s
}

type CreateWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignResponse) SetReqMsgId(v string) *CreateWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultCode(v string) *CreateWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultMsg(v string) *CreateWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdSignResponse) SetSignStr(v string) *CreateWithholdSignResponse {
	s.SignStr = &v
	return s
}

type QueryWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignRequest) SetAuthToken(v string) *QueryWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdSignRequest) SetProductInstanceId(v string) *QueryWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdSignRequest) SetOrderId(v string) *QueryWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议当前状态
	// 1. UNSIGNED：未签约
	// 2. SIGNED：已签约；
	// 3. TERMINATED：已解约
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 代扣协议号
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
}

func (s QueryWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignResponse) SetReqMsgId(v string) *QueryWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultCode(v string) *QueryWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultMsg(v string) *QueryWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdSignResponse) SetStatus(v string) *QueryWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdSignResponse) SetSignTime(v string) *QueryWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetValidTime(v string) *QueryWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetInvalidTime(v string) *QueryWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetAgreementNo(v string) *QueryWithholdSignResponse {
	s.AgreementNo = &v
	return s
}

type UnbindWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignRequest) SetAuthToken(v string) *UnbindWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetProductInstanceId(v string) *UnbindWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetOrderId(v string) *UnbindWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignResponse) SetReqMsgId(v string) *UnbindWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultCode(v string) *UnbindWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultMsg(v string) *UnbindWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当发现跨天继续提交
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 取消原因
	// RENTING_OUT:退租
	// RENTING_AND_RESALE:租转售
	//
	//
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true" maxLength:"64"`
}

func (s CancelWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanRequest) SetAuthToken(v string) *CancelWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetProductInstanceId(v string) *CancelWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetOrderId(v string) *CancelWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetCancelReason(v string) *CancelWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanResponse) SetReqMsgId(v string) *CancelWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultCode(v string) *CancelWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultMsg(v string) *CancelWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 其他方式还款的时间
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 取消订单某一期代扣计划中以其他方式还款金额，单位为分
	PayOffAmount *int64 `json:"pay_off_amount,omitempty" xml:"pay_off_amount,omitempty" require:"true" minimum:"0"`
	// 变更其他方式还款
	// WECHAT:微信;
	// BANK:银行
	// ALIPAY:支付宝
	PayOffType *string `json:"pay_off_type,omitempty" xml:"pay_off_type,omitempty" maxLength:"64"`
	// 通过其他方式还款单号;例如银行流水号或微信流水号
	PayOffNo *string `json:"pay_off_no,omitempty" xml:"pay_off_no,omitempty" maxLength:"64"`
	// 其他方式还款银行名称，还款方式为银行时必填
	PayOffBankName *string `json:"pay_off_bank_name,omitempty" xml:"pay_off_bank_name,omitempty" maxLength:"64"`
}

func (s RepayWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanRequest) SetAuthToken(v string) *RepayWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetProductInstanceId(v string) *RepayWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetOrderId(v string) *RepayWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPeriodNum(v int64) *RepayWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetGmtPay(v string) *RepayWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffAmount(v int64) *RepayWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffType(v string) *RepayWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffNo(v string) *RepayWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffBankName(v string) *RepayWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

type RepayWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanResponse) SetReqMsgId(v string) *RepayWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultCode(v string) *RepayWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultMsg(v string) *RepayWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RetryWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanRequest) SetAuthToken(v string) *RetryWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetProductInstanceId(v string) *RetryWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetOrderId(v string) *RetryWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetPeriodNum(v int64) *RetryWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanResponse) SetReqMsgId(v string) *RetryWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultCode(v string) *RetryWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultMsg(v string) *RetryWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmWithholdSignasyncunsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 操作动作
	// 同意：AGREE
	// 拒绝：REFUSE
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true" maxLength:"16" minLength:"1"`
	// 拒绝原因码,商户拒绝时必填。
	// USER_OWE_MONEY：用户账户存在欠费订单
	// USER_IN_SERVICE：用户有进行的订单
	RefuseReasonCode *string `json:"refuse_reason_code,omitempty" xml:"refuse_reason_code,omitempty" maxLength:"16" minLength:"1"`
	// 用户欠款金额，单位为分
	// refuse_reason_code=USER_OWE_MONEY时必填
	UserOweMoney *int64 `json:"user_owe_money,omitempty" xml:"user_owe_money,omitempty" minimum:"1"`
	// 用户进行中的服务
	// refuse_reason_code=USER_IN_SERVICE时必填
	UserInService *string `json:"user_in_service,omitempty" xml:"user_in_service,omitempty" maxLength:"128" minLength:"1"`
}

func (s ConfirmWithholdSignasyncunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignRequest) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetAuthToken(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetProductInstanceId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOrderId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOperate(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.Operate = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetRefuseReasonCode(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.RefuseReasonCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserOweMoney(v int64) *ConfirmWithholdSignasyncunsignRequest {
	s.UserOweMoney = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserInService(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.UserInService = &v
	return s
}

type ConfirmWithholdSignasyncunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmWithholdSignasyncunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignResponse) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetReqMsgId(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultCode(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultMsg(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultMsg = &v
	return s
}

type CreateWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s CreateWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayRequest) SetAuthToken(v string) *CreateWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetProductInstanceId(v string) *CreateWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetOrderId(v string) *CreateWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPeriodNum(v int64) *CreateWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

type CreateWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CreateWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayResponse) SetReqMsgId(v string) *CreateWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultCode(v string) *CreateWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultMsg(v string) *CreateWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetTradeNo(v string) *CreateWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type QueryWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 支付宝支付订单号，当传递此单号时，只会返回当前单据
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"64"`
}

func (s QueryWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayRequest) SetAuthToken(v string) *QueryWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetProductInstanceId(v string) *QueryWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetOrderId(v string) *QueryWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetPeriodNum(v int64) *QueryWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetTradeNo(v string) *QueryWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type QueryWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前支付单
	CurrentOrder *ActivePayOrder `json:"current_order,omitempty" xml:"current_order,omitempty"`
	// 主动支付单列表，当不通过trade_no查询时有值
	Orders []*ActivePayOrder `json:"orders,omitempty" xml:"orders,omitempty" type:"Repeated"`
}

func (s QueryWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayResponse) SetReqMsgId(v string) *QueryWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultCode(v string) *QueryWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultMsg(v string) *QueryWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetCurrentOrder(v *ActivePayOrder) *QueryWithholdActivepayResponse {
	s.CurrentOrder = v
	return s
}

func (s *QueryWithholdActivepayResponse) SetOrders(v []*ActivePayOrder) *QueryWithholdActivepayResponse {
	s.Orders = v
	return s
}

type CancelWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayRequest) SetAuthToken(v string) *CancelWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetProductInstanceId(v string) *CancelWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetOrderId(v string) *CancelWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetPeriodNum(v int64) *CancelWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetTradeNo(v string) *CancelWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type CancelWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayResponse) SetReqMsgId(v string) *CancelWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultCode(v string) *CancelWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultMsg(v string) *CancelWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetTradeNo(v string) *CancelWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type CreateWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 第几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 本次请求的退款金额，单位为分
	// 1234=12.34元
	RefundMoney *int64 `json:"refund_money,omitempty" xml:"refund_money,omitempty" require:"true" minimum:"1"`
	// 退款原因
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty" maxLength:"200"`
}

func (s CreateWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundRequest) SetAuthToken(v string) *CreateWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetProductInstanceId(v string) *CreateWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetOrderId(v string) *CreateWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetPeriodNum(v int64) *CreateWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundRequestNo(v string) *CreateWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundMoney(v int64) *CreateWithholdRefundRequest {
	s.RefundMoney = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundReason(v string) *CreateWithholdRefundRequest {
	s.RefundReason = &v
	return s
}

type CreateWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// ACCEPT : 受理成功
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
}

func (s CreateWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundResponse) SetReqMsgId(v string) *CreateWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultCode(v string) *CreateWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultMsg(v string) *CreateWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundRequestNo(v string) *CreateWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetStatus(v string) *CreateWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundOrderNo(v string) *CreateWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

type QueryWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
}

func (s QueryWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundRequest) SetAuthToken(v string) *QueryWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetProductInstanceId(v string) *QueryWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetOrderId(v string) *QueryWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetPeriodNum(v int64) *QueryWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetRefundRequestNo(v string) *QueryWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

type QueryWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
	// 退款请求状态
	// ● ACCEPT: 受理成功
	// ● PENDING: 需人工介入
	// ● SUCCESS: 成功
	// ● FAILED : 失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 退款失败原因
	RefundErrorMsg *string `json:"refund_error_msg,omitempty" xml:"refund_error_msg,omitempty"`
	// 本笔交易总退款金额，单位为分
	// 12300=123元
	TotalRefundAmount *int64 `json:"total_refund_amount,omitempty" xml:"total_refund_amount,omitempty"`
	// 本次退款申请的实际退款金额，单位为分
	// 12300=123元
	SendBackAmount *int64 `json:"send_back_amount,omitempty" xml:"send_back_amount,omitempty"`
	// 实际退款时间,13位时间戳（毫秒）
	GmtRefundPay *int64 `json:"gmt_refund_pay,omitempty" xml:"gmt_refund_pay,omitempty"`
}

func (s QueryWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundResponse) SetReqMsgId(v string) *QueryWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultCode(v string) *QueryWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultMsg(v string) *QueryWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundRequestNo(v string) *QueryWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundOrderNo(v string) *QueryWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetStatus(v string) *QueryWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundErrorMsg(v string) *QueryWithholdRefundResponse {
	s.RefundErrorMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetTotalRefundAmount(v int64) *QueryWithholdRefundResponse {
	s.TotalRefundAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetSendBackAmount(v int64) *QueryWithholdRefundResponse {
	s.SendBackAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetGmtRefundPay(v int64) *QueryWithholdRefundResponse {
	s.GmtRefundPay = &v
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
				"sdk_version":      tea.String("1.8.95"),
				"_prod_code":       tea.String("ATO"),
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
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplitting(request *SyncFundSplittingRequest) (_result *SyncFundSplittingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.SyncFundSplittingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplittingEx(request *SyncFundSplittingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundSplittingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.splitting.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancial(request *SyncFundOrderfinancialRequest) (_result *SyncFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.SyncFundOrderfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancialEx(request *SyncFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinancial.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontract(request *SyncFundWithholdingcontractRequest) (_result *SyncFundWithholdingcontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.SyncFundWithholdingcontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontractEx(request *SyncFundWithholdingcontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundWithholdingcontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.withholdingcontract.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillment(request *SyncFundOrderfulfillmentRequest) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.SyncFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillmentEx(request *SyncFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillment(request *GetFundOrderfulfillmentRequest) (_result *GetFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.GetFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillmentEx(request *GetFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadFundFlow(request *UploadFundFlowRequest) (_result *UploadFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFundFlowResponse{}
	_body, _err := client.UploadFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadFundFlowEx(request *UploadFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFundFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.fund.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadFundFlowResponse := &UploadFundFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadFundFlowResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetFundFlow(request *GetFundFlowRequest) (_result *GetFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundFlowResponse{}
	_body, _err := client.GetFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetFundFlowEx(request *GetFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseFundFlow(request *RefuseFundFlowRequest) (_result *RefuseFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseFundFlowResponse{}
	_body, _err := client.RefuseFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseFundFlowEx(request *RefuseFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthFundFlow(request *AuthFundFlowRequest) (_result *AuthFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthFundFlowResponse{}
	_body, _err := client.AuthFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthFundFlowEx(request *AuthFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelFundPlan(request *CancelFundPlanRequest) (_result *CancelFundPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelFundPlanResponse{}
	_body, _err := client.CancelFundPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelFundPlanEx(request *CancelFundPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelFundPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelFundPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackFundNotify(request *CallbackFundNotifyRequest) (_result *CallbackFundNotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.CallbackFundNotifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackFundNotifyEx(request *CallbackFundNotifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackFundNotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.notify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncFundMerchantpromise(request *SyncFundMerchantpromiseRequest) (_result *SyncFundMerchantpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundMerchantpromiseResponse{}
	_body, _err := client.SyncFundMerchantpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncFundMerchantpromiseEx(request *SyncFundMerchantpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundMerchantpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundMerchantpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantpromise.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncFundFinanceloanresults(request *SyncFundFinanceloanresultsRequest) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundFinanceloanresultsResponse{}
	_body, _err := client.SyncFundFinanceloanresultsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncFundFinanceloanresultsEx(request *SyncFundFinanceloanresultsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundFinanceloanresultsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.financeloanresults.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetFundUserpromise(request *GetFundUserpromiseRequest) (_result *GetFundUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.GetFundUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetFundUserpromiseEx(request *GetFundUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userpromise.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundUserperformance(request *GetFundUserperformanceRequest) (_result *GetFundUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserperformanceResponse{}
	_body, _err := client.GetFundUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundUserperformanceEx(request *GetFundUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundMerchantperformance(request *GetFundMerchantperformanceRequest) (_result *GetFundMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundMerchantperformanceResponse{}
	_body, _err := client.GetFundMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetFundMerchantperformanceEx(request *GetFundMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetFundOrderfullinfo(request *GetFundOrderfullinfoRequest) (_result *GetFundOrderfullinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.GetFundOrderfullinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetFundOrderfullinfoEx(request *GetFundOrderfullinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfullinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfullinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
 * Summary: 资方合同文件已上传确认接口
 */
func (client *Client) NotifyFundFlow(request *NotifyFundFlowRequest) (_result *NotifyFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyFundFlowResponse{}
	_body, _err := client.NotifyFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
 * Summary: 资方合同文件已上传确认接口
 */
func (client *Client) NotifyFundFlowEx(request *NotifyFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方资产凭证上传，可以是文本或文件
 * Summary: 资方资产凭证上传
 */
func (client *Client) UploadFundCredit(request *UploadFundCreditRequest) (_result *UploadFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFundCreditResponse{}
	_body, _err := client.UploadFundCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方资产凭证上传，可以是文本或文件
 * Summary: 资方资产凭证上传
 */
func (client *Client) UploadFundCreditEx(request *UploadFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方资产凭证查询，需要提供订单号或资产包号
 * Summary: 资方资产凭证查询
 */
func (client *Client) QueryFundCredit(request *QueryFundCreditRequest) (_result *QueryFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFundCreditResponse{}
	_body, _err := client.QueryFundCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方资产凭证查询，需要提供订单号或资产包号
 * Summary: 资方资产凭证查询
 */
func (client *Client) QueryFundCreditEx(request *QueryFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部调用,商品信息获取
 * Summary: 商品信息获取
 */
func (client *Client) GetInnerProduct(request *GetInnerProductRequest) (_result *GetInnerProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerProductResponse{}
	_body, _err := client.GetInnerProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部调用,商品信息获取
 * Summary: 商品信息获取
 */
func (client *Client) GetInnerProductEx(request *GetInnerProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.product.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato内部服务，客户系统不可访问；租户信息获取
 * Summary: 租户信息获取
 */
func (client *Client) GetInnerTenant(request *GetInnerTenantRequest) (_result *GetInnerTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerTenantResponse{}
	_body, _err := client.GetInnerTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato内部服务，客户系统不可访问；租户信息获取
 * Summary: 租户信息获取
 */
func (client *Client) GetInnerTenantEx(request *GetInnerTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.tenant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
 * Summary: 上报整单结算计量信息
 */
func (client *Client) SyncInnerMeterforwholeorder(request *SyncInnerMeterforwholeorderRequest) (_result *SyncInnerMeterforwholeorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerMeterforwholeorderResponse{}
	_body, _err := client.SyncInnerMeterforwholeorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
 * Summary: 上报整单结算计量信息
 */
func (client *Client) SyncInnerMeterforwholeorderEx(request *SyncInnerMeterforwholeorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerMeterforwholeorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerMeterforwholeorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.meterforwholeorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部调用，合同签署计量上报接口
 * Summary: 合同签署计量上报同步接口
 */
func (client *Client) SyncInnerMeterforagsign(request *SyncInnerMeterforagsignRequest) (_result *SyncInnerMeterforagsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerMeterforagsignResponse{}
	_body, _err := client.SyncInnerMeterforagsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部调用，合同签署计量上报接口
 * Summary: 合同签署计量上报同步接口
 */
func (client *Client) SyncInnerMeterforagsignEx(request *SyncInnerMeterforagsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerMeterforagsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerMeterforagsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.meterforagsign.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据租户查询合同模板列表
 * Summary: 查询模板列表
 */
func (client *Client) AllInnerTemplate(request *AllInnerTemplateRequest) (_result *AllInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllInnerTemplateResponse{}
	_body, _err := client.AllInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据租户查询合同模板列表
 * Summary: 查询模板列表
 */
func (client *Client) AllInnerTemplateEx(request *AllInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询合同模板版本列表
 * Summary: 查询魔法库某一模板版本列表
 */
func (client *Client) ListInnerTemplate(request *ListInnerTemplateRequest) (_result *ListInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListInnerTemplateResponse{}
	_body, _err := client.ListInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询合同模板版本列表
 * Summary: 查询魔法库某一模板版本列表
 */
func (client *Client) ListInnerTemplateEx(request *ListInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询指定版本的模板详情
 * Summary: 查询魔法库模板详情
 */
func (client *Client) DetailInnerTemplate(request *DetailInnerTemplateRequest) (_result *DetailInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailInnerTemplateResponse{}
	_body, _err := client.DetailInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据模板code查询指定版本的模板详情
 * Summary: 查询魔法库模板详情
 */
func (client *Client) DetailInnerTemplateEx(request *DetailInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，创建魔法库模板
 * Summary: 创建模板
 */
func (client *Client) CreateInnerTemplate(request *CreateInnerTemplateRequest) (_result *CreateInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerTemplateResponse{}
	_body, _err := client.CreateInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，创建魔法库模板
 * Summary: 创建模板
 */
func (client *Client) CreateInnerTemplateEx(request *CreateInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板
 * Summary: 保存魔法库模板
 */
func (client *Client) SaveInnerTemplate(request *SaveInnerTemplateRequest) (_result *SaveInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveInnerTemplateResponse{}
	_body, _err := client.SaveInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板
 * Summary: 保存魔法库模板
 */
func (client *Client) SaveInnerTemplateEx(request *SaveInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板签署区
 * Summary: 保存魔法库模板签署区
 */
func (client *Client) SaveInnerSignfields(request *SaveInnerSignfieldsRequest) (_result *SaveInnerSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveInnerSignfieldsResponse{}
	_body, _err := client.SaveInnerSignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，保存魔法库模板签署区
 * Summary: 保存魔法库模板签署区
 */
func (client *Client) SaveInnerSignfieldsEx(request *SaveInnerSignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveInnerSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveInnerSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.signfields.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，发布魔法库模板
 * Summary: 发布魔法库模板
 */
func (client *Client) PublishInnerTemplate(request *PublishInnerTemplateRequest) (_result *PublishInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishInnerTemplateResponse{}
	_body, _err := client.PublishInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，发布魔法库模板
 * Summary: 发布魔法库模板
 */
func (client *Client) PublishInnerTemplateEx(request *PublishInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据code预览对应魔法库模板
 * Summary: 预览魔法库模板
 */
func (client *Client) PreviewInnerTemplate(request *PreviewInnerTemplateRequest) (_result *PreviewInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewInnerTemplateResponse{}
	_body, _err := client.PreviewInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据code预览对应魔法库模板
 * Summary: 预览魔法库模板
 */
func (client *Client) PreviewInnerTemplateEx(request *PreviewInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，根据code删除对应魔法库模板
 * Summary: 删除魔法库模板
 */
func (client *Client) DeleteInnerTemplate(request *DeleteInnerTemplateRequest) (_result *DeleteInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteInnerTemplateResponse{}
	_body, _err := client.DeleteInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，根据code删除对应魔法库模板
 * Summary: 删除魔法库模板
 */
func (client *Client) DeleteInnerTemplateEx(request *DeleteInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，复制一个魔法库模板
 * Summary: 复制魔法库模板
 */
func (client *Client) CloneInnerTemplate(request *CloneInnerTemplateRequest) (_result *CloneInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloneInnerTemplateResponse{}
	_body, _err := client.CloneInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，复制一个魔法库模板
 * Summary: 复制魔法库模板
 */
func (client *Client) CloneInnerTemplateEx(request *CloneInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloneInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloneInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.clone"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato文件上传
 * Summary: ato文件上传
 */
func (client *Client) UploadInnerFile(request *UploadInnerFileRequest) (_result *UploadInnerFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadInnerFileResponse{}
	_body, _err := client.UploadInnerFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato文件上传
 * Summary: ato文件上传
 */
func (client *Client) UploadInnerFileEx(request *UploadInnerFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadInnerFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadInnerFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ato文件下载
 * Summary: ato文件下载
 */
func (client *Client) DownloadInnerFile(request *DownloadInnerFileRequest) (_result *DownloadInnerFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadInnerFileResponse{}
	_body, _err := client.DownloadInnerFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ato文件下载
 * Summary: ato文件下载
 */
func (client *Client) DownloadInnerFileEx(request *DownloadInnerFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadInnerFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadInnerFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.file.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取 webofficeURL（透传）
 * Summary: 获取 webofficeURL
 */
func (client *Client) GetInnerTemplateofficeurl(request *GetInnerTemplateofficeurlRequest) (_result *GetInnerTemplateofficeurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInnerTemplateofficeurlResponse{}
	_body, _err := client.GetInnerTemplateofficeurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取 webofficeURL（透传）
 * Summary: 获取 webofficeURL
 */
func (client *Client) GetInnerTemplateofficeurlEx(request *GetInnerTemplateofficeurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInnerTemplateofficeurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInnerTemplateofficeurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateofficeurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 魔法库控制台刷新token
 * Summary: 刷新token
 */
func (client *Client) RefreshInnerTemplatetoken(request *RefreshInnerTemplatetokenRequest) (_result *RefreshInnerTemplatetokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefreshInnerTemplatetokenResponse{}
	_body, _err := client.RefreshInnerTemplatetokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 魔法库控制台刷新token
 * Summary: 刷新token
 */
func (client *Client) RefreshInnerTemplatetokenEx(request *RefreshInnerTemplatetokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefreshInnerTemplatetokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefreshInnerTemplatetokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatetoken.refresh"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建文本域（组件）
 * Summary: 创建文本域
 */
func (client *Client) CreateInnerTemplatetextarea(request *CreateInnerTemplatetextareaRequest) (_result *CreateInnerTemplatetextareaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerTemplatetextareaResponse{}
	_body, _err := client.CreateInnerTemplatetextareaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建文本域（组件）
 * Summary: 创建文本域
 */
func (client *Client) CreateInnerTemplatetextareaEx(request *CreateInnerTemplatetextareaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerTemplatetextareaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerTemplatetextareaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatetextarea.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取模板的图片列表
 * Summary: 获取模板的图片列表
 */
func (client *Client) QueryInnerTemplateimage(request *QueryInnerTemplateimageRequest) (_result *QueryInnerTemplateimageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateimageResponse{}
	_body, _err := client.QueryInnerTemplateimageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取模板的图片列表
 * Summary: 获取模板的图片列表
 */
func (client *Client) QueryInnerTemplateimageEx(request *QueryInnerTemplateimageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateimageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateimageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateimage.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存/编辑分账关系信息
 * Summary: 保存/编辑分账关系信息
 */
func (client *Client) CreateInnerFunddividerelation(request *CreateInnerFunddividerelationRequest) (_result *CreateInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerFunddividerelationResponse{}
	_body, _err := client.CreateInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存/编辑分账关系信息
 * Summary: 保存/编辑分账关系信息
 */
func (client *Client) CreateInnerFunddividerelationEx(request *CreateInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交分账关系信息
 * Summary: 提交分账关系信息
 */
func (client *Client) SubmitInnerFunddividerelation(request *SubmitInnerFunddividerelationRequest) (_result *SubmitInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerFunddividerelationResponse{}
	_body, _err := client.SubmitInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交分账关系信息
 * Summary: 提交分账关系信息
 */
func (client *Client) SubmitInnerFunddividerelationEx(request *SubmitInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分账关系信息
 * Summary: 查询分账关系信息
 */
func (client *Client) QueryInnerFunddividerelation(request *QueryInnerFunddividerelationRequest) (_result *QueryInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerFunddividerelationResponse{}
	_body, _err := client.QueryInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分账关系信息
 * Summary: 查询分账关系信息
 */
func (client *Client) QueryInnerFunddividerelationEx(request *QueryInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询分账关系分页列表
 * Summary: 查询分账关系分页列表
 */
func (client *Client) PagequeryInnerFunddividerelation(request *PagequeryInnerFunddividerelationRequest) (_result *PagequeryInnerFunddividerelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerFunddividerelationResponse{}
	_body, _err := client.PagequeryInnerFunddividerelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询分账关系分页列表
 * Summary: 查询分账关系分页列表
 */
func (client *Client) PagequeryInnerFunddividerelationEx(request *PagequeryInnerFunddividerelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerFunddividerelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerFunddividerelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.funddividerelation.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存租户签约信息
 * Summary: 保存租户签约信息
 */
func (client *Client) CreateInnerMerchantagreement(request *CreateInnerMerchantagreementRequest) (_result *CreateInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerMerchantagreementResponse{}
	_body, _err := client.CreateInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存租户签约信息
 * Summary: 保存租户签约信息
 */
func (client *Client) CreateInnerMerchantagreementEx(request *CreateInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户签约信息
 * Summary: 查询租户签约信息
 */
func (client *Client) QueryInnerMerchantagreement(request *QueryInnerMerchantagreementRequest) (_result *QueryInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerMerchantagreementResponse{}
	_body, _err := client.QueryInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户签约信息
 * Summary: 查询租户签约信息
 */
func (client *Client) QueryInnerMerchantagreementEx(request *QueryInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户签约协议分页列表
 * Summary: 查询租户签约协议分页列表
 */
func (client *Client) PagequeryInnerMerchantagreement(request *PagequeryInnerMerchantagreementRequest) (_result *PagequeryInnerMerchantagreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerMerchantagreementResponse{}
	_body, _err := client.PagequeryInnerMerchantagreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户签约协议分页列表
 * Summary: 查询租户签约协议分页列表
 */
func (client *Client) PagequeryInnerMerchantagreementEx(request *PagequeryInnerMerchantagreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerMerchantagreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerMerchantagreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagreement.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存/编辑进件信息
 * Summary: 保存/编辑进件信息
 */
func (client *Client) CreateInnerMerchantpayexpand(request *CreateInnerMerchantpayexpandRequest) (_result *CreateInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateInnerMerchantpayexpandResponse{}
	_body, _err := client.CreateInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存/编辑进件信息
 * Summary: 保存/编辑进件信息
 */
func (client *Client) CreateInnerMerchantpayexpandEx(request *CreateInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交进件信息
 * Summary: 提交进件信息
 */
func (client *Client) SubmitInnerMerchantpayexpand(request *SubmitInnerMerchantpayexpandRequest) (_result *SubmitInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInnerMerchantpayexpandResponse{}
	_body, _err := client.SubmitInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交进件信息
 * Summary: 提交进件信息
 */
func (client *Client) SubmitInnerMerchantpayexpandEx(request *SubmitInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询进件信息
 * Summary: 查询进件信息
 */
func (client *Client) QueryInnerMerchantpayexpand(request *QueryInnerMerchantpayexpandRequest) (_result *QueryInnerMerchantpayexpandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerMerchantpayexpandResponse{}
	_body, _err := client.QueryInnerMerchantpayexpandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询进件信息
 * Summary: 查询进件信息
 */
func (client *Client) QueryInnerMerchantpayexpandEx(request *QueryInnerMerchantpayexpandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerMerchantpayexpandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerMerchantpayexpandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantpayexpand.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代理商户分页列表-间连商户使用
 * Summary: 查询代理商户分页列表-间连商户使用
 */
func (client *Client) PagequeryInnerMerchantagent(request *PagequeryInnerMerchantagentRequest) (_result *PagequeryInnerMerchantagentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerMerchantagentResponse{}
	_body, _err := client.PagequeryInnerMerchantagentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代理商户分页列表-间连商户使用
 * Summary: 查询代理商户分页列表-间连商户使用
 */
func (client *Client) PagequeryInnerMerchantagentEx(request *PagequeryInnerMerchantagentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerMerchantagentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerMerchantagentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.merchantagent.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拷贝模板文件，可用于保存模板的入参
 * Summary: 拷贝模板文件
 */
func (client *Client) CloneInnerTemplatefileaddress(request *CloneInnerTemplatefileaddressRequest) (_result *CloneInnerTemplatefileaddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloneInnerTemplatefileaddressResponse{}
	_body, _err := client.CloneInnerTemplatefileaddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拷贝模板文件，可用于保存模板的入参
 * Summary: 拷贝模板文件
 */
func (client *Client) CloneInnerTemplatefileaddressEx(request *CloneInnerTemplatefileaddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloneInnerTemplatefileaddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloneInnerTemplatefileaddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templatefileaddress.clone"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署区
 * Summary: 查询签署区
 */
func (client *Client) QueryInnerSignfields(request *QueryInnerSignfieldsRequest) (_result *QueryInnerSignfieldsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerSignfieldsResponse{}
	_body, _err := client.QueryInnerSignfieldsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署区
 * Summary: 查询签署区
 */
func (client *Client) QueryInnerSignfieldsEx(request *QueryInnerSignfieldsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerSignfieldsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerSignfieldsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.signfields.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步已发布的模板
 * Summary: 同步已发布的模板
 */
func (client *Client) SyncInnerTemplate(request *SyncInnerTemplateRequest) (_result *SyncInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncInnerTemplateResponse{}
	_body, _err := client.SyncInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步已发布的模板
 * Summary: 同步已发布的模板
 */
func (client *Client) SyncInnerTemplateEx(request *SyncInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新魔法库模板基本信息
 * Summary: 更新魔法库模板基本信息
 */
func (client *Client) UpdateInnerTemplate(request *UpdateInnerTemplateRequest) (_result *UpdateInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInnerTemplateResponse{}
	_body, _err := client.UpdateInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新魔法库模板基本信息
 * Summary: 更新魔法库模板基本信息
 */
func (client *Client) UpdateInnerTemplateEx(request *UpdateInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模板code更新模板的基本信息，比如模板名称等
 * Summary: 查询模板的基本信息
 */
func (client *Client) QueryInnerTemplate(request *QueryInnerTemplateRequest) (_result *QueryInnerTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateResponse{}
	_body, _err := client.QueryInnerTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模板code更新模板的基本信息，比如模板名称等
 * Summary: 查询模板的基本信息
 */
func (client *Client) QueryInnerTemplateEx(request *QueryInnerTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取模板关联的元素列表信息，包括组件信息
 * Summary: 获取模板关联的元素列表信息
 */
func (client *Client) QueryInnerTemplateelementlink(request *QueryInnerTemplateelementlinkRequest) (_result *QueryInnerTemplateelementlinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateelementlinkResponse{}
	_body, _err := client.QueryInnerTemplateelementlinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取模板关联的元素列表信息，包括组件信息
 * Summary: 获取模板关联的元素列表信息
 */
func (client *Client) QueryInnerTemplateelementlinkEx(request *QueryInnerTemplateelementlinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateelementlinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateelementlinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateelementlink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
 * Summary: 查询模板的版本详情
 */
func (client *Client) QueryInnerTemplateversion(request *QueryInnerTemplateversionRequest) (_result *QueryInnerTemplateversionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInnerTemplateversionResponse{}
	_body, _err := client.QueryInnerTemplateversionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
 * Summary: 查询模板的版本详情
 */
func (client *Client) QueryInnerTemplateversionEx(request *QueryInnerTemplateversionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInnerTemplateversionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInnerTemplateversionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.templateversion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单消息查询
 * Summary: 订单消息查询
 */
func (client *Client) PagequeryInnerOrdermsg(request *PagequeryInnerOrdermsgRequest) (_result *PagequeryInnerOrdermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryInnerOrdermsgResponse{}
	_body, _err := client.PagequeryInnerOrdermsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单消息查询
 * Summary: 订单消息查询
 */
func (client *Client) PagequeryInnerOrdermsgEx(request *PagequeryInnerOrdermsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryInnerOrdermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryInnerOrdermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.ordermsg.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单消息重试
 * Summary: 订单消息重试
 */
func (client *Client) RetryInnerOrdermsg(request *RetryInnerOrdermsgRequest) (_result *RetryInnerOrdermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryInnerOrdermsgResponse{}
	_body, _err := client.RetryInnerOrdermsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单消息重试
 * Summary: 订单消息重试
 */
func (client *Client) RetryInnerOrdermsgEx(request *RetryInnerOrdermsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryInnerOrdermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryInnerOrdermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.inner.ordermsg.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻
 * Summary: 商户入驻
 */
func (client *Client) RegisterMerchantexpandMerchant(request *RegisterMerchantexpandMerchantRequest) (_result *RegisterMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterMerchantexpandMerchantResponse{}
	_body, _err := client.RegisterMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻
 * Summary: 商户入驻
 */
func (client *Client) RegisterMerchantexpandMerchantEx(request *RegisterMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取临时上传文件链接
 * Summary: 获取临时上传文件链接
 */
func (client *Client) UploadMerchantexpandFile(request *UploadMerchantexpandFileRequest) (_result *UploadMerchantexpandFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadMerchantexpandFileResponse{}
	_body, _err := client.UploadMerchantexpandFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取临时上传文件链接
 * Summary: 获取临时上传文件链接
 */
func (client *Client) UploadMerchantexpandFileEx(request *UploadMerchantexpandFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadMerchantexpandFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadMerchantexpandFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户入驻查询
 * Summary: 商户入驻查询
 */
func (client *Client) QueryMerchantexpandMerchant(request *QueryMerchantexpandMerchantRequest) (_result *QueryMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantexpandMerchantResponse{}
	_body, _err := client.QueryMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户入驻查询
 * Summary: 商户入驻查询
 */
func (client *Client) QueryMerchantexpandMerchantEx(request *QueryMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商家信息修改
 * Summary: 商家信息修改
 */
func (client *Client) UpdateMerchantexpandMerchant(request *UpdateMerchantexpandMerchantRequest) (_result *UpdateMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMerchantexpandMerchantResponse{}
	_body, _err := client.UpdateMerchantexpandMerchantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商家信息修改
 * Summary: 商家信息修改
 */
func (client *Client) UpdateMerchantexpandMerchantEx(request *UpdateMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateRealpersonFacevrf(request *CreateRealpersonFacevrfRequest) (_result *CreateRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealpersonFacevrfResponse{}
	_body, _err := client.CreateRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateRealpersonFacevrfEx(request *CreateRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryRealpersonFacevrf(request *QueryRealpersonFacevrfRequest) (_result *QueryRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRealpersonFacevrfResponse{}
	_body, _err := client.QueryRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryRealpersonFacevrfEx(request *QueryRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起风控分析，获取风险分
 * Summary: 发起风控分析，获取风险分
 */
func (client *Client) QueryRisk(request *QueryRiskRequest) (_result *QueryRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskResponse{}
	_body, _err := client.QueryRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起风控分析，获取风险分
 * Summary: 发起风控分析，获取风险分
 */
func (client *Client) QueryRiskEx(request *QueryRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllSignTemplate(request *AllSignTemplateRequest) (_result *AllSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllSignTemplateResponse{}
	_body, _err := client.AllSignTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllSignTemplateEx(request *AllSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitSignFlow(request *SubmitSignFlowRequest) (_result *SubmitSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitSignFlowResponse{}
	_body, _err := client.SubmitSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitSignFlowEx(request *SubmitSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetSignFlow(request *GetSignFlowRequest) (_result *GetSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSignFlowResponse{}
	_body, _err := client.GetSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetSignFlowEx(request *GetSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthSignFlow(request *AuthSignFlowRequest) (_result *AuthSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthSignFlowResponse{}
	_body, _err := client.AuthSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthSignFlowEx(request *AuthSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitFrontSign(request *SubmitFrontSignRequest) (_result *SubmitFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.SubmitFrontSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitFrontSignEx(request *SubmitFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadSignFlow(request *UploadSignFlowRequest) (_result *UploadSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignFlowResponse{}
	_body, _err := client.UploadSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadSignFlowEx(request *UploadSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.sign.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadSignFlowResponse := &UploadSignFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadSignFlowResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户合同模板上传接口
 * Summary: 商户合同模板上传
 */
func (client *Client) UploadSignTemplate(request *UploadSignTemplateRequest) (_result *UploadSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignTemplateResponse{}
	_body, _err := client.UploadSignTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户合同模板上传接口
 * Summary: 商户合同模板上传
 */
func (client *Client) UploadSignTemplateEx(request *UploadSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignTemplateResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.sign.template.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadSignTemplateResponse := &UploadSignTemplateResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadSignTemplateResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户资产凭证上传，可以是文本或文件
 * Summary: 商户资产凭证上传
 */
func (client *Client) UploadSignCredit(request *UploadSignCreditRequest) (_result *UploadSignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignCreditResponse{}
	_body, _err := client.UploadSignCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户资产凭证上传，可以是文本或文件
 * Summary: 商户资产凭证上传
 */
func (client *Client) UploadSignCreditEx(request *UploadSignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户资产凭证查询，需要提供订单号或资产包号
 * Summary: 商户资产凭证查询
 */
func (client *Client) QuerySignCredit(request *QuerySignCreditRequest) (_result *QuerySignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySignCreditResponse{}
	_body, _err := client.QuerySignCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户资产凭证查询，需要提供订单号或资产包号
 * Summary: 商户资产凭证查询
 */
func (client *Client) QuerySignCreditEx(request *QuerySignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 撤销签署流程
 * Summary: 撤销签署流程
 */
func (client *Client) CancelSignFlow(request *CancelSignFlowRequest) (_result *CancelSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelSignFlowResponse{}
	_body, _err := client.CancelSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 撤销签署流程
 * Summary: 撤销签署流程
 */
func (client *Client) CancelSignFlowEx(request *CancelSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncTrade(request *SyncTradeRequest) (_result *SyncTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeResponse{}
	_body, _err := client.SyncTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncTradeEx(request *SyncTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetTrade(request *GetTradeRequest) (_result *GetTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeResponse{}
	_body, _err := client.GetTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetTradeEx(request *GetTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncFrontTrade(request *SyncFrontTradeRequest) (_result *SyncFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.SyncFrontTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncFrontTradeEx(request *SyncFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncTradeFinanceloanapply(request *SyncTradeFinanceloanapplyRequest) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeFinanceloanapplyResponse{}
	_body, _err := client.SyncTradeFinanceloanapplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncTradeFinanceloanapplyEx(request *SyncTradeFinanceloanapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeFinanceloanapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeloanapply.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetTradeMerchantfulfillment(request *GetTradeMerchantfulfillmentRequest) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.GetTradeMerchantfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetTradeMerchantfulfillmentEx(request *GetTradeMerchantfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetTradeUserperformance(request *GetTradeUserperformanceRequest) (_result *GetTradeUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeUserperformanceResponse{}
	_body, _err := client.GetTradeUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetTradeUserperformanceEx(request *GetTradeUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetTradeMerchantperformance(request *GetTradeMerchantperformanceRequest) (_result *GetTradeMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.GetTradeMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetTradeMerchantperformanceEx(request *GetTradeMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户调用，修改订单的用户还款承诺
 * Summary: 用户还款承诺信息修改
 */
func (client *Client) UpdateTradeUserpromise(request *UpdateTradeUserpromiseRequest) (_result *UpdateTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTradeUserpromiseResponse{}
	_body, _err := client.UpdateTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户调用，修改订单的用户还款承诺
 * Summary: 用户还款承诺信息修改
 */
func (client *Client) UpdateTradeUserpromiseEx(request *UpdateTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 前置签署间联模式订单进件
 * Summary: 前置签署间联模式订单进件
 */
func (client *Client) SyncFrontIndirectorder(request *SyncFrontIndirectorderRequest) (_result *SyncFrontIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFrontIndirectorderResponse{}
	_body, _err := client.SyncFrontIndirectorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 前置签署间联模式订单进件
 * Summary: 前置签署间联模式订单进件
 */
func (client *Client) SyncFrontIndirectorderEx(request *SyncFrontIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFrontIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFrontIndirectorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.indirectorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 间联模式-后置模式订单进件
 * Summary: 间联模式-后置模式订单进件
 */
func (client *Client) SyncTradeIndirectorder(request *SyncTradeIndirectorderRequest) (_result *SyncTradeIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeIndirectorderResponse{}
	_body, _err := client.SyncTradeIndirectorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 间联模式-后置模式订单进件
 * Summary: 间联模式-后置模式订单进件
 */
func (client *Client) SyncTradeIndirectorderEx(request *SyncTradeIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeIndirectorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.indirectorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约创建
 * Summary: 代扣签约
 */
func (client *Client) CreateWithholdSign(request *CreateWithholdSignRequest) (_result *CreateWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdSignResponse{}
	_body, _err := client.CreateWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约创建
 * Summary: 代扣签约
 */
func (client *Client) CreateWithholdSignEx(request *CreateWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryWithholdSign(request *QueryWithholdSignRequest) (_result *QueryWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.QueryWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryWithholdSignEx(request *QueryWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindWithholdSign(request *UnbindWithholdSignRequest) (_result *UnbindWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindWithholdSignResponse{}
	_body, _err := client.UnbindWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindWithholdSignEx(request *UnbindWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelWithholdPlan(request *CancelWithholdPlanRequest) (_result *CancelWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdPlanResponse{}
	_body, _err := client.CancelWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelWithholdPlanEx(request *CancelWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
* Description: 重要说明：
   1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
* Summary: 单期代扣取消
*/
func (client *Client) RepayWithholdPlan(request *RepayWithholdPlanRequest) (_result *RepayWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.RepayWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
* Description: 重要说明：
   1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
* Summary: 单期代扣取消
*/
func (client *Client) RepayWithholdPlanEx(request *RepayWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryWithholdPlan(request *RetryWithholdPlanRequest) (_result *RetryWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryWithholdPlanResponse{}
	_body, _err := client.RetryWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryWithholdPlanEx(request *RetryWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmWithholdSignasyncunsign(request *ConfirmWithholdSignasyncunsignRequest) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.ConfirmWithholdSignasyncunsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmWithholdSignasyncunsignEx(request *ConfirmWithholdSignasyncunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.signasyncunsign.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateWithholdActivepay(request *CreateWithholdActivepayRequest) (_result *CreateWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdActivepayResponse{}
	_body, _err := client.CreateWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateWithholdActivepayEx(request *CreateWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryWithholdActivepay(request *QueryWithholdActivepayRequest) (_result *QueryWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdActivepayResponse{}
	_body, _err := client.QueryWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryWithholdActivepayEx(request *QueryWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelWithholdActivepay(request *CancelWithholdActivepayRequest) (_result *CancelWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.CancelWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelWithholdActivepayEx(request *CancelWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefund(request *CreateWithholdRefundRequest) (_result *CreateWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.CreateWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefundEx(request *CreateWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefund(request *QueryWithholdRefundRequest) (_result *QueryWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.QueryWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefundEx(request *QueryWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
