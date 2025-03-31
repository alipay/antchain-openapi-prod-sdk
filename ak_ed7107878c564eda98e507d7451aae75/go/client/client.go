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

// 数字人平台--角色信息
type AvatarHumanInfo struct {
	// 数字人角色id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 数字人角色名
	HumanName *string `json:"human_name,omitempty" xml:"human_name,omitempty" require:"true"`
	// 数字人形象id
	ModelId *int64 `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 数字人音色编码
	VoiceCode *string `json:"voice_code,omitempty" xml:"voice_code,omitempty" require:"true"`
	// 数字人音色名
	VoiceName *string `json:"voice_name,omitempty" xml:"voice_name,omitempty"`
	// 数字人音色预览图
	VoiceImage *string `json:"voice_image,omitempty" xml:"voice_image,omitempty"`
	// 语速
	SpeechRate *int64 `json:"speech_rate,omitempty" xml:"speech_rate,omitempty"`
	// 音调
	PitchRate *string `json:"pitch_rate,omitempty" xml:"pitch_rate,omitempty"`
	// 音量
	Volume *string `json:"volume,omitempty" xml:"volume,omitempty"`
}

func (s AvatarHumanInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarHumanInfo) GoString() string {
	return s.String()
}

func (s *AvatarHumanInfo) SetId(v int64) *AvatarHumanInfo {
	s.Id = &v
	return s
}

func (s *AvatarHumanInfo) SetHumanName(v string) *AvatarHumanInfo {
	s.HumanName = &v
	return s
}

func (s *AvatarHumanInfo) SetModelId(v int64) *AvatarHumanInfo {
	s.ModelId = &v
	return s
}

func (s *AvatarHumanInfo) SetVoiceCode(v string) *AvatarHumanInfo {
	s.VoiceCode = &v
	return s
}

func (s *AvatarHumanInfo) SetVoiceName(v string) *AvatarHumanInfo {
	s.VoiceName = &v
	return s
}

func (s *AvatarHumanInfo) SetVoiceImage(v string) *AvatarHumanInfo {
	s.VoiceImage = &v
	return s
}

func (s *AvatarHumanInfo) SetSpeechRate(v int64) *AvatarHumanInfo {
	s.SpeechRate = &v
	return s
}

func (s *AvatarHumanInfo) SetPitchRate(v string) *AvatarHumanInfo {
	s.PitchRate = &v
	return s
}

func (s *AvatarHumanInfo) SetVolume(v string) *AvatarHumanInfo {
	s.Volume = &v
	return s
}

// 数字人平台--知识库信息
type AvatarLibraryInfo struct {
	// 知识点数量
	QuestionCount *int64 `json:"question_count,omitempty" xml:"question_count,omitempty" require:"true"`
	// 知识库id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 知识库名称
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 数字人角色信息
	HumanInfo *AvatarHumanInfo `json:"human_info,omitempty" xml:"human_info,omitempty" require:"true"`
}

func (s AvatarLibraryInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarLibraryInfo) GoString() string {
	return s.String()
}

func (s *AvatarLibraryInfo) SetQuestionCount(v int64) *AvatarLibraryInfo {
	s.QuestionCount = &v
	return s
}

func (s *AvatarLibraryInfo) SetId(v int64) *AvatarLibraryInfo {
	s.Id = &v
	return s
}

func (s *AvatarLibraryInfo) SetTitle(v string) *AvatarLibraryInfo {
	s.Title = &v
	return s
}

func (s *AvatarLibraryInfo) SetHumanInfo(v *AvatarHumanInfo) *AvatarLibraryInfo {
	s.HumanInfo = v
	return s
}

// 数字人平台--大模型对话配置信息
type AvatarLlmChatInfo struct {
	// 大模型对话配置编码
	LlmChatCode *string `json:"llm_chat_code,omitempty" xml:"llm_chat_code,omitempty" require:"true"`
	// 大模型对话配置名
	LlmChatName *string `json:"llm_chat_name,omitempty" xml:"llm_chat_name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 模型配置名
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 模型配置编码
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 模型配置id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 大模型对话自定义配置信息
	Config *string `json:"config,omitempty" xml:"config,omitempty"`
}

func (s AvatarLlmChatInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarLlmChatInfo) GoString() string {
	return s.String()
}

func (s *AvatarLlmChatInfo) SetLlmChatCode(v string) *AvatarLlmChatInfo {
	s.LlmChatCode = &v
	return s
}

func (s *AvatarLlmChatInfo) SetLlmChatName(v string) *AvatarLlmChatInfo {
	s.LlmChatName = &v
	return s
}

func (s *AvatarLlmChatInfo) SetDescription(v string) *AvatarLlmChatInfo {
	s.Description = &v
	return s
}

func (s *AvatarLlmChatInfo) SetModelName(v string) *AvatarLlmChatInfo {
	s.ModelName = &v
	return s
}

func (s *AvatarLlmChatInfo) SetModelCode(v string) *AvatarLlmChatInfo {
	s.ModelCode = &v
	return s
}

func (s *AvatarLlmChatInfo) SetModelId(v string) *AvatarLlmChatInfo {
	s.ModelId = &v
	return s
}

func (s *AvatarLlmChatInfo) SetConfig(v string) *AvatarLlmChatInfo {
	s.Config = &v
	return s
}

