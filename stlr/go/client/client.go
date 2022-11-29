// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
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

//  每月的排放数据
type AnnualMonthEmissionDatum struct {
	// 统计的年份
	Year *string `json:"year,omitempty" xml:"year,omitempty" require:"true"`
	// 统计的月份
	Month *string `json:"month,omitempty" xml:"month,omitempty" require:"true"`
	// 统计排放量
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s AnnualMonthEmissionDatum) String() string {
	return tea.Prettify(s)
}

func (s AnnualMonthEmissionDatum) GoString() string {
	return s.String()
}

func (s *AnnualMonthEmissionDatum) SetYear(v string) *AnnualMonthEmissionDatum {
	s.Year = &v
	return s
}

func (s *AnnualMonthEmissionDatum) SetMonth(v string) *AnnualMonthEmissionDatum {
	s.Month = &v
	return s
}

func (s *AnnualMonthEmissionDatum) SetValue(v string) *AnnualMonthEmissionDatum {
	s.Value = &v
	return s
}

// 按绿色行为类型统计的绿色行为明细
type GreenOperationStatisticsByType struct {
	// 绿色行为类型
	GreenOperationType *string `json:"green_operation_type,omitempty" xml:"green_operation_type,omitempty" require:"true"`
	// 绿色行为类型名称
	GreenOperationTypeName *string `json:"green_operation_type_name,omitempty" xml:"green_operation_type_name,omitempty" require:"true"`
	// 绿色行为产生的绿色能量值
	GreenEnergyAmount *int64 `json:"green_energy_amount,omitempty" xml:"green_energy_amount,omitempty" require:"true"`
	// 相关类型的绿色行为记录数
	GreenOperationRecords *int64 `json:"green_operation_records,omitempty" xml:"green_operation_records,omitempty" require:"true"`
}

func (s GreenOperationStatisticsByType) String() string {
	return tea.Prettify(s)
}

func (s GreenOperationStatisticsByType) GoString() string {
	return s.String()
}

func (s *GreenOperationStatisticsByType) SetGreenOperationType(v string) *GreenOperationStatisticsByType {
	s.GreenOperationType = &v
	return s
}

func (s *GreenOperationStatisticsByType) SetGreenOperationTypeName(v string) *GreenOperationStatisticsByType {
	s.GreenOperationTypeName = &v
	return s
}

func (s *GreenOperationStatisticsByType) SetGreenEnergyAmount(v int64) *GreenOperationStatisticsByType {
	s.GreenEnergyAmount = &v
	return s
}

func (s *GreenOperationStatisticsByType) SetGreenOperationRecords(v int64) *GreenOperationStatisticsByType {
	s.GreenOperationRecords = &v
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

// 排放统计项目
type AnyStatisticalItem struct {
	// 统计项目编码
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 数据值，按字符串输出，最多保留6位小数
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 单位编码
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
	// 单位标签
	UnitLabel *string `json:"unit_label,omitempty" xml:"unit_label,omitempty" require:"true"`
}

func (s AnyStatisticalItem) String() string {
	return tea.Prettify(s)
}

func (s AnyStatisticalItem) GoString() string {
	return s.String()
}

func (s *AnyStatisticalItem) SetItemCode(v string) *AnyStatisticalItem {
	s.ItemCode = &v
	return s
}

func (s *AnyStatisticalItem) SetAmount(v string) *AnyStatisticalItem {
	s.Amount = &v
	return s
}

func (s *AnyStatisticalItem) SetUnit(v string) *AnyStatisticalItem {
	s.Unit = &v
	return s
}

func (s *AnyStatisticalItem) SetUnitLabel(v string) *AnyStatisticalItem {
	s.UnitLabel = &v
	return s
}

// 账户开通返回
type AccountRegisterResponse struct {
	// 账户did
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
}

func (s AccountRegisterResponse) String() string {
	return tea.Prettify(s)
}

func (s AccountRegisterResponse) GoString() string {
	return s.String()
}

func (s *AccountRegisterResponse) SetUserDid(v string) *AccountRegisterResponse {
	s.UserDid = &v
	return s
}

// 文档信息
type EnterpriseDocumentFile struct {
	// 文档名称
	DocumentName *string `json:"document_name,omitempty" xml:"document_name,omitempty" require:"true"`
	// 文件地址
	DocumentAddress *string `json:"document_address,omitempty" xml:"document_address,omitempty" require:"true"`
}

func (s EnterpriseDocumentFile) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseDocumentFile) GoString() string {
	return s.String()
}

func (s *EnterpriseDocumentFile) SetDocumentName(v string) *EnterpriseDocumentFile {
	s.DocumentName = &v
	return s
}

func (s *EnterpriseDocumentFile) SetDocumentAddress(v string) *EnterpriseDocumentFile {
	s.DocumentAddress = &v
	return s
}

// 区块链信息
type BlockchainDTO struct {
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 当前块高
	BlockNumber *int64 `json:"block_number,omitempty" xml:"block_number,omitempty" require:"true"`
}

func (s BlockchainDTO) String() string {
	return tea.Prettify(s)
}

func (s BlockchainDTO) GoString() string {
	return s.String()
}

func (s *BlockchainDTO) SetTxHash(v string) *BlockchainDTO {
	s.TxHash = &v
	return s
}

func (s *BlockchainDTO) SetBlockNumber(v int64) *BlockchainDTO {
	s.BlockNumber = &v
	return s
}

// 数据值条目
type AnyAmountItem struct {
	// 数据项编码
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 数据值，按字符串输出，最多保留6位小数
	ItemAmount *string `json:"item_amount,omitempty" xml:"item_amount,omitempty" require:"true"`
}

func (s AnyAmountItem) String() string {
	return tea.Prettify(s)
}

func (s AnyAmountItem) GoString() string {
	return s.String()
}

func (s *AnyAmountItem) SetItemCode(v string) *AnyAmountItem {
	s.ItemCode = &v
	return s
}

