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

type UpdateAntdigitalWebtrwatradeIssuerPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目净值
	NetValue *string `json:"net_value,omitempty" xml:"net_value,omitempty" require:"true"`
	// 要修改的价格类型（必须与项目创建时设定的类型一致）
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty" require:"true"`
	// 修改说明或备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s UpdateAntdigitalWebtrwatradeIssuerPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntdigitalWebtrwatradeIssuerPriceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetAuthToken(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetProductInstanceId(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetProjectId(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.ProjectId = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetNetValue(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.NetValue = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetPriceType(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.PriceType = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) SetRemark(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceRequest {
	s.Remark = &v
	return s
}

type UpdateAntdigitalWebtrwatradeIssuerPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAntdigitalWebtrwatradeIssuerPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAntdigitalWebtrwatradeIssuerPriceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceResponse) SetReqMsgId(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceResponse) SetResultCode(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAntdigitalWebtrwatradeIssuerPriceResponse) SetResultMsg(v string) *UpdateAntdigitalWebtrwatradeIssuerPriceResponse {
	s.ResultMsg = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Data []*LoginOperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse) SetData(v []*LoginOperationLogVO) *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Data []*LoginOperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse) SetData(v []*LoginOperationLogVO) *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse {
	s.Data = v
	return s
}

type QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetAuthToken(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetProductInstanceId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetAssetProjectId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.AssetProjectId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetAssetProjectAddress(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetChainName(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.ChainName = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetUserId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.UserId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetUserAddress(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.UserAddress = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetLoginName(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.LoginName = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetLoginAccountType(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.LoginAccountType = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetStartTimeMills(v int64) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.StartTimeMills = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) SetEndTimeMills(v int64) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest {
	s.EndTimeMills = &v
	return s
}

type QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户明细列表
	Data []*SubUserAccountDetailVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) SetReqMsgId(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) SetResultCode(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) SetResultMsg(v string) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse) SetData(v []*SubUserAccountDetailVO) *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse {
	s.Data = v
	return s
}

type QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID（资产项目ID、资产项目合约地址+所在链  二选一必填）
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址（资产项目ID、资产项目合约地址+所在链  二选一必填）
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链（资产项目ID、资产项目合约地址+所在链  二选一必填）
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetAuthToken(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetProductInstanceId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetAssetProjectId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.AssetProjectId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetAssetProjectAddress(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetChainName(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.ChainName = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetUserId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.UserId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetUserAddress(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.UserAddress = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetLoginName(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.LoginName = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetLoginAccountType(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.LoginAccountType = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetStartTimeMills(v int64) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.StartTimeMills = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) SetEndTimeMills(v int64) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest {
	s.EndTimeMills = &v
	return s
}

type QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户明细列表
	Data []*SubUserAccountDetailVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) SetReqMsgId(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) SetResultCode(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) SetResultMsg(v string) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse) SetData(v []*SubUserAccountDetailVO) *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID - 资产项目ID & 资产项目合约地址+项目所在链 二选一
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目ID - 资产项目ID & 资产项目合约地址+项目所在链 二选一
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链 - 资产项目ID & 资产项目合约地址+项目所在链 二选一
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 本侧链用户地址 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 本侧链用户地址 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL) - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 对侧链用户地址
	TargetUserAddress *string `json:"target_user_address,omitempty" xml:"target_user_address,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.ChainName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetLoginName(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.LoginName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetTargetUserAddress(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.TargetUserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跨链账号明细
	Data []*CrossAccountListVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse) SetData(v []*CrossAccountListVO) *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID - 资产项目ID & 资产项目合约地址+项目所在链  二选一
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址 - 资产项目ID & 资产项目合约地址+项目所在链  二选一
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链 - 资产项目ID & 资产项目合约地址+项目所在链  二选一
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
	// 用户ID - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 本侧链用户地址 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 登录名类型(EMAIL) - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 对侧链用户地址
	TargetUserAddress *string `json:"target_user_address,omitempty" xml:"target_user_address,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty" require:"true"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty" require:"true"`
}

func (s ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.ChainName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetLoginName(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.LoginName = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetTargetUserAddress(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.TargetUserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跨链账号明细
	Data []*CrossAccountListVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse) SetData(v []*CrossAccountListVO) *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse {
	s.Data = v
	return s
}

type DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目id - 项目id和
	// 项目合约地址+所在链组合 二选一
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址，项目id和
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

type ListAntdigitalWebtrwatradeIssuerOperationlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作员用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty"`
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

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogRequest) SetLoginAccount(v string) *ListAntdigitalWebtrwatradeIssuerOperationlogRequest {
	s.LoginAccount = &v
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
	// 所有操作日志
	Data []*OperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
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

func (s *ListAntdigitalWebtrwatradeIssuerOperationlogResponse) SetData(v []*OperationLogVO) *ListAntdigitalWebtrwatradeIssuerOperationlogResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorOperationlogRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 操作员用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	UserAddress *string `json:"user_address,omitempty" xml:"user_address,omitempty"`
	// 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccountType *string `json:"login_account_type,omitempty" xml:"login_account_type,omitempty"`
	// 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty"`
	// 开始时间 (时间戳)
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty"`
	// 结束时间 (时间戳)
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty"`
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

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetUserId(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.UserId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetUserAddress(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.UserAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetLoginAccountType(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.LoginAccountType = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogRequest) SetLoginAccount(v string) *ListAntdigitalWebtrwatradeDistributorOperationlogRequest {
	s.LoginAccount = &v
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
	// 所有操作日志
	Data []*OperationLogVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
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

func (s *ListAntdigitalWebtrwatradeDistributorOperationlogResponse) SetData(v []*OperationLogVO) *ListAntdigitalWebtrwatradeDistributorOperationlogResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeIssuerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)（毫秒）
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty"`
	// 结束时间 (时间戳)（毫秒）
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty"`
}

func (s ListAntdigitalWebtrwatradeIssuerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerProjectRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerProjectRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeIssuerProjectRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目基础信息
	Data []*ProjectBaseInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerProjectResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerProjectResponse) SetData(v []*ProjectBaseInfoVO) *ListAntdigitalWebtrwatradeIssuerProjectResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间 (时间戳)（毫秒）
	StartTimeMills *int64 `json:"start_time_mills,omitempty" xml:"start_time_mills,omitempty"`
	// 结束时间 (时间戳)（毫秒）
	EndTimeMills *int64 `json:"end_time_mills,omitempty" xml:"end_time_mills,omitempty"`
}

func (s ListAntdigitalWebtrwatradeDistributorProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorProjectRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectRequest) SetStartTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorProjectRequest {
	s.StartTimeMills = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectRequest) SetEndTimeMills(v int64) *ListAntdigitalWebtrwatradeDistributorProjectRequest {
	s.EndTimeMills = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目基础信息
	Data []*ProjectBaseInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorProjectResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorProjectResponse) SetData(v []*ProjectBaseInfoVO) *ListAntdigitalWebtrwatradeDistributorProjectResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeIssuerSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
}

func (s ListAntdigitalWebtrwatradeIssuerSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerSubuserRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeIssuerSubuserRequest {
	s.ChainName = &v
	return s
}

type ListAntdigitalWebtrwatradeIssuerSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户基本信息
	Data []*SubUserAccountBaseVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeIssuerSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeIssuerSubuserResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeIssuerSubuserResponse) SetData(v []*SubUserAccountBaseVO) *ListAntdigitalWebtrwatradeIssuerSubuserResponse {
	s.Data = v
	return s
}

type ListAntdigitalWebtrwatradeDistributorSubuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectId *string `json:"asset_project_id,omitempty" xml:"asset_project_id,omitempty"`
	// 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
	AssetProjectAddress *string `json:"asset_project_address,omitempty" xml:"asset_project_address,omitempty"`
	// 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
	ChainName *string `json:"chain_name,omitempty" xml:"chain_name,omitempty"`
}

func (s ListAntdigitalWebtrwatradeDistributorSubuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorSubuserRequest) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserRequest) SetAuthToken(v string) *ListAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserRequest) SetProductInstanceId(v string) *ListAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserRequest) SetAssetProjectId(v string) *ListAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.AssetProjectId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserRequest) SetAssetProjectAddress(v string) *ListAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.AssetProjectAddress = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserRequest) SetChainName(v string) *ListAntdigitalWebtrwatradeDistributorSubuserRequest {
	s.ChainName = &v
	return s
}

