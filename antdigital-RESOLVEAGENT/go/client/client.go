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

type ImportTaskBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 导入名单列表
	List []*string `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
	// 任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s ImportTaskBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTaskBatchRequest) GoString() string {
	return s.String()
}

func (s *ImportTaskBatchRequest) SetAuthToken(v string) *ImportTaskBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTaskBatchRequest) SetProductInstanceId(v string) *ImportTaskBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTaskBatchRequest) SetBatchNo(v string) *ImportTaskBatchRequest {
	s.BatchNo = &v
	return s
}

func (s *ImportTaskBatchRequest) SetList(v []*string) *ImportTaskBatchRequest {
	s.List = v
	return s
}

func (s *ImportTaskBatchRequest) SetTaskId(v string) *ImportTaskBatchRequest {
	s.TaskId = &v
	return s
}

type ImportTaskBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportTaskBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTaskBatchResponse) GoString() string {
	return s.String()
}

func (s *ImportTaskBatchResponse) SetReqMsgId(v string) *ImportTaskBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTaskBatchResponse) SetResultCode(v string) *ImportTaskBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTaskBatchResponse) SetResultMsg(v string) *ImportTaskBatchResponse {
	s.ResultMsg = &v
	return s
}

type ImportTaskRateinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CusNo *string `json:"cus_no,omitempty" xml:"cus_no,omitempty" require:"true"`
	// 借据信息
	LoanInfoList []*string `json:"loan_info_list,omitempty" xml:"loan_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s ImportTaskRateinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTaskRateinfoRequest) GoString() string {
	return s.String()
}

func (s *ImportTaskRateinfoRequest) SetAuthToken(v string) *ImportTaskRateinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTaskRateinfoRequest) SetProductInstanceId(v string) *ImportTaskRateinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTaskRateinfoRequest) SetCusNo(v string) *ImportTaskRateinfoRequest {
	s.CusNo = &v
	return s
}

func (s *ImportTaskRateinfoRequest) SetLoanInfoList(v []*string) *ImportTaskRateinfoRequest {
	s.LoanInfoList = v
	return s
}

type ImportTaskRateinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportTaskRateinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTaskRateinfoResponse) GoString() string {
	return s.String()
}

func (s *ImportTaskRateinfoResponse) SetReqMsgId(v string) *ImportTaskRateinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetResultCode(v string) *ImportTaskRateinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetResultMsg(v string) *ImportTaskRateinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetFlag(v string) *ImportTaskRateinfoResponse {
	s.Flag = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetCode(v int64) *ImportTaskRateinfoResponse {
	s.Code = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetMsg(v string) *ImportTaskRateinfoResponse {
	s.Msg = &v
	return s
}

func (s *ImportTaskRateinfoResponse) SetData(v string) *ImportTaskRateinfoResponse {
	s.Data = &v
	return s
}

type QueryCustomerOverdueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustomerAccount *string `json:"customer_account,omitempty" xml:"customer_account,omitempty" require:"true"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
}

func (s QueryCustomerOverdueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerOverdueRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerOverdueRequest) SetAuthToken(v string) *QueryCustomerOverdueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetProductInstanceId(v string) *QueryCustomerOverdueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetCustomerAccount(v string) *QueryCustomerOverdueRequest {
	s.CustomerAccount = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetProductType(v string) *QueryCustomerOverdueRequest {
	s.ProductType = &v
	return s
}

type QueryCustomerOverdueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// true : 逾期 false: 不逾期
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCustomerOverdueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerOverdueResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerOverdueResponse) SetReqMsgId(v string) *QueryCustomerOverdueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetResultCode(v string) *QueryCustomerOverdueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetResultMsg(v string) *QueryCustomerOverdueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetFlag(v string) *QueryCustomerOverdueResponse {
	s.Flag = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetCode(v int64) *QueryCustomerOverdueResponse {
	s.Code = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetMsg(v string) *QueryCustomerOverdueResponse {
	s.Msg = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetData(v bool) *QueryCustomerOverdueResponse {
	s.Data = &v
	return s
}

type PushCustomerLogininfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustNo *string `json:"cust_no,omitempty" xml:"cust_no,omitempty" require:"true"`
	// 客户行为
	ActionInfo *string `json:"action_info,omitempty" xml:"action_info,omitempty" require:"true"`
}

func (s PushCustomerLogininfoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushCustomerLogininfoRequest) GoString() string {
	return s.String()
}

func (s *PushCustomerLogininfoRequest) SetAuthToken(v string) *PushCustomerLogininfoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushCustomerLogininfoRequest) SetProductInstanceId(v string) *PushCustomerLogininfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushCustomerLogininfoRequest) SetCustNo(v string) *PushCustomerLogininfoRequest {
	s.CustNo = &v
	return s
}

func (s *PushCustomerLogininfoRequest) SetActionInfo(v string) *PushCustomerLogininfoRequest {
	s.ActionInfo = &v
	return s
}

type PushCustomerLogininfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果信息
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PushCustomerLogininfoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushCustomerLogininfoResponse) GoString() string {
	return s.String()
}

func (s *PushCustomerLogininfoResponse) SetReqMsgId(v string) *PushCustomerLogininfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetResultCode(v string) *PushCustomerLogininfoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetResultMsg(v string) *PushCustomerLogininfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetFlag(v string) *PushCustomerLogininfoResponse {
	s.Flag = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetCode(v int64) *PushCustomerLogininfoResponse {
	s.Code = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetMsg(v string) *PushCustomerLogininfoResponse {
	s.Msg = &v
	return s
}

func (s *PushCustomerLogininfoResponse) SetData(v string) *PushCustomerLogininfoResponse {
	s.Data = &v
	return s
}

type ImportCommonCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 导入名单
	List []*string `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s ImportCommonCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCommonCustomerRequest) GoString() string {
	return s.String()
}

func (s *ImportCommonCustomerRequest) SetAuthToken(v string) *ImportCommonCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCommonCustomerRequest) SetProductInstanceId(v string) *ImportCommonCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportCommonCustomerRequest) SetBatchId(v string) *ImportCommonCustomerRequest {
	s.BatchId = &v
	return s
}

