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

// 短链结果
type ShortUrlResult struct {
	// 短链创建时的标记字符串，可以用该字段关联短链的发送目标
	CustFlag *string `json:"cust_flag,omitempty" xml:"cust_flag,omitempty" require:"true"`
	// 卡片模板的动参字符串
	DyncParam *string `json:"dync_param,omitempty" xml:"dync_param,omitempty" require:"true"`
	// 短链链接
	AimUrl *string `json:"aim_url,omitempty" xml:"aim_url,omitempty" require:"true"`
	// 短链码
	AimCode *string `json:"aim_code,omitempty" xml:"aim_code,omitempty" require:"true"`
	// 0:短链申请成功，非 0:短链申请失败
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 短链申请失败原因
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 支持该短链的厂商
	Factorys []*string `json:"factorys,omitempty" xml:"factorys,omitempty" require:"true" type:"Repeated"`
}

func (s ShortUrlResult) String() string {
	return tea.Prettify(s)
}

func (s ShortUrlResult) GoString() string {
	return s.String()
}

func (s *ShortUrlResult) SetCustFlag(v string) *ShortUrlResult {
	s.CustFlag = &v
	return s
}

func (s *ShortUrlResult) SetDyncParam(v string) *ShortUrlResult {
	s.DyncParam = &v
	return s
}

func (s *ShortUrlResult) SetAimUrl(v string) *ShortUrlResult {
	s.AimUrl = &v
	return s
}

func (s *ShortUrlResult) SetAimCode(v string) *ShortUrlResult {
	s.AimCode = &v
	return s
}

func (s *ShortUrlResult) SetResultCode(v string) *ShortUrlResult {
	s.ResultCode = &v
	return s
}

func (s *ShortUrlResult) SetErrorMsg(v string) *ShortUrlResult {
	s.ErrorMsg = &v
	return s
}

