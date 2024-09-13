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

// 消息发送状态
type SmsSendStatus struct {
	// 手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty" require:"true"`
	// 发送状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 发送状态描述
	DetailMsg *string `json:"detail_msg,omitempty" xml:"detail_msg,omitempty" require:"true"`
}

func (s SmsSendStatus) String() string {
	return tea.Prettify(s)
}

func (s SmsSendStatus) GoString() string {
	return s.String()
}

func (s *SmsSendStatus) SetPhoneNo(v string) *SmsSendStatus {
	s.PhoneNo = &v
	return s
}

func (s *SmsSendStatus) SetStatus(v string) *SmsSendStatus {
	s.Status = &v
	return s
}

func (s *SmsSendStatus) SetDetailMsg(v string) *SmsSendStatus {
	s.DetailMsg = &v
	return s
}

// 短信模板状态查询结果
type QueryTemplateStatusRes struct {
	// 短信模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 短信标题
	SmsTitle *string `json:"sms_title,omitempty" xml:"sms_title,omitempty" require:"true"`
	// 模板状态
	TemplateStatus *string `json:"template_status,omitempty" xml:"template_status,omitempty" require:"true"`
	// 审核结果描述
	CensorResult *string `json:"censor_result,omitempty" xml:"censor_result,omitempty" require:"true"`
}

func (s QueryTemplateStatusRes) String() string {
	return tea.Prettify(s)
}

func (s QueryTemplateStatusRes) GoString() string {
	return s.String()
}

func (s *QueryTemplateStatusRes) SetTemplateId(v string) *QueryTemplateStatusRes {
	s.TemplateId = &v
	return s
}

func (s *QueryTemplateStatusRes) SetSmsTitle(v string) *QueryTemplateStatusRes {
	s.SmsTitle = &v
	return s
}

func (s *QueryTemplateStatusRes) SetTemplateStatus(v string) *QueryTemplateStatusRes {
	s.TemplateStatus = &v
	return s
}

func (s *QueryTemplateStatusRes) SetCensorResult(v string) *QueryTemplateStatusRes {
	s.CensorResult = &v
	return s
}

// 短信模版创建返回体
type SmsTempCreateData struct {
	// 模版id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s SmsTempCreateData) String() string {
	return tea.Prettify(s)
}

func (s SmsTempCreateData) GoString() string {
	return s.String()
}

func (s *SmsTempCreateData) SetTemplateId(v string) *SmsTempCreateData {
	s.TemplateId = &v
	return s
}

// 批量发送任务结果
type BatchSendTaskData struct {
	// 批量发送任务id
	BatchTaskId *string `json:"batch_task_id,omitempty" xml:"batch_task_id,omitempty" require:"true"`
}

func (s BatchSendTaskData) String() string {
	return tea.Prettify(s)
}

func (s BatchSendTaskData) GoString() string {
	return s.String()
}

func (s *BatchSendTaskData) SetBatchTaskId(v string) *BatchSendTaskData {
	s.BatchTaskId = &v
	return s
}

// 素材
type SmsMaterial struct {
	// 素材名称，当素材类型
	// 为"text/plain"时可不传，其他情况必传
	MaterialName *string `json:"material_name,omitempty" xml:"material_name,omitempty"`
	// 素材类型
	// 本期最多只⽀持⼀张图⽚和⼀段⽂本信息；变量占位符只能是按顺序的数字{1}-{9},最多⽀持9个变量；链接中的变量只能放在尾部，如：http://aabbcc/{1}
	MaterialType *string `json:"material_type,omitempty" xml:"material_type,omitempty" require:"true"`
	// 素材内容
	MaterialContent *string `json:"material_content,omitempty" xml:"material_content,omitempty" require:"true"`
}

func (s SmsMaterial) String() string {
	return tea.Prettify(s)
}

func (s SmsMaterial) GoString() string {
	return s.String()
}

func (s *SmsMaterial) SetMaterialName(v string) *SmsMaterial {
	s.MaterialName = &v
	return s
}

func (s *SmsMaterial) SetMaterialType(v string) *SmsMaterial {
	s.MaterialType = &v
	return s
}

func (s *SmsMaterial) SetMaterialContent(v string) *SmsMaterial {
	s.MaterialContent = &v
	return s
}

