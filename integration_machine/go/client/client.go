// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 场所信息
type SceneInfo struct {
	// 场所名称
	SceneName *string `json:"scene_name,omitempty" xml:"scene_name,omitempty"`
	// 场所码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
}

func (s SceneInfo) String() string {
	return tea.Prettify(s)
}

func (s SceneInfo) GoString() string {
	return s.String()
}

func (s *SceneInfo) SetSceneName(v string) *SceneInfo {
	s.SceneName = &v
	return s
}

func (s *SceneInfo) SetSceneCode(v string) *SceneInfo {
	s.SceneCode = &v
	return s
}

// 行程信息
type TravelInfo struct {
	// 行程码信息
	// 1:没去过疫情区，绿码;
	// 2:去过疫情区，红码;
	// 3:其他，黄码;
	// 0:行程信息不全;
	// -1:查询失败
	TravelCode *string `json:"travel_code,omitempty" xml:"travel_code,omitempty"`
	// 行程码异常原因
	TravelFactor *string `json:"travel_factor,omitempty" xml:"travel_factor,omitempty"`
}

func (s TravelInfo) String() string {
	return tea.Prettify(s)
}

func (s TravelInfo) GoString() string {
	return s.String()
}

func (s *TravelInfo) SetTravelCode(v string) *TravelInfo {
	s.TravelCode = &v
	return s
}

func (s *TravelInfo) SetTravelFactor(v string) *TravelInfo {
	s.TravelFactor = &v
	return s
}

// 抗原信息
type AntigenInfo struct {
	// 抗原检测状态
	AntigenResult *string `json:"antigen_result,omitempty" xml:"antigen_result,omitempty"`
	// 抗原检测时间戳
	AntigenTimestamp *int64 `json:"antigen_timestamp,omitempty" xml:"antigen_timestamp,omitempty"`
}

func (s AntigenInfo) String() string {
	return tea.Prettify(s)
}

func (s AntigenInfo) GoString() string {
	return s.String()
}

func (s *AntigenInfo) SetAntigenResult(v string) *AntigenInfo {
	s.AntigenResult = &v
	return s
}

func (s *AntigenInfo) SetAntigenTimestamp(v int64) *AntigenInfo {
	s.AntigenTimestamp = &v
	return s
}

// 核酸信息
type NucleicAcidInfo struct {
	// 检测类型
	ReportType *string `json:"report_type,omitempty" xml:"report_type,omitempty"`
	// 检测结果
	ReportResult *string `json:"report_result,omitempty" xml:"report_result,omitempty"`
	// 检测机构
	ReportOrganization *string `json:"report_organization,omitempty" xml:"report_organization,omitempty"`
	// 检测时间戳(单位: ms)
	ReportTimestamp *int64 `json:"report_timestamp,omitempty" xml:"report_timestamp,omitempty"`
}

func (s NucleicAcidInfo) String() string {
	return tea.Prettify(s)
}

func (s NucleicAcidInfo) GoString() string {
	return s.String()
}

func (s *NucleicAcidInfo) SetReportType(v string) *NucleicAcidInfo {
	s.ReportType = &v
	return s
}

func (s *NucleicAcidInfo) SetReportResult(v string) *NucleicAcidInfo {
	s.ReportResult = &v
	return s
}

func (s *NucleicAcidInfo) SetReportOrganization(v string) *NucleicAcidInfo {
	s.ReportOrganization = &v
	return s
}

func (s *NucleicAcidInfo) SetReportTimestamp(v int64) *NucleicAcidInfo {
	s.ReportTimestamp = &v
	return s
}

// 疫苗接种信息
type VaccinationInfo struct {
	// 疫苗接种信息：
	// 0:查询失败
	// 1:未接种
	// 2:已接种一针
	// 3:完成接种
	VaccinationCode *string `json:"vaccination_code,omitempty" xml:"vaccination_code,omitempty"`
	// 疫苗接种信息
	VaccinationDesc *string `json:"vaccination_desc,omitempty" xml:"vaccination_desc,omitempty"`
	// 疫苗接种时间戳（单位：ms）
	VaccinationTimestamp *int64 `json:"vaccination_timestamp,omitempty" xml:"vaccination_timestamp,omitempty"`
}

func (s VaccinationInfo) String() string {
	return tea.Prettify(s)
}

func (s VaccinationInfo) GoString() string {
	return s.String()
}

func (s *VaccinationInfo) SetVaccinationCode(v string) *VaccinationInfo {
	s.VaccinationCode = &v
	return s
}

func (s *VaccinationInfo) SetVaccinationDesc(v string) *VaccinationInfo {
	s.VaccinationDesc = &v
	return s
}

