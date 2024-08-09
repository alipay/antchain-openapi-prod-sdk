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

// 风险数据
type RiskData struct {
	// 模型/标签编号
	ResultKey *string `json:"result_key,omitempty" xml:"result_key,omitempty" require:"true"`
	// 模型分/标签值
	ResultValue *string `json:"result_value,omitempty" xml:"result_value,omitempty" require:"true"`
}

func (s RiskData) String() string {
	return tea.Prettify(s)
}

func (s RiskData) GoString() string {
	return s.String()
}

func (s *RiskData) SetResultKey(v string) *RiskData {
	s.ResultKey = &v
	return s
}

func (s *RiskData) SetResultValue(v string) *RiskData {
	s.ResultValue = &v
	return s
}

// ekyt响应头
type ResponseHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s ResponseHead) String() string {
	return tea.Prettify(s)
}

func (s ResponseHead) GoString() string {
	return s.String()
}

func (s *ResponseHead) SetRequestId(v string) *ResponseHead {
	s.RequestId = &v
	return s
}

// 业务参数
type BizParam struct {
	// 参数类型枚举，mobile、cert、biz_license
	ParamKey *string `json:"param_key,omitempty" xml:"param_key,omitempty" require:"true"`
	// 值，如加密后的手机号
	ParamValue *string `json:"param_value,omitempty" xml:"param_value,omitempty" require:"true"`
}

func (s BizParam) String() string {
	return tea.Prettify(s)
}

func (s BizParam) GoString() string {
	return s.String()
}

func (s *BizParam) SetParamKey(v string) *BizParam {
	s.ParamKey = &v
	return s
}

func (s *BizParam) SetParamValue(v string) *BizParam {
	s.ParamValue = &v
	return s
}

// CctSubCheckLabel
type CctSubCheckLabel struct {
	// sub_label
	SubLabel *string `json:"sub_label,omitempty" xml:"sub_label,omitempty" require:"true"`
	// rate
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s CctSubCheckLabel) String() string {
	return tea.Prettify(s)
}

func (s CctSubCheckLabel) GoString() string {
	return s.String()
}

func (s *CctSubCheckLabel) SetSubLabel(v string) *CctSubCheckLabel {
	s.SubLabel = &v
	return s
}

func (s *CctSubCheckLabel) SetRate(v int64) *CctSubCheckLabel {
	s.Rate = &v
	return s
}

// eKYT风险标签
type RiskModel struct {
	// 标签名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 风险值
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 风险标签描述
	ModelComment *string `json:"model_comment,omitempty" xml:"model_comment,omitempty" require:"true"`
}

func (s RiskModel) String() string {
	return tea.Prettify(s)
}

func (s RiskModel) GoString() string {
	return s.String()
}

func (s *RiskModel) SetModelName(v string) *RiskModel {
	s.ModelName = &v
	return s
}

func (s *RiskModel) SetModelValue(v string) *RiskModel {
	s.ModelValue = &v
	return s
}

func (s *RiskModel) SetModelComment(v string) *RiskModel {
	s.ModelComment = &v
	return s
}

// 风险结果
type RiskResult struct {
	// 数据列表
	RiskData []*RiskData `json:"risk_data,omitempty" xml:"risk_data,omitempty" require:"true" type:"Repeated"`
	// 解决方案编码
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
}

func (s RiskResult) String() string {
	return tea.Prettify(s)
}

func (s RiskResult) GoString() string {
	return s.String()
}

func (s *RiskResult) SetRiskData(v []*RiskData) *RiskResult {
	s.RiskData = v
	return s
}

