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

type ConvertAdDataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 广告主id
	AccountId *int64 `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// ios/android
	DeviceOsType *string `json:"device_os_type,omitempty" xml:"device_os_type,omitempty"`
	// 设备ID（imei或idfa的加密值）
	Muid *string `json:"muid,omitempty" xml:"muid,omitempty"`
	// 点击ID
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty" require:"true"`
	// 点击时间
	ClickTime *int64 `json:"click_time,omitempty" xml:"click_time,omitempty"`
	// 曝光时间
	ImpressionTime *int64 `json:"impression_time,omitempty" xml:"impression_time,omitempty"`
	// 手机号MD5
	MobileMd5 *string `json:"mobile_md5,omitempty" xml:"mobile_md5,omitempty"`
	// 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty"`
	// 事件类型，枚举值如下：
	// submit-提交表单
	// pay-付费
	// renewal-续费
	// m2_renewal-m2续期
	// surrender-退保
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 转化事件时间
	EventTime *int64 `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true"`
	// 设备oaid
	Oaid *string `json:"oaid,omitempty" xml:"oaid,omitempty"`
	// oaid_md5
	OaidMd5 *string `json:"oaid_md5,omitempty" xml:"oaid_md5,omitempty"`
	// caid
	Caid *string `json:"caid,omitempty" xml:"caid,omitempty"`
	// caid_md5
	CaidMd5 *string `json:"caid_md5,omitempty" xml:"caid_md5,omitempty"`
	// android_id
	AndroidId *string `json:"android_id,omitempty" xml:"android_id,omitempty"`
	// imei
	Imei *string `json:"imei,omitempty" xml:"imei,omitempty"`
	// imei_md5
	ImeiMd5 *string `json:"imei_md5,omitempty" xml:"imei_md5,omitempty"`
	// idfa
	Idfa *string `json:"idfa,omitempty" xml:"idfa,omitempty"`
	// idfa_md5
	IdfaMd5 *string `json:"idfa_md5,omitempty" xml:"idfa_md5,omitempty"`
	// 首次支付保费(蚂蚁数科定义)，用户首次支付保险的费用。单位元
	FirstPayAmount *string `json:"first_pay_amount,omitempty" xml:"first_pay_amount,omitempty"`
	// 升级支付保费(蚂蚁数科定义)，用户支付后进行保险升级的支付费用。单位元
	UpgradePayAmount *string `json:"upgrade_pay_amount,omitempty" xml:"upgrade_pay_amount,omitempty"`
	// 续费保费(蚂蚁数科定义)，用户M2进行保险续费的费用。
	UpgradeRenewvalAmount *string `json:"upgrade_renewval_amount,omitempty" xml:"upgrade_renewval_amount,omitempty"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 用户的借款金额
	LoanAmount *string `json:"loan_amount,omitempty" xml:"loan_amount,omitempty"`
	// 扩展json
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s ConvertAdDataRequest) String() string {
	return tea.Prettify(s)
}

func (s ConvertAdDataRequest) GoString() string {
	return s.String()
}

func (s *ConvertAdDataRequest) SetAuthToken(v string) *ConvertAdDataRequest {
	s.AuthToken = &v
	return s
}

func (s *ConvertAdDataRequest) SetAccountId(v int64) *ConvertAdDataRequest {
	s.AccountId = &v
	return s
}

func (s *ConvertAdDataRequest) SetDeviceOsType(v string) *ConvertAdDataRequest {
	s.DeviceOsType = &v
	return s
}

func (s *ConvertAdDataRequest) SetMuid(v string) *ConvertAdDataRequest {
	s.Muid = &v
	return s
}

func (s *ConvertAdDataRequest) SetClickId(v string) *ConvertAdDataRequest {
	s.ClickId = &v
	return s
}

func (s *ConvertAdDataRequest) SetClickTime(v int64) *ConvertAdDataRequest {
	s.ClickTime = &v
	return s
}

func (s *ConvertAdDataRequest) SetImpressionTime(v int64) *ConvertAdDataRequest {
	s.ImpressionTime = &v
	return s
}

func (s *ConvertAdDataRequest) SetMobileMd5(v string) *ConvertAdDataRequest {
	s.MobileMd5 = &v
	return s
}

func (s *ConvertAdDataRequest) SetPlatform(v string) *ConvertAdDataRequest {
	s.Platform = &v
	return s
}

func (s *ConvertAdDataRequest) SetEventCode(v string) *ConvertAdDataRequest {
	s.EventCode = &v
	return s
}

func (s *ConvertAdDataRequest) SetEventTime(v int64) *ConvertAdDataRequest {
	s.EventTime = &v
	return s
}

func (s *ConvertAdDataRequest) SetOaid(v string) *ConvertAdDataRequest {
	s.Oaid = &v
	return s
}

func (s *ConvertAdDataRequest) SetOaidMd5(v string) *ConvertAdDataRequest {
	s.OaidMd5 = &v
	return s
}

func (s *ConvertAdDataRequest) SetCaid(v string) *ConvertAdDataRequest {
	s.Caid = &v
	return s
}

func (s *ConvertAdDataRequest) SetCaidMd5(v string) *ConvertAdDataRequest {
	s.CaidMd5 = &v
	return s
}

func (s *ConvertAdDataRequest) SetAndroidId(v string) *ConvertAdDataRequest {
	s.AndroidId = &v
	return s
}

func (s *ConvertAdDataRequest) SetImei(v string) *ConvertAdDataRequest {
	s.Imei = &v
	return s
}

func (s *ConvertAdDataRequest) SetImeiMd5(v string) *ConvertAdDataRequest {
	s.ImeiMd5 = &v
	return s
}

func (s *ConvertAdDataRequest) SetIdfa(v string) *ConvertAdDataRequest {
	s.Idfa = &v
	return s
}

func (s *ConvertAdDataRequest) SetIdfaMd5(v string) *ConvertAdDataRequest {
	s.IdfaMd5 = &v
	return s
}

func (s *ConvertAdDataRequest) SetFirstPayAmount(v string) *ConvertAdDataRequest {
	s.FirstPayAmount = &v
	return s
}

func (s *ConvertAdDataRequest) SetUpgradePayAmount(v string) *ConvertAdDataRequest {
	s.UpgradePayAmount = &v
	return s
}

func (s *ConvertAdDataRequest) SetUpgradeRenewvalAmount(v string) *ConvertAdDataRequest {
	s.UpgradeRenewvalAmount = &v
	return s
}

func (s *ConvertAdDataRequest) SetIndustry(v string) *ConvertAdDataRequest {
	s.Industry = &v
	return s
}

func (s *ConvertAdDataRequest) SetLoanAmount(v string) *ConvertAdDataRequest {
	s.LoanAmount = &v
	return s
}

func (s *ConvertAdDataRequest) SetExt(v string) *ConvertAdDataRequest {
	s.Ext = &v
	return s
}

type ConvertAdDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ConvertAdDataResponse) String() string {
	return tea.Prettify(s)
}

func (s ConvertAdDataResponse) GoString() string {
	return s.String()
}

func (s *ConvertAdDataResponse) SetReqMsgId(v string) *ConvertAdDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConvertAdDataResponse) SetResultCode(v string) *ConvertAdDataResponse {
	s.ResultCode = &v
	return s
}

func (s *ConvertAdDataResponse) SetResultMsg(v string) *ConvertAdDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConvertAdDataResponse) SetSuccess(v bool) *ConvertAdDataResponse {
	s.Success = &v
	return s
}

type ClickAdDataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 广告主id
	AccountId *int64 `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 渠道，支持TENCENT
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 曝光/点击明细json string,曝光数据{\"impression_id\":\"dfhufhuifah\",\"impression_time\":1586437361}
	// 点击数据{\"click_id\":\"dfhufaffhuifah\,"\"click_time\":1586437361}
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 点击-CLICK，曝光-IMPRESSION
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
}

