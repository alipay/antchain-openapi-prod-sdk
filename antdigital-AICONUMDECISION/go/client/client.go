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

// 外呼任务简单对象
type OutcallTask struct {
	// 任务编码
	// example:
	//
	// task_123
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 任务名称
	// example:
	//
	// 催收外呼任务
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s OutcallTask) String() string {
	return tea.Prettify(s)
}

func (s OutcallTask) GoString() string {
	return s.String()
}

func (s *OutcallTask) SetCode(v string) *OutcallTask {
	s.Code = &v
	return s
}

func (s *OutcallTask) SetName(v string) *OutcallTask {
	s.Name = &v
	return s
}

// 触达用户
type Customer struct {
	// 用户手机号
	// example:
	//
	// 0571****5678
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 用户业务 ID，回执中透出，需保证唯一
	// example:
	//
	// 12313156789654
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 扩展业务字段，可用于变量参数和回执透出 json格式字符串
	// example:
	//
	// {"name":"张三"}
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
}

func (s Customer) String() string {
	return tea.Prettify(s)
}

func (s Customer) GoString() string {
	return s.String()
}

func (s *Customer) SetPhoneNumber(v string) *Customer {
	s.PhoneNumber = &v
	return s
}

func (s *Customer) SetBizId(v string) *Customer {
	s.BizId = &v
	return s
}

func (s *Customer) SetBizProperties(v string) *Customer {
	s.BizProperties = &v
	return s
}

// 客户号码列表
type CustomerItem struct {
	// 客户业务键
	// example:
	//
	// 客户业务键
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 手机号
	// example:
	//
	// 12233332222
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 业务属性
	// example:
	//
	// {"姓名":"张","customerId":"Z3gnNptlEf7FyNGsD3o1mg","性别":"1","issue":"1","effectTime":"1","price":"1"}
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
}

func (s CustomerItem) String() string {
	return tea.Prettify(s)
}

func (s CustomerItem) GoString() string {
	return s.String()
}

func (s *CustomerItem) SetBizId(v string) *CustomerItem {
	s.BizId = &v
	return s
}

func (s *CustomerItem) SetPhoneNumber(v string) *CustomerItem {
	s.PhoneNumber = &v
	return s
}

func (s *CustomerItem) SetBizProperties(v string) *CustomerItem {
	s.BizProperties = &v
	return s
}

type ExecuteAntcloudDtcallagentVoiceinspectionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户 ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务空间实例编码，如 demo
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 质检规则集 ID，如 qc-heiniu-v1
	QcRuleSetId *string `json:"qc_rule_set_id,omitempty" xml:"qc_rule_set_id,omitempty" require:"true"`
	// 对话文本
	VoiceText *string `json:"voice_text,omitempty" xml:"voice_text,omitempty" require:"true"`
	// 录音地址
	VoiceUrl *string `json:"voice_url,omitempty" xml:"voice_url,omitempty"`
	// 调用方批次 ID
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 调用方通话唯一标识
	ExternalCallId *string `json:"external_call_id,omitempty" xml:"external_call_id,omitempty"`
}

