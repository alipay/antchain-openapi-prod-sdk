// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
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

// 分账明细
type RuleItem struct {
	// 分账方Id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 分账份额，总份额100，保留2位小数
	Proportion *string `json:"proportion,omitempty" xml:"proportion,omitempty" require:"true"`
}

func (s RuleItem) String() string {
	return tea.Prettify(s)
}

func (s RuleItem) GoString() string {
	return s.String()
}

func (s *RuleItem) SetId(v string) *RuleItem {
	s.Id = &v
	return s
}

func (s *RuleItem) SetProportion(v string) *RuleItem {
	s.Proportion = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type CreateDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s CreateDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositRequest) GoString() string {
	return s.String()
}

func (s *CreateDepositRequest) SetAuthToken(v string) *CreateDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepositRequest) SetProductInstanceId(v string) *CreateDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDepositRequest) SetOrderId(v string) *CreateDepositRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDepositRequest) SetServiceId(v string) *CreateDepositRequest {
	s.ServiceId = &v
	return s
}

func (s *CreateDepositRequest) SetBaseInfoJson(v string) *CreateDepositRequest {
	s.BaseInfoJson = &v
	return s
}

func (s *CreateDepositRequest) SetExtensionInfoJson(v string) *CreateDepositRequest {
	s.ExtensionInfoJson = &v
	return s
}

func (s *CreateDepositRequest) SetFileObject(v io.Reader) *CreateDepositRequest {
	s.FileObject = v
	return s
}

func (s *CreateDepositRequest) SetFileObjectName(v string) *CreateDepositRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateDepositRequest) SetFileId(v string) *CreateDepositRequest {
	s.FileId = &v
	return s
}

type CreateDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositResponse) GoString() string {
	return s.String()
}

func (s *CreateDepositResponse) SetReqMsgId(v string) *CreateDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepositResponse) SetResultCode(v string) *CreateDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepositResponse) SetResultMsg(v string) *CreateDepositResponse {
	s.ResultMsg = &v
	return s
}

type QueryDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s QueryDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositRequest) GoString() string {
	return s.String()
}

func (s *QueryDepositRequest) SetAuthToken(v string) *QueryDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDepositRequest) SetProductInstanceId(v string) *QueryDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDepositRequest) SetOrderId(v string) *QueryDepositRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDepositRequest) SetServiceId(v string) *QueryDepositRequest {
	s.ServiceId = &v
	return s
}

type QueryDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
}

func (s QueryDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositResponse) GoString() string {
	return s.String()
}

func (s *QueryDepositResponse) SetReqMsgId(v string) *QueryDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDepositResponse) SetResultCode(v string) *QueryDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDepositResponse) SetResultMsg(v string) *QueryDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDepositResponse) SetOrderId(v string) *QueryDepositResponse {
	s.OrderId = &v
	return s
}

func (s *QueryDepositResponse) SetServiceId(v string) *QueryDepositResponse {
	s.ServiceId = &v
	return s
}

func (s *QueryDepositResponse) SetBaseInfoJson(v string) *QueryDepositResponse {
	s.BaseInfoJson = &v
	return s
}

func (s *QueryDepositResponse) SetExtensionInfoJson(v string) *QueryDepositResponse {
	s.ExtensionInfoJson = &v
	return s
}

func (s *QueryDepositResponse) SetTxHash(v string) *QueryDepositResponse {
	s.TxHash = &v
	return s
}

func (s *QueryDepositResponse) SetBlockNumber(v int64) *QueryDepositResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryDepositResponse) SetTimestamp(v int64) *QueryDepositResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryDepositResponse) SetFileUrl(v string) *QueryDepositResponse {
	s.FileUrl = &v
	return s
}

func (s *QueryDepositResponse) SetFileId(v string) *QueryDepositResponse {
	s.FileId = &v
	return s
}

func (s *QueryDepositResponse) SetFileHash(v string) *QueryDepositResponse {
	s.FileHash = &v
	return s
}

type QueryDepositCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s QueryDepositCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositCertificateRequest) GoString() string {
	return s.String()
}

func (s *QueryDepositCertificateRequest) SetAuthToken(v string) *QueryDepositCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDepositCertificateRequest) SetProductInstanceId(v string) *QueryDepositCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDepositCertificateRequest) SetOrderId(v string) *QueryDepositCertificateRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDepositCertificateRequest) SetServiceId(v string) *QueryDepositCertificateRequest {
	s.ServiceId = &v
	return s
}

type QueryDepositCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
}

func (s QueryDepositCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositCertificateResponse) GoString() string {
	return s.String()
}

func (s *QueryDepositCertificateResponse) SetReqMsgId(v string) *QueryDepositCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetResultCode(v string) *QueryDepositCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetResultMsg(v string) *QueryDepositCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetOrderId(v string) *QueryDepositCertificateResponse {
	s.OrderId = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetServiceId(v string) *QueryDepositCertificateResponse {
	s.ServiceId = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetBaseInfoJson(v string) *QueryDepositCertificateResponse {
	s.BaseInfoJson = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetExtensionInfoJson(v string) *QueryDepositCertificateResponse {
	s.ExtensionInfoJson = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetTxHash(v string) *QueryDepositCertificateResponse {
	s.TxHash = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetBlockNumber(v int64) *QueryDepositCertificateResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetTimestamp(v int64) *QueryDepositCertificateResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetFileUrl(v string) *QueryDepositCertificateResponse {
	s.FileUrl = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetFileId(v string) *QueryDepositCertificateResponse {
	s.FileId = &v
	return s
}

func (s *QueryDepositCertificateResponse) SetFileHash(v string) *QueryDepositCertificateResponse {
	s.FileHash = &v
	return s
}

type CreateDepositCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s CreateDepositCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositCertificateRequest) GoString() string {
	return s.String()
}

func (s *CreateDepositCertificateRequest) SetAuthToken(v string) *CreateDepositCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetProductInstanceId(v string) *CreateDepositCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetOrderId(v string) *CreateDepositCertificateRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetServiceId(v string) *CreateDepositCertificateRequest {
	s.ServiceId = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetBaseInfoJson(v string) *CreateDepositCertificateRequest {
	s.BaseInfoJson = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetExtensionInfoJson(v string) *CreateDepositCertificateRequest {
	s.ExtensionInfoJson = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetFileObject(v io.Reader) *CreateDepositCertificateRequest {
	s.FileObject = v
	return s
}

func (s *CreateDepositCertificateRequest) SetFileObjectName(v string) *CreateDepositCertificateRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateDepositCertificateRequest) SetFileId(v string) *CreateDepositCertificateRequest {
	s.FileId = &v
	return s
}

type CreateDepositCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDepositCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositCertificateResponse) GoString() string {
	return s.String()
}

func (s *CreateDepositCertificateResponse) SetReqMsgId(v string) *CreateDepositCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepositCertificateResponse) SetResultCode(v string) *CreateDepositCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepositCertificateResponse) SetResultMsg(v string) *CreateDepositCertificateResponse {
	s.ResultMsg = &v
	return s
}

type QueryDepositCharityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s QueryDepositCharityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositCharityRequest) GoString() string {
	return s.String()
}

func (s *QueryDepositCharityRequest) SetAuthToken(v string) *QueryDepositCharityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDepositCharityRequest) SetProductInstanceId(v string) *QueryDepositCharityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDepositCharityRequest) SetOrderId(v string) *QueryDepositCharityRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDepositCharityRequest) SetServiceId(v string) *QueryDepositCharityRequest {
	s.ServiceId = &v
	return s
}

type QueryDepositCharityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
}

func (s QueryDepositCharityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositCharityResponse) GoString() string {
	return s.String()
}

func (s *QueryDepositCharityResponse) SetReqMsgId(v string) *QueryDepositCharityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDepositCharityResponse) SetResultCode(v string) *QueryDepositCharityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDepositCharityResponse) SetResultMsg(v string) *QueryDepositCharityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDepositCharityResponse) SetOrderId(v string) *QueryDepositCharityResponse {
	s.OrderId = &v
	return s
}

func (s *QueryDepositCharityResponse) SetServiceId(v string) *QueryDepositCharityResponse {
	s.ServiceId = &v
	return s
}

func (s *QueryDepositCharityResponse) SetBaseInfoJson(v string) *QueryDepositCharityResponse {
	s.BaseInfoJson = &v
	return s
}

func (s *QueryDepositCharityResponse) SetExtensionInfoJson(v string) *QueryDepositCharityResponse {
	s.ExtensionInfoJson = &v
	return s
}

func (s *QueryDepositCharityResponse) SetTxHash(v string) *QueryDepositCharityResponse {
	s.TxHash = &v
	return s
}

