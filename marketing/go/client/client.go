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

// 目录对象
type CategoryVO struct {
	// 内部id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 内容库id
	SiteId *int64 `json:"site_id,omitempty" xml:"site_id,omitempty"`
	// 站点
	Site *string `json:"site,omitempty" xml:"site,omitempty"`
	// language
	Language *string `json:"language,omitempty" xml:"language,omitempty"`
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 类型
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 展示类型 1为左侧展示2为列表展示
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// 排序
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty"`
	// 目录层级
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// 外标id
	ExtId *string `json:"ext_id,omitempty" xml:"ext_id,omitempty"`
	// 父id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// 来源类型
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 语雀目录有无数据判定
	CatalogueType *int64 `json:"catalogue_type,omitempty" xml:"catalogue_type,omitempty"`
}

func (s CategoryVO) String() string {
	return tea.Prettify(s)
}

func (s CategoryVO) GoString() string {
	return s.String()
}

func (s *CategoryVO) SetId(v int64) *CategoryVO {
	s.Id = &v
	return s
}

func (s *CategoryVO) SetSiteId(v int64) *CategoryVO {
	s.SiteId = &v
	return s
}

func (s *CategoryVO) SetSite(v string) *CategoryVO {
	s.Site = &v
	return s
}

func (s *CategoryVO) SetLanguage(v string) *CategoryVO {
	s.Language = &v
	return s
}

func (s *CategoryVO) SetTitle(v string) *CategoryVO {
	s.Title = &v
	return s
}

func (s *CategoryVO) SetType(v int64) *CategoryVO {
	s.Type = &v
	return s
}

func (s *CategoryVO) SetShowType(v int64) *CategoryVO {
	s.ShowType = &v
	return s
}

func (s *CategoryVO) SetSort(v int64) *CategoryVO {
	s.Sort = &v
	return s
}

func (s *CategoryVO) SetLevel(v int64) *CategoryVO {
	s.Level = &v
	return s
}

func (s *CategoryVO) SetExtId(v string) *CategoryVO {
	s.ExtId = &v
	return s
}

func (s *CategoryVO) SetParentId(v string) *CategoryVO {
	s.ParentId = &v
	return s
}

func (s *CategoryVO) SetSourceType(v int64) *CategoryVO {
	s.SourceType = &v
	return s
}

func (s *CategoryVO) SetVersion(v string) *CategoryVO {
	s.Version = &v
	return s
}

func (s *CategoryVO) SetCatalogueType(v int64) *CategoryVO {
	s.CatalogueType = &v
	return s
}

// NoviceMustSee
type NoviceMustSee struct {
	// novice_must_see_explain
	NoviceMustSeeExplain *string `json:"novice_must_see_explain,omitempty" xml:"novice_must_see_explain,omitempty"`
	// novice_must_see_title1
	NoviceMustSeeTitle1 *string `json:"novice_must_see_title1,omitempty" xml:"novice_must_see_title1,omitempty"`
	// novice_must_see_address1
	NoviceMustSeeAddress1 *string `json:"novice_must_see_address1,omitempty" xml:"novice_must_see_address1,omitempty"`
	// novice_must_see_title2
	NoviceMustSeeTitle2 *string `json:"novice_must_see_title2,omitempty" xml:"novice_must_see_title2,omitempty"`
	// novice_must_see_address2
	NoviceMustSeeAddress2 *string `json:"novice_must_see_address2,omitempty" xml:"novice_must_see_address2,omitempty"`
	// novice_must_see_title3
	NoviceMustSeeTitle3 *string `json:"novice_must_see_title3,omitempty" xml:"novice_must_see_title3,omitempty"`
	// novice_must_see_address3
	NoviceMustSeeAddress3 *string `json:"novice_must_see_address3,omitempty" xml:"novice_must_see_address3,omitempty"`
}

func (s NoviceMustSee) String() string {
	return tea.Prettify(s)
}

func (s NoviceMustSee) GoString() string {
	return s.String()
}

