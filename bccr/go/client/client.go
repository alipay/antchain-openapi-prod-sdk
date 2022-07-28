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

// 网页取证具体信息
type ScreenshotInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 自清洁文件下载链接
	CheckLogFile *string `json:"check_log_file,omitempty" xml:"check_log_file,omitempty"`
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

func (s *ScreenshotInfo) SetCheckLogFile(v string) *ScreenshotInfo {
	s.CheckLogFile = &v
	return s
}

func (s *ScreenshotInfo) SetScreenshotFile(v string) *ScreenshotInfo {
	s.ScreenshotFile = &v
	return s
}

// 取证文件信息
type ScreenInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 自清洁文件下载地址
	CheckLogFile *string `json:"check_log_file,omitempty" xml:"check_log_file,omitempty"`
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

func (s *ScreenInfo) SetCheckLogFile(v string) *ScreenInfo {
	s.CheckLogFile = &v
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
	// 证据包存证交易hash
	ZipTxHash *string `json:"zip_tx_hash,omitempty" xml:"zip_tx_hash,omitempty"`
	// 取证备注信息
	Inventory *string `json:"inventory,omitempty" xml:"inventory,omitempty"`
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

func (s *RecordScreenData) SetZipTxHash(v string) *RecordScreenData {
	s.ZipTxHash = &v
	return s
}

func (s *RecordScreenData) SetInventory(v string) *RecordScreenData {
	s.Inventory = &v
	return s
}

// 权利声明核验信息
type VerifyStatementData struct {
	// 权利声明书存证交易HASH
	StatementTxHash *string `json:"statement_tx_hash,omitempty" xml:"statement_tx_hash,omitempty"`
	// 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
	StatementFileId *string `json:"statement_file_id,omitempty" xml:"statement_file_id,omitempty"`
	// 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
	StatementFileHash *string `json:"statement_file_hash,omitempty" xml:"statement_file_hash,omitempty"`
}

func (s VerifyStatementData) String() string {
	return tea.Prettify(s)
}

func (s VerifyStatementData) GoString() string {
	return s.String()
}

func (s *VerifyStatementData) SetStatementTxHash(v string) *VerifyStatementData {
	s.StatementTxHash = &v
	return s
}

func (s *VerifyStatementData) SetStatementFileId(v string) *VerifyStatementData {
	s.StatementFileId = &v
	return s
}

func (s *VerifyStatementData) SetStatementFileHash(v string) *VerifyStatementData {
	s.StatementFileHash = &v
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

// 公证处信息
type NotaryPublicOffice struct {
	// 公证处code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 公证处名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 公证处所在省（直辖市）
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 公证处所在市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 公证处完整名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
}

func (s NotaryPublicOffice) String() string {
	return tea.Prettify(s)
}

func (s NotaryPublicOffice) GoString() string {
	return s.String()
}

func (s *NotaryPublicOffice) SetCode(v string) *NotaryPublicOffice {
	s.Code = &v
	return s
}

func (s *NotaryPublicOffice) SetName(v string) *NotaryPublicOffice {
	s.Name = &v
	return s
}

func (s *NotaryPublicOffice) SetProvince(v string) *NotaryPublicOffice {
	s.Province = &v
	return s
}

func (s *NotaryPublicOffice) SetCity(v string) *NotaryPublicOffice {
	s.City = &v
	return s
}

func (s *NotaryPublicOffice) SetOrgName(v string) *NotaryPublicOffice {
	s.OrgName = &v
	return s
}

// 网页取证数据
type ScreenshotData struct {
	// 取证地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 网页取证时间
	GmtEvidence *int64 `json:"gmt_evidence,omitempty" xml:"gmt_evidence,omitempty"`
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
	// 网页title
	HeadTitle *string `json:"head_title,omitempty" xml:"head_title,omitempty"`
	// 证据包交易hash
	ZipTxHash *string `json:"zip_tx_hash,omitempty" xml:"zip_tx_hash,omitempty"`
	// 网页取证失败原因
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 中文失败原因
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
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

func (s *ScreenshotData) SetHeadTitle(v string) *ScreenshotData {
	s.HeadTitle = &v
	return s
}

func (s *ScreenshotData) SetZipTxHash(v string) *ScreenshotData {
	s.ZipTxHash = &v
	return s
}

func (s *ScreenshotData) SetErrorReason(v string) *ScreenshotData {
	s.ErrorReason = &v
	return s
}

func (s *ScreenshotData) SetErrorReasonCn(v string) *ScreenshotData {
	s.ErrorReasonCn = &v
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

// dci作品发表信息
type DciPublicationInfo struct {
	// 作品发表状态
	PublicationStatus *string `json:"publication_status,omitempty" xml:"publication_status,omitempty" require:"true"`
	// 首次发表日期
	FirstPublicationDate *string `json:"first_publication_date,omitempty" xml:"first_publication_date,omitempty" require:"true"`
	// 首次发表地址
	FirstPublicationPlace *string `json:"first_publication_place,omitempty" xml:"first_publication_place,omitempty" require:"true"`
}

func (s DciPublicationInfo) String() string {
	return tea.Prettify(s)
}

func (s DciPublicationInfo) GoString() string {
	return s.String()
}

func (s *DciPublicationInfo) SetPublicationStatus(v string) *DciPublicationInfo {
	s.PublicationStatus = &v
	return s
}

func (s *DciPublicationInfo) SetFirstPublicationDate(v string) *DciPublicationInfo {
	s.FirstPublicationDate = &v
	return s
}

func (s *DciPublicationInfo) SetFirstPublicationPlace(v string) *DciPublicationInfo {
	s.FirstPublicationPlace = &v
	return s
}

// dci作品创作信息
type DciCreationInfo struct {
	// 作品创作性质
	CreationNature *string `json:"creation_nature,omitempty" xml:"creation_nature,omitempty" require:"true"`
	// 创作完成日期
	CreationCompletionDate *string `json:"creation_completion_date,omitempty" xml:"creation_completion_date,omitempty" require:"true"`
	// 创作完成地点
	CreationCompletionPlace *string `json:"creation_completion_place,omitempty" xml:"creation_completion_place,omitempty" require:"true"`
}

func (s DciCreationInfo) String() string {
	return tea.Prettify(s)
}

func (s DciCreationInfo) GoString() string {
	return s.String()
}

func (s *DciCreationInfo) SetCreationNature(v string) *DciCreationInfo {
	s.CreationNature = &v
	return s
}

func (s *DciCreationInfo) SetCreationCompletionDate(v string) *DciCreationInfo {
	s.CreationCompletionDate = &v
	return s
}

func (s *DciCreationInfo) SetCreationCompletionPlace(v string) *DciCreationInfo {
	s.CreationCompletionPlace = &v
	return s
}

// 权利信息
type RightsInfo struct {
	// 作品创作完成时间
	CompletedTime *int64 `json:"completed_time,omitempty" xml:"completed_time,omitempty" require:"true"`
	// 作品创作完成地点（最长128个字符）
	CompletedPlace *string `json:"completed_place,omitempty" xml:"completed_place,omitempty" require:"true" maxLength:"128"`
	// 是否发表
	IsPublish *bool `json:"is_publish,omitempty" xml:"is_publish,omitempty" require:"true"`
	// 发表时间（如果isPublish为true则必填）
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 发表地点（如果isPublish为true则必填，最长128个字符）
	PublishPlace *string `json:"publish_place,omitempty" xml:"publish_place,omitempty" maxLength:"128"`
	// 发表网址（如果isPublish为true则必填，最长1024个字符）
	PublishWeb *string `json:"publish_web,omitempty" xml:"publish_web,omitempty" maxLength:"1024"`
	// 是否是作者
	IsAuthor *bool `json:"is_author,omitempty" xml:"is_author,omitempty" require:"true"`
	// 作者姓名（如果isAuthor为true则必填，最长32个字符）
	AuthorCertName *string `json:"author_cert_name,omitempty" xml:"author_cert_name,omitempty" maxLength:"32"`
	// 作者身份证号（如果isAuthor为true则必填）
	AuthorCertNo *string `json:"author_cert_no,omitempty" xml:"author_cert_no,omitempty" maxLength:"30"`
}

func (s RightsInfo) String() string {
	return tea.Prettify(s)
}

func (s RightsInfo) GoString() string {
	return s.String()
}

func (s *RightsInfo) SetCompletedTime(v int64) *RightsInfo {
	s.CompletedTime = &v
	return s
}

func (s *RightsInfo) SetCompletedPlace(v string) *RightsInfo {
	s.CompletedPlace = &v
	return s
}

func (s *RightsInfo) SetIsPublish(v bool) *RightsInfo {
	s.IsPublish = &v
	return s
}

func (s *RightsInfo) SetPublishTime(v int64) *RightsInfo {
	s.PublishTime = &v
	return s
}

func (s *RightsInfo) SetPublishPlace(v string) *RightsInfo {
	s.PublishPlace = &v
	return s
}

func (s *RightsInfo) SetPublishWeb(v string) *RightsInfo {
	s.PublishWeb = &v
	return s
}

func (s *RightsInfo) SetIsAuthor(v bool) *RightsInfo {
	s.IsAuthor = &v
	return s
}

func (s *RightsInfo) SetAuthorCertName(v string) *RightsInfo {
	s.AuthorCertName = &v
	return s
}

func (s *RightsInfo) SetAuthorCertNo(v string) *RightsInfo {
	s.AuthorCertNo = &v
	return s
}

// 核验用户信息
type VerifyUserData struct {
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 登记人信息存证交易HASH
	RegisterPersonTxHash *string `json:"register_person_tx_hash,omitempty" xml:"register_person_tx_hash,omitempty"`
}

func (s VerifyUserData) String() string {
	return tea.Prettify(s)
}

func (s VerifyUserData) GoString() string {
	return s.String()
}

func (s *VerifyUserData) SetCertName(v string) *VerifyUserData {
	s.CertName = &v
	return s
}

func (s *VerifyUserData) SetCertNo(v string) *VerifyUserData {
	s.CertNo = &v
	return s
}

func (s *VerifyUserData) SetCertType(v string) *VerifyUserData {
	s.CertType = &v
	return s
}

func (s *VerifyUserData) SetRegisterPersonTxHash(v string) *VerifyUserData {
	s.RegisterPersonTxHash = &v
	return s
}

// 授权信息
type AuthInfo struct {
	// 授权权利项
	RightCode *string `json:"right_code,omitempty" xml:"right_code,omitempty" require:"true"`
	// 许可地域，默认中国境内，不包括香港等
	RegionCode *string `json:"region_code,omitempty" xml:"region_code,omitempty"`
	// 许可方式
	UsageCode *string `json:"usage_code,omitempty" xml:"usage_code,omitempty" require:"true"`
	// 许可终端
	TerminalCode *string `json:"terminal_code,omitempty" xml:"terminal_code,omitempty" require:"true"`
	// 传播媒介，默认互联网
	MediaCode *string `json:"media_code,omitempty" xml:"media_code,omitempty"`
	// 是否独占,默认 普通专有 GENERAL
	RightItemCharacter *string `json:"right_item_character,omitempty" xml:"right_item_character,omitempty"`
	// 是否可转让,默认不可转让
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty"`
}

func (s AuthInfo) String() string {
	return tea.Prettify(s)
}

func (s AuthInfo) GoString() string {
	return s.String()
}

func (s *AuthInfo) SetRightCode(v string) *AuthInfo {
	s.RightCode = &v
	return s
}

func (s *AuthInfo) SetRegionCode(v string) *AuthInfo {
	s.RegionCode = &v
	return s
}

func (s *AuthInfo) SetUsageCode(v string) *AuthInfo {
	s.UsageCode = &v
	return s
}

func (s *AuthInfo) SetTerminalCode(v string) *AuthInfo {
	s.TerminalCode = &v
	return s
}

func (s *AuthInfo) SetMediaCode(v string) *AuthInfo {
	s.MediaCode = &v
	return s
}

func (s *AuthInfo) SetRightItemCharacter(v string) *AuthInfo {
	s.RightItemCharacter = &v
	return s
}

func (s *AuthInfo) SetTransferStatus(v string) *AuthInfo {
	s.TransferStatus = &v
	return s
}

// 放弃取证信息
type ScreenCancelInfo struct {
	// 允许放弃时长（分钟）
	CancelInMin *int64 `json:"cancel_in_min,omitempty" xml:"cancel_in_min,omitempty" require:"true"`
	// 可用放弃次数
	CancelAttemptLeft *int64 `json:"cancel_attempt_left,omitempty" xml:"cancel_attempt_left,omitempty" require:"true"`
}

func (s ScreenCancelInfo) String() string {
	return tea.Prettify(s)
}

func (s ScreenCancelInfo) GoString() string {
	return s.String()
}

func (s *ScreenCancelInfo) SetCancelInMin(v int64) *ScreenCancelInfo {
	s.CancelInMin = &v
	return s
}

func (s *ScreenCancelInfo) SetCancelAttemptLeft(v int64) *ScreenCancelInfo {
	s.CancelAttemptLeft = &v
	return s
}

// 取证网址信息
type EvidenceUrlInfo struct {
	// 取证网址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 音视频取证时间
	AutoSurfingMinute *int64 `json:"auto_surfing_minute,omitempty" xml:"auto_surfing_minute,omitempty"`
}

func (s EvidenceUrlInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidenceUrlInfo) GoString() string {
	return s.String()
}

func (s *EvidenceUrlInfo) SetUrl(v string) *EvidenceUrlInfo {
	s.Url = &v
	return s
}

func (s *EvidenceUrlInfo) SetAutoSurfingMinute(v int64) *EvidenceUrlInfo {
	s.AutoSurfingMinute = &v
	return s
}

// 定向监测结果
type DirectMonitorResult struct {
	// 监测结果id
	MonitorResultId *string `json:"monitor_result_id,omitempty" xml:"monitor_result_id,omitempty" require:"true"`
	// 相似的资源链接
	SimilarResourceUrl *string `json:"similar_resource_url,omitempty" xml:"similar_resource_url,omitempty" require:"true"`
	// 相似资源所在的网址链接
	SimilarWebUrl *string `json:"similar_web_url,omitempty" xml:"similar_web_url,omitempty" require:"true"`
	// 资源标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 资源作者
	Author *string `json:"author,omitempty" xml:"author,omitempty"`
	// 资源上传时间，格式yyyy-MM-dd HH:mm:ss
	UploadTime *string `json:"upload_time,omitempty" xml:"upload_time,omitempty"`
}

func (s DirectMonitorResult) String() string {
	return tea.Prettify(s)
}

func (s DirectMonitorResult) GoString() string {
	return s.String()
}

func (s *DirectMonitorResult) SetMonitorResultId(v string) *DirectMonitorResult {
	s.MonitorResultId = &v
	return s
}

func (s *DirectMonitorResult) SetSimilarResourceUrl(v string) *DirectMonitorResult {
	s.SimilarResourceUrl = &v
	return s
}

func (s *DirectMonitorResult) SetSimilarWebUrl(v string) *DirectMonitorResult {
	s.SimilarWebUrl = &v
	return s
}

func (s *DirectMonitorResult) SetTitle(v string) *DirectMonitorResult {
	s.Title = &v
	return s
}

func (s *DirectMonitorResult) SetAuthor(v string) *DirectMonitorResult {
	s.Author = &v
	return s
}

func (s *DirectMonitorResult) SetUploadTime(v string) *DirectMonitorResult {
	s.UploadTime = &v
	return s
}

// 内容安全信息
type SecurityData struct {
	// 内容安全检查结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 有风险的内容
	RiskData []*string `json:"risk_data,omitempty" xml:"risk_data,omitempty" type:"Repeated"`
}

func (s SecurityData) String() string {
	return tea.Prettify(s)
}

func (s SecurityData) GoString() string {
	return s.String()
}

func (s *SecurityData) SetResult(v string) *SecurityData {
	s.Result = &v
	return s
}

func (s *SecurityData) SetRiskData(v []*string) *SecurityData {
	s.RiskData = v
	return s
}

// 账号信息
type AccountData struct {
	// 账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 账号名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 账号平台（支付宝，淘宝，微信，抖音等）
	AccountPlatform *string `json:"account_platform,omitempty" xml:"account_platform,omitempty" require:"true"`
}

func (s AccountData) String() string {
	return tea.Prettify(s)
}

func (s AccountData) GoString() string {
	return s.String()
}

func (s *AccountData) SetAccountId(v string) *AccountData {
	s.AccountId = &v
	return s
}

func (s *AccountData) SetAccountName(v string) *AccountData {
	s.AccountName = &v
	return s
}

func (s *AccountData) SetAccountPlatform(v string) *AccountData {
	s.AccountPlatform = &v
	return s
}

// 代理信息
type ProxyData struct {
	// 金融云租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
	// 是否计量
	IfMeasure *bool `json:"if_measure,omitempty" xml:"if_measure,omitempty"`
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

func (s *ProxyData) SetIfMeasure(v bool) *ProxyData {
	s.IfMeasure = &v
	return s
}

// 著作权人证件信息
type CopyrightCertInfo struct {
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
}

func (s CopyrightCertInfo) String() string {
	return tea.Prettify(s)
}

func (s CopyrightCertInfo) GoString() string {
	return s.String()
}

func (s *CopyrightCertInfo) SetCertNo(v string) *CopyrightCertInfo {
	s.CertNo = &v
	return s
}

func (s *CopyrightCertInfo) SetCertName(v string) *CopyrightCertInfo {
	s.CertName = &v
	return s
}

func (s *CopyrightCertInfo) SetCertType(v string) *CopyrightCertInfo {
	s.CertType = &v
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
	// 当status为failure时的具体错误信息（中文描述）
	FailureMsg *string `json:"failure_msg,omitempty" xml:"failure_msg,omitempty"`
	// 当status为failure时的具体错误信息（错误枚举）
	FailureCode *string `json:"failure_code,omitempty" xml:"failure_code,omitempty"`
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

func (s *MonitorTask) SetFailureCode(v string) *MonitorTask {
	s.FailureCode = &v
	return s
}

// 核验取证信息
type VerifyEvidenceData struct {
	// 操作日志交易HASH
	ProcessLogTxHash *string `json:"process_log_tx_hash,omitempty" xml:"process_log_tx_hash,omitempty"`
	// 自清洁日志交易HASH
	CheckLogTxHash *string `json:"check_log_tx_hash,omitempty" xml:"check_log_tx_hash,omitempty"`
}

func (s VerifyEvidenceData) String() string {
	return tea.Prettify(s)
}

func (s VerifyEvidenceData) GoString() string {
	return s.String()
}

func (s *VerifyEvidenceData) SetProcessLogTxHash(v string) *VerifyEvidenceData {
	s.ProcessLogTxHash = &v
	return s
}

func (s *VerifyEvidenceData) SetCheckLogTxHash(v string) *VerifyEvidenceData {
	s.CheckLogTxHash = &v
	return s
}

// 商品信息
type GoodsInfo struct {
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty"`
	// 商品名称
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty"`
	// 商品状态
	GoodsStatus *string `json:"goods_status,omitempty" xml:"goods_status,omitempty"`
	// 商品分类
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty"`
	// 售卖数量
	TotalSoldNum *int64 `json:"total_sold_num,omitempty" xml:"total_sold_num,omitempty"`
	// 售价（分）
	StandardPriceInCent *int64 `json:"standard_price_in_cent,omitempty" xml:"standard_price_in_cent,omitempty"`
	// 商品标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 授权期限起始时间
	AuthStartTime *int64 `json:"auth_start_time,omitempty" xml:"auth_start_time,omitempty"`
	// 授权期限结束时间
	AuthEndTime *int64 `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty"`
	// 发布时间
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

func (s *GoodsInfo) SetGoodsId(v string) *GoodsInfo {
	s.GoodsId = &v
	return s
}

func (s *GoodsInfo) SetGoodsName(v string) *GoodsInfo {
	s.GoodsName = &v
	return s
}

func (s *GoodsInfo) SetGoodsStatus(v string) *GoodsInfo {
	s.GoodsStatus = &v
	return s
}

func (s *GoodsInfo) SetClassification(v string) *GoodsInfo {
	s.Classification = &v
	return s
}

func (s *GoodsInfo) SetTotalSoldNum(v int64) *GoodsInfo {
	s.TotalSoldNum = &v
	return s
}

func (s *GoodsInfo) SetStandardPriceInCent(v int64) *GoodsInfo {
	s.StandardPriceInCent = &v
	return s
}

func (s *GoodsInfo) SetTitle(v string) *GoodsInfo {
	s.Title = &v
	return s
}

func (s *GoodsInfo) SetAuthStartTime(v int64) *GoodsInfo {
	s.AuthStartTime = &v
	return s
}

func (s *GoodsInfo) SetAuthEndTime(v int64) *GoodsInfo {
	s.AuthEndTime = &v
	return s
}

func (s *GoodsInfo) SetPublishTime(v int64) *GoodsInfo {
	s.PublishTime = &v
	return s
}

// 作品信息
type WorksInfo struct {
	// 作品名称
	WorksName *string `json:"works_name,omitempty" xml:"works_name,omitempty" require:"true"`
	// 作品类型
	WorksType *string `json:"works_type,omitempty" xml:"works_type,omitempty" require:"true"`
}

func (s WorksInfo) String() string {
	return tea.Prettify(s)
}

func (s WorksInfo) GoString() string {
	return s.String()
}

func (s *WorksInfo) SetWorksName(v string) *WorksInfo {
	s.WorksName = &v
	return s
}

func (s *WorksInfo) SetWorksType(v string) *WorksInfo {
	s.WorksType = &v
	return s
}

// dci权利信息
type DciRightInfo struct {
	// 作品权利范围
	RightScope *string `json:"right_scope,omitempty" xml:"right_scope,omitempty" require:"true"`
	// 权利取得方式
	RightObtainWay *string `json:"right_obtain_way,omitempty" xml:"right_obtain_way,omitempty" require:"true"`
	// 权利归属方式
	OwnershipWay *string `json:"ownership_way,omitempty" xml:"ownership_way,omitempty" require:"true"`
}

func (s DciRightInfo) String() string {
	return tea.Prettify(s)
}

func (s DciRightInfo) GoString() string {
	return s.String()
}

func (s *DciRightInfo) SetRightScope(v string) *DciRightInfo {
	s.RightScope = &v
	return s
}

func (s *DciRightInfo) SetRightObtainWay(v string) *DciRightInfo {
	s.RightObtainWay = &v
	return s
}

func (s *DciRightInfo) SetOwnershipWay(v string) *DciRightInfo {
	s.OwnershipWay = &v
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
	// 发布者
	Poster *string `json:"poster,omitempty" xml:"poster,omitempty"`
	// 侵权内容发布时间
	PostDate *int64 `json:"post_date,omitempty" xml:"post_date,omitempty"`
	// 侵权内容发现时间
	FindDate *int64 `json:"find_date,omitempty" xml:"find_date,omitempty"`
	// 观看数
	ViewCount *int64 `json:"view_count,omitempty" xml:"view_count,omitempty"`
	// 点赞数
	LikeCount *int64 `json:"like_count,omitempty" xml:"like_count,omitempty"`
	// 评论数
	CommentCount *int64 `json:"comment_count,omitempty" xml:"comment_count,omitempty"`
	// 转发数
	RepostCount *int64 `json:"repost_count,omitempty" xml:"repost_count,omitempty"`
	// 侵权文件下载链接
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 疑似侵权反馈时间
	InfrFeedbackTime *int64 `json:"infr_feedback_time,omitempty" xml:"infr_feedback_time,omitempty"`
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

func (s *MonitorResult) SetPoster(v string) *MonitorResult {
	s.Poster = &v
	return s
}

func (s *MonitorResult) SetPostDate(v int64) *MonitorResult {
	s.PostDate = &v
	return s
}

func (s *MonitorResult) SetFindDate(v int64) *MonitorResult {
	s.FindDate = &v
	return s
}

func (s *MonitorResult) SetViewCount(v int64) *MonitorResult {
	s.ViewCount = &v
	return s
}

func (s *MonitorResult) SetLikeCount(v int64) *MonitorResult {
	s.LikeCount = &v
	return s
}

func (s *MonitorResult) SetCommentCount(v int64) *MonitorResult {
	s.CommentCount = &v
	return s
}

func (s *MonitorResult) SetRepostCount(v int64) *MonitorResult {
	s.RepostCount = &v
	return s
}

func (s *MonitorResult) SetDownloadUrl(v string) *MonitorResult {
	s.DownloadUrl = &v
	return s
}

func (s *MonitorResult) SetInfrFeedbackTime(v int64) *MonitorResult {
	s.InfrFeedbackTime = &v
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
	// 电话号码
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 作品信息
	WorksInfo *WorksInfo `json:"works_info,omitempty" xml:"works_info,omitempty"`
	// 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
	CreateStatement *bool `json:"create_statement,omitempty" xml:"create_statement,omitempty"`
	// 权利信息
	RightsInfo *RightsInfo `json:"rights_info,omitempty" xml:"rights_info,omitempty"`
	// 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
	ManagerName *string `json:"manager_name,omitempty" xml:"manager_name,omitempty" maxLength:"32"`
	// 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
	ManagerNo *string `json:"manager_no,omitempty" xml:"manager_no,omitempty" maxLength:"30"`
	// 附属证据信息（最多5个文件，传递的是FileId）
	AncillaryEvidence []*string `json:"ancillary_evidence,omitempty" xml:"ancillary_evidence,omitempty" type:"Repeated"`
	// 著作权人信息
	CopyrightOwnerInfo *CopyrightCertInfo `json:"copyright_owner_info,omitempty" xml:"copyright_owner_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 特征文件oss id
	FeatureFileId *string `json:"feature_file_id,omitempty" xml:"feature_file_id,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
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

func (s *AddHashregisterRequest) SetPhoneNum(v string) *AddHashregisterRequest {
	s.PhoneNum = &v
	return s
}

func (s *AddHashregisterRequest) SetWorksInfo(v *WorksInfo) *AddHashregisterRequest {
	s.WorksInfo = v
	return s
}

func (s *AddHashregisterRequest) SetCreateStatement(v bool) *AddHashregisterRequest {
	s.CreateStatement = &v
	return s
}

func (s *AddHashregisterRequest) SetRightsInfo(v *RightsInfo) *AddHashregisterRequest {
	s.RightsInfo = v
	return s
}

func (s *AddHashregisterRequest) SetManagerName(v string) *AddHashregisterRequest {
	s.ManagerName = &v
	return s
}

func (s *AddHashregisterRequest) SetManagerNo(v string) *AddHashregisterRequest {
	s.ManagerNo = &v
	return s
}

func (s *AddHashregisterRequest) SetAncillaryEvidence(v []*string) *AddHashregisterRequest {
	s.AncillaryEvidence = v
	return s
}

func (s *AddHashregisterRequest) SetCopyrightOwnerInfo(v *CopyrightCertInfo) *AddHashregisterRequest {
	s.CopyrightOwnerInfo = v
	return s
}

func (s *AddHashregisterRequest) SetClientToken(v string) *AddHashregisterRequest {
	s.ClientToken = &v
	return s
}

func (s *AddHashregisterRequest) SetFeatureFileId(v string) *AddHashregisterRequest {
	s.FeatureFileId = &v
	return s
}

func (s *AddHashregisterRequest) SetProxyInfo(v *ProxyData) *AddHashregisterRequest {
	s.ProxyInfo = v
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
	// 作品信息
	WorksInfo *WorksInfo `json:"works_info,omitempty" xml:"works_info,omitempty"`
	// 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
	CreateStatement *bool `json:"create_statement,omitempty" xml:"create_statement,omitempty"`
	// 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
	ManagerName *string `json:"manager_name,omitempty" xml:"manager_name,omitempty" maxLength:"32"`
	// 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
	ManagerNo *string `json:"manager_no,omitempty" xml:"manager_no,omitempty" maxLength:"30"`
	// 权利信息
	RightsInfo *RightsInfo `json:"rights_info,omitempty" xml:"rights_info,omitempty"`
	// 附属证据信息（最多5个文件，传递的是FileId）
	AncillaryEvidence []*string `json:"ancillary_evidence,omitempty" xml:"ancillary_evidence,omitempty" type:"Repeated"`
	// 著作权人信息
	CopyrightOwnerInfo *CopyrightCertInfo `json:"copyright_owner_info,omitempty" xml:"copyright_owner_info,omitempty"`
	// 幂等
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 同步账号信息
	SyncInfo *AccountData `json:"sync_info,omitempty" xml:"sync_info,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
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

func (s *AddRegisterRequest) SetWorksInfo(v *WorksInfo) *AddRegisterRequest {
	s.WorksInfo = v
	return s
}

func (s *AddRegisterRequest) SetCreateStatement(v bool) *AddRegisterRequest {
	s.CreateStatement = &v
	return s
}

func (s *AddRegisterRequest) SetManagerName(v string) *AddRegisterRequest {
	s.ManagerName = &v
	return s
}

func (s *AddRegisterRequest) SetManagerNo(v string) *AddRegisterRequest {
	s.ManagerNo = &v
	return s
}

func (s *AddRegisterRequest) SetRightsInfo(v *RightsInfo) *AddRegisterRequest {
	s.RightsInfo = v
	return s
}

func (s *AddRegisterRequest) SetAncillaryEvidence(v []*string) *AddRegisterRequest {
	s.AncillaryEvidence = v
	return s
}

func (s *AddRegisterRequest) SetCopyrightOwnerInfo(v *CopyrightCertInfo) *AddRegisterRequest {
	s.CopyrightOwnerInfo = v
	return s
}

func (s *AddRegisterRequest) SetClientToken(v string) *AddRegisterRequest {
	s.ClientToken = &v
	return s
}

func (s *AddRegisterRequest) SetSyncInfo(v *AccountData) *AddRegisterRequest {
	s.SyncInfo = v
	return s
}

func (s *AddRegisterRequest) SetProxyInfo(v *ProxyData) *AddRegisterRequest {
	s.ProxyInfo = v
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
	// 证据包存证交易HASH  注意只有生成了证据包才会返回
	PackageTxHash *string `json:"package_tx_hash,omitempty" xml:"package_tx_hash,omitempty"`
	// 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
	StatementUrl *string `json:"statement_url,omitempty" xml:"statement_url,omitempty"`
	// 安全信息
	Security *SecurityData `json:"security,omitempty" xml:"security,omitempty"`
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

func (s *QueryRegisterstatusResponse) SetPackageTxHash(v string) *QueryRegisterstatusResponse {
	s.PackageTxHash = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetStatementUrl(v string) *QueryRegisterstatusResponse {
	s.StatementUrl = &v
	return s
}

func (s *QueryRegisterstatusResponse) SetSecurity(v *SecurityData) *QueryRegisterstatusResponse {
	s.Security = v
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
	// 原监测任务id
	OriginMonitorTaskId *string `json:"origin_monitor_task_id,omitempty" xml:"origin_monitor_task_id,omitempty"`
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

func (s *CreateMonitorTaskRequest) SetOriginMonitorTaskId(v string) *CreateMonitorTaskRequest {
	s.OriginMonitorTaskId = &v
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
	// 停止结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
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

func (s *StopMonitorTaskResponse) SetResult(v bool) *StopMonitorTaskResponse {
	s.Result = &v
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
	// 法人证件类型
	LegalPersonType *string `json:"legal_person_type,omitempty" xml:"legal_person_type,omitempty"`
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

func (s *CreateScreenshotRequest) SetLegalPersonType(v string) *CreateScreenshotRequest {
	s.LegalPersonType = &v
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
	// 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
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
	// 法人证件类型（非必传，默认IDENTITY_CARD）
	LegalPersonType *string `json:"legal_person_type,omitempty" xml:"legal_person_type,omitempty"`
	// 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
	AgentName *string `json:"agent_name,omitempty" xml:"agent_name,omitempty"`
	// 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
	AgentNo *string `json:"agent_no,omitempty" xml:"agent_no,omitempty"`
	// 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 是否自动化取证
	Automatic *bool `json:"automatic,omitempty" xml:"automatic,omitempty"`
	// 取证目标类型： 微信公众号：WEIXIN_MP 其它：OTHER
	//
	TargetType *string `json:"target_type,omitempty" xml:"target_type,omitempty"`
	// 是否支持UAC通行 默认false
	SupportUac *bool `json:"support_uac,omitempty" xml:"support_uac,omitempty"`
	// 取证脚本集Id
	ScriptsPackageId *string `json:"scripts_package_id,omitempty" xml:"scripts_package_id,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 其他取证网址
	Inventory *string `json:"inventory,omitempty" xml:"inventory,omitempty"`
	// 音视频取证信息
	AudioVideoInfos []*EvidenceUrlInfo `json:"audio_video_infos,omitempty" xml:"audio_video_infos,omitempty" type:"Repeated"`
	// 放弃取证信息
	ScreenCancelInfo *ScreenCancelInfo `json:"screen_cancel_info,omitempty" xml:"screen_cancel_info,omitempty"`
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

func (s *CreateRecordscreenRequest) SetLegalPersonType(v string) *CreateRecordscreenRequest {
	s.LegalPersonType = &v
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

func (s *CreateRecordscreenRequest) SetAutomatic(v bool) *CreateRecordscreenRequest {
	s.Automatic = &v
	return s
}

func (s *CreateRecordscreenRequest) SetTargetType(v string) *CreateRecordscreenRequest {
	s.TargetType = &v
	return s
}

func (s *CreateRecordscreenRequest) SetSupportUac(v bool) *CreateRecordscreenRequest {
	s.SupportUac = &v
	return s
}

func (s *CreateRecordscreenRequest) SetScriptsPackageId(v string) *CreateRecordscreenRequest {
	s.ScriptsPackageId = &v
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

func (s *CreateRecordscreenRequest) SetInventory(v string) *CreateRecordscreenRequest {
	s.Inventory = &v
	return s
}

func (s *CreateRecordscreenRequest) SetAudioVideoInfos(v []*EvidenceUrlInfo) *CreateRecordscreenRequest {
	s.AudioVideoInfos = v
	return s
}

func (s *CreateRecordscreenRequest) SetScreenCancelInfo(v *ScreenCancelInfo) *CreateRecordscreenRequest {
	s.ScreenCancelInfo = v
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

type ListNotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListNotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListNotaryRequest) GoString() string {
	return s.String()
}

func (s *ListNotaryRequest) SetAuthToken(v string) *ListNotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListNotaryRequest) SetProductInstanceId(v string) *ListNotaryRequest {
	s.ProductInstanceId = &v
	return s
}

type ListNotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公证处列表
	NotaryList []*NotaryPublicOffice `json:"notary_list,omitempty" xml:"notary_list,omitempty" type:"Repeated"`
}

func (s ListNotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListNotaryResponse) GoString() string {
	return s.String()
}

func (s *ListNotaryResponse) SetReqMsgId(v string) *ListNotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListNotaryResponse) SetResultCode(v string) *ListNotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListNotaryResponse) SetResultMsg(v string) *ListNotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListNotaryResponse) SetNotaryList(v []*NotaryPublicOffice) *ListNotaryResponse {
	s.NotaryList = v
	return s
}

type CreateDirectmonitorTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 提交类型，FILE/URL
	//
	SubmitType *string `json:"submit_type,omitempty" xml:"submit_type,omitempty" require:"true"`
	// submitType 是FILE就传 oss fileId，是URL就传url地址
	SubmitContent *string `json:"submit_content,omitempty" xml:"submit_content,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件类别 IMAGE/TEXT/VIDEO/AUDIO
	//
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
	DetailFileType *string `json:"detail_file_type,omitempty" xml:"detail_file_type,omitempty" require:"true"`
	// 定向监测任务名称
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty"`
	// 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s CreateDirectmonitorTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDirectmonitorTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateDirectmonitorTaskRequest) SetAuthToken(v string) *CreateDirectmonitorTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetProductInstanceId(v string) *CreateDirectmonitorTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetSubmitType(v string) *CreateDirectmonitorTaskRequest {
	s.SubmitType = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetSubmitContent(v string) *CreateDirectmonitorTaskRequest {
	s.SubmitContent = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetFileName(v string) *CreateDirectmonitorTaskRequest {
	s.FileName = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetFileType(v string) *CreateDirectmonitorTaskRequest {
	s.FileType = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetDetailFileType(v string) *CreateDirectmonitorTaskRequest {
	s.DetailFileType = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetTaskName(v string) *CreateDirectmonitorTaskRequest {
	s.TaskName = &v
	return s
}

func (s *CreateDirectmonitorTaskRequest) SetClientToken(v string) *CreateDirectmonitorTaskRequest {
	s.ClientToken = &v
	return s
}

type CreateDirectmonitorTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测任务id
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty"`
	// 是否存在相似结果
	IsExistSimilar *bool `json:"is_exist_similar,omitempty" xml:"is_exist_similar,omitempty"`
	// 监测结果总数量
	MonitorResultCount *int64 `json:"monitor_result_count,omitempty" xml:"monitor_result_count,omitempty"`
}

func (s CreateDirectmonitorTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDirectmonitorTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateDirectmonitorTaskResponse) SetReqMsgId(v string) *CreateDirectmonitorTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDirectmonitorTaskResponse) SetResultCode(v string) *CreateDirectmonitorTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDirectmonitorTaskResponse) SetResultMsg(v string) *CreateDirectmonitorTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDirectmonitorTaskResponse) SetMonitorTaskId(v string) *CreateDirectmonitorTaskResponse {
	s.MonitorTaskId = &v
	return s
}

func (s *CreateDirectmonitorTaskResponse) SetIsExistSimilar(v bool) *CreateDirectmonitorTaskResponse {
	s.IsExistSimilar = &v
	return s
}

func (s *CreateDirectmonitorTaskResponse) SetMonitorResultCount(v int64) *CreateDirectmonitorTaskResponse {
	s.MonitorResultCount = &v
	return s
}

type QueryDirectmonitorResultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 监测任务id
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty" require:"true"`
	// 页面大小(1-200)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 页码(>0)
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
}

func (s QueryDirectmonitorResultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDirectmonitorResultRequest) GoString() string {
	return s.String()
}

func (s *QueryDirectmonitorResultRequest) SetAuthToken(v string) *QueryDirectmonitorResultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDirectmonitorResultRequest) SetProductInstanceId(v string) *QueryDirectmonitorResultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDirectmonitorResultRequest) SetMonitorTaskId(v string) *QueryDirectmonitorResultRequest {
	s.MonitorTaskId = &v
	return s
}

func (s *QueryDirectmonitorResultRequest) SetPageSize(v int64) *QueryDirectmonitorResultRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDirectmonitorResultRequest) SetPageIndex(v int64) *QueryDirectmonitorResultRequest {
	s.PageIndex = &v
	return s
}

type QueryDirectmonitorResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 监测任务id
	MonitorTaskId *string `json:"monitor_task_id,omitempty" xml:"monitor_task_id,omitempty"`
	// 当前页面监测结果数量
	ResultCount *int64 `json:"result_count,omitempty" xml:"result_count,omitempty"`
	// 监测结果列表
	MonitorResultList []*DirectMonitorResult `json:"monitor_result_list,omitempty" xml:"monitor_result_list,omitempty" type:"Repeated"`
}

func (s QueryDirectmonitorResultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDirectmonitorResultResponse) GoString() string {
	return s.String()
}

func (s *QueryDirectmonitorResultResponse) SetReqMsgId(v string) *QueryDirectmonitorResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDirectmonitorResultResponse) SetResultCode(v string) *QueryDirectmonitorResultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDirectmonitorResultResponse) SetResultMsg(v string) *QueryDirectmonitorResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDirectmonitorResultResponse) SetMonitorTaskId(v string) *QueryDirectmonitorResultResponse {
	s.MonitorTaskId = &v
	return s
}

