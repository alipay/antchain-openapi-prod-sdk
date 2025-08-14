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

// 机构联系人信息
type InstitutionContactInfo struct {
	// 联系人
	ContactPerson *string `json:"contact_person,omitempty" xml:"contact_person,omitempty" require:"true"`
	// 联系人邮箱
	ContactEmail *string `json:"contact_email,omitempty" xml:"contact_email,omitempty" require:"true"`
}

func (s InstitutionContactInfo) String() string {
	return tea.Prettify(s)
}

func (s InstitutionContactInfo) GoString() string {
	return s.String()
}

func (s *InstitutionContactInfo) SetContactPerson(v string) *InstitutionContactInfo {
	s.ContactPerson = &v
	return s
}

func (s *InstitutionContactInfo) SetContactEmail(v string) *InstitutionContactInfo {
	s.ContactEmail = &v
	return s
}

// 密钥管理项目信息
type KeyProjectInfo struct {
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// key使用类型
	// MINT：发行密钥
	// BURN：赎回密钥
	// TRANSFER：转账密钥
	// MANAGER：管理密钥
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
	// 创建时间
	GmtCreated *string `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s KeyProjectInfo) String() string {
	return tea.Prettify(s)
}

func (s KeyProjectInfo) GoString() string {
	return s.String()
}

func (s *KeyProjectInfo) SetName(v string) *KeyProjectInfo {
	s.Name = &v
	return s
}

func (s *KeyProjectInfo) SetKeyType(v string) *KeyProjectInfo {
	s.KeyType = &v
	return s
}

func (s *KeyProjectInfo) SetGmtCreated(v string) *KeyProjectInfo {
	s.GmtCreated = &v
	return s
}

// 机构类型
type InstitutionType struct {
	// 机构类型编码
	// ISSUER/PLATFORM/DISTRIBUTOR
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 机构类型名称
	//  ISSUER/PLATFORM/DISTRIBUTOR
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s InstitutionType) String() string {
	return tea.Prettify(s)
}

func (s InstitutionType) GoString() string {
	return s.String()
}

func (s *InstitutionType) SetCode(v string) *InstitutionType {
	s.Code = &v
	return s
}

func (s *InstitutionType) SetName(v string) *InstitutionType {
	s.Name = &v
	return s
}

// 用户信息
type UserInfo struct {
	// 钱包地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s UserInfo) String() string {
	return tea.Prettify(s)
}

func (s UserInfo) GoString() string {
	return s.String()
}

func (s *UserInfo) SetAddress(v string) *UserInfo {
	s.Address = &v
	return s
}

// 多币种金额
type MultiCurrencyMoney struct {
	// 金额，以分为单位
	Cent *string `json:"cent,omitempty" xml:"cent,omitempty" require:"true"`
	// 币种编码
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 金额，以元为单位，保留6位小数
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s MultiCurrencyMoney) String() string {
	return tea.Prettify(s)
}

func (s MultiCurrencyMoney) GoString() string {
	return s.String()
}

func (s *MultiCurrencyMoney) SetCent(v string) *MultiCurrencyMoney {
	s.Cent = &v
	return s
}

func (s *MultiCurrencyMoney) SetCurrency(v string) *MultiCurrencyMoney {
	s.Currency = &v
	return s
}

func (s *MultiCurrencyMoney) SetAmount(v string) *MultiCurrencyMoney {
	s.Amount = &v
	return s
}

// 净值信息
type NetValueInfo struct {
	// 净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
	// 币种（目前支持USD、HKD）
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 更新时间戳
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
}

func (s NetValueInfo) String() string {
	return tea.Prettify(s)
}

func (s NetValueInfo) GoString() string {
	return s.String()
}

func (s *NetValueInfo) SetNetValue(v string) *NetValueInfo {
	s.NetValue = &v
	return s
}

func (s *NetValueInfo) SetCurrency(v string) *NetValueInfo {
	s.Currency = &v
	return s
}

func (s *NetValueInfo) SetUpdateTime(v int64) *NetValueInfo {
	s.UpdateTime = &v
	return s
}

// 密钥详情
type KeyVO struct {
	// 密钥id
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 密钥名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 创建类型
	// KEY_FILE：上传密钥文件
	// CREATE_NEW_KEY：系统创建密钥
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 钱包地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 关联项目数量
	Quantity *string `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 创建时间
	GmtCreated *string `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 是否支持删除
	DeleteEnable *bool `json:"delete_enable,omitempty" xml:"delete_enable,omitempty" require:"true"`
	// 资产项目信息
	AssetProjectInfo *KeyProjectInfo `json:"asset_project_info,omitempty" xml:"asset_project_info,omitempty" require:"true"`
}

func (s KeyVO) String() string {
	return tea.Prettify(s)
}

func (s KeyVO) GoString() string {
	return s.String()
}

func (s *KeyVO) SetKeyId(v string) *KeyVO {
	s.KeyId = &v
	return s
}

func (s *KeyVO) SetName(v string) *KeyVO {
	s.Name = &v
	return s
}

func (s *KeyVO) SetType(v string) *KeyVO {
	s.Type = &v
	return s
}

func (s *KeyVO) SetAddress(v string) *KeyVO {
	s.Address = &v
	return s
}

func (s *KeyVO) SetQuantity(v string) *KeyVO {
	s.Quantity = &v
	return s
}

func (s *KeyVO) SetGmtCreated(v string) *KeyVO {
	s.GmtCreated = &v
	return s
}

func (s *KeyVO) SetDeleteEnable(v bool) *KeyVO {
	s.DeleteEnable = &v
	return s
}

func (s *KeyVO) SetAssetProjectInfo(v *KeyProjectInfo) *KeyVO {
	s.AssetProjectInfo = v
	return s
}

// 机构详情
type InstitutionVO struct {
	// 机构id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 简介
	About *string `json:"about,omitempty" xml:"about,omitempty"`
	// 主页
	HomePage *string `json:"home_page,omitempty" xml:"home_page,omitempty"`
	// 联系人信息
	Contacts []*InstitutionContactInfo `json:"contacts,omitempty" xml:"contacts,omitempty" type:"Repeated"`
	// 机构类型
	Types []*InstitutionType `json:"types,omitempty" xml:"types,omitempty" require:"true" type:"Repeated"`
	// 机构用户信息
	Users []*UserInfo `json:"users,omitempty" xml:"users,omitempty" type:"Repeated"`
	// 是否支持删除
	DeleteEnable *bool `json:"delete_enable,omitempty" xml:"delete_enable,omitempty"`
}

func (s InstitutionVO) String() string {
	return tea.Prettify(s)
}

func (s InstitutionVO) GoString() string {
	return s.String()
}

func (s *InstitutionVO) SetId(v string) *InstitutionVO {
	s.Id = &v
	return s
}

func (s *InstitutionVO) SetName(v string) *InstitutionVO {
	s.Name = &v
	return s
}

func (s *InstitutionVO) SetAbout(v string) *InstitutionVO {
	s.About = &v
	return s
}

func (s *InstitutionVO) SetHomePage(v string) *InstitutionVO {
	s.HomePage = &v
	return s
}

func (s *InstitutionVO) SetContacts(v []*InstitutionContactInfo) *InstitutionVO {
	s.Contacts = v
	return s
}

func (s *InstitutionVO) SetTypes(v []*InstitutionType) *InstitutionVO {
	s.Types = v
	return s
}

func (s *InstitutionVO) SetUsers(v []*UserInfo) *InstitutionVO {
	s.Users = v
	return s
}

func (s *InstitutionVO) SetDeleteEnable(v bool) *InstitutionVO {
	s.DeleteEnable = &v
	return s
}

// 资产项目密钥
type AssetProjectKey struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
	// 密钥ID
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 密钥名称
	KeyName *string `json:"key_name,omitempty" xml:"key_name,omitempty" require:"true"`
	// 密钥地址
	KeyAddress *string `json:"key_address,omitempty" xml:"key_address,omitempty" require:"true"`
	// 关联时间戳
	CorrelationTime *int64 `json:"correlation_time,omitempty" xml:"correlation_time,omitempty" require:"true"`
}

func (s AssetProjectKey) String() string {
	return tea.Prettify(s)
}

func (s AssetProjectKey) GoString() string {
	return s.String()
}

func (s *AssetProjectKey) SetProjectId(v string) *AssetProjectKey {
	s.ProjectId = &v
	return s
}

func (s *AssetProjectKey) SetProjectName(v string) *AssetProjectKey {
	s.ProjectName = &v
	return s
}

func (s *AssetProjectKey) SetKeyType(v string) *AssetProjectKey {
	s.KeyType = &v
	return s
}

func (s *AssetProjectKey) SetKeyId(v string) *AssetProjectKey {
	s.KeyId = &v
	return s
}

func (s *AssetProjectKey) SetKeyName(v string) *AssetProjectKey {
	s.KeyName = &v
	return s
}

func (s *AssetProjectKey) SetKeyAddress(v string) *AssetProjectKey {
	s.KeyAddress = &v
	return s
}

func (s *AssetProjectKey) SetCorrelationTime(v int64) *AssetProjectKey {
	s.CorrelationTime = &v
	return s
}

// 二级用户
type SubUserAccountVO struct {
	// 用户账户id
	UserAccountId *string `json:"user_account_id,omitempty" xml:"user_account_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty" require:"true"`
	// 用户资产配额
	UserTarget *string `json:"user_target,omitempty" xml:"user_target,omitempty" require:"true"`
	// 用户资产
	UserBalance *string `json:"user_balance,omitempty" xml:"user_balance,omitempty" require:"true"`
	// 项目id
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// 项目名称
	AssetProjectName *string `json:"asset_project_name,omitempty" xml:"asset_project_name,omitempty" require:"true"`
	// 用户所属机构id
	InstitutionId *string `json:"institution_id,omitempty" xml:"institution_id,omitempty" require:"true"`
	// 用户所属机构名称
	InstitutionName *string `json:"institution_name,omitempty" xml:"institution_name,omitempty" require:"true"`
}

func (s SubUserAccountVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountVO) GoString() string {
	return s.String()
}

func (s *SubUserAccountVO) SetUserAccountId(v string) *SubUserAccountVO {
	s.UserAccountId = &v
	return s
}

func (s *SubUserAccountVO) SetUserId(v string) *SubUserAccountVO {
	s.UserId = &v
	return s
}

func (s *SubUserAccountVO) SetUserAddress(v string) *SubUserAccountVO {
	s.UserAddress = &v
	return s
}

func (s *SubUserAccountVO) SetUserTarget(v string) *SubUserAccountVO {
	s.UserTarget = &v
	return s
}

func (s *SubUserAccountVO) SetUserBalance(v string) *SubUserAccountVO {
	s.UserBalance = &v
	return s
}

func (s *SubUserAccountVO) SetAssetProjectId(v string) *SubUserAccountVO {
	s.AssetProjectId = &v
	return s
}

func (s *SubUserAccountVO) SetAssetProjectName(v string) *SubUserAccountVO {
	s.AssetProjectName = &v
	return s
}

func (s *SubUserAccountVO) SetInstitutionId(v string) *SubUserAccountVO {
	s.InstitutionId = &v
	return s
}

func (s *SubUserAccountVO) SetInstitutionName(v string) *SubUserAccountVO {
	s.InstitutionName = &v
	return s
}

// 密钥信息
type KeyInfo struct {
	// 密钥ID
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 密钥名称
	KeyName *string `json:"key_name,omitempty" xml:"key_name,omitempty" require:"true"`
	// 密钥地址
	KeyAddress *string `json:"key_address,omitempty" xml:"key_address,omitempty" require:"true"`
	// 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
}

func (s KeyInfo) String() string {
	return tea.Prettify(s)
}

func (s KeyInfo) GoString() string {
	return s.String()
}

func (s *KeyInfo) SetKeyId(v string) *KeyInfo {
	s.KeyId = &v
	return s
}

func (s *KeyInfo) SetKeyName(v string) *KeyInfo {
	s.KeyName = &v
	return s
}

func (s *KeyInfo) SetKeyAddress(v string) *KeyInfo {
	s.KeyAddress = &v
	return s
}

func (s *KeyInfo) SetKeyType(v string) *KeyInfo {
	s.KeyType = &v
	return s
}

// 项目参与者信息
type ParticipantInfo struct {
	// 机构id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 二级机构类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 机构名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s ParticipantInfo) String() string {
	return tea.Prettify(s)
}

func (s ParticipantInfo) GoString() string {
	return s.String()
}

func (s *ParticipantInfo) SetId(v string) *ParticipantInfo {
	s.Id = &v
	return s
}

func (s *ParticipantInfo) SetType(v string) *ParticipantInfo {
	s.Type = &v
	return s
}

func (s *ParticipantInfo) SetName(v string) *ParticipantInfo {
	s.Name = &v
	return s
}

// 资产项目信息
type AssetProject struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty" require:"true"`
	// 项目介绍
	Info *string `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	// 当前供应量
	Supply *string `json:"supply,omitempty" xml:"supply,omitempty" require:"true"`
	// 最大供应量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty" require:"true"`
	// 供应量比例(supply/capacity * 100，保留2位小数)
	Radio *int64 `json:"radio,omitempty" xml:"radio,omitempty" require:"true"`
	// 持有人数量
	UserNumber *int64 `json:"user_number,omitempty" xml:"user_number,omitempty" require:"true"`
	// 资产token合约地址
	AssetTokenAddress *string `json:"asset_token_address,omitempty" xml:"asset_token_address,omitempty" require:"true"`
	// 资产规则引擎合约地址
	RuleEngineAddress *string `json:"rule_engine_address,omitempty" xml:"rule_engine_address,omitempty" require:"true"`
	// 资产白名单合约地址
	MemberListRuleAddress *string `json:"member_list_rule_address,omitempty" xml:"member_list_rule_address,omitempty" require:"true"`
	// 项目状态(ACTIVE：激活；PAUSED：暂停)
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 项目净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
	// 项目币种(目前支持USD、HKD)
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 项目创建时间戳
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
	// 项目修改时间戳
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
}

