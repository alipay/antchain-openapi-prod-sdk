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

// 相似位置信息
type ResemblePositionData struct {
	// 起始位置
	StartPosition *int64 `json:"start_position,omitempty" xml:"start_position,omitempty" require:"true"`
	// 结束位置
	EndPosition *int64 `json:"end_position,omitempty" xml:"end_position,omitempty" require:"true"`
}

func (s ResemblePositionData) String() string {
	return tea.Prettify(s)
}

func (s ResemblePositionData) GoString() string {
	return s.String()
}

func (s *ResemblePositionData) SetStartPosition(v int64) *ResemblePositionData {
	s.StartPosition = &v
	return s
}

func (s *ResemblePositionData) SetEndPosition(v int64) *ResemblePositionData {
	s.EndPosition = &v
	return s
}

// 出证用户（申请人，经办人）
type NotaryUser struct {
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户账号
	UserAccount *string `json:"user_account,omitempty" xml:"user_account,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 联系电话
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 法定代表人姓名,用户类型为机构时必填
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 法定代表人证件号码,用户类型为机构时必填
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法定代表人证件类型
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 身份证正面
	CertFrontFile *string `json:"cert_front_file,omitempty" xml:"cert_front_file,omitempty"`
	// 身份证反面
	CertBackFile *string `json:"cert_back_file,omitempty" xml:"cert_back_file,omitempty"`
	// 企业营业执照
	EnterpriseCertFile *string `json:"enterprise_cert_file,omitempty" xml:"enterprise_cert_file,omitempty"`
}

func (s NotaryUser) String() string {
	return tea.Prettify(s)
}

func (s NotaryUser) GoString() string {
	return s.String()
}

func (s *NotaryUser) SetUserType(v string) *NotaryUser {
	s.UserType = &v
	return s
}

func (s *NotaryUser) SetUserName(v string) *NotaryUser {
	s.UserName = &v
	return s
}

func (s *NotaryUser) SetUserAccount(v string) *NotaryUser {
	s.UserAccount = &v
	return s
}

func (s *NotaryUser) SetCertType(v string) *NotaryUser {
	s.CertType = &v
	return s
}

func (s *NotaryUser) SetCertNo(v string) *NotaryUser {
	s.CertNo = &v
	return s
}

func (s *NotaryUser) SetPhone(v string) *NotaryUser {
	s.Phone = &v
	return s
}

func (s *NotaryUser) SetLegalPersonName(v string) *NotaryUser {
	s.LegalPersonName = &v
	return s
}

func (s *NotaryUser) SetLegalPersonCertNo(v string) *NotaryUser {
	s.LegalPersonCertNo = &v
	return s
}

func (s *NotaryUser) SetLegalPersonCertType(v string) *NotaryUser {
	s.LegalPersonCertType = &v
	return s
}

func (s *NotaryUser) SetCertFrontFile(v string) *NotaryUser {
	s.CertFrontFile = &v
	return s
}

func (s *NotaryUser) SetCertBackFile(v string) *NotaryUser {
	s.CertBackFile = &v
	return s
}

func (s *NotaryUser) SetEnterpriseCertFile(v string) *NotaryUser {
	s.EnterpriseCertFile = &v
	return s
}

// 事由
type Reason struct {
	// 事由ID
	ReasonId *string `json:"reason_id,omitempty" xml:"reason_id,omitempty" require:"true"`
	// 事由名称
	ReasonName *string `json:"reason_name,omitempty" xml:"reason_name,omitempty" require:"true"`
	// 附件文字说明
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty" require:"true"`
	// 排序
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty" require:"true"`
	// 是否必须上传附件
	IsNeedAttachment *bool `json:"is_need_attachment,omitempty" xml:"is_need_attachment,omitempty" require:"true"`
}

func (s Reason) String() string {
	return tea.Prettify(s)
}

func (s Reason) GoString() string {
	return s.String()
}

func (s *Reason) SetReasonId(v string) *Reason {
	s.ReasonId = &v
	return s
}

func (s *Reason) SetReasonName(v string) *Reason {
	s.ReasonName = &v
	return s
}

func (s *Reason) SetComment(v string) *Reason {
	s.Comment = &v
	return s
}

func (s *Reason) SetSort(v int64) *Reason {
	s.Sort = &v
	return s
}

func (s *Reason) SetIsNeedAttachment(v bool) *Reason {
	s.IsNeedAttachment = &v
	return s
}

// 相似的明细结果
type ResembleDetail struct {
	// 相似分数
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 长度
	Length *string `json:"length,omitempty" xml:"length,omitempty"`
	// 明细类型，例如VIDEO_SEGMENT表示视频区间相似
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 查询源文件的位置信息
	QueryPositionData *ResemblePositionData `json:"query_position_data,omitempty" xml:"query_position_data,omitempty" require:"true"`
	// 相似文件的位置信息
	MatchPositionData *ResemblePositionData `json:"match_position_data,omitempty" xml:"match_position_data,omitempty" require:"true"`
}

func (s ResembleDetail) String() string {
	return tea.Prettify(s)
}

func (s ResembleDetail) GoString() string {
	return s.String()
}

func (s *ResembleDetail) SetScore(v string) *ResembleDetail {
	s.Score = &v
	return s
}

func (s *ResembleDetail) SetLength(v string) *ResembleDetail {
	s.Length = &v
	return s
}

func (s *ResembleDetail) SetType(v string) *ResembleDetail {
	s.Type = &v
	return s
}

func (s *ResembleDetail) SetQueryPositionData(v *ResemblePositionData) *ResembleDetail {
	s.QueryPositionData = v
	return s
}

func (s *ResembleDetail) SetMatchPositionData(v *ResemblePositionData) *ResembleDetail {
	s.MatchPositionData = v
	return s
}

// 收件人信息
type DeliveryInfo struct {
	// 收件人姓名
	ReceiveName *string `json:"receive_name,omitempty" xml:"receive_name,omitempty" require:"true"`
	// 联系电话
	Contact *string `json:"contact,omitempty" xml:"contact,omitempty" require:"true"`
	// 省（需要接收纸质文件时必填）
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
	// 市（需要接收纸质文件时必填）
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 区（需要接收纸质文件时必填）
	Area *string `json:"area,omitempty" xml:"area,omitempty"`
	// 详细地址（需要接收纸质文件时必填）
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 电子邮箱（需要接收电子文件时必填）
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s DeliveryInfo) String() string {
	return tea.Prettify(s)
}

func (s DeliveryInfo) GoString() string {
	return s.String()
}

func (s *DeliveryInfo) SetReceiveName(v string) *DeliveryInfo {
	s.ReceiveName = &v
	return s
}

func (s *DeliveryInfo) SetContact(v string) *DeliveryInfo {
	s.Contact = &v
	return s
}

func (s *DeliveryInfo) SetProvince(v string) *DeliveryInfo {
	s.Province = &v
	return s
}

func (s *DeliveryInfo) SetCity(v string) *DeliveryInfo {
	s.City = &v
	return s
}

func (s *DeliveryInfo) SetArea(v string) *DeliveryInfo {
	s.Area = &v
	return s
}

func (s *DeliveryInfo) SetAddress(v string) *DeliveryInfo {
	s.Address = &v
	return s
}

func (s *DeliveryInfo) SetEmail(v string) *DeliveryInfo {
	s.Email = &v
	return s
}

// 作品相似识别结果
type ResembleRiskData struct {
	// 重复作品ID
	WorkId *string `json:"work_id,omitempty" xml:"work_id,omitempty" require:"true"`
	// 相似作品的名称
	WorkName *string `json:"work_name,omitempty" xml:"work_name,omitempty"`
	// 相似作品的类型
	WorkType *string `json:"work_type,omitempty" xml:"work_type,omitempty"`
	// 相似值
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 相似作品下载凭证
	WorkFileId *string `json:"work_file_id,omitempty" xml:"work_file_id,omitempty"`
	// 相似明细
	ResembleDetails []*ResembleDetail `json:"resemble_details,omitempty" xml:"resemble_details,omitempty" type:"Repeated"`
}

func (s ResembleRiskData) String() string {
	return tea.Prettify(s)
}

func (s ResembleRiskData) GoString() string {
	return s.String()
}

func (s *ResembleRiskData) SetWorkId(v string) *ResembleRiskData {
	s.WorkId = &v
	return s
}

func (s *ResembleRiskData) SetWorkName(v string) *ResembleRiskData {
	s.WorkName = &v
	return s
}

func (s *ResembleRiskData) SetWorkType(v string) *ResembleRiskData {
	s.WorkType = &v
	return s
}

func (s *ResembleRiskData) SetScore(v string) *ResembleRiskData {
	s.Score = &v
	return s
}

func (s *ResembleRiskData) SetWorkFileId(v string) *ResembleRiskData {
	s.WorkFileId = &v
	return s
}

func (s *ResembleRiskData) SetResembleDetails(v []*ResembleDetail) *ResembleRiskData {
	s.ResembleDetails = v
	return s
}

// 安全识别结果
type ContentRiskData struct {
	// 风险名称
	RiskName *string `json:"risk_name,omitempty" xml:"risk_name,omitempty" require:"true"`
	// 风险是否通过审查
	RiskResult *bool `json:"risk_result,omitempty" xml:"risk_result,omitempty" require:"true"`
}

func (s ContentRiskData) String() string {
	return tea.Prettify(s)
}

func (s ContentRiskData) GoString() string {
	return s.String()
}

func (s *ContentRiskData) SetRiskName(v string) *ContentRiskData {
	s.RiskName = &v
	return s
}

func (s *ContentRiskData) SetRiskResult(v bool) *ContentRiskData {
	s.RiskResult = &v
	return s
}

// 作品标签识别结果
type LabelRiskData struct {
	// 识别出的标签名称
	LabelName *string `json:"label_name,omitempty" xml:"label_name,omitempty" require:"true"`
	// 识别出的标签是否与用户选择的标签匹配
	IsMatch *bool `json:"is_match,omitempty" xml:"is_match,omitempty" require:"true"`
	// 识别出的标签匹配度
	MatchValue *string `json:"match_value,omitempty" xml:"match_value,omitempty" require:"true"`
}

func (s LabelRiskData) String() string {
	return tea.Prettify(s)
}

func (s LabelRiskData) GoString() string {
	return s.String()
}

func (s *LabelRiskData) SetLabelName(v string) *LabelRiskData {
	s.LabelName = &v
	return s
}

func (s *LabelRiskData) SetIsMatch(v bool) *LabelRiskData {
	s.IsMatch = &v
	return s
}

func (s *LabelRiskData) SetMatchValue(v string) *LabelRiskData {
	s.MatchValue = &v
	return s
}

// 费用分项
type FeeDetail struct {
	// 费用描述
	FeeDesc *string `json:"fee_desc,omitempty" xml:"fee_desc,omitempty" require:"true"`
	// 费用
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s FeeDetail) String() string {
	return tea.Prettify(s)
}

func (s FeeDetail) GoString() string {
	return s.String()
}

func (s *FeeDetail) SetFeeDesc(v string) *FeeDetail {
	s.FeeDesc = &v
	return s
}

func (s *FeeDetail) SetAmount(v string) *FeeDetail {
	s.Amount = &v
	return s
}

// 证据文件信息
type EvidInfo struct {
	// 取证ID
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
	// 取证人
	Witness *NotaryUser `json:"witness,omitempty" xml:"witness,omitempty" require:"true"`
}

func (s EvidInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidInfo) GoString() string {
	return s.String()
}

func (s *EvidInfo) SetEvidenceId(v string) *EvidInfo {
	s.EvidenceId = &v
	return s
}

func (s *EvidInfo) SetWitness(v *NotaryUser) *EvidInfo {
	s.Witness = v
	return s
}

// 公证申请出证规则
type NotaryOrderRule struct {
	// 公证出证支持公证书类型
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty"`
}

func (s NotaryOrderRule) String() string {
	return tea.Prettify(s)
}

func (s NotaryOrderRule) GoString() string {
	return s.String()
}