func (s *AnyAmountItem) SetItemAmount(v string) *AnyAmountItem {
	s.ItemAmount = &v
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

// 任意KV结构对象
type AnyKeywordItem struct {
	// 项目编码
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 项目值
	ItemValue *string `json:"item_value,omitempty" xml:"item_value,omitempty" require:"true"`
}

func (s AnyKeywordItem) String() string {
	return tea.Prettify(s)
}

func (s AnyKeywordItem) GoString() string {
	return s.String()
}

func (s *AnyKeywordItem) SetItemCode(v string) *AnyKeywordItem {
	s.ItemCode = &v
	return s
}

func (s *AnyKeywordItem) SetItemValue(v string) *AnyKeywordItem {
	s.ItemValue = &v
	return s
}

// 按频率统计的绿色行为明细
type GreenOperationStatisticsByFrequence struct {
	// 绿色行为发生时期
	OccurrencePeriod *string `json:"occurrence_period,omitempty" xml:"occurrence_period,omitempty" require:"true"`
	// 绿色行为产生的绿色能量值
	GreenEnergyAmount *int64 `json:"green_energy_amount,omitempty" xml:"green_energy_amount,omitempty" require:"true"`
	// 时期内发生绿色行为的记录条数
	GreenOperationRecords *int64 `json:"green_operation_records,omitempty" xml:"green_operation_records,omitempty" require:"true"`
}

func (s GreenOperationStatisticsByFrequence) String() string {
	return tea.Prettify(s)
}

func (s GreenOperationStatisticsByFrequence) GoString() string {
	return s.String()
}

func (s *GreenOperationStatisticsByFrequence) SetOccurrencePeriod(v string) *GreenOperationStatisticsByFrequence {
	s.OccurrencePeriod = &v
	return s
}

func (s *GreenOperationStatisticsByFrequence) SetGreenEnergyAmount(v int64) *GreenOperationStatisticsByFrequence {
	s.GreenEnergyAmount = &v
	return s
}

func (s *GreenOperationStatisticsByFrequence) SetGreenOperationRecords(v int64) *GreenOperationStatisticsByFrequence {
	s.GreenOperationRecords = &v
	return s
}

// 绿色行为数据摘要
type GreenOperationRecordSummary struct {
	// 绿色行为记录编码
	GreenOperationNo *string `json:"green_operation_no,omitempty" xml:"green_operation_no,omitempty" require:"true"`
	// 绿色行为类型
	GreenOperationType *string `json:"green_operation_type,omitempty" xml:"green_operation_type,omitempty" require:"true"`
	// 绿色行为类型名称
	GreenOperationTypeName *string `json:"green_operation_type_name,omitempty" xml:"green_operation_type_name,omitempty" require:"true"`
	// 发生绿色行为的相关业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty" require:"true"`
	// 绿色行为发生时间，格式应如：2021-07-21 12:11:11
	OccurrenceTime *string `json:"occurrence_time,omitempty" xml:"occurrence_time,omitempty" require:"true"`
	// 绿色行为的绿色能量值
	GreenEnergyAmount *int64 `json:"green_energy_amount,omitempty" xml:"green_energy_amount,omitempty" require:"true"`
}

func (s GreenOperationRecordSummary) String() string {
	return tea.Prettify(s)
}

func (s GreenOperationRecordSummary) GoString() string {
	return s.String()
}

func (s *GreenOperationRecordSummary) SetGreenOperationNo(v string) *GreenOperationRecordSummary {
	s.GreenOperationNo = &v
	return s
}

func (s *GreenOperationRecordSummary) SetGreenOperationType(v string) *GreenOperationRecordSummary {
	s.GreenOperationType = &v
	return s
}

func (s *GreenOperationRecordSummary) SetGreenOperationTypeName(v string) *GreenOperationRecordSummary {
	s.GreenOperationTypeName = &v
	return s
}

func (s *GreenOperationRecordSummary) SetEnterpriseBizNo(v string) *GreenOperationRecordSummary {
	s.EnterpriseBizNo = &v
	return s
}

func (s *GreenOperationRecordSummary) SetOccurrenceTime(v string) *GreenOperationRecordSummary {
	s.OccurrenceTime = &v
	return s
}

func (s *GreenOperationRecordSummary) SetGreenEnergyAmount(v int64) *GreenOperationRecordSummary {
	s.GreenEnergyAmount = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
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

type RegisterPdcpAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// PERSON("个人"),
	// ENTERPRISE("企业")
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// PASSPORT("护照"),
	// RESIDENT("身份证"),
	// NATIONAL_LEGAL_MERGE("统一社会信用代码")
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
}

func (s RegisterPdcpAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterPdcpAccountRequest) GoString() string {
	return s.String()
}

func (s *RegisterPdcpAccountRequest) SetAuthToken(v string) *RegisterPdcpAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetProductInstanceId(v string) *RegisterPdcpAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetUserType(v string) *RegisterPdcpAccountRequest {
	s.UserType = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetUserName(v string) *RegisterPdcpAccountRequest {
	s.UserName = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetUserId(v string) *RegisterPdcpAccountRequest {
	s.UserId = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetCertType(v string) *RegisterPdcpAccountRequest {
	s.CertType = &v
	return s
}

func (s *RegisterPdcpAccountRequest) SetCertNo(v string) *RegisterPdcpAccountRequest {
	s.CertNo = &v
	return s
}

type RegisterPdcpAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户开通结果
	Data *AccountRegisterResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterPdcpAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterPdcpAccountResponse) GoString() string {
	return s.String()
}

func (s *RegisterPdcpAccountResponse) SetReqMsgId(v string) *RegisterPdcpAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterPdcpAccountResponse) SetResultCode(v string) *RegisterPdcpAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterPdcpAccountResponse) SetResultMsg(v string) *RegisterPdcpAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterPdcpAccountResponse) SetData(v *AccountRegisterResponse) *RegisterPdcpAccountResponse {
	s.Data = v
	return s
}

type PushPdcpBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消息ID
	TxMsgId *string `json:"tx_msg_id,omitempty" xml:"tx_msg_id,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 数据类型，枚举定义
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 密文类型
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 待存证数据，根据数据类型序列化为json。并加密传输
	DepositData *string `json:"deposit_data,omitempty" xml:"deposit_data,omitempty" require:"true"`
}

func (s PushPdcpBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s PushPdcpBlockchainRequest) GoString() string {
	return s.String()
}

func (s *PushPdcpBlockchainRequest) SetAuthToken(v string) *PushPdcpBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetProductInstanceId(v string) *PushPdcpBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetTxMsgId(v string) *PushPdcpBlockchainRequest {
	s.TxMsgId = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetUserId(v string) *PushPdcpBlockchainRequest {
	s.UserId = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetDataType(v string) *PushPdcpBlockchainRequest {
	s.DataType = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetEncryptType(v string) *PushPdcpBlockchainRequest {
	s.EncryptType = &v
	return s
}

func (s *PushPdcpBlockchainRequest) SetDepositData(v string) *PushPdcpBlockchainRequest {
	s.DepositData = &v
	return s
}

type PushPdcpBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链信息: 交易hash，块高
	TxData *BlockchainDTO `json:"tx_data,omitempty" xml:"tx_data,omitempty"`
}

func (s PushPdcpBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s PushPdcpBlockchainResponse) GoString() string {
	return s.String()
}

func (s *PushPdcpBlockchainResponse) SetReqMsgId(v string) *PushPdcpBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushPdcpBlockchainResponse) SetResultCode(v string) *PushPdcpBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *PushPdcpBlockchainResponse) SetResultMsg(v string) *PushPdcpBlockchainResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushPdcpBlockchainResponse) SetTxData(v *BlockchainDTO) *PushPdcpBlockchainResponse {
	s.TxData = v
	return s
}

type UploadPdcpBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	TxMsgId *string `json:"tx_msg_id,omitempty" xml:"tx_msg_id,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 数据类型
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 加密类型
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 待存证数据，根据数据类型序列化后加密传输
	DepositData *string `json:"deposit_data,omitempty" xml:"deposit_data,omitempty" require:"true"`
}

func (s UploadPdcpBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadPdcpBlockchainRequest) GoString() string {
	return s.String()
}

func (s *UploadPdcpBlockchainRequest) SetAuthToken(v string) *UploadPdcpBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetProductInstanceId(v string) *UploadPdcpBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetTxMsgId(v string) *UploadPdcpBlockchainRequest {
	s.TxMsgId = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetUserId(v string) *UploadPdcpBlockchainRequest {
	s.UserId = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetDataType(v string) *UploadPdcpBlockchainRequest {
	s.DataType = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetEncryptType(v string) *UploadPdcpBlockchainRequest {
	s.EncryptType = &v
	return s
}

func (s *UploadPdcpBlockchainRequest) SetDepositData(v string) *UploadPdcpBlockchainRequest {
	s.DepositData = &v
	return s
}

type UploadPdcpBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadPdcpBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadPdcpBlockchainResponse) GoString() string {
	return s.String()
}

func (s *UploadPdcpBlockchainResponse) SetReqMsgId(v string) *UploadPdcpBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadPdcpBlockchainResponse) SetResultCode(v string) *UploadPdcpBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadPdcpBlockchainResponse) SetResultMsg(v string) *UploadPdcpBlockchainResponse {
	s.ResultMsg = &v
	return s
}

type GetPdcpBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	TxMsgId *string `json:"tx_msg_id,omitempty" xml:"tx_msg_id,omitempty" require:"true"`
}

func (s GetPdcpBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s GetPdcpBlockchainRequest) GoString() string {
	return s.String()
}

func (s *GetPdcpBlockchainRequest) SetAuthToken(v string) *GetPdcpBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *GetPdcpBlockchainRequest) SetProductInstanceId(v string) *GetPdcpBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetPdcpBlockchainRequest) SetTxMsgId(v string) *GetPdcpBlockchainRequest {
	s.TxMsgId = &v
	return s
}

type GetPdcpBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回上链信息
	TxData *BlockchainDTO `json:"tx_data,omitempty" xml:"tx_data,omitempty"`
}

func (s GetPdcpBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s GetPdcpBlockchainResponse) GoString() string {
	return s.String()
}

func (s *GetPdcpBlockchainResponse) SetReqMsgId(v string) *GetPdcpBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetPdcpBlockchainResponse) SetResultCode(v string) *GetPdcpBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *GetPdcpBlockchainResponse) SetResultMsg(v string) *GetPdcpBlockchainResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetPdcpBlockchainResponse) SetTxData(v *BlockchainDTO) *GetPdcpBlockchainResponse {
	s.TxData = v
	return s
}

type AddEcarAvitivedataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活动数据业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty" require:"true" maxLength:"64"`
	// 盘查排放项编码
	InventoryItemNo *string `json:"inventory_item_no,omitempty" xml:"inventory_item_no,omitempty" require:"true"`
	// 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
	OccurrenceStartTime *string `json:"occurrence_start_time,omitempty" xml:"occurrence_start_time,omitempty" require:"true"`
	// 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
	OccurrenceEndTime *string `json:"occurrence_end_time,omitempty" xml:"occurrence_end_time,omitempty" require:"true"`
	// 排放源用量值列表
	EmissionSourceDosageList []*AnyAmountItem `json:"emission_source_dosage_list,omitempty" xml:"emission_source_dosage_list,omitempty" require:"true" type:"Repeated"`
	// 活动数据附加要素值列表
	EmissionSourceElementList []*AnyKeywordItem `json:"emission_source_element_list,omitempty" xml:"emission_source_element_list,omitempty" type:"Repeated"`
	// 活动数据扩展信息值列表
	ExtensionValueList []*AnyKeywordItem `json:"extension_value_list,omitempty" xml:"extension_value_list,omitempty" type:"Repeated"`
	// 凭证文件列表，每个文件通过接口/open/api/file/upload上传
	VoucherFileList []*EnterpriseDocumentFile `json:"voucher_file_list,omitempty" xml:"voucher_file_list,omitempty" type:"Repeated"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty" maxLength:"512"`
}

func (s AddEcarAvitivedataRequest) String() string {
	return tea.Prettify(s)
}

func (s AddEcarAvitivedataRequest) GoString() string {
	return s.String()
}