func (s AssetProject) String() string {
	return tea.Prettify(s)
}

func (s AssetProject) GoString() string {
	return s.String()
}

func (s *AssetProject) SetProjectId(v string) *AssetProject {
	s.ProjectId = &v
	return s
}

func (s *AssetProject) SetName(v string) *AssetProject {
	s.Name = &v
	return s
}

func (s *AssetProject) SetTokenName(v string) *AssetProject {
	s.TokenName = &v
	return s
}

func (s *AssetProject) SetInfo(v string) *AssetProject {
	s.Info = &v
	return s
}

func (s *AssetProject) SetSupply(v string) *AssetProject {
	s.Supply = &v
	return s
}

func (s *AssetProject) SetCapacity(v string) *AssetProject {
	s.Capacity = &v
	return s
}

func (s *AssetProject) SetRadio(v int64) *AssetProject {
	s.Radio = &v
	return s
}

func (s *AssetProject) SetUserNumber(v int64) *AssetProject {
	s.UserNumber = &v
	return s
}

func (s *AssetProject) SetAssetTokenAddress(v string) *AssetProject {
	s.AssetTokenAddress = &v
	return s
}

func (s *AssetProject) SetRuleEngineAddress(v string) *AssetProject {
	s.RuleEngineAddress = &v
	return s
}

func (s *AssetProject) SetMemberListRuleAddress(v string) *AssetProject {
	s.MemberListRuleAddress = &v
	return s
}

func (s *AssetProject) SetStatus(v string) *AssetProject {
	s.Status = &v
	return s
}

func (s *AssetProject) SetNetValue(v string) *AssetProject {
	s.NetValue = &v
	return s
}

func (s *AssetProject) SetCurrency(v string) *AssetProject {
	s.Currency = &v
	return s
}

func (s *AssetProject) SetGmtCreated(v int64) *AssetProject {
	s.GmtCreated = &v
	return s
}

func (s *AssetProject) SetGmtModified(v int64) *AssetProject {
	s.GmtModified = &v
	return s
}

// 项目报告
type ReportInfo struct {
	// 项目报告ID
	ReportId *string `json:"report_id,omitempty" xml:"report_id,omitempty" require:"true"`
	// 项目报告名
	ReportName *string `json:"report_name,omitempty" xml:"report_name,omitempty" require:"true"`
	// 报告文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 项目报告创建时间戳
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
}

func (s ReportInfo) String() string {
	return tea.Prettify(s)
}

func (s ReportInfo) GoString() string {
	return s.String()
}

func (s *ReportInfo) SetReportId(v string) *ReportInfo {
	s.ReportId = &v
	return s
}

func (s *ReportInfo) SetReportName(v string) *ReportInfo {
	s.ReportName = &v
	return s
}

func (s *ReportInfo) SetFileId(v string) *ReportInfo {
	s.FileId = &v
	return s
}

func (s *ReportInfo) SetGmtCreated(v int64) *ReportInfo {
	s.GmtCreated = &v
	return s
}

// 错误信息
type ErrorMessage struct {
	// 错误码
	DisplayedCode *string `json:"displayed_code,omitempty" xml:"displayed_code,omitempty"`
	// 错误描述
	DisplayedMessage *string `json:"displayed_message,omitempty" xml:"displayed_message,omitempty"`
}

func (s ErrorMessage) String() string {
	return tea.Prettify(s)
}

func (s ErrorMessage) GoString() string {
	return s.String()
}

func (s *ErrorMessage) SetDisplayedCode(v string) *ErrorMessage {
	s.DisplayedCode = &v
	return s
}

func (s *ErrorMessage) SetDisplayedMessage(v string) *ErrorMessage {
	s.DisplayedMessage = &v
	return s
}

// 项目资源
type ProjectResource struct {
	// 资源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 资源类型（目前只有PROJECT_REPORT）
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// 资源名称
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// 文件ID
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 创建时间戳
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
}

func (s ProjectResource) String() string {
	return tea.Prettify(s)
}

func (s ProjectResource) GoString() string {
	return s.String()
}

func (s *ProjectResource) SetId(v string) *ProjectResource {
	s.Id = &v
	return s
}

func (s *ProjectResource) SetProjectId(v string) *ProjectResource {
	s.ProjectId = &v
	return s
}

func (s *ProjectResource) SetResourceType(v string) *ProjectResource {
	s.ResourceType = &v
	return s
}

func (s *ProjectResource) SetResourceName(v string) *ProjectResource {
	s.ResourceName = &v
	return s
}

func (s *ProjectResource) SetFileId(v string) *ProjectResource {
	s.FileId = &v
	return s
}

func (s *ProjectResource) SetGmtCreated(v int64) *ProjectResource {
	s.GmtCreated = &v
	return s
}

// 机构分页信息
type InstitutionPageData struct {
	// 总记录
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty" require:"true"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 机构列表
	Records []*InstitutionVO `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s InstitutionPageData) String() string {
	return tea.Prettify(s)
}

func (s InstitutionPageData) GoString() string {
	return s.String()
}

func (s *InstitutionPageData) SetTotal(v int64) *InstitutionPageData {
	s.Total = &v
	return s
}

func (s *InstitutionPageData) SetPageCount(v int64) *InstitutionPageData {
	s.PageCount = &v
	return s
}

func (s *InstitutionPageData) SetPageNum(v int64) *InstitutionPageData {
	s.PageNum = &v
	return s
}

func (s *InstitutionPageData) SetPageSize(v int64) *InstitutionPageData {
	s.PageSize = &v
	return s
}

func (s *InstitutionPageData) SetRecords(v []*InstitutionVO) *InstitutionPageData {
	s.Records = v
	return s
}

// 总览历史数据统计项
type DataSummaryStatisticsItem struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 原始币种资产价值
	TotalValueList []*MultiCurrencyMoney `json:"total_value_list,omitempty" xml:"total_value_list,omitempty" require:"true" type:"Repeated"`
}

func (s DataSummaryStatisticsItem) String() string {
	return tea.Prettify(s)
}

func (s DataSummaryStatisticsItem) GoString() string {
	return s.String()
}

func (s *DataSummaryStatisticsItem) SetDate(v string) *DataSummaryStatisticsItem {
	s.Date = &v
	return s
}

func (s *DataSummaryStatisticsItem) SetTotalValueList(v []*MultiCurrencyMoney) *DataSummaryStatisticsItem {
	s.TotalValueList = v
	return s
}

// 密钥分页列表
type KeyPageData struct {
	// 总记录
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty" require:"true"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 密钥列表
	Records []*KeyVO `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s KeyPageData) String() string {
	return tea.Prettify(s)
}

func (s KeyPageData) GoString() string {
	return s.String()
}

func (s *KeyPageData) SetTotal(v int64) *KeyPageData {
	s.Total = &v
	return s
}

func (s *KeyPageData) SetPageCount(v int64) *KeyPageData {
	s.PageCount = &v
	return s
}

func (s *KeyPageData) SetPageNum(v int64) *KeyPageData {
	s.PageNum = &v
	return s
}

func (s *KeyPageData) SetPageSize(v int64) *KeyPageData {
	s.PageSize = &v
	return s
}

func (s *KeyPageData) SetRecords(v []*KeyVO) *KeyPageData {
	s.Records = v
	return s
}

// 支持结算方式信息
type SupportedSettlementMethodInfo struct {
	// 结算方式枚举：TD或TT
	SettlementMethodEnum *string `json:"settlement_method_enum,omitempty" xml:"settlement_method_enum,omitempty"`
	// 结算银行账户id
	RelatedSettlementAccountId *string `json:"related_settlement_account_id,omitempty" xml:"related_settlement_account_id,omitempty"`
}

func (s SupportedSettlementMethodInfo) String() string {
	return tea.Prettify(s)
}

func (s SupportedSettlementMethodInfo) GoString() string {
	return s.String()
}

func (s *SupportedSettlementMethodInfo) SetSettlementMethodEnum(v string) *SupportedSettlementMethodInfo {
	s.SettlementMethodEnum = &v
	return s
}

func (s *SupportedSettlementMethodInfo) SetRelatedSettlementAccountId(v string) *SupportedSettlementMethodInfo {
	s.RelatedSettlementAccountId = &v
	return s
}

// 总览统计数据
type DataSummaryTotal struct {
	// 原始币种资产价值列表
	TotalValueList []*MultiCurrencyMoney `json:"total_value_list,omitempty" xml:"total_value_list,omitempty" require:"true" type:"Repeated"`
	// 总项目数
	TotalProjects *int64 `json:"total_projects,omitempty" xml:"total_projects,omitempty" require:"true"`
	// 总用户数
	TotalHolders *int64 `json:"total_holders,omitempty" xml:"total_holders,omitempty" require:"true"`
	// 最后更新时间戳
	LastUpdatedTime *int64 `json:"last_updated_time,omitempty" xml:"last_updated_time,omitempty" require:"true"`
}

func (s DataSummaryTotal) String() string {
	return tea.Prettify(s)
}

func (s DataSummaryTotal) GoString() string {
	return s.String()
}

func (s *DataSummaryTotal) SetTotalValueList(v []*MultiCurrencyMoney) *DataSummaryTotal {
	s.TotalValueList = v
	return s
}

func (s *DataSummaryTotal) SetTotalProjects(v int64) *DataSummaryTotal {
	s.TotalProjects = &v
	return s
}

func (s *DataSummaryTotal) SetTotalHolders(v int64) *DataSummaryTotal {
	s.TotalHolders = &v
	return s
}

func (s *DataSummaryTotal) SetLastUpdatedTime(v int64) *DataSummaryTotal {
	s.LastUpdatedTime = &v
	return s
}

// 资产项目详情
type AssetProjectDetail struct {
	// 项目参与的代销机构列表
	ParticipantInfos []*ParticipantInfo `json:"participant_infos,omitempty" xml:"participant_infos,omitempty" require:"true" type:"Repeated"`
	// 发行密钥列表
	MintKeys []*KeyInfo `json:"mint_keys,omitempty" xml:"mint_keys,omitempty" require:"true" type:"Repeated"`
	// 赎回密钥列表
	BurnKeys []*KeyInfo `json:"burn_keys,omitempty" xml:"burn_keys,omitempty" require:"true" type:"Repeated"`
	// 转账密钥列表
	TransferKeys []*KeyInfo `json:"transfer_keys,omitempty" xml:"transfer_keys,omitempty" require:"true" type:"Repeated"`
	// 管理密钥列表
	ManagerKeys []*KeyInfo `json:"manager_keys,omitempty" xml:"manager_keys,omitempty" require:"true" type:"Repeated"`
	// 历史净值列表
	HistoryNetValueList []*NetValueInfo `json:"history_net_value_list,omitempty" xml:"history_net_value_list,omitempty" require:"true" type:"Repeated"`
	// 项目报告列表
	ReportList []*ReportInfo `json:"report_list,omitempty" xml:"report_list,omitempty" require:"true" type:"Repeated"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty" require:"true"`
	// 项目介绍
	Info *string `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	// 项目描述(markdown格式)
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 当前供应量
	Supply *string `json:"supply,omitempty" xml:"supply,omitempty" require:"true"`
	// 最大供应量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty" require:"true"`
	// 供应量比例(supply/capacity * 100，保留2位小数）
	Radio *int64 `json:"radio,omitempty" xml:"radio,omitempty" require:"true"`
	// 持有人数量
	UserNumber *int64 `json:"user_number,omitempty" xml:"user_number,omitempty" require:"true"`
	// 资产token合约地址
	AssetTokenAddress *string `json:"asset_token_address,omitempty" xml:"asset_token_address,omitempty" require:"true"`
	// 资产规则引擎合约地址
	RuleEngineAddress *string `json:"rule_engine_address,omitempty" xml:"rule_engine_address,omitempty" require:"true"`
	// 资产白名单合约地址
	MemberListRuleAddress *string `json:"member_list_rule_address,omitempty" xml:"member_list_rule_address,omitempty" require:"true"`
	// 项目状态(ACTIVE：激活；PAUSED：暂停)
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 项目净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
	// 项目币种(目前支持USD、HKD)
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 项目创建时间戳
	GmtCreated *string `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
	// 项目修改时间戳
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
}

func (s AssetProjectDetail) String() string {
	return tea.Prettify(s)
}

func (s AssetProjectDetail) GoString() string {
	return s.String()
}

func (s *AssetProjectDetail) SetParticipantInfos(v []*ParticipantInfo) *AssetProjectDetail {
	s.ParticipantInfos = v
	return s
}

func (s *AssetProjectDetail) SetMintKeys(v []*KeyInfo) *AssetProjectDetail {
	s.MintKeys = v
	return s
}

func (s *AssetProjectDetail) SetBurnKeys(v []*KeyInfo) *AssetProjectDetail {
	s.BurnKeys = v
	return s
}

func (s *AssetProjectDetail) SetTransferKeys(v []*KeyInfo) *AssetProjectDetail {
	s.TransferKeys = v
	return s
}

func (s *AssetProjectDetail) SetManagerKeys(v []*KeyInfo) *AssetProjectDetail {
	s.ManagerKeys = v
	return s
}

func (s *AssetProjectDetail) SetHistoryNetValueList(v []*NetValueInfo) *AssetProjectDetail {
	s.HistoryNetValueList = v
	return s
}

func (s *AssetProjectDetail) SetReportList(v []*ReportInfo) *AssetProjectDetail {
	s.ReportList = v
	return s
}

func (s *AssetProjectDetail) SetProjectId(v string) *AssetProjectDetail {
	s.ProjectId = &v
	return s
}

func (s *AssetProjectDetail) SetName(v string) *AssetProjectDetail {
	s.Name = &v
	return s
}

func (s *AssetProjectDetail) SetTokenName(v string) *AssetProjectDetail {
	s.TokenName = &v
	return s
}

func (s *AssetProjectDetail) SetInfo(v string) *AssetProjectDetail {
	s.Info = &v
	return s
}

func (s *AssetProjectDetail) SetDescription(v string) *AssetProjectDetail {
	s.Description = &v
	return s
}

func (s *AssetProjectDetail) SetSupply(v string) *AssetProjectDetail {
	s.Supply = &v
	return s
}

func (s *AssetProjectDetail) SetCapacity(v string) *AssetProjectDetail {
	s.Capacity = &v
	return s
}

func (s *AssetProjectDetail) SetRadio(v int64) *AssetProjectDetail {
	s.Radio = &v
	return s
}

func (s *AssetProjectDetail) SetUserNumber(v int64) *AssetProjectDetail {
	s.UserNumber = &v
	return s
}

func (s *AssetProjectDetail) SetAssetTokenAddress(v string) *AssetProjectDetail {
	s.AssetTokenAddress = &v
	return s
}

func (s *AssetProjectDetail) SetRuleEngineAddress(v string) *AssetProjectDetail {
	s.RuleEngineAddress = &v
	return s
}

func (s *AssetProjectDetail) SetMemberListRuleAddress(v string) *AssetProjectDetail {
	s.MemberListRuleAddress = &v
	return s
}

func (s *AssetProjectDetail) SetStatus(v string) *AssetProjectDetail {
	s.Status = &v
	return s
}

func (s *AssetProjectDetail) SetNetValue(v string) *AssetProjectDetail {
	s.NetValue = &v
	return s
}

func (s *AssetProjectDetail) SetCurrency(v string) *AssetProjectDetail {
	s.Currency = &v
	return s
}

func (s *AssetProjectDetail) SetGmtCreated(v string) *AssetProjectDetail {
	s.GmtCreated = &v
	return s
}

func (s *AssetProjectDetail) SetGmtModified(v string) *AssetProjectDetail {
	s.GmtModified = &v
	return s
}

// 资产项目净值
type ProjectPerformance struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
	// 币种(目前支持USD、HKD)
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 净值更新时间戳
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
}

func (s ProjectPerformance) String() string {
	return tea.Prettify(s)
}

func (s ProjectPerformance) GoString() string {
	return s.String()
}

func (s *ProjectPerformance) SetProjectId(v string) *ProjectPerformance {
	s.ProjectId = &v
	return s
}

func (s *ProjectPerformance) SetNetValue(v string) *ProjectPerformance {
	s.NetValue = &v
	return s
}

func (s *ProjectPerformance) SetCurrency(v string) *ProjectPerformance {
	s.Currency = &v
	return s
}

func (s *ProjectPerformance) SetUpdateTime(v int64) *ProjectPerformance {
	s.UpdateTime = &v
	return s
}

// 项目分页信息
type ProjectPageData struct {
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty" require:"true"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 项目列表
	Records []*AssetProject `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s ProjectPageData) String() string {
	return tea.Prettify(s)
}

