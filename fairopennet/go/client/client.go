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

// 静态DSL
type StaticDsl struct {
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	//
	ConsentOn *bool `json:"consent_on,omitempty" xml:"consent_on,omitempty" require:"true"`
	//
	Parameters *string `json:"parameters,omitempty" xml:"parameters,omitempty" require:"true"`
}

func (s StaticDsl) String() string {
	return tea.Prettify(s)
}

func (s StaticDsl) GoString() string {
	return s.String()
}

func (s *StaticDsl) SetSpaceId(v string) *StaticDsl {
	s.SpaceId = &v
	return s
}

func (s *StaticDsl) SetFlowId(v string) *StaticDsl {
	s.FlowId = &v
	return s
}

func (s *StaticDsl) SetConsentOn(v bool) *StaticDsl {
	s.ConsentOn = &v
	return s
}

func (s *StaticDsl) SetParameters(v string) *StaticDsl {
	s.Parameters = &v
	return s
}

// 动态工作流配置
type DynamicDsl struct {
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	//
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	//
	AutoStart *bool `json:"auto_start,omitempty" xml:"auto_start,omitempty" require:"true"`
	//
	Parameters *string `json:"parameters,omitempty" xml:"parameters,omitempty" require:"true"`
}

func (s DynamicDsl) String() string {
	return tea.Prettify(s)
}

func (s DynamicDsl) GoString() string {
	return s.String()
}

func (s *DynamicDsl) SetFlowId(v string) *DynamicDsl {
	s.FlowId = &v
	return s
}

func (s *DynamicDsl) SetInstanceId(v string) *DynamicDsl {
	s.InstanceId = &v
	return s
}

func (s *DynamicDsl) SetAutoStart(v bool) *DynamicDsl {
	s.AutoStart = &v
	return s
}

func (s *DynamicDsl) SetParameters(v string) *DynamicDsl {
	s.Parameters = &v
	return s
}

// GetNetworkStatus接口输入，包含networkId
type GetNetworkStatusInput struct {
	// 网络的networkId
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
}

func (s GetNetworkStatusInput) String() string {
	return tea.Prettify(s)
}

func (s GetNetworkStatusInput) GoString() string {
	return s.String()
}

func (s *GetNetworkStatusInput) SetNetworkId(v string) *GetNetworkStatusInput {
	s.NetworkId = &v
	return s
}

// 添加协作参与方到协作空间
type AddPartyToSpaceInput struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
}

func (s AddPartyToSpaceInput) String() string {
	return tea.Prettify(s)
}

func (s AddPartyToSpaceInput) GoString() string {
	return s.String()
}

func (s *AddPartyToSpaceInput) SetNetworkId(v string) *AddPartyToSpaceInput {
	s.NetworkId = &v
	return s
}

func (s *AddPartyToSpaceInput) SetSpaceId(v string) *AddPartyToSpaceInput {
	s.SpaceId = &v
	return s
}

func (s *AddPartyToSpaceInput) SetNodeId(v string) *AddPartyToSpaceInput {
	s.NodeId = &v
	return s
}

func (s *AddPartyToSpaceInput) SetPartyId(v string) *AddPartyToSpaceInput {
	s.PartyId = &v
	return s
}

//
type Cnet struct {
	//
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	//
	BlockchainNum *string `json:"blockchain_num,omitempty" xml:"blockchain_num,omitempty" require:"true"`
	//
	MyNormalNodeId *string `json:"my_normal_node_id,omitempty" xml:"my_normal_node_id,omitempty" require:"true"`
	//
	GovernanceContract *string `json:"governance_contract,omitempty" xml:"governance_contract,omitempty" require:"true"`
	//
	MyRole *string `json:"my_role,omitempty" xml:"my_role,omitempty" require:"true"`
	//
	PartyList []*string `json:"party_list,omitempty" xml:"party_list,omitempty" require:"true" type:"Repeated"`
}

func (s Cnet) String() string {
	return tea.Prettify(s)
}

func (s Cnet) GoString() string {
	return s.String()
}

func (s *Cnet) SetId(v string) *Cnet {
	s.Id = &v
	return s
}

func (s *Cnet) SetBlockchainNum(v string) *Cnet {
	s.BlockchainNum = &v
	return s
}

func (s *Cnet) SetMyNormalNodeId(v string) *Cnet {
	s.MyNormalNodeId = &v
	return s
}

func (s *Cnet) SetGovernanceContract(v string) *Cnet {
	s.GovernanceContract = &v
	return s
}

func (s *Cnet) SetMyRole(v string) *Cnet {
	s.MyRole = &v
	return s
}

func (s *Cnet) SetPartyList(v []*string) *Cnet {
	s.PartyList = v
	return s
}

// 工作流动态配置
type DynamicFlowConfig struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	Dsl *DynamicDsl `json:"dsl,omitempty" xml:"dsl,omitempty" require:"true"`
}

func (s DynamicFlowConfig) String() string {
	return tea.Prettify(s)
}

func (s DynamicFlowConfig) GoString() string {
	return s.String()
}

func (s *DynamicFlowConfig) SetNetworkId(v string) *DynamicFlowConfig {
	s.NetworkId = &v
	return s
}

func (s *DynamicFlowConfig) SetSpaceId(v string) *DynamicFlowConfig {
	s.SpaceId = &v
	return s
}

func (s *DynamicFlowConfig) SetDsl(v *DynamicDsl) *DynamicFlowConfig {
	s.Dsl = v
	return s
}

// 工作流静态配置
type StaticFlowConfig struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	Dsl *StaticDsl `json:"dsl,omitempty" xml:"dsl,omitempty" require:"true"`
}

func (s StaticFlowConfig) String() string {
	return tea.Prettify(s)
}

func (s StaticFlowConfig) GoString() string {
	return s.String()
}

func (s *StaticFlowConfig) SetNetworkId(v string) *StaticFlowConfig {
	s.NetworkId = &v
	return s
}

func (s *StaticFlowConfig) SetDsl(v *StaticDsl) *StaticFlowConfig {
	s.Dsl = v
	return s
}