func (s *VaccinationInfo) SetVaccinationTimestamp(v int64) *VaccinationInfo {
	s.VaccinationTimestamp = &v
	return s
}

// 抗原信息
type AntigenInformation struct {
	// 抗原结果
	AntigenResult *string `json:"antigen_result,omitempty" xml:"antigen_result,omitempty" require:"true"`
	// 抗原时间
	AntigenTime *string `json:"antigen_time,omitempty" xml:"antigen_time,omitempty" require:"true"`
}

func (s AntigenInformation) String() string {
	return tea.Prettify(s)
}

func (s AntigenInformation) GoString() string {
	return s.String()
}

func (s *AntigenInformation) SetAntigenResult(v string) *AntigenInformation {
	s.AntigenResult = &v
	return s
}

func (s *AntigenInformation) SetAntigenTime(v string) *AntigenInformation {
	s.AntigenTime = &v
	return s
}

// 核酸信息
type NucleicAcidInformation struct {
	// 核酸结果
	NucleicAcidResult *string `json:"nucleic_acid_result,omitempty" xml:"nucleic_acid_result,omitempty" require:"true"`
	// 核酸时间
	NucleicAcidTime *string `json:"nucleic_acid_time,omitempty" xml:"nucleic_acid_time,omitempty" require:"true"`
}

func (s NucleicAcidInformation) String() string {
	return tea.Prettify(s)
}

func (s NucleicAcidInformation) GoString() string {
	return s.String()
}

func (s *NucleicAcidInformation) SetNucleicAcidResult(v string) *NucleicAcidInformation {
	s.NucleicAcidResult = &v
	return s
}

func (s *NucleicAcidInformation) SetNucleicAcidTime(v string) *NucleicAcidInformation {
	s.NucleicAcidTime = &v
	return s
}

// 疫苗信息
type VaccinationInformation struct {
	// 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
	VaccinationStatus *string `json:"vaccination_status,omitempty" xml:"vaccination_status,omitempty" require:"true"`
	// 疫苗接种时间
	VaccinationTime *string `json:"vaccination_time,omitempty" xml:"vaccination_time,omitempty" require:"true"`
}

func (s VaccinationInformation) String() string {
	return tea.Prettify(s)
}

func (s VaccinationInformation) GoString() string {
	return s.String()
}

func (s *VaccinationInformation) SetVaccinationStatus(v string) *VaccinationInformation {
	s.VaccinationStatus = &v
	return s
}

func (s *VaccinationInformation) SetVaccinationTime(v string) *VaccinationInformation {
	s.VaccinationTime = &v
	return s
}

// 设备参数名称/key/value
type ArgsNameValue struct {
	// 设备参数名称
	ArgsName *string `json:"args_name,omitempty" xml:"args_name,omitempty"`
	// 设备参数key
	ArgsKey *string `json:"args_key,omitempty" xml:"args_key,omitempty" require:"true"`
	// 设备参数value
	ArgsValue *string `json:"args_value,omitempty" xml:"args_value,omitempty" require:"true"`
	// 设备参数标识(ip,mac,bizid)
	ArgsMark *string `json:"args_mark,omitempty" xml:"args_mark,omitempty"`
}

func (s ArgsNameValue) String() string {
	return tea.Prettify(s)
}

func (s ArgsNameValue) GoString() string {
	return s.String()
}

func (s *ArgsNameValue) SetArgsName(v string) *ArgsNameValue {
	s.ArgsName = &v
	return s
}

func (s *ArgsNameValue) SetArgsKey(v string) *ArgsNameValue {
	s.ArgsKey = &v
	return s
}

func (s *ArgsNameValue) SetArgsValue(v string) *ArgsNameValue {
	s.ArgsValue = &v
	return s
}

func (s *ArgsNameValue) SetArgsMark(v string) *ArgsNameValue {
	s.ArgsMark = &v
	return s
}

// 场所信息
type SceneInformation struct {
	// 场所地址
	SceneAddress *string `json:"scene_address,omitempty" xml:"scene_address,omitempty" require:"true"`
	// 场所ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s SceneInformation) String() string {
	return tea.Prettify(s)
}

func (s SceneInformation) GoString() string {
	return s.String()
}

func (s *SceneInformation) SetSceneAddress(v string) *SceneInformation {
	s.SceneAddress = &v
	return s
}

func (s *SceneInformation) SetSceneId(v string) *SceneInformation {
	s.SceneId = &v
	return s
}

