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

// 个人
type Person struct {
	// 身份证地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 居民身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型,比如：ID_CARD=身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 客户编号
	CmNo *string `json:"cm_no,omitempty" xml:"cm_no,omitempty"`
	// 电子邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 证件反面照片oss存储路径
	CertBackPicOssKey *string `json:"cert_back_pic_oss_key,omitempty" xml:"cert_back_pic_oss_key,omitempty"`
	// 证件正面照片OSS存储路径
	CertFrontPicOssKey *string `json:"cert_front_pic_oss_key,omitempty" xml:"cert_front_pic_oss_key,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 客户姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 身份证所在地邮编
	PostCode *string `json:"post_code,omitempty" xml:"post_code,omitempty"`
}

func (s Person) String() string {
	return tea.Prettify(s)
}

func (s Person) GoString() string {
	return s.String()
}

func (s *Person) SetAddress(v string) *Person {
	s.Address = &v
	return s
}

func (s *Person) SetCertNo(v string) *Person {
	s.CertNo = &v
	return s
}

func (s *Person) SetCertType(v string) *Person {
	s.CertType = &v
	return s
}

func (s *Person) SetCmNo(v string) *Person {
	s.CmNo = &v
	return s
}

func (s *Person) SetEmail(v string) *Person {
	s.Email = &v
	return s
}

func (s *Person) SetCertBackPicOssKey(v string) *Person {
	s.CertBackPicOssKey = &v
	return s
}

func (s *Person) SetCertFrontPicOssKey(v string) *Person {
	s.CertFrontPicOssKey = &v
	return s
}

func (s *Person) SetMobile(v string) *Person {
	s.Mobile = &v
	return s
}

func (s *Person) SetName(v string) *Person {
	s.Name = &v
	return s
}

func (s *Person) SetPostCode(v string) *Person {
	s.PostCode = &v
	return s
}

// 签署人
type EntityBasicInfo struct {
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 证件类型，可选值：ID_CARD,BUSINESS_LICENSE,UNIFIED_SOCIAL_CODE
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
}

func (s EntityBasicInfo) String() string {
	return tea.Prettify(s)
}

func (s EntityBasicInfo) GoString() string {
	return s.String()
}

func (s *EntityBasicInfo) SetName(v string) *EntityBasicInfo {
	s.Name = &v
	return s
}

func (s *EntityBasicInfo) SetCertType(v string) *EntityBasicInfo {
	s.CertType = &v
	return s
}

func (s *EntityBasicInfo) SetCertNo(v string) *EntityBasicInfo {
	s.CertNo = &v
	return s
}

// 电子签约签署区
type ArSignField struct {
	// 签署页
	PosPage *string `json:"pos_page,omitempty" xml:"pos_page,omitempty"`
	// 签署区x坐标
	PosX *string `json:"pos_x,omitempty" xml:"pos_x,omitempty"`
	// 签署区y坐标
	PosY *string `json:"pos_y,omitempty" xml:"pos_y,omitempty"`
	// 签署日期签署页
	SignDatePosPage *string `json:"sign_date_pos_page,omitempty" xml:"sign_date_pos_page,omitempty"`
	// 签署日期的签署坐标x
	SignDatePosX *string `json:"sign_date_pos_x,omitempty" xml:"sign_date_pos_x,omitempty"`
	// 签署日期签署坐标y
	SignDatePosY *string `json:"sign_date_pos_y,omitempty" xml:"sign_date_pos_y,omitempty"`
}

func (s ArSignField) String() string {
	return tea.Prettify(s)
}

func (s ArSignField) GoString() string {
	return s.String()
}

func (s *ArSignField) SetPosPage(v string) *ArSignField {
	s.PosPage = &v
	return s
}

func (s *ArSignField) SetPosX(v string) *ArSignField {
	s.PosX = &v
	return s
}

func (s *ArSignField) SetPosY(v string) *ArSignField {
	s.PosY = &v
	return s
}

func (s *ArSignField) SetSignDatePosPage(v string) *ArSignField {
	s.SignDatePosPage = &v
	return s
}

func (s *ArSignField) SetSignDatePosX(v string) *ArSignField {
	s.SignDatePosX = &v
	return s
}

func (s *ArSignField) SetSignDatePosY(v string) *ArSignField {
	s.SignDatePosY = &v
	return s
}

// 合同模版
type ArTemplate struct {
	// 合同模版号
	ArTpNo *string `json:"ar_tp_no,omitempty" xml:"ar_tp_no,omitempty"`
	// 合同版本
	ArTpVersion *int64 `json:"ar_tp_version,omitempty" xml:"ar_tp_version,omitempty"`
	// 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
	ArType *string `json:"ar_type,omitempty" xml:"ar_type,omitempty"`
	// 区块链智能合同的合同模版号
	MycTpId *string `json:"myc_tp_id,omitempty" xml:"myc_tp_id,omitempty"`
	// 合同名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 合同模版归属机构编号
	OrgNo *string `json:"org_no,omitempty" xml:"org_no,omitempty"`
	// 合同模版归属机构类型，比如：BANK=银行
	OrgType *string `json:"org_type,omitempty" xml:"org_type,omitempty"`
	// 合同模版OSS存储路径
	PdfOssKey *string `json:"pdf_oss_key,omitempty" xml:"pdf_oss_key,omitempty"`
	// 合同变量,Map<String,String>的json格式
	VarJson *string `json:"var_json,omitempty" xml:"var_json,omitempty"`
	// 签署区设置
	SignAreaJson *string `json:"sign_area_json,omitempty" xml:"sign_area_json,omitempty"`
}

func (s ArTemplate) String() string {
	return tea.Prettify(s)
}

func (s ArTemplate) GoString() string {
	return s.String()
}

func (s *ArTemplate) SetArTpNo(v string) *ArTemplate {
	s.ArTpNo = &v
	return s
}

func (s *ArTemplate) SetArTpVersion(v int64) *ArTemplate {
	s.ArTpVersion = &v
	return s
}

func (s *ArTemplate) SetArType(v string) *ArTemplate {
	s.ArType = &v
	return s
}

func (s *ArTemplate) SetMycTpId(v string) *ArTemplate {
	s.MycTpId = &v
	return s
}

func (s *ArTemplate) SetName(v string) *ArTemplate {
	s.Name = &v
	return s
}

func (s *ArTemplate) SetOrgNo(v string) *ArTemplate {
	s.OrgNo = &v
	return s
}

func (s *ArTemplate) SetOrgType(v string) *ArTemplate {
	s.OrgType = &v
	return s
}

func (s *ArTemplate) SetPdfOssKey(v string) *ArTemplate {
	s.PdfOssKey = &v
	return s
}

func (s *ArTemplate) SetVarJson(v string) *ArTemplate {
	s.VarJson = &v
	return s
}

func (s *ArTemplate) SetSignAreaJson(v string) *ArTemplate {
	s.SignAreaJson = &v
	return s
}

// 房屋抵押信息
type HouseMgInfo struct {
	// 债权金额，人民币默认单位元，保留两位小数点
	DebtAmount *string `json:"debt_amount,omitempty" xml:"debt_amount,omitempty"`
	// 债权金额货币类型，比如：CNY=人民币
	DebtAmountCurrency *string `json:"debt_amount_currency,omitempty" xml:"debt_amount_currency,omitempty"`
	// 抵押权人证件号码
	MortgageeCertNo *string `json:"mortgagee_cert_no,omitempty" xml:"mortgagee_cert_no,omitempty"`
	// 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
	MortgageeCertType *string `json:"mortgagee_cert_type,omitempty" xml:"mortgagee_cert_type,omitempty"`
	// 抵押权人名称
	MortgageeName *string `json:"mortgagee_name,omitempty" xml:"mortgagee_name,omitempty"`
	// 履债结束日期
	DebtEndDate *string `json:"debt_end_date,omitempty" xml:"debt_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 履债起始日期
	DebtStartDate *string `json:"debt_start_date,omitempty" xml:"debt_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 登记时间
	RegisteredDate *string `json:"registered_date,omitempty" xml:"registered_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 房产链内部房产编号
	HouseNo *string `json:"house_no,omitempty" xml:"house_no,omitempty"`
}

func (s HouseMgInfo) String() string {
	return tea.Prettify(s)
}

func (s HouseMgInfo) GoString() string {
	return s.String()
}

func (s *HouseMgInfo) SetDebtAmount(v string) *HouseMgInfo {
	s.DebtAmount = &v
	return s
}

func (s *HouseMgInfo) SetDebtAmountCurrency(v string) *HouseMgInfo {
	s.DebtAmountCurrency = &v
	return s
}

func (s *HouseMgInfo) SetMortgageeCertNo(v string) *HouseMgInfo {
	s.MortgageeCertNo = &v
	return s
}

func (s *HouseMgInfo) SetMortgageeCertType(v string) *HouseMgInfo {
	s.MortgageeCertType = &v
	return s
}

func (s *HouseMgInfo) SetMortgageeName(v string) *HouseMgInfo {
	s.MortgageeName = &v
	return s
}

func (s *HouseMgInfo) SetDebtEndDate(v string) *HouseMgInfo {
	s.DebtEndDate = &v
	return s
}

func (s *HouseMgInfo) SetDebtStartDate(v string) *HouseMgInfo {
	s.DebtStartDate = &v
	return s
}

func (s *HouseMgInfo) SetRegisteredDate(v string) *HouseMgInfo {
	s.RegisteredDate = &v
	return s
}

func (s *HouseMgInfo) SetHouseNo(v string) *HouseMgInfo {
	s.HouseNo = &v
	return s
}

// 房产限制信息
type HouseRestrictionInfo struct {
	// 申请人
	//
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty"`
	// 限制结束日期
	RestrictionEndDate *string `json:"restriction_end_date,omitempty" xml:"restriction_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 限制起始日期
	RestrictionStartDate *string `json:"restriction_start_date,omitempty" xml:"restriction_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 来文单位
	FromOrgName *string `json:"from_org_name,omitempty" xml:"from_org_name,omitempty"`
	// 登记时间
	RegisterTime *string `json:"register_time,omitempty" xml:"register_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 限制金额，人民币默认单位元，保留两位小数点
	RestrictedAmount *string `json:"restricted_amount,omitempty" xml:"restricted_amount,omitempty"`
	// 限制金额货币类型，比如：CNY=人民币
	RestrictedAmountCurrency *string `json:"restricted_amount_currency,omitempty" xml:"restricted_amount_currency,omitempty"`
	// 限制文号
	RestrictionNo *string `json:"restriction_no,omitempty" xml:"restriction_no,omitempty"`
	// 房产链内部房产编号
	HouseNo *string `json:"house_no,omitempty" xml:"house_no,omitempty"`
}

func (s HouseRestrictionInfo) String() string {
	return tea.Prettify(s)
}

func (s HouseRestrictionInfo) GoString() string {
	return s.String()
}

func (s *HouseRestrictionInfo) SetApplicant(v string) *HouseRestrictionInfo {
	s.Applicant = &v
	return s
}

func (s *HouseRestrictionInfo) SetRestrictionEndDate(v string) *HouseRestrictionInfo {
	s.RestrictionEndDate = &v
	return s
}

func (s *HouseRestrictionInfo) SetRestrictionStartDate(v string) *HouseRestrictionInfo {
	s.RestrictionStartDate = &v
	return s
}

func (s *HouseRestrictionInfo) SetFromOrgName(v string) *HouseRestrictionInfo {
	s.FromOrgName = &v
	return s
}

func (s *HouseRestrictionInfo) SetRegisterTime(v string) *HouseRestrictionInfo {
	s.RegisterTime = &v
	return s
}

func (s *HouseRestrictionInfo) SetRestrictedAmount(v string) *HouseRestrictionInfo {
	s.RestrictedAmount = &v
	return s
}

func (s *HouseRestrictionInfo) SetRestrictedAmountCurrency(v string) *HouseRestrictionInfo {
	s.RestrictedAmountCurrency = &v
	return s
}

func (s *HouseRestrictionInfo) SetRestrictionNo(v string) *HouseRestrictionInfo {
	s.RestrictionNo = &v
	return s
}

func (s *HouseRestrictionInfo) SetHouseNo(v string) *HouseRestrictionInfo {
	s.HouseNo = &v
	return s
}

// 签署信息
type SignInfo struct {
	// 签署人
	Signer *EntityBasicInfo `json:"signer,omitempty" xml:"signer,omitempty" require:"true"`
	// 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
	SignType *string `json:"sign_type,omitempty" xml:"sign_type,omitempty" require:"true"`
	// 签署页码
	SignPage *int64 `json:"sign_page,omitempty" xml:"sign_page,omitempty" require:"true"`
	// 签署x坐标
	SignPositionX *string `json:"sign_position_x,omitempty" xml:"sign_position_x,omitempty" require:"true"`
	// 签署y坐标
	SignPositionY *string `json:"sign_position_y,omitempty" xml:"sign_position_y,omitempty" require:"true"`
}

func (s SignInfo) String() string {
	return tea.Prettify(s)
}

func (s SignInfo) GoString() string {
	return s.String()
}

func (s *SignInfo) SetSigner(v *EntityBasicInfo) *SignInfo {
	s.Signer = v
	return s
}

func (s *SignInfo) SetSignType(v string) *SignInfo {
	s.SignType = &v
	return s
}

func (s *SignInfo) SetSignPage(v int64) *SignInfo {
	s.SignPage = &v
	return s
}

func (s *SignInfo) SetSignPositionX(v string) *SignInfo {
	s.SignPositionX = &v
	return s
}

func (s *SignInfo) SetSignPositionY(v string) *SignInfo {
	s.SignPositionY = &v
	return s
}

// 电子签约相关配置
type ArSignConfig struct {
	// 签约者类型，比如：BANK=银行
	ArSignerType *string `json:"ar_signer_type,omitempty" xml:"ar_signer_type,omitempty"`
	// 签署区列表
	ArSignFields []*ArSignField `json:"ar_sign_fields,omitempty" xml:"ar_sign_fields,omitempty" type:"Repeated"`
	// 签署人
	Signer *Person `json:"signer,omitempty" xml:"signer,omitempty"`
}

func (s ArSignConfig) String() string {
	return tea.Prettify(s)
}

func (s ArSignConfig) GoString() string {
	return s.String()
}

func (s *ArSignConfig) SetArSignerType(v string) *ArSignConfig {
	s.ArSignerType = &v
	return s
}

func (s *ArSignConfig) SetArSignFields(v []*ArSignField) *ArSignConfig {
	s.ArSignFields = v
	return s
}

func (s *ArSignConfig) SetSigner(v *Person) *ArSignConfig {
	s.Signer = v
	return s
}

// 产权人
type HouseOwner struct {
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 身份证正面照片存储路径
	CertFrontPicOssKey *string `json:"cert_front_pic_oss_key,omitempty" xml:"cert_front_pic_oss_key,omitempty"`
	// 身份证反面照片存储路径
	CertBackPicOssKey *string `json:"cert_back_pic_oss_key,omitempty" xml:"cert_back_pic_oss_key,omitempty"`
	// 权利人主体类型，PERSON=个人
	ObligeeType *string `json:"obligee_type,omitempty" xml:"obligee_type,omitempty"`
	// 权利人类型
	ObligeeRole *string `json:"obligee_role,omitempty" xml:"obligee_role,omitempty"`
	// 共有情况
	OwnershipStatus *string `json:"ownership_status,omitempty" xml:"ownership_status,omitempty"`
	// 权证类型
	HouseCertType *string `json:"house_cert_type,omitempty" xml:"house_cert_type,omitempty"`
	// 权证号
	HouseCertNo *string `json:"house_cert_no,omitempty" xml:"house_cert_no,omitempty"`
	// 权利比例
	RightsRate *string `json:"rights_rate,omitempty" xml:"rights_rate,omitempty"`
	// 房产链内部客户编号
	CmNo *string `json:"cm_no,omitempty" xml:"cm_no,omitempty"`
	// 房产链内部房产编号
	HouseNo *string `json:"house_no,omitempty" xml:"house_no,omitempty"`
}

func (s HouseOwner) String() string {
	return tea.Prettify(s)
}

func (s HouseOwner) GoString() string {
	return s.String()
}

func (s *HouseOwner) SetName(v string) *HouseOwner {
	s.Name = &v
	return s
}

func (s *HouseOwner) SetCertType(v string) *HouseOwner {
	s.CertType = &v
	return s
}

func (s *HouseOwner) SetCertNo(v string) *HouseOwner {
	s.CertNo = &v
	return s
}

func (s *HouseOwner) SetMobile(v string) *HouseOwner {
	s.Mobile = &v
	return s
}

func (s *HouseOwner) SetCertFrontPicOssKey(v string) *HouseOwner {
	s.CertFrontPicOssKey = &v
	return s
}

func (s *HouseOwner) SetCertBackPicOssKey(v string) *HouseOwner {
	s.CertBackPicOssKey = &v
	return s
}

func (s *HouseOwner) SetObligeeType(v string) *HouseOwner {
	s.ObligeeType = &v
	return s
}

func (s *HouseOwner) SetObligeeRole(v string) *HouseOwner {
	s.ObligeeRole = &v
	return s
}

func (s *HouseOwner) SetOwnershipStatus(v string) *HouseOwner {
	s.OwnershipStatus = &v
	return s
}

func (s *HouseOwner) SetHouseCertType(v string) *HouseOwner {
	s.HouseCertType = &v
	return s
}

func (s *HouseOwner) SetHouseCertNo(v string) *HouseOwner {
	s.HouseCertNo = &v
	return s
}

func (s *HouseOwner) SetRightsRate(v string) *HouseOwner {
	s.RightsRate = &v
	return s
}

func (s *HouseOwner) SetCmNo(v string) *HouseOwner {
	s.CmNo = &v
	return s
}

func (s *HouseOwner) SetHouseNo(v string) *HouseOwner {
	s.HouseNo = &v
	return s
}

// 合同
type Agreement struct {
	// 电子合同pdf文件存储路径
	ArArchiveOssPath *string `json:"ar_archive_oss_path,omitempty" xml:"ar_archive_oss_path,omitempty"`
	// 合同编号
	ArNo *string `json:"ar_no,omitempty" xml:"ar_no,omitempty"`
	// 合同模版
	ArTemplate *ArTemplate `json:"ar_template,omitempty" xml:"ar_template,omitempty"`
	// 合同类型，比如：房屋查询授权合同
	ArType *string `json:"ar_type,omitempty" xml:"ar_type,omitempty"`
	// 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
	ArSignerRoles []*string `json:"ar_signer_roles,omitempty" xml:"ar_signer_roles,omitempty" type:"Repeated"`
	// 合同模版需要的变量和值集合,Map<String,String>的json格式
	ArVarValueJson *string `json:"ar_var_value_json,omitempty" xml:"ar_var_value_json,omitempty"`
	// 区块链智能合同合同文件号
	MycFileNo *string `json:"myc_file_no,omitempty" xml:"myc_file_no,omitempty"`
	// 外部合同编号(银行生成)
	OutArNo *string `json:"out_ar_no,omitempty" xml:"out_ar_no,omitempty"`
	// 合同签署流程编号
	ProcNo *string `json:"proc_no,omitempty" xml:"proc_no,omitempty"`
	// 合同签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 签署状态，比如：SUCC=签署完成
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 待签署的合同文档oss存储路径，仅当不动产合同才有
	UnSignArArchiveOssPath *string `json:"un_sign_ar_archive_oss_path,omitempty" xml:"un_sign_ar_archive_oss_path,omitempty"`
	// 合同生成方式，AR_TP=模版
	ArGenerateType *string `json:"ar_generate_type,omitempty" xml:"ar_generate_type,omitempty"`
	// 智能合同部分的签署区设置
	CtSignConfigs []*ArSignConfig `json:"ct_sign_configs,omitempty" xml:"ct_sign_configs,omitempty" type:"Repeated"`
	// 机构自主签署部分的签署区设置
	OrgSignConfigs []*ArSignConfig `json:"org_sign_configs,omitempty" xml:"org_sign_configs,omitempty" type:"Repeated"`
	// 机构签署状态，SUCC=签署完成
	OrgSignStatus *string `json:"org_sign_status,omitempty" xml:"org_sign_status,omitempty"`
	// 机构签署完成时间
	OrgSignTime *string `json:"org_sign_time,omitempty" xml:"org_sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 机构签署完成后的合同存储路径
	OrgArArchiveOssPath *string `json:"org_ar_archive_oss_path,omitempty" xml:"org_ar_archive_oss_path,omitempty"`
	// 最终签署完成的合同存储路径
	FinalArArchiveOssPath *string `json:"final_ar_archive_oss_path,omitempty" xml:"final_ar_archive_oss_path,omitempty"`
}