// 初始化客户端配置，提供到FAIR节点的连接配置
type FairComputeClientConfig struct {
	// 服务host
	Host *string `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// 服务端口
	Port *int64 `json:"port,omitempty" xml:"port,omitempty" require:"true"`
	// TLS连接配置【暂不支持】
	SslCertChain *string `json:"ssl_cert_chain,omitempty" xml:"ssl_cert_chain,omitempty"`
	// TLS连接配置【暂不支持】
	SslPrivateKey *string `json:"ssl_private_key,omitempty" xml:"ssl_private_key,omitempty"`
	// TLS连接配置【暂不支持】
	SslTrustCertCollection *string `json:"ssl_trust_cert_collection,omitempty" xml:"ssl_trust_cert_collection,omitempty"`
	// TLS连接配置【暂不支持】
	SslAuthority *string `json:"ssl_authority,omitempty" xml:"ssl_authority,omitempty"`
}

func (s FairComputeClientConfig) String() string {
	return tea.Prettify(s)
}

func (s FairComputeClientConfig) GoString() string {
	return s.String()
}

func (s *FairComputeClientConfig) SetHost(v string) *FairComputeClientConfig {
	s.Host = &v
	return s
}

func (s *FairComputeClientConfig) SetPort(v int64) *FairComputeClientConfig {
	s.Port = &v
	return s
}

func (s *FairComputeClientConfig) SetSslCertChain(v string) *FairComputeClientConfig {
	s.SslCertChain = &v
	return s
}

func (s *FairComputeClientConfig) SetSslPrivateKey(v string) *FairComputeClientConfig {
	s.SslPrivateKey = &v
	return s
}

func (s *FairComputeClientConfig) SetSslTrustCertCollection(v string) *FairComputeClientConfig {
	s.SslTrustCertCollection = &v
	return s
}

func (s *FairComputeClientConfig) SetSslAuthority(v string) *FairComputeClientConfig {
	s.SslAuthority = &v
	return s
}

// 新建协作空间入参
type CreateSpaceInput struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
}

func (s CreateSpaceInput) String() string {
	return tea.Prettify(s)
}

func (s CreateSpaceInput) GoString() string {
	return s.String()
}

func (s *CreateSpaceInput) SetNetworkId(v string) *CreateSpaceInput {
	s.NetworkId = &v
	return s
}

func (s *CreateSpaceInput) SetSpaceId(v string) *CreateSpaceInput {
	s.SpaceId = &v
	return s
}

// 普通节点身份信息，作为加入协作网络提供的材料
type NormalNodeIdentityInfo struct {
	//
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	//
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty" require:"true"`
}

func (s NormalNodeIdentityInfo) String() string {
	return tea.Prettify(s)
}

func (s NormalNodeIdentityInfo) GoString() string {
	return s.String()
}

func (s *NormalNodeIdentityInfo) SetNodeId(v string) *NormalNodeIdentityInfo {
	s.NodeId = &v
	return s
}

func (s *NormalNodeIdentityInfo) SetIdentityInfo(v string) *NormalNodeIdentityInfo {
	s.IdentityInfo = &v
	return s
}

// 参与方信息
type PartyInfo struct {
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	//
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	//
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty" require:"true"`
	//
	PrivateKeyPasswd *string `json:"private_key_passwd,omitempty" xml:"private_key_passwd,omitempty" require:"true"`
	//
	RecoverKey *string `json:"recover_key,omitempty" xml:"recover_key,omitempty" require:"true"`
	//
	RecoveryKeyPasswd *string `json:"recovery_key_passwd,omitempty" xml:"recovery_key_passwd,omitempty" require:"true"`
}

func (s PartyInfo) String() string {
	return tea.Prettify(s)
}

func (s PartyInfo) GoString() string {
	return s.String()
}

func (s *PartyInfo) SetPartyId(v string) *PartyInfo {
	s.PartyId = &v
	return s
}

func (s *PartyInfo) SetDesc(v string) *PartyInfo {
	s.Desc = &v
	return s
}

func (s *PartyInfo) SetPrivateKey(v string) *PartyInfo {
	s.PrivateKey = &v
	return s
}

func (s *PartyInfo) SetPrivateKeyPasswd(v string) *PartyInfo {
	s.PrivateKeyPasswd = &v
	return s
}

func (s *PartyInfo) SetRecoverKey(v string) *PartyInfo {
	s.RecoverKey = &v
	return s
}

func (s *PartyInfo) SetRecoveryKeyPasswd(v string) *PartyInfo {
	s.RecoveryKeyPasswd = &v
	return s
}

// 工作流实例的定位符
type FlowInstanceLocator struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	//
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s FlowInstanceLocator) String() string {
	return tea.Prettify(s)
}

func (s FlowInstanceLocator) GoString() string {
	return s.String()
}

func (s *FlowInstanceLocator) SetNetworkId(v string) *FlowInstanceLocator {
	s.NetworkId = &v
	return s
}

func (s *FlowInstanceLocator) SetSpaceId(v string) *FlowInstanceLocator {
	s.SpaceId = &v
	return s
}

func (s *FlowInstanceLocator) SetFlowId(v string) *FlowInstanceLocator {
	s.FlowId = &v
	return s
}

func (s *FlowInstanceLocator) SetInstanceId(v string) *FlowInstanceLocator {
	s.InstanceId = &v
	return s
}

// 测试结构体
type TestStruct struct {
	// 测试名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 消息体
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
}

func (s TestStruct) String() string {
	return tea.Prettify(s)
}

func (s TestStruct) GoString() string {
	return s.String()
}

func (s *TestStruct) SetName(v string) *TestStruct {
	s.Name = &v
	return s
}

func (s *TestStruct) SetMsg(v string) *TestStruct {
	s.Msg = &v
	return s
}

// 工作流执行状态
type FlowInstanceStatus struct {
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	//
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	//
	ConsentOn *bool `json:"consent_on,omitempty" xml:"consent_on,omitempty" require:"true"`
	//
	AutoStart *bool `json:"auto_start,omitempty" xml:"auto_start,omitempty" require:"true"`
	//
	StaticParameters *string `json:"static_parameters,omitempty" xml:"static_parameters,omitempty" require:"true"`
	//
	DynamicParameters *string `json:"dynamic_parameters,omitempty" xml:"dynamic_parameters,omitempty" require:"true"`
	//
	TotalComponents *int64 `json:"total_components,omitempty" xml:"total_components,omitempty" require:"true"`
	//
	CompletedComponents *int64 `json:"completed_components,omitempty" xml:"completed_components,omitempty" require:"true"`
	//
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	//
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
	//
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s FlowInstanceStatus) String() string {
	return tea.Prettify(s)
}

func (s FlowInstanceStatus) GoString() string {
	return s.String()
}

func (s *FlowInstanceStatus) SetSpaceId(v string) *FlowInstanceStatus {
	s.SpaceId = &v
	return s
}

func (s *FlowInstanceStatus) SetFlowId(v string) *FlowInstanceStatus {
	s.FlowId = &v
	return s
}

func (s *FlowInstanceStatus) SetInstanceId(v string) *FlowInstanceStatus {
	s.InstanceId = &v
	return s
}

func (s *FlowInstanceStatus) SetConsentOn(v bool) *FlowInstanceStatus {
	s.ConsentOn = &v
	return s
}

func (s *FlowInstanceStatus) SetAutoStart(v bool) *FlowInstanceStatus {
	s.AutoStart = &v
	return s
}

func (s *FlowInstanceStatus) SetStaticParameters(v string) *FlowInstanceStatus {
	s.StaticParameters = &v
	return s
}

func (s *FlowInstanceStatus) SetDynamicParameters(v string) *FlowInstanceStatus {
	s.DynamicParameters = &v
	return s
}

func (s *FlowInstanceStatus) SetTotalComponents(v int64) *FlowInstanceStatus {
	s.TotalComponents = &v
	return s
}

func (s *FlowInstanceStatus) SetCompletedComponents(v int64) *FlowInstanceStatus {
	s.CompletedComponents = &v
	return s
}

func (s *FlowInstanceStatus) SetErrorCode(v string) *FlowInstanceStatus {
	s.ErrorCode = &v
	return s
}

func (s *FlowInstanceStatus) SetErrorMessage(v string) *FlowInstanceStatus {
	s.ErrorMessage = &v
	return s
}

func (s *FlowInstanceStatus) SetStatus(v int64) *FlowInstanceStatus {
	s.Status = &v
	return s
}

