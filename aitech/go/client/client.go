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
				"sdk_version":      tea.String("1.1.10"),
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
