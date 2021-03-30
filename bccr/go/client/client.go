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

// 取证文件信息
type ScreenInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 网页截图文件下载链接
	WebScreenshotFile *string `json:"web_screenshot_file,omitempty" xml:"web_screenshot_file,omitempty"`
	// 网页源码文件下载链接
	WebSourceFile *string `json:"web_source_file,omitempty" xml:"web_source_file,omitempty"`
	// 视频源文件下载链接
	VideoFile *string `json:"video_file,omitempty" xml:"video_file,omitempty"`
}

func (s ScreenInfo) String() string {
	return tea.Prettify(s)
}

func (s ScreenInfo) GoString() string {
	return s.String()
}

func (s *ScreenInfo) SetProcessLogFile(v string) *ScreenInfo {
	s.ProcessLogFile = &v
	return s
}

func (s *ScreenInfo) SetWebScreenshotFile(v string) *ScreenInfo {
	s.WebScreenshotFile = &v
	return s
}

func (s *ScreenInfo) SetWebSourceFile(v string) *ScreenInfo {
	s.WebSourceFile = &v
	return s
}

func (s *ScreenInfo) SetVideoFile(v string) *ScreenInfo {
	s.VideoFile = &v
	return s
}

// 网页取证具体信息
type ScreenshotInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 网页截图文件下载链接
	ScreenshotFile *string `json:"screenshot_file,omitempty" xml:"screenshot_file,omitempty" require:"true"`
}

func (s ScreenshotInfo) String() string {
	return tea.Prettify(s)
}

func (s ScreenshotInfo) GoString() string {
	return s.String()
}

func (s *ScreenshotInfo) SetProcessLogFile(v string) *ScreenshotInfo {
	s.ProcessLogFile = &v
	return s
}

func (s *ScreenshotInfo) SetScreenshotFile(v string) *ScreenshotInfo {
	s.ScreenshotFile = &v
	return s
}

// 监测提供商能力
type MonitorProviderCapability struct {
	// 供应商id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 供应商名称
	ProviderName *string `json:"provider_name,omitempty" xml:"provider_name,omitempty" require:"true"`
	// 供应商描述
	ProviderDescription *string `json:"provider_description,omitempty" xml:"provider_description,omitempty" require:"true"`
	// 是否推荐供应商
	IsProvided *bool `json:"is_provided,omitempty" xml:"is_provided,omitempty" require:"true"`
}

func (s MonitorProviderCapability) String() string {
	return tea.Prettify(s)
}

func (s MonitorProviderCapability) GoString() string {
	return s.String()
}

func (s *MonitorProviderCapability) SetProviderId(v string) *MonitorProviderCapability {
	s.ProviderId = &v
	return s
}

func (s *MonitorProviderCapability) SetProviderName(v string) *MonitorProviderCapability {
	s.ProviderName = &v
	return s
}

func (s *MonitorProviderCapability) SetProviderDescription(v string) *MonitorProviderCapability {
	s.ProviderDescription = &v
	return s
}

func (s *MonitorProviderCapability) SetIsProvided(v bool) *MonitorProviderCapability {
	s.IsProvided = &v
	return s
}

// 监测任务结果
type MonitorResult struct {
	// 监测任务ID
	//
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
	// 监测结果ID
	//
	MonitorResultId *string `json:"monitor_result_id,omitempty" xml:"monitor_result_id,omitempty" require:"true"`
	// 侵权网址
	//
	//
	InfrUrl *string `json:"infr_url,omitempty" xml:"infr_url,omitempty"`
	// 侵权主体
	//
	//
	InfrHost *string `json:"infr_host,omitempty" xml:"infr_host,omitempty"`
	// 侵权标题
	//
	//
	InfrTitle *string `json:"infr_title,omitempty" xml:"infr_title,omitempty"`
	// 侵权内容上传时间
	//
	//
	InfrTime *int64 `json:"infr_time,omitempty" xml:"infr_time,omitempty"`
	// 侵权详情
	//
	Detail *string `json:"detail,omitempty" xml:"detail,omitempty"`
}

func (s MonitorResult) String() string {
	return tea.Prettify(s)
}

func (s MonitorResult) GoString() string {
	return s.String()
}

func (s *MonitorResult) SetMonitorTaskId(v string) *MonitorResult {
	s.MonitorTaskId = &v
	return s
}

func (s *MonitorResult) SetMonitorResultId(v string) *MonitorResult {
	s.MonitorResultId = &v
	return s
}

func (s *MonitorResult) SetInfrUrl(v string) *MonitorResult {
	s.InfrUrl = &v
	return s
}

func (s *MonitorResult) SetInfrHost(v string) *MonitorResult {
	s.InfrHost = &v
	return s
}

func (s *MonitorResult) SetInfrTitle(v string) *MonitorResult {
	s.InfrTitle = &v
	return s
}

func (s *MonitorResult) SetInfrTime(v int64) *MonitorResult {
	s.InfrTime = &v
	return s
}

func (s *MonitorResult) SetDetail(v string) *MonitorResult {
	s.Detail = &v
	return s
}

// 网页取证数据
type ScreenshotData struct {
	// 取证地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 网页取证时间
	GmtEvidence *int64 `json:"gmt_evidence,omitempty" xml:"gmt_evidence,omitempty" require:"true"`
	// 网页取证文件Hash值
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 网页取证文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 统一证据编号
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 网页取证文件存证块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 网页取证文件上链时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 可信时间戳的返回对象
	Tsr *string `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 网页截图文件公证处证书下载链接
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 公证处证书编号
	CertificateStorageNo *string `json:"certificate_storage_no,omitempty" xml:"certificate_storage_no,omitempty"`
	// 网页取证工具软件版本号
	ToolVersion *string `json:"tool_version,omitempty" xml:"tool_version,omitempty"`
	// 证据包下载地址（状态为SUCCESS 才有数据）
	ScreenshotZip *string `json:"screenshot_zip,omitempty" xml:"screenshot_zip,omitempty"`
	// 取证文件信息
	ScreenshotInfo *ScreenshotInfo `json:"screenshot_info,omitempty" xml:"screenshot_info,omitempty"`
}

func (s ScreenshotData) String() string {
	return tea.Prettify(s)
}

func (s ScreenshotData) GoString() string {
	return s.String()
}

func (s *ScreenshotData) SetUrl(v string) *ScreenshotData {
	s.Url = &v
	return s
}

func (s *ScreenshotData) SetGmtEvidence(v int64) *ScreenshotData {
	s.GmtEvidence = &v
	return s
}

func (s *ScreenshotData) SetFileHash(v string) *ScreenshotData {
	s.FileHash = &v
	return s
}

func (s *ScreenshotData) SetFileSize(v int64) *ScreenshotData {
	s.FileSize = &v
	return s
}

func (s *ScreenshotData) SetTxHash(v string) *ScreenshotData {
	s.TxHash = &v
	return s
}

func (s *ScreenshotData) SetBlockHeight(v int64) *ScreenshotData {
	s.BlockHeight = &v
	return s
}

func (s *ScreenshotData) SetTimestamp(v int64) *ScreenshotData {
	s.Timestamp = &v
	return s
}

func (s *ScreenshotData) SetTsr(v string) *ScreenshotData {
	s.Tsr = &v
	return s
}

func (s *ScreenshotData) SetCertificateUrl(v string) *ScreenshotData {
	s.CertificateUrl = &v
	return s
}

func (s *ScreenshotData) SetCertificateStorageNo(v string) *ScreenshotData {
	s.CertificateStorageNo = &v
	return s
}

func (s *ScreenshotData) SetToolVersion(v string) *ScreenshotData {
	s.ToolVersion = &v
	return s
}

func (s *ScreenshotData) SetScreenshotZip(v string) *ScreenshotData {
	s.ScreenshotZip = &v
	return s
}

func (s *ScreenshotData) SetScreenshotInfo(v *ScreenshotInfo) *ScreenshotData {
	s.ScreenshotInfo = v
	return s
}

// 用户信息
type UserData struct {
	// 用户账号
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 账号类型
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty" require:"true"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 联系方式
	ContactInfo *string `json:"contact_info,omitempty" xml:"contact_info,omitempty"`
	// 企业法人
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 注册时间
	RegTime *int64 `json:"reg_time,omitempty" xml:"reg_time,omitempty" require:"true"`
	// 账号状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用户类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s UserData) String() string {
	return tea.Prettify(s)
}

func (s UserData) GoString() string {
	return s.String()
}

func (s *UserData) SetAccount(v string) *UserData {
	s.Account = &v
	return s
}

func (s *UserData) SetAccountType(v string) *UserData {
	s.AccountType = &v
	return s
}

func (s *UserData) SetCertName(v string) *UserData {
	s.CertName = &v
	return s
}

func (s *UserData) SetCertNo(v string) *UserData {
	s.CertNo = &v
	return s
}

func (s *UserData) SetCertType(v string) *UserData {
	s.CertType = &v
	return s
}

func (s *UserData) SetContactInfo(v string) *UserData {
	s.ContactInfo = &v
	return s
}

func (s *UserData) SetLegalPerson(v string) *UserData {
	s.LegalPerson = &v
	return s
}

func (s *UserData) SetRegTime(v int64) *UserData {
	s.RegTime = &v
	return s
}

func (s *UserData) SetStatus(v string) *UserData {
	s.Status = &v
	return s
}

func (s *UserData) SetType(v string) *UserData {
	s.Type = &v
	return s
}

// 代理信息
type ProxyData struct {
	// 金融云租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
}

func (s ProxyData) String() string {
	return tea.Prettify(s)
}

func (s ProxyData) GoString() string {
	return s.String()
}

func (s *ProxyData) SetTenantId(v string) *ProxyData {
	s.TenantId = &v
	return s
}

func (s *ProxyData) SetTenantName(v string) *ProxyData {
	s.TenantName = &v
	return s
}

// 监测文件类型
type MonitorType struct {
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 提交类型
	SubmitType *string `json:"submit_type,omitempty" xml:"submit_type,omitempty" require:"true"`
}

func (s MonitorType) String() string {
	return tea.Prettify(s)
}

func (s MonitorType) GoString() string {
	return s.String()
}

func (s *MonitorType) SetFileType(v string) *MonitorType {
	s.FileType = &v
	return s
}

func (s *MonitorType) SetSubmitType(v string) *MonitorType {
	s.SubmitType = &v
	return s
}

// 商品sku信息
type GoodSkuInfo struct {
	// 授权规格序号
	SkuNum *string `json:"sku_num,omitempty" xml:"sku_num,omitempty" require:"true"`
	// 授权规格价格(单位：分)
	Price *int64 `json:"price,omitempty" xml:"price,omitempty" require:"true"`
}

func (s GoodSkuInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodSkuInfo) GoString() string {
	return s.String()
}

func (s *GoodSkuInfo) SetSkuNum(v string) *GoodSkuInfo {
	s.SkuNum = &v
	return s
}

func (s *GoodSkuInfo) SetPrice(v int64) *GoodSkuInfo {
	s.Price = &v
	return s
}

// 类型对应供应商
type MonitorProviderType struct {
	// 监测文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 提交类型
	SubmitType *string `json:"submit_type,omitempty" xml:"submit_type,omitempty" require:"true"`
	// 文件格式
	FileFormat *string `json:"file_format,omitempty" xml:"file_format,omitempty"`
	// 支持的服务商列表，已排序
	MonitorProviders []*MonitorProviderCapability `json:"monitor_providers,omitempty" xml:"monitor_providers,omitempty" require:"true" type:"Repeated"`
}

func (s MonitorProviderType) String() string {
	return tea.Prettify(s)
}

func (s MonitorProviderType) GoString() string {
	return s.String()
}

func (s *MonitorProviderType) SetFileType(v string) *MonitorProviderType {
	s.FileType = &v
	return s
}

func (s *MonitorProviderType) SetSubmitType(v string) *MonitorProviderType {
	s.SubmitType = &v
	return s
}

func (s *MonitorProviderType) SetFileFormat(v string) *MonitorProviderType {
	s.FileFormat = &v
	return s
}

func (s *MonitorProviderType) SetMonitorProviders(v []*MonitorProviderCapability) *MonitorProviderType {
	s.MonitorProviders = v
	return s
}

// 监测任务信息
type MonitorTask struct {
	// 内容表述
	//
	//
	ContentDesc *string `json:"content_desc,omitempty" xml:"content_desc,omitempty"`
	// 监测任务标题
	//
	//
	ContentTitle *string `json:"content_title,omitempty" xml:"content_title,omitempty"`
	// 监测文件时长，主要用于视频监测、音频监测的时长记录
	FileLengthInSecond *int64 `json:"file_length_in_second,omitempty" xml:"file_length_in_second,omitempty"`
	// 监测关键字
	//
	//
	Keywords []*string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true" type:"Repeated"`
	// 监测任务ID
	//
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
	// 任务名称
	//
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 监测供应商id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty"`
	// 监测结果数量
	//
	//
	ResultCount *int64 `json:"result_count,omitempty" xml:"result_count,omitempty"`
	// 监测范围
	//
	//
	Scopes []*string `json:"scopes,omitempty" xml:"scopes,omitempty" require:"true" type:"Repeated"`
	// 任务状态
	//
	// INIT
	//
	// WORKING
	//
	// FINISH
	//
	// FAILURE
	//
	// DELETE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 监测时长(天)
	//
	//
	TaskDuration *int64 `json:"task_duration,omitempty" xml:"task_duration,omitempty" require:"true"`
	// 任务结束时间
	//
	//
	TaskEnd *int64 `json:"task_end,omitempty" xml:"task_end,omitempty"`
	// 任务开始时间
	//
	//
	TaskStart *int64 `json:"task_start,omitempty" xml:"task_start,omitempty"`
	// 文件类别
	//
	// IMAGE
	//
	// TEXT
	//
	// VIDEO
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// submitType是url就是url地址 submitType 是file就是oss fileId
	SubmitContent *string `json:"submit_content,omitempty" xml:"submit_content,omitempty" require:"true"`
	// 提交任务的类型:FILE/URL
	// 不填为FILE
	// FILE表示文件上传素材，URL表示上传URL
	SubmitType *string `json:"submit_type,omitempty" xml:"submit_type,omitempty"`
	// 当status为failure时的具体错误信息
	FailureMsg *string `json:"failure_msg,omitempty" xml:"failure_msg,omitempty"`
}

