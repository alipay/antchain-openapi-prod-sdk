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

// 登录类型
type LoginAccountTypeBO struct {
	// 登录类型
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
	// 交易类型
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
	// 交易类别
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

// 跨链账户信息
type CrossChainAccountsVO struct {
	// 对侧链用户地址
	CrossChainUserAddress *string `json:"cross_chain_user_address,omitempty" xml:"cross_chain_user_address,omitempty"`
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

func (s *CrossChainAccountsVO) SetCrossChainUserAddress(v string) *CrossChainAccountsVO {
	s.CrossChainUserAddress = &v
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
	// 价格类型
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

type QueryAntdigitalWebtrwatradeIssuerSubuserRequest struct {
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

func (s QueryAntdigitalWebtrwatradeIssuerSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserRequest) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) SetAuthToken(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) SetProductInstanceId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) SetUserId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.UserId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) SetProjectId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) SetInstitutionId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.InstitutionId = &v
	return s
}

type QueryAntdigitalWebtrwatradeIssuerSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户信息
	Data *SubUserAccountVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserResponse) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserResponse) SetReqMsgId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserResponse) SetResultCode(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserResponse) SetResultMsg(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserResponse) SetData(v *SubUserAccountVO) *QueryAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.Data = v
	return s
}

type QueryAntdigitalWebtrwatradeDistributorSubuserRequest struct {
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

func (s QueryAntdigitalWebtrwatradeDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) SetAuthToken(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) SetProductInstanceId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) SetUserId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.UserId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) SetInstitutionId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.InstitutionId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) SetProjectId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.ProjectId = &v
	return s
}

type QueryAntdigitalWebtrwatradeDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户信息
	Data *SubUserAccountVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserResponse) SetReqMsgId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserResponse) SetResultCode(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserResponse) SetResultMsg(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserResponse) SetData(v *SubUserAccountVO) *QueryAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeIssuerOperationlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeIssuerOperationlogRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerOperationlogRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerOperationlogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Data []*LoginOperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerOperationlogResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerOperationlogResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogResponse) SetData(v []*LoginOperationLogVO) *ListAntdigitalWebtrwatradeIssuerOperationlogResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorOperationlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeDistributorOperationlogRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorOperationlogRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorOperationlogResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Data []*LoginOperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorOperationlogResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorOperationlogResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogResponse) SetData(v []*LoginOperationLogVO) *ListAntdigitalWebtrwatradeDistributorOperationlogResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeIssuerCrossaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 本侧链用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL)
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 对侧链用户地址
	CrossChainUserAddress *string `json:"cross_chain_user_address,omitempty" xml:"cross_chain_user_address,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.ChainName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetLoginName(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.LoginName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetCrossChainUserAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.CrossChainUserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerCrossaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跨链账号明细
	Data []*CrossAccountListVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse) SetData(v []*CrossAccountListVO) *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorCrossaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 本侧链用户地址
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL)
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 对侧链用户地址
	CrossChainUserAddress *string `json:"cross_chain_user_address,omitempty" xml:"cross_chain_user_address,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.ChainName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetLoginName(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.LoginName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetCrossChainUserAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.CrossChainUserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorCrossaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跨链账号明细
	Data []*CrossAccountListVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse) SetData(v []*CrossAccountListVO) *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse {
	s.Data = v
	return s
}

type DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目id，项目资产ID和
	// 项目合约地址+所在链组合 二选一
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址，项目资产ID和
	// 项目合约地址+所在链组合 二选一
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 所在链，项目资产ID和
	// 项目合约地址+所在链组合 二选一
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
}

func (s DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) GoString() string {
	return s.String()
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) SetAuthToken(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) SetProductInstanceId(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) SetAssetProjectId(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest {
	s.AssetProjectId = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) SetAssetProjectAddress(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) SetChainName(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest {
	s.ChainName = &v
	return s
}

type DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目角色信息
	Data *ProjectWithRole `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) GoString() string {
	return s.String()
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) SetReqMsgId(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) SetResultCode(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) SetResultMsg(v string) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse) SetData(v *ProjectWithRole) *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse {
	s.Data = v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ak_d3c4f09125a14cd587057c405561809a"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 查询单个二级用户
 * Summary: 查询单个二级用户
 */
func (client *Client) QueryAntdigitalWebtrwatradeIssuerSubuser(request *QueryAntdigitalWebtrwatradeIssuerSubuserRequest) (_result *QueryAntdigitalWebtrwatradeIssuerSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntdigitalWebtrwatradeIssuerSubuserResponse{}
	_body, _err := client.QueryAntdigitalWebtrwatradeIssuerSubuserEx(request, headers, runtime)
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
func (client *Client) QueryAntdigitalWebtrwatradeIssuerSubuserEx(request *QueryAntdigitalWebtrwatradeIssuerSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntdigitalWebtrwatradeIssuerSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntdigitalWebtrwatradeIssuerSubuserResponse{}
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
func (client *Client) QueryAntdigitalWebtrwatradeDistributorSubuser(request *QueryAntdigitalWebtrwatradeDistributorSubuserRequest) (_result *QueryAntdigitalWebtrwatradeDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntdigitalWebtrwatradeDistributorSubuserResponse{}
	_body, _err := client.QueryAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime)
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
func (client *Client) QueryAntdigitalWebtrwatradeDistributorSubuserEx(request *QueryAntdigitalWebtrwatradeDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntdigitalWebtrwatradeDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntdigitalWebtrwatradeDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构查询登录登出操作日志
 * Summary: 发行机构查询登录登出操作日志
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerOperationlog(request *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) (_result *ListAntdigitalWebtrwatradeIssuerOperationlogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerOperationlogResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerOperationlogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构查询登录登出操作日志
 * Summary: 发行机构查询登录登出操作日志
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerOperationlogEx(request *ListAntdigitalWebtrwatradeIssuerOperationlogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerOperationlogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerOperationlogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.operationlog.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构查询登录登出操作日志
 * Summary: 代销机构查询登录登出操作日志
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorOperationlog(request *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) (_result *ListAntdigitalWebtrwatradeDistributorOperationlogResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorOperationlogResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorOperationlogEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构查询登录登出操作日志
 * Summary: 代销机构查询登录登出操作日志
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorOperationlogEx(request *ListAntdigitalWebtrwatradeDistributorOperationlogRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorOperationlogResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorOperationlogResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.operationlog.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构跨链账号明细
 * Summary: 发行机构跨链账号明细
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerCrossaccount(request *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest) (_result *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerCrossaccountResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerCrossaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构跨链账号明细
 * Summary: 发行机构跨链账号明细
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerCrossaccountEx(request *ListAntdigitalWebtrwatradeIssuerCrossaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerCrossaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerCrossaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.crossaccount.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构跨链账号明细
 * Summary: 代销机构跨链账号明细
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorCrossaccount(request *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest) (_result *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorCrossaccountResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorCrossaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构跨链账号明细
 * Summary: 代销机构跨链账号明细
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorCrossaccountEx(request *ListAntdigitalWebtrwatradeDistributorCrossaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorCrossaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorCrossaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.crossaccount.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构查询项目及角色信息
 * Summary: 发行机构查询项目及角色信息
 */
func (client *Client) DetailAntdigitalWebtrwatradeIssuerProjectwithrole(request *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest) (_result *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse{}
	_body, _err := client.DetailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构查询项目及角色信息
 * Summary: 发行机构查询项目及角色信息
 */
func (client *Client) DetailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request *DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.projectwithrole.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
