// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
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

// 转化数据条目
type ConversionDataDTO struct {
	// 转化目标类型
	// example:
	//
	// FORMBOOK
	ConversionType *string `json:"conversion_type,omitempty" xml:"conversion_type,omitempty" require:"true"`
	// 目标转化量
	// example:
	//
	// 100
	ConversionCount *int64 `json:"conversion_count,omitempty" xml:"conversion_count,omitempty" require:"true"`
}

func (s ConversionDataDTO) String() string {
	return tea.Prettify(s)
}

func (s ConversionDataDTO) GoString() string {
	return s.String()
}

func (s *ConversionDataDTO) SetConversionType(v string) *ConversionDataDTO {
	s.ConversionType = &v
	return s
}

func (s *ConversionDataDTO) SetConversionCount(v int64) *ConversionDataDTO {
	s.ConversionCount = &v
	return s
}

// 文件结构
type FileNode struct {
	// 可访问的文件链接
	// example:
	//
	// http://xxxx
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 文件名
	// example:
	//
	// xxxxx.pdf
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s FileNode) String() string {
	return tea.Prettify(s)
}

func (s FileNode) GoString() string {
	return s.String()
}

func (s *FileNode) SetUrl(v string) *FileNode {
	s.Url = &v
	return s
}

func (s *FileNode) SetName(v string) *FileNode {
	s.Name = &v
	return s
}

// 媒体统计数据条目
type StatisticalDataDTO struct {
	// 项目标识
	// example:
	//
	// 2026072000000138312001
	Project *string `json:"project,omitempty" xml:"project,omitempty" require:"true"`
	// 统计维度id
	// example:
	//
	// 2026072000000138312001
	DimensionId *string `json:"dimension_id,omitempty" xml:"dimension_id,omitempty" require:"true"`
	// 时间维度
	// example:
	//
	// hour
	TimePeriod *string `json:"time_period,omitempty" xml:"time_period,omitempty" require:"true"`
	// 开始时间
	// example:
	//
	// yyyy-MM-dd HH:mm
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间
	// example:
	//
	// yyyy-MM-dd HH:mm
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 花费金额
	// example:
	//
	// 6666.66
	CostMoney *string `json:"cost_money,omitempty" xml:"cost_money,omitempty" require:"true"`
	// 曝光量
	// example:
	//
	// 100
	MediaImpressionCount *int64 `json:"media_impression_count,omitempty" xml:"media_impression_count,omitempty" require:"true"`
	// 点击量
	// example:
	//
	// 100
	MediaClickCount *int64 `json:"media_click_count,omitempty" xml:"media_click_count,omitempty" require:"true"`
	// 目标转化量相关数据
	// example:
	//
	// undefined
	ConversionDataList []*ConversionDataDTO `json:"conversion_data_list,omitempty" xml:"conversion_data_list,omitempty" require:"true" type:"Repeated"`
}

func (s StatisticalDataDTO) String() string {
	return tea.Prettify(s)
}

func (s StatisticalDataDTO) GoString() string {
	return s.String()
}

func (s *StatisticalDataDTO) SetProject(v string) *StatisticalDataDTO {
	s.Project = &v
	return s
}

func (s *StatisticalDataDTO) SetDimensionId(v string) *StatisticalDataDTO {
	s.DimensionId = &v
	return s
}

func (s *StatisticalDataDTO) SetTimePeriod(v string) *StatisticalDataDTO {
	s.TimePeriod = &v
	return s
}

func (s *StatisticalDataDTO) SetStartTime(v string) *StatisticalDataDTO {
	s.StartTime = &v
	return s
}

func (s *StatisticalDataDTO) SetEndTime(v string) *StatisticalDataDTO {
	s.EndTime = &v
	return s
}

func (s *StatisticalDataDTO) SetCostMoney(v string) *StatisticalDataDTO {
	s.CostMoney = &v
	return s
}

func (s *StatisticalDataDTO) SetMediaImpressionCount(v int64) *StatisticalDataDTO {
	s.MediaImpressionCount = &v
	return s
}

func (s *StatisticalDataDTO) SetMediaClickCount(v int64) *StatisticalDataDTO {
	s.MediaClickCount = &v
	return s
}

func (s *StatisticalDataDTO) SetConversionDataList(v []*ConversionDataDTO) *StatisticalDataDTO {
	s.ConversionDataList = v
	return s
}

// 被保人
type Insured struct {
	// 被保人名称
	// example:
	//
	// 李四
	InsuredName *string `json:"insured_name,omitempty" xml:"insured_name,omitempty" require:"true" maxLength:"32"`
	// 被保人证件类型
	// example:
	//
	// 01--居民身份证、03--营业执照
	InsuredCardType *string `json:"insured_card_type,omitempty" xml:"insured_card_type,omitempty" require:"true" maxLength:"32"`
	// 被保人证件号码
	// example:
	//
	// 123456789
	InsuredCardCode *string `json:"insured_card_code,omitempty" xml:"insured_card_code,omitempty" require:"true" maxLength:"32"`
	// 被保人联系方式
	// example:
	//
	// 123456789
	InsuredContactInfo *string `json:"insured_contact_info,omitempty" xml:"insured_contact_info,omitempty" maxLength:"128"`
}

func (s Insured) String() string {
	return tea.Prettify(s)
}

func (s Insured) GoString() string {
	return s.String()
}

func (s *Insured) SetInsuredName(v string) *Insured {
	s.InsuredName = &v
	return s
}

