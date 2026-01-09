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

// 文件结构
type FileNode struct {
	// 可访问的文件链接
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 文件名
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

// 被保人
type Insured struct {
	// 被保人名称
	InsuredName *string `json:"insured_name,omitempty" xml:"insured_name,omitempty" require:"true" maxLength:"32"`
	// 被保人证件类型
	InsuredCardType *string `json:"insured_card_type,omitempty" xml:"insured_card_type,omitempty" require:"true" maxLength:"32"`
	// 被保人证件号码
	InsuredCardCode *string `json:"insured_card_code,omitempty" xml:"insured_card_code,omitempty" require:"true" maxLength:"32"`
	// 被保人联系方式
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
	ApplicantName *string `json:"applicant_name,omitempty" xml:"applicant_name,omitempty" require:"true" maxLength:"32"`
	// 投保人证件类型
	ApplicantCardType *string `json:"applicant_card_type,omitempty" xml:"applicant_card_type,omitempty" require:"true" maxLength:"32"`
	// 投保人证件号码
	ApplicantCardCode *string `json:"applicant_card_code,omitempty" xml:"applicant_card_code,omitempty" require:"true" maxLength:"32"`
	// 投保人联系方式
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
	GuaranteeExpiryDate *int64 `json:"guarantee_expiry_date,omitempty" xml:"guarantee_expiry_date,omitempty" require:"true"`
	// 保障生效时间
	GuaranteeEffectiveDate *int64 `json:"guarantee_effective_date,omitempty" xml:"guarantee_effective_date,omitempty" require:"true"`
	// 保险等待期结束时间
	WaitingPeriodDeadLine *int64 `json:"waiting_period_dead_line,omitempty" xml:"waiting_period_dead_line,omitempty"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 平台定义产品码值
	GuaranteeProductCode *string `json:"guarantee_product_code,omitempty" xml:"guarantee_product_code,omitempty"`
	// 保险公司的产品code
	InsuranceProductCode *string `json:"insurance_product_code,omitempty" xml:"insurance_product_code,omitempty"`
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

type QueryInquiryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 询价id
	InquiryNoInner *string `json:"inquiry_no_inner,omitempty" xml:"inquiry_no_inner,omitempty" require:"true"`
}

func (s QueryInquiryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInquiryRequest) GoString() string {
	return s.String()
}

func (s *QueryInquiryRequest) SetAuthToken(v string) *QueryInquiryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInquiryRequest) SetInquiryNoInner(v string) *QueryInquiryRequest {
	s.InquiryNoInner = &v
	return s
}

type QueryInquiryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报价内容
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryInquiryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInquiryResponse) GoString() string {
	return s.String()
}

func (s *QueryInquiryResponse) SetReqMsgId(v string) *QueryInquiryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInquiryResponse) SetResultCode(v string) *QueryInquiryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInquiryResponse) SetResultMsg(v string) *QueryInquiryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInquiryResponse) SetBizResult(v string) *QueryInquiryResponse {
	s.BizResult = &v
	return s
}

type SubmitInquiryRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// inquiryNo
	InquiryNo *string `json:"inquiry_no,omitempty" xml:"inquiry_no,omitempty" require:"true"`
	// 询价平台
	InquirePlatform *string `json:"inquire_platform,omitempty" xml:"inquire_platform,omitempty" require:"true"`
	// 单次保额
	SingleInsuranceAmount *string `json:"single_insurance_amount,omitempty" xml:"single_insurance_amount,omitempty" require:"true"`
	// 总保额
	TotalInsuranceAmount *string `json:"total_insurance_amount,omitempty" xml:"total_insurance_amount,omitempty" require:"true"`
	// 询价基础材料列表
	MaterialList *string `json:"material_list,omitempty" xml:"material_list,omitempty"`
	// 询价标的列表
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty"`
	// 保司编号
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// 保司方案代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// 询价人(名称、证件号、证件类型)
	Inquirer *string `json:"inquirer,omitempty" xml:"inquirer,omitempty" require:"true"`
	// 投保人(可空)
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty"`
	// 被保人列表(可空)
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
}

func (s SubmitInquiryRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInquiryRequest) GoString() string {
	return s.String()
}

func (s *SubmitInquiryRequest) SetAuthToken(v string) *SubmitInquiryRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInquiryRequest) SetInquiryNo(v string) *SubmitInquiryRequest {
	s.InquiryNo = &v
	return s
}

func (s *SubmitInquiryRequest) SetInquirePlatform(v string) *SubmitInquiryRequest {
	s.InquirePlatform = &v
	return s
}

func (s *SubmitInquiryRequest) SetSingleInsuranceAmount(v string) *SubmitInquiryRequest {
	s.SingleInsuranceAmount = &v
	return s
}

func (s *SubmitInquiryRequest) SetTotalInsuranceAmount(v string) *SubmitInquiryRequest {
	s.TotalInsuranceAmount = &v
	return s
}

func (s *SubmitInquiryRequest) SetMaterialList(v string) *SubmitInquiryRequest {
	s.MaterialList = &v
	return s
}

func (s *SubmitInquiryRequest) SetObjectList(v string) *SubmitInquiryRequest {
	s.ObjectList = &v
	return s
}

func (s *SubmitInquiryRequest) SetInsuranceCompanyNo(v string) *SubmitInquiryRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *SubmitInquiryRequest) SetTrustworthyValueInsuranceTypeCode(v string) *SubmitInquiryRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *SubmitInquiryRequest) SetInsuranceProjectCode(v string) *SubmitInquiryRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *SubmitInquiryRequest) SetInsuranceOptionsCode(v string) *SubmitInquiryRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *SubmitInquiryRequest) SetInquirer(v string) *SubmitInquiryRequest {
	s.Inquirer = &v
	return s
}

func (s *SubmitInquiryRequest) SetApplicant(v string) *SubmitInquiryRequest {
	s.Applicant = &v
	return s
}

func (s *SubmitInquiryRequest) SetInsuredList(v string) *SubmitInquiryRequest {
	s.InsuredList = &v
	return s
}

type SubmitInquiryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报价内容
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s SubmitInquiryResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInquiryResponse) GoString() string {
	return s.String()
}

func (s *SubmitInquiryResponse) SetReqMsgId(v string) *SubmitInquiryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInquiryResponse) SetResultCode(v string) *SubmitInquiryResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInquiryResponse) SetResultMsg(v string) *SubmitInquiryResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitInquiryResponse) SetBizResult(v string) *SubmitInquiryResponse {
	s.BizResult = &v
	return s
}

type QueryDataDisasterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 行政区域代码
	AreaCode *string `json:"area_code,omitempty" xml:"area_code,omitempty" require:"true"`
	// 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
	DisasterType *string `json:"disaster_type,omitempty" xml:"disaster_type,omitempty" require:"true"`
	// 查询起始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 查询截止日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
}

func (s QueryDataDisasterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataDisasterRequest) GoString() string {
	return s.String()
}

func (s *QueryDataDisasterRequest) SetAuthToken(v string) *QueryDataDisasterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataDisasterRequest) SetAreaCode(v string) *QueryDataDisasterRequest {
	s.AreaCode = &v
	return s
}

func (s *QueryDataDisasterRequest) SetDisasterType(v string) *QueryDataDisasterRequest {
	s.DisasterType = &v
	return s
}

func (s *QueryDataDisasterRequest) SetStartDate(v string) *QueryDataDisasterRequest {
	s.StartDate = &v
	return s
}

func (s *QueryDataDisasterRequest) SetEndDate(v string) *QueryDataDisasterRequest {
	s.EndDate = &v
	return s
}

type QueryDataDisasterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 历史灾害内容
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryDataDisasterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataDisasterResponse) GoString() string {
	return s.String()
}

func (s *QueryDataDisasterResponse) SetReqMsgId(v string) *QueryDataDisasterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataDisasterResponse) SetResultCode(v string) *QueryDataDisasterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataDisasterResponse) SetResultMsg(v string) *QueryDataDisasterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataDisasterResponse) SetBizResult(v string) *QueryDataDisasterResponse {
	s.BizResult = &v
	return s
}

type QueryDataWeatherRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 行政区域代码
	AreaCode *string `json:"area_code,omitempty" xml:"area_code,omitempty"`
}

func (s QueryDataWeatherRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDataWeatherRequest) GoString() string {
	return s.String()
}

func (s *QueryDataWeatherRequest) SetAuthToken(v string) *QueryDataWeatherRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDataWeatherRequest) SetAreaCode(v string) *QueryDataWeatherRequest {
	s.AreaCode = &v
	return s
}

type QueryDataWeatherResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实时气象内容
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryDataWeatherResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDataWeatherResponse) GoString() string {
	return s.String()
}

func (s *QueryDataWeatherResponse) SetReqMsgId(v string) *QueryDataWeatherResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDataWeatherResponse) SetResultCode(v string) *QueryDataWeatherResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDataWeatherResponse) SetResultMsg(v string) *QueryDataWeatherResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDataWeatherResponse) SetBizResult(v string) *QueryDataWeatherResponse {
	s.BizResult = &v
	return s
}

type SyncQuoteRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 询价申请号
	InquiryNo *string `json:"inquiry_no,omitempty" xml:"inquiry_no,omitempty"`
	// 询价平台
	InquirePlatform *string `json:"inquire_platform,omitempty" xml:"inquire_platform,omitempty"`
	// 单次保额
	SingleInsuranceAmount *string `json:"single_insurance_amount,omitempty" xml:"single_insurance_amount,omitempty" require:"true"`
	// 总保额
	TotalInsuranceAmount *string `json:"total_insurance_amount,omitempty" xml:"total_insurance_amount,omitempty" require:"true"`
	// 询价基础材料
	MaterialList *string `json:"material_list,omitempty" xml:"material_list,omitempty"`
	// 标的材料列表
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty"`
	// 保司编号
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// 保司方案代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// 询价人
	Inquirer *string `json:"inquirer,omitempty" xml:"inquirer,omitempty"`
	// 投保人
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty"`
	// 被保人列表
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// 报价结果
	Quotation *string `json:"quotation,omitempty" xml:"quotation,omitempty"`
}

func (s SyncQuoteRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncQuoteRequest) GoString() string {
	return s.String()
}

func (s *SyncQuoteRequest) SetAuthToken(v string) *SyncQuoteRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncQuoteRequest) SetInquiryNo(v string) *SyncQuoteRequest {
	s.InquiryNo = &v
	return s
}

func (s *SyncQuoteRequest) SetInquirePlatform(v string) *SyncQuoteRequest {
	s.InquirePlatform = &v
	return s
}

func (s *SyncQuoteRequest) SetSingleInsuranceAmount(v string) *SyncQuoteRequest {
	s.SingleInsuranceAmount = &v
	return s
}

func (s *SyncQuoteRequest) SetTotalInsuranceAmount(v string) *SyncQuoteRequest {
	s.TotalInsuranceAmount = &v
	return s
}

func (s *SyncQuoteRequest) SetMaterialList(v string) *SyncQuoteRequest {
	s.MaterialList = &v
	return s
}

func (s *SyncQuoteRequest) SetObjectList(v string) *SyncQuoteRequest {
	s.ObjectList = &v
	return s
}

func (s *SyncQuoteRequest) SetInsuranceCompanyNo(v string) *SyncQuoteRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *SyncQuoteRequest) SetTrustworthyValueInsuranceTypeCode(v string) *SyncQuoteRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *SyncQuoteRequest) SetInsuranceProjectCode(v string) *SyncQuoteRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *SyncQuoteRequest) SetInsuranceOptionsCode(v string) *SyncQuoteRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *SyncQuoteRequest) SetInquirer(v string) *SyncQuoteRequest {
	s.Inquirer = &v
	return s
}

func (s *SyncQuoteRequest) SetApplicant(v string) *SyncQuoteRequest {
	s.Applicant = &v
	return s
}

func (s *SyncQuoteRequest) SetInsuredList(v string) *SyncQuoteRequest {
	s.InsuredList = &v
	return s
}

func (s *SyncQuoteRequest) SetQuotation(v string) *SyncQuoteRequest {
	s.Quotation = &v
	return s
}

type SyncQuoteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回值
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s SyncQuoteResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncQuoteResponse) GoString() string {
	return s.String()
}

func (s *SyncQuoteResponse) SetReqMsgId(v string) *SyncQuoteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncQuoteResponse) SetResultCode(v string) *SyncQuoteResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncQuoteResponse) SetResultMsg(v string) *SyncQuoteResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncQuoteResponse) SetBizResult(v string) *SyncQuoteResponse {
	s.BizResult = &v
	return s
}

type ApplyUnderwritingRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报价单编号（蚂蚁内部）
	QuotationNoInner *string `json:"quotation_no_inner,omitempty" xml:"quotation_no_inner,omitempty"`
	// 承保申请号（保司）
	InsuranceApplicationNo *string `json:"insurance_application_no,omitempty" xml:"insurance_application_no,omitempty" require:"true"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// 保司方案代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// 投保人信息(名称、证件号、证件类型)
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty" require:"true"`
	// 被保人列表(可空)
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// 受益人列表(可空)
	BeneficiaryList *string `json:"beneficiary_list,omitempty" xml:"beneficiary_list,omitempty"`
	// 投保标的列表
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty"`
	// 保险起期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty" require:"true"`
	// 保险止期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty"`
	// 保期（天）
	InsurancePeriod *int64 `json:"insurance_period,omitempty" xml:"insurance_period,omitempty" require:"true"`
	// 申请保额， {
	// 		"cent": 20000,
	// 		"currency": "CNY"
	// 	}
	AppliedInsuranceAmount *string `json:"applied_insurance_amount,omitempty" xml:"applied_insurance_amount,omitempty" require:"true"`
	// 保费
	AppliedPremium *string `json:"applied_premium,omitempty" xml:"applied_premium,omitempty" require:"true"`
	// 保费费率
	PremiumRate *string `json:"premium_rate,omitempty" xml:"premium_rate,omitempty" require:"true"`
	// 承保申请的报价相关内容
	Quotation *string `json:"quotation,omitempty" xml:"quotation,omitempty"`
}

func (s ApplyUnderwritingRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyUnderwritingRequest) GoString() string {
	return s.String()
}

