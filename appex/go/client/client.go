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

// NameValuePair
type NameValuePair struct {
	// 字段名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 字段值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// 访问权限过滤器
type AccessFilterDTO struct {
	// 过滤器名称
	FilterName *string `json:"filter_name,omitempty" xml:"filter_name,omitempty" require:"true"`
	// 要过滤的字段路径
	Path *string `json:"path,omitempty" xml:"path,omitempty" require:"true"`
	// 路径字段的取值范围
	Target []*string `json:"target,omitempty" xml:"target,omitempty" require:"true" type:"Repeated"`
}

func (s AccessFilterDTO) String() string {
	return tea.Prettify(s)
}

func (s AccessFilterDTO) GoString() string {
	return s.String()
}

func (s *AccessFilterDTO) SetFilterName(v string) *AccessFilterDTO {
	s.FilterName = &v
	return s
}

func (s *AccessFilterDTO) SetPath(v string) *AccessFilterDTO {
	s.Path = &v
	return s
}

func (s *AccessFilterDTO) SetTarget(v []*string) *AccessFilterDTO {
	s.Target = v
	return s
}

// 数据状态驱动
type StatusDrive struct {
	// 起始状态
	FromStatus *string `json:"from_status,omitempty" xml:"from_status,omitempty" require:"true"`
	// 下一状态
	ToStatus *string `json:"to_status,omitempty" xml:"to_status,omitempty" require:"true"`
	// 驱动上链记录哈希
	DriveHash *string `json:"drive_hash,omitempty" xml:"drive_hash,omitempty" require:"true"`
	// 链上时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s StatusDrive) String() string {
	return tea.Prettify(s)
}

func (s StatusDrive) GoString() string {
	return s.String()
}

func (s *StatusDrive) SetFromStatus(v string) *StatusDrive {
	s.FromStatus = &v
	return s
}

func (s *StatusDrive) SetToStatus(v string) *StatusDrive {
	s.ToStatus = &v
	return s
}

func (s *StatusDrive) SetDriveHash(v string) *StatusDrive {
	s.DriveHash = &v
	return s
}

func (s *StatusDrive) SetTimestamp(v int64) *StatusDrive {
	s.Timestamp = &v
	return s
}

// 表单链下链上锚定索引
type FormIndexDTO struct {
	// 业务表单ID
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 业务表单类型
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
	// 块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty" require:"true"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易时间戳
	TxTimestamp *string `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty" require:"true"`
}

func (s FormIndexDTO) String() string {
	return tea.Prettify(s)
}

func (s FormIndexDTO) GoString() string {
	return s.String()
}

func (s *FormIndexDTO) SetFormId(v string) *FormIndexDTO {
	s.FormId = &v
	return s
}

func (s *FormIndexDTO) SetFormType(v string) *FormIndexDTO {
	s.FormType = &v
	return s
}

func (s *FormIndexDTO) SetBlockHeight(v int64) *FormIndexDTO {
	s.BlockHeight = &v
	return s
}

func (s *FormIndexDTO) SetTxHash(v string) *FormIndexDTO {
	s.TxHash = &v
	return s
}

func (s *FormIndexDTO) SetTxTimestamp(v string) *FormIndexDTO {
	s.TxTimestamp = &v
	return s
}

// 授权信息
type Authorization struct {
	// 授权内容的类型
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 要获取的授权字段
	Fields []*string `json:"fields,omitempty" xml:"fields,omitempty" require:"true" type:"Repeated"`
	// 签名时间戳
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s Authorization) String() string {
	return tea.Prettify(s)
}

func (s Authorization) GoString() string {
	return s.String()
}

func (s *Authorization) SetAuthType(v string) *Authorization {
	s.AuthType = &v
	return s
}

func (s *Authorization) SetFields(v []*string) *Authorization {
	s.Fields = v
	return s
}

func (s *Authorization) SetTimestamp(v int64) *Authorization {
	s.Timestamp = &v
	return s
}

// 用户可访问Channel信息
type UserChannelDTO struct {
	// 通道名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 通道是否公开可访问
	PublicAcl *bool `json:"public_acl,omitempty" xml:"public_acl,omitempty" require:"true"`
	// 创建通道的用户did
	CreatorDid *string `json:"creator_did,omitempty" xml:"creator_did,omitempty" require:"true"`
	// 权限到期时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s UserChannelDTO) String() string {
	return tea.Prettify(s)
}

func (s UserChannelDTO) GoString() string {
	return s.String()
}

func (s *UserChannelDTO) SetChannelName(v string) *UserChannelDTO {
	s.ChannelName = &v
	return s
}

func (s *UserChannelDTO) SetPublicAcl(v bool) *UserChannelDTO {
	s.PublicAcl = &v
	return s
}

func (s *UserChannelDTO) SetCreatorDid(v string) *UserChannelDTO {
	s.CreatorDid = &v
	return s
}

func (s *UserChannelDTO) SetValidTime(v string) *UserChannelDTO {
	s.ValidTime = &v
	return s
}

// 用于MyPocket返回链上账户
type AccountEntry struct {
	// mychain的账户名字
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// account_name的hash的hex string
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
}

func (s AccountEntry) String() string {
	return tea.Prettify(s)
}

func (s AccountEntry) GoString() string {
	return s.String()
}

func (s *AccountEntry) SetAccountName(v string) *AccountEntry {
	s.AccountName = &v
	return s
}

func (s *AccountEntry) SetAccountId(v string) *AccountEntry {
	s.AccountId = &v
	return s
}

// 结果返回过滤
type ResultFilterDTO struct {
	// 过滤器名称
	FilterName *string `json:"filter_name,omitempty" xml:"filter_name,omitempty" require:"true"`
	// 要返回的字段路径列表
	PathList []*string `json:"path_list,omitempty" xml:"path_list,omitempty" require:"true" type:"Repeated"`
}

func (s ResultFilterDTO) String() string {
	return tea.Prettify(s)
}

func (s ResultFilterDTO) GoString() string {
	return s.String()
}

func (s *ResultFilterDTO) SetFilterName(v string) *ResultFilterDTO {
	s.FilterName = &v
	return s
}

func (s *ResultFilterDTO) SetPathList(v []*string) *ResultFilterDTO {
	s.PathList = v
	return s
}

// 数据通道Channel
type ChannelDTO struct {
	// 通道名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 通道是否公开访问
	PublicAcl *bool `json:"public_acl,omitempty" xml:"public_acl,omitempty" require:"true"`
	// 通道创建账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
}

func (s ChannelDTO) String() string {
	return tea.Prettify(s)
}

func (s ChannelDTO) GoString() string {
	return s.String()
}

func (s *ChannelDTO) SetChannelName(v string) *ChannelDTO {
	s.ChannelName = &v
	return s
}

func (s *ChannelDTO) SetPublicAcl(v bool) *ChannelDTO {
	s.PublicAcl = &v
	return s
}

func (s *ChannelDTO) SetUserDid(v string) *ChannelDTO {
	s.UserDid = &v
	return s
}

// 数据归属权
type DataTransferObject struct {
	// 发起方
	From *string `json:"from,omitempty" xml:"from,omitempty" require:"true"`
	// 转交方
	To *string `json:"to,omitempty" xml:"to,omitempty" require:"true"`
	// 流转备注
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty" require:"true"`
	// 链上流转记录
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 链上时间戳
	//
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s DataTransferObject) String() string {
	return tea.Prettify(s)
}

func (s DataTransferObject) GoString() string {
	return s.String()
}

func (s *DataTransferObject) SetFrom(v string) *DataTransferObject {
	s.From = &v
	return s
}

func (s *DataTransferObject) SetTo(v string) *DataTransferObject {
	s.To = &v
	return s
}

func (s *DataTransferObject) SetFormBody(v string) *DataTransferObject {
	s.FormBody = &v
	return s
}

func (s *DataTransferObject) SetTxHash(v string) *DataTransferObject {
	s.TxHash = &v
	return s
}

func (s *DataTransferObject) SetTimestamp(v int64) *DataTransferObject {
	s.Timestamp = &v
	return s
}

// 存证记录
type NotaryRecord struct {
	// 存证记录
	Attributes []*NameValuePair `json:"attributes,omitempty" xml:"attributes,omitempty" require:"true" type:"Repeated"`
	// 二维码链接
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty" require:"true"`
}

func (s NotaryRecord) String() string {
	return tea.Prettify(s)
}

func (s NotaryRecord) GoString() string {
	return s.String()
}

func (s *NotaryRecord) SetAttributes(v []*NameValuePair) *NotaryRecord {
	s.Attributes = v
	return s
}

func (s *NotaryRecord) SetQrCodeUrl(v string) *NotaryRecord {
	s.QrCodeUrl = &v
	return s
}

// 自定义流程入参DTO
type FlowTemplate struct {
	// 业务单据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 起始状态
	FromStatus *string `json:"from_status,omitempty" xml:"from_status,omitempty" require:"true"`
	// 目标状态
	ToStatus *string `json:"to_status,omitempty" xml:"to_status,omitempty" require:"true"`
	// 是否为状态流起始节点
	StartNode *bool `json:"start_node,omitempty" xml:"start_node,omitempty" require:"true"`
}

func (s FlowTemplate) String() string {
	return tea.Prettify(s)
}

func (s FlowTemplate) GoString() string {
	return s.String()
}

func (s *FlowTemplate) SetType(v string) *FlowTemplate {
	s.Type = &v
	return s
}

func (s *FlowTemplate) SetFromStatus(v string) *FlowTemplate {
	s.FromStatus = &v
	return s
}

func (s *FlowTemplate) SetToStatus(v string) *FlowTemplate {
	s.ToStatus = &v
	return s
}

func (s *FlowTemplate) SetStartNode(v bool) *FlowTemplate {
	s.StartNode = &v
	return s
}

// 链账户
type ChainAccountEX struct {
	// 账户名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// 账户地址
	AccountAddress *string `json:"account_address,omitempty" xml:"account_address,omitempty" require:"true"`
	// 账户类型，枚举，MYCHAIN|ETH
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty" require:"true"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
}

func (s ChainAccountEX) String() string {
	return tea.Prettify(s)
}

func (s ChainAccountEX) GoString() string {
	return s.String()
}

func (s *ChainAccountEX) SetAccountName(v string) *ChainAccountEX {
	s.AccountName = &v
	return s
}

func (s *ChainAccountEX) SetAccountAddress(v string) *ChainAccountEX {
	s.AccountAddress = &v
	return s
}

func (s *ChainAccountEX) SetAccountType(v string) *ChainAccountEX {
	s.AccountType = &v
	return s
}

func (s *ChainAccountEX) SetChainId(v string) *ChainAccountEX {
	s.ChainId = &v
	return s
}

type CreateMypocketChainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户的MyPocket账户对应的DID
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 区块链在MyPocket中的唯一ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
}

func (s CreateMypocketChainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketChainaccountRequest) GoString() string {
	return s.String()
}

func (s *CreateMypocketChainaccountRequest) SetAuthToken(v string) *CreateMypocketChainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMypocketChainaccountRequest) SetProductInstanceId(v string) *CreateMypocketChainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMypocketChainaccountRequest) SetDid(v string) *CreateMypocketChainaccountRequest {
	s.Did = &v
	return s
}

func (s *CreateMypocketChainaccountRequest) SetChainId(v string) *CreateMypocketChainaccountRequest {
	s.ChainId = &v
	return s
}

type CreateMypocketChainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// mychain账户名字
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// account_name hash的hex字符串
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s CreateMypocketChainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketChainaccountResponse) GoString() string {
	return s.String()
}

func (s *CreateMypocketChainaccountResponse) SetReqMsgId(v string) *CreateMypocketChainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMypocketChainaccountResponse) SetResultCode(v string) *CreateMypocketChainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMypocketChainaccountResponse) SetResultMsg(v string) *CreateMypocketChainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMypocketChainaccountResponse) SetAccountName(v string) *CreateMypocketChainaccountResponse {
	s.AccountName = &v
	return s
}

func (s *CreateMypocketChainaccountResponse) SetAccountId(v string) *CreateMypocketChainaccountResponse {
	s.AccountId = &v
	return s
}

type QueryMypocketChainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要查询的链账户绑定的DID
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 要查询的区块链账户所在的链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
}

func (s QueryMypocketChainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketChainaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryMypocketChainaccountRequest) SetAuthToken(v string) *QueryMypocketChainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMypocketChainaccountRequest) SetProductInstanceId(v string) *QueryMypocketChainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMypocketChainaccountRequest) SetDid(v string) *QueryMypocketChainaccountRequest {
	s.Did = &v
	return s
}

func (s *QueryMypocketChainaccountRequest) SetChainId(v string) *QueryMypocketChainaccountRequest {
	s.ChainId = &v
	return s
}

type QueryMypocketChainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 包含链账户的name和id
	ChainAccounts []*AccountEntry `json:"chain_accounts,omitempty" xml:"chain_accounts,omitempty" type:"Repeated"`
}

func (s QueryMypocketChainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketChainaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryMypocketChainaccountResponse) SetReqMsgId(v string) *QueryMypocketChainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMypocketChainaccountResponse) SetResultCode(v string) *QueryMypocketChainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMypocketChainaccountResponse) SetResultMsg(v string) *QueryMypocketChainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMypocketChainaccountResponse) SetChainAccounts(v []*AccountEntry) *QueryMypocketChainaccountResponse {
	s.ChainAccounts = v
	return s
}

type CreateMypocketDidaccountbyalipayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝Uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
}

func (s CreateMypocketDidaccountbyalipayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketDidaccountbyalipayRequest) GoString() string {
	return s.String()
}

func (s *CreateMypocketDidaccountbyalipayRequest) SetAuthToken(v string) *CreateMypocketDidaccountbyalipayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMypocketDidaccountbyalipayRequest) SetProductInstanceId(v string) *CreateMypocketDidaccountbyalipayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMypocketDidaccountbyalipayRequest) SetAlipayUid(v string) *CreateMypocketDidaccountbyalipayRequest {
	s.AlipayUid = &v
	return s
}

type CreateMypocketDidaccountbyalipayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户的DID
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateMypocketDidaccountbyalipayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketDidaccountbyalipayResponse) GoString() string {
	return s.String()
}