func (s *QueryDirectmonitorResultResponse) SetResultCount(v int64) *QueryDirectmonitorResultResponse {
	s.ResultCount = &v
	return s
}

func (s *QueryDirectmonitorResultResponse) SetMonitorResultList(v []*DirectMonitorResult) *QueryDirectmonitorResultResponse {
	s.MonitorResultList = v
	return s
}

type CreateDciPreregistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 作品名称
	WorkName *string `json:"work_name,omitempty" xml:"work_name,omitempty" require:"true"`
	// 作品类型
	WorkCategory *string `json:"work_category,omitempty" xml:"work_category,omitempty" require:"true"`
	// 推荐作品分类
	RecommendWorkCategory *string `json:"recommend_work_category,omitempty" xml:"recommend_work_category,omitempty"`
	// 作品oss文件Id
	WorkFileId *string `json:"work_file_id,omitempty" xml:"work_file_id,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 创作信息
	CreationInfo *DciCreationInfo `json:"creation_info,omitempty" xml:"creation_info,omitempty" require:"true"`
	// 发表信息
	PublicationInfo *DciPublicationInfo `json:"publication_info,omitempty" xml:"publication_info,omitempty" require:"true"`
	// 作者姓名
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty" require:"true"`
	// 作者署名
	AuthorSignature *string `json:"author_signature,omitempty" xml:"author_signature,omitempty"`
	// 原创声明
	OriginalStatement *string `json:"original_statement,omitempty" xml:"original_statement,omitempty"`
	// 权利信息
	RightInfo *DciRightInfo `json:"right_info,omitempty" xml:"right_info,omitempty" require:"true"`
	// 真实意愿表达信息
	PreRegistrationTrueWill *string `json:"pre_registration_true_will,omitempty" xml:"pre_registration_true_will,omitempty" require:"true"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateDciPreregistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDciPreregistrationRequest) GoString() string {
	return s.String()
}

func (s *CreateDciPreregistrationRequest) SetAuthToken(v string) *CreateDciPreregistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetProductInstanceId(v string) *CreateDciPreregistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetWorkName(v string) *CreateDciPreregistrationRequest {
	s.WorkName = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetWorkCategory(v string) *CreateDciPreregistrationRequest {
	s.WorkCategory = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetRecommendWorkCategory(v string) *CreateDciPreregistrationRequest {
	s.RecommendWorkCategory = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetWorkFileId(v string) *CreateDciPreregistrationRequest {
	s.WorkFileId = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetFileType(v string) *CreateDciPreregistrationRequest {
	s.FileType = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetCreationInfo(v *DciCreationInfo) *CreateDciPreregistrationRequest {
	s.CreationInfo = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetPublicationInfo(v *DciPublicationInfo) *CreateDciPreregistrationRequest {
	s.PublicationInfo = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetAuthorName(v string) *CreateDciPreregistrationRequest {
	s.AuthorName = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetAuthorSignature(v string) *CreateDciPreregistrationRequest {
	s.AuthorSignature = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetOriginalStatement(v string) *CreateDciPreregistrationRequest {
	s.OriginalStatement = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetRightInfo(v *DciRightInfo) *CreateDciPreregistrationRequest {
	s.RightInfo = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetPreRegistrationTrueWill(v string) *CreateDciPreregistrationRequest {
	s.PreRegistrationTrueWill = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetDciUserId(v string) *CreateDciPreregistrationRequest {
	s.DciUserId = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetProxyData(v *ProxyData) *CreateDciPreregistrationRequest {
	s.ProxyData = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetClientToken(v string) *CreateDciPreregistrationRequest {
	s.ClientToken = &v
	return s
}

type CreateDciPreregistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// dci内容id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s CreateDciPreregistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDciPreregistrationResponse) GoString() string {
	return s.String()
}

func (s *CreateDciPreregistrationResponse) SetReqMsgId(v string) *CreateDciPreregistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDciPreregistrationResponse) SetResultCode(v string) *CreateDciPreregistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDciPreregistrationResponse) SetResultMsg(v string) *CreateDciPreregistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDciPreregistrationResponse) SetDciContentId(v string) *CreateDciPreregistrationResponse {
	s.DciContentId = &v
	return s
}

type QueryDciPreregistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty" require:"true"`
	// dci内容id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
}

