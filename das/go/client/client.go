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

// 主要人员
type EnterpriseStaff struct {
	// 主要人员名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 法人类型，1-人;2-公司
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 经理
	TypeJoin []*string `json:"type_join,omitempty" xml:"type_join,omitempty" type:"Repeated"`
}

func (s EnterpriseStaff) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseStaff) GoString() string {
	return s.String()
}

func (s *EnterpriseStaff) SetName(v string) *EnterpriseStaff {
	s.Name = &v
	return s
}

func (s *EnterpriseStaff) SetType(v string) *EnterpriseStaff {
	s.Type = &v
	return s
}

func (s *EnterpriseStaff) SetTypeJoin(v []*string) *EnterpriseStaff {
	s.TypeJoin = v
	return s
}

// 数据源接口入参定义
type InterfaceInput struct {
	// 接口入参名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 接口入参类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"50"`
	// 接口入参描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"100"`
	// 接口入参是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty"`
}

func (s InterfaceInput) String() string {
	return tea.Prettify(s)
}

func (s InterfaceInput) GoString() string {
	return s.String()
}

func (s *InterfaceInput) SetName(v string) *InterfaceInput {
	s.Name = &v
	return s
}

func (s *InterfaceInput) SetType(v string) *InterfaceInput {
	s.Type = &v
	return s
}

func (s *InterfaceInput) SetDescription(v string) *InterfaceInput {
	s.Description = &v
	return s
}

func (s *InterfaceInput) SetRequired(v bool) *InterfaceInput {
	s.Required = &v
	return s
}

// 数据源接口出参定义
type InterfaceOutput struct {
	// 接口出参名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 接口出参类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"50"`
	// 接口出参描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"100"`
}

func (s InterfaceOutput) String() string {
	return tea.Prettify(s)
}

func (s InterfaceOutput) GoString() string {
	return s.String()
}

func (s *InterfaceOutput) SetName(v string) *InterfaceOutput {
	s.Name = &v
	return s
}

func (s *InterfaceOutput) SetType(v string) *InterfaceOutput {
	s.Type = &v
	return s
}

func (s *InterfaceOutput) SetDescription(v string) *InterfaceOutput {
	s.Description = &v
	return s
}

// 协议模板信息
type Agreement struct {
	// 协议编码
	AgreementCode *string `json:"agreement_code,omitempty" xml:"agreement_code,omitempty" require:"true"`
	// 协议名称
	AgreementName *string `json:"agreement_name,omitempty" xml:"agreement_name,omitempty" require:"true"`
	// 协议类型
	AgreementType *string `json:"agreement_type,omitempty" xml:"agreement_type,omitempty" require:"true"`
	// 第三方原始协议链接
	AgreementUrl *string `json:"agreement_url,omitempty" xml:"agreement_url,omitempty" require:"true"`
	// 协议文件上传目录
	AgreementFileOssKey *string `json:"agreement_file_oss_key,omitempty" xml:"agreement_file_oss_key,omitempty" require:"true"`
	// 上传时的协议原始文件名
	AgreementFileOriginalName *string `json:"agreement_file_original_name,omitempty" xml:"agreement_file_original_name,omitempty" require:"true"`
	// 下载链接
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty" require:"true"`
}

func (s Agreement) String() string {
	return tea.Prettify(s)
}

func (s Agreement) GoString() string {
	return s.String()
}

func (s *Agreement) SetAgreementCode(v string) *Agreement {
	s.AgreementCode = &v
	return s
}

func (s *Agreement) SetAgreementName(v string) *Agreement {
	s.AgreementName = &v
	return s
}

func (s *Agreement) SetAgreementType(v string) *Agreement {
	s.AgreementType = &v
	return s
}

func (s *Agreement) SetAgreementUrl(v string) *Agreement {
	s.AgreementUrl = &v
	return s
}

func (s *Agreement) SetAgreementFileOssKey(v string) *Agreement {
	s.AgreementFileOssKey = &v
	return s
}

func (s *Agreement) SetAgreementFileOriginalName(v string) *Agreement {
	s.AgreementFileOriginalName = &v
	return s
}

func (s *Agreement) SetDownloadUrl(v string) *Agreement {
	s.DownloadUrl = &v
	return s
}

// 商标共有人信息
type TmCoownerInfo struct {
	// 共有人中文名称
	CoownerNameCn *string `json:"coowner_name_cn,omitempty" xml:"coowner_name_cn,omitempty"`
	// 共有人中文地址
	CoownerAddrCn *string `json:"coowner_addr_cn,omitempty" xml:"coowner_addr_cn,omitempty"`
	// 共有人英文名称
	CoownerNameEn *string `json:"coowner_name_en,omitempty" xml:"coowner_name_en,omitempty"`
	// 共有人英文地址
	CoownerAddrEn *string `json:"coowner_addr_en,omitempty" xml:"coowner_addr_en,omitempty"`
}

func (s TmCoownerInfo) String() string {
	return tea.Prettify(s)
}

func (s TmCoownerInfo) GoString() string {
	return s.String()
}

func (s *TmCoownerInfo) SetCoownerNameCn(v string) *TmCoownerInfo {
	s.CoownerNameCn = &v
	return s
}

func (s *TmCoownerInfo) SetCoownerAddrCn(v string) *TmCoownerInfo {
	s.CoownerAddrCn = &v
	return s
}

func (s *TmCoownerInfo) SetCoownerNameEn(v string) *TmCoownerInfo {
	s.CoownerNameEn = &v
	return s
}

func (s *TmCoownerInfo) SetCoownerAddrEn(v string) *TmCoownerInfo {
	s.CoownerAddrEn = &v
	return s
}

// C端展示授权内容
type AuthContent struct {
	// 产品code列表
	ProductCodeList []*string `json:"product_code_list,omitempty" xml:"product_code_list,omitempty" require:"true" type:"Repeated"`
	// 数据产品入参,JSON数组
	ProductParam *string `json:"product_param,omitempty" xml:"product_param,omitempty" require:"true"`
	// C端展示授权内容code
	AuthContentCode *string `json:"auth_content_code,omitempty" xml:"auth_content_code,omitempty" require:"true"`
	// C端展示授权内容名称
	AuthContentName *string `json:"auth_content_name,omitempty" xml:"auth_content_name,omitempty" require:"true"`
}

func (s AuthContent) String() string {
	return tea.Prettify(s)
}

func (s AuthContent) GoString() string {
	return s.String()
}

func (s *AuthContent) SetProductCodeList(v []*string) *AuthContent {
	s.ProductCodeList = v
	return s
}

func (s *AuthContent) SetProductParam(v string) *AuthContent {
	s.ProductParam = &v
	return s
}

func (s *AuthContent) SetAuthContentCode(v string) *AuthContent {
	s.AuthContentCode = &v
	return s
}

func (s *AuthContent) SetAuthContentName(v string) *AuthContent {
	s.AuthContentName = &v
	return s
}

// 查询人持股信息
type StockHolder struct {
	// 股东类型
	OrgHolderType *string `json:"org_holder_type,omitempty" xml:"org_holder_type,omitempty"`
	// 出资时间
	InvestDate *string `json:"invest_date,omitempty" xml:"invest_date,omitempty"`
	// 占比
	InvestRate *string `json:"invest_rate,omitempty" xml:"invest_rate,omitempty"`
	// 出资金额
	SubscriptAmt *string `json:"subscript_amt,omitempty" xml:"subscript_amt,omitempty"`
	// 股东名
	OrHolderName *string `json:"or_holder_name,omitempty" xml:"or_holder_name,omitempty"`
}

func (s StockHolder) String() string {
	return tea.Prettify(s)
}

func (s StockHolder) GoString() string {
	return s.String()
}

func (s *StockHolder) SetOrgHolderType(v string) *StockHolder {
	s.OrgHolderType = &v
	return s
}

func (s *StockHolder) SetInvestDate(v string) *StockHolder {
	s.InvestDate = &v
	return s
}

func (s *StockHolder) SetInvestRate(v string) *StockHolder {
	s.InvestRate = &v
	return s
}

func (s *StockHolder) SetSubscriptAmt(v string) *StockHolder {
	s.SubscriptAmt = &v
	return s
}

func (s *StockHolder) SetOrHolderName(v string) *StockHolder {
	s.OrHolderName = &v
	return s
}

// 查询人所在公司基本信息
type EnterpriseBasicInfo struct {
	// 企业状态
	RegStatus *string `json:"reg_status,omitempty" xml:"reg_status,omitempty"`
	// 成立日期(注册日期)
	EstablishTime *string `json:"establish_time,omitempty" xml:"establish_time,omitempty"`
	// 注册资本
	RegCapital *string `json:"reg_capital,omitempty" xml:"reg_capital,omitempty"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty"`
	// 主要人员
	StaffList []*EnterpriseStaff `json:"staff_list,omitempty" xml:"staff_list,omitempty" type:"Repeated"`
	// 法人类型，1-人;2-公司
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 注册资本币种:人民币、美元、欧元等
	RegCapitalCurrency *string `json:"reg_capital_currency,omitempty" xml:"reg_capital_currency,omitempty"`
	// 法人姓名
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty"`
	// 注册号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty"`
	// 统一社会信用代码
	CreditCode *string `json:"credit_code,omitempty" xml:"credit_code,omitempty"`
	// 企业名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 企业类型
	CompanyOrgType *string `json:"company_org_type,omitempty" xml:"company_org_type,omitempty"`
	// 省份简称
	Base *string `json:"base,omitempty" xml:"base,omitempty"`
}

func (s EnterpriseBasicInfo) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseBasicInfo) GoString() string {
	return s.String()
}

func (s *EnterpriseBasicInfo) SetRegStatus(v string) *EnterpriseBasicInfo {
	s.RegStatus = &v
	return s
}

func (s *EnterpriseBasicInfo) SetEstablishTime(v string) *EnterpriseBasicInfo {
	s.EstablishTime = &v
	return s
}

func (s *EnterpriseBasicInfo) SetRegCapital(v string) *EnterpriseBasicInfo {
	s.RegCapital = &v
	return s
}

func (s *EnterpriseBasicInfo) SetIndustry(v string) *EnterpriseBasicInfo {
	s.Industry = &v
	return s
}

func (s *EnterpriseBasicInfo) SetStaffList(v []*EnterpriseStaff) *EnterpriseBasicInfo {
	s.StaffList = v
	return s
}

func (s *EnterpriseBasicInfo) SetType(v string) *EnterpriseBasicInfo {
	s.Type = &v
	return s
}

func (s *EnterpriseBasicInfo) SetRegCapitalCurrency(v string) *EnterpriseBasicInfo {
	s.RegCapitalCurrency = &v
	return s
}

func (s *EnterpriseBasicInfo) SetLegalPersonName(v string) *EnterpriseBasicInfo {
	s.LegalPersonName = &v
	return s
}

func (s *EnterpriseBasicInfo) SetRegNumber(v string) *EnterpriseBasicInfo {
	s.RegNumber = &v
	return s
}

func (s *EnterpriseBasicInfo) SetCreditCode(v string) *EnterpriseBasicInfo {
	s.CreditCode = &v
	return s
}

func (s *EnterpriseBasicInfo) SetName(v string) *EnterpriseBasicInfo {
	s.Name = &v
	return s
}

func (s *EnterpriseBasicInfo) SetCompanyOrgType(v string) *EnterpriseBasicInfo {
	s.CompanyOrgType = &v
	return s
}

func (s *EnterpriseBasicInfo) SetBase(v string) *EnterpriseBasicInfo {
	s.Base = &v
	return s
}

// 数据源接口定义
type DataSourceInterface struct {
	// 数据源接口访问地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true" maxLength:"100"`
	// 数据源接口请求方法类型
	InterfaceRequestMethod *string `json:"interface_request_method,omitempty" xml:"interface_request_method,omitempty" require:"true" maxLength:"50"`
	// 数据源接口入参列表
	InterfaceInput []*InterfaceInput `json:"interface_input,omitempty" xml:"interface_input,omitempty" type:"Repeated"`
	// 数据源接口出参列表
	InterfaceOutput []*InterfaceOutput `json:"interface_output,omitempty" xml:"interface_output,omitempty" type:"Repeated"`
}

func (s DataSourceInterface) String() string {
	return tea.Prettify(s)
}

func (s DataSourceInterface) GoString() string {
	return s.String()
}

func (s *DataSourceInterface) SetAddress(v string) *DataSourceInterface {
	s.Address = &v
	return s
}

func (s *DataSourceInterface) SetInterfaceRequestMethod(v string) *DataSourceInterface {
	s.InterfaceRequestMethod = &v
	return s
}

func (s *DataSourceInterface) SetInterfaceInput(v []*InterfaceInput) *DataSourceInterface {
	s.InterfaceInput = v
	return s
}

func (s *DataSourceInterface) SetInterfaceOutput(v []*InterfaceOutput) *DataSourceInterface {
	s.InterfaceOutput = v
	return s
}

// 国内商标对应商品信息
type DomesticTmGoodsInfo struct {
	// 商品中文名称
	GoodsCnName *string `json:"goods_cn_name,omitempty" xml:"goods_cn_name,omitempty"`
	// 类似群编码
	SimilarCode *string `json:"similar_code,omitempty" xml:"similar_code,omitempty"`
}

func (s DomesticTmGoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s DomesticTmGoodsInfo) GoString() string {
	return s.String()
}

func (s *DomesticTmGoodsInfo) SetGoodsCnName(v string) *DomesticTmGoodsInfo {
	s.GoodsCnName = &v
	return s
}

func (s *DomesticTmGoodsInfo) SetSimilarCode(v string) *DomesticTmGoodsInfo {
	s.SimilarCode = &v
	return s
}

// 工作经历信息
type WorkExperiencesInfo struct {
	// 工作开始日期
	WorkStartTime *int64 `json:"work_start_time,omitempty" xml:"work_start_time,omitempty" maximum:"32"`
	// 工作结束日期
	WorkEndTime *int64 `json:"work_end_time,omitempty" xml:"work_end_time,omitempty" maximum:"32"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" maxLength:"128"`
	// 工作描述
	WorkDesc *string `json:"work_desc,omitempty" xml:"work_desc,omitempty" maxLength:"1024"`
	// 职业
	JobName *string `json:"job_name,omitempty" xml:"job_name,omitempty" maxLength:"128"`
	// 行业名称
	ProfessionName *string `json:"profession_name,omitempty" xml:"profession_name,omitempty" maxLength:"128"`
}

func (s WorkExperiencesInfo) String() string {
	return tea.Prettify(s)
}

func (s WorkExperiencesInfo) GoString() string {
	return s.String()
}

func (s *WorkExperiencesInfo) SetWorkStartTime(v int64) *WorkExperiencesInfo {
	s.WorkStartTime = &v
	return s
}

func (s *WorkExperiencesInfo) SetWorkEndTime(v int64) *WorkExperiencesInfo {
	s.WorkEndTime = &v
	return s
}

func (s *WorkExperiencesInfo) SetCompanyName(v string) *WorkExperiencesInfo {
	s.CompanyName = &v
	return s
}

func (s *WorkExperiencesInfo) SetWorkDesc(v string) *WorkExperiencesInfo {
	s.WorkDesc = &v
	return s
}

func (s *WorkExperiencesInfo) SetJobName(v string) *WorkExperiencesInfo {
	s.JobName = &v
	return s
}

func (s *WorkExperiencesInfo) SetProfessionName(v string) *WorkExperiencesInfo {
	s.ProfessionName = &v
	return s
}

// 产品参数信息
type ProductParamInfo struct {
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 参数key
	ParamKey *string `json:"param_key,omitempty" xml:"param_key,omitempty" require:"true"`
	// 参数类型
	ParamType *string `json:"param_type,omitempty" xml:"param_type,omitempty" require:"true"`
	// 参数描述
	ParamDesc *string `json:"param_desc,omitempty" xml:"param_desc,omitempty" require:"true"`
	// 是否可空
	Nullable *bool `json:"nullable,omitempty" xml:"nullable,omitempty" require:"true"`
}

func (s ProductParamInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductParamInfo) GoString() string {
	return s.String()
}

func (s *ProductParamInfo) SetProductCode(v string) *ProductParamInfo {
	s.ProductCode = &v
	return s
}

func (s *ProductParamInfo) SetParamKey(v string) *ProductParamInfo {
	s.ParamKey = &v
	return s
}

func (s *ProductParamInfo) SetParamType(v string) *ProductParamInfo {
	s.ParamType = &v
	return s
}

func (s *ProductParamInfo) SetParamDesc(v string) *ProductParamInfo {
	s.ParamDesc = &v
	return s
}

func (s *ProductParamInfo) SetNullable(v bool) *ProductParamInfo {
	s.Nullable = &v
	return s
}

// 车辆基础信息
type BasicCarInfo struct {
	// 号牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 号牌种类，枚举值
	LicenseType *string `json:"license_type,omitempty" xml:"license_type,omitempty" require:"true"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
}

func (s BasicCarInfo) String() string {
	return tea.Prettify(s)
}

func (s BasicCarInfo) GoString() string {
	return s.String()
}

func (s *BasicCarInfo) SetLicenseNo(v string) *BasicCarInfo {
	s.LicenseNo = &v
	return s
}

func (s *BasicCarInfo) SetLicenseType(v string) *BasicCarInfo {
	s.LicenseType = &v
	return s
}

func (s *BasicCarInfo) SetVin(v string) *BasicCarInfo {
	s.Vin = &v
	return s
}

func (s *BasicCarInfo) SetEngineNo(v string) *BasicCarInfo {
	s.EngineNo = &v
	return s
}

// 行驶证证信息
type VehicleLicenseInfo struct {
	// 品牌名称
	BrandName *string `json:"brand_name,omitempty" xml:"brand_name,omitempty"`
	// 车身颜色
	BodyColor *string `json:"body_color,omitempty" xml:"body_color,omitempty"`
	// 使用性质
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 车型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 车辆类型
	VehicleType *string `json:"vehicle_type,omitempty" xml:"vehicle_type,omitempty"`
	// 发动机号
	EngineNumber *string `json:"engine_number,omitempty" xml:"engine_number,omitempty"`
	// 发动机型号
	EngineModel *string `json:"engine_model,omitempty" xml:"engine_model,omitempty"`
	// 初次登记日期
	FirstRegistryDate *string `json:"first_registry_date,omitempty" xml:"first_registry_date,omitempty"`
	// 检验失效日期
	InspectionExpireDate *string `json:"inspection_expire_date,omitempty" xml:"inspection_expire_date,omitempty"`
	// 车辆状态
	VehicleStatus *string `json:"vehicle_status,omitempty" xml:"vehicle_status,omitempty"`
	// 核定载客数
	Passengers *string `json:"passengers,omitempty" xml:"passengers,omitempty"`
	// 强制报废期止
	RetirementDate *string `json:"retirement_date,omitempty" xml:"retirement_date,omitempty"`
	// 燃料种类
	FuelType *string `json:"fuel_type,omitempty" xml:"fuel_type,omitempty"`
	// 排量
	Displacement *string `json:"displacement,omitempty" xml:"displacement,omitempty"`
	// 出厂日期
	PpsDate *string `json:"pps_date,omitempty" xml:"pps_date,omitempty"`
	// 最大功率
	MaximumPower *string `json:"maximum_power,omitempty" xml:"maximum_power,omitempty"`
	// 轴数
	Shaft *string `json:"shaft,omitempty" xml:"shaft,omitempty"`
	// 轴距
	WheelBase *string `json:"wheel_base,omitempty" xml:"wheel_base,omitempty"`
	// 前轮距
	FrontTread *string `json:"front_tread,omitempty" xml:"front_tread,omitempty"`
	// 后轮距
	RearTread *string `json:"rear_tread,omitempty" xml:"rear_tread,omitempty"`
	// 总重量
	CrossWeight *string `json:"cross_weight,omitempty" xml:"cross_weight,omitempty"`
	// 整备质量
	CurbWeight *string `json:"curb_weight,omitempty" xml:"curb_weight,omitempty"`
	// 核定载质量
	LoadWeight *string `json:"load_weight,omitempty" xml:"load_weight,omitempty"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty"`
	// 车牌号
	PlateNumber *string `json:"plate_number,omitempty" xml:"plate_number,omitempty"`
	// 车牌种类
	PlateType *string `json:"plate_type,omitempty" xml:"plate_type,omitempty"`
	// 检车日期
	InspectionDate *string `json:"inspection_date,omitempty" xml:"inspection_date,omitempty"`
}

func (s VehicleLicenseInfo) String() string {
	return tea.Prettify(s)
}

func (s VehicleLicenseInfo) GoString() string {
	return s.String()
}

func (s *VehicleLicenseInfo) SetBrandName(v string) *VehicleLicenseInfo {
	s.BrandName = &v
	return s
}

func (s *VehicleLicenseInfo) SetBodyColor(v string) *VehicleLicenseInfo {
	s.BodyColor = &v
	return s
}

func (s *VehicleLicenseInfo) SetProperties(v string) *VehicleLicenseInfo {
	s.Properties = &v
	return s
}

func (s *VehicleLicenseInfo) SetType(v string) *VehicleLicenseInfo {
	s.Type = &v
	return s
}

func (s *VehicleLicenseInfo) SetVehicleType(v string) *VehicleLicenseInfo {
	s.VehicleType = &v
	return s
}

func (s *VehicleLicenseInfo) SetEngineNumber(v string) *VehicleLicenseInfo {
	s.EngineNumber = &v
	return s
}

func (s *VehicleLicenseInfo) SetEngineModel(v string) *VehicleLicenseInfo {
	s.EngineModel = &v
	return s
}

func (s *VehicleLicenseInfo) SetFirstRegistryDate(v string) *VehicleLicenseInfo {
	s.FirstRegistryDate = &v
	return s
}

func (s *VehicleLicenseInfo) SetInspectionExpireDate(v string) *VehicleLicenseInfo {
	s.InspectionExpireDate = &v
	return s
}

func (s *VehicleLicenseInfo) SetVehicleStatus(v string) *VehicleLicenseInfo {
	s.VehicleStatus = &v
	return s
}

func (s *VehicleLicenseInfo) SetPassengers(v string) *VehicleLicenseInfo {
	s.Passengers = &v
	return s
}

func (s *VehicleLicenseInfo) SetRetirementDate(v string) *VehicleLicenseInfo {
	s.RetirementDate = &v
	return s
}

func (s *VehicleLicenseInfo) SetFuelType(v string) *VehicleLicenseInfo {
	s.FuelType = &v
	return s
}

func (s *VehicleLicenseInfo) SetDisplacement(v string) *VehicleLicenseInfo {
	s.Displacement = &v
	return s
}

func (s *VehicleLicenseInfo) SetPpsDate(v string) *VehicleLicenseInfo {
	s.PpsDate = &v
	return s
}

func (s *VehicleLicenseInfo) SetMaximumPower(v string) *VehicleLicenseInfo {
	s.MaximumPower = &v
	return s
}

func (s *VehicleLicenseInfo) SetShaft(v string) *VehicleLicenseInfo {
	s.Shaft = &v
	return s
}

func (s *VehicleLicenseInfo) SetWheelBase(v string) *VehicleLicenseInfo {
	s.WheelBase = &v
	return s
}

func (s *VehicleLicenseInfo) SetFrontTread(v string) *VehicleLicenseInfo {
	s.FrontTread = &v
	return s
}

func (s *VehicleLicenseInfo) SetRearTread(v string) *VehicleLicenseInfo {
	s.RearTread = &v
	return s
}

func (s *VehicleLicenseInfo) SetCrossWeight(v string) *VehicleLicenseInfo {
	s.CrossWeight = &v
	return s
}

func (s *VehicleLicenseInfo) SetCurbWeight(v string) *VehicleLicenseInfo {
	s.CurbWeight = &v
	return s
}

func (s *VehicleLicenseInfo) SetLoadWeight(v string) *VehicleLicenseInfo {
	s.LoadWeight = &v
	return s
}

func (s *VehicleLicenseInfo) SetVin(v string) *VehicleLicenseInfo {
	s.Vin = &v
	return s
}

func (s *VehicleLicenseInfo) SetPlateNumber(v string) *VehicleLicenseInfo {
	s.PlateNumber = &v
	return s
}

func (s *VehicleLicenseInfo) SetPlateType(v string) *VehicleLicenseInfo {
	s.PlateType = &v
	return s
}

func (s *VehicleLicenseInfo) SetInspectionDate(v string) *VehicleLicenseInfo {
	s.InspectionDate = &v
	return s
}

