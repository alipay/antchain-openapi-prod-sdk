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

// 二维码详情
type QRCodeDetail struct {
	// 位置，Top、Left、Width、Height
	Location []*int64 `json:"location,omitempty" xml:"location,omitempty" require:"true" type:"Repeated"`
	// 二维码类型
	// example:
	//
	// 二维码类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 二维码内容
	// example:
	//
	// 二维码内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 置信度
	// example:
	//
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
	// example:
	//
	// LOGO类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 置信度
	// example:
	//
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
	// example:
	//
	// 123123
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 请求ID
	// example:
	//
	// 4564546
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 会话ID
	// example:
	//
	// 312414124
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 应答内容
	// example:
	//
	// 你可以问我信息安全的问题
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty" require:"true"`
	// 应答内容格式
	// example:
	//
	// PLAINTEXT
	AnswerFormat *string `json:"answer_format,omitempty" xml:"answer_format,omitempty" require:"true"`
	// 是否回答结束
	// example:
	//
	// true, false
	AnswerEnd *bool `json:"answer_end,omitempty" xml:"answer_end,omitempty" require:"true"`
	// 是否问题有风险
	// example:
	//
	// true, false
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

// 审核同步标签列表
type AuditSyncLabel struct {
	// 标签名：sex-色情
	// example:
	//
	// sex
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// 检测到单个风险标签的置信度：66.25
	// example:
	//
	// 66.25
	Probability *int64 `json:"probability,omitempty" xml:"probability,omitempty" require:"true"`
	// 风险标签说明
	// example:
	//
	// 疑似色情内容
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
	// example:
	//
	// AA,BB,CC
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

// 攻击手法二级标签
type AttackSubLabel struct {
	// 提示词攻击手法二级标签
	// example:
	//
	// role_play：角色扮演
	AttackSubLabel *string `json:"attack_sub_label,omitempty" xml:"attack_sub_label,omitempty"`
}

func (s AttackSubLabel) String() string {
	return tea.Prettify(s)
}

func (s AttackSubLabel) GoString() string {
	return s.String()
}

func (s *AttackSubLabel) SetAttackSubLabel(v string) *AttackSubLabel {
	s.AttackSubLabel = &v
	return s
}

// 主题信息
type MeiyouTopicWebInfo struct {
	// 内容文本
	// example:
	//
	// 内容文本
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 当前楼层
	// example:
	//
	// 1
	CurrentFloor *int64 `json:"current_floor,omitempty" xml:"current_floor,omitempty"`
	// 回复楼层
	// example:
	//
	// 1
	CallBackFloor *int64 `json:"call_back_floor,omitempty" xml:"call_back_floor,omitempty"`
	// 发布时间戳(毫秒)
	//
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 图片URL数组(JSON字符串)
	// example:
	//
	// {}
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 用户昵称
	// example:
	//
	// a
	UserNickname *string `json:"user_nickname,omitempty" xml:"user_nickname,omitempty"`
	// 用户ID
	// example:
	//
	// 1
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户类型
	//
	// example:
	//
	// q
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 用户头像URL
	// example:
	//
	// http://test
	UserAvatar *string `json:"user_avatar,omitempty" xml:"user_avatar,omitempty"`
	// 主题ID
	// example:
	//
	// 1
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// 回复楼信息
	// example:
	//
	// test
	CallBackFloorContent *string `json:"call_back_floor_content,omitempty" xml:"call_back_floor_content,omitempty"`
	// oss存储地址
	// example:
	//
	// {}
	OssImages *string `json:"oss_images,omitempty" xml:"oss_images,omitempty"`
}

func (s MeiyouTopicWebInfo) String() string {
	return tea.Prettify(s)
}

func (s MeiyouTopicWebInfo) GoString() string {
	return s.String()
}

func (s *MeiyouTopicWebInfo) SetContent(v string) *MeiyouTopicWebInfo {
	s.Content = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetCurrentFloor(v int64) *MeiyouTopicWebInfo {
	s.CurrentFloor = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetCallBackFloor(v int64) *MeiyouTopicWebInfo {
	s.CallBackFloor = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetPublishTime(v int64) *MeiyouTopicWebInfo {
	s.PublishTime = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetImages(v string) *MeiyouTopicWebInfo {
	s.Images = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetUserNickname(v string) *MeiyouTopicWebInfo {
	s.UserNickname = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetUserId(v string) *MeiyouTopicWebInfo {
	s.UserId = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetUserType(v string) *MeiyouTopicWebInfo {
	s.UserType = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetUserAvatar(v string) *MeiyouTopicWebInfo {
	s.UserAvatar = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetTopicId(v int64) *MeiyouTopicWebInfo {
	s.TopicId = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetCallBackFloorContent(v string) *MeiyouTopicWebInfo {
	s.CallBackFloorContent = &v
	return s
}

func (s *MeiyouTopicWebInfo) SetOssImages(v string) *MeiyouTopicWebInfo {
	s.OssImages = &v
	return s
}

// maya流式响应结果
type MayaStreamResult struct {
	// maya响应数据
	Data *MayaRedGptResponseDTO `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 是否成功
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 错误码
	// example:
	//
	// 10002
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 错误信息
	// example:
	//
	// maya平台调用失败
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

// 二级标签结构
type SubLabelModel struct {
	// 二级标签
	// example:
	//
	// 正常
	SubLabel *string `json:"sub_label,omitempty" xml:"sub_label,omitempty" require:"true"`
	// 风险关键词列表
	RiskWords []*string `json:"risk_words,omitempty" xml:"risk_words,omitempty" type:"Repeated"`
	// 风险关键词索引列表
	RiskWordsIndex []*string `json:"risk_words_index,omitempty" xml:"risk_words_index,omitempty" type:"Repeated"`
	// 三级标签列表
	ThirdLabels []*string `json:"third_labels,omitempty" xml:"third_labels,omitempty" type:"Repeated"`
}

func (s SubLabelModel) String() string {
	return tea.Prettify(s)
}

func (s SubLabelModel) GoString() string {
	return s.String()
}

func (s *SubLabelModel) SetSubLabel(v string) *SubLabelModel {
	s.SubLabel = &v
	return s
}

func (s *SubLabelModel) SetRiskWords(v []*string) *SubLabelModel {
	s.RiskWords = v
	return s
}

func (s *SubLabelModel) SetRiskWordsIndex(v []*string) *SubLabelModel {
	s.RiskWordsIndex = v
	return s
}

func (s *SubLabelModel) SetThirdLabels(v []*string) *SubLabelModel {
	s.ThirdLabels = v
	return s
}

// 提示词攻击手法二级标签
type AttackSubLabelModel struct {
	// 提示词攻击手法二级标签
	// example:
	//
	// jailbreak_attack
	AttackSubLabel *string `json:"attack_sub_label,omitempty" xml:"attack_sub_label,omitempty"`
}

func (s AttackSubLabelModel) String() string {
	return tea.Prettify(s)
}

func (s AttackSubLabelModel) GoString() string {
	return s.String()
}

func (s *AttackSubLabelModel) SetAttackSubLabel(v string) *AttackSubLabelModel {
	s.AttackSubLabel = &v
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

// 图像排黑排白检测结果
type ImageBlackWhiteResult struct {
	// 是否命中（任一维度命中即 true）
	// example:
	//
	// true
	Matched *bool `json:"matched,omitempty" xml:"matched,omitempty"`
	// 命中名单类型：BLACK / WHITE
	// example:
	//
	// WHITE
	MatchType *string `json:"match_type,omitempty" xml:"match_type,omitempty"`
	// 命中向量来源：FULL_IMAGE / FACE
	// example:
	//
	// FULL_IMAGE
	MatchSource *string `json:"match_source,omitempty" xml:"match_source,omitempty"`
	// 命中得分（ES 返回 score 经归一化后值）
	// example:
	//
	// 1.1
	MatchScore *int64 `json:"match_score,omitempty" xml:"match_score,omitempty"`
	// 命中所用阈值
	// example:
	//
	// 1.1
	MatchThreshold *int64 `json:"match_threshold,omitempty" xml:"match_threshold,omitempty"`
	// 命中图片 id
	// example:
	//
	// 1
	MatchedImageId *string `json:"matched_image_id,omitempty" xml:"matched_image_id,omitempty"`
	// 命中图库名称
	// example:
	//
	// test
	MatchedLibraryName *string `json:"matched_library_name,omitempty" xml:"matched_library_name,omitempty"`
	// 是否执行了全图维度（存在启用的全图库）
	// example:
	//
	// true
	ExecutedFullImage *bool `json:"executed_full_image,omitempty" xml:"executed_full_image,omitempty"`
	// 是否执行了人脸维度（存在启用的人脸库）
	// example:
	//
	// true
	ExecutedFace *bool `json:"executed_face,omitempty" xml:"executed_face,omitempty"`
	// 人脸检测结果（YuNet）：null 表示未执行人脸维度
	// example:
	//
	// true
	FaceDetected *bool `json:"face_detected,omitempty" xml:"face_detected,omitempty"`
	// 全图向量化状态：SUCCESS / SKIP / DEGRADE
	// example:
	//
	// SUCCESS
	FullImageEmbedStatus *string `json:"full_image_embed_status,omitempty" xml:"full_image_embed_status,omitempty"`
	// 人脸向量化状态：SUCCESS / SKIP（无人脸或未执行）/ DEGRADE
	// example:
	//
	// SUCCESS
	FaceEmbedStatus *string `json:"face_embed_status,omitempty" xml:"face_embed_status,omitempty"`
	// 全图维度 ES 最高分（未命中也记录，便于阈值对比；无检索为 null）
	// example:
	//
	// 1.2
	FullImageTopScore *int64 `json:"full_image_top_score,omitempty" xml:"full_image_top_score,omitempty"`
	// 全图维度阈值
	// example:
	//
	// 1.2
	FullImageThreshold *int64 `json:"full_image_threshold,omitempty" xml:"full_image_threshold,omitempty"`
	// 人脸维度 ES 最高分（未命中也记录；无检索为 null）
	// example:
	//
	// 1.2
	FaceTopScore *int64 `json:"face_top_score,omitempty" xml:"face_top_score,omitempty"`
	// 人脸维度阈值
	// example:
	//
	// 1
	FaceThreshold *int64 `json:"face_threshold,omitempty" xml:"face_threshold,omitempty"`
	// 是否降级（异常/服务不可用导致跳过排黑排白）
	// example:
	//
	// true
	Degraded *bool `json:"degraded,omitempty" xml:"degraded,omitempty"`
	// 降级或短路原因（参数缺失/无启用库/下载失败/向量化异常等）
	// example:
	//
	// 参数缺失
	DegradeReason *string `json:"degrade_reason,omitempty" xml:"degrade_reason,omitempty"`
}

func (s ImageBlackWhiteResult) String() string {
	return tea.Prettify(s)
}

func (s ImageBlackWhiteResult) GoString() string {
	return s.String()
}

func (s *ImageBlackWhiteResult) SetMatched(v bool) *ImageBlackWhiteResult {
	s.Matched = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchType(v string) *ImageBlackWhiteResult {
	s.MatchType = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchSource(v string) *ImageBlackWhiteResult {
	s.MatchSource = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchScore(v int64) *ImageBlackWhiteResult {
	s.MatchScore = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchThreshold(v int64) *ImageBlackWhiteResult {
	s.MatchThreshold = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchedImageId(v string) *ImageBlackWhiteResult {
	s.MatchedImageId = &v
	return s
}

func (s *ImageBlackWhiteResult) SetMatchedLibraryName(v string) *ImageBlackWhiteResult {
	s.MatchedLibraryName = &v
	return s
}

func (s *ImageBlackWhiteResult) SetExecutedFullImage(v bool) *ImageBlackWhiteResult {
	s.ExecutedFullImage = &v
	return s
}

func (s *ImageBlackWhiteResult) SetExecutedFace(v bool) *ImageBlackWhiteResult {
	s.ExecutedFace = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFaceDetected(v bool) *ImageBlackWhiteResult {
	s.FaceDetected = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFullImageEmbedStatus(v string) *ImageBlackWhiteResult {
	s.FullImageEmbedStatus = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFaceEmbedStatus(v string) *ImageBlackWhiteResult {
	s.FaceEmbedStatus = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFullImageTopScore(v int64) *ImageBlackWhiteResult {
	s.FullImageTopScore = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFullImageThreshold(v int64) *ImageBlackWhiteResult {
	s.FullImageThreshold = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFaceTopScore(v int64) *ImageBlackWhiteResult {
	s.FaceTopScore = &v
	return s
}

func (s *ImageBlackWhiteResult) SetFaceThreshold(v int64) *ImageBlackWhiteResult {
	s.FaceThreshold = &v
	return s
}

func (s *ImageBlackWhiteResult) SetDegraded(v bool) *ImageBlackWhiteResult {
	s.Degraded = &v
	return s
}

func (s *ImageBlackWhiteResult) SetDegradeReason(v string) *ImageBlackWhiteResult {
	s.DegradeReason = &v
	return s
}

// 领域信息
type FieldModel struct {
	// 领域一级标签
	// example:
	//
	// 金融
	FieldCategory *string `json:"field_category,omitempty" xml:"field_category,omitempty"`
	// 领域二级标签
	// example:
	//
	// 金融
	FieldLabel *string `json:"field_label,omitempty" xml:"field_label,omitempty"`
	// 领域一级标签的等级分数
	FieldScore *int64 `json:"field_score,omitempty" xml:"field_score,omitempty"`
}

func (s FieldModel) String() string {
	return tea.Prettify(s)
}

func (s FieldModel) GoString() string {
	return s.String()
}

func (s *FieldModel) SetFieldCategory(v string) *FieldModel {
	s.FieldCategory = &v
	return s
}

func (s *FieldModel) SetFieldLabel(v string) *FieldModel {
	s.FieldLabel = &v
	return s
}

func (s *FieldModel) SetFieldScore(v int64) *FieldModel {
	s.FieldScore = &v
	return s
}

// 美柚审核信息存储请求
type MeiyouAuditSaveWebRequest struct {
	// 审核记录ID
	// example:
	//
	// 1
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty"`
	// 主题ID
	// example:
	//
	// 1
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// 内容文本
	// example:
	//
	// test
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 发布时间戳(毫秒)
	// example:
	//
	// 1
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 图片URL数组(JSON字符串)
	// example:
	//
	// {}
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 一级业务
	// example:
	//
	// test
	PrimaryBusiness *string `json:"primary_business,omitempty" xml:"primary_business,omitempty"`
	// 二级业务
	// example:
	//
	// 1
	SecondaryBusiness *string `json:"secondary_business,omitempty" xml:"secondary_business,omitempty"`
	// 用户昵称
	// example:
	//
	// 小蜜
	UserNickname *string `json:"user_nickname,omitempty" xml:"user_nickname,omitempty"`
	// 用户ID
	// example:
	//
	// 1
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户类型
	// example:
	//
	// INIT
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 用户头像URL
	// example:
	//
	// http://test
	UserAvatar *string `json:"user_avatar,omitempty" xml:"user_avatar,omitempty"`
	// 操作人
	// example:
	//
	// 小蜜
	AuditOperator *string `json:"audit_operator,omitempty" xml:"audit_operator,omitempty"`
	// 审核楼
	// example:
	//
	// 1
	AuditFloor *int64 `json:"audit_floor,omitempty" xml:"audit_floor,omitempty"`
	// 版本
	// example:
	//
	// 1
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 主题信息
	// example:
	//
	// {}
	TopicInfos []*MeiyouTopicWebInfo `json:"topic_infos,omitempty" xml:"topic_infos,omitempty" type:"Repeated"`
}

func (s MeiyouAuditSaveWebRequest) String() string {
	return tea.Prettify(s)
}

func (s MeiyouAuditSaveWebRequest) GoString() string {
	return s.String()
}

func (s *MeiyouAuditSaveWebRequest) SetAuditId(v int64) *MeiyouAuditSaveWebRequest {
	s.AuditId = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetTopicId(v int64) *MeiyouAuditSaveWebRequest {
	s.TopicId = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetContent(v string) *MeiyouAuditSaveWebRequest {
	s.Content = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetPublishTime(v int64) *MeiyouAuditSaveWebRequest {
	s.PublishTime = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetImages(v string) *MeiyouAuditSaveWebRequest {
	s.Images = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetPrimaryBusiness(v string) *MeiyouAuditSaveWebRequest {
	s.PrimaryBusiness = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetSecondaryBusiness(v string) *MeiyouAuditSaveWebRequest {
	s.SecondaryBusiness = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetUserNickname(v string) *MeiyouAuditSaveWebRequest {
	s.UserNickname = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetUserId(v string) *MeiyouAuditSaveWebRequest {
	s.UserId = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetUserType(v string) *MeiyouAuditSaveWebRequest {
	s.UserType = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetUserAvatar(v string) *MeiyouAuditSaveWebRequest {
	s.UserAvatar = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetAuditOperator(v string) *MeiyouAuditSaveWebRequest {
	s.AuditOperator = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetAuditFloor(v int64) *MeiyouAuditSaveWebRequest {
	s.AuditFloor = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetVersion(v string) *MeiyouAuditSaveWebRequest {
	s.Version = &v
	return s
}

func (s *MeiyouAuditSaveWebRequest) SetTopicInfos(v []*MeiyouTopicWebInfo) *MeiyouAuditSaveWebRequest {
	s.TopicInfos = v
	return s
}

// 网关响应模型
type AntCloudProdProviderHttpResponse struct {
	// maya返回结果
	Response *MayaStreamResult `json:"response,omitempty" xml:"response,omitempty" require:"true"`
	// 签名
	// example:
	//
	// 5Okl4F2SNc9L2zrWCF8xZ+QPUyA=
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

// 提示词攻击手法
type AttackLabelModel struct {
	// 提示词攻击手法一级标签
	// example:
	//
	// jailbreak_attack
	AttackLabel *string `json:"attack_label,omitempty" xml:"attack_label,omitempty"`
	// 提示词攻击手法二级标签
	// example:
	//
	// {}
	AttackSubLabels []*AttackSubLabelModel `json:"attack_sub_labels,omitempty" xml:"attack_sub_labels,omitempty" type:"Repeated"`
}

func (s AttackLabelModel) String() string {
	return tea.Prettify(s)
}

func (s AttackLabelModel) GoString() string {
	return s.String()
}

func (s *AttackLabelModel) SetAttackLabel(v string) *AttackLabelModel {
	s.AttackLabel = &v
	return s
}

func (s *AttackLabelModel) SetAttackSubLabels(v []*AttackSubLabelModel) *AttackLabelModel {
	s.AttackSubLabels = v
	return s
}

// 单次接口请求内的模型 token 汇总。
type TokenUsageSummary struct {
	// 标识该对象是请求级汇总，便于 BI 侧过滤代理阶段日志。
	// example:
	//
	// REQUEST
	Scope *string `json:"scope,omitempty" xml:"scope,omitempty"`
	// 提示词token
	// example:
	//
	// 1
	PromptTokens *int64 `json:"prompt_tokens,omitempty" xml:"prompt_tokens,omitempty"`
	// 模型生成回答时输出的 token 数量
	// example:
	//
	// 1
	CompletionTokens *int64 `json:"completion_tokens,omitempty" xml:"completion_tokens,omitempty"`
	// 总tokens
	// example:
	//
	// 1
	TotalTokens *int64 `json:"total_tokens,omitempty" xml:"total_tokens,omitempty"`
	// 护栏内部模型（含 Embedding）总 token。
	// example:
	//
	// 1
	GuardTotalTokens *int64 `json:"guard_total_tokens,omitempty" xml:"guard_total_tokens,omitempty"`
	// 代理转发的上游大模型总 token。
	// example:
	//
	// 1
	UpstreamTotalTokens *int64 `json:"upstream_total_tokens,omitempty" xml:"upstream_total_tokens,omitempty"`
	// 已实际发起的模型调用数，包括尚未返回的调用
	// example:
	//
	// 1
	ModelCallCount *int64 `json:"model_call_count,omitempty" xml:"model_call_count,omitempty"`
	// 能够确定 total_tokens 的模型调用数。
	// example:
	//
	// 1
	ReportedCallCount *int64 `json:"reported_call_count,omitempty" xml:"reported_call_count,omitempty"`
	// 已结束但无法确定 total_tokens 的模型调用数
	// example:
	//
	// 1
	UnreportedCallCount *int64 `json:"unreported_call_count,omitempty" xml:"unreported_call_count,omitempty"`
	// 当前快照时仍在执行的模型调用数。
	// example:
	//
	// 1
	InFlightCallCount *int64 `json:"in_flight_call_count,omitempty" xml:"in_flight_call_count,omitempty"`
	// 仅当所有已发起调用都结束且均能确定 total_tokens，并且业务未发生提前返回时为 true。
	// example:
	//
	// true
	Complete *bool `json:"complete,omitempty" xml:"complete,omitempty"`
}

func (s TokenUsageSummary) String() string {
	return tea.Prettify(s)
}

func (s TokenUsageSummary) GoString() string {
	return s.String()
}

func (s *TokenUsageSummary) SetScope(v string) *TokenUsageSummary {
	s.Scope = &v
	return s
}

func (s *TokenUsageSummary) SetPromptTokens(v int64) *TokenUsageSummary {
	s.PromptTokens = &v
	return s
}

func (s *TokenUsageSummary) SetCompletionTokens(v int64) *TokenUsageSummary {
	s.CompletionTokens = &v
	return s
}

func (s *TokenUsageSummary) SetTotalTokens(v int64) *TokenUsageSummary {
	s.TotalTokens = &v
	return s
}

func (s *TokenUsageSummary) SetGuardTotalTokens(v int64) *TokenUsageSummary {
	s.GuardTotalTokens = &v
	return s
}

func (s *TokenUsageSummary) SetUpstreamTotalTokens(v int64) *TokenUsageSummary {
	s.UpstreamTotalTokens = &v
	return s
}

func (s *TokenUsageSummary) SetModelCallCount(v int64) *TokenUsageSummary {
	s.ModelCallCount = &v
	return s
}

func (s *TokenUsageSummary) SetReportedCallCount(v int64) *TokenUsageSummary {
	s.ReportedCallCount = &v
	return s
}

func (s *TokenUsageSummary) SetUnreportedCallCount(v int64) *TokenUsageSummary {
	s.UnreportedCallCount = &v
	return s
}

func (s *TokenUsageSummary) SetInFlightCallCount(v int64) *TokenUsageSummary {
	s.InFlightCallCount = &v
	return s
}

func (s *TokenUsageSummary) SetComplete(v bool) *TokenUsageSummary {
	s.Complete = &v
	return s
}

// 一级标签信息
type LabelModel struct {
	// 一级标签
	// example:
	//
	// 正常
	Label *string `json:"label,omitempty" xml:"label,omitempty"`
	// 子标签
	SubLabels []*SubLabelModel `json:"sub_labels,omitempty" xml:"sub_labels,omitempty" type:"Repeated"`
}

func (s LabelModel) String() string {
	return tea.Prettify(s)
}

func (s LabelModel) GoString() string {
	return s.String()
}

func (s *LabelModel) SetLabel(v string) *LabelModel {
	s.Label = &v
	return s
}

func (s *LabelModel) SetSubLabels(v []*SubLabelModel) *LabelModel {
	s.SubLabels = v
	return s
}

// 文本同步审核结果
type TextSyncAuditResult struct {
	// 任务id
	// example:
	//
	// 123
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 数据Id
	// example:
	//
	// 123
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 业务Id - 调用方透传
	// example:
	//
	// 123
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
	// example:
	//
	// high
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// 审核标签列表
	// example:
	//
	// [{"label":"sex", "probability":66.5, "description":"疑似色情内容", "riskWords":"AA,BB,CC"}]
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

// 美柚审核信息存储
type MeiyouAuditSaveWebInfo struct {
	// 主题ID
	// example:
	//
	// 1
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// 审核记录ID
	// example:
	//
	// 1
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty" require:"true"`
	// 内容文本
	// example:
	//
	// 小蜜
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 发布时间戳(毫秒)
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 图片URL数组(JSON字符串)
	// example:
	//
	// {}
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 一级业务
	// example:
	//
	// 一级业务
	PrimaryBusiness *string `json:"primary_business,omitempty" xml:"primary_business,omitempty"`
	// 二级业务
	// example:
	//
	// 二级业务
	SecondaryBusiness *string `json:"secondary_business,omitempty" xml:"secondary_business,omitempty"`
	// 用户昵称
	// example:
	//
	// 用户昵称
	UserNickname *string `json:"user_nickname,omitempty" xml:"user_nickname,omitempty"`
	// 用户ID
	// example:
	//
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户类型
	//
	// example:
	//
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 用户头像URL
	// example:
	//
	// http://
	UserAvatar *string `json:"user_avatar,omitempty" xml:"user_avatar,omitempty"`
	//  主题信息
	// example:
	//
	//  主题信息
	TopicInfos *MeiyouTopicWebInfo `json:"topic_infos,omitempty" xml:"topic_infos,omitempty"`
}

func (s MeiyouAuditSaveWebInfo) String() string {
	return tea.Prettify(s)
}

func (s MeiyouAuditSaveWebInfo) GoString() string {
	return s.String()
}

func (s *MeiyouAuditSaveWebInfo) SetTopicId(v int64) *MeiyouAuditSaveWebInfo {
	s.TopicId = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetAuditId(v int64) *MeiyouAuditSaveWebInfo {
	s.AuditId = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetContent(v string) *MeiyouAuditSaveWebInfo {
	s.Content = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetPublishTime(v int64) *MeiyouAuditSaveWebInfo {
	s.PublishTime = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetImages(v string) *MeiyouAuditSaveWebInfo {
	s.Images = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetPrimaryBusiness(v string) *MeiyouAuditSaveWebInfo {
	s.PrimaryBusiness = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetSecondaryBusiness(v string) *MeiyouAuditSaveWebInfo {
	s.SecondaryBusiness = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetUserNickname(v string) *MeiyouAuditSaveWebInfo {
	s.UserNickname = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetUserId(v string) *MeiyouAuditSaveWebInfo {
	s.UserId = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetUserType(v string) *MeiyouAuditSaveWebInfo {
	s.UserType = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetUserAvatar(v string) *MeiyouAuditSaveWebInfo {
	s.UserAvatar = &v
	return s
}

func (s *MeiyouAuditSaveWebInfo) SetTopicInfos(v *MeiyouTopicWebInfo) *MeiyouAuditSaveWebInfo {
	s.TopicInfos = v
	return s
}

// 图片审核结果
type ImageAuditResult struct {
	// 任务ID
	// example:
	//
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 数据ID
	// example:
	//
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

// 提示词攻击手法一级标签
type AttackLabel struct {
	// 提示词攻击手法一级标签
	// example:
	//
	// jailbreak：越狱攻击
	AttackLabel *string `json:"attack_label,omitempty" xml:"attack_label,omitempty"`
	// 提示词攻击手法二级标签列表
	AttackSubLabels *AttackSubLabel `json:"attack_sub_labels,omitempty" xml:"attack_sub_labels,omitempty"`
}

func (s AttackLabel) String() string {
	return tea.Prettify(s)
}

func (s AttackLabel) GoString() string {
	return s.String()
}

func (s *AttackLabel) SetAttackLabel(v string) *AttackLabel {
	s.AttackLabel = &v
	return s
}

func (s *AttackLabel) SetAttackSubLabels(v *AttackSubLabel) *AttackLabel {
	s.AttackSubLabels = v
	return s
}

// 美柚审核信息
type MeiyouAuditInfo struct {
	// 主键id
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 审核记录ID
	// example:
	//
	// 1
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty" require:"true"`
	// 主题ID
	// example:
	//
	// 1
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// 内容文本
	// example:
	//
	// 内容文本
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 发布时间戳
	// example:
	//
	// 2018-10-10T10:10:00Z
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 图片URL数组(JSON字符串)
	// example:
	//
	// {}
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 一级业务
	// example:
	//
	// 1
	PrimaryBusiness *string `json:"primary_business,omitempty" xml:"primary_business,omitempty"`
	// 二级业务
	// example:
	//
	// 2
	SecondaryBusiness *string `json:"secondary_business,omitempty" xml:"secondary_business,omitempty"`
	// 用户昵称
	// example:
	//
	// 小蜜
	UserNickname *string `json:"user_nickname,omitempty" xml:"user_nickname,omitempty"`
	// 用户ID
	// example:
	//
	// 1
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户类型
	// example:
	//
	// test
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 用户头像URL
	// example:
	//
	// http://test
	UserAvatar *string `json:"user_avatar,omitempty" xml:"user_avatar,omitempty"`
	// 审核结果
	// example:
	//
	// OK
	AuditResult *string `json:"audit_result,omitempty" xml:"audit_result,omitempty"`
	// 审核原因
	// example:
	//
	// 30
	AuditReason *string `json:"audit_reason,omitempty" xml:"audit_reason,omitempty"`
	// 审核原因
	// example:
	//
	// test
	AuditReasonMsg *string `json:"audit_reason_msg,omitempty" xml:"audit_reason_msg,omitempty"`
	// 操作人
	// example:
	//
	// 小蜜
	AuditOperator *string `json:"audit_operator,omitempty" xml:"audit_operator,omitempty"`
	// 操作时间戳
	// example:
	//
	// 2018-10-10T10:10:00Z
	AuditTime *string `json:"audit_time,omitempty" xml:"audit_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// oss 转存后的图像地址
	// example:
	//
	// {}
	OssImages *string `json:"oss_images,omitempty" xml:"oss_images,omitempty"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s MeiyouAuditInfo) String() string {
	return tea.Prettify(s)
}

func (s MeiyouAuditInfo) GoString() string {
	return s.String()
}

func (s *MeiyouAuditInfo) SetId(v int64) *MeiyouAuditInfo {
	s.Id = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditId(v int64) *MeiyouAuditInfo {
	s.AuditId = &v
	return s
}

func (s *MeiyouAuditInfo) SetTopicId(v int64) *MeiyouAuditInfo {
	s.TopicId = &v
	return s
}

func (s *MeiyouAuditInfo) SetContent(v string) *MeiyouAuditInfo {
	s.Content = &v
	return s
}

func (s *MeiyouAuditInfo) SetPublishTime(v string) *MeiyouAuditInfo {
	s.PublishTime = &v
	return s
}

func (s *MeiyouAuditInfo) SetImages(v string) *MeiyouAuditInfo {
	s.Images = &v
	return s
}

func (s *MeiyouAuditInfo) SetPrimaryBusiness(v string) *MeiyouAuditInfo {
	s.PrimaryBusiness = &v
	return s
}

func (s *MeiyouAuditInfo) SetSecondaryBusiness(v string) *MeiyouAuditInfo {
	s.SecondaryBusiness = &v
	return s
}

func (s *MeiyouAuditInfo) SetUserNickname(v string) *MeiyouAuditInfo {
	s.UserNickname = &v
	return s
}

func (s *MeiyouAuditInfo) SetUserId(v string) *MeiyouAuditInfo {
	s.UserId = &v
	return s
}

func (s *MeiyouAuditInfo) SetUserType(v string) *MeiyouAuditInfo {
	s.UserType = &v
	return s
}

func (s *MeiyouAuditInfo) SetUserAvatar(v string) *MeiyouAuditInfo {
	s.UserAvatar = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditResult(v string) *MeiyouAuditInfo {
	s.AuditResult = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditReason(v string) *MeiyouAuditInfo {
	s.AuditReason = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditReasonMsg(v string) *MeiyouAuditInfo {
	s.AuditReasonMsg = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditOperator(v string) *MeiyouAuditInfo {
	s.AuditOperator = &v
	return s
}

func (s *MeiyouAuditInfo) SetAuditTime(v string) *MeiyouAuditInfo {
	s.AuditTime = &v
	return s
}

func (s *MeiyouAuditInfo) SetOssImages(v string) *MeiyouAuditInfo {
	s.OssImages = &v
	return s
}

func (s *MeiyouAuditInfo) SetGmtCreate(v string) *MeiyouAuditInfo {
	s.GmtCreate = &v
	return s
}

func (s *MeiyouAuditInfo) SetGmtModified(v string) *MeiyouAuditInfo {
	s.GmtModified = &v
	return s
}

// 更新美柚itag关系信息
type UpdateMeiyouItagRelationWebInfo struct {
	// 主键id
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 审核记录ID
	// example:
	//
	// 1
	AuditId *string `json:"audit_id,omitempty" xml:"audit_id,omitempty"`
	// itag数据ID
	// example:
	//
	// 1
	ItagDataId *int64 `json:"itag_data_id,omitempty" xml:"itag_data_id,omitempty"`
	// 美柚任务审核结果推送状态
	// example:
	//
	// INIT
	MeiyouAuditState *string `json:"meiyou_audit_state,omitempty" xml:"meiyou_audit_state,omitempty"`
	// 审核不通过原因
	// example:
	//
	// 34
	RefuseReson *string `json:"refuse_reson,omitempty" xml:"refuse_reson,omitempty"`
	// 审核不通过图片序号
	// example:
	//
	// ["1","2"]
	RefuseImages *string `json:"refuse_images,omitempty" xml:"refuse_images,omitempty"`
	// 美柚itag关联状态
	// example:
	//
	// 1
	AuditState *string `json:"audit_state,omitempty" xml:"audit_state,omitempty"`
	// 美柚itag关联状态
	// example:
	//
	// 1
	TopicState *string `json:"topic_state,omitempty" xml:"topic_state,omitempty"`
	// 审核结果
	// example:
	//
	// 1
	AuditResult *string `json:"audit_result,omitempty" xml:"audit_result,omitempty"`
	// 审核人员
	// example:
	//
	// 1
	AuditUser *string `json:"audit_user,omitempty" xml:"audit_user,omitempty"`
	// 审核时间
	// example:
	//
	// 1
	AuditTime *int64 `json:"audit_time,omitempty" xml:"audit_time,omitempty"`
}

func (s UpdateMeiyouItagRelationWebInfo) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeiyouItagRelationWebInfo) GoString() string {
	return s.String()
}

func (s *UpdateMeiyouItagRelationWebInfo) SetId(v int64) *UpdateMeiyouItagRelationWebInfo {
	s.Id = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetAuditId(v string) *UpdateMeiyouItagRelationWebInfo {
	s.AuditId = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetItagDataId(v int64) *UpdateMeiyouItagRelationWebInfo {
	s.ItagDataId = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetMeiyouAuditState(v string) *UpdateMeiyouItagRelationWebInfo {
	s.MeiyouAuditState = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetRefuseReson(v string) *UpdateMeiyouItagRelationWebInfo {
	s.RefuseReson = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetRefuseImages(v string) *UpdateMeiyouItagRelationWebInfo {
	s.RefuseImages = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetAuditState(v string) *UpdateMeiyouItagRelationWebInfo {
	s.AuditState = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetTopicState(v string) *UpdateMeiyouItagRelationWebInfo {
	s.TopicState = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetAuditResult(v string) *UpdateMeiyouItagRelationWebInfo {
	s.AuditResult = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetAuditUser(v string) *UpdateMeiyouItagRelationWebInfo {
	s.AuditUser = &v
	return s
}

func (s *UpdateMeiyouItagRelationWebInfo) SetAuditTime(v int64) *UpdateMeiyouItagRelationWebInfo {
	s.AuditTime = &v
	return s
}

type QueryAdvisormarketDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询类型STATION_LIST、STATION_DETAIL、REACHABLE_ROADS、VEHICLE_TYPE_DISTRIBUTION、ENTRY_FLOW、FRONT_FLOW、SURROUNDING_FLOW、NEW_ENTRY_VEHICLES、FREQUENT_ENTRY、INFREQUENT_ENTRY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 行政区名称，如“浙江省”、“杭州市”；type=STATION_LIST时必填
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
	// 品牌清单筛选，如 ["中石油", "中石化"]；不传则返回所有品牌；仅 type=STATION_LIST 时生效
	Brands []*string `json:"brands,omitempty" xml:"brands,omitempty" type:"Repeated"`
	// 站点名称列表，支持批量查询；type 非 STATION_LIST 时必填
	Names []*string `json:"names,omitempty" xml:"names,omitempty" type:"Repeated"`
	// 起始日期，yyyy-MM-dd；时间类查询时必填
	Startdate *string `json:"startdate,omitempty" xml:"startdate,omitempty"`
	// 结束日期，yyyy-MM-dd；时间类查询时必填
	Enddate *string `json:"enddate,omitempty" xml:"enddate,omitempty"`
	// 最低进站次数阈值，默认 3；仅 type=FREQUENT_ENTRY 时生效
	Mintimes *string `json:"mintimes,omitempty" xml:"mintimes,omitempty"`
	// 最高进站次数阈值（不含），默认 3；仅 type=INFREQUENT_ENTRY 时生效
	Maxtimes *string `json:"maxtimes,omitempty" xml:"maxtimes,omitempty"`
}

func (s QueryAdvisormarketDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAdvisormarketDataRequest) GoString() string {
	return s.String()
}

func (s *QueryAdvisormarketDataRequest) SetAuthToken(v string) *QueryAdvisormarketDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetProductInstanceId(v string) *QueryAdvisormarketDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetType(v string) *QueryAdvisormarketDataRequest {
	s.Type = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetRegion(v string) *QueryAdvisormarketDataRequest {
	s.Region = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetBrands(v []*string) *QueryAdvisormarketDataRequest {
	s.Brands = v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetNames(v []*string) *QueryAdvisormarketDataRequest {
	s.Names = v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetStartdate(v string) *QueryAdvisormarketDataRequest {
	s.Startdate = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetEnddate(v string) *QueryAdvisormarketDataRequest {
	s.Enddate = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetMintimes(v string) *QueryAdvisormarketDataRequest {
	s.Mintimes = &v
	return s
}

func (s *QueryAdvisormarketDataRequest) SetMaxtimes(v string) *QueryAdvisormarketDataRequest {
	s.Maxtimes = &v
	return s
}

type QueryAdvisormarketDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码，"0" 表示成功，非 "0" 为失败
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 状态描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求追踪ID，用于问题排查
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// 服务端响应时间戳（毫秒）
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 业务数据 JSON 字符串，调用方需反序列化后使用，具体结构见各 type 定义
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAdvisormarketDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAdvisormarketDataResponse) GoString() string {
	return s.String()
}

func (s *QueryAdvisormarketDataResponse) SetReqMsgId(v string) *QueryAdvisormarketDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetResultCode(v string) *QueryAdvisormarketDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetResultMsg(v string) *QueryAdvisormarketDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetCode(v string) *QueryAdvisormarketDataResponse {
	s.Code = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetMessage(v string) *QueryAdvisormarketDataResponse {
	s.Message = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetRequestid(v string) *QueryAdvisormarketDataResponse {
	s.Requestid = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetTimestamp(v string) *QueryAdvisormarketDataResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryAdvisormarketDataResponse) SetData(v string) *QueryAdvisormarketDataResponse {
	s.Data = &v
	return s
}

type PushAdvisormarketAnalysisRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分析能力标识。当前仅支持 YINLI_CROWD_ANALYSIS。
	AnalysisType *string `json:"analysis_type,omitempty" xml:"analysis_type,omitempty" require:"true"`
	// UTF-8 JSON 对象字符串，禁止二次编码。示例：{"city":"深圳","time_range":{"start_date":"2026-09-01","end_date":"2026-09-30"},"business_area":{"name":"中心商圈","aoi":{"geometry":{"type":"Polygon","coordinates":[[[114,22],[115,22],[114,23],[114,22]]]}},"reachable_aoi":{"geometry":{"type":"Polygon","coordinates":[[[113,21],[116,21],[113,24],[113,21]]]}}},"audience_path":"/a.txt.pgp"}。日期格式为 YYYY-MM-DD；两个 coordinates 均为闭合的 GeoJSON Polygon；audience_path 必须以 .txt.pgp 结尾。
	Input *string `json:"input,omitempty" xml:"input,omitempty" require:"true"`
}

func (s PushAdvisormarketAnalysisRequest) String() string {
	return tea.Prettify(s)
}

func (s PushAdvisormarketAnalysisRequest) GoString() string {
	return s.String()
}

func (s *PushAdvisormarketAnalysisRequest) SetAuthToken(v string) *PushAdvisormarketAnalysisRequest {
	s.AuthToken = &v
	return s
}

func (s *PushAdvisormarketAnalysisRequest) SetProductInstanceId(v string) *PushAdvisormarketAnalysisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushAdvisormarketAnalysisRequest) SetAnalysisType(v string) *PushAdvisormarketAnalysisRequest {
	s.AnalysisType = &v
	return s
}

func (s *PushAdvisormarketAnalysisRequest) SetInput(v string) *PushAdvisormarketAnalysisRequest {
	s.Input = &v
	return s
}

type PushAdvisormarketAnalysisResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建成功后生成的任务唯一 ID。请保存该值，并在查询接口中作为 task_id 使用。
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 创建成功固定返回 QUEUED，表示任务已进入待人工处理队列，尚未产出分析结果。
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PushAdvisormarketAnalysisResponse) String() string {
	return tea.Prettify(s)
}

func (s PushAdvisormarketAnalysisResponse) GoString() string {
	return s.String()
}

func (s *PushAdvisormarketAnalysisResponse) SetReqMsgId(v string) *PushAdvisormarketAnalysisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushAdvisormarketAnalysisResponse) SetResultCode(v string) *PushAdvisormarketAnalysisResponse {
	s.ResultCode = &v
	return s
}

func (s *PushAdvisormarketAnalysisResponse) SetResultMsg(v string) *PushAdvisormarketAnalysisResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushAdvisormarketAnalysisResponse) SetTaskId(v string) *PushAdvisormarketAnalysisResponse {
	s.TaskId = &v
	return s
}

func (s *PushAdvisormarketAnalysisResponse) SetStatus(v string) *PushAdvisormarketAnalysisResponse {
	s.Status = &v
	return s
}

type QueryAdvisormarketAnalysisRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建接口返回的任务 ID。type=result 时必填；type=status 时用于精确查询，不能与 task_status 同时传入。
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 查询模式。status 查询状态或任务列表；result 查询指定成功任务的结果下载地址。可选值：status、result。
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 状态列表筛选条件，仅在 type=status 且未传 task_id 时使用。可选值：QUEUED、PROCESSING、SUCCESS、FAILED；不要传 CLOSED。
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
}

func (s QueryAdvisormarketAnalysisRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAdvisormarketAnalysisRequest) GoString() string {
	return s.String()
}

func (s *QueryAdvisormarketAnalysisRequest) SetAuthToken(v string) *QueryAdvisormarketAnalysisRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAdvisormarketAnalysisRequest) SetProductInstanceId(v string) *QueryAdvisormarketAnalysisRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAdvisormarketAnalysisRequest) SetTaskId(v string) *QueryAdvisormarketAnalysisRequest {
	s.TaskId = &v
	return s
}

func (s *QueryAdvisormarketAnalysisRequest) SetType(v string) *QueryAdvisormarketAnalysisRequest {
	s.Type = &v
	return s
}

func (s *QueryAdvisormarketAnalysisRequest) SetTaskStatus(v string) *QueryAdvisormarketAnalysisRequest {
	s.TaskStatus = &v
	return s
}

type QueryAdvisormarketAnalysisResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// JSON 数组字符串，调用方需再次解析。示例：[{"task_id":"ana_01K5A1B2","display_name":"中心商圈","analysis_type":"YINLI_CROWD_ANALYSIS","status":"PROCESSING","result_url":null,"created_at":"2026-09-14 15:30:00"}]。无数据返回 []；仅 SUCCESS 任务的结果查询会返回 result_url。
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAdvisormarketAnalysisResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAdvisormarketAnalysisResponse) GoString() string {
	return s.String()
}

func (s *QueryAdvisormarketAnalysisResponse) SetReqMsgId(v string) *QueryAdvisormarketAnalysisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAdvisormarketAnalysisResponse) SetResultCode(v string) *QueryAdvisormarketAnalysisResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAdvisormarketAnalysisResponse) SetResultMsg(v string) *QueryAdvisormarketAnalysisResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAdvisormarketAnalysisResponse) SetData(v string) *QueryAdvisormarketAnalysisResponse {
	s.Data = &v
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
	// 审核时输入的额外信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 产品子业务场景ID
	SubBusinessId *string `json:"sub_business_id,omitempty" xml:"sub_business_id,omitempty"`
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

func (s *SubmitAuditTextRequest) SetExtendInfo(v string) *SubmitAuditTextRequest {
	s.ExtendInfo = &v
	return s
}

func (s *SubmitAuditTextRequest) SetSubBusinessId(v string) *SubmitAuditTextRequest {
	s.SubBusinessId = &v
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
	// 审核时输入的额外信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 子业务场景
	SubBusinessId *string `json:"sub_business_id,omitempty" xml:"sub_business_id,omitempty"`
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

func (s *SubmitAuditImageRequest) SetExtendInfo(v string) *SubmitAuditImageRequest {
	s.ExtendInfo = &v
	return s
}

func (s *SubmitAuditImageRequest) SetSubBusinessId(v string) *SubmitAuditImageRequest {
	s.SubBusinessId = &v
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
	// 审核时输入的额外信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 子业务场景
	SubBusinessId *string `json:"sub_business_id,omitempty" xml:"sub_business_id,omitempty"`
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

func (s *SubmitAuditAudioRequest) SetExtendInfo(v string) *SubmitAuditAudioRequest {
	s.ExtendInfo = &v
	return s
}

func (s *SubmitAuditAudioRequest) SetSubBusinessId(v string) *SubmitAuditAudioRequest {
	s.SubBusinessId = &v
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
	// 审核时输入的额外信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 子业务场景ID
	SubBusinessId *string `json:"sub_business_id,omitempty" xml:"sub_business_id,omitempty"`
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

func (s *SubmitAuditVideoRequest) SetExtendInfo(v string) *SubmitAuditVideoRequest {
	s.ExtendInfo = &v
	return s
}

func (s *SubmitAuditVideoRequest) SetSubBusinessId(v string) *SubmitAuditVideoRequest {
	s.SubBusinessId = &v
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

type SaveAuditMeiyouRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 美柚待审核信息保存请求
	Request []*MeiyouAuditSaveWebInfo `json:"request,omitempty" xml:"request,omitempty" require:"true" type:"Repeated"`
}

func (s SaveAuditMeiyouRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveAuditMeiyouRequest) GoString() string {
	return s.String()
}

func (s *SaveAuditMeiyouRequest) SetAuthToken(v string) *SaveAuditMeiyouRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveAuditMeiyouRequest) SetProductInstanceId(v string) *SaveAuditMeiyouRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveAuditMeiyouRequest) SetRequest(v []*MeiyouAuditSaveWebInfo) *SaveAuditMeiyouRequest {
	s.Request = v
	return s
}

type SaveAuditMeiyouResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 码值
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 响应结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SaveAuditMeiyouResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveAuditMeiyouResponse) GoString() string {
	return s.String()
}

func (s *SaveAuditMeiyouResponse) SetReqMsgId(v string) *SaveAuditMeiyouResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetResultCode(v string) *SaveAuditMeiyouResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetResultMsg(v string) *SaveAuditMeiyouResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetErrorCode(v string) *SaveAuditMeiyouResponse {
	s.ErrorCode = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetErrorMessage(v string) *SaveAuditMeiyouResponse {
	s.ErrorMessage = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetRequestId(v string) *SaveAuditMeiyouResponse {
	s.RequestId = &v
	return s
}

func (s *SaveAuditMeiyouResponse) SetResult(v string) *SaveAuditMeiyouResponse {
	s.Result = &v
	return s
}

type UpdateAuditMeiyouRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核记录ID
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty" require:"true"`
	// 审核结果
	AuditResult *string `json:"audit_result,omitempty" xml:"audit_result,omitempty"`
	// 审核原因
	AuditReason *string `json:"audit_reason,omitempty" xml:"audit_reason,omitempty"`
	// 操作人
	AuditOperator *string `json:"audit_operator,omitempty" xml:"audit_operator,omitempty"`
	// 操作时间戳(毫秒)
	AuditTime *int64 `json:"audit_time,omitempty" xml:"audit_time,omitempty"`
}

func (s UpdateAuditMeiyouRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuditMeiyouRequest) GoString() string {
	return s.String()
}

func (s *UpdateAuditMeiyouRequest) SetAuthToken(v string) *UpdateAuditMeiyouRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetProductInstanceId(v string) *UpdateAuditMeiyouRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetAuditId(v int64) *UpdateAuditMeiyouRequest {
	s.AuditId = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetAuditResult(v string) *UpdateAuditMeiyouRequest {
	s.AuditResult = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetAuditReason(v string) *UpdateAuditMeiyouRequest {
	s.AuditReason = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetAuditOperator(v string) *UpdateAuditMeiyouRequest {
	s.AuditOperator = &v
	return s
}

func (s *UpdateAuditMeiyouRequest) SetAuditTime(v int64) *UpdateAuditMeiyouRequest {
	s.AuditTime = &v
	return s
}

type UpdateAuditMeiyouResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异常码值
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 异常信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 响应结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateAuditMeiyouResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuditMeiyouResponse) GoString() string {
	return s.String()
}

func (s *UpdateAuditMeiyouResponse) SetReqMsgId(v string) *UpdateAuditMeiyouResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetResultCode(v string) *UpdateAuditMeiyouResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetResultMsg(v string) *UpdateAuditMeiyouResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetErrorCode(v string) *UpdateAuditMeiyouResponse {
	s.ErrorCode = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetErrorMessage(v string) *UpdateAuditMeiyouResponse {
	s.ErrorMessage = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetRequestId(v string) *UpdateAuditMeiyouResponse {
	s.RequestId = &v
	return s
}

func (s *UpdateAuditMeiyouResponse) SetResult(v string) *UpdateAuditMeiyouResponse {
	s.Result = &v
	return s
}

type QueryMeiyouAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核记录ID
	AuditIds []*int64 `json:"audit_ids,omitempty" xml:"audit_ids,omitempty" type:"Repeated"`
	// 美柚itag关联状态
	AuditState *string `json:"audit_state,omitempty" xml:"audit_state,omitempty" require:"true"`
	// 开始时间
	GmtCreateStart *string `json:"gmt_create_start,omitempty" xml:"gmt_create_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	GmtCreateEnd *string `json:"gmt_create_end,omitempty" xml:"gmt_create_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 最大条数
	MaxNum *int64 `json:"max_num,omitempty" xml:"max_num,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 操作人
	AuditOperators []*string `json:"audit_operators,omitempty" xml:"audit_operators,omitempty" type:"Repeated"`
}

func (s QueryMeiyouAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAuditRequest) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAuditRequest) SetAuthToken(v string) *QueryMeiyouAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetProductInstanceId(v string) *QueryMeiyouAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetAuditIds(v []*int64) *QueryMeiyouAuditRequest {
	s.AuditIds = v
	return s
}

func (s *QueryMeiyouAuditRequest) SetAuditState(v string) *QueryMeiyouAuditRequest {
	s.AuditState = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetGmtCreateStart(v string) *QueryMeiyouAuditRequest {
	s.GmtCreateStart = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetGmtCreateEnd(v string) *QueryMeiyouAuditRequest {
	s.GmtCreateEnd = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetMaxNum(v int64) *QueryMeiyouAuditRequest {
	s.MaxNum = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetSource(v string) *QueryMeiyouAuditRequest {
	s.Source = &v
	return s
}

func (s *QueryMeiyouAuditRequest) SetAuditOperators(v []*string) *QueryMeiyouAuditRequest {
	s.AuditOperators = v
	return s
}

type QueryMeiyouAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryMeiyouAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAuditResponse) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAuditResponse) SetReqMsgId(v string) *QueryMeiyouAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeiyouAuditResponse) SetResultCode(v string) *QueryMeiyouAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeiyouAuditResponse) SetResultMsg(v string) *QueryMeiyouAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeiyouAuditResponse) SetResult(v string) *QueryMeiyouAuditResponse {
	s.Result = &v
	return s
}

type QueryMeiyouAudittopicRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主题ID
	TopicIds []*int64 `json:"topic_ids,omitempty" xml:"topic_ids,omitempty" require:"true" type:"Repeated"`
	// 美柚itag关联状态
	TopicState *string `json:"topic_state,omitempty" xml:"topic_state,omitempty" require:"true"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s QueryMeiyouAudittopicRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAudittopicRequest) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAudittopicRequest) SetAuthToken(v string) *QueryMeiyouAudittopicRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeiyouAudittopicRequest) SetProductInstanceId(v string) *QueryMeiyouAudittopicRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeiyouAudittopicRequest) SetTopicIds(v []*int64) *QueryMeiyouAudittopicRequest {
	s.TopicIds = v
	return s
}

func (s *QueryMeiyouAudittopicRequest) SetTopicState(v string) *QueryMeiyouAudittopicRequest {
	s.TopicState = &v
	return s
}

func (s *QueryMeiyouAudittopicRequest) SetSource(v string) *QueryMeiyouAudittopicRequest {
	s.Source = &v
	return s
}

type QueryMeiyouAudittopicResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口响应
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryMeiyouAudittopicResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAudittopicResponse) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAudittopicResponse) SetReqMsgId(v string) *QueryMeiyouAudittopicResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeiyouAudittopicResponse) SetResultCode(v string) *QueryMeiyouAudittopicResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeiyouAudittopicResponse) SetResultMsg(v string) *QueryMeiyouAudittopicResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeiyouAudittopicResponse) SetResult(v string) *QueryMeiyouAudittopicResponse {
	s.Result = &v
	return s
}

type UpdateMeiyouAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主题ID
	TopicIds []*int64 `json:"topic_ids,omitempty" xml:"topic_ids,omitempty" type:"Repeated"`
	// 美柚itag关联状态
	TopicState *string `json:"topic_state,omitempty" xml:"topic_state,omitempty"`
	// 审核记录ID
	AuditIds []*int64 `json:"audit_ids,omitempty" xml:"audit_ids,omitempty" type:"Repeated"`
	// 美柚itag关联状态
	AuditState *string `json:"audit_state,omitempty" xml:"audit_state,omitempty"`
	// itag任务ID
	ItagTaskId *int64 `json:"itag_task_id,omitempty" xml:"itag_task_id,omitempty"`
	// itag数据集ID
	ItagDatasetId *int64 `json:"itag_dataset_id,omitempty" xml:"itag_dataset_id,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s UpdateMeiyouAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeiyouAuditRequest) GoString() string {
	return s.String()
}

func (s *UpdateMeiyouAuditRequest) SetAuthToken(v string) *UpdateMeiyouAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetProductInstanceId(v string) *UpdateMeiyouAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetTopicIds(v []*int64) *UpdateMeiyouAuditRequest {
	s.TopicIds = v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetTopicState(v string) *UpdateMeiyouAuditRequest {
	s.TopicState = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetAuditIds(v []*int64) *UpdateMeiyouAuditRequest {
	s.AuditIds = v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetAuditState(v string) *UpdateMeiyouAuditRequest {
	s.AuditState = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetItagTaskId(v int64) *UpdateMeiyouAuditRequest {
	s.ItagTaskId = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetItagDatasetId(v int64) *UpdateMeiyouAuditRequest {
	s.ItagDatasetId = &v
	return s
}

func (s *UpdateMeiyouAuditRequest) SetSource(v string) *UpdateMeiyouAuditRequest {
	s.Source = &v
	return s
}

type UpdateMeiyouAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口响应
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateMeiyouAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeiyouAuditResponse) GoString() string {
	return s.String()
}

func (s *UpdateMeiyouAuditResponse) SetReqMsgId(v string) *UpdateMeiyouAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMeiyouAuditResponse) SetResultCode(v string) *UpdateMeiyouAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMeiyouAuditResponse) SetResultMsg(v string) *UpdateMeiyouAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateMeiyouAuditResponse) SetResult(v string) *UpdateMeiyouAuditResponse {
	s.Result = &v
	return s
}

type QueryMeiyouItagrelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 审核记录ID
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty"`
	// 主题ID
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// itag任务ID
	ItagTaskId *int64 `json:"itag_task_id,omitempty" xml:"itag_task_id,omitempty"`
	// itag数据集ID
	ItagDatasetId *int64 `json:"itag_dataset_id,omitempty" xml:"itag_dataset_id,omitempty"`
	// itag数据ID
	ItagDataId *int64 `json:"itag_data_id,omitempty" xml:"itag_data_id,omitempty"`
	// 美柚任务审核结果推送状态
	MeiyouAuditState *string `json:"meiyou_audit_state,omitempty" xml:"meiyou_audit_state,omitempty"`
	// 审核记录状态
	AuditState *string `json:"audit_state,omitempty" xml:"audit_state,omitempty"`
	// 主题记录状态
	TopicState *string `json:"topic_state,omitempty" xml:"topic_state,omitempty"`
	// 更新时间-start
	GmtModifiedStart *string `json:"gmt_modified_start,omitempty" xml:"gmt_modified_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间-end
	GmtModifiedEnd *string `json:"gmt_modified_end,omitempty" xml:"gmt_modified_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 操作人
	AuditOperator *string `json:"audit_operator,omitempty" xml:"audit_operator,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s QueryMeiyouItagrelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouItagrelationRequest) GoString() string {
	return s.String()
}

func (s *QueryMeiyouItagrelationRequest) SetAuthToken(v string) *QueryMeiyouItagrelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetProductInstanceId(v string) *QueryMeiyouItagrelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetId(v int64) *QueryMeiyouItagrelationRequest {
	s.Id = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetAuditId(v int64) *QueryMeiyouItagrelationRequest {
	s.AuditId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetTopicId(v int64) *QueryMeiyouItagrelationRequest {
	s.TopicId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetItagTaskId(v int64) *QueryMeiyouItagrelationRequest {
	s.ItagTaskId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetItagDatasetId(v int64) *QueryMeiyouItagrelationRequest {
	s.ItagDatasetId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetItagDataId(v int64) *QueryMeiyouItagrelationRequest {
	s.ItagDataId = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetMeiyouAuditState(v string) *QueryMeiyouItagrelationRequest {
	s.MeiyouAuditState = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetAuditState(v string) *QueryMeiyouItagrelationRequest {
	s.AuditState = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetTopicState(v string) *QueryMeiyouItagrelationRequest {
	s.TopicState = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetGmtModifiedStart(v string) *QueryMeiyouItagrelationRequest {
	s.GmtModifiedStart = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetGmtModifiedEnd(v string) *QueryMeiyouItagrelationRequest {
	s.GmtModifiedEnd = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetAuditOperator(v string) *QueryMeiyouItagrelationRequest {
	s.AuditOperator = &v
	return s
}

func (s *QueryMeiyouItagrelationRequest) SetSource(v string) *QueryMeiyouItagrelationRequest {
	s.Source = &v
	return s
}

type QueryMeiyouItagrelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryMeiyouItagrelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouItagrelationResponse) GoString() string {
	return s.String()
}

func (s *QueryMeiyouItagrelationResponse) SetReqMsgId(v string) *QueryMeiyouItagrelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeiyouItagrelationResponse) SetResultCode(v string) *QueryMeiyouItagrelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeiyouItagrelationResponse) SetResultMsg(v string) *QueryMeiyouItagrelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeiyouItagrelationResponse) SetResult(v string) *QueryMeiyouItagrelationResponse {
	s.Result = &v
	return s
}

type UpdateMeiyouItagrelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 更新关系信息
	RelationInfoList []*UpdateMeiyouItagRelationWebInfo `json:"relation_info_list,omitempty" xml:"relation_info_list,omitempty" type:"Repeated"`
	// 是否更新审核记录信息
	UpdateAuditFlag *bool `json:"update_audit_flag,omitempty" xml:"update_audit_flag,omitempty" require:"true"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s UpdateMeiyouItagrelationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeiyouItagrelationRequest) GoString() string {
	return s.String()
}

func (s *UpdateMeiyouItagrelationRequest) SetAuthToken(v string) *UpdateMeiyouItagrelationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMeiyouItagrelationRequest) SetProductInstanceId(v string) *UpdateMeiyouItagrelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMeiyouItagrelationRequest) SetRelationInfoList(v []*UpdateMeiyouItagRelationWebInfo) *UpdateMeiyouItagrelationRequest {
	s.RelationInfoList = v
	return s
}

func (s *UpdateMeiyouItagrelationRequest) SetUpdateAuditFlag(v bool) *UpdateMeiyouItagrelationRequest {
	s.UpdateAuditFlag = &v
	return s
}

func (s *UpdateMeiyouItagrelationRequest) SetSource(v string) *UpdateMeiyouItagrelationRequest {
	s.Source = &v
	return s
}

type UpdateMeiyouItagrelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateMeiyouItagrelationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeiyouItagrelationResponse) GoString() string {
	return s.String()
}

func (s *UpdateMeiyouItagrelationResponse) SetReqMsgId(v string) *UpdateMeiyouItagrelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMeiyouItagrelationResponse) SetResultCode(v string) *UpdateMeiyouItagrelationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMeiyouItagrelationResponse) SetResultMsg(v string) *UpdateMeiyouItagrelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateMeiyouItagrelationResponse) SetResult(v string) *UpdateMeiyouItagrelationResponse {
	s.Result = &v
	return s
}

type QueryMeiyouAuditresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核ID
	AuditIds []*int64 `json:"audit_ids,omitempty" xml:"audit_ids,omitempty" type:"Repeated"`
	// 美柚任务审核结果推送状态
	MeiyouAuditState *string `json:"meiyou_audit_state,omitempty" xml:"meiyou_audit_state,omitempty"`
	// 审核记录状态
	AuditState []*string `json:"audit_state,omitempty" xml:"audit_state,omitempty" type:"Repeated"`
	// 主题记录状态
	TopicState *string `json:"topic_state,omitempty" xml:"topic_state,omitempty"`
	// 开始时间点
	CreateStart *string `json:"create_start,omitempty" xml:"create_start,omitempty"`
	// 结束时间点
	CreateEnd *string `json:"create_end,omitempty" xml:"create_end,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s QueryMeiyouAuditresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAuditresultRequest) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAuditresultRequest) SetAuthToken(v string) *QueryMeiyouAuditresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetProductInstanceId(v string) *QueryMeiyouAuditresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetAuditIds(v []*int64) *QueryMeiyouAuditresultRequest {
	s.AuditIds = v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetMeiyouAuditState(v string) *QueryMeiyouAuditresultRequest {
	s.MeiyouAuditState = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetAuditState(v []*string) *QueryMeiyouAuditresultRequest {
	s.AuditState = v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetTopicState(v string) *QueryMeiyouAuditresultRequest {
	s.TopicState = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetCreateStart(v string) *QueryMeiyouAuditresultRequest {
	s.CreateStart = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetCreateEnd(v string) *QueryMeiyouAuditresultRequest {
	s.CreateEnd = &v
	return s
}

func (s *QueryMeiyouAuditresultRequest) SetSource(v string) *QueryMeiyouAuditresultRequest {
	s.Source = &v
	return s
}

type QueryMeiyouAuditresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryMeiyouAuditresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAuditresultResponse) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAuditresultResponse) SetReqMsgId(v string) *QueryMeiyouAuditresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeiyouAuditresultResponse) SetResultCode(v string) *QueryMeiyouAuditresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeiyouAuditresultResponse) SetResultMsg(v string) *QueryMeiyouAuditresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeiyouAuditresultResponse) SetResult(v string) *QueryMeiyouAuditresultResponse {
	s.Result = &v
	return s
}

type PagequeryMeiyouAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 页面
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 审核记录ID
	AuditId *int64 `json:"audit_id,omitempty" xml:"audit_id,omitempty"`
	// 大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 主题ID
	TopicId *int64 `json:"topic_id,omitempty" xml:"topic_id,omitempty"`
	// 内容文本
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 一级业务
	PrimaryBusiness *string `json:"primary_business,omitempty" xml:"primary_business,omitempty"`
	// 二级业务
	SecondaryBusiness *string `json:"secondary_business,omitempty" xml:"secondary_business,omitempty"`
	// 审核结果
	AuditResult *string `json:"audit_result,omitempty" xml:"audit_result,omitempty"`
	// 审核原因
	AuditReason *string `json:"audit_reason,omitempty" xml:"audit_reason,omitempty"`
	// 创建时间-start
	GmtCreateStart *string `json:"gmt_create_start,omitempty" xml:"gmt_create_start,omitempty"`
	// 创建时间-end
	GmtCreateEnd *string `json:"gmt_create_end,omitempty" xml:"gmt_create_end,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s PagequeryMeiyouAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryMeiyouAuditRequest) GoString() string {
	return s.String()
}

func (s *PagequeryMeiyouAuditRequest) SetAuthToken(v string) *PagequeryMeiyouAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetProductInstanceId(v string) *PagequeryMeiyouAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetId(v int64) *PagequeryMeiyouAuditRequest {
	s.Id = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetPageNum(v int64) *PagequeryMeiyouAuditRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetAuditId(v int64) *PagequeryMeiyouAuditRequest {
	s.AuditId = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetPageSize(v int64) *PagequeryMeiyouAuditRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetTopicId(v int64) *PagequeryMeiyouAuditRequest {
	s.TopicId = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetContent(v string) *PagequeryMeiyouAuditRequest {
	s.Content = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetPrimaryBusiness(v string) *PagequeryMeiyouAuditRequest {
	s.PrimaryBusiness = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetSecondaryBusiness(v string) *PagequeryMeiyouAuditRequest {
	s.SecondaryBusiness = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetAuditResult(v string) *PagequeryMeiyouAuditRequest {
	s.AuditResult = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetAuditReason(v string) *PagequeryMeiyouAuditRequest {
	s.AuditReason = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetGmtCreateStart(v string) *PagequeryMeiyouAuditRequest {
	s.GmtCreateStart = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetGmtCreateEnd(v string) *PagequeryMeiyouAuditRequest {
	s.GmtCreateEnd = &v
	return s
}

func (s *PagequeryMeiyouAuditRequest) SetSource(v string) *PagequeryMeiyouAuditRequest {
	s.Source = &v
	return s
}

type PagequeryMeiyouAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应信息
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PagequeryMeiyouAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryMeiyouAuditResponse) GoString() string {
	return s.String()
}

func (s *PagequeryMeiyouAuditResponse) SetReqMsgId(v string) *PagequeryMeiyouAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryMeiyouAuditResponse) SetResultCode(v string) *PagequeryMeiyouAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryMeiyouAuditResponse) SetResultMsg(v string) *PagequeryMeiyouAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryMeiyouAuditResponse) SetResult(v string) *PagequeryMeiyouAuditResponse {
	s.Result = &v
	return s
}

type SubmitAuditMeiyouRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 美柚审核信息存储请求
	SaveInfo []*MeiyouAuditSaveWebRequest `json:"save_info,omitempty" xml:"save_info,omitempty" type:"Repeated"`
}

func (s SubmitAuditMeiyouRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditMeiyouRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditMeiyouRequest) SetAuthToken(v string) *SubmitAuditMeiyouRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditMeiyouRequest) SetProductInstanceId(v string) *SubmitAuditMeiyouRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditMeiyouRequest) SetSource(v string) *SubmitAuditMeiyouRequest {
	s.Source = &v
	return s
}

func (s *SubmitAuditMeiyouRequest) SetSaveInfo(v []*MeiyouAuditSaveWebRequest) *SubmitAuditMeiyouRequest {
	s.SaveInfo = v
	return s
}

type SubmitAuditMeiyouResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SubmitAuditMeiyouResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditMeiyouResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditMeiyouResponse) SetReqMsgId(v string) *SubmitAuditMeiyouResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditMeiyouResponse) SetResultCode(v string) *SubmitAuditMeiyouResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditMeiyouResponse) SetResultMsg(v string) *SubmitAuditMeiyouResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditMeiyouResponse) SetResult(v string) *SubmitAuditMeiyouResponse {
	s.Result = &v
	return s
}

type SubmitAuditDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
	// 审核时输入的额外信息
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
}

func (s SubmitAuditDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditDocumentRequest) GoString() string {
	return s.String()
}

func (s *SubmitAuditDocumentRequest) SetAuthToken(v string) *SubmitAuditDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetProductInstanceId(v string) *SubmitAuditDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetUrl(v string) *SubmitAuditDocumentRequest {
	s.Url = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetScene(v string) *SubmitAuditDocumentRequest {
	s.Scene = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetDataId(v string) *SubmitAuditDocumentRequest {
	s.DataId = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetBusinessId(v string) *SubmitAuditDocumentRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetCallback(v string) *SubmitAuditDocumentRequest {
	s.Callback = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetSeed(v string) *SubmitAuditDocumentRequest {
	s.Seed = &v
	return s
}

func (s *SubmitAuditDocumentRequest) SetExtendInfo(v string) *SubmitAuditDocumentRequest {
	s.ExtendInfo = &v
	return s
}

type SubmitAuditDocumentResponse struct {
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

func (s SubmitAuditDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAuditDocumentResponse) GoString() string {
	return s.String()
}

func (s *SubmitAuditDocumentResponse) SetReqMsgId(v string) *SubmitAuditDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAuditDocumentResponse) SetResultCode(v string) *SubmitAuditDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAuditDocumentResponse) SetResultMsg(v string) *SubmitAuditDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAuditDocumentResponse) SetTaskId(v string) *SubmitAuditDocumentResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitAuditDocumentResponse) SetDataId(v string) *SubmitAuditDocumentResponse {
	s.DataId = &v
	return s
}

type QueryAuditDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAuditDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditDocumentRequest) GoString() string {
	return s.String()
}

func (s *QueryAuditDocumentRequest) SetAuthToken(v string) *QueryAuditDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuditDocumentRequest) SetProductInstanceId(v string) *QueryAuditDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuditDocumentRequest) SetTaskId(v string) *QueryAuditDocumentRequest {
	s.TaskId = &v
	return s
}

type QueryAuditDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAuditDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuditDocumentResponse) GoString() string {
	return s.String()
}

func (s *QueryAuditDocumentResponse) SetReqMsgId(v string) *QueryAuditDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuditDocumentResponse) SetResultCode(v string) *QueryAuditDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuditDocumentResponse) SetResultMsg(v string) *QueryAuditDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuditDocumentResponse) SetResult(v string) *QueryAuditDocumentResponse {
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

type SubmitMeiyouAuditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据Id
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 模态
	Modal *string `json:"modal,omitempty" xml:"modal,omitempty" require:"true"`
	// 场景
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 美柚审核记录信息
	AuditInfo *string `json:"audit_info,omitempty" xml:"audit_info,omitempty" require:"true"`
	// 回调函数
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty" require:"true"`
	// 租户
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
}

func (s SubmitMeiyouAuditRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitMeiyouAuditRequest) GoString() string {
	return s.String()
}

func (s *SubmitMeiyouAuditRequest) SetAuthToken(v string) *SubmitMeiyouAuditRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetProductInstanceId(v string) *SubmitMeiyouAuditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetDataId(v string) *SubmitMeiyouAuditRequest {
	s.DataId = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetModal(v string) *SubmitMeiyouAuditRequest {
	s.Modal = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetSceneCode(v string) *SubmitMeiyouAuditRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetExtInfo(v string) *SubmitMeiyouAuditRequest {
	s.ExtInfo = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetAuditInfo(v string) *SubmitMeiyouAuditRequest {
	s.AuditInfo = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetCallback(v string) *SubmitMeiyouAuditRequest {
	s.Callback = &v
	return s
}

func (s *SubmitMeiyouAuditRequest) SetTenantCode(v string) *SubmitMeiyouAuditRequest {
	s.TenantCode = &v
	return s
}

type SubmitMeiyouAuditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 码值
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s SubmitMeiyouAuditResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitMeiyouAuditResponse) GoString() string {
	return s.String()
}

func (s *SubmitMeiyouAuditResponse) SetReqMsgId(v string) *SubmitMeiyouAuditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetResultCode(v string) *SubmitMeiyouAuditResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetResultMsg(v string) *SubmitMeiyouAuditResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetResult(v string) *SubmitMeiyouAuditResponse {
	s.Result = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetErrorCode(v string) *SubmitMeiyouAuditResponse {
	s.ErrorCode = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetErrorMessage(v string) *SubmitMeiyouAuditResponse {
	s.ErrorMessage = &v
	return s
}

func (s *SubmitMeiyouAuditResponse) SetRequestId(v string) *SubmitMeiyouAuditResponse {
	s.RequestId = &v
	return s
}

type QueryMeiyouAgentauditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据创建时间-开始时间点
	GmtCreateStart *string `json:"gmt_create_start,omitempty" xml:"gmt_create_start,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数据创建时间-结束时间点
	GmtCreateEnd *string `json:"gmt_create_end,omitempty" xml:"gmt_create_end,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 所属
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
}

func (s QueryMeiyouAgentauditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAgentauditRequest) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAgentauditRequest) SetAuthToken(v string) *QueryMeiyouAgentauditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeiyouAgentauditRequest) SetProductInstanceId(v string) *QueryMeiyouAgentauditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeiyouAgentauditRequest) SetGmtCreateStart(v string) *QueryMeiyouAgentauditRequest {
	s.GmtCreateStart = &v
	return s
}

func (s *QueryMeiyouAgentauditRequest) SetGmtCreateEnd(v string) *QueryMeiyouAgentauditRequest {
	s.GmtCreateEnd = &v
	return s
}

func (s *QueryMeiyouAgentauditRequest) SetOwner(v string) *QueryMeiyouAgentauditRequest {
	s.Owner = &v
	return s
}

type QueryMeiyouAgentauditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 码值
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryMeiyouAgentauditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeiyouAgentauditResponse) GoString() string {
	return s.String()
}

func (s *QueryMeiyouAgentauditResponse) SetReqMsgId(v string) *QueryMeiyouAgentauditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetResultCode(v string) *QueryMeiyouAgentauditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetResultMsg(v string) *QueryMeiyouAgentauditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetResult(v string) *QueryMeiyouAgentauditResponse {
	s.Result = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetErrorCode(v string) *QueryMeiyouAgentauditResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetErrorMessage(v string) *QueryMeiyouAgentauditResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryMeiyouAgentauditResponse) SetRequestId(v string) *QueryMeiyouAgentauditResponse {
	s.RequestId = &v
	return s
}

type UpdateAicoguardcoreMeiyouRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 更新信息
	ResultInfo *string `json:"result_info,omitempty" xml:"result_info,omitempty" require:"true"`
}

func (s UpdateAicoguardcoreMeiyouRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAicoguardcoreMeiyouRequest) GoString() string {
	return s.String()
}

func (s *UpdateAicoguardcoreMeiyouRequest) SetAuthToken(v string) *UpdateAicoguardcoreMeiyouRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouRequest) SetProductInstanceId(v string) *UpdateAicoguardcoreMeiyouRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouRequest) SetResultInfo(v string) *UpdateAicoguardcoreMeiyouRequest {
	s.ResultInfo = &v
	return s
}

type UpdateAicoguardcoreMeiyouResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应码值
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 响应描述
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s UpdateAicoguardcoreMeiyouResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAicoguardcoreMeiyouResponse) GoString() string {
	return s.String()
}

func (s *UpdateAicoguardcoreMeiyouResponse) SetReqMsgId(v string) *UpdateAicoguardcoreMeiyouResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouResponse) SetResultCode(v string) *UpdateAicoguardcoreMeiyouResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouResponse) SetResultMsg(v string) *UpdateAicoguardcoreMeiyouResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouResponse) SetErrorCode(v string) *UpdateAicoguardcoreMeiyouResponse {
	s.ErrorCode = &v
	return s
}

func (s *UpdateAicoguardcoreMeiyouResponse) SetErrorMessage(v string) *UpdateAicoguardcoreMeiyouResponse {
	s.ErrorMessage = &v
	return s
}

type SubmitGuardDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
	// 说明 ：
	// URL地址中不能包含中文，且一次请求请确保仅传入1条URL
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 审核场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 检测对象对应的数据ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 标识上游应用来源，字符串长度不能超过 128
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 客户业务ID。
	// 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 结果通知地址，不指定时需要调用方主动查询结果
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
	Seed *string `json:"seed,omitempty" xml:"seed,omitempty"`
}

func (s SubmitGuardDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardDocumentRequest) GoString() string {
	return s.String()
}

func (s *SubmitGuardDocumentRequest) SetAuthToken(v string) *SubmitGuardDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetProductInstanceId(v string) *SubmitGuardDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetUrl(v string) *SubmitGuardDocumentRequest {
	s.Url = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetSceneCode(v string) *SubmitGuardDocumentRequest {
	s.SceneCode = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetDataId(v string) *SubmitGuardDocumentRequest {
	s.DataId = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetAppCode(v string) *SubmitGuardDocumentRequest {
	s.AppCode = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetBusinessId(v string) *SubmitGuardDocumentRequest {
	s.BusinessId = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetCallback(v string) *SubmitGuardDocumentRequest {
	s.Callback = &v
	return s
}

func (s *SubmitGuardDocumentRequest) SetSeed(v string) *SubmitGuardDocumentRequest {
	s.Seed = &v
	return s
}

type SubmitGuardDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 检测对象对应的数据ID。
	// 说明：
	// 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty"`
}

func (s SubmitGuardDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitGuardDocumentResponse) GoString() string {
	return s.String()
}

func (s *SubmitGuardDocumentResponse) SetReqMsgId(v string) *SubmitGuardDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitGuardDocumentResponse) SetResultCode(v string) *SubmitGuardDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitGuardDocumentResponse) SetResultMsg(v string) *SubmitGuardDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitGuardDocumentResponse) SetTaskId(v string) *SubmitGuardDocumentResponse {
	s.TaskId = &v
	return s
}

func (s *SubmitGuardDocumentResponse) SetDataId(v string) *SubmitGuardDocumentResponse {
	s.DataId = &v
	return s
}

type QueryGuardDocumentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryGuardDocumentRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardDocumentRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardDocumentRequest) SetAuthToken(v string) *QueryGuardDocumentRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardDocumentRequest) SetProductInstanceId(v string) *QueryGuardDocumentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardDocumentRequest) SetTaskId(v string) *QueryGuardDocumentRequest {
	s.TaskId = &v
	return s
}

type QueryGuardDocumentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档审核结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryGuardDocumentResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardDocumentResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardDocumentResponse) SetReqMsgId(v string) *QueryGuardDocumentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardDocumentResponse) SetResultCode(v string) *QueryGuardDocumentResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardDocumentResponse) SetResultMsg(v string) *QueryGuardDocumentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardDocumentResponse) SetResult(v string) *QueryGuardDocumentResponse {
	s.Result = &v
	return s
}

type QuerySecurityQuestionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方唯一标示
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 提问内容
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true" maxLength:"10000"`
	// 调用方标示
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 场景code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 标示是否是同一个Q&A
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 是否开启流式检测功能。默认值：N：不开启，Y：开启
	MultiSessionDetect *string `json:"multi_session_detect,omitempty" xml:"multi_session_detect,omitempty"`
	// 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
	PromptReword *string `json:"prompt_reword,omitempty" xml:"prompt_reword,omitempty"`
	// 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
	FinanceComplianceDetection *string `json:"finance_compliance_detection,omitempty" xml:"finance_compliance_detection,omitempty"`
	// 是否需要针对提问内容的进行领域识别
	FieldIdentify *string `json:"field_identify,omitempty" xml:"field_identify,omitempty"`
	// 是否开启提示词攻击防御功能
	PromptAttackDefense *string `json:"prompt_attack_defense,omitempty" xml:"prompt_attack_defense,omitempty"`
	// 是否开启隐私数据泄露的专项检测
	PrivacyDataDetection *string `json:"privacy_data_detection,omitempty" xml:"privacy_data_detection,omitempty"`
	// 是否开启安全代答功能
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// 自定义白库检测，默认开启，仅 N 关闭
	CustomWhiteCheck *string `json:"custom_white_check,omitempty" xml:"custom_white_check,omitempty"`
	// 自定义黑词检测，默认开启，仅 N 关闭
	CustomBlackWordCheck *string `json:"custom_black_word_check,omitempty" xml:"custom_black_word_check,omitempty"`
	// 前置知识库代答，默认开启，仅 N 关闭
	PreSecurityAnswer *string `json:"pre_security_answer,omitempty" xml:"pre_security_answer,omitempty"`
	// Universal/金融图谱案例召回，默认开启，仅 N 关闭
	GraphCaseRecall *string `json:"graph_case_recall,omitempty" xml:"graph_case_recall,omitempty"`
}

func (s QuerySecurityQuestionRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityQuestionRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityQuestionRequest) SetAuthToken(v string) *QuerySecurityQuestionRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetProductInstanceId(v string) *QuerySecurityQuestionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetEnterprise(v string) *QuerySecurityQuestionRequest {
	s.Enterprise = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetQuestion(v string) *QuerySecurityQuestionRequest {
	s.Question = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetBusinessId(v string) *QuerySecurityQuestionRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetSceneCode(v string) *QuerySecurityQuestionRequest {
	s.SceneCode = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetMessageId(v string) *QuerySecurityQuestionRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetSessionId(v string) *QuerySecurityQuestionRequest {
	s.SessionId = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetMultiSessionDetect(v string) *QuerySecurityQuestionRequest {
	s.MultiSessionDetect = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetPromptReword(v string) *QuerySecurityQuestionRequest {
	s.PromptReword = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetFinanceComplianceDetection(v string) *QuerySecurityQuestionRequest {
	s.FinanceComplianceDetection = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetFieldIdentify(v string) *QuerySecurityQuestionRequest {
	s.FieldIdentify = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetPromptAttackDefense(v string) *QuerySecurityQuestionRequest {
	s.PromptAttackDefense = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetPrivacyDataDetection(v string) *QuerySecurityQuestionRequest {
	s.PrivacyDataDetection = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetSecurityAnswer(v string) *QuerySecurityQuestionRequest {
	s.SecurityAnswer = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetCustomWhiteCheck(v string) *QuerySecurityQuestionRequest {
	s.CustomWhiteCheck = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetCustomBlackWordCheck(v string) *QuerySecurityQuestionRequest {
	s.CustomBlackWordCheck = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetPreSecurityAnswer(v string) *QuerySecurityQuestionRequest {
	s.PreSecurityAnswer = &v
	return s
}

func (s *QuerySecurityQuestionRequest) SetGraphCaseRecall(v string) *QuerySecurityQuestionRequest {
	s.GraphCaseRecall = &v
	return s
}

type QuerySecurityQuestionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 命中的自定义黑词列表
	CustomizeRiskWord []*string `json:"customize_risk_word,omitempty" xml:"customize_risk_word,omitempty" type:"Repeated"`
	// 风险标签
	Labels []*LabelModel `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// 会话Id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 表示是同一个Q&A
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 兜底话术
	LimitAnswer *string `json:"limit_answer,omitempty" xml:"limit_answer,omitempty"`
	// 有风险时的安全代答
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// 当请求参数 promptReword=Y 时返回，为安全改写后的内容
	SecurityPrompt *string `json:"security_prompt,omitempty" xml:"security_prompt,omitempty"`
	// 提示词攻击手法标签
	AttackLabels *AttackLabel `json:"attack_labels,omitempty" xml:"attack_labels,omitempty"`
	// 领域标签信息
	FieldInfo *FieldModel `json:"field_info,omitempty" xml:"field_info,omitempty"`
	// 安全代答匹配到的Q
	MatchQ *string `json:"match_q,omitempty" xml:"match_q,omitempty"`
	// 越狱手法标签
	JailbreakLabel *string `json:"jailbreak_label,omitempty" xml:"jailbreak_label,omitempty"`
	// universal模型请求参数
	UniversalPrompt *string `json:"universal_prompt,omitempty" xml:"universal_prompt,omitempty"`
	// universal模型返回结果
	UniversalOutput *string `json:"universal_output,omitempty" xml:"universal_output,omitempty"`
	// 金融V3模型请求参数
	FinancePrompt *string `json:"finance_prompt,omitempty" xml:"finance_prompt,omitempty"`
	// 金融V3模型返回结果
	FinanceOutput *string `json:"finance_output,omitempty" xml:"finance_output,omitempty"`
	// 策略版本号
	StrategyVersion *string `json:"strategy_version,omitempty" xml:"strategy_version,omitempty"`
	// 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
	// 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
	//  对应的结果为Map转化的JSON字符串
	DebugInfo *string `json:"debug_info,omitempty" xml:"debug_info,omitempty"`
	// 金融合规深度审核——命中的风险点列表（JSON 数组字符串；仅深审开时返回，非深审场景不输出）
	FindeepdiveResult *string `json:"findeepdive_result,omitempty" xml:"findeepdive_result,omitempty"`
	// 金融合规深度审核——整体结论（block/warning/pass；仅深审开时返回）
	FinDeepDiveOverall *string `json:"fin_deep_dive_overall,omitempty" xml:"fin_deep_dive_overall,omitempty"`
}

func (s QuerySecurityQuestionResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityQuestionResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityQuestionResponse) SetReqMsgId(v string) *QuerySecurityQuestionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetResultCode(v string) *QuerySecurityQuestionResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetResultMsg(v string) *QuerySecurityQuestionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetActionCode(v string) *QuerySecurityQuestionResponse {
	s.ActionCode = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetCustomizeRiskWord(v []*string) *QuerySecurityQuestionResponse {
	s.CustomizeRiskWord = v
	return s
}

func (s *QuerySecurityQuestionResponse) SetLabels(v []*LabelModel) *QuerySecurityQuestionResponse {
	s.Labels = v
	return s
}

func (s *QuerySecurityQuestionResponse) SetSessionId(v string) *QuerySecurityQuestionResponse {
	s.SessionId = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetMessageId(v string) *QuerySecurityQuestionResponse {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetLimitAnswer(v string) *QuerySecurityQuestionResponse {
	s.LimitAnswer = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetSecurityAnswer(v string) *QuerySecurityQuestionResponse {
	s.SecurityAnswer = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetSecurityPrompt(v string) *QuerySecurityQuestionResponse {
	s.SecurityPrompt = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetAttackLabels(v *AttackLabel) *QuerySecurityQuestionResponse {
	s.AttackLabels = v
	return s
}

func (s *QuerySecurityQuestionResponse) SetFieldInfo(v *FieldModel) *QuerySecurityQuestionResponse {
	s.FieldInfo = v
	return s
}

func (s *QuerySecurityQuestionResponse) SetMatchQ(v string) *QuerySecurityQuestionResponse {
	s.MatchQ = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetJailbreakLabel(v string) *QuerySecurityQuestionResponse {
	s.JailbreakLabel = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetUniversalPrompt(v string) *QuerySecurityQuestionResponse {
	s.UniversalPrompt = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetUniversalOutput(v string) *QuerySecurityQuestionResponse {
	s.UniversalOutput = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetFinancePrompt(v string) *QuerySecurityQuestionResponse {
	s.FinancePrompt = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetFinanceOutput(v string) *QuerySecurityQuestionResponse {
	s.FinanceOutput = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetStrategyVersion(v string) *QuerySecurityQuestionResponse {
	s.StrategyVersion = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetTokenUsage(v *TokenUsageSummary) *QuerySecurityQuestionResponse {
	s.TokenUsage = v
	return s
}

func (s *QuerySecurityQuestionResponse) SetDebugInfo(v string) *QuerySecurityQuestionResponse {
	s.DebugInfo = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetFindeepdiveResult(v string) *QuerySecurityQuestionResponse {
	s.FindeepdiveResult = &v
	return s
}

func (s *QuerySecurityQuestionResponse) SetFinDeepDiveOverall(v string) *QuerySecurityQuestionResponse {
	s.FinDeepDiveOverall = &v
	return s
}

type QuerySecurityAnswerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用标示
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 细分调用方标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 当前回答内容，最大长度40000个字符
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true" maxLength:"40000"`
	// 场景code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 是否开启流式检测功能。默认值：N：不开启，Y：开启
	FlowDetect *string `json:"flow_detect,omitempty" xml:"flow_detect,omitempty"`
	// 会话id
	FlowMsgId *string `json:"flow_msg_id,omitempty" xml:"flow_msg_id,omitempty"`
	// 流失内容结束标示
	FlowEnd *string `json:"flow_end,omitempty" xml:"flow_end,omitempty"`
	// 表示是同一个Q&A
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
	PrivacyDataObfuscation *string `json:"privacy_data_obfuscation,omitempty" xml:"privacy_data_obfuscation,omitempty"`
	// 是否开启隐私数据泄露的专项检测（新字段，老privacy废弃）
	PrivacyDataDetection *string `json:"privacy_data_detection,omitempty" xml:"privacy_data_detection,omitempty"`
	// 用户原提问（输出 max 接口必需，用于医疗合规检测送模型）
	Question *string `json:"question,omitempty" xml:"question,omitempty"`
	// 自定义白库检测，默认开启，仅 N 关闭
	CustomWhiteCheck *string `json:"custom_white_check,omitempty" xml:"custom_white_check,omitempty"`
	// 自定义黑词检测，默认开启，仅 N 关闭
	CustomBlackWordCheck *string `json:"custom_black_word_check,omitempty" xml:"custom_black_word_check,omitempty"`
	// Universal/金融图谱案例召回，默认开启，仅 N 关闭
	GraphCaseRecall *string `json:"graph_case_recall,omitempty" xml:"graph_case_recall,omitempty"`
}

func (s QuerySecurityAnswerRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityAnswerRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityAnswerRequest) SetAuthToken(v string) *QuerySecurityAnswerRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetProductInstanceId(v string) *QuerySecurityAnswerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetEnterprise(v string) *QuerySecurityAnswerRequest {
	s.Enterprise = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetBusinessId(v string) *QuerySecurityAnswerRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetContent(v string) *QuerySecurityAnswerRequest {
	s.Content = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetSceneCode(v string) *QuerySecurityAnswerRequest {
	s.SceneCode = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetFlowDetect(v string) *QuerySecurityAnswerRequest {
	s.FlowDetect = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetFlowMsgId(v string) *QuerySecurityAnswerRequest {
	s.FlowMsgId = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetFlowEnd(v string) *QuerySecurityAnswerRequest {
	s.FlowEnd = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetMessageId(v string) *QuerySecurityAnswerRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetPrivacyDataObfuscation(v string) *QuerySecurityAnswerRequest {
	s.PrivacyDataObfuscation = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetPrivacyDataDetection(v string) *QuerySecurityAnswerRequest {
	s.PrivacyDataDetection = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetQuestion(v string) *QuerySecurityAnswerRequest {
	s.Question = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetCustomWhiteCheck(v string) *QuerySecurityAnswerRequest {
	s.CustomWhiteCheck = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetCustomBlackWordCheck(v string) *QuerySecurityAnswerRequest {
	s.CustomBlackWordCheck = &v
	return s
}

func (s *QuerySecurityAnswerRequest) SetGraphCaseRecall(v string) *QuerySecurityAnswerRequest {
	s.GraphCaseRecall = &v
	return s
}

type QuerySecurityAnswerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 风险标签
	Labels []*LabelModel `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// 命中的自定义黑词列表
	CustomizeRiskWord []*string `json:"customize_risk_word,omitempty" xml:"customize_risk_word,omitempty" type:"Repeated"`
	// 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
	// 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
	// 2. done：处理完成，请参考actionCode及对应的风险标签信息
	FlowProcessState *string `json:"flow_process_state,omitempty" xml:"flow_process_state,omitempty"`
	// 流式内容ID
	FlowMsgId *string `json:"flow_msg_id,omitempty" xml:"flow_msg_id,omitempty"`
	// 表示是同一个Q&A
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 兜底话术
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// universal模型请求参数
	UniversalPrompt *string `json:"universal_prompt,omitempty" xml:"universal_prompt,omitempty"`
	// universal模型返回结果
	UniversalOutput *string `json:"universal_output,omitempty" xml:"universal_output,omitempty"`
	// 金融V3模型请求参数
	FinancePrompt *string `json:"finance_prompt,omitempty" xml:"finance_prompt,omitempty"`
	// 金融V3模型返回结果
	FinanceOutput *string `json:"finance_output,omitempty" xml:"finance_output,omitempty"`
	// 策略版本号
	StrategyVersion *string `json:"strategy_version,omitempty" xml:"strategy_version,omitempty"`
	// 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
	// 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
	// 对应的结果为Map转化的JSON字符串
	DebugInfo *string `json:"debug_info,omitempty" xml:"debug_info,omitempty"`
}

func (s QuerySecurityAnswerResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityAnswerResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityAnswerResponse) SetReqMsgId(v string) *QuerySecurityAnswerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetResultCode(v string) *QuerySecurityAnswerResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetResultMsg(v string) *QuerySecurityAnswerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetActionCode(v string) *QuerySecurityAnswerResponse {
	s.ActionCode = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetLabels(v []*LabelModel) *QuerySecurityAnswerResponse {
	s.Labels = v
	return s
}

func (s *QuerySecurityAnswerResponse) SetCustomizeRiskWord(v []*string) *QuerySecurityAnswerResponse {
	s.CustomizeRiskWord = v
	return s
}

func (s *QuerySecurityAnswerResponse) SetFlowProcessState(v string) *QuerySecurityAnswerResponse {
	s.FlowProcessState = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetFlowMsgId(v string) *QuerySecurityAnswerResponse {
	s.FlowMsgId = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetMessageId(v string) *QuerySecurityAnswerResponse {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetSecurityAnswer(v string) *QuerySecurityAnswerResponse {
	s.SecurityAnswer = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetUniversalPrompt(v string) *QuerySecurityAnswerResponse {
	s.UniversalPrompt = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetUniversalOutput(v string) *QuerySecurityAnswerResponse {
	s.UniversalOutput = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetFinancePrompt(v string) *QuerySecurityAnswerResponse {
	s.FinancePrompt = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetFinanceOutput(v string) *QuerySecurityAnswerResponse {
	s.FinanceOutput = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetStrategyVersion(v string) *QuerySecurityAnswerResponse {
	s.StrategyVersion = &v
	return s
}

func (s *QuerySecurityAnswerResponse) SetTokenUsage(v *TokenUsageSummary) *QuerySecurityAnswerResponse {
	s.TokenUsage = v
	return s
}

func (s *QuerySecurityAnswerResponse) SetDebugInfo(v string) *QuerySecurityAnswerResponse {
	s.DebugInfo = &v
	return s
}

type QuerySecurityImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方唯一标示
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 租户id
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 图片风险监测code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 标示是否是同一个Q&A
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 待检测图片地址
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty" require:"true"`
	// 图片检测内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s QuerySecurityImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityImageRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityImageRequest) SetAuthToken(v string) *QuerySecurityImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityImageRequest) SetProductInstanceId(v string) *QuerySecurityImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityImageRequest) SetEnterprise(v string) *QuerySecurityImageRequest {
	s.Enterprise = &v
	return s
}

func (s *QuerySecurityImageRequest) SetBusinessId(v string) *QuerySecurityImageRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityImageRequest) SetSceneCode(v string) *QuerySecurityImageRequest {
	s.SceneCode = &v
	return s
}

func (s *QuerySecurityImageRequest) SetMessageId(v string) *QuerySecurityImageRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityImageRequest) SetImageUrl(v string) *QuerySecurityImageRequest {
	s.ImageUrl = &v
	return s
}

func (s *QuerySecurityImageRequest) SetContent(v string) *QuerySecurityImageRequest {
	s.Content = &v
	return s
}

type QuerySecurityImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代表风险等级和建议的处置结论
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 排黑排白命中结果（命中时携带详细信息，未命中或未启用为 null）
	ImageBlackWhiteResult *ImageBlackWhiteResult `json:"image_black_white_result,omitempty" xml:"image_black_white_result,omitempty"`
	// 本次接口请求内所有大模型调用的 token 汇总。
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
}

func (s QuerySecurityImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityImageResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityImageResponse) SetReqMsgId(v string) *QuerySecurityImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityImageResponse) SetResultCode(v string) *QuerySecurityImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityImageResponse) SetResultMsg(v string) *QuerySecurityImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityImageResponse) SetActionCode(v string) *QuerySecurityImageResponse {
	s.ActionCode = &v
	return s
}

func (s *QuerySecurityImageResponse) SetImageBlackWhiteResult(v *ImageBlackWhiteResult) *QuerySecurityImageResponse {
	s.ImageBlackWhiteResult = v
	return s
}

func (s *QuerySecurityImageResponse) SetTokenUsage(v *TokenUsageSummary) *QuerySecurityImageResponse {
	s.TokenUsage = v
	return s
}

type UploadSecurityQuestionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// txt/pdf 文件，解析为文本（FileParseUtil），空内容报「文件内容为空」
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 归一化后须 question 前缀，否则兜底 LLM_INPUT_DETECTION
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识（老值兼容替换）
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 企业标识
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 访问控制维度
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 多轮会话 ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 多轮检测开关
	MultiSessionDetect *string `json:"multi_session_detect,omitempty" xml:"multi_session_detect,omitempty"`
	// 安全改写开关
	PromptReword *string `json:"prompt_reword,omitempty" xml:"prompt_reword,omitempty"`
	// 安全代答开关
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// 领域识别开关
	FieldIdentify *string `json:"field_identify,omitempty" xml:"field_identify,omitempty"`
}

func (s UploadSecurityQuestionRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityQuestionRequest) GoString() string {
	return s.String()
}

func (s *UploadSecurityQuestionRequest) SetAuthToken(v string) *UploadSecurityQuestionRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetProductInstanceId(v string) *UploadSecurityQuestionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetFileUrl(v string) *UploadSecurityQuestionRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetSceneCode(v string) *UploadSecurityQuestionRequest {
	s.SceneCode = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetBusinessId(v string) *UploadSecurityQuestionRequest {
	s.BusinessId = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetEnterprise(v string) *UploadSecurityQuestionRequest {
	s.Enterprise = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetAccountId(v string) *UploadSecurityQuestionRequest {
	s.AccountId = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetMessageId(v string) *UploadSecurityQuestionRequest {
	s.MessageId = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetSessionId(v string) *UploadSecurityQuestionRequest {
	s.SessionId = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetMultiSessionDetect(v string) *UploadSecurityQuestionRequest {
	s.MultiSessionDetect = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetPromptReword(v string) *UploadSecurityQuestionRequest {
	s.PromptReword = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetSecurityAnswer(v string) *UploadSecurityQuestionRequest {
	s.SecurityAnswer = &v
	return s
}

func (s *UploadSecurityQuestionRequest) SetFieldIdentify(v string) *UploadSecurityQuestionRequest {
	s.FieldIdentify = &v
	return s
}

type UploadSecurityQuestionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS/BLOCK/SECURITY_ANSWER/SECURITY_WARNING
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 风险标签（label + subLabels[]：subLabel/riskWords/riskWordsIndex/thirdLabels）
	Labels []*LabelModel `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// 命中自定义风险词
	CustomizeRiskWord []*string `json:"customize_risk_word,omitempty" xml:"customize_risk_word,omitempty" type:"Repeated"`
	// 拒答话术
	LimitAnswer *string `json:"limit_answer,omitempty" xml:"limit_answer,omitempty"`
	// 回传消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 知识库匹配提问
	MatchQ *string `json:"match_q,omitempty" xml:"match_q,omitempty"`
	// 安全代答内容
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// 安全提示
	SecurityPrompt *string `json:"security_prompt,omitempty" xml:"security_prompt,omitempty"`
	// 越狱标签（旧字段）
	JailbreakLabel *string `json:"jailbreak_label,omitempty" xml:"jailbreak_label,omitempty"`
	// 攻击标签（attackLabel + attackSubLabels[]）
	AttackLabels []*AttackLabelModel `json:"attack_labels,omitempty" xml:"attack_labels,omitempty" type:"Repeated"`
	// 领域识别（fieldCategory/fieldLabel/fieldScore:Double）
	FieldInfo *FieldModel `json:"field_info,omitempty" xml:"field_info,omitempty"`
	// 回传会话 ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
	// ASR 转写文本（文本链路恒 null）
	TranscribedText *string `json:"transcribed_text,omitempty" xml:"transcribed_text,omitempty"`
	// 调试信息（当前链路无填充，恒 null）
	DebugInfo *string `json:"debug_info,omitempty" xml:"debug_info,omitempty"`
	// 金融深挖结果
	FindeepdiveResult *string `json:"findeepdive_result,omitempty" xml:"findeepdive_result,omitempty"`
	// 金融深挖总览
	FinDeepDiveOverall *string `json:"fin_deep_dive_overall,omitempty" xml:"fin_deep_dive_overall,omitempty"`
	// Universal 调试-提示词
	UniversalPrompt *string `json:"universal_prompt,omitempty" xml:"universal_prompt,omitempty"`
	// Universal 调试-输出
	UniversalOutput *string `json:"universal_output,omitempty" xml:"universal_output,omitempty"`
	// 金融调试-提示词
	FinancePrompt *string `json:"finance_prompt,omitempty" xml:"finance_prompt,omitempty"`
	// 金融调试-输出
	FinanceOutput *string `json:"finance_output,omitempty" xml:"finance_output,omitempty"`
	// 策略版本
	StrategyVersion *string `json:"strategy_version,omitempty" xml:"strategy_version,omitempty"`
}

func (s UploadSecurityQuestionResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityQuestionResponse) GoString() string {
	return s.String()
}

func (s *UploadSecurityQuestionResponse) SetReqMsgId(v string) *UploadSecurityQuestionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetResultCode(v string) *UploadSecurityQuestionResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetResultMsg(v string) *UploadSecurityQuestionResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetActionCode(v string) *UploadSecurityQuestionResponse {
	s.ActionCode = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetLabels(v []*LabelModel) *UploadSecurityQuestionResponse {
	s.Labels = v
	return s
}

func (s *UploadSecurityQuestionResponse) SetCustomizeRiskWord(v []*string) *UploadSecurityQuestionResponse {
	s.CustomizeRiskWord = v
	return s
}

func (s *UploadSecurityQuestionResponse) SetLimitAnswer(v string) *UploadSecurityQuestionResponse {
	s.LimitAnswer = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetMessageId(v string) *UploadSecurityQuestionResponse {
	s.MessageId = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetMatchQ(v string) *UploadSecurityQuestionResponse {
	s.MatchQ = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetSecurityAnswer(v string) *UploadSecurityQuestionResponse {
	s.SecurityAnswer = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetSecurityPrompt(v string) *UploadSecurityQuestionResponse {
	s.SecurityPrompt = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetJailbreakLabel(v string) *UploadSecurityQuestionResponse {
	s.JailbreakLabel = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetAttackLabels(v []*AttackLabelModel) *UploadSecurityQuestionResponse {
	s.AttackLabels = v
	return s
}

func (s *UploadSecurityQuestionResponse) SetFieldInfo(v *FieldModel) *UploadSecurityQuestionResponse {
	s.FieldInfo = v
	return s
}

func (s *UploadSecurityQuestionResponse) SetSessionId(v string) *UploadSecurityQuestionResponse {
	s.SessionId = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetTokenUsage(v *TokenUsageSummary) *UploadSecurityQuestionResponse {
	s.TokenUsage = v
	return s
}

func (s *UploadSecurityQuestionResponse) SetTranscribedText(v string) *UploadSecurityQuestionResponse {
	s.TranscribedText = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetDebugInfo(v string) *UploadSecurityQuestionResponse {
	s.DebugInfo = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetFindeepdiveResult(v string) *UploadSecurityQuestionResponse {
	s.FindeepdiveResult = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetFinDeepDiveOverall(v string) *UploadSecurityQuestionResponse {
	s.FinDeepDiveOverall = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetUniversalPrompt(v string) *UploadSecurityQuestionResponse {
	s.UniversalPrompt = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetUniversalOutput(v string) *UploadSecurityQuestionResponse {
	s.UniversalOutput = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetFinancePrompt(v string) *UploadSecurityQuestionResponse {
	s.FinancePrompt = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetFinanceOutput(v string) *UploadSecurityQuestionResponse {
	s.FinanceOutput = &v
	return s
}

func (s *UploadSecurityQuestionResponse) SetStrategyVersion(v string) *UploadSecurityQuestionResponse {
	s.StrategyVersion = &v
	return s
}

type UploadSecurityAnswerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// txt/pdf 文件
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 须 answer 前缀，否则兜底 LLM_OUTPUT_DETECTION_LITE
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 企业标识
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 访问控制维度
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 流式消息 ID
	FlowMsgId *string `json:"flow_msg_id,omitempty" xml:"flow_msg_id,omitempty"`
	// 流式检测开关
	FlowDetect *string `json:"flow_detect,omitempty" xml:"flow_detect,omitempty"`
	// 流结束标记
	FlowEnd *string `json:"flow_end,omitempty" xml:"flow_end,omitempty"`
}

func (s UploadSecurityAnswerRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityAnswerRequest) GoString() string {
	return s.String()
}

func (s *UploadSecurityAnswerRequest) SetAuthToken(v string) *UploadSecurityAnswerRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetProductInstanceId(v string) *UploadSecurityAnswerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetFileUrl(v string) *UploadSecurityAnswerRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetSceneCode(v string) *UploadSecurityAnswerRequest {
	s.SceneCode = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetBusinessId(v string) *UploadSecurityAnswerRequest {
	s.BusinessId = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetEnterprise(v string) *UploadSecurityAnswerRequest {
	s.Enterprise = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetAccountId(v string) *UploadSecurityAnswerRequest {
	s.AccountId = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetMessageId(v string) *UploadSecurityAnswerRequest {
	s.MessageId = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetFlowMsgId(v string) *UploadSecurityAnswerRequest {
	s.FlowMsgId = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetFlowDetect(v string) *UploadSecurityAnswerRequest {
	s.FlowDetect = &v
	return s
}

func (s *UploadSecurityAnswerRequest) SetFlowEnd(v string) *UploadSecurityAnswerRequest {
	s.FlowEnd = &v
	return s
}

type UploadSecurityAnswerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 四种动作码
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 风险标签
	Labels []*LabelModel `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// 命中自定义风险词
	CustomizeRiskWord []*string `json:"customize_risk_word,omitempty" xml:"customize_risk_word,omitempty" type:"Repeated"`
	// 拒答话术
	LimitAnswer *string `json:"limit_answer,omitempty" xml:"limit_answer,omitempty"`
	// 回传
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 回传
	FlowMsgId *string `json:"flow_msg_id,omitempty" xml:"flow_msg_id,omitempty"`
	// 脱敏后内容
	ObfuscationData *string `json:"obfuscation_data,omitempty" xml:"obfuscation_data,omitempty"`
	// 流式处理状态（终态 done）
	FlowProcessState *string `json:"flow_process_state,omitempty" xml:"flow_process_state,omitempty"`
	// 调试字段
	UniversalPrompt *string `json:"universal_prompt,omitempty" xml:"universal_prompt,omitempty"`
	// 调试字段
	UniversalOutput *string `json:"universal_output,omitempty" xml:"universal_output,omitempty"`
	// 调试字段
	FinancePrompt *string `json:"finance_prompt,omitempty" xml:"finance_prompt,omitempty"`
	// 调试字段
	FinanceOutput *string `json:"finance_output,omitempty" xml:"finance_output,omitempty"`
	// 策略版本
	StrategyVersion *string `json:"strategy_version,omitempty" xml:"strategy_version,omitempty"`
	// token 用量
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
	// 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
	DebugInfo *string `json:"debug_info,omitempty" xml:"debug_info,omitempty"`
	// ASR 转写文本（文本链路恒 null）
	TranscribedText *string `json:"transcribed_text,omitempty" xml:"transcribed_text,omitempty"`
	// 金融深挖结果
	FindeepdiveResult *string `json:"findeepdive_result,omitempty" xml:"findeepdive_result,omitempty"`
	// 金融深挖总览
	FinDeepDiveOverall *string `json:"fin_deep_dive_overall,omitempty" xml:"fin_deep_dive_overall,omitempty"`
}

func (s UploadSecurityAnswerResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityAnswerResponse) GoString() string {
	return s.String()
}

func (s *UploadSecurityAnswerResponse) SetReqMsgId(v string) *UploadSecurityAnswerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetResultCode(v string) *UploadSecurityAnswerResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetResultMsg(v string) *UploadSecurityAnswerResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetActionCode(v string) *UploadSecurityAnswerResponse {
	s.ActionCode = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetLabels(v []*LabelModel) *UploadSecurityAnswerResponse {
	s.Labels = v
	return s
}

func (s *UploadSecurityAnswerResponse) SetCustomizeRiskWord(v []*string) *UploadSecurityAnswerResponse {
	s.CustomizeRiskWord = v
	return s
}

func (s *UploadSecurityAnswerResponse) SetLimitAnswer(v string) *UploadSecurityAnswerResponse {
	s.LimitAnswer = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetMessageId(v string) *UploadSecurityAnswerResponse {
	s.MessageId = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFlowMsgId(v string) *UploadSecurityAnswerResponse {
	s.FlowMsgId = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetObfuscationData(v string) *UploadSecurityAnswerResponse {
	s.ObfuscationData = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFlowProcessState(v string) *UploadSecurityAnswerResponse {
	s.FlowProcessState = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetUniversalPrompt(v string) *UploadSecurityAnswerResponse {
	s.UniversalPrompt = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetUniversalOutput(v string) *UploadSecurityAnswerResponse {
	s.UniversalOutput = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFinancePrompt(v string) *UploadSecurityAnswerResponse {
	s.FinancePrompt = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFinanceOutput(v string) *UploadSecurityAnswerResponse {
	s.FinanceOutput = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetStrategyVersion(v string) *UploadSecurityAnswerResponse {
	s.StrategyVersion = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetTokenUsage(v *TokenUsageSummary) *UploadSecurityAnswerResponse {
	s.TokenUsage = v
	return s
}

func (s *UploadSecurityAnswerResponse) SetDebugInfo(v string) *UploadSecurityAnswerResponse {
	s.DebugInfo = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetTranscribedText(v string) *UploadSecurityAnswerResponse {
	s.TranscribedText = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFindeepdiveResult(v string) *UploadSecurityAnswerResponse {
	s.FindeepdiveResult = &v
	return s
}

func (s *UploadSecurityAnswerResponse) SetFinDeepDiveOverall(v string) *UploadSecurityAnswerResponse {
	s.FinDeepDiveOverall = &v
	return s
}

type UploadSecurityImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ≤10MB；jpeg/png/jpg/bmp/webp/gif 直传或 PDF 逐页转图片
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 归一化后须 image 前缀，否则拒绝「非法场景码」
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 企业标识
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 访问控制维度
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s UploadSecurityImageRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityImageRequest) GoString() string {
	return s.String()
}

func (s *UploadSecurityImageRequest) SetAuthToken(v string) *UploadSecurityImageRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSecurityImageRequest) SetProductInstanceId(v string) *UploadSecurityImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSecurityImageRequest) SetFileUrl(v string) *UploadSecurityImageRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSecurityImageRequest) SetSceneCode(v string) *UploadSecurityImageRequest {
	s.SceneCode = &v
	return s
}

func (s *UploadSecurityImageRequest) SetBusinessId(v string) *UploadSecurityImageRequest {
	s.BusinessId = &v
	return s
}

func (s *UploadSecurityImageRequest) SetEnterprise(v string) *UploadSecurityImageRequest {
	s.Enterprise = &v
	return s
}

func (s *UploadSecurityImageRequest) SetAccountId(v string) *UploadSecurityImageRequest {
	s.AccountId = &v
	return s
}

type UploadSecurityImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS/BLOCK
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 黑白库命中明细（18 字段）
	ImageBlackWhiteResult *ImageBlackWhiteResult `json:"image_black_white_result,omitempty" xml:"image_black_white_result,omitempty"`
	// token 用量（11 字段）
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
}

func (s UploadSecurityImageResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityImageResponse) GoString() string {
	return s.String()
}

func (s *UploadSecurityImageResponse) SetReqMsgId(v string) *UploadSecurityImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSecurityImageResponse) SetResultCode(v string) *UploadSecurityImageResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSecurityImageResponse) SetResultMsg(v string) *UploadSecurityImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSecurityImageResponse) SetActionCode(v string) *UploadSecurityImageResponse {
	s.ActionCode = &v
	return s
}

func (s *UploadSecurityImageResponse) SetImageBlackWhiteResult(v *ImageBlackWhiteResult) *UploadSecurityImageResponse {
	s.ImageBlackWhiteResult = v
	return s
}

func (s *UploadSecurityImageResponse) SetTokenUsage(v *TokenUsageSummary) *UploadSecurityImageResponse {
	s.TokenUsage = v
	return s
}

type QuerySecurityTextdetoxificationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待祛毒语料文本
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 租户标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 应用码
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
}

func (s QuerySecurityTextdetoxificationRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityTextdetoxificationRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityTextdetoxificationRequest) SetAuthToken(v string) *QuerySecurityTextdetoxificationRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityTextdetoxificationRequest) SetProductInstanceId(v string) *QuerySecurityTextdetoxificationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityTextdetoxificationRequest) SetQuestion(v string) *QuerySecurityTextdetoxificationRequest {
	s.Question = &v
	return s
}

func (s *QuerySecurityTextdetoxificationRequest) SetBusinessId(v string) *QuerySecurityTextdetoxificationRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityTextdetoxificationRequest) SetAppCode(v string) *QuerySecurityTextdetoxificationRequest {
	s.AppCode = &v
	return s
}

type QuerySecurityTextdetoxificationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否安全无风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 一级风险分类
	RiskCategory *string `json:"risk_category,omitempty" xml:"risk_category,omitempty"`
	// 二级风险明细分类
	RiskLabel *string `json:"risk_label,omitempty" xml:"risk_label,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险关键词列表
	RiskWords []*string `json:"risk_words,omitempty" xml:"risk_words,omitempty" type:"Repeated"`
	// 关键词索引
	RiskWordsIndex []*string `json:"risk_words_index,omitempty" xml:"risk_words_index,omitempty" type:"Repeated"`
}

func (s QuerySecurityTextdetoxificationResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityTextdetoxificationResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityTextdetoxificationResponse) SetReqMsgId(v string) *QuerySecurityTextdetoxificationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetResultCode(v string) *QuerySecurityTextdetoxificationResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetResultMsg(v string) *QuerySecurityTextdetoxificationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetSafe(v bool) *QuerySecurityTextdetoxificationResponse {
	s.Safe = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetRiskCategory(v string) *QuerySecurityTextdetoxificationResponse {
	s.RiskCategory = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetRiskLabel(v string) *QuerySecurityTextdetoxificationResponse {
	s.RiskLabel = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetRiskScore(v int64) *QuerySecurityTextdetoxificationResponse {
	s.RiskScore = &v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetRiskWords(v []*string) *QuerySecurityTextdetoxificationResponse {
	s.RiskWords = v
	return s
}

func (s *QuerySecurityTextdetoxificationResponse) SetRiskWordsIndex(v []*string) *QuerySecurityTextdetoxificationResponse {
	s.RiskWordsIndex = v
	return s
}

type QuerySecurityVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频公开访问 URL
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty" require:"true"`
	// 归一化后须 video 前缀，否则拒绝「非法场景码」
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识（老值兼容替换）
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty"`
	// 应用码
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 企业标识
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 访问控制维度
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s QuerySecurityVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityVideoRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityVideoRequest) SetAuthToken(v string) *QuerySecurityVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetProductInstanceId(v string) *QuerySecurityVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetVideoUrl(v string) *QuerySecurityVideoRequest {
	s.VideoUrl = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetSceneCode(v string) *QuerySecurityVideoRequest {
	s.SceneCode = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetBusinessId(v string) *QuerySecurityVideoRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetAppCode(v string) *QuerySecurityVideoRequest {
	s.AppCode = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetMessageId(v string) *QuerySecurityVideoRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetEnterprise(v string) *QuerySecurityVideoRequest {
	s.Enterprise = &v
	return s
}

func (s *QuerySecurityVideoRequest) SetAccountId(v string) *QuerySecurityVideoRequest {
	s.AccountId = &v
	return s
}

type QuerySecurityVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS/BLOCK
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// token 用量（11 字段）
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
	// 黑白库命中明细（18 字段）
	ImageBlackWhiteResult *ImageBlackWhiteResult `json:"image_black_white_result,omitempty" xml:"image_black_white_result,omitempty"`
}

func (s QuerySecurityVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityVideoResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityVideoResponse) SetReqMsgId(v string) *QuerySecurityVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityVideoResponse) SetResultCode(v string) *QuerySecurityVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityVideoResponse) SetResultMsg(v string) *QuerySecurityVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityVideoResponse) SetActionCode(v string) *QuerySecurityVideoResponse {
	s.ActionCode = &v
	return s
}

func (s *QuerySecurityVideoResponse) SetTokenUsage(v *TokenUsageSummary) *QuerySecurityVideoResponse {
	s.TokenUsage = v
	return s
}

func (s *QuerySecurityVideoResponse) SetImageBlackWhiteResult(v *ImageBlackWhiteResult) *QuerySecurityVideoResponse {
	s.ImageBlackWhiteResult = v
	return s
}

type UploadSecurityVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频文件 URL（大小/格式由 VideoCheckApplicationService 校验）
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 须 video 前缀
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
}

func (s UploadSecurityVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityVideoRequest) GoString() string {
	return s.String()
}

func (s *UploadSecurityVideoRequest) SetAuthToken(v string) *UploadSecurityVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSecurityVideoRequest) SetProductInstanceId(v string) *UploadSecurityVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSecurityVideoRequest) SetFileUrl(v string) *UploadSecurityVideoRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSecurityVideoRequest) SetSceneCode(v string) *UploadSecurityVideoRequest {
	s.SceneCode = &v
	return s
}

func (s *UploadSecurityVideoRequest) SetBusinessId(v string) *UploadSecurityVideoRequest {
	s.BusinessId = &v
	return s
}

type UploadSecurityVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS/BLOCK
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 黑白库命中明细（18 字段）
	ImageBlackWhiteResult *ImageBlackWhiteResult `json:"image_black_white_result,omitempty" xml:"image_black_white_result,omitempty"`
	// token 用量（11 字段）
	TokenUsage *TokenUsageSummary `json:"token_usage,omitempty" xml:"token_usage,omitempty"`
}

func (s UploadSecurityVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityVideoResponse) GoString() string {
	return s.String()
}

func (s *UploadSecurityVideoResponse) SetReqMsgId(v string) *UploadSecurityVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSecurityVideoResponse) SetResultCode(v string) *UploadSecurityVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSecurityVideoResponse) SetResultMsg(v string) *UploadSecurityVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSecurityVideoResponse) SetActionCode(v string) *UploadSecurityVideoResponse {
	s.ActionCode = &v
	return s
}

func (s *UploadSecurityVideoResponse) SetImageBlackWhiteResult(v *ImageBlackWhiteResult) *UploadSecurityVideoResponse {
	s.ImageBlackWhiteResult = v
	return s
}

func (s *UploadSecurityVideoResponse) SetTokenUsage(v *TokenUsageSummary) *UploadSecurityVideoResponse {
	s.TokenUsage = v
	return s
}

type QuerySecurityAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 音频公网 URL（与 audio 二选一，网关侧仅支持 URL 方式）
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty" require:"true"`
	// wav/mp3/flac/m4a/aiff/alac/ape，缺省从 URL 后缀或 magic number 推断
	AudioFormat *string `json:"audio_format,omitempty" xml:"audio_format,omitempty"`
	// Boolean 降噪（null 时服务端默认 true）
	Denoise *string `json:"denoise,omitempty" xml:"denoise,omitempty"`
	// 须 audio 前缀，audio_input_*/audio_output_*
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识（老值兼容替换）
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 应用码
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// 消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 企业标识
	Enterprise *string `json:"enterprise,omitempty" xml:"enterprise,omitempty"`
	// 访问控制维度
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s QuerySecurityAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityAudioRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityAudioRequest) SetAuthToken(v string) *QuerySecurityAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetProductInstanceId(v string) *QuerySecurityAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetAudioUrl(v string) *QuerySecurityAudioRequest {
	s.AudioUrl = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetAudioFormat(v string) *QuerySecurityAudioRequest {
	s.AudioFormat = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetDenoise(v string) *QuerySecurityAudioRequest {
	s.Denoise = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetSceneCode(v string) *QuerySecurityAudioRequest {
	s.SceneCode = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetBusinessId(v string) *QuerySecurityAudioRequest {
	s.BusinessId = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetAppCode(v string) *QuerySecurityAudioRequest {
	s.AppCode = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetMessageId(v string) *QuerySecurityAudioRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetEnterprise(v string) *QuerySecurityAudioRequest {
	s.Enterprise = &v
	return s
}

func (s *QuerySecurityAudioRequest) SetAccountId(v string) *QuerySecurityAudioRequest {
	s.AccountId = &v
	return s
}

type QuerySecurityAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测结果,使用JSON字符串反馈给调用方,由对应的调用方进行解析使用
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QuerySecurityAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityAudioResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityAudioResponse) SetReqMsgId(v string) *QuerySecurityAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityAudioResponse) SetResultCode(v string) *QuerySecurityAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityAudioResponse) SetResultMsg(v string) *QuerySecurityAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityAudioResponse) SetResult(v string) *QuerySecurityAudioResponse {
	s.Result = &v
	return s
}

type UploadSecurityAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 音频文件 URL（非空校验）
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 须 audio 前缀
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 租户标识
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 降噪开关（字符串，Boolean.parseBoolean 解析）
	Denoise *string `json:"denoise,omitempty" xml:"denoise,omitempty"`
	// 音频格式（缺省用原始文件名或 audio.wav）
	AudioFormat *string `json:"audio_format,omitempty" xml:"audio_format,omitempty"`
	// 消息 ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
}

func (s UploadSecurityAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityAudioRequest) GoString() string {
	return s.String()
}

func (s *UploadSecurityAudioRequest) SetAuthToken(v string) *UploadSecurityAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetProductInstanceId(v string) *UploadSecurityAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetFileUrl(v string) *UploadSecurityAudioRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetSceneCode(v string) *UploadSecurityAudioRequest {
	s.SceneCode = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetBusinessId(v string) *UploadSecurityAudioRequest {
	s.BusinessId = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetDenoise(v string) *UploadSecurityAudioRequest {
	s.Denoise = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetAudioFormat(v string) *UploadSecurityAudioRequest {
	s.AudioFormat = &v
	return s
}

func (s *UploadSecurityAudioRequest) SetMessageId(v string) *UploadSecurityAudioRequest {
	s.MessageId = &v
	return s
}

type UploadSecurityAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测结果,使用JSON字符串反馈给调用方,由对应的调用方进行解析使用
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UploadSecurityAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSecurityAudioResponse) GoString() string {
	return s.String()
}

func (s *UploadSecurityAudioResponse) SetReqMsgId(v string) *UploadSecurityAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSecurityAudioResponse) SetResultCode(v string) *UploadSecurityAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSecurityAudioResponse) SetResultMsg(v string) *UploadSecurityAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSecurityAudioResponse) SetResult(v string) *UploadSecurityAudioResponse {
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
				"sdk_version":      tea.String("1.1.66"),
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

// Description:
//
// Description: 客户统计结果查询
//
// Summary: 客户统计结果查询
func (client *Client) QueryAdvisormarketData(request *QueryAdvisormarketDataRequest) (_result *QueryAdvisormarketDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAdvisormarketDataResponse{}
	_body, _err := client.QueryAdvisormarketDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 客户统计结果查询
//
// Summary: 客户统计结果查询
func (client *Client) QueryAdvisormarketDataEx(request *QueryAdvisormarketDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAdvisormarketDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAdvisormarketDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.advisormarket.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
//
// Summary: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
func (client *Client) PushAdvisormarketAnalysis(request *PushAdvisormarketAnalysisRequest) (_result *PushAdvisormarketAnalysisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushAdvisormarketAnalysisResponse{}
	_body, _err := client.PushAdvisormarketAnalysisEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
//
// Summary: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
func (client *Client) PushAdvisormarketAnalysisEx(request *PushAdvisormarketAnalysisRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushAdvisormarketAnalysisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushAdvisormarketAnalysisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.advisormarket.analysis.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询当前租户的异步商圈客群分析任务。
//
// Summary: 查询当前租户的异步商圈客群分析任务。
func (client *Client) QueryAdvisormarketAnalysis(request *QueryAdvisormarketAnalysisRequest) (_result *QueryAdvisormarketAnalysisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAdvisormarketAnalysisResponse{}
	_body, _err := client.QueryAdvisormarketAnalysisEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询当前租户的异步商圈客群分析任务。
//
// Summary: 查询当前租户的异步商圈客群分析任务。
func (client *Client) QueryAdvisormarketAnalysisEx(request *QueryAdvisormarketAnalysisRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAdvisormarketAnalysisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAdvisormarketAnalysisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.advisormarket.analysis.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: LOGO/二维码审核
//
// Summary: LOGO/二维码审核
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

// Description:
//
// Description: LOGO/二维码审核
//
// Summary: LOGO/二维码审核
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

// Description:
//
// Description: 主站审核能力回调
//
// Summary: 主站审核能力回调
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

// Description:
//
// Description: 主站审核能力回调
//
// Summary: 主站审核能力回调
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

// Description:
//
// Description: 文本审核入审
//
// Summary: 文本审核入审
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

// Description:
//
// Description: 文本审核入审
//
// Summary: 文本审核入审
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

// Description:
//
// Description: 文本审核查询
//
// Summary: 文本审核查询
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

// Description:
//
// Description: 文本审核查询
//
// Summary: 文本审核查询
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

// Description:
//
// Description: 图片审核入审
//
// Summary: 图片审核入审
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

// Description:
//
// Description: 图片审核入审
//
// Summary: 图片审核入审
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

// Description:
//
// Description: 图片审核查询
//
// Summary: 图片审核查询
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

// Description:
//
// Description: 图片审核查询
//
// Summary: 图片审核查询
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

// Description:
//
// Description: 音频审核入审
//
// Summary: 音频审核入审
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

// Description:
//
// Description: 音频审核入审
//
// Summary: 音频审核入审
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

// Description:
//
// Description: 音频审核查询
//
// Summary: 音频审核查询
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

// Description:
//
// Description: 音频审核查询
//
// Summary: 音频审核查询
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

// Description:
//
// Description: 视频审核入审
//
// Summary: 视频审核入审
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

// Description:
//
// Description: 视频审核入审
//
// Summary: 视频审核入审
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

// Description:
//
// Description: 视频审核查询
//
// Summary: 视频审核查询
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

// Description:
//
// Description: 视频审核查询
//
// Summary: 视频审核查询
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

// Description:
//
// Description: 文本同步审核接口，调用阿里云内容安全审核增强版
//
// Summary: 文本同步审核
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

// Description:
//
// Description: 文本同步审核接口，调用阿里云内容安全审核增强版
//
// Summary: 文本同步审核
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

// Description:
//
// Description: 同步接口，只调用机审能力
//
// Summary: 图片机审基础版
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

// Description:
//
// Description: 同步接口，只调用机审能力
//
// Summary: 图片机审基础版
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

// Description:
//
// Description: 同步接口，只调用机审能力
//
// Summary: 图片审核增强版
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

// Description:
//
// Description: 同步接口，只调用机审能力
//
// Summary: 图片审核增强版
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

// Description:
//
// Description: 异步接口，只调用机审能力
//
// Summary: 音频审核通用版入审
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

// Description:
//
// Description: 异步接口，只调用机审能力
//
// Summary: 音频审核通用版入审
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

// Description:
//
// Description: 异步接口，只调用机审能力
//
// Summary: 音频审核通用版查询
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

// Description:
//
// Description: 异步接口，只调用机审能力
//
// Summary: 音频审核通用版查询
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

// Description:
//
// Description: 异步通知，只调用机审能力
//
// Summary: 视频审核通用版入审
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

// Description:
//
// Description: 异步通知，只调用机审能力
//
// Summary: 视频审核通用版入审
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

// Description:
//
// Description: 异步查询
//
// Summary: 视频审核通用版查询
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

// Description:
//
// Description: 异步查询
//
// Summary: 视频审核通用版查询
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

// Description:
//
// Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
//
// Summary: 阿里云内容审核回调
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

// Description:
//
// Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
//
// Summary: 阿里云内容审核回调
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

// Description:
//
// Description: 外部文件转存
//
// Summary: 文件转存接口
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

// Description:
//
// Description: 外部文件转存
//
// Summary: 文件转存接口
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

// Description:
//
// Description: 文件下载接口
//
// Summary: 文件下载接口
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

// Description:
//
// Description: 文件下载接口
//
// Summary: 文件下载接口
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

// Description:
//
// Description: 美柚待审核信息保存
//
// Summary: 美柚待审核信息保存接口
func (client *Client) SaveAuditMeiyou(request *SaveAuditMeiyouRequest) (_result *SaveAuditMeiyouResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveAuditMeiyouResponse{}
	_body, _err := client.SaveAuditMeiyouEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚待审核信息保存
//
// Summary: 美柚待审核信息保存接口
func (client *Client) SaveAuditMeiyouEx(request *SaveAuditMeiyouRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAuditMeiyouResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAuditMeiyouResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.meiyou.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息存储请求
//
// Summary: 美柚审核信息存储请求
func (client *Client) UpdateAuditMeiyou(request *UpdateAuditMeiyouRequest) (_result *UpdateAuditMeiyouResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAuditMeiyouResponse{}
	_body, _err := client.UpdateAuditMeiyouEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息存储请求
//
// Summary: 美柚审核信息存储请求
func (client *Client) UpdateAuditMeiyouEx(request *UpdateAuditMeiyouRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAuditMeiyouResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAuditMeiyouResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.meiyou.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息查询接口
//
// Summary: 美柚审核信息查询接口
func (client *Client) QueryMeiyouAudit(request *QueryMeiyouAuditRequest) (_result *QueryMeiyouAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeiyouAuditResponse{}
	_body, _err := client.QueryMeiyouAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息查询接口
//
// Summary: 美柚审核信息查询接口
func (client *Client) QueryMeiyouAuditEx(request *QueryMeiyouAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeiyouAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeiyouAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.audit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 美柚主题信息查询接口
//
// Summary: 美柚主题信息查询接口
func (client *Client) QueryMeiyouAudittopic(request *QueryMeiyouAudittopicRequest) (_result *QueryMeiyouAudittopicResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeiyouAudittopicResponse{}
	_body, _err := client.QueryMeiyouAudittopicEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚主题信息查询接口
//
// Summary: 美柚主题信息查询接口
func (client *Client) QueryMeiyouAudittopicEx(request *QueryMeiyouAudittopicRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeiyouAudittopicResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeiyouAudittopicResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.audittopic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新美柚itag关联关系接口
//
// Summary: 更新美柚itag关联关系接口
func (client *Client) UpdateMeiyouAudit(request *UpdateMeiyouAuditRequest) (_result *UpdateMeiyouAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMeiyouAuditResponse{}
	_body, _err := client.UpdateMeiyouAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新美柚itag关联关系接口
//
// Summary: 更新美柚itag关联关系接口
func (client *Client) UpdateMeiyouAuditEx(request *UpdateMeiyouAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMeiyouAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMeiyouAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.audit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询美柚itag关联信息
//
// Summary: 查询美柚itag关联信息
func (client *Client) QueryMeiyouItagrelation(request *QueryMeiyouItagrelationRequest) (_result *QueryMeiyouItagrelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeiyouItagrelationResponse{}
	_body, _err := client.QueryMeiyouItagrelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询美柚itag关联信息
//
// Summary: 查询美柚itag关联信息
func (client *Client) QueryMeiyouItagrelationEx(request *QueryMeiyouItagrelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeiyouItagrelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeiyouItagrelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.itagrelation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新美柚itag关联信息
//
// Summary: 更新美柚itag关联信息
func (client *Client) UpdateMeiyouItagrelation(request *UpdateMeiyouItagrelationRequest) (_result *UpdateMeiyouItagrelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMeiyouItagrelationResponse{}
	_body, _err := client.UpdateMeiyouItagrelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新美柚itag关联信息
//
// Summary: 更新美柚itag关联信息
func (client *Client) UpdateMeiyouItagrelationEx(request *UpdateMeiyouItagrelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMeiyouItagrelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMeiyouItagrelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.itagrelation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 美柚审核结果查询
//
// Summary: 美柚审核结果查询
func (client *Client) QueryMeiyouAuditresult(request *QueryMeiyouAuditresultRequest) (_result *QueryMeiyouAuditresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeiyouAuditresultResponse{}
	_body, _err := client.QueryMeiyouAuditresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚审核结果查询
//
// Summary: 美柚审核结果查询
func (client *Client) QueryMeiyouAuditresultEx(request *QueryMeiyouAuditresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeiyouAuditresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeiyouAuditresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.auditresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 分页查询美柚审核信息接口
//
// Summary: 分页查询美柚审核信息接口
func (client *Client) PagequeryMeiyouAudit(request *PagequeryMeiyouAuditRequest) (_result *PagequeryMeiyouAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryMeiyouAuditResponse{}
	_body, _err := client.PagequeryMeiyouAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 分页查询美柚审核信息接口
//
// Summary: 分页查询美柚审核信息接口
func (client *Client) PagequeryMeiyouAuditEx(request *PagequeryMeiyouAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryMeiyouAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryMeiyouAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.audit.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息存储（仅itask）
//
// Summary: 美柚审核信息存储（仅itask）
func (client *Client) SubmitAuditMeiyou(request *SubmitAuditMeiyouRequest) (_result *SubmitAuditMeiyouResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditMeiyouResponse{}
	_body, _err := client.SubmitAuditMeiyouEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚审核信息存储（仅itask）
//
// Summary: 美柚审核信息存储（仅itask）
func (client *Client) SubmitAuditMeiyouEx(request *SubmitAuditMeiyouRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditMeiyouResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditMeiyouResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.meiyou.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文档人审入审
//
// Summary: 文档人审入审
func (client *Client) SubmitAuditDocument(request *SubmitAuditDocumentRequest) (_result *SubmitAuditDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAuditDocumentResponse{}
	_body, _err := client.SubmitAuditDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文档人审入审
//
// Summary: 文档人审入审
func (client *Client) SubmitAuditDocumentEx(request *SubmitAuditDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAuditDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAuditDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.document.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文档人审查询
//
// Summary: 文档人审查询
func (client *Client) QueryAuditDocument(request *QueryAuditDocumentRequest) (_result *QueryAuditDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuditDocumentResponse{}
	_body, _err := client.QueryAuditDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文档人审查询
//
// Summary: 文档人审查询
func (client *Client) QueryAuditDocumentEx(request *QueryAuditDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuditDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuditDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.audit.document.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 阿里云ADB调用接口
//
// Summary: 阿里云ADB调用接口
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

// Description:
//
// Description: 阿里云ADB调用接口
//
// Summary: 阿里云ADB调用接口
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

// Description:
//
// Description: 红色GPT流式调用网关接口
//
// Summary: 红色GPT网关方式调用接口
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

// Description:
//
// Description: 红色GPT流式调用网关接口
//
// Summary: 红色GPT网关方式调用接口
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

// Description:
//
// Description: 阿里云ADB调用接口
//
// Summary: 阿里云ADB调用接口
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

// Description:
//
// Description: 阿里云ADB调用接口
//
// Summary: 阿里云ADB调用接口
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

// Description:
//
// Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
//
// Summary: 阿里云内容安全回调
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

// Description:
//
// Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
//
// Summary: 阿里云内容安全回调
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

// Description:
//
// Description: 主站ITASK审核能力回调
//
// Summary: 主站ITASK审核能力回调
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

// Description:
//
// Description: 主站ITASK审核能力回调
//
// Summary: 主站ITASK审核能力回调
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

// Description:
//
// Description: 音频人审查询
//
// Summary: 音频人审查询
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

// Description:
//
// Description: 音频人审查询
//
// Summary: 音频人审查询
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

// Description:
//
// Description: 音频人审入审
//
// Summary: 音频人审入审
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

// Description:
//
// Description: 音频人审入审
//
// Summary: 音频人审入审
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

// Description:
//
// Description: 图片人审查询
//
// Summary: 图片人审查询
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

// Description:
//
// Description: 图片人审查询
//
// Summary: 图片人审查询
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

// Description:
//
// Description: 图片人审入审
//
// Summary: 图片人审入审
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

// Description:
//
// Description: 图片人审入审
//
// Summary: 图片人审入审
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

// Description:
//
// Description: 文本人审查询
//
// Summary: 文本人审查询
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

// Description:
//
// Description: 文本人审查询
//
// Summary: 文本人审查询
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

// Description:
//
// Description: 文本人审提交
//
// Summary: 文本人审提交
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

// Description:
//
// Description: 文本人审提交
//
// Summary: 文本人审提交
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

// Description:
//
// Description: 视频人审查询
//
// Summary: 视频人审查询
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

// Description:
//
// Description: 视频人审查询
//
// Summary: 视频人审查询
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

// Description:
//
// Description: 视频人审提交
//
// Summary: 视频人审提交
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

// Description:
//
// Description: 视频人审提交
//
// Summary: 视频人审提交
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

// Description:
//
// Description: 音频机审查询-基础版
//
// Summary: 音频机审查询-基础版
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

// Description:
//
// Description: 音频机审查询-基础版
//
// Summary: 音频机审查询-基础版
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

// Description:
//
// Description: 音频机审入审-基础版
//
// Summary: 音频机审入审-基础版
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

// Description:
//
// Description: 音频机审入审-基础版
//
// Summary: 音频机审入审-基础版
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

// Description:
//
// Description: 图片机审申请-基础版
//
// Summary: 图片机审申请-基础版
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

// Description:
//
// Description: 图片机审申请-基础版
//
// Summary: 图片机审申请-基础版
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

// Description:
//
// Description: 图片机审申请-增强版
//
// Summary: 图片机审申请-增强版
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

// Description:
//
// Description: 图片机审申请-增强版
//
// Summary: 图片机审申请-增强版
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

// Description:
//
// Description: 文本机审申请-基础版
//
// Summary: 文本机审申请-基础版
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

// Description:
//
// Description: 文本机审申请-基础版
//
// Summary: 文本机审申请-基础版
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

// Description:
//
// Description: 视频机审查询-基础版
//
// Summary: 视频机审查询-基础版
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

// Description:
//
// Description: 视频机审查询-基础版
//
// Summary: 视频机审查询-基础版
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

// Description:
//
// Description: 视频机审提交-基础版
//
// Summary: 视频机审提交-基础版
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

// Description:
//
// Description: 视频机审提交-基础版
//
// Summary: 视频机审提交-基础版
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

// Description:
//
// Description: 用于身份证、个人信息识别、防伪等
//
// Summary: 图片光鉴识别链路
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

// Description:
//
// Description: 用于身份证、个人信息识别、防伪等
//
// Summary: 图片光鉴识别链路
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

// Description:
//
// Description: 输出文本风险检测
//
// Summary: 输出文本风险检测
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

// Description:
//
// Description: 输出文本风险检测
//
// Summary: 输出文本风险检测
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

// Description:
//
// Description: 美柚待审核信息提交
//
// Summary: 美柚待审核信息提交
func (client *Client) SubmitMeiyouAudit(request *SubmitMeiyouAuditRequest) (_result *SubmitMeiyouAuditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitMeiyouAuditResponse{}
	_body, _err := client.SubmitMeiyouAuditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 美柚待审核信息提交
//
// Summary: 美柚待审核信息提交
func (client *Client) SubmitMeiyouAuditEx(request *SubmitMeiyouAuditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitMeiyouAuditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitMeiyouAuditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.audit.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询美柚审核Agent节点信息
//
// Summary: 查询美柚审核Agent节点信息
func (client *Client) QueryMeiyouAgentaudit(request *QueryMeiyouAgentauditRequest) (_result *QueryMeiyouAgentauditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeiyouAgentauditResponse{}
	_body, _err := client.QueryMeiyouAgentauditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询美柚审核Agent节点信息
//
// Summary: 查询美柚审核Agent节点信息
func (client *Client) QueryMeiyouAgentauditEx(request *QueryMeiyouAgentauditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeiyouAgentauditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeiyouAgentauditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.meiyou.agentaudit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新美柚审核Agent审核结果
//
// Summary: 更新美柚审核Agent审核结果
func (client *Client) UpdateAicoguardcoreMeiyou(request *UpdateAicoguardcoreMeiyouRequest) (_result *UpdateAicoguardcoreMeiyouResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAicoguardcoreMeiyouResponse{}
	_body, _err := client.UpdateAicoguardcoreMeiyouEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新美柚审核Agent审核结果
//
// Summary: 更新美柚审核Agent审核结果
func (client *Client) UpdateAicoguardcoreMeiyouEx(request *UpdateAicoguardcoreMeiyouRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAicoguardcoreMeiyouResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAicoguardcoreMeiyouResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.aicoguardcore.meiyou.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文档人审入审
//
// Summary: 文档人审入审
func (client *Client) SubmitGuardDocument(request *SubmitGuardDocumentRequest) (_result *SubmitGuardDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitGuardDocumentResponse{}
	_body, _err := client.SubmitGuardDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文档人审入审
//
// Summary: 文档人审入审
func (client *Client) SubmitGuardDocumentEx(request *SubmitGuardDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitGuardDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitGuardDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.document.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文档人审查询
//
// Summary: 文档人审查询
func (client *Client) QueryGuardDocument(request *QueryGuardDocumentRequest) (_result *QueryGuardDocumentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardDocumentResponse{}
	_body, _err := client.QueryGuardDocumentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文档人审查询
//
// Summary: 文档人审查询
func (client *Client) QueryGuardDocumentEx(request *QueryGuardDocumentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardDocumentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardDocumentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.guard.document.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 天鉴SaaS提问检测
//
// Summary: 天鉴SaaS提问检测
func (client *Client) QuerySecurityQuestion(request *QuerySecurityQuestionRequest) (_result *QuerySecurityQuestionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityQuestionResponse{}
	_body, _err := client.QuerySecurityQuestionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 天鉴SaaS提问检测
//
// Summary: 天鉴SaaS提问检测
func (client *Client) QuerySecurityQuestionEx(request *QuerySecurityQuestionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityQuestionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityQuestionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.question.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 天鉴SaaS回答检测
//
// Summary: 天鉴SaaS回答检测
func (client *Client) QuerySecurityAnswer(request *QuerySecurityAnswerRequest) (_result *QuerySecurityAnswerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityAnswerResponse{}
	_body, _err := client.QuerySecurityAnswerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 天鉴SaaS回答检测
//
// Summary: 天鉴SaaS回答检测
func (client *Client) QuerySecurityAnswerEx(request *QuerySecurityAnswerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityAnswerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityAnswerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.answer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 天鉴图片检测功能saas版本
//
// Summary: 天鉴图片检测功能saas版本
func (client *Client) QuerySecurityImage(request *QuerySecurityImageRequest) (_result *QuerySecurityImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityImageResponse{}
	_body, _err := client.QuerySecurityImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 天鉴图片检测功能saas版本
//
// Summary: 天鉴图片检测功能saas版本
func (client *Client) QuerySecurityImageEx(request *QuerySecurityImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 提问检测-文件上传
//
// Summary: 提问检测-文件上传
func (client *Client) UploadSecurityQuestion(request *UploadSecurityQuestionRequest) (_result *UploadSecurityQuestionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSecurityQuestionResponse{}
	_body, _err := client.UploadSecurityQuestionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 提问检测-文件上传
//
// Summary: 提问检测-文件上传
func (client *Client) UploadSecurityQuestionEx(request *UploadSecurityQuestionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSecurityQuestionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSecurityQuestionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.question.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 回答检测-文件上传
//
// Summary: 回答检测-文件上传
func (client *Client) UploadSecurityAnswer(request *UploadSecurityAnswerRequest) (_result *UploadSecurityAnswerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSecurityAnswerResponse{}
	_body, _err := client.UploadSecurityAnswerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 回答检测-文件上传
//
// Summary: 回答检测-文件上传
func (client *Client) UploadSecurityAnswerEx(request *UploadSecurityAnswerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSecurityAnswerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSecurityAnswerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.answer.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 图片/PDF 检测-文件上传
//
// Summary: 图片/PDF 检测-文件上传
func (client *Client) UploadSecurityImage(request *UploadSecurityImageRequest) (_result *UploadSecurityImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSecurityImageResponse{}
	_body, _err := client.UploadSecurityImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 图片/PDF 检测-文件上传
//
// Summary: 图片/PDF 检测-文件上传
func (client *Client) UploadSecurityImageEx(request *UploadSecurityImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSecurityImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSecurityImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.image.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 语料祛毒
//
// Summary: 语料祛毒
func (client *Client) QuerySecurityTextdetoxification(request *QuerySecurityTextdetoxificationRequest) (_result *QuerySecurityTextdetoxificationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityTextdetoxificationResponse{}
	_body, _err := client.QuerySecurityTextdetoxificationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 语料祛毒
//
// Summary: 语料祛毒
func (client *Client) QuerySecurityTextdetoxificationEx(request *QuerySecurityTextdetoxificationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityTextdetoxificationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityTextdetoxificationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.textdetoxification.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 视频公开访问 URL
//
// Summary: 视频公开访问 URL
func (client *Client) QuerySecurityVideo(request *QuerySecurityVideoRequest) (_result *QuerySecurityVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityVideoResponse{}
	_body, _err := client.QuerySecurityVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 视频公开访问 URL
//
// Summary: 视频公开访问 URL
func (client *Client) QuerySecurityVideoEx(request *QuerySecurityVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.video.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 视频检测-文件上传
//
// Summary: 视频检测-文件上传
func (client *Client) UploadSecurityVideo(request *UploadSecurityVideoRequest) (_result *UploadSecurityVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSecurityVideoResponse{}
	_body, _err := client.UploadSecurityVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 视频检测-文件上传
//
// Summary: 视频检测-文件上传
func (client *Client) UploadSecurityVideoEx(request *UploadSecurityVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSecurityVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSecurityVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.video.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 语音检测-JSON 模式
//
// Summary: 语音检测-JSON 模式
func (client *Client) QuerySecurityAudio(request *QuerySecurityAudioRequest) (_result *QuerySecurityAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityAudioResponse{}
	_body, _err := client.QuerySecurityAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 语音检测-JSON 模式
//
// Summary: 语音检测-JSON 模式
func (client *Client) QuerySecurityAudioEx(request *QuerySecurityAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.audio.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 语音检测-文件上传
//
// Summary: 语音检测-文件上传
func (client *Client) UploadSecurityAudio(request *UploadSecurityAudioRequest) (_result *UploadSecurityAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSecurityAudioResponse{}
	_body, _err := client.UploadSecurityAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 语音检测-文件上传
//
// Summary: 语音检测-文件上传
func (client *Client) UploadSecurityAudioEx(request *UploadSecurityAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSecurityAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSecurityAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("aitech.comm.security.audio.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