func (s ProjectPageData) GoString() string {
	return s.String()
}

func (s *ProjectPageData) SetTotal(v int64) *ProjectPageData {
	s.Total = &v
	return s
}

func (s *ProjectPageData) SetPageCount(v int64) *ProjectPageData {
	s.PageCount = &v
	return s
}

func (s *ProjectPageData) SetPageNum(v int64) *ProjectPageData {
	s.PageNum = &v
	return s
}

func (s *ProjectPageData) SetPageSize(v int64) *ProjectPageData {
	s.PageSize = &v
	return s
}

func (s *ProjectPageData) SetRecords(v []*AssetProject) *ProjectPageData {
	s.Records = v
	return s
}

// 二级用户列表
type SubUserAccountPageData struct {
	// 总记录
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty" require:"true"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 二级用户列表
	Records []*SubUserAccountVO `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s SubUserAccountPageData) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountPageData) GoString() string {
	return s.String()
}

func (s *SubUserAccountPageData) SetTotal(v int64) *SubUserAccountPageData {
	s.Total = &v
	return s
}

func (s *SubUserAccountPageData) SetPageCount(v int64) *SubUserAccountPageData {
	s.PageCount = &v
	return s
}

func (s *SubUserAccountPageData) SetPageNum(v int64) *SubUserAccountPageData {
	s.PageNum = &v
	return s
}

func (s *SubUserAccountPageData) SetPageSize(v int64) *SubUserAccountPageData {
	s.PageSize = &v
	return s
}

func (s *SubUserAccountPageData) SetRecords(v []*SubUserAccountVO) *SubUserAccountPageData {
	s.Records = v
	return s
}

// APIKEY试图对象
type ApiKey struct {
	// 主键
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// AK
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// SK(或公钥)
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty" require:"true"`
	// 创建日期
	GmtCreated *string `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ApiKey) String() string {
	return tea.Prettify(s)
}

func (s ApiKey) GoString() string {
	return s.String()
}

func (s *ApiKey) SetId(v string) *ApiKey {
	s.Id = &v
	return s
}

func (s *ApiKey) SetToken(v string) *ApiKey {
	s.Token = &v
	return s
}

func (s *ApiKey) SetSecret(v string) *ApiKey {
	s.Secret = &v
	return s
}

func (s *ApiKey) SetGmtCreated(v string) *ApiKey {
	s.GmtCreated = &v
	return s
}

// 项目密钥分页数据
type ProjectKeyPageData struct {
	// 总记录数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 总页数
	PageCount *int64 `json:"page_count,omitempty" xml:"page_count,omitempty" require:"true"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 项目密钥列表
	Records []*AssetProjectKey `json:"records,omitempty" xml:"records,omitempty" require:"true" type:"Repeated"`
}

func (s ProjectKeyPageData) String() string {
	return tea.Prettify(s)
}

func (s ProjectKeyPageData) GoString() string {
	return s.String()
}

func (s *ProjectKeyPageData) SetTotal(v int64) *ProjectKeyPageData {
	s.Total = &v
	return s
}

func (s *ProjectKeyPageData) SetPageCount(v int64) *ProjectKeyPageData {
	s.PageCount = &v
	return s
}

func (s *ProjectKeyPageData) SetPageNum(v int64) *ProjectKeyPageData {
	s.PageNum = &v
	return s
}

func (s *ProjectKeyPageData) SetPageSize(v int64) *ProjectKeyPageData {
	s.PageSize = &v
	return s
}

func (s *ProjectKeyPageData) SetRecords(v []*AssetProjectKey) *ProjectKeyPageData {
	s.Records = v
	return s
}

type CreateIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目名称
	Info *string `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	// 项目描述(markdown格式)
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty" require:"true"`
	// 最大供应量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty" require:"true"`
	// 净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty"`
	// 币种(目前支持USD、HKD、CNY)
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 项目参与者列表(代销机构，最多3个)
	Participants []*ParticipantInfo `json:"participants,omitempty" xml:"participants,omitempty" require:"true" type:"Repeated"`
	// 发行密钥ID列表(最多3个)
	MintKeys []*string `json:"mint_keys,omitempty" xml:"mint_keys,omitempty" require:"true" type:"Repeated"`
	// 赎回密钥ID列表(最多3个)
	BurnKeys []*string `json:"burn_keys,omitempty" xml:"burn_keys,omitempty" require:"true" type:"Repeated"`
	// 转账密钥ID列表(最多3个)
	TransferKeys []*string `json:"transfer_keys,omitempty" xml:"transfer_keys,omitempty" require:"true" type:"Repeated"`
	// 管理密钥ID列表(最多3个)
	ManagerKeys []*string `json:"manager_keys,omitempty" xml:"manager_keys,omitempty" require:"true" type:"Repeated"`
	// 项目封面文件id
	ProjectCoverFileId *string `json:"project_cover_file_id,omitempty" xml:"project_cover_file_id,omitempty" require:"true"`
	// 是否限购
	MaxSubscriptionLimited *bool `json:"max_subscription_limited,omitempty" xml:"max_subscription_limited,omitempty" require:"true"`
	// 最大可认购份额
	MaxSubscriptionAmount *string `json:"max_subscription_amount,omitempty" xml:"max_subscription_amount,omitempty" require:"true"`
	// 项目支持的结算方式
	SettlementMethods []*SupportedSettlementMethodInfo `json:"settlement_methods,omitempty" xml:"settlement_methods,omitempty" require:"true" type:"Repeated"`
	// crossChain
	CrossChain *bool `json:"cross_chain,omitempty" xml:"cross_chain,omitempty" require:"true"`
	// 目标链名称列表（跨链项目必填）
	TargetChainNameList []*string `json:"target_chain_name_list,omitempty" xml:"target_chain_name_list,omitempty" type:"Repeated"`
}

func (s CreateIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateIssuerProjectRequest) SetAuthToken(v string) *CreateIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetProductInstanceId(v string) *CreateIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetName(v string) *CreateIssuerProjectRequest {
	s.Name = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetInfo(v string) *CreateIssuerProjectRequest {
	s.Info = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetDescription(v string) *CreateIssuerProjectRequest {
	s.Description = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetTokenName(v string) *CreateIssuerProjectRequest {
	s.TokenName = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetCapacity(v string) *CreateIssuerProjectRequest {
	s.Capacity = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetNetValue(v string) *CreateIssuerProjectRequest {
	s.NetValue = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetCurrency(v string) *CreateIssuerProjectRequest {
	s.Currency = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetParticipants(v []*ParticipantInfo) *CreateIssuerProjectRequest {
	s.Participants = v
	return s
}

func (s *CreateIssuerProjectRequest) SetMintKeys(v []*string) *CreateIssuerProjectRequest {
	s.MintKeys = v
	return s
}

func (s *CreateIssuerProjectRequest) SetBurnKeys(v []*string) *CreateIssuerProjectRequest {
	s.BurnKeys = v
	return s
}

func (s *CreateIssuerProjectRequest) SetTransferKeys(v []*string) *CreateIssuerProjectRequest {
	s.TransferKeys = v
	return s
}

func (s *CreateIssuerProjectRequest) SetManagerKeys(v []*string) *CreateIssuerProjectRequest {
	s.ManagerKeys = v
	return s
}

func (s *CreateIssuerProjectRequest) SetProjectCoverFileId(v string) *CreateIssuerProjectRequest {
	s.ProjectCoverFileId = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetMaxSubscriptionLimited(v bool) *CreateIssuerProjectRequest {
	s.MaxSubscriptionLimited = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetMaxSubscriptionAmount(v string) *CreateIssuerProjectRequest {
	s.MaxSubscriptionAmount = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetSettlementMethods(v []*SupportedSettlementMethodInfo) *CreateIssuerProjectRequest {
	s.SettlementMethods = v
	return s
}

func (s *CreateIssuerProjectRequest) SetCrossChain(v bool) *CreateIssuerProjectRequest {
	s.CrossChain = &v
	return s
}

func (s *CreateIssuerProjectRequest) SetTargetChainNameList(v []*string) *CreateIssuerProjectRequest {
	s.TargetChainNameList = v
	return s
}

type CreateIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目ID
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateIssuerProjectResponse) SetReqMsgId(v string) *CreateIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateIssuerProjectResponse) SetResultCode(v string) *CreateIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateIssuerProjectResponse) SetResultMsg(v string) *CreateIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateIssuerProjectResponse) SetData(v string) *CreateIssuerProjectResponse {
	s.Data = &v
	return s
}

type PagequeryIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目名称模糊查询条件
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 项目状态(ACTIVE：激活；PAUSED：暂停)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" minimum:"1"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"5"`
}

func (s PagequeryIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerProjectRequest) SetAuthToken(v string) *PagequeryIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryIssuerProjectRequest) SetProductInstanceId(v string) *PagequeryIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryIssuerProjectRequest) SetName(v string) *PagequeryIssuerProjectRequest {
	s.Name = &v
	return s
}

func (s *PagequeryIssuerProjectRequest) SetStatus(v string) *PagequeryIssuerProjectRequest {
	s.Status = &v
	return s
}

func (s *PagequeryIssuerProjectRequest) SetPageNum(v int64) *PagequeryIssuerProjectRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryIssuerProjectRequest) SetPageSize(v int64) *PagequeryIssuerProjectRequest {
	s.PageSize = &v
	return s
}

type PagequeryIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目分页信息
	Data *ProjectPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerProjectResponse) SetReqMsgId(v string) *PagequeryIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryIssuerProjectResponse) SetResultCode(v string) *PagequeryIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryIssuerProjectResponse) SetResultMsg(v string) *PagequeryIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryIssuerProjectResponse) SetData(v *ProjectPageData) *PagequeryIssuerProjectResponse {
	s.Data = v
	return s
}

type PagequeryDistributorProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 项目状态（ACTIVE：激活；PAUSED：暂停）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"5"`
}

func (s PagequeryDistributorProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDistributorProjectRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDistributorProjectRequest) SetAuthToken(v string) *PagequeryDistributorProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDistributorProjectRequest) SetProductInstanceId(v string) *PagequeryDistributorProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDistributorProjectRequest) SetName(v string) *PagequeryDistributorProjectRequest {
	s.Name = &v
	return s
}

func (s *PagequeryDistributorProjectRequest) SetStatus(v string) *PagequeryDistributorProjectRequest {
	s.Status = &v
	return s
}

func (s *PagequeryDistributorProjectRequest) SetPageNum(v int64) *PagequeryDistributorProjectRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryDistributorProjectRequest) SetPageSize(v int64) *PagequeryDistributorProjectRequest {
	s.PageSize = &v
	return s
}

type PagequeryDistributorProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目分页信息
	Data *ProjectPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryDistributorProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDistributorProjectResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDistributorProjectResponse) SetReqMsgId(v string) *PagequeryDistributorProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDistributorProjectResponse) SetResultCode(v string) *PagequeryDistributorProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDistributorProjectResponse) SetResultMsg(v string) *PagequeryDistributorProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDistributorProjectResponse) SetData(v *ProjectPageData) *PagequeryDistributorProjectResponse {
	s.Data = v
	return s
}

type PauseIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s PauseIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s PauseIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *PauseIssuerProjectRequest) SetAuthToken(v string) *PauseIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *PauseIssuerProjectRequest) SetProductInstanceId(v string) *PauseIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PauseIssuerProjectRequest) SetProjectId(v string) *PauseIssuerProjectRequest {
	s.ProjectId = &v
	return s
}

type PauseIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PauseIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s PauseIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *PauseIssuerProjectResponse) SetReqMsgId(v string) *PauseIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PauseIssuerProjectResponse) SetResultCode(v string) *PauseIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *PauseIssuerProjectResponse) SetResultMsg(v string) *PauseIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

type EnableIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s EnableIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *EnableIssuerProjectRequest) SetAuthToken(v string) *EnableIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableIssuerProjectRequest) SetProductInstanceId(v string) *EnableIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EnableIssuerProjectRequest) SetProjectId(v string) *EnableIssuerProjectRequest {
	s.ProjectId = &v
	return s
}

type EnableIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s EnableIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *EnableIssuerProjectResponse) SetReqMsgId(v string) *EnableIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableIssuerProjectResponse) SetResultCode(v string) *EnableIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableIssuerProjectResponse) SetResultMsg(v string) *EnableIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

type DetailIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s DetailIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *DetailIssuerProjectRequest) SetAuthToken(v string) *DetailIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailIssuerProjectRequest) SetProductInstanceId(v string) *DetailIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailIssuerProjectRequest) SetProjectId(v string) *DetailIssuerProjectRequest {
	s.ProjectId = &v
	return s
}

type DetailIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产项目详情
	Data *AssetProjectDetail `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DetailIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *DetailIssuerProjectResponse) SetReqMsgId(v string) *DetailIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailIssuerProjectResponse) SetResultCode(v string) *DetailIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailIssuerProjectResponse) SetResultMsg(v string) *DetailIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailIssuerProjectResponse) SetData(v *AssetProjectDetail) *DetailIssuerProjectResponse {
	s.Data = v
	return s
}

type DetailDistributorProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s DetailDistributorProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailDistributorProjectRequest) GoString() string {
	return s.String()
}

func (s *DetailDistributorProjectRequest) SetAuthToken(v string) *DetailDistributorProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailDistributorProjectRequest) SetProductInstanceId(v string) *DetailDistributorProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailDistributorProjectRequest) SetProjectId(v string) *DetailDistributorProjectRequest {
	s.ProjectId = &v
	return s
}

type DetailDistributorProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产项目详情
	Data *AssetProject `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DetailDistributorProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailDistributorProjectResponse) GoString() string {
	return s.String()
}

func (s *DetailDistributorProjectResponse) SetReqMsgId(v string) *DetailDistributorProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailDistributorProjectResponse) SetResultCode(v string) *DetailDistributorProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailDistributorProjectResponse) SetResultMsg(v string) *DetailDistributorProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailDistributorProjectResponse) SetData(v *AssetProject) *DetailDistributorProjectResponse {
	s.Data = v
	return s
}

type PagequeryPlatformProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 项目状态（ACTIVE：激活；PAUSED：暂停）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryPlatformProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryPlatformProjectRequest) GoString() string {
	return s.String()
}

func (s *PagequeryPlatformProjectRequest) SetAuthToken(v string) *PagequeryPlatformProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryPlatformProjectRequest) SetProductInstanceId(v string) *PagequeryPlatformProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryPlatformProjectRequest) SetName(v string) *PagequeryPlatformProjectRequest {
	s.Name = &v
	return s
}

func (s *PagequeryPlatformProjectRequest) SetStatus(v string) *PagequeryPlatformProjectRequest {
	s.Status = &v
	return s
}

func (s *PagequeryPlatformProjectRequest) SetPageNum(v int64) *PagequeryPlatformProjectRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryPlatformProjectRequest) SetPageSize(v int64) *PagequeryPlatformProjectRequest {
	s.PageSize = &v
	return s
}

type PagequeryPlatformProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目分页信息
	Data *ProjectPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryPlatformProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryPlatformProjectResponse) GoString() string {
	return s.String()
}

func (s *PagequeryPlatformProjectResponse) SetReqMsgId(v string) *PagequeryPlatformProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryPlatformProjectResponse) SetResultCode(v string) *PagequeryPlatformProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryPlatformProjectResponse) SetResultMsg(v string) *PagequeryPlatformProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryPlatformProjectResponse) SetData(v *ProjectPageData) *PagequeryPlatformProjectResponse {
	s.Data = v
	return s
}

type CountIssuerDatasummaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 币种（目前支持USD、HKD）
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s CountIssuerDatasummaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CountIssuerDatasummaryRequest) GoString() string {
	return s.String()
}

func (s *CountIssuerDatasummaryRequest) SetAuthToken(v string) *CountIssuerDatasummaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CountIssuerDatasummaryRequest) SetProductInstanceId(v string) *CountIssuerDatasummaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountIssuerDatasummaryRequest) SetCurrency(v string) *CountIssuerDatasummaryRequest {
	s.Currency = &v
	return s
}

type CountIssuerDatasummaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总览统计数据项
	Data *DataSummaryTotal `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CountIssuerDatasummaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CountIssuerDatasummaryResponse) GoString() string {
	return s.String()
}

func (s *CountIssuerDatasummaryResponse) SetReqMsgId(v string) *CountIssuerDatasummaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountIssuerDatasummaryResponse) SetResultCode(v string) *CountIssuerDatasummaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CountIssuerDatasummaryResponse) SetResultMsg(v string) *CountIssuerDatasummaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountIssuerDatasummaryResponse) SetData(v *DataSummaryTotal) *CountIssuerDatasummaryResponse {
	s.Data = v
	return s
}

type CountDistributorDatasummaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 币种（目前支持USD、HKD）
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s CountDistributorDatasummaryRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDistributorDatasummaryRequest) GoString() string {
	return s.String()
}

func (s *CountDistributorDatasummaryRequest) SetAuthToken(v string) *CountDistributorDatasummaryRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDistributorDatasummaryRequest) SetProductInstanceId(v string) *CountDistributorDatasummaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDistributorDatasummaryRequest) SetCurrency(v string) *CountDistributorDatasummaryRequest {
	s.Currency = &v
	return s
}

type CountDistributorDatasummaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总览统计数据项
	Data *DataSummaryTotal `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CountDistributorDatasummaryResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDistributorDatasummaryResponse) GoString() string {
	return s.String()
}

func (s *CountDistributorDatasummaryResponse) SetReqMsgId(v string) *CountDistributorDatasummaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDistributorDatasummaryResponse) SetResultCode(v string) *CountDistributorDatasummaryResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDistributorDatasummaryResponse) SetResultMsg(v string) *CountDistributorDatasummaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDistributorDatasummaryResponse) SetData(v *DataSummaryTotal) *CountDistributorDatasummaryResponse {
	s.Data = v
	return s
}

type ListIssuerDatasummaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 币种（目前支持USD、HKD）
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 开始时间(格式：YYYY-MM-DD)
	BeginDate *string `json:"begin_date,omitempty" xml:"begin_date,omitempty"`
	// 截止时间(格式：YYYY-MM-DD)
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
}

func (s ListIssuerDatasummaryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerDatasummaryRequest) GoString() string {
	return s.String()
}

func (s *ListIssuerDatasummaryRequest) SetAuthToken(v string) *ListIssuerDatasummaryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListIssuerDatasummaryRequest) SetProductInstanceId(v string) *ListIssuerDatasummaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListIssuerDatasummaryRequest) SetCurrency(v string) *ListIssuerDatasummaryRequest {
	s.Currency = &v
	return s
}

func (s *ListIssuerDatasummaryRequest) SetBeginDate(v string) *ListIssuerDatasummaryRequest {
	s.BeginDate = &v
	return s
}

func (s *ListIssuerDatasummaryRequest) SetEndDate(v string) *ListIssuerDatasummaryRequest {
	s.EndDate = &v
	return s
}

type ListIssuerDatasummaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 历史资产统计列表
	Data []*DataSummaryStatisticsItem `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListIssuerDatasummaryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerDatasummaryResponse) GoString() string {
	return s.String()
}

func (s *ListIssuerDatasummaryResponse) SetReqMsgId(v string) *ListIssuerDatasummaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListIssuerDatasummaryResponse) SetResultCode(v string) *ListIssuerDatasummaryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListIssuerDatasummaryResponse) SetResultMsg(v string) *ListIssuerDatasummaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListIssuerDatasummaryResponse) SetData(v []*DataSummaryStatisticsItem) *ListIssuerDatasummaryResponse {
	s.Data = v
	return s
}

type ListDistributorDatasummaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 币种（目前支持USD、HKD）
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 开始时间
	BeginDate *string `json:"begin_date,omitempty" xml:"begin_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 截止时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ListDistributorDatasummaryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDistributorDatasummaryRequest) GoString() string {
	return s.String()
}

func (s *ListDistributorDatasummaryRequest) SetAuthToken(v string) *ListDistributorDatasummaryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDistributorDatasummaryRequest) SetProductInstanceId(v string) *ListDistributorDatasummaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDistributorDatasummaryRequest) SetCurrency(v string) *ListDistributorDatasummaryRequest {
	s.Currency = &v
	return s
}

func (s *ListDistributorDatasummaryRequest) SetBeginDate(v string) *ListDistributorDatasummaryRequest {
	s.BeginDate = &v
	return s
}

func (s *ListDistributorDatasummaryRequest) SetEndDate(v string) *ListDistributorDatasummaryRequest {
	s.EndDate = &v
	return s
}

type ListDistributorDatasummaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 历史资产统计列表
	Data []*DataSummaryStatisticsItem `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListDistributorDatasummaryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDistributorDatasummaryResponse) GoString() string {
	return s.String()
}

func (s *ListDistributorDatasummaryResponse) SetReqMsgId(v string) *ListDistributorDatasummaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDistributorDatasummaryResponse) SetResultCode(v string) *ListDistributorDatasummaryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDistributorDatasummaryResponse) SetResultMsg(v string) *ListDistributorDatasummaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDistributorDatasummaryResponse) SetData(v []*DataSummaryStatisticsItem) *ListDistributorDatasummaryResponse {
	s.Data = v
	return s
}

type ListIssuerInstitutionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListIssuerInstitutionRequest) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerInstitutionRequest) GoString() string {
	return s.String()
}

func (s *ListIssuerInstitutionRequest) SetAuthToken(v string) *ListIssuerInstitutionRequest {
	s.AuthToken = &v
	return s
}

func (s *ListIssuerInstitutionRequest) SetProductInstanceId(v string) *ListIssuerInstitutionRequest {
	s.ProductInstanceId = &v
	return s
}

type ListIssuerInstitutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构列表
	Data []*InstitutionVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListIssuerInstitutionResponse) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerInstitutionResponse) GoString() string {
	return s.String()
}

func (s *ListIssuerInstitutionResponse) SetReqMsgId(v string) *ListIssuerInstitutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListIssuerInstitutionResponse) SetResultCode(v string) *ListIssuerInstitutionResponse {
	s.ResultCode = &v
	return s
}

func (s *ListIssuerInstitutionResponse) SetResultMsg(v string) *ListIssuerInstitutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListIssuerInstitutionResponse) SetData(v []*InstitutionVO) *ListIssuerInstitutionResponse {
	s.Data = v
	return s
}

type PagequeryIssuerKeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" minimum:"5"`
	// 排序字段
	SortField *string `json:"sort_field,omitempty" xml:"sort_field,omitempty"`
	// 密钥名称
	KeyName *string `json:"key_name,omitempty" xml:"key_name,omitempty"`
}

func (s PagequeryIssuerKeyRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerKeyRequest) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerKeyRequest) SetAuthToken(v string) *PagequeryIssuerKeyRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryIssuerKeyRequest) SetProductInstanceId(v string) *PagequeryIssuerKeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryIssuerKeyRequest) SetPageNum(v int64) *PagequeryIssuerKeyRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryIssuerKeyRequest) SetPageSize(v int64) *PagequeryIssuerKeyRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryIssuerKeyRequest) SetSortField(v string) *PagequeryIssuerKeyRequest {
	s.SortField = &v
	return s
}

func (s *PagequeryIssuerKeyRequest) SetKeyName(v string) *PagequeryIssuerKeyRequest {
	s.KeyName = &v
	return s
}

type PagequeryIssuerKeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 密钥分页列表
	Data *KeyPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryIssuerKeyResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerKeyResponse) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerKeyResponse) SetReqMsgId(v string) *PagequeryIssuerKeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryIssuerKeyResponse) SetResultCode(v string) *PagequeryIssuerKeyResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryIssuerKeyResponse) SetResultMsg(v string) *PagequeryIssuerKeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryIssuerKeyResponse) SetData(v *KeyPageData) *PagequeryIssuerKeyResponse {
	s.Data = v
	return s
}

type DetailIssuerKeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 密钥id
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
}

func (s DetailIssuerKeyRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailIssuerKeyRequest) GoString() string {
	return s.String()
}

func (s *DetailIssuerKeyRequest) SetAuthToken(v string) *DetailIssuerKeyRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailIssuerKeyRequest) SetProductInstanceId(v string) *DetailIssuerKeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailIssuerKeyRequest) SetKeyId(v string) *DetailIssuerKeyRequest {
	s.KeyId = &v
	return s
}

type DetailIssuerKeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 密钥详情
	Data *KeyVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DetailIssuerKeyResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailIssuerKeyResponse) GoString() string {
	return s.String()
}

func (s *DetailIssuerKeyResponse) SetReqMsgId(v string) *DetailIssuerKeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailIssuerKeyResponse) SetResultCode(v string) *DetailIssuerKeyResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailIssuerKeyResponse) SetResultMsg(v string) *DetailIssuerKeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailIssuerKeyResponse) SetData(v *KeyVO) *DetailIssuerKeyResponse {
	s.Data = v
	return s
}

type CreateIssuerKeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 密钥名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 创建类型
	// KEY_FILE：上传密钥文件"
	// CREATE_NEW_KEY：系统创建密钥"
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 文件流
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 文件解密密码
	Password *string `json:"password,omitempty" xml:"password,omitempty"`
}

func (s CreateIssuerKeyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateIssuerKeyRequest) GoString() string {
	return s.String()
}

func (s *CreateIssuerKeyRequest) SetAuthToken(v string) *CreateIssuerKeyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetProductInstanceId(v string) *CreateIssuerKeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetName(v string) *CreateIssuerKeyRequest {
	s.Name = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetType(v string) *CreateIssuerKeyRequest {
	s.Type = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetFileObject(v io.Reader) *CreateIssuerKeyRequest {
	s.FileObject = v
	return s
}

func (s *CreateIssuerKeyRequest) SetFileObjectName(v string) *CreateIssuerKeyRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetFileId(v string) *CreateIssuerKeyRequest {
	s.FileId = &v
	return s
}

func (s *CreateIssuerKeyRequest) SetPassword(v string) *CreateIssuerKeyRequest {
	s.Password = &v
	return s
}

type CreateIssuerKeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateIssuerKeyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateIssuerKeyResponse) GoString() string {
	return s.String()
}

func (s *CreateIssuerKeyResponse) SetReqMsgId(v string) *CreateIssuerKeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateIssuerKeyResponse) SetResultCode(v string) *CreateIssuerKeyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateIssuerKeyResponse) SetResultMsg(v string) *CreateIssuerKeyResponse {
	s.ResultMsg = &v
	return s
}

type DeleteIssuerKeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 密钥id
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
}

func (s DeleteIssuerKeyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteIssuerKeyRequest) GoString() string {
	return s.String()
}

func (s *DeleteIssuerKeyRequest) SetAuthToken(v string) *DeleteIssuerKeyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteIssuerKeyRequest) SetProductInstanceId(v string) *DeleteIssuerKeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteIssuerKeyRequest) SetKeyId(v string) *DeleteIssuerKeyRequest {
	s.KeyId = &v
	return s
}

type DeleteIssuerKeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteIssuerKeyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteIssuerKeyResponse) GoString() string {
	return s.String()
}

func (s *DeleteIssuerKeyResponse) SetReqMsgId(v string) *DeleteIssuerKeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteIssuerKeyResponse) SetResultCode(v string) *DeleteIssuerKeyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteIssuerKeyResponse) SetResultMsg(v string) *DeleteIssuerKeyResponse {
	s.ResultMsg = &v
	return s
}

type AddIssuerProjectkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 密钥ID
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
}

func (s AddIssuerProjectkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s AddIssuerProjectkeyRequest) GoString() string {
	return s.String()
}

func (s *AddIssuerProjectkeyRequest) SetAuthToken(v string) *AddIssuerProjectkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *AddIssuerProjectkeyRequest) SetProductInstanceId(v string) *AddIssuerProjectkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddIssuerProjectkeyRequest) SetProjectId(v string) *AddIssuerProjectkeyRequest {
	s.ProjectId = &v
	return s
}

func (s *AddIssuerProjectkeyRequest) SetKeyId(v string) *AddIssuerProjectkeyRequest {
	s.KeyId = &v
	return s
}

func (s *AddIssuerProjectkeyRequest) SetKeyType(v string) *AddIssuerProjectkeyRequest {
	s.KeyType = &v
	return s
}

type AddIssuerProjectkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddIssuerProjectkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s AddIssuerProjectkeyResponse) GoString() string {
	return s.String()
}

func (s *AddIssuerProjectkeyResponse) SetReqMsgId(v string) *AddIssuerProjectkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddIssuerProjectkeyResponse) SetResultCode(v string) *AddIssuerProjectkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *AddIssuerProjectkeyResponse) SetResultMsg(v string) *AddIssuerProjectkeyResponse {
	s.ResultMsg = &v
	return s
}

type DeleteIssuerProjectkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目密钥ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteIssuerProjectkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteIssuerProjectkeyRequest) GoString() string {
	return s.String()
}

func (s *DeleteIssuerProjectkeyRequest) SetAuthToken(v string) *DeleteIssuerProjectkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteIssuerProjectkeyRequest) SetProductInstanceId(v string) *DeleteIssuerProjectkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteIssuerProjectkeyRequest) SetId(v string) *DeleteIssuerProjectkeyRequest {
	s.Id = &v
	return s
}

type DeleteIssuerProjectkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteIssuerProjectkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteIssuerProjectkeyResponse) GoString() string {
	return s.String()
}

func (s *DeleteIssuerProjectkeyResponse) SetReqMsgId(v string) *DeleteIssuerProjectkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteIssuerProjectkeyResponse) SetResultCode(v string) *DeleteIssuerProjectkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteIssuerProjectkeyResponse) SetResultMsg(v string) *DeleteIssuerProjectkeyResponse {
	s.ResultMsg = &v
	return s
}

type ListIssuerProjectkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty"`
}

func (s ListIssuerProjectkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerProjectkeyRequest) GoString() string {
	return s.String()
}

func (s *ListIssuerProjectkeyRequest) SetAuthToken(v string) *ListIssuerProjectkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListIssuerProjectkeyRequest) SetProductInstanceId(v string) *ListIssuerProjectkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListIssuerProjectkeyRequest) SetProjectId(v string) *ListIssuerProjectkeyRequest {
	s.ProjectId = &v
	return s
}

func (s *ListIssuerProjectkeyRequest) SetKeyType(v string) *ListIssuerProjectkeyRequest {
	s.KeyType = &v
	return s
}

type ListIssuerProjectkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目密钥列表
	Data []*AssetProjectKey `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListIssuerProjectkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerProjectkeyResponse) GoString() string {
	return s.String()
}

func (s *ListIssuerProjectkeyResponse) SetReqMsgId(v string) *ListIssuerProjectkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListIssuerProjectkeyResponse) SetResultCode(v string) *ListIssuerProjectkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListIssuerProjectkeyResponse) SetResultMsg(v string) *ListIssuerProjectkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListIssuerProjectkeyResponse) SetData(v []*AssetProjectKey) *ListIssuerProjectkeyResponse {
	s.Data = v
	return s
}

type PagequeryIssuerProjectkeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 密钥ID
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true" minimum:"1"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"100" minimum:"5"`
}

func (s PagequeryIssuerProjectkeyRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerProjectkeyRequest) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerProjectkeyRequest) SetAuthToken(v string) *PagequeryIssuerProjectkeyRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryIssuerProjectkeyRequest) SetProductInstanceId(v string) *PagequeryIssuerProjectkeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryIssuerProjectkeyRequest) SetKeyId(v string) *PagequeryIssuerProjectkeyRequest {
	s.KeyId = &v
	return s
}

func (s *PagequeryIssuerProjectkeyRequest) SetPageNum(v int64) *PagequeryIssuerProjectkeyRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryIssuerProjectkeyRequest) SetPageSize(v int64) *PagequeryIssuerProjectkeyRequest {
	s.PageSize = &v
	return s
}

type PagequeryIssuerProjectkeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目密钥分页信息
	Data *ProjectKeyPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryIssuerProjectkeyResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerProjectkeyResponse) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerProjectkeyResponse) SetReqMsgId(v string) *PagequeryIssuerProjectkeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryIssuerProjectkeyResponse) SetResultCode(v string) *PagequeryIssuerProjectkeyResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryIssuerProjectkeyResponse) SetResultMsg(v string) *PagequeryIssuerProjectkeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryIssuerProjectkeyResponse) SetData(v *ProjectKeyPageData) *PagequeryIssuerProjectkeyResponse {
	s.Data = v
	return s
}

type UpdateIssuerNetvalueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
}

func (s UpdateIssuerNetvalueRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateIssuerNetvalueRequest) GoString() string {
	return s.String()
}

func (s *UpdateIssuerNetvalueRequest) SetAuthToken(v string) *UpdateIssuerNetvalueRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateIssuerNetvalueRequest) SetProductInstanceId(v string) *UpdateIssuerNetvalueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateIssuerNetvalueRequest) SetProjectId(v string) *UpdateIssuerNetvalueRequest {
	s.ProjectId = &v
	return s
}

func (s *UpdateIssuerNetvalueRequest) SetNetValue(v string) *UpdateIssuerNetvalueRequest {
	s.NetValue = &v
	return s
}

type UpdateIssuerNetvalueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateIssuerNetvalueResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateIssuerNetvalueResponse) GoString() string {
	return s.String()
}

func (s *UpdateIssuerNetvalueResponse) SetReqMsgId(v string) *UpdateIssuerNetvalueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateIssuerNetvalueResponse) SetResultCode(v string) *UpdateIssuerNetvalueResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateIssuerNetvalueResponse) SetResultMsg(v string) *UpdateIssuerNetvalueResponse {
	s.ResultMsg = &v
	return s
}

type ListIssuerNetvalueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s ListIssuerNetvalueRequest) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerNetvalueRequest) GoString() string {
	return s.String()
}

func (s *ListIssuerNetvalueRequest) SetAuthToken(v string) *ListIssuerNetvalueRequest {
	s.AuthToken = &v
	return s
}

func (s *ListIssuerNetvalueRequest) SetProductInstanceId(v string) *ListIssuerNetvalueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListIssuerNetvalueRequest) SetProjectId(v string) *ListIssuerNetvalueRequest {
	s.ProjectId = &v
	return s
}

type ListIssuerNetvalueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产历史净值列表
	Data []*ProjectPerformance `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListIssuerNetvalueResponse) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerNetvalueResponse) GoString() string {
	return s.String()
}

func (s *ListIssuerNetvalueResponse) SetReqMsgId(v string) *ListIssuerNetvalueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListIssuerNetvalueResponse) SetResultCode(v string) *ListIssuerNetvalueResponse {
	s.ResultCode = &v
	return s
}

func (s *ListIssuerNetvalueResponse) SetResultMsg(v string) *ListIssuerNetvalueResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListIssuerNetvalueResponse) SetData(v []*ProjectPerformance) *ListIssuerNetvalueResponse {
	s.Data = v
	return s
}

type UploadIssuerReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件内容(base64)
	FileContent *string `json:"file_content,omitempty" xml:"file_content,omitempty" require:"true"`
}

func (s UploadIssuerReportRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadIssuerReportRequest) GoString() string {
	return s.String()
}

func (s *UploadIssuerReportRequest) SetAuthToken(v string) *UploadIssuerReportRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadIssuerReportRequest) SetProductInstanceId(v string) *UploadIssuerReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadIssuerReportRequest) SetProjectId(v string) *UploadIssuerReportRequest {
	s.ProjectId = &v
	return s
}

func (s *UploadIssuerReportRequest) SetFileName(v string) *UploadIssuerReportRequest {
	s.FileName = &v
	return s
}

func (s *UploadIssuerReportRequest) SetFileContent(v string) *UploadIssuerReportRequest {
	s.FileContent = &v
	return s
}

type UploadIssuerReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadIssuerReportResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadIssuerReportResponse) GoString() string {
	return s.String()
}

func (s *UploadIssuerReportResponse) SetReqMsgId(v string) *UploadIssuerReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadIssuerReportResponse) SetResultCode(v string) *UploadIssuerReportResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadIssuerReportResponse) SetResultMsg(v string) *UploadIssuerReportResponse {
	s.ResultMsg = &v
	return s
}

type ListIssuerReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s ListIssuerReportRequest) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerReportRequest) GoString() string {
	return s.String()
}

func (s *ListIssuerReportRequest) SetAuthToken(v string) *ListIssuerReportRequest {
	s.AuthToken = &v
	return s
}

func (s *ListIssuerReportRequest) SetProductInstanceId(v string) *ListIssuerReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListIssuerReportRequest) SetProjectId(v string) *ListIssuerReportRequest {
	s.ProjectId = &v
	return s
}

type ListIssuerReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目报告资源列表
	Data []*ProjectResource `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListIssuerReportResponse) String() string {
	return tea.Prettify(s)
}

func (s ListIssuerReportResponse) GoString() string {
	return s.String()
}

func (s *ListIssuerReportResponse) SetReqMsgId(v string) *ListIssuerReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListIssuerReportResponse) SetResultCode(v string) *ListIssuerReportResponse {
	s.ResultCode = &v
	return s
}

func (s *ListIssuerReportResponse) SetResultMsg(v string) *ListIssuerReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListIssuerReportResponse) SetData(v []*ProjectResource) *ListIssuerReportResponse {
	s.Data = v
	return s
}

type ListDistributorReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s ListDistributorReportRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDistributorReportRequest) GoString() string {
	return s.String()
}

func (s *ListDistributorReportRequest) SetAuthToken(v string) *ListDistributorReportRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDistributorReportRequest) SetProductInstanceId(v string) *ListDistributorReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDistributorReportRequest) SetProjectId(v string) *ListDistributorReportRequest {
	s.ProjectId = &v
	return s
}

type ListDistributorReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目报告资源列表
	Data []*ProjectResource `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListDistributorReportResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDistributorReportResponse) GoString() string {
	return s.String()
}

func (s *ListDistributorReportResponse) SetReqMsgId(v string) *ListDistributorReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDistributorReportResponse) SetResultCode(v string) *ListDistributorReportResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDistributorReportResponse) SetResultMsg(v string) *ListDistributorReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDistributorReportResponse) SetData(v []*ProjectResource) *ListDistributorReportResponse {
	s.Data = v
	return s
}

type DownloadIssuerReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
}

func (s DownloadIssuerReportRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadIssuerReportRequest) GoString() string {
	return s.String()
}

func (s *DownloadIssuerReportRequest) SetAuthToken(v string) *DownloadIssuerReportRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadIssuerReportRequest) SetProductInstanceId(v string) *DownloadIssuerReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadIssuerReportRequest) SetResourceId(v string) *DownloadIssuerReportRequest {
	s.ResourceId = &v
	return s
}

type DownloadIssuerReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报告文件下载地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DownloadIssuerReportResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadIssuerReportResponse) GoString() string {
	return s.String()
}

func (s *DownloadIssuerReportResponse) SetReqMsgId(v string) *DownloadIssuerReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadIssuerReportResponse) SetResultCode(v string) *DownloadIssuerReportResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadIssuerReportResponse) SetResultMsg(v string) *DownloadIssuerReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadIssuerReportResponse) SetData(v string) *DownloadIssuerReportResponse {
	s.Data = &v
	return s
}

type PreviewIssuerReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
}

func (s PreviewIssuerReportRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewIssuerReportRequest) GoString() string {
	return s.String()
}

func (s *PreviewIssuerReportRequest) SetAuthToken(v string) *PreviewIssuerReportRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewIssuerReportRequest) SetProductInstanceId(v string) *PreviewIssuerReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewIssuerReportRequest) SetResourceId(v string) *PreviewIssuerReportRequest {
	s.ResourceId = &v
	return s
}

type PreviewIssuerReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报告文件预览地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PreviewIssuerReportResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewIssuerReportResponse) GoString() string {
	return s.String()
}

func (s *PreviewIssuerReportResponse) SetReqMsgId(v string) *PreviewIssuerReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewIssuerReportResponse) SetResultCode(v string) *PreviewIssuerReportResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewIssuerReportResponse) SetResultMsg(v string) *PreviewIssuerReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewIssuerReportResponse) SetData(v string) *PreviewIssuerReportResponse {
	s.Data = &v
	return s
}

type DownloadDistributorReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
}

func (s DownloadDistributorReportRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadDistributorReportRequest) GoString() string {
	return s.String()
}

func (s *DownloadDistributorReportRequest) SetAuthToken(v string) *DownloadDistributorReportRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadDistributorReportRequest) SetProductInstanceId(v string) *DownloadDistributorReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadDistributorReportRequest) SetResourceId(v string) *DownloadDistributorReportRequest {
	s.ResourceId = &v
	return s
}

type DownloadDistributorReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报告文件下载地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DownloadDistributorReportResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadDistributorReportResponse) GoString() string {
	return s.String()
}

func (s *DownloadDistributorReportResponse) SetReqMsgId(v string) *DownloadDistributorReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadDistributorReportResponse) SetResultCode(v string) *DownloadDistributorReportResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadDistributorReportResponse) SetResultMsg(v string) *DownloadDistributorReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadDistributorReportResponse) SetData(v string) *DownloadDistributorReportResponse {
	s.Data = &v
	return s
}

type PreviewDistributorReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
}

func (s PreviewDistributorReportRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewDistributorReportRequest) GoString() string {
	return s.String()
}

func (s *PreviewDistributorReportRequest) SetAuthToken(v string) *PreviewDistributorReportRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewDistributorReportRequest) SetProductInstanceId(v string) *PreviewDistributorReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewDistributorReportRequest) SetResourceId(v string) *PreviewDistributorReportRequest {
	s.ResourceId = &v
	return s
}

type PreviewDistributorReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 报告文件预览地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PreviewDistributorReportResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewDistributorReportResponse) GoString() string {
	return s.String()
}

func (s *PreviewDistributorReportResponse) SetReqMsgId(v string) *PreviewDistributorReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewDistributorReportResponse) SetResultCode(v string) *PreviewDistributorReportResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewDistributorReportResponse) SetResultMsg(v string) *PreviewDistributorReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewDistributorReportResponse) SetData(v string) *PreviewDistributorReportResponse {
	s.Data = &v
	return s
}

type PagequeryIssuerSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 钱包地址
	WalletAddress *string `json:"wallet_address,omitempty" xml:"wallet_address,omitempty"`
	// 项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 数据类型
	// REDEEM
	// ISSUE
	// 不传为全部
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
}

func (s PagequeryIssuerSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerSubuserRequest) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerSubuserRequest) SetAuthToken(v string) *PagequeryIssuerSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetProductInstanceId(v string) *PagequeryIssuerSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetPageNum(v int64) *PagequeryIssuerSubuserRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetPageSize(v int64) *PagequeryIssuerSubuserRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetWalletAddress(v string) *PagequeryIssuerSubuserRequest {
	s.WalletAddress = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetAssetProjectAddress(v string) *PagequeryIssuerSubuserRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetProjectName(v string) *PagequeryIssuerSubuserRequest {
	s.ProjectName = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetProjectId(v string) *PagequeryIssuerSubuserRequest {
	s.ProjectId = &v
	return s
}

func (s *PagequeryIssuerSubuserRequest) SetTransactionType(v string) *PagequeryIssuerSubuserRequest {
	s.TransactionType = &v
	return s
}

type PagequeryIssuerSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户列表
	Data *SubUserAccountPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryIssuerSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryIssuerSubuserResponse) GoString() string {
	return s.String()
}

func (s *PagequeryIssuerSubuserResponse) SetReqMsgId(v string) *PagequeryIssuerSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryIssuerSubuserResponse) SetResultCode(v string) *PagequeryIssuerSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryIssuerSubuserResponse) SetResultMsg(v string) *PagequeryIssuerSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryIssuerSubuserResponse) SetData(v *SubUserAccountPageData) *PagequeryIssuerSubuserResponse {
	s.Data = v
	return s
}

type PagequeryDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页码(默认为第一页)
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页面显示条数(默认10，最小为5)
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 钱包地址
	WalletAddress *string `json:"wallet_address,omitempty" xml:"wallet_address,omitempty"`
	// 项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 数据类型
	// REDEEM
	// ISSUE
	// 不传为全部
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
}

func (s PagequeryDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDistributorSubuserRequest) SetAuthToken(v string) *PagequeryDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetProductInstanceId(v string) *PagequeryDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetPageNum(v int64) *PagequeryDistributorSubuserRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetPageSize(v int64) *PagequeryDistributorSubuserRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetWalletAddress(v string) *PagequeryDistributorSubuserRequest {
	s.WalletAddress = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetAssetProjectAddress(v string) *PagequeryDistributorSubuserRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetProjectName(v string) *PagequeryDistributorSubuserRequest {
	s.ProjectName = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetProjectId(v string) *PagequeryDistributorSubuserRequest {
	s.ProjectId = &v
	return s
}

func (s *PagequeryDistributorSubuserRequest) SetTransactionType(v string) *PagequeryDistributorSubuserRequest {
	s.TransactionType = &v
	return s
}

type PagequeryDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户列表
	Data *SubUserAccountPageData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDistributorSubuserResponse) SetReqMsgId(v string) *PagequeryDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDistributorSubuserResponse) SetResultCode(v string) *PagequeryDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDistributorSubuserResponse) SetResultMsg(v string) *PagequeryDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDistributorSubuserResponse) SetData(v *SubUserAccountPageData) *PagequeryDistributorSubuserResponse {
	s.Data = v
	return s
}

type QueryIssuerSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 机构id
	InstitutionId *string `json:"institution_id,omitempty" xml:"institution_id,omitempty" require:"true"`
}

func (s QueryIssuerSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIssuerSubuserRequest) GoString() string {
	return s.String()
}

func (s *QueryIssuerSubuserRequest) SetAuthToken(v string) *QueryIssuerSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIssuerSubuserRequest) SetProductInstanceId(v string) *QueryIssuerSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIssuerSubuserRequest) SetUserId(v string) *QueryIssuerSubuserRequest {
	s.UserId = &v
	return s
}

func (s *QueryIssuerSubuserRequest) SetProjectId(v string) *QueryIssuerSubuserRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryIssuerSubuserRequest) SetInstitutionId(v string) *QueryIssuerSubuserRequest {
	s.InstitutionId = &v
	return s
}

type QueryIssuerSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户信息
	Data *SubUserAccountVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryIssuerSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIssuerSubuserResponse) GoString() string {
	return s.String()
}

func (s *QueryIssuerSubuserResponse) SetReqMsgId(v string) *QueryIssuerSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIssuerSubuserResponse) SetResultCode(v string) *QueryIssuerSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIssuerSubuserResponse) SetResultMsg(v string) *QueryIssuerSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIssuerSubuserResponse) SetData(v *SubUserAccountVO) *QueryIssuerSubuserResponse {
	s.Data = v
	return s
}

type QueryDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 机构id
	InstitutionId *string `json:"institution_id,omitempty" xml:"institution_id,omitempty" require:"true"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s QueryDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *QueryDistributorSubuserRequest) SetAuthToken(v string) *QueryDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDistributorSubuserRequest) SetProductInstanceId(v string) *QueryDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDistributorSubuserRequest) SetUserId(v string) *QueryDistributorSubuserRequest {
	s.UserId = &v
	return s
}

func (s *QueryDistributorSubuserRequest) SetInstitutionId(v string) *QueryDistributorSubuserRequest {
	s.InstitutionId = &v
	return s
}

func (s *QueryDistributorSubuserRequest) SetProjectId(v string) *QueryDistributorSubuserRequest {
	s.ProjectId = &v
	return s
}

type QueryDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户信息
	Data *SubUserAccountVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *QueryDistributorSubuserResponse) SetReqMsgId(v string) *QueryDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDistributorSubuserResponse) SetResultCode(v string) *QueryDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDistributorSubuserResponse) SetResultMsg(v string) *QueryDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDistributorSubuserResponse) SetData(v *SubUserAccountVO) *QueryDistributorSubuserResponse {
	s.Data = v
	return s
}

type UpdateDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二级用户账号
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty" require:"true"`
	// 用户id
	SubUserId *string `json:"sub_user_id,omitempty" xml:"sub_user_id,omitempty"`
	// 二级用户钱包地址
	SubUserAddress *string `json:"sub_user_address,omitempty" xml:"sub_user_address,omitempty"`
	// assetProjectId
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// userTarget
	UserTarget *string `json:"user_target,omitempty" xml:"user_target,omitempty" require:"true"`
}

func (s UpdateDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *UpdateDistributorSubuserRequest) SetAuthToken(v string) *UpdateDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetProductInstanceId(v string) *UpdateDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetSubUserAccountId(v string) *UpdateDistributorSubuserRequest {
	s.SubUserAccountId = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetSubUserId(v string) *UpdateDistributorSubuserRequest {
	s.SubUserId = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetSubUserAddress(v string) *UpdateDistributorSubuserRequest {
	s.SubUserAddress = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetAssetProjectId(v string) *UpdateDistributorSubuserRequest {
	s.AssetProjectId = &v
	return s
}

func (s *UpdateDistributorSubuserRequest) SetUserTarget(v string) *UpdateDistributorSubuserRequest {
	s.UserTarget = &v
	return s
}

type UpdateDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *UpdateDistributorSubuserResponse) SetReqMsgId(v string) *UpdateDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDistributorSubuserResponse) SetResultCode(v string) *UpdateDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDistributorSubuserResponse) SetResultMsg(v string) *UpdateDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDistributorSubuserResponse) SetData(v bool) *UpdateDistributorSubuserResponse {
	s.Data = &v
	return s
}

type CreateDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 钱包地址
	WalletAddress *string `json:"wallet_address,omitempty" xml:"wallet_address,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 用户资产配额
	UserTarget *string `json:"user_target,omitempty" xml:"user_target,omitempty" require:"true"`
}

func (s CreateDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *CreateDistributorSubuserRequest) SetAuthToken(v string) *CreateDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDistributorSubuserRequest) SetProductInstanceId(v string) *CreateDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDistributorSubuserRequest) SetWalletAddress(v string) *CreateDistributorSubuserRequest {
	s.WalletAddress = &v
	return s
}

func (s *CreateDistributorSubuserRequest) SetProjectName(v string) *CreateDistributorSubuserRequest {
	s.ProjectName = &v
	return s
}

func (s *CreateDistributorSubuserRequest) SetProjectId(v string) *CreateDistributorSubuserRequest {
	s.ProjectId = &v
	return s
}

func (s *CreateDistributorSubuserRequest) SetUserTarget(v string) *CreateDistributorSubuserRequest {
	s.UserTarget = &v
	return s
}

type CreateDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *CreateDistributorSubuserResponse) SetReqMsgId(v string) *CreateDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDistributorSubuserResponse) SetResultCode(v string) *CreateDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDistributorSubuserResponse) SetResultMsg(v string) *CreateDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDistributorSubuserResponse) SetData(v bool) *CreateDistributorSubuserResponse {
	s.Data = &v
	return s
}

type DeleteDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二级用户账号
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty" require:"true"`
	// 用户id
	SubUserId *string `json:"sub_user_id,omitempty" xml:"sub_user_id,omitempty"`
	// 二级用户钱包地址
	SubUserAddress *string `json:"sub_user_address,omitempty" xml:"sub_user_address,omitempty"`
}

func (s DeleteDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *DeleteDistributorSubuserRequest) SetAuthToken(v string) *DeleteDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteDistributorSubuserRequest) SetProductInstanceId(v string) *DeleteDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteDistributorSubuserRequest) SetSubUserAccountId(v string) *DeleteDistributorSubuserRequest {
	s.SubUserAccountId = &v
	return s
}

func (s *DeleteDistributorSubuserRequest) SetSubUserId(v string) *DeleteDistributorSubuserRequest {
	s.SubUserId = &v
	return s
}

func (s *DeleteDistributorSubuserRequest) SetSubUserAddress(v string) *DeleteDistributorSubuserRequest {
	s.SubUserAddress = &v
	return s
}

type DeleteDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否删除成功
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *DeleteDistributorSubuserResponse) SetReqMsgId(v string) *DeleteDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteDistributorSubuserResponse) SetResultCode(v string) *DeleteDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteDistributorSubuserResponse) SetResultMsg(v string) *DeleteDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteDistributorSubuserResponse) SetData(v bool) *DeleteDistributorSubuserResponse {
	s.Data = &v
	return s
}

type CountDistributorSubusertargetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s CountDistributorSubusertargetRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDistributorSubusertargetRequest) GoString() string {
	return s.String()
}

