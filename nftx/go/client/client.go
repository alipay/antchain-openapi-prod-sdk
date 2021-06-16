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

// nft发行的文件
type File struct {
	// 原文件的可访问路径
	OriginalFilePath *string `json:"original_file_path,omitempty" xml:"original_file_path,omitempty" require:"true"`
	// 缩略图的可访问路径
	MiniImagePath *string `json:"mini_image_path,omitempty" xml:"mini_image_path,omitempty" require:"true"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// IMAGE("IMAGE","图片"),
	// VIDEO("VIDEO","视频"),
	// ;
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s File) String() string {
	return tea.Prettify(s)
}

func (s File) GoString() string {
	return s.String()
}

func (s *File) SetOriginalFilePath(v string) *File {
	s.OriginalFilePath = &v
	return s
}

func (s *File) SetMiniImagePath(v string) *File {
	s.MiniImagePath = &v
	return s
}

func (s *File) SetName(v string) *File {
	s.Name = &v
	return s
}

func (s *File) SetType(v string) *File {
	s.Type = &v
	return s
}

type ImportNftCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对端自己的项目id；用作幂等字段
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT艺术品的名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// IMAGE("IMAGE","图片"),
	// VIDEO("VIDEO","视频"),
	// ;
	SkuType *string `json:"sku_type,omitempty" xml:"sku_type,omitempty" require:"true"`
	// 发行数量
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 艺术品作者
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 艺术品拥有者
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 艺术品创作时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// nft简介信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 跳转链接
	JumpUrl *string `json:"jump_url,omitempty" xml:"jump_url,omitempty"`
	// nft发行的艺术品文件
	Files []*File `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s ImportNftCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportNftCreateRequest) GoString() string {
	return s.String()
}

func (s *ImportNftCreateRequest) SetAuthToken(v string) *ImportNftCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportNftCreateRequest) SetProductInstanceId(v string) *ImportNftCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportNftCreateRequest) SetProjectId(v string) *ImportNftCreateRequest {
	s.ProjectId = &v
	return s
}

func (s *ImportNftCreateRequest) SetSkuName(v string) *ImportNftCreateRequest {
	s.SkuName = &v
	return s
}

func (s *ImportNftCreateRequest) SetSkuType(v string) *ImportNftCreateRequest {
	s.SkuType = &v
	return s
}

func (s *ImportNftCreateRequest) SetQuantity(v int64) *ImportNftCreateRequest {
	s.Quantity = &v
	return s
}

func (s *ImportNftCreateRequest) SetAuthor(v string) *ImportNftCreateRequest {
	s.Author = &v
	return s
}

func (s *ImportNftCreateRequest) SetOwner(v string) *ImportNftCreateRequest {
	s.Owner = &v
	return s
}

func (s *ImportNftCreateRequest) SetCreateTime(v string) *ImportNftCreateRequest {
	s.CreateTime = &v
	return s
}

func (s *ImportNftCreateRequest) SetBizType(v string) *ImportNftCreateRequest {
	s.BizType = &v
	return s
}

func (s *ImportNftCreateRequest) SetDescription(v string) *ImportNftCreateRequest {
	s.Description = &v
	return s
}

func (s *ImportNftCreateRequest) SetJumpUrl(v string) *ImportNftCreateRequest {
	s.JumpUrl = &v
	return s
}

func (s *ImportNftCreateRequest) SetFiles(v []*File) *ImportNftCreateRequest {
	s.Files = v
	return s
}

type ImportNftCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s ImportNftCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportNftCreateResponse) GoString() string {
	return s.String()
}

func (s *ImportNftCreateResponse) SetReqMsgId(v string) *ImportNftCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportNftCreateResponse) SetResultCode(v string) *ImportNftCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportNftCreateResponse) SetResultMsg(v string) *ImportNftCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportNftCreateResponse) SetSkuId(v int64) *ImportNftCreateResponse {
	s.SkuId = &v
	return s
}

type QueryNftCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 对端自己的项目id；NFT发行时用作幂等字段
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// NFT发行成功的商品id，传入sku_id时以此为准做查询
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
}

func (s QueryNftCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCreateRequest) GoString() string {
	return s.String()
}

func (s *QueryNftCreateRequest) SetAuthToken(v string) *QueryNftCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNftCreateRequest) SetProductInstanceId(v string) *QueryNftCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNftCreateRequest) SetProjectId(v string) *QueryNftCreateRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryNftCreateRequest) SetSkuId(v int64) *QueryNftCreateRequest {
	s.SkuId = &v
	return s
}

type QueryNftCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// INIT("INIT", "初始化"),
	// PROCESSING("PROCESSING", "资产创建中"),
	// FINISH("FINISH", "资产初始化完毕"),
	// ;
	SkuStatus *string `json:"sku_status,omitempty" xml:"sku_status,omitempty"`
}

func (s QueryNftCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNftCreateResponse) GoString() string {
	return s.String()
}

func (s *QueryNftCreateResponse) SetReqMsgId(v string) *QueryNftCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNftCreateResponse) SetResultCode(v string) *QueryNftCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNftCreateResponse) SetResultMsg(v string) *QueryNftCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNftCreateResponse) SetSkuId(v int64) *QueryNftCreateResponse {
	s.SkuId = &v
	return s
}

func (s *QueryNftCreateResponse) SetSkuStatus(v string) *QueryNftCreateResponse {
	s.SkuStatus = &v
	return s
}

type ExecNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// C端用户的支付宝uid
	ToIdNo *string `json:"to_id_no,omitempty" xml:"to_id_no,omitempty" require:"true"`
	// C端用户的支付宝账号类型
	ToIdType *string `json:"to_id_type,omitempty" xml:"to_id_type,omitempty" require:"true"`
	// 用户在商户购买的订单号，用作幂等字段
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用户购买订单的时间
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用户购买订单的价格，可以为0；用户的购买历史记录会展示
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty"`
}

func (s ExecNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferRequest) GoString() string {
	return s.String()
}

func (s *ExecNftTransferRequest) SetAuthToken(v string) *ExecNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecNftTransferRequest) SetProductInstanceId(v string) *ExecNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecNftTransferRequest) SetSkuId(v int64) *ExecNftTransferRequest {
	s.SkuId = &v
	return s
}

func (s *ExecNftTransferRequest) SetToIdNo(v string) *ExecNftTransferRequest {
	s.ToIdNo = &v
	return s
}

func (s *ExecNftTransferRequest) SetToIdType(v string) *ExecNftTransferRequest {
	s.ToIdType = &v
	return s
}

func (s *ExecNftTransferRequest) SetOrderNo(v string) *ExecNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecNftTransferRequest) SetOrderTime(v string) *ExecNftTransferRequest {
	s.OrderTime = &v
	return s
}

func (s *ExecNftTransferRequest) SetPriceCent(v int64) *ExecNftTransferRequest {
	s.PriceCent = &v
	return s
}

type ExecNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NFT发行成功的商品id
	SkuId *int64 `json:"sku_id,omitempty" xml:"sku_id,omitempty"`
	// NFT发行成功的商品，其中转给C端用户的特定一个token
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s ExecNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferResponse) GoString() string {
	return s.String()
}

func (s *ExecNftTransferResponse) SetReqMsgId(v string) *ExecNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultCode(v string) *ExecNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultMsg(v string) *ExecNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecNftTransferResponse) SetSkuId(v int64) *ExecNftTransferResponse {
	s.SkuId = &v
	return s
}

func (s *ExecNftTransferResponse) SetNftId(v string) *ExecNftTransferResponse {
	s.NftId = &v
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
				"sdk_version":      tea.String("1.0.8"),
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
 * Description: B端商户的NFT发行
 * Summary: B端商户的NFT发行
 */
func (client *Client) ImportNftCreate(request *ImportNftCreateRequest) (_result *ImportNftCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportNftCreateResponse{}
	_body, _err := client.ImportNftCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端商户的NFT发行
 * Summary: B端商户的NFT发行
 */
func (client *Client) ImportNftCreateEx(request *ImportNftCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportNftCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportNftCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.create.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B端商户的NFT发行后查询
 * Summary: B端商户的NFT发行后查询
 */
func (client *Client) QueryNftCreate(request *QueryNftCreateRequest) (_result *QueryNftCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNftCreateResponse{}
	_body, _err := client.QueryNftCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B端商户的NFT发行后查询
 * Summary: B端商户的NFT发行后查询
 */
func (client *Client) QueryNftCreateEx(request *QueryNftCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNftCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNftCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.create.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个token由B端商户转C端用户
 * Summary: 单个token由B端商户转C端用户
 */
func (client *Client) ExecNftTransfer(request *ExecNftTransferRequest) (_result *ExecNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecNftTransferResponse{}
	_body, _err := client.ExecNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个token由B端商户转C端用户
 * Summary: 单个token由B端商户转C端用户
 */
func (client *Client) ExecNftTransferEx(request *ExecNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.nftx.nft.transfer.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
