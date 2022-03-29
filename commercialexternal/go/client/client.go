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

// 已售规格实例详细信息(用于开发商查询)
type SoldSpecInstance struct {
	// 规格码
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 规格实例id
	SpecInstanceId *string `json:"spec_instance_id,omitempty" xml:"spec_instance_id,omitempty" require:"true"`
	// 规格实例运行状态.
	// STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 实例生效时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实例计划停服时间
	PlanStopTime *string `json:"plan_stop_time,omitempty" xml:"plan_stop_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实例实际停服时间
	ActualStopTime *string `json:"actual_stop_time,omitempty" xml:"actual_stop_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 购买规格实例的商户id(商业中台用来唯一标识商户的id)
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 购买数量
	Num *int64 `json:"num,omitempty" xml:"num,omitempty" require:"true"`
	// 商品规格售卖类型：按量付费（POST）、资源包（BAG）、包年包月（PRE）
	SpecType *string `json:"spec_type,omitempty" xml:"spec_type,omitempty" require:"true"`
	// 资源（包）code
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty" maxLength:"128"`
	// 其他上下文信息，kv结构，本先新增，后面有新新增可以放在这里面，不用再升级接口
	Context *string `json:"context,omitempty" xml:"context,omitempty" maxLength:"2048"`
}

func (s SoldSpecInstance) String() string {
	return tea.Prettify(s)
}

func (s SoldSpecInstance) GoString() string {
	return s.String()
}

func (s *SoldSpecInstance) SetSpecCode(v string) *SoldSpecInstance {
	s.SpecCode = &v
	return s
}

func (s *SoldSpecInstance) SetSpecInstanceId(v string) *SoldSpecInstance {
	s.SpecInstanceId = &v
	return s
}

func (s *SoldSpecInstance) SetStatus(v string) *SoldSpecInstance {
	s.Status = &v
	return s
}

func (s *SoldSpecInstance) SetStartTime(v string) *SoldSpecInstance {
	s.StartTime = &v
	return s
}

func (s *SoldSpecInstance) SetPlanStopTime(v string) *SoldSpecInstance {
	s.PlanStopTime = &v
	return s
}

func (s *SoldSpecInstance) SetActualStopTime(v string) *SoldSpecInstance {
	s.ActualStopTime = &v
	return s
}

func (s *SoldSpecInstance) SetMerchantId(v string) *SoldSpecInstance {
	s.MerchantId = &v
	return s
}

func (s *SoldSpecInstance) SetNum(v int64) *SoldSpecInstance {
	s.Num = &v
	return s
}

func (s *SoldSpecInstance) SetSpecType(v string) *SoldSpecInstance {
	s.SpecType = &v
	return s
}

func (s *SoldSpecInstance) SetResCode(v string) *SoldSpecInstance {
	s.ResCode = &v
	return s
}

func (s *SoldSpecInstance) SetContext(v string) *SoldSpecInstance {
	s.Context = &v
	return s
}

type PushMeterPeriodicusageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 计量域编码
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 规格编码
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	//
	// 资源编码
	ResourceCode *string `json:"resource_code,omitempty" xml:"resource_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 规格实例id
	SpecInstanceId *string `json:"spec_instance_id,omitempty" xml:"spec_instance_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 计量数据，json string格式字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
	GmtMeterBegin *string `json:"gmt_meter_begin,omitempty" xml:"gmt_meter_begin,omitempty" require:"true"`
	// 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
	GmtMeterEnd *string `json:"gmt_meter_end,omitempty" xml:"gmt_meter_end,omitempty" require:"true"`
}

func (s PushMeterPeriodicusageRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMeterPeriodicusageRequest) GoString() string {
	return s.String()
}