func (s *CreateMypocketDidaccountbyalipayResponse) SetReqMsgId(v string) *CreateMypocketDidaccountbyalipayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMypocketDidaccountbyalipayResponse) SetResultCode(v string) *CreateMypocketDidaccountbyalipayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMypocketDidaccountbyalipayResponse) SetResultMsg(v string) *CreateMypocketDidaccountbyalipayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMypocketDidaccountbyalipayResponse) SetDid(v string) *CreateMypocketDidaccountbyalipayResponse {
	s.Did = &v
	return s
}

type QueryMypocketDidaccountbyalipayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝Uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
}

func (s QueryMypocketDidaccountbyalipayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketDidaccountbyalipayRequest) GoString() string {
	return s.String()
}

func (s *QueryMypocketDidaccountbyalipayRequest) SetAuthToken(v string) *QueryMypocketDidaccountbyalipayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMypocketDidaccountbyalipayRequest) SetProductInstanceId(v string) *QueryMypocketDidaccountbyalipayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMypocketDidaccountbyalipayRequest) SetAlipayUid(v string) *QueryMypocketDidaccountbyalipayRequest {
	s.AlipayUid = &v
	return s
}

type QueryMypocketDidaccountbyalipayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部DApp应用通过支付宝UID查询普通用户did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s QueryMypocketDidaccountbyalipayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketDidaccountbyalipayResponse) GoString() string {
	return s.String()
}

func (s *QueryMypocketDidaccountbyalipayResponse) SetReqMsgId(v string) *QueryMypocketDidaccountbyalipayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMypocketDidaccountbyalipayResponse) SetResultCode(v string) *QueryMypocketDidaccountbyalipayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMypocketDidaccountbyalipayResponse) SetResultMsg(v string) *QueryMypocketDidaccountbyalipayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMypocketDidaccountbyalipayResponse) SetDid(v string) *QueryMypocketDidaccountbyalipayResponse {
	s.Did = &v
	return s
}

type CreateMypocketEscrowchainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
}

func (s CreateMypocketEscrowchainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketEscrowchainaccountRequest) GoString() string {
	return s.String()
}

func (s *CreateMypocketEscrowchainaccountRequest) SetAuthToken(v string) *CreateMypocketEscrowchainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountRequest) SetProductInstanceId(v string) *CreateMypocketEscrowchainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountRequest) SetDid(v string) *CreateMypocketEscrowchainaccountRequest {
	s.Did = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountRequest) SetChainId(v string) *CreateMypocketEscrowchainaccountRequest {
	s.ChainId = &v
	return s
}

type CreateMypocketEscrowchainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// 链上id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s CreateMypocketEscrowchainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketEscrowchainaccountResponse) GoString() string {
	return s.String()
}

func (s *CreateMypocketEscrowchainaccountResponse) SetReqMsgId(v string) *CreateMypocketEscrowchainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountResponse) SetResultCode(v string) *CreateMypocketEscrowchainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountResponse) SetResultMsg(v string) *CreateMypocketEscrowchainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountResponse) SetAccountName(v string) *CreateMypocketEscrowchainaccountResponse {
	s.AccountName = &v
	return s
}

func (s *CreateMypocketEscrowchainaccountResponse) SetAccountId(v string) *CreateMypocketEscrowchainaccountResponse {
	s.AccountId = &v
	return s
}

type QueryMypocketEscrowchainaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
}

func (s QueryMypocketEscrowchainaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketEscrowchainaccountRequest) GoString() string {
	return s.String()
}

func (s *QueryMypocketEscrowchainaccountRequest) SetAuthToken(v string) *QueryMypocketEscrowchainaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountRequest) SetProductInstanceId(v string) *QueryMypocketEscrowchainaccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountRequest) SetDid(v string) *QueryMypocketEscrowchainaccountRequest {
	s.Did = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountRequest) SetChainId(v string) *QueryMypocketEscrowchainaccountRequest {
	s.ChainId = &v
	return s
}

type QueryMypocketEscrowchainaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// DID对应的所有链上账户
	ChainAccounts []*AccountEntry `json:"chain_accounts,omitempty" xml:"chain_accounts,omitempty" type:"Repeated"`
}

func (s QueryMypocketEscrowchainaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketEscrowchainaccountResponse) GoString() string {
	return s.String()
}

func (s *QueryMypocketEscrowchainaccountResponse) SetReqMsgId(v string) *QueryMypocketEscrowchainaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountResponse) SetResultCode(v string) *QueryMypocketEscrowchainaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountResponse) SetResultMsg(v string) *QueryMypocketEscrowchainaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMypocketEscrowchainaccountResponse) SetChainAccounts(v []*AccountEntry) *QueryMypocketEscrowchainaccountResponse {
	s.ChainAccounts = v
	return s
}

type StartMypocketAppdidsignverifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签名
	DidSign *string `json:"did_sign,omitempty" xml:"did_sign,omitempty" require:"true"`
	// 签名原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// 分配的dapp id，uuid v4格式
	DappId *string `json:"dapp_id,omitempty" xml:"dapp_id,omitempty" require:"true"`
	// epoch时间，毫秒
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s StartMypocketAppdidsignverifyRequest) String() string {
	return tea.Prettify(s)
}

func (s StartMypocketAppdidsignverifyRequest) GoString() string {
	return s.String()
}

func (s *StartMypocketAppdidsignverifyRequest) SetAuthToken(v string) *StartMypocketAppdidsignverifyRequest {
	s.AuthToken = &v
	return s
}

func (s *StartMypocketAppdidsignverifyRequest) SetProductInstanceId(v string) *StartMypocketAppdidsignverifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartMypocketAppdidsignverifyRequest) SetDidSign(v string) *StartMypocketAppdidsignverifyRequest {
	s.DidSign = &v
	return s
}

func (s *StartMypocketAppdidsignverifyRequest) SetPayload(v string) *StartMypocketAppdidsignverifyRequest {
	s.Payload = &v
	return s
}

func (s *StartMypocketAppdidsignverifyRequest) SetDappId(v string) *StartMypocketAppdidsignverifyRequest {
	s.DappId = &v
	return s
}

func (s *StartMypocketAppdidsignverifyRequest) SetTimestamp(v int64) *StartMypocketAppdidsignverifyRequest {
	s.Timestamp = &v
	return s
}

type StartMypocketAppdidsignverifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签名是否合法
	IsValid *bool `json:"is_valid,omitempty" xml:"is_valid,omitempty"`
}

func (s StartMypocketAppdidsignverifyResponse) String() string {
	return tea.Prettify(s)
}

func (s StartMypocketAppdidsignverifyResponse) GoString() string {
	return s.String()
}

func (s *StartMypocketAppdidsignverifyResponse) SetReqMsgId(v string) *StartMypocketAppdidsignverifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartMypocketAppdidsignverifyResponse) SetResultCode(v string) *StartMypocketAppdidsignverifyResponse {
	s.ResultCode = &v
	return s
}

func (s *StartMypocketAppdidsignverifyResponse) SetResultMsg(v string) *StartMypocketAppdidsignverifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartMypocketAppdidsignverifyResponse) SetIsValid(v bool) *StartMypocketAppdidsignverifyResponse {
	s.IsValid = &v
	return s
}

type StartMypocketUserdidsignverifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签名
	DidSign *string `json:"did_sign,omitempty" xml:"did_sign,omitempty" require:"true"`
	// 签名原文
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
	// mychain did信息
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// epoch时间，毫秒
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s StartMypocketUserdidsignverifyRequest) String() string {
	return tea.Prettify(s)
}

func (s StartMypocketUserdidsignverifyRequest) GoString() string {
	return s.String()
}

func (s *StartMypocketUserdidsignverifyRequest) SetAuthToken(v string) *StartMypocketUserdidsignverifyRequest {
	s.AuthToken = &v
	return s
}

func (s *StartMypocketUserdidsignverifyRequest) SetProductInstanceId(v string) *StartMypocketUserdidsignverifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartMypocketUserdidsignverifyRequest) SetDidSign(v string) *StartMypocketUserdidsignverifyRequest {
	s.DidSign = &v
	return s
}

func (s *StartMypocketUserdidsignverifyRequest) SetPayload(v string) *StartMypocketUserdidsignverifyRequest {
	s.Payload = &v
	return s
}

func (s *StartMypocketUserdidsignverifyRequest) SetUserDid(v string) *StartMypocketUserdidsignverifyRequest {
	s.UserDid = &v
	return s
}

func (s *StartMypocketUserdidsignverifyRequest) SetTimestamp(v int64) *StartMypocketUserdidsignverifyRequest {
	s.Timestamp = &v
	return s
}

type StartMypocketUserdidsignverifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	// 签名是否合法
	IsValid *bool `json:"is_valid,omitempty" xml:"is_valid,omitempty"`
}

func (s StartMypocketUserdidsignverifyResponse) String() string {
	return tea.Prettify(s)
}

func (s StartMypocketUserdidsignverifyResponse) GoString() string {
	return s.String()
}

func (s *StartMypocketUserdidsignverifyResponse) SetReqMsgId(v string) *StartMypocketUserdidsignverifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartMypocketUserdidsignverifyResponse) SetResultCode(v string) *StartMypocketUserdidsignverifyResponse {
	s.ResultCode = &v
	return s
}

func (s *StartMypocketUserdidsignverifyResponse) SetResultMsg(v string) *StartMypocketUserdidsignverifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartMypocketUserdidsignverifyResponse) SetIsValid(v bool) *StartMypocketUserdidsignverifyResponse {
	s.IsValid = &v
	return s
}

type QueryMypocketUserinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
}

func (s QueryMypocketUserinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketUserinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryMypocketUserinfoRequest) SetAuthToken(v string) *QueryMypocketUserinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMypocketUserinfoRequest) SetProductInstanceId(v string) *QueryMypocketUserinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMypocketUserinfoRequest) SetAlipayUid(v string) *QueryMypocketUserinfoRequest {
	s.AlipayUid = &v
	return s
}

type QueryMypocketUserinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 头像链接
	Avatar *string `json:"avatar,omitempty" xml:"avatar,omitempty"`
}

func (s QueryMypocketUserinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketUserinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryMypocketUserinfoResponse) SetReqMsgId(v string) *QueryMypocketUserinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMypocketUserinfoResponse) SetResultCode(v string) *QueryMypocketUserinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMypocketUserinfoResponse) SetResultMsg(v string) *QueryMypocketUserinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMypocketUserinfoResponse) SetNickName(v string) *QueryMypocketUserinfoResponse {
	s.NickName = &v
	return s
}

func (s *QueryMypocketUserinfoResponse) SetAvatar(v string) *QueryMypocketUserinfoResponse {
	s.Avatar = &v
	return s
}

type QueryMypocketUserauthinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户授权信息
	Authorization *Authorization `json:"authorization,omitempty" xml:"authorization,omitempty" require:"true"`
	// 签名字符串
	DidSign *string `json:"did_sign,omitempty" xml:"did_sign,omitempty" require:"true"`
	// 签名的用户did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
}

func (s QueryMypocketUserauthinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketUserauthinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryMypocketUserauthinfoRequest) SetAuthToken(v string) *QueryMypocketUserauthinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMypocketUserauthinfoRequest) SetProductInstanceId(v string) *QueryMypocketUserauthinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMypocketUserauthinfoRequest) SetAuthorization(v *Authorization) *QueryMypocketUserauthinfoRequest {
	s.Authorization = v
	return s
}

func (s *QueryMypocketUserauthinfoRequest) SetDidSign(v string) *QueryMypocketUserauthinfoRequest {
	s.DidSign = &v
	return s
}

func (s *QueryMypocketUserauthinfoRequest) SetDid(v string) *QueryMypocketUserauthinfoRequest {
	s.Did = &v
	return s
}

type QueryMypocketUserauthinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权信息详情
	AuthorizationInfo []*NameValuePair `json:"authorization_info,omitempty" xml:"authorization_info,omitempty" type:"Repeated"`
}

func (s QueryMypocketUserauthinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMypocketUserauthinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryMypocketUserauthinfoResponse) SetReqMsgId(v string) *QueryMypocketUserauthinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMypocketUserauthinfoResponse) SetResultCode(v string) *QueryMypocketUserauthinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMypocketUserauthinfoResponse) SetResultMsg(v string) *QueryMypocketUserauthinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMypocketUserauthinfoResponse) SetAuthorizationInfo(v []*NameValuePair) *QueryMypocketUserauthinfoResponse {
	s.AuthorizationInfo = v
	return s
}

type CreateMypocketQrcoderequestaccountsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true" maxLength:"64"`
	// 应用唯一标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" maxLength:"64"`
	// 账户类型，枚举值，  MYCHAIN|ETH
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty"`
	// 小程序码颜色，枚举，  ALIPAY_BLUE|BLACK|WHITE
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// 小程序码大小，枚举，SMALL|MEDIUM|LARGE
	Size *string `json:"size,omitempty" xml:"size,omitempty"`
}

func (s CreateMypocketQrcoderequestaccountsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketQrcoderequestaccountsRequest) GoString() string {
	return s.String()
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetAuthToken(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetProductInstanceId(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetOutBizNo(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.OutBizNo = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetAppId(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.AppId = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetChainId(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.ChainId = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetAccountType(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.AccountType = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetColor(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.Color = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsRequest) SetSize(v string) *CreateMypocketQrcoderequestaccountsRequest {
	s.Size = &v
	return s
}

type CreateMypocketQrcoderequestaccountsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务号，小程序码唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 外部业务号，透传返回
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 小程序码地址
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty"`
}

func (s CreateMypocketQrcoderequestaccountsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMypocketQrcoderequestaccountsResponse) GoString() string {
	return s.String()
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetReqMsgId(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetResultCode(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetResultMsg(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetBizNo(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.BizNo = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetOutBizNo(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.OutBizNo = &v
	return s
}

func (s *CreateMypocketQrcoderequestaccountsResponse) SetQrCodeUrl(v string) *CreateMypocketQrcoderequestaccountsResponse {
	s.QrCodeUrl = &v
	return s
}

type CheckMypocketQrcoderequestaccountsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小程序码唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 外部业务号，仅透传，不校验
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
}

func (s CheckMypocketQrcoderequestaccountsRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckMypocketQrcoderequestaccountsRequest) GoString() string {
	return s.String()
}

func (s *CheckMypocketQrcoderequestaccountsRequest) SetAuthToken(v string) *CheckMypocketQrcoderequestaccountsRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsRequest) SetProductInstanceId(v string) *CheckMypocketQrcoderequestaccountsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsRequest) SetBizNo(v string) *CheckMypocketQrcoderequestaccountsRequest {
	s.BizNo = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsRequest) SetOutBizNo(v string) *CheckMypocketQrcoderequestaccountsRequest {
	s.OutBizNo = &v
	return s
}

type CheckMypocketQrcoderequestaccountsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 小程序码唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 外部业务号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty"`
	// 小程序码状态，枚举，IDLE|SCANNED|CONFIRMED|CANCELLED|UNKNOWN
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 账户列表
	Accounts []*ChainAccountEX `json:"accounts,omitempty" xml:"accounts,omitempty" type:"Repeated"`
}

func (s CheckMypocketQrcoderequestaccountsResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckMypocketQrcoderequestaccountsResponse) GoString() string {
	return s.String()
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetReqMsgId(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetResultCode(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetResultMsg(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetBizNo(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.BizNo = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetOutBizNo(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.OutBizNo = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetStatus(v string) *CheckMypocketQrcoderequestaccountsResponse {
	s.Status = &v
	return s
}

func (s *CheckMypocketQrcoderequestaccountsResponse) SetAccounts(v []*ChainAccountEX) *CheckMypocketQrcoderequestaccountsResponse {
	s.Accounts = v
	return s
}

type CreateUserDidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟标识（联盟ID）
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 参与方的业务类型，如仓库WMS, 电商平台PSP，银行BANK
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s CreateUserDidRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserDidRequest) GoString() string {
	return s.String()
}

func (s *CreateUserDidRequest) SetAuthToken(v string) *CreateUserDidRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserDidRequest) SetProductInstanceId(v string) *CreateUserDidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserDidRequest) SetUnionId(v int64) *CreateUserDidRequest {
	s.UnionId = &v
	return s
}

func (s *CreateUserDidRequest) SetType(v string) *CreateUserDidRequest {
	s.Type = &v
	return s
}

type CreateUserDidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户创建的账户身份DID，用于向区块链上发交易
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty"`
}

func (s CreateUserDidResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserDidResponse) GoString() string {
	return s.String()
}

func (s *CreateUserDidResponse) SetReqMsgId(v string) *CreateUserDidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserDidResponse) SetResultCode(v string) *CreateUserDidResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserDidResponse) SetResultMsg(v string) *CreateUserDidResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUserDidResponse) SetUserDid(v string) *CreateUserDidResponse {
	s.UserDid = &v
	return s
}

type CreateUnionApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 协作联盟名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联盟描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
}

func (s CreateUnionApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionApplyRequest) GoString() string {
	return s.String()
}

func (s *CreateUnionApplyRequest) SetAuthToken(v string) *CreateUnionApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUnionApplyRequest) SetProductInstanceId(v string) *CreateUnionApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUnionApplyRequest) SetName(v string) *CreateUnionApplyRequest {
	s.Name = &v
	return s
}

func (s *CreateUnionApplyRequest) SetDescription(v string) *CreateUnionApplyRequest {
	s.Description = &v
	return s
}

type CreateUnionApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateUnionApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionApplyResponse) GoString() string {
	return s.String()
}

func (s *CreateUnionApplyResponse) SetReqMsgId(v string) *CreateUnionApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUnionApplyResponse) SetResultCode(v string) *CreateUnionApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUnionApplyResponse) SetResultMsg(v string) *CreateUnionApplyResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmUnionApplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审核是否通过，SUCCESS,FAILURE,FREEZE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 联盟id
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 区块链ID，status为SUCCESS时需要传入
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// COMMON:普通链
	// TEE：TEE链
	// status为SUCCESS时需要填充
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty"`
	// TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty"`
	// 合约版本，TEE场景下需要传入
	ContractVersion *string `json:"contract_version,omitempty" xml:"contract_version,omitempty"`
}

func (s ConfirmUnionApplyRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmUnionApplyRequest) GoString() string {
	return s.String()
}

func (s *ConfirmUnionApplyRequest) SetAuthToken(v string) *ConfirmUnionApplyRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetProductInstanceId(v string) *ConfirmUnionApplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetStatus(v string) *ConfirmUnionApplyRequest {
	s.Status = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetUnionId(v int64) *ConfirmUnionApplyRequest {
	s.UnionId = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetChainId(v string) *ConfirmUnionApplyRequest {
	s.ChainId = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetChainType(v string) *ConfirmUnionApplyRequest {
	s.ChainType = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetContractName(v string) *ConfirmUnionApplyRequest {
	s.ContractName = &v
	return s
}

func (s *ConfirmUnionApplyRequest) SetContractVersion(v string) *ConfirmUnionApplyRequest {
	s.ContractVersion = &v
	return s
}

type ConfirmUnionApplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmUnionApplyResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmUnionApplyResponse) GoString() string {
	return s.String()
}

func (s *ConfirmUnionApplyResponse) SetReqMsgId(v string) *ConfirmUnionApplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmUnionApplyResponse) SetResultCode(v string) *ConfirmUnionApplyResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmUnionApplyResponse) SetResultMsg(v string) *ConfirmUnionApplyResponse {
	s.ResultMsg = &v
	return s
}

type CreateUnionChannelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 通信通道的名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 发起创建channel的用户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
	PublicAcl *bool `json:"public_acl,omitempty" xml:"public_acl,omitempty" require:"true"`
}

func (s CreateUnionChannelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionChannelRequest) GoString() string {
	return s.String()
}

func (s *CreateUnionChannelRequest) SetAuthToken(v string) *CreateUnionChannelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUnionChannelRequest) SetProductInstanceId(v string) *CreateUnionChannelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUnionChannelRequest) SetUnionId(v int64) *CreateUnionChannelRequest {
	s.UnionId = &v
	return s
}

func (s *CreateUnionChannelRequest) SetChannelName(v string) *CreateUnionChannelRequest {
	s.ChannelName = &v
	return s
}

func (s *CreateUnionChannelRequest) SetUserDid(v string) *CreateUnionChannelRequest {
	s.UserDid = &v
	return s
}

func (s *CreateUnionChannelRequest) SetPublicAcl(v bool) *CreateUnionChannelRequest {
	s.PublicAcl = &v
	return s
}

type CreateUnionChannelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateUnionChannelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionChannelResponse) GoString() string {
	return s.String()
}

func (s *CreateUnionChannelResponse) SetReqMsgId(v string) *CreateUnionChannelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUnionChannelResponse) SetResultCode(v string) *CreateUnionChannelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUnionChannelResponse) SetResultMsg(v string) *CreateUnionChannelResponse {
	s.ResultMsg = &v
	return s
}

type ListUserChannelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 发起账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 操作权限类型读、写，入参为WRITE, READ
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 页码，从1开始，不传默认查询第一页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小，不传的话默认100，页大小上限100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListUserChannelRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUserChannelRequest) GoString() string {
	return s.String()
}

func (s *ListUserChannelRequest) SetAuthToken(v string) *ListUserChannelRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUserChannelRequest) SetProductInstanceId(v string) *ListUserChannelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUserChannelRequest) SetUnionId(v int64) *ListUserChannelRequest {
	s.UnionId = &v
	return s
}

func (s *ListUserChannelRequest) SetUserDid(v string) *ListUserChannelRequest {
	s.UserDid = &v
	return s
}

func (s *ListUserChannelRequest) SetOperateType(v string) *ListUserChannelRequest {
	s.OperateType = &v
	return s
}

func (s *ListUserChannelRequest) SetPageNum(v int64) *ListUserChannelRequest {
	s.PageNum = &v
	return s
}

func (s *ListUserChannelRequest) SetPageSize(v int64) *ListUserChannelRequest {
	s.PageSize = &v
	return s
}

type ListUserChannelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 用户有读或写权限的非公开访问通道列表
	ChannelList []*UserChannelDTO `json:"channel_list,omitempty" xml:"channel_list,omitempty" type:"Repeated"`
}

func (s ListUserChannelResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUserChannelResponse) GoString() string {
	return s.String()
}

func (s *ListUserChannelResponse) SetReqMsgId(v string) *ListUserChannelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUserChannelResponse) SetResultCode(v string) *ListUserChannelResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUserChannelResponse) SetResultMsg(v string) *ListUserChannelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUserChannelResponse) SetPageNum(v int64) *ListUserChannelResponse {
	s.PageNum = &v
	return s
}

func (s *ListUserChannelResponse) SetPageSize(v int64) *ListUserChannelResponse {
	s.PageSize = &v
	return s
}

func (s *ListUserChannelResponse) SetTotalPage(v int64) *ListUserChannelResponse {
	s.TotalPage = &v
	return s
}

func (s *ListUserChannelResponse) SetChannelList(v []*UserChannelDTO) *ListUserChannelResponse {
	s.ChannelList = v
	return s
}

type ListUnionPubchannelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 发起查询的账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 页码，不传默认为第一页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小，不传默认为100，页大小上限为100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListUnionPubchannelRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUnionPubchannelRequest) GoString() string {
	return s.String()
}

func (s *ListUnionPubchannelRequest) SetAuthToken(v string) *ListUnionPubchannelRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUnionPubchannelRequest) SetProductInstanceId(v string) *ListUnionPubchannelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUnionPubchannelRequest) SetUnionId(v int64) *ListUnionPubchannelRequest {
	s.UnionId = &v
	return s
}

func (s *ListUnionPubchannelRequest) SetUserDid(v string) *ListUnionPubchannelRequest {
	s.UserDid = &v
	return s
}

func (s *ListUnionPubchannelRequest) SetPageNum(v int64) *ListUnionPubchannelRequest {
	s.PageNum = &v
	return s
}

func (s *ListUnionPubchannelRequest) SetPageSize(v int64) *ListUnionPubchannelRequest {
	s.PageSize = &v
	return s
}

type ListUnionPubchannelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 公开可访问Channel列表
	ChannelList []*ChannelDTO `json:"channel_list,omitempty" xml:"channel_list,omitempty" type:"Repeated"`
}

func (s ListUnionPubchannelResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUnionPubchannelResponse) GoString() string {
	return s.String()
}

func (s *ListUnionPubchannelResponse) SetReqMsgId(v string) *ListUnionPubchannelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetResultCode(v string) *ListUnionPubchannelResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetResultMsg(v string) *ListUnionPubchannelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetPageNum(v int64) *ListUnionPubchannelResponse {
	s.PageNum = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetPageSize(v int64) *ListUnionPubchannelResponse {
	s.PageSize = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetTotalPage(v int64) *ListUnionPubchannelResponse {
	s.TotalPage = &v
	return s
}

func (s *ListUnionPubchannelResponse) SetChannelList(v []*ChannelDTO) *ListUnionPubchannelResponse {
	s.ChannelList = v
	return s
}

type AuthChannelUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 发起授权操作的账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 要授权的账户
	TargetUserDid *string `json:"target_user_did,omitempty" xml:"target_user_did,omitempty" require:"true"`
	// 要给用户分配读或写权限
	// READ,
	// WRITE;
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 授权有效期，为空时表示永久有效
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s AuthChannelUserRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthChannelUserRequest) GoString() string {
	return s.String()
}

func (s *AuthChannelUserRequest) SetAuthToken(v string) *AuthChannelUserRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthChannelUserRequest) SetProductInstanceId(v string) *AuthChannelUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthChannelUserRequest) SetUnionId(v int64) *AuthChannelUserRequest {
	s.UnionId = &v
	return s
}

func (s *AuthChannelUserRequest) SetChannelName(v string) *AuthChannelUserRequest {
	s.ChannelName = &v
	return s
}

func (s *AuthChannelUserRequest) SetUserDid(v string) *AuthChannelUserRequest {
	s.UserDid = &v
	return s
}

func (s *AuthChannelUserRequest) SetTargetUserDid(v string) *AuthChannelUserRequest {
	s.TargetUserDid = &v
	return s
}

func (s *AuthChannelUserRequest) SetOperateType(v string) *AuthChannelUserRequest {
	s.OperateType = &v
	return s
}

func (s *AuthChannelUserRequest) SetValidTime(v string) *AuthChannelUserRequest {
	s.ValidTime = &v
	return s
}

type AuthChannelUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AuthChannelUserResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthChannelUserResponse) GoString() string {
	return s.String()
}

func (s *AuthChannelUserResponse) SetReqMsgId(v string) *AuthChannelUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthChannelUserResponse) SetResultCode(v string) *AuthChannelUserResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthChannelUserResponse) SetResultMsg(v string) *AuthChannelUserResponse {
	s.ResultMsg = &v
	return s
}

type CancelChannelUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 发起方账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 要取消授权的账户
	TargetUserDid *string `json:"target_user_did,omitempty" xml:"target_user_did,omitempty" require:"true"`
	// 要取消的操作权限类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
}

func (s CancelChannelUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelChannelUserRequest) GoString() string {
	return s.String()
}

func (s *CancelChannelUserRequest) SetAuthToken(v string) *CancelChannelUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelChannelUserRequest) SetProductInstanceId(v string) *CancelChannelUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelChannelUserRequest) SetUnionId(v int64) *CancelChannelUserRequest {
	s.UnionId = &v
	return s
}

func (s *CancelChannelUserRequest) SetChannelName(v string) *CancelChannelUserRequest {
	s.ChannelName = &v
	return s
}

func (s *CancelChannelUserRequest) SetUserDid(v string) *CancelChannelUserRequest {
	s.UserDid = &v
	return s
}

func (s *CancelChannelUserRequest) SetTargetUserDid(v string) *CancelChannelUserRequest {
	s.TargetUserDid = &v
	return s
}

func (s *CancelChannelUserRequest) SetOperateType(v string) *CancelChannelUserRequest {
	s.OperateType = &v
	return s
}

type CancelChannelUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelChannelUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelChannelUserResponse) GoString() string {
	return s.String()
}