// 通行记录
type HealthInfoLog struct {
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
	HealthCode *string `json:"health_code,omitempty" xml:"health_code,omitempty" require:"true"`
	// 行程信息
	//
	TravelInfo *TravelInfo `json:"travel_info,omitempty" xml:"travel_info,omitempty" require:"true"`
	// 核酸信息
	//
	NucleicAcidInfo *NucleicAcidInfo `json:"nucleic_acid_info,omitempty" xml:"nucleic_acid_info,omitempty" require:"true"`
	// 疫苗信息
	//
	VaccinationInfo *VaccinationInfo `json:"vaccination_info,omitempty" xml:"vaccination_info,omitempty" require:"true"`
	// 抗原信息
	//
	AntigenInfo *AntigenInfo `json:"antigen_info,omitempty" xml:"antigen_info,omitempty" require:"true"`
	// 场所信息
	//
	SceneInfo *SceneInfo `json:"scene_info,omitempty" xml:"scene_info,omitempty" require:"true"`
	// 数据源通行状态 0:禁止通行,1:允许通行
	//
	ChannelPassState *string `json:"channel_pass_state,omitempty" xml:"channel_pass_state,omitempty" require:"true"`
	// 经度
	//
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty" require:"true"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty" require:"true"`
	// 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸）
	//
	PassMode *string `json:"pass_mode,omitempty" xml:"pass_mode,omitempty" require:"true"`
	// 通行时长(单位:毫秒)
	//
	PassDuration *string `json:"pass_duration,omitempty" xml:"pass_duration,omitempty" require:"true"`
	// 通行时间
	//
	PassTime *string `json:"pass_time,omitempty" xml:"pass_time,omitempty" require:"true"`
	// 通行结果(0:禁止通行,1:允许通行)
	//
	PassResult *string `json:"pass_result,omitempty" xml:"pass_result,omitempty" require:"true"`
}

func (s HealthInfoLog) String() string {
	return tea.Prettify(s)
}

func (s HealthInfoLog) GoString() string {
	return s.String()
}

func (s *HealthInfoLog) SetCertNo(v string) *HealthInfoLog {
	s.CertNo = &v
	return s
}

func (s *HealthInfoLog) SetCertName(v string) *HealthInfoLog {
	s.CertName = &v
	return s
}

func (s *HealthInfoLog) SetHealthCode(v string) *HealthInfoLog {
	s.HealthCode = &v
	return s
}

func (s *HealthInfoLog) SetTravelInfo(v *TravelInfo) *HealthInfoLog {
	s.TravelInfo = v
	return s
}

func (s *HealthInfoLog) SetNucleicAcidInfo(v *NucleicAcidInfo) *HealthInfoLog {
	s.NucleicAcidInfo = v
	return s
}

func (s *HealthInfoLog) SetVaccinationInfo(v *VaccinationInfo) *HealthInfoLog {
	s.VaccinationInfo = v
	return s
}

func (s *HealthInfoLog) SetAntigenInfo(v *AntigenInfo) *HealthInfoLog {
	s.AntigenInfo = v
	return s
}

func (s *HealthInfoLog) SetSceneInfo(v *SceneInfo) *HealthInfoLog {
	s.SceneInfo = v
	return s
}

func (s *HealthInfoLog) SetChannelPassState(v string) *HealthInfoLog {
	s.ChannelPassState = &v
	return s
}

func (s *HealthInfoLog) SetLongitude(v string) *HealthInfoLog {
	s.Longitude = &v
	return s
}

func (s *HealthInfoLog) SetLatitude(v string) *HealthInfoLog {
	s.Latitude = &v
	return s
}

func (s *HealthInfoLog) SetPassMode(v string) *HealthInfoLog {
	s.PassMode = &v
	return s
}

func (s *HealthInfoLog) SetPassDuration(v string) *HealthInfoLog {
	s.PassDuration = &v
	return s
}

func (s *HealthInfoLog) SetPassTime(v string) *HealthInfoLog {
	s.PassTime = &v
	return s
}

func (s *HealthInfoLog) SetPassResult(v string) *HealthInfoLog {
	s.PassResult = &v
	return s
}

// 健康码信息
type HealthInfo struct {
	// 健康码编码：
	// 1:绿色 ，
	// 2:黄色 ，
	// 3:红色 ，
	// 4.灰码 。
	HealthCode *string `json:"health_code,omitempty" xml:"health_code,omitempty"`
	// 健康码红色原因
	HealthFactor *string `json:"health_factor,omitempty" xml:"health_factor,omitempty"`
}

func (s HealthInfo) String() string {
	return tea.Prettify(s)
}

func (s HealthInfo) GoString() string {
	return s.String()
}

func (s *HealthInfo) SetHealthCode(v string) *HealthInfo {
	s.HealthCode = &v
	return s
}

func (s *HealthInfo) SetHealthFactor(v string) *HealthInfo {
	s.HealthFactor = &v
	return s
}

// 行程信息
type TravelInformation struct {
	// 1:没去过疫情区，绿码;
	// 2:去过疫情区，红码;
	// 3:其他，黄码;
	// 0:行程信息不全;
	// -1查询失败
	TravelCode *string `json:"travel_code,omitempty" xml:"travel_code,omitempty" require:"true"`
	// 行程途径地
	TravelPath *string `json:"travel_path,omitempty" xml:"travel_path,omitempty" require:"true"`
}

func (s TravelInformation) String() string {
	return tea.Prettify(s)
}

func (s TravelInformation) GoString() string {
	return s.String()
}

func (s *TravelInformation) SetTravelCode(v string) *TravelInformation {
	s.TravelCode = &v
	return s
}

func (s *TravelInformation) SetTravelPath(v string) *TravelInformation {
	s.TravelPath = &v
	return s
}

type QueryHealthinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SN
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 被查询人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 被查询人身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 防疫信息类型,枚举值如下：
	// 健康信息 health ,
	// 疫苗信息 vaccination ,
	// 核酸信息 nucleicAcid ,
	// 行程信息 travel ,
	// 抗原信息 antigen ,
	// 场景信息  scene .
	// 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
	HealthTypes *string `json:"health_types,omitempty" xml:"health_types,omitempty" require:"true"`
	// 通行记录ID
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty"`
}

