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

// 收集信息
type CollectContent struct {
	// 链上设备Id
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集的内容
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 对内容的签名
	//
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 服务端发送的扩展数据（非可信设备直接产生的数据）
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
}

func (s CollectContent) String() string {
	return tea.Prettify(s)
}

func (s CollectContent) GoString() string {
	return s.String()
}

func (s *CollectContent) SetChainDeviceId(v string) *CollectContent {
	s.ChainDeviceId = &v
	return s
}

func (s *CollectContent) SetContent(v string) *CollectContent {
	s.Content = &v
	return s
}

func (s *CollectContent) SetSignature(v string) *CollectContent {
	s.Signature = &v
	return s
}

func (s *CollectContent) SetExtraData(v string) *CollectContent {
	s.ExtraData = &v
	return s
}

// 收集数据(免签名)
type CollectContentNoSign struct {
	// 链上设备Id
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 收集内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 服务端发送的扩展数据（非可信设备直接产生的数据）
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
}

func (s CollectContentNoSign) String() string {
	return tea.Prettify(s)
}

func (s CollectContentNoSign) GoString() string {
	return s.String()
}

func (s *CollectContentNoSign) SetChainDeviceId(v string) *CollectContentNoSign {
	s.ChainDeviceId = &v
	return s
}

func (s *CollectContentNoSign) SetContent(v string) *CollectContentNoSign {
	s.Content = &v
	return s
}

func (s *CollectContentNoSign) SetExtraData(v string) *CollectContentNoSign {
	s.ExtraData = &v
	return s
}

// 收集数据返回的上链结果
type SendCollectorResult struct {
	// 数据内容content的上链交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s SendCollectorResult) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorResult) GoString() string {
	return s.String()
}

func (s *SendCollectorResult) SetTxHash(v string) *SendCollectorResult {
	s.TxHash = &v
	return s
}

// 收集标签数据
type CollectLabelContent struct {
	// 链上设备ID
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// 1.设备端上报数据内容 2.与设备上报的数据一致，服务...
	//
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// content的签名 与设备上报的签名保持一致，服务端不可修改
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 未经设备签名的附加数据JSON String 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
}

func (s CollectLabelContent) String() string {
	return tea.Prettify(s)
}

func (s CollectLabelContent) GoString() string {
	return s.String()
}

func (s *CollectLabelContent) SetChainDeviceId(v string) *CollectLabelContent {
	s.ChainDeviceId = &v
	return s
}

func (s *CollectLabelContent) SetContent(v string) *CollectLabelContent {
	s.Content = &v
	return s
}

func (s *CollectLabelContent) SetSignature(v string) *CollectLabelContent {
	s.Signature = &v
	return s
}

func (s *CollectLabelContent) SetExtraData(v string) *CollectLabelContent {
	s.ExtraData = &v
	return s
}

type CreateDeviceBydeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 项目编码 -对应acs iot管控后台项目code
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 设备类型编码-对应acs iot管控后台设备类型code
	ClassCode *string `json:"class_code,omitempty" xml:"class_code,omitempty" require:"true"`
	// 注册内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备单价 单位：分
	//
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateDeviceBydeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceBydeviceRequest) GoString() string {
	return s.String()
}

func (s *CreateDeviceBydeviceRequest) SetAuthToken(v string) *CreateDeviceBydeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetProductInstanceId(v string) *CreateDeviceBydeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetDeviceId(v string) *CreateDeviceBydeviceRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetProjectCode(v string) *CreateDeviceBydeviceRequest {
	s.ProjectCode = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetClassCode(v string) *CreateDeviceBydeviceRequest {
	s.ClassCode = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetContent(v string) *CreateDeviceBydeviceRequest {
	s.Content = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetDeviceName(v string) *CreateDeviceBydeviceRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetInitialPrice(v int64) *CreateDeviceBydeviceRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetFactoryTime(v string) *CreateDeviceBydeviceRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateDeviceBydeviceRequest) SetReleaseTime(v string) *CreateDeviceBydeviceRequest {
	s.ReleaseTime = &v
	return s
}

type CreateDeviceBydeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上唯一身份ID
	ChainDeviceDid *string `json:"chain_device_did,omitempty" xml:"chain_device_did,omitempty"`
	// 设备激活文本-设备直连上链方式使用
	//
	ActiveData *string `json:"active_data,omitempty" xml:"active_data,omitempty"`
}

func (s CreateDeviceBydeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceBydeviceResponse) GoString() string {
	return s.String()
}

func (s *CreateDeviceBydeviceResponse) SetReqMsgId(v string) *CreateDeviceBydeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDeviceBydeviceResponse) SetResultCode(v string) *CreateDeviceBydeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDeviceBydeviceResponse) SetResultMsg(v string) *CreateDeviceBydeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDeviceBydeviceResponse) SetChainDeviceDid(v string) *CreateDeviceBydeviceResponse {
	s.ChainDeviceDid = &v
	return s
}

func (s *CreateDeviceBydeviceResponse) SetActiveData(v string) *CreateDeviceBydeviceResponse {
	s.ActiveData = &v
	return s
}

type CreateDeviceBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 项目编码-对应acs iot管控后台项目code
	ProjectCode *string `json:"project_code,omitempty" xml:"project_code,omitempty" require:"true"`
	// 设备类型编码-对应acs iot管控后台设备类型code
	ClassCode *string `json:"class_code,omitempty" xml:"class_code,omitempty" require:"true"`
	// 设备注册内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 设备注册内容签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// 设备名称
	DeviceName *string `json:"device_name,omitempty" xml:"device_name,omitempty" require:"true"`
	// 设备单价 单位：分
	//
	InitialPrice *int64 `json:"initial_price,omitempty" xml:"initial_price,omitempty"`
	// 设备出厂时间
	FactoryTime *string `json:"factory_time,omitempty" xml:"factory_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 设备投放时间
	ReleaseTime *string `json:"release_time,omitempty" xml:"release_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CreateDeviceBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceBychainidRequest) GoString() string {
	return s.String()
}

