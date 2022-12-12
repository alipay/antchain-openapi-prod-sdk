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

type PushBlockchainTaxIcmInvoiceRequest struct {
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

func (s PushBlockchainTaxIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s PushBlockchainTaxIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetAuthToken(v string) *PushBlockchainTaxIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetProductInstanceId(v string) *PushBlockchainTaxIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetPch(v string) *PushBlockchainTaxIcmInvoiceRequest {
	s.Pch = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetFpxx(v string) *PushBlockchainTaxIcmInvoiceRequest {
	s.Fpxx = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetFplx(v string) *PushBlockchainTaxIcmInvoiceRequest {
	s.Fplx = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceRequest) SetIslsp(v bool) *PushBlockchainTaxIcmInvoiceRequest {
	s.Islsp = &v
	return s
}

type PushBlockchainTaxIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushBlockchainTaxIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s PushBlockchainTaxIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *PushBlockchainTaxIcmInvoiceResponse) SetReqMsgId(v string) *PushBlockchainTaxIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceResponse) SetResultCode(v string) *PushBlockchainTaxIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceResponse) SetResultMsg(v string) *PushBlockchainTaxIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type QueryBlockchainTaxIcmInvoiceRequest struct {
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
}

func (s QueryBlockchainTaxIcmInvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainTaxIcmInvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetAuthToken(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetProductInstanceId(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetAppId(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.AppId = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetAuthType(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.AuthType = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetCallbackUrl(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.CallbackUrl = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetEndAmount(v int64) *QueryBlockchainTaxIcmInvoiceRequest {
	s.EndAmount = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetEndDate(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.EndDate = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetInvoiceType(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.InvoiceType = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetNsrsbh(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.Nsrsbh = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetRequestId(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.RequestId = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetStartAmount(v int64) *QueryBlockchainTaxIcmInvoiceRequest {
	s.StartAmount = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceRequest) SetStartDate(v string) *QueryBlockchainTaxIcmInvoiceRequest {
	s.StartDate = &v
	return s
}

type QueryBlockchainTaxIcmInvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBlockchainTaxIcmInvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainTaxIcmInvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainTaxIcmInvoiceResponse) SetReqMsgId(v string) *QueryBlockchainTaxIcmInvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceResponse) SetResultCode(v string) *QueryBlockchainTaxIcmInvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainTaxIcmInvoiceResponse) SetResultMsg(v string) *QueryBlockchainTaxIcmInvoiceResponse {
	s.ResultMsg = &v
	return s
}

type PushBlockchainTaxIcmInvoiceinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上票ISV app_id即secret_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发票号码
	Invoice *Invoice `json:"invoice,omitempty" xml:"invoice,omitempty" require:"true"`
}

func (s PushBlockchainTaxIcmInvoiceinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushBlockchainTaxIcmInvoiceinfoRequest) GoString() string {
	return s.String()
}

func (s *PushBlockchainTaxIcmInvoiceinfoRequest) SetAuthToken(v string) *PushBlockchainTaxIcmInvoiceinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceinfoRequest) SetProductInstanceId(v string) *PushBlockchainTaxIcmInvoiceinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceinfoRequest) SetAppId(v string) *PushBlockchainTaxIcmInvoiceinfoRequest {
	s.AppId = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceinfoRequest) SetInvoice(v *Invoice) *PushBlockchainTaxIcmInvoiceinfoRequest {
	s.Invoice = v
	return s
}

type PushBlockchainTaxIcmInvoiceinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushBlockchainTaxIcmInvoiceinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushBlockchainTaxIcmInvoiceinfoResponse) GoString() string {
	return s.String()
}

func (s *PushBlockchainTaxIcmInvoiceinfoResponse) SetReqMsgId(v string) *PushBlockchainTaxIcmInvoiceinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceinfoResponse) SetResultCode(v string) *PushBlockchainTaxIcmInvoiceinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushBlockchainTaxIcmInvoiceinfoResponse) SetResultMsg(v string) *PushBlockchainTaxIcmInvoiceinfoResponse {
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
				"_prod_code":       tea.String("ak_6597a3b2da294170a5de533601288f1d"),
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
 * Description: 目前仅用于广州区块链发票信息推送
 * Summary:  区块链发票信息推送
 */
func (client *Client) PushBlockchainTaxIcmInvoice(request *PushBlockchainTaxIcmInvoiceRequest) (_result *PushBlockchainTaxIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushBlockchainTaxIcmInvoiceResponse{}
	_body, _err := client.PushBlockchainTaxIcmInvoiceEx(request, headers, runtime)
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
func (client *Client) PushBlockchainTaxIcmInvoiceEx(request *PushBlockchainTaxIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushBlockchainTaxIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushBlockchainTaxIcmInvoiceResponse{}
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
func (client *Client) QueryBlockchainTaxIcmInvoice(request *QueryBlockchainTaxIcmInvoiceRequest) (_result *QueryBlockchainTaxIcmInvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainTaxIcmInvoiceResponse{}
	_body, _err := client.QueryBlockchainTaxIcmInvoiceEx(request, headers, runtime)
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
func (client *Client) QueryBlockchainTaxIcmInvoiceEx(request *QueryBlockchainTaxIcmInvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainTaxIcmInvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainTaxIcmInvoiceResponse{}
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
func (client *Client) PushBlockchainTaxIcmInvoiceinfo(request *PushBlockchainTaxIcmInvoiceinfoRequest) (_result *PushBlockchainTaxIcmInvoiceinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushBlockchainTaxIcmInvoiceinfoResponse{}
	_body, _err := client.PushBlockchainTaxIcmInvoiceinfoEx(request, headers, runtime)
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
func (client *Client) PushBlockchainTaxIcmInvoiceinfoEx(request *PushBlockchainTaxIcmInvoiceinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushBlockchainTaxIcmInvoiceinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushBlockchainTaxIcmInvoiceinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.invoiceinfo.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