func (s *NotaryOrderRule) SetOrderType(v string) *NotaryOrderRule {
	s.OrderType = &v
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

// 网页取证具体信息
type ScreenshotInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 全链路取证日志文件哈希
	ProcessLogFileHash *string `json:"process_log_file_hash,omitempty" xml:"process_log_file_hash,omitempty"`
	// 自清洁文件下载链接
	CheckLogFile *string `json:"check_log_file,omitempty" xml:"check_log_file,omitempty"`
	// 自清洁文件哈希
	CheckLogFileHash *string `json:"check_log_file_hash,omitempty" xml:"check_log_file_hash,omitempty"`
	// 网页截图文件下载链接
	ScreenshotFile *string `json:"screenshot_file,omitempty" xml:"screenshot_file,omitempty" require:"true"`
	// 网页截图文件哈希
	ScreenshotFileHash *string `json:"screenshot_file_hash,omitempty" xml:"screenshot_file_hash,omitempty"`
	// 日志打包文件hash
	LogZipFileHash *string `json:"log_zip_file_hash,omitempty" xml:"log_zip_file_hash,omitempty"`
	// 日志文件上链hash
	LogZipTxHash *string `json:"log_zip_tx_hash,omitempty" xml:"log_zip_tx_hash,omitempty"`
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

func (s *ScreenshotInfo) SetProcessLogFileHash(v string) *ScreenshotInfo {
	s.ProcessLogFileHash = &v
	return s
}

func (s *ScreenshotInfo) SetCheckLogFile(v string) *ScreenshotInfo {
	s.CheckLogFile = &v
	return s
}

func (s *ScreenshotInfo) SetCheckLogFileHash(v string) *ScreenshotInfo {
	s.CheckLogFileHash = &v
	return s
}

func (s *ScreenshotInfo) SetScreenshotFile(v string) *ScreenshotInfo {
	s.ScreenshotFile = &v
	return s
}

func (s *ScreenshotInfo) SetScreenshotFileHash(v string) *ScreenshotInfo {
	s.ScreenshotFileHash = &v
	return s
}

func (s *ScreenshotInfo) SetLogZipFileHash(v string) *ScreenshotInfo {
	s.LogZipFileHash = &v
	return s
}

func (s *ScreenshotInfo) SetLogZipTxHash(v string) *ScreenshotInfo {
	s.LogZipTxHash = &v
	return s
}

// 取证网址信息
type EvidenceWebUrlInfo struct {
	// 取证网址
	WebUrl *string `json:"web_url,omitempty" xml:"web_url,omitempty" require:"true"`
	// 取证名称
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
}

func (s EvidenceWebUrlInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidenceWebUrlInfo) GoString() string {
	return s.String()
}

func (s *EvidenceWebUrlInfo) SetWebUrl(v string) *EvidenceWebUrlInfo {
	s.WebUrl = &v
	return s
}

func (s *EvidenceWebUrlInfo) SetTitle(v string) *EvidenceWebUrlInfo {
	s.Title = &v
	return s
}

// 取证文件信息
type ScreenInfo struct {
	// 全链路取证日志文件下载链接
	ProcessLogFile *string `json:"process_log_file,omitempty" xml:"process_log_file,omitempty"`
	// 全链路取证日志文件哈希
	ProcessLogFileHash *string `json:"process_log_file_hash,omitempty" xml:"process_log_file_hash,omitempty"`
	// 自清洁文件下载地址
	CheckLogFile *string `json:"check_log_file,omitempty" xml:"check_log_file,omitempty"`
	// 自清洁文件哈希
	CheckLogFileHash *string `json:"check_log_file_hash,omitempty" xml:"check_log_file_hash,omitempty"`
	// 网页截图文件下载链接
	WebScreenshotFile *string `json:"web_screenshot_file,omitempty" xml:"web_screenshot_file,omitempty"`
	// 网页截图文件哈希
	WebScreenshotFileHash *string `json:"web_screenshot_file_hash,omitempty" xml:"web_screenshot_file_hash,omitempty"`
	// 网页源码文件下载链接
	WebSourceFile *string `json:"web_source_file,omitempty" xml:"web_source_file,omitempty"`
	// 网页源码文件哈希
	WebSourceFileHash *string `json:"web_source_file_hash,omitempty" xml:"web_source_file_hash,omitempty"`
	// 视频源文件下载链接
	VideoFile *string `json:"video_file,omitempty" xml:"video_file,omitempty"`
	// 视频源文件哈希
	VideoFileHash *string `json:"video_file_hash,omitempty" xml:"video_file_hash,omitempty"`
	// 手机自清洁文件下载链接
	ExtendDeviceCheckFile *string `json:"extend_device_check_file,omitempty" xml:"extend_device_check_file,omitempty"`
	// 手机自清洁文件哈希
	ExtendDeviceCheckFileHash *string `json:"extend_device_check_file_hash,omitempty" xml:"extend_device_check_file_hash,omitempty"`
	// 手机操作日志下载链接
	ExtendDeviceProcessFile *string `json:"extend_device_process_file,omitempty" xml:"extend_device_process_file,omitempty"`
	// 手机操作日志哈希
	ExtendDeviceProcessFileHash *string `json:"extend_device_process_file_hash,omitempty" xml:"extend_device_process_file_hash,omitempty"`
	// 日志打包文件hash
	LogZipFileHash *string `json:"log_zip_file_hash,omitempty" xml:"log_zip_file_hash,omitempty"`
	// 日志打包文件上链hash
	LogZipTxHash *string `json:"log_zip_tx_hash,omitempty" xml:"log_zip_tx_hash,omitempty"`
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

func (s *ScreenInfo) SetProcessLogFileHash(v string) *ScreenInfo {
	s.ProcessLogFileHash = &v
	return s
}

func (s *ScreenInfo) SetCheckLogFile(v string) *ScreenInfo {
	s.CheckLogFile = &v
	return s
}

func (s *ScreenInfo) SetCheckLogFileHash(v string) *ScreenInfo {
	s.CheckLogFileHash = &v
	return s
}

func (s *ScreenInfo) SetWebScreenshotFile(v string) *ScreenInfo {
	s.WebScreenshotFile = &v
	return s
}

func (s *ScreenInfo) SetWebScreenshotFileHash(v string) *ScreenInfo {
	s.WebScreenshotFileHash = &v
	return s
}

func (s *ScreenInfo) SetWebSourceFile(v string) *ScreenInfo {
	s.WebSourceFile = &v
	return s
}

func (s *ScreenInfo) SetWebSourceFileHash(v string) *ScreenInfo {
	s.WebSourceFileHash = &v
	return s
}

func (s *ScreenInfo) SetVideoFile(v string) *ScreenInfo {
	s.VideoFile = &v
	return s
}

func (s *ScreenInfo) SetVideoFileHash(v string) *ScreenInfo {
	s.VideoFileHash = &v
	return s
}

func (s *ScreenInfo) SetExtendDeviceCheckFile(v string) *ScreenInfo {
	s.ExtendDeviceCheckFile = &v
	return s
}

func (s *ScreenInfo) SetExtendDeviceCheckFileHash(v string) *ScreenInfo {
	s.ExtendDeviceCheckFileHash = &v
	return s
}

func (s *ScreenInfo) SetExtendDeviceProcessFile(v string) *ScreenInfo {
	s.ExtendDeviceProcessFile = &v
	return s
}

func (s *ScreenInfo) SetExtendDeviceProcessFileHash(v string) *ScreenInfo {
	s.ExtendDeviceProcessFileHash = &v
	return s
}

func (s *ScreenInfo) SetLogZipFileHash(v string) *ScreenInfo {
	s.LogZipFileHash = &v
	return s
}

func (s *ScreenInfo) SetLogZipTxHash(v string) *ScreenInfo {
	s.LogZipTxHash = &v
	return s
}

// 出证开票信息
type NotaryInvoiceInfo struct {
	// 开票类型
	BillingType *string `json:"billing_type,omitempty" xml:"billing_type,omitempty" require:"true"`
	// 发票类型
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty" require:"true"`
	// 主体类型
	SubjectType *string `json:"subject_type,omitempty" xml:"subject_type,omitempty" require:"true"`
	// 发票抬头
	InvoiceName *string `json:"invoice_name,omitempty" xml:"invoice_name,omitempty" require:"true"`
	// 纳税人识别号
	RatepayerCode *string `json:"ratepayer_code,omitempty" xml:"ratepayer_code,omitempty"`
	// 开户行
	BankType *string `json:"bank_type,omitempty" xml:"bank_type,omitempty"`
	// 开户行账号
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty"`
	// 单位地址
	UnitAddress *string `json:"unit_address,omitempty" xml:"unit_address,omitempty"`
	// 单位电话
	UnitPhone *string `json:"unit_phone,omitempty" xml:"unit_phone,omitempty"`
	// 发票收件信息
	Delivery *DeliveryInfo `json:"delivery,omitempty" xml:"delivery,omitempty"`
}

func (s NotaryInvoiceInfo) String() string {
	return tea.Prettify(s)
}

func (s NotaryInvoiceInfo) GoString() string {
	return s.String()
}

func (s *NotaryInvoiceInfo) SetBillingType(v string) *NotaryInvoiceInfo {
	s.BillingType = &v
	return s
}

func (s *NotaryInvoiceInfo) SetInvoiceType(v string) *NotaryInvoiceInfo {
	s.InvoiceType = &v
	return s
}

func (s *NotaryInvoiceInfo) SetSubjectType(v string) *NotaryInvoiceInfo {
	s.SubjectType = &v
	return s
}

func (s *NotaryInvoiceInfo) SetInvoiceName(v string) *NotaryInvoiceInfo {
	s.InvoiceName = &v
	return s
}

func (s *NotaryInvoiceInfo) SetRatepayerCode(v string) *NotaryInvoiceInfo {
	s.RatepayerCode = &v
	return s
}

func (s *NotaryInvoiceInfo) SetBankType(v string) *NotaryInvoiceInfo {
	s.BankType = &v
	return s
}

func (s *NotaryInvoiceInfo) SetBankAccount(v string) *NotaryInvoiceInfo {
	s.BankAccount = &v
	return s
}

func (s *NotaryInvoiceInfo) SetUnitAddress(v string) *NotaryInvoiceInfo {
	s.UnitAddress = &v
	return s
}

func (s *NotaryInvoiceInfo) SetUnitPhone(v string) *NotaryInvoiceInfo {
	s.UnitPhone = &v
	return s
}

func (s *NotaryInvoiceInfo) SetDelivery(v *DeliveryInfo) *NotaryInvoiceInfo {
	s.Delivery = v
	return s
}

// 在售摘要信息
type SaleDigestData struct {
	// 商品hash值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
	// 物料置信度
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s SaleDigestData) String() string {
	return tea.Prettify(s)
}

func (s SaleDigestData) GoString() string {
	return s.String()
}

func (s *SaleDigestData) SetHash(v string) *SaleDigestData {
	s.Hash = &v
	return s
}

func (s *SaleDigestData) SetScore(v string) *SaleDigestData {
	s.Score = &v
	return s
}

// 取证文件信息
type EvidenceFile struct {
	// 证据文件名称
	EvidenceFileName *string `json:"evidence_file_name,omitempty" xml:"evidence_file_name,omitempty" require:"true"`
	// 证据文件备注
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" require:"true"`
	// 文件类型
	EvidenceFileType *string `json:"evidence_file_type,omitempty" xml:"evidence_file_type,omitempty" require:"true"`
	// 文件大小
	EvidenceFileSize *int64 `json:"evidence_file_size,omitempty" xml:"evidence_file_size,omitempty" require:"true"`
	// 文件时长（单位：秒）
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty" require:"true"`
	// 证据文件指纹
	EvidenceFileHash *string `json:"evidence_file_hash,omitempty" xml:"evidence_file_hash,omitempty" require:"true"`
	// 文件url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
}

func (s EvidenceFile) String() string {
	return tea.Prettify(s)
}

func (s EvidenceFile) GoString() string {
	return s.String()
}

func (s *EvidenceFile) SetEvidenceFileName(v string) *EvidenceFile {
	s.EvidenceFileName = &v
	return s
}

func (s *EvidenceFile) SetMemo(v string) *EvidenceFile {
	s.Memo = &v
	return s
}

func (s *EvidenceFile) SetEvidenceFileType(v string) *EvidenceFile {
	s.EvidenceFileType = &v
	return s
}

func (s *EvidenceFile) SetEvidenceFileSize(v int64) *EvidenceFile {
	s.EvidenceFileSize = &v
	return s
}

func (s *EvidenceFile) SetDuration(v int64) *EvidenceFile {
	s.Duration = &v
	return s
}

func (s *EvidenceFile) SetEvidenceFileHash(v string) *EvidenceFile {
	s.EvidenceFileHash = &v
	return s
}

func (s *EvidenceFile) SetFileUrl(v string) *EvidenceFile {
	s.FileUrl = &v
	return s
}

// 申办事由
type BidReason struct {
	// 事由类别ID
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty" require:"true"`
	// 分类名称
	CategoryName *string `json:"category_name,omitempty" xml:"category_name,omitempty" require:"true"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 文件上传描述
	FileUploadDesc *string `json:"file_upload_desc,omitempty" xml:"file_upload_desc,omitempty" require:"true"`
	// 排序
	Rank *int64 `json:"rank,omitempty" xml:"rank,omitempty" require:"true"`
	// 是否必须上传证明文件
	IsNeedTestifyFile *bool `json:"is_need_testify_file,omitempty" xml:"is_need_testify_file,omitempty" require:"true"`
	// reasonArray
	ReasonArray []*Reason `json:"reason_array,omitempty" xml:"reason_array,omitempty" require:"true" type:"Repeated"`
}

func (s BidReason) String() string {
	return tea.Prettify(s)
}

func (s BidReason) GoString() string {
	return s.String()
}

func (s *BidReason) SetCategoryId(v string) *BidReason {
	s.CategoryId = &v
	return s
}

func (s *BidReason) SetCategoryName(v string) *BidReason {
	s.CategoryName = &v
	return s
}

func (s *BidReason) SetDesc(v string) *BidReason {
	s.Desc = &v
	return s
}

func (s *BidReason) SetFileUploadDesc(v string) *BidReason {
	s.FileUploadDesc = &v
	return s
}

func (s *BidReason) SetRank(v int64) *BidReason {
	s.Rank = &v
	return s
}

func (s *BidReason) SetIsNeedTestifyFile(v bool) *BidReason {
	s.IsNeedTestifyFile = &v
	return s
}

func (s *BidReason) SetReasonArray(v []*Reason) *BidReason {
	s.ReasonArray = v
	return s
}

// 存证证明信息
type EvidenceCertificateInfo struct {
	// 证书编号
	CertificateNo *string `json:"certificate_no,omitempty" xml:"certificate_no,omitempty" require:"true"`
	// 上链时间
	CertificateTime *string `json:"certificate_time,omitempty" xml:"certificate_time,omitempty" require:"true"`
	// 链上交易hash
	CertificateHash *string `json:"certificate_hash,omitempty" xml:"certificate_hash,omitempty" require:"true"`
	// 证书下载url（有效期3天）
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty" require:"true"`
}

func (s EvidenceCertificateInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidenceCertificateInfo) GoString() string {
	return s.String()
}

func (s *EvidenceCertificateInfo) SetCertificateNo(v string) *EvidenceCertificateInfo {
	s.CertificateNo = &v
	return s
}

func (s *EvidenceCertificateInfo) SetCertificateTime(v string) *EvidenceCertificateInfo {
	s.CertificateTime = &v
	return s
}

func (s *EvidenceCertificateInfo) SetCertificateHash(v string) *EvidenceCertificateInfo {
	s.CertificateHash = &v
	return s
}

func (s *EvidenceCertificateInfo) SetCertificateUrl(v string) *EvidenceCertificateInfo {
	s.CertificateUrl = &v
	return s
}

// 公证书送达信息
type ReceiveInfo struct {
	// 纸质公证书份数
	Copies *int64 `json:"copies,omitempty" xml:"copies,omitempty"`
	// 公证书类型
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// 收件人信息
	DeliveryInfo *DeliveryInfo `json:"delivery_info,omitempty" xml:"delivery_info,omitempty" require:"true"`
}

func (s ReceiveInfo) String() string {
	return tea.Prettify(s)
}

func (s ReceiveInfo) GoString() string {
	return s.String()
}

func (s *ReceiveInfo) SetCopies(v int64) *ReceiveInfo {
	s.Copies = &v
	return s
}

func (s *ReceiveInfo) SetOrderType(v string) *ReceiveInfo {
	s.OrderType = &v
	return s
}

func (s *ReceiveInfo) SetDeliveryInfo(v *DeliveryInfo) *ReceiveInfo {
	s.DeliveryInfo = v
	return s
}

// 服务商下工作人员
type IsvWorkerInfoVO struct {
	// 工作人员账号id
	WorkerAccountId *string `json:"worker_account_id,omitempty" xml:"worker_account_id,omitempty" require:"true"`
	// 工作人员姓名
	WorkerName *string `json:"worker_name,omitempty" xml:"worker_name,omitempty" require:"true"`
}

func (s IsvWorkerInfoVO) String() string {
	return tea.Prettify(s)
}

func (s IsvWorkerInfoVO) GoString() string {
	return s.String()
}

func (s *IsvWorkerInfoVO) SetWorkerAccountId(v string) *IsvWorkerInfoVO {
	s.WorkerAccountId = &v
	return s
}

func (s *IsvWorkerInfoVO) SetWorkerName(v string) *IsvWorkerInfoVO {
	s.WorkerName = &v
	return s
}

// 日统计数据模型
type DayStatisticsInfo struct {
	// 日期时间戳
	Date *int64 `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 日观看次数
	DayViews *string `json:"day_views,omitempty" xml:"day_views,omitempty" require:"true"`
	// 日观看时长
	DayViewDuration *string `json:"day_view_duration,omitempty" xml:"day_view_duration,omitempty" require:"true"`
	// 日平均观看时长
	DayAverageViewDuration *string `json:"day_average_view_duration,omitempty" xml:"day_average_view_duration,omitempty" require:"true"`
	// 日预计收入
	Revenue *string `json:"revenue,omitempty" xml:"revenue,omitempty" require:"true"`
}

func (s DayStatisticsInfo) String() string {
	return tea.Prettify(s)
}

func (s DayStatisticsInfo) GoString() string {
	return s.String()
}

func (s *DayStatisticsInfo) SetDate(v int64) *DayStatisticsInfo {
	s.Date = &v
	return s
}

func (s *DayStatisticsInfo) SetDayViews(v string) *DayStatisticsInfo {
	s.DayViews = &v
	return s
}

func (s *DayStatisticsInfo) SetDayViewDuration(v string) *DayStatisticsInfo {
	s.DayViewDuration = &v
	return s
}

func (s *DayStatisticsInfo) SetDayAverageViewDuration(v string) *DayStatisticsInfo {
	s.DayAverageViewDuration = &v
	return s
}

func (s *DayStatisticsInfo) SetRevenue(v string) *DayStatisticsInfo {
	s.Revenue = &v
	return s
}

// 作品是否包含图片
type ContainsImageInfo struct {
	// 是否包含图片
	ContainsImage *bool `json:"contains_image,omitempty" xml:"contains_image,omitempty"`
	// 包含图片，处理后的图片副件
	ResolvedFileUrl *string `json:"resolved_file_url,omitempty" xml:"resolved_file_url,omitempty"`
}

func (s ContainsImageInfo) String() string {
	return tea.Prettify(s)
}

func (s ContainsImageInfo) GoString() string {
	return s.String()
}

func (s *ContainsImageInfo) SetContainsImage(v bool) *ContainsImageInfo {
	s.ContainsImage = &v
	return s
}

func (s *ContainsImageInfo) SetResolvedFileUrl(v string) *ContainsImageInfo {
	s.ResolvedFileUrl = &v
	return s
}

// 系列图错误原因
type SeriesDiagramErrorReason struct {
	// 系列图单个图片所属页码
	ImagePdfPageIndex *int64 `json:"image_pdf_page_index,omitempty" xml:"image_pdf_page_index,omitempty" require:"true"`
	// 错误原因英文
	Error *string `json:"error,omitempty" xml:"error,omitempty" require:"true"`
	// 错误原因中文
	ErrorCn *string `json:"error_cn,omitempty" xml:"error_cn,omitempty" require:"true"`
}

func (s SeriesDiagramErrorReason) String() string {
	return tea.Prettify(s)
}

func (s SeriesDiagramErrorReason) GoString() string {
	return s.String()
}

func (s *SeriesDiagramErrorReason) SetImagePdfPageIndex(v int64) *SeriesDiagramErrorReason {
	s.ImagePdfPageIndex = &v
	return s
}

func (s *SeriesDiagramErrorReason) SetError(v string) *SeriesDiagramErrorReason {
	s.Error = &v
	return s
}

func (s *SeriesDiagramErrorReason) SetErrorCn(v string) *SeriesDiagramErrorReason {
	s.ErrorCn = &v
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

// 服务商工作人员列表
type IsvWorkerInfoVOList struct {
	// 服务商下工作人员信息列表
	IsvWorkerInfoList []*IsvWorkerInfoVO `json:"isv_worker_info_list,omitempty" xml:"isv_worker_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s IsvWorkerInfoVOList) String() string {
	return tea.Prettify(s)
}

func (s IsvWorkerInfoVOList) GoString() string {
	return s.String()
}

func (s *IsvWorkerInfoVOList) SetIsvWorkerInfoList(v []*IsvWorkerInfoVO) *IsvWorkerInfoVOList {
	s.IsvWorkerInfoList = v
	return s
}

// 订单明细
type OrderItem struct {
	// 项目ID
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty" require:"true"`
	// 项目类型（数登申请）
	ItemType *string `json:"item_type,omitempty" xml:"item_type,omitempty" require:"true"`
}

func (s OrderItem) String() string {
	return tea.Prettify(s)
}

func (s OrderItem) GoString() string {
	return s.String()
}

func (s *OrderItem) SetItemId(v string) *OrderItem {
	s.ItemId = &v
	return s
}

func (s *OrderItem) SetItemType(v string) *OrderItem {
	s.ItemType = &v
	return s
}

// 网页截图存证结果
type ScreenshotCertificateResult struct {
	// 证据类型
	EvidenceType *string `json:"evidence_type,omitempty" xml:"evidence_type,omitempty" require:"true"`
	// 证据状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 网页截取编号
	ScreenshotId *string `json:"screenshot_id,omitempty" xml:"screenshot_id,omitempty" require:"true"`
	// 证据编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
	// 存证编号
	CertificateNo *string `json:"certificate_no,omitempty" xml:"certificate_no,omitempty" require:"true"`
	// 上链时间
	CertificateTime *int64 `json:"certificate_time,omitempty" xml:"certificate_time,omitempty" require:"true"`
	// 证据hash
	EvidenceHash *string `json:"evidence_hash,omitempty" xml:"evidence_hash,omitempty" require:"true"`
	// 链上交易hash
	EvidenceTxHash *string `json:"evidence_tx_hash,omitempty" xml:"evidence_tx_hash,omitempty" require:"true"`
	// 证书下载链接
	CertificateFileUrl *string `json:"certificate_file_url,omitempty" xml:"certificate_file_url,omitempty" require:"true"`
	// 截图文件下载链接
	ScreenshotFileUrl *string `json:"screenshot_file_url,omitempty" xml:"screenshot_file_url,omitempty" require:"true"`
	// 证据文件大小
	EvidenceFileSize *int64 `json:"evidence_file_size,omitempty" xml:"evidence_file_size,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
}

func (s ScreenshotCertificateResult) String() string {
	return tea.Prettify(s)
}

func (s ScreenshotCertificateResult) GoString() string {
	return s.String()
}

func (s *ScreenshotCertificateResult) SetEvidenceType(v string) *ScreenshotCertificateResult {
	s.EvidenceType = &v
	return s
}

func (s *ScreenshotCertificateResult) SetStatus(v string) *ScreenshotCertificateResult {
	s.Status = &v
	return s
}

func (s *ScreenshotCertificateResult) SetScreenshotId(v string) *ScreenshotCertificateResult {
	s.ScreenshotId = &v
	return s
}

func (s *ScreenshotCertificateResult) SetEvidenceId(v string) *ScreenshotCertificateResult {
	s.EvidenceId = &v
	return s
}

func (s *ScreenshotCertificateResult) SetCertificateNo(v string) *ScreenshotCertificateResult {
	s.CertificateNo = &v
	return s
}

func (s *ScreenshotCertificateResult) SetCertificateTime(v int64) *ScreenshotCertificateResult {
	s.CertificateTime = &v
	return s
}

func (s *ScreenshotCertificateResult) SetEvidenceHash(v string) *ScreenshotCertificateResult {
	s.EvidenceHash = &v
	return s
}

func (s *ScreenshotCertificateResult) SetEvidenceTxHash(v string) *ScreenshotCertificateResult {
	s.EvidenceTxHash = &v
	return s
}

func (s *ScreenshotCertificateResult) SetCertificateFileUrl(v string) *ScreenshotCertificateResult {
	s.CertificateFileUrl = &v
	return s
}

func (s *ScreenshotCertificateResult) SetScreenshotFileUrl(v string) *ScreenshotCertificateResult {
	s.ScreenshotFileUrl = &v
	return s
}

func (s *ScreenshotCertificateResult) SetEvidenceFileSize(v int64) *ScreenshotCertificateResult {
	s.EvidenceFileSize = &v
	return s
}

func (s *ScreenshotCertificateResult) SetErrorCode(v string) *ScreenshotCertificateResult {
	s.ErrorCode = &v
	return s
}

func (s *ScreenshotCertificateResult) SetErrorMessage(v string) *ScreenshotCertificateResult {
	s.ErrorMessage = &v
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
	// 公证处隶属
	Belong *string `json:"belong,omitempty" xml:"belong,omitempty" require:"true"`
	// 公证处出证规则
	NotaryOrderRule *NotaryOrderRule `json:"notary_order_rule,omitempty" xml:"notary_order_rule,omitempty"`
	// 是否允许出证
	AllowCertification *bool `json:"allow_certification,omitempty" xml:"allow_certification,omitempty"`
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

func (s *NotaryPublicOffice) SetBelong(v string) *NotaryPublicOffice {
	s.Belong = &v
	return s
}

func (s *NotaryPublicOffice) SetNotaryOrderRule(v *NotaryOrderRule) *NotaryPublicOffice {
	s.NotaryOrderRule = v
	return s
}

func (s *NotaryPublicOffice) SetAllowCertification(v bool) *NotaryPublicOffice {
	s.AllowCertification = &v
	return s
}

// 本次申请中每一类证据的数量明细
type NotaryFeeEvidTypeData struct {
	// 证据类型描述
	EvidTypeDesc *string `json:"evid_type_desc,omitempty" xml:"evid_type_desc,omitempty" require:"true"`
	// 证据分类及数量详情
	EvidTypeDetail *string `json:"evid_type_detail,omitempty" xml:"evid_type_detail,omitempty" require:"true"`
}

func (s NotaryFeeEvidTypeData) String() string {
	return tea.Prettify(s)
}

func (s NotaryFeeEvidTypeData) GoString() string {
	return s.String()
}

func (s *NotaryFeeEvidTypeData) SetEvidTypeDesc(v string) *NotaryFeeEvidTypeData {
	s.EvidTypeDesc = &v
	return s
}

func (s *NotaryFeeEvidTypeData) SetEvidTypeDetail(v string) *NotaryFeeEvidTypeData {
	s.EvidTypeDetail = &v
	return s
}

// dci作品发表信息
type DciPublicationInfo struct {
	// 作品发表状态
	PublicationStatus *string `json:"publication_status,omitempty" xml:"publication_status,omitempty" require:"true"`
	// 首次发表日期
	FirstPublicationDate *string `json:"first_publication_date,omitempty" xml:"first_publication_date,omitempty" require:"true"`
	// 首次发表地址
	FirstPublicationPlace *string `json:"first_publication_place,omitempty" xml:"first_publication_place,omitempty"`
	// 首次发表地点地区编码
	FirstPublicationCode *string `json:"first_publication_code,omitempty" xml:"first_publication_code,omitempty" require:"true"`
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

func (s *DciPublicationInfo) SetFirstPublicationCode(v string) *DciPublicationInfo {
	s.FirstPublicationCode = &v
	return s
}

// dci作品创作信息
type DciCreationInfo struct {
	// 作品创作性质
	CreationNature *string `json:"creation_nature,omitempty" xml:"creation_nature,omitempty" require:"true"`
	// 创作完成日期
	CreationCompletionDate *string `json:"creation_completion_date,omitempty" xml:"creation_completion_date,omitempty" require:"true"`
	// 创作完成地点
	CreationCompletionPlace *string `json:"creation_completion_place,omitempty" xml:"creation_completion_place,omitempty"`
	// 作品创作地点地区编码
	CreationCompletionCode *string `json:"creation_completion_code,omitempty" xml:"creation_completion_code,omitempty" require:"true"`
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

func (s *DciCreationInfo) SetCreationCompletionCode(v string) *DciCreationInfo {
	s.CreationCompletionCode = &v
	return s
}

// 本次需支付费用的分项明细
type NotaryFeeItem struct {
	// 费用分项描述
	FeeItemDesc *string `json:"fee_item_desc,omitempty" xml:"fee_item_desc,omitempty" require:"true"`
	// 费用分项金额(分)
	FeeItemAmountRmbFen *int64 `json:"fee_item_amount_rmb_fen,omitempty" xml:"fee_item_amount_rmb_fen,omitempty" require:"true"`
	// 费用分项详情列表
	FeeDetailList []*FeeDetail `json:"fee_detail_list,omitempty" xml:"fee_detail_list,omitempty" require:"true" type:"Repeated"`
}

func (s NotaryFeeItem) String() string {
	return tea.Prettify(s)
}

func (s NotaryFeeItem) GoString() string {
	return s.String()
}

func (s *NotaryFeeItem) SetFeeItemDesc(v string) *NotaryFeeItem {
	s.FeeItemDesc = &v
	return s
}

func (s *NotaryFeeItem) SetFeeItemAmountRmbFen(v int64) *NotaryFeeItem {
	s.FeeItemAmountRmbFen = &v
	return s
}

func (s *NotaryFeeItem) SetFeeDetailList(v []*FeeDetail) *NotaryFeeItem {
	s.FeeDetailList = v
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

// 公证出证拒绝办理信息/终止信息
type RefuseInfo struct {
	// 拒绝理由/终止备注
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" require:"true"`
	// 不予办理决定书路径/终止决定书路径
	NotificationPath *string `json:"notification_path,omitempty" xml:"notification_path,omitempty" require:"true"`
}

func (s RefuseInfo) String() string {
	return tea.Prettify(s)
}

func (s RefuseInfo) GoString() string {
	return s.String()
}

func (s *RefuseInfo) SetReason(v string) *RefuseInfo {
	s.Reason = &v
	return s
}

func (s *RefuseInfo) SetNotificationPath(v string) *RefuseInfo {
	s.NotificationPath = &v
	return s
}

// 骑行保平台任务详情
type InsuranceTaskDetailInfo struct {
	// 用户备注
	UserMemo *string `json:"user_memo,omitempty" xml:"user_memo,omitempty"`
	// 上门人员姓名
	DoorToDoorWorkerName *string `json:"door_to_door_worker_name,omitempty" xml:"door_to_door_worker_name,omitempty"`
	// 电池包装码
	BatteryPackagingCode *string `json:"battery_packaging_code,omitempty" xml:"battery_packaging_code,omitempty"`
	// 电池码
	BatteryCode *string `json:"battery_code,omitempty" xml:"battery_code,omitempty"`
	// 图片列表
	InstallImages []*string `json:"install_images,omitempty" xml:"install_images,omitempty" type:"Repeated"`
	// 任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 任务状态
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
	// 电池型号
	BatteryType *string `json:"battery_type,omitempty" xml:"battery_type,omitempty" require:"true"`
	// 上门地址
	ServiceAddress *string `json:"service_address,omitempty" xml:"service_address,omitempty" require:"true"`
	// 租赁人姓名
	BatteryRenterName *string `json:"battery_renter_name,omitempty" xml:"battery_renter_name,omitempty" require:"true"`
	// 租赁人电话
	BatteryRenterPhone *string `json:"battery_renter_phone,omitempty" xml:"battery_renter_phone,omitempty" require:"true"`
	// 上门时间
	ServiceTime *string `json:"service_time,omitempty" xml:"service_time,omitempty" require:"true"`
	// 任务所属服务商账号id
	IsvAccountId *string `json:"isv_account_id,omitempty" xml:"isv_account_id,omitempty" require:"true"`
}

func (s InsuranceTaskDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s InsuranceTaskDetailInfo) GoString() string {
	return s.String()
}

func (s *InsuranceTaskDetailInfo) SetUserMemo(v string) *InsuranceTaskDetailInfo {
	s.UserMemo = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetDoorToDoorWorkerName(v string) *InsuranceTaskDetailInfo {
	s.DoorToDoorWorkerName = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetBatteryPackagingCode(v string) *InsuranceTaskDetailInfo {
	s.BatteryPackagingCode = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetBatteryCode(v string) *InsuranceTaskDetailInfo {
	s.BatteryCode = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetInstallImages(v []*string) *InsuranceTaskDetailInfo {
	s.InstallImages = v
	return s
}

func (s *InsuranceTaskDetailInfo) SetTaskId(v string) *InsuranceTaskDetailInfo {
	s.TaskId = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetTaskStatus(v string) *InsuranceTaskDetailInfo {
	s.TaskStatus = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetBatteryType(v string) *InsuranceTaskDetailInfo {
	s.BatteryType = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetServiceAddress(v string) *InsuranceTaskDetailInfo {
	s.ServiceAddress = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetBatteryRenterName(v string) *InsuranceTaskDetailInfo {
	s.BatteryRenterName = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetBatteryRenterPhone(v string) *InsuranceTaskDetailInfo {
	s.BatteryRenterPhone = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetServiceTime(v string) *InsuranceTaskDetailInfo {
	s.ServiceTime = &v
	return s
}

func (s *InsuranceTaskDetailInfo) SetIsvAccountId(v string) *InsuranceTaskDetailInfo {
	s.IsvAccountId = &v
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

// 版权商品库存
type ItemInventoryVO struct {
	// 库存数量
	Stock *int64 `json:"stock,omitempty" xml:"stock,omitempty" require:"true"`
	// 生效时间
	GmtValid *string `json:"gmt_valid,omitempty" xml:"gmt_valid,omitempty" require:"true"`
	// 失效时间
	GmtInvalid *string `json:"gmt_invalid,omitempty" xml:"gmt_invalid,omitempty" require:"true"`
}

func (s ItemInventoryVO) String() string {
	return tea.Prettify(s)
}

func (s ItemInventoryVO) GoString() string {
	return s.String()
}

func (s *ItemInventoryVO) SetStock(v int64) *ItemInventoryVO {
	s.Stock = &v
	return s
}

func (s *ItemInventoryVO) SetGmtValid(v string) *ItemInventoryVO {
	s.GmtValid = &v
	return s
}

func (s *ItemInventoryVO) SetGmtInvalid(v string) *ItemInventoryVO {
	s.GmtInvalid = &v
	return s
}

// 出海视频统计数据
type OverseaContentStatistics struct {
	// 发布视频id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 总观看次数
	TotalViews *string `json:"total_views,omitempty" xml:"total_views,omitempty" require:"true"`
	// 总观看时长
	TotalViewDuration *string `json:"total_view_duration,omitempty" xml:"total_view_duration,omitempty" require:"true"`
	// 总平均观看时长
	TotalAverageViewDuration *string `json:"total_average_view_duration,omitempty" xml:"total_average_view_duration,omitempty" require:"true"`
	// 总预计收入
	TotalRevenue *string `json:"total_revenue,omitempty" xml:"total_revenue,omitempty" require:"true"`
	// 每日详细统计列表
	DayStatisticsList []*DayStatisticsInfo `json:"day_statistics_list,omitempty" xml:"day_statistics_list,omitempty" require:"true" type:"Repeated"`
}

func (s OverseaContentStatistics) String() string {
	return tea.Prettify(s)
}

func (s OverseaContentStatistics) GoString() string {
	return s.String()
}

func (s *OverseaContentStatistics) SetContentId(v string) *OverseaContentStatistics {
	s.ContentId = &v
	return s
}

func (s *OverseaContentStatistics) SetTotalViews(v string) *OverseaContentStatistics {
	s.TotalViews = &v
	return s
}

func (s *OverseaContentStatistics) SetTotalViewDuration(v string) *OverseaContentStatistics {
	s.TotalViewDuration = &v
	return s
}

func (s *OverseaContentStatistics) SetTotalAverageViewDuration(v string) *OverseaContentStatistics {
	s.TotalAverageViewDuration = &v
	return s
}

func (s *OverseaContentStatistics) SetTotalRevenue(v string) *OverseaContentStatistics {
	s.TotalRevenue = &v
	return s
}

func (s *OverseaContentStatistics) SetDayStatisticsList(v []*DayStatisticsInfo) *OverseaContentStatistics {
	s.DayStatisticsList = v
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

// 线下取证存证结果
type OfflineRegisterResult struct {
	// 取证文件
	EvidenceFile *EvidenceFile `json:"evidence_file,omitempty" xml:"evidence_file,omitempty"`
	// 线下取证ID
	OfflineEvidenceId *string `json:"offline_evidence_id,omitempty" xml:"offline_evidence_id,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 取证状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 取证时间
	EvidenceTime *int64 `json:"evidence_time,omitempty" xml:"evidence_time,omitempty"`
	// 委托取证ID
	EvidenceAssignmentId *string `json:"evidence_assignment_id,omitempty" xml:"evidence_assignment_id,omitempty"`
	// 取证用户ID
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty"`
	// 取证名称
	EvidenceName *string `json:"evidence_name,omitempty" xml:"evidence_name,omitempty"`
	// 公证处code
	NotaryOfficeCode *string `json:"notary_office_code,omitempty" xml:"notary_office_code,omitempty"`
	// 公证处名称
	NotaryOfficeName *string `json:"notary_office_name,omitempty" xml:"notary_office_name,omitempty"`
	// 经度
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 纬度
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 位置
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 取证开始时间
	EvidenceStartTime *int64 `json:"evidence_start_time,omitempty" xml:"evidence_start_time,omitempty"`
	// 取证结束时间
	EvidenceEndTime *int64 `json:"evidence_end_time,omitempty" xml:"evidence_end_time,omitempty"`
	// 取证类型
	EvidenceType *string `json:"evidence_type,omitempty" xml:"evidence_type,omitempty" require:"true"`
	// 存证编号
	CertificateNo *string `json:"certificate_no,omitempty" xml:"certificate_no,omitempty"`
	//
	// 上链时间
	CertificateTime *int64 `json:"certificate_time,omitempty" xml:"certificate_time,omitempty"`
	// 证据hash
	EvidenceHash *string `json:"evidence_hash,omitempty" xml:"evidence_hash,omitempty"`
	// 链上交易hash
	EvidenceTxHash *string `json:"evidence_tx_hash,omitempty" xml:"evidence_tx_hash,omitempty"`
	// 证书文件下载地址
	CertificateFileUrl *string `json:"certificate_file_url,omitempty" xml:"certificate_file_url,omitempty"`
	// 备注
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
}

func (s OfflineRegisterResult) String() string {
	return tea.Prettify(s)
}

func (s OfflineRegisterResult) GoString() string {
	return s.String()
}

func (s *OfflineRegisterResult) SetEvidenceFile(v *EvidenceFile) *OfflineRegisterResult {
	s.EvidenceFile = v
	return s
}

func (s *OfflineRegisterResult) SetOfflineEvidenceId(v string) *OfflineRegisterResult {
	s.OfflineEvidenceId = &v
	return s
}

func (s *OfflineRegisterResult) SetErrorCode(v string) *OfflineRegisterResult {
	s.ErrorCode = &v
	return s
}

func (s *OfflineRegisterResult) SetErrorMessage(v string) *OfflineRegisterResult {
	s.ErrorMessage = &v
	return s
}

func (s *OfflineRegisterResult) SetStatus(v string) *OfflineRegisterResult {
	s.Status = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceTime(v int64) *OfflineRegisterResult {
	s.EvidenceTime = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceAssignmentId(v string) *OfflineRegisterResult {
	s.EvidenceAssignmentId = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceUserId(v string) *OfflineRegisterResult {
	s.EvidenceUserId = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceName(v string) *OfflineRegisterResult {
	s.EvidenceName = &v
	return s
}

func (s *OfflineRegisterResult) SetNotaryOfficeCode(v string) *OfflineRegisterResult {
	s.NotaryOfficeCode = &v
	return s
}

func (s *OfflineRegisterResult) SetNotaryOfficeName(v string) *OfflineRegisterResult {
	s.NotaryOfficeName = &v
	return s
}

func (s *OfflineRegisterResult) SetLongitude(v string) *OfflineRegisterResult {
	s.Longitude = &v
	return s
}

func (s *OfflineRegisterResult) SetLatitude(v string) *OfflineRegisterResult {
	s.Latitude = &v
	return s
}

func (s *OfflineRegisterResult) SetLocation(v string) *OfflineRegisterResult {
	s.Location = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceStartTime(v int64) *OfflineRegisterResult {
	s.EvidenceStartTime = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceEndTime(v int64) *OfflineRegisterResult {
	s.EvidenceEndTime = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceType(v string) *OfflineRegisterResult {
	s.EvidenceType = &v
	return s
}

func (s *OfflineRegisterResult) SetCertificateNo(v string) *OfflineRegisterResult {
	s.CertificateNo = &v
	return s
}

func (s *OfflineRegisterResult) SetCertificateTime(v int64) *OfflineRegisterResult {
	s.CertificateTime = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceHash(v string) *OfflineRegisterResult {
	s.EvidenceHash = &v
	return s
}

func (s *OfflineRegisterResult) SetEvidenceTxHash(v string) *OfflineRegisterResult {
	s.EvidenceTxHash = &v
	return s
}

func (s *OfflineRegisterResult) SetCertificateFileUrl(v string) *OfflineRegisterResult {
	s.CertificateFileUrl = &v
	return s
}

func (s *OfflineRegisterResult) SetMemo(v string) *OfflineRegisterResult {
	s.Memo = &v
	return s
}

// 发票信息
type InvoiceInfo struct {
	// 发票类型 InvoiceTypeEnum目前只支持普票
	// (NORMAL,ELC,普票)
	// (SPECIAL,VAT,专票)
	InvoiceType *string `json:"invoice_type,omitempty" xml:"invoice_type,omitempty" require:"true"`
	// 发票抬头（著作权人之一）
	InvoiceHeader *string `json:"invoice_header,omitempty" xml:"invoice_header,omitempty" require:"true"`
	// 纳税人识别号（机构必填）
	TaxpayerNumber *string `json:"taxpayer_number,omitempty" xml:"taxpayer_number,omitempty"`
	// 注册地址（专票必填）
	RegisteredAddress *string `json:"registered_address,omitempty" xml:"registered_address,omitempty"`
	// 注册电话（专票必填）
	RegisteredTel *string `json:"registered_tel,omitempty" xml:"registered_tel,omitempty"`
	// 开户电话（专票必填）
	OpenAccountTel *string `json:"open_account_tel,omitempty" xml:"open_account_tel,omitempty"`
	// 开户银行（专票必填）
	OpenAccountBank *string `json:"open_account_bank,omitempty" xml:"open_account_bank,omitempty"`
	// 银行账号（专票必填）
	BankAccount *string `json:"bank_account,omitempty" xml:"bank_account,omitempty"`
}

func (s InvoiceInfo) String() string {
	return tea.Prettify(s)
}

func (s InvoiceInfo) GoString() string {
	return s.String()
}

func (s *InvoiceInfo) SetInvoiceType(v string) *InvoiceInfo {
	s.InvoiceType = &v
	return s
}

func (s *InvoiceInfo) SetInvoiceHeader(v string) *InvoiceInfo {
	s.InvoiceHeader = &v
	return s
}

func (s *InvoiceInfo) SetTaxpayerNumber(v string) *InvoiceInfo {
	s.TaxpayerNumber = &v
	return s
}

func (s *InvoiceInfo) SetRegisteredAddress(v string) *InvoiceInfo {
	s.RegisteredAddress = &v
	return s
}

func (s *InvoiceInfo) SetRegisteredTel(v string) *InvoiceInfo {
	s.RegisteredTel = &v
	return s
}

func (s *InvoiceInfo) SetOpenAccountTel(v string) *InvoiceInfo {
	s.OpenAccountTel = &v
	return s
}

func (s *InvoiceInfo) SetOpenAccountBank(v string) *InvoiceInfo {
	s.OpenAccountBank = &v
	return s
}

func (s *InvoiceInfo) SetBankAccount(v string) *InvoiceInfo {
	s.BankAccount = &v
	return s
}

// 公证出证送达信息
type NotaryReceiveInfo struct {
	// 公证书类型
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// 公证书送达信息
	ReceiveInfo *ReceiveInfo `json:"receive_info,omitempty" xml:"receive_info,omitempty" require:"true"`
	// 开票信息
	InvoiceInfo *NotaryInvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty"`
}

func (s NotaryReceiveInfo) String() string {
	return tea.Prettify(s)
}

func (s NotaryReceiveInfo) GoString() string {
	return s.String()
}

func (s *NotaryReceiveInfo) SetOrderType(v string) *NotaryReceiveInfo {
	s.OrderType = &v
	return s
}

func (s *NotaryReceiveInfo) SetReceiveInfo(v *ReceiveInfo) *NotaryReceiveInfo {
	s.ReceiveInfo = v
	return s
}

func (s *NotaryReceiveInfo) SetInvoiceInfo(v *NotaryInvoiceInfo) *NotaryReceiveInfo {
	s.InvoiceInfo = v
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

// 物流信息
type ExpressInfo struct {
	// 材料类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 收件人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 收件人电话号码
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 快递名称
	ExpressName *string `json:"express_name,omitempty" xml:"express_name,omitempty" require:"true"`
	// 快递单号
	TrackingNumber *string `json:"tracking_number,omitempty" xml:"tracking_number,omitempty" require:"true"`
	// 材料发出时间戳
	SendTime *int64 `json:"send_time,omitempty" xml:"send_time,omitempty" require:"true"`
}

func (s ExpressInfo) String() string {
	return tea.Prettify(s)
}

func (s ExpressInfo) GoString() string {
	return s.String()
}

func (s *ExpressInfo) SetType(v string) *ExpressInfo {
	s.Type = &v
	return s
}

func (s *ExpressInfo) SetName(v string) *ExpressInfo {
	s.Name = &v
	return s
}

func (s *ExpressInfo) SetPhone(v string) *ExpressInfo {
	s.Phone = &v
	return s
}

func (s *ExpressInfo) SetEmail(v string) *ExpressInfo {
	s.Email = &v
	return s
}

func (s *ExpressInfo) SetExpressName(v string) *ExpressInfo {
	s.ExpressName = &v
	return s
}

func (s *ExpressInfo) SetTrackingNumber(v string) *ExpressInfo {
	s.TrackingNumber = &v
	return s
}

func (s *ExpressInfo) SetSendTime(v int64) *ExpressInfo {
	s.SendTime = &v
	return s
}

// 播放列表实体类
type PlayListEntity struct {
	// 播放列表名称，可包含多个视频
	PlayListName *string `json:"play_list_name,omitempty" xml:"play_list_name,omitempty" require:"true"`
	// 表示授权类型，仅支持EXCLUSIVE，表示独家
	// 默认EXCLUSIVE
	AuthorizeType *string `json:"authorize_type,omitempty" xml:"authorize_type,omitempty"`
	// 授权类型范围，仅支持OVERSEA，表示全海外
	// 默认OVERSEA
	AuthorizeScopeType *string `json:"authorize_scope_type,omitempty" xml:"authorize_scope_type,omitempty"`
	// 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
	// 默认CONTAIN_PROTECT
	ProtectRightsType *string `json:"protect_rights_type,omitempty" xml:"protect_rights_type,omitempty"`
	// 维权类型范围，仅支持OVERSEA，表示全海外
	// 默认OVERSEA
	ProtectRightsScopeType *string `json:"protect_rights_scope_type,omitempty" xml:"protect_rights_scope_type,omitempty"`
	// 内容授权开始日期yyyy-MM-dd
	AuthorizationStartDate *string `json:"authorization_start_date,omitempty" xml:"authorization_start_date,omitempty" require:"true"`
	// 内容授权时长,单位：年，目前支持1~3年，
	// 注意结束时间即开始时间 + 授权时长 不能早于当前时间
	AuthorizationTimeLength *int64 `json:"authorization_time_length,omitempty" xml:"authorization_time_length,omitempty" require:"true"`
	// 内容授权平台列表：
	//        默认授权平台都会进行运营，当前仅支持YOUTUBE
	AuthPlatform []*string `json:"auth_platform,omitempty" xml:"auth_platform,omitempty" type:"Repeated"`
}

func (s PlayListEntity) String() string {
	return tea.Prettify(s)
}

func (s PlayListEntity) GoString() string {
	return s.String()
}

func (s *PlayListEntity) SetPlayListName(v string) *PlayListEntity {
	s.PlayListName = &v
	return s
}

func (s *PlayListEntity) SetAuthorizeType(v string) *PlayListEntity {
	s.AuthorizeType = &v
	return s
}

func (s *PlayListEntity) SetAuthorizeScopeType(v string) *PlayListEntity {
	s.AuthorizeScopeType = &v
	return s
}

func (s *PlayListEntity) SetProtectRightsType(v string) *PlayListEntity {
	s.ProtectRightsType = &v
	return s
}

func (s *PlayListEntity) SetProtectRightsScopeType(v string) *PlayListEntity {
	s.ProtectRightsScopeType = &v
	return s
}

func (s *PlayListEntity) SetAuthorizationStartDate(v string) *PlayListEntity {
	s.AuthorizationStartDate = &v
	return s
}

func (s *PlayListEntity) SetAuthorizationTimeLength(v int64) *PlayListEntity {
	s.AuthorizationTimeLength = &v
	return s
}

func (s *PlayListEntity) SetAuthPlatform(v []*string) *PlayListEntity {
	s.AuthPlatform = v
	return s
}

// 录屏取证结果
type RecordScreenResult struct {
	// 取证类型(SCREEN_RECORDING：录屏取证)
	EvidenceType *string `json:"evidence_type,omitempty" xml:"evidence_type,omitempty" require:"true"`
	// 取证状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 证据编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
	// 存证编号
	CertificateNo *string `json:"certificate_no,omitempty" xml:"certificate_no,omitempty" require:"true"`
	// 上链时间
	CertificateTime *int64 `json:"certificate_time,omitempty" xml:"certificate_time,omitempty" require:"true"`
	// 证据hash
	EvidenceHash *string `json:"evidence_hash,omitempty" xml:"evidence_hash,omitempty" require:"true"`
	// 链上交易hash
	EvidenceTxHash *string `json:"evidence_tx_hash,omitempty" xml:"evidence_tx_hash,omitempty" require:"true"`
	// 证书文件下载地址
	CertificateFileUrl *string `json:"certificate_file_url,omitempty" xml:"certificate_file_url,omitempty"`
	// 录屏取证文件列表
	EvidenceFiles []*EvidenceFile `json:"evidence_files,omitempty" xml:"evidence_files,omitempty" type:"Repeated"`
	// 录屏开始时间
	EvidenceStartTime *int64 `json:"evidence_start_time,omitempty" xml:"evidence_start_time,omitempty" require:"true"`
	// 录屏结束时间
	EvidenceEndTime *int64 `json:"evidence_end_time,omitempty" xml:"evidence_end_time,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
	// 云桌面url
	OperateUrl *string `json:"operate_url,omitempty" xml:"operate_url,omitempty" require:"true"`
}

func (s RecordScreenResult) String() string {
	return tea.Prettify(s)
}

func (s RecordScreenResult) GoString() string {
	return s.String()
}

func (s *RecordScreenResult) SetEvidenceType(v string) *RecordScreenResult {
	s.EvidenceType = &v
	return s
}

func (s *RecordScreenResult) SetStatus(v string) *RecordScreenResult {
	s.Status = &v
	return s
}

func (s *RecordScreenResult) SetEvidenceId(v string) *RecordScreenResult {
	s.EvidenceId = &v
	return s
}

func (s *RecordScreenResult) SetCertificateNo(v string) *RecordScreenResult {
	s.CertificateNo = &v
	return s
}

func (s *RecordScreenResult) SetCertificateTime(v int64) *RecordScreenResult {
	s.CertificateTime = &v
	return s
}

func (s *RecordScreenResult) SetEvidenceHash(v string) *RecordScreenResult {
	s.EvidenceHash = &v
	return s
}

func (s *RecordScreenResult) SetEvidenceTxHash(v string) *RecordScreenResult {
	s.EvidenceTxHash = &v
	return s
}

func (s *RecordScreenResult) SetCertificateFileUrl(v string) *RecordScreenResult {
	s.CertificateFileUrl = &v
	return s
}

func (s *RecordScreenResult) SetEvidenceFiles(v []*EvidenceFile) *RecordScreenResult {
	s.EvidenceFiles = v
	return s
}

func (s *RecordScreenResult) SetEvidenceStartTime(v int64) *RecordScreenResult {
	s.EvidenceStartTime = &v
	return s
}

func (s *RecordScreenResult) SetEvidenceEndTime(v int64) *RecordScreenResult {
	s.EvidenceEndTime = &v
	return s
}

func (s *RecordScreenResult) SetErrorCode(v string) *RecordScreenResult {
	s.ErrorCode = &v
	return s
}

func (s *RecordScreenResult) SetErrorMessage(v string) *RecordScreenResult {
	s.ErrorMessage = &v
	return s
}

func (s *RecordScreenResult) SetOperateUrl(v string) *RecordScreenResult {
	s.OperateUrl = &v
	return s
}

// 作品信息
type WorksInfo struct {
	// 作品名称
	WorksName *string `json:"works_name,omitempty" xml:"works_name,omitempty" require:"true"`
	// 作品类型
	WorksType *string `json:"works_type,omitempty" xml:"works_type,omitempty"`
	// 作品类型英文标识
	WorksTypeEn *string `json:"works_type_en,omitempty" xml:"works_type_en,omitempty"`
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

func (s *WorksInfo) SetWorksTypeEn(v string) *WorksInfo {
	s.WorksTypeEn = &v
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
	// 个人主页链接
	PosterIdUrl *string `json:"poster_id_url,omitempty" xml:"poster_id_url,omitempty"`
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

func (s *MonitorResult) SetPosterIdUrl(v string) *MonitorResult {
	s.PosterIdUrl = &v
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
	// 证据包文件hash
	ZipFileHash *string `json:"zip_file_hash,omitempty" xml:"zip_file_hash,omitempty"`
	// 主要核心证据文件名称
	MainEvidenceName *string `json:"main_evidence_name,omitempty" xml:"main_evidence_name,omitempty"`
	// 取证申请单号
	EvidenceOrderNum *string `json:"evidence_order_num,omitempty" xml:"evidence_order_num,omitempty"`
	// 补正说明函下载地址
	CorrectionUrl *string `json:"correction_url,omitempty" xml:"correction_url,omitempty"`
	// 录屏取证准备时间
	GmtReady *int64 `json:"gmt_ready,omitempty" xml:"gmt_ready,omitempty"`
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

func (s *RecordScreenData) SetZipFileHash(v string) *RecordScreenData {
	s.ZipFileHash = &v
	return s
}

func (s *RecordScreenData) SetMainEvidenceName(v string) *RecordScreenData {
	s.MainEvidenceName = &v
	return s
}

func (s *RecordScreenData) SetEvidenceOrderNum(v string) *RecordScreenData {
	s.EvidenceOrderNum = &v
	return s
}

func (s *RecordScreenData) SetCorrectionUrl(v string) *RecordScreenData {
	s.CorrectionUrl = &v
	return s
}

func (s *RecordScreenData) SetGmtReady(v int64) *RecordScreenData {
	s.GmtReady = &v
	return s
}

// 取证三方系统信息
type EvidenceThirdPartyInfo struct {
	// 三方系统用户提交网址时间
	SubmitTime *string `json:"submit_time,omitempty" xml:"submit_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 三方系统地址
	SystemUrl *string `json:"system_url,omitempty" xml:"system_url,omitempty" require:"true"`
	// 三方系统账号
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 三方系统名称
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 用户取证时登录的时间
	LoginTime *string `json:"login_time,omitempty" xml:"login_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用户取证时登录的IP
	LoginIp *string `json:"login_ip,omitempty" xml:"login_ip,omitempty" require:"true"`
}

func (s EvidenceThirdPartyInfo) String() string {
	return tea.Prettify(s)
}

func (s EvidenceThirdPartyInfo) GoString() string {
	return s.String()
}

func (s *EvidenceThirdPartyInfo) SetSubmitTime(v string) *EvidenceThirdPartyInfo {
	s.SubmitTime = &v
	return s
}

func (s *EvidenceThirdPartyInfo) SetSystemUrl(v string) *EvidenceThirdPartyInfo {
	s.SystemUrl = &v
	return s
}

func (s *EvidenceThirdPartyInfo) SetAccount(v string) *EvidenceThirdPartyInfo {
	s.Account = &v
	return s
}

func (s *EvidenceThirdPartyInfo) SetSystemName(v string) *EvidenceThirdPartyInfo {
	s.SystemName = &v
	return s
}

func (s *EvidenceThirdPartyInfo) SetLoginTime(v string) *EvidenceThirdPartyInfo {
	s.LoginTime = &v
	return s
}

func (s *EvidenceThirdPartyInfo) SetLoginIp(v string) *EvidenceThirdPartyInfo {
	s.LoginIp = &v
	return s
}

// 推荐分类信息
type RecommendCategoryDetail struct {
	// 推荐分类类型
	RecommendWorkCategory *string `json:"recommend_work_category,omitempty" xml:"recommend_work_category,omitempty" require:"true"`
	// 作品类型相似度，保留2位小数
	CategorySimilarRatio *string `json:"category_similar_ratio,omitempty" xml:"category_similar_ratio,omitempty" require:"true"`
	// 作品类型风险等级
	CategoryRiskRank *string `json:"category_risk_rank,omitempty" xml:"category_risk_rank,omitempty"`
}

func (s RecommendCategoryDetail) String() string {
	return tea.Prettify(s)
}

func (s RecommendCategoryDetail) GoString() string {
	return s.String()
}

func (s *RecommendCategoryDetail) SetRecommendWorkCategory(v string) *RecommendCategoryDetail {
	s.RecommendWorkCategory = &v
	return s
}

func (s *RecommendCategoryDetail) SetCategorySimilarRatio(v string) *RecommendCategoryDetail {
	s.CategorySimilarRatio = &v
	return s
}

func (s *RecommendCategoryDetail) SetCategoryRiskRank(v string) *RecommendCategoryDetail {
	s.CategoryRiskRank = &v
	return s
}

// 地址详细信息
type DciUserAddressInfo struct {
	// 所在国家
	Country *string `json:"country,omitempty" xml:"country,omitempty"`
	// 所在省份
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
	// 所在城市
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 识别出的地区
	District *string `json:"district,omitempty" xml:"district,omitempty"`
	// 识别出的街道
	Town *string `json:"town,omitempty" xml:"town,omitempty"`
	// 识别出的路
	Road *string `json:"road,omitempty" xml:"road,omitempty"`
	// 识别出的路号牌
	RoadNo *string `json:"road_no,omitempty" xml:"road_no,omitempty"`
	// 地址详情
	AddressDetail *string `json:"address_detail,omitempty" xml:"address_detail,omitempty"`
}

func (s DciUserAddressInfo) String() string {
	return tea.Prettify(s)
}

func (s DciUserAddressInfo) GoString() string {
	return s.String()
}

func (s *DciUserAddressInfo) SetCountry(v string) *DciUserAddressInfo {
	s.Country = &v
	return s
}

func (s *DciUserAddressInfo) SetProvince(v string) *DciUserAddressInfo {
	s.Province = &v
	return s
}

func (s *DciUserAddressInfo) SetCity(v string) *DciUserAddressInfo {
	s.City = &v
	return s
}

func (s *DciUserAddressInfo) SetDistrict(v string) *DciUserAddressInfo {
	s.District = &v
	return s
}

func (s *DciUserAddressInfo) SetTown(v string) *DciUserAddressInfo {
	s.Town = &v
	return s
}

func (s *DciUserAddressInfo) SetRoad(v string) *DciUserAddressInfo {
	s.Road = &v
	return s
}

func (s *DciUserAddressInfo) SetRoadNo(v string) *DciUserAddressInfo {
	s.RoadNo = &v
	return s
}

func (s *DciUserAddressInfo) SetAddressDetail(v string) *DciUserAddressInfo {
	s.AddressDetail = &v
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
	// 证据包文件hash
	ZipFileHash *string `json:"zip_file_hash,omitempty" xml:"zip_file_hash,omitempty"`
	// 核心证据文件名称
	MainEvidenceName *string `json:"main_evidence_name,omitempty" xml:"main_evidence_name,omitempty"`
	// 取证申请单号
	EvidenceOrderNum *string `json:"evidence_order_num,omitempty" xml:"evidence_order_num,omitempty"`
	// 取证开始时间
	GmtEvidenceStart *int64 `json:"gmt_evidence_start,omitempty" xml:"gmt_evidence_start,omitempty"`
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

func (s *ScreenshotData) SetZipFileHash(v string) *ScreenshotData {
	s.ZipFileHash = &v
	return s
}

func (s *ScreenshotData) SetMainEvidenceName(v string) *ScreenshotData {
	s.MainEvidenceName = &v
	return s
}

func (s *ScreenshotData) SetEvidenceOrderNum(v string) *ScreenshotData {
	s.EvidenceOrderNum = &v
	return s
}

func (s *ScreenshotData) SetGmtEvidenceStart(v int64) *ScreenshotData {
	s.GmtEvidenceStart = &v
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

// 企业法人信息
type EnterpriseLegalPersonInfo struct {
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件类型
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 法人证件号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s EnterpriseLegalPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseLegalPersonInfo) GoString() string {
	return s.String()
}

func (s *EnterpriseLegalPersonInfo) SetLegalPersonCertName(v string) *EnterpriseLegalPersonInfo {
	s.LegalPersonCertName = &v
	return s
}

func (s *EnterpriseLegalPersonInfo) SetLegalPersonCertType(v string) *EnterpriseLegalPersonInfo {
	s.LegalPersonCertType = &v
	return s
}

func (s *EnterpriseLegalPersonInfo) SetLegalPersonCertNo(v string) *EnterpriseLegalPersonInfo {
	s.LegalPersonCertNo = &v
	return s
}

// 网页截图结果
type ScreenshotResult struct {
	// 截图文件下载链接
	ScreenshotFileUrl *string `json:"screenshot_file_url,omitempty" xml:"screenshot_file_url,omitempty" require:"true"`
	// 网页截取编号
	ScreenshotId *string `json:"screenshot_id,omitempty" xml:"screenshot_id,omitempty" require:"true"`
	// 取证类型(SCREENSHOT: 网页截图)
	ScreenshotType *string `json:"screenshot_type,omitempty" xml:"screenshot_type,omitempty" require:"true"`
	// 取证状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 网页截取名称
	ScreenshotName *string `json:"screenshot_name,omitempty" xml:"screenshot_name,omitempty" require:"true"`
}

func (s ScreenshotResult) String() string {
	return tea.Prettify(s)
}

func (s ScreenshotResult) GoString() string {
	return s.String()
}

func (s *ScreenshotResult) SetScreenshotFileUrl(v string) *ScreenshotResult {
	s.ScreenshotFileUrl = &v
	return s
}

func (s *ScreenshotResult) SetScreenshotId(v string) *ScreenshotResult {
	s.ScreenshotId = &v
	return s
}

func (s *ScreenshotResult) SetScreenshotType(v string) *ScreenshotResult {
	s.ScreenshotType = &v
	return s
}

func (s *ScreenshotResult) SetStatus(v string) *ScreenshotResult {
	s.Status = &v
	return s
}

func (s *ScreenshotResult) SetErrorCode(v string) *ScreenshotResult {
	s.ErrorCode = &v
	return s
}

func (s *ScreenshotResult) SetErrorMessage(v string) *ScreenshotResult {
	s.ErrorMessage = &v
	return s
}

func (s *ScreenshotResult) SetScreenshotName(v string) *ScreenshotResult {
	s.ScreenshotName = &v
	return s
}

// 取证结果
type EvidenceResult struct {
	// 取证编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
	// 取证类型（LIVE：直播，VOD：点播）
	EvidenceType *string `json:"evidence_type,omitempty" xml:"evidence_type,omitempty" require:"true"`
	// 公证处code
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty" require:"true"`
	// 取证站点url信息
	EvidenceUrl *EvidenceWebUrlInfo `json:"evidence_url,omitempty" xml:"evidence_url,omitempty" require:"true"`
	// 取证结果文件下载url（有效期3天）
	EvidenceResultUrl *string `json:"evidence_result_url,omitempty" xml:"evidence_result_url,omitempty" require:"true"`
	// 存证证明信息
	CertificateInfo *EvidenceCertificateInfo `json:"certificate_info,omitempty" xml:"certificate_info,omitempty" require:"true"`
	// 取证开始时间戳
	EvidenceStartTime *int64 `json:"evidence_start_time,omitempty" xml:"evidence_start_time,omitempty" require:"true"`
	// 取证状态(SUCCESS:成功, FAIL:取证失败)
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 处理结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 处理结果信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s EvidenceResult) String() string {
	return tea.Prettify(s)
}

func (s EvidenceResult) GoString() string {
	return s.String()
}

func (s *EvidenceResult) SetEvidenceId(v string) *EvidenceResult {
	s.EvidenceId = &v
	return s
}

func (s *EvidenceResult) SetEvidenceType(v string) *EvidenceResult {
	s.EvidenceType = &v
	return s
}

func (s *EvidenceResult) SetNotaryOffice(v string) *EvidenceResult {
	s.NotaryOffice = &v
	return s
}

func (s *EvidenceResult) SetEvidenceUrl(v *EvidenceWebUrlInfo) *EvidenceResult {
	s.EvidenceUrl = v
	return s
}

func (s *EvidenceResult) SetEvidenceResultUrl(v string) *EvidenceResult {
	s.EvidenceResultUrl = &v
	return s
}

func (s *EvidenceResult) SetCertificateInfo(v *EvidenceCertificateInfo) *EvidenceResult {
	s.CertificateInfo = v
	return s
}

func (s *EvidenceResult) SetEvidenceStartTime(v int64) *EvidenceResult {
	s.EvidenceStartTime = &v
	return s
}

func (s *EvidenceResult) SetStatus(v string) *EvidenceResult {
	s.Status = &v
	return s
}

func (s *EvidenceResult) SetCode(v string) *EvidenceResult {
	s.Code = &v
	return s
}

func (s *EvidenceResult) SetMessage(v string) *EvidenceResult {
	s.Message = &v
	return s
}

// 数登上传文件结构体
type AdditionalFileInfo struct {
	// 内容梗概文件fileId
	ContentSummaryFileId *string `json:"content_summary_file_id,omitempty" xml:"content_summary_file_id,omitempty"`
	// 权利归属证明文件
	OwnershipFileIds []*string `json:"ownership_file_ids,omitempty" xml:"ownership_file_ids,omitempty" type:"Repeated"`
	// 肖像权授权文件fileId
	PortraitAuthFileId *string `json:"portrait_auth_file_id,omitempty" xml:"portrait_auth_file_id,omitempty"`
	// 他人作品授权文件fileId
	OthersWorkAuthFileId *string `json:"others_work_auth_file_id,omitempty" xml:"others_work_auth_file_id,omitempty"`
	// 其他文件fileId列表
	OtherFileIdList []*string `json:"other_file_id_list,omitempty" xml:"other_file_id_list,omitempty" type:"Repeated"`
	// 商用授权字体授权文件fileId
	FontAuthorizeFileId *string `json:"font_authorize_file_id,omitempty" xml:"font_authorize_file_id,omitempty"`
}

func (s AdditionalFileInfo) String() string {
	return tea.Prettify(s)
}

func (s AdditionalFileInfo) GoString() string {
	return s.String()
}

func (s *AdditionalFileInfo) SetContentSummaryFileId(v string) *AdditionalFileInfo {
	s.ContentSummaryFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOwnershipFileIds(v []*string) *AdditionalFileInfo {
	s.OwnershipFileIds = v
	return s
}

func (s *AdditionalFileInfo) SetPortraitAuthFileId(v string) *AdditionalFileInfo {
	s.PortraitAuthFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOthersWorkAuthFileId(v string) *AdditionalFileInfo {
	s.OthersWorkAuthFileId = &v
	return s
}

func (s *AdditionalFileInfo) SetOtherFileIdList(v []*string) *AdditionalFileInfo {
	s.OtherFileIdList = v
	return s
}

func (s *AdditionalFileInfo) SetFontAuthorizeFileId(v string) *AdditionalFileInfo {
	s.FontAuthorizeFileId = &v
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

// 联系人信息
type ContactInfo struct {
	// 联系人
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系电话
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty" require:"true"`
}

func (s ContactInfo) String() string {
	return tea.Prettify(s)
}

func (s ContactInfo) GoString() string {
	return s.String()
}

func (s *ContactInfo) SetContactName(v string) *ContactInfo {
	s.ContactName = &v
	return s
}

func (s *ContactInfo) SetContactPhone(v string) *ContactInfo {
	s.ContactPhone = &v
	return s
}

// 证书信息
type CertificateData struct {
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 版权用户UID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// DCI码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty" require:"true"`
	// 证书下载的链接地址
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty" require:"true"`
}

func (s CertificateData) String() string {
	return tea.Prettify(s)
}

func (s CertificateData) GoString() string {
	return s.String()
}

func (s *CertificateData) SetTaskId(v string) *CertificateData {
	s.TaskId = &v
	return s
}

func (s *CertificateData) SetUserId(v string) *CertificateData {
	s.UserId = &v
	return s
}

func (s *CertificateData) SetDciCode(v string) *CertificateData {
	s.DciCode = &v
	return s
}

func (s *CertificateData) SetCertificateUrl(v string) *CertificateData {
	s.CertificateUrl = &v
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

// 公证出证申请信息
type NotaryApplyInfo struct {
	// 公证处ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 取证人和取证信息列表
	EvidInfos []*EvidInfo `json:"evid_infos,omitempty" xml:"evid_infos,omitempty" require:"true" type:"Repeated"`
	// 申办事由
	BidReason *BidReason `json:"bid_reason,omitempty" xml:"bid_reason,omitempty" require:"true"`
	// 申请人信息
	ApplicantInfos []*NotaryUser `json:"applicant_infos,omitempty" xml:"applicant_infos,omitempty" require:"true" type:"Repeated"`
	// 经办人信息
	OperatorInfo *NotaryUser `json:"operator_info,omitempty" xml:"operator_info,omitempty" require:"true"`
	// 授权书
	WarrantFileList []*string `json:"warrant_file_list,omitempty" xml:"warrant_file_list,omitempty" require:"true" type:"Repeated"`
	// 权利证明材料
	TestifyFileList []*string `json:"testify_file_list,omitempty" xml:"testify_file_list,omitempty" require:"true" type:"Repeated"`
	// 保全内容
	PreservationContent *string `json:"preservation_content,omitempty" xml:"preservation_content,omitempty" require:"true"`
	// 用户申办备注
	Comments *string `json:"comments,omitempty" xml:"comments,omitempty"`
}

func (s NotaryApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s NotaryApplyInfo) GoString() string {
	return s.String()
}

func (s *NotaryApplyInfo) SetOrgId(v string) *NotaryApplyInfo {
	s.OrgId = &v
	return s
}

func (s *NotaryApplyInfo) SetEvidInfos(v []*EvidInfo) *NotaryApplyInfo {
	s.EvidInfos = v
	return s
}

func (s *NotaryApplyInfo) SetBidReason(v *BidReason) *NotaryApplyInfo {
	s.BidReason = v
	return s
}

func (s *NotaryApplyInfo) SetApplicantInfos(v []*NotaryUser) *NotaryApplyInfo {
	s.ApplicantInfos = v
	return s
}

func (s *NotaryApplyInfo) SetOperatorInfo(v *NotaryUser) *NotaryApplyInfo {
	s.OperatorInfo = v
	return s
}

func (s *NotaryApplyInfo) SetWarrantFileList(v []*string) *NotaryApplyInfo {
	s.WarrantFileList = v
	return s
}

func (s *NotaryApplyInfo) SetTestifyFileList(v []*string) *NotaryApplyInfo {
	s.TestifyFileList = v
	return s
}

func (s *NotaryApplyInfo) SetPreservationContent(v string) *NotaryApplyInfo {
	s.PreservationContent = &v
	return s
}

func (s *NotaryApplyInfo) SetComments(v string) *NotaryApplyInfo {
	s.Comments = &v
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

// 公证出证需要用户签署的文件
type SignDocument struct {
	// 签署文件
	SignFile *string `json:"sign_file,omitempty" xml:"sign_file,omitempty" require:"true"`
	// 到期时间戳
	ExpireTime *int64 `json:"expire_time,omitempty" xml:"expire_time,omitempty" require:"true"`
	// 签署文件名
	SignFileName *string `json:"sign_file_name,omitempty" xml:"sign_file_name,omitempty" require:"true"`
	// 签署文件描述
	SignFileDesc *string `json:"sign_file_desc,omitempty" xml:"sign_file_desc,omitempty" require:"true"`
	// 签署文件哈希
	SignFileHash *string `json:"sign_file_hash,omitempty" xml:"sign_file_hash,omitempty" require:"true"`
	// 签署文件类型
	SignFileType *string `json:"sign_file_type,omitempty" xml:"sign_file_type,omitempty" require:"true"`
}

func (s SignDocument) String() string {
	return tea.Prettify(s)
}

func (s SignDocument) GoString() string {
	return s.String()
}

func (s *SignDocument) SetSignFile(v string) *SignDocument {
	s.SignFile = &v
	return s
}

func (s *SignDocument) SetExpireTime(v int64) *SignDocument {
	s.ExpireTime = &v
	return s
}

func (s *SignDocument) SetSignFileName(v string) *SignDocument {
	s.SignFileName = &v
	return s
}

func (s *SignDocument) SetSignFileDesc(v string) *SignDocument {
	s.SignFileDesc = &v
	return s
}

func (s *SignDocument) SetSignFileHash(v string) *SignDocument {
	s.SignFileHash = &v
	return s
}

func (s *SignDocument) SetSignFileType(v string) *SignDocument {
	s.SignFileType = &v
	return s
}

// 在售商品的信息
type SaleData struct {
	// 摘要数据
	SaleDigiestData *SaleDigestData `json:"sale_digiest_data,omitempty" xml:"sale_digiest_data,omitempty" require:"true"`
}

func (s SaleData) String() string {
	return tea.Prettify(s)
}

func (s SaleData) GoString() string {
	return s.String()
}

func (s *SaleData) SetSaleDigiestData(v *SaleDigestData) *SaleData {
	s.SaleDigiestData = v
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

// 审查数据
type ReviewData struct {
	// 作品名称安全识别结果
	TitleRiskData []*ContentRiskData `json:"title_risk_data,omitempty" xml:"title_risk_data,omitempty" type:"Repeated"`
	// 内容安全识别结果
	ContentRiskData []*ContentRiskData `json:"content_risk_data,omitempty" xml:"content_risk_data,omitempty" type:"Repeated"`
	// 作品相似识别结果
	ResembleRiskData []*ResembleRiskData `json:"resemble_risk_data,omitempty" xml:"resemble_risk_data,omitempty" type:"Repeated"`
	// 作品标签识别结果
	LabelRiskData []*LabelRiskData `json:"label_risk_data,omitempty" xml:"label_risk_data,omitempty" type:"Repeated"`
}

func (s ReviewData) String() string {
	return tea.Prettify(s)
}

func (s ReviewData) GoString() string {
	return s.String()
}

func (s *ReviewData) SetTitleRiskData(v []*ContentRiskData) *ReviewData {
	s.TitleRiskData = v
	return s
}

func (s *ReviewData) SetContentRiskData(v []*ContentRiskData) *ReviewData {
	s.ContentRiskData = v
	return s
}

func (s *ReviewData) SetResembleRiskData(v []*ResembleRiskData) *ReviewData {
	s.ResembleRiskData = v
	return s
}

func (s *ReviewData) SetLabelRiskData(v []*LabelRiskData) *ReviewData {
	s.LabelRiskData = v
	return s
}

// 出证的公证书信息
type NotaryInfo struct {
	// 公证书编号
	NotarialDeedNo *string `json:"notarial_deed_no,omitempty" xml:"notarial_deed_no,omitempty" require:"true"`
	// 电子公证书文件路径
	NotaryPaperPath *string `json:"notary_paper_path,omitempty" xml:"notary_paper_path,omitempty" require:"true"`
	// 公证书出证日期（yyyy-MM-dd）
	NotaryTime *string `json:"notary_time,omitempty" xml:"notary_time,omitempty" require:"true"`
}

func (s NotaryInfo) String() string {
	return tea.Prettify(s)
}

func (s NotaryInfo) GoString() string {
	return s.String()
}

func (s *NotaryInfo) SetNotarialDeedNo(v string) *NotaryInfo {
	s.NotarialDeedNo = &v
	return s
}

func (s *NotaryInfo) SetNotaryPaperPath(v string) *NotaryInfo {
	s.NotaryPaperPath = &v
	return s
}

func (s *NotaryInfo) SetNotaryTime(v string) *NotaryInfo {
	s.NotaryTime = &v
	return s
}

// 数登申请声明：包括创作目的、创作过程、独创性和字体申明
type DciExplanationInfo struct {
	// 创作目的，描述作品创作的目的
	CreationPurpose *string `json:"creation_purpose,omitempty" xml:"creation_purpose,omitempty" require:"true"`
	// 创作过程，具体的创作过程
	CreationProcess *string `json:"creation_process,omitempty" xml:"creation_process,omitempty" require:"true"`
	// 阐述作品的独创性
	Originality *string `json:"originality,omitempty" xml:"originality,omitempty" require:"true"`
	// 创作过程涉及到字体使用相关版权说明
	FontCopyright *string `json:"font_copyright,omitempty" xml:"font_copyright,omitempty"`
	// 创作过程涉及到字体使用相关版权说明
	//
	FontTypes []*string `json:"font_types,omitempty" xml:"font_types,omitempty" type:"Repeated"`
}

func (s DciExplanationInfo) String() string {
	return tea.Prettify(s)
}

func (s DciExplanationInfo) GoString() string {
	return s.String()
}

func (s *DciExplanationInfo) SetCreationPurpose(v string) *DciExplanationInfo {
	s.CreationPurpose = &v
	return s
}

func (s *DciExplanationInfo) SetCreationProcess(v string) *DciExplanationInfo {
	s.CreationProcess = &v
	return s
}

func (s *DciExplanationInfo) SetOriginality(v string) *DciExplanationInfo {
	s.Originality = &v
	return s
}

func (s *DciExplanationInfo) SetFontCopyright(v string) *DciExplanationInfo {
	s.FontCopyright = &v
	return s
}

func (s *DciExplanationInfo) SetFontTypes(v []*string) *DciExplanationInfo {
	s.FontTypes = v
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

// 线下取证水印结果
type OfflineEvidenceWatermarkResult struct {
	// 取证编号
	EvidenceNo *string `json:"evidence_no,omitempty" xml:"evidence_no,omitempty" require:"true"`
	// 水印链接
	WatermarkUrl *string `json:"watermark_url,omitempty" xml:"watermark_url,omitempty"`
	// 封面链接
	CoverUrl *string `json:"cover_url,omitempty" xml:"cover_url,omitempty"`
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
}

func (s OfflineEvidenceWatermarkResult) String() string {
	return tea.Prettify(s)
}

func (s OfflineEvidenceWatermarkResult) GoString() string {
	return s.String()
}

func (s *OfflineEvidenceWatermarkResult) SetEvidenceNo(v string) *OfflineEvidenceWatermarkResult {
	s.EvidenceNo = &v
	return s
}

func (s *OfflineEvidenceWatermarkResult) SetWatermarkUrl(v string) *OfflineEvidenceWatermarkResult {
	s.WatermarkUrl = &v
	return s
}

func (s *OfflineEvidenceWatermarkResult) SetCoverUrl(v string) *OfflineEvidenceWatermarkResult {
	s.CoverUrl = &v
	return s
}

func (s *OfflineEvidenceWatermarkResult) SetFailReason(v string) *OfflineEvidenceWatermarkResult {
	s.FailReason = &v
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
	// 渠道标签
	ChannelTerminal *string `json:"channel_terminal,omitempty" xml:"channel_terminal,omitempty"`
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

func (s *AddRegisterRequest) SetChannelTerminal(v string) *AddRegisterRequest {
	s.ChannelTerminal = &v
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
	// 补正函下载链接
	CorrectionUrl *string `json:"correction_url,omitempty" xml:"correction_url,omitempty"`
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

func (s *QueryRegisterstatusResponse) SetCorrectionUrl(v string) *QueryRegisterstatusResponse {
	s.CorrectionUrl = &v
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
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 作品类型相似度
	CategorySimilarRatio *string `json:"category_similar_ratio,omitempty" xml:"category_similar_ratio,omitempty"`
	// 作品类型风险等级
	CategoryRiskRank *string `json:"category_risk_rank,omitempty" xml:"category_risk_rank,omitempty"`
	// 著作权人用户id List
	CopyrightOwnerIds []*string `json:"copyright_owner_ids,omitempty" xml:"copyright_owner_ids,omitempty" require:"true" type:"Repeated"`
	// DCI类型
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
	// 渠道标签
	ChannelTerminal *string `json:"channel_terminal,omitempty" xml:"channel_terminal,omitempty"`
	// 推荐分类明细信息
	RecommendCategoryList []*RecommendCategoryDetail `json:"recommend_category_list,omitempty" xml:"recommend_category_list,omitempty" type:"Repeated"`
	// 证书样式ID
	CustomizeCertId *string `json:"customize_cert_id,omitempty" xml:"customize_cert_id,omitempty"`
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

func (s *CreateDciPreregistrationRequest) SetCategorySimilarRatio(v string) *CreateDciPreregistrationRequest {
	s.CategorySimilarRatio = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetCategoryRiskRank(v string) *CreateDciPreregistrationRequest {
	s.CategoryRiskRank = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetCopyrightOwnerIds(v []*string) *CreateDciPreregistrationRequest {
	s.CopyrightOwnerIds = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetApplyType(v string) *CreateDciPreregistrationRequest {
	s.ApplyType = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetChannelTerminal(v string) *CreateDciPreregistrationRequest {
	s.ChannelTerminal = &v
	return s
}

func (s *CreateDciPreregistrationRequest) SetRecommendCategoryList(v []*RecommendCategoryDetail) *CreateDciPreregistrationRequest {
	s.RecommendCategoryList = v
	return s
}

func (s *CreateDciPreregistrationRequest) SetCustomizeCertId(v string) *CreateDciPreregistrationRequest {
	s.CustomizeCertId = &v
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
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
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

func (s *CreateDciPreregistrationResponse) SetErrorMsg(v string) *CreateDciPreregistrationResponse {
	s.ErrorMsg = &v
	return s
}

type QueryDciPreregistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci用户id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
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
	// 预登记证书下载链接
	PreRegCertUrl *string `json:"pre_reg_cert_url,omitempty" xml:"pre_reg_cert_url,omitempty"`
	// 预览图oss fileId
	PngFileId *string `json:"png_file_id,omitempty" xml:"png_file_id,omitempty"`
	// 申请发码时间
	ApplyObtainDate *string `json:"apply_obtain_date,omitempty" xml:"apply_obtain_date,omitempty"`
	// DCI码创建时间
	DciCodeObtainDate *string `json:"dci_code_obtain_date,omitempty" xml:"dci_code_obtain_date,omitempty"`
	// 错误原因
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 错误中文原因
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
	// 公式地址
	PublicationUrl *string `json:"publication_url,omitempty" xml:"publication_url,omitempty"`
	// DCI类型
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty"`
	// 系列图错误原因集合
	SeriesDiagramErrorReasonList []*SeriesDiagramErrorReason `json:"series_diagram_error_reason_list,omitempty" xml:"series_diagram_error_reason_list,omitempty" type:"Repeated"`
	// 作品是否包含图片信息
	ContainsImageInfo *ContainsImageInfo `json:"contains_image_info,omitempty" xml:"contains_image_info,omitempty"`
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

func (s *QueryDciPreregistrationResponse) SetPreRegCertUrl(v string) *QueryDciPreregistrationResponse {
	s.PreRegCertUrl = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPngFileId(v string) *QueryDciPreregistrationResponse {
	s.PngFileId = &v
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

func (s *QueryDciPreregistrationResponse) SetErrorReasonCn(v string) *QueryDciPreregistrationResponse {
	s.ErrorReasonCn = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetPublicationUrl(v string) *QueryDciPreregistrationResponse {
	s.PublicationUrl = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetApplyType(v string) *QueryDciPreregistrationResponse {
	s.ApplyType = &v
	return s
}

func (s *QueryDciPreregistrationResponse) SetSeriesDiagramErrorReasonList(v []*SeriesDiagramErrorReason) *QueryDciPreregistrationResponse {
	s.SeriesDiagramErrorReasonList = v
	return s
}

func (s *QueryDciPreregistrationResponse) SetContainsImageInfo(v *ContainsImageInfo) *QueryDciPreregistrationResponse {
	s.ContainsImageInfo = v
	return s
}

type AddDciUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty" require:"true"`
	// 证件正面OSS fileId
	CertificateFrontFileId *string `json:"certificate_front_file_id,omitempty" xml:"certificate_front_file_id,omitempty" require:"true"`
	// 证件反面OSS fileId
	CertificateBackFileId *string `json:"certificate_back_file_id,omitempty" xml:"certificate_back_file_id,omitempty"`
	// 法人名称
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件类型
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 法人证件号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 所属地区
	AreaType *string `json:"area_type,omitempty" xml:"area_type,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty"`
	// 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
	CopyrightCertificationType *string `json:"copyright_certification_type,omitempty" xml:"copyright_certification_type,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 用户名称废弃
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 证件有效期限起始日期
	CertificateStartTime *string `json:"certificate_start_time,omitempty" xml:"certificate_start_time,omitempty"`
	// 证件有效期限终止日期
	CertificateEndTime *string `json:"certificate_end_time,omitempty" xml:"certificate_end_time,omitempty"`
	// 证件正面OSS fileId废弃
	CertificateFrontFilePath *string `json:"certificate_front_file_path,omitempty" xml:"certificate_front_file_path,omitempty"`
	// 证件反面OSS filePath废弃
	CertificateBackFilePath *string `json:"certificate_back_file_path,omitempty" xml:"certificate_back_file_path,omitempty"`
	// 用户身份开始时间
	IdentityStartTime *string `json:"identity_start_time,omitempty" xml:"identity_start_time,omitempty"`
	// 用户类型废弃
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 证件是否长期有效
	LongTermValid *bool `json:"long_term_valid,omitempty" xml:"long_term_valid,omitempty"`
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

func (s *AddDciUserRequest) SetCertName(v string) *AddDciUserRequest {
	s.CertName = &v
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

func (s *AddDciUserRequest) SetCertificateFrontFileId(v string) *AddDciUserRequest {
	s.CertificateFrontFileId = &v
	return s
}

func (s *AddDciUserRequest) SetCertificateBackFileId(v string) *AddDciUserRequest {
	s.CertificateBackFileId = &v
	return s
}

func (s *AddDciUserRequest) SetLegalPersonCertName(v string) *AddDciUserRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *AddDciUserRequest) SetLegalPersonCertType(v string) *AddDciUserRequest {
	s.LegalPersonCertType = &v
	return s
}

func (s *AddDciUserRequest) SetLegalPersonCertNo(v string) *AddDciUserRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *AddDciUserRequest) SetPhone(v string) *AddDciUserRequest {
	s.Phone = &v
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

func (s *AddDciUserRequest) SetCopyrightCertificationType(v string) *AddDciUserRequest {
	s.CopyrightCertificationType = &v
	return s
}

func (s *AddDciUserRequest) SetClientToken(v string) *AddDciUserRequest {
	s.ClientToken = &v
	return s
}

func (s *AddDciUserRequest) SetUserName(v string) *AddDciUserRequest {
	s.UserName = &v
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

func (s *AddDciUserRequest) SetIdentityStartTime(v string) *AddDciUserRequest {
	s.IdentityStartTime = &v
	return s
}

func (s *AddDciUserRequest) SetUserType(v string) *AddDciUserRequest {
	s.UserType = &v
	return s
}

func (s *AddDciUserRequest) SetAddress(v string) *AddDciUserRequest {
	s.Address = &v
	return s
}

func (s *AddDciUserRequest) SetLongTermValid(v bool) *AddDciUserRequest {
	s.LongTermValid = &v
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
	// 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS：软件作品认证，如果不传默认为UGC
	CopyrightCertificationType *string `json:"copyright_certification_type,omitempty" xml:"copyright_certification_type,omitempty"`
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

func (s *QueryDciUserRequest) SetCopyrightCertificationType(v string) *QueryDciUserRequest {
	s.CopyrightCertificationType = &v
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
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty"`
	// 证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 证件有效期开始时间
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty"`
	// 证件有效期结束时间
	CertEndTime *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty"`
	// 法人名称
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 联系电话
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
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

func (s *QueryDciUserResponse) SetName(v string) *QueryDciUserResponse {
	s.Name = &v
	return s
}

func (s *QueryDciUserResponse) SetCertificateType(v string) *QueryDciUserResponse {
	s.CertificateType = &v
	return s
}

func (s *QueryDciUserResponse) SetCertificateNumber(v string) *QueryDciUserResponse {
	s.CertificateNumber = &v
	return s
}

func (s *QueryDciUserResponse) SetAddress(v string) *QueryDciUserResponse {
	s.Address = &v
	return s
}

func (s *QueryDciUserResponse) SetCertStartTime(v string) *QueryDciUserResponse {
	s.CertStartTime = &v
	return s
}

func (s *QueryDciUserResponse) SetCertEndTime(v string) *QueryDciUserResponse {
	s.CertEndTime = &v
	return s
}

func (s *QueryDciUserResponse) SetLegalPerson(v string) *QueryDciUserResponse {
	s.LegalPerson = &v
	return s
}

func (s *QueryDciUserResponse) SetPhone(v string) *QueryDciUserResponse {
	s.Phone = &v
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

type UpdateDciUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci用户ID
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty" require:"true"`
	// 证件正面oss fileId
	CertFrontFileId *string `json:"cert_front_file_id,omitempty" xml:"cert_front_file_id,omitempty" require:"true"`
	// 证件背面oss fileId
	CertBackFileId *string `json:"cert_back_file_id,omitempty" xml:"cert_back_file_id,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 客户端令牌
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
	CopyrightCertificationType *string `json:"copyright_certification_type,omitempty" xml:"copyright_certification_type,omitempty"`
	// 法人信息
	LegalPersonInfo *EnterpriseLegalPersonInfo `json:"legal_person_info,omitempty" xml:"legal_person_info,omitempty"`
	// true,false
	LongTermValid *bool `json:"long_term_valid,omitempty" xml:"long_term_valid,omitempty"`
	// 证件有效期开始时间
	CertificateStartTime *string `json:"certificate_start_time,omitempty" xml:"certificate_start_time,omitempty"`
	// 证件有效期终止时间
	CertificateEndTime *string `json:"certificate_end_time,omitempty" xml:"certificate_end_time,omitempty"`
	// 成立日期或出生日期
	IdentityStartTime *string `json:"identity_start_time,omitempty" xml:"identity_start_time,omitempty"`
	// 地址信息
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 著作权人名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 著作权人证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty"`
	// 著作权人证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty"`
}

func (s UpdateDciUserRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDciUserRequest) GoString() string {
	return s.String()
}

func (s *UpdateDciUserRequest) SetAuthToken(v string) *UpdateDciUserRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDciUserRequest) SetProductInstanceId(v string) *UpdateDciUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDciUserRequest) SetDciUserId(v string) *UpdateDciUserRequest {
	s.DciUserId = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertFrontFileId(v string) *UpdateDciUserRequest {
	s.CertFrontFileId = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertBackFileId(v string) *UpdateDciUserRequest {
	s.CertBackFileId = &v
	return s
}

func (s *UpdateDciUserRequest) SetPhone(v string) *UpdateDciUserRequest {
	s.Phone = &v
	return s
}

func (s *UpdateDciUserRequest) SetClientToken(v string) *UpdateDciUserRequest {
	s.ClientToken = &v
	return s
}

func (s *UpdateDciUserRequest) SetCopyrightCertificationType(v string) *UpdateDciUserRequest {
	s.CopyrightCertificationType = &v
	return s
}

func (s *UpdateDciUserRequest) SetLegalPersonInfo(v *EnterpriseLegalPersonInfo) *UpdateDciUserRequest {
	s.LegalPersonInfo = v
	return s
}

func (s *UpdateDciUserRequest) SetLongTermValid(v bool) *UpdateDciUserRequest {
	s.LongTermValid = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertificateStartTime(v string) *UpdateDciUserRequest {
	s.CertificateStartTime = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertificateEndTime(v string) *UpdateDciUserRequest {
	s.CertificateEndTime = &v
	return s
}

func (s *UpdateDciUserRequest) SetIdentityStartTime(v string) *UpdateDciUserRequest {
	s.IdentityStartTime = &v
	return s
}

func (s *UpdateDciUserRequest) SetAddress(v string) *UpdateDciUserRequest {
	s.Address = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertName(v string) *UpdateDciUserRequest {
	s.CertName = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertificateNumber(v string) *UpdateDciUserRequest {
	s.CertificateNumber = &v
	return s
}

func (s *UpdateDciUserRequest) SetCertificateType(v string) *UpdateDciUserRequest {
	s.CertificateType = &v
	return s
}

type UpdateDciUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDciUserResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDciUserResponse) GoString() string {
	return s.String()
}

func (s *UpdateDciUserResponse) SetReqMsgId(v string) *UpdateDciUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDciUserResponse) SetResultCode(v string) *UpdateDciUserResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDciUserResponse) SetResultMsg(v string) *UpdateDciUserResponse {
	s.ResultMsg = &v
	return s
}

type CreateDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// DC123456
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
	// 数登申请声明
	ExplanationInfo *DciExplanationInfo `json:"explanation_info,omitempty" xml:"explanation_info,omitempty" require:"true"`
	// 补充文件相关信息
	AdditionalFileInfo *AdditionalFileInfo `json:"additional_file_info,omitempty" xml:"additional_file_info,omitempty"`
	// 发票信息--当前支持普票
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	CreationStatement *string `json:"creation_statement,omitempty" xml:"creation_statement,omitempty"`
	// 废弃待删除
	AncillaryEvidencePathList []*string `json:"ancillary_evidence_path_list,omitempty" xml:"ancillary_evidence_path_list,omitempty" type:"Repeated"`
	// 申领人联系信息
	ApplyerContactInfo *ContactInfo `json:"applyer_contact_info,omitempty" xml:"applyer_contact_info,omitempty"`
	// 代理人联系信息
	PlatformContactInfo *ContactInfo `json:"platform_contact_info,omitempty" xml:"platform_contact_info,omitempty"`
	// 权利描述
	RightScopeDesc *string `json:"right_scope_desc,omitempty" xml:"right_scope_desc,omitempty"`
	// 是否切换支付方式
	SwitchPayMethod *bool `json:"switch_pay_method,omitempty" xml:"switch_pay_method,omitempty"`
}

func (s CreateDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CreateDciRegistrationRequest) SetAuthToken(v string) *CreateDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetProductInstanceId(v string) *CreateDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetDciContentId(v string) *CreateDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetExplanationInfo(v *DciExplanationInfo) *CreateDciRegistrationRequest {
	s.ExplanationInfo = v
	return s
}

func (s *CreateDciRegistrationRequest) SetAdditionalFileInfo(v *AdditionalFileInfo) *CreateDciRegistrationRequest {
	s.AdditionalFileInfo = v
	return s
}

func (s *CreateDciRegistrationRequest) SetInvoiceInfo(v *InvoiceInfo) *CreateDciRegistrationRequest {
	s.InvoiceInfo = v
	return s
}

func (s *CreateDciRegistrationRequest) SetClientToken(v string) *CreateDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetCreationStatement(v string) *CreateDciRegistrationRequest {
	s.CreationStatement = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetAncillaryEvidencePathList(v []*string) *CreateDciRegistrationRequest {
	s.AncillaryEvidencePathList = v
	return s
}

func (s *CreateDciRegistrationRequest) SetApplyerContactInfo(v *ContactInfo) *CreateDciRegistrationRequest {
	s.ApplyerContactInfo = v
	return s
}

func (s *CreateDciRegistrationRequest) SetPlatformContactInfo(v *ContactInfo) *CreateDciRegistrationRequest {
	s.PlatformContactInfo = v
	return s
}

func (s *CreateDciRegistrationRequest) SetRightScopeDesc(v string) *CreateDciRegistrationRequest {
	s.RightScopeDesc = &v
	return s
}

func (s *CreateDciRegistrationRequest) SetSwitchPayMethod(v bool) *CreateDciRegistrationRequest {
	s.SwitchPayMethod = &v
	return s
}

type CreateDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s CreateDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CreateDciRegistrationResponse) SetReqMsgId(v string) *CreateDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDciRegistrationResponse) SetResultCode(v string) *CreateDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDciRegistrationResponse) SetResultMsg(v string) *CreateDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDciRegistrationResponse) SetDigitalRegisterId(v string) *CreateDciRegistrationResponse {
	s.DigitalRegisterId = &v
	return s
}

func (s *CreateDciRegistrationResponse) SetErrorMsg(v string) *CreateDciRegistrationResponse {
	s.ErrorMsg = &v
	return s
}

type QueryDciRegistrationsubmitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci内容id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
}

func (s QueryDciRegistrationsubmitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationsubmitRequest) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationsubmitRequest) SetAuthToken(v string) *QueryDciRegistrationsubmitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciRegistrationsubmitRequest) SetProductInstanceId(v string) *QueryDciRegistrationsubmitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciRegistrationsubmitRequest) SetDciContentId(v string) *QueryDciRegistrationsubmitRequest {
	s.DciContentId = &v
	return s
}

type QueryDciRegistrationsubmitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数登提交状态
	ContentStatus *string `json:"content_status,omitempty" xml:"content_status,omitempty"`
}

func (s QueryDciRegistrationsubmitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationsubmitResponse) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationsubmitResponse) SetReqMsgId(v string) *QueryDciRegistrationsubmitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciRegistrationsubmitResponse) SetResultCode(v string) *QueryDciRegistrationsubmitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciRegistrationsubmitResponse) SetResultMsg(v string) *QueryDciRegistrationsubmitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciRegistrationsubmitResponse) SetContentStatus(v string) *QueryDciRegistrationsubmitResponse {
	s.ContentStatus = &v
	return s
}

type QueryDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s QueryDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationRequest) SetAuthToken(v string) *QueryDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciRegistrationRequest) SetProductInstanceId(v string) *QueryDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciRegistrationRequest) SetDigitalRegisterId(v string) *QueryDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryDciRegistrationRequest) SetDciContentId(v string) *QueryDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

type QueryDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 废弃待删除
	ContentStatus *string `json:"content_status,omitempty" xml:"content_status,omitempty"`
	// 废弃待删除
	RegisterCertTxHash *string `json:"register_cert_tx_hash,omitempty" xml:"register_cert_tx_hash,omitempty"`
	// 废弃待删除
	RegisterCertBlockHeight *string `json:"register_cert_block_height,omitempty" xml:"register_cert_block_height,omitempty"`
	// 废弃待删除
	RegisterCertTsr *string `json:"register_cert_tsr,omitempty" xml:"register_cert_tsr,omitempty"`
	// 废弃待删除
	RegisterCertPngFileId *string `json:"register_cert_png_file_id,omitempty" xml:"register_cert_png_file_id,omitempty"`
	// 废弃待删除
	RegisterSampleFileId *string `json:"register_sample_file_id,omitempty" xml:"register_sample_file_id,omitempty"`
	// 废弃待删除
	RegisterSamplePngFileId *string `json:"register_sample_png_file_id,omitempty" xml:"register_sample_png_file_id,omitempty"`
	// 废弃待删除
	RegisterDownloadTimesLeft *int64 `json:"register_download_times_left,omitempty" xml:"register_download_times_left,omitempty"`
	// 废弃待删除
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 废弃待删除
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
	// 废弃待删除
	InvoiceFileIdList []*string `json:"invoice_file_id_list,omitempty" xml:"invoice_file_id_list,omitempty" type:"Repeated"`
	// 废弃待删除
	ApplyRegisterTime *string `json:"apply_register_time,omitempty" xml:"apply_register_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty"`
	// 数登id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 数登状态
	DigitalRegisterStatus *string `json:"digital_register_status,omitempty" xml:"digital_register_status,omitempty"`
	// 数登申请时间
	DigitalRegisterApplyTime *string `json:"digital_register_apply_time,omitempty" xml:"digital_register_apply_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登完成时间
	DigitalRegisterCompletionTime *string `json:"digital_register_completion_time,omitempty" xml:"digital_register_completion_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登证书预览图url
	DigitalRegisterCertPngUrl *string `json:"digital_register_cert_png_url,omitempty" xml:"digital_register_cert_png_url,omitempty"`
	// 样本证书预览图url
	DigitalRegisterSamplePngUrl *string `json:"digital_register_sample_png_url,omitempty" xml:"digital_register_sample_png_url,omitempty"`
	// 证书本月剩余下载次数
	DownloadTimesLeft *int64 `json:"download_times_left,omitempty" xml:"download_times_left,omitempty"`
	// 发票下载链接list
	InvoiceUrlList []*string `json:"invoice_url_list,omitempty" xml:"invoice_url_list,omitempty" type:"Repeated"`
	// 数登失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty"`
	// 补正类型
	AmendType *string `json:"amend_type,omitempty" xml:"amend_type,omitempty"`
	// 用户申请表url
	ApplyFormUrl *string `json:"apply_form_url,omitempty" xml:"apply_form_url,omitempty"`
	// 数登流水号
	FlowNumber *string `json:"flow_number,omitempty" xml:"flow_number,omitempty"`
}

func (s QueryDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationResponse) SetReqMsgId(v string) *QueryDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetResultCode(v string) *QueryDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetResultMsg(v string) *QueryDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetContentStatus(v string) *QueryDciRegistrationResponse {
	s.ContentStatus = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterCertTxHash(v string) *QueryDciRegistrationResponse {
	s.RegisterCertTxHash = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterCertBlockHeight(v string) *QueryDciRegistrationResponse {
	s.RegisterCertBlockHeight = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterCertTsr(v string) *QueryDciRegistrationResponse {
	s.RegisterCertTsr = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterCertPngFileId(v string) *QueryDciRegistrationResponse {
	s.RegisterCertPngFileId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterSampleFileId(v string) *QueryDciRegistrationResponse {
	s.RegisterSampleFileId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterSamplePngFileId(v string) *QueryDciRegistrationResponse {
	s.RegisterSamplePngFileId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegisterDownloadTimesLeft(v int64) *QueryDciRegistrationResponse {
	s.RegisterDownloadTimesLeft = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetErrorReason(v string) *QueryDciRegistrationResponse {
	s.ErrorReason = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetErrorReasonCn(v string) *QueryDciRegistrationResponse {
	s.ErrorReasonCn = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetInvoiceFileIdList(v []*string) *QueryDciRegistrationResponse {
	s.InvoiceFileIdList = v
	return s
}

func (s *QueryDciRegistrationResponse) SetApplyRegisterTime(v string) *QueryDciRegistrationResponse {
	s.ApplyRegisterTime = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetRegNumber(v string) *QueryDciRegistrationResponse {
	s.RegNumber = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterId(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDciContentId(v string) *QueryDciRegistrationResponse {
	s.DciContentId = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterStatus(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterStatus = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterApplyTime(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterApplyTime = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterCompletionTime(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterCompletionTime = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterCertPngUrl(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterCertPngUrl = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDigitalRegisterSamplePngUrl(v string) *QueryDciRegistrationResponse {
	s.DigitalRegisterSamplePngUrl = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetDownloadTimesLeft(v int64) *QueryDciRegistrationResponse {
	s.DownloadTimesLeft = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetInvoiceUrlList(v []*string) *QueryDciRegistrationResponse {
	s.InvoiceUrlList = v
	return s
}

func (s *QueryDciRegistrationResponse) SetFailDetail(v string) *QueryDciRegistrationResponse {
	s.FailDetail = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetAmendType(v string) *QueryDciRegistrationResponse {
	s.AmendType = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetApplyFormUrl(v string) *QueryDciRegistrationResponse {
	s.ApplyFormUrl = &v
	return s
}

func (s *QueryDciRegistrationResponse) SetFlowNumber(v string) *QueryDciRegistrationResponse {
	s.FlowNumber = &v
	return s
}

type GetDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s GetDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *GetDciRegistrationcertRequest) SetAuthToken(v string) *GetDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDciRegistrationcertRequest) SetProductInstanceId(v string) *GetDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDciRegistrationcertRequest) SetDigitalRegisterId(v string) *GetDciRegistrationcertRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *GetDciRegistrationcertRequest) SetClientToken(v string) *GetDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

func (s *GetDciRegistrationcertRequest) SetDciContentId(v string) *GetDciRegistrationcertRequest {
	s.DciContentId = &v
	return s
}

type GetDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 废弃待删除
	CertStatus *string `json:"cert_status,omitempty" xml:"cert_status,omitempty"`
	// 废弃待删除
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 废弃待删除
	ErrorReason *string `json:"error_reason,omitempty" xml:"error_reason,omitempty"`
	// 废弃待删除
	ErrorReasonCn *string `json:"error_reason_cn,omitempty" xml:"error_reason_cn,omitempty"`
	// 数登状态
	DigitalRegisterStatus *string `json:"digital_register_status,omitempty" xml:"digital_register_status,omitempty"`
	// 数登证书&样本证书压缩包url
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 剩余下载次数
	DownloadTimesLeft *int64 `json:"download_times_left,omitempty" xml:"download_times_left,omitempty"`
	// 失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty"`
	// 数登证书下载链接
	DigitalRegisterCertUrl *string `json:"digital_register_cert_url,omitempty" xml:"digital_register_cert_url,omitempty"`
	// 数登样本证书下载链接
	DigitalRegisterSampleUrl *string `json:"digital_register_sample_url,omitempty" xml:"digital_register_sample_url,omitempty"`
}

func (s GetDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *GetDciRegistrationcertResponse) SetReqMsgId(v string) *GetDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetResultCode(v string) *GetDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetResultMsg(v string) *GetDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetCertStatus(v string) *GetDciRegistrationcertResponse {
	s.CertStatus = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetCertificateUrl(v string) *GetDciRegistrationcertResponse {
	s.CertificateUrl = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetErrorReason(v string) *GetDciRegistrationcertResponse {
	s.ErrorReason = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetErrorReasonCn(v string) *GetDciRegistrationcertResponse {
	s.ErrorReasonCn = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetDigitalRegisterStatus(v string) *GetDciRegistrationcertResponse {
	s.DigitalRegisterStatus = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetDownloadUrl(v string) *GetDciRegistrationcertResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetDownloadTimesLeft(v int64) *GetDciRegistrationcertResponse {
	s.DownloadTimesLeft = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetFailDetail(v string) *GetDciRegistrationcertResponse {
	s.FailDetail = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetDigitalRegisterCertUrl(v string) *GetDciRegistrationcertResponse {
	s.DigitalRegisterCertUrl = &v
	return s
}

func (s *GetDciRegistrationcertResponse) SetDigitalRegisterSampleUrl(v string) *GetDciRegistrationcertResponse {
	s.DigitalRegisterSampleUrl = &v
	return s
}

type QueryDciContentsecurityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID(数登流水号)
	FlowNumber *string `json:"flow_number,omitempty" xml:"flow_number,omitempty" require:"true"`
	// 客户端令牌
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
	// 任务Id, 已废弃
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 作品名，已废弃
	WorkName *string `json:"work_name,omitempty" xml:"work_name,omitempty"`
	// 作品Hash，已废弃
	WorkHash *string `json:"work_hash,omitempty" xml:"work_hash,omitempty"`
	// 作品分类，已废弃
	WorkCategory *string `json:"work_category,omitempty" xml:"work_category,omitempty"`
}

func (s QueryDciContentsecurityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciContentsecurityRequest) GoString() string {
	return s.String()
}

func (s *QueryDciContentsecurityRequest) SetAuthToken(v string) *QueryDciContentsecurityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetProductInstanceId(v string) *QueryDciContentsecurityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetFlowNumber(v string) *QueryDciContentsecurityRequest {
	s.FlowNumber = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetClientToken(v string) *QueryDciContentsecurityRequest {
	s.ClientToken = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetTaskId(v string) *QueryDciContentsecurityRequest {
	s.TaskId = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetWorkName(v string) *QueryDciContentsecurityRequest {
	s.WorkName = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetWorkHash(v string) *QueryDciContentsecurityRequest {
	s.WorkHash = &v
	return s
}

func (s *QueryDciContentsecurityRequest) SetWorkCategory(v string) *QueryDciContentsecurityRequest {
	s.WorkCategory = &v
	return s
}

type QueryDciContentsecurityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 作品类型
	WorkType *string `json:"work_type,omitempty" xml:"work_type,omitempty"`
	// 审查结果
	ReviewData *ReviewData `json:"review_data,omitempty" xml:"review_data,omitempty"`
}

func (s QueryDciContentsecurityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciContentsecurityResponse) GoString() string {
	return s.String()
}

func (s *QueryDciContentsecurityResponse) SetReqMsgId(v string) *QueryDciContentsecurityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciContentsecurityResponse) SetResultCode(v string) *QueryDciContentsecurityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciContentsecurityResponse) SetResultMsg(v string) *QueryDciContentsecurityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciContentsecurityResponse) SetWorkType(v string) *QueryDciContentsecurityResponse {
	s.WorkType = &v
	return s
}

func (s *QueryDciContentsecurityResponse) SetReviewData(v *ReviewData) *QueryDciContentsecurityResponse {
	s.ReviewData = v
	return s
}

type CreateDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 版权用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// DCI码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty" require:"true"`
	// 登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty" require:"true"`
	// 二维码
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty" require:"true"`
	// 客户端token
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s CreateDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *CreateDciRegistrationcertRequest) SetAuthToken(v string) *CreateDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetProductInstanceId(v string) *CreateDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetTaskId(v string) *CreateDciRegistrationcertRequest {
	s.TaskId = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetUserId(v string) *CreateDciRegistrationcertRequest {
	s.UserId = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetDciCode(v string) *CreateDciRegistrationcertRequest {
	s.DciCode = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetRegNumber(v string) *CreateDciRegistrationcertRequest {
	s.RegNumber = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetQrCodeUrl(v string) *CreateDciRegistrationcertRequest {
	s.QrCodeUrl = &v
	return s
}

func (s *CreateDciRegistrationcertRequest) SetClientToken(v string) *CreateDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

type CreateDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *CreateDciRegistrationcertResponse) SetReqMsgId(v string) *CreateDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDciRegistrationcertResponse) SetResultCode(v string) *CreateDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDciRegistrationcertResponse) SetResultMsg(v string) *CreateDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

type QueryDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationcertRequest) SetAuthToken(v string) *QueryDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciRegistrationcertRequest) SetProductInstanceId(v string) *QueryDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciRegistrationcertRequest) SetTaskId(v string) *QueryDciRegistrationcertRequest {
	s.TaskId = &v
	return s
}

type QueryDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书信息
	CertificateData *CertificateData `json:"certificate_data,omitempty" xml:"certificate_data,omitempty"`
}

func (s QueryDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *QueryDciRegistrationcertResponse) SetReqMsgId(v string) *QueryDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciRegistrationcertResponse) SetResultCode(v string) *QueryDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciRegistrationcertResponse) SetResultMsg(v string) *QueryDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciRegistrationcertResponse) SetCertificateData(v *CertificateData) *QueryDciRegistrationcertResponse {
	s.CertificateData = v
	return s
}

type GetDciPayurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 废弃待删除
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 废弃待删除
	PayMent *string `json:"pay_ment,omitempty" xml:"pay_ment,omitempty"`
	// 废弃待删除
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty"`
}

func (s GetDciPayurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDciPayurlRequest) GoString() string {
	return s.String()
}

func (s *GetDciPayurlRequest) SetAuthToken(v string) *GetDciPayurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDciPayurlRequest) SetProductInstanceId(v string) *GetDciPayurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDciPayurlRequest) SetDigitalRegisterId(v string) *GetDciPayurlRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *GetDciPayurlRequest) SetClientToken(v string) *GetDciPayurlRequest {
	s.ClientToken = &v
	return s
}

func (s *GetDciPayurlRequest) SetDciUserId(v string) *GetDciPayurlRequest {
	s.DciUserId = &v
	return s
}

func (s *GetDciPayurlRequest) SetDciContentId(v string) *GetDciPayurlRequest {
	s.DciContentId = &v
	return s
}

func (s *GetDciPayurlRequest) SetPayMent(v string) *GetDciPayurlRequest {
	s.PayMent = &v
	return s
}

func (s *GetDciPayurlRequest) SetInvoiceInfo(v *InvoiceInfo) *GetDciPayurlRequest {
	s.InvoiceInfo = v
	return s
}

type GetDciPayurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s GetDciPayurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDciPayurlResponse) GoString() string {
	return s.String()
}

func (s *GetDciPayurlResponse) SetReqMsgId(v string) *GetDciPayurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDciPayurlResponse) SetResultCode(v string) *GetDciPayurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDciPayurlResponse) SetResultMsg(v string) *GetDciPayurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDciPayurlResponse) SetPayUrl(v string) *GetDciPayurlResponse {
	s.PayUrl = &v
	return s
}

func (s *GetDciPayurlResponse) SetErrorMsg(v string) *GetDciPayurlResponse {
	s.ErrorMsg = &v
	return s
}

type QueryDciPayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 废弃待删除
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// 废弃待删除
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
}

func (s QueryDciPayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPayRequest) GoString() string {
	return s.String()
}

func (s *QueryDciPayRequest) SetAuthToken(v string) *QueryDciPayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciPayRequest) SetProductInstanceId(v string) *QueryDciPayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciPayRequest) SetDigitalRegisterId(v string) *QueryDciPayRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *QueryDciPayRequest) SetDciUserId(v string) *QueryDciPayRequest {
	s.DciUserId = &v
	return s
}

func (s *QueryDciPayRequest) SetDciContentId(v string) *QueryDciPayRequest {
	s.DciContentId = &v
	return s
}

type QueryDciPayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付状态
	// （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty"`
	// 废弃待删除
	PayState *string `json:"pay_state,omitempty" xml:"pay_state,omitempty"`
}

func (s QueryDciPayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPayResponse) GoString() string {
	return s.String()
}

func (s *QueryDciPayResponse) SetReqMsgId(v string) *QueryDciPayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciPayResponse) SetResultCode(v string) *QueryDciPayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciPayResponse) SetResultMsg(v string) *QueryDciPayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciPayResponse) SetPayStatus(v string) *QueryDciPayResponse {
	s.PayStatus = &v
	return s
}

func (s *QueryDciPayResponse) SetPayState(v string) *QueryDciPayResponse {
	s.PayState = &v
	return s
}

type CallbackDciPayresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 与中心约定的任务ID，同一个作品可能会发起多次登记
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 平台Id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 订单ID
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 支付方式 (ALIPAY,0,支付宝)
	PayMent *string `json:"pay_ment,omitempty" xml:"pay_ment,omitempty" require:"true"`
	// 订单金额
	Money *string `json:"money,omitempty" xml:"money,omitempty" require:"true"`
	// 结果描述，如：支付成功
	ResultContent *string `json:"result_content,omitempty" xml:"result_content,omitempty" require:"true"`
	// 状态，2001代表支付成功
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s CallbackDciPayresultRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackDciPayresultRequest) GoString() string {
	return s.String()
}

func (s *CallbackDciPayresultRequest) SetAuthToken(v string) *CallbackDciPayresultRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetProductInstanceId(v string) *CallbackDciPayresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetTaskId(v string) *CallbackDciPayresultRequest {
	s.TaskId = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetAppId(v string) *CallbackDciPayresultRequest {
	s.AppId = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetOrderId(v string) *CallbackDciPayresultRequest {
	s.OrderId = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetPayMent(v string) *CallbackDciPayresultRequest {
	s.PayMent = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetMoney(v string) *CallbackDciPayresultRequest {
	s.Money = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetResultContent(v string) *CallbackDciPayresultRequest {
	s.ResultContent = &v
	return s
}

func (s *CallbackDciPayresultRequest) SetCode(v string) *CallbackDciPayresultRequest {
	s.Code = &v
	return s
}

type CallbackDciPayresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackDciPayresultResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackDciPayresultResponse) GoString() string {
	return s.String()
}

func (s *CallbackDciPayresultResponse) SetReqMsgId(v string) *CallbackDciPayresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackDciPayresultResponse) SetResultCode(v string) *CallbackDciPayresultResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackDciPayresultResponse) SetResultMsg(v string) *CallbackDciPayresultResponse {
	s.ResultMsg = &v
	return s
}

type RefuseDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 复审失败原因
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 失败详情
	FailDetail *string `json:"fail_detail,omitempty" xml:"fail_detail,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s RefuseDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *RefuseDciRegistrationRequest) SetAuthToken(v string) *RefuseDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseDciRegistrationRequest) SetProductInstanceId(v string) *RefuseDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseDciRegistrationRequest) SetTaskId(v string) *RefuseDciRegistrationRequest {
	s.TaskId = &v
	return s
}

func (s *RefuseDciRegistrationRequest) SetCode(v string) *RefuseDciRegistrationRequest {
	s.Code = &v
	return s
}

func (s *RefuseDciRegistrationRequest) SetFailDetail(v string) *RefuseDciRegistrationRequest {
	s.FailDetail = &v
	return s
}

func (s *RefuseDciRegistrationRequest) SetClientToken(v string) *RefuseDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

type RefuseDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *RefuseDciRegistrationResponse) SetReqMsgId(v string) *RefuseDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseDciRegistrationResponse) SetResultCode(v string) *RefuseDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseDciRegistrationResponse) SetResultMsg(v string) *RefuseDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type QueryNotaryBidreasonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证处 ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
}

func (s QueryNotaryBidreasonRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryBidreasonRequest) GoString() string {
	return s.String()
}

func (s *QueryNotaryBidreasonRequest) SetAuthToken(v string) *QueryNotaryBidreasonRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNotaryBidreasonRequest) SetProductInstanceId(v string) *QueryNotaryBidreasonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNotaryBidreasonRequest) SetOrgId(v string) *QueryNotaryBidreasonRequest {
	s.OrgId = &v
	return s
}

type QueryNotaryBidreasonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申办事由列表
	BidReasonList []*BidReason `json:"bid_reason_list,omitempty" xml:"bid_reason_list,omitempty" type:"Repeated"`
}

func (s QueryNotaryBidreasonResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryBidreasonResponse) GoString() string {
	return s.String()
}

func (s *QueryNotaryBidreasonResponse) SetReqMsgId(v string) *QueryNotaryBidreasonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNotaryBidreasonResponse) SetResultCode(v string) *QueryNotaryBidreasonResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNotaryBidreasonResponse) SetResultMsg(v string) *QueryNotaryBidreasonResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNotaryBidreasonResponse) SetBidReasonList(v []*BidReason) *QueryNotaryBidreasonResponse {
	s.BidReasonList = v
	return s
}

type QueryNotaryDocumenttosignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申请人信息
	ApplicantList []*NotaryUser `json:"applicant_list,omitempty" xml:"applicant_list,omitempty" require:"true" type:"Repeated"`
	// 经办人信息
	Agent *NotaryUser `json:"agent,omitempty" xml:"agent,omitempty" require:"true"`
	// 送达信息
	ReceiveInfo *ReceiveInfo `json:"receive_info,omitempty" xml:"receive_info,omitempty" require:"true"`
	// 保全内容
	Preservation *string `json:"preservation,omitempty" xml:"preservation,omitempty" require:"true"`
	// 公证处id
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
}

func (s QueryNotaryDocumenttosignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryDocumenttosignRequest) GoString() string {
	return s.String()
}

func (s *QueryNotaryDocumenttosignRequest) SetAuthToken(v string) *QueryNotaryDocumenttosignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetProductInstanceId(v string) *QueryNotaryDocumenttosignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetApplicantList(v []*NotaryUser) *QueryNotaryDocumenttosignRequest {
	s.ApplicantList = v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetAgent(v *NotaryUser) *QueryNotaryDocumenttosignRequest {
	s.Agent = v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetReceiveInfo(v *ReceiveInfo) *QueryNotaryDocumenttosignRequest {
	s.ReceiveInfo = v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetPreservation(v string) *QueryNotaryDocumenttosignRequest {
	s.Preservation = &v
	return s
}

func (s *QueryNotaryDocumenttosignRequest) SetOrgId(v string) *QueryNotaryDocumenttosignRequest {
	s.OrgId = &v
	return s
}

type QueryNotaryDocumenttosignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 需要用户签署的文件列表
	SignDocumentList []*SignDocument `json:"sign_document_list,omitempty" xml:"sign_document_list,omitempty" type:"Repeated"`
	// 生成文件的时间，需要在提交申办接口传入
	PreviewTime *int64 `json:"preview_time,omitempty" xml:"preview_time,omitempty"`
}

func (s QueryNotaryDocumenttosignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryDocumenttosignResponse) GoString() string {
	return s.String()
}

func (s *QueryNotaryDocumenttosignResponse) SetReqMsgId(v string) *QueryNotaryDocumenttosignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNotaryDocumenttosignResponse) SetResultCode(v string) *QueryNotaryDocumenttosignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNotaryDocumenttosignResponse) SetResultMsg(v string) *QueryNotaryDocumenttosignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNotaryDocumenttosignResponse) SetSignDocumentList(v []*SignDocument) *QueryNotaryDocumenttosignResponse {
	s.SignDocumentList = v
	return s
}

func (s *QueryNotaryDocumenttosignResponse) SetPreviewTime(v int64) *QueryNotaryDocumenttosignResponse {
	s.PreviewTime = &v
	return s
}

type ApplyNotaryOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证出证申请信息
	NotaryApplyInfo *NotaryApplyInfo `json:"notary_apply_info,omitempty" xml:"notary_apply_info,omitempty" require:"true"`
	// 公证出证收件信息
	NotaryReceiveInfo *NotaryReceiveInfo `json:"notary_receive_info,omitempty" xml:"notary_receive_info,omitempty" require:"true"`
	// 用户预览签署文件的时间
	PreviewTime *int64 `json:"preview_time,omitempty" xml:"preview_time,omitempty" require:"true"`
	// 用户签署文件时间
	AgreeTime *int64 `json:"agree_time,omitempty" xml:"agree_time,omitempty" require:"true"`
	// 客户端令牌
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s ApplyNotaryOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyNotaryOrderRequest) GoString() string {
	return s.String()
}

func (s *ApplyNotaryOrderRequest) SetAuthToken(v string) *ApplyNotaryOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyNotaryOrderRequest) SetProductInstanceId(v string) *ApplyNotaryOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyNotaryOrderRequest) SetNotaryApplyInfo(v *NotaryApplyInfo) *ApplyNotaryOrderRequest {
	s.NotaryApplyInfo = v
	return s
}

func (s *ApplyNotaryOrderRequest) SetNotaryReceiveInfo(v *NotaryReceiveInfo) *ApplyNotaryOrderRequest {
	s.NotaryReceiveInfo = v
	return s
}

func (s *ApplyNotaryOrderRequest) SetPreviewTime(v int64) *ApplyNotaryOrderRequest {
	s.PreviewTime = &v
	return s
}

func (s *ApplyNotaryOrderRequest) SetAgreeTime(v int64) *ApplyNotaryOrderRequest {
	s.AgreeTime = &v
	return s
}

func (s *ApplyNotaryOrderRequest) SetClientToken(v string) *ApplyNotaryOrderRequest {
	s.ClientToken = &v
	return s
}

type ApplyNotaryOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出证申请订单ID
	NotaryOrderId *string `json:"notary_order_id,omitempty" xml:"notary_order_id,omitempty"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 支付二维码链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 支付二维码过期时间
	PayUrlExpireTime *int64 `json:"pay_url_expire_time,omitempty" xml:"pay_url_expire_time,omitempty"`
}

func (s ApplyNotaryOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyNotaryOrderResponse) GoString() string {
	return s.String()
}

func (s *ApplyNotaryOrderResponse) SetReqMsgId(v string) *ApplyNotaryOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetResultCode(v string) *ApplyNotaryOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetResultMsg(v string) *ApplyNotaryOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetNotaryOrderId(v string) *ApplyNotaryOrderResponse {
	s.NotaryOrderId = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetOrderStatus(v string) *ApplyNotaryOrderResponse {
	s.OrderStatus = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetPayUrl(v string) *ApplyNotaryOrderResponse {
	s.PayUrl = &v
	return s
}

func (s *ApplyNotaryOrderResponse) SetPayUrlExpireTime(v int64) *ApplyNotaryOrderResponse {
	s.PayUrlExpireTime = &v
	return s
}

type QueryNotaryPayurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单ID
	NotaryOrderId *string `json:"notary_order_id,omitempty" xml:"notary_order_id,omitempty" require:"true"`
}

func (s QueryNotaryPayurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryPayurlRequest) GoString() string {
	return s.String()
}

func (s *QueryNotaryPayurlRequest) SetAuthToken(v string) *QueryNotaryPayurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNotaryPayurlRequest) SetProductInstanceId(v string) *QueryNotaryPayurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNotaryPayurlRequest) SetNotaryOrderId(v string) *QueryNotaryPayurlRequest {
	s.NotaryOrderId = &v
	return s
}

type QueryNotaryPayurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付二维码链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 支付二维码链接到期时间
	PayUrlExpireTime *int64 `json:"pay_url_expire_time,omitempty" xml:"pay_url_expire_time,omitempty"`
}

func (s QueryNotaryPayurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryPayurlResponse) GoString() string {
	return s.String()
}

func (s *QueryNotaryPayurlResponse) SetReqMsgId(v string) *QueryNotaryPayurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNotaryPayurlResponse) SetResultCode(v string) *QueryNotaryPayurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNotaryPayurlResponse) SetResultMsg(v string) *QueryNotaryPayurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNotaryPayurlResponse) SetPayUrl(v string) *QueryNotaryPayurlResponse {
	s.PayUrl = &v
	return s
}

func (s *QueryNotaryPayurlResponse) SetPayUrlExpireTime(v int64) *QueryNotaryPayurlResponse {
	s.PayUrlExpireTime = &v
	return s
}

type QueryNotaryFeedetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公证处ID
	OrgId *string `json:"org_id,omitempty" xml:"org_id,omitempty" require:"true"`
	// 公证书类型
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// 纸质公证书份数
	Copies *int64 `json:"copies,omitempty" xml:"copies,omitempty"`
	// 证据列表
	EvidInfoList []*EvidInfo `json:"evid_info_list,omitempty" xml:"evid_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryNotaryFeedetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryFeedetailRequest) GoString() string {
	return s.String()
}

func (s *QueryNotaryFeedetailRequest) SetAuthToken(v string) *QueryNotaryFeedetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNotaryFeedetailRequest) SetProductInstanceId(v string) *QueryNotaryFeedetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNotaryFeedetailRequest) SetOrgId(v string) *QueryNotaryFeedetailRequest {
	s.OrgId = &v
	return s
}

func (s *QueryNotaryFeedetailRequest) SetOrderType(v string) *QueryNotaryFeedetailRequest {
	s.OrderType = &v
	return s
}

func (s *QueryNotaryFeedetailRequest) SetCopies(v int64) *QueryNotaryFeedetailRequest {
	s.Copies = &v
	return s
}

func (s *QueryNotaryFeedetailRequest) SetEvidInfoList(v []*EvidInfo) *QueryNotaryFeedetailRequest {
	s.EvidInfoList = v
	return s
}

type QueryNotaryFeedetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次公证出证需支付的总费用
	TotalPriceRmbFen *int64 `json:"total_price_rmb_fen,omitempty" xml:"total_price_rmb_fen,omitempty"`
	// 本次申请中每一类证据的数量明细列表
	NotaryFeeEvidTypeDataList []*NotaryFeeEvidTypeData `json:"notary_fee_evid_type_data_list,omitempty" xml:"notary_fee_evid_type_data_list,omitempty" type:"Repeated"`
	// 本次需支付费用的分项明细列表
	NotaryFeeItemList []*NotaryFeeItem `json:"notary_fee_item_list,omitempty" xml:"notary_fee_item_list,omitempty" type:"Repeated"`
	// 收费规则描述
	NotaryFeeRuleList []*string `json:"notary_fee_rule_list,omitempty" xml:"notary_fee_rule_list,omitempty" type:"Repeated"`
}

func (s QueryNotaryFeedetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryFeedetailResponse) GoString() string {
	return s.String()
}

func (s *QueryNotaryFeedetailResponse) SetReqMsgId(v string) *QueryNotaryFeedetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetResultCode(v string) *QueryNotaryFeedetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetResultMsg(v string) *QueryNotaryFeedetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetTotalPriceRmbFen(v int64) *QueryNotaryFeedetailResponse {
	s.TotalPriceRmbFen = &v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetNotaryFeeEvidTypeDataList(v []*NotaryFeeEvidTypeData) *QueryNotaryFeedetailResponse {
	s.NotaryFeeEvidTypeDataList = v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetNotaryFeeItemList(v []*NotaryFeeItem) *QueryNotaryFeedetailResponse {
	s.NotaryFeeItemList = v
	return s
}

func (s *QueryNotaryFeedetailResponse) SetNotaryFeeRuleList(v []*string) *QueryNotaryFeedetailResponse {
	s.NotaryFeeRuleList = v
	return s
}

type QueryNotaryOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// acrbasis订单ID
	NotaryOrderId *string `json:"notary_order_id,omitempty" xml:"notary_order_id,omitempty" require:"true"`
}

func (s QueryNotaryOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryNotaryOrderRequest) SetAuthToken(v string) *QueryNotaryOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryNotaryOrderRequest) SetProductInstanceId(v string) *QueryNotaryOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryNotaryOrderRequest) SetNotaryOrderId(v string) *QueryNotaryOrderRequest {
	s.NotaryOrderId = &v
	return s
}

type QueryNotaryOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 支付状态最后更新时间戳
	PayTime *int64 `json:"pay_time,omitempty" xml:"pay_time,omitempty"`
	// 用户预览签署文件的时间戳
	PreviewTime *int64 `json:"preview_time,omitempty" xml:"preview_time,omitempty"`
	// 支付状态
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty"`
	// 补充材料说明，当需要补充材料时提供
	MaterialRemarks *string `json:"material_remarks,omitempty" xml:"material_remarks,omitempty"`
	// 出证的公证书信息
	NotaryInfo *NotaryInfo `json:"notary_info,omitempty" xml:"notary_info,omitempty"`
	// 拒绝办理信息
	RejectInfo *RefuseInfo `json:"reject_info,omitempty" xml:"reject_info,omitempty"`
	// 终止信息
	TerminalInfo *RefuseInfo `json:"terminal_info,omitempty" xml:"terminal_info,omitempty"`
	// 支付方式
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty"`
	// 用户应付的金额
	PayableAmount *int64 `json:"payable_amount,omitempty" xml:"payable_amount,omitempty"`
	// 用户实际支付的金额
	PaidAmount *int64 `json:"paid_amount,omitempty" xml:"paid_amount,omitempty"`
	// 公证处物流信息
	NotaryExpressList []*ExpressInfo `json:"notary_express_list,omitempty" xml:"notary_express_list,omitempty" type:"Repeated"`
	// 发票物流信息
	InvoiceExpressList []*ExpressInfo `json:"invoice_express_list,omitempty" xml:"invoice_express_list,omitempty" type:"Repeated"`
}

func (s QueryNotaryOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryNotaryOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryNotaryOrderResponse) SetReqMsgId(v string) *QueryNotaryOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetResultCode(v string) *QueryNotaryOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetResultMsg(v string) *QueryNotaryOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetStatus(v string) *QueryNotaryOrderResponse {
	s.Status = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetPayTime(v int64) *QueryNotaryOrderResponse {
	s.PayTime = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetPreviewTime(v int64) *QueryNotaryOrderResponse {
	s.PreviewTime = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetPayStatus(v string) *QueryNotaryOrderResponse {
	s.PayStatus = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetMaterialRemarks(v string) *QueryNotaryOrderResponse {
	s.MaterialRemarks = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetNotaryInfo(v *NotaryInfo) *QueryNotaryOrderResponse {
	s.NotaryInfo = v
	return s
}

func (s *QueryNotaryOrderResponse) SetRejectInfo(v *RefuseInfo) *QueryNotaryOrderResponse {
	s.RejectInfo = v
	return s
}

func (s *QueryNotaryOrderResponse) SetTerminalInfo(v *RefuseInfo) *QueryNotaryOrderResponse {
	s.TerminalInfo = v
	return s
}

func (s *QueryNotaryOrderResponse) SetPayType(v string) *QueryNotaryOrderResponse {
	s.PayType = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetPayableAmount(v int64) *QueryNotaryOrderResponse {
	s.PayableAmount = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetPaidAmount(v int64) *QueryNotaryOrderResponse {
	s.PaidAmount = &v
	return s
}

func (s *QueryNotaryOrderResponse) SetNotaryExpressList(v []*ExpressInfo) *QueryNotaryOrderResponse {
	s.NotaryExpressList = v
	return s
}

func (s *QueryNotaryOrderResponse) SetInvoiceExpressList(v []*ExpressInfo) *QueryNotaryOrderResponse {
	s.InvoiceExpressList = v
	return s
}

type UploadNotaryAttachmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单ID
	NotaryOrderId *string `json:"notary_order_id,omitempty" xml:"notary_order_id,omitempty" require:"true"`
	// 材料文件
	MaterialFileList []*string `json:"material_file_list,omitempty" xml:"material_file_list,omitempty" require:"true" type:"Repeated"`
}

func (s UploadNotaryAttachmentRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadNotaryAttachmentRequest) GoString() string {
	return s.String()
}

func (s *UploadNotaryAttachmentRequest) SetAuthToken(v string) *UploadNotaryAttachmentRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadNotaryAttachmentRequest) SetProductInstanceId(v string) *UploadNotaryAttachmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadNotaryAttachmentRequest) SetNotaryOrderId(v string) *UploadNotaryAttachmentRequest {
	s.NotaryOrderId = &v
	return s
}

func (s *UploadNotaryAttachmentRequest) SetMaterialFileList(v []*string) *UploadNotaryAttachmentRequest {
	s.MaterialFileList = v
	return s
}

type UploadNotaryAttachmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadNotaryAttachmentResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadNotaryAttachmentResponse) GoString() string {
	return s.String()
}

func (s *UploadNotaryAttachmentResponse) SetReqMsgId(v string) *UploadNotaryAttachmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadNotaryAttachmentResponse) SetResultCode(v string) *UploadNotaryAttachmentResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadNotaryAttachmentResponse) SetResultMsg(v string) *UploadNotaryAttachmentResponse {
	s.ResultMsg = &v
	return s
}

type OperateNotaryOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单ID
	NotaryOrderId *string `json:"notary_order_id,omitempty" xml:"notary_order_id,omitempty" require:"true"`
	// 更新状态类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s OperateNotaryOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateNotaryOrderRequest) GoString() string {
	return s.String()
}

func (s *OperateNotaryOrderRequest) SetAuthToken(v string) *OperateNotaryOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateNotaryOrderRequest) SetProductInstanceId(v string) *OperateNotaryOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateNotaryOrderRequest) SetNotaryOrderId(v string) *OperateNotaryOrderRequest {
	s.NotaryOrderId = &v
	return s
}

func (s *OperateNotaryOrderRequest) SetType(v string) *OperateNotaryOrderRequest {
	s.Type = &v
	return s
}

type OperateNotaryOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateNotaryOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateNotaryOrderResponse) GoString() string {
	return s.String()
}

func (s *OperateNotaryOrderResponse) SetReqMsgId(v string) *OperateNotaryOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateNotaryOrderResponse) SetResultCode(v string) *OperateNotaryOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateNotaryOrderResponse) SetResultMsg(v string) *OperateNotaryOrderResponse {
	s.ResultMsg = &v
	return s
}

type QueryDciPreviewRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// dci作品预览id
	DciPreviewId *string `json:"dci_preview_id,omitempty" xml:"dci_preview_id,omitempty"`
	// basis的dci content id
	DciBasisId *string `json:"dci_basis_id,omitempty" xml:"dci_basis_id,omitempty"`
}

func (s QueryDciPreviewRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreviewRequest) GoString() string {
	return s.String()
}

func (s *QueryDciPreviewRequest) SetAuthToken(v string) *QueryDciPreviewRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciPreviewRequest) SetProductInstanceId(v string) *QueryDciPreviewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciPreviewRequest) SetDciPreviewId(v string) *QueryDciPreviewRequest {
	s.DciPreviewId = &v
	return s
}

func (s *QueryDciPreviewRequest) SetDciBasisId(v string) *QueryDciPreviewRequest {
	s.DciBasisId = &v
	return s
}

type QueryDciPreviewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 作品预览处理状态
	FilePreviewStatus *string `json:"file_preview_status,omitempty" xml:"file_preview_status,omitempty"`
	// 作品片段预览状态
	FilePartPreviewStatus *string `json:"file_part_preview_status,omitempty" xml:"file_part_preview_status,omitempty"`
	// 作品预览处理结果
	FilePreviewUrl *string `json:"file_preview_url,omitempty" xml:"file_preview_url,omitempty"`
	// 作品预览截取片段结果
	FilePartPreviewUrl *string `json:"file_part_preview_url,omitempty" xml:"file_part_preview_url,omitempty"`
	// 作品名称
	WorkName *string `json:"work_name,omitempty" xml:"work_name,omitempty"`
	// dci码
	DciCode *string `json:"dci_code,omitempty" xml:"dci_code,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 当前查询时间
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数登登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty"`
	// 著作权人名称列表
	CopyrightOwnerNames []*string `json:"copyright_owner_names,omitempty" xml:"copyright_owner_names,omitempty" type:"Repeated"`
	// 系列图预览地址
	SeriesDiagramPreviewList []*string `json:"series_diagram_preview_list,omitempty" xml:"series_diagram_preview_list,omitempty" type:"Repeated"`
}

func (s QueryDciPreviewResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciPreviewResponse) GoString() string {
	return s.String()
}

func (s *QueryDciPreviewResponse) SetReqMsgId(v string) *QueryDciPreviewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciPreviewResponse) SetResultCode(v string) *QueryDciPreviewResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciPreviewResponse) SetResultMsg(v string) *QueryDciPreviewResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciPreviewResponse) SetFilePreviewStatus(v string) *QueryDciPreviewResponse {
	s.FilePreviewStatus = &v
	return s
}

func (s *QueryDciPreviewResponse) SetFilePartPreviewStatus(v string) *QueryDciPreviewResponse {
	s.FilePartPreviewStatus = &v
	return s
}

func (s *QueryDciPreviewResponse) SetFilePreviewUrl(v string) *QueryDciPreviewResponse {
	s.FilePreviewUrl = &v
	return s
}

func (s *QueryDciPreviewResponse) SetFilePartPreviewUrl(v string) *QueryDciPreviewResponse {
	s.FilePartPreviewUrl = &v
	return s
}

func (s *QueryDciPreviewResponse) SetWorkName(v string) *QueryDciPreviewResponse {
	s.WorkName = &v
	return s
}

func (s *QueryDciPreviewResponse) SetDciCode(v string) *QueryDciPreviewResponse {
	s.DciCode = &v
	return s
}

func (s *QueryDciPreviewResponse) SetFileType(v string) *QueryDciPreviewResponse {
	s.FileType = &v
	return s
}

func (s *QueryDciPreviewResponse) SetQueryTime(v string) *QueryDciPreviewResponse {
	s.QueryTime = &v
	return s
}

func (s *QueryDciPreviewResponse) SetRegNumber(v string) *QueryDciPreviewResponse {
	s.RegNumber = &v
	return s
}

func (s *QueryDciPreviewResponse) SetCopyrightOwnerNames(v []*string) *QueryDciPreviewResponse {
	s.CopyrightOwnerNames = v
	return s
}

func (s *QueryDciPreviewResponse) SetSeriesDiagramPreviewList(v []*string) *QueryDciPreviewResponse {
	s.SeriesDiagramPreviewList = v
	return s
}

type RetryDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待补正数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 替换dci申领id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 数登申请声明
	ExplanationInfo *DciExplanationInfo `json:"explanation_info,omitempty" xml:"explanation_info,omitempty" require:"true"`
	// 补充文件信息
	AdditionalFileInfo *AdditionalFileInfo `json:"additional_file_info,omitempty" xml:"additional_file_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 权利描述
	RightScopeDesc *string `json:"right_scope_desc,omitempty" xml:"right_scope_desc,omitempty"`
	// 申领人联系信息
	ApplyerContactInfo *ContactInfo `json:"applyer_contact_info,omitempty" xml:"applyer_contact_info,omitempty"`
	// 代理人联系信息
	PlatformContactInfo *ContactInfo `json:"platform_contact_info,omitempty" xml:"platform_contact_info,omitempty"`
}

func (s RetryDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *RetryDciRegistrationRequest) SetAuthToken(v string) *RetryDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetProductInstanceId(v string) *RetryDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetDigitalRegisterId(v string) *RetryDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetDciContentId(v string) *RetryDciRegistrationRequest {
	s.DciContentId = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetExplanationInfo(v *DciExplanationInfo) *RetryDciRegistrationRequest {
	s.ExplanationInfo = v
	return s
}

func (s *RetryDciRegistrationRequest) SetAdditionalFileInfo(v *AdditionalFileInfo) *RetryDciRegistrationRequest {
	s.AdditionalFileInfo = v
	return s
}

func (s *RetryDciRegistrationRequest) SetClientToken(v string) *RetryDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetRightScopeDesc(v string) *RetryDciRegistrationRequest {
	s.RightScopeDesc = &v
	return s
}

func (s *RetryDciRegistrationRequest) SetApplyerContactInfo(v *ContactInfo) *RetryDciRegistrationRequest {
	s.ApplyerContactInfo = v
	return s
}

func (s *RetryDciRegistrationRequest) SetPlatformContactInfo(v *ContactInfo) *RetryDciRegistrationRequest {
	s.PlatformContactInfo = v
	return s
}

type RetryDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s RetryDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *RetryDciRegistrationResponse) SetReqMsgId(v string) *RetryDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryDciRegistrationResponse) SetResultCode(v string) *RetryDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryDciRegistrationResponse) SetResultMsg(v string) *RetryDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryDciRegistrationResponse) SetErrorMsg(v string) *RetryDciRegistrationResponse {
	s.ErrorMsg = &v
	return s
}

type CloseDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty" require:"true"`
	// 退费人名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联系手机号
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CloseDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CloseDciRegistrationRequest) SetAuthToken(v string) *CloseDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseDciRegistrationRequest) SetProductInstanceId(v string) *CloseDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CloseDciRegistrationRequest) SetDigitalRegisterId(v string) *CloseDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *CloseDciRegistrationRequest) SetName(v string) *CloseDciRegistrationRequest {
	s.Name = &v
	return s
}

func (s *CloseDciRegistrationRequest) SetMobileNo(v string) *CloseDciRegistrationRequest {
	s.MobileNo = &v
	return s
}

func (s *CloseDciRegistrationRequest) SetClientToken(v string) *CloseDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

type CloseDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CloseDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CloseDciRegistrationResponse) SetReqMsgId(v string) *CloseDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseDciRegistrationResponse) SetResultCode(v string) *CloseDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseDciRegistrationResponse) SetResultMsg(v string) *CloseDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type AddDciUsernocertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名称
	CertificateName *string `json:"certificate_name,omitempty" xml:"certificate_name,omitempty" require:"true"`
	// 证件类型
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty" require:"true"`
	// 证件号
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty" require:"true"`
	// 企业用户必填
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业用户必填
	LegalPersonCertType *string `json:"legal_person_cert_type,omitempty" xml:"legal_person_cert_type,omitempty"`
	// 企业用户必填
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
	CopyrightCertificationType *string `json:"copyright_certification_type,omitempty" xml:"copyright_certification_type,omitempty"`
}