// 发送内容
type ContentSend struct {
	// 单条手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 变量⻓度限制：
	// “纯中⽂ 不超过 10 个字”；“数字 字⺟ 英⽂符号 不超过20 位”； “纯数字 不超过20 位” ；
	// 有序的变量值列表，按顺序替换报备的模板短信⽂本帧中的变量，列表⻓度和变量个数不⼀致会导致替换变量错误
	TemplateParamList []*string `json:"template_param_list,omitempty" xml:"template_param_list,omitempty" type:"Repeated"`
}

func (s ContentSend) String() string {
	return tea.Prettify(s)
}

func (s ContentSend) GoString() string {
	return s.String()
}

func (s *ContentSend) SetMobile(v string) *ContentSend {
	s.Mobile = &v
	return s
}

func (s *ContentSend) SetTemplateParamList(v []*string) *ContentSend {
	s.TemplateParamList = v
	return s
}

// 上行内容
type ContentReply struct {
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 用户是否已经退订过
	Reject *bool `json:"reject,omitempty" xml:"reject,omitempty" require:"true"`
	// 用户最新回复内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 用户回复时间
	ReplyTime *string `json:"reply_time,omitempty" xml:"reply_time,omitempty" require:"true"`
	// 拓展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s ContentReply) String() string {
	return tea.Prettify(s)
}

func (s ContentReply) GoString() string {
	return s.String()
}

func (s *ContentReply) SetPhone(v string) *ContentReply {
	s.Phone = &v
	return s
}

func (s *ContentReply) SetReject(v bool) *ContentReply {
	s.Reject = &v
	return s
}

func (s *ContentReply) SetContent(v string) *ContentReply {
	s.Content = &v
	return s
}

func (s *ContentReply) SetReplyTime(v string) *ContentReply {
	s.ReplyTime = &v
	return s
}

func (s *ContentReply) SetExtInfo(v string) *ContentReply {
	s.ExtInfo = &v
	return s
}

type QueryReplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 手机号列表
	PhoneNoList []*string `json:"phone_no_list,omitempty" xml:"phone_no_list,omitempty" require:"true" type:"Repeated"`
	// 拓展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryReplyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryReplyRequest) GoString() string {
	return s.String()
}

func (s *QueryReplyRequest) SetAuthToken(v string) *QueryReplyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryReplyRequest) SetProductInstanceId(v string) *QueryReplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryReplyRequest) SetTenantId(v string) *QueryReplyRequest {
	s.TenantId = &v
	return s
}

func (s *QueryReplyRequest) SetPhoneNoList(v []*string) *QueryReplyRequest {
	s.PhoneNoList = v
	return s
}

func (s *QueryReplyRequest) SetExtInfo(v string) *QueryReplyRequest {
	s.ExtInfo = &v
	return s
}

type QueryReplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户回复结果
	Data []*ContentReply `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryReplyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryReplyResponse) GoString() string {
	return s.String()
}

func (s *QueryReplyResponse) SetReqMsgId(v string) *QueryReplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryReplyResponse) SetResultCode(v string) *QueryReplyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryReplyResponse) SetResultMsg(v string) *QueryReplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryReplyResponse) SetData(v []*ContentReply) *QueryReplyResponse {
	s.Data = v
	return s
}

type CreateTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
	// 是否为变量类型模版，默认true
	VariableTemplate *bool `json:"variable_template,omitempty" xml:"variable_template,omitempty"`
	// 短信标题，不超过50个长度，收件人可感知
	SmsTitle *string `json:"sms_title,omitempty" xml:"sms_title,omitempty" require:"true"`
	// 签名名称
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 素材内容
	Material []*SmsMaterial `json:"material,omitempty" xml:"material,omitempty" require:"true" type:"Repeated"`
}

func (s CreateTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateTemplateRequest) SetAuthToken(v string) *CreateTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTemplateRequest) SetProductInstanceId(v string) *CreateTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTemplateRequest) SetTenantId(v string) *CreateTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CreateTemplateRequest) SetRequestUniqueId(v string) *CreateTemplateRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *CreateTemplateRequest) SetVariableTemplate(v bool) *CreateTemplateRequest {
	s.VariableTemplate = &v
	return s
}

func (s *CreateTemplateRequest) SetSmsTitle(v string) *CreateTemplateRequest {
	s.SmsTitle = &v
	return s
}

func (s *CreateTemplateRequest) SetSignName(v string) *CreateTemplateRequest {
	s.SignName = &v
	return s
}

func (s *CreateTemplateRequest) SetExtInfo(v string) *CreateTemplateRequest {
	s.ExtInfo = &v
	return s
}

func (s *CreateTemplateRequest) SetMaterial(v []*SmsMaterial) *CreateTemplateRequest {
	s.Material = v
	return s
}

type CreateTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模版创建响应体
	Data *SmsTempCreateData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateTemplateResponse) SetReqMsgId(v string) *CreateTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTemplateResponse) SetResultCode(v string) *CreateTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTemplateResponse) SetResultMsg(v string) *CreateTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTemplateResponse) SetData(v *SmsTempCreateData) *CreateTemplateResponse {
	s.Data = v
	return s
}

type QueryTemplateStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 彩信模版id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s QueryTemplateStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTemplateStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryTemplateStatusRequest) SetAuthToken(v string) *QueryTemplateStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTemplateStatusRequest) SetProductInstanceId(v string) *QueryTemplateStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTemplateStatusRequest) SetTenantId(v string) *QueryTemplateStatusRequest {
	s.TenantId = &v
	return s
}

func (s *QueryTemplateStatusRequest) SetTemplateId(v string) *QueryTemplateStatusRequest {
	s.TemplateId = &v
	return s
}

type QueryTemplateStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 彩信模版状态查询结果
	Data *QueryTemplateStatusRes `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryTemplateStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTemplateStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryTemplateStatusResponse) SetReqMsgId(v string) *QueryTemplateStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTemplateStatusResponse) SetResultCode(v string) *QueryTemplateStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTemplateStatusResponse) SetResultMsg(v string) *QueryTemplateStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTemplateStatusResponse) SetData(v *QueryTemplateStatusRes) *QueryTemplateStatusResponse {
	s.Data = v
	return s
}

type CreateBatchSendRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方群发任务id，不超过70个长度，用于幂等
	MassTaskId *string `json:"mass_task_id,omitempty" xml:"mass_task_id,omitempty" require:"true"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 变量值需要按模板定义时的变量顺序传递且个数需要对应上
	// 最⼤1000个组包
	ContentList []*ContentSend `json:"content_list,omitempty" xml:"content_list,omitempty" require:"true" type:"Repeated"`
	// 是否立即发送
	SendNow *bool `json:"send_now,omitempty" xml:"send_now,omitempty" require:"true"`
	// 立即发送时，该字段不消费
	SendTime *string `json:"send_time,omitempty" xml:"send_time,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 拓展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CreateBatchSendRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBatchSendRequest) GoString() string {
	return s.String()
}

func (s *CreateBatchSendRequest) SetAuthToken(v string) *CreateBatchSendRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBatchSendRequest) SetProductInstanceId(v string) *CreateBatchSendRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBatchSendRequest) SetMassTaskId(v string) *CreateBatchSendRequest {
	s.MassTaskId = &v
	return s
}

func (s *CreateBatchSendRequest) SetTemplateId(v string) *CreateBatchSendRequest {
	s.TemplateId = &v
	return s
}

func (s *CreateBatchSendRequest) SetContentList(v []*ContentSend) *CreateBatchSendRequest {
	s.ContentList = v
	return s
}

func (s *CreateBatchSendRequest) SetSendNow(v bool) *CreateBatchSendRequest {
	s.SendNow = &v
	return s
}

func (s *CreateBatchSendRequest) SetSendTime(v string) *CreateBatchSendRequest {
	s.SendTime = &v
	return s
}

func (s *CreateBatchSendRequest) SetTenantId(v string) *CreateBatchSendRequest {
	s.TenantId = &v
	return s
}

func (s *CreateBatchSendRequest) SetExtInfo(v string) *CreateBatchSendRequest {
	s.ExtInfo = &v
	return s
}

type CreateBatchSendResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量任务id
	Data *BatchSendTaskData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateBatchSendResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBatchSendResponse) GoString() string {
	return s.String()
}

