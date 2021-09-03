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

// 修复数据
type RepairData struct {
	// 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
	RepairStatus *string `json:"repair_status,omitempty" xml:"repair_status,omitempty" require:"true"`
	// 身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 姓名：显示的姓名为修复请求的 待修复人名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 案件编号，特定使用运营商页面平台产生
	CaseNo *string `json:"case_no,omitempty" xml:"case_no,omitempty"`
	// 修复号码数量
	ResultListNumber *int64 `json:"result_list_number,omitempty" xml:"result_list_number,omitempty" require:"true"`
}

func (s RepairData) String() string {
	return tea.Prettify(s)
}

func (s RepairData) GoString() string {
	return s.String()
}

func (s *RepairData) SetRepairStatus(v string) *RepairData {
	s.RepairStatus = &v
	return s
}

func (s *RepairData) SetIdCard(v string) *RepairData {
	s.IdCard = &v
	return s
}

func (s *RepairData) SetUserName(v string) *RepairData {
	s.UserName = &v
	return s
}

func (s *RepairData) SetCaseNo(v string) *RepairData {
	s.CaseNo = &v
	return s
}

func (s *RepairData) SetResultListNumber(v int64) *RepairData {
	s.ResultListNumber = &v
	return s
}

// 修复批次状态
type BatchRepairData struct {
	// "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
	RepairBatchStatus *string `json:"repair_batch_status,omitempty" xml:"repair_batch_status,omitempty" require:"true"`
	// 修复时间
	RepairTime *string `json:"repair_time,omitempty" xml:"repair_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 参见RepairData
	RepairDatas []*RepairData `json:"repair_datas,omitempty" xml:"repair_datas,omitempty" require:"true" type:"Repeated"`
}

func (s BatchRepairData) String() string {
	return tea.Prettify(s)
}

func (s BatchRepairData) GoString() string {
	return s.String()
}

func (s *BatchRepairData) SetRepairBatchStatus(v string) *BatchRepairData {
	s.RepairBatchStatus = &v
	return s
}

func (s *BatchRepairData) SetRepairTime(v string) *BatchRepairData {
	s.RepairTime = &v
	return s
}

func (s *BatchRepairData) SetRepairDatas(v []*RepairData) *BatchRepairData {
	s.RepairDatas = v
	return s
}

// 绑定接口返回的绑定信息
type BindData struct {
	// 虚拟小号（实际拨打以返回的 telX 为主）
	TelX *string `json:"tel_x,omitempty" xml:"tel_x,omitempty" require:"true"`
	// 该次绑定唯一 id
	BindId *string `json:"bind_id,omitempty" xml:"bind_id,omitempty" require:"true"`
}

func (s BindData) String() string {
	return tea.Prettify(s)
}

func (s BindData) GoString() string {
	return s.String()
}

func (s *BindData) SetTelX(v string) *BindData {
	s.TelX = &v
	return s
}

func (s *BindData) SetBindId(v string) *BindData {
	s.BindId = &v
	return s
}

// 发起修复的响应对象，
type BatchInfo struct {
	// 修复的批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
}

func (s BatchInfo) String() string {
	return tea.Prettify(s)
}

func (s BatchInfo) GoString() string {
	return s.String()
}

func (s *BatchInfo) SetBatchId(v string) *BatchInfo {
	s.BatchId = &v
	return s
}

// 待修复的债务人信息
type PersonData struct {
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 待修复 sha256 加密身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
}

func (s PersonData) String() string {
	return tea.Prettify(s)
}

func (s PersonData) GoString() string {
	return s.String()
}

func (s *PersonData) SetUserName(v string) *PersonData {
	s.UserName = &v
	return s
}

func (s *PersonData) SetIdCard(v string) *PersonData {
	s.IdCard = &v
	return s
}

func (s *PersonData) SetPhone(v string) *PersonData {
	s.Phone = &v
	return s
}

type StartSlxfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待修复人list
	Data []*PersonData `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
}

func (s StartSlxfRequest) String() string {
	return tea.Prettify(s)
}

func (s StartSlxfRequest) GoString() string {
	return s.String()
}

func (s *StartSlxfRequest) SetAuthToken(v string) *StartSlxfRequest {
	s.AuthToken = &v
	return s
}

func (s *StartSlxfRequest) SetProductInstanceId(v string) *StartSlxfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartSlxfRequest) SetData(v []*PersonData) *StartSlxfRequest {
	s.Data = v
	return s
}

type StartSlxfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回批次，JSON对象， 比如：{batchId:xxxxx}
	Data *BatchInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s StartSlxfResponse) String() string {
	return tea.Prettify(s)
}

func (s StartSlxfResponse) GoString() string {
	return s.String()
}

func (s *StartSlxfResponse) SetReqMsgId(v string) *StartSlxfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartSlxfResponse) SetResultCode(v string) *StartSlxfResponse {
	s.ResultCode = &v
	return s
}

func (s *StartSlxfResponse) SetResultMsg(v string) *StartSlxfResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartSlxfResponse) SetData(v *BatchInfo) *StartSlxfResponse {
	s.Data = v
	return s
}

type PullSlxfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"batchId":"xxx"}
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
}

func (s PullSlxfRequest) String() string {
	return tea.Prettify(s)
}

func (s PullSlxfRequest) GoString() string {
	return s.String()
}

func (s *PullSlxfRequest) SetAuthToken(v string) *PullSlxfRequest {
	s.AuthToken = &v
	return s
}

func (s *PullSlxfRequest) SetProductInstanceId(v string) *PullSlxfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullSlxfRequest) SetBatchId(v string) *PullSlxfRequest {
	s.BatchId = &v
	return s
}

type PullSlxfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参考结构体类型
	Data *BatchRepairData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PullSlxfResponse) String() string {
	return tea.Prettify(s)
}

func (s PullSlxfResponse) GoString() string {
	return s.String()
}

func (s *PullSlxfResponse) SetReqMsgId(v string) *PullSlxfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullSlxfResponse) SetResultCode(v string) *PullSlxfResponse {
	s.ResultCode = &v
	return s
}

func (s *PullSlxfResponse) SetResultMsg(v string) *PullSlxfResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullSlxfResponse) SetData(v *BatchRepairData) *PullSlxfResponse {
	s.Data = v
	return s
}

type QuerySlxfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 修复批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// Sha256 加密后的身 份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
}

func (s QuerySlxfRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySlxfRequest) GoString() string {
	return s.String()
}

func (s *QuerySlxfRequest) SetAuthToken(v string) *QuerySlxfRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySlxfRequest) SetProductInstanceId(v string) *QuerySlxfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySlxfRequest) SetBatchId(v string) *QuerySlxfRequest {
	s.BatchId = &v
	return s
}

func (s *QuerySlxfRequest) SetIdCard(v string) *QuerySlxfRequest {
	s.IdCard = &v
	return s
}

type QuerySlxfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 其中数组中的每一项 为 脱 敏 手 机 号 码 unicomCustomerId ，请求外呼 时使用
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QuerySlxfResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySlxfResponse) GoString() string {
	return s.String()
}

func (s *QuerySlxfResponse) SetReqMsgId(v string) *QuerySlxfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySlxfResponse) SetResultCode(v string) *QuerySlxfResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySlxfResponse) SetResultMsg(v string) *QuerySlxfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySlxfResponse) SetData(v []*string) *QuerySlxfResponse {
	s.Data = v
	return s
}

type BindSlxfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 修复批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 待 修 复 sha256 加 密身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 脱敏后手机号码加密串， 需要拨打的该手机号码
	UnicomCustomerId *string `json:"unicom_customer_id,omitempty" xml:"unicom_customer_id,omitempty" require:"true"`
	// 主叫号码，号码要求备案
	SeatNumber *string `json:"seat_number,omitempty" xml:"seat_number,omitempty" require:"true"`
	// 外显号，外显号要求在外 显号池中
	ShowNumber *string `json:"show_number,omitempty" xml:"show_number,omitempty" require:"true"`
	// 虚拟小号， 线下分 配
	TelX *string `json:"tel_x,omitempty" xml:"tel_x,omitempty" require:"true"`
}

func (s BindSlxfRequest) String() string {
	return tea.Prettify(s)
}

func (s BindSlxfRequest) GoString() string {
	return s.String()
}

func (s *BindSlxfRequest) SetAuthToken(v string) *BindSlxfRequest {
	s.AuthToken = &v
	return s
}

func (s *BindSlxfRequest) SetProductInstanceId(v string) *BindSlxfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindSlxfRequest) SetBatchId(v string) *BindSlxfRequest {
	s.BatchId = &v
	return s
}