func (s AddDciUsernocertRequest) String() string {
	return tea.Prettify(s)
}

func (s AddDciUsernocertRequest) GoString() string {
	return s.String()
}

func (s *AddDciUsernocertRequest) SetAuthToken(v string) *AddDciUsernocertRequest {
	s.AuthToken = &v
	return s
}

func (s *AddDciUsernocertRequest) SetProductInstanceId(v string) *AddDciUsernocertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddDciUsernocertRequest) SetCertificateName(v string) *AddDciUsernocertRequest {
	s.CertificateName = &v
	return s
}

func (s *AddDciUsernocertRequest) SetCertificateType(v string) *AddDciUsernocertRequest {
	s.CertificateType = &v
	return s
}

func (s *AddDciUsernocertRequest) SetCertificateNumber(v string) *AddDciUsernocertRequest {
	s.CertificateNumber = &v
	return s
}

func (s *AddDciUsernocertRequest) SetLegalPersonCertName(v string) *AddDciUsernocertRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *AddDciUsernocertRequest) SetLegalPersonCertType(v string) *AddDciUsernocertRequest {
	s.LegalPersonCertType = &v
	return s
}

func (s *AddDciUsernocertRequest) SetLegalPersonCertNo(v string) *AddDciUsernocertRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *AddDciUsernocertRequest) SetPhone(v string) *AddDciUsernocertRequest {
	s.Phone = &v
	return s
}