func (s Agreement) String() string {
	return tea.Prettify(s)
}

func (s Agreement) GoString() string {
	return s.String()
}

func (s *Agreement) SetArArchiveOssPath(v string) *Agreement {
	s.ArArchiveOssPath = &v
	return s
}

func (s *Agreement) SetArNo(v string) *Agreement {
	s.ArNo = &v
	return s
}

func (s *Agreement) SetArTemplate(v *ArTemplate) *Agreement {
	s.ArTemplate = v
	return s
}

func (s *Agreement) SetArType(v string) *Agreement {
	s.ArType = &v
	return s
}

func (s *Agreement) SetArSignerRoles(v []*string) *Agreement {
	s.ArSignerRoles = v
	return s
}

func (s *Agreement) SetArVarValueJson(v string) *Agreement {
	s.ArVarValueJson = &v
	return s
}

func (s *Agreement) SetMycFileNo(v string) *Agreement {
	s.MycFileNo = &v
	return s
}

func (s *Agreement) SetOutArNo(v string) *Agreement {
	s.OutArNo = &v
	return s
}

func (s *Agreement) SetProcNo(v string) *Agreement {
	s.ProcNo = &v
	return s
}

func (s *Agreement) SetSignTime(v string) *Agreement {
	s.SignTime = &v
	return s
}

func (s *Agreement) SetStatus(v string) *Agreement {
	s.Status = &v
	return s
}

func (s *Agreement) SetUnSignArArchiveOssPath(v string) *Agreement {
	s.UnSignArArchiveOssPath = &v
	return s
}

func (s *Agreement) SetArGenerateType(v string) *Agreement {
	s.ArGenerateType = &v
	return s
}

func (s *Agreement) SetCtSignConfigs(v []*ArSignConfig) *Agreement {
	s.CtSignConfigs = v
	return s
}

func (s *Agreement) SetOrgSignConfigs(v []*ArSignConfig) *Agreement {
	s.OrgSignConfigs = v
	return s
}

func (s *Agreement) SetOrgSignStatus(v string) *Agreement {
	s.OrgSignStatus = &v
	return s
}

func (s *Agreement) SetOrgSignTime(v string) *Agreement {
	s.OrgSignTime = &v
	return s
}

func (s *Agreement) SetOrgArArchiveOssPath(v string) *Agreement {
	s.OrgArArchiveOssPath = &v
	return s
}

func (s *Agreement) SetFinalArArchiveOssPath(v string) *Agreement {
	s.FinalArArchiveOssPath = &v
	return s
}

// 抵押登记权证
type MgCert struct {
	// 房产编号
	HouseNo *string `json:"house_no,omitempty" xml:"house_no,omitempty"`
	// 坐落
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 抵押登记回执编号
	MgCertNo *string `json:"mg_cert_no,omitempty" xml:"mg_cert_no,omitempty"`
	// 新他项权证号
	NewOtherRightCertNo *string `json:"new_other_right_cert_no,omitempty" xml:"new_other_right_cert_no,omitempty"`
	// 新他项权证电子证照地址
	NewOtherRightCertPath *string `json:"new_other_right_cert_path,omitempty" xml:"new_other_right_cert_path,omitempty"`
	// 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
	NewOtherRightCertType *string `json:"new_other_right_cert_type,omitempty" xml:"new_other_right_cert_type,omitempty"`
	// 权利人
	MortgageeJson *string `json:"mortgagee_json,omitempty" xml:"mortgagee_json,omitempty"`
	// 抵押义务人
	MortgagorJson *string `json:"mortgagor_json,omitempty" xml:"mortgagor_json,omitempty"`
	// 证明权力或事项
	Proof *string `json:"proof,omitempty" xml:"proof,omitempty"`
	// 不动产返回其他信息
	Other *string `json:"other,omitempty" xml:"other,omitempty"`
	// 不动产返回附记信息
	Supplement *string `json:"supplement,omitempty" xml:"supplement,omitempty"`
	// 发证工本号
	LicenseNumber *string `json:"license_number,omitempty" xml:"license_number,omitempty"`
	// 缮证人
	Printer *string `json:"printer,omitempty" xml:"printer,omitempty"`
	// 缮证时间
	PrintTime *string `json:"print_time,omitempty" xml:"print_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发证人
	Issuer *string `json:"issuer,omitempty" xml:"issuer,omitempty"`
	// 发证时间
	IssuanceTime *string `json:"issuance_time,omitempty" xml:"issuance_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 区县代码
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 省编号
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty"`
	// 不动产单元号
	HouseUnitCode *string `json:"house_unit_code,omitempty" xml:"house_unit_code,omitempty"`
	// 是否在房产链已解抵
	Released *string `json:"released,omitempty" xml:"released,omitempty"`
	// 房产链内部解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty"`
	// 登记证明种类,MORTGAGE=抵押权证明
	RegCertType *string `json:"reg_cert_type,omitempty" xml:"reg_cert_type,omitempty"`
	// 发证机关
	IssuingAuthority *string `json:"issuing_authority,omitempty" xml:"issuing_authority,omitempty"`
	// 债权金额
	DebtAmt *string `json:"debt_amt,omitempty" xml:"debt_amt,omitempty"`
	// 抵押权开始时间
	MgRightStartDate *string `json:"mg_right_start_date,omitempty" xml:"mg_right_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押权结束日期
	MgRightEndDate *string `json:"mg_right_end_date,omitempty" xml:"mg_right_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押方式，MAX_AMOUNT_MORT=最高额抵押
	MortgageType *string `json:"mortgage_type,omitempty" xml:"mortgage_type,omitempty"`
}

func (s MgCert) String() string {
	return tea.Prettify(s)
}

func (s MgCert) GoString() string {
	return s.String()
}

func (s *MgCert) SetHouseNo(v string) *MgCert {
	s.HouseNo = &v
	return s
}

func (s *MgCert) SetLocation(v string) *MgCert {
	s.Location = &v
	return s
}

func (s *MgCert) SetMgCertNo(v string) *MgCert {
	s.MgCertNo = &v
	return s
}

func (s *MgCert) SetNewOtherRightCertNo(v string) *MgCert {
	s.NewOtherRightCertNo = &v
	return s
}

func (s *MgCert) SetNewOtherRightCertPath(v string) *MgCert {
	s.NewOtherRightCertPath = &v
	return s
}

func (s *MgCert) SetNewOtherRightCertType(v string) *MgCert {
	s.NewOtherRightCertType = &v
	return s
}

func (s *MgCert) SetMortgageeJson(v string) *MgCert {
	s.MortgageeJson = &v
	return s
}

func (s *MgCert) SetMortgagorJson(v string) *MgCert {
	s.MortgagorJson = &v
	return s
}

func (s *MgCert) SetProof(v string) *MgCert {
	s.Proof = &v
	return s
}

func (s *MgCert) SetOther(v string) *MgCert {
	s.Other = &v
	return s
}

func (s *MgCert) SetSupplement(v string) *MgCert {
	s.Supplement = &v
	return s
}

func (s *MgCert) SetLicenseNumber(v string) *MgCert {
	s.LicenseNumber = &v
	return s
}

func (s *MgCert) SetPrinter(v string) *MgCert {
	s.Printer = &v
	return s
}

func (s *MgCert) SetPrintTime(v string) *MgCert {
	s.PrintTime = &v
	return s
}

func (s *MgCert) SetIssuer(v string) *MgCert {
	s.Issuer = &v
	return s
}

func (s *MgCert) SetIssuanceTime(v string) *MgCert {
	s.IssuanceTime = &v
	return s
}

func (s *MgCert) SetDistrictCode(v string) *MgCert {
	s.DistrictCode = &v
	return s
}

func (s *MgCert) SetProvinceCode(v string) *MgCert {
	s.ProvinceCode = &v
	return s
}

func (s *MgCert) SetHouseUnitCode(v string) *MgCert {
	s.HouseUnitCode = &v
	return s
}

func (s *MgCert) SetReleased(v string) *MgCert {
	s.Released = &v
	return s
}

func (s *MgCert) SetMgReleaseOrderNo(v string) *MgCert {
	s.MgReleaseOrderNo = &v
	return s
}

func (s *MgCert) SetRegCertType(v string) *MgCert {
	s.RegCertType = &v
	return s
}

func (s *MgCert) SetIssuingAuthority(v string) *MgCert {
	s.IssuingAuthority = &v
	return s
}

func (s *MgCert) SetDebtAmt(v string) *MgCert {
	s.DebtAmt = &v
	return s
}

func (s *MgCert) SetMgRightStartDate(v string) *MgCert {
	s.MgRightStartDate = &v
	return s
}

func (s *MgCert) SetMgRightEndDate(v string) *MgCert {
	s.MgRightEndDate = &v
	return s
}

func (s *MgCert) SetMortgageType(v string) *MgCert {
	s.MortgageType = &v
	return s
}

// 银行
type Bank struct {
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 法人证件号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人手机号
	LegalPersonMobile *string `json:"legal_person_mobile,omitempty" xml:"legal_person_mobile,omitempty"`
	// 法人姓名
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 行内级别，比如：SUB_BRANCH=支行
	Level *string `json:"level,omitempty" xml:"level,omitempty"`
	// 蚂蚁智能合同的机构id
	MycOrgId *string `json:"myc_org_id,omitempty" xml:"myc_org_id,omitempty"`
	// 银行名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// OSS存储跟路径
	OssBaseFold *string `json:"oss_base_fold,omitempty" xml:"oss_base_fold,omitempty"`
	// 银行证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 上级行号，比如支行对应的分行
	ParentBankNo *string `json:"parent_bank_no,omitempty" xml:"parent_bank_no,omitempty"`
	// 蚂蚁链隐私数据网络的身份id
	PdnDid *string `json:"pdn_did,omitempty" xml:"pdn_did,omitempty"`
	// 公钥
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 法人证件类型，比如：ID_CARD=身份证
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 授权合同签署后小程序端的回跳地址
	AuthCallbackUrl *string `json:"auth_callback_url,omitempty" xml:"auth_callback_url,omitempty"`
	// 抵押登记相关合同签署后小程序端的回跳地址
	MgCallbackUrl *string `json:"mg_callback_url,omitempty" xml:"mg_callback_url,omitempty"`
	// 银行接收房产链通知接口地址
	BkCallbackUrl *string `json:"bk_callback_url,omitempty" xml:"bk_callback_url,omitempty"`
	// 银行证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
}

func (s Bank) String() string {
	return tea.Prettify(s)
}

func (s Bank) GoString() string {
	return s.String()
}

func (s *Bank) SetAddress(v string) *Bank {
	s.Address = &v
	return s
}

func (s *Bank) SetBankNo(v string) *Bank {
	s.BankNo = &v
	return s
}

func (s *Bank) SetLegalPersonCertNo(v string) *Bank {
	s.LegalPersonCertNo = &v
	return s
}

func (s *Bank) SetLegalPersonMobile(v string) *Bank {
	s.LegalPersonMobile = &v
	return s
}

func (s *Bank) SetLegalPersonName(v string) *Bank {
	s.LegalPersonName = &v
	return s
}

func (s *Bank) SetLevel(v string) *Bank {
	s.Level = &v
	return s
}

func (s *Bank) SetMycOrgId(v string) *Bank {
	s.MycOrgId = &v
	return s
}

func (s *Bank) SetName(v string) *Bank {
	s.Name = &v
	return s
}

func (s *Bank) SetOssBaseFold(v string) *Bank {
	s.OssBaseFold = &v
	return s
}

func (s *Bank) SetCertNo(v string) *Bank {
	s.CertNo = &v
	return s
}

func (s *Bank) SetParentBankNo(v string) *Bank {
	s.ParentBankNo = &v
	return s
}

func (s *Bank) SetPdnDid(v string) *Bank {
	s.PdnDid = &v
	return s
}

func (s *Bank) SetPubKey(v string) *Bank {
	s.PubKey = &v
	return s
}

func (s *Bank) SetTenantId(v string) *Bank {
	s.TenantId = &v
	return s
}

func (s *Bank) SetLegalPersonCertType(v string) *Bank {
	s.LegalPersonCertType = &v
	return s
}

func (s *Bank) SetAuthCallbackUrl(v string) *Bank {
	s.AuthCallbackUrl = &v
	return s
}

func (s *Bank) SetMgCallbackUrl(v string) *Bank {
	s.MgCallbackUrl = &v
	return s
}

func (s *Bank) SetBkCallbackUrl(v string) *Bank {
	s.BkCallbackUrl = &v
	return s
}

func (s *Bank) SetCertType(v string) *Bank {
	s.CertType = &v
	return s
}

// 附件材料
type Archive struct {
	// 附件内容的Hash值
	ArchiveHash *string `json:"archive_hash,omitempty" xml:"archive_hash,omitempty"`
	// 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
	ArchiveType *string `json:"archive_type,omitempty" xml:"archive_type,omitempty"`
	// 移动后到银行目录下的oss存储路径
	BankOssKey *string `json:"bank_oss_key,omitempty" xml:"bank_oss_key,omitempty"`
	// 附件KEY，也是oss的存储路径，原始保存路径
	OssKey *string `json:"oss_key,omitempty" xml:"oss_key,omitempty"`
	// 附件来源外部业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 机构编号
	OwnerNo *string `json:"owner_no,omitempty" xml:"owner_no,omitempty"`
	// 附件材料归属机构类型，比如：BANK=银行
	OwnerType *string `json:"owner_type,omitempty" xml:"owner_type,omitempty"`
	// 移动到不动产中心目录下的oss存储路径
	RtcOssKey *string `json:"rtc_oss_key,omitempty" xml:"rtc_oss_key,omitempty"`
	// 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 房产链平台的存储路径
	RcpOssKey *string `json:"rcp_oss_key,omitempty" xml:"rcp_oss_key,omitempty"`
	// 助贷平台的访问路径
	LoanAssistPlatformOssKey *string `json:"loan_assist_platform_oss_key,omitempty" xml:"loan_assist_platform_oss_key,omitempty"`
}

func (s Archive) String() string {
	return tea.Prettify(s)
}

func (s Archive) GoString() string {
	return s.String()
}

func (s *Archive) SetArchiveHash(v string) *Archive {
	s.ArchiveHash = &v
	return s
}

func (s *Archive) SetArchiveType(v string) *Archive {
	s.ArchiveType = &v
	return s
}

func (s *Archive) SetBankOssKey(v string) *Archive {
	s.BankOssKey = &v
	return s
}

func (s *Archive) SetOssKey(v string) *Archive {
	s.OssKey = &v
	return s
}

func (s *Archive) SetOutBizNo(v string) *Archive {
	s.OutBizNo = &v
	return s
}

func (s *Archive) SetOwnerNo(v string) *Archive {
	s.OwnerNo = &v
	return s
}

func (s *Archive) SetOwnerType(v string) *Archive {
	s.OwnerType = &v
	return s
}

func (s *Archive) SetRtcOssKey(v string) *Archive {
	s.RtcOssKey = &v
	return s
}

func (s *Archive) SetScene(v string) *Archive {
	s.Scene = &v
	return s
}

func (s *Archive) SetRcpOssKey(v string) *Archive {
	s.RcpOssKey = &v
	return s
}

func (s *Archive) SetLoanAssistPlatformOssKey(v string) *Archive {
	s.LoanAssistPlatformOssKey = &v
	return s
}