type ListAntdigitalWebtrwatradeDistributorSubuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 二级用户基础信息
	Data []*SubUserAccountBaseVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s ListAntdigitalWebtrwatradeDistributorSubuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAntdigitalWebtrwatradeDistributorSubuserResponse) GoString() string {
	return s.String()
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserResponse) SetReqMsgId(v string) *ListAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserResponse) SetResultCode(v string) *ListAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserResponse) SetResultMsg(v string) *ListAntdigitalWebtrwatradeDistributorSubuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAntdigitalWebtrwatradeDistributorSubuserResponse) SetData(v []*SubUserAccountBaseVO) *ListAntdigitalWebtrwatradeDistributorSubuserResponse {
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
				"sdk_version":      tea.String("1.1.2"),
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
 * Description: 更新项目净值
 * Summary: 更新项目净值
 */
func (client *Client) UpdateAntdigitalWebtrwatradeIssuerPrice(request *UpdateAntdigitalWebtrwatradeIssuerPriceRequest) (_result *UpdateAntdigitalWebtrwatradeIssuerPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAntdigitalWebtrwatradeIssuerPriceResponse{}
	_body, _err := client.UpdateAntdigitalWebtrwatradeIssuerPriceEx(request, headers, runtime)
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
func (client *Client) UpdateAntdigitalWebtrwatradeIssuerPriceEx(request *UpdateAntdigitalWebtrwatradeIssuerPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAntdigitalWebtrwatradeIssuerPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAntdigitalWebtrwatradeIssuerPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.price.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeIssuerOperationloglogininfo(request *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest) (_result *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(request, headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(request *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.operationloglogininfo.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeDistributorOperationloglogininfo(request *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest) (_result *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(request, headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(request *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.operationloglogininfo.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发行机构获取二级用户详情数据
 * Summary: 发行机构获取二级用户详情数据
 */
func (client *Client) QueryAntdigitalWebtrwatradeIssuerSubuserdetail(request *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest) (_result *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse{}
	_body, _err := client.QueryAntdigitalWebtrwatradeIssuerSubuserdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发行机构获取二级用户详情数据
 * Summary: 发行机构获取二级用户详情数据
 */
func (client *Client) QueryAntdigitalWebtrwatradeIssuerSubuserdetailEx(request *QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subuserdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代销机构获取二级用户详情数据
 * Summary: 代销机构获取二级用户详情数据
 */
func (client *Client) QueryAntdigitalWebtrwatradeDistributorSubuserdetail(request *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest) (_result *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse{}
	_body, _err := client.QueryAntdigitalWebtrwatradeDistributorSubuserdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代销机构获取二级用户详情数据
 * Summary: 代销机构获取二级用户详情数据
 */
func (client *Client) QueryAntdigitalWebtrwatradeDistributorSubuserdetailEx(request *QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuserdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeIssuerCrosschainaccount(request *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest) (_result *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerCrosschainaccountEx(request, headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeIssuerCrosschainaccountEx(request *ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.crosschainaccount.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeDistributorCrosschainaccount(request *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest) (_result *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorCrosschainaccountEx(request, headers, runtime)
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
func (client *Client) ListAntdigitalWebtrwatradeDistributorCrosschainaccountEx(request *ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.crosschainaccount.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 发行机构查询所有操作员的操作日志
 * Summary: 发行机构查询所有操作员的操作日志
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
 * Description: 发行机构查询所有操作员的操作日志
 * Summary: 发行机构查询所有操作员的操作日志
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
 * Description: 代销机构查询所有操作员的操作日志
 * Summary: 代销机构查询所有操作员的操作日志
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
 * Description: 代销机构查询所有操作员的操作日志
 * Summary: 代销机构查询所有操作员的操作日志
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
 * Description: 查询发行机构下所有的项目
 * Summary: 查询发行机构下所有的项目
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerProject(request *ListAntdigitalWebtrwatradeIssuerProjectRequest) (_result *ListAntdigitalWebtrwatradeIssuerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerProjectResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询发行机构下所有的项目
 * Summary: 查询发行机构下所有的项目
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerProjectEx(request *ListAntdigitalWebtrwatradeIssuerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.project.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代销机构下所有的项目
 * Summary: 查询代销机构下所有的项目
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorProject(request *ListAntdigitalWebtrwatradeDistributorProjectRequest) (_result *ListAntdigitalWebtrwatradeDistributorProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorProjectResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代销机构下所有的项目
 * Summary: 查询代销机构下所有的项目
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorProjectEx(request *ListAntdigitalWebtrwatradeDistributorProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.project.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询发行机构和项目下所有关联的二级用户信息
 * Summary: 查询机构和项目下所有关联的二级用户信息
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerSubuser(request *ListAntdigitalWebtrwatradeIssuerSubuserRequest) (_result *ListAntdigitalWebtrwatradeIssuerSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeIssuerSubuserResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeIssuerSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询发行机构和项目下所有关联的二级用户信息
 * Summary: 查询机构和项目下所有关联的二级用户信息
 */
func (client *Client) ListAntdigitalWebtrwatradeIssuerSubuserEx(request *ListAntdigitalWebtrwatradeIssuerSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeIssuerSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeIssuerSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.issuer.subuser.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询代销机构和项目下所有关联的二级用户信息
 * Summary: 查询机构和项目下所有关联的二级用户信息
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorSubuser(request *ListAntdigitalWebtrwatradeDistributorSubuserRequest) (_result *ListAntdigitalWebtrwatradeDistributorSubuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAntdigitalWebtrwatradeDistributorSubuserResponse{}
	_body, _err := client.ListAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询代销机构和项目下所有关联的二级用户信息
 * Summary: 查询机构和项目下所有关联的二级用户信息
 */
func (client *Client) ListAntdigitalWebtrwatradeDistributorSubuserEx(request *ListAntdigitalWebtrwatradeDistributorSubuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAntdigitalWebtrwatradeDistributorSubuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAntdigitalWebtrwatradeDistributorSubuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtrwatrade.distributor.subuser.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
