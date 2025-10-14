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

// spu图片信息
type SpuPictureInfo struct {
	// spu主图url
	MainPic *string `json:"main_pic,omitempty" xml:"main_pic,omitempty" require:"true"`
	// spu详情图片url
	DetailPic []*string `json:"detail_pic,omitempty" xml:"detail_pic,omitempty" type:"Repeated"`
}

func (s SpuPictureInfo) String() string {
	return tea.Prettify(s)
}

func (s SpuPictureInfo) GoString() string {
	return s.String()
}

func (s *SpuPictureInfo) SetMainPic(v string) *SpuPictureInfo {
	s.MainPic = &v
	return s
}

func (s *SpuPictureInfo) SetDetailPic(v []*string) *SpuPictureInfo {
	s.DetailPic = v
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

// 两轮车一体机销售信息
type SimSalesInfo struct {
	// 销售对外业务id
	SalesId *string `json:"sales_id,omitempty" xml:"sales_id,omitempty" require:"true"`
}

func (s SimSalesInfo) String() string {
	return tea.Prettify(s)
}

func (s SimSalesInfo) GoString() string {
	return s.String()
}

func (s *SimSalesInfo) SetSalesId(v string) *SimSalesInfo {
	s.SalesId = &v
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

// 光鉴智能凭证结构体
type IdentityData struct {
	// 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
	IsRisk *string `json:"is_risk,omitempty" xml:"is_risk,omitempty" require:"true"`
	// 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 附加字段,json格式字符串
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
}

func (s IdentityData) String() string {
	return tea.Prettify(s)
}

func (s IdentityData) GoString() string {
	return s.String()
}

func (s *IdentityData) SetIsRisk(v string) *IdentityData {
	s.IsRisk = &v
	return s
}

func (s *IdentityData) SetRiskType(v string) *IdentityData {
	s.RiskType = &v
	return s
}

func (s *IdentityData) SetExtInfo(v string) *IdentityData {
	s.ExtInfo = &v
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

// ETC车辆信息
type EtcVehicleInfo struct {
	// 车辆id
	VehicleId *string `json:"vehicle_id,omitempty" xml:"vehicle_id,omitempty" require:"true"`
	// etc申请单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// etc平台扣款协议号
	BizAgreementNo *string `json:"biz_agreement_no,omitempty" xml:"biz_agreement_no,omitempty" require:"true"`
	// etc申请单状态
	// ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
	DeviceNo *string `json:"device_no,omitempty" xml:"device_no,omitempty"`
	// 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
	// 待签约: WAIT_SIGN
	// 已签约: SIGNED
	// 已解约: UNSIGN
	DeductSignStatus *string `json:"deduct_sign_status,omitempty" xml:"deduct_sign_status,omitempty"`
	// 设备首次激活时间
	FirstActivedTime *string `json:"first_actived_time,omitempty" xml:"first_actived_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 合约到期时间
	ServiceExp *string `json:"service_exp,omitempty" xml:"service_exp,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
	DeviceStatus *string `json:"device_status,omitempty" xml:"device_status,omitempty"`
	// 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
	DeviceStatusDetail *string `json:"device_status_detail,omitempty" xml:"device_status_detail,omitempty"`
	// 设备状态触发的具体时间
	DeviceBizTime *string `json:"device_biz_time,omitempty" xml:"device_biz_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s EtcVehicleInfo) String() string {
	return tea.Prettify(s)
}

func (s EtcVehicleInfo) GoString() string {
	return s.String()
}

func (s *EtcVehicleInfo) SetVehicleId(v string) *EtcVehicleInfo {
	s.VehicleId = &v
	return s
}

func (s *EtcVehicleInfo) SetOrderId(v string) *EtcVehicleInfo {
	s.OrderId = &v
	return s
}

func (s *EtcVehicleInfo) SetBizAgreementNo(v string) *EtcVehicleInfo {
	s.BizAgreementNo = &v
	return s
}

func (s *EtcVehicleInfo) SetOrderStatus(v string) *EtcVehicleInfo {
	s.OrderStatus = &v
	return s
}

func (s *EtcVehicleInfo) SetDeviceNo(v string) *EtcVehicleInfo {
	s.DeviceNo = &v
	return s
}

func (s *EtcVehicleInfo) SetDeductSignStatus(v string) *EtcVehicleInfo {
	s.DeductSignStatus = &v
	return s
}

func (s *EtcVehicleInfo) SetFirstActivedTime(v string) *EtcVehicleInfo {
	s.FirstActivedTime = &v
	return s
}

func (s *EtcVehicleInfo) SetServiceExp(v string) *EtcVehicleInfo {
	s.ServiceExp = &v
	return s
}

func (s *EtcVehicleInfo) SetDeviceStatus(v string) *EtcVehicleInfo {
	s.DeviceStatus = &v
	return s
}

func (s *EtcVehicleInfo) SetDeviceStatusDetail(v string) *EtcVehicleInfo {
	s.DeviceStatusDetail = &v
	return s
}

func (s *EtcVehicleInfo) SetDeviceBizTime(v string) *EtcVehicleInfo {
	s.DeviceBizTime = &v
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

// 两轮车一体机订单信息
type SimOrderInfo struct {
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 必填	销售id
	SalesId *string `json:"sales_id,omitempty" xml:"sales_id,omitempty" require:"true"`
	// 车辆SN号
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 用户手机号
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 订单时间，格式yyyy-MM-dd HH:mm:ss
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true"`
	// 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
	PaymentType *string `json:"payment_type,omitempty" xml:"payment_type,omitempty"`
	// 支付时间，格式yyyy-MM-dd HH:mm:ss
	PaymentTime *string `json:"payment_time,omitempty" xml:"payment_time,omitempty"`
	// 总金额，单位元
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 订单状态，枚举值
	// UNPAID（未支付），
	// PAID（已支付），
	// CANCEL（订单取消），
	// PENDING（支付中），
	// FAILED（支付失败）
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 车辆SKU名字
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty"`
	// 车型
	VehicleModel *string `json:"vehicle_model,omitempty" xml:"vehicle_model,omitempty"`
	// 颜色
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// 配件信息，逗号分隔
	Accessories *string `json:"accessories,omitempty" xml:"accessories,omitempty"`
	// 图片json
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
	// 拓展字段，json格式
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s SimOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s SimOrderInfo) GoString() string {
	return s.String()
}

func (s *SimOrderInfo) SetOrderId(v string) *SimOrderInfo {
	s.OrderId = &v
	return s
}

func (s *SimOrderInfo) SetSalesId(v string) *SimOrderInfo {
	s.SalesId = &v
	return s
}

func (s *SimOrderInfo) SetSn(v string) *SimOrderInfo {
	s.Sn = &v
	return s
}

func (s *SimOrderInfo) SetMobileNo(v string) *SimOrderInfo {
	s.MobileNo = &v
	return s
}

func (s *SimOrderInfo) SetOrderTime(v string) *SimOrderInfo {
	s.OrderTime = &v
	return s
}

func (s *SimOrderInfo) SetPaymentType(v string) *SimOrderInfo {
	s.PaymentType = &v
	return s
}

func (s *SimOrderInfo) SetPaymentTime(v string) *SimOrderInfo {
	s.PaymentTime = &v
	return s
}

func (s *SimOrderInfo) SetTotalAmount(v string) *SimOrderInfo {
	s.TotalAmount = &v
	return s
}

func (s *SimOrderInfo) SetStatus(v string) *SimOrderInfo {
	s.Status = &v
	return s
}

func (s *SimOrderInfo) SetSkuName(v string) *SimOrderInfo {
	s.SkuName = &v
	return s
}

func (s *SimOrderInfo) SetVehicleModel(v string) *SimOrderInfo {
	s.VehicleModel = &v
	return s
}

func (s *SimOrderInfo) SetColor(v string) *SimOrderInfo {
	s.Color = &v
	return s
}

func (s *SimOrderInfo) SetAccessories(v string) *SimOrderInfo {
	s.Accessories = &v
	return s
}

func (s *SimOrderInfo) SetImages(v string) *SimOrderInfo {
	s.Images = &v
	return s
}

func (s *SimOrderInfo) SetExtraInfo(v string) *SimOrderInfo {
	s.ExtraInfo = &v
	return s
}

// 二轮车一体机车辆SKU
type SimSkuInfo struct {
	// sku对外id
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// sku名称
	SkuName *string `json:"sku_name,omitempty" xml:"sku_name,omitempty" require:"true"`
	// sku官方指导价：单位为元
	Price *string `json:"price,omitempty" xml:"price,omitempty" require:"true"`
	// sku门店优惠价：单位为元
	StorePrice *string `json:"store_price,omitempty" xml:"store_price,omitempty" require:"true"`
	// 车型
	VehicleModel *string `json:"vehicle_model,omitempty" xml:"vehicle_model,omitempty" require:"true"`
	// 续航里程
	RangeKm *string `json:"range_km,omitempty" xml:"range_km,omitempty" require:"true"`
	// 关键词，逗号分隔
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true"`
	// 颜色，逗号分隔
	Colors *string `json:"colors,omitempty" xml:"colors,omitempty" require:"true"`
	// 配件信息，逗号分隔
	Accessories *string `json:"accessories,omitempty" xml:"accessories,omitempty" require:"true"`
	// 图片url json
	Images *string `json:"images,omitempty" xml:"images,omitempty" require:"true"`
	// 门店id
	StoreId *string `json:"store_id,omitempty" xml:"store_id,omitempty" require:"true"`
	// 车型描述
	SkuDescription *string `json:"sku_description,omitempty" xml:"sku_description,omitempty"`
}

func (s SimSkuInfo) String() string {
	return tea.Prettify(s)
}

func (s SimSkuInfo) GoString() string {
	return s.String()
}

func (s *SimSkuInfo) SetSkuId(v string) *SimSkuInfo {
	s.SkuId = &v
	return s
}

func (s *SimSkuInfo) SetSkuName(v string) *SimSkuInfo {
	s.SkuName = &v
	return s
}

func (s *SimSkuInfo) SetPrice(v string) *SimSkuInfo {
	s.Price = &v
	return s
}

func (s *SimSkuInfo) SetStorePrice(v string) *SimSkuInfo {
	s.StorePrice = &v
	return s
}

func (s *SimSkuInfo) SetVehicleModel(v string) *SimSkuInfo {
	s.VehicleModel = &v
	return s
}

func (s *SimSkuInfo) SetRangeKm(v string) *SimSkuInfo {
	s.RangeKm = &v
	return s
}

func (s *SimSkuInfo) SetKeywords(v string) *SimSkuInfo {
	s.Keywords = &v
	return s
}

func (s *SimSkuInfo) SetColors(v string) *SimSkuInfo {
	s.Colors = &v
	return s
}

func (s *SimSkuInfo) SetAccessories(v string) *SimSkuInfo {
	s.Accessories = &v
	return s
}

func (s *SimSkuInfo) SetImages(v string) *SimSkuInfo {
	s.Images = &v
	return s
}

func (s *SimSkuInfo) SetStoreId(v string) *SimSkuInfo {
	s.StoreId = &v
	return s
}

func (s *SimSkuInfo) SetSkuDescription(v string) *SimSkuInfo {
	s.SkuDescription = &v
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

// 车队信息结构体
type DcpInfo struct {
	// 企业入驻租户ID
	DcpTenantId *string `json:"dcp_tenant_id,omitempty" xml:"dcp_tenant_id,omitempty" require:"true"`
	// 企业名称
	DcpName *string `json:"dcp_name,omitempty" xml:"dcp_name,omitempty" require:"true"`
}

func (s DcpInfo) String() string {
	return tea.Prettify(s)
}

func (s DcpInfo) GoString() string {
	return s.String()
}

func (s *DcpInfo) SetDcpTenantId(v string) *DcpInfo {
	s.DcpTenantId = &v
	return s
}

func (s *DcpInfo) SetDcpName(v string) *DcpInfo {
	s.DcpName = &v
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

// 两轮车一体机车辆SPU
type SimSpuInfo struct {
	// SPU ID
	SpuId *string `json:"spu_id,omitempty" xml:"spu_id,omitempty" require:"true"`
	// spu名称
	SpuName *string `json:"spu_name,omitempty" xml:"spu_name,omitempty" require:"true"`
	// spu图片信息
	SpuPictureInfo *SpuPictureInfo `json:"spu_picture_info,omitempty" xml:"spu_picture_info,omitempty" require:"true"`
}

func (s SimSpuInfo) String() string {
	return tea.Prettify(s)
}

func (s SimSpuInfo) GoString() string {
	return s.String()
}

func (s *SimSpuInfo) SetSpuId(v string) *SimSpuInfo {
	s.SpuId = &v
	return s
}

func (s *SimSpuInfo) SetSpuName(v string) *SimSpuInfo {
	s.SpuName = &v
	return s
}

func (s *SimSpuInfo) SetSpuPictureInfo(v *SpuPictureInfo) *SimSpuInfo {
	s.SpuPictureInfo = v
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

// 分页器
type Paginator struct {
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 单页项数
	ItemsPerPage *int64 `json:"items_per_page,omitempty" xml:"items_per_page,omitempty" require:"true"`
	// 总项数
	Items *int64 `json:"items,omitempty" xml:"items,omitempty" require:"true"`
}

func (s Paginator) String() string {
	return tea.Prettify(s)
}

func (s Paginator) GoString() string {
	return s.String()
}

func (s *Paginator) SetPage(v int64) *Paginator {
	s.Page = &v
	return s
}

func (s *Paginator) SetItemsPerPage(v int64) *Paginator {
	s.ItemsPerPage = &v
	return s
}

func (s *Paginator) SetItems(v int64) *Paginator {
	s.Items = &v
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

// 两轮车一体机门店信息
type SimStoreInfo struct {
	// 门店对外业务id
	StoreId *string `json:"store_id,omitempty" xml:"store_id,omitempty" require:"true"`
	// 门店名称
	StoreName *string `json:"store_name,omitempty" xml:"store_name,omitempty" require:"true"`
	// 是否签约 true已签约/false未签约
	IsSign *bool `json:"is_sign,omitempty" xml:"is_sign,omitempty" require:"true"`
	// 支付宝H5签约链接 未签约时非空
	SignUrl *string `json:"sign_url,omitempty" xml:"sign_url,omitempty"`
}

func (s SimStoreInfo) String() string {
	return tea.Prettify(s)
}

func (s SimStoreInfo) GoString() string {
	return s.String()
}

func (s *SimStoreInfo) SetStoreId(v string) *SimStoreInfo {
	s.StoreId = &v
	return s
}

func (s *SimStoreInfo) SetStoreName(v string) *SimStoreInfo {
	s.StoreName = &v
	return s
}

func (s *SimStoreInfo) SetIsSign(v bool) *SimStoreInfo {
	s.IsSign = &v
	return s
}

func (s *SimStoreInfo) SetSignUrl(v string) *SimStoreInfo {
	s.SignUrl = &v
	return s
}

// 司机签约信息列表
type SignInfo struct {
	// 司机证件号
	EmployeeCertNo *string `json:"employee_cert_no,omitempty" xml:"employee_cert_no,omitempty" require:"true"`
	// 灵工卡号
	EmployeeCardNo *string `json:"employee_card_no,omitempty" xml:"employee_card_no,omitempty" require:"true"`
	// 借贷专户ID，用于后续资金相关操作
	AccountBookId *string `json:"account_book_id,omitempty" xml:"account_book_id,omitempty" require:"true"`
	// 签约状态，枚举值
	// ● SIGNED：已签约【灵工卡状态正常，可入金出金】
	// ● TERMINATED：已解约【不可入金出金】
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 签约时间 "yyyy-MM-dd HH:mm:ss"
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty"`
	// 解约时间 "yyyy-MM-dd HH:mm:ss"
	TerminateTime *string `json:"terminate_time,omitempty" xml:"terminate_time,omitempty"`
	// 签约协议生效时间
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" require:"true"`
	// 签约协议解约时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" require:"true"`
	// 月租金额：单位为元
	PaymentAmount *string `json:"payment_amount,omitempty" xml:"payment_amount,omitempty" require:"true"`
}

func (s SignInfo) String() string {
	return tea.Prettify(s)
}

func (s SignInfo) GoString() string {
	return s.String()
}

func (s *SignInfo) SetEmployeeCertNo(v string) *SignInfo {
	s.EmployeeCertNo = &v
	return s
}

func (s *SignInfo) SetEmployeeCardNo(v string) *SignInfo {
	s.EmployeeCardNo = &v
	return s
}

func (s *SignInfo) SetAccountBookId(v string) *SignInfo {
	s.AccountBookId = &v
	return s
}

func (s *SignInfo) SetStatus(v string) *SignInfo {
	s.Status = &v
	return s
}

func (s *SignInfo) SetSignTime(v string) *SignInfo {
	s.SignTime = &v
	return s
}

func (s *SignInfo) SetTerminateTime(v string) *SignInfo {
	s.TerminateTime = &v
	return s
}

func (s *SignInfo) SetEffectTime(v string) *SignInfo {
	s.EffectTime = &v
	return s
}

func (s *SignInfo) SetExpireTime(v string) *SignInfo {
	s.ExpireTime = &v
	return s
}

func (s *SignInfo) SetPaymentAmount(v string) *SignInfo {
	s.PaymentAmount = &v
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

// ETC行程信息
type EtcTripInfo struct {
	// 发行方扣款订单号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty"`
	// 行程开始时间
	TripStartTime *string `json:"trip_start_time,omitempty" xml:"trip_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 行程结束时间
	TripEndTime *string `json:"trip_end_time,omitempty" xml:"trip_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	StartStationName *string `json:"start_station_name,omitempty" xml:"start_station_name,omitempty"`
	// 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	EndStationName *string `json:"end_station_name,omitempty" xml:"end_station_name,omitempty"`
	// HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty"`
	// ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
	SubScene *string `json:"sub_scene,omitempty" xml:"sub_scene,omitempty"`
	// 商户扣费的总金额：单位为元，精确到小数点后两位
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 行程id
	TripId *string `json:"trip_id,omitempty" xml:"trip_id,omitempty"`
	// 交易单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s EtcTripInfo) String() string {
	return tea.Prettify(s)
}

func (s EtcTripInfo) GoString() string {
	return s.String()
}

func (s *EtcTripInfo) SetOutOrderId(v string) *EtcTripInfo {
	s.OutOrderId = &v
	return s
}

func (s *EtcTripInfo) SetTripStartTime(v string) *EtcTripInfo {
	s.TripStartTime = &v
	return s
}

func (s *EtcTripInfo) SetTripEndTime(v string) *EtcTripInfo {
	s.TripEndTime = &v
	return s
}

func (s *EtcTripInfo) SetStartStationName(v string) *EtcTripInfo {
	s.StartStationName = &v
	return s
}

func (s *EtcTripInfo) SetEndStationName(v string) *EtcTripInfo {
	s.EndStationName = &v
	return s
}

func (s *EtcTripInfo) SetSubType(v string) *EtcTripInfo {
	s.SubType = &v
	return s
}

func (s *EtcTripInfo) SetSubScene(v string) *EtcTripInfo {
	s.SubScene = &v
	return s
}

func (s *EtcTripInfo) SetTotalAmount(v string) *EtcTripInfo {
	s.TotalAmount = &v
	return s
}

func (s *EtcTripInfo) SetTripId(v string) *EtcTripInfo {
	s.TripId = &v
	return s
}

func (s *EtcTripInfo) SetTradeNo(v string) *EtcTripInfo {
	s.TradeNo = &v
	return s
}

// 两轮车一体机营销活动信息
type SimCampaignInfo struct {
	// 营销活动id
	CampaignId *string `json:"campaign_id,omitempty" xml:"campaign_id,omitempty" require:"true"`
	// 营销活动名
	CampaignName *string `json:"campaign_name,omitempty" xml:"campaign_name,omitempty" require:"true"`
	// 营销图片
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty" require:"true"`
	// 营销活动内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s SimCampaignInfo) String() string {
	return tea.Prettify(s)
}

func (s SimCampaignInfo) GoString() string {
	return s.String()
}

func (s *SimCampaignInfo) SetCampaignId(v string) *SimCampaignInfo {
	s.CampaignId = &v
	return s
}

func (s *SimCampaignInfo) SetCampaignName(v string) *SimCampaignInfo {
	s.CampaignName = &v
	return s
}

func (s *SimCampaignInfo) SetImageUrl(v string) *SimCampaignInfo {
	s.ImageUrl = &v
	return s
}

func (s *SimCampaignInfo) SetContent(v string) *SimCampaignInfo {
	s.Content = &v
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

type ListDcpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s ListDcpRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDcpRequest) GoString() string {
	return s.String()
}

func (s *ListDcpRequest) SetAuthToken(v string) *ListDcpRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDcpRequest) SetProductInstanceId(v string) *ListDcpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDcpRequest) SetOuterOrderNo(v string) *ListDcpRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ListDcpRequest) SetExternParam(v string) *ListDcpRequest {
	s.ExternParam = &v
	return s
}

type ListDcpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求方租户所关联的所有入驻的车队企业信息列表
	DcpInfoList []*DcpInfo `json:"dcp_info_list,omitempty" xml:"dcp_info_list,omitempty" type:"Repeated"`
	// json格式字符串扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s ListDcpResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDcpResponse) GoString() string {
	return s.String()
}

func (s *ListDcpResponse) SetReqMsgId(v string) *ListDcpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDcpResponse) SetResultCode(v string) *ListDcpResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDcpResponse) SetResultMsg(v string) *ListDcpResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDcpResponse) SetDcpInfoList(v []*DcpInfo) *ListDcpResponse {
	s.DcpInfoList = v
	return s
}

func (s *ListDcpResponse) SetExternInfo(v string) *ListDcpResponse {
	s.ExternInfo = &v
	return s
}

type ListDcpAccountbookRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 企业入驻租户ID
	DcpTenantId *string `json:"dcp_tenant_id,omitempty" xml:"dcp_tenant_id,omitempty" require:"true"`
	// 扩展信息，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s ListDcpAccountbookRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDcpAccountbookRequest) GoString() string {
	return s.String()
}