func (s *CountDistributorSubusertargetRequest) SetAuthToken(v string) *CountDistributorSubusertargetRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDistributorSubusertargetRequest) SetProductInstanceId(v string) *CountDistributorSubusertargetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDistributorSubusertargetRequest) SetProjectId(v string) *CountDistributorSubusertargetRequest {
	s.ProjectId = &v
	return s
}

type CountDistributorSubusertargetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户配额
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CountDistributorSubusertargetResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDistributorSubusertargetResponse) GoString() string {
	return s.String()
}

func (s *CountDistributorSubusertargetResponse) SetReqMsgId(v string) *CountDistributorSubusertargetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDistributorSubusertargetResponse) SetResultCode(v string) *CountDistributorSubusertargetResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDistributorSubusertargetResponse) SetResultMsg(v string) *CountDistributorSubusertargetResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDistributorSubusertargetResponse) SetData(v string) *CountDistributorSubusertargetResponse {
	s.Data = &v
	return s
}

type IssueIssuerSubusertradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二级用户地址
	SubUserAddress *string `json:"sub_user_address,omitempty" xml:"sub_user_address,omitempty" require:"true"`
	// 二级用户账户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty" require:"true"`
	// 发行数量
	IssueAmount *string `json:"issue_amount,omitempty" xml:"issue_amount,omitempty" require:"true"`
	// 资产项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// 资产项目链上合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
}

func (s IssueIssuerSubusertradeRequest) String() string {
	return tea.Prettify(s)
}

func (s IssueIssuerSubusertradeRequest) GoString() string {
	return s.String()
}

