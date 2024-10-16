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

// 二维码详情
type QRCodeDetail struct {
	// 位置，Top、Left、Width、Height
	Location []*int64 `json:"location,omitempty" xml:"location,omitempty" require:"true" type:"Repeated"`
	// 二维码类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 二维码内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 置信度
	Probability *string `json:"probability,omitempty" xml:"probability,omitempty" require:"true"`
}

func (s QRCodeDetail) String() string {
	return tea.Prettify(s)
}

func (s QRCodeDetail) GoString() string {
	return s.String()
}

func (s *QRCodeDetail) SetLocation(v []*int64) *QRCodeDetail {
	s.Location = v
	return s
}

func (s *QRCodeDetail) SetType(v string) *QRCodeDetail {
	s.Type = &v
	return s
}

func (s *QRCodeDetail) SetContent(v string) *QRCodeDetail {
	s.Content = &v
	return s
}

func (s *QRCodeDetail) SetProbability(v string) *QRCodeDetail {
	s.Probability = &v
	return s
}

// Logo详情
type LogoDetail struct {
	// 位置，Top、Left、Width、Height
	Location []*int64 `json:"location,omitempty" xml:"location,omitempty" require:"true" type:"Repeated"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 置信度
	Probability *string `json:"probability,omitempty" xml:"probability,omitempty" require:"true"`
}

func (s LogoDetail) String() string {
	return tea.Prettify(s)
}

func (s LogoDetail) GoString() string {
	return s.String()
}

func (s *LogoDetail) SetLocation(v []*int64) *LogoDetail {
	s.Location = v
	return s
}

func (s *LogoDetail) SetType(v string) *LogoDetail {
	s.Type = &v
	return s
}

func (s *LogoDetail) SetProbability(v string) *LogoDetail {
	s.Probability = &v
	return s
}

// maya响应体
type MayaRedGptResponseDTO struct {
	// 消息的ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 应答内容
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty" require:"true"`
	// 应答内容格式
	AnswerFormat *string `json:"answer_format,omitempty" xml:"answer_format,omitempty" require:"true"`
	// 是否回答结束
	AnswerEnd *bool `json:"answer_end,omitempty" xml:"answer_end,omitempty" require:"true"`
	// 是否问题有风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty" require:"true"`
}

func (s MayaRedGptResponseDTO) String() string {
	return tea.Prettify(s)
}

func (s MayaRedGptResponseDTO) GoString() string {
	return s.String()
}