func (s *QueryDepositCharityResponse) SetBlockNumber(v int64) *QueryDepositCharityResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryDepositCharityResponse) SetTimestamp(v int64) *QueryDepositCharityResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryDepositCharityResponse) SetFileUrl(v string) *QueryDepositCharityResponse {
	s.FileUrl = &v
	return s
}

func (s *QueryDepositCharityResponse) SetFileId(v string) *QueryDepositCharityResponse {
	s.FileId = &v
	return s
}

func (s *QueryDepositCharityResponse) SetFileHash(v string) *QueryDepositCharityResponse {
	s.FileHash = &v
	return s
}

type CreateDepositCharityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s CreateDepositCharityRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositCharityRequest) GoString() string {
	return s.String()
}

func (s *CreateDepositCharityRequest) SetAuthToken(v string) *CreateDepositCharityRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepositCharityRequest) SetProductInstanceId(v string) *CreateDepositCharityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDepositCharityRequest) SetOrderId(v string) *CreateDepositCharityRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDepositCharityRequest) SetServiceId(v string) *CreateDepositCharityRequest {
	s.ServiceId = &v
	return s
}

func (s *CreateDepositCharityRequest) SetBaseInfoJson(v string) *CreateDepositCharityRequest {
	s.BaseInfoJson = &v
	return s
}

func (s *CreateDepositCharityRequest) SetExtensionInfoJson(v string) *CreateDepositCharityRequest {
	s.ExtensionInfoJson = &v
	return s
}

func (s *CreateDepositCharityRequest) SetFileObject(v io.Reader) *CreateDepositCharityRequest {
	s.FileObject = v
	return s
}

func (s *CreateDepositCharityRequest) SetFileObjectName(v string) *CreateDepositCharityRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateDepositCharityRequest) SetFileId(v string) *CreateDepositCharityRequest {
	s.FileId = &v
	return s
}

type CreateDepositCharityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDepositCharityResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositCharityResponse) GoString() string {
	return s.String()
}

func (s *CreateDepositCharityResponse) SetReqMsgId(v string) *CreateDepositCharityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepositCharityResponse) SetResultCode(v string) *CreateDepositCharityResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepositCharityResponse) SetResultMsg(v string) *CreateDepositCharityResponse {
	s.ResultMsg = &v
	return s
}

type QueryDepositSweepstakesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s QueryDepositSweepstakesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositSweepstakesRequest) GoString() string {
	return s.String()
}

func (s *QueryDepositSweepstakesRequest) SetAuthToken(v string) *QueryDepositSweepstakesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDepositSweepstakesRequest) SetProductInstanceId(v string) *QueryDepositSweepstakesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDepositSweepstakesRequest) SetOrderId(v string) *QueryDepositSweepstakesRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDepositSweepstakesRequest) SetServiceId(v string) *QueryDepositSweepstakesRequest {
	s.ServiceId = &v
	return s
}

type QueryDepositSweepstakesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 交易时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 文件地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
}

func (s QueryDepositSweepstakesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositSweepstakesResponse) GoString() string {
	return s.String()
}

