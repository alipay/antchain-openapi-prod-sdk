// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 二级商户进件申请单
type MerchantOrderInfo struct {
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 平台方的用户id, 保持唯一
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 申请状态 99-已完结;-1-失败;031-审核中
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
	FkAudit *string `json:"fk_audit,omitempty" xml:"fk_audit,omitempty"`
	// 风控审批备注
	FkAuditMemo *string `json:"fk_audit_memo,omitempty" xml:"fk_audit_memo,omitempty"`
	// 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
	KzAudit *string `json:"kz_audit,omitempty" xml:"kz_audit,omitempty"`
	// 客资审批备注
	KzAuditMemo *string `json:"kz_audit_memo,omitempty" xml:"kz_audit_memo,omitempty"`
	// 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
	SubConfirm *string `json:"sub_confirm,omitempty" xml:"sub_confirm,omitempty"`
	// 进件备注, 主要用于保存审核拒绝原因
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s MerchantOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s MerchantOrderInfo) GoString() string {
	return s.String()
}

func (s *MerchantOrderInfo) SetOrderId(v string) *MerchantOrderInfo {
	s.OrderId = &v
	return s
}

func (s *MerchantOrderInfo) SetMerchantUserId(v string) *MerchantOrderInfo {
	s.MerchantUserId = &v
	return s
}

func (s *MerchantOrderInfo) SetStatus(v string) *MerchantOrderInfo {
	s.Status = &v
	return s
}

func (s *MerchantOrderInfo) SetFkAudit(v string) *MerchantOrderInfo {
	s.FkAudit = &v
	return s
}

func (s *MerchantOrderInfo) SetFkAuditMemo(v string) *MerchantOrderInfo {
	s.FkAuditMemo = &v
	return s
}

func (s *MerchantOrderInfo) SetKzAudit(v string) *MerchantOrderInfo {
	s.KzAudit = &v
	return s
}

func (s *MerchantOrderInfo) SetKzAuditMemo(v string) *MerchantOrderInfo {
	s.KzAuditMemo = &v
	return s
}

func (s *MerchantOrderInfo) SetSubConfirm(v string) *MerchantOrderInfo {
	s.SubConfirm = &v
	return s
}

func (s *MerchantOrderInfo) SetRemark(v string) *MerchantOrderInfo {
	s.Remark = &v
	return s
}

// 地址信息
type AddressInfo struct {
	// 省份编码
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty" require:"true"`
	// 城市编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 区域编码
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty" require:"true"`
	// 详细地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s AddressInfo) String() string {
	return tea.Prettify(s)
}

func (s AddressInfo) GoString() string {
	return s.String()
}

func (s *AddressInfo) SetProvinceCode(v string) *AddressInfo {
	s.ProvinceCode = &v
	return s
}

func (s *AddressInfo) SetCityCode(v string) *AddressInfo {
	s.CityCode = &v
	return s
}

func (s *AddressInfo) SetDistrictCode(v string) *AddressInfo {
	s.DistrictCode = &v
	return s
}

func (s *AddressInfo) SetAddress(v string) *AddressInfo {
	s.Address = &v
	return s
}

// 结算规则
type SettleRule struct {
	// 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
	DefaultSettleType *string `json:"default_settle_type,omitempty" xml:"default_settle_type,omitempty" require:"true"`
	// 结算目标
	// 如果settle_type = bankCard, 这里填写银行卡卡号;
	// 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
	DefaultSettleTarget *string `json:"default_settle_target,omitempty" xml:"default_settle_target,omitempty" require:"true"`
}

func (s SettleRule) String() string {
	return tea.Prettify(s)
}

func (s SettleRule) GoString() string {
	return s.String()
}

func (s *SettleRule) SetDefaultSettleType(v string) *SettleRule {
	s.DefaultSettleType = &v
	return s
}

func (s *SettleRule) SetDefaultSettleTarget(v string) *SettleRule {
	s.DefaultSettleTarget = &v
	return s
}

// 商户资质信息
type QualificationInfo struct {
	// 商户行业资质类型,  参考https://mif-pub.alipayobjects.com/QualificationType.xlsx
	IndustryQualificationType *string `json:"industry_qualification_type,omitempty" xml:"industry_qualification_type,omitempty" require:"true"`
	// 商户行业资质图片
	IndustryQualificationImage *string `json:"industry_qualification_image,omitempty" xml:"industry_qualification_image,omitempty" require:"true"`
}

func (s QualificationInfo) String() string {
	return tea.Prettify(s)
}

func (s QualificationInfo) GoString() string {
	return s.String()
}

func (s *QualificationInfo) SetIndustryQualificationType(v string) *QualificationInfo {
	s.IndustryQualificationType = &v
	return s
}

func (s *QualificationInfo) SetIndustryQualificationImage(v string) *QualificationInfo {
	s.IndustryQualificationImage = &v
	return s
}

// 联系人信息
type ContactInfo struct {
	// 联系人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联系人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 联系人电话号码
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s ContactInfo) String() string {
	return tea.Prettify(s)
}

func (s ContactInfo) GoString() string {
	return s.String()
}

func (s *ContactInfo) SetName(v string) *ContactInfo {
	s.Name = &v
	return s
}

func (s *ContactInfo) SetMobile(v string) *ContactInfo {
	s.Mobile = &v
	return s
}

func (s *ContactInfo) SetPhone(v string) *ContactInfo {
	s.Phone = &v
	return s
}

func (s *ContactInfo) SetType(v string) *ContactInfo {
	s.Type = &v
	return s
}

// 交易结算明细
type TradeSettleDetail struct {
	// 类型
	// replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 结算明细序列号，即结算请求中的业务单据号
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 转入账户
	TransIn *string `json:"trans_in,omitempty" xml:"trans_in,omitempty"`
	// 转出账号
	TransOut *string `json:"trans_out,omitempty" xml:"trans_out,omitempty" require:"true"`
	// 金额，元，最小支持到分
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s TradeSettleDetail) String() string {
	return tea.Prettify(s)
}

func (s TradeSettleDetail) GoString() string {
	return s.String()
}

func (s *TradeSettleDetail) SetType(v string) *TradeSettleDetail {
	s.Type = &v
	return s
}

func (s *TradeSettleDetail) SetSerialNo(v string) *TradeSettleDetail {
	s.SerialNo = &v
	return s
}

func (s *TradeSettleDetail) SetTransIn(v string) *TradeSettleDetail {
	s.TransIn = &v
	return s
}