func (s *ListDcpAccountbookRequest) SetAuthToken(v string) *ListDcpAccountbookRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDcpAccountbookRequest) SetProductInstanceId(v string) *ListDcpAccountbookRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDcpAccountbookRequest) SetOuterOrderNo(v string) *ListDcpAccountbookRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ListDcpAccountbookRequest) SetDcpTenantId(v string) *ListDcpAccountbookRequest {
	s.DcpTenantId = &v
	return s
}

func (s *ListDcpAccountbookRequest) SetExternParam(v string) *ListDcpAccountbookRequest {
	s.ExternParam = &v
	return s
}

type ListDcpAccountbookResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求车队企业关联的所有司机签约信息列表
	SignInfoList []*SignInfo `json:"sign_info_list,omitempty" xml:"sign_info_list,omitempty" type:"Repeated"`
	// json格式字符串扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s ListDcpAccountbookResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDcpAccountbookResponse) GoString() string {
	return s.String()
}

func (s *ListDcpAccountbookResponse) SetReqMsgId(v string) *ListDcpAccountbookResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDcpAccountbookResponse) SetResultCode(v string) *ListDcpAccountbookResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDcpAccountbookResponse) SetResultMsg(v string) *ListDcpAccountbookResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDcpAccountbookResponse) SetSignInfoList(v []*SignInfo) *ListDcpAccountbookResponse {
	s.SignInfoList = v
	return s
}