func (s *QueryDepositSweepstakesResponse) SetReqMsgId(v string) *QueryDepositSweepstakesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetResultCode(v string) *QueryDepositSweepstakesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetResultMsg(v string) *QueryDepositSweepstakesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetOrderId(v string) *QueryDepositSweepstakesResponse {
	s.OrderId = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetServiceId(v string) *QueryDepositSweepstakesResponse {
	s.ServiceId = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetBaseInfoJson(v string) *QueryDepositSweepstakesResponse {
	s.BaseInfoJson = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetExtensionInfoJson(v string) *QueryDepositSweepstakesResponse {
	s.ExtensionInfoJson = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetTxHash(v string) *QueryDepositSweepstakesResponse {
	s.TxHash = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetBlockNumber(v int64) *QueryDepositSweepstakesResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetTimestamp(v int64) *QueryDepositSweepstakesResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetFileUrl(v string) *QueryDepositSweepstakesResponse {
	s.FileUrl = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetFileId(v string) *QueryDepositSweepstakesResponse {
	s.FileId = &v
	return s
}

func (s *QueryDepositSweepstakesResponse) SetFileHash(v string) *QueryDepositSweepstakesResponse {
	s.FileHash = &v
	return s
}

type CreateDepositSweepstakesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务幂等id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty"`
	// 额外信息json
	ExtensionInfoJson *string `json:"extension_info_json,omitempty" xml:"extension_info_json,omitempty"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s CreateDepositSweepstakesRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositSweepstakesRequest) GoString() string {
	return s.String()
}

func (s *CreateDepositSweepstakesRequest) SetAuthToken(v string) *CreateDepositSweepstakesRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetProductInstanceId(v string) *CreateDepositSweepstakesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetOrderId(v string) *CreateDepositSweepstakesRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetServiceId(v string) *CreateDepositSweepstakesRequest {
	s.ServiceId = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetBaseInfoJson(v string) *CreateDepositSweepstakesRequest {
	s.BaseInfoJson = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetExtensionInfoJson(v string) *CreateDepositSweepstakesRequest {
	s.ExtensionInfoJson = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetFileObject(v io.Reader) *CreateDepositSweepstakesRequest {
	s.FileObject = v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetFileObjectName(v string) *CreateDepositSweepstakesRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateDepositSweepstakesRequest) SetFileId(v string) *CreateDepositSweepstakesRequest {
	s.FileId = &v
	return s
}

type CreateDepositSweepstakesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDepositSweepstakesResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositSweepstakesResponse) GoString() string {
	return s.String()
}

func (s *CreateDepositSweepstakesResponse) SetReqMsgId(v string) *CreateDepositSweepstakesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepositSweepstakesResponse) SetResultCode(v string) *CreateDepositSweepstakesResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepositSweepstakesResponse) SetResultMsg(v string) *CreateDepositSweepstakesResponse {
	s.ResultMsg = &v
	return s
}

type SetGeneralDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要存储的数据，推荐json格式
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s SetGeneralDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s SetGeneralDepositRequest) GoString() string {
	return s.String()
}

func (s *SetGeneralDepositRequest) SetAuthToken(v string) *SetGeneralDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *SetGeneralDepositRequest) SetProductInstanceId(v string) *SetGeneralDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetGeneralDepositRequest) SetId(v string) *SetGeneralDepositRequest {
	s.Id = &v
	return s
}

func (s *SetGeneralDepositRequest) SetData(v string) *SetGeneralDepositRequest {
	s.Data = &v
	return s
}

func (s *SetGeneralDepositRequest) SetServiceId(v string) *SetGeneralDepositRequest {
	s.ServiceId = &v
	return s
}

type SetGeneralDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约调用交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 合约调用交易块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 合约返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SetGeneralDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s SetGeneralDepositResponse) GoString() string {
	return s.String()
}

func (s *SetGeneralDepositResponse) SetReqMsgId(v string) *SetGeneralDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetGeneralDepositResponse) SetResultCode(v string) *SetGeneralDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *SetGeneralDepositResponse) SetResultMsg(v string) *SetGeneralDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetGeneralDepositResponse) SetTxHash(v string) *SetGeneralDepositResponse {
	s.TxHash = &v
	return s
}

func (s *SetGeneralDepositResponse) SetBlockNumber(v int64) *SetGeneralDepositResponse {
	s.BlockNumber = &v
	return s
}

func (s *SetGeneralDepositResponse) SetResult(v string) *SetGeneralDepositResponse {
	s.Result = &v
	return s
}

type GetGeneralDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
}

func (s GetGeneralDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralDepositRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralDepositRequest) SetAuthToken(v string) *GetGeneralDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralDepositRequest) SetProductInstanceId(v string) *GetGeneralDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralDepositRequest) SetId(v string) *GetGeneralDepositRequest {
	s.Id = &v
	return s
}

func (s *GetGeneralDepositRequest) SetServiceId(v string) *GetGeneralDepositRequest {
	s.ServiceId = &v
	return s
}

type GetGeneralDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用合约交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 合约调用交易块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 合约返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s GetGeneralDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralDepositResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralDepositResponse) SetReqMsgId(v string) *GetGeneralDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralDepositResponse) SetResultCode(v string) *GetGeneralDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralDepositResponse) SetResultMsg(v string) *GetGeneralDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralDepositResponse) SetTxHash(v string) *GetGeneralDepositResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralDepositResponse) SetBlockNumber(v int64) *GetGeneralDepositResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralDepositResponse) SetResult(v string) *GetGeneralDepositResponse {
	s.Result = &v
	return s
}

type PayGeneralRightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约服务实例Id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 持有账号的地址
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 接收账号的地址
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 数据资产ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要转增的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PayGeneralRightsRequest) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralRightsRequest) GoString() string {
	return s.String()
}

func (s *PayGeneralRightsRequest) SetAuthToken(v string) *PayGeneralRightsRequest {
	s.AuthToken = &v
	return s
}

func (s *PayGeneralRightsRequest) SetProductInstanceId(v string) *PayGeneralRightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayGeneralRightsRequest) SetServiceId(v string) *PayGeneralRightsRequest {
	s.ServiceId = &v
	return s
}

func (s *PayGeneralRightsRequest) SetFrom(v string) *PayGeneralRightsRequest {
	s.From = &v
	return s
}

func (s *PayGeneralRightsRequest) SetTo(v string) *PayGeneralRightsRequest {
	s.To = &v
	return s
}

func (s *PayGeneralRightsRequest) SetId(v int64) *PayGeneralRightsRequest {
	s.Id = &v
	return s
}

func (s *PayGeneralRightsRequest) SetAmount(v int64) *PayGeneralRightsRequest {
	s.Amount = &v
	return s
}

func (s *PayGeneralRightsRequest) SetData(v string) *PayGeneralRightsRequest {
	s.Data = &v
	return s
}

type PayGeneralRightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约调用交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 合约调用交易块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 合约返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
}

func (s PayGeneralRightsResponse) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralRightsResponse) GoString() string {
	return s.String()
}

func (s *PayGeneralRightsResponse) SetReqMsgId(v string) *PayGeneralRightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayGeneralRightsResponse) SetResultCode(v string) *PayGeneralRightsResponse {
	s.ResultCode = &v
	return s
}

func (s *PayGeneralRightsResponse) SetResultMsg(v string) *PayGeneralRightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayGeneralRightsResponse) SetTxHash(v string) *PayGeneralRightsResponse {
	s.TxHash = &v
	return s
}

func (s *PayGeneralRightsResponse) SetBlockNumber(v int64) *PayGeneralRightsResponse {
	s.BlockNumber = &v
	return s
}

func (s *PayGeneralRightsResponse) SetResult(v string) *PayGeneralRightsResponse {
	s.Result = &v
	return s
}

func (s *PayGeneralRightsResponse) SetCode(v int64) *PayGeneralRightsResponse {
	s.Code = &v
	return s
}

type UploadExtendRightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 扩展字段
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 作者或发型方
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
}

func (s UploadExtendRightsRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadExtendRightsRequest) GoString() string {
	return s.String()
}

func (s *UploadExtendRightsRequest) SetAuthToken(v string) *UploadExtendRightsRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadExtendRightsRequest) SetProductInstanceId(v string) *UploadExtendRightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadExtendRightsRequest) SetName(v string) *UploadExtendRightsRequest {
	s.Name = &v
	return s
}

func (s *UploadExtendRightsRequest) SetDescription(v string) *UploadExtendRightsRequest {
	s.Description = &v
	return s
}

func (s *UploadExtendRightsRequest) SetFileObject(v io.Reader) *UploadExtendRightsRequest {
	s.FileObject = v
	return s
}

func (s *UploadExtendRightsRequest) SetFileObjectName(v string) *UploadExtendRightsRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadExtendRightsRequest) SetFileId(v string) *UploadExtendRightsRequest {
	s.FileId = &v
	return s
}

func (s *UploadExtendRightsRequest) SetData(v string) *UploadExtendRightsRequest {
	s.Data = &v
	return s
}

func (s *UploadExtendRightsRequest) SetAuthor(v string) *UploadExtendRightsRequest {
	s.Author = &v
	return s
}

type UploadExtendRightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据资产id
	RightsId *int64 `json:"rights_id,omitempty" xml:"rights_id,omitempty"`
}

func (s UploadExtendRightsResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadExtendRightsResponse) GoString() string {
	return s.String()
}

func (s *UploadExtendRightsResponse) SetReqMsgId(v string) *UploadExtendRightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadExtendRightsResponse) SetResultCode(v string) *UploadExtendRightsResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadExtendRightsResponse) SetResultMsg(v string) *UploadExtendRightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadExtendRightsResponse) SetRightsId(v int64) *UploadExtendRightsResponse {
	s.RightsId = &v
	return s
}

type CreateExtendRightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 账号名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
}

func (s CreateExtendRightsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateExtendRightsRequest) GoString() string {
	return s.String()
}

func (s *CreateExtendRightsRequest) SetAuthToken(v string) *CreateExtendRightsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateExtendRightsRequest) SetProductInstanceId(v string) *CreateExtendRightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateExtendRightsRequest) SetServiceId(v string) *CreateExtendRightsRequest {
	s.ServiceId = &v
	return s
}

func (s *CreateExtendRightsRequest) SetAccountName(v string) *CreateExtendRightsRequest {
	s.AccountName = &v
	return s
}

type CreateExtendRightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上账户地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
}

func (s CreateExtendRightsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateExtendRightsResponse) GoString() string {
	return s.String()
}

func (s *CreateExtendRightsResponse) SetReqMsgId(v string) *CreateExtendRightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateExtendRightsResponse) SetResultCode(v string) *CreateExtendRightsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateExtendRightsResponse) SetResultMsg(v string) *CreateExtendRightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateExtendRightsResponse) SetAddress(v string) *CreateExtendRightsResponse {
	s.Address = &v
	return s
}

type RegisterGeneralRightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 创建链上账户时指定的accountName
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 通过调用托管资源接口返回的资源id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要铸造的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展参数
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterGeneralRightsRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralRightsRequest) GoString() string {
	return s.String()
}

func (s *RegisterGeneralRightsRequest) SetAuthToken(v string) *RegisterGeneralRightsRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetProductInstanceId(v string) *RegisterGeneralRightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetServiceId(v string) *RegisterGeneralRightsRequest {
	s.ServiceId = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetAccount(v string) *RegisterGeneralRightsRequest {
	s.Account = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetId(v int64) *RegisterGeneralRightsRequest {
	s.Id = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetAmount(v int64) *RegisterGeneralRightsRequest {
	s.Amount = &v
	return s
}

func (s *RegisterGeneralRightsRequest) SetData(v string) *RegisterGeneralRightsRequest {
	s.Data = &v
	return s
}

type RegisterGeneralRightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约调用交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 合约调用交易块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 合约返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
}

func (s RegisterGeneralRightsResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralRightsResponse) GoString() string {
	return s.String()
}

func (s *RegisterGeneralRightsResponse) SetReqMsgId(v string) *RegisterGeneralRightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetResultCode(v string) *RegisterGeneralRightsResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetResultMsg(v string) *RegisterGeneralRightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetTxHash(v string) *RegisterGeneralRightsResponse {
	s.TxHash = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetBlockNumber(v int64) *RegisterGeneralRightsResponse {
	s.BlockNumber = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetResult(v string) *RegisterGeneralRightsResponse {
	s.Result = &v
	return s
}

func (s *RegisterGeneralRightsResponse) SetCode(v int64) *RegisterGeneralRightsResponse {
	s.Code = &v
	return s
}

type GetGeneralRightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约示例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 数据资产id
	TokenId *int64 `json:"token_id,omitempty" xml:"token_id,omitempty" require:"true"`
}

func (s GetGeneralRightsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralRightsRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralRightsRequest) SetAuthToken(v string) *GetGeneralRightsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralRightsRequest) SetProductInstanceId(v string) *GetGeneralRightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralRightsRequest) SetServiceId(v string) *GetGeneralRightsRequest {
	s.ServiceId = &v
	return s
}

func (s *GetGeneralRightsRequest) SetTokenId(v int64) *GetGeneralRightsRequest {
	s.TokenId = &v
	return s
}

type GetGeneralRightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约调用交易哈希
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 合约调用交易块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 合约返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
}

func (s GetGeneralRightsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralRightsResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralRightsResponse) SetReqMsgId(v string) *GetGeneralRightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralRightsResponse) SetResultCode(v string) *GetGeneralRightsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralRightsResponse) SetResultMsg(v string) *GetGeneralRightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralRightsResponse) SetTxHash(v string) *GetGeneralRightsResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralRightsResponse) SetBlockNumber(v int64) *GetGeneralRightsResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralRightsResponse) SetResult(v string) *GetGeneralRightsResponse {
	s.Result = &v
	return s
}

func (s *GetGeneralRightsResponse) SetCode(v int64) *GetGeneralRightsResponse {
	s.Code = &v
	return s
}

type RegisterGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 自定义Id,重复则更新
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true" maxLength:"64" minLength:"0"`
	// 企业营业证编号，或唯一ID
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 企业名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"100" minLength:"0"`
}

func (s RegisterGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *RegisterGeneralDivideRequest) SetAuthToken(v string) *RegisterGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterGeneralDivideRequest) SetProductInstanceId(v string) *RegisterGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterGeneralDivideRequest) SetServiceId(v string) *RegisterGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *RegisterGeneralDivideRequest) SetId(v string) *RegisterGeneralDivideRequest {
	s.Id = &v
	return s
}

func (s *RegisterGeneralDivideRequest) SetCode(v string) *RegisterGeneralDivideRequest {
	s.Code = &v
	return s
}

func (s *RegisterGeneralDivideRequest) SetName(v string) *RegisterGeneralDivideRequest {
	s.Name = &v
	return s
}

type RegisterGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s RegisterGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *RegisterGeneralDivideResponse) SetReqMsgId(v string) *RegisterGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetResultCode(v string) *RegisterGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetResultMsg(v string) *RegisterGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetTxHash(v string) *RegisterGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetBlockNumber(v int64) *RegisterGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetCode(v int64) *RegisterGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *RegisterGeneralDivideResponse) SetResult(v string) *RegisterGeneralDivideResponse {
	s.Result = &v
	return s
}

type QueryGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账方Id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s QueryGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *QueryGeneralDivideRequest) SetAuthToken(v string) *QueryGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGeneralDivideRequest) SetProductInstanceId(v string) *QueryGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGeneralDivideRequest) SetServiceId(v string) *QueryGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *QueryGeneralDivideRequest) SetId(v string) *QueryGeneralDivideRequest {
	s.Id = &v
	return s
}

type QueryGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *QueryGeneralDivideResponse) SetReqMsgId(v string) *QueryGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetResultCode(v string) *QueryGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetResultMsg(v string) *QueryGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetTxHash(v string) *QueryGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetBlockNumber(v int64) *QueryGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetCode(v int64) *QueryGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *QueryGeneralDivideResponse) SetResult(v string) *QueryGeneralDivideResponse {
	s.Result = &v
	return s
}

type SetGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 自定义分账规则唯一ID
	RuleId *string `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true" maxLength:"64" minLength:"0"`
	// 分账方，分账方不能重复配置
	RuleItemList []*RuleItem `json:"rule_item_list,omitempty" xml:"rule_item_list,omitempty" require:"true" type:"Repeated"`
}

func (s SetGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s SetGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *SetGeneralDivideRequest) SetAuthToken(v string) *SetGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *SetGeneralDivideRequest) SetProductInstanceId(v string) *SetGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetGeneralDivideRequest) SetServiceId(v string) *SetGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *SetGeneralDivideRequest) SetRuleId(v string) *SetGeneralDivideRequest {
	s.RuleId = &v
	return s
}

func (s *SetGeneralDivideRequest) SetRuleItemList(v []*RuleItem) *SetGeneralDivideRequest {
	s.RuleItemList = v
	return s
}

type SetGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SetGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s SetGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *SetGeneralDivideResponse) SetReqMsgId(v string) *SetGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetGeneralDivideResponse) SetResultCode(v string) *SetGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *SetGeneralDivideResponse) SetResultMsg(v string) *SetGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetGeneralDivideResponse) SetTxHash(v string) *SetGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *SetGeneralDivideResponse) SetBlockNumber(v int64) *SetGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *SetGeneralDivideResponse) SetCode(v int64) *SetGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *SetGeneralDivideResponse) SetResult(v string) *SetGeneralDivideResponse {
	s.Result = &v
	return s
}

type GetGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账规则ID
	RuleId *string `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
}

func (s GetGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralDivideRequest) SetAuthToken(v string) *GetGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralDivideRequest) SetProductInstanceId(v string) *GetGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralDivideRequest) SetServiceId(v string) *GetGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *GetGeneralDivideRequest) SetRuleId(v string) *GetGeneralDivideRequest {
	s.RuleId = &v
	return s
}

type GetGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s GetGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralDivideResponse) SetReqMsgId(v string) *GetGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralDivideResponse) SetResultCode(v string) *GetGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralDivideResponse) SetResultMsg(v string) *GetGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralDivideResponse) SetTxHash(v string) *GetGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralDivideResponse) SetBlockNumber(v int64) *GetGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralDivideResponse) SetCode(v int64) *GetGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *GetGeneralDivideResponse) SetResult(v string) *GetGeneralDivideResponse {
	s.Result = &v
	return s
}

type DeleteGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账方Id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *DeleteGeneralDivideRequest) SetAuthToken(v string) *DeleteGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteGeneralDivideRequest) SetProductInstanceId(v string) *DeleteGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteGeneralDivideRequest) SetServiceId(v string) *DeleteGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *DeleteGeneralDivideRequest) SetId(v string) *DeleteGeneralDivideRequest {
	s.Id = &v
	return s
}

type DeleteGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DeleteGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *DeleteGeneralDivideResponse) SetReqMsgId(v string) *DeleteGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetResultCode(v string) *DeleteGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetResultMsg(v string) *DeleteGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetTxHash(v string) *DeleteGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetBlockNumber(v int64) *DeleteGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetCode(v int64) *DeleteGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *DeleteGeneralDivideResponse) SetResult(v string) *DeleteGeneralDivideResponse {
	s.Result = &v
	return s
}

type PayGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 订单编号 ( 编号不能重复)
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"256" minLength:"0"`
	// 发起人
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 付款人
	Payer *string `json:"payer,omitempty" xml:"payer,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 支付方式
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 支付时间
	PayTime *string `json:"pay_time,omitempty" xml:"pay_time,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 支付状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 收款人
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true" maxLength:"100" minLength:"0"`
	// 订单金额（保留3位小数）
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 分账规则id （根据规则进行分账）
	RuleId *string `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
	// 扩展json
	Data *string `json:"data,omitempty" xml:"data,omitempty" maxLength:"2000" minLength:"0"`
}

func (s PayGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *PayGeneralDivideRequest) SetAuthToken(v string) *PayGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *PayGeneralDivideRequest) SetProductInstanceId(v string) *PayGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayGeneralDivideRequest) SetServiceId(v string) *PayGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *PayGeneralDivideRequest) SetOrderId(v string) *PayGeneralDivideRequest {
	s.OrderId = &v
	return s
}

func (s *PayGeneralDivideRequest) SetFrom(v string) *PayGeneralDivideRequest {
	s.From = &v
	return s
}

func (s *PayGeneralDivideRequest) SetPayer(v string) *PayGeneralDivideRequest {
	s.Payer = &v
	return s
}

func (s *PayGeneralDivideRequest) SetPayType(v string) *PayGeneralDivideRequest {
	s.PayType = &v
	return s
}

func (s *PayGeneralDivideRequest) SetPayTime(v string) *PayGeneralDivideRequest {
	s.PayTime = &v
	return s
}

func (s *PayGeneralDivideRequest) SetStatus(v string) *PayGeneralDivideRequest {
	s.Status = &v
	return s
}

func (s *PayGeneralDivideRequest) SetTo(v string) *PayGeneralDivideRequest {
	s.To = &v
	return s
}

func (s *PayGeneralDivideRequest) SetAmount(v string) *PayGeneralDivideRequest {
	s.Amount = &v
	return s
}

func (s *PayGeneralDivideRequest) SetRuleId(v string) *PayGeneralDivideRequest {
	s.RuleId = &v
	return s
}

func (s *PayGeneralDivideRequest) SetData(v string) *PayGeneralDivideRequest {
	s.Data = &v
	return s
}

type PayGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PayGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *PayGeneralDivideResponse) SetReqMsgId(v string) *PayGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayGeneralDivideResponse) SetResultCode(v string) *PayGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *PayGeneralDivideResponse) SetResultMsg(v string) *PayGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayGeneralDivideResponse) SetTxHash(v string) *PayGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *PayGeneralDivideResponse) SetBlockNumber(v int64) *PayGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *PayGeneralDivideResponse) SetCode(v int64) *PayGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *PayGeneralDivideResponse) SetResult(v string) *PayGeneralDivideResponse {
	s.Result = &v
	return s
}

type PullGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账方Id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s PullGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s PullGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *PullGeneralDivideRequest) SetAuthToken(v string) *PullGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *PullGeneralDivideRequest) SetProductInstanceId(v string) *PullGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullGeneralDivideRequest) SetServiceId(v string) *PullGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *PullGeneralDivideRequest) SetId(v string) *PullGeneralDivideRequest {
	s.Id = &v
	return s
}

type PullGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PullGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s PullGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *PullGeneralDivideResponse) SetReqMsgId(v string) *PullGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullGeneralDivideResponse) SetResultCode(v string) *PullGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *PullGeneralDivideResponse) SetResultMsg(v string) *PullGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullGeneralDivideResponse) SetTxHash(v string) *PullGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *PullGeneralDivideResponse) SetBlockNumber(v int64) *PullGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *PullGeneralDivideResponse) SetCode(v int64) *PullGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *PullGeneralDivideResponse) SetResult(v string) *PullGeneralDivideResponse {
	s.Result = &v
	return s
}

type BatchqueryGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s BatchqueryGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryGeneralDivideRequest) SetAuthToken(v string) *BatchqueryGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryGeneralDivideRequest) SetProductInstanceId(v string) *BatchqueryGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryGeneralDivideRequest) SetServiceId(v string) *BatchqueryGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *BatchqueryGeneralDivideRequest) SetOrderId(v string) *BatchqueryGeneralDivideRequest {
	s.OrderId = &v
	return s
}

type BatchqueryGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s BatchqueryGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryGeneralDivideResponse) SetReqMsgId(v string) *BatchqueryGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetResultCode(v string) *BatchqueryGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetResultMsg(v string) *BatchqueryGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetTxHash(v string) *BatchqueryGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetBlockNumber(v int64) *BatchqueryGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetCode(v int64) *BatchqueryGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *BatchqueryGeneralDivideResponse) SetResult(v string) *BatchqueryGeneralDivideResponse {
	s.Result = &v
	return s
}

type GetGeneralTourismRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 数据资产id
	TokenId *int64 `json:"token_id,omitempty" xml:"token_id,omitempty" require:"true"`
}

func (s GetGeneralTourismRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralTourismRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralTourismRequest) SetAuthToken(v string) *GetGeneralTourismRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralTourismRequest) SetProductInstanceId(v string) *GetGeneralTourismRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralTourismRequest) SetServiceId(v string) *GetGeneralTourismRequest {
	s.ServiceId = &v
	return s
}

func (s *GetGeneralTourismRequest) SetTokenId(v int64) *GetGeneralTourismRequest {
	s.TokenId = &v
	return s
}

type GetGeneralTourismResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s GetGeneralTourismResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralTourismResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralTourismResponse) SetReqMsgId(v string) *GetGeneralTourismResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralTourismResponse) SetResultCode(v string) *GetGeneralTourismResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralTourismResponse) SetResultMsg(v string) *GetGeneralTourismResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralTourismResponse) SetTxHash(v string) *GetGeneralTourismResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralTourismResponse) SetBlockNumber(v int64) *GetGeneralTourismResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralTourismResponse) SetCode(v int64) *GetGeneralTourismResponse {
	s.Code = &v
	return s
}

func (s *GetGeneralTourismResponse) SetResult(v string) *GetGeneralTourismResponse {
	s.Result = &v
	return s
}

type RegisterGeneralTourismRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 创建链上账户时指定的accountName
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 通过调用托管资源接口返回的资源id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要铸造的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展参数
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterGeneralTourismRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralTourismRequest) GoString() string {
	return s.String()
}

func (s *RegisterGeneralTourismRequest) SetAuthToken(v string) *RegisterGeneralTourismRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetProductInstanceId(v string) *RegisterGeneralTourismRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetServiceId(v string) *RegisterGeneralTourismRequest {
	s.ServiceId = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetAccount(v string) *RegisterGeneralTourismRequest {
	s.Account = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetId(v int64) *RegisterGeneralTourismRequest {
	s.Id = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetAmount(v int64) *RegisterGeneralTourismRequest {
	s.Amount = &v
	return s
}

func (s *RegisterGeneralTourismRequest) SetData(v string) *RegisterGeneralTourismRequest {
	s.Data = &v
	return s
}

type RegisterGeneralTourismResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s RegisterGeneralTourismResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralTourismResponse) GoString() string {
	return s.String()
}

func (s *RegisterGeneralTourismResponse) SetReqMsgId(v string) *RegisterGeneralTourismResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetResultCode(v string) *RegisterGeneralTourismResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetResultMsg(v string) *RegisterGeneralTourismResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetTxHash(v string) *RegisterGeneralTourismResponse {
	s.TxHash = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetBlockNumber(v int64) *RegisterGeneralTourismResponse {
	s.BlockNumber = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetCode(v int64) *RegisterGeneralTourismResponse {
	s.Code = &v
	return s
}

func (s *RegisterGeneralTourismResponse) SetResult(v string) *RegisterGeneralTourismResponse {
	s.Result = &v
	return s
}

type PayGeneralTourismRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 持有账号的地址
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 接收账号的地址
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 数据资产ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要转增的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PayGeneralTourismRequest) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralTourismRequest) GoString() string {
	return s.String()
}

func (s *PayGeneralTourismRequest) SetAuthToken(v string) *PayGeneralTourismRequest {
	s.AuthToken = &v
	return s
}

func (s *PayGeneralTourismRequest) SetProductInstanceId(v string) *PayGeneralTourismRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayGeneralTourismRequest) SetServiceId(v string) *PayGeneralTourismRequest {
	s.ServiceId = &v
	return s
}

func (s *PayGeneralTourismRequest) SetFrom(v string) *PayGeneralTourismRequest {
	s.From = &v
	return s
}

func (s *PayGeneralTourismRequest) SetTo(v string) *PayGeneralTourismRequest {
	s.To = &v
	return s
}

func (s *PayGeneralTourismRequest) SetId(v int64) *PayGeneralTourismRequest {
	s.Id = &v
	return s
}

func (s *PayGeneralTourismRequest) SetAmount(v int64) *PayGeneralTourismRequest {
	s.Amount = &v
	return s
}

func (s *PayGeneralTourismRequest) SetData(v string) *PayGeneralTourismRequest {
	s.Data = &v
	return s
}

type PayGeneralTourismResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PayGeneralTourismResponse) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralTourismResponse) GoString() string {
	return s.String()
}

func (s *PayGeneralTourismResponse) SetReqMsgId(v string) *PayGeneralTourismResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayGeneralTourismResponse) SetResultCode(v string) *PayGeneralTourismResponse {
	s.ResultCode = &v
	return s
}

func (s *PayGeneralTourismResponse) SetResultMsg(v string) *PayGeneralTourismResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayGeneralTourismResponse) SetTxHash(v string) *PayGeneralTourismResponse {
	s.TxHash = &v
	return s
}

func (s *PayGeneralTourismResponse) SetBlockNumber(v int64) *PayGeneralTourismResponse {
	s.BlockNumber = &v
	return s
}

func (s *PayGeneralTourismResponse) SetCode(v int64) *PayGeneralTourismResponse {
	s.Code = &v
	return s
}

func (s *PayGeneralTourismResponse) SetResult(v string) *PayGeneralTourismResponse {
	s.Result = &v
	return s
}

type GetGeneralTicketsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 数据资产id
	TokenId *int64 `json:"token_id,omitempty" xml:"token_id,omitempty" require:"true"`
}

func (s GetGeneralTicketsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralTicketsRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralTicketsRequest) SetAuthToken(v string) *GetGeneralTicketsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralTicketsRequest) SetProductInstanceId(v string) *GetGeneralTicketsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralTicketsRequest) SetServiceId(v string) *GetGeneralTicketsRequest {
	s.ServiceId = &v
	return s
}

func (s *GetGeneralTicketsRequest) SetTokenId(v int64) *GetGeneralTicketsRequest {
	s.TokenId = &v
	return s
}

type GetGeneralTicketsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s GetGeneralTicketsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralTicketsResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralTicketsResponse) SetReqMsgId(v string) *GetGeneralTicketsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetResultCode(v string) *GetGeneralTicketsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetResultMsg(v string) *GetGeneralTicketsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetTxHash(v string) *GetGeneralTicketsResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetBlockNumber(v int64) *GetGeneralTicketsResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetCode(v int64) *GetGeneralTicketsResponse {
	s.Code = &v
	return s
}

func (s *GetGeneralTicketsResponse) SetResult(v string) *GetGeneralTicketsResponse {
	s.Result = &v
	return s
}

type RegisterGeneralTicketsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 创建链上账户时指定的accountName
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 通过调用托管资源接口返回的资源id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要铸造的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展参数
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterGeneralTicketsRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralTicketsRequest) GoString() string {
	return s.String()
}

func (s *RegisterGeneralTicketsRequest) SetAuthToken(v string) *RegisterGeneralTicketsRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetProductInstanceId(v string) *RegisterGeneralTicketsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetServiceId(v string) *RegisterGeneralTicketsRequest {
	s.ServiceId = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetAccount(v string) *RegisterGeneralTicketsRequest {
	s.Account = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetId(v int64) *RegisterGeneralTicketsRequest {
	s.Id = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetAmount(v int64) *RegisterGeneralTicketsRequest {
	s.Amount = &v
	return s
}

func (s *RegisterGeneralTicketsRequest) SetData(v string) *RegisterGeneralTicketsRequest {
	s.Data = &v
	return s
}

type RegisterGeneralTicketsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s RegisterGeneralTicketsResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterGeneralTicketsResponse) GoString() string {
	return s.String()
}

func (s *RegisterGeneralTicketsResponse) SetReqMsgId(v string) *RegisterGeneralTicketsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetResultCode(v string) *RegisterGeneralTicketsResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetResultMsg(v string) *RegisterGeneralTicketsResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetTxHash(v string) *RegisterGeneralTicketsResponse {
	s.TxHash = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetBlockNumber(v int64) *RegisterGeneralTicketsResponse {
	s.BlockNumber = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetCode(v int64) *RegisterGeneralTicketsResponse {
	s.Code = &v
	return s
}

func (s *RegisterGeneralTicketsResponse) SetResult(v string) *RegisterGeneralTicketsResponse {
	s.Result = &v
	return s
}

type PayGeneralTicketsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 持有账号的地址
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 接收账号的地址
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 数据资产ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 要转增的数据资产数量
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 扩展数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PayGeneralTicketsRequest) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralTicketsRequest) GoString() string {
	return s.String()
}

func (s *PayGeneralTicketsRequest) SetAuthToken(v string) *PayGeneralTicketsRequest {
	s.AuthToken = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetProductInstanceId(v string) *PayGeneralTicketsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetServiceId(v string) *PayGeneralTicketsRequest {
	s.ServiceId = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetFrom(v string) *PayGeneralTicketsRequest {
	s.From = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetTo(v string) *PayGeneralTicketsRequest {
	s.To = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetId(v int64) *PayGeneralTicketsRequest {
	s.Id = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetAmount(v int64) *PayGeneralTicketsRequest {
	s.Amount = &v
	return s
}

func (s *PayGeneralTicketsRequest) SetData(v string) *PayGeneralTicketsRequest {
	s.Data = &v
	return s
}

type PayGeneralTicketsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PayGeneralTicketsResponse) String() string {
	return tea.Prettify(s)
}

func (s PayGeneralTicketsResponse) GoString() string {
	return s.String()
}

func (s *PayGeneralTicketsResponse) SetReqMsgId(v string) *PayGeneralTicketsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetResultCode(v string) *PayGeneralTicketsResponse {
	s.ResultCode = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetResultMsg(v string) *PayGeneralTicketsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetTxHash(v string) *PayGeneralTicketsResponse {
	s.TxHash = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetBlockNumber(v int64) *PayGeneralTicketsResponse {
	s.BlockNumber = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetCode(v int64) *PayGeneralTicketsResponse {
	s.Code = &v
	return s
}

func (s *PayGeneralTicketsResponse) SetResult(v string) *PayGeneralTicketsResponse {
	s.Result = &v
	return s
}

type UpdateGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账规则ID
	RuleId *string `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
	// 分账方用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 确认状态，0: 待确认；1:确认；2：拒绝
	StrStatus *string `json:"str_status,omitempty" xml:"str_status,omitempty" require:"true"`
}