func (s *MayaRedGptResponseDTO) SetMessageId(v string) *MayaRedGptResponseDTO {
	s.MessageId = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetRequestId(v string) *MayaRedGptResponseDTO {
	s.RequestId = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetSessionId(v string) *MayaRedGptResponseDTO {
	s.SessionId = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetAnswer(v string) *MayaRedGptResponseDTO {
	s.Answer = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetAnswerFormat(v string) *MayaRedGptResponseDTO {
	s.AnswerFormat = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetAnswerEnd(v bool) *MayaRedGptResponseDTO {
	s.AnswerEnd = &v
	return s
}

func (s *MayaRedGptResponseDTO) SetSafe(v bool) *MayaRedGptResponseDTO {
	s.Safe = &v
	return s
}

// maya流式响应结果
type MayaStreamResult struct {
	// maya响应数据
	Data *MayaRedGptResponseDTO `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty" require:"true"`
}

func (s MayaStreamResult) String() string {
	return tea.Prettify(s)
}

func (s MayaStreamResult) GoString() string {
	return s.String()
}

func (s *MayaStreamResult) SetData(v *MayaRedGptResponseDTO) *MayaStreamResult {
	s.Data = v
	return s
}

func (s *MayaStreamResult) SetSuccess(v bool) *MayaStreamResult {
	s.Success = &v
	return s
}

func (s *MayaStreamResult) SetErrorCode(v string) *MayaStreamResult {
	s.ErrorCode = &v
	return s
}

func (s *MayaStreamResult) SetErrorMsg(v string) *MayaStreamResult {
	s.ErrorMsg = &v
	return s
}

// 审核同步标签列表
type AuditSyncLabel struct {
	// 标签名：sex-色情
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 检测到单个风险标签的置信度：66.25
	Probability *int64 `json:"probability,omitempty" xml:"probability,omitempty" require:"true"`
	// 风险标签说明
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
	RiskWords *string `json:"risk_words,omitempty" xml:"risk_words,omitempty" require:"true"`
}

func (s AuditSyncLabel) String() string {
	return tea.Prettify(s)
}

func (s AuditSyncLabel) GoString() string {
	return s.String()
}

func (s *AuditSyncLabel) SetLabel(v string) *AuditSyncLabel {
	s.Label = &v
	return s
}

func (s *AuditSyncLabel) SetProbability(v int64) *AuditSyncLabel {
	s.Probability = &v
	return s
}

func (s *AuditSyncLabel) SetDescription(v string) *AuditSyncLabel {
	s.Description = &v
	return s
}

func (s *AuditSyncLabel) SetRiskWords(v string) *AuditSyncLabel {
	s.RiskWords = &v
	return s
}

// QRCode审核结果
type QRCodeAuditResult struct {
	// 检测到二维码个数
	DetectNum *int64 `json:"detect_num,omitempty" xml:"detect_num,omitempty" require:"true"`
	// 二维码详情
	Details []*QRCodeDetail `json:"details,omitempty" xml:"details,omitempty" require:"true" type:"Repeated"`
}

func (s QRCodeAuditResult) String() string {
	return tea.Prettify(s)
}

func (s QRCodeAuditResult) GoString() string {
	return s.String()
}

func (s *QRCodeAuditResult) SetDetectNum(v int64) *QRCodeAuditResult {
	s.DetectNum = &v
	return s
}

func (s *QRCodeAuditResult) SetDetails(v []*QRCodeDetail) *QRCodeAuditResult {
	s.Details = v
	return s
}

// logo审核结果
type LogoAuditResult struct {
	// 检测到LOGO个数
	DetectNum *int64 `json:"detect_num,omitempty" xml:"detect_num,omitempty" require:"true"`
	// LOGO详情
	Details []*LogoDetail `json:"details,omitempty" xml:"details,omitempty" require:"true" type:"Repeated"`
}

func (s LogoAuditResult) String() string {
	return tea.Prettify(s)
}

func (s LogoAuditResult) GoString() string {
	return s.String()
}

func (s *LogoAuditResult) SetDetectNum(v int64) *LogoAuditResult {
	s.DetectNum = &v
	return s
}

func (s *LogoAuditResult) SetDetails(v []*LogoDetail) *LogoAuditResult {
	s.Details = v
	return s
}

// 网关响应模型
type AntCloudProdProviderHttpResponse struct {
	// maya返回结果
	Response *MayaStreamResult `json:"response,omitempty" xml:"response,omitempty" require:"true"`
	// 签名
	Sign *string `json:"sign,omitempty" xml:"sign,omitempty" require:"true"`
}

func (s AntCloudProdProviderHttpResponse) String() string {
	return tea.Prettify(s)
}

func (s AntCloudProdProviderHttpResponse) GoString() string {
	return s.String()
}

func (s *AntCloudProdProviderHttpResponse) SetResponse(v *MayaStreamResult) *AntCloudProdProviderHttpResponse {
	s.Response = v
	return s
}

func (s *AntCloudProdProviderHttpResponse) SetSign(v string) *AntCloudProdProviderHttpResponse {
	s.Sign = &v
	return s
}

// 图片审核结果
type ImageAuditResult struct {
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 数据ID
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// LOGO审核结果
	LogoAuditResult *LogoAuditResult `json:"logo_audit_result,omitempty" xml:"logo_audit_result,omitempty" require:"true"`
	// QRCode审核结果
	QrCodeAuditResult *QRCodeAuditResult `json:"qr_code_audit_result,omitempty" xml:"qr_code_audit_result,omitempty" require:"true"`
}

func (s ImageAuditResult) String() string {
	return tea.Prettify(s)
}

func (s ImageAuditResult) GoString() string {
	return s.String()
}

func (s *ImageAuditResult) SetTaskId(v string) *ImageAuditResult {
	s.TaskId = &v
	return s
}

func (s *ImageAuditResult) SetDataId(v string) *ImageAuditResult {
	s.DataId = &v
	return s
}

func (s *ImageAuditResult) SetLogoAuditResult(v *LogoAuditResult) *ImageAuditResult {
	s.LogoAuditResult = v
	return s
}

func (s *ImageAuditResult) SetQrCodeAuditResult(v *QRCodeAuditResult) *ImageAuditResult {
	s.QrCodeAuditResult = v
	return s
}

// 文本同步审核结果
type TextSyncAuditResult struct {
	// 任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 数据Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 业务Id - 调用方透传
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// 审核标签列表
	Labels []*AuditSyncLabel `json:"labels,omitempty" xml:"labels,omitempty" require:"true" type:"Repeated"`
}

func (s TextSyncAuditResult) String() string {
	return tea.Prettify(s)
}

func (s TextSyncAuditResult) GoString() string {
	return s.String()
}

func (s *TextSyncAuditResult) SetTaskId(v string) *TextSyncAuditResult {
	s.TaskId = &v
	return s
}

func (s *TextSyncAuditResult) SetDataId(v string) *TextSyncAuditResult {
	s.DataId = &v
	return s
}

func (s *TextSyncAuditResult) SetBusinessId(v string) *TextSyncAuditResult {
	s.BusinessId = &v
	return s
}

func (s *TextSyncAuditResult) SetRiskLevel(v string) *TextSyncAuditResult {
	s.RiskLevel = &v
	return s
}

func (s *TextSyncAuditResult) SetLabels(v []*AuditSyncLabel) *TextSyncAuditResult {
	s.Labels = v
	return s
}

type ApplyAuditImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核内容链接
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核类型列表
	SecTypes []*string `json:"sec_types,omitempty" xml:"sec_types,omitempty" require:"true" type:"Repeated"`
	// 场景信息
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 数据Id,客户传入，唯一标识
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
}

func (s ApplyAuditImageRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImageRequest) GoString() string {
	return s.String()
}

func (s *ApplyAuditImageRequest) SetAuthToken(v string) *ApplyAuditImageRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAuditImageRequest) SetProductInstanceId(v string) *ApplyAuditImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAuditImageRequest) SetUrl(v string) *ApplyAuditImageRequest {
	s.Url = &v
	return s
}

func (s *ApplyAuditImageRequest) SetSecTypes(v []*string) *ApplyAuditImageRequest {
	s.SecTypes = v
	return s
}

func (s *ApplyAuditImageRequest) SetScene(v string) *ApplyAuditImageRequest {
	s.Scene = &v
	return s
}

func (s *ApplyAuditImageRequest) SetDataId(v string) *ApplyAuditImageRequest {
	s.DataId = &v
	return s
}

type ApplyAuditImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求ID，必须唯一
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 任务ID，必须唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 数据ID，必须唯一
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
	// 审核内容类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyAuditImageResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImageResponse) GoString() string {
	return s.String()
}

func (s *ApplyAuditImageResponse) SetReqMsgId(v string) *ApplyAuditImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAuditImageResponse) SetResultCode(v string) *ApplyAuditImageResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAuditImageResponse) SetResultMsg(v string) *ApplyAuditImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAuditImageResponse) SetRequestId(v string) *ApplyAuditImageResponse {
	s.RequestId = &v
	return s
}

