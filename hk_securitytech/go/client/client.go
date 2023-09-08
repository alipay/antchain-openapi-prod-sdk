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

// result.resultData
type DeviceRiskReportResultData struct {
	// webrtc_url
	WebrtcUrl *string `json:"webrtc_url,omitempty" xml:"webrtc_url,omitempty" require:"true"`
	// a_dynamic_swi
	ADynamicSwi *string `json:"a_dynamic_swi,omitempty" xml:"a_dynamic_swi,omitempty" require:"true"`
	// dynamic_interval
	DynamicInterval *string `json:"dynamic_interval,omitempty" xml:"dynamic_interval,omitempty" require:"true"`
	// color
	Color *string `json:"color,omitempty" xml:"color,omitempty" require:"true"`
	// os
	Os *string `json:"os,omitempty" xml:"os,omitempty" require:"true"`
	// dynamic_cmd
	DynamicCmd *string `json:"dynamic_cmd,omitempty" xml:"dynamic_cmd,omitempty" require:"true"`
	// time_interval
	TimeInterval *string `json:"time_interval,omitempty" xml:"time_interval,omitempty" require:"true"`
	// dynamic_trace
	DynamicTrace *string `json:"dynamic_trace,omitempty" xml:"dynamic_trace,omitempty" require:"true"`
	// dynamic_num
	DynamicNum *string `json:"dynamic_num,omitempty" xml:"dynamic_num,omitempty" require:"true"`
	// result_type
	ResultType *string `json:"result_type,omitempty" xml:"result_type,omitempty" require:"true"`
}

func (s DeviceRiskReportResultData) String() string {
	return tea.Prettify(s)
}

func (s DeviceRiskReportResultData) GoString() string {
	return s.String()
}

func (s *DeviceRiskReportResultData) SetWebrtcUrl(v string) *DeviceRiskReportResultData {
	s.WebrtcUrl = &v
	return s
}

func (s *DeviceRiskReportResultData) SetADynamicSwi(v string) *DeviceRiskReportResultData {
	s.ADynamicSwi = &v
	return s
}

func (s *DeviceRiskReportResultData) SetDynamicInterval(v string) *DeviceRiskReportResultData {
	s.DynamicInterval = &v
	return s
}

func (s *DeviceRiskReportResultData) SetColor(v string) *DeviceRiskReportResultData {
	s.Color = &v
	return s
}

func (s *DeviceRiskReportResultData) SetOs(v string) *DeviceRiskReportResultData {
	s.Os = &v
	return s
}

func (s *DeviceRiskReportResultData) SetDynamicCmd(v string) *DeviceRiskReportResultData {
	s.DynamicCmd = &v
	return s
}

func (s *DeviceRiskReportResultData) SetTimeInterval(v string) *DeviceRiskReportResultData {
	s.TimeInterval = &v
	return s
}

func (s *DeviceRiskReportResultData) SetDynamicTrace(v string) *DeviceRiskReportResultData {
	s.DynamicTrace = &v
	return s
}

func (s *DeviceRiskReportResultData) SetDynamicNum(v string) *DeviceRiskReportResultData {
	s.DynamicNum = &v
	return s
}

func (s *DeviceRiskReportResultData) SetResultType(v string) *DeviceRiskReportResultData {
	s.ResultType = &v
	return s
}

// 终端安全-Android应用加固-RuntimeProtectConfig
type RuntimeProtectConfig struct {
	// 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
	AntiSignature *int64 `json:"anti_signature,omitempty" xml:"anti_signature,omitempty" require:"true"`
	// 防调试,0为检测到风险退出,1不处理
	AntiDebug *int64 `json:"anti_debug,omitempty" xml:"anti_debug,omitempty" require:"true"`
	// 防hook,0为检测到风险退出,1不处理
	AntiHook *int64 `json:"anti_hook,omitempty" xml:"anti_hook,omitempty" require:"true"`
	// 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
	AntiInject *int64 `json:"anti_inject,omitempty" xml:"anti_inject,omitempty" require:"true"`
	// 模拟器检查,0为检测到风险退出,1不处理
	AntiEmulator *int64 `json:"anti_emulator,omitempty" xml:"anti_emulator,omitempty" require:"true"`
	// 防root,0为检测到风险退出,1不处理
	AntiRoot *int64 `json:"anti_root,omitempty" xml:"anti_root,omitempty" require:"true"`
	// 防多开软件运行,0为检测到风险退出,1不处理
	AntiMultiApp *int64 `json:"anti_multi_app,omitempty" xml:"anti_multi_app,omitempty" require:"true"`
}

func (s RuntimeProtectConfig) String() string {
	return tea.Prettify(s)
}

func (s RuntimeProtectConfig) GoString() string {
	return s.String()
}

