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

type ExecDataproductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 请求ID，调用方需要确保唯一
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务入参的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecDataproductRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecDataproductRequest) GoString() string {
	return s.String()
}

func (s *ExecDataproductRequest) SetAuthToken(v string) *ExecDataproductRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecDataproductRequest) SetProductCode(v string) *ExecDataproductRequest {
	s.ProductCode = &v
	return s
}

func (s *ExecDataproductRequest) SetRequestId(v string) *ExecDataproductRequest {
	s.RequestId = &v
	return s
}

func (s *ExecDataproductRequest) SetBizContent(v string) *ExecDataproductRequest {
	s.BizContent = &v
	return s
}

type ExecDataproductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回值
	//
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	// 是否计费标识
	// Y 表示计费，N 表示不计费
	ChargeFlag *string `json:"charge_flag,omitempty" xml:"charge_flag,omitempty"`
}

func (s ExecDataproductResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecDataproductResponse) GoString() string {
	return s.String()
}

func (s *ExecDataproductResponse) SetReqMsgId(v string) *ExecDataproductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecDataproductResponse) SetResultCode(v string) *ExecDataproductResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecDataproductResponse) SetResultMsg(v string) *ExecDataproductResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecDataproductResponse) SetBizResult(v string) *ExecDataproductResponse {
	s.BizResult = &v
	return s
}

func (s *ExecDataproductResponse) SetChargeFlag(v string) *ExecDataproductResponse {
	s.ChargeFlag = &v
	return s
}

type ExecDataproductAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品类型
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 请求ID，调用方需要确保唯一
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务入参的json字符串
	//
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecDataproductAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecDataproductAsyncRequest) GoString() string {
	return s.String()
}

func (s *ExecDataproductAsyncRequest) SetAuthToken(v string) *ExecDataproductAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecDataproductAsyncRequest) SetProductCode(v string) *ExecDataproductAsyncRequest {
	s.ProductCode = &v
	return s
}

func (s *ExecDataproductAsyncRequest) SetProductType(v string) *ExecDataproductAsyncRequest {
	s.ProductType = &v
	return s
}

func (s *ExecDataproductAsyncRequest) SetRequestId(v string) *ExecDataproductAsyncRequest {
	s.RequestId = &v
	return s
}

func (s *ExecDataproductAsyncRequest) SetBizContent(v string) *ExecDataproductAsyncRequest {
	s.BizContent = &v
	return s
}

type ExecDataproductAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态
	// RUNNING：执行中
	// SUCCESS：成功
	// FAIL：失败
	ExecStatus *string `json:"exec_status,omitempty" xml:"exec_status,omitempty"`
}

func (s ExecDataproductAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecDataproductAsyncResponse) GoString() string {
	return s.String()
}

func (s *ExecDataproductAsyncResponse) SetReqMsgId(v string) *ExecDataproductAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecDataproductAsyncResponse) SetResultCode(v string) *ExecDataproductAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecDataproductAsyncResponse) SetResultMsg(v string) *ExecDataproductAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecDataproductAsyncResponse) SetExecStatus(v string) *ExecDataproductAsyncResponse {
	s.ExecStatus = &v
	return s
}

type QueryDataproductAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	//
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品类型
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 请求ID，需要确保和异步调用的请求ID一致
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s QueryDataproductAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataproductAsyncRequest) GoString() string {
	return s.String()
}

func (s *QueryDataproductAsyncRequest) SetAuthToken(v string) *QueryDataproductAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataproductAsyncRequest) SetProductCode(v string) *QueryDataproductAsyncRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryDataproductAsyncRequest) SetProductType(v string) *QueryDataproductAsyncRequest {
	s.ProductType = &v
	return s
}

func (s *QueryDataproductAsyncRequest) SetRequestId(v string) *QueryDataproductAsyncRequest {
	s.RequestId = &v
	return s
}

type QueryDataproductAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态
	// INIT：请求已受理
	// RUNNING：执行中
	// SUCCESS：成功
	// FAIL：失败
	ExecStatus *string `json:"exec_status,omitempty" xml:"exec_status,omitempty"`
	// 业务返回值
	//
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	// 是否计费标识 Y 表示计费，N 表示不计费
	//
	ChargeFlag *string `json:"charge_flag,omitempty" xml:"charge_flag,omitempty"`
}