func (s *IssueIssuerSubusertradeRequest) SetAuthToken(v string) *IssueIssuerSubusertradeRequest {
	s.AuthToken = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetProductInstanceId(v string) *IssueIssuerSubusertradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetSubUserAddress(v string) *IssueIssuerSubusertradeRequest {
	s.SubUserAddress = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetSubUserAccountId(v string) *IssueIssuerSubusertradeRequest {
	s.SubUserAccountId = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetIssueAmount(v string) *IssueIssuerSubusertradeRequest {
	s.IssueAmount = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetAssetProjectId(v string) *IssueIssuerSubusertradeRequest {
	s.AssetProjectId = &v
	return s
}

func (s *IssueIssuerSubusertradeRequest) SetAssetProjectAddress(v string) *IssueIssuerSubusertradeRequest {
	s.AssetProjectAddress = &v
	return s
}

type IssueIssuerSubusertradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s IssueIssuerSubusertradeResponse) String() string {
	return tea.Prettify(s)
}

func (s IssueIssuerSubusertradeResponse) GoString() string {
	return s.String()
}

func (s *IssueIssuerSubusertradeResponse) SetReqMsgId(v string) *IssueIssuerSubusertradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *IssueIssuerSubusertradeResponse) SetResultCode(v string) *IssueIssuerSubusertradeResponse {
	s.ResultCode = &v
	return s
}

func (s *IssueIssuerSubusertradeResponse) SetResultMsg(v string) *IssueIssuerSubusertradeResponse {
	s.ResultMsg = &v
	return s
}

type RedeemIssuerSubusertradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二级用户地址
	SubUserAddress *string `json:"sub_user_address,omitempty" xml:"sub_user_address,omitempty" require:"true"`
	// 二级用户账户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty" require:"true"`
	// 赎回数量
	RedeemAmount *string `json:"redeem_amount,omitempty" xml:"redeem_amount,omitempty" require:"true"`
	// 资产项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// 资产项目链上合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
}

func (s RedeemIssuerSubusertradeRequest) String() string {
	return tea.Prettify(s)
}

func (s RedeemIssuerSubusertradeRequest) GoString() string {
	return s.String()
}

func (s *RedeemIssuerSubusertradeRequest) SetAuthToken(v string) *RedeemIssuerSubusertradeRequest {
	s.AuthToken = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetProductInstanceId(v string) *RedeemIssuerSubusertradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetSubUserAddress(v string) *RedeemIssuerSubusertradeRequest {
	s.SubUserAddress = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetSubUserAccountId(v string) *RedeemIssuerSubusertradeRequest {
	s.SubUserAccountId = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetRedeemAmount(v string) *RedeemIssuerSubusertradeRequest {
	s.RedeemAmount = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetAssetProjectId(v string) *RedeemIssuerSubusertradeRequest {
	s.AssetProjectId = &v
	return s
}

func (s *RedeemIssuerSubusertradeRequest) SetAssetProjectAddress(v string) *RedeemIssuerSubusertradeRequest {
	s.AssetProjectAddress = &v
	return s
}

type RedeemIssuerSubusertradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RedeemIssuerSubusertradeResponse) String() string {
	return tea.Prettify(s)
}

func (s RedeemIssuerSubusertradeResponse) GoString() string {
	return s.String()
}

func (s *RedeemIssuerSubusertradeResponse) SetReqMsgId(v string) *RedeemIssuerSubusertradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RedeemIssuerSubusertradeResponse) SetResultCode(v string) *RedeemIssuerSubusertradeResponse {
	s.ResultCode = &v
	return s
}

func (s *RedeemIssuerSubusertradeResponse) SetResultMsg(v string) *RedeemIssuerSubusertradeResponse {
	s.ResultMsg = &v
	return s
}

type TransferIssuerSubusertradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// from二级用户地址
	FromSubUserAddress *string `json:"from_sub_user_address,omitempty" xml:"from_sub_user_address,omitempty" require:"true"`
	// from二级用户账户ID
	FromSubUserAccountId *string `json:"from_sub_user_account_id,omitempty" xml:"from_sub_user_account_id,omitempty" require:"true"`
	// to二级用户地址
	ToSubUserAddress *string `json:"to_sub_user_address,omitempty" xml:"to_sub_user_address,omitempty" require:"true"`
	// to二级用户账户ID
	ToSubUserAccountId *string `json:"to_sub_user_account_id,omitempty" xml:"to_sub_user_account_id,omitempty"`
	// 转移数量
	TransferAmount *string `json:"transfer_amount,omitempty" xml:"transfer_amount,omitempty" require:"true"`
	// 资产项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// 资产项目链上合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
}

func (s TransferIssuerSubusertradeRequest) String() string {
	return tea.Prettify(s)
}

func (s TransferIssuerSubusertradeRequest) GoString() string {
	return s.String()
}

func (s *TransferIssuerSubusertradeRequest) SetAuthToken(v string) *TransferIssuerSubusertradeRequest {
	s.AuthToken = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetProductInstanceId(v string) *TransferIssuerSubusertradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetFromSubUserAddress(v string) *TransferIssuerSubusertradeRequest {
	s.FromSubUserAddress = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetFromSubUserAccountId(v string) *TransferIssuerSubusertradeRequest {
	s.FromSubUserAccountId = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetToSubUserAddress(v string) *TransferIssuerSubusertradeRequest {
	s.ToSubUserAddress = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetToSubUserAccountId(v string) *TransferIssuerSubusertradeRequest {
	s.ToSubUserAccountId = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetTransferAmount(v string) *TransferIssuerSubusertradeRequest {
	s.TransferAmount = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetAssetProjectId(v string) *TransferIssuerSubusertradeRequest {
	s.AssetProjectId = &v
	return s
}

func (s *TransferIssuerSubusertradeRequest) SetAssetProjectAddress(v string) *TransferIssuerSubusertradeRequest {
	s.AssetProjectAddress = &v
	return s
}

type TransferIssuerSubusertradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TransferIssuerSubusertradeResponse) String() string {
	return tea.Prettify(s)
}

func (s TransferIssuerSubusertradeResponse) GoString() string {
	return s.String()
}

func (s *TransferIssuerSubusertradeResponse) SetReqMsgId(v string) *TransferIssuerSubusertradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TransferIssuerSubusertradeResponse) SetResultCode(v string) *TransferIssuerSubusertradeResponse {
	s.ResultCode = &v
	return s
}

func (s *TransferIssuerSubusertradeResponse) SetResultMsg(v string) *TransferIssuerSubusertradeResponse {
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
				"sdk_version":      tea.String("1.0.13"),
				"_prod_code":       tea.String("WEBTRWATRADE"),
				"_prod_channel":    tea.String("default"),
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
 * Description: 发行机构创建资产项目
 * Summary: 发行机构创建资产项目
 */
func (client *Client) CreateIssuerProject(request *CreateIssuerProjectRequest) (_result *CreateIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateIssuerProjectResponse{}
	_body, _err := client.CreateIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构创建资产项目
 * Summary: 发行机构创建资产项目
 */
func (client *Client) CreateIssuerProjectEx(request *CreateIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询发行机构持有的资产项目信息
 * Summary: 分页查询发行机构项目信息
 */
func (client *Client) PagequeryIssuerProject(request *PagequeryIssuerProjectRequest) (_result *PagequeryIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryIssuerProjectResponse{}
	_body, _err := client.PagequeryIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询发行机构持有的资产项目信息
 * Summary: 分页查询发行机构项目信息
 */
func (client *Client) PagequeryIssuerProjectEx(request *PagequeryIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询代销机构代销的资产项目信息
 * Summary: 分页查询代销机构项目信息
 */
func (client *Client) PagequeryDistributorProject(request *PagequeryDistributorProjectRequest) (_result *PagequeryDistributorProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDistributorProjectResponse{}
	_body, _err := client.PagequeryDistributorProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询代销机构代销的资产项目信息
 * Summary: 分页查询代销机构项目信息
 */
func (client *Client) PagequeryDistributorProjectEx(request *PagequeryDistributorProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDistributorProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDistributorProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.project.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构暂停项目
 * Summary: 发行机构暂停项目
 */
func (client *Client) PauseIssuerProject(request *PauseIssuerProjectRequest) (_result *PauseIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PauseIssuerProjectResponse{}
	_body, _err := client.PauseIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构暂停项目
 * Summary: 发行机构暂停项目
 */
func (client *Client) PauseIssuerProjectEx(request *PauseIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PauseIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PauseIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.pause"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构激活项目(使项目生效)
 * Summary: 发行机构激活项目
 */
func (client *Client) EnableIssuerProject(request *EnableIssuerProjectRequest) (_result *EnableIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableIssuerProjectResponse{}
	_body, _err := client.EnableIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构激活项目(使项目生效)
 * Summary: 发行机构激活项目
 */
func (client *Client) EnableIssuerProjectEx(request *EnableIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构查询项目详情
 * Summary: 发行机构查询项目详情
 */
func (client *Client) DetailIssuerProject(request *DetailIssuerProjectRequest) (_result *DetailIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailIssuerProjectResponse{}
	_body, _err := client.DetailIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构查询项目详情
 * Summary: 发行机构查询项目详情
 */
func (client *Client) DetailIssuerProjectEx(request *DetailIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构查询项目详情
 * Summary: 代销机构查询项目详情
 */
func (client *Client) DetailDistributorProject(request *DetailDistributorProjectRequest) (_result *DetailDistributorProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailDistributorProjectResponse{}
	_body, _err := client.DetailDistributorProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构查询项目详情
 * Summary: 代销机构查询项目详情
 */
func (client *Client) DetailDistributorProjectEx(request *DetailDistributorProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailDistributorProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailDistributorProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.project.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 平台管理员分页查询所有项目
 * Summary: 平台管理分页查询项目
 */
func (client *Client) PagequeryPlatformProject(request *PagequeryPlatformProjectRequest) (_result *PagequeryPlatformProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryPlatformProjectResponse{}
	_body, _err := client.PagequeryPlatformProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 平台管理员分页查询所有项目
 * Summary: 平台管理分页查询项目
 */
func (client *Client) PagequeryPlatformProjectEx(request *PagequeryPlatformProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryPlatformProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryPlatformProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.platform.project.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取总览统计数据项
 * Summary: 发行机构获取总览统计数据项
 */
func (client *Client) CountIssuerDatasummary(request *CountIssuerDatasummaryRequest) (_result *CountIssuerDatasummaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountIssuerDatasummaryResponse{}
	_body, _err := client.CountIssuerDatasummaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取总览统计数据项
 * Summary: 发行机构获取总览统计数据项
 */
func (client *Client) CountIssuerDatasummaryEx(request *CountIssuerDatasummaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountIssuerDatasummaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountIssuerDatasummaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.datasummary.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取总览统计数据项
 * Summary: 代销机构获取总览统计数据项
 */
func (client *Client) CountDistributorDatasummary(request *CountDistributorDatasummaryRequest) (_result *CountDistributorDatasummaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDistributorDatasummaryResponse{}
	_body, _err := client.CountDistributorDatasummaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取总览统计数据项
 * Summary: 代销机构获取总览统计数据项
 */
func (client *Client) CountDistributorDatasummaryEx(request *CountDistributorDatasummaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDistributorDatasummaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDistributorDatasummaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.datasummary.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取历史资产价值
 * Summary: 发行机构获取历史资产价值
 */
func (client *Client) ListIssuerDatasummary(request *ListIssuerDatasummaryRequest) (_result *ListIssuerDatasummaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListIssuerDatasummaryResponse{}
	_body, _err := client.ListIssuerDatasummaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取历史资产价值
 * Summary: 发行机构获取历史资产价值
 */
func (client *Client) ListIssuerDatasummaryEx(request *ListIssuerDatasummaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListIssuerDatasummaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListIssuerDatasummaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.datasummary.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取历史资产价值
 * Summary: 代销机构获取历史资产价值
 */
func (client *Client) ListDistributorDatasummary(request *ListDistributorDatasummaryRequest) (_result *ListDistributorDatasummaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDistributorDatasummaryResponse{}
	_body, _err := client.ListDistributorDatasummaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取历史资产价值
 * Summary: 代销机构获取历史资产价值
 */
func (client *Client) ListDistributorDatasummaryEx(request *ListDistributorDatasummaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDistributorDatasummaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDistributorDatasummaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.datasummary.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代销机构列表
 * Summary: 查询代销机构列表
 */
func (client *Client) ListIssuerInstitution(request *ListIssuerInstitutionRequest) (_result *ListIssuerInstitutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListIssuerInstitutionResponse{}
	_body, _err := client.ListIssuerInstitutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代销机构列表
 * Summary: 查询代销机构列表
 */
func (client *Client) ListIssuerInstitutionEx(request *ListIssuerInstitutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListIssuerInstitutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListIssuerInstitutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.institution.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询密钥
 * Summary: 分页查询密钥
 */
func (client *Client) PagequeryIssuerKey(request *PagequeryIssuerKeyRequest) (_result *PagequeryIssuerKeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryIssuerKeyResponse{}
	_body, _err := client.PagequeryIssuerKeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询密钥
 * Summary: 分页查询密钥
 */
func (client *Client) PagequeryIssuerKeyEx(request *PagequeryIssuerKeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryIssuerKeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryIssuerKeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.key.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询密钥详情
 * Summary: 查询密钥详情
 */
func (client *Client) DetailIssuerKey(request *DetailIssuerKeyRequest) (_result *DetailIssuerKeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailIssuerKeyResponse{}
	_body, _err := client.DetailIssuerKeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询密钥详情
 * Summary: 查询密钥详情
 */
func (client *Client) DetailIssuerKeyEx(request *DetailIssuerKeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailIssuerKeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailIssuerKeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.key.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建密钥
 * Summary: 创建密钥
 */
func (client *Client) CreateIssuerKey(request *CreateIssuerKeyRequest) (_result *CreateIssuerKeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateIssuerKeyResponse{}
	_body, _err := client.CreateIssuerKeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建密钥
 * Summary: 创建密钥
 */
func (client *Client) CreateIssuerKeyEx(request *CreateIssuerKeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateIssuerKeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateIssuerKeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.key.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除密钥
 * Summary: 删除密钥
 */
func (client *Client) DeleteIssuerKey(request *DeleteIssuerKeyRequest) (_result *DeleteIssuerKeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteIssuerKeyResponse{}
	_body, _err := client.DeleteIssuerKeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除密钥
 * Summary: 删除密钥
 */
func (client *Client) DeleteIssuerKeyEx(request *DeleteIssuerKeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteIssuerKeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteIssuerKeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.key.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构添加项目密钥
 * Summary: 发行机构添加项目密钥
 */
func (client *Client) AddIssuerProjectkey(request *AddIssuerProjectkeyRequest) (_result *AddIssuerProjectkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddIssuerProjectkeyResponse{}
	_body, _err := client.AddIssuerProjectkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构添加项目密钥
 * Summary: 发行机构添加项目密钥
 */
func (client *Client) AddIssuerProjectkeyEx(request *AddIssuerProjectkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddIssuerProjectkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddIssuerProjectkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.projectkey.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构删除项目密钥
 * Summary: 发行机构删除项目密钥
 */
func (client *Client) DeleteIssuerProjectkey(request *DeleteIssuerProjectkeyRequest) (_result *DeleteIssuerProjectkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteIssuerProjectkeyResponse{}
	_body, _err := client.DeleteIssuerProjectkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构删除项目密钥
 * Summary: 发行机构删除项目密钥
 */
func (client *Client) DeleteIssuerProjectkeyEx(request *DeleteIssuerProjectkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteIssuerProjectkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteIssuerProjectkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.projectkey.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取项目密钥列表
 * Summary: 发行机构获取项目密钥列表
 */
func (client *Client) ListIssuerProjectkey(request *ListIssuerProjectkeyRequest) (_result *ListIssuerProjectkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListIssuerProjectkeyResponse{}
	_body, _err := client.ListIssuerProjectkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取项目密钥列表
 * Summary: 发行机构获取项目密钥列表
 */
func (client *Client) ListIssuerProjectkeyEx(request *ListIssuerProjectkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListIssuerProjectkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListIssuerProjectkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.projectkey.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构分页查询密钥关联的项目
 * Summary: 发行机构分页查询密钥关联的项目
 */
func (client *Client) PagequeryIssuerProjectkey(request *PagequeryIssuerProjectkeyRequest) (_result *PagequeryIssuerProjectkeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryIssuerProjectkeyResponse{}
	_body, _err := client.PagequeryIssuerProjectkeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构分页查询密钥关联的项目
 * Summary: 发行机构分页查询密钥关联的项目
 */
func (client *Client) PagequeryIssuerProjectkeyEx(request *PagequeryIssuerProjectkeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryIssuerProjectkeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryIssuerProjectkeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.projectkey.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新项目净值
 * Summary: 更新项目净值
 */
func (client *Client) UpdateIssuerNetvalue(request *UpdateIssuerNetvalueRequest) (_result *UpdateIssuerNetvalueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateIssuerNetvalueResponse{}
	_body, _err := client.UpdateIssuerNetvalueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新项目净值
 * Summary: 更新项目净值
 */
func (client *Client) UpdateIssuerNetvalueEx(request *UpdateIssuerNetvalueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateIssuerNetvalueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateIssuerNetvalueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.netvalue.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取净值列表
 * Summary: 获取净值列表
 */
func (client *Client) ListIssuerNetvalue(request *ListIssuerNetvalueRequest) (_result *ListIssuerNetvalueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListIssuerNetvalueResponse{}
	_body, _err := client.ListIssuerNetvalueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取净值列表
 * Summary: 获取净值列表
 */
func (client *Client) ListIssuerNetvalueEx(request *ListIssuerNetvalueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListIssuerNetvalueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListIssuerNetvalueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.netvalue.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传项目报告
 * Summary: 上传项目报告
 */
func (client *Client) UploadIssuerReport(request *UploadIssuerReportRequest) (_result *UploadIssuerReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadIssuerReportResponse{}
	_body, _err := client.UploadIssuerReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传项目报告
 * Summary: 上传项目报告
 */
func (client *Client) UploadIssuerReportEx(request *UploadIssuerReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadIssuerReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadIssuerReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.report.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取历史报告列表
 * Summary: 发行机构获取历史报告列表
 */
func (client *Client) ListIssuerReport(request *ListIssuerReportRequest) (_result *ListIssuerReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListIssuerReportResponse{}
	_body, _err := client.ListIssuerReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取历史报告列表
 * Summary: 发行机构获取历史报告列表
 */
func (client *Client) ListIssuerReportEx(request *ListIssuerReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListIssuerReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListIssuerReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.report.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取历史项目报告
 * Summary: 代销机构获取历史项目报告
 */
func (client *Client) ListDistributorReport(request *ListDistributorReportRequest) (_result *ListDistributorReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDistributorReportResponse{}
	_body, _err := client.ListDistributorReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取历史项目报告
 * Summary: 代销机构获取历史项目报告
 */
func (client *Client) ListDistributorReportEx(request *ListDistributorReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDistributorReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDistributorReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.report.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取报告文件下载URL
 * Summary: 发行机构获取报告文件下载URL
 */
func (client *Client) DownloadIssuerReport(request *DownloadIssuerReportRequest) (_result *DownloadIssuerReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadIssuerReportResponse{}
	_body, _err := client.DownloadIssuerReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取报告文件下载URL
 * Summary: 发行机构获取报告文件下载URL
 */
func (client *Client) DownloadIssuerReportEx(request *DownloadIssuerReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadIssuerReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadIssuerReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.report.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取报告文件预览URL
 * Summary: 发行机构获取报告文件预览URL
 */
func (client *Client) PreviewIssuerReport(request *PreviewIssuerReportRequest) (_result *PreviewIssuerReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewIssuerReportResponse{}
	_body, _err := client.PreviewIssuerReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取报告文件预览URL
 * Summary: 发行机构获取报告文件预览URL
 */
func (client *Client) PreviewIssuerReportEx(request *PreviewIssuerReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewIssuerReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewIssuerReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.report.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取报告文件下载URL
 * Summary: 代销机构获取报告文件下载URL
 */
func (client *Client) DownloadDistributorReport(request *DownloadDistributorReportRequest) (_result *DownloadDistributorReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadDistributorReportResponse{}
	_body, _err := client.DownloadDistributorReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取报告文件下载URL
 * Summary: 代销机构获取报告文件下载URL
 */
func (client *Client) DownloadDistributorReportEx(request *DownloadDistributorReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadDistributorReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadDistributorReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.report.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取报告文件预览URL
 * Summary: 代销机构获取报告文件预览URL
 */
func (client *Client) PreviewDistributorReport(request *PreviewDistributorReportRequest) (_result *PreviewDistributorReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewDistributorReportResponse{}
	_body, _err := client.PreviewDistributorReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取报告文件预览URL
 * Summary: 代销机构获取报告文件预览URL
 */
func (client *Client) PreviewDistributorReportEx(request *PreviewDistributorReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewDistributorReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PreviewDistributorReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.report.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询二级用户列表
 * Summary: 分页查询二级用户列表
 */
func (client *Client) PagequeryIssuerSubuser(request *PagequeryIssuerSubuserRequest) (_result *PagequeryIssuerSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryIssuerSubuserResponse{}
	_body, _err := client.PagequeryIssuerSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询二级用户列表
 * Summary: 分页查询二级用户列表
 */
func (client *Client) PagequeryIssuerSubuserEx(request *PagequeryIssuerSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryIssuerSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryIssuerSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subuser.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询二级用户列表
 * Summary: 分页查询二级用户列表
 */
func (client *Client) PagequeryDistributorSubuser(request *PagequeryDistributorSubuserRequest) (_result *PagequeryDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDistributorSubuserResponse{}
	_body, _err := client.PagequeryDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询二级用户列表
 * Summary: 分页查询二级用户列表
 */
func (client *Client) PagequeryDistributorSubuserEx(request *PagequeryDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询单个二级用户
 * Summary: 查询单个二级用户
 */
func (client *Client) QueryIssuerSubuser(request *QueryIssuerSubuserRequest) (_result *QueryIssuerSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIssuerSubuserResponse{}
	_body, _err := client.QueryIssuerSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询单个二级用户
 * Summary: 查询单个二级用户
 */
func (client *Client) QueryIssuerSubuserEx(request *QueryIssuerSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIssuerSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIssuerSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subuser.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询单个二级用户
 * Summary: 查询单个二级用户
 */
func (client *Client) QueryDistributorSubuser(request *QueryDistributorSubuserRequest) (_result *QueryDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDistributorSubuserResponse{}
	_body, _err := client.QueryDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询单个二级用户
 * Summary: 查询单个二级用户
 */
func (client *Client) QueryDistributorSubuserEx(request *QueryDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新二级用户
 * Summary: 更新二级用户
 */
func (client *Client) UpdateDistributorSubuser(request *UpdateDistributorSubuserRequest) (_result *UpdateDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDistributorSubuserResponse{}
	_body, _err := client.UpdateDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新二级用户
 * Summary: 更新二级用户
 */
func (client *Client) UpdateDistributorSubuserEx(request *UpdateDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加二级用户
 * Summary: 添加二级用户
 */
func (client *Client) CreateDistributorSubuser(request *CreateDistributorSubuserRequest) (_result *CreateDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDistributorSubuserResponse{}
	_body, _err := client.CreateDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加二级用户
 * Summary: 添加二级用户
 */
func (client *Client) CreateDistributorSubuserEx(request *CreateDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除二级用户
 * Summary: 删除二级用户
 */
func (client *Client) DeleteDistributorSubuser(request *DeleteDistributorSubuserRequest) (_result *DeleteDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteDistributorSubuserResponse{}
	_body, _err := client.DeleteDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除二级用户
 * Summary: 删除二级用户
 */
func (client *Client) DeleteDistributorSubuserEx(request *DeleteDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取二级用户配额
 * Summary: 获取二级用户配额
 */
func (client *Client) CountDistributorSubusertarget(request *CountDistributorSubusertargetRequest) (_result *CountDistributorSubusertargetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDistributorSubusertargetResponse{}
	_body, _err := client.CountDistributorSubusertargetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取二级用户配额
 * Summary: 获取二级用户配额
 */
func (client *Client) CountDistributorSubusertargetEx(request *CountDistributorSubusertargetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDistributorSubusertargetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDistributorSubusertargetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subusertarget.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行token
 * Summary: 发行token
 */
func (client *Client) IssueIssuerSubusertrade(request *IssueIssuerSubusertradeRequest) (_result *IssueIssuerSubusertradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &IssueIssuerSubusertradeResponse{}
	_body, _err := client.IssueIssuerSubusertradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行token
 * Summary: 发行token
 */
func (client *Client) IssueIssuerSubusertradeEx(request *IssueIssuerSubusertradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *IssueIssuerSubusertradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &IssueIssuerSubusertradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subusertrade.issue"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 赎回token
 * Summary: 赎回token
 */
func (client *Client) RedeemIssuerSubusertrade(request *RedeemIssuerSubusertradeRequest) (_result *RedeemIssuerSubusertradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RedeemIssuerSubusertradeResponse{}
	_body, _err := client.RedeemIssuerSubusertradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 赎回token
 * Summary: 赎回token
 */
func (client *Client) RedeemIssuerSubusertradeEx(request *RedeemIssuerSubusertradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RedeemIssuerSubusertradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RedeemIssuerSubusertradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subusertrade.redeem"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 转移token
 * Summary: 转移token
 */
func (client *Client) TransferIssuerSubusertrade(request *TransferIssuerSubusertradeRequest) (_result *TransferIssuerSubusertradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TransferIssuerSubusertradeResponse{}
	_body, _err := client.TransferIssuerSubusertradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 转移token
 * Summary: 转移token
 */
func (client *Client) TransferIssuerSubusertradeEx(request *TransferIssuerSubusertradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TransferIssuerSubusertradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TransferIssuerSubusertradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subusertrade.transfer"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