func (s *RiskResult) SetSolutionCode(v string) *RiskResult {
	s.SolutionCode = &v
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
type FaceShieldResult struct {
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// 风险等级，-1参数异常，0无风险，1-3表示低、中、高
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// 风险描述，对风险等级的补充
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
	// .
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

// eKYT人脸核身结果数据
type FaceVerifyResultData struct {
	// 请求唯一标识Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 认证是否通过
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty" require:"true"`
	// faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty" require:"true"`
}

func (s FaceVerifyResultData) String() string {
	return tea.Prettify(s)
}

func (s FaceVerifyResultData) GoString() string {
	return s.String()
}

func (s *FaceVerifyResultData) SetRequestId(v string) *FaceVerifyResultData {
	s.RequestId = &v
	return s
}

func (s *FaceVerifyResultData) SetPassed(v string) *FaceVerifyResultData {
	s.Passed = &v
	return s
}

func (s *FaceVerifyResultData) SetMaterialInfo(v string) *FaceVerifyResultData {
	s.MaterialInfo = &v
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

// eKYT业务响应结果
type IifaaEkytResponse struct {
	// 响应头
	Head *ResponseHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 业务响应结果
	BizRes *string `json:"biz_res,omitempty" xml:"biz_res,omitempty" require:"true"`
}

func (s IifaaEkytResponse) String() string {
	return tea.Prettify(s)
}

func (s IifaaEkytResponse) GoString() string {
	return s.String()
}

func (s *IifaaEkytResponse) SetHead(v *ResponseHead) *IifaaEkytResponse {
	s.Head = v
	return s
}

func (s *IifaaEkytResponse) SetBizRes(v string) *IifaaEkytResponse {
	s.BizRes = &v
	return s
}

// 业务请求入参，兼容批量调用
type BizQueryParam struct {
	// 参数列表，数组
	BizParams []*BizParam `json:"biz_params,omitempty" xml:"biz_params,omitempty" require:"true" type:"Repeated"`
}

func (s BizQueryParam) String() string {
	return tea.Prettify(s)
}

func (s BizQueryParam) GoString() string {
	return s.String()
}

func (s *BizQueryParam) SetBizParams(v []*BizParam) *BizQueryParam {
	s.BizParams = v
	return s
}

// eKYT可信签约录入准备数据
type TrustSignInitData struct {
	// 请求唯一标识Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 签约秘钥
	SignUniqueId *string `json:"sign_unique_id,omitempty" xml:"sign_unique_id,omitempty" require:"true"`
}

func (s TrustSignInitData) String() string {
	return tea.Prettify(s)
}

func (s TrustSignInitData) GoString() string {
	return s.String()
}

func (s *TrustSignInitData) SetRequestId(v string) *TrustSignInitData {
	s.RequestId = &v
	return s
}

func (s *TrustSignInitData) SetSignUniqueId(v string) *TrustSignInitData {
	s.SignUniqueId = &v
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

// eKYT可信签约查询数据
type TrustSignQueryData struct {
	// 请求唯一标识Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 签约方案码
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 签约文件列表
	FileList []*string `json:"file_list,omitempty" xml:"file_list,omitempty" require:"true" type:"Repeated"`
}

func (s TrustSignQueryData) String() string {
	return tea.Prettify(s)
}

func (s TrustSignQueryData) GoString() string {
	return s.String()
}

func (s *TrustSignQueryData) SetRequestId(v string) *TrustSignQueryData {
	s.RequestId = &v
	return s
}

func (s *TrustSignQueryData) SetOrderStatus(v string) *TrustSignQueryData {
	s.OrderStatus = &v
	return s
}

func (s *TrustSignQueryData) SetSolutionCode(v string) *TrustSignQueryData {
	s.SolutionCode = &v
	return s
}

func (s *TrustSignQueryData) SetGmtCreate(v string) *TrustSignQueryData {
	s.GmtCreate = &v
	return s
}

func (s *TrustSignQueryData) SetGmtModified(v string) *TrustSignQueryData {
	s.GmtModified = &v
	return s
}

func (s *TrustSignQueryData) SetFileList(v []*string) *TrustSignQueryData {
	s.FileList = v
	return s
}

// eKYT请求头
type RequestHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 客户身份标识ID
	SecretId *string `json:"secret_id,omitempty" xml:"secret_id,omitempty" require:"true"`
	// 客户签约产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// response输出类型，默认json
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// false
	OnlineFlag *bool `json:"online_flag,omitempty" xml:"online_flag,omitempty"`
}

func (s RequestHead) String() string {
	return tea.Prettify(s)
}

func (s RequestHead) GoString() string {
	return s.String()
}

func (s *RequestHead) SetRequestId(v string) *RequestHead {
	s.RequestId = &v
	return s
}

func (s *RequestHead) SetSecretId(v string) *RequestHead {
	s.SecretId = &v
	return s
}

func (s *RequestHead) SetProductCode(v string) *RequestHead {
	s.ProductCode = &v
	return s
}

func (s *RequestHead) SetFormatType(v string) *RequestHead {
	s.FormatType = &v
	return s
}

func (s *RequestHead) SetOnlineFlag(v bool) *RequestHead {
	s.OnlineFlag = &v
	return s
}

// 保单信息
type InsureInfo struct {
	// 保单时间
	ModifyTime *string `json:"modify_time,omitempty" xml:"modify_time,omitempty" require:"true"`
	// 蚂蚁L5产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 保险产品code
	InsureProduct *string `json:"insure_product,omitempty" xml:"insure_product,omitempty" require:"true"`
	// 保险产品价格
	InsurePrice *string `json:"insure_price,omitempty" xml:"insure_price,omitempty" require:"true"`
	// 保险品种
	InsureType *string `json:"insure_type,omitempty" xml:"insure_type,omitempty" require:"true"`
	// 付款方式
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" require:"true"`
	// 保险期数
	InsurePeriod *string `json:"insure_period,omitempty" xml:"insure_period,omitempty" require:"true"`
	// 保单状态
	PolicyStatus *string `json:"policy_status,omitempty" xml:"policy_status,omitempty" require:"true"`
	// 操作类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 保司信用代码
	InsureCompCreditNo *string `json:"insure_comp_credit_no,omitempty" xml:"insure_comp_credit_no,omitempty" require:"true"`
}

func (s InsureInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureInfo) GoString() string {
	return s.String()
}

func (s *InsureInfo) SetModifyTime(v string) *InsureInfo {
	s.ModifyTime = &v
	return s
}

func (s *InsureInfo) SetProductCode(v string) *InsureInfo {
	s.ProductCode = &v
	return s
}

func (s *InsureInfo) SetInsureProduct(v string) *InsureInfo {
	s.InsureProduct = &v
	return s
}

func (s *InsureInfo) SetInsurePrice(v string) *InsureInfo {
	s.InsurePrice = &v
	return s
}

func (s *InsureInfo) SetInsureType(v string) *InsureInfo {
	s.InsureType = &v
	return s
}

func (s *InsureInfo) SetPayType(v string) *InsureInfo {
	s.PayType = &v
	return s
}

func (s *InsureInfo) SetInsurePeriod(v string) *InsureInfo {
	s.InsurePeriod = &v
	return s
}

func (s *InsureInfo) SetPolicyStatus(v string) *InsureInfo {
	s.PolicyStatus = &v
	return s
}

func (s *InsureInfo) SetOperateType(v string) *InsureInfo {
	s.OperateType = &v
	return s
}

func (s *InsureInfo) SetInsureCompCreditNo(v string) *InsureInfo {
	s.InsureCompCreditNo = &v
	return s
}

// 设备风险咨询结果
type RiskQueryData struct {
	// 风险评分
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险标签
	RiskLabels []*string `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" require:"true" type:"Repeated"`
}

func (s RiskQueryData) String() string {
	return tea.Prettify(s)
}

func (s RiskQueryData) GoString() string {
	return s.String()
}

func (s *RiskQueryData) SetRiskScore(v string) *RiskQueryData {
	s.RiskScore = &v
	return s
}

func (s *RiskQueryData) SetRiskLabels(v []*string) *RiskQueryData {
	s.RiskLabels = v
	return s
}

// KeyValue对属性
type KeyValueMap struct {
	// key-value中的key
	Key *string `json:"key,omitempty" xml:"key,omitempty" maxLength:"100" minLength:"1"`
	// key-value中的value
	Value *string `json:"value,omitempty" xml:"value,omitempty" maxLength:"1000" minLength:"1"`
}

func (s KeyValueMap) String() string {
	return tea.Prettify(s)
}

func (s KeyValueMap) GoString() string {
	return s.String()
}

func (s *KeyValueMap) SetKey(v string) *KeyValueMap {
	s.Key = &v
	return s
}

func (s *KeyValueMap) SetValue(v string) *KeyValueMap {
	s.Value = &v
	return s
}

// eKYT人脸核身初始化数据
type FaceVerifyInitData struct {
	// 请求唯一标识Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 可信实人认证的唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 认证流程入口 URL
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty" require:"true"`
}

func (s FaceVerifyInitData) String() string {
	return tea.Prettify(s)
}

func (s FaceVerifyInitData) GoString() string {
	return s.String()
}

func (s *FaceVerifyInitData) SetRequestId(v string) *FaceVerifyInitData {
	s.RequestId = &v
	return s
}

func (s *FaceVerifyInitData) SetCertifyId(v string) *FaceVerifyInitData {
	s.CertifyId = &v
	return s
}

func (s *FaceVerifyInitData) SetCertifyUrl(v string) *FaceVerifyInitData {
	s.CertifyUrl = &v
	return s
}

// 设备风险查询data
type DeviceRiskResp struct {
	// apdid
	Apdid *string `json:"apdid,omitempty" xml:"apdid,omitempty" require:"true"`
	// apdid_token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// risk_level
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

// 内容安全请求体datamap
type CctDataMap struct {
	// text
	Text []*string `json:"text,omitempty" xml:"text,omitempty" type:"Repeated"`
	// PICTURE
	Picture []*string `json:"picture,omitempty" xml:"picture,omitempty" type:"Repeated"`
}

func (s CctDataMap) String() string {
	return tea.Prettify(s)
}

func (s CctDataMap) GoString() string {
	return s.String()
}

func (s *CctDataMap) SetText(v []*string) *CctDataMap {
	s.Text = v
	return s
}

func (s *CctDataMap) SetPicture(v []*string) *CctDataMap {
	s.Picture = v
	return s
}

// 风险评估结果
type RiskAssessResult struct {
	// 风险评估结果
	RiskValue *string `json:"risk_value,omitempty" xml:"risk_value,omitempty" require:"true"`
	// 风险评估分数
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险评估标签
	ModelInfos *RiskModel `json:"model_infos,omitempty" xml:"model_infos,omitempty" require:"true"`
}

func (s RiskAssessResult) String() string {
	return tea.Prettify(s)
}

func (s RiskAssessResult) GoString() string {
	return s.String()
}

func (s *RiskAssessResult) SetRiskValue(v string) *RiskAssessResult {
	s.RiskValue = &v
	return s
}

func (s *RiskAssessResult) SetRiskScore(v string) *RiskAssessResult {
	s.RiskScore = &v
	return s
}

func (s *RiskAssessResult) SetModelInfos(v *RiskModel) *RiskAssessResult {
	s.ModelInfos = v
	return s
}

// 内容安全response
type CctDetectCheckLabel struct {
	// label
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// rate
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// subLabels
	SubLabels []*CctSubCheckLabel `json:"sub_labels,omitempty" xml:"sub_labels,omitempty" require:"true" type:"Repeated"`
	// details
	Details *string `json:"details,omitempty" xml:"details,omitempty" require:"true"`
}

func (s CctDetectCheckLabel) String() string {
	return tea.Prettify(s)
}

func (s CctDetectCheckLabel) GoString() string {
	return s.String()
}

func (s *CctDetectCheckLabel) SetLabel(v string) *CctDetectCheckLabel {
	s.Label = &v
	return s
}

func (s *CctDetectCheckLabel) SetRate(v int64) *CctDetectCheckLabel {
	s.Rate = &v
	return s
}

func (s *CctDetectCheckLabel) SetSubLabels(v []*CctSubCheckLabel) *CctDetectCheckLabel {
	s.SubLabels = v
	return s
}

func (s *CctDetectCheckLabel) SetDetails(v string) *CctDetectCheckLabel {
	s.Details = &v
	return s
}

// 风险评估响应结果
type RiskAssessData struct {
	// 响应头
	Head *ResponseHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 风险评估结果
	RiskResult *string `json:"risk_result,omitempty" xml:"risk_result,omitempty" require:"true"`
}

func (s RiskAssessData) String() string {
	return tea.Prettify(s)
}

func (s RiskAssessData) GoString() string {
	return s.String()
}

func (s *RiskAssessData) SetHead(v *ResponseHead) *RiskAssessData {
	s.Head = v
	return s
}

func (s *RiskAssessData) SetRiskResult(v string) *RiskAssessData {
	s.RiskResult = &v
	return s
}

// 风险咨询结果
type ResultList struct {
	// 结果列表
	RiskResults []*RiskResult `json:"risk_results,omitempty" xml:"risk_results,omitempty" require:"true" type:"Repeated"`
	// 入参列表，数组
	BizParams []*BizParam `json:"biz_params,omitempty" xml:"biz_params,omitempty" require:"true" type:"Repeated"`
}

func (s ResultList) String() string {
	return tea.Prettify(s)
}

func (s ResultList) GoString() string {
	return s.String()
}

func (s *ResultList) SetRiskResults(v []*RiskResult) *ResultList {
	s.RiskResults = v
	return s
}

func (s *ResultList) SetBizParams(v []*BizParam) *ResultList {
	s.BizParams = v
	return s
}

type RunGeneralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求数据，json格式
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 要调用的具体的服务名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s RunGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s RunGeneralRequest) GoString() string {
	return s.String()
}

func (s *RunGeneralRequest) SetAuthToken(v string) *RunGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *RunGeneralRequest) SetProductInstanceId(v string) *RunGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunGeneralRequest) SetRequest(v string) *RunGeneralRequest {
	s.Request = &v
	return s
}

func (s *RunGeneralRequest) SetServiceName(v string) *RunGeneralRequest {
	s.ServiceName = &v
	return s
}

func (s *RunGeneralRequest) SetExtInfo(v string) *RunGeneralRequest {
	s.ExtInfo = &v
	return s
}

type RunGeneralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务响应数据，json格式
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s RunGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s RunGeneralResponse) GoString() string {
	return s.String()
}

func (s *RunGeneralResponse) SetReqMsgId(v string) *RunGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunGeneralResponse) SetResultCode(v string) *RunGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *RunGeneralResponse) SetResultMsg(v string) *RunGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunGeneralResponse) SetResponse(v string) *RunGeneralResponse {
	s.Response = &v
	return s
}

type ExecEkytInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保险信息list的jsonStr
	InsureInfoListStr *string `json:"insure_info_list_str,omitempty" xml:"insure_info_list_str,omitempty" require:"true"`
	// 对insure_info_list_str的签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ExecEkytInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecEkytInsureRequest) GoString() string {
	return s.String()
}

func (s *ExecEkytInsureRequest) SetAuthToken(v string) *ExecEkytInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecEkytInsureRequest) SetProductInstanceId(v string) *ExecEkytInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecEkytInsureRequest) SetInsureInfoListStr(v string) *ExecEkytInsureRequest {
	s.InsureInfoListStr = &v
	return s
}

func (s *ExecEkytInsureRequest) SetSignature(v string) *ExecEkytInsureRequest {
	s.Signature = &v
	return s
}

type ExecEkytInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 投保结果list的jsonStr
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecEkytInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecEkytInsureResponse) GoString() string {
	return s.String()
}

func (s *ExecEkytInsureResponse) SetReqMsgId(v string) *ExecEkytInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecEkytInsureResponse) SetResultCode(v string) *ExecEkytInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecEkytInsureResponse) SetResultMsg(v string) *ExecEkytInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecEkytInsureResponse) SetSuccess(v bool) *ExecEkytInsureResponse {
	s.Success = &v
	return s
}

func (s *ExecEkytInsureResponse) SetData(v string) *ExecEkytInsureResponse {
	s.Data = &v
	return s
}

type CreateBssecpicRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 客户名
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty" require:"true"`
	// 操作系统
	OsType *string `json:"os_type,omitempty" xml:"os_type,omitempty" require:"true"`
	// 包名
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 签名信息
	CertSign *string `json:"cert_sign,omitempty" xml:"cert_sign,omitempty"`
	// 签名秘钥内容
	AppKeyData *string `json:"app_key_data,omitempty" xml:"app_key_data,omitempty"`
	// 加密秘钥内容
	SecurityData *string `json:"security_data,omitempty" xml:"security_data,omitempty"`
	// 自定义秘钥内容
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 白盒秘钥内容
	WhiteBoxData *string `json:"white_box_data,omitempty" xml:"white_box_data,omitempty"`
}