func (s QueryDataproductAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataproductAsyncResponse) GoString() string {
	return s.String()
}

func (s *QueryDataproductAsyncResponse) SetReqMsgId(v string) *QueryDataproductAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataproductAsyncResponse) SetResultCode(v string) *QueryDataproductAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataproductAsyncResponse) SetResultMsg(v string) *QueryDataproductAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataproductAsyncResponse) SetExecStatus(v string) *QueryDataproductAsyncResponse {
	s.ExecStatus = &v
	return s
}

func (s *QueryDataproductAsyncResponse) SetBizResult(v string) *QueryDataproductAsyncResponse {
	s.BizResult = &v
	return s
}

func (s *QueryDataproductAsyncResponse) SetChargeFlag(v string) *QueryDataproductAsyncResponse {
	s.ChargeFlag = &v
	return s
}

type SubmitDrrdataSubscriptionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 运单号
	MailNo *string `json:"mail_no,omitempty" xml:"mail_no,omitempty" require:"true"`
	// 快递公司编码
	CpCode *string `json:"cp_code,omitempty" xml:"cp_code,omitempty"`
	// 自定义标签，可为备注
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 收、寄件人电话号码
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 出发地城市
	FromCity *string `json:"from_city,omitempty" xml:"from_city,omitempty"`
	// 目的地城市
	ToCity *string `json:"to_city,omitempty" xml:"to_city,omitempty"`
	// {}
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s SubmitDrrdataSubscriptionRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDrrdataSubscriptionRequest) GoString() string {
	return s.String()
}

func (s *SubmitDrrdataSubscriptionRequest) SetAuthToken(v string) *SubmitDrrdataSubscriptionRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetBizType(v string) *SubmitDrrdataSubscriptionRequest {
	s.BizType = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetRequestId(v string) *SubmitDrrdataSubscriptionRequest {
	s.RequestId = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetMailNo(v string) *SubmitDrrdataSubscriptionRequest {
	s.MailNo = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetCpCode(v string) *SubmitDrrdataSubscriptionRequest {
	s.CpCode = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetTag(v string) *SubmitDrrdataSubscriptionRequest {
	s.Tag = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetPhone(v string) *SubmitDrrdataSubscriptionRequest {
	s.Phone = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetFromCity(v string) *SubmitDrrdataSubscriptionRequest {
	s.FromCity = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetToCity(v string) *SubmitDrrdataSubscriptionRequest {
	s.ToCity = &v
	return s
}

func (s *SubmitDrrdataSubscriptionRequest) SetBizContent(v string) *SubmitDrrdataSubscriptionRequest {
	s.BizContent = &v
	return s
}

type SubmitDrrdataSubscriptionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 返回业务参数
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s SubmitDrrdataSubscriptionResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDrrdataSubscriptionResponse) GoString() string {
	return s.String()
}

func (s *SubmitDrrdataSubscriptionResponse) SetReqMsgId(v string) *SubmitDrrdataSubscriptionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDrrdataSubscriptionResponse) SetResultCode(v string) *SubmitDrrdataSubscriptionResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDrrdataSubscriptionResponse) SetResultMsg(v string) *SubmitDrrdataSubscriptionResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitDrrdataSubscriptionResponse) SetStatus(v string) *SubmitDrrdataSubscriptionResponse {
	s.Status = &v
	return s
}

func (s *SubmitDrrdataSubscriptionResponse) SetBizResult(v string) *SubmitDrrdataSubscriptionResponse {
	s.BizResult = &v
	return s
}

type ReceiveDrrdataTrackRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 业务数据
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 运单
	MailNo *string `json:"mail_no,omitempty" xml:"mail_no,omitempty" require:"true"`
	// 快递公司编码
	CpCode *string `json:"cp_code,omitempty" xml:"cp_code,omitempty"`
	// 自定义标签
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
}

func (s ReceiveDrrdataTrackRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveDrrdataTrackRequest) GoString() string {
	return s.String()
}

func (s *ReceiveDrrdataTrackRequest) SetAuthToken(v string) *ReceiveDrrdataTrackRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetBizType(v string) *ReceiveDrrdataTrackRequest {
	s.BizType = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetBizContent(v string) *ReceiveDrrdataTrackRequest {
	s.BizContent = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetRequestId(v string) *ReceiveDrrdataTrackRequest {
	s.RequestId = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetMailNo(v string) *ReceiveDrrdataTrackRequest {
	s.MailNo = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetCpCode(v string) *ReceiveDrrdataTrackRequest {
	s.CpCode = &v
	return s
}

func (s *ReceiveDrrdataTrackRequest) SetTag(v string) *ReceiveDrrdataTrackRequest {
	s.Tag = &v
	return s
}

type ReceiveDrrdataTrackResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务结果数据
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ReceiveDrrdataTrackResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveDrrdataTrackResponse) GoString() string {
	return s.String()
}

func (s *ReceiveDrrdataTrackResponse) SetReqMsgId(v string) *ReceiveDrrdataTrackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveDrrdataTrackResponse) SetResultCode(v string) *ReceiveDrrdataTrackResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveDrrdataTrackResponse) SetResultMsg(v string) *ReceiveDrrdataTrackResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReceiveDrrdataTrackResponse) SetBizResult(v string) *ReceiveDrrdataTrackResponse {
	s.BizResult = &v
	return s
}

func (s *ReceiveDrrdataTrackResponse) SetStatus(v string) *ReceiveDrrdataTrackResponse {
	s.Status = &v
	return s
}

type QueryDatapromotionDecisionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 保司编码
	InsurerCode *string `json:"insurer_code,omitempty" xml:"insurer_code,omitempty" require:"true"`
	// 保险险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 业务参数内容JSON字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryDatapromotionDecisionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDatapromotionDecisionRequest) GoString() string {
	return s.String()
}

func (s *QueryDatapromotionDecisionRequest) SetAuthToken(v string) *QueryDatapromotionDecisionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDatapromotionDecisionRequest) SetInsurerCode(v string) *QueryDatapromotionDecisionRequest {
	s.InsurerCode = &v
	return s
}