func (s *CreateBatchSendResponse) SetReqMsgId(v string) *CreateBatchSendResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBatchSendResponse) SetResultCode(v string) *CreateBatchSendResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBatchSendResponse) SetResultMsg(v string) *CreateBatchSendResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBatchSendResponse) SetData(v *BatchSendTaskData) *CreateBatchSendResponse {
	s.Data = v
	return s
}

type QueryMsgStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建批量发送任务
	// 时返回的批量发送
	// 任务id
	BatchTaskId *string `json:"batch_task_id,omitempty" xml:"batch_task_id,omitempty" require:"true"`
	// 手机号列表
	PhoneNoList []*string `json:"phone_no_list,omitempty" xml:"phone_no_list,omitempty" require:"true" type:"Repeated"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 拓展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryMsgStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMsgStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryMsgStatusRequest) SetAuthToken(v string) *QueryMsgStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMsgStatusRequest) SetProductInstanceId(v string) *QueryMsgStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMsgStatusRequest) SetBatchTaskId(v string) *QueryMsgStatusRequest {
	s.BatchTaskId = &v
	return s
}

func (s *QueryMsgStatusRequest) SetPhoneNoList(v []*string) *QueryMsgStatusRequest {
	s.PhoneNoList = v
	return s
}

func (s *QueryMsgStatusRequest) SetTenantId(v string) *QueryMsgStatusRequest {
	s.TenantId = &v
	return s
}

func (s *QueryMsgStatusRequest) SetExtInfo(v string) *QueryMsgStatusRequest {
	s.ExtInfo = &v
	return s
}

type QueryMsgStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息发送状态
	Data []*SmsSendStatus `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryMsgStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMsgStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryMsgStatusResponse) SetReqMsgId(v string) *QueryMsgStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMsgStatusResponse) SetResultCode(v string) *QueryMsgStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMsgStatusResponse) SetResultMsg(v string) *QueryMsgStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMsgStatusResponse) SetData(v []*SmsSendStatus) *QueryMsgStatusResponse {
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
				"sdk_version":      tea.String("1.0.15"),
				"_prod_code":       tea.String("MEDIA_SMS"),
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
 * Description: 上行内容查询
 * Summary: 上行内容查询
 */
func (client *Client) QueryReply(request *QueryReplyRequest) (_result *QueryReplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryReplyResponse{}
	_body, _err := client.QueryReplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上行内容查询
 * Summary: 上行内容查询
 */
func (client *Client) QueryReplyEx(request *QueryReplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryReplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryReplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.reply.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信模版创建
 * Summary: 短信模版创建
 */
func (client *Client) CreateTemplate(request *CreateTemplateRequest) (_result *CreateTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTemplateResponse{}
	_body, _err := client.CreateTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信模版创建
 * Summary: 短信模版创建
 */
func (client *Client) CreateTemplateEx(request *CreateTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信模板审核结果查询
 * Summary: 短信模板审核结果查询
 */
func (client *Client) QueryTemplateStatus(request *QueryTemplateStatusRequest) (_result *QueryTemplateStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTemplateStatusResponse{}
	_body, _err := client.QueryTemplateStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信模板审核结果查询
 * Summary: 短信模板审核结果查询
 */
func (client *Client) QueryTemplateStatusEx(request *QueryTemplateStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTemplateStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTemplateStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.template.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信批量发送任务创建
 * Summary: 短信批量发送任务创建
 */
func (client *Client) CreateBatchSend(request *CreateBatchSendRequest) (_result *CreateBatchSendResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBatchSendResponse{}
	_body, _err := client.CreateBatchSendEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信批量发送任务创建
 * Summary: 短信批量发送任务创建
 */
func (client *Client) CreateBatchSendEx(request *CreateBatchSendRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBatchSendResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBatchSendResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.batch.send.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短信发送状态查询
 * Summary: 短信发送状态查询
 */
func (client *Client) QueryMsgStatus(request *QueryMsgStatusRequest) (_result *QueryMsgStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMsgStatusResponse{}
	_body, _err := client.QueryMsgStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信发送状态查询
 * Summary: 短信发送状态查询
 */
func (client *Client) QueryMsgStatusEx(request *QueryMsgStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMsgStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMsgStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.msg.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
