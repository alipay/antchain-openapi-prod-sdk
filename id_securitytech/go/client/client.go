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

// FileTokenForUpload
type FileTokenForUpload struct {
	// access_id
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty" require:"true"`
	// dir
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty" require:"true"`
	// expire
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty" require:"true"`
	// host
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// policy
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty" require:"true"`
	// signature
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s FileTokenForUpload) String() string {
	return tea.Prettify(s)
}

func (s FileTokenForUpload) GoString() string {
	return s.String()
}

func (s *FileTokenForUpload) SetAccessId(v string) *FileTokenForUpload {
	s.AccessId = &v
	return s
}

func (s *FileTokenForUpload) SetDir(v string) *FileTokenForUpload {
	s.Dir = &v
	return s
}

func (s *FileTokenForUpload) SetExpire(v string) *FileTokenForUpload {
	s.Expire = &v
	return s
}

func (s *FileTokenForUpload) SetHost(v string) *FileTokenForUpload {
	s.Host = &v
	return s
}

func (s *FileTokenForUpload) SetPolicy(v string) *FileTokenForUpload {
	s.Policy = &v
	return s
}

func (s *FileTokenForUpload) SetSignature(v string) *FileTokenForUpload {
	s.Signature = &v
	return s
}

// 设备风险查询data
type DeviceRiskResp struct {
	// apdid
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" require:"true"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// risk_level
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// risk_desc
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// sug_action
	SugAction *string `json:"sug_action,omitempty" xml:"sug_action,omitempty" require:"true"`
	// risk_labels
	RiskLabels []*string `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" require:"true" type:"Repeated"`
}

func (s DeviceRiskResp) String() string {
	return tea.Prettify(s)
}

func (s DeviceRiskResp) GoString() string {
	return s.String()
}

func (s *DeviceRiskResp) SetApdid(v string) *DeviceRiskResp {
	s.Apdid = &v
	return s
}

func (s *DeviceRiskResp) SetApdidToken(v string) *DeviceRiskResp {
	s.ApdidToken = &v
	return s
}

func (s *DeviceRiskResp) SetRiskLevel(v int64) *DeviceRiskResp {
	s.RiskLevel = &v
	return s
}

func (s *DeviceRiskResp) SetRiskDesc(v string) *DeviceRiskResp {
	s.RiskDesc = &v
	return s
}

func (s *DeviceRiskResp) SetSugAction(v string) *DeviceRiskResp {
	s.SugAction = &v
	return s
}

func (s *DeviceRiskResp) SetRiskLabels(v []*string) *DeviceRiskResp {
	s.RiskLabels = v
	return s
}

type GetAshieldFiletokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetAshieldFiletokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldFiletokenRequest) GoString() string {
	return s.String()
}

func (s *GetAshieldFiletokenRequest) SetAuthToken(v string) *GetAshieldFiletokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAshieldFiletokenRequest) SetProductInstanceId(v string) *GetAshieldFiletokenRequest {
	s.ProductInstanceId = &v
	return s
}

type GetAshieldFiletokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// res_success
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// res_code
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// res_message
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// res_data
	ResData *FileTokenForUpload `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s GetAshieldFiletokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldFiletokenResponse) GoString() string {
	return s.String()
}

func (s *GetAshieldFiletokenResponse) SetReqMsgId(v string) *GetAshieldFiletokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResultCode(v string) *GetAshieldFiletokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResultMsg(v string) *GetAshieldFiletokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetRequestId(v string) *GetAshieldFiletokenResponse {
	s.RequestId = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResSuccess(v bool) *GetAshieldFiletokenResponse {
	s.ResSuccess = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResCode(v string) *GetAshieldFiletokenResponse {
	s.ResCode = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResMessage(v string) *GetAshieldFiletokenResponse {
	s.ResMessage = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResData(v *FileTokenForUpload) *GetAshieldFiletokenResponse {
	s.ResData = v
	return s
}

type QueryDeviceriskFingerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskFingerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskFingerRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskFingerRequest) SetAuthToken(v string) *QueryDeviceriskFingerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetProductInstanceId(v string) *QueryDeviceriskFingerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetApdidToken(v string) *QueryDeviceriskFingerRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetClientId(v string) *QueryDeviceriskFingerRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetTerminalType(v string) *QueryDeviceriskFingerRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskFingerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskFingerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskFingerResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskFingerResponse) SetReqMsgId(v string) *QueryDeviceriskFingerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetResultCode(v string) *QueryDeviceriskFingerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetResultMsg(v string) *QueryDeviceriskFingerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetCode(v int64) *QueryDeviceriskFingerResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetMessage(v string) *QueryDeviceriskFingerResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetRequestId(v string) *QueryDeviceriskFingerResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetSuccess(v bool) *QueryDeviceriskFingerResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskFingerResponse {
	s.Data = v
	return s
}

type QueryDeviceriskRisklabelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskRisklabelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskRisklabelRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskRisklabelRequest) SetAuthToken(v string) *QueryDeviceriskRisklabelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetProductInstanceId(v string) *QueryDeviceriskRisklabelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetApdidToken(v string) *QueryDeviceriskRisklabelRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetClientId(v string) *QueryDeviceriskRisklabelRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetTerminalType(v string) *QueryDeviceriskRisklabelRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskRisklabelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskRisklabelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskRisklabelResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskRisklabelResponse) SetReqMsgId(v string) *QueryDeviceriskRisklabelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetResultCode(v string) *QueryDeviceriskRisklabelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetResultMsg(v string) *QueryDeviceriskRisklabelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetCode(v int64) *QueryDeviceriskRisklabelResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetMessage(v string) *QueryDeviceriskRisklabelResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetRequestId(v string) *QueryDeviceriskRisklabelResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetSuccess(v bool) *QueryDeviceriskRisklabelResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskRisklabelResponse {
	s.Data = v
	return s
}

type QueryDeviceriskDeviceriskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// app_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// env_id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskDeviceriskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskDeviceriskRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskDeviceriskRequest) SetAuthToken(v string) *QueryDeviceriskDeviceriskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetProductInstanceId(v string) *QueryDeviceriskDeviceriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetApdidToken(v string) *QueryDeviceriskDeviceriskRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetClientId(v string) *QueryDeviceriskDeviceriskRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetAppId(v string) *QueryDeviceriskDeviceriskRequest {
	s.AppId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetEnvId(v string) *QueryDeviceriskDeviceriskRequest {
	s.EnvId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetTenantId(v string) *QueryDeviceriskDeviceriskRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetMerchantId(v string) *QueryDeviceriskDeviceriskRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetAppName(v string) *QueryDeviceriskDeviceriskRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetTerminalType(v string) *QueryDeviceriskDeviceriskRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskDeviceriskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskDeviceriskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskDeviceriskResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskDeviceriskResponse) SetReqMsgId(v string) *QueryDeviceriskDeviceriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetResultCode(v string) *QueryDeviceriskDeviceriskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetResultMsg(v string) *QueryDeviceriskDeviceriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetCode(v int64) *QueryDeviceriskDeviceriskResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetMessage(v string) *QueryDeviceriskDeviceriskResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetRequestId(v string) *QueryDeviceriskDeviceriskResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetSuccess(v bool) *QueryDeviceriskDeviceriskResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskDeviceriskResponse {
	s.Data = v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ID_SECURITYTECH"),
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
 * Description: 终端安全-Android应用加固-获取上传文件的临时URL
 * Summary: 获取上传文件的临时URL
 */
func (client *Client) GetAshieldFiletoken(request *GetAshieldFiletokenRequest) (_result *GetAshieldFiletokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAshieldFiletokenResponse{}
	_body, _err := client.GetAshieldFiletokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-获取上传文件的临时URL
 * Summary: 获取上传文件的临时URL
 */
func (client *Client) GetAshieldFiletokenEx(request *GetAshieldFiletokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAshieldFiletokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAshieldFiletokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("idsecuritytech.gateway.ashield.filetoken.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备指纹查询
 * Summary: 设备指纹查询
 */
func (client *Client) QueryDeviceriskFinger(request *QueryDeviceriskFingerRequest) (_result *QueryDeviceriskFingerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskFingerResponse{}
	_body, _err := client.QueryDeviceriskFingerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备指纹查询
 * Summary: 设备指纹查询
 */
func (client *Client) QueryDeviceriskFingerEx(request *QueryDeviceriskFingerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskFingerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskFingerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("idsecuritytech.gateway.devicerisk.finger.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险标签查询
 * Summary: 风险标签查询
 */
func (client *Client) QueryDeviceriskRisklabel(request *QueryDeviceriskRisklabelRequest) (_result *QueryDeviceriskRisklabelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskRisklabelResponse{}
	_body, _err := client.QueryDeviceriskRisklabelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险标签查询
 * Summary: 风险标签查询
 */
func (client *Client) QueryDeviceriskRisklabelEx(request *QueryDeviceriskRisklabelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskRisklabelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskRisklabelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("idsecuritytech.gateway.devicerisk.risklabel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskDevicerisk(request *QueryDeviceriskDeviceriskRequest) (_result *QueryDeviceriskDeviceriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskDeviceriskResponse{}
	_body, _err := client.QueryDeviceriskDeviceriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskDeviceriskEx(request *QueryDeviceriskDeviceriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskDeviceriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskDeviceriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("idsecuritytech.gateway.devicerisk.devicerisk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