func (s *TradeSettleDetail) SetTransOut(v string) *TradeSettleDetail {
	s.TransOut = &v
	return s
}

func (s *TradeSettleDetail) SetAmount(v string) *TradeSettleDetail {
	s.Amount = &v
	return s
}

// 银行卡信息
type CardInfo struct {
	// 卡户名
	AccountHolderName *string `json:"account_holder_name,omitempty" xml:"account_holder_name,omitempty" require:"true"`
	// 卡号
	AccountNo *string `json:"account_no,omitempty" xml:"account_no,omitempty" require:"true"`
	// 银行名称
	AccountInstName *string `json:"account_inst_name,omitempty" xml:"account_inst_name,omitempty" require:"true"`
	// 银行缩写
	AccountInstId *string `json:"account_inst_id,omitempty" xml:"account_inst_id,omitempty" require:"true"`
	// 账号使用类型
	// 对公-01
	// 对私-02
	UsageType *string `json:"usage_type,omitempty" xml:"usage_type,omitempty" require:"true"`
	// 联行号
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty"`
	// 开户行所在省份
	AccountInstProvince *string `json:"account_inst_province,omitempty" xml:"account_inst_province,omitempty" require:"true"`
	// 开户行所在城市
	AccountInstCity *string `json:"account_inst_city,omitempty" xml:"account_inst_city,omitempty" require:"true"`
	// 开户行支行名称
	AccountBranchName *string `json:"account_branch_name,omitempty" xml:"account_branch_name,omitempty" require:"true"`
}

func (s CardInfo) String() string {
	return tea.Prettify(s)
}

func (s CardInfo) GoString() string {
	return s.String()
}

func (s *CardInfo) SetAccountHolderName(v string) *CardInfo {
	s.AccountHolderName = &v
	return s
}

func (s *CardInfo) SetAccountNo(v string) *CardInfo {
	s.AccountNo = &v
	return s
}

func (s *CardInfo) SetAccountInstName(v string) *CardInfo {
	s.AccountInstName = &v
	return s
}

func (s *CardInfo) SetAccountInstId(v string) *CardInfo {
	s.AccountInstId = &v
	return s
}

func (s *CardInfo) SetUsageType(v string) *CardInfo {
	s.UsageType = &v
	return s
}

func (s *CardInfo) SetBankCode(v string) *CardInfo {
	s.BankCode = &v
	return s
}

func (s *CardInfo) SetAccountInstProvince(v string) *CardInfo {
	s.AccountInstProvince = &v
	return s
}

func (s *CardInfo) SetAccountInstCity(v string) *CardInfo {
	s.AccountInstCity = &v
	return s
}

func (s *CardInfo) SetAccountBranchName(v string) *CardInfo {
	s.AccountBranchName = &v
	return s
}

// 站点信息
type SiteInfo struct {
	// 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
	SiteType *string `json:"site_type,omitempty" xml:"site_type,omitempty" require:"true"`
	// 站点名称
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 站点地址
	SiteUrl *string `json:"site_url,omitempty" xml:"site_url,omitempty" require:"true"`
}

func (s SiteInfo) String() string {
	return tea.Prettify(s)
}

func (s SiteInfo) GoString() string {
	return s.String()
}

func (s *SiteInfo) SetSiteType(v string) *SiteInfo {
	s.SiteType = &v
	return s
}

func (s *SiteInfo) SetSiteName(v string) *SiteInfo {
	s.SiteName = &v
	return s
}

func (s *SiteInfo) SetSiteUrl(v string) *SiteInfo {
	s.SiteUrl = &v
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

type CreateMerchantSellerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// source, 由中台为业务方分配, 作为业务来源标识
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
	// 商户登录账号, 跟merchant_user_id不能同时为空
	MerchantLoginName *string `json:"merchant_login_name,omitempty" xml:"merchant_login_name,omitempty"`
	// 商户别名, 会展示在账单以及支付结果页中
	MerchantAliasName *string `json:"merchant_alias_name,omitempty" xml:"merchant_alias_name,omitempty" require:"true"`
	// 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
	Mcc *string `json:"mcc,omitempty" xml:"mcc,omitempty" require:"true"`
	// 法人姓名，merchant_type = 01时必填
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
	// 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
	LegalCertType *string `json:"legal_cert_type,omitempty" xml:"legal_cert_type,omitempty"`
	// 商户法人身份证号码, merchant_type = 01时必填
	LegalCertNo *string `json:"legal_cert_no,omitempty" xml:"legal_cert_no,omitempty"`
	// 商户经营地址
	BusinessAddress *AddressInfo `json:"business_address,omitempty" xml:"business_address,omitempty" require:"true"`
	// 商户联系人信息
	ContactInfos []*ContactInfo `json:"contact_infos,omitempty" xml:"contact_infos,omitempty" require:"true" type:"Repeated"`
	// 商户使用服务 当面付、app支付、wap支付、电脑支付
	Service []*string `json:"service,omitempty" xml:"service,omitempty" require:"true" type:"Repeated"`
	// 默认结算规则
	DefaultSettleRule *SettleRule `json:"default_settle_rule,omitempty" xml:"default_settle_rule,omitempty" require:"true"`
	// 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
	BizCards *CardInfo `json:"biz_cards,omitempty" xml:"biz_cards,omitempty"`
	// 请求单据号，32位。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 商户证件图片，如果是特殊行业必填
	CertImage *string `json:"cert_image,omitempty" xml:"cert_image,omitempty"`
	// 法人身份证正面图片 ，如果是特殊行业必填
	LegalCertFrontImage *string `json:"legal_cert_front_image,omitempty" xml:"legal_cert_front_image,omitempty"`
	// 法人身份证反面图片，如果是特殊行业必填
	LegalCertBackImage *string `json:"legal_cert_back_image,omitempty" xml:"legal_cert_back_image,omitempty"`
	// 商户行业资质, 如果是特殊行业必填
	Qualifications []*QualificationInfo `json:"qualifications,omitempty" xml:"qualifications,omitempty" type:"Repeated"`
	// 授权函图片。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填
	LicenseAuthLetterImage *string `json:"license_auth_letter_image,omitempty" xml:"license_auth_letter_image,omitempty"`
}

func (s CreateMerchantSellerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantSellerRequest) GoString() string {
	return s.String()
}