func (s QueryDciPreregistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreregistrationRequest) GoString() string {
	return s.String()
}

func (s *QueryDciPreregistrationRequest) SetAuthToken(v string) *QueryDciPreregistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciPreregistrationRequest) SetProductInstanceId(v string) *QueryDciPreregistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciPreregistrationRequest) SetDciUserId(v string) *QueryDciPreregistrationRequest {
	s.DciUserId = &v
	return s
}

func (s *QueryDciPreregistrationRequest) SetDciContentId(v string) *QueryDciPreregistrationRequest {
	s.DciContentId = &v
	return s
}

type QueryDciPreregistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预登记状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 文件哈希
	FileHash *string `json:"file_hash,omitempty" xml:"file_hash,omitempty"`
	// 文件哈希存证txHash
	FileHashTxHash *string `json:"file_hash_tx_hash,omitempty" xml:"file_hash_tx_hash,omitempty"`
	// 文件哈希存证区块高度
	FileHashBlockHeight *string `json:"file_hash_block_height,omitempty" xml:"file_hash_block_height,omitempty"`
	// dci编码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty"`
	// DCI码存证txHash
	DciCodeTxHash *string `json:"dci_code_tx_hash,omitempty" xml:"dci_code_tx_hash,omitempty"`
	// DCI码存证高度
	DciCodeBlockHeight *string `json:"dci_code_block_height,omitempty" xml:"dci_code_block_height,omitempty"`
	// DCI码fileHash存证txHash
	DciCodeFileTxHash *string `json:"dci_code_file_tx_hash,omitempty" xml:"dci_code_file_tx_hash,omitempty"`
	// DCI码fileHash存证高度
	DciCodeFileBlockHeight *string `json:"dci_code_file_block_height,omitempty" xml:"dci_code_file_block_height,omitempty"`
	// 预登记证书txhash
	PreRegCertTxHash *string `json:"pre_reg_cert_tx_hash,omitempty" xml:"pre_reg_cert_tx_hash,omitempty"`
	// 预登记证书存证高度
	PreRegCertBlockHeight *string `json:"pre_reg_cert_block_height,omitempty" xml:"pre_reg_cert_block_height,omitempty"`
	// 预登记取消txHash
	CancelTxHash *string `json:"cancel_tx_hash,omitempty" xml:"cancel_tx_hash,omitempty"`
	// 预登记取消存证高度
	CancelBlockHeight *string `json:"cancel_block_height,omitempty" xml:"cancel_block_height,omitempty"`
	// dciCode的可信时间戳信息
	DciCodeTsr *string `json:"dci_code_tsr,omitempty" xml:"dci_code_tsr,omitempty"`
	// dciCode fileHash的可信时间戳信息
	DciCodeFileTsr *string `json:"dci_code_file_tsr,omitempty" xml:"dci_code_file_tsr,omitempty"`
	// 预登记证书可信时间戳信息
	PreRegCertTsr *string `json:"pre_reg_cert_tsr,omitempty" xml:"pre_reg_cert_tsr,omitempty"`
	// 预登记证书oss fileId
	PreRegCertFileId *string `json:"pre_reg_cert_file_id,omitempty" xml:"pre_reg_cert_file_id,omitempty"`
	// 预登记证书fileHash
	PreRegCertFileHash *string `json:"pre_reg_cert_file_hash,omitempty" xml:"pre_reg_cert_file_hash,omitempty"`
	// 预览图oss fileId
	PngFileId *string `json:"png_file_id,omitempty" xml:"png_file_id,omitempty"`
	// 公示地址
	PublicationUrl *string `json:"publication_url,omitempty" xml:"publication_url,omitempty"`
	// 申请发码时间
	ApplyObtainDate *string `json:"apply_obtain_date,omitempty" xml:"apply_obtain_date,omitempty"`
	// DCI码创建时间
	DciCodeObtainDate *string `json:"dci_code_obtain_date,omitempty" xml:"dci_code_obtain_date,omitempty"`
	// 错误原因
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
}

