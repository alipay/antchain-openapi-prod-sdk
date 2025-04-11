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

// 场景构建结果体
type StrategyUploadResult struct {
	// 元数据id
	RuleMetaId *int64 `json:"rule_meta_id,omitempty" xml:"rule_meta_id,omitempty" require:"true"`
	// 场景id
	SceneId *int64 `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 租户场景id
	TenantSceneId *int64 `json:"tenant_scene_id,omitempty" xml:"tenant_scene_id,omitempty" require:"true"`
	// 圈客规则id
	DecisionRuleId *int64 `json:"decision_rule_id,omitempty" xml:"decision_rule_id,omitempty" require:"true"`
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
}

func (s StrategyUploadResult) String() string {
	return tea.Prettify(s)
}

func (s StrategyUploadResult) GoString() string {
	return s.String()
}

func (s *StrategyUploadResult) SetRuleMetaId(v int64) *StrategyUploadResult {
	s.RuleMetaId = &v
	return s
}

func (s *StrategyUploadResult) SetSceneId(v int64) *StrategyUploadResult {
	s.SceneId = &v
	return s
}

func (s *StrategyUploadResult) SetTenantSceneId(v int64) *StrategyUploadResult {
	s.TenantSceneId = &v
	return s
}

func (s *StrategyUploadResult) SetDecisionRuleId(v int64) *StrategyUploadResult {
	s.DecisionRuleId = &v
	return s
}

func (s *StrategyUploadResult) SetSceneStrategyId(v int64) *StrategyUploadResult {
	s.SceneStrategyId = &v
	return s
}

type CallbackSmsStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// TEXT_SMS_REPORT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 发送时间
	SendTime *string `json:"send_time,omitempty" xml:"send_time,omitempty" require:"true"`
	// 状态报告时间。
	ReportTime *string `json:"report_time,omitempty" xml:"report_time,omitempty" require:"true"`
	// 是否接收成功。取值：true：接收成功false：接收失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 状态报告编码。发送成功情况下为“DELIVERED”
	ErrCode *string `json:"err_code,omitempty" xml:"err_code,omitempty" require:"true"`
	// 状态报告说明。发送成功情况下为“用户接收成功”
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty" require:"true"`
	// 短信长度。
	SmsSize *string `json:"sms_size,omitempty" xml:"sms_size,omitempty" require:"true"`
	// 发送回执ID，即发送流水号。
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务扩展字段，回执时透传，JSON格式
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty" require:"true"`
	// 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
	SmsType *string `json:"sms_type,omitempty" xml:"sms_type,omitempty"`
	// 运营商
	ServiceProvider *string `json:"service_provider,omitempty" xml:"service_provider,omitempty" require:"true"`
	// 手机号归属地
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
}

func (s CallbackSmsStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSmsStatusRequest) GoString() string {
	return s.String()
}