func (s *CreateMerchantSellerRequest) SetAuthToken(v string) *CreateMerchantSellerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetSource(v string) *CreateMerchantSellerRequest {
	s.Source = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetMerchantUserId(v string) *CreateMerchantSellerRequest {
	s.MerchantUserId = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetMerchantLoginName(v string) *CreateMerchantSellerRequest {
	s.MerchantLoginName = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetMerchantAliasName(v string) *CreateMerchantSellerRequest {
	s.MerchantAliasName = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetMcc(v string) *CreateMerchantSellerRequest {
	s.Mcc = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetLegalName(v string) *CreateMerchantSellerRequest {
	s.LegalName = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetLegalCertType(v string) *CreateMerchantSellerRequest {
	s.LegalCertType = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetLegalCertNo(v string) *CreateMerchantSellerRequest {
	s.LegalCertNo = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetBusinessAddress(v *AddressInfo) *CreateMerchantSellerRequest {
	s.BusinessAddress = v
	return s
}

func (s *CreateMerchantSellerRequest) SetContactInfos(v []*ContactInfo) *CreateMerchantSellerRequest {
	s.ContactInfos = v
	return s
}

func (s *CreateMerchantSellerRequest) SetService(v []*string) *CreateMerchantSellerRequest {
	s.Service = v
	return s
}

func (s *CreateMerchantSellerRequest) SetDefaultSettleRule(v *SettleRule) *CreateMerchantSellerRequest {
	s.DefaultSettleRule = v
	return s
}

func (s *CreateMerchantSellerRequest) SetBizCards(v *CardInfo) *CreateMerchantSellerRequest {
	s.BizCards = v
	return s
}

func (s *CreateMerchantSellerRequest) SetRequestId(v string) *CreateMerchantSellerRequest {
	s.RequestId = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetCertImage(v string) *CreateMerchantSellerRequest {
	s.CertImage = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetLegalCertFrontImage(v string) *CreateMerchantSellerRequest {
	s.LegalCertFrontImage = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetLegalCertBackImage(v string) *CreateMerchantSellerRequest {
	s.LegalCertBackImage = &v
	return s
}

func (s *CreateMerchantSellerRequest) SetQualifications(v []*QualificationInfo) *CreateMerchantSellerRequest {
	s.Qualifications = v
	return s
}

func (s *CreateMerchantSellerRequest) SetLicenseAuthLetterImage(v string) *CreateMerchantSellerRequest {
	s.LicenseAuthLetterImage = &v
	return s
}

type CreateMerchantSellerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 商户user_id
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
}

func (s CreateMerchantSellerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMerchantSellerResponse) GoString() string {
	return s.String()
}

func (s *CreateMerchantSellerResponse) SetReqMsgId(v string) *CreateMerchantSellerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMerchantSellerResponse) SetResultCode(v string) *CreateMerchantSellerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMerchantSellerResponse) SetResultMsg(v string) *CreateMerchantSellerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMerchantSellerResponse) SetOrderId(v string) *CreateMerchantSellerResponse {
	s.OrderId = &v
	return s
}

func (s *CreateMerchantSellerResponse) SetMerchantUserId(v string) *CreateMerchantSellerResponse {
	s.MerchantUserId = &v
	return s
}

type QueryMerchantSignRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// source, 由中台为业务方分配, 标识业务来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 申请单id, 跟merchant_user_id不能同时为空
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
}

func (s QueryMerchantSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantSignRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantSignRequest) SetAuthToken(v string) *QueryMerchantSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantSignRequest) SetSource(v string) *QueryMerchantSignRequest {
	s.Source = &v
	return s
}

func (s *QueryMerchantSignRequest) SetOrderId(v string) *QueryMerchantSignRequest {
	s.OrderId = &v
	return s
}

func (s *QueryMerchantSignRequest) SetMerchantUserId(v string) *QueryMerchantSignRequest {
	s.MerchantUserId = &v
	return s
}

type QueryMerchantSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 进件申请单信息
	OrderInfo *MerchantOrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty"`
}

func (s QueryMerchantSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantSignResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantSignResponse) SetReqMsgId(v string) *QueryMerchantSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantSignResponse) SetResultCode(v string) *QueryMerchantSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantSignResponse) SetResultMsg(v string) *QueryMerchantSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantSignResponse) SetOrderInfo(v *MerchantOrderInfo) *QueryMerchantSignResponse {
	s.OrderInfo = v
	return s
}

type UploadMerchantImageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// source, 由中台为业务方分配, 作为业务来源标识
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadMerchantImageRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantImageRequest) GoString() string {
	return s.String()
}

func (s *UploadMerchantImageRequest) SetAuthToken(v string) *UploadMerchantImageRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadMerchantImageRequest) SetSource(v string) *UploadMerchantImageRequest {
	s.Source = &v
	return s
}

func (s *UploadMerchantImageRequest) SetFileObject(v io.Reader) *UploadMerchantImageRequest {
	s.FileObject = v
	return s
}

func (s *UploadMerchantImageRequest) SetFileObjectName(v string) *UploadMerchantImageRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadMerchantImageRequest) SetFileId(v string) *UploadMerchantImageRequest {
	s.FileId = &v
	return s
}

type UploadMerchantImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片id
	ImageId *string `json:"image_id,omitempty" xml:"image_id,omitempty"`
}

func (s UploadMerchantImageResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadMerchantImageResponse) GoString() string {
	return s.String()
}

func (s *UploadMerchantImageResponse) SetReqMsgId(v string) *UploadMerchantImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadMerchantImageResponse) SetResultCode(v string) *UploadMerchantImageResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadMerchantImageResponse) SetResultMsg(v string) *UploadMerchantImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadMerchantImageResponse) SetImageId(v string) *UploadMerchantImageResponse {
	s.ImageId = &v
	return s
}

type SignMerchantAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 签约请求单据号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 来源场景码, 由中台为业务方分配
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 商家pid
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 个人签约产品码，商户代扣场景固定GENERAL_WITHHOLDING_P
	PersonalProductCode *string `json:"personal_product_code,omitempty" xml:"personal_product_code,omitempty" require:"true"`
}

func (s SignMerchantAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s SignMerchantAgreementRequest) GoString() string {
	return s.String()
}

func (s *SignMerchantAgreementRequest) SetAuthToken(v string) *SignMerchantAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *SignMerchantAgreementRequest) SetRequestId(v string) *SignMerchantAgreementRequest {
	s.RequestId = &v
	return s
}

func (s *SignMerchantAgreementRequest) SetSource(v string) *SignMerchantAgreementRequest {
	s.Source = &v
	return s
}