func (s QueryHealthinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryHealthinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryHealthinfoRequest) SetAuthToken(v string) *QueryHealthinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryHealthinfoRequest) SetProductInstanceId(v string) *QueryHealthinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryHealthinfoRequest) SetSerialNo(v string) *QueryHealthinfoRequest {
	s.SerialNo = &v
	return s
}

func (s *QueryHealthinfoRequest) SetCorpName(v string) *QueryHealthinfoRequest {
	s.CorpName = &v
	return s
}

func (s *QueryHealthinfoRequest) SetName(v string) *QueryHealthinfoRequest {
	s.Name = &v
	return s
}

func (s *QueryHealthinfoRequest) SetCertNo(v string) *QueryHealthinfoRequest {
	s.CertNo = &v
	return s
}

func (s *QueryHealthinfoRequest) SetHealthTypes(v string) *QueryHealthinfoRequest {
	s.HealthTypes = &v
	return s
}

func (s *QueryHealthinfoRequest) SetPassId(v string) *QueryHealthinfoRequest {
	s.PassId = &v
	return s
}

type QueryHealthinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 健康信息
	HealthInfo *HealthInfo `json:"health_info,omitempty" xml:"health_info,omitempty"`
	// 核酸信息
	NucleicAcidInfo *NucleicAcidInfo `json:"nucleic_acid_info,omitempty" xml:"nucleic_acid_info,omitempty"`
	// 行程信息
	//
	TravelInfo *TravelInfo `json:"travel_info,omitempty" xml:"travel_info,omitempty"`
	// 疫苗接种信息
	VaccinationInfo *VaccinationInfo `json:"vaccination_info,omitempty" xml:"vaccination_info,omitempty"`
	// 抗原信息
	AntigenInfo *AntigenInfo `json:"antigen_info,omitempty" xml:"antigen_info,omitempty"`
	// 场所信息
	SceneInfo *SceneInfo `json:"scene_info,omitempty" xml:"scene_info,omitempty"`
	// 通行记录ID
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty"`
}