func (s *NoviceMustSee) SetNoviceMustSeeExplain(v string) *NoviceMustSee {
	s.NoviceMustSeeExplain = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle1(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle1 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress1(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress1 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle2(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle2 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress2(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress2 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle3(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle3 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress3(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress3 = &v
	return s
}

// 公司联系人
type CorporateContacts struct {
	// 职务
	JobTitle *string `json:"job_title,omitempty" xml:"job_title,omitempty"`
	// 姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 电话
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s CorporateContacts) String() string {
	return tea.Prettify(s)
}

func (s CorporateContacts) GoString() string {
	return s.String()
}

func (s *CorporateContacts) SetJobTitle(v string) *CorporateContacts {
	s.JobTitle = &v
	return s
}

func (s *CorporateContacts) SetRealName(v string) *CorporateContacts {
	s.RealName = &v
	return s
}

func (s *CorporateContacts) SetMobilePhone(v string) *CorporateContacts {
	s.MobilePhone = &v
	return s
}

func (s *CorporateContacts) SetEmail(v string) *CorporateContacts {
	s.Email = &v
	return s
}

// PopularDocument
type PopularDocument struct {
	// popular_document_title
	PopularDocumentTitle *string `json:"popular_document_title,omitempty" xml:"popular_document_title,omitempty"`
	// popular_document_id
	PopularDocumentId *string `json:"popular_document_id,omitempty" xml:"popular_document_id,omitempty"`
	// popular_document_info
	PopularDocumentInfo *string `json:"popular_document_info,omitempty" xml:"popular_document_info,omitempty"`
	// children
	Children []*CategoryVO `json:"children,omitempty" xml:"children,omitempty" require:"true" type:"Repeated"`
}

func (s PopularDocument) String() string {
	return tea.Prettify(s)
}

func (s PopularDocument) GoString() string {
	return s.String()
}

func (s *PopularDocument) SetPopularDocumentTitle(v string) *PopularDocument {
	s.PopularDocumentTitle = &v
	return s
}

func (s *PopularDocument) SetPopularDocumentId(v string) *PopularDocument {
	s.PopularDocumentId = &v
	return s
}

func (s *PopularDocument) SetPopularDocumentInfo(v string) *PopularDocument {
	s.PopularDocumentInfo = &v
	return s
}

func (s *PopularDocument) SetChildren(v []*CategoryVO) *PopularDocument {
	s.Children = v
	return s
}

// 商机信息
type BusinessRequest struct {
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 商机名称
	BusinessName *string `json:"business_name,omitempty" xml:"business_name,omitempty" require:"true"`
	// 商机ID
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
	BusinessStatus *string `json:"business_status,omitempty" xml:"business_status,omitempty" require:"true"`
	// 商机说明
	BusinessExplain *string `json:"business_explain,omitempty" xml:"business_explain,omitempty"`
	// 线索来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 商机时间
	BusinessDate *string `json:"business_date,omitempty" xml:"business_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 创建人工号
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建人花名
	CreatorNick *string `json:"creator_nick,omitempty" xml:"creator_nick,omitempty" require:"true"`
}

func (s BusinessRequest) String() string {
	return tea.Prettify(s)
}

func (s BusinessRequest) GoString() string {
	return s.String()
}

func (s *BusinessRequest) SetCustomerName(v string) *BusinessRequest {
	s.CustomerName = &v
	return s
}

func (s *BusinessRequest) SetCustomerId(v string) *BusinessRequest {
	s.CustomerId = &v
	return s
}

func (s *BusinessRequest) SetBusinessName(v string) *BusinessRequest {
	s.BusinessName = &v
	return s
}

func (s *BusinessRequest) SetBusinessId(v string) *BusinessRequest {
	s.BusinessId = &v
	return s
}

func (s *BusinessRequest) SetBusinessStatus(v string) *BusinessRequest {
	s.BusinessStatus = &v
	return s
}

func (s *BusinessRequest) SetBusinessExplain(v string) *BusinessRequest {
	s.BusinessExplain = &v
	return s
}

func (s *BusinessRequest) SetSource(v string) *BusinessRequest {
	s.Source = &v
	return s
}

func (s *BusinessRequest) SetBusinessDate(v string) *BusinessRequest {
	s.BusinessDate = &v
	return s
}

func (s *BusinessRequest) SetTenant(v string) *BusinessRequest {
	s.Tenant = &v
	return s
}

func (s *BusinessRequest) SetCreator(v string) *BusinessRequest {
	s.Creator = &v
	return s
}

func (s *BusinessRequest) SetCreatorNick(v string) *BusinessRequest {
	s.CreatorNick = &v
	return s
}

// 用于传输附件链接
type Attachment struct {
	// 文件唯一标识，作为幂等字段
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件名称，用作展示
	Filename *string `json:"filename,omitempty" xml:"filename,omitempty"`
	// 访问地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
}

func (s Attachment) String() string {
	return tea.Prettify(s)
}

func (s Attachment) GoString() string {
	return s.String()
}

func (s *Attachment) SetFileId(v string) *Attachment {
	s.FileId = &v
	return s
}

func (s *Attachment) SetFilename(v string) *Attachment {
	s.Filename = &v
	return s
}

func (s *Attachment) SetUrl(v string) *Attachment {
	s.Url = &v
	return s
}

// 页面上下文
type PageContext struct {
	// 页面di
	PageId *string `json:"page_id,omitempty" xml:"page_id,omitempty"`
	// 页面标题
	PageTitle *string `json:"page_title,omitempty" xml:"page_title,omitempty"`
}

func (s PageContext) String() string {
	return tea.Prettify(s)
}

func (s PageContext) GoString() string {
	return s.String()
}

func (s *PageContext) SetPageId(v string) *PageContext {
	s.PageId = &v
	return s
}

func (s *PageContext) SetPageTitle(v string) *PageContext {
	s.PageTitle = &v
	return s
}

// 情报资产详情
type Asset struct {
	// 资产标识，作为幂等单号
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// VALID - 生效；INVALID - 作废
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 资产详情，自定义展示
	AssetInfo *string `json:"asset_info,omitempty" xml:"asset_info,omitempty" require:"true"`
}

func (s Asset) String() string {
	return tea.Prettify(s)
}

func (s Asset) GoString() string {
	return s.String()
}

func (s *Asset) SetAssetId(v string) *Asset {
	s.AssetId = &v
	return s
}

func (s *Asset) SetStatus(v string) *Asset {
	s.Status = &v
	return s
}

func (s *Asset) SetAssetInfo(v string) *Asset {
	s.AssetInfo = &v
	return s
}

// CategoryLocalVO
type CategoryLocalVO struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// siteId
	SiteId *int64 `json:"site_id,omitempty" xml:"site_id,omitempty"`
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// type
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// sort
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty"`
	// level
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// parent_id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// sourceType
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// show_type
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// ext_id
	ExtId *string `json:"ext_id,omitempty" xml:"ext_id,omitempty"`
	// shield
	ShieId *int64 `json:"shie_id,omitempty" xml:"shie_id,omitempty"`
	// status
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// deleted
	Deleted *int64 `json:"deleted,omitempty" xml:"deleted,omitempty"`
	// tree
	Tree *string `json:"tree,omitempty" xml:"tree,omitempty"`
	// green
	Green *int64 `json:"green,omitempty" xml:"green,omitempty"`
	// site_code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty"`
	// created_time
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// modified_time
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// isCatalogue
	IsCatalogue *bool `json:"is_catalogue,omitempty" xml:"is_catalogue,omitempty"`
}

func (s CategoryLocalVO) String() string {
	return tea.Prettify(s)
}

func (s CategoryLocalVO) GoString() string {
	return s.String()
}

func (s *CategoryLocalVO) SetId(v int64) *CategoryLocalVO {
	s.Id = &v
	return s
}

func (s *CategoryLocalVO) SetSiteId(v int64) *CategoryLocalVO {
	s.SiteId = &v
	return s
}

func (s *CategoryLocalVO) SetTitle(v string) *CategoryLocalVO {
	s.Title = &v
	return s
}

func (s *CategoryLocalVO) SetType(v int64) *CategoryLocalVO {
	s.Type = &v
	return s
}

func (s *CategoryLocalVO) SetSort(v int64) *CategoryLocalVO {
	s.Sort = &v
	return s
}

func (s *CategoryLocalVO) SetLevel(v int64) *CategoryLocalVO {
	s.Level = &v
	return s
}

func (s *CategoryLocalVO) SetParentId(v string) *CategoryLocalVO {
	s.ParentId = &v
	return s
}

func (s *CategoryLocalVO) SetSourceType(v int64) *CategoryLocalVO {
	s.SourceType = &v
	return s
}

func (s *CategoryLocalVO) SetShowType(v int64) *CategoryLocalVO {
	s.ShowType = &v
	return s
}

func (s *CategoryLocalVO) SetExtId(v string) *CategoryLocalVO {
	s.ExtId = &v
	return s
}

func (s *CategoryLocalVO) SetShieId(v int64) *CategoryLocalVO {
	s.ShieId = &v
	return s
}

func (s *CategoryLocalVO) SetStatus(v int64) *CategoryLocalVO {
	s.Status = &v
	return s
}

func (s *CategoryLocalVO) SetDeleted(v int64) *CategoryLocalVO {
	s.Deleted = &v
	return s
}

func (s *CategoryLocalVO) SetTree(v string) *CategoryLocalVO {
	s.Tree = &v
	return s
}

func (s *CategoryLocalVO) SetGreen(v int64) *CategoryLocalVO {
	s.Green = &v
	return s
}

func (s *CategoryLocalVO) SetSiteCode(v string) *CategoryLocalVO {
	s.SiteCode = &v
	return s
}

func (s *CategoryLocalVO) SetCreatedTime(v string) *CategoryLocalVO {
	s.CreatedTime = &v
	return s
}

func (s *CategoryLocalVO) SetModifiedTime(v string) *CategoryLocalVO {
	s.ModifiedTime = &v
	return s
}

func (s *CategoryLocalVO) SetIsCatalogue(v bool) *CategoryLocalVO {
	s.IsCatalogue = &v
	return s
}

// 线索信息请求
type ClueInformationReq struct {
	// 线索标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 线索跟进人  工号
	CreatedUserNick *string `json:"created_user_nick,omitempty" xml:"created_user_nick,omitempty" require:"true"`
	// 线索描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 业务线
	BizLine *string `json:"biz_line,omitempty" xml:"biz_line,omitempty" require:"true"`
	// 客户地址
	CustomerLocation *string `json:"customer_location,omitempty" xml:"customer_location,omitempty" require:"true"`
	// 公司联系人
	CorporateContacts []*CorporateContacts `json:"corporate_contacts,omitempty" xml:"corporate_contacts,omitempty" type:"Repeated"`
	// 客户所在行业
	CustomerIndustry *string `json:"customer_industry,omitempty" xml:"customer_industry,omitempty" require:"true"`
	// 客户营收规模
	RevenueScale *string `json:"revenue_scale,omitempty" xml:"revenue_scale,omitempty"`
	// 社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty"`
	// 线索来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s ClueInformationReq) String() string {
	return tea.Prettify(s)
}

func (s ClueInformationReq) GoString() string {
	return s.String()
}

func (s *ClueInformationReq) SetTitle(v string) *ClueInformationReq {
	s.Title = &v
	return s
}

func (s *ClueInformationReq) SetStatus(v string) *ClueInformationReq {
	s.Status = &v
	return s
}

func (s *ClueInformationReq) SetCreatedUserNick(v string) *ClueInformationReq {
	s.CreatedUserNick = &v
	return s
}

func (s *ClueInformationReq) SetDescription(v string) *ClueInformationReq {
	s.Description = &v
	return s
}

func (s *ClueInformationReq) SetCustomerName(v string) *ClueInformationReq {
	s.CustomerName = &v
	return s
}

func (s *ClueInformationReq) SetBizLine(v string) *ClueInformationReq {
	s.BizLine = &v
	return s
}

func (s *ClueInformationReq) SetCustomerLocation(v string) *ClueInformationReq {
	s.CustomerLocation = &v
	return s
}

func (s *ClueInformationReq) SetCorporateContacts(v []*CorporateContacts) *ClueInformationReq {
	s.CorporateContacts = v
	return s
}

func (s *ClueInformationReq) SetCustomerIndustry(v string) *ClueInformationReq {
	s.CustomerIndustry = &v
	return s
}

func (s *ClueInformationReq) SetRevenueScale(v string) *ClueInformationReq {
	s.RevenueScale = &v
	return s
}

func (s *ClueInformationReq) SetSocialCreditCode(v string) *ClueInformationReq {
	s.SocialCreditCode = &v
	return s
}

func (s *ClueInformationReq) SetSource(v string) *ClueInformationReq {
	s.Source = &v
	return s
}

func (s *ClueInformationReq) SetCustomerId(v string) *ClueInformationReq {
	s.CustomerId = &v
	return s
}

func (s *ClueInformationReq) SetTenant(v string) *ClueInformationReq {
	s.Tenant = &v
	return s
}

// 内容对象
type ContentObjVO struct {
	// novice_must_sees
	NoviceMustSees []*NoviceMustSee `json:"novice_must_sees,omitempty" xml:"novice_must_sees,omitempty" type:"Repeated"`
	// popular_document
	PopularDocument []*PopularDocument `json:"popular_document,omitempty" xml:"popular_document,omitempty" type:"Repeated"`
	// product_presentation
	ProductPresentation *string `json:"product_presentation,omitempty" xml:"product_presentation,omitempty"`
}

func (s ContentObjVO) String() string {
	return tea.Prettify(s)
}

func (s ContentObjVO) GoString() string {
	return s.String()
}

func (s *ContentObjVO) SetNoviceMustSees(v []*NoviceMustSee) *ContentObjVO {
	s.NoviceMustSees = v
	return s
}

func (s *ContentObjVO) SetPopularDocument(v []*PopularDocument) *ContentObjVO {
	s.PopularDocument = v
	return s
}

func (s *ContentObjVO) SetProductPresentation(v string) *ContentObjVO {
	s.ProductPresentation = &v
	return s
}

// 优惠券模型
type Coupon struct {
	// 优惠券ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 优惠券名称,前端展示
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 优惠券模板名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 已使用金额，单位（分）。
	UsedAmount *string `json:"used_amount,omitempty" xml:"used_amount,omitempty"`
	// 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模板id
	YouhuiTemplateId *int64 `json:"youhui_template_id,omitempty" xml:"youhui_template_id,omitempty" require:"true"`
	// 优惠券=折扣券时使用，如0.75
	DiscountRate *string `json:"discount_rate,omitempty" xml:"discount_rate,omitempty"`
	// 优惠券类型=满减券时使用，如满2000元
	FullAmount *string `json:"full_amount,omitempty" xml:"full_amount,omitempty"`
	// 可以使用的总次数
	UsageCount *int64 `json:"usage_count,omitempty" xml:"usage_count,omitempty" require:"true"`
	// 已使用次数（冻结次数）
	UsedCount *int64 `json:"used_count,omitempty" xml:"used_count,omitempty" require:"true"`
	// 适用产品：通用/ECS/RDS
	ProductList *string `json:"product_list,omitempty" xml:"product_list,omitempty" require:"true"`
	// 适用订单类型
	OrderTypeList *string `json:"order_type_list,omitempty" xml:"order_type_list,omitempty" require:"true"`
	//  币种CurrencyCode CNY 代表人民币 USD代表美元
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
	HighPrecisionAmount *string `json:"high_precision_amount,omitempty" xml:"high_precision_amount,omitempty" require:"true"`
	// 单位元
	HighPrecisionUsedAmount *string `json:"high_precision_used_amount,omitempty" xml:"high_precision_used_amount,omitempty" require:"true"`
	// 单位元
	HighPrecisionAvailableAmount *string `json:"high_precision_available_amount,omitempty" xml:"high_precision_available_amount,omitempty" require:"true"`
}

func (s Coupon) String() string {
	return tea.Prettify(s)
}

func (s Coupon) GoString() string {
	return s.String()
}

func (s *Coupon) SetId(v int64) *Coupon {
	s.Id = &v
	return s
}

func (s *Coupon) SetDisplayName(v string) *Coupon {
	s.DisplayName = &v
	return s
}

func (s *Coupon) SetName(v string) *Coupon {
	s.Name = &v
	return s
}

func (s *Coupon) SetType(v string) *Coupon {
	s.Type = &v
	return s
}

func (s *Coupon) SetAmount(v string) *Coupon {
	s.Amount = &v
	return s
}

func (s *Coupon) SetUsedAmount(v string) *Coupon {
	s.UsedAmount = &v
	return s
}

func (s *Coupon) SetStatus(v string) *Coupon {
	s.Status = &v
	return s
}

func (s *Coupon) SetStartTime(v string) *Coupon {
	s.StartTime = &v
	return s
}

func (s *Coupon) SetEndTime(v string) *Coupon {
	s.EndTime = &v
	return s
}

func (s *Coupon) SetYouhuiTemplateId(v int64) *Coupon {
	s.YouhuiTemplateId = &v
	return s
}

func (s *Coupon) SetDiscountRate(v string) *Coupon {
	s.DiscountRate = &v
	return s
}

func (s *Coupon) SetFullAmount(v string) *Coupon {
	s.FullAmount = &v
	return s
}

func (s *Coupon) SetUsageCount(v int64) *Coupon {
	s.UsageCount = &v
	return s
}

func (s *Coupon) SetUsedCount(v int64) *Coupon {
	s.UsedCount = &v
	return s
}

func (s *Coupon) SetProductList(v string) *Coupon {
	s.ProductList = &v
	return s
}

func (s *Coupon) SetOrderTypeList(v string) *Coupon {
	s.OrderTypeList = &v
	return s
}

func (s *Coupon) SetCurrency(v string) *Coupon {
	s.Currency = &v
	return s
}

func (s *Coupon) SetHighPrecisionAmount(v string) *Coupon {
	s.HighPrecisionAmount = &v
	return s
}

func (s *Coupon) SetHighPrecisionUsedAmount(v string) *Coupon {
	s.HighPrecisionUsedAmount = &v
	return s
}

func (s *Coupon) SetHighPrecisionAvailableAmount(v string) *Coupon {
	s.HighPrecisionAvailableAmount = &v
	return s
}

type QueryCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 优惠券模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 查询范围，有效：AVAILABLE / 全部: ALL；不传默认查询有效
	Scope *string `json:"scope,omitempty" xml:"scope,omitempty"`
}

func (s QueryCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponRequest) GoString() string {
	return s.String()
}

func (s *QueryCouponRequest) SetAuthToken(v string) *QueryCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCouponRequest) SetTenantId(v string) *QueryCouponRequest {
	s.TenantId = &v
	return s
}

func (s *QueryCouponRequest) SetTemplateId(v string) *QueryCouponRequest {
	s.TemplateId = &v
	return s
}

func (s *QueryCouponRequest) SetScope(v string) *QueryCouponRequest {
	s.Scope = &v
	return s
}

type QueryCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券列表
	CouponList []*Coupon `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
}

func (s QueryCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponResponse) GoString() string {
	return s.String()
}

func (s *QueryCouponResponse) SetReqMsgId(v string) *QueryCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCouponResponse) SetResultCode(v string) *QueryCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCouponResponse) SetResultMsg(v string) *QueryCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCouponResponse) SetCouponList(v []*Coupon) *QueryCouponResponse {
	s.CouponList = v
	return s
}

type SendCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 外部业务流水号，用于幂等判断
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 优惠券模板ID，营销后台申请获取
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s SendCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCouponRequest) GoString() string {
	return s.String()
}

func (s *SendCouponRequest) SetAuthToken(v string) *SendCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCouponRequest) SetBizNo(v string) *SendCouponRequest {
	s.BizNo = &v
	return s
}

func (s *SendCouponRequest) SetTenantId(v string) *SendCouponRequest {
	s.TenantId = &v
	return s
}

func (s *SendCouponRequest) SetTemplateId(v string) *SendCouponRequest {
	s.TemplateId = &v
	return s
}

type SendCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券id
	CouponId *int64 `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s SendCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCouponResponse) GoString() string {
	return s.String()
}

func (s *SendCouponResponse) SetReqMsgId(v string) *SendCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCouponResponse) SetResultCode(v string) *SendCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCouponResponse) SetResultMsg(v string) *SendCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendCouponResponse) SetCouponId(v int64) *SendCouponResponse {
	s.CouponId = &v
	return s
}

type CreateLeadClueRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 补登线索,客户信息
	Request *ClueInformationReq `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 线索来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 企业名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
	// tenant+source+customerName唯一确定一条线索。
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
}

func (s CreateLeadClueRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeadClueRequest) GoString() string {
	return s.String()
}

func (s *CreateLeadClueRequest) SetAuthToken(v string) *CreateLeadClueRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeadClueRequest) SetRequest(v *ClueInformationReq) *CreateLeadClueRequest {
	s.Request = v
	return s
}

func (s *CreateLeadClueRequest) SetSource(v string) *CreateLeadClueRequest {
	s.Source = &v
	return s
}

func (s *CreateLeadClueRequest) SetCustomerName(v string) *CreateLeadClueRequest {
	s.CustomerName = &v
	return s
}

func (s *CreateLeadClueRequest) SetTenantName(v string) *CreateLeadClueRequest {
	s.TenantName = &v
	return s
}

type CreateLeadClueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功与否
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 客户id，行业线自己的会员id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 线索id，中台侧线索唯一号
	LeadId *string `json:"lead_id,omitempty" xml:"lead_id,omitempty"`
}

func (s CreateLeadClueResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeadClueResponse) GoString() string {
	return s.String()
}

func (s *CreateLeadClueResponse) SetReqMsgId(v string) *CreateLeadClueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeadClueResponse) SetResultCode(v string) *CreateLeadClueResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeadClueResponse) SetResultMsg(v string) *CreateLeadClueResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeadClueResponse) SetResult(v bool) *CreateLeadClueResponse {
	s.Result = &v
	return s
}

func (s *CreateLeadClueResponse) SetCustomerId(v string) *CreateLeadClueResponse {
	s.CustomerId = &v
	return s
}

func (s *CreateLeadClueResponse) SetLeadId(v string) *CreateLeadClueResponse {
	s.LeadId = &v
	return s
}

type AddLeadBusinessRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商机信息
	Request []*BusinessRequest `json:"request,omitempty" xml:"request,omitempty" require:"true" type:"Repeated"`
	// 线索服务化，多租户模型
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
}

func (s AddLeadBusinessRequest) String() string {
	return tea.Prettify(s)
}

func (s AddLeadBusinessRequest) GoString() string {
	return s.String()
}

func (s *AddLeadBusinessRequest) SetAuthToken(v string) *AddLeadBusinessRequest {
	s.AuthToken = &v
	return s
}

func (s *AddLeadBusinessRequest) SetRequest(v []*BusinessRequest) *AddLeadBusinessRequest {
	s.Request = v
	return s
}

func (s *AddLeadBusinessRequest) SetTenantName(v string) *AddLeadBusinessRequest {
	s.TenantName = &v
	return s
}

type AddLeadBusinessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 新增的商机列表。正常情况下会返回新增的商机列表
	BusinessIds []*string `json:"business_ids,omitempty" xml:"business_ids,omitempty" type:"Repeated"`
}

func (s AddLeadBusinessResponse) String() string {
	return tea.Prettify(s)
}

func (s AddLeadBusinessResponse) GoString() string {
	return s.String()
}

func (s *AddLeadBusinessResponse) SetReqMsgId(v string) *AddLeadBusinessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddLeadBusinessResponse) SetResultCode(v string) *AddLeadBusinessResponse {
	s.ResultCode = &v
	return s
}

func (s *AddLeadBusinessResponse) SetResultMsg(v string) *AddLeadBusinessResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddLeadBusinessResponse) SetResult(v bool) *AddLeadBusinessResponse {
	s.Result = &v
	return s
}

func (s *AddLeadBusinessResponse) SetBusinessIds(v []*string) *AddLeadBusinessResponse {
	s.BusinessIds = v
	return s
}

type QueryCouponPageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCodes *string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true"`
	// 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
	//
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 当前页，默认第一页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页显示数量，默认10条
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryCouponPageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponPageRequest) GoString() string {
	return s.String()
}