func (s CreateBssecpicRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBssecpicRequest) GoString() string {
	return s.String()
}

func (s *CreateBssecpicRequest) SetAuthToken(v string) *CreateBssecpicRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBssecpicRequest) SetProductInstanceId(v string) *CreateBssecpicRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBssecpicRequest) SetAppName(v string) *CreateBssecpicRequest {
	s.AppName = &v
	return s
}

func (s *CreateBssecpicRequest) SetClientName(v string) *CreateBssecpicRequest {
	s.ClientName = &v
	return s
}

func (s *CreateBssecpicRequest) SetOsType(v string) *CreateBssecpicRequest {
	s.OsType = &v
	return s
}

func (s *CreateBssecpicRequest) SetPackageName(v string) *CreateBssecpicRequest {
	s.PackageName = &v
	return s
}

func (s *CreateBssecpicRequest) SetCertSign(v string) *CreateBssecpicRequest {
	s.CertSign = &v
	return s
}

func (s *CreateBssecpicRequest) SetAppKeyData(v string) *CreateBssecpicRequest {
	s.AppKeyData = &v
	return s
}

func (s *CreateBssecpicRequest) SetSecurityData(v string) *CreateBssecpicRequest {
	s.SecurityData = &v
	return s
}

func (s *CreateBssecpicRequest) SetExtraData(v string) *CreateBssecpicRequest {
	s.ExtraData = &v
	return s
}

func (s *CreateBssecpicRequest) SetWhiteBoxData(v string) *CreateBssecpicRequest {
	s.WhiteBoxData = &v
	return s
}

type CreateBssecpicResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 返回文件的内容base64
	BodyBase64 *string `json:"body_base64,omitempty" xml:"body_base64,omitempty"`
}

func (s CreateBssecpicResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBssecpicResponse) GoString() string {
	return s.String()
}

func (s *CreateBssecpicResponse) SetReqMsgId(v string) *CreateBssecpicResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBssecpicResponse) SetResultCode(v string) *CreateBssecpicResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBssecpicResponse) SetResultMsg(v string) *CreateBssecpicResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBssecpicResponse) SetSuccess(v bool) *CreateBssecpicResponse {
	s.Success = &v
	return s
}

func (s *CreateBssecpicResponse) SetFileName(v string) *CreateBssecpicResponse {
	s.FileName = &v
	return s
}

func (s *CreateBssecpicResponse) SetBodyBase64(v string) *CreateBssecpicResponse {
	s.BodyBase64 = &v
	return s
}

type CreateBlueshieldSecuritypictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 客户名
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty" require:"true"`
	// 操作系统
	OsType *string `json:"os_type,omitempty" xml:"os_type,omitempty" require:"true"`
	// 包名
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 签名信息
	CertSign *string `json:"cert_sign,omitempty" xml:"cert_sign,omitempty"`
	// 签名秘钥内容
	AppKeyData *string `json:"app_key_data,omitempty" xml:"app_key_data,omitempty"`
	// 加密秘钥内容
	SecurityData *string `json:"security_data,omitempty" xml:"security_data,omitempty"`
	// 自定义秘钥内容
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 白盒秘钥内容
	WhiteBoxData *string `json:"white_box_data,omitempty" xml:"white_box_data,omitempty"`
	// raas产品码列表
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// 直接透传的二级租户，可选
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
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

func (s *CreateBlueshieldSecuritypictureRequest) SetRaasProducts(v string) *CreateBlueshieldSecuritypictureRequest {
	s.RaasProducts = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetRaasSecondTenant(v string) *CreateBlueshieldSecuritypictureRequest {
	s.RaasSecondTenant = &v
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
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 生成的图片文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// body base 64
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
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// 切面数据（JSON，详见下方）
	// {
	// 	"sessionId": "zimId"	//人脸的bizID
	//   "rId": "rId"	//在获取活体方法人脸下发的bisToken
	//   "keyInfoHash": "keyInfoHash"	//关键信息hash
	//   "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
	//   "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
	// }
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
	// 否（和切面二选一即可）
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 签名因子（和切面二选一即可）
	SignFactor *string `json:"sign_factor,omitempty" xml:"sign_factor,omitempty"`
	// RaaS租户
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// raas二级租户
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
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

func (s *QueryFaceshieldNativeRequest) SetRaasProducts(v string) *QueryFaceshieldNativeRequest {
	s.RaasProducts = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetRaasSecondTenant(v string) *QueryFaceshieldNativeRequest {
	s.RaasSecondTenant = &v
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
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求码，200成功，其他失败，具体见错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误时的返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求时传入的，若没有传，则系统自动生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// apdidToken	String	设备token
	// riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
	// riskDesc	String	风险描述，对风险等级的补充
	// sugAction	String	处理的建议，如PAAS
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

type QueryFaceshieldWebRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id，标识客户来源
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// 切面数据（JSON，详见下方）
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
	// RaaS租户
	//
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// raas二级租户
	//
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
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

func (s *QueryFaceshieldWebRequest) SetRaasProducts(v string) *QueryFaceshieldWebRequest {
	s.RaasProducts = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetRaasSecondTenant(v string) *QueryFaceshieldWebRequest {
	s.RaasSecondTenant = &v
	return s
}

type QueryFaceshieldWebResponse struct {
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

type InitIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产商code
	CorpCode *string `json:"corp_code,omitempty" xml:"corp_code,omitempty" require:"true"`
	// 设备类型
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
	// 设备信息
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 用于加密回传数据的公钥
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
}

func (s InitIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *InitIifaaDeviceRequest) SetAuthToken(v string) *InitIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetProductInstanceId(v string) *InitIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetCorpCode(v string) *InitIifaaDeviceRequest {
	s.CorpCode = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetDeviceType(v string) *InitIifaaDeviceRequest {
	s.DeviceType = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetDeviceInfo(v string) *InitIifaaDeviceRequest {
	s.DeviceInfo = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetProductCode(v string) *InitIifaaDeviceRequest {
	s.ProductCode = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetPubKey(v string) *InitIifaaDeviceRequest {
	s.PubKey = &v
	return s
}

type InitIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InitIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *InitIifaaDeviceResponse) SetReqMsgId(v string) *InitIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetResultCode(v string) *InitIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetResultMsg(v string) *InitIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetData(v string) *InitIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RecognizeIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备唯一ID
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
}

func (s RecognizeIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *RecognizeIifaaDeviceRequest) SetAuthToken(v string) *RecognizeIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeIifaaDeviceRequest) SetProductInstanceId(v string) *RecognizeIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeIifaaDeviceRequest) SetTuid(v string) *RecognizeIifaaDeviceRequest {
	s.Tuid = &v
	return s
}

type RecognizeIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据内容
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RecognizeIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *RecognizeIifaaDeviceResponse) SetReqMsgId(v string) *RecognizeIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetResultCode(v string) *RecognizeIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetResultMsg(v string) *RecognizeIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetData(v string) *RecognizeIifaaDeviceResponse {
	s.Data = &v
	return s
}

type VerifyIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待验证的数据
	CipherText *string `json:"cipher_text,omitempty" xml:"cipher_text,omitempty" require:"true"`
}

func (s VerifyIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *VerifyIifaaDeviceRequest) SetAuthToken(v string) *VerifyIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyIifaaDeviceRequest) SetProductInstanceId(v string) *VerifyIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyIifaaDeviceRequest) SetCipherText(v string) *VerifyIifaaDeviceRequest {
	s.CipherText = &v
	return s
}

type VerifyIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验证结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *VerifyIifaaDeviceResponse) SetReqMsgId(v string) *VerifyIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetResultCode(v string) *VerifyIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetResultMsg(v string) *VerifyIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetData(v string) *VerifyIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RegisterIifaaCorpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产商code
	CorpCode *string `json:"corp_code,omitempty" xml:"corp_code,omitempty" require:"true"`
	// 产商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 产商签约code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s RegisterIifaaCorpRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterIifaaCorpRequest) GoString() string {
	return s.String()
}

func (s *RegisterIifaaCorpRequest) SetAuthToken(v string) *RegisterIifaaCorpRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetProductInstanceId(v string) *RegisterIifaaCorpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetCorpCode(v string) *RegisterIifaaCorpRequest {
	s.CorpCode = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetCorpName(v string) *RegisterIifaaCorpRequest {
	s.CorpName = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetProductCode(v string) *RegisterIifaaCorpRequest {
	s.ProductCode = &v
	return s
}

type RegisterIifaaCorpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产商注册结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterIifaaCorpResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterIifaaCorpResponse) GoString() string {
	return s.String()
}

func (s *RegisterIifaaCorpResponse) SetReqMsgId(v string) *RegisterIifaaCorpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetResultCode(v string) *RegisterIifaaCorpResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetResultMsg(v string) *RegisterIifaaCorpResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetData(v string) *RegisterIifaaCorpResponse {
	s.Data = &v
	return s
}

type DeprecateIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备唯一ID
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
}

func (s DeprecateIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeprecateIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *DeprecateIifaaDeviceRequest) SetAuthToken(v string) *DeprecateIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeprecateIifaaDeviceRequest) SetProductInstanceId(v string) *DeprecateIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeprecateIifaaDeviceRequest) SetTuid(v string) *DeprecateIifaaDeviceRequest {
	s.Tuid = &v
	return s
}

type DeprecateIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备擦除结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeprecateIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeprecateIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *DeprecateIifaaDeviceResponse) SetReqMsgId(v string) *DeprecateIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetResultCode(v string) *DeprecateIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetResultMsg(v string) *DeprecateIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetData(v string) *DeprecateIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RunXhunterSpiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// XHUNTER_ISV_STANDARD
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// json
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// raas_products
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
}

func (s RunXhunterSpiRequest) String() string {
	return tea.Prettify(s)
}

func (s RunXhunterSpiRequest) GoString() string {
	return s.String()
}

func (s *RunXhunterSpiRequest) SetAuthToken(v string) *RunXhunterSpiRequest {
	s.AuthToken = &v
	return s
}

func (s *RunXhunterSpiRequest) SetProductInstanceId(v string) *RunXhunterSpiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunXhunterSpiRequest) SetRequest(v string) *RunXhunterSpiRequest {
	s.Request = &v
	return s
}

func (s *RunXhunterSpiRequest) SetServiceName(v string) *RunXhunterSpiRequest {
	s.ServiceName = &v
	return s
}

