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

// 分类碳排放量
type EmissionsCategoryStatistics struct {
	// 排放类型编码
	EmissionDategoryNo *string `json:"emission_dategory_no,omitempty" xml:"emission_dategory_no,omitempty" require:"true"`
	// 排放类型名称
	EmissionCategoryName *string `json:"emission_category_name,omitempty" xml:"emission_category_name,omitempty" require:"true"`
	// 排放量
	Emissions *int64 `json:"emissions,omitempty" xml:"emissions,omitempty" require:"true"`
}

func (s EmissionsCategoryStatistics) String() string {
	return tea.Prettify(s)
}

func (s EmissionsCategoryStatistics) GoString() string {
	return s.String()
}

func (s *EmissionsCategoryStatistics) SetEmissionDategoryNo(v string) *EmissionsCategoryStatistics {
	s.EmissionDategoryNo = &v
	return s
}

func (s *EmissionsCategoryStatistics) SetEmissionCategoryName(v string) *EmissionsCategoryStatistics {
	s.EmissionCategoryName = &v
	return s
}

func (s *EmissionsCategoryStatistics) SetEmissions(v int64) *EmissionsCategoryStatistics {
	s.Emissions = &v
	return s
}

// 证书授权产品信息
type CertProductAuthDO struct {
	// 三方平台产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 三方平台产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
}

func (s CertProductAuthDO) String() string {
	return tea.Prettify(s)
}

func (s CertProductAuthDO) GoString() string {
	return s.String()
}

func (s *CertProductAuthDO) SetProductId(v string) *CertProductAuthDO {
	s.ProductId = &v
	return s
}

func (s *CertProductAuthDO) SetProductName(v string) *CertProductAuthDO {
	s.ProductName = &v
	return s
}

// 证书产品信息，包括证书详情、授权产品信息
type CertProductInfoDO struct {
	// 同证书信息显示
	CertificationNo *string `json:"certification_no,omitempty" xml:"certification_no,omitempty" require:"true"`
	// 同证书信息显示
	CertificationType *string `json:"certification_type,omitempty" xml:"certification_type,omitempty" require:"true"`
	// 同证书信息显示
	CertificationName *string `json:"certification_name,omitempty" xml:"certification_name,omitempty" require:"true"`
	// 同证书信息显示
	AuthenticationName *string `json:"authentication_name,omitempty" xml:"authentication_name,omitempty" require:"true"`
	// 证书颁发时间
	IssueTime *string `json:"issue_time,omitempty" xml:"issue_time,omitempty" require:"true"`
	// 证书到期时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" require:"true"`
	// 同证书信息显示
	CertificationAgent *string `json:"certification_agent,omitempty" xml:"certification_agent,omitempty" require:"true"`
	// 同证书信息显示
	Manufacturer *string `json:"manufacturer,omitempty" xml:"manufacturer,omitempty"`
	// 同证书信息显示
	CproductFirm *string `json:"cproduct_firm,omitempty" xml:"cproduct_firm,omitempty"`
	// 同证书信息显示
	CertificationLevel *string `json:"certification_level,omitempty" xml:"certification_level,omitempty"`
	// 同证书信息显示
	CproductName *string `json:"cproduct_name,omitempty" xml:"cproduct_name,omitempty"`
	// 同证书信息显示
	CproductModel *string `json:"cproduct_model,omitempty" xml:"cproduct_model,omitempty"`
	// 证书文件地址
	CertificationFileAddress *string `json:"certification_file_address,omitempty" xml:"certification_file_address,omitempty" require:"true"`
	// 证书授权的三方平台产品列表
	AuthProducts []*CertProductAuthDO `json:"auth_products,omitempty" xml:"auth_products,omitempty" type:"Repeated"`
}

func (s CertProductInfoDO) String() string {
	return tea.Prettify(s)
}

func (s CertProductInfoDO) GoString() string {
	return s.String()
}

func (s *CertProductInfoDO) SetCertificationNo(v string) *CertProductInfoDO {
	s.CertificationNo = &v
	return s
}

func (s *CertProductInfoDO) SetCertificationType(v string) *CertProductInfoDO {
	s.CertificationType = &v
	return s
}

