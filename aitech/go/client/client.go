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
	// 审核场景码，该接口固定输入BASE_TEXT_AUDIT，其他值无效
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
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

func (s *SubmitAuditTextRequest) SetScene(v string) *SubmitAuditTextRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditTextRequest) SetDataId(v string) *SubmitAuditTextRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditTextRequest) SetBusinessId(v string) *SubmitAuditTextRequest {
	s.BusinessId = &v
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

type SubmitAuditTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
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

func (s *SubmitAuditImageRequest) SetDataId(v string) *SubmitAuditImageRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditImageRequest) SetBusinessId(v string) *SubmitAuditImageRequest {
	s.BusinessId = &v
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
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
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

func (s *SubmitAuditAudioRequest) SetDataId(v string) *SubmitAuditAudioRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetBusinessId(v string) *SubmitAuditAudioRequest {
	s.BusinessId = &v
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
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
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

func (s *SubmitAuditVideoRequest) SetDataId(v string) *SubmitAuditVideoRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetBusinessId(v string) *SubmitAuditVideoRequest {
	s.BusinessId = &v
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
	// 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
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

func (s *ApplyAuditTextRequest) SetDataId(v string) *ApplyAuditTextRequest {
	s.DataId = &v
	return s
}

func (s *ApplyAuditTextRequest) SetBusinessId(v string) *ApplyAuditTextRequest {
	s.BusinessId = &v
	return s
}

type ApplyAuditTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s *ApplyAuditTextResponse) SetResult(v string) *ApplyAuditTextResponse {
	s.Result = &v
	return s
}

type ApplyAuditImagebaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核内容链接
	// 目前支持 jpeg、png、jpg、bmp、webp 五种格式
	// 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 场景，固定填写：BASE_IMAGE_SEC
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 数据Id，调用方入审数据的唯一Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s ApplyAuditImagebaseRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImagebaseRequest) GoString() string {
	return s.String()
}

func (s *ApplyAuditImagebaseRequest) SetAuthToken(v string) *ApplyAuditImagebaseRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAuditImagebaseRequest) SetProductInstanceId(v string) *ApplyAuditImagebaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAuditImagebaseRequest) SetUrl(v string) *ApplyAuditImagebaseRequest {
	s.Url = &v
	return s
}

func (s *ApplyAuditImagebaseRequest) SetScene(v string) *ApplyAuditImagebaseRequest {
	s.Scene = &v
	return s
}

func (s *ApplyAuditImagebaseRequest) SetDataId(v string) *ApplyAuditImagebaseRequest {
	s.DataId = &v
	return s
}

func (s *ApplyAuditImagebaseRequest) SetBusinessId(v string) *ApplyAuditImagebaseRequest {
	s.BusinessId = &v
	return s
}

type ApplyAuditImagebaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片基础版审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyAuditImagebaseResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImagebaseResponse) GoString() string {
	return s.String()
}

func (s *ApplyAuditImagebaseResponse) SetReqMsgId(v string) *ApplyAuditImagebaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAuditImagebaseResponse) SetResultCode(v string) *ApplyAuditImagebaseResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAuditImagebaseResponse) SetResultMsg(v string) *ApplyAuditImagebaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAuditImagebaseResponse) SetResult(v string) *ApplyAuditImagebaseResponse {
	s.Result = &v
	return s
}

type ApplyAuditImageadvancedRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核内容链接
	// 目前支持 jpeg、png、jpg、bmp、webp 五种格式
	// 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 场景，固定填写：ADVANCED_IMAGE_SEC
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 数据Id，调用方入审数据的唯一Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s ApplyAuditImageadvancedRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImageadvancedRequest) GoString() string {
	return s.String()
}

func (s *ApplyAuditImageadvancedRequest) SetAuthToken(v string) *ApplyAuditImageadvancedRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAuditImageadvancedRequest) SetProductInstanceId(v string) *ApplyAuditImageadvancedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyAuditImageadvancedRequest) SetUrl(v string) *ApplyAuditImageadvancedRequest {
	s.Url = &v
	return s
}

func (s *ApplyAuditImageadvancedRequest) SetScene(v string) *ApplyAuditImageadvancedRequest {
	s.Scene = &v
	return s
}

func (s *ApplyAuditImageadvancedRequest) SetDataId(v string) *ApplyAuditImageadvancedRequest {
	s.DataId = &v
	return s
}

func (s *ApplyAuditImageadvancedRequest) SetBusinessId(v string) *ApplyAuditImageadvancedRequest {
	s.BusinessId = &v
	return s
}

type ApplyAuditImageadvancedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片增强版审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyAuditImageadvancedResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAuditImageadvancedResponse) GoString() string {
	return s.String()
}

func (s *ApplyAuditImageadvancedResponse) SetReqMsgId(v string) *ApplyAuditImageadvancedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAuditImageadvancedResponse) SetResultCode(v string) *ApplyAuditImageadvancedResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAuditImageadvancedResponse) SetResultMsg(v string) *ApplyAuditImageadvancedResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAuditImageadvancedResponse) SetResult(v string) *ApplyAuditImageadvancedResponse {
	s.Result = &v
	return s
}

type SubmitAuditAudiobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// 说明 ：
	// 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	// 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景类型
	// 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitAuditAudiobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditAudiobaseRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditAudiobaseRequest) SetAuthToken(v string) *SubmitAuditAudiobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetProductInstanceId(v string) *SubmitAuditAudiobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetUrl(v string) *SubmitAuditAudiobaseRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetScene(v string) *SubmitAuditAudiobaseRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetDataId(v string) *SubmitAuditAudiobaseRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetBusinessId(v string) *SubmitAuditAudiobaseRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetCallback(v string) *SubmitAuditAudiobaseRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditAudiobaseRequest) SetSeed(v string) *SubmitAuditAudiobaseRequest {
	s.Seed = &v
	return s
}

type SubmitAuditAudiobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditAudiobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditAudiobaseResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditAudiobaseResponse) SetReqMsgId(v string) *SubmitAuditAudiobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditAudiobaseResponse) SetResultCode(v string) *SubmitAuditAudiobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditAudiobaseResponse) SetResultMsg(v string) *SubmitAuditAudiobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditAudiobaseResponse) SetTaskId(v string) *SubmitAuditAudiobaseResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditAudiobaseResponse) SetDataId(v string) *SubmitAuditAudiobaseResponse {
	s.DataId = &v
	return s
}

type QueryAuditAudiobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditAudiobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditAudiobaseRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditAudiobaseRequest) SetAuthToken(v string) *QueryAuditAudiobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditAudiobaseRequest) SetProductInstanceId(v string) *QueryAuditAudiobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditAudiobaseRequest) SetTaskId(v string) *QueryAuditAudiobaseRequest {
	s.TaskId = &v
	return s
}

type QueryAuditAudiobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频通用版审核结果
	//
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditAudiobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditAudiobaseResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditAudiobaseResponse) SetReqMsgId(v string) *QueryAuditAudiobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditAudiobaseResponse) SetResultCode(v string) *QueryAuditAudiobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditAudiobaseResponse) SetResultMsg(v string) *QueryAuditAudiobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditAudiobaseResponse) SetResult(v string) *QueryAuditAudiobaseResponse {
	s.Result = &v
	return s
}

type SubmitAuditVideobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// 说明 ：
	// 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	// 2. 视频文件链接支持以下协议：HTTP和HTTPS。
	// 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。
	// 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景类型
	// 目前支持通用版 BASE_VIDEO_SEC
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitAuditVideobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditVideobaseRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditVideobaseRequest) SetAuthToken(v string) *SubmitAuditVideobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetProductInstanceId(v string) *SubmitAuditVideobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetUrl(v string) *SubmitAuditVideobaseRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetScene(v string) *SubmitAuditVideobaseRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetDataId(v string) *SubmitAuditVideobaseRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetBusinessId(v string) *SubmitAuditVideobaseRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetCallback(v string) *SubmitAuditVideobaseRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditVideobaseRequest) SetSeed(v string) *SubmitAuditVideobaseRequest {
	s.Seed = &v
	return s
}

type SubmitAuditVideobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitAuditVideobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditVideobaseResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditVideobaseResponse) SetReqMsgId(v string) *SubmitAuditVideobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditVideobaseResponse) SetResultCode(v string) *SubmitAuditVideobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditVideobaseResponse) SetResultMsg(v string) *SubmitAuditVideobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditVideobaseResponse) SetTaskId(v string) *SubmitAuditVideobaseResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditVideobaseResponse) SetDataId(v string) *SubmitAuditVideobaseResponse {
	s.DataId = &v
	return s
}

type QueryAuditVideobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditVideobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditVideobaseRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditVideobaseRequest) SetAuthToken(v string) *QueryAuditVideobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditVideobaseRequest) SetProductInstanceId(v string) *QueryAuditVideobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditVideobaseRequest) SetTaskId(v string) *QueryAuditVideobaseRequest {
	s.TaskId = &v
	return s
}

type QueryAuditVideobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频通用版审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditVideobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditVideobaseResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditVideobaseResponse) SetReqMsgId(v string) *QueryAuditVideobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditVideobaseResponse) SetResultCode(v string) *QueryAuditVideobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditVideobaseResponse) SetResultMsg(v string) *QueryAuditVideobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditVideobaseResponse) SetResult(v string) *QueryAuditVideobaseResponse {
	s.Result = &v
	return s
}

type CallbackAliyunAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回执原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// 回执场景，固定填写 ALIYUN"
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s CallbackAliyunAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAliyunAuditRequest) GoString() string {
	return s.String()
}

func (s *CallbackAliyunAuditRequest) SetAuthToken(v string) *CallbackAliyunAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAliyunAuditRequest) SetProductInstanceId(v string) *CallbackAliyunAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAliyunAuditRequest) SetPayload(v string) *CallbackAliyunAuditRequest {
	s.Payload = &v
	return s
}

func (s *CallbackAliyunAuditRequest) SetBizScene(v string) *CallbackAliyunAuditRequest {
	s.BizScene = &v
	return s
}

type CallbackAliyunAuditResponse struct {
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

func (s CallbackAliyunAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAliyunAuditResponse) GoString() string {
	return s.String()
}

func (s *CallbackAliyunAuditResponse) SetReqMsgId(v string) *CallbackAliyunAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAliyunAuditResponse) SetResultCode(v string) *CallbackAliyunAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAliyunAuditResponse) SetResultMsg(v string) *CallbackAliyunAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAliyunAuditResponse) SetErrorCode(v string) *CallbackAliyunAuditResponse {
	s.ErrorCode = &v
	return s
}

func (s *CallbackAliyunAuditResponse) SetErrorMessage(v string) *CallbackAliyunAuditResponse {
	s.ErrorMessage = &v
	return s
}

type TransferAuditFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户文件路径
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
}

func (s TransferAuditFileRequest) String() string {
	return tea.Prettify(s)
}

func (s TransferAuditFileRequest) GoString() string {
	return s.String()
}

func (s *TransferAuditFileRequest) SetAuthToken(v string) *TransferAuditFileRequest {
	s.AuthToken = &v
	return s
}

func (s *TransferAuditFileRequest) SetProductInstanceId(v string) *TransferAuditFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TransferAuditFileRequest) SetUrl(v string) *TransferAuditFileRequest {
	s.Url = &v
	return s
}

type TransferAuditFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s TransferAuditFileResponse) String() string {
	return tea.Prettify(s)
}

func (s TransferAuditFileResponse) GoString() string {
	return s.String()
}

func (s *TransferAuditFileResponse) SetReqMsgId(v string) *TransferAuditFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TransferAuditFileResponse) SetResultCode(v string) *TransferAuditFileResponse {
	s.ResultCode = &v
	return s
}

func (s *TransferAuditFileResponse) SetResultMsg(v string) *TransferAuditFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *TransferAuditFileResponse) SetResult(v string) *TransferAuditFileResponse {
	s.Result = &v
	return s
}

type DownloadAuditFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
}

func (s DownloadAuditFileRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadAuditFileRequest) GoString() string {
	return s.String()
}

func (s *DownloadAuditFileRequest) SetAuthToken(v string) *DownloadAuditFileRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadAuditFileRequest) SetProductInstanceId(v string) *DownloadAuditFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadAuditFileRequest) SetUrl(v string) *DownloadAuditFileRequest {
	s.Url = &v
	return s
}

type DownloadAuditFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DownloadAuditFileResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadAuditFileResponse) GoString() string {
	return s.String()
}

func (s *DownloadAuditFileResponse) SetReqMsgId(v string) *DownloadAuditFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadAuditFileResponse) SetResultCode(v string) *DownloadAuditFileResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadAuditFileResponse) SetResultMsg(v string) *DownloadAuditFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadAuditFileResponse) SetResult(v string) *DownloadAuditFileResponse {
	s.Result = &v
	return s
}

type QueryAicoguardcloudAdbsinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区域id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// DB实例id
	DbInstanceId *string `json:"db_instance_id,omitempty" xml:"db_instance_id,omitempty" require:"true"`
	// 数据库空间名称
	NameSpace *string `json:"name_space,omitempty" xml:"name_space,omitempty" require:"true"`
	// 数据库空间密码
	NameSpacePassword *string `json:"name_space_password,omitempty" xml:"name_space_password,omitempty" require:"true"`
	// 数据库表名
	CollectionName *string `json:"collection_name,omitempty" xml:"collection_name,omitempty" require:"true"`
	// 查询的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s QueryAicoguardcloudAdbsinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAicoguardcloudAdbsinkRequest) GoString() string {
	return s.String()
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetAuthToken(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetProductInstanceId(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetRegionId(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.RegionId = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetDbInstanceId(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.DbInstanceId = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetNameSpace(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.NameSpace = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetNameSpacePassword(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.NameSpacePassword = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetCollectionName(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.CollectionName = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkRequest) SetContent(v string) *QueryAicoguardcloudAdbsinkRequest {
	s.Content = &v
	return s
}

type QueryAicoguardcloudAdbsinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求的问题
	Question *string `json:"question,omitempty" xml:"question,omitempty"`
	// 代答结果
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 匹配度分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// adb的请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryAicoguardcloudAdbsinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAicoguardcloudAdbsinkResponse) GoString() string {
	return s.String()
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetReqMsgId(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetResultCode(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetResultMsg(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetQuestion(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.Question = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetAnswer(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.Answer = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetScore(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.Score = &v
	return s
}

func (s *QueryAicoguardcloudAdbsinkResponse) SetRequestId(v string) *QueryAicoguardcloudAdbsinkResponse {
	s.RequestId = &v
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

type QueryAicoguardAdbsinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区域id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// DB实例id
	DbInstanceId *string `json:"db_instance_id,omitempty" xml:"db_instance_id,omitempty" require:"true"`
	// 数据库空间名称
	NameSpace *string `json:"name_space,omitempty" xml:"name_space,omitempty" require:"true"`
	// 数据库空间密码
	NameSpacePassword *string `json:"name_space_password,omitempty" xml:"name_space_password,omitempty" require:"true"`
	// 数据库表名
	CollectionName *string `json:"collection_name,omitempty" xml:"collection_name,omitempty" require:"true"`
	// 要查询的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s QueryAicoguardAdbsinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAicoguardAdbsinkRequest) GoString() string {
	return s.String()
}

func (s *QueryAicoguardAdbsinkRequest) SetAuthToken(v string) *QueryAicoguardAdbsinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetProductInstanceId(v string) *QueryAicoguardAdbsinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetRegionId(v string) *QueryAicoguardAdbsinkRequest {
	s.RegionId = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetDbInstanceId(v string) *QueryAicoguardAdbsinkRequest {
	s.DbInstanceId = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetNameSpace(v string) *QueryAicoguardAdbsinkRequest {
	s.NameSpace = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetNameSpacePassword(v string) *QueryAicoguardAdbsinkRequest {
	s.NameSpacePassword = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetCollectionName(v string) *QueryAicoguardAdbsinkRequest {
	s.CollectionName = &v
	return s
}

func (s *QueryAicoguardAdbsinkRequest) SetContent(v string) *QueryAicoguardAdbsinkRequest {
	s.Content = &v
	return s
}

type QueryAicoguardAdbsinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求的问题
	Question *string `json:"question,omitempty" xml:"question,omitempty"`
	// 代答结果
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 匹配度分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// adb的请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryAicoguardAdbsinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAicoguardAdbsinkResponse) GoString() string {
	return s.String()
}

func (s *QueryAicoguardAdbsinkResponse) SetReqMsgId(v string) *QueryAicoguardAdbsinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetResultCode(v string) *QueryAicoguardAdbsinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetResultMsg(v string) *QueryAicoguardAdbsinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetQuestion(v string) *QueryAicoguardAdbsinkResponse {
	s.Question = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetAnswer(v string) *QueryAicoguardAdbsinkResponse {
	s.Answer = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetScore(v string) *QueryAicoguardAdbsinkResponse {
	s.Score = &v
	return s
}

func (s *QueryAicoguardAdbsinkResponse) SetRequestId(v string) *QueryAicoguardAdbsinkResponse {
	s.RequestId = &v
	return s
}

type CallbackGuardAliyunRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回执原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// 回执场景，固定填写 ALIYUN"
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s CallbackGuardAliyunRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackGuardAliyunRequest) GoString() string {
	return s.String()
}

func (s *CallbackGuardAliyunRequest) SetAuthToken(v string) *CallbackGuardAliyunRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackGuardAliyunRequest) SetProductInstanceId(v string) *CallbackGuardAliyunRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackGuardAliyunRequest) SetPayload(v string) *CallbackGuardAliyunRequest {
	s.Payload = &v
	return s
}

func (s *CallbackGuardAliyunRequest) SetBizScene(v string) *CallbackGuardAliyunRequest {
	s.BizScene = &v
	return s
}

type CallbackGuardAliyunResponse struct {
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

func (s CallbackGuardAliyunResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackGuardAliyunResponse) GoString() string {
	return s.String()
}

func (s *CallbackGuardAliyunResponse) SetReqMsgId(v string) *CallbackGuardAliyunResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackGuardAliyunResponse) SetResultCode(v string) *CallbackGuardAliyunResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackGuardAliyunResponse) SetResultMsg(v string) *CallbackGuardAliyunResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackGuardAliyunResponse) SetErrorCode(v string) *CallbackGuardAliyunResponse {
	s.ErrorCode = &v
	return s
}

func (s *CallbackGuardAliyunResponse) SetErrorMessage(v string) *CallbackGuardAliyunResponse {
	s.ErrorMessage = &v
	return s
}

type CallbackGuardItaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回执原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// 回执场景
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
}

func (s CallbackGuardItaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackGuardItaskRequest) GoString() string {
	return s.String()
}

func (s *CallbackGuardItaskRequest) SetAuthToken(v string) *CallbackGuardItaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackGuardItaskRequest) SetProductInstanceId(v string) *CallbackGuardItaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackGuardItaskRequest) SetPayload(v string) *CallbackGuardItaskRequest {
	s.Payload = &v
	return s
}

func (s *CallbackGuardItaskRequest) SetBizScene(v string) *CallbackGuardItaskRequest {
	s.BizScene = &v
	return s
}

type CallbackGuardItaskResponse struct {
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

func (s CallbackGuardItaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackGuardItaskResponse) GoString() string {
	return s.String()
}

func (s *CallbackGuardItaskResponse) SetReqMsgId(v string) *CallbackGuardItaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackGuardItaskResponse) SetResultCode(v string) *CallbackGuardItaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackGuardItaskResponse) SetResultMsg(v string) *CallbackGuardItaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackGuardItaskResponse) SetErrorCode(v string) *CallbackGuardItaskResponse {
	s.ErrorCode = &v
	return s
}

func (s *CallbackGuardItaskResponse) SetErrorMessage(v string) *CallbackGuardItaskResponse {
	s.ErrorMessage = &v
	return s
}

type QueryGuardAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAudioRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardAudioRequest) SetAuthToken(v string) *QueryGuardAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardAudioRequest) SetProductInstanceId(v string) *QueryGuardAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardAudioRequest) SetTaskId(v string) *QueryGuardAudioRequest {
	s.TaskId = &v
	return s
}

type QueryGuardAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAudioResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardAudioResponse) SetReqMsgId(v string) *QueryGuardAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardAudioResponse) SetResultCode(v string) *QueryGuardAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardAudioResponse) SetResultMsg(v string) *QueryGuardAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardAudioResponse) SetResult(v string) *QueryGuardAudioResponse {
	s.Result = &v
	return s
}

type SubmitGuardAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 用于上游标识应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardAudioRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardAudioRequest) SetAuthToken(v string) *SubmitGuardAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetProductInstanceId(v string) *SubmitGuardAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetUrl(v string) *SubmitGuardAudioRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetSceneCode(v string) *SubmitGuardAudioRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetDataId(v string) *SubmitGuardAudioRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetAppCode(v string) *SubmitGuardAudioRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetBusinessId(v string) *SubmitGuardAudioRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetCallback(v string) *SubmitGuardAudioRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardAudioRequest) SetSeed(v string) *SubmitGuardAudioRequest {
	s.Seed = &v
	return s
}

type SubmitGuardAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardAudioResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardAudioResponse) SetReqMsgId(v string) *SubmitGuardAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardAudioResponse) SetResultCode(v string) *SubmitGuardAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardAudioResponse) SetResultMsg(v string) *SubmitGuardAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardAudioResponse) SetTaskId(v string) *SubmitGuardAudioResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardAudioResponse) SetDataId(v string) *SubmitGuardAudioResponse {
	s.DataId = &v
	return s
}

type QueryGuardImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardImageRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardImageRequest) SetAuthToken(v string) *QueryGuardImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardImageRequest) SetProductInstanceId(v string) *QueryGuardImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardImageRequest) SetTaskId(v string) *QueryGuardImageRequest {
	s.TaskId = &v
	return s
}

type QueryGuardImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardImageResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardImageResponse) SetReqMsgId(v string) *QueryGuardImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardImageResponse) SetResultCode(v string) *QueryGuardImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardImageResponse) SetResultMsg(v string) *QueryGuardImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardImageResponse) SetResult(v string) *QueryGuardImageResponse {
	s.Result = &v
	return s
}

type SubmitGuardImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardImageRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardImageRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardImageRequest) SetAuthToken(v string) *SubmitGuardImageRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardImageRequest) SetProductInstanceId(v string) *SubmitGuardImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardImageRequest) SetUrl(v string) *SubmitGuardImageRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardImageRequest) SetSceneCode(v string) *SubmitGuardImageRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardImageRequest) SetDataId(v string) *SubmitGuardImageRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardImageRequest) SetAppCode(v string) *SubmitGuardImageRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardImageRequest) SetBusinessId(v string) *SubmitGuardImageRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardImageRequest) SetCallback(v string) *SubmitGuardImageRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardImageRequest) SetSeed(v string) *SubmitGuardImageRequest {
	s.Seed = &v
	return s
}

type SubmitGuardImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardImageResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardImageResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardImageResponse) SetReqMsgId(v string) *SubmitGuardImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardImageResponse) SetResultCode(v string) *SubmitGuardImageResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardImageResponse) SetResultMsg(v string) *SubmitGuardImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardImageResponse) SetTaskId(v string) *SubmitGuardImageResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardImageResponse) SetDataId(v string) *SubmitGuardImageResponse {
	s.DataId = &v
	return s
}

type QueryGuardTextRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardTextRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardTextRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardTextRequest) SetAuthToken(v string) *QueryGuardTextRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardTextRequest) SetProductInstanceId(v string) *QueryGuardTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardTextRequest) SetTaskId(v string) *QueryGuardTextRequest {
	s.TaskId = &v
	return s
}

type QueryGuardTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文本审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardTextResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardTextResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardTextResponse) SetReqMsgId(v string) *QueryGuardTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardTextResponse) SetResultCode(v string) *QueryGuardTextResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardTextResponse) SetResultMsg(v string) *QueryGuardTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardTextResponse) SetResult(v string) *QueryGuardTextResponse {
	s.Result = &v
	return s
}

type SubmitGuardTextRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 审核场景码，固定输入BASE_TEXT_AUDIT，其他值无效
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardTextRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardTextRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardTextRequest) SetAuthToken(v string) *SubmitGuardTextRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardTextRequest) SetProductInstanceId(v string) *SubmitGuardTextRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardTextRequest) SetContent(v string) *SubmitGuardTextRequest {
	s.Content = &v
	return s
}

func (s *SubmitGuardTextRequest) SetSceneCode(v string) *SubmitGuardTextRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardTextRequest) SetDataId(v string) *SubmitGuardTextRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardTextRequest) SetAppCode(v string) *SubmitGuardTextRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardTextRequest) SetBusinessId(v string) *SubmitGuardTextRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardTextRequest) SetCallback(v string) *SubmitGuardTextRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardTextRequest) SetSeed(v string) *SubmitGuardTextRequest {
	s.Seed = &v
	return s
}

type SubmitGuardTextResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardTextResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardTextResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardTextResponse) SetReqMsgId(v string) *SubmitGuardTextResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardTextResponse) SetResultCode(v string) *SubmitGuardTextResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardTextResponse) SetResultMsg(v string) *SubmitGuardTextResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardTextResponse) SetTaskId(v string) *SubmitGuardTextResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardTextResponse) SetDataId(v string) *SubmitGuardTextResponse {
	s.DataId = &v
	return s
}

type QueryGuardVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardVideoRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardVideoRequest) SetAuthToken(v string) *QueryGuardVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardVideoRequest) SetProductInstanceId(v string) *QueryGuardVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardVideoRequest) SetTaskId(v string) *QueryGuardVideoRequest {
	s.TaskId = &v
	return s
}

type QueryGuardVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardVideoResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardVideoResponse) SetReqMsgId(v string) *QueryGuardVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardVideoResponse) SetResultCode(v string) *QueryGuardVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardVideoResponse) SetResultMsg(v string) *QueryGuardVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardVideoResponse) SetResult(v string) *QueryGuardVideoResponse {
	s.Result = &v
	return s
}

type SubmitGuardVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardVideoRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardVideoRequest) SetAuthToken(v string) *SubmitGuardVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetProductInstanceId(v string) *SubmitGuardVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetUrl(v string) *SubmitGuardVideoRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetSceneCode(v string) *SubmitGuardVideoRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetDataId(v string) *SubmitGuardVideoRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetAppCode(v string) *SubmitGuardVideoRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetBusinessId(v string) *SubmitGuardVideoRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetCallback(v string) *SubmitGuardVideoRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardVideoRequest) SetSeed(v string) *SubmitGuardVideoRequest {
	s.Seed = &v
	return s
}

type SubmitGuardVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardVideoResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardVideoResponse) SetReqMsgId(v string) *SubmitGuardVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardVideoResponse) SetResultCode(v string) *SubmitGuardVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardVideoResponse) SetResultMsg(v string) *SubmitGuardVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardVideoResponse) SetTaskId(v string) *SubmitGuardVideoResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardVideoResponse) SetDataId(v string) *SubmitGuardVideoResponse {
	s.DataId = &v
	return s
}

type QueryGuardAudiobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardAudiobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAudiobaseRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardAudiobaseRequest) SetAuthToken(v string) *QueryGuardAudiobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardAudiobaseRequest) SetProductInstanceId(v string) *QueryGuardAudiobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardAudiobaseRequest) SetTaskId(v string) *QueryGuardAudiobaseRequest {
	s.TaskId = &v
	return s
}

type QueryGuardAudiobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频机审结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardAudiobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAudiobaseResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardAudiobaseResponse) SetReqMsgId(v string) *QueryGuardAudiobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardAudiobaseResponse) SetResultCode(v string) *QueryGuardAudiobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardAudiobaseResponse) SetResultMsg(v string) *QueryGuardAudiobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardAudiobaseResponse) SetResult(v string) *QueryGuardAudiobaseResponse {
	s.Result = &v
	return s
}

type SubmitGuardAudiobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景类型 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardAudiobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardAudiobaseRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardAudiobaseRequest) SetAuthToken(v string) *SubmitGuardAudiobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetProductInstanceId(v string) *SubmitGuardAudiobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetUrl(v string) *SubmitGuardAudiobaseRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetSceneCode(v string) *SubmitGuardAudiobaseRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetDataId(v string) *SubmitGuardAudiobaseRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetAppCode(v string) *SubmitGuardAudiobaseRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetBusinessId(v string) *SubmitGuardAudiobaseRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetCallback(v string) *SubmitGuardAudiobaseRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardAudiobaseRequest) SetSeed(v string) *SubmitGuardAudiobaseRequest {
	s.Seed = &v
	return s
}

type SubmitGuardAudiobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardAudiobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardAudiobaseResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardAudiobaseResponse) SetReqMsgId(v string) *SubmitGuardAudiobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardAudiobaseResponse) SetResultCode(v string) *SubmitGuardAudiobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardAudiobaseResponse) SetResultMsg(v string) *SubmitGuardAudiobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardAudiobaseResponse) SetTaskId(v string) *SubmitGuardAudiobaseResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardAudiobaseResponse) SetDataId(v string) *SubmitGuardAudiobaseResponse {
	s.DataId = &v
	return s
}

type ApplyGuardImagebaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 场景，固定填写：BASE_IMAGE_SEC
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 数据Id，调用方入审数据的唯一Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s ApplyGuardImagebaseRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImagebaseRequest) GoString() string {
	return s.String()
}

func (s *ApplyGuardImagebaseRequest) SetAuthToken(v string) *ApplyGuardImagebaseRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetProductInstanceId(v string) *ApplyGuardImagebaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetUrl(v string) *ApplyGuardImagebaseRequest {
	s.Url = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetSceneCode(v string) *ApplyGuardImagebaseRequest {
	s.SceneCode = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetDataId(v string) *ApplyGuardImagebaseRequest {
	s.DataId = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetAppCode(v string) *ApplyGuardImagebaseRequest {
	s.AppCode = &v
	return s
}

func (s *ApplyGuardImagebaseRequest) SetBusinessId(v string) *ApplyGuardImagebaseRequest {
	s.BusinessId = &v
	return s
}

type ApplyGuardImagebaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片机审结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyGuardImagebaseResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImagebaseResponse) GoString() string {
	return s.String()
}

func (s *ApplyGuardImagebaseResponse) SetReqMsgId(v string) *ApplyGuardImagebaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyGuardImagebaseResponse) SetResultCode(v string) *ApplyGuardImagebaseResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyGuardImagebaseResponse) SetResultMsg(v string) *ApplyGuardImagebaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyGuardImagebaseResponse) SetResult(v string) *ApplyGuardImagebaseResponse {
	s.Result = &v
	return s
}

type ApplyGuardImageadvancedRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 场景，固定填写：ADVANCED_IMAGE_SEC
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 数据Id，调用方入审数据的唯一Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s ApplyGuardImageadvancedRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImageadvancedRequest) GoString() string {
	return s.String()
}

func (s *ApplyGuardImageadvancedRequest) SetAuthToken(v string) *ApplyGuardImageadvancedRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetProductInstanceId(v string) *ApplyGuardImageadvancedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetUrl(v string) *ApplyGuardImageadvancedRequest {
	s.Url = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetSceneCode(v string) *ApplyGuardImageadvancedRequest {
	s.SceneCode = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetDataId(v string) *ApplyGuardImageadvancedRequest {
	s.DataId = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetAppCode(v string) *ApplyGuardImageadvancedRequest {
	s.AppCode = &v
	return s
}

func (s *ApplyGuardImageadvancedRequest) SetBusinessId(v string) *ApplyGuardImageadvancedRequest {
	s.BusinessId = &v
	return s
}

type ApplyGuardImageadvancedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片审核增强版结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyGuardImageadvancedResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImageadvancedResponse) GoString() string {
	return s.String()
}

func (s *ApplyGuardImageadvancedResponse) SetReqMsgId(v string) *ApplyGuardImageadvancedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyGuardImageadvancedResponse) SetResultCode(v string) *ApplyGuardImageadvancedResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyGuardImageadvancedResponse) SetResultMsg(v string) *ApplyGuardImageadvancedResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyGuardImageadvancedResponse) SetResult(v string) *ApplyGuardImageadvancedResponse {
	s.Result = &v
	return s
}

type ApplyGuardTextbaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	//
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
}

func (s ApplyGuardTextbaseRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardTextbaseRequest) GoString() string {
	return s.String()
}

func (s *ApplyGuardTextbaseRequest) SetAuthToken(v string) *ApplyGuardTextbaseRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetProductInstanceId(v string) *ApplyGuardTextbaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetContent(v string) *ApplyGuardTextbaseRequest {
	s.Content = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetSceneCode(v string) *ApplyGuardTextbaseRequest {
	s.SceneCode = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetDataId(v string) *ApplyGuardTextbaseRequest {
	s.DataId = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetAppCode(v string) *ApplyGuardTextbaseRequest {
	s.AppCode = &v
	return s
}

func (s *ApplyGuardTextbaseRequest) SetBusinessId(v string) *ApplyGuardTextbaseRequest {
	s.BusinessId = &v
	return s
}

type ApplyGuardTextbaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文本同步审核结果，字段含义见：TextSyncAuditResult
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyGuardTextbaseResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardTextbaseResponse) GoString() string {
	return s.String()
}

func (s *ApplyGuardTextbaseResponse) SetReqMsgId(v string) *ApplyGuardTextbaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyGuardTextbaseResponse) SetResultCode(v string) *ApplyGuardTextbaseResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyGuardTextbaseResponse) SetResultMsg(v string) *ApplyGuardTextbaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyGuardTextbaseResponse) SetResult(v string) *ApplyGuardTextbaseResponse {
	s.Result = &v
	return s
}

type QueryGuardVideobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardVideobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardVideobaseRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardVideobaseRequest) SetAuthToken(v string) *QueryGuardVideobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardVideobaseRequest) SetProductInstanceId(v string) *QueryGuardVideobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardVideobaseRequest) SetTaskId(v string) *QueryGuardVideobaseRequest {
	s.TaskId = &v
	return s
}

type QueryGuardVideobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频机审结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardVideobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardVideobaseResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardVideobaseResponse) SetReqMsgId(v string) *QueryGuardVideobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardVideobaseResponse) SetResultCode(v string) *QueryGuardVideobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardVideobaseResponse) SetResultMsg(v string) *QueryGuardVideobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardVideobaseResponse) SetResult(v string) *QueryGuardVideobaseResponse {
	s.Result = &v
	return s
}

type SubmitGuardVideobaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 视频文件链接支持以下协议：HTTP和HTTPS。 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景类型 目前支持通用版 BASE_VIDEO_SEC
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardVideobaseRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardVideobaseRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardVideobaseRequest) SetAuthToken(v string) *SubmitGuardVideobaseRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetProductInstanceId(v string) *SubmitGuardVideobaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetUrl(v string) *SubmitGuardVideobaseRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetSceneCode(v string) *SubmitGuardVideobaseRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetDataId(v string) *SubmitGuardVideobaseRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetAppCode(v string) *SubmitGuardVideobaseRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetBusinessId(v string) *SubmitGuardVideobaseRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetCallback(v string) *SubmitGuardVideobaseRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardVideobaseRequest) SetSeed(v string) *SubmitGuardVideobaseRequest {
	s.Seed = &v
	return s
}

type SubmitGuardVideobaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardVideobaseResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardVideobaseResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardVideobaseResponse) SetReqMsgId(v string) *SubmitGuardVideobaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardVideobaseResponse) SetResultCode(v string) *SubmitGuardVideobaseResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardVideobaseResponse) SetResultMsg(v string) *SubmitGuardVideobaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardVideobaseResponse) SetTaskId(v string) *SubmitGuardVideobaseResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardVideobaseResponse) SetDataId(v string) *SubmitGuardVideobaseResponse {
	s.DataId = &v
	return s
}

type ApplyGuardImagemultiplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景，固定填写：SCENE_MULTIPLY_IMAGE_SEC
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 数据Id，调用方入审数据的唯一Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 鉴定图片内容链接，url 和 content 参数二选一
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线...
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 鉴定图片 base64 地址，url 和 content 参数二选一
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ApplyGuardImagemultiplyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImagemultiplyRequest) GoString() string {
	return s.String()
}

func (s *ApplyGuardImagemultiplyRequest) SetAuthToken(v string) *ApplyGuardImagemultiplyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetProductInstanceId(v string) *ApplyGuardImagemultiplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetSceneCode(v string) *ApplyGuardImagemultiplyRequest {
	s.SceneCode = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetDataId(v string) *ApplyGuardImagemultiplyRequest {
	s.DataId = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetUrl(v string) *ApplyGuardImagemultiplyRequest {
	s.Url = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetAppCode(v string) *ApplyGuardImagemultiplyRequest {
	s.AppCode = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetBusinessId(v string) *ApplyGuardImagemultiplyRequest {
	s.BusinessId = &v
	return s
}

func (s *ApplyGuardImagemultiplyRequest) SetContent(v string) *ApplyGuardImagemultiplyRequest {
	s.Content = &v
	return s
}

type ApplyGuardImagemultiplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 光鉴检测结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ApplyGuardImagemultiplyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyGuardImagemultiplyResponse) GoString() string {
	return s.String()
}

func (s *ApplyGuardImagemultiplyResponse) SetReqMsgId(v string) *ApplyGuardImagemultiplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyGuardImagemultiplyResponse) SetResultCode(v string) *ApplyGuardImagemultiplyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyGuardImagemultiplyResponse) SetResultMsg(v string) *ApplyGuardImagemultiplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyGuardImagemultiplyResponse) SetResult(v string) *ApplyGuardImagemultiplyResponse {
	s.Result = &v
	return s
}

type CheckGuardAnswerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方标识
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 细分调用方标识，可与 appCode 传相同值
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 文本内容，最大5000字符长度
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 场景code：
	// ● llm_output_detection：大模型输出通用场景
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 是否开启流式检测功能。默认值：N：不开启
	// Y：开启
	// N：不开启
	FlowDetect *string `json:"flow_detect,omitempty" xml:"flow_detect,omitempty"`
	// 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
	// Y：开启
	// N：不开启
	ReplyProxy *string `json:"reply_proxy,omitempty" xml:"reply_proxy,omitempty"`
	// 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
	// Y：开启
	// N：不开启
	PrivacyDataObfuscation *string `json:"privacy_data_obfuscation,omitempty" xml:"privacy_data_obfuscation,omitempty"`
}

func (s CheckGuardAnswerRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckGuardAnswerRequest) GoString() string {
	return s.String()
}