// 教育经历信息
type EducationExperiencesInfo struct {
	// 学历
	Degree *string `json:"degree,omitempty" xml:"degree,omitempty" maxLength:"32"`
	// 受教育地点
	Location *string `json:"location,omitempty" xml:"location,omitempty" maxLength:"128"`
	// 学校名称
	SchoolName *string `json:"school_name,omitempty" xml:"school_name,omitempty" maxLength:"128"`
	// 教育状态
	EducationStatus *string `json:"education_status,omitempty" xml:"education_status,omitempty" maxLength:"128"`
	// 年
	Year *int64 `json:"year,omitempty" xml:"year,omitempty" maximum:"6"`
	// 月
	Month *int64 `json:"month,omitempty" xml:"month,omitempty" maximum:"5"`
}

func (s EducationExperiencesInfo) String() string {
	return tea.Prettify(s)
}

func (s EducationExperiencesInfo) GoString() string {
	return s.String()
}

func (s *EducationExperiencesInfo) SetDegree(v string) *EducationExperiencesInfo {
	s.Degree = &v
	return s
}

func (s *EducationExperiencesInfo) SetLocation(v string) *EducationExperiencesInfo {
	s.Location = &v
	return s
}

func (s *EducationExperiencesInfo) SetSchoolName(v string) *EducationExperiencesInfo {
	s.SchoolName = &v
	return s
}

func (s *EducationExperiencesInfo) SetEducationStatus(v string) *EducationExperiencesInfo {
	s.EducationStatus = &v
	return s
}

func (s *EducationExperiencesInfo) SetYear(v int64) *EducationExperiencesInfo {
	s.Year = &v
	return s
}

func (s *EducationExperiencesInfo) SetMonth(v int64) *EducationExperiencesInfo {
	s.Month = &v
	return s
}

// 教育学历信息
type EducationInfo struct {
	// 专业
	Major *string `json:"major,omitempty" xml:"major,omitempty"`
	// 学历等级代码
	EducationLevel *string `json:"education_level,omitempty" xml:"education_level,omitempty"`
	// 毕业日期
	GraduationDate *string `json:"graduation_date,omitempty" xml:"graduation_date,omitempty"`
	// 学习形式
	EducationType *string `json:"education_type,omitempty" xml:"education_type,omitempty"`
	// 是否211
	Project211 *bool `json:"project211,omitempty" xml:"project211,omitempty"`
	// 是否985
	Project985 *bool `json:"project985,omitempty" xml:"project985,omitempty"`
	// 是否双一流
	DoubleFirstClass *bool `json:"double_first_class,omitempty" xml:"double_first_class,omitempty"`
}

func (s EducationInfo) String() string {
	return tea.Prettify(s)
}

func (s EducationInfo) GoString() string {
	return s.String()
}

func (s *EducationInfo) SetMajor(v string) *EducationInfo {
	s.Major = &v
	return s
}

func (s *EducationInfo) SetEducationLevel(v string) *EducationInfo {
	s.EducationLevel = &v
	return s
}

func (s *EducationInfo) SetGraduationDate(v string) *EducationInfo {
	s.GraduationDate = &v
	return s
}

func (s *EducationInfo) SetEducationType(v string) *EducationInfo {
	s.EducationType = &v
	return s
}

func (s *EducationInfo) SetProject211(v bool) *EducationInfo {
	s.Project211 = &v
	return s
}

func (s *EducationInfo) SetProject985(v bool) *EducationInfo {
	s.Project985 = &v
	return s
}

func (s *EducationInfo) SetDoubleFirstClass(v bool) *EducationInfo {
	s.DoubleFirstClass = &v
	return s
}

// 车辆用户信息
type CarUserInfo struct {
	// 唯一标识用户的id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 手机号
	PhoneNum *string `json:"phone_num,omitempty" xml:"phone_num,omitempty" require:"true"`
	// 姓名
	UserCertName *string `json:"user_cert_name,omitempty" xml:"user_cert_name,omitempty"`
	// 证件号码
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
}

func (s CarUserInfo) String() string {
	return tea.Prettify(s)
}

func (s CarUserInfo) GoString() string {
	return s.String()
}

func (s *CarUserInfo) SetUserId(v string) *CarUserInfo {
	s.UserId = &v
	return s
}

func (s *CarUserInfo) SetPhoneNum(v string) *CarUserInfo {
	s.PhoneNum = &v
	return s
}

func (s *CarUserInfo) SetUserCertName(v string) *CarUserInfo {
	s.UserCertName = &v
	return s
}

func (s *CarUserInfo) SetUserCertNo(v string) *CarUserInfo {
	s.UserCertNo = &v
	return s
}

// 授权人企业信息
type AuthPersonEnterpriseInfo struct {
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 企业统一社会信用码
	EnterpriseCreditNum *string `json:"enterprise_credit_num,omitempty" xml:"enterprise_credit_num,omitempty" require:"true"`
	// 企业法人姓名
	EnterpriseLegalPersonName *string `json:"enterprise_legal_person_name,omitempty" xml:"enterprise_legal_person_name,omitempty" require:"true"`
	// 企业法人身份证号
	EnterpriseLegalPersonId *string `json:"enterprise_legal_person_id,omitempty" xml:"enterprise_legal_person_id,omitempty" require:"true"`
	// 企业法人电话号码
	EnterpriseLegalPersonPhoneNum *int64 `json:"enterprise_legal_person_phone_num,omitempty" xml:"enterprise_legal_person_phone_num,omitempty" require:"true"`
}

func (s AuthPersonEnterpriseInfo) String() string {
	return tea.Prettify(s)
}

func (s AuthPersonEnterpriseInfo) GoString() string {
	return s.String()
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseName(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseName = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseCreditNum(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseCreditNum = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonName(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonName = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonId(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonId = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonPhoneNum(v int64) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonPhoneNum = &v
	return s
}

// 企业工商信息_自然人查询
type EnterprisePersonInfo struct {
	// 查询人对应企业名
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 查询人持股信息
	Stockholder *StockHolder `json:"stockholder,omitempty" xml:"stockholder,omitempty"`
	// 查询人所在公司基本信息
	BasicInfo *EnterpriseBasicInfo `json:"basic_info,omitempty" xml:"basic_info,omitempty"`
	// 查询人与这家企业的关联:sh 股东;lp 法人;tm 高管
	Relationship []*string `json:"relationship,omitempty" xml:"relationship,omitempty" type:"Repeated"`
}

func (s EnterprisePersonInfo) String() string {
	return tea.Prettify(s)
}

func (s EnterprisePersonInfo) GoString() string {
	return s.String()
}

func (s *EnterprisePersonInfo) SetOrgName(v string) *EnterprisePersonInfo {
	s.OrgName = &v
	return s
}

func (s *EnterprisePersonInfo) SetStockholder(v *StockHolder) *EnterprisePersonInfo {
	s.Stockholder = v
	return s
}

func (s *EnterprisePersonInfo) SetBasicInfo(v *EnterpriseBasicInfo) *EnterprisePersonInfo {
	s.BasicInfo = v
	return s
}

func (s *EnterprisePersonInfo) SetRelationship(v []*string) *EnterprisePersonInfo {
	s.Relationship = v
	return s
}

// 行驶证核验结果
type VehicleLicenseCertResult struct {
	// 与车辆的车牌号是否一致
	PlateNumber *bool `json:"plate_number,omitempty" xml:"plate_number,omitempty"`
	// 与车辆对应号牌种类是否一致
	PlateType *bool `json:"plate_type,omitempty" xml:"plate_type,omitempty"`
	// 与车辆所有人是否一致
	Owner *bool `json:"owner,omitempty" xml:"owner,omitempty"`
}

func (s VehicleLicenseCertResult) String() string {
	return tea.Prettify(s)
}

func (s VehicleLicenseCertResult) GoString() string {
	return s.String()
}

func (s *VehicleLicenseCertResult) SetPlateNumber(v bool) *VehicleLicenseCertResult {
	s.PlateNumber = &v
	return s
}

func (s *VehicleLicenseCertResult) SetPlateType(v bool) *VehicleLicenseCertResult {
	s.PlateType = &v
	return s
}

func (s *VehicleLicenseCertResult) SetOwner(v bool) *VehicleLicenseCertResult {
	s.Owner = &v
	return s
}

// 部分车辆信息
type PartialCarInfo struct {
	// 车牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	// 初登日期
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车辆型号
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 营运性质
	UseNatureCode *string `json:"use_nature_code,omitempty" xml:"use_nature_code,omitempty" require:"true"`
}

func (s PartialCarInfo) String() string {
	return tea.Prettify(s)
}

func (s PartialCarInfo) GoString() string {
	return s.String()
}

func (s *PartialCarInfo) SetLicenseNo(v string) *PartialCarInfo {
	s.LicenseNo = &v
	return s
}

func (s *PartialCarInfo) SetVin(v string) *PartialCarInfo {
	s.Vin = &v
	return s
}

func (s *PartialCarInfo) SetEngineNo(v string) *PartialCarInfo {
	s.EngineNo = &v
	return s
}

func (s *PartialCarInfo) SetRegisterDate(v string) *PartialCarInfo {
	s.RegisterDate = &v
	return s
}

func (s *PartialCarInfo) SetModelCode(v string) *PartialCarInfo {
	s.ModelCode = &v
	return s
}

func (s *PartialCarInfo) SetUseNatureCode(v string) *PartialCarInfo {
	s.UseNatureCode = &v
	return s
}

// 企业基本信息
type EnterpriseBaseInfo struct {
	// 机构名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 统一社会信用代码
	CreditCode *string `json:"credit_code,omitempty" xml:"credit_code,omitempty" require:"true"`
	// 企业公司注册证号
	RegNumber *string `json:"reg_number,omitempty" xml:"reg_number,omitempty" require:"true"`
	// 持股比例
	InvestRate *string `json:"invest_rate,omitempty" xml:"invest_rate,omitempty"`
	// 查询人与这家企业的关联
	Relationship *string `json:"relationship,omitempty" xml:"relationship,omitempty"`
}

func (s EnterpriseBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseBaseInfo) GoString() string {
	return s.String()
}

func (s *EnterpriseBaseInfo) SetOrgName(v string) *EnterpriseBaseInfo {
	s.OrgName = &v
	return s
}

func (s *EnterpriseBaseInfo) SetCreditCode(v string) *EnterpriseBaseInfo {
	s.CreditCode = &v
	return s
}

func (s *EnterpriseBaseInfo) SetRegNumber(v string) *EnterpriseBaseInfo {
	s.RegNumber = &v
	return s
}

func (s *EnterpriseBaseInfo) SetInvestRate(v string) *EnterpriseBaseInfo {
	s.InvestRate = &v
	return s
}

func (s *EnterpriseBaseInfo) SetRelationship(v string) *EnterpriseBaseInfo {
	s.Relationship = &v
	return s
}

// 数据源信息
type DataSource struct {
	// 数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 数据源接口地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s DataSource) String() string {
	return tea.Prettify(s)
}

func (s DataSource) GoString() string {
	return s.String()
}

func (s *DataSource) SetId(v string) *DataSource {
	s.Id = &v
	return s
}

func (s *DataSource) SetAddress(v string) *DataSource {
	s.Address = &v
	return s
}

// 驾驶证信息
type DriverLicenseInfo struct {
	// 性别，字典
	Gender *string `json:"gender,omitempty" xml:"gender,omitempty"`
	// 驾驶证发证日期,当前日期减去实际日期的天数所在区间
	IssueDate *string `json:"issue_date,omitempty" xml:"issue_date,omitempty"`
	// 驾驶证有效终止日期
	ValidEndDate *string `json:"valid_end_date,omitempty" xml:"valid_end_date,omitempty"`
	// 驾驶证有效起始日期
	ValidStartDate *string `json:"valid_start_date,omitempty" xml:"valid_start_date,omitempty"`
	// 驾驶证状态，字典
	DriverLicenseStatus *string `json:"driver_license_status,omitempty" xml:"driver_license_status,omitempty"`
	// 初次领证时间
	FirstIssueDate *string `json:"first_issue_date,omitempty" xml:"first_issue_date,omitempty"`
	// 准驾车型，字典
	AllowDriveCar *string `json:"allow_drive_car,omitempty" xml:"allow_drive_car,omitempty"`
	// 驾驶证种类，字典
	DriverLicenseType *string `json:"driver_license_type,omitempty" xml:"driver_license_type,omitempty"`
}

func (s DriverLicenseInfo) String() string {
	return tea.Prettify(s)
}

func (s DriverLicenseInfo) GoString() string {
	return s.String()
}

func (s *DriverLicenseInfo) SetGender(v string) *DriverLicenseInfo {
	s.Gender = &v
	return s
}

func (s *DriverLicenseInfo) SetIssueDate(v string) *DriverLicenseInfo {
	s.IssueDate = &v
	return s
}

func (s *DriverLicenseInfo) SetValidEndDate(v string) *DriverLicenseInfo {
	s.ValidEndDate = &v
	return s
}

func (s *DriverLicenseInfo) SetValidStartDate(v string) *DriverLicenseInfo {
	s.ValidStartDate = &v
	return s
}

func (s *DriverLicenseInfo) SetDriverLicenseStatus(v string) *DriverLicenseInfo {
	s.DriverLicenseStatus = &v
	return s
}

func (s *DriverLicenseInfo) SetFirstIssueDate(v string) *DriverLicenseInfo {
	s.FirstIssueDate = &v
	return s
}

func (s *DriverLicenseInfo) SetAllowDriveCar(v string) *DriverLicenseInfo {
	s.AllowDriveCar = &v
	return s
}

func (s *DriverLicenseInfo) SetDriverLicenseType(v string) *DriverLicenseInfo {
	s.DriverLicenseType = &v
	return s
}

// 教育标签信息
type EducationTagInfo struct {
	// 专业名称
	Major *string `json:"major,omitempty" xml:"major,omitempty"`
	// 学历等级代码
	EducationLevel *string `json:"education_level,omitempty" xml:"education_level,omitempty"`
	//
	// 毕业日期
	GraduationDate *string `json:"graduation_date,omitempty" xml:"graduation_date,omitempty"`
	// 学习形式
	EducationType *string `json:"education_type,omitempty" xml:"education_type,omitempty"`
	// 入学时间
	AdmissionDate *string `json:"admission_date,omitempty" xml:"admission_date,omitempty"`
	// 学校类型
	SchoolType *string `json:"school_type,omitempty" xml:"school_type,omitempty"`
	// 学习形式字典code
	EducationTypeCode *string `json:"education_type_code,omitempty" xml:"education_type_code,omitempty"`
	// 学校名称
	SchoolName *string `json:"school_name,omitempty" xml:"school_name,omitempty"`
}

func (s EducationTagInfo) String() string {
	return tea.Prettify(s)
}

func (s EducationTagInfo) GoString() string {
	return s.String()
}

func (s *EducationTagInfo) SetMajor(v string) *EducationTagInfo {
	s.Major = &v
	return s
}

func (s *EducationTagInfo) SetEducationLevel(v string) *EducationTagInfo {
	s.EducationLevel = &v
	return s
}

func (s *EducationTagInfo) SetGraduationDate(v string) *EducationTagInfo {
	s.GraduationDate = &v
	return s
}

func (s *EducationTagInfo) SetEducationType(v string) *EducationTagInfo {
	s.EducationType = &v
	return s
}

func (s *EducationTagInfo) SetAdmissionDate(v string) *EducationTagInfo {
	s.AdmissionDate = &v
	return s
}

func (s *EducationTagInfo) SetSchoolType(v string) *EducationTagInfo {
	s.SchoolType = &v
	return s
}

func (s *EducationTagInfo) SetEducationTypeCode(v string) *EducationTagInfo {
	s.EducationTypeCode = &v
	return s
}

func (s *EducationTagInfo) SetSchoolName(v string) *EducationTagInfo {
	s.SchoolName = &v
	return s
}

// 车辆详细信息
type DetailCarInfo struct {
	// 号牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
	// 号牌种类，枚举值
	//
	LicenseType *string `json:"license_type,omitempty" xml:"license_type,omitempty" require:"true"`
	// 车架号
	Vin *string `json:"vin,omitempty" xml:"vin,omitempty" require:"true"`
	// 发动机号
	EngineNo *string `json:"engine_no,omitempty" xml:"engine_no,omitempty" require:"true"`
	// 初登日期
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 车辆型号
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 是否营运车辆，枚举值
	UseNatureCode *string `json:"use_nature_code,omitempty" xml:"use_nature_code,omitempty" require:"true"`
	// 能源种类，枚举值
	FuelType *string `json:"fuel_type,omitempty" xml:"fuel_type,omitempty" require:"true"`
	// 排量，数字
	Displacement *string `json:"displacement,omitempty" xml:"displacement,omitempty" require:"true"`
}

func (s DetailCarInfo) String() string {
	return tea.Prettify(s)
}

func (s DetailCarInfo) GoString() string {
	return s.String()
}

func (s *DetailCarInfo) SetLicenseNo(v string) *DetailCarInfo {
	s.LicenseNo = &v
	return s
}

func (s *DetailCarInfo) SetLicenseType(v string) *DetailCarInfo {
	s.LicenseType = &v
	return s
}

func (s *DetailCarInfo) SetVin(v string) *DetailCarInfo {
	s.Vin = &v
	return s
}

func (s *DetailCarInfo) SetEngineNo(v string) *DetailCarInfo {
	s.EngineNo = &v
	return s
}

func (s *DetailCarInfo) SetRegisterDate(v string) *DetailCarInfo {
	s.RegisterDate = &v
	return s
}

func (s *DetailCarInfo) SetModelCode(v string) *DetailCarInfo {
	s.ModelCode = &v
	return s
}

func (s *DetailCarInfo) SetUseNatureCode(v string) *DetailCarInfo {
	s.UseNatureCode = &v
	return s
}

func (s *DetailCarInfo) SetFuelType(v string) *DetailCarInfo {
	s.FuelType = &v
	return s
}

func (s *DetailCarInfo) SetDisplacement(v string) *DetailCarInfo {
	s.Displacement = &v
	return s
}

// 授权配置列表响应
type AuthConfigListResponse struct {
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 数据源连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty" require:"true"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
	// 接入方企业名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty" require:"true"`
	// 被授权应用名称
	AuthAppName *string `json:"auth_app_name,omitempty" xml:"auth_app_name,omitempty" require:"true"`
	// 授权内容列表
	AuthContentList []*AuthContent `json:"auth_content_list,omitempty" xml:"auth_content_list,omitempty" require:"true" type:"Repeated"`
	// 授权次数
	AuthCount *int64 `json:"auth_count,omitempty" xml:"auth_count,omitempty" require:"true"`
	// 授权状态
	AuthStatus *bool `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
}

func (s AuthConfigListResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthConfigListResponse) GoString() string {
	return s.String()
}

func (s *AuthConfigListResponse) SetSceneCode(v string) *AuthConfigListResponse {
	s.SceneCode = &v
	return s
}

func (s *AuthConfigListResponse) SetSourceSpaceId(v string) *AuthConfigListResponse {
	s.SourceSpaceId = &v
	return s
}

func (s *AuthConfigListResponse) SetAuthEnterpriseCode(v string) *AuthConfigListResponse {
	s.AuthEnterpriseCode = &v
	return s
}

func (s *AuthConfigListResponse) SetTargetName(v string) *AuthConfigListResponse {
	s.TargetName = &v
	return s
}

func (s *AuthConfigListResponse) SetAuthAppName(v string) *AuthConfigListResponse {
	s.AuthAppName = &v
	return s
}

func (s *AuthConfigListResponse) SetAuthContentList(v []*AuthContent) *AuthConfigListResponse {
	s.AuthContentList = v
	return s
}

func (s *AuthConfigListResponse) SetAuthCount(v int64) *AuthConfigListResponse {
	s.AuthCount = &v
	return s
}

func (s *AuthConfigListResponse) SetAuthStatus(v bool) *AuthConfigListResponse {
	s.AuthStatus = &v
	return s
}

// Das平台自定义pair，key和value只能为String类型
type StringPair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 对应key的具体value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s StringPair) String() string {
	return tea.Prettify(s)
}

func (s StringPair) GoString() string {
	return s.String()
}

func (s *StringPair) SetKey(v string) *StringPair {
	s.Key = &v
	return s
}

func (s *StringPair) SetValue(v string) *StringPair {
	s.Value = &v
	return s
}

// 国内商标扩展信息
type DomesticTmExtensionInfo struct {
	// 商标logo URL地址
	TmLogoUrl *string `json:"tm_logo_url,omitempty" xml:"tm_logo_url,omitempty"`
	// 商品与服务信息列表
	GoodsInfo []*DomesticTmGoodsInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty" type:"Repeated"`
}

func (s DomesticTmExtensionInfo) String() string {
	return tea.Prettify(s)
}

func (s DomesticTmExtensionInfo) GoString() string {
	return s.String()
}

func (s *DomesticTmExtensionInfo) SetTmLogoUrl(v string) *DomesticTmExtensionInfo {
	s.TmLogoUrl = &v
	return s
}

func (s *DomesticTmExtensionInfo) SetGoodsInfo(v []*DomesticTmGoodsInfo) *DomesticTmExtensionInfo {
	s.GoodsInfo = v
	return s
}

// 授权记录列表响应
type AuthRecordListResponse struct {
	// 授权请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 授权用户did
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 授权用户信息
	UserInfo *string `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 授权内容
	AuthContent *AuthContent `json:"auth_content,omitempty" xml:"auth_content,omitempty" require:"true"`
	// 授权结果
	AuthResult *bool `json:"auth_result,omitempty" xml:"auth_result,omitempty" require:"true"`
	// 授权请求时间
	RequestTime *string `json:"request_time,omitempty" xml:"request_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议列表
	AgreementList []*Agreement `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" require:"true" type:"Repeated"`
}

func (s AuthRecordListResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthRecordListResponse) GoString() string {
	return s.String()
}

func (s *AuthRecordListResponse) SetRequestId(v string) *AuthRecordListResponse {
	s.RequestId = &v
	return s
}

func (s *AuthRecordListResponse) SetUserDid(v string) *AuthRecordListResponse {
	s.UserDid = &v
	return s
}

func (s *AuthRecordListResponse) SetUserInfo(v string) *AuthRecordListResponse {
	s.UserInfo = &v
	return s
}

func (s *AuthRecordListResponse) SetAuthContent(v *AuthContent) *AuthRecordListResponse {
	s.AuthContent = v
	return s
}

func (s *AuthRecordListResponse) SetAuthResult(v bool) *AuthRecordListResponse {
	s.AuthResult = &v
	return s
}

func (s *AuthRecordListResponse) SetRequestTime(v string) *AuthRecordListResponse {
	s.RequestTime = &v
	return s
}

func (s *AuthRecordListResponse) SetAgreementList(v []*Agreement) *AuthRecordListResponse {
	s.AgreementList = v
	return s
}

// 简历技能信息
type ResumeSkillInfo struct {
	// 技能标签名字
	SkillName *string `json:"skill_name,omitempty" xml:"skill_name,omitempty" maxLength:"128"`
}

func (s ResumeSkillInfo) String() string {
	return tea.Prettify(s)
}

func (s ResumeSkillInfo) GoString() string {
	return s.String()
}

func (s *ResumeSkillInfo) SetSkillName(v string) *ResumeSkillInfo {
	s.SkillName = &v
	return s
}

// 被授权人信息
type BeAuthedPersonInfo struct {
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 企业统一社会信用码
	EnterpriseCreditNum *string `json:"enterprise_credit_num,omitempty" xml:"enterprise_credit_num,omitempty" require:"true"`
	// 企业法人姓名
	EnterpriseLegalPersonName *string `json:"enterprise_legal_person_name,omitempty" xml:"enterprise_legal_person_name,omitempty" require:"true"`
	// 企业法人身份证号
	EnterpriseLegalPersonId *string `json:"enterprise_legal_person_id,omitempty" xml:"enterprise_legal_person_id,omitempty" require:"true"`
}

func (s BeAuthedPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s BeAuthedPersonInfo) GoString() string {
	return s.String()
}

func (s *BeAuthedPersonInfo) SetEnterpriseName(v string) *BeAuthedPersonInfo {
	s.EnterpriseName = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseCreditNum(v string) *BeAuthedPersonInfo {
	s.EnterpriseCreditNum = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseLegalPersonName(v string) *BeAuthedPersonInfo {
	s.EnterpriseLegalPersonName = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseLegalPersonId(v string) *BeAuthedPersonInfo {
	s.EnterpriseLegalPersonId = &v
	return s
}

// 授权人个人信息
type AuthPersonIndividualInfo struct {
	// 姓名
	IndividualName *string `json:"individual_name,omitempty" xml:"individual_name,omitempty" require:"true"`
	// 身份证号
	IndividualId *string `json:"individual_id,omitempty" xml:"individual_id,omitempty" require:"true"`
	// 电话号码
	IndividualPhoneNum *int64 `json:"individual_phone_num,omitempty" xml:"individual_phone_num,omitempty" require:"true"`
}

func (s AuthPersonIndividualInfo) String() string {
	return tea.Prettify(s)
}

func (s AuthPersonIndividualInfo) GoString() string {
	return s.String()
}

func (s *AuthPersonIndividualInfo) SetIndividualName(v string) *AuthPersonIndividualInfo {
	s.IndividualName = &v
	return s
}

func (s *AuthPersonIndividualInfo) SetIndividualId(v string) *AuthPersonIndividualInfo {
	s.IndividualId = &v
	return s
}

func (s *AuthPersonIndividualInfo) SetIndividualPhoneNum(v int64) *AuthPersonIndividualInfo {
	s.IndividualPhoneNum = &v
	return s
}

// 国内商标信息
type DomesticTmInfo struct {
	// 商标名称
	TmName *string `json:"tm_name,omitempty" xml:"tm_name,omitempty"`
	// 注册证号
	TmRegNum *string `json:"tm_reg_num,omitempty" xml:"tm_reg_num,omitempty"`
	// 国际分类
	IntCls *string `json:"int_cls,omitempty" xml:"int_cls,omitempty"`
	// 商标状态
	TmStatus *string `json:"tm_status,omitempty" xml:"tm_status,omitempty"`
	// 专用期开始时间
	PropertyBgnDate *string `json:"property_bgn_date,omitempty" xml:"property_bgn_date,omitempty"`
	// 注册日期
	//
	RegDate *string `json:"reg_date,omitempty" xml:"reg_date,omitempty"`
	// 是否共有商标
	IsShare *bool `json:"is_share,omitempty" xml:"is_share,omitempty"`
	// 商标共有人信息(共有商标才有该数据)
	CoownerInfos []*TmCoownerInfo `json:"coowner_infos,omitempty" xml:"coowner_infos,omitempty" type:"Repeated"`
	// 专用期结束时间
	PropertyEndDate *string `json:"property_end_date,omitempty" xml:"property_end_date,omitempty"`
	// 商标类别
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty"`
	// 权利人中文名称
	OwnerNameCn *string `json:"owner_name_cn,omitempty" xml:"owner_name_cn,omitempty"`
	// 权利人中文地址
	OwnerAddrCn *string `json:"owner_addr_cn,omitempty" xml:"owner_addr_cn,omitempty"`
	// 权利人英文名称
	OwnerNameEn *string `json:"owner_name_en,omitempty" xml:"owner_name_en,omitempty"`
	// 权利人英文地址
	OwnerAddrEn *string `json:"owner_addr_en,omitempty" xml:"owner_addr_en,omitempty"`
	// 申请人中文名称
	ApplicantNameCn *string `json:"applicant_name_cn,omitempty" xml:"applicant_name_cn,omitempty"`
	// 申请人中文地址
	ApplicantAddrCn *string `json:"applicant_addr_cn,omitempty" xml:"applicant_addr_cn,omitempty"`
	// 申请人外文名称
	ApplicantNameEn *string `json:"applicant_name_en,omitempty" xml:"applicant_name_en,omitempty"`
	// 申请人英文地址
	ApplicantAddrEn *string `json:"applicant_addr_en,omitempty" xml:"applicant_addr_en,omitempty"`
	// 权利人社会信用统一代码
	OwnerUscc *string `json:"owner_uscc,omitempty" xml:"owner_uscc,omitempty"`
	// 商标唯一标识码
	Tid *string `json:"tid,omitempty" xml:"tid,omitempty"`
}

func (s DomesticTmInfo) String() string {
	return tea.Prettify(s)
}

func (s DomesticTmInfo) GoString() string {
	return s.String()
}

func (s *DomesticTmInfo) SetTmName(v string) *DomesticTmInfo {
	s.TmName = &v
	return s
}

func (s *DomesticTmInfo) SetTmRegNum(v string) *DomesticTmInfo {
	s.TmRegNum = &v
	return s
}

func (s *DomesticTmInfo) SetIntCls(v string) *DomesticTmInfo {
	s.IntCls = &v
	return s
}

func (s *DomesticTmInfo) SetTmStatus(v string) *DomesticTmInfo {
	s.TmStatus = &v
	return s
}

func (s *DomesticTmInfo) SetPropertyBgnDate(v string) *DomesticTmInfo {
	s.PropertyBgnDate = &v
	return s
}

func (s *DomesticTmInfo) SetRegDate(v string) *DomesticTmInfo {
	s.RegDate = &v
	return s
}

func (s *DomesticTmInfo) SetIsShare(v bool) *DomesticTmInfo {
	s.IsShare = &v
	return s
}

func (s *DomesticTmInfo) SetCoownerInfos(v []*TmCoownerInfo) *DomesticTmInfo {
	s.CoownerInfos = v
	return s
}

func (s *DomesticTmInfo) SetPropertyEndDate(v string) *DomesticTmInfo {
	s.PropertyEndDate = &v
	return s
}

func (s *DomesticTmInfo) SetFormType(v string) *DomesticTmInfo {
	s.FormType = &v
	return s
}

func (s *DomesticTmInfo) SetOwnerNameCn(v string) *DomesticTmInfo {
	s.OwnerNameCn = &v
	return s
}

func (s *DomesticTmInfo) SetOwnerAddrCn(v string) *DomesticTmInfo {
	s.OwnerAddrCn = &v
	return s
}

func (s *DomesticTmInfo) SetOwnerNameEn(v string) *DomesticTmInfo {
	s.OwnerNameEn = &v
	return s
}

func (s *DomesticTmInfo) SetOwnerAddrEn(v string) *DomesticTmInfo {
	s.OwnerAddrEn = &v
	return s
}

func (s *DomesticTmInfo) SetApplicantNameCn(v string) *DomesticTmInfo {
	s.ApplicantNameCn = &v
	return s
}

func (s *DomesticTmInfo) SetApplicantAddrCn(v string) *DomesticTmInfo {
	s.ApplicantAddrCn = &v
	return s
}

func (s *DomesticTmInfo) SetApplicantNameEn(v string) *DomesticTmInfo {
	s.ApplicantNameEn = &v
	return s
}

func (s *DomesticTmInfo) SetApplicantAddrEn(v string) *DomesticTmInfo {
	s.ApplicantAddrEn = &v
	return s
}

func (s *DomesticTmInfo) SetOwnerUscc(v string) *DomesticTmInfo {
	s.OwnerUscc = &v
	return s
}

func (s *DomesticTmInfo) SetTid(v string) *DomesticTmInfo {
	s.Tid = &v
	return s
}

// 数据源详细信息
type DataSourceInfo struct {
	// 数据源biz_uuid
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty" require:"true"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口信息
	DataSourceInterfaceInfo *DataSourceInterface `json:"data_source_interface_info,omitempty" xml:"data_source_interface_info,omitempty" require:"true"`
}

func (s DataSourceInfo) String() string {
	return tea.Prettify(s)
}

func (s DataSourceInfo) GoString() string {
	return s.String()
}

func (s *DataSourceInfo) SetBizUuid(v string) *DataSourceInfo {
	s.BizUuid = &v
	return s
}

func (s *DataSourceInfo) SetName(v string) *DataSourceInfo {
	s.Name = &v
	return s
}

func (s *DataSourceInfo) SetProvider(v string) *DataSourceInfo {
	s.Provider = &v
	return s
}

func (s *DataSourceInfo) SetDataOwnerType(v string) *DataSourceInfo {
	s.DataOwnerType = &v
	return s
}

func (s *DataSourceInfo) SetDataSourceInterfaceInfo(v *DataSourceInterface) *DataSourceInfo {
	s.DataSourceInterfaceInfo = v
	return s
}

// 企业案件信息
type EnterpriseCaseInfo struct {
	// 立案信息
	CaseInfo *string `json:"case_info,omitempty" xml:"case_info,omitempty"`
	// 案件号
	CaseCode *string `json:"case_code,omitempty" xml:"case_code,omitempty"`
	// 立案时间
	CaseCreateTime *string `json:"case_create_time,omitempty" xml:"case_create_time,omitempty"`
	// 案件状态
	CaseStatus *string `json:"case_status,omitempty" xml:"case_status,omitempty"`
	// 公示状态
	PublishStatus *string `json:"publish_status,omitempty" xml:"publish_status,omitempty"`
	// 被执行人姓名
	ExecName *string `json:"exec_name,omitempty" xml:"exec_name,omitempty"`
	// 执行法院
	ExecCourtName *string `json:"exec_court_name,omitempty" xml:"exec_court_name,omitempty"`
	// 执行标的(元)
	ExecMoney *string `json:"exec_money,omitempty" xml:"exec_money,omitempty"`
	// 关联裁判文书
	GistId *string `json:"gist_id,omitempty" xml:"gist_id,omitempty"`
	// 案由
	CaseType *string `json:"case_type,omitempty" xml:"case_type,omitempty"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s EnterpriseCaseInfo) String() string {
	return tea.Prettify(s)
}

func (s EnterpriseCaseInfo) GoString() string {
	return s.String()
}

func (s *EnterpriseCaseInfo) SetCaseInfo(v string) *EnterpriseCaseInfo {
	s.CaseInfo = &v
	return s
}

func (s *EnterpriseCaseInfo) SetCaseCode(v string) *EnterpriseCaseInfo {
	s.CaseCode = &v
	return s
}

func (s *EnterpriseCaseInfo) SetCaseCreateTime(v string) *EnterpriseCaseInfo {
	s.CaseCreateTime = &v
	return s
}

func (s *EnterpriseCaseInfo) SetCaseStatus(v string) *EnterpriseCaseInfo {
	s.CaseStatus = &v
	return s
}

func (s *EnterpriseCaseInfo) SetPublishStatus(v string) *EnterpriseCaseInfo {
	s.PublishStatus = &v
	return s
}

func (s *EnterpriseCaseInfo) SetExecName(v string) *EnterpriseCaseInfo {
	s.ExecName = &v
	return s
}

func (s *EnterpriseCaseInfo) SetExecCourtName(v string) *EnterpriseCaseInfo {
	s.ExecCourtName = &v
	return s
}

func (s *EnterpriseCaseInfo) SetExecMoney(v string) *EnterpriseCaseInfo {
	s.ExecMoney = &v
	return s
}

func (s *EnterpriseCaseInfo) SetGistId(v string) *EnterpriseCaseInfo {
	s.GistId = &v
	return s
}

func (s *EnterpriseCaseInfo) SetCaseType(v string) *EnterpriseCaseInfo {
	s.CaseType = &v
	return s
}

func (s *EnterpriseCaseInfo) SetCreateTime(v string) *EnterpriseCaseInfo {
	s.CreateTime = &v
	return s
}

// 授权服务产品
type AuthProductGroup struct {
	// 产品code列表
	ProductCodeList []*string `json:"product_code_list,omitempty" xml:"product_code_list,omitempty" require:"true" type:"Repeated"`
	// 数据产品入参,JSON数组
	ProductParam *string `json:"product_param,omitempty" xml:"product_param,omitempty" require:"true"`
	// C端展示授权内容code
	AuthContentCode *string `json:"auth_content_code,omitempty" xml:"auth_content_code,omitempty" require:"true"`
}

func (s AuthProductGroup) String() string {
	return tea.Prettify(s)
}

func (s AuthProductGroup) GoString() string {
	return s.String()
}

func (s *AuthProductGroup) SetProductCodeList(v []*string) *AuthProductGroup {
	s.ProductCodeList = v
	return s
}

func (s *AuthProductGroup) SetProductParam(v string) *AuthProductGroup {
	s.ProductParam = &v
	return s
}

func (s *AuthProductGroup) SetAuthContentCode(v string) *AuthProductGroup {
	s.AuthContentCode = &v
	return s
}

// 学籍信息
type EducationStatus struct {
	// 是否211院校
	Project211 *bool `json:"project211,omitempty" xml:"project211,omitempty"`
	// 是否985院校
	Project985 *bool `json:"project985,omitempty" xml:"project985,omitempty"`
	// boolean	是否双一流院校
	DoubleFirstClass *bool `json:"double_first_class,omitempty" xml:"double_first_class,omitempty"`
	// 入学时间
	AdmissionDate *string `json:"admission_date,omitempty" xml:"admission_date,omitempty"`
	// 学制，字典
	EducationalSystem *string `json:"educational_system,omitempty" xml:"educational_system,omitempty"`
	// boolean	是否注册学籍
	RegisteredStudentStatus *bool `json:"registered_student_status,omitempty" xml:"registered_student_status,omitempty"`
}

func (s EducationStatus) String() string {
	return tea.Prettify(s)
}

func (s EducationStatus) GoString() string {
	return s.String()
}

func (s *EducationStatus) SetProject211(v bool) *EducationStatus {
	s.Project211 = &v
	return s
}

func (s *EducationStatus) SetProject985(v bool) *EducationStatus {
	s.Project985 = &v
	return s
}

func (s *EducationStatus) SetDoubleFirstClass(v bool) *EducationStatus {
	s.DoubleFirstClass = &v
	return s
}

func (s *EducationStatus) SetAdmissionDate(v string) *EducationStatus {
	s.AdmissionDate = &v
	return s
}

func (s *EducationStatus) SetEducationalSystem(v string) *EducationStatus {
	s.EducationalSystem = &v
	return s
}

func (s *EducationStatus) SetRegisteredStudentStatus(v bool) *EducationStatus {
	s.RegisteredStudentStatus = &v
	return s
}

// 简历证书信息
type CertificatesInfo struct {
	// 证书名称
	CertificateName *string `json:"certificate_name,omitempty" xml:"certificate_name,omitempty" maxLength:"128"`
}

func (s CertificatesInfo) String() string {
	return tea.Prettify(s)
}

func (s CertificatesInfo) GoString() string {
	return s.String()
}

func (s *CertificatesInfo) SetCertificateName(v string) *CertificatesInfo {
	s.CertificateName = &v
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

type UploadApplicationBatchqueryfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件md5
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 幂等id，同一批任务需使用相同的uniqueId，文件不一样但uniqueId一样，只会有一个任务，任务信息以第一次请求为准
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty" require:"true"`
}

func (s UploadApplicationBatchqueryfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationBatchqueryfileRequest) GoString() string {
	return s.String()
}

func (s *UploadApplicationBatchqueryfileRequest) SetAuthToken(v string) *UploadApplicationBatchqueryfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetProductInstanceId(v string) *UploadApplicationBatchqueryfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetFileMd5(v string) *UploadApplicationBatchqueryfileRequest {
	s.FileMd5 = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetFileObject(v io.Reader) *UploadApplicationBatchqueryfileRequest {
	s.FileObject = v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetFileObjectName(v string) *UploadApplicationBatchqueryfileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetFileId(v string) *UploadApplicationBatchqueryfileRequest {
	s.FileId = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetDataSetId(v string) *UploadApplicationBatchqueryfileRequest {
	s.DataSetId = &v
	return s
}

func (s *UploadApplicationBatchqueryfileRequest) SetUniqueId(v string) *UploadApplicationBatchqueryfileRequest {
	s.UniqueId = &v
	return s
}

type UploadApplicationBatchqueryfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 离线任务查询id，批量任务结束后可通过该字段查询结果
	//
	QueryId *string `json:"query_id,omitempty" xml:"query_id,omitempty"`
}

func (s UploadApplicationBatchqueryfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationBatchqueryfileResponse) GoString() string {
	return s.String()
}

func (s *UploadApplicationBatchqueryfileResponse) SetReqMsgId(v string) *UploadApplicationBatchqueryfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadApplicationBatchqueryfileResponse) SetResultCode(v string) *UploadApplicationBatchqueryfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadApplicationBatchqueryfileResponse) SetResultMsg(v string) *UploadApplicationBatchqueryfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadApplicationBatchqueryfileResponse) SetQueryId(v string) *UploadApplicationBatchqueryfileResponse {
	s.QueryId = &v
	return s
}

type QueryApplicationBatchqueryresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
	//
	QueryId *string `json:"query_id,omitempty" xml:"query_id,omitempty" require:"true"`
}

func (s QueryApplicationBatchqueryresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationBatchqueryresultRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationBatchqueryresultRequest) SetAuthToken(v string) *QueryApplicationBatchqueryresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationBatchqueryresultRequest) SetProductInstanceId(v string) *QueryApplicationBatchqueryresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationBatchqueryresultRequest) SetQueryId(v string) *QueryApplicationBatchqueryresultRequest {
	s.QueryId = &v
	return s
}

type QueryApplicationBatchqueryresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果文件临时链接
	//
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty"`
	// 描述结果文件完成进度：
	// 如：
	// 余额不足，部分内容查询完成
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryApplicationBatchqueryresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationBatchqueryresultResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationBatchqueryresultResponse) SetReqMsgId(v string) *QueryApplicationBatchqueryresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationBatchqueryresultResponse) SetResultCode(v string) *QueryApplicationBatchqueryresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationBatchqueryresultResponse) SetResultMsg(v string) *QueryApplicationBatchqueryresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationBatchqueryresultResponse) SetFilePath(v string) *QueryApplicationBatchqueryresultResponse {
	s.FilePath = &v
	return s
}