func (s *ImportCommonCustomerRequest) SetList(v []*string) *ImportCommonCustomerRequest {
	s.List = v
	return s
}

type ImportCommonCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportCommonCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCommonCustomerResponse) GoString() string {
	return s.String()
}

func (s *ImportCommonCustomerResponse) SetReqMsgId(v string) *ImportCommonCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCommonCustomerResponse) SetResultCode(v string) *ImportCommonCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCommonCustomerResponse) SetResultMsg(v string) *ImportCommonCustomerResponse {
	s.ResultMsg = &v
	return s
}

type ImportCustomerRealtimeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次幂等键（≤64 字符)
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 挂靠的任务 ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 名单行 JSON 数组，每个元素为一名单行 JSON 字符串
	CustInfo []*string `json:"cust_info,omitempty" xml:"cust_info,omitempty" require:"true" type:"Repeated"`
}

func (s ImportCustomerRealtimeRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCustomerRealtimeRequest) GoString() string {
	return s.String()
}

func (s *ImportCustomerRealtimeRequest) SetAuthToken(v string) *ImportCustomerRealtimeRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCustomerRealtimeRequest) SetProductInstanceId(v string) *ImportCustomerRealtimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportCustomerRealtimeRequest) SetRequestId(v string) *ImportCustomerRealtimeRequest {
	s.RequestId = &v
	return s
}

func (s *ImportCustomerRealtimeRequest) SetTaskId(v string) *ImportCustomerRealtimeRequest {
	s.TaskId = &v
	return s
}

func (s *ImportCustomerRealtimeRequest) SetCustInfo(v []*string) *ImportCustomerRealtimeRequest {
	s.CustInfo = v
	return s
}

type ImportCustomerRealtimeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 原样回传请求中的 requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 我方生成的批次流水号，用于对账与追踪
	ProviderBatchId *string `json:"provider_batch_id,omitempty" xml:"provider_batch_id,omitempty"`
	// 名单行总数（= custInfo 行数）
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 受理成功、进入外呼队列的行数
	AcceptedCount *int64 `json:"accepted_count,omitempty" xml:"accepted_count,omitempty"`
	// 校验未通过被拒绝的行数
	RejectedCount *int64 `json:"rejected_count,omitempty" xml:"rejected_count,omitempty"`
	// 受理成功的 serialNo 列表
	AcceptedSerialNos []*string `json:"accepted_serial_nos,omitempty" xml:"accepted_serial_nos,omitempty" type:"Repeated"`
	// 被拒绝的 serialNo → 拒绝原因
	RejectedItems *string `json:"rejected_items,omitempty" xml:"rejected_items,omitempty"`
}

func (s ImportCustomerRealtimeResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCustomerRealtimeResponse) GoString() string {
	return s.String()
}

func (s *ImportCustomerRealtimeResponse) SetReqMsgId(v string) *ImportCustomerRealtimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetResultCode(v string) *ImportCustomerRealtimeResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetResultMsg(v string) *ImportCustomerRealtimeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetRequestId(v string) *ImportCustomerRealtimeResponse {
	s.RequestId = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetProviderBatchId(v string) *ImportCustomerRealtimeResponse {
	s.ProviderBatchId = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetTotalCount(v int64) *ImportCustomerRealtimeResponse {
	s.TotalCount = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetAcceptedCount(v int64) *ImportCustomerRealtimeResponse {
	s.AcceptedCount = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetRejectedCount(v int64) *ImportCustomerRealtimeResponse {
	s.RejectedCount = &v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetAcceptedSerialNos(v []*string) *ImportCustomerRealtimeResponse {
	s.AcceptedSerialNos = v
	return s
}

func (s *ImportCustomerRealtimeResponse) SetRejectedItems(v string) *ImportCustomerRealtimeResponse {
	s.RejectedItems = &v
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
				"sdk_version":      tea.String("2.1.1"),
				"_prod_code":       tea.String("RESOLVEAGENT"),
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
// Description: 贷后催调智能体批量名单导入接口
//
// Summary: 贷后催调智能体批量名单导入接口
func (client *Client) ImportTaskBatch(request *ImportTaskBatchRequest) (_result *ImportTaskBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTaskBatchResponse{}
	_body, _err := client.ImportTaskBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 贷后催调智能体批量名单导入接口
//
// Summary: 贷后催调智能体批量名单导入接口
func (client *Client) ImportTaskBatchEx(request *ImportTaskBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTaskBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTaskBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.task.batch.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 贷后对接360利率信息导入
//
// Summary: 贷后对接360利率信息导入
func (client *Client) ImportTaskRateinfo(request *ImportTaskRateinfoRequest) (_result *ImportTaskRateinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTaskRateinfoResponse{}
	_body, _err := client.ImportTaskRateinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 贷后对接360利率信息导入
//
// Summary: 贷后对接360利率信息导入
func (client *Client) ImportTaskRateinfoEx(request *ImportTaskRateinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTaskRateinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTaskRateinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.task.rateinfo.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 贷后360客户是否逾期查询接口
//
// Summary: 贷后360客户是否逾期查询接口
func (client *Client) QueryCustomerOverdue(request *QueryCustomerOverdueRequest) (_result *QueryCustomerOverdueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerOverdueResponse{}
	_body, _err := client.QueryCustomerOverdueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 贷后360客户是否逾期查询接口
//
// Summary: 贷后360客户是否逾期查询接口
func (client *Client) QueryCustomerOverdueEx(request *QueryCustomerOverdueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerOverdueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerOverdueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.customer.overdue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 360站内信用户信息推送
//
// Summary: 360站内信用户信息推送
func (client *Client) PushCustomerLogininfo(request *PushCustomerLogininfoRequest) (_result *PushCustomerLogininfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushCustomerLogininfoResponse{}
	_body, _err := client.PushCustomerLogininfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 360站内信用户信息推送
//
// Summary: 360站内信用户信息推送
func (client *Client) PushCustomerLogininfoEx(request *PushCustomerLogininfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushCustomerLogininfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushCustomerLogininfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.customer.logininfo.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 贷后催调通用导入接口
//
// Summary: 贷后催调通用导入接口
func (client *Client) ImportCommonCustomer(request *ImportCommonCustomerRequest) (_result *ImportCommonCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCommonCustomerResponse{}
	_body, _err := client.ImportCommonCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 贷后催调通用导入接口
//
// Summary: 贷后催调通用导入接口
func (client *Client) ImportCommonCustomerEx(request *ImportCommonCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCommonCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportCommonCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.common.customer.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 贷后催调实时导入接口
//
// Summary: 贷后催调实时导入接口
func (client *Client) ImportCustomerRealtime(request *ImportCustomerRealtimeRequest) (_result *ImportCustomerRealtimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCustomerRealtimeResponse{}
	_body, _err := client.ImportCustomerRealtimeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 贷后催调实时导入接口
//
// Summary: 贷后催调实时导入接口
func (client *Client) ImportCustomerRealtimeEx(request *ImportCustomerRealtimeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCustomerRealtimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportCustomerRealtimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveagent.customer.realtime.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
