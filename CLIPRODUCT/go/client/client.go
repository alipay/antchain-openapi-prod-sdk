// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// 商品明细
type OrderItem struct {
	// 商品ID
	// example:
	//
	// SKU001
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty" require:"true"`
	// 数量
	// example:
	//
	// 2
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
}

func (s OrderItem) String() string {
	return tea.Prettify(s)
}

func (s OrderItem) GoString() string {
	return s.String()
}

func (s *OrderItem) SetItemId(v string) *OrderItem {
	s.ItemId = &v
	return s
}

func (s *OrderItem) SetQuantity(v int64) *OrderItem {
	s.Quantity = &v
	return s
}

// x
type OrderItemX struct {
	// a
	// example:
	//
	// 1
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
}

func (s OrderItemX) String() string {
	return tea.Prettify(s)
}

func (s OrderItemX) GoString() string {
	return s.String()
}

func (s *OrderItemX) SetA(v string) *OrderItemX {
	s.A = &v
	return s
}

type CreateBusinessOrderzzzRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateBusinessOrderzzzRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderzzzRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderzzzRequest) SetAuthToken(v string) *CreateBusinessOrderzzzRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderzzzRequest) SetProductInstanceId(v string) *CreateBusinessOrderzzzRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderzzzRequest) SetOrderNo(v string) *CreateBusinessOrderzzzRequest {
	s.OrderNo = &v
	return s
}

type CreateBusinessOrderzzzResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s CreateBusinessOrderzzzResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderzzzResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderzzzResponse) SetReqMsgId(v string) *CreateBusinessOrderzzzResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderzzzResponse) SetResultCode(v string) *CreateBusinessOrderzzzResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderzzzResponse) SetResultMsg(v string) *CreateBusinessOrderzzzResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderzzzResponse) SetOrderId(v string) *CreateBusinessOrderzzzResponse {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderpppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s CreateBusinessOrderpppRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderpppRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderpppRequest) SetAuthToken(v string) *CreateBusinessOrderpppRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderpppRequest) SetProductInstanceId(v string) *CreateBusinessOrderpppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderpppRequest) SetTimeout(v string) *CreateBusinessOrderpppRequest {
	s.Timeout = &v
	return s
}

type CreateBusinessOrderpppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateBusinessOrderpppResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderpppResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderpppResponse) SetReqMsgId(v string) *CreateBusinessOrderpppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderpppResponse) SetResultCode(v string) *CreateBusinessOrderpppResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderpppResponse) SetResultMsg(v string) *CreateBusinessOrderpppResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderpppResponse) SetMsg(v string) *CreateBusinessOrderpppResponse {
	s.Msg = &v
	return s
}

func (s *CreateBusinessOrderpppResponse) SetStatus(v string) *CreateBusinessOrderpppResponse {
	s.Status = &v
	return s
}

type ApiaCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiaCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiaCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiaCliCreateRequest) SetAuthToken(v string) *ApiaCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiaCliCreateRequest) SetProductInstanceId(v string) *ApiaCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiaCliCreateRequest) SetTimeout(v string) *ApiaCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApiaCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApiaCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiaCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiaCliCreateResponse) SetReqMsgId(v string) *ApiaCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiaCliCreateResponse) SetResultCode(v string) *ApiaCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiaCliCreateResponse) SetResultMsg(v string) *ApiaCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiaCliCreateResponse) SetMsg(v string) *ApiaCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApiaCliCreateResponse) SetStatus(v string) *ApiaCliCreateResponse {
	s.Status = &v
	return s
}

type ApibCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApibCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApibCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApibCliCreateRequest) SetAuthToken(v string) *ApibCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApibCliCreateRequest) SetProductInstanceId(v string) *ApibCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApibCliCreateRequest) SetTimeout(v string) *ApibCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApibCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApibCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApibCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApibCliCreateResponse) SetReqMsgId(v string) *ApibCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApibCliCreateResponse) SetResultCode(v string) *ApibCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApibCliCreateResponse) SetResultMsg(v string) *ApibCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApibCliCreateResponse) SetMsg(v string) *ApibCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApibCliCreateResponse) SetStatus(v string) *ApibCliCreateResponse {
	s.Status = &v
	return s
}

type ApicCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApicCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApicCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApicCliCreateRequest) SetAuthToken(v string) *ApicCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApicCliCreateRequest) SetProductInstanceId(v string) *ApicCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApicCliCreateRequest) SetTimeout(v string) *ApicCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApicCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApicCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApicCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApicCliCreateResponse) SetReqMsgId(v string) *ApicCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApicCliCreateResponse) SetResultCode(v string) *ApicCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApicCliCreateResponse) SetResultMsg(v string) *ApicCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApicCliCreateResponse) SetMsg(v string) *ApicCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApicCliCreateResponse) SetStatus(v string) *ApicCliCreateResponse {
	s.Status = &v
	return s
}

type ApieCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApieCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApieCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApieCliCreateRequest) SetAuthToken(v string) *ApieCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApieCliCreateRequest) SetProductInstanceId(v string) *ApieCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApieCliCreateRequest) SetTimeout(v string) *ApieCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApieCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApieCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApieCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApieCliCreateResponse) SetReqMsgId(v string) *ApieCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApieCliCreateResponse) SetResultCode(v string) *ApieCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApieCliCreateResponse) SetResultMsg(v string) *ApieCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApieCliCreateResponse) SetMsg(v string) *ApieCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApieCliCreateResponse) SetStatus(v string) *ApieCliCreateResponse {
	s.Status = &v
	return s
}

type CreateBusinessOrderaaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderaaaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderaaaRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderaaaRequest) SetAuthToken(v string) *CreateBusinessOrderaaaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderaaaRequest) SetProductInstanceId(v string) *CreateBusinessOrderaaaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderaaaRequest) SetOrderId(v string) *CreateBusinessOrderaaaRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderaaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderaaaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderaaaResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderaaaResponse) SetReqMsgId(v string) *CreateBusinessOrderaaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderaaaResponse) SetResultCode(v string) *CreateBusinessOrderaaaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderaaaResponse) SetResultMsg(v string) *CreateBusinessOrderaaaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderaaaResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderaaaResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderbbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderbbbRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderbbbRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderbbbRequest) SetAuthToken(v string) *CreateBusinessOrderbbbRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderbbbRequest) SetProductInstanceId(v string) *CreateBusinessOrderbbbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderbbbRequest) SetOrderId(v string) *CreateBusinessOrderbbbRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderbbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderbbbResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderbbbResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderbbbResponse) SetReqMsgId(v string) *CreateBusinessOrderbbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderbbbResponse) SetResultCode(v string) *CreateBusinessOrderbbbResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderbbbResponse) SetResultMsg(v string) *CreateBusinessOrderbbbResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderbbbResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderbbbResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrdereeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrdereeeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdereeeRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdereeeRequest) SetAuthToken(v string) *CreateBusinessOrdereeeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrdereeeRequest) SetProductInstanceId(v string) *CreateBusinessOrdereeeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrdereeeRequest) SetOrderId(v string) *CreateBusinessOrdereeeRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrdereeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrdereeeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdereeeResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdereeeResponse) SetReqMsgId(v string) *CreateBusinessOrdereeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrdereeeResponse) SetResultCode(v string) *CreateBusinessOrdereeeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrdereeeResponse) SetResultMsg(v string) *CreateBusinessOrdereeeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrdereeeResponse) SetItemList(v []*OrderItem) *CreateBusinessOrdereeeResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderdddRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderdddRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderdddRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderdddRequest) SetAuthToken(v string) *CreateBusinessOrderdddRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderdddRequest) SetProductInstanceId(v string) *CreateBusinessOrderdddRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderdddRequest) SetOrderId(v string) *CreateBusinessOrderdddRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderdddResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderdddResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderdddResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderdddResponse) SetReqMsgId(v string) *CreateBusinessOrderdddResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderdddResponse) SetResultCode(v string) *CreateBusinessOrderdddResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderdddResponse) SetResultMsg(v string) *CreateBusinessOrderdddResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderdddResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderdddResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderabcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderabcRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderabcRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderabcRequest) SetAuthToken(v string) *CreateBusinessOrderabcRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderabcRequest) SetProductInstanceId(v string) *CreateBusinessOrderabcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderabcRequest) SetOrderId(v string) *CreateBusinessOrderabcRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderabcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderabcResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderabcResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderabcResponse) SetReqMsgId(v string) *CreateBusinessOrderabcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderabcResponse) SetResultCode(v string) *CreateBusinessOrderabcResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderabcResponse) SetResultMsg(v string) *CreateBusinessOrderabcResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderabcResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderabcResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderfffRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderfffRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderfffRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderfffRequest) SetAuthToken(v string) *CreateBusinessOrderfffRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderfffRequest) SetProductInstanceId(v string) *CreateBusinessOrderfffRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderfffRequest) SetOrderId(v string) *CreateBusinessOrderfffRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderfffResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderfffResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderfffResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderfffResponse) SetReqMsgId(v string) *CreateBusinessOrderfffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderfffResponse) SetResultCode(v string) *CreateBusinessOrderfffResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderfffResponse) SetResultMsg(v string) *CreateBusinessOrderfffResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderfffResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderfffResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrdergggRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrdergggRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdergggRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdergggRequest) SetAuthToken(v string) *CreateBusinessOrdergggRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrdergggRequest) SetProductInstanceId(v string) *CreateBusinessOrdergggRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrdergggRequest) SetOrderId(v string) *CreateBusinessOrdergggRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrdergggResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrdergggResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdergggResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdergggResponse) SetReqMsgId(v string) *CreateBusinessOrdergggResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrdergggResponse) SetResultCode(v string) *CreateBusinessOrdergggResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrdergggResponse) SetResultMsg(v string) *CreateBusinessOrdergggResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrdergggResponse) SetItemList(v []*OrderItem) *CreateBusinessOrdergggResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderhRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderhRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderhRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderhRequest) SetAuthToken(v string) *CreateBusinessOrderhRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderhRequest) SetProductInstanceId(v string) *CreateBusinessOrderhRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderhRequest) SetOrderId(v string) *CreateBusinessOrderhRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderhResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderhResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderhResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderhResponse) SetReqMsgId(v string) *CreateBusinessOrderhResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderhResponse) SetResultCode(v string) *CreateBusinessOrderhResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderhResponse) SetResultMsg(v string) *CreateBusinessOrderhResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderhResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderhResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderiRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderiRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderiRequest) SetAuthToken(v string) *CreateBusinessOrderiRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderiRequest) SetProductInstanceId(v string) *CreateBusinessOrderiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderiRequest) SetOrderId(v string) *CreateBusinessOrderiRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderiResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderiResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderiResponse) SetReqMsgId(v string) *CreateBusinessOrderiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderiResponse) SetResultCode(v string) *CreateBusinessOrderiResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderiResponse) SetResultMsg(v string) *CreateBusinessOrderiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderiResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderiResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderjRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderjRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderjRequest) SetAuthToken(v string) *CreateBusinessOrderjRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderjRequest) SetProductInstanceId(v string) *CreateBusinessOrderjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderjRequest) SetOrderId(v string) *CreateBusinessOrderjRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderjResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderjResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderjResponse) SetReqMsgId(v string) *CreateBusinessOrderjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderjResponse) SetResultCode(v string) *CreateBusinessOrderjResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderjResponse) SetResultMsg(v string) *CreateBusinessOrderjResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderjResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderjResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderkRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderkRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderkRequest) SetAuthToken(v string) *CreateBusinessOrderkRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderkRequest) SetProductInstanceId(v string) *CreateBusinessOrderkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderkRequest) SetOrderId(v string) *CreateBusinessOrderkRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderkResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderkResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderkResponse) SetReqMsgId(v string) *CreateBusinessOrderkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderkResponse) SetResultCode(v string) *CreateBusinessOrderkResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderkResponse) SetResultMsg(v string) *CreateBusinessOrderkResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderkResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderkResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderlRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderlRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderlRequest) SetAuthToken(v string) *CreateBusinessOrderlRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderlRequest) SetProductInstanceId(v string) *CreateBusinessOrderlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderlRequest) SetOrderId(v string) *CreateBusinessOrderlRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderlResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderlResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderlResponse) SetReqMsgId(v string) *CreateBusinessOrderlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderlResponse) SetResultCode(v string) *CreateBusinessOrderlResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderlResponse) SetResultMsg(v string) *CreateBusinessOrderlResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderlResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderlResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderoRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderoRequest) SetAuthToken(v string) *CreateBusinessOrderoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderoRequest) SetProductInstanceId(v string) *CreateBusinessOrderoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderoRequest) SetOrderId(v string) *CreateBusinessOrderoRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderoResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderoResponse) SetReqMsgId(v string) *CreateBusinessOrderoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderoResponse) SetResultCode(v string) *CreateBusinessOrderoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderoResponse) SetResultMsg(v string) *CreateBusinessOrderoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderoResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderoResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrderrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrderrRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderrRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderrRequest) SetAuthToken(v string) *CreateBusinessOrderrRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrderrRequest) SetProductInstanceId(v string) *CreateBusinessOrderrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrderrRequest) SetOrderId(v string) *CreateBusinessOrderrRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrderrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrderrResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrderrResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrderrResponse) SetReqMsgId(v string) *CreateBusinessOrderrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrderrResponse) SetResultCode(v string) *CreateBusinessOrderrResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrderrResponse) SetResultMsg(v string) *CreateBusinessOrderrResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrderrResponse) SetItemList(v []*OrderItem) *CreateBusinessOrderrResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrdersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrdersRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdersRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdersRequest) SetAuthToken(v string) *CreateBusinessOrdersRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrdersRequest) SetProductInstanceId(v string) *CreateBusinessOrdersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrdersRequest) SetOrderId(v string) *CreateBusinessOrdersRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrdersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrdersResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdersResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdersResponse) SetReqMsgId(v string) *CreateBusinessOrdersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrdersResponse) SetResultCode(v string) *CreateBusinessOrdersResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrdersResponse) SetResultMsg(v string) *CreateBusinessOrdersResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrdersResponse) SetItemList(v []*OrderItem) *CreateBusinessOrdersResponse {
	s.ItemList = v
	return s
}

type CreateBusinessOrdertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateBusinessOrdertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdertRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdertRequest) SetAuthToken(v string) *CreateBusinessOrdertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessOrdertRequest) SetProductInstanceId(v string) *CreateBusinessOrdertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBusinessOrdertRequest) SetOrderId(v string) *CreateBusinessOrdertRequest {
	s.OrderId = &v
	return s
}

type CreateBusinessOrdertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateBusinessOrdertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessOrdertResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessOrdertResponse) SetReqMsgId(v string) *CreateBusinessOrdertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessOrdertResponse) SetResultCode(v string) *CreateBusinessOrdertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessOrdertResponse) SetResultMsg(v string) *CreateBusinessOrdertResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessOrdertResponse) SetItemList(v []*OrderItem) *CreateBusinessOrdertResponse {
	s.ItemList = v
	return s
}

type ApifCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApifCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApifCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApifCliCreateRequest) SetAuthToken(v string) *ApifCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApifCliCreateRequest) SetProductInstanceId(v string) *ApifCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApifCliCreateRequest) SetTimeout(v string) *ApifCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApifCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApifCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApifCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApifCliCreateResponse) SetReqMsgId(v string) *ApifCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApifCliCreateResponse) SetResultCode(v string) *ApifCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApifCliCreateResponse) SetResultMsg(v string) *ApifCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApifCliCreateResponse) SetMsg(v string) *ApifCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApifCliCreateResponse) SetStatus(v string) *ApifCliCreateResponse {
	s.Status = &v
	return s
}

type ApigCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApigCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApigCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApigCliCreateRequest) SetAuthToken(v string) *ApigCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApigCliCreateRequest) SetProductInstanceId(v string) *ApigCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApigCliCreateRequest) SetTimeout(v string) *ApigCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApigCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApigCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApigCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApigCliCreateResponse) SetReqMsgId(v string) *ApigCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApigCliCreateResponse) SetResultCode(v string) *ApigCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApigCliCreateResponse) SetResultMsg(v string) *ApigCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApigCliCreateResponse) SetMsg(v string) *ApigCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApigCliCreateResponse) SetStatus(v string) *ApigCliCreateResponse {
	s.Status = &v
	return s
}

type ApiCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiCliCreateRequest) SetAuthToken(v string) *ApiCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiCliCreateRequest) SetProductInstanceId(v string) *ApiCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiCliCreateRequest) SetTimeout(v string) *ApiCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApiCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApiCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiCliCreateResponse) SetReqMsgId(v string) *ApiCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiCliCreateResponse) SetResultCode(v string) *ApiCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiCliCreateResponse) SetResultMsg(v string) *ApiCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiCliCreateResponse) SetMsg(v string) *ApiCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApiCliCreateResponse) SetStatus(v string) *ApiCliCreateResponse {
	s.Status = &v
	return s
}

type ApihCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApihCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApihCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApihCliCreateRequest) SetAuthToken(v string) *ApihCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApihCliCreateRequest) SetProductInstanceId(v string) *ApihCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApihCliCreateRequest) SetTimeout(v string) *ApihCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApihCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApihCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApihCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApihCliCreateResponse) SetReqMsgId(v string) *ApihCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApihCliCreateResponse) SetResultCode(v string) *ApihCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApihCliCreateResponse) SetResultMsg(v string) *ApihCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApihCliCreateResponse) SetMsg(v string) *ApihCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApihCliCreateResponse) SetStatus(v string) *ApihCliCreateResponse {
	s.Status = &v
	return s
}

type ApiiCliCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiiCliCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiiCliCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiiCliCreateRequest) SetAuthToken(v string) *ApiiCliCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiiCliCreateRequest) SetProductInstanceId(v string) *ApiiCliCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiiCliCreateRequest) SetTimeout(v string) *ApiiCliCreateRequest {
	s.Timeout = &v
	return s
}

type ApiiCliCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApiiCliCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiiCliCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiiCliCreateResponse) SetReqMsgId(v string) *ApiiCliCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiiCliCreateResponse) SetResultCode(v string) *ApiiCliCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiiCliCreateResponse) SetResultMsg(v string) *ApiiCliCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiiCliCreateResponse) SetMsg(v string) *ApiiCliCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApiiCliCreateResponse) SetStatus(v string) *ApiiCliCreateResponse {
	s.Status = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("CLIPRODUCT"),
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

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderzzz(request *CreateBusinessOrderzzzRequest) (_result *CreateBusinessOrderzzzResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderzzzResponse{}
	_body, _err := client.CreateBusinessOrderzzzEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderzzzEx(request *CreateBusinessOrderzzzRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderzzzResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderzzzResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderzzz.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderppp(request *CreateBusinessOrderpppRequest) (_result *CreateBusinessOrderpppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderpppResponse{}
	_body, _err := client.CreateBusinessOrderpppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderpppEx(request *CreateBusinessOrderpppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderpppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderpppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderppp.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApiaCliCreate(request *ApiaCliCreateRequest) (_result *ApiaCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiaCliCreateResponse{}
	_body, _err := client.ApiaCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApiaCliCreateEx(request *ApiaCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiaCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiaCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apia"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApibCliCreate(request *ApibCliCreateRequest) (_result *ApibCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApibCliCreateResponse{}
	_body, _err := client.ApibCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApibCliCreateEx(request *ApibCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApibCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApibCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apib"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApicCliCreate(request *ApicCliCreateRequest) (_result *ApicCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApicCliCreateResponse{}
	_body, _err := client.ApicCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApicCliCreateEx(request *ApicCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApicCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApicCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apic"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApieCliCreate(request *ApieCliCreateRequest) (_result *ApieCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApieCliCreateResponse{}
	_body, _err := client.ApieCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口A
//
// Summary: cli创建测试接口A
func (client *Client) ApieCliCreateEx(request *ApieCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApieCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApieCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apie"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderaaa(request *CreateBusinessOrderaaaRequest) (_result *CreateBusinessOrderaaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderaaaResponse{}
	_body, _err := client.CreateBusinessOrderaaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderaaaEx(request *CreateBusinessOrderaaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderaaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderaaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderaaa.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderbbb(request *CreateBusinessOrderbbbRequest) (_result *CreateBusinessOrderbbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderbbbResponse{}
	_body, _err := client.CreateBusinessOrderbbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderbbbEx(request *CreateBusinessOrderbbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderbbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderbbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderbbb.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdereee(request *CreateBusinessOrdereeeRequest) (_result *CreateBusinessOrdereeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrdereeeResponse{}
	_body, _err := client.CreateBusinessOrdereeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdereeeEx(request *CreateBusinessOrdereeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrdereeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrdereeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.ordereee.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderddd(request *CreateBusinessOrderdddRequest) (_result *CreateBusinessOrderdddResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderdddResponse{}
	_body, _err := client.CreateBusinessOrderdddEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderdddEx(request *CreateBusinessOrderdddRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderdddResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderdddResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderddd.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderabc(request *CreateBusinessOrderabcRequest) (_result *CreateBusinessOrderabcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderabcResponse{}
	_body, _err := client.CreateBusinessOrderabcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderabcEx(request *CreateBusinessOrderabcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderabcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderabcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderabc.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderfff(request *CreateBusinessOrderfffRequest) (_result *CreateBusinessOrderfffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderfffResponse{}
	_body, _err := client.CreateBusinessOrderfffEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderfffEx(request *CreateBusinessOrderfffRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderfffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderfffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderfff.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderggg(request *CreateBusinessOrdergggRequest) (_result *CreateBusinessOrdergggResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrdergggResponse{}
	_body, _err := client.CreateBusinessOrdergggEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdergggEx(request *CreateBusinessOrdergggRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrdergggResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrdergggResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderggg.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderh(request *CreateBusinessOrderhRequest) (_result *CreateBusinessOrderhResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderhResponse{}
	_body, _err := client.CreateBusinessOrderhEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderhEx(request *CreateBusinessOrderhRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderhResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderhResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderh.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderi(request *CreateBusinessOrderiRequest) (_result *CreateBusinessOrderiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderiResponse{}
	_body, _err := client.CreateBusinessOrderiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderiEx(request *CreateBusinessOrderiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderi.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderj(request *CreateBusinessOrderjRequest) (_result *CreateBusinessOrderjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderjResponse{}
	_body, _err := client.CreateBusinessOrderjEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderjEx(request *CreateBusinessOrderjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderj.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderk(request *CreateBusinessOrderkRequest) (_result *CreateBusinessOrderkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderkResponse{}
	_body, _err := client.CreateBusinessOrderkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderkEx(request *CreateBusinessOrderkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderk.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderl(request *CreateBusinessOrderlRequest) (_result *CreateBusinessOrderlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderlResponse{}
	_body, _err := client.CreateBusinessOrderlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderlEx(request *CreateBusinessOrderlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderl.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdero(request *CreateBusinessOrderoRequest) (_result *CreateBusinessOrderoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderoResponse{}
	_body, _err := client.CreateBusinessOrderoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderoEx(request *CreateBusinessOrderoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.ordero.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderr(request *CreateBusinessOrderrRequest) (_result *CreateBusinessOrderrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrderrResponse{}
	_body, _err := client.CreateBusinessOrderrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrderrEx(request *CreateBusinessOrderrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrderrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrderrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orderr.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrders(request *CreateBusinessOrdersRequest) (_result *CreateBusinessOrdersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrdersResponse{}
	_body, _err := client.CreateBusinessOrdersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdersEx(request *CreateBusinessOrdersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrdersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrdersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.orders.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdert(request *CreateBusinessOrdertRequest) (_result *CreateBusinessOrdertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessOrdertResponse{}
	_body, _err := client.CreateBusinessOrdertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateBusinessOrdertEx(request *CreateBusinessOrdertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessOrdertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessOrdertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.business.ordert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口D
//
// Summary: cli创建测试接口D
func (client *Client) ApifCliCreate(request *ApifCliCreateRequest) (_result *ApifCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApifCliCreateResponse{}
	_body, _err := client.ApifCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口D
//
// Summary: cli创建测试接口D
func (client *Client) ApifCliCreateEx(request *ApifCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApifCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApifCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apif"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口G
//
// Summary: cli创建测试接口G
func (client *Client) ApigCliCreate(request *ApigCliCreateRequest) (_result *ApigCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApigCliCreateResponse{}
	_body, _err := client.ApigCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口G
//
// Summary: cli创建测试接口G
func (client *Client) ApigCliCreateEx(request *ApigCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApigCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApigCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apig"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口G
//
// Summary: cli创建测试接口G
func (client *Client) ApiCliCreate(request *ApiCliCreateRequest) (_result *ApiCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiCliCreateResponse{}
	_body, _err := client.ApiCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口G
//
// Summary: cli创建测试接口G
func (client *Client) ApiCliCreateEx(request *ApiCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口h
//
// Summary: cli创建测试接口h
func (client *Client) ApihCliCreate(request *ApihCliCreateRequest) (_result *ApihCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApihCliCreateResponse{}
	_body, _err := client.ApihCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口h
//
// Summary: cli创建测试接口h
func (client *Client) ApihCliCreateEx(request *ApihCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApihCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApihCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apih"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口i
//
// Summary: cli创建测试接口i
func (client *Client) ApiiCliCreate(request *ApiiCliCreateRequest) (_result *ApiiCliCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiiCliCreateResponse{}
	_body, _err := client.ApiiCliCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: cli创建测试接口i
//
// Summary: cli创建测试接口i
func (client *Client) ApiiCliCreateEx(request *ApiiCliCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiiCliCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiiCliCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.cliproduct.cli.create.apii"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