func (s QueryDciPreregistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreregistrationResponse) GoString() string {
	return s.String()
}

func (s *QueryDciPreregistrationResponse) SetReqMsgId(v string) *QueryDciPreregistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetResultCode(v string) *QueryDciPreregistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetResultMsg(v string) *QueryDciPreregistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetStatus(v string) *QueryDciPreregistrationResponse {
	s.Status = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetFileHash(v string) *QueryDciPreregistrationResponse {
	s.FileHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetFileHashTxHash(v string) *QueryDciPreregistrationResponse {
	s.FileHashTxHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetFileHashBlockHeight(v string) *QueryDciPreregistrationResponse {
	s.FileHashBlockHeight = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCode(v string) *QueryDciPreregistrationResponse {
	s.DciCode = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeTxHash(v string) *QueryDciPreregistrationResponse {
	s.DciCodeTxHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeBlockHeight(v string) *QueryDciPreregistrationResponse {
	s.DciCodeBlockHeight = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeFileTxHash(v string) *QueryDciPreregistrationResponse {
	s.DciCodeFileTxHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeFileBlockHeight(v string) *QueryDciPreregistrationResponse {
	s.DciCodeFileBlockHeight = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPreRegCertTxHash(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertTxHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPreRegCertBlockHeight(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertBlockHeight = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetCancelTxHash(v string) *QueryDciPreregistrationResponse {
	s.CancelTxHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetCancelBlockHeight(v string) *QueryDciPreregistrationResponse {
	s.CancelBlockHeight = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeTsr(v string) *QueryDciPreregistrationResponse {
	s.DciCodeTsr = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeFileTsr(v string) *QueryDciPreregistrationResponse {
	s.DciCodeFileTsr = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPreRegCertTsr(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertTsr = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPreRegCertFileId(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertFileId = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPreRegCertFileHash(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertFileHash = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPngFileId(v string) *QueryDciPreregistrationResponse {
	s.PngFileId = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPublicationUrl(v string) *QueryDciPreregistrationResponse {
	s.PublicationUrl = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetApplyObtainDate(v string) *QueryDciPreregistrationResponse {
	s.ApplyObtainDate = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetDciCodeObtainDate(v string) *QueryDciPreregistrationResponse {
	s.DciCodeObtainDate = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetErrorReason(v string) *QueryDciPreregistrationResponse {
	s.ErrorReason = &v
	return s
}

type AddDciUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty" require:"true"`
	// 证件有效期限起始日期
	CertificateStartTime *string `json:"certificate_start_time,omitempty" xml:"certificate_start_time,omitempty"`
	// 证件有效期限终止日期
	CertificateEndTime *string `json:"certificate_end_time,omitempty" xml:"certificate_end_time,omitempty"`
	// 证件正面OSS filePath
	CertificateFrontFilePath *string `json:"certificate_front_file_path,omitempty" xml:"certificate_front_file_path,omitempty" require:"true"`
	// 证件反面OSS filePath
	CertificateBackFilePath *string `json:"certificate_back_file_path,omitempty" xml:"certificate_back_file_path,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 用户身份开始时间
	IdentityStartTime *string `json:"identity_start_time,omitempty" xml:"identity_start_time,omitempty" require:"true"`
	// 所属地区
	AreaType *string `json:"area_type,omitempty" xml:"area_type,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s AddDciUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddDciUserRequest) GoString() string {
	return s.String()
}

func (s *AddDciUserRequest) SetAuthToken(v string) *AddDciUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddDciUserRequest) SetProductInstanceId(v string) *AddDciUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddDciUserRequest) SetUserName(v string) *AddDciUserRequest {
	s.UserName = &v
	return s
}

func (s *AddDciUserRequest) SetUserType(v string) *AddDciUserRequest {
	s.UserType = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateType(v string) *AddDciUserRequest {
	s.CertificateType = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateNumber(v string) *AddDciUserRequest {
	s.CertificateNumber = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateStartTime(v string) *AddDciUserRequest {
	s.CertificateStartTime = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateEndTime(v string) *AddDciUserRequest {
	s.CertificateEndTime = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateFrontFilePath(v string) *AddDciUserRequest {
	s.CertificateFrontFilePath = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateBackFilePath(v string) *AddDciUserRequest {
	s.CertificateBackFilePath = &v
	return s
}

func (s *AddDciUserRequest) SetPhone(v string) *AddDciUserRequest {
	s.Phone = &v
	return s
}

func (s *AddDciUserRequest) SetAddress(v string) *AddDciUserRequest {
	s.Address = &v
	return s
}

func (s *AddDciUserRequest) SetIdentityStartTime(v string) *AddDciUserRequest {
	s.IdentityStartTime = &v
	return s
}

func (s *AddDciUserRequest) SetAreaType(v string) *AddDciUserRequest {
	s.AreaType = &v
	return s
}

func (s *AddDciUserRequest) SetProxyData(v *ProxyData) *AddDciUserRequest {
	s.ProxyData = v
	return s
}

func (s *AddDciUserRequest) SetClientToken(v string) *AddDciUserRequest {
	s.ClientToken = &v
	return s
}

type AddDciUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// dci用户状态
	DciUserStatus *string `json:"dci_user_status,omitempty" xml:"dci_user_status,omitempty"`
}

func (s AddDciUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddDciUserResponse) GoString() string {
	return s.String()
}

func (s *AddDciUserResponse) SetReqMsgId(v string) *AddDciUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddDciUserResponse) SetResultCode(v string) *AddDciUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddDciUserResponse) SetResultMsg(v string) *AddDciUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddDciUserResponse) SetDciUserId(v string) *AddDciUserResponse {
	s.DciUserId = &v
	return s
}

func (s *AddDciUserResponse) SetDciUserStatus(v string) *AddDciUserResponse {
	s.DciUserStatus = &v
	return s
}

type RetryDciPreregistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty" require:"true"`
	// dci内容id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty" require:"true"`
	// 幂等信息
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s RetryDciPreregistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryDciPreregistrationRequest) GoString() string {
	return s.String()
}

func (s *RetryDciPreregistrationRequest) SetAuthToken(v string) *RetryDciPreregistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryDciPreregistrationRequest) SetProductInstanceId(v string) *RetryDciPreregistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryDciPreregistrationRequest) SetDciUserId(v string) *RetryDciPreregistrationRequest {
	s.DciUserId = &v
	return s
}

func (s *RetryDciPreregistrationRequest) SetDciContentId(v string) *RetryDciPreregistrationRequest {
	s.DciContentId = &v
	return s
}

func (s *RetryDciPreregistrationRequest) SetProxyData(v *ProxyData) *RetryDciPreregistrationRequest {
	s.ProxyData = v
	return s
}

func (s *RetryDciPreregistrationRequest) SetClientToken(v string) *RetryDciPreregistrationRequest {
	s.ClientToken = &v
	return s
}

type RetryDciPreregistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryDciPreregistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryDciPreregistrationResponse) GoString() string {
	return s.String()
}

func (s *RetryDciPreregistrationResponse) SetReqMsgId(v string) *RetryDciPreregistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryDciPreregistrationResponse) SetResultCode(v string) *RetryDciPreregistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryDciPreregistrationResponse) SetResultMsg(v string) *RetryDciPreregistrationResponse {
	s.ResultMsg = &v
	return s
}

type QueryDciUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s QueryDciUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciUserRequest) GoString() string {
	return s.String()
}

func (s *QueryDciUserRequest) SetAuthToken(v string) *QueryDciUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciUserRequest) SetProductInstanceId(v string) *QueryDciUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciUserRequest) SetCertificateType(v string) *QueryDciUserRequest {
	s.CertificateType = &v
	return s
}

func (s *QueryDciUserRequest) SetCertificateNumber(v string) *QueryDciUserRequest {
	s.CertificateNumber = &v
	return s
}

func (s *QueryDciUserRequest) SetPhone(v string) *QueryDciUserRequest {
	s.Phone = &v
	return s
}

type QueryDciUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// dci用户状态
	DciUserStatus *string `json:"dci_user_status,omitempty" xml:"dci_user_status,omitempty"`
}

func (s QueryDciUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciUserResponse) GoString() string {
	return s.String()
}

func (s *QueryDciUserResponse) SetReqMsgId(v string) *QueryDciUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciUserResponse) SetResultCode(v string) *QueryDciUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciUserResponse) SetResultMsg(v string) *QueryDciUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciUserResponse) SetDciUserId(v string) *QueryDciUserResponse {
	s.DciUserId = &v
	return s
}

func (s *QueryDciUserResponse) SetDciUserStatus(v string) *QueryDciUserResponse {
	s.DciUserStatus = &v
	return s
}

type QueryDciPreregpublicationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 作品id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
}

func (s QueryDciPreregpublicationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreregpublicationRequest) GoString() string {
	return s.String()
}

func (s *QueryDciPreregpublicationRequest) SetAuthToken(v string) *QueryDciPreregpublicationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciPreregpublicationRequest) SetProductInstanceId(v string) *QueryDciPreregpublicationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciPreregpublicationRequest) SetDciContentId(v string) *QueryDciPreregpublicationRequest {
	s.DciContentId = &v
	return s
}

type QueryDciPreregpublicationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 供核验公示地址
	PublicationUrl *string `json:"publication_url,omitempty" xml:"publication_url,omitempty"`
}

func (s QueryDciPreregpublicationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreregpublicationResponse) GoString() string {
	return s.String()
}

func (s *QueryDciPreregpublicationResponse) SetReqMsgId(v string) *QueryDciPreregpublicationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciPreregpublicationResponse) SetResultCode(v string) *QueryDciPreregpublicationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciPreregpublicationResponse) SetResultMsg(v string) *QueryDciPreregpublicationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciPreregpublicationResponse) SetPublicationUrl(v string) *QueryDciPreregpublicationResponse {
	s.PublicationUrl = &v
	return s
}

type PublishGoodRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件id,最长64个字符
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 商品标题，最长64个字符
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 商品名称
	GoodsName *string `json:"goods_name,omitempty" xml:"goods_name,omitempty" require:"true"`
	// 商品分类
	Classification *string `json:"classification,omitempty" xml:"classification,omitempty"`
	// 售价（分）
	StandardPriceInCent *int64 `json:"standard_price_in_cent,omitempty" xml:"standard_price_in_cent,omitempty" require:"true"`
	// 上架/下架，默认上架
	GoodsStatus *string `json:"goods_status,omitempty" xml:"goods_status,omitempty"`
	// 发布时间，默认直接发布
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 授权期限起始时间
	AuthStartTime *int64 `json:"auth_start_time,omitempty" xml:"auth_start_time,omitempty" require:"true"`
	// 授权期限结束时间（传-1 则为永久）
	AuthEndTime *int64 `json:"auth_end_time,omitempty" xml:"auth_end_time,omitempty" require:"true"`
	// 是否是作者
	IsAuthor *bool `json:"is_author,omitempty" xml:"is_author,omitempty" require:"true"`
	// 作者姓名，如果isAuthor为false则必填，最长30个字符
	AuthorCertName *string `json:"author_cert_name,omitempty" xml:"author_cert_name,omitempty"`
	// 作者身份证号,如果isAuthor为false则必填
	AuthorCertNo *string `json:"author_cert_no,omitempty" xml:"author_cert_no,omitempty"`
	// 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 授权信息
	AuthInfo []*AuthInfo `json:"auth_info,omitempty" xml:"auth_info,omitempty" require:"true" type:"Repeated"`
}