func (s *CancelChannelUserResponse) SetReqMsgId(v string) *CancelChannelUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelChannelUserResponse) SetResultCode(v string) *CancelChannelUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelChannelUserResponse) SetResultMsg(v string) *CancelChannelUserResponse {
	s.ResultMsg = &v
	return s
}

type CreateUnionFormRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 业务单据号
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 业务单据类型
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
	// 原生单据json字符串
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty" require:"true"`
	// 用户自定义的图ID，开启图功能时传入
	GraphId *string `json:"graph_id,omitempty" xml:"graph_id,omitempty"`
	// 用户自定义的LineNode名称
	LineNode *string `json:"line_node,omitempty" xml:"line_node,omitempty"`
	// 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 表单的直接上游节点formId
	ParentFormIdList []*string `json:"parent_form_id_list,omitempty" xml:"parent_form_id_list,omitempty" type:"Repeated"`
	// 表单的直接下游节点formId
	ChildFormIdList []*string `json:"child_form_id_list,omitempty" xml:"child_form_id_list,omitempty" type:"Repeated"`
}

func (s CreateUnionFormRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionFormRequest) GoString() string {
	return s.String()
}

func (s *CreateUnionFormRequest) SetAuthToken(v string) *CreateUnionFormRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUnionFormRequest) SetProductInstanceId(v string) *CreateUnionFormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUnionFormRequest) SetUserDid(v string) *CreateUnionFormRequest {
	s.UserDid = &v
	return s
}

func (s *CreateUnionFormRequest) SetUnionId(v int64) *CreateUnionFormRequest {
	s.UnionId = &v
	return s
}

func (s *CreateUnionFormRequest) SetChannelName(v string) *CreateUnionFormRequest {
	s.ChannelName = &v
	return s
}

func (s *CreateUnionFormRequest) SetFormId(v string) *CreateUnionFormRequest {
	s.FormId = &v
	return s
}

func (s *CreateUnionFormRequest) SetFormType(v string) *CreateUnionFormRequest {
	s.FormType = &v
	return s
}

func (s *CreateUnionFormRequest) SetFormBody(v string) *CreateUnionFormRequest {
	s.FormBody = &v
	return s
}

func (s *CreateUnionFormRequest) SetGraphId(v string) *CreateUnionFormRequest {
	s.GraphId = &v
	return s
}

func (s *CreateUnionFormRequest) SetLineNode(v string) *CreateUnionFormRequest {
	s.LineNode = &v
	return s
}

func (s *CreateUnionFormRequest) SetTraceId(v string) *CreateUnionFormRequest {
	s.TraceId = &v
	return s
}

func (s *CreateUnionFormRequest) SetParentFormIdList(v []*string) *CreateUnionFormRequest {
	s.ParentFormIdList = v
	return s
}

func (s *CreateUnionFormRequest) SetChildFormIdList(v []*string) *CreateUnionFormRequest {
	s.ChildFormIdList = v
	return s
}

type CreateUnionFormResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链上交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateUnionFormResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUnionFormResponse) GoString() string {
	return s.String()
}

func (s *CreateUnionFormResponse) SetReqMsgId(v string) *CreateUnionFormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUnionFormResponse) SetResultCode(v string) *CreateUnionFormResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUnionFormResponse) SetResultMsg(v string) *CreateUnionFormResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUnionFormResponse) SetTxHash(v string) *CreateUnionFormResponse {
	s.TxHash = &v
	return s
}

type QueryUnionFormRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发起方账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 业务单据ID
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 业务单据类型
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
}

func (s QueryUnionFormRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUnionFormRequest) GoString() string {
	return s.String()
}

func (s *QueryUnionFormRequest) SetAuthToken(v string) *QueryUnionFormRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUnionFormRequest) SetProductInstanceId(v string) *QueryUnionFormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUnionFormRequest) SetUserDid(v string) *QueryUnionFormRequest {
	s.UserDid = &v
	return s
}

func (s *QueryUnionFormRequest) SetUnionId(v int64) *QueryUnionFormRequest {
	s.UnionId = &v
	return s
}

func (s *QueryUnionFormRequest) SetFormId(v string) *QueryUnionFormRequest {
	s.FormId = &v
	return s
}

func (s *QueryUnionFormRequest) SetFormType(v string) *QueryUnionFormRequest {
	s.FormType = &v
	return s
}

type QueryUnionFormResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 块高
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 交易时间戳
	TxTimestamp *string `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty"`
	// 业务表单ID
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty"`
	// 业务单据类型
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty"`
	// 解密后原始表单内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s QueryUnionFormResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUnionFormResponse) GoString() string {
	return s.String()
}

func (s *QueryUnionFormResponse) SetReqMsgId(v string) *QueryUnionFormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUnionFormResponse) SetResultCode(v string) *QueryUnionFormResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUnionFormResponse) SetResultMsg(v string) *QueryUnionFormResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUnionFormResponse) SetBlockHeight(v int64) *QueryUnionFormResponse {
	s.BlockHeight = &v
	return s
}

func (s *QueryUnionFormResponse) SetTxHash(v string) *QueryUnionFormResponse {
	s.TxHash = &v
	return s
}

func (s *QueryUnionFormResponse) SetTxTimestamp(v string) *QueryUnionFormResponse {
	s.TxTimestamp = &v
	return s
}

func (s *QueryUnionFormResponse) SetFormId(v string) *QueryUnionFormResponse {
	s.FormId = &v
	return s
}

func (s *QueryUnionFormResponse) SetFormType(v string) *QueryUnionFormResponse {
	s.FormType = &v
	return s
}

func (s *QueryUnionFormResponse) SetContent(v string) *QueryUnionFormResponse {
	s.Content = &v
	return s
}

type ListChannelUserformRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发起方的账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟ID
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel名称
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 页码，默认1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小，默认100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListChannelUserformRequest) String() string {
	return tea.Prettify(s)
}

func (s ListChannelUserformRequest) GoString() string {
	return s.String()
}

func (s *ListChannelUserformRequest) SetAuthToken(v string) *ListChannelUserformRequest {
	s.AuthToken = &v
	return s
}

func (s *ListChannelUserformRequest) SetProductInstanceId(v string) *ListChannelUserformRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListChannelUserformRequest) SetUserDid(v string) *ListChannelUserformRequest {
	s.UserDid = &v
	return s
}

func (s *ListChannelUserformRequest) SetUnionId(v int64) *ListChannelUserformRequest {
	s.UnionId = &v
	return s
}

func (s *ListChannelUserformRequest) SetChannelName(v string) *ListChannelUserformRequest {
	s.ChannelName = &v
	return s
}

func (s *ListChannelUserformRequest) SetPageNum(v int64) *ListChannelUserformRequest {
	s.PageNum = &v
	return s
}

func (s *ListChannelUserformRequest) SetPageSize(v int64) *ListChannelUserformRequest {
	s.PageSize = &v
	return s
}

type ListChannelUserformResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 表单列表
	FormList []*FormIndexDTO `json:"form_list,omitempty" xml:"form_list,omitempty" type:"Repeated"`
}

func (s ListChannelUserformResponse) String() string {
	return tea.Prettify(s)
}

func (s ListChannelUserformResponse) GoString() string {
	return s.String()
}

func (s *ListChannelUserformResponse) SetReqMsgId(v string) *ListChannelUserformResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListChannelUserformResponse) SetResultCode(v string) *ListChannelUserformResponse {
	s.ResultCode = &v
	return s
}

func (s *ListChannelUserformResponse) SetResultMsg(v string) *ListChannelUserformResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListChannelUserformResponse) SetPageNum(v int64) *ListChannelUserformResponse {
	s.PageNum = &v
	return s
}

func (s *ListChannelUserformResponse) SetPageSize(v int64) *ListChannelUserformResponse {
	s.PageSize = &v
	return s
}

func (s *ListChannelUserformResponse) SetTotalPage(v int64) *ListChannelUserformResponse {
	s.TotalPage = &v
	return s
}

func (s *ListChannelUserformResponse) SetFormList(v []*FormIndexDTO) *ListChannelUserformResponse {
	s.FormList = v
	return s
}

type CreateObjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链身份
	//
	//
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟标识（联盟码）
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 归属权要流转的表单ID
	//
	//
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 物的信息
	//
	//
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty" require:"true"`
}

func (s CreateObjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateObjectRequest) GoString() string {
	return s.String()
}

func (s *CreateObjectRequest) SetAuthToken(v string) *CreateObjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateObjectRequest) SetProductInstanceId(v string) *CreateObjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateObjectRequest) SetUserDid(v string) *CreateObjectRequest {
	s.UserDid = &v
	return s
}

func (s *CreateObjectRequest) SetUnionId(v string) *CreateObjectRequest {
	s.UnionId = &v
	return s
}

func (s *CreateObjectRequest) SetFormId(v string) *CreateObjectRequest {
	s.FormId = &v
	return s
}

func (s *CreateObjectRequest) SetFormBody(v string) *CreateObjectRequest {
	s.FormBody = &v
	return s
}

type CreateObjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易哈希，物的链上身份
	ObjectHash *string `json:"object_hash,omitempty" xml:"object_hash,omitempty"`
}

func (s CreateObjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateObjectResponse) GoString() string {
	return s.String()
}

func (s *CreateObjectResponse) SetReqMsgId(v string) *CreateObjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateObjectResponse) SetResultCode(v string) *CreateObjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateObjectResponse) SetResultMsg(v string) *CreateObjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateObjectResponse) SetObjectHash(v string) *CreateObjectResponse {
	s.ObjectHash = &v
	return s
}

type CreateObjectTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链身份
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟标识（联盟码）
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链上物体的身份，即物体（物权）上链接口返回的交易哈希
	ObjectHash *string `json:"object_hash,omitempty" xml:"object_hash,omitempty" require:"true"`
	// 流转备注信息
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty"`
	// 数据归属权流转到的Did
	ToDid *string `json:"to_did,omitempty" xml:"to_did,omitempty" require:"true"`
}

func (s CreateObjectTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateObjectTransferRequest) GoString() string {
	return s.String()
}

func (s *CreateObjectTransferRequest) SetAuthToken(v string) *CreateObjectTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateObjectTransferRequest) SetProductInstanceId(v string) *CreateObjectTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateObjectTransferRequest) SetUserDid(v string) *CreateObjectTransferRequest {
	s.UserDid = &v
	return s
}

func (s *CreateObjectTransferRequest) SetUnionId(v string) *CreateObjectTransferRequest {
	s.UnionId = &v
	return s
}

func (s *CreateObjectTransferRequest) SetObjectHash(v string) *CreateObjectTransferRequest {
	s.ObjectHash = &v
	return s
}

func (s *CreateObjectTransferRequest) SetFormBody(v string) *CreateObjectTransferRequest {
	s.FormBody = &v
	return s
}

func (s *CreateObjectTransferRequest) SetToDid(v string) *CreateObjectTransferRequest {
	s.ToDid = &v
	return s
}

type CreateObjectTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易Hash
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateObjectTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateObjectTransferResponse) GoString() string {
	return s.String()
}

func (s *CreateObjectTransferResponse) SetReqMsgId(v string) *CreateObjectTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateObjectTransferResponse) SetResultCode(v string) *CreateObjectTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateObjectTransferResponse) SetResultMsg(v string) *CreateObjectTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateObjectTransferResponse) SetTxHash(v string) *CreateObjectTransferResponse {
	s.TxHash = &v
	return s
}

type ListObjectTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链身份
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟标识（联盟码）
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链上物体的身份
	ObjectHash *string `json:"object_hash,omitempty" xml:"object_hash,omitempty" require:"true"`
}

func (s ListObjectTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ListObjectTransferRequest) GoString() string {
	return s.String()
}

func (s *ListObjectTransferRequest) SetAuthToken(v string) *ListObjectTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ListObjectTransferRequest) SetProductInstanceId(v string) *ListObjectTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListObjectTransferRequest) SetUserDid(v string) *ListObjectTransferRequest {
	s.UserDid = &v
	return s
}

func (s *ListObjectTransferRequest) SetUnionId(v string) *ListObjectTransferRequest {
	s.UnionId = &v
	return s
}

func (s *ListObjectTransferRequest) SetObjectHash(v string) *ListObjectTransferRequest {
	s.ObjectHash = &v
	return s
}

type ListObjectTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据归属权流转列表
	//
	DataTransferList []*DataTransferObject `json:"data_transfer_list,omitempty" xml:"data_transfer_list,omitempty" type:"Repeated"`
}

func (s ListObjectTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ListObjectTransferResponse) GoString() string {
	return s.String()
}

func (s *ListObjectTransferResponse) SetReqMsgId(v string) *ListObjectTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListObjectTransferResponse) SetResultCode(v string) *ListObjectTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ListObjectTransferResponse) SetResultMsg(v string) *ListObjectTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListObjectTransferResponse) SetDataTransferList(v []*DataTransferObject) *ListObjectTransferResponse {
	s.DataTransferList = v
	return s
}

type CreateStatusflowTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 状态流模版名称
	FlowName *string `json:"flow_name,omitempty" xml:"flow_name,omitempty" require:"true"`
	// 自定义流程入参DTO
	FlowTemplate []*FlowTemplate `json:"flow_template,omitempty" xml:"flow_template,omitempty" require:"true" type:"Repeated"`
}

func (s CreateStatusflowTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateStatusflowTemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateStatusflowTemplateRequest) SetAuthToken(v string) *CreateStatusflowTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateStatusflowTemplateRequest) SetProductInstanceId(v string) *CreateStatusflowTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateStatusflowTemplateRequest) SetUnionId(v string) *CreateStatusflowTemplateRequest {
	s.UnionId = &v
	return s
}

func (s *CreateStatusflowTemplateRequest) SetFlowName(v string) *CreateStatusflowTemplateRequest {
	s.FlowName = &v
	return s
}

func (s *CreateStatusflowTemplateRequest) SetFlowTemplate(v []*FlowTemplate) *CreateStatusflowTemplateRequest {
	s.FlowTemplate = v
	return s
}

type CreateStatusflowTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateStatusflowTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateStatusflowTemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateStatusflowTemplateResponse) SetReqMsgId(v string) *CreateStatusflowTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateStatusflowTemplateResponse) SetResultCode(v string) *CreateStatusflowTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateStatusflowTemplateResponse) SetResultMsg(v string) *CreateStatusflowTemplateResponse {
	s.ResultMsg = &v
	return s
}

type DeleteStatusflowTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 状态流模版名称
	FlowName *string `json:"flow_name,omitempty" xml:"flow_name,omitempty" require:"true"`
}

func (s DeleteStatusflowTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteStatusflowTemplateRequest) GoString() string {
	return s.String()
}

func (s *DeleteStatusflowTemplateRequest) SetAuthToken(v string) *DeleteStatusflowTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteStatusflowTemplateRequest) SetProductInstanceId(v string) *DeleteStatusflowTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteStatusflowTemplateRequest) SetUnionId(v string) *DeleteStatusflowTemplateRequest {
	s.UnionId = &v
	return s
}

func (s *DeleteStatusflowTemplateRequest) SetFlowName(v string) *DeleteStatusflowTemplateRequest {
	s.FlowName = &v
	return s
}

type DeleteStatusflowTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteStatusflowTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteStatusflowTemplateResponse) GoString() string {
	return s.String()
}

func (s *DeleteStatusflowTemplateResponse) SetReqMsgId(v string) *DeleteStatusflowTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteStatusflowTemplateResponse) SetResultCode(v string) *DeleteStatusflowTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteStatusflowTemplateResponse) SetResultMsg(v string) *DeleteStatusflowTemplateResponse {
	s.ResultMsg = &v
	return s
}

type QueryStatusflowTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 状态流模版名称
	FlowName *string `json:"flow_name,omitempty" xml:"flow_name,omitempty" require:"true"`
}

func (s QueryStatusflowTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatusflowTemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryStatusflowTemplateRequest) SetAuthToken(v string) *QueryStatusflowTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatusflowTemplateRequest) SetProductInstanceId(v string) *QueryStatusflowTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatusflowTemplateRequest) SetUnionId(v string) *QueryStatusflowTemplateRequest {
	s.UnionId = &v
	return s
}

func (s *QueryStatusflowTemplateRequest) SetFlowName(v string) *QueryStatusflowTemplateRequest {
	s.FlowName = &v
	return s
}

type QueryStatusflowTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 联盟ID
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty"`
	// 状态流模版名称
	FlowName *string `json:"flow_name,omitempty" xml:"flow_name,omitempty"`
	// 自定义流程返回DTO
	ListTemplateProcess []*FlowTemplate `json:"list_template_process,omitempty" xml:"list_template_process,omitempty" type:"Repeated"`
}

func (s QueryStatusflowTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatusflowTemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryStatusflowTemplateResponse) SetReqMsgId(v string) *QueryStatusflowTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatusflowTemplateResponse) SetResultCode(v string) *QueryStatusflowTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatusflowTemplateResponse) SetResultMsg(v string) *QueryStatusflowTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatusflowTemplateResponse) SetUnionId(v string) *QueryStatusflowTemplateResponse {
	s.UnionId = &v
	return s
}

func (s *QueryStatusflowTemplateResponse) SetFlowName(v string) *QueryStatusflowTemplateResponse {
	s.FlowName = &v
	return s
}

func (s *QueryStatusflowTemplateResponse) SetListTemplateProcess(v []*FlowTemplate) *QueryStatusflowTemplateResponse {
	s.ListTemplateProcess = v
	return s
}

type StartDatastatusDriveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链身份
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟标识（联盟码）
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链上物体的身份，即物体（物权）上链接口返回的交易哈希
	ObjectHash *string `json:"object_hash,omitempty" xml:"object_hash,omitempty" require:"true"`
	// 进行驱动状态的环节业务类型
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
	// 驱动状态的信息备注
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty" require:"true"`
	// 是否驱动状态流转，前置条件配置了状态流转模版
	DriveStatus *bool `json:"drive_status,omitempty" xml:"drive_status,omitempty" require:"true"`
}

func (s StartDatastatusDriveRequest) String() string {
	return tea.Prettify(s)
}

func (s StartDatastatusDriveRequest) GoString() string {
	return s.String()
}

