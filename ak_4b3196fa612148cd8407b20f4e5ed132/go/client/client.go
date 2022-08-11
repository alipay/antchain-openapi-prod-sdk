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

type StartBlockchainArecRcpMgrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
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
	// 解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty"`
}

func (s StartBlockchainArecRcpMgrRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBlockchainArecRcpMgrRequest) GoString() string {
	return s.String()
}

func (s *StartBlockchainArecRcpMgrRequest) SetAuthToken(v string) *StartBlockchainArecRcpMgrRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetProductInstanceId(v string) *StartBlockchainArecRcpMgrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetLoanAssistPlatform(v string) *StartBlockchainArecRcpMgrRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetBankNo(v string) *StartBlockchainArecRcpMgrRequest {
	s.BankNo = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetOutBizNo(v string) *StartBlockchainArecRcpMgrRequest {
	s.OutBizNo = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetOtherRightCertNo(v string) *StartBlockchainArecRcpMgrRequest {
	s.OtherRightCertNo = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetWipeMortgageReason(v string) *StartBlockchainArecRcpMgrRequest {
	s.WipeMortgageReason = &v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetHouse(v *House) *StartBlockchainArecRcpMgrRequest {
	s.House = v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetBranchBank(v *Bank) *StartBlockchainArecRcpMgrRequest {
	s.BranchBank = v
	return s
}

func (s *StartBlockchainArecRcpMgrRequest) SetMgReleaseOrderNo(v string) *StartBlockchainArecRcpMgrRequest {
	s.MgReleaseOrderNo = &v
	return s
}

type StartBlockchainArecRcpMgrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解抵押单号
	MgReleaseOrderNo *string `json:"mg_release_order_no,omitempty" xml:"mg_release_order_no,omitempty"`
}

func (s StartBlockchainArecRcpMgrResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBlockchainArecRcpMgrResponse) GoString() string {
	return s.String()
}

func (s *StartBlockchainArecRcpMgrResponse) SetReqMsgId(v string) *StartBlockchainArecRcpMgrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBlockchainArecRcpMgrResponse) SetResultCode(v string) *StartBlockchainArecRcpMgrResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBlockchainArecRcpMgrResponse) SetResultMsg(v string) *StartBlockchainArecRcpMgrResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBlockchainArecRcpMgrResponse) SetMgReleaseOrderNo(v string) *StartBlockchainArecRcpMgrResponse {
	s.MgReleaseOrderNo = &v
	return s
}

type ConfirmBlockchainArecRcpMgrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
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

func (s ConfirmBlockchainArecRcpMgrRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmBlockchainArecRcpMgrRequest) GoString() string {
	return s.String()
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetAuthToken(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetProductInstanceId(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetLoanAssistPlatform(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.LoanAssistPlatform = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetBankNo(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.BankNo = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetMgReleaseOrderNo(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.MgReleaseOrderNo = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetResult(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.Result = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetFailCode(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.FailCode = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetFailDesc(v string) *ConfirmBlockchainArecRcpMgrRequest {
	s.FailDesc = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrRequest) SetAgreements(v []*Agreement) *ConfirmBlockchainArecRcpMgrRequest {
	s.Agreements = v
	return s
}

type ConfirmBlockchainArecRcpMgrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmBlockchainArecRcpMgrResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmBlockchainArecRcpMgrResponse) GoString() string {
	return s.String()
}

func (s *ConfirmBlockchainArecRcpMgrResponse) SetReqMsgId(v string) *ConfirmBlockchainArecRcpMgrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrResponse) SetResultCode(v string) *ConfirmBlockchainArecRcpMgrResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmBlockchainArecRcpMgrResponse) SetResultMsg(v string) *ConfirmBlockchainArecRcpMgrResponse {
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
				"sdk_version":      tea.String("1.0.0"),
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
 * Description: 发起解抵押(宁波模式)
 * Summary: 发起解抵押(宁波模式)
 */
func (client *Client) StartBlockchainArecRcpMgr(request *StartBlockchainArecRcpMgrRequest) (_result *StartBlockchainArecRcpMgrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBlockchainArecRcpMgrResponse{}
	_body, _err := client.StartBlockchainArecRcpMgrEx(request, headers, runtime)
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
func (client *Client) StartBlockchainArecRcpMgrEx(request *StartBlockchainArecRcpMgrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBlockchainArecRcpMgrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBlockchainArecRcpMgrResponse{}
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
func (client *Client) ConfirmBlockchainArecRcpMgr(request *ConfirmBlockchainArecRcpMgrRequest) (_result *ConfirmBlockchainArecRcpMgrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmBlockchainArecRcpMgrResponse{}
	_body, _err := client.ConfirmBlockchainArecRcpMgrEx(request, headers, runtime)
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
func (client *Client) ConfirmBlockchainArecRcpMgrEx(request *ConfirmBlockchainArecRcpMgrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmBlockchainArecRcpMgrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmBlockchainArecRcpMgrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.arec.rcp.mgr.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
