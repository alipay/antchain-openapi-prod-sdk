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

// 企业风险等级分布统计
type RtopLevelDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 等级
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
}

func (s RtopLevelDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopLevelDistribution) GoString() string {
	return s.String()
}

func (s *RtopLevelDistribution) SetCount(v int) *RtopLevelDistribution {
	s.Count = &v
	return s
}

func (s *RtopLevelDistribution) SetLevel(v string) *RtopLevelDistribution {
	s.Level = &v
	return s
}

// 涉众风险企业特征
type RtopCrowdRiskFeatureTag struct {
	// 标签描述
	TagExplanation *string `json:"tag_explanation,omitempty" xml:"tag_explanation,omitempty" require:"true"`
	// 标签名称
	TagName *string `json:"tag_name,omitempty" xml:"tag_name,omitempty" require:"true"`
}

func (s RtopCrowdRiskFeatureTag) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskFeatureTag) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskFeatureTag) SetTagExplanation(v string) *RtopCrowdRiskFeatureTag {
	s.TagExplanation = &v
	return s
}

func (s *RtopCrowdRiskFeatureTag) SetTagName(v string) *RtopCrowdRiskFeatureTag {
	s.TagName = &v
	return s
}

// 企业类型分布统计
type RtopTypeDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 当前类型下的等级分布
	LevelDistribution []*RtopLevelDistribution `json:"levelDistribution,omitempty" xml:"levelDistribution,omitempty" require:"true" type:"Repeated"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s RtopTypeDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopTypeDistribution) GoString() string {
	return s.String()
}

func (s *RtopTypeDistribution) SetCount(v int) *RtopTypeDistribution {
	s.Count = &v
	return s
}

func (s *RtopTypeDistribution) SetLevelDistribution(v []*RtopLevelDistribution) *RtopTypeDistribution {
	s.LevelDistribution = v
	return s
}

func (s *RtopTypeDistribution) SetType(v string) *RtopTypeDistribution {
	s.Type = &v
	return s
}

// 监管风险标签
type RtopRiskTag struct {
	// 线索明细类型
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty"`
	// 线索概览
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty"`
	// 线索明细
	TagClueDetail *string `json:"tag_clue_detail,omitempty" xml:"tag_clue_detail,omitempty"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 标签名称
	TagName *string `json:"tag_name,omitempty" xml:"tag_name,omitempty" require:"true"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty"`
	// 标签类型
	TagType *string `json:"tag_type,omitempty" xml:"tag_type,omitempty"`
}

func (s RtopRiskTag) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskTag) GoString() string {
	return s.String()
}

func (s *RtopRiskTag) SetClueDetailType(v string) *RtopRiskTag {
	s.ClueDetailType = &v
	return s
}

func (s *RtopRiskTag) SetTagClue(v string) *RtopRiskTag {
	s.TagClue = &v
	return s
}

func (s *RtopRiskTag) SetTagClueDetail(v string) *RtopRiskTag {
	s.TagClueDetail = &v
	return s
}

func (s *RtopRiskTag) SetTagId(v string) *RtopRiskTag {
	s.TagId = &v
	return s
}

func (s *RtopRiskTag) SetTagName(v string) *RtopRiskTag {
	s.TagName = &v
	return s
}

func (s *RtopRiskTag) SetTagText(v string) *RtopRiskTag {
	s.TagText = &v
	return s
}

func (s *RtopRiskTag) SetTagType(v string) *RtopRiskTag {
	s.TagType = &v
	return s
}

// 安全数据服务请求参数
type SecurityDataQueryStruct struct {
	// 请求数据参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 请求数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 请求数据版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s SecurityDataQueryStruct) String() string {
	return tea.Prettify(s)
}

func (s SecurityDataQueryStruct) GoString() string {
	return s.String()
}

func (s *SecurityDataQueryStruct) SetParams(v string) *SecurityDataQueryStruct {
	s.Params = &v
	return s
}

func (s *SecurityDataQueryStruct) SetType(v string) *SecurityDataQueryStruct {
	s.Type = &v
	return s
}

func (s *SecurityDataQueryStruct) SetVersion(v string) *SecurityDataQueryStruct {
	s.Version = &v
	return s
}

// 企业舆情数量
type RtopCompanyOpinionCount struct {
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 企业对应的舆情数量
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopCompanyOpinionCount) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyOpinionCount) GoString() string {
	return s.String()
}

func (s *RtopCompanyOpinionCount) SetCompanyName(v string) *RtopCompanyOpinionCount {
	s.CompanyName = &v
	return s
}

func (s *RtopCompanyOpinionCount) SetCount(v int) *RtopCompanyOpinionCount {
	s.Count = &v
	return s
}

// 安全场景参数
type SecurityScene struct {
	// 接入渠道
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty"`
	// 事件信息
	CtuParams *string `json:"ctu_params,omitempty" xml:"ctu_params,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 产品节点
	ProductNode *string `json:"product_node,omitempty" xml:"product_node,omitempty"`
	// 扩展参数
	SecuritySceneParams *string `json:"security_scene_params,omitempty" xml:"security_scene_params,omitempty"`
	// 系统名称
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty"`
	// 总金额
	TotalFee *string `json:"total_fee,omitempty" xml:"total_fee,omitempty"`
}

func (s SecurityScene) String() string {
	return tea.Prettify(s)
}

func (s SecurityScene) GoString() string {
	return s.String()
}

func (s *SecurityScene) SetAccessChannel(v string) *SecurityScene {
	s.AccessChannel = &v
	return s
}

func (s *SecurityScene) SetCtuParams(v string) *SecurityScene {
	s.CtuParams = &v
	return s
}

func (s *SecurityScene) SetProductName(v string) *SecurityScene {
	s.ProductName = &v
	return s
}

func (s *SecurityScene) SetProductNode(v string) *SecurityScene {
	s.ProductNode = &v
	return s
}

func (s *SecurityScene) SetSecuritySceneParams(v string) *SecurityScene {
	s.SecuritySceneParams = &v
	return s
}

func (s *SecurityScene) SetSystemName(v string) *SecurityScene {
	s.SystemName = &v
	return s
}

func (s *SecurityScene) SetTotalFee(v string) *SecurityScene {
	s.TotalFee = &v
	return s
}

// 企业影响人数年龄分布统计
type RtopAgeDistribution struct {
	// 年龄
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopAgeDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopAgeDistribution) GoString() string {
	return s.String()
}

func (s *RtopAgeDistribution) SetAge(v string) *RtopAgeDistribution {
	s.Age = &v
	return s
}

func (s *RtopAgeDistribution) SetCount(v int) *RtopAgeDistribution {
	s.Count = &v
	return s
}

// 企业地区分布统计
type RtopRegionalDistribution struct {
	// 统计值
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 地区
	Place *string `json:"place,omitempty" xml:"place,omitempty" require:"true"`
	// 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
	TypeDistribution []*RtopTypeDistribution `json:"type_distribution,omitempty" xml:"type_distribution,omitempty" type:"Repeated"`
}

func (s RtopRegionalDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopRegionalDistribution) GoString() string {
	return s.String()
}

func (s *RtopRegionalDistribution) SetCount(v int64) *RtopRegionalDistribution {
	s.Count = &v
	return s
}

func (s *RtopRegionalDistribution) SetPlace(v string) *RtopRegionalDistribution {
	s.Place = &v
	return s
}

func (s *RtopRegionalDistribution) SetTypeDistribution(v []*RtopTypeDistribution) *RtopRegionalDistribution {
	s.TypeDistribution = v
	return s
}

// 企业信息
type CompanyInfo struct {
	// 活跃地json
	ActiveAddrJson *string `json:"active_addr_json,omitempty" xml:"active_addr_json,omitempty" require:"true"`
	// 活跃市(字段停用)
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty" require:"true"`
	// 活跃县(字段停用)
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty" require:"true"`
	// 活跃省(字段停用)
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty" require:"true"`
	// 类经融行业分类
	Categories *string `json:"categories,omitempty" xml:"categories,omitempty" require:"true"`
	// 核准日期
	CheckDate *string `json:"check_date,omitempty" xml:"check_date,omitempty" require:"true"`
	// 删除标志
	DelFlag *string `json:"del_flag,omitempty" xml:"del_flag,omitempty" require:"true"`
	// odps数据产生时间，业务上不关心
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty" require:"true"`
	// 企业曾用名
	FormerOrgNames *string `json:"former_org_names,omitempty" xml:"former_org_names,omitempty" require:"true"`
	// {"mct_one_id":"ID1","org_name":"总公司名称1"}
	HeadOffice *string `json:"head_office,omitempty" xml:"head_office,omitempty" require:"true"`
	// 记录ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 影响金额
	InvolvedAmount *int64 `json:"involved_amount,omitempty" xml:"involved_amount,omitempty" require:"true"`
	// 影响人数
	InvolvedPeople *int64 `json:"involved_people,omitempty" xml:"involved_people,omitempty" require:"true"`
	// 重要关联企业,json格式
	KeyRelaOrgs *string `json:"key_rela_orgs,omitempty" xml:"key_rela_orgs,omitempty" require:"true"`
	// 法人
	LegalRepresentative *string `json:"legal_representative,omitempty" xml:"legal_representative,omitempty" require:"true"`
	// 企业ID
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 经营地json
	OperatingAddrJson *string `json:"operating_addr_json,omitempty" xml:"operating_addr_json,omitempty" require:"true"`
	// 经营市(字段停用)
	OperatingCity *string `json:"operating_city,omitempty" xml:"operating_city,omitempty" require:"true"`
	// 经营县(字段停用)
	OperatingCounty *string `json:"operating_county,omitempty" xml:"operating_county,omitempty" require:"true"`
	// 经营地址(字段停用)
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty" require:"true"`
	// 经营省(字段停用)
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty" require:"true"`
	// 营运状态(1:营运0:不营运)
	OprtActvState *string `json:"oprt_actv_state,omitempty" xml:"oprt_actv_state,omitempty" require:"true"`
	// 经营期限至
	OprtEndDate *string `json:"oprt_end_date,omitempty" xml:"oprt_end_date,omitempty" require:"true"`
	// 经营范围
	OprtScope *string `json:"oprt_scope,omitempty" xml:"oprt_scope,omitempty" require:"true"`
	// 经营期限自
	OprtStartDate *string `json:"oprt_start_date,omitempty" xml:"oprt_start_date,omitempty" require:"true"`
	// 操作类型
	//
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 组织机构代码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" require:"true"`
	// 电子邮箱
	OrgEmail *string `json:"org_email,omitempty" xml:"org_email,omitempty" require:"true"`
	// 企业名
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 注册资本折人民币(万元)
	OrgRegCptlRmb *string `json:"org_reg_cptl_rmb,omitempty" xml:"org_reg_cptl_rmb,omitempty" require:"true"`
	// 企业状态
	OrgState *string `json:"org_state,omitempty" xml:"org_state,omitempty" require:"true"`
	// 联系电话
	OrgTel *string `json:"org_tel,omitempty" xml:"org_tel,omitempty" require:"true"`
	// 企业类型
	OrgType *string `json:"org_type,omitempty" xml:"org_type,omitempty" require:"true"`
	// 平台json
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
	// 平台名
	PlatformName *string `json:"platform_name,omitempty" xml:"platform_name,omitempty" require:"true"`
	// 平台状态
	PlatformStates *string `json:"platform_states,omitempty" xml:"platform_states,omitempty" require:"true"`
	// 注册资本币种
	RegisterCapitalCurrency *string `json:"register_capital_currency,omitempty" xml:"register_capital_currency,omitempty" require:"true"`
	// 注册资本值
	RegisterCapitalValue *string `json:"register_capital_value,omitempty" xml:"register_capital_value,omitempty" require:"true"`
	// 注册市
	RegisterCity *string `json:"register_city,omitempty" xml:"register_city,omitempty" require:"true"`
	// 注册区县
	RegisterCounty *string `json:"register_county,omitempty" xml:"register_county,omitempty" require:"true"`
	// 注册时间
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 注册地址
	RegisterPlace *string `json:"register_place,omitempty" xml:"register_place,omitempty" require:"true"`
	// 注册省
	RegisterProvince *string `json:"register_province,omitempty" xml:"register_province,omitempty" require:"true"`
	// 登记机关
	RegistrationAuthority *string `json:"registration_authority,omitempty" xml:"registration_authority,omitempty" require:"true"`
	// 工商注册号
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty" require:"true"`
	// 风报企业ID
	RiskstormCompanyId *string `json:"riskstorm_company_id,omitempty" xml:"riskstorm_company_id,omitempty" require:"true"`
	// 风险维度
	RiskFactors *string `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" require:"true"`
	// 风险图谱可视化数据
	RiskGraphJson *string `json:"risk_graph_json,omitempty" xml:"risk_graph_json,omitempty" require:"true"`
	// 风险报文
	RiskMessage *string `json:"risk_message,omitempty" xml:"risk_message,omitempty" require:"true"`
	// 风险指数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险指数，按日的趋势图
	RiskScoreTrend *string `json:"risk_score_trend,omitempty" xml:"risk_score_trend,omitempty" require:"true"`
	// 风险指数周波动
	RiskScoreWeeklyFloat *int64 `json:"risk_score_weekly_float,omitempty" xml:"risk_score_weekly_float,omitempty" require:"true"`
	// 风险标签(字段停用)
	RiskTags *string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" require:"true"`
	// 风险标签ID
	RiskTagsId *string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" require:"true"`
	// 风险定性
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 搜索内容
	SearchContent *string `json:"search_content,omitempty" xml:"search_content,omitempty" require:"true"`
	// 传播人次
	SpreadNumber *int64 `json:"spread_number,omitempty" xml:"spread_number,omitempty" require:"true"`
	// 影响地区人次分布,json格式如下
	SpreadNumDistribution *string `json:"spread_num_distribution,omitempty" xml:"spread_num_distribution,omitempty" require:"true"`
	// 社会统一信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty" require:"true"`
	// 公有云数据库产生时间
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s CompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfo) GoString() string {
	return s.String()
}

func (s *CompanyInfo) SetActiveAddrJson(v string) *CompanyInfo {
	s.ActiveAddrJson = &v
	return s
}

func (s *CompanyInfo) SetActiveCity(v string) *CompanyInfo {
	s.ActiveCity = &v
	return s
}

func (s *CompanyInfo) SetActiveCounty(v string) *CompanyInfo {
	s.ActiveCounty = &v
	return s
}

func (s *CompanyInfo) SetActiveProvince(v string) *CompanyInfo {
	s.ActiveProvince = &v
	return s
}

func (s *CompanyInfo) SetCategories(v string) *CompanyInfo {
	s.Categories = &v
	return s
}

func (s *CompanyInfo) SetCheckDate(v string) *CompanyInfo {
	s.CheckDate = &v
	return s
}

func (s *CompanyInfo) SetDelFlag(v string) *CompanyInfo {
	s.DelFlag = &v
	return s
}

func (s *CompanyInfo) SetDt(v string) *CompanyInfo {
	s.Dt = &v
	return s
}

func (s *CompanyInfo) SetFormerOrgNames(v string) *CompanyInfo {
	s.FormerOrgNames = &v
	return s
}

func (s *CompanyInfo) SetHeadOffice(v string) *CompanyInfo {
	s.HeadOffice = &v
	return s
}

func (s *CompanyInfo) SetId(v int64) *CompanyInfo {
	s.Id = &v
	return s
}

func (s *CompanyInfo) SetInvolvedAmount(v int64) *CompanyInfo {
	s.InvolvedAmount = &v
	return s
}

func (s *CompanyInfo) SetInvolvedPeople(v int64) *CompanyInfo {
	s.InvolvedPeople = &v
	return s
}

func (s *CompanyInfo) SetKeyRelaOrgs(v string) *CompanyInfo {
	s.KeyRelaOrgs = &v
	return s
}

func (s *CompanyInfo) SetLegalRepresentative(v string) *CompanyInfo {
	s.LegalRepresentative = &v
	return s
}

func (s *CompanyInfo) SetMctOneId(v string) *CompanyInfo {
	s.MctOneId = &v
	return s
}

func (s *CompanyInfo) SetOperatingAddrJson(v string) *CompanyInfo {
	s.OperatingAddrJson = &v
	return s
}

func (s *CompanyInfo) SetOperatingCity(v string) *CompanyInfo {
	s.OperatingCity = &v
	return s
}

func (s *CompanyInfo) SetOperatingCounty(v string) *CompanyInfo {
	s.OperatingCounty = &v
	return s
}

func (s *CompanyInfo) SetOperatingPlace(v string) *CompanyInfo {
	s.OperatingPlace = &v
	return s
}

func (s *CompanyInfo) SetOperatingProvince(v string) *CompanyInfo {
	s.OperatingProvince = &v
	return s
}

func (s *CompanyInfo) SetOprtActvState(v string) *CompanyInfo {
	s.OprtActvState = &v
	return s
}

func (s *CompanyInfo) SetOprtEndDate(v string) *CompanyInfo {
	s.OprtEndDate = &v
	return s
}

func (s *CompanyInfo) SetOprtScope(v string) *CompanyInfo {
	s.OprtScope = &v
	return s
}

func (s *CompanyInfo) SetOprtStartDate(v string) *CompanyInfo {
	s.OprtStartDate = &v
	return s
}

func (s *CompanyInfo) SetOpType(v string) *CompanyInfo {
	s.OpType = &v
	return s
}

func (s *CompanyInfo) SetOrgCode(v string) *CompanyInfo {
	s.OrgCode = &v
	return s
}

