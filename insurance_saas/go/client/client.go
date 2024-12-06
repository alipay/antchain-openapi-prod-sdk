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
				"sdk_version":      tea.String("1.7.10"),
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