func (s *RuntimeProtectConfig) SetAntiSignature(v int64) *RuntimeProtectConfig {
	s.AntiSignature = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiDebug(v int64) *RuntimeProtectConfig {
	s.AntiDebug = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiHook(v int64) *RuntimeProtectConfig {
	s.AntiHook = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiInject(v int64) *RuntimeProtectConfig {
	s.AntiInject = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiEmulator(v int64) *RuntimeProtectConfig {
	s.AntiEmulator = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiRoot(v int64) *RuntimeProtectConfig {
	s.AntiRoot = &v
	return s
}

func (s *RuntimeProtectConfig) SetAntiMultiApp(v int64) *RuntimeProtectConfig {
	s.AntiMultiApp = &v
	return s
}

// 人脸盾结果
//
type FaceShieldResult struct {
	// 设备token
	//
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// 风险等级，-1参数异常，0无风险，1-3表示低、中、高
	//
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// 风险描述，对风险等级的补充
	//
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// 处理的建议，如PAAS
	SugAction *string `json:"sug_action,omitempty" xml:"sug_action,omitempty" require:"true"`
}

func (s FaceShieldResult) String() string {
	return tea.Prettify(s)
}

func (s FaceShieldResult) GoString() string {
	return s.String()
}

func (s *FaceShieldResult) SetApdidToken(v string) *FaceShieldResult {
	s.ApdidToken = &v
	return s
}

func (s *FaceShieldResult) SetRiskLevel(v int64) *FaceShieldResult {
	s.RiskLevel = &v
	return s
}

func (s *FaceShieldResult) SetRiskDesc(v string) *FaceShieldResult {
	s.RiskDesc = &v
	return s
}

func (s *FaceShieldResult) SetSugAction(v string) *FaceShieldResult {
	s.SugAction = &v
	return s
}

// 终端安全-Android加固-Response
type FileTokenForUpload struct {
	// ·
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty" require:"true"`
	// dir
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty" require:"true"`
	// expire
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty" require:"true"`
	// host
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// policy
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty" require:"true"`
	// signature
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s FileTokenForUpload) String() string {
	return tea.Prettify(s)
}

func (s FileTokenForUpload) GoString() string {
	return s.String()
}

func (s *FileTokenForUpload) SetAccessId(v string) *FileTokenForUpload {
	s.AccessId = &v
	return s
}

func (s *FileTokenForUpload) SetDir(v string) *FileTokenForUpload {
	s.Dir = &v
	return s
}

func (s *FileTokenForUpload) SetExpire(v string) *FileTokenForUpload {
	s.Expire = &v
	return s
}

func (s *FileTokenForUpload) SetHost(v string) *FileTokenForUpload {
	s.Host = &v
	return s
}

func (s *FileTokenForUpload) SetPolicy(v string) *FileTokenForUpload {
	s.Policy = &v
	return s
}

func (s *FileTokenForUpload) SetSignature(v string) *FileTokenForUpload {
	s.Signature = &v
	return s
}

// aml_extend_data
type ExtendData struct {
	// user_id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// cert_name
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
}

func (s ExtendData) String() string {
	return tea.Prettify(s)
}

func (s ExtendData) GoString() string {
	return s.String()
}

func (s *ExtendData) SetUserId(v string) *ExtendData {
	s.UserId = &v
	return s
}

func (s *ExtendData) SetCertName(v string) *ExtendData {
	s.CertName = &v
	return s
}

// 安卓加固HardeningTaskResponse
type HardeningTaskResponse struct {
	// 加固任务的 ID，后续用来轮询调用
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 加固任务的状态
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 加固后 APK/ABB 的 MD5
	AfterMdFive *string `json:"after_md_five,omitempty" xml:"after_md_five,omitempty" require:"true"`
	// 加固后 APK/ABB 的大小
	AfterSize *int64 `json:"after_size,omitempty" xml:"after_size,omitempty" require:"true"`
}

func (s HardeningTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s HardeningTaskResponse) GoString() string {
	return s.String()
}

func (s *HardeningTaskResponse) SetTaskId(v string) *HardeningTaskResponse {
	s.TaskId = &v
	return s
}

func (s *HardeningTaskResponse) SetStatus(v int64) *HardeningTaskResponse {
	s.Status = &v
	return s
}

func (s *HardeningTaskResponse) SetAfterMdFive(v string) *HardeningTaskResponse {
	s.AfterMdFive = &v
	return s
}

func (s *HardeningTaskResponse) SetAfterSize(v int64) *HardeningTaskResponse {
	s.AfterSize = &v
	return s
}

// 终端安全MarketingRiskData
type MarketingRiskData struct {
	// risk_level
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// sug_action
	SugAction *string `json:"sug_action,omitempty" xml:"sug_action,omitempty" require:"true"`
	// `
	RiskLabels []*string `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" require:"true" type:"Repeated"`
}

func (s MarketingRiskData) String() string {
	return tea.Prettify(s)
}

func (s MarketingRiskData) GoString() string {
	return s.String()
}

func (s *MarketingRiskData) SetRiskLevel(v int64) *MarketingRiskData {
	s.RiskLevel = &v
	return s
}

func (s *MarketingRiskData) SetSugAction(v string) *MarketingRiskData {
	s.SugAction = &v
	return s
}

func (s *MarketingRiskData) SetRiskLabels(v []*string) *MarketingRiskData {
	s.RiskLabels = v
	return s
}

// ZolozAlertTaskBO
type ZolozAlertTaskBO struct {
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// decision
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// taskId
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// userId
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// crrRiskLevel
	CrrRiskLevel *string `json:"crr_risk_level,omitempty" xml:"crr_risk_level,omitempty" require:"true"`
	// createTime
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// updateTime
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// modifier
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty" require:"true"`
}

func (s ZolozAlertTaskBO) String() string {
	return tea.Prettify(s)
}

func (s ZolozAlertTaskBO) GoString() string {
	return s.String()
}

func (s *ZolozAlertTaskBO) SetRequestId(v string) *ZolozAlertTaskBO {
	s.RequestId = &v
	return s
}

func (s *ZolozAlertTaskBO) SetDecision(v string) *ZolozAlertTaskBO {
	s.Decision = &v
	return s
}

func (s *ZolozAlertTaskBO) SetStatus(v string) *ZolozAlertTaskBO {
	s.Status = &v
	return s
}

func (s *ZolozAlertTaskBO) SetTaskId(v string) *ZolozAlertTaskBO {
	s.TaskId = &v
	return s
}

func (s *ZolozAlertTaskBO) SetType(v string) *ZolozAlertTaskBO {
	s.Type = &v
	return s
}

func (s *ZolozAlertTaskBO) SetUserId(v string) *ZolozAlertTaskBO {
	s.UserId = &v
	return s
}

func (s *ZolozAlertTaskBO) SetSource(v string) *ZolozAlertTaskBO {
	s.Source = &v
	return s
}

func (s *ZolozAlertTaskBO) SetCrrRiskLevel(v string) *ZolozAlertTaskBO {
	s.CrrRiskLevel = &v
	return s
}

func (s *ZolozAlertTaskBO) SetCreateTime(v string) *ZolozAlertTaskBO {
	s.CreateTime = &v
	return s
}

func (s *ZolozAlertTaskBO) SetUpdateTime(v string) *ZolozAlertTaskBO {
	s.UpdateTime = &v
	return s
}

func (s *ZolozAlertTaskBO) SetModifier(v string) *ZolozAlertTaskBO {
	s.Modifier = &v
	return s
}

// 设备风险查询data
type DeviceRiskResp struct {
	// apdid
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" require:"true"`
	// apdid
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// riskLevel
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// risk_desc
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// sug_action
	SugAction *string `json:"sug_action,omitempty" xml:"sug_action,omitempty" require:"true"`
	// risk_labels
	RiskLabels []*string `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" require:"true" type:"Repeated"`
}

func (s DeviceRiskResp) String() string {
	return tea.Prettify(s)
}

func (s DeviceRiskResp) GoString() string {
	return s.String()
}

func (s *DeviceRiskResp) SetApdid(v string) *DeviceRiskResp {
	s.Apdid = &v
	return s
}

func (s *DeviceRiskResp) SetApdidToken(v string) *DeviceRiskResp {
	s.ApdidToken = &v
	return s
}

func (s *DeviceRiskResp) SetRiskLevel(v int64) *DeviceRiskResp {
	s.RiskLevel = &v
	return s
}

func (s *DeviceRiskResp) SetRiskDesc(v string) *DeviceRiskResp {
	s.RiskDesc = &v
	return s
}

func (s *DeviceRiskResp) SetSugAction(v string) *DeviceRiskResp {
	s.SugAction = &v
	return s
}

func (s *DeviceRiskResp) SetRiskLabels(v []*string) *DeviceRiskResp {
	s.RiskLabels = v
	return s
}

// 设备信息上报
type DeviceRiskReportResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// result_code
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// result_status
	ResultStatus *string `json:"result_status,omitempty" xml:"result_status,omitempty" require:"true"`
	// apdid
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" require:"true"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// current_time
	CurrentTime *string `json:"current_time,omitempty" xml:"current_time,omitempty" require:"true"`
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// vkey_switch
	VkeySwitch *string `json:"vkey_switch,omitempty" xml:"vkey_switch,omitempty" require:"true"`
	// bug_track_switch
	BugTrackSwitch *string `json:"bug_track_switch,omitempty" xml:"bug_track_switch,omitempty" require:"true"`
	// app_list_ver
	AppListVer *string `json:"app_list_ver,omitempty" xml:"app_list_ver,omitempty" require:"true"`
	// dynamic_key
	DynamicKey *string `json:"dynamic_key,omitempty" xml:"dynamic_key,omitempty" require:"true"`
	// result_data
	ResultData *DeviceRiskReportResultData `json:"result_data,omitempty" xml:"result_data,omitempty" require:"true"`
}

func (s DeviceRiskReportResult) String() string {
	return tea.Prettify(s)
}

func (s DeviceRiskReportResult) GoString() string {
	return s.String()
}

func (s *DeviceRiskReportResult) SetSuccess(v bool) *DeviceRiskReportResult {
	s.Success = &v
	return s
}

func (s *DeviceRiskReportResult) SetResultCode(v string) *DeviceRiskReportResult {
	s.ResultCode = &v
	return s
}

func (s *DeviceRiskReportResult) SetResultStatus(v string) *DeviceRiskReportResult {
	s.ResultStatus = &v
	return s
}

func (s *DeviceRiskReportResult) SetApdid(v string) *DeviceRiskReportResult {
	s.Apdid = &v
	return s
}

func (s *DeviceRiskReportResult) SetToken(v string) *DeviceRiskReportResult {
	s.Token = &v
	return s
}

func (s *DeviceRiskReportResult) SetCurrentTime(v string) *DeviceRiskReportResult {
	s.CurrentTime = &v
	return s
}

func (s *DeviceRiskReportResult) SetVersion(v string) *DeviceRiskReportResult {
	s.Version = &v
	return s
}

func (s *DeviceRiskReportResult) SetVkeySwitch(v string) *DeviceRiskReportResult {
	s.VkeySwitch = &v
	return s
}

func (s *DeviceRiskReportResult) SetBugTrackSwitch(v string) *DeviceRiskReportResult {
	s.BugTrackSwitch = &v
	return s
}

func (s *DeviceRiskReportResult) SetAppListVer(v string) *DeviceRiskReportResult {
	s.AppListVer = &v
	return s
}

func (s *DeviceRiskReportResult) SetDynamicKey(v string) *DeviceRiskReportResult {
	s.DynamicKey = &v
	return s
}

func (s *DeviceRiskReportResult) SetResultData(v *DeviceRiskReportResultData) *DeviceRiskReportResult {
	s.ResultData = v
	return s
}

// 终端安全-Android应用加固-ClassMethodConfig
type ClassMethodConfig struct {
	// 加固类名
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty" require:"true"`
	// 方法集合，使用英文逗号分隔
	Methods *string `json:"methods,omitempty" xml:"methods,omitempty" require:"true"`
}

func (s ClassMethodConfig) String() string {
	return tea.Prettify(s)
}

func (s ClassMethodConfig) GoString() string {
	return s.String()
}

func (s *ClassMethodConfig) SetClassName(v string) *ClassMethodConfig {
	s.ClassName = &v
	return s
}

func (s *ClassMethodConfig) SetMethods(v string) *ClassMethodConfig {
	s.Methods = &v
	return s
}

// Hit details
type HitResults struct {
	// Reason for the screening decision. See more details in API-specific result codes.
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// Result status. Possible values and their meanings are as below:
	//
	// "S": successful
	//
	// "F": failed
	//
	// "U": unknown issue
	ResultStatus *string `json:"result_status,omitempty" xml:"result_status,omitempty" require:"true"`
	// Result message.
	//
	// See more details in API-specific result codes.
	ResultMessage *string `json:"result_message,omitempty" xml:"result_message,omitempty" require:"true"`
}

func (s HitResults) String() string {
	return tea.Prettify(s)
}

func (s HitResults) GoString() string {
	return s.String()
}

func (s *HitResults) SetResultCode(v string) *HitResults {
	s.ResultCode = &v
	return s
}

func (s *HitResults) SetResultStatus(v string) *HitResults {
	s.ResultStatus = &v
	return s
}

func (s *HitResults) SetResultMessage(v string) *HitResults {
	s.ResultMessage = &v
	return s
}

// MarketingRiskSecurityData
type MarketingRiskSecurityData struct {
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// signature
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
	// solution_risk_code
	SolutionRiskCode *string `json:"solution_risk_code,omitempty" xml:"solution_risk_code,omitempty" require:"true"`
}

func (s MarketingRiskSecurityData) String() string {
	return tea.Prettify(s)
}

func (s MarketingRiskSecurityData) GoString() string {
	return s.String()
}

func (s *MarketingRiskSecurityData) SetApdidToken(v string) *MarketingRiskSecurityData {
	s.ApdidToken = &v
	return s
}

func (s *MarketingRiskSecurityData) SetSignature(v string) *MarketingRiskSecurityData {
	s.Signature = &v
	return s
}

func (s *MarketingRiskSecurityData) SetSolutionRiskCode(v string) *MarketingRiskSecurityData {
	s.SolutionRiskCode = &v
	return s
}

type CreateBlueshieldSecuritypictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	//
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 客户名
	//
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty" require:"true"`
	// 操作系统
	//
	OsType *string `json:"os_type,omitempty" xml:"os_type,omitempty" require:"true"`
	// 包名
	//
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 签名信息
	//
	CertSign *string `json:"cert_sign,omitempty" xml:"cert_sign,omitempty"`
	// 签名秘钥内容
	//
	AppKeyData *string `json:"app_key_data,omitempty" xml:"app_key_data,omitempty"`
	// 加密秘钥内容
	//
	SecurityData *string `json:"security_data,omitempty" xml:"security_data,omitempty"`
	// 自定义秘钥内容
	//
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 白盒秘钥内容
	//
	WhiteBoxData *string `json:"white_box_data,omitempty" xml:"white_box_data,omitempty"`
}

func (s CreateBlueshieldSecuritypictureRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlueshieldSecuritypictureRequest) GoString() string {
	return s.String()
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAuthToken(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetProductInstanceId(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAppName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AppName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetClientName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ClientName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetOsType(v string) *CreateBlueshieldSecuritypictureRequest {
	s.OsType = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetPackageName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.PackageName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetCertSign(v string) *CreateBlueshieldSecuritypictureRequest {
	s.CertSign = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAppKeyData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AppKeyData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetSecurityData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.SecurityData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetExtraData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ExtraData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetWhiteBoxData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.WhiteBoxData = &v
	return s
}

type CreateBlueshieldSecuritypictureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行是否成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 生成的图片文件名
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// body base 64
	//
	BodyBase64 *string `json:"body_base64,omitempty" xml:"body_base64,omitempty"`
}

func (s CreateBlueshieldSecuritypictureResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlueshieldSecuritypictureResponse) GoString() string {
	return s.String()
}

func (s *CreateBlueshieldSecuritypictureResponse) SetReqMsgId(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetResultCode(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetResultMsg(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetSuccess(v bool) *CreateBlueshieldSecuritypictureResponse {
	s.Success = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetFileName(v string) *CreateBlueshieldSecuritypictureResponse {
	s.FileName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetBodyBase64(v string) *CreateBlueshieldSecuritypictureResponse {
	s.BodyBase64 = &v
	return s
}

type QueryFaceshieldNativeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id，标识客户来源
	//
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 设备token
	//
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// 切面数据（JSON，详见下方）
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
	// 签名信息	否（和切面二选一即可）
	//
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 签名因子（和切面二选一即可）
	//
	SignFactor *string `json:"sign_factor,omitempty" xml:"sign_factor,omitempty"`
}

func (s QueryFaceshieldNativeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldNativeRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldNativeRequest) SetAuthToken(v string) *QueryFaceshieldNativeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetProductInstanceId(v string) *QueryFaceshieldNativeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetClientId(v string) *QueryFaceshieldNativeRequest {
	s.ClientId = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetApdidToken(v string) *QueryFaceshieldNativeRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetAopData(v string) *QueryFaceshieldNativeRequest {
	s.AopData = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetSignature(v string) *QueryFaceshieldNativeRequest {
	s.Signature = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetSignFactor(v string) *QueryFaceshieldNativeRequest {
	s.SignFactor = &v
	return s
}

type QueryFaceshieldNativeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true成功，false失败
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求码，200成功，其他失败，具体见错误码
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误时的返回信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求时传入的，若没有传，则系统自动生成
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
	Data *FaceShieldResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFaceshieldNativeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldNativeResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldNativeResponse) SetReqMsgId(v string) *QueryFaceshieldNativeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetResultCode(v string) *QueryFaceshieldNativeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetResultMsg(v string) *QueryFaceshieldNativeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetSuccess(v bool) *QueryFaceshieldNativeResponse {
	s.Success = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetCode(v int64) *QueryFaceshieldNativeResponse {
	s.Code = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetMessage(v string) *QueryFaceshieldNativeResponse {
	s.Message = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetRequestId(v string) *QueryFaceshieldNativeResponse {
	s.RequestId = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetData(v *FaceShieldResult) *QueryFaceshieldNativeResponse {
	s.Data = v
	return s
}

type SubmitAshieldHardeningtaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// APK,ABB 上传后的地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 开启so加固
	SoProtect *string `json:"so_protect,omitempty" xml:"so_protect,omitempty"`
	// 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
	SoProtectConfig *string `json:"so_protect_config,omitempty" xml:"so_protect_config,omitempty"`
	// 开启对assets下的资源文件进行加固
	AssetsProtect *string `json:"assets_protect,omitempty" xml:"assets_protect,omitempty"`
	// 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
	AssetsProtectConfing *string `json:"assets_protect_confing,omitempty" xml:"assets_protect_confing,omitempty"`
	// 开启运行时保护,需要填写的参数,具体参数见下方,json格式
	RuntimeProtectConfig *RuntimeProtectConfig `json:"runtime_protect_config,omitempty" xml:"runtime_protect_config,omitempty"`
	// 对生命周期函数进行java2jni保护
	EnableLifeFunc *string `json:"enable_life_func,omitempty" xml:"enable_life_func,omitempty"`
	// java2jni配置文件
	JavatocJniConfig []*ClassMethodConfig `json:"javatoc_jni_config,omitempty" xml:"javatoc_jni_config,omitempty" type:"Repeated"`
	// 扩展信息,json字符串,暂不使用
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s SubmitAshieldHardeningtaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAshieldHardeningtaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitAshieldHardeningtaskRequest) SetAuthToken(v string) *SubmitAshieldHardeningtaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetProductInstanceId(v string) *SubmitAshieldHardeningtaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetFileUrl(v string) *SubmitAshieldHardeningtaskRequest {
	s.FileUrl = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetSoProtect(v string) *SubmitAshieldHardeningtaskRequest {
	s.SoProtect = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetSoProtectConfig(v string) *SubmitAshieldHardeningtaskRequest {
	s.SoProtectConfig = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetAssetsProtect(v string) *SubmitAshieldHardeningtaskRequest {
	s.AssetsProtect = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetAssetsProtectConfing(v string) *SubmitAshieldHardeningtaskRequest {
	s.AssetsProtectConfing = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetRuntimeProtectConfig(v *RuntimeProtectConfig) *SubmitAshieldHardeningtaskRequest {
	s.RuntimeProtectConfig = v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetEnableLifeFunc(v string) *SubmitAshieldHardeningtaskRequest {
	s.EnableLifeFunc = &v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetJavatocJniConfig(v []*ClassMethodConfig) *SubmitAshieldHardeningtaskRequest {
	s.JavatocJniConfig = v
	return s
}

func (s *SubmitAshieldHardeningtaskRequest) SetExtInfo(v string) *SubmitAshieldHardeningtaskRequest {
	s.ExtInfo = &v
	return s
}

type SubmitAshieldHardeningtaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 查询是否成功
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// SUCCESS为成功,其他为失败
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// 返回信息描述
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// 返回的具体对象
	ResData *HardeningTaskResponse `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s SubmitAshieldHardeningtaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAshieldHardeningtaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitAshieldHardeningtaskResponse) SetReqMsgId(v string) *SubmitAshieldHardeningtaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResultCode(v string) *SubmitAshieldHardeningtaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResultMsg(v string) *SubmitAshieldHardeningtaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetRequestId(v string) *SubmitAshieldHardeningtaskResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResSuccess(v bool) *SubmitAshieldHardeningtaskResponse {
	s.ResSuccess = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResCode(v string) *SubmitAshieldHardeningtaskResponse {
	s.ResCode = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResMessage(v string) *SubmitAshieldHardeningtaskResponse {
	s.ResMessage = &v
	return s
}

func (s *SubmitAshieldHardeningtaskResponse) SetResData(v *HardeningTaskResponse) *SubmitAshieldHardeningtaskResponse {
	s.ResData = v
	return s
}

type QueryDeviceriskFingerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskFingerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskFingerRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskFingerRequest) SetAuthToken(v string) *QueryDeviceriskFingerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetProductInstanceId(v string) *QueryDeviceriskFingerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetApdidToken(v string) *QueryDeviceriskFingerRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetClientId(v string) *QueryDeviceriskFingerRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskFingerRequest) SetTerminalType(v string) *QueryDeviceriskFingerRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskFingerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskFingerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskFingerResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskFingerResponse) SetReqMsgId(v string) *QueryDeviceriskFingerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetResultCode(v string) *QueryDeviceriskFingerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetResultMsg(v string) *QueryDeviceriskFingerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetCode(v int64) *QueryDeviceriskFingerResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetMessage(v string) *QueryDeviceriskFingerResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetRequestId(v string) *QueryDeviceriskFingerResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetSuccess(v bool) *QueryDeviceriskFingerResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskFingerResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskFingerResponse {
	s.Data = v
	return s
}

type QueryDeviceriskDeviceriskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// app_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// env_id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// merchant_id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskDeviceriskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskDeviceriskRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskDeviceriskRequest) SetAuthToken(v string) *QueryDeviceriskDeviceriskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetProductInstanceId(v string) *QueryDeviceriskDeviceriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetApdidToken(v string) *QueryDeviceriskDeviceriskRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetClientId(v string) *QueryDeviceriskDeviceriskRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetAppId(v string) *QueryDeviceriskDeviceriskRequest {
	s.AppId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetEnvId(v string) *QueryDeviceriskDeviceriskRequest {
	s.EnvId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetTenantId(v string) *QueryDeviceriskDeviceriskRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetMerchantId(v string) *QueryDeviceriskDeviceriskRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetAppName(v string) *QueryDeviceriskDeviceriskRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeviceriskDeviceriskRequest) SetTerminalType(v string) *QueryDeviceriskDeviceriskRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskDeviceriskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskDeviceriskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskDeviceriskResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskDeviceriskResponse) SetReqMsgId(v string) *QueryDeviceriskDeviceriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetResultCode(v string) *QueryDeviceriskDeviceriskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetResultMsg(v string) *QueryDeviceriskDeviceriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetCode(v int64) *QueryDeviceriskDeviceriskResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetMessage(v string) *QueryDeviceriskDeviceriskResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetRequestId(v string) *QueryDeviceriskDeviceriskResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetSuccess(v bool) *QueryDeviceriskDeviceriskResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskDeviceriskResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskDeviceriskResponse {
	s.Data = v
	return s
}

type QueryFaceshieldWebRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id，标识客户来源
	//
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// aop_data
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
}

func (s QueryFaceshieldWebRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldWebRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldWebRequest) SetAuthToken(v string) *QueryFaceshieldWebRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetProductInstanceId(v string) *QueryFaceshieldWebRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetClientId(v string) *QueryFaceshieldWebRequest {
	s.ClientId = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetApdidToken(v string) *QueryFaceshieldWebRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetAopData(v string) *QueryFaceshieldWebRequest {
	s.AopData = &v
	return s
}

type QueryFaceshieldWebResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求码，200成功，其他失败，具体见错误码
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误时的返回信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求时传入的，若没有传，则系统自动生成
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// data
	Data *FaceShieldResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFaceshieldWebResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldWebResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldWebResponse) SetReqMsgId(v string) *QueryFaceshieldWebResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetResultCode(v string) *QueryFaceshieldWebResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetResultMsg(v string) *QueryFaceshieldWebResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetSuccess(v bool) *QueryFaceshieldWebResponse {
	s.Success = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetCode(v int64) *QueryFaceshieldWebResponse {
	s.Code = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetMessage(v string) *QueryFaceshieldWebResponse {
	s.Message = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetRequestId(v string) *QueryFaceshieldWebResponse {
	s.RequestId = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetData(v *FaceShieldResult) *QueryFaceshieldWebResponse {
	s.Data = v
	return s
}

type SubmitDeviceriskReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// request_data
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SubmitDeviceriskReportRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDeviceriskReportRequest) GoString() string {
	return s.String()
}

func (s *SubmitDeviceriskReportRequest) SetAuthToken(v string) *SubmitDeviceriskReportRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDeviceriskReportRequest) SetProductInstanceId(v string) *SubmitDeviceriskReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitDeviceriskReportRequest) SetRequestData(v string) *SubmitDeviceriskReportRequest {
	s.RequestData = &v
	return s
}

type SubmitDeviceriskReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// apdid
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty"`
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// current_time
	CurrentTime *string `json:"current_time,omitempty" xml:"current_time,omitempty"`
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// vkey_switch
	VkeySwitch *string `json:"vkey_switch,omitempty" xml:"vkey_switch,omitempty"`
	// bug_track_switch
	BugTrackSwitch *string `json:"bug_track_switch,omitempty" xml:"bug_track_switch,omitempty"`
	// app_list_ver
	AppListVer *string `json:"app_list_ver,omitempty" xml:"app_list_ver,omitempty"`
	// dynamic_key
	DynamicKey *string `json:"dynamic_key,omitempty" xml:"dynamic_key,omitempty"`
	// result_data
	ResultData *DeviceRiskReportResultData `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s SubmitDeviceriskReportResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDeviceriskReportResponse) GoString() string {
	return s.String()
}

func (s *SubmitDeviceriskReportResponse) SetReqMsgId(v string) *SubmitDeviceriskReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetResultCode(v string) *SubmitDeviceriskReportResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetResultMsg(v string) *SubmitDeviceriskReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetSuccess(v bool) *SubmitDeviceriskReportResponse {
	s.Success = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetApdid(v string) *SubmitDeviceriskReportResponse {
	s.Apdid = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetToken(v string) *SubmitDeviceriskReportResponse {
	s.Token = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetCurrentTime(v string) *SubmitDeviceriskReportResponse {
	s.CurrentTime = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetVersion(v string) *SubmitDeviceriskReportResponse {
	s.Version = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetVkeySwitch(v string) *SubmitDeviceriskReportResponse {
	s.VkeySwitch = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetBugTrackSwitch(v string) *SubmitDeviceriskReportResponse {
	s.BugTrackSwitch = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetAppListVer(v string) *SubmitDeviceriskReportResponse {
	s.AppListVer = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetDynamicKey(v string) *SubmitDeviceriskReportResponse {
	s.DynamicKey = &v
	return s
}

func (s *SubmitDeviceriskReportResponse) SetResultData(v *DeviceRiskReportResultData) *SubmitDeviceriskReportResponse {
	s.ResultData = v
	return s
}

type QueryEaglepromoMarketingriskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// security_data
	SecurityData *MarketingRiskSecurityData `json:"security_data,omitempty" xml:"security_data,omitempty" require:"true"`
	// sign_factor
	SignFactor *string `json:"sign_factor,omitempty" xml:"sign_factor,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// biz_code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryEaglepromoMarketingriskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEaglepromoMarketingriskRequest) GoString() string {
	return s.String()
}

func (s *QueryEaglepromoMarketingriskRequest) SetAuthToken(v string) *QueryEaglepromoMarketingriskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetProductInstanceId(v string) *QueryEaglepromoMarketingriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetSecurityData(v *MarketingRiskSecurityData) *QueryEaglepromoMarketingriskRequest {
	s.SecurityData = v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetSignFactor(v string) *QueryEaglepromoMarketingriskRequest {
	s.SignFactor = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetClientId(v string) *QueryEaglepromoMarketingriskRequest {
	s.ClientId = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetRequestId(v string) *QueryEaglepromoMarketingriskRequest {
	s.RequestId = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetBizCode(v string) *QueryEaglepromoMarketingriskRequest {
	s.BizCode = &v
	return s
}

func (s *QueryEaglepromoMarketingriskRequest) SetTerminalType(v string) *QueryEaglepromoMarketingriskRequest {
	s.TerminalType = &v
	return s
}

type QueryEaglepromoMarketingriskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *MarketingRiskData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryEaglepromoMarketingriskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEaglepromoMarketingriskResponse) GoString() string {
	return s.String()
}

func (s *QueryEaglepromoMarketingriskResponse) SetReqMsgId(v string) *QueryEaglepromoMarketingriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetResultCode(v string) *QueryEaglepromoMarketingriskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetResultMsg(v string) *QueryEaglepromoMarketingriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetSuccess(v bool) *QueryEaglepromoMarketingriskResponse {
	s.Success = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetMessage(v string) *QueryEaglepromoMarketingriskResponse {
	s.Message = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetCode(v int64) *QueryEaglepromoMarketingriskResponse {
	s.Code = &v
	return s
}

func (s *QueryEaglepromoMarketingriskResponse) SetData(v *MarketingRiskData) *QueryEaglepromoMarketingriskResponse {
	s.Data = v
	return s
}

type SubmitAmlcloudAnalyzeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// biz_code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// tnt_inst_id
	TntInstId *string `json:"tnt_inst_id,omitempty" xml:"tnt_inst_id,omitempty" require:"true"`
	// extendData
	ExtendData *ExtendData `json:"extend_data,omitempty" xml:"extend_data,omitempty" require:"true"`
}

func (s SubmitAmlcloudAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAmlcloudAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *SubmitAmlcloudAnalyzeRequest) SetAuthToken(v string) *SubmitAmlcloudAnalyzeRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeRequest) SetProductInstanceId(v string) *SubmitAmlcloudAnalyzeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeRequest) SetBizCode(v string) *SubmitAmlcloudAnalyzeRequest {
	s.BizCode = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeRequest) SetTenantId(v string) *SubmitAmlcloudAnalyzeRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeRequest) SetTntInstId(v string) *SubmitAmlcloudAnalyzeRequest {
	s.TntInstId = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeRequest) SetExtendData(v *ExtendData) *SubmitAmlcloudAnalyzeRequest {
	s.ExtendData = v
	return s
}

type SubmitAmlcloudAnalyzeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Unique business ID for tracing purposes
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// Screening decisions:
	//
	// ACCEPT: Did not hit any watchlist
	//
	// REJECT: Hit some watchlists
	//
	// REVIEW: Potentially hit some watchlists
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// Hit details
	HitResults *HitResults `json:"hit_results,omitempty" xml:"hit_results,omitempty"`
}

func (s SubmitAmlcloudAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAmlcloudAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *SubmitAmlcloudAnalyzeResponse) SetReqMsgId(v string) *SubmitAmlcloudAnalyzeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeResponse) SetResultCode(v string) *SubmitAmlcloudAnalyzeResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeResponse) SetResultMsg(v string) *SubmitAmlcloudAnalyzeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeResponse) SetRequestId(v string) *SubmitAmlcloudAnalyzeResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeResponse) SetDecision(v string) *SubmitAmlcloudAnalyzeResponse {
	s.Decision = &v
	return s
}

func (s *SubmitAmlcloudAnalyzeResponse) SetHitResults(v *HitResults) *SubmitAmlcloudAnalyzeResponse {
	s.HitResults = v
	return s
}

type QueryAmlcloudAnalyzeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAmlcloudAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlcloudAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *QueryAmlcloudAnalyzeRequest) SetAuthToken(v string) *QueryAmlcloudAnalyzeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAmlcloudAnalyzeRequest) SetProductInstanceId(v string) *QueryAmlcloudAnalyzeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAmlcloudAnalyzeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAmlcloudAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlcloudAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *QueryAmlcloudAnalyzeResponse) SetReqMsgId(v string) *QueryAmlcloudAnalyzeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAmlcloudAnalyzeResponse) SetResultCode(v string) *QueryAmlcloudAnalyzeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAmlcloudAnalyzeResponse) SetResultMsg(v string) *QueryAmlcloudAnalyzeResponse {
	s.ResultMsg = &v
	return s
}

type QueryAmlcloudCheckcaseresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAmlcloudCheckcaseresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlcloudCheckcaseresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAmlcloudCheckcaseresultRequest) SetAuthToken(v string) *QueryAmlcloudCheckcaseresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAmlcloudCheckcaseresultRequest) SetProductInstanceId(v string) *QueryAmlcloudCheckcaseresultRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAmlcloudCheckcaseresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAmlcloudCheckcaseresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlcloudCheckcaseresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAmlcloudCheckcaseresultResponse) SetReqMsgId(v string) *QueryAmlcloudCheckcaseresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAmlcloudCheckcaseresultResponse) SetResultCode(v string) *QueryAmlcloudCheckcaseresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAmlcloudCheckcaseresultResponse) SetResultMsg(v string) *QueryAmlcloudCheckcaseresultResponse {
	s.ResultMsg = &v
	return s
}

type SubmitAmlcloudCheckcaseresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，业务的唯一标识，用于追踪业务。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 客户的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 任务来源。取值如下：
	// ● REALTIME：来源于扫描信息接口。
	// ● BATCH：来源于数据仓库。
	// ● ALL：包含以上所有的任务来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 任务类型。取值如下：
	// ● PEP：政治高风险人物。
	// ● SANCTION：制裁名单。
	// ● NEGATIVE_NEWS：负面新闻。
	// ● INTERNAL_LIST：自定义名单。
	// ● EDD：加强尽职调查。
	// ● ALL：包含以上所有的任务类型。
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s SubmitAmlcloudCheckcaseresultRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAmlcloudCheckcaseresultRequest) GoString() string {
	return s.String()
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetAuthToken(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetProductInstanceId(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetRequestId(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.RequestId = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetTenantId(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.TenantId = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetSource(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.Source = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultRequest) SetType(v string) *SubmitAmlcloudCheckcaseresultRequest {
	s.Type = &v
	return s
}

type SubmitAmlcloudCheckcaseresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务结果详情
	CaseDetails []*ZolozAlertTaskBO `json:"case_details,omitempty" xml:"case_details,omitempty" type:"Repeated"`
}

func (s SubmitAmlcloudCheckcaseresultResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAmlcloudCheckcaseresultResponse) GoString() string {
	return s.String()
}

func (s *SubmitAmlcloudCheckcaseresultResponse) SetReqMsgId(v string) *SubmitAmlcloudCheckcaseresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultResponse) SetResultCode(v string) *SubmitAmlcloudCheckcaseresultResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultResponse) SetResultMsg(v string) *SubmitAmlcloudCheckcaseresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAmlcloudCheckcaseresultResponse) SetCaseDetails(v []*ZolozAlertTaskBO) *SubmitAmlcloudCheckcaseresultResponse {
	s.CaseDetails = v
	return s
}

type QueryAmlclouduatAnalyzeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAmlclouduatAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlclouduatAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *QueryAmlclouduatAnalyzeRequest) SetAuthToken(v string) *QueryAmlclouduatAnalyzeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAmlclouduatAnalyzeRequest) SetProductInstanceId(v string) *QueryAmlclouduatAnalyzeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAmlclouduatAnalyzeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAmlclouduatAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlclouduatAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *QueryAmlclouduatAnalyzeResponse) SetReqMsgId(v string) *QueryAmlclouduatAnalyzeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAmlclouduatAnalyzeResponse) SetResultCode(v string) *QueryAmlclouduatAnalyzeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAmlclouduatAnalyzeResponse) SetResultMsg(v string) *QueryAmlclouduatAnalyzeResponse {
	s.ResultMsg = &v
	return s
}

type QueryAmlclouduatCheckcaseresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAmlclouduatCheckcaseresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlclouduatCheckcaseresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAmlclouduatCheckcaseresultRequest) SetAuthToken(v string) *QueryAmlclouduatCheckcaseresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAmlclouduatCheckcaseresultRequest) SetProductInstanceId(v string) *QueryAmlclouduatCheckcaseresultRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAmlclouduatCheckcaseresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAmlclouduatCheckcaseresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAmlclouduatCheckcaseresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAmlclouduatCheckcaseresultResponse) SetReqMsgId(v string) *QueryAmlclouduatCheckcaseresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAmlclouduatCheckcaseresultResponse) SetResultCode(v string) *QueryAmlclouduatCheckcaseresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAmlclouduatCheckcaseresultResponse) SetResultMsg(v string) *QueryAmlclouduatCheckcaseresultResponse {
	s.ResultMsg = &v
	return s
}

type GetAshieldFiletokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetAshieldFiletokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldFiletokenRequest) GoString() string {
	return s.String()
}

func (s *GetAshieldFiletokenRequest) SetAuthToken(v string) *GetAshieldFiletokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAshieldFiletokenRequest) SetProductInstanceId(v string) *GetAshieldFiletokenRequest {
	s.ProductInstanceId = &v
	return s
}

type GetAshieldFiletokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ·
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// res_success
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// res_code
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// res_message
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// ·
	ResData *FileTokenForUpload `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s GetAshieldFiletokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldFiletokenResponse) GoString() string {
	return s.String()
}

func (s *GetAshieldFiletokenResponse) SetReqMsgId(v string) *GetAshieldFiletokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResultCode(v string) *GetAshieldFiletokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResultMsg(v string) *GetAshieldFiletokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetRequestId(v string) *GetAshieldFiletokenResponse {
	s.RequestId = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResSuccess(v bool) *GetAshieldFiletokenResponse {
	s.ResSuccess = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResCode(v string) *GetAshieldFiletokenResponse {
	s.ResCode = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResMessage(v string) *GetAshieldFiletokenResponse {
	s.ResMessage = &v
	return s
}

func (s *GetAshieldFiletokenResponse) SetResData(v *FileTokenForUpload) *GetAshieldFiletokenResponse {
	s.ResData = v
	return s
}

type GetAshieldHardeningtaskprocessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加固任务 ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s GetAshieldHardeningtaskprocessRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeningtaskprocessRequest) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeningtaskprocessRequest) SetAuthToken(v string) *GetAshieldHardeningtaskprocessRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessRequest) SetProductInstanceId(v string) *GetAshieldHardeningtaskprocessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessRequest) SetTaskId(v string) *GetAshieldHardeningtaskprocessRequest {
	s.TaskId = &v
	return s
}

type GetAshieldHardeningtaskprocessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 查询是否成功
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// SUCCESS为成功，其他为失败
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// 返回信息描述
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// 返回的具体对象
	ResData *HardeningTaskResponse `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s GetAshieldHardeningtaskprocessResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeningtaskprocessResponse) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeningtaskprocessResponse) SetReqMsgId(v string) *GetAshieldHardeningtaskprocessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResultCode(v string) *GetAshieldHardeningtaskprocessResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResultMsg(v string) *GetAshieldHardeningtaskprocessResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetRequestId(v string) *GetAshieldHardeningtaskprocessResponse {
	s.RequestId = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResSuccess(v bool) *GetAshieldHardeningtaskprocessResponse {
	s.ResSuccess = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResCode(v string) *GetAshieldHardeningtaskprocessResponse {
	s.ResCode = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResMessage(v string) *GetAshieldHardeningtaskprocessResponse {
	s.ResMessage = &v
	return s
}

func (s *GetAshieldHardeningtaskprocessResponse) SetResData(v *HardeningTaskResponse) *GetAshieldHardeningtaskprocessResponse {
	s.ResData = v
	return s
}

type GetAshieldHardeningresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加固任务 ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s GetAshieldHardeningresultRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeningresultRequest) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeningresultRequest) SetAuthToken(v string) *GetAshieldHardeningresultRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAshieldHardeningresultRequest) SetProductInstanceId(v string) *GetAshieldHardeningresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAshieldHardeningresultRequest) SetTaskId(v string) *GetAshieldHardeningresultRequest {
	s.TaskId = &v
	return s
}

type GetAshieldHardeningresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 查询是否成功
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// SUCCESS为成功，其他为失败
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// 返回信息描述
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// 返回的下载链接
	ResData *string `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s GetAshieldHardeningresultResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeningresultResponse) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeningresultResponse) SetReqMsgId(v string) *GetAshieldHardeningresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResultCode(v string) *GetAshieldHardeningresultResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResultMsg(v string) *GetAshieldHardeningresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetRequestId(v string) *GetAshieldHardeningresultResponse {
	s.RequestId = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResSuccess(v bool) *GetAshieldHardeningresultResponse {
	s.ResSuccess = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResCode(v string) *GetAshieldHardeningresultResponse {
	s.ResCode = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResMessage(v string) *GetAshieldHardeningresultResponse {
	s.ResMessage = &v
	return s
}

func (s *GetAshieldHardeningresultResponse) SetResData(v string) *GetAshieldHardeningresultResponse {
	s.ResData = &v
	return s
}

type GetAshieldHardeninglogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加固任务 ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s GetAshieldHardeninglogRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeninglogRequest) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeninglogRequest) SetAuthToken(v string) *GetAshieldHardeninglogRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAshieldHardeninglogRequest) SetProductInstanceId(v string) *GetAshieldHardeninglogRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAshieldHardeninglogRequest) SetTaskId(v string) *GetAshieldHardeninglogRequest {
	s.TaskId = &v
	return s
}

type GetAshieldHardeninglogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 查询是否成功
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// SUCCESS为成功，其他为失败
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// 返回信息描述
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// 返回的下载链接
	ResData *string `json:"res_data,omitempty" xml:"res_data,omitempty"`
}

func (s GetAshieldHardeninglogResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAshieldHardeninglogResponse) GoString() string {
	return s.String()
}

func (s *GetAshieldHardeninglogResponse) SetReqMsgId(v string) *GetAshieldHardeninglogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResultCode(v string) *GetAshieldHardeninglogResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResultMsg(v string) *GetAshieldHardeninglogResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetRequestId(v string) *GetAshieldHardeninglogResponse {
	s.RequestId = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResSuccess(v bool) *GetAshieldHardeninglogResponse {
	s.ResSuccess = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResCode(v string) *GetAshieldHardeninglogResponse {
	s.ResCode = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResMessage(v string) *GetAshieldHardeninglogResponse {
	s.ResMessage = &v
	return s
}

func (s *GetAshieldHardeninglogResponse) SetResData(v string) *GetAshieldHardeninglogResponse {
	s.ResData = &v
	return s
}

type QueryDeviceriskRisklabelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// client_id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty"`
	// terminal_type
	TerminalType *string `json:"terminal_type,omitempty" xml:"terminal_type,omitempty"`
}

func (s QueryDeviceriskRisklabelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskRisklabelRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskRisklabelRequest) SetAuthToken(v string) *QueryDeviceriskRisklabelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetProductInstanceId(v string) *QueryDeviceriskRisklabelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetApdidToken(v string) *QueryDeviceriskRisklabelRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetClientId(v string) *QueryDeviceriskRisklabelRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceriskRisklabelRequest) SetTerminalType(v string) *QueryDeviceriskRisklabelRequest {
	s.TerminalType = &v
	return s
}

type QueryDeviceriskRisklabelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// data
	Data *DeviceRiskResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceriskRisklabelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceriskRisklabelResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceriskRisklabelResponse) SetReqMsgId(v string) *QueryDeviceriskRisklabelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetResultCode(v string) *QueryDeviceriskRisklabelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetResultMsg(v string) *QueryDeviceriskRisklabelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetCode(v int64) *QueryDeviceriskRisklabelResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetMessage(v string) *QueryDeviceriskRisklabelResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetRequestId(v string) *QueryDeviceriskRisklabelResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetSuccess(v bool) *QueryDeviceriskRisklabelResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceriskRisklabelResponse) SetData(v *DeviceRiskResp) *QueryDeviceriskRisklabelResponse {
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
				"sdk_version":      tea.String("1.5.9"),
				"_prod_code":       tea.String("HK_SECURITYTECH"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBlueshieldSecuritypicture(request *CreateBlueshieldSecuritypictureRequest) (_result *CreateBlueshieldSecuritypictureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlueshieldSecuritypictureResponse{}
	_body, _err := client.CreateBlueshieldSecuritypictureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBlueshieldSecuritypictureEx(request *CreateBlueshieldSecuritypictureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlueshieldSecuritypictureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlueshieldSecuritypictureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.blueshield.securitypicture.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Native查询
 * Summary: 人脸盾Native查询
 */
func (client *Client) QueryFaceshieldNative(request *QueryFaceshieldNativeRequest) (_result *QueryFaceshieldNativeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceshieldNativeResponse{}
	_body, _err := client.QueryFaceshieldNativeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Native查询
 * Summary: 人脸盾Native查询
 */
func (client *Client) QueryFaceshieldNativeEx(request *QueryFaceshieldNativeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceshieldNativeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceshieldNativeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.faceshield.native.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-启动加固任务
 * Summary: 启动加固任务
 */
func (client *Client) SubmitAshieldHardeningtask(request *SubmitAshieldHardeningtaskRequest) (_result *SubmitAshieldHardeningtaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAshieldHardeningtaskResponse{}
	_body, _err := client.SubmitAshieldHardeningtaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-启动加固任务
 * Summary: 启动加固任务
 */
func (client *Client) SubmitAshieldHardeningtaskEx(request *SubmitAshieldHardeningtaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAshieldHardeningtaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAshieldHardeningtaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.ashield.hardeningtask.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskFinger(request *QueryDeviceriskFingerRequest) (_result *QueryDeviceriskFingerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskFingerResponse{}
	_body, _err := client.QueryDeviceriskFingerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskFingerEx(request *QueryDeviceriskFingerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskFingerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskFingerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.devicerisk.finger.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskDevicerisk(request *QueryDeviceriskDeviceriskRequest) (_result *QueryDeviceriskDeviceriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskDeviceriskResponse{}
	_body, _err := client.QueryDeviceriskDeviceriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskDeviceriskEx(request *QueryDeviceriskDeviceriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskDeviceriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskDeviceriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.devicerisk.devicerisk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Web查询
 * Summary: 人脸盾Web查询
 */
func (client *Client) QueryFaceshieldWeb(request *QueryFaceshieldWebRequest) (_result *QueryFaceshieldWebResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceshieldWebResponse{}
	_body, _err := client.QueryFaceshieldWebEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Web查询
 * Summary: 人脸盾Web查询
 */
func (client *Client) QueryFaceshieldWebEx(request *QueryFaceshieldWebRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceshieldWebResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceshieldWebResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.faceshield.web.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全 设备信息上报
 * Summary: 设备信息上报
 */
func (client *Client) SubmitDeviceriskReport(request *SubmitDeviceriskReportRequest) (_result *SubmitDeviceriskReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDeviceriskReportResponse{}
	_body, _err := client.SubmitDeviceriskReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全 设备信息上报
 * Summary: 设备信息上报
 */
func (client *Client) SubmitDeviceriskReportEx(request *SubmitDeviceriskReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDeviceriskReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDeviceriskReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.devicerisk.report.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全 EaglePromo
 * Summary: EaglePromo
 */
func (client *Client) QueryEaglepromoMarketingrisk(request *QueryEaglepromoMarketingriskRequest) (_result *QueryEaglepromoMarketingriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEaglepromoMarketingriskResponse{}
	_body, _err := client.QueryEaglepromoMarketingriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全 EaglePromo
 * Summary: EaglePromo
 */
func (client *Client) QueryEaglepromoMarketingriskEx(request *QueryEaglepromoMarketingriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEaglepromoMarketingriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEaglepromoMarketingriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.eaglepromo.marketingrisk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml analyze v2 form
 * Summary: aml analyze v2 form
 */
func (client *Client) SubmitAmlcloudAnalyze(request *SubmitAmlcloudAnalyzeRequest) (_result *SubmitAmlcloudAnalyzeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAmlcloudAnalyzeResponse{}
	_body, _err := client.SubmitAmlcloudAnalyzeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml analyze v2 form
 * Summary: aml analyze v2 form
 */
func (client *Client) SubmitAmlcloudAnalyzeEx(request *SubmitAmlcloudAnalyzeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAmlcloudAnalyzeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAmlcloudAnalyzeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlcloud.analyze.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
 * Summary: aml analyze v2 rest
 */
func (client *Client) QueryAmlcloudAnalyze(request *QueryAmlcloudAnalyzeRequest) (_result *QueryAmlcloudAnalyzeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAmlcloudAnalyzeResponse{}
	_body, _err := client.QueryAmlcloudAnalyzeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
 * Summary: aml analyze v2 rest
 */
func (client *Client) QueryAmlcloudAnalyzeEx(request *QueryAmlcloudAnalyzeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAmlcloudAnalyzeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAmlcloudAnalyzeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlcloud.analyze.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
 * Summary: aml check v2 rest
 */
func (client *Client) QueryAmlcloudCheckcaseresult(request *QueryAmlcloudCheckcaseresultRequest) (_result *QueryAmlcloudCheckcaseresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAmlcloudCheckcaseresultResponse{}
	_body, _err := client.QueryAmlcloudCheckcaseresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
 * Summary: aml check v2 rest
 */
func (client *Client) QueryAmlcloudCheckcaseresultEx(request *QueryAmlcloudCheckcaseresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAmlcloudCheckcaseresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAmlcloudCheckcaseresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlcloud.checkcaseresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml check v2 form
 * Summary: aml check v2 form
 */
func (client *Client) SubmitAmlcloudCheckcaseresult(request *SubmitAmlcloudCheckcaseresultRequest) (_result *SubmitAmlcloudCheckcaseresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAmlcloudCheckcaseresultResponse{}
	_body, _err := client.SubmitAmlcloudCheckcaseresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml check v2 form
 * Summary: aml check v2 form
 */
func (client *Client) SubmitAmlcloudCheckcaseresultEx(request *SubmitAmlcloudCheckcaseresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAmlcloudCheckcaseresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAmlcloudCheckcaseresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlcloud.checkcaseresult.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
 * Summary: aml analyze v2 rest
 */
func (client *Client) QueryAmlclouduatAnalyze(request *QueryAmlclouduatAnalyzeRequest) (_result *QueryAmlclouduatAnalyzeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAmlclouduatAnalyzeResponse{}
	_body, _err := client.QueryAmlclouduatAnalyzeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
 * Summary: aml analyze v2 rest
 */
func (client *Client) QueryAmlclouduatAnalyzeEx(request *QueryAmlclouduatAnalyzeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAmlclouduatAnalyzeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAmlclouduatAnalyzeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlclouduat.analyze.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
 * Summary: aml check v2 rest
 */
func (client *Client) QueryAmlclouduatCheckcaseresult(request *QueryAmlclouduatCheckcaseresultRequest) (_result *QueryAmlclouduatCheckcaseresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAmlclouduatCheckcaseresultResponse{}
	_body, _err := client.QueryAmlclouduatCheckcaseresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
 * Summary: aml check v2 rest
 */
func (client *Client) QueryAmlclouduatCheckcaseresultEx(request *QueryAmlclouduatCheckcaseresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAmlclouduatCheckcaseresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAmlclouduatCheckcaseresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.amlclouduat.checkcaseresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-获取上传文件的临时URL
 * Summary: 获取上传文件的临时URL
 */
func (client *Client) GetAshieldFiletoken(request *GetAshieldFiletokenRequest) (_result *GetAshieldFiletokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAshieldFiletokenResponse{}
	_body, _err := client.GetAshieldFiletokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-获取上传文件的临时URL
 * Summary: 获取上传文件的临时URL
 */
func (client *Client) GetAshieldFiletokenEx(request *GetAshieldFiletokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAshieldFiletokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAshieldFiletokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.ashield.filetoken.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固任务进度
 * Summary: 查询加固任务进度
 */
func (client *Client) GetAshieldHardeningtaskprocess(request *GetAshieldHardeningtaskprocessRequest) (_result *GetAshieldHardeningtaskprocessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAshieldHardeningtaskprocessResponse{}
	_body, _err := client.GetAshieldHardeningtaskprocessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固任务进度
 * Summary: 查询加固任务进度
 */
func (client *Client) GetAshieldHardeningtaskprocessEx(request *GetAshieldHardeningtaskprocessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAshieldHardeningtaskprocessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAshieldHardeningtaskprocessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.ashield.hardeningtaskprocess.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
 * Summary: 查询加固后的产物下载链接
 */
func (client *Client) GetAshieldHardeningresult(request *GetAshieldHardeningresultRequest) (_result *GetAshieldHardeningresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAshieldHardeningresultResponse{}
	_body, _err := client.GetAshieldHardeningresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
 * Summary: 查询加固后的产物下载链接
 */
func (client *Client) GetAshieldHardeningresultEx(request *GetAshieldHardeningresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAshieldHardeningresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAshieldHardeningresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.ashield.hardeningresult.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
 * Summary: 查询加固后的日志下载链接
 */
func (client *Client) GetAshieldHardeninglog(request *GetAshieldHardeninglogRequest) (_result *GetAshieldHardeninglogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAshieldHardeninglogResponse{}
	_body, _err := client.GetAshieldHardeninglogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
 * Summary: 查询加固后的日志下载链接
 */
func (client *Client) GetAshieldHardeninglogEx(request *GetAshieldHardeninglogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAshieldHardeninglogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAshieldHardeninglogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.ashield.hardeninglog.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险标签查询
 * Summary: 风险标签查询
 */
func (client *Client) QueryDeviceriskRisklabel(request *QueryDeviceriskRisklabelRequest) (_result *QueryDeviceriskRisklabelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceriskRisklabelResponse{}
	_body, _err := client.QueryDeviceriskRisklabelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险标签查询
 * Summary: 风险标签查询
 */
func (client *Client) QueryDeviceriskRisklabelEx(request *QueryDeviceriskRisklabelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskRisklabelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskRisklabelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("hksecuritytech.gateway.devicerisk.risklabel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
