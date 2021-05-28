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

// 发票明细
type InvoiceItem struct {
	// 税收分类编码
	Spbm *string `json:"spbm,omitempty" xml:"spbm,omitempty" require:"true"`
	// 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
	Mc *string `json:"mc,omitempty" xml:"mc,omitempty" require:"true"`
	// 单位
	Jldw *string `json:"jldw,omitempty" xml:"jldw,omitempty"`
	// 数量
	Shul *string `json:"shul,omitempty" xml:"shul,omitempty"`
	// 含税金额,2位小数
	Je *string `json:"je,omitempty" xml:"je,omitempty" require:"true"`
	// 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
	Sl *string `json:"sl,omitempty" xml:"sl,omitempty"`
	// 税额,当fplx!=51or53时，必填
	Se *string `json:"se,omitempty" xml:"se,omitempty"`
	// 明细序号,从1开始递增
	Mxxh *string `json:"mxxh,omitempty" xml:"mxxh,omitempty" require:"true"`
	// 单价
	Dj *string `json:"dj,omitempty" xml:"dj,omitempty" require:"true"`
	// 规格型号
	Ggxh *string `json:"ggxh,omitempty" xml:"ggxh,omitempty"`
}

func (s InvoiceItem) String() string {
	return tea.Prettify(s)
}

func (s InvoiceItem) GoString() string {
	return s.String()
}

func (s *InvoiceItem) SetSpbm(v string) *InvoiceItem {
	s.Spbm = &v
	return s
}

func (s *InvoiceItem) SetMc(v string) *InvoiceItem {
	s.Mc = &v
	return s
}

func (s *InvoiceItem) SetJldw(v string) *InvoiceItem {
	s.Jldw = &v
	return s
}

func (s *InvoiceItem) SetShul(v string) *InvoiceItem {
	s.Shul = &v
	return s
}

func (s *InvoiceItem) SetJe(v string) *InvoiceItem {
	s.Je = &v
	return s
}

func (s *InvoiceItem) SetSl(v string) *InvoiceItem {
	s.Sl = &v
	return s
}

func (s *InvoiceItem) SetSe(v string) *InvoiceItem {
	s.Se = &v
	return s
}

func (s *InvoiceItem) SetMxxh(v string) *InvoiceItem {
	s.Mxxh = &v
	return s
}

func (s *InvoiceItem) SetDj(v string) *InvoiceItem {
	s.Dj = &v
	return s
}

func (s *InvoiceItem) SetGgxh(v string) *InvoiceItem {
	s.Ggxh = &v
	return s
}