func (s MonitorTask) String() string {
	return tea.Prettify(s)
}

func (s MonitorTask) GoString() string {
	return s.String()
}

func (s *MonitorTask) SetContentDesc(v string) *MonitorTask {
	s.ContentDesc = &v
	return s
}

func (s *MonitorTask) SetContentTitle(v string) *MonitorTask {
	s.ContentTitle = &v
	return s
}

func (s *MonitorTask) SetFileLengthInSecond(v int64) *MonitorTask {
	s.FileLengthInSecond = &v
	return s
}

func (s *MonitorTask) SetKeywords(v []*string) *MonitorTask {
	s.Keywords = v
	return s
}

func (s *MonitorTask) SetMonitorTaskId(v string) *MonitorTask {
	s.MonitorTaskId = &v
	return s
}

func (s *MonitorTask) SetName(v string) *MonitorTask {
	s.Name = &v
	return s
}

func (s *MonitorTask) SetProviderId(v string) *MonitorTask {
	s.ProviderId = &v
	return s
}

func (s *MonitorTask) SetResultCount(v int64) *MonitorTask {
	s.ResultCount = &v
	return s
}

func (s *MonitorTask) SetScopes(v []*string) *MonitorTask {
	s.Scopes = v
	return s
}

func (s *MonitorTask) SetStatus(v string) *MonitorTask {
	s.Status = &v
	return s
}

func (s *MonitorTask) SetTaskDuration(v int64) *MonitorTask {
	s.TaskDuration = &v
	return s
}

func (s *MonitorTask) SetTaskEnd(v int64) *MonitorTask {
	s.TaskEnd = &v
	return s
}

func (s *MonitorTask) SetTaskStart(v int64) *MonitorTask {
	s.TaskStart = &v
	return s
}

func (s *MonitorTask) SetFileType(v string) *MonitorTask {
	s.FileType = &v
	return s
}

func (s *MonitorTask) SetFileSize(v int64) *MonitorTask {
	s.FileSize = &v
	return s
}

func (s *MonitorTask) SetSubmitContent(v string) *MonitorTask {
	s.SubmitContent = &v
	return s
}

func (s *MonitorTask) SetSubmitType(v string) *MonitorTask {
	s.SubmitType = &v
	return s
}

func (s *MonitorTask) SetFailureMsg(v string) *MonitorTask {
	s.FailureMsg = &v
	return s
}

// 录屏取证信息
type RecordScreenData struct {
	// 错误原因（状态为FAIL才有数据）
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 录屏文件Hash值
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 录屏结束时间
	GmtEnd *int64 `json:"gmt_end,omitempty" xml:"gmt_end,omitempty" require:"true"`
	// 录屏开始时间
	GmtStart *int64 `json:"gmt_start,omitempty" xml:"gmt_start,omitempty" require:"true"`
	// OS版本号
	OsVersion *string `json:"os_version,omitempty" xml:"os_version,omitempty" require:"true"`
	// 录屏文件信息
	ScreenInfo *ScreenInfo `json:"screen_info,omitempty" xml:"screen_info,omitempty"`
	// 证据包下载地址（状态为SUCCESS 才有数据）
	ScreenZip *string `json:"screen_zip,omitempty" xml:"screen_zip,omitempty"`
	// 录屏软件版本号
	SwVersion *string `json:"sw_version,omitempty" xml:"sw_version,omitempty" require:"true"`
	// 可信时间戳的返回对象
	Tsr *string `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 统一证据编号
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 录屏文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 录屏文件存证块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 录屏文件上链时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 录屏文件公证处证书下载链接
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 公证处证书编号
	CertificateStorageNo *string `json:"certificate_storage_no,omitempty" xml:"certificate_storage_no,omitempty"`
}

func (s RecordScreenData) String() string {
	return tea.Prettify(s)
}

func (s RecordScreenData) GoString() string {
	return s.String()
}

func (s *RecordScreenData) SetErrorReason(v string) *RecordScreenData {
	s.ErrorReason = &v
	return s
}

func (s *RecordScreenData) SetFileHash(v string) *RecordScreenData {
	s.FileHash = &v
	return s
}

func (s *RecordScreenData) SetGmtEnd(v int64) *RecordScreenData {
	s.GmtEnd = &v
	return s
}

func (s *RecordScreenData) SetGmtStart(v int64) *RecordScreenData {
	s.GmtStart = &v
	return s
}

func (s *RecordScreenData) SetOsVersion(v string) *RecordScreenData {
	s.OsVersion = &v
	return s
}

func (s *RecordScreenData) SetScreenInfo(v *ScreenInfo) *RecordScreenData {
	s.ScreenInfo = v
	return s
}

func (s *RecordScreenData) SetScreenZip(v string) *RecordScreenData {
	s.ScreenZip = &v
	return s
}

func (s *RecordScreenData) SetSwVersion(v string) *RecordScreenData {
	s.SwVersion = &v
	return s
}

func (s *RecordScreenData) SetTsr(v string) *RecordScreenData {
	s.Tsr = &v
	return s
}

func (s *RecordScreenData) SetTxHash(v string) *RecordScreenData {
	s.TxHash = &v
	return s
}

func (s *RecordScreenData) SetFileSize(v int64) *RecordScreenData {
	s.FileSize = &v
	return s
}

func (s *RecordScreenData) SetBlockHeight(v int64) *RecordScreenData {
	s.BlockHeight = &v
	return s
}

func (s *RecordScreenData) SetTimestamp(v int64) *RecordScreenData {
	s.Timestamp = &v
	return s
}

func (s *RecordScreenData) SetCertificateUrl(v string) *RecordScreenData {
	s.CertificateUrl = &v
	return s
}

func (s *RecordScreenData) SetCertificateStorageNo(v string) *RecordScreenData {
	s.CertificateStorageNo = &v
	return s
}

type GetUploadurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true" maxLength:"128"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" maxLength:"64"`
}