func (s *ApplyAuditImageResponse) SetTaskId(v string) *ApplyAuditImageResponse {
	s.TaskId = &v
	return s
}

func (s *ApplyAuditImageResponse) SetDataId(v string) *ApplyAuditImageResponse {
	s.DataId = &v
	return s
}

func (s *ApplyAuditImageResponse) SetContentType(v string) *ApplyAuditImageResponse {
	s.ContentType = &v
	return s
}

func (s *ApplyAuditImageResponse) SetResult(v string) *ApplyAuditImageResponse {
	s.Result = &v
	return s
}

type CallbackSofaAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回执原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// 回执场景
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s CallbackSofaAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSofaAuditRequest) GoString() string {
	return s.String()
}

func (s *CallbackSofaAuditRequest) SetAuthToken(v string) *CallbackSofaAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSofaAuditRequest) SetProductInstanceId(v string) *CallbackSofaAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackSofaAuditRequest) SetPayload(v string) *CallbackSofaAuditRequest {
	s.Payload = &v
	return s
}

func (s *CallbackSofaAuditRequest) SetBizScene(v string) *CallbackSofaAuditRequest {
	s.BizScene = &v
	return s
}

type CallbackSofaAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误原因
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s CallbackSofaAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSofaAuditResponse) GoString() string {
	return s.String()
}

func (s *CallbackSofaAuditResponse) SetReqMsgId(v string) *CallbackSofaAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSofaAuditResponse) SetResultCode(v string) *CallbackSofaAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSofaAuditResponse) SetResultMsg(v string) *CallbackSofaAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSofaAuditResponse) SetErrorCode(v string) *CallbackSofaAuditResponse {
	s.ErrorCode = &v
	return s
}