// 数字人平台--自定义组件信息
type AvatarComponentInfo struct {
	// 组件标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 组件编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 组件值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s AvatarComponentInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarComponentInfo) GoString() string {
	return s.String()
}

func (s *AvatarComponentInfo) SetTitle(v string) *AvatarComponentInfo {
	s.Title = &v
	return s
}

func (s *AvatarComponentInfo) SetCode(v string) *AvatarComponentInfo {
	s.Code = &v
	return s
}

func (s *AvatarComponentInfo) SetValue(v string) *AvatarComponentInfo {
	s.Value = &v
	return s
}

// 数字人平台--气泡按钮信息
type AvatarBubbleInfo struct {
	// 气泡标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 气泡类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 知识点id
	KnowId *string `json:"know_id,omitempty" xml:"know_id,omitempty"`
	// 电话号码
	Tel *string `json:"tel,omitempty" xml:"tel,omitempty"`
	// 外部链接
	Link *string `json:"link,omitempty" xml:"link,omitempty"`
}

func (s AvatarBubbleInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarBubbleInfo) GoString() string {
	return s.String()
}

func (s *AvatarBubbleInfo) SetTitle(v string) *AvatarBubbleInfo {
	s.Title = &v
	return s
}

func (s *AvatarBubbleInfo) SetType(v string) *AvatarBubbleInfo {
	s.Type = &v
	return s
}

func (s *AvatarBubbleInfo) SetKnowId(v string) *AvatarBubbleInfo {
	s.KnowId = &v
	return s
}

func (s *AvatarBubbleInfo) SetTel(v string) *AvatarBubbleInfo {
	s.Tel = &v
	return s
}

func (s *AvatarBubbleInfo) SetLink(v string) *AvatarBubbleInfo {
	s.Link = &v
	return s
}

// 知识点批量导入任务结果
type ImportTaskResult struct {
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 进度值
	Progress *int64 `json:"progress,omitempty" xml:"progress,omitempty"`
	// 错误日志
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s ImportTaskResult) String() string {
	return tea.Prettify(s)
}

func (s ImportTaskResult) GoString() string {
	return s.String()
}

func (s *ImportTaskResult) SetStatus(v string) *ImportTaskResult {
	s.Status = &v
	return s
}

func (s *ImportTaskResult) SetProgress(v int64) *ImportTaskResult {
	s.Progress = &v
	return s
}

func (s *ImportTaskResult) SetErrorMessage(v string) *ImportTaskResult {
	s.ErrorMessage = &v
	return s
}

// 数字人平台--交互配置信息
type AvatarConfigInfo struct {
	// 交互配置id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 交互配置名
	ConfigName *string `json:"config_name,omitempty" xml:"config_name,omitempty" require:"true"`
	// 交互配置编码
	VirtualCode *string `json:"virtual_code,omitempty" xml:"virtual_code,omitempty" require:"true"`
	// 数字人角色id
	HumanId *int64 `json:"human_id,omitempty" xml:"human_id,omitempty" require:"true"`
}

func (s AvatarConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarConfigInfo) GoString() string {
	return s.String()
}

func (s *AvatarConfigInfo) SetId(v int64) *AvatarConfigInfo {
	s.Id = &v
	return s
}

func (s *AvatarConfigInfo) SetConfigName(v string) *AvatarConfigInfo {
	s.ConfigName = &v
	return s
}

func (s *AvatarConfigInfo) SetVirtualCode(v string) *AvatarConfigInfo {
	s.VirtualCode = &v
	return s
}

func (s *AvatarConfigInfo) SetHumanId(v int64) *AvatarConfigInfo {
	s.HumanId = &v
	return s
}

// 数字人平台--话术配置信息
type AvatarScriptConfigInfo struct {
	// 唤醒词列表
	WakeWords []*string `json:"wake_words,omitempty" xml:"wake_words,omitempty" type:"Repeated"`
	// 欢迎语列表
	WelcomePhrases []*string `json:"welcome_phrases,omitempty" xml:"welcome_phrases,omitempty" type:"Repeated"`
	// 兜底语列表
	FallbackPhrases []*string `json:"fallback_phrases,omitempty" xml:"fallback_phrases,omitempty" type:"Repeated"`
}

func (s AvatarScriptConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s AvatarScriptConfigInfo) GoString() string {
	return s.String()
}

func (s *AvatarScriptConfigInfo) SetWakeWords(v []*string) *AvatarScriptConfigInfo {
	s.WakeWords = v
	return s
}

func (s *AvatarScriptConfigInfo) SetWelcomePhrases(v []*string) *AvatarScriptConfigInfo {
	s.WelcomePhrases = v
	return s
}

func (s *AvatarScriptConfigInfo) SetFallbackPhrases(v []*string) *AvatarScriptConfigInfo {
	s.FallbackPhrases = v
	return s
}

type ListUniversalsaasDigitalhumanHumanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 获取数字人角色的类型
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty" require:"true"`
}

func (s ListUniversalsaasDigitalhumanHumanRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanHumanRequest) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanHumanRequest) SetAuthToken(v string) *ListUniversalsaasDigitalhumanHumanRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanRequest) SetProductInstanceId(v string) *ListUniversalsaasDigitalhumanHumanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanRequest) SetTenantCode(v string) *ListUniversalsaasDigitalhumanHumanRequest {
	s.TenantCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanRequest) SetClassification(v string) *ListUniversalsaasDigitalhumanHumanRequest {
	s.Classification = &v
	return s
}

type ListUniversalsaasDigitalhumanHumanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数字人角色列表
	ItemList []*AvatarHumanInfo `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s ListUniversalsaasDigitalhumanHumanResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanHumanResponse) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanHumanResponse) SetReqMsgId(v string) *ListUniversalsaasDigitalhumanHumanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanResponse) SetResultCode(v string) *ListUniversalsaasDigitalhumanHumanResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanResponse) SetResultMsg(v string) *ListUniversalsaasDigitalhumanHumanResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanHumanResponse) SetItemList(v []*AvatarHumanInfo) *ListUniversalsaasDigitalhumanHumanResponse {
	s.ItemList = v
	return s
}

type ListUniversalsaasDigitalhumanLibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库类型
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty" require:"true"`
}

func (s ListUniversalsaasDigitalhumanLibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanLibraryRequest) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanLibraryRequest) SetAuthToken(v string) *ListUniversalsaasDigitalhumanLibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryRequest) SetProductInstanceId(v string) *ListUniversalsaasDigitalhumanLibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryRequest) SetTenantCode(v string) *ListUniversalsaasDigitalhumanLibraryRequest {
	s.TenantCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryRequest) SetClassification(v string) *ListUniversalsaasDigitalhumanLibraryRequest {
	s.Classification = &v
	return s
}

type ListUniversalsaasDigitalhumanLibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库列表
	ItemList []*AvatarLibraryInfo `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s ListUniversalsaasDigitalhumanLibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanLibraryResponse) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanLibraryResponse) SetReqMsgId(v string) *ListUniversalsaasDigitalhumanLibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryResponse) SetResultCode(v string) *ListUniversalsaasDigitalhumanLibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryResponse) SetResultMsg(v string) *ListUniversalsaasDigitalhumanLibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLibraryResponse) SetItemList(v []*AvatarLibraryInfo) *ListUniversalsaasDigitalhumanLibraryResponse {
	s.ItemList = v
	return s
}

type AddUniversalsaasDigitalhumanLibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库类型
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty" require:"true"`
	// 角色id
	HumanId *int64 `json:"human_id,omitempty" xml:"human_id,omitempty" require:"true"`
	// 知识库名称
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s AddUniversalsaasDigitalhumanLibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanLibraryRequest) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetAuthToken(v string) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetProductInstanceId(v string) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetTenantCode(v string) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.TenantCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetClassification(v string) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.Classification = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetHumanId(v int64) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.HumanId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryRequest) SetTitle(v string) *AddUniversalsaasDigitalhumanLibraryRequest {
	s.Title = &v
	return s
}

type AddUniversalsaasDigitalhumanLibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识库id
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AddUniversalsaasDigitalhumanLibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanLibraryResponse) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanLibraryResponse) SetReqMsgId(v string) *AddUniversalsaasDigitalhumanLibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryResponse) SetResultCode(v string) *AddUniversalsaasDigitalhumanLibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryResponse) SetResultMsg(v string) *AddUniversalsaasDigitalhumanLibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanLibraryResponse) SetData(v int64) *AddUniversalsaasDigitalhumanLibraryResponse {
	s.Data = &v
	return s
}

type UpdateUniversalsaasDigitalhumanLibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 知识库名称
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s UpdateUniversalsaasDigitalhumanLibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUniversalsaasDigitalhumanLibraryRequest) GoString() string {
	return s.String()
}

func (s *UpdateUniversalsaasDigitalhumanLibraryRequest) SetAuthToken(v string) *UpdateUniversalsaasDigitalhumanLibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryRequest) SetProductInstanceId(v string) *UpdateUniversalsaasDigitalhumanLibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryRequest) SetTenantCode(v string) *UpdateUniversalsaasDigitalhumanLibraryRequest {
	s.TenantCode = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryRequest) SetId(v int64) *UpdateUniversalsaasDigitalhumanLibraryRequest {
	s.Id = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryRequest) SetTitle(v string) *UpdateUniversalsaasDigitalhumanLibraryRequest {
	s.Title = &v
	return s
}

type UpdateUniversalsaasDigitalhumanLibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateUniversalsaasDigitalhumanLibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUniversalsaasDigitalhumanLibraryResponse) GoString() string {
	return s.String()
}

func (s *UpdateUniversalsaasDigitalhumanLibraryResponse) SetReqMsgId(v string) *UpdateUniversalsaasDigitalhumanLibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryResponse) SetResultCode(v string) *UpdateUniversalsaasDigitalhumanLibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanLibraryResponse) SetResultMsg(v string) *UpdateUniversalsaasDigitalhumanLibraryResponse {
	s.ResultMsg = &v
	return s
}

type DeleteUniversalsaasDigitalhumanLibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteUniversalsaasDigitalhumanLibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteUniversalsaasDigitalhumanLibraryRequest) GoString() string {
	return s.String()
}

func (s *DeleteUniversalsaasDigitalhumanLibraryRequest) SetAuthToken(v string) *DeleteUniversalsaasDigitalhumanLibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanLibraryRequest) SetProductInstanceId(v string) *DeleteUniversalsaasDigitalhumanLibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanLibraryRequest) SetTenantCode(v string) *DeleteUniversalsaasDigitalhumanLibraryRequest {
	s.TenantCode = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanLibraryRequest) SetId(v int64) *DeleteUniversalsaasDigitalhumanLibraryRequest {
	s.Id = &v
	return s
}

type DeleteUniversalsaasDigitalhumanLibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteUniversalsaasDigitalhumanLibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteUniversalsaasDigitalhumanLibraryResponse) GoString() string {
	return s.String()
}

func (s *DeleteUniversalsaasDigitalhumanLibraryResponse) SetReqMsgId(v string) *DeleteUniversalsaasDigitalhumanLibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanLibraryResponse) SetResultCode(v string) *DeleteUniversalsaasDigitalhumanLibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanLibraryResponse) SetResultMsg(v string) *DeleteUniversalsaasDigitalhumanLibraryResponse {
	s.ResultMsg = &v
	return s
}

type AddUniversalsaasDigitalhumanKnowledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库id
	LibraryId *int64 `json:"library_id,omitempty" xml:"library_id,omitempty" require:"true"`
	// 标问标题
	QuestionTitle *string `json:"question_title,omitempty" xml:"question_title,omitempty" require:"true"`
	// 问法列表
	SentenceList []*string `json:"sentence_list,omitempty" xml:"sentence_list,omitempty" require:"true" type:"Repeated"`
	// 答案文案
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s AddUniversalsaasDigitalhumanKnowledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanKnowledgeRequest) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetAuthToken(v string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetProductInstanceId(v string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetTenantCode(v string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.TenantCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetLibraryId(v int64) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.LibraryId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetQuestionTitle(v string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.QuestionTitle = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetSentenceList(v []*string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.SentenceList = v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeRequest) SetContent(v string) *AddUniversalsaasDigitalhumanKnowledgeRequest {
	s.Content = &v
	return s
}

type AddUniversalsaasDigitalhumanKnowledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 知识点id
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AddUniversalsaasDigitalhumanKnowledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanKnowledgeResponse) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanKnowledgeResponse) SetReqMsgId(v string) *AddUniversalsaasDigitalhumanKnowledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeResponse) SetResultCode(v string) *AddUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeResponse) SetResultMsg(v string) *AddUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanKnowledgeResponse) SetData(v int64) *AddUniversalsaasDigitalhumanKnowledgeResponse {
	s.Data = &v
	return s
}

type UpdateUniversalsaasDigitalhumanKnowledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库ID
	LibraryId *int64 `json:"library_id,omitempty" xml:"library_id,omitempty" require:"true"`
	// 知识点id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 标问标题
	QuestionTitle *string `json:"question_title,omitempty" xml:"question_title,omitempty" require:"true"`
	// 问法列表
	SentenceList []*string `json:"sentence_list,omitempty" xml:"sentence_list,omitempty" require:"true" type:"Repeated"`
	// 答案文案
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s UpdateUniversalsaasDigitalhumanKnowledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUniversalsaasDigitalhumanKnowledgeRequest) GoString() string {
	return s.String()
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetAuthToken(v string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetProductInstanceId(v string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetTenantCode(v string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.TenantCode = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetLibraryId(v int64) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.LibraryId = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetId(v int64) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.Id = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetQuestionTitle(v string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.QuestionTitle = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetSentenceList(v []*string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.SentenceList = v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeRequest) SetContent(v string) *UpdateUniversalsaasDigitalhumanKnowledgeRequest {
	s.Content = &v
	return s
}

type UpdateUniversalsaasDigitalhumanKnowledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateUniversalsaasDigitalhumanKnowledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUniversalsaasDigitalhumanKnowledgeResponse) GoString() string {
	return s.String()
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeResponse) SetReqMsgId(v string) *UpdateUniversalsaasDigitalhumanKnowledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeResponse) SetResultCode(v string) *UpdateUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUniversalsaasDigitalhumanKnowledgeResponse) SetResultMsg(v string) *UpdateUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultMsg = &v
	return s
}

type OnlineUniversalsaasDigitalhumanKnowledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库id
	LibraryId *int64 `json:"library_id,omitempty" xml:"library_id,omitempty" require:"true"`
	// 知识点id列表
	Ids []*int64 `json:"ids,omitempty" xml:"ids,omitempty" require:"true" type:"Repeated"`
}

func (s OnlineUniversalsaasDigitalhumanKnowledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineUniversalsaasDigitalhumanKnowledgeRequest) GoString() string {
	return s.String()
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeRequest) SetAuthToken(v string) *OnlineUniversalsaasDigitalhumanKnowledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeRequest) SetProductInstanceId(v string) *OnlineUniversalsaasDigitalhumanKnowledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeRequest) SetTenantCode(v string) *OnlineUniversalsaasDigitalhumanKnowledgeRequest {
	s.TenantCode = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeRequest) SetLibraryId(v int64) *OnlineUniversalsaasDigitalhumanKnowledgeRequest {
	s.LibraryId = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeRequest) SetIds(v []*int64) *OnlineUniversalsaasDigitalhumanKnowledgeRequest {
	s.Ids = v
	return s
}

type OnlineUniversalsaasDigitalhumanKnowledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OnlineUniversalsaasDigitalhumanKnowledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineUniversalsaasDigitalhumanKnowledgeResponse) GoString() string {
	return s.String()
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeResponse) SetReqMsgId(v string) *OnlineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeResponse) SetResultCode(v string) *OnlineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanKnowledgeResponse) SetResultMsg(v string) *OnlineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultMsg = &v
	return s
}

