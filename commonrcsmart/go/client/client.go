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

// 审核结果详情
type ContentRiskDetailVO struct {
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险提示
	Notice *string `json:"notice,omitempty" xml:"notice,omitempty"`
	// 命中词
	ViolaWords *string `json:"viola_words,omitempty" xml:"viola_words,omitempty"`
}

func (s ContentRiskDetailVO) String() string {
	return tea.Prettify(s)
}

func (s ContentRiskDetailVO) GoString() string {
	return s.String()
}

func (s *ContentRiskDetailVO) SetRiskLevel(v string) *ContentRiskDetailVO {
	s.RiskLevel = &v
	return s
}

func (s *ContentRiskDetailVO) SetNotice(v string) *ContentRiskDetailVO {
	s.Notice = &v
	return s
}

func (s *ContentRiskDetailVO) SetViolaWords(v string) *ContentRiskDetailVO {
	s.ViolaWords = &v
	return s
}

// 审核文本内容
type TextDataVO struct {
	// 审核文本内容
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
}

func (s TextDataVO) String() string {
	return tea.Prettify(s)
}

func (s TextDataVO) GoString() string {
	return s.String()
}

func (s *TextDataVO) SetText(v string) *TextDataVO {
	s.Text = &v
	return s
}

// 通用版图片审核结果
type ImageApprovalResultVO struct {
	// 机审结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 图片审核结果的url
	ResultUrl *string `json:"result_url,omitempty" xml:"result_url,omitempty"`
	// 审核结果详情
	RiskDetailVoList []*ContentRiskDetailVO `json:"risk_detail_vo_list,omitempty" xml:"risk_detail_vo_list,omitempty" type:"Repeated"`
}

func (s ImageApprovalResultVO) String() string {
	return tea.Prettify(s)
}

func (s ImageApprovalResultVO) GoString() string {
	return s.String()
}

func (s *ImageApprovalResultVO) SetResult(v string) *ImageApprovalResultVO {
	s.Result = &v
	return s
}

func (s *ImageApprovalResultVO) SetResultUrl(v string) *ImageApprovalResultVO {
	s.ResultUrl = &v
	return s
}

func (s *ImageApprovalResultVO) SetRiskDetailVoList(v []*ContentRiskDetailVO) *ImageApprovalResultVO {
	s.RiskDetailVoList = v
	return s
}

// 图片、音频、视频、文件信息
type DataVo struct {
	// 文件审核地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
}

func (s DataVo) String() string {
	return tea.Prettify(s)
}

func (s DataVo) GoString() string {
	return s.String()
}

func (s *DataVo) SetUrl(v string) *DataVo {
	s.Url = &v
	return s
}

func (s *DataVo) SetFileType(v string) *DataVo {
	s.FileType = &v
	return s
}

// 审核结果基类
type RcSmartResponse struct {
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回码描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// 业务处理结果码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 返回的提示信息
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 可否重试
	Retry *bool `json:"retry,omitempty" xml:"retry,omitempty"`
}

func (s RcSmartResponse) String() string {
	return tea.Prettify(s)
}

func (s RcSmartResponse) GoString() string {
	return s.String()
}

func (s *RcSmartResponse) SetCode(v string) *RcSmartResponse {
	s.Code = &v
	return s
}

func (s *RcSmartResponse) SetMsg(v string) *RcSmartResponse {
	s.Msg = &v
	return s
}

func (s *RcSmartResponse) SetSubCode(v string) *RcSmartResponse {
	s.SubCode = &v
	return s
}

func (s *RcSmartResponse) SetSubMsg(v string) *RcSmartResponse {
	s.SubMsg = &v
	return s
}

func (s *RcSmartResponse) SetRetry(v bool) *RcSmartResponse {
	s.Retry = &v
	return s
}

// 通用版文本审核结果
type MessageApprovalResultVO struct {
	// 机审结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 审核结果详情
	RiskDetailVoList []*ContentRiskDetailVO `json:"risk_detail_vo_list,omitempty" xml:"risk_detail_vo_list,omitempty" require:"true" type:"Repeated"`
}

func (s MessageApprovalResultVO) String() string {
	return tea.Prettify(s)
}

func (s MessageApprovalResultVO) GoString() string {
	return s.String()
}

func (s *MessageApprovalResultVO) SetResult(v string) *MessageApprovalResultVO {
	s.Result = &v
	return s
}

func (s *MessageApprovalResultVO) SetRiskDetailVoList(v []*ContentRiskDetailVO) *MessageApprovalResultVO {
	s.RiskDetailVoList = v
	return s
}

type ConfirmRcApprovalMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 审核场景列表
	Scenes []*string `json:"scenes,omitempty" xml:"scenes,omitempty" require:"true" type:"Repeated"`
	// 审核文本内容
	TextData *TextDataVO `json:"text_data,omitempty" xml:"text_data,omitempty" require:"true"`
	// 登录账号，默认使用主账号
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
}