// 房产
type House struct {
	// 房屋所在区/县地区编码
	AreaCode *string `json:"area_code,omitempty" xml:"area_code,omitempty"`
	// 是否有异议，Y-是，N-否
	Claimed *string `json:"claimed,omitempty" xml:"claimed,omitempty"`
	// 是否有文件备案
	FileRecorded *string `json:"file_recorded,omitempty" xml:"file_recorded,omitempty"`
	// 产证编号
	HouseCertNo *string `json:"house_cert_no,omitempty" xml:"house_cert_no,omitempty"`
	// 权证类型，比如：HOUSE_CERT=房屋所有权证
	HouseCertType *string `json:"house_cert_type,omitempty" xml:"house_cert_type,omitempty"`
	// 房产编号
	HouseCode *string `json:"house_code,omitempty" xml:"house_code,omitempty"`
	// 抵押信息列表
	HouseMgInfos []*HouseMgInfo `json:"house_mg_infos,omitempty" xml:"house_mg_infos,omitempty" type:"Repeated"`
	// 房产编号
	HouseNo *string `json:"house_no,omitempty" xml:"house_no,omitempty"`
	// 产权人列表
	HouseOwners []*HouseOwner `json:"house_owners,omitempty" xml:"house_owners,omitempty" type:"Repeated"`
	// 限制信息列表
	HouseRestrictionInfos []*HouseRestrictionInfo `json:"house_restriction_infos,omitempty" xml:"house_restriction_infos,omitempty" type:"Repeated"`
	// 不动产单元号
	HouseUnitCode *string `json:"house_unit_code,omitempty" xml:"house_unit_code,omitempty"`
	// 不动产单元号，待废弃字段
	HouseUnitCodes []*string `json:"house_unit_codes,omitempty" xml:"house_unit_codes,omitempty" type:"Repeated"`
	// 隐形产权人列表
	InvisibleHouseOwners []*HouseOwner `json:"invisible_house_owners,omitempty" xml:"invisible_house_owners,omitempty" type:"Repeated"`
	// 房屋所在地址信息
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 是否有抵押，Y-是，N-否
	Mortgaged *string `json:"mortgaged,omitempty" xml:"mortgaged,omitempty"`
	// 共有情况,比如：SHARE_COOWNER=共同共有
	OwnershipStatus *string `json:"ownership_status,omitempty" xml:"ownership_status,omitempty"`
	// 数据获取时间
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用途,比如：HOUSE=住宅
	RealtyUsage *string `json:"realty_usage,omitempty" xml:"realty_usage,omitempty"`
	// 是否有查封：Y-是，N-否
	Seized *string `json:"seized,omitempty" xml:"seized,omitempty"`
	// 土地分摊面积
	SharingLandArea *string `json:"sharing_land_area,omitempty" xml:"sharing_land_area,omitempty"`
	// 土地分摊面积单位，比如：SQUARE_METER=平方米
	SharingLandAreaUnit *string `json:"sharing_land_area_unit,omitempty" xml:"sharing_land_area_unit,omitempty"`
	// 当前产证归属的房产链产权人内部编号
	HouseOwnerCmNo *string `json:"house_owner_cm_no,omitempty" xml:"house_owner_cm_no,omitempty"`
	// 建筑面积
	StructureArea *string `json:"structure_area,omitempty" xml:"structure_area,omitempty"`
	// 建筑面积单位，比如：SQUARE_METER=平方米
	StructureAreaUnit *string `json:"structure_area_unit,omitempty" xml:"structure_area_unit,omitempty"`
	// 权利性质
	RightsNature *string `json:"rights_nature,omitempty" xml:"rights_nature,omitempty"`
	// 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
	RightsType *string `json:"rights_type,omitempty" xml:"rights_type,omitempty"`
	// 房屋性质,COMMERCIAL_HOUSING=商品房
	HouseNature *string `json:"house_nature,omitempty" xml:"house_nature,omitempty"`
	// 土地证号
	LandCertNo *string `json:"land_cert_no,omitempty" xml:"land_cert_no,omitempty"`
	// 土地用途
	LandUsage *string `json:"land_usage,omitempty" xml:"land_usage,omitempty"`
	// 土地性质,SELL=出让
	LandNature *string `json:"land_nature,omitempty" xml:"land_nature,omitempty"`
	// 土地使用权开始日期
	LandUseStartDate *string `json:"land_use_start_date,omitempty" xml:"land_use_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 土地使用权终止日期
	LandUseEndDate *string `json:"land_use_end_date,omitempty" xml:"land_use_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 总层数
	TotalFloor *string `json:"total_floor,omitempty" xml:"total_floor,omitempty"`
	// 所在层
	ItsFloor *string `json:"its_floor,omitempty" xml:"its_floor,omitempty"`
	// 建造年份
	BuiltYear *string `json:"built_year,omitempty" xml:"built_year,omitempty"`
	// 登薄日期
	RegDate *string `json:"reg_date,omitempty" xml:"reg_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 证书附记备注
	CertRemark *string `json:"cert_remark,omitempty" xml:"cert_remark,omitempty"`
	// 证书状态描述
	CertStatus *string `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
}

func (s House) String() string {
	return tea.Prettify(s)
}

func (s House) GoString() string {
	return s.String()
}

func (s *House) SetAreaCode(v string) *House {
	s.AreaCode = &v
	return s
}

func (s *House) SetClaimed(v string) *House {
	s.Claimed = &v
	return s
}

func (s *House) SetFileRecorded(v string) *House {
	s.FileRecorded = &v
	return s
}

func (s *House) SetHouseCertNo(v string) *House {
	s.HouseCertNo = &v
	return s
}

func (s *House) SetHouseCertType(v string) *House {
	s.HouseCertType = &v
	return s
}

func (s *House) SetHouseCode(v string) *House {
	s.HouseCode = &v
	return s
}

func (s *House) SetHouseMgInfos(v []*HouseMgInfo) *House {
	s.HouseMgInfos = v
	return s
}

func (s *House) SetHouseNo(v string) *House {
	s.HouseNo = &v
	return s
}

func (s *House) SetHouseOwners(v []*HouseOwner) *House {
	s.HouseOwners = v
	return s
}

func (s *House) SetHouseRestrictionInfos(v []*HouseRestrictionInfo) *House {
	s.HouseRestrictionInfos = v
	return s
}

func (s *House) SetHouseUnitCode(v string) *House {
	s.HouseUnitCode = &v
	return s
}

func (s *House) SetHouseUnitCodes(v []*string) *House {
	s.HouseUnitCodes = v
	return s
}

func (s *House) SetInvisibleHouseOwners(v []*HouseOwner) *House {
	s.InvisibleHouseOwners = v
	return s
}

func (s *House) SetLocation(v string) *House {
	s.Location = &v
	return s
}

func (s *House) SetMortgaged(v string) *House {
	s.Mortgaged = &v
	return s
}

func (s *House) SetOwnershipStatus(v string) *House {
	s.OwnershipStatus = &v
	return s
}

func (s *House) SetQueryTime(v string) *House {
	s.QueryTime = &v
	return s
}

func (s *House) SetRealtyUsage(v string) *House {
	s.RealtyUsage = &v
	return s
}

func (s *House) SetSeized(v string) *House {
	s.Seized = &v
	return s
}

func (s *House) SetSharingLandArea(v string) *House {
	s.SharingLandArea = &v
	return s
}

func (s *House) SetSharingLandAreaUnit(v string) *House {
	s.SharingLandAreaUnit = &v
	return s
}

func (s *House) SetHouseOwnerCmNo(v string) *House {
	s.HouseOwnerCmNo = &v
	return s
}

func (s *House) SetStructureArea(v string) *House {
	s.StructureArea = &v
	return s
}

func (s *House) SetStructureAreaUnit(v string) *House {
	s.StructureAreaUnit = &v
	return s
}

func (s *House) SetRightsNature(v string) *House {
	s.RightsNature = &v
	return s
}

func (s *House) SetRightsType(v string) *House {
	s.RightsType = &v
	return s
}

func (s *House) SetHouseNature(v string) *House {
	s.HouseNature = &v
	return s
}

func (s *House) SetLandCertNo(v string) *House {
	s.LandCertNo = &v
	return s
}

func (s *House) SetLandUsage(v string) *House {
	s.LandUsage = &v
	return s
}

func (s *House) SetLandNature(v string) *House {
	s.LandNature = &v
	return s
}

func (s *House) SetLandUseStartDate(v string) *House {
	s.LandUseStartDate = &v
	return s
}

func (s *House) SetLandUseEndDate(v string) *House {
	s.LandUseEndDate = &v
	return s
}

func (s *House) SetTotalFloor(v string) *House {
	s.TotalFloor = &v
	return s
}

func (s *House) SetItsFloor(v string) *House {
	s.ItsFloor = &v
	return s
}

func (s *House) SetBuiltYear(v string) *House {
	s.BuiltYear = &v
	return s
}

func (s *House) SetRegDate(v string) *House {
	s.RegDate = &v
	return s
}

func (s *House) SetCertRemark(v string) *House {
	s.CertRemark = &v
	return s
}

func (s *House) SetCertStatus(v string) *House {
	s.CertStatus = &v
	return s
}

// 合同签署任务
type ArSignTask struct {
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型，比如：ID_CARD=身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 客户编号
	CmNo *string `json:"cm_no,omitempty" xml:"cm_no,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 签署流程编号
	ProcNo *string `json:"proc_no,omitempty" xml:"proc_no,omitempty"`
	// 合同签署地址
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
	// 签署状态 ，比如：INIT=待签署
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 智慧合同签署账号id
	MycAccountId *string `json:"myc_account_id,omitempty" xml:"myc_account_id,omitempty"`
}

func (s ArSignTask) String() string {
	return tea.Prettify(s)
}

func (s ArSignTask) GoString() string {
	return s.String()
}

func (s *ArSignTask) SetCertNo(v string) *ArSignTask {
	s.CertNo = &v
	return s
}

func (s *ArSignTask) SetCertType(v string) *ArSignTask {
	s.CertType = &v
	return s
}

func (s *ArSignTask) SetCmNo(v string) *ArSignTask {
	s.CmNo = &v
	return s
}

func (s *ArSignTask) SetName(v string) *ArSignTask {
	s.Name = &v
	return s
}

func (s *ArSignTask) SetProcNo(v string) *ArSignTask {
	s.ProcNo = &v
	return s
}

func (s *ArSignTask) SetSignUrl(v string) *ArSignTask {
	s.SignUrl = &v
	return s
}

func (s *ArSignTask) SetStatus(v string) *ArSignTask {
	s.Status = &v
	return s
}

func (s *ArSignTask) SetMycAccountId(v string) *ArSignTask {
	s.MycAccountId = &v
	return s
}

// 机构签署信息
type OrgSigning struct {
	// 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
	OrgSealId *string `json:"org_seal_id,omitempty" xml:"org_seal_id,omitempty"`
	// 机构签署页码，从第1页开始
	//
	//
	OrgSignPageNo *int64 `json:"org_sign_page_no,omitempty" xml:"org_sign_page_no,omitempty" require:"true"`
	// 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
	//
	//
	OrgSignCoordinateX *string `json:"org_sign_coordinate_x,omitempty" xml:"org_sign_coordinate_x,omitempty" require:"true"`
	// 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
	OrgSignCoordinateY *string `json:"org_sign_coordinate_y,omitempty" xml:"org_sign_coordinate_y,omitempty" require:"true"`
}

func (s OrgSigning) String() string {
	return tea.Prettify(s)
}

func (s OrgSigning) GoString() string {
	return s.String()
}

func (s *OrgSigning) SetOrgSealId(v string) *OrgSigning {
	s.OrgSealId = &v
	return s
}

func (s *OrgSigning) SetOrgSignPageNo(v int64) *OrgSigning {
	s.OrgSignPageNo = &v
	return s
}

func (s *OrgSigning) SetOrgSignCoordinateX(v string) *OrgSigning {
	s.OrgSignCoordinateX = &v
	return s
}

func (s *OrgSigning) SetOrgSignCoordinateY(v string) *OrgSigning {
	s.OrgSignCoordinateY = &v
	return s
}

// 个人签署信息
type PersonalSigning struct {
	// 数字房产账户 ID
	//
	PersonalId *string `json:"personal_id,omitempty" xml:"personal_id,omitempty" require:"true"`
	// 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
	PersonalSealId *string `json:"personal_seal_id,omitempty" xml:"personal_seal_id,omitempty"`
	// 个人签署页码，本签名最终签署到协议哪一页
	PersonalSignPageNo *int64 `json:"personal_sign_page_no,omitempty" xml:"personal_sign_page_no,omitempty" require:"true"`
	// 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
	PersonalSignCoordinateX *string `json:"personal_sign_coordinate_x,omitempty" xml:"personal_sign_coordinate_x,omitempty" require:"true"`
	// 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
	PersonalSignCoordinateY *string `json:"personal_sign_coordinate_y,omitempty" xml:"personal_sign_coordinate_y,omitempty" require:"true"`
}

func (s PersonalSigning) String() string {
	return tea.Prettify(s)
}

func (s PersonalSigning) GoString() string {
	return s.String()
}

func (s *PersonalSigning) SetPersonalId(v string) *PersonalSigning {
	s.PersonalId = &v
	return s
}

func (s *PersonalSigning) SetPersonalSealId(v string) *PersonalSigning {
	s.PersonalSealId = &v
	return s
}

func (s *PersonalSigning) SetPersonalSignPageNo(v int64) *PersonalSigning {
	s.PersonalSignPageNo = &v
	return s
}

func (s *PersonalSigning) SetPersonalSignCoordinateX(v string) *PersonalSigning {
	s.PersonalSignCoordinateX = &v
	return s
}

func (s *PersonalSigning) SetPersonalSignCoordinateY(v string) *PersonalSigning {
	s.PersonalSignCoordinateY = &v
	return s
}

// 签署任务
type SignTask struct {
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 签署信息列表
	SignInfoList []*SignInfo `json:"sign_info_list,omitempty" xml:"sign_info_list,omitempty" require:"true" type:"Repeated"`
	// 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
	SignDocumentType *string `json:"sign_document_type,omitempty" xml:"sign_document_type,omitempty" require:"true"`
}

func (s SignTask) String() string {
	return tea.Prettify(s)
}

func (s SignTask) GoString() string {
	return s.String()
}

func (s *SignTask) SetFilePath(v string) *SignTask {
	s.FilePath = &v
	return s
}

func (s *SignTask) SetSignInfoList(v []*SignInfo) *SignTask {
	s.SignInfoList = v
	return s
}

func (s *SignTask) SetSignDocumentType(v string) *SignTask {
	s.SignDocumentType = &v
	return s
}

// 待签约任务描述
type SignTaskProfile struct {
	// 签署任务列表
	SignTaskList []*SignTask `json:"sign_task_list,omitempty" xml:"sign_task_list,omitempty" require:"true" type:"Repeated"`
}

func (s SignTaskProfile) String() string {
	return tea.Prettify(s)
}

func (s SignTaskProfile) GoString() string {
	return s.String()
}

func (s *SignTaskProfile) SetSignTaskList(v []*SignTask) *SignTaskProfile {
	s.SignTaskList = v
	return s
}

// 房产查询单
type HqOrder struct {
	// 房产链房产查询单号
	HouseQueryOrderNo *string `json:"house_query_order_no,omitempty" xml:"house_query_order_no,omitempty"`
	// 房产链房产查询单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 房产查询场景,NO_AUTH_QUERY=无授权直查
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 2334898983498394838C
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 房产链内部不动产中心编号
	RtcNo *string `json:"rtc_no,omitempty" xml:"rtc_no,omitempty"`
	// 不动产中心名称
	RtcName *string `json:"rtc_name,omitempty" xml:"rtc_name,omitempty"`
	// 房产权证类型
	HouseCertType *string `json:"house_cert_type,omitempty" xml:"house_cert_type,omitempty"`
	// 权证编号(短号)
	HouseCertNo *string `json:"house_cert_no,omitempty" xml:"house_cert_no,omitempty"`
	// 房产查询单生成时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 房产查询单结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 房产查询失败描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 业务办理分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty"`
	// 房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty"`
}

func (s HqOrder) String() string {
	return tea.Prettify(s)
}

func (s HqOrder) GoString() string {
	return s.String()
}

func (s *HqOrder) SetHouseQueryOrderNo(v string) *HqOrder {
	s.HouseQueryOrderNo = &v
	return s
}

func (s *HqOrder) SetStatus(v string) *HqOrder {
	s.Status = &v
	return s
}

func (s *HqOrder) SetScene(v string) *HqOrder {
	s.Scene = &v
	return s
}

func (s *HqOrder) SetOutBizNo(v string) *HqOrder {
	s.OutBizNo = &v
	return s
}

func (s *HqOrder) SetLoanAssistPlatform(v string) *HqOrder {
	s.LoanAssistPlatform = &v
	return s
}

func (s *HqOrder) SetBankNo(v string) *HqOrder {
	s.BankNo = &v
	return s
}

func (s *HqOrder) SetBankName(v string) *HqOrder {
	s.BankName = &v
	return s
}

func (s *HqOrder) SetRtcNo(v string) *HqOrder {
	s.RtcNo = &v
	return s
}

func (s *HqOrder) SetRtcName(v string) *HqOrder {
	s.RtcName = &v
	return s
}

func (s *HqOrder) SetHouseCertType(v string) *HqOrder {
	s.HouseCertType = &v
	return s
}

func (s *HqOrder) SetHouseCertNo(v string) *HqOrder {
	s.HouseCertNo = &v
	return s
}

func (s *HqOrder) SetStartTime(v string) *HqOrder {
	s.StartTime = &v
	return s
}

func (s *HqOrder) SetEndTime(v string) *HqOrder {
	s.EndTime = &v
	return s
}

func (s *HqOrder) SetFailCode(v string) *HqOrder {
	s.FailCode = &v
	return s
}

func (s *HqOrder) SetFailDesc(v string) *HqOrder {
	s.FailDesc = &v
	return s
}

func (s *HqOrder) SetBranchBank(v *Bank) *HqOrder {
	s.BranchBank = v
	return s
}

func (s *HqOrder) SetHouse(v *House) *HqOrder {
	s.House = v
	return s
}

// 不动产基本信息
type RealtyBasicInfo struct {
	// 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
	RealtyCertType *string `json:"realty_cert_type,omitempty" xml:"realty_cert_type,omitempty" require:"true"`
	// 权证号码
	RealtyCertNo *string `json:"realty_cert_no,omitempty" xml:"realty_cert_no,omitempty" require:"true"`
	// 坐落位置
	Location *string `json:"location,omitempty" xml:"location,omitempty" require:"true"`
	// 权利人列表
	ObligeeList []*EntityBasicInfo `json:"obligee_list,omitempty" xml:"obligee_list,omitempty" type:"Repeated"`
}

func (s RealtyBasicInfo) String() string {
	return tea.Prettify(s)
}

func (s RealtyBasicInfo) GoString() string {
	return s.String()
}

func (s *RealtyBasicInfo) SetRealtyCertType(v string) *RealtyBasicInfo {
	s.RealtyCertType = &v
	return s
}

func (s *RealtyBasicInfo) SetRealtyCertNo(v string) *RealtyBasicInfo {
	s.RealtyCertNo = &v
	return s
}

func (s *RealtyBasicInfo) SetLocation(v string) *RealtyBasicInfo {
	s.Location = &v
	return s
}

func (s *RealtyBasicInfo) SetObligeeList(v []*EntityBasicInfo) *RealtyBasicInfo {
	s.ObligeeList = v
	return s
}