func (s GetUploadurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetUploadurlRequest) GoString() string {
	return s.String()
}

func (s *GetUploadurlRequest) SetAuthToken(v string) *GetUploadurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetUploadurlRequest) SetProductInstanceId(v string) *GetUploadurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetUploadurlRequest) SetFileName(v string) *GetUploadurlRequest {
	s.FileName = &v
	return s
}

func (s *GetUploadurlRequest) SetClientToken(v string) *GetUploadurlRequest {
	s.ClientToken = &v
	return s
}

type GetUploadurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权访问oss链接
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// OSS 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s GetUploadurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetUploadurlResponse) GoString() string {
	return s.String()
}

func (s *GetUploadurlResponse) SetReqMsgId(v string) *GetUploadurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetUploadurlResponse) SetResultCode(v string) *GetUploadurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetUploadurlResponse) SetResultMsg(v string) *GetUploadurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetUploadurlResponse) SetUrl(v string) *GetUploadurlResponse {
	s.Url = &v
	return s
}

func (s *GetUploadurlResponse) SetFileId(v string) *GetUploadurlResponse {
	s.FileId = &v
	return s
}

type AddHashregisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件SHA256 hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 文件大小
	Length *int64 `json:"length,omitempty" xml:"length,omitempty" require:"true"`
	// hash算法
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// 文件类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"128"`
	// 备注
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" maxLength:"512"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 是否自动创建公证保管函
	CreateCertificate *bool `json:"create_certificate,omitempty" xml:"create_certificate,omitempty"`
	// 证书类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty"`
	// 是否创建证据包，默认否
	CreatePackage *bool `json:"create_package,omitempty" xml:"create_package,omitempty"`
	//
	// 公证处Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 电话号码
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 特征文件oss id
	FeatureFileId *string `json:"feature_file_id,omitempty" xml:"feature_file_id,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s AddHashregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s AddHashregisterRequest) GoString() string {
	return s.String()
}

func (s *AddHashregisterRequest) SetAuthToken(v string) *AddHashregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *AddHashregisterRequest) SetProductInstanceId(v string) *AddHashregisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddHashregisterRequest) SetHash(v string) *AddHashregisterRequest {
	s.Hash = &v
	return s
}

func (s *AddHashregisterRequest) SetLength(v int64) *AddHashregisterRequest {
	s.Length = &v
	return s
}

func (s *AddHashregisterRequest) SetHashType(v string) *AddHashregisterRequest {
	s.HashType = &v
	return s
}

func (s *AddHashregisterRequest) SetType(v string) *AddHashregisterRequest {
	s.Type = &v
	return s
}

func (s *AddHashregisterRequest) SetName(v string) *AddHashregisterRequest {
	s.Name = &v
	return s
}

func (s *AddHashregisterRequest) SetMemo(v string) *AddHashregisterRequest {
	s.Memo = &v
	return s
}

func (s *AddHashregisterRequest) SetCertName(v string) *AddHashregisterRequest {
	s.CertName = &v
	return s
}

func (s *AddHashregisterRequest) SetCertNo(v string) *AddHashregisterRequest {
	s.CertNo = &v
	return s
}

func (s *AddHashregisterRequest) SetCertType(v string) *AddHashregisterRequest {
	s.CertType = &v
	return s
}

func (s *AddHashregisterRequest) SetCreateCertificate(v bool) *AddHashregisterRequest {
	s.CreateCertificate = &v
	return s
}

func (s *AddHashregisterRequest) SetCertificateType(v string) *AddHashregisterRequest {
	s.CertificateType = &v
	return s
}

func (s *AddHashregisterRequest) SetCreatePackage(v bool) *AddHashregisterRequest {
	s.CreatePackage = &v
	return s
}

func (s *AddHashregisterRequest) SetOrgId(v string) *AddHashregisterRequest {
	s.OrgId = &v
	return s
}

func (s *AddHashregisterRequest) SetProxyInfo(v *ProxyData) *AddHashregisterRequest {
	s.ProxyInfo = v
	return s
}

func (s *AddHashregisterRequest) SetPhoneNum(v string) *AddHashregisterRequest {
	s.PhoneNum = &v
	return s
}

func (s *AddHashregisterRequest) SetFeatureFileId(v string) *AddHashregisterRequest {
	s.FeatureFileId = &v
	return s
}

func (s *AddHashregisterRequest) SetClientToken(v string) *AddHashregisterRequest {
	s.ClientToken = &v
	return s
}

type AddHashregisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登记id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
}

func (s AddHashregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s AddHashregisterResponse) GoString() string {
	return s.String()
}

func (s *AddHashregisterResponse) SetReqMsgId(v string) *AddHashregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddHashregisterResponse) SetResultCode(v string) *AddHashregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *AddHashregisterResponse) SetResultMsg(v string) *AddHashregisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddHashregisterResponse) SetRegisterId(v string) *AddHashregisterResponse {
	s.RegisterId = &v
	return s
}

type AddRegisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件oss id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 是否自动创建公证书,默认否
	CreateCertificate *bool `json:"create_certificate,omitempty" xml:"create_certificate,omitempty"`
	// 证书类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty"`
	// 是否创建证据包，默认否
	CreatePackage *bool `json:"create_package,omitempty" xml:"create_package,omitempty"`
	// 公证处id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 文件名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"128"`
	// 文件类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 备注
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" maxLength:"512"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 电话号码
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 幂等
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s AddRegisterRequest) String() string {
	return tea.Prettify(s)
}

func (s AddRegisterRequest) GoString() string {
	return s.String()
}

func (s *AddRegisterRequest) SetAuthToken(v string) *AddRegisterRequest {
	s.AuthToken = &v
	return s
}

func (s *AddRegisterRequest) SetProductInstanceId(v string) *AddRegisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddRegisterRequest) SetFileId(v string) *AddRegisterRequest {
	s.FileId = &v
	return s
}

func (s *AddRegisterRequest) SetCreateCertificate(v bool) *AddRegisterRequest {
	s.CreateCertificate = &v
	return s
}

func (s *AddRegisterRequest) SetCertificateType(v string) *AddRegisterRequest {
	s.CertificateType = &v
	return s
}

func (s *AddRegisterRequest) SetCreatePackage(v bool) *AddRegisterRequest {
	s.CreatePackage = &v
	return s
}

func (s *AddRegisterRequest) SetOrgId(v string) *AddRegisterRequest {
	s.OrgId = &v
	return s
}

func (s *AddRegisterRequest) SetName(v string) *AddRegisterRequest {
	s.Name = &v
	return s
}

func (s *AddRegisterRequest) SetType(v string) *AddRegisterRequest {
	s.Type = &v
	return s
}

func (s *AddRegisterRequest) SetMemo(v string) *AddRegisterRequest {
	s.Memo = &v
	return s
}

func (s *AddRegisterRequest) SetCertName(v string) *AddRegisterRequest {
	s.CertName = &v
	return s
}

func (s *AddRegisterRequest) SetCertNo(v string) *AddRegisterRequest {
	s.CertNo = &v
	return s
}

func (s *AddRegisterRequest) SetCertType(v string) *AddRegisterRequest {
	s.CertType = &v
	return s
}

func (s *AddRegisterRequest) SetPhoneNum(v string) *AddRegisterRequest {
	s.PhoneNum = &v
	return s
}

func (s *AddRegisterRequest) SetProxyInfo(v *ProxyData) *AddRegisterRequest {
	s.ProxyInfo = v
	return s
}

func (s *AddRegisterRequest) SetClientToken(v string) *AddRegisterRequest {
	s.ClientToken = &v
	return s
}

type AddRegisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登记id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
}

func (s AddRegisterResponse) String() string {
	return tea.Prettify(s)
}

func (s AddRegisterResponse) GoString() string {
	return s.String()
}

func (s *AddRegisterResponse) SetReqMsgId(v string) *AddRegisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddRegisterResponse) SetResultCode(v string) *AddRegisterResponse {
	s.ResultCode = &v
	return s
}

func (s *AddRegisterResponse) SetResultMsg(v string) *AddRegisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddRegisterResponse) SetRegisterId(v string) *AddRegisterResponse {
	s.RegisterId = &v
	return s
}

type QueryRegisterstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 登记id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty" require:"true"`
}

func (s QueryRegisterstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRegisterstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryRegisterstatusRequest) SetAuthToken(v string) *QueryRegisterstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRegisterstatusRequest) SetProductInstanceId(v string) *QueryRegisterstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRegisterstatusRequest) SetRegisterId(v string) *QueryRegisterstatusRequest {
	s.RegisterId = &v
	return s
}

type QueryRegisterstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登记状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 存证时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 文件hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 统一证据编号（存证交易HASH）
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 存证块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// tsr信息
	Tsr *string `json:"tsr,omitempty" xml:"tsr,omitempty"`
	// 公证处证书下载链接
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 公证处证书编号
	CertificateStorageNo *string `json:"certificate_storage_no,omitempty" xml:"certificate_storage_no,omitempty"`
	// 授时中心证书下载链接
	CertificateTimeUrl *string `json:"certificate_time_url,omitempty" xml:"certificate_time_url,omitempty"`
	// 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
	PackageUrl *string `json:"package_url,omitempty" xml:"package_url,omitempty"`
}