func (s *CallbackSofaAuditResponse) SetErrorMessage(v string) *CallbackSofaAuditResponse {
	s.ErrorMessage = &v
	return s
}

type SubmitAuditTextRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
	// 审核场景码，该接口固定输入BASE_TEXT_AUDIT，其他值无效
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s SubmitAuditTextRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditTextRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditTextRequest) SetAuthToken(v string) *SubmitAuditTextRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditTextRequest) SetProductInstanceId(v string) *SubmitAuditTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditTextRequest) SetContent(v string) *SubmitAuditTextRequest {
	s.Content = &v
	return s
}

func (s *SubmitAuditTextRequest) SetBusinessId(v string) *SubmitAuditTextRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditTextRequest) SetDataId(v string) *SubmitAuditTextRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditTextRequest) SetCallback(v string) *SubmitAuditTextRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditTextRequest) SetSeed(v string) *SubmitAuditTextRequest {
	s.Seed = &v
	return s
}

func (s *SubmitAuditTextRequest) SetScene(v string) *SubmitAuditTextRequest {
	s.Scene = &v
	return s
}

type SubmitAuditTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditTextResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditTextResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditTextResponse) SetReqMsgId(v string) *SubmitAuditTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditTextResponse) SetResultCode(v string) *SubmitAuditTextResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditTextResponse) SetResultMsg(v string) *SubmitAuditTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditTextResponse) SetRequestId(v string) *SubmitAuditTextResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAuditTextResponse) SetTaskId(v string) *SubmitAuditTextResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditTextResponse) SetDataId(v string) *SubmitAuditTextResponse {
	s.DataId = &v
	return s
}

type QueryAuditTextRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditTextRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditTextRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditTextRequest) SetAuthToken(v string) *QueryAuditTextRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditTextRequest) SetProductInstanceId(v string) *QueryAuditTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditTextRequest) SetTaskId(v string) *QueryAuditTextRequest {
	s.TaskId = &v
	return s
}

type QueryAuditTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 文本审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditTextResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditTextResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditTextResponse) SetReqMsgId(v string) *QueryAuditTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditTextResponse) SetResultCode(v string) *QueryAuditTextResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditTextResponse) SetResultMsg(v string) *QueryAuditTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditTextResponse) SetRequestId(v string) *QueryAuditTextResponse {
	s.RequestId = &v
	return s
}

func (s *QueryAuditTextResponse) SetResult(v string) *QueryAuditTextResponse {
	s.Result = &v
	return s
}

type SubmitAuditImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitAuditImageRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditImageRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditImageRequest) SetAuthToken(v string) *SubmitAuditImageRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditImageRequest) SetProductInstanceId(v string) *SubmitAuditImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditImageRequest) SetUrl(v string) *SubmitAuditImageRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditImageRequest) SetScene(v string) *SubmitAuditImageRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditImageRequest) SetBusinessId(v string) *SubmitAuditImageRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditImageRequest) SetDataId(v string) *SubmitAuditImageRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditImageRequest) SetCallback(v string) *SubmitAuditImageRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditImageRequest) SetSeed(v string) *SubmitAuditImageRequest {
	s.Seed = &v
	return s
}

type SubmitAuditImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。
	// 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditImageResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditImageResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditImageResponse) SetReqMsgId(v string) *SubmitAuditImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditImageResponse) SetResultCode(v string) *SubmitAuditImageResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditImageResponse) SetResultMsg(v string) *SubmitAuditImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditImageResponse) SetRequestId(v string) *SubmitAuditImageResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAuditImageResponse) SetTaskId(v string) *SubmitAuditImageResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditImageResponse) SetDataId(v string) *SubmitAuditImageResponse {
	s.DataId = &v
	return s
}

type QueryAuditImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditImageRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditImageRequest) SetAuthToken(v string) *QueryAuditImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditImageRequest) SetProductInstanceId(v string) *QueryAuditImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditImageRequest) SetTaskId(v string) *QueryAuditImageRequest {
	s.TaskId = &v
	return s
}

type QueryAuditImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 图片审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditImageResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditImageResponse) SetReqMsgId(v string) *QueryAuditImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditImageResponse) SetResultCode(v string) *QueryAuditImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditImageResponse) SetResultMsg(v string) *QueryAuditImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditImageResponse) SetRequestId(v string) *QueryAuditImageResponse {
	s.RequestId = &v
	return s
}

func (s *QueryAuditImageResponse) SetResult(v string) *QueryAuditImageResponse {
	s.Result = &v
	return s
}

type SubmitAuditAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// 说明 ：
	// URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitAuditAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditAudioRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditAudioRequest) SetAuthToken(v string) *SubmitAuditAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetProductInstanceId(v string) *SubmitAuditAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetUrl(v string) *SubmitAuditAudioRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetScene(v string) *SubmitAuditAudioRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetBusinessId(v string) *SubmitAuditAudioRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetDataId(v string) *SubmitAuditAudioRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetCallback(v string) *SubmitAuditAudioRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetSeed(v string) *SubmitAuditAudioRequest {
	s.Seed = &v
	return s
}

type SubmitAuditAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。
	// 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditAudioResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditAudioResponse) SetReqMsgId(v string) *SubmitAuditAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditAudioResponse) SetResultCode(v string) *SubmitAuditAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditAudioResponse) SetResultMsg(v string) *SubmitAuditAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditAudioResponse) SetRequestId(v string) *SubmitAuditAudioResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAuditAudioResponse) SetTaskId(v string) *SubmitAuditAudioResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditAudioResponse) SetDataId(v string) *SubmitAuditAudioResponse {
	s.DataId = &v
	return s
}

type QueryAuditAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditAudioRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditAudioRequest) SetAuthToken(v string) *QueryAuditAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditAudioRequest) SetProductInstanceId(v string) *QueryAuditAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditAudioRequest) SetTaskId(v string) *QueryAuditAudioRequest {
	s.TaskId = &v
	return s
}

type QueryAuditAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 音频审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditAudioResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditAudioResponse) SetReqMsgId(v string) *QueryAuditAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditAudioResponse) SetResultCode(v string) *QueryAuditAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditAudioResponse) SetResultMsg(v string) *QueryAuditAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditAudioResponse) SetRequestId(v string) *QueryAuditAudioResponse {
	s.RequestId = &v
	return s
}

func (s *QueryAuditAudioResponse) SetResult(v string) *QueryAuditAudioResponse {
	s.Result = &v
	return s
}

type SubmitAuditVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitAuditVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditVideoRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditVideoRequest) SetAuthToken(v string) *SubmitAuditVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetProductInstanceId(v string) *SubmitAuditVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetUrl(v string) *SubmitAuditVideoRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetScene(v string) *SubmitAuditVideoRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetBusinessId(v string) *SubmitAuditVideoRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetDataId(v string) *SubmitAuditVideoRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetCallback(v string) *SubmitAuditVideoRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetSeed(v string) *SubmitAuditVideoRequest {
	s.Seed = &v
	return s
}

type SubmitAuditVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。
	// 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditVideoResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditVideoResponse) SetReqMsgId(v string) *SubmitAuditVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditVideoResponse) SetResultCode(v string) *SubmitAuditVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditVideoResponse) SetResultMsg(v string) *SubmitAuditVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditVideoResponse) SetRequestId(v string) *SubmitAuditVideoResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAuditVideoResponse) SetTaskId(v string) *SubmitAuditVideoResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditVideoResponse) SetDataId(v string) *SubmitAuditVideoResponse {
	s.DataId = &v
	return s
}

type QueryAuditVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditVideoRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditVideoRequest) SetAuthToken(v string) *QueryAuditVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditVideoRequest) SetProductInstanceId(v string) *QueryAuditVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditVideoRequest) SetTaskId(v string) *QueryAuditVideoRequest {
	s.TaskId = &v
	return s
}

type QueryAuditVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 视频审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditVideoResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditVideoResponse) SetReqMsgId(v string) *QueryAuditVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditVideoResponse) SetResultCode(v string) *QueryAuditVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditVideoResponse) SetResultMsg(v string) *QueryAuditVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditVideoResponse) SetRequestId(v string) *QueryAuditVideoResponse {
	s.RequestId = &v
	return s
}