func (s *PushMeterPeriodicusageRequest) SetAuthToken(v string) *PushMeterPeriodicusageRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetDomainCode(v string) *PushMeterPeriodicusageRequest {
	s.DomainCode = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetSpecCode(v string) *PushMeterPeriodicusageRequest {
	s.SpecCode = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetResourceCode(v string) *PushMeterPeriodicusageRequest {
	s.ResourceCode = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetSpecInstanceId(v string) *PushMeterPeriodicusageRequest {
	s.SpecInstanceId = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetData(v string) *PushMeterPeriodicusageRequest {
	s.Data = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetGmtMeterBegin(v string) *PushMeterPeriodicusageRequest {
	s.GmtMeterBegin = &v
	return s
}

func (s *PushMeterPeriodicusageRequest) SetGmtMeterEnd(v string) *PushMeterPeriodicusageRequest {
	s.GmtMeterEnd = &v
	return s
}

type PushMeterPeriodicusageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushMeterPeriodicusageResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMeterPeriodicusageResponse) GoString() string {
	return s.String()
}

func (s *PushMeterPeriodicusageResponse) SetReqMsgId(v string) *PushMeterPeriodicusageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMeterPeriodicusageResponse) SetResultCode(v string) *PushMeterPeriodicusageResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMeterPeriodicusageResponse) SetResultMsg(v string) *PushMeterPeriodicusageResponse {
	s.ResultMsg = &v
	return s
}

type PushMeterRealtimeusageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，防重用
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 计量域编码
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 规格编码
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 资源编码
	ResourceCode *string `json:"resource_code,omitempty" xml:"resource_code,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 规格实例id
	SpecInstanceId *string `json:"spec_instance_id,omitempty" xml:"spec_instance_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 计量数据，json string格式字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 计量数据发生时间
	GmtMeter *string `json:"gmt_meter,omitempty" xml:"gmt_meter,omitempty" require:"true"`
}

func (s PushMeterRealtimeusageRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMeterRealtimeusageRequest) GoString() string {
	return s.String()
}

func (s *PushMeterRealtimeusageRequest) SetAuthToken(v string) *PushMeterRealtimeusageRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetRequestId(v string) *PushMeterRealtimeusageRequest {
	s.RequestId = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetDomainCode(v string) *PushMeterRealtimeusageRequest {
	s.DomainCode = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetSpecCode(v string) *PushMeterRealtimeusageRequest {
	s.SpecCode = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetResourceCode(v string) *PushMeterRealtimeusageRequest {
	s.ResourceCode = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetSpecInstanceId(v string) *PushMeterRealtimeusageRequest {
	s.SpecInstanceId = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetData(v string) *PushMeterRealtimeusageRequest {
	s.Data = &v
	return s
}

func (s *PushMeterRealtimeusageRequest) SetGmtMeter(v string) *PushMeterRealtimeusageRequest {
	s.GmtMeter = &v
	return s
}

type PushMeterRealtimeusageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushMeterRealtimeusageResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMeterRealtimeusageResponse) GoString() string {
	return s.String()
}

func (s *PushMeterRealtimeusageResponse) SetReqMsgId(v string) *PushMeterRealtimeusageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMeterRealtimeusageResponse) SetResultCode(v string) *PushMeterRealtimeusageResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMeterRealtimeusageResponse) SetResultMsg(v string) *PushMeterRealtimeusageResponse {
	s.ResultMsg = &v
	return s
}

type QueryTradecoreMerchantinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业中台唯一标识商户的id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
}

func (s QueryTradecoreMerchantinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreMerchantinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTradecoreMerchantinfoRequest) SetAuthToken(v string) *QueryTradecoreMerchantinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradecoreMerchantinfoRequest) SetMerchantId(v string) *QueryTradecoreMerchantinfoRequest {
	s.MerchantId = &v
	return s
}

type QueryTradecoreMerchantinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
}

func (s QueryTradecoreMerchantinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradecoreMerchantinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTradecoreMerchantinfoResponse) SetReqMsgId(v string) *QueryTradecoreMerchantinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetResultCode(v string) *QueryTradecoreMerchantinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetResultMsg(v string) *QueryTradecoreMerchantinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradecoreMerchantinfoResponse) SetMerchantName(v string) *QueryTradecoreMerchantinfoResponse {
	s.MerchantName = &v
	return s
}

type BatchqueryTradecoreSoldspecinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业中台用来唯一标记商户的id merchant_id 与 merchant_login_main_id至少填一个
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// 商户(买家)登录主账号user_id， merchant_id 与 merchant_login_main_id至少填一个
	MerchantLoginMainId *string `json:"merchant_login_main_id,omitempty" xml:"merchant_login_main_id,omitempty"`
}

func (s BatchqueryTradecoreSoldspecinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecoreSoldspecinstanceRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetAuthToken(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetMerchantId(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.MerchantId = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceRequest) SetMerchantLoginMainId(v string) *BatchqueryTradecoreSoldspecinstanceRequest {
	s.MerchantLoginMainId = &v
	return s
}

type BatchqueryTradecoreSoldspecinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 某开发商已售给某商户的所有规格实例信息
	SoldSpecInstances []*SoldSpecInstance `json:"sold_spec_instances,omitempty" xml:"sold_spec_instances,omitempty" type:"Repeated"`
}

func (s BatchqueryTradecoreSoldspecinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryTradecoreSoldspecinstanceResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetReqMsgId(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetResultCode(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetResultMsg(v string) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryTradecoreSoldspecinstanceResponse) SetSoldSpecInstances(v []*SoldSpecInstance) *BatchqueryTradecoreSoldspecinstanceResponse {
	s.SoldSpecInstances = v
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
 * Description:
计量数据周期推送
 * Summary:  计量数据周期推送
*/
func (client *Client) PushMeterPeriodicusage(request *PushMeterPeriodicusageRequest) (_result *PushMeterPeriodicusageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMeterPeriodicusageResponse{}
	_body, _err := client.PushMeterPeriodicusageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
计量数据周期推送
 * Summary:  计量数据周期推送
*/
func (client *Client) PushMeterPeriodicusageEx(request *PushMeterPeriodicusageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMeterPeriodicusageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMeterPeriodicusageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercialexternal.meter.periodicusage.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实时用量推送，每调用一次推送一次
 * Summary: 实时用量推送，每调用一次推送一次
 */
func (client *Client) PushMeterRealtimeusage(request *PushMeterRealtimeusageRequest) (_result *PushMeterRealtimeusageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMeterRealtimeusageResponse{}
	_body, _err := client.PushMeterRealtimeusageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实时用量推送，每调用一次推送一次
 * Summary: 实时用量推送，每调用一次推送一次
 */
func (client *Client) PushMeterRealtimeusageEx(request *PushMeterRealtimeusageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMeterRealtimeusageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMeterRealtimeusageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercialexternal.meter.realtimeusage.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
 * Summary: 获取商户信息-开发商用
 */
func (client *Client) QueryTradecoreMerchantinfo(request *QueryTradecoreMerchantinfoRequest) (_result *QueryTradecoreMerchantinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradecoreMerchantinfoResponse{}
	_body, _err := client.QueryTradecoreMerchantinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
 * Summary: 获取商户信息-开发商用
 */
func (client *Client) QueryTradecoreMerchantinfoEx(request *QueryTradecoreMerchantinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradecoreMerchantinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradecoreMerchantinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercialexternal.tradecore.merchantinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
 * Summary: 获取已售给商户的规格实例信息-开发商用
 */
func (client *Client) BatchqueryTradecoreSoldspecinstance(request *BatchqueryTradecoreSoldspecinstanceRequest) (_result *BatchqueryTradecoreSoldspecinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryTradecoreSoldspecinstanceResponse{}
	_body, _err := client.BatchqueryTradecoreSoldspecinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
 * Summary: 获取已售给商户的规格实例信息-开发商用
 */
func (client *Client) BatchqueryTradecoreSoldspecinstanceEx(request *BatchqueryTradecoreSoldspecinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryTradecoreSoldspecinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryTradecoreSoldspecinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.commercialexternal.tradecore.soldspecinstance.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
