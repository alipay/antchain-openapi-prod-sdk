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

// 站点信息
type SiteInfo struct {
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 站点名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	//
	// 截图照片
	ScreenshotImage *string `json:"screenshot_image,omitempty" xml:"screenshot_image,omitempty"`
	// 站点地址
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty"`
	// 站点类型
	// 网站: 01
	// APP: 02
	// 服务窗: 03
	// 公众号: 04
	// 其他: 05
	// 支付宝小程序: 06
	// 手机网站/H5: 07
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty"`
}

func (s SiteInfo) String() string {
	return tea.Prettify(s)
}

func (s SiteInfo) GoString() string {
	return s.String()
}

func (s *SiteInfo) SetTinyAppId(v string) *SiteInfo {
	s.TinyAppId = &v
	return s
}

func (s *SiteInfo) SetSiteName(v string) *SiteInfo {
	s.SiteName = &v
	return s
}

func (s *SiteInfo) SetScreenshotImage(v string) *SiteInfo {
	s.ScreenshotImage = &v
	return s
}

func (s *SiteInfo) SetSiteUrl(v string) *SiteInfo {
	s.SiteUrl = &v
	return s
}

func (s *SiteInfo) SetSiteType(v string) *SiteInfo {
	s.SiteType = &v
	return s
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

// 经营分账收入模型
type OperationDivideTransInModel struct {
	// 分账收入方支付宝用户id, 支付宝2088id
	TransInUserId *string `json:"trans_in_user_id,omitempty" xml:"trans_in_user_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 分账金额，单位为分
	//
	DivideAmount *int64 `json:"divide_amount,omitempty" xml:"divide_amount,omitempty" require:"true" minimum:"1"`
	// 分账描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" maxLength:"64" minLength:"1"`
}

func (s OperationDivideTransInModel) String() string {
	return tea.Prettify(s)
}

func (s OperationDivideTransInModel) GoString() string {
	return s.String()
}

func (s *OperationDivideTransInModel) SetTransInUserId(v string) *OperationDivideTransInModel {
	s.TransInUserId = &v
	return s
}

func (s *OperationDivideTransInModel) SetDivideAmount(v int64) *OperationDivideTransInModel {
	s.DivideAmount = &v
	return s
}

func (s *OperationDivideTransInModel) SetDesc(v string) *OperationDivideTransInModel {
	s.Desc = &v
	return s
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
	// 站点信息
	SiteInfo []*SiteInfo `json:"site_info,omitempty" xml:"site_info,omitempty" type:"Repeated"`
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

func (s *ApplicationInfo) SetSiteInfo(v []*SiteInfo) *ApplicationInfo {
	s.SiteInfo = v
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
	// 商户类型： 01：企业；07：个体工商户 默认不填为01
	MerchantType *string `json:"merchant_type,omitempty" xml:"merchant_type,omitempty"`
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

func (s *CompanyInfoUpdate) SetMerchantType(v string) *CompanyInfoUpdate {
	s.MerchantType = &v
	return s
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

type SyncAntchainAtoTradeRequest struct {
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

func (s SyncAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeRequest) SetAuthToken(v string) *SyncAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetBizContent(v string) *SyncAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetType(v string) *SyncAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type SyncAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultCode(v string) *SyncAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultMsg(v string) *SyncAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResponseData(v string) *SyncAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeRequest) SetAuthToken(v string) *GetAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetBizContent(v string) *GetAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetType(v string) *GetAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type GetAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeResponse) SetReqMsgId(v string) *GetAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultCode(v string) *GetAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultMsg(v string) *GetAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResponseData(v string) *GetAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfRequest struct {
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

func (s CreateAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetSolutionType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.SolutionType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertName(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertNo(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetFaceReserveStrategy(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.FaceReserveStrategy = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfResponse struct {
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

func (s CreateAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetRealPersonVerificationCode(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.RealPersonVerificationCode = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetWebUrl(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.WebUrl = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信实人认证的唯一标识
	RealPersonVerificationCode *string `json:"real_person_verification_code,omitempty" xml:"real_person_verification_code,omitempty" require:"true"`
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetRealPersonVerificationCode(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.RealPersonVerificationCode = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfResponse struct {
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

func (s QueryAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetCertifyState(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.CertifyState = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetAttackFlag(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.AttackFlag = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetAlivePhoto(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.AlivePhoto = &v
	return s
}

type AllAntchainAtoSignTemplateRequest struct {
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

func (s AllAntchainAtoSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateRequest) SetAuthToken(v string) *AllAntchainAtoSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetProductInstanceId(v string) *AllAntchainAtoSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetContractType(v string) *AllAntchainAtoSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetMerchantId(v string) *AllAntchainAtoSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetFundType(v string) *AllAntchainAtoSignTemplateRequest {
	s.FundType = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetFundId(v string) *AllAntchainAtoSignTemplateRequest {
	s.FundId = &v
	return s
}

type AllAntchainAtoSignTemplateResponse struct {
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

func (s AllAntchainAtoSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateResponse) SetReqMsgId(v string) *AllAntchainAtoSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultCode(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultMsg(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetTemplateList(v string) *AllAntchainAtoSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitAntchainAtoSignFlowRequest struct {
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
	// 支付宝用户 open_id
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"64" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
}

func (s SubmitAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAuthToken(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetOrderId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserMobile(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserEmail(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignValidity(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetBusinessScene(v string) *SubmitAntchainAtoSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetTemplateList(v string) *SubmitAntchainAtoSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAlipayUserId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantTag(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantSealId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetThirdSigner(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserOpenId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserOpenId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantAppId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantAppId = &v
	return s
}

type SubmitAntchainAtoSignFlowResponse struct {
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

func (s SubmitAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowResponse) SetReqMsgId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultCode(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultMsg(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetSignNo(v string) *SubmitAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetFlowId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetAccountId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetSignInfo(v string) *SubmitAntchainAtoSignFlowResponse {
	s.SignInfo = &v
	return s
}

type GetAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowRequest) SetAuthToken(v string) *GetAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *GetAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetSignNo(v string) *GetAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetAntchainAtoSignFlowResponse struct {
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
	// 发起人账户id
	InitiatorAccountId *string `json:"initiator_account_id,omitempty" xml:"initiator_account_id,omitempty"`
}

func (s GetAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowResponse) SetReqMsgId(v string) *GetAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultCode(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultMsg(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetSignNo(v string) *GetAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetOrderId(v string) *GetAntchainAtoSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAccountId(v string) *GetAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetStatus(v string) *GetAntchainAtoSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetFlowId(v string) *GetAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetDocList(v string) *GetAntchainAtoSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetBusinessScene(v string) *GetAntchainAtoSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAlipayUserId(v string) *GetAntchainAtoSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetSignInfo(v string) *GetAntchainAtoSignFlowResponse {
	s.SignInfo = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetInitiatorAccountId(v string) *GetAntchainAtoSignFlowResponse {
	s.InitiatorAccountId = &v
	return s
}

type CreateAntchainAtoWithholdSignRequest struct {
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
	// 支付宝用户 open_id，非必填
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"128" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
}

func (s CreateAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetOrderId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayUserId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetReturnUrl(v string) *CreateAntchainAtoWithholdSignRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetUserOpenId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.UserOpenId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetMerchantAppId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.MerchantAppId = &v
	return s
}

type CreateAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
	// 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
	SignStrType *string `json:"sign_str_type,omitempty" xml:"sign_str_type,omitempty"`
}

func (s CreateAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultCode(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetSignStr(v string) *CreateAntchainAtoWithholdSignResponse {
	s.SignStr = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetSignStrType(v string) *CreateAntchainAtoWithholdSignResponse {
	s.SignStrType = &v
	return s
}

type QueryAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetOrderId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryAntchainAtoWithholdSignResponse struct {
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

func (s QueryAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultCode(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetStatus(v string) *QueryAntchainAtoWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetSignTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetValidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetInvalidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetAgreementNo(v string) *QueryAntchainAtoWithholdSignResponse {
	s.AgreementNo = &v
	return s
}

type AuthAntchainAtoSignFlowRequest struct {
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

func (s AuthAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowRequest) SetAuthToken(v string) *AuthAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *AuthAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetSignNo(v string) *AuthAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetTag(v string) *AuthAntchainAtoSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetBizFlowId(v string) *AuthAntchainAtoSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetAccountId(v string) *AuthAntchainAtoSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowResponse) SetReqMsgId(v string) *AuthAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultCode(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultMsg(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetSignFieldIds(v string) *AuthAntchainAtoSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type UnbindAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetAuthToken(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetOrderId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultCode(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultMsg(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelAntchainAtoWithholdPlanRequest struct {
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

func (s CancelAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetOrderId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetCancelReason(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultCode(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayAntchainAtoWithholdPlanRequest struct {
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

func (s RepayAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetGmtPay(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffAmount(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffType(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffNo(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffBankName(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

type RepayAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type SubmitAntchainAtoFrontSignRequest struct {
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
	// 用户在支付宝开放平台下应用的 open_id
	UserOpenId *string `json:"user_open_id,omitempty" xml:"user_open_id,omitempty" maxLength:"64" minLength:"16"`
	// 商户支付宝应用 id
	MerchantAppId *string `json:"merchant_app_id,omitempty" xml:"merchant_app_id,omitempty" maxLength:"32"`
}

func (s SubmitAntchainAtoFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAuthToken(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetProductInstanceId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetOrderId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserMobile(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserEmail(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignValidity(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetBusinessScene(v string) *SubmitAntchainAtoFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetTemplateList(v string) *SubmitAntchainAtoFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAlipayUserId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantTag(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantSealId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetThirdSigner(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserOpenId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserOpenId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantAppId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantAppId = &v
	return s
}

type SubmitAntchainAtoFrontSignResponse struct {
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

func (s SubmitAntchainAtoFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignResponse) SetReqMsgId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultCode(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultMsg(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetSignNo(v string) *SubmitAntchainAtoFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetFlowId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetAccountId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetSignInfo(v string) *SubmitAntchainAtoFrontSignResponse {
	s.SignInfo = &v
	return s
}

type SyncAntchainAtoFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncAntchainAtoFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeRequest) SetAuthToken(v string) *SyncAntchainAtoFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetType(v string) *SyncAntchainAtoFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetBizContent(v string) *SyncAntchainAtoFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultCode(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultMsg(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResponseData(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResponseData = &v
	return s
}

type RetryAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RetryAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmAntchainAtoWithholdSignasyncunsignRequest struct {
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

func (s ConfirmAntchainAtoWithholdSignasyncunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignRequest) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetAuthToken(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetProductInstanceId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetOrderId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetOperate(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.Operate = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetRefuseReasonCode(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.RefuseReasonCode = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetUserOweMoney(v int64) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.UserOweMoney = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetUserInService(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.UserInService = &v
	return s
}

type ConfirmAntchainAtoWithholdSignasyncunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignResponse) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetReqMsgId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetResultCode(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetResultMsg(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ResultMsg = &v
	return s
}

type UploadAntchainAtoFundFlowRequest struct {
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

func (s UploadAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundFlowRequest) SetAuthToken(v string) *UploadAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *UploadAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetMerchantId(v string) *UploadAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetOrderId(v string) *UploadAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetSignNo(v string) *UploadAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileItemNo(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileObject(v io.Reader) *UploadAntchainAtoFundFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileObjectName(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileId(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFundId(v string) *UploadAntchainAtoFundFlowRequest {
	s.FundId = &v
	return s
}

type UploadAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundFlowResponse) SetReqMsgId(v string) *UploadAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowResponse) SetResultCode(v string) *UploadAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoFundFlowResponse) SetResultMsg(v string) *UploadAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetAntchainAtoFundFlowRequest struct {
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

func (s GetAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundFlowRequest) SetAuthToken(v string) *GetAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *GetAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetMerchantId(v string) *GetAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetOrderId(v string) *GetAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetContractType(v string) *GetAntchainAtoFundFlowRequest {
	s.ContractType = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetFundId(v string) *GetAntchainAtoFundFlowRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundFlowResponse struct {
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

func (s GetAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundFlowResponse) SetReqMsgId(v string) *GetAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetResultCode(v string) *GetAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetResultMsg(v string) *GetAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetOrderId(v string) *GetAntchainAtoFundFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetContractList(v string) *GetAntchainAtoFundFlowResponse {
	s.ContractList = &v
	return s
}

type RefuseAntchainAtoFundFlowRequest struct {
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

func (s RefuseAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *RefuseAntchainAtoFundFlowRequest) SetAuthToken(v string) *RefuseAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetMerchantId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetOrderId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetSignNo(v string) *RefuseAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetSignReason(v string) *RefuseAntchainAtoFundFlowRequest {
	s.SignReason = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetFundId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.FundId = &v
	return s
}

type RefuseAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *RefuseAntchainAtoFundFlowResponse) SetReqMsgId(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowResponse) SetResultCode(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowResponse) SetResultMsg(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type AuthAntchainAtoFundFlowRequest struct {
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

func (s AuthAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoFundFlowRequest) SetAuthToken(v string) *AuthAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *AuthAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetMerchantId(v string) *AuthAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetOrderId(v string) *AuthAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetSignNo(v string) *AuthAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetTag(v string) *AuthAntchainAtoFundFlowRequest {
	s.Tag = &v
	return s
}

type AuthAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoFundFlowResponse) SetReqMsgId(v string) *AuthAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetResultCode(v string) *AuthAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetResultMsg(v string) *AuthAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetSignFieldIds(v string) *AuthAntchainAtoFundFlowResponse {
	s.SignFieldIds = &v
	return s
}

type CreateAntchainAtoWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期,当支付类型为PERFORMANCE或为空必填
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64" minLength:"1"`
	// 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" maxLength:"64" minLength:"1"`
	// 支付金额，单位为分
	PayAmount *int64 `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" minimum:"1"`
	// 经营分账标识Y/N
	// 当pay_type=BUYOUT、PENALTY必填。
	OperationDivideFlag *string `json:"operation_divide_flag,omitempty" xml:"operation_divide_flag,omitempty" maxLength:"1" minLength:"1"`
	// 当operation_divide_flag=Y 必填
	// 经营分账收入列表，最多10条，分账比例与正常限制一致。
	OperationDivideTransInList []*OperationDivideTransInModel `json:"operation_divide_trans_in_list,omitempty" xml:"operation_divide_trans_in_list,omitempty" type:"Repeated"`
}

func (s CreateAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *CreateAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetPayType(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.PayType = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetPayChannel(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.PayChannel = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetPayAmount(v int64) *CreateAntchainAtoWithholdActivepayRequest {
	s.PayAmount = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetOperationDivideFlag(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.OperationDivideFlag = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetOperationDivideTransInList(v []*OperationDivideTransInModel) *CreateAntchainAtoWithholdActivepayRequest {
	s.OperationDivideTransInList = v
	return s
}

type CreateAntchainAtoWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 签名字符串，用于APP支付场景，客户端唤起支付宝收银台使用。
	OrderStr *string `json:"order_str,omitempty" xml:"order_str,omitempty"`
}

func (s CreateAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetTradeNo(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetOrderStr(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.OrderStr = &v
	return s
}

type QueryAntchainAtoWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期,当支付类型为PERFORMANCE或为空必填
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 支付宝支付订单号，当传递此单号时，只会返回当前单据
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"64"`
	// 支付类型
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64" minLength:"1"`
}

func (s QueryAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *QueryAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetTradeNo(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetPayType(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.PayType = &v
	return s
}

type QueryAntchainAtoWithholdActivepayResponse struct {
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

func (s QueryAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetCurrentOrder(v *ActivePayOrder) *QueryAntchainAtoWithholdActivepayResponse {
	s.CurrentOrder = v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetOrders(v []*ActivePayOrder) *QueryAntchainAtoWithholdActivepayResponse {
	s.Orders = v
	return s
}

type CancelAntchainAtoWithholdActivepayRequest struct {
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

func (s CancelAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *CancelAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetTradeNo(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type CancelAntchainAtoWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetTradeNo(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type CancelAntchainAtoFundPlanRequest struct {
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

func (s CancelAntchainAtoFundPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoFundPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoFundPlanRequest) SetAuthToken(v string) *CancelAntchainAtoFundPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetProductInstanceId(v string) *CancelAntchainAtoFundPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetOrderId(v string) *CancelAntchainAtoFundPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetMerchantId(v string) *CancelAntchainAtoFundPlanRequest {
	s.MerchantId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetCancelReason(v string) *CancelAntchainAtoFundPlanRequest {
	s.CancelReason = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetFundId(v string) *CancelAntchainAtoFundPlanRequest {
	s.FundId = &v
	return s
}

type CancelAntchainAtoFundPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoFundPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoFundPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoFundPlanResponse) SetReqMsgId(v string) *CancelAntchainAtoFundPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanResponse) SetResultCode(v string) *CancelAntchainAtoFundPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoFundPlanResponse) SetResultMsg(v string) *CancelAntchainAtoFundPlanResponse {
	s.ResultMsg = &v
	return s
}

type CallbackAntchainAtoFundNotifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ASYNC_UNSIGN_APPLY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CallbackAntchainAtoFundNotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainAtoFundNotifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetAuthToken(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetProductInstanceId(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetType(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.Type = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetData(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.Data = &v
	return s
}

type CallbackAntchainAtoFundNotifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackAntchainAtoFundNotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainAtoFundNotifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetReqMsgId(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetResultCode(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetResultMsg(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ResultMsg = &v
	return s
}

type SyncAntchainAtoTradeFinanceloanapplyRequest struct {
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

func (s SyncAntchainAtoTradeFinanceloanapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFinanceloanapplyRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetAuthToken(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetOrderId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetMerchantId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetMerchantName(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.MerchantName = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetFundId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.FundId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetType(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.Type = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetAssetPackageId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.AssetPackageId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetStage(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.Stage = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetOrderIdList(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.OrderIdList = &v
	return s
}

type SyncAntchainAtoTradeFinanceloanapplyResponse struct {
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

func (s SyncAntchainAtoTradeFinanceloanapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFinanceloanapplyResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetResultCode(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetResultMsg(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetOrderId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetMerchantId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeMerchantfulfillmentRequest struct {
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

func (s GetAntchainAtoTradeMerchantfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetAuthToken(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetOrderId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetMerchantId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetTermIdx(v int64) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetAntchainAtoTradeMerchantfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为 「MerchantFulfillmentResp」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeMerchantfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetReqMsgId(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResultCode(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResultMsg(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResponseData(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundMerchantpromiseRequest struct {
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

func (s SyncAntchainAtoFundMerchantpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundMerchantpromiseRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetAuthToken(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetOrderId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetMerchantId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetBizContent(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.BizContent = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetFundId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.FundId = &v
	return s
}

type SyncAntchainAtoFundMerchantpromiseResponse struct {
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

func (s SyncAntchainAtoFundMerchantpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundMerchantpromiseResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetReqMsgId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetResultCode(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetResultMsg(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetOrderId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetMerchantId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.MerchantId = &v
	return s
}

type SyncAntchainAtoFundFinanceloanresultsRequest struct {
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

func (s SyncAntchainAtoFundFinanceloanresultsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceloanresultsRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetAuthToken(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetOrderId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetMerchantId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetBizContent(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.BizContent = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetFundId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.FundId = &v
	return s
}

type SyncAntchainAtoFundFinanceloanresultsResponse struct {
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

func (s SyncAntchainAtoFundFinanceloanresultsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceloanresultsResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetReqMsgId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetResultCode(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetResultMsg(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetOrderId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetMerchantId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetLoanResult(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.LoanResult = &v
	return s
}

type GetAntchainAtoFundUserpromiseRequest struct {
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

func (s GetAntchainAtoFundUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetAuthToken(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetProductInstanceId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetOrderId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetMerchantId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetFundId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为「OrderPromise」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetReqMsgId(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResultCode(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResultMsg(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResponseData(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoTradeUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetAuthToken(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetOrderId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetMerchantId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResultCode(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResultMsg(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResponseData(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoTradeMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetAuthToken(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetOrderId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetMerchantId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResultCode(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResultMsg(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResponseData(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundUserperformanceRequest struct {
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

func (s GetAntchainAtoFundUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetAuthToken(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetOrderId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetMerchantId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetFundId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResultCode(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResultMsg(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResponseData(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundMerchantperformanceRequest struct {
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

func (s GetAntchainAtoFundMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetAuthToken(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetOrderId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetMerchantId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetFundId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResultCode(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResultMsg(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResponseData(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundOrderfullinfoRequest struct {
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

func (s GetAntchainAtoFundOrderfullinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfullinfoRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetAuthToken(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetProductInstanceId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetOrderId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetMerchantId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetFundId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundOrderfullinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OrderFullInfoResp的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundOrderfullinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfullinfoResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetReqMsgId(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResultCode(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResultMsg(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResponseData(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResponseData = &v
	return s
}

type UploadAntchainAtoSignFlowRequest struct {
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

func (s UploadAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignFlowRequest) SetAuthToken(v string) *UploadAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *UploadAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetMerchantId(v string) *UploadAntchainAtoSignFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetOrderId(v string) *UploadAntchainAtoSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetSignNo(v string) *UploadAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetTemplateId(v string) *UploadAntchainAtoSignFlowRequest {
	s.TemplateId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetSignTime(v string) *UploadAntchainAtoSignFlowRequest {
	s.SignTime = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileObject(v io.Reader) *UploadAntchainAtoSignFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileObjectName(v string) *UploadAntchainAtoSignFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileId(v string) *UploadAntchainAtoSignFlowRequest {
	s.FileId = &v
	return s
}

type UploadAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty"`
}

func (s UploadAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignFlowResponse) SetReqMsgId(v string) *UploadAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetResultCode(v string) *UploadAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetResultMsg(v string) *UploadAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetFileItemNo(v string) *UploadAntchainAtoSignFlowResponse {
	s.FileItemNo = &v
	return s
}

type CreateAntchainAtoWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 第几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 本次请求的退款金额，单位为分
	// 1234=12.34元
	RefundMoney *int64 `json:"refund_money,omitempty" xml:"refund_money,omitempty" require:"true" minimum:"1"`
	// 退款原因
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty" maxLength:"200"`
	// 支付类型
	// ORDER_BUYOUT:买断金
	// ORDER_PENALTY:违约金
	// PERFORMANCE:正常履约（默认）
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64"`
}

func (s CreateAntchainAtoWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetOrderId(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetPeriodNum(v int64) *CreateAntchainAtoWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetRefundRequestNo(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetRefundMoney(v int64) *CreateAntchainAtoWithholdRefundRequest {
	s.RefundMoney = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetRefundReason(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.RefundReason = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundRequest) SetPayType(v string) *CreateAntchainAtoWithholdRefundRequest {
	s.PayType = &v
	return s
}

type CreateAntchainAtoWithholdRefundResponse struct {
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

func (s CreateAntchainAtoWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetResultCode(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetRefundRequestNo(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetStatus(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *CreateAntchainAtoWithholdRefundResponse) SetRefundOrderNo(v string) *CreateAntchainAtoWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

type QueryAntchainAtoWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 支付类型
	// ORDER_BUYOUT:买断金
	// ORDER_PENALTY:违约金
	// PERFORMANCE:正常履约（默认）
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" maxLength:"64"`
}

func (s QueryAntchainAtoWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetOrderId(v string) *QueryAntchainAtoWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetPeriodNum(v int64) *QueryAntchainAtoWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetRefundRequestNo(v string) *QueryAntchainAtoWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundRequest) SetPayType(v string) *QueryAntchainAtoWithholdRefundRequest {
	s.PayType = &v
	return s
}

type QueryAntchainAtoWithholdRefundResponse struct {
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

func (s QueryAntchainAtoWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetResultCode(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetRefundRequestNo(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetRefundOrderNo(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetStatus(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetRefundErrorMsg(v string) *QueryAntchainAtoWithholdRefundResponse {
	s.RefundErrorMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetTotalRefundAmount(v int64) *QueryAntchainAtoWithholdRefundResponse {
	s.TotalRefundAmount = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetSendBackAmount(v int64) *QueryAntchainAtoWithholdRefundResponse {
	s.SendBackAmount = &v
	return s
}

func (s *QueryAntchainAtoWithholdRefundResponse) SetGmtRefundPay(v int64) *QueryAntchainAtoWithholdRefundResponse {
	s.GmtRefundPay = &v
	return s
}

type UpdateAntchainAtoTradeUserpromiseRequest struct {
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

func (s UpdateAntchainAtoTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainAtoTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetAuthToken(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetProductInstanceId(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetOrderId(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetMerchantId(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetTermIdx(v int64) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.TermIdx = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetUpdatedRentalMoney(v int64) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.UpdatedRentalMoney = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetReason(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.Reason = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseRequest) SetDesc(v string) *UpdateAntchainAtoTradeUserpromiseRequest {
	s.Desc = &v
	return s
}

type UpdateAntchainAtoTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAntchainAtoTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainAtoTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntchainAtoTradeUserpromiseResponse) SetReqMsgId(v string) *UpdateAntchainAtoTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseResponse) SetResultCode(v string) *UpdateAntchainAtoTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntchainAtoTradeUserpromiseResponse) SetResultMsg(v string) *UpdateAntchainAtoTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

type NotifyAntchainAtoFundFlowRequest struct {
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

func (s NotifyAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *NotifyAntchainAtoFundFlowRequest) SetAuthToken(v string) *NotifyAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *NotifyAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetMerchantId(v string) *NotifyAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetOrderId(v string) *NotifyAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetSignNo(v string) *NotifyAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetFileItemNo(v string) *NotifyAntchainAtoFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowRequest) SetFundId(v string) *NotifyAntchainAtoFundFlowRequest {
	s.FundId = &v
	return s
}

type NotifyAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s NotifyAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *NotifyAntchainAtoFundFlowResponse) SetReqMsgId(v string) *NotifyAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowResponse) SetResultCode(v string) *NotifyAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyAntchainAtoFundFlowResponse) SetResultMsg(v string) *NotifyAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type SyncAntchainAtoFrontIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncAntchainAtoFrontIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontIndirectorderRequest) SetAuthToken(v string) *SyncAntchainAtoFrontIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFrontIndirectorderRequest) SetProductInstanceId(v string) *SyncAntchainAtoFrontIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFrontIndirectorderRequest) SetBizContent(v string) *SyncAntchainAtoFrontIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFrontIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值，json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFrontIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontIndirectorderResponse) SetReqMsgId(v string) *SyncAntchainAtoFrontIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFrontIndirectorderResponse) SetResultCode(v string) *SyncAntchainAtoFrontIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFrontIndirectorderResponse) SetResultMsg(v string) *SyncAntchainAtoFrontIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFrontIndirectorderResponse) SetResponseData(v string) *SyncAntchainAtoFrontIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoTradeIndirectorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数,json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncAntchainAtoTradeIndirectorderRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeIndirectorderRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeIndirectorderRequest) SetAuthToken(v string) *SyncAntchainAtoTradeIndirectorderRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeIndirectorderRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeIndirectorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeIndirectorderRequest) SetBizContent(v string) *SyncAntchainAtoTradeIndirectorderRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoTradeIndirectorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回业务参数，json.toString
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeIndirectorderResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeIndirectorderResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeIndirectorderResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeIndirectorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeIndirectorderResponse) SetResultCode(v string) *SyncAntchainAtoTradeIndirectorderResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeIndirectorderResponse) SetResultMsg(v string) *SyncAntchainAtoTradeIndirectorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeIndirectorderResponse) SetResponseData(v string) *SyncAntchainAtoTradeIndirectorderResponse {
	s.ResponseData = &v
	return s
}

type RegisterAntchainAtoMerchantexpandMerchantRequest struct {
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

func (s RegisterAntchainAtoMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterAntchainAtoMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetAuthToken(v string) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetProductInstanceId(v string) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfo) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfo) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfo) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetExpandMode(v string) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.ExpandMode = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantRequest) SetSubTenantId(v string) *RegisterAntchainAtoMerchantexpandMerchantRequest {
	s.SubTenantId = &v
	return s
}

type RegisterAntchainAtoMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s RegisterAntchainAtoMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterAntchainAtoMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *RegisterAntchainAtoMerchantexpandMerchantResponse) SetReqMsgId(v string) *RegisterAntchainAtoMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantResponse) SetResultCode(v string) *RegisterAntchainAtoMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantResponse) SetResultMsg(v string) *RegisterAntchainAtoMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterAntchainAtoMerchantexpandMerchantResponse) SetPayExpandId(v string) *RegisterAntchainAtoMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type UploadAntchainAtoMerchantexpandFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称 包含后缀
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s UploadAntchainAtoMerchantexpandFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoMerchantexpandFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoMerchantexpandFileRequest) SetAuthToken(v string) *UploadAntchainAtoMerchantexpandFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileRequest) SetProductInstanceId(v string) *UploadAntchainAtoMerchantexpandFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileRequest) SetFileName(v string) *UploadAntchainAtoMerchantexpandFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileRequest) SetBizScene(v string) *UploadAntchainAtoMerchantexpandFileRequest {
	s.BizScene = &v
	return s
}

type UploadAntchainAtoMerchantexpandFileResponse struct {
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

func (s UploadAntchainAtoMerchantexpandFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoMerchantexpandFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoMerchantexpandFileResponse) SetReqMsgId(v string) *UploadAntchainAtoMerchantexpandFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileResponse) SetResultCode(v string) *UploadAntchainAtoMerchantexpandFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileResponse) SetResultMsg(v string) *UploadAntchainAtoMerchantexpandFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileResponse) SetUploadUrl(v string) *UploadAntchainAtoMerchantexpandFileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadAntchainAtoMerchantexpandFileResponse) SetFileKey(v string) *UploadAntchainAtoMerchantexpandFileResponse {
	s.FileKey = &v
	return s
}

type QueryAntchainAtoMerchantexpandMerchantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户入驻返回的进件编号 expand_mode=AGENT必填
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty" require:"true"`
}

func (s QueryAntchainAtoMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoMerchantexpandMerchantRequest) SetAuthToken(v string) *QueryAntchainAtoMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantRequest) SetProductInstanceId(v string) *QueryAntchainAtoMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantRequest) SetPayExpandId(v string) *QueryAntchainAtoMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

type QueryAntchainAtoMerchantexpandMerchantResponse struct {
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
	// MERCHANT_CONFIRM 待商户B站确认
	// SUB_MERCHANT_CREDIT 二级户商户签约中
	EnrollmentStatus *string `json:"enrollment_status,omitempty" xml:"enrollment_status,omitempty"`
	// 入驻失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
}

func (s QueryAntchainAtoMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoMerchantexpandMerchantResponse) SetReqMsgId(v string) *QueryAntchainAtoMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantResponse) SetResultCode(v string) *QueryAntchainAtoMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantResponse) SetResultMsg(v string) *QueryAntchainAtoMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantResponse) SetEnrollmentStatus(v string) *QueryAntchainAtoMerchantexpandMerchantResponse {
	s.EnrollmentStatus = &v
	return s
}

func (s *QueryAntchainAtoMerchantexpandMerchantResponse) SetFailReason(v string) *QueryAntchainAtoMerchantexpandMerchantResponse {
	s.FailReason = &v
	return s
}

type UploadAntchainAtoSignTemplateRequest struct {
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

func (s UploadAntchainAtoSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignTemplateRequest) SetAuthToken(v string) *UploadAntchainAtoSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetProductInstanceId(v string) *UploadAntchainAtoSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetMerchantId(v string) *UploadAntchainAtoSignTemplateRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetContractType(v string) *UploadAntchainAtoSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetAgreementType(v string) *UploadAntchainAtoSignTemplateRequest {
	s.AgreementType = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetPosConf(v string) *UploadAntchainAtoSignTemplateRequest {
	s.PosConf = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetTemplateArgs(v string) *UploadAntchainAtoSignTemplateRequest {
	s.TemplateArgs = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetFileObject(v io.Reader) *UploadAntchainAtoSignTemplateRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetFileObjectName(v string) *UploadAntchainAtoSignTemplateRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateRequest) SetFileId(v string) *UploadAntchainAtoSignTemplateRequest {
	s.FileId = &v
	return s
}

type UploadAntchainAtoSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传模板后返回的模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s UploadAntchainAtoSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignTemplateResponse) SetReqMsgId(v string) *UploadAntchainAtoSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateResponse) SetResultCode(v string) *UploadAntchainAtoSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateResponse) SetResultMsg(v string) *UploadAntchainAtoSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoSignTemplateResponse) SetTemplateId(v string) *UploadAntchainAtoSignTemplateResponse {
	s.TemplateId = &v
	return s
}

type UploadAntchainAtoFundCreditRequest struct {
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

func (s UploadAntchainAtoFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundCreditRequest) SetAuthToken(v string) *UploadAntchainAtoFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetProductInstanceId(v string) *UploadAntchainAtoFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetOrderNoType(v string) *UploadAntchainAtoFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetOrderNo(v string) *UploadAntchainAtoFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetFundId(v string) *UploadAntchainAtoFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetCreditType(v string) *UploadAntchainAtoFundCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetCreditName(v string) *UploadAntchainAtoFundCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetContentType(v string) *UploadAntchainAtoFundCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetFileUrl(v string) *UploadAntchainAtoFundCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetContent(v string) *UploadAntchainAtoFundCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadAntchainAtoFundCreditRequest) SetMerchantId(v string) *UploadAntchainAtoFundCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadAntchainAtoFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadAntchainAtoFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundCreditResponse) SetReqMsgId(v string) *UploadAntchainAtoFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoFundCreditResponse) SetResultCode(v string) *UploadAntchainAtoFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoFundCreditResponse) SetResultMsg(v string) *UploadAntchainAtoFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoFundCreditResponse) SetContentId(v string) *UploadAntchainAtoFundCreditResponse {
	s.ContentId = &v
	return s
}

type UploadAntchainAtoSignCreditRequest struct {
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

func (s UploadAntchainAtoSignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignCreditRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignCreditRequest) SetAuthToken(v string) *UploadAntchainAtoSignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetProductInstanceId(v string) *UploadAntchainAtoSignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetOrderNoType(v string) *UploadAntchainAtoSignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetOrderNo(v string) *UploadAntchainAtoSignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetCreditType(v string) *UploadAntchainAtoSignCreditRequest {
	s.CreditType = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetCreditName(v string) *UploadAntchainAtoSignCreditRequest {
	s.CreditName = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetContentType(v string) *UploadAntchainAtoSignCreditRequest {
	s.ContentType = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetFileUrl(v string) *UploadAntchainAtoSignCreditRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetContent(v string) *UploadAntchainAtoSignCreditRequest {
	s.Content = &v
	return s
}

func (s *UploadAntchainAtoSignCreditRequest) SetMerchantId(v string) *UploadAntchainAtoSignCreditRequest {
	s.MerchantId = &v
	return s
}

type UploadAntchainAtoSignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s UploadAntchainAtoSignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignCreditResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignCreditResponse) SetReqMsgId(v string) *UploadAntchainAtoSignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoSignCreditResponse) SetResultCode(v string) *UploadAntchainAtoSignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoSignCreditResponse) SetResultMsg(v string) *UploadAntchainAtoSignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoSignCreditResponse) SetContentId(v string) *UploadAntchainAtoSignCreditResponse {
	s.ContentId = &v
	return s
}

type QueryAntchainAtoFundCreditRequest struct {
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

func (s QueryAntchainAtoFundCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoFundCreditRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoFundCreditRequest) SetAuthToken(v string) *QueryAntchainAtoFundCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoFundCreditRequest) SetProductInstanceId(v string) *QueryAntchainAtoFundCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoFundCreditRequest) SetOrderNoType(v string) *QueryAntchainAtoFundCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QueryAntchainAtoFundCreditRequest) SetOrderNo(v string) *QueryAntchainAtoFundCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryAntchainAtoFundCreditRequest) SetFundId(v string) *QueryAntchainAtoFundCreditRequest {
	s.FundId = &v
	return s
}

func (s *QueryAntchainAtoFundCreditRequest) SetMerchantId(v string) *QueryAntchainAtoFundCreditRequest {
	s.MerchantId = &v
	return s
}

type QueryAntchainAtoFundCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QueryAntchainAtoFundCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoFundCreditResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoFundCreditResponse) SetReqMsgId(v string) *QueryAntchainAtoFundCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoFundCreditResponse) SetResultCode(v string) *QueryAntchainAtoFundCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoFundCreditResponse) SetResultMsg(v string) *QueryAntchainAtoFundCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoFundCreditResponse) SetContentInfo(v string) *QueryAntchainAtoFundCreditResponse {
	s.ContentInfo = &v
	return s
}

type QueryAntchainAtoSignCreditRequest struct {
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

func (s QueryAntchainAtoSignCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoSignCreditRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoSignCreditRequest) SetAuthToken(v string) *QueryAntchainAtoSignCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoSignCreditRequest) SetProductInstanceId(v string) *QueryAntchainAtoSignCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoSignCreditRequest) SetOrderNoType(v string) *QueryAntchainAtoSignCreditRequest {
	s.OrderNoType = &v
	return s
}

func (s *QueryAntchainAtoSignCreditRequest) SetOrderNo(v string) *QueryAntchainAtoSignCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryAntchainAtoSignCreditRequest) SetMerchantId(v string) *QueryAntchainAtoSignCreditRequest {
	s.MerchantId = &v
	return s
}

type QueryAntchainAtoSignCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容信息
	ContentInfo *string `json:"content_info,omitempty" xml:"content_info,omitempty"`
}

func (s QueryAntchainAtoSignCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoSignCreditResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoSignCreditResponse) SetReqMsgId(v string) *QueryAntchainAtoSignCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoSignCreditResponse) SetResultCode(v string) *QueryAntchainAtoSignCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoSignCreditResponse) SetResultMsg(v string) *QueryAntchainAtoSignCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoSignCreditResponse) SetContentInfo(v string) *QueryAntchainAtoSignCreditResponse {
	s.ContentInfo = &v
	return s
}

type UpdateAntchainAtoMerchantexpandMerchantRequest struct {
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

func (s UpdateAntchainAtoMerchantexpandMerchantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainAtoMerchantexpandMerchantRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetAuthToken(v string) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetProductInstanceId(v string) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetCompanyInfo(v *CompanyInfoUpdate) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.CompanyInfo = v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetLegalInfo(v *LegalInfoUpdate) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.LegalInfo = v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetApplicationInfo(v *ApplicationInfoUpdate) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.ApplicationInfo = v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetPayExpandId(v string) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.PayExpandId = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantRequest) SetMerchantId(v string) *UpdateAntchainAtoMerchantexpandMerchantRequest {
	s.MerchantId = &v
	return s
}

type UpdateAntchainAtoMerchantexpandMerchantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件流水号
	PayExpandId *string `json:"pay_expand_id,omitempty" xml:"pay_expand_id,omitempty"`
}

func (s UpdateAntchainAtoMerchantexpandMerchantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntchainAtoMerchantexpandMerchantResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntchainAtoMerchantexpandMerchantResponse) SetReqMsgId(v string) *UpdateAntchainAtoMerchantexpandMerchantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantResponse) SetResultCode(v string) *UpdateAntchainAtoMerchantexpandMerchantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantResponse) SetResultMsg(v string) *UpdateAntchainAtoMerchantexpandMerchantResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAntchainAtoMerchantexpandMerchantResponse) SetPayExpandId(v string) *UpdateAntchainAtoMerchantexpandMerchantResponse {
	s.PayExpandId = &v
	return s
}

type CancelAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 默认:“撤销”，最大长度50
	RevokeReason *string `json:"revoke_reason,omitempty" xml:"revoke_reason,omitempty"`
	// 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
}

func (s CancelAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoSignFlowRequest) SetAuthToken(v string) *CancelAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *CancelAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoSignFlowRequest) SetSignNo(v string) *CancelAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *CancelAntchainAtoSignFlowRequest) SetRevokeReason(v string) *CancelAntchainAtoSignFlowRequest {
	s.RevokeReason = &v
	return s
}

func (s *CancelAntchainAtoSignFlowRequest) SetOperatorId(v string) *CancelAntchainAtoSignFlowRequest {
	s.OperatorId = &v
	return s
}

type CancelAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoSignFlowResponse) SetReqMsgId(v string) *CancelAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoSignFlowResponse) SetResultCode(v string) *CancelAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoSignFlowResponse) SetResultMsg(v string) *CancelAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

type ReplaceAntchainAtoTradeUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"6"`
	// 订单所属商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"0"`
}

func (s ReplaceAntchainAtoTradeUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceAntchainAtoTradeUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *ReplaceAntchainAtoTradeUserpromiseRequest) SetAuthToken(v string) *ReplaceAntchainAtoTradeUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseRequest) SetProductInstanceId(v string) *ReplaceAntchainAtoTradeUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseRequest) SetBizContent(v string) *ReplaceAntchainAtoTradeUserpromiseRequest {
	s.BizContent = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseRequest) SetOrderId(v string) *ReplaceAntchainAtoTradeUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseRequest) SetMerchantId(v string) *ReplaceAntchainAtoTradeUserpromiseRequest {
	s.MerchantId = &v
	return s
}

type ReplaceAntchainAtoTradeUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReplaceAntchainAtoTradeUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceAntchainAtoTradeUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *ReplaceAntchainAtoTradeUserpromiseResponse) SetReqMsgId(v string) *ReplaceAntchainAtoTradeUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseResponse) SetResultCode(v string) *ReplaceAntchainAtoTradeUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceAntchainAtoTradeUserpromiseResponse) SetResultMsg(v string) *ReplaceAntchainAtoTradeUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

type ApplyAntchainAtoTradeFinanceprecheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度大于6，小于50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"6"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 提交预审的资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" minLength:"1"`
	// 透传到资方，不做格式限制
	TransparentInfo *string `json:"transparent_info,omitempty" xml:"transparent_info,omitempty" maxLength:"1000"`
}

func (s ApplyAntchainAtoTradeFinanceprecheckRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntchainAtoTradeFinanceprecheckRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetAuthToken(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetProductInstanceId(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetOrderId(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.OrderId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetMerchantId(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.MerchantId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetFundId(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.FundId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckRequest) SetTransparentInfo(v string) *ApplyAntchainAtoTradeFinanceprecheckRequest {
	s.TransparentInfo = &v
	return s
}

type ApplyAntchainAtoTradeFinanceprecheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ● EXEMPTION ： 资方免预审
	// ● SUBMIT_SUCCESS: 异步预审提交成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
	// order_id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s ApplyAntchainAtoTradeFinanceprecheckResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntchainAtoTradeFinanceprecheckResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetReqMsgId(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetResultCode(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetResultMsg(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetResponseData(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.ResponseData = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetOrderId(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.OrderId = &v
	return s
}

func (s *ApplyAntchainAtoTradeFinanceprecheckResponse) SetMerchantId(v string) *ApplyAntchainAtoTradeFinanceprecheckResponse {
	s.MerchantId = &v
	return s
}

type SyncAntchainAtoFundFinanceprecheckresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" minLength:"6"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" minLength:"1"`
	// 资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" minLength:"1"`
	// 预审结果
	// ● APPROVAL ： 通过
	// ● REFUSE ：拒绝
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true" minLength:"1"`
	// 拒绝原因
	RefuseReason *string `json:"refuse_reason,omitempty" xml:"refuse_reason,omitempty" maxLength:"100"`
}

func (s SyncAntchainAtoFundFinanceprecheckresultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceprecheckresultRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetAuthToken(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetOrderId(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetMerchantId(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetFundId(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.FundId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetResult(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.Result = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultRequest) SetRefuseReason(v string) *SyncAntchainAtoFundFinanceprecheckresultRequest {
	s.RefuseReason = &v
	return s
}

type SyncAntchainAtoFundFinanceprecheckresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncAntchainAtoFundFinanceprecheckresultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceprecheckresultResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceprecheckresultResponse) SetReqMsgId(v string) *SyncAntchainAtoFundFinanceprecheckresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultResponse) SetResultCode(v string) *SyncAntchainAtoFundFinanceprecheckresultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceprecheckresultResponse) SetResultMsg(v string) *SyncAntchainAtoFundFinanceprecheckresultResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainAtoFundCompensateaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 商户租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s QueryAntchainAtoFundCompensateaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoFundCompensateaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoFundCompensateaccountRequest) SetAuthToken(v string) *QueryAntchainAtoFundCompensateaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountRequest) SetProductInstanceId(v string) *QueryAntchainAtoFundCompensateaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountRequest) SetFundId(v string) *QueryAntchainAtoFundCompensateaccountRequest {
	s.FundId = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountRequest) SetMerchantId(v string) *QueryAntchainAtoFundCompensateaccountRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountRequest) SetMerchantTenantId(v string) *QueryAntchainAtoFundCompensateaccountRequest {
	s.MerchantTenantId = &v
	return s
}

type QueryAntchainAtoFundCompensateaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可用余额，单位为分
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
}

func (s QueryAntchainAtoFundCompensateaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoFundCompensateaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoFundCompensateaccountResponse) SetReqMsgId(v string) *QueryAntchainAtoFundCompensateaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountResponse) SetResultCode(v string) *QueryAntchainAtoFundCompensateaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountResponse) SetResultMsg(v string) *QueryAntchainAtoFundCompensateaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoFundCompensateaccountResponse) SetAvailableAmount(v int64) *QueryAntchainAtoFundCompensateaccountResponse {
	s.AvailableAmount = &v
	return s
}

type QueryAntchainAtoWithholdCompensateaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 资方社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 资方租户id
	FundTenantId *string `json:"fund_tenant_id,omitempty" xml:"fund_tenant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s QueryAntchainAtoWithholdCompensateaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdCompensateaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdCompensateaccountRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdCompensateaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdCompensateaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountRequest) SetMerchantId(v string) *QueryAntchainAtoWithholdCompensateaccountRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountRequest) SetFundId(v string) *QueryAntchainAtoWithholdCompensateaccountRequest {
	s.FundId = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountRequest) SetFundTenantId(v string) *QueryAntchainAtoWithholdCompensateaccountRequest {
	s.FundTenantId = &v
	return s
}

type QueryAntchainAtoWithholdCompensateaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代偿卡号
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty"`
	// 可用余额，单位为分
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
}

func (s QueryAntchainAtoWithholdCompensateaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdCompensateaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdCompensateaccountResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdCompensateaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountResponse) SetResultCode(v string) *QueryAntchainAtoWithholdCompensateaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdCompensateaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountResponse) SetCardNo(v string) *QueryAntchainAtoWithholdCompensateaccountResponse {
	s.CardNo = &v
	return s
}

func (s *QueryAntchainAtoWithholdCompensateaccountResponse) SetAvailableAmount(v int64) *QueryAntchainAtoWithholdCompensateaccountResponse {
	s.AvailableAmount = &v
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
				"sdk_version":      tea.String("1.3.8"),
				"_prod_code":       tea.String("ak_195dff03d395462ea294bafdba69df3f"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncAntchainAtoTrade(request *SyncAntchainAtoTradeRequest) (_result *SyncAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeResponse{}
	_body, _err := client.SyncAntchainAtoTradeEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoTradeEx(request *SyncAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeResponse{}
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
func (client *Client) GetAntchainAtoTrade(request *GetAntchainAtoTradeRequest) (_result *GetAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.GetAntchainAtoTradeEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoTradeEx(request *GetAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntchainAtoRealpersonFacevrf(request *CreateAntchainAtoRealpersonFacevrfRequest) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.CreateAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) CreateAntchainAtoRealpersonFacevrfEx(request *CreateAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
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
func (client *Client) QueryAntchainAtoRealpersonFacevrf(request *QueryAntchainAtoRealpersonFacevrfRequest) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.QueryAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoRealpersonFacevrfEx(request *QueryAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AllAntchainAtoSignTemplate(request *AllAntchainAtoSignTemplateRequest) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAntchainAtoSignTemplateResponse{}
	_body, _err := client.AllAntchainAtoSignTemplateEx(request, headers, runtime)
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
func (client *Client) AllAntchainAtoSignTemplateEx(request *AllAntchainAtoSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAntchainAtoSignTemplateResponse{}
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
func (client *Client) SubmitAntchainAtoSignFlow(request *SubmitAntchainAtoSignFlowRequest) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoSignFlowResponse{}
	_body, _err := client.SubmitAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) SubmitAntchainAtoSignFlowEx(request *SubmitAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoSignFlowResponse{}
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
func (client *Client) GetAntchainAtoSignFlow(request *GetAntchainAtoSignFlowRequest) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.GetAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoSignFlowEx(request *GetAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdSign(request *CreateAntchainAtoWithholdSignRequest) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdSignResponse{}
	_body, _err := client.CreateAntchainAtoWithholdSignEx(request, headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdSignEx(request *CreateAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdSignResponse{}
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
func (client *Client) QueryAntchainAtoWithholdSign(request *QueryAntchainAtoWithholdSignRequest) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.QueryAntchainAtoWithholdSignEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoWithholdSignEx(request *QueryAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AuthAntchainAtoSignFlow(request *AuthAntchainAtoSignFlowRequest) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.AuthAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) AuthAntchainAtoSignFlowEx(request *AuthAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnbindAntchainAtoWithholdSign(request *UnbindAntchainAtoWithholdSignRequest) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindAntchainAtoWithholdSignResponse{}
	_body, _err := client.UnbindAntchainAtoWithholdSignEx(request, headers, runtime)
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
func (client *Client) UnbindAntchainAtoWithholdSignEx(request *UnbindAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindAntchainAtoWithholdSignResponse{}
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
func (client *Client) CancelAntchainAtoWithholdPlan(request *CancelAntchainAtoWithholdPlanRequest) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoWithholdPlanResponse{}
	_body, _err := client.CancelAntchainAtoWithholdPlanEx(request, headers, runtime)
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
func (client *Client) CancelAntchainAtoWithholdPlanEx(request *CancelAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoWithholdPlanResponse{}
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
func (client *Client) RepayAntchainAtoWithholdPlan(request *RepayAntchainAtoWithholdPlanRequest) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RepayAntchainAtoWithholdPlanEx(request, headers, runtime)
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
func (client *Client) RepayAntchainAtoWithholdPlanEx(request *RepayAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SubmitAntchainAtoFrontSign(request *SubmitAntchainAtoFrontSignRequest) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.SubmitAntchainAtoFrontSignEx(request, headers, runtime)
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
func (client *Client) SubmitAntchainAtoFrontSignEx(request *SubmitAntchainAtoFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncAntchainAtoFrontTrade(request *SyncAntchainAtoFrontTradeRequest) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.SyncAntchainAtoFrontTradeEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFrontTradeEx(request *SyncAntchainAtoFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) RetryAntchainAtoWithholdPlan(request *RetryAntchainAtoWithholdPlanRequest) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RetryAntchainAtoWithholdPlanEx(request, headers, runtime)
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
func (client *Client) RetryAntchainAtoWithholdPlanEx(request *RetryAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryAntchainAtoWithholdPlanResponse{}
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
func (client *Client) ConfirmAntchainAtoWithholdSignasyncunsign(request *ConfirmAntchainAtoWithholdSignasyncunsignRequest) (_result *ConfirmAntchainAtoWithholdSignasyncunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmAntchainAtoWithholdSignasyncunsignResponse{}
	_body, _err := client.ConfirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime)
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
func (client *Client) ConfirmAntchainAtoWithholdSignasyncunsignEx(request *ConfirmAntchainAtoWithholdSignasyncunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmAntchainAtoWithholdSignasyncunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmAntchainAtoWithholdSignasyncunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.signasyncunsign.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadAntchainAtoFundFlow(request *UploadAntchainAtoFundFlowRequest) (_result *UploadAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoFundFlowResponse{}
	_body, _err := client.UploadAntchainAtoFundFlowEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoFundFlowEx(request *UploadAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoFundFlowResponse, _err error) {
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
			uploadAntchainAtoFundFlowResponse := &UploadAntchainAtoFundFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainAtoFundFlowResponse
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
	_result = &UploadAntchainAtoFundFlowResponse{}
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
func (client *Client) GetAntchainAtoFundFlow(request *GetAntchainAtoFundFlowRequest) (_result *GetAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundFlowResponse{}
	_body, _err := client.GetAntchainAtoFundFlowEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundFlowEx(request *GetAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundFlowResponse{}
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
func (client *Client) RefuseAntchainAtoFundFlow(request *RefuseAntchainAtoFundFlowRequest) (_result *RefuseAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseAntchainAtoFundFlowResponse{}
	_body, _err := client.RefuseAntchainAtoFundFlowEx(request, headers, runtime)
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
func (client *Client) RefuseAntchainAtoFundFlowEx(request *RefuseAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseAntchainAtoFundFlowResponse{}
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
func (client *Client) AuthAntchainAtoFundFlow(request *AuthAntchainAtoFundFlowRequest) (_result *AuthAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainAtoFundFlowResponse{}
	_body, _err := client.AuthAntchainAtoFundFlowEx(request, headers, runtime)
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
func (client *Client) AuthAntchainAtoFundFlowEx(request *AuthAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdActivepay(request *CreateAntchainAtoWithholdActivepayRequest) (_result *CreateAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.CreateAntchainAtoWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdActivepayEx(request *CreateAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdActivepayResponse{}
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
func (client *Client) QueryAntchainAtoWithholdActivepay(request *QueryAntchainAtoWithholdActivepayRequest) (_result *QueryAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.QueryAntchainAtoWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoWithholdActivepayEx(request *QueryAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdActivepayResponse{}
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
func (client *Client) CancelAntchainAtoWithholdActivepay(request *CancelAntchainAtoWithholdActivepayRequest) (_result *CancelAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.CancelAntchainAtoWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) CancelAntchainAtoWithholdActivepayEx(request *CancelAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CancelAntchainAtoFundPlan(request *CancelAntchainAtoFundPlanRequest) (_result *CancelAntchainAtoFundPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoFundPlanResponse{}
	_body, _err := client.CancelAntchainAtoFundPlanEx(request, headers, runtime)
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
func (client *Client) CancelAntchainAtoFundPlanEx(request *CancelAntchainAtoFundPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoFundPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoFundPlanResponse{}
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
func (client *Client) CallbackAntchainAtoFundNotify(request *CallbackAntchainAtoFundNotifyRequest) (_result *CallbackAntchainAtoFundNotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntchainAtoFundNotifyResponse{}
	_body, _err := client.CallbackAntchainAtoFundNotifyEx(request, headers, runtime)
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
func (client *Client) CallbackAntchainAtoFundNotifyEx(request *CallbackAntchainAtoFundNotifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntchainAtoFundNotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntchainAtoFundNotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.notify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncAntchainAtoTradeFinanceloanapply(request *SyncAntchainAtoTradeFinanceloanapplyRequest) (_result *SyncAntchainAtoTradeFinanceloanapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeFinanceloanapplyResponse{}
	_body, _err := client.SyncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoTradeFinanceloanapplyEx(request *SyncAntchainAtoTradeFinanceloanapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeFinanceloanapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeFinanceloanapplyResponse{}
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
func (client *Client) GetAntchainAtoTradeMerchantfulfillment(request *GetAntchainAtoTradeMerchantfulfillmentRequest) (_result *GetAntchainAtoTradeMerchantfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeMerchantfulfillmentResponse{}
	_body, _err := client.GetAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoTradeMerchantfulfillmentEx(request *GetAntchainAtoTradeMerchantfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeMerchantfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeMerchantfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncAntchainAtoFundMerchantpromise(request *SyncAntchainAtoFundMerchantpromiseRequest) (_result *SyncAntchainAtoFundMerchantpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundMerchantpromiseResponse{}
	_body, _err := client.SyncAntchainAtoFundMerchantpromiseEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundMerchantpromiseEx(request *SyncAntchainAtoFundMerchantpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundMerchantpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundMerchantpromiseResponse{}
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
func (client *Client) SyncAntchainAtoFundFinanceloanresults(request *SyncAntchainAtoFundFinanceloanresultsRequest) (_result *SyncAntchainAtoFundFinanceloanresultsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundFinanceloanresultsResponse{}
	_body, _err := client.SyncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundFinanceloanresultsEx(request *SyncAntchainAtoFundFinanceloanresultsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundFinanceloanresultsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundFinanceloanresultsResponse{}
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
func (client *Client) GetAntchainAtoFundUserpromise(request *GetAntchainAtoFundUserpromiseRequest) (_result *GetAntchainAtoFundUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundUserpromiseResponse{}
	_body, _err := client.GetAntchainAtoFundUserpromiseEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundUserpromiseEx(request *GetAntchainAtoFundUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userpromise.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) GetAntchainAtoTradeUserperformance(request *GetAntchainAtoTradeUserperformanceRequest) (_result *GetAntchainAtoTradeUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeUserperformanceResponse{}
	_body, _err := client.GetAntchainAtoTradeUserperformanceEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoTradeUserperformanceEx(request *GetAntchainAtoTradeUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeUserperformanceResponse{}
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
func (client *Client) GetAntchainAtoTradeMerchantperformance(request *GetAntchainAtoTradeMerchantperformanceRequest) (_result *GetAntchainAtoTradeMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeMerchantperformanceResponse{}
	_body, _err := client.GetAntchainAtoTradeMerchantperformanceEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoTradeMerchantperformanceEx(request *GetAntchainAtoTradeMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) GetAntchainAtoFundUserperformance(request *GetAntchainAtoFundUserperformanceRequest) (_result *GetAntchainAtoFundUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundUserperformanceResponse{}
	_body, _err := client.GetAntchainAtoFundUserperformanceEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundUserperformanceEx(request *GetAntchainAtoFundUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundUserperformanceResponse{}
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
func (client *Client) GetAntchainAtoFundMerchantperformance(request *GetAntchainAtoFundMerchantperformanceRequest) (_result *GetAntchainAtoFundMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundMerchantperformanceResponse{}
	_body, _err := client.GetAntchainAtoFundMerchantperformanceEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundMerchantperformanceEx(request *GetAntchainAtoFundMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundMerchantperformanceResponse{}
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
func (client *Client) GetAntchainAtoFundOrderfullinfo(request *GetAntchainAtoFundOrderfullinfoRequest) (_result *GetAntchainAtoFundOrderfullinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundOrderfullinfoResponse{}
	_body, _err := client.GetAntchainAtoFundOrderfullinfoEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundOrderfullinfoEx(request *GetAntchainAtoFundOrderfullinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundOrderfullinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundOrderfullinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfullinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadAntchainAtoSignFlow(request *UploadAntchainAtoSignFlowRequest) (_result *UploadAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoSignFlowResponse{}
	_body, _err := client.UploadAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoSignFlowEx(request *UploadAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoSignFlowResponse, _err error) {
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
			uploadAntchainAtoSignFlowResponse := &UploadAntchainAtoSignFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainAtoSignFlowResponse
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
	_result = &UploadAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdRefund(request *CreateAntchainAtoWithholdRefundRequest) (_result *CreateAntchainAtoWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdRefundResponse{}
	_body, _err := client.CreateAntchainAtoWithholdRefundEx(request, headers, runtime)
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
func (client *Client) CreateAntchainAtoWithholdRefundEx(request *CreateAntchainAtoWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdRefundResponse{}
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
func (client *Client) QueryAntchainAtoWithholdRefund(request *QueryAntchainAtoWithholdRefundRequest) (_result *QueryAntchainAtoWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdRefundResponse{}
	_body, _err := client.QueryAntchainAtoWithholdRefundEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoWithholdRefundEx(request *QueryAntchainAtoWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UpdateAntchainAtoTradeUserpromise(request *UpdateAntchainAtoTradeUserpromiseRequest) (_result *UpdateAntchainAtoTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntchainAtoTradeUserpromiseResponse{}
	_body, _err := client.UpdateAntchainAtoTradeUserpromiseEx(request, headers, runtime)
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
func (client *Client) UpdateAntchainAtoTradeUserpromiseEx(request *UpdateAntchainAtoTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntchainAtoTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntchainAtoTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) NotifyAntchainAtoFundFlow(request *NotifyAntchainAtoFundFlowRequest) (_result *NotifyAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyAntchainAtoFundFlowResponse{}
	_body, _err := client.NotifyAntchainAtoFundFlowEx(request, headers, runtime)
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
func (client *Client) NotifyAntchainAtoFundFlowEx(request *NotifyAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncAntchainAtoFrontIndirectorder(request *SyncAntchainAtoFrontIndirectorderRequest) (_result *SyncAntchainAtoFrontIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFrontIndirectorderResponse{}
	_body, _err := client.SyncAntchainAtoFrontIndirectorderEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFrontIndirectorderEx(request *SyncAntchainAtoFrontIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFrontIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFrontIndirectorderResponse{}
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
func (client *Client) SyncAntchainAtoTradeIndirectorder(request *SyncAntchainAtoTradeIndirectorderRequest) (_result *SyncAntchainAtoTradeIndirectorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeIndirectorderResponse{}
	_body, _err := client.SyncAntchainAtoTradeIndirectorderEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoTradeIndirectorderEx(request *SyncAntchainAtoTradeIndirectorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeIndirectorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeIndirectorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.indirectorder.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) RegisterAntchainAtoMerchantexpandMerchant(request *RegisterAntchainAtoMerchantexpandMerchantRequest) (_result *RegisterAntchainAtoMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterAntchainAtoMerchantexpandMerchantResponse{}
	_body, _err := client.RegisterAntchainAtoMerchantexpandMerchantEx(request, headers, runtime)
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
func (client *Client) RegisterAntchainAtoMerchantexpandMerchantEx(request *RegisterAntchainAtoMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterAntchainAtoMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterAntchainAtoMerchantexpandMerchantResponse{}
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
func (client *Client) UploadAntchainAtoMerchantexpandFile(request *UploadAntchainAtoMerchantexpandFileRequest) (_result *UploadAntchainAtoMerchantexpandFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoMerchantexpandFileResponse{}
	_body, _err := client.UploadAntchainAtoMerchantexpandFileEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoMerchantexpandFileEx(request *UploadAntchainAtoMerchantexpandFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoMerchantexpandFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntchainAtoMerchantexpandFileResponse{}
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
func (client *Client) QueryAntchainAtoMerchantexpandMerchant(request *QueryAntchainAtoMerchantexpandMerchantRequest) (_result *QueryAntchainAtoMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoMerchantexpandMerchantResponse{}
	_body, _err := client.QueryAntchainAtoMerchantexpandMerchantEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoMerchantexpandMerchantEx(request *QueryAntchainAtoMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadAntchainAtoSignTemplate(request *UploadAntchainAtoSignTemplateRequest) (_result *UploadAntchainAtoSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoSignTemplateResponse{}
	_body, _err := client.UploadAntchainAtoSignTemplateEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoSignTemplateEx(request *UploadAntchainAtoSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoSignTemplateResponse, _err error) {
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
			uploadAntchainAtoSignTemplateResponse := &UploadAntchainAtoSignTemplateResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainAtoSignTemplateResponse
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
	_result = &UploadAntchainAtoSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadAntchainAtoFundCredit(request *UploadAntchainAtoFundCreditRequest) (_result *UploadAntchainAtoFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoFundCreditResponse{}
	_body, _err := client.UploadAntchainAtoFundCreditEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoFundCreditEx(request *UploadAntchainAtoFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntchainAtoFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadAntchainAtoSignCredit(request *UploadAntchainAtoSignCreditRequest) (_result *UploadAntchainAtoSignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoSignCreditResponse{}
	_body, _err := client.UploadAntchainAtoSignCreditEx(request, headers, runtime)
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
func (client *Client) UploadAntchainAtoSignCreditEx(request *UploadAntchainAtoSignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoSignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntchainAtoSignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainAtoFundCredit(request *QueryAntchainAtoFundCreditRequest) (_result *QueryAntchainAtoFundCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoFundCreditResponse{}
	_body, _err := client.QueryAntchainAtoFundCreditEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoFundCreditEx(request *QueryAntchainAtoFundCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoFundCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoFundCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainAtoSignCredit(request *QueryAntchainAtoSignCreditRequest) (_result *QueryAntchainAtoSignCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoSignCreditResponse{}
	_body, _err := client.QueryAntchainAtoSignCreditEx(request, headers, runtime)
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
func (client *Client) QueryAntchainAtoSignCreditEx(request *QueryAntchainAtoSignCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoSignCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoSignCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UpdateAntchainAtoMerchantexpandMerchant(request *UpdateAntchainAtoMerchantexpandMerchantRequest) (_result *UpdateAntchainAtoMerchantexpandMerchantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntchainAtoMerchantexpandMerchantResponse{}
	_body, _err := client.UpdateAntchainAtoMerchantexpandMerchantEx(request, headers, runtime)
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
func (client *Client) UpdateAntchainAtoMerchantexpandMerchantEx(request *UpdateAntchainAtoMerchantexpandMerchantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntchainAtoMerchantexpandMerchantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntchainAtoMerchantexpandMerchantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.merchantexpand.merchant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CancelAntchainAtoSignFlow(request *CancelAntchainAtoSignFlowRequest) (_result *CancelAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoSignFlowResponse{}
	_body, _err := client.CancelAntchainAtoSignFlowEx(request, headers, runtime)
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
func (client *Client) CancelAntchainAtoSignFlowEx(request *CancelAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约承诺替换更新
 * Summary: 用户履约承诺替换更新
 */
func (client *Client) ReplaceAntchainAtoTradeUserpromise(request *ReplaceAntchainAtoTradeUserpromiseRequest) (_result *ReplaceAntchainAtoTradeUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceAntchainAtoTradeUserpromiseResponse{}
	_body, _err := client.ReplaceAntchainAtoTradeUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约承诺替换更新
 * Summary: 用户履约承诺替换更新
 */
func (client *Client) ReplaceAntchainAtoTradeUserpromiseEx(request *ReplaceAntchainAtoTradeUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceAntchainAtoTradeUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceAntchainAtoTradeUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userpromise.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单融资预审申请接口
 * Summary: 订单融资预审申请接口
 */
func (client *Client) ApplyAntchainAtoTradeFinanceprecheck(request *ApplyAntchainAtoTradeFinanceprecheckRequest) (_result *ApplyAntchainAtoTradeFinanceprecheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntchainAtoTradeFinanceprecheckResponse{}
	_body, _err := client.ApplyAntchainAtoTradeFinanceprecheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单融资预审申请接口
 * Summary: 订单融资预审申请接口
 */
func (client *Client) ApplyAntchainAtoTradeFinanceprecheckEx(request *ApplyAntchainAtoTradeFinanceprecheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntchainAtoTradeFinanceprecheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntchainAtoTradeFinanceprecheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeprecheck.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资预审结果同步
 * Summary: 融资预审结果同步
 */
func (client *Client) SyncAntchainAtoFundFinanceprecheckresult(request *SyncAntchainAtoFundFinanceprecheckresultRequest) (_result *SyncAntchainAtoFundFinanceprecheckresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundFinanceprecheckresultResponse{}
	_body, _err := client.SyncAntchainAtoFundFinanceprecheckresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资预审结果同步
 * Summary: 融资预审结果同步
 */
func (client *Client) SyncAntchainAtoFundFinanceprecheckresultEx(request *SyncAntchainAtoFundFinanceprecheckresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundFinanceprecheckresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundFinanceprecheckresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.financeprecheckresult.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询代偿户余额
 * Summary: 代偿户查询
 */
func (client *Client) QueryAntchainAtoFundCompensateaccount(request *QueryAntchainAtoFundCompensateaccountRequest) (_result *QueryAntchainAtoFundCompensateaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoFundCompensateaccountResponse{}
	_body, _err := client.QueryAntchainAtoFundCompensateaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询代偿户余额
 * Summary: 代偿户查询
 */
func (client *Client) QueryAntchainAtoFundCompensateaccountEx(request *QueryAntchainAtoFundCompensateaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoFundCompensateaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoFundCompensateaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.compensateaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代偿户账户查询
 * Summary: 代偿户账户查询
 */
func (client *Client) QueryAntchainAtoWithholdCompensateaccount(request *QueryAntchainAtoWithholdCompensateaccountRequest) (_result *QueryAntchainAtoWithholdCompensateaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdCompensateaccountResponse{}
	_body, _err := client.QueryAntchainAtoWithholdCompensateaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代偿户账户查询
 * Summary: 代偿户账户查询
 */
func (client *Client) QueryAntchainAtoWithholdCompensateaccountEx(request *QueryAntchainAtoWithholdCompensateaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdCompensateaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdCompensateaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.compensateaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