func (s *AddDciUsernocertRequest) SetProxyData(v *ProxyData) *AddDciUsernocertRequest {
	s.ProxyData = v
	return s
}

func (s *AddDciUsernocertRequest) SetClientToken(v string) *AddDciUsernocertRequest {
	s.ClientToken = &v
	return s
}

func (s *AddDciUsernocertRequest) SetCopyrightCertificationType(v string) *AddDciUsernocertRequest {
	s.CopyrightCertificationType = &v
	return s
}

type AddDciUsernocertResponse struct {
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

func (s AddDciUsernocertResponse) String() string {
	return tea.Prettify(s)
}

func (s AddDciUsernocertResponse) GoString() string {
	return s.String()
}

func (s *AddDciUsernocertResponse) SetReqMsgId(v string) *AddDciUsernocertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddDciUsernocertResponse) SetResultCode(v string) *AddDciUsernocertResponse {
	s.ResultCode = &v
	return s
}

func (s *AddDciUsernocertResponse) SetResultMsg(v string) *AddDciUsernocertResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddDciUsernocertResponse) SetDciUserId(v string) *AddDciUsernocertResponse {
	s.DciUserId = &v
	return s
}

func (s *AddDciUsernocertResponse) SetDciUserStatus(v string) *AddDciUsernocertResponse {
	s.DciUserStatus = &v
	return s
}

type QueryDciSimilarfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件下载凭证
	WorkFileId *string `json:"work_file_id,omitempty" xml:"work_file_id,omitempty" require:"true"`
}

func (s QueryDciSimilarfileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciSimilarfileRequest) GoString() string {
	return s.String()
}

func (s *QueryDciSimilarfileRequest) SetAuthToken(v string) *QueryDciSimilarfileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciSimilarfileRequest) SetProductInstanceId(v string) *QueryDciSimilarfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciSimilarfileRequest) SetWorkFileId(v string) *QueryDciSimilarfileRequest {
	s.WorkFileId = &v
	return s
}

type QueryDciSimilarfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件下载链接
	WorkDownloadUrl *string `json:"work_download_url,omitempty" xml:"work_download_url,omitempty"`
}

func (s QueryDciSimilarfileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciSimilarfileResponse) GoString() string {
	return s.String()
}

func (s *QueryDciSimilarfileResponse) SetReqMsgId(v string) *QueryDciSimilarfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciSimilarfileResponse) SetResultCode(v string) *QueryDciSimilarfileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciSimilarfileResponse) SetResultMsg(v string) *QueryDciSimilarfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciSimilarfileResponse) SetWorkDownloadUrl(v string) *QueryDciSimilarfileResponse {
	s.WorkDownloadUrl = &v
	return s
}

type ApplyDciPromotionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联系人姓名
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系人电话
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty" require:"true"`
	// dci ID
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 推广渠道
	PromotionWay *string `json:"promotion_way,omitempty" xml:"promotion_way,omitempty" require:"true"`
}

func (s ApplyDciPromotionRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDciPromotionRequest) GoString() string {
	return s.String()
}

func (s *ApplyDciPromotionRequest) SetAuthToken(v string) *ApplyDciPromotionRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetProductInstanceId(v string) *ApplyDciPromotionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetContactName(v string) *ApplyDciPromotionRequest {
	s.ContactName = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetContactPhone(v string) *ApplyDciPromotionRequest {
	s.ContactPhone = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetDciContentId(v string) *ApplyDciPromotionRequest {
	s.DciContentId = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetClientToken(v string) *ApplyDciPromotionRequest {
	s.ClientToken = &v
	return s
}

func (s *ApplyDciPromotionRequest) SetPromotionWay(v string) *ApplyDciPromotionRequest {
	s.PromotionWay = &v
	return s
}

type ApplyDciPromotionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// basis数据ID
	ApiTaskId *string `json:"api_task_id,omitempty" xml:"api_task_id,omitempty"`
}

func (s ApplyDciPromotionResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDciPromotionResponse) GoString() string {
	return s.String()
}

func (s *ApplyDciPromotionResponse) SetReqMsgId(v string) *ApplyDciPromotionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDciPromotionResponse) SetResultCode(v string) *ApplyDciPromotionResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDciPromotionResponse) SetResultMsg(v string) *ApplyDciPromotionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDciPromotionResponse) SetApiTaskId(v string) *ApplyDciPromotionResponse {
	s.ApiTaskId = &v
	return s
}

type QueryDciUserbyphoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
}

func (s QueryDciUserbyphoneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciUserbyphoneRequest) GoString() string {
	return s.String()
}

func (s *QueryDciUserbyphoneRequest) SetAuthToken(v string) *QueryDciUserbyphoneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciUserbyphoneRequest) SetProductInstanceId(v string) *QueryDciUserbyphoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciUserbyphoneRequest) SetPhone(v string) *QueryDciUserbyphoneRequest {
	s.Phone = &v
	return s
}

type QueryDciUserbyphoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// dci用户id
	//
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// dci用户状态
	//
	DciUserStatus *string `json:"dci_user_status,omitempty" xml:"dci_user_status,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 证件类型
	//
	CertificateType *string `json:"certificate_type,omitempty" xml:"certificate_type,omitempty"`
	// 证件号
	//
	CertificateNumber *string `json:"certificate_number,omitempty" xml:"certificate_number,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 证件有效期开始时间
	//
	CertStartTime *string `json:"cert_start_time,omitempty" xml:"cert_start_time,omitempty"`
	// 证件有效期结束时间
	//
	CertEndTime *string `json:"cert_end_time,omitempty" xml:"cert_end_time,omitempty"`
	// 法人名称
	//
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
}

func (s QueryDciUserbyphoneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciUserbyphoneResponse) GoString() string {
	return s.String()
}

func (s *QueryDciUserbyphoneResponse) SetReqMsgId(v string) *QueryDciUserbyphoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetResultCode(v string) *QueryDciUserbyphoneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetResultMsg(v string) *QueryDciUserbyphoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetDciUserId(v string) *QueryDciUserbyphoneResponse {
	s.DciUserId = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetDciUserStatus(v string) *QueryDciUserbyphoneResponse {
	s.DciUserStatus = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetName(v string) *QueryDciUserbyphoneResponse {
	s.Name = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetCertificateType(v string) *QueryDciUserbyphoneResponse {
	s.CertificateType = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetCertificateNumber(v string) *QueryDciUserbyphoneResponse {
	s.CertificateNumber = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetAddress(v string) *QueryDciUserbyphoneResponse {
	s.Address = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetCertStartTime(v string) *QueryDciUserbyphoneResponse {
	s.CertStartTime = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetCertEndTime(v string) *QueryDciUserbyphoneResponse {
	s.CertEndTime = &v
	return s
}

func (s *QueryDciUserbyphoneResponse) SetLegalPerson(v string) *QueryDciUserbyphoneResponse {
	s.LegalPerson = &v
	return s
}

type QueryTradeSaleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询文本
	QueryText *string `json:"query_text,omitempty" xml:"query_text,omitempty" require:"true" maxLength:"2048" minLength:"0"`
	// 查询场景
	QueryScene *string `json:"query_scene,omitempty" xml:"query_scene,omitempty" require:"true"`
	// 扩展信息，JSON格式
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryTradeSaleRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeSaleRequest) GoString() string {
	return s.String()
}

func (s *QueryTradeSaleRequest) SetAuthToken(v string) *QueryTradeSaleRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTradeSaleRequest) SetProductInstanceId(v string) *QueryTradeSaleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTradeSaleRequest) SetQueryText(v string) *QueryTradeSaleRequest {
	s.QueryText = &v
	return s
}

func (s *QueryTradeSaleRequest) SetQueryScene(v string) *QueryTradeSaleRequest {
	s.QueryScene = &v
	return s
}

func (s *QueryTradeSaleRequest) SetExtInfo(v string) *QueryTradeSaleRequest {
	s.ExtInfo = &v
	return s
}

type QueryTradeSaleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 匹配的商品信息
	SaleDataList []*SaleData `json:"sale_data_list,omitempty" xml:"sale_data_list,omitempty" type:"Repeated"`
	// 扩展信息JSON
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryTradeSaleResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTradeSaleResponse) GoString() string {
	return s.String()
}

func (s *QueryTradeSaleResponse) SetReqMsgId(v string) *QueryTradeSaleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTradeSaleResponse) SetResultCode(v string) *QueryTradeSaleResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTradeSaleResponse) SetResultMsg(v string) *QueryTradeSaleResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTradeSaleResponse) SetSaleDataList(v []*SaleData) *QueryTradeSaleResponse {
	s.SaleDataList = v
	return s
}

func (s *QueryTradeSaleResponse) SetExtInfo(v string) *QueryTradeSaleResponse {
	s.ExtInfo = &v
	return s
}

type RegisterTradeUsageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 标识某个服务实体的唯一ID，例如dciContentId
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 服务类型，例如DCI、存证等
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 扩展信息，JSON格式
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 调用方唯一业务标识
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 文件类型，例如音频、视频、图片
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 待登记的文件Url
	RegFileUrl *string `json:"reg_file_url,omitempty" xml:"reg_file_url,omitempty"`
}

func (s RegisterTradeUsageRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterTradeUsageRequest) GoString() string {
	return s.String()
}

func (s *RegisterTradeUsageRequest) SetAuthToken(v string) *RegisterTradeUsageRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetProductInstanceId(v string) *RegisterTradeUsageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetServiceId(v string) *RegisterTradeUsageRequest {
	s.ServiceId = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetServiceType(v string) *RegisterTradeUsageRequest {
	s.ServiceType = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetBizType(v string) *RegisterTradeUsageRequest {
	s.BizType = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetExtInfo(v string) *RegisterTradeUsageRequest {
	s.ExtInfo = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetOutBizNo(v string) *RegisterTradeUsageRequest {
	s.OutBizNo = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetFileType(v string) *RegisterTradeUsageRequest {
	s.FileType = &v
	return s
}

func (s *RegisterTradeUsageRequest) SetRegFileUrl(v string) *RegisterTradeUsageRequest {
	s.RegFileUrl = &v
	return s
}

type RegisterTradeUsageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登记Id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
	// 登记状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s RegisterTradeUsageResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterTradeUsageResponse) GoString() string {
	return s.String()
}

func (s *RegisterTradeUsageResponse) SetReqMsgId(v string) *RegisterTradeUsageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterTradeUsageResponse) SetResultCode(v string) *RegisterTradeUsageResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterTradeUsageResponse) SetResultMsg(v string) *RegisterTradeUsageResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterTradeUsageResponse) SetRegisterId(v string) *RegisterTradeUsageResponse {
	s.RegisterId = &v
	return s
}

func (s *RegisterTradeUsageResponse) SetStatus(v string) *RegisterTradeUsageResponse {
	s.Status = &v
	return s
}

func (s *RegisterTradeUsageResponse) SetExtInfo(v string) *RegisterTradeUsageResponse {
	s.ExtInfo = &v
	return s
}

type CreateEvidenceUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证主体证件名称
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 取证主体证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户类型（个人/企业）
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 法人姓名（企业用户必填）
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号（企业用户必填）
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 取证操作人证件姓名（企业用户必填）
	OperatorName *string `json:"operator_name,omitempty" xml:"operator_name,omitempty"`
	// 取证操作人证件号（企业用户必填）
	OperatorCertNo *string `json:"operator_cert_no,omitempty" xml:"operator_cert_no,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateEvidenceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceUserRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceUserRequest) SetAuthToken(v string) *CreateEvidenceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetProductInstanceId(v string) *CreateEvidenceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetCertName(v string) *CreateEvidenceUserRequest {
	s.CertName = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetCertNo(v string) *CreateEvidenceUserRequest {
	s.CertNo = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetUserType(v string) *CreateEvidenceUserRequest {
	s.UserType = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetLegalPersonCertName(v string) *CreateEvidenceUserRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetLegalPersonCertNo(v string) *CreateEvidenceUserRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetOperatorName(v string) *CreateEvidenceUserRequest {
	s.OperatorName = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetOperatorCertNo(v string) *CreateEvidenceUserRequest {
	s.OperatorCertNo = &v
	return s
}

func (s *CreateEvidenceUserRequest) SetClientToken(v string) *CreateEvidenceUserRequest {
	s.ClientToken = &v
	return s
}

type CreateEvidenceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证用户id
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty"`
	// 外部用户ID
	OutUserId *string `json:"out_user_id,omitempty" xml:"out_user_id,omitempty"`
}

func (s CreateEvidenceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceUserResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceUserResponse) SetReqMsgId(v string) *CreateEvidenceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceUserResponse) SetResultCode(v string) *CreateEvidenceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceUserResponse) SetResultMsg(v string) *CreateEvidenceUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceUserResponse) SetEvidenceUserId(v string) *CreateEvidenceUserResponse {
	s.EvidenceUserId = &v
	return s
}

func (s *CreateEvidenceUserResponse) SetOutUserId(v string) *CreateEvidenceUserResponse {
	s.OutUserId = &v
	return s
}

type CreateEvidenceScreenshotRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证用户id
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty" require:"true"`
	// 取证公证处
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty" require:"true"`
	// 取证网址信息
	WebUrl *EvidenceWebUrlInfo `json:"web_url,omitempty" xml:"web_url,omitempty" require:"true"`
	// 取证三方账号信息
	ThirdPartyInfo *EvidenceThirdPartyInfo `json:"third_party_info,omitempty" xml:"third_party_info,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateEvidenceScreenshotRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceScreenshotRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceScreenshotRequest) SetAuthToken(v string) *CreateEvidenceScreenshotRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetProductInstanceId(v string) *CreateEvidenceScreenshotRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetEvidenceUserId(v string) *CreateEvidenceScreenshotRequest {
	s.EvidenceUserId = &v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetNotaryOffice(v string) *CreateEvidenceScreenshotRequest {
	s.NotaryOffice = &v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetWebUrl(v *EvidenceWebUrlInfo) *CreateEvidenceScreenshotRequest {
	s.WebUrl = v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetThirdPartyInfo(v *EvidenceThirdPartyInfo) *CreateEvidenceScreenshotRequest {
	s.ThirdPartyInfo = v
	return s
}

func (s *CreateEvidenceScreenshotRequest) SetClientToken(v string) *CreateEvidenceScreenshotRequest {
	s.ClientToken = &v
	return s
}

type CreateEvidenceScreenshotResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 网页截图id
	ScreenshotId *string `json:"screenshot_id,omitempty" xml:"screenshot_id,omitempty"`
}

func (s CreateEvidenceScreenshotResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceScreenshotResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceScreenshotResponse) SetReqMsgId(v string) *CreateEvidenceScreenshotResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceScreenshotResponse) SetResultCode(v string) *CreateEvidenceScreenshotResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceScreenshotResponse) SetResultMsg(v string) *CreateEvidenceScreenshotResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceScreenshotResponse) SetScreenshotId(v string) *CreateEvidenceScreenshotResponse {
	s.ScreenshotId = &v
	return s
}

type CreateEvidenceRegisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 网页截图id
	ScreenshotId *string `json:"screenshot_id,omitempty" xml:"screenshot_id,omitempty" require:"true"`
	// 取证名称
	EvidenceName *string `json:"evidence_name,omitempty" xml:"evidence_name,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateEvidenceRegisterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceRegisterRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceRegisterRequest) SetAuthToken(v string) *CreateEvidenceRegisterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceRegisterRequest) SetProductInstanceId(v string) *CreateEvidenceRegisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceRegisterRequest) SetScreenshotId(v string) *CreateEvidenceRegisterRequest {
	s.ScreenshotId = &v
	return s
}

func (s *CreateEvidenceRegisterRequest) SetEvidenceName(v string) *CreateEvidenceRegisterRequest {
	s.EvidenceName = &v
	return s
}

func (s *CreateEvidenceRegisterRequest) SetClientToken(v string) *CreateEvidenceRegisterRequest {
	s.ClientToken = &v
	return s
}

type CreateEvidenceRegisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateEvidenceRegisterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceRegisterResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceRegisterResponse) SetReqMsgId(v string) *CreateEvidenceRegisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceRegisterResponse) SetResultCode(v string) *CreateEvidenceRegisterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceRegisterResponse) SetResultMsg(v string) *CreateEvidenceRegisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceRegisterResponse) SetEvidenceId(v string) *CreateEvidenceRegisterResponse {
	s.EvidenceId = &v
	return s
}

type CreateEvidenceRecordscreenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 取证用户id
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty" require:"true"`
	// 取证公证处
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty" require:"true"`
	// 取证网址信息
	WebUrls []*EvidenceWebUrlInfo `json:"web_urls,omitempty" xml:"web_urls,omitempty" type:"Repeated"`
	// 取证三方账号信息
	ThirdPartyInfo *EvidenceThirdPartyInfo `json:"third_party_info,omitempty" xml:"third_party_info,omitempty" require:"true"`
	// 取证服务器地域
	Area *string `json:"area,omitempty" xml:"area,omitempty" require:"true"`
	// 最大录屏时间（单位：分钟）
	MaxTimeInMin *int64 `json:"max_time_in_min,omitempty" xml:"max_time_in_min,omitempty" require:"true"`
	// 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
	WaitInMin *int64 `json:"wait_in_min,omitempty" xml:"wait_in_min,omitempty" require:"true"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
}

func (s CreateEvidenceRecordscreenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceRecordscreenRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceRecordscreenRequest) SetAuthToken(v string) *CreateEvidenceRecordscreenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetProductInstanceId(v string) *CreateEvidenceRecordscreenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetName(v string) *CreateEvidenceRecordscreenRequest {
	s.Name = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetEvidenceUserId(v string) *CreateEvidenceRecordscreenRequest {
	s.EvidenceUserId = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetNotaryOffice(v string) *CreateEvidenceRecordscreenRequest {
	s.NotaryOffice = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetWebUrls(v []*EvidenceWebUrlInfo) *CreateEvidenceRecordscreenRequest {
	s.WebUrls = v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetThirdPartyInfo(v *EvidenceThirdPartyInfo) *CreateEvidenceRecordscreenRequest {
	s.ThirdPartyInfo = v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetArea(v string) *CreateEvidenceRecordscreenRequest {
	s.Area = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetMaxTimeInMin(v int64) *CreateEvidenceRecordscreenRequest {
	s.MaxTimeInMin = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetWaitInMin(v int64) *CreateEvidenceRecordscreenRequest {
	s.WaitInMin = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetCallbackUrl(v string) *CreateEvidenceRecordscreenRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateEvidenceRecordscreenRequest) SetClientToken(v string) *CreateEvidenceRecordscreenRequest {
	s.ClientToken = &v
	return s
}

type CreateEvidenceRecordscreenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 录屏取证操作url
	RecordScreenUrl *string `json:"record_screen_url,omitempty" xml:"record_screen_url,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateEvidenceRecordscreenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceRecordscreenResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceRecordscreenResponse) SetReqMsgId(v string) *CreateEvidenceRecordscreenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceRecordscreenResponse) SetResultCode(v string) *CreateEvidenceRecordscreenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceRecordscreenResponse) SetResultMsg(v string) *CreateEvidenceRecordscreenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceRecordscreenResponse) SetRecordScreenUrl(v string) *CreateEvidenceRecordscreenResponse {
	s.RecordScreenUrl = &v
	return s
}

func (s *CreateEvidenceRecordscreenResponse) SetEvidenceId(v string) *CreateEvidenceRecordscreenResponse {
	s.EvidenceId = &v
	return s
}

type CancelTradeUsageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务编号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 业务类型，例如交易检索
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CancelTradeUsageRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelTradeUsageRequest) GoString() string {
	return s.String()
}

func (s *CancelTradeUsageRequest) SetAuthToken(v string) *CancelTradeUsageRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelTradeUsageRequest) SetProductInstanceId(v string) *CancelTradeUsageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelTradeUsageRequest) SetOutBizNo(v string) *CancelTradeUsageRequest {
	s.OutBizNo = &v
	return s
}

func (s *CancelTradeUsageRequest) SetBizType(v string) *CancelTradeUsageRequest {
	s.BizType = &v
	return s
}

func (s *CancelTradeUsageRequest) SetExtInfo(v string) *CancelTradeUsageRequest {
	s.ExtInfo = &v
	return s
}

type CancelTradeUsageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登记Id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CancelTradeUsageResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelTradeUsageResponse) GoString() string {
	return s.String()
}

func (s *CancelTradeUsageResponse) SetReqMsgId(v string) *CancelTradeUsageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelTradeUsageResponse) SetResultCode(v string) *CancelTradeUsageResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelTradeUsageResponse) SetResultMsg(v string) *CancelTradeUsageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelTradeUsageResponse) SetRegisterId(v string) *CancelTradeUsageResponse {
	s.RegisterId = &v
	return s
}

func (s *CancelTradeUsageResponse) SetExtInfo(v string) *CancelTradeUsageResponse {
	s.ExtInfo = &v
	return s
}

type CreateEvidenceLiveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 取证用户id
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty" require:"true"`
	// 取证公证处
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty" require:"true"`
	// 取证平台：2：陌陌4：比心，5：小红书，6：lespark
	ObtainPlatform *int64 `json:"obtain_platform,omitempty" xml:"obtain_platform,omitempty"`
	// 1：PC、2：移动设备
	ObtainDeviceType *string `json:"obtain_device_type,omitempty" xml:"obtain_device_type,omitempty"`
	// 直播取证标题（自定义）
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 预定时间：分钟，建议传值范围5-20分钟
	ExpectedDuration *int64 `json:"expected_duration,omitempty" xml:"expected_duration,omitempty"`
	// json字符串，取证平台动态参数，其参数取决于type，具体参数见
	// 附录
	PlatformDynamicParams *string `json:"platform_dynamic_params,omitempty" xml:"platform_dynamic_params,omitempty"`
	// 取证类型（通用直播取证：DEFAULT）（过期，后续版本逐步删除）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 取证网址信息（过期，后续版本逐步删除）
	WebUrl *EvidenceWebUrlInfo `json:"web_url,omitempty" xml:"web_url,omitempty"`
	// 主播 ID（过期，后续版本逐步删除）
	ProfileId *string `json:"profile_id,omitempty" xml:"profile_id,omitempty"`
	// 1：视频点播，2：视频直播，3：背景音乐（过期，后续版本逐步删除）
	ObtainType *string `json:"obtain_type,omitempty" xml:"obtain_type,omitempty"`
	// 主播名称（过期，后续版本逐步删除）
	AnchorName *string `json:"anchor_name,omitempty" xml:"anchor_name,omitempty"`
	// 直播取证预计开始时间
	ExpectedStartTime *int64 `json:"expected_start_time,omitempty" xml:"expected_start_time,omitempty"`
}

func (s CreateEvidenceLiveRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceLiveRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceLiveRequest) SetAuthToken(v string) *CreateEvidenceLiveRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetProductInstanceId(v string) *CreateEvidenceLiveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetClientToken(v string) *CreateEvidenceLiveRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetEvidenceUserId(v string) *CreateEvidenceLiveRequest {
	s.EvidenceUserId = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetNotaryOffice(v string) *CreateEvidenceLiveRequest {
	s.NotaryOffice = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetObtainPlatform(v int64) *CreateEvidenceLiveRequest {
	s.ObtainPlatform = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetObtainDeviceType(v string) *CreateEvidenceLiveRequest {
	s.ObtainDeviceType = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetTitle(v string) *CreateEvidenceLiveRequest {
	s.Title = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetExpectedDuration(v int64) *CreateEvidenceLiveRequest {
	s.ExpectedDuration = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetPlatformDynamicParams(v string) *CreateEvidenceLiveRequest {
	s.PlatformDynamicParams = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetType(v string) *CreateEvidenceLiveRequest {
	s.Type = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetWebUrl(v *EvidenceWebUrlInfo) *CreateEvidenceLiveRequest {
	s.WebUrl = v
	return s
}

func (s *CreateEvidenceLiveRequest) SetProfileId(v string) *CreateEvidenceLiveRequest {
	s.ProfileId = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetObtainType(v string) *CreateEvidenceLiveRequest {
	s.ObtainType = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetAnchorName(v string) *CreateEvidenceLiveRequest {
	s.AnchorName = &v
	return s
}

func (s *CreateEvidenceLiveRequest) SetExpectedStartTime(v int64) *CreateEvidenceLiveRequest {
	s.ExpectedStartTime = &v
	return s
}

type CreateEvidenceLiveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 直播取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateEvidenceLiveResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceLiveResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceLiveResponse) SetReqMsgId(v string) *CreateEvidenceLiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceLiveResponse) SetResultCode(v string) *CreateEvidenceLiveResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceLiveResponse) SetResultMsg(v string) *CreateEvidenceLiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceLiveResponse) SetEvidenceId(v string) *CreateEvidenceLiveResponse {
	s.EvidenceId = &v
	return s
}

type CreateEvidenceVodRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证用户id
	EvidenceUserId *string `json:"evidence_user_id,omitempty" xml:"evidence_user_id,omitempty" require:"true"`
	// 公证处code
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty" require:"true"`
	// 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 待取证点播网站网址
	WebUrl *EvidenceWebUrlInfo `json:"web_url,omitempty" xml:"web_url,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 取证平台
	ObtainPlatform *int64 `json:"obtain_platform,omitempty" xml:"obtain_platform,omitempty"`
}

func (s CreateEvidenceVodRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceVodRequest) GoString() string {
	return s.String()
}

func (s *CreateEvidenceVodRequest) SetAuthToken(v string) *CreateEvidenceVodRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetProductInstanceId(v string) *CreateEvidenceVodRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetEvidenceUserId(v string) *CreateEvidenceVodRequest {
	s.EvidenceUserId = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetNotaryOffice(v string) *CreateEvidenceVodRequest {
	s.NotaryOffice = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetType(v string) *CreateEvidenceVodRequest {
	s.Type = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetWebUrl(v *EvidenceWebUrlInfo) *CreateEvidenceVodRequest {
	s.WebUrl = v
	return s
}

func (s *CreateEvidenceVodRequest) SetClientToken(v string) *CreateEvidenceVodRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateEvidenceVodRequest) SetObtainPlatform(v int64) *CreateEvidenceVodRequest {
	s.ObtainPlatform = &v
	return s
}

type CreateEvidenceVodResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateEvidenceVodResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEvidenceVodResponse) GoString() string {
	return s.String()
}

func (s *CreateEvidenceVodResponse) SetReqMsgId(v string) *CreateEvidenceVodResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEvidenceVodResponse) SetResultCode(v string) *CreateEvidenceVodResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEvidenceVodResponse) SetResultMsg(v string) *CreateEvidenceVodResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEvidenceVodResponse) SetEvidenceId(v string) *CreateEvidenceVodResponse {
	s.EvidenceId = &v
	return s
}

type GetTradeUsageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务实体ID，例如DCI
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 服务类型
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s GetTradeUsageRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUsageRequest) GoString() string {
	return s.String()
}

func (s *GetTradeUsageRequest) SetAuthToken(v string) *GetTradeUsageRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeUsageRequest) SetProductInstanceId(v string) *GetTradeUsageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeUsageRequest) SetServiceId(v string) *GetTradeUsageRequest {
	s.ServiceId = &v
	return s
}

func (s *GetTradeUsageRequest) SetServiceType(v string) *GetTradeUsageRequest {
	s.ServiceType = &v
	return s
}

func (s *GetTradeUsageRequest) SetExtInfo(v string) *GetTradeUsageRequest {
	s.ExtInfo = &v
	return s
}

type GetTradeUsageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易登记Id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
	// 登记状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s GetTradeUsageResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUsageResponse) GoString() string {
	return s.String()
}

func (s *GetTradeUsageResponse) SetReqMsgId(v string) *GetTradeUsageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeUsageResponse) SetResultCode(v string) *GetTradeUsageResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeUsageResponse) SetResultMsg(v string) *GetTradeUsageResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeUsageResponse) SetRegisterId(v string) *GetTradeUsageResponse {
	s.RegisterId = &v
	return s
}

func (s *GetTradeUsageResponse) SetStatus(v string) *GetTradeUsageResponse {
	s.Status = &v
	return s
}

func (s *GetTradeUsageResponse) SetExtInfo(v string) *GetTradeUsageResponse {
	s.ExtInfo = &v
	return s
}

type GetEvidenceInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 取证编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty" require:"true"`
}

func (s GetEvidenceInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetEvidenceInfoRequest) GoString() string {
	return s.String()
}

func (s *GetEvidenceInfoRequest) SetAuthToken(v string) *GetEvidenceInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetEvidenceInfoRequest) SetProductInstanceId(v string) *GetEvidenceInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetEvidenceInfoRequest) SetEvidenceId(v string) *GetEvidenceInfoRequest {
	s.EvidenceId = &v
	return s
}

type GetEvidenceInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证编号
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
	// 取证类型（LIVE：直播，VOD：点播）
	EvidenceType *string `json:"evidence_type,omitempty" xml:"evidence_type,omitempty"`
	// 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 公证处code
	NotaryOffice *string `json:"notary_office,omitempty" xml:"notary_office,omitempty"`
	// 取证url信息
	EvidenceUrl *EvidenceWebUrlInfo `json:"evidence_url,omitempty" xml:"evidence_url,omitempty"`
	// 取证结果文件下载url（有效期3天）
	EvidenceResultUrl *string `json:"evidence_result_url,omitempty" xml:"evidence_result_url,omitempty"`
	// 存证证明信息
	CertificateInfo *EvidenceCertificateInfo `json:"certificate_info,omitempty" xml:"certificate_info,omitempty"`
	// 取证错误码
	EvidenceErrorCode *string `json:"evidence_error_code,omitempty" xml:"evidence_error_code,omitempty"`
	// 取证错误描述
	EvidenceErrorMsg *string `json:"evidence_error_msg,omitempty" xml:"evidence_error_msg,omitempty"`
	// 取证开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 取证结束时间
	FinishTime *int64 `json:"finish_time,omitempty" xml:"finish_time,omitempty"`
	// 取证动态参数
	PlatformDynamicParams *string `json:"platform_dynamic_params,omitempty" xml:"platform_dynamic_params,omitempty"`
}

func (s GetEvidenceInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetEvidenceInfoResponse) GoString() string {
	return s.String()
}

func (s *GetEvidenceInfoResponse) SetReqMsgId(v string) *GetEvidenceInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetResultCode(v string) *GetEvidenceInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetResultMsg(v string) *GetEvidenceInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceId(v string) *GetEvidenceInfoResponse {
	s.EvidenceId = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceType(v string) *GetEvidenceInfoResponse {
	s.EvidenceType = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetStatus(v string) *GetEvidenceInfoResponse {
	s.Status = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetNotaryOffice(v string) *GetEvidenceInfoResponse {
	s.NotaryOffice = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceUrl(v *EvidenceWebUrlInfo) *GetEvidenceInfoResponse {
	s.EvidenceUrl = v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceResultUrl(v string) *GetEvidenceInfoResponse {
	s.EvidenceResultUrl = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetCertificateInfo(v *EvidenceCertificateInfo) *GetEvidenceInfoResponse {
	s.CertificateInfo = v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceErrorCode(v string) *GetEvidenceInfoResponse {
	s.EvidenceErrorCode = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetEvidenceErrorMsg(v string) *GetEvidenceInfoResponse {
	s.EvidenceErrorMsg = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetStartTime(v int64) *GetEvidenceInfoResponse {
	s.StartTime = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetFinishTime(v int64) *GetEvidenceInfoResponse {
	s.FinishTime = &v
	return s
}

func (s *GetEvidenceInfoResponse) SetPlatformDynamicParams(v string) *GetEvidenceInfoResponse {
	s.PlatformDynamicParams = &v
	return s
}

type ReplaceDciRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty" require:"true"`
	// 作品名称
	WorkName *string `json:"work_name,omitempty" xml:"work_name,omitempty"`
	// 作品类别
	WorkCategory *string `json:"work_category,omitempty" xml:"work_category,omitempty"`
	// 创作信息
	CreationInfo *DciCreationInfo `json:"creation_info,omitempty" xml:"creation_info,omitempty"`
	// 发表信息
	PublicationInfo *DciPublicationInfo `json:"publication_info,omitempty" xml:"publication_info,omitempty"`
	// 申领人id
	DciUserId *string `json:"dci_user_id,omitempty" xml:"dci_user_id,omitempty"`
	// 著作权人
	CopyrightOwnerIds []*string `json:"copyright_owner_ids,omitempty" xml:"copyright_owner_ids,omitempty" type:"Repeated"`
	// 作者姓名
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
	// 作者署名
	AuthorSignature *string `json:"author_signature,omitempty" xml:"author_signature,omitempty"`
	// 权利信息
	RightInfo *DciRightInfo `json:"right_info,omitempty" xml:"right_info,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty"`
}

func (s ReplaceDciRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDciRequest) GoString() string {
	return s.String()
}

func (s *ReplaceDciRequest) SetAuthToken(v string) *ReplaceDciRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceDciRequest) SetProductInstanceId(v string) *ReplaceDciRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceDciRequest) SetDciContentId(v string) *ReplaceDciRequest {
	s.DciContentId = &v
	return s
}

func (s *ReplaceDciRequest) SetWorkName(v string) *ReplaceDciRequest {
	s.WorkName = &v
	return s
}

func (s *ReplaceDciRequest) SetWorkCategory(v string) *ReplaceDciRequest {
	s.WorkCategory = &v
	return s
}

func (s *ReplaceDciRequest) SetCreationInfo(v *DciCreationInfo) *ReplaceDciRequest {
	s.CreationInfo = v
	return s
}

func (s *ReplaceDciRequest) SetPublicationInfo(v *DciPublicationInfo) *ReplaceDciRequest {
	s.PublicationInfo = v
	return s
}

func (s *ReplaceDciRequest) SetDciUserId(v string) *ReplaceDciRequest {
	s.DciUserId = &v
	return s
}

func (s *ReplaceDciRequest) SetCopyrightOwnerIds(v []*string) *ReplaceDciRequest {
	s.CopyrightOwnerIds = v
	return s
}

func (s *ReplaceDciRequest) SetAuthorName(v string) *ReplaceDciRequest {
	s.AuthorName = &v
	return s
}

func (s *ReplaceDciRequest) SetAuthorSignature(v string) *ReplaceDciRequest {
	s.AuthorSignature = &v
	return s
}

func (s *ReplaceDciRequest) SetRightInfo(v *DciRightInfo) *ReplaceDciRequest {
	s.RightInfo = v
	return s
}

func (s *ReplaceDciRequest) SetClientToken(v string) *ReplaceDciRequest {
	s.ClientToken = &v
	return s
}

func (s *ReplaceDciRequest) SetProxyData(v *ProxyData) *ReplaceDciRequest {
	s.ProxyData = v
	return s
}

type ReplaceDciResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 错误信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s ReplaceDciResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDciResponse) GoString() string {
	return s.String()
}

func (s *ReplaceDciResponse) SetReqMsgId(v string) *ReplaceDciResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceDciResponse) SetResultCode(v string) *ReplaceDciResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceDciResponse) SetResultMsg(v string) *ReplaceDciResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReplaceDciResponse) SetErrorMsg(v string) *ReplaceDciResponse {
	s.ErrorMsg = &v
	return s
}

type SubmitDciFeedbackRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务ID
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 联系人
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系电话
	ContactPhoneNumber *string `json:"contact_phone_number,omitempty" xml:"contact_phone_number,omitempty" require:"true"`
	// 申诉原因
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 反馈类型
	FeedbackType *string `json:"feedback_type,omitempty" xml:"feedback_type,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 代理信息
	ProxyData *ProxyData `json:"proxy_data,omitempty" xml:"proxy_data,omitempty"`
}

func (s SubmitDciFeedbackRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDciFeedbackRequest) GoString() string {
	return s.String()
}

func (s *SubmitDciFeedbackRequest) SetAuthToken(v string) *SubmitDciFeedbackRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetProductInstanceId(v string) *SubmitDciFeedbackRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetServiceId(v string) *SubmitDciFeedbackRequest {
	s.ServiceId = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetContactName(v string) *SubmitDciFeedbackRequest {
	s.ContactName = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetContactPhoneNumber(v string) *SubmitDciFeedbackRequest {
	s.ContactPhoneNumber = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetMessage(v string) *SubmitDciFeedbackRequest {
	s.Message = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetClientToken(v string) *SubmitDciFeedbackRequest {
	s.ClientToken = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetFeedbackType(v string) *SubmitDciFeedbackRequest {
	s.FeedbackType = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetEmail(v string) *SubmitDciFeedbackRequest {
	s.Email = &v
	return s
}

func (s *SubmitDciFeedbackRequest) SetProxyData(v *ProxyData) *SubmitDciFeedbackRequest {
	s.ProxyData = v
	return s
}

type SubmitDciFeedbackResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 记录ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s SubmitDciFeedbackResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDciFeedbackResponse) GoString() string {
	return s.String()
}

func (s *SubmitDciFeedbackResponse) SetReqMsgId(v string) *SubmitDciFeedbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDciFeedbackResponse) SetResultCode(v string) *SubmitDciFeedbackResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDciFeedbackResponse) SetResultMsg(v string) *SubmitDciFeedbackResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitDciFeedbackResponse) SetId(v string) *SubmitDciFeedbackResponse {
	s.Id = &v
	return s
}

type QueryDciFeedbackRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 申诉ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s QueryDciFeedbackRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDciFeedbackRequest) GoString() string {
	return s.String()
}

func (s *QueryDciFeedbackRequest) SetAuthToken(v string) *QueryDciFeedbackRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDciFeedbackRequest) SetProductInstanceId(v string) *QueryDciFeedbackRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDciFeedbackRequest) SetId(v string) *QueryDciFeedbackRequest {
	s.Id = &v
	return s
}

type QueryDciFeedbackResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申诉状态
	FeedbackStatus *string `json:"feedback_status,omitempty" xml:"feedback_status,omitempty"`
	// dciID
	DciContentId *string `json:"dci_content_id,omitempty" xml:"dci_content_id,omitempty"`
	// 备注或失败原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryDciFeedbackResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDciFeedbackResponse) GoString() string {
	return s.String()
}

func (s *QueryDciFeedbackResponse) SetReqMsgId(v string) *QueryDciFeedbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDciFeedbackResponse) SetResultCode(v string) *QueryDciFeedbackResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDciFeedbackResponse) SetResultMsg(v string) *QueryDciFeedbackResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDciFeedbackResponse) SetFeedbackStatus(v string) *QueryDciFeedbackResponse {
	s.FeedbackStatus = &v
	return s
}

func (s *QueryDciFeedbackResponse) SetDciContentId(v string) *QueryDciFeedbackResponse {
	s.DciContentId = &v
	return s
}

func (s *QueryDciFeedbackResponse) SetMsg(v string) *QueryDciFeedbackResponse {
	s.Msg = &v
	return s
}

type ExecTradeCoverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方唯一业务标识
	OutBizNo *int64 `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 需要抽取封面的文件url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
}

func (s ExecTradeCoverRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecTradeCoverRequest) GoString() string {
	return s.String()
}

func (s *ExecTradeCoverRequest) SetAuthToken(v string) *ExecTradeCoverRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecTradeCoverRequest) SetProductInstanceId(v string) *ExecTradeCoverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecTradeCoverRequest) SetOutBizNo(v int64) *ExecTradeCoverRequest {
	s.OutBizNo = &v
	return s
}

func (s *ExecTradeCoverRequest) SetFileUrl(v string) *ExecTradeCoverRequest {
	s.FileUrl = &v
	return s
}

type ExecTradeCoverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用方唯一业务标识
	OutBizNo *int64 `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s ExecTradeCoverResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecTradeCoverResponse) GoString() string {
	return s.String()
}

func (s *ExecTradeCoverResponse) SetReqMsgId(v string) *ExecTradeCoverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecTradeCoverResponse) SetResultCode(v string) *ExecTradeCoverResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecTradeCoverResponse) SetResultMsg(v string) *ExecTradeCoverResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecTradeCoverResponse) SetOutBizNo(v int64) *ExecTradeCoverResponse {
	s.OutBizNo = &v
	return s
}

func (s *ExecTradeCoverResponse) SetExtInfo(v string) *ExecTradeCoverResponse {
	s.ExtInfo = &v
	return s
}

type CreateOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等字段
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 幂等id【标废弃， 幂等id已client_token为准】
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 发票信息
	InvoiceInfo *InvoiceInfo `json:"invoice_info,omitempty" xml:"invoice_info,omitempty" require:"true"`
	// 订单明细列表
	OrderItem []*OrderItem `json:"order_item,omitempty" xml:"order_item,omitempty" require:"true" type:"Repeated"`
}

func (s CreateOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderRequest) GoString() string {
	return s.String()
}

func (s *CreateOrderRequest) SetAuthToken(v string) *CreateOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOrderRequest) SetProductInstanceId(v string) *CreateOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateOrderRequest) SetClientToken(v string) *CreateOrderRequest {
	s.ClientToken = &v
	return s
}

func (s *CreateOrderRequest) SetRequestId(v string) *CreateOrderRequest {
	s.RequestId = &v
	return s
}

func (s *CreateOrderRequest) SetInvoiceInfo(v *InvoiceInfo) *CreateOrderRequest {
	s.InvoiceInfo = v
	return s
}

func (s *CreateOrderRequest) SetOrderItem(v []*OrderItem) *CreateOrderRequest {
	s.OrderItem = v
	return s
}

type CreateOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用于查询支付链接
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 创建订单失败
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s CreateOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderResponse) GoString() string {
	return s.String()
}

func (s *CreateOrderResponse) SetReqMsgId(v string) *CreateOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOrderResponse) SetResultCode(v string) *CreateOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOrderResponse) SetResultMsg(v string) *CreateOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOrderResponse) SetOrderId(v string) *CreateOrderResponse {
	s.OrderId = &v
	return s
}

func (s *CreateOrderResponse) SetErrorMsg(v string) *CreateOrderResponse {
	s.ErrorMsg = &v
	return s
}

type QueryOrderPayurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryOrderPayurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderPayurlRequest) GoString() string {
	return s.String()
}

func (s *QueryOrderPayurlRequest) SetAuthToken(v string) *QueryOrderPayurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOrderPayurlRequest) SetProductInstanceId(v string) *QueryOrderPayurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOrderPayurlRequest) SetOrderId(v string) *QueryOrderPayurlRequest {
	s.OrderId = &v
	return s
}

type QueryOrderPayurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付链接
	PayUrl *string `json:"pay_url,omitempty" xml:"pay_url,omitempty"`
	// 查询支付链接失败
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
}

func (s QueryOrderPayurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderPayurlResponse) GoString() string {
	return s.String()
}

func (s *QueryOrderPayurlResponse) SetReqMsgId(v string) *QueryOrderPayurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOrderPayurlResponse) SetResultCode(v string) *QueryOrderPayurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOrderPayurlResponse) SetResultMsg(v string) *QueryOrderPayurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOrderPayurlResponse) SetPayUrl(v string) *QueryOrderPayurlResponse {
	s.PayUrl = &v
	return s
}

func (s *QueryOrderPayurlResponse) SetErrorMsg(v string) *QueryOrderPayurlResponse {
	s.ErrorMsg = &v
	return s
}

type FinishDciRegistrationcertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 登记号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty" require:"true"`
	// 数登证书地址
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 数登样本地址
	SampleUrl *string `json:"sample_url,omitempty" xml:"sample_url,omitempty"`
	// 客户端幂等token
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 登记时间
	RegistrationTime *string `json:"registration_time,omitempty" xml:"registration_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s FinishDciRegistrationcertRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishDciRegistrationcertRequest) GoString() string {
	return s.String()
}

func (s *FinishDciRegistrationcertRequest) SetAuthToken(v string) *FinishDciRegistrationcertRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetProductInstanceId(v string) *FinishDciRegistrationcertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetTaskId(v string) *FinishDciRegistrationcertRequest {
	s.TaskId = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetRegNumber(v string) *FinishDciRegistrationcertRequest {
	s.RegNumber = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetCertificateUrl(v string) *FinishDciRegistrationcertRequest {
	s.CertificateUrl = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetSampleUrl(v string) *FinishDciRegistrationcertRequest {
	s.SampleUrl = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetClientToken(v string) *FinishDciRegistrationcertRequest {
	s.ClientToken = &v
	return s
}

func (s *FinishDciRegistrationcertRequest) SetRegistrationTime(v string) *FinishDciRegistrationcertRequest {
	s.RegistrationTime = &v
	return s
}

type FinishDciRegistrationcertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishDciRegistrationcertResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishDciRegistrationcertResponse) GoString() string {
	return s.String()
}

func (s *FinishDciRegistrationcertResponse) SetReqMsgId(v string) *FinishDciRegistrationcertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishDciRegistrationcertResponse) SetResultCode(v string) *FinishDciRegistrationcertResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishDciRegistrationcertResponse) SetResultMsg(v string) *FinishDciRegistrationcertResponse {
	s.ResultMsg = &v
	return s
}

type CancelDciRegistrationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登申请id
	DigitalRegisterId *string `json:"digital_register_id,omitempty" xml:"digital_register_id,omitempty"`
	// 幂等id
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true"`
	// 1111111
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s CancelDciRegistrationRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelDciRegistrationRequest) GoString() string {
	return s.String()
}

func (s *CancelDciRegistrationRequest) SetAuthToken(v string) *CancelDciRegistrationRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelDciRegistrationRequest) SetProductInstanceId(v string) *CancelDciRegistrationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelDciRegistrationRequest) SetDigitalRegisterId(v string) *CancelDciRegistrationRequest {
	s.DigitalRegisterId = &v
	return s
}