func (s PublishGoodRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishGoodRequest) GoString() string {
	return s.String()
}

func (s *PublishGoodRequest) SetAuthToken(v string) *PublishGoodRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishGoodRequest) SetProductInstanceId(v string) *PublishGoodRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishGoodRequest) SetFileId(v string) *PublishGoodRequest {
	s.FileId = &v
	return s
}

func (s *PublishGoodRequest) SetTitle(v string) *PublishGoodRequest {
	s.Title = &v
	return s
}

func (s *PublishGoodRequest) SetGoodsName(v string) *PublishGoodRequest {
	s.GoodsName = &v
	return s
}

func (s *PublishGoodRequest) SetClassification(v string) *PublishGoodRequest {
	s.Classification = &v
	return s
}

func (s *PublishGoodRequest) SetStandardPriceInCent(v int64) *PublishGoodRequest {
	s.StandardPriceInCent = &v
	return s
}

func (s *PublishGoodRequest) SetGoodsStatus(v string) *PublishGoodRequest {
	s.GoodsStatus = &v
	return s
}

func (s *PublishGoodRequest) SetPublishTime(v int64) *PublishGoodRequest {
	s.PublishTime = &v
	return s
}

func (s *PublishGoodRequest) SetAuthStartTime(v int64) *PublishGoodRequest {
	s.AuthStartTime = &v
	return s
}