func (s *QueryCouponPageRequest) SetAuthToken(v string) *QueryCouponPageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCouponPageRequest) SetTenantId(v string) *QueryCouponPageRequest {
	s.TenantId = &v
	return s
}

func (s *QueryCouponPageRequest) SetProductCodes(v string) *QueryCouponPageRequest {
	s.ProductCodes = &v
	return s
}

func (s *QueryCouponPageRequest) SetCouponType(v string) *QueryCouponPageRequest {
	s.CouponType = &v
	return s
}

func (s *QueryCouponPageRequest) SetPageNo(v int64) *QueryCouponPageRequest {
	s.PageNo = &v
	return s
}

func (s *QueryCouponPageRequest) SetPageSize(v int64) *QueryCouponPageRequest {
	s.PageSize = &v
	return s
}

type QueryCouponPageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券列表
	CouponList []*Coupon `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页显示行数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryCouponPageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponPageResponse) GoString() string {
	return s.String()
}

func (s *QueryCouponPageResponse) SetReqMsgId(v string) *QueryCouponPageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCouponPageResponse) SetResultCode(v string) *QueryCouponPageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCouponPageResponse) SetResultMsg(v string) *QueryCouponPageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCouponPageResponse) SetCouponList(v []*Coupon) *QueryCouponPageResponse {
	s.CouponList = v
	return s
}

func (s *QueryCouponPageResponse) SetCurrentPage(v int64) *QueryCouponPageResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryCouponPageResponse) SetPageSize(v int64) *QueryCouponPageResponse {
	s.PageSize = &v
	return s
}

func (s *QueryCouponPageResponse) SetTotalCount(v int64) *QueryCouponPageResponse {
	s.TotalCount = &v
	return s
}

type QueryCouponPagelistRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	// 可多选 多个产品间用 , 分隔  如
	// ABC,DEF,GHI
	ProductCodes *string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true"`
	// 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
	//
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 当前页，默认第一页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 每页显示数量，默认10条
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 币种，不传默认CNY人民币。
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s QueryCouponPagelistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponPagelistRequest) GoString() string {
	return s.String()
}