func (s *SignMerchantAgreementRequest) SetChannel(v string) *SignMerchantAgreementRequest {
	s.Channel = &v
	return s
}

func (s *SignMerchantAgreementRequest) SetMerchantUserId(v string) *SignMerchantAgreementRequest {
	s.MerchantUserId = &v
	return s
}

func (s *SignMerchantAgreementRequest) SetPersonalProductCode(v string) *SignMerchantAgreementRequest {
	s.PersonalProductCode = &v
	return s
}

type SignMerchantAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s SignMerchantAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s SignMerchantAgreementResponse) GoString() string {
	return s.String()
}

func (s *SignMerchantAgreementResponse) SetReqMsgId(v string) *SignMerchantAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignMerchantAgreementResponse) SetResultCode(v string) *SignMerchantAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *SignMerchantAgreementResponse) SetResultMsg(v string) *SignMerchantAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *SignMerchantAgreementResponse) SetSignStr(v string) *SignMerchantAgreementResponse {
	s.SignStr = &v
	return s
}

type GetMerchantInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// source, 由中台为业务方分配, 标识业务来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 行业商户支付宝uid，跟merchant_tenant_name不能同时为空
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
	// 行业商户租户名称， 跟merchant_user_id不能同时为空
	MerchantTenantName *string `json:"merchant_tenant_name,omitempty" xml:"merchant_tenant_name,omitempty"`
}

func (s GetMerchantInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMerchantInfoRequest) GoString() string {
	return s.String()
}

func (s *GetMerchantInfoRequest) SetAuthToken(v string) *GetMerchantInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMerchantInfoRequest) SetSource(v string) *GetMerchantInfoRequest {
	s.Source = &v
	return s
}

func (s *GetMerchantInfoRequest) SetMerchantUserId(v string) *GetMerchantInfoRequest {
	s.MerchantUserId = &v
	return s
}

func (s *GetMerchantInfoRequest) SetMerchantTenantName(v string) *GetMerchantInfoRequest {
	s.MerchantTenantName = &v
	return s
}

type GetMerchantInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// source, 由中台为业务方分配, 标识业务来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 商户支付宝uid
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
	// 行业商户租户名称
	MerchantTenantName *string `json:"merchant_tenant_name,omitempty" xml:"merchant_tenant_name,omitempty"`
	// 二级商户id, smid, 进件成功才有
	Smid *string `json:"smid,omitempty" xml:"smid,omitempty"`
}

func (s GetMerchantInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMerchantInfoResponse) GoString() string {
	return s.String()
}

func (s *GetMerchantInfoResponse) SetReqMsgId(v string) *GetMerchantInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMerchantInfoResponse) SetResultCode(v string) *GetMerchantInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMerchantInfoResponse) SetResultMsg(v string) *GetMerchantInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMerchantInfoResponse) SetSource(v string) *GetMerchantInfoResponse {
	s.Source = &v
	return s
}

func (s *GetMerchantInfoResponse) SetMerchantUserId(v string) *GetMerchantInfoResponse {
	s.MerchantUserId = &v
	return s
}

func (s *GetMerchantInfoResponse) SetMerchantTenantName(v string) *GetMerchantInfoResponse {
	s.MerchantTenantName = &v
	return s
}

func (s *GetMerchantInfoResponse) SetSmid(v string) *GetMerchantInfoResponse {
	s.Smid = &v
	return s
}

type QueryMerchantAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 签约时的请求单据号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务来源场景码，由中台分配给业务方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道场景码, 由中台分配给业务方
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
}

func (s QueryMerchantAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantAgreementRequest) GoString() string {
	return s.String()
}

func (s *QueryMerchantAgreementRequest) SetAuthToken(v string) *QueryMerchantAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMerchantAgreementRequest) SetRequestId(v string) *QueryMerchantAgreementRequest {
	s.RequestId = &v
	return s
}

func (s *QueryMerchantAgreementRequest) SetSource(v string) *QueryMerchantAgreementRequest {
	s.Source = &v
	return s
}

func (s *QueryMerchantAgreementRequest) SetChannel(v string) *QueryMerchantAgreementRequest {
	s.Channel = &v
	return s
}

type QueryMerchantAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议产品code
	PersonalProductCode *string `json:"personal_product_code,omitempty" xml:"personal_product_code,omitempty"`
	// 签约主体
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty"`
	// 签约客户支付宝uid
	CustomerAlipayUserId *string `json:"customer_alipay_user_id,omitempty" xml:"customer_alipay_user_id,omitempty"`
	// 商户签约协议号
	MerchantAgreementNo *string `json:"merchant_agreement_no,omitempty" xml:"merchant_agreement_no,omitempty"`
	// 签约协议号，仅签约成功后有
	AgreementNo *string `json:"agreement_no,omitempty" xml:"agreement_no,omitempty"`
	// 实际签约时间，仅签约成功后有
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实际生效时间，仅签约成功后有
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实际失效时间，仅签约成功后有
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议状态
	// TEMP-暂存
	// NORMAL-正常
	// STOP-暂停
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryMerchantAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMerchantAgreementResponse) GoString() string {
	return s.String()
}