func (s QueryHealthinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryHealthinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryHealthinfoResponse) SetReqMsgId(v string) *QueryHealthinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryHealthinfoResponse) SetResultCode(v string) *QueryHealthinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryHealthinfoResponse) SetResultMsg(v string) *QueryHealthinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryHealthinfoResponse) SetHealthInfo(v *HealthInfo) *QueryHealthinfoResponse {
	s.HealthInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetNucleicAcidInfo(v *NucleicAcidInfo) *QueryHealthinfoResponse {
	s.NucleicAcidInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetTravelInfo(v *TravelInfo) *QueryHealthinfoResponse {
	s.TravelInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetVaccinationInfo(v *VaccinationInfo) *QueryHealthinfoResponse {
	s.VaccinationInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetAntigenInfo(v *AntigenInfo) *QueryHealthinfoResponse {
	s.AntigenInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetSceneInfo(v *SceneInfo) *QueryHealthinfoResponse {
	s.SceneInfo = v
	return s
}

func (s *QueryHealthinfoResponse) SetPassId(v string) *QueryHealthinfoResponse {
	s.PassId = &v
	return s
}

type PushHealthinfologRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 通行记录ID
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty" require:"true"`
	// 设备SN
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 设备厂商
	//
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 通行时长(ms)
	CostTime *int64 `json:"cost_time,omitempty" xml:"cost_time,omitempty" require:"true"`
	// 通行结果
	PassResult *string `json:"pass_result,omitempty" xml:"pass_result,omitempty"`
	// 被查询人姓名
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 被查询人身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 异常类型
	ErrorType *string `json:"error_type,omitempty" xml:"error_type,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 体温
	Temperature *string `json:"temperature,omitempty" xml:"temperature,omitempty"`
	// 健康信息
	HealthInfo *HealthInfo `json:"health_info,omitempty" xml:"health_info,omitempty"`
	// 核酸信息
	NucleicAcidInfo *NucleicAcidInfo `json:"nucleic_acid_info,omitempty" xml:"nucleic_acid_info,omitempty"`
	// 行程信息
	//
	TravelInfo *TravelInfo `json:"travel_info,omitempty" xml:"travel_info,omitempty"`
	// 疫苗接种信息
	VaccinationInfo *VaccinationInfo `json:"vaccination_info,omitempty" xml:"vaccination_info,omitempty"`
	// 抗原信息
	AntigenInfo *AntigenInfo `json:"antigen_info,omitempty" xml:"antigen_info,omitempty"`
	// 场所信息
	//
	SceneInfo *SceneInfo `json:"scene_info,omitempty" xml:"scene_info,omitempty"`
	// 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
	PassMode *string `json:"pass_mode,omitempty" xml:"pass_mode,omitempty"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 数据源通行状态 0:禁止通行,1:允许通行
	ChannelPassState *string `json:"channel_pass_state,omitempty" xml:"channel_pass_state,omitempty"`
}

func (s PushHealthinfologRequest) String() string {
	return tea.Prettify(s)
}

func (s PushHealthinfologRequest) GoString() string {
	return s.String()
}

func (s *PushHealthinfologRequest) SetAuthToken(v string) *PushHealthinfologRequest {
	s.AuthToken = &v
	return s
}

func (s *PushHealthinfologRequest) SetProductInstanceId(v string) *PushHealthinfologRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushHealthinfologRequest) SetPassId(v string) *PushHealthinfologRequest {
	s.PassId = &v
	return s
}

func (s *PushHealthinfologRequest) SetSerialNo(v string) *PushHealthinfologRequest {
	s.SerialNo = &v
	return s
}

func (s *PushHealthinfologRequest) SetCorpName(v string) *PushHealthinfologRequest {
	s.CorpName = &v
	return s
}

func (s *PushHealthinfologRequest) SetCostTime(v int64) *PushHealthinfologRequest {
	s.CostTime = &v
	return s
}

func (s *PushHealthinfologRequest) SetPassResult(v string) *PushHealthinfologRequest {
	s.PassResult = &v
	return s
}

func (s *PushHealthinfologRequest) SetName(v string) *PushHealthinfologRequest {
	s.Name = &v
	return s
}

func (s *PushHealthinfologRequest) SetCertNo(v string) *PushHealthinfologRequest {
	s.CertNo = &v
	return s
}

func (s *PushHealthinfologRequest) SetErrorType(v string) *PushHealthinfologRequest {
	s.ErrorType = &v
	return s
}

func (s *PushHealthinfologRequest) SetErrorCode(v string) *PushHealthinfologRequest {
	s.ErrorCode = &v
	return s
}

func (s *PushHealthinfologRequest) SetErrorMsg(v string) *PushHealthinfologRequest {
	s.ErrorMsg = &v
	return s
}

func (s *PushHealthinfologRequest) SetTemperature(v string) *PushHealthinfologRequest {
	s.Temperature = &v
	return s
}

func (s *PushHealthinfologRequest) SetHealthInfo(v *HealthInfo) *PushHealthinfologRequest {
	s.HealthInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetNucleicAcidInfo(v *NucleicAcidInfo) *PushHealthinfologRequest {
	s.NucleicAcidInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetTravelInfo(v *TravelInfo) *PushHealthinfologRequest {
	s.TravelInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetVaccinationInfo(v *VaccinationInfo) *PushHealthinfologRequest {
	s.VaccinationInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetAntigenInfo(v *AntigenInfo) *PushHealthinfologRequest {
	s.AntigenInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetSceneInfo(v *SceneInfo) *PushHealthinfologRequest {
	s.SceneInfo = v
	return s
}

func (s *PushHealthinfologRequest) SetPassMode(v string) *PushHealthinfologRequest {
	s.PassMode = &v
	return s
}

func (s *PushHealthinfologRequest) SetLongitude(v string) *PushHealthinfologRequest {
	s.Longitude = &v
	return s
}

func (s *PushHealthinfologRequest) SetLatitude(v string) *PushHealthinfologRequest {
	s.Latitude = &v
	return s
}

func (s *PushHealthinfologRequest) SetChannelPassState(v string) *PushHealthinfologRequest {
	s.ChannelPassState = &v
	return s
}

type PushHealthinfologResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 通行记录ID
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty"`
}

func (s PushHealthinfologResponse) String() string {
	return tea.Prettify(s)
}

func (s PushHealthinfologResponse) GoString() string {
	return s.String()
}

func (s *PushHealthinfologResponse) SetReqMsgId(v string) *PushHealthinfologResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushHealthinfologResponse) SetResultCode(v string) *PushHealthinfologResponse {
	s.ResultCode = &v
	return s
}

func (s *PushHealthinfologResponse) SetResultMsg(v string) *PushHealthinfologResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushHealthinfologResponse) SetPassId(v string) *PushHealthinfologResponse {
	s.PassId = &v
	return s
}

type GetHealthinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SN
	//
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 设备厂商
	//
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 健康身份二维码
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty" require:"true"`
	// 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
	HealthTypes *string `json:"health_types,omitempty" xml:"health_types,omitempty" require:"true"`
	// 通行记录ID
	//
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty"`
}

func (s GetHealthinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetHealthinfoRequest) GoString() string {
	return s.String()
}

func (s *GetHealthinfoRequest) SetAuthToken(v string) *GetHealthinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetHealthinfoRequest) SetProductInstanceId(v string) *GetHealthinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetHealthinfoRequest) SetSerialNo(v string) *GetHealthinfoRequest {
	s.SerialNo = &v
	return s
}

func (s *GetHealthinfoRequest) SetCorpName(v string) *GetHealthinfoRequest {
	s.CorpName = &v
	return s
}

func (s *GetHealthinfoRequest) SetQrCode(v string) *GetHealthinfoRequest {
	s.QrCode = &v
	return s
}

func (s *GetHealthinfoRequest) SetHealthTypes(v string) *GetHealthinfoRequest {
	s.HealthTypes = &v
	return s
}

func (s *GetHealthinfoRequest) SetPassId(v string) *GetHealthinfoRequest {
	s.PassId = &v
	return s
}

type GetHealthinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 健康信息
	//
	HealthInfo *HealthInfo `json:"health_info,omitempty" xml:"health_info,omitempty"`
	// 核酸信息
	//
	NucleicAcidInfo *NucleicAcidInfo `json:"nucleic_acid_info,omitempty" xml:"nucleic_acid_info,omitempty"`
	// 行程信息
	//
	TravelInfo *TravelInfo `json:"travel_info,omitempty" xml:"travel_info,omitempty"`
	// 疫苗接种信息
	//
	VaccinationInfo *VaccinationInfo `json:"vaccination_info,omitempty" xml:"vaccination_info,omitempty"`
	// 抗原信息
	//
	AntigenInfo *AntigenInfo `json:"antigen_info,omitempty" xml:"antigen_info,omitempty"`
	// 场所信息
	//
	SceneInfo *SceneInfo `json:"scene_info,omitempty" xml:"scene_info,omitempty"`
	// 被查询人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 被查询人身份证号
	//
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 通行记录ID
	PassId *string `json:"pass_id,omitempty" xml:"pass_id,omitempty"`
}

func (s GetHealthinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetHealthinfoResponse) GoString() string {
	return s.String()
}

func (s *GetHealthinfoResponse) SetReqMsgId(v string) *GetHealthinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetHealthinfoResponse) SetResultCode(v string) *GetHealthinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetHealthinfoResponse) SetResultMsg(v string) *GetHealthinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetHealthinfoResponse) SetHealthInfo(v *HealthInfo) *GetHealthinfoResponse {
	s.HealthInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetNucleicAcidInfo(v *NucleicAcidInfo) *GetHealthinfoResponse {
	s.NucleicAcidInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetTravelInfo(v *TravelInfo) *GetHealthinfoResponse {
	s.TravelInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetVaccinationInfo(v *VaccinationInfo) *GetHealthinfoResponse {
	s.VaccinationInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetAntigenInfo(v *AntigenInfo) *GetHealthinfoResponse {
	s.AntigenInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetSceneInfo(v *SceneInfo) *GetHealthinfoResponse {
	s.SceneInfo = v
	return s
}

func (s *GetHealthinfoResponse) SetName(v string) *GetHealthinfoResponse {
	s.Name = &v
	return s
}

func (s *GetHealthinfoResponse) SetCertNo(v string) *GetHealthinfoResponse {
	s.CertNo = &v
	return s
}

func (s *GetHealthinfoResponse) SetPassId(v string) *GetHealthinfoResponse {
	s.PassId = &v
	return s
}

type QueryDeviceargsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备SN
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
}

func (s QueryDeviceargsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceargsRequest) GoString() string {
	return s.String()
}

func (s *QueryDeviceargsRequest) SetAuthToken(v string) *QueryDeviceargsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeviceargsRequest) SetProductInstanceId(v string) *QueryDeviceargsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeviceargsRequest) SetSerialNo(v string) *QueryDeviceargsRequest {
	s.SerialNo = &v
	return s
}

func (s *QueryDeviceargsRequest) SetCorpName(v string) *QueryDeviceargsRequest {
	s.CorpName = &v
	return s
}

type QueryDeviceargsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备参数列表
	ArgsNameValueList []*ArgsNameValue `json:"args_name_value_list,omitempty" xml:"args_name_value_list,omitempty" type:"Repeated"`
}

func (s QueryDeviceargsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeviceargsResponse) GoString() string {
	return s.String()
}

func (s *QueryDeviceargsResponse) SetReqMsgId(v string) *QueryDeviceargsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeviceargsResponse) SetResultCode(v string) *QueryDeviceargsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeviceargsResponse) SetResultMsg(v string) *QueryDeviceargsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeviceargsResponse) SetArgsNameValueList(v []*ArgsNameValue) *QueryDeviceargsResponse {
	s.ArgsNameValueList = v
	return s
}

type InitDeviceargsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备sn
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 设备厂商
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 设备参数名称/key/value列表
	ArgsNameValueList []*ArgsNameValue `json:"args_name_value_list,omitempty" xml:"args_name_value_list,omitempty" require:"true" type:"Repeated"`
}

func (s InitDeviceargsRequest) String() string {
	return tea.Prettify(s)
}

func (s InitDeviceargsRequest) GoString() string {
	return s.String()
}

func (s *InitDeviceargsRequest) SetAuthToken(v string) *InitDeviceargsRequest {
	s.AuthToken = &v
	return s
}

func (s *InitDeviceargsRequest) SetProductInstanceId(v string) *InitDeviceargsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitDeviceargsRequest) SetSerialNo(v string) *InitDeviceargsRequest {
	s.SerialNo = &v
	return s
}

func (s *InitDeviceargsRequest) SetCorpName(v string) *InitDeviceargsRequest {
	s.CorpName = &v
	return s
}

func (s *InitDeviceargsRequest) SetArgsNameValueList(v []*ArgsNameValue) *InitDeviceargsRequest {
	s.ArgsNameValueList = v
	return s
}

type InitDeviceargsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitDeviceargsResponse) String() string {
	return tea.Prettify(s)
}

func (s InitDeviceargsResponse) GoString() string {
	return s.String()
}

