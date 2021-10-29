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

// 区块链信息
type BlockchainInfo struct {
	// 链节点ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 区块链名称
	BlockchainName *string `json:"blockchain_name,omitempty" xml:"blockchain_name,omitempty" require:"true"`
	// 当前链如果为主链，该字段为空；否则该字段为子链对应的主链ID
	ParentBizId *string `json:"parent_biz_id,omitempty" xml:"parent_biz_id,omitempty"`
}

func (s BlockchainInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockchainInfo) GoString() string {
	return s.String()
}

func (s *BlockchainInfo) SetBizId(v string) *BlockchainInfo {
	s.BizId = &v
	return s
}

func (s *BlockchainInfo) SetBlockchainName(v string) *BlockchainInfo {
	s.BlockchainName = &v
	return s
}

func (s *BlockchainInfo) SetParentBizId(v string) *BlockchainInfo {
	s.ParentBizId = &v
	return s
}

// 区块链节点信息
type NodeInfo struct {
	// 公网IP
	PublicIp *string `json:"public_ip,omitempty" xml:"public_ip,omitempty" require:"true"`
	// 内网IP
	PrivateIp *string `json:"private_ip,omitempty" xml:"private_ip,omitempty" require:"true"`
	// 连接端口
	ClientPort *string `json:"client_port,omitempty" xml:"client_port,omitempty" require:"true"`
	// 共识端口
	P2pPort *string `json:"p2p_port,omitempty" xml:"p2p_port,omitempty" require:"true"`
}

func (s NodeInfo) String() string {
	return tea.Prettify(s)
}

func (s NodeInfo) GoString() string {
	return s.String()
}

func (s *NodeInfo) SetPublicIp(v string) *NodeInfo {
	s.PublicIp = &v
	return s
}

func (s *NodeInfo) SetPrivateIp(v string) *NodeInfo {
	s.PrivateIp = &v
	return s
}

func (s *NodeInfo) SetClientPort(v string) *NodeInfo {
	s.ClientPort = &v
	return s
}

func (s *NodeInfo) SetP2pPort(v string) *NodeInfo {
	s.P2pPort = &v
	return s
}

type QueryNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s QueryNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNodeRequest) GoString() string {
	return s.String()
}

func (s *QueryNodeRequest) SetAuthToken(v string) *QueryNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNodeRequest) SetProductInstanceId(v string) *QueryNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNodeRequest) SetBizId(v string) *QueryNodeRequest {
	s.BizId = &v
	return s
}

type QueryNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链节点信息
	NodeInfoList []*NodeInfo `json:"node_info_list,omitempty" xml:"node_info_list,omitempty" type:"Repeated"`
}

func (s QueryNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNodeResponse) GoString() string {
	return s.String()
}

func (s *QueryNodeResponse) SetReqMsgId(v string) *QueryNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNodeResponse) SetResultCode(v string) *QueryNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNodeResponse) SetResultMsg(v string) *QueryNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNodeResponse) SetNodeInfoList(v []*NodeInfo) *QueryNodeResponse {
	s.NodeInfoList = v
	return s
}

type QueryBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainRequest) GoString() string {
	return s.String()
}

func (s *QueryBlockchainRequest) SetAuthToken(v string) *QueryBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlockchainRequest) SetProductInstanceId(v string) *QueryBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链信息列表
	BlockchainInfoList []*BlockchainInfo `json:"blockchain_info_list,omitempty" xml:"blockchain_info_list,omitempty" type:"Repeated"`
}

func (s QueryBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainResponse) SetReqMsgId(v string) *QueryBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlockchainResponse) SetResultCode(v string) *QueryBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlockchainResponse) SetResultMsg(v string) *QueryBlockchainResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlockchainResponse) SetBlockchainInfoList(v []*BlockchainInfo) *QueryBlockchainResponse {
	s.BlockchainInfoList = v
	return s
}

type DownloadCaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
}

func (s DownloadCaRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadCaRequest) GoString() string {
	return s.String()
}

func (s *DownloadCaRequest) SetAuthToken(v string) *DownloadCaRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadCaRequest) SetProductInstanceId(v string) *DownloadCaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadCaRequest) SetBizId(v string) *DownloadCaRequest {
	s.BizId = &v
	return s
}

type DownloadCaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 根CA证书内容
	TrustCaContent *string `json:"trust_ca_content,omitempty" xml:"trust_ca_content,omitempty"`
	// CA证书格式，目前只有X509
	CaFormat *string `json:"ca_format,omitempty" xml:"ca_format,omitempty"`
}

func (s DownloadCaResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadCaResponse) GoString() string {
	return s.String()
}

func (s *DownloadCaResponse) SetReqMsgId(v string) *DownloadCaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadCaResponse) SetResultCode(v string) *DownloadCaResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadCaResponse) SetResultMsg(v string) *DownloadCaResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadCaResponse) SetTrustCaContent(v string) *DownloadCaResponse {
	s.TrustCaContent = &v
	return s
}

func (s *DownloadCaResponse) SetCaFormat(v string) *DownloadCaResponse {
	s.CaFormat = &v
	return s
}

type CreateTlsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 非对称加密算法
	TlsAlgo *string `json:"tls_algo,omitempty" xml:"tls_algo,omitempty"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty"`
	// 封装格式
	KeyFormat *string `json:"key_format,omitempty" xml:"key_format,omitempty"`
}

func (s CreateTlsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTlsRequest) GoString() string {
	return s.String()
}

func (s *CreateTlsRequest) SetAuthToken(v string) *CreateTlsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTlsRequest) SetProductInstanceId(v string) *CreateTlsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTlsRequest) SetBizId(v string) *CreateTlsRequest {
	s.BizId = &v
	return s
}

func (s *CreateTlsRequest) SetTlsAlgo(v string) *CreateTlsRequest {
	s.TlsAlgo = &v
	return s
}

func (s *CreateTlsRequest) SetPassword(v string) *CreateTlsRequest {
	s.Password = &v
	return s
}

func (s *CreateTlsRequest) SetKeyFormat(v string) *CreateTlsRequest {
	s.KeyFormat = &v
	return s
}

type CreateTlsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户端TLS证书
	ClientCert *string `json:"client_cert,omitempty" xml:"client_cert,omitempty"`
	// 客户端TLS密钥
	ClientKey *string `json:"client_key,omitempty" xml:"client_key,omitempty"`
}

func (s CreateTlsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTlsResponse) GoString() string {
	return s.String()
}

func (s *CreateTlsResponse) SetReqMsgId(v string) *CreateTlsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTlsResponse) SetResultCode(v string) *CreateTlsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTlsResponse) SetResultMsg(v string) *CreateTlsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTlsResponse) SetClientCert(v string) *CreateTlsResponse {
	s.ClientCert = &v
	return s
}

func (s *CreateTlsResponse) SetClientKey(v string) *CreateTlsResponse {
	s.ClientKey = &v
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
 * Description: 根据bizId查询链节点IP及端口信息
 * Summary: 根据链ID查询链节点信息
 */
func (client *Client) QueryNode(request *QueryNodeRequest) (_result *QueryNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNodeResponse{}
	_body, _err := client.QueryNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据bizId查询链节点IP及端口信息
 * Summary: 根据链ID查询链节点信息
 */
func (client *Client) QueryNodeEx(request *QueryNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.midway.node.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所有正在运行中的链信息
 * Summary: 查询区块链链列表
 */
func (client *Client) QueryBlockchain(request *QueryBlockchainRequest) (_result *QueryBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlockchainResponse{}
	_body, _err := client.QueryBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所有正在运行中的链信息
 * Summary: 查询区块链链列表
 */
func (client *Client) QueryBlockchainEx(request *QueryBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.midway.blockchain.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据链ID查询并返回trustCa根证书X509格式内容
 * Summary: 下载trustCa根证书
 */
func (client *Client) DownloadCa(request *DownloadCaRequest) (_result *DownloadCaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadCaResponse{}
	_body, _err := client.DownloadCaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据链ID查询并返回trustCa根证书X509格式内容
 * Summary: 下载trustCa根证书
 */
func (client *Client) DownloadCaEx(request *DownloadCaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadCaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadCaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.midway.ca.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据用户输入的信息创建客户端TLS证书及私钥。
 * Summary: 创建客户端TLS证书及私钥
 */
func (client *Client) CreateTls(request *CreateTlsRequest) (_result *CreateTlsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTlsResponse{}
	_body, _err := client.CreateTlsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据用户输入的信息创建客户端TLS证书及私钥。
 * Summary: 创建客户端TLS证书及私钥
 */
func (client *Client) CreateTlsEx(request *CreateTlsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTlsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTlsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.midway.tls.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