func (s *Insured) SetInsuredCardType(v string) *Insured {
	s.InsuredCardType = &v
	return s
}

func (s *Insured) SetInsuredCardCode(v string) *Insured {
	s.InsuredCardCode = &v
	return s
}

func (s *Insured) SetInsuredContactInfo(v string) *Insured {
	s.InsuredContactInfo = &v
	return s
}

// 投保人
type Applicant struct {
	// 投保人名称
	// example:
	//
	// 李三
	ApplicantName *string `json:"applicant_name,omitempty" xml:"applicant_name,omitempty" require:"true" maxLength:"32"`
	// 投保人证件类型
	// example:
	//
	// 01--居民身份证、03--营业执照
	ApplicantCardType *string `json:"applicant_card_type,omitempty" xml:"applicant_card_type,omitempty" require:"true" maxLength:"32"`
	// 投保人证件号码
	// example:
	//
	// xxxxxx
	ApplicantCardCode *string `json:"applicant_card_code,omitempty" xml:"applicant_card_code,omitempty" require:"true" maxLength:"32"`
	// 投保人联系方式
	// example:
	//
	// 123456789
	ApplicantContactInfo *string `json:"applicant_contact_info,omitempty" xml:"applicant_contact_info,omitempty" maxLength:"128"`
}

func (s Applicant) String() string {
	return tea.Prettify(s)
}

func (s Applicant) GoString() string {
	return s.String()
}

func (s *Applicant) SetApplicantName(v string) *Applicant {
	s.ApplicantName = &v
	return s
}

func (s *Applicant) SetApplicantCardType(v string) *Applicant {
	s.ApplicantCardType = &v
	return s
}

func (s *Applicant) SetApplicantCardCode(v string) *Applicant {
	s.ApplicantCardCode = &v
	return s
}

func (s *Applicant) SetApplicantContactInfo(v string) *Applicant {
	s.ApplicantContactInfo = &v
	return s
}

// 委托险种信息
type EntrustGuaranteeProduct struct {
	// 保障失效时间
	// example:
	//
	// 1733711492119
	GuaranteeExpiryDate *int64 `json:"guarantee_expiry_date,omitempty" xml:"guarantee_expiry_date,omitempty" require:"true"`
	// 保障生效时间
	// example:
	//
	// 1733711492119
	GuaranteeEffectiveDate *int64 `json:"guarantee_effective_date,omitempty" xml:"guarantee_effective_date,omitempty" require:"true"`
	// 保险等待期结束时间
	// example:
	//
	// 1733711492119
	WaitingPeriodDeadLine *int64 `json:"waiting_period_dead_line,omitempty" xml:"waiting_period_dead_line,omitempty"`
	// 保单号
	// example:
	//
	// xxxxx
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 平台定义产品码值
	// example:
	//
	// 平台定义产品码值
	GuaranteeProductCode *string `json:"guarantee_product_code,omitempty" xml:"guarantee_product_code,omitempty"`
	// 保险公司的产品code
	// example:
	//
	// 保险公司的产品code
	InsuranceProductCode *string `json:"insurance_product_code,omitempty" xml:"insurance_product_code,omitempty"`
	// 保险公司的产品描述
	// example:
	//
	// 保险公司的产品描述
	InsuranceProductName *string `json:"insurance_product_name,omitempty" xml:"insurance_product_name,omitempty"`
}

func (s EntrustGuaranteeProduct) String() string {
	return tea.Prettify(s)
}

func (s EntrustGuaranteeProduct) GoString() string {
	return s.String()
}