func (s *QueryApplicationBatchqueryresultResponse) SetMessage(v string) *QueryApplicationBatchqueryresultResponse {
	s.Message = &v
	return s
}

type QueryApplicationDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 查询数据参数，json串
	Index *string `json:"index,omitempty" xml:"index,omitempty" require:"true"`
}

func (s QueryApplicationDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDataRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationDataRequest) SetAuthToken(v string) *QueryApplicationDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationDataRequest) SetProductInstanceId(v string) *QueryApplicationDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationDataRequest) SetDataSetId(v string) *QueryApplicationDataRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationDataRequest) SetIndex(v string) *QueryApplicationDataRequest {
	s.Index = &v
	return s
}

type QueryApplicationDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryApplicationDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDataResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationDataResponse) SetReqMsgId(v string) *QueryApplicationDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationDataResponse) SetResultCode(v string) *QueryApplicationDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationDataResponse) SetResultMsg(v string) *QueryApplicationDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationDataResponse) SetData(v string) *QueryApplicationDataResponse {
	s.Data = &v
	return s
}

type QueryApplicationIpeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 企业信息
	Index *string `json:"index,omitempty" xml:"index,omitempty" require:"true"`
}

func (s QueryApplicationIpeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationIpeRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationIpeRequest) SetAuthToken(v string) *QueryApplicationIpeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationIpeRequest) SetProductInstanceId(v string) *QueryApplicationIpeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationIpeRequest) SetDataSetId(v string) *QueryApplicationIpeRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationIpeRequest) SetIndex(v string) *QueryApplicationIpeRequest {
	s.Index = &v
	return s
}

type QueryApplicationIpeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryApplicationIpeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationIpeResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationIpeResponse) SetReqMsgId(v string) *QueryApplicationIpeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationIpeResponse) SetResultCode(v string) *QueryApplicationIpeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationIpeResponse) SetResultMsg(v string) *QueryApplicationIpeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationIpeResponse) SetData(v string) *QueryApplicationIpeResponse {
	s.Data = &v
	return s
}

type QueryDomesticTrademarkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商标名称
	TmName *string `json:"tm_name,omitempty" xml:"tm_name,omitempty"`
	// 商标注册证号
	TmRegNum *string `json:"tm_reg_num,omitempty" xml:"tm_reg_num,omitempty"`
	// 商标所有人名称
	TmOwnerName *string `json:"tm_owner_name,omitempty" xml:"tm_owner_name,omitempty"`
	// 商标所有人社会信用统一代码
	TmOwnerUscc *string `json:"tm_owner_uscc,omitempty" xml:"tm_owner_uscc,omitempty"`
	// 数据集ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 每页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 当前页码，从0开始。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
}

func (s QueryDomesticTrademarkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDomesticTrademarkRequest) GoString() string {
	return s.String()
}

func (s *QueryDomesticTrademarkRequest) SetAuthToken(v string) *QueryDomesticTrademarkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetProductInstanceId(v string) *QueryDomesticTrademarkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetTmName(v string) *QueryDomesticTrademarkRequest {
	s.TmName = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetTmRegNum(v string) *QueryDomesticTrademarkRequest {
	s.TmRegNum = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetTmOwnerName(v string) *QueryDomesticTrademarkRequest {
	s.TmOwnerName = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetTmOwnerUscc(v string) *QueryDomesticTrademarkRequest {
	s.TmOwnerUscc = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetDataSetId(v string) *QueryDomesticTrademarkRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetPageSize(v int64) *QueryDomesticTrademarkRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDomesticTrademarkRequest) SetPageNum(v int64) *QueryDomesticTrademarkRequest {
	s.PageNum = &v
	return s
}

type QueryDomesticTrademarkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商标信息列表
	TmInfos []*DomesticTmInfo `json:"tm_infos,omitempty" xml:"tm_infos,omitempty" type:"Repeated"`
	// 商标总数
	TmTotal *int64 `json:"tm_total,omitempty" xml:"tm_total,omitempty"`
}

func (s QueryDomesticTrademarkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDomesticTrademarkResponse) GoString() string {
	return s.String()
}

func (s *QueryDomesticTrademarkResponse) SetReqMsgId(v string) *QueryDomesticTrademarkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDomesticTrademarkResponse) SetResultCode(v string) *QueryDomesticTrademarkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDomesticTrademarkResponse) SetResultMsg(v string) *QueryDomesticTrademarkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDomesticTrademarkResponse) SetTmInfos(v []*DomesticTmInfo) *QueryDomesticTrademarkResponse {
	s.TmInfos = v
	return s
}

func (s *QueryDomesticTrademarkResponse) SetTmTotal(v int64) *QueryDomesticTrademarkResponse {
	s.TmTotal = &v
	return s
}

type GetDomesticTrademarklogoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 商标注册证号
	TmRegNum *string `json:"tm_reg_num,omitempty" xml:"tm_reg_num,omitempty" require:"true"`
	// 商标类别
	TmFormType *string `json:"tm_form_type,omitempty" xml:"tm_form_type,omitempty" require:"true"`
}

func (s GetDomesticTrademarklogoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDomesticTrademarklogoRequest) GoString() string {
	return s.String()
}

func (s *GetDomesticTrademarklogoRequest) SetAuthToken(v string) *GetDomesticTrademarklogoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDomesticTrademarklogoRequest) SetProductInstanceId(v string) *GetDomesticTrademarklogoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDomesticTrademarklogoRequest) SetDataSetId(v string) *GetDomesticTrademarklogoRequest {
	s.DataSetId = &v
	return s
}

func (s *GetDomesticTrademarklogoRequest) SetTmRegNum(v string) *GetDomesticTrademarklogoRequest {
	s.TmRegNum = &v
	return s
}

func (s *GetDomesticTrademarklogoRequest) SetTmFormType(v string) *GetDomesticTrademarklogoRequest {
	s.TmFormType = &v
	return s
}

type GetDomesticTrademarklogoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商标logo下载地址
	TmLogoUrl *string `json:"tm_logo_url,omitempty" xml:"tm_logo_url,omitempty"`
}

func (s GetDomesticTrademarklogoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDomesticTrademarklogoResponse) GoString() string {
	return s.String()
}

func (s *GetDomesticTrademarklogoResponse) SetReqMsgId(v string) *GetDomesticTrademarklogoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDomesticTrademarklogoResponse) SetResultCode(v string) *GetDomesticTrademarklogoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDomesticTrademarklogoResponse) SetResultMsg(v string) *GetDomesticTrademarklogoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDomesticTrademarklogoResponse) SetTmLogoUrl(v string) *GetDomesticTrademarklogoResponse {
	s.TmLogoUrl = &v
	return s
}

type QueryEncryptEnterpriseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 加密的查询参数
	EncryptParameters *string `json:"encrypt_parameters,omitempty" xml:"encrypt_parameters,omitempty" require:"true"`
}

func (s QueryEncryptEnterpriseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEncryptEnterpriseinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryEncryptEnterpriseinfoRequest) SetAuthToken(v string) *QueryEncryptEnterpriseinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoRequest) SetProductInstanceId(v string) *QueryEncryptEnterpriseinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoRequest) SetDataSetId(v string) *QueryEncryptEnterpriseinfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoRequest) SetEncryptParameters(v string) *QueryEncryptEnterpriseinfoRequest {
	s.EncryptParameters = &v
	return s
}

type QueryEncryptEnterpriseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 加密的企业工商信息
	EncryptData *string `json:"encrypt_data,omitempty" xml:"encrypt_data,omitempty"`
}

func (s QueryEncryptEnterpriseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEncryptEnterpriseinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryEncryptEnterpriseinfoResponse) SetReqMsgId(v string) *QueryEncryptEnterpriseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoResponse) SetResultCode(v string) *QueryEncryptEnterpriseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoResponse) SetResultMsg(v string) *QueryEncryptEnterpriseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEncryptEnterpriseinfoResponse) SetEncryptData(v string) *QueryEncryptEnterpriseinfoResponse {
	s.EncryptData = &v
	return s
}

type UploadApplicationAuthfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	//
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 文件md5
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// 文件id
	//
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 协议名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 授权协议文件版本号
	FileVersion *string `json:"file_version,omitempty" xml:"file_version,omitempty" require:"true"`
}

func (s UploadApplicationAuthfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationAuthfileRequest) GoString() string {
	return s.String()
}

func (s *UploadApplicationAuthfileRequest) SetAuthToken(v string) *UploadApplicationAuthfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetProductInstanceId(v string) *UploadApplicationAuthfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetDataSetId(v string) *UploadApplicationAuthfileRequest {
	s.DataSetId = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileMd5(v string) *UploadApplicationAuthfileRequest {
	s.FileMd5 = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileObject(v io.Reader) *UploadApplicationAuthfileRequest {
	s.FileObject = v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileObjectName(v string) *UploadApplicationAuthfileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileId(v string) *UploadApplicationAuthfileRequest {
	s.FileId = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileName(v string) *UploadApplicationAuthfileRequest {
	s.FileName = &v
	return s
}

func (s *UploadApplicationAuthfileRequest) SetFileVersion(v string) *UploadApplicationAuthfileRequest {
	s.FileVersion = &v
	return s
}

type UploadApplicationAuthfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权协议索引号
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
}

func (s UploadApplicationAuthfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationAuthfileResponse) GoString() string {
	return s.String()
}

func (s *UploadApplicationAuthfileResponse) SetReqMsgId(v string) *UploadApplicationAuthfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadApplicationAuthfileResponse) SetResultCode(v string) *UploadApplicationAuthfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadApplicationAuthfileResponse) SetResultMsg(v string) *UploadApplicationAuthfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadApplicationAuthfileResponse) SetFileIndex(v string) *UploadApplicationAuthfileResponse {
	s.FileIndex = &v
	return s
}

type CheckApplicationHascarRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	//
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 待核验车主身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
}

func (s CheckApplicationHascarRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckApplicationHascarRequest) GoString() string {
	return s.String()
}

func (s *CheckApplicationHascarRequest) SetAuthToken(v string) *CheckApplicationHascarRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetProductInstanceId(v string) *CheckApplicationHascarRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetDataSetId(v string) *CheckApplicationHascarRequest {
	s.DataSetId = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetUserAuthed(v bool) *CheckApplicationHascarRequest {
	s.UserAuthed = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetFileIndex(v string) *CheckApplicationHascarRequest {
	s.FileIndex = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetUserName(v string) *CheckApplicationHascarRequest {
	s.UserName = &v
	return s
}

func (s *CheckApplicationHascarRequest) SetUserCertNo(v string) *CheckApplicationHascarRequest {
	s.UserCertNo = &v
	return s
}

type CheckApplicationHascarResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否有车，true：有车；false：无车
	HasCar *bool `json:"has_car,omitempty" xml:"has_car,omitempty"`
}

func (s CheckApplicationHascarResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckApplicationHascarResponse) GoString() string {
	return s.String()
}

func (s *CheckApplicationHascarResponse) SetReqMsgId(v string) *CheckApplicationHascarResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckApplicationHascarResponse) SetResultCode(v string) *CheckApplicationHascarResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckApplicationHascarResponse) SetResultMsg(v string) *CheckApplicationHascarResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckApplicationHascarResponse) SetHasCar(v bool) *CheckApplicationHascarResponse {
	s.HasCar = &v
	return s
}

type QueryApplicationBasecarinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	//
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	//
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 待核验车主姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 待核验车主身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
}

func (s QueryApplicationBasecarinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationBasecarinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationBasecarinfoRequest) SetAuthToken(v string) *QueryApplicationBasecarinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetProductInstanceId(v string) *QueryApplicationBasecarinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetDataSetId(v string) *QueryApplicationBasecarinfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetUserAuthed(v bool) *QueryApplicationBasecarinfoRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetFileIndex(v string) *QueryApplicationBasecarinfoRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetUserName(v string) *QueryApplicationBasecarinfoRequest {
	s.UserName = &v
	return s
}

func (s *QueryApplicationBasecarinfoRequest) SetUserCertNo(v string) *QueryApplicationBasecarinfoRequest {
	s.UserCertNo = &v
	return s
}

type QueryApplicationBasecarinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 车辆信息
	Data []*BasicCarInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryApplicationBasecarinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationBasecarinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationBasecarinfoResponse) SetReqMsgId(v string) *QueryApplicationBasecarinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationBasecarinfoResponse) SetResultCode(v string) *QueryApplicationBasecarinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationBasecarinfoResponse) SetResultMsg(v string) *QueryApplicationBasecarinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationBasecarinfoResponse) SetData(v []*BasicCarInfo) *QueryApplicationBasecarinfoResponse {
	s.Data = v
	return s
}

type QueryApplicationDetailcarinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	//
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	//
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	//
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 待核验车主姓名
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 待核验车主身份证号
	//
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
}

func (s QueryApplicationDetailcarinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDetailcarinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationDetailcarinfoRequest) SetAuthToken(v string) *QueryApplicationDetailcarinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetProductInstanceId(v string) *QueryApplicationDetailcarinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetDataSetId(v string) *QueryApplicationDetailcarinfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetUserAuthed(v bool) *QueryApplicationDetailcarinfoRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetFileIndex(v string) *QueryApplicationDetailcarinfoRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetUserName(v string) *QueryApplicationDetailcarinfoRequest {
	s.UserName = &v
	return s
}

func (s *QueryApplicationDetailcarinfoRequest) SetUserCertNo(v string) *QueryApplicationDetailcarinfoRequest {
	s.UserCertNo = &v
	return s
}

type QueryApplicationDetailcarinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 车辆详细信息
	Data []*DetailCarInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryApplicationDetailcarinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDetailcarinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationDetailcarinfoResponse) SetReqMsgId(v string) *QueryApplicationDetailcarinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationDetailcarinfoResponse) SetResultCode(v string) *QueryApplicationDetailcarinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationDetailcarinfoResponse) SetResultMsg(v string) *QueryApplicationDetailcarinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationDetailcarinfoResponse) SetData(v []*DetailCarInfo) *QueryApplicationDetailcarinfoResponse {
	s.Data = v
	return s
}

type SignApplicationResumeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户唯一id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s SignApplicationResumeRequest) String() string {
	return tea.Prettify(s)
}

func (s SignApplicationResumeRequest) GoString() string {
	return s.String()
}

func (s *SignApplicationResumeRequest) SetAuthToken(v string) *SignApplicationResumeRequest {
	s.AuthToken = &v
	return s
}

func (s *SignApplicationResumeRequest) SetProductInstanceId(v string) *SignApplicationResumeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SignApplicationResumeRequest) SetDataSetId(v string) *SignApplicationResumeRequest {
	s.DataSetId = &v
	return s
}

func (s *SignApplicationResumeRequest) SetUserId(v string) *SignApplicationResumeRequest {
	s.UserId = &v
	return s
}

type SignApplicationResumeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户授权支付宝链接
	AuthUrl *string `json:"auth_url,omitempty" xml:"auth_url,omitempty"`
}

func (s SignApplicationResumeResponse) String() string {
	return tea.Prettify(s)
}

func (s SignApplicationResumeResponse) GoString() string {
	return s.String()
}

func (s *SignApplicationResumeResponse) SetReqMsgId(v string) *SignApplicationResumeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SignApplicationResumeResponse) SetResultCode(v string) *SignApplicationResumeResponse {
	s.ResultCode = &v
	return s
}

func (s *SignApplicationResumeResponse) SetResultMsg(v string) *SignApplicationResumeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SignApplicationResumeResponse) SetAuthUrl(v string) *SignApplicationResumeResponse {
	s.AuthUrl = &v
	return s
}

type QueryApplicationResumeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户唯一id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QueryApplicationResumeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationResumeRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationResumeRequest) SetAuthToken(v string) *QueryApplicationResumeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationResumeRequest) SetProductInstanceId(v string) *QueryApplicationResumeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationResumeRequest) SetDataSetId(v string) *QueryApplicationResumeRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationResumeRequest) SetUserId(v string) *QueryApplicationResumeRequest {
	s.UserId = &v
	return s
}

type QueryApplicationResumeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 性别
	Gender *string `json:"gender,omitempty" xml:"gender,omitempty"`
	// 生日
	Birthday *string `json:"birthday,omitempty" xml:"birthday,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 头像图片url
	HeadPicUrl *string `json:"head_pic_url,omitempty" xml:"head_pic_url,omitempty"`
	// 简历技能
	Skills []*ResumeSkillInfo `json:"skills,omitempty" xml:"skills,omitempty" type:"Repeated"`
	// 证书信息
	Certificates []*CertificatesInfo `json:"certificates,omitempty" xml:"certificates,omitempty" type:"Repeated"`
	// 工作经历
	WorkExperiences []*WorkExperiencesInfo `json:"work_experiences,omitempty" xml:"work_experiences,omitempty" type:"Repeated"`
	// 教育经历
	EducationExperiences []*EducationExperiencesInfo `json:"education_experiences,omitempty" xml:"education_experiences,omitempty" type:"Repeated"`
}

func (s QueryApplicationResumeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationResumeResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationResumeResponse) SetReqMsgId(v string) *QueryApplicationResumeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetResultCode(v string) *QueryApplicationResumeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetResultMsg(v string) *QueryApplicationResumeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetUserName(v string) *QueryApplicationResumeResponse {
	s.UserName = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetGender(v string) *QueryApplicationResumeResponse {
	s.Gender = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetBirthday(v string) *QueryApplicationResumeResponse {
	s.Birthday = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetPhone(v string) *QueryApplicationResumeResponse {
	s.Phone = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetHeadPicUrl(v string) *QueryApplicationResumeResponse {
	s.HeadPicUrl = &v
	return s
}

func (s *QueryApplicationResumeResponse) SetSkills(v []*ResumeSkillInfo) *QueryApplicationResumeResponse {
	s.Skills = v
	return s
}

func (s *QueryApplicationResumeResponse) SetCertificates(v []*CertificatesInfo) *QueryApplicationResumeResponse {
	s.Certificates = v
	return s
}

func (s *QueryApplicationResumeResponse) SetWorkExperiences(v []*WorkExperiencesInfo) *QueryApplicationResumeResponse {
	s.WorkExperiences = v
	return s
}

func (s *QueryApplicationResumeResponse) SetEducationExperiences(v []*EducationExperiencesInfo) *QueryApplicationResumeResponse {
	s.EducationExperiences = v
	return s
}

type QueryDetailcarinfoPesonandlicRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	//
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	//
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	//
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 待核验车主姓名
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 待核验车主身份证号
	//
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 号牌号码
	LicenseNo *string `json:"license_no,omitempty" xml:"license_no,omitempty" require:"true"`
}

func (s QueryDetailcarinfoPesonandlicRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDetailcarinfoPesonandlicRequest) GoString() string {
	return s.String()
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetAuthToken(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetProductInstanceId(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetDataSetId(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetUserAuthed(v bool) *QueryDetailcarinfoPesonandlicRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetFileIndex(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetUserName(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.UserName = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetUserCertNo(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.UserCertNo = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicRequest) SetLicenseNo(v string) *QueryDetailcarinfoPesonandlicRequest {
	s.LicenseNo = &v
	return s
}

type QueryDetailcarinfoPesonandlicResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 车辆详细信息
	Data *DetailCarInfo `json:"data,omitempty" xml:"data,omitempty"`
	// 是否是该人名下的车，true表示是，false表示否
	Owner *bool `json:"owner,omitempty" xml:"owner,omitempty"`
}

func (s QueryDetailcarinfoPesonandlicResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDetailcarinfoPesonandlicResponse) GoString() string {
	return s.String()
}

func (s *QueryDetailcarinfoPesonandlicResponse) SetReqMsgId(v string) *QueryDetailcarinfoPesonandlicResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicResponse) SetResultCode(v string) *QueryDetailcarinfoPesonandlicResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicResponse) SetResultMsg(v string) *QueryDetailcarinfoPesonandlicResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDetailcarinfoPesonandlicResponse) SetData(v *DetailCarInfo) *QueryDetailcarinfoPesonandlicResponse {
	s.Data = v
	return s
}

func (s *QueryDetailcarinfoPesonandlicResponse) SetOwner(v bool) *QueryDetailcarinfoPesonandlicResponse {
	s.Owner = &v
	return s
}

type QueryIdnumberEducationtaginfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户是否已授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 该接口对应的授权协议索引号
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
	// 用户手机号
	UserTel *string `json:"user_tel,omitempty" xml:"user_tel,omitempty"`
}

func (s QueryIdnumberEducationtaginfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIdnumberEducationtaginfoRequest) GoString() string {
	return s.String()
}

func (s *QueryIdnumberEducationtaginfoRequest) SetAuthToken(v string) *QueryIdnumberEducationtaginfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetProductInstanceId(v string) *QueryIdnumberEducationtaginfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetDataSetId(v string) *QueryIdnumberEducationtaginfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetUserAuthed(v bool) *QueryIdnumberEducationtaginfoRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetFileIndex(v string) *QueryIdnumberEducationtaginfoRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetUserName(v string) *QueryIdnumberEducationtaginfoRequest {
	s.UserName = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetUserCertNo(v string) *QueryIdnumberEducationtaginfoRequest {
	s.UserCertNo = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoRequest) SetUserTel(v string) *QueryIdnumberEducationtaginfoRequest {
	s.UserTel = &v
	return s
}

type QueryIdnumberEducationtaginfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 教育信息
	Data *EducationTagInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryIdnumberEducationtaginfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIdnumberEducationtaginfoResponse) GoString() string {
	return s.String()
}

func (s *QueryIdnumberEducationtaginfoResponse) SetReqMsgId(v string) *QueryIdnumberEducationtaginfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoResponse) SetResultCode(v string) *QueryIdnumberEducationtaginfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoResponse) SetResultMsg(v string) *QueryIdnumberEducationtaginfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIdnumberEducationtaginfoResponse) SetData(v *EducationTagInfo) *QueryIdnumberEducationtaginfoResponse {
	s.Data = v
	return s
}

type QueryPhonenumberEducationinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户是否已授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 该接口对应的授权协议索引号
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号
	UserTel *string `json:"user_tel,omitempty" xml:"user_tel,omitempty"`
	// 身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 类型指示码
	TypeCode *string `json:"type_code,omitempty" xml:"type_code,omitempty" require:"true"`
}

func (s QueryPhonenumberEducationinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPhonenumberEducationinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryPhonenumberEducationinfoRequest) SetAuthToken(v string) *QueryPhonenumberEducationinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetProductInstanceId(v string) *QueryPhonenumberEducationinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetDataSetId(v string) *QueryPhonenumberEducationinfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetUserAuthed(v bool) *QueryPhonenumberEducationinfoRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetFileIndex(v string) *QueryPhonenumberEducationinfoRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetUserName(v string) *QueryPhonenumberEducationinfoRequest {
	s.UserName = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetUserTel(v string) *QueryPhonenumberEducationinfoRequest {
	s.UserTel = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetUserCertNo(v string) *QueryPhonenumberEducationinfoRequest {
	s.UserCertNo = &v
	return s
}

func (s *QueryPhonenumberEducationinfoRequest) SetTypeCode(v string) *QueryPhonenumberEducationinfoRequest {
	s.TypeCode = &v
	return s
}

type QueryPhonenumberEducationinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 教育信息
	Data *EducationTagInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryPhonenumberEducationinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPhonenumberEducationinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryPhonenumberEducationinfoResponse) SetReqMsgId(v string) *QueryPhonenumberEducationinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPhonenumberEducationinfoResponse) SetResultCode(v string) *QueryPhonenumberEducationinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPhonenumberEducationinfoResponse) SetResultMsg(v string) *QueryPhonenumberEducationinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPhonenumberEducationinfoResponse) SetData(v *EducationTagInfo) *QueryPhonenumberEducationinfoResponse {
	s.Data = v
	return s
}

type QueryApplicationUnifiedentranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
	// 整个需求的入参，map json
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty"`
	// 数据集服务id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 授权token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// token授权场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
}

func (s QueryApplicationUnifiedentranceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationUnifiedentranceRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationUnifiedentranceRequest) SetAuthToken(v string) *QueryApplicationUnifiedentranceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetProductInstanceId(v string) *QueryApplicationUnifiedentranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetFileIndex(v string) *QueryApplicationUnifiedentranceRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetParams(v string) *QueryApplicationUnifiedentranceRequest {
	s.Params = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetUserAuthed(v bool) *QueryApplicationUnifiedentranceRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetDataSetId(v string) *QueryApplicationUnifiedentranceRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetToken(v string) *QueryApplicationUnifiedentranceRequest {
	s.Token = &v
	return s
}

func (s *QueryApplicationUnifiedentranceRequest) SetSceneCode(v string) *QueryApplicationUnifiedentranceRequest {
	s.SceneCode = &v
	return s
}

type QueryApplicationUnifiedentranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 具体返回，map json
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryApplicationUnifiedentranceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationUnifiedentranceResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationUnifiedentranceResponse) SetReqMsgId(v string) *QueryApplicationUnifiedentranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationUnifiedentranceResponse) SetResultCode(v string) *QueryApplicationUnifiedentranceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationUnifiedentranceResponse) SetResultMsg(v string) *QueryApplicationUnifiedentranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationUnifiedentranceResponse) SetData(v string) *QueryApplicationUnifiedentranceResponse {
	s.Data = &v
	return s
}

type QueryApplicationDriverlicensecertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s QueryApplicationDriverlicensecertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDriverlicensecertRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationDriverlicensecertRequest) SetAuthToken(v string) *QueryApplicationDriverlicensecertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetProductInstanceId(v string) *QueryApplicationDriverlicensecertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetDataSetId(v string) *QueryApplicationDriverlicensecertRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetUserAuthed(v bool) *QueryApplicationDriverlicensecertRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetFileIndex(v string) *QueryApplicationDriverlicensecertRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetUserCertNo(v string) *QueryApplicationDriverlicensecertRequest {
	s.UserCertNo = &v
	return s
}

func (s *QueryApplicationDriverlicensecertRequest) SetUserName(v string) *QueryApplicationDriverlicensecertRequest {
	s.UserName = &v
	return s
}

type QueryApplicationDriverlicensecertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 驾驶证信息
	DriverLicenseInfo *DriverLicenseInfo `json:"driver_license_info,omitempty" xml:"driver_license_info,omitempty"`
	// 身份证与姓名是否一致，字典
	CertResult *string `json:"cert_result,omitempty" xml:"cert_result,omitempty"`
}

func (s QueryApplicationDriverlicensecertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationDriverlicensecertResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationDriverlicensecertResponse) SetReqMsgId(v string) *QueryApplicationDriverlicensecertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationDriverlicensecertResponse) SetResultCode(v string) *QueryApplicationDriverlicensecertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationDriverlicensecertResponse) SetResultMsg(v string) *QueryApplicationDriverlicensecertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationDriverlicensecertResponse) SetDriverLicenseInfo(v *DriverLicenseInfo) *QueryApplicationDriverlicensecertResponse {
	s.DriverLicenseInfo = v
	return s
}

func (s *QueryApplicationDriverlicensecertResponse) SetCertResult(v string) *QueryApplicationDriverlicensecertResponse {
	s.CertResult = &v
	return s
}

type QueryApplicationVehiclelicensecertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集id，开发者提供
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 车牌号
	PlateNumber *string `json:"plate_number,omitempty" xml:"plate_number,omitempty" require:"true"`
	// 号牌种类，枚举
	PlateType *string `json:"plate_type,omitempty" xml:"plate_type,omitempty" require:"true"`
	// 所有人姓名
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
}

func (s QueryApplicationVehiclelicensecertRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationVehiclelicensecertRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationVehiclelicensecertRequest) SetAuthToken(v string) *QueryApplicationVehiclelicensecertRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetProductInstanceId(v string) *QueryApplicationVehiclelicensecertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetDataSetId(v string) *QueryApplicationVehiclelicensecertRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetUserAuthed(v bool) *QueryApplicationVehiclelicensecertRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetFileIndex(v string) *QueryApplicationVehiclelicensecertRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetPlateNumber(v string) *QueryApplicationVehiclelicensecertRequest {
	s.PlateNumber = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetPlateType(v string) *QueryApplicationVehiclelicensecertRequest {
	s.PlateType = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertRequest) SetOwner(v string) *QueryApplicationVehiclelicensecertRequest {
	s.Owner = &v
	return s
}

type QueryApplicationVehiclelicensecertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 行驶证信息
	VehicleLicenseInfo *VehicleLicenseInfo `json:"vehicle_license_info,omitempty" xml:"vehicle_license_info,omitempty"`
	// 行驶证核验结果
	VehicleLicenseCertResult *VehicleLicenseCertResult `json:"vehicle_license_cert_result,omitempty" xml:"vehicle_license_cert_result,omitempty"`
}

func (s QueryApplicationVehiclelicensecertResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationVehiclelicensecertResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationVehiclelicensecertResponse) SetReqMsgId(v string) *QueryApplicationVehiclelicensecertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertResponse) SetResultCode(v string) *QueryApplicationVehiclelicensecertResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertResponse) SetResultMsg(v string) *QueryApplicationVehiclelicensecertResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationVehiclelicensecertResponse) SetVehicleLicenseInfo(v *VehicleLicenseInfo) *QueryApplicationVehiclelicensecertResponse {
	s.VehicleLicenseInfo = v
	return s
}

func (s *QueryApplicationVehiclelicensecertResponse) SetVehicleLicenseCertResult(v *VehicleLicenseCertResult) *QueryApplicationVehiclelicensecertResponse {
	s.VehicleLicenseCertResult = v
	return s
}

type QueryApplicationEducationstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需求ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户是否已经授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty" require:"true"`
	// 授权文件索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty" require:"true"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 身份证号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty" require:"true"`
}

func (s QueryApplicationEducationstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationEducationstatusRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationEducationstatusRequest) SetAuthToken(v string) *QueryApplicationEducationstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetProductInstanceId(v string) *QueryApplicationEducationstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetDataSetId(v string) *QueryApplicationEducationstatusRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetUserAuthed(v bool) *QueryApplicationEducationstatusRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetFileIndex(v string) *QueryApplicationEducationstatusRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetUserName(v string) *QueryApplicationEducationstatusRequest {
	s.UserName = &v
	return s
}

func (s *QueryApplicationEducationstatusRequest) SetUserCertNo(v string) *QueryApplicationEducationstatusRequest {
	s.UserCertNo = &v
	return s
}

type QueryApplicationEducationstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 学籍信息
	Data []*EducationStatus `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryApplicationEducationstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationEducationstatusResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationEducationstatusResponse) SetReqMsgId(v string) *QueryApplicationEducationstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationEducationstatusResponse) SetResultCode(v string) *QueryApplicationEducationstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationEducationstatusResponse) SetResultMsg(v string) *QueryApplicationEducationstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationEducationstatusResponse) SetData(v []*EducationStatus) *QueryApplicationEducationstatusResponse {
	s.Data = v
	return s
}

type UploadServiceAuthfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待获取数据类型的服务id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 文件md5
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 协议名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 授权协议文件版本号
	FileVersion *string `json:"file_version,omitempty" xml:"file_version,omitempty" require:"true"`
}

func (s UploadServiceAuthfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadServiceAuthfileRequest) GoString() string {
	return s.String()
}

func (s *UploadServiceAuthfileRequest) SetAuthToken(v string) *UploadServiceAuthfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetProductInstanceId(v string) *UploadServiceAuthfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetServiceId(v string) *UploadServiceAuthfileRequest {
	s.ServiceId = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileMd5(v string) *UploadServiceAuthfileRequest {
	s.FileMd5 = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileObject(v io.Reader) *UploadServiceAuthfileRequest {
	s.FileObject = v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileObjectName(v string) *UploadServiceAuthfileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileId(v string) *UploadServiceAuthfileRequest {
	s.FileId = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileName(v string) *UploadServiceAuthfileRequest {
	s.FileName = &v
	return s
}

func (s *UploadServiceAuthfileRequest) SetFileVersion(v string) *UploadServiceAuthfileRequest {
	s.FileVersion = &v
	return s
}

type UploadServiceAuthfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权协议索引号
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
}

func (s UploadServiceAuthfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadServiceAuthfileResponse) GoString() string {
	return s.String()
}

func (s *UploadServiceAuthfileResponse) SetReqMsgId(v string) *UploadServiceAuthfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadServiceAuthfileResponse) SetResultCode(v string) *UploadServiceAuthfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadServiceAuthfileResponse) SetResultMsg(v string) *UploadServiceAuthfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadServiceAuthfileResponse) SetFileIndex(v string) *UploadServiceAuthfileResponse {
	s.FileIndex = &v
	return s
}

type QueryDomestictrademarkExtensioninfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 商标唯一标识号
	Tid *string `json:"tid,omitempty" xml:"tid,omitempty" require:"true"`
}

func (s QueryDomestictrademarkExtensioninfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDomestictrademarkExtensioninfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDomestictrademarkExtensioninfoRequest) SetAuthToken(v string) *QueryDomestictrademarkExtensioninfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoRequest) SetProductInstanceId(v string) *QueryDomestictrademarkExtensioninfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoRequest) SetDataSetId(v string) *QueryDomestictrademarkExtensioninfoRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoRequest) SetTid(v string) *QueryDomestictrademarkExtensioninfoRequest {
	s.Tid = &v
	return s
}

type QueryDomestictrademarkExtensioninfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商标扩展商品与服务信息
	Data []*DomesticTmGoodsInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryDomestictrademarkExtensioninfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDomestictrademarkExtensioninfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDomestictrademarkExtensioninfoResponse) SetReqMsgId(v string) *QueryDomestictrademarkExtensioninfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoResponse) SetResultCode(v string) *QueryDomestictrademarkExtensioninfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoResponse) SetResultMsg(v string) *QueryDomestictrademarkExtensioninfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDomestictrademarkExtensioninfoResponse) SetData(v []*DomesticTmGoodsInfo) *QueryDomestictrademarkExtensioninfoResponse {
	s.Data = v
	return s
}

type GetApplicationFileentranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据集ID
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	// 用户是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty"`
	// 授权文件ID
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
}

func (s GetApplicationFileentranceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApplicationFileentranceRequest) GoString() string {
	return s.String()
}

func (s *GetApplicationFileentranceRequest) SetAuthToken(v string) *GetApplicationFileentranceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApplicationFileentranceRequest) SetProductInstanceId(v string) *GetApplicationFileentranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApplicationFileentranceRequest) SetDataSetId(v string) *GetApplicationFileentranceRequest {
	s.DataSetId = &v
	return s
}

func (s *GetApplicationFileentranceRequest) SetUserAuthed(v bool) *GetApplicationFileentranceRequest {
	s.UserAuthed = &v
	return s
}

func (s *GetApplicationFileentranceRequest) SetFileIndex(v string) *GetApplicationFileentranceRequest {
	s.FileIndex = &v
	return s
}

type GetApplicationFileentranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 临时下载地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetApplicationFileentranceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApplicationFileentranceResponse) GoString() string {
	return s.String()
}

func (s *GetApplicationFileentranceResponse) SetReqMsgId(v string) *GetApplicationFileentranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApplicationFileentranceResponse) SetResultCode(v string) *GetApplicationFileentranceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApplicationFileentranceResponse) SetResultMsg(v string) *GetApplicationFileentranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApplicationFileentranceResponse) SetUrl(v string) *GetApplicationFileentranceResponse {
	s.Url = &v
	return s
}

type InitUnifiedentranceAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
	// 整个需求的入参，map json
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 是否授权
	UserAuthed *string `json:"user_authed,omitempty" xml:"user_authed,omitempty"`
	// 数据集服务id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
}

func (s InitUnifiedentranceAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s InitUnifiedentranceAsyncRequest) GoString() string {
	return s.String()
}

func (s *InitUnifiedentranceAsyncRequest) SetAuthToken(v string) *InitUnifiedentranceAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *InitUnifiedentranceAsyncRequest) SetProductInstanceId(v string) *InitUnifiedentranceAsyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitUnifiedentranceAsyncRequest) SetFileIndex(v string) *InitUnifiedentranceAsyncRequest {
	s.FileIndex = &v
	return s
}

func (s *InitUnifiedentranceAsyncRequest) SetParams(v string) *InitUnifiedentranceAsyncRequest {
	s.Params = &v
	return s
}

func (s *InitUnifiedentranceAsyncRequest) SetUserAuthed(v string) *InitUnifiedentranceAsyncRequest {
	s.UserAuthed = &v
	return s
}

func (s *InitUnifiedentranceAsyncRequest) SetDataSetId(v string) *InitUnifiedentranceAsyncRequest {
	s.DataSetId = &v
	return s
}

type InitUnifiedentranceAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 具体返回，map json
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InitUnifiedentranceAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s InitUnifiedentranceAsyncResponse) GoString() string {
	return s.String()
}

func (s *InitUnifiedentranceAsyncResponse) SetReqMsgId(v string) *InitUnifiedentranceAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitUnifiedentranceAsyncResponse) SetResultCode(v string) *InitUnifiedentranceAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *InitUnifiedentranceAsyncResponse) SetResultMsg(v string) *InitUnifiedentranceAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitUnifiedentranceAsyncResponse) SetData(v string) *InitUnifiedentranceAsyncResponse {
	s.Data = &v
	return s
}

type QueryUnifiedentranceAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 整个需求的入参，map json
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 数据集服务id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
}

func (s QueryUnifiedentranceAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUnifiedentranceAsyncRequest) GoString() string {
	return s.String()
}

func (s *QueryUnifiedentranceAsyncRequest) SetAuthToken(v string) *QueryUnifiedentranceAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUnifiedentranceAsyncRequest) SetProductInstanceId(v string) *QueryUnifiedentranceAsyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUnifiedentranceAsyncRequest) SetParams(v string) *QueryUnifiedentranceAsyncRequest {
	s.Params = &v
	return s
}

func (s *QueryUnifiedentranceAsyncRequest) SetDataSetId(v string) *QueryUnifiedentranceAsyncRequest {
	s.DataSetId = &v
	return s
}

type QueryUnifiedentranceAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 具体返回，map json
	//
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryUnifiedentranceAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUnifiedentranceAsyncResponse) GoString() string {
	return s.String()
}

func (s *QueryUnifiedentranceAsyncResponse) SetReqMsgId(v string) *QueryUnifiedentranceAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUnifiedentranceAsyncResponse) SetResultCode(v string) *QueryUnifiedentranceAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUnifiedentranceAsyncResponse) SetResultMsg(v string) *QueryUnifiedentranceAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUnifiedentranceAsyncResponse) SetData(v string) *QueryUnifiedentranceAsyncResponse {
	s.Data = &v
	return s
}

type QueryMainsiteUnifiedentranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权协议索引
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
	// 整个需求的入参，map json
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty"`
	// 数据集服务id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty" require:"true"`
	//
	// 授权token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// token授权场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// 实际调用的租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryMainsiteUnifiedentranceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMainsiteUnifiedentranceRequest) GoString() string {
	return s.String()
}

func (s *QueryMainsiteUnifiedentranceRequest) SetAuthToken(v string) *QueryMainsiteUnifiedentranceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetProductInstanceId(v string) *QueryMainsiteUnifiedentranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetFileIndex(v string) *QueryMainsiteUnifiedentranceRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetParams(v string) *QueryMainsiteUnifiedentranceRequest {
	s.Params = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetUserAuthed(v bool) *QueryMainsiteUnifiedentranceRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetDataSetId(v string) *QueryMainsiteUnifiedentranceRequest {
	s.DataSetId = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetToken(v string) *QueryMainsiteUnifiedentranceRequest {
	s.Token = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetSceneCode(v string) *QueryMainsiteUnifiedentranceRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceRequest) SetTenantId(v string) *QueryMainsiteUnifiedentranceRequest {
	s.TenantId = &v
	return s
}

type QueryMainsiteUnifiedentranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 具体返回，map json
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryMainsiteUnifiedentranceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMainsiteUnifiedentranceResponse) GoString() string {
	return s.String()
}

func (s *QueryMainsiteUnifiedentranceResponse) SetReqMsgId(v string) *QueryMainsiteUnifiedentranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceResponse) SetResultCode(v string) *QueryMainsiteUnifiedentranceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceResponse) SetResultMsg(v string) *QueryMainsiteUnifiedentranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMainsiteUnifiedentranceResponse) SetData(v string) *QueryMainsiteUnifiedentranceResponse {
	s.Data = &v
	return s
}

type GetApplicationProxysignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 代签名相关参数
	SignParams *string `json:"sign_params,omitempty" xml:"sign_params,omitempty" require:"true"`
	// 对应的服务id
	DataSetId *string `json:"data_set_id,omitempty" xml:"data_set_id,omitempty"`
}

func (s GetApplicationProxysignRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApplicationProxysignRequest) GoString() string {
	return s.String()
}

func (s *GetApplicationProxysignRequest) SetAuthToken(v string) *GetApplicationProxysignRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApplicationProxysignRequest) SetProductInstanceId(v string) *GetApplicationProxysignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApplicationProxysignRequest) SetSignParams(v string) *GetApplicationProxysignRequest {
	s.SignParams = &v
	return s
}

func (s *GetApplicationProxysignRequest) SetDataSetId(v string) *GetApplicationProxysignRequest {
	s.DataSetId = &v
	return s
}

type GetApplicationProxysignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 代客签名结果
	Sign *string `json:"sign,omitempty" xml:"sign,omitempty"`
	// 扩展字段
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s GetApplicationProxysignResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApplicationProxysignResponse) GoString() string {
	return s.String()
}

func (s *GetApplicationProxysignResponse) SetReqMsgId(v string) *GetApplicationProxysignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApplicationProxysignResponse) SetResultCode(v string) *GetApplicationProxysignResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApplicationProxysignResponse) SetResultMsg(v string) *GetApplicationProxysignResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApplicationProxysignResponse) SetSign(v string) *GetApplicationProxysignResponse {
	s.Sign = &v
	return s
}

func (s *GetApplicationProxysignResponse) SetExt(v string) *GetApplicationProxysignResponse {
	s.Ext = &v
	return s
}

type QueryApplicationChannelunifiedentranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权文件ID
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
	// 整个需求的入参，map json
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 是否授权
	UserAuthed *bool `json:"user_authed,omitempty" xml:"user_authed,omitempty"`
	// 数据集服务id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// token授权场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	//
	// 授权token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
}

func (s QueryApplicationChannelunifiedentranceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationChannelunifiedentranceRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetAuthToken(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetProductInstanceId(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetFileIndex(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.FileIndex = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetParams(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.Params = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetUserAuthed(v bool) *QueryApplicationChannelunifiedentranceRequest {
	s.UserAuthed = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetServiceId(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.ServiceId = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetSceneCode(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetToken(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.Token = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceRequest) SetCustomerId(v string) *QueryApplicationChannelunifiedentranceRequest {
	s.CustomerId = &v
	return s
}

type QueryApplicationChannelunifiedentranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 具体返回，map json
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryApplicationChannelunifiedentranceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationChannelunifiedentranceResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationChannelunifiedentranceResponse) SetReqMsgId(v string) *QueryApplicationChannelunifiedentranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceResponse) SetResultCode(v string) *QueryApplicationChannelunifiedentranceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceResponse) SetResultMsg(v string) *QueryApplicationChannelunifiedentranceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationChannelunifiedentranceResponse) SetData(v string) *QueryApplicationChannelunifiedentranceResponse {
	s.Data = &v
	return s
}

type UploadApplicationChannelauthfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务id，开发者提供
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 文件md5
	FileMd5 *string `json:"file_md5,omitempty" xml:"file_md5,omitempty" require:"true"`
	// 文件ID
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 协议名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 授权协议文件版本号
	FileVersion *string `json:"file_version,omitempty" xml:"file_version,omitempty" require:"true"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
}

func (s UploadApplicationChannelauthfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationChannelauthfileRequest) GoString() string {
	return s.String()
}

func (s *UploadApplicationChannelauthfileRequest) SetAuthToken(v string) *UploadApplicationChannelauthfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetProductInstanceId(v string) *UploadApplicationChannelauthfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetServiceId(v string) *UploadApplicationChannelauthfileRequest {
	s.ServiceId = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileMd5(v string) *UploadApplicationChannelauthfileRequest {
	s.FileMd5 = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileObject(v io.Reader) *UploadApplicationChannelauthfileRequest {
	s.FileObject = v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileObjectName(v string) *UploadApplicationChannelauthfileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileId(v string) *UploadApplicationChannelauthfileRequest {
	s.FileId = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileName(v string) *UploadApplicationChannelauthfileRequest {
	s.FileName = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetFileVersion(v string) *UploadApplicationChannelauthfileRequest {
	s.FileVersion = &v
	return s
}

func (s *UploadApplicationChannelauthfileRequest) SetCustomerId(v string) *UploadApplicationChannelauthfileRequest {
	s.CustomerId = &v
	return s
}

type UploadApplicationChannelauthfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权协议索引号
	FileIndex *string `json:"file_index,omitempty" xml:"file_index,omitempty"`
}

func (s UploadApplicationChannelauthfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadApplicationChannelauthfileResponse) GoString() string {
	return s.String()
}

func (s *UploadApplicationChannelauthfileResponse) SetReqMsgId(v string) *UploadApplicationChannelauthfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadApplicationChannelauthfileResponse) SetResultCode(v string) *UploadApplicationChannelauthfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadApplicationChannelauthfileResponse) SetResultMsg(v string) *UploadApplicationChannelauthfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadApplicationChannelauthfileResponse) SetFileIndex(v string) *UploadApplicationChannelauthfileResponse {
	s.FileIndex = &v
	return s
}

type QueryApplicationMarriageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求参数json
	BizParam *string `json:"biz_param,omitempty" xml:"biz_param,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 调用的方法
	MethodCode *string `json:"method_code,omitempty" xml:"method_code,omitempty" require:"true"`
	// 租户编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty"`
	// RSA-DESede 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// 是否采用加密算法
	Encryption *bool `json:"encryption,omitempty" xml:"encryption,omitempty"`
	// 对称秘钥加密后的数据
	EncryptionKey *string `json:"encryption_key,omitempty" xml:"encryption_key,omitempty"`
}

func (s QueryApplicationMarriageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationMarriageRequest) GoString() string {
	return s.String()
}

func (s *QueryApplicationMarriageRequest) SetAuthToken(v string) *QueryApplicationMarriageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetProductInstanceId(v string) *QueryApplicationMarriageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetBizParam(v string) *QueryApplicationMarriageRequest {
	s.BizParam = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetProductCode(v string) *QueryApplicationMarriageRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetMethodCode(v string) *QueryApplicationMarriageRequest {
	s.MethodCode = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetInstCode(v string) *QueryApplicationMarriageRequest {
	s.InstCode = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetAlgorithm(v string) *QueryApplicationMarriageRequest {
	s.Algorithm = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetEncryption(v bool) *QueryApplicationMarriageRequest {
	s.Encryption = &v
	return s
}

func (s *QueryApplicationMarriageRequest) SetEncryptionKey(v string) *QueryApplicationMarriageRequest {
	s.EncryptionKey = &v
	return s
}

type QueryApplicationMarriageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryApplicationMarriageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApplicationMarriageResponse) GoString() string {
	return s.String()
}

func (s *QueryApplicationMarriageResponse) SetReqMsgId(v string) *QueryApplicationMarriageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApplicationMarriageResponse) SetResultCode(v string) *QueryApplicationMarriageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApplicationMarriageResponse) SetResultMsg(v string) *QueryApplicationMarriageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApplicationMarriageResponse) SetData(v string) *QueryApplicationMarriageResponse {
	s.Data = &v
	return s
}

type GetDasLinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权人接入应用biz_uuid
	BeAuthedPersonAppBizUuid *string `json:"be_authed_person_app_biz_uuid,omitempty" xml:"be_authed_person_app_biz_uuid,omitempty" require:"true"`
}

func (s GetDasLinkRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasLinkRequest) GoString() string {
	return s.String()
}

func (s *GetDasLinkRequest) SetAuthToken(v string) *GetDasLinkRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasLinkRequest) SetProductInstanceId(v string) *GetDasLinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasLinkRequest) SetBeAuthedPersonAppBizUuid(v string) *GetDasLinkRequest {
	s.BeAuthedPersonAppBizUuid = &v
	return s
}

type GetDasLinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// H5应用身份认证信息
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 带有token 信息的H5页面链接
	Link *string `json:"link,omitempty" xml:"link,omitempty"`
}

func (s GetDasLinkResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasLinkResponse) GoString() string {
	return s.String()
}

func (s *GetDasLinkResponse) SetReqMsgId(v string) *GetDasLinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasLinkResponse) SetResultCode(v string) *GetDasLinkResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasLinkResponse) SetResultMsg(v string) *GetDasLinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasLinkResponse) SetToken(v string) *GetDasLinkResponse {
	s.Token = &v
	return s
}

func (s *GetDasLinkResponse) SetLink(v string) *GetDasLinkResponse {
	s.Link = &v
	return s
}

type GetDasEnterprisevcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty" require:"true"`
}

func (s GetDasEnterprisevcRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasEnterprisevcRequest) GoString() string {
	return s.String()
}

func (s *GetDasEnterprisevcRequest) SetAuthToken(v string) *GetDasEnterprisevcRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetProductInstanceId(v string) *GetDasEnterprisevcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetAuthInstanceBizUuid(v string) *GetDasEnterprisevcRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *GetDasEnterprisevcRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

type GetDasEnterprisevcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// VC 内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s GetDasEnterprisevcResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasEnterprisevcResponse) GoString() string {
	return s.String()
}

func (s *GetDasEnterprisevcResponse) SetReqMsgId(v string) *GetDasEnterprisevcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetResultCode(v string) *GetDasEnterprisevcResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetResultMsg(v string) *GetDasEnterprisevcResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetVc(v string) *GetDasEnterprisevcResponse {
	s.Vc = &v
	return s
}

type GetDasIndividualvcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
	// 授权人个人信息
	AuthedPersonIndividualInfo *AuthPersonIndividualInfo `json:"authed_person_individual_info,omitempty" xml:"authed_person_individual_info,omitempty" require:"true"`
}

func (s GetDasIndividualvcRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasIndividualvcRequest) GoString() string {
	return s.String()
}

func (s *GetDasIndividualvcRequest) SetAuthToken(v string) *GetDasIndividualvcRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetProductInstanceId(v string) *GetDasIndividualvcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetAuthInstanceBizUuid(v string) *GetDasIndividualvcRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetAuthedPersonIndividualInfo(v *AuthPersonIndividualInfo) *GetDasIndividualvcRequest {
	s.AuthedPersonIndividualInfo = v
	return s
}

type GetDasIndividualvcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// VC
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s GetDasIndividualvcResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasIndividualvcResponse) GoString() string {
	return s.String()
}

func (s *GetDasIndividualvcResponse) SetReqMsgId(v string) *GetDasIndividualvcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetResultCode(v string) *GetDasIndividualvcResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetResultMsg(v string) *GetDasIndividualvcResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetVc(v string) *GetDasIndividualvcResponse {
	s.Vc = &v
	return s
}

type SendDasSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接收方电话号码
	ReceivePhoneNum *int64 `json:"receive_phone_num,omitempty" xml:"receive_phone_num,omitempty" require:"true"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
}

func (s SendDasSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDasSmsRequest) GoString() string {
	return s.String()
}

func (s *SendDasSmsRequest) SetAuthToken(v string) *SendDasSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDasSmsRequest) SetProductInstanceId(v string) *SendDasSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDasSmsRequest) SetReceivePhoneNum(v int64) *SendDasSmsRequest {
	s.ReceivePhoneNum = &v
	return s
}

func (s *SendDasSmsRequest) SetAuthInstanceBizUuid(v string) *SendDasSmsRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

type SendDasSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendDasSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDasSmsResponse) GoString() string {
	return s.String()
}

func (s *SendDasSmsResponse) SetReqMsgId(v string) *SendDasSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDasSmsResponse) SetResultCode(v string) *SendDasSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDasSmsResponse) SetResultMsg(v string) *SendDasSmsResponse {
	s.ResultMsg = &v
	return s
}

type AuthDasSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 手机验证码
	VerificationCode *string `json:"verification_code,omitempty" xml:"verification_code,omitempty" require:"true"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty"`
	// 授权人个人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty"`
}

func (s AuthDasSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthDasSmsRequest) GoString() string {
	return s.String()
}

func (s *AuthDasSmsRequest) SetAuthToken(v string) *AuthDasSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthDasSmsRequest) SetProductInstanceId(v string) *AuthDasSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthDasSmsRequest) SetVerificationCode(v string) *AuthDasSmsRequest {
	s.VerificationCode = &v
	return s
}

func (s *AuthDasSmsRequest) SetAuthInstanceBizUuid(v string) *AuthDasSmsRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *AuthDasSmsRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *AuthDasSmsRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *AuthDasSmsRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *AuthDasSmsRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

type AuthDasSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// VC
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s AuthDasSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthDasSmsResponse) GoString() string {
	return s.String()
}

func (s *AuthDasSmsResponse) SetReqMsgId(v string) *AuthDasSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthDasSmsResponse) SetResultCode(v string) *AuthDasSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthDasSmsResponse) SetResultMsg(v string) *AuthDasSmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthDasSmsResponse) SetAuthStatus(v string) *AuthDasSmsResponse {
	s.AuthStatus = &v
	return s
}

func (s *AuthDasSmsResponse) SetVc(v string) *AuthDasSmsResponse {
	s.Vc = &v
	return s
}

type VerifyDasEnterpriseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权企业接入应用ID
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
	// VC完整内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty" require:"true"`
	// 被授权企业信息
	BeAuthedPersonInfo *BeAuthedPersonInfo `json:"be_authed_person_info,omitempty" xml:"be_authed_person_info,omitempty" require:"true"`
	// 授权人企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty" require:"true"`
	// 需要访问的数据源信息列表
	DataSourceInfo []*DataSource `json:"data_source_info,omitempty" xml:"data_source_info,omitempty" require:"true" type:"Repeated"`
}

func (s VerifyDasEnterpriseRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasEnterpriseRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasEnterpriseRequest) SetAuthToken(v string) *VerifyDasEnterpriseRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetProductInstanceId(v string) *VerifyDasEnterpriseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetAuthInstanceBizUuid(v string) *VerifyDasEnterpriseRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetVc(v string) *VerifyDasEnterpriseRequest {
	s.Vc = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetBeAuthedPersonInfo(v *BeAuthedPersonInfo) *VerifyDasEnterpriseRequest {
	s.BeAuthedPersonInfo = v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *VerifyDasEnterpriseRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetDataSourceInfo(v []*DataSource) *VerifyDasEnterpriseRequest {
	s.DataSourceInfo = v
	return s
}

type VerifyDasEnterpriseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 核验失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
}

func (s VerifyDasEnterpriseResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasEnterpriseResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasEnterpriseResponse) SetReqMsgId(v string) *VerifyDasEnterpriseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetResultCode(v string) *VerifyDasEnterpriseResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetResultMsg(v string) *VerifyDasEnterpriseResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetSuccess(v bool) *VerifyDasEnterpriseResponse {
	s.Success = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetFailedReason(v string) *VerifyDasEnterpriseResponse {
	s.FailedReason = &v
	return s
}

type VerifyDasIndividualRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty" require:"true"`
	// VC完整内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty" require:"true"`
	// 被授权企业信息
	BeAuthedPersonInfo *BeAuthedPersonInfo `json:"be_authed_person_info,omitempty" xml:"be_authed_person_info,omitempty" require:"true"`
	// 授权人个人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty" require:"true"`
	// 需要访问的数据源信息列表
	DataSourceInfo []*DataSource `json:"data_source_info,omitempty" xml:"data_source_info,omitempty" require:"true" type:"Repeated"`
}

func (s VerifyDasIndividualRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasIndividualRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasIndividualRequest) SetAuthToken(v string) *VerifyDasIndividualRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetProductInstanceId(v string) *VerifyDasIndividualRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetAuthInstanceBizUuid(v string) *VerifyDasIndividualRequest {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetVc(v string) *VerifyDasIndividualRequest {
	s.Vc = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetBeAuthedPersonInfo(v *BeAuthedPersonInfo) *VerifyDasIndividualRequest {
	s.BeAuthedPersonInfo = v
	return s
}

func (s *VerifyDasIndividualRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *VerifyDasIndividualRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

func (s *VerifyDasIndividualRequest) SetDataSourceInfo(v []*DataSource) *VerifyDasIndividualRequest {
	s.DataSourceInfo = v
	return s
}

type VerifyDasIndividualResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 核验失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
}

func (s VerifyDasIndividualResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasIndividualResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasIndividualResponse) SetReqMsgId(v string) *VerifyDasIndividualResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetResultCode(v string) *VerifyDasIndividualResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetResultMsg(v string) *VerifyDasIndividualResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetSuccess(v bool) *VerifyDasIndividualResponse {
	s.Success = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetFailedReason(v string) *VerifyDasIndividualResponse {
	s.FailedReason = &v
	return s
}

type CreateDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口定义
	DataSourceInterface *DataSourceInterface `json:"data_source_interface,omitempty" xml:"data_source_interface,omitempty" require:"true"`
}

func (s CreateDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *CreateDasDatasourceRequest) SetAuthToken(v string) *CreateDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetProductInstanceId(v string) *CreateDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetName(v string) *CreateDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetProvider(v string) *CreateDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetDataOwnerType(v string) *CreateDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetDataSourceInterface(v *DataSourceInterface) *CreateDasDatasourceRequest {
	s.DataSourceInterface = v
	return s
}

type CreateDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源 biz_uuid
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty"`
}

func (s CreateDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *CreateDasDatasourceResponse) SetReqMsgId(v string) *CreateDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetResultCode(v string) *CreateDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetResultMsg(v string) *CreateDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetBizUuid(v string) *CreateDasDatasourceResponse {
	s.BizUuid = &v
	return s
}

type UpdateDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要修改的数据源biz_uuid
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty" require:"true"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口定义
	DataSourceInterface *DataSourceInterface `json:"data_source_interface,omitempty" xml:"data_source_interface,omitempty" require:"true"`
}

func (s UpdateDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *UpdateDasDatasourceRequest) SetAuthToken(v string) *UpdateDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetProductInstanceId(v string) *UpdateDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetBizUuid(v string) *UpdateDasDatasourceRequest {
	s.BizUuid = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetName(v string) *UpdateDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetProvider(v string) *UpdateDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetDataOwnerType(v string) *UpdateDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetDataSourceInterface(v *DataSourceInterface) *UpdateDasDatasourceRequest {
	s.DataSourceInterface = v
	return s
}

type UpdateDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *UpdateDasDatasourceResponse) SetReqMsgId(v string) *UpdateDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDasDatasourceResponse) SetResultCode(v string) *UpdateDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDasDatasourceResponse) SetResultMsg(v string) *UpdateDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type DeleteDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要删除的数据源biz_uuid
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty" require:"true"`
}

func (s DeleteDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *DeleteDasDatasourceRequest) SetAuthToken(v string) *DeleteDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteDasDatasourceRequest) SetProductInstanceId(v string) *DeleteDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteDasDatasourceRequest) SetBizUuid(v string) *DeleteDasDatasourceRequest {
	s.BizUuid = &v
	return s
}

type DeleteDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *DeleteDasDatasourceResponse) SetReqMsgId(v string) *DeleteDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteDasDatasourceResponse) SetResultCode(v string) *DeleteDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteDasDatasourceResponse) SetResultMsg(v string) *DeleteDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type QueryDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty"`
	// 数据源接口访问地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" maxLength:"100"`
}

func (s QueryDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *QueryDasDatasourceRequest) SetAuthToken(v string) *QueryDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetProductInstanceId(v string) *QueryDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetName(v string) *QueryDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetProvider(v string) *QueryDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetDataOwnerType(v string) *QueryDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetAddress(v string) *QueryDasDatasourceRequest {
	s.Address = &v
	return s
}

type QueryDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源信息列表
	DataSources []*DataSourceInfo `json:"data_sources,omitempty" xml:"data_sources,omitempty" type:"Repeated"`
}

func (s QueryDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *QueryDasDatasourceResponse) SetReqMsgId(v string) *QueryDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetResultCode(v string) *QueryDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetResultMsg(v string) *QueryDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetDataSources(v []*DataSourceInfo) *QueryDasDatasourceResponse {
	s.DataSources = v
	return s
}

type VerifyDasAuthresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源biz_uuid列表
	DataSourceBizUuids []*string `json:"data_source_biz_uuids,omitempty" xml:"data_source_biz_uuids,omitempty" require:"true" type:"Repeated"`
	// 被授权企业接入应用名称
	BeAuthedPersonAppName *string `json:"be_authed_person_app_name,omitempty" xml:"be_authed_person_app_name,omitempty" require:"true"`
	// 授权企业统一社会信用码
	AuthPersonEnterpriseCreditNum *string `json:"auth_person_enterprise_credit_num,omitempty" xml:"auth_person_enterprise_credit_num,omitempty" require:"true"`
}

func (s VerifyDasAuthresultRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasAuthresultRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasAuthresultRequest) SetAuthToken(v string) *VerifyDasAuthresultRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetProductInstanceId(v string) *VerifyDasAuthresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetDataSourceBizUuids(v []*string) *VerifyDasAuthresultRequest {
	s.DataSourceBizUuids = v
	return s
}

func (s *VerifyDasAuthresultRequest) SetBeAuthedPersonAppName(v string) *VerifyDasAuthresultRequest {
	s.BeAuthedPersonAppName = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetAuthPersonEnterpriseCreditNum(v string) *VerifyDasAuthresultRequest {
	s.AuthPersonEnterpriseCreditNum = &v
	return s
}

type VerifyDasAuthresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权状态: 未授权，已授权
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
}

func (s VerifyDasAuthresultResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasAuthresultResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasAuthresultResponse) SetReqMsgId(v string) *VerifyDasAuthresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetResultCode(v string) *VerifyDasAuthresultResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetResultMsg(v string) *VerifyDasAuthresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetAuthStatus(v string) *VerifyDasAuthresultResponse {
	s.AuthStatus = &v
	return s
}

type AuthDasAuthresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源biz_uuid列表
	DataSourceBizUuids []*string `json:"data_source_biz_uuids,omitempty" xml:"data_source_biz_uuids,omitempty" require:"true" type:"Repeated"`
	// 被授权企业接入应用名称
	BeAuthedPersonAppName *string `json:"be_authed_person_app_name,omitempty" xml:"be_authed_person_app_name,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty"`
	// 授权人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty"`
}

func (s AuthDasAuthresultRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthDasAuthresultRequest) GoString() string {
	return s.String()
}

func (s *AuthDasAuthresultRequest) SetAuthToken(v string) *AuthDasAuthresultRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetProductInstanceId(v string) *AuthDasAuthresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetDataSourceBizUuids(v []*string) *AuthDasAuthresultRequest {
	s.DataSourceBizUuids = v
	return s
}

func (s *AuthDasAuthresultRequest) SetBeAuthedPersonAppName(v string) *AuthDasAuthresultRequest {
	s.BeAuthedPersonAppName = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *AuthDasAuthresultRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *AuthDasAuthresultRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *AuthDasAuthresultRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

type AuthDasAuthresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权实例biz_uuid
	AuthInstanceBizUuid *string `json:"auth_instance_biz_uuid,omitempty" xml:"auth_instance_biz_uuid,omitempty"`
	// 授权详情biz_uuid
	AuthResultBizUuid *string `json:"auth_result_biz_uuid,omitempty" xml:"auth_result_biz_uuid,omitempty"`
	// VC 完整信息
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s AuthDasAuthresultResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthDasAuthresultResponse) GoString() string {
	return s.String()
}

func (s *AuthDasAuthresultResponse) SetReqMsgId(v string) *AuthDasAuthresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetResultCode(v string) *AuthDasAuthresultResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetResultMsg(v string) *AuthDasAuthresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetAuthInstanceBizUuid(v string) *AuthDasAuthresultResponse {
	s.AuthInstanceBizUuid = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetAuthResultBizUuid(v string) *AuthDasAuthresultResponse {
	s.AuthResultBizUuid = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetVc(v string) *AuthDasAuthresultResponse {
	s.Vc = &v
	return s
}

type AddAuthConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 复用的场景码
	ParentSceneCode *string `json:"parent_scene_code,omitempty" xml:"parent_scene_code,omitempty"`
	// 数据源连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty" require:"true"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
	// 被授权方名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty" require:"true"`
	// 业务应用名称
	AuthAppName *string `json:"auth_app_name,omitempty" xml:"auth_app_name,omitempty" require:"true"`
	// 客户应用logo的oss key
	EnterpriseLogo *string `json:"enterprise_logo,omitempty" xml:"enterprise_logo,omitempty" require:"true"`
	// 用途说明
	AuthPurpose *string `json:"auth_purpose,omitempty" xml:"auth_purpose,omitempty" require:"true"`
	// 授权描述
	AuthDesc *string `json:"auth_desc,omitempty" xml:"auth_desc,omitempty"`
	// 授权形式
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// C端是否显示凭证数据
	EnableShowProofVc *bool `json:"enable_show_proof_vc,omitempty" xml:"enable_show_proof_vc,omitempty"`
	// C端是否显示授权记录
	EnableShowAuthRecord *bool `json:"enable_show_auth_record,omitempty" xml:"enable_show_auth_record,omitempty"`
	// 授权服务产品列表
	ProductGroupList []*AuthProductGroup `json:"product_group_list,omitempty" xml:"product_group_list,omitempty" type:"Repeated"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 授权协议
	AgreementList []*Agreement `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" type:"Repeated"`
	// 主题颜色
	BackgroundColor *string `json:"background_color,omitempty" xml:"background_color,omitempty"`
	// 使用刷脸识别
	UseFacialRecognition *bool `json:"use_facial_recognition,omitempty" xml:"use_facial_recognition,omitempty"`
	// 页面使用范围列表
	UseScopeList []*string `json:"use_scope_list,omitempty" xml:"use_scope_list,omitempty" type:"Repeated"`
	// 授权成功端内跳转地址
	InnerSuccessCallbackUrl *string `json:"inner_success_callback_url,omitempty" xml:"inner_success_callback_url,omitempty"`
	// 授权成功端外跳转地址
	OutsideSuccessCallbackUrl *string `json:"outside_success_callback_url,omitempty" xml:"outside_success_callback_url,omitempty"`
	// 公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 发起授权页面的链接
	StartAuthUrl *string `json:"start_auth_url,omitempty" xml:"start_auth_url,omitempty"`
}

func (s AddAuthConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAuthConfigRequest) GoString() string {
	return s.String()
}

func (s *AddAuthConfigRequest) SetAuthToken(v string) *AddAuthConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAuthConfigRequest) SetProductInstanceId(v string) *AddAuthConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAuthConfigRequest) SetParentSceneCode(v string) *AddAuthConfigRequest {
	s.ParentSceneCode = &v
	return s
}

func (s *AddAuthConfigRequest) SetSourceSpaceId(v string) *AddAuthConfigRequest {
	s.SourceSpaceId = &v
	return s
}

func (s *AddAuthConfigRequest) SetAuthEnterpriseCode(v string) *AddAuthConfigRequest {
	s.AuthEnterpriseCode = &v
	return s
}

func (s *AddAuthConfigRequest) SetTargetName(v string) *AddAuthConfigRequest {
	s.TargetName = &v
	return s
}

func (s *AddAuthConfigRequest) SetAuthAppName(v string) *AddAuthConfigRequest {
	s.AuthAppName = &v
	return s
}

func (s *AddAuthConfigRequest) SetEnterpriseLogo(v string) *AddAuthConfigRequest {
	s.EnterpriseLogo = &v
	return s
}

func (s *AddAuthConfigRequest) SetAuthPurpose(v string) *AddAuthConfigRequest {
	s.AuthPurpose = &v
	return s
}

func (s *AddAuthConfigRequest) SetAuthDesc(v string) *AddAuthConfigRequest {
	s.AuthDesc = &v
	return s
}

func (s *AddAuthConfigRequest) SetAuthType(v string) *AddAuthConfigRequest {
	s.AuthType = &v
	return s
}

func (s *AddAuthConfigRequest) SetEnableShowProofVc(v bool) *AddAuthConfigRequest {
	s.EnableShowProofVc = &v
	return s
}

func (s *AddAuthConfigRequest) SetEnableShowAuthRecord(v bool) *AddAuthConfigRequest {
	s.EnableShowAuthRecord = &v
	return s
}

func (s *AddAuthConfigRequest) SetProductGroupList(v []*AuthProductGroup) *AddAuthConfigRequest {
	s.ProductGroupList = v
	return s
}

func (s *AddAuthConfigRequest) SetUserType(v string) *AddAuthConfigRequest {
	s.UserType = &v
	return s
}

func (s *AddAuthConfigRequest) SetAgreementList(v []*Agreement) *AddAuthConfigRequest {
	s.AgreementList = v
	return s
}

func (s *AddAuthConfigRequest) SetBackgroundColor(v string) *AddAuthConfigRequest {
	s.BackgroundColor = &v
	return s
}

func (s *AddAuthConfigRequest) SetUseFacialRecognition(v bool) *AddAuthConfigRequest {
	s.UseFacialRecognition = &v
	return s
}

func (s *AddAuthConfigRequest) SetUseScopeList(v []*string) *AddAuthConfigRequest {
	s.UseScopeList = v
	return s
}

func (s *AddAuthConfigRequest) SetInnerSuccessCallbackUrl(v string) *AddAuthConfigRequest {
	s.InnerSuccessCallbackUrl = &v
	return s
}

func (s *AddAuthConfigRequest) SetOutsideSuccessCallbackUrl(v string) *AddAuthConfigRequest {
	s.OutsideSuccessCallbackUrl = &v
	return s
}

func (s *AddAuthConfigRequest) SetPublicKey(v string) *AddAuthConfigRequest {
	s.PublicKey = &v
	return s
}

func (s *AddAuthConfigRequest) SetStartAuthUrl(v string) *AddAuthConfigRequest {
	s.StartAuthUrl = &v
	return s
}

type AddAuthConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
}

func (s AddAuthConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAuthConfigResponse) GoString() string {
	return s.String()
}

func (s *AddAuthConfigResponse) SetReqMsgId(v string) *AddAuthConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAuthConfigResponse) SetResultCode(v string) *AddAuthConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAuthConfigResponse) SetResultMsg(v string) *AddAuthConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddAuthConfigResponse) SetSceneCode(v string) *AddAuthConfigResponse {
	s.SceneCode = &v
	return s
}

type UpdateAuthConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 复用的场景码
	ParentSceneCode *string `json:"parent_scene_code,omitempty" xml:"parent_scene_code,omitempty"`
	// 数据源连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty" require:"true"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
	// 被授权方名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty" require:"true"`
	// 业务应用名称
	AuthAppName *string `json:"auth_app_name,omitempty" xml:"auth_app_name,omitempty" require:"true"`
	// 客户应用logo的oss key
	EnterpriseLogo *string `json:"enterprise_logo,omitempty" xml:"enterprise_logo,omitempty" require:"true"`
	// 用途说明
	AuthPurpose *string `json:"auth_purpose,omitempty" xml:"auth_purpose,omitempty" require:"true"`
	// 授权描述
	AuthDesc *string `json:"auth_desc,omitempty" xml:"auth_desc,omitempty"`
	// 授权形式
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// C端是否显示凭证数据
	EnableShowProofVc *bool `json:"enable_show_proof_vc,omitempty" xml:"enable_show_proof_vc,omitempty"`
	// C端是否显示授权记录
	EnableShowAuthRecord *bool `json:"enable_show_auth_record,omitempty" xml:"enable_show_auth_record,omitempty"`
	// 授权服务产品列表
	ProductGroupList []*AuthProductGroup `json:"product_group_list,omitempty" xml:"product_group_list,omitempty" type:"Repeated"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 授权协议
	AgreementList []*Agreement `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" type:"Repeated"`
	// 主题颜色
	BackgroundColor *string `json:"background_color,omitempty" xml:"background_color,omitempty"`
	// 使用刷脸识别
	UseFacialRecognition *bool `json:"use_facial_recognition,omitempty" xml:"use_facial_recognition,omitempty"`
	// 页面使用范围列表
	UseScopeList []*string `json:"use_scope_list,omitempty" xml:"use_scope_list,omitempty" type:"Repeated"`
	// 授权成功端内跳转地址
	InnerSuccessCallbackUrl *string `json:"inner_success_callback_url,omitempty" xml:"inner_success_callback_url,omitempty"`
	// 授权成功端外跳转地址
	OutsideSuccessCallbackUrl *string `json:"outside_success_callback_url,omitempty" xml:"outside_success_callback_url,omitempty"`
	// 公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 发起授权页面的链接
	StartAuthUrl *string `json:"start_auth_url,omitempty" xml:"start_auth_url,omitempty"`
}

func (s UpdateAuthConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthConfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateAuthConfigRequest) SetAuthToken(v string) *UpdateAuthConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetProductInstanceId(v string) *UpdateAuthConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetSceneCode(v string) *UpdateAuthConfigRequest {
	s.SceneCode = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetParentSceneCode(v string) *UpdateAuthConfigRequest {
	s.ParentSceneCode = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetSourceSpaceId(v string) *UpdateAuthConfigRequest {
	s.SourceSpaceId = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAuthEnterpriseCode(v string) *UpdateAuthConfigRequest {
	s.AuthEnterpriseCode = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetTargetName(v string) *UpdateAuthConfigRequest {
	s.TargetName = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAuthAppName(v string) *UpdateAuthConfigRequest {
	s.AuthAppName = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetEnterpriseLogo(v string) *UpdateAuthConfigRequest {
	s.EnterpriseLogo = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAuthPurpose(v string) *UpdateAuthConfigRequest {
	s.AuthPurpose = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAuthDesc(v string) *UpdateAuthConfigRequest {
	s.AuthDesc = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAuthType(v string) *UpdateAuthConfigRequest {
	s.AuthType = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetEnableShowProofVc(v bool) *UpdateAuthConfigRequest {
	s.EnableShowProofVc = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetEnableShowAuthRecord(v bool) *UpdateAuthConfigRequest {
	s.EnableShowAuthRecord = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetProductGroupList(v []*AuthProductGroup) *UpdateAuthConfigRequest {
	s.ProductGroupList = v
	return s
}

func (s *UpdateAuthConfigRequest) SetUserType(v string) *UpdateAuthConfigRequest {
	s.UserType = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetAgreementList(v []*Agreement) *UpdateAuthConfigRequest {
	s.AgreementList = v
	return s
}

func (s *UpdateAuthConfigRequest) SetBackgroundColor(v string) *UpdateAuthConfigRequest {
	s.BackgroundColor = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetUseFacialRecognition(v bool) *UpdateAuthConfigRequest {
	s.UseFacialRecognition = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetUseScopeList(v []*string) *UpdateAuthConfigRequest {
	s.UseScopeList = v
	return s
}

func (s *UpdateAuthConfigRequest) SetInnerSuccessCallbackUrl(v string) *UpdateAuthConfigRequest {
	s.InnerSuccessCallbackUrl = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetOutsideSuccessCallbackUrl(v string) *UpdateAuthConfigRequest {
	s.OutsideSuccessCallbackUrl = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetPublicKey(v string) *UpdateAuthConfigRequest {
	s.PublicKey = &v
	return s
}

func (s *UpdateAuthConfigRequest) SetStartAuthUrl(v string) *UpdateAuthConfigRequest {
	s.StartAuthUrl = &v
	return s
}

type UpdateAuthConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAuthConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthConfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateAuthConfigResponse) SetReqMsgId(v string) *UpdateAuthConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAuthConfigResponse) SetResultCode(v string) *UpdateAuthConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAuthConfigResponse) SetResultMsg(v string) *UpdateAuthConfigResponse {
	s.ResultMsg = &v
	return s
}

type UploadAuthAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
}

func (s UploadAuthAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAuthAgreementRequest) GoString() string {
	return s.String()
}

func (s *UploadAuthAgreementRequest) SetAuthToken(v string) *UploadAuthAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAuthAgreementRequest) SetProductInstanceId(v string) *UploadAuthAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAuthAgreementRequest) SetFileType(v string) *UploadAuthAgreementRequest {
	s.FileType = &v
	return s
}

func (s *UploadAuthAgreementRequest) SetAuthEnterpriseCode(v string) *UploadAuthAgreementRequest {
	s.AuthEnterpriseCode = &v
	return s
}

type UploadAuthAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 访问id
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty"`
	// 策略
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 目录
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty"`
	// 主机
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
	// 过期时间
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty"`
	// 回调地址
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
}

func (s UploadAuthAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAuthAgreementResponse) GoString() string {
	return s.String()
}

func (s *UploadAuthAgreementResponse) SetReqMsgId(v string) *UploadAuthAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetResultCode(v string) *UploadAuthAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetResultMsg(v string) *UploadAuthAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetAccessId(v string) *UploadAuthAgreementResponse {
	s.AccessId = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetPolicy(v string) *UploadAuthAgreementResponse {
	s.Policy = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetSignature(v string) *UploadAuthAgreementResponse {
	s.Signature = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetDir(v string) *UploadAuthAgreementResponse {
	s.Dir = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetHost(v string) *UploadAuthAgreementResponse {
	s.Host = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetExpire(v string) *UploadAuthAgreementResponse {
	s.Expire = &v
	return s
}

func (s *UploadAuthAgreementResponse) SetCallback(v string) *UploadAuthAgreementResponse {
	s.Callback = &v
	return s
}

type UploadAuthPictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
}

func (s UploadAuthPictureRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAuthPictureRequest) GoString() string {
	return s.String()
}

func (s *UploadAuthPictureRequest) SetAuthToken(v string) *UploadAuthPictureRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAuthPictureRequest) SetProductInstanceId(v string) *UploadAuthPictureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAuthPictureRequest) SetFileType(v string) *UploadAuthPictureRequest {
	s.FileType = &v
	return s
}

func (s *UploadAuthPictureRequest) SetAuthEnterpriseCode(v string) *UploadAuthPictureRequest {
	s.AuthEnterpriseCode = &v
	return s
}

type UploadAuthPictureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 访问id
	AccessId *string `json:"access_id,omitempty" xml:"access_id,omitempty"`
	// 策略
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty"`
	// 签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 目录
	Dir *string `json:"dir,omitempty" xml:"dir,omitempty"`
	// 主机
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
	// 过期时间
	Expire *string `json:"expire,omitempty" xml:"expire,omitempty"`
	// 回调地址
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
}

func (s UploadAuthPictureResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAuthPictureResponse) GoString() string {
	return s.String()
}

func (s *UploadAuthPictureResponse) SetReqMsgId(v string) *UploadAuthPictureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAuthPictureResponse) SetResultCode(v string) *UploadAuthPictureResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAuthPictureResponse) SetResultMsg(v string) *UploadAuthPictureResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAuthPictureResponse) SetAccessId(v string) *UploadAuthPictureResponse {
	s.AccessId = &v
	return s
}

func (s *UploadAuthPictureResponse) SetPolicy(v string) *UploadAuthPictureResponse {
	s.Policy = &v
	return s
}

func (s *UploadAuthPictureResponse) SetSignature(v string) *UploadAuthPictureResponse {
	s.Signature = &v
	return s
}

func (s *UploadAuthPictureResponse) SetDir(v string) *UploadAuthPictureResponse {
	s.Dir = &v
	return s
}

func (s *UploadAuthPictureResponse) SetHost(v string) *UploadAuthPictureResponse {
	s.Host = &v
	return s
}

func (s *UploadAuthPictureResponse) SetExpire(v string) *UploadAuthPictureResponse {
	s.Expire = &v
	return s
}

func (s *UploadAuthPictureResponse) SetCallback(v string) *UploadAuthPictureResponse {
	s.Callback = &v
	return s
}

type ListAuthContentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListAuthContentRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthContentRequest) GoString() string {
	return s.String()
}

func (s *ListAuthContentRequest) SetAuthToken(v string) *ListAuthContentRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthContentRequest) SetProductInstanceId(v string) *ListAuthContentRequest {
	s.ProductInstanceId = &v
	return s
}

type ListAuthContentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权内容列表
	DataList []*AuthContent `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s ListAuthContentResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthContentResponse) GoString() string {
	return s.String()
}

func (s *ListAuthContentResponse) SetReqMsgId(v string) *ListAuthContentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthContentResponse) SetResultCode(v string) *ListAuthContentResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthContentResponse) SetResultMsg(v string) *ListAuthContentResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthContentResponse) SetDataList(v []*AuthContent) *ListAuthContentResponse {
	s.DataList = v
	return s
}

type ListAuthConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty" require:"true"`
	// 客户名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty"`
	// 业务应用名称
	AuthAppName *string `json:"auth_app_name,omitempty" xml:"auth_app_name,omitempty"`
	// 授权内容code列表
	AuthContentCodeList []*string `json:"auth_content_code_list,omitempty" xml:"auth_content_code_list,omitempty" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListAuthConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthConfigRequest) GoString() string {
	return s.String()
}

func (s *ListAuthConfigRequest) SetAuthToken(v string) *ListAuthConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthConfigRequest) SetProductInstanceId(v string) *ListAuthConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAuthConfigRequest) SetSourceSpaceId(v string) *ListAuthConfigRequest {
	s.SourceSpaceId = &v
	return s
}

func (s *ListAuthConfigRequest) SetTargetName(v string) *ListAuthConfigRequest {
	s.TargetName = &v
	return s
}

func (s *ListAuthConfigRequest) SetAuthAppName(v string) *ListAuthConfigRequest {
	s.AuthAppName = &v
	return s
}

func (s *ListAuthConfigRequest) SetAuthContentCodeList(v []*string) *ListAuthConfigRequest {
	s.AuthContentCodeList = v
	return s
}

func (s *ListAuthConfigRequest) SetPageNum(v int64) *ListAuthConfigRequest {
	s.PageNum = &v
	return s
}

func (s *ListAuthConfigRequest) SetPageSize(v int64) *ListAuthConfigRequest {
	s.PageSize = &v
	return s
}

type ListAuthConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总条数
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
	// 列表记录
	DataList []*AuthConfigListResponse `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s ListAuthConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthConfigResponse) GoString() string {
	return s.String()
}

func (s *ListAuthConfigResponse) SetReqMsgId(v string) *ListAuthConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthConfigResponse) SetResultCode(v string) *ListAuthConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthConfigResponse) SetResultMsg(v string) *ListAuthConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthConfigResponse) SetCount(v int64) *ListAuthConfigResponse {
	s.Count = &v
	return s
}

func (s *ListAuthConfigResponse) SetTotalPages(v int64) *ListAuthConfigResponse {
	s.TotalPages = &v
	return s
}

func (s *ListAuthConfigResponse) SetDataList(v []*AuthConfigListResponse) *ListAuthConfigResponse {
	s.DataList = v
	return s
}

type UpdateAuthStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权方企业信用代码
	AuthEnterpriseCode *string `json:"auth_enterprise_code,omitempty" xml:"auth_enterprise_code,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 授权状态
	AuthStatus *bool `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
}

func (s UpdateAuthStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateAuthStatusRequest) SetAuthToken(v string) *UpdateAuthStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAuthStatusRequest) SetProductInstanceId(v string) *UpdateAuthStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAuthStatusRequest) SetAuthEnterpriseCode(v string) *UpdateAuthStatusRequest {
	s.AuthEnterpriseCode = &v
	return s
}