func (s *PublishGoodRequest) SetAuthEndTime(v int64) *PublishGoodRequest {
	s.AuthEndTime = &v
	return s
}

func (s *PublishGoodRequest) SetIsAuthor(v bool) *PublishGoodRequest {
	s.IsAuthor = &v
	return s
}

func (s *PublishGoodRequest) SetAuthorCertName(v string) *PublishGoodRequest {
	s.AuthorCertName = &v
	return s
}

func (s *PublishGoodRequest) SetAuthorCertNo(v string) *PublishGoodRequest {
	s.AuthorCertNo = &v
	return s
}

func (s *PublishGoodRequest) SetClientToken(v string) *PublishGoodRequest {
	s.ClientToken = &v
	return s
}

func (s *PublishGoodRequest) SetAuthInfo(v []*AuthInfo) *PublishGoodRequest {
	s.AuthInfo = v
	return s
}

type PublishGoodResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布id
	PubilshId *string `json:"pubilsh_id,omitempty" xml:"pubilsh_id,omitempty"`
}

func (s PublishGoodResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishGoodResponse) GoString() string {
	return s.String()
}

func (s *PublishGoodResponse) SetReqMsgId(v string) *PublishGoodResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishGoodResponse) SetResultCode(v string) *PublishGoodResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishGoodResponse) SetResultMsg(v string) *PublishGoodResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishGoodResponse) SetPubilshId(v string) *PublishGoodResponse {
	s.PubilshId = &v
	return s
}

type QueryGoodsPublishRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布id
	PubilshId *string `json:"pubilsh_id,omitempty" xml:"pubilsh_id,omitempty" require:"true"`
}

func (s QueryGoodsPublishRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsPublishRequest) GoString() string {
	return s.String()
}

func (s *QueryGoodsPublishRequest) SetAuthToken(v string) *QueryGoodsPublishRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGoodsPublishRequest) SetProductInstanceId(v string) *QueryGoodsPublishRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGoodsPublishRequest) SetPubilshId(v string) *QueryGoodsPublishRequest {
	s.PubilshId = &v
	return s
}

type QueryGoodsPublishResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布id
	PubilshId *string `json:"pubilsh_id,omitempty" xml:"pubilsh_id,omitempty"`
	// 发布状态
	PublishStatus *string `json:"publish_status,omitempty" xml:"publish_status,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty"`
}

func (s QueryGoodsPublishResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsPublishResponse) GoString() string {
	return s.String()
}

func (s *QueryGoodsPublishResponse) SetReqMsgId(v string) *QueryGoodsPublishResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGoodsPublishResponse) SetResultCode(v string) *QueryGoodsPublishResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGoodsPublishResponse) SetResultMsg(v string) *QueryGoodsPublishResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGoodsPublishResponse) SetPubilshId(v string) *QueryGoodsPublishResponse {
	s.PubilshId = &v
	return s
}