func (s *CertProductInfoDO) SetCertificationName(v string) *CertProductInfoDO {
	s.CertificationName = &v
	return s
}

func (s *CertProductInfoDO) SetAuthenticationName(v string) *CertProductInfoDO {
	s.AuthenticationName = &v
	return s
}

func (s *CertProductInfoDO) SetIssueTime(v string) *CertProductInfoDO {
	s.IssueTime = &v
	return s
}

func (s *CertProductInfoDO) SetInvalidTime(v string) *CertProductInfoDO {
	s.InvalidTime = &v
	return s
}

func (s *CertProductInfoDO) SetCertificationAgent(v string) *CertProductInfoDO {
	s.CertificationAgent = &v
	return s
}

func (s *CertProductInfoDO) SetManufacturer(v string) *CertProductInfoDO {
	s.Manufacturer = &v
	return s
}

func (s *CertProductInfoDO) SetCproductFirm(v string) *CertProductInfoDO {
	s.CproductFirm = &v
	return s
}

func (s *CertProductInfoDO) SetCertificationLevel(v string) *CertProductInfoDO {
	s.CertificationLevel = &v
	return s
}

func (s *CertProductInfoDO) SetCproductName(v string) *CertProductInfoDO {
	s.CproductName = &v
	return s
}

func (s *CertProductInfoDO) SetCproductModel(v string) *CertProductInfoDO {
	s.CproductModel = &v
	return s
}

func (s *CertProductInfoDO) SetCertificationFileAddress(v string) *CertProductInfoDO {
	s.CertificationFileAddress = &v
	return s
}

func (s *CertProductInfoDO) SetAuthProducts(v []*CertProductAuthDO) *CertProductInfoDO {
	s.AuthProducts = v
	return s
}

// 减排情况统计
type EmissionsReductionStatistics struct {
	// 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
	ReductionType *string `json:"reduction_type,omitempty" xml:"reduction_type,omitempty" require:"true"`
	// 减排措施名称
	ReductionMeasureName *string `json:"reduction_measure_name,omitempty" xml:"reduction_measure_name,omitempty" require:"true"`
	// 减排方案编码
	ReductionProposalNo *string `json:"reduction_proposal_no,omitempty" xml:"reduction_proposal_no,omitempty" require:"true"`
	// 减排量
	ReductionEmissions *int64 `json:"reduction_emissions,omitempty" xml:"reduction_emissions,omitempty" require:"true"`
	// 减排量单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
}

func (s EmissionsReductionStatistics) String() string {
	return tea.Prettify(s)
}

func (s EmissionsReductionStatistics) GoString() string {
	return s.String()
}

func (s *EmissionsReductionStatistics) SetReductionType(v string) *EmissionsReductionStatistics {
	s.ReductionType = &v
	return s
}

func (s *EmissionsReductionStatistics) SetReductionMeasureName(v string) *EmissionsReductionStatistics {
	s.ReductionMeasureName = &v
	return s
}

func (s *EmissionsReductionStatistics) SetReductionProposalNo(v string) *EmissionsReductionStatistics {
	s.ReductionProposalNo = &v
	return s
}

func (s *EmissionsReductionStatistics) SetReductionEmissions(v int64) *EmissionsReductionStatistics {
	s.ReductionEmissions = &v
	return s
}

func (s *EmissionsReductionStatistics) SetUnit(v string) *EmissionsReductionStatistics {
	s.Unit = &v
	return s
}

// 每日碳排放量
type DailyEmissions struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 排放量值
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s DailyEmissions) String() string {
	return tea.Prettify(s)
}

func (s DailyEmissions) GoString() string {
	return s.String()
}

func (s *DailyEmissions) SetDate(v string) *DailyEmissions {
	s.Date = &v
	return s
}

func (s *DailyEmissions) SetValue(v int64) *DailyEmissions {
	s.Value = &v
	return s
}