func (s *ListDcpAccountbookResponse) SetExternInfo(v string) *ListDcpAccountbookResponse {
	s.ExternInfo = &v
	return s
}

type QueryEtcVehicleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 企业侧车辆编号
	CorpVehicleId *string `json:"corp_vehicle_id,omitempty" xml:"corp_vehicle_id,omitempty" require:"true"`
	// 车牌号码
	PlateNo *string `json:"plate_no,omitempty" xml:"plate_no,omitempty" require:"true"`
	// 车牌颜色，枚举值
	// 蓝: BLUE
	// 黄: YELLOW
	// 黑: BLACK
	// 白: WHITE
	// 绿: GREEN
	PlateColor *string `json:"plate_color,omitempty" xml:"plate_color,omitempty" require:"true"`
	// 企业运单号，唯一值
	WaybillNo *string `json:"waybill_no,omitempty" xml:"waybill_no,omitempty"`
}

func (s QueryEtcVehicleRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEtcVehicleRequest) GoString() string {
	return s.String()
}

func (s *QueryEtcVehicleRequest) SetAuthToken(v string) *QueryEtcVehicleRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetProductInstanceId(v string) *QueryEtcVehicleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetOuterOrderNo(v string) *QueryEtcVehicleRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetCorpVehicleId(v string) *QueryEtcVehicleRequest {
	s.CorpVehicleId = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetPlateNo(v string) *QueryEtcVehicleRequest {
	s.PlateNo = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetPlateColor(v string) *QueryEtcVehicleRequest {
	s.PlateColor = &v
	return s
}

func (s *QueryEtcVehicleRequest) SetWaybillNo(v string) *QueryEtcVehicleRequest {
	s.WaybillNo = &v
	return s
}

type QueryEtcVehicleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求方租户所关联的车辆入驻信息
	EtcVehicle *EtcVehicleInfo `json:"etc_vehicle,omitempty" xml:"etc_vehicle,omitempty"`
	// json格式字符串扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryEtcVehicleResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEtcVehicleResponse) GoString() string {
	return s.String()
}

func (s *QueryEtcVehicleResponse) SetReqMsgId(v string) *QueryEtcVehicleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEtcVehicleResponse) SetResultCode(v string) *QueryEtcVehicleResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEtcVehicleResponse) SetResultMsg(v string) *QueryEtcVehicleResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEtcVehicleResponse) SetEtcVehicle(v *EtcVehicleInfo) *QueryEtcVehicleResponse {
	s.EtcVehicle = v
	return s
}

func (s *QueryEtcVehicleResponse) SetExternInfo(v string) *QueryEtcVehicleResponse {
	s.ExternInfo = &v
	return s
}

type UploadEtcWaybillRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 企业侧车辆编号
	CorpVehicleId *string `json:"corp_vehicle_id,omitempty" xml:"corp_vehicle_id,omitempty" require:"true"`
	// 车牌号码
	PlateNo *string `json:"plate_no,omitempty" xml:"plate_no,omitempty" require:"true"`
	// 车牌颜色，枚举值
	// 蓝: BLUE
	// 黄: YELLOW
	// 黑: BLACK
	// 白: WHITE
	// 绿: GREEN
	PlateColor *string `json:"plate_color,omitempty" xml:"plate_color,omitempty" require:"true"`
	// 企业运单号，唯一值
	WaybillNo *string `json:"waybill_no,omitempty" xml:"waybill_no,omitempty" require:"true"`
	// 企业运单状态，枚举值
	// 进行中: IN_PROGRESS
	// 已完成: COMPLETED
	// 已取消: CANCELED
	WaybillStatus *string `json:"waybill_status,omitempty" xml:"waybill_status,omitempty" require:"true"`
	// 运单开始时间
	// 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
	WaybillStartTime *string `json:"waybill_start_time,omitempty" xml:"waybill_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 企业运单结束时间
	// 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
	WaybillEndTime *string `json:"waybill_end_time,omitempty" xml:"waybill_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 运单开始地址
	// 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
	WaybillStartAddress *string `json:"waybill_start_address,omitempty" xml:"waybill_start_address,omitempty"`
	// 运单结束地址，运单目的地
	// 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
	WaybillEndAddress *string `json:"waybill_end_address,omitempty" xml:"waybill_end_address,omitempty"`
	// 运单总费用，单位元，精确到两位小数
	// 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
	WaybillFee *string `json:"waybill_fee,omitempty" xml:"waybill_fee,omitempty"`
	// 高速通行费用，单位元，精确到两位小数
	HighwayFee *string `json:"highway_fee,omitempty" xml:"highway_fee,omitempty"`
}

func (s UploadEtcWaybillRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadEtcWaybillRequest) GoString() string {
	return s.String()
}

func (s *UploadEtcWaybillRequest) SetAuthToken(v string) *UploadEtcWaybillRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetProductInstanceId(v string) *UploadEtcWaybillRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetOuterOrderNo(v string) *UploadEtcWaybillRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetCorpVehicleId(v string) *UploadEtcWaybillRequest {
	s.CorpVehicleId = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetPlateNo(v string) *UploadEtcWaybillRequest {
	s.PlateNo = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetPlateColor(v string) *UploadEtcWaybillRequest {
	s.PlateColor = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillNo(v string) *UploadEtcWaybillRequest {
	s.WaybillNo = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillStatus(v string) *UploadEtcWaybillRequest {
	s.WaybillStatus = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillStartTime(v string) *UploadEtcWaybillRequest {
	s.WaybillStartTime = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillEndTime(v string) *UploadEtcWaybillRequest {
	s.WaybillEndTime = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillStartAddress(v string) *UploadEtcWaybillRequest {
	s.WaybillStartAddress = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillEndAddress(v string) *UploadEtcWaybillRequest {
	s.WaybillEndAddress = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetWaybillFee(v string) *UploadEtcWaybillRequest {
	s.WaybillFee = &v
	return s
}

func (s *UploadEtcWaybillRequest) SetHighwayFee(v string) *UploadEtcWaybillRequest {
	s.HighwayFee = &v
	return s
}

type UploadEtcWaybillResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运单记录号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// json格式字符串扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s UploadEtcWaybillResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadEtcWaybillResponse) GoString() string {
	return s.String()
}

func (s *UploadEtcWaybillResponse) SetReqMsgId(v string) *UploadEtcWaybillResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadEtcWaybillResponse) SetResultCode(v string) *UploadEtcWaybillResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadEtcWaybillResponse) SetResultMsg(v string) *UploadEtcWaybillResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadEtcWaybillResponse) SetBizId(v string) *UploadEtcWaybillResponse {
	s.BizId = &v
	return s
}

func (s *UploadEtcWaybillResponse) SetExternInfo(v string) *UploadEtcWaybillResponse {
	s.ExternInfo = &v
	return s
}

type QueryEtcTripRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 企业侧车辆编号
	CorpVehicleId *string `json:"corp_vehicle_id,omitempty" xml:"corp_vehicle_id,omitempty" require:"true"`
	// 车牌号码
	PlateNo *string `json:"plate_no,omitempty" xml:"plate_no,omitempty" require:"true"`
	// 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
	PlateColor *string `json:"plate_color,omitempty" xml:"plate_color,omitempty" require:"true"`
	// 企业运单号，唯一值
	WaybillNo *string `json:"waybill_no,omitempty" xml:"waybill_no,omitempty" require:"true"`
	// 当前页码
	// 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页数据条数
	// 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 行程查询开始时间
	// 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 行程查询结束时间
	// 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
	//
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryEtcTripRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEtcTripRequest) GoString() string {
	return s.String()
}

func (s *QueryEtcTripRequest) SetAuthToken(v string) *QueryEtcTripRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEtcTripRequest) SetProductInstanceId(v string) *QueryEtcTripRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEtcTripRequest) SetOuterOrderNo(v string) *QueryEtcTripRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryEtcTripRequest) SetCorpVehicleId(v string) *QueryEtcTripRequest {
	s.CorpVehicleId = &v
	return s
}

func (s *QueryEtcTripRequest) SetPlateNo(v string) *QueryEtcTripRequest {
	s.PlateNo = &v
	return s
}

func (s *QueryEtcTripRequest) SetPlateColor(v string) *QueryEtcTripRequest {
	s.PlateColor = &v
	return s
}

func (s *QueryEtcTripRequest) SetWaybillNo(v string) *QueryEtcTripRequest {
	s.WaybillNo = &v
	return s
}

func (s *QueryEtcTripRequest) SetPageNum(v int64) *QueryEtcTripRequest {
	s.PageNum = &v
	return s
}

func (s *QueryEtcTripRequest) SetPageSize(v int64) *QueryEtcTripRequest {
	s.PageSize = &v
	return s
}

func (s *QueryEtcTripRequest) SetStartTime(v string) *QueryEtcTripRequest {
	s.StartTime = &v
	return s
}

func (s *QueryEtcTripRequest) SetEndTime(v string) *QueryEtcTripRequest {
	s.EndTime = &v
	return s
}

type QueryEtcTripResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 总记录数
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
	// 当前页码
	//
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 是否还有下一页
	HasNext *bool `json:"has_next,omitempty" xml:"has_next,omitempty"`
	// 请求方租户所关联的行程单据列表
	TripList []*EtcTripInfo `json:"trip_list,omitempty" xml:"trip_list,omitempty" type:"Repeated"`
	// json格式字符串扩展信息，预留字段。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryEtcTripResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEtcTripResponse) GoString() string {
	return s.String()
}

func (s *QueryEtcTripResponse) SetReqMsgId(v string) *QueryEtcTripResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEtcTripResponse) SetResultCode(v string) *QueryEtcTripResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEtcTripResponse) SetResultMsg(v string) *QueryEtcTripResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEtcTripResponse) SetTotalPage(v int64) *QueryEtcTripResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryEtcTripResponse) SetTotalSize(v int64) *QueryEtcTripResponse {
	s.TotalSize = &v
	return s
}

func (s *QueryEtcTripResponse) SetPageNum(v int64) *QueryEtcTripResponse {
	s.PageNum = &v
	return s
}

func (s *QueryEtcTripResponse) SetPageSize(v int64) *QueryEtcTripResponse {
	s.PageSize = &v
	return s
}

func (s *QueryEtcTripResponse) SetHasNext(v bool) *QueryEtcTripResponse {
	s.HasNext = &v
	return s
}

func (s *QueryEtcTripResponse) SetTripList(v []*EtcTripInfo) *QueryEtcTripResponse {
	s.TripList = v
	return s
}

func (s *QueryEtcTripResponse) SetExternInfo(v string) *QueryEtcTripResponse {
	s.ExternInfo = &v
	return s
}

type InitSimLoginRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
}

func (s InitSimLoginRequest) String() string {
	return tea.Prettify(s)
}

func (s InitSimLoginRequest) GoString() string {
	return s.String()
}

func (s *InitSimLoginRequest) SetAuthToken(v string) *InitSimLoginRequest {
	s.AuthToken = &v
	return s
}

func (s *InitSimLoginRequest) SetProductInstanceId(v string) *InitSimLoginRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitSimLoginRequest) SetDeviceId(v string) *InitSimLoginRequest {
	s.DeviceId = &v
	return s
}

type InitSimLoginResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝登录url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 登录token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
}

func (s InitSimLoginResponse) String() string {
	return tea.Prettify(s)
}

func (s InitSimLoginResponse) GoString() string {
	return s.String()
}

func (s *InitSimLoginResponse) SetReqMsgId(v string) *InitSimLoginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitSimLoginResponse) SetResultCode(v string) *InitSimLoginResponse {
	s.ResultCode = &v
	return s
}

func (s *InitSimLoginResponse) SetResultMsg(v string) *InitSimLoginResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitSimLoginResponse) SetUrl(v string) *InitSimLoginResponse {
	s.Url = &v
	return s
}

func (s *InitSimLoginResponse) SetToken(v string) *InitSimLoginResponse {
	s.Token = &v
	return s
}

type QuerySimLoginRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
}

func (s QuerySimLoginRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySimLoginRequest) GoString() string {
	return s.String()
}

func (s *QuerySimLoginRequest) SetAuthToken(v string) *QuerySimLoginRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySimLoginRequest) SetProductInstanceId(v string) *QuerySimLoginRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySimLoginRequest) SetDeviceId(v string) *QuerySimLoginRequest {
	s.DeviceId = &v
	return s
}

func (s *QuerySimLoginRequest) SetToken(v string) *QuerySimLoginRequest {
	s.Token = &v
	return s
}

type QuerySimLoginResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登录结果
	// NO_RESULT：暂无登录结果
	// EXPIRED：token过期
	// ACTIVATE_OK：激活成功，店长首次登录成功
	// LOGIN_OK：登录成功
	// USER_NOT_EXIST：用户不存在
	// STORE_NOT_ACTIVATED：门店未激活
	LoginResult *string `json:"login_result,omitempty" xml:"login_result,omitempty"`
	// 登录结果中文信息
	LoginMsg *string `json:"login_msg,omitempty" xml:"login_msg,omitempty"`
	// 是否已经激活
	Activated *bool `json:"activated,omitempty" xml:"activated,omitempty"`
	// 激活时间，格式yyyy-MM-dd HH:mm:ss
	ActivateTime *string `json:"activate_time,omitempty" xml:"activate_time,omitempty"`
	// 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty"`
	// 当前登录的门店信息
	StoreInfo *SimStoreInfo `json:"store_info,omitempty" xml:"store_info,omitempty"`
	// 当前登录的销售信息
	SalesInfo *SimSalesInfo `json:"sales_info,omitempty" xml:"sales_info,omitempty"`
}

func (s QuerySimLoginResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySimLoginResponse) GoString() string {
	return s.String()
}

func (s *QuerySimLoginResponse) SetReqMsgId(v string) *QuerySimLoginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySimLoginResponse) SetResultCode(v string) *QuerySimLoginResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySimLoginResponse) SetResultMsg(v string) *QuerySimLoginResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySimLoginResponse) SetLoginResult(v string) *QuerySimLoginResponse {
	s.LoginResult = &v
	return s
}

func (s *QuerySimLoginResponse) SetLoginMsg(v string) *QuerySimLoginResponse {
	s.LoginMsg = &v
	return s
}

func (s *QuerySimLoginResponse) SetActivated(v bool) *QuerySimLoginResponse {
	s.Activated = &v
	return s
}

func (s *QuerySimLoginResponse) SetActivateTime(v string) *QuerySimLoginResponse {
	s.ActivateTime = &v
	return s
}

func (s *QuerySimLoginResponse) SetLoginTime(v string) *QuerySimLoginResponse {
	s.LoginTime = &v
	return s
}

func (s *QuerySimLoginResponse) SetStoreInfo(v *SimStoreInfo) *QuerySimLoginResponse {
	s.StoreInfo = v
	return s
}

func (s *QuerySimLoginResponse) SetSalesInfo(v *SimSalesInfo) *QuerySimLoginResponse {
	s.SalesInfo = v
	return s
}

type ListSimCampaignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
}

func (s ListSimCampaignRequest) String() string {
	return tea.Prettify(s)
}

func (s ListSimCampaignRequest) GoString() string {
	return s.String()
}

func (s *ListSimCampaignRequest) SetAuthToken(v string) *ListSimCampaignRequest {
	s.AuthToken = &v
	return s
}

func (s *ListSimCampaignRequest) SetProductInstanceId(v string) *ListSimCampaignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListSimCampaignRequest) SetDeviceId(v string) *ListSimCampaignRequest {
	s.DeviceId = &v
	return s
}

type ListSimCampaignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 营销活动列表
	CampaignList []*SimCampaignInfo `json:"campaign_list,omitempty" xml:"campaign_list,omitempty" type:"Repeated"`
}

func (s ListSimCampaignResponse) String() string {
	return tea.Prettify(s)
}

func (s ListSimCampaignResponse) GoString() string {
	return s.String()
}

func (s *ListSimCampaignResponse) SetReqMsgId(v string) *ListSimCampaignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListSimCampaignResponse) SetResultCode(v string) *ListSimCampaignResponse {
	s.ResultCode = &v
	return s
}

func (s *ListSimCampaignResponse) SetResultMsg(v string) *ListSimCampaignResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListSimCampaignResponse) SetCampaignList(v []*SimCampaignInfo) *ListSimCampaignResponse {
	s.CampaignList = v
	return s
}

type QuerySimSkuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 车辆SN，与skuId二选一
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// sku对外id列表，与sn二选一
	SkuIdList []*string `json:"sku_id_list,omitempty" xml:"sku_id_list,omitempty" type:"Repeated"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QuerySimSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySimSkuRequest) GoString() string {
	return s.String()
}

func (s *QuerySimSkuRequest) SetAuthToken(v string) *QuerySimSkuRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySimSkuRequest) SetProductInstanceId(v string) *QuerySimSkuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySimSkuRequest) SetDeviceId(v string) *QuerySimSkuRequest {
	s.DeviceId = &v
	return s
}

func (s *QuerySimSkuRequest) SetSn(v string) *QuerySimSkuRequest {
	s.Sn = &v
	return s
}

func (s *QuerySimSkuRequest) SetSkuIdList(v []*string) *QuerySimSkuRequest {
	s.SkuIdList = v
	return s
}

func (s *QuerySimSkuRequest) SetToken(v string) *QuerySimSkuRequest {
	s.Token = &v
	return s
}

type QuerySimSkuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 车辆SKU，如果查无返回空列表
	SkuInfoList []*SimSkuInfo `json:"sku_info_list,omitempty" xml:"sku_info_list,omitempty" type:"Repeated"`
}

func (s QuerySimSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySimSkuResponse) GoString() string {
	return s.String()
}

func (s *QuerySimSkuResponse) SetReqMsgId(v string) *QuerySimSkuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySimSkuResponse) SetResultCode(v string) *QuerySimSkuResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySimSkuResponse) SetResultMsg(v string) *QuerySimSkuResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySimSkuResponse) SetSkuInfoList(v []*SimSkuInfo) *QuerySimSkuResponse {
	s.SkuInfoList = v
	return s
}

type ListSimSkuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// SPU ID
	SpuId *string `json:"spu_id,omitempty" xml:"spu_id,omitempty"`
	// 请求的页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 单页项数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s ListSimSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s ListSimSkuRequest) GoString() string {
	return s.String()
}

func (s *ListSimSkuRequest) SetAuthToken(v string) *ListSimSkuRequest {
	s.AuthToken = &v
	return s
}

func (s *ListSimSkuRequest) SetProductInstanceId(v string) *ListSimSkuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListSimSkuRequest) SetDeviceId(v string) *ListSimSkuRequest {
	s.DeviceId = &v
	return s
}

func (s *ListSimSkuRequest) SetSpuId(v string) *ListSimSkuRequest {
	s.SpuId = &v
	return s
}

func (s *ListSimSkuRequest) SetPageNo(v int64) *ListSimSkuRequest {
	s.PageNo = &v
	return s
}

func (s *ListSimSkuRequest) SetPageSize(v int64) *ListSimSkuRequest {
	s.PageSize = &v
	return s
}

func (s *ListSimSkuRequest) SetToken(v string) *ListSimSkuRequest {
	s.Token = &v
	return s
}

type ListSimSkuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页器
	Paginator *Paginator `json:"paginator,omitempty" xml:"paginator,omitempty"`
	// 车辆SKU列表
	SkuInfoList []*SimSkuInfo `json:"sku_info_list,omitempty" xml:"sku_info_list,omitempty" type:"Repeated"`
}

func (s ListSimSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s ListSimSkuResponse) GoString() string {
	return s.String()
}

func (s *ListSimSkuResponse) SetReqMsgId(v string) *ListSimSkuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListSimSkuResponse) SetResultCode(v string) *ListSimSkuResponse {
	s.ResultCode = &v
	return s
}

func (s *ListSimSkuResponse) SetResultMsg(v string) *ListSimSkuResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListSimSkuResponse) SetPaginator(v *Paginator) *ListSimSkuResponse {
	s.Paginator = v
	return s
}

func (s *ListSimSkuResponse) SetSkuInfoList(v []*SimSkuInfo) *ListSimSkuResponse {
	s.SkuInfoList = v
	return s
}

type CreateSimOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// sku id
	SkuId *string `json:"sku_id,omitempty" xml:"sku_id,omitempty" require:"true"`
	// 车辆sn号
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 颜色
	Color *string `json:"color,omitempty" xml:"color,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 扩展信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s CreateSimOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSimOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateSimOrderRequest) SetAuthToken(v string) *CreateSimOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSimOrderRequest) SetProductInstanceId(v string) *CreateSimOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSimOrderRequest) SetDeviceId(v string) *CreateSimOrderRequest {
	s.DeviceId = &v
	return s
}

func (s *CreateSimOrderRequest) SetSkuId(v string) *CreateSimOrderRequest {
	s.SkuId = &v
	return s
}

func (s *CreateSimOrderRequest) SetSn(v string) *CreateSimOrderRequest {
	s.Sn = &v
	return s
}

func (s *CreateSimOrderRequest) SetColor(v string) *CreateSimOrderRequest {
	s.Color = &v
	return s
}

func (s *CreateSimOrderRequest) SetToken(v string) *CreateSimOrderRequest {
	s.Token = &v
	return s
}

func (s *CreateSimOrderRequest) SetExtraInfo(v string) *CreateSimOrderRequest {
	s.ExtraInfo = &v
	return s
}

type CreateSimOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 支付宝小程序链接
	MiniappLink *string `json:"miniapp_link,omitempty" xml:"miniapp_link,omitempty"`
}

func (s CreateSimOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSimOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateSimOrderResponse) SetReqMsgId(v string) *CreateSimOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSimOrderResponse) SetResultCode(v string) *CreateSimOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSimOrderResponse) SetResultMsg(v string) *CreateSimOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateSimOrderResponse) SetOrderId(v string) *CreateSimOrderResponse {
	s.OrderId = &v
	return s
}

func (s *CreateSimOrderResponse) SetMiniappLink(v string) *CreateSimOrderResponse {
	s.MiniappLink = &v
	return s
}

type QuerySimOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QuerySimOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySimOrderRequest) GoString() string {
	return s.String()
}

func (s *QuerySimOrderRequest) SetAuthToken(v string) *QuerySimOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySimOrderRequest) SetProductInstanceId(v string) *QuerySimOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySimOrderRequest) SetDeviceId(v string) *QuerySimOrderRequest {
	s.DeviceId = &v
	return s
}

func (s *QuerySimOrderRequest) SetOrderId(v string) *QuerySimOrderRequest {
	s.OrderId = &v
	return s
}

func (s *QuerySimOrderRequest) SetToken(v string) *QuerySimOrderRequest {
	s.Token = &v
	return s
}

type QuerySimOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单信息，如果查无返回空对象
	OrderInfo *SimOrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty"`
	// 小程序链接
	MiniappLink *string `json:"miniapp_link,omitempty" xml:"miniapp_link,omitempty"`
}

func (s QuerySimOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySimOrderResponse) GoString() string {
	return s.String()
}

func (s *QuerySimOrderResponse) SetReqMsgId(v string) *QuerySimOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySimOrderResponse) SetResultCode(v string) *QuerySimOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySimOrderResponse) SetResultMsg(v string) *QuerySimOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySimOrderResponse) SetOrderInfo(v *SimOrderInfo) *QuerySimOrderResponse {
	s.OrderInfo = v
	return s
}

func (s *QuerySimOrderResponse) SetMiniappLink(v string) *QuerySimOrderResponse {
	s.MiniappLink = &v
	return s
}

type ListSimOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 请求的页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 单页项数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s ListSimOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s ListSimOrderRequest) GoString() string {
	return s.String()
}

func (s *ListSimOrderRequest) SetAuthToken(v string) *ListSimOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *ListSimOrderRequest) SetProductInstanceId(v string) *ListSimOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListSimOrderRequest) SetDeviceId(v string) *ListSimOrderRequest {
	s.DeviceId = &v
	return s
}

func (s *ListSimOrderRequest) SetPageNo(v int64) *ListSimOrderRequest {
	s.PageNo = &v
	return s
}

func (s *ListSimOrderRequest) SetPageSize(v int64) *ListSimOrderRequest {
	s.PageSize = &v
	return s
}

func (s *ListSimOrderRequest) SetToken(v string) *ListSimOrderRequest {
	s.Token = &v
	return s
}

type ListSimOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页器
	Paginator *Paginator `json:"paginator,omitempty" xml:"paginator,omitempty"`
	// 订单信息列表
	OrderInfoList []*SimOrderInfo `json:"order_info_list,omitempty" xml:"order_info_list,omitempty" type:"Repeated"`
}

func (s ListSimOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s ListSimOrderResponse) GoString() string {
	return s.String()
}

func (s *ListSimOrderResponse) SetReqMsgId(v string) *ListSimOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListSimOrderResponse) SetResultCode(v string) *ListSimOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *ListSimOrderResponse) SetResultMsg(v string) *ListSimOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListSimOrderResponse) SetPaginator(v *Paginator) *ListSimOrderResponse {
	s.Paginator = v
	return s
}

func (s *ListSimOrderResponse) SetOrderInfoList(v []*SimOrderInfo) *ListSimOrderResponse {
	s.OrderInfoList = v
	return s
}

type CancelSimOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s CancelSimOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelSimOrderRequest) GoString() string {
	return s.String()
}

func (s *CancelSimOrderRequest) SetAuthToken(v string) *CancelSimOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelSimOrderRequest) SetProductInstanceId(v string) *CancelSimOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelSimOrderRequest) SetDeviceId(v string) *CancelSimOrderRequest {
	s.DeviceId = &v
	return s
}

func (s *CancelSimOrderRequest) SetOrderId(v string) *CancelSimOrderRequest {
	s.OrderId = &v
	return s
}

func (s *CancelSimOrderRequest) SetToken(v string) *CancelSimOrderRequest {
	s.Token = &v
	return s
}

type CancelSimOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否取消成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 更新后订单信息，如果查无返回空对象
	OrderInfo *SimOrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty"`
}

func (s CancelSimOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelSimOrderResponse) GoString() string {
	return s.String()
}

func (s *CancelSimOrderResponse) SetReqMsgId(v string) *CancelSimOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelSimOrderResponse) SetResultCode(v string) *CancelSimOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelSimOrderResponse) SetResultMsg(v string) *CancelSimOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelSimOrderResponse) SetSuccess(v bool) *CancelSimOrderResponse {
	s.Success = &v
	return s
}

func (s *CancelSimOrderResponse) SetOrderInfo(v *SimOrderInfo) *CancelSimOrderResponse {
	s.OrderInfo = v
	return s
}

type PullSimSkuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求的页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 单页项数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PullSimSkuRequest) String() string {
	return tea.Prettify(s)
}

func (s PullSimSkuRequest) GoString() string {
	return s.String()
}

func (s *PullSimSkuRequest) SetAuthToken(v string) *PullSimSkuRequest {
	s.AuthToken = &v
	return s
}

func (s *PullSimSkuRequest) SetProductInstanceId(v string) *PullSimSkuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullSimSkuRequest) SetPageNo(v int64) *PullSimSkuRequest {
	s.PageNo = &v
	return s
}

func (s *PullSimSkuRequest) SetPageSize(v int64) *PullSimSkuRequest {
	s.PageSize = &v
	return s
}

type PullSimSkuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页器
	Paginator *Paginator `json:"paginator,omitempty" xml:"paginator,omitempty"`
	// 车辆SKU列表
	SkuInfoList []*SimSkuInfo `json:"sku_info_list,omitempty" xml:"sku_info_list,omitempty" type:"Repeated"`
}

func (s PullSimSkuResponse) String() string {
	return tea.Prettify(s)
}

func (s PullSimSkuResponse) GoString() string {
	return s.String()
}

func (s *PullSimSkuResponse) SetReqMsgId(v string) *PullSimSkuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullSimSkuResponse) SetResultCode(v string) *PullSimSkuResponse {
	s.ResultCode = &v
	return s
}

func (s *PullSimSkuResponse) SetResultMsg(v string) *PullSimSkuResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullSimSkuResponse) SetPaginator(v *Paginator) *PullSimSkuResponse {
	s.Paginator = v
	return s
}

func (s *PullSimSkuResponse) SetSkuInfoList(v []*SimSkuInfo) *PullSimSkuResponse {
	s.SkuInfoList = v
	return s
}

type ConfirmSimOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备id
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s ConfirmSimOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSimOrderRequest) GoString() string {
	return s.String()
}

func (s *ConfirmSimOrderRequest) SetAuthToken(v string) *ConfirmSimOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmSimOrderRequest) SetProductInstanceId(v string) *ConfirmSimOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmSimOrderRequest) SetDeviceId(v string) *ConfirmSimOrderRequest {
	s.DeviceId = &v
	return s
}

func (s *ConfirmSimOrderRequest) SetOrderId(v string) *ConfirmSimOrderRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmSimOrderRequest) SetToken(v string) *ConfirmSimOrderRequest {
	s.Token = &v
	return s
}

type ConfirmSimOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmSimOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSimOrderResponse) GoString() string {
	return s.String()
}

func (s *ConfirmSimOrderResponse) SetReqMsgId(v string) *ConfirmSimOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmSimOrderResponse) SetResultCode(v string) *ConfirmSimOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmSimOrderResponse) SetResultMsg(v string) *ConfirmSimOrderResponse {
	s.ResultMsg = &v
	return s
}

type UploadSimQrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 车型
	VehicleModel *string `json:"vehicle_model,omitempty" xml:"vehicle_model,omitempty" require:"true"`
	// 解析类型
	ParseType *string `json:"parse_type,omitempty" xml:"parse_type,omitempty" require:"true"`
	// base64后的图象数据
	Base64Data *string `json:"base64_data,omitempty" xml:"base64_data,omitempty" require:"true"`
}

func (s UploadSimQrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSimQrcodeRequest) GoString() string {
	return s.String()
}

func (s *UploadSimQrcodeRequest) SetAuthToken(v string) *UploadSimQrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetProductInstanceId(v string) *UploadSimQrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetDeviceId(v string) *UploadSimQrcodeRequest {
	s.DeviceId = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetToken(v string) *UploadSimQrcodeRequest {
	s.Token = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetVehicleModel(v string) *UploadSimQrcodeRequest {
	s.VehicleModel = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetParseType(v string) *UploadSimQrcodeRequest {
	s.ParseType = &v
	return s
}

func (s *UploadSimQrcodeRequest) SetBase64Data(v string) *UploadSimQrcodeRequest {
	s.Base64Data = &v
	return s
}

type UploadSimQrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解析后结果
	ParsedContent *string `json:"parsed_content,omitempty" xml:"parsed_content,omitempty"`
	// 非必填	json字符串，扩展预留
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s UploadSimQrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSimQrcodeResponse) GoString() string {
	return s.String()
}

func (s *UploadSimQrcodeResponse) SetReqMsgId(v string) *UploadSimQrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSimQrcodeResponse) SetResultCode(v string) *UploadSimQrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSimQrcodeResponse) SetResultMsg(v string) *UploadSimQrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSimQrcodeResponse) SetParsedContent(v string) *UploadSimQrcodeResponse {
	s.ParsedContent = &v
	return s
}

func (s *UploadSimQrcodeResponse) SetExtraInfo(v string) *UploadSimQrcodeResponse {
	s.ExtraInfo = &v
	return s
}

type QuerySpuListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 请求的页数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 单页项数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QuerySpuListRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySpuListRequest) GoString() string {
	return s.String()
}

func (s *QuerySpuListRequest) SetAuthToken(v string) *QuerySpuListRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySpuListRequest) SetProductInstanceId(v string) *QuerySpuListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySpuListRequest) SetDeviceId(v string) *QuerySpuListRequest {
	s.DeviceId = &v
	return s
}

func (s *QuerySpuListRequest) SetPageNo(v int64) *QuerySpuListRequest {
	s.PageNo = &v
	return s
}

func (s *QuerySpuListRequest) SetPageSize(v int64) *QuerySpuListRequest {
	s.PageSize = &v
	return s
}

func (s *QuerySpuListRequest) SetToken(v string) *QuerySpuListRequest {
	s.Token = &v
	return s
}

type QuerySpuListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SPU信息
	SpuInfoList []*SimSpuInfo `json:"spu_info_list,omitempty" xml:"spu_info_list,omitempty" type:"Repeated"`
	// 分页参数
	Paginator *Paginator `json:"paginator,omitempty" xml:"paginator,omitempty"`
}

func (s QuerySpuListResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySpuListResponse) GoString() string {
	return s.String()
}

func (s *QuerySpuListResponse) SetReqMsgId(v string) *QuerySpuListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySpuListResponse) SetResultCode(v string) *QuerySpuListResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySpuListResponse) SetResultMsg(v string) *QuerySpuListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySpuListResponse) SetSpuInfoList(v []*SimSpuInfo) *QuerySpuListResponse {
	s.SpuInfoList = v
	return s
}

func (s *QuerySpuListResponse) SetPaginator(v *Paginator) *QuerySpuListResponse {
	s.Paginator = v
	return s
}

type QueryLoginSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryLoginSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoginSignRequest) GoString() string {
	return s.String()
}

func (s *QueryLoginSignRequest) SetAuthToken(v string) *QueryLoginSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoginSignRequest) SetProductInstanceId(v string) *QueryLoginSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoginSignRequest) SetDeviceId(v string) *QueryLoginSignRequest {
	s.DeviceId = &v
	return s
}

func (s *QueryLoginSignRequest) SetToken(v string) *QueryLoginSignRequest {
	s.Token = &v
	return s
}

type QueryLoginSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 门店签约信息
	StoreInfo *SimStoreInfo `json:"store_info,omitempty" xml:"store_info,omitempty"`
}

func (s QueryLoginSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoginSignResponse) GoString() string {
	return s.String()
}

func (s *QueryLoginSignResponse) SetReqMsgId(v string) *QueryLoginSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoginSignResponse) SetResultCode(v string) *QueryLoginSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoginSignResponse) SetResultMsg(v string) *QueryLoginSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoginSignResponse) SetStoreInfo(v *SimStoreInfo) *QueryLoginSignResponse {
	s.StoreInfo = v
	return s
}

type ResetOrderLinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s ResetOrderLinkRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetOrderLinkRequest) GoString() string {
	return s.String()
}

func (s *ResetOrderLinkRequest) SetAuthToken(v string) *ResetOrderLinkRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetOrderLinkRequest) SetProductInstanceId(v string) *ResetOrderLinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetOrderLinkRequest) SetDeviceId(v string) *ResetOrderLinkRequest {
	s.DeviceId = &v
	return s
}

func (s *ResetOrderLinkRequest) SetOrderId(v string) *ResetOrderLinkRequest {
	s.OrderId = &v
	return s
}

func (s *ResetOrderLinkRequest) SetToken(v string) *ResetOrderLinkRequest {
	s.Token = &v
	return s
}

type ResetOrderLinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 小程序地址
	MiniappLink *string `json:"miniapp_link,omitempty" xml:"miniapp_link,omitempty"`
}

func (s ResetOrderLinkResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetOrderLinkResponse) GoString() string {
	return s.String()
}