// getNetworkStatus接口输出
type NetworkStatusInfo struct {
	// 协作网络状态枚举类型
	NetworkStatus *string `json:"network_status,omitempty" xml:"network_status,omitempty" require:"true"`
}

func (s NetworkStatusInfo) String() string {
	return tea.Prettify(s)
}

func (s NetworkStatusInfo) GoString() string {
	return s.String()
}

func (s *NetworkStatusInfo) SetNetworkStatus(v string) *NetworkStatusInfo {
	s.NetworkStatus = &v
	return s
}

// 协作网络治理节点批准普通节点加入后返回给普通节点的信息
type NetworkEntranceInfo struct {
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	EntranceInfo *string `json:"entrance_info,omitempty" xml:"entrance_info,omitempty" require:"true"`
}

func (s NetworkEntranceInfo) String() string {
	return tea.Prettify(s)
}

func (s NetworkEntranceInfo) GoString() string {
	return s.String()
}

func (s *NetworkEntranceInfo) SetNetworkId(v string) *NetworkEntranceInfo {
	s.NetworkId = &v
	return s
}

func (s *NetworkEntranceInfo) SetEntranceInfo(v string) *NetworkEntranceInfo {
	s.EntranceInfo = &v
	return s
}

// 描述一个cube节点
type CubeNode struct {
	// 无
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// 无
	Endpoints []*string `json:"endpoints,omitempty" xml:"endpoints,omitempty" require:"true" type:"Repeated"`
	//
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	//
	NodeIdHash *string `json:"node_id_hash,omitempty" xml:"node_id_hash,omitempty" require:"true"`
	//
	NodePublicKey *string `json:"node_public_key,omitempty" xml:"node_public_key,omitempty" require:"true"`
	//
	IsConnected *bool `json:"is_connected,omitempty" xml:"is_connected,omitempty" require:"true"`
	//
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s CubeNode) String() string {
	return tea.Prettify(s)
}

func (s CubeNode) GoString() string {
	return s.String()
}

func (s *CubeNode) SetDomain(v string) *CubeNode {
	s.Domain = &v
	return s
}

func (s *CubeNode) SetEndpoints(v []*string) *CubeNode {
	s.Endpoints = v
	return s
}

func (s *CubeNode) SetNodeId(v string) *CubeNode {
	s.NodeId = &v
	return s
}

func (s *CubeNode) SetNodeIdHash(v string) *CubeNode {
	s.NodeIdHash = &v
	return s
}

func (s *CubeNode) SetNodePublicKey(v string) *CubeNode {
	s.NodePublicKey = &v
	return s
}

func (s *CubeNode) SetIsConnected(v bool) *CubeNode {
	s.IsConnected = &v
	return s
}

func (s *CubeNode) SetType(v int64) *CubeNode {
	s.Type = &v
	return s
}

// 如果非治理模式启动，返回错误码
type GetGovernanceModuleNetworkIdOutput struct {
	// networkID
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
}

func (s GetGovernanceModuleNetworkIdOutput) String() string {
	return tea.Prettify(s)
}

func (s GetGovernanceModuleNetworkIdOutput) GoString() string {
	return s.String()
}

func (s *GetGovernanceModuleNetworkIdOutput) SetNetworkId(v string) *GetGovernanceModuleNetworkIdOutput {
	s.NetworkId = &v
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

type StartTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// TestApi入参
	Data *TestStruct `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 额外字段
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s StartTestRequest) String() string {
	return tea.Prettify(s)
}

func (s StartTestRequest) GoString() string {
	return s.String()
}

func (s *StartTestRequest) SetAuthToken(v string) *StartTestRequest {
	s.AuthToken = &v
	return s
}

func (s *StartTestRequest) SetProductInstanceId(v string) *StartTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartTestRequest) SetData(v *TestStruct) *StartTestRequest {
	s.Data = v
	return s
}

func (s *StartTestRequest) SetExtra(v string) *StartTestRequest {
	s.Extra = &v
	return s
}

type StartTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StartTestResponse) String() string {
	return tea.Prettify(s)
}

func (s StartTestResponse) GoString() string {
	return s.String()
}

func (s *StartTestResponse) SetReqMsgId(v string) *StartTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartTestResponse) SetResultCode(v string) *StartTestResponse {
	s.ResultCode = &v
	return s
}

func (s *StartTestResponse) SetResultMsg(v string) *StartTestResponse {
	s.ResultMsg = &v
	return s
}

type InitClientConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Config *FairComputeClientConfig `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s InitClientConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s InitClientConfigRequest) GoString() string {
	return s.String()
}

func (s *InitClientConfigRequest) SetAuthToken(v string) *InitClientConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *InitClientConfigRequest) SetProductInstanceId(v string) *InitClientConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitClientConfigRequest) SetConfig(v *FairComputeClientConfig) *InitClientConfigRequest {
	s.Config = v
	return s
}

func (s *InitClientConfigRequest) SetExtra(v string) *InitClientConfigRequest {
	s.Extra = &v
	return s
}

type InitClientConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitClientConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s InitClientConfigResponse) GoString() string {
	return s.String()
}

func (s *InitClientConfigResponse) SetReqMsgId(v string) *InitClientConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitClientConfigResponse) SetResultCode(v string) *InitClientConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *InitClientConfigResponse) SetResultMsg(v string) *InitClientConfigResponse {
	s.ResultMsg = &v
	return s
}

type StartClientRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s StartClientRequest) String() string {
	return tea.Prettify(s)
}

func (s StartClientRequest) GoString() string {
	return s.String()
}

func (s *StartClientRequest) SetAuthToken(v string) *StartClientRequest {
	s.AuthToken = &v
	return s
}

func (s *StartClientRequest) SetProductInstanceId(v string) *StartClientRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartClientRequest) SetExtra(v string) *StartClientRequest {
	s.Extra = &v
	return s
}

type StartClientResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StartClientResponse) String() string {
	return tea.Prettify(s)
}

func (s StartClientResponse) GoString() string {
	return s.String()
}

func (s *StartClientResponse) SetReqMsgId(v string) *StartClientResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartClientResponse) SetResultCode(v string) *StartClientResponse {
	s.ResultCode = &v
	return s
}

func (s *StartClientResponse) SetResultMsg(v string) *StartClientResponse {
	s.ResultMsg = &v
	return s
}

type GetGovernancemoduleNetworkidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetGovernancemoduleNetworkidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGovernancemoduleNetworkidRequest) GoString() string {
	return s.String()
}

func (s *GetGovernancemoduleNetworkidRequest) SetAuthToken(v string) *GetGovernancemoduleNetworkidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGovernancemoduleNetworkidRequest) SetProductInstanceId(v string) *GetGovernancemoduleNetworkidRequest {
	s.ProductInstanceId = &v
	return s
}

type GetGovernancemoduleNetworkidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty"`
}

func (s GetGovernancemoduleNetworkidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGovernancemoduleNetworkidResponse) GoString() string {
	return s.String()
}

func (s *GetGovernancemoduleNetworkidResponse) SetReqMsgId(v string) *GetGovernancemoduleNetworkidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGovernancemoduleNetworkidResponse) SetResultCode(v string) *GetGovernancemoduleNetworkidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGovernancemoduleNetworkidResponse) SetResultMsg(v string) *GetGovernancemoduleNetworkidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGovernancemoduleNetworkidResponse) SetNetworkId(v string) *GetGovernancemoduleNetworkidResponse {
	s.NetworkId = &v
	return s
}

type GetNetworkStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
}

func (s GetNetworkStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s GetNetworkStatusRequest) GoString() string {
	return s.String()
}

func (s *GetNetworkStatusRequest) SetAuthToken(v string) *GetNetworkStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *GetNetworkStatusRequest) SetProductInstanceId(v string) *GetNetworkStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetNetworkStatusRequest) SetNetworkId(v string) *GetNetworkStatusRequest {
	s.NetworkId = &v
	return s
}

type GetNetworkStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	NetworkStatusInfo *NetworkStatusInfo `json:"network_status_info,omitempty" xml:"network_status_info,omitempty"`
}

func (s GetNetworkStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s GetNetworkStatusResponse) GoString() string {
	return s.String()
}

func (s *GetNetworkStatusResponse) SetReqMsgId(v string) *GetNetworkStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetNetworkStatusResponse) SetResultCode(v string) *GetNetworkStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *GetNetworkStatusResponse) SetResultMsg(v string) *GetNetworkStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetNetworkStatusResponse) SetNetworkStatusInfo(v *NetworkStatusInfo) *GetNetworkStatusResponse {
	s.NetworkStatusInfo = v
	return s
}

type GetMycubenodeInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetMycubenodeInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMycubenodeInfoRequest) GoString() string {
	return s.String()
}

func (s *GetMycubenodeInfoRequest) SetAuthToken(v string) *GetMycubenodeInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMycubenodeInfoRequest) SetProductInstanceId(v string) *GetMycubenodeInfoRequest {
	s.ProductInstanceId = &v
	return s
}

type GetMycubenodeInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	CubeNode *CubeNode `json:"cube_node,omitempty" xml:"cube_node,omitempty"`
}

func (s GetMycubenodeInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMycubenodeInfoResponse) GoString() string {
	return s.String()
}

func (s *GetMycubenodeInfoResponse) SetReqMsgId(v string) *GetMycubenodeInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMycubenodeInfoResponse) SetResultCode(v string) *GetMycubenodeInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMycubenodeInfoResponse) SetResultMsg(v string) *GetMycubenodeInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMycubenodeInfoResponse) SetCubeNode(v *CubeNode) *GetMycubenodeInfoResponse {
	s.CubeNode = v
	return s
}

type AddTrustedcubenodeInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	CubeNode *CubeNode `json:"cube_node,omitempty" xml:"cube_node,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty" require:"true"`
}

func (s AddTrustedcubenodeInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTrustedcubenodeInfoRequest) GoString() string {
	return s.String()
}

func (s *AddTrustedcubenodeInfoRequest) SetAuthToken(v string) *AddTrustedcubenodeInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTrustedcubenodeInfoRequest) SetProductInstanceId(v string) *AddTrustedcubenodeInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddTrustedcubenodeInfoRequest) SetCubeNode(v *CubeNode) *AddTrustedcubenodeInfoRequest {
	s.CubeNode = v
	return s
}

func (s *AddTrustedcubenodeInfoRequest) SetExtra(v string) *AddTrustedcubenodeInfoRequest {
	s.Extra = &v
	return s
}

type AddTrustedcubenodeInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddTrustedcubenodeInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTrustedcubenodeInfoResponse) GoString() string {
	return s.String()
}

func (s *AddTrustedcubenodeInfoResponse) SetReqMsgId(v string) *AddTrustedcubenodeInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTrustedcubenodeInfoResponse) SetResultCode(v string) *AddTrustedcubenodeInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTrustedcubenodeInfoResponse) SetResultMsg(v string) *AddTrustedcubenodeInfoResponse {
	s.ResultMsg = &v
	return s
}

type RegisterNormalNodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Info *NormalNodeIdentityInfo `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s RegisterNormalNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterNormalNodeRequest) GoString() string {
	return s.String()
}

func (s *RegisterNormalNodeRequest) SetAuthToken(v string) *RegisterNormalNodeRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterNormalNodeRequest) SetProductInstanceId(v string) *RegisterNormalNodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterNormalNodeRequest) SetInfo(v *NormalNodeIdentityInfo) *RegisterNormalNodeRequest {
	s.Info = v
	return s
}

func (s *RegisterNormalNodeRequest) SetExtra(v string) *RegisterNormalNodeRequest {
	s.Extra = &v
	return s
}

type RegisterNormalNodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	NetworkEntranceInfo *NetworkEntranceInfo `json:"network_entrance_info,omitempty" xml:"network_entrance_info,omitempty"`
}

func (s RegisterNormalNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterNormalNodeResponse) GoString() string {
	return s.String()
}

func (s *RegisterNormalNodeResponse) SetReqMsgId(v string) *RegisterNormalNodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterNormalNodeResponse) SetResultCode(v string) *RegisterNormalNodeResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterNormalNodeResponse) SetResultMsg(v string) *RegisterNormalNodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterNormalNodeResponse) SetNetworkEntranceInfo(v *NetworkEntranceInfo) *RegisterNormalNodeResponse {
	s.NetworkEntranceInfo = v
	return s
}

type CreateSpaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
}

func (s CreateSpaceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSpaceRequest) GoString() string {
	return s.String()
}

func (s *CreateSpaceRequest) SetAuthToken(v string) *CreateSpaceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSpaceRequest) SetProductInstanceId(v string) *CreateSpaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSpaceRequest) SetNetworkId(v string) *CreateSpaceRequest {
	s.NetworkId = &v
	return s
}

func (s *CreateSpaceRequest) SetSpaceId(v string) *CreateSpaceRequest {
	s.SpaceId = &v
	return s
}

type CreateSpaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateSpaceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSpaceResponse) GoString() string {
	return s.String()
}

func (s *CreateSpaceResponse) SetReqMsgId(v string) *CreateSpaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSpaceResponse) SetResultCode(v string) *CreateSpaceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSpaceResponse) SetResultMsg(v string) *CreateSpaceResponse {
	s.ResultMsg = &v
	return s
}

type AddPartySpaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
}

func (s AddPartySpaceRequest) String() string {
	return tea.Prettify(s)
}

func (s AddPartySpaceRequest) GoString() string {
	return s.String()
}

func (s *AddPartySpaceRequest) SetAuthToken(v string) *AddPartySpaceRequest {
	s.AuthToken = &v
	return s
}

func (s *AddPartySpaceRequest) SetProductInstanceId(v string) *AddPartySpaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddPartySpaceRequest) SetNetworkId(v string) *AddPartySpaceRequest {
	s.NetworkId = &v
	return s
}

func (s *AddPartySpaceRequest) SetSpaceId(v string) *AddPartySpaceRequest {
	s.SpaceId = &v
	return s
}

func (s *AddPartySpaceRequest) SetNodeId(v string) *AddPartySpaceRequest {
	s.NodeId = &v
	return s
}

func (s *AddPartySpaceRequest) SetPartyId(v string) *AddPartySpaceRequest {
	s.PartyId = &v
	return s
}

type AddPartySpaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddPartySpaceResponse) String() string {
	return tea.Prettify(s)
}

func (s AddPartySpaceResponse) GoString() string {
	return s.String()
}

func (s *AddPartySpaceResponse) SetReqMsgId(v string) *AddPartySpaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddPartySpaceResponse) SetResultCode(v string) *AddPartySpaceResponse {
	s.ResultCode = &v
	return s
}

func (s *AddPartySpaceResponse) SetResultMsg(v string) *AddPartySpaceResponse {
	s.ResultMsg = &v
	return s
}

type GetNetworkSnapshotRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
}

func (s GetNetworkSnapshotRequest) String() string {
	return tea.Prettify(s)
}

func (s GetNetworkSnapshotRequest) GoString() string {
	return s.String()
}

func (s *GetNetworkSnapshotRequest) SetAuthToken(v string) *GetNetworkSnapshotRequest {
	s.AuthToken = &v
	return s
}

func (s *GetNetworkSnapshotRequest) SetProductInstanceId(v string) *GetNetworkSnapshotRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetNetworkSnapshotRequest) SetNetworkId(v string) *GetNetworkSnapshotRequest {
	s.NetworkId = &v
	return s
}

type GetNetworkSnapshotResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	Cnet *Cnet `json:"cnet,omitempty" xml:"cnet,omitempty"`
}

func (s GetNetworkSnapshotResponse) String() string {
	return tea.Prettify(s)
}

func (s GetNetworkSnapshotResponse) GoString() string {
	return s.String()
}

func (s *GetNetworkSnapshotResponse) SetReqMsgId(v string) *GetNetworkSnapshotResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetNetworkSnapshotResponse) SetResultCode(v string) *GetNetworkSnapshotResponse {
	s.ResultCode = &v
	return s
}

func (s *GetNetworkSnapshotResponse) SetResultMsg(v string) *GetNetworkSnapshotResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetNetworkSnapshotResponse) SetCnet(v *Cnet) *GetNetworkSnapshotResponse {
	s.Cnet = v
	return s
}

type StopClientRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s StopClientRequest) String() string {
	return tea.Prettify(s)
}

func (s StopClientRequest) GoString() string {
	return s.String()
}

func (s *StopClientRequest) SetAuthToken(v string) *StopClientRequest {
	s.AuthToken = &v
	return s
}

func (s *StopClientRequest) SetProductInstanceId(v string) *StopClientRequest {
	s.ProductInstanceId = &v
	return s
}

type StopClientResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StopClientResponse) String() string {
	return tea.Prettify(s)
}

func (s StopClientResponse) GoString() string {
	return s.String()
}

func (s *StopClientResponse) SetReqMsgId(v string) *StopClientResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopClientResponse) SetResultCode(v string) *StopClientResponse {
	s.ResultCode = &v
	return s
}

func (s *StopClientResponse) SetResultMsg(v string) *StopClientResponse {
	s.ResultMsg = &v
	return s
}

type GetNormalmoduleNodeidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetNormalmoduleNodeidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetNormalmoduleNodeidRequest) GoString() string {
	return s.String()
}

func (s *GetNormalmoduleNodeidRequest) SetAuthToken(v string) *GetNormalmoduleNodeidRequest {
	s.AuthToken = &v
	return s
}

func (s *GetNormalmoduleNodeidRequest) SetProductInstanceId(v string) *GetNormalmoduleNodeidRequest {
	s.ProductInstanceId = &v
	return s
}

type GetNormalmoduleNodeidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
}

func (s GetNormalmoduleNodeidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetNormalmoduleNodeidResponse) GoString() string {
	return s.String()
}

func (s *GetNormalmoduleNodeidResponse) SetReqMsgId(v string) *GetNormalmoduleNodeidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetNormalmoduleNodeidResponse) SetResultCode(v string) *GetNormalmoduleNodeidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetNormalmoduleNodeidResponse) SetResultMsg(v string) *GetNormalmoduleNodeidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetNormalmoduleNodeidResponse) SetNodeId(v string) *GetNormalmoduleNodeidResponse {
	s.NodeId = &v
	return s
}

type AddPartyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Info *PartyInfo `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s AddPartyRequest) String() string {
	return tea.Prettify(s)
}

func (s AddPartyRequest) GoString() string {
	return s.String()
}

func (s *AddPartyRequest) SetAuthToken(v string) *AddPartyRequest {
	s.AuthToken = &v
	return s
}

func (s *AddPartyRequest) SetProductInstanceId(v string) *AddPartyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddPartyRequest) SetInfo(v *PartyInfo) *AddPartyRequest {
	s.Info = v
	return s
}

func (s *AddPartyRequest) SetExtra(v string) *AddPartyRequest {
	s.Extra = &v
	return s
}

type AddPartyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddPartyResponse) String() string {
	return tea.Prettify(s)
}

func (s AddPartyResponse) GoString() string {
	return s.String()
}

func (s *AddPartyResponse) SetReqMsgId(v string) *AddPartyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddPartyResponse) SetResultCode(v string) *AddPartyResponse {
	s.ResultCode = &v
	return s
}

func (s *AddPartyResponse) SetResultMsg(v string) *AddPartyResponse {
	s.ResultMsg = &v
	return s
}

type GetNormalnodeIdentityinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetNormalnodeIdentityinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetNormalnodeIdentityinfoRequest) GoString() string {
	return s.String()
}

func (s *GetNormalnodeIdentityinfoRequest) SetAuthToken(v string) *GetNormalnodeIdentityinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetNormalnodeIdentityinfoRequest) SetProductInstanceId(v string) *GetNormalnodeIdentityinfoRequest {
	s.ProductInstanceId = &v
	return s
}

type GetNormalnodeIdentityinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	NormalNodeIdentityInfo *NormalNodeIdentityInfo `json:"normal_node_identity_info,omitempty" xml:"normal_node_identity_info,omitempty"`
}

func (s GetNormalnodeIdentityinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetNormalnodeIdentityinfoResponse) GoString() string {
	return s.String()
}

func (s *GetNormalnodeIdentityinfoResponse) SetReqMsgId(v string) *GetNormalnodeIdentityinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetNormalnodeIdentityinfoResponse) SetResultCode(v string) *GetNormalnodeIdentityinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetNormalnodeIdentityinfoResponse) SetResultMsg(v string) *GetNormalnodeIdentityinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetNormalnodeIdentityinfoResponse) SetNormalNodeIdentityInfo(v *NormalNodeIdentityInfo) *GetNormalnodeIdentityinfoResponse {
	s.NormalNodeIdentityInfo = v
	return s
}

type AddNetworkNormalnodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Info *NetworkEntranceInfo `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s AddNetworkNormalnodeRequest) String() string {
	return tea.Prettify(s)
}

func (s AddNetworkNormalnodeRequest) GoString() string {
	return s.String()
}

func (s *AddNetworkNormalnodeRequest) SetAuthToken(v string) *AddNetworkNormalnodeRequest {
	s.AuthToken = &v
	return s
}

func (s *AddNetworkNormalnodeRequest) SetProductInstanceId(v string) *AddNetworkNormalnodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddNetworkNormalnodeRequest) SetInfo(v *NetworkEntranceInfo) *AddNetworkNormalnodeRequest {
	s.Info = v
	return s
}

func (s *AddNetworkNormalnodeRequest) SetExtra(v string) *AddNetworkNormalnodeRequest {
	s.Extra = &v
	return s
}

type AddNetworkNormalnodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddNetworkNormalnodeResponse) String() string {
	return tea.Prettify(s)
}

func (s AddNetworkNormalnodeResponse) GoString() string {
	return s.String()
}

func (s *AddNetworkNormalnodeResponse) SetReqMsgId(v string) *AddNetworkNormalnodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddNetworkNormalnodeResponse) SetResultCode(v string) *AddNetworkNormalnodeResponse {
	s.ResultCode = &v
	return s
}

func (s *AddNetworkNormalnodeResponse) SetResultMsg(v string) *AddNetworkNormalnodeResponse {
	s.ResultMsg = &v
	return s
}

type GetAllcubenodeInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetAllcubenodeInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAllcubenodeInfoRequest) GoString() string {
	return s.String()
}

func (s *GetAllcubenodeInfoRequest) SetAuthToken(v string) *GetAllcubenodeInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAllcubenodeInfoRequest) SetProductInstanceId(v string) *GetAllcubenodeInfoRequest {
	s.ProductInstanceId = &v
	return s
}

type GetAllcubenodeInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	AllCubeNodes []*CubeNode `json:"all_cube_nodes,omitempty" xml:"all_cube_nodes,omitempty" type:"Repeated"`
}

func (s GetAllcubenodeInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAllcubenodeInfoResponse) GoString() string {
	return s.String()
}

func (s *GetAllcubenodeInfoResponse) SetReqMsgId(v string) *GetAllcubenodeInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAllcubenodeInfoResponse) SetResultCode(v string) *GetAllcubenodeInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAllcubenodeInfoResponse) SetResultMsg(v string) *GetAllcubenodeInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAllcubenodeInfoResponse) SetAllCubeNodes(v []*CubeNode) *GetAllcubenodeInfoResponse {
	s.AllCubeNodes = v
	return s
}

type ApplyPartyNetworkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	//
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
}

func (s ApplyPartyNetworkRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyPartyNetworkRequest) GoString() string {
	return s.String()
}

func (s *ApplyPartyNetworkRequest) SetAuthToken(v string) *ApplyPartyNetworkRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyPartyNetworkRequest) SetProductInstanceId(v string) *ApplyPartyNetworkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyPartyNetworkRequest) SetNetworkId(v string) *ApplyPartyNetworkRequest {
	s.NetworkId = &v
	return s
}

func (s *ApplyPartyNetworkRequest) SetPartyId(v string) *ApplyPartyNetworkRequest {
	s.PartyId = &v
	return s
}

func (s *ApplyPartyNetworkRequest) SetAccountName(v string) *ApplyPartyNetworkRequest {
	s.AccountName = &v
	return s
}

type ApplyPartyNetworkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyPartyNetworkResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyPartyNetworkResponse) GoString() string {
	return s.String()
}

func (s *ApplyPartyNetworkResponse) SetReqMsgId(v string) *ApplyPartyNetworkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyPartyNetworkResponse) SetResultCode(v string) *ApplyPartyNetworkResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyPartyNetworkResponse) SetResultMsg(v string) *ApplyPartyNetworkResponse {
	s.ResultMsg = &v
	return s
}

type CreateFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	//
	Config *StaticFlowConfig `json:"config,omitempty" xml:"config,omitempty" require:"true"`
}

func (s CreateFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFlowRequest) GoString() string {
	return s.String()
}

func (s *CreateFlowRequest) SetAuthToken(v string) *CreateFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFlowRequest) SetProductInstanceId(v string) *CreateFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFlowRequest) SetPartyId(v string) *CreateFlowRequest {
	s.PartyId = &v
	return s
}

func (s *CreateFlowRequest) SetConfig(v *StaticFlowConfig) *CreateFlowRequest {
	s.Config = v
	return s
}

type CreateFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFlowResponse) GoString() string {
	return s.String()
}

func (s *CreateFlowResponse) SetReqMsgId(v string) *CreateFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFlowResponse) SetResultCode(v string) *CreateFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFlowResponse) SetResultMsg(v string) *CreateFlowResponse {
	s.ResultMsg = &v
	return s
}

type RunFlowInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	//
	Config *DynamicFlowConfig `json:"config,omitempty" xml:"config,omitempty" require:"true"`
}

func (s RunFlowInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s RunFlowInstanceRequest) GoString() string {
	return s.String()
}

func (s *RunFlowInstanceRequest) SetAuthToken(v string) *RunFlowInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *RunFlowInstanceRequest) SetProductInstanceId(v string) *RunFlowInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunFlowInstanceRequest) SetPartyId(v string) *RunFlowInstanceRequest {
	s.PartyId = &v
	return s
}

func (s *RunFlowInstanceRequest) SetConfig(v *DynamicFlowConfig) *RunFlowInstanceRequest {
	s.Config = v
	return s
}

type RunFlowInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RunFlowInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s RunFlowInstanceResponse) GoString() string {
	return s.String()
}

func (s *RunFlowInstanceResponse) SetReqMsgId(v string) *RunFlowInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunFlowInstanceResponse) SetResultCode(v string) *RunFlowInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *RunFlowInstanceResponse) SetResultMsg(v string) *RunFlowInstanceResponse {
	s.ResultMsg = &v
	return s
}

type StopFlowinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	NetworkId *string `json:"network_id,omitempty" xml:"network_id,omitempty" require:"true"`
	//
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	//
	PartyId *string `json:"party_id,omitempty" xml:"party_id,omitempty" require:"true"`
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty" require:"true"`
	//
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s StopFlowinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s StopFlowinstanceRequest) GoString() string {
	return s.String()
}

func (s *StopFlowinstanceRequest) SetAuthToken(v string) *StopFlowinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *StopFlowinstanceRequest) SetProductInstanceId(v string) *StopFlowinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopFlowinstanceRequest) SetNetworkId(v string) *StopFlowinstanceRequest {
	s.NetworkId = &v
	return s
}

func (s *StopFlowinstanceRequest) SetSpaceId(v string) *StopFlowinstanceRequest {
	s.SpaceId = &v
	return s
}

func (s *StopFlowinstanceRequest) SetPartyId(v string) *StopFlowinstanceRequest {
	s.PartyId = &v
	return s
}

func (s *StopFlowinstanceRequest) SetFlowId(v string) *StopFlowinstanceRequest {
	s.FlowId = &v
	return s
}

func (s *StopFlowinstanceRequest) SetInstanceId(v string) *StopFlowinstanceRequest {
	s.InstanceId = &v
	return s
}

type StopFlowinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StopFlowinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s StopFlowinstanceResponse) GoString() string {
	return s.String()
}

func (s *StopFlowinstanceResponse) SetReqMsgId(v string) *StopFlowinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopFlowinstanceResponse) SetResultCode(v string) *StopFlowinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *StopFlowinstanceResponse) SetResultMsg(v string) *StopFlowinstanceResponse {
	s.ResultMsg = &v
	return s
}

type QueryFlowinstanceStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Config *FlowInstanceLocator `json:"config,omitempty" xml:"config,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s QueryFlowinstanceStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFlowinstanceStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryFlowinstanceStatusRequest) SetAuthToken(v string) *QueryFlowinstanceStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFlowinstanceStatusRequest) SetProductInstanceId(v string) *QueryFlowinstanceStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFlowinstanceStatusRequest) SetConfig(v *FlowInstanceLocator) *QueryFlowinstanceStatusRequest {
	s.Config = v
	return s
}

func (s *QueryFlowinstanceStatusRequest) SetExtra(v string) *QueryFlowinstanceStatusRequest {
	s.Extra = &v
	return s
}

type QueryFlowinstanceStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	Status *FlowInstanceStatus `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryFlowinstanceStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFlowinstanceStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryFlowinstanceStatusResponse) SetReqMsgId(v string) *QueryFlowinstanceStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFlowinstanceStatusResponse) SetResultCode(v string) *QueryFlowinstanceStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFlowinstanceStatusResponse) SetResultMsg(v string) *QueryFlowinstanceStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFlowinstanceStatusResponse) SetStatus(v *FlowInstanceStatus) *QueryFlowinstanceStatusResponse {
	s.Status = v
	return s
}

type UploadFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 扩展字段
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s UploadFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFileRequest) GoString() string {
	return s.String()
}

func (s *UploadFileRequest) SetAuthToken(v string) *UploadFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFileRequest) SetProductInstanceId(v string) *UploadFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFileRequest) SetFileObject(v io.Reader) *UploadFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadFileRequest) SetFileObjectName(v string) *UploadFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadFileRequest) SetFileId(v string) *UploadFileRequest {
	s.FileId = &v
	return s
}

func (s *UploadFileRequest) SetFileName(v string) *UploadFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadFileRequest) SetExtra(v string) *UploadFileRequest {
	s.Extra = &v
	return s
}

type UploadFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFileResponse) GoString() string {
	return s.String()
}

func (s *UploadFileResponse) SetReqMsgId(v string) *UploadFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFileResponse) SetResultCode(v string) *UploadFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFileResponse) SetResultMsg(v string) *UploadFileResponse {
	s.ResultMsg = &v
	return s
}

type DownloadFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	//
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s DownloadFileRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadFileRequest) GoString() string {
	return s.String()
}

func (s *DownloadFileRequest) SetAuthToken(v string) *DownloadFileRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadFileRequest) SetProductInstanceId(v string) *DownloadFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadFileRequest) SetFileObject(v io.Reader) *DownloadFileRequest {
	s.FileObject = v
	return s
}

func (s *DownloadFileRequest) SetFileObjectName(v string) *DownloadFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *DownloadFileRequest) SetFileId(v string) *DownloadFileRequest {
	s.FileId = &v
	return s
}

func (s *DownloadFileRequest) SetFileName(v string) *DownloadFileRequest {
	s.FileName = &v
	return s
}

func (s *DownloadFileRequest) SetExtra(v string) *DownloadFileRequest {
	s.Extra = &v
	return s
}

type DownloadFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DownloadFileResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadFileResponse) GoString() string {
	return s.String()
}