func (s *EntrustGuaranteeProduct) SetGuaranteeExpiryDate(v int64) *EntrustGuaranteeProduct {
	s.GuaranteeExpiryDate = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetGuaranteeEffectiveDate(v int64) *EntrustGuaranteeProduct {
	s.GuaranteeEffectiveDate = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetWaitingPeriodDeadLine(v int64) *EntrustGuaranteeProduct {
	s.WaitingPeriodDeadLine = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetPolicyNo(v string) *EntrustGuaranteeProduct {
	s.PolicyNo = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetGuaranteeProductCode(v string) *EntrustGuaranteeProduct {
	s.GuaranteeProductCode = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetInsuranceProductCode(v string) *EntrustGuaranteeProduct {
	s.InsuranceProductCode = &v
	return s
}

func (s *EntrustGuaranteeProduct) SetInsuranceProductName(v string) *EntrustGuaranteeProduct {
	s.InsuranceProductName = &v
	return s
}

// 实时营销人群
type RealtimeMktAudience struct {
	// 加密用户标识
	// example:
	//
	// xxxxx
	EncryptedUserId *string `json:"encrypted_user_id,omitempty" xml:"encrypted_user_id,omitempty" require:"true"`
	// 扩展信息
	// example:
	//
	// {}
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
}

func (s RealtimeMktAudience) String() string {
	return tea.Prettify(s)
}

func (s RealtimeMktAudience) GoString() string {
	return s.String()
}

func (s *RealtimeMktAudience) SetEncryptedUserId(v string) *RealtimeMktAudience {
	s.EncryptedUserId = &v
	return s
}

func (s *RealtimeMktAudience) SetExtInfo(v string) *RealtimeMktAudience {
	s.ExtInfo = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	// example:
	//
	// key
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	// example:
	//
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type UploadAntcloudInsuranceMktFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 文件唯一id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 业务入参json格式字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" maxLength:"1024"`
	// 请求id，每一次请求保持唯一，若重复，则报错；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 产品编码，蚂蚁分配
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"64"`
	// 数据类型，
	// 营销人群底包--MKT_AUD_SRC，
	// 营销人群托管底包--MKT_AUD_HOSTING_SRC
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true" maxLength:"64"`
}

func (s UploadAntcloudInsuranceMktFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudInsuranceMktFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetAuthToken(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetFileObject(v io.Reader) *UploadAntcloudInsuranceMktFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetFileObjectName(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetFileId(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.FileId = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetBizContent(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.BizContent = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetRequestId(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.RequestId = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetProductCode(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.ProductCode = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileRequest) SetDataType(v string) *UploadAntcloudInsuranceMktFileRequest {
	s.DataType = &v
	return s
}

type UploadAntcloudInsuranceMktFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s UploadAntcloudInsuranceMktFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudInsuranceMktFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAntcloudInsuranceMktFileResponse) SetReqMsgId(v string) *UploadAntcloudInsuranceMktFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileResponse) SetResultCode(v string) *UploadAntcloudInsuranceMktFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileResponse) SetResultMsg(v string) *UploadAntcloudInsuranceMktFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntcloudInsuranceMktFileResponse) SetRequestId(v string) *UploadAntcloudInsuranceMktFileResponse {
	s.RequestId = &v
	return s
}

type CallbackAntcloudInsuranceMktEffectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，每一次请求保持唯一；若重复，则更新原数据；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 项目ID，待蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true" maxLength:"64"`
	// 营销模式，AI_HANGUP_SMS("AI挂短")，
	// AI_OFFICIAL_ACCOUNT("AI公众号"),
	// BPO_WECHAT("BPO企微"),
	// AI_BPO("AI_BPO")
	MarketingMode *string `json:"marketing_mode,omitempty" xml:"marketing_mode,omitempty" maxLength:"64"`
	// 投保特征短链
	InsureShortUrl *string `json:"insure_short_url,omitempty" xml:"insure_short_url,omitempty" maxLength:"256"`
	// 加密类型：MD5，32位[小]
	EncryptionType *string `json:"encryption_type,omitempty" xml:"encryption_type,omitempty" require:"true" maxLength:"32"`
	// 加密用户标识
	EncryptedUserId *string `json:"encrypted_user_id,omitempty" xml:"encrypted_user_id,omitempty" require:"true" maxLength:"64"`
	// 应以识别当前用户点击投保页面的唯一标识
	LandingVisitId *string `json:"landing_visit_id,omitempty" xml:"landing_visit_id,omitempty" require:"true" maxLength:"128"`
	// 用户点击进入页面时间（格式：yyyy-MM-dd HH:mm:ss）
	ClickTime *string `json:"click_time,omitempty" xml:"click_time,omitempty" maxLength:"32"`
	// 事件完成时间（yyyy-MM-dd HH:mm:ss）
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true" maxLength:"32"`
	// 节点类型
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true" maxLength:"64"`
	// 节点详细信息
	NodeInfo *string `json:"node_info,omitempty" xml:"node_info,omitempty" maxLength:"2048"`
	// 产品 ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktEffectRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktEffectRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetAuthToken(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetRequestId(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetProjectId(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.ProjectId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetMarketingMode(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.MarketingMode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetInsureShortUrl(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.InsureShortUrl = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetEncryptionType(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.EncryptionType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetEncryptedUserId(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.EncryptedUserId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetLandingVisitId(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.LandingVisitId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetClickTime(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.ClickTime = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetEventTime(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.EventTime = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetNodeType(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.NodeType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetNodeInfo(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.NodeInfo = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectRequest) SetProductId(v string) *CallbackAntcloudInsuranceMktEffectRequest {
	s.ProductId = &v
	return s
}

type CallbackAntcloudInsuranceMktEffectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktEffectResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktEffectResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktEffectResponse) SetReqMsgId(v string) *CallbackAntcloudInsuranceMktEffectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectResponse) SetResultCode(v string) *CallbackAntcloudInsuranceMktEffectResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectResponse) SetResultMsg(v string) *CallbackAntcloudInsuranceMktEffectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectResponse) SetRequestId(v string) *CallbackAntcloudInsuranceMktEffectResponse {
	s.RequestId = &v
	return s
}

type CallbackAntcloudInsuranceMktLiveeffectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，每一次请求保持唯一；若重复，则更新原数据；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目ID，待蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 营销模式
	// LIVE_STREAMING("直播")
	// ADVERTISING_TRAFFIC（"广告投流")
	MarketingMode *string `json:"marketing_mode,omitempty" xml:"marketing_mode,omitempty" require:"true"`
	// 加密类型：MD5，32位[小]
	EncryptionType *string `json:"encryption_type,omitempty" xml:"encryption_type,omitempty"`
	// 加密用户标识
	EncryptedUserId *string `json:"encrypted_user_id,omitempty" xml:"encrypted_user_id,omitempty"`
	// 事件完成时间（yyyy-MM-dd HH:mm:ss）
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true"`
	// 节点类型
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 节点详细信息
	NodeInfo *string `json:"node_info,omitempty" xml:"node_info,omitempty"`
	// 只需要传输母链
	LandingPageUrl *string `json:"landing_page_url,omitempty" xml:"landing_page_url,omitempty" require:"true"`
	// N	点击 ID，来自落地页 URL、小程序 path 的埋点
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
	// 产品 ID-固定参数，与商品详情页的 H5 进行绑定
	// 或者通过埋点数据获取
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// 用户 IP
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// ua
	Ua *string `json:"ua,omitempty" xml:"ua,omitempty"`
	// 直播间号 - 动参，每日直播时添加至 URL
	LiveRoomId *string `json:"live_room_id,omitempty" xml:"live_room_id,omitempty"`
	// 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
	LiveStartTime *string `json:"live_start_time,omitempty" xml:"live_start_time,omitempty"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 直播间开播场次-动参，每日每场直播时添加至 URl（唯一ID 生成规则：直播间 ID 后两位+开播时间的年（后两位）月日时分
	// 举例：若直播间 ID 为 kxz123456，开播时间为 2026-06-18 17：22，此时唯一 ID 为：562606181722
	// ）
	LiveSessionId *string `json:"live_session_id,omitempty" xml:"live_session_id,omitempty"`
	// 媒体渠道
	MarketingChannel *string `json:"marketing_channel,omitempty" xml:"marketing_channel,omitempty"`
	// 256	rta追踪 ID
	RtaTraceId *string `json:"rta_trace_id,omitempty" xml:"rta_trace_id,omitempty"`
	// rta 实验 ID
	RtaExpId *string `json:"rta_exp_id,omitempty" xml:"rta_exp_id,omitempty"`
	// RTB追踪ID
	RtbTraceId *string `json:"rtb_trace_id,omitempty" xml:"rtb_trace_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktLiveeffectRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktLiveeffectRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetAuthToken(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetRequestId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetProjectId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.ProjectId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetMarketingMode(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.MarketingMode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetEncryptionType(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.EncryptionType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetEncryptedUserId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.EncryptedUserId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetEventTime(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.EventTime = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetNodeType(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.NodeType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetNodeInfo(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.NodeInfo = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetLandingPageUrl(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.LandingPageUrl = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetClickId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.ClickId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetProductId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.ProductId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetIp(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.Ip = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetUa(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.Ua = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetLiveRoomId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.LiveRoomId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetLiveStartTime(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.LiveStartTime = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetExtInfo(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.ExtInfo = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetLiveSessionId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.LiveSessionId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetMarketingChannel(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.MarketingChannel = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetRtaTraceId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.RtaTraceId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetRtaExpId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.RtaExpId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectRequest) SetRtbTraceId(v string) *CallbackAntcloudInsuranceMktLiveeffectRequest {
	s.RtbTraceId = &v
	return s
}

type CallbackAntcloudInsuranceMktLiveeffectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktLiveeffectResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktLiveeffectResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktLiveeffectResponse) SetReqMsgId(v string) *CallbackAntcloudInsuranceMktLiveeffectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectResponse) SetResultCode(v string) *CallbackAntcloudInsuranceMktLiveeffectResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectResponse) SetResultMsg(v string) *CallbackAntcloudInsuranceMktLiveeffectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktLiveeffectResponse) SetRequestId(v string) *CallbackAntcloudInsuranceMktLiveeffectResponse {
	s.RequestId = &v
	return s
}

