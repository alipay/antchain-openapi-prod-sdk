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

// 注册中心详情
type RegistryInfoVO struct {
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 注册中心标识
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty"`
	// 注册中心类型
	RegistryType *string `json:"registry_type,omitempty" xml:"registry_type,omitempty"`
	// 名称
	RegistryName *string `json:"registry_name,omitempty" xml:"registry_name,omitempty"`
	// access_key
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// secret_key
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty"`
	// 集群数量
	SysCount *int64 `json:"sys_count,omitempty" xml:"sys_count,omitempty"`
	// host
	Host []*string `json:"host,omitempty" xml:"host,omitempty" type:"Repeated"`
	// can_delete
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// port
	Port *int64 `json:"port,omitempty" xml:"port,omitempty"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// pub协议标识
	PubProtocol *string `json:"pub_protocol,omitempty" xml:"pub_protocol,omitempty"`
	// can_update
	CanUpdate *bool `json:"can_update,omitempty" xml:"can_update,omitempty"`
	// 注册中心分组
	RegistryGroup *string `json:"registry_group,omitempty" xml:"registry_group,omitempty"`
	// 协议版本
	ProtocolVersion *string `json:"protocol_version,omitempty" xml:"protocol_version,omitempty"`
	// 命名空间
	NameSpace *string `json:"name_space,omitempty" xml:"name_space,omitempty"`
	// 集群名称
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
}

func (s RegistryInfoVO) String() string {
	return tea.Prettify(s)
}

func (s RegistryInfoVO) GoString() string {
	return s.String()
}

func (s *RegistryInfoVO) SetWorkspaceId(v string) *RegistryInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *RegistryInfoVO) SetTenantId(v string) *RegistryInfoVO {
	s.TenantId = &v
	return s
}

func (s *RegistryInfoVO) SetRegistryId(v string) *RegistryInfoVO {
	s.RegistryId = &v
	return s
}

func (s *RegistryInfoVO) SetRegistryType(v string) *RegistryInfoVO {
	s.RegistryType = &v
	return s
}

func (s *RegistryInfoVO) SetRegistryName(v string) *RegistryInfoVO {
	s.RegistryName = &v
	return s
}

func (s *RegistryInfoVO) SetAccessKey(v string) *RegistryInfoVO {
	s.AccessKey = &v
	return s
}

func (s *RegistryInfoVO) SetSecretKey(v string) *RegistryInfoVO {
	s.SecretKey = &v
	return s
}

func (s *RegistryInfoVO) SetSysCount(v int64) *RegistryInfoVO {
	s.SysCount = &v
	return s
}

func (s *RegistryInfoVO) SetHost(v []*string) *RegistryInfoVO {
	s.Host = v
	return s
}

func (s *RegistryInfoVO) SetCanDelete(v bool) *RegistryInfoVO {
	s.CanDelete = &v
	return s
}

func (s *RegistryInfoVO) SetPort(v int64) *RegistryInfoVO {
	s.Port = &v
	return s
}

func (s *RegistryInfoVO) SetGmtCreate(v string) *RegistryInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *RegistryInfoVO) SetGmtModified(v string) *RegistryInfoVO {
	s.GmtModified = &v
	return s
}

func (s *RegistryInfoVO) SetOperator(v string) *RegistryInfoVO {
	s.Operator = &v
	return s
}

func (s *RegistryInfoVO) SetPubProtocol(v string) *RegistryInfoVO {
	s.PubProtocol = &v
	return s
}

func (s *RegistryInfoVO) SetCanUpdate(v bool) *RegistryInfoVO {
	s.CanUpdate = &v
	return s
}

func (s *RegistryInfoVO) SetRegistryGroup(v string) *RegistryInfoVO {
	s.RegistryGroup = &v
	return s
}

func (s *RegistryInfoVO) SetProtocolVersion(v string) *RegistryInfoVO {
	s.ProtocolVersion = &v
	return s
}

func (s *RegistryInfoVO) SetNameSpace(v string) *RegistryInfoVO {
	s.NameSpace = &v
	return s
}

func (s *RegistryInfoVO) SetClusterName(v string) *RegistryInfoVO {
	s.ClusterName = &v
	return s
}

// AuthenticationConfigVO
type AuthenticationConfigVO struct {
	// access_key
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// secret_key
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty"`
}

func (s AuthenticationConfigVO) String() string {
	return tea.Prettify(s)
}

func (s AuthenticationConfigVO) GoString() string {
	return s.String()
}

func (s *AuthenticationConfigVO) SetAccessKey(v string) *AuthenticationConfigVO {
	s.AccessKey = &v
	return s
}

func (s *AuthenticationConfigVO) SetSecretKey(v string) *AuthenticationConfigVO {
	s.SecretKey = &v
	return s
}

// SystemClusterVO
type SystemClusterVO struct {
	// api数
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 认证配置
	AuthenticationConfig *AuthenticationConfigVO `json:"authentication_config,omitempty" xml:"authentication_config,omitempty"`
	// 认证方式
	AuthenticationType *string `json:"authentication_type,omitempty" xml:"authentication_type,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 绑定的外部授权数量
	ExternalAuthCount *int64 `json:"external_auth_count,omitempty" xml:"external_auth_count,omitempty"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 系统host地址
	Host []*string `json:"host,omitempty" xml:"host,omitempty" type:"Repeated"`
	// 负载均衡策略类型
	LbType *string `json:"lb_type,omitempty" xml:"lb_type,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 端口
	Port *int64 `json:"port,omitempty" xml:"port,omitempty"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// sys_id
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	// sys_name
	SysName *string `json:"sys_name,omitempty" xml:"sys_name,omitempty"`
	// 系统类型(手工配置/sofa注册中心/zk)
	SysType *string `json:"sys_type,omitempty" xml:"sys_type,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// unique_id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// upstream_protocol
	UpstreamProtocol *string `json:"upstream_protocol,omitempty" xml:"upstream_protocol,omitempty"`
	// 下发协议的开头
	UrlType *string `json:"url_type,omitempty" xml:"url_type,omitempty"`
	// vpc_id
	VpcId *string `json:"vpc_id,omitempty" xml:"vpc_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty"`
	// registry_info
	RegistryInfo *RegistryInfoVO `json:"registry_info,omitempty" xml:"registry_info,omitempty"`
	// triple域名
	TripleHost *string `json:"triple_host,omitempty" xml:"triple_host,omitempty"`
	// need_tls
	NeedTls *bool `json:"need_tls,omitempty" xml:"need_tls,omitempty"`
	// 证书类型
	TlsType *string `json:"tls_type,omitempty" xml:"tls_type,omitempty"`
}

func (s SystemClusterVO) String() string {
	return tea.Prettify(s)
}

func (s SystemClusterVO) GoString() string {
	return s.String()
}

func (s *SystemClusterVO) SetApiCount(v int64) *SystemClusterVO {
	s.ApiCount = &v
	return s
}

func (s *SystemClusterVO) SetAuthenticationConfig(v *AuthenticationConfigVO) *SystemClusterVO {
	s.AuthenticationConfig = v
	return s
}

func (s *SystemClusterVO) SetAuthenticationType(v string) *SystemClusterVO {
	s.AuthenticationType = &v
	return s
}

func (s *SystemClusterVO) SetCanDelete(v bool) *SystemClusterVO {
	s.CanDelete = &v
	return s
}

func (s *SystemClusterVO) SetDescription(v string) *SystemClusterVO {
	s.Description = &v
	return s
}

func (s *SystemClusterVO) SetExternalAuthCount(v int64) *SystemClusterVO {
	s.ExternalAuthCount = &v
	return s
}

func (s *SystemClusterVO) SetGmtCreate(v string) *SystemClusterVO {
	s.GmtCreate = &v
	return s
}

func (s *SystemClusterVO) SetGmtModified(v string) *SystemClusterVO {
	s.GmtModified = &v
	return s
}

func (s *SystemClusterVO) SetHost(v []*string) *SystemClusterVO {
	s.Host = v
	return s
}

func (s *SystemClusterVO) SetLbType(v string) *SystemClusterVO {
	s.LbType = &v
	return s
}

func (s *SystemClusterVO) SetOperator(v string) *SystemClusterVO {
	s.Operator = &v
	return s
}

func (s *SystemClusterVO) SetPort(v int64) *SystemClusterVO {
	s.Port = &v
	return s
}

func (s *SystemClusterVO) SetInstanceId(v string) *SystemClusterVO {
	s.InstanceId = &v
	return s
}

func (s *SystemClusterVO) SetSysId(v string) *SystemClusterVO {
	s.SysId = &v
	return s
}

func (s *SystemClusterVO) SetSysName(v string) *SystemClusterVO {
	s.SysName = &v
	return s
}

func (s *SystemClusterVO) SetSysType(v string) *SystemClusterVO {
	s.SysType = &v
	return s
}

func (s *SystemClusterVO) SetTenantId(v string) *SystemClusterVO {
	s.TenantId = &v
	return s
}

func (s *SystemClusterVO) SetUniqueId(v string) *SystemClusterVO {
	s.UniqueId = &v
	return s
}

func (s *SystemClusterVO) SetUpstreamProtocol(v string) *SystemClusterVO {
	s.UpstreamProtocol = &v
	return s
}

func (s *SystemClusterVO) SetUrlType(v string) *SystemClusterVO {
	s.UrlType = &v
	return s
}

func (s *SystemClusterVO) SetVpcId(v string) *SystemClusterVO {
	s.VpcId = &v
	return s
}

func (s *SystemClusterVO) SetWorkspaceId(v string) *SystemClusterVO {
	s.WorkspaceId = &v
	return s
}

func (s *SystemClusterVO) SetRegistryId(v string) *SystemClusterVO {
	s.RegistryId = &v
	return s
}

func (s *SystemClusterVO) SetRegistryInfo(v *RegistryInfoVO) *SystemClusterVO {
	s.RegistryInfo = v
	return s
}

func (s *SystemClusterVO) SetTripleHost(v string) *SystemClusterVO {
	s.TripleHost = &v
	return s
}

func (s *SystemClusterVO) SetNeedTls(v bool) *SystemClusterVO {
	s.NeedTls = &v
	return s
}

func (s *SystemClusterVO) SetTlsType(v string) *SystemClusterVO {
	s.TlsType = &v
	return s
}

// ProtocolVO
type ProtocolVO struct {
	// 协议类型
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 端口
	Port *string `json:"port,omitempty" xml:"port,omitempty"`
}

func (s ProtocolVO) String() string {
	return tea.Prettify(s)
}

func (s ProtocolVO) GoString() string {
	return s.String()
}

func (s *ProtocolVO) SetProtocol(v string) *ProtocolVO {
	s.Protocol = &v
	return s
}

func (s *ProtocolVO) SetPort(v string) *ProtocolVO {
	s.Port = &v
	return s
}

// EncryptConfigVO
type EncryptConfigVO struct {
	// app_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 加密状态
	EncryptionStatus *string `json:"encryption_status,omitempty" xml:"encryption_status,omitempty"`
	// 加密类型
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty"`
	// key_pair
	KeyPair *string `json:"key_pair,omitempty" xml:"key_pair,omitempty"`
	// private_key
	PrivateKey *string `json:"private_key,omitempty" xml:"private_key,omitempty"`
	// pub_key
	PubKey *string `json:"pub_key,omitempty" xml:"pub_key,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s EncryptConfigVO) String() string {
	return tea.Prettify(s)
}

func (s EncryptConfigVO) GoString() string {
	return s.String()
}

func (s *EncryptConfigVO) SetAppId(v string) *EncryptConfigVO {
	s.AppId = &v
	return s
}

func (s *EncryptConfigVO) SetEncryptionStatus(v string) *EncryptConfigVO {
	s.EncryptionStatus = &v
	return s
}

func (s *EncryptConfigVO) SetEncryptType(v string) *EncryptConfigVO {
	s.EncryptType = &v
	return s
}

func (s *EncryptConfigVO) SetKeyPair(v string) *EncryptConfigVO {
	s.KeyPair = &v
	return s
}

func (s *EncryptConfigVO) SetPrivateKey(v string) *EncryptConfigVO {
	s.PrivateKey = &v
	return s
}

func (s *EncryptConfigVO) SetPubKey(v string) *EncryptConfigVO {
	s.PubKey = &v
	return s
}

func (s *EncryptConfigVO) SetWorkspaceId(v string) *EncryptConfigVO {
	s.WorkspaceId = &v
	return s
}

// RouterConfigVO
type RouterConfigVO struct {
	// argKey
	ArgKey *string `json:"arg_key,omitempty" xml:"arg_key,omitempty"`
	// argValue
	ArgValue *string `json:"arg_value,omitempty" xml:"arg_value,omitempty"`
	// matchType
	MatchType *string `json:"match_type,omitempty" xml:"match_type,omitempty"`
	// param_location
	ParamLocation *string `json:"param_location,omitempty" xml:"param_location,omitempty"`
	// router_type
	RouterType *string `json:"router_type,omitempty" xml:"router_type,omitempty"`
	// systemCluster
	SystemCluster *SystemClusterVO `json:"system_cluster,omitempty" xml:"system_cluster,omitempty"`
	// sys_id
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	// weight
	Weight *int64 `json:"weight,omitempty" xml:"weight,omitempty"`
	// interceptionRule
	InterceptionRule *string `json:"interception_rule,omitempty" xml:"interception_rule,omitempty"`
}

func (s RouterConfigVO) String() string {
	return tea.Prettify(s)
}

func (s RouterConfigVO) GoString() string {
	return s.String()
}

func (s *RouterConfigVO) SetArgKey(v string) *RouterConfigVO {
	s.ArgKey = &v
	return s
}

func (s *RouterConfigVO) SetArgValue(v string) *RouterConfigVO {
	s.ArgValue = &v
	return s
}

func (s *RouterConfigVO) SetMatchType(v string) *RouterConfigVO {
	s.MatchType = &v
	return s
}

func (s *RouterConfigVO) SetParamLocation(v string) *RouterConfigVO {
	s.ParamLocation = &v
	return s
}

func (s *RouterConfigVO) SetRouterType(v string) *RouterConfigVO {
	s.RouterType = &v
	return s
}

func (s *RouterConfigVO) SetSystemCluster(v *SystemClusterVO) *RouterConfigVO {
	s.SystemCluster = v
	return s
}

func (s *RouterConfigVO) SetSysId(v string) *RouterConfigVO {
	s.SysId = &v
	return s
}

func (s *RouterConfigVO) SetWeight(v int64) *RouterConfigVO {
	s.Weight = &v
	return s
}

func (s *RouterConfigVO) SetInterceptionRule(v string) *RouterConfigVO {
	s.InterceptionRule = &v
	return s
}

// ApiRspCodeVO
type ApiRspCodeVO struct {
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// error_msg
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// error_desc
	ErrorDesc *string `json:"error_desc,omitempty" xml:"error_desc,omitempty"`
}

func (s ApiRspCodeVO) String() string {
	return tea.Prettify(s)
}

func (s ApiRspCodeVO) GoString() string {
	return s.String()
}

func (s *ApiRspCodeVO) SetErrorCode(v string) *ApiRspCodeVO {
	s.ErrorCode = &v
	return s
}

func (s *ApiRspCodeVO) SetErrorMsg(v string) *ApiRspCodeVO {
	s.ErrorMsg = &v
	return s
}

func (s *ApiRspCodeVO) SetErrorDesc(v string) *ApiRspCodeVO {
	s.ErrorDesc = &v
	return s
}

// ApiGroupDomainVO
type ApiGroupDomainVO struct {
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// api_group_id
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// domain_name
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty"`
}

func (s ApiGroupDomainVO) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupDomainVO) GoString() string {
	return s.String()
}

func (s *ApiGroupDomainVO) SetGmtCreate(v string) *ApiGroupDomainVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiGroupDomainVO) SetGmtModified(v string) *ApiGroupDomainVO {
	s.GmtModified = &v
	return s
}

func (s *ApiGroupDomainVO) SetApiGroupId(v string) *ApiGroupDomainVO {
	s.ApiGroupId = &v
	return s
}

func (s *ApiGroupDomainVO) SetDomainName(v string) *ApiGroupDomainVO {
	s.DomainName = &v
	return s
}

// RouterInfoVO
type RouterInfoVO struct {
	// api数
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// routerConfigs
	RouterConfigs []*RouterConfigVO `json:"router_configs,omitempty" xml:"router_configs,omitempty" type:"Repeated"`
	// router_id
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	// routerName
	RouterName *string `json:"router_name,omitempty" xml:"router_name,omitempty"`
	// routerType
	RouterType *string `json:"router_type,omitempty" xml:"router_type,omitempty"`
	// upstream_protocol
	UpstreamProtocol *string `json:"upstream_protocol,omitempty" xml:"upstream_protocol,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s RouterInfoVO) String() string {
	return tea.Prettify(s)
}

func (s RouterInfoVO) GoString() string {
	return s.String()
}

func (s *RouterInfoVO) SetApiCount(v int64) *RouterInfoVO {
	s.ApiCount = &v
	return s
}

func (s *RouterInfoVO) SetCanDelete(v bool) *RouterInfoVO {
	s.CanDelete = &v
	return s
}

func (s *RouterInfoVO) SetGmtCreate(v string) *RouterInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *RouterInfoVO) SetGmtModified(v string) *RouterInfoVO {
	s.GmtModified = &v
	return s
}

func (s *RouterInfoVO) SetOperator(v string) *RouterInfoVO {
	s.Operator = &v
	return s
}

func (s *RouterInfoVO) SetRouterConfigs(v []*RouterConfigVO) *RouterInfoVO {
	s.RouterConfigs = v
	return s
}

func (s *RouterInfoVO) SetRouterId(v string) *RouterInfoVO {
	s.RouterId = &v
	return s
}

func (s *RouterInfoVO) SetRouterName(v string) *RouterInfoVO {
	s.RouterName = &v
	return s
}

func (s *RouterInfoVO) SetRouterType(v string) *RouterInfoVO {
	s.RouterType = &v
	return s
}

func (s *RouterInfoVO) SetUpstreamProtocol(v string) *RouterInfoVO {
	s.UpstreamProtocol = &v
	return s
}

func (s *RouterInfoVO) SetTenantId(v string) *RouterInfoVO {
	s.TenantId = &v
	return s
}

func (s *RouterInfoVO) SetWorkspaceId(v string) *RouterInfoVO {
	s.WorkspaceId = &v
	return s
}

// AppInfoVO
type AppInfoVO struct {
	// api_count
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// app_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// appSecret
	AppSecret *string `json:"app_secret,omitempty" xml:"app_secret,omitempty"`
	// app类型
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
	// authenticationConfig
	AuthenticationConfig *AuthenticationConfigVO `json:"authentication_config,omitempty" xml:"authentication_config,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// encryptConfig
	EncryptConfig *EncryptConfigVO `json:"encrypt_config,omitempty" xml:"encrypt_config,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AppInfoVO) String() string {
	return tea.Prettify(s)
}

func (s AppInfoVO) GoString() string {
	return s.String()
}

func (s *AppInfoVO) SetApiCount(v int64) *AppInfoVO {
	s.ApiCount = &v
	return s
}

func (s *AppInfoVO) SetAppId(v string) *AppInfoVO {
	s.AppId = &v
	return s
}

func (s *AppInfoVO) SetAppName(v string) *AppInfoVO {
	s.AppName = &v
	return s
}

func (s *AppInfoVO) SetAppSecret(v string) *AppInfoVO {
	s.AppSecret = &v
	return s
}

func (s *AppInfoVO) SetAppType(v string) *AppInfoVO {
	s.AppType = &v
	return s
}

func (s *AppInfoVO) SetAuthenticationConfig(v *AuthenticationConfigVO) *AppInfoVO {
	s.AuthenticationConfig = v
	return s
}

func (s *AppInfoVO) SetCanDelete(v bool) *AppInfoVO {
	s.CanDelete = &v
	return s
}

func (s *AppInfoVO) SetDescription(v string) *AppInfoVO {
	s.Description = &v
	return s
}

func (s *AppInfoVO) SetEncryptConfig(v *EncryptConfigVO) *AppInfoVO {
	s.EncryptConfig = v
	return s
}

func (s *AppInfoVO) SetGmtCreate(v string) *AppInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *AppInfoVO) SetGmtModified(v string) *AppInfoVO {
	s.GmtModified = &v
	return s
}

func (s *AppInfoVO) SetOperator(v string) *AppInfoVO {
	s.Operator = &v
	return s
}

func (s *AppInfoVO) SetTenantId(v string) *AppInfoVO {
	s.TenantId = &v
	return s
}

func (s *AppInfoVO) SetWorkspaceId(v string) *AppInfoVO {
	s.WorkspaceId = &v
	return s
}

// RegistryVO
type RegistryVO struct {
	// host
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
	// protocol_support
	ProtocolSupport []*ProtocolVO `json:"protocol_support,omitempty" xml:"protocol_support,omitempty" type:"Repeated"`
	// 注册中心类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s RegistryVO) String() string {
	return tea.Prettify(s)
}

func (s RegistryVO) GoString() string {
	return s.String()
}

func (s *RegistryVO) SetHost(v string) *RegistryVO {
	s.Host = &v
	return s
}

func (s *RegistryVO) SetProtocolSupport(v []*ProtocolVO) *RegistryVO {
	s.ProtocolSupport = v
	return s
}

func (s *RegistryVO) SetType(v string) *RegistryVO {
	s.Type = &v
	return s
}

// ApiParamVO
type ApiParamVO struct {
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// default_value
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// failure_demo
	FailureDemo *string `json:"failure_demo,omitempty" xml:"failure_demo,omitempty"`
	// location
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 引用的模型类型
	RefType *string `json:"ref_type,omitempty" xml:"ref_type,omitempty"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty"`
	// rsp_code_list
	RspCodeList []*ApiRspCodeVO `json:"rsp_code_list,omitempty" xml:"rsp_code_list,omitempty" type:"Repeated"`
	// success_demo
	SuccessDemo *string `json:"success_demo,omitempty" xml:"success_demo,omitempty"`
	// 数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// upstreamLocation
	UpstreamLocation *string `json:"upstream_location,omitempty" xml:"upstream_location,omitempty"`
	// upstream_name
	UpstreamName *string `json:"upstream_name,omitempty" xml:"upstream_name,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s ApiParamVO) String() string {
	return tea.Prettify(s)
}

func (s ApiParamVO) GoString() string {
	return s.String()
}

func (s *ApiParamVO) SetApiId(v string) *ApiParamVO {
	s.ApiId = &v
	return s
}

func (s *ApiParamVO) SetDefaultValue(v string) *ApiParamVO {
	s.DefaultValue = &v
	return s
}

func (s *ApiParamVO) SetDescription(v string) *ApiParamVO {
	s.Description = &v
	return s
}

func (s *ApiParamVO) SetFailureDemo(v string) *ApiParamVO {
	s.FailureDemo = &v
	return s
}

func (s *ApiParamVO) SetLocation(v string) *ApiParamVO {
	s.Location = &v
	return s
}

func (s *ApiParamVO) SetName(v string) *ApiParamVO {
	s.Name = &v
	return s
}

func (s *ApiParamVO) SetRefType(v string) *ApiParamVO {
	s.RefType = &v
	return s
}

func (s *ApiParamVO) SetRequired(v bool) *ApiParamVO {
	s.Required = &v
	return s
}

func (s *ApiParamVO) SetRspCodeList(v []*ApiRspCodeVO) *ApiParamVO {
	s.RspCodeList = v
	return s
}

func (s *ApiParamVO) SetSuccessDemo(v string) *ApiParamVO {
	s.SuccessDemo = &v
	return s
}

func (s *ApiParamVO) SetType(v string) *ApiParamVO {
	s.Type = &v
	return s
}

func (s *ApiParamVO) SetUpstreamLocation(v string) *ApiParamVO {
	s.UpstreamLocation = &v
	return s
}

func (s *ApiParamVO) SetUpstreamName(v string) *ApiParamVO {
	s.UpstreamName = &v
	return s
}

func (s *ApiParamVO) SetWorkspaceId(v string) *ApiParamVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiParamVO) SetTenantId(v string) *ApiParamVO {
	s.TenantId = &v
	return s
}

// 数据模型参数VO
type ApiModelParamVO struct {
	// 默认值
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty"`
	// 模型提交 操作
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 模型参数id（唯一标识）
	ParamId *string `json:"param_id,omitempty" xml:"param_id,omitempty"`
	// 参数名
	ParamName *string `json:"param_name,omitempty" xml:"param_name,omitempty"`
	// 参数类型
	ParamType *string `json:"param_type,omitempty" xml:"param_type,omitempty"`
	// 引用模型id
	RefModelId *string `json:"ref_model_id,omitempty" xml:"ref_model_id,omitempty"`
	// 工作空间标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ApiModelParamVO) String() string {
	return tea.Prettify(s)
}

func (s ApiModelParamVO) GoString() string {
	return s.String()
}

func (s *ApiModelParamVO) SetDefaultValue(v string) *ApiModelParamVO {
	s.DefaultValue = &v
	return s
}

func (s *ApiModelParamVO) SetDescription(v string) *ApiModelParamVO {
	s.Description = &v
	return s
}

func (s *ApiModelParamVO) SetGmtCreate(v string) *ApiModelParamVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiModelParamVO) SetGmtModified(v string) *ApiModelParamVO {
	s.GmtModified = &v
	return s
}

func (s *ApiModelParamVO) SetModelId(v string) *ApiModelParamVO {
	s.ModelId = &v
	return s
}

func (s *ApiModelParamVO) SetOperation(v string) *ApiModelParamVO {
	s.Operation = &v
	return s
}

func (s *ApiModelParamVO) SetParamId(v string) *ApiModelParamVO {
	s.ParamId = &v
	return s
}

func (s *ApiModelParamVO) SetParamName(v string) *ApiModelParamVO {
	s.ParamName = &v
	return s
}

func (s *ApiModelParamVO) SetParamType(v string) *ApiModelParamVO {
	s.ParamType = &v
	return s
}

func (s *ApiModelParamVO) SetRefModelId(v string) *ApiModelParamVO {
	s.RefModelId = &v
	return s
}

func (s *ApiModelParamVO) SetTenantId(v string) *ApiModelParamVO {
	s.TenantId = &v
	return s
}

func (s *ApiModelParamVO) SetWorkspaceId(v string) *ApiModelParamVO {
	s.WorkspaceId = &v
	return s
}

// ApiCacheKeyVO
type ApiCacheKeyVO struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// location
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
}

func (s ApiCacheKeyVO) String() string {
	return tea.Prettify(s)
}

func (s ApiCacheKeyVO) GoString() string {
	return s.String()
}

func (s *ApiCacheKeyVO) SetKey(v string) *ApiCacheKeyVO {
	s.Key = &v
	return s
}

func (s *ApiCacheKeyVO) SetLocation(v string) *ApiCacheKeyVO {
	s.Location = &v
	return s
}

// ApiGroupVO
type ApiGroupVO struct {
	// api数
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 分组标识(全局唯一)
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// 用户授权开关
	AuthUserSwitch *string `json:"auth_user_switch,omitempty" xml:"auth_user_switch,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 域名
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 分组名
	GroupName *string `json:"group_name,omitempty" xml:"group_name,omitempty"`
	// need_api_auth_user
	NeedApiAuthUser *bool `json:"need_api_auth_user,omitempty" xml:"need_api_auth_user,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 是否可操作
	OperationPermission *bool `json:"operation_permission,omitempty" xml:"operation_permission,omitempty"`
	// DEFAULT|CUSTOM
	DomainType *string `json:"domain_type,omitempty" xml:"domain_type,omitempty"`
	// 自定义域名
	DomainList []*ApiGroupDomainVO `json:"domain_list,omitempty" xml:"domain_list,omitempty" type:"Repeated"`
}

func (s ApiGroupVO) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupVO) GoString() string {
	return s.String()
}

func (s *ApiGroupVO) SetApiCount(v int64) *ApiGroupVO {
	s.ApiCount = &v
	return s
}

func (s *ApiGroupVO) SetApiGroupId(v string) *ApiGroupVO {
	s.ApiGroupId = &v
	return s
}

func (s *ApiGroupVO) SetAuthUserSwitch(v string) *ApiGroupVO {
	s.AuthUserSwitch = &v
	return s
}

func (s *ApiGroupVO) SetCanDelete(v bool) *ApiGroupVO {
	s.CanDelete = &v
	return s
}

func (s *ApiGroupVO) SetDescription(v string) *ApiGroupVO {
	s.Description = &v
	return s
}

func (s *ApiGroupVO) SetDomainName(v string) *ApiGroupVO {
	s.DomainName = &v
	return s
}

func (s *ApiGroupVO) SetGmtCreate(v string) *ApiGroupVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiGroupVO) SetGmtModified(v string) *ApiGroupVO {
	s.GmtModified = &v
	return s
}

func (s *ApiGroupVO) SetGroupName(v string) *ApiGroupVO {
	s.GroupName = &v
	return s
}

func (s *ApiGroupVO) SetNeedApiAuthUser(v bool) *ApiGroupVO {
	s.NeedApiAuthUser = &v
	return s
}

func (s *ApiGroupVO) SetOperator(v string) *ApiGroupVO {
	s.Operator = &v
	return s
}

func (s *ApiGroupVO) SetTenantId(v string) *ApiGroupVO {
	s.TenantId = &v
	return s
}

func (s *ApiGroupVO) SetWorkspaceId(v string) *ApiGroupVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiGroupVO) SetOperationPermission(v bool) *ApiGroupVO {
	s.OperationPermission = &v
	return s
}

func (s *ApiGroupVO) SetDomainType(v string) *ApiGroupVO {
	s.DomainType = &v
	return s
}

func (s *ApiGroupVO) SetDomainList(v []*ApiGroupDomainVO) *ApiGroupVO {
	s.DomainList = v
	return s
}

// AuthAppInfoVO
type AuthAppInfoVO struct {
	// api数
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 应用类型
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
	// auth_app_info_id
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// authAppType
	AuthAppType *string `json:"auth_app_type,omitempty" xml:"auth_app_type,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// subAppCompany
	SubAppCompany *string `json:"sub_app_company,omitempty" xml:"sub_app_company,omitempty"`
	// subAppDesc
	SubAppDesc *string `json:"sub_app_desc,omitempty" xml:"sub_app_desc,omitempty"`
	// 订阅方appid
	SubAppId *string `json:"sub_app_id,omitempty" xml:"sub_app_id,omitempty"`
	// sub_app_info
	SubAppInfo *AppInfoVO `json:"sub_app_info,omitempty" xml:"sub_app_info,omitempty"`
	// subTenantId
	SubTenantId *string `json:"sub_tenant_id,omitempty" xml:"sub_tenant_id,omitempty"`
	// subWorkspaceId
	SubWorkspaceId *string `json:"sub_workspace_id,omitempty" xml:"sub_workspace_id,omitempty"`
	// api标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AuthAppInfoVO) String() string {
	return tea.Prettify(s)
}

func (s AuthAppInfoVO) GoString() string {
	return s.String()
}

func (s *AuthAppInfoVO) SetApiCount(v int64) *AuthAppInfoVO {
	s.ApiCount = &v
	return s
}

func (s *AuthAppInfoVO) SetAppType(v string) *AuthAppInfoVO {
	s.AppType = &v
	return s
}

func (s *AuthAppInfoVO) SetAuthAppInfoId(v string) *AuthAppInfoVO {
	s.AuthAppInfoId = &v
	return s
}

func (s *AuthAppInfoVO) SetAuthAppType(v string) *AuthAppInfoVO {
	s.AuthAppType = &v
	return s
}

func (s *AuthAppInfoVO) SetCanDelete(v bool) *AuthAppInfoVO {
	s.CanDelete = &v
	return s
}

func (s *AuthAppInfoVO) SetGmtCreate(v string) *AuthAppInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *AuthAppInfoVO) SetGmtModified(v string) *AuthAppInfoVO {
	s.GmtModified = &v
	return s
}

func (s *AuthAppInfoVO) SetOperator(v string) *AuthAppInfoVO {
	s.Operator = &v
	return s
}

func (s *AuthAppInfoVO) SetSubAppCompany(v string) *AuthAppInfoVO {
	s.SubAppCompany = &v
	return s
}

func (s *AuthAppInfoVO) SetSubAppDesc(v string) *AuthAppInfoVO {
	s.SubAppDesc = &v
	return s
}

func (s *AuthAppInfoVO) SetSubAppId(v string) *AuthAppInfoVO {
	s.SubAppId = &v
	return s
}

func (s *AuthAppInfoVO) SetSubAppInfo(v *AppInfoVO) *AuthAppInfoVO {
	s.SubAppInfo = v
	return s
}

func (s *AuthAppInfoVO) SetSubTenantId(v string) *AuthAppInfoVO {
	s.SubTenantId = &v
	return s
}

func (s *AuthAppInfoVO) SetSubWorkspaceId(v string) *AuthAppInfoVO {
	s.SubWorkspaceId = &v
	return s
}

func (s *AuthAppInfoVO) SetApiId(v string) *AuthAppInfoVO {
	s.ApiId = &v
	return s
}

func (s *AuthAppInfoVO) SetAppName(v string) *AuthAppInfoVO {
	s.AppName = &v
	return s
}

func (s *AuthAppInfoVO) SetWorkspaceId(v string) *AuthAppInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *AuthAppInfoVO) SetTenantId(v string) *AuthAppInfoVO {
	s.TenantId = &v
	return s
}

// ApiCrossZoneVO
type ApiCrossZoneVO struct {
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// gw_id
	GwId *string `json:"gw_id,omitempty" xml:"gw_id,omitempty"`
	// 注册中心类型
	SysType *string `json:"sys_type,omitempty" xml:"sys_type,omitempty"`
	// 网关类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty"`
}

func (s ApiCrossZoneVO) String() string {
	return tea.Prettify(s)
}

func (s ApiCrossZoneVO) GoString() string {
	return s.String()
}

func (s *ApiCrossZoneVO) SetWorkspaceId(v string) *ApiCrossZoneVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiCrossZoneVO) SetTenantId(v string) *ApiCrossZoneVO {
	s.TenantId = &v
	return s
}

func (s *ApiCrossZoneVO) SetApiId(v string) *ApiCrossZoneVO {
	s.ApiId = &v
	return s
}

func (s *ApiCrossZoneVO) SetGwId(v string) *ApiCrossZoneVO {
	s.GwId = &v
	return s
}

func (s *ApiCrossZoneVO) SetSysType(v string) *ApiCrossZoneVO {
	s.SysType = &v
	return s
}

func (s *ApiCrossZoneVO) SetType(v string) *ApiCrossZoneVO {
	s.Type = &v
	return s
}

func (s *ApiCrossZoneVO) SetGmtCreate(v string) *ApiCrossZoneVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiCrossZoneVO) SetGmtModified(v string) *ApiCrossZoneVO {
	s.GmtModified = &v
	return s
}

func (s *ApiCrossZoneVO) SetRegistryId(v string) *ApiCrossZoneVO {
	s.RegistryId = &v
	return s
}

// ApiMockConfigVO
type ApiMockConfigVO struct {
	// mock_data
	MockData *string `json:"mock_data,omitempty" xml:"mock_data,omitempty"`
}

func (s ApiMockConfigVO) String() string {
	return tea.Prettify(s)
}

func (s ApiMockConfigVO) GoString() string {
	return s.String()
}

func (s *ApiMockConfigVO) SetMockData(v string) *ApiMockConfigVO {
	s.MockData = &v
	return s
}

// 外部授权信息
type ExternalAuthInfoVO struct {
	// 绑定api数量
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 缓存开关
	CacheSwitch *string `json:"cache_switch,omitempty" xml:"cache_switch,omitempty"`
	// 缓存时间
	CacheTtl *int64 `json:"cache_ttl,omitempty" xml:"cache_ttl,omitempty"`
	// 能否删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 外部系统标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty"`
	// 外部授权名称
	ExternalAuthName *string `json:"external_auth_name,omitempty" xml:"external_auth_name,omitempty"`
	//
	// 方法名
	FunctionName *string `json:"function_name,omitempty" xml:"function_name,omitempty"`
	//
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	//
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 后端接口名
	InterfaceName *string `json:"interface_name,omitempty" xml:"interface_name,omitempty"`
	// 请求方法
	Method *string `json:"method,omitempty" xml:"method,omitempty"`
	// operationtype
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	//
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 外部api参数
	Params []*ApiParamVO `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
	// 路由标识
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	// 路由规则
	RouterInfo *RouterInfoVO `json:"router_info,omitempty" xml:"router_info,omitempty"`
	// 路由策略类型
	RouterType *string `json:"router_type,omitempty" xml:"router_type,omitempty"`
	// SystemClusterVO
	SystemCluster *SystemClusterVO `json:"system_cluster,omitempty" xml:"system_cluster,omitempty"`
	// 系统集群标识
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	//
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// timeout
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 服务标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// 后端路径
	UpstreamPath *string `json:"upstream_path,omitempty" xml:"upstream_path,omitempty"`
	// 后端协议类型
	UpstreamProtocol *string `json:"upstream_protocol,omitempty" xml:"upstream_protocol,omitempty"`
	// 后端服务类型
	UpstreamType *string `json:"upstream_type,omitempty" xml:"upstream_type,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ExternalAuthInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ExternalAuthInfoVO) GoString() string {
	return s.String()
}

func (s *ExternalAuthInfoVO) SetApiCount(v int64) *ExternalAuthInfoVO {
	s.ApiCount = &v
	return s
}

func (s *ExternalAuthInfoVO) SetCacheSwitch(v string) *ExternalAuthInfoVO {
	s.CacheSwitch = &v
	return s
}

func (s *ExternalAuthInfoVO) SetCacheTtl(v int64) *ExternalAuthInfoVO {
	s.CacheTtl = &v
	return s
}

func (s *ExternalAuthInfoVO) SetCanDelete(v bool) *ExternalAuthInfoVO {
	s.CanDelete = &v
	return s
}

func (s *ExternalAuthInfoVO) SetDescription(v string) *ExternalAuthInfoVO {
	s.Description = &v
	return s
}

func (s *ExternalAuthInfoVO) SetExternalAuthId(v string) *ExternalAuthInfoVO {
	s.ExternalAuthId = &v
	return s
}

func (s *ExternalAuthInfoVO) SetExternalAuthName(v string) *ExternalAuthInfoVO {
	s.ExternalAuthName = &v
	return s
}

func (s *ExternalAuthInfoVO) SetFunctionName(v string) *ExternalAuthInfoVO {
	s.FunctionName = &v
	return s
}

func (s *ExternalAuthInfoVO) SetGmtCreate(v string) *ExternalAuthInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *ExternalAuthInfoVO) SetGmtModified(v string) *ExternalAuthInfoVO {
	s.GmtModified = &v
	return s
}

func (s *ExternalAuthInfoVO) SetInterfaceName(v string) *ExternalAuthInfoVO {
	s.InterfaceName = &v
	return s
}

func (s *ExternalAuthInfoVO) SetMethod(v string) *ExternalAuthInfoVO {
	s.Method = &v
	return s
}

func (s *ExternalAuthInfoVO) SetOperationType(v string) *ExternalAuthInfoVO {
	s.OperationType = &v
	return s
}

func (s *ExternalAuthInfoVO) SetOperator(v string) *ExternalAuthInfoVO {
	s.Operator = &v
	return s
}

func (s *ExternalAuthInfoVO) SetParams(v []*ApiParamVO) *ExternalAuthInfoVO {
	s.Params = v
	return s
}

func (s *ExternalAuthInfoVO) SetRouterId(v string) *ExternalAuthInfoVO {
	s.RouterId = &v
	return s
}

func (s *ExternalAuthInfoVO) SetRouterInfo(v *RouterInfoVO) *ExternalAuthInfoVO {
	s.RouterInfo = v
	return s
}

func (s *ExternalAuthInfoVO) SetRouterType(v string) *ExternalAuthInfoVO {
	s.RouterType = &v
	return s
}

func (s *ExternalAuthInfoVO) SetSystemCluster(v *SystemClusterVO) *ExternalAuthInfoVO {
	s.SystemCluster = v
	return s
}

func (s *ExternalAuthInfoVO) SetSysId(v string) *ExternalAuthInfoVO {
	s.SysId = &v
	return s
}

func (s *ExternalAuthInfoVO) SetTenantId(v string) *ExternalAuthInfoVO {
	s.TenantId = &v
	return s
}

func (s *ExternalAuthInfoVO) SetTimeout(v int64) *ExternalAuthInfoVO {
	s.Timeout = &v
	return s
}

func (s *ExternalAuthInfoVO) SetUniqueId(v string) *ExternalAuthInfoVO {
	s.UniqueId = &v
	return s
}

func (s *ExternalAuthInfoVO) SetUpstreamPath(v string) *ExternalAuthInfoVO {
	s.UpstreamPath = &v
	return s
}

func (s *ExternalAuthInfoVO) SetUpstreamProtocol(v string) *ExternalAuthInfoVO {
	s.UpstreamProtocol = &v
	return s
}

func (s *ExternalAuthInfoVO) SetUpstreamType(v string) *ExternalAuthInfoVO {
	s.UpstreamType = &v
	return s
}

func (s *ExternalAuthInfoVO) SetWorkspaceId(v string) *ExternalAuthInfoVO {
	s.WorkspaceId = &v
	return s
}

// SwitchVO
type SwitchVO struct {
	// 唯一标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 键值
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 开关
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s SwitchVO) String() string {
	return tea.Prettify(s)
}

func (s SwitchVO) GoString() string {
	return s.String()
}

func (s *SwitchVO) SetId(v string) *SwitchVO {
	s.Id = &v
	return s
}

func (s *SwitchVO) SetKey(v string) *SwitchVO {
	s.Key = &v
	return s
}

func (s *SwitchVO) SetName(v string) *SwitchVO {
	s.Name = &v
	return s
}

func (s *SwitchVO) SetValue(v string) *SwitchVO {
	s.Value = &v
	return s
}

// ApiflowOutputVO
type ApiflowOutputVO struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// mapping_name
	MappingName *string `json:"mapping_name,omitempty" xml:"mapping_name,omitempty"`
}

func (s ApiflowOutputVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowOutputVO) GoString() string {
	return s.String()
}

func (s *ApiflowOutputVO) SetName(v string) *ApiflowOutputVO {
	s.Name = &v
	return s
}

func (s *ApiflowOutputVO) SetMappingName(v string) *ApiflowOutputVO {
	s.MappingName = &v
	return s
}

// GateWayConfigVO
type GateWayConfigVO struct {
	// 唯一标识
	GatewayId *string `json:"gateway_id,omitempty" xml:"gateway_id,omitempty"`
	// host
	Host *string `json:"host,omitempty" xml:"host,omitempty"`
	// 唯一性标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// zone名称、网关名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 注册中心
	Routers []*RegistryVO `json:"routers,omitempty" xml:"routers,omitempty" type:"Repeated"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// zone
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty"`
	// 流量比例
	Weight *int64 `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s GateWayConfigVO) String() string {
	return tea.Prettify(s)
}

func (s GateWayConfigVO) GoString() string {
	return s.String()
}

func (s *GateWayConfigVO) SetGatewayId(v string) *GateWayConfigVO {
	s.GatewayId = &v
	return s
}

func (s *GateWayConfigVO) SetHost(v string) *GateWayConfigVO {
	s.Host = &v
	return s
}

func (s *GateWayConfigVO) SetId(v string) *GateWayConfigVO {
	s.Id = &v
	return s
}

func (s *GateWayConfigVO) SetName(v string) *GateWayConfigVO {
	s.Name = &v
	return s
}

func (s *GateWayConfigVO) SetRouters(v []*RegistryVO) *GateWayConfigVO {
	s.Routers = v
	return s
}

func (s *GateWayConfigVO) SetTenantId(v string) *GateWayConfigVO {
	s.TenantId = &v
	return s
}

func (s *GateWayConfigVO) SetWorkspaceId(v string) *GateWayConfigVO {
	s.WorkspaceId = &v
	return s
}

func (s *GateWayConfigVO) SetZone(v string) *GateWayConfigVO {
	s.Zone = &v
	return s
}

func (s *GateWayConfigVO) SetWeight(v int64) *GateWayConfigVO {
	s.Weight = &v
	return s
}

// CorsInfoVO
type CorsInfoVO struct {
	// 是否允许发送COOKIE
	AllowCredentials *bool `json:"allow_credentials,omitempty" xml:"allow_credentials,omitempty"`
	// 允许的 request headers
	AllowHeaders []*string `json:"allow_headers,omitempty" xml:"allow_headers,omitempty" type:"Repeated"`
	// 允许的http method
	AllowMethods []*string `json:"allow_methods,omitempty" xml:"allow_methods,omitempty" type:"Repeated"`
	// 允许的 ORIGIN
	AllowOrigins []*string `json:"allow_origins,omitempty" xml:"allow_origins,omitempty" type:"Repeated"`
	// API数量
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// cors标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// cors名称
	CorsName *string `json:"cors_name,omitempty" xml:"cors_name,omitempty"`
	// cors_scop
	CorsScop *string `json:"cors_scop,omitempty" xml:"cors_scop,omitempty"`
	// cors状态
	CorsStatus *string `json:"cors_status,omitempty" xml:"cors_status,omitempty"`
	// 允许暴露的 reponse header
	ExposeHeaders []*string `json:"expose_headers,omitempty" xml:"expose_headers,omitempty" type:"Repeated"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 预检请求的有效期
	MaxAge *int64 `json:"max_age,omitempty" xml:"max_age,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CorsInfoVO) String() string {
	return tea.Prettify(s)
}

func (s CorsInfoVO) GoString() string {
	return s.String()
}

func (s *CorsInfoVO) SetAllowCredentials(v bool) *CorsInfoVO {
	s.AllowCredentials = &v
	return s
}

func (s *CorsInfoVO) SetAllowHeaders(v []*string) *CorsInfoVO {
	s.AllowHeaders = v
	return s
}

func (s *CorsInfoVO) SetAllowMethods(v []*string) *CorsInfoVO {
	s.AllowMethods = v
	return s
}

func (s *CorsInfoVO) SetAllowOrigins(v []*string) *CorsInfoVO {
	s.AllowOrigins = v
	return s
}

func (s *CorsInfoVO) SetApiCount(v int64) *CorsInfoVO {
	s.ApiCount = &v
	return s
}

func (s *CorsInfoVO) SetCorsId(v string) *CorsInfoVO {
	s.CorsId = &v
	return s
}

func (s *CorsInfoVO) SetCorsName(v string) *CorsInfoVO {
	s.CorsName = &v
	return s
}

func (s *CorsInfoVO) SetCorsScop(v string) *CorsInfoVO {
	s.CorsScop = &v
	return s
}

func (s *CorsInfoVO) SetCorsStatus(v string) *CorsInfoVO {
	s.CorsStatus = &v
	return s
}

func (s *CorsInfoVO) SetExposeHeaders(v []*string) *CorsInfoVO {
	s.ExposeHeaders = v
	return s
}

func (s *CorsInfoVO) SetGmtCreate(v string) *CorsInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *CorsInfoVO) SetGmtModified(v string) *CorsInfoVO {
	s.GmtModified = &v
	return s
}

func (s *CorsInfoVO) SetMaxAge(v int64) *CorsInfoVO {
	s.MaxAge = &v
	return s
}

func (s *CorsInfoVO) SetOperator(v string) *CorsInfoVO {
	s.Operator = &v
	return s
}

func (s *CorsInfoVO) SetTenantId(v string) *CorsInfoVO {
	s.TenantId = &v
	return s
}

func (s *CorsInfoVO) SetWorkspaceId(v string) *CorsInfoVO {
	s.WorkspaceId = &v
	return s
}

// 策略管理
type StrategyInfoVO struct {
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 策略唯一标识
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// 策略名称
	StrategyName *string `json:"strategy_name,omitempty" xml:"strategy_name,omitempty"`
	// 策略状态
	StrategyStatus *string `json:"strategy_status,omitempty" xml:"strategy_status,omitempty"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	//
	// API数量
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 策略描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 策略类型
	StrategyType *string `json:"strategy_type,omitempty" xml:"strategy_type,omitempty"`
	// 名单集合
	Host []*string `json:"host,omitempty" xml:"host,omitempty" type:"Repeated"`
	// true, false
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
}

func (s StrategyInfoVO) String() string {
	return tea.Prettify(s)
}

func (s StrategyInfoVO) GoString() string {
	return s.String()
}

func (s *StrategyInfoVO) SetWorkspaceId(v string) *StrategyInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *StrategyInfoVO) SetTenantId(v string) *StrategyInfoVO {
	s.TenantId = &v
	return s
}

func (s *StrategyInfoVO) SetGmtCreate(v string) *StrategyInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *StrategyInfoVO) SetGmtModified(v string) *StrategyInfoVO {
	s.GmtModified = &v
	return s
}

func (s *StrategyInfoVO) SetStrategyId(v string) *StrategyInfoVO {
	s.StrategyId = &v
	return s
}

func (s *StrategyInfoVO) SetStrategyName(v string) *StrategyInfoVO {
	s.StrategyName = &v
	return s
}

func (s *StrategyInfoVO) SetStrategyStatus(v string) *StrategyInfoVO {
	s.StrategyStatus = &v
	return s
}

func (s *StrategyInfoVO) SetOperator(v string) *StrategyInfoVO {
	s.Operator = &v
	return s
}

func (s *StrategyInfoVO) SetApiCount(v int64) *StrategyInfoVO {
	s.ApiCount = &v
	return s
}

func (s *StrategyInfoVO) SetDescription(v string) *StrategyInfoVO {
	s.Description = &v
	return s
}

func (s *StrategyInfoVO) SetStrategyType(v string) *StrategyInfoVO {
	s.StrategyType = &v
	return s
}

func (s *StrategyInfoVO) SetHost(v []*string) *StrategyInfoVO {
	s.Host = v
	return s
}

func (s *StrategyInfoVO) SetCanDelete(v bool) *StrategyInfoVO {
	s.CanDelete = &v
	return s
}

// ActionResult
type ActionResult struct {
	// 错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 报错信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 是否挂载成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ActionResult) String() string {
	return tea.Prettify(s)
}

func (s ActionResult) GoString() string {
	return s.String()
}

func (s *ActionResult) SetCode(v string) *ActionResult {
	s.Code = &v
	return s
}

func (s *ActionResult) SetErrorMessage(v string) *ActionResult {
	s.ErrorMessage = &v
	return s
}

func (s *ActionResult) SetId(v string) *ActionResult {
	s.Id = &v
	return s
}

func (s *ActionResult) SetSuccess(v bool) *ActionResult {
	s.Success = &v
	return s
}

// ApiModelVO
type ApiModelVO struct {
	// 绑定的api数量
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 模板id(全局唯一)
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// API模型描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	//
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模型配置
	ModelConfig *string `json:"model_config,omitempty" xml:"model_config,omitempty"`
	// 模型名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty"`
	// 数据模型参数
	ModelParams []*ApiModelParamVO `json:"model_params,omitempty" xml:"model_params,omitempty" type:"Repeated"`
	// 创建人
	//
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// children
	Children *string `json:"children,omitempty" xml:"children,omitempty"`
	// option 表示模型是多参数
	ModelType *string `json:"model_type,omitempty" xml:"model_type,omitempty"`
}

func (s ApiModelVO) String() string {
	return tea.Prettify(s)
}

func (s ApiModelVO) GoString() string {
	return s.String()
}

func (s *ApiModelVO) SetApiCount(v int64) *ApiModelVO {
	s.ApiCount = &v
	return s
}

func (s *ApiModelVO) SetApiModelId(v string) *ApiModelVO {
	s.ApiModelId = &v
	return s
}

func (s *ApiModelVO) SetCanDelete(v bool) *ApiModelVO {
	s.CanDelete = &v
	return s
}

func (s *ApiModelVO) SetDescription(v string) *ApiModelVO {
	s.Description = &v
	return s
}

func (s *ApiModelVO) SetGmtCreate(v string) *ApiModelVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiModelVO) SetGmtModified(v string) *ApiModelVO {
	s.GmtModified = &v
	return s
}

func (s *ApiModelVO) SetModelConfig(v string) *ApiModelVO {
	s.ModelConfig = &v
	return s
}

func (s *ApiModelVO) SetModelName(v string) *ApiModelVO {
	s.ModelName = &v
	return s
}

func (s *ApiModelVO) SetModelParams(v []*ApiModelParamVO) *ApiModelVO {
	s.ModelParams = v
	return s
}

func (s *ApiModelVO) SetOperator(v string) *ApiModelVO {
	s.Operator = &v
	return s
}

func (s *ApiModelVO) SetTenantId(v string) *ApiModelVO {
	s.TenantId = &v
	return s
}

func (s *ApiModelVO) SetWorkspaceId(v string) *ApiModelVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiModelVO) SetChildren(v string) *ApiModelVO {
	s.Children = &v
	return s
}

func (s *ApiModelVO) SetModelType(v string) *ApiModelVO {
	s.ModelType = &v
	return s
}

// LimitConfigVO
type LimitConfigVO struct {
	// 是否需要限制
	NeedLimit *bool `json:"need_limit,omitempty" xml:"need_limit,omitempty"`
	// 限制阈值
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty"`
	// 限制响应类型
	LimitRspType *string `json:"limit_rsp_type,omitempty" xml:"limit_rsp_type,omitempty"`
	// 响应信息
	RspMsg *string `json:"rsp_msg,omitempty" xml:"rsp_msg,omitempty"`
}

func (s LimitConfigVO) String() string {
	return tea.Prettify(s)
}

func (s LimitConfigVO) GoString() string {
	return s.String()
}

func (s *LimitConfigVO) SetNeedLimit(v bool) *LimitConfigVO {
	s.NeedLimit = &v
	return s
}

func (s *LimitConfigVO) SetLimit(v int64) *LimitConfigVO {
	s.Limit = &v
	return s
}

func (s *LimitConfigVO) SetLimitRspType(v string) *LimitConfigVO {
	s.LimitRspType = &v
	return s
}

func (s *LimitConfigVO) SetRspMsg(v string) *LimitConfigVO {
	s.RspMsg = &v
	return s
}

// ApiCacheVO
type ApiCacheVO struct {
	// 是否需要缓存
	NeedCache *bool `json:"need_cache,omitempty" xml:"need_cache,omitempty"`
	// TTL
	Ttl *int64 `json:"ttl,omitempty" xml:"ttl,omitempty"`
	// cacheKeys
	CacheKeys []*ApiCacheKeyVO `json:"cache_keys,omitempty" xml:"cache_keys,omitempty" type:"Repeated"`
}

func (s ApiCacheVO) String() string {
	return tea.Prettify(s)
}

func (s ApiCacheVO) GoString() string {
	return s.String()
}

func (s *ApiCacheVO) SetNeedCache(v bool) *ApiCacheVO {
	s.NeedCache = &v
	return s
}

func (s *ApiCacheVO) SetTtl(v int64) *ApiCacheVO {
	s.Ttl = &v
	return s
}

func (s *ApiCacheVO) SetCacheKeys(v []*ApiCacheKeyVO) *ApiCacheVO {
	s.CacheKeys = v
	return s
}

// ParamMappingInfoVO
type ParamMappingInfoVO struct {
	// api_count
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// can_delete
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 配置模板
	ConfigTemplate *string `json:"config_template,omitempty" xml:"config_template,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 映射类型
	MappingType *string `json:"mapping_type,omitempty" xml:"mapping_type,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// param_mapping_id
	ParamMappingId *string `json:"param_mapping_id,omitempty" xml:"param_mapping_id,omitempty"`
	// 参数映射名称
	ParamMappingName *string `json:"param_mapping_name,omitempty" xml:"param_mapping_name,omitempty"`
	// 脚本配置
	ScriptConfig *string `json:"script_config,omitempty" xml:"script_config,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 配置模板名称
	ConfigTemplateName *string `json:"config_template_name,omitempty" xml:"config_template_name,omitempty"`
}

func (s ParamMappingInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ParamMappingInfoVO) GoString() string {
	return s.String()
}

func (s *ParamMappingInfoVO) SetApiCount(v int64) *ParamMappingInfoVO {
	s.ApiCount = &v
	return s
}

func (s *ParamMappingInfoVO) SetCanDelete(v bool) *ParamMappingInfoVO {
	s.CanDelete = &v
	return s
}

func (s *ParamMappingInfoVO) SetConfigTemplate(v string) *ParamMappingInfoVO {
	s.ConfigTemplate = &v
	return s
}

func (s *ParamMappingInfoVO) SetDescription(v string) *ParamMappingInfoVO {
	s.Description = &v
	return s
}

func (s *ParamMappingInfoVO) SetGmtCreate(v string) *ParamMappingInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *ParamMappingInfoVO) SetGmtModified(v string) *ParamMappingInfoVO {
	s.GmtModified = &v
	return s
}

func (s *ParamMappingInfoVO) SetMappingType(v string) *ParamMappingInfoVO {
	s.MappingType = &v
	return s
}

func (s *ParamMappingInfoVO) SetOperator(v string) *ParamMappingInfoVO {
	s.Operator = &v
	return s
}

func (s *ParamMappingInfoVO) SetParamMappingId(v string) *ParamMappingInfoVO {
	s.ParamMappingId = &v
	return s
}

func (s *ParamMappingInfoVO) SetParamMappingName(v string) *ParamMappingInfoVO {
	s.ParamMappingName = &v
	return s
}

func (s *ParamMappingInfoVO) SetScriptConfig(v string) *ParamMappingInfoVO {
	s.ScriptConfig = &v
	return s
}

func (s *ParamMappingInfoVO) SetTenantId(v string) *ParamMappingInfoVO {
	s.TenantId = &v
	return s
}

func (s *ParamMappingInfoVO) SetWorkspaceId(v string) *ParamMappingInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *ParamMappingInfoVO) SetConfigTemplateName(v string) *ParamMappingInfoVO {
	s.ConfigTemplateName = &v
	return s
}

// 排序信息
type OrderInfo struct {
	// 要排序的字段
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 升序or降序
	Order *string `json:"order,omitempty" xml:"order,omitempty" require:"true"`
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

func (s *OrderInfo) SetKey(v string) *OrderInfo {
	s.Key = &v
	return s
}

func (s *OrderInfo) SetOrder(v string) *OrderInfo {
	s.Order = &v
	return s
}

// ApiVersionVO
type ApiVersionVO struct {
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// editOperator
	EditOperator *string `json:"edit_operator,omitempty" xml:"edit_operator,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 编辑时间
	GmtEdit *string `json:"gmt_edit,omitempty" xml:"gmt_edit,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmtOffline
	GmtOffline *string `json:"gmt_offline,omitempty" xml:"gmt_offline,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmtOnline
	GmtOnline *string `json:"gmt_online,omitempty" xml:"gmt_online,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// offlineDesc
	OfflineDesc *string `json:"offline_desc,omitempty" xml:"offline_desc,omitempty"`
	// offlineOperator
	OfflineOperator *string `json:"offline_operator,omitempty" xml:"offline_operator,omitempty"`
	// onlineDesc
	OnlineDesc *string `json:"online_desc,omitempty" xml:"online_desc,omitempty"`
	// onlineOperator
	OnlineOperator *string `json:"online_operator,omitempty" xml:"online_operator,omitempty"`
	// versionId
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty"`
	// 版本号
	VersionNo *string `json:"version_no,omitempty" xml:"version_no,omitempty"`
	// versionStatus
	VersionStatus *string `json:"version_status,omitempty" xml:"version_status,omitempty"`
	// 能否发布
	CanOnline *bool `json:"can_online,omitempty" xml:"can_online,omitempty"`
}

func (s ApiVersionVO) String() string {
	return tea.Prettify(s)
}

func (s ApiVersionVO) GoString() string {
	return s.String()
}

func (s *ApiVersionVO) SetApiId(v string) *ApiVersionVO {
	s.ApiId = &v
	return s
}

func (s *ApiVersionVO) SetEditOperator(v string) *ApiVersionVO {
	s.EditOperator = &v
	return s
}

func (s *ApiVersionVO) SetGmtCreate(v string) *ApiVersionVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiVersionVO) SetGmtEdit(v string) *ApiVersionVO {
	s.GmtEdit = &v
	return s
}

func (s *ApiVersionVO) SetGmtModified(v string) *ApiVersionVO {
	s.GmtModified = &v
	return s
}

func (s *ApiVersionVO) SetGmtOffline(v string) *ApiVersionVO {
	s.GmtOffline = &v
	return s
}

func (s *ApiVersionVO) SetGmtOnline(v string) *ApiVersionVO {
	s.GmtOnline = &v
	return s
}

func (s *ApiVersionVO) SetOfflineDesc(v string) *ApiVersionVO {
	s.OfflineDesc = &v
	return s
}

func (s *ApiVersionVO) SetOfflineOperator(v string) *ApiVersionVO {
	s.OfflineOperator = &v
	return s
}

func (s *ApiVersionVO) SetOnlineDesc(v string) *ApiVersionVO {
	s.OnlineDesc = &v
	return s
}

func (s *ApiVersionVO) SetOnlineOperator(v string) *ApiVersionVO {
	s.OnlineOperator = &v
	return s
}

func (s *ApiVersionVO) SetVersionId(v string) *ApiVersionVO {
	s.VersionId = &v
	return s
}

func (s *ApiVersionVO) SetVersionNo(v string) *ApiVersionVO {
	s.VersionNo = &v
	return s
}

func (s *ApiVersionVO) SetVersionStatus(v string) *ApiVersionVO {
	s.VersionStatus = &v
	return s
}

func (s *ApiVersionVO) SetCanOnline(v bool) *ApiVersionVO {
	s.CanOnline = &v
	return s
}

// 授权信息
type SofaGwAuthenticationVO struct {
	//
	// access key
	//
	//
	AuthAccessKey *string `json:"auth_access_key,omitempty" xml:"auth_access_key,omitempty"`
	// secret key
	AuthSecretKey *string `json:"auth_secret_key,omitempty" xml:"auth_secret_key,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
}

func (s SofaGwAuthenticationVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwAuthenticationVO) GoString() string {
	return s.String()
}

func (s *SofaGwAuthenticationVO) SetAuthAccessKey(v string) *SofaGwAuthenticationVO {
	s.AuthAccessKey = &v
	return s
}

func (s *SofaGwAuthenticationVO) SetAuthSecretKey(v string) *SofaGwAuthenticationVO {
	s.AuthSecretKey = &v
	return s
}

func (s *SofaGwAuthenticationVO) SetId(v int64) *SofaGwAuthenticationVO {
	s.Id = &v
	return s
}

// 编排VO
type ApiflowMachineDefVO struct {
	//
	// api数
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// can_delete
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// comment
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
	// ver
	Ver *string `json:"ver,omitempty" xml:"ver,omitempty"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// recover_strategy
	RecoverStrategy *string `json:"recover_strategy,omitempty" xml:"recover_strategy,omitempty"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// machine_status
	MachineStatus *string `json:"machine_status,omitempty" xml:"machine_status,omitempty"`
	// field_mapping
	FieldMapping *string `json:"field_mapping,omitempty" xml:"field_mapping,omitempty"`
}

func (s ApiflowMachineDefVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineDefVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineDefVO) SetApiCount(v int64) *ApiflowMachineDefVO {
	s.ApiCount = &v
	return s
}

func (s *ApiflowMachineDefVO) SetWorkspaceId(v string) *ApiflowMachineDefVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiflowMachineDefVO) SetTenantId(v string) *ApiflowMachineDefVO {
	s.TenantId = &v
	return s
}

func (s *ApiflowMachineDefVO) SetInstanceId(v string) *ApiflowMachineDefVO {
	s.InstanceId = &v
	return s
}

func (s *ApiflowMachineDefVO) SetCanDelete(v bool) *ApiflowMachineDefVO {
	s.CanDelete = &v
	return s
}

func (s *ApiflowMachineDefVO) SetId(v string) *ApiflowMachineDefVO {
	s.Id = &v
	return s
}

func (s *ApiflowMachineDefVO) SetName(v string) *ApiflowMachineDefVO {
	s.Name = &v
	return s
}

func (s *ApiflowMachineDefVO) SetAppName(v string) *ApiflowMachineDefVO {
	s.AppName = &v
	return s
}

func (s *ApiflowMachineDefVO) SetType(v string) *ApiflowMachineDefVO {
	s.Type = &v
	return s
}

func (s *ApiflowMachineDefVO) SetComment(v string) *ApiflowMachineDefVO {
	s.Comment = &v
	return s
}

func (s *ApiflowMachineDefVO) SetVer(v string) *ApiflowMachineDefVO {
	s.Ver = &v
	return s
}

func (s *ApiflowMachineDefVO) SetGmtCreate(v string) *ApiflowMachineDefVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiflowMachineDefVO) SetStatus(v string) *ApiflowMachineDefVO {
	s.Status = &v
	return s
}

func (s *ApiflowMachineDefVO) SetRecoverStrategy(v string) *ApiflowMachineDefVO {
	s.RecoverStrategy = &v
	return s
}

func (s *ApiflowMachineDefVO) SetContent(v string) *ApiflowMachineDefVO {
	s.Content = &v
	return s
}

func (s *ApiflowMachineDefVO) SetMachineStatus(v string) *ApiflowMachineDefVO {
	s.MachineStatus = &v
	return s
}

func (s *ApiflowMachineDefVO) SetFieldMapping(v string) *ApiflowMachineDefVO {
	s.FieldMapping = &v
	return s
}

// SystemConfigVO
type SystemConfigVO struct {
	// config_key
	ConfigKey *string `json:"config_key,omitempty" xml:"config_key,omitempty"`
	// config_value
	ConfigValue *string `json:"config_value,omitempty" xml:"config_value,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// gateway_list
	GatewayList []*GateWayConfigVO `json:"gateway_list,omitempty" xml:"gateway_list,omitempty" type:"Repeated"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// switch_list
	SwitchList []*SwitchVO `json:"switch_list,omitempty" xml:"switch_list,omitempty" type:"Repeated"`
}

func (s SystemConfigVO) String() string {
	return tea.Prettify(s)
}

func (s SystemConfigVO) GoString() string {
	return s.String()
}

func (s *SystemConfigVO) SetConfigKey(v string) *SystemConfigVO {
	s.ConfigKey = &v
	return s
}

func (s *SystemConfigVO) SetConfigValue(v string) *SystemConfigVO {
	s.ConfigValue = &v
	return s
}

func (s *SystemConfigVO) SetDescription(v string) *SystemConfigVO {
	s.Description = &v
	return s
}

func (s *SystemConfigVO) SetGatewayList(v []*GateWayConfigVO) *SystemConfigVO {
	s.GatewayList = v
	return s
}

func (s *SystemConfigVO) SetGmtCreate(v string) *SystemConfigVO {
	s.GmtCreate = &v
	return s
}

func (s *SystemConfigVO) SetGmtModified(v string) *SystemConfigVO {
	s.GmtModified = &v
	return s
}

func (s *SystemConfigVO) SetInstanceId(v string) *SystemConfigVO {
	s.InstanceId = &v
	return s
}

func (s *SystemConfigVO) SetOperator(v string) *SystemConfigVO {
	s.Operator = &v
	return s
}

func (s *SystemConfigVO) SetSwitchList(v []*SwitchVO) *SystemConfigVO {
	s.SwitchList = v
	return s
}

// ApiTransferVO
type ApiTransferVO struct {
	// API缓存模型
	ApiCacheModel *ApiCacheVO `json:"api_cache_model,omitempty" xml:"api_cache_model,omitempty"`
	// api_group
	ApiGroup *ApiGroupVO `json:"api_group,omitempty" xml:"api_group,omitempty"`
	// API分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// 所属API分组名称
	ApiGroupName *string `json:"api_group_name,omitempty" xml:"api_group_name,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// API限流配置
	ApiLimitConfig *LimitConfigVO `json:"api_limit_config,omitempty" xml:"api_limit_config,omitempty"`
	// api_mock_config
	ApiMockConfig *ApiMockConfigVO `json:"api_mock_config,omitempty" xml:"api_mock_config,omitempty"`
	// API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty"`
	// apiStatus
	ApiStatus *string `json:"api_status,omitempty" xml:"api_status,omitempty"`
	// 授权应用类型
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
	// authentication_type
	AuthenticationType *string `json:"authentication_type,omitempty" xml:"authentication_type,omitempty"`
	// auth_app_count
	AuthAppCount *int64 `json:"auth_app_count,omitempty" xml:"auth_app_count,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// charset
	Charset *string `json:"charset,omitempty" xml:"charset,omitempty"`
	// 重复的配置  信息详情
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty"`
	// 完整interface_name
	CompleteInterfaceName *string `json:"complete_interface_name,omitempty" xml:"complete_interface_name,omitempty"`
	// contentType
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// cors_id
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// cors_info
	CorsInfo *CorsInfoVO `json:"cors_info,omitempty" xml:"cors_info,omitempty"`
	// 当前显示的版本
	CurrentVersionNo *string `json:"current_version_no,omitempty" xml:"current_version_no,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// API分组域名
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty"`
	// downstreamProtocol
	DownstreamProtocol *string `json:"downstream_protocol,omitempty" xml:"downstream_protocol,omitempty"`
	// 编辑中的版本
	EditVersion *ApiVersionVO `json:"edit_version,omitempty" xml:"edit_version,omitempty"`
	// 编辑中的API版本号
	EditVersionNo *string `json:"edit_version_no,omitempty" xml:"edit_version_no,omitempty"`
	// external_auth
	ExternalAuth *ExternalAuthInfoVO `json:"external_auth,omitempty" xml:"external_auth,omitempty"`
	// 外部系统标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty"`
	// 方法名
	FunctionName *string `json:"function_name,omitempty" xml:"function_name,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 接口名称
	InterfaceName *string `json:"interface_name,omitempty" xml:"interface_name,omitempty"`
	// method
	Method *string `json:"method,omitempty" xml:"method,omitempty"`
	// onlineVersion
	OnlineVersion *ApiVersionVO `json:"online_version,omitempty" xml:"online_version,omitempty"`
	// 发布中的API版本号
	OnlineVersionNo *string `json:"online_version_no,omitempty" xml:"online_version_no,omitempty"`
	// operation_type
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// path
	Path *string `json:"path,omitempty" xml:"path,omitempty"`
	// 路径匹配类型
	PathMatchType *string `json:"path_match_type,omitempty" xml:"path_match_type,omitempty"`
	// reqParams
	ReqParams []*ApiParamVO `json:"req_params,omitempty" xml:"req_params,omitempty" type:"Repeated"`
	// reqparammapping
	ReqParamMapping *ParamMappingInfoVO `json:"req_param_mapping,omitempty" xml:"req_param_mapping,omitempty"`
	// 请求参数映射标识
	ReqParamMappingId *string `json:"req_param_mapping_id,omitempty" xml:"req_param_mapping_id,omitempty"`
	// 参数映射类型（普通\高级）
	ReqParamMappingType *string `json:"req_param_mapping_type,omitempty" xml:"req_param_mapping_type,omitempty"`
	// respparammapping
	RespParamMapping *ParamMappingInfoVO `json:"resp_param_mapping,omitempty" xml:"resp_param_mapping,omitempty"`
	// 响应参数标识
	RespParamMappingId *string `json:"resp_param_mapping_id,omitempty" xml:"resp_param_mapping_id,omitempty"`
	// router_id
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	//
	// 路由规则
	RouterInfo *RouterInfoVO `json:"router_info,omitempty" xml:"router_info,omitempty"`
	// 路由策略类型
	RouterType *string `json:"router_type,omitempty" xml:"router_type,omitempty"`
	// rsqParam
	RsqParam *ApiParamVO `json:"rsq_param,omitempty" xml:"rsq_param,omitempty"`
	//
	// 后端集群
	SystemCluster *SystemClusterVO `json:"system_cluster,omitempty" xml:"system_cluster,omitempty"`
	// sys_id
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	// 目标工作空间标识
	TargetWorkspaceId *string `json:"target_workspace_id,omitempty" xml:"target_workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// timeout
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 服务标识
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// 需要覆盖的配置
	UpdateConfigList []*string `json:"update_config_list,omitempty" xml:"update_config_list,omitempty" type:"Repeated"`
	// upstreamParamMappings
	UpstreamParamMappings []*ApiParamVO `json:"upstream_param_mappings,omitempty" xml:"upstream_param_mappings,omitempty" type:"Repeated"`
	// upstreamPath
	UpstreamPath *string `json:"upstream_path,omitempty" xml:"upstream_path,omitempty"`
	// upstreamProtocol
	UpstreamProtocol *string `json:"upstream_protocol,omitempty" xml:"upstream_protocol,omitempty"`
	// 后端服务类型
	UpstreamType *string `json:"upstream_type,omitempty" xml:"upstream_type,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 导入失败的原因
	ImportResult *string `json:"import_result,omitempty" xml:"import_result,omitempty"`
	// domain_list
	DomainList []*ApiGroupDomainVO `json:"domain_list,omitempty" xml:"domain_list,omitempty" type:"Repeated"`
	// 策略ID
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// 策略详情
	StrategyInfo *StrategyInfoVO `json:"strategy_info,omitempty" xml:"strategy_info,omitempty"`
	// crossZone双网关 (api 类型)
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
	// api的网关配置列表
	ApiCrossZoneList []*ApiCrossZoneVO `json:"api_cross_zone_list,omitempty" xml:"api_cross_zone_list,omitempty" type:"Repeated"`
	// registry_group
	RegistryGroup *string `json:"registry_group,omitempty" xml:"registry_group,omitempty"`
	// parameter
	Parameter []*string `json:"parameter,omitempty" xml:"parameter,omitempty" type:"Repeated"`
	// up_function_name
	UpFunctionName *string `json:"up_function_name,omitempty" xml:"up_function_name,omitempty"`
	// param_path_list
	ParamPathList []*string `json:"param_path_list,omitempty" xml:"param_path_list,omitempty" type:"Repeated"`
	// dubbo发布服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty"`
	// auth_app_info_id
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// operation_permission
	OperationPermission *bool `json:"operation_permission,omitempty" xml:"operation_permission,omitempty"`
	// data_encryption
	DataEncryption *string `json:"data_encryption,omitempty" xml:"data_encryption,omitempty"`
	// egress_list
	EgressList []*GateWayConfigVO `json:"egress_list,omitempty" xml:"egress_list,omitempty" type:"Repeated"`
	// history_version_list
	HistoryVersionList []*ApiVersionVO `json:"history_version_list,omitempty" xml:"history_version_list,omitempty" type:"Repeated"`
	// GateWayConfigVO
	Ingress *string `json:"ingress,omitempty" xml:"ingress,omitempty"`
	// model
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// req_model_id
	ReqModelId *string `json:"req_model_id,omitempty" xml:"req_model_id,omitempty"`
	// req_model_name
	ReqModelName *string `json:"req_model_name,omitempty" xml:"req_model_name,omitempty"`
	// req_type
	ReqType *string `json:"req_type,omitempty" xml:"req_type,omitempty"`
	// resp_model_id
	RespModelId *string `json:"resp_model_id,omitempty" xml:"resp_model_id,omitempty"`
	// resp_model_name
	RespModelName *string `json:"resp_model_name,omitempty" xml:"resp_model_name,omitempty"`
	// resp_type
	RespType *string `json:"resp_type,omitempty" xml:"resp_type,omitempty"`
	// ingress_list
	IngressList []*GateWayConfigVO `json:"ingress_list,omitempty" xml:"ingress_list,omitempty" type:"Repeated"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// api_count
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// field_mapping
	FieldMapping []*ApiflowOutputVO `json:"field_mapping,omitempty" xml:"field_mapping,omitempty" type:"Repeated"`
	// need_tls
	NeedTls *bool `json:"need_tls,omitempty" xml:"need_tls,omitempty"`
}

func (s ApiTransferVO) String() string {
	return tea.Prettify(s)
}

func (s ApiTransferVO) GoString() string {
	return s.String()
}

func (s *ApiTransferVO) SetApiCacheModel(v *ApiCacheVO) *ApiTransferVO {
	s.ApiCacheModel = v
	return s
}

func (s *ApiTransferVO) SetApiGroup(v *ApiGroupVO) *ApiTransferVO {
	s.ApiGroup = v
	return s
}

func (s *ApiTransferVO) SetApiGroupId(v string) *ApiTransferVO {
	s.ApiGroupId = &v
	return s
}

func (s *ApiTransferVO) SetApiGroupName(v string) *ApiTransferVO {
	s.ApiGroupName = &v
	return s
}

func (s *ApiTransferVO) SetApiId(v string) *ApiTransferVO {
	s.ApiId = &v
	return s
}

func (s *ApiTransferVO) SetApiLimitConfig(v *LimitConfigVO) *ApiTransferVO {
	s.ApiLimitConfig = v
	return s
}

func (s *ApiTransferVO) SetApiMockConfig(v *ApiMockConfigVO) *ApiTransferVO {
	s.ApiMockConfig = v
	return s
}

func (s *ApiTransferVO) SetApiName(v string) *ApiTransferVO {
	s.ApiName = &v
	return s
}

func (s *ApiTransferVO) SetApiStatus(v string) *ApiTransferVO {
	s.ApiStatus = &v
	return s
}

func (s *ApiTransferVO) SetAppType(v string) *ApiTransferVO {
	s.AppType = &v
	return s
}

func (s *ApiTransferVO) SetAuthenticationType(v string) *ApiTransferVO {
	s.AuthenticationType = &v
	return s
}

func (s *ApiTransferVO) SetAuthAppCount(v int64) *ApiTransferVO {
	s.AuthAppCount = &v
	return s
}

func (s *ApiTransferVO) SetCanDelete(v bool) *ApiTransferVO {
	s.CanDelete = &v
	return s
}

func (s *ApiTransferVO) SetCharset(v string) *ApiTransferVO {
	s.Charset = &v
	return s
}

func (s *ApiTransferVO) SetCheckResult(v string) *ApiTransferVO {
	s.CheckResult = &v
	return s
}

func (s *ApiTransferVO) SetCompleteInterfaceName(v string) *ApiTransferVO {
	s.CompleteInterfaceName = &v
	return s
}

func (s *ApiTransferVO) SetContentType(v string) *ApiTransferVO {
	s.ContentType = &v
	return s
}

func (s *ApiTransferVO) SetCorsId(v string) *ApiTransferVO {
	s.CorsId = &v
	return s
}

func (s *ApiTransferVO) SetCorsInfo(v *CorsInfoVO) *ApiTransferVO {
	s.CorsInfo = v
	return s
}

func (s *ApiTransferVO) SetCurrentVersionNo(v string) *ApiTransferVO {
	s.CurrentVersionNo = &v
	return s
}

func (s *ApiTransferVO) SetDescription(v string) *ApiTransferVO {
	s.Description = &v
	return s
}

func (s *ApiTransferVO) SetDomainName(v string) *ApiTransferVO {
	s.DomainName = &v
	return s
}

func (s *ApiTransferVO) SetDownstreamProtocol(v string) *ApiTransferVO {
	s.DownstreamProtocol = &v
	return s
}

func (s *ApiTransferVO) SetEditVersion(v *ApiVersionVO) *ApiTransferVO {
	s.EditVersion = v
	return s
}

func (s *ApiTransferVO) SetEditVersionNo(v string) *ApiTransferVO {
	s.EditVersionNo = &v
	return s
}

func (s *ApiTransferVO) SetExternalAuth(v *ExternalAuthInfoVO) *ApiTransferVO {
	s.ExternalAuth = v
	return s
}

func (s *ApiTransferVO) SetExternalAuthId(v string) *ApiTransferVO {
	s.ExternalAuthId = &v
	return s
}

func (s *ApiTransferVO) SetFunctionName(v string) *ApiTransferVO {
	s.FunctionName = &v
	return s
}

func (s *ApiTransferVO) SetGmtCreate(v string) *ApiTransferVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiTransferVO) SetGmtModified(v string) *ApiTransferVO {
	s.GmtModified = &v
	return s
}

func (s *ApiTransferVO) SetInterfaceName(v string) *ApiTransferVO {
	s.InterfaceName = &v
	return s
}

func (s *ApiTransferVO) SetMethod(v string) *ApiTransferVO {
	s.Method = &v
	return s
}

func (s *ApiTransferVO) SetOnlineVersion(v *ApiVersionVO) *ApiTransferVO {
	s.OnlineVersion = v
	return s
}

func (s *ApiTransferVO) SetOnlineVersionNo(v string) *ApiTransferVO {
	s.OnlineVersionNo = &v
	return s
}

func (s *ApiTransferVO) SetOperationType(v string) *ApiTransferVO {
	s.OperationType = &v
	return s
}

func (s *ApiTransferVO) SetOperator(v string) *ApiTransferVO {
	s.Operator = &v
	return s
}

func (s *ApiTransferVO) SetPath(v string) *ApiTransferVO {
	s.Path = &v
	return s
}

func (s *ApiTransferVO) SetPathMatchType(v string) *ApiTransferVO {
	s.PathMatchType = &v
	return s
}

func (s *ApiTransferVO) SetReqParams(v []*ApiParamVO) *ApiTransferVO {
	s.ReqParams = v
	return s
}

func (s *ApiTransferVO) SetReqParamMapping(v *ParamMappingInfoVO) *ApiTransferVO {
	s.ReqParamMapping = v
	return s
}

func (s *ApiTransferVO) SetReqParamMappingId(v string) *ApiTransferVO {
	s.ReqParamMappingId = &v
	return s
}

func (s *ApiTransferVO) SetReqParamMappingType(v string) *ApiTransferVO {
	s.ReqParamMappingType = &v
	return s
}

func (s *ApiTransferVO) SetRespParamMapping(v *ParamMappingInfoVO) *ApiTransferVO {
	s.RespParamMapping = v
	return s
}

func (s *ApiTransferVO) SetRespParamMappingId(v string) *ApiTransferVO {
	s.RespParamMappingId = &v
	return s
}

func (s *ApiTransferVO) SetRouterId(v string) *ApiTransferVO {
	s.RouterId = &v
	return s
}

func (s *ApiTransferVO) SetRouterInfo(v *RouterInfoVO) *ApiTransferVO {
	s.RouterInfo = v
	return s
}

func (s *ApiTransferVO) SetRouterType(v string) *ApiTransferVO {
	s.RouterType = &v
	return s
}

func (s *ApiTransferVO) SetRsqParam(v *ApiParamVO) *ApiTransferVO {
	s.RsqParam = v
	return s
}

func (s *ApiTransferVO) SetSystemCluster(v *SystemClusterVO) *ApiTransferVO {
	s.SystemCluster = v
	return s
}

func (s *ApiTransferVO) SetSysId(v string) *ApiTransferVO {
	s.SysId = &v
	return s
}

func (s *ApiTransferVO) SetTargetWorkspaceId(v string) *ApiTransferVO {
	s.TargetWorkspaceId = &v
	return s
}

func (s *ApiTransferVO) SetTenantId(v string) *ApiTransferVO {
	s.TenantId = &v
	return s
}

func (s *ApiTransferVO) SetTimeout(v int64) *ApiTransferVO {
	s.Timeout = &v
	return s
}

func (s *ApiTransferVO) SetUniqueId(v string) *ApiTransferVO {
	s.UniqueId = &v
	return s
}

func (s *ApiTransferVO) SetUpdateConfigList(v []*string) *ApiTransferVO {
	s.UpdateConfigList = v
	return s
}

func (s *ApiTransferVO) SetUpstreamParamMappings(v []*ApiParamVO) *ApiTransferVO {
	s.UpstreamParamMappings = v
	return s
}

func (s *ApiTransferVO) SetUpstreamPath(v string) *ApiTransferVO {
	s.UpstreamPath = &v
	return s
}

func (s *ApiTransferVO) SetUpstreamProtocol(v string) *ApiTransferVO {
	s.UpstreamProtocol = &v
	return s
}

func (s *ApiTransferVO) SetUpstreamType(v string) *ApiTransferVO {
	s.UpstreamType = &v
	return s
}

func (s *ApiTransferVO) SetWorkspaceId(v string) *ApiTransferVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiTransferVO) SetImportResult(v string) *ApiTransferVO {
	s.ImportResult = &v
	return s
}

func (s *ApiTransferVO) SetDomainList(v []*ApiGroupDomainVO) *ApiTransferVO {
	s.DomainList = v
	return s
}

func (s *ApiTransferVO) SetStrategyId(v string) *ApiTransferVO {
	s.StrategyId = &v
	return s
}

func (s *ApiTransferVO) SetStrategyInfo(v *StrategyInfoVO) *ApiTransferVO {
	s.StrategyInfo = v
	return s
}

func (s *ApiTransferVO) SetApiType(v string) *ApiTransferVO {
	s.ApiType = &v
	return s
}

func (s *ApiTransferVO) SetApiCrossZoneList(v []*ApiCrossZoneVO) *ApiTransferVO {
	s.ApiCrossZoneList = v
	return s
}

func (s *ApiTransferVO) SetRegistryGroup(v string) *ApiTransferVO {
	s.RegistryGroup = &v
	return s
}

func (s *ApiTransferVO) SetParameter(v []*string) *ApiTransferVO {
	s.Parameter = v
	return s
}

func (s *ApiTransferVO) SetUpFunctionName(v string) *ApiTransferVO {
	s.UpFunctionName = &v
	return s
}

func (s *ApiTransferVO) SetParamPathList(v []*string) *ApiTransferVO {
	s.ParamPathList = v
	return s
}

func (s *ApiTransferVO) SetServiceVersion(v string) *ApiTransferVO {
	s.ServiceVersion = &v
	return s
}

func (s *ApiTransferVO) SetAuthAppInfoId(v string) *ApiTransferVO {
	s.AuthAppInfoId = &v
	return s
}

func (s *ApiTransferVO) SetOperationPermission(v bool) *ApiTransferVO {
	s.OperationPermission = &v
	return s
}

func (s *ApiTransferVO) SetDataEncryption(v string) *ApiTransferVO {
	s.DataEncryption = &v
	return s
}

func (s *ApiTransferVO) SetEgressList(v []*GateWayConfigVO) *ApiTransferVO {
	s.EgressList = v
	return s
}

func (s *ApiTransferVO) SetHistoryVersionList(v []*ApiVersionVO) *ApiTransferVO {
	s.HistoryVersionList = v
	return s
}

func (s *ApiTransferVO) SetIngress(v string) *ApiTransferVO {
	s.Ingress = &v
	return s
}

func (s *ApiTransferVO) SetModel(v string) *ApiTransferVO {
	s.Model = &v
	return s
}

func (s *ApiTransferVO) SetReqModelId(v string) *ApiTransferVO {
	s.ReqModelId = &v
	return s
}

func (s *ApiTransferVO) SetReqModelName(v string) *ApiTransferVO {
	s.ReqModelName = &v
	return s
}

func (s *ApiTransferVO) SetReqType(v string) *ApiTransferVO {
	s.ReqType = &v
	return s
}

func (s *ApiTransferVO) SetRespModelId(v string) *ApiTransferVO {
	s.RespModelId = &v
	return s
}

func (s *ApiTransferVO) SetRespModelName(v string) *ApiTransferVO {
	s.RespModelName = &v
	return s
}

func (s *ApiTransferVO) SetRespType(v string) *ApiTransferVO {
	s.RespType = &v
	return s
}

func (s *ApiTransferVO) SetIngressList(v []*GateWayConfigVO) *ApiTransferVO {
	s.IngressList = v
	return s
}

func (s *ApiTransferVO) SetContent(v string) *ApiTransferVO {
	s.Content = &v
	return s
}

func (s *ApiTransferVO) SetApiCount(v int64) *ApiTransferVO {
	s.ApiCount = &v
	return s
}

func (s *ApiTransferVO) SetFieldMapping(v []*ApiflowOutputVO) *ApiTransferVO {
	s.FieldMapping = v
	return s
}

func (s *ApiTransferVO) SetNeedTls(v bool) *ApiTransferVO {
	s.NeedTls = &v
	return s
}

// ApiInfoVO
type ApiInfoVO struct {
	// API缓存模型
	ApiCacheModel *ApiCacheVO `json:"api_cache_model,omitempty" xml:"api_cache_model,omitempty"`
	// api的网关配置列表
	ApiCrossZoneList []*ApiCrossZoneVO `json:"api_cross_zone_list,omitempty" xml:"api_cross_zone_list,omitempty" type:"Repeated"`
	// API分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// 所属API分组名称
	ApiGroupName *string `json:"api_group_name,omitempty" xml:"api_group_name,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// API限流配置
	ApiLimitConfig *LimitConfigVO `json:"api_limit_config,omitempty" xml:"api_limit_config,omitempty"`
	// api_mock_config
	ApiMockConfig *ApiMockConfigVO `json:"api_mock_config,omitempty" xml:"api_mock_config,omitempty"`
	// API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty"`
	// apiStatus
	ApiStatus *string `json:"api_status,omitempty" xml:"api_status,omitempty"`
	// crossZone双网关 (api 类型)
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
	// 授权应用类型
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
	// authentication_type
	AuthenticationType *string `json:"authentication_type,omitempty" xml:"authentication_type,omitempty"`
	// auth_app_count
	AuthAppCount *int64 `json:"auth_app_count,omitempty" xml:"auth_app_count,omitempty"`
	// 授权应用Id
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// 是否可以删除
	CanDelete *bool `json:"can_delete,omitempty" xml:"can_delete,omitempty"`
	// 操作权限
	OperationPermission *bool `json:"operation_permission,omitempty" xml:"operation_permission,omitempty"`
	// charset
	Charset *string `json:"charset,omitempty" xml:"charset,omitempty"`
	// 完整interfacename
	CompleteInterfaceName *string `json:"complete_interface_name,omitempty" xml:"complete_interface_name,omitempty"`
	// contentType
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// cors_id
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// cors_info
	CorsInfo *CorsInfoVO `json:"cors_info,omitempty" xml:"cors_info,omitempty"`
	// 当前显示的版本
	CurrentVersionNo *string `json:"current_version_no,omitempty" xml:"current_version_no,omitempty"`
	// 数据加密
	DataEncryption *string `json:"data_encryption,omitempty" xml:"data_encryption,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// API分组域名
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty"`
	// downstreamProtocol
	DownstreamProtocol *string `json:"downstream_protocol,omitempty" xml:"downstream_protocol,omitempty"`
	// edit_version
	EditVersion *ApiVersionVO `json:"edit_version,omitempty" xml:"edit_version,omitempty"`
	// 编辑中的API版本号
	EditVersionNo *string `json:"edit_version_no,omitempty" xml:"edit_version_no,omitempty"`
	// 出口网关列表
	EgressList []*GateWayConfigVO `json:"egress_list,omitempty" xml:"egress_list,omitempty" type:"Repeated"`
	// external_auth
	ExternalAuth *ExternalAuthInfoVO `json:"external_auth,omitempty" xml:"external_auth,omitempty"`
	// 外部系统标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty"`
	// 方法名
	FunctionName *string `json:"function_name,omitempty" xml:"function_name,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// history_version
	HistoryVersionList []*ApiVersionVO `json:"history_version_list,omitempty" xml:"history_version_list,omitempty" type:"Repeated"`
	// 入口网关
	Ingress *GateWayConfigVO `json:"ingress,omitempty" xml:"ingress,omitempty"`
	// 接口名称
	InterfaceName *string `json:"interface_name,omitempty" xml:"interface_name,omitempty"`
	// method
	Method *string `json:"method,omitempty" xml:"method,omitempty"`
	// 网关模式
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// onlineVersion
	OnlineVersion *ApiVersionVO `json:"online_version,omitempty" xml:"online_version,omitempty"`
	// 发布中的API版本号
	OnlineVersionNo *string `json:"online_version_no,omitempty" xml:"online_version_no,omitempty"`
	// operationType
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 创建人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// path
	Path *string `json:"path,omitempty" xml:"path,omitempty"`
	// 路径匹配类型
	PathMatchType *string `json:"path_match_type,omitempty" xml:"path_match_type,omitempty"`
	// 请求body模型id
	ReqModelId *string `json:"req_model_id,omitempty" xml:"req_model_id,omitempty"`
	// 请求模型名称
	ReqModelName *string `json:"req_model_name,omitempty" xml:"req_model_name,omitempty"`
	// reqParams
	ReqParams []*ApiParamVO `json:"req_params,omitempty" xml:"req_params,omitempty" type:"Repeated"`
	// reqparammapping
	ReqParamMapping *ParamMappingInfoVO `json:"req_param_mapping,omitempty" xml:"req_param_mapping,omitempty"`
	// 请求参数映射标识
	ReqParamMappingId *string `json:"req_param_mapping_id,omitempty" xml:"req_param_mapping_id,omitempty"`
	// 参数映射类型（普通\高级）
	ReqParamMappingType *string `json:"req_param_mapping_type,omitempty" xml:"req_param_mapping_type,omitempty"`
	// body类型一级参数
	ReqType *string `json:"req_type,omitempty" xml:"req_type,omitempty"`
	// 响应参数模型
	RespModelId *string `json:"resp_model_id,omitempty" xml:"resp_model_id,omitempty"`
	// 响应模型名称
	RespModelName *string `json:"resp_model_name,omitempty" xml:"resp_model_name,omitempty"`
	// respparammapping
	RespParamMapping *ParamMappingInfoVO `json:"resp_param_mapping,omitempty" xml:"resp_param_mapping,omitempty"`
	// 响应参数标识
	RespParamMappingId *string `json:"resp_param_mapping_id,omitempty" xml:"resp_param_mapping_id,omitempty"`
	// 响应参数一级类型
	RespType *string `json:"resp_type,omitempty" xml:"resp_type,omitempty"`
	// router_id
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	// 路由规则
	RouterInfo *RouterInfoVO `json:"router_info,omitempty" xml:"router_info,omitempty"`
	// 路由策略类型
	RouterType *string `json:"router_type,omitempty" xml:"router_type,omitempty"`
	// rsqParam
	RsqParam *ApiParamVO `json:"rsq_param,omitempty" xml:"rsq_param,omitempty"`
	// 后端集群
	SystemCluster *SystemClusterVO `json:"system_cluster,omitempty" xml:"system_cluster,omitempty"`
	// sys_id
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// timeout
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// unique_id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// upstreamParamMappings
	UpstreamParamMappings []*ApiParamVO `json:"upstream_param_mappings,omitempty" xml:"upstream_param_mappings,omitempty" type:"Repeated"`
	// upstreamPath
	UpstreamPath *string `json:"upstream_path,omitempty" xml:"upstream_path,omitempty"`
	// upstreamProtocol
	UpstreamProtocol *string `json:"upstream_protocol,omitempty" xml:"upstream_protocol,omitempty"`
	// 后端服务类型
	UpstreamType *string `json:"upstream_type,omitempty" xml:"upstream_type,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 策略ID
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// 策略详情
	StrategyInfo *StrategyInfoVO `json:"strategy_info,omitempty" xml:"strategy_info,omitempty"`
	// domain_list
	DomainList []*ApiGroupDomainVO `json:"domain_list,omitempty" xml:"domain_list,omitempty" type:"Repeated"`
	// registry_group
	RegistryGroup *string `json:"registry_group,omitempty" xml:"registry_group,omitempty"`
	// param_path_list
	ParamPathList []*string `json:"param_path_list,omitempty" xml:"param_path_list,omitempty" type:"Repeated"`
	// 后端方法名
	UpFunctionName *string `json:"up_function_name,omitempty" xml:"up_function_name,omitempty"`
	// dubbo发布服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty"`
	// 入口网关
	IngressList []*GateWayConfigVO `json:"ingress_list,omitempty" xml:"ingress_list,omitempty" type:"Repeated"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// api_count
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// 流程编排的返回参数映射
	FieldMapping []*ApiflowOutputVO `json:"field_mapping,omitempty" xml:"field_mapping,omitempty" type:"Repeated"`
	// triple协议证书开关
	NeedTls *bool `json:"need_tls,omitempty" xml:"need_tls,omitempty"`
	// api_group_info
	ApiGroupInfo *ApiGroupVO `json:"api_group_info,omitempty" xml:"api_group_info,omitempty"`
	// 授权对象列表
	AuthAppInfoList []*AuthAppInfoVO `json:"auth_app_info_list,omitempty" xml:"auth_app_info_list,omitempty" type:"Repeated"`
	// 请求body数据模型
	ReqModelInfo *ApiModelVO `json:"req_model_info,omitempty" xml:"req_model_info,omitempty"`
	// 返回body数据模型
	RspModelInfo *ApiModelVO `json:"rsp_model_info,omitempty" xml:"rsp_model_info,omitempty"`
	// 实例ID
	UpstreamInstanceId *string `json:"upstream_instance_id,omitempty" xml:"upstream_instance_id,omitempty"`
}

func (s ApiInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ApiInfoVO) GoString() string {
	return s.String()
}

func (s *ApiInfoVO) SetApiCacheModel(v *ApiCacheVO) *ApiInfoVO {
	s.ApiCacheModel = v
	return s
}

func (s *ApiInfoVO) SetApiCrossZoneList(v []*ApiCrossZoneVO) *ApiInfoVO {
	s.ApiCrossZoneList = v
	return s
}

func (s *ApiInfoVO) SetApiGroupId(v string) *ApiInfoVO {
	s.ApiGroupId = &v
	return s
}

func (s *ApiInfoVO) SetApiGroupName(v string) *ApiInfoVO {
	s.ApiGroupName = &v
	return s
}

func (s *ApiInfoVO) SetApiId(v string) *ApiInfoVO {
	s.ApiId = &v
	return s
}

func (s *ApiInfoVO) SetApiLimitConfig(v *LimitConfigVO) *ApiInfoVO {
	s.ApiLimitConfig = v
	return s
}

func (s *ApiInfoVO) SetApiMockConfig(v *ApiMockConfigVO) *ApiInfoVO {
	s.ApiMockConfig = v
	return s
}

func (s *ApiInfoVO) SetApiName(v string) *ApiInfoVO {
	s.ApiName = &v
	return s
}

func (s *ApiInfoVO) SetApiStatus(v string) *ApiInfoVO {
	s.ApiStatus = &v
	return s
}

func (s *ApiInfoVO) SetApiType(v string) *ApiInfoVO {
	s.ApiType = &v
	return s
}

func (s *ApiInfoVO) SetAppType(v string) *ApiInfoVO {
	s.AppType = &v
	return s
}

func (s *ApiInfoVO) SetAuthenticationType(v string) *ApiInfoVO {
	s.AuthenticationType = &v
	return s
}

func (s *ApiInfoVO) SetAuthAppCount(v int64) *ApiInfoVO {
	s.AuthAppCount = &v
	return s
}

func (s *ApiInfoVO) SetAuthAppInfoId(v string) *ApiInfoVO {
	s.AuthAppInfoId = &v
	return s
}

func (s *ApiInfoVO) SetCanDelete(v bool) *ApiInfoVO {
	s.CanDelete = &v
	return s
}

func (s *ApiInfoVO) SetOperationPermission(v bool) *ApiInfoVO {
	s.OperationPermission = &v
	return s
}

func (s *ApiInfoVO) SetCharset(v string) *ApiInfoVO {
	s.Charset = &v
	return s
}

func (s *ApiInfoVO) SetCompleteInterfaceName(v string) *ApiInfoVO {
	s.CompleteInterfaceName = &v
	return s
}

func (s *ApiInfoVO) SetContentType(v string) *ApiInfoVO {
	s.ContentType = &v
	return s
}

func (s *ApiInfoVO) SetCorsId(v string) *ApiInfoVO {
	s.CorsId = &v
	return s
}

func (s *ApiInfoVO) SetCorsInfo(v *CorsInfoVO) *ApiInfoVO {
	s.CorsInfo = v
	return s
}

func (s *ApiInfoVO) SetCurrentVersionNo(v string) *ApiInfoVO {
	s.CurrentVersionNo = &v
	return s
}

func (s *ApiInfoVO) SetDataEncryption(v string) *ApiInfoVO {
	s.DataEncryption = &v
	return s
}

func (s *ApiInfoVO) SetDescription(v string) *ApiInfoVO {
	s.Description = &v
	return s
}

func (s *ApiInfoVO) SetDomainName(v string) *ApiInfoVO {
	s.DomainName = &v
	return s
}

func (s *ApiInfoVO) SetDownstreamProtocol(v string) *ApiInfoVO {
	s.DownstreamProtocol = &v
	return s
}

func (s *ApiInfoVO) SetEditVersion(v *ApiVersionVO) *ApiInfoVO {
	s.EditVersion = v
	return s
}

func (s *ApiInfoVO) SetEditVersionNo(v string) *ApiInfoVO {
	s.EditVersionNo = &v
	return s
}

func (s *ApiInfoVO) SetEgressList(v []*GateWayConfigVO) *ApiInfoVO {
	s.EgressList = v
	return s
}

func (s *ApiInfoVO) SetExternalAuth(v *ExternalAuthInfoVO) *ApiInfoVO {
	s.ExternalAuth = v
	return s
}

func (s *ApiInfoVO) SetExternalAuthId(v string) *ApiInfoVO {
	s.ExternalAuthId = &v
	return s
}

func (s *ApiInfoVO) SetFunctionName(v string) *ApiInfoVO {
	s.FunctionName = &v
	return s
}

func (s *ApiInfoVO) SetGmtCreate(v string) *ApiInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *ApiInfoVO) SetGmtModified(v string) *ApiInfoVO {
	s.GmtModified = &v
	return s
}

func (s *ApiInfoVO) SetHistoryVersionList(v []*ApiVersionVO) *ApiInfoVO {
	s.HistoryVersionList = v
	return s
}

func (s *ApiInfoVO) SetIngress(v *GateWayConfigVO) *ApiInfoVO {
	s.Ingress = v
	return s
}

func (s *ApiInfoVO) SetInterfaceName(v string) *ApiInfoVO {
	s.InterfaceName = &v
	return s
}

func (s *ApiInfoVO) SetMethod(v string) *ApiInfoVO {
	s.Method = &v
	return s
}

func (s *ApiInfoVO) SetModel(v string) *ApiInfoVO {
	s.Model = &v
	return s
}

func (s *ApiInfoVO) SetOnlineVersion(v *ApiVersionVO) *ApiInfoVO {
	s.OnlineVersion = v
	return s
}

func (s *ApiInfoVO) SetOnlineVersionNo(v string) *ApiInfoVO {
	s.OnlineVersionNo = &v
	return s
}

func (s *ApiInfoVO) SetOperationType(v string) *ApiInfoVO {
	s.OperationType = &v
	return s
}

func (s *ApiInfoVO) SetOperator(v string) *ApiInfoVO {
	s.Operator = &v
	return s
}

func (s *ApiInfoVO) SetPath(v string) *ApiInfoVO {
	s.Path = &v
	return s
}

func (s *ApiInfoVO) SetPathMatchType(v string) *ApiInfoVO {
	s.PathMatchType = &v
	return s
}

func (s *ApiInfoVO) SetReqModelId(v string) *ApiInfoVO {
	s.ReqModelId = &v
	return s
}

func (s *ApiInfoVO) SetReqModelName(v string) *ApiInfoVO {
	s.ReqModelName = &v
	return s
}

func (s *ApiInfoVO) SetReqParams(v []*ApiParamVO) *ApiInfoVO {
	s.ReqParams = v
	return s
}

func (s *ApiInfoVO) SetReqParamMapping(v *ParamMappingInfoVO) *ApiInfoVO {
	s.ReqParamMapping = v
	return s
}

func (s *ApiInfoVO) SetReqParamMappingId(v string) *ApiInfoVO {
	s.ReqParamMappingId = &v
	return s
}

func (s *ApiInfoVO) SetReqParamMappingType(v string) *ApiInfoVO {
	s.ReqParamMappingType = &v
	return s
}

func (s *ApiInfoVO) SetReqType(v string) *ApiInfoVO {
	s.ReqType = &v
	return s
}

func (s *ApiInfoVO) SetRespModelId(v string) *ApiInfoVO {
	s.RespModelId = &v
	return s
}

func (s *ApiInfoVO) SetRespModelName(v string) *ApiInfoVO {
	s.RespModelName = &v
	return s
}

func (s *ApiInfoVO) SetRespParamMapping(v *ParamMappingInfoVO) *ApiInfoVO {
	s.RespParamMapping = v
	return s
}

func (s *ApiInfoVO) SetRespParamMappingId(v string) *ApiInfoVO {
	s.RespParamMappingId = &v
	return s
}

func (s *ApiInfoVO) SetRespType(v string) *ApiInfoVO {
	s.RespType = &v
	return s
}

func (s *ApiInfoVO) SetRouterId(v string) *ApiInfoVO {
	s.RouterId = &v
	return s
}

func (s *ApiInfoVO) SetRouterInfo(v *RouterInfoVO) *ApiInfoVO {
	s.RouterInfo = v
	return s
}

func (s *ApiInfoVO) SetRouterType(v string) *ApiInfoVO {
	s.RouterType = &v
	return s
}

func (s *ApiInfoVO) SetRsqParam(v *ApiParamVO) *ApiInfoVO {
	s.RsqParam = v
	return s
}

func (s *ApiInfoVO) SetSystemCluster(v *SystemClusterVO) *ApiInfoVO {
	s.SystemCluster = v
	return s
}

func (s *ApiInfoVO) SetSysId(v string) *ApiInfoVO {
	s.SysId = &v
	return s
}

func (s *ApiInfoVO) SetTenantId(v string) *ApiInfoVO {
	s.TenantId = &v
	return s
}

func (s *ApiInfoVO) SetTimeout(v int64) *ApiInfoVO {
	s.Timeout = &v
	return s
}

func (s *ApiInfoVO) SetUniqueId(v string) *ApiInfoVO {
	s.UniqueId = &v
	return s
}

func (s *ApiInfoVO) SetUpstreamParamMappings(v []*ApiParamVO) *ApiInfoVO {
	s.UpstreamParamMappings = v
	return s
}

func (s *ApiInfoVO) SetUpstreamPath(v string) *ApiInfoVO {
	s.UpstreamPath = &v
	return s
}

func (s *ApiInfoVO) SetUpstreamProtocol(v string) *ApiInfoVO {
	s.UpstreamProtocol = &v
	return s
}

func (s *ApiInfoVO) SetUpstreamType(v string) *ApiInfoVO {
	s.UpstreamType = &v
	return s
}

func (s *ApiInfoVO) SetWorkspaceId(v string) *ApiInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiInfoVO) SetStrategyId(v string) *ApiInfoVO {
	s.StrategyId = &v
	return s
}

func (s *ApiInfoVO) SetStrategyInfo(v *StrategyInfoVO) *ApiInfoVO {
	s.StrategyInfo = v
	return s
}

func (s *ApiInfoVO) SetDomainList(v []*ApiGroupDomainVO) *ApiInfoVO {
	s.DomainList = v
	return s
}

func (s *ApiInfoVO) SetRegistryGroup(v string) *ApiInfoVO {
	s.RegistryGroup = &v
	return s
}

func (s *ApiInfoVO) SetParamPathList(v []*string) *ApiInfoVO {
	s.ParamPathList = v
	return s
}

func (s *ApiInfoVO) SetUpFunctionName(v string) *ApiInfoVO {
	s.UpFunctionName = &v
	return s
}

func (s *ApiInfoVO) SetServiceVersion(v string) *ApiInfoVO {
	s.ServiceVersion = &v
	return s
}

func (s *ApiInfoVO) SetIngressList(v []*GateWayConfigVO) *ApiInfoVO {
	s.IngressList = v
	return s
}

func (s *ApiInfoVO) SetContent(v string) *ApiInfoVO {
	s.Content = &v
	return s
}

func (s *ApiInfoVO) SetApiCount(v int64) *ApiInfoVO {
	s.ApiCount = &v
	return s
}

func (s *ApiInfoVO) SetFieldMapping(v []*ApiflowOutputVO) *ApiInfoVO {
	s.FieldMapping = v
	return s
}

func (s *ApiInfoVO) SetNeedTls(v bool) *ApiInfoVO {
	s.NeedTls = &v
	return s
}

func (s *ApiInfoVO) SetApiGroupInfo(v *ApiGroupVO) *ApiInfoVO {
	s.ApiGroupInfo = v
	return s
}

func (s *ApiInfoVO) SetAuthAppInfoList(v []*AuthAppInfoVO) *ApiInfoVO {
	s.AuthAppInfoList = v
	return s
}

func (s *ApiInfoVO) SetReqModelInfo(v *ApiModelVO) *ApiInfoVO {
	s.ReqModelInfo = v
	return s
}

func (s *ApiInfoVO) SetRspModelInfo(v *ApiModelVO) *ApiInfoVO {
	s.RspModelInfo = v
	return s
}

func (s *ApiInfoVO) SetUpstreamInstanceId(v string) *ApiInfoVO {
	s.UpstreamInstanceId = &v
	return s
}

// 集群里的服务器信息
type SofaGwHostVO struct {
	// 服务器地址，域名或ip(:端口)
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// host name
	HostName *string `json:"host_name,omitempty" xml:"host_name,omitempty"`
	// 元信息
	MetaData *string `json:"meta_data,omitempty" xml:"meta_data,omitempty"`
}

func (s SofaGwHostVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwHostVO) GoString() string {
	return s.String()
}

func (s *SofaGwHostVO) SetAddress(v string) *SofaGwHostVO {
	s.Address = &v
	return s
}

func (s *SofaGwHostVO) SetHostName(v string) *SofaGwHostVO {
	s.HostName = &v
	return s
}

func (s *SofaGwHostVO) SetMetaData(v string) *SofaGwHostVO {
	s.MetaData = &v
	return s
}

// 后端配置
type SofaGwUpstreamVO struct {
	// GET/POST/PUT/DELETE
	Method *string `json:"method,omitempty" xml:"method,omitempty"`
	// 协议
	Schema *string `json:"schema,omitempty" xml:"schema,omitempty"`
	// timeout
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 是否签名
	Verify *bool `json:"verify,omitempty" xml:"verify,omitempty"`
}

func (s SofaGwUpstreamVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwUpstreamVO) GoString() string {
	return s.String()
}

func (s *SofaGwUpstreamVO) SetMethod(v string) *SofaGwUpstreamVO {
	s.Method = &v
	return s
}

func (s *SofaGwUpstreamVO) SetSchema(v string) *SofaGwUpstreamVO {
	s.Schema = &v
	return s
}

func (s *SofaGwUpstreamVO) SetTimeout(v int64) *SofaGwUpstreamVO {
	s.Timeout = &v
	return s
}

func (s *SofaGwUpstreamVO) SetUrl(v string) *SofaGwUpstreamVO {
	s.Url = &v
	return s
}

func (s *SofaGwUpstreamVO) SetVerify(v bool) *SofaGwUpstreamVO {
	s.Verify = &v
	return s
}

// ApiflowMachineInstVO
type ApiflowMachineInstVO struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// machine_id
	MachineId *string `json:"machine_id,omitempty" xml:"machine_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// parent_id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// gmt_started
	GmtStarted *string `json:"gmt_started,omitempty" xml:"gmt_started,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// business_key
	BusinessKey *string `json:"business_key,omitempty" xml:"business_key,omitempty"`
	// start_params
	StartParams *string `json:"start_params,omitempty" xml:"start_params,omitempty"`
	// gmt_end
	GmtEnd *string `json:"gmt_end,omitempty" xml:"gmt_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// excep
	Excep *string `json:"excep,omitempty" xml:"excep,omitempty"`
	// end_params
	EndParams *string `json:"end_params,omitempty" xml:"end_params,omitempty"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// compensation_status
	CompensationStatus *string `json:"compensation_status,omitempty" xml:"compensation_status,omitempty"`
	// is_running
	IsRunning *bool `json:"is_running,omitempty" xml:"is_running,omitempty"`
	// gmt_updated
	GmtUpdated *string `json:"gmt_updated,omitempty" xml:"gmt_updated,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ApiflowMachineInstVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineInstVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineInstVO) SetId(v string) *ApiflowMachineInstVO {
	s.Id = &v
	return s
}

func (s *ApiflowMachineInstVO) SetMachineId(v string) *ApiflowMachineInstVO {
	s.MachineId = &v
	return s
}

func (s *ApiflowMachineInstVO) SetTenantId(v string) *ApiflowMachineInstVO {
	s.TenantId = &v
	return s
}

func (s *ApiflowMachineInstVO) SetParentId(v string) *ApiflowMachineInstVO {
	s.ParentId = &v
	return s
}

func (s *ApiflowMachineInstVO) SetGmtStarted(v string) *ApiflowMachineInstVO {
	s.GmtStarted = &v
	return s
}

func (s *ApiflowMachineInstVO) SetBusinessKey(v string) *ApiflowMachineInstVO {
	s.BusinessKey = &v
	return s
}

func (s *ApiflowMachineInstVO) SetStartParams(v string) *ApiflowMachineInstVO {
	s.StartParams = &v
	return s
}

func (s *ApiflowMachineInstVO) SetGmtEnd(v string) *ApiflowMachineInstVO {
	s.GmtEnd = &v
	return s
}

func (s *ApiflowMachineInstVO) SetExcep(v string) *ApiflowMachineInstVO {
	s.Excep = &v
	return s
}

func (s *ApiflowMachineInstVO) SetEndParams(v string) *ApiflowMachineInstVO {
	s.EndParams = &v
	return s
}

func (s *ApiflowMachineInstVO) SetStatus(v string) *ApiflowMachineInstVO {
	s.Status = &v
	return s
}

func (s *ApiflowMachineInstVO) SetCompensationStatus(v string) *ApiflowMachineInstVO {
	s.CompensationStatus = &v
	return s
}

func (s *ApiflowMachineInstVO) SetIsRunning(v bool) *ApiflowMachineInstVO {
	s.IsRunning = &v
	return s
}

func (s *ApiflowMachineInstVO) SetGmtUpdated(v string) *ApiflowMachineInstVO {
	s.GmtUpdated = &v
	return s
}

// BatchActionResult
type BatchActionResult struct {
	// 批量挂载结果
	Results []*ActionResult `json:"results,omitempty" xml:"results,omitempty" type:"Repeated"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// success_count
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// failed_count
	FailedCount *int64 `json:"failed_count,omitempty" xml:"failed_count,omitempty"`
}

func (s BatchActionResult) String() string {
	return tea.Prettify(s)
}

func (s BatchActionResult) GoString() string {
	return s.String()
}

func (s *BatchActionResult) SetResults(v []*ActionResult) *BatchActionResult {
	s.Results = v
	return s
}

func (s *BatchActionResult) SetTotalCount(v int64) *BatchActionResult {
	s.TotalCount = &v
	return s
}

func (s *BatchActionResult) SetSuccessCount(v int64) *BatchActionResult {
	s.SuccessCount = &v
	return s
}

func (s *BatchActionResult) SetFailedCount(v int64) *BatchActionResult {
	s.FailedCount = &v
	return s
}

// ImportResult
type ImportResult struct {
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 覆盖报错的配置
	ErrorConfig *string `json:"error_config,omitempty" xml:"error_config,omitempty"`
	// error_message
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// API的ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// API的名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 覆盖成功的标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 覆盖失败的配置名称
	ConfigName *string `json:"config_name,omitempty" xml:"config_name,omitempty"`
}

func (s ImportResult) String() string {
	return tea.Prettify(s)
}

func (s ImportResult) GoString() string {
	return s.String()
}

func (s *ImportResult) SetCode(v string) *ImportResult {
	s.Code = &v
	return s
}

func (s *ImportResult) SetErrorConfig(v string) *ImportResult {
	s.ErrorConfig = &v
	return s
}

func (s *ImportResult) SetErrorMessage(v string) *ImportResult {
	s.ErrorMessage = &v
	return s
}

func (s *ImportResult) SetId(v string) *ImportResult {
	s.Id = &v
	return s
}

func (s *ImportResult) SetName(v string) *ImportResult {
	s.Name = &v
	return s
}

func (s *ImportResult) SetSuccess(v bool) *ImportResult {
	s.Success = &v
	return s
}

func (s *ImportResult) SetConfigName(v string) *ImportResult {
	s.ConfigName = &v
	return s
}

// ApiTestParamVO
type ApiTestParamVO struct {
	// location
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s ApiTestParamVO) String() string {
	return tea.Prettify(s)
}

func (s ApiTestParamVO) GoString() string {
	return s.String()
}

func (s *ApiTestParamVO) SetLocation(v string) *ApiTestParamVO {
	s.Location = &v
	return s
}

func (s *ApiTestParamVO) SetKey(v string) *ApiTestParamVO {
	s.Key = &v
	return s
}

func (s *ApiTestParamVO) SetValue(v string) *ApiTestParamVO {
	s.Value = &v
	return s
}

// ApiflowInstVO
type ApiflowInstVO struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// machine_inst_id
	MachineInstId *string `json:"machine_inst_id,omitempty" xml:"machine_inst_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// service_name
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty"`
	// service_method
	ServiceMethod *string `json:"service_method,omitempty" xml:"service_method,omitempty"`
	// service_type
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty"`
	// business_key
	BusinessKey *string `json:"business_key,omitempty" xml:"business_key,omitempty"`
	// state_id_compensated_for
	StateIdCompensatedFor *string `json:"state_id_compensated_for,omitempty" xml:"state_id_compensated_for,omitempty"`
	// state_id_retried_for
	StateIdRetriedFor *string `json:"state_id_retried_for,omitempty" xml:"state_id_retried_for,omitempty"`
	// gmt_started
	GmtStarted *string `json:"gmt_started,omitempty" xml:"gmt_started,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// is_for_update
	IsForUpdate *bool `json:"is_for_update,omitempty" xml:"is_for_update,omitempty"`
	// input_params
	InputParams *string `json:"input_params,omitempty" xml:"input_params,omitempty"`
	// output_params
	OutputParams *string `json:"output_params,omitempty" xml:"output_params,omitempty"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// excep
	Excep *string `json:"excep,omitempty" xml:"excep,omitempty"`
	// gmt_updated
	GmtUpdated *string `json:"gmt_updated,omitempty" xml:"gmt_updated,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_end
	GmtEnd *string `json:"gmt_end,omitempty" xml:"gmt_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ApiflowInstVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowInstVO) GoString() string {
	return s.String()
}

func (s *ApiflowInstVO) SetId(v string) *ApiflowInstVO {
	s.Id = &v
	return s
}

func (s *ApiflowInstVO) SetMachineInstId(v string) *ApiflowInstVO {
	s.MachineInstId = &v
	return s
}

func (s *ApiflowInstVO) SetName(v string) *ApiflowInstVO {
	s.Name = &v
	return s
}

func (s *ApiflowInstVO) SetType(v string) *ApiflowInstVO {
	s.Type = &v
	return s
}

func (s *ApiflowInstVO) SetServiceName(v string) *ApiflowInstVO {
	s.ServiceName = &v
	return s
}

func (s *ApiflowInstVO) SetServiceMethod(v string) *ApiflowInstVO {
	s.ServiceMethod = &v
	return s
}

func (s *ApiflowInstVO) SetServiceType(v string) *ApiflowInstVO {
	s.ServiceType = &v
	return s
}

func (s *ApiflowInstVO) SetBusinessKey(v string) *ApiflowInstVO {
	s.BusinessKey = &v
	return s
}

func (s *ApiflowInstVO) SetStateIdCompensatedFor(v string) *ApiflowInstVO {
	s.StateIdCompensatedFor = &v
	return s
}

func (s *ApiflowInstVO) SetStateIdRetriedFor(v string) *ApiflowInstVO {
	s.StateIdRetriedFor = &v
	return s
}

func (s *ApiflowInstVO) SetGmtStarted(v string) *ApiflowInstVO {
	s.GmtStarted = &v
	return s
}

func (s *ApiflowInstVO) SetIsForUpdate(v bool) *ApiflowInstVO {
	s.IsForUpdate = &v
	return s
}

func (s *ApiflowInstVO) SetInputParams(v string) *ApiflowInstVO {
	s.InputParams = &v
	return s
}

func (s *ApiflowInstVO) SetOutputParams(v string) *ApiflowInstVO {
	s.OutputParams = &v
	return s
}

func (s *ApiflowInstVO) SetStatus(v string) *ApiflowInstVO {
	s.Status = &v
	return s
}

func (s *ApiflowInstVO) SetExcep(v string) *ApiflowInstVO {
	s.Excep = &v
	return s
}

func (s *ApiflowInstVO) SetGmtUpdated(v string) *ApiflowInstVO {
	s.GmtUpdated = &v
	return s
}

func (s *ApiflowInstVO) SetGmtEnd(v string) *ApiflowInstVO {
	s.GmtEnd = &v
	return s
}

// 操作人
type OperatorVO struct {
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 企业的唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 操作员ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 操作员状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 租户
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" type:"Repeated"`
	// 操作员最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 操作员工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s OperatorVO) String() string {
	return tea.Prettify(s)
}

func (s OperatorVO) GoString() string {
	return s.String()
}

func (s *OperatorVO) SetCreateTime(v string) *OperatorVO {
	s.CreateTime = &v
	return s
}

func (s *OperatorVO) SetCustomer(v string) *OperatorVO {
	s.Customer = &v
	return s
}

func (s *OperatorVO) SetEmail(v string) *OperatorVO {
	s.Email = &v
	return s
}

func (s *OperatorVO) SetId(v string) *OperatorVO {
	s.Id = &v
	return s
}

func (s *OperatorVO) SetLoginName(v string) *OperatorVO {
	s.LoginName = &v
	return s
}

func (s *OperatorVO) SetMobile(v string) *OperatorVO {
	s.Mobile = &v
	return s
}

func (s *OperatorVO) SetNickName(v string) *OperatorVO {
	s.NickName = &v
	return s
}

func (s *OperatorVO) SetRealName(v string) *OperatorVO {
	s.RealName = &v
	return s
}

func (s *OperatorVO) SetStatus(v string) *OperatorVO {
	s.Status = &v
	return s
}

func (s *OperatorVO) SetTenants(v []*string) *OperatorVO {
	s.Tenants = v
	return s
}

func (s *OperatorVO) SetUpdateTime(v string) *OperatorVO {
	s.UpdateTime = &v
	return s
}

func (s *OperatorVO) SetWorkNo(v string) *OperatorVO {
	s.WorkNo = &v
	return s
}

func (s *OperatorVO) SetTenantId(v string) *OperatorVO {
	s.TenantId = &v
	return s
}

func (s *OperatorVO) SetWorkspaceId(v string) *OperatorVO {
	s.WorkspaceId = &v
	return s
}

// 联系方式
type ContactInfoVO struct {
	// 授权App标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// 公司名称
	Company *string `json:"company,omitempty" xml:"company,omitempty"`
	// 联系方式标识
	ContactId *string `json:"contact_id,omitempty" xml:"contact_id,omitempty"`
	// 电子邮箱
	Mail *string `json:"mail,omitempty" xml:"mail,omitempty"`
	// 联系人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 电话号码
	Tel *string `json:"tel,omitempty" xml:"tel,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ContactInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ContactInfoVO) GoString() string {
	return s.String()
}

func (s *ContactInfoVO) SetAuthAppInfoId(v string) *ContactInfoVO {
	s.AuthAppInfoId = &v
	return s
}

func (s *ContactInfoVO) SetCompany(v string) *ContactInfoVO {
	s.Company = &v
	return s
}

func (s *ContactInfoVO) SetContactId(v string) *ContactInfoVO {
	s.ContactId = &v
	return s
}

func (s *ContactInfoVO) SetMail(v string) *ContactInfoVO {
	s.Mail = &v
	return s
}

func (s *ContactInfoVO) SetName(v string) *ContactInfoVO {
	s.Name = &v
	return s
}

func (s *ContactInfoVO) SetTel(v string) *ContactInfoVO {
	s.Tel = &v
	return s
}

func (s *ContactInfoVO) SetTenantId(v string) *ContactInfoVO {
	s.TenantId = &v
	return s
}

func (s *ContactInfoVO) SetWorkspaceId(v string) *ContactInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *ContactInfoVO) SetGmtCreate(v string) *ContactInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *ContactInfoVO) SetGmtModified(v string) *ContactInfoVO {
	s.GmtModified = &v
	return s
}

// 访问控制
type SofaGwControlVO struct {
	// 要添加的授权的app_name列表
	AddItems []*string `json:"add_items,omitempty" xml:"add_items,omitempty" type:"Repeated"`
	// 实例标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 授权的app_name列表
	Items []*string `json:"items,omitempty" xml:"items,omitempty" type:"Repeated"`
	// 固定值：app
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 要删除的授权的app_name列表
	RemoveItems []*string `json:"remove_items,omitempty" xml:"remove_items,omitempty" type:"Repeated"`
	// service name
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty"`
	// 子类型，固定值：whitelist
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty"`
	// 控制类型，固定值：access-control
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s SofaGwControlVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwControlVO) GoString() string {
	return s.String()
}

func (s *SofaGwControlVO) SetAddItems(v []*string) *SofaGwControlVO {
	s.AddItems = v
	return s
}

func (s *SofaGwControlVO) SetInstanceId(v string) *SofaGwControlVO {
	s.InstanceId = &v
	return s
}

func (s *SofaGwControlVO) SetItems(v []*string) *SofaGwControlVO {
	s.Items = v
	return s
}

func (s *SofaGwControlVO) SetMatch(v string) *SofaGwControlVO {
	s.Match = &v
	return s
}

func (s *SofaGwControlVO) SetRemoveItems(v []*string) *SofaGwControlVO {
	s.RemoveItems = v
	return s
}

func (s *SofaGwControlVO) SetServiceName(v string) *SofaGwControlVO {
	s.ServiceName = &v
	return s
}

func (s *SofaGwControlVO) SetSubType(v string) *SofaGwControlVO {
	s.SubType = &v
	return s
}

func (s *SofaGwControlVO) SetType(v string) *SofaGwControlVO {
	s.Type = &v
	return s
}

// MonitorData
type MonitorData struct {
	// 时间点
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// value
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
}

func (s MonitorData) String() string {
	return tea.Prettify(s)
}

func (s MonitorData) GoString() string {
	return s.String()
}

func (s *MonitorData) SetTimestamp(v int64) *MonitorData {
	s.Timestamp = &v
	return s
}

func (s *MonitorData) SetValue(v int64) *MonitorData {
	s.Value = &v
	return s
}

// PageInfo
type PageInfo struct {
	// 排序信息
	OrderInfos []*OrderInfo `json:"order_infos,omitempty" xml:"order_infos,omitempty" type:"Repeated"`
	// 当前页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// 每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s PageInfo) String() string {
	return tea.Prettify(s)
}

func (s PageInfo) GoString() string {
	return s.String()
}

func (s *PageInfo) SetOrderInfos(v []*OrderInfo) *PageInfo {
	s.OrderInfos = v
	return s
}

func (s *PageInfo) SetPageIndex(v int64) *PageInfo {
	s.PageIndex = &v
	return s
}

func (s *PageInfo) SetPageSize(v int64) *PageInfo {
	s.PageSize = &v
	return s
}

func (s *PageInfo) SetTotal(v int64) *PageInfo {
	s.Total = &v
	return s
}

// 前端配置
type SofaGwDownstream struct {
	// 认证信息
	Auth []*SofaGwAuthenticationVO `json:"auth,omitempty" xml:"auth,omitempty" type:"Repeated"`
	// GET/POST/PUT/DELETE
	Method *string `json:"method,omitempty" xml:"method,omitempty"`
	// 协议
	Schema *string `json:"schema,omitempty" xml:"schema,omitempty"`
	// url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 是否签名
	Verify *bool `json:"verify,omitempty" xml:"verify,omitempty"`
}

func (s SofaGwDownstream) String() string {
	return tea.Prettify(s)
}

func (s SofaGwDownstream) GoString() string {
	return s.String()
}

func (s *SofaGwDownstream) SetAuth(v []*SofaGwAuthenticationVO) *SofaGwDownstream {
	s.Auth = v
	return s
}

func (s *SofaGwDownstream) SetMethod(v string) *SofaGwDownstream {
	s.Method = &v
	return s
}

func (s *SofaGwDownstream) SetSchema(v string) *SofaGwDownstream {
	s.Schema = &v
	return s
}

func (s *SofaGwDownstream) SetUrl(v string) *SofaGwDownstream {
	s.Url = &v
	return s
}

func (s *SofaGwDownstream) SetVerify(v bool) *SofaGwDownstream {
	s.Verify = &v
	return s
}

// AuthUserInfoVO
type AuthUserInfoVO struct {
	// api分组标识符
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// api标识符
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 授权状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// 授权用户唯一标识
	AuthUserId *string `json:"auth_user_id,omitempty" xml:"auth_user_id,omitempty"`
	// 企业的唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 创建日期
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 真实性名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 操作员状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// workspace id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty"`
	// 能否操作授权
	CanAuth *bool `json:"can_auth,omitempty" xml:"can_auth,omitempty"`
}

func (s AuthUserInfoVO) String() string {
	return tea.Prettify(s)
}

func (s AuthUserInfoVO) GoString() string {
	return s.String()
}

func (s *AuthUserInfoVO) SetApiGroupId(v string) *AuthUserInfoVO {
	s.ApiGroupId = &v
	return s
}

func (s *AuthUserInfoVO) SetApiId(v string) *AuthUserInfoVO {
	s.ApiId = &v
	return s
}

func (s *AuthUserInfoVO) SetAuthStatus(v string) *AuthUserInfoVO {
	s.AuthStatus = &v
	return s
}

func (s *AuthUserInfoVO) SetAuthUserId(v string) *AuthUserInfoVO {
	s.AuthUserId = &v
	return s
}

func (s *AuthUserInfoVO) SetCustomer(v string) *AuthUserInfoVO {
	s.Customer = &v
	return s
}

func (s *AuthUserInfoVO) SetEmail(v string) *AuthUserInfoVO {
	s.Email = &v
	return s
}

func (s *AuthUserInfoVO) SetGmtCreate(v string) *AuthUserInfoVO {
	s.GmtCreate = &v
	return s
}

func (s *AuthUserInfoVO) SetGmtModified(v string) *AuthUserInfoVO {
	s.GmtModified = &v
	return s
}

func (s *AuthUserInfoVO) SetLoginName(v string) *AuthUserInfoVO {
	s.LoginName = &v
	return s
}

func (s *AuthUserInfoVO) SetMobile(v string) *AuthUserInfoVO {
	s.Mobile = &v
	return s
}

func (s *AuthUserInfoVO) SetNickName(v string) *AuthUserInfoVO {
	s.NickName = &v
	return s
}

func (s *AuthUserInfoVO) SetOperator(v string) *AuthUserInfoVO {
	s.Operator = &v
	return s
}

func (s *AuthUserInfoVO) SetRealName(v string) *AuthUserInfoVO {
	s.RealName = &v
	return s
}

func (s *AuthUserInfoVO) SetStatus(v string) *AuthUserInfoVO {
	s.Status = &v
	return s
}

func (s *AuthUserInfoVO) SetTenantId(v string) *AuthUserInfoVO {
	s.TenantId = &v
	return s
}

func (s *AuthUserInfoVO) SetUserId(v string) *AuthUserInfoVO {
	s.UserId = &v
	return s
}

func (s *AuthUserInfoVO) SetWorkspaceId(v string) *AuthUserInfoVO {
	s.WorkspaceId = &v
	return s
}

func (s *AuthUserInfoVO) SetWorkNo(v string) *AuthUserInfoVO {
	s.WorkNo = &v
	return s
}

func (s *AuthUserInfoVO) SetCanAuth(v bool) *AuthUserInfoVO {
	s.CanAuth = &v
	return s
}

// AppInfoPagedListVO
type AppInfoPagedListVO struct {
	// list
	List []*AppInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s AppInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s AppInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *AppInfoPagedListVO) SetList(v []*AppInfoVO) *AppInfoPagedListVO {
	s.List = v
	return s
}

func (s *AppInfoPagedListVO) SetPageInfo(v *PageInfo) *AppInfoPagedListVO {
	s.PageInfo = v
	return s
}

// RegistryInfoQueryVO
type RegistryInfoQueryVO struct {
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *RegistryInfoVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s RegistryInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s RegistryInfoQueryVO) GoString() string {
	return s.String()
}

func (s *RegistryInfoQueryVO) SetFuzzySearch(v bool) *RegistryInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *RegistryInfoQueryVO) SetPageInfo(v *PageInfo) *RegistryInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *RegistryInfoQueryVO) SetQuery(v *RegistryInfoVO) *RegistryInfoQueryVO {
	s.Query = v
	return s
}

// RouterInfoPagedListVO
type RouterInfoPagedListVO struct {
	// list
	List []*RouterInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s RouterInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s RouterInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *RouterInfoPagedListVO) SetList(v []*RouterInfoVO) *RouterInfoPagedListVO {
	s.List = v
	return s
}

func (s *RouterInfoPagedListVO) SetPageInfo(v *PageInfo) *RouterInfoPagedListVO {
	s.PageInfo = v
	return s
}

// ApiGroupAuthUserConfigVO
type ApiGroupAuthUserConfigVO struct {
	// api授权管理开关
	ApiAuthUserSwitch *string `json:"api_auth_user_switch,omitempty" xml:"api_auth_user_switch,omitempty"`
	// 是否是管理员
	CheckMaster *bool `json:"check_master,omitempty" xml:"check_master,omitempty"`
	// 需要api授权管理
	NeedApiAuthUser *bool `json:"need_api_auth_user,omitempty" xml:"need_api_auth_user,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ApiGroupAuthUserConfigVO) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupAuthUserConfigVO) GoString() string {
	return s.String()
}

func (s *ApiGroupAuthUserConfigVO) SetApiAuthUserSwitch(v string) *ApiGroupAuthUserConfigVO {
	s.ApiAuthUserSwitch = &v
	return s
}

func (s *ApiGroupAuthUserConfigVO) SetCheckMaster(v bool) *ApiGroupAuthUserConfigVO {
	s.CheckMaster = &v
	return s
}

func (s *ApiGroupAuthUserConfigVO) SetNeedApiAuthUser(v bool) *ApiGroupAuthUserConfigVO {
	s.NeedApiAuthUser = &v
	return s
}

func (s *ApiGroupAuthUserConfigVO) SetTenantId(v string) *ApiGroupAuthUserConfigVO {
	s.TenantId = &v
	return s
}

func (s *ApiGroupAuthUserConfigVO) SetWorkspaceId(v string) *ApiGroupAuthUserConfigVO {
	s.WorkspaceId = &v
	return s
}

// AuthAppInfoPagedListVO
type AuthAppInfoPagedListVO struct {
	// list
	List []*AuthAppInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s AuthAppInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s AuthAppInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *AuthAppInfoPagedListVO) SetList(v []*AuthAppInfoVO) *AuthAppInfoPagedListVO {
	s.List = v
	return s
}

func (s *AuthAppInfoPagedListVO) SetPageInfo(v *PageInfo) *AuthAppInfoPagedListVO {
	s.PageInfo = v
	return s
}

// ParamMappingInfoPagedListVO
type ParamMappingInfoPagedListVO struct {
	// list
	List []*ParamMappingInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ParamMappingInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ParamMappingInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *ParamMappingInfoPagedListVO) SetList(v []*ParamMappingInfoVO) *ParamMappingInfoPagedListVO {
	s.List = v
	return s
}

func (s *ParamMappingInfoPagedListVO) SetPageInfo(v *PageInfo) *ParamMappingInfoPagedListVO {
	s.PageInfo = v
	return s
}

// 集群信息
type SofaGwClusterVO struct {
	// app name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// hosts
	Hosts []*SofaGwHostVO `json:"hosts,omitempty" xml:"hosts,omitempty" type:"Repeated"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 实例标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 集群名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s SofaGwClusterVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwClusterVO) GoString() string {
	return s.String()
}

func (s *SofaGwClusterVO) SetAppName(v string) *SofaGwClusterVO {
	s.AppName = &v
	return s
}

func (s *SofaGwClusterVO) SetHosts(v []*SofaGwHostVO) *SofaGwClusterVO {
	s.Hosts = v
	return s
}

func (s *SofaGwClusterVO) SetId(v int64) *SofaGwClusterVO {
	s.Id = &v
	return s
}

func (s *SofaGwClusterVO) SetInstanceId(v string) *SofaGwClusterVO {
	s.InstanceId = &v
	return s
}

func (s *SofaGwClusterVO) SetName(v string) *SofaGwClusterVO {
	s.Name = &v
	return s
}

// RegistryInfoPagedListVO
type RegistryInfoPagedListVO struct {
	// list
	List []*RegistryInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s RegistryInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s RegistryInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *RegistryInfoPagedListVO) SetList(v []*RegistryInfoVO) *RegistryInfoPagedListVO {
	s.List = v
	return s
}

func (s *RegistryInfoPagedListVO) SetPageInfo(v *PageInfo) *RegistryInfoPagedListVO {
	s.PageInfo = v
	return s
}

// MonitoryRequest
type MonitoryRequest struct {
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// App标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// end_time
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
}

func (s MonitoryRequest) String() string {
	return tea.Prettify(s)
}

func (s MonitoryRequest) GoString() string {
	return s.String()
}

func (s *MonitoryRequest) SetApiId(v string) *MonitoryRequest {
	s.ApiId = &v
	return s
}

func (s *MonitoryRequest) SetAppId(v string) *MonitoryRequest {
	s.AppId = &v
	return s
}

func (s *MonitoryRequest) SetCode(v string) *MonitoryRequest {
	s.Code = &v
	return s
}

func (s *MonitoryRequest) SetStartTime(v int64) *MonitoryRequest {
	s.StartTime = &v
	return s
}

func (s *MonitoryRequest) SetEndTime(v int64) *MonitoryRequest {
	s.EndTime = &v
	return s
}

// 联系方式分页列表
type ContactInfoPagedListVO struct {
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// 联系方式列表
	List []*ContactInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s ContactInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ContactInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *ContactInfoPagedListVO) SetPageInfo(v *PageInfo) *ContactInfoPagedListVO {
	s.PageInfo = v
	return s
}

func (s *ContactInfoPagedListVO) SetList(v []*ContactInfoVO) *ContactInfoPagedListVO {
	s.List = v
	return s
}

// 策略分页信息
type StrategyPagedListVO struct {
	// list
	List []*StrategyInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s StrategyPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s StrategyPagedListVO) GoString() string {
	return s.String()
}

func (s *StrategyPagedListVO) SetList(v []*StrategyInfoVO) *StrategyPagedListVO {
	s.List = v
	return s
}

func (s *StrategyPagedListVO) SetPageInfo(v *PageInfo) *StrategyPagedListVO {
	s.PageInfo = v
	return s
}

// SystemClusterPagedListVO
type SystemClusterPagedListVO struct {
	// list
	List []*SystemClusterVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s SystemClusterPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s SystemClusterPagedListVO) GoString() string {
	return s.String()
}

func (s *SystemClusterPagedListVO) SetList(v []*SystemClusterVO) *SystemClusterPagedListVO {
	s.List = v
	return s
}

func (s *SystemClusterPagedListVO) SetPageInfo(v *PageInfo) *SystemClusterPagedListVO {
	s.PageInfo = v
	return s
}

// AppInfoQueryVO
type AppInfoQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *AppInfoVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s AppInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s AppInfoQueryVO) GoString() string {
	return s.String()
}

func (s *AppInfoQueryVO) SetPageInfo(v *PageInfo) *AppInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *AppInfoQueryVO) SetQuery(v *AppInfoVO) *AppInfoQueryVO {
	s.Query = v
	return s
}

// ApiflowMachineDefQueryVO
type ApiflowMachineDefQueryVO struct {
	// fuzzy_search
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiflowMachineDefVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ApiflowMachineDefQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineDefQueryVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineDefQueryVO) SetFuzzySearch(v bool) *ApiflowMachineDefQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ApiflowMachineDefQueryVO) SetPageInfo(v *PageInfo) *ApiflowMachineDefQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiflowMachineDefQueryVO) SetQuery(v *ApiflowMachineDefVO) *ApiflowMachineDefQueryVO {
	s.Query = v
	return s
}

// ldc信息
type LdcInfoVO struct {
	// 是否开启
	Enable *bool `json:"enable,omitempty" xml:"enable,omitempty"`
	// 参数位置
	ParamLocation *string `json:"param_location,omitempty" xml:"param_location,omitempty"`
	// 参数名
	ParamKey *string `json:"param_key,omitempty" xml:"param_key,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s LdcInfoVO) String() string {
	return tea.Prettify(s)
}

func (s LdcInfoVO) GoString() string {
	return s.String()
}

func (s *LdcInfoVO) SetEnable(v bool) *LdcInfoVO {
	s.Enable = &v
	return s
}

func (s *LdcInfoVO) SetParamLocation(v string) *LdcInfoVO {
	s.ParamLocation = &v
	return s
}

func (s *LdcInfoVO) SetParamKey(v string) *LdcInfoVO {
	s.ParamKey = &v
	return s
}

func (s *LdcInfoVO) SetTenantId(v string) *LdcInfoVO {
	s.TenantId = &v
	return s
}

func (s *LdcInfoVO) SetWorkspaceId(v string) *LdcInfoVO {
	s.WorkspaceId = &v
	return s
}

// 查询联系方式
type ContactInfoQueryVO struct {
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ContactInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s ContactInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ContactInfoQueryVO) GoString() string {
	return s.String()
}

func (s *ContactInfoQueryVO) SetPageInfo(v *PageInfo) *ContactInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *ContactInfoQueryVO) SetQuery(v *ContactInfoVO) *ContactInfoQueryVO {
	s.Query = v
	return s
}

func (s *ContactInfoQueryVO) SetFuzzySearch(v bool) *ContactInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// ApiGroupQueryVO
type ApiGroupQueryVO struct {
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiGroupVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s ApiGroupQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupQueryVO) GoString() string {
	return s.String()
}

func (s *ApiGroupQueryVO) SetPageInfo(v *PageInfo) *ApiGroupQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiGroupQueryVO) SetQuery(v *ApiGroupVO) *ApiGroupQueryVO {
	s.Query = v
	return s
}

func (s *ApiGroupQueryVO) SetFuzzySearch(v bool) *ApiGroupQueryVO {
	s.FuzzySearch = &v
	return s
}

// 入参
type EngineVO struct {
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 流程编排标识
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 内嵌模式、云端模式
	EngineType *string `json:"engine_type,omitempty" xml:"engine_type,omitempty"`
	// add_request
	AddRequest *bool `json:"add_request,omitempty" xml:"add_request,omitempty"`
	// add_timestamp
	AddTimestamp *bool `json:"add_timestamp,omitempty" xml:"add_timestamp,omitempty"`
	// save_to_db
	SaveToDb *bool `json:"save_to_db,omitempty" xml:"save_to_db,omitempty"`
	// 流程编排  （内嵌模式）初始化的入参
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s EngineVO) String() string {
	return tea.Prettify(s)
}

func (s EngineVO) GoString() string {
	return s.String()
}

func (s *EngineVO) SetTenantId(v string) *EngineVO {
	s.TenantId = &v
	return s
}

func (s *EngineVO) SetWorkspaceId(v string) *EngineVO {
	s.WorkspaceId = &v
	return s
}

func (s *EngineVO) SetTemplateId(v string) *EngineVO {
	s.TemplateId = &v
	return s
}

func (s *EngineVO) SetEngineType(v string) *EngineVO {
	s.EngineType = &v
	return s
}

func (s *EngineVO) SetAddRequest(v bool) *EngineVO {
	s.AddRequest = &v
	return s
}

func (s *EngineVO) SetAddTimestamp(v bool) *EngineVO {
	s.AddTimestamp = &v
	return s
}

func (s *EngineVO) SetSaveToDb(v bool) *EngineVO {
	s.SaveToDb = &v
	return s
}

func (s *EngineVO) SetParams(v string) *EngineVO {
	s.Params = &v
	return s
}

// ParamMappingInfoQueryVO
type ParamMappingInfoQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ParamMappingInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 支持模糊查询
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s ParamMappingInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ParamMappingInfoQueryVO) GoString() string {
	return s.String()
}

func (s *ParamMappingInfoQueryVO) SetPageInfo(v *PageInfo) *ParamMappingInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *ParamMappingInfoQueryVO) SetQuery(v *ParamMappingInfoVO) *ParamMappingInfoQueryVO {
	s.Query = v
	return s
}

func (s *ParamMappingInfoQueryVO) SetFuzzySearch(v bool) *ParamMappingInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// ApiTestReqVO
type ApiTestReqVO struct {
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 应用标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// params
	Params []*ApiTestParamVO `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
	// payload
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ApiTestReqVO) String() string {
	return tea.Prettify(s)
}

func (s ApiTestReqVO) GoString() string {
	return s.String()
}

func (s *ApiTestReqVO) SetApiId(v string) *ApiTestReqVO {
	s.ApiId = &v
	return s
}

func (s *ApiTestReqVO) SetAppId(v string) *ApiTestReqVO {
	s.AppId = &v
	return s
}

func (s *ApiTestReqVO) SetParams(v []*ApiTestParamVO) *ApiTestReqVO {
	s.Params = v
	return s
}

func (s *ApiTestReqVO) SetPayload(v string) *ApiTestReqVO {
	s.Payload = &v
	return s
}

func (s *ApiTestReqVO) SetTenantId(v string) *ApiTestReqVO {
	s.TenantId = &v
	return s
}

func (s *ApiTestReqVO) SetWorkspaceId(v string) *ApiTestReqVO {
	s.WorkspaceId = &v
	return s
}

// SystemClusterQueryVO
type SystemClusterQueryVO struct {
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *SystemClusterVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s SystemClusterQueryVO) String() string {
	return tea.Prettify(s)
}

func (s SystemClusterQueryVO) GoString() string {
	return s.String()
}

func (s *SystemClusterQueryVO) SetFuzzySearch(v bool) *SystemClusterQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *SystemClusterQueryVO) SetPageInfo(v *PageInfo) *SystemClusterQueryVO {
	s.PageInfo = v
	return s
}

func (s *SystemClusterQueryVO) SetQuery(v *SystemClusterVO) *SystemClusterQueryVO {
	s.Query = v
	return s
}

// AuthAppInfoQueryVO
type AuthAppInfoQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *AuthAppInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 自定义查询条件
	QueryCondition *string `json:"query_condition,omitempty" xml:"query_condition,omitempty"`
	// 是否支持模糊查询
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s AuthAppInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s AuthAppInfoQueryVO) GoString() string {
	return s.String()
}

func (s *AuthAppInfoQueryVO) SetPageInfo(v *PageInfo) *AuthAppInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *AuthAppInfoQueryVO) SetQuery(v *AuthAppInfoVO) *AuthAppInfoQueryVO {
	s.Query = v
	return s
}

func (s *AuthAppInfoQueryVO) SetQueryCondition(v string) *AuthAppInfoQueryVO {
	s.QueryCondition = &v
	return s
}

func (s *AuthAppInfoQueryVO) SetFuzzySearch(v bool) *AuthAppInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// AuthUserInfoQueryVO
type AuthUserInfoQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// OperatorVO
	Query *AuthUserInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s AuthUserInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s AuthUserInfoQueryVO) GoString() string {
	return s.String()
}

func (s *AuthUserInfoQueryVO) SetPageInfo(v *PageInfo) *AuthUserInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *AuthUserInfoQueryVO) SetQuery(v *AuthUserInfoVO) *AuthUserInfoQueryVO {
	s.Query = v
	return s
}

func (s *AuthUserInfoQueryVO) SetFuzzySearch(v bool) *AuthUserInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// HomePageVO
type HomePageVO struct {
	// api分组数量
	ApiGroupCount *int64 `json:"api_group_count,omitempty" xml:"api_group_count,omitempty"`
	// api数量
	ApiCount *int64 `json:"api_count,omitempty" xml:"api_count,omitempty"`
	// app数量
	AppCount *int64 `json:"app_count,omitempty" xml:"app_count,omitempty"`
}

func (s HomePageVO) String() string {
	return tea.Prettify(s)
}

func (s HomePageVO) GoString() string {
	return s.String()
}

func (s *HomePageVO) SetApiGroupCount(v int64) *HomePageVO {
	s.ApiGroupCount = &v
	return s
}

func (s *HomePageVO) SetApiCount(v int64) *HomePageVO {
	s.ApiCount = &v
	return s
}

func (s *HomePageVO) SetAppCount(v int64) *HomePageVO {
	s.AppCount = &v
	return s
}

// ApiflowMachineInstQueryVO
type ApiflowMachineInstQueryVO struct {
	// fuzzy_search
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiflowMachineInstVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ApiflowMachineInstQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineInstQueryVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineInstQueryVO) SetFuzzySearch(v bool) *ApiflowMachineInstQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ApiflowMachineInstQueryVO) SetPageInfo(v *PageInfo) *ApiflowMachineInstQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiflowMachineInstQueryVO) SetQuery(v *ApiflowMachineInstVO) *ApiflowMachineInstQueryVO {
	s.Query = v
	return s
}

// ApiModelQueryVO
type ApiModelQueryVO struct {
	// 支持模糊查询
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiModelVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ApiModelQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiModelQueryVO) GoString() string {
	return s.String()
}

func (s *ApiModelQueryVO) SetFuzzySearch(v bool) *ApiModelQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ApiModelQueryVO) SetPageInfo(v *PageInfo) *ApiModelQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiModelQueryVO) SetQuery(v *ApiModelVO) *ApiModelQueryVO {
	s.Query = v
	return s
}

// ExternalAuthInfoQueryVO
type ExternalAuthInfoQueryVO struct {
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ExternalAuthInfoVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ExternalAuthInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ExternalAuthInfoQueryVO) GoString() string {
	return s.String()
}

func (s *ExternalAuthInfoQueryVO) SetFuzzySearch(v bool) *ExternalAuthInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ExternalAuthInfoQueryVO) SetPageInfo(v *PageInfo) *ExternalAuthInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *ExternalAuthInfoQueryVO) SetQuery(v *ExternalAuthInfoVO) *ExternalAuthInfoQueryVO {
	s.Query = v
	return s
}

// Api信息
type SofaGwService struct {
	// app name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// cluster name
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// controls
	Controls []*SofaGwControlVO `json:"controls,omitempty" xml:"controls,omitempty" type:"Repeated"`
	// downstream
	Downstream *SofaGwDownstream `json:"downstream,omitempty" xml:"downstream,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 实例标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// service name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// service_version
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty"`
	// 上线:online, 下线:offline
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// upstream
	Upstream *SofaGwUpstreamVO `json:"upstream,omitempty" xml:"upstream,omitempty"`
}

func (s SofaGwService) String() string {
	return tea.Prettify(s)
}

func (s SofaGwService) GoString() string {
	return s.String()
}

func (s *SofaGwService) SetAppName(v string) *SofaGwService {
	s.AppName = &v
	return s
}

func (s *SofaGwService) SetClusterName(v string) *SofaGwService {
	s.ClusterName = &v
	return s
}

func (s *SofaGwService) SetControls(v []*SofaGwControlVO) *SofaGwService {
	s.Controls = v
	return s
}

func (s *SofaGwService) SetDownstream(v *SofaGwDownstream) *SofaGwService {
	s.Downstream = v
	return s
}

func (s *SofaGwService) SetId(v int64) *SofaGwService {
	s.Id = &v
	return s
}

func (s *SofaGwService) SetInstanceId(v string) *SofaGwService {
	s.InstanceId = &v
	return s
}

func (s *SofaGwService) SetName(v string) *SofaGwService {
	s.Name = &v
	return s
}

func (s *SofaGwService) SetServiceVersion(v string) *SofaGwService {
	s.ServiceVersion = &v
	return s
}

func (s *SofaGwService) SetStatus(v string) *SofaGwService {
	s.Status = &v
	return s
}

func (s *SofaGwService) SetUpstream(v *SofaGwUpstreamVO) *SofaGwService {
	s.Upstream = v
	return s
}

// ApiTransferResult
type ApiTransferResult struct {
	// api配置
	ApiTransferList []*ApiInfoVO `json:"api_transfer_list,omitempty" xml:"api_transfer_list,omitempty" type:"Repeated"`
	// 批量转移结果
	BatchActionResult *BatchActionResult `json:"batch_action_result,omitempty" xml:"batch_action_result,omitempty"`
	// file_name
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 流程编排列表
	ApiflowList []*ApiInfoVO `json:"apiflow_list,omitempty" xml:"apiflow_list,omitempty" type:"Repeated"`
}

func (s ApiTransferResult) String() string {
	return tea.Prettify(s)
}

func (s ApiTransferResult) GoString() string {
	return s.String()
}

func (s *ApiTransferResult) SetApiTransferList(v []*ApiInfoVO) *ApiTransferResult {
	s.ApiTransferList = v
	return s
}

func (s *ApiTransferResult) SetBatchActionResult(v *BatchActionResult) *ApiTransferResult {
	s.BatchActionResult = v
	return s
}

func (s *ApiTransferResult) SetFileName(v string) *ApiTransferResult {
	s.FileName = &v
	return s
}

func (s *ApiTransferResult) SetApiflowList(v []*ApiInfoVO) *ApiTransferResult {
	s.ApiflowList = v
	return s
}

// BatchImportResult
type BatchImportResult struct {
	// failed_count
	FailedCount *int64 `json:"failed_count,omitempty" xml:"failed_count,omitempty"`
	// 重复的API列表
	RepeatApiList []*ApiTransferVO `json:"repeat_api_list,omitempty" xml:"repeat_api_list,omitempty" type:"Repeated"`
	// results
	Results []*ImportResult `json:"results,omitempty" xml:"results,omitempty" type:"Repeated"`
	// success_count
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 导入成功的API列表
	SuccessApiList []*ApiInfoVO `json:"success_api_list,omitempty" xml:"success_api_list,omitempty" type:"Repeated"`
}

func (s BatchImportResult) String() string {
	return tea.Prettify(s)
}

func (s BatchImportResult) GoString() string {
	return s.String()
}

func (s *BatchImportResult) SetFailedCount(v int64) *BatchImportResult {
	s.FailedCount = &v
	return s
}

func (s *BatchImportResult) SetRepeatApiList(v []*ApiTransferVO) *BatchImportResult {
	s.RepeatApiList = v
	return s
}

func (s *BatchImportResult) SetResults(v []*ImportResult) *BatchImportResult {
	s.Results = v
	return s
}

func (s *BatchImportResult) SetSuccessCount(v int64) *BatchImportResult {
	s.SuccessCount = &v
	return s
}

func (s *BatchImportResult) SetTotalCount(v int64) *BatchImportResult {
	s.TotalCount = &v
	return s
}

func (s *BatchImportResult) SetSuccessApiList(v []*ApiInfoVO) *BatchImportResult {
	s.SuccessApiList = v
	return s
}

// ApiflowMachineDefPagedListVO
type ApiflowMachineDefPagedListVO struct {
	// list
	List []*ApiflowMachineDefVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiflowMachineDefPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineDefPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineDefPagedListVO) SetList(v []*ApiflowMachineDefVO) *ApiflowMachineDefPagedListVO {
	s.List = v
	return s
}

func (s *ApiflowMachineDefPagedListVO) SetPageInfo(v *PageInfo) *ApiflowMachineDefPagedListVO {
	s.PageInfo = v
	return s
}

// OperatorPagedListVO
type OperatorPagedListVO struct {
	// 当前页的数据
	List []*OperatorVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s OperatorPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s OperatorPagedListVO) GoString() string {
	return s.String()
}

func (s *OperatorPagedListVO) SetList(v []*OperatorVO) *OperatorPagedListVO {
	s.List = v
	return s
}

func (s *OperatorPagedListVO) SetPageInfo(v *PageInfo) *OperatorPagedListVO {
	s.PageInfo = v
	return s
}

// cors分页信息
type CorsInfoPagedListVO struct {
	// cors列表
	List []*CorsInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s CorsInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s CorsInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *CorsInfoPagedListVO) SetList(v []*CorsInfoVO) *CorsInfoPagedListVO {
	s.List = v
	return s
}

func (s *CorsInfoPagedListVO) SetPageInfo(v *PageInfo) *CorsInfoPagedListVO {
	s.PageInfo = v
	return s
}

// ApiInfoPagedListVO
type ApiInfoPagedListVO struct {
	// list
	List []*ApiInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiInfoPagedListVO) SetList(v []*ApiInfoVO) *ApiInfoPagedListVO {
	s.List = v
	return s
}

func (s *ApiInfoPagedListVO) SetPageInfo(v *PageInfo) *ApiInfoPagedListVO {
	s.PageInfo = v
	return s
}

// OperatorQueryVO
type OperatorQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *OperatorVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s OperatorQueryVO) String() string {
	return tea.Prettify(s)
}

func (s OperatorQueryVO) GoString() string {
	return s.String()
}

func (s *OperatorQueryVO) SetPageInfo(v *PageInfo) *OperatorQueryVO {
	s.PageInfo = v
	return s
}

func (s *OperatorQueryVO) SetQuery(v *OperatorVO) *OperatorQueryVO {
	s.Query = v
	return s
}

// api导入 效验返回体
type CheckApiResult struct {
	// 导入的所有的API集合
	AllApiList []*ApiTransferVO `json:"all_api_list,omitempty" xml:"all_api_list,omitempty" type:"Repeated"`
	// API或者配置中有重复的集合
	FailedApiList []*ApiTransferVO `json:"failed_api_list,omitempty" xml:"failed_api_list,omitempty" type:"Repeated"`
	//
	// API包括配置无重复的集合
	SuccessApiList []*ApiTransferVO `json:"success_api_list,omitempty" xml:"success_api_list,omitempty" type:"Repeated"`
	// 失败api配置详情
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty"`
}

func (s CheckApiResult) String() string {
	return tea.Prettify(s)
}

func (s CheckApiResult) GoString() string {
	return s.String()
}

func (s *CheckApiResult) SetAllApiList(v []*ApiTransferVO) *CheckApiResult {
	s.AllApiList = v
	return s
}

func (s *CheckApiResult) SetFailedApiList(v []*ApiTransferVO) *CheckApiResult {
	s.FailedApiList = v
	return s
}

func (s *CheckApiResult) SetSuccessApiList(v []*ApiTransferVO) *CheckApiResult {
	s.SuccessApiList = v
	return s
}

func (s *CheckApiResult) SetCheckResult(v string) *CheckApiResult {
	s.CheckResult = &v
	return s
}

// ApiflowTestReqVO
type ApiflowTestReqVO struct {
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// machine_name
	MachineName *string `json:"machine_name,omitempty" xml:"machine_name,omitempty"`
	// params
	InputParams []*ApiTestParamVO `json:"input_params,omitempty" xml:"input_params,omitempty" type:"Repeated"`
	// output_params
	OutputParams []*ApiflowOutputVO `json:"output_params,omitempty" xml:"output_params,omitempty" type:"Repeated"`
}

func (s ApiflowTestReqVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowTestReqVO) GoString() string {
	return s.String()
}

func (s *ApiflowTestReqVO) SetApiId(v string) *ApiflowTestReqVO {
	s.ApiId = &v
	return s
}

func (s *ApiflowTestReqVO) SetWorkspaceId(v string) *ApiflowTestReqVO {
	s.WorkspaceId = &v
	return s
}

func (s *ApiflowTestReqVO) SetTenantId(v string) *ApiflowTestReqVO {
	s.TenantId = &v
	return s
}

func (s *ApiflowTestReqVO) SetMachineName(v string) *ApiflowTestReqVO {
	s.MachineName = &v
	return s
}

func (s *ApiflowTestReqVO) SetInputParams(v []*ApiTestParamVO) *ApiflowTestReqVO {
	s.InputParams = v
	return s
}

func (s *ApiflowTestReqVO) SetOutputParams(v []*ApiflowOutputVO) *ApiflowTestReqVO {
	s.OutputParams = v
	return s
}

// MonitoryAggregationVO
type MonitoryAggregationVO struct {
	// invoke_num
	InvokeNum []*MonitorData `json:"invoke_num,omitempty" xml:"invoke_num,omitempty" type:"Repeated"`
	// qps
	Qps []*MonitorData `json:"qps,omitempty" xml:"qps,omitempty" type:"Repeated"`
	// rt
	Rt []*MonitorData `json:"rt,omitempty" xml:"rt,omitempty" type:"Repeated"`
	// 错误码
	ErrCode []*MonitorData `json:"err_code,omitempty" xml:"err_code,omitempty" type:"Repeated"`
	// 错误率
	ErrRate []*MonitorData `json:"err_rate,omitempty" xml:"err_rate,omitempty" type:"Repeated"`
	// byte_in
	ByteIn []*MonitorData `json:"byte_in,omitempty" xml:"byte_in,omitempty" type:"Repeated"`
	// byte_out
	ByteOut []*MonitorData `json:"byte_out,omitempty" xml:"byte_out,omitempty" type:"Repeated"`
}

func (s MonitoryAggregationVO) String() string {
	return tea.Prettify(s)
}

func (s MonitoryAggregationVO) GoString() string {
	return s.String()
}

func (s *MonitoryAggregationVO) SetInvokeNum(v []*MonitorData) *MonitoryAggregationVO {
	s.InvokeNum = v
	return s
}

func (s *MonitoryAggregationVO) SetQps(v []*MonitorData) *MonitoryAggregationVO {
	s.Qps = v
	return s
}

func (s *MonitoryAggregationVO) SetRt(v []*MonitorData) *MonitoryAggregationVO {
	s.Rt = v
	return s
}

func (s *MonitoryAggregationVO) SetErrCode(v []*MonitorData) *MonitoryAggregationVO {
	s.ErrCode = v
	return s
}

func (s *MonitoryAggregationVO) SetErrRate(v []*MonitorData) *MonitoryAggregationVO {
	s.ErrRate = v
	return s
}

func (s *MonitoryAggregationVO) SetByteIn(v []*MonitorData) *MonitoryAggregationVO {
	s.ByteIn = v
	return s
}

func (s *MonitoryAggregationVO) SetByteOut(v []*MonitorData) *MonitoryAggregationVO {
	s.ByteOut = v
	return s
}

// ApiGroupPagedListVO
type ApiGroupPagedListVO struct {
	// 当前页的数据
	List []*ApiGroupVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiGroupPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiGroupPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiGroupPagedListVO) SetList(v []*ApiGroupVO) *ApiGroupPagedListVO {
	s.List = v
	return s
}

func (s *ApiGroupPagedListVO) SetPageInfo(v *PageInfo) *ApiGroupPagedListVO {
	s.PageInfo = v
	return s
}

// ApiTestRspVO
type ApiTestRspVO struct {
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// cost
	Cost *int64 `json:"cost,omitempty" xml:"cost,omitempty"`
	// size
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// payload
	Payload *string `json:"payload,omitempty" xml:"payload,omitempty"`
	// headers
	Headers []*ApiTestParamVO `json:"headers,omitempty" xml:"headers,omitempty" type:"Repeated"`
}

func (s ApiTestRspVO) String() string {
	return tea.Prettify(s)
}

func (s ApiTestRspVO) GoString() string {
	return s.String()
}

func (s *ApiTestRspVO) SetCode(v string) *ApiTestRspVO {
	s.Code = &v
	return s
}

func (s *ApiTestRspVO) SetCost(v int64) *ApiTestRspVO {
	s.Cost = &v
	return s
}

func (s *ApiTestRspVO) SetSize(v int64) *ApiTestRspVO {
	s.Size = &v
	return s
}

func (s *ApiTestRspVO) SetPayload(v string) *ApiTestRspVO {
	s.Payload = &v
	return s
}

func (s *ApiTestRspVO) SetHeaders(v []*ApiTestParamVO) *ApiTestRspVO {
	s.Headers = v
	return s
}

// ApiflowInstPagedListVO
type ApiflowInstPagedListVO struct {
	// list
	List []*ApiflowInstVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiflowInstPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowInstPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiflowInstPagedListVO) SetList(v []*ApiflowInstVO) *ApiflowInstPagedListVO {
	s.List = v
	return s
}

func (s *ApiflowInstPagedListVO) SetPageInfo(v *PageInfo) *ApiflowInstPagedListVO {
	s.PageInfo = v
	return s
}

// API分组 或 应用
type SofaGwAppVO struct {
	// 应用认证信息
	Authentications []*SofaGwAuthenticationVO `json:"authentications,omitempty" xml:"authentications,omitempty" type:"Repeated"`
	// 应用描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 实例标识
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 实例标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// services
	Services []*string `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
	// api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s SofaGwAppVO) String() string {
	return tea.Prettify(s)
}

func (s SofaGwAppVO) GoString() string {
	return s.String()
}

func (s *SofaGwAppVO) SetAuthentications(v []*SofaGwAuthenticationVO) *SofaGwAppVO {
	s.Authentications = v
	return s
}

func (s *SofaGwAppVO) SetDescription(v string) *SofaGwAppVO {
	s.Description = &v
	return s
}

func (s *SofaGwAppVO) SetId(v int64) *SofaGwAppVO {
	s.Id = &v
	return s
}

func (s *SofaGwAppVO) SetInstanceId(v string) *SofaGwAppVO {
	s.InstanceId = &v
	return s
}

func (s *SofaGwAppVO) SetName(v string) *SofaGwAppVO {
	s.Name = &v
	return s
}

func (s *SofaGwAppVO) SetServices(v []*string) *SofaGwAppVO {
	s.Services = v
	return s
}

func (s *SofaGwAppVO) SetType(v string) *SofaGwAppVO {
	s.Type = &v
	return s
}

// ApiInfoQueryVO
type ApiInfoQueryVO struct {
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 自定义查询条件
	QueryCondition *string `json:"query_condition,omitempty" xml:"query_condition,omitempty"`
}

func (s ApiInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiInfoQueryVO) GoString() string {
	return s.String()
}

func (s *ApiInfoQueryVO) SetFuzzySearch(v bool) *ApiInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ApiInfoQueryVO) SetPageInfo(v *PageInfo) *ApiInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiInfoQueryVO) SetQuery(v *ApiInfoVO) *ApiInfoQueryVO {
	s.Query = v
	return s
}

func (s *ApiInfoQueryVO) SetQueryCondition(v string) *ApiInfoQueryVO {
	s.QueryCondition = &v
	return s
}

// AuthUserInfoPagedListVO
type AuthUserInfoPagedListVO struct {
	// 当前页的数据
	List []*AuthUserInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s AuthUserInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s AuthUserInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *AuthUserInfoPagedListVO) SetList(v []*AuthUserInfoVO) *AuthUserInfoPagedListVO {
	s.List = v
	return s
}

func (s *AuthUserInfoPagedListVO) SetPageInfo(v *PageInfo) *AuthUserInfoPagedListVO {
	s.PageInfo = v
	return s
}

// ApiModelPagedListVO
type ApiModelPagedListVO struct {
	// list
	List []*ApiModelVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiModelPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiModelPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiModelPagedListVO) SetList(v []*ApiModelVO) *ApiModelPagedListVO {
	s.List = v
	return s
}

func (s *ApiModelPagedListVO) SetPageInfo(v *PageInfo) *ApiModelPagedListVO {
	s.PageInfo = v
	return s
}

// ApiflowInstQueryVO
type ApiflowInstQueryVO struct {
	// fuzzy_search
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *ApiflowInstVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s ApiflowInstQueryVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowInstQueryVO) GoString() string {
	return s.String()
}

func (s *ApiflowInstQueryVO) SetFuzzySearch(v bool) *ApiflowInstQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *ApiflowInstQueryVO) SetPageInfo(v *PageInfo) *ApiflowInstQueryVO {
	s.PageInfo = v
	return s
}

func (s *ApiflowInstQueryVO) SetQuery(v *ApiflowInstVO) *ApiflowInstQueryVO {
	s.Query = v
	return s
}

// CorsInfoQueryVO
type CorsInfoQueryVO struct {
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *CorsInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s CorsInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s CorsInfoQueryVO) GoString() string {
	return s.String()
}

func (s *CorsInfoQueryVO) SetPageInfo(v *PageInfo) *CorsInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *CorsInfoQueryVO) SetQuery(v *CorsInfoVO) *CorsInfoQueryVO {
	s.Query = v
	return s
}

func (s *CorsInfoQueryVO) SetFuzzySearch(v bool) *CorsInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// ApiflowMachineInstPagedListVO
type ApiflowMachineInstPagedListVO struct {
	// list
	List []*ApiflowMachineInstVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ApiflowMachineInstPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ApiflowMachineInstPagedListVO) GoString() string {
	return s.String()
}

func (s *ApiflowMachineInstPagedListVO) SetList(v []*ApiflowMachineInstVO) *ApiflowMachineInstPagedListVO {
	s.List = v
	return s
}

func (s *ApiflowMachineInstPagedListVO) SetPageInfo(v *PageInfo) *ApiflowMachineInstPagedListVO {
	s.PageInfo = v
	return s
}

// StrategyInfoQueryVO
type StrategyInfoQueryVO struct {
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *StrategyInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s StrategyInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s StrategyInfoQueryVO) GoString() string {
	return s.String()
}

func (s *StrategyInfoQueryVO) SetPageInfo(v *PageInfo) *StrategyInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *StrategyInfoQueryVO) SetQuery(v *StrategyInfoVO) *StrategyInfoQueryVO {
	s.Query = v
	return s
}

func (s *StrategyInfoQueryVO) SetFuzzySearch(v bool) *StrategyInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// ExternalAuthInfoPagedListVO
type ExternalAuthInfoPagedListVO struct {
	// list
	List []*ExternalAuthInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s ExternalAuthInfoPagedListVO) String() string {
	return tea.Prettify(s)
}

func (s ExternalAuthInfoPagedListVO) GoString() string {
	return s.String()
}

func (s *ExternalAuthInfoPagedListVO) SetList(v []*ExternalAuthInfoVO) *ExternalAuthInfoPagedListVO {
	s.List = v
	return s
}

func (s *ExternalAuthInfoPagedListVO) SetPageInfo(v *PageInfo) *ExternalAuthInfoPagedListVO {
	s.PageInfo = v
	return s
}

// RouterInfoQueryVO
type RouterInfoQueryVO struct {
	// pageInfo
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *RouterInfoVO `json:"query,omitempty" xml:"query,omitempty"`
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
}

func (s RouterInfoQueryVO) String() string {
	return tea.Prettify(s)
}

func (s RouterInfoQueryVO) GoString() string {
	return s.String()
}

func (s *RouterInfoQueryVO) SetPageInfo(v *PageInfo) *RouterInfoQueryVO {
	s.PageInfo = v
	return s
}

func (s *RouterInfoQueryVO) SetQuery(v *RouterInfoVO) *RouterInfoQueryVO {
	s.Query = v
	return s
}

func (s *RouterInfoQueryVO) SetFuzzySearch(v bool) *RouterInfoQueryVO {
	s.FuzzySearch = &v
	return s
}

// SystemConfigQueryVO
type SystemConfigQueryVO struct {
	// 是否模糊搜索
	FuzzySearch *bool `json:"fuzzy_search,omitempty" xml:"fuzzy_search,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// query
	Query *SystemConfigVO `json:"query,omitempty" xml:"query,omitempty"`
}

func (s SystemConfigQueryVO) String() string {
	return tea.Prettify(s)
}

func (s SystemConfigQueryVO) GoString() string {
	return s.String()
}

func (s *SystemConfigQueryVO) SetFuzzySearch(v bool) *SystemConfigQueryVO {
	s.FuzzySearch = &v
	return s
}

func (s *SystemConfigQueryVO) SetPageInfo(v *PageInfo) *SystemConfigQueryVO {
	s.PageInfo = v
	return s
}

func (s *SystemConfigQueryVO) SetQuery(v *SystemConfigVO) *SystemConfigQueryVO {
	s.Query = v
	return s
}

type CreateApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiGroupVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApigroupRequest) GoString() string {
	return s.String()
}

func (s *CreateApigroupRequest) SetAuthToken(v string) *CreateApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApigroupRequest) SetProductInstanceId(v string) *CreateApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApigroupRequest) SetParam(v *ApiGroupVO) *CreateApigroupRequest {
	s.Param = v
	return s
}

func (s *CreateApigroupRequest) SetTenantId(v string) *CreateApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApigroupRequest) SetWorkspaceId(v string) *CreateApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiGroupVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApigroupResponse) GoString() string {
	return s.String()
}

func (s *CreateApigroupResponse) SetReqMsgId(v string) *CreateApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApigroupResponse) SetResultCode(v string) *CreateApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApigroupResponse) SetResultMsg(v string) *CreateApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApigroupResponse) SetData(v *ApiGroupVO) *CreateApigroupResponse {
	s.Data = v
	return s
}

type AllApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiGroupQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApigroupRequest) GoString() string {
	return s.String()
}

func (s *AllApigroupRequest) SetAuthToken(v string) *AllApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApigroupRequest) SetProductInstanceId(v string) *AllApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApigroupRequest) SetParam(v *ApiGroupQueryVO) *AllApigroupRequest {
	s.Param = v
	return s
}

func (s *AllApigroupRequest) SetTenantId(v string) *AllApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *AllApigroupRequest) SetWorkspaceId(v string) *AllApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type AllApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiGroupVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApigroupResponse) GoString() string {
	return s.String()
}

func (s *AllApigroupResponse) SetReqMsgId(v string) *AllApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApigroupResponse) SetResultCode(v string) *AllApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApigroupResponse) SetResultMsg(v string) *AllApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApigroupResponse) SetData(v []*ApiGroupVO) *AllApigroupResponse {
	s.Data = v
	return s
}

type ListApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiGroupQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupRequest) GoString() string {
	return s.String()
}

func (s *ListApigroupRequest) SetAuthToken(v string) *ListApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApigroupRequest) SetProductInstanceId(v string) *ListApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApigroupRequest) SetParam(v *ApiGroupQueryVO) *ListApigroupRequest {
	s.Param = v
	return s
}

func (s *ListApigroupRequest) SetTenantId(v string) *ListApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *ListApigroupRequest) SetWorkspaceId(v string) *ListApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type ListApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiGroupPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupResponse) GoString() string {
	return s.String()
}

func (s *ListApigroupResponse) SetReqMsgId(v string) *ListApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApigroupResponse) SetResultCode(v string) *ListApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApigroupResponse) SetResultMsg(v string) *ListApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApigroupResponse) SetData(v *ApiGroupPagedListVO) *ListApigroupResponse {
	s.Data = v
	return s
}

type CreateSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateSysRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSysRequest) GoString() string {
	return s.String()
}

func (s *CreateSysRequest) SetAuthToken(v string) *CreateSysRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSysRequest) SetProductInstanceId(v string) *CreateSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSysRequest) SetParam(v *SystemClusterVO) *CreateSysRequest {
	s.Param = v
	return s
}

func (s *CreateSysRequest) SetTenantId(v string) *CreateSysRequest {
	s.TenantId = &v
	return s
}

func (s *CreateSysRequest) SetWorkspaceId(v string) *CreateSysRequest {
	s.WorkspaceId = &v
	return s
}

type CreateSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemClusterVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateSysResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSysResponse) GoString() string {
	return s.String()
}

func (s *CreateSysResponse) SetReqMsgId(v string) *CreateSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSysResponse) SetResultCode(v string) *CreateSysResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSysResponse) SetResultMsg(v string) *CreateSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateSysResponse) SetData(v *SystemClusterVO) *CreateSysResponse {
	s.Data = v
	return s
}

type AllSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllSysRequest) String() string {
	return tea.Prettify(s)
}

func (s AllSysRequest) GoString() string {
	return s.String()
}

func (s *AllSysRequest) SetAuthToken(v string) *AllSysRequest {
	s.AuthToken = &v
	return s
}

func (s *AllSysRequest) SetProductInstanceId(v string) *AllSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllSysRequest) SetParam(v *SystemClusterQueryVO) *AllSysRequest {
	s.Param = v
	return s
}

func (s *AllSysRequest) SetTenantId(v string) *AllSysRequest {
	s.TenantId = &v
	return s
}

func (s *AllSysRequest) SetWorkspaceId(v string) *AllSysRequest {
	s.WorkspaceId = &v
	return s
}

type AllSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*SystemClusterVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllSysResponse) String() string {
	return tea.Prettify(s)
}

func (s AllSysResponse) GoString() string {
	return s.String()
}

func (s *AllSysResponse) SetReqMsgId(v string) *AllSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllSysResponse) SetResultCode(v string) *AllSysResponse {
	s.ResultCode = &v
	return s
}

func (s *AllSysResponse) SetResultMsg(v string) *AllSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllSysResponse) SetData(v []*SystemClusterVO) *AllSysResponse {
	s.Data = v
	return s
}

type ListSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListSysRequest) String() string {
	return tea.Prettify(s)
}

func (s ListSysRequest) GoString() string {
	return s.String()
}

func (s *ListSysRequest) SetAuthToken(v string) *ListSysRequest {
	s.AuthToken = &v
	return s
}

func (s *ListSysRequest) SetProductInstanceId(v string) *ListSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListSysRequest) SetParam(v *SystemClusterQueryVO) *ListSysRequest {
	s.Param = v
	return s
}

func (s *ListSysRequest) SetTenantId(v string) *ListSysRequest {
	s.TenantId = &v
	return s
}

func (s *ListSysRequest) SetWorkspaceId(v string) *ListSysRequest {
	s.WorkspaceId = &v
	return s
}

type ListSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemClusterPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListSysResponse) String() string {
	return tea.Prettify(s)
}

func (s ListSysResponse) GoString() string {
	return s.String()
}

func (s *ListSysResponse) SetReqMsgId(v string) *ListSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListSysResponse) SetResultCode(v string) *ListSysResponse {
	s.ResultCode = &v
	return s
}

func (s *ListSysResponse) SetResultMsg(v string) *ListSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListSysResponse) SetData(v *SystemClusterPagedListVO) *ListSysResponse {
	s.Data = v
	return s
}

type GetApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_group_id
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupRequest) GoString() string {
	return s.String()
}

func (s *GetApigroupRequest) SetAuthToken(v string) *GetApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApigroupRequest) SetProductInstanceId(v string) *GetApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApigroupRequest) SetApiGroupId(v string) *GetApigroupRequest {
	s.ApiGroupId = &v
	return s
}

func (s *GetApigroupRequest) SetTenantId(v string) *GetApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *GetApigroupRequest) SetWorkspaceId(v string) *GetApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type GetApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiGroupVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupResponse) GoString() string {
	return s.String()
}

func (s *GetApigroupResponse) SetReqMsgId(v string) *GetApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApigroupResponse) SetResultCode(v string) *GetApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApigroupResponse) SetResultMsg(v string) *GetApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApigroupResponse) SetData(v *ApiGroupVO) *GetApigroupResponse {
	s.Data = v
	return s
}

type UpdateApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiGroupVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApigroupRequest) GoString() string {
	return s.String()
}

func (s *UpdateApigroupRequest) SetAuthToken(v string) *UpdateApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApigroupRequest) SetProductInstanceId(v string) *UpdateApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApigroupRequest) SetParam(v *ApiGroupVO) *UpdateApigroupRequest {
	s.Param = v
	return s
}

func (s *UpdateApigroupRequest) SetTenantId(v string) *UpdateApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApigroupRequest) SetWorkspaceId(v string) *UpdateApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApigroupResponse) GoString() string {
	return s.String()
}

func (s *UpdateApigroupResponse) SetReqMsgId(v string) *UpdateApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApigroupResponse) SetResultCode(v string) *UpdateApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApigroupResponse) SetResultMsg(v string) *UpdateApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApigroupResponse) SetData(v bool) *UpdateApigroupResponse {
	s.Data = &v
	return s
}

type DeleteApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_group_id
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApigroupRequest) GoString() string {
	return s.String()
}

func (s *DeleteApigroupRequest) SetAuthToken(v string) *DeleteApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApigroupRequest) SetProductInstanceId(v string) *DeleteApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApigroupRequest) SetApiGroupId(v string) *DeleteApigroupRequest {
	s.ApiGroupId = &v
	return s
}

func (s *DeleteApigroupRequest) SetTenantId(v string) *DeleteApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApigroupRequest) SetWorkspaceId(v string) *DeleteApigroupRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApigroupResponse) GoString() string {
	return s.String()
}

func (s *DeleteApigroupResponse) SetReqMsgId(v string) *DeleteApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApigroupResponse) SetResultCode(v string) *DeleteApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApigroupResponse) SetResultMsg(v string) *DeleteApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApigroupResponse) SetData(v bool) *DeleteApigroupResponse {
	s.Data = &v
	return s
}

type CreateApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApiRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiRequest) GoString() string {
	return s.String()
}

func (s *CreateApiRequest) SetAuthToken(v string) *CreateApiRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiRequest) SetProductInstanceId(v string) *CreateApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApiRequest) SetParam(v *ApiInfoVO) *CreateApiRequest {
	s.Param = v
	return s
}

func (s *CreateApiRequest) SetTenantId(v string) *CreateApiRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApiRequest) SetWorkspaceId(v string) *CreateApiRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApiResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiResponse) GoString() string {
	return s.String()
}

func (s *CreateApiResponse) SetReqMsgId(v string) *CreateApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiResponse) SetResultCode(v string) *CreateApiResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiResponse) SetResultMsg(v string) *CreateApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApiResponse) SetData(v *ApiInfoVO) *CreateApiResponse {
	s.Data = v
	return s
}

type UpdateApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApiRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiRequest) SetAuthToken(v string) *UpdateApiRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiRequest) SetProductInstanceId(v string) *UpdateApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiRequest) SetParam(v *ApiInfoVO) *UpdateApiRequest {
	s.Param = v
	return s
}

func (s *UpdateApiRequest) SetTenantId(v string) *UpdateApiRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApiRequest) SetWorkspaceId(v string) *UpdateApiRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiResponse) SetReqMsgId(v string) *UpdateApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiResponse) SetResultCode(v string) *UpdateApiResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiResponse) SetResultMsg(v string) *UpdateApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiResponse) SetData(v bool) *UpdateApiResponse {
	s.Data = &v
	return s
}

type AllApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApiRequest) GoString() string {
	return s.String()
}

func (s *AllApiRequest) SetAuthToken(v string) *AllApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApiRequest) SetProductInstanceId(v string) *AllApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApiRequest) SetParam(v *ApiInfoQueryVO) *AllApiRequest {
	s.Param = v
	return s
}

func (s *AllApiRequest) SetTenantId(v string) *AllApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllApiRequest) SetWorkspaceId(v string) *AllApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApiResponse) GoString() string {
	return s.String()
}

func (s *AllApiResponse) SetReqMsgId(v string) *AllApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApiResponse) SetResultCode(v string) *AllApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApiResponse) SetResultMsg(v string) *AllApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApiResponse) SetData(v []*ApiInfoVO) *AllApiResponse {
	s.Data = v
	return s
}

type ListApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApiRequest) GoString() string {
	return s.String()
}

func (s *ListApiRequest) SetAuthToken(v string) *ListApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApiRequest) SetProductInstanceId(v string) *ListApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApiRequest) SetParam(v *ApiInfoQueryVO) *ListApiRequest {
	s.Param = v
	return s
}

func (s *ListApiRequest) SetTenantId(v string) *ListApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListApiRequest) SetWorkspaceId(v string) *ListApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApiResponse) GoString() string {
	return s.String()
}

func (s *ListApiResponse) SetReqMsgId(v string) *ListApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApiResponse) SetResultCode(v string) *ListApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApiResponse) SetResultMsg(v string) *ListApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApiResponse) SetData(v *ApiInfoPagedListVO) *ListApiResponse {
	s.Data = v
	return s
}

type GetApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s GetApiRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiRequest) GoString() string {
	return s.String()
}

func (s *GetApiRequest) SetAuthToken(v string) *GetApiRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiRequest) SetProductInstanceId(v string) *GetApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiRequest) SetApiId(v string) *GetApiRequest {
	s.ApiId = &v
	return s
}

func (s *GetApiRequest) SetTenantId(v string) *GetApiRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiRequest) SetWorkspaceId(v string) *GetApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetApiRequest) SetApiType(v string) *GetApiRequest {
	s.ApiType = &v
	return s
}

type GetApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiResponse) GoString() string {
	return s.String()
}

func (s *GetApiResponse) SetReqMsgId(v string) *GetApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiResponse) SetResultCode(v string) *GetApiResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiResponse) SetResultMsg(v string) *GetApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiResponse) SetData(v *ApiInfoVO) *GetApiResponse {
	s.Data = v
	return s
}

type CreateAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AppInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateAppRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppRequest) GoString() string {
	return s.String()
}

func (s *CreateAppRequest) SetAuthToken(v string) *CreateAppRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppRequest) SetProductInstanceId(v string) *CreateAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppRequest) SetParam(v *AppInfoVO) *CreateAppRequest {
	s.Param = v
	return s
}

func (s *CreateAppRequest) SetTenantId(v string) *CreateAppRequest {
	s.TenantId = &v
	return s
}

func (s *CreateAppRequest) SetWorkspaceId(v string) *CreateAppRequest {
	s.WorkspaceId = &v
	return s
}

type CreateAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAppResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppResponse) GoString() string {
	return s.String()
}

func (s *CreateAppResponse) SetReqMsgId(v string) *CreateAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppResponse) SetResultCode(v string) *CreateAppResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppResponse) SetResultMsg(v string) *CreateAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAppResponse) SetData(v *AppInfoVO) *CreateAppResponse {
	s.Data = v
	return s
}

type UpdateAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AppInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户 标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateAppRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppRequest) GoString() string {
	return s.String()
}

func (s *UpdateAppRequest) SetAuthToken(v string) *UpdateAppRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAppRequest) SetProductInstanceId(v string) *UpdateAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAppRequest) SetParam(v *AppInfoVO) *UpdateAppRequest {
	s.Param = v
	return s
}

func (s *UpdateAppRequest) SetTenantId(v string) *UpdateAppRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateAppRequest) SetWorkspaceId(v string) *UpdateAppRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateAppResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppResponse) GoString() string {
	return s.String()
}

func (s *UpdateAppResponse) SetReqMsgId(v string) *UpdateAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAppResponse) SetResultCode(v string) *UpdateAppResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAppResponse) SetResultMsg(v string) *UpdateAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAppResponse) SetData(v bool) *UpdateAppResponse {
	s.Data = &v
	return s
}

type AllAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllAppRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAppRequest) GoString() string {
	return s.String()
}

func (s *AllAppRequest) SetAuthToken(v string) *AllAppRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAppRequest) SetProductInstanceId(v string) *AllAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAppRequest) SetParam(v *AppInfoQueryVO) *AllAppRequest {
	s.Param = v
	return s
}

func (s *AllAppRequest) SetTenantId(v string) *AllAppRequest {
	s.TenantId = &v
	return s
}

func (s *AllAppRequest) SetWorkspaceId(v string) *AllAppRequest {
	s.WorkspaceId = &v
	return s
}

type AllAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AppInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllAppResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAppResponse) GoString() string {
	return s.String()
}

func (s *AllAppResponse) SetReqMsgId(v string) *AllAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAppResponse) SetResultCode(v string) *AllAppResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAppResponse) SetResultMsg(v string) *AllAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAppResponse) SetData(v []*AppInfoVO) *AllAppResponse {
	s.Data = v
	return s
}

type ListAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListAppRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppRequest) GoString() string {
	return s.String()
}

func (s *ListAppRequest) SetAuthToken(v string) *ListAppRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppRequest) SetProductInstanceId(v string) *ListAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAppRequest) SetParam(v *AppInfoQueryVO) *ListAppRequest {
	s.Param = v
	return s
}

func (s *ListAppRequest) SetTenantId(v string) *ListAppRequest {
	s.TenantId = &v
	return s
}

func (s *ListAppRequest) SetWorkspaceId(v string) *ListAppRequest {
	s.WorkspaceId = &v
	return s
}

type ListAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AppInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListAppResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppResponse) GoString() string {
	return s.String()
}

func (s *ListAppResponse) SetReqMsgId(v string) *ListAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppResponse) SetResultCode(v string) *ListAppResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppResponse) SetResultMsg(v string) *ListAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppResponse) SetData(v *AppInfoPagedListVO) *ListAppResponse {
	s.Data = v
	return s
}

type GetAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 查询类型，不填默认查询传递的wsId的appId,填写outer可以查询跨租户app
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty"`
}

func (s GetAppRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAppRequest) GoString() string {
	return s.String()
}

func (s *GetAppRequest) SetAuthToken(v string) *GetAppRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAppRequest) SetProductInstanceId(v string) *GetAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAppRequest) SetAppId(v string) *GetAppRequest {
	s.AppId = &v
	return s
}

func (s *GetAppRequest) SetTenantId(v string) *GetAppRequest {
	s.TenantId = &v
	return s
}

func (s *GetAppRequest) SetWorkspaceId(v string) *GetAppRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetAppRequest) SetQueryType(v string) *GetAppRequest {
	s.QueryType = &v
	return s
}

type GetAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetAppResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAppResponse) GoString() string {
	return s.String()
}

func (s *GetAppResponse) SetReqMsgId(v string) *GetAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAppResponse) SetResultCode(v string) *GetAppResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAppResponse) SetResultMsg(v string) *GetAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAppResponse) SetData(v *AppInfoVO) *GetAppResponse {
	s.Data = v
	return s
}

type CreateAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AuthAppInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAuthappRequest) GoString() string {
	return s.String()
}

func (s *CreateAuthappRequest) SetAuthToken(v string) *CreateAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAuthappRequest) SetProductInstanceId(v string) *CreateAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAuthappRequest) SetParam(v *AuthAppInfoVO) *CreateAuthappRequest {
	s.Param = v
	return s
}

func (s *CreateAuthappRequest) SetTenantId(v string) *CreateAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *CreateAuthappRequest) SetWorkspaceId(v string) *CreateAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type CreateAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthAppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAuthappResponse) GoString() string {
	return s.String()
}

func (s *CreateAuthappResponse) SetReqMsgId(v string) *CreateAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAuthappResponse) SetResultCode(v string) *CreateAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAuthappResponse) SetResultMsg(v string) *CreateAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAuthappResponse) SetData(v *AuthAppInfoVO) *CreateAuthappResponse {
	s.Data = v
	return s
}

type UpdateAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AuthAppInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthappRequest) GoString() string {
	return s.String()
}

func (s *UpdateAuthappRequest) SetAuthToken(v string) *UpdateAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAuthappRequest) SetProductInstanceId(v string) *UpdateAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAuthappRequest) SetParam(v *AuthAppInfoVO) *UpdateAuthappRequest {
	s.Param = v
	return s
}

func (s *UpdateAuthappRequest) SetTenantId(v string) *UpdateAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateAuthappRequest) SetWorkspaceId(v string) *UpdateAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAuthappResponse) GoString() string {
	return s.String()
}

func (s *UpdateAuthappResponse) SetReqMsgId(v string) *UpdateAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAuthappResponse) SetResultCode(v string) *UpdateAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAuthappResponse) SetResultMsg(v string) *UpdateAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAuthappResponse) SetData(v bool) *UpdateAuthappResponse {
	s.Data = &v
	return s
}

type DeleteAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权App信息标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAuthappRequest) GoString() string {
	return s.String()
}

func (s *DeleteAuthappRequest) SetAuthToken(v string) *DeleteAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAuthappRequest) SetProductInstanceId(v string) *DeleteAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAuthappRequest) SetAuthAppInfoId(v string) *DeleteAuthappRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *DeleteAuthappRequest) SetTenantId(v string) *DeleteAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteAuthappRequest) SetWorkspaceId(v string) *DeleteAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAuthappResponse) GoString() string {
	return s.String()
}

func (s *DeleteAuthappResponse) SetReqMsgId(v string) *DeleteAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAuthappResponse) SetResultCode(v string) *DeleteAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAuthappResponse) SetResultMsg(v string) *DeleteAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAuthappResponse) SetData(v bool) *DeleteAuthappResponse {
	s.Data = &v
	return s
}

type AllAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AuthAppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAuthappRequest) GoString() string {
	return s.String()
}

func (s *AllAuthappRequest) SetAuthToken(v string) *AllAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAuthappRequest) SetProductInstanceId(v string) *AllAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAuthappRequest) SetParam(v *AuthAppInfoQueryVO) *AllAuthappRequest {
	s.Param = v
	return s
}

func (s *AllAuthappRequest) SetTenantId(v string) *AllAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *AllAuthappRequest) SetWorkspaceId(v string) *AllAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type AllAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AuthAppInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAuthappResponse) GoString() string {
	return s.String()
}

func (s *AllAuthappResponse) SetReqMsgId(v string) *AllAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAuthappResponse) SetResultCode(v string) *AllAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAuthappResponse) SetResultMsg(v string) *AllAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAuthappResponse) SetData(v []*AuthAppInfoVO) *AllAuthappResponse {
	s.Data = v
	return s
}

type ListAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AuthAppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间 标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthappRequest) GoString() string {
	return s.String()
}

func (s *ListAuthappRequest) SetAuthToken(v string) *ListAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthappRequest) SetProductInstanceId(v string) *ListAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAuthappRequest) SetParam(v *AuthAppInfoQueryVO) *ListAuthappRequest {
	s.Param = v
	return s
}

func (s *ListAuthappRequest) SetTenantId(v string) *ListAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *ListAuthappRequest) SetWorkspaceId(v string) *ListAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type ListAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthAppInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthappResponse) GoString() string {
	return s.String()
}

func (s *ListAuthappResponse) SetReqMsgId(v string) *ListAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthappResponse) SetResultCode(v string) *ListAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthappResponse) SetResultMsg(v string) *ListAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthappResponse) SetData(v *AuthAppInfoPagedListVO) *ListAuthappResponse {
	s.Data = v
	return s
}

type GetAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权App信息标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAuthappRequest) GoString() string {
	return s.String()
}

func (s *GetAuthappRequest) SetAuthToken(v string) *GetAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAuthappRequest) SetProductInstanceId(v string) *GetAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAuthappRequest) SetAuthAppInfoId(v string) *GetAuthappRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *GetAuthappRequest) SetTenantId(v string) *GetAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *GetAuthappRequest) SetWorkspaceId(v string) *GetAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type GetAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthAppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAuthappResponse) GoString() string {
	return s.String()
}

func (s *GetAuthappResponse) SetReqMsgId(v string) *GetAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAuthappResponse) SetResultCode(v string) *GetAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAuthappResponse) SetResultMsg(v string) *GetAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAuthappResponse) SetData(v *AuthAppInfoVO) *GetAuthappResponse {
	s.Data = v
	return s
}

type CreateRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RouterInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRouterRequest) GoString() string {
	return s.String()
}

func (s *CreateRouterRequest) SetAuthToken(v string) *CreateRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRouterRequest) SetProductInstanceId(v string) *CreateRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRouterRequest) SetParam(v *RouterInfoVO) *CreateRouterRequest {
	s.Param = v
	return s
}

func (s *CreateRouterRequest) SetTenantId(v string) *CreateRouterRequest {
	s.TenantId = &v
	return s
}

func (s *CreateRouterRequest) SetWorkspaceId(v string) *CreateRouterRequest {
	s.WorkspaceId = &v
	return s
}

type CreateRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RouterInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRouterResponse) GoString() string {
	return s.String()
}

func (s *CreateRouterResponse) SetReqMsgId(v string) *CreateRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRouterResponse) SetResultCode(v string) *CreateRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRouterResponse) SetResultMsg(v string) *CreateRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRouterResponse) SetData(v *RouterInfoVO) *CreateRouterResponse {
	s.Data = v
	return s
}

type UpdateRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RouterInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRouterRequest) GoString() string {
	return s.String()
}

func (s *UpdateRouterRequest) SetAuthToken(v string) *UpdateRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRouterRequest) SetProductInstanceId(v string) *UpdateRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateRouterRequest) SetParam(v *RouterInfoVO) *UpdateRouterRequest {
	s.Param = v
	return s
}

func (s *UpdateRouterRequest) SetTenantId(v string) *UpdateRouterRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateRouterRequest) SetWorkspaceId(v string) *UpdateRouterRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRouterResponse) GoString() string {
	return s.String()
}

func (s *UpdateRouterResponse) SetReqMsgId(v string) *UpdateRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRouterResponse) SetResultCode(v string) *UpdateRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRouterResponse) SetResultMsg(v string) *UpdateRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRouterResponse) SetData(v bool) *UpdateRouterResponse {
	s.Data = &v
	return s
}

type DeleteRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 路由规则标识
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRouterRequest) GoString() string {
	return s.String()
}

func (s *DeleteRouterRequest) SetAuthToken(v string) *DeleteRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRouterRequest) SetProductInstanceId(v string) *DeleteRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteRouterRequest) SetRouterId(v string) *DeleteRouterRequest {
	s.RouterId = &v
	return s
}

func (s *DeleteRouterRequest) SetTenantId(v string) *DeleteRouterRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteRouterRequest) SetWorkspaceId(v string) *DeleteRouterRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRouterResponse) GoString() string {
	return s.String()
}

func (s *DeleteRouterResponse) SetReqMsgId(v string) *DeleteRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRouterResponse) SetResultCode(v string) *DeleteRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRouterResponse) SetResultMsg(v string) *DeleteRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteRouterResponse) SetData(v bool) *DeleteRouterResponse {
	s.Data = &v
	return s
}

type AllRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RouterInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s AllRouterRequest) GoString() string {
	return s.String()
}

func (s *AllRouterRequest) SetAuthToken(v string) *AllRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *AllRouterRequest) SetProductInstanceId(v string) *AllRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllRouterRequest) SetParam(v *RouterInfoQueryVO) *AllRouterRequest {
	s.Param = v
	return s
}

func (s *AllRouterRequest) SetTenantId(v string) *AllRouterRequest {
	s.TenantId = &v
	return s
}

func (s *AllRouterRequest) SetWorkspaceId(v string) *AllRouterRequest {
	s.WorkspaceId = &v
	return s
}

type AllRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*RouterInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s AllRouterResponse) GoString() string {
	return s.String()
}

func (s *AllRouterResponse) SetReqMsgId(v string) *AllRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllRouterResponse) SetResultCode(v string) *AllRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *AllRouterResponse) SetResultMsg(v string) *AllRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllRouterResponse) SetData(v []*RouterInfoVO) *AllRouterResponse {
	s.Data = v
	return s
}

type ListRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RouterInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRouterRequest) GoString() string {
	return s.String()
}

func (s *ListRouterRequest) SetAuthToken(v string) *ListRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRouterRequest) SetProductInstanceId(v string) *ListRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRouterRequest) SetParam(v *RouterInfoQueryVO) *ListRouterRequest {
	s.Param = v
	return s
}

func (s *ListRouterRequest) SetTenantId(v string) *ListRouterRequest {
	s.TenantId = &v
	return s
}

func (s *ListRouterRequest) SetWorkspaceId(v string) *ListRouterRequest {
	s.WorkspaceId = &v
	return s
}

type ListRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RouterInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRouterResponse) GoString() string {
	return s.String()
}

func (s *ListRouterResponse) SetReqMsgId(v string) *ListRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRouterResponse) SetResultCode(v string) *ListRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRouterResponse) SetResultMsg(v string) *ListRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRouterResponse) SetData(v *RouterInfoPagedListVO) *ListRouterResponse {
	s.Data = v
	return s
}

type GetRouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 路由规则标识
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetRouterRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRouterRequest) GoString() string {
	return s.String()
}

func (s *GetRouterRequest) SetAuthToken(v string) *GetRouterRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRouterRequest) SetProductInstanceId(v string) *GetRouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRouterRequest) SetRouterId(v string) *GetRouterRequest {
	s.RouterId = &v
	return s
}

func (s *GetRouterRequest) SetTenantId(v string) *GetRouterRequest {
	s.TenantId = &v
	return s
}

func (s *GetRouterRequest) SetWorkspaceId(v string) *GetRouterRequest {
	s.WorkspaceId = &v
	return s
}

type GetRouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RouterInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetRouterResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRouterResponse) GoString() string {
	return s.String()
}

func (s *GetRouterResponse) SetReqMsgId(v string) *GetRouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRouterResponse) SetResultCode(v string) *GetRouterResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRouterResponse) SetResultMsg(v string) *GetRouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRouterResponse) SetData(v *RouterInfoVO) *GetRouterResponse {
	s.Data = v
	return s
}

type UpdateSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateSysRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateSysRequest) GoString() string {
	return s.String()
}

func (s *UpdateSysRequest) SetAuthToken(v string) *UpdateSysRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateSysRequest) SetProductInstanceId(v string) *UpdateSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateSysRequest) SetParam(v *SystemClusterVO) *UpdateSysRequest {
	s.Param = v
	return s
}

func (s *UpdateSysRequest) SetTenantId(v string) *UpdateSysRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateSysRequest) SetWorkspaceId(v string) *UpdateSysRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateSysResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateSysResponse) GoString() string {
	return s.String()
}

func (s *UpdateSysResponse) SetReqMsgId(v string) *UpdateSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateSysResponse) SetResultCode(v string) *UpdateSysResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateSysResponse) SetResultMsg(v string) *UpdateSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateSysResponse) SetData(v bool) *UpdateSysResponse {
	s.Data = &v
	return s
}

type DeleteSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 后端集群标识
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteSysRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteSysRequest) GoString() string {
	return s.String()
}

func (s *DeleteSysRequest) SetAuthToken(v string) *DeleteSysRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteSysRequest) SetProductInstanceId(v string) *DeleteSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteSysRequest) SetSysId(v string) *DeleteSysRequest {
	s.SysId = &v
	return s
}

func (s *DeleteSysRequest) SetTenantId(v string) *DeleteSysRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteSysRequest) SetWorkspaceId(v string) *DeleteSysRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteSysResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteSysResponse) GoString() string {
	return s.String()
}

func (s *DeleteSysResponse) SetReqMsgId(v string) *DeleteSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteSysResponse) SetResultCode(v string) *DeleteSysResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteSysResponse) SetResultMsg(v string) *DeleteSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteSysResponse) SetData(v bool) *DeleteSysResponse {
	s.Data = &v
	return s
}

type GetSysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 后端集群标识
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetSysRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSysRequest) GoString() string {
	return s.String()
}

func (s *GetSysRequest) SetAuthToken(v string) *GetSysRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSysRequest) SetProductInstanceId(v string) *GetSysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSysRequest) SetSysId(v string) *GetSysRequest {
	s.SysId = &v
	return s
}

func (s *GetSysRequest) SetTenantId(v string) *GetSysRequest {
	s.TenantId = &v
	return s
}

func (s *GetSysRequest) SetWorkspaceId(v string) *GetSysRequest {
	s.WorkspaceId = &v
	return s
}

type GetSysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemClusterVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetSysResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSysResponse) GoString() string {
	return s.String()
}

func (s *GetSysResponse) SetReqMsgId(v string) *GetSysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSysResponse) SetResultCode(v string) *GetSysResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSysResponse) SetResultMsg(v string) *GetSysResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSysResponse) SetData(v *SystemClusterVO) *GetSysResponse {
	s.Data = v
	return s
}

type AllApigroupApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApigroupApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApigroupApiRequest) GoString() string {
	return s.String()
}

func (s *AllApigroupApiRequest) SetAuthToken(v string) *AllApigroupApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApigroupApiRequest) SetProductInstanceId(v string) *AllApigroupApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApigroupApiRequest) SetApiGroupId(v string) *AllApigroupApiRequest {
	s.ApiGroupId = &v
	return s
}

func (s *AllApigroupApiRequest) SetParam(v *ApiInfoQueryVO) *AllApigroupApiRequest {
	s.Param = v
	return s
}

func (s *AllApigroupApiRequest) SetTenantId(v string) *AllApigroupApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllApigroupApiRequest) SetWorkspaceId(v string) *AllApigroupApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllApigroupApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApigroupApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApigroupApiResponse) GoString() string {
	return s.String()
}

func (s *AllApigroupApiResponse) SetReqMsgId(v string) *AllApigroupApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApigroupApiResponse) SetResultCode(v string) *AllApigroupApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApigroupApiResponse) SetResultMsg(v string) *AllApigroupApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApigroupApiResponse) SetData(v []*ApiInfoVO) *AllApigroupApiResponse {
	s.Data = v
	return s
}

type DeleteAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteAppRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppRequest) GoString() string {
	return s.String()
}

func (s *DeleteAppRequest) SetAuthToken(v string) *DeleteAppRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAppRequest) SetProductInstanceId(v string) *DeleteAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAppRequest) SetAppId(v string) *DeleteAppRequest {
	s.AppId = &v
	return s
}

func (s *DeleteAppRequest) SetTenantId(v string) *DeleteAppRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteAppRequest) SetWorkspaceId(v string) *DeleteAppRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteAppResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppResponse) GoString() string {
	return s.String()
}

func (s *DeleteAppResponse) SetReqMsgId(v string) *DeleteAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAppResponse) SetResultCode(v string) *DeleteAppResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAppResponse) SetResultMsg(v string) *DeleteAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAppResponse) SetData(v bool) *DeleteAppResponse {
	s.Data = &v
	return s
}

type DeleteApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s DeleteApiRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApiRequest) GoString() string {
	return s.String()
}

func (s *DeleteApiRequest) SetAuthToken(v string) *DeleteApiRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApiRequest) SetProductInstanceId(v string) *DeleteApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApiRequest) SetApiId(v string) *DeleteApiRequest {
	s.ApiId = &v
	return s
}

func (s *DeleteApiRequest) SetTenantId(v string) *DeleteApiRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApiRequest) SetWorkspaceId(v string) *DeleteApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DeleteApiRequest) SetApiType(v string) *DeleteApiRequest {
	s.ApiType = &v
	return s
}

type DeleteApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApiResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApiResponse) GoString() string {
	return s.String()
}

func (s *DeleteApiResponse) SetReqMsgId(v string) *DeleteApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApiResponse) SetResultCode(v string) *DeleteApiResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApiResponse) SetResultMsg(v string) *DeleteApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApiResponse) SetData(v bool) *DeleteApiResponse {
	s.Data = &v
	return s
}

type ListApigroupApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApigroupApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupApiRequest) GoString() string {
	return s.String()
}

func (s *ListApigroupApiRequest) SetAuthToken(v string) *ListApigroupApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApigroupApiRequest) SetProductInstanceId(v string) *ListApigroupApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApigroupApiRequest) SetApiGroupId(v string) *ListApigroupApiRequest {
	s.ApiGroupId = &v
	return s
}

func (s *ListApigroupApiRequest) SetParam(v *ApiInfoQueryVO) *ListApigroupApiRequest {
	s.Param = v
	return s
}

func (s *ListApigroupApiRequest) SetTenantId(v string) *ListApigroupApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListApigroupApiRequest) SetWorkspaceId(v string) *ListApigroupApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListApigroupApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApigroupApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupApiResponse) GoString() string {
	return s.String()
}

func (s *ListApigroupApiResponse) SetReqMsgId(v string) *ListApigroupApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApigroupApiResponse) SetResultCode(v string) *ListApigroupApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApigroupApiResponse) SetResultMsg(v string) *ListApigroupApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApigroupApiResponse) SetData(v *ApiInfoPagedListVO) *ListApigroupApiResponse {
	s.Data = v
	return s
}

type ListAuthappApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权API标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListAuthappApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthappApiRequest) GoString() string {
	return s.String()
}

func (s *ListAuthappApiRequest) SetAuthToken(v string) *ListAuthappApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthappApiRequest) SetProductInstanceId(v string) *ListAuthappApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAuthappApiRequest) SetAuthAppInfoId(v string) *ListAuthappApiRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *ListAuthappApiRequest) SetParam(v *ApiInfoQueryVO) *ListAuthappApiRequest {
	s.Param = v
	return s
}

func (s *ListAuthappApiRequest) SetTenantId(v string) *ListAuthappApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListAuthappApiRequest) SetWorkspaceId(v string) *ListAuthappApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListAuthappApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListAuthappApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthappApiResponse) GoString() string {
	return s.String()
}

func (s *ListAuthappApiResponse) SetReqMsgId(v string) *ListAuthappApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthappApiResponse) SetResultCode(v string) *ListAuthappApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthappApiResponse) SetResultMsg(v string) *ListAuthappApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthappApiResponse) SetData(v *ApiInfoPagedListVO) *ListAuthappApiResponse {
	s.Data = v
	return s
}

type AllSysApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 后端集群标识
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllSysApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllSysApiRequest) GoString() string {
	return s.String()
}

func (s *AllSysApiRequest) SetAuthToken(v string) *AllSysApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllSysApiRequest) SetProductInstanceId(v string) *AllSysApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllSysApiRequest) SetParam(v *ApiInfoQueryVO) *AllSysApiRequest {
	s.Param = v
	return s
}

func (s *AllSysApiRequest) SetSysId(v string) *AllSysApiRequest {
	s.SysId = &v
	return s
}

func (s *AllSysApiRequest) SetTenantId(v string) *AllSysApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllSysApiRequest) SetWorkspaceId(v string) *AllSysApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllSysApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllSysApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllSysApiResponse) GoString() string {
	return s.String()
}

func (s *AllSysApiResponse) SetReqMsgId(v string) *AllSysApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllSysApiResponse) SetResultCode(v string) *AllSysApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllSysApiResponse) SetResultMsg(v string) *AllSysApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllSysApiResponse) SetData(v []*ApiInfoVO) *AllSysApiResponse {
	s.Data = v
	return s
}

type ListSysApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 后端集群标识
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListSysApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListSysApiRequest) GoString() string {
	return s.String()
}

func (s *ListSysApiRequest) SetAuthToken(v string) *ListSysApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListSysApiRequest) SetProductInstanceId(v string) *ListSysApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListSysApiRequest) SetParam(v *ApiInfoQueryVO) *ListSysApiRequest {
	s.Param = v
	return s
}

func (s *ListSysApiRequest) SetSysId(v string) *ListSysApiRequest {
	s.SysId = &v
	return s
}

func (s *ListSysApiRequest) SetTenantId(v string) *ListSysApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListSysApiRequest) SetWorkspaceId(v string) *ListSysApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListSysApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListSysApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListSysApiResponse) GoString() string {
	return s.String()
}

func (s *ListSysApiResponse) SetReqMsgId(v string) *ListSysApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListSysApiResponse) SetResultCode(v string) *ListSysApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListSysApiResponse) SetResultMsg(v string) *ListSysApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListSysApiResponse) SetData(v *ApiInfoPagedListVO) *ListSysApiResponse {
	s.Data = v
	return s
}

type AllRouterApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 路由规则ID
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllRouterApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllRouterApiRequest) GoString() string {
	return s.String()
}

func (s *AllRouterApiRequest) SetAuthToken(v string) *AllRouterApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllRouterApiRequest) SetProductInstanceId(v string) *AllRouterApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllRouterApiRequest) SetParam(v *ApiInfoQueryVO) *AllRouterApiRequest {
	s.Param = v
	return s
}

func (s *AllRouterApiRequest) SetRouterId(v string) *AllRouterApiRequest {
	s.RouterId = &v
	return s
}

func (s *AllRouterApiRequest) SetTenantId(v string) *AllRouterApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllRouterApiRequest) SetWorkspaceId(v string) *AllRouterApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllRouterApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllRouterApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllRouterApiResponse) GoString() string {
	return s.String()
}

func (s *AllRouterApiResponse) SetReqMsgId(v string) *AllRouterApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllRouterApiResponse) SetResultCode(v string) *AllRouterApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllRouterApiResponse) SetResultMsg(v string) *AllRouterApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllRouterApiResponse) SetData(v []*ApiInfoVO) *AllRouterApiResponse {
	s.Data = v
	return s
}

type ListRouterApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 路由规则ID
	RouterId *string `json:"router_id,omitempty" xml:"router_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListRouterApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRouterApiRequest) GoString() string {
	return s.String()
}

func (s *ListRouterApiRequest) SetAuthToken(v string) *ListRouterApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRouterApiRequest) SetProductInstanceId(v string) *ListRouterApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRouterApiRequest) SetParam(v *ApiInfoQueryVO) *ListRouterApiRequest {
	s.Param = v
	return s
}

func (s *ListRouterApiRequest) SetRouterId(v string) *ListRouterApiRequest {
	s.RouterId = &v
	return s
}

func (s *ListRouterApiRequest) SetTenantId(v string) *ListRouterApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListRouterApiRequest) SetWorkspaceId(v string) *ListRouterApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListRouterApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListRouterApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRouterApiResponse) GoString() string {
	return s.String()
}

func (s *ListRouterApiResponse) SetReqMsgId(v string) *ListRouterApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRouterApiResponse) SetResultCode(v string) *ListRouterApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRouterApiResponse) SetResultMsg(v string) *ListRouterApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRouterApiResponse) SetData(v *ApiInfoPagedListVO) *ListRouterApiResponse {
	s.Data = v
	return s
}

type UpdateApiVersionnoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 版本号
	VersionNo *string `json:"version_no,omitempty" xml:"version_no,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s UpdateApiVersionnoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiVersionnoRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiVersionnoRequest) SetAuthToken(v string) *UpdateApiVersionnoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetProductInstanceId(v string) *UpdateApiVersionnoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetApiId(v string) *UpdateApiVersionnoRequest {
	s.ApiId = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetTenantId(v string) *UpdateApiVersionnoRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetVersionNo(v string) *UpdateApiVersionnoRequest {
	s.VersionNo = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetWorkspaceId(v string) *UpdateApiVersionnoRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UpdateApiVersionnoRequest) SetApiType(v string) *UpdateApiVersionnoRequest {
	s.ApiType = &v
	return s
}

type UpdateApiVersionnoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiVersionnoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiVersionnoResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiVersionnoResponse) SetReqMsgId(v string) *UpdateApiVersionnoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiVersionnoResponse) SetResultCode(v string) *UpdateApiVersionnoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiVersionnoResponse) SetResultMsg(v string) *UpdateApiVersionnoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiVersionnoResponse) SetData(v bool) *UpdateApiVersionnoResponse {
	s.Data = &v
	return s
}

type OfflineApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" require:"true" type:"Repeated"`
	// 下线描述
	OfflineDesc *string `json:"offline_desc,omitempty" xml:"offline_desc,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s OfflineApiRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineApiRequest) GoString() string {
	return s.String()
}

func (s *OfflineApiRequest) SetAuthToken(v string) *OfflineApiRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineApiRequest) SetProductInstanceId(v string) *OfflineApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineApiRequest) SetApiIdList(v []*string) *OfflineApiRequest {
	s.ApiIdList = v
	return s
}

func (s *OfflineApiRequest) SetOfflineDesc(v string) *OfflineApiRequest {
	s.OfflineDesc = &v
	return s
}

func (s *OfflineApiRequest) SetTenantId(v string) *OfflineApiRequest {
	s.TenantId = &v
	return s
}

func (s *OfflineApiRequest) SetWorkspaceId(v string) *OfflineApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *OfflineApiRequest) SetApiType(v string) *OfflineApiRequest {
	s.ApiType = &v
	return s
}

type OfflineApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s OfflineApiResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineApiResponse) GoString() string {
	return s.String()
}

func (s *OfflineApiResponse) SetReqMsgId(v string) *OfflineApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineApiResponse) SetResultCode(v string) *OfflineApiResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineApiResponse) SetResultMsg(v string) *OfflineApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *OfflineApiResponse) SetData(v *BatchActionResult) *OfflineApiResponse {
	s.Data = v
	return s
}

type AllAuthappApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权App标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllAuthappApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAuthappApiRequest) GoString() string {
	return s.String()
}

func (s *AllAuthappApiRequest) SetAuthToken(v string) *AllAuthappApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAuthappApiRequest) SetProductInstanceId(v string) *AllAuthappApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAuthappApiRequest) SetAuthAppInfoId(v string) *AllAuthappApiRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *AllAuthappApiRequest) SetParam(v *ApiInfoQueryVO) *AllAuthappApiRequest {
	s.Param = v
	return s
}

func (s *AllAuthappApiRequest) SetTenantId(v string) *AllAuthappApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllAuthappApiRequest) SetWorkspaceId(v string) *AllAuthappApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllAuthappApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllAuthappApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAuthappApiResponse) GoString() string {
	return s.String()
}

func (s *AllAuthappApiResponse) SetReqMsgId(v string) *AllAuthappApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAuthappApiResponse) SetResultCode(v string) *AllAuthappApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAuthappApiResponse) SetResultMsg(v string) *AllAuthappApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAuthappApiResponse) SetData(v []*ApiInfoVO) *AllAuthappApiResponse {
	s.Data = v
	return s
}

type MountApiAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// 授权App标识列表
	AuthAppInfoIdList []*string `json:"auth_app_info_id_list,omitempty" xml:"auth_app_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountApiAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s MountApiAuthappRequest) GoString() string {
	return s.String()
}

func (s *MountApiAuthappRequest) SetAuthToken(v string) *MountApiAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *MountApiAuthappRequest) SetProductInstanceId(v string) *MountApiAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountApiAuthappRequest) SetApiId(v string) *MountApiAuthappRequest {
	s.ApiId = &v
	return s
}

func (s *MountApiAuthappRequest) SetAuthAppInfoIdList(v []*string) *MountApiAuthappRequest {
	s.AuthAppInfoIdList = v
	return s
}

func (s *MountApiAuthappRequest) SetTenantId(v string) *MountApiAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *MountApiAuthappRequest) SetWorkspaceId(v string) *MountApiAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type MountApiAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountApiAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s MountApiAuthappResponse) GoString() string {
	return s.String()
}

func (s *MountApiAuthappResponse) SetReqMsgId(v string) *MountApiAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountApiAuthappResponse) SetResultCode(v string) *MountApiAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *MountApiAuthappResponse) SetResultMsg(v string) *MountApiAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountApiAuthappResponse) SetData(v *BatchActionResult) *MountApiAuthappResponse {
	s.Data = v
	return s
}

type OnlineApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" require:"true" type:"Repeated"`
	// 上线描述
	OnlineDesc *string `json:"online_desc,omitempty" xml:"online_desc,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s OnlineApiRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineApiRequest) GoString() string {
	return s.String()
}

func (s *OnlineApiRequest) SetAuthToken(v string) *OnlineApiRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineApiRequest) SetProductInstanceId(v string) *OnlineApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineApiRequest) SetApiIdList(v []*string) *OnlineApiRequest {
	s.ApiIdList = v
	return s
}

func (s *OnlineApiRequest) SetOnlineDesc(v string) *OnlineApiRequest {
	s.OnlineDesc = &v
	return s
}

func (s *OnlineApiRequest) SetTenantId(v string) *OnlineApiRequest {
	s.TenantId = &v
	return s
}

func (s *OnlineApiRequest) SetWorkspaceId(v string) *OnlineApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *OnlineApiRequest) SetApiType(v string) *OnlineApiRequest {
	s.ApiType = &v
	return s
}

type OnlineApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s OnlineApiResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineApiResponse) GoString() string {
	return s.String()
}

func (s *OnlineApiResponse) SetReqMsgId(v string) *OnlineApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineApiResponse) SetResultCode(v string) *OnlineApiResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineApiResponse) SetResultMsg(v string) *OnlineApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *OnlineApiResponse) SetData(v *BatchActionResult) *OnlineApiResponse {
	s.Data = v
	return s
}

type AllApiAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// param
	Param *AuthAppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApiAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApiAuthappRequest) GoString() string {
	return s.String()
}

func (s *AllApiAuthappRequest) SetAuthToken(v string) *AllApiAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApiAuthappRequest) SetProductInstanceId(v string) *AllApiAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApiAuthappRequest) SetApiId(v string) *AllApiAuthappRequest {
	s.ApiId = &v
	return s
}

func (s *AllApiAuthappRequest) SetParam(v *AuthAppInfoQueryVO) *AllApiAuthappRequest {
	s.Param = v
	return s
}

func (s *AllApiAuthappRequest) SetTenantId(v string) *AllApiAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *AllApiAuthappRequest) SetWorkspaceId(v string) *AllApiAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type AllApiAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AuthAppInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApiAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApiAuthappResponse) GoString() string {
	return s.String()
}

func (s *AllApiAuthappResponse) SetReqMsgId(v string) *AllApiAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApiAuthappResponse) SetResultCode(v string) *AllApiAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApiAuthappResponse) SetResultMsg(v string) *AllApiAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApiAuthappResponse) SetData(v []*AuthAppInfoVO) *AllApiAuthappResponse {
	s.Data = v
	return s
}

type ListApiAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// param
	Param *AuthAppInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApiAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApiAuthappRequest) GoString() string {
	return s.String()
}

func (s *ListApiAuthappRequest) SetAuthToken(v string) *ListApiAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApiAuthappRequest) SetProductInstanceId(v string) *ListApiAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApiAuthappRequest) SetApiId(v string) *ListApiAuthappRequest {
	s.ApiId = &v
	return s
}

func (s *ListApiAuthappRequest) SetParam(v *AuthAppInfoQueryVO) *ListApiAuthappRequest {
	s.Param = v
	return s
}

func (s *ListApiAuthappRequest) SetTenantId(v string) *ListApiAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *ListApiAuthappRequest) SetWorkspaceId(v string) *ListApiAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type ListApiAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthAppInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApiAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApiAuthappResponse) GoString() string {
	return s.String()
}

func (s *ListApiAuthappResponse) SetReqMsgId(v string) *ListApiAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApiAuthappResponse) SetResultCode(v string) *ListApiAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApiAuthappResponse) SetResultMsg(v string) *ListApiAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApiAuthappResponse) SetData(v *AuthAppInfoPagedListVO) *ListApiAuthappResponse {
	s.Data = v
	return s
}

type AllAppApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AllAppApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAppApiRequest) GoString() string {
	return s.String()
}

func (s *AllAppApiRequest) SetAuthToken(v string) *AllAppApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAppApiRequest) SetProductInstanceId(v string) *AllAppApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAppApiRequest) SetAppId(v string) *AllAppApiRequest {
	s.AppId = &v
	return s
}

func (s *AllAppApiRequest) SetParam(v *ApiInfoQueryVO) *AllAppApiRequest {
	s.Param = v
	return s
}

func (s *AllAppApiRequest) SetWorkspaceId(v string) *AllAppApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *AllAppApiRequest) SetTenantId(v string) *AllAppApiRequest {
	s.TenantId = &v
	return s
}

type AllAppApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllAppApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAppApiResponse) GoString() string {
	return s.String()
}

func (s *AllAppApiResponse) SetReqMsgId(v string) *AllAppApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAppApiResponse) SetResultCode(v string) *AllAppApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAppApiResponse) SetResultMsg(v string) *AllAppApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAppApiResponse) SetData(v []*ApiInfoVO) *AllAppApiResponse {
	s.Data = v
	return s
}

type ListAppApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// App标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s ListAppApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppApiRequest) GoString() string {
	return s.String()
}

func (s *ListAppApiRequest) SetAuthToken(v string) *ListAppApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppApiRequest) SetProductInstanceId(v string) *ListAppApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAppApiRequest) SetAppId(v string) *ListAppApiRequest {
	s.AppId = &v
	return s
}

func (s *ListAppApiRequest) SetParam(v *ApiInfoQueryVO) *ListAppApiRequest {
	s.Param = v
	return s
}

func (s *ListAppApiRequest) SetWorkspaceId(v string) *ListAppApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *ListAppApiRequest) SetTenantId(v string) *ListAppApiRequest {
	s.TenantId = &v
	return s
}

type ListAppApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListAppApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppApiResponse) GoString() string {
	return s.String()
}

func (s *ListAppApiResponse) SetReqMsgId(v string) *ListAppApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppApiResponse) SetResultCode(v string) *ListAppApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppApiResponse) SetResultMsg(v string) *ListAppApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppApiResponse) SetData(v *ApiInfoPagedListVO) *ListAppApiResponse {
	s.Data = v
	return s
}

type GetCommonRandomakskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetCommonRandomakskRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCommonRandomakskRequest) GoString() string {
	return s.String()
}

func (s *GetCommonRandomakskRequest) SetAuthToken(v string) *GetCommonRandomakskRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCommonRandomakskRequest) SetProductInstanceId(v string) *GetCommonRandomakskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCommonRandomakskRequest) SetTenantId(v string) *GetCommonRandomakskRequest {
	s.TenantId = &v
	return s
}

func (s *GetCommonRandomakskRequest) SetWorkspaceId(v string) *GetCommonRandomakskRequest {
	s.WorkspaceId = &v
	return s
}

type GetCommonRandomakskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthenticationConfigVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetCommonRandomakskResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCommonRandomakskResponse) GoString() string {
	return s.String()
}

func (s *GetCommonRandomakskResponse) SetReqMsgId(v string) *GetCommonRandomakskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCommonRandomakskResponse) SetResultCode(v string) *GetCommonRandomakskResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCommonRandomakskResponse) SetResultMsg(v string) *GetCommonRandomakskResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCommonRandomakskResponse) SetData(v *AuthenticationConfigVO) *GetCommonRandomakskResponse {
	s.Data = v
	return s
}

type CreateContactRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ContactInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CreateContactRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateContactRequest) GoString() string {
	return s.String()
}

func (s *CreateContactRequest) SetAuthToken(v string) *CreateContactRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateContactRequest) SetProductInstanceId(v string) *CreateContactRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateContactRequest) SetParam(v *ContactInfoVO) *CreateContactRequest {
	s.Param = v
	return s
}

func (s *CreateContactRequest) SetWorkspaceId(v string) *CreateContactRequest {
	s.WorkspaceId = &v
	return s
}

func (s *CreateContactRequest) SetTenantId(v string) *CreateContactRequest {
	s.TenantId = &v
	return s
}

type CreateContactResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ContactInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateContactResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateContactResponse) GoString() string {
	return s.String()
}

func (s *CreateContactResponse) SetReqMsgId(v string) *CreateContactResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateContactResponse) SetResultCode(v string) *CreateContactResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateContactResponse) SetResultMsg(v string) *CreateContactResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateContactResponse) SetData(v *ContactInfoVO) *CreateContactResponse {
	s.Data = v
	return s
}

type UpdateContactRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ContactInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateContactRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateContactRequest) GoString() string {
	return s.String()
}

func (s *UpdateContactRequest) SetAuthToken(v string) *UpdateContactRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateContactRequest) SetProductInstanceId(v string) *UpdateContactRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateContactRequest) SetParam(v *ContactInfoVO) *UpdateContactRequest {
	s.Param = v
	return s
}

func (s *UpdateContactRequest) SetTenantId(v string) *UpdateContactRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateContactRequest) SetWorkspaceId(v string) *UpdateContactRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateContactResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateContactResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateContactResponse) GoString() string {
	return s.String()
}

func (s *UpdateContactResponse) SetReqMsgId(v string) *UpdateContactResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateContactResponse) SetResultCode(v string) *UpdateContactResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateContactResponse) SetResultMsg(v string) *UpdateContactResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateContactResponse) SetData(v bool) *UpdateContactResponse {
	s.Data = &v
	return s
}

type DeleteContactRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 联系方式标识
	ContactId *string `json:"contact_id,omitempty" xml:"contact_id,omitempty"`
}

func (s DeleteContactRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteContactRequest) GoString() string {
	return s.String()
}

func (s *DeleteContactRequest) SetAuthToken(v string) *DeleteContactRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteContactRequest) SetProductInstanceId(v string) *DeleteContactRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteContactRequest) SetTenantId(v string) *DeleteContactRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteContactRequest) SetWorkspaceId(v string) *DeleteContactRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DeleteContactRequest) SetContactId(v string) *DeleteContactRequest {
	s.ContactId = &v
	return s
}

type DeleteContactResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteContactResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteContactResponse) GoString() string {
	return s.String()
}

func (s *DeleteContactResponse) SetReqMsgId(v string) *DeleteContactResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteContactResponse) SetResultCode(v string) *DeleteContactResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteContactResponse) SetResultMsg(v string) *DeleteContactResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteContactResponse) SetData(v bool) *DeleteContactResponse {
	s.Data = &v
	return s
}

type GetContactRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联系方式标识
	ContactId *string `json:"contact_id,omitempty" xml:"contact_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s GetContactRequest) String() string {
	return tea.Prettify(s)
}

func (s GetContactRequest) GoString() string {
	return s.String()
}

func (s *GetContactRequest) SetAuthToken(v string) *GetContactRequest {
	s.AuthToken = &v
	return s
}

func (s *GetContactRequest) SetProductInstanceId(v string) *GetContactRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetContactRequest) SetContactId(v string) *GetContactRequest {
	s.ContactId = &v
	return s
}

func (s *GetContactRequest) SetWorkspaceId(v string) *GetContactRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetContactRequest) SetTenantId(v string) *GetContactRequest {
	s.TenantId = &v
	return s
}

type GetContactResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ContactInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetContactResponse) String() string {
	return tea.Prettify(s)
}

func (s GetContactResponse) GoString() string {
	return s.String()
}

func (s *GetContactResponse) SetReqMsgId(v string) *GetContactResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetContactResponse) SetResultCode(v string) *GetContactResponse {
	s.ResultCode = &v
	return s
}

func (s *GetContactResponse) SetResultMsg(v string) *GetContactResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetContactResponse) SetData(v *ContactInfoVO) *GetContactResponse {
	s.Data = v
	return s
}

type ListContactRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ContactInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListContactRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContactRequest) GoString() string {
	return s.String()
}

func (s *ListContactRequest) SetAuthToken(v string) *ListContactRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContactRequest) SetProductInstanceId(v string) *ListContactRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContactRequest) SetParam(v *ContactInfoQueryVO) *ListContactRequest {
	s.Param = v
	return s
}

func (s *ListContactRequest) SetTenantId(v string) *ListContactRequest {
	s.TenantId = &v
	return s
}

func (s *ListContactRequest) SetWorkspaceId(v string) *ListContactRequest {
	s.WorkspaceId = &v
	return s
}

type ListContactResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ContactInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListContactResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContactResponse) GoString() string {
	return s.String()
}

func (s *ListContactResponse) SetReqMsgId(v string) *ListContactResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContactResponse) SetResultCode(v string) *ListContactResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContactResponse) SetResultMsg(v string) *ListContactResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContactResponse) SetData(v *ContactInfoPagedListVO) *ListContactResponse {
	s.Data = v
	return s
}

type ListContactAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权App ID
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// param
	Param *ContactInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
}

func (s ListContactAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s ListContactAuthappRequest) GoString() string {
	return s.String()
}

func (s *ListContactAuthappRequest) SetAuthToken(v string) *ListContactAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *ListContactAuthappRequest) SetProductInstanceId(v string) *ListContactAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListContactAuthappRequest) SetAuthAppInfoId(v string) *ListContactAuthappRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *ListContactAuthappRequest) SetTenantId(v string) *ListContactAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *ListContactAuthappRequest) SetWorkspaceId(v string) *ListContactAuthappRequest {
	s.WorkspaceId = &v
	return s
}

func (s *ListContactAuthappRequest) SetParam(v *ContactInfoQueryVO) *ListContactAuthappRequest {
	s.Param = v
	return s
}

type ListContactAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ContactInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListContactAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s ListContactAuthappResponse) GoString() string {
	return s.String()
}

func (s *ListContactAuthappResponse) SetReqMsgId(v string) *ListContactAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListContactAuthappResponse) SetResultCode(v string) *ListContactAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *ListContactAuthappResponse) SetResultMsg(v string) *ListContactAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListContactAuthappResponse) SetData(v *ContactInfoPagedListVO) *ListContactAuthappResponse {
	s.Data = v
	return s
}

type UnmountApiAuthappRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// auth_app_info_id_list
	AuthAppInfoIdList []*string `json:"auth_app_info_id_list,omitempty" xml:"auth_app_info_id_list,omitempty" require:"true" type:"Repeated"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UnmountApiAuthappRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountApiAuthappRequest) GoString() string {
	return s.String()
}

func (s *UnmountApiAuthappRequest) SetAuthToken(v string) *UnmountApiAuthappRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountApiAuthappRequest) SetProductInstanceId(v string) *UnmountApiAuthappRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountApiAuthappRequest) SetApiId(v string) *UnmountApiAuthappRequest {
	s.ApiId = &v
	return s
}

func (s *UnmountApiAuthappRequest) SetAuthAppInfoIdList(v []*string) *UnmountApiAuthappRequest {
	s.AuthAppInfoIdList = v
	return s
}

func (s *UnmountApiAuthappRequest) SetTenantId(v string) *UnmountApiAuthappRequest {
	s.TenantId = &v
	return s
}

func (s *UnmountApiAuthappRequest) SetWorkspaceId(v string) *UnmountApiAuthappRequest {
	s.WorkspaceId = &v
	return s
}

type UnmountApiAuthappResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountApiAuthappResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountApiAuthappResponse) GoString() string {
	return s.String()
}

func (s *UnmountApiAuthappResponse) SetReqMsgId(v string) *UnmountApiAuthappResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountApiAuthappResponse) SetResultCode(v string) *UnmountApiAuthappResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountApiAuthappResponse) SetResultMsg(v string) *UnmountApiAuthappResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountApiAuthappResponse) SetData(v *BatchActionResult) *UnmountApiAuthappResponse {
	s.Data = v
	return s
}

type GetApiVersionapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// version_id
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty" require:"true"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s GetApiVersionapiRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiVersionapiRequest) GoString() string {
	return s.String()
}

func (s *GetApiVersionapiRequest) SetAuthToken(v string) *GetApiVersionapiRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiVersionapiRequest) SetProductInstanceId(v string) *GetApiVersionapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiVersionapiRequest) SetApiId(v string) *GetApiVersionapiRequest {
	s.ApiId = &v
	return s
}

func (s *GetApiVersionapiRequest) SetTenantId(v string) *GetApiVersionapiRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiVersionapiRequest) SetVersionId(v string) *GetApiVersionapiRequest {
	s.VersionId = &v
	return s
}

func (s *GetApiVersionapiRequest) SetWorkspaceId(v string) *GetApiVersionapiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetApiVersionapiRequest) SetApiType(v string) *GetApiVersionapiRequest {
	s.ApiType = &v
	return s
}

type GetApiVersionapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiVersionapiResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiVersionapiResponse) GoString() string {
	return s.String()
}

func (s *GetApiVersionapiResponse) SetReqMsgId(v string) *GetApiVersionapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiVersionapiResponse) SetResultCode(v string) *GetApiVersionapiResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiVersionapiResponse) SetResultMsg(v string) *GetApiVersionapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiVersionapiResponse) SetData(v *ApiInfoVO) *GetApiVersionapiResponse {
	s.Data = v
	return s
}

type CreateCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *CorsInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCorsRequest) GoString() string {
	return s.String()
}

func (s *CreateCorsRequest) SetAuthToken(v string) *CreateCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCorsRequest) SetProductInstanceId(v string) *CreateCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateCorsRequest) SetParam(v *CorsInfoVO) *CreateCorsRequest {
	s.Param = v
	return s
}

func (s *CreateCorsRequest) SetTenantId(v string) *CreateCorsRequest {
	s.TenantId = &v
	return s
}

func (s *CreateCorsRequest) SetWorkspaceId(v string) *CreateCorsRequest {
	s.WorkspaceId = &v
	return s
}

type CreateCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *CorsInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCorsResponse) GoString() string {
	return s.String()
}

func (s *CreateCorsResponse) SetReqMsgId(v string) *CreateCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCorsResponse) SetResultCode(v string) *CreateCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCorsResponse) SetResultMsg(v string) *CreateCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateCorsResponse) SetData(v *CorsInfoVO) *CreateCorsResponse {
	s.Data = v
	return s
}

type UpdateCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *CorsInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCorsRequest) GoString() string {
	return s.String()
}

func (s *UpdateCorsRequest) SetAuthToken(v string) *UpdateCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCorsRequest) SetProductInstanceId(v string) *UpdateCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCorsRequest) SetParam(v *CorsInfoVO) *UpdateCorsRequest {
	s.Param = v
	return s
}

func (s *UpdateCorsRequest) SetTenantId(v string) *UpdateCorsRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateCorsRequest) SetWorkspaceId(v string) *UpdateCorsRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCorsResponse) GoString() string {
	return s.String()
}

func (s *UpdateCorsResponse) SetReqMsgId(v string) *UpdateCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCorsResponse) SetResultCode(v string) *UpdateCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCorsResponse) SetResultMsg(v string) *UpdateCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCorsResponse) SetData(v bool) *UpdateCorsResponse {
	s.Data = &v
	return s
}

type DeleteCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 路由规则标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCorsRequest) GoString() string {
	return s.String()
}

func (s *DeleteCorsRequest) SetAuthToken(v string) *DeleteCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteCorsRequest) SetProductInstanceId(v string) *DeleteCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteCorsRequest) SetCorsId(v string) *DeleteCorsRequest {
	s.CorsId = &v
	return s
}

func (s *DeleteCorsRequest) SetTenantId(v string) *DeleteCorsRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteCorsRequest) SetWorkspaceId(v string) *DeleteCorsRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCorsResponse) GoString() string {
	return s.String()
}

func (s *DeleteCorsResponse) SetReqMsgId(v string) *DeleteCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteCorsResponse) SetResultCode(v string) *DeleteCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteCorsResponse) SetResultMsg(v string) *DeleteCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteCorsResponse) SetData(v bool) *DeleteCorsResponse {
	s.Data = &v
	return s
}

type AllCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *CorsInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s AllCorsRequest) GoString() string {
	return s.String()
}

func (s *AllCorsRequest) SetAuthToken(v string) *AllCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *AllCorsRequest) SetProductInstanceId(v string) *AllCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllCorsRequest) SetParam(v *CorsInfoQueryVO) *AllCorsRequest {
	s.Param = v
	return s
}

func (s *AllCorsRequest) SetTenantId(v string) *AllCorsRequest {
	s.TenantId = &v
	return s
}

func (s *AllCorsRequest) SetWorkspaceId(v string) *AllCorsRequest {
	s.WorkspaceId = &v
	return s
}

type AllCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*CorsInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s AllCorsResponse) GoString() string {
	return s.String()
}

func (s *AllCorsResponse) SetReqMsgId(v string) *AllCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllCorsResponse) SetResultCode(v string) *AllCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *AllCorsResponse) SetResultMsg(v string) *AllCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllCorsResponse) SetData(v []*CorsInfoVO) *AllCorsResponse {
	s.Data = v
	return s
}

type ListCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *CorsInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCorsRequest) GoString() string {
	return s.String()
}

func (s *ListCorsRequest) SetAuthToken(v string) *ListCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCorsRequest) SetProductInstanceId(v string) *ListCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCorsRequest) SetParam(v *CorsInfoQueryVO) *ListCorsRequest {
	s.Param = v
	return s
}

func (s *ListCorsRequest) SetTenantId(v string) *ListCorsRequest {
	s.TenantId = &v
	return s
}

func (s *ListCorsRequest) SetWorkspaceId(v string) *ListCorsRequest {
	s.WorkspaceId = &v
	return s
}

type ListCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *CorsInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCorsResponse) GoString() string {
	return s.String()
}

func (s *ListCorsResponse) SetReqMsgId(v string) *ListCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCorsResponse) SetResultCode(v string) *ListCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCorsResponse) SetResultMsg(v string) *ListCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCorsResponse) SetData(v *CorsInfoPagedListVO) *ListCorsResponse {
	s.Data = v
	return s
}

type GetCorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 路由规则标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetCorsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCorsRequest) GoString() string {
	return s.String()
}

func (s *GetCorsRequest) SetAuthToken(v string) *GetCorsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCorsRequest) SetProductInstanceId(v string) *GetCorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetCorsRequest) SetCorsId(v string) *GetCorsRequest {
	s.CorsId = &v
	return s
}

func (s *GetCorsRequest) SetTenantId(v string) *GetCorsRequest {
	s.TenantId = &v
	return s
}

func (s *GetCorsRequest) SetWorkspaceId(v string) *GetCorsRequest {
	s.WorkspaceId = &v
	return s
}

type GetCorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *CorsInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetCorsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCorsResponse) GoString() string {
	return s.String()
}

func (s *GetCorsResponse) SetReqMsgId(v string) *GetCorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCorsResponse) SetResultCode(v string) *GetCorsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCorsResponse) SetResultMsg(v string) *GetCorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCorsResponse) SetData(v *CorsInfoVO) *GetCorsResponse {
	s.Data = v
	return s
}

type AllCorsApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// cors标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllCorsApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllCorsApiRequest) GoString() string {
	return s.String()
}

func (s *AllCorsApiRequest) SetAuthToken(v string) *AllCorsApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllCorsApiRequest) SetProductInstanceId(v string) *AllCorsApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllCorsApiRequest) SetParam(v *ApiInfoQueryVO) *AllCorsApiRequest {
	s.Param = v
	return s
}

func (s *AllCorsApiRequest) SetCorsId(v string) *AllCorsApiRequest {
	s.CorsId = &v
	return s
}

func (s *AllCorsApiRequest) SetTenantId(v string) *AllCorsApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllCorsApiRequest) SetWorkspaceId(v string) *AllCorsApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllCorsApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllCorsApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllCorsApiResponse) GoString() string {
	return s.String()
}

func (s *AllCorsApiResponse) SetReqMsgId(v string) *AllCorsApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllCorsApiResponse) SetResultCode(v string) *AllCorsApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllCorsApiResponse) SetResultMsg(v string) *AllCorsApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllCorsApiResponse) SetData(v []*ApiInfoVO) *AllCorsApiResponse {
	s.Data = v
	return s
}

type ListCorsApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// cors标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListCorsApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCorsApiRequest) GoString() string {
	return s.String()
}

func (s *ListCorsApiRequest) SetAuthToken(v string) *ListCorsApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListCorsApiRequest) SetProductInstanceId(v string) *ListCorsApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListCorsApiRequest) SetParam(v *ApiInfoQueryVO) *ListCorsApiRequest {
	s.Param = v
	return s
}

func (s *ListCorsApiRequest) SetCorsId(v string) *ListCorsApiRequest {
	s.CorsId = &v
	return s
}

func (s *ListCorsApiRequest) SetTenantId(v string) *ListCorsApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListCorsApiRequest) SetWorkspaceId(v string) *ListCorsApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListCorsApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListCorsApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCorsApiResponse) GoString() string {
	return s.String()
}

func (s *ListCorsApiResponse) SetReqMsgId(v string) *ListCorsApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCorsApiResponse) SetResultCode(v string) *ListCorsApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCorsApiResponse) SetResultMsg(v string) *ListCorsApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCorsApiResponse) SetData(v *ApiInfoPagedListVO) *ListCorsApiResponse {
	s.Data = v
	return s
}

type MountCorsApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绑定的API ID列表
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" type:"Repeated"`
	// cors标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountCorsApiRequest) String() string {
	return tea.Prettify(s)
}

func (s MountCorsApiRequest) GoString() string {
	return s.String()
}

func (s *MountCorsApiRequest) SetAuthToken(v string) *MountCorsApiRequest {
	s.AuthToken = &v
	return s
}

func (s *MountCorsApiRequest) SetProductInstanceId(v string) *MountCorsApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountCorsApiRequest) SetApiIdList(v []*string) *MountCorsApiRequest {
	s.ApiIdList = v
	return s
}

func (s *MountCorsApiRequest) SetCorsId(v string) *MountCorsApiRequest {
	s.CorsId = &v
	return s
}

func (s *MountCorsApiRequest) SetTenantId(v string) *MountCorsApiRequest {
	s.TenantId = &v
	return s
}

func (s *MountCorsApiRequest) SetWorkspaceId(v string) *MountCorsApiRequest {
	s.WorkspaceId = &v
	return s
}

type MountCorsApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountCorsApiResponse) String() string {
	return tea.Prettify(s)
}

func (s MountCorsApiResponse) GoString() string {
	return s.String()
}

func (s *MountCorsApiResponse) SetReqMsgId(v string) *MountCorsApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountCorsApiResponse) SetResultCode(v string) *MountCorsApiResponse {
	s.ResultCode = &v
	return s
}

func (s *MountCorsApiResponse) SetResultMsg(v string) *MountCorsApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountCorsApiResponse) SetData(v *BatchActionResult) *MountCorsApiResponse {
	s.Data = v
	return s
}

type UnmountCorsApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绑定的API ID列表
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" type:"Repeated"`
	// cors标识
	CorsId *string `json:"cors_id,omitempty" xml:"cors_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UnmountCorsApiRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountCorsApiRequest) GoString() string {
	return s.String()
}

func (s *UnmountCorsApiRequest) SetAuthToken(v string) *UnmountCorsApiRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountCorsApiRequest) SetProductInstanceId(v string) *UnmountCorsApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountCorsApiRequest) SetApiIdList(v []*string) *UnmountCorsApiRequest {
	s.ApiIdList = v
	return s
}

func (s *UnmountCorsApiRequest) SetCorsId(v string) *UnmountCorsApiRequest {
	s.CorsId = &v
	return s
}

func (s *UnmountCorsApiRequest) SetTenantId(v string) *UnmountCorsApiRequest {
	s.TenantId = &v
	return s
}

func (s *UnmountCorsApiRequest) SetWorkspaceId(v string) *UnmountCorsApiRequest {
	s.WorkspaceId = &v
	return s
}

type UnmountCorsApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountCorsApiResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountCorsApiResponse) GoString() string {
	return s.String()
}

func (s *UnmountCorsApiResponse) SetReqMsgId(v string) *UnmountCorsApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountCorsApiResponse) SetResultCode(v string) *UnmountCorsApiResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountCorsApiResponse) SetResultMsg(v string) *UnmountCorsApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountCorsApiResponse) SetData(v *BatchActionResult) *UnmountCorsApiResponse {
	s.Data = v
	return s
}

type ExecTestHttpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiTestReqVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ExecTestHttpRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecTestHttpRequest) GoString() string {
	return s.String()
}

func (s *ExecTestHttpRequest) SetAuthToken(v string) *ExecTestHttpRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecTestHttpRequest) SetProductInstanceId(v string) *ExecTestHttpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecTestHttpRequest) SetParam(v *ApiTestReqVO) *ExecTestHttpRequest {
	s.Param = v
	return s
}

func (s *ExecTestHttpRequest) SetTenantId(v string) *ExecTestHttpRequest {
	s.TenantId = &v
	return s
}

func (s *ExecTestHttpRequest) SetWorkspaceId(v string) *ExecTestHttpRequest {
	s.WorkspaceId = &v
	return s
}

type ExecTestHttpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiTestRspVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecTestHttpResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecTestHttpResponse) GoString() string {
	return s.String()
}

func (s *ExecTestHttpResponse) SetReqMsgId(v string) *ExecTestHttpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecTestHttpResponse) SetResultCode(v string) *ExecTestHttpResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecTestHttpResponse) SetResultMsg(v string) *ExecTestHttpResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecTestHttpResponse) SetData(v *ApiTestRspVO) *ExecTestHttpResponse {
	s.Data = v
	return s
}

type UpdateApiAuthapplimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 授权应用标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// 限流配置
	LimitConfig *LimitConfigVO `json:"limit_config,omitempty" xml:"limit_config,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApiAuthapplimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiAuthapplimitRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiAuthapplimitRequest) SetAuthToken(v string) *UpdateApiAuthapplimitRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetProductInstanceId(v string) *UpdateApiAuthapplimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetApiId(v string) *UpdateApiAuthapplimitRequest {
	s.ApiId = &v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetAuthAppInfoId(v string) *UpdateApiAuthapplimitRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetLimitConfig(v *LimitConfigVO) *UpdateApiAuthapplimitRequest {
	s.LimitConfig = v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetTenantId(v string) *UpdateApiAuthapplimitRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApiAuthapplimitRequest) SetWorkspaceId(v string) *UpdateApiAuthapplimitRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApiAuthapplimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiAuthapplimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiAuthapplimitResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiAuthapplimitResponse) SetReqMsgId(v string) *UpdateApiAuthapplimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiAuthapplimitResponse) SetResultCode(v string) *UpdateApiAuthapplimitResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiAuthapplimitResponse) SetResultMsg(v string) *UpdateApiAuthapplimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiAuthapplimitResponse) SetData(v bool) *UpdateApiAuthapplimitResponse {
	s.Data = &v
	return s
}

type GetApiAuthapplimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// 授权应用标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApiAuthapplimitRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiAuthapplimitRequest) GoString() string {
	return s.String()
}

func (s *GetApiAuthapplimitRequest) SetAuthToken(v string) *GetApiAuthapplimitRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiAuthapplimitRequest) SetProductInstanceId(v string) *GetApiAuthapplimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiAuthapplimitRequest) SetApiId(v string) *GetApiAuthapplimitRequest {
	s.ApiId = &v
	return s
}

func (s *GetApiAuthapplimitRequest) SetAuthAppInfoId(v string) *GetApiAuthapplimitRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *GetApiAuthapplimitRequest) SetTenantId(v string) *GetApiAuthapplimitRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiAuthapplimitRequest) SetWorkspaceId(v string) *GetApiAuthapplimitRequest {
	s.WorkspaceId = &v
	return s
}

type GetApiAuthapplimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *LimitConfigVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiAuthapplimitResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiAuthapplimitResponse) GoString() string {
	return s.String()
}

func (s *GetApiAuthapplimitResponse) SetReqMsgId(v string) *GetApiAuthapplimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiAuthapplimitResponse) SetResultCode(v string) *GetApiAuthapplimitResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiAuthapplimitResponse) SetResultMsg(v string) *GetApiAuthapplimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiAuthapplimitResponse) SetData(v *LimitConfigVO) *GetApiAuthapplimitResponse {
	s.Data = v
	return s
}

type UpdateApiLimitconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// 限流配置
	LimitConfig *LimitConfigVO `json:"limit_config,omitempty" xml:"limit_config,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApiLimitconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiLimitconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiLimitconfigRequest) SetAuthToken(v string) *UpdateApiLimitconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiLimitconfigRequest) SetProductInstanceId(v string) *UpdateApiLimitconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiLimitconfigRequest) SetApiId(v string) *UpdateApiLimitconfigRequest {
	s.ApiId = &v
	return s
}

func (s *UpdateApiLimitconfigRequest) SetLimitConfig(v *LimitConfigVO) *UpdateApiLimitconfigRequest {
	s.LimitConfig = v
	return s
}

func (s *UpdateApiLimitconfigRequest) SetTenantId(v string) *UpdateApiLimitconfigRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApiLimitconfigRequest) SetWorkspaceId(v string) *UpdateApiLimitconfigRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApiLimitconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiLimitconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiLimitconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiLimitconfigResponse) SetReqMsgId(v string) *UpdateApiLimitconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiLimitconfigResponse) SetResultCode(v string) *UpdateApiLimitconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiLimitconfigResponse) SetResultMsg(v string) *UpdateApiLimitconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiLimitconfigResponse) SetData(v bool) *UpdateApiLimitconfigResponse {
	s.Data = &v
	return s
}

type UpdateApiCacheinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// param
	Param *ApiCacheVO `json:"param,omitempty" xml:"param,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UpdateApiCacheinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiCacheinfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiCacheinfoRequest) SetAuthToken(v string) *UpdateApiCacheinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiCacheinfoRequest) SetProductInstanceId(v string) *UpdateApiCacheinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiCacheinfoRequest) SetApiId(v string) *UpdateApiCacheinfoRequest {
	s.ApiId = &v
	return s
}

func (s *UpdateApiCacheinfoRequest) SetParam(v *ApiCacheVO) *UpdateApiCacheinfoRequest {
	s.Param = v
	return s
}

func (s *UpdateApiCacheinfoRequest) SetWorkspaceId(v string) *UpdateApiCacheinfoRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UpdateApiCacheinfoRequest) SetTenantId(v string) *UpdateApiCacheinfoRequest {
	s.TenantId = &v
	return s
}

type UpdateApiCacheinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiCacheinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiCacheinfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiCacheinfoResponse) SetReqMsgId(v string) *UpdateApiCacheinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiCacheinfoResponse) SetResultCode(v string) *UpdateApiCacheinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiCacheinfoResponse) SetResultMsg(v string) *UpdateApiCacheinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiCacheinfoResponse) SetData(v bool) *UpdateApiCacheinfoResponse {
	s.Data = &v
	return s
}

type QueryMonitorRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// param
	Param *MonitoryRequest `json:"param,omitempty" xml:"param,omitempty"`
}

func (s QueryMonitorRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorRequest) GoString() string {
	return s.String()
}

func (s *QueryMonitorRequest) SetAuthToken(v string) *QueryMonitorRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMonitorRequest) SetProductInstanceId(v string) *QueryMonitorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMonitorRequest) SetTenantId(v string) *QueryMonitorRequest {
	s.TenantId = &v
	return s
}

func (s *QueryMonitorRequest) SetWorkspaceId(v string) *QueryMonitorRequest {
	s.WorkspaceId = &v
	return s
}

func (s *QueryMonitorRequest) SetParam(v *MonitoryRequest) *QueryMonitorRequest {
	s.Param = v
	return s
}

type QueryMonitorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *MonitoryAggregationVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryMonitorResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMonitorResponse) GoString() string {
	return s.String()
}

func (s *QueryMonitorResponse) SetReqMsgId(v string) *QueryMonitorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMonitorResponse) SetResultCode(v string) *QueryMonitorResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMonitorResponse) SetResultMsg(v string) *QueryMonitorResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMonitorResponse) SetData(v *MonitoryAggregationVO) *QueryMonitorResponse {
	s.Data = v
	return s
}

type QueryResultcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryResultcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryResultcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryResultcodeRequest) SetAuthToken(v string) *QueryResultcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryResultcodeRequest) SetProductInstanceId(v string) *QueryResultcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryResultcodeRequest) SetWorkspaceId(v string) *QueryResultcodeRequest {
	s.WorkspaceId = &v
	return s
}

func (s *QueryResultcodeRequest) SetTenantId(v string) *QueryResultcodeRequest {
	s.TenantId = &v
	return s
}

type QueryResultcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryResultcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryResultcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryResultcodeResponse) SetReqMsgId(v string) *QueryResultcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryResultcodeResponse) SetResultCode(v string) *QueryResultcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryResultcodeResponse) SetResultMsg(v string) *QueryResultcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryResultcodeResponse) SetData(v []*string) *QueryResultcodeResponse {
	s.Data = v
	return s
}

type OnlineApiVersionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty"`
	// online_desc
	OnlineDesc *string `json:"online_desc,omitempty" xml:"online_desc,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// version_id
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s OnlineApiVersionRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineApiVersionRequest) GoString() string {
	return s.String()
}

func (s *OnlineApiVersionRequest) SetAuthToken(v string) *OnlineApiVersionRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineApiVersionRequest) SetProductInstanceId(v string) *OnlineApiVersionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineApiVersionRequest) SetApiId(v string) *OnlineApiVersionRequest {
	s.ApiId = &v
	return s
}

func (s *OnlineApiVersionRequest) SetOnlineDesc(v string) *OnlineApiVersionRequest {
	s.OnlineDesc = &v
	return s
}

func (s *OnlineApiVersionRequest) SetTenantId(v string) *OnlineApiVersionRequest {
	s.TenantId = &v
	return s
}

func (s *OnlineApiVersionRequest) SetVersionId(v string) *OnlineApiVersionRequest {
	s.VersionId = &v
	return s
}

func (s *OnlineApiVersionRequest) SetWorkspaceId(v string) *OnlineApiVersionRequest {
	s.WorkspaceId = &v
	return s
}

func (s *OnlineApiVersionRequest) SetApiType(v string) *OnlineApiVersionRequest {
	s.ApiType = &v
	return s
}

type OnlineApiVersionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s OnlineApiVersionResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineApiVersionResponse) GoString() string {
	return s.String()
}

func (s *OnlineApiVersionResponse) SetReqMsgId(v string) *OnlineApiVersionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineApiVersionResponse) SetResultCode(v string) *OnlineApiVersionResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineApiVersionResponse) SetResultMsg(v string) *OnlineApiVersionResponse {
	s.ResultMsg = &v
	return s
}

func (s *OnlineApiVersionResponse) SetData(v bool) *OnlineApiVersionResponse {
	s.Data = &v
	return s
}

type CreateLdcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *LdcInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateLdcRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLdcRequest) GoString() string {
	return s.String()
}

func (s *CreateLdcRequest) SetAuthToken(v string) *CreateLdcRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLdcRequest) SetProductInstanceId(v string) *CreateLdcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLdcRequest) SetParam(v *LdcInfoVO) *CreateLdcRequest {
	s.Param = v
	return s
}

func (s *CreateLdcRequest) SetTenantId(v string) *CreateLdcRequest {
	s.TenantId = &v
	return s
}

func (s *CreateLdcRequest) SetWorkspaceId(v string) *CreateLdcRequest {
	s.WorkspaceId = &v
	return s
}

type CreateLdcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *LdcInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateLdcResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLdcResponse) GoString() string {
	return s.String()
}

func (s *CreateLdcResponse) SetReqMsgId(v string) *CreateLdcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLdcResponse) SetResultCode(v string) *CreateLdcResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLdcResponse) SetResultMsg(v string) *CreateLdcResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLdcResponse) SetData(v *LdcInfoVO) *CreateLdcResponse {
	s.Data = v
	return s
}

type UpdateLdcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *LdcInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateLdcRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateLdcRequest) GoString() string {
	return s.String()
}

func (s *UpdateLdcRequest) SetAuthToken(v string) *UpdateLdcRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateLdcRequest) SetProductInstanceId(v string) *UpdateLdcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateLdcRequest) SetParam(v *LdcInfoVO) *UpdateLdcRequest {
	s.Param = v
	return s
}

func (s *UpdateLdcRequest) SetTenantId(v string) *UpdateLdcRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateLdcRequest) SetWorkspaceId(v string) *UpdateLdcRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateLdcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateLdcResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateLdcResponse) GoString() string {
	return s.String()
}

func (s *UpdateLdcResponse) SetReqMsgId(v string) *UpdateLdcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateLdcResponse) SetResultCode(v string) *UpdateLdcResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateLdcResponse) SetResultMsg(v string) *UpdateLdcResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateLdcResponse) SetData(v bool) *UpdateLdcResponse {
	s.Data = &v
	return s
}

type DeleteLdcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
}

func (s DeleteLdcRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteLdcRequest) GoString() string {
	return s.String()
}

func (s *DeleteLdcRequest) SetAuthToken(v string) *DeleteLdcRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteLdcRequest) SetProductInstanceId(v string) *DeleteLdcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteLdcRequest) SetTenantId(v string) *DeleteLdcRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteLdcRequest) SetWorkspaceId(v string) *DeleteLdcRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteLdcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteLdcResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteLdcResponse) GoString() string {
	return s.String()
}

func (s *DeleteLdcResponse) SetReqMsgId(v string) *DeleteLdcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteLdcResponse) SetResultCode(v string) *DeleteLdcResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteLdcResponse) SetResultMsg(v string) *DeleteLdcResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteLdcResponse) SetData(v bool) *DeleteLdcResponse {
	s.Data = &v
	return s
}

type GetLdcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
}

func (s GetLdcRequest) String() string {
	return tea.Prettify(s)
}

func (s GetLdcRequest) GoString() string {
	return s.String()
}

func (s *GetLdcRequest) SetAuthToken(v string) *GetLdcRequest {
	s.AuthToken = &v
	return s
}

func (s *GetLdcRequest) SetProductInstanceId(v string) *GetLdcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetLdcRequest) SetTenantId(v string) *GetLdcRequest {
	s.TenantId = &v
	return s
}

func (s *GetLdcRequest) SetWorkspaceId(v string) *GetLdcRequest {
	s.WorkspaceId = &v
	return s
}

type GetLdcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *LdcInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetLdcResponse) String() string {
	return tea.Prettify(s)
}

func (s GetLdcResponse) GoString() string {
	return s.String()
}

func (s *GetLdcResponse) SetReqMsgId(v string) *GetLdcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetLdcResponse) SetResultCode(v string) *GetLdcResponse {
	s.ResultCode = &v
	return s
}

func (s *GetLdcResponse) SetResultMsg(v string) *GetLdcResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetLdcResponse) SetData(v *LdcInfoVO) *GetLdcResponse {
	s.Data = v
	return s
}

type SaveLdcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *LdcInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s SaveLdcRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveLdcRequest) GoString() string {
	return s.String()
}

func (s *SaveLdcRequest) SetAuthToken(v string) *SaveLdcRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveLdcRequest) SetProductInstanceId(v string) *SaveLdcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveLdcRequest) SetParam(v *LdcInfoVO) *SaveLdcRequest {
	s.Param = v
	return s
}

func (s *SaveLdcRequest) SetTenantId(v string) *SaveLdcRequest {
	s.TenantId = &v
	return s
}

func (s *SaveLdcRequest) SetWorkspaceId(v string) *SaveLdcRequest {
	s.WorkspaceId = &v
	return s
}

type SaveLdcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *LdcInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SaveLdcResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveLdcResponse) GoString() string {
	return s.String()
}

func (s *SaveLdcResponse) SetReqMsgId(v string) *SaveLdcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveLdcResponse) SetResultCode(v string) *SaveLdcResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveLdcResponse) SetResultMsg(v string) *SaveLdcResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveLdcResponse) SetData(v *LdcInfoVO) *SaveLdcResponse {
	s.Data = v
	return s
}

type MountAuthappApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 授权APP标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountAuthappApiRequest) String() string {
	return tea.Prettify(s)
}

func (s MountAuthappApiRequest) GoString() string {
	return s.String()
}

func (s *MountAuthappApiRequest) SetAuthToken(v string) *MountAuthappApiRequest {
	s.AuthToken = &v
	return s
}

func (s *MountAuthappApiRequest) SetProductInstanceId(v string) *MountAuthappApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountAuthappApiRequest) SetApiInfoIdList(v []*string) *MountAuthappApiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *MountAuthappApiRequest) SetAuthAppInfoId(v string) *MountAuthappApiRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *MountAuthappApiRequest) SetTenantId(v string) *MountAuthappApiRequest {
	s.TenantId = &v
	return s
}

func (s *MountAuthappApiRequest) SetWorkspaceId(v string) *MountAuthappApiRequest {
	s.WorkspaceId = &v
	return s
}

type MountAuthappApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountAuthappApiResponse) String() string {
	return tea.Prettify(s)
}

func (s MountAuthappApiResponse) GoString() string {
	return s.String()
}

func (s *MountAuthappApiResponse) SetReqMsgId(v string) *MountAuthappApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountAuthappApiResponse) SetResultCode(v string) *MountAuthappApiResponse {
	s.ResultCode = &v
	return s
}

func (s *MountAuthappApiResponse) SetResultMsg(v string) *MountAuthappApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountAuthappApiResponse) SetData(v *BatchActionResult) *MountAuthappApiResponse {
	s.Data = v
	return s
}

type UnmountAuthappApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 授权APP标识
	AuthAppInfoId *string `json:"auth_app_info_id,omitempty" xml:"auth_app_info_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UnmountAuthappApiRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountAuthappApiRequest) GoString() string {
	return s.String()
}

func (s *UnmountAuthappApiRequest) SetAuthToken(v string) *UnmountAuthappApiRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountAuthappApiRequest) SetProductInstanceId(v string) *UnmountAuthappApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountAuthappApiRequest) SetApiInfoIdList(v []*string) *UnmountAuthappApiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *UnmountAuthappApiRequest) SetAuthAppInfoId(v string) *UnmountAuthappApiRequest {
	s.AuthAppInfoId = &v
	return s
}

func (s *UnmountAuthappApiRequest) SetTenantId(v string) *UnmountAuthappApiRequest {
	s.TenantId = &v
	return s
}

func (s *UnmountAuthappApiRequest) SetWorkspaceId(v string) *UnmountAuthappApiRequest {
	s.WorkspaceId = &v
	return s
}

type UnmountAuthappApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountAuthappApiResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountAuthappApiResponse) GoString() string {
	return s.String()
}

func (s *UnmountAuthappApiResponse) SetReqMsgId(v string) *UnmountAuthappApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountAuthappApiResponse) SetResultCode(v string) *UnmountAuthappApiResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountAuthappApiResponse) SetResultMsg(v string) *UnmountAuthappApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountAuthappApiResponse) SetData(v *BatchActionResult) *UnmountAuthappApiResponse {
	s.Data = v
	return s
}

type ImportApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分组id
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// api_transfer_list字符串
	ApiTransferList *string `json:"api_transfer_list,omitempty" xml:"api_transfer_list,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// null效验api及配置是否重复，true覆盖，false跳过
	UpdateFlag *bool `json:"update_flag,omitempty" xml:"update_flag,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ImportApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportApiRequest) GoString() string {
	return s.String()
}

func (s *ImportApiRequest) SetAuthToken(v string) *ImportApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportApiRequest) SetProductInstanceId(v string) *ImportApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportApiRequest) SetApiGroupId(v string) *ImportApiRequest {
	s.ApiGroupId = &v
	return s
}

func (s *ImportApiRequest) SetApiTransferList(v string) *ImportApiRequest {
	s.ApiTransferList = &v
	return s
}

func (s *ImportApiRequest) SetTenantId(v string) *ImportApiRequest {
	s.TenantId = &v
	return s
}

func (s *ImportApiRequest) SetUpdateFlag(v bool) *ImportApiRequest {
	s.UpdateFlag = &v
	return s
}

func (s *ImportApiRequest) SetWorkspaceId(v string) *ImportApiRequest {
	s.WorkspaceId = &v
	return s
}

type ImportApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchImportResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportApiResponse) GoString() string {
	return s.String()
}

func (s *ImportApiResponse) SetReqMsgId(v string) *ImportApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportApiResponse) SetResultCode(v string) *ImportApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportApiResponse) SetResultMsg(v string) *ImportApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportApiResponse) SetData(v *BatchImportResult) *ImportApiResponse {
	s.Data = v
	return s
}

type ExportApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apiId集合
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ExportApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportApiRequest) GoString() string {
	return s.String()
}

func (s *ExportApiRequest) SetAuthToken(v string) *ExportApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportApiRequest) SetProductInstanceId(v string) *ExportApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportApiRequest) SetApiInfoIdList(v []*string) *ExportApiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *ExportApiRequest) SetTenantId(v string) *ExportApiRequest {
	s.TenantId = &v
	return s
}

func (s *ExportApiRequest) SetWorkspaceId(v string) *ExportApiRequest {
	s.WorkspaceId = &v
	return s
}

type ExportApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiTransferResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExportApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportApiResponse) GoString() string {
	return s.String()
}

func (s *ExportApiResponse) SetReqMsgId(v string) *ExportApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportApiResponse) SetResultCode(v string) *ExportApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportApiResponse) SetResultMsg(v string) *ExportApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportApiResponse) SetData(v *ApiTransferResult) *ExportApiResponse {
	s.Data = v
	return s
}

type ExportApigroupApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ExportApigroupApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportApigroupApiRequest) GoString() string {
	return s.String()
}

func (s *ExportApigroupApiRequest) SetAuthToken(v string) *ExportApigroupApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportApigroupApiRequest) SetProductInstanceId(v string) *ExportApigroupApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportApigroupApiRequest) SetApiGroupId(v string) *ExportApigroupApiRequest {
	s.ApiGroupId = &v
	return s
}

func (s *ExportApigroupApiRequest) SetTenantId(v string) *ExportApigroupApiRequest {
	s.TenantId = &v
	return s
}

func (s *ExportApigroupApiRequest) SetWorkspaceId(v string) *ExportApigroupApiRequest {
	s.WorkspaceId = &v
	return s
}

type ExportApigroupApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiTransferResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExportApigroupApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportApigroupApiResponse) GoString() string {
	return s.String()
}

func (s *ExportApigroupApiResponse) SetReqMsgId(v string) *ExportApigroupApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportApigroupApiResponse) SetResultCode(v string) *ExportApigroupApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportApigroupApiResponse) SetResultMsg(v string) *ExportApigroupApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportApigroupApiResponse) SetData(v *ApiTransferResult) *ExportApigroupApiResponse {
	s.Data = v
	return s
}

type CreateParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ParamMappingInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateParammappingRequest) GoString() string {
	return s.String()
}

func (s *CreateParammappingRequest) SetAuthToken(v string) *CreateParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateParammappingRequest) SetProductInstanceId(v string) *CreateParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateParammappingRequest) SetParam(v *ParamMappingInfoVO) *CreateParammappingRequest {
	s.Param = v
	return s
}

func (s *CreateParammappingRequest) SetTenantId(v string) *CreateParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *CreateParammappingRequest) SetWorkspaceId(v string) *CreateParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type CreateParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ParamMappingInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateParammappingResponse) GoString() string {
	return s.String()
}

func (s *CreateParammappingResponse) SetReqMsgId(v string) *CreateParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateParammappingResponse) SetResultCode(v string) *CreateParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateParammappingResponse) SetResultMsg(v string) *CreateParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateParammappingResponse) SetData(v *ParamMappingInfoVO) *CreateParammappingResponse {
	s.Data = v
	return s
}

type UpdateParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ParamMappingInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateParammappingRequest) GoString() string {
	return s.String()
}

func (s *UpdateParammappingRequest) SetAuthToken(v string) *UpdateParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateParammappingRequest) SetProductInstanceId(v string) *UpdateParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateParammappingRequest) SetParam(v *ParamMappingInfoVO) *UpdateParammappingRequest {
	s.Param = v
	return s
}

func (s *UpdateParammappingRequest) SetTenantId(v string) *UpdateParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateParammappingRequest) SetWorkspaceId(v string) *UpdateParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateParammappingResponse) GoString() string {
	return s.String()
}

func (s *UpdateParammappingResponse) SetReqMsgId(v string) *UpdateParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateParammappingResponse) SetResultCode(v string) *UpdateParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateParammappingResponse) SetResultMsg(v string) *UpdateParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateParammappingResponse) SetData(v bool) *UpdateParammappingResponse {
	s.Data = &v
	return s
}

type DeleteParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参数映射标识
	ParamMappingId *string `json:"param_mapping_id,omitempty" xml:"param_mapping_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteParammappingRequest) GoString() string {
	return s.String()
}

func (s *DeleteParammappingRequest) SetAuthToken(v string) *DeleteParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteParammappingRequest) SetProductInstanceId(v string) *DeleteParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteParammappingRequest) SetParamMappingId(v string) *DeleteParammappingRequest {
	s.ParamMappingId = &v
	return s
}

func (s *DeleteParammappingRequest) SetTenantId(v string) *DeleteParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteParammappingRequest) SetWorkspaceId(v string) *DeleteParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteParammappingResponse) GoString() string {
	return s.String()
}

func (s *DeleteParammappingResponse) SetReqMsgId(v string) *DeleteParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteParammappingResponse) SetResultCode(v string) *DeleteParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteParammappingResponse) SetResultMsg(v string) *DeleteParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteParammappingResponse) SetData(v bool) *DeleteParammappingResponse {
	s.Data = &v
	return s
}

type ListParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ParamMappingInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s ListParammappingRequest) GoString() string {
	return s.String()
}

func (s *ListParammappingRequest) SetAuthToken(v string) *ListParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *ListParammappingRequest) SetProductInstanceId(v string) *ListParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListParammappingRequest) SetParam(v *ParamMappingInfoQueryVO) *ListParammappingRequest {
	s.Param = v
	return s
}

func (s *ListParammappingRequest) SetTenantId(v string) *ListParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *ListParammappingRequest) SetWorkspaceId(v string) *ListParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type ListParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ParamMappingInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s ListParammappingResponse) GoString() string {
	return s.String()
}

func (s *ListParammappingResponse) SetReqMsgId(v string) *ListParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListParammappingResponse) SetResultCode(v string) *ListParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *ListParammappingResponse) SetResultMsg(v string) *ListParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListParammappingResponse) SetData(v *ParamMappingInfoPagedListVO) *ListParammappingResponse {
	s.Data = v
	return s
}

type AllParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ParamMappingInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s AllParammappingRequest) GoString() string {
	return s.String()
}

func (s *AllParammappingRequest) SetAuthToken(v string) *AllParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *AllParammappingRequest) SetProductInstanceId(v string) *AllParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllParammappingRequest) SetParam(v *ParamMappingInfoQueryVO) *AllParammappingRequest {
	s.Param = v
	return s
}

func (s *AllParammappingRequest) SetTenantId(v string) *AllParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *AllParammappingRequest) SetWorkspaceId(v string) *AllParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type AllParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ParamMappingInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s AllParammappingResponse) GoString() string {
	return s.String()
}

func (s *AllParammappingResponse) SetReqMsgId(v string) *AllParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllParammappingResponse) SetResultCode(v string) *AllParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *AllParammappingResponse) SetResultMsg(v string) *AllParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllParammappingResponse) SetData(v []*ParamMappingInfoVO) *AllParammappingResponse {
	s.Data = v
	return s
}

type GetParammappingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参数映射标识
	ParamMappingId *string `json:"param_mapping_id,omitempty" xml:"param_mapping_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	//
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetParammappingRequest) String() string {
	return tea.Prettify(s)
}

func (s GetParammappingRequest) GoString() string {
	return s.String()
}

func (s *GetParammappingRequest) SetAuthToken(v string) *GetParammappingRequest {
	s.AuthToken = &v
	return s
}

func (s *GetParammappingRequest) SetProductInstanceId(v string) *GetParammappingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetParammappingRequest) SetParamMappingId(v string) *GetParammappingRequest {
	s.ParamMappingId = &v
	return s
}

func (s *GetParammappingRequest) SetTenantId(v string) *GetParammappingRequest {
	s.TenantId = &v
	return s
}

func (s *GetParammappingRequest) SetWorkspaceId(v string) *GetParammappingRequest {
	s.WorkspaceId = &v
	return s
}

type GetParammappingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ParamMappingInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetParammappingResponse) String() string {
	return tea.Prettify(s)
}

func (s GetParammappingResponse) GoString() string {
	return s.String()
}

func (s *GetParammappingResponse) SetReqMsgId(v string) *GetParammappingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetParammappingResponse) SetResultCode(v string) *GetParammappingResponse {
	s.ResultCode = &v
	return s
}

func (s *GetParammappingResponse) SetResultMsg(v string) *GetParammappingResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetParammappingResponse) SetData(v *ParamMappingInfoVO) *GetParammappingResponse {
	s.Data = v
	return s
}

type ListParammappingApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 参数映射标识
	ParamMappingId *string `json:"param_mapping_id,omitempty" xml:"param_mapping_id,omitempty" require:"true"`
	//
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListParammappingApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListParammappingApiRequest) GoString() string {
	return s.String()
}

func (s *ListParammappingApiRequest) SetAuthToken(v string) *ListParammappingApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListParammappingApiRequest) SetProductInstanceId(v string) *ListParammappingApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListParammappingApiRequest) SetParam(v *ApiInfoQueryVO) *ListParammappingApiRequest {
	s.Param = v
	return s
}

func (s *ListParammappingApiRequest) SetParamMappingId(v string) *ListParammappingApiRequest {
	s.ParamMappingId = &v
	return s
}

func (s *ListParammappingApiRequest) SetTenantId(v string) *ListParammappingApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListParammappingApiRequest) SetWorkspaceId(v string) *ListParammappingApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListParammappingApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListParammappingApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListParammappingApiResponse) GoString() string {
	return s.String()
}

func (s *ListParammappingApiResponse) SetReqMsgId(v string) *ListParammappingApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListParammappingApiResponse) SetResultCode(v string) *ListParammappingApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListParammappingApiResponse) SetResultMsg(v string) *ListParammappingApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListParammappingApiResponse) SetData(v *ApiInfoPagedListVO) *ListParammappingApiResponse {
	s.Data = v
	return s
}

type AllApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	//
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApimodelRequest) GoString() string {
	return s.String()
}

func (s *AllApimodelRequest) SetAuthToken(v string) *AllApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApimodelRequest) SetProductInstanceId(v string) *AllApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApimodelRequest) SetParam(v *ApiModelQueryVO) *AllApimodelRequest {
	s.Param = v
	return s
}

func (s *AllApimodelRequest) SetTenantId(v string) *AllApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *AllApimodelRequest) SetWorkspaceId(v string) *AllApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type AllApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiModelVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApimodelResponse) GoString() string {
	return s.String()
}

func (s *AllApimodelResponse) SetReqMsgId(v string) *AllApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApimodelResponse) SetResultCode(v string) *AllApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApimodelResponse) SetResultMsg(v string) *AllApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApimodelResponse) SetData(v []*ApiModelVO) *AllApimodelResponse {
	s.Data = v
	return s
}

type ListApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApimodelRequest) GoString() string {
	return s.String()
}

func (s *ListApimodelRequest) SetAuthToken(v string) *ListApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApimodelRequest) SetProductInstanceId(v string) *ListApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApimodelRequest) SetParam(v *ApiModelQueryVO) *ListApimodelRequest {
	s.Param = v
	return s
}

func (s *ListApimodelRequest) SetTenantId(v string) *ListApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *ListApimodelRequest) SetWorkspaceId(v string) *ListApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type ListApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiModelPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApimodelResponse) GoString() string {
	return s.String()
}

func (s *ListApimodelResponse) SetReqMsgId(v string) *ListApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApimodelResponse) SetResultCode(v string) *ListApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApimodelResponse) SetResultMsg(v string) *ListApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApimodelResponse) SetData(v *ApiModelPagedListVO) *ListApimodelResponse {
	s.Data = v
	return s
}

type CreateApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApimodelRequest) GoString() string {
	return s.String()
}

func (s *CreateApimodelRequest) SetAuthToken(v string) *CreateApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApimodelRequest) SetProductInstanceId(v string) *CreateApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApimodelRequest) SetParam(v *ApiModelVO) *CreateApimodelRequest {
	s.Param = v
	return s
}

func (s *CreateApimodelRequest) SetTenantId(v string) *CreateApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApimodelRequest) SetWorkspaceId(v string) *CreateApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiModelVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApimodelResponse) GoString() string {
	return s.String()
}

func (s *CreateApimodelResponse) SetReqMsgId(v string) *CreateApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApimodelResponse) SetResultCode(v string) *CreateApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApimodelResponse) SetResultMsg(v string) *CreateApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApimodelResponse) SetData(v *ApiModelVO) *CreateApimodelResponse {
	s.Data = v
	return s
}

type DeleteApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_model_id
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApimodelRequest) GoString() string {
	return s.String()
}

func (s *DeleteApimodelRequest) SetAuthToken(v string) *DeleteApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApimodelRequest) SetProductInstanceId(v string) *DeleteApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApimodelRequest) SetApiModelId(v string) *DeleteApimodelRequest {
	s.ApiModelId = &v
	return s
}

func (s *DeleteApimodelRequest) SetTenantId(v string) *DeleteApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApimodelRequest) SetWorkspaceId(v string) *DeleteApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApimodelResponse) GoString() string {
	return s.String()
}

func (s *DeleteApimodelResponse) SetReqMsgId(v string) *DeleteApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApimodelResponse) SetResultCode(v string) *DeleteApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApimodelResponse) SetResultMsg(v string) *DeleteApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApimodelResponse) SetData(v bool) *DeleteApimodelResponse {
	s.Data = &v
	return s
}

type GetApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_model_id
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
	// 查询模型的名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApimodelRequest) GoString() string {
	return s.String()
}

func (s *GetApimodelRequest) SetAuthToken(v string) *GetApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApimodelRequest) SetProductInstanceId(v string) *GetApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApimodelRequest) SetApiModelId(v string) *GetApimodelRequest {
	s.ApiModelId = &v
	return s
}

func (s *GetApimodelRequest) SetModelName(v string) *GetApimodelRequest {
	s.ModelName = &v
	return s
}

func (s *GetApimodelRequest) SetTenantId(v string) *GetApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *GetApimodelRequest) SetWorkspaceId(v string) *GetApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type GetApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiModelVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApimodelResponse) GoString() string {
	return s.String()
}

func (s *GetApimodelResponse) SetReqMsgId(v string) *GetApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApimodelResponse) SetResultCode(v string) *GetApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApimodelResponse) SetResultMsg(v string) *GetApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApimodelResponse) SetData(v *ApiModelVO) *GetApimodelResponse {
	s.Data = v
	return s
}

type UpdateApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApimodelRequest) GoString() string {
	return s.String()
}

func (s *UpdateApimodelRequest) SetAuthToken(v string) *UpdateApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApimodelRequest) SetProductInstanceId(v string) *UpdateApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApimodelRequest) SetParam(v *ApiModelVO) *UpdateApimodelRequest {
	s.Param = v
	return s
}

func (s *UpdateApimodelRequest) SetTenantId(v string) *UpdateApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApimodelRequest) SetWorkspaceId(v string) *UpdateApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApimodelResponse) GoString() string {
	return s.String()
}

func (s *UpdateApimodelResponse) SetReqMsgId(v string) *UpdateApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApimodelResponse) SetResultCode(v string) *UpdateApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApimodelResponse) SetResultMsg(v string) *UpdateApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApimodelResponse) SetData(v bool) *UpdateApimodelResponse {
	s.Data = &v
	return s
}

type AllApimodelApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型id
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	//
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApimodelApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApimodelApiRequest) GoString() string {
	return s.String()
}

func (s *AllApimodelApiRequest) SetAuthToken(v string) *AllApimodelApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApimodelApiRequest) SetProductInstanceId(v string) *AllApimodelApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApimodelApiRequest) SetApiModelId(v string) *AllApimodelApiRequest {
	s.ApiModelId = &v
	return s
}

func (s *AllApimodelApiRequest) SetParam(v *ApiInfoQueryVO) *AllApimodelApiRequest {
	s.Param = v
	return s
}

func (s *AllApimodelApiRequest) SetTenantId(v string) *AllApimodelApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllApimodelApiRequest) SetWorkspaceId(v string) *AllApimodelApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllApimodelApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApimodelApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApimodelApiResponse) GoString() string {
	return s.String()
}

func (s *AllApimodelApiResponse) SetReqMsgId(v string) *AllApimodelApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApimodelApiResponse) SetResultCode(v string) *AllApimodelApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApimodelApiResponse) SetResultMsg(v string) *AllApimodelApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApimodelApiResponse) SetData(v []*ApiInfoVO) *AllApimodelApiResponse {
	s.Data = v
	return s
}

type ListApimodelApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型ID
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApimodelApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApimodelApiRequest) GoString() string {
	return s.String()
}

func (s *ListApimodelApiRequest) SetAuthToken(v string) *ListApimodelApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApimodelApiRequest) SetProductInstanceId(v string) *ListApimodelApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApimodelApiRequest) SetApiModelId(v string) *ListApimodelApiRequest {
	s.ApiModelId = &v
	return s
}

func (s *ListApimodelApiRequest) SetParam(v *ApiInfoQueryVO) *ListApimodelApiRequest {
	s.Param = v
	return s
}

func (s *ListApimodelApiRequest) SetTenantId(v string) *ListApimodelApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListApimodelApiRequest) SetWorkspaceId(v string) *ListApimodelApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListApimodelApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApimodelApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApimodelApiResponse) GoString() string {
	return s.String()
}

func (s *ListApimodelApiResponse) SetReqMsgId(v string) *ListApimodelApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApimodelApiResponse) SetResultCode(v string) *ListApimodelApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApimodelApiResponse) SetResultMsg(v string) *ListApimodelApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApimodelApiResponse) SetData(v *ApiInfoPagedListVO) *ListApimodelApiResponse {
	s.Data = v
	return s
}

type CreateExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ExternalAuthInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateExternalauthRequest) GoString() string {
	return s.String()
}

func (s *CreateExternalauthRequest) SetAuthToken(v string) *CreateExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateExternalauthRequest) SetProductInstanceId(v string) *CreateExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateExternalauthRequest) SetParam(v *ExternalAuthInfoVO) *CreateExternalauthRequest {
	s.Param = v
	return s
}

func (s *CreateExternalauthRequest) SetTenantId(v string) *CreateExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *CreateExternalauthRequest) SetWorkspaceId(v string) *CreateExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type CreateExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ExternalAuthInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateExternalauthResponse) GoString() string {
	return s.String()
}

func (s *CreateExternalauthResponse) SetReqMsgId(v string) *CreateExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateExternalauthResponse) SetResultCode(v string) *CreateExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateExternalauthResponse) SetResultMsg(v string) *CreateExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateExternalauthResponse) SetData(v *ExternalAuthInfoVO) *CreateExternalauthResponse {
	s.Data = v
	return s
}

type UpdateExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ExternalAuthInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateExternalauthRequest) GoString() string {
	return s.String()
}

func (s *UpdateExternalauthRequest) SetAuthToken(v string) *UpdateExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateExternalauthRequest) SetProductInstanceId(v string) *UpdateExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateExternalauthRequest) SetParam(v *ExternalAuthInfoVO) *UpdateExternalauthRequest {
	s.Param = v
	return s
}

func (s *UpdateExternalauthRequest) SetTenantId(v string) *UpdateExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateExternalauthRequest) SetWorkspaceId(v string) *UpdateExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateExternalauthResponse) GoString() string {
	return s.String()
}

func (s *UpdateExternalauthResponse) SetReqMsgId(v string) *UpdateExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateExternalauthResponse) SetResultCode(v string) *UpdateExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateExternalauthResponse) SetResultMsg(v string) *UpdateExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateExternalauthResponse) SetData(v bool) *UpdateExternalauthResponse {
	s.Data = &v
	return s
}

type DeleteExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部授权标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteExternalauthRequest) GoString() string {
	return s.String()
}

func (s *DeleteExternalauthRequest) SetAuthToken(v string) *DeleteExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteExternalauthRequest) SetProductInstanceId(v string) *DeleteExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteExternalauthRequest) SetExternalAuthId(v string) *DeleteExternalauthRequest {
	s.ExternalAuthId = &v
	return s
}

func (s *DeleteExternalauthRequest) SetTenantId(v string) *DeleteExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteExternalauthRequest) SetWorkspaceId(v string) *DeleteExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteExternalauthResponse) GoString() string {
	return s.String()
}

func (s *DeleteExternalauthResponse) SetReqMsgId(v string) *DeleteExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteExternalauthResponse) SetResultCode(v string) *DeleteExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteExternalauthResponse) SetResultMsg(v string) *DeleteExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteExternalauthResponse) SetData(v bool) *DeleteExternalauthResponse {
	s.Data = &v
	return s
}

type GetExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部授权标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s GetExternalauthRequest) GoString() string {
	return s.String()
}

func (s *GetExternalauthRequest) SetAuthToken(v string) *GetExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *GetExternalauthRequest) SetProductInstanceId(v string) *GetExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetExternalauthRequest) SetExternalAuthId(v string) *GetExternalauthRequest {
	s.ExternalAuthId = &v
	return s
}

func (s *GetExternalauthRequest) SetTenantId(v string) *GetExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *GetExternalauthRequest) SetWorkspaceId(v string) *GetExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type GetExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ExternalAuthInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s GetExternalauthResponse) GoString() string {
	return s.String()
}

func (s *GetExternalauthResponse) SetReqMsgId(v string) *GetExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetExternalauthResponse) SetResultCode(v string) *GetExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *GetExternalauthResponse) SetResultMsg(v string) *GetExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetExternalauthResponse) SetData(v *ExternalAuthInfoVO) *GetExternalauthResponse {
	s.Data = v
	return s
}

type ListExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ExternalAuthInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s ListExternalauthRequest) GoString() string {
	return s.String()
}

func (s *ListExternalauthRequest) SetAuthToken(v string) *ListExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *ListExternalauthRequest) SetProductInstanceId(v string) *ListExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListExternalauthRequest) SetParam(v *ExternalAuthInfoQueryVO) *ListExternalauthRequest {
	s.Param = v
	return s
}

func (s *ListExternalauthRequest) SetTenantId(v string) *ListExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *ListExternalauthRequest) SetWorkspaceId(v string) *ListExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type ListExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ExternalAuthInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s ListExternalauthResponse) GoString() string {
	return s.String()
}

func (s *ListExternalauthResponse) SetReqMsgId(v string) *ListExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListExternalauthResponse) SetResultCode(v string) *ListExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *ListExternalauthResponse) SetResultMsg(v string) *ListExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListExternalauthResponse) SetData(v *ExternalAuthInfoPagedListVO) *ListExternalauthResponse {
	s.Data = v
	return s
}

type AllExternalauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ExternalAuthInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllExternalauthRequest) String() string {
	return tea.Prettify(s)
}

func (s AllExternalauthRequest) GoString() string {
	return s.String()
}

func (s *AllExternalauthRequest) SetAuthToken(v string) *AllExternalauthRequest {
	s.AuthToken = &v
	return s
}

func (s *AllExternalauthRequest) SetProductInstanceId(v string) *AllExternalauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllExternalauthRequest) SetParam(v *ExternalAuthInfoQueryVO) *AllExternalauthRequest {
	s.Param = v
	return s
}

func (s *AllExternalauthRequest) SetTenantId(v string) *AllExternalauthRequest {
	s.TenantId = &v
	return s
}

func (s *AllExternalauthRequest) SetWorkspaceId(v string) *AllExternalauthRequest {
	s.WorkspaceId = &v
	return s
}

type AllExternalauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ExternalAuthInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllExternalauthResponse) String() string {
	return tea.Prettify(s)
}

func (s AllExternalauthResponse) GoString() string {
	return s.String()
}

func (s *AllExternalauthResponse) SetReqMsgId(v string) *AllExternalauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllExternalauthResponse) SetResultCode(v string) *AllExternalauthResponse {
	s.ResultCode = &v
	return s
}

func (s *AllExternalauthResponse) SetResultMsg(v string) *AllExternalauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllExternalauthResponse) SetData(v []*ExternalAuthInfoVO) *AllExternalauthResponse {
	s.Data = v
	return s
}

type MountExternalauthApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 外部授权标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountExternalauthApiRequest) String() string {
	return tea.Prettify(s)
}

func (s MountExternalauthApiRequest) GoString() string {
	return s.String()
}

func (s *MountExternalauthApiRequest) SetAuthToken(v string) *MountExternalauthApiRequest {
	s.AuthToken = &v
	return s
}

func (s *MountExternalauthApiRequest) SetProductInstanceId(v string) *MountExternalauthApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountExternalauthApiRequest) SetApiInfoIdList(v []*string) *MountExternalauthApiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *MountExternalauthApiRequest) SetExternalAuthId(v string) *MountExternalauthApiRequest {
	s.ExternalAuthId = &v
	return s
}

func (s *MountExternalauthApiRequest) SetTenantId(v string) *MountExternalauthApiRequest {
	s.TenantId = &v
	return s
}

func (s *MountExternalauthApiRequest) SetWorkspaceId(v string) *MountExternalauthApiRequest {
	s.WorkspaceId = &v
	return s
}

type MountExternalauthApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountExternalauthApiResponse) String() string {
	return tea.Prettify(s)
}

func (s MountExternalauthApiResponse) GoString() string {
	return s.String()
}

func (s *MountExternalauthApiResponse) SetReqMsgId(v string) *MountExternalauthApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountExternalauthApiResponse) SetResultCode(v string) *MountExternalauthApiResponse {
	s.ResultCode = &v
	return s
}

func (s *MountExternalauthApiResponse) SetResultMsg(v string) *MountExternalauthApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountExternalauthApiResponse) SetData(v *BatchActionResult) *MountExternalauthApiResponse {
	s.Data = v
	return s
}

type UnmountExternalauthApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 外部授权标识
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UnmountExternalauthApiRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountExternalauthApiRequest) GoString() string {
	return s.String()
}

func (s *UnmountExternalauthApiRequest) SetAuthToken(v string) *UnmountExternalauthApiRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountExternalauthApiRequest) SetProductInstanceId(v string) *UnmountExternalauthApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountExternalauthApiRequest) SetApiInfoIdList(v []*string) *UnmountExternalauthApiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *UnmountExternalauthApiRequest) SetExternalAuthId(v string) *UnmountExternalauthApiRequest {
	s.ExternalAuthId = &v
	return s
}

func (s *UnmountExternalauthApiRequest) SetTenantId(v string) *UnmountExternalauthApiRequest {
	s.TenantId = &v
	return s
}

func (s *UnmountExternalauthApiRequest) SetWorkspaceId(v string) *UnmountExternalauthApiRequest {
	s.WorkspaceId = &v
	return s
}

type UnmountExternalauthApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountExternalauthApiResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountExternalauthApiResponse) GoString() string {
	return s.String()
}

func (s *UnmountExternalauthApiResponse) SetReqMsgId(v string) *UnmountExternalauthApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountExternalauthApiResponse) SetResultCode(v string) *UnmountExternalauthApiResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountExternalauthApiResponse) SetResultMsg(v string) *UnmountExternalauthApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountExternalauthApiResponse) SetData(v *BatchActionResult) *UnmountExternalauthApiResponse {
	s.Data = v
	return s
}

type DeleteApimodelParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型参数id
	ParamId *string `json:"param_id,omitempty" xml:"param_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 最外层的父类模型id
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
}

func (s DeleteApimodelParamRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApimodelParamRequest) GoString() string {
	return s.String()
}

func (s *DeleteApimodelParamRequest) SetAuthToken(v string) *DeleteApimodelParamRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApimodelParamRequest) SetProductInstanceId(v string) *DeleteApimodelParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApimodelParamRequest) SetParamId(v string) *DeleteApimodelParamRequest {
	s.ParamId = &v
	return s
}

func (s *DeleteApimodelParamRequest) SetTenantId(v string) *DeleteApimodelParamRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApimodelParamRequest) SetWorkspaceId(v string) *DeleteApimodelParamRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DeleteApimodelParamRequest) SetApiModelId(v string) *DeleteApimodelParamRequest {
	s.ApiModelId = &v
	return s
}

type DeleteApimodelParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApimodelParamResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApimodelParamResponse) GoString() string {
	return s.String()
}

func (s *DeleteApimodelParamResponse) SetReqMsgId(v string) *DeleteApimodelParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApimodelParamResponse) SetResultCode(v string) *DeleteApimodelParamResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApimodelParamResponse) SetResultMsg(v string) *DeleteApimodelParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApimodelParamResponse) SetData(v bool) *DeleteApimodelParamResponse {
	s.Data = &v
	return s
}

type UpdateApimodelParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelParamVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApimodelParamRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApimodelParamRequest) GoString() string {
	return s.String()
}

func (s *UpdateApimodelParamRequest) SetAuthToken(v string) *UpdateApimodelParamRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApimodelParamRequest) SetProductInstanceId(v string) *UpdateApimodelParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApimodelParamRequest) SetParam(v *ApiModelParamVO) *UpdateApimodelParamRequest {
	s.Param = v
	return s
}

func (s *UpdateApimodelParamRequest) SetTenantId(v string) *UpdateApimodelParamRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApimodelParamRequest) SetWorkspaceId(v string) *UpdateApimodelParamRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApimodelParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApimodelParamResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApimodelParamResponse) GoString() string {
	return s.String()
}

func (s *UpdateApimodelParamResponse) SetReqMsgId(v string) *UpdateApimodelParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApimodelParamResponse) SetResultCode(v string) *UpdateApimodelParamResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApimodelParamResponse) SetResultMsg(v string) *UpdateApimodelParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApimodelParamResponse) SetData(v bool) *UpdateApimodelParamResponse {
	s.Data = &v
	return s
}

type CreateApimodelParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiModelParamVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApimodelParamRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApimodelParamRequest) GoString() string {
	return s.String()
}

func (s *CreateApimodelParamRequest) SetAuthToken(v string) *CreateApimodelParamRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApimodelParamRequest) SetProductInstanceId(v string) *CreateApimodelParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApimodelParamRequest) SetParam(v *ApiModelParamVO) *CreateApimodelParamRequest {
	s.Param = v
	return s
}

func (s *CreateApimodelParamRequest) SetTenantId(v string) *CreateApimodelParamRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApimodelParamRequest) SetWorkspaceId(v string) *CreateApimodelParamRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApimodelParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiModelParamVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApimodelParamResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApimodelParamResponse) GoString() string {
	return s.String()
}

func (s *CreateApimodelParamResponse) SetReqMsgId(v string) *CreateApimodelParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApimodelParamResponse) SetResultCode(v string) *CreateApimodelParamResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApimodelParamResponse) SetResultMsg(v string) *CreateApimodelParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApimodelParamResponse) SetData(v *ApiModelParamVO) *CreateApimodelParamResponse {
	s.Data = v
	return s
}

type ListExternalauthApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部授权标识符
	ExternalAuthId *string `json:"external_auth_id,omitempty" xml:"external_auth_id,omitempty" require:"true"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListExternalauthApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListExternalauthApiRequest) GoString() string {
	return s.String()
}

func (s *ListExternalauthApiRequest) SetAuthToken(v string) *ListExternalauthApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListExternalauthApiRequest) SetProductInstanceId(v string) *ListExternalauthApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListExternalauthApiRequest) SetExternalAuthId(v string) *ListExternalauthApiRequest {
	s.ExternalAuthId = &v
	return s
}

func (s *ListExternalauthApiRequest) SetParam(v *ApiInfoQueryVO) *ListExternalauthApiRequest {
	s.Param = v
	return s
}

func (s *ListExternalauthApiRequest) SetTenantId(v string) *ListExternalauthApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListExternalauthApiRequest) SetWorkspaceId(v string) *ListExternalauthApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListExternalauthApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListExternalauthApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListExternalauthApiResponse) GoString() string {
	return s.String()
}

func (s *ListExternalauthApiResponse) SetReqMsgId(v string) *ListExternalauthApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListExternalauthApiResponse) SetResultCode(v string) *ListExternalauthApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListExternalauthApiResponse) SetResultMsg(v string) *ListExternalauthApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListExternalauthApiResponse) SetData(v *ApiInfoPagedListVO) *ListExternalauthApiResponse {
	s.Data = v
	return s
}

type CheckApimodelParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 校检的模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 模型引用的id
	RefModelId *string `json:"ref_model_id,omitempty" xml:"ref_model_id,omitempty" require:"true"`
}

func (s CheckApimodelParamRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckApimodelParamRequest) GoString() string {
	return s.String()
}

func (s *CheckApimodelParamRequest) SetAuthToken(v string) *CheckApimodelParamRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckApimodelParamRequest) SetProductInstanceId(v string) *CheckApimodelParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckApimodelParamRequest) SetTenantId(v string) *CheckApimodelParamRequest {
	s.TenantId = &v
	return s
}

func (s *CheckApimodelParamRequest) SetWorkspaceId(v string) *CheckApimodelParamRequest {
	s.WorkspaceId = &v
	return s
}

func (s *CheckApimodelParamRequest) SetModelId(v string) *CheckApimodelParamRequest {
	s.ModelId = &v
	return s
}

func (s *CheckApimodelParamRequest) SetRefModelId(v string) *CheckApimodelParamRequest {
	s.RefModelId = &v
	return s
}

type CheckApimodelParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckApimodelParamResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckApimodelParamResponse) GoString() string {
	return s.String()
}

func (s *CheckApimodelParamResponse) SetReqMsgId(v string) *CheckApimodelParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckApimodelParamResponse) SetResultCode(v string) *CheckApimodelParamResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckApimodelParamResponse) SetResultMsg(v string) *CheckApimodelParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckApimodelParamResponse) SetData(v bool) *CheckApimodelParamResponse {
	s.Data = &v
	return s
}

type ResolveApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待解析的父类模型名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 包名
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty"`
	// json
	Json *string `json:"json,omitempty" xml:"json,omitempty"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s ResolveApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s ResolveApimodelRequest) GoString() string {
	return s.String()
}

func (s *ResolveApimodelRequest) SetAuthToken(v string) *ResolveApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *ResolveApimodelRequest) SetProductInstanceId(v string) *ResolveApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResolveApimodelRequest) SetModelName(v string) *ResolveApimodelRequest {
	s.ModelName = &v
	return s
}

func (s *ResolveApimodelRequest) SetTenantId(v string) *ResolveApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *ResolveApimodelRequest) SetWorkspaceId(v string) *ResolveApimodelRequest {
	s.WorkspaceId = &v
	return s
}

func (s *ResolveApimodelRequest) SetDescription(v string) *ResolveApimodelRequest {
	s.Description = &v
	return s
}

func (s *ResolveApimodelRequest) SetPackageName(v string) *ResolveApimodelRequest {
	s.PackageName = &v
	return s
}

func (s *ResolveApimodelRequest) SetJson(v string) *ResolveApimodelRequest {
	s.Json = &v
	return s
}

func (s *ResolveApimodelRequest) SetType(v string) *ResolveApimodelRequest {
	s.Type = &v
	return s
}

type ResolveApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据模型
	Data *ApiModelVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ResolveApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s ResolveApimodelResponse) GoString() string {
	return s.String()
}

func (s *ResolveApimodelResponse) SetReqMsgId(v string) *ResolveApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResolveApimodelResponse) SetResultCode(v string) *ResolveApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *ResolveApimodelResponse) SetResultMsg(v string) *ResolveApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResolveApimodelResponse) SetData(v *ApiModelVO) *ResolveApimodelResponse {
	s.Data = v
	return s
}

type ImportApimodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// apimodelVO
	Param *ApiModelVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ImportApimodelRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportApimodelRequest) GoString() string {
	return s.String()
}

func (s *ImportApimodelRequest) SetAuthToken(v string) *ImportApimodelRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportApimodelRequest) SetProductInstanceId(v string) *ImportApimodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportApimodelRequest) SetParam(v *ApiModelVO) *ImportApimodelRequest {
	s.Param = v
	return s
}

func (s *ImportApimodelRequest) SetTenantId(v string) *ImportApimodelRequest {
	s.TenantId = &v
	return s
}

func (s *ImportApimodelRequest) SetWorkspaceId(v string) *ImportApimodelRequest {
	s.WorkspaceId = &v
	return s
}

type ImportApimodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 导入后的模型
	Data *ApiModelVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportApimodelResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportApimodelResponse) GoString() string {
	return s.String()
}

func (s *ImportApimodelResponse) SetReqMsgId(v string) *ImportApimodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportApimodelResponse) SetResultCode(v string) *ImportApimodelResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportApimodelResponse) SetResultMsg(v string) *ImportApimodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportApimodelResponse) SetData(v *ApiModelVO) *ImportApimodelResponse {
	s.Data = v
	return s
}

type ApplyApimodelMgsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// modelDataSource指mgs平台  get模型返回的json字符串
	ModelList []*string `json:"model_list,omitempty" xml:"model_list,omitempty" require:"true" type:"Repeated"`
}

func (s ApplyApimodelMgsRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyApimodelMgsRequest) GoString() string {
	return s.String()
}

func (s *ApplyApimodelMgsRequest) SetAuthToken(v string) *ApplyApimodelMgsRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyApimodelMgsRequest) SetProductInstanceId(v string) *ApplyApimodelMgsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyApimodelMgsRequest) SetModelList(v []*string) *ApplyApimodelMgsRequest {
	s.ModelList = v
	return s
}

type ApplyApimodelMgsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据迁移成功失败
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ApplyApimodelMgsResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyApimodelMgsResponse) GoString() string {
	return s.String()
}

func (s *ApplyApimodelMgsResponse) SetReqMsgId(v string) *ApplyApimodelMgsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyApimodelMgsResponse) SetResultCode(v string) *ApplyApimodelMgsResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyApimodelMgsResponse) SetResultMsg(v string) *ApplyApimodelMgsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyApimodelMgsResponse) SetData(v bool) *ApplyApimodelMgsResponse {
	s.Data = &v
	return s
}

type ListOperatorRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *OperatorQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s ListOperatorRequest) GoString() string {
	return s.String()
}

func (s *ListOperatorRequest) SetAuthToken(v string) *ListOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *ListOperatorRequest) SetProductInstanceId(v string) *ListOperatorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListOperatorRequest) SetParam(v *OperatorQueryVO) *ListOperatorRequest {
	s.Param = v
	return s
}

func (s *ListOperatorRequest) SetTenantId(v string) *ListOperatorRequest {
	s.TenantId = &v
	return s
}

func (s *ListOperatorRequest) SetWorkspaceId(v string) *ListOperatorRequest {
	s.WorkspaceId = &v
	return s
}

type ListOperatorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *OperatorPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s ListOperatorResponse) GoString() string {
	return s.String()
}

func (s *ListOperatorResponse) SetReqMsgId(v string) *ListOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListOperatorResponse) SetResultCode(v string) *ListOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *ListOperatorResponse) SetResultMsg(v string) *ListOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListOperatorResponse) SetData(v *OperatorPagedListVO) *ListOperatorResponse {
	s.Data = v
	return s
}

type UpdateApigroupAuthuserconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_auth_user_config
	Param *ApiGroupAuthUserConfigVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApigroupAuthuserconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApigroupAuthuserconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateApigroupAuthuserconfigRequest) SetAuthToken(v string) *UpdateApigroupAuthuserconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigRequest) SetProductInstanceId(v string) *UpdateApigroupAuthuserconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigRequest) SetParam(v *ApiGroupAuthUserConfigVO) *UpdateApigroupAuthuserconfigRequest {
	s.Param = v
	return s
}

func (s *UpdateApigroupAuthuserconfigRequest) SetTenantId(v string) *UpdateApigroupAuthuserconfigRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigRequest) SetWorkspaceId(v string) *UpdateApigroupAuthuserconfigRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApigroupAuthuserconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApigroupAuthuserconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApigroupAuthuserconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateApigroupAuthuserconfigResponse) SetReqMsgId(v string) *UpdateApigroupAuthuserconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigResponse) SetResultCode(v string) *UpdateApigroupAuthuserconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigResponse) SetResultMsg(v string) *UpdateApigroupAuthuserconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApigroupAuthuserconfigResponse) SetData(v bool) *UpdateApigroupAuthuserconfigResponse {
	s.Data = &v
	return s
}

type GetApigroupAuthuserconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApigroupAuthuserconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupAuthuserconfigRequest) GoString() string {
	return s.String()
}

func (s *GetApigroupAuthuserconfigRequest) SetAuthToken(v string) *GetApigroupAuthuserconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApigroupAuthuserconfigRequest) SetProductInstanceId(v string) *GetApigroupAuthuserconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApigroupAuthuserconfigRequest) SetTenantId(v string) *GetApigroupAuthuserconfigRequest {
	s.TenantId = &v
	return s
}

func (s *GetApigroupAuthuserconfigRequest) SetWorkspaceId(v string) *GetApigroupAuthuserconfigRequest {
	s.WorkspaceId = &v
	return s
}

type GetApigroupAuthuserconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiGroupAuthUserConfigVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApigroupAuthuserconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupAuthuserconfigResponse) GoString() string {
	return s.String()
}

func (s *GetApigroupAuthuserconfigResponse) SetReqMsgId(v string) *GetApigroupAuthuserconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApigroupAuthuserconfigResponse) SetResultCode(v string) *GetApigroupAuthuserconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApigroupAuthuserconfigResponse) SetResultMsg(v string) *GetApigroupAuthuserconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApigroupAuthuserconfigResponse) SetData(v *ApiGroupAuthUserConfigVO) *GetApigroupAuthuserconfigResponse {
	s.Data = v
	return s
}

type AddApigroupAuthuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// API标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 用户标识列表
	OperatorIdList []*string `json:"operator_id_list,omitempty" xml:"operator_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AddApigroupAuthuserRequest) String() string {
	return tea.Prettify(s)
}

func (s AddApigroupAuthuserRequest) GoString() string {
	return s.String()
}

func (s *AddApigroupAuthuserRequest) SetAuthToken(v string) *AddApigroupAuthuserRequest {
	s.AuthToken = &v
	return s
}

func (s *AddApigroupAuthuserRequest) SetProductInstanceId(v string) *AddApigroupAuthuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddApigroupAuthuserRequest) SetApiGroupId(v string) *AddApigroupAuthuserRequest {
	s.ApiGroupId = &v
	return s
}

func (s *AddApigroupAuthuserRequest) SetOperatorIdList(v []*string) *AddApigroupAuthuserRequest {
	s.OperatorIdList = v
	return s
}

func (s *AddApigroupAuthuserRequest) SetTenantId(v string) *AddApigroupAuthuserRequest {
	s.TenantId = &v
	return s
}

func (s *AddApigroupAuthuserRequest) SetWorkspaceId(v string) *AddApigroupAuthuserRequest {
	s.WorkspaceId = &v
	return s
}

type AddApigroupAuthuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AddApigroupAuthuserResponse) String() string {
	return tea.Prettify(s)
}

func (s AddApigroupAuthuserResponse) GoString() string {
	return s.String()
}

func (s *AddApigroupAuthuserResponse) SetReqMsgId(v string) *AddApigroupAuthuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddApigroupAuthuserResponse) SetResultCode(v string) *AddApigroupAuthuserResponse {
	s.ResultCode = &v
	return s
}

func (s *AddApigroupAuthuserResponse) SetResultMsg(v string) *AddApigroupAuthuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddApigroupAuthuserResponse) SetData(v *BatchActionResult) *AddApigroupAuthuserResponse {
	s.Data = v
	return s
}

type MountApigroupAuthuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 授权状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
	// 授权用户Id列表
	AuthUserIdList []*string `json:"auth_user_id_list,omitempty" xml:"auth_user_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountApigroupAuthuserRequest) String() string {
	return tea.Prettify(s)
}

func (s MountApigroupAuthuserRequest) GoString() string {
	return s.String()
}

func (s *MountApigroupAuthuserRequest) SetAuthToken(v string) *MountApigroupAuthuserRequest {
	s.AuthToken = &v
	return s
}

func (s *MountApigroupAuthuserRequest) SetProductInstanceId(v string) *MountApigroupAuthuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountApigroupAuthuserRequest) SetApiGroupId(v string) *MountApigroupAuthuserRequest {
	s.ApiGroupId = &v
	return s
}

func (s *MountApigroupAuthuserRequest) SetAuthStatus(v string) *MountApigroupAuthuserRequest {
	s.AuthStatus = &v
	return s
}

func (s *MountApigroupAuthuserRequest) SetAuthUserIdList(v []*string) *MountApigroupAuthuserRequest {
	s.AuthUserIdList = v
	return s
}

func (s *MountApigroupAuthuserRequest) SetTenantId(v string) *MountApigroupAuthuserRequest {
	s.TenantId = &v
	return s
}

func (s *MountApigroupAuthuserRequest) SetWorkspaceId(v string) *MountApigroupAuthuserRequest {
	s.WorkspaceId = &v
	return s
}

type MountApigroupAuthuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountApigroupAuthuserResponse) String() string {
	return tea.Prettify(s)
}

func (s MountApigroupAuthuserResponse) GoString() string {
	return s.String()
}

func (s *MountApigroupAuthuserResponse) SetReqMsgId(v string) *MountApigroupAuthuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountApigroupAuthuserResponse) SetResultCode(v string) *MountApigroupAuthuserResponse {
	s.ResultCode = &v
	return s
}

func (s *MountApigroupAuthuserResponse) SetResultMsg(v string) *MountApigroupAuthuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountApigroupAuthuserResponse) SetData(v *BatchActionResult) *MountApigroupAuthuserResponse {
	s.Data = v
	return s
}

type UnmountApigroupAuthuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 授权用户Id列表
	AuthUserIdList []*string `json:"auth_user_id_list,omitempty" xml:"auth_user_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 授权状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty" require:"true"`
}

func (s UnmountApigroupAuthuserRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountApigroupAuthuserRequest) GoString() string {
	return s.String()
}

func (s *UnmountApigroupAuthuserRequest) SetAuthToken(v string) *UnmountApigroupAuthuserRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetProductInstanceId(v string) *UnmountApigroupAuthuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetApiGroupId(v string) *UnmountApigroupAuthuserRequest {
	s.ApiGroupId = &v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetAuthUserIdList(v []*string) *UnmountApigroupAuthuserRequest {
	s.AuthUserIdList = v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetTenantId(v string) *UnmountApigroupAuthuserRequest {
	s.TenantId = &v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetWorkspaceId(v string) *UnmountApigroupAuthuserRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UnmountApigroupAuthuserRequest) SetAuthStatus(v string) *UnmountApigroupAuthuserRequest {
	s.AuthStatus = &v
	return s
}

type UnmountApigroupAuthuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountApigroupAuthuserResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountApigroupAuthuserResponse) GoString() string {
	return s.String()
}

func (s *UnmountApigroupAuthuserResponse) SetReqMsgId(v string) *UnmountApigroupAuthuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountApigroupAuthuserResponse) SetResultCode(v string) *UnmountApigroupAuthuserResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountApigroupAuthuserResponse) SetResultMsg(v string) *UnmountApigroupAuthuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountApigroupAuthuserResponse) SetData(v *BatchActionResult) *UnmountApigroupAuthuserResponse {
	s.Data = v
	return s
}

type ListApigroupAuthuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *AuthUserInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApigroupAuthuserRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupAuthuserRequest) GoString() string {
	return s.String()
}

func (s *ListApigroupAuthuserRequest) SetAuthToken(v string) *ListApigroupAuthuserRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApigroupAuthuserRequest) SetProductInstanceId(v string) *ListApigroupAuthuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApigroupAuthuserRequest) SetParam(v *AuthUserInfoQueryVO) *ListApigroupAuthuserRequest {
	s.Param = v
	return s
}

func (s *ListApigroupAuthuserRequest) SetTenantId(v string) *ListApigroupAuthuserRequest {
	s.TenantId = &v
	return s
}

func (s *ListApigroupAuthuserRequest) SetWorkspaceId(v string) *ListApigroupAuthuserRequest {
	s.WorkspaceId = &v
	return s
}

type ListApigroupAuthuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *AuthUserInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApigroupAuthuserResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApigroupAuthuserResponse) GoString() string {
	return s.String()
}

func (s *ListApigroupAuthuserResponse) SetReqMsgId(v string) *ListApigroupAuthuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApigroupAuthuserResponse) SetResultCode(v string) *ListApigroupAuthuserResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApigroupAuthuserResponse) SetResultMsg(v string) *ListApigroupAuthuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApigroupAuthuserResponse) SetData(v *AuthUserInfoPagedListVO) *ListApigroupAuthuserResponse {
	s.Data = v
	return s
}

type DeleteApigroupAuthuserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
	// 用户id列表
	UserIdList []*string `json:"user_id_list,omitempty" xml:"user_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteApigroupAuthuserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApigroupAuthuserRequest) GoString() string {
	return s.String()
}

func (s *DeleteApigroupAuthuserRequest) SetAuthToken(v string) *DeleteApigroupAuthuserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApigroupAuthuserRequest) SetProductInstanceId(v string) *DeleteApigroupAuthuserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApigroupAuthuserRequest) SetApiGroupId(v string) *DeleteApigroupAuthuserRequest {
	s.ApiGroupId = &v
	return s
}

func (s *DeleteApigroupAuthuserRequest) SetUserIdList(v []*string) *DeleteApigroupAuthuserRequest {
	s.UserIdList = v
	return s
}

func (s *DeleteApigroupAuthuserRequest) SetTenantId(v string) *DeleteApigroupAuthuserRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApigroupAuthuserRequest) SetWorkspaceId(v string) *DeleteApigroupAuthuserRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteApigroupAuthuserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApigroupAuthuserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApigroupAuthuserResponse) GoString() string {
	return s.String()
}

func (s *DeleteApigroupAuthuserResponse) SetReqMsgId(v string) *DeleteApigroupAuthuserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApigroupAuthuserResponse) SetResultCode(v string) *DeleteApigroupAuthuserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApigroupAuthuserResponse) SetResultMsg(v string) *DeleteApigroupAuthuserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApigroupAuthuserResponse) SetData(v *BatchActionResult) *DeleteApigroupAuthuserResponse {
	s.Data = v
	return s
}

type VerifyApiApigroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api分组标识
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty" require:"true"`
}

func (s VerifyApiApigroupRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyApiApigroupRequest) GoString() string {
	return s.String()
}

func (s *VerifyApiApigroupRequest) SetAuthToken(v string) *VerifyApiApigroupRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyApiApigroupRequest) SetProductInstanceId(v string) *VerifyApiApigroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyApiApigroupRequest) SetTenantId(v string) *VerifyApiApigroupRequest {
	s.TenantId = &v
	return s
}

func (s *VerifyApiApigroupRequest) SetWorkspaceId(v string) *VerifyApiApigroupRequest {
	s.WorkspaceId = &v
	return s
}

func (s *VerifyApiApigroupRequest) SetApiGroupId(v string) *VerifyApiApigroupRequest {
	s.ApiGroupId = &v
	return s
}

type VerifyApiApigroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// api
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyApiApigroupResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyApiApigroupResponse) GoString() string {
	return s.String()
}

func (s *VerifyApiApigroupResponse) SetReqMsgId(v string) *VerifyApiApigroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyApiApigroupResponse) SetResultCode(v string) *VerifyApiApigroupResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyApiApigroupResponse) SetResultMsg(v string) *VerifyApiApigroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyApiApigroupResponse) SetData(v bool) *VerifyApiApigroupResponse {
	s.Data = &v
	return s
}

type UpdateAppAuthapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// app标识
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 加密状态
	EncryptionStatus *string `json:"encryption_status,omitempty" xml:"encryption_status,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateAppAuthapiRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppAuthapiRequest) GoString() string {
	return s.String()
}

func (s *UpdateAppAuthapiRequest) SetAuthToken(v string) *UpdateAppAuthapiRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAppAuthapiRequest) SetProductInstanceId(v string) *UpdateAppAuthapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAppAuthapiRequest) SetApiInfoIdList(v []*string) *UpdateAppAuthapiRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *UpdateAppAuthapiRequest) SetAppId(v string) *UpdateAppAuthapiRequest {
	s.AppId = &v
	return s
}

func (s *UpdateAppAuthapiRequest) SetEncryptionStatus(v string) *UpdateAppAuthapiRequest {
	s.EncryptionStatus = &v
	return s
}

func (s *UpdateAppAuthapiRequest) SetTenantId(v string) *UpdateAppAuthapiRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateAppAuthapiRequest) SetWorkspaceId(v string) *UpdateAppAuthapiRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateAppAuthapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// app
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateAppAuthapiResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppAuthapiResponse) GoString() string {
	return s.String()
}

func (s *UpdateAppAuthapiResponse) SetReqMsgId(v string) *UpdateAppAuthapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAppAuthapiResponse) SetResultCode(v string) *UpdateAppAuthapiResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAppAuthapiResponse) SetResultMsg(v string) *UpdateAppAuthapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAppAuthapiResponse) SetData(v *BatchActionResult) *UpdateAppAuthapiResponse {
	s.Data = v
	return s
}

type CreateGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemConfigVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	//
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGwconfigRequest) GoString() string {
	return s.String()
}

func (s *CreateGwconfigRequest) SetAuthToken(v string) *CreateGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGwconfigRequest) SetProductInstanceId(v string) *CreateGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateGwconfigRequest) SetParam(v *SystemConfigVO) *CreateGwconfigRequest {
	s.Param = v
	return s
}

func (s *CreateGwconfigRequest) SetTenantId(v string) *CreateGwconfigRequest {
	s.TenantId = &v
	return s
}

func (s *CreateGwconfigRequest) SetWorkspaceId(v string) *CreateGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

type CreateGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemConfigVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGwconfigResponse) GoString() string {
	return s.String()
}

func (s *CreateGwconfigResponse) SetReqMsgId(v string) *CreateGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGwconfigResponse) SetResultCode(v string) *CreateGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGwconfigResponse) SetResultMsg(v string) *CreateGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateGwconfigResponse) SetData(v *SystemConfigVO) *CreateGwconfigResponse {
	s.Data = v
	return s
}

type GetGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// config_key
	ConfigKey *string `json:"config_key,omitempty" xml:"config_key,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigRequest) GoString() string {
	return s.String()
}

func (s *GetGwconfigRequest) SetAuthToken(v string) *GetGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGwconfigRequest) SetProductInstanceId(v string) *GetGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGwconfigRequest) SetConfigKey(v string) *GetGwconfigRequest {
	s.ConfigKey = &v
	return s
}

func (s *GetGwconfigRequest) SetTenantId(v string) *GetGwconfigRequest {
	s.TenantId = &v
	return s
}

func (s *GetGwconfigRequest) SetWorkspaceId(v string) *GetGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

type GetGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemConfigVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigResponse) GoString() string {
	return s.String()
}

func (s *GetGwconfigResponse) SetReqMsgId(v string) *GetGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGwconfigResponse) SetResultCode(v string) *GetGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGwconfigResponse) SetResultMsg(v string) *GetGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGwconfigResponse) SetData(v *SystemConfigVO) *GetGwconfigResponse {
	s.Data = v
	return s
}

type UpdateGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemConfigVO `json:"param,omitempty" xml:"param,omitempty"`
	//
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 更新的网关id
	GwIdList []*string `json:"gw_id_list,omitempty" xml:"gw_id_list,omitempty" type:"Repeated"`
}

func (s UpdateGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGwconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateGwconfigRequest) SetAuthToken(v string) *UpdateGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGwconfigRequest) SetProductInstanceId(v string) *UpdateGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGwconfigRequest) SetParam(v *SystemConfigVO) *UpdateGwconfigRequest {
	s.Param = v
	return s
}

func (s *UpdateGwconfigRequest) SetTenantId(v string) *UpdateGwconfigRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateGwconfigRequest) SetWorkspaceId(v string) *UpdateGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UpdateGwconfigRequest) SetGwIdList(v []*string) *UpdateGwconfigRequest {
	s.GwIdList = v
	return s
}

type UpdateGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGwconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateGwconfigResponse) SetReqMsgId(v string) *UpdateGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGwconfigResponse) SetResultCode(v string) *UpdateGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGwconfigResponse) SetResultMsg(v string) *UpdateGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateGwconfigResponse) SetData(v bool) *UpdateGwconfigResponse {
	s.Data = &v
	return s
}

type AllGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// param
	Param *SystemConfigQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s AllGwconfigRequest) GoString() string {
	return s.String()
}

func (s *AllGwconfigRequest) SetAuthToken(v string) *AllGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *AllGwconfigRequest) SetProductInstanceId(v string) *AllGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllGwconfigRequest) SetTenantId(v string) *AllGwconfigRequest {
	s.TenantId = &v
	return s
}

func (s *AllGwconfigRequest) SetParam(v *SystemConfigQueryVO) *AllGwconfigRequest {
	s.Param = v
	return s
}

func (s *AllGwconfigRequest) SetWorkspaceId(v string) *AllGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

type AllGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*GateWayConfigVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s AllGwconfigResponse) GoString() string {
	return s.String()
}

func (s *AllGwconfigResponse) SetReqMsgId(v string) *AllGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllGwconfigResponse) SetResultCode(v string) *AllGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *AllGwconfigResponse) SetResultMsg(v string) *AllGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllGwconfigResponse) SetData(v []*GateWayConfigVO) *AllGwconfigResponse {
	s.Data = v
	return s
}

type GetInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInstanceRequest) GoString() string {
	return s.String()
}

func (s *GetInstanceRequest) SetAuthToken(v string) *GetInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInstanceRequest) SetProductInstanceId(v string) *GetInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInstanceRequest) SetTenantId(v string) *GetInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *GetInstanceRequest) SetWorkspaceId(v string) *GetInstanceRequest {
	s.WorkspaceId = &v
	return s
}

type GetInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// instance_id
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInstanceResponse) GoString() string {
	return s.String()
}

func (s *GetInstanceResponse) SetReqMsgId(v string) *GetInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInstanceResponse) SetResultCode(v string) *GetInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInstanceResponse) SetResultMsg(v string) *GetInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInstanceResponse) SetData(v string) *GetInstanceResponse {
	s.Data = &v
	return s
}

type CheckGwconfigDeleteRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// zone和网关标识
	ConfigKey *string `json:"config_key,omitempty" xml:"config_key,omitempty"`
	// param
	Param *GateWayConfigVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CheckGwconfigDeleteRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckGwconfigDeleteRequest) GoString() string {
	return s.String()
}

func (s *CheckGwconfigDeleteRequest) SetAuthToken(v string) *CheckGwconfigDeleteRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckGwconfigDeleteRequest) SetProductInstanceId(v string) *CheckGwconfigDeleteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckGwconfigDeleteRequest) SetConfigKey(v string) *CheckGwconfigDeleteRequest {
	s.ConfigKey = &v
	return s
}

func (s *CheckGwconfigDeleteRequest) SetParam(v *GateWayConfigVO) *CheckGwconfigDeleteRequest {
	s.Param = v
	return s
}

func (s *CheckGwconfigDeleteRequest) SetTenantId(v string) *CheckGwconfigDeleteRequest {
	s.TenantId = &v
	return s
}

func (s *CheckGwconfigDeleteRequest) SetWorkspaceId(v string) *CheckGwconfigDeleteRequest {
	s.WorkspaceId = &v
	return s
}

type CheckGwconfigDeleteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true, false
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckGwconfigDeleteResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckGwconfigDeleteResponse) GoString() string {
	return s.String()
}

func (s *CheckGwconfigDeleteResponse) SetReqMsgId(v string) *CheckGwconfigDeleteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckGwconfigDeleteResponse) SetResultCode(v string) *CheckGwconfigDeleteResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckGwconfigDeleteResponse) SetResultMsg(v string) *CheckGwconfigDeleteResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckGwconfigDeleteResponse) SetData(v bool) *CheckGwconfigDeleteResponse {
	s.Data = &v
	return s
}

type CheckGwconfigUpdateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// zone和网关标识
	ConfigKey *string `json:"config_key,omitempty" xml:"config_key,omitempty"`
	// param
	GatewayIdList []*string `json:"gateway_id_list,omitempty" xml:"gateway_id_list,omitempty" type:"Repeated"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CheckGwconfigUpdateRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckGwconfigUpdateRequest) GoString() string {
	return s.String()
}

func (s *CheckGwconfigUpdateRequest) SetAuthToken(v string) *CheckGwconfigUpdateRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckGwconfigUpdateRequest) SetProductInstanceId(v string) *CheckGwconfigUpdateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckGwconfigUpdateRequest) SetConfigKey(v string) *CheckGwconfigUpdateRequest {
	s.ConfigKey = &v
	return s
}

func (s *CheckGwconfigUpdateRequest) SetGatewayIdList(v []*string) *CheckGwconfigUpdateRequest {
	s.GatewayIdList = v
	return s
}

func (s *CheckGwconfigUpdateRequest) SetTenantId(v string) *CheckGwconfigUpdateRequest {
	s.TenantId = &v
	return s
}

func (s *CheckGwconfigUpdateRequest) SetWorkspaceId(v string) *CheckGwconfigUpdateRequest {
	s.WorkspaceId = &v
	return s
}

type CheckGwconfigUpdateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckGwconfigUpdateResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckGwconfigUpdateResponse) GoString() string {
	return s.String()
}

func (s *CheckGwconfigUpdateResponse) SetReqMsgId(v string) *CheckGwconfigUpdateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckGwconfigUpdateResponse) SetResultCode(v string) *CheckGwconfigUpdateResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckGwconfigUpdateResponse) SetResultMsg(v string) *CheckGwconfigUpdateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckGwconfigUpdateResponse) SetData(v bool) *CheckGwconfigUpdateResponse {
	s.Data = &v
	return s
}

type CreateApiGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApiGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiGwconfigRequest) GoString() string {
	return s.String()
}

func (s *CreateApiGwconfigRequest) SetAuthToken(v string) *CreateApiGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiGwconfigRequest) SetProductInstanceId(v string) *CreateApiGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApiGwconfigRequest) SetParam(v *ApiInfoVO) *CreateApiGwconfigRequest {
	s.Param = v
	return s
}

func (s *CreateApiGwconfigRequest) SetTenantId(v string) *CreateApiGwconfigRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApiGwconfigRequest) SetWorkspaceId(v string) *CreateApiGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApiGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApiGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiGwconfigResponse) GoString() string {
	return s.String()
}

func (s *CreateApiGwconfigResponse) SetReqMsgId(v string) *CreateApiGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiGwconfigResponse) SetResultCode(v string) *CreateApiGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiGwconfigResponse) SetResultMsg(v string) *CreateApiGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApiGwconfigResponse) SetData(v *ApiInfoVO) *CreateApiGwconfigResponse {
	s.Data = v
	return s
}

type UpdateApiGwconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UpdateApiGwconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiGwconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiGwconfigRequest) SetAuthToken(v string) *UpdateApiGwconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiGwconfigRequest) SetProductInstanceId(v string) *UpdateApiGwconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiGwconfigRequest) SetParam(v *ApiInfoVO) *UpdateApiGwconfigRequest {
	s.Param = v
	return s
}

func (s *UpdateApiGwconfigRequest) SetWorkspaceId(v string) *UpdateApiGwconfigRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UpdateApiGwconfigRequest) SetTenantId(v string) *UpdateApiGwconfigRequest {
	s.TenantId = &v
	return s
}

type UpdateApiGwconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiGwconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiGwconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiGwconfigResponse) SetReqMsgId(v string) *UpdateApiGwconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiGwconfigResponse) SetResultCode(v string) *UpdateApiGwconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiGwconfigResponse) SetResultMsg(v string) *UpdateApiGwconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiGwconfigResponse) SetData(v bool) *UpdateApiGwconfigResponse {
	s.Data = &v
	return s
}

type CheckApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api参数
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CheckApiRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckApiRequest) GoString() string {
	return s.String()
}

func (s *CheckApiRequest) SetAuthToken(v string) *CheckApiRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckApiRequest) SetProductInstanceId(v string) *CheckApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckApiRequest) SetParam(v *ApiInfoVO) *CheckApiRequest {
	s.Param = v
	return s
}

func (s *CheckApiRequest) SetTenantId(v string) *CheckApiRequest {
	s.TenantId = &v
	return s
}

func (s *CheckApiRequest) SetWorkspaceId(v string) *CheckApiRequest {
	s.WorkspaceId = &v
	return s
}

type CheckApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true成功，false失败
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckApiResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckApiResponse) GoString() string {
	return s.String()
}

func (s *CheckApiResponse) SetReqMsgId(v string) *CheckApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckApiResponse) SetResultCode(v string) *CheckApiResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckApiResponse) SetResultMsg(v string) *CheckApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckApiResponse) SetData(v bool) *CheckApiResponse {
	s.Data = &v
	return s
}

type CheckSysUpdateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	SysId *string `json:"sys_id,omitempty" xml:"sys_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CheckSysUpdateRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSysUpdateRequest) GoString() string {
	return s.String()
}

func (s *CheckSysUpdateRequest) SetAuthToken(v string) *CheckSysUpdateRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSysUpdateRequest) SetProductInstanceId(v string) *CheckSysUpdateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSysUpdateRequest) SetSysId(v string) *CheckSysUpdateRequest {
	s.SysId = &v
	return s
}

func (s *CheckSysUpdateRequest) SetTenantId(v string) *CheckSysUpdateRequest {
	s.TenantId = &v
	return s
}

func (s *CheckSysUpdateRequest) SetWorkspaceId(v string) *CheckSysUpdateRequest {
	s.WorkspaceId = &v
	return s
}

type CheckSysUpdateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckSysUpdateResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSysUpdateResponse) GoString() string {
	return s.String()
}

func (s *CheckSysUpdateResponse) SetReqMsgId(v string) *CheckSysUpdateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSysUpdateResponse) SetResultCode(v string) *CheckSysUpdateResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSysUpdateResponse) SetResultMsg(v string) *CheckSysUpdateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSysUpdateResponse) SetData(v bool) *CheckSysUpdateResponse {
	s.Data = &v
	return s
}

type GetApiHistoryversionapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// version_id
	VersionId *string `json:"version_id,omitempty" xml:"version_id,omitempty" require:"true"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApiHistoryversionapiRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiHistoryversionapiRequest) GoString() string {
	return s.String()
}

func (s *GetApiHistoryversionapiRequest) SetAuthToken(v string) *GetApiHistoryversionapiRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiHistoryversionapiRequest) SetProductInstanceId(v string) *GetApiHistoryversionapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiHistoryversionapiRequest) SetApiId(v string) *GetApiHistoryversionapiRequest {
	s.ApiId = &v
	return s
}

func (s *GetApiHistoryversionapiRequest) SetTenantId(v string) *GetApiHistoryversionapiRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiHistoryversionapiRequest) SetVersionId(v string) *GetApiHistoryversionapiRequest {
	s.VersionId = &v
	return s
}

func (s *GetApiHistoryversionapiRequest) SetWorkspaceId(v string) *GetApiHistoryversionapiRequest {
	s.WorkspaceId = &v
	return s
}

type GetApiHistoryversionapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiHistoryversionapiResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiHistoryversionapiResponse) GoString() string {
	return s.String()
}

func (s *GetApiHistoryversionapiResponse) SetReqMsgId(v string) *GetApiHistoryversionapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiHistoryversionapiResponse) SetResultCode(v string) *GetApiHistoryversionapiResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiHistoryversionapiResponse) SetResultMsg(v string) *GetApiHistoryversionapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiHistoryversionapiResponse) SetData(v *ApiInfoVO) *GetApiHistoryversionapiResponse {
	s.Data = v
	return s
}

type AllStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *StrategyInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	//
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AllStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s AllStrategyRequest) GoString() string {
	return s.String()
}

func (s *AllStrategyRequest) SetAuthToken(v string) *AllStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *AllStrategyRequest) SetProductInstanceId(v string) *AllStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllStrategyRequest) SetParam(v *StrategyInfoQueryVO) *AllStrategyRequest {
	s.Param = v
	return s
}

func (s *AllStrategyRequest) SetWorkspaceId(v string) *AllStrategyRequest {
	s.WorkspaceId = &v
	return s
}

func (s *AllStrategyRequest) SetTenantId(v string) *AllStrategyRequest {
	s.TenantId = &v
	return s
}

type AllStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*StrategyInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s AllStrategyResponse) GoString() string {
	return s.String()
}

func (s *AllStrategyResponse) SetReqMsgId(v string) *AllStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllStrategyResponse) SetResultCode(v string) *AllStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *AllStrategyResponse) SetResultMsg(v string) *AllStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllStrategyResponse) SetData(v []*StrategyInfoVO) *AllStrategyResponse {
	s.Data = v
	return s
}

type AllStrategyApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllStrategyApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AllStrategyApiRequest) GoString() string {
	return s.String()
}

func (s *AllStrategyApiRequest) SetAuthToken(v string) *AllStrategyApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AllStrategyApiRequest) SetProductInstanceId(v string) *AllStrategyApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllStrategyApiRequest) SetParam(v *ApiInfoQueryVO) *AllStrategyApiRequest {
	s.Param = v
	return s
}

func (s *AllStrategyApiRequest) SetStrategyId(v string) *AllStrategyApiRequest {
	s.StrategyId = &v
	return s
}

func (s *AllStrategyApiRequest) SetTenantId(v string) *AllStrategyApiRequest {
	s.TenantId = &v
	return s
}

func (s *AllStrategyApiRequest) SetWorkspaceId(v string) *AllStrategyApiRequest {
	s.WorkspaceId = &v
	return s
}

type AllStrategyApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllStrategyApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AllStrategyApiResponse) GoString() string {
	return s.String()
}

func (s *AllStrategyApiResponse) SetReqMsgId(v string) *AllStrategyApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllStrategyApiResponse) SetResultCode(v string) *AllStrategyApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AllStrategyApiResponse) SetResultMsg(v string) *AllStrategyApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllStrategyApiResponse) SetData(v []*ApiInfoVO) *AllStrategyApiResponse {
	s.Data = v
	return s
}

type ListStrategyApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListStrategyApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ListStrategyApiRequest) GoString() string {
	return s.String()
}

func (s *ListStrategyApiRequest) SetAuthToken(v string) *ListStrategyApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ListStrategyApiRequest) SetProductInstanceId(v string) *ListStrategyApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListStrategyApiRequest) SetParam(v *ApiInfoQueryVO) *ListStrategyApiRequest {
	s.Param = v
	return s
}

func (s *ListStrategyApiRequest) SetStrategyId(v string) *ListStrategyApiRequest {
	s.StrategyId = &v
	return s
}

func (s *ListStrategyApiRequest) SetTenantId(v string) *ListStrategyApiRequest {
	s.TenantId = &v
	return s
}

func (s *ListStrategyApiRequest) SetWorkspaceId(v string) *ListStrategyApiRequest {
	s.WorkspaceId = &v
	return s
}

type ListStrategyApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListStrategyApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ListStrategyApiResponse) GoString() string {
	return s.String()
}

func (s *ListStrategyApiResponse) SetReqMsgId(v string) *ListStrategyApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListStrategyApiResponse) SetResultCode(v string) *ListStrategyApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ListStrategyApiResponse) SetResultMsg(v string) *ListStrategyApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListStrategyApiResponse) SetData(v *ApiInfoPagedListVO) *ListStrategyApiResponse {
	s.Data = v
	return s
}

type MountStrategyApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绑定的API ID列表
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" type:"Repeated"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s MountStrategyApiRequest) String() string {
	return tea.Prettify(s)
}

func (s MountStrategyApiRequest) GoString() string {
	return s.String()
}

func (s *MountStrategyApiRequest) SetAuthToken(v string) *MountStrategyApiRequest {
	s.AuthToken = &v
	return s
}

func (s *MountStrategyApiRequest) SetProductInstanceId(v string) *MountStrategyApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MountStrategyApiRequest) SetApiIdList(v []*string) *MountStrategyApiRequest {
	s.ApiIdList = v
	return s
}

func (s *MountStrategyApiRequest) SetStrategyId(v string) *MountStrategyApiRequest {
	s.StrategyId = &v
	return s
}

func (s *MountStrategyApiRequest) SetTenantId(v string) *MountStrategyApiRequest {
	s.TenantId = &v
	return s
}

func (s *MountStrategyApiRequest) SetWorkspaceId(v string) *MountStrategyApiRequest {
	s.WorkspaceId = &v
	return s
}

type MountStrategyApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s MountStrategyApiResponse) String() string {
	return tea.Prettify(s)
}

func (s MountStrategyApiResponse) GoString() string {
	return s.String()
}

func (s *MountStrategyApiResponse) SetReqMsgId(v string) *MountStrategyApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MountStrategyApiResponse) SetResultCode(v string) *MountStrategyApiResponse {
	s.ResultCode = &v
	return s
}

func (s *MountStrategyApiResponse) SetResultMsg(v string) *MountStrategyApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *MountStrategyApiResponse) SetData(v *BatchActionResult) *MountStrategyApiResponse {
	s.Data = v
	return s
}

type UnmountStrategyApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 绑定的API ID列表
	ApiIdList []*string `json:"api_id_list,omitempty" xml:"api_id_list,omitempty" type:"Repeated"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s UnmountStrategyApiRequest) String() string {
	return tea.Prettify(s)
}

func (s UnmountStrategyApiRequest) GoString() string {
	return s.String()
}

func (s *UnmountStrategyApiRequest) SetAuthToken(v string) *UnmountStrategyApiRequest {
	s.AuthToken = &v
	return s
}

func (s *UnmountStrategyApiRequest) SetProductInstanceId(v string) *UnmountStrategyApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnmountStrategyApiRequest) SetApiIdList(v []*string) *UnmountStrategyApiRequest {
	s.ApiIdList = v
	return s
}

func (s *UnmountStrategyApiRequest) SetStrategyId(v string) *UnmountStrategyApiRequest {
	s.StrategyId = &v
	return s
}

func (s *UnmountStrategyApiRequest) SetWorkspaceId(v string) *UnmountStrategyApiRequest {
	s.WorkspaceId = &v
	return s
}

func (s *UnmountStrategyApiRequest) SetTenantId(v string) *UnmountStrategyApiRequest {
	s.TenantId = &v
	return s
}

type UnmountStrategyApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *BatchActionResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnmountStrategyApiResponse) String() string {
	return tea.Prettify(s)
}

func (s UnmountStrategyApiResponse) GoString() string {
	return s.String()
}

func (s *UnmountStrategyApiResponse) SetReqMsgId(v string) *UnmountStrategyApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnmountStrategyApiResponse) SetResultCode(v string) *UnmountStrategyApiResponse {
	s.ResultCode = &v
	return s
}

func (s *UnmountStrategyApiResponse) SetResultMsg(v string) *UnmountStrategyApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnmountStrategyApiResponse) SetData(v *BatchActionResult) *UnmountStrategyApiResponse {
	s.Data = v
	return s
}

type CreateStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *StrategyInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateStrategyRequest) GoString() string {
	return s.String()
}

func (s *CreateStrategyRequest) SetAuthToken(v string) *CreateStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateStrategyRequest) SetProductInstanceId(v string) *CreateStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateStrategyRequest) SetParam(v *StrategyInfoVO) *CreateStrategyRequest {
	s.Param = v
	return s
}

func (s *CreateStrategyRequest) SetTenantId(v string) *CreateStrategyRequest {
	s.TenantId = &v
	return s
}

func (s *CreateStrategyRequest) SetWorkspaceId(v string) *CreateStrategyRequest {
	s.WorkspaceId = &v
	return s
}

type CreateStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *StrategyInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateStrategyResponse) GoString() string {
	return s.String()
}

func (s *CreateStrategyResponse) SetReqMsgId(v string) *CreateStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateStrategyResponse) SetResultCode(v string) *CreateStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateStrategyResponse) SetResultMsg(v string) *CreateStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateStrategyResponse) SetData(v *StrategyInfoVO) *CreateStrategyResponse {
	s.Data = v
	return s
}

type DeleteStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteStrategyRequest) GoString() string {
	return s.String()
}

func (s *DeleteStrategyRequest) SetAuthToken(v string) *DeleteStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteStrategyRequest) SetProductInstanceId(v string) *DeleteStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteStrategyRequest) SetStrategyId(v string) *DeleteStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *DeleteStrategyRequest) SetTenantId(v string) *DeleteStrategyRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteStrategyRequest) SetWorkspaceId(v string) *DeleteStrategyRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteStrategyResponse) GoString() string {
	return s.String()
}

func (s *DeleteStrategyResponse) SetReqMsgId(v string) *DeleteStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteStrategyResponse) SetResultCode(v string) *DeleteStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteStrategyResponse) SetResultMsg(v string) *DeleteStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteStrategyResponse) SetData(v bool) *DeleteStrategyResponse {
	s.Data = &v
	return s
}

type GetStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// strategy_id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s GetStrategyRequest) GoString() string {
	return s.String()
}

func (s *GetStrategyRequest) SetAuthToken(v string) *GetStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *GetStrategyRequest) SetProductInstanceId(v string) *GetStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetStrategyRequest) SetStrategyId(v string) *GetStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *GetStrategyRequest) SetTenantId(v string) *GetStrategyRequest {
	s.TenantId = &v
	return s
}

func (s *GetStrategyRequest) SetWorkspaceId(v string) *GetStrategyRequest {
	s.WorkspaceId = &v
	return s
}

type GetStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *StrategyInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s GetStrategyResponse) GoString() string {
	return s.String()
}

func (s *GetStrategyResponse) SetReqMsgId(v string) *GetStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetStrategyResponse) SetResultCode(v string) *GetStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *GetStrategyResponse) SetResultMsg(v string) *GetStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetStrategyResponse) SetData(v *StrategyInfoVO) *GetStrategyResponse {
	s.Data = v
	return s
}

type ListStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *StrategyInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListStrategyRequest) GoString() string {
	return s.String()
}

func (s *ListStrategyRequest) SetAuthToken(v string) *ListStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListStrategyRequest) SetProductInstanceId(v string) *ListStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListStrategyRequest) SetParam(v *StrategyInfoQueryVO) *ListStrategyRequest {
	s.Param = v
	return s
}

func (s *ListStrategyRequest) SetTenantId(v string) *ListStrategyRequest {
	s.TenantId = &v
	return s
}

func (s *ListStrategyRequest) SetWorkspaceId(v string) *ListStrategyRequest {
	s.WorkspaceId = &v
	return s
}

type ListStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *StrategyPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListStrategyResponse) GoString() string {
	return s.String()
}

func (s *ListStrategyResponse) SetReqMsgId(v string) *ListStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListStrategyResponse) SetResultCode(v string) *ListStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListStrategyResponse) SetResultMsg(v string) *ListStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListStrategyResponse) SetData(v *StrategyPagedListVO) *ListStrategyResponse {
	s.Data = v
	return s
}

type UpdateStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *StrategyInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateStrategyRequest) GoString() string {
	return s.String()
}

func (s *UpdateStrategyRequest) SetAuthToken(v string) *UpdateStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateStrategyRequest) SetProductInstanceId(v string) *UpdateStrategyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateStrategyRequest) SetParam(v *StrategyInfoVO) *UpdateStrategyRequest {
	s.Param = v
	return s
}

func (s *UpdateStrategyRequest) SetTenantId(v string) *UpdateStrategyRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateStrategyRequest) SetWorkspaceId(v string) *UpdateStrategyRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateStrategyResponse) GoString() string {
	return s.String()
}

func (s *UpdateStrategyResponse) SetReqMsgId(v string) *UpdateStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateStrategyResponse) SetResultCode(v string) *UpdateStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateStrategyResponse) SetResultMsg(v string) *UpdateStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateStrategyResponse) SetData(v bool) *UpdateStrategyResponse {
	s.Data = &v
	return s
}

type GetHomeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetHomeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetHomeRequest) GoString() string {
	return s.String()
}

func (s *GetHomeRequest) SetAuthToken(v string) *GetHomeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetHomeRequest) SetProductInstanceId(v string) *GetHomeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetHomeRequest) SetTenantId(v string) *GetHomeRequest {
	s.TenantId = &v
	return s
}

func (s *GetHomeRequest) SetWorkspaceId(v string) *GetHomeRequest {
	s.WorkspaceId = &v
	return s
}

type GetHomeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *HomePageVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetHomeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetHomeResponse) GoString() string {
	return s.String()
}

func (s *GetHomeResponse) SetReqMsgId(v string) *GetHomeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetHomeResponse) SetResultCode(v string) *GetHomeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetHomeResponse) SetResultMsg(v string) *GetHomeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetHomeResponse) SetData(v *HomePageVO) *GetHomeResponse {
	s.Data = v
	return s
}

type CheckApigroupDomainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiGroupDomainVO `json:"param,omitempty" xml:"param,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CheckApigroupDomainRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckApigroupDomainRequest) GoString() string {
	return s.String()
}

func (s *CheckApigroupDomainRequest) SetAuthToken(v string) *CheckApigroupDomainRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckApigroupDomainRequest) SetProductInstanceId(v string) *CheckApigroupDomainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckApigroupDomainRequest) SetParam(v *ApiGroupDomainVO) *CheckApigroupDomainRequest {
	s.Param = v
	return s
}

func (s *CheckApigroupDomainRequest) SetWorkspaceId(v string) *CheckApigroupDomainRequest {
	s.WorkspaceId = &v
	return s
}

func (s *CheckApigroupDomainRequest) SetTenantId(v string) *CheckApigroupDomainRequest {
	s.TenantId = &v
	return s
}

type CheckApigroupDomainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	// true成功，false失败
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckApigroupDomainResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckApigroupDomainResponse) GoString() string {
	return s.String()
}

func (s *CheckApigroupDomainResponse) SetReqMsgId(v string) *CheckApigroupDomainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckApigroupDomainResponse) SetResultCode(v string) *CheckApigroupDomainResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckApigroupDomainResponse) SetResultMsg(v string) *CheckApigroupDomainResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckApigroupDomainResponse) SetData(v bool) *CheckApigroupDomainResponse {
	s.Data = &v
	return s
}

type GetApigroupDomainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s GetApigroupDomainRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupDomainRequest) GoString() string {
	return s.String()
}

func (s *GetApigroupDomainRequest) SetAuthToken(v string) *GetApigroupDomainRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApigroupDomainRequest) SetProductInstanceId(v string) *GetApigroupDomainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApigroupDomainRequest) SetWorkspaceId(v string) *GetApigroupDomainRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetApigroupDomainRequest) SetTenantId(v string) *GetApigroupDomainRequest {
	s.TenantId = &v
	return s
}

type GetApigroupDomainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApigroupDomainResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApigroupDomainResponse) GoString() string {
	return s.String()
}

func (s *GetApigroupDomainResponse) SetReqMsgId(v string) *GetApigroupDomainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApigroupDomainResponse) SetResultCode(v string) *GetApigroupDomainResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApigroupDomainResponse) SetResultMsg(v string) *GetApigroupDomainResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApigroupDomainResponse) SetData(v string) *GetApigroupDomainResponse {
	s.Data = &v
	return s
}

type GetApiSwaggerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" require:"true" type:"Repeated"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetApiSwaggerRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiSwaggerRequest) GoString() string {
	return s.String()
}

func (s *GetApiSwaggerRequest) SetAuthToken(v string) *GetApiSwaggerRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiSwaggerRequest) SetProductInstanceId(v string) *GetApiSwaggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiSwaggerRequest) SetApiInfoIdList(v []*string) *GetApiSwaggerRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *GetApiSwaggerRequest) SetTenantId(v string) *GetApiSwaggerRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiSwaggerRequest) SetWorkspaceId(v string) *GetApiSwaggerRequest {
	s.WorkspaceId = &v
	return s
}

type GetApiSwaggerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// swaggerJson
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiSwaggerResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiSwaggerResponse) GoString() string {
	return s.String()
}

func (s *GetApiSwaggerResponse) SetReqMsgId(v string) *GetApiSwaggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiSwaggerResponse) SetResultCode(v string) *GetApiSwaggerResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiSwaggerResponse) SetResultMsg(v string) *GetApiSwaggerResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiSwaggerResponse) SetData(v string) *GetApiSwaggerResponse {
	s.Data = &v
	return s
}

type DownloadApiSwaggerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识列表
	ApiInfoIdList []*string `json:"api_info_id_list,omitempty" xml:"api_info_id_list,omitempty" type:"Repeated"`
	// swaggerJson
	SwaggerJsonStr *string `json:"swagger_json_str,omitempty" xml:"swagger_json_str,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DownloadApiSwaggerRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadApiSwaggerRequest) GoString() string {
	return s.String()
}

func (s *DownloadApiSwaggerRequest) SetAuthToken(v string) *DownloadApiSwaggerRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadApiSwaggerRequest) SetProductInstanceId(v string) *DownloadApiSwaggerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadApiSwaggerRequest) SetApiInfoIdList(v []*string) *DownloadApiSwaggerRequest {
	s.ApiInfoIdList = v
	return s
}

func (s *DownloadApiSwaggerRequest) SetSwaggerJsonStr(v string) *DownloadApiSwaggerRequest {
	s.SwaggerJsonStr = &v
	return s
}

func (s *DownloadApiSwaggerRequest) SetTenantId(v string) *DownloadApiSwaggerRequest {
	s.TenantId = &v
	return s
}

func (s *DownloadApiSwaggerRequest) SetWorkspaceId(v string) *DownloadApiSwaggerRequest {
	s.WorkspaceId = &v
	return s
}

type DownloadApiSwaggerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DownloadApiSwaggerResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadApiSwaggerResponse) GoString() string {
	return s.String()
}

func (s *DownloadApiSwaggerResponse) SetReqMsgId(v string) *DownloadApiSwaggerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadApiSwaggerResponse) SetResultCode(v string) *DownloadApiSwaggerResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadApiSwaggerResponse) SetResultMsg(v string) *DownloadApiSwaggerResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadApiSwaggerResponse) SetData(v string) *DownloadApiSwaggerResponse {
	s.Data = &v
	return s
}

type DownloadApimodelCodegenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// APp标识列表
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_group_id
	ApiGroupId *string `json:"api_group_id,omitempty" xml:"api_group_id,omitempty"`
	// package_name
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty"`
}

func (s DownloadApimodelCodegenRequest) String() string {
	return tea.Prettify(s)
}

func (s DownloadApimodelCodegenRequest) GoString() string {
	return s.String()
}

func (s *DownloadApimodelCodegenRequest) SetAuthToken(v string) *DownloadApimodelCodegenRequest {
	s.AuthToken = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetProductInstanceId(v string) *DownloadApimodelCodegenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetAppId(v string) *DownloadApimodelCodegenRequest {
	s.AppId = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetTenantId(v string) *DownloadApimodelCodegenRequest {
	s.TenantId = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetWorkspaceId(v string) *DownloadApimodelCodegenRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetApiGroupId(v string) *DownloadApimodelCodegenRequest {
	s.ApiGroupId = &v
	return s
}

func (s *DownloadApimodelCodegenRequest) SetPackageName(v string) *DownloadApimodelCodegenRequest {
	s.PackageName = &v
	return s
}

type DownloadApimodelCodegenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DownloadApimodelCodegenResponse) String() string {
	return tea.Prettify(s)
}

func (s DownloadApimodelCodegenResponse) GoString() string {
	return s.String()
}

func (s *DownloadApimodelCodegenResponse) SetReqMsgId(v string) *DownloadApimodelCodegenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DownloadApimodelCodegenResponse) SetResultCode(v string) *DownloadApimodelCodegenResponse {
	s.ResultCode = &v
	return s
}

func (s *DownloadApimodelCodegenResponse) SetResultMsg(v string) *DownloadApimodelCodegenResponse {
	s.ResultMsg = &v
	return s
}

func (s *DownloadApimodelCodegenResponse) SetData(v string) *DownloadApimodelCodegenResponse {
	s.Data = &v
	return s
}

type GetGwconfigGatewayswitchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetGwconfigGatewayswitchRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigGatewayswitchRequest) GoString() string {
	return s.String()
}

func (s *GetGwconfigGatewayswitchRequest) SetAuthToken(v string) *GetGwconfigGatewayswitchRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGwconfigGatewayswitchRequest) SetProductInstanceId(v string) *GetGwconfigGatewayswitchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGwconfigGatewayswitchRequest) SetTenantId(v string) *GetGwconfigGatewayswitchRequest {
	s.TenantId = &v
	return s
}

func (s *GetGwconfigGatewayswitchRequest) SetWorkspaceId(v string) *GetGwconfigGatewayswitchRequest {
	s.WorkspaceId = &v
	return s
}

type GetGwconfigGatewayswitchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetGwconfigGatewayswitchResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigGatewayswitchResponse) GoString() string {
	return s.String()
}

func (s *GetGwconfigGatewayswitchResponse) SetReqMsgId(v string) *GetGwconfigGatewayswitchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGwconfigGatewayswitchResponse) SetResultCode(v string) *GetGwconfigGatewayswitchResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGwconfigGatewayswitchResponse) SetResultMsg(v string) *GetGwconfigGatewayswitchResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGwconfigGatewayswitchResponse) SetData(v bool) *GetGwconfigGatewayswitchResponse {
	s.Data = &v
	return s
}

type AllRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RegistryInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s AllRegistryRequest) GoString() string {
	return s.String()
}

func (s *AllRegistryRequest) SetAuthToken(v string) *AllRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *AllRegistryRequest) SetProductInstanceId(v string) *AllRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllRegistryRequest) SetParam(v *RegistryInfoQueryVO) *AllRegistryRequest {
	s.Param = v
	return s
}

func (s *AllRegistryRequest) SetTenantId(v string) *AllRegistryRequest {
	s.TenantId = &v
	return s
}

func (s *AllRegistryRequest) SetWorkspaceId(v string) *AllRegistryRequest {
	s.WorkspaceId = &v
	return s
}

type AllRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*RegistryInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s AllRegistryResponse) GoString() string {
	return s.String()
}

func (s *AllRegistryResponse) SetReqMsgId(v string) *AllRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllRegistryResponse) SetResultCode(v string) *AllRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *AllRegistryResponse) SetResultMsg(v string) *AllRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllRegistryResponse) SetData(v []*RegistryInfoVO) *AllRegistryResponse {
	s.Data = v
	return s
}

type AllRegistrySysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AllRegistrySysRequest) String() string {
	return tea.Prettify(s)
}

func (s AllRegistrySysRequest) GoString() string {
	return s.String()
}

func (s *AllRegistrySysRequest) SetAuthToken(v string) *AllRegistrySysRequest {
	s.AuthToken = &v
	return s
}

func (s *AllRegistrySysRequest) SetProductInstanceId(v string) *AllRegistrySysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllRegistrySysRequest) SetParam(v *SystemClusterQueryVO) *AllRegistrySysRequest {
	s.Param = v
	return s
}

func (s *AllRegistrySysRequest) SetRegistryId(v string) *AllRegistrySysRequest {
	s.RegistryId = &v
	return s
}

func (s *AllRegistrySysRequest) SetWorkspaceId(v string) *AllRegistrySysRequest {
	s.WorkspaceId = &v
	return s
}

func (s *AllRegistrySysRequest) SetTenantId(v string) *AllRegistrySysRequest {
	s.TenantId = &v
	return s
}

type AllRegistrySysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*SystemClusterVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllRegistrySysResponse) String() string {
	return tea.Prettify(s)
}

func (s AllRegistrySysResponse) GoString() string {
	return s.String()
}

func (s *AllRegistrySysResponse) SetReqMsgId(v string) *AllRegistrySysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllRegistrySysResponse) SetResultCode(v string) *AllRegistrySysResponse {
	s.ResultCode = &v
	return s
}

func (s *AllRegistrySysResponse) SetResultMsg(v string) *AllRegistrySysResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllRegistrySysResponse) SetData(v []*SystemClusterVO) *AllRegistrySysResponse {
	s.Data = v
	return s
}

type ListRegistrySysRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *SystemClusterQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListRegistrySysRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRegistrySysRequest) GoString() string {
	return s.String()
}

func (s *ListRegistrySysRequest) SetAuthToken(v string) *ListRegistrySysRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRegistrySysRequest) SetProductInstanceId(v string) *ListRegistrySysRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRegistrySysRequest) SetParam(v *SystemClusterQueryVO) *ListRegistrySysRequest {
	s.Param = v
	return s
}

func (s *ListRegistrySysRequest) SetRegistryId(v string) *ListRegistrySysRequest {
	s.RegistryId = &v
	return s
}

func (s *ListRegistrySysRequest) SetTenantId(v string) *ListRegistrySysRequest {
	s.TenantId = &v
	return s
}

func (s *ListRegistrySysRequest) SetWorkspaceId(v string) *ListRegistrySysRequest {
	s.WorkspaceId = &v
	return s
}

type ListRegistrySysResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *SystemClusterPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListRegistrySysResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRegistrySysResponse) GoString() string {
	return s.String()
}

func (s *ListRegistrySysResponse) SetReqMsgId(v string) *ListRegistrySysResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRegistrySysResponse) SetResultCode(v string) *ListRegistrySysResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRegistrySysResponse) SetResultMsg(v string) *ListRegistrySysResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRegistrySysResponse) SetData(v *SystemClusterPagedListVO) *ListRegistrySysResponse {
	s.Data = v
	return s
}

type CreateRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RegistryInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRegistryRequest) GoString() string {
	return s.String()
}

func (s *CreateRegistryRequest) SetAuthToken(v string) *CreateRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRegistryRequest) SetProductInstanceId(v string) *CreateRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRegistryRequest) SetParam(v *RegistryInfoVO) *CreateRegistryRequest {
	s.Param = v
	return s
}

func (s *CreateRegistryRequest) SetTenantId(v string) *CreateRegistryRequest {
	s.TenantId = &v
	return s
}

func (s *CreateRegistryRequest) SetWorkspaceId(v string) *CreateRegistryRequest {
	s.WorkspaceId = &v
	return s
}

type CreateRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RegistryInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRegistryResponse) GoString() string {
	return s.String()
}

func (s *CreateRegistryResponse) SetReqMsgId(v string) *CreateRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRegistryResponse) SetResultCode(v string) *CreateRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRegistryResponse) SetResultMsg(v string) *CreateRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRegistryResponse) SetData(v *RegistryInfoVO) *CreateRegistryResponse {
	s.Data = v
	return s
}

type DeleteRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty" require:"true"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s DeleteRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRegistryRequest) GoString() string {
	return s.String()
}

func (s *DeleteRegistryRequest) SetAuthToken(v string) *DeleteRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRegistryRequest) SetProductInstanceId(v string) *DeleteRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteRegistryRequest) SetRegistryId(v string) *DeleteRegistryRequest {
	s.RegistryId = &v
	return s
}

func (s *DeleteRegistryRequest) SetWorkspaceId(v string) *DeleteRegistryRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DeleteRegistryRequest) SetTenantId(v string) *DeleteRegistryRequest {
	s.TenantId = &v
	return s
}

type DeleteRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRegistryResponse) GoString() string {
	return s.String()
}

func (s *DeleteRegistryResponse) SetReqMsgId(v string) *DeleteRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRegistryResponse) SetResultCode(v string) *DeleteRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRegistryResponse) SetResultMsg(v string) *DeleteRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteRegistryResponse) SetData(v bool) *DeleteRegistryResponse {
	s.Data = &v
	return s
}

type GetRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// registry_id
	RegistryId *string `json:"registry_id,omitempty" xml:"registry_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRegistryRequest) GoString() string {
	return s.String()
}

func (s *GetRegistryRequest) SetAuthToken(v string) *GetRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRegistryRequest) SetProductInstanceId(v string) *GetRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRegistryRequest) SetRegistryId(v string) *GetRegistryRequest {
	s.RegistryId = &v
	return s
}

func (s *GetRegistryRequest) SetTenantId(v string) *GetRegistryRequest {
	s.TenantId = &v
	return s
}

func (s *GetRegistryRequest) SetWorkspaceId(v string) *GetRegistryRequest {
	s.WorkspaceId = &v
	return s
}

type GetRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RegistryInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRegistryResponse) GoString() string {
	return s.String()
}

func (s *GetRegistryResponse) SetReqMsgId(v string) *GetRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRegistryResponse) SetResultCode(v string) *GetRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRegistryResponse) SetResultMsg(v string) *GetRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRegistryResponse) SetData(v *RegistryInfoVO) *GetRegistryResponse {
	s.Data = v
	return s
}

type ListRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RegistryInfoQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRegistryRequest) GoString() string {
	return s.String()
}

func (s *ListRegistryRequest) SetAuthToken(v string) *ListRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRegistryRequest) SetProductInstanceId(v string) *ListRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRegistryRequest) SetParam(v *RegistryInfoQueryVO) *ListRegistryRequest {
	s.Param = v
	return s
}

func (s *ListRegistryRequest) SetTenantId(v string) *ListRegistryRequest {
	s.TenantId = &v
	return s
}

func (s *ListRegistryRequest) SetWorkspaceId(v string) *ListRegistryRequest {
	s.WorkspaceId = &v
	return s
}

type ListRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *RegistryInfoPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRegistryResponse) GoString() string {
	return s.String()
}

func (s *ListRegistryResponse) SetReqMsgId(v string) *ListRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRegistryResponse) SetResultCode(v string) *ListRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRegistryResponse) SetResultMsg(v string) *ListRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRegistryResponse) SetData(v *RegistryInfoPagedListVO) *ListRegistryResponse {
	s.Data = v
	return s
}

type UpdateRegistryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *RegistryInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateRegistryRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRegistryRequest) GoString() string {
	return s.String()
}

func (s *UpdateRegistryRequest) SetAuthToken(v string) *UpdateRegistryRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRegistryRequest) SetProductInstanceId(v string) *UpdateRegistryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateRegistryRequest) SetParam(v *RegistryInfoVO) *UpdateRegistryRequest {
	s.Param = v
	return s
}

func (s *UpdateRegistryRequest) SetTenantId(v string) *UpdateRegistryRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateRegistryRequest) SetWorkspaceId(v string) *UpdateRegistryRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateRegistryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateRegistryResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRegistryResponse) GoString() string {
	return s.String()
}

func (s *UpdateRegistryResponse) SetReqMsgId(v string) *UpdateRegistryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRegistryResponse) SetResultCode(v string) *UpdateRegistryResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRegistryResponse) SetResultMsg(v string) *UpdateRegistryResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRegistryResponse) SetData(v bool) *UpdateRegistryResponse {
	s.Data = &v
	return s
}

type ExecApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// param
	Param *ApiflowTestReqVO `json:"param,omitempty" xml:"param,omitempty"`
}

func (s ExecApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecApiflowRequest) GoString() string {
	return s.String()
}

func (s *ExecApiflowRequest) SetAuthToken(v string) *ExecApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecApiflowRequest) SetProductInstanceId(v string) *ExecApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecApiflowRequest) SetTenantId(v string) *ExecApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *ExecApiflowRequest) SetWorkspaceId(v string) *ExecApiflowRequest {
	s.WorkspaceId = &v
	return s
}

func (s *ExecApiflowRequest) SetParam(v *ApiflowTestReqVO) *ExecApiflowRequest {
	s.Param = v
	return s
}

type ExecApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiTestRspVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecApiflowResponse) GoString() string {
	return s.String()
}

func (s *ExecApiflowResponse) SetReqMsgId(v string) *ExecApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecApiflowResponse) SetResultCode(v string) *ExecApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecApiflowResponse) SetResultMsg(v string) *ExecApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecApiflowResponse) SetData(v *ApiTestRspVO) *ExecApiflowResponse {
	s.Data = v
	return s
}

type DeleteApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_id
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s DeleteApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteApiflowRequest) GoString() string {
	return s.String()
}

func (s *DeleteApiflowRequest) SetAuthToken(v string) *DeleteApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteApiflowRequest) SetProductInstanceId(v string) *DeleteApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteApiflowRequest) SetApiId(v string) *DeleteApiflowRequest {
	s.ApiId = &v
	return s
}

func (s *DeleteApiflowRequest) SetTenantId(v string) *DeleteApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *DeleteApiflowRequest) SetWorkspaceId(v string) *DeleteApiflowRequest {
	s.WorkspaceId = &v
	return s
}

type DeleteApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeleteApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteApiflowResponse) GoString() string {
	return s.String()
}

func (s *DeleteApiflowResponse) SetReqMsgId(v string) *DeleteApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteApiflowResponse) SetResultCode(v string) *DeleteApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteApiflowResponse) SetResultMsg(v string) *DeleteApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteApiflowResponse) SetData(v bool) *DeleteApiflowResponse {
	s.Data = &v
	return s
}

type AllApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiflowMachineDefQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s AllApiflowRequest) GoString() string {
	return s.String()
}

func (s *AllApiflowRequest) SetAuthToken(v string) *AllApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *AllApiflowRequest) SetProductInstanceId(v string) *AllApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllApiflowRequest) SetParam(v *ApiflowMachineDefQueryVO) *AllApiflowRequest {
	s.Param = v
	return s
}

func (s *AllApiflowRequest) SetTenantId(v string) *AllApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *AllApiflowRequest) SetWorkspaceId(v string) *AllApiflowRequest {
	s.WorkspaceId = &v
	return s
}

type AllApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ApiflowMachineDefVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s AllApiflowResponse) GoString() string {
	return s.String()
}

func (s *AllApiflowResponse) SetReqMsgId(v string) *AllApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllApiflowResponse) SetResultCode(v string) *AllApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *AllApiflowResponse) SetResultMsg(v string) *AllApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllApiflowResponse) SetData(v []*ApiflowMachineDefVO) *AllApiflowResponse {
	s.Data = v
	return s
}

type ListApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiflowMachineDefQueryVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s ListApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s ListApiflowRequest) GoString() string {
	return s.String()
}

func (s *ListApiflowRequest) SetAuthToken(v string) *ListApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *ListApiflowRequest) SetProductInstanceId(v string) *ListApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListApiflowRequest) SetParam(v *ApiflowMachineDefQueryVO) *ListApiflowRequest {
	s.Param = v
	return s
}

func (s *ListApiflowRequest) SetTenantId(v string) *ListApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *ListApiflowRequest) SetWorkspaceId(v string) *ListApiflowRequest {
	s.WorkspaceId = &v
	return s
}

type ListApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiflowMachineDefPagedListVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ListApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s ListApiflowResponse) GoString() string {
	return s.String()
}

func (s *ListApiflowResponse) SetReqMsgId(v string) *ListApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListApiflowResponse) SetResultCode(v string) *ListApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *ListApiflowResponse) SetResultMsg(v string) *ListApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListApiflowResponse) SetData(v *ApiflowMachineDefPagedListVO) *ListApiflowResponse {
	s.Data = v
	return s
}

type CreateApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s CreateApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateApiflowRequest) GoString() string {
	return s.String()
}

func (s *CreateApiflowRequest) SetAuthToken(v string) *CreateApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateApiflowRequest) SetProductInstanceId(v string) *CreateApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateApiflowRequest) SetParam(v *ApiInfoVO) *CreateApiflowRequest {
	s.Param = v
	return s
}

func (s *CreateApiflowRequest) SetTenantId(v string) *CreateApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *CreateApiflowRequest) SetWorkspaceId(v string) *CreateApiflowRequest {
	s.WorkspaceId = &v
	return s
}

type CreateApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateApiflowResponse) GoString() string {
	return s.String()
}

func (s *CreateApiflowResponse) SetReqMsgId(v string) *CreateApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateApiflowResponse) SetResultCode(v string) *CreateApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateApiflowResponse) SetResultMsg(v string) *CreateApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateApiflowResponse) SetData(v *ApiInfoVO) *CreateApiflowResponse {
	s.Data = v
	return s
}

type GetApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// API标识
	ApiId *string `json:"api_id,omitempty" xml:"api_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// api_type
	ApiType *string `json:"api_type,omitempty" xml:"api_type,omitempty"`
}

func (s GetApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApiflowRequest) GoString() string {
	return s.String()
}

func (s *GetApiflowRequest) SetAuthToken(v string) *GetApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApiflowRequest) SetProductInstanceId(v string) *GetApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApiflowRequest) SetApiId(v string) *GetApiflowRequest {
	s.ApiId = &v
	return s
}

func (s *GetApiflowRequest) SetTenantId(v string) *GetApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *GetApiflowRequest) SetWorkspaceId(v string) *GetApiflowRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetApiflowRequest) SetApiType(v string) *GetApiflowRequest {
	s.ApiType = &v
	return s
}

type GetApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ApiInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApiflowResponse) GoString() string {
	return s.String()
}

func (s *GetApiflowResponse) SetReqMsgId(v string) *GetApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApiflowResponse) SetResultCode(v string) *GetApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApiflowResponse) SetResultMsg(v string) *GetApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApiflowResponse) SetData(v *ApiInfoVO) *GetApiflowResponse {
	s.Data = v
	return s
}

type UpdateApiflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// param
	Param *ApiInfoVO `json:"param,omitempty" xml:"param,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s UpdateApiflowRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiflowRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiflowRequest) SetAuthToken(v string) *UpdateApiflowRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiflowRequest) SetProductInstanceId(v string) *UpdateApiflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateApiflowRequest) SetParam(v *ApiInfoVO) *UpdateApiflowRequest {
	s.Param = v
	return s
}

func (s *UpdateApiflowRequest) SetTenantId(v string) *UpdateApiflowRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateApiflowRequest) SetWorkspaceId(v string) *UpdateApiflowRequest {
	s.WorkspaceId = &v
	return s
}

type UpdateApiflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateApiflowResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiflowResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiflowResponse) SetReqMsgId(v string) *UpdateApiflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiflowResponse) SetResultCode(v string) *UpdateApiflowResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiflowResponse) SetResultMsg(v string) *UpdateApiflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiflowResponse) SetData(v bool) *UpdateApiflowResponse {
	s.Data = &v
	return s
}

type GetApimodelJsonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api_model_id
	ApiModelId *string `json:"api_model_id,omitempty" xml:"api_model_id,omitempty" require:"true"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// model_type
	ModelType *string `json:"model_type,omitempty" xml:"model_type,omitempty"`
	// 是否使用默认值
	UseDefault *bool `json:"use_default,omitempty" xml:"use_default,omitempty"`
}

func (s GetApimodelJsonRequest) String() string {
	return tea.Prettify(s)
}

func (s GetApimodelJsonRequest) GoString() string {
	return s.String()
}

func (s *GetApimodelJsonRequest) SetAuthToken(v string) *GetApimodelJsonRequest {
	s.AuthToken = &v
	return s
}

func (s *GetApimodelJsonRequest) SetProductInstanceId(v string) *GetApimodelJsonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetApimodelJsonRequest) SetApiModelId(v string) *GetApimodelJsonRequest {
	s.ApiModelId = &v
	return s
}

func (s *GetApimodelJsonRequest) SetTenantId(v string) *GetApimodelJsonRequest {
	s.TenantId = &v
	return s
}

func (s *GetApimodelJsonRequest) SetWorkspaceId(v string) *GetApimodelJsonRequest {
	s.WorkspaceId = &v
	return s
}

func (s *GetApimodelJsonRequest) SetModelType(v string) *GetApimodelJsonRequest {
	s.ModelType = &v
	return s
}

func (s *GetApimodelJsonRequest) SetUseDefault(v bool) *GetApimodelJsonRequest {
	s.UseDefault = &v
	return s
}

type GetApimodelJsonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// req_params
	ReqParams []*ApiParamVO `json:"req_params,omitempty" xml:"req_params,omitempty" type:"Repeated"`
}

func (s GetApimodelJsonResponse) String() string {
	return tea.Prettify(s)
}

func (s GetApimodelJsonResponse) GoString() string {
	return s.String()
}

func (s *GetApimodelJsonResponse) SetReqMsgId(v string) *GetApimodelJsonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetApimodelJsonResponse) SetResultCode(v string) *GetApimodelJsonResponse {
	s.ResultCode = &v
	return s
}

func (s *GetApimodelJsonResponse) SetResultMsg(v string) *GetApimodelJsonResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetApimodelJsonResponse) SetData(v string) *GetApimodelJsonResponse {
	s.Data = &v
	return s
}

func (s *GetApimodelJsonResponse) SetReqParams(v []*ApiParamVO) *GetApimodelJsonResponse {
	s.ReqParams = v
	return s
}

type ReplaceApimodelJsonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// ApiTestParamVO
	Param []*ApiTestParamVO `json:"param,omitempty" xml:"param,omitempty" type:"Repeated"`
	// json
	Json *string `json:"json,omitempty" xml:"json,omitempty"`
}

func (s ReplaceApimodelJsonRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceApimodelJsonRequest) GoString() string {
	return s.String()
}

func (s *ReplaceApimodelJsonRequest) SetAuthToken(v string) *ReplaceApimodelJsonRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceApimodelJsonRequest) SetProductInstanceId(v string) *ReplaceApimodelJsonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceApimodelJsonRequest) SetWorkspaceId(v string) *ReplaceApimodelJsonRequest {
	s.WorkspaceId = &v
	return s
}

func (s *ReplaceApimodelJsonRequest) SetTenantId(v string) *ReplaceApimodelJsonRequest {
	s.TenantId = &v
	return s
}

func (s *ReplaceApimodelJsonRequest) SetParam(v []*ApiTestParamVO) *ReplaceApimodelJsonRequest {
	s.Param = v
	return s
}

func (s *ReplaceApimodelJsonRequest) SetJson(v string) *ReplaceApimodelJsonRequest {
	s.Json = &v
	return s
}

type ReplaceApimodelJsonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ReplaceApimodelJsonResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceApimodelJsonResponse) GoString() string {
	return s.String()
}

func (s *ReplaceApimodelJsonResponse) SetReqMsgId(v string) *ReplaceApimodelJsonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceApimodelJsonResponse) SetResultCode(v string) *ReplaceApimodelJsonResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceApimodelJsonResponse) SetResultMsg(v string) *ReplaceApimodelJsonResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReplaceApimodelJsonResponse) SetData(v string) *ReplaceApimodelJsonResponse {
	s.Data = &v
	return s
}

type GetGwconfigTripleswitchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s GetGwconfigTripleswitchRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigTripleswitchRequest) GoString() string {
	return s.String()
}

func (s *GetGwconfigTripleswitchRequest) SetAuthToken(v string) *GetGwconfigTripleswitchRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGwconfigTripleswitchRequest) SetProductInstanceId(v string) *GetGwconfigTripleswitchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGwconfigTripleswitchRequest) SetTenantId(v string) *GetGwconfigTripleswitchRequest {
	s.TenantId = &v
	return s
}

func (s *GetGwconfigTripleswitchRequest) SetWorkspaceId(v string) *GetGwconfigTripleswitchRequest {
	s.WorkspaceId = &v
	return s
}

type GetGwconfigTripleswitchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetGwconfigTripleswitchResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGwconfigTripleswitchResponse) GoString() string {
	return s.String()
}

func (s *GetGwconfigTripleswitchResponse) SetReqMsgId(v string) *GetGwconfigTripleswitchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGwconfigTripleswitchResponse) SetResultCode(v string) *GetGwconfigTripleswitchResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGwconfigTripleswitchResponse) SetResultMsg(v string) *GetGwconfigTripleswitchResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGwconfigTripleswitchResponse) SetData(v bool) *GetGwconfigTripleswitchResponse {
	s.Data = &v
	return s
}

type QueryGwconfigTripleswitchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// workspace_id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryGwconfigTripleswitchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwconfigTripleswitchRequest) GoString() string {
	return s.String()
}

func (s *QueryGwconfigTripleswitchRequest) SetAuthToken(v string) *QueryGwconfigTripleswitchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwconfigTripleswitchRequest) SetProductInstanceId(v string) *QueryGwconfigTripleswitchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwconfigTripleswitchRequest) SetWorkspaceId(v string) *QueryGwconfigTripleswitchRequest {
	s.WorkspaceId = &v
	return s
}

func (s *QueryGwconfigTripleswitchRequest) SetTenantId(v string) *QueryGwconfigTripleswitchRequest {
	s.TenantId = &v
	return s
}

type QueryGwconfigTripleswitchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryGwconfigTripleswitchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwconfigTripleswitchResponse) GoString() string {
	return s.String()
}

func (s *QueryGwconfigTripleswitchResponse) SetReqMsgId(v string) *QueryGwconfigTripleswitchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwconfigTripleswitchResponse) SetResultCode(v string) *QueryGwconfigTripleswitchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwconfigTripleswitchResponse) SetResultMsg(v string) *QueryGwconfigTripleswitchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwconfigTripleswitchResponse) SetData(v bool) *QueryGwconfigTripleswitchResponse {
	s.Data = &v
	return s
}

type AllGwconfigRegionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间标识
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AllGwconfigRegionRequest) String() string {
	return tea.Prettify(s)
}

func (s AllGwconfigRegionRequest) GoString() string {
	return s.String()
}

func (s *AllGwconfigRegionRequest) SetAuthToken(v string) *AllGwconfigRegionRequest {
	s.AuthToken = &v
	return s
}

func (s *AllGwconfigRegionRequest) SetProductInstanceId(v string) *AllGwconfigRegionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllGwconfigRegionRequest) SetTenantId(v string) *AllGwconfigRegionRequest {
	s.TenantId = &v
	return s
}

func (s *AllGwconfigRegionRequest) SetWorkspaceId(v string) *AllGwconfigRegionRequest {
	s.WorkspaceId = &v
	return s
}

type AllGwconfigRegionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s AllGwconfigRegionResponse) String() string {
	return tea.Prettify(s)
}

func (s AllGwconfigRegionResponse) GoString() string {
	return s.String()
}

func (s *AllGwconfigRegionResponse) SetReqMsgId(v string) *AllGwconfigRegionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllGwconfigRegionResponse) SetResultCode(v string) *AllGwconfigRegionResponse {
	s.ResultCode = &v
	return s
}

func (s *AllGwconfigRegionResponse) SetResultMsg(v string) *AllGwconfigRegionResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllGwconfigRegionResponse) SetData(v []*string) *AllGwconfigRegionResponse {
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
				"sdk_version":      tea.String("1.1.312"),
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
 * Description: 创建API分组
 * Summary: 创建API分组
 */
func (client *Client) CreateApigroup(request *CreateApigroupRequest) (_result *CreateApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApigroupResponse{}
	_body, _err := client.CreateApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建API分组
 * Summary: 创建API分组
 */
func (client *Client) CreateApigroupEx(request *CreateApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询API分组列表
 * Summary: 查询API分组列表
 */
func (client *Client) AllApigroup(request *AllApigroupRequest) (_result *AllApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApigroupResponse{}
	_body, _err := client.AllApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询API分组列表
 * Summary: 查询API分组列表
 */
func (client *Client) AllApigroupEx(request *AllApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询API分组分页列表
 * Summary: 查询API分组分页列表
 */
func (client *Client) ListApigroup(request *ListApigroupRequest) (_result *ListApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApigroupResponse{}
	_body, _err := client.ListApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询API分组分页列表
 * Summary: 查询API分组分页列表
 */
func (client *Client) ListApigroupEx(request *ListApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建后端集群
 * Summary: 创建后端集群
 */
func (client *Client) CreateSys(request *CreateSysRequest) (_result *CreateSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSysResponse{}
	_body, _err := client.CreateSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建后端集群
 * Summary: 创建后端集群
 */
func (client *Client) CreateSysEx(request *CreateSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询后端集群列表
 * Summary: 查询后端集群列表
 */
func (client *Client) AllSys(request *AllSysRequest) (_result *AllSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllSysResponse{}
	_body, _err := client.AllSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询后端集群列表
 * Summary: 查询后端集群列表
 */
func (client *Client) AllSysEx(request *AllSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询后端集群分页列表
 * Summary: 查询后端集群分页列表
 */
func (client *Client) ListSys(request *ListSysRequest) (_result *ListSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListSysResponse{}
	_body, _err := client.ListSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询后端集群分页列表
 * Summary: 查询后端集群分页列表
 */
func (client *Client) ListSysEx(request *ListSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询API分组
 * Summary: 通过ID查询API分组
 */
func (client *Client) GetApigroup(request *GetApigroupRequest) (_result *GetApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApigroupResponse{}
	_body, _err := client.GetApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询API分组
 * Summary: 通过ID查询API分组
 */
func (client *Client) GetApigroupEx(request *GetApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新API分组
 * Summary: 更新API分组
 */
func (client *Client) UpdateApigroup(request *UpdateApigroupRequest) (_result *UpdateApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApigroupResponse{}
	_body, _err := client.UpdateApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新API分组
 * Summary: 更新API分组
 */
func (client *Client) UpdateApigroupEx(request *UpdateApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除API分组
 * Summary: 删除API分组
 */
func (client *Client) DeleteApigroup(request *DeleteApigroupRequest) (_result *DeleteApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApigroupResponse{}
	_body, _err := client.DeleteApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除API分组
 * Summary: 删除API分组
 */
func (client *Client) DeleteApigroupEx(request *DeleteApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建API信息
 * Summary: 创建API信息
 */
func (client *Client) CreateApi(request *CreateApiRequest) (_result *CreateApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiResponse{}
	_body, _err := client.CreateApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建API信息
 * Summary: 创建API信息
 */
func (client *Client) CreateApiEx(request *CreateApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新API信息
 * Summary: 更新API信息
 */
func (client *Client) UpdateApi(request *UpdateApiRequest) (_result *UpdateApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiResponse{}
	_body, _err := client.UpdateApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新API信息
 * Summary: 更新API信息
 */
func (client *Client) UpdateApiEx(request *UpdateApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询API列表
 * Summary: 查询API列表
 */
func (client *Client) AllApi(request *AllApiRequest) (_result *AllApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApiResponse{}
	_body, _err := client.AllApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询API列表
 * Summary: 查询API列表
 */
func (client *Client) AllApiEx(request *AllApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询API分页列表
 * Summary: 查询API分页列表
 */
func (client *Client) ListApi(request *ListApiRequest) (_result *ListApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApiResponse{}
	_body, _err := client.ListApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询API分页列表
 * Summary: 查询API分页列表
 */
func (client *Client) ListApiEx(request *ListApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询API
 * Summary: 通过ID查询API
 */
func (client *Client) GetApi(request *GetApiRequest) (_result *GetApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiResponse{}
	_body, _err := client.GetApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询API
 * Summary: 通过ID查询API
 */
func (client *Client) GetApiEx(request *GetApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建App
 * Summary: 创建App
 */
func (client *Client) CreateApp(request *CreateAppRequest) (_result *CreateAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppResponse{}
	_body, _err := client.CreateAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建App
 * Summary: 创建App
 */
func (client *Client) CreateAppEx(request *CreateAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新App信息
 * Summary: 更新App信息
 */
func (client *Client) UpdateApp(request *UpdateAppRequest) (_result *UpdateAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAppResponse{}
	_body, _err := client.UpdateAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新App信息
 * Summary: 更新App信息
 */
func (client *Client) UpdateAppEx(request *UpdateAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询App列表
 * Summary: 查询App列表
 */
func (client *Client) AllApp(request *AllAppRequest) (_result *AllAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAppResponse{}
	_body, _err := client.AllAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询App列表
 * Summary: 查询App列表
 */
func (client *Client) AllAppEx(request *AllAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询App分页列表
 * Summary: 查询App分页列表
 */
func (client *Client) ListApp(request *ListAppRequest) (_result *ListAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppResponse{}
	_body, _err := client.ListAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询App分页列表
 * Summary: 查询App分页列表
 */
func (client *Client) ListAppEx(request *ListAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询App
 * Summary: 通过ID查询App
 */
func (client *Client) GetApp(request *GetAppRequest) (_result *GetAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAppResponse{}
	_body, _err := client.GetAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询App
 * Summary: 通过ID查询App
 */
func (client *Client) GetAppEx(request *GetAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建授权App
 * Summary: 创建授权App
 */
func (client *Client) CreateAuthapp(request *CreateAuthappRequest) (_result *CreateAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAuthappResponse{}
	_body, _err := client.CreateAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建授权App
 * Summary: 创建授权App
 */
func (client *Client) CreateAuthappEx(request *CreateAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新授权App
 * Summary: 更新授权App
 */
func (client *Client) UpdateAuthapp(request *UpdateAuthappRequest) (_result *UpdateAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAuthappResponse{}
	_body, _err := client.UpdateAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新授权App
 * Summary: 更新授权App
 */
func (client *Client) UpdateAuthappEx(request *UpdateAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除授权App
 * Summary: 删除授权App
 */
func (client *Client) DeleteAuthapp(request *DeleteAuthappRequest) (_result *DeleteAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAuthappResponse{}
	_body, _err := client.DeleteAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除授权App
 * Summary: 删除授权App
 */
func (client *Client) DeleteAuthappEx(request *DeleteAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权App列表
 * Summary: 查询授权App列表
 */
func (client *Client) AllAuthapp(request *AllAuthappRequest) (_result *AllAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAuthappResponse{}
	_body, _err := client.AllAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权App列表
 * Summary: 查询授权App列表
 */
func (client *Client) AllAuthappEx(request *AllAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询获取授权App分页列表
 * Summary: 查询授权App分页列表
 */
func (client *Client) ListAuthapp(request *ListAuthappRequest) (_result *ListAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthappResponse{}
	_body, _err := client.ListAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询获取授权App分页列表
 * Summary: 查询授权App分页列表
 */
func (client *Client) ListAuthappEx(request *ListAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询授权App
 * Summary: 通过ID查询授权App
 */
func (client *Client) GetAuthapp(request *GetAuthappRequest) (_result *GetAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAuthappResponse{}
	_body, _err := client.GetAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询授权App
 * Summary: 通过ID查询授权App
 */
func (client *Client) GetAuthappEx(request *GetAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建路由规则
 * Summary: 创建路由规则
 */
func (client *Client) CreateRouter(request *CreateRouterRequest) (_result *CreateRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRouterResponse{}
	_body, _err := client.CreateRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建路由规则
 * Summary: 创建路由规则
 */
func (client *Client) CreateRouterEx(request *CreateRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新路由规则
 * Summary: 更新路由规则
 */
func (client *Client) UpdateRouter(request *UpdateRouterRequest) (_result *UpdateRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRouterResponse{}
	_body, _err := client.UpdateRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新路由规则
 * Summary: 更新路由规则
 */
func (client *Client) UpdateRouterEx(request *UpdateRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID删除路由规则
 * Summary: 通过ID删除路由规则
 */
func (client *Client) DeleteRouter(request *DeleteRouterRequest) (_result *DeleteRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRouterResponse{}
	_body, _err := client.DeleteRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID删除路由规则
 * Summary: 通过ID删除路由规则
 */
func (client *Client) DeleteRouterEx(request *DeleteRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询路由信息列表
 * Summary: 查询路由信息列表
 */
func (client *Client) AllRouter(request *AllRouterRequest) (_result *AllRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllRouterResponse{}
	_body, _err := client.AllRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询路由信息列表
 * Summary: 查询路由信息列表
 */
func (client *Client) AllRouterEx(request *AllRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询路由规则分页列表
 * Summary: 查询路由规则分页列表
 */
func (client *Client) ListRouter(request *ListRouterRequest) (_result *ListRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRouterResponse{}
	_body, _err := client.ListRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询路由规则分页列表
 * Summary: 查询路由规则分页列表
 */
func (client *Client) ListRouterEx(request *ListRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询路由规则
 * Summary: 通过ID查询路由规则
 */
func (client *Client) GetRouter(request *GetRouterRequest) (_result *GetRouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRouterResponse{}
	_body, _err := client.GetRouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询路由规则
 * Summary: 通过ID查询路由规则
 */
func (client *Client) GetRouterEx(request *GetRouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新后端集群
 * Summary: 更新后端集群
 */
func (client *Client) UpdateSys(request *UpdateSysRequest) (_result *UpdateSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateSysResponse{}
	_body, _err := client.UpdateSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新后端集群
 * Summary: 更新后端集群
 */
func (client *Client) UpdateSysEx(request *UpdateSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID删除后端集群
 * Summary: 通过ID删除后端集群
 */
func (client *Client) DeleteSys(request *DeleteSysRequest) (_result *DeleteSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteSysResponse{}
	_body, _err := client.DeleteSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID删除后端集群
 * Summary: 通过ID删除后端集群
 */
func (client *Client) DeleteSysEx(request *DeleteSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询后端集群
 * Summary: 通过ID查询后端集群
 */
func (client *Client) GetSys(request *GetSysRequest) (_result *GetSysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSysResponse{}
	_body, _err := client.GetSysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询后端集群
 * Summary: 通过ID查询后端集群
 */
func (client *Client) GetSysEx(request *GetSysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过API分组ID查询API列表
 * Summary: 通过API分组ID查询API列表
 */
func (client *Client) AllApigroupApi(request *AllApigroupApiRequest) (_result *AllApigroupApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApigroupApiResponse{}
	_body, _err := client.AllApigroupApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过API分组ID查询API列表
 * Summary: 通过API分组ID查询API列表
 */
func (client *Client) AllApigroupApiEx(request *AllApigroupApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApigroupApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApigroupApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID删除App
 * Summary: 通过ID删除App
 */
func (client *Client) DeleteApp(request *DeleteAppRequest) (_result *DeleteAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAppResponse{}
	_body, _err := client.DeleteAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID删除App
 * Summary: 通过ID删除App
 */
func (client *Client) DeleteAppEx(request *DeleteAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID删除API
 * Summary: 通过ID删除API
 */
func (client *Client) DeleteApi(request *DeleteApiRequest) (_result *DeleteApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApiResponse{}
	_body, _err := client.DeleteApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID删除API
 * Summary: 通过ID删除API
 */
func (client *Client) DeleteApiEx(request *DeleteApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过API分组ID查询API分页列表
 * Summary: 通过API分组ID查询API分页列表
 */
func (client *Client) ListApigroupApi(request *ListApigroupApiRequest) (_result *ListApigroupApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApigroupApiResponse{}
	_body, _err := client.ListApigroupApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过API分组ID查询API分页列表
 * Summary: 通过API分组ID查询API分页列表
 */
func (client *Client) ListApigroupApiEx(request *ListApigroupApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApigroupApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApigroupApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过授权App ID查询API分页列表
 * Summary: 通过授权App ID查询API分页列表
 */
func (client *Client) ListAuthappApi(request *ListAuthappApiRequest) (_result *ListAuthappApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthappApiResponse{}
	_body, _err := client.ListAuthappApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过授权App ID查询API分页列表
 * Summary: 通过授权App ID查询API分页列表
 */
func (client *Client) ListAuthappApiEx(request *ListAuthappApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthappApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthappApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过后端集群ID查询API列表
 * Summary: 通过后端集群ID查询API列表
 */
func (client *Client) AllSysApi(request *AllSysApiRequest) (_result *AllSysApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllSysApiResponse{}
	_body, _err := client.AllSysApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过后端集群ID查询API列表
 * Summary: 通过后端集群ID查询API列表
 */
func (client *Client) AllSysApiEx(request *AllSysApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllSysApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllSysApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过后端集群ID查询API分页列表
 * Summary: 通过后端集群ID查询API分页列表
 */
func (client *Client) ListSysApi(request *ListSysApiRequest) (_result *ListSysApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListSysApiResponse{}
	_body, _err := client.ListSysApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过后端集群ID查询API分页列表
 * Summary: 通过后端集群ID查询API分页列表
 */
func (client *Client) ListSysApiEx(request *ListSysApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListSysApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListSysApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过路由规则ID查询API列表
 * Summary: 通过路由规则ID查询API列表
 */
func (client *Client) AllRouterApi(request *AllRouterApiRequest) (_result *AllRouterApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllRouterApiResponse{}
	_body, _err := client.AllRouterApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过路由规则ID查询API列表
 * Summary: 通过路由规则ID查询API列表
 */
func (client *Client) AllRouterApiEx(request *AllRouterApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllRouterApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllRouterApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过路由规则ID查询API分页列表
 * Summary: 通过路由规则ID查询API分页列表
 */
func (client *Client) ListRouterApi(request *ListRouterApiRequest) (_result *ListRouterApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRouterApiResponse{}
	_body, _err := client.ListRouterApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过路由规则ID查询API分页列表
 * Summary: 通过路由规则ID查询API分页列表
 */
func (client *Client) ListRouterApiEx(request *ListRouterApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRouterApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRouterApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.router.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新API版本号
 * Summary: 更新API版本号
 */
func (client *Client) UpdateApiVersionno(request *UpdateApiVersionnoRequest) (_result *UpdateApiVersionnoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiVersionnoResponse{}
	_body, _err := client.UpdateApiVersionnoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新API版本号
 * Summary: 更新API版本号
 */
func (client *Client) UpdateApiVersionnoEx(request *UpdateApiVersionnoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiVersionnoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiVersionnoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.versionno.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 下线API
 * Summary: 下线API
 */
func (client *Client) OfflineApi(request *OfflineApiRequest) (_result *OfflineApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineApiResponse{}
	_body, _err := client.OfflineApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 下线API
 * Summary: 下线API
 */
func (client *Client) OfflineApiEx(request *OfflineApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过授权App ID查询API列表
 * Summary: 通过授权App ID查询API列表
 */
func (client *Client) AllAuthappApi(request *AllAuthappApiRequest) (_result *AllAuthappApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAuthappApiResponse{}
	_body, _err := client.AllAuthappApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过授权App ID查询API列表
 * Summary: 通过授权App ID查询API列表
 */
func (client *Client) AllAuthappApiEx(request *AllAuthappApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAuthappApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAuthappApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api挂载授权App
 * Summary: api挂载授权App
 */
func (client *Client) MountApiAuthapp(request *MountApiAuthappRequest) (_result *MountApiAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountApiAuthappResponse{}
	_body, _err := client.MountApiAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api挂载授权App
 * Summary: api挂载授权App
 */
func (client *Client) MountApiAuthappEx(request *MountApiAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountApiAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountApiAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapp.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上线API
 * Summary: 上线API
 */
func (client *Client) OnlineApi(request *OnlineApiRequest) (_result *OnlineApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineApiResponse{}
	_body, _err := client.OnlineApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上线API
 * Summary: 上线API
 */
func (client *Client) OnlineApiEx(request *OnlineApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过API ID查询授权App列表
 * Summary: 通过API ID查询授权App列表
 */
func (client *Client) AllApiAuthapp(request *AllApiAuthappRequest) (_result *AllApiAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApiAuthappResponse{}
	_body, _err := client.AllApiAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过API ID查询授权App列表
 * Summary: 通过API ID查询授权App列表
 */
func (client *Client) AllApiAuthappEx(request *AllApiAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApiAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApiAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapp.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过API ID查询授权App分页列表
 * Summary: 通过API ID查询授权App分页列表
 */
func (client *Client) ListApiAuthapp(request *ListApiAuthappRequest) (_result *ListApiAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApiAuthappResponse{}
	_body, _err := client.ListApiAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过API ID查询授权App分页列表
 * Summary: 通过API ID查询授权App分页列表
 */
func (client *Client) ListApiAuthappEx(request *ListApiAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApiAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApiAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapp.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过App ID查询API列表
 * Summary: 通过App ID查询API列表
 */
func (client *Client) AllAppApi(request *AllAppApiRequest) (_result *AllAppApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAppApiResponse{}
	_body, _err := client.AllAppApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过App ID查询API列表
 * Summary: 通过App ID查询API列表
 */
func (client *Client) AllAppApiEx(request *AllAppApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAppApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAppApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过App ID查询API分页列表
 * Summary: 通过App ID查询API分页列表
 */
func (client *Client) ListAppApi(request *ListAppApiRequest) (_result *ListAppApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppApiResponse{}
	_body, _err := client.ListAppApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过App ID查询API分页列表
 * Summary: 通过App ID查询API分页列表
 */
func (client *Client) ListAppApiEx(request *ListAppApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取随机密钥
 * Summary: 获取随机密钥
 */
func (client *Client) GetCommonRandomaksk(request *GetCommonRandomakskRequest) (_result *GetCommonRandomakskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCommonRandomakskResponse{}
	_body, _err := client.GetCommonRandomakskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取随机密钥
 * Summary: 获取随机密钥
 */
func (client *Client) GetCommonRandomakskEx(request *GetCommonRandomakskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCommonRandomakskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCommonRandomakskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.common.randomaksk.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建联系方式
 * Summary: 创建联系方式
 */
func (client *Client) CreateContact(request *CreateContactRequest) (_result *CreateContactResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateContactResponse{}
	_body, _err := client.CreateContactEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建联系方式
 * Summary: 创建联系方式
 */
func (client *Client) CreateContactEx(request *CreateContactRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateContactResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateContactResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新联系方式
 * Summary: 更新联系方式
 */
func (client *Client) UpdateContact(request *UpdateContactRequest) (_result *UpdateContactResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateContactResponse{}
	_body, _err := client.UpdateContactEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新联系方式
 * Summary: 更新联系方式
 */
func (client *Client) UpdateContactEx(request *UpdateContactRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateContactResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateContactResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除联系方式
 * Summary: 删除联系方式
 */
func (client *Client) DeleteContact(request *DeleteContactRequest) (_result *DeleteContactResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteContactResponse{}
	_body, _err := client.DeleteContactEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除联系方式
 * Summary: 删除联系方式
 */
func (client *Client) DeleteContactEx(request *DeleteContactRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteContactResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteContactResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询联系方式
 * Summary: 通过ID查询联系方式
 */
func (client *Client) GetContact(request *GetContactRequest) (_result *GetContactResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetContactResponse{}
	_body, _err := client.GetContactEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询联系方式
 * Summary: 通过ID查询联系方式
 */
func (client *Client) GetContactEx(request *GetContactRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetContactResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetContactResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询联系方式分页列表
 * Summary: 查询联系方式分页列表
 */
func (client *Client) ListContact(request *ListContactRequest) (_result *ListContactResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContactResponse{}
	_body, _err := client.ListContactEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询联系方式分页列表
 * Summary: 查询联系方式分页列表
 */
func (client *Client) ListContactEx(request *ListContactRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContactResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContactResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过授权App ID查询联系方式列表
 * Summary: 通过授权App ID查询联系方式列表
 */
func (client *Client) ListContactAuthapp(request *ListContactAuthappRequest) (_result *ListContactAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListContactAuthappResponse{}
	_body, _err := client.ListContactAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过授权App ID查询联系方式列表
 * Summary: 通过授权App ID查询联系方式列表
 */
func (client *Client) ListContactAuthappEx(request *ListContactAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListContactAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListContactAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.contact.authapp.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api解除授权App
 * Summary: api解除授权App
 */
func (client *Client) UnmountApiAuthapp(request *UnmountApiAuthappRequest) (_result *UnmountApiAuthappResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountApiAuthappResponse{}
	_body, _err := client.UnmountApiAuthappEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api解除授权App
 * Summary: api解除授权App
 */
func (client *Client) UnmountApiAuthappEx(request *UnmountApiAuthappRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountApiAuthappResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountApiAuthappResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapp.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取指定版本的api
 * Summary: 获取指定版本的api
 */
func (client *Client) GetApiVersionapi(request *GetApiVersionapiRequest) (_result *GetApiVersionapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiVersionapiResponse{}
	_body, _err := client.GetApiVersionapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取指定版本的api
 * Summary: 获取指定版本的api
 */
func (client *Client) GetApiVersionapiEx(request *GetApiVersionapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiVersionapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiVersionapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.versionapi.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建cors
 * Summary: 创建cors
 */
func (client *Client) CreateCors(request *CreateCorsRequest) (_result *CreateCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCorsResponse{}
	_body, _err := client.CreateCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建cors
 * Summary: 创建cors
 */
func (client *Client) CreateCorsEx(request *CreateCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑cors
 * Summary: 编辑cors
 */
func (client *Client) UpdateCors(request *UpdateCorsRequest) (_result *UpdateCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCorsResponse{}
	_body, _err := client.UpdateCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑cors
 * Summary: 编辑cors
 */
func (client *Client) UpdateCorsEx(request *UpdateCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除cors
 * Summary: 删除cors
 */
func (client *Client) DeleteCors(request *DeleteCorsRequest) (_result *DeleteCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteCorsResponse{}
	_body, _err := client.DeleteCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除cors
 * Summary: 删除cors
 */
func (client *Client) DeleteCorsEx(request *DeleteCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询cors列表
 * Summary: 查询cors列表
 */
func (client *Client) AllCors(request *AllCorsRequest) (_result *AllCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllCorsResponse{}
	_body, _err := client.AllCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询cors列表
 * Summary: 查询cors列表
 */
func (client *Client) AllCorsEx(request *AllCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询cors分页列表
 * Summary: 查询cors分页列表
 */
func (client *Client) ListCors(request *ListCorsRequest) (_result *ListCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCorsResponse{}
	_body, _err := client.ListCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询cors分页列表
 * Summary: 查询cors分页列表
 */
func (client *Client) ListCorsEx(request *ListCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据ID查询cors
 * Summary: 根据ID查询cors
 */
func (client *Client) GetCors(request *GetCorsRequest) (_result *GetCorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCorsResponse{}
	_body, _err := client.GetCorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据ID查询cors
 * Summary: 根据ID查询cors
 */
func (client *Client) GetCorsEx(request *GetCorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据 cors ID 查询 API 列表
 * Summary: 根据 cors ID 查询 API 列表
 */
func (client *Client) AllCorsApi(request *AllCorsApiRequest) (_result *AllCorsApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllCorsApiResponse{}
	_body, _err := client.AllCorsApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据 cors ID 查询 API 列表
 * Summary: 根据 cors ID 查询 API 列表
 */
func (client *Client) AllCorsApiEx(request *AllCorsApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllCorsApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllCorsApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据cors ID查询API分页列表
 * Summary: 根据cors ID查询API分页列表
 */
func (client *Client) ListCorsApi(request *ListCorsApiRequest) (_result *ListCorsApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCorsApiResponse{}
	_body, _err := client.ListCorsApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据cors ID查询API分页列表
 * Summary: 根据cors ID查询API分页列表
 */
func (client *Client) ListCorsApiEx(request *ListCorsApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCorsApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCorsApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据cors ID绑定API
 * Summary: 根据cors ID绑定API
 */
func (client *Client) MountCorsApi(request *MountCorsApiRequest) (_result *MountCorsApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountCorsApiResponse{}
	_body, _err := client.MountCorsApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据cors ID绑定API
 * Summary: 根据cors ID绑定API
 */
func (client *Client) MountCorsApiEx(request *MountCorsApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountCorsApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountCorsApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.api.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据cors ID 解绑API
 * Summary: 根据cors ID 解绑API
 */
func (client *Client) UnmountCorsApi(request *UnmountCorsApiRequest) (_result *UnmountCorsApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountCorsApiResponse{}
	_body, _err := client.UnmountCorsApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据cors ID 解绑API
 * Summary: 根据cors ID 解绑API
 */
func (client *Client) UnmountCorsApiEx(request *UnmountCorsApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountCorsApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountCorsApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.cors.api.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: API调试
 * Summary: API调试
 */
func (client *Client) ExecTestHttp(request *ExecTestHttpRequest) (_result *ExecTestHttpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecTestHttpResponse{}
	_body, _err := client.ExecTestHttpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: API调试
 * Summary: API调试
 */
func (client *Client) ExecTestHttpEx(request *ExecTestHttpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecTestHttpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecTestHttpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.test.http.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新授权应用限流
 * Summary: 更新授权应用限流
 */
func (client *Client) UpdateApiAuthapplimit(request *UpdateApiAuthapplimitRequest) (_result *UpdateApiAuthapplimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiAuthapplimitResponse{}
	_body, _err := client.UpdateApiAuthapplimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新授权应用限流
 * Summary: 更新授权应用限流
 */
func (client *Client) UpdateApiAuthapplimitEx(request *UpdateApiAuthapplimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiAuthapplimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiAuthapplimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapplimit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权应用限制
 * Summary: 查询授权应用限制
 */
func (client *Client) GetApiAuthapplimit(request *GetApiAuthapplimitRequest) (_result *GetApiAuthapplimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiAuthapplimitResponse{}
	_body, _err := client.GetApiAuthapplimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权应用限制
 * Summary: 查询授权应用限制
 */
func (client *Client) GetApiAuthapplimitEx(request *GetApiAuthapplimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiAuthapplimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiAuthapplimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.authapplimit.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑限流配置
 * Summary: 编辑限流配置
 */
func (client *Client) UpdateApiLimitconfig(request *UpdateApiLimitconfigRequest) (_result *UpdateApiLimitconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiLimitconfigResponse{}
	_body, _err := client.UpdateApiLimitconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑限流配置
 * Summary: 编辑限流配置
 */
func (client *Client) UpdateApiLimitconfigEx(request *UpdateApiLimitconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiLimitconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiLimitconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.limitconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新缓存信息
 * Summary: 更新缓存信息
 */
func (client *Client) UpdateApiCacheinfo(request *UpdateApiCacheinfoRequest) (_result *UpdateApiCacheinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiCacheinfoResponse{}
	_body, _err := client.UpdateApiCacheinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新缓存信息
 * Summary: 更新缓存信息
 */
func (client *Client) UpdateApiCacheinfoEx(request *UpdateApiCacheinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiCacheinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiCacheinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.cacheinfo.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询监控
 * Summary: 查询监控
 */
func (client *Client) QueryMonitor(request *QueryMonitorRequest) (_result *QueryMonitorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMonitorResponse{}
	_body, _err := client.QueryMonitorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询监控
 * Summary: 查询监控
 */
func (client *Client) QueryMonitorEx(request *QueryMonitorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMonitorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMonitorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.monitor.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询结果码
 * Summary: 查询结果码
 */
func (client *Client) QueryResultcode(request *QueryResultcodeRequest) (_result *QueryResultcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryResultcodeResponse{}
	_body, _err := client.QueryResultcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询结果码
 * Summary: 查询结果码
 */
func (client *Client) QueryResultcodeEx(request *QueryResultcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryResultcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryResultcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.resultcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上线指定版本api
 * Summary: 上线指定版本api
 */
func (client *Client) OnlineApiVersion(request *OnlineApiVersionRequest) (_result *OnlineApiVersionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineApiVersionResponse{}
	_body, _err := client.OnlineApiVersionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上线指定版本api
 * Summary: 上线指定版本api
 */
func (client *Client) OnlineApiVersionEx(request *OnlineApiVersionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineApiVersionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineApiVersionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.version.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建LDC规则
 * Summary: 创建LDC规则
 */
func (client *Client) CreateLdc(request *CreateLdcRequest) (_result *CreateLdcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLdcResponse{}
	_body, _err := client.CreateLdcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建LDC规则
 * Summary: 创建LDC规则
 */
func (client *Client) CreateLdcEx(request *CreateLdcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLdcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLdcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.ldc.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改 LDC规则
 * Summary: 修改 LDC规则
 */
func (client *Client) UpdateLdc(request *UpdateLdcRequest) (_result *UpdateLdcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateLdcResponse{}
	_body, _err := client.UpdateLdcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改 LDC规则
 * Summary: 修改 LDC规则
 */
func (client *Client) UpdateLdcEx(request *UpdateLdcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateLdcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateLdcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.ldc.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除LDC规则
 * Summary: 删除LDC规则
 */
func (client *Client) DeleteLdc(request *DeleteLdcRequest) (_result *DeleteLdcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteLdcResponse{}
	_body, _err := client.DeleteLdcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除LDC规则
 * Summary: 删除LDC规则
 */
func (client *Client) DeleteLdcEx(request *DeleteLdcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteLdcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteLdcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.ldc.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询ldc规则
 * Summary: 查询ldc规则
 */
func (client *Client) GetLdc(request *GetLdcRequest) (_result *GetLdcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetLdcResponse{}
	_body, _err := client.GetLdcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询ldc规则
 * Summary: 查询ldc规则
 */
func (client *Client) GetLdcEx(request *GetLdcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetLdcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetLdcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.ldc.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保存ldc规则
 * Summary: 保存ldc规则
 */
func (client *Client) SaveLdc(request *SaveLdcRequest) (_result *SaveLdcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveLdcResponse{}
	_body, _err := client.SaveLdcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保存ldc规则
 * Summary: 保存ldc规则
 */
func (client *Client) SaveLdcEx(request *SaveLdcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveLdcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveLdcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.ldc.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权APP绑定API
 * Summary: 授权APP绑定API
 */
func (client *Client) MountAuthappApi(request *MountAuthappApiRequest) (_result *MountAuthappApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountAuthappApiResponse{}
	_body, _err := client.MountAuthappApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权APP绑定API
 * Summary: 授权APP绑定API
 */
func (client *Client) MountAuthappApiEx(request *MountAuthappApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountAuthappApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountAuthappApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.api.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权app解除绑定Api
 * Summary: 授权app解除绑定Api
 */
func (client *Client) UnmountAuthappApi(request *UnmountAuthappApiRequest) (_result *UnmountAuthappApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountAuthappApiResponse{}
	_body, _err := client.UnmountAuthappApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权app解除绑定Api
 * Summary: 授权app解除绑定Api
 */
func (client *Client) UnmountAuthappApiEx(request *UnmountAuthappApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountAuthappApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountAuthappApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.authapp.api.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入 API
 * Summary: 导入 API
 */
func (client *Client) ImportApi(request *ImportApiRequest) (_result *ImportApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportApiResponse{}
	_body, _err := client.ImportApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入 API
 * Summary: 导入 API
 */
func (client *Client) ImportApiEx(request *ImportApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api批量导出
 * Summary: api批量导出
 */
func (client *Client) ExportApi(request *ExportApiRequest) (_result *ExportApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportApiResponse{}
	_body, _err := client.ExportApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api批量导出
 * Summary: api批量导出
 */
func (client *Client) ExportApiEx(request *ExportApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据API分组ID导出API
 * Summary: 根据API分组ID导出API
 */
func (client *Client) ExportApigroupApi(request *ExportApigroupApiRequest) (_result *ExportApigroupApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportApigroupApiResponse{}
	_body, _err := client.ExportApigroupApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据API分组ID导出API
 * Summary: 根据API分组ID导出API
 */
func (client *Client) ExportApigroupApiEx(request *ExportApigroupApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportApigroupApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportApigroupApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.api.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建参数映射
 * Summary: 创建参数映射
 */
func (client *Client) CreateParammapping(request *CreateParammappingRequest) (_result *CreateParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateParammappingResponse{}
	_body, _err := client.CreateParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建参数映射
 * Summary: 创建参数映射
 */
func (client *Client) CreateParammappingEx(request *CreateParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  更新参数映射
 * Summary:  更新参数映射
 */
func (client *Client) UpdateParammapping(request *UpdateParammappingRequest) (_result *UpdateParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateParammappingResponse{}
	_body, _err := client.UpdateParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  更新参数映射
 * Summary:  更新参数映射
 */
func (client *Client) UpdateParammappingEx(request *UpdateParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除参数映射
 * Summary: 删除参数映射
 */
func (client *Client) DeleteParammapping(request *DeleteParammappingRequest) (_result *DeleteParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteParammappingResponse{}
	_body, _err := client.DeleteParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除参数映射
 * Summary: 删除参数映射
 */
func (client *Client) DeleteParammappingEx(request *DeleteParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询参数映射分页列表
 * Summary: 查询参数映射分页列表
 */
func (client *Client) ListParammapping(request *ListParammappingRequest) (_result *ListParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListParammappingResponse{}
	_body, _err := client.ListParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询参数映射分页列表
 * Summary: 查询参数映射分页列表
 */
func (client *Client) ListParammappingEx(request *ListParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询API列表
 * Summary: 查询API列表
 */
func (client *Client) AllParammapping(request *AllParammappingRequest) (_result *AllParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllParammappingResponse{}
	_body, _err := client.AllParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询API列表
 * Summary: 查询API列表
 */
func (client *Client) AllParammappingEx(request *AllParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过IDF查询参数映射
 * Summary: 通过IDF查询参数映射
 */
func (client *Client) GetParammapping(request *GetParammappingRequest) (_result *GetParammappingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetParammappingResponse{}
	_body, _err := client.GetParammappingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过IDF查询参数映射
 * Summary: 通过IDF查询参数映射
 */
func (client *Client) GetParammappingEx(request *GetParammappingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetParammappingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetParammappingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据映射参数ID查询api分页列表
 * Summary: 根据映射参数ID查询api分页列表
 */
func (client *Client) ListParammappingApi(request *ListParammappingApiRequest) (_result *ListParammappingApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListParammappingApiResponse{}
	_body, _err := client.ListParammappingApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据映射参数ID查询api分页列表
 * Summary: 根据映射参数ID查询api分页列表
 */
func (client *Client) ListParammappingApiEx(request *ListParammappingApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListParammappingApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListParammappingApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.parammapping.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询模型列表
 * Summary: 查询模型列表
 */
func (client *Client) AllApimodel(request *AllApimodelRequest) (_result *AllApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApimodelResponse{}
	_body, _err := client.AllApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询模型列表
 * Summary: 查询模型列表
 */
func (client *Client) AllApimodelEx(request *AllApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询api模板分页列表
 * Summary: 查询模型分页列表
 */
func (client *Client) ListApimodel(request *ListApimodelRequest) (_result *ListApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApimodelResponse{}
	_body, _err := client.ListApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api模板分页列表
 * Summary: 查询模型分页列表
 */
func (client *Client) ListApimodelEx(request *ListApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建api模型
 * Summary: 创建api模型
 */
func (client *Client) CreateApimodel(request *CreateApimodelRequest) (_result *CreateApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApimodelResponse{}
	_body, _err := client.CreateApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建api模型
 * Summary: 创建api模型
 */
func (client *Client) CreateApimodelEx(request *CreateApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除api模型
 * Summary: 删除api模型
 */
func (client *Client) DeleteApimodel(request *DeleteApimodelRequest) (_result *DeleteApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApimodelResponse{}
	_body, _err := client.DeleteApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除api模型
 * Summary: 删除api模型
 */
func (client *Client) DeleteApimodelEx(request *DeleteApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据模型ID查询模型
 * Summary: 根据模型ID查询模型
 */
func (client *Client) GetApimodel(request *GetApimodelRequest) (_result *GetApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApimodelResponse{}
	_body, _err := client.GetApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据模型ID查询模型
 * Summary: 根据模型ID查询模型
 */
func (client *Client) GetApimodelEx(request *GetApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型
 * Summary: 更新模型
 */
func (client *Client) UpdateApimodel(request *UpdateApimodelRequest) (_result *UpdateApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApimodelResponse{}
	_body, _err := client.UpdateApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型
 * Summary: 更新模型
 */
func (client *Client) UpdateApimodelEx(request *UpdateApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模型ID查询使用的API列表
 * Summary: 通过模型ID查询使用的API列表
 */
func (client *Client) AllApimodelApi(request *AllApimodelApiRequest) (_result *AllApimodelApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApimodelApiResponse{}
	_body, _err := client.AllApimodelApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模型ID查询使用的API列表
 * Summary: 通过模型ID查询使用的API列表
 */
func (client *Client) AllApimodelApiEx(request *AllApimodelApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApimodelApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApimodelApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过模型ID查询使用的API分页列表
 * Summary: 通过模型ID查询使用的API分页列表
 */
func (client *Client) ListApimodelApi(request *ListApimodelApiRequest) (_result *ListApimodelApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApimodelApiResponse{}
	_body, _err := client.ListApimodelApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过模型ID查询使用的API分页列表
 * Summary: 通过模型ID查询使用的API分页列表
 */
func (client *Client) ListApimodelApiEx(request *ListApimodelApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApimodelApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApimodelApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建外部授权
 * Summary: 创建外部授权
 */
func (client *Client) CreateExternalauth(request *CreateExternalauthRequest) (_result *CreateExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateExternalauthResponse{}
	_body, _err := client.CreateExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建外部授权
 * Summary: 创建外部授权
 */
func (client *Client) CreateExternalauthEx(request *CreateExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新外部系统
 * Summary: 更新外部系统
 */
func (client *Client) UpdateExternalauth(request *UpdateExternalauthRequest) (_result *UpdateExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateExternalauthResponse{}
	_body, _err := client.UpdateExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新外部系统
 * Summary: 更新外部系统
 */
func (client *Client) UpdateExternalauthEx(request *UpdateExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除外部授权
 * Summary: 删除外部授权
 */
func (client *Client) DeleteExternalauth(request *DeleteExternalauthRequest) (_result *DeleteExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteExternalauthResponse{}
	_body, _err := client.DeleteExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除外部授权
 * Summary: 删除外部授权
 */
func (client *Client) DeleteExternalauthEx(request *DeleteExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询外部授权
 * Summary: 通过ID查询外部授权
 */
func (client *Client) GetExternalauth(request *GetExternalauthRequest) (_result *GetExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetExternalauthResponse{}
	_body, _err := client.GetExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询外部授权
 * Summary: 通过ID查询外部授权
 */
func (client *Client) GetExternalauthEx(request *GetExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询外部授权分页列表
 * Summary: 查询外部授权分页列表
 */
func (client *Client) ListExternalauth(request *ListExternalauthRequest) (_result *ListExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListExternalauthResponse{}
	_body, _err := client.ListExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询外部授权分页列表
 * Summary: 查询外部授权分页列表
 */
func (client *Client) ListExternalauthEx(request *ListExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  查询外部系统列表
 * Summary:  查询外部系统列表
 */
func (client *Client) AllExternalauth(request *AllExternalauthRequest) (_result *AllExternalauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllExternalauthResponse{}
	_body, _err := client.AllExternalauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  查询外部系统列表
 * Summary:  查询外部系统列表
 */
func (client *Client) AllExternalauthEx(request *AllExternalauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllExternalauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllExternalauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部授权绑定api
 * Summary: 外部授权绑定api
 */
func (client *Client) MountExternalauthApi(request *MountExternalauthApiRequest) (_result *MountExternalauthApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountExternalauthApiResponse{}
	_body, _err := client.MountExternalauthApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部授权绑定api
 * Summary: 外部授权绑定api
 */
func (client *Client) MountExternalauthApiEx(request *MountExternalauthApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountExternalauthApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountExternalauthApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.api.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部授权解绑api
 * Summary: 外部授权解绑api
 */
func (client *Client) UnmountExternalauthApi(request *UnmountExternalauthApiRequest) (_result *UnmountExternalauthApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountExternalauthApiResponse{}
	_body, _err := client.UnmountExternalauthApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部授权解绑api
 * Summary: 外部授权解绑api
 */
func (client *Client) UnmountExternalauthApiEx(request *UnmountExternalauthApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountExternalauthApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountExternalauthApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.api.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除模型参数
 * Summary: 删除模型参数
 */
func (client *Client) DeleteApimodelParam(request *DeleteApimodelParamRequest) (_result *DeleteApimodelParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApimodelParamResponse{}
	_body, _err := client.DeleteApimodelParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除模型参数
 * Summary: 删除模型参数
 */
func (client *Client) DeleteApimodelParamEx(request *DeleteApimodelParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApimodelParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApimodelParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.param.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新模型参数
 * Summary: 更新模型参数
 */
func (client *Client) UpdateApimodelParam(request *UpdateApimodelParamRequest) (_result *UpdateApimodelParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApimodelParamResponse{}
	_body, _err := client.UpdateApimodelParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新模型参数
 * Summary: 更新模型参数
 */
func (client *Client) UpdateApimodelParamEx(request *UpdateApimodelParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApimodelParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApimodelParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.param.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增模型参数
 * Summary: 新增模型参数
 */
func (client *Client) CreateApimodelParam(request *CreateApimodelParamRequest) (_result *CreateApimodelParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApimodelParamResponse{}
	_body, _err := client.CreateApimodelParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增模型参数
 * Summary: 新增模型参数
 */
func (client *Client) CreateApimodelParamEx(request *CreateApimodelParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApimodelParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApimodelParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.param.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过外部授权ID查询API分页列表
 * Summary: 通过外部授权ID查询API分页列表
 */
func (client *Client) ListExternalauthApi(request *ListExternalauthApiRequest) (_result *ListExternalauthApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListExternalauthApiResponse{}
	_body, _err := client.ListExternalauthApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过外部授权ID查询API分页列表
 * Summary: 通过外部授权ID查询API分页列表
 */
func (client *Client) ListExternalauthApiEx(request *ListExternalauthApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListExternalauthApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListExternalauthApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.externalauth.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校检 模型引用是否死循环
 * Summary: 校检 模型引用是否死循环
 */
func (client *Client) CheckApimodelParam(request *CheckApimodelParamRequest) (_result *CheckApimodelParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckApimodelParamResponse{}
	_body, _err := client.CheckApimodelParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校检 模型引用是否死循环
 * Summary: 校检 模型引用是否死循环
 */
func (client *Client) CheckApimodelParamEx(request *CheckApimodelParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckApimodelParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckApimodelParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.param.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解析数据模型
 * Summary: 解析数据模型
 */
func (client *Client) ResolveApimodel(request *ResolveApimodelRequest) (_result *ResolveApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResolveApimodelResponse{}
	_body, _err := client.ResolveApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解析数据模型
 * Summary: 解析数据模型
 */
func (client *Client) ResolveApimodelEx(request *ResolveApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResolveApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResolveApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.resolve"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 侯志波
 * Summary: 导入数据模型
 */
func (client *Client) ImportApimodel(request *ImportApimodelRequest) (_result *ImportApimodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportApimodelResponse{}
	_body, _err := client.ImportApimodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 侯志波
 * Summary: 导入数据模型
 */
func (client *Client) ImportApimodelEx(request *ImportApimodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportApimodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportApimodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: mgs模型转换 为网关模型
 * Summary: （mgs模型数据迁移）转换 为网关模型
 */
func (client *Client) ApplyApimodelMgs(request *ApplyApimodelMgsRequest) (_result *ApplyApimodelMgsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyApimodelMgsResponse{}
	_body, _err := client.ApplyApimodelMgsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: mgs模型转换 为网关模型
 * Summary: （mgs模型数据迁移）转换 为网关模型
 */
func (client *Client) ApplyApimodelMgsEx(request *ApplyApimodelMgsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyApimodelMgsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyApimodelMgsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.mgs.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询操作人分页列表
 * Summary: 查询操作人分页列表
 */
func (client *Client) ListOperator(request *ListOperatorRequest) (_result *ListOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListOperatorResponse{}
	_body, _err := client.ListOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询操作人分页列表
 * Summary: 查询操作人分页列表
 */
func (client *Client) ListOperatorEx(request *ListOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.operator.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新api分组授权用户配置
 * Summary: 更新api分组授权用户配置
 */
func (client *Client) UpdateApigroupAuthuserconfig(request *UpdateApigroupAuthuserconfigRequest) (_result *UpdateApigroupAuthuserconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApigroupAuthuserconfigResponse{}
	_body, _err := client.UpdateApigroupAuthuserconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新api分组授权用户配置
 * Summary: 更新api分组授权用户配置
 */
func (client *Client) UpdateApigroupAuthuserconfigEx(request *UpdateApigroupAuthuserconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApigroupAuthuserconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApigroupAuthuserconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuserconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询api分组授权用户配置
 * Summary: 查询api分组授权用户配置
 */
func (client *Client) GetApigroupAuthuserconfig(request *GetApigroupAuthuserconfigRequest) (_result *GetApigroupAuthuserconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApigroupAuthuserconfigResponse{}
	_body, _err := client.GetApigroupAuthuserconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api分组授权用户配置
 * Summary: 查询api分组授权用户配置
 */
func (client *Client) GetApigroupAuthuserconfigEx(request *GetApigroupAuthuserconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApigroupAuthuserconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApigroupAuthuserconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuserconfig.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api分组添加用户
 * Summary: api分组添加用户
 */
func (client *Client) AddApigroupAuthuser(request *AddApigroupAuthuserRequest) (_result *AddApigroupAuthuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddApigroupAuthuserResponse{}
	_body, _err := client.AddApigroupAuthuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api分组添加用户
 * Summary: api分组添加用户
 */
func (client *Client) AddApigroupAuthuserEx(request *AddApigroupAuthuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddApigroupAuthuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddApigroupAuthuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuser.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  api分组授权用户使用权限
 * Summary:  api分组授权用户使用权限
 */
func (client *Client) MountApigroupAuthuser(request *MountApigroupAuthuserRequest) (_result *MountApigroupAuthuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountApigroupAuthuserResponse{}
	_body, _err := client.MountApigroupAuthuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  api分组授权用户使用权限
 * Summary:  api分组授权用户使用权限
 */
func (client *Client) MountApigroupAuthuserEx(request *MountApigroupAuthuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountApigroupAuthuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountApigroupAuthuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuser.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
api解除用户使用权限
 * Summary:  api解除用户使用权限
*/
func (client *Client) UnmountApigroupAuthuser(request *UnmountApigroupAuthuserRequest) (_result *UnmountApigroupAuthuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountApigroupAuthuserResponse{}
	_body, _err := client.UnmountApigroupAuthuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
api解除用户使用权限
 * Summary:  api解除用户使用权限
*/
func (client *Client) UnmountApigroupAuthuserEx(request *UnmountApigroupAuthuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountApigroupAuthuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountApigroupAuthuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuser.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询api分组授权用户分页列表
 * Summary: 查询api分组授权用户分页列表
 */
func (client *Client) ListApigroupAuthuser(request *ListApigroupAuthuserRequest) (_result *ListApigroupAuthuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApigroupAuthuserResponse{}
	_body, _err := client.ListApigroupAuthuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api分组授权用户分页列表
 * Summary: 查询api分组授权用户分页列表
 */
func (client *Client) ListApigroupAuthuserEx(request *ListApigroupAuthuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApigroupAuthuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApigroupAuthuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuser.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api分组删除用户
 * Summary: api分组删除用户
 */
func (client *Client) DeleteApigroupAuthuser(request *DeleteApigroupAuthuserRequest) (_result *DeleteApigroupAuthuserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApigroupAuthuserResponse{}
	_body, _err := client.DeleteApigroupAuthuserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api分组删除用户
 * Summary: api分组删除用户
 */
func (client *Client) DeleteApigroupAuthuserEx(request *DeleteApigroupAuthuserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApigroupAuthuserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApigroupAuthuserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.authuser.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验是否有api分组权限
 * Summary: 校验是否有api分组权限
 */
func (client *Client) VerifyApiApigroup(request *VerifyApiApigroupRequest) (_result *VerifyApiApigroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyApiApigroupResponse{}
	_body, _err := client.VerifyApiApigroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验是否有api分组权限
 * Summary: 校验是否有api分组权限
 */
func (client *Client) VerifyApiApigroupEx(request *VerifyApiApigroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyApiApigroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyApiApigroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.apigroup.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 修改app绑定api加密状态
 * Summary: 修改app绑定api加密状态
 */
func (client *Client) UpdateAppAuthapi(request *UpdateAppAuthapiRequest) (_result *UpdateAppAuthapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAppAuthapiResponse{}
	_body, _err := client.UpdateAppAuthapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 修改app绑定api加密状态
 * Summary: 修改app绑定api加密状态
 */
func (client *Client) UpdateAppAuthapiEx(request *UpdateAppAuthapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAppAuthapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAppAuthapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.app.authapi.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 配置zone
 * Summary: 全局配置zone
 */
func (client *Client) CreateGwconfig(request *CreateGwconfigRequest) (_result *CreateGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGwconfigResponse{}
	_body, _err := client.CreateGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 配置zone
 * Summary: 全局配置zone
 */
func (client *Client) CreateGwconfigEx(request *CreateGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询全局网关配置
 * Summary: 查询全局网关配置
 */
func (client *Client) GetGwconfig(request *GetGwconfigRequest) (_result *GetGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGwconfigResponse{}
	_body, _err := client.GetGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询全局网关配置
 * Summary: 查询全局网关配置
 */
func (client *Client) GetGwconfigEx(request *GetGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新全局网关配置
 * Summary: 更新全局网关配置
 */
func (client *Client) UpdateGwconfig(request *UpdateGwconfigRequest) (_result *UpdateGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGwconfigResponse{}
	_body, _err := client.UpdateGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新全局网关配置
 * Summary: 更新全局网关配置
 */
func (client *Client) UpdateGwconfigEx(request *UpdateGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询全局网关列表
 * Summary: 查询全局网关列表
 */
func (client *Client) AllGwconfig(request *AllGwconfigRequest) (_result *AllGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllGwconfigResponse{}
	_body, _err := client.AllGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询全局网关列表
 * Summary: 查询全局网关列表
 */
func (client *Client) AllGwconfigEx(request *AllGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询instance_id
 * Summary: 查询instance_id
 */
func (client *Client) GetInstance(request *GetInstanceRequest) (_result *GetInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInstanceResponse{}
	_body, _err := client.GetInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询instance_id
 * Summary: 查询instance_id
 */
func (client *Client) GetInstanceEx(request *GetInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.instance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除zone、网关效验
 * Summary: 删除zone、网关效验
 */
func (client *Client) CheckGwconfigDelete(request *CheckGwconfigDeleteRequest) (_result *CheckGwconfigDeleteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckGwconfigDeleteResponse{}
	_body, _err := client.CheckGwconfigDeleteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除zone、网关效验
 * Summary: 删除zone、网关效验
 */
func (client *Client) CheckGwconfigDeleteEx(request *CheckGwconfigDeleteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckGwconfigDeleteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckGwconfigDeleteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.delete.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新zone、网关效验
 * Summary: 更新zone、网关效验
 */
func (client *Client) CheckGwconfigUpdate(request *CheckGwconfigUpdateRequest) (_result *CheckGwconfigUpdateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckGwconfigUpdateResponse{}
	_body, _err := client.CheckGwconfigUpdateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新zone、网关效验
 * Summary: 更新zone、网关效验
 */
func (client *Client) CheckGwconfigUpdateEx(request *CheckGwconfigUpdateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckGwconfigUpdateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckGwconfigUpdateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.update.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建跨云互通代理模式
 * Summary: 创建跨云互通代理模式
 */
func (client *Client) CreateApiGwconfig(request *CreateApiGwconfigRequest) (_result *CreateApiGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiGwconfigResponse{}
	_body, _err := client.CreateApiGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建跨云互通代理模式
 * Summary: 创建跨云互通代理模式
 */
func (client *Client) CreateApiGwconfigEx(request *CreateApiGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.gwconfig.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新跨云互通API
 * Summary: 更新跨云互通API
 */
func (client *Client) UpdateApiGwconfig(request *UpdateApiGwconfigRequest) (_result *UpdateApiGwconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiGwconfigResponse{}
	_body, _err := client.UpdateApiGwconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新跨云互通API
 * Summary: 更新跨云互通API
 */
func (client *Client) UpdateApiGwconfigEx(request *UpdateApiGwconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiGwconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiGwconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.gwconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 录入api时的参数效验
 * Summary: 录入api时的参数效验
 */
func (client *Client) CheckApi(request *CheckApiRequest) (_result *CheckApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckApiResponse{}
	_body, _err := client.CheckApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录入api时的参数效验
 * Summary: 录入api时的参数效验
 */
func (client *Client) CheckApiEx(request *CheckApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 系统集群修改校验
 * Summary: 系统集群修改校验是否可修改
 */
func (client *Client) CheckSysUpdate(request *CheckSysUpdateRequest) (_result *CheckSysUpdateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSysUpdateResponse{}
	_body, _err := client.CheckSysUpdateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 系统集群修改校验
 * Summary: 系统集群修改校验是否可修改
 */
func (client *Client) CheckSysUpdateEx(request *CheckSysUpdateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSysUpdateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSysUpdateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.sys.update.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api查看历史版本信息
 * Summary: api查看历史版本信息
 */
func (client *Client) GetApiHistoryversionapi(request *GetApiHistoryversionapiRequest) (_result *GetApiHistoryversionapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiHistoryversionapiResponse{}
	_body, _err := client.GetApiHistoryversionapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api查看历史版本信息
 * Summary: api查看历史版本信息
 */
func (client *Client) GetApiHistoryversionapiEx(request *GetApiHistoryversionapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiHistoryversionapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiHistoryversionapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.historyversionapi.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询策略列表
 * Summary: 查询策略列表
 */
func (client *Client) AllStrategy(request *AllStrategyRequest) (_result *AllStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllStrategyResponse{}
	_body, _err := client.AllStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询策略列表
 * Summary: 查询策略列表
 */
func (client *Client) AllStrategyEx(request *AllStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据strategyID查询API列表
 * Summary: 根据strategyID查询API列表
 */
func (client *Client) AllStrategyApi(request *AllStrategyApiRequest) (_result *AllStrategyApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllStrategyApiResponse{}
	_body, _err := client.AllStrategyApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据strategyID查询API列表
 * Summary: 根据strategyID查询API列表
 */
func (client *Client) AllStrategyApiEx(request *AllStrategyApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllStrategyApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllStrategyApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.api.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据strategyID查询API分页
 * Summary: 根据strategyID查询API分页
 */
func (client *Client) ListStrategyApi(request *ListStrategyApiRequest) (_result *ListStrategyApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListStrategyApiResponse{}
	_body, _err := client.ListStrategyApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据strategyID查询API分页
 * Summary: 根据strategyID查询API分页
 */
func (client *Client) ListStrategyApiEx(request *ListStrategyApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListStrategyApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListStrategyApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.api.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  根据strategy ID绑定API
 * Summary:  根据strategy ID绑定API
 */
func (client *Client) MountStrategyApi(request *MountStrategyApiRequest) (_result *MountStrategyApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MountStrategyApiResponse{}
	_body, _err := client.MountStrategyApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  根据strategy ID绑定API
 * Summary:  根据strategy ID绑定API
 */
func (client *Client) MountStrategyApiEx(request *MountStrategyApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MountStrategyApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MountStrategyApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.api.mount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据strategyID 解绑API
 * Summary: 根据strategyID 解绑API
 */
func (client *Client) UnmountStrategyApi(request *UnmountStrategyApiRequest) (_result *UnmountStrategyApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnmountStrategyApiResponse{}
	_body, _err := client.UnmountStrategyApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据strategyID 解绑API
 * Summary: 根据strategyID 解绑API
 */
func (client *Client) UnmountStrategyApiEx(request *UnmountStrategyApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnmountStrategyApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnmountStrategyApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.api.unmount"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  创建策略
 * Summary:  创建策略
 */
func (client *Client) CreateStrategy(request *CreateStrategyRequest) (_result *CreateStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateStrategyResponse{}
	_body, _err := client.CreateStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  创建策略
 * Summary:  创建策略
 */
func (client *Client) CreateStrategyEx(request *CreateStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除策略
 * Summary: 删除策略
 */
func (client *Client) DeleteStrategy(request *DeleteStrategyRequest) (_result *DeleteStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteStrategyResponse{}
	_body, _err := client.DeleteStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除策略
 * Summary: 删除策略
 */
func (client *Client) DeleteStrategyEx(request *DeleteStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据ID查询strategy
 * Summary: 根据ID查询strategy
 */
func (client *Client) GetStrategy(request *GetStrategyRequest) (_result *GetStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetStrategyResponse{}
	_body, _err := client.GetStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据ID查询strategy
 * Summary: 根据ID查询strategy
 */
func (client *Client) GetStrategyEx(request *GetStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询strategy分页列表
 * Summary: 查询strategy分页列表
 */
func (client *Client) ListStrategy(request *ListStrategyRequest) (_result *ListStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListStrategyResponse{}
	_body, _err := client.ListStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询strategy分页列表
 * Summary: 查询strategy分页列表
 */
func (client *Client) ListStrategyEx(request *ListStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  编辑strategy
 * Summary:  编辑strategy
 */
func (client *Client) UpdateStrategy(request *UpdateStrategyRequest) (_result *UpdateStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateStrategyResponse{}
	_body, _err := client.UpdateStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  编辑strategy
 * Summary:  编辑strategy
 */
func (client *Client) UpdateStrategyEx(request *UpdateStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.strategy.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数量
 * Summary: 查询数量
 */
func (client *Client) GetHome(request *GetHomeRequest) (_result *GetHomeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetHomeResponse{}
	_body, _err := client.GetHomeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数量
 * Summary: 查询数量
 */
func (client *Client) GetHomeEx(request *GetHomeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetHomeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetHomeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.home.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 录入域名时的效验
 * Summary: 录入域名时的效验
 */
func (client *Client) CheckApigroupDomain(request *CheckApigroupDomainRequest) (_result *CheckApigroupDomainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckApigroupDomainResponse{}
	_body, _err := client.CheckApigroupDomainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录入域名时的效验
 * Summary: 录入域名时的效验
 */
func (client *Client) CheckApigroupDomainEx(request *CheckApigroupDomainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckApigroupDomainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckApigroupDomainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.domain.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询域名后缀
 * Summary: 查询域名后缀
 */
func (client *Client) GetApigroupDomain(request *GetApigroupDomainRequest) (_result *GetApigroupDomainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApigroupDomainResponse{}
	_body, _err := client.GetApigroupDomainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询域名后缀
 * Summary: 查询域名后缀
 */
func (client *Client) GetApigroupDomainEx(request *GetApigroupDomainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApigroupDomainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApigroupDomainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apigroup.domain.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查看api生成的swagger文档
 * Summary: 查看api生成的swagger文档
 */
func (client *Client) GetApiSwagger(request *GetApiSwaggerRequest) (_result *GetApiSwaggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiSwaggerResponse{}
	_body, _err := client.GetApiSwaggerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查看api生成的swagger文档
 * Summary: 查看api生成的swagger文档
 */
func (client *Client) GetApiSwaggerEx(request *GetApiSwaggerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiSwaggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiSwaggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.swagger.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api文档下载
 * Summary: api文档下载
 */
func (client *Client) DownloadApiSwagger(request *DownloadApiSwaggerRequest) (_result *DownloadApiSwaggerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadApiSwaggerResponse{}
	_body, _err := client.DownloadApiSwaggerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api文档下载
 * Summary: api文档下载
 */
func (client *Client) DownloadApiSwaggerEx(request *DownloadApiSwaggerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadApiSwaggerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadApiSwaggerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.api.swagger.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代码生成
 * Summary: 代码生成
 */
func (client *Client) DownloadApimodelCodegen(request *DownloadApimodelCodegenRequest) (_result *DownloadApimodelCodegenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DownloadApimodelCodegenResponse{}
	_body, _err := client.DownloadApimodelCodegenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代码生成
 * Summary: 代码生成
 */
func (client *Client) DownloadApimodelCodegenEx(request *DownloadApimodelCodegenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DownloadApimodelCodegenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DownloadApimodelCodegenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.codegen.download"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取双网模块开关
 * Summary: 获取双网模块开关
 */
func (client *Client) GetGwconfigGatewayswitch(request *GetGwconfigGatewayswitchRequest) (_result *GetGwconfigGatewayswitchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGwconfigGatewayswitchResponse{}
	_body, _err := client.GetGwconfigGatewayswitchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取双网模块开关
 * Summary: 获取双网模块开关
 */
func (client *Client) GetGwconfigGatewayswitchEx(request *GetGwconfigGatewayswitchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGwconfigGatewayswitchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGwconfigGatewayswitchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.gatewayswitch.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询注册中心列表
 * Summary: 查询注册中心列表
 */
func (client *Client) AllRegistry(request *AllRegistryRequest) (_result *AllRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllRegistryResponse{}
	_body, _err := client.AllRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询注册中心列表
 * Summary: 查询注册中心列表
 */
func (client *Client) AllRegistryEx(request *AllRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询注册中心绑定的集群列表
 * Summary: 查询注册中心绑定的集群列表
 */
func (client *Client) AllRegistrySys(request *AllRegistrySysRequest) (_result *AllRegistrySysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllRegistrySysResponse{}
	_body, _err := client.AllRegistrySysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询注册中心绑定的集群列表
 * Summary: 查询注册中心绑定的集群列表
 */
func (client *Client) AllRegistrySysEx(request *AllRegistrySysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllRegistrySysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllRegistrySysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.sys.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询注册中心绑定的集群列表
 * Summary: 分页查询注册中心绑定的集群列表
 */
func (client *Client) ListRegistrySys(request *ListRegistrySysRequest) (_result *ListRegistrySysResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRegistrySysResponse{}
	_body, _err := client.ListRegistrySysEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询注册中心绑定的集群列表
 * Summary: 分页查询注册中心绑定的集群列表
 */
func (client *Client) ListRegistrySysEx(request *ListRegistrySysRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRegistrySysResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRegistrySysResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.sys.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建注册中心
 * Summary: 创建注册中心
 */
func (client *Client) CreateRegistry(request *CreateRegistryRequest) (_result *CreateRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRegistryResponse{}
	_body, _err := client.CreateRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建注册中心
 * Summary: 创建注册中心
 */
func (client *Client) CreateRegistryEx(request *CreateRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  通过ID删除注册中心
 * Summary:  通过ID删除注册中心
 */
func (client *Client) DeleteRegistry(request *DeleteRegistryRequest) (_result *DeleteRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRegistryResponse{}
	_body, _err := client.DeleteRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  通过ID删除注册中心
 * Summary:  通过ID删除注册中心
 */
func (client *Client) DeleteRegistryEx(request *DeleteRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询注册中心
 * Summary: 通过ID查询注册中心
 */
func (client *Client) GetRegistry(request *GetRegistryRequest) (_result *GetRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRegistryResponse{}
	_body, _err := client.GetRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询注册中心
 * Summary: 通过ID查询注册中心
 */
func (client *Client) GetRegistryEx(request *GetRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  查询注册中心分页列表
 * Summary:  查询注册中心分页列表
 */
func (client *Client) ListRegistry(request *ListRegistryRequest) (_result *ListRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRegistryResponse{}
	_body, _err := client.ListRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  查询注册中心分页列表
 * Summary:  查询注册中心分页列表
 */
func (client *Client) ListRegistryEx(request *ListRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新注册中心
 * Summary: 更新注册中心
 */
func (client *Client) UpdateRegistry(request *UpdateRegistryRequest) (_result *UpdateRegistryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRegistryResponse{}
	_body, _err := client.UpdateRegistryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新注册中心
 * Summary: 更新注册中心
 */
func (client *Client) UpdateRegistryEx(request *UpdateRegistryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRegistryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRegistryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.registry.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 执行流程编排
 * Summary: 执行流程编排
 */
func (client *Client) ExecApiflow(request *ExecApiflowRequest) (_result *ExecApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecApiflowResponse{}
	_body, _err := client.ExecApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 执行流程编排
 * Summary: 执行流程编排
 */
func (client *Client) ExecApiflowEx(request *ExecApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID删除编排
 * Summary: 通过ID删除编排
 */
func (client *Client) DeleteApiflow(request *DeleteApiflowRequest) (_result *DeleteApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteApiflowResponse{}
	_body, _err := client.DeleteApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID删除编排
 * Summary: 通过ID删除编排
 */
func (client *Client) DeleteApiflowEx(request *DeleteApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询全部编排列表
 * Summary: 查询全部编排列表
 */
func (client *Client) AllApiflow(request *AllApiflowRequest) (_result *AllApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllApiflowResponse{}
	_body, _err := client.AllApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询全部编排列表
 * Summary: 查询全部编排列表
 */
func (client *Client) AllApiflowEx(request *AllApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询编排分页列表
 * Summary: 查询编排分页列表
 */
func (client *Client) ListApiflow(request *ListApiflowRequest) (_result *ListApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListApiflowResponse{}
	_body, _err := client.ListApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询编排分页列表
 * Summary: 查询编排分页列表
 */
func (client *Client) ListApiflowEx(request *ListApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建API形式的编排
 * Summary: 创建API形式的编排
 */
func (client *Client) CreateApiflow(request *CreateApiflowRequest) (_result *CreateApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateApiflowResponse{}
	_body, _err := client.CreateApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建API形式的编排
 * Summary: 创建API形式的编排
 */
func (client *Client) CreateApiflowEx(request *CreateApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过ID查询编排
 * Summary: 通过ID查询编排
 */
func (client *Client) GetApiflow(request *GetApiflowRequest) (_result *GetApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApiflowResponse{}
	_body, _err := client.GetApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过ID查询编排
 * Summary: 通过ID查询编排
 */
func (client *Client) GetApiflowEx(request *GetApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新编排信息
 * Summary: 更新编排信息
 */
func (client *Client) UpdateApiflow(request *UpdateApiflowRequest) (_result *UpdateApiflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiflowResponse{}
	_body, _err := client.UpdateApiflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新编排信息
 * Summary: 更新编排信息
 */
func (client *Client) UpdateApiflowEx(request *UpdateApiflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apiflow.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据模型转json
 * Summary: 数据模型转json
 */
func (client *Client) GetApimodelJson(request *GetApimodelJsonRequest) (_result *GetApimodelJsonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetApimodelJsonResponse{}
	_body, _err := client.GetApimodelJsonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据模型转json
 * Summary: 数据模型转json
 */
func (client *Client) GetApimodelJsonEx(request *GetApimodelJsonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetApimodelJsonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetApimodelJsonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.json.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 替换成apiflow所需的json
 * Summary: 替换成apiflow所需的json
 */
func (client *Client) ReplaceApimodelJson(request *ReplaceApimodelJsonRequest) (_result *ReplaceApimodelJsonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceApimodelJsonResponse{}
	_body, _err := client.ReplaceApimodelJsonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 替换成apiflow所需的json
 * Summary: 替换成apiflow所需的json
 */
func (client *Client) ReplaceApimodelJsonEx(request *ReplaceApimodelJsonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceApimodelJsonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceApimodelJsonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.apimodel.json.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取triple协议开关
 * Summary: 获取triple协议开关
 */
func (client *Client) GetGwconfigTripleswitch(request *GetGwconfigTripleswitchRequest) (_result *GetGwconfigTripleswitchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGwconfigTripleswitchResponse{}
	_body, _err := client.GetGwconfigTripleswitchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取triple协议开关
 * Summary: 获取triple协议开关
 */
func (client *Client) GetGwconfigTripleswitchEx(request *GetGwconfigTripleswitchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGwconfigTripleswitchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGwconfigTripleswitchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.tripleswitch.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 专有云triple查询开关
 * Summary: 专有云triple查询开关
 */
func (client *Client) QueryGwconfigTripleswitch(request *QueryGwconfigTripleswitchRequest) (_result *QueryGwconfigTripleswitchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwconfigTripleswitchResponse{}
	_body, _err := client.QueryGwconfigTripleswitchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 专有云triple查询开关
 * Summary: 专有云triple查询开关
 */
func (client *Client) QueryGwconfigTripleswitchEx(request *QueryGwconfigTripleswitchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwconfigTripleswitchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwconfigTripleswitchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.tripleswitch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所以region名称
 * Summary: 查询所以region名称
 */
func (client *Client) AllGwconfigRegion(request *AllGwconfigRegionRequest) (_result *AllGwconfigRegionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllGwconfigRegionResponse{}
	_body, _err := client.AllGwconfigRegionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所以region名称
 * Summary: 查询所以region名称
 */
func (client *Client) AllGwconfigRegionEx(request *AllGwconfigRegionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllGwconfigRegionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllGwconfigRegionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.apigateway.gwconfig.region.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