func (s *RunXhunterSpiRequest) SetExtInfo(v string) *RunXhunterSpiRequest {
	s.ExtInfo = &v
	return s
}

func (s *RunXhunterSpiRequest) SetRaasProducts(v string) *RunXhunterSpiRequest {
	s.RaasProducts = &v
	return s
}

type RunXhunterSpiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// response
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s RunXhunterSpiResponse) String() string {
	return tea.Prettify(s)
}

func (s RunXhunterSpiResponse) GoString() string {
	return s.String()
}

func (s *RunXhunterSpiResponse) SetReqMsgId(v string) *RunXhunterSpiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResultCode(v string) *RunXhunterSpiResponse {
	s.ResultCode = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResultMsg(v string) *RunXhunterSpiResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResponse(v string) *RunXhunterSpiResponse {
	s.Response = &v
	return s
}

type ExecIifaaInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保险信息list的jsonStr
	InsureInfoListStr *string `json:"insure_info_list_str,omitempty" xml:"insure_info_list_str,omitempty" require:"true"`
	// 对insure_info_list_str的签名，使用十六进制字符串编码
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ExecIifaaInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecIifaaInsureRequest) GoString() string {
	return s.String()
}

func (s *ExecIifaaInsureRequest) SetAuthToken(v string) *ExecIifaaInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetProductInstanceId(v string) *ExecIifaaInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetInsureInfoListStr(v string) *ExecIifaaInsureRequest {
	s.InsureInfoListStr = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetSignature(v string) *ExecIifaaInsureRequest {
	s.Signature = &v
	return s
}

type ExecIifaaInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 投保结果list的jsonStr
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecIifaaInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecIifaaInsureResponse) GoString() string {
	return s.String()
}

func (s *ExecIifaaInsureResponse) SetReqMsgId(v string) *ExecIifaaInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetResultCode(v string) *ExecIifaaInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetResultMsg(v string) *ExecIifaaInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetData(v string) *ExecIifaaInsureResponse {
	s.Data = &v
	return s
}

type QueryCctPictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// InfoSecAnalyzeSyncContent json
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// RaaS产品码
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
}

func (s QueryCctPictureRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCctPictureRequest) GoString() string {
	return s.String()
}

func (s *QueryCctPictureRequest) SetAuthToken(v string) *QueryCctPictureRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCctPictureRequest) SetProductInstanceId(v string) *QueryCctPictureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCctPictureRequest) SetRequest(v string) *QueryCctPictureRequest {
	s.Request = &v
	return s
}

func (s *QueryCctPictureRequest) SetRaasProducts(v string) *QueryCctPictureRequest {
	s.RaasProducts = &v
	return s
}

type QueryCctPictureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// InfoSecAnalyzeSyncContent json
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s QueryCctPictureResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCctPictureResponse) GoString() string {
	return s.String()
}

func (s *QueryCctPictureResponse) SetReqMsgId(v string) *QueryCctPictureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCctPictureResponse) SetResultCode(v string) *QueryCctPictureResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCctPictureResponse) SetResultMsg(v string) *QueryCctPictureResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCctPictureResponse) SetResponse(v string) *QueryCctPictureResponse {
	s.Response = &v
	return s
}

type RecognizeCctAnalyzeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// channel
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// content_type
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// user_id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// data_map
	DataMap *CctDataMap `json:"data_map,omitempty" xml:"data_map,omitempty" require:"true"`
}