func (s *ShortUrlResult) SetFactorys(v []*string) *ShortUrlResult {
	s.Factorys = v
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

// 解析查询参数
type ParseQueryParam struct {
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
}

func (s ParseQueryParam) String() string {
	return tea.Prettify(s)
}

func (s ParseQueryParam) GoString() string {
	return s.String()
}

func (s *ParseQueryParam) SetMobile(v string) *ParseQueryParam {
	s.Mobile = &v
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

// 短链解析结果
type ShortUrlParseResult struct {
	// 创建短链时传入的客户号，可以用该字段关联短链的发送目标
	CustFlag *string `json:"cust_flag,omitempty" xml:"cust_flag,omitempty" require:"true"`
	// 卡片模板id
	SmartTemplateId *string `json:"smart_template_id,omitempty" xml:"smart_template_id,omitempty" require:"true"`
	// 短链地址
	AimUrl *string `json:"aim_url,omitempty" xml:"aim_url,omitempty" require:"true"`
	// 短链地址尾码
	AimCode *string `json:"aim_code,omitempty" xml:"aim_code,omitempty" require:"true"`
	// BULK 群发,PERSONAL个性化
	AimCodeType *string `json:"aim_code_type,omitempty" xml:"aim_code_type,omitempty" require:"true"`
	// 解析状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 解析状态描述
	Describe *string `json:"describe,omitempty" xml:"describe,omitempty"`
}

func (s ShortUrlParseResult) String() string {
	return tea.Prettify(s)
}

func (s ShortUrlParseResult) GoString() string {
	return s.String()
}

func (s *ShortUrlParseResult) SetCustFlag(v string) *ShortUrlParseResult {
	s.CustFlag = &v
	return s
}

func (s *ShortUrlParseResult) SetSmartTemplateId(v string) *ShortUrlParseResult {
	s.SmartTemplateId = &v
	return s
}

func (s *ShortUrlParseResult) SetAimUrl(v string) *ShortUrlParseResult {
	s.AimUrl = &v
	return s
}

func (s *ShortUrlParseResult) SetAimCode(v string) *ShortUrlParseResult {
	s.AimCode = &v
	return s
}

func (s *ShortUrlParseResult) SetAimCodeType(v string) *ShortUrlParseResult {
	s.AimCodeType = &v
	return s
}

func (s *ShortUrlParseResult) SetStatus(v string) *ShortUrlParseResult {
	s.Status = &v
	return s
}

func (s *ShortUrlParseResult) SetDescribe(v string) *ShortUrlParseResult {
	s.Describe = &v
	return s
}

// 短链创建结果
type ShortUrlCreateResult struct {
	// 卡片模板id
	SmartTemplateId *string `json:"smart_template_id,omitempty" xml:"smart_template_id,omitempty" require:"true"`
	// 短链详细信息列表
	ParamList []*ShortUrlResult `json:"param_list,omitempty" xml:"param_list,omitempty" require:"true" type:"Repeated"`
}

func (s ShortUrlCreateResult) String() string {
	return tea.Prettify(s)
}

func (s ShortUrlCreateResult) GoString() string {
	return s.String()
}

func (s *ShortUrlCreateResult) SetSmartTemplateId(v string) *ShortUrlCreateResult {
	s.SmartTemplateId = &v
	return s
}

func (s *ShortUrlCreateResult) SetParamList(v []*ShortUrlResult) *ShortUrlCreateResult {
	s.ParamList = v
	return s
}

// 账户查询结构体
type AccountSmsSendStatus struct {
	// ⼿机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty" require:"true"`
	// 批次号
	BatchTaskId *string `json:"batch_task_id,omitempty" xml:"batch_task_id,omitempty" require:"true"`
	// 发送状态
	// SUCCESS：发送成
	// 功；
	// FAILED：发送失败；
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 发送状态描述
	DetailMsg *string `json:"detail_msg,omitempty" xml:"detail_msg,omitempty" require:"true"`
}

func (s AccountSmsSendStatus) String() string {
	return tea.Prettify(s)
}

func (s AccountSmsSendStatus) GoString() string {
	return s.String()
}

func (s *AccountSmsSendStatus) SetPhoneNo(v string) *AccountSmsSendStatus {
	s.PhoneNo = &v
	return s
}

func (s *AccountSmsSendStatus) SetBatchTaskId(v string) *AccountSmsSendStatus {
	s.BatchTaskId = &v
	return s
}

func (s *AccountSmsSendStatus) SetStatus(v string) *AccountSmsSendStatus {
	s.Status = &v
	return s
}

func (s *AccountSmsSendStatus) SetDetailMsg(v string) *AccountSmsSendStatus {
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

// 解析结果数据
type ParseResultData struct {
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 是否有解析能力
	// 0:否
	// 1: 是
	ReceiveState *int64 `json:"receive_state,omitempty" xml:"receive_state,omitempty" require:"true"`
}

func (s ParseResultData) String() string {
	return tea.Prettify(s)
}

func (s ParseResultData) GoString() string {
	return s.String()
}

func (s *ParseResultData) SetMobile(v string) *ParseResultData {
	s.Mobile = &v
	return s
}

func (s *ParseResultData) SetReceiveState(v int64) *ParseResultData {
	s.ReceiveState = &v
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

// 卡片模板动态参数信息
type SmartTemplateDyncParam struct {
	// 可以用该字段关联短链的发送目标
	CustFlag *string `json:"cust_flag,omitempty" xml:"cust_flag,omitempty" require:"true"`
	// json字符串
	// {"param1":"123","param2":"100"}
	DyncParams *string `json:"dync_params,omitempty" xml:"dync_params,omitempty"`
}

func (s SmartTemplateDyncParam) String() string {
	return tea.Prettify(s)
}

func (s SmartTemplateDyncParam) GoString() string {
	return s.String()
}

func (s *SmartTemplateDyncParam) SetCustFlag(v string) *SmartTemplateDyncParam {
	s.CustFlag = &v
	return s
}

func (s *SmartTemplateDyncParam) SetDyncParams(v string) *SmartTemplateDyncParam {
	s.DyncParams = &v
	return s
}

// 普短模板创建响应体
type ShortMsgTempCreateData struct {
	// 普短模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s ShortMsgTempCreateData) String() string {
	return tea.Prettify(s)
}

func (s ShortMsgTempCreateData) GoString() string {
	return s.String()
}

func (s *ShortMsgTempCreateData) SetTemplateId(v string) *ShortMsgTempCreateData {
	s.TemplateId = &v
	return s
}

type QueryShorturlParseabilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 卡片模板id
	SmartTemplateId *string `json:"smart_template_id,omitempty" xml:"smart_template_id,omitempty" require:"true"`
	// 待查询手机号列表
	Mobiles []*ParseQueryParam `json:"mobiles,omitempty" xml:"mobiles,omitempty" require:"true" type:"Repeated"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryShorturlParseabilityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryShorturlParseabilityRequest) GoString() string {
	return s.String()
}

func (s *QueryShorturlParseabilityRequest) SetAuthToken(v string) *QueryShorturlParseabilityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryShorturlParseabilityRequest) SetProductInstanceId(v string) *QueryShorturlParseabilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryShorturlParseabilityRequest) SetSmartTemplateId(v string) *QueryShorturlParseabilityRequest {
	s.SmartTemplateId = &v
	return s
}

func (s *QueryShorturlParseabilityRequest) SetMobiles(v []*ParseQueryParam) *QueryShorturlParseabilityRequest {
	s.Mobiles = v
	return s
}

func (s *QueryShorturlParseabilityRequest) SetTenantId(v string) *QueryShorturlParseabilityRequest {
	s.TenantId = &v
	return s
}

type QueryShorturlParseabilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解析结果列表
	Data []*ParseResultData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryShorturlParseabilityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryShorturlParseabilityResponse) GoString() string {
	return s.String()
}

func (s *QueryShorturlParseabilityResponse) SetReqMsgId(v string) *QueryShorturlParseabilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryShorturlParseabilityResponse) SetResultCode(v string) *QueryShorturlParseabilityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryShorturlParseabilityResponse) SetResultMsg(v string) *QueryShorturlParseabilityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryShorturlParseabilityResponse) SetData(v []*ParseResultData) *QueryShorturlParseabilityResponse {
	s.Data = v
	return s
}

type CreateShorturlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 卡片模板id
	SmartTemplateId *string `json:"smart_template_id,omitempty" xml:"smart_template_id,omitempty" require:"true"`
	// 申请好的签名，最多 10 个签名
	SmsSigns []*string `json:"sms_signs,omitempty" xml:"sms_signs,omitempty" require:"true" type:"Repeated"`
	// 个性化短链建议10次
	ShowTimes *int64 `json:"show_times,omitempty" xml:"show_times,omitempty" require:"true"`
	// BULK 群发
	// PERSONAL个性化
	AimCodeType *string `json:"aim_code_type,omitempty" xml:"aim_code_type,omitempty" require:"true"`
	// 个性化短链：时间最小 1天，最大 7 天，不填则默认 7 天；
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty" require:"true"`
	// 短链所属生成批次，最长 50 位。
	// 也是请求唯一id，每次请求不能重复，重复将返回该批次id上一次请求结果
	CustBatchId *string `json:"cust_batch_id,omitempty" xml:"cust_batch_id,omitempty" require:"true"`
	// 接收智能短信测试短信手机号及动态参数对象列表，最大为 100 个
	// 注：oppo 模板一次最多只能申请 10 个（模板审核厂商中包含oppo厂商就视为oppo模板）
	ParamList []*SmartTemplateDyncParam `json:"param_list,omitempty" xml:"param_list,omitempty" require:"true" type:"Repeated"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s CreateShorturlRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateShorturlRequest) GoString() string {
	return s.String()
}

func (s *CreateShorturlRequest) SetAuthToken(v string) *CreateShorturlRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateShorturlRequest) SetProductInstanceId(v string) *CreateShorturlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateShorturlRequest) SetSmartTemplateId(v string) *CreateShorturlRequest {
	s.SmartTemplateId = &v
	return s
}

func (s *CreateShorturlRequest) SetSmsSigns(v []*string) *CreateShorturlRequest {
	s.SmsSigns = v
	return s
}

func (s *CreateShorturlRequest) SetShowTimes(v int64) *CreateShorturlRequest {
	s.ShowTimes = &v
	return s
}

func (s *CreateShorturlRequest) SetAimCodeType(v string) *CreateShorturlRequest {
	s.AimCodeType = &v
	return s
}

func (s *CreateShorturlRequest) SetExpireTime(v int64) *CreateShorturlRequest {
	s.ExpireTime = &v
	return s
}

func (s *CreateShorturlRequest) SetCustBatchId(v string) *CreateShorturlRequest {
	s.CustBatchId = &v
	return s
}

func (s *CreateShorturlRequest) SetParamList(v []*SmartTemplateDyncParam) *CreateShorturlRequest {
	s.ParamList = v
	return s
}

func (s *CreateShorturlRequest) SetTenantId(v string) *CreateShorturlRequest {
	s.TenantId = &v
	return s
}

type CreateShorturlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 短链创建结果
	Data *ShortUrlCreateResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateShorturlResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateShorturlResponse) GoString() string {
	return s.String()
}

func (s *CreateShorturlResponse) SetReqMsgId(v string) *CreateShorturlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateShorturlResponse) SetResultCode(v string) *CreateShorturlResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateShorturlResponse) SetResultMsg(v string) *CreateShorturlResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateShorturlResponse) SetData(v *ShortUrlCreateResult) *CreateShorturlResponse {
	s.Data = v
	return s
}

type QueryShorturlParseresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 短链批次号
	CustBatchId *string `json:"cust_batch_id,omitempty" xml:"cust_batch_id,omitempty" require:"true"`
	// 短链地址
	AimUrl *string `json:"aim_url,omitempty" xml:"aim_url,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryShorturlParseresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryShorturlParseresultRequest) GoString() string {
	return s.String()
}

func (s *QueryShorturlParseresultRequest) SetAuthToken(v string) *QueryShorturlParseresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryShorturlParseresultRequest) SetProductInstanceId(v string) *QueryShorturlParseresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryShorturlParseresultRequest) SetCustBatchId(v string) *QueryShorturlParseresultRequest {
	s.CustBatchId = &v
	return s
}

func (s *QueryShorturlParseresultRequest) SetAimUrl(v string) *QueryShorturlParseresultRequest {
	s.AimUrl = &v
	return s
}

func (s *QueryShorturlParseresultRequest) SetTenantId(v string) *QueryShorturlParseresultRequest {
	s.TenantId = &v
	return s
}

func (s *QueryShorturlParseresultRequest) SetExtInfo(v string) *QueryShorturlParseresultRequest {
	s.ExtInfo = &v
	return s
}

type QueryShorturlParseresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 短链解析记录
	Data []*ShortUrlParseResult `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryShorturlParseresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryShorturlParseresultResponse) GoString() string {
	return s.String()
}

func (s *QueryShorturlParseresultResponse) SetReqMsgId(v string) *QueryShorturlParseresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryShorturlParseresultResponse) SetResultCode(v string) *QueryShorturlParseresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryShorturlParseresultResponse) SetResultMsg(v string) *QueryShorturlParseresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryShorturlParseresultResponse) SetData(v []*ShortUrlParseResult) *QueryShorturlParseresultResponse {
	s.Data = v
	return s
}

type CreateShortmsgTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 唯一请求id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
	// 短信签名名称，不需要带着【】
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 短信内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 校验传入的参数是否有变量
	VariableTemplate *bool `json:"variable_template,omitempty" xml:"variable_template,omitempty" require:"true"`
}

func (s CreateShortmsgTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateShortmsgTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateShortmsgTemplateRequest) SetAuthToken(v string) *CreateShortmsgTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetProductInstanceId(v string) *CreateShortmsgTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetTenantId(v string) *CreateShortmsgTemplateRequest {
	s.TenantId = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetRequestUniqueId(v string) *CreateShortmsgTemplateRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetSignName(v string) *CreateShortmsgTemplateRequest {
	s.SignName = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetContent(v string) *CreateShortmsgTemplateRequest {
	s.Content = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetExtInfo(v string) *CreateShortmsgTemplateRequest {
	s.ExtInfo = &v
	return s
}

func (s *CreateShortmsgTemplateRequest) SetVariableTemplate(v bool) *CreateShortmsgTemplateRequest {
	s.VariableTemplate = &v
	return s
}

type CreateShortmsgTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 普短模板创建响应体
	Data *ShortMsgTempCreateData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateShortmsgTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateShortmsgTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateShortmsgTemplateResponse) SetReqMsgId(v string) *CreateShortmsgTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateShortmsgTemplateResponse) SetResultCode(v string) *CreateShortmsgTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateShortmsgTemplateResponse) SetResultMsg(v string) *CreateShortmsgTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateShortmsgTemplateResponse) SetData(v *ShortMsgTempCreateData) *CreateShortmsgTemplateResponse {
	s.Data = v
	return s
}

type QueryAccountShorturlparseresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryAccountShorturlparseresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAccountShorturlparseresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAccountShorturlparseresultRequest) SetAuthToken(v string) *QueryAccountShorturlparseresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAccountShorturlparseresultRequest) SetProductInstanceId(v string) *QueryAccountShorturlparseresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAccountShorturlparseresultRequest) SetTenantId(v string) *QueryAccountShorturlparseresultRequest {
	s.TenantId = &v
	return s
}

func (s *QueryAccountShorturlparseresultRequest) SetExtInfo(v string) *QueryAccountShorturlparseresultRequest {
	s.ExtInfo = &v
	return s
}

type QueryAccountShorturlparseresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解析记录列表
	Data []*ShortUrlParseResult `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAccountShorturlparseresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAccountShorturlparseresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAccountShorturlparseresultResponse) SetReqMsgId(v string) *QueryAccountShorturlparseresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAccountShorturlparseresultResponse) SetResultCode(v string) *QueryAccountShorturlparseresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAccountShorturlparseresultResponse) SetResultMsg(v string) *QueryAccountShorturlparseresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAccountShorturlparseresultResponse) SetData(v []*ShortUrlParseResult) *QueryAccountShorturlparseresultResponse {
	s.Data = v
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

type QueryAccountMsgstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryAccountMsgstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAccountMsgstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryAccountMsgstatusRequest) SetAuthToken(v string) *QueryAccountMsgstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAccountMsgstatusRequest) SetProductInstanceId(v string) *QueryAccountMsgstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAccountMsgstatusRequest) SetTenantId(v string) *QueryAccountMsgstatusRequest {
	s.TenantId = &v
	return s
}