func (s *ApplyUnderwritingRequest) SetAuthToken(v string) *ApplyUnderwritingRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetQuotationNoInner(v string) *ApplyUnderwritingRequest {
	s.QuotationNoInner = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsuranceApplicationNo(v string) *ApplyUnderwritingRequest {
	s.InsuranceApplicationNo = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsuranceCompanyNo(v string) *ApplyUnderwritingRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetTrustworthyValueInsuranceTypeCode(v string) *ApplyUnderwritingRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsuranceProjectCode(v string) *ApplyUnderwritingRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsuranceOptionsCode(v string) *ApplyUnderwritingRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetApplicant(v string) *ApplyUnderwritingRequest {
	s.Applicant = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsuredList(v string) *ApplyUnderwritingRequest {
	s.InsuredList = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetBeneficiaryList(v string) *ApplyUnderwritingRequest {
	s.BeneficiaryList = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetObjectList(v string) *ApplyUnderwritingRequest {
	s.ObjectList = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsurancePeriodStart(v string) *ApplyUnderwritingRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsurancePeriodEnd(v string) *ApplyUnderwritingRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetInsurancePeriod(v int64) *ApplyUnderwritingRequest {
	s.InsurancePeriod = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetAppliedInsuranceAmount(v string) *ApplyUnderwritingRequest {
	s.AppliedInsuranceAmount = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetAppliedPremium(v string) *ApplyUnderwritingRequest {
	s.AppliedPremium = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetPremiumRate(v string) *ApplyUnderwritingRequest {
	s.PremiumRate = &v
	return s
}

func (s *ApplyUnderwritingRequest) SetQuotation(v string) *ApplyUnderwritingRequest {
	s.Quotation = &v
	return s
}

type ApplyUnderwritingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 承保申请结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ApplyUnderwritingResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyUnderwritingResponse) GoString() string {
	return s.String()
}

func (s *ApplyUnderwritingResponse) SetReqMsgId(v string) *ApplyUnderwritingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyUnderwritingResponse) SetResultCode(v string) *ApplyUnderwritingResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyUnderwritingResponse) SetResultMsg(v string) *ApplyUnderwritingResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyUnderwritingResponse) SetBizResult(v string) *ApplyUnderwritingResponse {
	s.BizResult = &v
	return s
}

type QueryUnderwritingRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 承保申请号（蚂蚁内部）
	InsuranceApplicationNoInner *string `json:"insurance_application_no_inner,omitempty" xml:"insurance_application_no_inner,omitempty" require:"true"`
}

func (s QueryUnderwritingRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUnderwritingRequest) GoString() string {
	return s.String()
}

func (s *QueryUnderwritingRequest) SetAuthToken(v string) *QueryUnderwritingRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUnderwritingRequest) SetInsuranceApplicationNoInner(v string) *QueryUnderwritingRequest {
	s.InsuranceApplicationNoInner = &v
	return s
}

type QueryUnderwritingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 承保申请结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryUnderwritingResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUnderwritingResponse) GoString() string {
	return s.String()
}

func (s *QueryUnderwritingResponse) SetReqMsgId(v string) *QueryUnderwritingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUnderwritingResponse) SetResultCode(v string) *QueryUnderwritingResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUnderwritingResponse) SetResultMsg(v string) *QueryUnderwritingResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUnderwritingResponse) SetBizResult(v string) *QueryUnderwritingResponse {
	s.BizResult = &v
	return s
}

type QueryPolicyFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 蚂蚁侧保单唯一ID
	InsurancePolicyNoInner *string `json:"insurance_policy_no_inner,omitempty" xml:"insurance_policy_no_inner,omitempty" require:"true"`
}

func (s QueryPolicyFileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPolicyFileRequest) GoString() string {
	return s.String()
}

func (s *QueryPolicyFileRequest) SetAuthToken(v string) *QueryPolicyFileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPolicyFileRequest) SetInsurancePolicyNoInner(v string) *QueryPolicyFileRequest {
	s.InsurancePolicyNoInner = &v
	return s
}

type QueryPolicyFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询的保单信息
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty"`
}

func (s QueryPolicyFileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPolicyFileResponse) GoString() string {
	return s.String()
}

func (s *QueryPolicyFileResponse) SetReqMsgId(v string) *QueryPolicyFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPolicyFileResponse) SetResultCode(v string) *QueryPolicyFileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPolicyFileResponse) SetResultMsg(v string) *QueryPolicyFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPolicyFileResponse) SetOssUrl(v string) *QueryPolicyFileResponse {
	s.OssUrl = &v
	return s
}

type ApplyInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 投保申请号-外部，业务侧需保证唯一
	InsuranceApplicationNo *string `json:"insurance_application_no,omitempty" xml:"insurance_application_no,omitempty" require:"true"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// 保司方案代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty" require:"true"`
	// 被保人列表(可空)，json格式参见投保人信息
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// 受益人列表(可空)
	BeneficiaryList *string `json:"beneficiary_list,omitempty" xml:"beneficiary_list,omitempty"`
	// 保险起期
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty" require:"true"`
	// 保险止期
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty"`
	// 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
	AppliedInsuranceAmount *string `json:"applied_insurance_amount,omitempty" xml:"applied_insurance_amount,omitempty" require:"true"`
	// 保期，单位：天
	InsurancePeriod *int64 `json:"insurance_period,omitempty" xml:"insurance_period,omitempty"`
	// 投保标的List，动态字段，根据险种所配置的标的传值
	InsuredObjectList *string `json:"insured_object_list,omitempty" xml:"insured_object_list,omitempty"`
}

func (s ApplyInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsureRequest) GoString() string {
	return s.String()
}

func (s *ApplyInsureRequest) SetAuthToken(v string) *ApplyInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuranceApplicationNo(v string) *ApplyInsureRequest {
	s.InsuranceApplicationNo = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuranceCompanyNo(v string) *ApplyInsureRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *ApplyInsureRequest) SetTrustworthyValueInsuranceTypeCode(v string) *ApplyInsureRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuranceProjectCode(v string) *ApplyInsureRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuranceOptionsCode(v string) *ApplyInsureRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *ApplyInsureRequest) SetApplicant(v string) *ApplyInsureRequest {
	s.Applicant = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuredList(v string) *ApplyInsureRequest {
	s.InsuredList = &v
	return s
}

func (s *ApplyInsureRequest) SetBeneficiaryList(v string) *ApplyInsureRequest {
	s.BeneficiaryList = &v
	return s
}

func (s *ApplyInsureRequest) SetInsurancePeriodStart(v string) *ApplyInsureRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *ApplyInsureRequest) SetInsurancePeriodEnd(v string) *ApplyInsureRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *ApplyInsureRequest) SetAppliedInsuranceAmount(v string) *ApplyInsureRequest {
	s.AppliedInsuranceAmount = &v
	return s
}

func (s *ApplyInsureRequest) SetInsurancePeriod(v int64) *ApplyInsureRequest {
	s.InsurancePeriod = &v
	return s
}

func (s *ApplyInsureRequest) SetInsuredObjectList(v string) *ApplyInsureRequest {
	s.InsuredObjectList = &v
	return s
}

type ApplyInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 投保申请结果，不同险种可能返回不同，具体参见相关文档
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ApplyInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsureResponse) GoString() string {
	return s.String()
}

func (s *ApplyInsureResponse) SetReqMsgId(v string) *ApplyInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyInsureResponse) SetResultCode(v string) *ApplyInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyInsureResponse) SetResultMsg(v string) *ApplyInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyInsureResponse) SetBizResult(v string) *ApplyInsureResponse {
	s.BizResult = &v
	return s
}

type NotifyPolicyResultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 蚂蚁承保申请号
	InsuranceApplicationNoInner *string `json:"insurance_application_no_inner,omitempty" xml:"insurance_application_no_inner,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保额，JSON格式
	InsuranceAmount *string `json:"insurance_amount,omitempty" xml:"insurance_amount,omitempty" require:"true"`
	// 保费,json格式
	InsurancePremium *string `json:"insurance_premium,omitempty" xml:"insurance_premium,omitempty" require:"true"`
	// 保险起期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty" require:"true"`
	// 保险止期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty" require:"true"`
	// 电子保单URL
	PolicyUrl *string `json:"policy_url,omitempty" xml:"policy_url,omitempty"`
}

func (s NotifyPolicyResultRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyPolicyResultRequest) GoString() string {
	return s.String()
}

func (s *NotifyPolicyResultRequest) SetAuthToken(v string) *NotifyPolicyResultRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetInsuranceApplicationNoInner(v string) *NotifyPolicyResultRequest {
	s.InsuranceApplicationNoInner = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetPolicyNo(v string) *NotifyPolicyResultRequest {
	s.PolicyNo = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetInsuranceAmount(v string) *NotifyPolicyResultRequest {
	s.InsuranceAmount = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetInsurancePremium(v string) *NotifyPolicyResultRequest {
	s.InsurancePremium = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetInsurancePeriodStart(v string) *NotifyPolicyResultRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetInsurancePeriodEnd(v string) *NotifyPolicyResultRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *NotifyPolicyResultRequest) SetPolicyUrl(v string) *NotifyPolicyResultRequest {
	s.PolicyUrl = &v
	return s
}

type NotifyPolicyResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保单同步结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s NotifyPolicyResultResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyPolicyResultResponse) GoString() string {
	return s.String()
}

func (s *NotifyPolicyResultResponse) SetReqMsgId(v string) *NotifyPolicyResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyPolicyResultResponse) SetResultCode(v string) *NotifyPolicyResultResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyPolicyResultResponse) SetResultMsg(v string) *NotifyPolicyResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyPolicyResultResponse) SetBizResult(v string) *NotifyPolicyResultResponse {
	s.BizResult = &v
	return s
}

type ApplyClaimRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案单号
	ClaimNotificationFormNo *string `json:"claim_notification_form_no,omitempty" xml:"claim_notification_form_no,omitempty" require:"true"`
	// 保单号
	InsurancePolicyNo *string `json:"insurance_policy_no,omitempty" xml:"insurance_policy_no,omitempty" require:"true"`
	// 保司编号
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品代码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty"`
	// 保司项目代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty"`
	//  保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty"`
	// 出险时间
	LossOccurredTime *string `json:"loss_occurred_time,omitempty" xml:"loss_occurred_time,omitempty" require:"true"`
	// 出险原因
	LossOccurredReason *string `json:"loss_occurred_reason,omitempty" xml:"loss_occurred_reason,omitempty" require:"true"`
	// 出险地点
	LossOccurredAddress *string `json:"loss_occurred_address,omitempty" xml:"loss_occurred_address,omitempty" require:"true"`
	// 出险标的列表
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty"`
	// 报案金额
	ClaimNotificationAmountLocalCurrency *string `json:"claim_notification_amount_local_currency,omitempty" xml:"claim_notification_amount_local_currency,omitempty" require:"true"`
	// 报案人
	Reporter *string `json:"reporter,omitempty" xml:"reporter,omitempty" require:"true"`
	// 报案材料列表
	MaterialList *string `json:"material_list,omitempty" xml:"material_list,omitempty"`
}

func (s ApplyClaimRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyClaimRequest) GoString() string {
	return s.String()
}

func (s *ApplyClaimRequest) SetAuthToken(v string) *ApplyClaimRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyClaimRequest) SetClaimNotificationFormNo(v string) *ApplyClaimRequest {
	s.ClaimNotificationFormNo = &v
	return s
}

func (s *ApplyClaimRequest) SetInsurancePolicyNo(v string) *ApplyClaimRequest {
	s.InsurancePolicyNo = &v
	return s
}

func (s *ApplyClaimRequest) SetInsuranceCompanyNo(v string) *ApplyClaimRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *ApplyClaimRequest) SetTrustworthyValueInsuranceTypeCode(v string) *ApplyClaimRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *ApplyClaimRequest) SetInsuranceOptionsCode(v string) *ApplyClaimRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *ApplyClaimRequest) SetInsuranceProjectCode(v string) *ApplyClaimRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *ApplyClaimRequest) SetLossOccurredTime(v string) *ApplyClaimRequest {
	s.LossOccurredTime = &v
	return s
}

func (s *ApplyClaimRequest) SetLossOccurredReason(v string) *ApplyClaimRequest {
	s.LossOccurredReason = &v
	return s
}

func (s *ApplyClaimRequest) SetLossOccurredAddress(v string) *ApplyClaimRequest {
	s.LossOccurredAddress = &v
	return s
}

func (s *ApplyClaimRequest) SetObjectList(v string) *ApplyClaimRequest {
	s.ObjectList = &v
	return s
}

func (s *ApplyClaimRequest) SetClaimNotificationAmountLocalCurrency(v string) *ApplyClaimRequest {
	s.ClaimNotificationAmountLocalCurrency = &v
	return s
}

func (s *ApplyClaimRequest) SetReporter(v string) *ApplyClaimRequest {
	s.Reporter = &v
	return s
}

func (s *ApplyClaimRequest) SetMaterialList(v string) *ApplyClaimRequest {
	s.MaterialList = &v
	return s
}

type ApplyClaimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报案响应
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ApplyClaimResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyClaimResponse) GoString() string {
	return s.String()
}

func (s *ApplyClaimResponse) SetReqMsgId(v string) *ApplyClaimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyClaimResponse) SetResultCode(v string) *ApplyClaimResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyClaimResponse) SetResultMsg(v string) *ApplyClaimResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyClaimResponse) SetBizResult(v string) *ApplyClaimResponse {
	s.BizResult = &v
	return s
}

type CancelClaimRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案单编号（蚂蚁内部）
	ClaimNotificationFormNoInner *string `json:"claim_notification_form_no_inner,omitempty" xml:"claim_notification_form_no_inner,omitempty" require:"true"`
	// 报案撤销附加内容
	BizInfo *string `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
}

func (s CancelClaimRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelClaimRequest) GoString() string {
	return s.String()
}

func (s *CancelClaimRequest) SetAuthToken(v string) *CancelClaimRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelClaimRequest) SetClaimNotificationFormNoInner(v string) *CancelClaimRequest {
	s.ClaimNotificationFormNoInner = &v
	return s
}

func (s *CancelClaimRequest) SetBizInfo(v string) *CancelClaimRequest {
	s.BizInfo = &v
	return s
}

type CancelClaimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_result
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s CancelClaimResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelClaimResponse) GoString() string {
	return s.String()
}

func (s *CancelClaimResponse) SetReqMsgId(v string) *CancelClaimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelClaimResponse) SetResultCode(v string) *CancelClaimResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelClaimResponse) SetResultMsg(v string) *CancelClaimResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelClaimResponse) SetBizResult(v string) *CancelClaimResponse {
	s.BizResult = &v
	return s
}

type UpdateClaimMaterialRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案单号（蚂蚁内部）
	ClaimNotificationFormNoInner *string `json:"claim_notification_form_no_inner,omitempty" xml:"claim_notification_form_no_inner,omitempty" require:"true"`
	// 报案号（保司）
	ClaimNotificationNo *string `json:"claim_notification_no,omitempty" xml:"claim_notification_no,omitempty" require:"true"`
	// 报案材料列表
	MaterialList *string `json:"material_list,omitempty" xml:"material_list,omitempty" require:"true"`
	// 不传值，默认（1-已完毕）
	// 0：未完毕
	// 1：已完毕
	IsFinished *string `json:"is_finished,omitempty" xml:"is_finished,omitempty"`
}

func (s UpdateClaimMaterialRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateClaimMaterialRequest) GoString() string {
	return s.String()
}

func (s *UpdateClaimMaterialRequest) SetAuthToken(v string) *UpdateClaimMaterialRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateClaimMaterialRequest) SetClaimNotificationFormNoInner(v string) *UpdateClaimMaterialRequest {
	s.ClaimNotificationFormNoInner = &v
	return s
}

func (s *UpdateClaimMaterialRequest) SetClaimNotificationNo(v string) *UpdateClaimMaterialRequest {
	s.ClaimNotificationNo = &v
	return s
}

func (s *UpdateClaimMaterialRequest) SetMaterialList(v string) *UpdateClaimMaterialRequest {
	s.MaterialList = &v
	return s
}

func (s *UpdateClaimMaterialRequest) SetIsFinished(v string) *UpdateClaimMaterialRequest {
	s.IsFinished = &v
	return s
}

type UpdateClaimMaterialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_result
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s UpdateClaimMaterialResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateClaimMaterialResponse) GoString() string {
	return s.String()
}

func (s *UpdateClaimMaterialResponse) SetReqMsgId(v string) *UpdateClaimMaterialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateClaimMaterialResponse) SetResultCode(v string) *UpdateClaimMaterialResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateClaimMaterialResponse) SetResultMsg(v string) *UpdateClaimMaterialResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateClaimMaterialResponse) SetBizResult(v string) *UpdateClaimMaterialResponse {
	s.BizResult = &v
	return s
}

type ConfirmClaimSettleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案单编号（蚂蚁内部）
	ClaimNotificationFormNoInner *string `json:"claim_notification_form_no_inner,omitempty" xml:"claim_notification_form_no_inner,omitempty" require:"true"`
	// 附加内容
	BizInfo *string `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
}