type ApplyAntcloudInsuranceMktRealtimemktRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目ID，待蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 加密类型，MD5，32位[小]
	EncryptionType *string `json:"encryption_type,omitempty" xml:"encryption_type,omitempty" require:"true"`
	// 实时营销人群列表
	RealtimeMktAudienceList []*RealtimeMktAudience `json:"realtime_mkt_audience_list,omitempty" xml:"realtime_mkt_audience_list,omitempty" require:"true" type:"Repeated"`
}

func (s ApplyAntcloudInsuranceMktRealtimemktRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntcloudInsuranceMktRealtimemktRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntcloudInsuranceMktRealtimemktRequest) SetAuthToken(v string) *ApplyAntcloudInsuranceMktRealtimemktRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktRequest) SetRequestId(v string) *ApplyAntcloudInsuranceMktRealtimemktRequest {
	s.RequestId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktRequest) SetProjectId(v string) *ApplyAntcloudInsuranceMktRealtimemktRequest {
	s.ProjectId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktRequest) SetEncryptionType(v string) *ApplyAntcloudInsuranceMktRealtimemktRequest {
	s.EncryptionType = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktRequest) SetRealtimeMktAudienceList(v []*RealtimeMktAudience) *ApplyAntcloudInsuranceMktRealtimemktRequest {
	s.RealtimeMktAudienceList = v
	return s
}

type ApplyAntcloudInsuranceMktRealtimemktResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s ApplyAntcloudInsuranceMktRealtimemktResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntcloudInsuranceMktRealtimemktResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntcloudInsuranceMktRealtimemktResponse) SetReqMsgId(v string) *ApplyAntcloudInsuranceMktRealtimemktResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktResponse) SetResultCode(v string) *ApplyAntcloudInsuranceMktRealtimemktResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktResponse) SetResultMsg(v string) *ApplyAntcloudInsuranceMktRealtimemktResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktRealtimemktResponse) SetRequestId(v string) *ApplyAntcloudInsuranceMktRealtimemktResponse {
	s.RequestId = &v
	return s
}

type CallbackAntcloudInsuranceMktMonitordataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 回传请求对应id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 监测数据回传内容
	DataContent *string `json:"data_content,omitempty" xml:"data_content,omitempty" require:"true"`
	// 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s CallbackAntcloudInsuranceMktMonitordataRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktMonitordataRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktMonitordataRequest) SetAuthToken(v string) *CallbackAntcloudInsuranceMktMonitordataRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataRequest) SetRequestId(v string) *CallbackAntcloudInsuranceMktMonitordataRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataRequest) SetDataType(v string) *CallbackAntcloudInsuranceMktMonitordataRequest {
	s.DataType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataRequest) SetDataContent(v string) *CallbackAntcloudInsuranceMktMonitordataRequest {
	s.DataContent = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataRequest) SetProjectId(v string) *CallbackAntcloudInsuranceMktMonitordataRequest {
	s.ProjectId = &v
	return s
}