func (s *QueryDatapromotionDecisionRequest) SetInsuranceType(v string) *QueryDatapromotionDecisionRequest {
	s.InsuranceType = &v
	return s
}

func (s *QueryDatapromotionDecisionRequest) SetBizContent(v string) *QueryDatapromotionDecisionRequest {
	s.BizContent = &v
	return s
}

type QueryDatapromotionDecisionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务出参JSON字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryDatapromotionDecisionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDatapromotionDecisionResponse) GoString() string {
	return s.String()
}

func (s *QueryDatapromotionDecisionResponse) SetReqMsgId(v string) *QueryDatapromotionDecisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDatapromotionDecisionResponse) SetResultCode(v string) *QueryDatapromotionDecisionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDatapromotionDecisionResponse) SetResultMsg(v string) *QueryDatapromotionDecisionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDatapromotionDecisionResponse) SetBizResult(v string) *QueryDatapromotionDecisionResponse {
	s.BizResult = &v
	return s
}

type PushDatapromotionTrafficRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 保险险种
	InsurerCode *string `json:"insurer_code,omitempty" xml:"insurer_code,omitempty" require:"true"`
	// 保险险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 业务参数内容JSON字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 协议签署：USER_SIGN_INFO;；
	// 车辆信息上报：CAR_INFO；
	PushDataType *string `json:"push_data_type,omitempty" xml:"push_data_type,omitempty" require:"true"`
}

func (s PushDatapromotionTrafficRequest) String() string {
	return tea.Prettify(s)
}

func (s PushDatapromotionTrafficRequest) GoString() string {
	return s.String()
}

func (s *PushDatapromotionTrafficRequest) SetAuthToken(v string) *PushDatapromotionTrafficRequest {
	s.AuthToken = &v
	return s
}

func (s *PushDatapromotionTrafficRequest) SetInsurerCode(v string) *PushDatapromotionTrafficRequest {
	s.InsurerCode = &v
	return s
}

func (s *PushDatapromotionTrafficRequest) SetInsuranceType(v string) *PushDatapromotionTrafficRequest {
	s.InsuranceType = &v
	return s
}

func (s *PushDatapromotionTrafficRequest) SetBizContent(v string) *PushDatapromotionTrafficRequest {
	s.BizContent = &v
	return s
}

func (s *PushDatapromotionTrafficRequest) SetPushDataType(v string) *PushDatapromotionTrafficRequest {
	s.PushDataType = &v
	return s
}

type PushDatapromotionTrafficResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s PushDatapromotionTrafficResponse) String() string {
	return tea.Prettify(s)
}

func (s PushDatapromotionTrafficResponse) GoString() string {
	return s.String()
}