func (s *QueryAccountMsgstatusRequest) SetExtInfo(v string) *QueryAccountMsgstatusRequest {
	s.ExtInfo = &v
	return s
}

type QueryAccountMsgstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信息发送状态
	Data []*AccountSmsSendStatus `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAccountMsgstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAccountMsgstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryAccountMsgstatusResponse) SetReqMsgId(v string) *QueryAccountMsgstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAccountMsgstatusResponse) SetResultCode(v string) *QueryAccountMsgstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAccountMsgstatusResponse) SetResultMsg(v string) *QueryAccountMsgstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAccountMsgstatusResponse) SetData(v []*AccountSmsSendStatus) *QueryAccountMsgstatusResponse {
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
				"sdk_version":      tea.String("1.1.1"),
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
 * Description: 查询手机号所在设备当前解析短链的能力
 * Summary: 短链解析能力查询
 */
func (client *Client) QueryShorturlParseability(request *QueryShorturlParseabilityRequest) (_result *QueryShorturlParseabilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryShorturlParseabilityResponse{}
	_body, _err := client.QueryShorturlParseabilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询手机号所在设备当前解析短链的能力
 * Summary: 短链解析能力查询
 */
func (client *Client) QueryShorturlParseabilityEx(request *QueryShorturlParseabilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryShorturlParseabilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryShorturlParseabilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.shorturl.parseability.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短链生成
 * Summary: 短链生成
 */
func (client *Client) CreateShorturl(request *CreateShorturlRequest) (_result *CreateShorturlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateShorturlResponse{}
	_body, _err := client.CreateShorturlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短链生成
 * Summary: 短链生成
 */
func (client *Client) CreateShorturlEx(request *CreateShorturlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateShorturlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateShorturlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.shorturl.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 短链解析结果查询
 * Summary: 短链解析结果查询
 */
func (client *Client) QueryShorturlParseresult(request *QueryShorturlParseresultRequest) (_result *QueryShorturlParseresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryShorturlParseresultResponse{}
	_body, _err := client.QueryShorturlParseresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短链解析结果查询
 * Summary: 短链解析结果查询
 */
func (client *Client) QueryShorturlParseresultEx(request *QueryShorturlParseresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryShorturlParseresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryShorturlParseresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.shorturl.parseresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 普短模板创建
 * Summary: 普短模板创建
 */
func (client *Client) CreateShortmsgTemplate(request *CreateShortmsgTemplateRequest) (_result *CreateShortmsgTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateShortmsgTemplateResponse{}
	_body, _err := client.CreateShortmsgTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 普短模板创建
 * Summary: 普短模板创建
 */
func (client *Client) CreateShortmsgTemplateEx(request *CreateShortmsgTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateShortmsgTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateShortmsgTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.shortmsg.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按帐号查询短链解析情况
 * Summary: 按帐号查询短链解析情况
 */
func (client *Client) QueryAccountShorturlparseresult(request *QueryAccountShorturlparseresultRequest) (_result *QueryAccountShorturlparseresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAccountShorturlparseresultResponse{}
	_body, _err := client.QueryAccountShorturlparseresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按帐号查询短链解析情况
 * Summary: 按帐号查询短链解析情况
 */
func (client *Client) QueryAccountShorturlparseresultEx(request *QueryAccountShorturlparseresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAccountShorturlparseresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAccountShorturlparseresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.account.shorturlparseresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
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

/**
 * Description: 根据账户id查询短信结果
 * Summary: 根据账户id查询短信结果
 */
func (client *Client) QueryAccountMsgstatus(request *QueryAccountMsgstatusRequest) (_result *QueryAccountMsgstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAccountMsgstatusResponse{}
	_body, _err := client.QueryAccountMsgstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据账户id查询短信结果
 * Summary: 根据账户id查询短信结果
 */
func (client *Client) QueryAccountMsgstatusEx(request *QueryAccountMsgstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAccountMsgstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAccountMsgstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mediasms.account.msgstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