func (s *CheckGuardAnswerRequest) SetAuthToken(v string) *CheckGuardAnswerRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetProductInstanceId(v string) *CheckGuardAnswerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetAppCode(v string) *CheckGuardAnswerRequest {
	s.AppCode = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetBusinessId(v string) *CheckGuardAnswerRequest {
	s.BusinessId = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetContent(v string) *CheckGuardAnswerRequest {
	s.Content = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetSceneCode(v string) *CheckGuardAnswerRequest {
	s.SceneCode = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetFlowDetect(v string) *CheckGuardAnswerRequest {
	s.FlowDetect = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetSessionId(v string) *CheckGuardAnswerRequest {
	s.SessionId = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetReplyProxy(v string) *CheckGuardAnswerRequest {
	s.ReplyProxy = &v
	return s
}

func (s *CheckGuardAnswerRequest) SetPrivacyDataObfuscation(v string) *CheckGuardAnswerRequest {
	s.PrivacyDataObfuscation = &v
	return s
}

type CheckGuardAnswerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文本审核结果。返回结果中包含一个需自行转换的Json字符串
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CheckGuardAnswerResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckGuardAnswerResponse) GoString() string {
	return s.String()
}

func (s *CheckGuardAnswerResponse) SetReqMsgId(v string) *CheckGuardAnswerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckGuardAnswerResponse) SetResultCode(v string) *CheckGuardAnswerResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckGuardAnswerResponse) SetResultMsg(v string) *CheckGuardAnswerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckGuardAnswerResponse) SetResult(v string) *CheckGuardAnswerResponse {
	s.Result = &v
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
				"sdk_version":      tea.String("1.1.19"),
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
 * Description: 同步接口，只调用机审能力
 * Summary: 图片机审基础版
 */
func (client *Client) ApplyAuditImagebase(request *ApplyAuditImagebaseRequest) (_result *ApplyAuditImagebaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAuditImagebaseResponse{}
	_body, _err := client.ApplyAuditImagebaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步接口，只调用机审能力
 * Summary: 图片机审基础版
 */
func (client *Client) ApplyAuditImagebaseEx(request *ApplyAuditImagebaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAuditImagebaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAuditImagebaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.imagebase.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步接口，只调用机审能力
 * Summary: 图片审核增强版
 */
func (client *Client) ApplyAuditImageadvanced(request *ApplyAuditImageadvancedRequest) (_result *ApplyAuditImageadvancedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAuditImageadvancedResponse{}
	_body, _err := client.ApplyAuditImageadvancedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步接口，只调用机审能力
 * Summary: 图片审核增强版
 */
func (client *Client) ApplyAuditImageadvancedEx(request *ApplyAuditImageadvancedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAuditImageadvancedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAuditImageadvancedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.imageadvanced.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步接口，只调用机审能力
 * Summary: 音频审核通用版入审
 */
func (client *Client) SubmitAuditAudiobase(request *SubmitAuditAudiobaseRequest) (_result *SubmitAuditAudiobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditAudiobaseResponse{}
	_body, _err := client.SubmitAuditAudiobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步接口，只调用机审能力
 * Summary: 音频审核通用版入审
 */
func (client *Client) SubmitAuditAudiobaseEx(request *SubmitAuditAudiobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditAudiobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditAudiobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.audiobase.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步接口，只调用机审能力
 * Summary: 音频审核通用版查询
 */
func (client *Client) QueryAuditAudiobase(request *QueryAuditAudiobaseRequest) (_result *QueryAuditAudiobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditAudiobaseResponse{}
	_body, _err := client.QueryAuditAudiobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步接口，只调用机审能力
 * Summary: 音频审核通用版查询
 */
func (client *Client) QueryAuditAudiobaseEx(request *QueryAuditAudiobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditAudiobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditAudiobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.audiobase.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步通知，只调用机审能力
 * Summary: 视频审核通用版入审
 */
func (client *Client) SubmitAuditVideobase(request *SubmitAuditVideobaseRequest) (_result *SubmitAuditVideobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditVideobaseResponse{}
	_body, _err := client.SubmitAuditVideobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步通知，只调用机审能力
 * Summary: 视频审核通用版入审
 */
func (client *Client) SubmitAuditVideobaseEx(request *SubmitAuditVideobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditVideobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditVideobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.videobase.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步查询
 * Summary: 视频审核通用版查询
 */
func (client *Client) QueryAuditVideobase(request *QueryAuditVideobaseRequest) (_result *QueryAuditVideobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditVideobaseResponse{}
	_body, _err := client.QueryAuditVideobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步查询
 * Summary: 视频审核通用版查询
 */
func (client *Client) QueryAuditVideobaseEx(request *QueryAuditVideobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditVideobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditVideobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.videobase.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
 * Summary: 阿里云内容审核回调
 */
func (client *Client) CallbackAliyunAudit(request *CallbackAliyunAuditRequest) (_result *CallbackAliyunAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAliyunAuditResponse{}
	_body, _err := client.CallbackAliyunAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
 * Summary: 阿里云内容审核回调
 */
func (client *Client) CallbackAliyunAuditEx(request *CallbackAliyunAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAliyunAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAliyunAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.aliyun.audit.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部文件转存
 * Summary: 文件转存接口
 */
func (client *Client) TransferAuditFile(request *TransferAuditFileRequest) (_result *TransferAuditFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TransferAuditFileResponse{}
	_body, _err := client.TransferAuditFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部文件转存
 * Summary: 文件转存接口
 */
func (client *Client) TransferAuditFileEx(request *TransferAuditFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TransferAuditFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TransferAuditFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.file.transfer"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件下载接口
 * Summary: 文件下载接口
 */
func (client *Client) DownloadAuditFile(request *DownloadAuditFileRequest) (_result *DownloadAuditFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadAuditFileResponse{}
	_body, _err := client.DownloadAuditFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件下载接口
 * Summary: 文件下载接口
 */
func (client *Client) DownloadAuditFileEx(request *DownloadAuditFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadAuditFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadAuditFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.file.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云ADB调用接口
 * Summary: 阿里云ADB调用接口
 */
func (client *Client) QueryAicoguardcloudAdbsink(request *QueryAicoguardcloudAdbsinkRequest) (_result *QueryAicoguardcloudAdbsinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAicoguardcloudAdbsinkResponse{}
	_body, _err := client.QueryAicoguardcloudAdbsinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云ADB调用接口
 * Summary: 阿里云ADB调用接口
 */
func (client *Client) QueryAicoguardcloudAdbsinkEx(request *QueryAicoguardcloudAdbsinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAicoguardcloudAdbsinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAicoguardcloudAdbsinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.aicoguardcloud.adbsink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 阿里云ADB调用接口
 * Summary: 阿里云ADB调用接口
 */
func (client *Client) QueryAicoguardAdbsink(request *QueryAicoguardAdbsinkRequest) (_result *QueryAicoguardAdbsinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAicoguardAdbsinkResponse{}
	_body, _err := client.QueryAicoguardAdbsinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云ADB调用接口
 * Summary: 阿里云ADB调用接口
 */
func (client *Client) QueryAicoguardAdbsinkEx(request *QueryAicoguardAdbsinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAicoguardAdbsinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAicoguardAdbsinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.aicoguard.adbsink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
 * Summary: 阿里云内容安全回调
 */
func (client *Client) CallbackGuardAliyun(request *CallbackGuardAliyunRequest) (_result *CallbackGuardAliyunResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackGuardAliyunResponse{}
	_body, _err := client.CallbackGuardAliyunEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
 * Summary: 阿里云内容安全回调
 */
func (client *Client) CallbackGuardAliyunEx(request *CallbackGuardAliyunRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackGuardAliyunResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackGuardAliyunResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.aliyun.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 主站ITASK审核能力回调
 * Summary: 主站ITASK审核能力回调
 */
func (client *Client) CallbackGuardItask(request *CallbackGuardItaskRequest) (_result *CallbackGuardItaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackGuardItaskResponse{}
	_body, _err := client.CallbackGuardItaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 主站ITASK审核能力回调
 * Summary: 主站ITASK审核能力回调
 */
func (client *Client) CallbackGuardItaskEx(request *CallbackGuardItaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackGuardItaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackGuardItaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.itask.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频人审查询
 * Summary: 音频人审查询
 */
func (client *Client) QueryGuardAudio(request *QueryGuardAudioRequest) (_result *QueryGuardAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardAudioResponse{}
	_body, _err := client.QueryGuardAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频人审查询
 * Summary: 音频人审查询
 */
func (client *Client) QueryGuardAudioEx(request *QueryGuardAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.audio.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频人审入审
 * Summary: 音频人审入审
 */
func (client *Client) SubmitGuardAudio(request *SubmitGuardAudioRequest) (_result *SubmitGuardAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardAudioResponse{}
	_body, _err := client.SubmitGuardAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频人审入审
 * Summary: 音频人审入审
 */
func (client *Client) SubmitGuardAudioEx(request *SubmitGuardAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.audio.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片人审查询
 * Summary: 图片人审查询
 */
func (client *Client) QueryGuardImage(request *QueryGuardImageRequest) (_result *QueryGuardImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardImageResponse{}
	_body, _err := client.QueryGuardImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片人审查询
 * Summary: 图片人审查询
 */
func (client *Client) QueryGuardImageEx(request *QueryGuardImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片人审入审
 * Summary: 图片人审入审
 */
func (client *Client) SubmitGuardImage(request *SubmitGuardImageRequest) (_result *SubmitGuardImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardImageResponse{}
	_body, _err := client.SubmitGuardImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片人审入审
 * Summary: 图片人审入审
 */
func (client *Client) SubmitGuardImageEx(request *SubmitGuardImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.image.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本人审查询
 * Summary: 文本人审查询
 */
func (client *Client) QueryGuardText(request *QueryGuardTextRequest) (_result *QueryGuardTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardTextResponse{}
	_body, _err := client.QueryGuardTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本人审查询
 * Summary: 文本人审查询
 */
func (client *Client) QueryGuardTextEx(request *QueryGuardTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.text.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本人审提交
 * Summary: 文本人审提交
 */
func (client *Client) SubmitGuardText(request *SubmitGuardTextRequest) (_result *SubmitGuardTextResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardTextResponse{}
	_body, _err := client.SubmitGuardTextEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本人审提交
 * Summary: 文本人审提交
 */
func (client *Client) SubmitGuardTextEx(request *SubmitGuardTextRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardTextResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardTextResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.text.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频人审查询
 * Summary: 视频人审查询
 */
func (client *Client) QueryGuardVideo(request *QueryGuardVideoRequest) (_result *QueryGuardVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardVideoResponse{}
	_body, _err := client.QueryGuardVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频人审查询
 * Summary: 视频人审查询
 */
func (client *Client) QueryGuardVideoEx(request *QueryGuardVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.video.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频人审提交
 * Summary: 视频人审提交
 */
func (client *Client) SubmitGuardVideo(request *SubmitGuardVideoRequest) (_result *SubmitGuardVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardVideoResponse{}
	_body, _err := client.SubmitGuardVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频人审提交
 * Summary: 视频人审提交
 */
func (client *Client) SubmitGuardVideoEx(request *SubmitGuardVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.video.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频机审查询-基础版
 * Summary: 音频机审查询-基础版
 */
func (client *Client) QueryGuardAudiobase(request *QueryGuardAudiobaseRequest) (_result *QueryGuardAudiobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardAudiobaseResponse{}
	_body, _err := client.QueryGuardAudiobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频机审查询-基础版
 * Summary: 音频机审查询-基础版
 */
func (client *Client) QueryGuardAudiobaseEx(request *QueryGuardAudiobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardAudiobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardAudiobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.audiobase.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 音频机审入审-基础版
 * Summary: 音频机审入审-基础版
 */
func (client *Client) SubmitGuardAudiobase(request *SubmitGuardAudiobaseRequest) (_result *SubmitGuardAudiobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardAudiobaseResponse{}
	_body, _err := client.SubmitGuardAudiobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 音频机审入审-基础版
 * Summary: 音频机审入审-基础版
 */
func (client *Client) SubmitGuardAudiobaseEx(request *SubmitGuardAudiobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardAudiobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardAudiobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.audiobase.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片机审申请-基础版
 * Summary: 图片机审申请-基础版
 */
func (client *Client) ApplyGuardImagebase(request *ApplyGuardImagebaseRequest) (_result *ApplyGuardImagebaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyGuardImagebaseResponse{}
	_body, _err := client.ApplyGuardImagebaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片机审申请-基础版
 * Summary: 图片机审申请-基础版
 */
func (client *Client) ApplyGuardImagebaseEx(request *ApplyGuardImagebaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyGuardImagebaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyGuardImagebaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.imagebase.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 图片机审申请-增强版
 * Summary: 图片机审申请-增强版
 */
func (client *Client) ApplyGuardImageadvanced(request *ApplyGuardImageadvancedRequest) (_result *ApplyGuardImageadvancedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyGuardImageadvancedResponse{}
	_body, _err := client.ApplyGuardImageadvancedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 图片机审申请-增强版
 * Summary: 图片机审申请-增强版
 */
func (client *Client) ApplyGuardImageadvancedEx(request *ApplyGuardImageadvancedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyGuardImageadvancedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyGuardImageadvancedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.imageadvanced.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文本机审申请-基础版
 * Summary: 文本机审申请-基础版
 */
func (client *Client) ApplyGuardTextbase(request *ApplyGuardTextbaseRequest) (_result *ApplyGuardTextbaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyGuardTextbaseResponse{}
	_body, _err := client.ApplyGuardTextbaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文本机审申请-基础版
 * Summary: 文本机审申请-基础版
 */
func (client *Client) ApplyGuardTextbaseEx(request *ApplyGuardTextbaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyGuardTextbaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyGuardTextbaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.textbase.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频机审查询-基础版
 * Summary: 视频机审查询-基础版
 */
func (client *Client) QueryGuardVideobase(request *QueryGuardVideobaseRequest) (_result *QueryGuardVideobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardVideobaseResponse{}
	_body, _err := client.QueryGuardVideobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频机审查询-基础版
 * Summary: 视频机审查询-基础版
 */
func (client *Client) QueryGuardVideobaseEx(request *QueryGuardVideobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardVideobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardVideobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.videobase.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 视频机审提交-基础版
 * Summary: 视频机审提交-基础版
 */
func (client *Client) SubmitGuardVideobase(request *SubmitGuardVideobaseRequest) (_result *SubmitGuardVideobaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardVideobaseResponse{}
	_body, _err := client.SubmitGuardVideobaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 视频机审提交-基础版
 * Summary: 视频机审提交-基础版
 */
func (client *Client) SubmitGuardVideobaseEx(request *SubmitGuardVideobaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardVideobaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardVideobaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.videobase.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于身份证、个人信息识别、防伪等
 * Summary: 图片光鉴识别链路
 */
func (client *Client) ApplyGuardImagemultiply(request *ApplyGuardImagemultiplyRequest) (_result *ApplyGuardImagemultiplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyGuardImagemultiplyResponse{}
	_body, _err := client.ApplyGuardImagemultiplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于身份证、个人信息识别、防伪等
 * Summary: 图片光鉴识别链路
 */
func (client *Client) ApplyGuardImagemultiplyEx(request *ApplyGuardImagemultiplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyGuardImagemultiplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyGuardImagemultiplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.imagemultiply.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输出文本风险检测
 * Summary: 输出文本风险检测
 */
func (client *Client) CheckGuardAnswer(request *CheckGuardAnswerRequest) (_result *CheckGuardAnswerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckGuardAnswerResponse{}
	_body, _err := client.CheckGuardAnswerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输出文本风险检测
 * Summary: 输出文本风险检测
 */
func (client *Client) CheckGuardAnswerEx(request *CheckGuardAnswerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckGuardAnswerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckGuardAnswerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.answer.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