func (s QueryRegisterstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRegisterstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryRegisterstatusResponse) SetReqMsgId(v string) *QueryRegisterstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetResultCode(v string) *QueryRegisterstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetResultMsg(v string) *QueryRegisterstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetStatus(v string) *QueryRegisterstatusResponse {
	s.Status = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetTimestamp(v int64) *QueryRegisterstatusResponse {
	s.Timestamp = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetHash(v string) *QueryRegisterstatusResponse {
	s.Hash = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetTxHash(v string) *QueryRegisterstatusResponse {
	s.TxHash = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetBlockHeight(v int64) *QueryRegisterstatusResponse {
	s.BlockHeight = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetTsr(v string) *QueryRegisterstatusResponse {
	s.Tsr = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetCertificateUrl(v string) *QueryRegisterstatusResponse {
	s.CertificateUrl = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetCertificateStorageNo(v string) *QueryRegisterstatusResponse {
	s.CertificateStorageNo = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetCertificateTimeUrl(v string) *QueryRegisterstatusResponse {
	s.CertificateTimeUrl = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetPackageUrl(v string) *QueryRegisterstatusResponse {
	s.PackageUrl = &v
	return s
}

type CreateCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 版权登记id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty" require:"true"`
	// 证书类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 功能类型
	FeaturesType *string `json:"features_type,omitempty" xml:"features_type,omitempty" require:"true"`
	// 公证处id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
}

func (s CreateCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCertificateRequest) GoString() string {
	return s.String()
}

func (s *CreateCertificateRequest) SetAuthToken(v string) *CreateCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCertificateRequest) SetProductInstanceId(v string) *CreateCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCertificateRequest) SetRegisterId(v string) *CreateCertificateRequest {
	s.RegisterId = &v
	return s
}

func (s *CreateCertificateRequest) SetCertificateType(v string) *CreateCertificateRequest {
	s.CertificateType = &v
	return s
}

func (s *CreateCertificateRequest) SetFeaturesType(v string) *CreateCertificateRequest {
	s.FeaturesType = &v
	return s
}

func (s *CreateCertificateRequest) SetOrgId(v string) *CreateCertificateRequest {
	s.OrgId = &v
	return s
}

func (s *CreateCertificateRequest) SetProxyInfo(v *ProxyData) *CreateCertificateRequest {
	s.ProxyInfo = v
	return s
}

type CreateCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成证书结果
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCertificateResponse) GoString() string {
	return s.String()
}

func (s *CreateCertificateResponse) SetReqMsgId(v string) *CreateCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCertificateResponse) SetResultCode(v string) *CreateCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCertificateResponse) SetResultMsg(v string) *CreateCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCertificateResponse) SetStatus(v string) *CreateCertificateResponse {
	s.Status = &v
	return s
}

type GetCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 证书类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 功能类型
	FeaturesType *string `json:"features_type,omitempty" xml:"features_type,omitempty" require:"true"`
	// 版权登记id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty" require:"true"`
}

func (s GetCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetCertificateRequest) SetAuthToken(v string) *GetCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCertificateRequest) SetProductInstanceId(v string) *GetCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCertificateRequest) SetCertificateType(v string) *GetCertificateRequest {
	s.CertificateType = &v
	return s
}

func (s *GetCertificateRequest) SetFeaturesType(v string) *GetCertificateRequest {
	s.FeaturesType = &v
	return s
}

func (s *GetCertificateRequest) SetRegisterId(v string) *GetCertificateRequest {
	s.RegisterId = &v
	return s
}

type GetCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书下载链接
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 证书生成状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetCertificateResponse) SetReqMsgId(v string) *GetCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCertificateResponse) SetResultCode(v string) *GetCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCertificateResponse) SetResultMsg(v string) *GetCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCertificateResponse) SetUrl(v string) *GetCertificateResponse {
	s.Url = &v
	return s
}

func (s *GetCertificateResponse) SetStatus(v string) *GetCertificateResponse {
	s.Status = &v
	return s
}

type CreateMonitorTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// submitType是url就传 url地址 submitType 是file就传 oss fileId
	SubmitContent *string `json:"submit_content,omitempty" xml:"submit_content,omitempty" require:"true"`
	// 提交任务的类型:FILE/URL
	// 不填为FILE
	// FILE表示文件上传素材，URL表示上传URL
	SubmitType *string `json:"submit_type,omitempty" xml:"submit_type,omitempty"`
	// 文件类别
	//
	// IMAGE
	//
	// TEXT
	//
	// VIDEO
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 任务名称(不超过100字符)
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 监测任务标题(不超过100字符)
	ContentTitle *string `json:"content_title,omitempty" xml:"content_title,omitempty" require:"true"`
	// 关键词(不超过200字符)
	Keywords []*string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true" type:"Repeated"`
	// 内容表述(不超过1000字符)
	ContentDesc *string `json:"content_desc,omitempty" xml:"content_desc,omitempty"`
	// 监测供应商id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty"`
	// 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
	Scopes []*string `json:"scopes,omitempty" xml:"scopes,omitempty" type:"Repeated"`
	// 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
	TaskStart *int64 `json:"task_start,omitempty" xml:"task_start,omitempty"`
	// 任务持续时间，单位天，默认90天
	//
	// 一次性监测：0
	TaskDuration *int64 `json:"task_duration,omitempty" xml:"task_duration,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateMonitorTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMonitorTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateMonitorTaskRequest) SetAuthToken(v string) *CreateMonitorTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetProductInstanceId(v string) *CreateMonitorTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetSubmitContent(v string) *CreateMonitorTaskRequest {
	s.SubmitContent = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetSubmitType(v string) *CreateMonitorTaskRequest {
	s.SubmitType = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetFileType(v string) *CreateMonitorTaskRequest {
	s.FileType = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetTaskName(v string) *CreateMonitorTaskRequest {
	s.TaskName = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetContentTitle(v string) *CreateMonitorTaskRequest {
	s.ContentTitle = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetKeywords(v []*string) *CreateMonitorTaskRequest {
	s.Keywords = v
	return s
}

func (s *CreateMonitorTaskRequest) SetContentDesc(v string) *CreateMonitorTaskRequest {
	s.ContentDesc = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetProviderId(v string) *CreateMonitorTaskRequest {
	s.ProviderId = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetScopes(v []*string) *CreateMonitorTaskRequest {
	s.Scopes = v
	return s
}

func (s *CreateMonitorTaskRequest) SetTaskStart(v int64) *CreateMonitorTaskRequest {
	s.TaskStart = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetTaskDuration(v int64) *CreateMonitorTaskRequest {
	s.TaskDuration = &v
	return s
}

func (s *CreateMonitorTaskRequest) SetProxyInfo(v *ProxyData) *CreateMonitorTaskRequest {
	s.ProxyInfo = v
	return s
}

func (s *CreateMonitorTaskRequest) SetClientToken(v string) *CreateMonitorTaskRequest {
	s.ClientToken = &v
	return s
}

type CreateMonitorTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测任务Id
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty"`
}

func (s CreateMonitorTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMonitorTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateMonitorTaskResponse) SetReqMsgId(v string) *CreateMonitorTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMonitorTaskResponse) SetResultCode(v string) *CreateMonitorTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMonitorTaskResponse) SetResultMsg(v string) *CreateMonitorTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMonitorTaskResponse) SetMonitorTaskId(v string) *CreateMonitorTaskResponse {
	s.MonitorTaskId = &v
	return s
}

type StopMonitorTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 监测任务Id
	//
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
}

func (s StopMonitorTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s StopMonitorTaskRequest) GoString() string {
	return s.String()
}

func (s *StopMonitorTaskRequest) SetAuthToken(v string) *StopMonitorTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *StopMonitorTaskRequest) SetProductInstanceId(v string) *StopMonitorTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopMonitorTaskRequest) SetMonitorTaskId(v string) *StopMonitorTaskRequest {
	s.MonitorTaskId = &v
	return s
}

type StopMonitorTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StopMonitorTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s StopMonitorTaskResponse) GoString() string {
	return s.String()
}

func (s *StopMonitorTaskResponse) SetReqMsgId(v string) *StopMonitorTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopMonitorTaskResponse) SetResultCode(v string) *StopMonitorTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *StopMonitorTaskResponse) SetResultMsg(v string) *StopMonitorTaskResponse {
	s.ResultMsg = &v
	return s
}

type QueryMonitorTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 监测任务Id
	//
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
}

func (s QueryMonitorTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryMonitorTaskRequest) SetAuthToken(v string) *QueryMonitorTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMonitorTaskRequest) SetProductInstanceId(v string) *QueryMonitorTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMonitorTaskRequest) SetMonitorTaskId(v string) *QueryMonitorTaskRequest {
	s.MonitorTaskId = &v
	return s
}

type QueryMonitorTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测任务信息
	//
	//
	MonitorTask *MonitorTask `json:"monitor_task,omitempty" xml:"monitor_task,omitempty"`
}

func (s QueryMonitorTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryMonitorTaskResponse) SetReqMsgId(v string) *QueryMonitorTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMonitorTaskResponse) SetResultCode(v string) *QueryMonitorTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMonitorTaskResponse) SetResultMsg(v string) *QueryMonitorTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMonitorTaskResponse) SetMonitorTask(v *MonitorTask) *QueryMonitorTaskResponse {
	s.MonitorTask = v
	return s
}

type QueryMonitorResultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 监测任务Id
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
	// 页序号(>0)
	//
	//
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页大小(1-200)
	//
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryMonitorResultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorResultRequest) GoString() string {
	return s.String()
}