func (s *InitDeviceargsResponse) SetReqMsgId(v string) *InitDeviceargsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitDeviceargsResponse) SetResultCode(v string) *InitDeviceargsResponse {
	s.ResultCode = &v
	return s
}

func (s *InitDeviceargsResponse) SetResultMsg(v string) *InitDeviceargsResponse {
	s.ResultMsg = &v
	return s
}

type QueryHealthinfologRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间(开始时间-结束时间最大时间为7天)
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"500" minimum:"1"`
	// 设备号
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty"`
}

func (s QueryHealthinfologRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryHealthinfologRequest) GoString() string {
	return s.String()
}

func (s *QueryHealthinfologRequest) SetAuthToken(v string) *QueryHealthinfologRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryHealthinfologRequest) SetProductInstanceId(v string) *QueryHealthinfologRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryHealthinfologRequest) SetStartTime(v string) *QueryHealthinfologRequest {
	s.StartTime = &v
	return s
}

func (s *QueryHealthinfologRequest) SetEndTime(v string) *QueryHealthinfologRequest {
	s.EndTime = &v
	return s
}

func (s *QueryHealthinfologRequest) SetPageNum(v int64) *QueryHealthinfologRequest {
	s.PageNum = &v
	return s
}

func (s *QueryHealthinfologRequest) SetPageSize(v int64) *QueryHealthinfologRequest {
	s.PageSize = &v
	return s
}