func (s *CallbackSmsStatusRequest) SetAuthToken(v string) *CallbackSmsStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetProductInstanceId(v string) *CallbackSmsStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetType(v string) *CallbackSmsStatusRequest {
	s.Type = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetPhoneNumber(v string) *CallbackSmsStatusRequest {
	s.PhoneNumber = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetSendTime(v string) *CallbackSmsStatusRequest {
	s.SendTime = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetReportTime(v string) *CallbackSmsStatusRequest {
	s.ReportTime = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetSuccess(v bool) *CallbackSmsStatusRequest {
	s.Success = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetErrCode(v string) *CallbackSmsStatusRequest {
	s.ErrCode = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetErrMsg(v string) *CallbackSmsStatusRequest {
	s.ErrMsg = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetSmsSize(v string) *CallbackSmsStatusRequest {
	s.SmsSize = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetBizId(v string) *CallbackSmsStatusRequest {
	s.BizId = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetBizProperties(v string) *CallbackSmsStatusRequest {
	s.BizProperties = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetSmsType(v string) *CallbackSmsStatusRequest {
	s.SmsType = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetServiceProvider(v string) *CallbackSmsStatusRequest {
	s.ServiceProvider = &v
	return s
}

func (s *CallbackSmsStatusRequest) SetCity(v string) *CallbackSmsStatusRequest {
	s.City = &v
	return s
}

type CallbackSmsStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackSmsStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSmsStatusResponse) GoString() string {
	return s.String()
}

func (s *CallbackSmsStatusResponse) SetReqMsgId(v string) *CallbackSmsStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSmsStatusResponse) SetResultCode(v string) *CallbackSmsStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSmsStatusResponse) SetResultMsg(v string) *CallbackSmsStatusResponse {
	s.ResultMsg = &v
	return s
}

type CallbackSmsUpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回执类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 手机号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 发送时间
	SendTime *string `json:"send_time,omitempty" xml:"send_time,omitempty" require:"true"`
	// 发送内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 签名
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 由通信平台提供的短信发送账号ak
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty" require:"true"`
	// 上行短信扩展号码
	DestCode *string `json:"dest_code,omitempty" xml:"dest_code,omitempty" require:"true"`
	// 序列
	SequenceId *int64 `json:"sequence_id,omitempty" xml:"sequence_id,omitempty" require:"true"`
}

func (s CallbackSmsUpRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSmsUpRequest) GoString() string {
	return s.String()
}

func (s *CallbackSmsUpRequest) SetAuthToken(v string) *CallbackSmsUpRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSmsUpRequest) SetProductInstanceId(v string) *CallbackSmsUpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackSmsUpRequest) SetType(v string) *CallbackSmsUpRequest {
	s.Type = &v
	return s
}

func (s *CallbackSmsUpRequest) SetPhoneNumber(v string) *CallbackSmsUpRequest {
	s.PhoneNumber = &v
	return s
}

func (s *CallbackSmsUpRequest) SetSendTime(v string) *CallbackSmsUpRequest {
	s.SendTime = &v
	return s
}

func (s *CallbackSmsUpRequest) SetContent(v string) *CallbackSmsUpRequest {
	s.Content = &v
	return s
}

func (s *CallbackSmsUpRequest) SetSignName(v string) *CallbackSmsUpRequest {
	s.SignName = &v
	return s
}

func (s *CallbackSmsUpRequest) SetAppKey(v string) *CallbackSmsUpRequest {
	s.AppKey = &v
	return s
}

func (s *CallbackSmsUpRequest) SetDestCode(v string) *CallbackSmsUpRequest {
	s.DestCode = &v
	return s
}

func (s *CallbackSmsUpRequest) SetSequenceId(v int64) *CallbackSmsUpRequest {
	s.SequenceId = &v
	return s
}

type CallbackSmsUpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackSmsUpResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSmsUpResponse) GoString() string {
	return s.String()
}

func (s *CallbackSmsUpResponse) SetReqMsgId(v string) *CallbackSmsUpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSmsUpResponse) SetResultCode(v string) *CallbackSmsUpResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSmsUpResponse) SetResultMsg(v string) *CallbackSmsUpResponse {
	s.ResultMsg = &v
	return s
}

type CallbackRobotcallRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外呼号码，支持密文
	//
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 当前呼叫次数 Integer
	//
	CurrentCallTimes *int64 `json:"current_call_times,omitempty" xml:"current_call_times,omitempty" require:"true"`
	// 号码的模版类型
	//
	KeyTemplate *string `json:"key_template,omitempty" xml:"key_template,omitempty" require:"true"`
	// 导入号码时返回的批次号
	//
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 ...
	//
	CallType *int64 `json:"call_type,omitempty" xml:"call_type,omitempty" require:"true"`
	// 用户自定义标签
	//
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 外呼呼叫实例id
	//
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼任务编号
	//
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 外呼任务名称
	//
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 外呼的话术模板ID，可以为空
	//
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	//
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态编码对应描述
	//
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 转人工状态编码
	//
	TransferStatusCode *string `json:"transfer_status_code,omitempty" xml:"transfer_status_code,omitempty" require:"true"`
	// 转人工状态编码对应描述
	//
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty" require:"true"`
	// 分配坐席ID,可以为空
	//
	AgentId *int64 `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 建议填写坐席在贵司业务系统唯一标识，用于查询对应agent...
	//
	AgentTag *string `json:"agent_tag,omitempty" xml:"agent_tag,omitempty"`
	// 坐席分机号，可以为空
	//
	AgentExtension *string `json:"agent_extension,omitempty" xml:"agent_extension,omitempty"`
	// 导入时间，格式:2019-01-09 14:14:19
	//
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间，格式：2019-01-09 14:14:19
	//
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长,单位毫秒
	//
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	//
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty"`
	// 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	//
	SpeakingTime *string `json:"speaking_time,omitempty" xml:"speaking_time,omitempty" require:"true"`
	// 通话时长，单位：秒
	//
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 通话挂断时间
	//
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	//
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	//
	AgentSpeakingTime *string `json:"agent_speaking_time,omitempty" xml:"agent_speaking_time,omitempty" require:"true"`
	// 坐席通话时长，单位：秒
	//
	AgentSpeakingDuration *int64 `json:"agent_speaking_duration,omitempty" xml:"agent_speaking_duration,omitempty" require:"true"`
	// 意向标签
	//
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	//
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	//
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty"`
	// 回复关键词
	//
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty"`
	// 挂机方式
	// 1
	HungupType *int64 `json:"hungup_type,omitempty" xml:"hungup_type,omitempty" require:"true"`
	// 挂机短信，1:发送，2:不发送
	//
	Sms *int64 `json:"sms,omitempty" xml:"sms,omitempty" require:"true"`
	// 对话录音,url
	//
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 对话记录
	//
	Chats *string `json:"chats,omitempty" xml:"chats,omitempty"`
	// 0:不添加，1:添加
	//
	AddWx *int64 `json:"add_wx,omitempty" xml:"add_wx,omitempty"`
	// 加微进度可选值：已申请、加微成功
	//
	AddWxStatus *string `json:"add_wx_status,omitempty" xml:"add_wx_status,omitempty"`
	// 是否接通重呼 0正常外呼，1接通重呼
	//
	AnswerRecall *int64 `json:"answer_recall,omitempty" xml:"answer_recall,omitempty" require:"true"`
	// 导入号码时的参数值
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 导入号码时的业务参数值
	//
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
	// 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
	//
	InterceptReason *string `json:"intercept_reason,omitempty" xml:"intercept_reason,omitempty"`
	// 回调冗余字段
	//
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

func (s *CallbackRobotcallRequest) SetProductInstanceId(v string) *CallbackRobotcallRequest {
	s.ProductInstanceId = &v
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

type ImportInitUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要刷新的key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 需要刷新的value，可能是json格式
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ImportInitUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportInitUploadRequest) GoString() string {
	return s.String()
}

func (s *ImportInitUploadRequest) SetAuthToken(v string) *ImportInitUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportInitUploadRequest) SetProductInstanceId(v string) *ImportInitUploadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportInitUploadRequest) SetKey(v string) *ImportInitUploadRequest {
	s.Key = &v
	return s
}