func (s *CancelDciRegistrationRequest) SetClientToken(v string) *CancelDciRegistrationRequest {
	s.ClientToken = &v
	return s
}

func (s *CancelDciRegistrationRequest) SetOrderId(v string) *CancelDciRegistrationRequest {
	s.OrderId = &v
	return s
}

type CancelDciRegistrationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelDciRegistrationResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelDciRegistrationResponse) GoString() string {
	return s.String()
}

func (s *CancelDciRegistrationResponse) SetReqMsgId(v string) *CancelDciRegistrationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelDciRegistrationResponse) SetResultCode(v string) *CancelDciRegistrationResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelDciRegistrationResponse) SetResultMsg(v string) *CancelDciRegistrationResponse {
	s.ResultMsg = &v
	return s
}

type CreateScreenshotNewRequest struct {
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
	// 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty"`
	// 代理信息
	ProxyInfo *ProxyData `json:"proxy_info,omitempty" xml:"proxy_info,omitempty"`
	// 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s CreateScreenshotNewRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateScreenshotNewRequest) GoString() string {
	return s.String()
}

func (s *CreateScreenshotNewRequest) SetAuthToken(v string) *CreateScreenshotNewRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetProductInstanceId(v string) *CreateScreenshotNewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetName(v string) *CreateScreenshotNewRequest {
	s.Name = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetMemo(v string) *CreateScreenshotNewRequest {
	s.Memo = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetUrl(v string) *CreateScreenshotNewRequest {
	s.Url = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetOrgId(v string) *CreateScreenshotNewRequest {
	s.OrgId = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetCertName(v string) *CreateScreenshotNewRequest {
	s.CertName = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetCertNo(v string) *CreateScreenshotNewRequest {
	s.CertNo = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetCertType(v string) *CreateScreenshotNewRequest {
	s.CertType = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetLegalPersonName(v string) *CreateScreenshotNewRequest {
	s.LegalPersonName = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetLegalPersonNo(v string) *CreateScreenshotNewRequest {
	s.LegalPersonNo = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetLegalPersonType(v string) *CreateScreenshotNewRequest {
	s.LegalPersonType = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetAgentName(v string) *CreateScreenshotNewRequest {
	s.AgentName = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetAgentNo(v string) *CreateScreenshotNewRequest {
	s.AgentNo = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetPhoneNum(v string) *CreateScreenshotNewRequest {
	s.PhoneNum = &v
	return s
}

func (s *CreateScreenshotNewRequest) SetProxyInfo(v *ProxyData) *CreateScreenshotNewRequest {
	s.ProxyInfo = v
	return s
}

func (s *CreateScreenshotNewRequest) SetClientToken(v string) *CreateScreenshotNewRequest {
	s.ClientToken = &v
	return s
}

type CreateScreenshotNewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取证id
	EvidenceId *string `json:"evidence_id,omitempty" xml:"evidence_id,omitempty"`
}

func (s CreateScreenshotNewResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateScreenshotNewResponse) GoString() string {
	return s.String()
}

func (s *CreateScreenshotNewResponse) SetReqMsgId(v string) *CreateScreenshotNewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateScreenshotNewResponse) SetResultCode(v string) *CreateScreenshotNewResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateScreenshotNewResponse) SetResultMsg(v string) *CreateScreenshotNewResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateScreenshotNewResponse) SetEvidenceId(v string) *CreateScreenshotNewResponse {
	s.EvidenceId = &v
	return s
}

type CreateCyclinginsuranceServiceorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 来源场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 请求唯一id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 调用方应用名
	CallerAppName *string `json:"caller_app_name,omitempty" xml:"caller_app_name,omitempty" require:"true"`
	// 业务id，用于幂等
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 下单账号
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 商品码
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 商品属性
	// serviceStartTime:服务开始时间
	// serviceEndTime:服务结束时间
	// tenantAddress:上门地址
	// tenantPhone:租赁人电话
	// tenantName:租赁人姓名
	// insurancePolicyId:保险单号
	// batteryType:电池型号
	// 示例
	// {
	// "serviceEndTime": "2025-05-16 10:00:00",
	//  "serviceStartTime" : "2025-05-16 11:00:00",
	//   "tenantPhone": "15888888885",
	//   "tenantName": "张三",
	//   "insurancePolicyId":"test123",
	//   "serviceLocationType":"DOOR_TO_DOOR"
	//    "batteryType": "abc480v",
	//    "tenantAddressProvince":"浙江省",
	//    "tenantAddressCity": "杭州市",
	//    "tenantAddressDistrict": "西湖区",
	//    "tenantAddressDetail": "xx街道"
	// }
	ItemAttributes *string `json:"item_attributes,omitempty" xml:"item_attributes,omitempty" require:"true"`
}

func (s CreateCyclinginsuranceServiceorderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCyclinginsuranceServiceorderRequest) GoString() string {
	return s.String()
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetAuthToken(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetProductInstanceId(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetScene(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.Scene = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetRequestId(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.RequestId = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetCallerAppName(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.CallerAppName = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetBizId(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.BizId = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetAccountId(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.AccountId = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetItemCode(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.ItemCode = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderRequest) SetItemAttributes(v string) *CreateCyclinginsuranceServiceorderRequest {
	s.ItemAttributes = &v
	return s
}

type CreateCyclinginsuranceServiceorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s CreateCyclinginsuranceServiceorderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCyclinginsuranceServiceorderResponse) GoString() string {
	return s.String()
}

func (s *CreateCyclinginsuranceServiceorderResponse) SetReqMsgId(v string) *CreateCyclinginsuranceServiceorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderResponse) SetResultCode(v string) *CreateCyclinginsuranceServiceorderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderResponse) SetResultMsg(v string) *CreateCyclinginsuranceServiceorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCyclinginsuranceServiceorderResponse) SetOrderId(v string) *CreateCyclinginsuranceServiceorderResponse {
	s.OrderId = &v
	return s
}

type QueryCyclinginsuranceServiceinventoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 请求id，用于链路追踪，如uuid
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 调用方
	CallerAppName *string `json:"caller_app_name,omitempty" xml:"caller_app_name,omitempty" require:"true"`
	// 服务商账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 商品code
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 商品属性
	// tenantAddressProvince: 上门地址所在省
	// tenantAddressCity：上门地址所在市
	// insurancePolicyId:保险单号
	ItemAttributes *string `json:"item_attributes,omitempty" xml:"item_attributes,omitempty" require:"true"`
}

func (s QueryCyclinginsuranceServiceinventoryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCyclinginsuranceServiceinventoryRequest) GoString() string {
	return s.String()
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetAuthToken(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetProductInstanceId(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetScene(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.Scene = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetRequestId(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.RequestId = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetCallerAppName(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.CallerAppName = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetAccountId(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.AccountId = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetItemCode(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.ItemCode = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryRequest) SetItemAttributes(v string) *QueryCyclinginsuranceServiceinventoryRequest {
	s.ItemAttributes = &v
	return s
}

type QueryCyclinginsuranceServiceinventoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品库存列表
	ItemInventorys []*ItemInventoryVO `json:"item_inventorys,omitempty" xml:"item_inventorys,omitempty" type:"Repeated"`
}

func (s QueryCyclinginsuranceServiceinventoryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCyclinginsuranceServiceinventoryResponse) GoString() string {
	return s.String()
}

func (s *QueryCyclinginsuranceServiceinventoryResponse) SetReqMsgId(v string) *QueryCyclinginsuranceServiceinventoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryResponse) SetResultCode(v string) *QueryCyclinginsuranceServiceinventoryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryResponse) SetResultMsg(v string) *QueryCyclinginsuranceServiceinventoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCyclinginsuranceServiceinventoryResponse) SetItemInventorys(v []*ItemInventoryVO) *QueryCyclinginsuranceServiceinventoryResponse {
	s.ItemInventorys = v
	return s
}

type QueryCyclinginsuranceOrderdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 请求方应用名
	CallerAppName *string `json:"caller_app_name,omitempty" xml:"caller_app_name,omitempty" require:"true"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s QueryCyclinginsuranceOrderdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCyclinginsuranceOrderdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetAuthToken(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetProductInstanceId(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetScene(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.Scene = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetRequestId(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.RequestId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetCallerAppName(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.CallerAppName = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetOrderId(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.OrderId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailRequest) SetAccountId(v string) *QueryCyclinginsuranceOrderdetailRequest {
	s.AccountId = &v
	return s
}

type QueryCyclinginsuranceOrderdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单账号
	AcoountId *string `json:"acoount_id,omitempty" xml:"acoount_id,omitempty"`
	// 商品码
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty"`
	// 商品属性
	// serviceStartTime:服务开始时间
	// serviceEndTime:服务结束时间
	// tenantAddress:上门地址
	// tenantPhone:租赁人电话
	// insurancePolicyId:保险单号
	// batteryType:电池型号
	ItemAttributes *string `json:"item_attributes,omitempty" xml:"item_attributes,omitempty"`
	// 订单履约流程信息
	// workerName:上门师傅姓名
	// workerPhone:上门师傅电话
	// batteryCode:电池码
	// batteryPackagingCode:电池外包装码
	// batteryGroupCode:电池组码
	FulfillmentProcessInfo *string `json:"fulfillment_process_info,omitempty" xml:"fulfillment_process_info,omitempty"`
	// 附件
	// installImages: 上门安装图片
	Attachments *string `json:"attachments,omitempty" xml:"attachments,omitempty"`
	// waitDoorToDoor 待配送
	// doorToDoorFinish 已完成
	// doorToDoorCancel 已取消
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
}

func (s QueryCyclinginsuranceOrderdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCyclinginsuranceOrderdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetReqMsgId(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetResultCode(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetResultMsg(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetOrderId(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.OrderId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetAcoountId(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.AcoountId = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetItemCode(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.ItemCode = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetItemAttributes(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.ItemAttributes = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetFulfillmentProcessInfo(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.FulfillmentProcessInfo = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetAttachments(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.Attachments = &v
	return s
}

func (s *QueryCyclinginsuranceOrderdetailResponse) SetOrderStatus(v string) *QueryCyclinginsuranceOrderdetailResponse {
	s.OrderStatus = &v
	return s
}

type CancelCyclinginsuranceServiceorderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求唯一Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 来源场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 调用应用名
	CallerAppName *string `json:"caller_app_name,omitempty" xml:"caller_app_name,omitempty" require:"true"`
	// 外部业务id，用于幂等
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s CancelCyclinginsuranceServiceorderRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelCyclinginsuranceServiceorderRequest) GoString() string {
	return s.String()
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetAuthToken(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetProductInstanceId(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetRequestId(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.RequestId = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetScene(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.Scene = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetCallerAppName(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.CallerAppName = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetBizId(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.BizId = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetOrderId(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.OrderId = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderRequest) SetAccountId(v string) *CancelCyclinginsuranceServiceorderRequest {
	s.AccountId = &v
	return s
}

type CancelCyclinginsuranceServiceorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单取消是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CancelCyclinginsuranceServiceorderResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelCyclinginsuranceServiceorderResponse) GoString() string {
	return s.String()
}

func (s *CancelCyclinginsuranceServiceorderResponse) SetReqMsgId(v string) *CancelCyclinginsuranceServiceorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderResponse) SetResultCode(v string) *CancelCyclinginsuranceServiceorderResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderResponse) SetResultMsg(v string) *CancelCyclinginsuranceServiceorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelCyclinginsuranceServiceorderResponse) SetSuccess(v bool) *CancelCyclinginsuranceServiceorderResponse {
	s.Success = &v
	return s
}

type NotifyCyclinginsuranceMidchangeserviceorderauditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求唯一Id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 来源场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 调用应用名
	CallerAppName *string `json:"caller_app_name,omitempty" xml:"caller_app_name,omitempty" require:"true"`
	// 外部业务id，用于幂等
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 账号id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 审核是否通过
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s NotifyCyclinginsuranceMidchangeserviceorderauditRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyCyclinginsuranceMidchangeserviceorderauditRequest) GoString() string {
	return s.String()
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetAuthToken(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetProductInstanceId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetRequestId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.RequestId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetScene(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.Scene = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetCallerAppName(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.CallerAppName = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetBizId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.BizId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetOrderId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.OrderId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetAccountId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.AccountId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) SetSuccess(v bool) *NotifyCyclinginsuranceMidchangeserviceorderauditRequest {
	s.Success = &v
	return s
}

type NotifyCyclinginsuranceMidchangeserviceorderauditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s NotifyCyclinginsuranceMidchangeserviceorderauditResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyCyclinginsuranceMidchangeserviceorderauditResponse) GoString() string {
	return s.String()
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditResponse) SetReqMsgId(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditResponse) SetResultCode(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditResponse) SetResultMsg(v string) *NotifyCyclinginsuranceMidchangeserviceorderauditResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyCyclinginsuranceMidchangeserviceorderauditResponse) SetSuccess(v bool) *NotifyCyclinginsuranceMidchangeserviceorderauditResponse {
	s.Success = &v
	return s
}

type SubmitDigregPreliminaryreviewRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登初审
	DigRegId *string `json:"dig_reg_id,omitempty" xml:"dig_reg_id,omitempty" require:"true"`
	// 审核状态
	AuditStatus *string `json:"audit_status,omitempty" xml:"audit_status,omitempty" require:"true"`
	// 审核结果
	AuditResult *bool `json:"audit_result,omitempty" xml:"audit_result,omitempty" require:"true"`
}

func (s SubmitDigregPreliminaryreviewRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDigregPreliminaryreviewRequest) GoString() string {
	return s.String()
}

func (s *SubmitDigregPreliminaryreviewRequest) SetAuthToken(v string) *SubmitDigregPreliminaryreviewRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewRequest) SetProductInstanceId(v string) *SubmitDigregPreliminaryreviewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewRequest) SetDigRegId(v string) *SubmitDigregPreliminaryreviewRequest {
	s.DigRegId = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewRequest) SetAuditStatus(v string) *SubmitDigregPreliminaryreviewRequest {
	s.AuditStatus = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewRequest) SetAuditResult(v bool) *SubmitDigregPreliminaryreviewRequest {
	s.AuditResult = &v
	return s
}

type SubmitDigregPreliminaryreviewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitDigregPreliminaryreviewResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDigregPreliminaryreviewResponse) GoString() string {
	return s.String()
}

func (s *SubmitDigregPreliminaryreviewResponse) SetReqMsgId(v string) *SubmitDigregPreliminaryreviewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewResponse) SetResultCode(v string) *SubmitDigregPreliminaryreviewResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDigregPreliminaryreviewResponse) SetResultMsg(v string) *SubmitDigregPreliminaryreviewResponse {
	s.ResultMsg = &v
	return s
}

type SubmitDigregReviewRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数登ID
	DigRegId *string `json:"dig_reg_id,omitempty" xml:"dig_reg_id,omitempty" require:"true"`
	// 复审结果：
	// REPLACE_DCI（复审不通过，补正需要替换DCI作品）
	// NO_NEED_REPLACE_DCI（复审不通过，补正不需要替换DCI作品）
	// PASS（复审通过）
	AuditResult *string `json:"audit_result,omitempty" xml:"audit_result,omitempty" require:"true"`
}

func (s SubmitDigregReviewRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitDigregReviewRequest) GoString() string {
	return s.String()
}

func (s *SubmitDigregReviewRequest) SetAuthToken(v string) *SubmitDigregReviewRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitDigregReviewRequest) SetProductInstanceId(v string) *SubmitDigregReviewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitDigregReviewRequest) SetDigRegId(v string) *SubmitDigregReviewRequest {
	s.DigRegId = &v
	return s
}

func (s *SubmitDigregReviewRequest) SetAuditResult(v string) *SubmitDigregReviewRequest {
	s.AuditResult = &v
	return s
}

type SubmitDigregReviewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitDigregReviewResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitDigregReviewResponse) GoString() string {
	return s.String()
}

func (s *SubmitDigregReviewResponse) SetReqMsgId(v string) *SubmitDigregReviewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitDigregReviewResponse) SetResultCode(v string) *SubmitDigregReviewResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitDigregReviewResponse) SetResultMsg(v string) *SubmitDigregReviewResponse {
	s.ResultMsg = &v
	return s
}

type AddContentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 内容标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 文件类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 内容标签列表
	Keywords []*string `json:"keywords,omitempty" xml:"keywords,omitempty" type:"Repeated"`
	// 内容描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 内容封面文件id
	CoverFileId *string `json:"cover_file_id,omitempty" xml:"cover_file_id,omitempty"`
	// 播放列表实体：包括名称和各种授权维权信息
	PlayListEntity *PlayListEntity `json:"play_list_entity,omitempty" xml:"play_list_entity,omitempty" require:"true"`
	// 客户端token，幂等号，用来保证并发请求幂等性
	ClientToken *string `json:"client_token,omitempty" xml:"client_token,omitempty"`
}

func (s AddContentRequest) String() string {
	return tea.Prettify(s)
}

func (s AddContentRequest) GoString() string {
	return s.String()
}

func (s *AddContentRequest) SetAuthToken(v string) *AddContentRequest {
	s.AuthToken = &v
	return s
}

func (s *AddContentRequest) SetProductInstanceId(v string) *AddContentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddContentRequest) SetFileId(v string) *AddContentRequest {
	s.FileId = &v
	return s
}

func (s *AddContentRequest) SetTitle(v string) *AddContentRequest {
	s.Title = &v
	return s
}

func (s *AddContentRequest) SetType(v string) *AddContentRequest {
	s.Type = &v
	return s
}

func (s *AddContentRequest) SetKeywords(v []*string) *AddContentRequest {
	s.Keywords = v
	return s
}

func (s *AddContentRequest) SetDescription(v string) *AddContentRequest {
	s.Description = &v
	return s
}

func (s *AddContentRequest) SetCoverFileId(v string) *AddContentRequest {
	s.CoverFileId = &v
	return s
}

func (s *AddContentRequest) SetPlayListEntity(v *PlayListEntity) *AddContentRequest {
	s.PlayListEntity = v
	return s
}

func (s *AddContentRequest) SetClientToken(v string) *AddContentRequest {
	s.ClientToken = &v
	return s
}

type AddContentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
}

func (s AddContentResponse) String() string {
	return tea.Prettify(s)
}

func (s AddContentResponse) GoString() string {
	return s.String()
}

func (s *AddContentResponse) SetReqMsgId(v string) *AddContentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddContentResponse) SetResultCode(v string) *AddContentResponse {
	s.ResultCode = &v
	return s
}

func (s *AddContentResponse) SetResultMsg(v string) *AddContentResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddContentResponse) SetContentId(v string) *AddContentResponse {
	s.ContentId = &v
	return s
}

type QueryContentStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
}

func (s QueryContentStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContentStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryContentStatusRequest) SetAuthToken(v string) *QueryContentStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContentStatusRequest) SetProductInstanceId(v string) *QueryContentStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContentStatusRequest) SetContentId(v string) *QueryContentStatusRequest {
	s.ContentId = &v
	return s
}

type QueryContentStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频内容id
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// 视频状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 内容标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 内容类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 标签列表
	Keywords []*string `json:"keywords,omitempty" xml:"keywords,omitempty" type:"Repeated"`
	// 内容描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 内容封面文件地址
	CoverUrl *string `json:"cover_url,omitempty" xml:"cover_url,omitempty"`
	// 存证id
	RegisterId *string `json:"register_id,omitempty" xml:"register_id,omitempty"`
	// 内容授权合同文件地址
	AuthPdfUrl *string `json:"auth_pdf_url,omitempty" xml:"auth_pdf_url,omitempty"`
	// 播放列表名称
	PlayListName *string `json:"play_list_name,omitempty" xml:"play_list_name,omitempty"`
}

func (s QueryContentStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContentStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryContentStatusResponse) SetReqMsgId(v string) *QueryContentStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContentStatusResponse) SetResultCode(v string) *QueryContentStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContentStatusResponse) SetResultMsg(v string) *QueryContentStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContentStatusResponse) SetContentId(v string) *QueryContentStatusResponse {
	s.ContentId = &v
	return s
}

func (s *QueryContentStatusResponse) SetStatus(v string) *QueryContentStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryContentStatusResponse) SetTitle(v string) *QueryContentStatusResponse {
	s.Title = &v
	return s
}

func (s *QueryContentStatusResponse) SetType(v string) *QueryContentStatusResponse {
	s.Type = &v
	return s
}

func (s *QueryContentStatusResponse) SetKeywords(v []*string) *QueryContentStatusResponse {
	s.Keywords = v
	return s
}

func (s *QueryContentStatusResponse) SetDescription(v string) *QueryContentStatusResponse {
	s.Description = &v
	return s
}

func (s *QueryContentStatusResponse) SetCoverUrl(v string) *QueryContentStatusResponse {
	s.CoverUrl = &v
	return s
}