func (s *QueryMerchantAgreementResponse) SetReqMsgId(v string) *QueryMerchantAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetResultCode(v string) *QueryMerchantAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetResultMsg(v string) *QueryMerchantAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetPersonalProductCode(v string) *QueryMerchantAgreementResponse {
	s.PersonalProductCode = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetMerchantUserId(v string) *QueryMerchantAgreementResponse {
	s.MerchantUserId = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetCustomerAlipayUserId(v string) *QueryMerchantAgreementResponse {
	s.CustomerAlipayUserId = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetMerchantAgreementNo(v string) *QueryMerchantAgreementResponse {
	s.MerchantAgreementNo = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetAgreementNo(v string) *QueryMerchantAgreementResponse {
	s.AgreementNo = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetSignTime(v string) *QueryMerchantAgreementResponse {
	s.SignTime = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetValidTime(v string) *QueryMerchantAgreementResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetInvalidTime(v string) *QueryMerchantAgreementResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryMerchantAgreementResponse) SetStatus(v string) *QueryMerchantAgreementResponse {
	s.Status = &v
	return s
}

type PushServiceMeterdataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务唯一单据号，最大64
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true" maxLength:"64"`
	// 来源场景码, 由中台分配给业务方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true" maxLength:"32"`
	// 行业渠道码(由经支中台分配给业务方)
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true" maxLength:"32"`
	// 业务发生时间
	GmtService *string `json:"gmt_service,omitempty" xml:"gmt_service,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 服务唯一标识码
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true" maxLength:"32"`
	// 如果是金额，请填写分；如果是次数，请填写整数
	ServiceAmount *string `json:"service_amount,omitempty" xml:"service_amount,omitempty" require:"true" maxLength:"32"`
	// 服务量单位，如果是金额，请填写币种value(exp:156),如果是次数/个,填写UU
	ServiceUnit *string `json:"service_unit,omitempty" xml:"service_unit,omitempty" require:"true" maxLength:"16"`
	// 业务标题
	ServiceSubject *string `json:"service_subject,omitempty" xml:"service_subject,omitempty" require:"true" maxLength:"128"`
	// 业务详细内容
	ServiceBody *string `json:"service_body,omitempty" xml:"service_body,omitempty" maxLength:"512"`
	// 会员id;如果是商户，那么是商户uid,如果是用户，那么是会员id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true" maxLength:"32"`
	// 基本与user_id保持一致
	BuyerId *string `json:"buyer_id,omitempty" xml:"buyer_id,omitempty" require:"true" maxLength:"32"`
	// 卖家id,用于代收付场景
	SellerId *string `json:"seller_id,omitempty" xml:"seller_id,omitempty" maxLength:"32"`
	// 扩展属性字段
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty" require:"true" maxLength:"512"`
}

func (s PushServiceMeterdataRequest) String() string {
	return tea.Prettify(s)
}

func (s PushServiceMeterdataRequest) GoString() string {
	return s.String()
}

func (s *PushServiceMeterdataRequest) SetAuthToken(v string) *PushServiceMeterdataRequest {
	s.AuthToken = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetBizNo(v string) *PushServiceMeterdataRequest {
	s.BizNo = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetSource(v string) *PushServiceMeterdataRequest {
	s.Source = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetChannel(v string) *PushServiceMeterdataRequest {
	s.Channel = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetGmtService(v string) *PushServiceMeterdataRequest {
	s.GmtService = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetServiceCode(v string) *PushServiceMeterdataRequest {
	s.ServiceCode = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetServiceAmount(v string) *PushServiceMeterdataRequest {
	s.ServiceAmount = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetServiceUnit(v string) *PushServiceMeterdataRequest {
	s.ServiceUnit = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetServiceSubject(v string) *PushServiceMeterdataRequest {
	s.ServiceSubject = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetServiceBody(v string) *PushServiceMeterdataRequest {
	s.ServiceBody = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetUserId(v string) *PushServiceMeterdataRequest {
	s.UserId = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetBuyerId(v string) *PushServiceMeterdataRequest {
	s.BuyerId = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetSellerId(v string) *PushServiceMeterdataRequest {
	s.SellerId = &v
	return s
}

func (s *PushServiceMeterdataRequest) SetProperties(v string) *PushServiceMeterdataRequest {
	s.Properties = &v
	return s
}

type PushServiceMeterdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushServiceMeterdataResponse) String() string {
	return tea.Prettify(s)
}

func (s PushServiceMeterdataResponse) GoString() string {
	return s.String()
}

func (s *PushServiceMeterdataResponse) SetReqMsgId(v string) *PushServiceMeterdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushServiceMeterdataResponse) SetResultCode(v string) *PushServiceMeterdataResponse {
	s.ResultCode = &v
	return s
}

func (s *PushServiceMeterdataResponse) SetResultMsg(v string) *PushServiceMeterdataResponse {
	s.ResultMsg = &v
	return s
}

type PayTradePageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 来源场景码,IP版权默认传IP_COPYRIGHT
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道 自营平台、第三方平台等
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 支付成功后returl地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
	// 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 支付渠道产品码；
	// 目前只支持直付通，code= ZFT;
	PayProductCode *string `json:"pay_product_code,omitempty" xml:"pay_product_code,omitempty" require:"true"`
	// 默认：人民币（156）
	TransCurrency *string `json:"trans_currency,omitempty" xml:"trans_currency,omitempty"`
	// 平台方下的用户id (即商家id)
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 订单描述。不超过128长度
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// 扩展字段
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s PayTradePageRequest) String() string {
	return tea.Prettify(s)
}

func (s PayTradePageRequest) GoString() string {
	return s.String()
}

func (s *PayTradePageRequest) SetAuthToken(v string) *PayTradePageRequest {
	s.AuthToken = &v
	return s
}

func (s *PayTradePageRequest) SetSource(v string) *PayTradePageRequest {
	s.Source = &v
	return s
}

func (s *PayTradePageRequest) SetChannel(v string) *PayTradePageRequest {
	s.Channel = &v
	return s
}

func (s *PayTradePageRequest) SetReturnUrl(v string) *PayTradePageRequest {
	s.ReturnUrl = &v
	return s
}

func (s *PayTradePageRequest) SetMerchantOrderNo(v string) *PayTradePageRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *PayTradePageRequest) SetTotalAmount(v string) *PayTradePageRequest {
	s.TotalAmount = &v
	return s
}

func (s *PayTradePageRequest) SetSubject(v string) *PayTradePageRequest {
	s.Subject = &v
	return s
}

func (s *PayTradePageRequest) SetPayProductCode(v string) *PayTradePageRequest {
	s.PayProductCode = &v
	return s
}

func (s *PayTradePageRequest) SetTransCurrency(v string) *PayTradePageRequest {
	s.TransCurrency = &v
	return s
}

func (s *PayTradePageRequest) SetMerchantUserId(v string) *PayTradePageRequest {
	s.MerchantUserId = &v
	return s
}

func (s *PayTradePageRequest) SetBody(v string) *PayTradePageRequest {
	s.Body = &v
	return s
}

func (s *PayTradePageRequest) SetProperties(v string) *PayTradePageRequest {
	s.Properties = &v
	return s
}

type PayTradePageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收银台页面String
	Form *string `json:"form,omitempty" xml:"form,omitempty"`
}

func (s PayTradePageResponse) String() string {
	return tea.Prettify(s)
}

func (s PayTradePageResponse) GoString() string {
	return s.String()
}

func (s *PayTradePageResponse) SetReqMsgId(v string) *PayTradePageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayTradePageResponse) SetResultCode(v string) *PayTradePageResponse {
	s.ResultCode = &v
	return s
}

func (s *PayTradePageResponse) SetResultMsg(v string) *PayTradePageResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayTradePageResponse) SetForm(v string) *PayTradePageResponse {
	s.Form = &v
	return s
}

type QueryTradeOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 中台颁发的场景码，IP_COPYRIGHT
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 外部商户订单号，不超32位
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
}

func (s QueryTradeOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryTradeOrderRequest) SetAuthToken(v string) *QueryTradeOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradeOrderRequest) SetSource(v string) *QueryTradeOrderRequest {
	s.Source = &v
	return s
}

func (s *QueryTradeOrderRequest) SetMerchantOrderNo(v string) *QueryTradeOrderRequest {
	s.MerchantOrderNo = &v
	return s
}

type QueryTradeOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝交易号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty"`
	// 交易金额，"10.11"
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 商户订单号out_trade_no
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
}

func (s QueryTradeOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryTradeOrderResponse) SetReqMsgId(v string) *QueryTradeOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradeOrderResponse) SetResultCode(v string) *QueryTradeOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradeOrderResponse) SetResultMsg(v string) *QueryTradeOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradeOrderResponse) SetTradeNo(v string) *QueryTradeOrderResponse {
	s.TradeNo = &v
	return s
}

func (s *QueryTradeOrderResponse) SetTradeStatus(v string) *QueryTradeOrderResponse {
	s.TradeStatus = &v
	return s
}

func (s *QueryTradeOrderResponse) SetTotalAmount(v string) *QueryTradeOrderResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryTradeOrderResponse) SetOutTradeNo(v string) *QueryTradeOrderResponse {
	s.OutTradeNo = &v
	return s
}

type CreateTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 来源场景码, 由中台分配给业务方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道 自营平台、第三方平台等
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 支付成功后returl地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 支付渠道产品码； 目前只支持直付通，code= ZFT;
	PayProductCode *string `json:"pay_product_code,omitempty" xml:"pay_product_code,omitempty"`
	// 交易币种，默认：人民币（156）
	TransCurrency *string `json:"trans_currency,omitempty" xml:"trans_currency,omitempty"`
	// 平台方下的商家id
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 买家的支付宝唯一用户号（2088开头的16位纯数字）。
	// 小程序支付场景必填。
	BuyerId *string `json:"buyer_id,omitempty" xml:"buyer_id,omitempty"`
	// 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
}

func (s CreateTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTradeRequest) GoString() string {
	return s.String()
}

func (s *CreateTradeRequest) SetAuthToken(v string) *CreateTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTradeRequest) SetSource(v string) *CreateTradeRequest {
	s.Source = &v
	return s
}