func (s UpdateGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *UpdateGeneralDivideRequest) SetAuthToken(v string) *UpdateGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGeneralDivideRequest) SetProductInstanceId(v string) *UpdateGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGeneralDivideRequest) SetServiceId(v string) *UpdateGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *UpdateGeneralDivideRequest) SetRuleId(v string) *UpdateGeneralDivideRequest {
	s.RuleId = &v
	return s
}

func (s *UpdateGeneralDivideRequest) SetUserId(v string) *UpdateGeneralDivideRequest {
	s.UserId = &v
	return s
}

func (s *UpdateGeneralDivideRequest) SetStrStatus(v string) *UpdateGeneralDivideRequest {
	s.StrStatus = &v
	return s
}

type UpdateGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易HASH
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *UpdateGeneralDivideResponse) SetReqMsgId(v string) *UpdateGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetResultCode(v string) *UpdateGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetResultMsg(v string) *UpdateGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetTxHash(v string) *UpdateGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetBlockNumber(v int64) *UpdateGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetCode(v int64) *UpdateGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *UpdateGeneralDivideResponse) SetResult(v string) *UpdateGeneralDivideResponse {
	s.Result = &v
	return s
}

type ListGeneralDivideRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 分账方ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 分账列表起始序号
	StrStartIndex *string `json:"str_start_index,omitempty" xml:"str_start_index,omitempty" require:"true"`
	// 分账明细查询截止序号
	StrEndIndex *string `json:"str_end_index,omitempty" xml:"str_end_index,omitempty" require:"true"`
}