// 排放范围排放数据统计
type EmissionsScopeStatistics struct {
	// 盘查范围编码
	InventoryScopeNo *string `json:"inventory_scope_no,omitempty" xml:"inventory_scope_no,omitempty" require:"true"`
	// 盘查范围名称
	InventoryScopeName *string `json:"inventory_scope_name,omitempty" xml:"inventory_scope_name,omitempty" require:"true"`
	// 碳排放量
	Emissions *int64 `json:"emissions,omitempty" xml:"emissions,omitempty" require:"true"`
	// 排放占比
	Percentage *int64 `json:"percentage,omitempty" xml:"percentage,omitempty" require:"true"`
	// 范围下各分类排放数据
	CategoryEmissionsList []*EmissionsCategoryStatistics `json:"category_emissions_list,omitempty" xml:"category_emissions_list,omitempty" require:"true" type:"Repeated"`
}

func (s EmissionsScopeStatistics) String() string {
	return tea.Prettify(s)
}

func (s EmissionsScopeStatistics) GoString() string {
	return s.String()
}

func (s *EmissionsScopeStatistics) SetInventoryScopeNo(v string) *EmissionsScopeStatistics {
	s.InventoryScopeNo = &v
	return s
}

func (s *EmissionsScopeStatistics) SetInventoryScopeName(v string) *EmissionsScopeStatistics {
	s.InventoryScopeName = &v
	return s
}

func (s *EmissionsScopeStatistics) SetEmissions(v int64) *EmissionsScopeStatistics {
	s.Emissions = &v
	return s
}

func (s *EmissionsScopeStatistics) SetPercentage(v int64) *EmissionsScopeStatistics {
	s.Percentage = &v
	return s
}

func (s *EmissionsScopeStatistics) SetCategoryEmissionsList(v []*EmissionsCategoryStatistics) *EmissionsScopeStatistics {
	s.CategoryEmissionsList = v
	return s
}

type DescribeAcarActivityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s DescribeAcarActivityRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarActivityRequest) GoString() string {
	return s.String()
}

func (s *DescribeAcarActivityRequest) SetAuthToken(v string) *DescribeAcarActivityRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeAcarActivityRequest) SetProductInstanceId(v string) *DescribeAcarActivityRequest {
	s.ProductInstanceId = &v
	return s
}

type DescribeAcarActivityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活动主办方名称
	Sponsor *string `json:"sponsor,omitempty" xml:"sponsor,omitempty"`
	// 大型活动名称
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty"`
	// 当前开展的活动主体名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty"`
	// 当前活动主体编码
	EnterpriseNo *string `json:"enterprise_no,omitempty" xml:"enterprise_no,omitempty"`
	// 当前主体活动开始日期
	EnterpriseStartDate *string `json:"enterprise_start_date,omitempty" xml:"enterprise_start_date,omitempty"`
	// 当前主体活动结束日期
	EnterpriseEndDate *string `json:"enterprise_end_date,omitempty" xml:"enterprise_end_date,omitempty"`
	// 当前活动是否已经经过碳排放认证
	Authed *bool `json:"authed,omitempty" xml:"authed,omitempty"`
}

func (s DescribeAcarActivityResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarActivityResponse) GoString() string {
	return s.String()
}