func (s *CompanyInfo) SetOrgEmail(v string) *CompanyInfo {
	s.OrgEmail = &v
	return s
}

func (s *CompanyInfo) SetOrgName(v string) *CompanyInfo {
	s.OrgName = &v
	return s
}

func (s *CompanyInfo) SetOrgRegCptlRmb(v string) *CompanyInfo {
	s.OrgRegCptlRmb = &v
	return s
}

func (s *CompanyInfo) SetOrgState(v string) *CompanyInfo {
	s.OrgState = &v
	return s
}

func (s *CompanyInfo) SetOrgTel(v string) *CompanyInfo {
	s.OrgTel = &v
	return s
}

func (s *CompanyInfo) SetOrgType(v string) *CompanyInfo {
	s.OrgType = &v
	return s
}

func (s *CompanyInfo) SetPlatform(v string) *CompanyInfo {
	s.Platform = &v
	return s
}

func (s *CompanyInfo) SetPlatformName(v string) *CompanyInfo {
	s.PlatformName = &v
	return s
}

func (s *CompanyInfo) SetPlatformStates(v string) *CompanyInfo {
	s.PlatformStates = &v
	return s
}

func (s *CompanyInfo) SetRegisterCapitalCurrency(v string) *CompanyInfo {
	s.RegisterCapitalCurrency = &v
	return s
}

func (s *CompanyInfo) SetRegisterCapitalValue(v string) *CompanyInfo {
	s.RegisterCapitalValue = &v
	return s
}

func (s *CompanyInfo) SetRegisterCity(v string) *CompanyInfo {
	s.RegisterCity = &v
	return s
}

func (s *CompanyInfo) SetRegisterCounty(v string) *CompanyInfo {
	s.RegisterCounty = &v
	return s
}

func (s *CompanyInfo) SetRegisterDate(v string) *CompanyInfo {
	s.RegisterDate = &v
	return s
}

func (s *CompanyInfo) SetRegisterPlace(v string) *CompanyInfo {
	s.RegisterPlace = &v
	return s
}

func (s *CompanyInfo) SetRegisterProvince(v string) *CompanyInfo {
	s.RegisterProvince = &v
	return s
}

func (s *CompanyInfo) SetRegistrationAuthority(v string) *CompanyInfo {
	s.RegistrationAuthority = &v
	return s
}

func (s *CompanyInfo) SetRegNo(v string) *CompanyInfo {
	s.RegNo = &v
	return s
}

func (s *CompanyInfo) SetRiskstormCompanyId(v string) *CompanyInfo {
	s.RiskstormCompanyId = &v
	return s
}

func (s *CompanyInfo) SetRiskFactors(v string) *CompanyInfo {
	s.RiskFactors = &v
	return s
}

func (s *CompanyInfo) SetRiskGraphJson(v string) *CompanyInfo {
	s.RiskGraphJson = &v
	return s
}

func (s *CompanyInfo) SetRiskMessage(v string) *CompanyInfo {
	s.RiskMessage = &v
	return s
}

func (s *CompanyInfo) SetRiskScore(v int64) *CompanyInfo {
	s.RiskScore = &v
	return s
}

func (s *CompanyInfo) SetRiskScoreTrend(v string) *CompanyInfo {
	s.RiskScoreTrend = &v
	return s
}

func (s *CompanyInfo) SetRiskScoreWeeklyFloat(v int64) *CompanyInfo {
	s.RiskScoreWeeklyFloat = &v
	return s
}

func (s *CompanyInfo) SetRiskTags(v string) *CompanyInfo {
	s.RiskTags = &v
	return s
}

func (s *CompanyInfo) SetRiskTagsId(v string) *CompanyInfo {
	s.RiskTagsId = &v
	return s
}

func (s *CompanyInfo) SetRiskType(v string) *CompanyInfo {
	s.RiskType = &v
	return s
}

func (s *CompanyInfo) SetSearchContent(v string) *CompanyInfo {
	s.SearchContent = &v
	return s
}

func (s *CompanyInfo) SetSpreadNumber(v int64) *CompanyInfo {
	s.SpreadNumber = &v
	return s
}

func (s *CompanyInfo) SetSpreadNumDistribution(v string) *CompanyInfo {
	s.SpreadNumDistribution = &v
	return s
}

func (s *CompanyInfo) SetUcCode(v string) *CompanyInfo {
	s.UcCode = &v
	return s
}

func (s *CompanyInfo) SetUpdateDate(v string) *CompanyInfo {
	s.UpdateDate = &v
	return s
}

// 标签信息
type RiskLabelInfo struct {
	// 线索明细类型(字段停用)
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty" require:"true"`
	// odps数据产出时间，冗余字段，业务上不需要，以备错误排查
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty"`
	// 数据产生时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 记录唯一ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 0-正常 1-删除
	IsDeleted *int64 `json:"is_deleted,omitempty" xml:"is_deleted,omitempty" require:"true"`
	// 企业ID
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 操作人ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作类型
	// add、delete、update
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 线索类型
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 风险维度
	//
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索概览
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty" require:"true"`
	// 线索明细
	TagClueDetail *string `json:"tag_clue_detail,omitempty" xml:"tag_clue_detail,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	//
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 趋势图表名
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
	// 数据同步到公有云时间(业务上赋值当天)
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s RiskLabelInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelInfo) SetClueDetailType(v string) *RiskLabelInfo {
	s.ClueDetailType = &v
	return s
}

func (s *RiskLabelInfo) SetDt(v string) *RiskLabelInfo {
	s.Dt = &v
	return s
}

func (s *RiskLabelInfo) SetGmtCreate(v string) *RiskLabelInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelInfo) SetId(v int64) *RiskLabelInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelInfo) SetIsDeleted(v int64) *RiskLabelInfo {
	s.IsDeleted = &v
	return s
}

func (s *RiskLabelInfo) SetMctOneId(v string) *RiskLabelInfo {
	s.MctOneId = &v
	return s
}

func (s *RiskLabelInfo) SetOperatorId(v string) *RiskLabelInfo {
	s.OperatorId = &v
	return s
}

func (s *RiskLabelInfo) SetOpType(v string) *RiskLabelInfo {
	s.OpType = &v
	return s
}

func (s *RiskLabelInfo) SetOrgName(v string) *RiskLabelInfo {
	s.OrgName = &v
	return s
}

func (s *RiskLabelInfo) SetRiskDetailType(v string) *RiskLabelInfo {
	s.RiskDetailType = &v
	return s
}

func (s *RiskLabelInfo) SetRiskDimensionType(v string) *RiskLabelInfo {
	s.RiskDimensionType = &v
	return s
}

func (s *RiskLabelInfo) SetTagClue(v string) *RiskLabelInfo {
	s.TagClue = &v
	return s
}

func (s *RiskLabelInfo) SetTagClueDetail(v string) *RiskLabelInfo {
	s.TagClueDetail = &v
	return s
}

func (s *RiskLabelInfo) SetTagId(v string) *RiskLabelInfo {
	s.TagId = &v
	return s
}

func (s *RiskLabelInfo) SetTagListHeaders(v string) *RiskLabelInfo {
	s.TagListHeaders = &v
	return s
}

func (s *RiskLabelInfo) SetTagListOrderColumn(v string) *RiskLabelInfo {
	s.TagListOrderColumn = &v
	return s
}

func (s *RiskLabelInfo) SetTagListOrderType(v string) *RiskLabelInfo {
	s.TagListOrderType = &v
	return s
}

func (s *RiskLabelInfo) SetTagText(v string) *RiskLabelInfo {
	s.TagText = &v
	return s
}

func (s *RiskLabelInfo) SetTagTrendChartName(v string) *RiskLabelInfo {
	s.TagTrendChartName = &v
	return s
}

func (s *RiskLabelInfo) SetUpdateDate(v string) *RiskLabelInfo {
	s.UpdateDate = &v
	return s
}

// 标签配置全量信息
type RiskLabelConfigInfo struct {
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 标记删除
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 操作人ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 线索类型
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 风险维度
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 趋势图表名
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
}

func (s RiskLabelConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelConfigInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelConfigInfo) SetGmtCreate(v string) *RiskLabelConfigInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelConfigInfo) SetGmtModified(v string) *RiskLabelConfigInfo {
	s.GmtModified = &v
	return s
}

func (s *RiskLabelConfigInfo) SetId(v int64) *RiskLabelConfigInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelConfigInfo) SetIsDelete(v int64) *RiskLabelConfigInfo {
	s.IsDelete = &v
	return s
}

func (s *RiskLabelConfigInfo) SetOperatorId(v string) *RiskLabelConfigInfo {
	s.OperatorId = &v
	return s
}

func (s *RiskLabelConfigInfo) SetRiskDetailType(v string) *RiskLabelConfigInfo {
	s.RiskDetailType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetRiskDimensionType(v string) *RiskLabelConfigInfo {
	s.RiskDimensionType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagId(v string) *RiskLabelConfigInfo {
	s.TagId = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListHeaders(v string) *RiskLabelConfigInfo {
	s.TagListHeaders = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListOrderColumn(v string) *RiskLabelConfigInfo {
	s.TagListOrderColumn = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListOrderType(v string) *RiskLabelConfigInfo {
	s.TagListOrderType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagText(v string) *RiskLabelConfigInfo {
	s.TagText = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagTrendChartName(v string) *RiskLabelConfigInfo {
	s.TagTrendChartName = &v
	return s
}

// 风报接口返回结构体
type RtopCompanyRiskInfo struct {
	// 企业唯一id
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty"`
	// 组织机构代码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty"`
	// 企业名
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 区域
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 区域类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 工商注册号
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty"`
	// 风险评分
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险变化程度排序，根据分值波动大小，标签变更次数排序
	RiskShiftRank *string `json:"risk_shift_rank,omitempty" xml:"risk_shift_rank,omitempty"`
	// 风险标签id列表
	RiskTagsId []*string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" type:"Repeated"`
	// 风险定性
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty"`
	// 线索
	TagsClue *string `json:"tags_clue,omitempty" xml:"tags_clue,omitempty"`
	// 风险线索明细
	TagsClueDetail *string `json:"tags_clue_detail,omitempty" xml:"tags_clue_detail,omitempty"`
	// 企业统一社会信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
}

func (s RtopCompanyRiskInfo) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyRiskInfo) GoString() string {
	return s.String()
}