func (s *StartDatastatusDriveRequest) SetAuthToken(v string) *StartDatastatusDriveRequest {
	s.AuthToken = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetProductInstanceId(v string) *StartDatastatusDriveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetUserDid(v string) *StartDatastatusDriveRequest {
	s.UserDid = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetUnionId(v string) *StartDatastatusDriveRequest {
	s.UnionId = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetObjectHash(v string) *StartDatastatusDriveRequest {
	s.ObjectHash = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetFormType(v string) *StartDatastatusDriveRequest {
	s.FormType = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetFormBody(v string) *StartDatastatusDriveRequest {
	s.FormBody = &v
	return s
}

func (s *StartDatastatusDriveRequest) SetDriveStatus(v bool) *StartDatastatusDriveRequest {
	s.DriveStatus = &v
	return s
}

type StartDatastatusDriveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易Hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s StartDatastatusDriveResponse) String() string {
	return tea.Prettify(s)
}

func (s StartDatastatusDriveResponse) GoString() string {
	return s.String()
}

func (s *StartDatastatusDriveResponse) SetReqMsgId(v string) *StartDatastatusDriveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartDatastatusDriveResponse) SetResultCode(v string) *StartDatastatusDriveResponse {
	s.ResultCode = &v
	return s
}

func (s *StartDatastatusDriveResponse) SetResultMsg(v string) *StartDatastatusDriveResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartDatastatusDriveResponse) SetTxHash(v string) *StartDatastatusDriveResponse {
	s.TxHash = &v
	return s
}

type ListDatastatusDriveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链身份
	//
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟标识（联盟码）
	//
	UnionId *string `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 链上数据的身份
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s ListDatastatusDriveRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDatastatusDriveRequest) GoString() string {
	return s.String()
}

func (s *ListDatastatusDriveRequest) SetAuthToken(v string) *ListDatastatusDriveRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDatastatusDriveRequest) SetProductInstanceId(v string) *ListDatastatusDriveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDatastatusDriveRequest) SetUserDid(v string) *ListDatastatusDriveRequest {
	s.UserDid = &v
	return s
}

func (s *ListDatastatusDriveRequest) SetUnionId(v string) *ListDatastatusDriveRequest {
	s.UnionId = &v
	return s
}

func (s *ListDatastatusDriveRequest) SetTxHash(v string) *ListDatastatusDriveRequest {
	s.TxHash = &v
	return s
}

type ListDatastatusDriveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据状态流转
	//
	DataStatusDriveList []*StatusDrive `json:"data_status_drive_list,omitempty" xml:"data_status_drive_list,omitempty" type:"Repeated"`
}

func (s ListDatastatusDriveResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDatastatusDriveResponse) GoString() string {
	return s.String()
}

func (s *ListDatastatusDriveResponse) SetReqMsgId(v string) *ListDatastatusDriveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDatastatusDriveResponse) SetResultCode(v string) *ListDatastatusDriveResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDatastatusDriveResponse) SetResultMsg(v string) *ListDatastatusDriveResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDatastatusDriveResponse) SetDataStatusDriveList(v []*StatusDrive) *ListDatastatusDriveResponse {
	s.DataStatusDriveList = v
	return s
}

type CreateAsynformFormRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 上链账户
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟ID
	//
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// Channel名称
	//
	ChannelName *string `json:"channel_name,omitempty" xml:"channel_name,omitempty" require:"true"`
	// 业务单据号
	//
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 业务单据类型
	//
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
	// 原生单据json字符串
	FormBody *string `json:"form_body,omitempty" xml:"form_body,omitempty" require:"true"`
	// 用户自定义的图ID，开启图功能时传入
	//
	GraphId *string `json:"graph_id,omitempty" xml:"graph_id,omitempty"`
	// 用户自定义的LineNode名称
	//
	LineNode *string `json:"line_node,omitempty" xml:"line_node,omitempty"`
	// 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 表单的直接上游节点formId
	//
	ParentFormIdList []*string `json:"parent_form_id_list,omitempty" xml:"parent_form_id_list,omitempty" type:"Repeated"`
	// 表单的直接下游节点formId
	//
	ChildFormIdList []*string `json:"child_form_id_list,omitempty" xml:"child_form_id_list,omitempty" type:"Repeated"`
}

func (s CreateAsynformFormRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAsynformFormRequest) GoString() string {
	return s.String()
}

func (s *CreateAsynformFormRequest) SetAuthToken(v string) *CreateAsynformFormRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAsynformFormRequest) SetProductInstanceId(v string) *CreateAsynformFormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAsynformFormRequest) SetUserDid(v string) *CreateAsynformFormRequest {
	s.UserDid = &v
	return s
}

func (s *CreateAsynformFormRequest) SetUnionId(v int64) *CreateAsynformFormRequest {
	s.UnionId = &v
	return s
}

func (s *CreateAsynformFormRequest) SetChannelName(v string) *CreateAsynformFormRequest {
	s.ChannelName = &v
	return s
}

func (s *CreateAsynformFormRequest) SetFormId(v string) *CreateAsynformFormRequest {
	s.FormId = &v
	return s
}

func (s *CreateAsynformFormRequest) SetFormType(v string) *CreateAsynformFormRequest {
	s.FormType = &v
	return s
}

func (s *CreateAsynformFormRequest) SetFormBody(v string) *CreateAsynformFormRequest {
	s.FormBody = &v
	return s
}

func (s *CreateAsynformFormRequest) SetGraphId(v string) *CreateAsynformFormRequest {
	s.GraphId = &v
	return s
}

func (s *CreateAsynformFormRequest) SetLineNode(v string) *CreateAsynformFormRequest {
	s.LineNode = &v
	return s
}

func (s *CreateAsynformFormRequest) SetTraceId(v string) *CreateAsynformFormRequest {
	s.TraceId = &v
	return s
}

func (s *CreateAsynformFormRequest) SetParentFormIdList(v []*string) *CreateAsynformFormRequest {
	s.ParentFormIdList = v
	return s
}

func (s *CreateAsynformFormRequest) SetChildFormIdList(v []*string) *CreateAsynformFormRequest {
	s.ChildFormIdList = v
	return s
}

type CreateAsynformFormResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易Hash
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s CreateAsynformFormResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAsynformFormResponse) GoString() string {
	return s.String()
}

func (s *CreateAsynformFormResponse) SetReqMsgId(v string) *CreateAsynformFormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAsynformFormResponse) SetResultCode(v string) *CreateAsynformFormResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAsynformFormResponse) SetResultMsg(v string) *CreateAsynformFormResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAsynformFormResponse) SetTxHash(v string) *CreateAsynformFormResponse {
	s.TxHash = &v
	return s
}

type PagequeryUnionFormRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟ID
	//
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 过滤时间段开始时间点
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 过滤时间段结束时间点
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 页码，默认从1开始
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页大小，默认100，最大值限制为100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s PagequeryUnionFormRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryUnionFormRequest) GoString() string {
	return s.String()
}

func (s *PagequeryUnionFormRequest) SetAuthToken(v string) *PagequeryUnionFormRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetProductInstanceId(v string) *PagequeryUnionFormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetUnionId(v int64) *PagequeryUnionFormRequest {
	s.UnionId = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetTraceId(v string) *PagequeryUnionFormRequest {
	s.TraceId = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetStartTime(v string) *PagequeryUnionFormRequest {
	s.StartTime = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetEndTime(v string) *PagequeryUnionFormRequest {
	s.EndTime = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetPageNum(v int64) *PagequeryUnionFormRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryUnionFormRequest) SetPageSize(v int64) *PagequeryUnionFormRequest {
	s.PageSize = &v
	return s
}

type PagequeryUnionFormResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 单据索引列表
	FormList []*FormIndexDTO `json:"form_list,omitempty" xml:"form_list,omitempty" type:"Repeated"`
}

func (s PagequeryUnionFormResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryUnionFormResponse) GoString() string {
	return s.String()
}

func (s *PagequeryUnionFormResponse) SetReqMsgId(v string) *PagequeryUnionFormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetResultCode(v string) *PagequeryUnionFormResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetResultMsg(v string) *PagequeryUnionFormResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetPageNum(v int64) *PagequeryUnionFormResponse {
	s.PageNum = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetPageSize(v int64) *PagequeryUnionFormResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetTotalPage(v int64) *PagequeryUnionFormResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryUnionFormResponse) SetFormList(v []*FormIndexDTO) *PagequeryUnionFormResponse {
	s.FormList = v
	return s
}

type QueryAsynformStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发起方账户
	//
	UserDid *string `json:"user_did,omitempty" xml:"user_did,omitempty" require:"true"`
	// 联盟ID
	//
	UnionId *int64 `json:"union_id,omitempty" xml:"union_id,omitempty" require:"true"`
	// 业务单据ID
	//
	FormId *string `json:"form_id,omitempty" xml:"form_id,omitempty" require:"true"`
	// 业务单据类型
	//
	FormType *string `json:"form_type,omitempty" xml:"form_type,omitempty" require:"true"`
}

func (s QueryAsynformStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAsynformStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryAsynformStatusRequest) SetAuthToken(v string) *QueryAsynformStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAsynformStatusRequest) SetProductInstanceId(v string) *QueryAsynformStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAsynformStatusRequest) SetUserDid(v string) *QueryAsynformStatusRequest {
	s.UserDid = &v
	return s
}

func (s *QueryAsynformStatusRequest) SetUnionId(v int64) *QueryAsynformStatusRequest {
	s.UnionId = &v
	return s
}

func (s *QueryAsynformStatusRequest) SetFormId(v string) *QueryAsynformStatusRequest {
	s.FormId = &v
	return s
}

func (s *QueryAsynformStatusRequest) SetFormType(v string) *QueryAsynformStatusRequest {
	s.FormType = &v
	return s
}

type QueryAsynformStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 块高
	//
	BlockHeight *int64 `json:"block_height,omitempty" xml:"block_height,omitempty"`
	// 交易hash
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 上传时间
	//
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// SUCCESS:上链成功, FAILURE:上链失败，UPLOADING:上链中
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 交易时间戳，成功上链时间
	//
	TxTimestamp *string `json:"tx_timestamp,omitempty" xml:"tx_timestamp,omitempty"`
}

func (s QueryAsynformStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAsynformStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryAsynformStatusResponse) SetReqMsgId(v string) *QueryAsynformStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetResultCode(v string) *QueryAsynformStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetResultMsg(v string) *QueryAsynformStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetBlockHeight(v int64) *QueryAsynformStatusResponse {
	s.BlockHeight = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetTxHash(v string) *QueryAsynformStatusResponse {
	s.TxHash = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetCreateTime(v string) *QueryAsynformStatusResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetStatus(v string) *QueryAsynformStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryAsynformStatusResponse) SetTxTimestamp(v string) *QueryAsynformStatusResponse {
	s.TxTimestamp = &v
	return s
}

type QuerySolutionFastnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	//
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
	// 索引字段的值
	//
	BizIndexKeyValue *string `json:"biz_index_key_value,omitempty" xml:"biz_index_key_value,omitempty" require:"true"`
	// 名称
	SchemaName *string `json:"schema_name,omitempty" xml:"schema_name,omitempty" require:"true"`
}

func (s QuerySolutionFastnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionFastnotaryRequest) GoString() string {
	return s.String()
}

func (s *QuerySolutionFastnotaryRequest) SetAuthToken(v string) *QuerySolutionFastnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySolutionFastnotaryRequest) SetProductInstanceId(v string) *QuerySolutionFastnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySolutionFastnotaryRequest) SetAppDid(v string) *QuerySolutionFastnotaryRequest {
	s.AppDid = &v
	return s
}

func (s *QuerySolutionFastnotaryRequest) SetBizIndexKeyValue(v string) *QuerySolutionFastnotaryRequest {
	s.BizIndexKeyValue = &v
	return s
}

func (s *QuerySolutionFastnotaryRequest) SetSchemaName(v string) *QuerySolutionFastnotaryRequest {
	s.SchemaName = &v
	return s
}

type QuerySolutionFastnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证记录
	NotaryRecord *NotaryRecord `json:"notary_record,omitempty" xml:"notary_record,omitempty"`
}

func (s QuerySolutionFastnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionFastnotaryResponse) GoString() string {
	return s.String()
}

func (s *QuerySolutionFastnotaryResponse) SetReqMsgId(v string) *QuerySolutionFastnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySolutionFastnotaryResponse) SetResultCode(v string) *QuerySolutionFastnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySolutionFastnotaryResponse) SetResultMsg(v string) *QuerySolutionFastnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySolutionFastnotaryResponse) SetNotaryRecord(v *NotaryRecord) *QuerySolutionFastnotaryResponse {
	s.NotaryRecord = v
	return s
}

type SaveSolutionFastnotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	//
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
	// 表名
	SchemaName *string `json:"schema_name,omitempty" xml:"schema_name,omitempty" require:"true"`
	// 存证数据
	Attributes []*NameValuePair `json:"attributes,omitempty" xml:"attributes,omitempty" require:"true" type:"Repeated"`
}

func (s SaveSolutionFastnotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveSolutionFastnotaryRequest) GoString() string {
	return s.String()
}

func (s *SaveSolutionFastnotaryRequest) SetAuthToken(v string) *SaveSolutionFastnotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveSolutionFastnotaryRequest) SetProductInstanceId(v string) *SaveSolutionFastnotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveSolutionFastnotaryRequest) SetAppDid(v string) *SaveSolutionFastnotaryRequest {
	s.AppDid = &v
	return s
}

func (s *SaveSolutionFastnotaryRequest) SetSchemaName(v string) *SaveSolutionFastnotaryRequest {
	s.SchemaName = &v
	return s
}

func (s *SaveSolutionFastnotaryRequest) SetAttributes(v []*NameValuePair) *SaveSolutionFastnotaryRequest {
	s.Attributes = v
	return s
}

type SaveSolutionFastnotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易哈希
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s SaveSolutionFastnotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveSolutionFastnotaryResponse) GoString() string {
	return s.String()
}

func (s *SaveSolutionFastnotaryResponse) SetReqMsgId(v string) *SaveSolutionFastnotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveSolutionFastnotaryResponse) SetResultCode(v string) *SaveSolutionFastnotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveSolutionFastnotaryResponse) SetResultMsg(v string) *SaveSolutionFastnotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveSolutionFastnotaryResponse) SetTxHash(v string) *SaveSolutionFastnotaryResponse {
	s.TxHash = &v
	return s
}

type InitSolutionFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
}

func (s InitSolutionFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s InitSolutionFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *InitSolutionFilenotaryRequest) SetAuthToken(v string) *InitSolutionFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *InitSolutionFilenotaryRequest) SetProductInstanceId(v string) *InitSolutionFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitSolutionFilenotaryRequest) SetAppDid(v string) *InitSolutionFilenotaryRequest {
	s.AppDid = &v
	return s
}

type InitSolutionFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件存证id
	FileNotaryId *string `json:"file_notary_id,omitempty" xml:"file_notary_id,omitempty"`
	// 上传url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s InitSolutionFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s InitSolutionFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *InitSolutionFilenotaryResponse) SetReqMsgId(v string) *InitSolutionFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitSolutionFilenotaryResponse) SetResultCode(v string) *InitSolutionFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *InitSolutionFilenotaryResponse) SetResultMsg(v string) *InitSolutionFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitSolutionFilenotaryResponse) SetFileNotaryId(v string) *InitSolutionFilenotaryResponse {
	s.FileNotaryId = &v
	return s
}

func (s *InitSolutionFilenotaryResponse) SetUrl(v string) *InitSolutionFilenotaryResponse {
	s.Url = &v
	return s
}

type SyncSolutionFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	//
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
	// 文件存证id
	//
	FileNotaryId *string `json:"file_notary_id,omitempty" xml:"file_notary_id,omitempty" require:"true"`
}

func (s SyncSolutionFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncSolutionFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *SyncSolutionFilenotaryRequest) SetAuthToken(v string) *SyncSolutionFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncSolutionFilenotaryRequest) SetProductInstanceId(v string) *SyncSolutionFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncSolutionFilenotaryRequest) SetAppDid(v string) *SyncSolutionFilenotaryRequest {
	s.AppDid = &v
	return s
}

func (s *SyncSolutionFilenotaryRequest) SetFileNotaryId(v string) *SyncSolutionFilenotaryRequest {
	s.FileNotaryId = &v
	return s
}

type SyncSolutionFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否被接收
	//
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 拒绝原因
	//
	DeniedReason *string `json:"denied_reason,omitempty" xml:"denied_reason,omitempty"`
	// 文件存证id
	//
	FileNotaryId *string `json:"file_notary_id,omitempty" xml:"file_notary_id,omitempty"`
}

func (s SyncSolutionFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncSolutionFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *SyncSolutionFilenotaryResponse) SetReqMsgId(v string) *SyncSolutionFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncSolutionFilenotaryResponse) SetResultCode(v string) *SyncSolutionFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncSolutionFilenotaryResponse) SetResultMsg(v string) *SyncSolutionFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncSolutionFilenotaryResponse) SetAccepted(v bool) *SyncSolutionFilenotaryResponse {
	s.Accepted = &v
	return s
}

func (s *SyncSolutionFilenotaryResponse) SetDeniedReason(v string) *SyncSolutionFilenotaryResponse {
	s.DeniedReason = &v
	return s
}

func (s *SyncSolutionFilenotaryResponse) SetFileNotaryId(v string) *SyncSolutionFilenotaryResponse {
	s.FileNotaryId = &v
	return s
}

type GetSolutionFilenotarystatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	//
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
	// 文件存证id
	//
	FileNotaryId *string `json:"file_notary_id,omitempty" xml:"file_notary_id,omitempty" require:"true"`
}

func (s GetSolutionFilenotarystatusRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSolutionFilenotarystatusRequest) GoString() string {
	return s.String()
}

func (s *GetSolutionFilenotarystatusRequest) SetAuthToken(v string) *GetSolutionFilenotarystatusRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSolutionFilenotarystatusRequest) SetProductInstanceId(v string) *GetSolutionFilenotarystatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSolutionFilenotarystatusRequest) SetAppDid(v string) *GetSolutionFilenotarystatusRequest {
	s.AppDid = &v
	return s
}

func (s *GetSolutionFilenotarystatusRequest) SetFileNotaryId(v string) *GetSolutionFilenotarystatusRequest {
	s.FileNotaryId = &v
	return s
}

type GetSolutionFilenotarystatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存证是否接受
	//
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	// 存证拒绝原因
	//
	DeniedReason *string `json:"denied_reason,omitempty" xml:"denied_reason,omitempty"`
	// 文件存证id
	//
	FileNotaryId *string `json:"file_notary_id,omitempty" xml:"file_notary_id,omitempty"`
	// 存证是否完成
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty"`
	// 存证哈希，存证未完成时为空
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s GetSolutionFilenotarystatusResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSolutionFilenotarystatusResponse) GoString() string {
	return s.String()
}

func (s *GetSolutionFilenotarystatusResponse) SetReqMsgId(v string) *GetSolutionFilenotarystatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetResultCode(v string) *GetSolutionFilenotarystatusResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetResultMsg(v string) *GetSolutionFilenotarystatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetAccepted(v bool) *GetSolutionFilenotarystatusResponse {
	s.Accepted = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetDeniedReason(v string) *GetSolutionFilenotarystatusResponse {
	s.DeniedReason = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetFileNotaryId(v string) *GetSolutionFilenotarystatusResponse {
	s.FileNotaryId = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetFinished(v bool) *GetSolutionFilenotarystatusResponse {
	s.Finished = &v
	return s
}

func (s *GetSolutionFilenotarystatusResponse) SetTxHash(v string) *GetSolutionFilenotarystatusResponse {
	s.TxHash = &v
	return s
}

type QuerySolutionFilenotaryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	//
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true"`
	// 存证哈希
	//
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
}

func (s QuerySolutionFilenotaryRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionFilenotaryRequest) GoString() string {
	return s.String()
}

func (s *QuerySolutionFilenotaryRequest) SetAuthToken(v string) *QuerySolutionFilenotaryRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySolutionFilenotaryRequest) SetProductInstanceId(v string) *QuerySolutionFilenotaryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySolutionFilenotaryRequest) SetAppDid(v string) *QuerySolutionFilenotaryRequest {
	s.AppDid = &v
	return s
}

func (s *QuerySolutionFilenotaryRequest) SetTxHash(v string) *QuerySolutionFilenotaryRequest {
	s.TxHash = &v
	return s
}

type QuerySolutionFilenotaryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件sha256哈希
	//
	FileContentHash *string `json:"file_content_hash,omitempty" xml:"file_content_hash,omitempty"`
	// 小程序二维码对应的url
	//
	QrCodeUrl *string `json:"qr_code_url,omitempty" xml:"qr_code_url,omitempty"`
	// 下载url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s QuerySolutionFilenotaryResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionFilenotaryResponse) GoString() string {
	return s.String()
}

func (s *QuerySolutionFilenotaryResponse) SetReqMsgId(v string) *QuerySolutionFilenotaryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySolutionFilenotaryResponse) SetResultCode(v string) *QuerySolutionFilenotaryResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySolutionFilenotaryResponse) SetResultMsg(v string) *QuerySolutionFilenotaryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySolutionFilenotaryResponse) SetFileContentHash(v string) *QuerySolutionFilenotaryResponse {
	s.FileContentHash = &v
	return s
}

func (s *QuerySolutionFilenotaryResponse) SetQrCodeUrl(v string) *QuerySolutionFilenotaryResponse {
	s.QrCodeUrl = &v
	return s
}

func (s *QuerySolutionFilenotaryResponse) SetUrl(v string) *QuerySolutionFilenotaryResponse {
	s.Url = &v
	return s
}

type ExecContractServiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用did
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty" require:"true" maxLength:"128"`
	// 合约方法名
	ContractMethod *string `json:"contract_method,omitempty" xml:"contract_method,omitempty" require:"true" maxLength:"128"`
	// 合约名称，当一个应用有多个合约时需要传入
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" maxLength:"128"`
	// 1.同步交易，2.异步交易，3.Local
	// 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
	ExecType *int64 `json:"exec_type,omitempty" xml:"exec_type,omitempty"`
	// 合约入参（格式为json）
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true" maxLength:"1024"`
}

func (s ExecContractServiceRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecContractServiceRequest) GoString() string {
	return s.String()
}

func (s *ExecContractServiceRequest) SetAuthToken(v string) *ExecContractServiceRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecContractServiceRequest) SetProductInstanceId(v string) *ExecContractServiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecContractServiceRequest) SetAppDid(v string) *ExecContractServiceRequest {
	s.AppDid = &v
	return s
}

func (s *ExecContractServiceRequest) SetContractMethod(v string) *ExecContractServiceRequest {
	s.ContractMethod = &v
	return s
}

func (s *ExecContractServiceRequest) SetContractName(v string) *ExecContractServiceRequest {
	s.ContractName = &v
	return s
}

func (s *ExecContractServiceRequest) SetExecType(v int64) *ExecContractServiceRequest {
	s.ExecType = &v
	return s
}

func (s *ExecContractServiceRequest) SetRequestBody(v string) *ExecContractServiceRequest {
	s.RequestBody = &v
	return s
}

type ExecContractServiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约执行结果
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s ExecContractServiceResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecContractServiceResponse) GoString() string {
	return s.String()
}

func (s *ExecContractServiceResponse) SetReqMsgId(v string) *ExecContractServiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecContractServiceResponse) SetResultCode(v string) *ExecContractServiceResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecContractServiceResponse) SetResultMsg(v string) *ExecContractServiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecContractServiceResponse) SetResponseBody(v string) *ExecContractServiceResponse {
	s.ResponseBody = &v
	return s
}

func (s *ExecContractServiceResponse) SetTxHash(v string) *ExecContractServiceResponse {
	s.TxHash = &v
	return s
}

type InitSolutionBmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 账户名称
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 合约名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合约临时url
	ContractUrl *string `json:"contract_url,omitempty" xml:"contract_url,omitempty" require:"true"`
}