// 他项权证信息
type OtherRightInfo struct {
	// 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
	RealtyCertType *string `json:"realty_cert_type,omitempty" xml:"realty_cert_type,omitempty" require:"true"`
	// 权证号码
	RealtyCertNo *string `json:"realty_cert_no,omitempty" xml:"realty_cert_no,omitempty" require:"true"`
	// 权利人
	Obligee *EntityBasicInfo `json:"obligee,omitempty" xml:"obligee,omitempty" require:"true"`
	// 原他项权证号
	OldOtherRealtyCertNo *string `json:"old_other_realty_cert_no,omitempty" xml:"old_other_realty_cert_no,omitempty"`
	// 坐落
	Location *string `json:"location,omitempty" xml:"location,omitempty" require:"true"`
	// 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
	NewOtherRightCertType *string `json:"new_other_right_cert_type,omitempty" xml:"new_other_right_cert_type,omitempty" require:"true"`
	// 新他项权证号
	NewOtherRightCertNo *string `json:"new_other_right_cert_no,omitempty" xml:"new_other_right_cert_no,omitempty" require:"true"`
	// 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
	NewOtherRightCertPath *string `json:"new_other_right_cert_path,omitempty" xml:"new_other_right_cert_path,omitempty" require:"true"`
}

func (s OtherRightInfo) String() string {
	return tea.Prettify(s)
}

func (s OtherRightInfo) GoString() string {
	return s.String()
}

func (s *OtherRightInfo) SetRealtyCertType(v string) *OtherRightInfo {
	s.RealtyCertType = &v
	return s
}

func (s *OtherRightInfo) SetRealtyCertNo(v string) *OtherRightInfo {
	s.RealtyCertNo = &v
	return s
}

func (s *OtherRightInfo) SetObligee(v *EntityBasicInfo) *OtherRightInfo {
	s.Obligee = v
	return s
}

func (s *OtherRightInfo) SetOldOtherRealtyCertNo(v string) *OtherRightInfo {
	s.OldOtherRealtyCertNo = &v
	return s
}

func (s *OtherRightInfo) SetLocation(v string) *OtherRightInfo {
	s.Location = &v
	return s
}

func (s *OtherRightInfo) SetNewOtherRightCertType(v string) *OtherRightInfo {
	s.NewOtherRightCertType = &v
	return s
}

func (s *OtherRightInfo) SetNewOtherRightCertNo(v string) *OtherRightInfo {
	s.NewOtherRightCertNo = &v
	return s
}

func (s *OtherRightInfo) SetNewOtherRightCertPath(v string) *OtherRightInfo {
	s.NewOtherRightCertPath = &v
	return s
}

// 签署的合同信息
//
type Contract struct {
	// 文件 ID
	DocumentId *string `json:"document_id,omitempty" xml:"document_id,omitempty" require:"true"`
	// 参数指定合同文件名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同文件的URL下载路径，有效期1小时
	ArchivedFileUrl *string `json:"archived_file_url,omitempty" xml:"archived_file_url,omitempty"`
}

func (s Contract) String() string {
	return tea.Prettify(s)
}

func (s Contract) GoString() string {
	return s.String()
}

func (s *Contract) SetDocumentId(v string) *Contract {
	s.DocumentId = &v
	return s
}

func (s *Contract) SetContractName(v string) *Contract {
	s.ContractName = &v
	return s
}

func (s *Contract) SetArchivedFileUrl(v string) *Contract {
	s.ArchivedFileUrl = &v
	return s
}

// 材料文件信息
type MaterialFileInfo struct {
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 材料ID，默认值为2，代表身份证明
	MaterialId *string `json:"material_id,omitempty" xml:"material_id,omitempty" require:"true"`
	// 材料名称
	MaterialName *string `json:"material_name,omitempty" xml:"material_name,omitempty" require:"true"`
	// 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
	MaterialType *string `json:"material_type,omitempty" xml:"material_type,omitempty"`
	// 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照
	MaterialCategory *string `json:"material_category,omitempty" xml:"material_category,omitempty"`
	// 材料份数
	CopiesNumber *int64 `json:"copies_number,omitempty" xml:"copies_number,omitempty" require:"true"`
	// 材料页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
}

func (s MaterialFileInfo) String() string {
	return tea.Prettify(s)
}

func (s MaterialFileInfo) GoString() string {
	return s.String()
}

func (s *MaterialFileInfo) SetFilePath(v string) *MaterialFileInfo {
	s.FilePath = &v
	return s
}

func (s *MaterialFileInfo) SetMaterialId(v string) *MaterialFileInfo {
	s.MaterialId = &v
	return s
}

func (s *MaterialFileInfo) SetMaterialName(v string) *MaterialFileInfo {
	s.MaterialName = &v
	return s
}

func (s *MaterialFileInfo) SetMaterialType(v string) *MaterialFileInfo {
	s.MaterialType = &v
	return s
}

func (s *MaterialFileInfo) SetMaterialCategory(v string) *MaterialFileInfo {
	s.MaterialCategory = &v
	return s
}

func (s *MaterialFileInfo) SetCopiesNumber(v int64) *MaterialFileInfo {
	s.CopiesNumber = &v
	return s
}

func (s *MaterialFileInfo) SetPage(v int64) *MaterialFileInfo {
	s.Page = &v
	return s
}

// 不动产中心通用应答结果
type RtcCommonResult struct {
	// 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s RtcCommonResult) String() string {
	return tea.Prettify(s)
}

func (s RtcCommonResult) GoString() string {
	return s.String()
}

func (s *RtcCommonResult) SetStatus(v string) *RtcCommonResult {
	s.Status = &v
	return s
}

func (s *RtcCommonResult) SetCode(v string) *RtcCommonResult {
	s.Code = &v
	return s
}

func (s *RtcCommonResult) SetMessage(v string) *RtcCommonResult {
	s.Message = &v
	return s
}

// 合同及签署信息
type ContractSigning struct {
	// 本合同文件的名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 机构签署记录列表，可设置多个机构的签署区
	OrgSignList []*OrgSigning `json:"org_sign_list,omitempty" xml:"org_sign_list,omitempty" require:"true" type:"Repeated"`
	// 个人签署记录的列表形式，可设置多个个人的签署区
	PersonalSignList []*PersonalSigning `json:"personal_sign_list,omitempty" xml:"personal_sign_list,omitempty" require:"true" type:"Repeated"`
}

func (s ContractSigning) String() string {
	return tea.Prettify(s)
}

func (s ContractSigning) GoString() string {
	return s.String()
}

func (s *ContractSigning) SetContractName(v string) *ContractSigning {
	s.ContractName = &v
	return s
}

func (s *ContractSigning) SetFilePath(v string) *ContractSigning {
	s.FilePath = &v
	return s
}

func (s *ContractSigning) SetOrgSignList(v []*OrgSigning) *ContractSigning {
	s.OrgSignList = v
	return s
}

func (s *ContractSigning) SetPersonalSignList(v []*PersonalSigning) *ContractSigning {
	s.PersonalSignList = v
	return s
}

// 金额信息
type Amount struct {
	// 币种代码，如CNY代表人民币
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 币种金额，如200.00，人民币以元为单位，保留两位小数
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Amount) String() string {
	return tea.Prettify(s)
}

func (s Amount) GoString() string {
	return s.String()
}

func (s *Amount) SetCode(v string) *Amount {
	s.Code = &v
	return s
}

func (s *Amount) SetValue(v string) *Amount {
	s.Value = &v
	return s
}

// 抵押单
type MgOrder struct {
	// 已签署的合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" type:"Repeated"`
	// 附件材料列表
	Archives []*Archive `json:"archives,omitempty" xml:"archives,omitempty" type:"Repeated"`
	// 房屋授权查询合同签署任务
	AuthArSignTask *ArSignTask `json:"auth_ar_sign_task,omitempty" xml:"auth_ar_sign_task,omitempty"`
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 借款人身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型，比如：ID_CARD=身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 借款人编号
	CmNo *string `json:"cm_no,omitempty" xml:"cm_no,omitempty"`
	// 抵押登记结束日期
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 抵押登记错误信息描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 不动产返回房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty"`
	// 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
	InitArVarValueJson *string `json:"init_ar_var_value_json,omitempty" xml:"init_ar_var_value_json,omitempty"`
	// 借款人婚姻状况，比如：MARRIED=已婚
	Marriage *string `json:"marriage,omitempty" xml:"marriage,omitempty"`
	// 抵押登记相关合同签署任务列表
	MgArSignTasks []*ArSignTask `json:"mg_ar_sign_tasks,omitempty" xml:"mg_ar_sign_tasks,omitempty" type:"Repeated"`
	// 抵押登记回执
	MgCert *MgCert `json:"mg_cert,omitempty" xml:"mg_cert,omitempty"`
	// 抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty"`
	// 借款人身份证
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 银行的业务编号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 抵押登记申请日期
	RegApplyDate *string `json:"reg_apply_date,omitempty" xml:"reg_apply_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 登记设立原因，比如：LOAN=借贷
	RegReason *string `json:"reg_reason,omitempty" xml:"reg_reason,omitempty"`
	// 登记设立原因描述
	RegReasonRemark *string `json:"reg_reason_remark,omitempty" xml:"reg_reason_remark,omitempty"`
	// 登记权利,比如：MORTGAGE_RIGHTS=抵押权
	RegRights *string `json:"reg_rights,omitempty" xml:"reg_rights,omitempty"`
	// 登记类型，比如：FIRST_REG=首次登记
	RegType *string `json:"reg_type,omitempty" xml:"reg_type,omitempty"`
	// 不动产中心的抵押登记号
	RtcMgOrderNo *string `json:"rtc_mg_order_no,omitempty" xml:"rtc_mg_order_no,omitempty"`
	// 不动产登记中心名称
	RtcName *string `json:"rtc_name,omitempty" xml:"rtc_name,omitempty"`
	// 不动产登记中心编号
	RtcNo *string `json:"rtc_no,omitempty" xml:"rtc_no,omitempty"`
	// 借款人配偶客户编号
	SpouseCmNo *string `json:"spouse_cm_no,omitempty" xml:"spouse_cm_no,omitempty"`
	// 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
	StartArVarValueJson *string `json:"start_ar_var_value_json,omitempty" xml:"start_ar_var_value_json,omitempty"`
	// 抵押登记发起日期
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押单状态 ，比如：MG_ING=抵押登记中
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 扩展字段
	ExtendJson *string `json:"extend_json,omitempty" xml:"extend_json,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty"`
	// 办理业务分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty"`
}

func (s MgOrder) String() string {
	return tea.Prettify(s)
}

func (s MgOrder) GoString() string {
	return s.String()
}

func (s *MgOrder) SetAgreements(v []*Agreement) *MgOrder {
	s.Agreements = v
	return s
}

func (s *MgOrder) SetArchives(v []*Archive) *MgOrder {
	s.Archives = v
	return s
}

func (s *MgOrder) SetAuthArSignTask(v *ArSignTask) *MgOrder {
	s.AuthArSignTask = v
	return s
}

func (s *MgOrder) SetBankName(v string) *MgOrder {
	s.BankName = &v
	return s
}

func (s *MgOrder) SetBankNo(v string) *MgOrder {
	s.BankNo = &v
	return s
}

func (s *MgOrder) SetCertNo(v string) *MgOrder {
	s.CertNo = &v
	return s
}

func (s *MgOrder) SetCertType(v string) *MgOrder {
	s.CertType = &v
	return s
}

func (s *MgOrder) SetCmNo(v string) *MgOrder {
	s.CmNo = &v
	return s
}

func (s *MgOrder) SetEndTime(v string) *MgOrder {
	s.EndTime = &v
	return s
}

func (s *MgOrder) SetFailCode(v string) *MgOrder {
	s.FailCode = &v
	return s
}

func (s *MgOrder) SetFailDesc(v string) *MgOrder {
	s.FailDesc = &v
	return s
}

func (s *MgOrder) SetHouse(v *House) *MgOrder {
	s.House = v
	return s
}

func (s *MgOrder) SetInitArVarValueJson(v string) *MgOrder {
	s.InitArVarValueJson = &v
	return s
}

func (s *MgOrder) SetMarriage(v string) *MgOrder {
	s.Marriage = &v
	return s
}

func (s *MgOrder) SetMgArSignTasks(v []*ArSignTask) *MgOrder {
	s.MgArSignTasks = v
	return s
}

func (s *MgOrder) SetMgCert(v *MgCert) *MgOrder {
	s.MgCert = v
	return s
}

func (s *MgOrder) SetMgOrderNo(v string) *MgOrder {
	s.MgOrderNo = &v
	return s
}

func (s *MgOrder) SetName(v string) *MgOrder {
	s.Name = &v
	return s
}

func (s *MgOrder) SetOutBizNo(v string) *MgOrder {
	s.OutBizNo = &v
	return s
}

func (s *MgOrder) SetRegApplyDate(v string) *MgOrder {
	s.RegApplyDate = &v
	return s
}

func (s *MgOrder) SetRegReason(v string) *MgOrder {
	s.RegReason = &v
	return s
}

func (s *MgOrder) SetRegReasonRemark(v string) *MgOrder {
	s.RegReasonRemark = &v
	return s
}

func (s *MgOrder) SetRegRights(v string) *MgOrder {
	s.RegRights = &v
	return s
}

func (s *MgOrder) SetRegType(v string) *MgOrder {
	s.RegType = &v
	return s
}

func (s *MgOrder) SetRtcMgOrderNo(v string) *MgOrder {
	s.RtcMgOrderNo = &v
	return s
}

func (s *MgOrder) SetRtcName(v string) *MgOrder {
	s.RtcName = &v
	return s
}

func (s *MgOrder) SetRtcNo(v string) *MgOrder {
	s.RtcNo = &v
	return s
}

func (s *MgOrder) SetSpouseCmNo(v string) *MgOrder {
	s.SpouseCmNo = &v
	return s
}

func (s *MgOrder) SetStartArVarValueJson(v string) *MgOrder {
	s.StartArVarValueJson = &v
	return s
}

func (s *MgOrder) SetStartTime(v string) *MgOrder {
	s.StartTime = &v
	return s
}

func (s *MgOrder) SetStatus(v string) *MgOrder {
	s.Status = &v
	return s
}

func (s *MgOrder) SetExtendJson(v string) *MgOrder {
	s.ExtendJson = &v
	return s
}

func (s *MgOrder) SetLoanAssistPlatform(v string) *MgOrder {
	s.LoanAssistPlatform = &v
	return s
}

func (s *MgOrder) SetBranchBank(v *Bank) *MgOrder {
	s.BranchBank = v
	return s
}

// 银行网办操作员
type BankOperator struct {
	// 网办操作员工号
	OpNo *string `json:"op_no,omitempty" xml:"op_no,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s BankOperator) String() string {
	return tea.Prettify(s)
}

func (s BankOperator) GoString() string {
	return s.String()
}

func (s *BankOperator) SetOpNo(v string) *BankOperator {
	s.OpNo = &v
	return s
}

func (s *BankOperator) SetName(v string) *BankOperator {
	s.Name = &v
	return s
}

func (s *BankOperator) SetCertType(v string) *BankOperator {
	s.CertType = &v
	return s
}

func (s *BankOperator) SetCertNo(v string) *BankOperator {
	s.CertNo = &v
	return s
}

func (s *BankOperator) SetMobile(v string) *BankOperator {
	s.Mobile = &v
	return s
}

// 不动产中心
type RealtyCenter struct {
	// 不动产中心地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 不动产中心名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 外部不动产中心编号(不动产中心提供)
	OutRtcNo *string `json:"out_rtc_no,omitempty" xml:"out_rtc_no,omitempty"`
	// 蚂蚁链身份id
	PdnDid *string `json:"pdn_did,omitempty" xml:"pdn_did,omitempty"`
	// 公钥
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
	// 不动产中心编号
	RtcNo *string `json:"rtc_no,omitempty" xml:"rtc_no,omitempty"`
}

func (s RealtyCenter) String() string {
	return tea.Prettify(s)
}

func (s RealtyCenter) GoString() string {
	return s.String()
}

func (s *RealtyCenter) SetAddress(v string) *RealtyCenter {
	s.Address = &v
	return s
}

func (s *RealtyCenter) SetName(v string) *RealtyCenter {
	s.Name = &v
	return s
}

func (s *RealtyCenter) SetOutRtcNo(v string) *RealtyCenter {
	s.OutRtcNo = &v
	return s
}

func (s *RealtyCenter) SetPdnDid(v string) *RealtyCenter {
	s.PdnDid = &v
	return s
}

func (s *RealtyCenter) SetPubKey(v string) *RealtyCenter {
	s.PubKey = &v
	return s
}

func (s *RealtyCenter) SetRtcNo(v string) *RealtyCenter {
	s.RtcNo = &v
	return s
}

// 解抵押单
type MgReleaseOrder struct {
	// 解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty"`
	// 不动产中心解抵押单号
	RtcMgReleaseOrderNo *string `json:"rtc_mg_release_order_no,omitempty" xml:"rtc_mg_release_order_no,omitempty"`
	// 机构侧业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 抵押登记权证号(他项权证号)
	OtherRightCertNo *string `json:"other_right_cert_no,omitempty" xml:"other_right_cert_no,omitempty"`
	// 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
	WipeMortgageReason *string `json:"wipe_mortgage_reason,omitempty" xml:"wipe_mortgage_reason,omitempty"`
	// 解抵押状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 房产链内部不动产中心编号
	RtcNo *string `json:"rtc_no,omitempty" xml:"rtc_no,omitempty"`
	// 不动产中心名称
	RtcName *string `json:"rtc_name,omitempty" xml:"rtc_name,omitempty"`
	// 办理业务分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty"`
	// 解抵押的房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty"`
	// 解抵押的合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" type:"Repeated"`
	// 解抵押相关的附件材料
	Archives []*Archive `json:"archives,omitempty" xml:"archives,omitempty" type:"Repeated"`
	// 解抵押单据生成时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 解抵押单据结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 解抵押失败原因描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty"`
}

func (s MgReleaseOrder) String() string {
	return tea.Prettify(s)
}

func (s MgReleaseOrder) GoString() string {
	return s.String()
}

func (s *MgReleaseOrder) SetMgReleaseOrderNo(v string) *MgReleaseOrder {
	s.MgReleaseOrderNo = &v
	return s
}

func (s *MgReleaseOrder) SetRtcMgReleaseOrderNo(v string) *MgReleaseOrder {
	s.RtcMgReleaseOrderNo = &v
	return s
}

func (s *MgReleaseOrder) SetOutBizNo(v string) *MgReleaseOrder {
	s.OutBizNo = &v
	return s
}

func (s *MgReleaseOrder) SetOtherRightCertNo(v string) *MgReleaseOrder {
	s.OtherRightCertNo = &v
	return s
}