func (s *DownloadFileResponse) SetReqMsgId(v string) *DownloadFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadFileResponse) SetResultCode(v string) *DownloadFileResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadFileResponse) SetResultMsg(v string) *DownloadFileResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.3"),
				"_prod_code":       tea.String("FAIROPENNET"),
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
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) StartTest(request *StartTestRequest) (_result *StartTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartTestResponse{}
	_body, _err := client.StartTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) StartTestEx(request *StartTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.test.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 初始化客户端配置
 */
func (client *Client) InitClientConfig(request *InitClientConfigRequest) (_result *InitClientConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitClientConfigResponse{}
	_body, _err := client.InitClientConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 初始化客户端配置
 */
func (client *Client) InitClientConfigEx(request *InitClientConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitClientConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitClientConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.client.config.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 启动客户端，测试连接到FAIR节点
 * Summary: 启动客户端
 */
func (client *Client) StartClient(request *StartClientRequest) (_result *StartClientResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartClientResponse{}
	_body, _err := client.StartClientEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 启动客户端，测试连接到FAIR节点
 * Summary: 启动客户端
 */
func (client *Client) StartClientEx(request *StartClientRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartClientResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartClientResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.client.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取治理模块静态配置自启动协作网络的ID
 * Summary: 获取治理模块静态配置自启动协作网络的ID
 */
func (client *Client) GetGovernancemoduleNetworkid(request *GetGovernancemoduleNetworkidRequest) (_result *GetGovernancemoduleNetworkidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGovernancemoduleNetworkidResponse{}
	_body, _err := client.GetGovernancemoduleNetworkidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取治理模块静态配置自启动协作网络的ID
 * Summary: 获取治理模块静态配置自启动协作网络的ID
 */
func (client *Client) GetGovernancemoduleNetworkidEx(request *GetGovernancemoduleNetworkidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGovernancemoduleNetworkidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGovernancemoduleNetworkidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.governancemodule.networkid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取协作网络状态
 * Summary: 获取协作网络状态
 */
func (client *Client) GetNetworkStatus(request *GetNetworkStatusRequest) (_result *GetNetworkStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetNetworkStatusResponse{}
	_body, _err := client.GetNetworkStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取协作网络状态
 * Summary: 获取协作网络状态
 */
func (client *Client) GetNetworkStatusEx(request *GetNetworkStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetNetworkStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetNetworkStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.network.status.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取cube节点信息
 * Summary: 获取cube节点信息
 */
func (client *Client) GetMycubenodeInfo(request *GetMycubenodeInfoRequest) (_result *GetMycubenodeInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMycubenodeInfoResponse{}
	_body, _err := client.GetMycubenodeInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取cube节点信息
 * Summary: 获取cube节点信息
 */
func (client *Client) GetMycubenodeInfoEx(request *GetMycubenodeInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMycubenodeInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMycubenodeInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.mycubenode.info.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 手动添加cube节点
 * Summary: 手动添加cube节点
 */
func (client *Client) AddTrustedcubenodeInfo(request *AddTrustedcubenodeInfoRequest) (_result *AddTrustedcubenodeInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddTrustedcubenodeInfoResponse{}
	_body, _err := client.AddTrustedcubenodeInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 手动添加cube节点
 * Summary: 手动添加cube节点
 */
func (client *Client) AddTrustedcubenodeInfoEx(request *AddTrustedcubenodeInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddTrustedcubenodeInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTrustedcubenodeInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.trustedcubenode.info.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
 * Summary: 普通节点加入协作网络
 */
func (client *Client) RegisterNormalNode(request *RegisterNormalNodeRequest) (_result *RegisterNormalNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterNormalNodeResponse{}
	_body, _err := client.RegisterNormalNodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
 * Summary: 普通节点加入协作网络
 */
func (client *Client) RegisterNormalNodeEx(request *RegisterNormalNodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterNormalNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterNormalNodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.normal.node.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
 * Summary: 新建协作空间
 */
func (client *Client) CreateSpace(request *CreateSpaceRequest) (_result *CreateSpaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSpaceResponse{}
	_body, _err := client.CreateSpaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
 * Summary: 新建协作空间
 */
func (client *Client) CreateSpaceEx(request *CreateSpaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSpaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSpaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.space.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加协作参与方到协作空间
 * Summary: 添加协作参与方到协作空间
 */
func (client *Client) AddPartySpace(request *AddPartySpaceRequest) (_result *AddPartySpaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddPartySpaceResponse{}
	_body, _err := client.AddPartySpaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加协作参与方到协作空间
 * Summary: 添加协作参与方到协作空间
 */
func (client *Client) AddPartySpaceEx(request *AddPartySpaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddPartySpaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddPartySpaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.party.space.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
 * Summary: 获取协作网络快照
 */
func (client *Client) GetNetworkSnapshot(request *GetNetworkSnapshotRequest) (_result *GetNetworkSnapshotResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetNetworkSnapshotResponse{}
	_body, _err := client.GetNetworkSnapshotEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
 * Summary: 获取协作网络快照
 */
func (client *Client) GetNetworkSnapshotEx(request *GetNetworkSnapshotRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetNetworkSnapshotResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetNetworkSnapshotResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.network.snapshot.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: shutdown client
 * Summary: shutdown client
 */
func (client *Client) StopClient(request *StopClientRequest) (_result *StopClientResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopClientResponse{}
	_body, _err := client.StopClientEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: shutdown client
 * Summary: shutdown client
 */
func (client *Client) StopClientEx(request *StopClientRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopClientResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopClientResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.client.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取普通节点自身的节点ID
 * Summary: 获取普通节点自身的节点ID
 */
func (client *Client) GetNormalmoduleNodeid(request *GetNormalmoduleNodeidRequest) (_result *GetNormalmoduleNodeidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetNormalmoduleNodeidResponse{}
	_body, _err := client.GetNormalmoduleNodeidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取普通节点自身的节点ID
 * Summary: 获取普通节点自身的节点ID
 */
func (client *Client) GetNormalmoduleNodeidEx(request *GetNormalmoduleNodeidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetNormalmoduleNodeidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetNormalmoduleNodeidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.normalmodule.nodeid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
 * Summary: 添加协作参与方信息
 */
func (client *Client) AddParty(request *AddPartyRequest) (_result *AddPartyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddPartyResponse{}
	_body, _err := client.AddPartyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
 * Summary: 添加协作参与方信息
 */
func (client *Client) AddPartyEx(request *AddPartyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddPartyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddPartyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.party.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取普通节点身份信息
 * Summary: 获取普通节点身份信息
 */
func (client *Client) GetNormalnodeIdentityinfo(request *GetNormalnodeIdentityinfoRequest) (_result *GetNormalnodeIdentityinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetNormalnodeIdentityinfoResponse{}
	_body, _err := client.GetNormalnodeIdentityinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取普通节点身份信息
 * Summary: 获取普通节点身份信息
 */
func (client *Client) GetNormalnodeIdentityinfoEx(request *GetNormalnodeIdentityinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetNormalnodeIdentityinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetNormalnodeIdentityinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.normalnode.identityinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
 * Summary: 普通节点加入网络
 */
func (client *Client) AddNetworkNormalnode(request *AddNetworkNormalnodeRequest) (_result *AddNetworkNormalnodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddNetworkNormalnodeResponse{}
	_body, _err := client.AddNetworkNormalnodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
 * Summary: 普通节点加入网络
 */
func (client *Client) AddNetworkNormalnodeEx(request *AddNetworkNormalnodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddNetworkNormalnodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddNetworkNormalnodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.network.normalnode.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取所有cube节点信息
 * Summary: 获取所有cube节点信息
 */
func (client *Client) GetAllcubenodeInfo(request *GetAllcubenodeInfoRequest) (_result *GetAllcubenodeInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAllcubenodeInfoResponse{}
	_body, _err := client.GetAllcubenodeInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取所有cube节点信息
 * Summary: 获取所有cube节点信息
 */
func (client *Client) GetAllcubenodeInfoEx(request *GetAllcubenodeInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAllcubenodeInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAllcubenodeInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.allcubenode.info.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加协作参与方到一个区块链协作网络
 * Summary: 添加协作参与方到一个区块链协作网络
 */
func (client *Client) ApplyPartyNetwork(request *ApplyPartyNetworkRequest) (_result *ApplyPartyNetworkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyPartyNetworkResponse{}
	_body, _err := client.ApplyPartyNetworkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加协作参与方到一个区块链协作网络
 * Summary: 添加协作参与方到一个区块链协作网络
 */
func (client *Client) ApplyPartyNetworkEx(request *ApplyPartyNetworkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyPartyNetworkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyPartyNetworkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.party.network.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建一个工作流
 * Summary: 创建一个工作流
 */
func (client *Client) CreateFlow(request *CreateFlowRequest) (_result *CreateFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFlowResponse{}
	_body, _err := client.CreateFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建一个工作流
 * Summary: 创建一个工作流
 */
func (client *Client) CreateFlowEx(request *CreateFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.flow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运行工作流实例，提供动态配置
 * Summary: 运行工作流实例，提供动态配置
 */
func (client *Client) RunFlowInstance(request *RunFlowInstanceRequest) (_result *RunFlowInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunFlowInstanceResponse{}
	_body, _err := client.RunFlowInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运行工作流实例，提供动态配置
 * Summary: 运行工作流实例，提供动态配置
 */
func (client *Client) RunFlowInstanceEx(request *RunFlowInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunFlowInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunFlowInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.flow.instance.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 停止运行中的工作流实例
 * Summary: 停止运行中的工作流实例
 */
func (client *Client) StopFlowinstance(request *StopFlowinstanceRequest) (_result *StopFlowinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopFlowinstanceResponse{}
	_body, _err := client.StopFlowinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 停止运行中的工作流实例
 * Summary: 停止运行中的工作流实例
 */
func (client *Client) StopFlowinstanceEx(request *StopFlowinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopFlowinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopFlowinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.flowinstance.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询工作流实例状态
 * Summary: 查询工作流实例状态
 */
func (client *Client) QueryFlowinstanceStatus(request *QueryFlowinstanceStatusRequest) (_result *QueryFlowinstanceStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFlowinstanceStatusResponse{}
	_body, _err := client.QueryFlowinstanceStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询工作流实例状态
 * Summary: 查询工作流实例状态
 */
func (client *Client) QueryFlowinstanceStatusEx(request *QueryFlowinstanceStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFlowinstanceStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFlowinstanceStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.flowinstance.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传文件
 * Summary: 上传文件
 */
func (client *Client) UploadFile(request *UploadFileRequest) (_result *UploadFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFileResponse{}
	_body, _err := client.UploadFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传文件
 * Summary: 上传文件
 */
func (client *Client) UploadFileEx(request *UploadFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.fairopennet.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadFileResponse := &UploadFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadFileResponse
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
	_result = &UploadFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下载文件
 * Summary: 下载文件
 */
func (client *Client) DownloadFile(request *DownloadFileRequest) (_result *DownloadFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadFileResponse{}
	_body, _err := client.DownloadFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下载文件
 * Summary: 下载文件
 */
func (client *Client) DownloadFileEx(request *DownloadFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.fairopennet.file.download"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			downloadFileResponse := &DownloadFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = downloadFileResponse
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
	_result = &DownloadFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.fairopennet.file.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