// 发票标准模型
type Invoice struct {
	// 备注
	Bz *string `json:"bz,omitempty" xml:"bz,omitempty"`
	// 复核人
	Fhr *string `json:"fhr,omitempty" xml:"fhr,omitempty"`
	// 发票代码, 发票代码+发票号码唯一
	Fpdm *string `json:"fpdm,omitempty" xml:"fpdm,omitempty" require:"true"`
	// 发票号码,发票代码+发票号码唯一
	Fphm *string `json:"fphm,omitempty" xml:"fphm,omitempty" require:"true"`
	// 发票类型代码,
	// 默认填:20:广东电子普通发票
	// 01：增值税专用发票
	// 04：增值税普通发票
	// 10：增值税电子普通发票
	// 51：重庆通用机打一联发票76
	// 53：重庆通用机打三联发票210
	// 90：重庆通用机打三联发票190
	Fplx *string `json:"fplx,omitempty" xml:"fplx,omitempty" require:"true"`
	// 发票明细集合
	Fpxxmxs []*InvoiceItem `json:"fpxxmxs,omitempty" xml:"fpxxmxs,omitempty" type:"Repeated"`
	// 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
	Fpztdm *string `json:"fpztdm,omitempty" xml:"fpztdm,omitempty" require:"true"`
	// 购买方地址、电话
	Gfdzdh *string `json:"gfdzdh,omitempty" xml:"gfdzdh,omitempty"`
	// 购买方名称
	Gfmc *string `json:"gfmc,omitempty" xml:"gfmc,omitempty" require:"true"`
	// 购买方纳税人识别号
	Gfsh *string `json:"gfsh,omitempty" xml:"gfsh,omitempty"`
	// 购买方银行账号
	Gfyhzh *string `json:"gfyhzh,omitempty" xml:"gfyhzh,omitempty"`
	// 购买方类型,1企业 2个人 3其他
	Gmflx *string `json:"gmflx,omitempty" xml:"gmflx,omitempty"`
	// 金额
	Je *string `json:"je,omitempty" xml:"je,omitempty" require:"true"`
	// 价税合计	， 单位：元（2 位小数）
	Jshj *string `json:"jshj,omitempty" xml:"jshj,omitempty" require:"true"`
	// 开票类型,0-蓝字发票；1-红字发票；
	Kplx *string `json:"kplx,omitempty" xml:"kplx,omitempty" require:"true"`
	// 开票人
	Kpr *string `json:"kpr,omitempty" xml:"kpr,omitempty" require:"true"`
	// 开票日期
	Kprq *string `json:"kprq,omitempty" xml:"kprq,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 清单标志,00:无清单 01:有清单
	Qdbz *string `json:"qdbz,omitempty" xml:"qdbz,omitempty"`
	// 认证状态
	Rzdklbdjgdm *string `json:"rzdklbdjgdm,omitempty" xml:"rzdklbdjgdm,omitempty"`
	// 认证日期
	Rzdklbdrq *string `json:"rzdklbdrq,omitempty" xml:"rzdklbdrq,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
	Se *string `json:"se,omitempty" xml:"se,omitempty"`
	// 收款人
	Skr *string `json:"skr,omitempty" xml:"skr,omitempty"`
	// 税率标识,0不含税税率；1含税税率
	Slbz *string `json:"slbz,omitempty" xml:"slbz,omitempty" require:"true"`
	// 所属税务机关代码:
	// 山东省343
	// 重庆市350
	// 广东省347
	Ssdq *string `json:"ssdq,omitempty" xml:"ssdq,omitempty" require:"true"`
	// 销售方地址、电话
	Xfdzdh *string `json:"xfdzdh,omitempty" xml:"xfdzdh,omitempty"`
	// 销售方名称
	Xfmc *string `json:"xfmc,omitempty" xml:"xfmc,omitempty" require:"true"`
	// 销售方纳税人识别号
	Xfsh *string `json:"xfsh,omitempty" xml:"xfsh,omitempty" require:"true"`
	// 销售方银行账号
	Xfyhzh *string `json:"xfyhzh,omitempty" xml:"xfyhzh,omitempty"`
	// 原发票代码, kplx开票类型为1时必填
	Yfpdm *string `json:"yfpdm,omitempty" xml:"yfpdm,omitempty"`
	// 原发票号码,kplx开票类型为1时必填
	Yfphm *string `json:"yfphm,omitempty" xml:"yfphm,omitempty"`
	// 作废标志,0:未作废，1作废
	Zfbz *string `json:"zfbz,omitempty" xml:"zfbz,omitempty" require:"true"`
	// 作废时间
	Zfsj *string `json:"zfsj,omitempty" xml:"zfsj,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 扩展字段
	ExtFiled *string `json:"ext_filed,omitempty" xml:"ext_filed,omitempty" require:"true"`
}

func (s Invoice) String() string {
	return tea.Prettify(s)
}

func (s Invoice) GoString() string {
	return s.String()
}

func (s *Invoice) SetBz(v string) *Invoice {
	s.Bz = &v
	return s
}

func (s *Invoice) SetFhr(v string) *Invoice {
	s.Fhr = &v
	return s
}

func (s *Invoice) SetFpdm(v string) *Invoice {
	s.Fpdm = &v
	return s
}

func (s *Invoice) SetFphm(v string) *Invoice {
	s.Fphm = &v
	return s
}

func (s *Invoice) SetFplx(v string) *Invoice {
	s.Fplx = &v
	return s
}

func (s *Invoice) SetFpxxmxs(v []*InvoiceItem) *Invoice {
	s.Fpxxmxs = v
	return s
}

func (s *Invoice) SetFpztdm(v string) *Invoice {
	s.Fpztdm = &v
	return s
}

func (s *Invoice) SetGfdzdh(v string) *Invoice {
	s.Gfdzdh = &v
	return s
}

func (s *Invoice) SetGfmc(v string) *Invoice {
	s.Gfmc = &v
	return s
}

func (s *Invoice) SetGfsh(v string) *Invoice {
	s.Gfsh = &v
	return s
}

func (s *Invoice) SetGfyhzh(v string) *Invoice {
	s.Gfyhzh = &v
	return s
}

func (s *Invoice) SetGmflx(v string) *Invoice {
	s.Gmflx = &v
	return s
}

func (s *Invoice) SetJe(v string) *Invoice {
	s.Je = &v
	return s
}

func (s *Invoice) SetJshj(v string) *Invoice {
	s.Jshj = &v
	return s
}

func (s *Invoice) SetKplx(v string) *Invoice {
	s.Kplx = &v
	return s
}

func (s *Invoice) SetKpr(v string) *Invoice {
	s.Kpr = &v
	return s
}

func (s *Invoice) SetKprq(v string) *Invoice {
	s.Kprq = &v
	return s
}

func (s *Invoice) SetQdbz(v string) *Invoice {
	s.Qdbz = &v
	return s
}

func (s *Invoice) SetRzdklbdjgdm(v string) *Invoice {
	s.Rzdklbdjgdm = &v
	return s
}

func (s *Invoice) SetRzdklbdrq(v string) *Invoice {
	s.Rzdklbdrq = &v
	return s
}

func (s *Invoice) SetSe(v string) *Invoice {
	s.Se = &v
	return s
}

func (s *Invoice) SetSkr(v string) *Invoice {
	s.Skr = &v
	return s
}

func (s *Invoice) SetSlbz(v string) *Invoice {
	s.Slbz = &v
	return s
}

func (s *Invoice) SetSsdq(v string) *Invoice {
	s.Ssdq = &v
	return s
}

func (s *Invoice) SetXfdzdh(v string) *Invoice {
	s.Xfdzdh = &v
	return s
}

func (s *Invoice) SetXfmc(v string) *Invoice {
	s.Xfmc = &v
	return s
}

func (s *Invoice) SetXfsh(v string) *Invoice {
	s.Xfsh = &v
	return s
}

func (s *Invoice) SetXfyhzh(v string) *Invoice {
	s.Xfyhzh = &v
	return s
}

func (s *Invoice) SetYfpdm(v string) *Invoice {
	s.Yfpdm = &v
	return s
}

func (s *Invoice) SetYfphm(v string) *Invoice {
	s.Yfphm = &v
	return s
}

func (s *Invoice) SetZfbz(v string) *Invoice {
	s.Zfbz = &v
	return s
}

func (s *Invoice) SetZfsj(v string) *Invoice {
	s.Zfsj = &v
	return s
}

func (s *Invoice) SetExtFiled(v string) *Invoice {
	s.ExtFiled = &v
	return s
}

type AuthCorpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业注册地址和电话号码
	CorpAddressPhoneNo *string `json:"corp_address_phone_no,omitempty" xml:"corp_address_phone_no,omitempty" require:"true"`
	// 企业银行账号
	CorpBankNo *string `json:"corp_bank_no,omitempty" xml:"corp_bank_no,omitempty" require:"true"`
	// 填写公司名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 企业授权秘钥
	CorpPrivateKey *string `json:"corp_private_key,omitempty" xml:"corp_private_key,omitempty" require:"true"`
	// 企业纳税人识别号
	CorpTaxId *string `json:"corp_tax_id,omitempty" xml:"corp_tax_id,omitempty" require:"true"`
}

func (s AuthCorpRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthCorpRequest) GoString() string {
	return s.String()
}

func (s *AuthCorpRequest) SetAuthToken(v string) *AuthCorpRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthCorpRequest) SetProductInstanceId(v string) *AuthCorpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthCorpRequest) SetCorpAddressPhoneNo(v string) *AuthCorpRequest {
	s.CorpAddressPhoneNo = &v
	return s
}

func (s *AuthCorpRequest) SetCorpBankNo(v string) *AuthCorpRequest {
	s.CorpBankNo = &v
	return s
}

func (s *AuthCorpRequest) SetCorpName(v string) *AuthCorpRequest {
	s.CorpName = &v
	return s
}

func (s *AuthCorpRequest) SetCorpPrivateKey(v string) *AuthCorpRequest {
	s.CorpPrivateKey = &v
	return s
}

func (s *AuthCorpRequest) SetCorpTaxId(v string) *AuthCorpRequest {
	s.CorpTaxId = &v
	return s
}

type AuthCorpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthCorpResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthCorpResponse) GoString() string {
	return s.String()
}

func (s *AuthCorpResponse) SetReqMsgId(v string) *AuthCorpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthCorpResponse) SetResultCode(v string) *AuthCorpResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthCorpResponse) SetResultMsg(v string) *AuthCorpResponse {
	s.ResultMsg = &v
	return s
}

type PushChargeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	BizTenant *string `json:"biz_tenant,omitempty" xml:"biz_tenant,omitempty" require:"true"`
	// 平台分发,子业务类型，对应原来的authType.
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 系统编码,平台分发，定义枚举，全局用
	SystemCode *string `json:"system_code,omitempty" xml:"system_code,omitempty" require:"true"`
	// 请求id
	TaskRequestId *string `json:"task_request_id,omitempty" xml:"task_request_id,omitempty" require:"true"`
}

func (s PushChargeRequest) String() string {
	return tea.Prettify(s)
}

func (s PushChargeRequest) GoString() string {
	return s.String()
}

func (s *PushChargeRequest) SetAuthToken(v string) *PushChargeRequest {
	s.AuthToken = &v
	return s
}

func (s *PushChargeRequest) SetProductInstanceId(v string) *PushChargeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushChargeRequest) SetBizTenant(v string) *PushChargeRequest {
	s.BizTenant = &v
	return s
}

func (s *PushChargeRequest) SetBizType(v string) *PushChargeRequest {
	s.BizType = &v
	return s
}

func (s *PushChargeRequest) SetCustomerId(v string) *PushChargeRequest {
	s.CustomerId = &v
	return s
}

func (s *PushChargeRequest) SetSystemCode(v string) *PushChargeRequest {
	s.SystemCode = &v
	return s
}

func (s *PushChargeRequest) SetTaskRequestId(v string) *PushChargeRequest {
	s.TaskRequestId = &v
	return s
}

type PushChargeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushChargeResponse) String() string {
	return tea.Prettify(s)
}

func (s PushChargeResponse) GoString() string {
	return s.String()
}

func (s *PushChargeResponse) SetReqMsgId(v string) *PushChargeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushChargeResponse) SetResultCode(v string) *PushChargeResponse {
	s.ResultCode = &v
	return s
}

func (s *PushChargeResponse) SetResultMsg(v string) *PushChargeResponse {
	s.ResultMsg = &v
	return s
}

type QueryChargeAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	BizTenant *string `json:"biz_tenant,omitempty" xml:"biz_tenant,omitempty" require:"true"`
	// 授权类型,业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
}

func (s QueryChargeAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryChargeAuthRequest) GoString() string {
	return s.String()
}

func (s *QueryChargeAuthRequest) SetAuthToken(v string) *QueryChargeAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryChargeAuthRequest) SetProductInstanceId(v string) *QueryChargeAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryChargeAuthRequest) SetBizTenant(v string) *QueryChargeAuthRequest {
	s.BizTenant = &v
	return s
}

func (s *QueryChargeAuthRequest) SetBizType(v string) *QueryChargeAuthRequest {
	s.BizType = &v
	return s
}

type QueryChargeAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OPEN:开通
	// STOP：停止
	// NOT_SALE：未授权
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
}

func (s QueryChargeAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryChargeAuthResponse) GoString() string {
	return s.String()
}

func (s *QueryChargeAuthResponse) SetReqMsgId(v string) *QueryChargeAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryChargeAuthResponse) SetResultCode(v string) *QueryChargeAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryChargeAuthResponse) SetResultMsg(v string) *QueryChargeAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryChargeAuthResponse) SetAuthType(v string) *QueryChargeAuthResponse {
	s.AuthType = &v
	return s
}

type PushIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	Pch *string `json:"pch,omitempty" xml:"pch,omitempty" require:"true"`
	// 发票信息（json格式）
	Fpxx *string `json:"fpxx,omitempty" xml:"fpxx,omitempty" require:"true"`
	// 发票类型
	// 01：增值税专用发票
	// 04：增值税普通发票
	// 10：增值税电子普通发票
	Fplx *string `json:"fplx,omitempty" xml:"fplx,omitempty" require:"true"`
	// 是否是历史数据推送
	Islsp *bool `json:"islsp,omitempty" xml:"islsp,omitempty" require:"true"`
}

func (s PushIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceRequest) SetAuthToken(v string) *PushIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetProductInstanceId(v string) *PushIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetPch(v string) *PushIcmInvoiceRequest {
	s.Pch = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetFpxx(v string) *PushIcmInvoiceRequest {
	s.Fpxx = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetFplx(v string) *PushIcmInvoiceRequest {
	s.Fplx = &v
	return s
}

func (s *PushIcmInvoiceRequest) SetIslsp(v bool) *PushIcmInvoiceRequest {
	s.Islsp = &v
	return s
}

type PushIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceResponse) SetReqMsgId(v string) *PushIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushIcmInvoiceResponse) SetResultCode(v string) *PushIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *PushIcmInvoiceResponse) SetResultMsg(v string) *PushIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type QueryIcmInvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ISV名称，用于标识合作的企业
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 授权类型
	// 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	//  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
	//
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// java long型
	// 起始金额，当type=03（报销查询）时必填
	EndAmount *int64 `json:"end_amount,omitempty" xml:"end_amount,omitempty"`
	// 查询起始时间(当auth_type=02或者03时必填)
	// 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
	// 最大查询范围为6.1-6.30
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 非必填，不填则查询所有类型发票
	// "01": "增值税专用发票"
	// "04": "增值税普通发票"
	// "10": "增值税电子普通发票"
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty"`
	// 查询的企业纳税人识别号
	Nsrsbh *string `json:"nsrsbh,omitempty" xml:"nsrsbh,omitempty" require:"true"`
	// 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// java long型
	// 起始金额，当type=03（报销查询）时必填
	StartAmount *int64 `json:"start_amount,omitempty" xml:"start_amount,omitempty"`
	// 查询起始时间(当auth_type=02或者03时必填)
	// 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
	// 最大查询范围为6.1-6.30
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 地区编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
}