func (s *RtopCompanyRiskInfo) SetMctOneId(v string) *RtopCompanyRiskInfo {
	s.MctOneId = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetOrgCode(v string) *RtopCompanyRiskInfo {
	s.OrgCode = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetOrgName(v string) *RtopCompanyRiskInfo {
	s.OrgName = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetPlaceName(v string) *RtopCompanyRiskInfo {
	s.PlaceName = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetPlaceType(v string) *RtopCompanyRiskInfo {
	s.PlaceType = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRegNo(v string) *RtopCompanyRiskInfo {
	s.RegNo = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskScore(v string) *RtopCompanyRiskInfo {
	s.RiskScore = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskShiftRank(v string) *RtopCompanyRiskInfo {
	s.RiskShiftRank = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskTagsId(v []*string) *RtopCompanyRiskInfo {
	s.RiskTagsId = v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskType(v string) *RtopCompanyRiskInfo {
	s.RiskType = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetTagsClue(v string) *RtopCompanyRiskInfo {
	s.TagsClue = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetTagsClueDetail(v string) *RtopCompanyRiskInfo {
	s.TagsClueDetail = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetUcCode(v string) *RtopCompanyRiskInfo {
	s.UcCode = &v
	return s
}

// 服务上下文包括环境信息和用户信息
type ServiceContext struct {
	// 客户端IP
	ClientIp *string `json:"client_ip,omitempty" xml:"client_ip,omitempty"`
	// 客户端UMID
	ClientPcidguid *string `json:"client_pcidguid,omitempty" xml:"client_pcidguid,omitempty"`
	// 服务器名
	ServerName *string `json:"server_name,omitempty" xml:"server_name,omitempty"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ServiceContext) String() string {
	return tea.Prettify(s)
}

func (s ServiceContext) GoString() string {
	return s.String()
}

func (s *ServiceContext) SetClientIp(v string) *ServiceContext {
	s.ClientIp = &v
	return s
}

func (s *ServiceContext) SetClientPcidguid(v string) *ServiceContext {
	s.ClientPcidguid = &v
	return s
}

func (s *ServiceContext) SetServerName(v string) *ServiceContext {
	s.ServerName = &v
	return s
}

func (s *ServiceContext) SetSessionId(v string) *ServiceContext {
	s.SessionId = &v
	return s
}

func (s *ServiceContext) SetUserId(v string) *ServiceContext {
	s.UserId = &v
	return s
}

// 企业影响人数性别分布统计
type RtopGenderDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 性别
	Gender *string `json:"gender,omitempty" xml:"gender,omitempty" require:"true"`
}

func (s RtopGenderDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopGenderDistribution) GoString() string {
	return s.String()
}

func (s *RtopGenderDistribution) SetCount(v int) *RtopGenderDistribution {
	s.Count = &v
	return s
}

func (s *RtopGenderDistribution) SetGender(v string) *RtopGenderDistribution {
	s.Gender = &v
	return s
}

// zhima.customer.ep.identification.query
// 在认证完成后,商户可以查询认证的状态和结果
//
type ZhimaQueryResp struct {
	// 认证的企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 认证的企业名
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty"`
	// 认证不通过的错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证是否通过，通过为true，不通过为false
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	//  10000是成功，其余是失败
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	//
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	//
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	//
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s ZhimaQueryResp) String() string {
	return tea.Prettify(s)
}

func (s ZhimaQueryResp) GoString() string {
	return s.String()
}

func (s *ZhimaQueryResp) SetEpCertNo(v string) *ZhimaQueryResp {
	s.EpCertNo = &v
	return s
}

func (s *ZhimaQueryResp) SetEpName(v string) *ZhimaQueryResp {
	s.EpName = &v
	return s
}

func (s *ZhimaQueryResp) SetFailedCode(v string) *ZhimaQueryResp {
	s.FailedCode = &v
	return s
}

func (s *ZhimaQueryResp) SetPassed(v string) *ZhimaQueryResp {
	s.Passed = &v
	return s
}

func (s *ZhimaQueryResp) SetResultCode(v string) *ZhimaQueryResp {
	s.ResultCode = &v
	return s
}

func (s *ZhimaQueryResp) SetResultMsg(v string) *ZhimaQueryResp {
	s.ResultMsg = &v
	return s
}

func (s *ZhimaQueryResp) SetSubCode(v string) *ZhimaQueryResp {
	s.SubCode = &v
	return s
}

func (s *ZhimaQueryResp) SetSubMsg(v string) *ZhimaQueryResp {
	s.SubMsg = &v
	return s
}

// 全局动态中的企业
type RtopRiskyCompany struct {
	// 异动程度
	ChangeLevel *string `json:"change_level,omitempty" xml:"change_level,omitempty" require:"true"`
	// 异动分数
	ChangeScore *string `json:"change_score,omitempty" xml:"change_score,omitempty" require:"true"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 数据的时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
	// 总公司注册地
	HeadRegisterPlace *string `json:"head_register_place,omitempty" xml:"head_register_place,omitempty" require:"true"`
	// 新增企业的时间
	NewAddedTime *string `json:"new_added_time,omitempty" xml:"new_added_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s RtopRiskyCompany) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskyCompany) GoString() string {
	return s.String()
}

func (s *RtopRiskyCompany) SetChangeLevel(v string) *RtopRiskyCompany {
	s.ChangeLevel = &v
	return s
}

func (s *RtopRiskyCompany) SetChangeScore(v string) *RtopRiskyCompany {
	s.ChangeScore = &v
	return s
}

func (s *RtopRiskyCompany) SetCompanyId(v string) *RtopRiskyCompany {
	s.CompanyId = &v
	return s
}

func (s *RtopRiskyCompany) SetDataTime(v string) *RtopRiskyCompany {
	s.DataTime = &v
	return s
}

func (s *RtopRiskyCompany) SetHeadRegisterPlace(v string) *RtopRiskyCompany {
	s.HeadRegisterPlace = &v
	return s
}

func (s *RtopRiskyCompany) SetNewAddedTime(v string) *RtopRiskyCompany {
	s.NewAddedTime = &v
	return s
}

// 企业影响人数分布统计
type RtopPopulationDistribution struct {
	// 市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopPopulationDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopPopulationDistribution) GoString() string {
	return s.String()
}

func (s *RtopPopulationDistribution) SetCity(v string) *RtopPopulationDistribution {
	s.City = &v
	return s
}

func (s *RtopPopulationDistribution) SetCount(v int) *RtopPopulationDistribution {
	s.Count = &v
	return s
}

// 预警企业
type RtopCompanyAlarm struct {
	// 预警日期
	AlarmDate *string `json:"alarm_date,omitempty" xml:"alarm_date,omitempty" require:"true"`
	// 预警标识，是否需要预警
	AlarmFlag *string `json:"alarm_flag,omitempty" xml:"alarm_flag,omitempty" require:"true"`
	// 预警序号
	AlarmIdx *string `json:"alarm_idx,omitempty" xml:"alarm_idx,omitempty" require:"true"`
	// 预警类型
	AlarmType *string `json:"alarm_type,omitempty" xml:"alarm_type,omitempty" require:"true"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s RtopCompanyAlarm) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyAlarm) GoString() string {
	return s.String()
}

func (s *RtopCompanyAlarm) SetAlarmDate(v string) *RtopCompanyAlarm {
	s.AlarmDate = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmFlag(v string) *RtopCompanyAlarm {
	s.AlarmFlag = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmIdx(v string) *RtopCompanyAlarm {
	s.AlarmIdx = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmType(v string) *RtopCompanyAlarm {
	s.AlarmType = &v
	return s
}

func (s *RtopCompanyAlarm) SetCompanyId(v string) *RtopCompanyAlarm {
	s.CompanyId = &v
	return s
}

// 企业反馈
type RtopCompanyFeedback struct {
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty" require:"true"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 反馈原因
	FeedbackReason *string `json:"feedback_reason,omitempty" xml:"feedback_reason,omitempty" require:"true"`
	// 反馈原因详情
	FeedbackReasonDetail *string `json:"feedback_reason_detail,omitempty" xml:"feedback_reason_detail,omitempty" require:"true"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s RtopCompanyFeedback) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyFeedback) GoString() string {
	return s.String()
}

func (s *RtopCompanyFeedback) SetComment(v string) *RtopCompanyFeedback {
	s.Comment = &v
	return s
}

func (s *RtopCompanyFeedback) SetCompanyId(v string) *RtopCompanyFeedback {
	s.CompanyId = &v
	return s
}

func (s *RtopCompanyFeedback) SetFeedbackReason(v string) *RtopCompanyFeedback {
	s.FeedbackReason = &v
	return s
}

func (s *RtopCompanyFeedback) SetFeedbackReasonDetail(v string) *RtopCompanyFeedback {
	s.FeedbackReasonDetail = &v
	return s
}

func (s *RtopCompanyFeedback) SetId(v int64) *RtopCompanyFeedback {
	s.Id = &v
	return s
}

// 风险维度
type RtopCompanyRiskFactor struct {
	// 维度名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 维度分数
	Score *int64 `json:"score,omitempty" xml:"score,omitempty"`
}

func (s RtopCompanyRiskFactor) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyRiskFactor) GoString() string {
	return s.String()
}

func (s *RtopCompanyRiskFactor) SetName(v string) *RtopCompanyRiskFactor {
	s.Name = &v
	return s
}

func (s *RtopCompanyRiskFactor) SetScore(v int64) *RtopCompanyRiskFactor {
	s.Score = &v
	return s
}

// 企业年报信息
type RtopRiskStormCompanyAnnualReport struct {
	// 年报个数
	AnnualReportCount *int `json:"annual_report_count,omitempty" xml:"annual_report_count,omitempty"`
	// 年报是否发生股权转让
	AnnualReportHasEquityTransfer *bool `json:"annual_report_has_equity_transfer,omitempty" xml:"annual_report_has_equity_transfer,omitempty"`
	// 年报是否对外提供担保
	AnnualReportHasExternalGuarantee *bool `json:"annual_report_has_external_guarantee,omitempty" xml:"annual_report_has_external_guarantee,omitempty"`
	// 年报是否对外投资
	AnnualReportHasExternalInvest *bool `json:"annual_report_has_external_invest,omitempty" xml:"annual_report_has_external_invest,omitempty"`
	// 营业总收入中主营业务收入
	AnnualReportMainBusinessIncome *string `json:"annual_report_main_business_income,omitempty" xml:"annual_report_main_business_income,omitempty"`
	// 年报净利润
	AnnualReportNetProfit *string `json:"annual_report_net_profit,omitempty" xml:"annual_report_net_profit,omitempty"`
	// 年报发布日期
	AnnualReportReleaseDate *string `json:"annual_report_release_date,omitempty" xml:"annual_report_release_date,omitempty"`
	// 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
	AnnualReportShActualPaid *string `json:"annual_report_sh_actual_paid,omitempty" xml:"annual_report_sh_actual_paid,omitempty"`
	// 年报公司人数
	AnnualReportStaffCount *int `json:"annual_report_staff_count,omitempty" xml:"annual_report_staff_count,omitempty"`
	// 资产总额
	AnnualReportTotalAssets *string `json:"annual_report_total_assets,omitempty" xml:"annual_report_total_assets,omitempty"`
	// 负债总额
	AnnualReportTotalLiabilities *string `json:"annual_report_total_liabilities,omitempty" xml:"annual_report_total_liabilities,omitempty"`
	// 营业总收入
	AnnualReportTotalOperatingIncome *string `json:"annual_report_total_operating_income,omitempty" xml:"annual_report_total_operating_income,omitempty"`
	// 年报所有者权益合计
	AnnualReportTotalOwnerEquity *string `json:"annual_report_total_owner_equity,omitempty" xml:"annual_report_total_owner_equity,omitempty"`
	// 年报利润总额
	AnnualReportTotalProfit *string `json:"annual_report_total_profit,omitempty" xml:"annual_report_total_profit,omitempty"`
	// 纳税总额
	AnnualReportTotalTax *string `json:"annual_report_total_tax,omitempty" xml:"annual_report_total_tax,omitempty"`
	// 年报报送年度
	AnnualReportYear *string `json:"annual_report_year,omitempty" xml:"annual_report_year,omitempty"`
}

func (s RtopRiskStormCompanyAnnualReport) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskStormCompanyAnnualReport) GoString() string {
	return s.String()
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportCount(v int) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportCount = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasEquityTransfer(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasEquityTransfer = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasExternalGuarantee(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasExternalGuarantee = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasExternalInvest(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasExternalInvest = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportMainBusinessIncome(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportMainBusinessIncome = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportNetProfit(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportNetProfit = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportReleaseDate(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportReleaseDate = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportShActualPaid(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportShActualPaid = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportStaffCount(v int) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportStaffCount = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalAssets(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalAssets = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalLiabilities(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalLiabilities = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalOperatingIncome(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalOperatingIncome = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalOwnerEquity(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalOwnerEquity = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalProfit(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalProfit = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalTax(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalTax = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportYear(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportYear = &v
	return s
}

// 企业日期趋势统计
type RtopDateDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 年龄
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s RtopDateDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopDateDistribution) GoString() string {
	return s.String()
}

func (s *RtopDateDistribution) SetCount(v int) *RtopDateDistribution {
	s.Count = &v
	return s
}

func (s *RtopDateDistribution) SetDate(v string) *RtopDateDistribution {
	s.Date = &v
	return s
}

// 舆情的详情
type RtopCompanyOpinionDetail struct {
	// 具体的舆情内容
	DocContent *string `json:"doc_content,omitempty" xml:"doc_content,omitempty" require:"true"`
	// 舆情的id
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
	// 舆情的标题
	DocTitle *string `json:"doc_title,omitempty" xml:"doc_title,omitempty" require:"true"`
	// 舆情的url
	DocUrl *string `json:"doc_url,omitempty" xml:"doc_url,omitempty" require:"true"`
	// 情感得分
	EmotionScore *string `json:"emotion_score,omitempty" xml:"emotion_score,omitempty"`
	// 实体相关度得分
	EntityRelevancyScore *string `json:"entity_relevancy_score,omitempty" xml:"entity_relevancy_score,omitempty"`
	// 命中的关键词
	HitKeywords *string `json:"hit_keywords,omitempty" xml:"hit_keywords,omitempty"`
	// 媒体影响力得分
	MediaInfluenceScore *string `json:"media_influence_score,omitempty" xml:"media_influence_score,omitempty"`
	// 来源媒体
	MediaName *string `json:"media_name,omitempty" xml:"media_name,omitempty" require:"true"`
	// 媒体传播得分
	MediaPropagationScore *string `json:"media_propagation_score,omitempty" xml:"media_propagation_score,omitempty"`
	// 舆情的发布时间
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 相似文章数
	SimilarDocs *int `json:"similar_docs,omitempty" xml:"similar_docs,omitempty"`
}

func (s RtopCompanyOpinionDetail) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyOpinionDetail) GoString() string {
	return s.String()
}

func (s *RtopCompanyOpinionDetail) SetDocContent(v string) *RtopCompanyOpinionDetail {
	s.DocContent = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocId(v string) *RtopCompanyOpinionDetail {
	s.DocId = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocTitle(v string) *RtopCompanyOpinionDetail {
	s.DocTitle = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocUrl(v string) *RtopCompanyOpinionDetail {
	s.DocUrl = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetEmotionScore(v string) *RtopCompanyOpinionDetail {
	s.EmotionScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetEntityRelevancyScore(v string) *RtopCompanyOpinionDetail {
	s.EntityRelevancyScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetHitKeywords(v string) *RtopCompanyOpinionDetail {
	s.HitKeywords = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaInfluenceScore(v string) *RtopCompanyOpinionDetail {
	s.MediaInfluenceScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaName(v string) *RtopCompanyOpinionDetail {
	s.MediaName = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaPropagationScore(v string) *RtopCompanyOpinionDetail {
	s.MediaPropagationScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetPublishTime(v string) *RtopCompanyOpinionDetail {
	s.PublishTime = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetSimilarDocs(v int) *RtopCompanyOpinionDetail {
	s.SimilarDocs = &v
	return s
}

// 策略详情
type StrategyDetails struct {
	// 决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 策略id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s StrategyDetails) String() string {
	return tea.Prettify(s)
}

func (s StrategyDetails) GoString() string {
	return s.String()
}

func (s *StrategyDetails) SetDecision(v string) *StrategyDetails {
	s.Decision = &v
	return s
}

func (s *StrategyDetails) SetId(v string) *StrategyDetails {
	s.Id = &v
	return s
}

func (s *StrategyDetails) SetName(v string) *StrategyDetails {
	s.Name = &v
	return s
}

func (s *StrategyDetails) SetSceneCode(v string) *StrategyDetails {
	s.SceneCode = &v
	return s
}

// 通用响应结构体
type RpcommonResp struct {
	// 具体返回值.jsonString形式
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 结果码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty" require:"true"`
	// 结果描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 调用是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s RpcommonResp) String() string {
	return tea.Prettify(s)
}

func (s RpcommonResp) GoString() string {
	return s.String()
}

func (s *RpcommonResp) SetData(v string) *RpcommonResp {
	s.Data = &v
	return s
}

func (s *RpcommonResp) SetResponseCode(v string) *RpcommonResp {
	s.ResponseCode = &v
	return s
}

func (s *RpcommonResp) SetResultMsg(v string) *RpcommonResp {
	s.ResultMsg = &v
	return s
}

func (s *RpcommonResp) SetSuccess(v bool) *RpcommonResp {
	s.Success = &v
	return s
}

// 风报风险标签统计
type RiskStormLabelResp struct {
	// 标签次数
	LabelCount *int `json:"label_count,omitempty" xml:"label_count,omitempty" require:"true"`
	// 标签id
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 标签名称
	LabelName *string `json:"label_name,omitempty" xml:"label_name,omitempty" require:"true"`
}

func (s RiskStormLabelResp) String() string {
	return tea.Prettify(s)
}

func (s RiskStormLabelResp) GoString() string {
	return s.String()
}

func (s *RiskStormLabelResp) SetLabelCount(v int) *RiskStormLabelResp {
	s.LabelCount = &v
	return s
}

func (s *RiskStormLabelResp) SetLabelId(v string) *RiskStormLabelResp {
	s.LabelId = &v
	return s
}

func (s *RiskStormLabelResp) SetLabelName(v string) *RiskStormLabelResp {
	s.LabelName = &v
	return s
}

// 模型结果详情
//
type ModelDetails struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该风险场景的风险分值
	//
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s ModelDetails) String() string {
	return tea.Prettify(s)
}

func (s ModelDetails) GoString() string {
	return s.String()
}

func (s *ModelDetails) SetSceneCode(v string) *ModelDetails {
	s.SceneCode = &v
	return s
}

func (s *ModelDetails) SetScore(v string) *ModelDetails {
	s.Score = &v
	return s
}

// 芝麻四要素认证接口
type ZhimaIdentifyResp struct {
	// 唯一ID，接口正常的话有此字段
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 带参数的回调地址，接口正常的话有此字段
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
	// 蚂蚁调用芝麻的错误码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 蚂蚁调用芝麻的结果描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 蚂蚁调用芝麻的错误码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 蚂蚁调用芝麻信息
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s ZhimaIdentifyResp) String() string {
	return tea.Prettify(s)
}

func (s ZhimaIdentifyResp) GoString() string {
	return s.String()
}

func (s *ZhimaIdentifyResp) SetBizNo(v string) *ZhimaIdentifyResp {
	s.BizNo = &v
	return s
}

func (s *ZhimaIdentifyResp) SetCertifyUrl(v string) *ZhimaIdentifyResp {
	s.CertifyUrl = &v
	return s
}

func (s *ZhimaIdentifyResp) SetResultCode(v string) *ZhimaIdentifyResp {
	s.ResultCode = &v
	return s
}

func (s *ZhimaIdentifyResp) SetResultMsg(v string) *ZhimaIdentifyResp {
	s.ResultMsg = &v
	return s
}

func (s *ZhimaIdentifyResp) SetSubCode(v string) *ZhimaIdentifyResp {
	s.SubCode = &v
	return s
}

func (s *ZhimaIdentifyResp) SetSubMsg(v string) *ZhimaIdentifyResp {
	s.SubMsg = &v
	return s
}

// 涉众风险企业特征
type RtopCrowdRiskFeatureResp struct {
	// 特征标签列表
	ClueTags []*RtopCrowdRiskFeatureTag `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 特征名称
	FeatureName *string `json:"feature_name,omitempty" xml:"feature_name,omitempty" require:"true"`
	// 特征​分数
	Score *int `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s RtopCrowdRiskFeatureResp) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskFeatureResp) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskFeatureResp) SetClueTags(v []*RtopCrowdRiskFeatureTag) *RtopCrowdRiskFeatureResp {
	s.ClueTags = v
	return s
}

func (s *RtopCrowdRiskFeatureResp) SetFeatureName(v string) *RtopCrowdRiskFeatureResp {
	s.FeatureName = &v
	return s
}

func (s *RtopCrowdRiskFeatureResp) SetScore(v int) *RtopCrowdRiskFeatureResp {
	s.Score = &v
	return s
}

// 企业涉众风险详细信息
type RtopCrowdRiskSummaryResp struct {
	// 活跃市
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty"`
	// 活跃县
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty"`
	// 活跃省
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty"`
	// 风险标签
	ClueTags []*string `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 风险等级
	CrowdRiskLevel *string `json:"crowd_risk_level,omitempty" xml:"crowd_risk_level,omitempty"`
	// 涉众风险分数
	CrowdRiskScore *int64 `json:"crowd_risk_score,omitempty" xml:"crowd_risk_score,omitempty"`
	// 涉众风险类型
	CrowdRiskType *string `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty"`
	// 发现时间
	DetectedTime *string `json:"detected_time,omitempty" xml:"detected_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 影响金额
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 影响人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
	// 注册市
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty"`
	// 注册县
	RegisteredCounty *string `json:"registered_county,omitempty" xml:"registered_county,omitempty"`
	// 注册省
	RegisteredProvince *string `json:"registered_province,omitempty" xml:"registered_province,omitempty"`
}

func (s RtopCrowdRiskSummaryResp) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskSummaryResp) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskSummaryResp) SetActiveCity(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveCity = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetActiveCounty(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveCounty = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetActiveProvince(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveProvince = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetClueTags(v []*string) *RtopCrowdRiskSummaryResp {
	s.ClueTags = v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCompanyId(v string) *RtopCrowdRiskSummaryResp {
	s.CompanyId = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCompanyName(v string) *RtopCrowdRiskSummaryResp {
	s.CompanyName = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskLevel(v string) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskLevel = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskScore(v int64) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskScore = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskType(v string) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskType = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetDetectedTime(v string) *RtopCrowdRiskSummaryResp {
	s.DetectedTime = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetMoneyInvolved(v int64) *RtopCrowdRiskSummaryResp {
	s.MoneyInvolved = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetPeopleInvolved(v int64) *RtopCrowdRiskSummaryResp {
	s.PeopleInvolved = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredCity(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredCity = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredCounty(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredCounty = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredProvince(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredProvince = &v
	return s
}

// 标签过滤配置
type RiskLabelFilterConfigInfo struct {
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 是否为基本筛选标签
	IsBase *int64 `json:"is_base,omitempty" xml:"is_base,omitempty" require:"true"`
	// 标记删除
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 操作人员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 地区名
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
}

func (s RiskLabelFilterConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelFilterConfigInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelFilterConfigInfo) SetGmtCreate(v string) *RiskLabelFilterConfigInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetGmtModified(v string) *RiskLabelFilterConfigInfo {
	s.GmtModified = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetId(v int64) *RiskLabelFilterConfigInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetIsBase(v int64) *RiskLabelFilterConfigInfo {
	s.IsBase = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetIsDelete(v int64) *RiskLabelFilterConfigInfo {
	s.IsDelete = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetOperatorId(v string) *RiskLabelFilterConfigInfo {
	s.OperatorId = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetPlaceName(v string) *RiskLabelFilterConfigInfo {
	s.PlaceName = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetPlaceType(v string) *RiskLabelFilterConfigInfo {
	s.PlaceType = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetTagId(v string) *RiskLabelFilterConfigInfo {
	s.TagId = &v
	return s
}

// 收藏的企业信息
type RtopStarCompanyInfo struct {
	// 行业
	Categories []*string `json:"categories,omitempty" xml:"categories,omitempty" type:"Repeated"`
	// 经营地址
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty"`
	// 经营省份
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 风险线索
	RiskTagDetails []*RtopRiskTag `json:"risk_tag_details,omitempty" xml:"risk_tag_details,omitempty" type:"Repeated"`
	// 风险标签Id集合
	RiskTagIds []*string `json:"risk_tag_ids,omitempty" xml:"risk_tag_ids,omitempty" type:"Repeated"`
	// 统一社会信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
}

func (s RtopStarCompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s RtopStarCompanyInfo) GoString() string {
	return s.String()
}

func (s *RtopStarCompanyInfo) SetCategories(v []*string) *RtopStarCompanyInfo {
	s.Categories = v
	return s
}

func (s *RtopStarCompanyInfo) SetOperatingPlace(v string) *RtopStarCompanyInfo {
	s.OperatingPlace = &v
	return s
}

func (s *RtopStarCompanyInfo) SetOperatingProvince(v string) *RtopStarCompanyInfo {
	s.OperatingProvince = &v
	return s
}

func (s *RtopStarCompanyInfo) SetOrgName(v string) *RtopStarCompanyInfo {
	s.OrgName = &v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskScore(v int64) *RtopStarCompanyInfo {
	s.RiskScore = &v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTags(v []*string) *RtopStarCompanyInfo {
	s.RiskTags = v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTagDetails(v []*RtopRiskTag) *RtopStarCompanyInfo {
	s.RiskTagDetails = v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTagIds(v []*string) *RtopStarCompanyInfo {
	s.RiskTagIds = v
	return s
}

func (s *RtopStarCompanyInfo) SetUcCode(v string) *RtopStarCompanyInfo {
	s.UcCode = &v
	return s
}

// 标签图片
type RtopTagImage struct {
	// 标签图片表主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 图片
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
}

func (s RtopTagImage) String() string {
	return tea.Prettify(s)
}

func (s RtopTagImage) GoString() string {
	return s.String()
}

func (s *RtopTagImage) SetId(v int64) *RtopTagImage {
	s.Id = &v
	return s
}

func (s *RtopTagImage) SetImage(v string) *RtopTagImage {
	s.Image = &v
	return s
}

// 风险基因-点
type RtopRiskGeneNode struct {
	// 主企业唯一ID
	MainCompanyId *string `json:"main_company_id,omitempty" xml:"main_company_id,omitempty"`
	// 主企业名称
	MainCompanyName *string `json:"main_company_name,omitempty" xml:"main_company_name,omitempty"`
	// 节点证件号码
	NodeCertNo *string `json:"node_cert_no,omitempty" xml:"node_cert_no,omitempty"`
	// 节点扩展信息
	NodeExtJson *string `json:"node_ext_json,omitempty" xml:"node_ext_json,omitempty"`
	// 节点唯一ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
	// 节点名称
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty"`
	// 节点类型，枚举值
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty"`
	// 基因模式
	RiskLabel *string `json:"risk_label,omitempty" xml:"risk_label,omitempty"`
	// 基因模式
	RiskMode *string `json:"risk_mode,omitempty" xml:"risk_mode,omitempty"`
}

func (s RtopRiskGeneNode) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskGeneNode) GoString() string {
	return s.String()
}

func (s *RtopRiskGeneNode) SetMainCompanyId(v string) *RtopRiskGeneNode {
	s.MainCompanyId = &v
	return s
}

func (s *RtopRiskGeneNode) SetMainCompanyName(v string) *RtopRiskGeneNode {
	s.MainCompanyName = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeCertNo(v string) *RtopRiskGeneNode {
	s.NodeCertNo = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeExtJson(v string) *RtopRiskGeneNode {
	s.NodeExtJson = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeId(v string) *RtopRiskGeneNode {
	s.NodeId = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeName(v string) *RtopRiskGeneNode {
	s.NodeName = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeType(v string) *RtopRiskGeneNode {
	s.NodeType = &v
	return s
}

func (s *RtopRiskGeneNode) SetRiskLabel(v string) *RtopRiskGeneNode {
	s.RiskLabel = &v
	return s
}

func (s *RtopRiskGeneNode) SetRiskMode(v string) *RtopRiskGeneNode {
	s.RiskMode = &v
	return s
}

// 监测企业的特征信息
type RtopMonitorCompanyFeature struct {
	// 特征的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 特征的名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 特征里的风险标签列表
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 特征的评分
	Score *int `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s RtopMonitorCompanyFeature) String() string {
	return tea.Prettify(s)
}

func (s RtopMonitorCompanyFeature) GoString() string {
	return s.String()
}

func (s *RtopMonitorCompanyFeature) SetDescription(v string) *RtopMonitorCompanyFeature {
	s.Description = &v
	return s
}

func (s *RtopMonitorCompanyFeature) SetName(v string) *RtopMonitorCompanyFeature {
	s.Name = &v
	return s
}

func (s *RtopMonitorCompanyFeature) SetRiskTags(v []*string) *RtopMonitorCompanyFeature {
	s.RiskTags = v
	return s
}

func (s *RtopMonitorCompanyFeature) SetScore(v int) *RtopMonitorCompanyFeature {
	s.Score = &v
	return s
}

type QuerySecurityPolicyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险类型：表示风险处理或风险咨询——process/advice
	RiskType       *string         `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	SecurityScene  *SecurityScene  `json:"security_scene,omitempty" xml:"security_scene,omitempty" require:"true"`
	ServiceContext *ServiceContext `json:"service_context,omitempty" xml:"service_context,omitempty" require:"true"`
}

func (s QuerySecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityPolicyRequest) SetAuthToken(v string) *QuerySecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetProductInstanceId(v string) *QuerySecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetRiskType(v string) *QuerySecurityPolicyRequest {
	s.RiskType = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetSecurityScene(v *SecurityScene) *QuerySecurityPolicyRequest {
	s.SecurityScene = v
	return s
}

func (s *QuerySecurityPolicyRequest) SetServiceContext(v *ServiceContext) *QuerySecurityPolicyRequest {
	s.ServiceContext = v
	return s
}

type QuerySecurityPolicyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险咨询情况下返回的风险等级，风险处理不会返回该值
	Level *int `json:"level,omitempty" xml:"level,omitempty"`
	// 反馈成功之后的id
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
	SecurityResult *string `json:"security_result,omitempty" xml:"security_result,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 有风险需要失败业务情况下的返回码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 有风险需要失败业务情况下的返回码描述
	TemplateDesc *string `json:"template_desc,omitempty" xml:"template_desc,omitempty"`
	// native场景下的核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// h5场景下的核身地址
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QuerySecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityPolicyResponse) SetReqMsgId(v string) *QuerySecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetResultCode(v string) *QuerySecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetResultMsg(v string) *QuerySecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetLevel(v int) *QuerySecurityPolicyResponse {
	s.Level = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSecurityId(v string) *QuerySecurityPolicyResponse {
	s.SecurityId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSecurityResult(v string) *QuerySecurityPolicyResponse {
	s.SecurityResult = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSuccess(v string) *QuerySecurityPolicyResponse {
	s.Success = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetTemplateCode(v string) *QuerySecurityPolicyResponse {
	s.TemplateCode = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetTemplateDesc(v string) *QuerySecurityPolicyResponse {
	s.TemplateDesc = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetVerifyId(v string) *QuerySecurityPolicyResponse {
	s.VerifyId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetVerifyUrl(v string) *QuerySecurityPolicyResponse {
	s.VerifyUrl = &v
	return s
}

type SendSecurityDataRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 安全累计属性列表字段，安全属性列表
	SecurityContent *string `json:"security_content,omitempty" xml:"security_content,omitempty" require:"true"`
	// 代码发送给安全核心的事件编码
	SecuritySign *string `json:"security_sign,omitempty" xml:"security_sign,omitempty" require:"true"`
}

func (s SendSecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s SendSecurityDataRequest) GoString() string {
	return s.String()
}

func (s *SendSecurityDataRequest) SetAuthToken(v string) *SendSecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *SendSecurityDataRequest) SetProductInstanceId(v string) *SendSecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendSecurityDataRequest) SetSecurityContent(v string) *SendSecurityDataRequest {
	s.SecurityContent = &v
	return s
}

func (s *SendSecurityDataRequest) SetSecuritySign(v string) *SendSecurityDataRequest {
	s.SecuritySign = &v
	return s
}

type SendSecurityDataResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s SendSecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s SendSecurityDataResponse) GoString() string {
	return s.String()
}

func (s *SendSecurityDataResponse) SetReqMsgId(v string) *SendSecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendSecurityDataResponse) SetResultCode(v string) *SendSecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *SendSecurityDataResponse) SetResultMsg(v string) *SendSecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendSecurityDataResponse) SetSuccess(v string) *SendSecurityDataResponse {
	s.Success = &v
	return s
}

type ConfirmSecurityPolicyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二次确认参数，防止篡改
	ConfirmParams *string `json:"confirm_params,omitempty" xml:"confirm_params,omitempty" require:"true"`
	// 代码发送给安全核心的事件编码
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty" require:"true"`
}

func (s ConfirmSecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *ConfirmSecurityPolicyRequest) SetAuthToken(v string) *ConfirmSecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetProductInstanceId(v string) *ConfirmSecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetConfirmParams(v string) *ConfirmSecurityPolicyRequest {
	s.ConfirmParams = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetSecurityId(v string) *ConfirmSecurityPolicyRequest {
	s.SecurityId = &v
	return s
}

type ConfirmSecurityPolicyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s ConfirmSecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *ConfirmSecurityPolicyResponse) SetReqMsgId(v string) *ConfirmSecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetResultCode(v string) *ConfirmSecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetResultMsg(v string) *ConfirmSecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetSuccess(v string) *ConfirmSecurityPolicyResponse {
	s.Success = &v
	return s
}

type CheckSecurityRdsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 输入大字段，具体见接入文档
	RdsContent *string `json:"rds_content,omitempty" xml:"rds_content,omitempty" require:"true"`
}

func (s CheckSecurityRdsRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityRdsRequest) GoString() string {
	return s.String()
}

func (s *CheckSecurityRdsRequest) SetAuthToken(v string) *CheckSecurityRdsRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSecurityRdsRequest) SetProductInstanceId(v string) *CheckSecurityRdsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSecurityRdsRequest) SetRdsContent(v string) *CheckSecurityRdsRequest {
	s.RdsContent = &v
	return s
}

type CheckSecurityRdsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Result *int `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s CheckSecurityRdsResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityRdsResponse) GoString() string {
	return s.String()
}

func (s *CheckSecurityRdsResponse) SetReqMsgId(v string) *CheckSecurityRdsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResultCode(v string) *CheckSecurityRdsResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResultMsg(v string) *CheckSecurityRdsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResult(v int) *CheckSecurityRdsResponse {
	s.Result = &v
	return s
}

type QuerySecurityDataRequest struct {
	AuthToken         *string                    `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string                    `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ReqInfo           []*SecurityDataQueryStruct `json:"req_info,omitempty" xml:"req_info,omitempty" require:"true" type:"Repeated"`
}

func (s QuerySecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityDataRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityDataRequest) SetAuthToken(v string) *QuerySecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityDataRequest) SetProductInstanceId(v string) *QuerySecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityDataRequest) SetReqInfo(v []*SecurityDataQueryStruct) *QuerySecurityDataRequest {
	s.ReqInfo = v
	return s
}

type QuerySecurityDataResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s QuerySecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityDataResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityDataResponse) SetReqMsgId(v string) *QuerySecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityDataResponse) SetResultCode(v string) *QuerySecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityDataResponse) SetResultMsg(v string) *QuerySecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityDataResponse) SetSuccess(v string) *QuerySecurityDataResponse {
	s.Success = &v
	return s
}

type CheckSecurityDataRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参为Map转换后的String
	ReqInfo *string `json:"req_info,omitempty" xml:"req_info,omitempty" require:"true"`
}

func (s CheckSecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityDataRequest) GoString() string {
	return s.String()
}

func (s *CheckSecurityDataRequest) SetAuthToken(v string) *CheckSecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSecurityDataRequest) SetProductInstanceId(v string) *CheckSecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSecurityDataRequest) SetReqInfo(v string) *CheckSecurityDataRequest {
	s.ReqInfo = &v
	return s
}

type CheckSecurityDataResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code表示状态，message为提示，data为返回结果
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s CheckSecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityDataResponse) GoString() string {
	return s.String()
}

func (s *CheckSecurityDataResponse) SetReqMsgId(v string) *CheckSecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResultCode(v string) *CheckSecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResultMsg(v string) *CheckSecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResponse(v string) *CheckSecurityDataResponse {
	s.Response = &v
	return s
}

type VerifyFinserviceZhimaIdentifyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要校验的人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 需要校验的人身份证号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 认证结束后的商户回调地址。
	MerchantUrl *string `json:"merchant_url,omitempty" xml:"merchant_url,omitempty" require:"true"`
}

func (s VerifyFinserviceZhimaIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFinserviceZhimaIdentifyRequest) GoString() string {
	return s.String()
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetAuthToken(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetProductInstanceId(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetLegalPersonCertName(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetLegalPersonCertNo(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetMerchantUrl(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.MerchantUrl = &v
	return s
}

type VerifyFinserviceZhimaIdentifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
	Data *ZhimaIdentifyResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyFinserviceZhimaIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFinserviceZhimaIdentifyResponse) GoString() string {
	return s.String()
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetReqMsgId(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetResultCode(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetResultMsg(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetData(v *ZhimaIdentifyResp) *VerifyFinserviceZhimaIdentifyResponse {
	s.Data = v
	return s
}

type QueryFinserviceZhimaIdentifyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 初始化时候返回的唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryFinserviceZhimaIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFinserviceZhimaIdentifyRequest) GoString() string {
	return s.String()
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetAuthToken(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetProductInstanceId(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetBizNo(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.BizNo = &v
	return s
}

type QueryFinserviceZhimaIdentifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	Data *ZhimaQueryResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFinserviceZhimaIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFinserviceZhimaIdentifyResponse) GoString() string {
	return s.String()
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetReqMsgId(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetResultCode(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetResultMsg(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetData(v *ZhimaQueryResp) *QueryFinserviceZhimaIdentifyResponse {
	s.Data = v
	return s
}

type QueryRbbGenericInvokeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"platformId":1234,"method":"riskQuery"}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 账号的所有权限点，逗号分隔
	Permission *string `json:"permission,omitempty" xml:"permission,omitempty" require:"true"`
	// 标题备用
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s QueryRbbGenericInvokeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGenericInvokeRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbGenericInvokeRequest) SetAuthToken(v string) *QueryRbbGenericInvokeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetProductInstanceId(v string) *QueryRbbGenericInvokeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetContent(v string) *QueryRbbGenericInvokeRequest {
	s.Content = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetPermission(v string) *QueryRbbGenericInvokeRequest {
	s.Permission = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetTitle(v string) *QueryRbbGenericInvokeRequest {
	s.Title = &v
	return s
}

type QueryRbbGenericInvokeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据内容
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRbbGenericInvokeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGenericInvokeResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbGenericInvokeResponse) SetReqMsgId(v string) *QueryRbbGenericInvokeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetResultCode(v string) *QueryRbbGenericInvokeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetResultMsg(v string) *QueryRbbGenericInvokeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetData(v string) *QueryRbbGenericInvokeResponse {
	s.Data = &v
	return s
}

type CreateRbbTokenRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展字段
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 新人用户密码，用来做映射生成token
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 用户
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
}

func (s CreateRbbTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbTokenRequest) SetAuthToken(v string) *CreateRbbTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbTokenRequest) SetProductInstanceId(v string) *CreateRbbTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbTokenRequest) SetContent(v string) *CreateRbbTokenRequest {
	s.Content = &v
	return s
}

func (s *CreateRbbTokenRequest) SetPassword(v string) *CreateRbbTokenRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbTokenRequest) SetUsername(v string) *CreateRbbTokenRequest {
	s.Username = &v
	return s
}

type CreateRbbTokenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateRbbTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbTokenResponse) SetReqMsgId(v string) *CreateRbbTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbTokenResponse) SetResultCode(v string) *CreateRbbTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbTokenResponse) SetResultMsg(v string) *CreateRbbTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRbbTokenResponse) SetData(v string) *CreateRbbTokenResponse {
	s.Data = &v
	return s
}

type CreateRbbApiGwtokenRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 新人用户密码，用来做映射生成token
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 用户
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
}

func (s CreateRbbApiGwtokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbApiGwtokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbApiGwtokenRequest) SetAuthToken(v string) *CreateRbbApiGwtokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetProductInstanceId(v string) *CreateRbbApiGwtokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetExtension(v string) *CreateRbbApiGwtokenRequest {
	s.Extension = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetPassword(v string) *CreateRbbApiGwtokenRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetUsername(v string) *CreateRbbApiGwtokenRequest {
	s.Username = &v
	return s
}

type CreateRbbApiGwtokenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回登录token
	Logintoken *string `json:"logintoken,omitempty" xml:"logintoken,omitempty"`
}

func (s CreateRbbApiGwtokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbApiGwtokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbApiGwtokenResponse) SetReqMsgId(v string) *CreateRbbApiGwtokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetResultCode(v string) *CreateRbbApiGwtokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetResultMsg(v string) *CreateRbbApiGwtokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetLogintoken(v string) *CreateRbbApiGwtokenResponse {
	s.Logintoken = &v
	return s
}

type QueryRbbGeneralRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 额外参数json
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 通用查询名称
	Queryname *string `json:"queryname,omitempty" xml:"queryname,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 查询参数JSON字符串
	Queryparas *string `json:"queryparas,omitempty" xml:"queryparas,omitempty"`
}

func (s QueryRbbGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGeneralRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbGeneralRequest) SetAuthToken(v string) *QueryRbbGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetProductInstanceId(v string) *QueryRbbGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetExtension(v string) *QueryRbbGeneralRequest {
	s.Extension = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetQueryname(v string) *QueryRbbGeneralRequest {
	s.Queryname = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetQueryparas(v string) *QueryRbbGeneralRequest {
	s.Queryparas = &v
	return s
}

type QueryRbbGeneralResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串表示的通用查询结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRbbGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGeneralResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbGeneralResponse) SetReqMsgId(v string) *QueryRbbGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetResultCode(v string) *QueryRbbGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetResultMsg(v string) *QueryRbbGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetData(v string) *QueryRbbGeneralResponse {
	s.Data = &v
	return s
}

type GetRbbLoginTokenRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展json字符串
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 用户名
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
}

func (s GetRbbLoginTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRbbLoginTokenRequest) GoString() string {
	return s.String()
}

func (s *GetRbbLoginTokenRequest) SetAuthToken(v string) *GetRbbLoginTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetProductInstanceId(v string) *GetRbbLoginTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetExtension(v string) *GetRbbLoginTokenRequest {
	s.Extension = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetPassword(v string) *GetRbbLoginTokenRequest {
	s.Password = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetUsername(v string) *GetRbbLoginTokenRequest {
	s.Username = &v
	return s
}

type GetRbbLoginTokenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登录token，5分钟有效
	Logintoken *string `json:"logintoken,omitempty" xml:"logintoken,omitempty"`
}

func (s GetRbbLoginTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRbbLoginTokenResponse) GoString() string {
	return s.String()
}

func (s *GetRbbLoginTokenResponse) SetReqMsgId(v string) *GetRbbLoginTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetResultCode(v string) *GetRbbLoginTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetResultMsg(v string) *GetRbbLoginTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetLogintoken(v string) *GetRbbLoginTokenResponse {
	s.Logintoken = &v
	return s
}

type CreateRbbTenantRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户过期时间，不填表示永不过期
	EffectiveEndDate *string `json:"effective_end_date,omitempty" xml:"effective_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 租户编码，必须全局唯一
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true" maxLength:"64" minLength:"2"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true" maxLength:"64" minLength:"2"`
	// 租户自定义属性，JSON格式，可以为空
	TenantPropertyJson *string `json:"tenant_property_json,omitempty" xml:"tenant_property_json,omitempty"`
}

func (s CreateRbbTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTenantRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbTenantRequest) SetAuthToken(v string) *CreateRbbTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbTenantRequest) SetProductInstanceId(v string) *CreateRbbTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbTenantRequest) SetEffectiveEndDate(v string) *CreateRbbTenantRequest {
	s.EffectiveEndDate = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantCode(v string) *CreateRbbTenantRequest {
	s.TenantCode = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantName(v string) *CreateRbbTenantRequest {
	s.TenantName = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantPropertyJson(v string) *CreateRbbTenantRequest {
	s.TenantPropertyJson = &v
	return s
}

type CreateRbbTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateRbbTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTenantResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbTenantResponse) SetReqMsgId(v string) *CreateRbbTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbTenantResponse) SetResultCode(v string) *CreateRbbTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbTenantResponse) SetResultMsg(v string) *CreateRbbTenantResponse {
	s.ResultMsg = &v
	return s
}

type CreateRbbUserRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户邮箱，非必填
	Email *string `json:"email,omitempty" xml:"email,omitempty" maxLength:"128" minLength:"3"`
	// 用户姓名、真实名称，不要求全局唯一
	FullName *string `json:"full_name,omitempty" xml:"full_name,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 用户密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true" maxLength:"200" minLength:"8"`
	// 用户电话号码，非必填
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" maxLength:"64" minLength:"4"`
	// 用户所属租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" maxLength:"64" minLength:"2"`
	// 用户名，必须全局唯一
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户属性扩展字段，json格式，可以为空
	UserPropertyJson *string `json:"user_property_json,omitempty" xml:"user_property_json,omitempty"`
}

func (s CreateRbbUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbUserRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbUserRequest) SetAuthToken(v string) *CreateRbbUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbUserRequest) SetProductInstanceId(v string) *CreateRbbUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbUserRequest) SetEmail(v string) *CreateRbbUserRequest {
	s.Email = &v
	return s
}

func (s *CreateRbbUserRequest) SetFullName(v string) *CreateRbbUserRequest {
	s.FullName = &v
	return s
}

func (s *CreateRbbUserRequest) SetPassword(v string) *CreateRbbUserRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbUserRequest) SetPhone(v string) *CreateRbbUserRequest {
	s.Phone = &v
	return s
}

func (s *CreateRbbUserRequest) SetTenantCode(v string) *CreateRbbUserRequest {
	s.TenantCode = &v
	return s
}

func (s *CreateRbbUserRequest) SetUserName(v string) *CreateRbbUserRequest {
	s.UserName = &v
	return s
}

func (s *CreateRbbUserRequest) SetUserPropertyJson(v string) *CreateRbbUserRequest {
	s.UserPropertyJson = &v
	return s
}

type CreateRbbUserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateRbbUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbUserResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbUserResponse) SetReqMsgId(v string) *CreateRbbUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbUserResponse) SetResultCode(v string) *CreateRbbUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbUserResponse) SetResultMsg(v string) *CreateRbbUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryRtopCompanyOpinionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s QueryRtopCompanyOpinionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyOpinionRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyOpinionRequest) SetAuthToken(v string) *QueryRtopCompanyOpinionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetProductInstanceId(v string) *QueryRtopCompanyOpinionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetEndTime(v string) *QueryRtopCompanyOpinionRequest {
	s.EndTime = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPageNum(v int64) *QueryRtopCompanyOpinionRequest {
	s.PageNum = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPageSize(v int64) *QueryRtopCompanyOpinionRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPlaceName(v string) *QueryRtopCompanyOpinionRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPlaceType(v string) *QueryRtopCompanyOpinionRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetStartTime(v string) *QueryRtopCompanyOpinionRequest {
	s.StartTime = &v
	return s
}

type QueryRtopCompanyOpinionResponse struct {
	ReqMsgId            *string                    `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode          *string                    `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg           *string                    `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	CompanyOpinionCount []*RtopCompanyOpinionCount `json:"company_opinion_count,omitempty" xml:"company_opinion_count,omitempty" require:"true" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryRtopCompanyOpinionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyOpinionResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyOpinionResponse) SetReqMsgId(v string) *QueryRtopCompanyOpinionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetResultCode(v string) *QueryRtopCompanyOpinionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetResultMsg(v string) *QueryRtopCompanyOpinionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetCompanyOpinionCount(v []*RtopCompanyOpinionCount) *QueryRtopCompanyOpinionResponse {
	s.CompanyOpinionCount = v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetPageNum(v int64) *QueryRtopCompanyOpinionResponse {
	s.PageNum = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetPageSize(v int64) *QueryRtopCompanyOpinionResponse {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetTotalCount(v int64) *QueryRtopCompanyOpinionResponse {
	s.TotalCount = &v
	return s
}

type ListRtopCompanyOpinionsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地区类型
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListRtopCompanyOpinionsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyOpinionsRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyOpinionsRequest) SetAuthToken(v string) *ListRtopCompanyOpinionsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetProductInstanceId(v string) *ListRtopCompanyOpinionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetCompanyName(v string) *ListRtopCompanyOpinionsRequest {
	s.CompanyName = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetPageNum(v int64) *ListRtopCompanyOpinionsRequest {
	s.PageNum = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetPageSize(v int64) *ListRtopCompanyOpinionsRequest {
	s.PageSize = &v
	return s
}

type ListRtopCompanyOpinionsResponse struct {
	ReqMsgId              *string                     `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode            *string                     `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg             *string                     `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	CompanyOpinionDetails []*RtopCompanyOpinionDetail `json:"company_opinion_details,omitempty" xml:"company_opinion_details,omitempty" require:"true" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s ListRtopCompanyOpinionsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyOpinionsResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyOpinionsResponse) SetReqMsgId(v string) *ListRtopCompanyOpinionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetResultCode(v string) *ListRtopCompanyOpinionsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetResultMsg(v string) *ListRtopCompanyOpinionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetCompanyOpinionDetails(v []*RtopCompanyOpinionDetail) *ListRtopCompanyOpinionsResponse {
	s.CompanyOpinionDetails = v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetPageNum(v int64) *ListRtopCompanyOpinionsResponse {
	s.PageNum = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetPageSize(v int64) *ListRtopCompanyOpinionsResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetTotalCount(v int64) *ListRtopCompanyOpinionsResponse {
	s.TotalCount = &v
	return s
}

type GetRtopCompanyMonitorRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地区类型
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
}

func (s GetRtopCompanyMonitorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyMonitorRequest) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyMonitorRequest) SetAuthToken(v string) *GetRtopCompanyMonitorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRtopCompanyMonitorRequest) SetProductInstanceId(v string) *GetRtopCompanyMonitorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRtopCompanyMonitorRequest) SetCompanyName(v string) *GetRtopCompanyMonitorRequest {
	s.CompanyName = &v
	return s
}

type GetRtopCompanyMonitorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活跃市，不带国家和地区的代码
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty" require:"true"`
	// 监测企业的行业
	CompanyCategory *string `json:"company_category,omitempty" xml:"company_category,omitempty"`
	// 涉众风险类型
	CrowdRiskType *string                      `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty" require:"true"`
	Features      []*RtopMonitorCompanyFeature `json:"features,omitempty" xml:"features,omitempty" require:"true" type:"Repeated"`
	// 影响金额
	MoneyInvolved   *int64    `json:"money_involved,omitempty" xml:"money_involved,omitempty" require:"true"`
	MonitorRiskTags []*string `json:"monitor_risk_tags,omitempty" xml:"monitor_risk_tags,omitempty" require:"true" type:"Repeated"`
	// 监测企业的评分
	MonitorScore *int64 `json:"monitor_score,omitempty" xml:"monitor_score,omitempty" require:"true"`
	// 影响人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty" require:"true"`
	// 注册市，不带国家和地区的代码
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty" require:"true"`
}

func (s GetRtopCompanyMonitorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyMonitorResponse) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyMonitorResponse) SetReqMsgId(v string) *GetRtopCompanyMonitorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetResultCode(v string) *GetRtopCompanyMonitorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetResultMsg(v string) *GetRtopCompanyMonitorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetActiveCity(v string) *GetRtopCompanyMonitorResponse {
	s.ActiveCity = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetCompanyCategory(v string) *GetRtopCompanyMonitorResponse {
	s.CompanyCategory = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetCrowdRiskType(v string) *GetRtopCompanyMonitorResponse {
	s.CrowdRiskType = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetFeatures(v []*RtopMonitorCompanyFeature) *GetRtopCompanyMonitorResponse {
	s.Features = v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMoneyInvolved(v int64) *GetRtopCompanyMonitorResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMonitorRiskTags(v []*string) *GetRtopCompanyMonitorResponse {
	s.MonitorRiskTags = v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMonitorScore(v int64) *GetRtopCompanyMonitorResponse {
	s.MonitorScore = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetPeopleInvolved(v int64) *GetRtopCompanyMonitorResponse {
	s.PeopleInvolved = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetRegisteredCity(v string) *GetRtopCompanyMonitorResponse {
	s.RegisteredCity = &v
	return s
}

type QueryRtopCrowdriskStatisticRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s QueryRtopCrowdriskStatisticRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskStatisticRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskStatisticRequest) SetAuthToken(v string) *QueryRtopCrowdriskStatisticRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskStatisticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetEndTime(v string) *QueryRtopCrowdriskStatisticRequest {
	s.EndTime = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetPlaceName(v string) *QueryRtopCrowdriskStatisticRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetPlaceType(v string) *QueryRtopCrowdriskStatisticRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetStartTime(v string) *QueryRtopCrowdriskStatisticRequest {
	s.StartTime = &v
	return s
}

type QueryRtopCrowdriskStatisticResponse struct {
	ReqMsgId          *string                  `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode        *string                  `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg         *string                  `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	LevelDistribution []*RtopLevelDistribution `json:"level_distribution,omitempty" xml:"level_distribution,omitempty" type:"Repeated"`
	// 按地区统计
	RegionDistribution []*RtopRegionalDistribution `json:"region_distribution,omitempty" xml:"region_distribution,omitempty" type:"Repeated"`
	TypeDistribution   []*RtopTypeDistribution     `json:"type_distribution,omitempty" xml:"type_distribution,omitempty" type:"Repeated"`
}

func (s QueryRtopCrowdriskStatisticResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskStatisticResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskStatisticResponse) SetReqMsgId(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetResultCode(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetResultMsg(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetLevelDistribution(v []*RtopLevelDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.LevelDistribution = v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetRegionDistribution(v []*RtopRegionalDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.RegionDistribution = v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetTypeDistribution(v []*RtopTypeDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.TypeDistribution = v
	return s
}

type ListRtopCrowdriskRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活跃地筛选
	ActivePlaces []*string `json:"active_places,omitempty" xml:"active_places,omitempty" type:"Repeated"`
	// 风险等级
	CrowdRiskLevels []*string `json:"crowd_risk_levels,omitempty" xml:"crowd_risk_levels,omitempty" type:"Repeated"`
	// 风险类型
	CrowdRiskTypes []*string `json:"crowd_risk_types,omitempty" xml:"crowd_risk_types,omitempty" type:"Repeated"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 注册地筛选
	RegPlaces []*string `json:"reg_places,omitempty" xml:"reg_places,omitempty" type:"Repeated"`
	// 排序字段
	SortBy *string `json:"sort_by,omitempty" xml:"sort_by,omitempty"`
	// 排序方式
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s ListRtopCrowdriskRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCrowdriskRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCrowdriskRequest) SetAuthToken(v string) *ListRtopCrowdriskRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetProductInstanceId(v string) *ListRtopCrowdriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetActivePlaces(v []*string) *ListRtopCrowdriskRequest {
	s.ActivePlaces = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetCrowdRiskLevels(v []*string) *ListRtopCrowdriskRequest {
	s.CrowdRiskLevels = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetCrowdRiskTypes(v []*string) *ListRtopCrowdriskRequest {
	s.CrowdRiskTypes = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetEndTime(v string) *ListRtopCrowdriskRequest {
	s.EndTime = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPageNum(v int64) *ListRtopCrowdriskRequest {
	s.PageNum = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPageSize(v int64) *ListRtopCrowdriskRequest {
	s.PageSize = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPlaceName(v string) *ListRtopCrowdriskRequest {
	s.PlaceName = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPlaceType(v string) *ListRtopCrowdriskRequest {
	s.PlaceType = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetRegPlaces(v []*string) *ListRtopCrowdriskRequest {
	s.RegPlaces = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetSortBy(v string) *ListRtopCrowdriskRequest {
	s.SortBy = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetSortType(v string) *ListRtopCrowdriskRequest {
	s.SortType = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetStartTime(v string) *ListRtopCrowdriskRequest {
	s.StartTime = &v
	return s
}

type ListRtopCrowdriskResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	Companys []*RtopCrowdRiskSummaryResp `json:"companys,omitempty" xml:"companys,omitempty" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ListRtopCrowdriskResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCrowdriskResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCrowdriskResponse) SetReqMsgId(v string) *ListRtopCrowdriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetResultCode(v string) *ListRtopCrowdriskResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetResultMsg(v string) *ListRtopCrowdriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetCompanys(v []*RtopCrowdRiskSummaryResp) *ListRtopCrowdriskResponse {
	s.Companys = v
	return s
}

func (s *ListRtopCrowdriskResponse) SetPageNum(v int64) *ListRtopCrowdriskResponse {
	s.PageNum = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetPageSize(v int64) *ListRtopCrowdriskResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetTotalCount(v int64) *ListRtopCrowdriskResponse {
	s.TotalCount = &v
	return s
}

type QueryRtopCrowdriskDetailRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
}

func (s QueryRtopCrowdriskDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskDetailRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskDetailRequest) SetAuthToken(v string) *QueryRtopCrowdriskDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetCompanyId(v string) *QueryRtopCrowdriskDetailRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetPlaceName(v string) *QueryRtopCrowdriskDetailRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetPlaceType(v string) *QueryRtopCrowdriskDetailRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopCrowdriskDetailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活跃市
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty"`
	// 活跃县
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty"`
	// 活跃省
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty"`
	// 年龄分布
	AgeDistribution []*RtopAgeDistribution `json:"age_distribution,omitempty" xml:"age_distribution,omitempty" type:"Repeated"`
	// 线索标签
	ClueTags []*string `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 报文
	Conclusion *string `json:"conclusion,omitempty" xml:"conclusion,omitempty"`
	// 风险等级
	CrowdRiskLevel *string `json:"crowd_risk_level,omitempty" xml:"crowd_risk_level,omitempty"`
	// 涉众风险分析的分数
	CrowdRiskScore *int64 `json:"crowd_risk_score,omitempty" xml:"crowd_risk_score,omitempty"`
	// 风险类型
	CrowdRiskType *string `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty"`
	// 发现时间
	DetectedTime *string `json:"detected_time,omitempty" xml:"detected_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 特征
	Features []*RtopCrowdRiskFeatureResp `json:"features,omitempty" xml:"features,omitempty" type:"Repeated"`
	// 性别分布
	GenderDistribution []*RtopGenderDistribution `json:"gender_distribution,omitempty" xml:"gender_distribution,omitempty" type:"Repeated"`
	// 上次活跃时间
	LastActiveTime *string `json:"last_active_time,omitempty" xml:"last_active_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 涉案金额
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 影响金额的历史曲线
	MoneyInvolvedHistory []*RtopDateDistribution `json:"money_involved_history,omitempty" xml:"money_involved_history,omitempty" type:"Repeated"`
	// 涉案人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
	// 影响人数的历史曲线
	PeopleInvolvedHistory []*RtopDateDistribution `json:"people_involved_history,omitempty" xml:"people_involved_history,omitempty" type:"Repeated"`
	// 影响的人数分布，key为地区城市，value为影响的人数
	PopulationDistribution []*RtopPopulationDistribution `json:"population_distribution,omitempty" xml:"population_distribution,omitempty" type:"Repeated"`
	// 注册市
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty"`
	// 注册县
	RegisteredCounty *string `json:"registered_county,omitempty" xml:"registered_county,omitempty"`
	// 注册省
	RegisteredProvince *string `json:"registered_province,omitempty" xml:"registered_province,omitempty"`
}

func (s QueryRtopCrowdriskDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskDetailResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskDetailResponse) SetReqMsgId(v string) *QueryRtopCrowdriskDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetResultCode(v string) *QueryRtopCrowdriskDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetResultMsg(v string) *QueryRtopCrowdriskDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveCity(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveCity = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveCounty(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveCounty = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveProvince(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveProvince = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetAgeDistribution(v []*RtopAgeDistribution) *QueryRtopCrowdriskDetailResponse {
	s.AgeDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetClueTags(v []*string) *QueryRtopCrowdriskDetailResponse {
	s.ClueTags = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetConclusion(v string) *QueryRtopCrowdriskDetailResponse {
	s.Conclusion = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskLevel(v string) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskLevel = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskScore(v int64) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskScore = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskType(v string) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskType = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetDetectedTime(v string) *QueryRtopCrowdriskDetailResponse {
	s.DetectedTime = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetFeatures(v []*RtopCrowdRiskFeatureResp) *QueryRtopCrowdriskDetailResponse {
	s.Features = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetGenderDistribution(v []*RtopGenderDistribution) *QueryRtopCrowdriskDetailResponse {
	s.GenderDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetLastActiveTime(v string) *QueryRtopCrowdriskDetailResponse {
	s.LastActiveTime = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetMoneyInvolved(v int64) *QueryRtopCrowdriskDetailResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetMoneyInvolvedHistory(v []*RtopDateDistribution) *QueryRtopCrowdriskDetailResponse {
	s.MoneyInvolvedHistory = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPeopleInvolved(v int64) *QueryRtopCrowdriskDetailResponse {
	s.PeopleInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPeopleInvolvedHistory(v []*RtopDateDistribution) *QueryRtopCrowdriskDetailResponse {
	s.PeopleInvolvedHistory = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPopulationDistribution(v []*RtopPopulationDistribution) *QueryRtopCrowdriskDetailResponse {
	s.PopulationDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredCity(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredCity = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredCounty(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredCounty = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredProvince(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredProvince = &v
	return s
}

type QueryRtopRiskstormRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryRtopRiskstormRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRiskstormRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRiskstormRequest) SetAuthToken(v string) *QueryRtopRiskstormRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetProductInstanceId(v string) *QueryRtopRiskstormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetCompanyId(v string) *QueryRtopRiskstormRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetType(v string) *QueryRtopRiskstormRequest {
	s.Type = &v
	return s
}

type QueryRtopRiskstormResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 年报数据
	AnnualReports []*RtopRiskStormCompanyAnnualReport `json:"annual_reports,omitempty" xml:"annual_reports,omitempty" type:"Repeated"`
	// 风险标签数据
	RiskLabels []*RiskStormLabelResp `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" type:"Repeated"`
}

func (s QueryRtopRiskstormResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRiskstormResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRiskstormResponse) SetReqMsgId(v string) *QueryRtopRiskstormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetResultCode(v string) *QueryRtopRiskstormResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetResultMsg(v string) *QueryRtopRiskstormResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetAnnualReports(v []*RtopRiskStormCompanyAnnualReport) *QueryRtopRiskstormResponse {
	s.AnnualReports = v
	return s
}

func (s *QueryRtopRiskstormResponse) SetRiskLabels(v []*RiskStormLabelResp) *QueryRtopRiskstormResponse {
	s.RiskLabels = v
	return s
}

type QueryRtopCrowdriskSumRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 指定的企业ID列表，企业ID数量不超过100个。
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" require:"true" type:"Repeated"`
	// 指定的地区名称，例如温州市、鹿城区等
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
}

func (s QueryRtopCrowdriskSumRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskSumRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskSumRequest) SetAuthToken(v string) *QueryRtopCrowdriskSumRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskSumRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetCompanyIds(v []*string) *QueryRtopCrowdriskSumRequest {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetPlaceName(v string) *QueryRtopCrowdriskSumRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetPlaceType(v string) *QueryRtopCrowdriskSumRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopCrowdriskSumResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询企业的影响金额之和
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 查询企业的影响人数之和
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
}

func (s QueryRtopCrowdriskSumResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskSumResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskSumResponse) SetReqMsgId(v string) *QueryRtopCrowdriskSumResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetResultCode(v string) *QueryRtopCrowdriskSumResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetResultMsg(v string) *QueryRtopCrowdriskSumResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetMoneyInvolved(v int64) *QueryRtopCrowdriskSumResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetPeopleInvolved(v int64) *QueryRtopCrowdriskSumResponse {
	s.PeopleInvolved = &v
	return s
}

type GetRtopCompanyDetailRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s GetRtopCompanyDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyDetailRequest) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyDetailRequest) SetAuthToken(v string) *GetRtopCompanyDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRtopCompanyDetailRequest) SetProductInstanceId(v string) *GetRtopCompanyDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRtopCompanyDetailRequest) SetCompanyId(v string) *GetRtopCompanyDetailRequest {
	s.CompanyId = &v
	return s
}

type GetRtopCompanyDetailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险维度特征
	RiskFeatures *string `json:"risk_features,omitempty" xml:"risk_features,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签列表
	RiskTags []*RtopRiskTag `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
}

func (s GetRtopCompanyDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyDetailResponse) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyDetailResponse) SetReqMsgId(v string) *GetRtopCompanyDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetResultCode(v string) *GetRtopCompanyDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetResultMsg(v string) *GetRtopCompanyDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskFeatures(v string) *GetRtopCompanyDetailResponse {
	s.RiskFeatures = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskScore(v int64) *GetRtopCompanyDetailResponse {
	s.RiskScore = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskTags(v []*RtopRiskTag) *GetRtopCompanyDetailResponse {
	s.RiskTags = v
	return s
}

type QueryRtopCompanyRiskinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户access key
	Ak *string `json:"ak,omitempty" xml:"ak,omitempty" require:"true"`
	// 业务场景 ""
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 预留字段
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 区域中文名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 区域类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 租户seceret key
	Sk *string `json:"sk,omitempty" xml:"sk,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskinfoRequest) SetAuthToken(v string) *QueryRtopCompanyRiskinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetAk(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Ak = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetBizType(v string) *QueryRtopCompanyRiskinfoRequest {
	s.BizType = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetMemo(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Memo = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetPlaceName(v string) *QueryRtopCompanyRiskinfoRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetPlaceType(v string) *QueryRtopCompanyRiskinfoRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetSk(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Sk = &v
	return s
}

type QueryRtopCompanyRiskinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	Data []*RtopCompanyRiskInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryRtopCompanyRiskinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskinfoResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetResultCode(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetResultMsg(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetData(v []*RtopCompanyRiskInfo) *QueryRtopCompanyRiskinfoResponse {
	s.Data = v
	return s
}

type ExecRtopGenericInvokeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"platformId":1234}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 这个账号的所有权限点，逗号分隔
	Permission *string `json:"permission,omitempty" xml:"permission,omitempty" require:"true"`
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s ExecRtopGenericInvokeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRtopGenericInvokeRequest) GoString() string {
	return s.String()
}

func (s *ExecRtopGenericInvokeRequest) SetAuthToken(v string) *ExecRtopGenericInvokeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetProductInstanceId(v string) *ExecRtopGenericInvokeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetContent(v string) *ExecRtopGenericInvokeRequest {
	s.Content = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetPermission(v string) *ExecRtopGenericInvokeRequest {
	s.Permission = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetTitle(v string) *ExecRtopGenericInvokeRequest {
	s.Title = &v
	return s
}

type ExecRtopGenericInvokeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// response_code
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否请求成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecRtopGenericInvokeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRtopGenericInvokeResponse) GoString() string {
	return s.String()
}

func (s *ExecRtopGenericInvokeResponse) SetReqMsgId(v string) *ExecRtopGenericInvokeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResultCode(v string) *ExecRtopGenericInvokeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResultMsg(v string) *ExecRtopGenericInvokeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetData(v string) *ExecRtopGenericInvokeResponse {
	s.Data = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResponseCode(v string) *ExecRtopGenericInvokeResponse {
	s.ResponseCode = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetSuccess(v bool) *ExecRtopGenericInvokeResponse {
	s.Success = &v
	return s
}

type CreateRtopTokenRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateRtopTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRtopTokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRtopTokenRequest) SetAuthToken(v string) *CreateRtopTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRtopTokenRequest) SetProductInstanceId(v string) *CreateRtopTokenRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateRtopTokenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 成功，失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRtopTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRtopTokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRtopTokenResponse) SetReqMsgId(v string) *CreateRtopTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResultCode(v string) *CreateRtopTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResultMsg(v string) *CreateRtopTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRtopTokenResponse) SetData(v string) *CreateRtopTokenResponse {
	s.Data = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResponseCode(v string) *CreateRtopTokenResponse {
	s.ResponseCode = &v
	return s
}

func (s *CreateRtopTokenResponse) SetSuccess(v bool) *CreateRtopTokenResponse {
	s.Success = &v
	return s
}

type QueryRtopRisklabelRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// mct_one_id  -- search after使用
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty"`
	// pageNo
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// pageSize
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// scroll_id
	ScrollId *string `json:"scroll_id,omitempty" xml:"scroll_id,omitempty"`
	// tag_id  -- search after使用
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty"`
	// 数据更新日期
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s QueryRtopRisklabelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelRequest) SetAuthToken(v string) *QueryRtopRisklabelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetProductInstanceId(v string) *QueryRtopRisklabelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetMctOneId(v string) *QueryRtopRisklabelRequest {
	s.MctOneId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetPageNo(v int64) *QueryRtopRisklabelRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetPageSize(v int64) *QueryRtopRisklabelRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetScrollId(v string) *QueryRtopRisklabelRequest {
	s.ScrollId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetTagId(v string) *QueryRtopRisklabelRequest {
	s.TagId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetUpdateDate(v string) *QueryRtopRisklabelRequest {
	s.UpdateDate = &v
	return s
}

type QueryRtopRisklabelResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 标签信息
	RiskLabelInfos []*RiskLabelInfo `json:"risk_label_infos,omitempty" xml:"risk_label_infos,omitempty" type:"Repeated"`
	// scroll_id
	ScrollId *string `json:"scroll_id,omitempty" xml:"scroll_id,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// total
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelResponse) SetReqMsgId(v string) *QueryRtopRisklabelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResultCode(v string) *QueryRtopRisklabelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResultMsg(v string) *QueryRtopRisklabelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResponseCode(v string) *QueryRtopRisklabelResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetRiskLabelInfos(v []*RiskLabelInfo) *QueryRtopRisklabelResponse {
	s.RiskLabelInfos = v
	return s
}

func (s *QueryRtopRisklabelResponse) SetScrollId(v string) *QueryRtopRisklabelResponse {
	s.ScrollId = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetSuccess(v bool) *QueryRtopRisklabelResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetTotal(v int64) *QueryRtopRisklabelResponse {
	s.Total = &v
	return s
}

type QueryRtopCompanyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司ID集合
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" require:"true" type:"Repeated"`
	// 数据同步到公有云时间(业务上赋值当天)
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s QueryRtopCompanyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRequest) SetAuthToken(v string) *QueryRtopCompanyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRequest) SetProductInstanceId(v string) *QueryRtopCompanyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRequest) SetCompanyIds(v []*string) *QueryRtopCompanyRequest {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCompanyRequest) SetUpdateDate(v string) *QueryRtopCompanyRequest {
	s.UpdateDate = &v
	return s
}

type QueryRtopCompanyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业信息列表
	CompanyInfos []*CompanyInfo `json:"company_infos,omitempty" xml:"company_infos,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRtopCompanyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyResponse) SetReqMsgId(v string) *QueryRtopCompanyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetResultCode(v string) *QueryRtopCompanyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetResultMsg(v string) *QueryRtopCompanyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetCompanyInfos(v []*CompanyInfo) *QueryRtopCompanyResponse {
	s.CompanyInfos = v
	return s
}

func (s *QueryRtopCompanyResponse) SetResponseCode(v string) *QueryRtopCompanyResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetSuccess(v bool) *QueryRtopCompanyResponse {
	s.Success = &v
	return s
}

type QueryRtopRisklabelFilterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// pageNo
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 成都市
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// CITY
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
}

func (s QueryRtopRisklabelFilterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelFilterRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelFilterRequest) SetAuthToken(v string) *QueryRtopRisklabelFilterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetProductInstanceId(v string) *QueryRtopRisklabelFilterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPageNo(v int64) *QueryRtopRisklabelFilterRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPageSize(v int64) *QueryRtopRisklabelFilterRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPlaceName(v string) *QueryRtopRisklabelFilterRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPlaceType(v string) *QueryRtopRisklabelFilterRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopRisklabelFilterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 标签配置全量信息
	RiskLabelFilterConfigInfo []*RiskLabelFilterConfigInfo `json:"risk_label_filter_config_info,omitempty" xml:"risk_label_filter_config_info,omitempty" type:"Repeated"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelFilterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelFilterResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelFilterResponse) SetReqMsgId(v string) *QueryRtopRisklabelFilterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResultCode(v string) *QueryRtopRisklabelFilterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResultMsg(v string) *QueryRtopRisklabelFilterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResponseCode(v string) *QueryRtopRisklabelFilterResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetRiskLabelFilterConfigInfo(v []*RiskLabelFilterConfigInfo) *QueryRtopRisklabelFilterResponse {
	s.RiskLabelFilterConfigInfo = v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetSuccess(v bool) *QueryRtopRisklabelFilterResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetTotal(v int64) *QueryRtopRisklabelFilterResponse {
	s.Total = &v
	return s
}

type PullRegtechNewsRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 表示本地数据库中舆情数据中的最大id
	NewsMaxId *string `json:"news_max_id,omitempty" xml:"news_max_id,omitempty" require:"true"`
}

func (s PullRegtechNewsRequest) String() string {
	return tea.Prettify(s)
}

func (s PullRegtechNewsRequest) GoString() string {
	return s.String()
}

func (s *PullRegtechNewsRequest) SetAuthToken(v string) *PullRegtechNewsRequest {
	s.AuthToken = &v
	return s
}

func (s *PullRegtechNewsRequest) SetProductInstanceId(v string) *PullRegtechNewsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullRegtechNewsRequest) SetNewsMaxId(v string) *PullRegtechNewsRequest {
	s.NewsMaxId = &v
	return s
}

type PullRegtechNewsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的数据体
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PullRegtechNewsResponse) String() string {
	return tea.Prettify(s)
}

func (s PullRegtechNewsResponse) GoString() string {
	return s.String()
}

func (s *PullRegtechNewsResponse) SetReqMsgId(v string) *PullRegtechNewsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullRegtechNewsResponse) SetResultCode(v string) *PullRegtechNewsResponse {
	s.ResultCode = &v
	return s
}

func (s *PullRegtechNewsResponse) SetResultMsg(v string) *PullRegtechNewsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullRegtechNewsResponse) SetData(v string) *PullRegtechNewsResponse {
	s.Data = &v
	return s
}

type QueryRtopCompanyFeedbackRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyFeedbackRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyFeedbackRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyFeedbackRequest) SetAuthToken(v string) *QueryRtopCompanyFeedbackRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetProductInstanceId(v string) *QueryRtopCompanyFeedbackRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetPageNo(v int64) *QueryRtopCompanyFeedbackRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetPageSize(v int64) *QueryRtopCompanyFeedbackRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetUserPlace(v string) *QueryRtopCompanyFeedbackRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetUserPlaceType(v string) *QueryRtopCompanyFeedbackRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyFeedbackResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业反馈列表
	CompanyFeedbacks []*RtopCompanyFeedback `json:"company_feedbacks,omitempty" xml:"company_feedbacks,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyFeedbackResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyFeedbackResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyFeedbackResponse) SetReqMsgId(v string) *QueryRtopCompanyFeedbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResultCode(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResultMsg(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetCompanyFeedbacks(v []*RtopCompanyFeedback) *QueryRtopCompanyFeedbackResponse {
	s.CompanyFeedbacks = v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResponseCode(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetSuccess(v bool) *QueryRtopCompanyFeedbackResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetTotalNum(v int64) *QueryRtopCompanyFeedbackResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyAlarmRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据的时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyAlarmRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyAlarmRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyAlarmRequest) SetAuthToken(v string) *QueryRtopCompanyAlarmRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetProductInstanceId(v string) *QueryRtopCompanyAlarmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetDataTime(v string) *QueryRtopCompanyAlarmRequest {
	s.DataTime = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetPageNo(v int64) *QueryRtopCompanyAlarmRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetPageSize(v int64) *QueryRtopCompanyAlarmRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetUserPlace(v string) *QueryRtopCompanyAlarmRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetUserPlaceType(v string) *QueryRtopCompanyAlarmRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyAlarmResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预警企业列表
	CompanyAlarms []*RtopCompanyAlarm `json:"company_alarms,omitempty" xml:"company_alarms,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyAlarmResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyAlarmResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyAlarmResponse) SetReqMsgId(v string) *QueryRtopCompanyAlarmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResultCode(v string) *QueryRtopCompanyAlarmResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResultMsg(v string) *QueryRtopCompanyAlarmResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetCompanyAlarms(v []*RtopCompanyAlarm) *QueryRtopCompanyAlarmResponse {
	s.CompanyAlarms = v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResponseCode(v string) *QueryRtopCompanyAlarmResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetSuccess(v bool) *QueryRtopCompanyAlarmResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetTotalNum(v int64) *QueryRtopCompanyAlarmResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyRiskyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
	// 全局态势中的列表 类型
	ListType *string `json:"list_type,omitempty" xml:"list_type,omitempty" require:"true"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 全局动态类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskyRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskyRequest) SetAuthToken(v string) *QueryRtopCompanyRiskyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetDataTime(v string) *QueryRtopCompanyRiskyRequest {
	s.DataTime = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetListType(v string) *QueryRtopCompanyRiskyRequest {
	s.ListType = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetPageNo(v int64) *QueryRtopCompanyRiskyRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetPageSize(v int64) *QueryRtopCompanyRiskyRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetType(v string) *QueryRtopCompanyRiskyRequest {
	s.Type = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetUserPlace(v string) *QueryRtopCompanyRiskyRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetUserPlaceType(v string) *QueryRtopCompanyRiskyRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyRiskyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 全局动态中的企业列表
	RiskyCompanies []*RtopRiskyCompany `json:"risky_companies,omitempty" xml:"risky_companies,omitempty" type:"Repeated"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyRiskyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskyResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskyResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResultCode(v string) *QueryRtopCompanyRiskyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResultMsg(v string) *QueryRtopCompanyRiskyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResponseCode(v string) *QueryRtopCompanyRiskyResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetRiskyCompanies(v []*RtopRiskyCompany) *QueryRtopCompanyRiskyResponse {
	s.RiskyCompanies = v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetSuccess(v bool) *QueryRtopCompanyRiskyResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetTotalNum(v int64) *QueryRtopCompanyRiskyResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyListRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活跃地区
	ActiveAreas []*string `json:"active_areas,omitempty" xml:"active_areas,omitempty" type:"Repeated"`
	// 企业类型
	Categories []*string `json:"categories,omitempty" xml:"categories,omitempty" type:"Repeated"`
	// 企业状态
	CompanyStates []*string `json:"company_states,omitempty" xml:"company_states,omitempty" type:"Repeated"`
	// 反馈
	Feedback []*string `json:"feedback,omitempty" xml:"feedback,omitempty" type:"Repeated"`
	// 风险指数最大值
	MaxRiskScore *int64 `json:"max_risk_score,omitempty" xml:"max_risk_score,omitempty"`
	// 指数周波动最大值
	MaxRiskScoreWeeklyFloat *string `json:"max_risk_score_weekly_float,omitempty" xml:"max_risk_score_weekly_float,omitempty"`
	// 传播人次最大值
	MaxSpreadNumber *int64 `json:"max_spread_number,omitempty" xml:"max_spread_number,omitempty"`
	// 风险指数最小值
	MinRiskScore *int64 `json:"min_risk_score,omitempty" xml:"min_risk_score,omitempty"`
	// 指数周波动最小值
	MinRiskScoreWeeklyFloat *string `json:"min_risk_score_weekly_float,omitempty" xml:"min_risk_score_weekly_float,omitempty"`
	// 传播人次最小值
	MinSpreadNumber *int64 `json:"min_spread_number,omitempty" xml:"min_spread_number,omitempty"`
	// 正常营运状态
	NormalOperation *bool `json:"normal_operation,omitempty" xml:"normal_operation,omitempty"`
	// 经营地区
	OperateAreas []*string `json:"operate_areas,omitempty" xml:"operate_areas,omitempty" type:"Repeated"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 平台状态
	PlatformStates []*string `json:"platform_states,omitempty" xml:"platform_states,omitempty" type:"Repeated"`
	// 注册地区
	RegisterAreas []*string `json:"register_areas,omitempty" xml:"register_areas,omitempty" type:"Repeated"`
	// 高风险维度
	RiskyDimensions []*string `json:"risky_dimensions,omitempty" xml:"risky_dimensions,omitempty" type:"Repeated"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 风险定性
	RiskTypes []*string `json:"risk_types,omitempty" xml:"risk_types,omitempty" type:"Repeated"`
	// 排序字段
	SortField *string `json:"sort_field,omitempty" xml:"sort_field,omitempty"`
	// 排序类型
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyListRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyListRequest) SetAuthToken(v string) *QueryRtopCompanyListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetProductInstanceId(v string) *QueryRtopCompanyListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetActiveAreas(v []*string) *QueryRtopCompanyListRequest {
	s.ActiveAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetCategories(v []*string) *QueryRtopCompanyListRequest {
	s.Categories = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetCompanyStates(v []*string) *QueryRtopCompanyListRequest {
	s.CompanyStates = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetFeedback(v []*string) *QueryRtopCompanyListRequest {
	s.Feedback = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxRiskScore(v int64) *QueryRtopCompanyListRequest {
	s.MaxRiskScore = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxRiskScoreWeeklyFloat(v string) *QueryRtopCompanyListRequest {
	s.MaxRiskScoreWeeklyFloat = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxSpreadNumber(v int64) *QueryRtopCompanyListRequest {
	s.MaxSpreadNumber = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinRiskScore(v int64) *QueryRtopCompanyListRequest {
	s.MinRiskScore = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinRiskScoreWeeklyFloat(v string) *QueryRtopCompanyListRequest {
	s.MinRiskScoreWeeklyFloat = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinSpreadNumber(v int64) *QueryRtopCompanyListRequest {
	s.MinSpreadNumber = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetNormalOperation(v bool) *QueryRtopCompanyListRequest {
	s.NormalOperation = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetOperateAreas(v []*string) *QueryRtopCompanyListRequest {
	s.OperateAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPageNo(v int64) *QueryRtopCompanyListRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPageSize(v int64) *QueryRtopCompanyListRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPlatformStates(v []*string) *QueryRtopCompanyListRequest {
	s.PlatformStates = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRegisterAreas(v []*string) *QueryRtopCompanyListRequest {
	s.RegisterAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskyDimensions(v []*string) *QueryRtopCompanyListRequest {
	s.RiskyDimensions = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskTags(v []*string) *QueryRtopCompanyListRequest {
	s.RiskTags = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskTypes(v []*string) *QueryRtopCompanyListRequest {
	s.RiskTypes = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetSortField(v string) *QueryRtopCompanyListRequest {
	s.SortField = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetSortType(v string) *QueryRtopCompanyListRequest {
	s.SortType = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetUserPlace(v string) *QueryRtopCompanyListRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetUserPlaceType(v string) *QueryRtopCompanyListRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyListResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业id列表
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyListResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyListResponse) SetReqMsgId(v string) *QueryRtopCompanyListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResultCode(v string) *QueryRtopCompanyListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResultMsg(v string) *QueryRtopCompanyListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetCompanyIds(v []*string) *QueryRtopCompanyListResponse {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResponseCode(v string) *QueryRtopCompanyListResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetSuccess(v bool) *QueryRtopCompanyListResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetTotalNum(v int64) *QueryRtopCompanyListResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopRisklabelConfigRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// page_no
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryRtopRisklabelConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelConfigRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelConfigRequest) SetAuthToken(v string) *QueryRtopRisklabelConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetProductInstanceId(v string) *QueryRtopRisklabelConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetPageNo(v int64) *QueryRtopRisklabelConfigRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetPageSize(v int64) *QueryRtopRisklabelConfigRequest {
	s.PageSize = &v
	return s
}

type QueryRtopRisklabelConfigResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	//
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 列表
	TagConfig []*RiskLabelConfigInfo `json:"tag_config,omitempty" xml:"tag_config,omitempty" type:"Repeated"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelConfigResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelConfigResponse) SetReqMsgId(v string) *QueryRtopRisklabelConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResultCode(v string) *QueryRtopRisklabelConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResultMsg(v string) *QueryRtopRisklabelConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResponseCode(v string) *QueryRtopRisklabelConfigResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetSuccess(v bool) *QueryRtopRisklabelConfigResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetTagConfig(v []*RiskLabelConfigInfo) *QueryRtopRisklabelConfigResponse {
	s.TagConfig = v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetTotal(v int64) *QueryRtopRisklabelConfigResponse {
	s.Total = &v
	return s
}

type QueryRtopCompanyRiskRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业id
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskRequest) SetAuthToken(v string) *QueryRtopCompanyRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskRequest) SetCompanyId(v string) *QueryRtopCompanyRiskRequest {
	s.CompanyId = &v
	return s
}

type QueryRtopCompanyRiskResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险维度
	RiskFactors []*RtopCompanyRiskFactor `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" type:"Repeated"`
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险报文
	RiskMessage *string `json:"risk_message,omitempty" xml:"risk_message,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
}

func (s QueryRtopCompanyRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetResultCode(v string) *QueryRtopCompanyRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetResultMsg(v string) *QueryRtopCompanyRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskFactors(v []*RtopCompanyRiskFactor) *QueryRtopCompanyRiskResponse {
	s.RiskFactors = v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskLevel(v string) *QueryRtopCompanyRiskResponse {
	s.RiskLevel = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskMessage(v string) *QueryRtopCompanyRiskResponse {
	s.RiskMessage = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskScore(v int64) *QueryRtopCompanyRiskResponse {
	s.RiskScore = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskTags(v []*string) *QueryRtopCompanyRiskResponse {
	s.RiskTags = v
	return s
}

type ListRtopCompanyRelatedRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业id
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s ListRtopCompanyRelatedRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyRelatedRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyRelatedRequest) SetAuthToken(v string) *ListRtopCompanyRelatedRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCompanyRelatedRequest) SetProductInstanceId(v string) *ListRtopCompanyRelatedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCompanyRelatedRequest) SetCompanyId(v string) *ListRtopCompanyRelatedRequest {
	s.CompanyId = &v
	return s
}

type ListRtopCompanyRelatedResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// node
	Companies []*RtopRiskGeneNode `json:"companies,omitempty" xml:"companies,omitempty" type:"Repeated"`
	// 返回码
	//
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListRtopCompanyRelatedResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyRelatedResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyRelatedResponse) SetReqMsgId(v string) *ListRtopCompanyRelatedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResultCode(v string) *ListRtopCompanyRelatedResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResultMsg(v string) *ListRtopCompanyRelatedResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetCompanies(v []*RtopRiskGeneNode) *ListRtopCompanyRelatedResponse {
	s.Companies = v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResponseCode(v string) *ListRtopCompanyRelatedResponse {
	s.ResponseCode = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetSuccess(v bool) *ListRtopCompanyRelatedResponse {
	s.Success = &v
	return s
}

type QueryRtopTagImageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
}

func (s QueryRtopTagImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopTagImageRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopTagImageRequest) SetAuthToken(v string) *QueryRtopTagImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetProductInstanceId(v string) *QueryRtopTagImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetCompanyId(v string) *QueryRtopTagImageRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetTagId(v string) *QueryRtopTagImageRequest {
	s.TagId = &v
	return s
}

type QueryRtopTagImageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 标签图片列表
	RiskImages []*RtopTagImage `json:"risk_images,omitempty" xml:"risk_images,omitempty" type:"Repeated"`
}

func (s QueryRtopTagImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopTagImageResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopTagImageResponse) SetReqMsgId(v string) *QueryRtopTagImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetResultCode(v string) *QueryRtopTagImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetResultMsg(v string) *QueryRtopTagImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetRiskImages(v []*RtopTagImage) *QueryRtopTagImageResponse {
	s.RiskImages = v
	return s
}

type ListRtopStarCompanyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 一页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListRtopStarCompanyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopStarCompanyRequest) GoString() string {
	return s.String()
}

func (s *ListRtopStarCompanyRequest) SetAuthToken(v string) *ListRtopStarCompanyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetProductInstanceId(v string) *ListRtopStarCompanyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetPageNo(v int64) *ListRtopStarCompanyRequest {
	s.PageNo = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetPageSize(v int64) *ListRtopStarCompanyRequest {
	s.PageSize = &v
	return s
}

type ListRtopStarCompanyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	CompanyInfos []*RtopStarCompanyInfo `json:"company_infos,omitempty" xml:"company_infos,omitempty" type:"Repeated"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 一页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ListRtopStarCompanyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopStarCompanyResponse) GoString() string {
	return s.String()
}

func (s *ListRtopStarCompanyResponse) SetReqMsgId(v string) *ListRtopStarCompanyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetResultCode(v string) *ListRtopStarCompanyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetResultMsg(v string) *ListRtopStarCompanyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetCompanyInfos(v []*RtopStarCompanyInfo) *ListRtopStarCompanyResponse {
	s.CompanyInfos = v
	return s
}

func (s *ListRtopStarCompanyResponse) SetPageNo(v int64) *ListRtopStarCompanyResponse {
	s.PageNo = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetPageSize(v int64) *ListRtopStarCompanyResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetTotalCount(v int64) *ListRtopStarCompanyResponse {
	s.TotalCount = &v
	return s
}

type QueryRpSecurityPolicyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险类型：表示风险处理或风险咨询——process/advice
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// security_scene
	SecurityScene *SecurityScene `json:"security_scene,omitempty" xml:"security_scene,omitempty" require:"true"`
	// service_context
	ServiceContext *ServiceContext `json:"service_context,omitempty" xml:"service_context,omitempty" require:"true"`
}

func (s QueryRpSecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRpSecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *QueryRpSecurityPolicyRequest) SetAuthToken(v string) *QueryRpSecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetProductInstanceId(v string) *QueryRpSecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetRiskType(v string) *QueryRpSecurityPolicyRequest {
	s.RiskType = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetSecurityScene(v *SecurityScene) *QueryRpSecurityPolicyRequest {
	s.SecurityScene = v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetServiceContext(v *ServiceContext) *QueryRpSecurityPolicyRequest {
	s.ServiceContext = v
	return s
}

type QueryRpSecurityPolicyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型结果详情
	//
	ModelDetails []*ModelDetails `json:"model_details,omitempty" xml:"model_details,omitempty" type:"Repeated"`
	// 反馈成功之后的id
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
	SecurityResult *string `json:"security_result,omitempty" xml:"security_result,omitempty"`
	// 策略结果详情
	//
	StrategyDetails []*StrategyDetails `json:"strategy_details,omitempty" xml:"strategy_details,omitempty" type:"Repeated"`
}

func (s QueryRpSecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRpSecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *QueryRpSecurityPolicyResponse) SetReqMsgId(v string) *QueryRpSecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetResultCode(v string) *QueryRpSecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetResultMsg(v string) *QueryRpSecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetModelDetails(v []*ModelDetails) *QueryRpSecurityPolicyResponse {
	s.ModelDetails = v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetSecurityId(v string) *QueryRpSecurityPolicyResponse {
	s.SecurityId = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetSecurityResult(v string) *QueryRpSecurityPolicyResponse {
	s.SecurityResult = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetStrategyDetails(v []*StrategyDetails) *QueryRpSecurityPolicyResponse {
	s.StrategyDetails = v
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
				"sdk_version":      tea.String("1.6.5"),
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
 * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
 * Summary: 策略咨询服务输出
 */
func (client *Client) QuerySecurityPolicy(request *QuerySecurityPolicyRequest) (_result *QuerySecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityPolicyResponse{}
	_body, _err := client.QuerySecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
 * Summary: 策略咨询服务输出
 */
func (client *Client) QuerySecurityPolicyEx(request *QuerySecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向风控发送异步安全数据
 * Summary: 异步发送安全数据
 */
func (client *Client) SendSecurityData(request *SendSecurityDataRequest) (_result *SendSecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendSecurityDataResponse{}
	_body, _err := client.SendSecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向风控发送异步安全数据
 * Summary: 异步发送安全数据
 */
func (client *Client) SendSecurityDataEx(request *SendSecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendSecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendSecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
 * Summary: 安全策略确认服务输出
 */
func (client *Client) ConfirmSecurityPolicy(request *ConfirmSecurityPolicyRequest) (_result *ConfirmSecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmSecurityPolicyResponse{}
	_body, _err := client.ConfirmSecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
 * Summary: 安全策略确认服务输出
 */
func (client *Client) ConfirmSecurityPolicyEx(request *ConfirmSecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmSecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmSecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.policy.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行人机识别判断。
 * Summary: 策略咨询服务输出
 */
func (client *Client) CheckSecurityRds(request *CheckSecurityRdsRequest) (_result *CheckSecurityRdsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSecurityRdsResponse{}
	_body, _err := client.CheckSecurityRdsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行人机识别判断。
 * Summary: 策略咨询服务输出
 */
func (client *Client) CheckSecurityRdsEx(request *CheckSecurityRdsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSecurityRdsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSecurityRdsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.rds.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
 * Summary: 安全数据服务输出
 */
func (client *Client) QuerySecurityData(request *QuerySecurityDataRequest) (_result *QuerySecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityDataResponse{}
	_body, _err := client.QuerySecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
 * Summary: 安全数据服务输出
 */
func (client *Client) QuerySecurityDataEx(request *QuerySecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户数据校验接口，比如端防护
 * Summary: 安全数据服务校验
 */
func (client *Client) CheckSecurityData(request *CheckSecurityDataRequest) (_result *CheckSecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSecurityDataResponse{}
	_body, _err := client.CheckSecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户数据校验接口，比如端防护
 * Summary: 安全数据服务校验
 */
func (client *Client) CheckSecurityDataEx(request *CheckSecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 四要素认证首先调用此接口
 * Summary: 芝麻四要素接口
 */
func (client *Client) VerifyFinserviceZhimaIdentify(request *VerifyFinserviceZhimaIdentifyRequest) (_result *VerifyFinserviceZhimaIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFinserviceZhimaIdentifyResponse{}
	_body, _err := client.VerifyFinserviceZhimaIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 四要素认证首先调用此接口
 * Summary: 芝麻四要素接口
 */
func (client *Client) VerifyFinserviceZhimaIdentifyEx(request *VerifyFinserviceZhimaIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFinserviceZhimaIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFinserviceZhimaIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.finservice.zhima.identify.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 芝麻四要素认证结果查询
 */
func (client *Client) QueryFinserviceZhimaIdentify(request *QueryFinserviceZhimaIdentifyRequest) (_result *QueryFinserviceZhimaIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFinserviceZhimaIdentifyResponse{}
	_body, _err := client.QueryFinserviceZhimaIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 芝麻四要素认证结果查询
 */
func (client *Client) QueryFinserviceZhimaIdentifyEx(request *QueryFinserviceZhimaIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFinserviceZhimaIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFinserviceZhimaIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.finservice.zhima.identify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询接口
 * Summary: 【已废弃】
 */
func (client *Client) QueryRbbGenericInvoke(request *QueryRbbGenericInvokeRequest) (_result *QueryRbbGenericInvokeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbGenericInvokeResponse{}
	_body, _err := client.QueryRbbGenericInvokeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询接口
 * Summary: 【已废弃】
 */
func (client *Client) QueryRbbGenericInvokeEx(request *QueryRbbGenericInvokeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbGenericInvokeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbGenericInvokeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.generic.invoke.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版token生成
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbToken(request *CreateRbbTokenRequest) (_result *CreateRbbTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbTokenResponse{}
	_body, _err := client.CreateRbbTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版token生成
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbTokenEx(request *CreateRbbTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.token.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取风险大脑企业版登录token
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbApiGwtoken(request *CreateRbbApiGwtokenRequest) (_result *CreateRbbApiGwtokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbApiGwtokenResponse{}
	_body, _err := client.CreateRbbApiGwtokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取风险大脑企业版登录token
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbApiGwtokenEx(request *CreateRbbApiGwtokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbApiGwtokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbApiGwtokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.api.gwtoken.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询OpenAPI
 * Summary: 风险大脑企业版通用查询OpenAPI
 */
func (client *Client) QueryRbbGeneral(request *QueryRbbGeneralRequest) (_result *QueryRbbGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbGeneralResponse{}
	_body, _err := client.QueryRbbGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询OpenAPI
 * Summary: 风险大脑企业版通用查询OpenAPI
 */
func (client *Client) QueryRbbGeneralEx(request *QueryRbbGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.general.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取登录Token
 * Summary: 获取登录Token
 */
func (client *Client) GetRbbLoginToken(request *GetRbbLoginTokenRequest) (_result *GetRbbLoginTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRbbLoginTokenResponse{}
	_body, _err := client.GetRbbLoginTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取登录Token
 * Summary: 获取登录Token
 */
func (client *Client) GetRbbLoginTokenEx(request *GetRbbLoginTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRbbLoginTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRbbLoginTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.login.token.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建租户
 * Summary: 风险大脑企业版创建租户
 */
func (client *Client) CreateRbbTenant(request *CreateRbbTenantRequest) (_result *CreateRbbTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbTenantResponse{}
	_body, _err := client.CreateRbbTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建租户
 * Summary: 风险大脑企业版创建租户
 */
func (client *Client) CreateRbbTenantEx(request *CreateRbbTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.tenant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建用户
 * Summary: 风险大脑企业版创建用户
 */
func (client *Client) CreateRbbUser(request *CreateRbbUserRequest) (_result *CreateRbbUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbUserResponse{}
	_body, _err := client.CreateRbbUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建用户
 * Summary: 风险大脑企业版创建用户
 */
func (client *Client) CreateRbbUserEx(request *CreateRbbUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所在地的负面舆情企业列表
 * Summary: 查询所在地的负面舆情企业列表
 */
func (client *Client) QueryRtopCompanyOpinion(request *QueryRtopCompanyOpinionRequest) (_result *QueryRtopCompanyOpinionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyOpinionResponse{}
	_body, _err := client.QueryRtopCompanyOpinionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所在地的负面舆情企业列表
 * Summary: 查询所在地的负面舆情企业列表
 */
func (client *Client) QueryRtopCompanyOpinionEx(request *QueryRtopCompanyOpinionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyOpinionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyOpinionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.opinion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业的舆情详情信息
 * Summary: 查询企业的舆情详情信息
 */
func (client *Client) ListRtopCompanyOpinions(request *ListRtopCompanyOpinionsRequest) (_result *ListRtopCompanyOpinionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCompanyOpinionsResponse{}
	_body, _err := client.ListRtopCompanyOpinionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业的舆情详情信息
 * Summary: 查询企业的舆情详情信息
 */
func (client *Client) ListRtopCompanyOpinionsEx(request *ListRtopCompanyOpinionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCompanyOpinionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCompanyOpinionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.opinions.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询监测企业的详情
 * Summary: 查询监测企业的详情
 */
func (client *Client) GetRtopCompanyMonitor(request *GetRtopCompanyMonitorRequest) (_result *GetRtopCompanyMonitorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRtopCompanyMonitorResponse{}
	_body, _err := client.GetRtopCompanyMonitorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询监测企业的详情
 * Summary: 查询监测企业的详情
 */
func (client *Client) GetRtopCompanyMonitorEx(request *GetRtopCompanyMonitorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRtopCompanyMonitorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRtopCompanyMonitorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.monitor.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所在地的涉众风险企业统计信息
 * Summary: 查询所在地的涉众风险企业统计信息
 */
func (client *Client) QueryRtopCrowdriskStatistic(request *QueryRtopCrowdriskStatisticRequest) (_result *QueryRtopCrowdriskStatisticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskStatisticResponse{}
	_body, _err := client.QueryRtopCrowdriskStatisticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所在地的涉众风险企业统计信息
 * Summary: 查询所在地的涉众风险企业统计信息
 */
func (client *Client) QueryRtopCrowdriskStatisticEx(request *QueryRtopCrowdriskStatisticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskStatisticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskStatisticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.statistic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的列表
 * Summary: 查询涉众风险企业的列表
 */
func (client *Client) ListRtopCrowdrisk(request *ListRtopCrowdriskRequest) (_result *ListRtopCrowdriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCrowdriskResponse{}
	_body, _err := client.ListRtopCrowdriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的列表
 * Summary: 查询涉众风险企业的列表
 */
func (client *Client) ListRtopCrowdriskEx(request *ListRtopCrowdriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCrowdriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCrowdriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的详细信息
 * Summary: 查询涉众风险企业的详细信息
 */
func (client *Client) QueryRtopCrowdriskDetail(request *QueryRtopCrowdriskDetailRequest) (_result *QueryRtopCrowdriskDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskDetailResponse{}
	_body, _err := client.QueryRtopCrowdriskDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的详细信息
 * Summary: 查询涉众风险企业的详细信息
 */
func (client *Client) QueryRtopCrowdriskDetailEx(request *QueryRtopCrowdriskDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询风报的详细信息
 * Summary: 查询风报的详细信息
 */
func (client *Client) QueryRtopRiskstorm(request *QueryRtopRiskstormRequest) (_result *QueryRtopRiskstormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRiskstormResponse{}
	_body, _err := client.QueryRtopRiskstormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风报的详细信息
 * Summary: 查询风报的详细信息
 */
func (client *Client) QueryRtopRiskstormEx(request *QueryRtopRiskstormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRiskstormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRiskstormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.riskstorm.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
 * Summary: 监管涉众风险一批企业的影响人数影响金额
 */
func (client *Client) QueryRtopCrowdriskSum(request *QueryRtopCrowdriskSumRequest) (_result *QueryRtopCrowdriskSumResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskSumResponse{}
	_body, _err := client.QueryRtopCrowdriskSumEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
 * Summary: 监管涉众风险一批企业的影响人数影响金额
 */
func (client *Client) QueryRtopCrowdriskSumEx(request *QueryRtopCrowdriskSumRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskSumResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskSumResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.sum.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监管企业详情获取，包括风险分数、风险标签。
 * Summary: 监管企业详情获取
 */
func (client *Client) GetRtopCompanyDetail(request *GetRtopCompanyDetailRequest) (_result *GetRtopCompanyDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRtopCompanyDetailResponse{}
	_body, _err := client.GetRtopCompanyDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监管企业详情获取，包括风险分数、风险标签。
 * Summary: 监管企业详情获取
 */
func (client *Client) GetRtopCompanyDetailEx(request *GetRtopCompanyDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRtopCompanyDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRtopCompanyDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.detail.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风险查询接口
 * Summary: 企业风险查询接口
 */
func (client *Client) QueryRtopCompanyRiskinfo(request *QueryRtopCompanyRiskinfoRequest) (_result *QueryRtopCompanyRiskinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskinfoResponse{}
	_body, _err := client.QueryRtopCompanyRiskinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风险查询接口
 * Summary: 企业风险查询接口
 */
func (client *Client) QueryRtopCompanyRiskinfoEx(request *QueryRtopCompanyRiskinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.riskinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公有云通用风险信息接口
 * Summary: 公有云通用风险信息接口
 */
func (client *Client) ExecRtopGenericInvoke(request *ExecRtopGenericInvokeRequest) (_result *ExecRtopGenericInvokeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRtopGenericInvokeResponse{}
	_body, _err := client.ExecRtopGenericInvokeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公有云通用风险信息接口
 * Summary: 公有云通用风险信息接口
 */
func (client *Client) ExecRtopGenericInvokeEx(request *ExecRtopGenericInvokeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRtopGenericInvokeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRtopGenericInvokeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.generic.invoke.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公有云生成token
 * Summary: 公有云生成token
 */
func (client *Client) CreateRtopToken(request *CreateRtopTokenRequest) (_result *CreateRtopTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRtopTokenResponse{}
	_body, _err := client.CreateRtopTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公有云生成token
 * Summary: 公有云生成token
 */
func (client *Client) CreateRtopTokenEx(request *CreateRtopTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRtopTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRtopTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.token.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签全量信息获取
 * Summary: 标签全量信息获取
 */
func (client *Client) QueryRtopRisklabel(request *QueryRtopRisklabelRequest) (_result *QueryRtopRisklabelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelResponse{}
	_body, _err := client.QueryRtopRisklabelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签全量信息获取
 * Summary: 标签全量信息获取
 */
func (client *Client) QueryRtopRisklabelEx(request *QueryRtopRisklabelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业全量信息获取
 * Summary: 企业全量信息获取
 */
func (client *Client) QueryRtopCompany(request *QueryRtopCompanyRequest) (_result *QueryRtopCompanyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyResponse{}
	_body, _err := client.QueryRtopCompanyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业全量信息获取
 * Summary: 企业全量信息获取
 */
func (client *Client) QueryRtopCompanyEx(request *QueryRtopCompanyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
rtop_company_tag_filter_config
 * Summary: 标签配置全量信息获取
*/
func (client *Client) QueryRtopRisklabelFilter(request *QueryRtopRisklabelFilterRequest) (_result *QueryRtopRisklabelFilterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelFilterResponse{}
	_body, _err := client.QueryRtopRisklabelFilterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
rtop_company_tag_filter_config
 * Summary: 标签配置全量信息获取
*/
func (client *Client) QueryRtopRisklabelFilterEx(request *QueryRtopRisklabelFilterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelFilterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelFilterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.filter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于鹰眼项目舆情同步
 * Summary: 鹰眼项目舆情同步
 */
func (client *Client) PullRegtechNews(request *PullRegtechNewsRequest) (_result *PullRegtechNewsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullRegtechNewsResponse{}
	_body, _err := client.PullRegtechNewsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于鹰眼项目舆情同步
 * Summary: 鹰眼项目舆情同步
 */
func (client *Client) PullRegtechNewsEx(request *PullRegtechNewsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullRegtechNewsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullRegtechNewsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.regtech.news.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查看企业反馈
 * Summary: 查看企业反馈
 */
func (client *Client) QueryRtopCompanyFeedback(request *QueryRtopCompanyFeedbackRequest) (_result *QueryRtopCompanyFeedbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyFeedbackResponse{}
	_body, _err := client.QueryRtopCompanyFeedbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查看企业反馈
 * Summary: 查看企业反馈
 */
func (client *Client) QueryRtopCompanyFeedbackEx(request *QueryRtopCompanyFeedbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyFeedbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyFeedbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.feedback.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 全局动态中的预警企业详细列表查询
 * Summary: 全局动态中的预警企业详细列表查询
 */
func (client *Client) QueryRtopCompanyAlarm(request *QueryRtopCompanyAlarmRequest) (_result *QueryRtopCompanyAlarmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyAlarmResponse{}
	_body, _err := client.QueryRtopCompanyAlarmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 全局动态中的预警企业详细列表查询
 * Summary: 全局动态中的预警企业详细列表查询
 */
func (client *Client) QueryRtopCompanyAlarmEx(request *QueryRtopCompanyAlarmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyAlarmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyAlarmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.alarm.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询全局动态中的企业列表里的全部列表
 * Summary: 查询全局动态中的企业列表里的全部列表
 */
func (client *Client) QueryRtopCompanyRisky(request *QueryRtopCompanyRiskyRequest) (_result *QueryRtopCompanyRiskyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskyResponse{}
	_body, _err := client.QueryRtopCompanyRiskyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询全局动态中的企业列表里的全部列表
 * Summary: 查询全局动态中的企业列表里的全部列表
 */
func (client *Client) QueryRtopCompanyRiskyEx(request *QueryRtopCompanyRiskyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.risky.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业列表
 * Summary: 查询企业列表
 */
func (client *Client) QueryRtopCompanyList(request *QueryRtopCompanyListRequest) (_result *QueryRtopCompanyListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyListResponse{}
	_body, _err := client.QueryRtopCompanyListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业列表
 * Summary: 查询企业列表
 */
func (client *Client) QueryRtopCompanyListEx(request *QueryRtopCompanyListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
 * Summary: 标签配置全量信息获取
 */
func (client *Client) QueryRtopRisklabelConfig(request *QueryRtopRisklabelConfigRequest) (_result *QueryRtopRisklabelConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelConfigResponse{}
	_body, _err := client.QueryRtopRisklabelConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
 * Summary: 标签配置全量信息获取
 */
func (client *Client) QueryRtopRisklabelConfigEx(request *QueryRtopRisklabelConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.config.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风险标签信息查询
 * Summary: 企业风险标签信息查询
 */
func (client *Client) QueryRtopCompanyRisk(request *QueryRtopCompanyRiskRequest) (_result *QueryRtopCompanyRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskResponse{}
	_body, _err := client.QueryRtopCompanyRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风险标签信息查询
 * Summary: 企业风险标签信息查询
 */
func (client *Client) QueryRtopCompanyRiskEx(request *QueryRtopCompanyRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查看重点关联企业
 * Summary: 重点关联企业
 */
func (client *Client) ListRtopCompanyRelated(request *ListRtopCompanyRelatedRequest) (_result *ListRtopCompanyRelatedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCompanyRelatedResponse{}
	_body, _err := client.ListRtopCompanyRelatedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查看重点关联企业
 * Summary: 重点关联企业
 */
func (client *Client) ListRtopCompanyRelatedEx(request *ListRtopCompanyRelatedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCompanyRelatedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCompanyRelatedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.related.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险标签图片查询
 * Summary: 风险标签图片查询
 */
func (client *Client) QueryRtopTagImage(request *QueryRtopTagImageRequest) (_result *QueryRtopTagImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopTagImageResponse{}
	_body, _err := client.QueryRtopTagImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险标签图片查询
 * Summary: 风险标签图片查询
 */
func (client *Client) QueryRtopTagImageEx(request *QueryRtopTagImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopTagImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopTagImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.tag.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户收藏企业列表
 * Summary: 查询用户收藏企业列表
 */
func (client *Client) ListRtopStarCompany(request *ListRtopStarCompanyRequest) (_result *ListRtopStarCompanyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopStarCompanyResponse{}
	_body, _err := client.ListRtopStarCompanyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户收藏企业列表
 * Summary: 查询用户收藏企业列表
 */
func (client *Client) ListRtopStarCompanyEx(request *ListRtopStarCompanyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopStarCompanyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopStarCompanyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.star.company.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 策略咨询服务输出(saas)
 * Summary: 策略咨询服务输出(saas)
 */
func (client *Client) QueryRpSecurityPolicy(request *QueryRpSecurityPolicyRequest) (_result *QueryRpSecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRpSecurityPolicyResponse{}
	_body, _err := client.QueryRpSecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 策略咨询服务输出(saas)
 * Summary: 策略咨询服务输出(saas)
 */
func (client *Client) QueryRpSecurityPolicyEx(request *QueryRpSecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRpSecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRpSecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rp.security.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