func (s ConfirmRcApprovalMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcApprovalMessageRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRcApprovalMessageRequest) SetAuthToken(v string) *ConfirmRcApprovalMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRcApprovalMessageRequest) SetProductInstanceId(v string) *ConfirmRcApprovalMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmRcApprovalMessageRequest) SetRequestId(v string) *ConfirmRcApprovalMessageRequest {
	s.RequestId = &v
	return s
}

func (s *ConfirmRcApprovalMessageRequest) SetScenes(v []*string) *ConfirmRcApprovalMessageRequest {
	s.Scenes = v
	return s
}

func (s *ConfirmRcApprovalMessageRequest) SetTextData(v *TextDataVO) *ConfirmRcApprovalMessageRequest {
	s.TextData = v
	return s
}

func (s *ConfirmRcApprovalMessageRequest) SetLoginName(v string) *ConfirmRcApprovalMessageRequest {
	s.LoginName = &v
	return s
}

type ConfirmRcApprovalMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审核结果基类
	RcSmartResponse *RcSmartResponse `json:"rc_smart_response,omitempty" xml:"rc_smart_response,omitempty"`
}

func (s ConfirmRcApprovalMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcApprovalMessageResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRcApprovalMessageResponse) SetReqMsgId(v string) *ConfirmRcApprovalMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRcApprovalMessageResponse) SetResultCode(v string) *ConfirmRcApprovalMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRcApprovalMessageResponse) SetResultMsg(v string) *ConfirmRcApprovalMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmRcApprovalMessageResponse) SetRcSmartResponse(v *RcSmartResponse) *ConfirmRcApprovalMessageResponse {
	s.RcSmartResponse = v
	return s
}

type QueryRcApprovalMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原审核请求ID
	OrigRequestId *string `json:"orig_request_id,omitempty" xml:"orig_request_id,omitempty" require:"true"`
}

func (s QueryRcApprovalMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRcApprovalMessageRequest) GoString() string {
	return s.String()
}

func (s *QueryRcApprovalMessageRequest) SetAuthToken(v string) *QueryRcApprovalMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRcApprovalMessageRequest) SetProductInstanceId(v string) *QueryRcApprovalMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRcApprovalMessageRequest) SetOrigRequestId(v string) *QueryRcApprovalMessageRequest {
	s.OrigRequestId = &v
	return s
}

type QueryRcApprovalMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审核结果基类
	RcSmartResponse *RcSmartResponse `json:"rc_smart_response,omitempty" xml:"rc_smart_response,omitempty"`
	// 通用版文本审核结果
	ResultVo *MessageApprovalResultVO `json:"result_vo,omitempty" xml:"result_vo,omitempty"`
	// 审核结果页
	PageUrl *string `json:"page_url,omitempty" xml:"page_url,omitempty"`
}

func (s QueryRcApprovalMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRcApprovalMessageResponse) GoString() string {
	return s.String()
}

func (s *QueryRcApprovalMessageResponse) SetReqMsgId(v string) *QueryRcApprovalMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRcApprovalMessageResponse) SetResultCode(v string) *QueryRcApprovalMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRcApprovalMessageResponse) SetResultMsg(v string) *QueryRcApprovalMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRcApprovalMessageResponse) SetRcSmartResponse(v *RcSmartResponse) *QueryRcApprovalMessageResponse {
	s.RcSmartResponse = v
	return s
}

func (s *QueryRcApprovalMessageResponse) SetResultVo(v *MessageApprovalResultVO) *QueryRcApprovalMessageResponse {
	s.ResultVo = v
	return s
}

func (s *QueryRcApprovalMessageResponse) SetPageUrl(v string) *QueryRcApprovalMessageResponse {
	s.PageUrl = &v
	return s
}

type ConfirmRcApprovalImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 审核场景列表
	Scenes []*string `json:"scenes,omitempty" xml:"scenes,omitempty" require:"true" type:"Repeated"`
	// 审核文件内容
	DataVo *DataVo `json:"data_vo,omitempty" xml:"data_vo,omitempty" require:"true"`
	// 登录账号；默认使用主账号
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
}

func (s ConfirmRcApprovalImageRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcApprovalImageRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRcApprovalImageRequest) SetAuthToken(v string) *ConfirmRcApprovalImageRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRcApprovalImageRequest) SetProductInstanceId(v string) *ConfirmRcApprovalImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmRcApprovalImageRequest) SetRequestId(v string) *ConfirmRcApprovalImageRequest {
	s.RequestId = &v
	return s
}

func (s *ConfirmRcApprovalImageRequest) SetScenes(v []*string) *ConfirmRcApprovalImageRequest {
	s.Scenes = v
	return s
}

func (s *ConfirmRcApprovalImageRequest) SetDataVo(v *DataVo) *ConfirmRcApprovalImageRequest {
	s.DataVo = v
	return s
}

func (s *ConfirmRcApprovalImageRequest) SetLoginName(v string) *ConfirmRcApprovalImageRequest {
	s.LoginName = &v
	return s
}

type ConfirmRcApprovalImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审核结果基类
	RcSmartResponse *RcSmartResponse `json:"rc_smart_response,omitempty" xml:"rc_smart_response,omitempty"`
}

func (s ConfirmRcApprovalImageResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRcApprovalImageResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRcApprovalImageResponse) SetReqMsgId(v string) *ConfirmRcApprovalImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRcApprovalImageResponse) SetResultCode(v string) *ConfirmRcApprovalImageResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRcApprovalImageResponse) SetResultMsg(v string) *ConfirmRcApprovalImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmRcApprovalImageResponse) SetRcSmartResponse(v *RcSmartResponse) *ConfirmRcApprovalImageResponse {
	s.RcSmartResponse = v
	return s
}

type QueryRcApprovalImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原审核请求ID
	OrigRequestId *string `json:"orig_request_id,omitempty" xml:"orig_request_id,omitempty" require:"true"`
}

func (s QueryRcApprovalImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRcApprovalImageRequest) GoString() string {
	return s.String()
}

func (s *QueryRcApprovalImageRequest) SetAuthToken(v string) *QueryRcApprovalImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRcApprovalImageRequest) SetProductInstanceId(v string) *QueryRcApprovalImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRcApprovalImageRequest) SetOrigRequestId(v string) *QueryRcApprovalImageRequest {
	s.OrigRequestId = &v
	return s
}

type QueryRcApprovalImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 审核结果基类
	RcSmartResponse *RcSmartResponse `json:"rc_smart_response,omitempty" xml:"rc_smart_response,omitempty"`
	// 通用版图片审核结果
	ResultVo *ImageApprovalResultVO `json:"result_vo,omitempty" xml:"result_vo,omitempty"`
	// 审核结果页
	PageUrl *string `json:"page_url,omitempty" xml:"page_url,omitempty"`
}

func (s QueryRcApprovalImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRcApprovalImageResponse) GoString() string {
	return s.String()
}

func (s *QueryRcApprovalImageResponse) SetReqMsgId(v string) *QueryRcApprovalImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRcApprovalImageResponse) SetResultCode(v string) *QueryRcApprovalImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRcApprovalImageResponse) SetResultMsg(v string) *QueryRcApprovalImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRcApprovalImageResponse) SetRcSmartResponse(v *RcSmartResponse) *QueryRcApprovalImageResponse {
	s.RcSmartResponse = v
	return s
}

func (s *QueryRcApprovalImageResponse) SetResultVo(v *ImageApprovalResultVO) *QueryRcApprovalImageResponse {
	s.ResultVo = v
	return s
}

func (s *QueryRcApprovalImageResponse) SetPageUrl(v string) *QueryRcApprovalImageResponse {
	s.PageUrl = &v
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("COMMONRCSMART"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 通用版文本审核接口
 * Summary: 通用版文本审核接口
 */
func (client *Client) ConfirmRcApprovalMessage(request *ConfirmRcApprovalMessageRequest) (_result *ConfirmRcApprovalMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRcApprovalMessageResponse{}
	_body, _err := client.ConfirmRcApprovalMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用版文本审核接口
 * Summary: 通用版文本审核接口
 */
func (client *Client) ConfirmRcApprovalMessageEx(request *ConfirmRcApprovalMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRcApprovalMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRcApprovalMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("commonrcsmart.rc.approval.message.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用版查询文本审核结果
 * Summary: 通用版查询文本审核结果
 */
func (client *Client) QueryRcApprovalMessage(request *QueryRcApprovalMessageRequest) (_result *QueryRcApprovalMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRcApprovalMessageResponse{}
	_body, _err := client.QueryRcApprovalMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用版查询文本审核结果
 * Summary: 通用版查询文本审核结果
 */
func (client *Client) QueryRcApprovalMessageEx(request *QueryRcApprovalMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRcApprovalMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRcApprovalMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("commonrcsmart.rc.approval.message.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用版图片审核接口
 * Summary: 通用版图片审核接口
 */
func (client *Client) ConfirmRcApprovalImage(request *ConfirmRcApprovalImageRequest) (_result *ConfirmRcApprovalImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRcApprovalImageResponse{}
	_body, _err := client.ConfirmRcApprovalImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用版图片审核接口
 * Summary: 通用版图片审核接口
 */
func (client *Client) ConfirmRcApprovalImageEx(request *ConfirmRcApprovalImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRcApprovalImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRcApprovalImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("commonrcsmart.rc.approval.image.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用版图片审核结果查询接口
 * Summary: 通用版图片审核结果查询接口
 */
func (client *Client) QueryRcApprovalImage(request *QueryRcApprovalImageRequest) (_result *QueryRcApprovalImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRcApprovalImageResponse{}
	_body, _err := client.QueryRcApprovalImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用版图片审核结果查询接口
 * Summary: 通用版图片审核结果查询接口
 */
func (client *Client) QueryRcApprovalImageEx(request *QueryRcApprovalImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRcApprovalImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRcApprovalImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("commonrcsmart.rc.approval.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