func (s RecognizeCctAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeCctAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *RecognizeCctAnalyzeRequest) SetAuthToken(v string) *RecognizeCctAnalyzeRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetProductInstanceId(v string) *RecognizeCctAnalyzeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetChannel(v string) *RecognizeCctAnalyzeRequest {
	s.Channel = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetContentType(v string) *RecognizeCctAnalyzeRequest {
	s.ContentType = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetUserId(v string) *RecognizeCctAnalyzeRequest {
	s.UserId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetRequestId(v string) *RecognizeCctAnalyzeRequest {
	s.RequestId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetDataMap(v *CctDataMap) *RecognizeCctAnalyzeRequest {
	s.DataMap = v
	return s
}

type RecognizeCctAnalyzeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_request_id
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty"`
	// suggestion
	Suggestion *string `json:"suggestion,omitempty" xml:"suggestion,omitempty"`
	// detect_labels
	DetectLabels []*CctDetectCheckLabel `json:"detect_labels,omitempty" xml:"detect_labels,omitempty" type:"Repeated"`
}

func (s RecognizeCctAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeCctAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *RecognizeCctAnalyzeResponse) SetReqMsgId(v string) *RecognizeCctAnalyzeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetResultCode(v string) *RecognizeCctAnalyzeResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetResultMsg(v string) *RecognizeCctAnalyzeResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetBizRequestId(v string) *RecognizeCctAnalyzeResponse {
	s.BizRequestId = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetSuggestion(v string) *RecognizeCctAnalyzeResponse {
	s.Suggestion = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetDetectLabels(v []*CctDetectCheckLabel) *RecognizeCctAnalyzeResponse {
	s.DetectLabels = v
	return s
}

type QueryRiskGeneralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// x
	DataCode *string `json:"data_code,omitempty" xml:"data_code,omitempty" require:"true"`
	// AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
	EncryptedNonce *string `json:"encrypted_nonce,omitempty" xml:"encrypted_nonce,omitempty" require:"true"`
	// ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 业务请求入参，兼容批量调用
	BizQueryParams []*BizQueryParam `json:"biz_query_params,omitempty" xml:"biz_query_params,omitempty" require:"true" type:"Repeated"`
	// 拓展输入字段,
	ExtData *string `json:"ext_data,omitempty" xml:"ext_data,omitempty"`
	// 用于标记是否获得用户授权。
	// 1:获得授权（默认）
	// 0:未获得授权
	UserAuthorization *string `json:"user_authorization,omitempty" xml:"user_authorization,omitempty" require:"true"`
	// 默认AES128，后续可选SM2等国密
	EncryptMethod *string `json:"encrypt_method,omitempty" xml:"encrypt_method,omitempty"`
	// 整个包体加密，二选一
	EncryptedBody *string `json:"encrypted_body,omitempty" xml:"encrypted_body,omitempty"`
	// hash_type
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty"`
}

func (s QueryRiskGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskGeneralRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskGeneralRequest) SetAuthToken(v string) *QueryRiskGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetProductInstanceId(v string) *QueryRiskGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetDataCode(v string) *QueryRiskGeneralRequest {
	s.DataCode = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetEncryptedNonce(v string) *QueryRiskGeneralRequest {
	s.EncryptedNonce = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetCustomerId(v string) *QueryRiskGeneralRequest {
	s.CustomerId = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetBizQueryParams(v []*BizQueryParam) *QueryRiskGeneralRequest {
	s.BizQueryParams = v
	return s
}

func (s *QueryRiskGeneralRequest) SetExtData(v string) *QueryRiskGeneralRequest {
	s.ExtData = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetUserAuthorization(v string) *QueryRiskGeneralRequest {
	s.UserAuthorization = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetEncryptMethod(v string) *QueryRiskGeneralRequest {
	s.EncryptMethod = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetEncryptedBody(v string) *QueryRiskGeneralRequest {
	s.EncryptedBody = &v
	return s
}

func (s *QueryRiskGeneralRequest) SetHashType(v string) *QueryRiskGeneralRequest {
	s.HashType = &v
	return s
}

type QueryRiskGeneralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否计费
	Meter *bool `json:"meter,omitempty" xml:"meter,omitempty"`
	// 批量调用情况下的计费数量
	MeterCount *int64 `json:"meter_count,omitempty" xml:"meter_count,omitempty"`
	// 风险咨询结果的批量查询结果
	ResultList []*ResultList `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
	// 拓展输出字段
	ExtData *string `json:"ext_data,omitempty" xml:"ext_data,omitempty"`
	// 是否查得
	Found *bool `json:"found,omitempty" xml:"found,omitempty"`
}

func (s QueryRiskGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskGeneralResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskGeneralResponse) SetReqMsgId(v string) *QueryRiskGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetResultCode(v string) *QueryRiskGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetResultMsg(v string) *QueryRiskGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetMeter(v bool) *QueryRiskGeneralResponse {
	s.Meter = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetMeterCount(v int64) *QueryRiskGeneralResponse {
	s.MeterCount = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetResultList(v []*ResultList) *QueryRiskGeneralResponse {
	s.ResultList = v
	return s
}

func (s *QueryRiskGeneralResponse) SetExtData(v string) *QueryRiskGeneralResponse {
	s.ExtData = &v
	return s
}

func (s *QueryRiskGeneralResponse) SetFound(v bool) *QueryRiskGeneralResponse {
	s.Found = &v
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

type QueryEkytDriverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接口请求head
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 请求业务参数，加密之后的密文信息
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 请求数据签名值
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s QueryEkytDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytDriverRequest) GoString() string {
	return s.String()
}

func (s *QueryEkytDriverRequest) SetAuthToken(v string) *QueryEkytDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEkytDriverRequest) SetProductInstanceId(v string) *QueryEkytDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEkytDriverRequest) SetHead(v *RequestHead) *QueryEkytDriverRequest {
	s.Head = v
	return s
}

func (s *QueryEkytDriverRequest) SetRequest(v string) *QueryEkytDriverRequest {
	s.Request = &v
	return s
}

func (s *QueryEkytDriverRequest) SetSignature(v string) *QueryEkytDriverRequest {
	s.Signature = &v
	return s
}

type QueryEkytDriverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口响应描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口响应数据
	Data *IifaaEkytResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryEkytDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytDriverResponse) GoString() string {
	return s.String()
}

func (s *QueryEkytDriverResponse) SetReqMsgId(v string) *QueryEkytDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEkytDriverResponse) SetResultCode(v string) *QueryEkytDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEkytDriverResponse) SetResultMsg(v string) *QueryEkytDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEkytDriverResponse) SetSuccess(v bool) *QueryEkytDriverResponse {
	s.Success = &v
	return s
}

func (s *QueryEkytDriverResponse) SetMessage(v string) *QueryEkytDriverResponse {
	s.Message = &v
	return s
}

func (s *QueryEkytDriverResponse) SetData(v *IifaaEkytResponse) *QueryEkytDriverResponse {
	s.Data = v
	return s
}

type ApplyIifaaDevicekeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 业务参数
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ApplyIifaaDevicekeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyIifaaDevicekeyRequest) GoString() string {
	return s.String()
}

func (s *ApplyIifaaDevicekeyRequest) SetAuthToken(v string) *ApplyIifaaDevicekeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyIifaaDevicekeyRequest) SetProductInstanceId(v string) *ApplyIifaaDevicekeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyIifaaDevicekeyRequest) SetHead(v *RequestHead) *ApplyIifaaDevicekeyRequest {
	s.Head = v
	return s
}

func (s *ApplyIifaaDevicekeyRequest) SetRequest(v string) *ApplyIifaaDevicekeyRequest {
	s.Request = &v
	return s
}

func (s *ApplyIifaaDevicekeyRequest) SetSignature(v string) *ApplyIifaaDevicekeyRequest {
	s.Signature = &v
	return s
}

type ApplyIifaaDevicekeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务响应结果
	Data *IifaaEkytResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ApplyIifaaDevicekeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyIifaaDevicekeyResponse) GoString() string {
	return s.String()
}

func (s *ApplyIifaaDevicekeyResponse) SetReqMsgId(v string) *ApplyIifaaDevicekeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyIifaaDevicekeyResponse) SetResultCode(v string) *ApplyIifaaDevicekeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyIifaaDevicekeyResponse) SetResultMsg(v string) *ApplyIifaaDevicekeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyIifaaDevicekeyResponse) SetSuccess(v bool) *ApplyIifaaDevicekeyResponse {
	s.Success = &v
	return s
}

func (s *ApplyIifaaDevicekeyResponse) SetMessage(v string) *ApplyIifaaDevicekeyResponse {
	s.Message = &v
	return s
}

func (s *ApplyIifaaDevicekeyResponse) SetData(v *IifaaEkytResponse) *ApplyIifaaDevicekeyResponse {
	s.Data = v
	return s
}

type QueryDeviceplusRiskqueryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 加密电话号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 电话号码加密类型, 明文: 0; MD5加密: 1; SHA256: 2
	PhoneNumberType *string `json:"phone_number_type,omitempty" xml:"phone_number_type,omitempty" require:"true"`
}

func (s QueryDeviceplusRiskqueryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceplusRiskqueryRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceplusRiskqueryRequest) SetAuthToken(v string) *QueryDeviceplusRiskqueryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceplusRiskqueryRequest) SetProductInstanceId(v string) *QueryDeviceplusRiskqueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceplusRiskqueryRequest) SetClientId(v string) *QueryDeviceplusRiskqueryRequest {
	s.ClientId = &v
	return s
}

func (s *QueryDeviceplusRiskqueryRequest) SetSceneCode(v string) *QueryDeviceplusRiskqueryRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryDeviceplusRiskqueryRequest) SetPhoneNumber(v string) *QueryDeviceplusRiskqueryRequest {
	s.PhoneNumber = &v
	return s
}

func (s *QueryDeviceplusRiskqueryRequest) SetPhoneNumberType(v string) *QueryDeviceplusRiskqueryRequest {
	s.PhoneNumberType = &v
	return s
}

type QueryDeviceplusRiskqueryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 供nearx排查的链路业务请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 风险咨询信息
	Data *RiskQueryData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceplusRiskqueryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceplusRiskqueryResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceplusRiskqueryResponse) SetReqMsgId(v string) *QueryDeviceplusRiskqueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetResultCode(v string) *QueryDeviceplusRiskqueryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetResultMsg(v string) *QueryDeviceplusRiskqueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetSuccess(v bool) *QueryDeviceplusRiskqueryResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetCode(v int64) *QueryDeviceplusRiskqueryResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetMessage(v string) *QueryDeviceplusRiskqueryResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetRequestId(v string) *QueryDeviceplusRiskqueryResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceplusRiskqueryResponse) SetData(v *RiskQueryData) *QueryDeviceplusRiskqueryResponse {
	s.Data = v
	return s
}

type QueryDeviceplusMpaasRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 评分模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// mpaas环境id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
	// mpaas应用id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 加密电话号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
}

func (s QueryDeviceplusMpaasRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceplusMpaasRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceplusMpaasRequest) SetAuthToken(v string) *QueryDeviceplusMpaasRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetProductInstanceId(v string) *QueryDeviceplusMpaasRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetModelId(v string) *QueryDeviceplusMpaasRequest {
	s.ModelId = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetWorkspaceId(v string) *QueryDeviceplusMpaasRequest {
	s.WorkspaceId = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetAppId(v string) *QueryDeviceplusMpaasRequest {
	s.AppId = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetSceneCode(v string) *QueryDeviceplusMpaasRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryDeviceplusMpaasRequest) SetPhoneNumber(v string) *QueryDeviceplusMpaasRequest {
	s.PhoneNumber = &v
	return s
}

type QueryDeviceplusMpaasResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 供nearx排查的链路业务请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 风险咨询信息
	Data *RiskQueryData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDeviceplusMpaasResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceplusMpaasResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceplusMpaasResponse) SetReqMsgId(v string) *QueryDeviceplusMpaasResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetResultCode(v string) *QueryDeviceplusMpaasResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetResultMsg(v string) *QueryDeviceplusMpaasResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetSuccess(v bool) *QueryDeviceplusMpaasResponse {
	s.Success = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetCode(v int64) *QueryDeviceplusMpaasResponse {
	s.Code = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetMessage(v string) *QueryDeviceplusMpaasResponse {
	s.Message = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetRequestId(v string) *QueryDeviceplusMpaasResponse {
	s.RequestId = &v
	return s
}

func (s *QueryDeviceplusMpaasResponse) SetData(v *RiskQueryData) *QueryDeviceplusMpaasResponse {
	s.Data = v
	return s
}

type SubmitAshieldPeriodhardeningtaskRequest struct {
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

func (s SubmitAshieldPeriodhardeningtaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAshieldPeriodhardeningtaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetAuthToken(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetProductInstanceId(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetFileUrl(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.FileUrl = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetSoProtect(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.SoProtect = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetSoProtectConfig(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.SoProtectConfig = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetAssetsProtect(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.AssetsProtect = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetAssetsProtectConfing(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.AssetsProtectConfing = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetRuntimeProtectConfig(v *RuntimeProtectConfig) *SubmitAshieldPeriodhardeningtaskRequest {
	s.RuntimeProtectConfig = v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetEnableLifeFunc(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.EnableLifeFunc = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetJavatocJniConfig(v []*ClassMethodConfig) *SubmitAshieldPeriodhardeningtaskRequest {
	s.JavatocJniConfig = v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskRequest) SetExtInfo(v string) *SubmitAshieldPeriodhardeningtaskRequest {
	s.ExtInfo = &v
	return s
}

type SubmitAshieldPeriodhardeningtaskResponse struct {
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

func (s SubmitAshieldPeriodhardeningtaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAshieldPeriodhardeningtaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetReqMsgId(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResultCode(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResultMsg(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetRequestId(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.RequestId = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResSuccess(v bool) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResSuccess = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResCode(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResCode = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResMessage(v string) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResMessage = &v
	return s
}

func (s *SubmitAshieldPeriodhardeningtaskResponse) SetResData(v *HardeningTaskResponse) *SubmitAshieldPeriodhardeningtaskResponse {
	s.ResData = v
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
	// .
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// res_success
	ResSuccess *bool `json:"res_success,omitempty" xml:"res_success,omitempty"`
	// res_code
	ResCode *string `json:"res_code,omitempty" xml:"res_code,omitempty"`
	// res_message
	ResMessage *string `json:"res_message,omitempty" xml:"res_message,omitempty"`
	// .
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

type InitEkytTrustsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 签约用户信息
	SignUser *string `json:"sign_user,omitempty" xml:"sign_user,omitempty" require:"true"`
	// 控件key-value
	RectId *string `json:"rect_id,omitempty" xml:"rect_id,omitempty"`
	// 签约方案码
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
	// 发起签约的外部流水号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 小程序appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 用户授权标识
	UserAuthorization *string `json:"user_authorization,omitempty" xml:"user_authorization,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s InitEkytTrustsignRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEkytTrustsignRequest) GoString() string {
	return s.String()
}

func (s *InitEkytTrustsignRequest) SetAuthToken(v string) *InitEkytTrustsignRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetProductInstanceId(v string) *InitEkytTrustsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetHead(v *RequestHead) *InitEkytTrustsignRequest {
	s.Head = v
	return s
}

func (s *InitEkytTrustsignRequest) SetSignUser(v string) *InitEkytTrustsignRequest {
	s.SignUser = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetRectId(v string) *InitEkytTrustsignRequest {
	s.RectId = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetSolutionCode(v string) *InitEkytTrustsignRequest {
	s.SolutionCode = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetOutOrderNo(v string) *InitEkytTrustsignRequest {
	s.OutOrderNo = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetAppId(v string) *InitEkytTrustsignRequest {
	s.AppId = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetUserAuthorization(v string) *InitEkytTrustsignRequest {
	s.UserAuthorization = &v
	return s
}

func (s *InitEkytTrustsignRequest) SetExtInfo(v string) *InitEkytTrustsignRequest {
	s.ExtInfo = &v
	return s
}

type InitEkytTrustsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 可信签约初始化数据
	Data *TrustSignInitData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InitEkytTrustsignResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEkytTrustsignResponse) GoString() string {
	return s.String()
}

func (s *InitEkytTrustsignResponse) SetReqMsgId(v string) *InitEkytTrustsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEkytTrustsignResponse) SetResultCode(v string) *InitEkytTrustsignResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEkytTrustsignResponse) SetResultMsg(v string) *InitEkytTrustsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEkytTrustsignResponse) SetSuccess(v bool) *InitEkytTrustsignResponse {
	s.Success = &v
	return s
}

func (s *InitEkytTrustsignResponse) SetMessage(v string) *InitEkytTrustsignResponse {
	s.Message = &v
	return s
}

func (s *InitEkytTrustsignResponse) SetData(v *TrustSignInitData) *InitEkytTrustsignResponse {
	s.Data = v
	return s
}

type QueryEkytTrustsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 小程序appId
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 发起签约的外部流水号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 签约方案码
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
}

func (s QueryEkytTrustsignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytTrustsignRequest) GoString() string {
	return s.String()
}

func (s *QueryEkytTrustsignRequest) SetAuthToken(v string) *QueryEkytTrustsignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEkytTrustsignRequest) SetProductInstanceId(v string) *QueryEkytTrustsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEkytTrustsignRequest) SetHead(v *RequestHead) *QueryEkytTrustsignRequest {
	s.Head = v
	return s
}

func (s *QueryEkytTrustsignRequest) SetAppId(v string) *QueryEkytTrustsignRequest {
	s.AppId = &v
	return s
}

func (s *QueryEkytTrustsignRequest) SetOutOrderNo(v string) *QueryEkytTrustsignRequest {
	s.OutOrderNo = &v
	return s
}

func (s *QueryEkytTrustsignRequest) SetSolutionCode(v string) *QueryEkytTrustsignRequest {
	s.SolutionCode = &v
	return s
}

type QueryEkytTrustsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 可信签约签约单数据
	Data *TrustSignQueryData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryEkytTrustsignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytTrustsignResponse) GoString() string {
	return s.String()
}

func (s *QueryEkytTrustsignResponse) SetReqMsgId(v string) *QueryEkytTrustsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEkytTrustsignResponse) SetResultCode(v string) *QueryEkytTrustsignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEkytTrustsignResponse) SetResultMsg(v string) *QueryEkytTrustsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEkytTrustsignResponse) SetSuccess(v bool) *QueryEkytTrustsignResponse {
	s.Success = &v
	return s
}

func (s *QueryEkytTrustsignResponse) SetMessage(v string) *QueryEkytTrustsignResponse {
	s.Message = &v
	return s
}

func (s *QueryEkytTrustsignResponse) SetData(v *TrustSignQueryData) *QueryEkytTrustsignResponse {
	s.Data = v
	return s
}

type InitEkytFaceverifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 加密方式；0：明文；1：RSA；2：SM2
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 商户请求的唯一标识
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
}

func (s InitEkytFaceverifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEkytFaceverifyRequest) GoString() string {
	return s.String()
}

func (s *InitEkytFaceverifyRequest) SetAuthToken(v string) *InitEkytFaceverifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEkytFaceverifyRequest) SetProductInstanceId(v string) *InitEkytFaceverifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEkytFaceverifyRequest) SetHead(v *RequestHead) *InitEkytFaceverifyRequest {
	s.Head = v
	return s
}

