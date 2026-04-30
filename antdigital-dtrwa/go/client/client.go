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

// 跨链账号明细
type CrossChainAccountsDetailVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 交易链上Hash
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty"`
	// 交易类别(LOCK_MINT/BURN_RETRIEVE/INNER_TRANSFER/OTC_TRANSFER)
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
	// 对手地址
	CounterAddress *string `json:"counter_address,omitempty" xml:"counter_address,omitempty"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
}

func (s CrossChainAccountsDetailVO) String() string {
	return tea.Prettify(s)
}

func (s CrossChainAccountsDetailVO) GoString() string {
	return s.String()
}

func (s *CrossChainAccountsDetailVO) SetId(v string) *CrossChainAccountsDetailVO {
	s.Id = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetTransactionHash(v string) *CrossChainAccountsDetailVO {
	s.TransactionHash = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetPreBalance(v string) *CrossChainAccountsDetailVO {
	s.PreBalance = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetTransactionAmount(v string) *CrossChainAccountsDetailVO {
	s.TransactionAmount = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetPostBalance(v string) *CrossChainAccountsDetailVO {
	s.PostBalance = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetTransactionType(v string) *CrossChainAccountsDetailVO {
	s.TransactionType = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetCounterAddress(v string) *CrossChainAccountsDetailVO {
	s.CounterAddress = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetGmtCreated(v int64) *CrossChainAccountsDetailVO {
	s.GmtCreated = &v
	return s
}

func (s *CrossChainAccountsDetailVO) SetGmtModified(v int64) *CrossChainAccountsDetailVO {
	s.GmtModified = &v
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

// 登录类型
type LoginAccountTypeBO struct {
	// 登录类型：EMAIL-邮箱
	UserLoginType *string `json:"user_login_type,omitempty" xml:"user_login_type,omitempty"`
	// 登录名称
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
}

func (s LoginAccountTypeBO) String() string {
	return tea.Prettify(s)
}

func (s LoginAccountTypeBO) GoString() string {
	return s.String()
}

func (s *LoginAccountTypeBO) SetUserLoginType(v string) *LoginAccountTypeBO {
	s.UserLoginType = &v
	return s
}

func (s *LoginAccountTypeBO) SetLoginName(v string) *LoginAccountTypeBO {
	s.LoginName = &v
	return s
}

// 跨链账号红利明细
type CrossChainBonusAccountsDetailVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 交易链上Hash
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty"`
	// 交易类型(LOCK_MINT_BONUS/BURN_RETRIEVE_BONUS/INNER_TRANSFER_BONUS/OTC_TRANSFER_BONUS)
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
	// 对手地址
	CounterAddress *string `json:"counter_address,omitempty" xml:"counter_address,omitempty"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
}

func (s CrossChainBonusAccountsDetailVO) String() string {
	return tea.Prettify(s)
}

func (s CrossChainBonusAccountsDetailVO) GoString() string {
	return s.String()
}

func (s *CrossChainBonusAccountsDetailVO) SetId(v string) *CrossChainBonusAccountsDetailVO {
	s.Id = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetTransactionHash(v string) *CrossChainBonusAccountsDetailVO {
	s.TransactionHash = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetPreBalance(v string) *CrossChainBonusAccountsDetailVO {
	s.PreBalance = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetTransactionAmount(v string) *CrossChainBonusAccountsDetailVO {
	s.TransactionAmount = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetPostBalance(v string) *CrossChainBonusAccountsDetailVO {
	s.PostBalance = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetTransactionType(v string) *CrossChainBonusAccountsDetailVO {
	s.TransactionType = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetCounterAddress(v string) *CrossChainBonusAccountsDetailVO {
	s.CounterAddress = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetGmtCreated(v int64) *CrossChainBonusAccountsDetailVO {
	s.GmtCreated = &v
	return s
}

func (s *CrossChainBonusAccountsDetailVO) SetGmtModified(v int64) *CrossChainBonusAccountsDetailVO {
	s.GmtModified = &v
	return s
}

// 资产账户明细VO
type SubUserAccountDetailsVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 交易链上Hash
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty" require:"true"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty" require:"true"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty" require:"true"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty" require:"true"`
	// 交易类别
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty" require:"true"`
	// 对手地址
	CounterAddress *string `json:"counter_address,omitempty" xml:"counter_address,omitempty" require:"true"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 交易状态
	TransactionStatus *string `json:"transaction_status,omitempty" xml:"transaction_status,omitempty" require:"true"`
}

func (s SubUserAccountDetailsVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountDetailsVO) GoString() string {
	return s.String()
}

func (s *SubUserAccountDetailsVO) SetId(v string) *SubUserAccountDetailsVO {
	s.Id = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetTransactionHash(v string) *SubUserAccountDetailsVO {
	s.TransactionHash = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetPreBalance(v string) *SubUserAccountDetailsVO {
	s.PreBalance = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetTransactionAmount(v string) *SubUserAccountDetailsVO {
	s.TransactionAmount = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetPostBalance(v string) *SubUserAccountDetailsVO {
	s.PostBalance = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetTransactionType(v string) *SubUserAccountDetailsVO {
	s.TransactionType = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetCounterAddress(v string) *SubUserAccountDetailsVO {
	s.CounterAddress = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetGmtCreated(v int64) *SubUserAccountDetailsVO {
	s.GmtCreated = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetGmtModified(v int64) *SubUserAccountDetailsVO {
	s.GmtModified = &v
	return s
}

func (s *SubUserAccountDetailsVO) SetTransactionStatus(v string) *SubUserAccountDetailsVO {
	s.TransactionStatus = &v
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

// 红利账户明细
type SubUserBonusAccountDetailVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 交易链上Hash
	TransactionHash *string `json:"transaction_hash,omitempty" xml:"transaction_hash,omitempty" require:"true"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty" require:"true"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty" require:"true"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty" require:"true"`
	// 交易类别（REPAY/TRANSFER/LOCK/UNLOCK/WITHDRAW/OTC_TRANSFER/TRANSFER_TO_VIRTUAL/WITHDRAW_FROM_VIRTUAL）
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty" require:"true"`
	// 对手地址
	CounterAddress *string `json:"counter_address,omitempty" xml:"counter_address,omitempty" require:"true"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 交易状态（PENDING/CONFIRMED/INVALID）
	TransactionStatus *string `json:"transaction_status,omitempty" xml:"transaction_status,omitempty" require:"true"`
}

func (s SubUserBonusAccountDetailVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserBonusAccountDetailVO) GoString() string {
	return s.String()
}

func (s *SubUserBonusAccountDetailVO) SetId(v string) *SubUserBonusAccountDetailVO {
	s.Id = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetTransactionHash(v string) *SubUserBonusAccountDetailVO {
	s.TransactionHash = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetPreBalance(v string) *SubUserBonusAccountDetailVO {
	s.PreBalance = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetTransactionAmount(v string) *SubUserBonusAccountDetailVO {
	s.TransactionAmount = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetPostBalance(v string) *SubUserBonusAccountDetailVO {
	s.PostBalance = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetTransactionType(v string) *SubUserBonusAccountDetailVO {
	s.TransactionType = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetCounterAddress(v string) *SubUserBonusAccountDetailVO {
	s.CounterAddress = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetGmtCreated(v int64) *SubUserBonusAccountDetailVO {
	s.GmtCreated = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetGmtModified(v int64) *SubUserBonusAccountDetailVO {
	s.GmtModified = &v
	return s
}

func (s *SubUserBonusAccountDetailVO) SetTransactionStatus(v string) *SubUserBonusAccountDetailVO {
	s.TransactionStatus = &v
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

// 虚拟子账户明细
type SubUserVirtualAccountDetailVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty"`
	// 交易类型(TRANSFER_IN、TRANSFER_OUT)
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 交易状态（PENDING/CONFIRMED/INVALID）
	TransactionStatus *string `json:"transaction_status,omitempty" xml:"transaction_status,omitempty"`
}

func (s SubUserVirtualAccountDetailVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserVirtualAccountDetailVO) GoString() string {
	return s.String()
}

func (s *SubUserVirtualAccountDetailVO) SetId(v string) *SubUserVirtualAccountDetailVO {
	s.Id = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetPreBalance(v string) *SubUserVirtualAccountDetailVO {
	s.PreBalance = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetTransactionAmount(v string) *SubUserVirtualAccountDetailVO {
	s.TransactionAmount = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetPostBalance(v string) *SubUserVirtualAccountDetailVO {
	s.PostBalance = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetTransactionType(v string) *SubUserVirtualAccountDetailVO {
	s.TransactionType = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetGmtCreated(v int64) *SubUserVirtualAccountDetailVO {
	s.GmtCreated = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetGmtModified(v int64) *SubUserVirtualAccountDetailVO {
	s.GmtModified = &v
	return s
}

func (s *SubUserVirtualAccountDetailVO) SetTransactionStatus(v string) *SubUserVirtualAccountDetailVO {
	s.TransactionStatus = &v
	return s
}

// 虚拟子账户红利明细
type SubUserBonusVirtualAccountDetailVO struct {
	// 明细ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 交易前余额
	PreBalance *string `json:"pre_balance,omitempty" xml:"pre_balance,omitempty"`
	// 交易数量
	TransactionAmount *string `json:"transaction_amount,omitempty" xml:"transaction_amount,omitempty"`
	// 交易后余额
	PostBalance *string `json:"post_balance,omitempty" xml:"post_balance,omitempty"`
	// 交易类型(TRANSFER_IN、TRANSFER_OUT)
	TransactionType *string `json:"transaction_type,omitempty" xml:"transaction_type,omitempty"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
	// 更新时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 交易状态（PENDING/CONFIRMED/INVALID）
	TransactionStatus *string `json:"transaction_status,omitempty" xml:"transaction_status,omitempty"`
}

func (s SubUserBonusVirtualAccountDetailVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserBonusVirtualAccountDetailVO) GoString() string {
	return s.String()
}

func (s *SubUserBonusVirtualAccountDetailVO) SetId(v string) *SubUserBonusVirtualAccountDetailVO {
	s.Id = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetPreBalance(v string) *SubUserBonusVirtualAccountDetailVO {
	s.PreBalance = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetTransactionAmount(v string) *SubUserBonusVirtualAccountDetailVO {
	s.TransactionAmount = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetPostBalance(v string) *SubUserBonusVirtualAccountDetailVO {
	s.PostBalance = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetTransactionType(v string) *SubUserBonusVirtualAccountDetailVO {
	s.TransactionType = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetGmtCreated(v int64) *SubUserBonusVirtualAccountDetailVO {
	s.GmtCreated = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetGmtModified(v int64) *SubUserBonusVirtualAccountDetailVO {
	s.GmtModified = &v
	return s
}

func (s *SubUserBonusVirtualAccountDetailVO) SetTransactionStatus(v string) *SubUserBonusVirtualAccountDetailVO {
	s.TransactionStatus = &v
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

// 虚拟子账号信息
type SubUserVirtualAccountInfoBO struct {
	// 虚拟子账户ID
	SubUserVirtualAccountId *string `json:"sub_user_virtual_account_id,omitempty" xml:"sub_user_virtual_account_id,omitempty"`
	// 虚拟子账号对应用户ID
	VirtualAccountUserId *string `json:"virtual_account_user_id,omitempty" xml:"virtual_account_user_id,omitempty"`
	// 虚拟子账户邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
}

func (s SubUserVirtualAccountInfoBO) String() string {
	return tea.Prettify(s)
}

func (s SubUserVirtualAccountInfoBO) GoString() string {
	return s.String()
}

func (s *SubUserVirtualAccountInfoBO) SetSubUserVirtualAccountId(v string) *SubUserVirtualAccountInfoBO {
	s.SubUserVirtualAccountId = &v
	return s
}

func (s *SubUserVirtualAccountInfoBO) SetVirtualAccountUserId(v string) *SubUserVirtualAccountInfoBO {
	s.VirtualAccountUserId = &v
	return s
}

func (s *SubUserVirtualAccountInfoBO) SetEmail(v string) *SubUserVirtualAccountInfoBO {
	s.Email = &v
	return s
}

func (s *SubUserVirtualAccountInfoBO) SetAlias(v string) *SubUserVirtualAccountInfoBO {
	s.Alias = &v
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

// 跨链账户信息
type CrossChainAccountsVO struct {
	// 对侧链用户地址
	TargetUserAddress *string `json:"target_user_address,omitempty" xml:"target_user_address,omitempty"`
	// 对侧链账户ID
	CrossChainUserAccountId *string `json:"cross_chain_user_account_id,omitempty" xml:"cross_chain_user_account_id,omitempty"`
	// 对侧链红利账户ID
	CrossChainUserBonusAccountId *string `json:"cross_chain_user_bonus_account_id,omitempty" xml:"cross_chain_user_bonus_account_id,omitempty"`
	// 对侧链资产账户明细
	CrossChainUserAccountsDetails []*CrossChainAccountsDetailVO `json:"cross_chain_user_accounts_details,omitempty" xml:"cross_chain_user_accounts_details,omitempty" type:"Repeated"`
	// 对侧链账户信息
	CrossChainBonusAccountsDetails []*CrossChainBonusAccountsDetailVO `json:"cross_chain_bonus_accounts_details,omitempty" xml:"cross_chain_bonus_accounts_details,omitempty" type:"Repeated"`
}

func (s CrossChainAccountsVO) String() string {
	return tea.Prettify(s)
}

func (s CrossChainAccountsVO) GoString() string {
	return s.String()
}

func (s *CrossChainAccountsVO) SetTargetUserAddress(v string) *CrossChainAccountsVO {
	s.TargetUserAddress = &v
	return s
}

func (s *CrossChainAccountsVO) SetCrossChainUserAccountId(v string) *CrossChainAccountsVO {
	s.CrossChainUserAccountId = &v
	return s
}

func (s *CrossChainAccountsVO) SetCrossChainUserBonusAccountId(v string) *CrossChainAccountsVO {
	s.CrossChainUserBonusAccountId = &v
	return s
}

func (s *CrossChainAccountsVO) SetCrossChainUserAccountsDetails(v []*CrossChainAccountsDetailVO) *CrossChainAccountsVO {
	s.CrossChainUserAccountsDetails = v
	return s
}

func (s *CrossChainAccountsVO) SetCrossChainBonusAccountsDetails(v []*CrossChainBonusAccountsDetailVO) *CrossChainAccountsVO {
	s.CrossChainBonusAccountsDetails = v
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

// 跨链账号信息
type CrossChainSubUserAccountInfoBO struct {
	// 跨链账号Id
	CrossChainUserAccountId *string `json:"cross_chain_user_account_id,omitempty" xml:"cross_chain_user_account_id,omitempty"`
	// 跨链账号地址
	TargetUserAddress *string `json:"target_user_address,omitempty" xml:"target_user_address,omitempty"`
	// 目标链所在链
	TargetChainName *string `json:"target_chain_name,omitempty" xml:"target_chain_name,omitempty"`
}

func (s CrossChainSubUserAccountInfoBO) String() string {
	return tea.Prettify(s)
}

func (s CrossChainSubUserAccountInfoBO) GoString() string {
	return s.String()
}

func (s *CrossChainSubUserAccountInfoBO) SetCrossChainUserAccountId(v string) *CrossChainSubUserAccountInfoBO {
	s.CrossChainUserAccountId = &v
	return s
}

func (s *CrossChainSubUserAccountInfoBO) SetTargetUserAddress(v string) *CrossChainSubUserAccountInfoBO {
	s.TargetUserAddress = &v
	return s
}

func (s *CrossChainSubUserAccountInfoBO) SetTargetChainName(v string) *CrossChainSubUserAccountInfoBO {
	s.TargetChainName = &v
	return s
}

// 操作角色
type UserOperatorInfoBO struct {
	// userId
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 钱包地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 登录账号类型列表
	UserLoginAccountList []*LoginAccountTypeBO `json:"user_login_account_list,omitempty" xml:"user_login_account_list,omitempty" type:"Repeated"`
	// 机构类型列表
	UserInstitutionTypeList []*string `json:"user_institution_type_list,omitempty" xml:"user_institution_type_list,omitempty" type:"Repeated"`
}

func (s UserOperatorInfoBO) String() string {
	return tea.Prettify(s)
}

func (s UserOperatorInfoBO) GoString() string {
	return s.String()
}

func (s *UserOperatorInfoBO) SetUserId(v string) *UserOperatorInfoBO {
	s.UserId = &v
	return s
}

func (s *UserOperatorInfoBO) SetAlias(v string) *UserOperatorInfoBO {
	s.Alias = &v
	return s
}

func (s *UserOperatorInfoBO) SetAddress(v string) *UserOperatorInfoBO {
	s.Address = &v
	return s
}

func (s *UserOperatorInfoBO) SetUserLoginAccountList(v []*LoginAccountTypeBO) *UserOperatorInfoBO {
	s.UserLoginAccountList = v
	return s
}

func (s *UserOperatorInfoBO) SetUserInstitutionTypeList(v []*string) *UserOperatorInfoBO {
	s.UserInstitutionTypeList = v
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

// 所有系统操作日志
type OperationLogVO struct {
	// ID主键
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 创建时间戳（毫秒）
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
	// 更新时间戳（毫秒）
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 发起操作的URL接口
	RequestUrl *string `json:"request_url,omitempty" xml:"request_url,omitempty"`
	// 发起操作的URL接口描述code值
	ApiDesc *string `json:"api_desc,omitempty" xml:"api_desc,omitempty"`
	// 发起操作的URL接口中文描述
	ChDesc *string `json:"ch_desc,omitempty" xml:"ch_desc,omitempty"`
	// 设备信息
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
	// 设备Hash
	DeviceHash *string `json:"device_hash,omitempty" xml:"device_hash,omitempty"`
	// 操作种类
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 请求输入
	RequestInput *string `json:"request_input,omitempty" xml:"request_input,omitempty"`
	// 请求输出
	RequestOutput *string `json:"request_output,omitempty" xml:"request_output,omitempty"`
	// 操作状态：true/false
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 操作来源
	RequestFrom *string `json:"request_from,omitempty" xml:"request_from,omitempty"`
	// 发起IP地址
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 扩展字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 登录名类型(EMAIL)
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 登录名
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty"`
}

func (s OperationLogVO) String() string {
	return tea.Prettify(s)
}

func (s OperationLogVO) GoString() string {
	return s.String()
}

func (s *OperationLogVO) SetId(v string) *OperationLogVO {
	s.Id = &v
	return s
}

func (s *OperationLogVO) SetGmtCreated(v int64) *OperationLogVO {
	s.GmtCreated = &v
	return s
}

func (s *OperationLogVO) SetGmtModified(v int64) *OperationLogVO {
	s.GmtModified = &v
	return s
}

func (s *OperationLogVO) SetUserId(v string) *OperationLogVO {
	s.UserId = &v
	return s
}

func (s *OperationLogVO) SetUserAddress(v string) *OperationLogVO {
	s.UserAddress = &v
	return s
}

func (s *OperationLogVO) SetRequestUrl(v string) *OperationLogVO {
	s.RequestUrl = &v
	return s
}

func (s *OperationLogVO) SetApiDesc(v string) *OperationLogVO {
	s.ApiDesc = &v
	return s
}

func (s *OperationLogVO) SetChDesc(v string) *OperationLogVO {
	s.ChDesc = &v
	return s
}

func (s *OperationLogVO) SetDeviceInfo(v string) *OperationLogVO {
	s.DeviceInfo = &v
	return s
}

func (s *OperationLogVO) SetDeviceHash(v string) *OperationLogVO {
	s.DeviceHash = &v
	return s
}

func (s *OperationLogVO) SetOperationType(v string) *OperationLogVO {
	s.OperationType = &v
	return s
}

func (s *OperationLogVO) SetRequestInput(v string) *OperationLogVO {
	s.RequestInput = &v
	return s
}

func (s *OperationLogVO) SetRequestOutput(v string) *OperationLogVO {
	s.RequestOutput = &v
	return s
}

func (s *OperationLogVO) SetSuccess(v bool) *OperationLogVO {
	s.Success = &v
	return s
}

func (s *OperationLogVO) SetRequestFrom(v string) *OperationLogVO {
	s.RequestFrom = &v
	return s
}

func (s *OperationLogVO) SetIp(v string) *OperationLogVO {
	s.Ip = &v
	return s
}

func (s *OperationLogVO) SetExtInfo(v string) *OperationLogVO {
	s.ExtInfo = &v
	return s
}

func (s *OperationLogVO) SetLoginAccountType(v string) *OperationLogVO {
	s.LoginAccountType = &v
	return s
}

func (s *OperationLogVO) SetLoginAccount(v string) *OperationLogVO {
	s.LoginAccount = &v
	return s
}

// 二级用户基础信息
type SubUserAccountBaseVO struct {
	// 二级用户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty" require:"true"`
	// 用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 用户邮箱
	Contact *string `json:"contact,omitempty" xml:"contact,omitempty"`
	// 用户昵称
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty" require:"true"`
	// 链名称
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty" require:"true"`
	// 虚拟子账号信息
	SubUserVirtualAccountsInfo []*SubUserVirtualAccountInfoBO `json:"sub_user_virtual_accounts_info,omitempty" xml:"sub_user_virtual_accounts_info,omitempty" type:"Repeated"`
	// 跨链账号信息
	CrossChainSubUserAccountsInfo []*CrossChainSubUserAccountInfoBO `json:"cross_chain_sub_user_accounts_info,omitempty" xml:"cross_chain_sub_user_accounts_info,omitempty" type:"Repeated"`
}

func (s SubUserAccountBaseVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountBaseVO) GoString() string {
	return s.String()
}

func (s *SubUserAccountBaseVO) SetSubUserAccountId(v string) *SubUserAccountBaseVO {
	s.SubUserAccountId = &v
	return s
}

func (s *SubUserAccountBaseVO) SetUserAddress(v string) *SubUserAccountBaseVO {
	s.UserAddress = &v
	return s
}

func (s *SubUserAccountBaseVO) SetContact(v string) *SubUserAccountBaseVO {
	s.Contact = &v
	return s
}

func (s *SubUserAccountBaseVO) SetAlias(v string) *SubUserAccountBaseVO {
	s.Alias = &v
	return s
}

func (s *SubUserAccountBaseVO) SetAssetProjectId(v string) *SubUserAccountBaseVO {
	s.AssetProjectId = &v
	return s
}

func (s *SubUserAccountBaseVO) SetChainName(v string) *SubUserAccountBaseVO {
	s.ChainName = &v
	return s
}

func (s *SubUserAccountBaseVO) SetSubUserVirtualAccountsInfo(v []*SubUserVirtualAccountInfoBO) *SubUserAccountBaseVO {
	s.SubUserVirtualAccountsInfo = v
	return s
}

func (s *SubUserAccountBaseVO) SetCrossChainSubUserAccountsInfo(v []*CrossChainSubUserAccountInfoBO) *SubUserAccountBaseVO {
	s.CrossChainSubUserAccountsInfo = v
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

// 本侧链持币情况
type SubUserAccountCeilingBaseVO struct {
	// 项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 代币合约地址
	TokenAddress *string `json:"token_address,omitempty" xml:"token_address,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录类型
	LoginType *string `json:"login_type,omitempty" xml:"login_type,omitempty"`
	// 别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 实际持有份额
	RealShares *string `json:"real_shares,omitempty" xml:"real_shares,omitempty"`
	// 代币名称
	BonusTokenName *string `json:"bonus_token_name,omitempty" xml:"bonus_token_name,omitempty"`
	// 代币合约名称
	BonusTokenAddress *string `json:"bonus_token_address,omitempty" xml:"bonus_token_address,omitempty"`
	// 红利份额
	RealBonus *string `json:"real_bonus,omitempty" xml:"real_bonus,omitempty"`
	// 锁定金额
	LockedAmount *string `json:"locked_amount,omitempty" xml:"locked_amount,omitempty"`
	// 虚拟子账户余额
	VirtualAccountBalance *string `json:"virtual_account_balance,omitempty" xml:"virtual_account_balance,omitempty"`
}

func (s SubUserAccountCeilingBaseVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountCeilingBaseVO) GoString() string {
	return s.String()
}

func (s *SubUserAccountCeilingBaseVO) SetAssetProjectId(v string) *SubUserAccountCeilingBaseVO {
	s.AssetProjectId = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetTokenName(v string) *SubUserAccountCeilingBaseVO {
	s.TokenName = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetTokenAddress(v string) *SubUserAccountCeilingBaseVO {
	s.TokenAddress = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetUserId(v string) *SubUserAccountCeilingBaseVO {
	s.UserId = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetUserAddress(v string) *SubUserAccountCeilingBaseVO {
	s.UserAddress = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetLoginName(v string) *SubUserAccountCeilingBaseVO {
	s.LoginName = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetLoginType(v string) *SubUserAccountCeilingBaseVO {
	s.LoginType = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetAlias(v string) *SubUserAccountCeilingBaseVO {
	s.Alias = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetRealShares(v string) *SubUserAccountCeilingBaseVO {
	s.RealShares = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetBonusTokenName(v string) *SubUserAccountCeilingBaseVO {
	s.BonusTokenName = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetBonusTokenAddress(v string) *SubUserAccountCeilingBaseVO {
	s.BonusTokenAddress = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetRealBonus(v string) *SubUserAccountCeilingBaseVO {
	s.RealBonus = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetLockedAmount(v string) *SubUserAccountCeilingBaseVO {
	s.LockedAmount = &v
	return s
}

func (s *SubUserAccountCeilingBaseVO) SetVirtualAccountBalance(v string) *SubUserAccountCeilingBaseVO {
	s.VirtualAccountBalance = &v
	return s
}

// 项目角色信息
type ProjectWithRole struct {
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 项目名称
	ProjcetName *string `json:"projcet_name,omitempty" xml:"projcet_name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// token名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 最大供应量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty"`
	// 价格类型：PROJECT_NAV 项目净值 TOKEN_PRICE token
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty"`
	// 项目净值
	ProjectNetValue *string `json:"project_net_value,omitempty" xml:"project_net_value,omitempty"`
	// 最大限额
	MaxSubscriptionAmount *string `json:"max_subscription_amount,omitempty" xml:"max_subscription_amount,omitempty"`
	// 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
	DeploymentType *string `json:"deployment_type,omitempty" xml:"deployment_type,omitempty"`
	// 项目所在链
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// 操作角色列表
	UserOperatorList []*UserOperatorInfoBO `json:"user_operator_list,omitempty" xml:"user_operator_list,omitempty" type:"Repeated"`
	// 代销者机构集合
	ParticipantInfos []*ParticipantInfo `json:"participant_infos,omitempty" xml:"participant_infos,omitempty" type:"Repeated"`
}

func (s ProjectWithRole) String() string {
	return tea.Prettify(s)
}

func (s ProjectWithRole) GoString() string {
	return s.String()
}

func (s *ProjectWithRole) SetProjectId(v string) *ProjectWithRole {
	s.ProjectId = &v
	return s
}

func (s *ProjectWithRole) SetProjcetName(v string) *ProjectWithRole {
	s.ProjcetName = &v
	return s
}

func (s *ProjectWithRole) SetDescription(v string) *ProjectWithRole {
	s.Description = &v
	return s
}

func (s *ProjectWithRole) SetTokenName(v string) *ProjectWithRole {
	s.TokenName = &v
	return s
}

func (s *ProjectWithRole) SetCapacity(v string) *ProjectWithRole {
	s.Capacity = &v
	return s
}

func (s *ProjectWithRole) SetNetValue(v string) *ProjectWithRole {
	s.NetValue = &v
	return s
}

func (s *ProjectWithRole) SetPriceType(v string) *ProjectWithRole {
	s.PriceType = &v
	return s
}

func (s *ProjectWithRole) SetProjectNetValue(v string) *ProjectWithRole {
	s.ProjectNetValue = &v
	return s
}

func (s *ProjectWithRole) SetMaxSubscriptionAmount(v string) *ProjectWithRole {
	s.MaxSubscriptionAmount = &v
	return s
}

func (s *ProjectWithRole) SetDeploymentType(v string) *ProjectWithRole {
	s.DeploymentType = &v
	return s
}

func (s *ProjectWithRole) SetChainType(v string) *ProjectWithRole {
	s.ChainType = &v
	return s
}

func (s *ProjectWithRole) SetUserOperatorList(v []*UserOperatorInfoBO) *ProjectWithRole {
	s.UserOperatorList = v
	return s
}

func (s *ProjectWithRole) SetParticipantInfos(v []*ParticipantInfo) *ProjectWithRole {
	s.ParticipantInfos = v
	return s
}

// 跨链账号明细
type CrossAccountListVO struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 资产项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 红利合约地址
	BonusAddress *string `json:"bonus_address,omitempty" xml:"bonus_address,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 代销机构ID
	DistributorInstitutionId *string `json:"distributor_institution_id,omitempty" xml:"distributor_institution_id,omitempty"`
	// 项目代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 项目代币符号
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty"`
	// 发行链名称
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 投资者用户账户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty"`
	// 投资者用户红利账户ID
	SubUserBonusAccountId *string `json:"sub_user_bonus_account_id,omitempty" xml:"sub_user_bonus_account_id,omitempty"`
	// 目标链名称
	TargetChainName *string `json:"target_chain_name,omitempty" xml:"target_chain_name,omitempty"`
	// 目标链资产合约地址
	TargetChainAssetTokenAddress *string `json:"target_chain_asset_token_address,omitempty" xml:"target_chain_asset_token_address,omitempty"`
	// 目标链红利合约地址
	TargetChainBonusAddress *string `json:"target_chain_bonus_address,omitempty" xml:"target_chain_bonus_address,omitempty"`
	// 对侧链账户信息
	CrossChainAccountsInfo []*CrossChainAccountsVO `json:"cross_chain_accounts_info,omitempty" xml:"cross_chain_accounts_info,omitempty" type:"Repeated"`
}

func (s CrossAccountListVO) String() string {
	return tea.Prettify(s)
}

func (s CrossAccountListVO) GoString() string {
	return s.String()
}

func (s *CrossAccountListVO) SetProjectId(v string) *CrossAccountListVO {
	s.ProjectId = &v
	return s
}

func (s *CrossAccountListVO) SetAssetProjectAddress(v string) *CrossAccountListVO {
	s.AssetProjectAddress = &v
	return s
}

func (s *CrossAccountListVO) SetBonusAddress(v string) *CrossAccountListVO {
	s.BonusAddress = &v
	return s
}

func (s *CrossAccountListVO) SetUserId(v string) *CrossAccountListVO {
	s.UserId = &v
	return s
}

func (s *CrossAccountListVO) SetDistributorInstitutionId(v string) *CrossAccountListVO {
	s.DistributorInstitutionId = &v
	return s
}

func (s *CrossAccountListVO) SetTokenName(v string) *CrossAccountListVO {
	s.TokenName = &v
	return s
}

func (s *CrossAccountListVO) SetTokenSymbol(v string) *CrossAccountListVO {
	s.TokenSymbol = &v
	return s
}

func (s *CrossAccountListVO) SetChainName(v string) *CrossAccountListVO {
	s.ChainName = &v
	return s
}

func (s *CrossAccountListVO) SetSubUserAccountId(v string) *CrossAccountListVO {
	s.SubUserAccountId = &v
	return s
}

func (s *CrossAccountListVO) SetSubUserBonusAccountId(v string) *CrossAccountListVO {
	s.SubUserBonusAccountId = &v
	return s
}

func (s *CrossAccountListVO) SetTargetChainName(v string) *CrossAccountListVO {
	s.TargetChainName = &v
	return s
}

func (s *CrossAccountListVO) SetTargetChainAssetTokenAddress(v string) *CrossAccountListVO {
	s.TargetChainAssetTokenAddress = &v
	return s
}

func (s *CrossAccountListVO) SetTargetChainBonusAddress(v string) *CrossAccountListVO {
	s.TargetChainBonusAddress = &v
	return s
}

func (s *CrossAccountListVO) SetCrossChainAccountsInfo(v []*CrossChainAccountsVO) *CrossAccountListVO {
	s.CrossChainAccountsInfo = v
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

// 登入登出接口操作日志回参
type LoginOperationLogVO struct {
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录类型
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 请求URL
	RequestURL *string `json:"request_u_r_l,omitempty" xml:"request_u_r_l,omitempty" require:"true"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 创建时间
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty" require:"true"`
}

func (s LoginOperationLogVO) String() string {
	return tea.Prettify(s)
}

func (s LoginOperationLogVO) GoString() string {
	return s.String()
}

func (s *LoginOperationLogVO) SetUserId(v string) *LoginOperationLogVO {
	s.UserId = &v
	return s
}

func (s *LoginOperationLogVO) SetUserAddress(v string) *LoginOperationLogVO {
	s.UserAddress = &v
	return s
}

func (s *LoginOperationLogVO) SetLoginName(v string) *LoginOperationLogVO {
	s.LoginName = &v
	return s
}

func (s *LoginOperationLogVO) SetLoginAccountType(v string) *LoginOperationLogVO {
	s.LoginAccountType = &v
	return s
}

func (s *LoginOperationLogVO) SetRequestURL(v string) *LoginOperationLogVO {
	s.RequestURL = &v
	return s
}

func (s *LoginOperationLogVO) SetSuccess(v bool) *LoginOperationLogVO {
	s.Success = &v
	return s
}

func (s *LoginOperationLogVO) SetGmtCreated(v int64) *LoginOperationLogVO {
	s.GmtCreated = &v
	return s
}

// 资产账户明细与红利账户明细
type SubUserAccountDetailVO struct {
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 资产项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 红利合约地址
	BonusAddress *string `json:"bonus_address,omitempty" xml:"bonus_address,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 代销机构ID
	DistributorInstitutionId *string `json:"distributor_institution_id,omitempty" xml:"distributor_institution_id,omitempty"`
	// 项目代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 项目代币符号
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty"`
	// 发行链名称
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 投资者用户账户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty"`
	// 投资者用户红利账户ID
	SubUserBonusAccountId *string `json:"sub_user_bonus_account_id,omitempty" xml:"sub_user_bonus_account_id,omitempty"`
	// 资产账户明细
	SubUserAccountDetails []*SubUserAccountDetailsVO `json:"sub_user_account_details,omitempty" xml:"sub_user_account_details,omitempty" type:"Repeated"`
	// 红利账户明细
	SubUserBonusAccountDetails []*SubUserBonusAccountDetailVO `json:"sub_user_bonus_account_details,omitempty" xml:"sub_user_bonus_account_details,omitempty" type:"Repeated"`
}

func (s SubUserAccountDetailVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserAccountDetailVO) GoString() string {
	return s.String()
}

func (s *SubUserAccountDetailVO) SetProjectId(v string) *SubUserAccountDetailVO {
	s.ProjectId = &v
	return s
}

func (s *SubUserAccountDetailVO) SetAssetProjectAddress(v string) *SubUserAccountDetailVO {
	s.AssetProjectAddress = &v
	return s
}

func (s *SubUserAccountDetailVO) SetBonusAddress(v string) *SubUserAccountDetailVO {
	s.BonusAddress = &v
	return s
}

func (s *SubUserAccountDetailVO) SetUserId(v string) *SubUserAccountDetailVO {
	s.UserId = &v
	return s
}

func (s *SubUserAccountDetailVO) SetDistributorInstitutionId(v string) *SubUserAccountDetailVO {
	s.DistributorInstitutionId = &v
	return s
}

func (s *SubUserAccountDetailVO) SetTokenName(v string) *SubUserAccountDetailVO {
	s.TokenName = &v
	return s
}

func (s *SubUserAccountDetailVO) SetTokenSymbol(v string) *SubUserAccountDetailVO {
	s.TokenSymbol = &v
	return s
}

func (s *SubUserAccountDetailVO) SetChainName(v string) *SubUserAccountDetailVO {
	s.ChainName = &v
	return s
}

func (s *SubUserAccountDetailVO) SetSubUserAccountId(v string) *SubUserAccountDetailVO {
	s.SubUserAccountId = &v
	return s
}

func (s *SubUserAccountDetailVO) SetSubUserBonusAccountId(v string) *SubUserAccountDetailVO {
	s.SubUserBonusAccountId = &v
	return s
}

func (s *SubUserAccountDetailVO) SetSubUserAccountDetails(v []*SubUserAccountDetailsVO) *SubUserAccountDetailVO {
	s.SubUserAccountDetails = v
	return s
}

func (s *SubUserAccountDetailVO) SetSubUserBonusAccountDetails(v []*SubUserBonusAccountDetailVO) *SubUserAccountDetailVO {
	s.SubUserBonusAccountDetails = v
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

// 虚拟子账号明细与红利明细
type SubUserVirtualAccountListVO struct {
	// 项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 红利合约地址
	BonusAddress *string `json:"bonus_address,omitempty" xml:"bonus_address,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 代销机构ID
	DistributorInstitutionId *string `json:"distributor_institution_id,omitempty" xml:"distributor_institution_id,omitempty"`
	// 链名
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 投资者用户账户ID
	SubUserAccountId *string `json:"sub_user_account_id,omitempty" xml:"sub_user_account_id,omitempty"`
	// 虚拟子账户ID
	SubUserVirtualAccountId *string `json:"sub_user_virtual_account_id,omitempty" xml:"sub_user_virtual_account_id,omitempty"`
	// 虚拟子账户红利账户ID
	SubUserBonusVirtualAccountId *string `json:"sub_user_bonus_virtual_account_id,omitempty" xml:"sub_user_bonus_virtual_account_id,omitempty"`
	// 虚拟子账户明细
	SubUserVirtualAccountDetails []*SubUserVirtualAccountDetailVO `json:"sub_user_virtual_account_details,omitempty" xml:"sub_user_virtual_account_details,omitempty" type:"Repeated"`
	// 虚拟子账户红利明细
	SubUserBonusVirtualAccountDetails []*SubUserBonusVirtualAccountDetailVO `json:"sub_user_bonus_virtual_account_details,omitempty" xml:"sub_user_bonus_virtual_account_details,omitempty" type:"Repeated"`
}

func (s SubUserVirtualAccountListVO) String() string {
	return tea.Prettify(s)
}

func (s SubUserVirtualAccountListVO) GoString() string {
	return s.String()
}

func (s *SubUserVirtualAccountListVO) SetAssetProjectId(v string) *SubUserVirtualAccountListVO {
	s.AssetProjectId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetAssetProjectAddress(v string) *SubUserVirtualAccountListVO {
	s.AssetProjectAddress = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetBonusAddress(v string) *SubUserVirtualAccountListVO {
	s.BonusAddress = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetUserId(v string) *SubUserVirtualAccountListVO {
	s.UserId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetDistributorInstitutionId(v string) *SubUserVirtualAccountListVO {
	s.DistributorInstitutionId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetChainName(v string) *SubUserVirtualAccountListVO {
	s.ChainName = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetSubUserAccountId(v string) *SubUserVirtualAccountListVO {
	s.SubUserAccountId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetSubUserVirtualAccountId(v string) *SubUserVirtualAccountListVO {
	s.SubUserVirtualAccountId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetSubUserBonusVirtualAccountId(v string) *SubUserVirtualAccountListVO {
	s.SubUserBonusVirtualAccountId = &v
	return s
}

func (s *SubUserVirtualAccountListVO) SetSubUserVirtualAccountDetails(v []*SubUserVirtualAccountDetailVO) *SubUserVirtualAccountListVO {
	s.SubUserVirtualAccountDetails = v
	return s
}

func (s *SubUserVirtualAccountListVO) SetSubUserBonusVirtualAccountDetails(v []*SubUserBonusVirtualAccountDetailVO) *SubUserVirtualAccountListVO {
	s.SubUserBonusVirtualAccountDetails = v
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

// 对侧链持币情况
type CrossChainSubUserAccountCeilingBaseVO struct {
	// 项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 代币合约地址
	TokenAddress *string `json:"token_address,omitempty" xml:"token_address,omitempty"`
	// 别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 实际持有份额
	RealShares *string `json:"real_shares,omitempty" xml:"real_shares,omitempty"`
	// 代币名称
	BonusTokenName *string `json:"bonus_token_name,omitempty" xml:"bonus_token_name,omitempty"`
	// 代币合约名称
	BonusTokenAddress *string `json:"bonus_token_address,omitempty" xml:"bonus_token_address,omitempty"`
	// 红利份额
	RealBonus *string `json:"real_bonus,omitempty" xml:"real_bonus,omitempty"`
	// 目标链
	TagetChainType *string `json:"taget_chain_type,omitempty" xml:"taget_chain_type,omitempty"`
	// 目标链用户地址
	TargetUserAddress *string `json:"target_user_address,omitempty" xml:"target_user_address,omitempty"`
}

func (s CrossChainSubUserAccountCeilingBaseVO) String() string {
	return tea.Prettify(s)
}

func (s CrossChainSubUserAccountCeilingBaseVO) GoString() string {
	return s.String()
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetAssetProjectId(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.AssetProjectId = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetTokenName(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.TokenName = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetTokenAddress(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.TokenAddress = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetAlias(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.Alias = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetRealShares(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.RealShares = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetBonusTokenName(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.BonusTokenName = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetBonusTokenAddress(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.BonusTokenAddress = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetRealBonus(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.RealBonus = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetTagetChainType(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.TagetChainType = &v
	return s
}

func (s *CrossChainSubUserAccountCeilingBaseVO) SetTargetUserAddress(v string) *CrossChainSubUserAccountCeilingBaseVO {
	s.TargetUserAddress = &v
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

// 项目基础信息
type ProjectBaseInfoVO struct {
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 资产项目合约地址
	// （Launch Network/Shares token ）
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 项目状态
	ProjectStatus *string `json:"project_status,omitempty" xml:"project_status,omitempty"`
	// 项目所在链（Launch Network）
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// 代币名称
	TokenName *string `json:"token_name,omitempty" xml:"token_name,omitempty"`
	// 项目代币符号
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty"`
	// 总发行量
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// 单钱包最大可持有份额
	MaxSubscriptionAmount *string `json:"max_subscription_amount,omitempty" xml:"max_subscription_amount,omitempty"`
	// 创建时间戳（毫秒）
	GmtCreated *int64 `json:"gmt_created,omitempty" xml:"gmt_created,omitempty"`
}

func (s ProjectBaseInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ProjectBaseInfoVO) GoString() string {
	return s.String()
}

func (s *ProjectBaseInfoVO) SetProjectId(v string) *ProjectBaseInfoVO {
	s.ProjectId = &v
	return s
}

func (s *ProjectBaseInfoVO) SetAssetProjectAddress(v string) *ProjectBaseInfoVO {
	s.AssetProjectAddress = &v
	return s
}

func (s *ProjectBaseInfoVO) SetProjectName(v string) *ProjectBaseInfoVO {
	s.ProjectName = &v
	return s
}

func (s *ProjectBaseInfoVO) SetDescription(v string) *ProjectBaseInfoVO {
	s.Description = &v
	return s
}

func (s *ProjectBaseInfoVO) SetProjectStatus(v string) *ProjectBaseInfoVO {
	s.ProjectStatus = &v
	return s
}

func (s *ProjectBaseInfoVO) SetChainType(v string) *ProjectBaseInfoVO {
	s.ChainType = &v
	return s
}

func (s *ProjectBaseInfoVO) SetTokenName(v string) *ProjectBaseInfoVO {
	s.TokenName = &v
	return s
}

func (s *ProjectBaseInfoVO) SetTokenSymbol(v string) *ProjectBaseInfoVO {
	s.TokenSymbol = &v
	return s
}

func (s *ProjectBaseInfoVO) SetCapacity(v string) *ProjectBaseInfoVO {
	s.Capacity = &v
	return s
}

func (s *ProjectBaseInfoVO) SetMaxSubscriptionAmount(v string) *ProjectBaseInfoVO {
	s.MaxSubscriptionAmount = &v
	return s
}

func (s *ProjectBaseInfoVO) SetGmtCreated(v int64) *ProjectBaseInfoVO {
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

type HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
	E2eId *string `json:"e2e_id,omitempty" xml:"e2e_id,omitempty" require:"true"`
}

func (s HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) String() string {
	return tea.Prettify(s)
}

func (s HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) GoString() string {
	return s.String()
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetAuthToken(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.AuthToken = &v
	return s
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetProductInstanceId(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetE2eId(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.E2eId = &v
	return s
}

type HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) String() string {
	return tea.Prettify(s)
}

func (s HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) GoString() string {
	return s.String()
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetReqMsgId(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ReqMsgId = &v
	return s
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultCode(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultCode = &v
	return s
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultMsg(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultMsg = &v
	return s
}

func (s *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetData(v string) *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.Data = &v
	return s
}

type PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
	E2eId *string `json:"e2e_id,omitempty" xml:"e2e_id,omitempty" require:"true"`
	// 支付状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) String() string {
	return tea.Prettify(s)
}

func (s PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) GoString() string {
	return s.String()
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) SetAuthToken(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.AuthToken = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) SetProductInstanceId(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) SetE2eId(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.E2eId = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) SetStatus(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.Status = &v
	return s
}

type PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用成功
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) String() string {
	return tea.Prettify(s)
}

func (s PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) GoString() string {
	return s.String()
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) SetReqMsgId(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultCode(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultCode = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultMsg(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultMsg = &v
	return s
}

func (s *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse) SetData(v string) *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.Data = &v
	return s
}

type ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易。
	E2eId *string `json:"e2e_id,omitempty" xml:"e2e_id,omitempty" require:"true"`
}

func (s ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) String() string {
	return tea.Prettify(s)
}

func (s ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) GoString() string {
	return s.String()
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetAuthToken(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.AuthToken = &v
	return s
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetProductInstanceId(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) SetE2eId(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest {
	s.E2eId = &v
	return s
}

type ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) String() string {
	return tea.Prettify(s)
}

func (s ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) GoString() string {
	return s.String()
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetReqMsgId(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultCode(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultCode = &v
	return s
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetResultMsg(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse) SetData(v string) *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse {
	s.Data = &v
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
				"sdk_version":      tea.String("1.0.5"),
				"_prod_code":       tea.String("DTRWA"),
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
 * Description: 资产锁定
 * Summary: 资产锁定
 */
func (client *Client) HoldassetAntdigitalWebtrwatradeFundchannelTxn(request *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest) (_result *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.HoldassetAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资产锁定
 * Summary: 资产锁定
 */
func (client *Client) HoldassetAntdigitalWebtrwatradeFundchannelTxnEx(request *HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.fundchannel.txn.holdasset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知支付结果接口
 * Summary: 通知支付结果接口
 */
func (client *Client) PaymentnotificationAntdigitalWebtrwatradeFundchannelTxn(request *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest) (_result *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知支付结果接口
 * Summary: 通知支付结果接口
 */
func (client *Client) PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnEx(request *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.fundchannel.txn.paymentnotification"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 释放资产
 * Summary: 释放资产
 */
func (client *Client) ReleaseassetAntdigitalWebtrwatradeFundchannelTxn(request *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest) (_result *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.ReleaseassetAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 释放资产
 * Summary: 释放资产
 */
func (client *Client) ReleaseassetAntdigitalWebtrwatradeFundchannelTxnEx(request *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.fundchannel.txn.releaseasset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