func (s *PushDatapromotionTrafficResponse) SetReqMsgId(v string) *PushDatapromotionTrafficResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushDatapromotionTrafficResponse) SetResultCode(v string) *PushDatapromotionTrafficResponse {
	s.ResultCode = &v
	return s
}

func (s *PushDatapromotionTrafficResponse) SetResultMsg(v string) *PushDatapromotionTrafficResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushDatapromotionTrafficResponse) SetBizResult(v string) *PushDatapromotionTrafficResponse {
	s.BizResult = &v
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
				"sdk_version":      tea.String("1.2.16"),
				"_prod_code":       tea.String("BXPT_NEW"),
				"_prod_channel":    tea.String("default"),
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
 * Description: 保险数据产品服务调用
 * Summary: 保险数据产品服务调用
 */
func (client *Client) ExecDataproduct(request *ExecDataproductRequest) (_result *ExecDataproductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecDataproductResponse{}
	_body, _err := client.ExecDataproductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务调用
 * Summary: 保险数据产品服务调用
 */
func (client *Client) ExecDataproductEx(request *ExecDataproductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecDataproductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecDataproductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步调用
 * Summary: 保险数据产品服务异步调用
 */
func (client *Client) ExecDataproductAsync(request *ExecDataproductAsyncRequest) (_result *ExecDataproductAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecDataproductAsyncResponse{}
	_body, _err := client.ExecDataproductAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步调用
 * Summary: 保险数据产品服务异步调用
 */
func (client *Client) ExecDataproductAsyncEx(request *ExecDataproductAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecDataproductAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecDataproductAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.async.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步结果查询
 * Summary: 保险数据产品服务异步结果查询
 */
func (client *Client) QueryDataproductAsync(request *QueryDataproductAsyncRequest) (_result *QueryDataproductAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataproductAsyncResponse{}
	_body, _err := client.QueryDataproductAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步结果查询
 * Summary: 保险数据产品服务异步结果查询
 */
func (client *Client) QueryDataproductAsyncEx(request *QueryDataproductAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataproductAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataproductAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.async.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退运险物理轨迹订阅提交
 * Summary: 退运险物理轨迹订阅提交
 */
func (client *Client) SubmitDrrdataSubscription(request *SubmitDrrdataSubscriptionRequest) (_result *SubmitDrrdataSubscriptionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDrrdataSubscriptionResponse{}
	_body, _err := client.SubmitDrrdataSubscriptionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退运险物理轨迹订阅提交
 * Summary: 退运险物理轨迹订阅提交
 */
func (client *Client) SubmitDrrdataSubscriptionEx(request *SubmitDrrdataSubscriptionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDrrdataSubscriptionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDrrdataSubscriptionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.drrdata.subscription.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退运险物理轨迹数据接收
 * Summary: 退运险物理轨迹数据接收
 */
func (client *Client) ReceiveDrrdataTrack(request *ReceiveDrrdataTrackRequest) (_result *ReceiveDrrdataTrackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveDrrdataTrackResponse{}
	_body, _err := client.ReceiveDrrdataTrackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退运险物理轨迹数据接收
 * Summary: 退运险物理轨迹数据接收
 */
func (client *Client) ReceiveDrrdataTrackEx(request *ReceiveDrrdataTrackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveDrrdataTrackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveDrrdataTrackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.drrdata.track.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据营销决策查询
 * Summary: 保险数据营销决策查询
 */
func (client *Client) QueryDatapromotionDecision(request *QueryDatapromotionDecisionRequest) (_result *QueryDatapromotionDecisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDatapromotionDecisionResponse{}
	_body, _err := client.QueryDatapromotionDecisionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据营销决策查询
 * Summary: 保险数据营销决策查询
 */
func (client *Client) QueryDatapromotionDecisionEx(request *QueryDatapromotionDecisionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDatapromotionDecisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDatapromotionDecisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.datapromotion.decision.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据营销流量推送
 * Summary: 保险数据营销流量推送
 */
func (client *Client) PushDatapromotionTraffic(request *PushDatapromotionTrafficRequest) (_result *PushDatapromotionTrafficResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushDatapromotionTrafficResponse{}
	_body, _err := client.PushDatapromotionTrafficEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据营销流量推送
 * Summary: 保险数据营销流量推送
 */
func (client *Client) PushDatapromotionTrafficEx(request *PushDatapromotionTrafficRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushDatapromotionTrafficResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushDatapromotionTrafficResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.datapromotion.traffic.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