func (s *QueryHealthinfologRequest) SetSerialNo(v string) *QueryHealthinfologRequest {
	s.SerialNo = &v
	return s
}

type QueryHealthinfologResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总条数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 总页数
	Pages *int64 `json:"pages,omitempty" xml:"pages,omitempty"`
	// 列表数据
	DataList []*HealthInfoLog `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s QueryHealthinfologResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryHealthinfologResponse) GoString() string {
	return s.String()
}

func (s *QueryHealthinfologResponse) SetReqMsgId(v string) *QueryHealthinfologResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryHealthinfologResponse) SetResultCode(v string) *QueryHealthinfologResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryHealthinfologResponse) SetResultMsg(v string) *QueryHealthinfologResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryHealthinfologResponse) SetTotal(v int64) *QueryHealthinfologResponse {
	s.Total = &v
	return s
}

func (s *QueryHealthinfologResponse) SetPages(v int64) *QueryHealthinfologResponse {
	s.Pages = &v
	return s
}

func (s *QueryHealthinfologResponse) SetDataList(v []*HealthInfoLog) *QueryHealthinfologResponse {
	s.DataList = v
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
		"timeouted":               "retry",
		"readTimeout":             tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":          tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":               tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":              tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":                 tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":            tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":       tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDurationMillis": tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":             tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost":      tea.IntValue(client.MaxRequestsPerHost),
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
				"sdk_version":      tea.String("1.0.10"),
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
			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
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
 * Description: 查询防疫健康信息
 * Summary: 查询防疫健康信息
 */
func (client *Client) QueryHealthinfo(request *QueryHealthinfoRequest) (_result *QueryHealthinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryHealthinfoResponse{}
	_body, _err := client.QueryHealthinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询防疫健康信息
 * Summary: 查询防疫健康信息
 */
func (client *Client) QueryHealthinfoEx(request *QueryHealthinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryHealthinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryHealthinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.healthinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上报通行记录
 * Summary: 上报通行记录
 */
func (client *Client) PushHealthinfolog(request *PushHealthinfologRequest) (_result *PushHealthinfologResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushHealthinfologResponse{}
	_body, _err := client.PushHealthinfologEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上报通行记录
 * Summary: 上报通行记录
 */
func (client *Client) PushHealthinfologEx(request *PushHealthinfologRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushHealthinfologResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushHealthinfologResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.healthinfolog.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 健康身份二维码反查防疫健康信息
 * Summary: 健康身份二维码反查防疫健康信息
 */
func (client *Client) GetHealthinfo(request *GetHealthinfoRequest) (_result *GetHealthinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetHealthinfoResponse{}
	_body, _err := client.GetHealthinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 健康身份二维码反查防疫健康信息
 * Summary: 健康身份二维码反查防疫健康信息
 */
func (client *Client) GetHealthinfoEx(request *GetHealthinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetHealthinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetHealthinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.healthinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 健康码设备配置参数列表查询
 * Summary: 健康码设备配置参数列表查询
 */
func (client *Client) QueryDeviceargs(request *QueryDeviceargsRequest) (_result *QueryDeviceargsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeviceargsResponse{}
	_body, _err := client.QueryDeviceargsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 健康码设备配置参数列表查询
 * Summary: 健康码设备配置参数列表查询
 */
func (client *Client) QueryDeviceargsEx(request *QueryDeviceargsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeviceargsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeviceargsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.deviceargs.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 健康码设备参数配置初始化
 * Summary: 健康码设备参数配置初始化
 */
func (client *Client) InitDeviceargs(request *InitDeviceargsRequest) (_result *InitDeviceargsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitDeviceargsResponse{}
	_body, _err := client.InitDeviceargsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 健康码设备参数配置初始化
 * Summary: 健康码设备参数配置初始化
 */
func (client *Client) InitDeviceargsEx(request *InitDeviceargsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitDeviceargsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitDeviceargsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.deviceargs.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通行记录查询
 * Summary: 通行记录查询
 */
func (client *Client) QueryHealthinfolog(request *QueryHealthinfologRequest) (_result *QueryHealthinfologResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryHealthinfologResponse{}
	_body, _err := client.QueryHealthinfologEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通行记录查询
 * Summary: 通行记录查询
 */
func (client *Client) QueryHealthinfologEx(request *QueryHealthinfologRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryHealthinfologResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryHealthinfologResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antim.healthinfolog.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