func (s ListGeneralDivideRequest) String() string {
	return tea.Prettify(s)
}

func (s ListGeneralDivideRequest) GoString() string {
	return s.String()
}

func (s *ListGeneralDivideRequest) SetAuthToken(v string) *ListGeneralDivideRequest {
	s.AuthToken = &v
	return s
}

func (s *ListGeneralDivideRequest) SetProductInstanceId(v string) *ListGeneralDivideRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListGeneralDivideRequest) SetServiceId(v string) *ListGeneralDivideRequest {
	s.ServiceId = &v
	return s
}

func (s *ListGeneralDivideRequest) SetUserId(v string) *ListGeneralDivideRequest {
	s.UserId = &v
	return s
}

func (s *ListGeneralDivideRequest) SetStrStartIndex(v string) *ListGeneralDivideRequest {
	s.StrStartIndex = &v
	return s
}

func (s *ListGeneralDivideRequest) SetStrEndIndex(v string) *ListGeneralDivideRequest {
	s.StrEndIndex = &v
	return s
}

type ListGeneralDivideResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 返回结果，json格式，data为分账明细数据
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ListGeneralDivideResponse) String() string {
	return tea.Prettify(s)
}

func (s ListGeneralDivideResponse) GoString() string {
	return s.String()
}

func (s *ListGeneralDivideResponse) SetReqMsgId(v string) *ListGeneralDivideResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListGeneralDivideResponse) SetResultCode(v string) *ListGeneralDivideResponse {
	s.ResultCode = &v
	return s
}

func (s *ListGeneralDivideResponse) SetResultMsg(v string) *ListGeneralDivideResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListGeneralDivideResponse) SetTxHash(v string) *ListGeneralDivideResponse {
	s.TxHash = &v
	return s
}

func (s *ListGeneralDivideResponse) SetBlockNumber(v int64) *ListGeneralDivideResponse {
	s.BlockNumber = &v
	return s
}

func (s *ListGeneralDivideResponse) SetCode(v int64) *ListGeneralDivideResponse {
	s.Code = &v
	return s
}

func (s *ListGeneralDivideResponse) SetResult(v string) *ListGeneralDivideResponse {
	s.Result = &v
	return s
}

type GetGeneralRightsbalanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合约服务实例id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 账号的地址
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 数据资产ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s GetGeneralRightsbalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralRightsbalanceRequest) GoString() string {
	return s.String()
}

func (s *GetGeneralRightsbalanceRequest) SetAuthToken(v string) *GetGeneralRightsbalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGeneralRightsbalanceRequest) SetProductInstanceId(v string) *GetGeneralRightsbalanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGeneralRightsbalanceRequest) SetServiceId(v string) *GetGeneralRightsbalanceRequest {
	s.ServiceId = &v
	return s
}

func (s *GetGeneralRightsbalanceRequest) SetAccount(v string) *GetGeneralRightsbalanceRequest {
	s.Account = &v
	return s
}

func (s *GetGeneralRightsbalanceRequest) SetId(v int64) *GetGeneralRightsbalanceRequest {
	s.Id = &v
	return s
}

type GetGeneralRightsbalanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 区块高度
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty"`
	// 执行结果，0:成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 合约接口返回结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s GetGeneralRightsbalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGeneralRightsbalanceResponse) GoString() string {
	return s.String()
}