func (s ExecuteAntcloudDtcallagentVoiceinspectionRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecuteAntcloudDtcallagentVoiceinspectionRequest) GoString() string {
	return s.String()
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetAuthToken(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetTenantId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.TenantId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetInstanceCode(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.InstanceCode = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetQcRuleSetId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.QcRuleSetId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetVoiceText(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.VoiceText = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetVoiceUrl(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.VoiceUrl = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetBatchId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.BatchId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionRequest) SetExternalCallId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionRequest {
	s.ExternalCallId = &v
	return s
}

type ExecuteAntcloudDtcallagentVoiceinspectionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 质检记录 ID
	QcRecordId *string `json:"qc_record_id,omitempty" xml:"qc_record_id,omitempty"`
	// ACCEPTED 表示异步任务已受理
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 本次提交的批次 ID
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 外部通话唯一标识
	ExternalCallId *string `json:"external_call_id,omitempty" xml:"external_call_id,omitempty"`
}

func (s ExecuteAntcloudDtcallagentVoiceinspectionResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecuteAntcloudDtcallagentVoiceinspectionResponse) GoString() string {
	return s.String()
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetReqMsgId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetResultCode(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetResultMsg(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetQcRecordId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.QcRecordId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetStatus(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.Status = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetBatchId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.BatchId = &v
	return s
}

func (s *ExecuteAntcloudDtcallagentVoiceinspectionResponse) SetExternalCallId(v string) *ExecuteAntcloudDtcallagentVoiceinspectionResponse {
	s.ExternalCallId = &v
	return s
}

type QueryAntcloudDtcallagentVoiceinspectionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户 ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务空间实例编码
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// execute 接口返回的质检记录 ID
	QcRecordId *string `json:"qc_record_id,omitempty" xml:"qc_record_id,omitempty" require:"true"`
}

func (s QueryAntcloudDtcallagentVoiceinspectionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudDtcallagentVoiceinspectionRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudDtcallagentVoiceinspectionRequest) SetAuthToken(v string) *QueryAntcloudDtcallagentVoiceinspectionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionRequest) SetTenantId(v string) *QueryAntcloudDtcallagentVoiceinspectionRequest {
	s.TenantId = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionRequest) SetInstanceCode(v string) *QueryAntcloudDtcallagentVoiceinspectionRequest {
	s.InstanceCode = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionRequest) SetQcRecordId(v string) *QueryAntcloudDtcallagentVoiceinspectionRequest {
	s.QcRecordId = &v
	return s
}

type QueryAntcloudDtcallagentVoiceinspectionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// qc_record_id
	QcRecordId *string `json:"qc_record_id,omitempty" xml:"qc_record_id,omitempty"`
	// 异步任务状态，如 PROCESSING、COMPLETED、FAILED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 100 分制总分
	TotalScore *int64 `json:"total_score,omitempty" xml:"total_score,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 质检规则命中明细
	Checklist []*string `json:"checklist,omitempty" xml:"checklist,omitempty" type:"Repeated"`
}

func (s QueryAntcloudDtcallagentVoiceinspectionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudDtcallagentVoiceinspectionResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetReqMsgId(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetResultCode(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetResultMsg(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetQcRecordId(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.QcRecordId = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetStatus(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.Status = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetTotalScore(v int64) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.TotalScore = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetResult(v string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.Result = &v
	return s
}

func (s *QueryAntcloudDtcallagentVoiceinspectionResponse) SetChecklist(v []*string) *QueryAntcloudDtcallagentVoiceinspectionResponse {
	s.Checklist = v
	return s
}

type ImportOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 投放任务ID
	StrategyTaskId *int64 `json:"strategy_task_id,omitempty" xml:"strategy_task_id,omitempty" require:"true"`
	// 客户请求流水号
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 客户号码列表
	Customers []*CustomerItem `json:"customers,omitempty" xml:"customers,omitempty" require:"true" type:"Repeated"`
	// 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
	MobileFormat *string `json:"mobile_format,omitempty" xml:"mobile_format,omitempty"`
}

func (s ImportOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportOrderRequest) GoString() string {
	return s.String()
}

func (s *ImportOrderRequest) SetAuthToken(v string) *ImportOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportOrderRequest) SetStrategyTaskId(v int64) *ImportOrderRequest {
	s.StrategyTaskId = &v
	return s
}

func (s *ImportOrderRequest) SetRequestNo(v string) *ImportOrderRequest {
	s.RequestNo = &v
	return s
}

func (s *ImportOrderRequest) SetCustomers(v []*CustomerItem) *ImportOrderRequest {
	s.Customers = v
	return s
}

func (s *ImportOrderRequest) SetMobileFormat(v string) *ImportOrderRequest {
	s.MobileFormat = &v
	return s
}

type ImportOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否受理成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
	// 平台批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
	// 同步段状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 失败原因码
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
}

func (s ImportOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportOrderResponse) GoString() string {
	return s.String()
}

func (s *ImportOrderResponse) SetReqMsgId(v string) *ImportOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportOrderResponse) SetResultCode(v string) *ImportOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportOrderResponse) SetResultMsg(v string) *ImportOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportOrderResponse) SetSuccess(v string) *ImportOrderResponse {
	s.Success = &v
	return s
}

func (s *ImportOrderResponse) SetBatchNo(v string) *ImportOrderResponse {
	s.BatchNo = &v
	return s
}

func (s *ImportOrderResponse) SetStatus(v string) *ImportOrderResponse {
	s.Status = &v
	return s
}

func (s *ImportOrderResponse) SetFailReason(v string) *ImportOrderResponse {
	s.FailReason = &v
	return s
}

type CallbackRobotcallRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 外呼号码，支持密文
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 当前呼叫次数 Integer
	CurrentCallTimes *int64 `json:"current_call_times,omitempty" xml:"current_call_times,omitempty" require:"true"`
	// 号码的模版类型
	KeyTemplate *string `json:"key_template,omitempty" xml:"key_template,omitempty" require:"true"`
	// 导入号码时返回的批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
	CallType *int64 `json:"call_type,omitempty" xml:"call_type,omitempty" require:"true"`
	// 用户自定义标签
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 外呼呼叫实例id
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼任务编号
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 外呼任务名称
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 外呼的话术模板ID，可以为空
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态编码对应描述
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 转人工状态编码
	TransferStatusCode *string `json:"transfer_status_code,omitempty" xml:"transfer_status_code,omitempty" require:"true"`
	// 转人工状态编码对应描述
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty" require:"true"`
	// 分配坐席ID,可以为空
	AgentId *int64 `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
	AgentTag *string `json:"agent_tag,omitempty" xml:"agent_tag,omitempty"`
	// 坐席分机号，可以为空
	AgentExtension *string `json:"agent_extension,omitempty" xml:"agent_extension,omitempty"`
	// 导入时间，格式:2019-01-09 14:14:19
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间，格式：2019-01-09 14:14:19
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长,单位毫秒
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty"`
	// 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	SpeakingTime *string `json:"speaking_time,omitempty" xml:"speaking_time,omitempty" require:"true"`
	// 通话时长，单位：秒
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 通话挂断时间
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	AgentSpeakingTime *string `json:"agent_speaking_time,omitempty" xml:"agent_speaking_time,omitempty" require:"true"`
	// 坐席通话时长，单位：秒
	AgentSpeakingDuration *int64 `json:"agent_speaking_duration,omitempty" xml:"agent_speaking_duration,omitempty" require:"true"`
	// 意向标签
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty"`
	// 回复关键词
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty"`
	// 挂机方式
	HungupType *int64 `json:"hungup_type,omitempty" xml:"hungup_type,omitempty" require:"true"`
	// 挂机短信，1:发送，2:不发送
	Sms *int64 `json:"sms,omitempty" xml:"sms,omitempty" require:"true"`
	// 对话录音,url
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 对话记录
	Chats *string `json:"chats,omitempty" xml:"chats,omitempty"`
	// 0:不添加，1:添加
	AddWx *int64 `json:"add_wx,omitempty" xml:"add_wx,omitempty"`
	// 加微进度可选值：已申请、加微成功
	AddWxStatus *string `json:"add_wx_status,omitempty" xml:"add_wx_status,omitempty"`
	// 是否接通重呼 0正常外呼，1接通重呼
	AnswerRecall *int64 `json:"answer_recall,omitempty" xml:"answer_recall,omitempty" require:"true"`
	// 导入号码时的参数值
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 导入号码时的业务参数值
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
	// 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
	InterceptReason *string `json:"intercept_reason,omitempty" xml:"intercept_reason,omitempty"`
	// 回调冗余字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CallbackRobotcallRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackRobotcallRequest) GoString() string {
	return s.String()
}

func (s *CallbackRobotcallRequest) SetAuthToken(v string) *CallbackRobotcallRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackRobotcallRequest) SetCustomerKey(v string) *CallbackRobotcallRequest {
	s.CustomerKey = &v
	return s
}

func (s *CallbackRobotcallRequest) SetCurrentCallTimes(v int64) *CallbackRobotcallRequest {
	s.CurrentCallTimes = &v
	return s
}

func (s *CallbackRobotcallRequest) SetKeyTemplate(v string) *CallbackRobotcallRequest {
	s.KeyTemplate = &v
	return s
}

func (s *CallbackRobotcallRequest) SetBatchId(v string) *CallbackRobotcallRequest {
	s.BatchId = &v
	return s
}

func (s *CallbackRobotcallRequest) SetCallType(v int64) *CallbackRobotcallRequest {
	s.CallType = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTag(v string) *CallbackRobotcallRequest {
	s.Tag = &v
	return s
}

func (s *CallbackRobotcallRequest) SetCallId(v string) *CallbackRobotcallRequest {
	s.CallId = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTaskId(v int64) *CallbackRobotcallRequest {
	s.TaskId = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTaskName(v string) *CallbackRobotcallRequest {
	s.TaskName = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTemplateId(v int64) *CallbackRobotcallRequest {
	s.TemplateId = &v
	return s
}

func (s *CallbackRobotcallRequest) SetStatusCode(v int64) *CallbackRobotcallRequest {
	s.StatusCode = &v
	return s
}

func (s *CallbackRobotcallRequest) SetStatusDescription(v string) *CallbackRobotcallRequest {
	s.StatusDescription = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTransferStatusCode(v string) *CallbackRobotcallRequest {
	s.TransferStatusCode = &v
	return s
}

func (s *CallbackRobotcallRequest) SetTransferStatus(v string) *CallbackRobotcallRequest {
	s.TransferStatus = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAgentId(v int64) *CallbackRobotcallRequest {
	s.AgentId = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAgentTag(v string) *CallbackRobotcallRequest {
	s.AgentTag = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAgentExtension(v string) *CallbackRobotcallRequest {
	s.AgentExtension = &v
	return s
}

func (s *CallbackRobotcallRequest) SetImportTime(v string) *CallbackRobotcallRequest {
	s.ImportTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetCallBeginTime(v string) *CallbackRobotcallRequest {
	s.CallBeginTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetRingTime(v int64) *CallbackRobotcallRequest {
	s.RingTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAnswerTime(v string) *CallbackRobotcallRequest {
	s.AnswerTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetSpeakingTime(v string) *CallbackRobotcallRequest {
	s.SpeakingTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetSpeakingDuration(v int64) *CallbackRobotcallRequest {
	s.SpeakingDuration = &v
	return s
}

func (s *CallbackRobotcallRequest) SetHangupTime(v string) *CallbackRobotcallRequest {
	s.HangupTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetSpeakingTurns(v int64) *CallbackRobotcallRequest {
	s.SpeakingTurns = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAgentSpeakingTime(v string) *CallbackRobotcallRequest {
	s.AgentSpeakingTime = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAgentSpeakingDuration(v int64) *CallbackRobotcallRequest {
	s.AgentSpeakingDuration = &v
	return s
}

func (s *CallbackRobotcallRequest) SetIntentTag(v string) *CallbackRobotcallRequest {
	s.IntentTag = &v
	return s
}

func (s *CallbackRobotcallRequest) SetIntentDescription(v string) *CallbackRobotcallRequest {
	s.IntentDescription = &v
	return s
}

func (s *CallbackRobotcallRequest) SetIndividualTag(v string) *CallbackRobotcallRequest {
	s.IndividualTag = &v
	return s
}

func (s *CallbackRobotcallRequest) SetKeywords(v string) *CallbackRobotcallRequest {
	s.Keywords = &v
	return s
}

func (s *CallbackRobotcallRequest) SetHungupType(v int64) *CallbackRobotcallRequest {
	s.HungupType = &v
	return s
}

func (s *CallbackRobotcallRequest) SetSms(v int64) *CallbackRobotcallRequest {
	s.Sms = &v
	return s
}

func (s *CallbackRobotcallRequest) SetChatRecord(v string) *CallbackRobotcallRequest {
	s.ChatRecord = &v
	return s
}

func (s *CallbackRobotcallRequest) SetChats(v string) *CallbackRobotcallRequest {
	s.Chats = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAddWx(v int64) *CallbackRobotcallRequest {
	s.AddWx = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAddWxStatus(v string) *CallbackRobotcallRequest {
	s.AddWxStatus = &v
	return s
}

func (s *CallbackRobotcallRequest) SetAnswerRecall(v int64) *CallbackRobotcallRequest {
	s.AnswerRecall = &v
	return s
}

func (s *CallbackRobotcallRequest) SetProperties(v string) *CallbackRobotcallRequest {
	s.Properties = &v
	return s
}

func (s *CallbackRobotcallRequest) SetBizProperties(v string) *CallbackRobotcallRequest {
	s.BizProperties = &v
	return s
}

func (s *CallbackRobotcallRequest) SetInterceptReason(v string) *CallbackRobotcallRequest {
	s.InterceptReason = &v
	return s
}

func (s *CallbackRobotcallRequest) SetExtInfo(v string) *CallbackRobotcallRequest {
	s.ExtInfo = &v
	return s
}

type CallbackRobotcallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackRobotcallResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackRobotcallResponse) GoString() string {
	return s.String()
}

func (s *CallbackRobotcallResponse) SetReqMsgId(v string) *CallbackRobotcallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackRobotcallResponse) SetResultCode(v string) *CallbackRobotcallResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackRobotcallResponse) SetResultMsg(v string) *CallbackRobotcallResponse {
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
				"sdk_version":      tea.String("1.0.7"),
				"_prod_code":       tea.String("AICONUMDECISION"),
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
// Description: 黑牛质检接口
//
// Summary: 黑牛质检接口
func (client *Client) ExecuteAntcloudDtcallagentVoiceinspection(request *ExecuteAntcloudDtcallagentVoiceinspectionRequest) (_result *ExecuteAntcloudDtcallagentVoiceinspectionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecuteAntcloudDtcallagentVoiceinspectionResponse{}
	_body, _err := client.ExecuteAntcloudDtcallagentVoiceinspectionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 黑牛质检接口
//
// Summary: 黑牛质检接口
func (client *Client) ExecuteAntcloudDtcallagentVoiceinspectionEx(request *ExecuteAntcloudDtcallagentVoiceinspectionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecuteAntcloudDtcallagentVoiceinspectionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecuteAntcloudDtcallagentVoiceinspectionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.voiceinspection.execute"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 黑牛质检接口查询结果
//
// Summary: 黑牛质检接口查询结果
func (client *Client) QueryAntcloudDtcallagentVoiceinspection(request *QueryAntcloudDtcallagentVoiceinspectionRequest) (_result *QueryAntcloudDtcallagentVoiceinspectionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudDtcallagentVoiceinspectionResponse{}
	_body, _err := client.QueryAntcloudDtcallagentVoiceinspectionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 黑牛质检接口查询结果
//
// Summary: 黑牛质检接口查询结果
func (client *Client) QueryAntcloudDtcallagentVoiceinspectionEx(request *QueryAntcloudDtcallagentVoiceinspectionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudDtcallagentVoiceinspectionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudDtcallagentVoiceinspectionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.voiceinspection.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 云通信号码决策平台收单
//
// Summary: 云通信号码决策平台收单
func (client *Client) ImportOrder(request *ImportOrderRequest) (_result *ImportOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportOrderResponse{}
	_body, _err := client.ImportOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 云通信号码决策平台收单
//
// Summary: 云通信号码决策平台收单
func (client *Client) ImportOrderEx(request *ImportOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.aiconumdecision.order.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 外呼回执
//
// Summary: 外呼回执
func (client *Client) CallbackRobotcall(request *CallbackRobotcallRequest) (_result *CallbackRobotcallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackRobotcallResponse{}
	_body, _err := client.CallbackRobotcallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 外呼回执
//
// Summary: 外呼回执
func (client *Client) CallbackRobotcallEx(request *CallbackRobotcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRobotcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRobotcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.aiconumdecision.robotcall.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