func (s *InitEkytFaceverifyRequest) SetCertName(v string) *InitEkytFaceverifyRequest {
	s.CertName = &v
	return s
}

func (s *InitEkytFaceverifyRequest) SetCertNo(v string) *InitEkytFaceverifyRequest {
	s.CertNo = &v
	return s
}

func (s *InitEkytFaceverifyRequest) SetEncType(v string) *InitEkytFaceverifyRequest {
	s.EncType = &v
	return s
}

func (s *InitEkytFaceverifyRequest) SetOuterOrderNo(v string) *InitEkytFaceverifyRequest {
	s.OuterOrderNo = &v
	return s
}

type InitEkytFaceverifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 人脸核身初始化数据
	Data *FaceVerifyInitData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InitEkytFaceverifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEkytFaceverifyResponse) GoString() string {
	return s.String()
}

func (s *InitEkytFaceverifyResponse) SetReqMsgId(v string) *InitEkytFaceverifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEkytFaceverifyResponse) SetResultCode(v string) *InitEkytFaceverifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEkytFaceverifyResponse) SetResultMsg(v string) *InitEkytFaceverifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEkytFaceverifyResponse) SetSuccess(v bool) *InitEkytFaceverifyResponse {
	s.Success = &v
	return s
}

func (s *InitEkytFaceverifyResponse) SetMessage(v string) *InitEkytFaceverifyResponse {
	s.Message = &v
	return s
}

func (s *InitEkytFaceverifyResponse) SetData(v *FaceVerifyInitData) *InitEkytFaceverifyResponse {
	s.Data = v
	return s
}

type QueryEkytFaceverifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 可信实人认证的唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 商户请求的唯一标识
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
}

func (s QueryEkytFaceverifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytFaceverifyRequest) GoString() string {
	return s.String()
}

func (s *QueryEkytFaceverifyRequest) SetAuthToken(v string) *QueryEkytFaceverifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEkytFaceverifyRequest) SetProductInstanceId(v string) *QueryEkytFaceverifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEkytFaceverifyRequest) SetHead(v *RequestHead) *QueryEkytFaceverifyRequest {
	s.Head = v
	return s
}

func (s *QueryEkytFaceverifyRequest) SetCertifyId(v string) *QueryEkytFaceverifyRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryEkytFaceverifyRequest) SetOuterOrderNo(v string) *QueryEkytFaceverifyRequest {
	s.OuterOrderNo = &v
	return s
}

type QueryEkytFaceverifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 结果描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 人脸核身结果数据
	Data *FaceVerifyResultData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryEkytFaceverifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEkytFaceverifyResponse) GoString() string {
	return s.String()
}

func (s *QueryEkytFaceverifyResponse) SetReqMsgId(v string) *QueryEkytFaceverifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEkytFaceverifyResponse) SetResultCode(v string) *QueryEkytFaceverifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEkytFaceverifyResponse) SetResultMsg(v string) *QueryEkytFaceverifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEkytFaceverifyResponse) SetSuccess(v bool) *QueryEkytFaceverifyResponse {
	s.Success = &v
	return s
}

func (s *QueryEkytFaceverifyResponse) SetMessage(v string) *QueryEkytFaceverifyResponse {
	s.Message = &v
	return s
}

func (s *QueryEkytFaceverifyResponse) SetData(v *FaceVerifyResultData) *QueryEkytFaceverifyResponse {
	s.Data = v
	return s
}

type ImportYhllRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// shopUuid
	ShopUuid *string `json:"shop_uuid,omitempty" xml:"shop_uuid,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 任务类型
	GoodType *string `json:"good_type,omitempty" xml:"good_type,omitempty" require:"true"`
	// 模板名
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 城市代码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 坐标范围
	CoordinateRange *string `json:"coordinate_range,omitempty" xml:"coordinate_range,omitempty"`
	// 总量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 模板替换符
	PlaceHolder *string `json:"place_holder,omitempty" xml:"place_holder,omitempty"`
	// 补充信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s ImportYhllRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportYhllRequest) GoString() string {
	return s.String()
}

func (s *ImportYhllRequest) SetAuthToken(v string) *ImportYhllRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportYhllRequest) SetProductInstanceId(v string) *ImportYhllRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportYhllRequest) SetShopUuid(v string) *ImportYhllRequest {
	s.ShopUuid = &v
	return s
}

func (s *ImportYhllRequest) SetName(v string) *ImportYhllRequest {
	s.Name = &v
	return s
}

func (s *ImportYhllRequest) SetDescription(v string) *ImportYhllRequest {
	s.Description = &v
	return s
}

func (s *ImportYhllRequest) SetGoodType(v string) *ImportYhllRequest {
	s.GoodType = &v
	return s
}

func (s *ImportYhllRequest) SetTemplateName(v string) *ImportYhllRequest {
	s.TemplateName = &v
	return s
}

func (s *ImportYhllRequest) SetIndustry(v string) *ImportYhllRequest {
	s.Industry = &v
	return s
}

func (s *ImportYhllRequest) SetAddress(v string) *ImportYhllRequest {
	s.Address = &v
	return s
}

func (s *ImportYhllRequest) SetCityCode(v string) *ImportYhllRequest {
	s.CityCode = &v
	return s
}

func (s *ImportYhllRequest) SetLongitude(v string) *ImportYhllRequest {
	s.Longitude = &v
	return s
}

func (s *ImportYhllRequest) SetLatitude(v string) *ImportYhllRequest {
	s.Latitude = &v
	return s
}

func (s *ImportYhllRequest) SetCoordinateRange(v string) *ImportYhllRequest {
	s.CoordinateRange = &v
	return s
}

func (s *ImportYhllRequest) SetTotal(v int64) *ImportYhllRequest {
	s.Total = &v
	return s
}

func (s *ImportYhllRequest) SetPlaceHolder(v string) *ImportYhllRequest {
	s.PlaceHolder = &v
	return s
}

func (s *ImportYhllRequest) SetExtInfo(v string) *ImportYhllRequest {
	s.ExtInfo = &v
	return s
}

type ImportYhllResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty"`
}

func (s ImportYhllResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportYhllResponse) GoString() string {
	return s.String()
}

func (s *ImportYhllResponse) SetReqMsgId(v string) *ImportYhllResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportYhllResponse) SetResultCode(v string) *ImportYhllResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportYhllResponse) SetResultMsg(v string) *ImportYhllResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportYhllResponse) SetUuid(v string) *ImportYhllResponse {
	s.Uuid = &v
	return s
}

type QueryYhllRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 城市编码
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty" require:"true"`
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty" require:"true"`
	// page size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// page number
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
}

func (s QueryYhllRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYhllRequest) GoString() string {
	return s.String()
}

func (s *QueryYhllRequest) SetAuthToken(v string) *QueryYhllRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYhllRequest) SetProductInstanceId(v string) *QueryYhllRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYhllRequest) SetCityCode(v string) *QueryYhllRequest {
	s.CityCode = &v
	return s
}

func (s *QueryYhllRequest) SetUuid(v string) *QueryYhllRequest {
	s.Uuid = &v
	return s
}

func (s *QueryYhllRequest) SetPageSize(v int64) *QueryYhllRequest {
	s.PageSize = &v
	return s
}

func (s *QueryYhllRequest) SetPageNum(v int64) *QueryYhllRequest {
	s.PageNum = &v
	return s
}

type QueryYhllResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// total
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// open_task_result_list
	OpenTaskResultList *string `json:"open_task_result_list,omitempty" xml:"open_task_result_list,omitempty"`
}

func (s QueryYhllResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYhllResponse) GoString() string {
	return s.String()
}

func (s *QueryYhllResponse) SetReqMsgId(v string) *QueryYhllResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYhllResponse) SetResultCode(v string) *QueryYhllResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYhllResponse) SetResultMsg(v string) *QueryYhllResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYhllResponse) SetTotal(v int64) *QueryYhllResponse {
	s.Total = &v
	return s
}