func (s *QueryMonitorResultRequest) SetAuthToken(v string) *QueryMonitorResultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMonitorResultRequest) SetProductInstanceId(v string) *QueryMonitorResultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMonitorResultRequest) SetMonitorTaskId(v string) *QueryMonitorResultRequest {
	s.MonitorTaskId = &v
	return s
}

func (s *QueryMonitorResultRequest) SetPageIndex(v int64) *QueryMonitorResultRequest {
	s.PageIndex = &v
	return s
}

func (s *QueryMonitorResultRequest) SetPageSize(v int64) *QueryMonitorResultRequest {
	s.PageSize = &v
	return s
}

type QueryMonitorResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测任务信息
	MonitorResultList []*MonitorResult `json:"monitor_result_list,omitempty" xml:"monitor_result_list,omitempty" type:"Repeated"`
	// 页序号(>0)
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 页大小(1-200)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 监测结果数量
	ResultCount *int64 `json:"result_count,omitempty" xml:"result_count,omitempty"`
}

func (s QueryMonitorResultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorResultResponse) GoString() string {
	return s.String()
}

func (s *QueryMonitorResultResponse) SetReqMsgId(v string) *QueryMonitorResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMonitorResultResponse) SetResultCode(v string) *QueryMonitorResultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMonitorResultResponse) SetResultMsg(v string) *QueryMonitorResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMonitorResultResponse) SetMonitorResultList(v []*MonitorResult) *QueryMonitorResultResponse {
	s.MonitorResultList = v
	return s
}

func (s *QueryMonitorResultResponse) SetPageIndex(v int64) *QueryMonitorResultResponse {
	s.PageIndex = &v
	return s
}

func (s *QueryMonitorResultResponse) SetPageSize(v int64) *QueryMonitorResultResponse {
	s.PageSize = &v
	return s
}

func (s *QueryMonitorResultResponse) SetResultCount(v int64) *QueryMonitorResultResponse {
	s.ResultCount = &v
	return s
}

type ListMonitorProviderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需监测文件类型
	MonitorTypes []*MonitorType `json:"monitor_types,omitempty" xml:"monitor_types,omitempty" require:"true" type:"Repeated"`
}

func (s ListMonitorProviderRequest) String() string {
	return tea.Prettify(s)
}

func (s ListMonitorProviderRequest) GoString() string {
	return s.String()
}

func (s *ListMonitorProviderRequest) SetAuthToken(v string) *ListMonitorProviderRequest {
	s.AuthToken = &v
	return s
}

func (s *ListMonitorProviderRequest) SetProductInstanceId(v string) *ListMonitorProviderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListMonitorProviderRequest) SetMonitorTypes(v []*MonitorType) *ListMonitorProviderRequest {
	s.MonitorTypes = v
	return s
}

type ListMonitorProviderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测能力提供方类型列表
	ProviderList []*MonitorProviderType `json:"provider_list,omitempty" xml:"provider_list,omitempty" type:"Repeated"`
}

func (s ListMonitorProviderResponse) String() string {
	return tea.Prettify(s)
}

func (s ListMonitorProviderResponse) GoString() string {
	return s.String()
}

func (s *ListMonitorProviderResponse) SetReqMsgId(v string) *ListMonitorProviderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListMonitorProviderResponse) SetResultCode(v string) *ListMonitorProviderResponse {
	s.ResultCode = &v
	return s
}

func (s *ListMonitorProviderResponse) SetResultMsg(v string) *ListMonitorProviderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListMonitorProviderResponse) SetProviderList(v []*MonitorProviderType) *ListMonitorProviderResponse {
	s.ProviderList = v
	return s
}

type CreateRecodescreenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证名称（最长128个字符）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 取证备注（最长512个字符）
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" maxLength:"512"`
	// 预校验网址和预打开网页（不能大于10条）
	Url []*string `json:"url,omitempty" xml:"url,omitempty" type:"Repeated"`
	// 取证类型 具体见附录 RecordScreenType
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 取证服务器地域 具体见附录 RecordScreenArea
	Area *string `json:"area,omitempty" xml:"area,omitempty" require:"true"`
	// 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
	ScreenCode *string `json:"screen_code,omitempty" xml:"screen_code,omitempty"`
	// 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
	MaxTimeInMin *int64 `json:"max_time_in_min,omitempty" xml:"max_time_in_min,omitempty" require:"true"`
	// 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
	WaitInMin *int64 `json:"wait_in_min,omitempty" xml:"wait_in_min,omitempty"`
	// 当所选地域无机器资源时，是否使用其它地域
	//
	// 目前取值只有默认值：FORBID
	CrossRegion *string `json:"cross_region,omitempty" xml:"cross_region,omitempty"`
	// ip地域取值
	//
	// 目前取值只有默认值：ANY
	IpType *string `json:"ip_type,omitempty" xml:"ip_type,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 公证处Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 取证人证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	//
	// 取证人证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 取证人证件类型 具体见附录CertType
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonNo *string `json:"legal_person_no,omitempty" xml:"legal_person_no,omitempty"`
	// 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
	Agent *string `json:"agent,omitempty" xml:"agent,omitempty"`
	// 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
	AgentNo *string `json:"agent_no,omitempty" xml:"agent_no,omitempty"`
	// 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateRecodescreenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRecodescreenRequest) GoString() string {
	return s.String()
}

func (s *CreateRecodescreenRequest) SetAuthToken(v string) *CreateRecodescreenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRecodescreenRequest) SetProductInstanceId(v string) *CreateRecodescreenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRecodescreenRequest) SetName(v string) *CreateRecodescreenRequest {
	s.Name = &v
	return s
}

func (s *CreateRecodescreenRequest) SetMemo(v string) *CreateRecodescreenRequest {
	s.Memo = &v
	return s
}

func (s *CreateRecodescreenRequest) SetUrl(v []*string) *CreateRecodescreenRequest {
	s.Url = v
	return s
}

func (s *CreateRecodescreenRequest) SetType(v string) *CreateRecodescreenRequest {
	s.Type = &v
	return s
}

func (s *CreateRecodescreenRequest) SetArea(v string) *CreateRecodescreenRequest {
	s.Area = &v
	return s
}

func (s *CreateRecodescreenRequest) SetScreenCode(v string) *CreateRecodescreenRequest {
	s.ScreenCode = &v
	return s
}

func (s *CreateRecodescreenRequest) SetMaxTimeInMin(v int64) *CreateRecodescreenRequest {
	s.MaxTimeInMin = &v
	return s
}

func (s *CreateRecodescreenRequest) SetWaitInMin(v int64) *CreateRecodescreenRequest {
	s.WaitInMin = &v
	return s
}

func (s *CreateRecodescreenRequest) SetCrossRegion(v string) *CreateRecodescreenRequest {
	s.CrossRegion = &v
	return s
}

func (s *CreateRecodescreenRequest) SetIpType(v string) *CreateRecodescreenRequest {
	s.IpType = &v
	return s
}

func (s *CreateRecodescreenRequest) SetCallbackUrl(v string) *CreateRecodescreenRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateRecodescreenRequest) SetOrgId(v string) *CreateRecodescreenRequest {
	s.OrgId = &v
	return s
}

func (s *CreateRecodescreenRequest) SetCertName(v string) *CreateRecodescreenRequest {
	s.CertName = &v
	return s
}

func (s *CreateRecodescreenRequest) SetCertNo(v string) *CreateRecodescreenRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRecodescreenRequest) SetCertType(v string) *CreateRecodescreenRequest {
	s.CertType = &v
	return s
}

func (s *CreateRecodescreenRequest) SetLegalPersonName(v string) *CreateRecodescreenRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateRecodescreenRequest) SetLegalPersonNo(v string) *CreateRecodescreenRequest {
	s.LegalPersonNo = &v
	return s
}

func (s *CreateRecodescreenRequest) SetAgent(v string) *CreateRecodescreenRequest {
	s.Agent = &v
	return s
}

func (s *CreateRecodescreenRequest) SetAgentNo(v string) *CreateRecodescreenRequest {
	s.AgentNo = &v
	return s
}

func (s *CreateRecodescreenRequest) SetPhoneNum(v string) *CreateRecodescreenRequest {
	s.PhoneNum = &v
	return s
}

func (s *CreateRecodescreenRequest) SetProxyInfo(v *ProxyData) *CreateRecodescreenRequest {
	s.ProxyInfo = v
	return s
}

func (s *CreateRecodescreenRequest) SetClientToken(v string) *CreateRecodescreenRequest {
	s.ClientToken = &v
	return s
}

type CreateRecodescreenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateRecodescreenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRecodescreenResponse) GoString() string {
	return s.String()
}

func (s *CreateRecodescreenResponse) SetReqMsgId(v string) *CreateRecodescreenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRecodescreenResponse) SetResultCode(v string) *CreateRecodescreenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRecodescreenResponse) SetResultMsg(v string) *CreateRecodescreenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRecodescreenResponse) SetEvidenceId(v string) *CreateRecodescreenResponse {
	s.EvidenceId = &v
	return s
}

type QueryRecodescreenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
}

func (s QueryRecodescreenRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRecodescreenRequest) GoString() string {
	return s.String()
}

func (s *QueryRecodescreenRequest) SetAuthToken(v string) *QueryRecodescreenRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRecodescreenRequest) SetProductInstanceId(v string) *QueryRecodescreenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRecodescreenRequest) SetEvidenceId(v string) *QueryRecodescreenRequest {
	s.EvidenceId = &v
	return s
}

type QueryRecodescreenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
	// 取证状态 具体见附录 RecordScreenStatus
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
	OperateUrl *string `json:"operate_url,omitempty" xml:"operate_url,omitempty"`
	// 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
	Data *RecordScreenData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRecodescreenResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRecodescreenResponse) GoString() string {
	return s.String()
}

func (s *QueryRecodescreenResponse) SetReqMsgId(v string) *QueryRecodescreenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRecodescreenResponse) SetResultCode(v string) *QueryRecodescreenResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRecodescreenResponse) SetResultMsg(v string) *QueryRecodescreenResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRecodescreenResponse) SetEvidenceId(v string) *QueryRecodescreenResponse {
	s.EvidenceId = &v
	return s
}

func (s *QueryRecodescreenResponse) SetStatus(v string) *QueryRecodescreenResponse {
	s.Status = &v
	return s
}

func (s *QueryRecodescreenResponse) SetOperateUrl(v string) *QueryRecodescreenResponse {
	s.OperateUrl = &v
	return s
}

func (s *QueryRecodescreenResponse) SetData(v *RecordScreenData) *QueryRecodescreenResponse {
	s.Data = v
	return s
}

type QueryUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户token，从cookie或者重定向链接获取
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserRequest) GoString() string {
	return s.String()
}

func (s *QueryUserRequest) SetAuthToken(v string) *QueryUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserRequest) SetProductInstanceId(v string) *QueryUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserRequest) SetToken(v string) *QueryUserRequest {
	s.Token = &v
	return s
}

type QueryUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否登录
	Login *bool `json:"login,omitempty" xml:"login,omitempty"`
	// 用户信息
	User *UserData `json:"user,omitempty" xml:"user,omitempty"`
}

func (s QueryUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserResponse) GoString() string {
	return s.String()
}

func (s *QueryUserResponse) SetReqMsgId(v string) *QueryUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserResponse) SetResultCode(v string) *QueryUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserResponse) SetResultMsg(v string) *QueryUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserResponse) SetLogin(v bool) *QueryUserResponse {
	s.Login = &v
	return s
}

func (s *QueryUserResponse) SetUser(v *UserData) *QueryUserResponse {
	s.User = v
	return s
}

type QueryUserListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码，从1开始
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true" minimum:"1"`
	// 每页数据，1~100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 用户状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryUserListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserListRequest) GoString() string {
	return s.String()
}