type CallbackAntcloudInsuranceMktMonitordataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回传请求对应id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktMonitordataResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktMonitordataResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktMonitordataResponse) SetReqMsgId(v string) *CallbackAntcloudInsuranceMktMonitordataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataResponse) SetResultCode(v string) *CallbackAntcloudInsuranceMktMonitordataResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataResponse) SetResultMsg(v string) *CallbackAntcloudInsuranceMktMonitordataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMonitordataResponse) SetRequestId(v string) *CallbackAntcloudInsuranceMktMonitordataResponse {
	s.RequestId = &v
	return s
}

type CallbackAntcloudInsuranceMktMediastatisticaldataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
	MediaSource *string `json:"media_source,omitempty" xml:"media_source,omitempty" require:"true"`
	// 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
	Dimension *string `json:"dimension,omitempty" xml:"dimension,omitempty" require:"true"`
	// 统计数据
	StatisticalDataList []*StatisticalDataDTO `json:"statistical_data_list,omitempty" xml:"statistical_data_list,omitempty" require:"true" type:"Repeated"`
}

func (s CallbackAntcloudInsuranceMktMediastatisticaldataRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktMediastatisticaldataRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetAuthToken(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetRequestId(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetProjectId(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.ProjectId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetMediaSource(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.MediaSource = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetDimension(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.Dimension = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) SetStatisticalDataList(v []*StatisticalDataDTO) *CallbackAntcloudInsuranceMktMediastatisticaldataRequest {
	s.StatisticalDataList = v
	return s
}

type CallbackAntcloudInsuranceMktMediastatisticaldataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktMediastatisticaldataResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktMediastatisticaldataResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataResponse) SetReqMsgId(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataResponse) SetResultCode(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataResponse) SetResultMsg(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktMediastatisticaldataResponse) SetRequestId(v string) *CallbackAntcloudInsuranceMktMediastatisticaldataResponse {
	s.RequestId = &v
	return s
}

type CallbackAntcloudInsuranceMktEffectsimpleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，每一次请求保持唯一；若重复，则更新原数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目ID，待蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 营销模式，枚举：LIVE_STREAMING-直播投流、ADVERTISING-广告投流、AI_WECHAT-AI企微、BPO_SHORT_HANG-BPO挂短、BPO_OFFICIAL_ACCOUNT-BPO公众号、SMS-短信
	MarketingMode *string `json:"marketing_mode,omitempty" xml:"marketing_mode,omitempty"`
	// 投保特征短链，挂短模式必填
	InsureShortUrl *string `json:"insure_short_url,omitempty" xml:"insure_short_url,omitempty"`
	// 加密类型：MD5，32位[小]
	EncryptionType *string `json:"encryption_type,omitempty" xml:"encryption_type,omitempty" require:"true"`
	// 加密用户标识
	EncryptedUserId *string `json:"encrypted_user_id,omitempty" xml:"encrypted_user_id,omitempty" require:"true"`
	// 用以识别当前用户点击投保页面的唯一标识
	LandingVisitId *string `json:"landing_visit_id,omitempty" xml:"landing_visit_id,omitempty" require:"true"`
	// 事件类型（节点类：LIVE_STREAMING_START/LIVE_STREAMING_END/FORM_SUBMIT/POLICY_ISSUE/PREMIUM_PAYMENT/UNDERWRITING；标签类：LABEL_SMS_SEND/LABEL_ADD/LABEL_RENEWAL_M2/LABEL_RENEWAL_M3/LABEL_INTENTION）
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 事件状态，节点类：0-未完成 1-已完成；标签类：支持1-X格式（X为标签值）
	NodeStatus *string `json:"node_status,omitempty" xml:"node_status,omitempty" require:"true"`
	// 事件完成时间（yyyy-MM-dd HH:mm:ss）
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true"`
	// 扩展json字段，最大2048字符，用于传递isfrommy数据源、年化保费等扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CallbackAntcloudInsuranceMktEffectsimpleRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktEffectsimpleRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetAuthToken(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetRequestId(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetProjectId(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.ProjectId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetMarketingMode(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.MarketingMode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetInsureShortUrl(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.InsureShortUrl = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetEncryptionType(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.EncryptionType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetEncryptedUserId(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.EncryptedUserId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetLandingVisitId(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.LandingVisitId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetNodeType(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.NodeType = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetNodeStatus(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.NodeStatus = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetEventTime(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.EventTime = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleRequest) SetExtInfo(v string) *CallbackAntcloudInsuranceMktEffectsimpleRequest {
	s.ExtInfo = &v
	return s
}

type CallbackAntcloudInsuranceMktEffectsimpleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackAntcloudInsuranceMktEffectsimpleResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntcloudInsuranceMktEffectsimpleResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleResponse) SetReqMsgId(v string) *CallbackAntcloudInsuranceMktEffectsimpleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleResponse) SetResultCode(v string) *CallbackAntcloudInsuranceMktEffectsimpleResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleResponse) SetResultMsg(v string) *CallbackAntcloudInsuranceMktEffectsimpleResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAntcloudInsuranceMktEffectsimpleResponse) SetRequestId(v string) *CallbackAntcloudInsuranceMktEffectsimpleResponse {
	s.RequestId = &v
	return s
}

type ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，每一次请求保持唯一；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目ID，待蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 业务场景标识
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 加密类型，MD5 32位小写
	EncryptionType *string `json:"encryption_type,omitempty" xml:"encryption_type,omitempty" require:"true"`
	// 加密用户标识
	EncryptedUserIds []*string `json:"encrypted_user_ids,omitempty" xml:"encrypted_user_ids,omitempty" require:"true" type:"Repeated"`
}

func (s ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) GoString() string {
	return s.String()
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetAuthToken(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetRequestId(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.RequestId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetProjectId(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.ProjectId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetBizScene(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.BizScene = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetEncryptionType(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.EncryptionType = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) SetEncryptedUserIds(v []*string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest {
	s.EncryptedUserIds = v
	return s
}

type ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id，每一次请求保持唯一；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
}

func (s ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) GoString() string {
	return s.String()
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) SetReqMsgId(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) SetResultCode(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) SetResultMsg(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) SetRequestId(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse {
	s.RequestId = &v
	return s
}

func (s *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse) SetBatchNo(v string) *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse {
	s.BatchNo = &v
	return s
}

type GetAntcloudInsuranceMktExtresulturlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id，每一次请求保持唯一，若重复，则报错
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 项目ID，蚂蚁分配
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true" maxLength:"64"`
	// 上传营销标识，来源于上传结果通知中的uploadMktNo
	UploadMktNo *string `json:"upload_mkt_no,omitempty" xml:"upload_mkt_no,omitempty" require:"true" maxLength:"64"`
}

func (s GetAntcloudInsuranceMktExtresulturlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudInsuranceMktExtresulturlRequest) GoString() string {
	return s.String()
}

func (s *GetAntcloudInsuranceMktExtresulturlRequest) SetAuthToken(v string) *GetAntcloudInsuranceMktExtresulturlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlRequest) SetRequestId(v string) *GetAntcloudInsuranceMktExtresulturlRequest {
	s.RequestId = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlRequest) SetProjectId(v string) *GetAntcloudInsuranceMktExtresulturlRequest {
	s.ProjectId = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlRequest) SetUploadMktNo(v string) *GetAntcloudInsuranceMktExtresulturlRequest {
	s.UploadMktNo = &v
	return s
}

type GetAntcloudInsuranceMktExtresulturlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 析出文件下载链接（OSS签名URL，当前有效期24小时）；为空表示析出结果尚未生成，请稍后重试。从底包上传开始7日内链接失效仍可继续获取
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" maxLength:"1024"`
}

func (s GetAntcloudInsuranceMktExtresulturlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudInsuranceMktExtresulturlResponse) GoString() string {
	return s.String()
}

func (s *GetAntcloudInsuranceMktExtresulturlResponse) SetReqMsgId(v string) *GetAntcloudInsuranceMktExtresulturlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlResponse) SetResultCode(v string) *GetAntcloudInsuranceMktExtresulturlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlResponse) SetResultMsg(v string) *GetAntcloudInsuranceMktExtresulturlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlResponse) SetRequestId(v string) *GetAntcloudInsuranceMktExtresulturlResponse {
	s.RequestId = &v
	return s
}

func (s *GetAntcloudInsuranceMktExtresulturlResponse) SetFileUrl(v string) *GetAntcloudInsuranceMktExtresulturlResponse {
	s.FileUrl = &v
	return s
}

type ReceiveAntcloudInsuranceLeadOpportunitiesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// string
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 请求id，每一次请求保持唯一，若重复，则报错；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 产品编码，蚂蚁分配
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务入参json格式字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// 固定值：PAST_MED（既往症人群评分）业务场景
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// TRIGGER_PUSH 须传,首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回
	AcceptNo *string `json:"accept_no,omitempty" xml:"accept_no,omitempty"`
	// 圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号	{"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
	UpdateCycle *string `json:"update_cycle,omitempty" xml:"update_cycle,omitempty" require:"true"`
}