func (s *QueryAuditVideoResponse) SetResult(v string) *QueryAuditVideoResponse {
	s.Result = &v
	return s
}

type ApplyAuditTextRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
}

func (s ApplyAuditTextRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditTextRequest) GoString() string {
	return s.String()
}

func (s *ApplyAuditTextRequest) SetAuthToken(v string) *ApplyAuditTextRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAuditTextRequest) SetProductInstanceId(v string) *ApplyAuditTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAuditTextRequest) SetContent(v string) *ApplyAuditTextRequest {
	s.Content = &v
	return s
}

func (s *ApplyAuditTextRequest) SetScene(v string) *ApplyAuditTextRequest {
	s.Scene = &v
	return s
}

func (s *ApplyAuditTextRequest) SetBusinessId(v string) *ApplyAuditTextRequest {
	s.BusinessId = &v
	return s
}

func (s *ApplyAuditTextRequest) SetDataId(v string) *ApplyAuditTextRequest {
	s.DataId = &v
	return s
}

type ApplyAuditTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 文本同步审核结果，字段含义见：TextSyncAuditResult
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyAuditTextResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditTextResponse) GoString() string {
	return s.String()
}

func (s *ApplyAuditTextResponse) SetReqMsgId(v string) *ApplyAuditTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAuditTextResponse) SetResultCode(v string) *ApplyAuditTextResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAuditTextResponse) SetResultMsg(v string) *ApplyAuditTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAuditTextResponse) SetRequestId(v string) *ApplyAuditTextResponse {
	s.RequestId = &v
	return s
}

func (s *ApplyAuditTextResponse) SetResult(v string) *ApplyAuditTextResponse {
	s.Result = &v
	return s
}

type QueryGuardcoreRedgptRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 唯一请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 多轮对话会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 场景code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 调用方AppCode
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 提问内容
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 提问内容格式,当前仅支持PLAINTEXT
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty" require:"true"`
	// 加密的调用方业务UserId
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 是否流式输出
	Stream *bool `json:"stream,omitempty" xml:"stream,omitempty" require:"true"`
}

func (s QueryGuardcoreRedgptRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardcoreRedgptRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardcoreRedgptRequest) SetAuthToken(v string) *QueryGuardcoreRedgptRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetProductInstanceId(v string) *QueryGuardcoreRedgptRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetRequestId(v string) *QueryGuardcoreRedgptRequest {
	s.RequestId = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetSessionId(v string) *QueryGuardcoreRedgptRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetSceneCode(v string) *QueryGuardcoreRedgptRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetAppCode(v string) *QueryGuardcoreRedgptRequest {
	s.AppCode = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetQuestion(v string) *QueryGuardcoreRedgptRequest {
	s.Question = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetQuestionFormat(v string) *QueryGuardcoreRedgptRequest {
	s.QuestionFormat = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetUserId(v string) *QueryGuardcoreRedgptRequest {
	s.UserId = &v
	return s
}

func (s *QueryGuardcoreRedgptRequest) SetStream(v bool) *QueryGuardcoreRedgptRequest {
	s.Stream = &v
	return s
}

type QueryGuardcoreRedgptResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// maya流式调用结果集
	Data *MayaStreamResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryGuardcoreRedgptResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardcoreRedgptResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardcoreRedgptResponse) SetReqMsgId(v string) *QueryGuardcoreRedgptResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardcoreRedgptResponse) SetResultCode(v string) *QueryGuardcoreRedgptResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardcoreRedgptResponse) SetResultMsg(v string) *QueryGuardcoreRedgptResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardcoreRedgptResponse) SetData(v *MayaStreamResult) *QueryGuardcoreRedgptResponse {
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
				"sdk_version":      tea.String("1.1.8"),
				"_prod_code":       tea.String("AITECH"),
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
 * Description: LOGO/二维码审核
 * Summary: LOGO/二维码审核
 */
func (client *Client) ApplyAuditImage(request *ApplyAuditImageRequest) (_result *ApplyAuditImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAuditImageResponse{}
	_body, _err := client.ApplyAuditImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: LOGO/二维码审核
 * Summary: LOGO/二维码审核
 */
func (client *Client) ApplyAuditImageEx(request *ApplyAuditImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAuditImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAuditImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.image.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 主站审核能力回调
 * Summary: 主站审核能力回调
 */
func (client *Client) CallbackSofaAudit(request *CallbackSofaAuditRequest) (_result *CallbackSofaAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSofaAuditResponse{}
	_body, _err := client.CallbackSofaAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 主站审核能力回调
 * Summary: 主站审核能力回调
 */
func (client *Client) CallbackSofaAuditEx(request *CallbackSofaAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSofaAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSofaAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.sofa.audit.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本审核入审
 * Summary: 文本审核入审
 */
func (client *Client) SubmitAuditText(request *SubmitAuditTextRequest) (_result *SubmitAuditTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditTextResponse{}
	_body, _err := client.SubmitAuditTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本审核入审
 * Summary: 文本审核入审
 */
func (client *Client) SubmitAuditTextEx(request *SubmitAuditTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.text.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本审核查询
 * Summary: 文本审核查询
 */
func (client *Client) QueryAuditText(request *QueryAuditTextRequest) (_result *QueryAuditTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditTextResponse{}
	_body, _err := client.QueryAuditTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本审核查询
 * Summary: 文本审核查询
 */
func (client *Client) QueryAuditTextEx(request *QueryAuditTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.text.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片审核入审
 * Summary: 图片审核入审
 */
func (client *Client) SubmitAuditImage(request *SubmitAuditImageRequest) (_result *SubmitAuditImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditImageResponse{}
	_body, _err := client.SubmitAuditImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片审核入审
 * Summary: 图片审核入审
 */
func (client *Client) SubmitAuditImageEx(request *SubmitAuditImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.image.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片审核查询
 * Summary: 图片审核查询
 */
func (client *Client) QueryAuditImage(request *QueryAuditImageRequest) (_result *QueryAuditImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditImageResponse{}
	_body, _err := client.QueryAuditImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片审核查询
 * Summary: 图片审核查询
 */
func (client *Client) QueryAuditImageEx(request *QueryAuditImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频审核入审
 * Summary: 音频审核入审
 */
func (client *Client) SubmitAuditAudio(request *SubmitAuditAudioRequest) (_result *SubmitAuditAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditAudioResponse{}
	_body, _err := client.SubmitAuditAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频审核入审
 * Summary: 音频审核入审
 */
func (client *Client) SubmitAuditAudioEx(request *SubmitAuditAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.audio.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频审核查询
 * Summary: 音频审核查询
 */
func (client *Client) QueryAuditAudio(request *QueryAuditAudioRequest) (_result *QueryAuditAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditAudioResponse{}
	_body, _err := client.QueryAuditAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频审核查询
 * Summary: 音频审核查询
 */
func (client *Client) QueryAuditAudioEx(request *QueryAuditAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.audio.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频审核入审
 * Summary: 视频审核入审
 */
func (client *Client) SubmitAuditVideo(request *SubmitAuditVideoRequest) (_result *SubmitAuditVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditVideoResponse{}
	_body, _err := client.SubmitAuditVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频审核入审
 * Summary: 视频审核入审
 */
func (client *Client) SubmitAuditVideoEx(request *SubmitAuditVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.video.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频审核查询
 * Summary: 视频审核查询
 */
func (client *Client) QueryAuditVideo(request *QueryAuditVideoRequest) (_result *QueryAuditVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditVideoResponse{}
	_body, _err := client.QueryAuditVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频审核查询
 * Summary: 视频审核查询
 */
func (client *Client) QueryAuditVideoEx(request *QueryAuditVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.video.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
 * Summary: 文本同步审核
 */
func (client *Client) ApplyAuditText(request *ApplyAuditTextRequest) (_result *ApplyAuditTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAuditTextResponse{}
	_body, _err := client.ApplyAuditTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
 * Summary: 文本同步审核
 */
func (client *Client) ApplyAuditTextEx(request *ApplyAuditTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAuditTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAuditTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.text.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 红色GPT流式调用网关接口
 * Summary: 红色GPT网关方式调用接口
 */
func (client *Client) QueryGuardcoreRedgpt(request *QueryGuardcoreRedgptRequest) (_result *QueryGuardcoreRedgptResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardcoreRedgptResponse{}
	_body, _err := client.QueryGuardcoreRedgptEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 红色GPT流式调用网关接口
 * Summary: 红色GPT网关方式调用接口
 */
func (client *Client) QueryGuardcoreRedgptEx(request *QueryGuardcoreRedgptRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardcoreRedgptResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardcoreRedgptResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guardcore.redgpt.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