func (s ConfirmClaimSettleRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmClaimSettleRequest) GoString() string {
	return s.String()
}

func (s *ConfirmClaimSettleRequest) SetAuthToken(v string) *ConfirmClaimSettleRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmClaimSettleRequest) SetClaimNotificationFormNoInner(v string) *ConfirmClaimSettleRequest {
	s.ClaimNotificationFormNoInner = &v
	return s
}

func (s *ConfirmClaimSettleRequest) SetBizInfo(v string) *ConfirmClaimSettleRequest {
	s.BizInfo = &v
	return s
}

type ConfirmClaimSettleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_result
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ConfirmClaimSettleResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmClaimSettleResponse) GoString() string {
	return s.String()
}

func (s *ConfirmClaimSettleResponse) SetReqMsgId(v string) *ConfirmClaimSettleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmClaimSettleResponse) SetResultCode(v string) *ConfirmClaimSettleResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmClaimSettleResponse) SetResultMsg(v string) *ConfirmClaimSettleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmClaimSettleResponse) SetBizResult(v string) *ConfirmClaimSettleResponse {
	s.BizResult = &v
	return s
}

type FinishClaimSettleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案单编号（蚂蚁内部）
	ClaimNotificationFormNoInner *string `json:"claim_notification_form_no_inner,omitempty" xml:"claim_notification_form_no_inner,omitempty" require:"true"`
	// 报案号（保司）
	ClaimNotificationNo *string `json:"claim_notification_no,omitempty" xml:"claim_notification_no,omitempty"`
	// 赔付受理结果：01--受理、02--拒赔
	AcceptResult *string `json:"accept_result,omitempty" xml:"accept_result,omitempty" require:"true"`
	// 受理结论
	AcceptNote *string `json:"accept_note,omitempty" xml:"accept_note,omitempty"`
	// 支付信息
	TradeInfo *string `json:"trade_info,omitempty" xml:"trade_info,omitempty"`
}

func (s FinishClaimSettleRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishClaimSettleRequest) GoString() string {
	return s.String()
}

func (s *FinishClaimSettleRequest) SetAuthToken(v string) *FinishClaimSettleRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishClaimSettleRequest) SetClaimNotificationFormNoInner(v string) *FinishClaimSettleRequest {
	s.ClaimNotificationFormNoInner = &v
	return s
}

func (s *FinishClaimSettleRequest) SetClaimNotificationNo(v string) *FinishClaimSettleRequest {
	s.ClaimNotificationNo = &v
	return s
}

func (s *FinishClaimSettleRequest) SetAcceptResult(v string) *FinishClaimSettleRequest {
	s.AcceptResult = &v
	return s
}

func (s *FinishClaimSettleRequest) SetAcceptNote(v string) *FinishClaimSettleRequest {
	s.AcceptNote = &v
	return s
}

func (s *FinishClaimSettleRequest) SetTradeInfo(v string) *FinishClaimSettleRequest {
	s.TradeInfo = &v
	return s
}

type FinishClaimSettleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_result
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s FinishClaimSettleResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishClaimSettleResponse) GoString() string {
	return s.String()
}

func (s *FinishClaimSettleResponse) SetReqMsgId(v string) *FinishClaimSettleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishClaimSettleResponse) SetResultCode(v string) *FinishClaimSettleResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishClaimSettleResponse) SetResultMsg(v string) *FinishClaimSettleResponse {
	s.ResultMsg = &v
	return s
}

func (s *FinishClaimSettleResponse) SetBizResult(v string) *FinishClaimSettleResponse {
	s.BizResult = &v
	return s
}

type ApplyEndorsementStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 承保申请编号（蚂蚁内部）
	InsuranceApplicationNoInner *string `json:"insurance_application_no_inner,omitempty" xml:"insurance_application_no_inner,omitempty" require:"true"`
	// 投保人信息(名称、证件号、证件类型)
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty"`
	// 被保人列表
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// 受益人列表
	BeneficiaryList *string `json:"beneficiary_list,omitempty" xml:"beneficiary_list,omitempty"`
	// 投保标的列表
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty"`
	// 保险起期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty"`
	// 保险止期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty"`
	// 保期（天）
	InsurancePeriod *int64 `json:"insurance_period,omitempty" xml:"insurance_period,omitempty"`
	// 申请保额， { "cent": 20000, "currency": "CNY" }
	AppliedInsuranceAmount *string `json:"applied_insurance_amount,omitempty" xml:"applied_insurance_amount,omitempty"`
	// 保费， { "cent": 20000, "currency": "CNY" }
	AppliedPremium *string `json:"applied_premium,omitempty" xml:"applied_premium,omitempty"`
	// 保费费率
	PremiumRate *string `json:"premium_rate,omitempty" xml:"premium_rate,omitempty"`
}

func (s ApplyEndorsementStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyEndorsementStrategyRequest) GoString() string {
	return s.String()
}

func (s *ApplyEndorsementStrategyRequest) SetAuthToken(v string) *ApplyEndorsementStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetInsuranceApplicationNoInner(v string) *ApplyEndorsementStrategyRequest {
	s.InsuranceApplicationNoInner = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetApplicant(v string) *ApplyEndorsementStrategyRequest {
	s.Applicant = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetInsuredList(v string) *ApplyEndorsementStrategyRequest {
	s.InsuredList = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetBeneficiaryList(v string) *ApplyEndorsementStrategyRequest {
	s.BeneficiaryList = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetObjectList(v string) *ApplyEndorsementStrategyRequest {
	s.ObjectList = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetInsurancePeriodStart(v string) *ApplyEndorsementStrategyRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetInsurancePeriodEnd(v string) *ApplyEndorsementStrategyRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetInsurancePeriod(v int64) *ApplyEndorsementStrategyRequest {
	s.InsurancePeriod = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetAppliedInsuranceAmount(v string) *ApplyEndorsementStrategyRequest {
	s.AppliedInsuranceAmount = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetAppliedPremium(v string) *ApplyEndorsementStrategyRequest {
	s.AppliedPremium = &v
	return s
}

func (s *ApplyEndorsementStrategyRequest) SetPremiumRate(v string) *ApplyEndorsementStrategyRequest {
	s.PremiumRate = &v
	return s
}

type ApplyEndorsementStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 承保申请结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ApplyEndorsementStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyEndorsementStrategyResponse) GoString() string {
	return s.String()
}

func (s *ApplyEndorsementStrategyResponse) SetReqMsgId(v string) *ApplyEndorsementStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyEndorsementStrategyResponse) SetResultCode(v string) *ApplyEndorsementStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyEndorsementStrategyResponse) SetResultMsg(v string) *ApplyEndorsementStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyEndorsementStrategyResponse) SetBizResult(v string) *ApplyEndorsementStrategyResponse {
	s.BizResult = &v
	return s
}

type SyncPolicyResultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 投保申请号-外部，业务侧需保证唯一
	InsuranceApplicationNo *string `json:"insurance_application_no,omitempty" xml:"insurance_application_no,omitempty" require:"true"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司项目代码
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// 保司方案代码
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty" require:"true"`
	// 被保人列表(可空)
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// 受益人列表(可空)
	BeneficiaryList *string `json:"beneficiary_list,omitempty" xml:"beneficiary_list,omitempty"`
	// 投保标的List，动态字段，根据险种所配置的标的传值
	ObjectList *string `json:"object_list,omitempty" xml:"object_list,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保额，JSON格式
	InsuranceAmount *string `json:"insurance_amount,omitempty" xml:"insurance_amount,omitempty" require:"true"`
	// 保费,json格式
	//
	InsurancePremium *string `json:"insurance_premium,omitempty" xml:"insurance_premium,omitempty" require:"true"`
	// 保险起期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty" require:"true"`
	// 保险止期 yyyy-MM-dd HH:mm:ss
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty" require:"true"`
	// 电子保单URL
	PolicyUrl *string `json:"policy_url,omitempty" xml:"policy_url,omitempty"`
}

func (s SyncPolicyResultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncPolicyResultRequest) GoString() string {
	return s.String()
}

func (s *SyncPolicyResultRequest) SetAuthToken(v string) *SyncPolicyResultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuranceApplicationNo(v string) *SyncPolicyResultRequest {
	s.InsuranceApplicationNo = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuranceCompanyNo(v string) *SyncPolicyResultRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *SyncPolicyResultRequest) SetTrustworthyValueInsuranceTypeCode(v string) *SyncPolicyResultRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuranceProjectCode(v string) *SyncPolicyResultRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuranceOptionsCode(v string) *SyncPolicyResultRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *SyncPolicyResultRequest) SetApplicant(v string) *SyncPolicyResultRequest {
	s.Applicant = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuredList(v string) *SyncPolicyResultRequest {
	s.InsuredList = &v
	return s
}

func (s *SyncPolicyResultRequest) SetBeneficiaryList(v string) *SyncPolicyResultRequest {
	s.BeneficiaryList = &v
	return s
}

func (s *SyncPolicyResultRequest) SetObjectList(v string) *SyncPolicyResultRequest {
	s.ObjectList = &v
	return s
}

func (s *SyncPolicyResultRequest) SetPolicyNo(v string) *SyncPolicyResultRequest {
	s.PolicyNo = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsuranceAmount(v string) *SyncPolicyResultRequest {
	s.InsuranceAmount = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsurancePremium(v string) *SyncPolicyResultRequest {
	s.InsurancePremium = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsurancePeriodStart(v string) *SyncPolicyResultRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *SyncPolicyResultRequest) SetInsurancePeriodEnd(v string) *SyncPolicyResultRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *SyncPolicyResultRequest) SetPolicyUrl(v string) *SyncPolicyResultRequest {
	s.PolicyUrl = &v
	return s
}

type SyncPolicyResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 保单同步结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s SyncPolicyResultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncPolicyResultResponse) GoString() string {
	return s.String()
}

func (s *SyncPolicyResultResponse) SetReqMsgId(v string) *SyncPolicyResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncPolicyResultResponse) SetResultCode(v string) *SyncPolicyResultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncPolicyResultResponse) SetResultMsg(v string) *SyncPolicyResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncPolicyResultResponse) SetBizResult(v string) *SyncPolicyResultResponse {
	s.BizResult = &v
	return s
}

type QueryInsureResultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 保险产品编码
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// 通知单号,投保申请时会返回
	NoticeNo *string `json:"notice_no,omitempty" xml:"notice_no,omitempty" require:"true"`
}

func (s QueryInsureResultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInsureResultRequest) GoString() string {
	return s.String()
}

func (s *QueryInsureResultRequest) SetAuthToken(v string) *QueryInsureResultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInsureResultRequest) SetTrustworthyValueInsuranceTypeCode(v string) *QueryInsureResultRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *QueryInsureResultRequest) SetInsuranceCompanyNo(v string) *QueryInsureResultRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *QueryInsureResultRequest) SetNoticeNo(v string) *QueryInsureResultRequest {
	s.NoticeNo = &v
	return s
}

type QueryInsureResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 通知单号
	NoticeNo *string `json:"notice_no,omitempty" xml:"notice_no,omitempty"`
	// 付款状态
	PaymentStatus *string `json:"payment_status,omitempty" xml:"payment_status,omitempty"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 保额(人民币)
	InsuranceAmount *string `json:"insurance_amount,omitempty" xml:"insurance_amount,omitempty"`
	// 保费(人民币)
	InsurancePremium *string `json:"insurance_premium,omitempty" xml:"insurance_premium,omitempty"`
	// 保险起期
	EffectDate *string `json:"effect_date,omitempty" xml:"effect_date,omitempty"`
	// 保险止期
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty"`
	// 电子保单URL
	OutPolicyUrl *string `json:"out_policy_url,omitempty" xml:"out_policy_url,omitempty"`
	// 投保申请号-外部
	InsuranceApplicationNo *string `json:"insurance_application_no,omitempty" xml:"insurance_application_no,omitempty"`
	// 交易流水号
	InsuranceApplicationNoInner *string `json:"insurance_application_no_inner,omitempty" xml:"insurance_application_no_inner,omitempty"`
}

func (s QueryInsureResultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInsureResultResponse) GoString() string {
	return s.String()
}

func (s *QueryInsureResultResponse) SetReqMsgId(v string) *QueryInsureResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInsureResultResponse) SetResultCode(v string) *QueryInsureResultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInsureResultResponse) SetResultMsg(v string) *QueryInsureResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInsureResultResponse) SetNoticeNo(v string) *QueryInsureResultResponse {
	s.NoticeNo = &v
	return s
}

func (s *QueryInsureResultResponse) SetPaymentStatus(v string) *QueryInsureResultResponse {
	s.PaymentStatus = &v
	return s
}

func (s *QueryInsureResultResponse) SetPolicyNo(v string) *QueryInsureResultResponse {
	s.PolicyNo = &v
	return s
}

func (s *QueryInsureResultResponse) SetInsuranceAmount(v string) *QueryInsureResultResponse {
	s.InsuranceAmount = &v
	return s
}

func (s *QueryInsureResultResponse) SetInsurancePremium(v string) *QueryInsureResultResponse {
	s.InsurancePremium = &v
	return s
}

func (s *QueryInsureResultResponse) SetEffectDate(v string) *QueryInsureResultResponse {
	s.EffectDate = &v
	return s
}

func (s *QueryInsureResultResponse) SetExpireDate(v string) *QueryInsureResultResponse {
	s.ExpireDate = &v
	return s
}

func (s *QueryInsureResultResponse) SetOutPolicyUrl(v string) *QueryInsureResultResponse {
	s.OutPolicyUrl = &v
	return s
}

func (s *QueryInsureResultResponse) SetInsuranceApplicationNo(v string) *QueryInsureResultResponse {
	s.InsuranceApplicationNo = &v
	return s
}

func (s *QueryInsureResultResponse) SetInsuranceApplicationNoInner(v string) *QueryInsureResultResponse {
	s.InsuranceApplicationNoInner = &v
	return s
}

type ApplyInsureTestRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// insurance_application_no
	InsuranceApplicationNo *string `json:"insurance_application_no,omitempty" xml:"insurance_application_no,omitempty" require:"true"`
	// insurance_company_no
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true"`
	// trustworthy_value_insurance_type_code
	TrustworthyValueInsuranceTypeCode *string `json:"trustworthy_value_insurance_type_code,omitempty" xml:"trustworthy_value_insurance_type_code,omitempty" require:"true"`
	// insurance_project_code
	InsuranceProjectCode *string `json:"insurance_project_code,omitempty" xml:"insurance_project_code,omitempty" require:"true"`
	// insurance_options_code
	InsuranceOptionsCode *string `json:"insurance_options_code,omitempty" xml:"insurance_options_code,omitempty" require:"true"`
	// applicant
	Applicant *string `json:"applicant,omitempty" xml:"applicant,omitempty" require:"true"`
	// insured_list
	InsuredList *string `json:"insured_list,omitempty" xml:"insured_list,omitempty"`
	// beneficiary_list
	BeneficiaryList *string `json:"beneficiary_list,omitempty" xml:"beneficiary_list,omitempty"`
	// insurance_period_start
	InsurancePeriodStart *string `json:"insurance_period_start,omitempty" xml:"insurance_period_start,omitempty" require:"true"`
	// insurance_period_end
	InsurancePeriodEnd *string `json:"insurance_period_end,omitempty" xml:"insurance_period_end,omitempty"`
	// applied_insurance_amount
	AppliedInsuranceAmount *string `json:"applied_insurance_amount,omitempty" xml:"applied_insurance_amount,omitempty" require:"true"`
	// insurance_period
	InsurancePeriod *string `json:"insurance_period,omitempty" xml:"insurance_period,omitempty"`
	// insured_object_list
	InsuredObjectList *string `json:"insured_object_list,omitempty" xml:"insured_object_list,omitempty"`
}

func (s ApplyInsureTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsureTestRequest) GoString() string {
	return s.String()
}

