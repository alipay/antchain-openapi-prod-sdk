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

// 二级商户进件申请单
type MerchantOrderInfo struct {
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 平台方的用户id, 保持唯一
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 申请状态 99-已完结;-1-失败;031-审核中
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
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

type CreateMerchantSellerRequest struct {
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
	Mcc *string `json:"mcc,omitempty" xml:"mcc,omitempty"`
	// 法人姓名，merchant_type = 01时必填
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty"`
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

type CreateMerchantSellerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
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

type QueryMerchantSignRequest struct {
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
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type PayTradePageRequest struct {
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

type PayTradePageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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
				"sdk_version":      tea.String("1.0.7"),
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
 * Description: 买家卖家收单交易，直接收款给卖家过渡户
 * Summary: 买家卖家收单交易
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
 * Summary: 买家卖家收单交易
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