func (s *QueryUserListRequest) SetAuthToken(v string) *QueryUserListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserListRequest) SetProductInstanceId(v string) *QueryUserListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserListRequest) SetPageIndex(v int64) *QueryUserListRequest {
	s.PageIndex = &v
	return s
}

func (s *QueryUserListRequest) SetPageSize(v int64) *QueryUserListRequest {
	s.PageSize = &v
	return s
}

func (s *QueryUserListRequest) SetStatus(v string) *QueryUserListRequest {
	s.Status = &v
	return s
}

type QueryUserListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码，从1开始
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 每页数据，1~100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 用户信息列表
	UserList []*UserData `json:"user_list,omitempty" xml:"user_list,omitempty" type:"Repeated"`
}

func (s QueryUserListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserListResponse) GoString() string {
	return s.String()
}

func (s *QueryUserListResponse) SetReqMsgId(v string) *QueryUserListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserListResponse) SetResultCode(v string) *QueryUserListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserListResponse) SetResultMsg(v string) *QueryUserListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserListResponse) SetPageIndex(v int64) *QueryUserListResponse {
	s.PageIndex = &v
	return s
}

func (s *QueryUserListResponse) SetPageSize(v int64) *QueryUserListResponse {
	s.PageSize = &v
	return s
}

func (s *QueryUserListResponse) SetTotalCount(v int64) *QueryUserListResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryUserListResponse) SetUserList(v []*UserData) *QueryUserListResponse {
	s.UserList = v
	return s
}

type AddGoodRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品一级分类
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty" require:"true" maxLength:"20" minLength:"1"`
	// 幂等
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 商品名称
	GoodName *string `json:"good_name,omitempty" xml:"good_name,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// 权利内容id，权利申明获得
	RightId *string `json:"right_id,omitempty" xml:"right_id,omitempty" require:"true"`
	// 是否直接上架   Y 上架  N 不上架  默认：Y
	Selling *string `json:"selling,omitempty" xml:"selling,omitempty"`
	// 商品标签，英文逗号分割
	Tags *string `json:"tags,omitempty" xml:"tags,omitempty" maxLength:"200"`
	// 授权规格列表（数量1-3）
	SkuLists []*GoodSkuInfo `json:"sku_lists,omitempty" xml:"sku_lists,omitempty" require:"true" type:"Repeated"`
}

func (s AddGoodRequest) String() string {
	return tea.Prettify(s)
}

func (s AddGoodRequest) GoString() string {
	return s.String()
}

func (s *AddGoodRequest) SetAuthToken(v string) *AddGoodRequest {
	s.AuthToken = &v
	return s
}

func (s *AddGoodRequest) SetProductInstanceId(v string) *AddGoodRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddGoodRequest) SetClassification(v string) *AddGoodRequest {
	s.Classification = &v
	return s
}

func (s *AddGoodRequest) SetClientToken(v string) *AddGoodRequest {
	s.ClientToken = &v
	return s
}

func (s *AddGoodRequest) SetGoodName(v string) *AddGoodRequest {
	s.GoodName = &v
	return s
}

func (s *AddGoodRequest) SetRightId(v string) *AddGoodRequest {
	s.RightId = &v
	return s
}

func (s *AddGoodRequest) SetSelling(v string) *AddGoodRequest {
	s.Selling = &v
	return s
}

func (s *AddGoodRequest) SetTags(v string) *AddGoodRequest {
	s.Tags = &v
	return s
}

func (s *AddGoodRequest) SetSkuLists(v []*GoodSkuInfo) *AddGoodRequest {
	s.SkuLists = v
	return s
}

type AddGoodResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品id
	GoodId *string `json:"good_id,omitempty" xml:"good_id,omitempty"`
}

func (s AddGoodResponse) String() string {
	return tea.Prettify(s)
}

func (s AddGoodResponse) GoString() string {
	return s.String()
}

func (s *AddGoodResponse) SetReqMsgId(v string) *AddGoodResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddGoodResponse) SetResultCode(v string) *AddGoodResponse {
	s.ResultCode = &v
	return s
}

func (s *AddGoodResponse) SetResultMsg(v string) *AddGoodResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddGoodResponse) SetGoodId(v string) *AddGoodResponse {
	s.GoodId = &v
	return s
}

type CreateScreenshotRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证名称（最长128个字符）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 取证备注（最长512个字符）
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" maxLength:"512"`
	// 取证地址（最长2048个字符）
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true" maxLength:"2048" minLength:"8"`
	// 公证处Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 取证人证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 取证人证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 取证人证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonNo *string `json:"legal_person_no,omitempty" xml:"legal_person_no,omitempty"`
	// 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
	AgentNo *string `json:"agent_no,omitempty" xml:"agent_no,omitempty"`
	// 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true" maxLength:"64"`
}

func (s CreateScreenshotRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateScreenshotRequest) GoString() string {
	return s.String()
}

func (s *CreateScreenshotRequest) SetAuthToken(v string) *CreateScreenshotRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateScreenshotRequest) SetProductInstanceId(v string) *CreateScreenshotRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateScreenshotRequest) SetName(v string) *CreateScreenshotRequest {
	s.Name = &v
	return s
}

func (s *CreateScreenshotRequest) SetMemo(v string) *CreateScreenshotRequest {
	s.Memo = &v
	return s
}

func (s *CreateScreenshotRequest) SetUrl(v string) *CreateScreenshotRequest {
	s.Url = &v
	return s
}

func (s *CreateScreenshotRequest) SetOrgId(v string) *CreateScreenshotRequest {
	s.OrgId = &v
	return s
}

func (s *CreateScreenshotRequest) SetCertName(v string) *CreateScreenshotRequest {
	s.CertName = &v
	return s
}

func (s *CreateScreenshotRequest) SetCertNo(v string) *CreateScreenshotRequest {
	s.CertNo = &v
	return s
}

func (s *CreateScreenshotRequest) SetCertType(v string) *CreateScreenshotRequest {
	s.CertType = &v
	return s
}

func (s *CreateScreenshotRequest) SetLegalPersonName(v string) *CreateScreenshotRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateScreenshotRequest) SetLegalPersonNo(v string) *CreateScreenshotRequest {
	s.LegalPersonNo = &v
	return s
}

func (s *CreateScreenshotRequest) SetAgentName(v string) *CreateScreenshotRequest {
	s.AgentName = &v
	return s
}

func (s *CreateScreenshotRequest) SetAgentNo(v string) *CreateScreenshotRequest {
	s.AgentNo = &v
	return s
}

func (s *CreateScreenshotRequest) SetPhoneNum(v string) *CreateScreenshotRequest {
	s.PhoneNum = &v
	return s
}

func (s *CreateScreenshotRequest) SetProxyInfo(v *ProxyData) *CreateScreenshotRequest {
	s.ProxyInfo = v
	return s
}

func (s *CreateScreenshotRequest) SetClientToken(v string) *CreateScreenshotRequest {
	s.ClientToken = &v
	return s
}

type CreateScreenshotResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateScreenshotResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateScreenshotResponse) GoString() string {
	return s.String()
}

func (s *CreateScreenshotResponse) SetReqMsgId(v string) *CreateScreenshotResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateScreenshotResponse) SetResultCode(v string) *CreateScreenshotResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateScreenshotResponse) SetResultMsg(v string) *CreateScreenshotResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateScreenshotResponse) SetEvidenceId(v string) *CreateScreenshotResponse {
	s.EvidenceId = &v
	return s
}

type QueryScreenshotRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
}

func (s QueryScreenshotRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScreenshotRequest) GoString() string {
	return s.String()
}

func (s *QueryScreenshotRequest) SetAuthToken(v string) *QueryScreenshotRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScreenshotRequest) SetProductInstanceId(v string) *QueryScreenshotRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScreenshotRequest) SetEvidenceId(v string) *QueryScreenshotRequest {
	s.EvidenceId = &v
	return s
}

type QueryScreenshotResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
	// 取证状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 网页截图信息
	Data *ScreenshotData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryScreenshotResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScreenshotResponse) GoString() string {
	return s.String()
}

func (s *QueryScreenshotResponse) SetReqMsgId(v string) *QueryScreenshotResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScreenshotResponse) SetResultCode(v string) *QueryScreenshotResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScreenshotResponse) SetResultMsg(v string) *QueryScreenshotResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScreenshotResponse) SetEvidenceId(v string) *QueryScreenshotResponse {
	s.EvidenceId = &v
	return s
}

func (s *QueryScreenshotResponse) SetStatus(v string) *QueryScreenshotResponse {
	s.Status = &v
	return s
}

func (s *QueryScreenshotResponse) SetData(v *ScreenshotData) *QueryScreenshotResponse {
	s.Data = v
	return s
}

type VerifyBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 统一证据编号（存证交易HASH）
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
	//
	// (和fileId 二选一，必传一个，都传按fileHash为准)
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 文件OSS Id（上传文件有大小限制，文本文件最大100M，图片最大1G，视频和压缩包最大2G）
	//
	// (和fileHash 二选一，必传一个，都传按fileHash为准)
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
}

func (s VerifyBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyBlockchainRequest) GoString() string {
	return s.String()
}

func (s *VerifyBlockchainRequest) SetAuthToken(v string) *VerifyBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyBlockchainRequest) SetProductInstanceId(v string) *VerifyBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyBlockchainRequest) SetTxHash(v string) *VerifyBlockchainRequest {
	s.TxHash = &v
	return s
}

func (s *VerifyBlockchainRequest) SetFileHash(v string) *VerifyBlockchainRequest {
	s.FileHash = &v
	return s
}

func (s *VerifyBlockchainRequest) SetFileId(v string) *VerifyBlockchainRequest {
	s.FileId = &v
	return s
}

func (s *VerifyBlockchainRequest) SetCertName(v string) *VerifyBlockchainRequest {
	s.CertName = &v
	return s
}

func (s *VerifyBlockchainRequest) SetCertNo(v string) *VerifyBlockchainRequest {
	s.CertNo = &v
	return s
}

func (s *VerifyBlockchainRequest) SetCertType(v string) *VerifyBlockchainRequest {
	s.CertType = &v
	return s
}

type VerifyBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统一证据编号（存证交易HASH）
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 核验结果
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 所在区块hash
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// 区块链高度
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 存证类型
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 存证时间
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s VerifyBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyBlockchainResponse) GoString() string {
	return s.String()
}

func (s *VerifyBlockchainResponse) SetReqMsgId(v string) *VerifyBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyBlockchainResponse) SetResultCode(v string) *VerifyBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyBlockchainResponse) SetResultMsg(v string) *VerifyBlockchainResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyBlockchainResponse) SetTxHash(v string) *VerifyBlockchainResponse {
	s.TxHash = &v
	return s
}

func (s *VerifyBlockchainResponse) SetStatus(v string) *VerifyBlockchainResponse {
	s.Status = &v
	return s
}

func (s *VerifyBlockchainResponse) SetBlockHash(v string) *VerifyBlockchainResponse {
	s.BlockHash = &v
	return s
}

func (s *VerifyBlockchainResponse) SetBlockHeight(v int64) *VerifyBlockchainResponse {
	s.BlockHeight = &v
	return s
}

func (s *VerifyBlockchainResponse) SetDataType(v string) *VerifyBlockchainResponse {
	s.DataType = &v
	return s
}

func (s *VerifyBlockchainResponse) SetTimestamp(v string) *VerifyBlockchainResponse {
	s.Timestamp = &v
	return s
}

type CreateRecordscreenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证名称（最长128个字符）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 取证备注（最长512个字符）
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" maxLength:"512"`
	// 预校验网址和预打开网页（不能大于10条）
	Url []*string `json:"url,omitempty" xml:"url,omitempty" type:"Repeated"`
	// 取证类型 具体见附录 RecordScreenType
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 取证服务器地域 具体见附录 RecordScreenArea
	Area *string `json:"area,omitempty" xml:"area,omitempty" require:"true"`
	// 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
	ScreenCode *string `json:"screen_code,omitempty" xml:"screen_code,omitempty"`
	// 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
	MaxTimeInMin *int64 `json:"max_time_in_min,omitempty" xml:"max_time_in_min,omitempty" require:"true"`
	// 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
	WaitInMin *int64 `json:"wait_in_min,omitempty" xml:"wait_in_min,omitempty"`
	// 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
	CrossRegion *string `json:"cross_region,omitempty" xml:"cross_region,omitempty"`
	// ip地域取值 目前取值只有默认值：ANY
	IpType *string `json:"ip_type,omitempty" xml:"ip_type,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 公证处Id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty"`
	// 取证人证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 取证人证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 取证人证件类型 具体见附录CertType
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
	LegalPersonNo *string `json:"legal_person_no,omitempty" xml:"legal_person_no,omitempty"`
	// 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
	AgentNo *string `json:"agent_no,omitempty" xml:"agent_no,omitempty"`
	// 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateRecordscreenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRecordscreenRequest) GoString() string {
	return s.String()
}

func (s *CreateRecordscreenRequest) SetAuthToken(v string) *CreateRecordscreenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRecordscreenRequest) SetProductInstanceId(v string) *CreateRecordscreenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRecordscreenRequest) SetName(v string) *CreateRecordscreenRequest {
	s.Name = &v
	return s
}

func (s *CreateRecordscreenRequest) SetMemo(v string) *CreateRecordscreenRequest {
	s.Memo = &v
	return s
}

func (s *CreateRecordscreenRequest) SetUrl(v []*string) *CreateRecordscreenRequest {
	s.Url = v
	return s
}

func (s *CreateRecordscreenRequest) SetType(v string) *CreateRecordscreenRequest {
	s.Type = &v
	return s
}

func (s *CreateRecordscreenRequest) SetArea(v string) *CreateRecordscreenRequest {
	s.Area = &v
	return s
}

func (s *CreateRecordscreenRequest) SetScreenCode(v string) *CreateRecordscreenRequest {
	s.ScreenCode = &v
	return s
}

func (s *CreateRecordscreenRequest) SetMaxTimeInMin(v int64) *CreateRecordscreenRequest {
	s.MaxTimeInMin = &v
	return s
}

func (s *CreateRecordscreenRequest) SetWaitInMin(v int64) *CreateRecordscreenRequest {
	s.WaitInMin = &v
	return s
}

func (s *CreateRecordscreenRequest) SetCrossRegion(v string) *CreateRecordscreenRequest {
	s.CrossRegion = &v
	return s
}

func (s *CreateRecordscreenRequest) SetIpType(v string) *CreateRecordscreenRequest {
	s.IpType = &v
	return s
}

func (s *CreateRecordscreenRequest) SetCallbackUrl(v string) *CreateRecordscreenRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateRecordscreenRequest) SetOrgId(v string) *CreateRecordscreenRequest {
	s.OrgId = &v
	return s
}

func (s *CreateRecordscreenRequest) SetCertName(v string) *CreateRecordscreenRequest {
	s.CertName = &v
	return s
}

func (s *CreateRecordscreenRequest) SetCertNo(v string) *CreateRecordscreenRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRecordscreenRequest) SetCertType(v string) *CreateRecordscreenRequest {
	s.CertType = &v
	return s
}

func (s *CreateRecordscreenRequest) SetLegalPersonName(v string) *CreateRecordscreenRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateRecordscreenRequest) SetLegalPersonNo(v string) *CreateRecordscreenRequest {
	s.LegalPersonNo = &v
	return s
}

func (s *CreateRecordscreenRequest) SetAgentName(v string) *CreateRecordscreenRequest {
	s.AgentName = &v
	return s
}

func (s *CreateRecordscreenRequest) SetAgentNo(v string) *CreateRecordscreenRequest {
	s.AgentNo = &v
	return s
}

func (s *CreateRecordscreenRequest) SetPhoneNum(v string) *CreateRecordscreenRequest {
	s.PhoneNum = &v
	return s
}

func (s *CreateRecordscreenRequest) SetProxyInfo(v *ProxyData) *CreateRecordscreenRequest {
	s.ProxyInfo = v
	return s
}

func (s *CreateRecordscreenRequest) SetClientToken(v string) *CreateRecordscreenRequest {
	s.ClientToken = &v
	return s
}

type CreateRecordscreenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateRecordscreenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRecordscreenResponse) GoString() string {
	return s.String()
}

func (s *CreateRecordscreenResponse) SetReqMsgId(v string) *CreateRecordscreenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRecordscreenResponse) SetResultCode(v string) *CreateRecordscreenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRecordscreenResponse) SetResultMsg(v string) *CreateRecordscreenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRecordscreenResponse) SetEvidenceId(v string) *CreateRecordscreenResponse {
	s.EvidenceId = &v
	return s
}

type QueryRecordscreenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
}

func (s QueryRecordscreenRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRecordscreenRequest) GoString() string {
	return s.String()
}

func (s *QueryRecordscreenRequest) SetAuthToken(v string) *QueryRecordscreenRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRecordscreenRequest) SetProductInstanceId(v string) *QueryRecordscreenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRecordscreenRequest) SetEvidenceId(v string) *QueryRecordscreenRequest {
	s.EvidenceId = &v
	return s
}

type QueryRecordscreenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
	// 取证状态 具体见附录 RecordScreenStatus
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
	OperateUrl *string `json:"operate_url,omitempty" xml:"operate_url,omitempty"`
	// 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
	Data *RecordScreenData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRecordscreenResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRecordscreenResponse) GoString() string {
	return s.String()
}