func (s *QueryYhllResponse) SetOpenTaskResultList(v string) *QueryYhllResponse {
	s.OpenTaskResultList = &v
	return s
}

type QueryGuardAskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true" maxLength:"128" minLength:"0"`
	// 数据唯一标识，能够根据该值定位到该条数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"64" minLength:"0"`
	// serviceCode
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 当前提问内容，最大长度10000个字符。
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true" maxLength:"10000" minLength:"0"`
	// 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty" maxLength:"32" minLength:"0"`
	// scene_code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// app_code
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// raas_products
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty"`
}

func (s QueryGuardAskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAskRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardAskRequest) SetAuthToken(v string) *QueryGuardAskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardAskRequest) SetProductInstanceId(v string) *QueryGuardAskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardAskRequest) SetSessionId(v string) *QueryGuardAskRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGuardAskRequest) SetRequestId(v string) *QueryGuardAskRequest {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAskRequest) SetServiceCode(v string) *QueryGuardAskRequest {
	s.ServiceCode = &v
	return s
}

func (s *QueryGuardAskRequest) SetQuestion(v string) *QueryGuardAskRequest {
	s.Question = &v
	return s
}

func (s *QueryGuardAskRequest) SetQuestionFormat(v string) *QueryGuardAskRequest {
	s.QuestionFormat = &v
	return s
}

func (s *QueryGuardAskRequest) SetSceneCode(v string) *QueryGuardAskRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGuardAskRequest) SetAppCode(v string) *QueryGuardAskRequest {
	s.AppCode = &v
	return s
}

func (s *QueryGuardAskRequest) SetRaasProducts(v string) *QueryGuardAskRequest {
	s.RaasProducts = &v
	return s
}

type QueryGuardAskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测数据ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否安全无风险，true: 安全无风险，false: 有风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 安全动作相关文案
	ActionMsg *string `json:"action_msg,omitempty" xml:"action_msg,omitempty"`
	// 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
}

func (s QueryGuardAskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAskResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardAskResponse) SetReqMsgId(v string) *QueryGuardAskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardAskResponse) SetResultCode(v string) *QueryGuardAskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardAskResponse) SetResultMsg(v string) *QueryGuardAskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardAskResponse) SetRequestId(v string) *QueryGuardAskResponse {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAskResponse) SetSafe(v bool) *QueryGuardAskResponse {
	s.Safe = &v
	return s
}

func (s *QueryGuardAskResponse) SetActionCode(v string) *QueryGuardAskResponse {
	s.ActionCode = &v
	return s
}

func (s *QueryGuardAskResponse) SetActionMsg(v string) *QueryGuardAskResponse {
	s.ActionMsg = &v
	return s
}

func (s *QueryGuardAskResponse) SetSessionAction(v string) *QueryGuardAskResponse {
	s.SessionAction = &v
	return s
}

type QueryGuardAnswerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true" maxLength:"128" minLength:"0"`
	// 数据唯一标识，能够根据该值定位到该条数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"64" minLength:"0"`
	// service_code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true" maxLength:"128" minLength:"0"`
	// 作为一个人工智能语言模型，我还没有学习到相关信息，不过我觉得梦里啥都有，建议您保持充分的睡眠。
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty" require:"true" maxLength:"10000" minLength:"1"`
	// 作为一个解梦者，你的任务是解释以下梦境:[上证30000点，没错，是三万不是三千]。根据梦中出现的符号和主题，请提供一份客观且基于事实的解释。
	Question *string `json:"question,omitempty" xml:"question,omitempty" maxLength:"800" minLength:"1"`
	// 纯文本: PLAINTEXT，图片url: PICTURE_URL
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty" maxLength:"32" minLength:"0"`
	// 纯文本: PLAINTEXT
	// 图片url: PICTURE_URL
	AnswerFormat *string `json:"answer_format,omitempty" xml:"answer_format,omitempty" maxLength:"32" minLength:"0"`
	// scene_code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" maxLength:"128" minLength:"1"`
	// app_code
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty"`
	// raas_products
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty"`
}

func (s QueryGuardAnswerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAnswerRequest) GoString() string {
	return s.String()
}