type OfflineUniversalsaasDigitalhumanKnowledgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 知识库ID
	LibraryId *int64 `json:"library_id,omitempty" xml:"library_id,omitempty" require:"true"`
	// 知识点id列表
	Ids []*int64 `json:"ids,omitempty" xml:"ids,omitempty" require:"true" type:"Repeated"`
}

func (s OfflineUniversalsaasDigitalhumanKnowledgeRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineUniversalsaasDigitalhumanKnowledgeRequest) GoString() string {
	return s.String()
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeRequest) SetAuthToken(v string) *OfflineUniversalsaasDigitalhumanKnowledgeRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeRequest) SetProductInstanceId(v string) *OfflineUniversalsaasDigitalhumanKnowledgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeRequest) SetTenantCode(v string) *OfflineUniversalsaasDigitalhumanKnowledgeRequest {
	s.TenantCode = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeRequest) SetLibraryId(v int64) *OfflineUniversalsaasDigitalhumanKnowledgeRequest {
	s.LibraryId = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeRequest) SetIds(v []*int64) *OfflineUniversalsaasDigitalhumanKnowledgeRequest {
	s.Ids = v
	return s
}

type OfflineUniversalsaasDigitalhumanKnowledgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OfflineUniversalsaasDigitalhumanKnowledgeResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineUniversalsaasDigitalhumanKnowledgeResponse) GoString() string {
	return s.String()
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeResponse) SetReqMsgId(v string) *OfflineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeResponse) SetResultCode(v string) *OfflineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanKnowledgeResponse) SetResultMsg(v string) *OfflineUniversalsaasDigitalhumanKnowledgeResponse {
	s.ResultMsg = &v
	return s
}

type ListUniversalsaasDigitalhumanLlmChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListUniversalsaasDigitalhumanLlmChatRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanLlmChatRequest) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanLlmChatRequest) SetAuthToken(v string) *ListUniversalsaasDigitalhumanLlmChatRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatRequest) SetProductInstanceId(v string) *ListUniversalsaasDigitalhumanLlmChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatRequest) SetTenantCode(v string) *ListUniversalsaasDigitalhumanLlmChatRequest {
	s.TenantCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatRequest) SetPageNum(v int64) *ListUniversalsaasDigitalhumanLlmChatRequest {
	s.PageNum = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatRequest) SetPageSize(v int64) *ListUniversalsaasDigitalhumanLlmChatRequest {
	s.PageSize = &v
	return s
}

type ListUniversalsaasDigitalhumanLlmChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 大模型对话列表
	ItemList []*AvatarLlmChatInfo `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s ListUniversalsaasDigitalhumanLlmChatResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUniversalsaasDigitalhumanLlmChatResponse) GoString() string {
	return s.String()
}

func (s *ListUniversalsaasDigitalhumanLlmChatResponse) SetReqMsgId(v string) *ListUniversalsaasDigitalhumanLlmChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatResponse) SetResultCode(v string) *ListUniversalsaasDigitalhumanLlmChatResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatResponse) SetResultMsg(v string) *ListUniversalsaasDigitalhumanLlmChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUniversalsaasDigitalhumanLlmChatResponse) SetItemList(v []*AvatarLlmChatInfo) *ListUniversalsaasDigitalhumanLlmChatResponse {
	s.ItemList = v
	return s
}

type AddUniversalsaasDigitalhumanChatSettingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 交互配置名称
	ConfigName *string `json:"config_name,omitempty" xml:"config_name,omitempty" require:"true"`
	// 角色id
	HumanId *int64 `json:"human_id,omitempty" xml:"human_id,omitempty" require:"true"`
}

func (s AddUniversalsaasDigitalhumanChatSettingRequest) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanChatSettingRequest) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanChatSettingRequest) SetAuthToken(v string) *AddUniversalsaasDigitalhumanChatSettingRequest {
	s.AuthToken = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingRequest) SetProductInstanceId(v string) *AddUniversalsaasDigitalhumanChatSettingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingRequest) SetTenantCode(v string) *AddUniversalsaasDigitalhumanChatSettingRequest {
	s.TenantCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingRequest) SetConfigName(v string) *AddUniversalsaasDigitalhumanChatSettingRequest {
	s.ConfigName = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingRequest) SetHumanId(v int64) *AddUniversalsaasDigitalhumanChatSettingRequest {
	s.HumanId = &v
	return s
}

type AddUniversalsaasDigitalhumanChatSettingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交互配置信息
	Data *AvatarConfigInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AddUniversalsaasDigitalhumanChatSettingResponse) String() string {
	return tea.Prettify(s)
}

func (s AddUniversalsaasDigitalhumanChatSettingResponse) GoString() string {
	return s.String()
}

func (s *AddUniversalsaasDigitalhumanChatSettingResponse) SetReqMsgId(v string) *AddUniversalsaasDigitalhumanChatSettingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingResponse) SetResultCode(v string) *AddUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultCode = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingResponse) SetResultMsg(v string) *AddUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddUniversalsaasDigitalhumanChatSettingResponse) SetData(v *AvatarConfigInfo) *AddUniversalsaasDigitalhumanChatSettingResponse {
	s.Data = v
	return s
}

type SetUniversalsaasDigitalhumanChatSettingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 交互配置ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 交互配置名
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 背景图片url
	BgImg *string `json:"bg_img,omitempty" xml:"bg_img,omitempty"`
	// logo图片url
	LogoImg *string `json:"logo_img,omitempty" xml:"logo_img,omitempty"`
	// 气泡配置
	BubbleConfig []*AvatarBubbleInfo `json:"bubble_config,omitempty" xml:"bubble_config,omitempty" type:"Repeated"`
	// 自定义组件配置
	ComponentConfig []*AvatarComponentInfo `json:"component_config,omitempty" xml:"component_config,omitempty" type:"Repeated"`
	// 关联大模型对话配置编码
	LlmCode *string `json:"llm_code,omitempty" xml:"llm_code,omitempty"`
	// 关联知识库列表
	LibraryIds []*int64 `json:"library_ids,omitempty" xml:"library_ids,omitempty" type:"Repeated"`
	// 话术配置
	ScriptConfig *AvatarScriptConfigInfo `json:"script_config,omitempty" xml:"script_config,omitempty"`
}

func (s SetUniversalsaasDigitalhumanChatSettingRequest) String() string {
	return tea.Prettify(s)
}

func (s SetUniversalsaasDigitalhumanChatSettingRequest) GoString() string {
	return s.String()
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetAuthToken(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.AuthToken = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetProductInstanceId(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetTenantCode(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.TenantCode = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetId(v int64) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.Id = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetTitle(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.Title = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetBgImg(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.BgImg = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetLogoImg(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.LogoImg = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetBubbleConfig(v []*AvatarBubbleInfo) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.BubbleConfig = v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetComponentConfig(v []*AvatarComponentInfo) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.ComponentConfig = v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetLlmCode(v string) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.LlmCode = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetLibraryIds(v []*int64) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.LibraryIds = v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingRequest) SetScriptConfig(v *AvatarScriptConfigInfo) *SetUniversalsaasDigitalhumanChatSettingRequest {
	s.ScriptConfig = v
	return s
}

type SetUniversalsaasDigitalhumanChatSettingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SetUniversalsaasDigitalhumanChatSettingResponse) String() string {
	return tea.Prettify(s)
}

func (s SetUniversalsaasDigitalhumanChatSettingResponse) GoString() string {
	return s.String()
}

func (s *SetUniversalsaasDigitalhumanChatSettingResponse) SetReqMsgId(v string) *SetUniversalsaasDigitalhumanChatSettingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingResponse) SetResultCode(v string) *SetUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultCode = &v
	return s
}

func (s *SetUniversalsaasDigitalhumanChatSettingResponse) SetResultMsg(v string) *SetUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultMsg = &v
	return s
}

type DeleteUniversalsaasDigitalhumanChatSettingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 交互配置id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteUniversalsaasDigitalhumanChatSettingRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteUniversalsaasDigitalhumanChatSettingRequest) GoString() string {
	return s.String()
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingRequest) SetAuthToken(v string) *DeleteUniversalsaasDigitalhumanChatSettingRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingRequest) SetProductInstanceId(v string) *DeleteUniversalsaasDigitalhumanChatSettingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingRequest) SetTenantCode(v string) *DeleteUniversalsaasDigitalhumanChatSettingRequest {
	s.TenantCode = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingRequest) SetId(v int64) *DeleteUniversalsaasDigitalhumanChatSettingRequest {
	s.Id = &v
	return s
}

type DeleteUniversalsaasDigitalhumanChatSettingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteUniversalsaasDigitalhumanChatSettingResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteUniversalsaasDigitalhumanChatSettingResponse) GoString() string {
	return s.String()
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingResponse) SetReqMsgId(v string) *DeleteUniversalsaasDigitalhumanChatSettingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingResponse) SetResultCode(v string) *DeleteUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteUniversalsaasDigitalhumanChatSettingResponse) SetResultMsg(v string) *DeleteUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultMsg = &v
	return s
}

type OnlineUniversalsaasDigitalhumanChatSettingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 交互配置id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s OnlineUniversalsaasDigitalhumanChatSettingRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineUniversalsaasDigitalhumanChatSettingRequest) GoString() string {
	return s.String()
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingRequest) SetAuthToken(v string) *OnlineUniversalsaasDigitalhumanChatSettingRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingRequest) SetProductInstanceId(v string) *OnlineUniversalsaasDigitalhumanChatSettingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingRequest) SetTenantCode(v string) *OnlineUniversalsaasDigitalhumanChatSettingRequest {
	s.TenantCode = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingRequest) SetId(v int64) *OnlineUniversalsaasDigitalhumanChatSettingRequest {
	s.Id = &v
	return s
}

type OnlineUniversalsaasDigitalhumanChatSettingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OnlineUniversalsaasDigitalhumanChatSettingResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineUniversalsaasDigitalhumanChatSettingResponse) GoString() string {
	return s.String()
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingResponse) SetReqMsgId(v string) *OnlineUniversalsaasDigitalhumanChatSettingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingResponse) SetResultCode(v string) *OnlineUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineUniversalsaasDigitalhumanChatSettingResponse) SetResultMsg(v string) *OnlineUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultMsg = &v
	return s
}

type OfflineUniversalsaasDigitalhumanChatSettingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 交互配置id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s OfflineUniversalsaasDigitalhumanChatSettingRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineUniversalsaasDigitalhumanChatSettingRequest) GoString() string {
	return s.String()
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingRequest) SetAuthToken(v string) *OfflineUniversalsaasDigitalhumanChatSettingRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingRequest) SetProductInstanceId(v string) *OfflineUniversalsaasDigitalhumanChatSettingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingRequest) SetTenantCode(v string) *OfflineUniversalsaasDigitalhumanChatSettingRequest {
	s.TenantCode = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingRequest) SetId(v int64) *OfflineUniversalsaasDigitalhumanChatSettingRequest {
	s.Id = &v
	return s
}

type OfflineUniversalsaasDigitalhumanChatSettingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OfflineUniversalsaasDigitalhumanChatSettingResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineUniversalsaasDigitalhumanChatSettingResponse) GoString() string {
	return s.String()
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingResponse) SetReqMsgId(v string) *OfflineUniversalsaasDigitalhumanChatSettingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingResponse) SetResultCode(v string) *OfflineUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineUniversalsaasDigitalhumanChatSettingResponse) SetResultMsg(v string) *OfflineUniversalsaasDigitalhumanChatSettingResponse {
	s.ResultMsg = &v
	return s
}

type QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 导入任务id
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) GoString() string {
	return s.String()
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) SetAuthToken(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) SetProductInstanceId(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) SetTenantCode(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest {
	s.TenantCode = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) SetTaskId(v int64) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest {
	s.TaskId = &v
	return s
}

type QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量导入任务结果
	Data *ImportTaskResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) GoString() string {
	return s.String()
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) SetReqMsgId(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) SetResultCode(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) SetResultMsg(v string) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse) SetData(v *ImportTaskResult) *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse {
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("ak_ed7107878c564eda98e507d7451aae75"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 数字人角色列表查询接口
 * Summary: 数字人角色列表查询接口
 */
func (client *Client) ListUniversalsaasDigitalhumanHuman(request *ListUniversalsaasDigitalhumanHumanRequest) (_result *ListUniversalsaasDigitalhumanHumanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUniversalsaasDigitalhumanHumanResponse{}
	_body, _err := client.ListUniversalsaasDigitalhumanHumanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字人角色列表查询接口
 * Summary: 数字人角色列表查询接口
 */
func (client *Client) ListUniversalsaasDigitalhumanHumanEx(request *ListUniversalsaasDigitalhumanHumanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUniversalsaasDigitalhumanHumanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUniversalsaasDigitalhumanHumanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.human.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 知识库列表查询接口
 * Summary: 知识库列表查询接口
 */
func (client *Client) ListUniversalsaasDigitalhumanLibrary(request *ListUniversalsaasDigitalhumanLibraryRequest) (_result *ListUniversalsaasDigitalhumanLibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.ListUniversalsaasDigitalhumanLibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 知识库列表查询接口
 * Summary: 知识库列表查询接口
 */
func (client *Client) ListUniversalsaasDigitalhumanLibraryEx(request *ListUniversalsaasDigitalhumanLibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUniversalsaasDigitalhumanLibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.library.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建知识库接口
 * Summary: 创建知识库接口
 */
func (client *Client) AddUniversalsaasDigitalhumanLibrary(request *AddUniversalsaasDigitalhumanLibraryRequest) (_result *AddUniversalsaasDigitalhumanLibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.AddUniversalsaasDigitalhumanLibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建知识库接口
 * Summary: 创建知识库接口
 */
func (client *Client) AddUniversalsaasDigitalhumanLibraryEx(request *AddUniversalsaasDigitalhumanLibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddUniversalsaasDigitalhumanLibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.library.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑知识库接口
 * Summary: 编辑知识库接口
 */
func (client *Client) UpdateUniversalsaasDigitalhumanLibrary(request *UpdateUniversalsaasDigitalhumanLibraryRequest) (_result *UpdateUniversalsaasDigitalhumanLibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.UpdateUniversalsaasDigitalhumanLibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑知识库接口
 * Summary: 编辑知识库接口
 */
func (client *Client) UpdateUniversalsaasDigitalhumanLibraryEx(request *UpdateUniversalsaasDigitalhumanLibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUniversalsaasDigitalhumanLibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.library.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除知识库接口
 * Summary: 删除知识库接口
 */
func (client *Client) DeleteUniversalsaasDigitalhumanLibrary(request *DeleteUniversalsaasDigitalhumanLibraryRequest) (_result *DeleteUniversalsaasDigitalhumanLibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.DeleteUniversalsaasDigitalhumanLibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除知识库接口
 * Summary: 删除知识库接口
 */
func (client *Client) DeleteUniversalsaasDigitalhumanLibraryEx(request *DeleteUniversalsaasDigitalhumanLibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteUniversalsaasDigitalhumanLibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteUniversalsaasDigitalhumanLibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.library.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增知识点接口
 * Summary: 新增知识点接口
 */
func (client *Client) AddUniversalsaasDigitalhumanKnowledge(request *AddUniversalsaasDigitalhumanKnowledgeRequest) (_result *AddUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.AddUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增知识点接口
 * Summary: 新增知识点接口
 */
func (client *Client) AddUniversalsaasDigitalhumanKnowledgeEx(request *AddUniversalsaasDigitalhumanKnowledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.knowledge.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑知识点接口
 * Summary: 编辑知识点接口
 */
func (client *Client) UpdateUniversalsaasDigitalhumanKnowledge(request *UpdateUniversalsaasDigitalhumanKnowledgeRequest) (_result *UpdateUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.UpdateUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑知识点接口
 * Summary: 编辑知识点接口
 */
func (client *Client) UpdateUniversalsaasDigitalhumanKnowledgeEx(request *UpdateUniversalsaasDigitalhumanKnowledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.knowledge.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布知识点接口
 * Summary: 发布知识点接口
 */
func (client *Client) OnlineUniversalsaasDigitalhumanKnowledge(request *OnlineUniversalsaasDigitalhumanKnowledgeRequest) (_result *OnlineUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.OnlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布知识点接口
 * Summary: 发布知识点接口
 */
func (client *Client) OnlineUniversalsaasDigitalhumanKnowledgeEx(request *OnlineUniversalsaasDigitalhumanKnowledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.knowledge.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下线知识点接口
 * Summary: 下线知识点接口
 */
func (client *Client) OfflineUniversalsaasDigitalhumanKnowledge(request *OfflineUniversalsaasDigitalhumanKnowledgeRequest) (_result *OfflineUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.OfflineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下线知识点接口
 * Summary: 下线知识点接口
 */
func (client *Client) OfflineUniversalsaasDigitalhumanKnowledgeEx(request *OfflineUniversalsaasDigitalhumanKnowledgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineUniversalsaasDigitalhumanKnowledgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineUniversalsaasDigitalhumanKnowledgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.knowledge.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询大模型对话列表接口
 * Summary: 查询大模型对话列表接口
 */
func (client *Client) ListUniversalsaasDigitalhumanLlmChat(request *ListUniversalsaasDigitalhumanLlmChatRequest) (_result *ListUniversalsaasDigitalhumanLlmChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUniversalsaasDigitalhumanLlmChatResponse{}
	_body, _err := client.ListUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询大模型对话列表接口
 * Summary: 查询大模型对话列表接口
 */
func (client *Client) ListUniversalsaasDigitalhumanLlmChatEx(request *ListUniversalsaasDigitalhumanLlmChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUniversalsaasDigitalhumanLlmChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUniversalsaasDigitalhumanLlmChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.llm.chat.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增交互配置接口
 * Summary: 新增交互配置接口
 */
func (client *Client) AddUniversalsaasDigitalhumanChatSetting(request *AddUniversalsaasDigitalhumanChatSettingRequest) (_result *AddUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.AddUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增交互配置接口
 * Summary: 新增交互配置接口
 */
func (client *Client) AddUniversalsaasDigitalhumanChatSettingEx(request *AddUniversalsaasDigitalhumanChatSettingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.chat.setting.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑交互配置接口
 * Summary: 编辑交互配置接口
 */
func (client *Client) SetUniversalsaasDigitalhumanChatSetting(request *SetUniversalsaasDigitalhumanChatSettingRequest) (_result *SetUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.SetUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑交互配置接口
 * Summary: 编辑交互配置接口
 */
func (client *Client) SetUniversalsaasDigitalhumanChatSettingEx(request *SetUniversalsaasDigitalhumanChatSettingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.chat.setting.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除交互配置接口
 * Summary: 删除交互配置接口
 */
func (client *Client) DeleteUniversalsaasDigitalhumanChatSetting(request *DeleteUniversalsaasDigitalhumanChatSettingRequest) (_result *DeleteUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DeleteUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除交互配置接口
 * Summary: 删除交互配置接口
 */
func (client *Client) DeleteUniversalsaasDigitalhumanChatSettingEx(request *DeleteUniversalsaasDigitalhumanChatSettingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.chat.setting.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布交互配置接口
 * Summary: 发布交互配置接口
 */
func (client *Client) OnlineUniversalsaasDigitalhumanChatSetting(request *OnlineUniversalsaasDigitalhumanChatSettingRequest) (_result *OnlineUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.OnlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布交互配置接口
 * Summary: 发布交互配置接口
 */
func (client *Client) OnlineUniversalsaasDigitalhumanChatSettingEx(request *OnlineUniversalsaasDigitalhumanChatSettingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.chat.setting.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下线交互配置接口
 * Summary: 下线交互配置接口
 */
func (client *Client) OfflineUniversalsaasDigitalhumanChatSetting(request *OfflineUniversalsaasDigitalhumanChatSettingRequest) (_result *OfflineUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.OfflineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下线交互配置接口
 * Summary: 下线交互配置接口
 */
func (client *Client) OfflineUniversalsaasDigitalhumanChatSettingEx(request *OfflineUniversalsaasDigitalhumanChatSettingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineUniversalsaasDigitalhumanChatSettingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineUniversalsaasDigitalhumanChatSettingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.chat.setting.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询批量导入任务
 * Summary: 查询批量导入任务
 */
func (client *Client) QueryUniversalsaasDigitalhumanKnowledgeImporttask(request *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest) (_result *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse{}
	_body, _err := client.QueryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询批量导入任务
 * Summary: 查询批量导入任务
 */
func (client *Client) QueryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request *QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.digitalhuman.knowledge.importtask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