func (s *DescribeAcarActivityResponse) SetReqMsgId(v string) *DescribeAcarActivityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetResultCode(v string) *DescribeAcarActivityResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetResultMsg(v string) *DescribeAcarActivityResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetSponsor(v string) *DescribeAcarActivityResponse {
	s.Sponsor = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetActivityName(v string) *DescribeAcarActivityResponse {
	s.ActivityName = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetEnterpriseName(v string) *DescribeAcarActivityResponse {
	s.EnterpriseName = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetEnterpriseNo(v string) *DescribeAcarActivityResponse {
	s.EnterpriseNo = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetEnterpriseStartDate(v string) *DescribeAcarActivityResponse {
	s.EnterpriseStartDate = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetEnterpriseEndDate(v string) *DescribeAcarActivityResponse {
	s.EnterpriseEndDate = &v
	return s
}

func (s *DescribeAcarActivityResponse) SetAuthed(v bool) *DescribeAcarActivityResponse {
	s.Authed = &v
	return s
}

type DescribeAcarDailyemissionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s DescribeAcarDailyemissionsRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarDailyemissionsRequest) GoString() string {
	return s.String()
}

func (s *DescribeAcarDailyemissionsRequest) SetAuthToken(v string) *DescribeAcarDailyemissionsRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeAcarDailyemissionsRequest) SetProductInstanceId(v string) *DescribeAcarDailyemissionsRequest {
	s.ProductInstanceId = &v
	return s
}

type DescribeAcarDailyemissionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 净排放量
	NetEmissions *int64 `json:"net_emissions,omitempty" xml:"net_emissions,omitempty"`
	// 累计到当前时间的总碳排放量
	TotalEmissions *int64 `json:"total_emissions,omitempty" xml:"total_emissions,omitempty"`
	// 排放量单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	//  当前计算完成时间
	FinishTimestamp *string `json:"finish_timestamp,omitempty" xml:"finish_timestamp,omitempty"`
	// 活动期间每日累计的总碳排放量
	DailyEmissionsList []*DailyEmissions `json:"daily_emissions_list,omitempty" xml:"daily_emissions_list,omitempty" type:"Repeated"`
}

func (s DescribeAcarDailyemissionsResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarDailyemissionsResponse) GoString() string {
	return s.String()
}

func (s *DescribeAcarDailyemissionsResponse) SetReqMsgId(v string) *DescribeAcarDailyemissionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetResultCode(v string) *DescribeAcarDailyemissionsResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetResultMsg(v string) *DescribeAcarDailyemissionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetNetEmissions(v int64) *DescribeAcarDailyemissionsResponse {
	s.NetEmissions = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetTotalEmissions(v int64) *DescribeAcarDailyemissionsResponse {
	s.TotalEmissions = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetUnit(v string) *DescribeAcarDailyemissionsResponse {
	s.Unit = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetFinishTimestamp(v string) *DescribeAcarDailyemissionsResponse {
	s.FinishTimestamp = &v
	return s
}

func (s *DescribeAcarDailyemissionsResponse) SetDailyEmissionsList(v []*DailyEmissions) *DescribeAcarDailyemissionsResponse {
	s.DailyEmissionsList = v
	return s
}

type DescribeAcarScopemissionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s DescribeAcarScopemissionRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarScopemissionRequest) GoString() string {
	return s.String()
}

func (s *DescribeAcarScopemissionRequest) SetAuthToken(v string) *DescribeAcarScopemissionRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeAcarScopemissionRequest) SetProductInstanceId(v string) *DescribeAcarScopemissionRequest {
	s.ProductInstanceId = &v
	return s
}

type DescribeAcarScopemissionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总排放量
	TotalEmissions *int64 `json:"total_emissions,omitempty" xml:"total_emissions,omitempty"`
	// 单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 各范围的排放情况列表
	ScopeEmissionsList []*EmissionsScopeStatistics `json:"scope_emissions_list,omitempty" xml:"scope_emissions_list,omitempty" type:"Repeated"`
}

func (s DescribeAcarScopemissionResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarScopemissionResponse) GoString() string {
	return s.String()
}

func (s *DescribeAcarScopemissionResponse) SetReqMsgId(v string) *DescribeAcarScopemissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeAcarScopemissionResponse) SetResultCode(v string) *DescribeAcarScopemissionResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeAcarScopemissionResponse) SetResultMsg(v string) *DescribeAcarScopemissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeAcarScopemissionResponse) SetTotalEmissions(v int64) *DescribeAcarScopemissionResponse {
	s.TotalEmissions = &v
	return s
}

func (s *DescribeAcarScopemissionResponse) SetUnit(v string) *DescribeAcarScopemissionResponse {
	s.Unit = &v
	return s
}

func (s *DescribeAcarScopemissionResponse) SetScopeEmissionsList(v []*EmissionsScopeStatistics) *DescribeAcarScopemissionResponse {
	s.ScopeEmissionsList = v
	return s
}

type DescribeAcarReductionemissionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s DescribeAcarReductionemissionsRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarReductionemissionsRequest) GoString() string {
	return s.String()
}

func (s *DescribeAcarReductionemissionsRequest) SetAuthToken(v string) *DescribeAcarReductionemissionsRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeAcarReductionemissionsRequest) SetProductInstanceId(v string) *DescribeAcarReductionemissionsRequest {
	s.ProductInstanceId = &v
	return s
}

type DescribeAcarReductionemissionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 减排情况列表
	List []*EmissionsReductionStatistics `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s DescribeAcarReductionemissionsResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarReductionemissionsResponse) GoString() string {
	return s.String()
}

func (s *DescribeAcarReductionemissionsResponse) SetReqMsgId(v string) *DescribeAcarReductionemissionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeAcarReductionemissionsResponse) SetResultCode(v string) *DescribeAcarReductionemissionsResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeAcarReductionemissionsResponse) SetResultMsg(v string) *DescribeAcarReductionemissionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeAcarReductionemissionsResponse) SetList(v []*EmissionsReductionStatistics) *DescribeAcarReductionemissionsResponse {
	s.List = v
	return s
}

type DescribeAcarLastemissiondataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s DescribeAcarLastemissiondataRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarLastemissiondataRequest) GoString() string {
	return s.String()
}

func (s *DescribeAcarLastemissiondataRequest) SetAuthToken(v string) *DescribeAcarLastemissiondataRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeAcarLastemissiondataRequest) SetProductInstanceId(v string) *DescribeAcarLastemissiondataRequest {
	s.ProductInstanceId = &v
	return s
}

type DescribeAcarLastemissiondataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 主体活动编码
	EnterpriseNo *string `json:"enterprise_no,omitempty" xml:"enterprise_no,omitempty"`
	// 盘查范围编码
	InventoryScopeNo *string `json:"inventory_scope_no,omitempty" xml:"inventory_scope_no,omitempty"`
	// 盘查范围名称
	InventoryScopeName *string `json:"inventory_scope_name,omitempty" xml:"inventory_scope_name,omitempty"`
	// 排放类型编码
	EmissionCategoryNo *string `json:"emission_category_no,omitempty" xml:"emission_category_no,omitempty"`
	// 排放类型名称
	EmissionCategoryName *string `json:"emission_category_name,omitempty" xml:"emission_category_name,omitempty"`
	// 排放源编码
	EmissionSourceNo *string `json:"emission_source_no,omitempty" xml:"emission_source_no,omitempty"`
	// 排放源名称
	EmissionSourceName *string `json:"emission_source_name,omitempty" xml:"emission_source_name,omitempty"`
	// 活动场馆编码
	EnterpriseWorkspaceNo *string `json:"enterprise_workspace_no,omitempty" xml:"enterprise_workspace_no,omitempty"`
	// 活动场馆名称
	EnterpriseWorkspaceName *string `json:"enterprise_workspace_name,omitempty" xml:"enterprise_workspace_name,omitempty"`
	// 排放量计算要素编码
	EmissionsAnalysisFactorNo *string `json:"emissions_analysis_factor_no,omitempty" xml:"emissions_analysis_factor_no,omitempty"`
	// 排放量计算要素值
	EmissionsAnalysisFactorValue *string `json:"emissions_analysis_factor_value,omitempty" xml:"emissions_analysis_factor_value,omitempty"`
	// 发生日期
	OccurrenceDate *string `json:"occurrence_date,omitempty" xml:"occurrence_date,omitempty"`
	// 排放数据录入明细编码
	EmissionDataEntryItemNo *string `json:"emission_data_entry_item_no,omitempty" xml:"emission_data_entry_item_no,omitempty"`
	// 排放源用量
	EmissionDourceDosage *int64 `json:"emission_dource_dosage,omitempty" xml:"emission_dource_dosage,omitempty"`
	// 用量单位：
	// WNm3("万Nm3","天然气消耗用量单位"),
	// GJ("GJ","燃烧产生的热量单位或外购热力单位"),
	// t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
	// MWh("MWh","外购电力或数据中心用电量单位"),
	// km("km","公里，通勤用车或员工差旅旅程单位"),
	// tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
	// PCT("%","百分比，如碳氧化率，或者气体逸散率");
	DosageUnit *string `json:"dosage_unit,omitempty" xml:"dosage_unit,omitempty"`
	// 数据录入人账号
	SubmitterNo *string `json:"submitter_no,omitempty" xml:"submitter_no,omitempty"`
	// 提交人姓名
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
	// 数据录入时间
	SubmissionTime *string `json:"submission_time,omitempty" xml:"submission_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 盘查排放类型的数据录入方式：
	// ManualEntry("手动录入方式"),
	// FileUpload("文件导入方式"),
	// AutoGeneration("自动产生");
	DataEntryType *string `json:"data_entry_type,omitempty" xml:"data_entry_type,omitempty"`
}

func (s DescribeAcarLastemissiondataResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeAcarLastemissiondataResponse) GoString() string {
	return s.String()
}

func (s *DescribeAcarLastemissiondataResponse) SetReqMsgId(v string) *DescribeAcarLastemissiondataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetResultCode(v string) *DescribeAcarLastemissiondataResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetResultMsg(v string) *DescribeAcarLastemissiondataResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEnterpriseNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EnterpriseNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetInventoryScopeNo(v string) *DescribeAcarLastemissiondataResponse {
	s.InventoryScopeNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetInventoryScopeName(v string) *DescribeAcarLastemissiondataResponse {
	s.InventoryScopeName = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionCategoryNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionCategoryNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionCategoryName(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionCategoryName = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionSourceNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionSourceNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionSourceName(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionSourceName = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEnterpriseWorkspaceNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EnterpriseWorkspaceNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEnterpriseWorkspaceName(v string) *DescribeAcarLastemissiondataResponse {
	s.EnterpriseWorkspaceName = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionsAnalysisFactorNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionsAnalysisFactorNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionsAnalysisFactorValue(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionsAnalysisFactorValue = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetOccurrenceDate(v string) *DescribeAcarLastemissiondataResponse {
	s.OccurrenceDate = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionDataEntryItemNo(v string) *DescribeAcarLastemissiondataResponse {
	s.EmissionDataEntryItemNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetEmissionDourceDosage(v int64) *DescribeAcarLastemissiondataResponse {
	s.EmissionDourceDosage = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetDosageUnit(v string) *DescribeAcarLastemissiondataResponse {
	s.DosageUnit = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetSubmitterNo(v string) *DescribeAcarLastemissiondataResponse {
	s.SubmitterNo = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetSubmitterName(v string) *DescribeAcarLastemissiondataResponse {
	s.SubmitterName = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetSubmissionTime(v string) *DescribeAcarLastemissiondataResponse {
	s.SubmissionTime = &v
	return s
}

func (s *DescribeAcarLastemissiondataResponse) SetDataEntryType(v string) *DescribeAcarLastemissiondataResponse {
	s.DataEntryType = &v
	return s
}

type QueryThirdCertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 三方平台的产品ID
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty"`
	// GreenProductCertification ：绿色产品认证证书
	// GarbonNeutrality ： 碳中和证书
	// GreenhouseGasInventory 温室气体核查证书
	CertificationType *string `json:"certification_type,omitempty" xml:"certification_type,omitempty"`
	// 证书文件中的产品名称
	CproductName *string `json:"cproduct_name,omitempty" xml:"cproduct_name,omitempty"`
	// 证书文件中的产品型号
	CproductModel *string `json:"cproduct_model,omitempty" xml:"cproduct_model,omitempty"`
	// 证书文件中的生产商名称
	CproductFirm *string `json:"cproduct_firm,omitempty" xml:"cproduct_firm,omitempty"`
	// 三方平台的企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s QueryThirdCertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThirdCertRequest) GoString() string {
	return s.String()
}

func (s *QueryThirdCertRequest) SetAuthToken(v string) *QueryThirdCertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThirdCertRequest) SetProductInstanceId(v string) *QueryThirdCertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThirdCertRequest) SetProductId(v string) *QueryThirdCertRequest {
	s.ProductId = &v
	return s
}

func (s *QueryThirdCertRequest) SetCertificationType(v string) *QueryThirdCertRequest {
	s.CertificationType = &v
	return s
}

func (s *QueryThirdCertRequest) SetCproductName(v string) *QueryThirdCertRequest {
	s.CproductName = &v
	return s
}

func (s *QueryThirdCertRequest) SetCproductModel(v string) *QueryThirdCertRequest {
	s.CproductModel = &v
	return s
}

func (s *QueryThirdCertRequest) SetCproductFirm(v string) *QueryThirdCertRequest {
	s.CproductFirm = &v
	return s
}

func (s *QueryThirdCertRequest) SetCompanyId(v string) *QueryThirdCertRequest {
	s.CompanyId = &v
	return s
}

type QueryThirdCertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书列表
	Certifications []*CertProductInfoDO `json:"certifications,omitempty" xml:"certifications,omitempty" type:"Repeated"`
}

func (s QueryThirdCertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThirdCertResponse) GoString() string {
	return s.String()
}

func (s *QueryThirdCertResponse) SetReqMsgId(v string) *QueryThirdCertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThirdCertResponse) SetResultCode(v string) *QueryThirdCertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThirdCertResponse) SetResultMsg(v string) *QueryThirdCertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThirdCertResponse) SetCertifications(v []*CertProductInfoDO) *QueryThirdCertResponse {
	s.Certifications = v
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
				"sdk_version":      tea.String("1.0.5"),
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
 * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
 * Summary: 查询当前活动资料信息
 */
func (client *Client) DescribeAcarActivity(request *DescribeAcarActivityRequest) (_result *DescribeAcarActivityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeAcarActivityResponse{}
	_body, _err := client.DescribeAcarActivityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
 * Summary: 查询当前活动资料信息
 */
func (client *Client) DescribeAcarActivityEx(request *DescribeAcarActivityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeAcarActivityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeAcarActivityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.acar.activity.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
 * Summary: 查询当前活动的每日碳排放量
 */
func (client *Client) DescribeAcarDailyemissions(request *DescribeAcarDailyemissionsRequest) (_result *DescribeAcarDailyemissionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeAcarDailyemissionsResponse{}
	_body, _err := client.DescribeAcarDailyemissionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
 * Summary: 查询当前活动的每日碳排放量
 */
func (client *Client) DescribeAcarDailyemissionsEx(request *DescribeAcarDailyemissionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeAcarDailyemissionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeAcarDailyemissionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.acar.dailyemissions.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
 * Summary: 查询当前活动各范围的碳排放量
 */
func (client *Client) DescribeAcarScopemission(request *DescribeAcarScopemissionRequest) (_result *DescribeAcarScopemissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeAcarScopemissionResponse{}
	_body, _err := client.DescribeAcarScopemissionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
 * Summary: 查询当前活动各范围的碳排放量
 */
func (client *Client) DescribeAcarScopemissionEx(request *DescribeAcarScopemissionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeAcarScopemissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeAcarScopemissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.acar.scopemission.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
 * Summary: 获取减排情况
 */
func (client *Client) DescribeAcarReductionemissions(request *DescribeAcarReductionemissionsRequest) (_result *DescribeAcarReductionemissionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeAcarReductionemissionsResponse{}
	_body, _err := client.DescribeAcarReductionemissionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
 * Summary: 获取减排情况
 */
func (client *Client) DescribeAcarReductionemissionsEx(request *DescribeAcarReductionemissionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeAcarReductionemissionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeAcarReductionemissionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.acar.reductionemissions.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询最近排放数据，返回最近排放数据信息
 * Summary: 查询最近排放数据
 */
func (client *Client) DescribeAcarLastemissiondata(request *DescribeAcarLastemissiondataRequest) (_result *DescribeAcarLastemissiondataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeAcarLastemissiondataResponse{}
	_body, _err := client.DescribeAcarLastemissiondataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询最近排放数据，返回最近排放数据信息
 * Summary: 查询最近排放数据
 */
func (client *Client) DescribeAcarLastemissiondataEx(request *DescribeAcarLastemissiondataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeAcarLastemissiondataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeAcarLastemissiondataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.acar.lastemissiondata.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 三方平台调用此接口，查询用户的证书信息
 * Summary: 证书查询
 */
func (client *Client) QueryThirdCert(request *QueryThirdCertRequest) (_result *QueryThirdCertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThirdCertResponse{}
	_body, _err := client.QueryThirdCertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 三方平台调用此接口，查询用户的证书信息
 * Summary: 证书查询
 */
func (client *Client) QueryThirdCertEx(request *QueryThirdCertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThirdCertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThirdCertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.third.cert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