func (s *ImportInitUploadRequest) SetValue(v string) *ImportInitUploadRequest {
	s.Value = &v
	return s
}

type ImportInitUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 场景结构体
	UploadResult *StrategyUploadResult `json:"upload_result,omitempty" xml:"upload_result,omitempty"`
}

func (s ImportInitUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportInitUploadResponse) GoString() string {
	return s.String()
}

func (s *ImportInitUploadResponse) SetReqMsgId(v string) *ImportInitUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportInitUploadResponse) SetResultCode(v string) *ImportInitUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportInitUploadResponse) SetResultMsg(v string) *ImportInitUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportInitUploadResponse) SetSuccess(v bool) *ImportInitUploadResponse {
	s.Success = &v
	return s
}

func (s *ImportInitUploadResponse) SetUploadResult(v *StrategyUploadResult) *ImportInitUploadResponse {
	s.UploadResult = v
	return s
}

type ReplaceRobotcallPhoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 当前时间戳毫秒值
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 待解密号码
	Aesphone *string `json:"aesphone,omitempty" xml:"aesphone,omitempty" require:"true"`
}

func (s ReplaceRobotcallPhoneRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceRobotcallPhoneRequest) GoString() string {
	return s.String()
}

func (s *ReplaceRobotcallPhoneRequest) SetAuthToken(v string) *ReplaceRobotcallPhoneRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceRobotcallPhoneRequest) SetProductInstanceId(v string) *ReplaceRobotcallPhoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceRobotcallPhoneRequest) SetReqId(v string) *ReplaceRobotcallPhoneRequest {
	s.ReqId = &v
	return s
}