func (s *QueryGoodsPublishResponse) SetPublishStatus(v string) *QueryGoodsPublishResponse {
	s.PublishStatus = &v
	return s
}

func (s *QueryGoodsPublishResponse) SetGoodsId(v string) *QueryGoodsPublishResponse {
	s.GoodsId = &v
	return s
}

type UpdateGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 商品价格（分）
	StandardPriceInCent *int64 `json:"standard_price_in_cent,omitempty" xml:"standard_price_in_cent,omitempty"`
	// 商品状态:上架，下架
	GoodsStatus *string `json:"goods_status,omitempty" xml:"goods_status,omitempty"`
}

func (s UpdateGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodsRequest) GoString() string {
	return s.String()
}

func (s *UpdateGoodsRequest) SetAuthToken(v string) *UpdateGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGoodsRequest) SetProductInstanceId(v string) *UpdateGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGoodsRequest) SetGoodsId(v string) *UpdateGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *UpdateGoodsRequest) SetStandardPriceInCent(v int64) *UpdateGoodsRequest {
	s.StandardPriceInCent = &v
	return s
}

func (s *UpdateGoodsRequest) SetGoodsStatus(v string) *UpdateGoodsRequest {
	s.GoodsStatus = &v
	return s
}

type UpdateGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodsResponse) GoString() string {
	return s.String()
}

func (s *UpdateGoodsResponse) SetReqMsgId(v string) *UpdateGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGoodsResponse) SetResultCode(v string) *UpdateGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGoodsResponse) SetResultMsg(v string) *UpdateGoodsResponse {
	s.ResultMsg = &v
	return s
}

type QueryGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
}

func (s QueryGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsRequest) GoString() string {
	return s.String()
}

func (s *QueryGoodsRequest) SetAuthToken(v string) *QueryGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGoodsRequest) SetProductInstanceId(v string) *QueryGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGoodsRequest) SetGoodsId(v string) *QueryGoodsRequest {
	s.GoodsId = &v
	return s
}

type QueryGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品信息
	GoodsInfo *GoodsInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty"`
}

func (s QueryGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsResponse) GoString() string {
	return s.String()
}

func (s *QueryGoodsResponse) SetReqMsgId(v string) *QueryGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGoodsResponse) SetResultCode(v string) *QueryGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGoodsResponse) SetResultMsg(v string) *QueryGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGoodsResponse) SetGoodsInfo(v *GoodsInfo) *QueryGoodsResponse {
	s.GoodsInfo = v
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
				"sdk_version":      tea.String("1.15.11"),
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

/**
 * Description: 获取支持的公证处列表
 * Summary: 获取支持的公证处列表
 */
func (client *Client) ListNotary(request *ListNotaryRequest) (_result *ListNotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListNotaryResponse{}
	_body, _err := client.ListNotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取支持的公证处列表
 * Summary: 获取支持的公证处列表
 */
func (client *Client) ListNotaryEx(request *ListNotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListNotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListNotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增版权定向监测任务
 * Summary: 新增版权定向监测
 */
func (client *Client) CreateDirectmonitorTask(request *CreateDirectmonitorTaskRequest) (_result *CreateDirectmonitorTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDirectmonitorTaskResponse{}
	_body, _err := client.CreateDirectmonitorTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增版权定向监测任务
 * Summary: 新增版权定向监测
 */
func (client *Client) CreateDirectmonitorTaskEx(request *CreateDirectmonitorTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDirectmonitorTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDirectmonitorTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.directmonitor.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询版权定向监测结果
 * Summary: 查询版权定向监测结果
 */
func (client *Client) QueryDirectmonitorResult(request *QueryDirectmonitorResultRequest) (_result *QueryDirectmonitorResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDirectmonitorResultResponse{}
	_body, _err := client.QueryDirectmonitorResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询版权定向监测结果
 * Summary: 查询版权定向监测结果
 */
func (client *Client) QueryDirectmonitorResultEx(request *QueryDirectmonitorResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDirectmonitorResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDirectmonitorResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.directmonitor.result.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DCI预登记
 * Summary: dci预登记
 */
func (client *Client) CreateDciPreregistration(request *CreateDciPreregistrationRequest) (_result *CreateDciPreregistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDciPreregistrationResponse{}
	_body, _err := client.CreateDciPreregistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DCI预登记
 * Summary: dci预登记
 */
func (client *Client) CreateDciPreregistrationEx(request *CreateDciPreregistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDciPreregistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDciPreregistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.preregistration.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询dci预登记信息
 * Summary: 查询dci预登记信息
 */
func (client *Client) QueryDciPreregistration(request *QueryDciPreregistrationRequest) (_result *QueryDciPreregistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciPreregistrationResponse{}
	_body, _err := client.QueryDciPreregistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询dci预登记信息
 * Summary: 查询dci预登记信息
 */
func (client *Client) QueryDciPreregistrationEx(request *QueryDciPreregistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciPreregistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciPreregistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.preregistration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册dci账号
 * Summary: 注册dci账号
 */
func (client *Client) AddDciUser(request *AddDciUserRequest) (_result *AddDciUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddDciUserResponse{}
	_body, _err := client.AddDciUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册dci账号
 * Summary: 注册dci账号
 */
func (client *Client) AddDciUserEx(request *AddDciUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddDciUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddDciUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.user.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: dci预登记再确认
 * Summary: dci预登记再确认
 */
func (client *Client) RetryDciPreregistration(request *RetryDciPreregistrationRequest) (_result *RetryDciPreregistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryDciPreregistrationResponse{}
	_body, _err := client.RetryDciPreregistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: dci预登记再确认
 * Summary: dci预登记再确认
 */
func (client *Client) RetryDciPreregistrationEx(request *RetryDciPreregistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryDciPreregistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryDciPreregistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.preregistration.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询dci账号信息
 * Summary: 查询dci账号信息
 */
func (client *Client) QueryDciUser(request *QueryDciUserRequest) (_result *QueryDciUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciUserResponse{}
	_body, _err := client.QueryDciUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询dci账号信息
 * Summary: 查询dci账号信息
 */
func (client *Client) QueryDciUserEx(request *QueryDciUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Dci预登记公示地址查询
 * Summary: Dci预登记公示地址查询
 */
func (client *Client) QueryDciPreregpublication(request *QueryDciPreregpublicationRequest) (_result *QueryDciPreregpublicationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciPreregpublicationResponse{}
	_body, _err := client.QueryDciPreregpublicationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Dci预登记公示地址查询
 * Summary: Dci预登记公示地址查询
 */
func (client *Client) QueryDciPreregpublicationEx(request *QueryDciPreregpublicationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciPreregpublicationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciPreregpublicationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.preregpublication.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品发布
 * Summary: 商品发布
 */
func (client *Client) PublishGood(request *PublishGoodRequest) (_result *PublishGoodResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishGoodResponse{}
	_body, _err := client.PublishGoodEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品发布
 * Summary: 商品发布
 */
func (client *Client) PublishGoodEx(request *PublishGoodRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishGoodResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishGoodResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.good.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品发布查询
 * Summary: 商品发布查询
 */
func (client *Client) QueryGoodsPublish(request *QueryGoodsPublishRequest) (_result *QueryGoodsPublishResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGoodsPublishResponse{}
	_body, _err := client.QueryGoodsPublishEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品发布查询
 * Summary: 商品发布查询
 */
func (client *Client) QueryGoodsPublishEx(request *QueryGoodsPublishRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGoodsPublishResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGoodsPublishResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.goods.publish.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品更新
 * Summary: 商品更新
 */
func (client *Client) UpdateGoods(request *UpdateGoodsRequest) (_result *UpdateGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGoodsResponse{}
	_body, _err := client.UpdateGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品更新
 * Summary: 商品更新
 */
func (client *Client) UpdateGoodsEx(request *UpdateGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.goods.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品查询
 * Summary: 商品查询
 */
func (client *Client) QueryGoods(request *QueryGoodsRequest) (_result *QueryGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGoodsResponse{}
	_body, _err := client.QueryGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品查询
 * Summary: 商品查询
 */
func (client *Client) QueryGoodsEx(request *QueryGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.goods.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