func (s *ResetOrderLinkResponse) SetReqMsgId(v string) *ResetOrderLinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetOrderLinkResponse) SetResultCode(v string) *ResetOrderLinkResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetOrderLinkResponse) SetResultMsg(v string) *ResetOrderLinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetOrderLinkResponse) SetMiniappLink(v string) *ResetOrderLinkResponse {
	s.MiniappLink = &v
	return s
}

type UploadSimRiskdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备ID
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true"`
	// 登录态token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 上报类型
	UploadType *string `json:"upload_type,omitempty" xml:"upload_type,omitempty" require:"true"`
	// 智能中控id
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty"`
	// 中控照片，base64后的图象数据
	TuidPhoto *string `json:"tuid_photo,omitempty" xml:"tuid_photo,omitempty"`
	// 车架号
	FrameNo *string `json:"frame_no,omitempty" xml:"frame_no,omitempty"`
	// 车架号照片，base64后的图象数据
	FrameNoPhoto *string `json:"frame_no_photo,omitempty" xml:"frame_no_photo,omitempty"`
	// 人车合影（销售+用户），base64后的图象数据
	GroupPhoto *string `json:"group_photo,omitempty" xml:"group_photo,omitempty"`
	// 单据照片（发票/收据），base64后的图象数据
	BillPhoto *string `json:"bill_photo,omitempty" xml:"bill_photo,omitempty"`
	// 上牌照片，base64后的图象数据
	LicensePlatePhoto *string `json:"license_plate_photo,omitempty" xml:"license_plate_photo,omitempty"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s UploadSimRiskdataRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSimRiskdataRequest) GoString() string {
	return s.String()
}

func (s *UploadSimRiskdataRequest) SetAuthToken(v string) *UploadSimRiskdataRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetProductInstanceId(v string) *UploadSimRiskdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetDeviceId(v string) *UploadSimRiskdataRequest {
	s.DeviceId = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetToken(v string) *UploadSimRiskdataRequest {
	s.Token = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetUploadType(v string) *UploadSimRiskdataRequest {
	s.UploadType = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetTuid(v string) *UploadSimRiskdataRequest {
	s.Tuid = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetTuidPhoto(v string) *UploadSimRiskdataRequest {
	s.TuidPhoto = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetFrameNo(v string) *UploadSimRiskdataRequest {
	s.FrameNo = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetFrameNoPhoto(v string) *UploadSimRiskdataRequest {
	s.FrameNoPhoto = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetGroupPhoto(v string) *UploadSimRiskdataRequest {
	s.GroupPhoto = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetBillPhoto(v string) *UploadSimRiskdataRequest {
	s.BillPhoto = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetLicensePlatePhoto(v string) *UploadSimRiskdataRequest {
	s.LicensePlatePhoto = &v
	return s
}

func (s *UploadSimRiskdataRequest) SetOrderId(v string) *UploadSimRiskdataRequest {
	s.OrderId = &v
	return s
}

type UploadSimRiskdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串，扩展预留
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s UploadSimRiskdataResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSimRiskdataResponse) GoString() string {
	return s.String()
}

func (s *UploadSimRiskdataResponse) SetReqMsgId(v string) *UploadSimRiskdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSimRiskdataResponse) SetResultCode(v string) *UploadSimRiskdataResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSimRiskdataResponse) SetResultMsg(v string) *UploadSimRiskdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSimRiskdataResponse) SetExtraInfo(v string) *UploadSimRiskdataResponse {
	s.ExtraInfo = &v
	return s
}

type QueryDigitalkeyUserinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联合登录token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryDigitalkeyUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalkeyUserinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDigitalkeyUserinfoRequest) SetAuthToken(v string) *QueryDigitalkeyUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDigitalkeyUserinfoRequest) SetProductInstanceId(v string) *QueryDigitalkeyUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDigitalkeyUserinfoRequest) SetToken(v string) *QueryDigitalkeyUserinfoRequest {
	s.Token = &v
	return s
}

type QueryDigitalkeyUserinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户ID
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
	// 个人简介
	Introduction *string `json:"introduction,omitempty" xml:"introduction,omitempty"`
	// 用户昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 用户头像地址
	AvatarUrl *string `json:"avatar_url,omitempty" xml:"avatar_url,omitempty"`
	// 品牌ID
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty"`
}

func (s QueryDigitalkeyUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDigitalkeyUserinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDigitalkeyUserinfoResponse) SetReqMsgId(v string) *QueryDigitalkeyUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetResultCode(v string) *QueryDigitalkeyUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetResultMsg(v string) *QueryDigitalkeyUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetUid(v string) *QueryDigitalkeyUserinfoResponse {
	s.Uid = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetIntroduction(v string) *QueryDigitalkeyUserinfoResponse {
	s.Introduction = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetNickName(v string) *QueryDigitalkeyUserinfoResponse {
	s.NickName = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetAvatarUrl(v string) *QueryDigitalkeyUserinfoResponse {
	s.AvatarUrl = &v
	return s
}

func (s *QueryDigitalkeyUserinfoResponse) SetBrandId(v string) *QueryDigitalkeyUserinfoResponse {
	s.BrandId = &v
	return s
}

type QueryTwevPositionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能中控id
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
	// HQS（黑骑士）；ZHMAI（智迈）；MOFAQ（摩法圈）
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// json，扩展预留
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryTwevPositionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwevPositionRequest) GoString() string {
	return s.String()
}

func (s *QueryTwevPositionRequest) SetAuthToken(v string) *QueryTwevPositionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwevPositionRequest) SetProductInstanceId(v string) *QueryTwevPositionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwevPositionRequest) SetTuid(v string) *QueryTwevPositionRequest {
	s.Tuid = &v
	return s
}

func (s *QueryTwevPositionRequest) SetBrand(v string) *QueryTwevPositionRequest {
	s.Brand = &v
	return s
}

func (s *QueryTwevPositionRequest) SetExternInfo(v string) *QueryTwevPositionRequest {
	s.ExternInfo = &v
	return s
}

type QueryTwevPositionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经度
	Lng *string `json:"lng,omitempty" xml:"lng,omitempty"`
	// 纬度
	Lat *string `json:"lat,omitempty" xml:"lat,omitempty"`
	// 定位时间
	GpsTime *string `json:"gps_time,omitempty" xml:"gps_time,omitempty"`
	// json，扩展预留
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s QueryTwevPositionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwevPositionResponse) GoString() string {
	return s.String()
}

func (s *QueryTwevPositionResponse) SetReqMsgId(v string) *QueryTwevPositionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwevPositionResponse) SetResultCode(v string) *QueryTwevPositionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwevPositionResponse) SetResultMsg(v string) *QueryTwevPositionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwevPositionResponse) SetLng(v string) *QueryTwevPositionResponse {
	s.Lng = &v
	return s
}

func (s *QueryTwevPositionResponse) SetLat(v string) *QueryTwevPositionResponse {
	s.Lat = &v
	return s
}

func (s *QueryTwevPositionResponse) SetGpsTime(v string) *QueryTwevPositionResponse {
	s.GpsTime = &v
	return s
}

func (s *QueryTwevPositionResponse) SetExtraInfo(v string) *QueryTwevPositionResponse {
	s.ExtraInfo = &v
	return s
}

type OperateTwevSearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能中控id
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
	// HQS（黑骑士）；ZHMAI（智迈）；MOFAQ（摩法圈）
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// json，扩展预留
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s OperateTwevSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateTwevSearchRequest) GoString() string {
	return s.String()
}

func (s *OperateTwevSearchRequest) SetAuthToken(v string) *OperateTwevSearchRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateTwevSearchRequest) SetProductInstanceId(v string) *OperateTwevSearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateTwevSearchRequest) SetTuid(v string) *OperateTwevSearchRequest {
	s.Tuid = &v
	return s
}

func (s *OperateTwevSearchRequest) SetBrand(v string) *OperateTwevSearchRequest {
	s.Brand = &v
	return s
}

func (s *OperateTwevSearchRequest) SetExternInfo(v string) *OperateTwevSearchRequest {
	s.ExternInfo = &v
	return s
}

type OperateTwevSearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json，预留拓展
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s OperateTwevSearchResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateTwevSearchResponse) GoString() string {
	return s.String()
}

func (s *OperateTwevSearchResponse) SetReqMsgId(v string) *OperateTwevSearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateTwevSearchResponse) SetResultCode(v string) *OperateTwevSearchResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateTwevSearchResponse) SetResultMsg(v string) *OperateTwevSearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateTwevSearchResponse) SetExtraInfo(v string) *OperateTwevSearchResponse {
	s.ExtraInfo = &v
	return s
}

type OperateTwevPowerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能中控id
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
	// 品牌信息
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty" require:"true"`
	// 操作类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// json，扩展预留
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s OperateTwevPowerRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateTwevPowerRequest) GoString() string {
	return s.String()
}

func (s *OperateTwevPowerRequest) SetAuthToken(v string) *OperateTwevPowerRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateTwevPowerRequest) SetProductInstanceId(v string) *OperateTwevPowerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateTwevPowerRequest) SetTuid(v string) *OperateTwevPowerRequest {
	s.Tuid = &v
	return s
}

func (s *OperateTwevPowerRequest) SetBrand(v string) *OperateTwevPowerRequest {
	s.Brand = &v
	return s
}

func (s *OperateTwevPowerRequest) SetOperateType(v string) *OperateTwevPowerRequest {
	s.OperateType = &v
	return s
}

func (s *OperateTwevPowerRequest) SetExternInfo(v string) *OperateTwevPowerRequest {
	s.ExternInfo = &v
	return s
}

type OperateTwevPowerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异步任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// json，扩展预留
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s OperateTwevPowerResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateTwevPowerResponse) GoString() string {
	return s.String()
}

func (s *OperateTwevPowerResponse) SetReqMsgId(v string) *OperateTwevPowerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateTwevPowerResponse) SetResultCode(v string) *OperateTwevPowerResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateTwevPowerResponse) SetResultMsg(v string) *OperateTwevPowerResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateTwevPowerResponse) SetTaskId(v string) *OperateTwevPowerResponse {
	s.TaskId = &v
	return s
}

func (s *OperateTwevPowerResponse) SetExtraInfo(v string) *OperateTwevPowerResponse {
	s.ExtraInfo = &v
	return s
}

type QueryTwevTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID。和tuid二选一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 智能中控ID，和任务ID二选一
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty"`
	// json，扩展预留
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty" require:"true"`
}

func (s QueryTwevTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwevTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryTwevTaskRequest) SetAuthToken(v string) *QueryTwevTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwevTaskRequest) SetProductInstanceId(v string) *QueryTwevTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwevTaskRequest) SetTaskId(v string) *QueryTwevTaskRequest {
	s.TaskId = &v
	return s
}

func (s *QueryTwevTaskRequest) SetTuid(v string) *QueryTwevTaskRequest {
	s.Tuid = &v
	return s
}

func (s *QueryTwevTaskRequest) SetExternInfo(v string) *QueryTwevTaskRequest {
	s.ExternInfo = &v
	return s
}

type QueryTwevTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务结果
	TaskResult *string `json:"task_result,omitempty" xml:"task_result,omitempty"`
	// json，扩展预留
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s QueryTwevTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwevTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryTwevTaskResponse) SetReqMsgId(v string) *QueryTwevTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwevTaskResponse) SetResultCode(v string) *QueryTwevTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwevTaskResponse) SetResultMsg(v string) *QueryTwevTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwevTaskResponse) SetTaskResult(v string) *QueryTwevTaskResponse {
	s.TaskResult = &v
	return s
}

func (s *QueryTwevTaskResponse) SetExtraInfo(v string) *QueryTwevTaskResponse {
	s.ExtraInfo = &v
	return s
}

type ApplyDigitalkeyCredRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备类型
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty"`
	// 凭证类型
	CredType *string `json:"cred_type,omitempty" xml:"cred_type,omitempty"`
	// 需要生成的内容
	GenerateCode *string `json:"generate_code,omitempty" xml:"generate_code,omitempty"`
	// 客户身份ID
	SecretId *string `json:"secret_id,omitempty" xml:"secret_id,omitempty" require:"true"`
	// 设备SN号
	DeviceSn *string `json:"device_sn,omitempty" xml:"device_sn,omitempty"`
	// MAC地址
	Mac *string `json:"mac,omitempty" xml:"mac,omitempty"`
	// ble名称
	BleNme *string `json:"ble_nme,omitempty" xml:"ble_nme,omitempty" require:"true"`
	// 无感控车数据
	KeyLess *string `json:"key_less,omitempty" xml:"key_less,omitempty"`
	// 凭证格式
	FormatType *string `json:"format_type,omitempty" xml:"format_type,omitempty"`
	// 加密类型
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
	// 协议类型
	ProtocolType *string `json:"protocol_type,omitempty" xml:"protocol_type,omitempty"`
	// 品牌ID
	BrandId *string `json:"brand_id,omitempty" xml:"brand_id,omitempty" require:"true"`
	// IOT通道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
}

func (s ApplyDigitalkeyCredRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalkeyCredRequest) GoString() string {
	return s.String()
}

func (s *ApplyDigitalkeyCredRequest) SetAuthToken(v string) *ApplyDigitalkeyCredRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetProductInstanceId(v string) *ApplyDigitalkeyCredRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetDeviceType(v string) *ApplyDigitalkeyCredRequest {
	s.DeviceType = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetCredType(v string) *ApplyDigitalkeyCredRequest {
	s.CredType = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetGenerateCode(v string) *ApplyDigitalkeyCredRequest {
	s.GenerateCode = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetSecretId(v string) *ApplyDigitalkeyCredRequest {
	s.SecretId = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetDeviceSn(v string) *ApplyDigitalkeyCredRequest {
	s.DeviceSn = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetMac(v string) *ApplyDigitalkeyCredRequest {
	s.Mac = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetBleNme(v string) *ApplyDigitalkeyCredRequest {
	s.BleNme = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetKeyLess(v string) *ApplyDigitalkeyCredRequest {
	s.KeyLess = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetFormatType(v string) *ApplyDigitalkeyCredRequest {
	s.FormatType = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetEncType(v string) *ApplyDigitalkeyCredRequest {
	s.EncType = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetProtocolType(v string) *ApplyDigitalkeyCredRequest {
	s.ProtocolType = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetBrandId(v string) *ApplyDigitalkeyCredRequest {
	s.BrandId = &v
	return s
}

func (s *ApplyDigitalkeyCredRequest) SetChannel(v string) *ApplyDigitalkeyCredRequest {
	s.Channel = &v
	return s
}

type ApplyDigitalkeyCredResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证数据
	Cred *string `json:"cred,omitempty" xml:"cred,omitempty"`
}

func (s ApplyDigitalkeyCredResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDigitalkeyCredResponse) GoString() string {
	return s.String()
}

func (s *ApplyDigitalkeyCredResponse) SetReqMsgId(v string) *ApplyDigitalkeyCredResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDigitalkeyCredResponse) SetResultCode(v string) *ApplyDigitalkeyCredResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDigitalkeyCredResponse) SetResultMsg(v string) *ApplyDigitalkeyCredResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDigitalkeyCredResponse) SetCred(v string) *ApplyDigitalkeyCredResponse {
	s.Cred = &v
	return s
}

type InitDigitalkeyCorpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户code
	CorpCode *string `json:"corp_code,omitempty" xml:"corp_code,omitempty" require:"true"`
	// 客户名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商户pid
	Pid *string `json:"pid,omitempty" xml:"pid,omitempty"`
}

func (s InitDigitalkeyCorpRequest) String() string {
	return tea.Prettify(s)
}

func (s InitDigitalkeyCorpRequest) GoString() string {
	return s.String()
}

func (s *InitDigitalkeyCorpRequest) SetAuthToken(v string) *InitDigitalkeyCorpRequest {
	s.AuthToken = &v
	return s
}

func (s *InitDigitalkeyCorpRequest) SetProductInstanceId(v string) *InitDigitalkeyCorpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitDigitalkeyCorpRequest) SetCorpCode(v string) *InitDigitalkeyCorpRequest {
	s.CorpCode = &v
	return s
}

func (s *InitDigitalkeyCorpRequest) SetCorpName(v string) *InitDigitalkeyCorpRequest {
	s.CorpName = &v
	return s
}

func (s *InitDigitalkeyCorpRequest) SetProductCode(v string) *InitDigitalkeyCorpRequest {
	s.ProductCode = &v
	return s
}

func (s *InitDigitalkeyCorpRequest) SetPid(v string) *InitDigitalkeyCorpRequest {
	s.Pid = &v
	return s
}

type InitDigitalkeyCorpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户身份ID
	SecretId *string `json:"secret_id,omitempty" xml:"secret_id,omitempty"`
}

func (s InitDigitalkeyCorpResponse) String() string {
	return tea.Prettify(s)
}

func (s InitDigitalkeyCorpResponse) GoString() string {
	return s.String()
}

func (s *InitDigitalkeyCorpResponse) SetReqMsgId(v string) *InitDigitalkeyCorpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitDigitalkeyCorpResponse) SetResultCode(v string) *InitDigitalkeyCorpResponse {
	s.ResultCode = &v
	return s
}

func (s *InitDigitalkeyCorpResponse) SetResultMsg(v string) *InitDigitalkeyCorpResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitDigitalkeyCorpResponse) SetSecretId(v string) *InitDigitalkeyCorpResponse {
	s.SecretId = &v
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

type DeleteIifaaDigitalkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求头
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 业务参数
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
}

func (s DeleteIifaaDigitalkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteIifaaDigitalkeyRequest) GoString() string {
	return s.String()
}

func (s *DeleteIifaaDigitalkeyRequest) SetAuthToken(v string) *DeleteIifaaDigitalkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteIifaaDigitalkeyRequest) SetProductInstanceId(v string) *DeleteIifaaDigitalkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteIifaaDigitalkeyRequest) SetHead(v *RequestHead) *DeleteIifaaDigitalkeyRequest {
	s.Head = v
	return s
}

func (s *DeleteIifaaDigitalkeyRequest) SetRequest(v string) *DeleteIifaaDigitalkeyRequest {
	s.Request = &v
	return s
}

type DeleteIifaaDigitalkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteIifaaDigitalkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteIifaaDigitalkeyResponse) GoString() string {
	return s.String()
}

func (s *DeleteIifaaDigitalkeyResponse) SetReqMsgId(v string) *DeleteIifaaDigitalkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteIifaaDigitalkeyResponse) SetResultCode(v string) *DeleteIifaaDigitalkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteIifaaDigitalkeyResponse) SetResultMsg(v string) *DeleteIifaaDigitalkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteIifaaDigitalkeyResponse) SetData(v bool) *DeleteIifaaDigitalkeyResponse {
	s.Data = &v
	return s
}

type CheckOpticalIdentifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json数据，包含tenantId,sceneId,outBizId,fakeType,certType
	ReservedData *string `json:"reserved_data,omitempty" xml:"reserved_data,omitempty" require:"true"`
	// 图片链接,image_url和image_content 2选1优先选择image_content
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// base64编码的图片,image_url和image_content 2选1，优先选择image_content
	ImageContent *string `json:"image_content,omitempty" xml:"image_content,omitempty"`
	// raas产品码
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
}

func (s CheckOpticalIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckOpticalIdentifyRequest) GoString() string {
	return s.String()
}

func (s *CheckOpticalIdentifyRequest) SetAuthToken(v string) *CheckOpticalIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckOpticalIdentifyRequest) SetProductInstanceId(v string) *CheckOpticalIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckOpticalIdentifyRequest) SetReservedData(v string) *CheckOpticalIdentifyRequest {
	s.ReservedData = &v
	return s
}

func (s *CheckOpticalIdentifyRequest) SetImageUrl(v string) *CheckOpticalIdentifyRequest {
	s.ImageUrl = &v
	return s
}

func (s *CheckOpticalIdentifyRequest) SetImageContent(v string) *CheckOpticalIdentifyRequest {
	s.ImageContent = &v
	return s
}

func (s *CheckOpticalIdentifyRequest) SetRaasProducts(v string) *CheckOpticalIdentifyRequest {
	s.RaasProducts = &v
	return s
}

type CheckOpticalIdentifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 光鉴智能凭证响应结果
	Data *IdentityData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckOpticalIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckOpticalIdentifyResponse) GoString() string {
	return s.String()
}