func (s *ReplaceRobotcallPhoneRequest) SetTimestamp(v int64) *ReplaceRobotcallPhoneRequest {
	s.Timestamp = &v
	return s
}

func (s *ReplaceRobotcallPhoneRequest) SetAesphone(v string) *ReplaceRobotcallPhoneRequest {
	s.Aesphone = &v
	return s
}

type ReplaceRobotcallPhoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解密后的手机号
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ReplaceRobotcallPhoneResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceRobotcallPhoneResponse) GoString() string {
	return s.String()
}

func (s *ReplaceRobotcallPhoneResponse) SetReqMsgId(v string) *ReplaceRobotcallPhoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceRobotcallPhoneResponse) SetResultCode(v string) *ReplaceRobotcallPhoneResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceRobotcallPhoneResponse) SetResultMsg(v string) *ReplaceRobotcallPhoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReplaceRobotcallPhoneResponse) SetData(v string) *ReplaceRobotcallPhoneResponse {
	s.Data = &v
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
				"sdk_version":      tea.String("1.0.3"),
				"_prod_code":       tea.String("UNICONTACT"),
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

/**
 * Description: 短信状态回执
 * Summary: 短信状态回执
 */
func (client *Client) CallbackSmsStatus(request *CallbackSmsStatusRequest) (_result *CallbackSmsStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSmsStatusResponse{}
	_body, _err := client.CallbackSmsStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信状态回执
 * Summary: 短信状态回执
 */
func (client *Client) CallbackSmsStatusEx(request *CallbackSmsStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSmsStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSmsStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.unicontact.sms.status.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信上行回执
 * Summary: 短信上行回执
 */
func (client *Client) CallbackSmsUp(request *CallbackSmsUpRequest) (_result *CallbackSmsUpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSmsUpResponse{}
	_body, _err := client.CallbackSmsUpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信上行回执
 * Summary: 短信上行回执
 */
func (client *Client) CallbackSmsUpEx(request *CallbackSmsUpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSmsUpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSmsUpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.unicontact.sms.up.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外呼回执
 * Summary: 外呼回执
 */
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

/**
 * Description: 外呼回执
 * Summary: 外呼回执
 */
func (client *Client) CallbackRobotcallEx(request *CallbackRobotcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRobotcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRobotcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.unicontact.robotcall.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 初始化数据上传or更新
 * Summary: 初始化数据上传or更新
 */
func (client *Client) ImportInitUpload(request *ImportInitUploadRequest) (_result *ImportInitUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportInitUploadResponse{}
	_body, _err := client.ImportInitUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 初始化数据上传or更新
 * Summary: 初始化数据上传or更新
 */
func (client *Client) ImportInitUploadEx(request *ImportInitUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportInitUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportInitUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.unicontact.init.upload.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外呼手机号解密
 * Summary: 外呼手机号解密
 */
func (client *Client) ReplaceRobotcallPhone(request *ReplaceRobotcallPhoneRequest) (_result *ReplaceRobotcallPhoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceRobotcallPhoneResponse{}
	_body, _err := client.ReplaceRobotcallPhoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外呼手机号解密
 * Summary: 外呼手机号解密
 */
func (client *Client) ReplaceRobotcallPhoneEx(request *ReplaceRobotcallPhoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceRobotcallPhoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceRobotcallPhoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.unicontact.robotcall.phone.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
