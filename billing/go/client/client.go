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

type GetAccountBalanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
	FromChannel *string `json:"from_channel,omitempty" xml:"from_channel,omitempty" require:"true"`
	// 租户id,外部用户唯一id，如蚂蚁通行证id
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s GetAccountBalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAccountBalanceRequest) GoString() string {
	return s.String()
}

func (s *GetAccountBalanceRequest) SetAuthToken(v string) *GetAccountBalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAccountBalanceRequest) SetFromChannel(v string) *GetAccountBalanceRequest {
	s.FromChannel = &v
	return s
}

func (s *GetAccountBalanceRequest) SetTenant(v string) *GetAccountBalanceRequest {
	s.Tenant = &v
	return s
}

type GetAccountBalanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户余额
	AccountBalance *string `json:"account_balance,omitempty" xml:"account_balance,omitempty"`
	// 可用余额
	AvailableBalance *string `json:"available_balance,omitempty" xml:"available_balance,omitempty"`
	// 币种
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty"`
}

func (s GetAccountBalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAccountBalanceResponse) GoString() string {
	return s.String()
}

func (s *GetAccountBalanceResponse) SetReqMsgId(v string) *GetAccountBalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAccountBalanceResponse) SetResultCode(v string) *GetAccountBalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAccountBalanceResponse) SetResultMsg(v string) *GetAccountBalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAccountBalanceResponse) SetAccountBalance(v string) *GetAccountBalanceResponse {
	s.AccountBalance = &v
	return s
}

func (s *GetAccountBalanceResponse) SetAvailableBalance(v string) *GetAccountBalanceResponse {
	s.AvailableBalance = &v
	return s
}

func (s *GetAccountBalanceResponse) SetCurrencyValue(v string) *GetAccountBalanceResponse {
	s.CurrencyValue = &v
	return s
}

type ChargeAccountBalanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// "10.11"代表10.11元,最小粒度到分，小数点后2位
	ChargeAmt *string `json:"charge_amt,omitempty" xml:"charge_amt,omitempty" require:"true"`
	// 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty" require:"true"`
	// 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
	FromChannel *string `json:"from_channel,omitempty" xml:"from_channel,omitempty" require:"true"`
	// 唤起收银台后，充值后回调url链接
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
}

func (s ChargeAccountBalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ChargeAccountBalanceRequest) GoString() string {
	return s.String()
}

func (s *ChargeAccountBalanceRequest) SetAuthToken(v string) *ChargeAccountBalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ChargeAccountBalanceRequest) SetChargeAmt(v string) *ChargeAccountBalanceRequest {
	s.ChargeAmt = &v
	return s
}

func (s *ChargeAccountBalanceRequest) SetCurrencyValue(v string) *ChargeAccountBalanceRequest {
	s.CurrencyValue = &v
	return s
}

func (s *ChargeAccountBalanceRequest) SetFromChannel(v string) *ChargeAccountBalanceRequest {
	s.FromChannel = &v
	return s
}

func (s *ChargeAccountBalanceRequest) SetReturnUrl(v string) *ChargeAccountBalanceRequest {
	s.ReturnUrl = &v
	return s
}

type ChargeAccountBalanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝网关
	AlipayGateway *string `json:"alipay_gateway,omitempty" xml:"alipay_gateway,omitempty"`
	// 字符编码格式   _input_charset
	InputCharset *string `json:"input_charset,omitempty" xml:"input_charset,omitempty"`
	// 服务器异步通知页面路径
	NotifyUrl *string `json:"notify_url,omitempty" xml:"notify_url,omitempty"`
	// 商户网站唯一订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty"`
	// 收款方PID
	Partner *string `json:"partner,omitempty" xml:"partner,omitempty"`
	// 支付类型
	PaymentType *string `json:"payment_type,omitempty" xml:"payment_type,omitempty"`
	// 收银台发起页面跳转同步通知页面路径
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 收款方ID
	SellerId *string `json:"seller_id,omitempty" xml:"seller_id,omitempty"`
	// 调用的接口名
	Service *string `json:"service,omitempty" xml:"service,omitempty"`
	// 签名
	Sign *string `json:"sign,omitempty" xml:"sign,omitempty"`
	// 签名类型
	SignType *string `json:"sign_type,omitempty" xml:"sign_type,omitempty"`
	// 商品名称
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
	// 交易金额
	TotalFee *string `json:"total_fee,omitempty" xml:"total_fee,omitempty"`
}