func (s *UpdateAuthStatusRequest) SetSceneCode(v string) *UpdateAuthStatusRequest {
	s.SceneCode = &v
	return s
}

func (s *UpdateAuthStatusRequest) SetAuthStatus(v bool) *UpdateAuthStatusRequest {
	s.AuthStatus = &v
	return s
}

type UpdateAuthStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAuthStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateAuthStatusResponse) SetReqMsgId(v string) *UpdateAuthStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAuthStatusResponse) SetResultCode(v string) *UpdateAuthStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAuthStatusResponse) SetResultMsg(v string) *UpdateAuthStatusResponse {
	s.ResultMsg = &v
	return s
}

type DetailAuthConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业信用代码
	EnterpriseCode *string `json:"enterprise_code,omitempty" xml:"enterprise_code,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s DetailAuthConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailAuthConfigRequest) GoString() string {
	return s.String()
}

func (s *DetailAuthConfigRequest) SetAuthToken(v string) *DetailAuthConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailAuthConfigRequest) SetProductInstanceId(v string) *DetailAuthConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailAuthConfigRequest) SetEnterpriseCode(v string) *DetailAuthConfigRequest {
	s.EnterpriseCode = &v
	return s
}

func (s *DetailAuthConfigRequest) SetSceneCode(v string) *DetailAuthConfigRequest {
	s.SceneCode = &v
	return s
}

type DetailAuthConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权状态
	AuthStatus *bool `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// 发起授权页面的url链接
	StartAuthUrl *string `json:"start_auth_url,omitempty" xml:"start_auth_url,omitempty"`
	// 数据源连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty"`
	// 公钥
	PublicKey *string `json:"public_key,omitempty" xml:"public_key,omitempty"`
	// 被授权方企业信用代码
	EnterpriseCode *string `json:"enterprise_code,omitempty" xml:"enterprise_code,omitempty"`
	// 主题颜色
	BackgroundColor *string `json:"background_color,omitempty" xml:"background_color,omitempty"`
	// 接入方企业名称
	TargetName *string `json:"target_name,omitempty" xml:"target_name,omitempty"`
	// 被授权应用名称
	AuthAppName *string `json:"auth_app_name,omitempty" xml:"auth_app_name,omitempty"`
	// 已授权数量
	HaveAuthedCount *int64 `json:"have_authed_count,omitempty" xml:"have_authed_count,omitempty"`
	// 公司logo
	EnterpriseLogo *string `json:"enterprise_logo,omitempty" xml:"enterprise_logo,omitempty"`
	// 已取消授权数量
	CancelAuthCount *int64 `json:"cancel_auth_count,omitempty" xml:"cancel_auth_count,omitempty"`
	// 公司logo访问链接
	EnterpriseLogoUrl *string `json:"enterprise_logo_url,omitempty" xml:"enterprise_logo_url,omitempty"`
	// 用途说明
	AuthPurpose *string `json:"auth_purpose,omitempty" xml:"auth_purpose,omitempty"`
	// 场景描述
	AuthDesc *string `json:"auth_desc,omitempty" xml:"auth_desc,omitempty"`
	// 授权类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 页面使用范围列表
	UseScopeList []*string `json:"use_scope_list,omitempty" xml:"use_scope_list,omitempty" type:"Repeated"`
	// 授权内容列表
	AuthContentList []*AuthContent `json:"auth_content_list,omitempty" xml:"auth_content_list,omitempty" type:"Repeated"`
	// 协议列表
	AgreementList []*Agreement `json:"agreement_list,omitempty" xml:"agreement_list,omitempty" type:"Repeated"`
	// 是否使用人脸识别
	UseFacialRecognition *bool `json:"use_facial_recognition,omitempty" xml:"use_facial_recognition,omitempty"`
	// C端是否显示凭证数据
	EnableShowProofVc *bool `json:"enable_show_proof_vc,omitempty" xml:"enable_show_proof_vc,omitempty"`
	// C端是否显示授权记录
	EnableShowAuthRecord *bool `json:"enable_show_auth_record,omitempty" xml:"enable_show_auth_record,omitempty"`
	// 授权成功端内跳转地址
	InnerSuccessCallbackUrl *string `json:"inner_success_callback_url,omitempty" xml:"inner_success_callback_url,omitempty"`
	// 授权成功端外跳转地址
	OutsideSuccessCallbackUrl *string `json:"outside_success_callback_url,omitempty" xml:"outside_success_callback_url,omitempty"`
}

func (s DetailAuthConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailAuthConfigResponse) GoString() string {
	return s.String()
}

func (s *DetailAuthConfigResponse) SetReqMsgId(v string) *DetailAuthConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailAuthConfigResponse) SetResultCode(v string) *DetailAuthConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailAuthConfigResponse) SetResultMsg(v string) *DetailAuthConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthStatus(v bool) *DetailAuthConfigResponse {
	s.AuthStatus = &v
	return s
}

func (s *DetailAuthConfigResponse) SetSceneCode(v string) *DetailAuthConfigResponse {
	s.SceneCode = &v
	return s
}

func (s *DetailAuthConfigResponse) SetStartAuthUrl(v string) *DetailAuthConfigResponse {
	s.StartAuthUrl = &v
	return s
}

func (s *DetailAuthConfigResponse) SetSourceSpaceId(v string) *DetailAuthConfigResponse {
	s.SourceSpaceId = &v
	return s
}

func (s *DetailAuthConfigResponse) SetPublicKey(v string) *DetailAuthConfigResponse {
	s.PublicKey = &v
	return s
}

func (s *DetailAuthConfigResponse) SetEnterpriseCode(v string) *DetailAuthConfigResponse {
	s.EnterpriseCode = &v
	return s
}

func (s *DetailAuthConfigResponse) SetBackgroundColor(v string) *DetailAuthConfigResponse {
	s.BackgroundColor = &v
	return s
}

func (s *DetailAuthConfigResponse) SetTargetName(v string) *DetailAuthConfigResponse {
	s.TargetName = &v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthAppName(v string) *DetailAuthConfigResponse {
	s.AuthAppName = &v
	return s
}

func (s *DetailAuthConfigResponse) SetHaveAuthedCount(v int64) *DetailAuthConfigResponse {
	s.HaveAuthedCount = &v
	return s
}

func (s *DetailAuthConfigResponse) SetEnterpriseLogo(v string) *DetailAuthConfigResponse {
	s.EnterpriseLogo = &v
	return s
}

func (s *DetailAuthConfigResponse) SetCancelAuthCount(v int64) *DetailAuthConfigResponse {
	s.CancelAuthCount = &v
	return s
}

func (s *DetailAuthConfigResponse) SetEnterpriseLogoUrl(v string) *DetailAuthConfigResponse {
	s.EnterpriseLogoUrl = &v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthPurpose(v string) *DetailAuthConfigResponse {
	s.AuthPurpose = &v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthDesc(v string) *DetailAuthConfigResponse {
	s.AuthDesc = &v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthType(v string) *DetailAuthConfigResponse {
	s.AuthType = &v
	return s
}

func (s *DetailAuthConfigResponse) SetUserType(v string) *DetailAuthConfigResponse {
	s.UserType = &v
	return s
}

func (s *DetailAuthConfigResponse) SetUseScopeList(v []*string) *DetailAuthConfigResponse {
	s.UseScopeList = v
	return s
}

func (s *DetailAuthConfigResponse) SetAuthContentList(v []*AuthContent) *DetailAuthConfigResponse {
	s.AuthContentList = v
	return s
}

func (s *DetailAuthConfigResponse) SetAgreementList(v []*Agreement) *DetailAuthConfigResponse {
	s.AgreementList = v
	return s
}

func (s *DetailAuthConfigResponse) SetUseFacialRecognition(v bool) *DetailAuthConfigResponse {
	s.UseFacialRecognition = &v
	return s
}

func (s *DetailAuthConfigResponse) SetEnableShowProofVc(v bool) *DetailAuthConfigResponse {
	s.EnableShowProofVc = &v
	return s
}

func (s *DetailAuthConfigResponse) SetEnableShowAuthRecord(v bool) *DetailAuthConfigResponse {
	s.EnableShowAuthRecord = &v
	return s
}

func (s *DetailAuthConfigResponse) SetInnerSuccessCallbackUrl(v string) *DetailAuthConfigResponse {
	s.InnerSuccessCallbackUrl = &v
	return s
}

func (s *DetailAuthConfigResponse) SetOutsideSuccessCallbackUrl(v string) *DetailAuthConfigResponse {
	s.OutsideSuccessCallbackUrl = &v
	return s
}

type ListAuthRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 用户信息
	UserInfo *string `json:"user_info,omitempty" xml:"user_info,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListAuthRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthRecordRequest) GoString() string {
	return s.String()
}

func (s *ListAuthRecordRequest) SetAuthToken(v string) *ListAuthRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthRecordRequest) SetProductInstanceId(v string) *ListAuthRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAuthRecordRequest) SetSceneCode(v string) *ListAuthRecordRequest {
	s.SceneCode = &v
	return s
}

func (s *ListAuthRecordRequest) SetUserInfo(v string) *ListAuthRecordRequest {
	s.UserInfo = &v
	return s
}

func (s *ListAuthRecordRequest) SetPageNum(v int64) *ListAuthRecordRequest {
	s.PageNum = &v
	return s
}

func (s *ListAuthRecordRequest) SetPageSize(v int64) *ListAuthRecordRequest {
	s.PageSize = &v
	return s
}

type ListAuthRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总条数
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
	// 列表记录
	DataList []*AuthRecordListResponse `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s ListAuthRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthRecordResponse) GoString() string {
	return s.String()
}

func (s *ListAuthRecordResponse) SetReqMsgId(v string) *ListAuthRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthRecordResponse) SetResultCode(v string) *ListAuthRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthRecordResponse) SetResultMsg(v string) *ListAuthRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthRecordResponse) SetCount(v int64) *ListAuthRecordResponse {
	s.Count = &v
	return s
}

func (s *ListAuthRecordResponse) SetTotalPages(v int64) *ListAuthRecordResponse {
	s.TotalPages = &v
	return s
}

func (s *ListAuthRecordResponse) SetDataList(v []*AuthRecordListResponse) *ListAuthRecordResponse {
	s.DataList = v
	return s
}

type DownloadAuthAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 协议code
	AgreementCode *string `json:"agreement_code,omitempty" xml:"agreement_code,omitempty" require:"true"`
}

func (s DownloadAuthAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadAuthAgreementRequest) GoString() string {
	return s.String()
}

func (s *DownloadAuthAgreementRequest) SetAuthToken(v string) *DownloadAuthAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadAuthAgreementRequest) SetProductInstanceId(v string) *DownloadAuthAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadAuthAgreementRequest) SetRequestId(v string) *DownloadAuthAgreementRequest {
	s.RequestId = &v
	return s
}

func (s *DownloadAuthAgreementRequest) SetAgreementCode(v string) *DownloadAuthAgreementRequest {
	s.AgreementCode = &v
	return s
}

type DownloadAuthAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下载链接
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
}

func (s DownloadAuthAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadAuthAgreementResponse) GoString() string {
	return s.String()
}

func (s *DownloadAuthAgreementResponse) SetReqMsgId(v string) *DownloadAuthAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadAuthAgreementResponse) SetResultCode(v string) *DownloadAuthAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadAuthAgreementResponse) SetResultMsg(v string) *DownloadAuthAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadAuthAgreementResponse) SetDownloadUrl(v string) *DownloadAuthAgreementResponse {
	s.DownloadUrl = &v
	return s
}

type VerifyDataAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户表示类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 数据源连接器空间id
	SourceSpaceId *string `json:"source_space_id,omitempty" xml:"source_space_id,omitempty" require:"true"`
	// 企业信用代码
	EnterpriseCode *string `json:"enterprise_code,omitempty" xml:"enterprise_code,omitempty" require:"true"`
	// 授权token
	AuthorizedToken *string `json:"authorized_token,omitempty" xml:"authorized_token,omitempty" require:"true"`
}

func (s VerifyDataAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDataAuthRequest) GoString() string {
	return s.String()
}

func (s *VerifyDataAuthRequest) SetAuthToken(v string) *VerifyDataAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDataAuthRequest) SetProductInstanceId(v string) *VerifyDataAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDataAuthRequest) SetUserId(v string) *VerifyDataAuthRequest {
	s.UserId = &v
	return s
}

func (s *VerifyDataAuthRequest) SetUserType(v string) *VerifyDataAuthRequest {
	s.UserType = &v
	return s
}

func (s *VerifyDataAuthRequest) SetSceneCode(v string) *VerifyDataAuthRequest {
	s.SceneCode = &v
	return s
}

func (s *VerifyDataAuthRequest) SetSourceSpaceId(v string) *VerifyDataAuthRequest {
	s.SourceSpaceId = &v
	return s
}

func (s *VerifyDataAuthRequest) SetEnterpriseCode(v string) *VerifyDataAuthRequest {
	s.EnterpriseCode = &v
	return s
}

func (s *VerifyDataAuthRequest) SetAuthorizedToken(v string) *VerifyDataAuthRequest {
	s.AuthorizedToken = &v
	return s
}

type VerifyDataAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	VerifyResult *bool `json:"verify_result,omitempty" xml:"verify_result,omitempty"`
}

func (s VerifyDataAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDataAuthResponse) GoString() string {
	return s.String()
}

func (s *VerifyDataAuthResponse) SetReqMsgId(v string) *VerifyDataAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDataAuthResponse) SetResultCode(v string) *VerifyDataAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDataAuthResponse) SetResultMsg(v string) *VerifyDataAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDataAuthResponse) SetVerifyResult(v bool) *VerifyDataAuthResponse {
	s.VerifyResult = &v
	return s
}

type QueryProductParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s QueryProductParamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProductParamRequest) GoString() string {
	return s.String()
}

func (s *QueryProductParamRequest) SetAuthToken(v string) *QueryProductParamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProductParamRequest) SetProductInstanceId(v string) *QueryProductParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProductParamRequest) SetSceneCode(v string) *QueryProductParamRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryProductParamRequest) SetProductCode(v string) *QueryProductParamRequest {
	s.ProductCode = &v
	return s
}

type QueryProductParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否需要授权
	NeedAuth *bool `json:"need_auth,omitempty" xml:"need_auth,omitempty"`
	// 产品参数信息列表
	ParamInfoList []*ProductParamInfo `json:"param_info_list,omitempty" xml:"param_info_list,omitempty" type:"Repeated"`
}

func (s QueryProductParamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProductParamResponse) GoString() string {
	return s.String()
}

func (s *QueryProductParamResponse) SetReqMsgId(v string) *QueryProductParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProductParamResponse) SetResultCode(v string) *QueryProductParamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProductParamResponse) SetResultMsg(v string) *QueryProductParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProductParamResponse) SetNeedAuth(v bool) *QueryProductParamResponse {
	s.NeedAuth = &v
	return s
}

func (s *QueryProductParamResponse) SetParamInfoList(v []*ProductParamInfo) *QueryProductParamResponse {
	s.ParamInfoList = v
	return s
}

type CallbackAuthDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权token
	AuthorizedToken *string `json:"authorized_token,omitempty" xml:"authorized_token,omitempty" require:"true"`
	// 数据详情 JSONObject
	DataDetail *string `json:"data_detail,omitempty" xml:"data_detail,omitempty" require:"true"`
	// 授权内容/数据类型
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
}

func (s CallbackAuthDataRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAuthDataRequest) GoString() string {
	return s.String()
}

func (s *CallbackAuthDataRequest) SetAuthToken(v string) *CallbackAuthDataRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAuthDataRequest) SetProductInstanceId(v string) *CallbackAuthDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAuthDataRequest) SetAuthorizedToken(v string) *CallbackAuthDataRequest {
	s.AuthorizedToken = &v
	return s
}

func (s *CallbackAuthDataRequest) SetDataDetail(v string) *CallbackAuthDataRequest {
	s.DataDetail = &v
	return s
}

func (s *CallbackAuthDataRequest) SetDataType(v string) *CallbackAuthDataRequest {
	s.DataType = &v
	return s
}

type CallbackAuthDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackAuthDataResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAuthDataResponse) GoString() string {
	return s.String()
}

func (s *CallbackAuthDataResponse) SetReqMsgId(v string) *CallbackAuthDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAuthDataResponse) SetResultCode(v string) *CallbackAuthDataResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAuthDataResponse) SetResultMsg(v string) *CallbackAuthDataResponse {
	s.ResultMsg = &v
	return s
}

type CallbackAuthRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 蚂蚁统一会员ID
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true"`
	// 授权场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 授权的用户信息JSON字符串，根据场景码配置的用户类型传不同的JSON字符串，二要素传{"name":"张三","certNo":"1101111111"}，证件号类型传{"certNo":"1101111111"}
	UserInfo *string `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
}

func (s CallbackAuthRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAuthRecordRequest) GoString() string {
	return s.String()
}

func (s *CallbackAuthRecordRequest) SetAuthToken(v string) *CallbackAuthRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAuthRecordRequest) SetProductInstanceId(v string) *CallbackAuthRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAuthRecordRequest) SetAlipayUserId(v string) *CallbackAuthRecordRequest {
	s.AlipayUserId = &v
	return s
}

func (s *CallbackAuthRecordRequest) SetSceneCode(v string) *CallbackAuthRecordRequest {
	s.SceneCode = &v
	return s
}

func (s *CallbackAuthRecordRequest) SetUserInfo(v string) *CallbackAuthRecordRequest {
	s.UserInfo = &v
	return s
}

type CallbackAuthRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s CallbackAuthRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAuthRecordResponse) GoString() string {
	return s.String()
}

func (s *CallbackAuthRecordResponse) SetReqMsgId(v string) *CallbackAuthRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAuthRecordResponse) SetResultCode(v string) *CallbackAuthRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAuthRecordResponse) SetResultMsg(v string) *CallbackAuthRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackAuthRecordResponse) SetAuthToken(v string) *CallbackAuthRecordResponse {
	s.AuthToken = &v
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
				"sdk_version":      tea.String("1.1.102"),
				"_prod_code":       tea.String("DAS"),
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
 * Description: 上传批量查询数据文件
 * Summary: 上传批量查询数据文件
 */
func (client *Client) UploadApplicationBatchqueryfile(request *UploadApplicationBatchqueryfileRequest) (_result *UploadApplicationBatchqueryfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadApplicationBatchqueryfileResponse{}
	_body, _err := client.UploadApplicationBatchqueryfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传批量查询数据文件
 * Summary: 上传批量查询数据文件
 */
func (client *Client) UploadApplicationBatchqueryfileEx(request *UploadApplicationBatchqueryfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadApplicationBatchqueryfileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.das.application.batchqueryfile.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadApplicationBatchqueryfileResponse := &UploadApplicationBatchqueryfileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadApplicationBatchqueryfileResponse
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
	_result = &UploadApplicationBatchqueryfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.batchqueryfile.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取查询数据集任务结果
 * Summary: 获取查询数据集任务结果
 */
func (client *Client) QueryApplicationBatchqueryresult(request *QueryApplicationBatchqueryresultRequest) (_result *QueryApplicationBatchqueryresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationBatchqueryresultResponse{}
	_body, _err := client.QueryApplicationBatchqueryresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取查询数据集任务结果
 * Summary: 获取查询数据集任务结果
 */
func (client *Client) QueryApplicationBatchqueryresultEx(request *QueryApplicationBatchqueryresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationBatchqueryresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationBatchqueryresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.batchqueryresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实时获取数据源数据
 * Summary: 实时查询数据
 */
func (client *Client) QueryApplicationData(request *QueryApplicationDataRequest) (_result *QueryApplicationDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationDataResponse{}
	_body, _err := client.QueryApplicationDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实时获取数据源数据
 * Summary: 实时查询数据
 */
func (client *Client) QueryApplicationDataEx(request *QueryApplicationDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 知识产权实时接口
 * Summary: 知识产权实时接口
 */
func (client *Client) QueryApplicationIpe(request *QueryApplicationIpeRequest) (_result *QueryApplicationIpeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationIpeResponse{}
	_body, _err := client.QueryApplicationIpeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 知识产权实时接口
 * Summary: 知识产权实时接口
 */
func (client *Client) QueryApplicationIpeEx(request *QueryApplicationIpeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationIpeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationIpeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.ipe.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询国内商标数据
 * Summary: 查询国内商标数据
 */
func (client *Client) QueryDomesticTrademark(request *QueryDomesticTrademarkRequest) (_result *QueryDomesticTrademarkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDomesticTrademarkResponse{}
	_body, _err := client.QueryDomesticTrademarkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询国内商标数据
 * Summary: 查询国内商标数据
 */
func (client *Client) QueryDomesticTrademarkEx(request *QueryDomesticTrademarkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDomesticTrademarkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDomesticTrademarkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.domestic.trademark.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取国内商标LOGO文件
 * Summary: 获取国内商标LOGO文件
 */
func (client *Client) GetDomesticTrademarklogo(request *GetDomesticTrademarklogoRequest) (_result *GetDomesticTrademarklogoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDomesticTrademarklogoResponse{}
	_body, _err := client.GetDomesticTrademarklogoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取国内商标LOGO文件
 * Summary: 获取国内商标LOGO文件
 */
func (client *Client) GetDomesticTrademarklogoEx(request *GetDomesticTrademarklogoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDomesticTrademarklogoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDomesticTrademarklogoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.domestic.trademarklogo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询加密的企业工商信息
 * Summary: 查询加密的企业工商信息
 */
func (client *Client) QueryEncryptEnterpriseinfo(request *QueryEncryptEnterpriseinfoRequest) (_result *QueryEncryptEnterpriseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEncryptEnterpriseinfoResponse{}
	_body, _err := client.QueryEncryptEnterpriseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询加密的企业工商信息
 * Summary: 查询加密的企业工商信息
 */
func (client *Client) QueryEncryptEnterpriseinfoEx(request *QueryEncryptEnterpriseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEncryptEnterpriseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEncryptEnterpriseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.encrypt.enterpriseinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传授权协议文件
 * Summary: 上传授权协议文件
 */
func (client *Client) UploadApplicationAuthfile(request *UploadApplicationAuthfileRequest) (_result *UploadApplicationAuthfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadApplicationAuthfileResponse{}
	_body, _err := client.UploadApplicationAuthfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传授权协议文件
 * Summary: 上传授权协议文件
 */
func (client *Client) UploadApplicationAuthfileEx(request *UploadApplicationAuthfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadApplicationAuthfileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.das.application.authfile.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadApplicationAuthfileResponse := &UploadApplicationAuthfileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadApplicationAuthfileResponse
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
	_result = &UploadApplicationAuthfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.authfile.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验用户是否车
 * Summary: 校验用户是否车
 */
func (client *Client) CheckApplicationHascar(request *CheckApplicationHascarRequest) (_result *CheckApplicationHascarResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckApplicationHascarResponse{}
	_body, _err := client.CheckApplicationHascarEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验用户是否车
 * Summary: 校验用户是否车
 */
func (client *Client) CheckApplicationHascarEx(request *CheckApplicationHascarRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckApplicationHascarResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckApplicationHascarResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.hascar.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询车辆基础信息
 * Summary: 查询车辆基础信息
 */
func (client *Client) QueryApplicationBasecarinfo(request *QueryApplicationBasecarinfoRequest) (_result *QueryApplicationBasecarinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationBasecarinfoResponse{}
	_body, _err := client.QueryApplicationBasecarinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询车辆基础信息
 * Summary: 查询车辆基础信息
 */
func (client *Client) QueryApplicationBasecarinfoEx(request *QueryApplicationBasecarinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationBasecarinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationBasecarinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.basecarinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询车辆详细信息
 * Summary: 查询车辆详细信息
 */
func (client *Client) QueryApplicationDetailcarinfo(request *QueryApplicationDetailcarinfoRequest) (_result *QueryApplicationDetailcarinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationDetailcarinfoResponse{}
	_body, _err := client.QueryApplicationDetailcarinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询车辆详细信息
 * Summary: 查询车辆详细信息
 */
func (client *Client) QueryApplicationDetailcarinfoEx(request *QueryApplicationDetailcarinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationDetailcarinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationDetailcarinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.detailcarinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权简历查询服务
 * Summary: 授权简历查询服务
 */
func (client *Client) SignApplicationResume(request *SignApplicationResumeRequest) (_result *SignApplicationResumeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SignApplicationResumeResponse{}
	_body, _err := client.SignApplicationResumeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权简历查询服务
 * Summary: 授权简历查询服务
 */
func (client *Client) SignApplicationResumeEx(request *SignApplicationResumeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SignApplicationResumeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SignApplicationResumeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.resume.sign"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询简历信息
 * Summary: 查询简历信息
 */
func (client *Client) QueryApplicationResume(request *QueryApplicationResumeRequest) (_result *QueryApplicationResumeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationResumeResponse{}
	_body, _err := client.QueryApplicationResumeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询简历信息
 * Summary: 查询简历信息
 */
func (client *Client) QueryApplicationResumeEx(request *QueryApplicationResumeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationResumeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationResumeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.resume.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人车核验并查询车辆详细信息
 * Summary: 人车核验并查询车辆详细信息
 */
func (client *Client) QueryDetailcarinfoPesonandlic(request *QueryDetailcarinfoPesonandlicRequest) (_result *QueryDetailcarinfoPesonandlicResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDetailcarinfoPesonandlicResponse{}
	_body, _err := client.QueryDetailcarinfoPesonandlicEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人车核验并查询车辆详细信息
 * Summary: 人车核验并查询车辆详细信息
 */
func (client *Client) QueryDetailcarinfoPesonandlicEx(request *QueryDetailcarinfoPesonandlicRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDetailcarinfoPesonandlicResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDetailcarinfoPesonandlicResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.detailcarinfo.pesonandlic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 教育标签(姓名身份证)信息查询
 * Summary: 教育标签(姓名身份证)信息查询
 */
func (client *Client) QueryIdnumberEducationtaginfo(request *QueryIdnumberEducationtaginfoRequest) (_result *QueryIdnumberEducationtaginfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIdnumberEducationtaginfoResponse{}
	_body, _err := client.QueryIdnumberEducationtaginfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 教育标签(姓名身份证)信息查询
 * Summary: 教育标签(姓名身份证)信息查询
 */
func (client *Client) QueryIdnumberEducationtaginfoEx(request *QueryIdnumberEducationtaginfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIdnumberEducationtaginfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIdnumberEducationtaginfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.idnumber.educationtaginfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 教育信息查询（姓名手机号/姓名身份证）
 * Summary: 教育信息查询（姓名手机号/姓名身份证）
 */
func (client *Client) QueryPhonenumberEducationinfo(request *QueryPhonenumberEducationinfoRequest) (_result *QueryPhonenumberEducationinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPhonenumberEducationinfoResponse{}
	_body, _err := client.QueryPhonenumberEducationinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 教育信息查询（姓名手机号/姓名身份证）
 * Summary: 教育信息查询（姓名手机号/姓名身份证）
 */
func (client *Client) QueryPhonenumberEducationinfoEx(request *QueryPhonenumberEducationinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPhonenumberEducationinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPhonenumberEducationinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.phonenumber.educationinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据应用统一入口
 * Summary: 数据应用统一入口
 */
func (client *Client) QueryApplicationUnifiedentrance(request *QueryApplicationUnifiedentranceRequest) (_result *QueryApplicationUnifiedentranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationUnifiedentranceResponse{}
	_body, _err := client.QueryApplicationUnifiedentranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据应用统一入口
 * Summary: 数据应用统一入口
 */
func (client *Client) QueryApplicationUnifiedentranceEx(request *QueryApplicationUnifiedentranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationUnifiedentranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationUnifiedentranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.unifiedentrance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据姓名和身份证，返回驾驶证核验信息
 * Summary: 驾驶证核验信息查询
 */
func (client *Client) QueryApplicationDriverlicensecert(request *QueryApplicationDriverlicensecertRequest) (_result *QueryApplicationDriverlicensecertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationDriverlicensecertResponse{}
	_body, _err := client.QueryApplicationDriverlicensecertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据姓名和身份证，返回驾驶证核验信息
 * Summary: 驾驶证核验信息查询
 */
func (client *Client) QueryApplicationDriverlicensecertEx(request *QueryApplicationDriverlicensecertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationDriverlicensecertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationDriverlicensecertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.driverlicensecert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据车牌号所有人等信息，返回行驶证核验结果
 * Summary: 行驶证核验信息查询
 */
func (client *Client) QueryApplicationVehiclelicensecert(request *QueryApplicationVehiclelicensecertRequest) (_result *QueryApplicationVehiclelicensecertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationVehiclelicensecertResponse{}
	_body, _err := client.QueryApplicationVehiclelicensecertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据车牌号所有人等信息，返回行驶证核验结果
 * Summary: 行驶证核验信息查询
 */
func (client *Client) QueryApplicationVehiclelicensecertEx(request *QueryApplicationVehiclelicensecertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationVehiclelicensecertResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationVehiclelicensecertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.vehiclelicensecert.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据姓名身份证信息查询学籍信息
 * Summary: 根据姓名身份证信息查询学籍
 */
func (client *Client) QueryApplicationEducationstatus(request *QueryApplicationEducationstatusRequest) (_result *QueryApplicationEducationstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationEducationstatusResponse{}
	_body, _err := client.QueryApplicationEducationstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据姓名身份证信息查询学籍信息
 * Summary: 根据姓名身份证信息查询学籍
 */
func (client *Client) QueryApplicationEducationstatusEx(request *QueryApplicationEducationstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationEducationstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationEducationstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.educationstatus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据服务授权文件上传
 * Summary: 数据服务授权文件上传
 */
func (client *Client) UploadServiceAuthfile(request *UploadServiceAuthfileRequest) (_result *UploadServiceAuthfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadServiceAuthfileResponse{}
	_body, _err := client.UploadServiceAuthfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据服务授权文件上传
 * Summary: 数据服务授权文件上传
 */
func (client *Client) UploadServiceAuthfileEx(request *UploadServiceAuthfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadServiceAuthfileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.das.service.authfile.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadServiceAuthfileResponse := &UploadServiceAuthfileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadServiceAuthfileResponse
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
	_result = &UploadServiceAuthfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.service.authfile.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询国内商标扩展信息
 * Summary: 查询国内商标扩展信息
 */
func (client *Client) QueryDomestictrademarkExtensioninfo(request *QueryDomestictrademarkExtensioninfoRequest) (_result *QueryDomestictrademarkExtensioninfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDomestictrademarkExtensioninfoResponse{}
	_body, _err := client.QueryDomestictrademarkExtensioninfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询国内商标扩展信息
 * Summary: 查询国内商标扩展信息
 */
func (client *Client) QueryDomestictrademarkExtensioninfoEx(request *QueryDomestictrademarkExtensioninfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDomestictrademarkExtensioninfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDomestictrademarkExtensioninfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.domestictrademark.extensioninfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件类型数据服务统一接口
 * Summary: 文件类型服务统一接口
 */
func (client *Client) GetApplicationFileentrance(request *GetApplicationFileentranceRequest) (_result *GetApplicationFileentranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApplicationFileentranceResponse{}
	_body, _err := client.GetApplicationFileentranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件类型数据服务统一接口
 * Summary: 文件类型服务统一接口
 */
func (client *Client) GetApplicationFileentranceEx(request *GetApplicationFileentranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApplicationFileentranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApplicationFileentranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.fileentrance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 万文
 * Summary: 异步入口--获取流水号
 */
func (client *Client) InitUnifiedentranceAsync(request *InitUnifiedentranceAsyncRequest) (_result *InitUnifiedentranceAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitUnifiedentranceAsyncResponse{}
	_body, _err := client.InitUnifiedentranceAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 万文
 * Summary: 异步入口--获取流水号
 */
func (client *Client) InitUnifiedentranceAsyncEx(request *InitUnifiedentranceAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitUnifiedentranceAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitUnifiedentranceAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.unifiedentrance.async.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取异步结果
 * Summary: 获取异步结果
 */
func (client *Client) QueryUnifiedentranceAsync(request *QueryUnifiedentranceAsyncRequest) (_result *QueryUnifiedentranceAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUnifiedentranceAsyncResponse{}
	_body, _err := client.QueryUnifiedentranceAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取异步结果
 * Summary: 获取异步结果
 */
func (client *Client) QueryUnifiedentranceAsyncEx(request *QueryUnifiedentranceAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUnifiedentranceAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUnifiedentranceAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.unifiedentrance.async.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据应用统一入口，主站调用
 * Summary: 数据应用统一入口，主站调用
 */
func (client *Client) QueryMainsiteUnifiedentrance(request *QueryMainsiteUnifiedentranceRequest) (_result *QueryMainsiteUnifiedentranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMainsiteUnifiedentranceResponse{}
	_body, _err := client.QueryMainsiteUnifiedentranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据应用统一入口，主站调用
 * Summary: 数据应用统一入口，主站调用
 */
func (client *Client) QueryMainsiteUnifiedentranceEx(request *QueryMainsiteUnifiedentranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMainsiteUnifiedentranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMainsiteUnifiedentranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.mainsite.unifiedentrance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代客签名
 * Summary: 代客签名
 */
func (client *Client) GetApplicationProxysign(request *GetApplicationProxysignRequest) (_result *GetApplicationProxysignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApplicationProxysignResponse{}
	_body, _err := client.GetApplicationProxysignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代客签名
 * Summary: 代客签名
 */
func (client *Client) GetApplicationProxysignEx(request *GetApplicationProxysignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApplicationProxysignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApplicationProxysignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.proxysign.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据服务内部渠道统一查询入口
 * Summary: 数据服务内部渠道统一查询入口
 */
func (client *Client) QueryApplicationChannelunifiedentrance(request *QueryApplicationChannelunifiedentranceRequest) (_result *QueryApplicationChannelunifiedentranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationChannelunifiedentranceResponse{}
	_body, _err := client.QueryApplicationChannelunifiedentranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据服务内部渠道统一查询入口
 * Summary: 数据服务内部渠道统一查询入口
 */
func (client *Client) QueryApplicationChannelunifiedentranceEx(request *QueryApplicationChannelunifiedentranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationChannelunifiedentranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationChannelunifiedentranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.channelunifiedentrance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 渠道调用上传授权协议文件
 * Summary: 渠道调用上传授权协议文件
 */
func (client *Client) UploadApplicationChannelauthfile(request *UploadApplicationChannelauthfileRequest) (_result *UploadApplicationChannelauthfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadApplicationChannelauthfileResponse{}
	_body, _err := client.UploadApplicationChannelauthfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 渠道调用上传授权协议文件
 * Summary: 渠道调用上传授权协议文件
 */
func (client *Client) UploadApplicationChannelauthfileEx(request *UploadApplicationChannelauthfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadApplicationChannelauthfileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.das.application.channelauthfile.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadApplicationChannelauthfileResponse := &UploadApplicationChannelauthfileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadApplicationChannelauthfileResponse
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
	_result = &UploadApplicationChannelauthfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.channelauthfile.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核婚的查询
 * Summary: 核婚的查询
 */
func (client *Client) QueryApplicationMarriage(request *QueryApplicationMarriageRequest) (_result *QueryApplicationMarriageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApplicationMarriageResponse{}
	_body, _err := client.QueryApplicationMarriageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核婚的查询
 * Summary: 核婚的查询
 */
func (client *Client) QueryApplicationMarriageEx(request *QueryApplicationMarriageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApplicationMarriageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApplicationMarriageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.application.marriage.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授权H5页面链接
 * Summary: 获取授权H5页面链接
 */
func (client *Client) GetDasLink(request *GetDasLinkRequest) (_result *GetDasLinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasLinkResponse{}
	_body, _err := client.GetDasLinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权H5页面链接
 * Summary: 获取授权H5页面链接
 */
func (client *Client) GetDasLinkEx(request *GetDasLinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasLinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasLinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.link.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授权企业VC
 * Summary: 获取授权企业VC
 */
func (client *Client) GetDasEnterprisevc(request *GetDasEnterprisevcRequest) (_result *GetDasEnterprisevcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasEnterprisevcResponse{}
	_body, _err := client.GetDasEnterprisevcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权企业VC
 * Summary: 获取授权企业VC
 */
func (client *Client) GetDasEnterprisevcEx(request *GetDasEnterprisevcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasEnterprisevcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasEnterprisevcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.enterprisevc.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取个人VC
 * Summary: 获取个人VC
 */
func (client *Client) GetDasIndividualvc(request *GetDasIndividualvcRequest) (_result *GetDasIndividualvcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasIndividualvcResponse{}
	_body, _err := client.GetDasIndividualvcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取个人VC
 * Summary: 获取个人VC
 */
func (client *Client) GetDasIndividualvcEx(request *GetDasIndividualvcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasIndividualvcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasIndividualvcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.individualvc.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送短信验证码
 * Summary: 发送短信验证码
 */
func (client *Client) SendDasSms(request *SendDasSmsRequest) (_result *SendDasSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendDasSmsResponse{}
	_body, _err := client.SendDasSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送短信验证码
 * Summary: 发送短信验证码
 */
func (client *Client) SendDasSmsEx(request *SendDasSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendDasSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDasSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.sms.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过短信验证码授权
 * Summary: 通过短信验证码授权
 */
func (client *Client) AuthDasSms(request *AuthDasSmsRequest) (_result *AuthDasSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthDasSmsResponse{}
	_body, _err := client.AuthDasSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过短信验证码授权
 * Summary: 通过短信验证码授权
 */
func (client *Client) AuthDasSmsEx(request *AuthDasSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthDasSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthDasSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.sms.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
 * Summary: 企业信息核验
 */
func (client *Client) VerifyDasEnterprise(request *VerifyDasEnterpriseRequest) (_result *VerifyDasEnterpriseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasEnterpriseResponse{}
	_body, _err := client.VerifyDasEnterpriseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
 * Summary: 企业信息核验
 */
func (client *Client) VerifyDasEnterpriseEx(request *VerifyDasEnterpriseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasEnterpriseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasEnterpriseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.enterprise.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人信息核验
 * Summary: 个人信息核验
 */
func (client *Client) VerifyDasIndividual(request *VerifyDasIndividualRequest) (_result *VerifyDasIndividualResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasIndividualResponse{}
	_body, _err := client.VerifyDasIndividualEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人信息核验
 * Summary: 个人信息核验
 */
func (client *Client) VerifyDasIndividualEx(request *VerifyDasIndividualRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasIndividualResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasIndividualResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.individual.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数据源
 * Summary: 创建数据源
 */
func (client *Client) CreateDasDatasource(request *CreateDasDatasourceRequest) (_result *CreateDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDasDatasourceResponse{}
	_body, _err := client.CreateDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数据源
 * Summary: 创建数据源
 */
func (client *Client) CreateDasDatasourceEx(request *CreateDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数据源
 * Summary: 更新数据源
 */
func (client *Client) UpdateDasDatasource(request *UpdateDasDatasourceRequest) (_result *UpdateDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDasDatasourceResponse{}
	_body, _err := client.UpdateDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数据源
 * Summary: 更新数据源
 */
func (client *Client) UpdateDasDatasourceEx(request *UpdateDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除数据源
 * Summary: 删除数据源
 */
func (client *Client) DeleteDasDatasource(request *DeleteDasDatasourceRequest) (_result *DeleteDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteDasDatasourceResponse{}
	_body, _err := client.DeleteDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除数据源
 * Summary: 删除数据源
 */
func (client *Client) DeleteDasDatasourceEx(request *DeleteDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据源信息
 * Summary: 查询数据源信息
 */
func (client *Client) QueryDasDatasource(request *QueryDasDatasourceRequest) (_result *QueryDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDasDatasourceResponse{}
	_body, _err := client.QueryDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据源信息
 * Summary: 查询数据源信息
 */
func (client *Client) QueryDasDatasourceEx(request *QueryDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验授权结果
 * Summary: 校验授权结果
 */
func (client *Client) VerifyDasAuthresult(request *VerifyDasAuthresultRequest) (_result *VerifyDasAuthresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasAuthresultResponse{}
	_body, _err := client.VerifyDasAuthresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验授权结果
 * Summary: 校验授权结果
 */
func (client *Client) VerifyDasAuthresultEx(request *VerifyDasAuthresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasAuthresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasAuthresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.authresult.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据授权三方信息做授权
 * Summary: 根据授权三方信息做授权
 */
func (client *Client) AuthDasAuthresult(request *AuthDasAuthresultRequest) (_result *AuthDasAuthresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthDasAuthresultResponse{}
	_body, _err := client.AuthDasAuthresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据授权三方信息做授权
 * Summary: 根据授权三方信息做授权
 */
func (client *Client) AuthDasAuthresultEx(request *AuthDasAuthresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthDasAuthresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthDasAuthresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.authresult.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增数据授权配置
 * Summary: 新增数据授权配置
 */
func (client *Client) AddAuthConfig(request *AddAuthConfigRequest) (_result *AddAuthConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddAuthConfigResponse{}
	_body, _err := client.AddAuthConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增数据授权配置
 * Summary: 新增数据授权配置
 */
func (client *Client) AddAuthConfigEx(request *AddAuthConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddAuthConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAuthConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.config.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑数据授权配置
 * Summary: 编辑数据授权配置
 */
func (client *Client) UpdateAuthConfig(request *UpdateAuthConfigRequest) (_result *UpdateAuthConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAuthConfigResponse{}
	_body, _err := client.UpdateAuthConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑数据授权配置
 * Summary: 编辑数据授权配置
 */
func (client *Client) UpdateAuthConfigEx(request *UpdateAuthConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAuthConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAuthConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.config.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传授权协议
 * Summary: 上传授权协议
 */
func (client *Client) UploadAuthAgreement(request *UploadAuthAgreementRequest) (_result *UploadAuthAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAuthAgreementResponse{}
	_body, _err := client.UploadAuthAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传授权协议
 * Summary: 上传授权协议
 */
func (client *Client) UploadAuthAgreementEx(request *UploadAuthAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAuthAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAuthAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.agreement.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传图片
 * Summary: 上传图片
 */
func (client *Client) UploadAuthPicture(request *UploadAuthPictureRequest) (_result *UploadAuthPictureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAuthPictureResponse{}
	_body, _err := client.UploadAuthPictureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传图片
 * Summary: 上传图片
 */
func (client *Client) UploadAuthPictureEx(request *UploadAuthPictureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAuthPictureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAuthPictureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.picture.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权内容列表
 * Summary: 查询授权内容列表
 */
func (client *Client) ListAuthContent(request *ListAuthContentRequest) (_result *ListAuthContentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthContentResponse{}
	_body, _err := client.ListAuthContentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权内容列表
 * Summary: 查询授权内容列表
 */
func (client *Client) ListAuthContentEx(request *ListAuthContentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthContentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthContentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.content.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据授权配置列表
 * Summary: 查询数据授权配置列表
 */
func (client *Client) ListAuthConfig(request *ListAuthConfigRequest) (_result *ListAuthConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthConfigResponse{}
	_body, _err := client.ListAuthConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据授权配置列表
 * Summary: 查询数据授权配置列表
 */
func (client *Client) ListAuthConfigEx(request *ListAuthConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.config.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新授权配置状态
 * Summary: 更新授权配置状态
 */
func (client *Client) UpdateAuthStatus(request *UpdateAuthStatusRequest) (_result *UpdateAuthStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAuthStatusResponse{}
	_body, _err := client.UpdateAuthStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新授权配置状态
 * Summary: 更新授权配置状态
 */
func (client *Client) UpdateAuthStatusEx(request *UpdateAuthStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAuthStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAuthStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权配置详情
 * Summary: 查询授权配置详情
 */
func (client *Client) DetailAuthConfig(request *DetailAuthConfigRequest) (_result *DetailAuthConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailAuthConfigResponse{}
	_body, _err := client.DetailAuthConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权配置详情
 * Summary: 查询授权配置详情
 */
func (client *Client) DetailAuthConfigEx(request *DetailAuthConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailAuthConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailAuthConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.config.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户授权记录列表
 * Summary: 查询用户授权记录列表
 */
func (client *Client) ListAuthRecord(request *ListAuthRecordRequest) (_result *ListAuthRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthRecordResponse{}
	_body, _err := client.ListAuthRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户授权记录列表
 * Summary: 查询用户授权记录列表
 */
func (client *Client) ListAuthRecordEx(request *ListAuthRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.record.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下载用户授权协议
 * Summary: 下载用户授权协议
 */
func (client *Client) DownloadAuthAgreement(request *DownloadAuthAgreementRequest) (_result *DownloadAuthAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadAuthAgreementResponse{}
	_body, _err := client.DownloadAuthAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下载用户授权协议
 * Summary: 下载用户授权协议
 */
func (client *Client) DownloadAuthAgreementEx(request *DownloadAuthAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadAuthAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadAuthAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.agreement.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据授权核验
 * Summary: 数据授权核验
 */
func (client *Client) VerifyDataAuth(request *VerifyDataAuthRequest) (_result *VerifyDataAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDataAuthResponse{}
	_body, _err := client.VerifyDataAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据授权核验
 * Summary: 数据授权核验
 */
func (client *Client) VerifyDataAuthEx(request *VerifyDataAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDataAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDataAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.data.auth.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品参数信息
 * Summary: 查询产品参数信息
 */
func (client *Client) QueryProductParam(request *QueryProductParamRequest) (_result *QueryProductParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProductParamResponse{}
	_body, _err := client.QueryProductParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品参数信息
 * Summary: 查询产品参数信息
 */
func (client *Client) QueryProductParamEx(request *QueryProductParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProductParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProductParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.product.param.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权数据回调
 * Summary: 授权数据回调
 */
func (client *Client) CallbackAuthData(request *CallbackAuthDataRequest) (_result *CallbackAuthDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAuthDataResponse{}
	_body, _err := client.CallbackAuthDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权数据回调
 * Summary: 授权数据回调
 */
func (client *Client) CallbackAuthDataEx(request *CallbackAuthDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAuthDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAuthDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.data.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权记录回调
 * Summary: 授权记录回调
 */
func (client *Client) CallbackAuthRecord(request *CallbackAuthRecordRequest) (_result *CallbackAuthRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAuthRecordResponse{}
	_body, _err := client.CallbackAuthRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权记录回调
 * Summary: 授权记录回调
 */
func (client *Client) CallbackAuthRecordEx(request *CallbackAuthRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAuthRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAuthRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.auth.record.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