func (s *BindSlxfRequest) SetIdCard(v string) *BindSlxfRequest {
	s.IdCard = &v
	return s
}

func (s *BindSlxfRequest) SetUnicomCustomerId(v string) *BindSlxfRequest {
	s.UnicomCustomerId = &v
	return s
}

func (s *BindSlxfRequest) SetSeatNumber(v string) *BindSlxfRequest {
	s.SeatNumber = &v
	return s
}

func (s *BindSlxfRequest) SetShowNumber(v string) *BindSlxfRequest {
	s.ShowNumber = &v
	return s
}

func (s *BindSlxfRequest) SetTelX(v string) *BindSlxfRequest {
	s.TelX = &v
	return s
}

type BindSlxfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// "data": {"telX": "xxx","bindId": "xxx" }
	Data *BindData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s BindSlxfResponse) String() string {
	return tea.Prettify(s)
}

func (s BindSlxfResponse) GoString() string {
	return s.String()
}

func (s *BindSlxfResponse) SetReqMsgId(v string) *BindSlxfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindSlxfResponse) SetResultCode(v string) *BindSlxfResponse {
	s.ResultCode = &v
	return s
}

func (s *BindSlxfResponse) SetResultMsg(v string) *BindSlxfResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindSlxfResponse) SetData(v *BindData) *BindSlxfResponse {
	s.Data = v
	return s
}

type UnbindSlxfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绑定唯一 id
	BindId *string `json:"bind_id,omitempty" xml:"bind_id,omitempty" require:"true"`
}

func (s UnbindSlxfRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindSlxfRequest) GoString() string {
	return s.String()
}

func (s *UnbindSlxfRequest) SetAuthToken(v string) *UnbindSlxfRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindSlxfRequest) SetProductInstanceId(v string) *UnbindSlxfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindSlxfRequest) SetBindId(v string) *UnbindSlxfRequest {
	s.BindId = &v
	return s
}

type UnbindSlxfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindSlxfResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindSlxfResponse) GoString() string {
	return s.String()
}

func (s *UnbindSlxfResponse) SetReqMsgId(v string) *UnbindSlxfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindSlxfResponse) SetResultCode(v string) *UnbindSlxfResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindSlxfResponse) SetResultMsg(v string) *UnbindSlxfResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.4"),
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
 * Description: 失联修复发起API接口
 * Summary: 失联修复发起API接口
 */
func (client *Client) StartSlxf(request *StartSlxfRequest) (_result *StartSlxfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartSlxfResponse{}
	_body, _err := client.StartSlxfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 失联修复发起API接口
 * Summary: 失联修复发起API接口
 */
func (client *Client) StartSlxfEx(request *StartSlxfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartSlxfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartSlxfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.donpa.slxf.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
 * Summary: 获取修复结果接口
 */
func (client *Client) PullSlxf(request *PullSlxfRequest) (_result *PullSlxfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullSlxfResponse{}
	_body, _err := client.PullSlxfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
 * Summary: 获取修复结果接口
 */
func (client *Client) PullSlxfEx(request *PullSlxfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullSlxfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullSlxfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.donpa.slxf.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据身份证号查询修复的脱敏手机号码
 * Summary: 查询修复结果
 */
func (client *Client) QuerySlxf(request *QuerySlxfRequest) (_result *QuerySlxfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySlxfResponse{}
	_body, _err := client.QuerySlxfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据身份证号查询修复的脱敏手机号码
 * Summary: 查询修复结果
 */
func (client *Client) QuerySlxfEx(request *QuerySlxfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySlxfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySlxfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.donpa.slxf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
 * Summary: 绑定虚拟小号接口
 */
func (client *Client) BindSlxf(request *BindSlxfRequest) (_result *BindSlxfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindSlxfResponse{}
	_body, _err := client.BindSlxfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
 * Summary: 绑定虚拟小号接口
 */
func (client *Client) BindSlxfEx(request *BindSlxfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindSlxfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindSlxfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.donpa.slxf.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解绑虚拟小号
 * Summary: 解绑虚拟小号接口
 */
func (client *Client) UnbindSlxf(request *UnbindSlxfRequest) (_result *UnbindSlxfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindSlxfResponse{}
	_body, _err := client.UnbindSlxfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解绑虚拟小号
 * Summary: 解绑虚拟小号接口
 */
func (client *Client) UnbindSlxfEx(request *UnbindSlxfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindSlxfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindSlxfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.donpa.slxf.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