func (s QueryIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryIcmInvoiceRequest) SetAuthToken(v string) *QueryIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetProductInstanceId(v string) *QueryIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetAppId(v string) *QueryIcmInvoiceRequest {
	s.AppId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetAuthType(v string) *QueryIcmInvoiceRequest {
	s.AuthType = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetCallbackUrl(v string) *QueryIcmInvoiceRequest {
	s.CallbackUrl = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetEndAmount(v int64) *QueryIcmInvoiceRequest {
	s.EndAmount = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetEndDate(v string) *QueryIcmInvoiceRequest {
	s.EndDate = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetInvoiceType(v string) *QueryIcmInvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetNsrsbh(v string) *QueryIcmInvoiceRequest {
	s.Nsrsbh = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetRequestId(v string) *QueryIcmInvoiceRequest {
	s.RequestId = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetStartAmount(v int64) *QueryIcmInvoiceRequest {
	s.StartAmount = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetStartDate(v string) *QueryIcmInvoiceRequest {
	s.StartDate = &v
	return s
}

func (s *QueryIcmInvoiceRequest) SetCityCode(v string) *QueryIcmInvoiceRequest {
	s.CityCode = &v
	return s
}

type QueryIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryIcmInvoiceResponse) SetReqMsgId(v string) *QueryIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIcmInvoiceResponse) SetResultCode(v string) *QueryIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIcmInvoiceResponse) SetResultMsg(v string) *QueryIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type PushIcmInvoiceinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上票ISV app_id即secret_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发票号码
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
}

func (s PushIcmInvoiceinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceinfoRequest) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceinfoRequest) SetAuthToken(v string) *PushIcmInvoiceinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetProductInstanceId(v string) *PushIcmInvoiceinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetAppId(v string) *PushIcmInvoiceinfoRequest {
	s.AppId = &v
	return s
}

func (s *PushIcmInvoiceinfoRequest) SetInvoice(v *Invoice) *PushIcmInvoiceinfoRequest {
	s.Invoice = v
	return s
}

type PushIcmInvoiceinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushIcmInvoiceinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushIcmInvoiceinfoResponse) GoString() string {
	return s.String()
}

func (s *PushIcmInvoiceinfoResponse) SetReqMsgId(v string) *PushIcmInvoiceinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushIcmInvoiceinfoResponse) SetResultCode(v string) *PushIcmInvoiceinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushIcmInvoiceinfoResponse) SetResultMsg(v string) *PushIcmInvoiceinfoResponse {
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
				"sdk_version":      tea.String("1.1.6"),
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
 * Description: 目前仅用于广州区块链发票开通企业信息推送
 * Summary: 区块链发票开通企业信息推送
 */
func (client *Client) AuthCorp(request *AuthCorpRequest) (_result *AuthCorpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthCorpResponse{}
	_body, _err := client.AuthCorpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票开通企业信息推送
 * Summary: 区块链发票开通企业信息推送
 */
func (client *Client) AuthCorpEx(request *AuthCorpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthCorpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthCorpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.corp.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
 * Summary: 计费推送
 */
func (client *Client) PushCharge(request *PushChargeRequest) (_result *PushChargeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushChargeResponse{}
	_body, _err := client.PushChargeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
 * Summary: 计费推送
 */
func (client *Client) PushChargeEx(request *PushChargeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushChargeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushChargeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.charge.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询计收费授权情况
 * Summary: 查询计收费授权情况
 */
func (client *Client) QueryChargeAuth(request *QueryChargeAuthRequest) (_result *QueryChargeAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryChargeAuthResponse{}
	_body, _err := client.QueryChargeAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询计收费授权情况
 * Summary: 查询计收费授权情况
 */
func (client *Client) QueryChargeAuthEx(request *QueryChargeAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryChargeAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryChargeAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.charge.auth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票信息推送
 * Summary:  区块链发票信息推送
 */
func (client *Client) PushIcmInvoice(request *PushIcmInvoiceRequest) (_result *PushIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushIcmInvoiceResponse{}
	_body, _err := client.PushIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 目前仅用于广州区块链发票信息推送
 * Summary:  区块链发票信息推送
 */
func (client *Client) PushIcmInvoiceEx(request *PushIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
 * Summary:  区块链发票信息查询
 */
func (client *Client) QueryIcmInvoice(request *QueryIcmInvoiceRequest) (_result *QueryIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIcmInvoiceResponse{}
	_body, _err := client.QueryIcmInvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
 * Summary:  区块链发票信息查询
 */
func (client *Client) QueryIcmInvoiceEx(request *QueryIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIcmInvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标准发票推送
 * Summary: 标准发票推送
 */
func (client *Client) PushIcmInvoiceinfo(request *PushIcmInvoiceinfoRequest) (_result *PushIcmInvoiceinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushIcmInvoiceinfoResponse{}
	_body, _err := client.PushIcmInvoiceinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标准发票推送
 * Summary: 标准发票推送
 */
func (client *Client) PushIcmInvoiceinfoEx(request *PushIcmInvoiceinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushIcmInvoiceinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushIcmInvoiceinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoiceinfo.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