func (s *CheckOpticalIdentifyResponse) SetReqMsgId(v string) *CheckOpticalIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckOpticalIdentifyResponse) SetResultCode(v string) *CheckOpticalIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckOpticalIdentifyResponse) SetResultMsg(v string) *CheckOpticalIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckOpticalIdentifyResponse) SetData(v *IdentityData) *CheckOpticalIdentifyResponse {
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
				"sdk_version":      tea.String("1.4.21"),
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
 * Description: 获取EKYT平台入驻的车队信息列表
 * Summary: 获取EKYT平台入驻的车队信息列表
 */
func (client *Client) ListDcp(request *ListDcpRequest) (_result *ListDcpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDcpResponse{}
	_body, _err := client.ListDcpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取EKYT平台入驻的车队信息列表
 * Summary: 获取EKYT平台入驻的车队信息列表
 */
func (client *Client) ListDcpEx(request *ListDcpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDcpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDcpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.dcp.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取EKYT平台入驻的司机灵工卡信息列表
 * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
 */
func (client *Client) ListDcpAccountbook(request *ListDcpAccountbookRequest) (_result *ListDcpAccountbookResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDcpAccountbookResponse{}
	_body, _err := client.ListDcpAccountbookEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取EKYT平台入驻的司机灵工卡信息列表
 * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
 */
func (client *Client) ListDcpAccountbookEx(request *ListDcpAccountbookRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDcpAccountbookResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDcpAccountbookResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.dcp.accountbook.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业ETC入驻车辆查询
 * Summary: 企业ETC入驻车辆查询
 */
func (client *Client) QueryEtcVehicle(request *QueryEtcVehicleRequest) (_result *QueryEtcVehicleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEtcVehicleResponse{}
	_body, _err := client.QueryEtcVehicleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业ETC入驻车辆查询
 * Summary: 企业ETC入驻车辆查询
 */
func (client *Client) QueryEtcVehicleEx(request *QueryEtcVehicleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEtcVehicleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEtcVehicleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.etc.vehicle.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业ETC运单上传
 * Summary: 企业ETC运单上传
 */
func (client *Client) UploadEtcWaybill(request *UploadEtcWaybillRequest) (_result *UploadEtcWaybillResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadEtcWaybillResponse{}
	_body, _err := client.UploadEtcWaybillEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业ETC运单上传
 * Summary: 企业ETC运单上传
 */
func (client *Client) UploadEtcWaybillEx(request *UploadEtcWaybillRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadEtcWaybillResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadEtcWaybillResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.etc.waybill.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业ETC车辆行程查询
 * Summary: 企业ETC车辆行程查询
 */
func (client *Client) QueryEtcTrip(request *QueryEtcTripRequest) (_result *QueryEtcTripResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEtcTripResponse{}
	_body, _err := client.QueryEtcTripEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业ETC车辆行程查询
 * Summary: 企业ETC车辆行程查询
 */
func (client *Client) QueryEtcTripEx(request *QueryEtcTripRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEtcTripResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEtcTripResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.etc.trip.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机获取授权登录地址
 * Summary: 两轮车一体机获取授权登录地址
 */
func (client *Client) InitSimLogin(request *InitSimLoginRequest) (_result *InitSimLoginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitSimLoginResponse{}
	_body, _err := client.InitSimLoginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机获取授权登录地址
 * Summary: 两轮车一体机获取授权登录地址
 */
func (client *Client) InitSimLoginEx(request *InitSimLoginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitSimLoginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitSimLoginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.login.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机查询登录结果
 * Summary: 两轮车一体机查询登录结果
 */
func (client *Client) QuerySimLogin(request *QuerySimLoginRequest) (_result *QuerySimLoginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySimLoginResponse{}
	_body, _err := client.QuerySimLoginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机查询登录结果
 * Summary: 两轮车一体机查询登录结果
 */
func (client *Client) QuerySimLoginEx(request *QuerySimLoginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySimLoginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySimLoginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.login.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机获取营销活动
 * Summary: 两轮车一体机获取营销活动
 */
func (client *Client) ListSimCampaign(request *ListSimCampaignRequest) (_result *ListSimCampaignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListSimCampaignResponse{}
	_body, _err := client.ListSimCampaignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机获取营销活动
 * Summary: 两轮车一体机获取营销活动
 */
func (client *Client) ListSimCampaignEx(request *ListSimCampaignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListSimCampaignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListSimCampaignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.campaign.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机查询车辆SKU
 * Summary: 两轮车一体机查询车辆SKU
 */
func (client *Client) QuerySimSku(request *QuerySimSkuRequest) (_result *QuerySimSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySimSkuResponse{}
	_body, _err := client.QuerySimSkuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机查询车辆SKU
 * Summary: 两轮车一体机查询车辆SKU
 */
func (client *Client) QuerySimSkuEx(request *QuerySimSkuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySimSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySimSkuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.sku.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机列举车辆SKU
 * Summary: 两轮车一体机列举车辆SKU
 */
func (client *Client) ListSimSku(request *ListSimSkuRequest) (_result *ListSimSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListSimSkuResponse{}
	_body, _err := client.ListSimSkuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机列举车辆SKU
 * Summary: 两轮车一体机列举车辆SKU
 */
func (client *Client) ListSimSkuEx(request *ListSimSkuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListSimSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListSimSkuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.sku.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机创建订单信息
 * Summary: 两轮车一体机创建订单信息
 */
func (client *Client) CreateSimOrder(request *CreateSimOrderRequest) (_result *CreateSimOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSimOrderResponse{}
	_body, _err := client.CreateSimOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机创建订单信息
 * Summary: 两轮车一体机创建订单信息
 */
func (client *Client) CreateSimOrderEx(request *CreateSimOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSimOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSimOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机查询订单信息
 * Summary: 两轮车一体机查询订单信息
 */
func (client *Client) QuerySimOrder(request *QuerySimOrderRequest) (_result *QuerySimOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySimOrderResponse{}
	_body, _err := client.QuerySimOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机查询订单信息
 * Summary: 两轮车一体机查询订单信息
 */
func (client *Client) QuerySimOrderEx(request *QuerySimOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySimOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySimOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机列举订单信息
 * Summary: 两轮车一体机列举订单信息
 */
func (client *Client) ListSimOrder(request *ListSimOrderRequest) (_result *ListSimOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListSimOrderResponse{}
	_body, _err := client.ListSimOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机列举订单信息
 * Summary: 两轮车一体机列举订单信息
 */
func (client *Client) ListSimOrderEx(request *ListSimOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListSimOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListSimOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.order.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机取消订单信息
 * Summary: 两轮车一体机取消订单信息
 */
func (client *Client) CancelSimOrder(request *CancelSimOrderRequest) (_result *CancelSimOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelSimOrderResponse{}
	_body, _err := client.CancelSimOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机取消订单信息
 * Summary: 两轮车一体机取消订单信息
 */
func (client *Client) CancelSimOrderEx(request *CancelSimOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelSimOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelSimOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.order.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机拉取车辆SKU
 * Summary: 两轮车一体机拉取车辆SKU
 */
func (client *Client) PullSimSku(request *PullSimSkuRequest) (_result *PullSimSkuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullSimSkuResponse{}
	_body, _err := client.PullSimSkuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机拉取车辆SKU
 * Summary: 两轮车一体机拉取车辆SKU
 */
func (client *Client) PullSimSkuEx(request *PullSimSkuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullSimSkuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullSimSkuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.sku.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 一体机购车订单支付确认请求
 * Summary: 一体机购车订单支付确认请求
 */
func (client *Client) ConfirmSimOrder(request *ConfirmSimOrderRequest) (_result *ConfirmSimOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmSimOrderResponse{}
	_body, _err := client.ConfirmSimOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 一体机购车订单支付确认请求
 * Summary: 一体机购车订单支付确认请求
 */
func (client *Client) ConfirmSimOrderEx(request *ConfirmSimOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmSimOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmSimOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.order.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 门店一体机车辆码上传解析接口
 * Summary: 门店一体机车辆码上传解析接口
 */
func (client *Client) UploadSimQrcode(request *UploadSimQrcodeRequest) (_result *UploadSimQrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSimQrcodeResponse{}
	_body, _err := client.UploadSimQrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 门店一体机车辆码上传解析接口
 * Summary: 门店一体机车辆码上传解析接口
 */
func (client *Client) UploadSimQrcodeEx(request *UploadSimQrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSimQrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSimQrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.qrcode.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询spu列表
 * Summary: 两轮车一体机列举车辆SPU
 */
func (client *Client) QuerySpuList(request *QuerySpuListRequest) (_result *QuerySpuListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySpuListResponse{}
	_body, _err := client.QuerySpuListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询spu列表
 * Summary: 两轮车一体机列举车辆SPU
 */
func (client *Client) QuerySpuListEx(request *QuerySpuListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySpuListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySpuListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.spu.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 两轮车一体机轮询门店签约结果
 * Summary: 两轮车一体机轮询门店签约结果
 */
func (client *Client) QueryLoginSign(request *QueryLoginSignRequest) (_result *QueryLoginSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoginSignResponse{}
	_body, _err := client.QueryLoginSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 两轮车一体机轮询门店签约结果
 * Summary: 两轮车一体机轮询门店签约结果
 */
func (client *Client) QueryLoginSignEx(request *QueryLoginSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoginSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoginSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.login.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 刷新订单链接
 * Summary: 刷新订单链接
 */
func (client *Client) ResetOrderLink(request *ResetOrderLinkRequest) (_result *ResetOrderLinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetOrderLinkResponse{}
	_body, _err := client.ResetOrderLinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 刷新订单链接
 * Summary: 刷新订单链接
 */
func (client *Client) ResetOrderLinkEx(request *ResetOrderLinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetOrderLinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetOrderLinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.order.link.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 一体机风控信息上传接口
 * Summary: 一体机风控信息上传接口
 */
func (client *Client) UploadSimRiskdata(request *UploadSimRiskdataRequest) (_result *UploadSimRiskdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSimRiskdataResponse{}
	_body, _err := client.UploadSimRiskdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 一体机风控信息上传接口
 * Summary: 一体机风控信息上传接口
 */
func (client *Client) UploadSimRiskdataEx(request *UploadSimRiskdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSimRiskdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadSimRiskdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.sim.riskdata.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字钥匙通过联登TOKEN获取用户信息
 * Summary: 数字钥匙通过联登TOKEN获取用户信息
 */
func (client *Client) QueryDigitalkeyUserinfo(request *QueryDigitalkeyUserinfoRequest) (_result *QueryDigitalkeyUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDigitalkeyUserinfoResponse{}
	_body, _err := client.QueryDigitalkeyUserinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字钥匙通过联登TOKEN获取用户信息
 * Summary: 数字钥匙通过联登TOKEN获取用户信息
 */
func (client *Client) QueryDigitalkeyUserinfoEx(request *QueryDigitalkeyUserinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDigitalkeyUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDigitalkeyUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.digitalkey.userinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车辆gps定位查询接口
 * Summary: 车辆gps定位查询接口
 */
func (client *Client) QueryTwevPosition(request *QueryTwevPositionRequest) (_result *QueryTwevPositionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTwevPositionResponse{}
	_body, _err := client.QueryTwevPositionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车辆gps定位查询接口
 * Summary: 车辆gps定位查询接口
 */
func (client *Client) QueryTwevPositionEx(request *QueryTwevPositionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTwevPositionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwevPositionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.twev.position.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 寻车鸣笛
 * Summary: 寻车鸣笛
 */
func (client *Client) OperateTwevSearch(request *OperateTwevSearchRequest) (_result *OperateTwevSearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateTwevSearchResponse{}
	_body, _err := client.OperateTwevSearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 寻车鸣笛
 * Summary: 寻车鸣笛
 */
func (client *Client) OperateTwevSearchEx(request *OperateTwevSearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateTwevSearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateTwevSearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.twev.search.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 二轮车锁车/解锁
 * Summary: 二轮车锁车/解锁
 */
func (client *Client) OperateTwevPower(request *OperateTwevPowerRequest) (_result *OperateTwevPowerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateTwevPowerResponse{}
	_body, _err := client.OperateTwevPowerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 二轮车锁车/解锁
 * Summary: 二轮车锁车/解锁
 */
func (client *Client) OperateTwevPowerEx(request *OperateTwevPowerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateTwevPowerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateTwevPowerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.twev.power.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 二轮车异步任务结果查询
 * Summary: 二轮车异步任务结果查询
 */
func (client *Client) QueryTwevTask(request *QueryTwevTaskRequest) (_result *QueryTwevTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTwevTaskResponse{}
	_body, _err := client.QueryTwevTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 二轮车异步任务结果查询
 * Summary: 二轮车异步任务结果查询
 */
func (client *Client) QueryTwevTaskEx(request *QueryTwevTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTwevTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwevTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.twev.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数字钥匙设备凭证数据申请
 * Summary: 数字钥匙设备凭证数据申请
 */
func (client *Client) ApplyDigitalkeyCred(request *ApplyDigitalkeyCredRequest) (_result *ApplyDigitalkeyCredResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDigitalkeyCredResponse{}
	_body, _err := client.ApplyDigitalkeyCredEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数字钥匙设备凭证数据申请
 * Summary: 数字钥匙设备凭证数据申请
 */
func (client *Client) ApplyDigitalkeyCredEx(request *ApplyDigitalkeyCredRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDigitalkeyCredResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDigitalkeyCredResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.digitalkey.cred.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户信息初始化
 * Summary: 客户信息初始化
 */
func (client *Client) InitDigitalkeyCorp(request *InitDigitalkeyCorpRequest) (_result *InitDigitalkeyCorpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitDigitalkeyCorpResponse{}
	_body, _err := client.InitDigitalkeyCorpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户信息初始化
 * Summary: 客户信息初始化
 */
func (client *Client) InitDigitalkeyCorpEx(request *InitDigitalkeyCorpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitDigitalkeyCorpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitDigitalkeyCorpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.digitalkey.corp.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 开放给设备产商，删除数字钥匙
 * Summary: 删除数字钥匙
 */
func (client *Client) DeleteIifaaDigitalkey(request *DeleteIifaaDigitalkeyRequest) (_result *DeleteIifaaDigitalkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteIifaaDigitalkeyResponse{}
	_body, _err := client.DeleteIifaaDigitalkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开放给设备产商，删除数字钥匙
 * Summary: 删除数字钥匙
 */
func (client *Client) DeleteIifaaDigitalkeyEx(request *DeleteIifaaDigitalkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteIifaaDigitalkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteIifaaDigitalkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.digitalkey.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 光鉴智能凭证
 * Summary: 光鉴智能凭证
 */
func (client *Client) CheckOpticalIdentify(request *CheckOpticalIdentifyRequest) (_result *CheckOpticalIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckOpticalIdentifyResponse{}
	_body, _err := client.CheckOpticalIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 光鉴智能凭证
 * Summary: 光鉴智能凭证
 */
func (client *Client) CheckOpticalIdentifyEx(request *CheckOpticalIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckOpticalIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckOpticalIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.optical.identify.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