func (s ClickAdDataRequest) String() string {
	return tea.Prettify(s)
}

func (s ClickAdDataRequest) GoString() string {
	return s.String()
}

func (s *ClickAdDataRequest) SetAuthToken(v string) *ClickAdDataRequest {
	s.AuthToken = &v
	return s
}

func (s *ClickAdDataRequest) SetAccountId(v int64) *ClickAdDataRequest {
	s.AccountId = &v
	return s
}

func (s *ClickAdDataRequest) SetChannel(v string) *ClickAdDataRequest {
	s.Channel = &v
	return s
}

func (s *ClickAdDataRequest) SetData(v string) *ClickAdDataRequest {
	s.Data = &v
	return s
}

func (s *ClickAdDataRequest) SetDataType(v string) *ClickAdDataRequest {
	s.DataType = &v
	return s
}

type ClickAdDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ClickAdDataResponse) String() string {
	return tea.Prettify(s)
}

func (s ClickAdDataResponse) GoString() string {
	return s.String()
}

func (s *ClickAdDataResponse) SetReqMsgId(v string) *ClickAdDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ClickAdDataResponse) SetResultCode(v string) *ClickAdDataResponse {
	s.ResultCode = &v
	return s
}

func (s *ClickAdDataResponse) SetResultMsg(v string) *ClickAdDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *ClickAdDataResponse) SetSuccess(v bool) *ClickAdDataResponse {
	s.Success = &v
	return s
}

type ReportAdDataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 广告主账号Id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 报表级别level
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 回传数据，json array
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s ReportAdDataRequest) String() string {
	return tea.Prettify(s)
}

func (s ReportAdDataRequest) GoString() string {
	return s.String()
}