func (s *QueryGuardAnswerRequest) SetAuthToken(v string) *QueryGuardAnswerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetProductInstanceId(v string) *QueryGuardAnswerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetSessionId(v string) *QueryGuardAnswerRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetRequestId(v string) *QueryGuardAnswerRequest {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetServiceCode(v string) *QueryGuardAnswerRequest {
	s.ServiceCode = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetAnswer(v string) *QueryGuardAnswerRequest {
	s.Answer = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetQuestion(v string) *QueryGuardAnswerRequest {
	s.Question = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetQuestionFormat(v string) *QueryGuardAnswerRequest {
	s.QuestionFormat = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetAnswerFormat(v string) *QueryGuardAnswerRequest {
	s.AnswerFormat = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetSceneCode(v string) *QueryGuardAnswerRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetAppCode(v string) *QueryGuardAnswerRequest {
	s.AppCode = &v
	return s
}

func (s *QueryGuardAnswerRequest) SetRaasProducts(v string) *QueryGuardAnswerRequest {
	s.RaasProducts = &v
	return s
}

type QueryGuardAnswerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测数据ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否安全无风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 拦截: BLOCK
	// 安全代答: SECURITY_ANSWER
	// 红色GPT安全代答: REDGPT_ANSWER
	// 回答里补充安全提示: SECURITY_TIP
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 安全提示增强的文案、安全代答的回答、回答里补充的安全提示
	ActionMsg *string `json:"action_msg,omitempty" xml:"action_msg,omitempty"`
	// 终止会话: END_SESSION
	// 撤回提问: RECALL_QUERY
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
}

func (s QueryGuardAnswerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGuardAnswerResponse) GoString() string {
	return s.String()
}

func (s *QueryGuardAnswerResponse) SetReqMsgId(v string) *QueryGuardAnswerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetResultCode(v string) *QueryGuardAnswerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetResultMsg(v string) *QueryGuardAnswerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetRequestId(v string) *QueryGuardAnswerResponse {
	s.RequestId = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetSafe(v bool) *QueryGuardAnswerResponse {
	s.Safe = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetActionCode(v string) *QueryGuardAnswerResponse {
	s.ActionCode = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetActionMsg(v string) *QueryGuardAnswerResponse {
	s.ActionMsg = &v
	return s
}

func (s *QueryGuardAnswerResponse) SetSessionAction(v string) *QueryGuardAnswerResponse {
	s.SessionAction = &v
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
				"sdk_version":      tea.String("1.2.30"),
				"_prod_code":       tea.String("SECURITYTECH"),
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
 * Description: 安全科技网关通用运行接口
 * Summary: 安全科技网关通用运行接口
 */
func (client *Client) RunGeneral(request *RunGeneralRequest) (_result *RunGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunGeneralResponse{}
	_body, _err := client.RunGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 安全科技网关通用运行接口
 * Summary: 安全科技网关通用运行接口
 */
func (client *Client) RunGeneralEx(request *RunGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.general.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁住房保险产品，开放接口
调用方：上海远点网络科技有限公司
 * Summary: 租赁住房保险产品，接口开放给租房平台
*/
func (client *Client) ExecEkytInsure(request *ExecEkytInsureRequest) (_result *ExecEkytInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecEkytInsureResponse{}
	_body, _err := client.ExecEkytInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁住房保险产品，开放接口
调用方：上海远点网络科技有限公司
 * Summary: 租赁住房保险产品，接口开放给租房平台
*/
func (client *Client) ExecEkytInsureEx(request *ExecEkytInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecEkytInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecEkytInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.insure.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBssecpic(request *CreateBssecpicRequest) (_result *CreateBssecpicResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBssecpicResponse{}
	_body, _err := client.CreateBssecpicEx(request, headers, runtime)
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
func (client *Client) CreateBssecpicEx(request *CreateBssecpicRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBssecpicResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBssecpicResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.bssecpic.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.blueshield.securitypicture.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.faceshield.native.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.faceshield.web.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备激活
 * Summary: 可信设备认证设备初始化，设备激活
 */
func (client *Client) InitIifaaDevice(request *InitIifaaDeviceRequest) (_result *InitIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIifaaDeviceResponse{}
	_body, _err := client.InitIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备激活
 * Summary: 可信设备认证设备初始化，设备激活
 */
func (client *Client) InitIifaaDeviceEx(request *InitIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证风险咨询，获取预认证数据
 * Summary: 可信设备认证风险咨询，获取预认证数据
 */
func (client *Client) RecognizeIifaaDevice(request *RecognizeIifaaDeviceRequest) (_result *RecognizeIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeIifaaDeviceResponse{}
	_body, _err := client.RecognizeIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证风险咨询，获取预认证数据
 * Summary: 可信设备认证风险咨询，获取预认证数据
 */
func (client *Client) RecognizeIifaaDeviceEx(request *RecognizeIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，设备验证
 * Summary: 可信设备认证，设备验证
 */
func (client *Client) VerifyIifaaDevice(request *VerifyIifaaDeviceRequest) (_result *VerifyIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyIifaaDeviceResponse{}
	_body, _err := client.VerifyIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，设备验证
 * Summary: 可信设备认证，设备验证
 */
func (client *Client) VerifyIifaaDeviceEx(request *VerifyIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，产商注册
 * Summary: 可信设备认证，产商注册
 */
func (client *Client) RegisterIifaaCorp(request *RegisterIifaaCorpRequest) (_result *RegisterIifaaCorpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterIifaaCorpResponse{}
	_body, _err := client.RegisterIifaaCorpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，产商注册
 * Summary: 可信设备认证，产商注册
 */
func (client *Client) RegisterIifaaCorpEx(request *RegisterIifaaCorpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterIifaaCorpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterIifaaCorpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.corp.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，擦除设备信息
 * Summary: 可信设备认证，擦除设备信息
 */
func (client *Client) DeprecateIifaaDevice(request *DeprecateIifaaDeviceRequest) (_result *DeprecateIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeprecateIifaaDeviceResponse{}
	_body, _err := client.DeprecateIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，擦除设备信息
 * Summary: 可信设备认证，擦除设备信息
 */
func (client *Client) DeprecateIifaaDeviceEx(request *DeprecateIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeprecateIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeprecateIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.deprecate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 巡检商业化
 * Summary: 巡检商业化
 */
func (client *Client) RunXhunterSpi(request *RunXhunterSpiRequest) (_result *RunXhunterSpiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunXhunterSpiResponse{}
	_body, _err := client.RunXhunterSpiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 巡检商业化
 * Summary: 巡检商业化
 */
func (client *Client) RunXhunterSpiEx(request *RunXhunterSpiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunXhunterSpiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunXhunterSpiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.xhunter.spi.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租凭住房保险产品，接口开放给租房平台
 * Summary: 租凭住房保险产品，接口开放给租房平台
 */
func (client *Client) ExecIifaaInsure(request *ExecIifaaInsureRequest) (_result *ExecIifaaInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecIifaaInsureResponse{}
	_body, _err := client.ExecIifaaInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租凭住房保险产品，接口开放给租房平台
 * Summary: 租凭住房保险产品，接口开放给租房平台
 */
func (client *Client) ExecIifaaInsureEx(request *ExecIifaaInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecIifaaInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecIifaaInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.insure.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容安全图片同步检测
 * Summary: 内容安全图片同步检测
 */
func (client *Client) QueryCctPicture(request *QueryCctPictureRequest) (_result *QueryCctPictureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCctPictureResponse{}
	_body, _err := client.QueryCctPictureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容安全图片同步检测
 * Summary: 内容安全图片同步检测
 */
func (client *Client) QueryCctPictureEx(request *QueryCctPictureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCctPictureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCctPictureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.cct.picture.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容安全主站同步检测
 * Summary: 内容安全主站同步检测
 */
func (client *Client) RecognizeCctAnalyze(request *RecognizeCctAnalyzeRequest) (_result *RecognizeCctAnalyzeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeCctAnalyzeResponse{}
	_body, _err := client.RecognizeCctAnalyzeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容安全主站同步检测
 * Summary: 内容安全主站同步检测
 */
func (client *Client) RecognizeCctAnalyzeEx(request *RecognizeCctAnalyzeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeCctAnalyzeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeCctAnalyzeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.cct.analyze.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: RAAS数据服务统一接口
 * Summary: RAAS数据服务统一接口
 */
func (client *Client) QueryRiskGeneral(request *QueryRiskGeneralRequest) (_result *QueryRiskGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskGeneralResponse{}
	_body, _err := client.QueryRiskGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: RAAS数据服务统一接口
 * Summary: RAAS数据服务统一接口
 */
func (client *Client) QueryRiskGeneralEx(request *QueryRiskGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.risk.general.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备指纹查询
 * Summary: 设备指纹查询
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
 * Description: 设备指纹查询
 * Summary: 设备指纹查询
 */
func (client *Client) QueryDeviceriskFingerEx(request *QueryDeviceriskFingerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskFingerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskFingerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.devicerisk.finger.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.devicerisk.risklabel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 设备风险查询
 * Summary: 设备风险查询
 */
func (client *Client) QueryDeviceriskDeviceriskEx(request *QueryDeviceriskDeviceriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceriskDeviceriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceriskDeviceriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.devicerisk.devicerisk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备信息上报
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
 * Description: 设备信息上报
 * Summary: 设备信息上报
 */
func (client *Client) SubmitDeviceriskReportEx(request *SubmitDeviceriskReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDeviceriskReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDeviceriskReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.devicerisk.report.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryEkytDriver(request *QueryEkytDriverRequest) (_result *QueryEkytDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEkytDriverResponse{}
	_body, _err := client.QueryEkytDriverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryEkytDriverEx(request *QueryEkytDriverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEkytDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEkytDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.driver.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请设备设备密钥
 * Summary: 申请设备设备密钥
 */
func (client *Client) ApplyIifaaDevicekey(request *ApplyIifaaDevicekeyRequest) (_result *ApplyIifaaDevicekeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyIifaaDevicekeyResponse{}
	_body, _err := client.ApplyIifaaDevicekeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请设备设备密钥
 * Summary: 申请设备设备密钥
 */
func (client *Client) ApplyIifaaDevicekeyEx(request *ApplyIifaaDevicekeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyIifaaDevicekeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyIifaaDevicekeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.devicekey.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备风险咨询
 * Summary: 设备风险咨询
 */
func (client *Client) QueryDeviceplusRiskquery(request *QueryDeviceplusRiskqueryRequest) (_result *QueryDeviceplusRiskqueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceplusRiskqueryResponse{}
	_body, _err := client.QueryDeviceplusRiskqueryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备风险咨询
 * Summary: 设备风险咨询
 */
func (client *Client) QueryDeviceplusRiskqueryEx(request *QueryDeviceplusRiskqueryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceplusRiskqueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceplusRiskqueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.deviceplus.riskquery.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备风险咨询mpaas
 * Summary: 设备风险咨询mpaas
 */
func (client *Client) QueryDeviceplusMpaas(request *QueryDeviceplusMpaasRequest) (_result *QueryDeviceplusMpaasResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceplusMpaasResponse{}
	_body, _err := client.QueryDeviceplusMpaasEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备风险咨询mpaas
 * Summary: 设备风险咨询mpaas
 */
func (client *Client) QueryDeviceplusMpaasEx(request *QueryDeviceplusMpaasRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceplusMpaasResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceplusMpaasResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.deviceplus.mpaas.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-启动加固任务(包月)
 * Summary: 启动加固任务(包月)
 */
func (client *Client) SubmitAshieldPeriodhardeningtask(request *SubmitAshieldPeriodhardeningtaskRequest) (_result *SubmitAshieldPeriodhardeningtaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAshieldPeriodhardeningtaskResponse{}
	_body, _err := client.SubmitAshieldPeriodhardeningtaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-启动加固任务(包月)
 * Summary: 启动加固任务(包月)
 */
func (client *Client) SubmitAshieldPeriodhardeningtaskEx(request *SubmitAshieldPeriodhardeningtaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAshieldPeriodhardeningtaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAshieldPeriodhardeningtaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.periodhardeningtask.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.filetoken.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全-Android应用加固-启动加固任务
 * Summary: 启动加固任务(按次计费)
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
 * Summary: 启动加固任务(按次计费)
 */
func (client *Client) SubmitAshieldHardeningtaskEx(request *SubmitAshieldHardeningtaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAshieldHardeningtaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAshieldHardeningtaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.hardeningtask.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.hardeningtaskprocess.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.hardeningresult.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ashield.hardeninglog.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT可信签约初始化
 * Summary: eKYT可信签约-初始化
 */
func (client *Client) InitEkytTrustsign(request *InitEkytTrustsignRequest) (_result *InitEkytTrustsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEkytTrustsignResponse{}
	_body, _err := client.InitEkytTrustsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT可信签约初始化
 * Summary: eKYT可信签约-初始化
 */
func (client *Client) InitEkytTrustsignEx(request *InitEkytTrustsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEkytTrustsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEkytTrustsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.trustsign.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT可信签约签约单查询
 * Summary: eKYT可信签约-签约单查询
 */
func (client *Client) QueryEkytTrustsign(request *QueryEkytTrustsignRequest) (_result *QueryEkytTrustsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEkytTrustsignResponse{}
	_body, _err := client.QueryEkytTrustsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT可信签约签约单查询
 * Summary: eKYT可信签约-签约单查询
 */
func (client *Client) QueryEkytTrustsignEx(request *QueryEkytTrustsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEkytTrustsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEkytTrustsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.trustsign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT人脸核身初始化
 * Summary: eKYT人脸核身-初始化
 */
func (client *Client) InitEkytFaceverify(request *InitEkytFaceverifyRequest) (_result *InitEkytFaceverifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEkytFaceverifyResponse{}
	_body, _err := client.InitEkytFaceverifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT人脸核身初始化
 * Summary: eKYT人脸核身-初始化
 */
func (client *Client) InitEkytFaceverifyEx(request *InitEkytFaceverifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEkytFaceverifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEkytFaceverifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.faceverify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: eKYT人脸核身结果查询
 * Summary: eKYT人脸核身-结果查询
 */
func (client *Client) QueryEkytFaceverify(request *QueryEkytFaceverifyRequest) (_result *QueryEkytFaceverifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEkytFaceverifyResponse{}
	_body, _err := client.QueryEkytFaceverifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT人脸核身结果查询
 * Summary: eKYT人脸核身-结果查询
 */
func (client *Client) QueryEkytFaceverifyEx(request *QueryEkytFaceverifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEkytFaceverifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEkytFaceverifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.faceverify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 友活来了创建任务api
 * Summary: 友活来了创建任务api
 */
func (client *Client) ImportYhll(request *ImportYhllRequest) (_result *ImportYhllResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportYhllResponse{}
	_body, _err := client.ImportYhllEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 友活来了创建任务api
 * Summary: 友活来了创建任务api
 */
func (client *Client) ImportYhllEx(request *ImportYhllRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportYhllResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportYhllResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.yhll.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 友活来了任务查询api
 * Summary: 友活来了任务查询api
 */
func (client *Client) QueryYhll(request *QueryYhllRequest) (_result *QueryYhllResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYhllResponse{}
	_body, _err := client.QueryYhllEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 友活来了任务查询api
 * Summary: 友活来了任务查询api
 */
func (client *Client) QueryYhllEx(request *QueryYhllRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYhllResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYhllResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.yhll.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天鉴ask接口
 * Summary: 天鉴ask接口
 */
func (client *Client) QueryGuardAsk(request *QueryGuardAskRequest) (_result *QueryGuardAskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardAskResponse{}
	_body, _err := client.QueryGuardAskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天鉴ask接口
 * Summary: 天鉴ask接口
 */
func (client *Client) QueryGuardAskEx(request *QueryGuardAskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardAskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardAskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.guard.ask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天鉴answer接口
 * Summary: 天鉴answer接口
 */
func (client *Client) QueryGuardAnswer(request *QueryGuardAnswerRequest) (_result *QueryGuardAnswerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGuardAnswerResponse{}
	_body, _err := client.QueryGuardAnswerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天鉴answer接口
 * Summary: 天鉴answer接口
 */
func (client *Client) QueryGuardAnswerEx(request *QueryGuardAnswerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGuardAnswerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGuardAnswerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.guard.answer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