func (s *QueryRecordscreenResponse) SetReqMsgId(v string) *QueryRecordscreenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRecordscreenResponse) SetResultCode(v string) *QueryRecordscreenResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRecordscreenResponse) SetResultMsg(v string) *QueryRecordscreenResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRecordscreenResponse) SetEvidenceId(v string) *QueryRecordscreenResponse {
	s.EvidenceId = &v
	return s
}

func (s *QueryRecordscreenResponse) SetStatus(v string) *QueryRecordscreenResponse {
	s.Status = &v
	return s
}

func (s *QueryRecordscreenResponse) SetOperateUrl(v string) *QueryRecordscreenResponse {
	s.OperateUrl = &v
	return s
}

func (s *QueryRecordscreenResponse) SetData(v *RecordScreenData) *QueryRecordscreenResponse {
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
				"sdk_version":      tea.String("1.8.15"),
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
 * Description: 调用接口获取版权开放平台授权访问oss链接
 * Summary: 获取授权访问oss链接
 */
func (client *Client) GetUploadurl(request *GetUploadurlRequest) (_result *GetUploadurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetUploadurlResponse{}
	_body, _err := client.GetUploadurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用接口获取版权开放平台授权访问oss链接
 * Summary: 获取授权访问oss链接
 */
func (client *Client) GetUploadurlEx(request *GetUploadurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetUploadurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetUploadurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.uploadurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权开发平台hash登记
 * Summary: 新增HASH版权登记
 */
func (client *Client) AddHashregister(request *AddHashregisterRequest) (_result *AddHashregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddHashregisterResponse{}
	_body, _err := client.AddHashregisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权开发平台hash登记
 * Summary: 新增HASH版权登记
 */
func (client *Client) AddHashregisterEx(request *AddHashregisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddHashregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddHashregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.hashregister.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台新增版权登记
 * Summary: 新增版权登记
 */
func (client *Client) AddRegister(request *AddRegisterRequest) (_result *AddRegisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddRegisterResponse{}
	_body, _err := client.AddRegisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台新增版权登记
 * Summary: 新增版权登记
 */
func (client *Client) AddRegisterEx(request *AddRegisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddRegisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddRegisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.register.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台查询版权登记状态
 * Summary: 查询版权登记状态
 */
func (client *Client) QueryRegisterstatus(request *QueryRegisterstatusRequest) (_result *QueryRegisterstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRegisterstatusResponse{}
	_body, _err := client.QueryRegisterstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台查询版权登记状态
 * Summary: 查询版权登记状态
 */
func (client *Client) QueryRegisterstatusEx(request *QueryRegisterstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRegisterstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRegisterstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.registerstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台生成版权登记证书
 * Summary: 生成版权登记证书
 */
func (client *Client) CreateCertificate(request *CreateCertificateRequest) (_result *CreateCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCertificateResponse{}
	_body, _err := client.CreateCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台生成版权登记证书
 * Summary: 生成版权登记证书
 */
func (client *Client) CreateCertificateEx(request *CreateCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.certificate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台获取版权登记证书
 * Summary: 获取版权登记证书
 */
func (client *Client) GetCertificate(request *GetCertificateRequest) (_result *GetCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCertificateResponse{}
	_body, _err := client.GetCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台获取版权登记证书
 * Summary: 获取版权登记证书
 */
func (client *Client) GetCertificateEx(request *GetCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增版权监测任务
 * Summary: 新增版权监测
 */
func (client *Client) CreateMonitorTask(request *CreateMonitorTaskRequest) (_result *CreateMonitorTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMonitorTaskResponse{}
	_body, _err := client.CreateMonitorTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增版权监测任务
 * Summary: 新增版权监测
 */
func (client *Client) CreateMonitorTaskEx(request *CreateMonitorTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMonitorTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMonitorTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.monitor.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 停止版权监测任务
 * Summary: 停止版权监测
 */
func (client *Client) StopMonitorTask(request *StopMonitorTaskRequest) (_result *StopMonitorTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopMonitorTaskResponse{}
	_body, _err := client.StopMonitorTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 停止版权监测任务
 * Summary: 停止版权监测
 */
func (client *Client) StopMonitorTaskEx(request *StopMonitorTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopMonitorTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopMonitorTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.monitor.task.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询版权监测任务
 * Summary: 查询版权监测
 */
func (client *Client) QueryMonitorTask(request *QueryMonitorTaskRequest) (_result *QueryMonitorTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMonitorTaskResponse{}
	_body, _err := client.QueryMonitorTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询版权监测任务
 * Summary: 查询版权监测
 */
func (client *Client) QueryMonitorTaskEx(request *QueryMonitorTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMonitorTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMonitorTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.monitor.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询版权任务监测结果
 * Summary: 查询版权监测结果
 */
func (client *Client) QueryMonitorResult(request *QueryMonitorResultRequest) (_result *QueryMonitorResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMonitorResultResponse{}
	_body, _err := client.QueryMonitorResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询版权任务监测结果
 * Summary: 查询版权监测结果
 */
func (client *Client) QueryMonitorResultEx(request *QueryMonitorResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMonitorResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMonitorResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.monitor.result.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取传播监测能力服务商列表
 * Summary: 获取传播监测能力服务商列表
 */
func (client *Client) ListMonitorProvider(request *ListMonitorProviderRequest) (_result *ListMonitorProviderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListMonitorProviderResponse{}
	_body, _err := client.ListMonitorProviderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取传播监测能力服务商列表
 * Summary: 获取传播监测能力服务商列表
 */
func (client *Client) ListMonitorProviderEx(request *ListMonitorProviderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListMonitorProviderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListMonitorProviderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.monitor.provider.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建录屏取证(废弃)
 * Summary: 创建录屏取证(废弃)
 */
func (client *Client) CreateRecodescreen(request *CreateRecodescreenRequest) (_result *CreateRecodescreenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRecodescreenResponse{}
	_body, _err := client.CreateRecodescreenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建录屏取证(废弃)
 * Summary: 创建录屏取证(废弃)
 */
func (client *Client) CreateRecodescreenEx(request *CreateRecodescreenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRecodescreenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRecodescreenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.recodescreen.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询录屏取证(废弃)
 * Summary: 查询录屏取证(废弃)
 */
func (client *Client) QueryRecodescreen(request *QueryRecodescreenRequest) (_result *QueryRecodescreenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRecodescreenResponse{}
	_body, _err := client.QueryRecodescreenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询录屏取证(废弃)
 * Summary: 查询录屏取证(废弃)
 */
func (client *Client) QueryRecodescreenEx(request *QueryRecodescreenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRecodescreenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRecodescreenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.recodescreen.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户信息查询
 * Summary: 用户信息查询
 */
func (client *Client) QueryUser(request *QueryUserRequest) (_result *QueryUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserResponse{}
	_body, _err := client.QueryUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户信息查询
 * Summary: 用户信息查询
 */
func (client *Client) QueryUserEx(request *QueryUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户信息列表
 * Summary: 查询用户信息列表
 */
func (client *Client) QueryUserList(request *QueryUserListRequest) (_result *QueryUserListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserListResponse{}
	_body, _err := client.QueryUserListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户信息列表
 * Summary: 查询用户信息列表
 */
func (client *Client) QueryUserListEx(request *QueryUserListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.user.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台新增商品
 * Summary: 新增商品
 */
func (client *Client) AddGood(request *AddGoodRequest) (_result *AddGoodResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddGoodResponse{}
	_body, _err := client.AddGoodEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台新增商品
 * Summary: 新增商品
 */
func (client *Client) AddGoodEx(request *AddGoodRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddGoodResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddGoodResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.good.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建网页取证
 * Summary: 创建网页取证
 */
func (client *Client) CreateScreenshot(request *CreateScreenshotRequest) (_result *CreateScreenshotResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateScreenshotResponse{}
	_body, _err := client.CreateScreenshotEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建网页取证
 * Summary: 创建网页取证
 */
func (client *Client) CreateScreenshotEx(request *CreateScreenshotRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateScreenshotResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateScreenshotResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.screenshot.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询网页取证
 * Summary: 查询网页取证
 */
func (client *Client) QueryScreenshot(request *QueryScreenshotRequest) (_result *QueryScreenshotResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScreenshotResponse{}
	_body, _err := client.QueryScreenshotEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询网页取证
 * Summary: 查询网页取证
 */
func (client *Client) QueryScreenshotEx(request *QueryScreenshotRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScreenshotResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScreenshotResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.screenshot.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上核验
 * Summary: 链上核验
 */
func (client *Client) VerifyBlockchain(request *VerifyBlockchainRequest) (_result *VerifyBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyBlockchainResponse{}
	_body, _err := client.VerifyBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上核验
 * Summary: 链上核验
 */
func (client *Client) VerifyBlockchainEx(request *VerifyBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.blockchain.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建录屏取证
 * Summary: 创建录屏取证
 */
func (client *Client) CreateRecordscreen(request *CreateRecordscreenRequest) (_result *CreateRecordscreenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRecordscreenResponse{}
	_body, _err := client.CreateRecordscreenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建录屏取证
 * Summary: 创建录屏取证
 */
func (client *Client) CreateRecordscreenEx(request *CreateRecordscreenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRecordscreenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRecordscreenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.recordscreen.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询录屏取证
 * Summary: 查询录屏取证
 */
func (client *Client) QueryRecordscreen(request *QueryRecordscreenRequest) (_result *QueryRecordscreenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRecordscreenResponse{}
	_body, _err := client.QueryRecordscreenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询录屏取证
 * Summary: 查询录屏取证
 */
func (client *Client) QueryRecordscreenEx(request *QueryRecordscreenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRecordscreenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRecordscreenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.recordscreen.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