func (s *AddEcarAvitivedataRequest) SetAuthToken(v string) *AddEcarAvitivedataRequest {
	s.AuthToken = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetProductInstanceId(v string) *AddEcarAvitivedataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetEnterpriseBizNo(v string) *AddEcarAvitivedataRequest {
	s.EnterpriseBizNo = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetInventoryItemNo(v string) *AddEcarAvitivedataRequest {
	s.InventoryItemNo = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetOccurrenceStartTime(v string) *AddEcarAvitivedataRequest {
	s.OccurrenceStartTime = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetOccurrenceEndTime(v string) *AddEcarAvitivedataRequest {
	s.OccurrenceEndTime = &v
	return s
}

func (s *AddEcarAvitivedataRequest) SetEmissionSourceDosageList(v []*AnyAmountItem) *AddEcarAvitivedataRequest {
	s.EmissionSourceDosageList = v
	return s
}

func (s *AddEcarAvitivedataRequest) SetEmissionSourceElementList(v []*AnyKeywordItem) *AddEcarAvitivedataRequest {
	s.EmissionSourceElementList = v
	return s
}

func (s *AddEcarAvitivedataRequest) SetExtensionValueList(v []*AnyKeywordItem) *AddEcarAvitivedataRequest {
	s.ExtensionValueList = v
	return s
}

func (s *AddEcarAvitivedataRequest) SetVoucherFileList(v []*EnterpriseDocumentFile) *AddEcarAvitivedataRequest {
	s.VoucherFileList = v
	return s
}

func (s *AddEcarAvitivedataRequest) SetRemark(v string) *AddEcarAvitivedataRequest {
	s.Remark = &v
	return s
}

type AddEcarAvitivedataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 排放数据录入明细编码
	EmissionDataEntryItemNo *string `json:"emission_data_entry_item_no,omitempty" xml:"emission_data_entry_item_no,omitempty"`
	// 企业业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty"`
}

func (s AddEcarAvitivedataResponse) String() string {
	return tea.Prettify(s)
}

func (s AddEcarAvitivedataResponse) GoString() string {
	return s.String()
}

func (s *AddEcarAvitivedataResponse) SetReqMsgId(v string) *AddEcarAvitivedataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddEcarAvitivedataResponse) SetResultCode(v string) *AddEcarAvitivedataResponse {
	s.ResultCode = &v
	return s
}

func (s *AddEcarAvitivedataResponse) SetResultMsg(v string) *AddEcarAvitivedataResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddEcarAvitivedataResponse) SetEmissionDataEntryItemNo(v string) *AddEcarAvitivedataResponse {
	s.EmissionDataEntryItemNo = &v
	return s
}

func (s *AddEcarAvitivedataResponse) SetEnterpriseBizNo(v string) *AddEcarAvitivedataResponse {
	s.EnterpriseBizNo = &v
	return s
}

type DetailEcarAvitivedataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 排放数据录入明细编码
	EmissionDataEntryItemNo *string `json:"emission_data_entry_item_no,omitempty" xml:"emission_data_entry_item_no,omitempty"`
	// 企业业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty"`
}

func (s DetailEcarAvitivedataRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailEcarAvitivedataRequest) GoString() string {
	return s.String()
}

func (s *DetailEcarAvitivedataRequest) SetAuthToken(v string) *DetailEcarAvitivedataRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailEcarAvitivedataRequest) SetProductInstanceId(v string) *DetailEcarAvitivedataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailEcarAvitivedataRequest) SetEmissionDataEntryItemNo(v string) *DetailEcarAvitivedataRequest {
	s.EmissionDataEntryItemNo = &v
	return s
}

func (s *DetailEcarAvitivedataRequest) SetEnterpriseBizNo(v string) *DetailEcarAvitivedataRequest {
	s.EnterpriseBizNo = &v
	return s
}

type DetailEcarAvitivedataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业排放数据录入明细编码
	EmissionDataEntryItemNo *string `json:"emission_data_entry_item_no,omitempty" xml:"emission_data_entry_item_no,omitempty"`
	// 企业业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty"`
	// 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
	OccurrenceStartTime *string `json:"occurrence_start_time,omitempty" xml:"occurrence_start_time,omitempty"`
	// 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
	OccurrenceEndTime *string `json:"occurrence_end_time,omitempty" xml:"occurrence_end_time,omitempty"`
	// 链上交易Hash
	CarbonChainTradeHash *string `json:"carbon_chain_trade_hash,omitempty" xml:"carbon_chain_trade_hash,omitempty"`
	// 总的碳排放用量，按字符串输出，最多保留6位小数
	EmissionStatisticalAmount *string `json:"emission_statistical_amount,omitempty" xml:"emission_statistical_amount,omitempty"`
	// 排放源编码
	EmissionSourceNo *string `json:"emission_source_no,omitempty" xml:"emission_source_no,omitempty"`
	// 排放源名称
	EmissionSourceName *string `json:"emission_source_name,omitempty" xml:"emission_source_name,omitempty"`
	// 排放单元编码
	EnterpriseLocationNo *string `json:"enterprise_location_no,omitempty" xml:"enterprise_location_no,omitempty"`
	// 排放单元名称
	EnterpriseLocationName *string `json:"enterprise_location_name,omitempty" xml:"enterprise_location_name,omitempty"`
}

func (s DetailEcarAvitivedataResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailEcarAvitivedataResponse) GoString() string {
	return s.String()
}