func (s ReceiveAntcloudInsuranceLeadOpportunitiesRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveAntcloudInsuranceLeadOpportunitiesRequest) GoString() string {
	return s.String()
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetAuthToken(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetFileObject(v io.Reader) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.FileObject = v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetFileObjectName(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.FileObjectName = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetFileId(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.FileId = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetRequestId(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.RequestId = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetProductCode(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.ProductCode = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetBizContent(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.BizContent = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetBizType(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.BizType = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetActionType(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.ActionType = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetAcceptNo(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.AcceptNo = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) SetUpdateCycle(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesRequest {
	s.UpdateCycle = &v
	return s
}

type ReceiveAntcloudInsuranceLeadOpportunitiesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 受理号：FULL_PUSH 为蚂蚁生成的受理号；TRIGGER_PUSH 为原批次受理号
	AcceptNo *string `json:"accept_no,omitempty" xml:"accept_no,omitempty"`
}

func (s ReceiveAntcloudInsuranceLeadOpportunitiesResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveAntcloudInsuranceLeadOpportunitiesResponse) GoString() string {
	return s.String()
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesResponse) SetReqMsgId(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesResponse) SetResultCode(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesResponse) SetResultMsg(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesResponse) SetRequestId(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesResponse {
	s.RequestId = &v
	return s
}

func (s *ReceiveAntcloudInsuranceLeadOpportunitiesResponse) SetAcceptNo(v string) *ReceiveAntcloudInsuranceLeadOpportunitiesResponse {
	s.AcceptNo = &v
	return s
}

type PostbackAntcloudInsuranceLeadReceiveRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// string
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 请求id，每一次请求保持唯一，若重复，则报错；
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
	NotifyType *string `json:"notify_type,omitempty" xml:"notify_type,omitempty" require:"true"`
	// 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// json格式数据updateCycle等字段
	NotifyInfo *string `json:"notify_info,omitempty" xml:"notify_info,omitempty"`
	// 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
	AcceptNo *string `json:"accept_no,omitempty" xml:"accept_no,omitempty" require:"true"`
}

func (s PostbackAntcloudInsuranceLeadReceiveRequest) String() string {
	return tea.Prettify(s)
}

func (s PostbackAntcloudInsuranceLeadReceiveRequest) GoString() string {
	return s.String()
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetAuthToken(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.AuthToken = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetFileObject(v io.Reader) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.FileObject = v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetFileObjectName(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.FileObjectName = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetFileId(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.FileId = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetRequestId(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.RequestId = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetNotifyType(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.NotifyType = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetActionType(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.ActionType = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetNotifyInfo(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.NotifyInfo = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveRequest) SetAcceptNo(v string) *PostbackAntcloudInsuranceLeadReceiveRequest {
	s.AcceptNo = &v
	return s
}

type PostbackAntcloudInsuranceLeadReceiveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s PostbackAntcloudInsuranceLeadReceiveResponse) String() string {
	return tea.Prettify(s)
}

func (s PostbackAntcloudInsuranceLeadReceiveResponse) GoString() string {
	return s.String()
}

func (s *PostbackAntcloudInsuranceLeadReceiveResponse) SetReqMsgId(v string) *PostbackAntcloudInsuranceLeadReceiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveResponse) SetResultCode(v string) *PostbackAntcloudInsuranceLeadReceiveResponse {
	s.ResultCode = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveResponse) SetResultMsg(v string) *PostbackAntcloudInsuranceLeadReceiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *PostbackAntcloudInsuranceLeadReceiveResponse) SetRequestId(v string) *PostbackAntcloudInsuranceLeadReceiveResponse {
	s.RequestId = &v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
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
				"sdk_version":      tea.String("1.1.0"),
				"_prod_code":       tea.String("INSURANCESAAS"),
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

// Description:
//
// Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
//
// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
func (client *Client) UploadAntcloudInsuranceMktFile(request *UploadAntcloudInsuranceMktFileRequest) (_result *UploadAntcloudInsuranceMktFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntcloudInsuranceMktFileResponse{}
	_body, _err := client.UploadAntcloudInsuranceMktFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
//
// Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
func (client *Client) UploadAntcloudInsuranceMktFileEx(request *UploadAntcloudInsuranceMktFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntcloudInsuranceMktFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antcloud.insurance.mkt.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadAntcloudInsuranceMktFileResponse := &UploadAntcloudInsuranceMktFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntcloudInsuranceMktFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntcloudInsuranceMktFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保险营销效果回传
//
// Summary: 保险营销效果回传
func (client *Client) CallbackAntcloudInsuranceMktEffect(request *CallbackAntcloudInsuranceMktEffectRequest) (_result *CallbackAntcloudInsuranceMktEffectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntcloudInsuranceMktEffectResponse{}
	_body, _err := client.CallbackAntcloudInsuranceMktEffectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保险营销效果回传
//
// Summary: 保险营销效果回传
func (client *Client) CallbackAntcloudInsuranceMktEffectEx(request *CallbackAntcloudInsuranceMktEffectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntcloudInsuranceMktEffectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntcloudInsuranceMktEffectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.effect.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保险营销效果回传接口——媒体
//
// Summary: 保险营销效果回传接口——媒体
func (client *Client) CallbackAntcloudInsuranceMktLiveeffect(request *CallbackAntcloudInsuranceMktLiveeffectRequest) (_result *CallbackAntcloudInsuranceMktLiveeffectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntcloudInsuranceMktLiveeffectResponse{}
	_body, _err := client.CallbackAntcloudInsuranceMktLiveeffectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保险营销效果回传接口——媒体
//
// Summary: 保险营销效果回传接口——媒体
func (client *Client) CallbackAntcloudInsuranceMktLiveeffectEx(request *CallbackAntcloudInsuranceMktLiveeffectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntcloudInsuranceMktLiveeffectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntcloudInsuranceMktLiveeffectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.liveeffect.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保险实时营销提交
//
// Summary: 保险实时营销提交
func (client *Client) ApplyAntcloudInsuranceMktRealtimemkt(request *ApplyAntcloudInsuranceMktRealtimemktRequest) (_result *ApplyAntcloudInsuranceMktRealtimemktResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntcloudInsuranceMktRealtimemktResponse{}
	_body, _err := client.ApplyAntcloudInsuranceMktRealtimemktEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保险实时营销提交
//
// Summary: 保险实时营销提交
func (client *Client) ApplyAntcloudInsuranceMktRealtimemktEx(request *ApplyAntcloudInsuranceMktRealtimemktRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntcloudInsuranceMktRealtimemktResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntcloudInsuranceMktRealtimemktResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.realtimemkt.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保司营销监测数据回传
//
// Summary: 保司营销监测数据回传
func (client *Client) CallbackAntcloudInsuranceMktMonitordata(request *CallbackAntcloudInsuranceMktMonitordataRequest) (_result *CallbackAntcloudInsuranceMktMonitordataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntcloudInsuranceMktMonitordataResponse{}
	_body, _err := client.CallbackAntcloudInsuranceMktMonitordataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保司营销监测数据回传
//
// Summary: 保司营销监测数据回传
func (client *Client) CallbackAntcloudInsuranceMktMonitordataEx(request *CallbackAntcloudInsuranceMktMonitordataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntcloudInsuranceMktMonitordataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntcloudInsuranceMktMonitordataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.monitordata.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 媒体点击统计数据回传
//
// Summary: 媒体点击统计数据回传
func (client *Client) CallbackAntcloudInsuranceMktMediastatisticaldata(request *CallbackAntcloudInsuranceMktMediastatisticaldataRequest) (_result *CallbackAntcloudInsuranceMktMediastatisticaldataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntcloudInsuranceMktMediastatisticaldataResponse{}
	_body, _err := client.CallbackAntcloudInsuranceMktMediastatisticaldataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 媒体点击统计数据回传
//
// Summary: 媒体点击统计数据回传
func (client *Client) CallbackAntcloudInsuranceMktMediastatisticaldataEx(request *CallbackAntcloudInsuranceMktMediastatisticaldataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntcloudInsuranceMktMediastatisticaldataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntcloudInsuranceMktMediastatisticaldataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.mediastatisticaldata.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 营销效果节点数据（简版）
//
// Summary: 营销效果节点数据（简版）
func (client *Client) CallbackAntcloudInsuranceMktEffectsimple(request *CallbackAntcloudInsuranceMktEffectsimpleRequest) (_result *CallbackAntcloudInsuranceMktEffectsimpleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntcloudInsuranceMktEffectsimpleResponse{}
	_body, _err := client.CallbackAntcloudInsuranceMktEffectsimpleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 营销效果节点数据（简版）
//
// Summary: 营销效果节点数据（简版）
func (client *Client) CallbackAntcloudInsuranceMktEffectsimpleEx(request *CallbackAntcloudInsuranceMktEffectsimpleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntcloudInsuranceMktEffectsimpleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntcloudInsuranceMktEffectsimpleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.effectsimple.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保险营销服务商人群圈选
//
// Summary: 保险营销服务商人群圈选
func (client *Client) ApplyAntcloudInsuranceMktserviceproviderAudiencecircle(request *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest) (_result *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse{}
	_body, _err := client.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保险营销服务商人群圈选
//
// Summary: 保险营销服务商人群圈选
func (client *Client) ApplyAntcloudInsuranceMktserviceproviderAudiencecircleEx(request *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mktserviceprovider.audiencecircle.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 营销人群底包析出结果查询
//
// Summary: 营销人群底包析出结果查询
func (client *Client) GetAntcloudInsuranceMktExtresulturl(request *GetAntcloudInsuranceMktExtresulturlRequest) (_result *GetAntcloudInsuranceMktExtresulturlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntcloudInsuranceMktExtresulturlResponse{}
	_body, _err := client.GetAntcloudInsuranceMktExtresulturlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 营销人群底包析出结果查询
//
// Summary: 营销人群底包析出结果查询
func (client *Client) GetAntcloudInsuranceMktExtresulturlEx(request *GetAntcloudInsuranceMktExtresulturlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntcloudInsuranceMktExtresulturlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntcloudInsuranceMktExtresulturlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.mkt.extresulturl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 商机接收-既往症人群评分-对客
//
// Summary: 商机接收-既往症人群评分-对客
func (client *Client) ReceiveAntcloudInsuranceLeadOpportunities(request *ReceiveAntcloudInsuranceLeadOpportunitiesRequest) (_result *ReceiveAntcloudInsuranceLeadOpportunitiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveAntcloudInsuranceLeadOpportunitiesResponse{}
	_body, _err := client.ReceiveAntcloudInsuranceLeadOpportunitiesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 商机接收-既往症人群评分-对客
//
// Summary: 商机接收-既往症人群评分-对客
func (client *Client) ReceiveAntcloudInsuranceLeadOpportunitiesEx(request *ReceiveAntcloudInsuranceLeadOpportunitiesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveAntcloudInsuranceLeadOpportunitiesResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antcloud.insurance.lead.opportunities.receive"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			receiveAntcloudInsuranceLeadOpportunitiesResponse := &ReceiveAntcloudInsuranceLeadOpportunitiesResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = receiveAntcloudInsuranceLeadOpportunitiesResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveAntcloudInsuranceLeadOpportunitiesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.lead.opportunities.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 既往症线索供给方评分结果文件回传
//
// Summary: 既往症线索供给方评分结果文件回传
func (client *Client) PostbackAntcloudInsuranceLeadReceive(request *PostbackAntcloudInsuranceLeadReceiveRequest) (_result *PostbackAntcloudInsuranceLeadReceiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PostbackAntcloudInsuranceLeadReceiveResponse{}
	_body, _err := client.PostbackAntcloudInsuranceLeadReceiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 既往症线索供给方评分结果文件回传
//
// Summary: 既往症线索供给方评分结果文件回传
func (client *Client) PostbackAntcloudInsuranceLeadReceiveEx(request *PostbackAntcloudInsuranceLeadReceiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PostbackAntcloudInsuranceLeadReceiveResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antcloud.insurance.lead.receive.postback"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			postbackAntcloudInsuranceLeadReceiveResponse := &PostbackAntcloudInsuranceLeadReceiveResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = postbackAntcloudInsuranceLeadReceiveResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PostbackAntcloudInsuranceLeadReceiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.lead.receive.postback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