func (s *MgReleaseOrder) SetWipeMortgageReason(v string) *MgReleaseOrder {
	s.WipeMortgageReason = &v
	return s
}

func (s *MgReleaseOrder) SetStatus(v string) *MgReleaseOrder {
	s.Status = &v
	return s
}

func (s *MgReleaseOrder) SetBankNo(v string) *MgReleaseOrder {
	s.BankNo = &v
	return s
}

func (s *MgReleaseOrder) SetBankName(v string) *MgReleaseOrder {
	s.BankName = &v
	return s
}

func (s *MgReleaseOrder) SetRtcNo(v string) *MgReleaseOrder {
	s.RtcNo = &v
	return s
}

func (s *MgReleaseOrder) SetRtcName(v string) *MgReleaseOrder {
	s.RtcName = &v
	return s
}

func (s *MgReleaseOrder) SetBranchBank(v *Bank) *MgReleaseOrder {
	s.BranchBank = v
	return s
}

func (s *MgReleaseOrder) SetHouse(v *House) *MgReleaseOrder {
	s.House = v
	return s
}

func (s *MgReleaseOrder) SetAgreements(v []*Agreement) *MgReleaseOrder {
	s.Agreements = v
	return s
}

func (s *MgReleaseOrder) SetArchives(v []*Archive) *MgReleaseOrder {
	s.Archives = v
	return s
}

func (s *MgReleaseOrder) SetStartTime(v string) *MgReleaseOrder {
	s.StartTime = &v
	return s
}

func (s *MgReleaseOrder) SetEndTime(v string) *MgReleaseOrder {
	s.EndTime = &v
	return s
}

func (s *MgReleaseOrder) SetFailCode(v string) *MgReleaseOrder {
	s.FailCode = &v
	return s
}

func (s *MgReleaseOrder) SetFailDesc(v string) *MgReleaseOrder {
	s.FailDesc = &v
	return s
}

func (s *MgReleaseOrder) SetLoanAssistPlatform(v string) *MgReleaseOrder {
	s.LoanAssistPlatform = &v
	return s
}

// 附件材料信息
type ArchiveInfo struct {
	// 附件存储OSS路径
	OssKey *string `json:"oss_key,omitempty" xml:"oss_key,omitempty"`
	// 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 附件内容摘要
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s ArchiveInfo) String() string {
	return tea.Prettify(s)
}

func (s ArchiveInfo) GoString() string {
	return s.String()
}

func (s *ArchiveInfo) SetOssKey(v string) *ArchiveInfo {
	s.OssKey = &v
	return s
}

func (s *ArchiveInfo) SetType(v string) *ArchiveInfo {
	s.Type = &v
	return s
}

func (s *ArchiveInfo) SetHash(v string) *ArchiveInfo {
	s.Hash = &v
	return s
}

// 抵押担保信息
type MortGuaranteeInfo struct {
	// 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
	ConflictHandleMethod *string `json:"conflict_handle_method,omitempty" xml:"conflict_handle_method,omitempty"`
	// 评估价值，人民币默认单位为元，小数点保留2位
	EvaluationAmt *string `json:"evaluation_amt,omitempty" xml:"evaluation_amt,omitempty"`
	// 评估价值货币类型,比如：CNY=人民币
	EvaluationAmtCurrency *string `json:"evaluation_amt_currency,omitempty" xml:"evaluation_amt_currency,omitempty"`
	// 担保范围列表,比如：MAIN_CLAIM=主债权
	GuaranteeScopeJson []*string `json:"guarantee_scope_json,omitempty" xml:"guarantee_scope_json,omitempty" type:"Repeated"`
	// 担保范围备注
	GuaranteeScopeNote *string `json:"guarantee_scope_note,omitempty" xml:"guarantee_scope_note,omitempty"`
	// 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
	MortgageType *string `json:"mortgage_type,omitempty" xml:"mortgage_type,omitempty"`
	// 被担保主债权数额,人民币默认单位元，保留两位小数点
	DebtAmt *string `json:"debt_amt,omitempty" xml:"debt_amt,omitempty"`
	// 被担保主债权数额货币类型，比如：CNY=人民币
	DebtAmtCurrency *string `json:"debt_amt_currency,omitempty" xml:"debt_amt_currency,omitempty"`
	// 履债结束日期
	DebtEndDate *string `json:"debt_end_date,omitempty" xml:"debt_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 履债起始日期
	DebtStartDate *string `json:"debt_start_date,omitempty" xml:"debt_start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
	MortRealtyProperty *string `json:"mort_realty_property,omitempty" xml:"mort_realty_property,omitempty"`
	// 合同债权金额币种
	ArDebtAmtCurrency *string `json:"ar_debt_amt_currency,omitempty" xml:"ar_debt_amt_currency,omitempty"`
	// 合同债权金额
	ArDebtAmt *string `json:"ar_debt_amt,omitempty" xml:"ar_debt_amt,omitempty"`
	// 房产链内部抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty"`
}

func (s MortGuaranteeInfo) String() string {
	return tea.Prettify(s)
}

func (s MortGuaranteeInfo) GoString() string {
	return s.String()
}

func (s *MortGuaranteeInfo) SetConflictHandleMethod(v string) *MortGuaranteeInfo {
	s.ConflictHandleMethod = &v
	return s
}

func (s *MortGuaranteeInfo) SetEvaluationAmt(v string) *MortGuaranteeInfo {
	s.EvaluationAmt = &v
	return s
}

func (s *MortGuaranteeInfo) SetEvaluationAmtCurrency(v string) *MortGuaranteeInfo {
	s.EvaluationAmtCurrency = &v
	return s
}

func (s *MortGuaranteeInfo) SetGuaranteeScopeJson(v []*string) *MortGuaranteeInfo {
	s.GuaranteeScopeJson = v
	return s
}

func (s *MortGuaranteeInfo) SetGuaranteeScopeNote(v string) *MortGuaranteeInfo {
	s.GuaranteeScopeNote = &v
	return s
}

func (s *MortGuaranteeInfo) SetMortgageType(v string) *MortGuaranteeInfo {
	s.MortgageType = &v
	return s
}

func (s *MortGuaranteeInfo) SetDebtAmt(v string) *MortGuaranteeInfo {
	s.DebtAmt = &v
	return s
}

func (s *MortGuaranteeInfo) SetDebtAmtCurrency(v string) *MortGuaranteeInfo {
	s.DebtAmtCurrency = &v
	return s
}

func (s *MortGuaranteeInfo) SetDebtEndDate(v string) *MortGuaranteeInfo {
	s.DebtEndDate = &v
	return s
}

func (s *MortGuaranteeInfo) SetDebtStartDate(v string) *MortGuaranteeInfo {
	s.DebtStartDate = &v
	return s
}

func (s *MortGuaranteeInfo) SetMortRealtyProperty(v string) *MortGuaranteeInfo {
	s.MortRealtyProperty = &v
	return s
}

func (s *MortGuaranteeInfo) SetArDebtAmtCurrency(v string) *MortGuaranteeInfo {
	s.ArDebtAmtCurrency = &v
	return s
}

func (s *MortGuaranteeInfo) SetArDebtAmt(v string) *MortGuaranteeInfo {
	s.ArDebtAmt = &v
	return s
}

func (s *MortGuaranteeInfo) SetMgOrderNo(v string) *MortGuaranteeInfo {
	s.MgOrderNo = &v
	return s
}

type StartRcpHqRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 房产查询场景,NO_AUTH_QUERY=无授权直查
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty" require:"true"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 外部业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty" require:"true"`
	// 查询产权
	HouseOwner *HouseOwner `json:"house_owner,omitempty" xml:"house_owner,omitempty" require:"true"`
	// 办理业务分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty" require:"true"`
}

func (s StartRcpHqRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRcpHqRequest) GoString() string {
	return s.String()
}

func (s *StartRcpHqRequest) SetAuthToken(v string) *StartRcpHqRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRcpHqRequest) SetProductInstanceId(v string) *StartRcpHqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRcpHqRequest) SetScene(v string) *StartRcpHqRequest {
	s.Scene = &v
	return s
}

func (s *StartRcpHqRequest) SetLoanAssistPlatform(v string) *StartRcpHqRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *StartRcpHqRequest) SetBankNo(v string) *StartRcpHqRequest {
	s.BankNo = &v
	return s
}

func (s *StartRcpHqRequest) SetOutBizNo(v string) *StartRcpHqRequest {
	s.OutBizNo = &v
	return s
}

func (s *StartRcpHqRequest) SetHouse(v *House) *StartRcpHqRequest {
	s.House = v
	return s
}

func (s *StartRcpHqRequest) SetHouseOwner(v *HouseOwner) *StartRcpHqRequest {
	s.HouseOwner = v
	return s
}

func (s *StartRcpHqRequest) SetBranchBank(v *Bank) *StartRcpHqRequest {
	s.BranchBank = v
	return s
}

type StartRcpHqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 房产链房产查询单号
	HqOrderNo *string `json:"hq_order_no,omitempty" xml:"hq_order_no,omitempty"`
}

func (s StartRcpHqResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRcpHqResponse) GoString() string {
	return s.String()
}

func (s *StartRcpHqResponse) SetReqMsgId(v string) *StartRcpHqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRcpHqResponse) SetResultCode(v string) *StartRcpHqResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRcpHqResponse) SetResultMsg(v string) *StartRcpHqResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartRcpHqResponse) SetHqOrderNo(v string) *StartRcpHqResponse {
	s.HqOrderNo = &v
	return s
}

type GetRcpHqRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 房产查询单号
	HqOrderNo *string `json:"hq_order_no,omitempty" xml:"hq_order_no,omitempty" require:"true"`
}

func (s GetRcpHqRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRcpHqRequest) GoString() string {
	return s.String()
}

func (s *GetRcpHqRequest) SetAuthToken(v string) *GetRcpHqRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRcpHqRequest) SetProductInstanceId(v string) *GetRcpHqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRcpHqRequest) SetBankNo(v string) *GetRcpHqRequest {
	s.BankNo = &v
	return s
}

func (s *GetRcpHqRequest) SetHqOrderNo(v string) *GetRcpHqRequest {
	s.HqOrderNo = &v
	return s
}

type GetRcpHqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 房产查询单明细
	HqOrder *HqOrder `json:"hq_order,omitempty" xml:"hq_order,omitempty"`
}

func (s GetRcpHqResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRcpHqResponse) GoString() string {
	return s.String()
}

func (s *GetRcpHqResponse) SetReqMsgId(v string) *GetRcpHqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRcpHqResponse) SetResultCode(v string) *GetRcpHqResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRcpHqResponse) SetResultMsg(v string) *GetRcpHqResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRcpHqResponse) SetHqOrder(v *HqOrder) *GetRcpHqResponse {
	s.HqOrder = v
	return s
}

type StartRcpMgrRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty" require:"true"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 外部业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 不动产颁发的他项权证号
	OtherRightCertNo *string `json:"other_right_cert_no,omitempty" xml:"other_right_cert_no,omitempty" require:"true"`
	// 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
	WipeMortgageReason *string `json:"wipe_mortgage_reason,omitempty" xml:"wipe_mortgage_reason,omitempty" require:"true"`
	// 解抵押的房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty" require:"true"`
	// 办理业务分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty" require:"true"`
}

func (s StartRcpMgrRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgrRequest) GoString() string {
	return s.String()
}

func (s *StartRcpMgrRequest) SetAuthToken(v string) *StartRcpMgrRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRcpMgrRequest) SetProductInstanceId(v string) *StartRcpMgrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRcpMgrRequest) SetLoanAssistPlatform(v string) *StartRcpMgrRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *StartRcpMgrRequest) SetBankNo(v string) *StartRcpMgrRequest {
	s.BankNo = &v
	return s
}

func (s *StartRcpMgrRequest) SetOutBizNo(v string) *StartRcpMgrRequest {
	s.OutBizNo = &v
	return s
}

func (s *StartRcpMgrRequest) SetOtherRightCertNo(v string) *StartRcpMgrRequest {
	s.OtherRightCertNo = &v
	return s
}

func (s *StartRcpMgrRequest) SetWipeMortgageReason(v string) *StartRcpMgrRequest {
	s.WipeMortgageReason = &v
	return s
}

func (s *StartRcpMgrRequest) SetHouse(v *House) *StartRcpMgrRequest {
	s.House = v
	return s
}

func (s *StartRcpMgrRequest) SetBranchBank(v *Bank) *StartRcpMgrRequest {
	s.BranchBank = v
	return s
}

type StartRcpMgrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty"`
}

func (s StartRcpMgrResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgrResponse) GoString() string {
	return s.String()
}

func (s *StartRcpMgrResponse) SetReqMsgId(v string) *StartRcpMgrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRcpMgrResponse) SetResultCode(v string) *StartRcpMgrResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRcpMgrResponse) SetResultMsg(v string) *StartRcpMgrResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartRcpMgrResponse) SetMgReleaseOrderNo(v string) *StartRcpMgrResponse {
	s.MgReleaseOrderNo = &v
	return s
}

type ConfirmRcpMgrRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty" require:"true"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty" require:"true"`
	// Y=继续解抵押,N=终止解抵押
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 终止解抵押原因码
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 终止解抵押原因描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 银行签署完成的解抵押合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" require:"true" type:"Repeated"`
}

func (s ConfirmRcpMgrRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgrRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgrRequest) SetAuthToken(v string) *ConfirmRcpMgrRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetProductInstanceId(v string) *ConfirmRcpMgrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetLoanAssistPlatform(v string) *ConfirmRcpMgrRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetBankNo(v string) *ConfirmRcpMgrRequest {
	s.BankNo = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetMgReleaseOrderNo(v string) *ConfirmRcpMgrRequest {
	s.MgReleaseOrderNo = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetResult(v string) *ConfirmRcpMgrRequest {
	s.Result = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetFailCode(v string) *ConfirmRcpMgrRequest {
	s.FailCode = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetFailDesc(v string) *ConfirmRcpMgrRequest {
	s.FailDesc = &v
	return s
}

func (s *ConfirmRcpMgrRequest) SetAgreements(v []*Agreement) *ConfirmRcpMgrRequest {
	s.Agreements = v
	return s
}

type ConfirmRcpMgrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmRcpMgrResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgrResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgrResponse) SetReqMsgId(v string) *ConfirmRcpMgrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRcpMgrResponse) SetResultCode(v string) *ConfirmRcpMgrResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRcpMgrResponse) SetResultMsg(v string) *ConfirmRcpMgrResponse {
	s.ResultMsg = &v
	return s
}

type GetRcpMgrRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 房产链解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty" require:"true"`
}

func (s GetRcpMgrRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgrRequest) GoString() string {
	return s.String()
}

func (s *GetRcpMgrRequest) SetAuthToken(v string) *GetRcpMgrRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRcpMgrRequest) SetProductInstanceId(v string) *GetRcpMgrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRcpMgrRequest) SetBankNo(v string) *GetRcpMgrRequest {
	s.BankNo = &v
	return s
}

func (s *GetRcpMgrRequest) SetMgReleaseOrderNo(v string) *GetRcpMgrRequest {
	s.MgReleaseOrderNo = &v
	return s
}

type GetRcpMgrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解抵押单明细
	MgReleaseOrder *MgReleaseOrder `json:"mg_release_order,omitempty" xml:"mg_release_order,omitempty"`
}

func (s GetRcpMgrResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgrResponse) GoString() string {
	return s.String()
}

func (s *GetRcpMgrResponse) SetReqMsgId(v string) *GetRcpMgrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRcpMgrResponse) SetResultCode(v string) *GetRcpMgrResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRcpMgrResponse) SetResultMsg(v string) *GetRcpMgrResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRcpMgrResponse) SetMgReleaseOrder(v *MgReleaseOrder) *GetRcpMgrResponse {
	s.MgReleaseOrder = v
	return s
}

type StartRcpMgRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待签署的合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" require:"true" type:"Repeated"`
	// 材料清单列表
	Archives []*Archive `json:"archives,omitempty" xml:"archives,omitempty" type:"Repeated"`
	// 合同变量和值的全集，Map<String,String>的json格式
	ArVarValueJson *string `json:"ar_var_value_json,omitempty" xml:"ar_var_value_json,omitempty" require:"true"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 借款人
	Borrower *Person `json:"borrower,omitempty" xml:"borrower,omitempty" require:"true"`
	// 扩展字段
	ExtendJson *string `json:"extend_json,omitempty" xml:"extend_json,omitempty"`
	// 抵押房产
	House *House `json:"house,omitempty" xml:"house,omitempty" require:"true"`
	// 婚姻状况,比如：MARRIED=已婚
	MaritalStatus *string `json:"marital_status,omitempty" xml:"marital_status,omitempty" require:"true"`
	// 外部业务单号，银行提供
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 登记设立原因，比如：LOAN=借贷
	RegReason *string `json:"reg_reason,omitempty" xml:"reg_reason,omitempty" require:"true"`
	// 登记设立原因备注
	RegReasonRemark *string `json:"reg_reason_remark,omitempty" xml:"reg_reason_remark,omitempty"`
	// 登记权利,比如：MORTGAGE_RIGHTS=抵押权
	RegRights *string `json:"reg_rights,omitempty" xml:"reg_rights,omitempty" require:"true"`
	// 登记类型，比如：FIRST_REG=首次登记
	RegType *string `json:"reg_type,omitempty" xml:"reg_type,omitempty" require:"true"`
	// 配偶
	Spouse *Person `json:"spouse,omitempty" xml:"spouse,omitempty"`
}

func (s StartRcpMgRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgRequest) GoString() string {
	return s.String()
}

func (s *StartRcpMgRequest) SetAuthToken(v string) *StartRcpMgRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRcpMgRequest) SetProductInstanceId(v string) *StartRcpMgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRcpMgRequest) SetAgreements(v []*Agreement) *StartRcpMgRequest {
	s.Agreements = v
	return s
}

func (s *StartRcpMgRequest) SetArchives(v []*Archive) *StartRcpMgRequest {
	s.Archives = v
	return s
}

func (s *StartRcpMgRequest) SetArVarValueJson(v string) *StartRcpMgRequest {
	s.ArVarValueJson = &v
	return s
}

func (s *StartRcpMgRequest) SetBankNo(v string) *StartRcpMgRequest {
	s.BankNo = &v
	return s
}

func (s *StartRcpMgRequest) SetBorrower(v *Person) *StartRcpMgRequest {
	s.Borrower = v
	return s
}

func (s *StartRcpMgRequest) SetExtendJson(v string) *StartRcpMgRequest {
	s.ExtendJson = &v
	return s
}

func (s *StartRcpMgRequest) SetHouse(v *House) *StartRcpMgRequest {
	s.House = v
	return s
}

func (s *StartRcpMgRequest) SetMaritalStatus(v string) *StartRcpMgRequest {
	s.MaritalStatus = &v
	return s
}

func (s *StartRcpMgRequest) SetOutBizNo(v string) *StartRcpMgRequest {
	s.OutBizNo = &v
	return s
}

func (s *StartRcpMgRequest) SetRegReason(v string) *StartRcpMgRequest {
	s.RegReason = &v
	return s
}

func (s *StartRcpMgRequest) SetRegReasonRemark(v string) *StartRcpMgRequest {
	s.RegReasonRemark = &v
	return s
}

func (s *StartRcpMgRequest) SetRegRights(v string) *StartRcpMgRequest {
	s.RegRights = &v
	return s
}

func (s *StartRcpMgRequest) SetRegType(v string) *StartRcpMgRequest {
	s.RegType = &v
	return s
}

func (s *StartRcpMgRequest) SetSpouse(v *Person) *StartRcpMgRequest {
	s.Spouse = v
	return s
}

type StartRcpMgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty"`
}