func (s *CreateTradeRequest) SetChannel(v string) *CreateTradeRequest {
	s.Channel = &v
	return s
}

func (s *CreateTradeRequest) SetReturnUrl(v string) *CreateTradeRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateTradeRequest) SetMerchantOrderNo(v string) *CreateTradeRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *CreateTradeRequest) SetTotalAmount(v string) *CreateTradeRequest {
	s.TotalAmount = &v
	return s
}

func (s *CreateTradeRequest) SetSubject(v string) *CreateTradeRequest {
	s.Subject = &v
	return s
}

func (s *CreateTradeRequest) SetPayProductCode(v string) *CreateTradeRequest {
	s.PayProductCode = &v
	return s
}

func (s *CreateTradeRequest) SetTransCurrency(v string) *CreateTradeRequest {
	s.TransCurrency = &v
	return s
}

func (s *CreateTradeRequest) SetMerchantUserId(v string) *CreateTradeRequest {
	s.MerchantUserId = &v
	return s
}

func (s *CreateTradeRequest) SetBuyerId(v string) *CreateTradeRequest {
	s.BuyerId = &v
	return s
}

func (s *CreateTradeRequest) SetBody(v string) *CreateTradeRequest {
	s.Body = &v
	return s
}

type CreateTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝交易号，64位以内
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
}

func (s CreateTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTradeResponse) GoString() string {
	return s.String()
}

func (s *CreateTradeResponse) SetReqMsgId(v string) *CreateTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTradeResponse) SetResultCode(v string) *CreateTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTradeResponse) SetResultMsg(v string) *CreateTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTradeResponse) SetTradeNo(v string) *CreateTradeResponse {
	s.TradeNo = &v
	return s
}

func (s *CreateTradeResponse) SetMerchantOrderNo(v string) *CreateTradeResponse {
	s.MerchantOrderNo = &v
	return s
}

type PayTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 来源场景码, 由中台分配给业务方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 交易币种，默认：人民币（156）
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty"`
	// 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
	// 交易信息
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// 收款方id
	PayeeId *string `json:"payee_id,omitempty" xml:"payee_id,omitempty" require:"true"`
	// 付款方id
	PayerId *string `json:"payer_id,omitempty" xml:"payer_id,omitempty" require:"true"`
	// ZFT
	PayProductCode *string `json:"pay_product_code,omitempty" xml:"pay_product_code,omitempty" require:"true"`
	// 交易创建时间
	GmtTradeCreate *string `json:"gmt_trade_create,omitempty" xml:"gmt_trade_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易支付时间
	GmtTradePay *string `json:"gmt_trade_pay,omitempty" xml:"gmt_trade_pay,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易完成时间
	GmtTradeComplete *string `json:"gmt_trade_complete,omitempty" xml:"gmt_trade_complete,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易状态
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty"`
	// 扩展字段，json串
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s PayTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s PayTradeRequest) GoString() string {
	return s.String()
}

func (s *PayTradeRequest) SetAuthToken(v string) *PayTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *PayTradeRequest) SetMerchantOrderNo(v string) *PayTradeRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *PayTradeRequest) SetSource(v string) *PayTradeRequest {
	s.Source = &v
	return s
}

func (s *PayTradeRequest) SetChannel(v string) *PayTradeRequest {
	s.Channel = &v
	return s
}

func (s *PayTradeRequest) SetTotalAmount(v string) *PayTradeRequest {
	s.TotalAmount = &v
	return s
}

func (s *PayTradeRequest) SetCurrencyValue(v string) *PayTradeRequest {
	s.CurrencyValue = &v
	return s
}

func (s *PayTradeRequest) SetSubject(v string) *PayTradeRequest {
	s.Subject = &v
	return s
}

func (s *PayTradeRequest) SetBody(v string) *PayTradeRequest {
	s.Body = &v
	return s
}

func (s *PayTradeRequest) SetPayeeId(v string) *PayTradeRequest {
	s.PayeeId = &v
	return s
}