func (s *ReportAdDataRequest) SetAuthToken(v string) *ReportAdDataRequest {
	s.AuthToken = &v
	return s
}

func (s *ReportAdDataRequest) SetAccountId(v string) *ReportAdDataRequest {
	s.AccountId = &v
	return s
}

func (s *ReportAdDataRequest) SetLevel(v string) *ReportAdDataRequest {
	s.Level = &v
	return s
}

func (s *ReportAdDataRequest) SetData(v string) *ReportAdDataRequest {
	s.Data = &v
	return s
}

type ReportAdDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ReportAdDataResponse) String() string {
	return tea.Prettify(s)
}

func (s ReportAdDataResponse) GoString() string {
	return s.String()
}

func (s *ReportAdDataResponse) SetReqMsgId(v string) *ReportAdDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReportAdDataResponse) SetResultCode(v string) *ReportAdDataResponse {
	s.ResultCode = &v
	return s
}

func (s *ReportAdDataResponse) SetResultMsg(v string) *ReportAdDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReportAdDataResponse) SetSuccess(v bool) *ReportAdDataResponse {
	s.Success = &v
	return s
}

type FeedbackReportDataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 广告主账号ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 报表类型级别
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
	// 回传数据明细，类型json array
	FeedbackData *string `json:"feedback_data,omitempty" xml:"feedback_data,omitempty" require:"true"`
}

func (s FeedbackReportDataRequest) String() string {
	return tea.Prettify(s)
}

func (s FeedbackReportDataRequest) GoString() string {
	return s.String()
}

func (s *FeedbackReportDataRequest) SetAuthToken(v string) *FeedbackReportDataRequest {
	s.AuthToken = &v
	return s
}

func (s *FeedbackReportDataRequest) SetAccountId(v string) *FeedbackReportDataRequest {
	s.AccountId = &v
	return s
}

func (s *FeedbackReportDataRequest) SetLevel(v string) *FeedbackReportDataRequest {
	s.Level = &v
	return s
}

func (s *FeedbackReportDataRequest) SetFeedbackData(v string) *FeedbackReportDataRequest {
	s.FeedbackData = &v
	return s
}

type FeedbackReportDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s FeedbackReportDataResponse) String() string {
	return tea.Prettify(s)
}

func (s FeedbackReportDataResponse) GoString() string {
	return s.String()
}

func (s *FeedbackReportDataResponse) SetReqMsgId(v string) *FeedbackReportDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FeedbackReportDataResponse) SetResultCode(v string) *FeedbackReportDataResponse {
	s.ResultCode = &v
	return s
}

func (s *FeedbackReportDataResponse) SetResultMsg(v string) *FeedbackReportDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *FeedbackReportDataResponse) SetSuccess(v bool) *FeedbackReportDataResponse {
	s.Success = &v
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
				"sdk_version":      tea.String("3.0.4"),
				"_prod_code":       tea.String("MORSERTA"),
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
 * Description: 转化数据回传接口
 * Summary: 转化数据回传接口
 */
func (client *Client) ConvertAdData(request *ConvertAdDataRequest) (_result *ConvertAdDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConvertAdDataResponse{}
	_body, _err := client.ConvertAdDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 转化数据回传接口
 * Summary: 转化数据回传接口
 */
func (client *Client) ConvertAdDataEx(request *ConvertAdDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConvertAdDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConvertAdDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.morserta.ad.data.convert"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 曝光/点击数据回传接口
 * Summary: 曝光/点击数据回传接口
 */
func (client *Client) ClickAdData(request *ClickAdDataRequest) (_result *ClickAdDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ClickAdDataResponse{}
	_body, _err := client.ClickAdDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 曝光/点击数据回传接口
 * Summary: 曝光/点击数据回传接口
 */
func (client *Client) ClickAdDataEx(request *ClickAdDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ClickAdDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ClickAdDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.morserta.ad.data.click"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 广告汇总数据
 * Summary: 广告汇总数据
 */
func (client *Client) ReportAdData(request *ReportAdDataRequest) (_result *ReportAdDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReportAdDataResponse{}
	_body, _err := client.ReportAdDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 广告汇总数据
 * Summary: 广告汇总数据
 */
func (client *Client) ReportAdDataEx(request *ReportAdDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReportAdDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReportAdDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.morserta.ad.data.report"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: RTA广告主数据回传
 * Summary: RTA广告主数据回传
 */
func (client *Client) FeedbackReportData(request *FeedbackReportDataRequest) (_result *FeedbackReportDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FeedbackReportDataResponse{}
	_body, _err := client.FeedbackReportDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: RTA广告主数据回传
 * Summary: RTA广告主数据回传
 */
func (client *Client) FeedbackReportDataEx(request *FeedbackReportDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FeedbackReportDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FeedbackReportDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.morserta.report.data.feedback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