func (s InitSolutionBmsRequest) String() string {
	return tea.Prettify(s)
}

func (s InitSolutionBmsRequest) GoString() string {
	return s.String()
}

func (s *InitSolutionBmsRequest) SetAuthToken(v string) *InitSolutionBmsRequest {
	s.AuthToken = &v
	return s
}

func (s *InitSolutionBmsRequest) SetProductInstanceId(v string) *InitSolutionBmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitSolutionBmsRequest) SetBizid(v string) *InitSolutionBmsRequest {
	s.Bizid = &v
	return s
}

func (s *InitSolutionBmsRequest) SetAccount(v string) *InitSolutionBmsRequest {
	s.Account = &v
	return s
}

func (s *InitSolutionBmsRequest) SetContractId(v string) *InitSolutionBmsRequest {
	s.ContractId = &v
	return s
}

func (s *InitSolutionBmsRequest) SetContractName(v string) *InitSolutionBmsRequest {
	s.ContractName = &v
	return s
}

func (s *InitSolutionBmsRequest) SetContractUrl(v string) *InitSolutionBmsRequest {
	s.ContractUrl = &v
	return s
}

type InitSolutionBmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用ID
	AppDid *string `json:"app_did,omitempty" xml:"app_did,omitempty"`
}

func (s InitSolutionBmsResponse) String() string {
	return tea.Prettify(s)
}

func (s InitSolutionBmsResponse) GoString() string {
	return s.String()
}

func (s *InitSolutionBmsResponse) SetReqMsgId(v string) *InitSolutionBmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitSolutionBmsResponse) SetResultCode(v string) *InitSolutionBmsResponse {
	s.ResultCode = &v
	return s
}

func (s *InitSolutionBmsResponse) SetResultMsg(v string) *InitSolutionBmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitSolutionBmsResponse) SetAppDid(v string) *InitSolutionBmsResponse {
	s.AppDid = &v
	return s
}

type QuerySolutionBmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 合约名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
}

func (s QuerySolutionBmsRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionBmsRequest) GoString() string {
	return s.String()
}

func (s *QuerySolutionBmsRequest) SetAuthToken(v string) *QuerySolutionBmsRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySolutionBmsRequest) SetProductInstanceId(v string) *QuerySolutionBmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySolutionBmsRequest) SetBizid(v string) *QuerySolutionBmsRequest {
	s.Bizid = &v
	return s
}

func (s *QuerySolutionBmsRequest) SetContractId(v string) *QuerySolutionBmsRequest {
	s.ContractId = &v
	return s
}

func (s *QuerySolutionBmsRequest) SetContractName(v string) *QuerySolutionBmsRequest {
	s.ContractName = &v
	return s
}

type QuerySolutionBmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 合约oss存储url
	TempContractUrl *string `json:"temp_contract_url,omitempty" xml:"temp_contract_url,omitempty"`
}

func (s QuerySolutionBmsResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionBmsResponse) GoString() string {
	return s.String()
}

func (s *QuerySolutionBmsResponse) SetReqMsgId(v string) *QuerySolutionBmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySolutionBmsResponse) SetResultCode(v string) *QuerySolutionBmsResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySolutionBmsResponse) SetResultMsg(v string) *QuerySolutionBmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySolutionBmsResponse) SetTempContractUrl(v string) *QuerySolutionBmsResponse {
	s.TempContractUrl = &v
	return s
}

type DeploySolutionContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 链ID
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 链操作者信息
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 合约名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 提交记录ID
	CommitId *string `json:"commit_id,omitempty" xml:"commit_id,omitempty" require:"true"`
	// 当前分支
	Branch *string `json:"branch,omitempty" xml:"branch,omitempty" require:"true"`
	// 合约仓库路径
	GitRepo *string `json:"git_repo,omitempty" xml:"git_repo,omitempty" require:"true"`
}

func (s DeploySolutionContractRequest) String() string {
	return tea.Prettify(s)
}

func (s DeploySolutionContractRequest) GoString() string {
	return s.String()
}

func (s *DeploySolutionContractRequest) SetAuthToken(v string) *DeploySolutionContractRequest {
	s.AuthToken = &v
	return s
}

func (s *DeploySolutionContractRequest) SetProductInstanceId(v string) *DeploySolutionContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeploySolutionContractRequest) SetBizid(v string) *DeploySolutionContractRequest {
	s.Bizid = &v
	return s
}

func (s *DeploySolutionContractRequest) SetOperator(v string) *DeploySolutionContractRequest {
	s.Operator = &v
	return s
}

func (s *DeploySolutionContractRequest) SetContractName(v string) *DeploySolutionContractRequest {
	s.ContractName = &v
	return s
}

func (s *DeploySolutionContractRequest) SetCommitId(v string) *DeploySolutionContractRequest {
	s.CommitId = &v
	return s
}

func (s *DeploySolutionContractRequest) SetBranch(v string) *DeploySolutionContractRequest {
	s.Branch = &v
	return s
}

func (s *DeploySolutionContractRequest) SetGitRepo(v string) *DeploySolutionContractRequest {
	s.GitRepo = &v
	return s
}

type DeploySolutionContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否部署成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeploySolutionContractResponse) String() string {
	return tea.Prettify(s)
}

func (s DeploySolutionContractResponse) GoString() string {
	return s.String()
}

func (s *DeploySolutionContractResponse) SetReqMsgId(v string) *DeploySolutionContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeploySolutionContractResponse) SetResultCode(v string) *DeploySolutionContractResponse {
	s.ResultCode = &v
	return s
}