func (s *PayTradeRequest) SetPayerId(v string) *PayTradeRequest {
	s.PayerId = &v
	return s
}

func (s *PayTradeRequest) SetPayProductCode(v string) *PayTradeRequest {
	s.PayProductCode = &v
	return s
}

func (s *PayTradeRequest) SetGmtTradeCreate(v string) *PayTradeRequest {
	s.GmtTradeCreate = &v
	return s
}

func (s *PayTradeRequest) SetGmtTradePay(v string) *PayTradeRequest {
	s.GmtTradePay = &v
	return s
}

func (s *PayTradeRequest) SetGmtTradeComplete(v string) *PayTradeRequest {
	s.GmtTradeComplete = &v
	return s
}

func (s *PayTradeRequest) SetTradeStatus(v string) *PayTradeRequest {
	s.TradeStatus = &v
	return s
}

func (s *PayTradeRequest) SetProperties(v string) *PayTradeRequest {
	s.Properties = &v
	return s
}

type PayTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易号，64位以内
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s PayTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s PayTradeResponse) GoString() string {
	return s.String()
}

func (s *PayTradeResponse) SetReqMsgId(v string) *PayTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayTradeResponse) SetResultCode(v string) *PayTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *PayTradeResponse) SetResultMsg(v string) *PayTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayTradeResponse) SetTradeNo(v string) *PayTradeResponse {
	s.TradeNo = &v
	return s
}

type SyncTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商户订单号
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 行业场景码(由经支中台分配给业务方)
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 行业渠道码(由经支中台分配给业务方)
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 交易金额, 最小到分, 支持0元
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 币种，默认156-人民币
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty"`
	// 交易标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
	// 交易详情(例如商品、价格快照、数量等)
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// 支付渠道, 当前仅支持ZFT-直付通
	PayProductCode *string `json:"pay_product_code,omitempty" xml:"pay_product_code,omitempty" require:"true"`
	// 交易收款方支付宝uid
	PayeeId *string `json:"payee_id,omitempty" xml:"payee_id,omitempty" require:"true"`
	// 交易付款方支付宝uid
	PayerId *string `json:"payer_id,omitempty" xml:"payer_id,omitempty" require:"true"`
	// 交易创建时间
	GmtTradeCreate *string `json:"gmt_trade_create,omitempty" xml:"gmt_trade_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易支付时间
	GmtTradePay *string `json:"gmt_trade_pay,omitempty" xml:"gmt_trade_pay,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易完成时间
	GmtTradeComplete *string `json:"gmt_trade_complete,omitempty" xml:"gmt_trade_complete,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易状态
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true"`
	// 扩展字段，json串
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty" require:"true"`
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

func (s *SyncTradeRequest) SetMerchantOrderNo(v string) *SyncTradeRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *SyncTradeRequest) SetSource(v string) *SyncTradeRequest {
	s.Source = &v
	return s
}

func (s *SyncTradeRequest) SetChannel(v string) *SyncTradeRequest {
	s.Channel = &v
	return s
}

func (s *SyncTradeRequest) SetTotalAmount(v string) *SyncTradeRequest {
	s.TotalAmount = &v
	return s
}

func (s *SyncTradeRequest) SetCurrencyValue(v string) *SyncTradeRequest {
	s.CurrencyValue = &v
	return s
}

func (s *SyncTradeRequest) SetSubject(v string) *SyncTradeRequest {
	s.Subject = &v
	return s
}

func (s *SyncTradeRequest) SetBody(v string) *SyncTradeRequest {
	s.Body = &v
	return s
}

func (s *SyncTradeRequest) SetPayProductCode(v string) *SyncTradeRequest {
	s.PayProductCode = &v
	return s
}

func (s *SyncTradeRequest) SetPayeeId(v string) *SyncTradeRequest {
	s.PayeeId = &v
	return s
}

func (s *SyncTradeRequest) SetPayerId(v string) *SyncTradeRequest {
	s.PayerId = &v
	return s
}

func (s *SyncTradeRequest) SetGmtTradeCreate(v string) *SyncTradeRequest {
	s.GmtTradeCreate = &v
	return s
}

func (s *SyncTradeRequest) SetGmtTradePay(v string) *SyncTradeRequest {
	s.GmtTradePay = &v
	return s
}

func (s *SyncTradeRequest) SetGmtTradeComplete(v string) *SyncTradeRequest {
	s.GmtTradeComplete = &v
	return s
}

func (s *SyncTradeRequest) SetTradeStatus(v string) *SyncTradeRequest {
	s.TradeStatus = &v
	return s
}

func (s *SyncTradeRequest) SetProperties(v string) *SyncTradeRequest {
	s.Properties = &v
	return s
}

type SyncTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type QueryTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商户订单号
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 来源场景码，由中台分配给业务方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 渠道场景码，由中台分配给业务方
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
}

func (s QueryTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeRequest) GoString() string {
	return s.String()
}

func (s *QueryTradeRequest) SetAuthToken(v string) *QueryTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradeRequest) SetMerchantOrderNo(v string) *QueryTradeRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *QueryTradeRequest) SetSource(v string) *QueryTradeRequest {
	s.Source = &v
	return s
}

func (s *QueryTradeRequest) SetChannel(v string) *QueryTradeRequest {
	s.Channel = &v
	return s
}

type QueryTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户订单号
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty"`
	// 来源场景码
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 渠道场景码
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 交易状态
	// WAIT_BUYER_PAY - 交易创建，等待买家付款
	// TRADE_CLOSED - 未付款交易超时关闭，或支付完成后全额退款
	// TRADE_SUCCESS - 交易成功
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty"`
	// 币种，默认156-人民币
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty"`
	// 交易结算信息
	TradeSettleInfo []*TradeSettleDetail `json:"trade_settle_info,omitempty" xml:"trade_settle_info,omitempty" type:"Repeated"`
}

func (s QueryTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeResponse) GoString() string {
	return s.String()
}

func (s *QueryTradeResponse) SetReqMsgId(v string) *QueryTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradeResponse) SetResultCode(v string) *QueryTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradeResponse) SetResultMsg(v string) *QueryTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradeResponse) SetMerchantOrderNo(v string) *QueryTradeResponse {
	s.MerchantOrderNo = &v
	return s
}

func (s *QueryTradeResponse) SetSource(v string) *QueryTradeResponse {
	s.Source = &v
	return s
}