func (s StartRcpMgResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgResponse) GoString() string {
	return s.String()
}

func (s *StartRcpMgResponse) SetReqMsgId(v string) *StartRcpMgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRcpMgResponse) SetResultCode(v string) *StartRcpMgResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRcpMgResponse) SetResultMsg(v string) *StartRcpMgResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartRcpMgResponse) SetMgOrderNo(v string) *StartRcpMgResponse {
	s.MgOrderNo = &v
	return s
}

type GetRcpMgRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
}

func (s GetRcpMgRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgRequest) GoString() string {
	return s.String()
}

func (s *GetRcpMgRequest) SetAuthToken(v string) *GetRcpMgRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRcpMgRequest) SetProductInstanceId(v string) *GetRcpMgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRcpMgRequest) SetBankNo(v string) *GetRcpMgRequest {
	s.BankNo = &v
	return s
}

func (s *GetRcpMgRequest) SetMgOrderNo(v string) *GetRcpMgRequest {
	s.MgOrderNo = &v
	return s
}

type GetRcpMgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 抵押单
	MgOrder *MgOrder `json:"mg_order,omitempty" xml:"mg_order,omitempty"`
}

func (s GetRcpMgResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgResponse) GoString() string {
	return s.String()
}

func (s *GetRcpMgResponse) SetReqMsgId(v string) *GetRcpMgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRcpMgResponse) SetResultCode(v string) *GetRcpMgResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRcpMgResponse) SetResultMsg(v string) *GetRcpMgResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRcpMgResponse) SetMgOrder(v *MgOrder) *GetRcpMgResponse {
	s.MgOrder = v
	return s
}

type ConfirmRcpMgRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
	// 确认抵押登记结果，Y:继续,N:中止抵押
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 银行返回的中止抵押原因code
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 银行反馈的中止抵押原因描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
}

func (s ConfirmRcpMgRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgRequest) SetAuthToken(v string) *ConfirmRcpMgRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetProductInstanceId(v string) *ConfirmRcpMgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetBankNo(v string) *ConfirmRcpMgRequest {
	s.BankNo = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetMgOrderNo(v string) *ConfirmRcpMgRequest {
	s.MgOrderNo = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetResult(v string) *ConfirmRcpMgRequest {
	s.Result = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetFailCode(v string) *ConfirmRcpMgRequest {
	s.FailCode = &v
	return s
}

func (s *ConfirmRcpMgRequest) SetFailDesc(v string) *ConfirmRcpMgRequest {
	s.FailDesc = &v
	return s
}

type ConfirmRcpMgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmRcpMgResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgResponse) SetReqMsgId(v string) *ConfirmRcpMgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRcpMgResponse) SetResultCode(v string) *ConfirmRcpMgResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRcpMgResponse) SetResultMsg(v string) *ConfirmRcpMgResponse {
	s.ResultMsg = &v
	return s
}

type InitRcpMgRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
	// 确认预抵押结论，Y-表示继续，N-表示中止
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 中止抵押的原因code
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 中止抵押的原因描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 抵押登记相关合同变量和值全集，Map<String,String>的json格式
	ArVarValueJson *string `json:"ar_var_value_json,omitempty" xml:"ar_var_value_json,omitempty" require:"true"`
	// 抵押担保信息
	MgOrderMortGuarantee *MortGuaranteeInfo `json:"mg_order_mort_guarantee,omitempty" xml:"mg_order_mort_guarantee,omitempty" require:"true"`
}

func (s InitRcpMgRequest) String() string {
	return tea.Prettify(s)
}

func (s InitRcpMgRequest) GoString() string {
	return s.String()
}

func (s *InitRcpMgRequest) SetAuthToken(v string) *InitRcpMgRequest {
	s.AuthToken = &v
	return s
}

func (s *InitRcpMgRequest) SetProductInstanceId(v string) *InitRcpMgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitRcpMgRequest) SetBankNo(v string) *InitRcpMgRequest {
	s.BankNo = &v
	return s
}

func (s *InitRcpMgRequest) SetMgOrderNo(v string) *InitRcpMgRequest {
	s.MgOrderNo = &v
	return s
}

func (s *InitRcpMgRequest) SetResult(v string) *InitRcpMgRequest {
	s.Result = &v
	return s
}

func (s *InitRcpMgRequest) SetFailCode(v string) *InitRcpMgRequest {
	s.FailCode = &v
	return s
}

func (s *InitRcpMgRequest) SetFailDesc(v string) *InitRcpMgRequest {
	s.FailDesc = &v
	return s
}

func (s *InitRcpMgRequest) SetArVarValueJson(v string) *InitRcpMgRequest {
	s.ArVarValueJson = &v
	return s
}

func (s *InitRcpMgRequest) SetMgOrderMortGuarantee(v *MortGuaranteeInfo) *InitRcpMgRequest {
	s.MgOrderMortGuarantee = v
	return s
}

type InitRcpMgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitRcpMgResponse) String() string {
	return tea.Prettify(s)
}

func (s InitRcpMgResponse) GoString() string {
	return s.String()
}

func (s *InitRcpMgResponse) SetReqMsgId(v string) *InitRcpMgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitRcpMgResponse) SetResultCode(v string) *InitRcpMgResponse {
	s.ResultCode = &v
	return s
}

func (s *InitRcpMgResponse) SetResultMsg(v string) *InitRcpMgResponse {
	s.ResultMsg = &v
	return s
}

type StartRcpMgvtwoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty"`
	// 外部业务单号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 借款人
	Borrower *Person `json:"borrower,omitempty" xml:"borrower,omitempty"`
	// 婚姻状况
	MaritalStatus *string `json:"marital_status,omitempty" xml:"marital_status,omitempty"`
	// 借款人配偶
	Spouse *Person `json:"spouse,omitempty" xml:"spouse,omitempty"`
	// 房产信息
	House *House `json:"house,omitempty" xml:"house,omitempty"`
	// 待签合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" type:"Repeated"`
	// 客户签署合同过期时间
	ArExpireTime *string `json:"ar_expire_time,omitempty" xml:"ar_expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵押担保信息
	MgOrderMortGuarantee *MortGuaranteeInfo `json:"mg_order_mort_guarantee,omitempty" xml:"mg_order_mort_guarantee,omitempty"`
	// 办理业务分支行
	BranchBank *Bank `json:"branch_bank,omitempty" xml:"branch_bank,omitempty"`
}

func (s StartRcpMgvtwoRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgvtwoRequest) GoString() string {
	return s.String()
}

func (s *StartRcpMgvtwoRequest) SetAuthToken(v string) *StartRcpMgvtwoRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetProductInstanceId(v string) *StartRcpMgvtwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetLoanAssistPlatform(v string) *StartRcpMgvtwoRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetBankNo(v string) *StartRcpMgvtwoRequest {
	s.BankNo = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetOutBizNo(v string) *StartRcpMgvtwoRequest {
	s.OutBizNo = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetBorrower(v *Person) *StartRcpMgvtwoRequest {
	s.Borrower = v
	return s
}

func (s *StartRcpMgvtwoRequest) SetMaritalStatus(v string) *StartRcpMgvtwoRequest {
	s.MaritalStatus = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetSpouse(v *Person) *StartRcpMgvtwoRequest {
	s.Spouse = v
	return s
}

func (s *StartRcpMgvtwoRequest) SetHouse(v *House) *StartRcpMgvtwoRequest {
	s.House = v
	return s
}

func (s *StartRcpMgvtwoRequest) SetAgreements(v []*Agreement) *StartRcpMgvtwoRequest {
	s.Agreements = v
	return s
}

func (s *StartRcpMgvtwoRequest) SetArExpireTime(v string) *StartRcpMgvtwoRequest {
	s.ArExpireTime = &v
	return s
}

func (s *StartRcpMgvtwoRequest) SetMgOrderMortGuarantee(v *MortGuaranteeInfo) *StartRcpMgvtwoRequest {
	s.MgOrderMortGuarantee = v
	return s
}

func (s *StartRcpMgvtwoRequest) SetBranchBank(v *Bank) *StartRcpMgvtwoRequest {
	s.BranchBank = v
	return s
}

type StartRcpMgvtwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 房产链抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty"`
}

func (s StartRcpMgvtwoResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRcpMgvtwoResponse) GoString() string {
	return s.String()
}

func (s *StartRcpMgvtwoResponse) SetReqMsgId(v string) *StartRcpMgvtwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRcpMgvtwoResponse) SetResultCode(v string) *StartRcpMgvtwoResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRcpMgvtwoResponse) SetResultMsg(v string) *StartRcpMgvtwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartRcpMgvtwoResponse) SetMgOrderNo(v string) *StartRcpMgvtwoResponse {
	s.MgOrderNo = &v
	return s
}

type ConfirmRcpMgvtwoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty" require:"true"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 房产链抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
	// 确认抵押结果，Y:继续抵押,N:终止抵押
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 终止抵押原因code
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 终止抵押原因desc
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
	// 借款人
	Borrower *Person `json:"borrower,omitempty" xml:"borrower,omitempty" require:"true"`
	// 婚姻状况,MARRIED=已婚
	MaritalStatus *string `json:"marital_status,omitempty" xml:"marital_status,omitempty" require:"true"`
	// 借款人配偶
	Spouse *Person `json:"spouse,omitempty" xml:"spouse,omitempty"`
	// 银行签署完成的合同列表
	Agreements []*Agreement `json:"agreements,omitempty" xml:"agreements,omitempty" require:"true" type:"Repeated"`
	// 确认抵押需要的影印材料列表
	Archives []*Archive `json:"archives,omitempty" xml:"archives,omitempty" require:"true" type:"Repeated"`
	// 登记权利类型，MORTGAGE_RIGHTS=抵押权
	RegRights *string `json:"reg_rights,omitempty" xml:"reg_rights,omitempty" require:"true"`
	// 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
	RegType *string `json:"reg_type,omitempty" xml:"reg_type,omitempty" require:"true"`
	// 登记设立原因,LOAN=借贷
	RegReason *string `json:"reg_reason,omitempty" xml:"reg_reason,omitempty" require:"true"`
	// 登记设立原因备注
	RegReasonRemark *string `json:"reg_reason_remark,omitempty" xml:"reg_reason_remark,omitempty" require:"true"`
}

func (s ConfirmRcpMgvtwoRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgvtwoRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgvtwoRequest) SetAuthToken(v string) *ConfirmRcpMgvtwoRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetProductInstanceId(v string) *ConfirmRcpMgvtwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetLoanAssistPlatform(v string) *ConfirmRcpMgvtwoRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetBankNo(v string) *ConfirmRcpMgvtwoRequest {
	s.BankNo = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetMgOrderNo(v string) *ConfirmRcpMgvtwoRequest {
	s.MgOrderNo = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetResult(v string) *ConfirmRcpMgvtwoRequest {
	s.Result = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetFailCode(v string) *ConfirmRcpMgvtwoRequest {
	s.FailCode = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetFailDesc(v string) *ConfirmRcpMgvtwoRequest {
	s.FailDesc = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetBorrower(v *Person) *ConfirmRcpMgvtwoRequest {
	s.Borrower = v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetMaritalStatus(v string) *ConfirmRcpMgvtwoRequest {
	s.MaritalStatus = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetSpouse(v *Person) *ConfirmRcpMgvtwoRequest {
	s.Spouse = v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetAgreements(v []*Agreement) *ConfirmRcpMgvtwoRequest {
	s.Agreements = v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetArchives(v []*Archive) *ConfirmRcpMgvtwoRequest {
	s.Archives = v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetRegRights(v string) *ConfirmRcpMgvtwoRequest {
	s.RegRights = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetRegType(v string) *ConfirmRcpMgvtwoRequest {
	s.RegType = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetRegReason(v string) *ConfirmRcpMgvtwoRequest {
	s.RegReason = &v
	return s
}

func (s *ConfirmRcpMgvtwoRequest) SetRegReasonRemark(v string) *ConfirmRcpMgvtwoRequest {
	s.RegReasonRemark = &v
	return s
}

type ConfirmRcpMgvtwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmRcpMgvtwoResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcpMgvtwoResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRcpMgvtwoResponse) SetReqMsgId(v string) *ConfirmRcpMgvtwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRcpMgvtwoResponse) SetResultCode(v string) *ConfirmRcpMgvtwoResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRcpMgvtwoResponse) SetResultMsg(v string) *ConfirmRcpMgvtwoResponse {
	s.ResultMsg = &v
	return s
}

type CloseRcpMgvtwoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 助贷平台
	LoanAssistPlatform *string `json:"loan_assist_platform,omitempty" xml:"loan_assist_platform,omitempty" require:"true"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 房产链抵押单
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
	// 终止抵押原因码
	FailCode *string `json:"fail_code,omitempty" xml:"fail_code,omitempty"`
	// 终止抵押原因描述
	FailDesc *string `json:"fail_desc,omitempty" xml:"fail_desc,omitempty"`
}

func (s CloseRcpMgvtwoRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseRcpMgvtwoRequest) GoString() string {
	return s.String()
}

func (s *CloseRcpMgvtwoRequest) SetAuthToken(v string) *CloseRcpMgvtwoRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetProductInstanceId(v string) *CloseRcpMgvtwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetLoanAssistPlatform(v string) *CloseRcpMgvtwoRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetBankNo(v string) *CloseRcpMgvtwoRequest {
	s.BankNo = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetMgOrderNo(v string) *CloseRcpMgvtwoRequest {
	s.MgOrderNo = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetFailCode(v string) *CloseRcpMgvtwoRequest {
	s.FailCode = &v
	return s
}

func (s *CloseRcpMgvtwoRequest) SetFailDesc(v string) *CloseRcpMgvtwoRequest {
	s.FailDesc = &v
	return s
}

type CloseRcpMgvtwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloseRcpMgvtwoResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseRcpMgvtwoResponse) GoString() string {
	return s.String()
}

func (s *CloseRcpMgvtwoResponse) SetReqMsgId(v string) *CloseRcpMgvtwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseRcpMgvtwoResponse) SetResultCode(v string) *CloseRcpMgvtwoResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseRcpMgvtwoResponse) SetResultMsg(v string) *CloseRcpMgvtwoResponse {
	s.ResultMsg = &v
	return s
}

type GetRcpMgvtwoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 房产链内部银行编号
	BankNo *string `json:"bank_no,omitempty" xml:"bank_no,omitempty" require:"true"`
	// 房产链内部抵押单号
	MgOrderNo *string `json:"mg_order_no,omitempty" xml:"mg_order_no,omitempty" require:"true"`
}

func (s GetRcpMgvtwoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgvtwoRequest) GoString() string {
	return s.String()
}

func (s *GetRcpMgvtwoRequest) SetAuthToken(v string) *GetRcpMgvtwoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRcpMgvtwoRequest) SetProductInstanceId(v string) *GetRcpMgvtwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRcpMgvtwoRequest) SetBankNo(v string) *GetRcpMgvtwoRequest {
	s.BankNo = &v
	return s
}

func (s *GetRcpMgvtwoRequest) SetMgOrderNo(v string) *GetRcpMgvtwoRequest {
	s.MgOrderNo = &v
	return s
}

type GetRcpMgvtwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 抵押单明细
	MgOrder *MgOrder `json:"mg_order,omitempty" xml:"mg_order,omitempty"`
}

func (s GetRcpMgvtwoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRcpMgvtwoResponse) GoString() string {
	return s.String()
}

func (s *GetRcpMgvtwoResponse) SetReqMsgId(v string) *GetRcpMgvtwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRcpMgvtwoResponse) SetResultCode(v string) *GetRcpMgvtwoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRcpMgvtwoResponse) SetResultMsg(v string) *GetRcpMgvtwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRcpMgvtwoResponse) SetMgOrder(v *MgOrder) *GetRcpMgvtwoResponse {
	s.MgOrder = v
	return s
}

type AuthRcpRtcRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申办业务号
	ApplyBizId *string `json:"apply_biz_id,omitempty" xml:"apply_biz_id,omitempty" require:"true"`
	// 签署任务描述
	SignTaskProfile *SignTaskProfile `json:"sign_task_profile,omitempty" xml:"sign_task_profile,omitempty" require:"true"`
}

func (s AuthRcpRtcRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthRcpRtcRequest) GoString() string {
	return s.String()
}

func (s *AuthRcpRtcRequest) SetAuthToken(v string) *AuthRcpRtcRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthRcpRtcRequest) SetProductInstanceId(v string) *AuthRcpRtcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthRcpRtcRequest) SetApplyBizId(v string) *AuthRcpRtcRequest {
	s.ApplyBizId = &v
	return s
}

func (s *AuthRcpRtcRequest) SetSignTaskProfile(v *SignTaskProfile) *AuthRcpRtcRequest {
	s.SignTaskProfile = v
	return s
}

type AuthRcpRtcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthRcpRtcResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthRcpRtcResponse) GoString() string {
	return s.String()
}

func (s *AuthRcpRtcResponse) SetReqMsgId(v string) *AuthRcpRtcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthRcpRtcResponse) SetResultCode(v string) *AuthRcpRtcResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthRcpRtcResponse) SetResultMsg(v string) *AuthRcpRtcResponse {
	s.ResultMsg = &v
	return s
}

type FinishRcpRtcRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申办业务号
	ApplyBizId *string `json:"apply_biz_id,omitempty" xml:"apply_biz_id,omitempty" require:"true"`
	// 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
	BizStatus *string `json:"biz_status,omitempty" xml:"biz_status,omitempty" require:"true"`
	// 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 被担保主债权数额
	DebtAmount *Amount `json:"debt_amount,omitempty" xml:"debt_amount,omitempty" require:"true"`
	// 履债结束日期，格式为：yyyy-MM-dd
	DebtEndDate *string `json:"debt_end_date,omitempty" xml:"debt_end_date,omitempty"`
	// 履债开始日期，格式为：yyyy-MM-dd
	DebtStartDate *string `json:"debt_start_date,omitempty" xml:"debt_start_date,omitempty"`
	// 评估价值
	EvaluationAmount *Amount `json:"evaluation_amount,omitempty" xml:"evaluation_amount,omitempty"`
	// 抵押权人
	Mortgagee *EntityBasicInfo `json:"mortgagee,omitempty" xml:"mortgagee,omitempty" require:"true"`
	// 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
	MortgageType *string `json:"mortgage_type,omitempty" xml:"mortgage_type,omitempty" require:"true"`
	// 他项权证信息
	OtherRightInfo *OtherRightInfo `json:"other_right_info,omitempty" xml:"other_right_info,omitempty" require:"true"`
	// 登记日期，格式为：yyyy-MM-dd
	RegisteredDate *string `json:"registered_date,omitempty" xml:"registered_date,omitempty" require:"true"`
	// 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
	MaterialFileList []*MaterialFileInfo `json:"material_file_list,omitempty" xml:"material_file_list,omitempty" type:"Repeated"`
}

func (s FinishRcpRtcRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishRcpRtcRequest) GoString() string {
	return s.String()
}

func (s *FinishRcpRtcRequest) SetAuthToken(v string) *FinishRcpRtcRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishRcpRtcRequest) SetProductInstanceId(v string) *FinishRcpRtcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishRcpRtcRequest) SetApplyBizId(v string) *FinishRcpRtcRequest {
	s.ApplyBizId = &v
	return s
}

func (s *FinishRcpRtcRequest) SetBizStatus(v string) *FinishRcpRtcRequest {
	s.BizStatus = &v
	return s
}

func (s *FinishRcpRtcRequest) SetBizType(v string) *FinishRcpRtcRequest {
	s.BizType = &v
	return s
}

func (s *FinishRcpRtcRequest) SetDebtAmount(v *Amount) *FinishRcpRtcRequest {
	s.DebtAmount = v
	return s
}

func (s *FinishRcpRtcRequest) SetDebtEndDate(v string) *FinishRcpRtcRequest {
	s.DebtEndDate = &v
	return s
}

func (s *FinishRcpRtcRequest) SetDebtStartDate(v string) *FinishRcpRtcRequest {
	s.DebtStartDate = &v
	return s
}

func (s *FinishRcpRtcRequest) SetEvaluationAmount(v *Amount) *FinishRcpRtcRequest {
	s.EvaluationAmount = v
	return s
}

func (s *FinishRcpRtcRequest) SetMortgagee(v *EntityBasicInfo) *FinishRcpRtcRequest {
	s.Mortgagee = v
	return s
}

func (s *FinishRcpRtcRequest) SetMortgageType(v string) *FinishRcpRtcRequest {
	s.MortgageType = &v
	return s
}

func (s *FinishRcpRtcRequest) SetOtherRightInfo(v *OtherRightInfo) *FinishRcpRtcRequest {
	s.OtherRightInfo = v
	return s
}

func (s *FinishRcpRtcRequest) SetRegisteredDate(v string) *FinishRcpRtcRequest {
	s.RegisteredDate = &v
	return s
}

func (s *FinishRcpRtcRequest) SetMaterialFileList(v []*MaterialFileInfo) *FinishRcpRtcRequest {
	s.MaterialFileList = v
	return s
}

type FinishRcpRtcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishRcpRtcResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishRcpRtcResponse) GoString() string {
	return s.String()
}

func (s *FinishRcpRtcResponse) SetReqMsgId(v string) *FinishRcpRtcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishRcpRtcResponse) SetResultCode(v string) *FinishRcpRtcResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishRcpRtcResponse) SetResultMsg(v string) *FinishRcpRtcResponse {
	s.ResultMsg = &v
	return s
}

type FinishRcpNingboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
	Ywh *string `json:"ywh,omitempty" xml:"ywh,omitempty" require:"true"`
	// 不动产单元号，如14-2-1802
	Bdcdyh *string `json:"bdcdyh,omitempty" xml:"bdcdyh,omitempty" require:"true"`
	// 不动产登记证明号
	Bdcdjzmh *string `json:"bdcdjzmh,omitempty" xml:"bdcdjzmh,omitempty" require:"true"`
	// 证明权利或事项
	Zmqlhsx *string `json:"zmqlhsx,omitempty" xml:"zmqlhsx,omitempty" require:"true"`
	// 权利人
	Qlr *string `json:"qlr,omitempty" xml:"qlr,omitempty" require:"true"`
	// 义务人
	Ywr *string `json:"ywr,omitempty" xml:"ywr,omitempty" require:"true"`
	// 坐落
	Zl *string `json:"zl,omitempty" xml:"zl,omitempty" require:"true"`
	// 其他
	Qt *string `json:"qt,omitempty" xml:"qt,omitempty"`
	// 附记
	Fj *string `json:"fj,omitempty" xml:"fj,omitempty" require:"true"`
	// 发证工本号
	Fzgbh *string `json:"fzgbh,omitempty" xml:"fzgbh,omitempty" require:"true"`
	// 缮证人
	Szr *string `json:"szr,omitempty" xml:"szr,omitempty" require:"true"`
	// 缮证时间
	Szsj *string `json:"szsj,omitempty" xml:"szsj,omitempty" require:"true"`
	// 发证人
	Fzr *string `json:"fzr,omitempty" xml:"fzr,omitempty" require:"true"`
	// 发证时间
	Fzsj *string `json:"fzsj,omitempty" xml:"fzsj,omitempty" require:"true"`
	// 发证机关
	Fzjg *string `json:"fzjg,omitempty" xml:"fzjg,omitempty" require:"true"`
	// 区县代码
	Qxdm *int64 `json:"qxdm,omitempty" xml:"qxdm,omitempty" require:"true"`
	// 省编号
	Sbh *string `json:"sbh,omitempty" xml:"sbh,omitempty" require:"true"`
	// 登记证明种类
	Djzmzl *string `json:"djzmzl,omitempty" xml:"djzmzl,omitempty" require:"true"`
	// 电子版文件字符串
	Djzmfile *string `json:"djzmfile,omitempty" xml:"djzmfile,omitempty" require:"true"`
	// 债权数额，单位:万元
	Zqse *string `json:"zqse,omitempty" xml:"zqse,omitempty" require:"true"`
	// 抵押权起始日期，格式：“yyyy-MM-dd”
	Qlqssj *string `json:"qlqssj,omitempty" xml:"qlqssj,omitempty" require:"true"`
	// 抵押权结束日期，格式：“yyyy-MM-dd”
	Qljssj *string `json:"qljssj,omitempty" xml:"qljssj,omitempty" require:"true"`
	// 抵押方式
	Dyfs *string `json:"dyfs,omitempty" xml:"dyfs,omitempty" require:"true"`
}

func (s FinishRcpNingboRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishRcpNingboRequest) GoString() string {
	return s.String()
}

func (s *FinishRcpNingboRequest) SetAuthToken(v string) *FinishRcpNingboRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishRcpNingboRequest) SetProductInstanceId(v string) *FinishRcpNingboRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishRcpNingboRequest) SetYwh(v string) *FinishRcpNingboRequest {
	s.Ywh = &v
	return s
}

func (s *FinishRcpNingboRequest) SetBdcdyh(v string) *FinishRcpNingboRequest {
	s.Bdcdyh = &v
	return s
}

func (s *FinishRcpNingboRequest) SetBdcdjzmh(v string) *FinishRcpNingboRequest {
	s.Bdcdjzmh = &v
	return s
}

func (s *FinishRcpNingboRequest) SetZmqlhsx(v string) *FinishRcpNingboRequest {
	s.Zmqlhsx = &v
	return s
}

func (s *FinishRcpNingboRequest) SetQlr(v string) *FinishRcpNingboRequest {
	s.Qlr = &v
	return s
}

func (s *FinishRcpNingboRequest) SetYwr(v string) *FinishRcpNingboRequest {
	s.Ywr = &v
	return s
}

func (s *FinishRcpNingboRequest) SetZl(v string) *FinishRcpNingboRequest {
	s.Zl = &v
	return s
}

func (s *FinishRcpNingboRequest) SetQt(v string) *FinishRcpNingboRequest {
	s.Qt = &v
	return s
}

func (s *FinishRcpNingboRequest) SetFj(v string) *FinishRcpNingboRequest {
	s.Fj = &v
	return s
}

func (s *FinishRcpNingboRequest) SetFzgbh(v string) *FinishRcpNingboRequest {
	s.Fzgbh = &v
	return s
}

func (s *FinishRcpNingboRequest) SetSzr(v string) *FinishRcpNingboRequest {
	s.Szr = &v
	return s
}

func (s *FinishRcpNingboRequest) SetSzsj(v string) *FinishRcpNingboRequest {
	s.Szsj = &v
	return s
}

func (s *FinishRcpNingboRequest) SetFzr(v string) *FinishRcpNingboRequest {
	s.Fzr = &v
	return s
}

func (s *FinishRcpNingboRequest) SetFzsj(v string) *FinishRcpNingboRequest {
	s.Fzsj = &v
	return s
}

func (s *FinishRcpNingboRequest) SetFzjg(v string) *FinishRcpNingboRequest {
	s.Fzjg = &v
	return s
}

func (s *FinishRcpNingboRequest) SetQxdm(v int64) *FinishRcpNingboRequest {
	s.Qxdm = &v
	return s
}

func (s *FinishRcpNingboRequest) SetSbh(v string) *FinishRcpNingboRequest {
	s.Sbh = &v
	return s
}

func (s *FinishRcpNingboRequest) SetDjzmzl(v string) *FinishRcpNingboRequest {
	s.Djzmzl = &v
	return s
}

func (s *FinishRcpNingboRequest) SetDjzmfile(v string) *FinishRcpNingboRequest {
	s.Djzmfile = &v
	return s
}

func (s *FinishRcpNingboRequest) SetZqse(v string) *FinishRcpNingboRequest {
	s.Zqse = &v
	return s
}

func (s *FinishRcpNingboRequest) SetQlqssj(v string) *FinishRcpNingboRequest {
	s.Qlqssj = &v
	return s
}

func (s *FinishRcpNingboRequest) SetQljssj(v string) *FinishRcpNingboRequest {
	s.Qljssj = &v
	return s
}

func (s *FinishRcpNingboRequest) SetDyfs(v string) *FinishRcpNingboRequest {
	s.Dyfs = &v
	return s
}

type FinishRcpNingboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishRcpNingboResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishRcpNingboResponse) GoString() string {
	return s.String()
}

func (s *FinishRcpNingboResponse) SetReqMsgId(v string) *FinishRcpNingboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishRcpNingboResponse) SetResultCode(v string) *FinishRcpNingboResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishRcpNingboResponse) SetResultMsg(v string) *FinishRcpNingboResponse {
	s.ResultMsg = &v
	return s
}

type RefuseRcpNingboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间，是以long类型的字符串
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 业务号
	Ywh *string `json:"ywh,omitempty" xml:"ywh,omitempty" require:"true"`
	// 状态：1—审核通过（开始受理），2—驳回
	//
	Zt *string `json:"zt,omitempty" xml:"zt,omitempty" require:"true"`
	// 备注，驳回原因
	Bz *string `json:"bz,omitempty" xml:"bz,omitempty" require:"true"`
	// 操作人
	Czr *string `json:"czr,omitempty" xml:"czr,omitempty" require:"true"`
	// 操作时间 yyyy-MM-dd HH:mm:ss
	Czsj *string `json:"czsj,omitempty" xml:"czsj,omitempty" require:"true"`
}

func (s RefuseRcpNingboRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseRcpNingboRequest) GoString() string {
	return s.String()
}

func (s *RefuseRcpNingboRequest) SetAuthToken(v string) *RefuseRcpNingboRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetProductInstanceId(v string) *RefuseRcpNingboRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetTimestamp(v string) *RefuseRcpNingboRequest {
	s.Timestamp = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetYwh(v string) *RefuseRcpNingboRequest {
	s.Ywh = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetZt(v string) *RefuseRcpNingboRequest {
	s.Zt = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetBz(v string) *RefuseRcpNingboRequest {
	s.Bz = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetCzr(v string) *RefuseRcpNingboRequest {
	s.Czr = &v
	return s
}

func (s *RefuseRcpNingboRequest) SetCzsj(v string) *RefuseRcpNingboRequest {
	s.Czsj = &v
	return s
}

type RefuseRcpNingboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseRcpNingboResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseRcpNingboResponse) GoString() string {
	return s.String()
}

func (s *RefuseRcpNingboResponse) SetReqMsgId(v string) *RefuseRcpNingboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseRcpNingboResponse) SetResultCode(v string) *RefuseRcpNingboResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseRcpNingboResponse) SetResultMsg(v string) *RefuseRcpNingboResponse {
	s.ResultMsg = &v
	return s
}

type CreateRealtytradeOrgRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司名称的全称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 证件类型对应的证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
	ManagerCertType *string `json:"manager_cert_type,omitempty" xml:"manager_cert_type,omitempty"`
	// 经办人的证件号码
	//
	//
	ManagerCertNo *string `json:"manager_cert_no,omitempty" xml:"manager_cert_no,omitempty" require:"true"`
	// 经办人的姓名
	//
	//
	ManagerName *string `json:"manager_name,omitempty" xml:"manager_name,omitempty" require:"true"`
}

func (s CreateRealtytradeOrgRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradeOrgRequest) GoString() string {
	return s.String()
}

func (s *CreateRealtytradeOrgRequest) SetAuthToken(v string) *CreateRealtytradeOrgRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetProductInstanceId(v string) *CreateRealtytradeOrgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetName(v string) *CreateRealtytradeOrgRequest {
	s.Name = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetCertType(v string) *CreateRealtytradeOrgRequest {
	s.CertType = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetCertNo(v string) *CreateRealtytradeOrgRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetManagerCertType(v string) *CreateRealtytradeOrgRequest {
	s.ManagerCertType = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetManagerCertNo(v string) *CreateRealtytradeOrgRequest {
	s.ManagerCertNo = &v
	return s
}

func (s *CreateRealtytradeOrgRequest) SetManagerName(v string) *CreateRealtytradeOrgRequest {
	s.ManagerName = &v
	return s
}

type CreateRealtytradeOrgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本机构在数字房产平台的唯一ID
	//
	//
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
}

func (s CreateRealtytradeOrgResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradeOrgResponse) GoString() string {
	return s.String()
}

func (s *CreateRealtytradeOrgResponse) SetReqMsgId(v string) *CreateRealtytradeOrgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealtytradeOrgResponse) SetResultCode(v string) *CreateRealtytradeOrgResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealtytradeOrgResponse) SetResultMsg(v string) *CreateRealtytradeOrgResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealtytradeOrgResponse) SetOrgId(v string) *CreateRealtytradeOrgResponse {
	s.OrgId = &v
	return s
}

type CreateRealtytradeOrgsealRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业账户注册时返回的机构ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
	TemplateType *string `json:"template_type,omitempty" xml:"template_type,omitempty"`
	// 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
	SealColor *string `json:"seal_color,omitempty" xml:"seal_color,omitempty"`
	// 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
	CenterPattern *string `json:"center_pattern,omitempty" xml:"center_pattern,omitempty"`
	// 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
	HorizontalTitle *string `json:"horizontal_title,omitempty" xml:"horizontal_title,omitempty"`
	// 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
	LastTitle *string `json:"last_title,omitempty" xml:"last_title,omitempty"`
}

func (s CreateRealtytradeOrgsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradeOrgsealRequest) GoString() string {
	return s.String()
}

func (s *CreateRealtytradeOrgsealRequest) SetAuthToken(v string) *CreateRealtytradeOrgsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetProductInstanceId(v string) *CreateRealtytradeOrgsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetOrgId(v string) *CreateRealtytradeOrgsealRequest {
	s.OrgId = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetTemplateType(v string) *CreateRealtytradeOrgsealRequest {
	s.TemplateType = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetSealColor(v string) *CreateRealtytradeOrgsealRequest {
	s.SealColor = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetCenterPattern(v string) *CreateRealtytradeOrgsealRequest {
	s.CenterPattern = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetHorizontalTitle(v string) *CreateRealtytradeOrgsealRequest {
	s.HorizontalTitle = &v
	return s
}

func (s *CreateRealtytradeOrgsealRequest) SetLastTitle(v string) *CreateRealtytradeOrgsealRequest {
	s.LastTitle = &v
	return s
}

type CreateRealtytradeOrgsealResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业印章 ID
	OrgSealId *string `json:"org_seal_id,omitempty" xml:"org_seal_id,omitempty"`
	// 印章图片下载URL地址，1个小时内有效
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateRealtytradeOrgsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradeOrgsealResponse) GoString() string {
	return s.String()
}

func (s *CreateRealtytradeOrgsealResponse) SetReqMsgId(v string) *CreateRealtytradeOrgsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealtytradeOrgsealResponse) SetResultCode(v string) *CreateRealtytradeOrgsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealtytradeOrgsealResponse) SetResultMsg(v string) *CreateRealtytradeOrgsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealtytradeOrgsealResponse) SetOrgSealId(v string) *CreateRealtytradeOrgsealResponse {
	s.OrgSealId = &v
	return s
}

func (s *CreateRealtytradeOrgsealResponse) SetUrl(v string) *CreateRealtytradeOrgsealResponse {
	s.Url = &v
	return s
}

type CreateRealtytradePersonalRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 证件类型详见 https://tech.antfin.com/docs/2/155166，默认为CRED_PSN_CH_IDCARD（身份证类型）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Telephone *string `json:"telephone,omitempty" xml:"telephone,omitempty" require:"true"`
}

func (s CreateRealtytradePersonalRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradePersonalRequest) GoString() string {
	return s.String()
}

func (s *CreateRealtytradePersonalRequest) SetAuthToken(v string) *CreateRealtytradePersonalRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealtytradePersonalRequest) SetProductInstanceId(v string) *CreateRealtytradePersonalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealtytradePersonalRequest) SetName(v string) *CreateRealtytradePersonalRequest {
	s.Name = &v
	return s
}

func (s *CreateRealtytradePersonalRequest) SetCertType(v string) *CreateRealtytradePersonalRequest {
	s.CertType = &v
	return s
}

func (s *CreateRealtytradePersonalRequest) SetCertNo(v string) *CreateRealtytradePersonalRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRealtytradePersonalRequest) SetTelephone(v string) *CreateRealtytradePersonalRequest {
	s.Telephone = &v
	return s
}

type CreateRealtytradePersonalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人在数字房产平台的唯一ID
	PersonalId *string `json:"personal_id,omitempty" xml:"personal_id,omitempty"`
}

func (s CreateRealtytradePersonalResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradePersonalResponse) GoString() string {
	return s.String()
}

func (s *CreateRealtytradePersonalResponse) SetReqMsgId(v string) *CreateRealtytradePersonalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealtytradePersonalResponse) SetResultCode(v string) *CreateRealtytradePersonalResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealtytradePersonalResponse) SetResultMsg(v string) *CreateRealtytradePersonalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealtytradePersonalResponse) SetPersonalId(v string) *CreateRealtytradePersonalResponse {
	s.PersonalId = &v
	return s
}

type CreateRealtytradePersonalsealRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 个人在数字房产平台的唯一ID
	PersonalId *string `json:"personal_id,omitempty" xml:"personal_id,omitempty" require:"true"`
	// 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
	PictureData *string `json:"picture_data,omitempty" xml:"picture_data,omitempty" require:"true"`
	// 印章高度，单位为px，默认95
	SealHeight *int64 `json:"seal_height,omitempty" xml:"seal_height,omitempty"`
	// 印章宽度，单位为px，默认95
	SealWidth *int64 `json:"seal_width,omitempty" xml:"seal_width,omitempty"`
	// 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
	Transparentizing *bool `json:"transparentizing,omitempty" xml:"transparentizing,omitempty"`
}

func (s CreateRealtytradePersonalsealRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradePersonalsealRequest) GoString() string {
	return s.String()
}

func (s *CreateRealtytradePersonalsealRequest) SetAuthToken(v string) *CreateRealtytradePersonalsealRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetProductInstanceId(v string) *CreateRealtytradePersonalsealRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetPersonalId(v string) *CreateRealtytradePersonalsealRequest {
	s.PersonalId = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetPictureData(v string) *CreateRealtytradePersonalsealRequest {
	s.PictureData = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetSealHeight(v int64) *CreateRealtytradePersonalsealRequest {
	s.SealHeight = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetSealWidth(v int64) *CreateRealtytradePersonalsealRequest {
	s.SealWidth = &v
	return s
}

func (s *CreateRealtytradePersonalsealRequest) SetTransparentizing(v bool) *CreateRealtytradePersonalsealRequest {
	s.Transparentizing = &v
	return s
}

type CreateRealtytradePersonalsealResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 个人印章 ID
	PersonalSealId *string `json:"personal_seal_id,omitempty" xml:"personal_seal_id,omitempty"`
	// 印章图片下载URL地址，1个小时内有效
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateRealtytradePersonalsealResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealtytradePersonalsealResponse) GoString() string {
	return s.String()
}

func (s *CreateRealtytradePersonalsealResponse) SetReqMsgId(v string) *CreateRealtytradePersonalsealResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealtytradePersonalsealResponse) SetResultCode(v string) *CreateRealtytradePersonalsealResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealtytradePersonalsealResponse) SetResultMsg(v string) *CreateRealtytradePersonalsealResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealtytradePersonalsealResponse) SetPersonalSealId(v string) *CreateRealtytradePersonalsealResponse {
	s.PersonalSealId = &v
	return s
}

func (s *CreateRealtytradePersonalsealResponse) SetUrl(v string) *CreateRealtytradePersonalsealResponse {
	s.Url = &v
	return s
}

type StartRealtytradeSigningRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构账号 ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 业务描述,描述本次合同文档加载业务
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 合同及签署信息列表
	ContractList []*ContractSigning `json:"contract_list,omitempty" xml:"contract_list,omitempty" require:"true" type:"Repeated"`
}

func (s StartRealtytradeSigningRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRealtytradeSigningRequest) GoString() string {
	return s.String()
}

func (s *StartRealtytradeSigningRequest) SetAuthToken(v string) *StartRealtytradeSigningRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRealtytradeSigningRequest) SetProductInstanceId(v string) *StartRealtytradeSigningRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRealtytradeSigningRequest) SetOrgId(v string) *StartRealtytradeSigningRequest {
	s.OrgId = &v
	return s
}

func (s *StartRealtytradeSigningRequest) SetDescription(v string) *StartRealtytradeSigningRequest {
	s.Description = &v
	return s
}

func (s *StartRealtytradeSigningRequest) SetContractList(v []*ContractSigning) *StartRealtytradeSigningRequest {
	s.ContractList = v
	return s
}

type StartRealtytradeSigningResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署流程 ID
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty"`
	// 签署中的多个合同文件信息
	ContractList []*Contract `json:"contract_list,omitempty" xml:"contract_list,omitempty" type:"Repeated"`
}

func (s StartRealtytradeSigningResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRealtytradeSigningResponse) GoString() string {
	return s.String()
}

func (s *StartRealtytradeSigningResponse) SetReqMsgId(v string) *StartRealtytradeSigningResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRealtytradeSigningResponse) SetResultCode(v string) *StartRealtytradeSigningResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRealtytradeSigningResponse) SetResultMsg(v string) *StartRealtytradeSigningResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartRealtytradeSigningResponse) SetProcessId(v string) *StartRealtytradeSigningResponse {
	s.ProcessId = &v
	return s
}

func (s *StartRealtytradeSigningResponse) SetContractList(v []*Contract) *StartRealtytradeSigningResponse {
	s.ContractList = v
	return s
}

type QueryRealtytradeSigningRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署流程 ID
	//
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
}

func (s QueryRealtytradeSigningRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRealtytradeSigningRequest) GoString() string {
	return s.String()
}

func (s *QueryRealtytradeSigningRequest) SetAuthToken(v string) *QueryRealtytradeSigningRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRealtytradeSigningRequest) SetProductInstanceId(v string) *QueryRealtytradeSigningRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRealtytradeSigningRequest) SetProcessId(v string) *QueryRealtytradeSigningRequest {
	s.ProcessId = &v
	return s
}

type QueryRealtytradeSigningResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 异常信息的文本描述
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署流程 ID
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty"`
	// 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签
	SigningResult *string `json:"signing_result,omitempty" xml:"signing_result,omitempty"`
	// 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
	ContractList []*Contract `json:"contract_list,omitempty" xml:"contract_list,omitempty" type:"Repeated"`
}

func (s QueryRealtytradeSigningResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRealtytradeSigningResponse) GoString() string {
	return s.String()
}

func (s *QueryRealtytradeSigningResponse) SetReqMsgId(v string) *QueryRealtytradeSigningResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetResultCode(v string) *QueryRealtytradeSigningResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetResultMsg(v string) *QueryRealtytradeSigningResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetProcessId(v string) *QueryRealtytradeSigningResponse {
	s.ProcessId = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetStatus(v string) *QueryRealtytradeSigningResponse {
	s.Status = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetSigningResult(v string) *QueryRealtytradeSigningResponse {
	s.SigningResult = &v
	return s
}

func (s *QueryRealtytradeSigningResponse) SetContractList(v []*Contract) *QueryRealtytradeSigningResponse {
	s.ContractList = v
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
				"sdk_version":      tea.String("1.4.10"),
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
 * Description: 发起房产查询
 * Summary: 发起房产查询
 */
func (client *Client) StartRcpHq(request *StartRcpHqRequest) (_result *StartRcpHqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRcpHqResponse{}
	_body, _err := client.StartRcpHqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起房产查询
 * Summary: 发起房产查询
 */
func (client *Client) StartRcpHqEx(request *StartRcpHqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRcpHqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRcpHqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.hq.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取房产查询单信息
 * Summary: 获取房产查询单信息
 */
func (client *Client) GetRcpHq(request *GetRcpHqRequest) (_result *GetRcpHqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRcpHqResponse{}
	_body, _err := client.GetRcpHqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取房产查询单信息
 * Summary: 获取房产查询单信息
 */
func (client *Client) GetRcpHqEx(request *GetRcpHqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRcpHqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRcpHqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.hq.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起解抵押(宁波模式)
 * Summary: 发起解抵押(宁波模式)
 */
func (client *Client) StartRcpMgr(request *StartRcpMgrRequest) (_result *StartRcpMgrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRcpMgrResponse{}
	_body, _err := client.StartRcpMgrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起解抵押(宁波模式)
 * Summary: 发起解抵押(宁波模式)
 */
func (client *Client) StartRcpMgrEx(request *StartRcpMgrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRcpMgrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRcpMgrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgr.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认解抵押(宁波模式)
 * Summary: 确认解抵押(宁波模式)
 */
func (client *Client) ConfirmRcpMgr(request *ConfirmRcpMgrRequest) (_result *ConfirmRcpMgrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRcpMgrResponse{}
	_body, _err := client.ConfirmRcpMgrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认解抵押(宁波模式)
 * Summary: 确认解抵押(宁波模式)
 */
func (client *Client) ConfirmRcpMgrEx(request *ConfirmRcpMgrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRcpMgrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRcpMgrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgr.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询解抵押单(宁波模式)
 * Summary: 查询解抵押单(宁波模式)
 */
func (client *Client) GetRcpMgr(request *GetRcpMgrRequest) (_result *GetRcpMgrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRcpMgrResponse{}
	_body, _err := client.GetRcpMgrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询解抵押单(宁波模式)
 * Summary: 查询解抵押单(宁波模式)
 */
func (client *Client) GetRcpMgrEx(request *GetRcpMgrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRcpMgrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRcpMgrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgr.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 房屋抵押贷款业务，发起抵押登记服务
 * Summary: 发起抵押登记
 */
func (client *Client) StartRcpMg(request *StartRcpMgRequest) (_result *StartRcpMgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRcpMgResponse{}
	_body, _err := client.StartRcpMgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 房屋抵押贷款业务，发起抵押登记服务
 * Summary: 发起抵押登记
 */
func (client *Client) StartRcpMgEx(request *StartRcpMgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRcpMgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRcpMgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mg.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据抵押单号查询抵押单
 * Summary: 查询抵押单
 */
func (client *Client) GetRcpMg(request *GetRcpMgRequest) (_result *GetRcpMgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRcpMgResponse{}
	_body, _err := client.GetRcpMgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据抵押单号查询抵押单
 * Summary: 查询抵押单
 */
func (client *Client) GetRcpMgEx(request *GetRcpMgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRcpMgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRcpMgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mg.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 房屋抵押登记业务，银行确认抵押登记服务
 * Summary: 确认抵押登记
 */
func (client *Client) ConfirmRcpMg(request *ConfirmRcpMgRequest) (_result *ConfirmRcpMgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRcpMgResponse{}
	_body, _err := client.ConfirmRcpMgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 房屋抵押登记业务，银行确认抵押登记服务
 * Summary: 确认抵押登记
 */
func (client *Client) ConfirmRcpMgEx(request *ConfirmRcpMgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRcpMgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRcpMgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mg.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
 * Summary: 确认进行预抵押登记
 */
func (client *Client) InitRcpMg(request *InitRcpMgRequest) (_result *InitRcpMgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitRcpMgResponse{}
	_body, _err := client.InitRcpMgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
 * Summary: 确认进行预抵押登记
 */
func (client *Client) InitRcpMgEx(request *InitRcpMgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitRcpMgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitRcpMgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mg.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起抵押(宁波模式)
 * Summary: 发起抵押(宁波模式)
 */
func (client *Client) StartRcpMgvtwo(request *StartRcpMgvtwoRequest) (_result *StartRcpMgvtwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRcpMgvtwoResponse{}
	_body, _err := client.StartRcpMgvtwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起抵押(宁波模式)
 * Summary: 发起抵押(宁波模式)
 */
func (client *Client) StartRcpMgvtwoEx(request *StartRcpMgvtwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRcpMgvtwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRcpMgvtwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgvtwo.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认抵押(宁波模式)
 * Summary: 确认抵押(宁波模式)
 */
func (client *Client) ConfirmRcpMgvtwo(request *ConfirmRcpMgvtwoRequest) (_result *ConfirmRcpMgvtwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRcpMgvtwoResponse{}
	_body, _err := client.ConfirmRcpMgvtwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认抵押(宁波模式)
 * Summary: 确认抵押(宁波模式)
 */
func (client *Client) ConfirmRcpMgvtwoEx(request *ConfirmRcpMgvtwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRcpMgvtwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRcpMgvtwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgvtwo.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终止抵押(宁波模式)
 * Summary: 终止抵押(宁波模式)
 */
func (client *Client) CloseRcpMgvtwo(request *CloseRcpMgvtwoRequest) (_result *CloseRcpMgvtwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseRcpMgvtwoResponse{}
	_body, _err := client.CloseRcpMgvtwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终止抵押(宁波模式)
 * Summary: 终止抵押(宁波模式)
 */
func (client *Client) CloseRcpMgvtwoEx(request *CloseRcpMgvtwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseRcpMgvtwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseRcpMgvtwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgvtwo.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询抵押单(宁波模式)
 * Summary: 查询抵押单(宁波模式)
 */
func (client *Client) GetRcpMgvtwo(request *GetRcpMgvtwoRequest) (_result *GetRcpMgvtwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRcpMgvtwoResponse{}
	_body, _err := client.GetRcpMgvtwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询抵押单(宁波模式)
 * Summary: 查询抵押单(宁波模式)
 */
func (client *Client) GetRcpMgvtwoEx(request *GetRcpMgvtwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRcpMgvtwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRcpMgvtwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgvtwo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
 * Summary: 接收不动产中心授权签约列表
 */
func (client *Client) AuthRcpRtc(request *AuthRcpRtcRequest) (_result *AuthRcpRtcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthRcpRtcResponse{}
	_body, _err := client.AuthRcpRtcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
 * Summary: 接收不动产中心授权签约列表
 */
func (client *Client) AuthRcpRtcEx(request *AuthRcpRtcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthRcpRtcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthRcpRtcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.rtc.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
 * Summary: 接收不动产中心业务处理结果
 */
func (client *Client) FinishRcpRtc(request *FinishRcpRtcRequest) (_result *FinishRcpRtcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishRcpRtcResponse{}
	_body, _err := client.FinishRcpRtcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
 * Summary: 接收不动产中心业务处理结果
 */
func (client *Client) FinishRcpRtcEx(request *FinishRcpRtcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishRcpRtcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishRcpRtcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.rtc.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
 * Summary: 通知抵押结果完成(宁波)
 */
func (client *Client) FinishRcpNingbo(request *FinishRcpNingboRequest) (_result *FinishRcpNingboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishRcpNingboResponse{}
	_body, _err := client.FinishRcpNingboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
 * Summary: 通知抵押结果完成(宁波)
 */
func (client *Client) FinishRcpNingboEx(request *FinishRcpNingboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishRcpNingboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishRcpNingboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.ningbo.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知抵押驳回
 * Summary: 通知抵押驳回(宁波)
 */
func (client *Client) RefuseRcpNingbo(request *RefuseRcpNingboRequest) (_result *RefuseRcpNingboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseRcpNingboResponse{}
	_body, _err := client.RefuseRcpNingboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知抵押驳回
 * Summary: 通知抵押驳回(宁波)
 */
func (client *Client) RefuseRcpNingboEx(request *RefuseRcpNingboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseRcpNingboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseRcpNingboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.ningbo.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
 * Summary: 注册企业账户
 */
func (client *Client) CreateRealtytradeOrg(request *CreateRealtytradeOrgRequest) (_result *CreateRealtytradeOrgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealtytradeOrgResponse{}
	_body, _err := client.CreateRealtytradeOrgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
 * Summary: 注册企业账户
 */
func (client *Client) CreateRealtytradeOrgEx(request *CreateRealtytradeOrgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealtytradeOrgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealtytradeOrgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.org.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
 * Summary: 创建企业印章
 */
func (client *Client) CreateRealtytradeOrgseal(request *CreateRealtytradeOrgsealRequest) (_result *CreateRealtytradeOrgsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealtytradeOrgsealResponse{}
	_body, _err := client.CreateRealtytradeOrgsealEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
 * Summary: 创建企业印章
 */
func (client *Client) CreateRealtytradeOrgsealEx(request *CreateRealtytradeOrgsealRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealtytradeOrgsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealtytradeOrgsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.orgseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
 * Summary: 注册个人账户
 */
func (client *Client) CreateRealtytradePersonal(request *CreateRealtytradePersonalRequest) (_result *CreateRealtytradePersonalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealtytradePersonalResponse{}
	_body, _err := client.CreateRealtytradePersonalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
 * Summary: 注册个人账户
 */
func (client *Client) CreateRealtytradePersonalEx(request *CreateRealtytradePersonalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealtytradePersonalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealtytradePersonalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.personal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
 * Summary: 创建个人图片印章
 */
func (client *Client) CreateRealtytradePersonalseal(request *CreateRealtytradePersonalsealRequest) (_result *CreateRealtytradePersonalsealResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealtytradePersonalsealResponse{}
	_body, _err := client.CreateRealtytradePersonalsealEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
 * Summary: 创建个人图片印章
 */
func (client *Client) CreateRealtytradePersonalsealEx(request *CreateRealtytradePersonalsealRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealtytradePersonalsealResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealtytradePersonalsealResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.personalseal.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
 * Summary: 发起签署流程
 */
func (client *Client) StartRealtytradeSigning(request *StartRealtytradeSigningRequest) (_result *StartRealtytradeSigningResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRealtytradeSigningResponse{}
	_body, _err := client.StartRealtytradeSigningEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
 * Summary: 发起签署流程
 */
func (client *Client) StartRealtytradeSigningEx(request *StartRealtytradeSigningRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRealtytradeSigningResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRealtytradeSigningResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.signing.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
 * Summary: 查看签署流程
 */
func (client *Client) QueryRealtytradeSigning(request *QueryRealtytradeSigningRequest) (_result *QueryRealtytradeSigningResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRealtytradeSigningResponse{}
	_body, _err := client.QueryRealtytradeSigningEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
 * Summary: 查看签署流程
 */
func (client *Client) QueryRealtytradeSigningEx(request *QueryRealtytradeSigningRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRealtytradeSigningResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRealtytradeSigningResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.realtytrade.signing.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