func (s *QueryCouponPagelistRequest) SetAuthToken(v string) *QueryCouponPagelistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetTenantId(v string) *QueryCouponPagelistRequest {
	s.TenantId = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetProductCodes(v string) *QueryCouponPagelistRequest {
	s.ProductCodes = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetCouponType(v string) *QueryCouponPagelistRequest {
	s.CouponType = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetPageNo(v int64) *QueryCouponPagelistRequest {
	s.PageNo = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetPageSize(v int64) *QueryCouponPagelistRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCouponPagelistRequest) SetCurrency(v string) *QueryCouponPagelistRequest {
	s.Currency = &v
	return s
}

type QueryCouponPagelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券列表
	CouponList []*Coupon `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
	// 当前页
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页显示行数
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数量
	//
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryCouponPagelistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponPagelistResponse) GoString() string {
	return s.String()
}

func (s *QueryCouponPagelistResponse) SetReqMsgId(v string) *QueryCouponPagelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCouponPagelistResponse) SetResultCode(v string) *QueryCouponPagelistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCouponPagelistResponse) SetResultMsg(v string) *QueryCouponPagelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCouponPagelistResponse) SetCouponList(v []*Coupon) *QueryCouponPagelistResponse {
	s.CouponList = v
	return s
}

func (s *QueryCouponPagelistResponse) SetCurrentPage(v int64) *QueryCouponPagelistResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryCouponPagelistResponse) SetPageSize(v int64) *QueryCouponPagelistResponse {
	s.PageSize = &v
	return s
}

func (s *QueryCouponPagelistResponse) SetTotalCount(v int64) *QueryCouponPagelistResponse {
	s.TotalCount = &v
	return s
}

type QueryYouhuiTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 优惠券模板ID
	YouhuiTemplateId *string `json:"youhui_template_id,omitempty" xml:"youhui_template_id,omitempty" require:"true"`
}

func (s QueryYouhuiTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYouhuiTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryYouhuiTemplateRequest) SetAuthToken(v string) *QueryYouhuiTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYouhuiTemplateRequest) SetYouhuiTemplateId(v string) *QueryYouhuiTemplateRequest {
	s.YouhuiTemplateId = &v
	return s
}

type QueryYouhuiTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板类型:APPLY, NORMAL
	TType *string `json:"t_type,omitempty" xml:"t_type,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 模板ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 模板名称
	TName *string `json:"t_name,omitempty" xml:"t_name,omitempty"`
	// 使用场景
	TUseScene *string `json:"t_use_scene,omitempty" xml:"t_use_scene,omitempty"`
	// 模板开始时间
	TStartTime *string `json:"t_start_time,omitempty" xml:"t_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模板有效结束时间
	TEndTime *string `json:"t_end_time,omitempty" xml:"t_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 优惠券允许发放的总数量
	YhMaxRelease *string `json:"yh_max_release,omitempty" xml:"yh_max_release,omitempty"`
	// 券类型
	YhType *string `json:"yh_type,omitempty" xml:"yh_type,omitempty"`
	// 满减条件金额(单位:元)， 如满200
	YhCertainMoney *string `json:"yh_certain_money,omitempty" xml:"yh_certain_money,omitempty"`
	// 生成券的面额(单位:元)
	YhAmount *string `json:"yh_amount,omitempty" xml:"yh_amount,omitempty"`
	// 折扣， 如: 0.75 取值范围(0, 1)
	YhDiscountRate *string `json:"yh_discount_rate,omitempty" xml:"yh_discount_rate,omitempty"`
	// 优惠券使用次数 , 0表示无限制
	YhUsageCount *string `json:"yh_usage_count,omitempty" xml:"yh_usage_count,omitempty"`
	// 相对时间，绝对时间ABSOLUTE/RELATIVE
	YhValidityType *string `json:"yh_validity_type,omitempty" xml:"yh_validity_type,omitempty"`
	// 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
	YhStartTime *string `json:"yh_start_time,omitempty" xml:"yh_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
	YhEndTime *string `json:"yh_end_time,omitempty" xml:"yh_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
	YhRelativeSecond *int64 `json:"yh_relative_second,omitempty" xml:"yh_relative_second,omitempty"`
	// 每人限领数量
	YhPerLimitNum *int64 `json:"yh_per_limit_num,omitempty" xml:"yh_per_limit_num,omitempty"`
	// 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
	YhUniversalType *string `json:"yh_universal_type,omitempty" xml:"yh_universal_type,omitempty"`
	// 模板状态 APPROVED审批通过，生效中
	TStatus *string `json:"t_status,omitempty" xml:"t_status,omitempty"`
	// 优惠券发券总额、总数量控制
	YhControlType *string `json:"yh_control_type,omitempty" xml:"yh_control_type,omitempty"`
	// 申请原因
	TReason *string `json:"t_reason,omitempty" xml:"t_reason,omitempty"`
	// 优惠条件备注，显示用
	YhDescription *string `json:"yh_description,omitempty" xml:"yh_description,omitempty"`
	// 创建人, 系统操作为 应用名, 员工操作设置为工号
	TCreator *string `json:"t_creator,omitempty" xml:"t_creator,omitempty"`
	// 最后修改人, 系统操作为 应用名, 员工操作设置为工号
	TModifier *string `json:"t_modifier,omitempty" xml:"t_modifier,omitempty"`
	// 创建时间
	TGmtCreate *string `json:"t_gmt_create,omitempty" xml:"t_gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 最后修改时间
	TGmtModified *string `json:"t_gmt_modified,omitempty" xml:"t_gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
	ItemCodeSet []*string `json:"item_code_set,omitempty" xml:"item_code_set,omitempty" type:"Repeated"`
}

func (s QueryYouhuiTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYouhuiTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryYouhuiTemplateResponse) SetReqMsgId(v string) *QueryYouhuiTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetResultCode(v string) *QueryYouhuiTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetResultMsg(v string) *QueryYouhuiTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTType(v string) *QueryYouhuiTemplateResponse {
	s.TType = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetCurrency(v string) *QueryYouhuiTemplateResponse {
	s.Currency = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetId(v int64) *QueryYouhuiTemplateResponse {
	s.Id = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTName(v string) *QueryYouhuiTemplateResponse {
	s.TName = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTUseScene(v string) *QueryYouhuiTemplateResponse {
	s.TUseScene = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTStartTime(v string) *QueryYouhuiTemplateResponse {
	s.TStartTime = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTEndTime(v string) *QueryYouhuiTemplateResponse {
	s.TEndTime = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhMaxRelease(v string) *QueryYouhuiTemplateResponse {
	s.YhMaxRelease = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhType(v string) *QueryYouhuiTemplateResponse {
	s.YhType = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhCertainMoney(v string) *QueryYouhuiTemplateResponse {
	s.YhCertainMoney = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhAmount(v string) *QueryYouhuiTemplateResponse {
	s.YhAmount = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhDiscountRate(v string) *QueryYouhuiTemplateResponse {
	s.YhDiscountRate = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhUsageCount(v string) *QueryYouhuiTemplateResponse {
	s.YhUsageCount = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhValidityType(v string) *QueryYouhuiTemplateResponse {
	s.YhValidityType = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhStartTime(v string) *QueryYouhuiTemplateResponse {
	s.YhStartTime = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhEndTime(v string) *QueryYouhuiTemplateResponse {
	s.YhEndTime = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhRelativeSecond(v int64) *QueryYouhuiTemplateResponse {
	s.YhRelativeSecond = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhPerLimitNum(v int64) *QueryYouhuiTemplateResponse {
	s.YhPerLimitNum = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhUniversalType(v string) *QueryYouhuiTemplateResponse {
	s.YhUniversalType = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTStatus(v string) *QueryYouhuiTemplateResponse {
	s.TStatus = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhControlType(v string) *QueryYouhuiTemplateResponse {
	s.YhControlType = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTReason(v string) *QueryYouhuiTemplateResponse {
	s.TReason = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetYhDescription(v string) *QueryYouhuiTemplateResponse {
	s.YhDescription = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTCreator(v string) *QueryYouhuiTemplateResponse {
	s.TCreator = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTModifier(v string) *QueryYouhuiTemplateResponse {
	s.TModifier = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTGmtCreate(v string) *QueryYouhuiTemplateResponse {
	s.TGmtCreate = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetTGmtModified(v string) *QueryYouhuiTemplateResponse {
	s.TGmtModified = &v
	return s
}

func (s *QueryYouhuiTemplateResponse) SetItemCodeSet(v []*string) *QueryYouhuiTemplateResponse {
	s.ItemCodeSet = v
	return s
}

type SendCouponAnnotatedRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 优惠券模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 幂等号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s SendCouponAnnotatedRequest) String() string {
	return tea.Prettify(s)
}

func (s SendCouponAnnotatedRequest) GoString() string {
	return s.String()
}

func (s *SendCouponAnnotatedRequest) SetAuthToken(v string) *SendCouponAnnotatedRequest {
	s.AuthToken = &v
	return s
}

func (s *SendCouponAnnotatedRequest) SetTenantId(v string) *SendCouponAnnotatedRequest {
	s.TenantId = &v
	return s
}

func (s *SendCouponAnnotatedRequest) SetTemplateId(v string) *SendCouponAnnotatedRequest {
	s.TemplateId = &v
	return s
}

func (s *SendCouponAnnotatedRequest) SetBizNo(v string) *SendCouponAnnotatedRequest {
	s.BizNo = &v
	return s
}

type SendCouponAnnotatedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券id
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s SendCouponAnnotatedResponse) String() string {
	return tea.Prettify(s)
}

func (s SendCouponAnnotatedResponse) GoString() string {
	return s.String()
}

func (s *SendCouponAnnotatedResponse) SetReqMsgId(v string) *SendCouponAnnotatedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendCouponAnnotatedResponse) SetResultCode(v string) *SendCouponAnnotatedResponse {
	s.ResultCode = &v
	return s
}

func (s *SendCouponAnnotatedResponse) SetResultMsg(v string) *SendCouponAnnotatedResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendCouponAnnotatedResponse) SetCouponId(v string) *SendCouponAnnotatedResponse {
	s.CouponId = &v
	return s
}

type QueryDocRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 文档id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 内容id
	SiteId *string `json:"site_id,omitempty" xml:"site_id,omitempty" require:"true"`
}

func (s QueryDocRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDocRequest) GoString() string {
	return s.String()
}

func (s *QueryDocRequest) SetAuthToken(v string) *QueryDocRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDocRequest) SetId(v string) *QueryDocRequest {
	s.Id = &v
	return s
}

func (s *QueryDocRequest) SetSiteId(v string) *QueryDocRequest {
	s.SiteId = &v
	return s
}

type QueryDocResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内部id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 文档id
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty"`
	// 文档标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 站点
	Site *string `json:"site,omitempty" xml:"site,omitempty"`
	// 语言code
	Language *string `json:"language,omitempty" xml:"language,omitempty"`
	// 内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 类型
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// 最后修改时间
	ExtModifiedTime *int64 `json:"ext_modified_time,omitempty" xml:"ext_modified_time,omitempty"`
	// 关键字
	KeyWords *string `json:"key_words,omitempty" xml:"key_words,omitempty"`
	// 显示类型
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// 页面上下文
	PageContext []*PageContext `json:"page_context,omitempty" xml:"page_context,omitempty" type:"Repeated"`
	// 内容对象
	//
	//
	ContentObj []*ContentObjVO `json:"content_obj,omitempty" xml:"content_obj,omitempty" type:"Repeated"`
}

func (s QueryDocResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDocResponse) GoString() string {
	return s.String()
}

func (s *QueryDocResponse) SetReqMsgId(v string) *QueryDocResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDocResponse) SetResultCode(v string) *QueryDocResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDocResponse) SetResultMsg(v string) *QueryDocResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDocResponse) SetId(v int64) *QueryDocResponse {
	s.Id = &v
	return s
}

func (s *QueryDocResponse) SetDocId(v string) *QueryDocResponse {
	s.DocId = &v
	return s
}

func (s *QueryDocResponse) SetTitle(v string) *QueryDocResponse {
	s.Title = &v
	return s
}

func (s *QueryDocResponse) SetSite(v string) *QueryDocResponse {
	s.Site = &v
	return s
}

func (s *QueryDocResponse) SetLanguage(v string) *QueryDocResponse {
	s.Language = &v
	return s
}

func (s *QueryDocResponse) SetContent(v string) *QueryDocResponse {
	s.Content = &v
	return s
}

func (s *QueryDocResponse) SetSourceType(v int64) *QueryDocResponse {
	s.SourceType = &v
	return s
}

func (s *QueryDocResponse) SetExtModifiedTime(v int64) *QueryDocResponse {
	s.ExtModifiedTime = &v
	return s
}

func (s *QueryDocResponse) SetKeyWords(v string) *QueryDocResponse {
	s.KeyWords = &v
	return s
}

func (s *QueryDocResponse) SetShowType(v int64) *QueryDocResponse {
	s.ShowType = &v
	return s
}

func (s *QueryDocResponse) SetPageContext(v []*PageContext) *QueryDocResponse {
	s.PageContext = v
	return s
}

func (s *QueryDocResponse) SetContentObj(v []*ContentObjVO) *QueryDocResponse {
	s.ContentObj = v
	return s
}

type QueryDocChildRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 文档id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 目录id
	SiteId *string `json:"site_id,omitempty" xml:"site_id,omitempty" require:"true"`
}

func (s QueryDocChildRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDocChildRequest) GoString() string {
	return s.String()
}

func (s *QueryDocChildRequest) SetAuthToken(v string) *QueryDocChildRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDocChildRequest) SetId(v string) *QueryDocChildRequest {
	s.Id = &v
	return s
}

func (s *QueryDocChildRequest) SetSiteId(v string) *QueryDocChildRequest {
	s.SiteId = &v
	return s
}

type QueryDocChildResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内部id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 内容库id
	SiteId *int64 `json:"site_id,omitempty" xml:"site_id,omitempty"`
	// 站点
	Site *string `json:"site,omitempty" xml:"site,omitempty"`
	// 语言code
	Language *string `json:"language,omitempty" xml:"language,omitempty"`
	// 名称
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 类型
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 展示类型 1为左侧展示2为列表展示
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// 排序
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty"`
	// 目录层级
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// 外标id
	ExtId *string `json:"ext_id,omitempty" xml:"ext_id,omitempty"`
	// 父id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// 来源类型
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 语雀目录有无数据判定
	CatalogueType *int64 `json:"catalogue_type,omitempty" xml:"catalogue_type,omitempty"`
	// children
	Children []*CategoryVO `json:"children,omitempty" xml:"children,omitempty" type:"Repeated"`
}

func (s QueryDocChildResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDocChildResponse) GoString() string {
	return s.String()
}

func (s *QueryDocChildResponse) SetReqMsgId(v string) *QueryDocChildResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDocChildResponse) SetResultCode(v string) *QueryDocChildResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDocChildResponse) SetResultMsg(v string) *QueryDocChildResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDocChildResponse) SetId(v int64) *QueryDocChildResponse {
	s.Id = &v
	return s
}

func (s *QueryDocChildResponse) SetSiteId(v int64) *QueryDocChildResponse {
	s.SiteId = &v
	return s
}

func (s *QueryDocChildResponse) SetSite(v string) *QueryDocChildResponse {
	s.Site = &v
	return s
}

func (s *QueryDocChildResponse) SetLanguage(v string) *QueryDocChildResponse {
	s.Language = &v
	return s
}

func (s *QueryDocChildResponse) SetTitle(v string) *QueryDocChildResponse {
	s.Title = &v
	return s
}

func (s *QueryDocChildResponse) SetType(v int64) *QueryDocChildResponse {
	s.Type = &v
	return s
}

func (s *QueryDocChildResponse) SetShowType(v int64) *QueryDocChildResponse {
	s.ShowType = &v
	return s
}

func (s *QueryDocChildResponse) SetSort(v int64) *QueryDocChildResponse {
	s.Sort = &v
	return s
}

func (s *QueryDocChildResponse) SetLevel(v int64) *QueryDocChildResponse {
	s.Level = &v
	return s
}

func (s *QueryDocChildResponse) SetExtId(v string) *QueryDocChildResponse {
	s.ExtId = &v
	return s
}

func (s *QueryDocChildResponse) SetParentId(v string) *QueryDocChildResponse {
	s.ParentId = &v
	return s
}

func (s *QueryDocChildResponse) SetSourceType(v int64) *QueryDocChildResponse {
	s.SourceType = &v
	return s
}

func (s *QueryDocChildResponse) SetVersion(v string) *QueryDocChildResponse {
	s.Version = &v
	return s
}

func (s *QueryDocChildResponse) SetCatalogueType(v int64) *QueryDocChildResponse {
	s.CatalogueType = &v
	return s
}

func (s *QueryDocChildResponse) SetChildren(v []*CategoryVO) *QueryDocChildResponse {
	s.Children = v
	return s
}

type QueryCouponAvaliableRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商品code
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true" type:"Repeated"`
	// 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 业务发生时间
	BizTime *string `json:"biz_time,omitempty" xml:"biz_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易币种 CNY 人民币 USD美元
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
}

func (s QueryCouponAvaliableRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponAvaliableRequest) GoString() string {
	return s.String()
}

func (s *QueryCouponAvaliableRequest) SetAuthToken(v string) *QueryCouponAvaliableRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCouponAvaliableRequest) SetTenantId(v string) *QueryCouponAvaliableRequest {
	s.TenantId = &v
	return s
}

func (s *QueryCouponAvaliableRequest) SetProductCodes(v []*string) *QueryCouponAvaliableRequest {
	s.ProductCodes = v
	return s
}

func (s *QueryCouponAvaliableRequest) SetCouponType(v string) *QueryCouponAvaliableRequest {
	s.CouponType = &v
	return s
}

func (s *QueryCouponAvaliableRequest) SetBizTime(v string) *QueryCouponAvaliableRequest {
	s.BizTime = &v
	return s
}

func (s *QueryCouponAvaliableRequest) SetCurrency(v string) *QueryCouponAvaliableRequest {
	s.Currency = &v
	return s
}

type QueryCouponAvaliableResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券列表
	CouponList []*Coupon `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
}

func (s QueryCouponAvaliableResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCouponAvaliableResponse) GoString() string {
	return s.String()
}

func (s *QueryCouponAvaliableResponse) SetReqMsgId(v string) *QueryCouponAvaliableResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCouponAvaliableResponse) SetResultCode(v string) *QueryCouponAvaliableResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCouponAvaliableResponse) SetResultMsg(v string) *QueryCouponAvaliableResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCouponAvaliableResponse) SetCouponList(v []*Coupon) *QueryCouponAvaliableResponse {
	s.CouponList = v
	return s
}

type SubmitActivityInformationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 活动标识
	ActivityId *string `json:"activity_id,omitempty" xml:"activity_id,omitempty" require:"true"`
	// 渠道编码
	ActivityChannel *string `json:"activity_channel,omitempty" xml:"activity_channel,omitempty" require:"true"`
	// 活动表单
	ActivityFormData *string `json:"activity_form_data,omitempty" xml:"activity_form_data,omitempty" require:"true"`
	// 提交时间，ISO_DATE_TIME 时间格式
	SubmitDate *string `json:"submit_date,omitempty" xml:"submit_date,omitempty"`
	// 情报标识，存在则更新
	InformationId *string `json:"information_id,omitempty" xml:"information_id,omitempty"`
	// 可选附件
	Attachments []*Attachment `json:"attachments,omitempty" xml:"attachments,omitempty" type:"Repeated"`
}

func (s SubmitActivityInformationRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitActivityInformationRequest) GoString() string {
	return s.String()
}

func (s *SubmitActivityInformationRequest) SetAuthToken(v string) *SubmitActivityInformationRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetActivityId(v string) *SubmitActivityInformationRequest {
	s.ActivityId = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetActivityChannel(v string) *SubmitActivityInformationRequest {
	s.ActivityChannel = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetActivityFormData(v string) *SubmitActivityInformationRequest {
	s.ActivityFormData = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetSubmitDate(v string) *SubmitActivityInformationRequest {
	s.SubmitDate = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetInformationId(v string) *SubmitActivityInformationRequest {
	s.InformationId = &v
	return s
}

func (s *SubmitActivityInformationRequest) SetAttachments(v []*Attachment) *SubmitActivityInformationRequest {
	s.Attachments = v
	return s
}

type SubmitActivityInformationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 情报标识
	InformationId *string `json:"information_id,omitempty" xml:"information_id,omitempty"`
}

func (s SubmitActivityInformationResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitActivityInformationResponse) GoString() string {
	return s.String()
}

func (s *SubmitActivityInformationResponse) SetReqMsgId(v string) *SubmitActivityInformationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitActivityInformationResponse) SetResultCode(v string) *SubmitActivityInformationResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitActivityInformationResponse) SetResultMsg(v string) *SubmitActivityInformationResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitActivityInformationResponse) SetInformationId(v string) *SubmitActivityInformationResponse {
	s.InformationId = &v
	return s
}

type SyncActivityAssetsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 情报标识
	InformationId *string `json:"information_id,omitempty" xml:"information_id,omitempty" require:"true"`
	// 附件信息
	Attachments []*Attachment `json:"attachments,omitempty" xml:"attachments,omitempty" require:"true" type:"Repeated"`
	// 资产详情列表
	Assets []*Asset `json:"assets,omitempty" xml:"assets,omitempty" require:"true" type:"Repeated"`
}

func (s SyncActivityAssetsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncActivityAssetsRequest) GoString() string {
	return s.String()
}

func (s *SyncActivityAssetsRequest) SetAuthToken(v string) *SyncActivityAssetsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncActivityAssetsRequest) SetInformationId(v string) *SyncActivityAssetsRequest {
	s.InformationId = &v
	return s
}

func (s *SyncActivityAssetsRequest) SetAttachments(v []*Attachment) *SyncActivityAssetsRequest {
	s.Attachments = v
	return s
}

func (s *SyncActivityAssetsRequest) SetAssets(v []*Asset) *SyncActivityAssetsRequest {
	s.Assets = v
	return s
}

type SyncActivityAssetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncActivityAssetsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncActivityAssetsResponse) GoString() string {
	return s.String()
}

func (s *SyncActivityAssetsResponse) SetReqMsgId(v string) *SyncActivityAssetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncActivityAssetsResponse) SetResultCode(v string) *SyncActivityAssetsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncActivityAssetsResponse) SetResultMsg(v string) *SyncActivityAssetsResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.2.0"),
				"_prod_code":       tea.String("MARKETING"),
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
 * Description: 优惠券列表查询接口
 * Summary: 优惠券列表查询接口
 */
func (client *Client) QueryCoupon(request *QueryCouponRequest) (_result *QueryCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCouponResponse{}
	_body, _err := client.QueryCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券列表查询接口
 * Summary: 优惠券列表查询接口
 */
func (client *Client) QueryCouponEx(request *QueryCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口
 */
func (client *Client) SendCoupon(request *SendCouponRequest) (_result *SendCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCouponResponse{}
	_body, _err := client.SendCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口
 */
func (client *Client) SendCouponEx(request *SendCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 会员信息首次创建
 * Summary: 线索数据同步
 */
func (client *Client) CreateLeadClue(request *CreateLeadClueRequest) (_result *CreateLeadClueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeadClueResponse{}
	_body, _err := client.CreateLeadClueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 会员信息首次创建
 * Summary: 线索数据同步
 */
func (client *Client) CreateLeadClueEx(request *CreateLeadClueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeadClueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeadClueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.lead.clue.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新/添加商机
 * Summary: 添加商机
 */
func (client *Client) AddLeadBusiness(request *AddLeadBusinessRequest) (_result *AddLeadBusinessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddLeadBusinessResponse{}
	_body, _err := client.AddLeadBusinessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新/添加商机
 * Summary: 添加商机
 */
func (client *Client) AddLeadBusinessEx(request *AddLeadBusinessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddLeadBusinessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddLeadBusinessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.lead.business.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券查询(不区分可用与不可用)
先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
 * Summary: 分页查询优惠券列表
*/
func (client *Client) QueryCouponPage(request *QueryCouponPageRequest) (_result *QueryCouponPageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCouponPageResponse{}
	_body, _err := client.QueryCouponPageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券查询(不区分可用与不可用)
先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
 * Summary: 分页查询优惠券列表
*/
func (client *Client) QueryCouponPageEx(request *QueryCouponPageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCouponPageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCouponPageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.page.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券查询(不区分可用与不可用)
商品过滤放在SQL里面，从而每页数量一样
 * Summary: 分页查询优惠券列表V2
*/
func (client *Client) QueryCouponPagelist(request *QueryCouponPagelistRequest) (_result *QueryCouponPagelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCouponPagelistResponse{}
	_body, _err := client.QueryCouponPagelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券查询(不区分可用与不可用)
商品过滤放在SQL里面，从而每页数量一样
 * Summary: 分页查询优惠券列表V2
*/
func (client *Client) QueryCouponPagelistEx(request *QueryCouponPagelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCouponPagelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCouponPagelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.pagelist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠模板详情
 * Summary: 优惠模板详情
 */
func (client *Client) QueryYouhuiTemplate(request *QueryYouhuiTemplateRequest) (_result *QueryYouhuiTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYouhuiTemplateResponse{}
	_body, _err := client.QueryYouhuiTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠模板详情
 * Summary: 优惠模板详情
 */
func (client *Client) QueryYouhuiTemplateEx(request *QueryYouhuiTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYouhuiTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYouhuiTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.youhui.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口,含错误返回
 */
func (client *Client) SendCouponAnnotated(request *SendCouponAnnotatedRequest) (_result *SendCouponAnnotatedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendCouponAnnotatedResponse{}
	_body, _err := client.SendCouponAnnotatedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券发放接口，基于模板ID发送优惠券
 * Summary: 优惠券发放接口,含错误返回
 */
func (client *Client) SendCouponAnnotatedEx(request *SendCouponAnnotatedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendCouponAnnotatedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendCouponAnnotatedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.annotated.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取文档内容
 * Summary: 获取文档内容
 */
func (client *Client) QueryDoc(request *QueryDocRequest) (_result *QueryDocResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDocResponse{}
	_body, _err := client.QueryDocEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取文档内容
 * Summary: 获取文档内容
 */
func (client *Client) QueryDocEx(request *QueryDocRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDocResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDocResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.doc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据内容库id和目录id查询子目录
 * Summary: 根据内容库id和目录id查询子目录
 */
func (client *Client) QueryDocChild(request *QueryDocChildRequest) (_result *QueryDocChildResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDocChildResponse{}
	_body, _err := client.QueryDocChildEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据内容库id和目录id查询子目录
 * Summary: 根据内容库id和目录id查询子目录
 */
func (client *Client) QueryDocChildEx(request *QueryDocChildRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDocChildResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDocChildResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.doc.child.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
 * Summary: 查询所有可用优惠券列表
 */
func (client *Client) QueryCouponAvaliable(request *QueryCouponAvaliableRequest) (_result *QueryCouponAvaliableResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCouponAvaliableResponse{}
	_body, _err := client.QueryCouponAvaliableEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
 * Summary: 查询所有可用优惠券列表
 */
func (client *Client) QueryCouponAvaliableEx(request *QueryCouponAvaliableRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCouponAvaliableResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCouponAvaliableResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.coupon.avaliable.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交活动情报数据
 * Summary: 提交活动情报数据
 */
func (client *Client) SubmitActivityInformation(request *SubmitActivityInformationRequest) (_result *SubmitActivityInformationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitActivityInformationResponse{}
	_body, _err := client.SubmitActivityInformationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交活动情报数据
 * Summary: 提交活动情报数据
 */
func (client *Client) SubmitActivityInformationEx(request *SubmitActivityInformationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitActivityInformationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitActivityInformationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.activity.information.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步活动资产信息
 * Summary: 同步活动资产信息
 */
func (client *Client) SyncActivityAssets(request *SyncActivityAssetsRequest) (_result *SyncActivityAssetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncActivityAssetsResponse{}
	_body, _err := client.SyncActivityAssetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步活动资产信息
 * Summary: 同步活动资产信息
 */
func (client *Client) SyncActivityAssetsEx(request *SyncActivityAssetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncActivityAssetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncActivityAssetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.activity.assets.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