func (s *QueryTradeResponse) SetChannel(v string) *QueryTradeResponse {
	s.Channel = &v
	return s
}

func (s *QueryTradeResponse) SetTradeStatus(v string) *QueryTradeResponse {
	s.TradeStatus = &v
	return s
}

func (s *QueryTradeResponse) SetCurrencyValue(v string) *QueryTradeResponse {
	s.CurrencyValue = &v
	return s
}

func (s *QueryTradeResponse) SetTradeSettleInfo(v []*TradeSettleDetail) *QueryTradeResponse {
	s.TradeSettleInfo = v
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
				"sdk_version":      tea.String("1.3.2"),
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
 * Description: 商业卖家商户注册
 * Summary: 行业卖家商户注册
 */
func (client *Client) CreateMerchantSeller(request *CreateMerchantSellerRequest) (_result *CreateMerchantSellerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMerchantSellerResponse{}
	_body, _err := client.CreateMerchantSellerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商业卖家商户注册
 * Summary: 行业卖家商户注册
 */
func (client *Client) CreateMerchantSellerEx(request *CreateMerchantSellerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMerchantSellerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMerchantSellerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.seller.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 行业卖家商户注册结果查询服务
 * Summary: 行业卖家商户注册结果查询服务
 */
func (client *Client) QueryMerchantSign(request *QueryMerchantSignRequest) (_result *QueryMerchantSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantSignResponse{}
	_body, _err := client.QueryMerchantSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 行业卖家商户注册结果查询服务
 * Summary: 行业卖家商户注册结果查询服务
 */
func (client *Client) QueryMerchantSignEx(request *QueryMerchantSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 行业商家图片上传
 * Summary: 行业商家图片上传
 */
func (client *Client) UploadMerchantImage(request *UploadMerchantImageRequest) (_result *UploadMerchantImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadMerchantImageResponse{}
	_body, _err := client.UploadMerchantImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 行业商家图片上传
 * Summary: 行业商家图片上传
 */
func (client *Client) UploadMerchantImageEx(request *UploadMerchantImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadMerchantImageResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antcloud.industry.merchant.image.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadMerchantImageResponse := &UploadMerchantImageResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadMerchantImageResponse
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
	_result = &UploadMerchantImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.image.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝个人协议页面签约接口
 * Summary: 支付宝个人协议页面签约接口
 */
func (client *Client) SignMerchantAgreement(request *SignMerchantAgreementRequest) (_result *SignMerchantAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignMerchantAgreementResponse{}
	_body, _err := client.SignMerchantAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝个人协议页面签约接口
 * Summary: 支付宝个人协议页面签约接口
 */
func (client *Client) SignMerchantAgreementEx(request *SignMerchantAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignMerchantAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SignMerchantAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.agreement.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 行业卖家商户信息查询
 * Summary: 行业卖家商户信息查询
 */
func (client *Client) GetMerchantInfo(request *GetMerchantInfoRequest) (_result *GetMerchantInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMerchantInfoResponse{}
	_body, _err := client.GetMerchantInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 行业卖家商户信息查询
 * Summary: 行业卖家商户信息查询
 */
func (client *Client) GetMerchantInfoEx(request *GetMerchantInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMerchantInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMerchantInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.info.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 签约结果查询
 * Summary: 签约结果查询
 */
func (client *Client) QueryMerchantAgreement(request *QueryMerchantAgreementRequest) (_result *QueryMerchantAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMerchantAgreementResponse{}
	_body, _err := client.QueryMerchantAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 签约结果查询
 * Summary: 签约结果查询
 */
func (client *Client) QueryMerchantAgreementEx(request *QueryMerchantAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMerchantAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMerchantAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.merchant.agreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 行业平台侧业务单据推送,用于以业务方视角上报单据
 * Summary: 行业平台侧业务单据推送
 */
func (client *Client) PushServiceMeterdata(request *PushServiceMeterdataRequest) (_result *PushServiceMeterdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushServiceMeterdataResponse{}
	_body, _err := client.PushServiceMeterdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 行业平台侧业务单据推送,用于以业务方视角上报单据
 * Summary: 行业平台侧业务单据推送
 */
func (client *Client) PushServiceMeterdataEx(request *PushServiceMeterdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushServiceMeterdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushServiceMeterdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.service.meterdata.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 买家卖家收单交易，直接收款给卖家过渡户
 * Summary: 买家卖家收单交易-电脑版
 */
func (client *Client) PayTradePage(request *PayTradePageRequest) (_result *PayTradePageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayTradePageResponse{}
	_body, _err := client.PayTradePageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 买家卖家收单交易，直接收款给卖家过渡户
 * Summary: 买家卖家收单交易-电脑版
 */
func (client *Client) PayTradePageEx(request *PayTradePageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayTradePageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayTradePageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.page.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 交易支付结果查询接口
 * Summary: 交易结果查询
 */
func (client *Client) QueryTradeOrder(request *QueryTradeOrderRequest) (_result *QueryTradeOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradeOrderResponse{}
	_body, _err := client.QueryTradeOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 交易支付结果查询接口
 * Summary: 交易结果查询
 */
func (client *Client) QueryTradeOrderEx(request *QueryTradeOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradeOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradeOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 买家卖家收单
 * Summary: 统一收单创建
 */
func (client *Client) CreateTrade(request *CreateTradeRequest) (_result *CreateTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTradeResponse{}
	_body, _err := client.CreateTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 买家卖家收单
 * Summary: 统一收单创建
 */
func (client *Client) CreateTradeEx(request *CreateTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 统一收单-支付
 * Summary: 统一收单-支付
 */
func (client *Client) PayTrade(request *PayTradeRequest) (_result *PayTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayTradeResponse{}
	_body, _err := client.PayTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 统一收单-支付
 * Summary: 统一收单-支付
 */
func (client *Client) PayTradeEx(request *PayTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 统一收单-同步
 * Summary: 统一收单-同步
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
 * Description: 统一收单-同步
 * Summary: 统一收单-同步
 */
func (client *Client) SyncTradeEx(request *SyncTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 统一收单-查询
 * Summary: 统一收单-查询
 */
func (client *Client) QueryTrade(request *QueryTradeRequest) (_result *QueryTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradeResponse{}
	_body, _err := client.QueryTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 统一收单-查询
 * Summary: 统一收单-查询
 */
func (client *Client) QueryTradeEx(request *QueryTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.industry.trade.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