func (s *GetGeneralRightsbalanceResponse) SetReqMsgId(v string) *GetGeneralRightsbalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetResultCode(v string) *GetGeneralRightsbalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetResultMsg(v string) *GetGeneralRightsbalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetTxHash(v string) *GetGeneralRightsbalanceResponse {
	s.TxHash = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetBlockNumber(v int64) *GetGeneralRightsbalanceResponse {
	s.BlockNumber = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetCode(v int64) *GetGeneralRightsbalanceResponse {
	s.Code = &v
	return s
}

func (s *GetGeneralRightsbalanceResponse) SetResult(v string) *GetGeneralRightsbalanceResponse {
	s.Result = &v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
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
				"sdk_version":      tea.String("1.4.0"),
				"_prod_code":       tea.String("CAASPLATFORM"),
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
 * Description: 创建存证
 * Summary: 创建存证
 */
func (client *Client) CreateDeposit(request *CreateDepositRequest) (_result *CreateDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepositResponse{}
	_body, _err := client.CreateDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建存证
 * Summary: 创建存证
 */
func (client *Client) CreateDepositEx(request *CreateDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepositResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.caasplatform.deposit.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createDepositResponse := &CreateDepositResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createDepositResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 存证查询
 * Summary: 存证查询
 */
func (client *Client) QueryDeposit(request *QueryDepositRequest) (_result *QueryDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDepositResponse{}
	_body, _err := client.QueryDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 存证查询
 * Summary: 存证查询
 */
func (client *Client) QueryDepositEx(request *QueryDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证书存证合约-证书存证查询
 * Summary: 证书存证合约-证书存证查询
 */
func (client *Client) QueryDepositCertificate(request *QueryDepositCertificateRequest) (_result *QueryDepositCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDepositCertificateResponse{}
	_body, _err := client.QueryDepositCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证书存证合约-证书存证查询
 * Summary: 证书存证合约-证书存证查询
 */
func (client *Client) QueryDepositCertificateEx(request *QueryDepositCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDepositCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDepositCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.certificate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 证书存证合约-创建证书存证
 * Summary: 证书存证合约-创建证书存证
 */
func (client *Client) CreateDepositCertificate(request *CreateDepositCertificateRequest) (_result *CreateDepositCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepositCertificateResponse{}
	_body, _err := client.CreateDepositCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 证书存证合约-创建证书存证
 * Summary: 证书存证合约-创建证书存证
 */
func (client *Client) CreateDepositCertificateEx(request *CreateDepositCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepositCertificateResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.caasplatform.deposit.certificate.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createDepositCertificateResponse := &CreateDepositCertificateResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createDepositCertificateResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepositCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.certificate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 捐赠合约-捐赠证明查询
 * Summary: 捐赠合约-捐赠证明查询
 */
func (client *Client) QueryDepositCharity(request *QueryDepositCharityRequest) (_result *QueryDepositCharityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDepositCharityResponse{}
	_body, _err := client.QueryDepositCharityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 捐赠合约-捐赠证明查询
 * Summary: 捐赠合约-捐赠证明查询
 */
func (client *Client) QueryDepositCharityEx(request *QueryDepositCharityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDepositCharityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDepositCharityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.charity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 捐赠合约-创建捐赠证明
 * Summary: 捐赠合约-创建捐赠证明
 */
func (client *Client) CreateDepositCharity(request *CreateDepositCharityRequest) (_result *CreateDepositCharityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepositCharityResponse{}
	_body, _err := client.CreateDepositCharityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 捐赠合约-创建捐赠证明
 * Summary: 捐赠合约-创建捐赠证明
 */
func (client *Client) CreateDepositCharityEx(request *CreateDepositCharityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepositCharityResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.caasplatform.deposit.charity.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createDepositCharityResponse := &CreateDepositCharityResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createDepositCharityResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepositCharityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.charity.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 抽奖活动审计合约-中奖记录查询
 * Summary: 抽奖活动审计合约-中奖记录查询
 */
func (client *Client) QueryDepositSweepstakes(request *QueryDepositSweepstakesRequest) (_result *QueryDepositSweepstakesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDepositSweepstakesResponse{}
	_body, _err := client.QueryDepositSweepstakesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 抽奖活动审计合约-中奖记录查询
 * Summary: 抽奖活动审计合约-中奖记录查询
 */
func (client *Client) QueryDepositSweepstakesEx(request *QueryDepositSweepstakesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDepositSweepstakesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDepositSweepstakesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.sweepstakes.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 抽奖活动审计合约-创建活动记录
 * Summary: 抽奖活动审计合约-创建活动记录
 */
func (client *Client) CreateDepositSweepstakes(request *CreateDepositSweepstakesRequest) (_result *CreateDepositSweepstakesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepositSweepstakesResponse{}
	_body, _err := client.CreateDepositSweepstakesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 抽奖活动审计合约-创建活动记录
 * Summary: 抽奖活动审计合约-创建活动记录
 */
func (client *Client) CreateDepositSweepstakesEx(request *CreateDepositSweepstakesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepositSweepstakesResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.caasplatform.deposit.sweepstakes.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createDepositSweepstakesResponse := &CreateDepositSweepstakesResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createDepositSweepstakesResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepositSweepstakesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.deposit.sweepstakes.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用合约调用-结构化存储场景
 * Summary: 通用合约调用-结构化存储场景
 */
func (client *Client) SetGeneralDeposit(request *SetGeneralDepositRequest) (_result *SetGeneralDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetGeneralDepositResponse{}
	_body, _err := client.SetGeneralDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用合约调用-结构化存储场景
 * Summary: 通用合约调用-结构化存储场景
 */
func (client *Client) SetGeneralDepositEx(request *SetGeneralDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetGeneralDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetGeneralDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.deposit.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用合约调用-结构化查询场景
 * Summary: 通用合约调用-结构化查询场景
 */
func (client *Client) GetGeneralDeposit(request *GetGeneralDepositRequest) (_result *GetGeneralDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralDepositResponse{}
	_body, _err := client.GetGeneralDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用合约调用-结构化查询场景
 * Summary: 通用合约调用-结构化查询场景
 */
func (client *Client) GetGeneralDepositEx(request *GetGeneralDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.deposit.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-转赠
 * Summary: 通用合约调用-权益-转赠
 */
func (client *Client) PayGeneralRights(request *PayGeneralRightsRequest) (_result *PayGeneralRightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayGeneralRightsResponse{}
	_body, _err := client.PayGeneralRightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-转赠
 * Summary: 通用合约调用-权益-转赠
 */
func (client *Client) PayGeneralRightsEx(request *PayGeneralRightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayGeneralRightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayGeneralRightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.rights.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资源文件托管
 * Summary: 资源文件托管
 */
func (client *Client) UploadExtendRights(request *UploadExtendRightsRequest) (_result *UploadExtendRightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadExtendRightsResponse{}
	_body, _err := client.UploadExtendRightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资源文件托管
 * Summary: 资源文件托管
 */
func (client *Client) UploadExtendRightsEx(request *UploadExtendRightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadExtendRightsResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.caasplatform.extend.rights.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadExtendRightsResponse := &UploadExtendRightsResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadExtendRightsResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadExtendRightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.extend.rights.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建链上账户
 * Summary: 创建链上账户
 */
func (client *Client) CreateExtendRights(request *CreateExtendRightsRequest) (_result *CreateExtendRightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateExtendRightsResponse{}
	_body, _err := client.CreateExtendRightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建链上账户
 * Summary: 创建链上账户
 */
func (client *Client) CreateExtendRightsEx(request *CreateExtendRightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateExtendRightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateExtendRightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.extend.rights.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-铸造
 * Summary: 通用合约调用-权益-铸造
 */
func (client *Client) RegisterGeneralRights(request *RegisterGeneralRightsRequest) (_result *RegisterGeneralRightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterGeneralRightsResponse{}
	_body, _err := client.RegisterGeneralRightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-铸造
 * Summary: 通用合约调用-权益-铸造
 */
func (client *Client) RegisterGeneralRightsEx(request *RegisterGeneralRightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterGeneralRightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterGeneralRightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.rights.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-URL查询
 * Summary: 通用合约调用-权益- URL查询
 */
func (client *Client) GetGeneralRights(request *GetGeneralRightsRequest) (_result *GetGeneralRightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralRightsResponse{}
	_body, _err := client.GetGeneralRightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用合约调用-权益-URL查询
 * Summary: 通用合约调用-权益- URL查询
 */
func (client *Client) GetGeneralRightsEx(request *GetGeneralRightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralRightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralRightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.rights.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1.分账方最大数量限制50
2.id存在则更新分账方
3.存在分账记录的分账方不能被更新
 * Summary: 分账合约-配置分账方
*/
func (client *Client) RegisterGeneralDivide(request *RegisterGeneralDivideRequest) (_result *RegisterGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterGeneralDivideResponse{}
	_body, _err := client.RegisterGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1.分账方最大数量限制50
2.id存在则更新分账方
3.存在分账记录的分账方不能被更新
 * Summary: 分账合约-配置分账方
*/
func (client *Client) RegisterGeneralDivideEx(request *RegisterGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账合约-查询分账方
 * Summary: 分账合约-查询分账方
 */
func (client *Client) QueryGeneralDivide(request *QueryGeneralDivideRequest) (_result *QueryGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGeneralDivideResponse{}
	_body, _err := client.QueryGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账合约-查询分账方
 * Summary: 分账合约-查询分账方
 */
func (client *Client) QueryGeneralDivideEx(request *QueryGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1.分账规则id不能重复配置
2.至少配置一个分账方
3.分账方id需要已存在
4.分账份额保留2位小数,多余部分舍弃
5.分账份额需小于100 且大于0
6.总份额不能大于100
 * Summary: 分账合约-配置分账规则
*/
func (client *Client) SetGeneralDivide(request *SetGeneralDivideRequest) (_result *SetGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetGeneralDivideResponse{}
	_body, _err := client.SetGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1.分账规则id不能重复配置
2.至少配置一个分账方
3.分账方id需要已存在
4.分账份额保留2位小数,多余部分舍弃
5.分账份额需小于100 且大于0
6.总份额不能大于100
 * Summary: 分账合约-配置分账规则
*/
func (client *Client) SetGeneralDivideEx(request *SetGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账合约-查询分账规则
 * Summary: 分账合约-查询分账规则
 */
func (client *Client) GetGeneralDivide(request *GetGeneralDivideRequest) (_result *GetGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralDivideResponse{}
	_body, _err := client.GetGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账合约-查询分账规则
 * Summary: 分账合约-查询分账规则
 */
func (client *Client) GetGeneralDivideEx(request *GetGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1.分账方id需存在
2.已分账的分账方不能删除
3.已配置分账规则的分账方不能删除
 * Summary: 分账合约-删除分账方
*/
func (client *Client) DeleteGeneralDivide(request *DeleteGeneralDivideRequest) (_result *DeleteGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteGeneralDivideResponse{}
	_body, _err := client.DeleteGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1.分账方id需存在
2.已分账的分账方不能删除
3.已配置分账规则的分账方不能删除
 * Summary: 分账合约-删除分账方
*/
func (client *Client) DeleteGeneralDivideEx(request *DeleteGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1.订单id不能重复
2.金额不能小于0，金额保留3位小数多余部分舍弃
3.分账方id需要已存在
4.分账规则id需已存在
 * Summary: 分账合约-发起分账
*/
func (client *Client) PayGeneralDivide(request *PayGeneralDivideRequest) (_result *PayGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayGeneralDivideResponse{}
	_body, _err := client.PayGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1.订单id不能重复
2.金额不能小于0，金额保留3位小数多余部分舍弃
3.分账方id需要已存在
4.分账规则id需已存在
 * Summary: 分账合约-发起分账
*/
func (client *Client) PayGeneralDivideEx(request *PayGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账合约-获取分账方余额
 * Summary: 分账合约-获取分账方余额
 */
func (client *Client) PullGeneralDivide(request *PullGeneralDivideRequest) (_result *PullGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullGeneralDivideResponse{}
	_body, _err := client.PullGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账合约-获取分账方余额
 * Summary: 分账合约-获取分账方余额
 */
func (client *Client) PullGeneralDivideEx(request *PullGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分账合约-获取订单分账信息
 * Summary: 分账合约-获取订单分账信息
 */
func (client *Client) BatchqueryGeneralDivide(request *BatchqueryGeneralDivideRequest) (_result *BatchqueryGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryGeneralDivideResponse{}
	_body, _err := client.BatchqueryGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账合约-获取订单分账信息
 * Summary: 分账合约-获取订单分账信息
 */
func (client *Client) BatchqueryGeneralDivideEx(request *BatchqueryGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 旅游文创合约-文创URL查询
 * Summary: 旅游文创合约-文创URL查询
 */
func (client *Client) GetGeneralTourism(request *GetGeneralTourismRequest) (_result *GetGeneralTourismResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralTourismResponse{}
	_body, _err := client.GetGeneralTourismEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 旅游文创合约-文创URL查询
 * Summary: 旅游文创合约-文创URL查询
 */
func (client *Client) GetGeneralTourismEx(request *GetGeneralTourismRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralTourismResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralTourismResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tourism.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 旅游文创合约-铸造文创
 * Summary: 旅游文创合约-铸造文创
 */
func (client *Client) RegisterGeneralTourism(request *RegisterGeneralTourismRequest) (_result *RegisterGeneralTourismResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterGeneralTourismResponse{}
	_body, _err := client.RegisterGeneralTourismEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 旅游文创合约-铸造文创
 * Summary: 旅游文创合约-铸造文创
 */
func (client *Client) RegisterGeneralTourismEx(request *RegisterGeneralTourismRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterGeneralTourismResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterGeneralTourismResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tourism.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 旅游文创合约-文创转增
 * Summary: 旅游文创合约-文创转增
 */
func (client *Client) PayGeneralTourism(request *PayGeneralTourismRequest) (_result *PayGeneralTourismResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayGeneralTourismResponse{}
	_body, _err := client.PayGeneralTourismEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 旅游文创合约-文创转增
 * Summary: 旅游文创合约-文创转增
 */
func (client *Client) PayGeneralTourismEx(request *PayGeneralTourismRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayGeneralTourismResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayGeneralTourismResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tourism.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线下门票合约-门票URL查询
 * Summary: 线下门票合约-门票URL查询
 */
func (client *Client) GetGeneralTickets(request *GetGeneralTicketsRequest) (_result *GetGeneralTicketsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralTicketsResponse{}
	_body, _err := client.GetGeneralTicketsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线下门票合约-门票URL查询
 * Summary: 线下门票合约-门票URL查询
 */
func (client *Client) GetGeneralTicketsEx(request *GetGeneralTicketsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralTicketsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralTicketsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tickets.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线下门票合约-铸造线下买票
 * Summary: 线下门票合约-铸造线下买票
 */
func (client *Client) RegisterGeneralTickets(request *RegisterGeneralTicketsRequest) (_result *RegisterGeneralTicketsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterGeneralTicketsResponse{}
	_body, _err := client.RegisterGeneralTicketsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线下门票合约-铸造线下买票
 * Summary: 线下门票合约-铸造线下买票
 */
func (client *Client) RegisterGeneralTicketsEx(request *RegisterGeneralTicketsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterGeneralTicketsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterGeneralTicketsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tickets.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 线下门票合约-门票转增
 * Summary: 线下门票合约-门票转增
 */
func (client *Client) PayGeneralTickets(request *PayGeneralTicketsRequest) (_result *PayGeneralTicketsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PayGeneralTicketsResponse{}
	_body, _err := client.PayGeneralTicketsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 线下门票合约-门票转增
 * Summary: 线下门票合约-门票转增
 */
func (client *Client) PayGeneralTicketsEx(request *PayGeneralTicketsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PayGeneralTicketsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PayGeneralTicketsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.tickets.pay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 进行分账规则的确认
 * Summary: 分账规则确认接口
 */
func (client *Client) UpdateGeneralDivide(request *UpdateGeneralDivideRequest) (_result *UpdateGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGeneralDivideResponse{}
	_body, _err := client.UpdateGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 进行分账规则的确认
 * Summary: 分账规则确认接口
 */
func (client *Client) UpdateGeneralDivideEx(request *UpdateGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询指定分账方的分账明细数据
 * Summary: 分账明细查询
 */
func (client *Client) ListGeneralDivide(request *ListGeneralDivideRequest) (_result *ListGeneralDivideResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListGeneralDivideResponse{}
	_body, _err := client.ListGeneralDivideEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询指定分账方的分账明细数据
 * Summary: 分账明细查询
 */
func (client *Client) ListGeneralDivideEx(request *ListGeneralDivideRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListGeneralDivideResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListGeneralDivideResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.divide.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询某个账户下拥有的资产数量
 * Summary: 权证资产合约资产查询
 */
func (client *Client) GetGeneralRightsbalance(request *GetGeneralRightsbalanceRequest) (_result *GetGeneralRightsbalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGeneralRightsbalanceResponse{}
	_body, _err := client.GetGeneralRightsbalanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询某个账户下拥有的资产数量
 * Summary: 权证资产合约资产查询
 */
func (client *Client) GetGeneralRightsbalanceEx(request *GetGeneralRightsbalanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGeneralRightsbalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGeneralRightsbalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.caasplatform.general.rightsbalance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