func (s *DetailEcarAvitivedataResponse) SetReqMsgId(v string) *DetailEcarAvitivedataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetResultCode(v string) *DetailEcarAvitivedataResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetResultMsg(v string) *DetailEcarAvitivedataResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEmissionDataEntryItemNo(v string) *DetailEcarAvitivedataResponse {
	s.EmissionDataEntryItemNo = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEnterpriseBizNo(v string) *DetailEcarAvitivedataResponse {
	s.EnterpriseBizNo = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetOccurrenceStartTime(v string) *DetailEcarAvitivedataResponse {
	s.OccurrenceStartTime = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetOccurrenceEndTime(v string) *DetailEcarAvitivedataResponse {
	s.OccurrenceEndTime = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetCarbonChainTradeHash(v string) *DetailEcarAvitivedataResponse {
	s.CarbonChainTradeHash = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEmissionStatisticalAmount(v string) *DetailEcarAvitivedataResponse {
	s.EmissionStatisticalAmount = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEmissionSourceNo(v string) *DetailEcarAvitivedataResponse {
	s.EmissionSourceNo = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEmissionSourceName(v string) *DetailEcarAvitivedataResponse {
	s.EmissionSourceName = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEnterpriseLocationNo(v string) *DetailEcarAvitivedataResponse {
	s.EnterpriseLocationNo = &v
	return s
}

func (s *DetailEcarAvitivedataResponse) SetEnterpriseLocationName(v string) *DetailEcarAvitivedataResponse {
	s.EnterpriseLocationName = &v
	return s
}

type CountEcarActivedataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 盘查排放项编码
	InventoryItemNo *string `json:"inventory_item_no,omitempty" xml:"inventory_item_no,omitempty" require:"true"`
	// 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
	OccurrenceStartTime *string `json:"occurrence_start_time,omitempty" xml:"occurrence_start_time,omitempty" require:"true"`
	// 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
	OccurrenceEndTime *string `json:"occurrence_end_time,omitempty" xml:"occurrence_end_time,omitempty" require:"true"`
	// 活动数据附加要素信息，将统计满足相关要素值的活动数据
	EmissionSourceElementList []*AnyKeywordItem `json:"emission_source_element_list,omitempty" xml:"emission_source_element_list,omitempty" type:"Repeated"`
	// 活动数据扩展信息，将统计满足相关要素值的活动数据
	ExtensionValueList []*AnyKeywordItem `json:"extension_value_list,omitempty" xml:"extension_value_list,omitempty" type:"Repeated"`
	// 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
	// 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
	// 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
	ExtraStatisticItemList []*AnyKeywordItem `json:"extra_statistic_item_list,omitempty" xml:"extra_statistic_item_list,omitempty" type:"Repeated"`
}

func (s CountEcarActivedataRequest) String() string {
	return tea.Prettify(s)
}

func (s CountEcarActivedataRequest) GoString() string {
	return s.String()
}

func (s *CountEcarActivedataRequest) SetAuthToken(v string) *CountEcarActivedataRequest {
	s.AuthToken = &v
	return s
}

func (s *CountEcarActivedataRequest) SetProductInstanceId(v string) *CountEcarActivedataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountEcarActivedataRequest) SetInventoryItemNo(v string) *CountEcarActivedataRequest {
	s.InventoryItemNo = &v
	return s
}

func (s *CountEcarActivedataRequest) SetOccurrenceStartTime(v string) *CountEcarActivedataRequest {
	s.OccurrenceStartTime = &v
	return s
}

func (s *CountEcarActivedataRequest) SetOccurrenceEndTime(v string) *CountEcarActivedataRequest {
	s.OccurrenceEndTime = &v
	return s
}

func (s *CountEcarActivedataRequest) SetEmissionSourceElementList(v []*AnyKeywordItem) *CountEcarActivedataRequest {
	s.EmissionSourceElementList = v
	return s
}

func (s *CountEcarActivedataRequest) SetExtensionValueList(v []*AnyKeywordItem) *CountEcarActivedataRequest {
	s.ExtensionValueList = v
	return s
}

func (s *CountEcarActivedataRequest) SetExtraStatisticItemList(v []*AnyKeywordItem) *CountEcarActivedataRequest {
	s.ExtraStatisticItemList = v
	return s
}

type CountEcarActivedataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 指定时间区间内的活动数据笔数
	DataEntryCount *int64 `json:"data_entry_count,omitempty" xml:"data_entry_count,omitempty"`
	// 总碳排放量
	TotalEmissions *string `json:"total_emissions,omitempty" xml:"total_emissions,omitempty"`
	// 各活动数据用量累计
	ActiveDataAmountList []*AnyStatisticalItem `json:"active_data_amount_list,omitempty" xml:"active_data_amount_list,omitempty" type:"Repeated"`
	// 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
	EmissionsIntensity *string `json:"emissions_intensity,omitempty" xml:"emissions_intensity,omitempty"`
	// 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
	EachMonthEmissions *string `json:"each_month_emissions,omitempty" xml:"each_month_emissions,omitempty"`
	// 额外统计数据统计结果
	ExtraStatisticDatumList []*AnyAmountItem `json:"extra_statistic_datum_list,omitempty" xml:"extra_statistic_datum_list,omitempty" type:"Repeated"`
}

func (s CountEcarActivedataResponse) String() string {
	return tea.Prettify(s)
}

func (s CountEcarActivedataResponse) GoString() string {
	return s.String()
}

func (s *CountEcarActivedataResponse) SetReqMsgId(v string) *CountEcarActivedataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountEcarActivedataResponse) SetResultCode(v string) *CountEcarActivedataResponse {
	s.ResultCode = &v
	return s
}

func (s *CountEcarActivedataResponse) SetResultMsg(v string) *CountEcarActivedataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountEcarActivedataResponse) SetDataEntryCount(v int64) *CountEcarActivedataResponse {
	s.DataEntryCount = &v
	return s
}

func (s *CountEcarActivedataResponse) SetTotalEmissions(v string) *CountEcarActivedataResponse {
	s.TotalEmissions = &v
	return s
}

func (s *CountEcarActivedataResponse) SetActiveDataAmountList(v []*AnyStatisticalItem) *CountEcarActivedataResponse {
	s.ActiveDataAmountList = v
	return s
}

func (s *CountEcarActivedataResponse) SetEmissionsIntensity(v string) *CountEcarActivedataResponse {
	s.EmissionsIntensity = &v
	return s
}

func (s *CountEcarActivedataResponse) SetEachMonthEmissions(v string) *CountEcarActivedataResponse {
	s.EachMonthEmissions = &v
	return s
}

func (s *CountEcarActivedataResponse) SetExtraStatisticDatumList(v []*AnyAmountItem) *CountEcarActivedataResponse {
	s.ExtraStatisticDatumList = v
	return s
}

type UploadEcarFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// Port的文件内容
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadEcarFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadEcarFileRequest) GoString() string {
	return s.String()
}

func (s *UploadEcarFileRequest) SetAuthToken(v string) *UploadEcarFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadEcarFileRequest) SetProductInstanceId(v string) *UploadEcarFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadEcarFileRequest) SetFileObject(v io.Reader) *UploadEcarFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadEcarFileRequest) SetFileObjectName(v string) *UploadEcarFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadEcarFileRequest) SetFileId(v string) *UploadEcarFileRequest {
	s.FileId = &v
	return s
}

type UploadEcarFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文档名称
	DocumentName *string `json:"document_name,omitempty" xml:"document_name,omitempty"`
	// 碳矩阵存放的文件地址
	DocumentAddress *string `json:"document_address,omitempty" xml:"document_address,omitempty"`
}

func (s UploadEcarFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadEcarFileResponse) GoString() string {
	return s.String()
}

func (s *UploadEcarFileResponse) SetReqMsgId(v string) *UploadEcarFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadEcarFileResponse) SetResultCode(v string) *UploadEcarFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadEcarFileResponse) SetResultMsg(v string) *UploadEcarFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadEcarFileResponse) SetDocumentName(v string) *UploadEcarFileResponse {
	s.DocumentName = &v
	return s
}

func (s *UploadEcarFileResponse) SetDocumentAddress(v string) *UploadEcarFileResponse {
	s.DocumentAddress = &v
	return s
}

type AddEcarGreenoperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绿色行为类型，目前支持包括：
	// ElectronicInvoice(电子发票),
	// LowCarbonCommodity(低碳商品),
	// ReusableBag(环保减塑)
	// OfflinePayment(线下支付)
	// GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
	GreenOperationType *string `json:"green_operation_type,omitempty" xml:"green_operation_type,omitempty" require:"true"`
	// 绿色行为相关的业务单号
	EnterpriseBizNo *string `json:"enterprise_biz_no,omitempty" xml:"enterprise_biz_no,omitempty" require:"true"`
	// 发生时间，格式应如：2021-07-21 12:11:11
	OccurrenceTime *string `json:"occurrence_time,omitempty" xml:"occurrence_time,omitempty" require:"true"`
	// 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s AddEcarGreenoperationRequest) String() string {
	return tea.Prettify(s)
}

func (s AddEcarGreenoperationRequest) GoString() string {
	return s.String()
}

func (s *AddEcarGreenoperationRequest) SetAuthToken(v string) *AddEcarGreenoperationRequest {
	s.AuthToken = &v
	return s
}

func (s *AddEcarGreenoperationRequest) SetProductInstanceId(v string) *AddEcarGreenoperationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddEcarGreenoperationRequest) SetGreenOperationType(v string) *AddEcarGreenoperationRequest {
	s.GreenOperationType = &v
	return s
}

func (s *AddEcarGreenoperationRequest) SetEnterpriseBizNo(v string) *AddEcarGreenoperationRequest {
	s.EnterpriseBizNo = &v
	return s
}

func (s *AddEcarGreenoperationRequest) SetOccurrenceTime(v string) *AddEcarGreenoperationRequest {
	s.OccurrenceTime = &v
	return s
}

func (s *AddEcarGreenoperationRequest) SetExtInfo(v string) *AddEcarGreenoperationRequest {
	s.ExtInfo = &v
	return s
}

type AddEcarGreenoperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回记录的多种绿色行为数据摘要信息
	List []*GreenOperationRecordSummary `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s AddEcarGreenoperationResponse) String() string {
	return tea.Prettify(s)
}

func (s AddEcarGreenoperationResponse) GoString() string {
	return s.String()
}

func (s *AddEcarGreenoperationResponse) SetReqMsgId(v string) *AddEcarGreenoperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddEcarGreenoperationResponse) SetResultCode(v string) *AddEcarGreenoperationResponse {
	s.ResultCode = &v
	return s
}

func (s *AddEcarGreenoperationResponse) SetResultMsg(v string) *AddEcarGreenoperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddEcarGreenoperationResponse) SetList(v []*GreenOperationRecordSummary) *AddEcarGreenoperationResponse {
	s.List = v
	return s
}

type CountEcarGreenoperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绿色行为统计频率，可选值：
	// Monthly(分月统计),
	// Daily(按每日统计)
	//
	StatisticFrequence *string `json:"statistic_frequence,omitempty" xml:"statistic_frequence,omitempty" require:"true"`
	// 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
	OccurrenceStartTime *string `json:"occurrence_start_time,omitempty" xml:"occurrence_start_time,omitempty"`
	// 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
	OccurrenceEndTime *string `json:"occurrence_end_time,omitempty" xml:"occurrence_end_time,omitempty"`
}

func (s CountEcarGreenoperationRequest) String() string {
	return tea.Prettify(s)
}

func (s CountEcarGreenoperationRequest) GoString() string {
	return s.String()
}

func (s *CountEcarGreenoperationRequest) SetAuthToken(v string) *CountEcarGreenoperationRequest {
	s.AuthToken = &v
	return s
}

func (s *CountEcarGreenoperationRequest) SetProductInstanceId(v string) *CountEcarGreenoperationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountEcarGreenoperationRequest) SetStatisticFrequence(v string) *CountEcarGreenoperationRequest {
	s.StatisticFrequence = &v
	return s
}

func (s *CountEcarGreenoperationRequest) SetOccurrenceStartTime(v string) *CountEcarGreenoperationRequest {
	s.OccurrenceStartTime = &v
	return s
}

func (s *CountEcarGreenoperationRequest) SetOccurrenceEndTime(v string) *CountEcarGreenoperationRequest {
	s.OccurrenceEndTime = &v
	return s
}

type CountEcarGreenoperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 绿色行为产生的绿色能量总量
	GreenEnergyTotal *int64 `json:"green_energy_total,omitempty" xml:"green_energy_total,omitempty"`
	// 绿色能量单位，默认为g
	GreenEnergyUnit *string `json:"green_energy_unit,omitempty" xml:"green_energy_unit,omitempty"`
	// 绿色行为记录数据
	GreenOperationRecords *int64 `json:"green_operation_records,omitempty" xml:"green_operation_records,omitempty"`
	// 按频率统计的绿色行为数据列表
	StatisticsByFrequenceList []*GreenOperationStatisticsByFrequence `json:"statistics_by_frequence_list,omitempty" xml:"statistics_by_frequence_list,omitempty" type:"Repeated"`
	// 按绿色行为类型统计的绿色行为数据列表
	StatisticsByTypeList []*GreenOperationStatisticsByType `json:"statistics_by_type_list,omitempty" xml:"statistics_by_type_list,omitempty" type:"Repeated"`
}

func (s CountEcarGreenoperationResponse) String() string {
	return tea.Prettify(s)
}

func (s CountEcarGreenoperationResponse) GoString() string {
	return s.String()
}

func (s *CountEcarGreenoperationResponse) SetReqMsgId(v string) *CountEcarGreenoperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetResultCode(v string) *CountEcarGreenoperationResponse {
	s.ResultCode = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetResultMsg(v string) *CountEcarGreenoperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetGreenEnergyTotal(v int64) *CountEcarGreenoperationResponse {
	s.GreenEnergyTotal = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetGreenEnergyUnit(v string) *CountEcarGreenoperationResponse {
	s.GreenEnergyUnit = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetGreenOperationRecords(v int64) *CountEcarGreenoperationResponse {
	s.GreenOperationRecords = &v
	return s
}

func (s *CountEcarGreenoperationResponse) SetStatisticsByFrequenceList(v []*GreenOperationStatisticsByFrequence) *CountEcarGreenoperationResponse {
	s.StatisticsByFrequenceList = v
	return s
}

func (s *CountEcarGreenoperationResponse) SetStatisticsByTypeList(v []*GreenOperationStatisticsByType) *CountEcarGreenoperationResponse {
	s.StatisticsByTypeList = v
	return s
}

type ListEcarGreenoperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 限制的记录条数
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty" require:"true"`
}