func (s ChargeAccountBalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ChargeAccountBalanceResponse) GoString() string {
	return s.String()
}

func (s *ChargeAccountBalanceResponse) SetReqMsgId(v string) *ChargeAccountBalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetResultCode(v string) *ChargeAccountBalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetResultMsg(v string) *ChargeAccountBalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetAlipayGateway(v string) *ChargeAccountBalanceResponse {
	s.AlipayGateway = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetInputCharset(v string) *ChargeAccountBalanceResponse {
	s.InputCharset = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetNotifyUrl(v string) *ChargeAccountBalanceResponse {
	s.NotifyUrl = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetOutTradeNo(v string) *ChargeAccountBalanceResponse {
	s.OutTradeNo = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetPartner(v string) *ChargeAccountBalanceResponse {
	s.Partner = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetPaymentType(v string) *ChargeAccountBalanceResponse {
	s.PaymentType = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetReturnUrl(v string) *ChargeAccountBalanceResponse {
	s.ReturnUrl = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetSellerId(v string) *ChargeAccountBalanceResponse {
	s.SellerId = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetService(v string) *ChargeAccountBalanceResponse {
	s.Service = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetSign(v string) *ChargeAccountBalanceResponse {
	s.Sign = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetSignType(v string) *ChargeAccountBalanceResponse {
	s.SignType = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetSubject(v string) *ChargeAccountBalanceResponse {
	s.Subject = &v
	return s
}

func (s *ChargeAccountBalanceResponse) SetTotalFee(v string) *ChargeAccountBalanceResponse {
	s.TotalFee = &v
	return s
}

type GetAccountUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// alipay托管子户ID
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
}

func (s GetAccountUserRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAccountUserRequest) GoString() string {
	return s.String()
}

func (s *GetAccountUserRequest) SetAuthToken(v string) *GetAccountUserRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAccountUserRequest) SetAlipayUserId(v string) *GetAccountUserRequest {
	s.AlipayUserId = &v
	return s
}

type GetAccountUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 智能科技user_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 用户的真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 手机号
	MobileNum *string `json:"mobile_num,omitempty" xml:"mobile_num,omitempty"`
	// 公司名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 帐号类型，企业或者是个人
	//  ENTERPRISE("1","企业类型账号"),
	//  INDIVIDUAL("2","个人类型账号")
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s GetAccountUserResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAccountUserResponse) GoString() string {
	return s.String()
}

func (s *GetAccountUserResponse) SetReqMsgId(v string) *GetAccountUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAccountUserResponse) SetResultCode(v string) *GetAccountUserResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAccountUserResponse) SetResultMsg(v string) *GetAccountUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAccountUserResponse) SetTenantId(v string) *GetAccountUserResponse {
	s.TenantId = &v
	return s
}

func (s *GetAccountUserResponse) SetLoginName(v string) *GetAccountUserResponse {
	s.LoginName = &v
	return s
}

func (s *GetAccountUserResponse) SetRealName(v string) *GetAccountUserResponse {
	s.RealName = &v
	return s
}

func (s *GetAccountUserResponse) SetMobileNum(v string) *GetAccountUserResponse {
	s.MobileNum = &v
	return s
}

func (s *GetAccountUserResponse) SetFirmName(v string) *GetAccountUserResponse {
	s.FirmName = &v
	return s
}

func (s *GetAccountUserResponse) SetUserType(v string) *GetAccountUserResponse {
	s.UserType = &v
	return s
}

type CreateAcfeewebInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 出账验证主键id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 计量域code
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true"`
	// 计量域名称
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty" require:"true"`
	// 计量域版本
	DomainVersion *string `json:"domain_version,omitempty" xml:"domain_version,omitempty" require:"true"`
	// 业务产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 渠道产品code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 渠道产品名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 商品code
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty" require:"true"`
	// 商品名称
	OfferName *string `json:"offer_name,omitempty" xml:"offer_name,omitempty" require:"true"`
	// 验证的计量数据
	OmsData *string `json:"oms_data,omitempty" xml:"oms_data,omitempty" require:"true"`
	// 计量数据业务幂等号
	OmsBizNo *string `json:"oms_biz_no,omitempty" xml:"oms_biz_no,omitempty" require:"true"`
	// 缓存报文
	VerificationCache *string `json:"verification_cache,omitempty" xml:"verification_cache,omitempty" require:"true"`
	// 缓存链接
	VerificationUrl *string `json:"verification_url,omitempty" xml:"verification_url,omitempty" require:"true"`
	// 审批流id
	BpmsId *string `json:"bpms_id,omitempty" xml:"bpms_id,omitempty" require:"true"`
	// 配置报文
	ConfigData *string `json:"config_data,omitempty" xml:"config_data,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 修改人
	Modifor *string `json:"modifor,omitempty" xml:"modifor,omitempty" require:"true"`
}

func (s CreateAcfeewebInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAcfeewebInstanceRequest) GoString() string {
	return s.String()
}

func (s *CreateAcfeewebInstanceRequest) SetAuthToken(v string) *CreateAcfeewebInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetId(v string) *CreateAcfeewebInstanceRequest {
	s.Id = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetDomainCode(v string) *CreateAcfeewebInstanceRequest {
	s.DomainCode = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetDomainName(v string) *CreateAcfeewebInstanceRequest {
	s.DomainName = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetDomainVersion(v string) *CreateAcfeewebInstanceRequest {
	s.DomainVersion = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetProductCode(v string) *CreateAcfeewebInstanceRequest {
	s.ProductCode = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetProductName(v string) *CreateAcfeewebInstanceRequest {
	s.ProductName = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetServiceCode(v string) *CreateAcfeewebInstanceRequest {
	s.ServiceCode = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetServiceName(v string) *CreateAcfeewebInstanceRequest {
	s.ServiceName = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetOfferCode(v string) *CreateAcfeewebInstanceRequest {
	s.OfferCode = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetOfferName(v string) *CreateAcfeewebInstanceRequest {
	s.OfferName = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetOmsData(v string) *CreateAcfeewebInstanceRequest {
	s.OmsData = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetOmsBizNo(v string) *CreateAcfeewebInstanceRequest {
	s.OmsBizNo = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetVerificationCache(v string) *CreateAcfeewebInstanceRequest {
	s.VerificationCache = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetVerificationUrl(v string) *CreateAcfeewebInstanceRequest {
	s.VerificationUrl = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetBpmsId(v string) *CreateAcfeewebInstanceRequest {
	s.BpmsId = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetConfigData(v string) *CreateAcfeewebInstanceRequest {
	s.ConfigData = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetStatus(v string) *CreateAcfeewebInstanceRequest {
	s.Status = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetCreator(v string) *CreateAcfeewebInstanceRequest {
	s.Creator = &v
	return s
}

func (s *CreateAcfeewebInstanceRequest) SetModifor(v string) *CreateAcfeewebInstanceRequest {
	s.Modifor = &v
	return s
}

type CreateAcfeewebInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审批流实例id
	ProcessInstanceId *string `json:"process_instance_id,omitempty" xml:"process_instance_id,omitempty"`
}

func (s CreateAcfeewebInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAcfeewebInstanceResponse) GoString() string {
	return s.String()
}

func (s *CreateAcfeewebInstanceResponse) SetReqMsgId(v string) *CreateAcfeewebInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAcfeewebInstanceResponse) SetResultCode(v string) *CreateAcfeewebInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAcfeewebInstanceResponse) SetResultMsg(v string) *CreateAcfeewebInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAcfeewebInstanceResponse) SetProcessInstanceId(v string) *CreateAcfeewebInstanceResponse {
	s.ProcessInstanceId = &v
	return s
}

type UpdateAcfeewebStateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 出账验证主键id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 计量域code
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true"`
	// 计量域名称
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty" require:"true"`
	// 计量域版本
	DomainVersion *string `json:"domain_version,omitempty" xml:"domain_version,omitempty" require:"true"`
	// 业务产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 渠道产品code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 渠道产品名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 商品code
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty" require:"true"`
	// 商品名称
	OfferName *string `json:"offer_name,omitempty" xml:"offer_name,omitempty" require:"true"`
	// 验证的计量数据
	OmsData *string `json:"oms_data,omitempty" xml:"oms_data,omitempty" require:"true"`
	// 计量数据业务幂等号
	OmsBizNo *string `json:"oms_biz_no,omitempty" xml:"oms_biz_no,omitempty" require:"true"`
	// 缓存报文
	VerificationCache *string `json:"verification_cache,omitempty" xml:"verification_cache,omitempty" require:"true"`
	// 缓存链接
	VerificationUrl *string `json:"verification_url,omitempty" xml:"verification_url,omitempty" require:"true"`
	// 审批流id
	BpmsId *string `json:"bpms_id,omitempty" xml:"bpms_id,omitempty" require:"true"`
	// 配置报文
	ConfigData *string `json:"config_data,omitempty" xml:"config_data,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 修改人
	Modifor *string `json:"modifor,omitempty" xml:"modifor,omitempty" require:"true"`
}

func (s UpdateAcfeewebStateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAcfeewebStateRequest) GoString() string {
	return s.String()
}

func (s *UpdateAcfeewebStateRequest) SetAuthToken(v string) *UpdateAcfeewebStateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetId(v string) *UpdateAcfeewebStateRequest {
	s.Id = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetDomainCode(v string) *UpdateAcfeewebStateRequest {
	s.DomainCode = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetDomainName(v string) *UpdateAcfeewebStateRequest {
	s.DomainName = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetDomainVersion(v string) *UpdateAcfeewebStateRequest {
	s.DomainVersion = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetProductCode(v string) *UpdateAcfeewebStateRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetProductName(v string) *UpdateAcfeewebStateRequest {
	s.ProductName = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetServiceCode(v string) *UpdateAcfeewebStateRequest {
	s.ServiceCode = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetServiceName(v string) *UpdateAcfeewebStateRequest {
	s.ServiceName = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetOfferCode(v string) *UpdateAcfeewebStateRequest {
	s.OfferCode = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetOfferName(v string) *UpdateAcfeewebStateRequest {
	s.OfferName = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetOmsData(v string) *UpdateAcfeewebStateRequest {
	s.OmsData = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetOmsBizNo(v string) *UpdateAcfeewebStateRequest {
	s.OmsBizNo = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetVerificationCache(v string) *UpdateAcfeewebStateRequest {
	s.VerificationCache = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetVerificationUrl(v string) *UpdateAcfeewebStateRequest {
	s.VerificationUrl = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetBpmsId(v string) *UpdateAcfeewebStateRequest {
	s.BpmsId = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetConfigData(v string) *UpdateAcfeewebStateRequest {
	s.ConfigData = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetStatus(v string) *UpdateAcfeewebStateRequest {
	s.Status = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetCreator(v string) *UpdateAcfeewebStateRequest {
	s.Creator = &v
	return s
}

func (s *UpdateAcfeewebStateRequest) SetModifor(v string) *UpdateAcfeewebStateRequest {
	s.Modifor = &v
	return s
}

type UpdateAcfeewebStateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功、失败
	SyncResult *bool `json:"sync_result,omitempty" xml:"sync_result,omitempty"`
}

func (s UpdateAcfeewebStateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAcfeewebStateResponse) GoString() string {
	return s.String()
}

func (s *UpdateAcfeewebStateResponse) SetReqMsgId(v string) *UpdateAcfeewebStateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAcfeewebStateResponse) SetResultCode(v string) *UpdateAcfeewebStateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAcfeewebStateResponse) SetResultMsg(v string) *UpdateAcfeewebStateResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAcfeewebStateResponse) SetSyncResult(v bool) *UpdateAcfeewebStateResponse {
	s.SyncResult = &v
	return s
}

type CreateAccountVerificationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 出账验证主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 计量域code
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true"`
	// 计量域名称
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty" require:"true"`
	// 计量域版本
	DomainVersion *string `json:"domain_version,omitempty" xml:"domain_version,omitempty" require:"true"`
	// 业务产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 渠道产品code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 渠道产品名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 商品code
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty" require:"true"`
	// 商品名称
	OfferName *string `json:"offer_name,omitempty" xml:"offer_name,omitempty" require:"true"`
	// 验证的计量数据
	OmsData *string `json:"oms_data,omitempty" xml:"oms_data,omitempty" require:"true"`
	// 计量数据业务幂等号
	OmsBizNo *string `json:"oms_biz_no,omitempty" xml:"oms_biz_no,omitempty" require:"true"`
	// 缓存报文
	VerificationCache *string `json:"verification_cache,omitempty" xml:"verification_cache,omitempty" require:"true"`
	// 缓存链接
	VerificationUrl *string `json:"verification_url,omitempty" xml:"verification_url,omitempty" require:"true"`
	// 审批流id
	BpmsId *string `json:"bpms_id,omitempty" xml:"bpms_id,omitempty" require:"true"`
	// 配置报文
	ConfigData *string `json:"config_data,omitempty" xml:"config_data,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 修改人
	Modifor *string `json:"modifor,omitempty" xml:"modifor,omitempty" require:"true"`
}

func (s CreateAccountVerificationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAccountVerificationRequest) GoString() string {
	return s.String()
}

func (s *CreateAccountVerificationRequest) SetAuthToken(v string) *CreateAccountVerificationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetId(v int64) *CreateAccountVerificationRequest {
	s.Id = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetDomainCode(v string) *CreateAccountVerificationRequest {
	s.DomainCode = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetDomainName(v string) *CreateAccountVerificationRequest {
	s.DomainName = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetDomainVersion(v string) *CreateAccountVerificationRequest {
	s.DomainVersion = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetProductCode(v string) *CreateAccountVerificationRequest {
	s.ProductCode = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetProductName(v string) *CreateAccountVerificationRequest {
	s.ProductName = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetServiceCode(v string) *CreateAccountVerificationRequest {
	s.ServiceCode = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetServiceName(v string) *CreateAccountVerificationRequest {
	s.ServiceName = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetOfferCode(v string) *CreateAccountVerificationRequest {
	s.OfferCode = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetOfferName(v string) *CreateAccountVerificationRequest {
	s.OfferName = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetOmsData(v string) *CreateAccountVerificationRequest {
	s.OmsData = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetOmsBizNo(v string) *CreateAccountVerificationRequest {
	s.OmsBizNo = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetVerificationCache(v string) *CreateAccountVerificationRequest {
	s.VerificationCache = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetVerificationUrl(v string) *CreateAccountVerificationRequest {
	s.VerificationUrl = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetBpmsId(v string) *CreateAccountVerificationRequest {
	s.BpmsId = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetConfigData(v string) *CreateAccountVerificationRequest {
	s.ConfigData = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetStatus(v string) *CreateAccountVerificationRequest {
	s.Status = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetCreator(v string) *CreateAccountVerificationRequest {
	s.Creator = &v
	return s
}

func (s *CreateAccountVerificationRequest) SetModifor(v string) *CreateAccountVerificationRequest {
	s.Modifor = &v
	return s
}

type CreateAccountVerificationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审批流实例id
	ProcessInstanceId *string `json:"process_instance_id,omitempty" xml:"process_instance_id,omitempty"`
}

func (s CreateAccountVerificationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAccountVerificationResponse) GoString() string {
	return s.String()
}

func (s *CreateAccountVerificationResponse) SetReqMsgId(v string) *CreateAccountVerificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAccountVerificationResponse) SetResultCode(v string) *CreateAccountVerificationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAccountVerificationResponse) SetResultMsg(v string) *CreateAccountVerificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAccountVerificationResponse) SetProcessInstanceId(v string) *CreateAccountVerificationResponse {
	s.ProcessInstanceId = &v
	return s
}

type SyncAccountVerificationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 出账验证主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 计量域code
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true"`
	// 计量域名称
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty" require:"true"`
	// 计量域版本
	DomainVersion *string `json:"domain_version,omitempty" xml:"domain_version,omitempty" require:"true"`
	// 业务产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 渠道产品code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 渠道产品名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 商品code
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty" require:"true"`
	// 商品名称
	OfferName *string `json:"offer_name,omitempty" xml:"offer_name,omitempty" require:"true"`
	// 验证的计量数据
	OmsData *string `json:"oms_data,omitempty" xml:"oms_data,omitempty" require:"true"`
	// 计量数据业务幂等号
	OmsBizNo *string `json:"oms_biz_no,omitempty" xml:"oms_biz_no,omitempty" require:"true"`
	// 缓存报文
	VerificationCache *string `json:"verification_cache,omitempty" xml:"verification_cache,omitempty" require:"true"`
	// 缓存链接
	VerificationUrl *string `json:"verification_url,omitempty" xml:"verification_url,omitempty" require:"true"`
	// 审批流id
	BpmsId *string `json:"bpms_id,omitempty" xml:"bpms_id,omitempty" require:"true"`
	// 配置报文
	ConfigData *string `json:"config_data,omitempty" xml:"config_data,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 修改人
	Modifor *string `json:"modifor,omitempty" xml:"modifor,omitempty" require:"true"`
}

func (s SyncAccountVerificationRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAccountVerificationRequest) GoString() string {
	return s.String()
}

func (s *SyncAccountVerificationRequest) SetAuthToken(v string) *SyncAccountVerificationRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetId(v int64) *SyncAccountVerificationRequest {
	s.Id = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetDomainCode(v string) *SyncAccountVerificationRequest {
	s.DomainCode = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetDomainName(v string) *SyncAccountVerificationRequest {
	s.DomainName = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetDomainVersion(v string) *SyncAccountVerificationRequest {
	s.DomainVersion = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetProductCode(v string) *SyncAccountVerificationRequest {
	s.ProductCode = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetProductName(v string) *SyncAccountVerificationRequest {
	s.ProductName = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetServiceCode(v string) *SyncAccountVerificationRequest {
	s.ServiceCode = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetServiceName(v string) *SyncAccountVerificationRequest {
	s.ServiceName = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetOfferCode(v string) *SyncAccountVerificationRequest {
	s.OfferCode = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetOfferName(v string) *SyncAccountVerificationRequest {
	s.OfferName = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetOmsData(v string) *SyncAccountVerificationRequest {
	s.OmsData = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetOmsBizNo(v string) *SyncAccountVerificationRequest {
	s.OmsBizNo = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetVerificationCache(v string) *SyncAccountVerificationRequest {
	s.VerificationCache = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetVerificationUrl(v string) *SyncAccountVerificationRequest {
	s.VerificationUrl = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetBpmsId(v string) *SyncAccountVerificationRequest {
	s.BpmsId = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetConfigData(v string) *SyncAccountVerificationRequest {
	s.ConfigData = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetStatus(v string) *SyncAccountVerificationRequest {
	s.Status = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetCreator(v string) *SyncAccountVerificationRequest {
	s.Creator = &v
	return s
}

func (s *SyncAccountVerificationRequest) SetModifor(v string) *SyncAccountVerificationRequest {
	s.Modifor = &v
	return s
}

type SyncAccountVerificationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功、失败
	SyncResult *bool `json:"sync_result,omitempty" xml:"sync_result,omitempty"`
}

func (s SyncAccountVerificationResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAccountVerificationResponse) GoString() string {
	return s.String()
}

func (s *SyncAccountVerificationResponse) SetReqMsgId(v string) *SyncAccountVerificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAccountVerificationResponse) SetResultCode(v string) *SyncAccountVerificationResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAccountVerificationResponse) SetResultMsg(v string) *SyncAccountVerificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAccountVerificationResponse) SetSyncResult(v bool) *SyncAccountVerificationResponse {
	s.SyncResult = &v
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
				"sdk_version":      tea.String("1.3.1"),
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
 * Description: 提供金融云账户余额、可用余额查询接口
 * Summary: 金融云账户余额查询
 */
func (client *Client) GetAccountBalance(request *GetAccountBalanceRequest) (_result *GetAccountBalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAccountBalanceResponse{}
	_body, _err := client.GetAccountBalanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供金融云账户余额、可用余额查询接口
 * Summary: 金融云账户余额查询
 */
func (client *Client) GetAccountBalanceEx(request *GetAccountBalanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAccountBalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAccountBalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.account.balance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
 * Summary: 智能科技资金帐号充值参数组装
 */
func (client *Client) ChargeAccountBalance(request *ChargeAccountBalanceRequest) (_result *ChargeAccountBalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ChargeAccountBalanceResponse{}
	_body, _err := client.ChargeAccountBalanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
 * Summary: 智能科技资金帐号充值参数组装
 */
func (client *Client) ChargeAccountBalanceEx(request *ChargeAccountBalanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ChargeAccountBalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ChargeAccountBalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.account.balance.charge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据托管子户ID查询租户信息
 * Summary: 根据托管子户ID查询租户信息
 */
func (client *Client) GetAccountUser(request *GetAccountUserRequest) (_result *GetAccountUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAccountUserResponse{}
	_body, _err := client.GetAccountUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据托管子户ID查询租户信息
 * Summary: 根据托管子户ID查询租户信息
 */
func (client *Client) GetAccountUserEx(request *GetAccountUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAccountUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAccountUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.account.user.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线下环境调用线上环境发起审批流
 * Summary: 创建审批流
 */
func (client *Client) CreateAcfeewebInstance(request *CreateAcfeewebInstanceRequest) (_result *CreateAcfeewebInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAcfeewebInstanceResponse{}
	_body, _err := client.CreateAcfeewebInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线下环境调用线上环境发起审批流
 * Summary: 创建审批流
 */
func (client *Client) CreateAcfeewebInstanceEx(request *CreateAcfeewebInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAcfeewebInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAcfeewebInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.acfeeweb.instance.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步线下接口(同步出账验证审批流状态)
 * Summary: 同步线下接口(同步出账验证审批流状态)
 */
func (client *Client) UpdateAcfeewebState(request *UpdateAcfeewebStateRequest) (_result *UpdateAcfeewebStateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAcfeewebStateResponse{}
	_body, _err := client.UpdateAcfeewebStateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步线下接口(同步出账验证审批流状态)
 * Summary: 同步线下接口(同步出账验证审批流状态)
 */
func (client *Client) UpdateAcfeewebStateEx(request *UpdateAcfeewebStateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAcfeewebStateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAcfeewebStateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.acfeeweb.state.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认账单，线上环境使用(同步数据、创建审批流)
 * Summary: 确认账单线上使用(同步数据、创建审批流)
 */
func (client *Client) CreateAccountVerification(request *CreateAccountVerificationRequest) (_result *CreateAccountVerificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAccountVerificationResponse{}
	_body, _err := client.CreateAccountVerificationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认账单，线上环境使用(同步数据、创建审批流)
 * Summary: 确认账单线上使用(同步数据、创建审批流)
 */
func (client *Client) CreateAccountVerificationEx(request *CreateAccountVerificationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAccountVerificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAccountVerificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.account.verification.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步线下接口(同步出账验证审批流状态)
 * Summary: 同步线下接口(同步出账验证审批流状态)
 */
func (client *Client) SyncAccountVerification(request *SyncAccountVerificationRequest) (_result *SyncAccountVerificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAccountVerificationResponse{}
	_body, _err := client.SyncAccountVerificationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步线下接口(同步出账验证审批流状态)
 * Summary: 同步线下接口(同步出账验证审批流状态)
 */
func (client *Client) SyncAccountVerificationEx(request *SyncAccountVerificationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAccountVerificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAccountVerificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.account.verification.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