func (s *QueryContentStatusResponse) SetRegisterId(v string) *QueryContentStatusResponse {
	s.RegisterId = &v
	return s
}

func (s *QueryContentStatusResponse) SetAuthPdfUrl(v string) *QueryContentStatusResponse {
	s.AuthPdfUrl = &v
	return s
}

func (s *QueryContentStatusResponse) SetPlayListName(v string) *QueryContentStatusResponse {
	s.PlayListName = &v
	return s
}

type QueryContentStatisticsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 内容id列表
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 起始日期时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 截止日期时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s QueryContentStatisticsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContentStatisticsRequest) GoString() string {
	return s.String()
}

func (s *QueryContentStatisticsRequest) SetAuthToken(v string) *QueryContentStatisticsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContentStatisticsRequest) SetProductInstanceId(v string) *QueryContentStatisticsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContentStatisticsRequest) SetContentId(v string) *QueryContentStatisticsRequest {
	s.ContentId = &v
	return s
}

func (s *QueryContentStatisticsRequest) SetStartTime(v int64) *QueryContentStatisticsRequest {
	s.StartTime = &v
	return s
}

func (s *QueryContentStatisticsRequest) SetEndTime(v int64) *QueryContentStatisticsRequest {
	s.EndTime = &v
	return s
}

type QueryContentStatisticsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总观看次数
	TotalViews *string `json:"total_views,omitempty" xml:"total_views,omitempty"`
	// 总观看时长
	TotalViewDuration *string `json:"total_view_duration,omitempty" xml:"total_view_duration,omitempty"`
	// 总平均观看时长
	TotalAverageViewDuration *string `json:"total_average_view_duration,omitempty" xml:"total_average_view_duration,omitempty"`
	// 总预计收入
	TotalRevenue *string `json:"total_revenue,omitempty" xml:"total_revenue,omitempty"`
	// 每日详细统计列表
	DayStatisticsList []*DayStatisticsInfo `json:"day_statistics_list,omitempty" xml:"day_statistics_list,omitempty" type:"Repeated"`
}

func (s QueryContentStatisticsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContentStatisticsResponse) GoString() string {
	return s.String()
}

func (s *QueryContentStatisticsResponse) SetReqMsgId(v string) *QueryContentStatisticsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetResultCode(v string) *QueryContentStatisticsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetResultMsg(v string) *QueryContentStatisticsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetTotalViews(v string) *QueryContentStatisticsResponse {
	s.TotalViews = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetTotalViewDuration(v string) *QueryContentStatisticsResponse {
	s.TotalViewDuration = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetTotalAverageViewDuration(v string) *QueryContentStatisticsResponse {
	s.TotalAverageViewDuration = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetTotalRevenue(v string) *QueryContentStatisticsResponse {
	s.TotalRevenue = &v
	return s
}

func (s *QueryContentStatisticsResponse) SetDayStatisticsList(v []*DayStatisticsInfo) *QueryContentStatisticsResponse {
	s.DayStatisticsList = v
	return s
}

type QueryContentBatchstatisticsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 内容id列表
	ContentIdList []*string `json:"content_id_list,omitempty" xml:"content_id_list,omitempty" require:"true" type:"Repeated"`
	// 起始日期时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 截止日期时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s QueryContentBatchstatisticsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContentBatchstatisticsRequest) GoString() string {
	return s.String()
}

func (s *QueryContentBatchstatisticsRequest) SetAuthToken(v string) *QueryContentBatchstatisticsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContentBatchstatisticsRequest) SetProductInstanceId(v string) *QueryContentBatchstatisticsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContentBatchstatisticsRequest) SetContentIdList(v []*string) *QueryContentBatchstatisticsRequest {
	s.ContentIdList = v
	return s
}

func (s *QueryContentBatchstatisticsRequest) SetStartTime(v int64) *QueryContentBatchstatisticsRequest {
	s.StartTime = &v
	return s
}

func (s *QueryContentBatchstatisticsRequest) SetEndTime(v int64) *QueryContentBatchstatisticsRequest {
	s.EndTime = &v
	return s
}

type QueryContentBatchstatisticsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出海视频统计数据列表
	OverseaContentStatisticsList []*OverseaContentStatistics `json:"oversea_content_statistics_list,omitempty" xml:"oversea_content_statistics_list,omitempty" type:"Repeated"`
}

func (s QueryContentBatchstatisticsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContentBatchstatisticsResponse) GoString() string {
	return s.String()
}

func (s *QueryContentBatchstatisticsResponse) SetReqMsgId(v string) *QueryContentBatchstatisticsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContentBatchstatisticsResponse) SetResultCode(v string) *QueryContentBatchstatisticsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContentBatchstatisticsResponse) SetResultMsg(v string) *QueryContentBatchstatisticsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContentBatchstatisticsResponse) SetOverseaContentStatisticsList(v []*OverseaContentStatistics) *QueryContentBatchstatisticsResponse {
	s.OverseaContentStatisticsList = v
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
				"sdk_version":      tea.String("1.19.76"),
				"_prod_code":       tea.String("BCCR"),
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
 * Description: 更新dci账号信息
 * Summary: 更新dci账号信息
 */
func (client *Client) UpdateDciUser(request *UpdateDciUserRequest) (_result *UpdateDciUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDciUserResponse{}
	_body, _err := client.UpdateDciUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新dci账号信息
 * Summary: 更新dci账号信息
 */
func (client *Client) UpdateDciUserEx(request *UpdateDciUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDciUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDciUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.user.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起数登申请
 * Summary: 发起数登申请
 */
func (client *Client) CreateDciRegistration(request *CreateDciRegistrationRequest) (_result *CreateDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDciRegistrationResponse{}
	_body, _err := client.CreateDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起数登申请
 * Summary: 发起数登申请
 */
func (client *Client) CreateDciRegistrationEx(request *CreateDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryDciRegistrationsubmit(request *QueryDciRegistrationsubmitRequest) (_result *QueryDciRegistrationsubmitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciRegistrationsubmitResponse{}
	_body, _err := client.QueryDciRegistrationsubmitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryDciRegistrationsubmitEx(request *QueryDciRegistrationsubmitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciRegistrationsubmitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciRegistrationsubmitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationsubmit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数登结果
 * Summary: 查询数登结果
 */
func (client *Client) QueryDciRegistration(request *QueryDciRegistrationRequest) (_result *QueryDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciRegistrationResponse{}
	_body, _err := client.QueryDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数登结果
 * Summary: 查询数登结果
 */
func (client *Client) QueryDciRegistrationEx(request *QueryDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取数登证书下载链接
 * Summary: 获取数登证书下载链接
 */
func (client *Client) GetDciRegistrationcert(request *GetDciRegistrationcertRequest) (_result *GetDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDciRegistrationcertResponse{}
	_body, _err := client.GetDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取数登证书下载链接
 * Summary: 获取数登证书下载链接
 */
func (client *Client) GetDciRegistrationcertEx(request *GetDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询内容安全审核详情
 * Summary: 查询内容安全审核详情
 */
func (client *Client) QueryDciContentsecurity(request *QueryDciContentsecurityRequest) (_result *QueryDciContentsecurityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciContentsecurityResponse{}
	_body, _err := client.QueryDciContentsecurityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询内容安全审核详情
 * Summary: 查询内容安全审核详情
 */
func (client *Client) QueryDciContentsecurityEx(request *QueryDciContentsecurityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciContentsecurityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciContentsecurityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.contentsecurity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数字登记证书
 * Summary: 创建数字登记证书
 */
func (client *Client) CreateDciRegistrationcert(request *CreateDciRegistrationcertRequest) (_result *CreateDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDciRegistrationcertResponse{}
	_body, _err := client.CreateDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数字登记证书
 * Summary: 创建数字登记证书
 */
func (client *Client) CreateDciRegistrationcertEx(request *CreateDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryDciRegistrationcert(request *QueryDciRegistrationcertRequest) (_result *QueryDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciRegistrationcertResponse{}
	_body, _err := client.QueryDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已废弃接口
 * Summary: 已废弃接口
 */
func (client *Client) QueryDciRegistrationcertEx(request *QueryDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起支付，获取支付链接
 * Summary: 数登支付-发起支付
 */
func (client *Client) GetDciPayurl(request *GetDciPayurlRequest) (_result *GetDciPayurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDciPayurlResponse{}
	_body, _err := client.GetDciPayurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起支付，获取支付链接
 * Summary: 数登支付-发起支付
 */
func (client *Client) GetDciPayurlEx(request *GetDciPayurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDciPayurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDciPayurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.payurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数登支付结果
 * Summary: 查询数登支付结果
 */
func (client *Client) QueryDciPay(request *QueryDciPayRequest) (_result *QueryDciPayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciPayResponse{}
	_body, _err := client.QueryDciPayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数登支付结果
 * Summary: 查询数登支付结果
 */
func (client *Client) QueryDciPayEx(request *QueryDciPayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciPayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciPayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.pay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付结果回调
 * Summary: 数登支付-支付结果回调
 */
func (client *Client) CallbackDciPayresult(request *CallbackDciPayresultRequest) (_result *CallbackDciPayresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackDciPayresultResponse{}
	_body, _err := client.CallbackDciPayresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付结果回调
 * Summary: 数登支付-支付结果回调
 */
func (client *Client) CallbackDciPayresultEx(request *CallbackDciPayresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackDciPayresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackDciPayresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.payresult.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登审核失败结果回调
 * Summary: 数登审核失败结果回调
 */
func (client *Client) RefuseDciRegistration(request *RefuseDciRegistrationRequest) (_result *RefuseDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseDciRegistrationResponse{}
	_body, _err := client.RefuseDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登审核失败结果回调
 * Summary: 数登审核失败结果回调
 */
func (client *Client) RefuseDciRegistrationEx(request *RefuseDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版权平台获取申办事由配置
 * Summary: 获取申办事由配置
 */
func (client *Client) QueryNotaryBidreason(request *QueryNotaryBidreasonRequest) (_result *QueryNotaryBidreasonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNotaryBidreasonResponse{}
	_body, _err := client.QueryNotaryBidreasonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版权平台获取申办事由配置
 * Summary: 获取申办事由配置
 */
func (client *Client) QueryNotaryBidreasonEx(request *QueryNotaryBidreasonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNotaryBidreasonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNotaryBidreasonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.bidreason.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取签署文件
 * Summary: 获取签署文件
 */
func (client *Client) QueryNotaryDocumenttosign(request *QueryNotaryDocumenttosignRequest) (_result *QueryNotaryDocumenttosignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNotaryDocumenttosignResponse{}
	_body, _err := client.QueryNotaryDocumenttosignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取签署文件
 * Summary: 获取签署文件
 */
func (client *Client) QueryNotaryDocumenttosignEx(request *QueryNotaryDocumenttosignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNotaryDocumenttosignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNotaryDocumenttosignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.documenttosign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交申办订单
 * Summary: 提交申办订单
 */
func (client *Client) ApplyNotaryOrder(request *ApplyNotaryOrderRequest) (_result *ApplyNotaryOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyNotaryOrderResponse{}
	_body, _err := client.ApplyNotaryOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交申办订单
 * Summary: 提交申办订单
 */
func (client *Client) ApplyNotaryOrderEx(request *ApplyNotaryOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyNotaryOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyNotaryOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.order.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公证出证重新获取支付链接
 * Summary: 重新获取支付链接
 */
func (client *Client) QueryNotaryPayurl(request *QueryNotaryPayurlRequest) (_result *QueryNotaryPayurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNotaryPayurlResponse{}
	_body, _err := client.QueryNotaryPayurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公证出证重新获取支付链接
 * Summary: 重新获取支付链接
 */
func (client *Client) QueryNotaryPayurlEx(request *QueryNotaryPayurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNotaryPayurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNotaryPayurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.payurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公证出证获取收费标准和明细
 * Summary: 获取收费标准和明细
 */
func (client *Client) QueryNotaryFeedetail(request *QueryNotaryFeedetailRequest) (_result *QueryNotaryFeedetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNotaryFeedetailResponse{}
	_body, _err := client.QueryNotaryFeedetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公证出证获取收费标准和明细
 * Summary: 获取收费标准和明细
 */
func (client *Client) QueryNotaryFeedetailEx(request *QueryNotaryFeedetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNotaryFeedetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNotaryFeedetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.feedetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公证出证查询申办订单接口
 * Summary: 查询申办订单接口
 */
func (client *Client) QueryNotaryOrder(request *QueryNotaryOrderRequest) (_result *QueryNotaryOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryNotaryOrderResponse{}
	_body, _err := client.QueryNotaryOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公证出证查询申办订单接口
 * Summary: 查询申办订单接口
 */
func (client *Client) QueryNotaryOrderEx(request *QueryNotaryOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryNotaryOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryNotaryOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公证出证申请出证材料补齐
 * Summary: 申请出证材料补齐
 */
func (client *Client) UploadNotaryAttachment(request *UploadNotaryAttachmentRequest) (_result *UploadNotaryAttachmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadNotaryAttachmentResponse{}
	_body, _err := client.UploadNotaryAttachmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公证出证申请出证材料补齐
 * Summary: 申请出证材料补齐
 */
func (client *Client) UploadNotaryAttachmentEx(request *UploadNotaryAttachmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadNotaryAttachmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadNotaryAttachmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.attachment.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公证出证更新申办状态
 * Summary: 更新申办状态
 */
func (client *Client) OperateNotaryOrder(request *OperateNotaryOrderRequest) (_result *OperateNotaryOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateNotaryOrderResponse{}
	_body, _err := client.OperateNotaryOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公证出证更新申办状态
 * Summary: 更新申办状态
 */
func (client *Client) OperateNotaryOrderEx(request *OperateNotaryOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateNotaryOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateNotaryOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.notary.order.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询DCI作品预览结果
 * Summary: 查询DCI作品预览结果
 */
func (client *Client) QueryDciPreview(request *QueryDciPreviewRequest) (_result *QueryDciPreviewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciPreviewResponse{}
	_body, _err := client.QueryDciPreviewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询DCI作品预览结果
 * Summary: 查询DCI作品预览结果
 */
func (client *Client) QueryDciPreviewEx(request *QueryDciPreviewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciPreviewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciPreviewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.preview.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 补正数登申请
 * Summary: 补正数登申请
 */
func (client *Client) RetryDciRegistration(request *RetryDciRegistrationRequest) (_result *RetryDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryDciRegistrationResponse{}
	_body, _err := client.RetryDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 补正数登申请
 * Summary: 补正数登申请
 */
func (client *Client) RetryDciRegistrationEx(request *RetryDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登停止申请
 * Summary: 数登停止申请
 */
func (client *Client) CloseDciRegistration(request *CloseDciRegistrationRequest) (_result *CloseDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseDciRegistrationResponse{}
	_body, _err := client.CloseDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登停止申请
 * Summary: 数登停止申请
 */
func (client *Client) CloseDciRegistrationEx(request *CloseDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: dci用户无需证件注册
 * Summary: dci用户无需证件注册
 */
func (client *Client) AddDciUsernocert(request *AddDciUsernocertRequest) (_result *AddDciUsernocertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddDciUsernocertResponse{}
	_body, _err := client.AddDciUsernocertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: dci用户无需证件注册
 * Summary: dci用户无需证件注册
 */
func (client *Client) AddDciUsernocertEx(request *AddDciUsernocertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddDciUsernocertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddDciUsernocertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.usernocert.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询相似作品下载链接
 * Summary: 查询相似作品下载链接
 */
func (client *Client) QueryDciSimilarfile(request *QueryDciSimilarfileRequest) (_result *QueryDciSimilarfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciSimilarfileResponse{}
	_body, _err := client.QueryDciSimilarfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询相似作品下载链接
 * Summary: 查询相似作品下载链接
 */
func (client *Client) QueryDciSimilarfileEx(request *QueryDciSimilarfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciSimilarfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciSimilarfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.similarfile.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请渠道推广
 * Summary: 申请渠道推广
 */
func (client *Client) ApplyDciPromotion(request *ApplyDciPromotionRequest) (_result *ApplyDciPromotionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDciPromotionResponse{}
	_body, _err := client.ApplyDciPromotionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请渠道推广
 * Summary: 申请渠道推广
 */
func (client *Client) ApplyDciPromotionEx(request *ApplyDciPromotionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDciPromotionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDciPromotionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.promotion.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据手机号查询dci用户
 * Summary: 根据手机号查询dci用户
 */
func (client *Client) QueryDciUserbyphone(request *QueryDciUserbyphoneRequest) (_result *QueryDciUserbyphoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciUserbyphoneResponse{}
	_body, _err := client.QueryDciUserbyphoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据手机号查询dci用户
 * Summary: 根据手机号查询dci用户
 */
func (client *Client) QueryDciUserbyphoneEx(request *QueryDciUserbyphoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciUserbyphoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciUserbyphoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.userbyphone.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支持交易的已进行用途登记的商品查询
 * Summary: 支持交易的商品查询
 */
func (client *Client) QueryTradeSale(request *QueryTradeSaleRequest) (_result *QueryTradeSaleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTradeSaleResponse{}
	_body, _err := client.QueryTradeSaleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支持交易的已进行用途登记的商品查询
 * Summary: 支持交易的商品查询
 */
func (client *Client) QueryTradeSaleEx(request *QueryTradeSaleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTradeSaleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTradeSaleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.trade.sale.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品交易用途登记
 * Summary: 商品交易用途登记
 */
func (client *Client) RegisterTradeUsage(request *RegisterTradeUsageRequest) (_result *RegisterTradeUsageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterTradeUsageResponse{}
	_body, _err := client.RegisterTradeUsageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品交易用途登记
 * Summary: 商品交易用途登记
 */
func (client *Client) RegisterTradeUsageEx(request *RegisterTradeUsageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterTradeUsageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterTradeUsageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.trade.usage.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建取证用户
 * Summary: 创建取证用户
 */
func (client *Client) CreateEvidenceUser(request *CreateEvidenceUserRequest) (_result *CreateEvidenceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceUserResponse{}
	_body, _err := client.CreateEvidenceUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建取证用户
 * Summary: 创建取证用户
 */
func (client *Client) CreateEvidenceUserEx(request *CreateEvidenceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建网页截图
 * Summary: 创建网页截图
 */
func (client *Client) CreateEvidenceScreenshot(request *CreateEvidenceScreenshotRequest) (_result *CreateEvidenceScreenshotResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceScreenshotResponse{}
	_body, _err := client.CreateEvidenceScreenshotEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建网页截图
 * Summary: 创建网页截图
 */
func (client *Client) CreateEvidenceScreenshotEx(request *CreateEvidenceScreenshotRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceScreenshotResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceScreenshotResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.screenshot.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建网页截图存证
 * Summary: 创建网页截图存证
 */
func (client *Client) CreateEvidenceRegister(request *CreateEvidenceRegisterRequest) (_result *CreateEvidenceRegisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceRegisterResponse{}
	_body, _err := client.CreateEvidenceRegisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建网页截图存证
 * Summary: 创建网页截图存证
 */
func (client *Client) CreateEvidenceRegisterEx(request *CreateEvidenceRegisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceRegisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceRegisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.register.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateEvidenceRecordscreen(request *CreateEvidenceRecordscreenRequest) (_result *CreateEvidenceRecordscreenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceRecordscreenResponse{}
	_body, _err := client.CreateEvidenceRecordscreenEx(request, headers, runtime)
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
func (client *Client) CreateEvidenceRecordscreenEx(request *CreateEvidenceRecordscreenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceRecordscreenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceRecordscreenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.recordscreen.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品交易用途撤销
 * Summary: 商品交易用途撤销
 */
func (client *Client) CancelTradeUsage(request *CancelTradeUsageRequest) (_result *CancelTradeUsageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelTradeUsageResponse{}
	_body, _err := client.CancelTradeUsageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品交易用途撤销
 * Summary: 商品交易用途撤销
 */
func (client *Client) CancelTradeUsageEx(request *CancelTradeUsageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelTradeUsageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelTradeUsageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.trade.usage.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建自动化直播录屏取证
 * Summary: 创建自动化直播取证
 */
func (client *Client) CreateEvidenceLive(request *CreateEvidenceLiveRequest) (_result *CreateEvidenceLiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceLiveResponse{}
	_body, _err := client.CreateEvidenceLiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建自动化直播录屏取证
 * Summary: 创建自动化直播取证
 */
func (client *Client) CreateEvidenceLiveEx(request *CreateEvidenceLiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceLiveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceLiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.live.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据点播网站url发起点播取证
 * Summary: 发起点播取证
 */
func (client *Client) CreateEvidenceVod(request *CreateEvidenceVodRequest) (_result *CreateEvidenceVodResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEvidenceVodResponse{}
	_body, _err := client.CreateEvidenceVodEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据点播网站url发起点播取证
 * Summary: 发起点播取证
 */
func (client *Client) CreateEvidenceVodEx(request *CreateEvidenceVodRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEvidenceVodResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEvidenceVodResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.vod.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品交易用途登记结果查询，目前仅用于测试
 * Summary: 商品交易用途登记结果查询
 */
func (client *Client) GetTradeUsage(request *GetTradeUsageRequest) (_result *GetTradeUsageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeUsageResponse{}
	_body, _err := client.GetTradeUsageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品交易用途登记结果查询，目前仅用于测试
 * Summary: 商品交易用途登记结果查询
 */
func (client *Client) GetTradeUsageEx(request *GetTradeUsageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeUsageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeUsageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.trade.usage.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询取证信息
 * Summary: 查询取证信息
 */
func (client *Client) GetEvidenceInfo(request *GetEvidenceInfoRequest) (_result *GetEvidenceInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetEvidenceInfoResponse{}
	_body, _err := client.GetEvidenceInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询取证信息
 * Summary: 查询取证信息
 */
func (client *Client) GetEvidenceInfoEx(request *GetEvidenceInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetEvidenceInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetEvidenceInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.evidence.info.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: DCI变更
 * Summary: DCI变更
 */
func (client *Client) ReplaceDci(request *ReplaceDciRequest) (_result *ReplaceDciResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceDciResponse{}
	_body, _err := client.ReplaceDciEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: DCI变更
 * Summary: DCI变更
 */
func (client *Client) ReplaceDciEx(request *ReplaceDciRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceDciResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceDciResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交作品申诉
 * Summary: 提交作品申诉
 */
func (client *Client) SubmitDciFeedback(request *SubmitDciFeedbackRequest) (_result *SubmitDciFeedbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDciFeedbackResponse{}
	_body, _err := client.SubmitDciFeedbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交作品申诉
 * Summary: 提交作品申诉
 */
func (client *Client) SubmitDciFeedbackEx(request *SubmitDciFeedbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDciFeedbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDciFeedbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.feedback.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询申诉结果
 * Summary: 查询申诉结果
 */
func (client *Client) QueryDciFeedback(request *QueryDciFeedbackRequest) (_result *QueryDciFeedbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDciFeedbackResponse{}
	_body, _err := client.QueryDciFeedbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询申诉结果
 * Summary: 查询申诉结果
 */
func (client *Client) QueryDciFeedbackEx(request *QueryDciFeedbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDciFeedbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDciFeedbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.feedback.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 交易商品抽取封面
 * Summary: 交易商品抽取封面
 */
func (client *Client) ExecTradeCover(request *ExecTradeCoverRequest) (_result *ExecTradeCoverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecTradeCoverResponse{}
	_body, _err := client.ExecTradeCoverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 交易商品抽取封面
 * Summary: 交易商品抽取封面
 */
func (client *Client) ExecTradeCoverEx(request *ExecTradeCoverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecTradeCoverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecTradeCoverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.trade.cover.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建订单
 * Summary: 创建订单
 */
func (client *Client) CreateOrder(request *CreateOrderRequest) (_result *CreateOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOrderResponse{}
	_body, _err := client.CreateOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建订单
 * Summary: 创建订单
 */
func (client *Client) CreateOrderEx(request *CreateOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.order.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询订单支付链接
 * Summary: 查询订单支付链接
 */
func (client *Client) QueryOrderPayurl(request *QueryOrderPayurlRequest) (_result *QueryOrderPayurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOrderPayurlResponse{}
	_body, _err := client.QueryOrderPayurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询订单支付链接
 * Summary: 查询订单支付链接
 */
func (client *Client) QueryOrderPayurlEx(request *QueryOrderPayurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOrderPayurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrderPayurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.order.payurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 版保完成数登证书回调
 * Summary: 版保完成数登证书回调
 */
func (client *Client) FinishDciRegistrationcert(request *FinishDciRegistrationcertRequest) (_result *FinishDciRegistrationcertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishDciRegistrationcertResponse{}
	_body, _err := client.FinishDciRegistrationcertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 版保完成数登证书回调
 * Summary: 版保完成数登证书回调
 */
func (client *Client) FinishDciRegistrationcertEx(request *FinishDciRegistrationcertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishDciRegistrationcertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishDciRegistrationcertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registrationcert.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登取消接口，目前在待支付状态下适用
 * Summary: 数登取消
 */
func (client *Client) CancelDciRegistration(request *CancelDciRegistrationRequest) (_result *CancelDciRegistrationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelDciRegistrationResponse{}
	_body, _err := client.CancelDciRegistrationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登取消接口，目前在待支付状态下适用
 * Summary: 数登取消
 */
func (client *Client) CancelDciRegistrationEx(request *CancelDciRegistrationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelDciRegistrationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelDciRegistrationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.dci.registration.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 法信云网页取证
 * Summary: 法信云网页取证
 */
func (client *Client) CreateScreenshotNew(request *CreateScreenshotNewRequest) (_result *CreateScreenshotNewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateScreenshotNewResponse{}
	_body, _err := client.CreateScreenshotNewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 法信云网页取证
 * Summary: 法信云网页取证
 */
func (client *Client) CreateScreenshotNewEx(request *CreateScreenshotNewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateScreenshotNewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateScreenshotNewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.screenshot.new.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 骑行保创建订单接口
 * Summary: 骑行保创建订单接口
 */
func (client *Client) CreateCyclinginsuranceServiceorder(request *CreateCyclinginsuranceServiceorderRequest) (_result *CreateCyclinginsuranceServiceorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCyclinginsuranceServiceorderResponse{}
	_body, _err := client.CreateCyclinginsuranceServiceorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 骑行保创建订单接口
 * Summary: 骑行保创建订单接口
 */
func (client *Client) CreateCyclinginsuranceServiceorderEx(request *CreateCyclinginsuranceServiceorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCyclinginsuranceServiceorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCyclinginsuranceServiceorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.cyclinginsurance.serviceorder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 服务商作业人员服务库存查询
 * Summary: 服务商作业人员服务库存查询
 */
func (client *Client) QueryCyclinginsuranceServiceinventory(request *QueryCyclinginsuranceServiceinventoryRequest) (_result *QueryCyclinginsuranceServiceinventoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCyclinginsuranceServiceinventoryResponse{}
	_body, _err := client.QueryCyclinginsuranceServiceinventoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 服务商作业人员服务库存查询
 * Summary: 服务商作业人员服务库存查询
 */
func (client *Client) QueryCyclinginsuranceServiceinventoryEx(request *QueryCyclinginsuranceServiceinventoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCyclinginsuranceServiceinventoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCyclinginsuranceServiceinventoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.cyclinginsurance.serviceinventory.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 骑行保查询订单详情
 * Summary: 骑行保查询订单详情
 */
func (client *Client) QueryCyclinginsuranceOrderdetail(request *QueryCyclinginsuranceOrderdetailRequest) (_result *QueryCyclinginsuranceOrderdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCyclinginsuranceOrderdetailResponse{}
	_body, _err := client.QueryCyclinginsuranceOrderdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 骑行保查询订单详情
 * Summary: 骑行保查询订单详情
 */
func (client *Client) QueryCyclinginsuranceOrderdetailEx(request *QueryCyclinginsuranceOrderdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCyclinginsuranceOrderdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCyclinginsuranceOrderdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.cyclinginsurance.orderdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 骑行保取消订单接口
 * Summary: 骑行保取消订单接口
 */
func (client *Client) CancelCyclinginsuranceServiceorder(request *CancelCyclinginsuranceServiceorderRequest) (_result *CancelCyclinginsuranceServiceorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelCyclinginsuranceServiceorderResponse{}
	_body, _err := client.CancelCyclinginsuranceServiceorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 骑行保取消订单接口
 * Summary: 骑行保取消订单接口
 */
func (client *Client) CancelCyclinginsuranceServiceorderEx(request *CancelCyclinginsuranceServiceorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelCyclinginsuranceServiceorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelCyclinginsuranceServiceorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.cyclinginsurance.serviceorder.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 骑行保租中换电审核结果回调
 * Summary: 骑行保租中换电审核结果回调
 */
func (client *Client) NotifyCyclinginsuranceMidchangeserviceorderaudit(request *NotifyCyclinginsuranceMidchangeserviceorderauditRequest) (_result *NotifyCyclinginsuranceMidchangeserviceorderauditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyCyclinginsuranceMidchangeserviceorderauditResponse{}
	_body, _err := client.NotifyCyclinginsuranceMidchangeserviceorderauditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 骑行保租中换电审核结果回调
 * Summary: 骑行保租中换电审核结果回调
 */
func (client *Client) NotifyCyclinginsuranceMidchangeserviceorderauditEx(request *NotifyCyclinginsuranceMidchangeserviceorderauditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyCyclinginsuranceMidchangeserviceorderauditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyCyclinginsuranceMidchangeserviceorderauditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.cyclinginsurance.midchangeserviceorderaudit.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登初审
 * Summary: 数登初审
 */
func (client *Client) SubmitDigregPreliminaryreview(request *SubmitDigregPreliminaryreviewRequest) (_result *SubmitDigregPreliminaryreviewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDigregPreliminaryreviewResponse{}
	_body, _err := client.SubmitDigregPreliminaryreviewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登初审
 * Summary: 数登初审
 */
func (client *Client) SubmitDigregPreliminaryreviewEx(request *SubmitDigregPreliminaryreviewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDigregPreliminaryreviewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDigregPreliminaryreviewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.digreg.preliminaryreview.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数登复审
 * Summary: 数登复审
 */
func (client *Client) SubmitDigregReview(request *SubmitDigregReviewRequest) (_result *SubmitDigregReviewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitDigregReviewResponse{}
	_body, _err := client.SubmitDigregReviewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数登复审
 * Summary: 数登复审
 */
func (client *Client) SubmitDigregReviewEx(request *SubmitDigregReviewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitDigregReviewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitDigregReviewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.digreg.review.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加发布视频内容
 * Summary: 发布视频内容
 */
func (client *Client) AddContent(request *AddContentRequest) (_result *AddContentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddContentResponse{}
	_body, _err := client.AddContentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加发布视频内容
 * Summary: 发布视频内容
 */
func (client *Client) AddContentEx(request *AddContentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddContentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddContentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.content.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询视频内容状态
 * Summary: 查询视频内容状态
 */
func (client *Client) QueryContentStatus(request *QueryContentStatusRequest) (_result *QueryContentStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContentStatusResponse{}
	_body, _err := client.QueryContentStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询视频内容状态
 * Summary: 查询视频内容状态
 */
func (client *Client) QueryContentStatusEx(request *QueryContentStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContentStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContentStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.content.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询视频内容统计数据
 * Summary: 查询视频内容统计
 */
func (client *Client) QueryContentStatistics(request *QueryContentStatisticsRequest) (_result *QueryContentStatisticsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContentStatisticsResponse{}
	_body, _err := client.QueryContentStatisticsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询视频内容统计数据
 * Summary: 查询视频内容统计
 */
func (client *Client) QueryContentStatisticsEx(request *QueryContentStatisticsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContentStatisticsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContentStatisticsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.content.statistics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询视频内容统计数据
 * Summary: 批量查询视频统计信息
 */
func (client *Client) QueryContentBatchstatistics(request *QueryContentBatchstatisticsRequest) (_result *QueryContentBatchstatisticsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContentBatchstatisticsResponse{}
	_body, _err := client.QueryContentBatchstatisticsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询视频内容统计数据
 * Summary: 批量查询视频统计信息
 */
func (client *Client) QueryContentBatchstatisticsEx(request *QueryContentBatchstatisticsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContentBatchstatisticsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContentBatchstatisticsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.bccr.content.batchstatistics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