func (s ListEcarGreenoperationRequest) String() string {
	return tea.Prettify(s)
}

func (s ListEcarGreenoperationRequest) GoString() string {
	return s.String()
}

func (s *ListEcarGreenoperationRequest) SetAuthToken(v string) *ListEcarGreenoperationRequest {
	s.AuthToken = &v
	return s
}

func (s *ListEcarGreenoperationRequest) SetProductInstanceId(v string) *ListEcarGreenoperationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListEcarGreenoperationRequest) SetLimit(v int64) *ListEcarGreenoperationRequest {
	s.Limit = &v
	return s
}

type ListEcarGreenoperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 最近发生的绿色行为数据列表
	List []*GreenOperationRecordSummary `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ListEcarGreenoperationResponse) String() string {
	return tea.Prettify(s)
}

func (s ListEcarGreenoperationResponse) GoString() string {
	return s.String()
}

func (s *ListEcarGreenoperationResponse) SetReqMsgId(v string) *ListEcarGreenoperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListEcarGreenoperationResponse) SetResultCode(v string) *ListEcarGreenoperationResponse {
	s.ResultCode = &v
	return s
}

func (s *ListEcarGreenoperationResponse) SetResultMsg(v string) *ListEcarGreenoperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListEcarGreenoperationResponse) SetList(v []*GreenOperationRecordSummary) *ListEcarGreenoperationResponse {
	s.List = v
	return s
}

type PreviewEcarAvitivedataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求统计的年份，默认为当前年份
	Year *int64 `json:"year,omitempty" xml:"year,omitempty"`
	// 统计比较运算是的基准：
	// LastYear(去年同期比较),
	// CriteriaYear(同基准年比较)。
	// 默认与去年同期比较。
	ComparisonStandard *string `json:"comparison_standard,omitempty" xml:"comparison_standard,omitempty"`
}

func (s PreviewEcarAvitivedataRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewEcarAvitivedataRequest) GoString() string {
	return s.String()
}

func (s *PreviewEcarAvitivedataRequest) SetAuthToken(v string) *PreviewEcarAvitivedataRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewEcarAvitivedataRequest) SetProductInstanceId(v string) *PreviewEcarAvitivedataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewEcarAvitivedataRequest) SetYear(v int64) *PreviewEcarAvitivedataRequest {
	s.Year = &v
	return s
}

func (s *PreviewEcarAvitivedataRequest) SetComparisonStandard(v string) *PreviewEcarAvitivedataRequest {
	s.ComparisonStandard = &v
	return s
}

type PreviewEcarAvitivedataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总排放量，最多保留6位小数
	TotalEmissions *string `json:"total_emissions,omitempty" xml:"total_emissions,omitempty"`
	// 核减减排量，最多保留6位小数
	SubtractReductions *string `json:"subtract_reductions,omitempty" xml:"subtract_reductions,omitempty"`
	// 净排放量，核减后的碳排放量
	NetReductions *string `json:"net_reductions,omitempty" xml:"net_reductions,omitempty"`
	// 年同比
	YearCompareLastPer *string `json:"year_compare_last_per,omitempty" xml:"year_compare_last_per,omitempty"`
	// 碳排放量单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 碳排放量单位显示标签
	UnitLabel *string `json:"unit_label,omitempty" xml:"unit_label,omitempty"`
	// 各月份排放数据列表
	List []*AnnualMonthEmissionDatum `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s PreviewEcarAvitivedataResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewEcarAvitivedataResponse) GoString() string {
	return s.String()
}