func (s *CreateDeviceBychainidRequest) SetAuthToken(v string) *CreateDeviceBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetProductInstanceId(v string) *CreateDeviceBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetDeviceId(v string) *CreateDeviceBychainidRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetProjectCode(v string) *CreateDeviceBychainidRequest {
	s.ProjectCode = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetClassCode(v string) *CreateDeviceBychainidRequest {
	s.ClassCode = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetContent(v string) *CreateDeviceBychainidRequest {
	s.Content = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetSignature(v string) *CreateDeviceBychainidRequest {
	s.Signature = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetDeviceName(v string) *CreateDeviceBychainidRequest {
	s.DeviceName = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetInitialPrice(v int64) *CreateDeviceBychainidRequest {
	s.InitialPrice = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetFactoryTime(v string) *CreateDeviceBychainidRequest {
	s.FactoryTime = &v
	return s
}

func (s *CreateDeviceBychainidRequest) SetReleaseTime(v string) *CreateDeviceBychainidRequest {
	s.ReleaseTime = &v
	return s
}

type CreateDeviceBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备链上ID
	//
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty"`
}

func (s CreateDeviceBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDeviceBychainidResponse) GoString() string {
	return s.String()
}

func (s *CreateDeviceBychainidResponse) SetReqMsgId(v string) *CreateDeviceBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDeviceBychainidResponse) SetResultCode(v string) *CreateDeviceBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDeviceBychainidResponse) SetResultMsg(v string) *CreateDeviceBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDeviceBychainidResponse) SetChainDeviceId(v string) *CreateDeviceBychainidResponse {
	s.ChainDeviceId = &v
	return s
}

type SendCollectorBychainidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备链id
	ChainDeviceId *string `json:"chain_device_id,omitempty" xml:"chain_device_id,omitempty" require:"true"`
	// [{"name","1"},{"name","1"}]
	CollectContentList []*CollectContent `json:"collect_content_list,omitempty" xml:"collect_content_list,omitempty" require:"true" type:"Repeated"`
	// 随机数，防重放
	//
	Nonce *string `json:"nonce,omitempty" xml:"nonce,omitempty" require:"true"`
}

func (s SendCollectorBychainidRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidRequest) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidRequest) SetAuthToken(v string) *SendCollectorBychainidRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetProductInstanceId(v string) *SendCollectorBychainidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetChainDeviceId(v string) *SendCollectorBychainidRequest {
	s.ChainDeviceId = &v
	return s
}

func (s *SendCollectorBychainidRequest) SetCollectContentList(v []*CollectContent) *SendCollectorBychainidRequest {
	s.CollectContentList = v
	return s
}

func (s *SendCollectorBychainidRequest) SetNonce(v string) *SendCollectorBychainidRequest {
	s.Nonce = &v
	return s
}

type SendCollectorBychainidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收集数据返回的上链结果
	ResultList []*SendCollectorResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s SendCollectorBychainidResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCollectorBychainidResponse) GoString() string {
	return s.String()
}

func (s *SendCollectorBychainidResponse) SetReqMsgId(v string) *SendCollectorBychainidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultCode(v string) *SendCollectorBychainidResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultMsg(v string) *SendCollectorBychainidResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendCollectorBychainidResponse) SetResultList(v []*SendCollectorResult) *SendCollectorBychainidResponse {
	s.ResultList = v
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
				"sdk_version":      tea.String("1.0.1"),
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
 * Description: biot设备注册-创建设备链账号
 * Summary: biot设备注册-创建设备链账号
 */
func (client *Client) CreateDeviceBydevice(request *CreateDeviceBydeviceRequest) (_result *CreateDeviceBydeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDeviceBydeviceResponse{}
	_body, _err := client.CreateDeviceBydeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备注册-创建设备链账号
 * Summary: biot设备注册-创建设备链账号
 */
func (client *Client) CreateDeviceBydeviceEx(request *CreateDeviceBydeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDeviceBydeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDeviceBydeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.iot.device.bydevice.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot设备注册-通过项目链账号上链
 * Summary: biot设备注册-通过项目链账号上链
 */
func (client *Client) CreateDeviceBychainid(request *CreateDeviceBychainidRequest) (_result *CreateDeviceBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDeviceBychainidResponse{}
	_body, _err := client.CreateDeviceBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot设备注册-通过项目链账号上链
 * Summary: biot设备注册-通过项目链账号上链
 */
func (client *Client) CreateDeviceBychainidEx(request *CreateDeviceBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDeviceBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDeviceBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.iot.device.bychainid.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: biot 私有化 业务数据上报
 * Summary: biot 私有化 业务数据上报
 */
func (client *Client) SendCollectorBychainid(request *SendCollectorBychainidRequest) (_result *SendCollectorBychainidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCollectorBychainidResponse{}
	_body, _err := client.SendCollectorBychainidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: biot 私有化 业务数据上报
 * Summary: biot 私有化 业务数据上报
 */
func (client *Client) SendCollectorBychainidEx(request *SendCollectorBychainidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCollectorBychainidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCollectorBychainidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.iot.collector.bychainid.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