func (s *DeploySolutionContractResponse) SetResultMsg(v string) *DeploySolutionContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeploySolutionContractResponse) SetSuccess(v bool) *DeploySolutionContractResponse {
	s.Success = &v
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
				"sdk_version":      tea.String("1.3.15"),
				"_prod_code":       tea.String("APPEX"),
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
 * Description: 为用户在MyPocket创建链上账户
 * Summary: MyPocket创建链上账户
 */
func (client *Client) CreateMypocketChainaccount(request *CreateMypocketChainaccountRequest) (_result *CreateMypocketChainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMypocketChainaccountResponse{}
	_body, _err := client.CreateMypocketChainaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为用户在MyPocket创建链上账户
 * Summary: MyPocket创建链上账户
 */
func (client *Client) CreateMypocketChainaccountEx(request *CreateMypocketChainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMypocketChainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMypocketChainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.chainaccount.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户根据DID和chainID，查询区块链账户
 * Summary: 用户查询区块链账户
 */
func (client *Client) QueryMypocketChainaccount(request *QueryMypocketChainaccountRequest) (_result *QueryMypocketChainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMypocketChainaccountResponse{}
	_body, _err := client.QueryMypocketChainaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户根据DID和chainID，查询区块链账户
 * Summary: 用户查询区块链账户
 */
func (client *Client) QueryMypocketChainaccountEx(request *QueryMypocketChainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMypocketChainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypocketChainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.chainaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
 * Summary: 创建普通用户DID账户（支付宝UID）
 */
func (client *Client) CreateMypocketDidaccountbyalipay(request *CreateMypocketDidaccountbyalipayRequest) (_result *CreateMypocketDidaccountbyalipayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMypocketDidaccountbyalipayResponse{}
	_body, _err := client.CreateMypocketDidaccountbyalipayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
 * Summary: 创建普通用户DID账户（支付宝UID）
 */
func (client *Client) CreateMypocketDidaccountbyalipayEx(request *CreateMypocketDidaccountbyalipayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMypocketDidaccountbyalipayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMypocketDidaccountbyalipayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.didaccountbyalipay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部DApp应用通过支付宝UID查询普通用户did
 * Summary: 查询普通用户did（支付宝UID）
 */
func (client *Client) QueryMypocketDidaccountbyalipay(request *QueryMypocketDidaccountbyalipayRequest) (_result *QueryMypocketDidaccountbyalipayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMypocketDidaccountbyalipayResponse{}
	_body, _err := client.QueryMypocketDidaccountbyalipayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部DApp应用通过支付宝UID查询普通用户did
 * Summary: 查询普通用户did（支付宝UID）
 */
func (client *Client) QueryMypocketDidaccountbyalipayEx(request *QueryMypocketDidaccountbyalipayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMypocketDidaccountbyalipayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypocketDidaccountbyalipayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.didaccountbyalipay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部DApp应用创建用户链上账户
 * Summary: 外部DApp应用创建用户链上账户
 */
func (client *Client) CreateMypocketEscrowchainaccount(request *CreateMypocketEscrowchainaccountRequest) (_result *CreateMypocketEscrowchainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMypocketEscrowchainaccountResponse{}
	_body, _err := client.CreateMypocketEscrowchainaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部DApp应用创建用户链上账户
 * Summary: 外部DApp应用创建用户链上账户
 */
func (client *Client) CreateMypocketEscrowchainaccountEx(request *CreateMypocketEscrowchainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMypocketEscrowchainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMypocketEscrowchainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.escrowchainaccount.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部DApp应用查询did在指定链上关联的账户
 * Summary: 外部查询did在指定链上关联的账户
 */
func (client *Client) QueryMypocketEscrowchainaccount(request *QueryMypocketEscrowchainaccountRequest) (_result *QueryMypocketEscrowchainaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMypocketEscrowchainaccountResponse{}
	_body, _err := client.QueryMypocketEscrowchainaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部DApp应用查询did在指定链上关联的账户
 * Summary: 外部查询did在指定链上关联的账户
 */
func (client *Client) QueryMypocketEscrowchainaccountEx(request *QueryMypocketEscrowchainaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMypocketEscrowchainaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypocketEscrowchainaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.escrowchainaccount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 验证app did签名
 * Summary: app did验签接口
 */
func (client *Client) StartMypocketAppdidsignverify(request *StartMypocketAppdidsignverifyRequest) (_result *StartMypocketAppdidsignverifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartMypocketAppdidsignverifyResponse{}
	_body, _err := client.StartMypocketAppdidsignverifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 验证app did签名
 * Summary: app did验签接口
 */
func (client *Client) StartMypocketAppdidsignverifyEx(request *StartMypocketAppdidsignverifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartMypocketAppdidsignverifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartMypocketAppdidsignverifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.appdidsignverify.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 验证user did签名
 * Summary: 验证user did签名
 */
func (client *Client) StartMypocketUserdidsignverify(request *StartMypocketUserdidsignverifyRequest) (_result *StartMypocketUserdidsignverifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartMypocketUserdidsignverifyResponse{}
	_body, _err := client.StartMypocketUserdidsignverifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 验证user did签名
 * Summary: 验证user did签名
 */
func (client *Client) StartMypocketUserdidsignverifyEx(request *StartMypocketUserdidsignverifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartMypocketUserdidsignverifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartMypocketUserdidsignverifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.userdidsignverify.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过支付宝uid查询mypocket信息
 * Summary: 查询mypocket用户信息
 */
func (client *Client) QueryMypocketUserinfo(request *QueryMypocketUserinfoRequest) (_result *QueryMypocketUserinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMypocketUserinfoResponse{}
	_body, _err := client.QueryMypocketUserinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过支付宝uid查询mypocket信息
 * Summary: 查询mypocket用户信息
 */
func (client *Client) QueryMypocketUserinfoEx(request *QueryMypocketUserinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMypocketUserinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypocketUserinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.userinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据授权信息获取用户信息字段
 * Summary: 查询用户授权信息
 */
func (client *Client) QueryMypocketUserauthinfo(request *QueryMypocketUserauthinfoRequest) (_result *QueryMypocketUserauthinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMypocketUserauthinfoResponse{}
	_body, _err := client.QueryMypocketUserauthinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据授权信息获取用户信息字段
 * Summary: 查询用户授权信息
 */
func (client *Client) QueryMypocketUserauthinfoEx(request *QueryMypocketUserauthinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMypocketUserauthinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMypocketUserauthinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.userauthinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建小程序码来请求账户列表
 * Summary: 创建小程序码请求账户列表
 */
func (client *Client) CreateMypocketQrcoderequestaccounts(request *CreateMypocketQrcoderequestaccountsRequest) (_result *CreateMypocketQrcoderequestaccountsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMypocketQrcoderequestaccountsResponse{}
	_body, _err := client.CreateMypocketQrcoderequestaccountsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建小程序码来请求账户列表
 * Summary: 创建小程序码请求账户列表
 */
func (client *Client) CreateMypocketQrcoderequestaccountsEx(request *CreateMypocketQrcoderequestaccountsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMypocketQrcoderequestaccountsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMypocketQrcoderequestaccountsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.qrcoderequestaccounts.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求用户账户列表的小程序码查询结果
 * Summary: 请求用户账户列表的小程序码查询结果
 */
func (client *Client) CheckMypocketQrcoderequestaccounts(request *CheckMypocketQrcoderequestaccountsRequest) (_result *CheckMypocketQrcoderequestaccountsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckMypocketQrcoderequestaccountsResponse{}
	_body, _err := client.CheckMypocketQrcoderequestaccountsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求用户账户列表的小程序码查询结果
 * Summary: 请求用户账户列表的小程序码查询结果
 */
func (client *Client) CheckMypocketQrcoderequestaccountsEx(request *CheckMypocketQrcoderequestaccountsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckMypocketQrcoderequestaccountsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckMypocketQrcoderequestaccountsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.mypocket.qrcoderequestaccounts.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 区块链身份创建
 * Summary: 区块链身份创建
 */
func (client *Client) CreateUserDid(request *CreateUserDidRequest) (_result *CreateUserDidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserDidResponse{}
	_body, _err := client.CreateUserDidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 区块链身份创建
 * Summary: 区块链身份创建
 */
func (client *Client) CreateUserDidEx(request *CreateUserDidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserDidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserDidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.user.did.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 协作联盟创建申请
 * Summary: 协作联盟创建申请
 */
func (client *Client) CreateUnionApply(request *CreateUnionApplyRequest) (_result *CreateUnionApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUnionApplyResponse{}
	_body, _err := client.CreateUnionApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 协作联盟创建申请
 * Summary: 协作联盟创建申请
 */
func (client *Client) CreateUnionApplyEx(request *CreateUnionApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUnionApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUnionApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.apply.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 联盟创建申请审核，仅内部租户可调用
 * Summary: 联盟创建申请审核
 */
func (client *Client) ConfirmUnionApply(request *ConfirmUnionApplyRequest) (_result *ConfirmUnionApplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmUnionApplyResponse{}
	_body, _err := client.ConfirmUnionApplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 联盟创建申请审核，仅内部租户可调用
 * Summary: 联盟创建申请审核
 */
func (client *Client) ConfirmUnionApplyEx(request *ConfirmUnionApplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmUnionApplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmUnionApplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.apply.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 在联盟中创建信息通道Channel
 * Summary: 在联盟中创建信息通道Channel
 */
func (client *Client) CreateUnionChannel(request *CreateUnionChannelRequest) (_result *CreateUnionChannelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUnionChannelResponse{}
	_body, _err := client.CreateUnionChannelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 在联盟中创建信息通道Channel
 * Summary: 在联盟中创建信息通道Channel
 */
func (client *Client) CreateUnionChannelEx(request *CreateUnionChannelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUnionChannelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUnionChannelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.channel.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
 * Summary: 成员查询自己拥有访问权限的channel
 */
func (client *Client) ListUserChannel(request *ListUserChannelRequest) (_result *ListUserChannelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUserChannelResponse{}
	_body, _err := client.ListUserChannelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
 * Summary: 成员查询自己拥有访问权限的channel
 */
func (client *Client) ListUserChannelEx(request *ListUserChannelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUserChannelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUserChannelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.user.channel.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 联盟公开Channel查询
 * Summary: 联盟公开Channel查询
 */
func (client *Client) ListUnionPubchannel(request *ListUnionPubchannelRequest) (_result *ListUnionPubchannelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUnionPubchannelResponse{}
	_body, _err := client.ListUnionPubchannelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 联盟公开Channel查询
 * Summary: 联盟公开Channel查询
 */
func (client *Client) ListUnionPubchannelEx(request *ListUnionPubchannelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUnionPubchannelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUnionPubchannelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.pubchannel.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Channel授权给用户
 * Summary: Channel授权给用户
 */
func (client *Client) AuthChannelUser(request *AuthChannelUserRequest) (_result *AuthChannelUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthChannelUserResponse{}
	_body, _err := client.AuthChannelUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Channel授权给用户
 * Summary: Channel授权给用户
 */
func (client *Client) AuthChannelUserEx(request *AuthChannelUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthChannelUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthChannelUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.channel.user.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消用户访问Channel的权限
 * Summary: 取消用户访问Channel的权限
 */
func (client *Client) CancelChannelUser(request *CancelChannelUserRequest) (_result *CancelChannelUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelChannelUserResponse{}
	_body, _err := client.CancelChannelUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消用户访问Channel的权限
 * Summary: 取消用户访问Channel的权限
 */
func (client *Client) CancelChannelUserEx(request *CancelChannelUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelChannelUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelChannelUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.channel.user.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单据加密上链
 * Summary: 单据加密上链
 */
func (client *Client) CreateUnionForm(request *CreateUnionFormRequest) (_result *CreateUnionFormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUnionFormResponse{}
	_body, _err := client.CreateUnionFormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单据加密上链
 * Summary: 单据加密上链
 */
func (client *Client) CreateUnionFormEx(request *CreateUnionFormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUnionFormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUnionFormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.form.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询单个表单
 * Summary: 查询单个表单
 */
func (client *Client) QueryUnionForm(request *QueryUnionFormRequest) (_result *QueryUnionFormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUnionFormResponse{}
	_body, _err := client.QueryUnionFormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询单个表单
 * Summary: 查询单个表单
 */
func (client *Client) QueryUnionFormEx(request *QueryUnionFormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUnionFormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUnionFormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.form.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通道中用户可以访问的表单列表
 * Summary: 通道中用户可以访问的表单列表
 */
func (client *Client) ListChannelUserform(request *ListChannelUserformRequest) (_result *ListChannelUserformResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListChannelUserformResponse{}
	_body, _err := client.ListChannelUserformEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通道中用户可以访问的表单列表
 * Summary: 通道中用户可以访问的表单列表
 */
func (client *Client) ListChannelUserformEx(request *ListChannelUserformRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListChannelUserformResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListChannelUserformResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.channel.userform.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物上链，链上数字物体创建
 * Summary: 物权上链
 */
func (client *Client) CreateObject(request *CreateObjectRequest) (_result *CreateObjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateObjectResponse{}
	_body, _err := client.CreateObjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物上链，链上数字物体创建
 * Summary: 物权上链
 */
func (client *Client) CreateObjectEx(request *CreateObjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateObjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateObjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.object.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据归属权流转
 * Summary: 数据归属权流转
 */
func (client *Client) CreateObjectTransfer(request *CreateObjectTransferRequest) (_result *CreateObjectTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateObjectTransferResponse{}
	_body, _err := client.CreateObjectTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据归属权流转
 * Summary: 数据归属权流转
 */
func (client *Client) CreateObjectTransferEx(request *CreateObjectTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateObjectTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateObjectTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.object.transfer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据归属权流转记录查询
 * Summary: 数据归属权流转记录查询
 */
func (client *Client) ListObjectTransfer(request *ListObjectTransferRequest) (_result *ListObjectTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListObjectTransferResponse{}
	_body, _err := client.ListObjectTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据归属权流转记录查询
 * Summary: 数据归属权流转记录查询
 */
func (client *Client) ListObjectTransferEx(request *ListObjectTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListObjectTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListObjectTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.object.transfer.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 状态流驱动模版新增
 * Summary: 状态流驱动模版新增
 */
func (client *Client) CreateStatusflowTemplate(request *CreateStatusflowTemplateRequest) (_result *CreateStatusflowTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateStatusflowTemplateResponse{}
	_body, _err := client.CreateStatusflowTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 状态流驱动模版新增
 * Summary: 状态流驱动模版新增
 */
func (client *Client) CreateStatusflowTemplateEx(request *CreateStatusflowTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateStatusflowTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateStatusflowTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.statusflow.template.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 状态流驱动模版删除
 * Summary: 状态流驱动模版删除
 */
func (client *Client) DeleteStatusflowTemplate(request *DeleteStatusflowTemplateRequest) (_result *DeleteStatusflowTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteStatusflowTemplateResponse{}
	_body, _err := client.DeleteStatusflowTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 状态流驱动模版删除
 * Summary: 状态流驱动模版删除
 */
func (client *Client) DeleteStatusflowTemplateEx(request *DeleteStatusflowTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteStatusflowTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteStatusflowTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.statusflow.template.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 状态流驱动模版查询
 * Summary: 状态流驱动模版查询
 */
func (client *Client) QueryStatusflowTemplate(request *QueryStatusflowTemplateRequest) (_result *QueryStatusflowTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatusflowTemplateResponse{}
	_body, _err := client.QueryStatusflowTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 状态流驱动模版查询
 * Summary: 状态流驱动模版查询
 */
func (client *Client) QueryStatusflowTemplateEx(request *QueryStatusflowTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatusflowTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatusflowTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.statusflow.template.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据状态驱动
 * Summary: 数据状态驱动
 */
func (client *Client) StartDatastatusDrive(request *StartDatastatusDriveRequest) (_result *StartDatastatusDriveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartDatastatusDriveResponse{}
	_body, _err := client.StartDatastatusDriveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据状态驱动
 * Summary: 数据状态驱动
 */
func (client *Client) StartDatastatusDriveEx(request *StartDatastatusDriveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartDatastatusDriveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartDatastatusDriveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.datastatus.drive.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据状态流转记录
 * Summary: 查询数据状态流转记录
 */
func (client *Client) ListDatastatusDrive(request *ListDatastatusDriveRequest) (_result *ListDatastatusDriveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDatastatusDriveResponse{}
	_body, _err := client.ListDatastatusDriveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据状态流转记录
 * Summary: 查询数据状态流转记录
 */
func (client *Client) ListDatastatusDriveEx(request *ListDatastatusDriveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDatastatusDriveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDatastatusDriveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.datastatus.drive.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
 * Summary: 单据加密异步上链
 */
func (client *Client) CreateAsynformForm(request *CreateAsynformFormRequest) (_result *CreateAsynformFormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAsynformFormResponse{}
	_body, _err := client.CreateAsynformFormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
 * Summary: 单据加密异步上链
 */
func (client *Client) CreateAsynformFormEx(request *CreateAsynformFormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAsynformFormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAsynformFormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.asynform.form.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
 * Summary: 单据分页查询
 */
func (client *Client) PagequeryUnionForm(request *PagequeryUnionFormRequest) (_result *PagequeryUnionFormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryUnionFormResponse{}
	_body, _err := client.PagequeryUnionFormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
 * Summary: 单据分页查询
 */
func (client *Client) PagequeryUnionFormEx(request *PagequeryUnionFormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryUnionFormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryUnionFormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.union.form.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
 * Summary: 单据上链状态查询
 */
func (client *Client) QueryAsynformStatus(request *QueryAsynformStatusRequest) (_result *QueryAsynformStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAsynformStatusResponse{}
	_body, _err := client.QueryAsynformStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
 * Summary: 单据上链状态查询
 */
func (client *Client) QueryAsynformStatusEx(request *QueryAsynformStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAsynformStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAsynformStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.asynform.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 结构化存证查询
 * Summary: 结构化存证查询
 */
func (client *Client) QuerySolutionFastnotary(request *QuerySolutionFastnotaryRequest) (_result *QuerySolutionFastnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySolutionFastnotaryResponse{}
	_body, _err := client.QuerySolutionFastnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 结构化存证查询
 * Summary: 结构化存证查询
 */
func (client *Client) QuerySolutionFastnotaryEx(request *QuerySolutionFastnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySolutionFastnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySolutionFastnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.fastnotary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起结构化存证
 * Summary: 发起结构化存证
 */
func (client *Client) SaveSolutionFastnotary(request *SaveSolutionFastnotaryRequest) (_result *SaveSolutionFastnotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveSolutionFastnotaryResponse{}
	_body, _err := client.SaveSolutionFastnotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起结构化存证
 * Summary: 发起结构化存证
 */
func (client *Client) SaveSolutionFastnotaryEx(request *SaveSolutionFastnotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveSolutionFastnotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveSolutionFastnotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.fastnotary.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 初始化文件存证
 * Summary: 初始化文件存证
 */
func (client *Client) InitSolutionFilenotary(request *InitSolutionFilenotaryRequest) (_result *InitSolutionFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitSolutionFilenotaryResponse{}
	_body, _err := client.InitSolutionFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 初始化文件存证
 * Summary: 初始化文件存证
 */
func (client *Client) InitSolutionFilenotaryEx(request *InitSolutionFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitSolutionFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitSolutionFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.filenotary.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知文件上传完成
 * Summary: 通知文件上传完成
 */
func (client *Client) SyncSolutionFilenotary(request *SyncSolutionFilenotaryRequest) (_result *SyncSolutionFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncSolutionFilenotaryResponse{}
	_body, _err := client.SyncSolutionFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知文件上传完成
 * Summary: 通知文件上传完成
 */
func (client *Client) SyncSolutionFilenotaryEx(request *SyncSolutionFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncSolutionFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncSolutionFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.filenotary.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取文件存证的状态
 * Summary: 获取文件存证的状态
 */
func (client *Client) GetSolutionFilenotarystatus(request *GetSolutionFilenotarystatusRequest) (_result *GetSolutionFilenotarystatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSolutionFilenotarystatusResponse{}
	_body, _err := client.GetSolutionFilenotarystatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取文件存证的状态
 * Summary: 获取文件存证的状态
 */
func (client *Client) GetSolutionFilenotarystatusEx(request *GetSolutionFilenotarystatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSolutionFilenotarystatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSolutionFilenotarystatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.filenotarystatus.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询文件存证
 * Summary: 查询文件存证
 */
func (client *Client) QuerySolutionFilenotary(request *QuerySolutionFilenotaryRequest) (_result *QuerySolutionFilenotaryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySolutionFilenotaryResponse{}
	_body, _err := client.QuerySolutionFilenotaryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询文件存证
 * Summary: 查询文件存证
 */
func (client *Client) QuerySolutionFilenotaryEx(request *QuerySolutionFilenotaryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySolutionFilenotaryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySolutionFilenotaryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.filenotary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 合约服务调用
 * Summary: 合约服务调用
 */
func (client *Client) ExecContractService(request *ExecContractServiceRequest) (_result *ExecContractServiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecContractServiceResponse{}
	_body, _err := client.ExecContractServiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 合约服务调用
 * Summary: 合约服务调用
 */
func (client *Client) ExecContractServiceEx(request *ExecContractServiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecContractServiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecContractServiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.contract.service.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 速搭平台支持openapi创建应用
 * Summary: 创建合约应用
 */
func (client *Client) InitSolutionBms(request *InitSolutionBmsRequest) (_result *InitSolutionBmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitSolutionBmsResponse{}
	_body, _err := client.InitSolutionBmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 速搭平台支持openapi创建应用
 * Summary: 创建合约应用
 */
func (client *Client) InitSolutionBmsEx(request *InitSolutionBmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitSolutionBmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitSolutionBmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.bms.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取合约临时oss url
 * Summary: 获取合约临时oss url
 */
func (client *Client) QuerySolutionBms(request *QuerySolutionBmsRequest) (_result *QuerySolutionBmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySolutionBmsResponse{}
	_body, _err := client.QuerySolutionBmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取合约临时oss url
 * Summary: 获取合约临时oss url
 */
func (client *Client) QuerySolutionBmsEx(request *QuerySolutionBmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySolutionBmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySolutionBmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.bms.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用速搭平台部署合约接口
 * Summary: 应用速搭平台部署合约接口
 */
func (client *Client) DeploySolutionContract(request *DeploySolutionContractRequest) (_result *DeploySolutionContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeploySolutionContractResponse{}
	_body, _err := client.DeploySolutionContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用速搭平台部署合约接口
 * Summary: 应用速搭平台部署合约接口
 */
func (client *Client) DeploySolutionContractEx(request *DeploySolutionContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeploySolutionContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeploySolutionContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.appex.solution.contract.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