func (s *ApplyInsureTestRequest) SetAuthToken(v string) *ApplyInsureTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuranceApplicationNo(v string) *ApplyInsureTestRequest {
	s.InsuranceApplicationNo = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuranceCompanyNo(v string) *ApplyInsureTestRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *ApplyInsureTestRequest) SetTrustworthyValueInsuranceTypeCode(v string) *ApplyInsureTestRequest {
	s.TrustworthyValueInsuranceTypeCode = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuranceProjectCode(v string) *ApplyInsureTestRequest {
	s.InsuranceProjectCode = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuranceOptionsCode(v string) *ApplyInsureTestRequest {
	s.InsuranceOptionsCode = &v
	return s
}

func (s *ApplyInsureTestRequest) SetApplicant(v string) *ApplyInsureTestRequest {
	s.Applicant = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuredList(v string) *ApplyInsureTestRequest {
	s.InsuredList = &v
	return s
}

func (s *ApplyInsureTestRequest) SetBeneficiaryList(v string) *ApplyInsureTestRequest {
	s.BeneficiaryList = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsurancePeriodStart(v string) *ApplyInsureTestRequest {
	s.InsurancePeriodStart = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsurancePeriodEnd(v string) *ApplyInsureTestRequest {
	s.InsurancePeriodEnd = &v
	return s
}

func (s *ApplyInsureTestRequest) SetAppliedInsuranceAmount(v string) *ApplyInsureTestRequest {
	s.AppliedInsuranceAmount = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsurancePeriod(v string) *ApplyInsureTestRequest {
	s.InsurancePeriod = &v
	return s
}

func (s *ApplyInsureTestRequest) SetInsuredObjectList(v string) *ApplyInsureTestRequest {
	s.InsuredObjectList = &v
	return s
}

type ApplyInsureTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_result
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ApplyInsureTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyInsureTestResponse) GoString() string {
	return s.String()
}

func (s *ApplyInsureTestResponse) SetReqMsgId(v string) *ApplyInsureTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyInsureTestResponse) SetResultCode(v string) *ApplyInsureTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyInsureTestResponse) SetResultMsg(v string) *ApplyInsureTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyInsureTestResponse) SetBizResult(v string) *ApplyInsureTestResponse {
	s.BizResult = &v
	return s
}

type SubmitInvestigateCaseRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 报案号 - 外部唯一ID
	ReportNo *string `json:"report_no,omitempty" xml:"report_no,omitempty" require:"true"`
	// 外部单据号
	OutCaseNo *string `json:"out_case_no,omitempty" xml:"out_case_no,omitempty" require:"true"`
	// 案件号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty"`
	// 委托的保司ID
	EntrustInsuranceCompanyId *string `json:"entrust_insurance_company_id,omitempty" xml:"entrust_insurance_company_id,omitempty" require:"true"`
	// 要求完成时间，时间戳
	InvestEndTime *int64 `json:"invest_end_time,omitempty" xml:"invest_end_time,omitempty" require:"true"`
	// 委托联系人
	EntrustName *string `json:"entrust_name,omitempty" xml:"entrust_name,omitempty" require:"true"`
	// 委托联系人电话
	EntrustTel *string `json:"entrust_tel,omitempty" xml:"entrust_tel,omitempty" require:"true"`
	// 委托时间，时间戳
	EntrustTime *int64 `json:"entrust_time,omitempty" xml:"entrust_time,omitempty" require:"true"`
	// 出险人电话号码
	AccidentTel *string `json:"accident_tel,omitempty" xml:"accident_tel,omitempty" require:"true"`
	// 出险人姓名
	AccidentName *string `json:"accident_name,omitempty" xml:"accident_name,omitempty" require:"true"`
	// 出险人证件号
	AccidentCardNo *string `json:"accident_card_no,omitempty" xml:"accident_card_no,omitempty" require:"true"`
	// 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
	AccidentCardType *string `json:"accident_card_type,omitempty" xml:"accident_card_type,omitempty" require:"true"`
	// 出险经过
	AccidentDesc *string `json:"accident_desc,omitempty" xml:"accident_desc,omitempty" require:"true"`
	// 出险人地址中文名
	AccidentAddressInfo *string `json:"accident_address_info,omitempty" xml:"accident_address_info,omitempty" require:"true"`
	// 出险人详细住址
	AccidentAddressDetail *string `json:"accident_address_detail,omitempty" xml:"accident_address_detail,omitempty" require:"true"`
	// 出险日期，时间戳
	AccidentTime *int64 `json:"accident_time,omitempty" xml:"accident_time,omitempty" require:"true"`
	// 报案人电话号码
	ReporterTel *string `json:"reporter_tel,omitempty" xml:"reporter_tel,omitempty" require:"true"`
	// 报案人姓名
	ReporterName *string `json:"reporter_name,omitempty" xml:"reporter_name,omitempty" require:"true"`
	// 报案人证件号
	ReporterCardNo *string `json:"reporter_card_no,omitempty" xml:"reporter_card_no,omitempty" require:"true"`
	// 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
	ReporterCardType *string `json:"reporter_card_type,omitempty" xml:"reporter_card_type,omitempty" require:"true"`
	// 报案人与出险人的关系
	// 1本人，2配偶，3父母，4子女，5其他
	ReporterRelationToAccident *string `json:"reporter_relation_to_accident,omitempty" xml:"reporter_relation_to_accident,omitempty" require:"true"`
	// 报案时间，时间戳
	ReportTime *int64 `json:"report_time,omitempty" xml:"report_time,omitempty"`
	// 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
	EventAddressInfo *string `json:"event_address_info,omitempty" xml:"event_address_info,omitempty" require:"true"`
	// 事故发生详细地点
	EventAddressDetail *string `json:"event_address_detail,omitempty" xml:"event_address_detail,omitempty" require:"true"`
	// 确诊医院
	ConfirmHospital *string `json:"confirm_hospital,omitempty" xml:"confirm_hospital,omitempty" require:"true"`
	// 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
	ConfirmHospitalAddressInfo *string `json:"confirm_hospital_address_info,omitempty" xml:"confirm_hospital_address_info,omitempty" require:"true"`
	// 确诊疾病名称
	ConfirmIllnessName *string `json:"confirm_illness_name,omitempty" xml:"confirm_illness_name,omitempty" require:"true"`
	// 产品大类 重疾或者医疗险
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 文件列表
	FileList []*FileNode `json:"file_list,omitempty" xml:"file_list,omitempty" require:"true" type:"Repeated"`
	// 委托险种集合信息
	EntrustGuaranteeProductList []*EntrustGuaranteeProduct `json:"entrust_guarantee_product_list,omitempty" xml:"entrust_guarantee_product_list,omitempty" require:"true" type:"Repeated"`
}

func (s SubmitInvestigateCaseRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitInvestigateCaseRequest) GoString() string {
	return s.String()
}

func (s *SubmitInvestigateCaseRequest) SetAuthToken(v string) *SubmitInvestigateCaseRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReportNo(v string) *SubmitInvestigateCaseRequest {
	s.ReportNo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetOutCaseNo(v string) *SubmitInvestigateCaseRequest {
	s.OutCaseNo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetPolicyNo(v string) *SubmitInvestigateCaseRequest {
	s.PolicyNo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEntrustInsuranceCompanyId(v string) *SubmitInvestigateCaseRequest {
	s.EntrustInsuranceCompanyId = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetInvestEndTime(v int64) *SubmitInvestigateCaseRequest {
	s.InvestEndTime = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEntrustName(v string) *SubmitInvestigateCaseRequest {
	s.EntrustName = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEntrustTel(v string) *SubmitInvestigateCaseRequest {
	s.EntrustTel = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEntrustTime(v int64) *SubmitInvestigateCaseRequest {
	s.EntrustTime = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentTel(v string) *SubmitInvestigateCaseRequest {
	s.AccidentTel = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentName(v string) *SubmitInvestigateCaseRequest {
	s.AccidentName = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentCardNo(v string) *SubmitInvestigateCaseRequest {
	s.AccidentCardNo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentCardType(v string) *SubmitInvestigateCaseRequest {
	s.AccidentCardType = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentDesc(v string) *SubmitInvestigateCaseRequest {
	s.AccidentDesc = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentAddressInfo(v string) *SubmitInvestigateCaseRequest {
	s.AccidentAddressInfo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentAddressDetail(v string) *SubmitInvestigateCaseRequest {
	s.AccidentAddressDetail = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetAccidentTime(v int64) *SubmitInvestigateCaseRequest {
	s.AccidentTime = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReporterTel(v string) *SubmitInvestigateCaseRequest {
	s.ReporterTel = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReporterName(v string) *SubmitInvestigateCaseRequest {
	s.ReporterName = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReporterCardNo(v string) *SubmitInvestigateCaseRequest {
	s.ReporterCardNo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReporterCardType(v string) *SubmitInvestigateCaseRequest {
	s.ReporterCardType = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReporterRelationToAccident(v string) *SubmitInvestigateCaseRequest {
	s.ReporterRelationToAccident = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetReportTime(v int64) *SubmitInvestigateCaseRequest {
	s.ReportTime = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEventAddressInfo(v string) *SubmitInvestigateCaseRequest {
	s.EventAddressInfo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEventAddressDetail(v string) *SubmitInvestigateCaseRequest {
	s.EventAddressDetail = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetConfirmHospital(v string) *SubmitInvestigateCaseRequest {
	s.ConfirmHospital = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetConfirmHospitalAddressInfo(v string) *SubmitInvestigateCaseRequest {
	s.ConfirmHospitalAddressInfo = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetConfirmIllnessName(v string) *SubmitInvestigateCaseRequest {
	s.ConfirmIllnessName = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetProductType(v string) *SubmitInvestigateCaseRequest {
	s.ProductType = &v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetFileList(v []*FileNode) *SubmitInvestigateCaseRequest {
	s.FileList = v
	return s
}

func (s *SubmitInvestigateCaseRequest) SetEntrustGuaranteeProductList(v []*EntrustGuaranteeProduct) *SubmitInvestigateCaseRequest {
	s.EntrustGuaranteeProductList = v
	return s
}

type SubmitInvestigateCaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitInvestigateCaseResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitInvestigateCaseResponse) GoString() string {
	return s.String()
}

func (s *SubmitInvestigateCaseResponse) SetReqMsgId(v string) *SubmitInvestigateCaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitInvestigateCaseResponse) SetResultCode(v string) *SubmitInvestigateCaseResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitInvestigateCaseResponse) SetResultMsg(v string) *SubmitInvestigateCaseResponse {
	s.ResultMsg = &v
	return s
}

type QueryReverseCommissionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 案件号-外部唯一
	OutCaseNo *string `json:"out_case_no,omitempty" xml:"out_case_no,omitempty" require:"true"`
	// 委托的保司ID
	EntrustInsuranceCompanyId *string `json:"entrust_insurance_company_id,omitempty" xml:"entrust_insurance_company_id,omitempty" require:"true"`
}

func (s QueryReverseCommissionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryReverseCommissionRequest) GoString() string {
	return s.String()
}

func (s *QueryReverseCommissionRequest) SetAuthToken(v string) *QueryReverseCommissionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryReverseCommissionRequest) SetOutCaseNo(v string) *QueryReverseCommissionRequest {
	s.OutCaseNo = &v
	return s
}

func (s *QueryReverseCommissionRequest) SetEntrustInsuranceCompanyId(v string) *QueryReverseCommissionRequest {
	s.EntrustInsuranceCompanyId = &v
	return s
}

type QueryReverseCommissionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回销结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryReverseCommissionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryReverseCommissionResponse) GoString() string {
	return s.String()
}

func (s *QueryReverseCommissionResponse) SetReqMsgId(v string) *QueryReverseCommissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryReverseCommissionResponse) SetResultCode(v string) *QueryReverseCommissionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryReverseCommissionResponse) SetResultMsg(v string) *QueryReverseCommissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryReverseCommissionResponse) SetBizResult(v string) *QueryReverseCommissionResponse {
	s.BizResult = &v
	return s
}

type GetEmbedcardUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 险种编码
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty" require:"true" maxLength:"32"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true" maxLength:"32"`
	// 嵌入式产品编码
	EmbedProductCode *string `json:"embed_product_code,omitempty" xml:"embed_product_code,omitempty" require:"true" maxLength:"32"`
	// 是否需要询价
	IsNeedInquiry *bool `json:"is_need_inquiry,omitempty" xml:"is_need_inquiry,omitempty" require:"true"`
	// 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"128"`
	// 方案名称
	SchemeName *string `json:"scheme_name,omitempty" xml:"scheme_name,omitempty" require:"true" maxLength:"32"`
	// 投保人
	Applicant *Applicant `json:"applicant,omitempty" xml:"applicant,omitempty" require:"true"`
	// 被保人
	Insured *Insured `json:"insured,omitempty" xml:"insured,omitempty" require:"true"`
	// 投保标的
	SubjectInfo *string `json:"subject_info,omitempty" xml:"subject_info,omitempty" require:"true" maxLength:"1000"`
}

func (s GetEmbedcardUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetEmbedcardUrlRequest) GoString() string {
	return s.String()
}

func (s *GetEmbedcardUrlRequest) SetAuthToken(v string) *GetEmbedcardUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetInsuranceTypeCode(v string) *GetEmbedcardUrlRequest {
	s.InsuranceTypeCode = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetInsuranceCompanyNo(v string) *GetEmbedcardUrlRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetEmbedProductCode(v string) *GetEmbedcardUrlRequest {
	s.EmbedProductCode = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetIsNeedInquiry(v bool) *GetEmbedcardUrlRequest {
	s.IsNeedInquiry = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetTradeNo(v string) *GetEmbedcardUrlRequest {
	s.TradeNo = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetSchemeName(v string) *GetEmbedcardUrlRequest {
	s.SchemeName = &v
	return s
}

func (s *GetEmbedcardUrlRequest) SetApplicant(v *Applicant) *GetEmbedcardUrlRequest {
	s.Applicant = v
	return s
}

func (s *GetEmbedcardUrlRequest) SetInsured(v *Insured) *GetEmbedcardUrlRequest {
	s.Insured = v
	return s
}

func (s *GetEmbedcardUrlRequest) SetSubjectInfo(v string) *GetEmbedcardUrlRequest {
	s.SubjectInfo = &v
	return s
}

type GetEmbedcardUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 险种编码
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty"`
	// 嵌入式产品编码
	EmbedProductCode *string `json:"embed_product_code,omitempty" xml:"embed_product_code,omitempty"`
	// 嵌入式产品URL地址
	EmbedProductUrl *string `json:"embed_product_url,omitempty" xml:"embed_product_url,omitempty"`
	// 方案名称
	SchemeName *string `json:"scheme_name,omitempty" xml:"scheme_name,omitempty"`
	// 保费
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty"`
	// 询价编码
	InquiryNo *string `json:"inquiry_no,omitempty" xml:"inquiry_no,omitempty"`
}

func (s GetEmbedcardUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetEmbedcardUrlResponse) GoString() string {
	return s.String()
}

func (s *GetEmbedcardUrlResponse) SetReqMsgId(v string) *GetEmbedcardUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetResultCode(v string) *GetEmbedcardUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetResultMsg(v string) *GetEmbedcardUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetTradeNo(v string) *GetEmbedcardUrlResponse {
	s.TradeNo = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetInsuranceTypeCode(v string) *GetEmbedcardUrlResponse {
	s.InsuranceTypeCode = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetInsuranceCompanyNo(v string) *GetEmbedcardUrlResponse {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetEmbedProductCode(v string) *GetEmbedcardUrlResponse {
	s.EmbedProductCode = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetEmbedProductUrl(v string) *GetEmbedcardUrlResponse {
	s.EmbedProductUrl = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetSchemeName(v string) *GetEmbedcardUrlResponse {
	s.SchemeName = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetPremium(v string) *GetEmbedcardUrlResponse {
	s.Premium = &v
	return s
}

func (s *GetEmbedcardUrlResponse) SetInquiryNo(v string) *GetEmbedcardUrlResponse {
	s.InquiryNo = &v
	return s
}

type IssueEmbedcardPaysucRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 险种编码
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty" require:"true" maxLength:"32"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty" require:"true" maxLength:"32"`
	// 嵌入式产品编码
	EmbedProductCode *string `json:"embed_product_code,omitempty" xml:"embed_product_code,omitempty" require:"true" maxLength:"32"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"128"`
	// 方案名称
	SchemeName *string `json:"scheme_name,omitempty" xml:"scheme_name,omitempty" require:"true" maxLength:"32"`
	// 保费，保留2位小数
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty" require:"true"`
	// 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
	PremiumPaymentChannel *string `json:"premium_payment_channel,omitempty" xml:"premium_payment_channel,omitempty" require:"true" maxLength:"32"`
	// 保费支付流水号
	PremiumPaymentNo *string `json:"premium_payment_no,omitempty" xml:"premium_payment_no,omitempty" require:"true" maxLength:"128"`
	// 保费支付金额，保留2位小数
	PremiumPaymentAmount *string `json:"premium_payment_amount,omitempty" xml:"premium_payment_amount,omitempty" require:"true"`
	// 保费支付时间
	PremiumPaymentTime *string `json:"premium_payment_time,omitempty" xml:"premium_payment_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 询价编码
	InquiryNo *string `json:"inquiry_no,omitempty" xml:"inquiry_no,omitempty" require:"true" maxLength:"32"`
}

func (s IssueEmbedcardPaysucRequest) String() string {
	return tea.Prettify(s)
}

func (s IssueEmbedcardPaysucRequest) GoString() string {
	return s.String()
}

func (s *IssueEmbedcardPaysucRequest) SetAuthToken(v string) *IssueEmbedcardPaysucRequest {
	s.AuthToken = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetInsuranceTypeCode(v string) *IssueEmbedcardPaysucRequest {
	s.InsuranceTypeCode = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetInsuranceCompanyNo(v string) *IssueEmbedcardPaysucRequest {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetEmbedProductCode(v string) *IssueEmbedcardPaysucRequest {
	s.EmbedProductCode = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetTradeNo(v string) *IssueEmbedcardPaysucRequest {
	s.TradeNo = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetSchemeName(v string) *IssueEmbedcardPaysucRequest {
	s.SchemeName = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetPremium(v string) *IssueEmbedcardPaysucRequest {
	s.Premium = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetPremiumPaymentChannel(v string) *IssueEmbedcardPaysucRequest {
	s.PremiumPaymentChannel = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetPremiumPaymentNo(v string) *IssueEmbedcardPaysucRequest {
	s.PremiumPaymentNo = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetPremiumPaymentAmount(v string) *IssueEmbedcardPaysucRequest {
	s.PremiumPaymentAmount = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetPremiumPaymentTime(v string) *IssueEmbedcardPaysucRequest {
	s.PremiumPaymentTime = &v
	return s
}

func (s *IssueEmbedcardPaysucRequest) SetInquiryNo(v string) *IssueEmbedcardPaysucRequest {
	s.InquiryNo = &v
	return s
}

type IssueEmbedcardPaysucResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 险种编码
	InsuranceTypeCode *string `json:"insurance_type_code,omitempty" xml:"insurance_type_code,omitempty"`
	// 保司编码
	InsuranceCompanyNo *string `json:"insurance_company_no,omitempty" xml:"insurance_company_no,omitempty"`
	// 嵌入式产品编码
	EmbedProductCode *string `json:"embed_product_code,omitempty" xml:"embed_product_code,omitempty"`
	// 方案名称
	SchemeName *string `json:"scheme_name,omitempty" xml:"scheme_name,omitempty"`
	// 保险起期
	InsureStart *string `json:"insure_start,omitempty" xml:"insure_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保险止期
	InsureEnd *string `json:"insure_end,omitempty" xml:"insure_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 保费，保留2位小数
	Premium *string `json:"premium,omitempty" xml:"premium,omitempty"`
	// 保额，保留2位小数
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 询价编码
	InquiryNo *string `json:"inquiry_no,omitempty" xml:"inquiry_no,omitempty"`
	// 保险凭证号
	VoucherNo *string `json:"voucher_no,omitempty" xml:"voucher_no,omitempty"`
}

func (s IssueEmbedcardPaysucResponse) String() string {
	return tea.Prettify(s)
}

func (s IssueEmbedcardPaysucResponse) GoString() string {
	return s.String()
}

func (s *IssueEmbedcardPaysucResponse) SetReqMsgId(v string) *IssueEmbedcardPaysucResponse {
	s.ReqMsgId = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetResultCode(v string) *IssueEmbedcardPaysucResponse {
	s.ResultCode = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetResultMsg(v string) *IssueEmbedcardPaysucResponse {
	s.ResultMsg = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetTradeNo(v string) *IssueEmbedcardPaysucResponse {
	s.TradeNo = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetInsuranceTypeCode(v string) *IssueEmbedcardPaysucResponse {
	s.InsuranceTypeCode = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetInsuranceCompanyNo(v string) *IssueEmbedcardPaysucResponse {
	s.InsuranceCompanyNo = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetEmbedProductCode(v string) *IssueEmbedcardPaysucResponse {
	s.EmbedProductCode = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetSchemeName(v string) *IssueEmbedcardPaysucResponse {
	s.SchemeName = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetInsureStart(v string) *IssueEmbedcardPaysucResponse {
	s.InsureStart = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetInsureEnd(v string) *IssueEmbedcardPaysucResponse {
	s.InsureEnd = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetPremium(v string) *IssueEmbedcardPaysucResponse {
	s.Premium = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetAmount(v string) *IssueEmbedcardPaysucResponse {
	s.Amount = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetInquiryNo(v string) *IssueEmbedcardPaysucResponse {
	s.InquiryNo = &v
	return s
}

func (s *IssueEmbedcardPaysucResponse) SetVoucherNo(v string) *IssueEmbedcardPaysucResponse {
	s.VoucherNo = &v
	return s
}

type GetEmbedoemautoinsuranceUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true" maxLength:"128"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"64"`
	// 业务参数，json格式
	BizInfo *string `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true" maxLength:"1000"`
}

func (s GetEmbedoemautoinsuranceUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetEmbedoemautoinsuranceUrlRequest) GoString() string {
	return s.String()
}

func (s *GetEmbedoemautoinsuranceUrlRequest) SetAuthToken(v string) *GetEmbedoemautoinsuranceUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlRequest) SetRequestNo(v string) *GetEmbedoemautoinsuranceUrlRequest {
	s.RequestNo = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlRequest) SetProductCode(v string) *GetEmbedoemautoinsuranceUrlRequest {
	s.ProductCode = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlRequest) SetBizInfo(v string) *GetEmbedoemautoinsuranceUrlRequest {
	s.BizInfo = &v
	return s
}

type GetEmbedoemautoinsuranceUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// url链接
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 请求流水号
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty"`
}

func (s GetEmbedoemautoinsuranceUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetEmbedoemautoinsuranceUrlResponse) GoString() string {
	return s.String()
}

func (s *GetEmbedoemautoinsuranceUrlResponse) SetReqMsgId(v string) *GetEmbedoemautoinsuranceUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlResponse) SetResultCode(v string) *GetEmbedoemautoinsuranceUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlResponse) SetResultMsg(v string) *GetEmbedoemautoinsuranceUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlResponse) SetUrl(v string) *GetEmbedoemautoinsuranceUrlResponse {
	s.Url = &v
	return s
}

func (s *GetEmbedoemautoinsuranceUrlResponse) SetRequestNo(v string) *GetEmbedoemautoinsuranceUrlResponse {
	s.RequestNo = &v
	return s
}

type GetRightplatformUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 权益申请编号
	RightApplyNo *string `json:"right_apply_no,omitempty" xml:"right_apply_no,omitempty" require:"true"`
	// 申请额度，最多保留小数点后两位
	ApplyLimitAmount *string `json:"apply_limit_amount,omitempty" xml:"apply_limit_amount,omitempty" require:"true"`
	// 数据授权方名称
	DataLicensor *string `json:"data_licensor,omitempty" xml:"data_licensor,omitempty" require:"true"`
	// 回调场景方地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty" require:"true"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 用户姓名 加密后传输
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" require:"true"`
	// 用户手机号，加密 && 脱敏传输
	TbrPhone *string `json:"tbr_phone,omitempty" xml:"tbr_phone,omitempty" require:"true"`
	// 身份证， 加密 && 脱敏传输
	TbrIdCard *string `json:"tbr_id_card,omitempty" xml:"tbr_id_card,omitempty" require:"true"`
}

func (s GetRightplatformUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRightplatformUrlRequest) GoString() string {
	return s.String()
}

func (s *GetRightplatformUrlRequest) SetAuthToken(v string) *GetRightplatformUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetRightApplyNo(v string) *GetRightplatformUrlRequest {
	s.RightApplyNo = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetApplyLimitAmount(v string) *GetRightplatformUrlRequest {
	s.ApplyLimitAmount = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetDataLicensor(v string) *GetRightplatformUrlRequest {
	s.DataLicensor = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetCallbackUrl(v string) *GetRightplatformUrlRequest {
	s.CallbackUrl = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetProductCode(v string) *GetRightplatformUrlRequest {
	s.ProductCode = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetTbrName(v string) *GetRightplatformUrlRequest {
	s.TbrName = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetTbrPhone(v string) *GetRightplatformUrlRequest {
	s.TbrPhone = &v
	return s
}

func (s *GetRightplatformUrlRequest) SetTbrIdCard(v string) *GetRightplatformUrlRequest {
	s.TbrIdCard = &v
	return s
}

type GetRightplatformUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益申请编号
	RightApplyNo *string `json:"right_apply_no,omitempty" xml:"right_apply_no,omitempty"`
	// 权益产品地址
	RightUrl *string `json:"right_url,omitempty" xml:"right_url,omitempty"`
	// 两轮车延保险产品id
	//
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
}

func (s GetRightplatformUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRightplatformUrlResponse) GoString() string {
	return s.String()
}

func (s *GetRightplatformUrlResponse) SetReqMsgId(v string) *GetRightplatformUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRightplatformUrlResponse) SetResultCode(v string) *GetRightplatformUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRightplatformUrlResponse) SetResultMsg(v string) *GetRightplatformUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRightplatformUrlResponse) SetRightApplyNo(v string) *GetRightplatformUrlResponse {
	s.RightApplyNo = &v
	return s
}

func (s *GetRightplatformUrlResponse) SetRightUrl(v string) *GetRightplatformUrlResponse {
	s.RightUrl = &v
	return s
}

func (s *GetRightplatformUrlResponse) SetProductId(v string) *GetRightplatformUrlResponse {
	s.ProductId = &v
	return s
}

type UpdateRightplatformApplyinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 申请权益编号
	RightApplyNo *string `json:"right_apply_no,omitempty" xml:"right_apply_no,omitempty" require:"true"`
	// 申请额度
	ApplyLimitAmount *string `json:"apply_limit_amount,omitempty" xml:"apply_limit_amount,omitempty" require:"true"`
	// 申请额度状态
	ApplyStatus *string `json:"apply_status,omitempty" xml:"apply_status,omitempty" require:"true"`
	// 投保信息，json字符串
	ApplyInfo *string `json:"apply_info,omitempty" xml:"apply_info,omitempty" require:"true"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s UpdateRightplatformApplyinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRightplatformApplyinfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateRightplatformApplyinfoRequest) SetAuthToken(v string) *UpdateRightplatformApplyinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRightplatformApplyinfoRequest) SetRightApplyNo(v string) *UpdateRightplatformApplyinfoRequest {
	s.RightApplyNo = &v
	return s
}

func (s *UpdateRightplatformApplyinfoRequest) SetApplyLimitAmount(v string) *UpdateRightplatformApplyinfoRequest {
	s.ApplyLimitAmount = &v
	return s
}

func (s *UpdateRightplatformApplyinfoRequest) SetApplyStatus(v string) *UpdateRightplatformApplyinfoRequest {
	s.ApplyStatus = &v
	return s
}

func (s *UpdateRightplatformApplyinfoRequest) SetApplyInfo(v string) *UpdateRightplatformApplyinfoRequest {
	s.ApplyInfo = &v
	return s
}

func (s *UpdateRightplatformApplyinfoRequest) SetProductCode(v string) *UpdateRightplatformApplyinfoRequest {
	s.ProductCode = &v
	return s
}

type UpdateRightplatformApplyinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 申请权益编号
	RightApplyNo *string `json:"right_apply_no,omitempty" xml:"right_apply_no,omitempty"`
}

func (s UpdateRightplatformApplyinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRightplatformApplyinfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateRightplatformApplyinfoResponse) SetReqMsgId(v string) *UpdateRightplatformApplyinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRightplatformApplyinfoResponse) SetResultCode(v string) *UpdateRightplatformApplyinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRightplatformApplyinfoResponse) SetResultMsg(v string) *UpdateRightplatformApplyinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRightplatformApplyinfoResponse) SetRightApplyNo(v string) *UpdateRightplatformApplyinfoResponse {
	s.RightApplyNo = &v
	return s
}

type NotifyInterestScenesubjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水号，每次请求不一样
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 权益流水号
	InterestNo *string `json:"interest_no,omitempty" xml:"interest_no,omitempty" require:"true"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 申请审批额度，单位元
	ApplyLimitAmount *string `json:"apply_limit_amount,omitempty" xml:"apply_limit_amount,omitempty"`
	// 申请额度审批状态
	ApplyLimitStatus *string `json:"apply_limit_status,omitempty" xml:"apply_limit_status,omitempty" require:"true"`
	// 权益标的信息,JSON字符串
	InterestSubjectInfo *string `json:"interest_subject_info,omitempty" xml:"interest_subject_info,omitempty"`
	// 权益版本
	InterestVersion *string `json:"interest_version,omitempty" xml:"interest_version,omitempty"`
}

func (s NotifyInterestScenesubjectRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestScenesubjectRequest) GoString() string {
	return s.String()
}

func (s *NotifyInterestScenesubjectRequest) SetAuthToken(v string) *NotifyInterestScenesubjectRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetRequestNo(v string) *NotifyInterestScenesubjectRequest {
	s.RequestNo = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetInterestNo(v string) *NotifyInterestScenesubjectRequest {
	s.InterestNo = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetProductCode(v string) *NotifyInterestScenesubjectRequest {
	s.ProductCode = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetApplyLimitAmount(v string) *NotifyInterestScenesubjectRequest {
	s.ApplyLimitAmount = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetApplyLimitStatus(v string) *NotifyInterestScenesubjectRequest {
	s.ApplyLimitStatus = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetInterestSubjectInfo(v string) *NotifyInterestScenesubjectRequest {
	s.InterestSubjectInfo = &v
	return s
}

func (s *NotifyInterestScenesubjectRequest) SetInterestVersion(v string) *NotifyInterestScenesubjectRequest {
	s.InterestVersion = &v
	return s
}

type NotifyInterestScenesubjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s NotifyInterestScenesubjectResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestScenesubjectResponse) GoString() string {
	return s.String()
}

func (s *NotifyInterestScenesubjectResponse) SetReqMsgId(v string) *NotifyInterestScenesubjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyInterestScenesubjectResponse) SetResultCode(v string) *NotifyInterestScenesubjectResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyInterestScenesubjectResponse) SetResultMsg(v string) *NotifyInterestScenesubjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyInterestScenesubjectResponse) SetBizResult(v string) *NotifyInterestScenesubjectResponse {
	s.BizResult = &v
	return s
}

type QueryInterestSuppliersubjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 权益流水号
	InterestNo *string `json:"interest_no,omitempty" xml:"interest_no,omitempty" require:"true"`
}

func (s QueryInterestSuppliersubjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInterestSuppliersubjectRequest) GoString() string {
	return s.String()
}

func (s *QueryInterestSuppliersubjectRequest) SetAuthToken(v string) *QueryInterestSuppliersubjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInterestSuppliersubjectRequest) SetOrderNo(v string) *QueryInterestSuppliersubjectRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryInterestSuppliersubjectRequest) SetInterestNo(v string) *QueryInterestSuppliersubjectRequest {
	s.InterestNo = &v
	return s
}

type QueryInterestSuppliersubjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryInterestSuppliersubjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInterestSuppliersubjectResponse) GoString() string {
	return s.String()
}

func (s *QueryInterestSuppliersubjectResponse) SetReqMsgId(v string) *QueryInterestSuppliersubjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInterestSuppliersubjectResponse) SetResultCode(v string) *QueryInterestSuppliersubjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInterestSuppliersubjectResponse) SetResultMsg(v string) *QueryInterestSuppliersubjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInterestSuppliersubjectResponse) SetBizResult(v string) *QueryInterestSuppliersubjectResponse {
	s.BizResult = &v
	return s
}

type NotifyInterestSupplierpolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水号，每次推送需要唯一
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 我方权益申请流水号
	InterestNo *string `json:"interest_no,omitempty" xml:"interest_no,omitempty" require:"true"`
	// 保单信息 json字符串
	PolicyInfo *string `json:"policy_info,omitempty" xml:"policy_info,omitempty" require:"true"`
}

func (s NotifyInterestSupplierpolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestSupplierpolicyRequest) GoString() string {
	return s.String()
}

func (s *NotifyInterestSupplierpolicyRequest) SetAuthToken(v string) *NotifyInterestSupplierpolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyInterestSupplierpolicyRequest) SetRequestNo(v string) *NotifyInterestSupplierpolicyRequest {
	s.RequestNo = &v
	return s
}

func (s *NotifyInterestSupplierpolicyRequest) SetInterestNo(v string) *NotifyInterestSupplierpolicyRequest {
	s.InterestNo = &v
	return s
}

func (s *NotifyInterestSupplierpolicyRequest) SetPolicyInfo(v string) *NotifyInterestSupplierpolicyRequest {
	s.PolicyInfo = &v
	return s
}

type NotifyInterestSupplierpolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s NotifyInterestSupplierpolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestSupplierpolicyResponse) GoString() string {
	return s.String()
}

func (s *NotifyInterestSupplierpolicyResponse) SetReqMsgId(v string) *NotifyInterestSupplierpolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyInterestSupplierpolicyResponse) SetResultCode(v string) *NotifyInterestSupplierpolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyInterestSupplierpolicyResponse) SetResultMsg(v string) *NotifyInterestSupplierpolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyInterestSupplierpolicyResponse) SetBizResult(v string) *NotifyInterestSupplierpolicyResponse {
	s.BizResult = &v
	return s
}

type GetInterestUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 权益申请编号，重新提交需要不一样
	RightApplyNo *string `json:"right_apply_no,omitempty" xml:"right_apply_no,omitempty" require:"true"`
	//
	// 申请额度，最多保留小数点后两位，单位元
	ApplyLimitAmount *string `json:"apply_limit_amount,omitempty" xml:"apply_limit_amount,omitempty" require:"true"`
	//
	// 数据授权方名称
	DataLicensor *string `json:"data_licensor,omitempty" xml:"data_licensor,omitempty" require:"true"`
	// 回调场景方地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 权益产品编码，暂时固定
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 用户姓名 明文
	TbrName *string `json:"tbr_name,omitempty" xml:"tbr_name,omitempty" require:"true"`
	// 用户手机号，明文
	TbrPhone *string `json:"tbr_phone,omitempty" xml:"tbr_phone,omitempty" require:"true"`
	// 用户身份证，明文
	TbrIdCard *string `json:"tbr_id_card,omitempty" xml:"tbr_id_card,omitempty" require:"true"`
	// 场景方信息,JSON字符串
	SceneInfo *string `json:"scene_info,omitempty" xml:"scene_info,omitempty"`
	// 权益版本
	InterestVersion *string `json:"interest_version,omitempty" xml:"interest_version,omitempty"`
	// 产品信息
	ProductInfo *string `json:"product_info,omitempty" xml:"product_info,omitempty"`
}

func (s GetInterestUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInterestUrlRequest) GoString() string {
	return s.String()
}

func (s *GetInterestUrlRequest) SetAuthToken(v string) *GetInterestUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInterestUrlRequest) SetRightApplyNo(v string) *GetInterestUrlRequest {
	s.RightApplyNo = &v
	return s
}

func (s *GetInterestUrlRequest) SetApplyLimitAmount(v string) *GetInterestUrlRequest {
	s.ApplyLimitAmount = &v
	return s
}

func (s *GetInterestUrlRequest) SetDataLicensor(v string) *GetInterestUrlRequest {
	s.DataLicensor = &v
	return s
}

func (s *GetInterestUrlRequest) SetCallbackUrl(v string) *GetInterestUrlRequest {
	s.CallbackUrl = &v
	return s
}

func (s *GetInterestUrlRequest) SetProductCode(v string) *GetInterestUrlRequest {
	s.ProductCode = &v
	return s
}

func (s *GetInterestUrlRequest) SetTbrName(v string) *GetInterestUrlRequest {
	s.TbrName = &v
	return s
}

func (s *GetInterestUrlRequest) SetTbrPhone(v string) *GetInterestUrlRequest {
	s.TbrPhone = &v
	return s
}

func (s *GetInterestUrlRequest) SetTbrIdCard(v string) *GetInterestUrlRequest {
	s.TbrIdCard = &v
	return s
}

func (s *GetInterestUrlRequest) SetSceneInfo(v string) *GetInterestUrlRequest {
	s.SceneInfo = &v
	return s
}

func (s *GetInterestUrlRequest) SetInterestVersion(v string) *GetInterestUrlRequest {
	s.InterestVersion = &v
	return s
}

func (s *GetInterestUrlRequest) SetProductInfo(v string) *GetInterestUrlRequest {
	s.ProductInfo = &v
	return s
}

type GetInterestUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s GetInterestUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInterestUrlResponse) GoString() string {
	return s.String()
}

func (s *GetInterestUrlResponse) SetReqMsgId(v string) *GetInterestUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInterestUrlResponse) SetResultCode(v string) *GetInterestUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInterestUrlResponse) SetResultMsg(v string) *GetInterestUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInterestUrlResponse) SetBizResult(v string) *GetInterestUrlResponse {
	s.BizResult = &v
	return s
}

type QueryInterestSceneorderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水号
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 我方权益申请流水号
	InterestNo *string `json:"interest_no,omitempty" xml:"interest_no,omitempty" require:"true"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s QueryInterestSceneorderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInterestSceneorderRequest) GoString() string {
	return s.String()
}

func (s *QueryInterestSceneorderRequest) SetAuthToken(v string) *QueryInterestSceneorderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInterestSceneorderRequest) SetRequestNo(v string) *QueryInterestSceneorderRequest {
	s.RequestNo = &v
	return s
}

func (s *QueryInterestSceneorderRequest) SetInterestNo(v string) *QueryInterestSceneorderRequest {
	s.InterestNo = &v
	return s
}

func (s *QueryInterestSceneorderRequest) SetProductCode(v string) *QueryInterestSceneorderRequest {
	s.ProductCode = &v
	return s
}

type QueryInterestSceneorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryInterestSceneorderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInterestSceneorderResponse) GoString() string {
	return s.String()
}

func (s *QueryInterestSceneorderResponse) SetReqMsgId(v string) *QueryInterestSceneorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInterestSceneorderResponse) SetResultCode(v string) *QueryInterestSceneorderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInterestSceneorderResponse) SetResultMsg(v string) *QueryInterestSceneorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInterestSceneorderResponse) SetBizResult(v string) *QueryInterestSceneorderResponse {
	s.BizResult = &v
	return s
}

type NotifyInterestSupplierorderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水号，每次唯一
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 贵方订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 我方权益编号
	InterestNo *string `json:"interest_no,omitempty" xml:"interest_no,omitempty" require:"true"`
	// 用户授权状态
	UserPermitStatus *string `json:"user_permit_status,omitempty" xml:"user_permit_status,omitempty" require:"true"`
	// 权益订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 退款金额，单位元
	RefundAmount *string `json:"refund_amount,omitempty" xml:"refund_amount,omitempty"`
	// 退款时间
	RefundTime *string `json:"refund_time,omitempty" xml:"refund_time,omitempty"`
	// 公证状态
	NotaryStatus *string `json:"notary_status,omitempty" xml:"notary_status,omitempty"`
	// 支付时间
	PaymentTime *string `json:"payment_time,omitempty" xml:"payment_time,omitempty"`
	// 版本号
	InterestVersion *string `json:"interest_version,omitempty" xml:"interest_version,omitempty"`
}

func (s NotifyInterestSupplierorderRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestSupplierorderRequest) GoString() string {
	return s.String()
}

func (s *NotifyInterestSupplierorderRequest) SetAuthToken(v string) *NotifyInterestSupplierorderRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetRequestNo(v string) *NotifyInterestSupplierorderRequest {
	s.RequestNo = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetOrderNo(v string) *NotifyInterestSupplierorderRequest {
	s.OrderNo = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetInterestNo(v string) *NotifyInterestSupplierorderRequest {
	s.InterestNo = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetUserPermitStatus(v string) *NotifyInterestSupplierorderRequest {
	s.UserPermitStatus = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetOrderStatus(v string) *NotifyInterestSupplierorderRequest {
	s.OrderStatus = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetRefundAmount(v string) *NotifyInterestSupplierorderRequest {
	s.RefundAmount = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetRefundTime(v string) *NotifyInterestSupplierorderRequest {
	s.RefundTime = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetNotaryStatus(v string) *NotifyInterestSupplierorderRequest {
	s.NotaryStatus = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetPaymentTime(v string) *NotifyInterestSupplierorderRequest {
	s.PaymentTime = &v
	return s
}

func (s *NotifyInterestSupplierorderRequest) SetInterestVersion(v string) *NotifyInterestSupplierorderRequest {
	s.InterestVersion = &v
	return s
}

type NotifyInterestSupplierorderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s NotifyInterestSupplierorderResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyInterestSupplierorderResponse) GoString() string {
	return s.String()
}

func (s *NotifyInterestSupplierorderResponse) SetReqMsgId(v string) *NotifyInterestSupplierorderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyInterestSupplierorderResponse) SetResultCode(v string) *NotifyInterestSupplierorderResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyInterestSupplierorderResponse) SetResultMsg(v string) *NotifyInterestSupplierorderResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyInterestSupplierorderResponse) SetBizResult(v string) *NotifyInterestSupplierorderResponse {
	s.BizResult = &v
	return s
}

type ReceiveLeadMarketRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 线索唯一id
	LeadId *string `json:"lead_id,omitempty" xml:"lead_id,omitempty" require:"true"`
	// 本次固定传LMKT_LEADS_TRANSFER
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 业务参数，json
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ReceiveLeadMarketRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveLeadMarketRequest) GoString() string {
	return s.String()
}

func (s *ReceiveLeadMarketRequest) SetAuthToken(v string) *ReceiveLeadMarketRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveLeadMarketRequest) SetLeadId(v string) *ReceiveLeadMarketRequest {
	s.LeadId = &v
	return s
}

func (s *ReceiveLeadMarketRequest) SetProductCode(v string) *ReceiveLeadMarketRequest {
	s.ProductCode = &v
	return s
}

func (s *ReceiveLeadMarketRequest) SetBizContent(v string) *ReceiveLeadMarketRequest {
	s.BizContent = &v
	return s
}

type ReceiveLeadMarketResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s ReceiveLeadMarketResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveLeadMarketResponse) GoString() string {
	return s.String()
}

func (s *ReceiveLeadMarketResponse) SetReqMsgId(v string) *ReceiveLeadMarketResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveLeadMarketResponse) SetResultCode(v string) *ReceiveLeadMarketResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveLeadMarketResponse) SetResultMsg(v string) *ReceiveLeadMarketResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReceiveLeadMarketResponse) SetBizResult(v string) *ReceiveLeadMarketResponse {
	s.BizResult = &v
	return s
}

type GetMarketingInsureurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求 id，做防重校验逻辑
	// 接口根据 requestId 做防重校验逻辑，若重复会报错
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"128"`
	// 保司编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true" maxLength:"64"`
	// 保司出单机构编码，若没有同保司编码
	IssueOrg *string `json:"issue_org,omitempty" xml:"issue_org,omitempty" require:"true" maxLength:"64"`
	// 保司产品编码
	ChannelProductCode *string `json:"channel_product_code,omitempty" xml:"channel_product_code,omitempty" require:"true" maxLength:"64"`
	// 保险产品类型，枚举：
	// STANDARD（均分）
	// PREMIUM（大小均分）
	// GIFT_TRANSFER（赠转商）
	ChannelProductType *string `json:"channel_product_type,omitempty" xml:"channel_product_type,omitempty" require:"true" maxLength:"64"`
	// 保险方案
	InsurancePlan *string `json:"insurance_plan,omitempty" xml:"insurance_plan,omitempty" require:"true" maxLength:"20"`
	// 一级渠道编码
	FirstChannel *string `json:"first_channel,omitempty" xml:"first_channel,omitempty" require:"true" maxLength:"64"`
	// 二级渠道编码
	SecondChannel *string `json:"second_channel,omitempty" xml:"second_channel,omitempty" maxLength:"64"`
	// 三级渠道/广告版位
	AdvertisingPosition *string `json:"advertising_position,omitempty" xml:"advertising_position,omitempty" maxLength:"64"`
	// 设备类型/用户类型，枚举：
	// muid
	// oaid
	// caid
	// imei
	// idfa
	// userid
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true" maxLength:"64"`
	// 设备编号/用户编号
	DeviceId *string `json:"device_id,omitempty" xml:"device_id,omitempty" require:"true" maxLength:"64"`
	// 点击时间 yyyy-MM-dd HH:mm:ss
	ClickTime *string `json:"click_time,omitempty" xml:"click_time,omitempty" require:"true" maxLength:"20"`
	// 订单编号
	SceneOrderNo *string `json:"scene_order_no,omitempty" xml:"scene_order_no,omitempty" require:"true" maxLength:"64"`
	// 投保人姓名
	ApplicantName *string `json:"applicant_name,omitempty" xml:"applicant_name,omitempty" maxLength:"64"`
	// 投保人证件号
	ApplicantCertNo *string `json:"applicant_cert_no,omitempty" xml:"applicant_cert_no,omitempty" maxLength:"64"`
	// 投保人联系方式
	ApplicantPhone *string `json:"applicant_phone,omitempty" xml:"applicant_phone,omitempty" maxLength:"64"`
}

func (s GetMarketingInsureurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMarketingInsureurlRequest) GoString() string {
	return s.String()
}

func (s *GetMarketingInsureurlRequest) SetAuthToken(v string) *GetMarketingInsureurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetRequestId(v string) *GetMarketingInsureurlRequest {
	s.RequestId = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetProductCode(v string) *GetMarketingInsureurlRequest {
	s.ProductCode = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetChannelCode(v string) *GetMarketingInsureurlRequest {
	s.ChannelCode = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetIssueOrg(v string) *GetMarketingInsureurlRequest {
	s.IssueOrg = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetChannelProductCode(v string) *GetMarketingInsureurlRequest {
	s.ChannelProductCode = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetChannelProductType(v string) *GetMarketingInsureurlRequest {
	s.ChannelProductType = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetInsurancePlan(v string) *GetMarketingInsureurlRequest {
	s.InsurancePlan = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetFirstChannel(v string) *GetMarketingInsureurlRequest {
	s.FirstChannel = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetSecondChannel(v string) *GetMarketingInsureurlRequest {
	s.SecondChannel = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetAdvertisingPosition(v string) *GetMarketingInsureurlRequest {
	s.AdvertisingPosition = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetDeviceType(v string) *GetMarketingInsureurlRequest {
	s.DeviceType = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetDeviceId(v string) *GetMarketingInsureurlRequest {
	s.DeviceId = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetClickTime(v string) *GetMarketingInsureurlRequest {
	s.ClickTime = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetSceneOrderNo(v string) *GetMarketingInsureurlRequest {
	s.SceneOrderNo = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetApplicantName(v string) *GetMarketingInsureurlRequest {
	s.ApplicantName = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetApplicantCertNo(v string) *GetMarketingInsureurlRequest {
	s.ApplicantCertNo = &v
	return s
}

func (s *GetMarketingInsureurlRequest) SetApplicantPhone(v string) *GetMarketingInsureurlRequest {
	s.ApplicantPhone = &v
	return s
}

type GetMarketingInsureurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求 id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 一级渠道编码
	FirstChannel *string `json:"first_channel,omitempty" xml:"first_channel,omitempty"`
	// 二级渠道编码
	SecondChannel *string `json:"second_channel,omitempty" xml:"second_channel,omitempty"`
	// 三级渠道/广告版位
	AdvertisingPosition *string `json:"advertising_position,omitempty" xml:"advertising_position,omitempty"`
	// 订单号
	SceneOrderNo *string `json:"scene_order_no,omitempty" xml:"scene_order_no,omitempty"`
	// 特征编码
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
	// 投保页面URL
	InsureUrl *string `json:"insure_url,omitempty" xml:"insure_url,omitempty"`
}

func (s GetMarketingInsureurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMarketingInsureurlResponse) GoString() string {
	return s.String()
}

func (s *GetMarketingInsureurlResponse) SetReqMsgId(v string) *GetMarketingInsureurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetResultCode(v string) *GetMarketingInsureurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetResultMsg(v string) *GetMarketingInsureurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetRequestId(v string) *GetMarketingInsureurlResponse {
	s.RequestId = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetFirstChannel(v string) *GetMarketingInsureurlResponse {
	s.FirstChannel = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetSecondChannel(v string) *GetMarketingInsureurlResponse {
	s.SecondChannel = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetAdvertisingPosition(v string) *GetMarketingInsureurlResponse {
	s.AdvertisingPosition = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetSceneOrderNo(v string) *GetMarketingInsureurlResponse {
	s.SceneOrderNo = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetClickId(v string) *GetMarketingInsureurlResponse {
	s.ClickId = &v
	return s
}

func (s *GetMarketingInsureurlResponse) SetInsureUrl(v string) *GetMarketingInsureurlResponse {
	s.InsureUrl = &v
	return s
}

type CallbackMarketingEventRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求 id，做防重校验逻辑
	// 接口根据 requestId 做防重校验逻辑，若重复会报错
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true" maxLength:"128"`
	// 特征编码
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty" require:"true" maxLength:"64"`
	// 点击时间
	ClickTime *string `json:"click_time,omitempty" xml:"click_time,omitempty" require:"true" maxLength:"20"`
	// 事件类型，枚举：
	// RESERVATION_CHECK（留资）；
	// FIRST_PICK_FREE（领增）；
	// LOW_INSURANCE（低价险）；
	// HIGH_INSURANCE（高价险）；
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true" maxLength:"20"`
	// 事件完成时间（yyyy-MM-dd  HH:mm:ss）
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true" maxLength:"20"`
	// 一级渠道编码
	FirstChannel *string `json:"first_channel,omitempty" xml:"first_channel,omitempty" require:"true" maxLength:"64"`
	// 二级渠道编码
	SecondChannel *string `json:"second_channel,omitempty" xml:"second_channel,omitempty" maxLength:"64"`
	// 三级渠道/广告版位
	AdvertisingPosition *string `json:"advertising_position,omitempty" xml:"advertising_position,omitempty" maxLength:"64"`
	// 业务字段，json格式
	EventInfo *string `json:"event_info,omitempty" xml:"event_info,omitempty" require:"true"`
}

func (s CallbackMarketingEventRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackMarketingEventRequest) GoString() string {
	return s.String()
}

func (s *CallbackMarketingEventRequest) SetAuthToken(v string) *CallbackMarketingEventRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetRequestId(v string) *CallbackMarketingEventRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetClickId(v string) *CallbackMarketingEventRequest {
	s.ClickId = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetClickTime(v string) *CallbackMarketingEventRequest {
	s.ClickTime = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetEventCode(v string) *CallbackMarketingEventRequest {
	s.EventCode = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetEventTime(v string) *CallbackMarketingEventRequest {
	s.EventTime = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetFirstChannel(v string) *CallbackMarketingEventRequest {
	s.FirstChannel = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetSecondChannel(v string) *CallbackMarketingEventRequest {
	s.SecondChannel = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetAdvertisingPosition(v string) *CallbackMarketingEventRequest {
	s.AdvertisingPosition = &v
	return s
}

func (s *CallbackMarketingEventRequest) SetEventInfo(v string) *CallbackMarketingEventRequest {
	s.EventInfo = &v
	return s
}

type CallbackMarketingEventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求 id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackMarketingEventResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackMarketingEventResponse) GoString() string {
	return s.String()
}

func (s *CallbackMarketingEventResponse) SetReqMsgId(v string) *CallbackMarketingEventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackMarketingEventResponse) SetResultCode(v string) *CallbackMarketingEventResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackMarketingEventResponse) SetResultMsg(v string) *CallbackMarketingEventResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackMarketingEventResponse) SetRequestId(v string) *CallbackMarketingEventResponse {
	s.RequestId = &v
	return s
}

type CallbackMarketingPolicycancelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求 id，做防重校验逻辑
	// 接口根据 requestId 做防重校验逻辑，若重复会报错
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 保单号（可脱敏处理）
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 退保时间（yyyy-MM-dd  HH:mm:ss）
	CancelTime *string `json:"cancel_time,omitempty" xml:"cancel_time,omitempty" require:"true"`
	// 保险止期（yyyy-MM-dd  HH:mm:ss）
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s CallbackMarketingPolicycancelRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackMarketingPolicycancelRequest) GoString() string {
	return s.String()
}

func (s *CallbackMarketingPolicycancelRequest) SetAuthToken(v string) *CallbackMarketingPolicycancelRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackMarketingPolicycancelRequest) SetRequestId(v string) *CallbackMarketingPolicycancelRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackMarketingPolicycancelRequest) SetPolicyNo(v string) *CallbackMarketingPolicycancelRequest {
	s.PolicyNo = &v
	return s
}

func (s *CallbackMarketingPolicycancelRequest) SetCancelTime(v string) *CallbackMarketingPolicycancelRequest {
	s.CancelTime = &v
	return s
}

func (s *CallbackMarketingPolicycancelRequest) SetEndTime(v string) *CallbackMarketingPolicycancelRequest {
	s.EndTime = &v
	return s
}

type CallbackMarketingPolicycancelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求 id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CallbackMarketingPolicycancelResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackMarketingPolicycancelResponse) GoString() string {
	return s.String()
}

func (s *CallbackMarketingPolicycancelResponse) SetReqMsgId(v string) *CallbackMarketingPolicycancelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackMarketingPolicycancelResponse) SetResultCode(v string) *CallbackMarketingPolicycancelResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackMarketingPolicycancelResponse) SetResultMsg(v string) *CallbackMarketingPolicycancelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackMarketingPolicycancelResponse) SetRequestId(v string) *CallbackMarketingPolicycancelResponse {
	s.RequestId = &v
	return s
}

type QueryLeadMarketRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 请求时的线索唯一id
	LeadId *string `json:"lead_id,omitempty" xml:"lead_id,omitempty" require:"true"`
	// 业务参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryLeadMarketRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLeadMarketRequest) GoString() string {
	return s.String()
}

func (s *QueryLeadMarketRequest) SetAuthToken(v string) *QueryLeadMarketRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLeadMarketRequest) SetProductCode(v string) *QueryLeadMarketRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryLeadMarketRequest) SetLeadId(v string) *QueryLeadMarketRequest {
	s.LeadId = &v
	return s
}

func (s *QueryLeadMarketRequest) SetBizContent(v string) *QueryLeadMarketRequest {
	s.BizContent = &v
	return s
}

type QueryLeadMarketResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// JSON字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryLeadMarketResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLeadMarketResponse) GoString() string {
	return s.String()
}

func (s *QueryLeadMarketResponse) SetReqMsgId(v string) *QueryLeadMarketResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLeadMarketResponse) SetResultCode(v string) *QueryLeadMarketResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLeadMarketResponse) SetResultMsg(v string) *QueryLeadMarketResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLeadMarketResponse) SetBizResult(v string) *QueryLeadMarketResponse {
	s.BizResult = &v
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
				"sdk_version":      tea.String("1.11.3"),
				"_prod_code":       tea.String("INSURANCE_SAAS"),
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
 * Description: 保险询报价结果查询
 * Summary: 保险询报价结果查询
 */
func (client *Client) QueryInquiry(request *QueryInquiryRequest) (_result *QueryInquiryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInquiryResponse{}
	_body, _err := client.QueryInquiryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险询报价结果查询
 * Summary: 保险询报价结果查询
 */
func (client *Client) QueryInquiryEx(request *QueryInquiryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInquiryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInquiryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.inquiry.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险产品询价
 * Summary: 保险产品询价
 */
func (client *Client) SubmitInquiry(request *SubmitInquiryRequest) (_result *SubmitInquiryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInquiryResponse{}
	_body, _err := client.SubmitInquiryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险产品询价
 * Summary: 保险产品询价
 */
func (client *Client) SubmitInquiryEx(request *SubmitInquiryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInquiryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInquiryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.inquiry.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 历史灾害查询
 * Summary: 历史灾害数据查询
 */
func (client *Client) QueryDataDisaster(request *QueryDataDisasterRequest) (_result *QueryDataDisasterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataDisasterResponse{}
	_body, _err := client.QueryDataDisasterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 历史灾害查询
 * Summary: 历史灾害数据查询
 */
func (client *Client) QueryDataDisasterEx(request *QueryDataDisasterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataDisasterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataDisasterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.data.disaster.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实时天气预警
 * Summary: 实时天气预警
 */
func (client *Client) QueryDataWeather(request *QueryDataWeatherRequest) (_result *QueryDataWeatherResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDataWeatherResponse{}
	_body, _err := client.QueryDataWeatherEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实时天气预警
 * Summary: 实时天气预警
 */
func (client *Client) QueryDataWeatherEx(request *QueryDataWeatherRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDataWeatherResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDataWeatherResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.data.weather.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 报价接口同步接口
 * Summary: 报价接口同步接口
 */
func (client *Client) SyncQuote(request *SyncQuoteRequest) (_result *SyncQuoteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncQuoteResponse{}
	_body, _err := client.SyncQuoteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 报价接口同步接口
 * Summary: 报价接口同步接口
 */
func (client *Client) SyncQuoteEx(request *SyncQuoteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncQuoteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncQuoteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.quote.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 承保自核申请接口
 * Summary: 承保自核申请接口
 */
func (client *Client) ApplyUnderwriting(request *ApplyUnderwritingRequest) (_result *ApplyUnderwritingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyUnderwritingResponse{}
	_body, _err := client.ApplyUnderwritingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 承保自核申请接口
 * Summary: 承保自核申请接口
 */
func (client *Client) ApplyUnderwritingEx(request *ApplyUnderwritingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyUnderwritingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyUnderwritingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.underwriting.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 承保自核结果查询接口
 * Summary: 承保自核结果查询接口
 */
func (client *Client) QueryUnderwriting(request *QueryUnderwritingRequest) (_result *QueryUnderwritingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUnderwritingResponse{}
	_body, _err := client.QueryUnderwritingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 承保自核结果查询接口
 * Summary: 承保自核结果查询接口
 */
func (client *Client) QueryUnderwritingEx(request *QueryUnderwritingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUnderwritingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUnderwritingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.underwriting.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
 * Summary: 保险科技保单附件查询接口
 */
func (client *Client) QueryPolicyFile(request *QueryPolicyFileRequest) (_result *QueryPolicyFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPolicyFileResponse{}
	_body, _err := client.QueryPolicyFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
 * Summary: 保险科技保单附件查询接口
 */
func (client *Client) QueryPolicyFileEx(request *QueryPolicyFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPolicyFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPolicyFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.policy.file.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险SaaS投保申请接口
 * Summary: 投保申请接口
 */
func (client *Client) ApplyInsure(request *ApplyInsureRequest) (_result *ApplyInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyInsureResponse{}
	_body, _err := client.ApplyInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险SaaS投保申请接口
 * Summary: 投保申请接口
 */
func (client *Client) ApplyInsureEx(request *ApplyInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.insure.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
 * Summary: 保单结果同步（依赖投保申请）
 */
func (client *Client) NotifyPolicyResult(request *NotifyPolicyResultRequest) (_result *NotifyPolicyResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyPolicyResultResponse{}
	_body, _err := client.NotifyPolicyResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
 * Summary: 保单结果同步（依赖投保申请）
 */
func (client *Client) NotifyPolicyResultEx(request *NotifyPolicyResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyPolicyResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyPolicyResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.policy.result.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 报案接口
 * Summary: 保险科技 报案接口
 */
func (client *Client) ApplyClaim(request *ApplyClaimRequest) (_result *ApplyClaimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyClaimResponse{}
	_body, _err := client.ApplyClaimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 报案接口
 * Summary: 保险科技 报案接口
 */
func (client *Client) ApplyClaimEx(request *ApplyClaimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyClaimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyClaimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.claim.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 报案撤销（场景端）
 * Summary: 报案撤销（场景端）
 */
func (client *Client) CancelClaim(request *CancelClaimRequest) (_result *CancelClaimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelClaimResponse{}
	_body, _err := client.CancelClaimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 报案撤销（场景端）
 * Summary: 报案撤销（场景端）
 */
func (client *Client) CancelClaimEx(request *CancelClaimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelClaimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelClaimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.claim.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 报案材料更新（场景端）
 * Summary: 报案材料更新（场景端）
 */
func (client *Client) UpdateClaimMaterial(request *UpdateClaimMaterialRequest) (_result *UpdateClaimMaterialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateClaimMaterialResponse{}
	_body, _err := client.UpdateClaimMaterialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 报案材料更新（场景端）
 * Summary: 报案材料更新（场景端）
 */
func (client *Client) UpdateClaimMaterialEx(request *UpdateClaimMaterialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateClaimMaterialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateClaimMaterialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.claim.material.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 理赔结果确认（场景端）
 * Summary: 理赔结果确认（场景端）
 */
func (client *Client) ConfirmClaimSettle(request *ConfirmClaimSettleRequest) (_result *ConfirmClaimSettleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmClaimSettleResponse{}
	_body, _err := client.ConfirmClaimSettleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 理赔结果确认（场景端）
 * Summary: 理赔结果确认（场景端）
 */
func (client *Client) ConfirmClaimSettleEx(request *ConfirmClaimSettleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmClaimSettleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmClaimSettleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.claim.settle.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 理赔结案通知（保司端）
 * Summary: 理赔结案通知（保司端）
 */
func (client *Client) FinishClaimSettle(request *FinishClaimSettleRequest) (_result *FinishClaimSettleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishClaimSettleResponse{}
	_body, _err := client.FinishClaimSettleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 理赔结案通知（保司端）
 * Summary: 理赔结案通知（保司端）
 */
func (client *Client) FinishClaimSettleEx(request *FinishClaimSettleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishClaimSettleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishClaimSettleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.claim.settle.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险批改自核接口
 * Summary: 保险批改自核接口
 */
func (client *Client) ApplyEndorsementStrategy(request *ApplyEndorsementStrategyRequest) (_result *ApplyEndorsementStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyEndorsementStrategyResponse{}
	_body, _err := client.ApplyEndorsementStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险批改自核接口
 * Summary: 保险批改自核接口
 */
func (client *Client) ApplyEndorsementStrategyEx(request *ApplyEndorsementStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyEndorsementStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyEndorsementStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.endorsement.strategy.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单信息离线同步
 * Summary: 保单信息离线同步
 */
func (client *Client) SyncPolicyResult(request *SyncPolicyResultRequest) (_result *SyncPolicyResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncPolicyResultResponse{}
	_body, _err := client.SyncPolicyResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单信息离线同步
 * Summary: 保单信息离线同步
 */
func (client *Client) SyncPolicyResultEx(request *SyncPolicyResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncPolicyResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncPolicyResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.policy.result.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于通知单号查询保险投保结果
 * Summary: 保险投保结果查询
 */
func (client *Client) QueryInsureResult(request *QueryInsureResultRequest) (_result *QueryInsureResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInsureResultResponse{}
	_body, _err := client.QueryInsureResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于通知单号查询保险投保结果
 * Summary: 保险投保结果查询
 */
func (client *Client) QueryInsureResultEx(request *QueryInsureResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInsureResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInsureResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.insure.result.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 投保测试接口
 * Summary: 投保测试接口
 */
func (client *Client) ApplyInsureTest(request *ApplyInsureTestRequest) (_result *ApplyInsureTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyInsureTestResponse{}
	_body, _err := client.ApplyInsureTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 投保测试接口
 * Summary: 投保测试接口
 */
func (client *Client) ApplyInsureTestEx(request *ApplyInsureTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyInsureTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyInsureTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.insure.test.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 本接口用于调查报案数据的提交
 * Summary: 调查报案提交接口
 */
func (client *Client) SubmitInvestigateCase(request *SubmitInvestigateCaseRequest) (_result *SubmitInvestigateCaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitInvestigateCaseResponse{}
	_body, _err := client.SubmitInvestigateCaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 本接口用于调查报案数据的提交
 * Summary: 调查报案提交接口
 */
func (client *Client) SubmitInvestigateCaseEx(request *SubmitInvestigateCaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitInvestigateCaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitInvestigateCaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.investigate.case.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 回销结果查询接口
 * Summary: 回销结果查询接口
 */
func (client *Client) QueryReverseCommission(request *QueryReverseCommissionRequest) (_result *QueryReverseCommissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryReverseCommissionResponse{}
	_body, _err := client.QueryReverseCommissionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 回销结果查询接口
 * Summary: 回销结果查询接口
 */
func (client *Client) QueryReverseCommissionEx(request *QueryReverseCommissionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryReverseCommissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryReverseCommissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.reverse.commission.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 嵌入式保险服务卡片url链接获取
 * Summary: 嵌入式保险服务卡片url链接获取
 */
func (client *Client) GetEmbedcardUrl(request *GetEmbedcardUrlRequest) (_result *GetEmbedcardUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetEmbedcardUrlResponse{}
	_body, _err := client.GetEmbedcardUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 嵌入式保险服务卡片url链接获取
 * Summary: 嵌入式保险服务卡片url链接获取
 */
func (client *Client) GetEmbedcardUrlEx(request *GetEmbedcardUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetEmbedcardUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetEmbedcardUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.embedcard.url.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 嵌入式保险服务打款成功出单接口
 * Summary: 嵌入式保险服务打款成功出单接口
 */
func (client *Client) IssueEmbedcardPaysuc(request *IssueEmbedcardPaysucRequest) (_result *IssueEmbedcardPaysucResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &IssueEmbedcardPaysucResponse{}
	_body, _err := client.IssueEmbedcardPaysucEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 嵌入式保险服务打款成功出单接口
 * Summary: 嵌入式保险服务打款成功出单接口
 */
func (client *Client) IssueEmbedcardPaysucEx(request *IssueEmbedcardPaysucRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *IssueEmbedcardPaysucResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &IssueEmbedcardPaysucResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.embedcard.paysuc.issue"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 嵌入式主机厂车险url链接获取
 * Summary: 嵌入式主机厂车险url链接获取
 */
func (client *Client) GetEmbedoemautoinsuranceUrl(request *GetEmbedoemautoinsuranceUrlRequest) (_result *GetEmbedoemautoinsuranceUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetEmbedoemautoinsuranceUrlResponse{}
	_body, _err := client.GetEmbedoemautoinsuranceUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 嵌入式主机厂车险url链接获取
 * Summary: 嵌入式主机厂车险url链接获取
 */
func (client *Client) GetEmbedoemautoinsuranceUrlEx(request *GetEmbedoemautoinsuranceUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetEmbedoemautoinsuranceUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetEmbedoemautoinsuranceUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.embedoemautoinsurance.url.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景方获取权益链接
 * Summary: 场景方获取权益链接
 */
func (client *Client) GetRightplatformUrl(request *GetRightplatformUrlRequest) (_result *GetRightplatformUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRightplatformUrlResponse{}
	_body, _err := client.GetRightplatformUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景方获取权益链接
 * Summary: 场景方获取权益链接
 */
func (client *Client) GetRightplatformUrlEx(request *GetRightplatformUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRightplatformUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRightplatformUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.rightplatform.url.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新申请额度状态&投保人信息
 * Summary: 更新申请额度状态&投保人信息
 */
func (client *Client) UpdateRightplatformApplyinfo(request *UpdateRightplatformApplyinfoRequest) (_result *UpdateRightplatformApplyinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRightplatformApplyinfoResponse{}
	_body, _err := client.UpdateRightplatformApplyinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新申请额度状态&投保人信息
 * Summary: 更新申请额度状态&投保人信息
 */
func (client *Client) UpdateRightplatformApplyinfoEx(request *UpdateRightplatformApplyinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRightplatformApplyinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRightplatformApplyinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.rightplatform.applyinfo.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景方标的信息通知
 * Summary: 场景方标的信息通知
 */
func (client *Client) NotifyInterestScenesubject(request *NotifyInterestScenesubjectRequest) (_result *NotifyInterestScenesubjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyInterestScenesubjectResponse{}
	_body, _err := client.NotifyInterestScenesubjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景方标的信息通知
 * Summary: 场景方标的信息通知
 */
func (client *Client) NotifyInterestScenesubjectEx(request *NotifyInterestScenesubjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyInterestScenesubjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyInterestScenesubjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.scenesubject.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益服务商标的信息查询
 * Summary: 权益服务商标的信息查询
 */
func (client *Client) QueryInterestSuppliersubject(request *QueryInterestSuppliersubjectRequest) (_result *QueryInterestSuppliersubjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInterestSuppliersubjectResponse{}
	_body, _err := client.QueryInterestSuppliersubjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益服务商标的信息查询
 * Summary: 权益服务商标的信息查询
 */
func (client *Client) QueryInterestSuppliersubjectEx(request *QueryInterestSuppliersubjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInterestSuppliersubjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInterestSuppliersubjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.suppliersubject.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益服务商投保后通知保单信息
 * Summary: 权益服务商投保后通知保单信息
 */
func (client *Client) NotifyInterestSupplierpolicy(request *NotifyInterestSupplierpolicyRequest) (_result *NotifyInterestSupplierpolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyInterestSupplierpolicyResponse{}
	_body, _err := client.NotifyInterestSupplierpolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益服务商投保后通知保单信息
 * Summary: 权益服务商投保后通知保单信息
 */
func (client *Client) NotifyInterestSupplierpolicyEx(request *NotifyInterestSupplierpolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyInterestSupplierpolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyInterestSupplierpolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.supplierpolicy.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景方获取权益链接
 * Summary: 场景方获取权益链接
 */
func (client *Client) GetInterestUrl(request *GetInterestUrlRequest) (_result *GetInterestUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInterestUrlResponse{}
	_body, _err := client.GetInterestUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景方获取权益链接
 * Summary: 场景方获取权益链接
 */
func (client *Client) GetInterestUrlEx(request *GetInterestUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInterestUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInterestUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.url.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景方订单信息查询
 * Summary: 场景方订单信息查询
 */
func (client *Client) QueryInterestSceneorder(request *QueryInterestSceneorderRequest) (_result *QueryInterestSceneorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInterestSceneorderResponse{}
	_body, _err := client.QueryInterestSceneorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景方订单信息查询
 * Summary: 场景方订单信息查询
 */
func (client *Client) QueryInterestSceneorderEx(request *QueryInterestSceneorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInterestSceneorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInterestSceneorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.sceneorder.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益服务商订单状态通知
 * Summary: 权益服务商订单状态通知
 */
func (client *Client) NotifyInterestSupplierorder(request *NotifyInterestSupplierorderRequest) (_result *NotifyInterestSupplierorderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyInterestSupplierorderResponse{}
	_body, _err := client.NotifyInterestSupplierorderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益服务商订单状态通知
 * Summary: 权益服务商订单状态通知
 */
func (client *Client) NotifyInterestSupplierorderEx(request *NotifyInterestSupplierorderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyInterestSupplierorderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyInterestSupplierorderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.interest.supplierorder.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车险线索营销结果接收
 * Summary: 车险线索营销结果接收
 */
func (client *Client) ReceiveLeadMarket(request *ReceiveLeadMarketRequest) (_result *ReceiveLeadMarketResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveLeadMarketResponse{}
	_body, _err := client.ReceiveLeadMarketEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车险线索营销结果接收
 * Summary: 车险线索营销结果接收
 */
func (client *Client) ReceiveLeadMarketEx(request *ReceiveLeadMarketRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveLeadMarketResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveLeadMarketResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.lead.market.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销投保短链获取
 * Summary: 营销投保短链获取
 */
func (client *Client) GetMarketingInsureurl(request *GetMarketingInsureurlRequest) (_result *GetMarketingInsureurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMarketingInsureurlResponse{}
	_body, _err := client.GetMarketingInsureurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销投保短链获取
 * Summary: 营销投保短链获取
 */
func (client *Client) GetMarketingInsureurlEx(request *GetMarketingInsureurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMarketingInsureurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMarketingInsureurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.marketing.insureurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销保单出单信息事件回传
 * Summary: 营销保单出单信息事件回传
 */
func (client *Client) CallbackMarketingEvent(request *CallbackMarketingEventRequest) (_result *CallbackMarketingEventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackMarketingEventResponse{}
	_body, _err := client.CallbackMarketingEventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销保单出单信息事件回传
 * Summary: 营销保单出单信息事件回传
 */
func (client *Client) CallbackMarketingEventEx(request *CallbackMarketingEventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackMarketingEventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackMarketingEventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.marketing.event.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销退保信息回传
 * Summary: 营销退保事件回传
 */
func (client *Client) CallbackMarketingPolicycancel(request *CallbackMarketingPolicycancelRequest) (_result *CallbackMarketingPolicycancelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackMarketingPolicycancelResponse{}
	_body, _err := client.CallbackMarketingPolicycancelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销退保信息回传
 * Summary: 营销退保事件回传
 */
func (client *Client) CallbackMarketingPolicycancelEx(request *CallbackMarketingPolicycancelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackMarketingPolicycancelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackMarketingPolicycancelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.marketing.policycancel.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 车险线索查询
 * Summary: 车险线索查询
 */
func (client *Client) QueryLeadMarket(request *QueryLeadMarketRequest) (_result *QueryLeadMarketResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLeadMarketResponse{}
	_body, _err := client.QueryLeadMarketEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 车险线索查询
 * Summary: 车险线索查询
 */
func (client *Client) QueryLeadMarketEx(request *QueryLeadMarketRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLeadMarketResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLeadMarketResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.insurance.lead.market.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