func (s *PreviewEcarAvitivedataResponse) SetReqMsgId(v string) *PreviewEcarAvitivedataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetResultCode(v string) *PreviewEcarAvitivedataResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetResultMsg(v string) *PreviewEcarAvitivedataResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetTotalEmissions(v string) *PreviewEcarAvitivedataResponse {
	s.TotalEmissions = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetSubtractReductions(v string) *PreviewEcarAvitivedataResponse {
	s.SubtractReductions = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetNetReductions(v string) *PreviewEcarAvitivedataResponse {
	s.NetReductions = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetYearCompareLastPer(v string) *PreviewEcarAvitivedataResponse {
	s.YearCompareLastPer = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetUnit(v string) *PreviewEcarAvitivedataResponse {
	s.Unit = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetUnitLabel(v string) *PreviewEcarAvitivedataResponse {
	s.UnitLabel = &v
	return s
}

func (s *PreviewEcarAvitivedataResponse) SetList(v []*AnnualMonthEmissionDatum) *PreviewEcarAvitivedataResponse {
	s.List = v
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
				"sdk_version":      tea.String("1.3.0"),
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
 * Description: 账户开通接口。开通协作平台和链上账户
 * Summary: 账户开通接口
 */
func (client *Client) RegisterPdcpAccount(request *RegisterPdcpAccountRequest) (_result *RegisterPdcpAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterPdcpAccountResponse{}
	_body, _err := client.RegisterPdcpAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 账户开通接口。开通协作平台和链上账户
 * Summary: 账户开通接口
 */
func (client *Client) RegisterPdcpAccountEx(request *RegisterPdcpAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterPdcpAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterPdcpAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.pdcp.account.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 存证接口
 * Summary: 存证接口
 */
func (client *Client) PushPdcpBlockchain(request *PushPdcpBlockchainRequest) (_result *PushPdcpBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushPdcpBlockchainResponse{}
	_body, _err := client.PushPdcpBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 存证接口
 * Summary: 存证接口
 */
func (client *Client) PushPdcpBlockchainEx(request *PushPdcpBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushPdcpBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushPdcpBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.pdcp.blockchain.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步存证接口
 * Summary: 异步存证接口
 */
func (client *Client) UploadPdcpBlockchain(request *UploadPdcpBlockchainRequest) (_result *UploadPdcpBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadPdcpBlockchainResponse{}
	_body, _err := client.UploadPdcpBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步存证接口
 * Summary: 异步存证接口
 */
func (client *Client) UploadPdcpBlockchainEx(request *UploadPdcpBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadPdcpBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadPdcpBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.pdcp.blockchain.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询异步存证结果
 * Summary: 查询异步存证结果
 */
func (client *Client) GetPdcpBlockchain(request *GetPdcpBlockchainRequest) (_result *GetPdcpBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetPdcpBlockchainResponse{}
	_body, _err := client.GetPdcpBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询异步存证结果
 * Summary: 查询异步存证结果
 */
func (client *Client) GetPdcpBlockchainEx(request *GetPdcpBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetPdcpBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetPdcpBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.pdcp.blockchain.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增排放活动数据
 * Summary: 新增排放活动数据
 */
func (client *Client) AddEcarAvitivedata(request *AddEcarAvitivedataRequest) (_result *AddEcarAvitivedataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddEcarAvitivedataResponse{}
	_body, _err := client.AddEcarAvitivedataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增排放活动数据
 * Summary: 新增排放活动数据
 */
func (client *Client) AddEcarAvitivedataEx(request *AddEcarAvitivedataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddEcarAvitivedataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddEcarAvitivedataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.avitivedata.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询排放活动数据详情
 * Summary: 查询排放活动数据详情
 */
func (client *Client) DetailEcarAvitivedata(request *DetailEcarAvitivedataRequest) (_result *DetailEcarAvitivedataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailEcarAvitivedataResponse{}
	_body, _err := client.DetailEcarAvitivedataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询排放活动数据详情
 * Summary: 查询排放活动数据详情
 */
func (client *Client) DetailEcarAvitivedataEx(request *DetailEcarAvitivedataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailEcarAvitivedataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailEcarAvitivedataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.avitivedata.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 排放活动数据统计计算
 * Summary: 排放活动数据统计计算
 */
func (client *Client) CountEcarActivedata(request *CountEcarActivedataRequest) (_result *CountEcarActivedataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountEcarActivedataResponse{}
	_body, _err := client.CountEcarActivedataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 排放活动数据统计计算
 * Summary: 排放活动数据统计计算
 */
func (client *Client) CountEcarActivedataEx(request *CountEcarActivedataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountEcarActivedataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountEcarActivedataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.activedata.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件上传接口
 * Summary: 文件上传接口
 */
func (client *Client) UploadEcarFile(request *UploadEcarFileRequest) (_result *UploadEcarFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadEcarFileResponse{}
	_body, _err := client.UploadEcarFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件上传接口
 * Summary: 文件上传接口
 */
func (client *Client) UploadEcarFileEx(request *UploadEcarFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadEcarFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.carbon.ecar.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadEcarFileResponse := &UploadEcarFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadEcarFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadEcarFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
 * Summary: 录入绿色行为数据
 */
func (client *Client) AddEcarGreenoperation(request *AddEcarGreenoperationRequest) (_result *AddEcarGreenoperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddEcarGreenoperationResponse{}
	_body, _err := client.AddEcarGreenoperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
 * Summary: 录入绿色行为数据
 */
func (client *Client) AddEcarGreenoperationEx(request *AddEcarGreenoperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddEcarGreenoperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddEcarGreenoperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.greenoperation.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
 * Summary: 统计绿色行为数据
 */
func (client *Client) CountEcarGreenoperation(request *CountEcarGreenoperationRequest) (_result *CountEcarGreenoperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountEcarGreenoperationResponse{}
	_body, _err := client.CountEcarGreenoperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
 * Summary: 统计绿色行为数据
 */
func (client *Client) CountEcarGreenoperationEx(request *CountEcarGreenoperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountEcarGreenoperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountEcarGreenoperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.greenoperation.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
 * Summary: 查询最近的绿色行为数据
 */
func (client *Client) ListEcarGreenoperation(request *ListEcarGreenoperationRequest) (_result *ListEcarGreenoperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListEcarGreenoperationResponse{}
	_body, _err := client.ListEcarGreenoperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
 * Summary: 查询最近的绿色行为数据
 */
func (client *Client) ListEcarGreenoperationEx(request *ListEcarGreenoperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListEcarGreenoperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListEcarGreenoperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.greenoperation.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
 * Summary: 预览本年度排放统计
 */
func (client *Client) PreviewEcarAvitivedata(request *PreviewEcarAvitivedataRequest) (_result *PreviewEcarAvitivedataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewEcarAvitivedataResponse{}
	_body, _err := client.PreviewEcarAvitivedataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
 * Summary: 预览本年度排放统计
 */
func (client *Client) PreviewEcarAvitivedataEx(request *PreviewEcarAvitivedataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewEcarAvitivedataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewEcarAvitivedataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.carbon.ecar.avitivedata.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
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

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
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
