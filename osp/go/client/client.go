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

// meter 数据项
type MeterDataItemModel struct {
	// 计量项名称
	ItemCode *string `json:"item_code,omitempty" xml:"item_code,omitempty" require:"true"`
	// 计量项值
	ItemValue *int64 `json:"item_value,omitempty" xml:"item_value,omitempty" require:"true"`
}

func (s MeterDataItemModel) String() string {
	return tea.Prettify(s)
}

func (s MeterDataItemModel) GoString() string {
	return s.String()
}

func (s *MeterDataItemModel) SetItemCode(v string) *MeterDataItemModel {
	s.ItemCode = &v
	return s
}

func (s *MeterDataItemModel) SetItemValue(v int64) *MeterDataItemModel {
	s.ItemValue = &v
	return s
}

// 集群信息
type ClusterMeta struct {
	// 集群唯一标识
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 集群名字
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// 区域
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
}

func (s ClusterMeta) String() string {
	return tea.Prettify(s)
}

func (s ClusterMeta) GoString() string {
	return s.String()
}

func (s *ClusterMeta) SetClusterId(v string) *ClusterMeta {
	s.ClusterId = &v
	return s
}

func (s *ClusterMeta) SetClusterName(v string) *ClusterMeta {
	s.ClusterName = &v
	return s
}

func (s *ClusterMeta) SetRegion(v string) *ClusterMeta {
	s.Region = &v
	return s
}

// KeyValuePair
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

// 中间件集群
type MiddlewareCluster struct {
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 集群名字
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// 支持的region 列表
	EnableRegions []*string `json:"enable_regions,omitempty" xml:"enable_regions,omitempty" require:"true" type:"Repeated"`
	// 支持的dataCenter 列表
	EnableDataCenters []*string `json:"enable_data_centers,omitempty" xml:"enable_data_centers,omitempty" type:"Repeated"`
	// 支持的zone 列表
	EnableZones []*string `json:"enable_zones,omitempty" xml:"enable_zones,omitempty" type:"Repeated"`
	// acvip 地址
	AcvipEndpoint *string `json:"acvip_endpoint,omitempty" xml:"acvip_endpoint,omitempty" require:"true"`
}

func (s MiddlewareCluster) String() string {
	return tea.Prettify(s)
}

func (s MiddlewareCluster) GoString() string {
	return s.String()
}

func (s *MiddlewareCluster) SetClusterId(v string) *MiddlewareCluster {
	s.ClusterId = &v
	return s
}

func (s *MiddlewareCluster) SetClusterName(v string) *MiddlewareCluster {
	s.ClusterName = &v
	return s
}

func (s *MiddlewareCluster) SetEnableRegions(v []*string) *MiddlewareCluster {
	s.EnableRegions = v
	return s
}

func (s *MiddlewareCluster) SetEnableDataCenters(v []*string) *MiddlewareCluster {
	s.EnableDataCenters = v
	return s
}

func (s *MiddlewareCluster) SetEnableZones(v []*string) *MiddlewareCluster {
	s.EnableZones = v
	return s
}

func (s *MiddlewareCluster) SetAcvipEndpoint(v string) *MiddlewareCluster {
	s.AcvipEndpoint = &v
	return s
}

// 每个instance的endpoint信息
type AksEndpoint struct {
	// access_key
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty" require:"true"`
	// access_secret
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty" require:"true"`
	// acvip的地址
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty" require:"true"`
	// 产品id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 租户名
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 工作区
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty" require:"true"`
	// 表示mesh的配置信息, 用key/value的形式给出.
	Mesh []*KeyValuePair `json:"mesh,omitempty" xml:"mesh,omitempty" require:"true" type:"Repeated"`
}

func (s AksEndpoint) String() string {
	return tea.Prettify(s)
}

func (s AksEndpoint) GoString() string {
	return s.String()
}

func (s *AksEndpoint) SetAccessKey(v string) *AksEndpoint {
	s.AccessKey = &v
	return s
}

func (s *AksEndpoint) SetAccessSecret(v string) *AksEndpoint {
	s.AccessSecret = &v
	return s
}

func (s *AksEndpoint) SetEndpoint(v string) *AksEndpoint {
	s.Endpoint = &v
	return s
}

func (s *AksEndpoint) SetInstanceId(v string) *AksEndpoint {
	s.InstanceId = &v
	return s
}

func (s *AksEndpoint) SetTenant(v string) *AksEndpoint {
	s.Tenant = &v
	return s
}

func (s *AksEndpoint) SetWorkspace(v string) *AksEndpoint {
	s.Workspace = &v
	return s
}

func (s *AksEndpoint) SetMesh(v []*KeyValuePair) *AksEndpoint {
	s.Mesh = v
	return s
}

// AccessKey 实体信息
type AccessKey struct {
	// AK
	Accesskey *string `json:"accesskey,omitempty" xml:"accesskey,omitempty" require:"true"`
	// 实体创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建时间
	Gmtcreate *string `json:"gmtcreate,omitempty" xml:"gmtcreate,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 实体Id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 实例Id
	Instanceid *string `json:"instanceid,omitempty" xml:"instanceid,omitempty" require:"true"`
	// 是否加密
	Isencrypted *bool `json:"isencrypted,omitempty" xml:"isencrypted,omitempty" require:"true"`
	// 实体名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// SK
	Secretkey *string `json:"secretkey,omitempty" xml:"secretkey,omitempty" require:"true"`
}

func (s AccessKey) String() string {
	return tea.Prettify(s)
}

func (s AccessKey) GoString() string {
	return s.String()
}

func (s *AccessKey) SetAccesskey(v string) *AccessKey {
	s.Accesskey = &v
	return s
}

func (s *AccessKey) SetCreator(v string) *AccessKey {
	s.Creator = &v
	return s
}

func (s *AccessKey) SetGmtcreate(v string) *AccessKey {
	s.Gmtcreate = &v
	return s
}

func (s *AccessKey) SetId(v int64) *AccessKey {
	s.Id = &v
	return s
}

func (s *AccessKey) SetInstanceid(v string) *AccessKey {
	s.Instanceid = &v
	return s
}

func (s *AccessKey) SetIsencrypted(v bool) *AccessKey {
	s.Isencrypted = &v
	return s
}

func (s *AccessKey) SetName(v string) *AccessKey {
	s.Name = &v
	return s
}

func (s *AccessKey) SetSecretkey(v string) *AccessKey {
	s.Secretkey = &v
	return s
}

// 产品信息
type Product struct {
	// 产品id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 产品代码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 开通状态, T为已开通, F为未开通
	OpeningStatus *string `json:"opening_status,omitempty" xml:"opening_status,omitempty"`
	// 运行状态的枚举值:
	// 					running 正在运行
	// 					stopped 已经停止
	// 					starting 正在启动
	// 					start_fail 启动失败
	// 					stopping 正在停止
	// 					stop_fail 停止失败
	// 					arrearage 因为欠费, 已经停止
	// 					stopping_arr 因为欠费, 正在停止
	//
	RunningStatus *string `json:"running_status,omitempty" xml:"running_status,omitempty"`
}

func (s Product) String() string {
	return tea.Prettify(s)
}

func (s Product) GoString() string {
	return s.String()
}

func (s *Product) SetId(v int64) *Product {
	s.Id = &v
	return s
}

func (s *Product) SetProductName(v string) *Product {
	s.ProductName = &v
	return s
}

func (s *Product) SetProductCode(v string) *Product {
	s.ProductCode = &v
	return s
}

func (s *Product) SetOpeningStatus(v string) *Product {
	s.OpeningStatus = &v
	return s
}

func (s *Product) SetRunningStatus(v string) *Product {
	s.RunningStatus = &v
	return s
}

// meter 数据
type MeterDataModel struct {
	// 时间
	MeterDate *string `json:"meter_date,omitempty" xml:"meter_date,omitempty" require:"true"`
	// 计量数据项
	MeterDataItemList []*MeterDataItemModel `json:"meter_data_item_list,omitempty" xml:"meter_data_item_list,omitempty" require:"true" type:"Repeated"`
}

func (s MeterDataModel) String() string {
	return tea.Prettify(s)
}

func (s MeterDataModel) GoString() string {
	return s.String()
}

func (s *MeterDataModel) SetMeterDate(v string) *MeterDataModel {
	s.MeterDate = &v
	return s
}

func (s *MeterDataModel) SetMeterDataItemList(v []*MeterDataItemModel) *MeterDataModel {
	s.MeterDataItemList = v
	return s
}

// 绑定实例
type BindInstance struct {
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 集群名字
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// 支持的region
	Regions []*string `json:"regions,omitempty" xml:"regions,omitempty" require:"true" type:"Repeated"`
	// 支持的dataCenter
	DataCenters *string `json:"data_centers,omitempty" xml:"data_centers,omitempty"`
	// 支持的zone 列表
	Zones *string `json:"zones,omitempty" xml:"zones,omitempty"`
	// 绑定后的instanceId 信息
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// acvip 地址
	AcvipEndpoint *string `json:"acvip_endpoint,omitempty" xml:"acvip_endpoint,omitempty" require:"true"`
	// 工作空间组
	WorkspaceGroup *string `json:"workspace_group,omitempty" xml:"workspace_group,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s BindInstance) String() string {
	return tea.Prettify(s)
}

func (s BindInstance) GoString() string {
	return s.String()
}

func (s *BindInstance) SetClusterId(v string) *BindInstance {
	s.ClusterId = &v
	return s
}

func (s *BindInstance) SetClusterName(v string) *BindInstance {
	s.ClusterName = &v
	return s
}

func (s *BindInstance) SetRegions(v []*string) *BindInstance {
	s.Regions = v
	return s
}

func (s *BindInstance) SetDataCenters(v string) *BindInstance {
	s.DataCenters = &v
	return s
}

func (s *BindInstance) SetZones(v string) *BindInstance {
	s.Zones = &v
	return s
}

func (s *BindInstance) SetInstanceId(v string) *BindInstance {
	s.InstanceId = &v
	return s
}

func (s *BindInstance) SetAcvipEndpoint(v string) *BindInstance {
	s.AcvipEndpoint = &v
	return s
}

func (s *BindInstance) SetWorkspaceGroup(v string) *BindInstance {
	s.WorkspaceGroup = &v
	return s
}

func (s *BindInstance) SetTenantId(v string) *BindInstance {
	s.TenantId = &v
	return s
}

// 集群模式
type ClusterMode struct {
	// 集群模式
	ClusterMode *string `json:"cluster_mode,omitempty" xml:"cluster_mode,omitempty" require:"true"`
	// 区域
	Regions []*ClusterMeta `json:"regions,omitempty" xml:"regions,omitempty" require:"true" type:"Repeated"`
}

func (s ClusterMode) String() string {
	return tea.Prettify(s)
}

func (s ClusterMode) GoString() string {
	return s.String()
}

func (s *ClusterMode) SetClusterMode(v string) *ClusterMode {
	s.ClusterMode = &v
	return s
}

func (s *ClusterMode) SetRegions(v []*ClusterMeta) *ClusterMode {
	s.Regions = v
	return s
}

// 实例信息
type Instance struct {
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 工作空间
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
}

func (s Instance) String() string {
	return tea.Prettify(s)
}

func (s Instance) GoString() string {
	return s.String()
}

func (s *Instance) SetInstanceId(v string) *Instance {
	s.InstanceId = &v
	return s
}

func (s *Instance) SetTenant(v string) *Instance {
	s.Tenant = &v
	return s
}

func (s *Instance) SetWorkspace(v string) *Instance {
	s.Workspace = &v
	return s
}

type QueryInstancesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 工作空间, 选填, 如果指定了工作空间, 就只返回这个工作空间关联的信息
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
	// 当前页码，默认为1
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认10
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryInstancesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInstancesRequest) GoString() string {
	return s.String()
}

func (s *QueryInstancesRequest) SetAuthToken(v string) *QueryInstancesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInstancesRequest) SetProductInstanceId(v string) *QueryInstancesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInstancesRequest) SetTenant(v string) *QueryInstancesRequest {
	s.Tenant = &v
	return s
}

func (s *QueryInstancesRequest) SetWorkspace(v string) *QueryInstancesRequest {
	s.Workspace = &v
	return s
}

func (s *QueryInstancesRequest) SetPageNum(v int) *QueryInstancesRequest {
	s.PageNum = &v
	return s
}

func (s *QueryInstancesRequest) SetPageSize(v int) *QueryInstancesRequest {
	s.PageSize = &v
	return s
}

type QueryInstancesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户列表
	Instances []*Instance `json:"instances,omitempty" xml:"instances,omitempty" require:"true" type:"Repeated"`
	// 当前页码
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 记录总数
	TotalCount *int `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryInstancesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInstancesResponse) GoString() string {
	return s.String()
}

func (s *QueryInstancesResponse) SetReqMsgId(v string) *QueryInstancesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInstancesResponse) SetResultCode(v string) *QueryInstancesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInstancesResponse) SetResultMsg(v string) *QueryInstancesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInstancesResponse) SetInstances(v []*Instance) *QueryInstancesResponse {
	s.Instances = v
	return s
}

func (s *QueryInstancesResponse) SetPageNum(v int) *QueryInstancesResponse {
	s.PageNum = &v
	return s
}

func (s *QueryInstancesResponse) SetPageSize(v int) *QueryInstancesResponse {
	s.PageSize = &v
	return s
}

func (s *QueryInstancesResponse) SetTotalCount(v int) *QueryInstancesResponse {
	s.TotalCount = &v
	return s
}

type QueryProductsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品名称, 选填, 如果指定了产品名称就只返回指定产品的信息
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 当前页码，默认为1
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认10
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryProductsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProductsRequest) GoString() string {
	return s.String()
}

func (s *QueryProductsRequest) SetAuthToken(v string) *QueryProductsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProductsRequest) SetProductInstanceId(v string) *QueryProductsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProductsRequest) SetProductName(v string) *QueryProductsRequest {
	s.ProductName = &v
	return s
}

func (s *QueryProductsRequest) SetInstanceId(v string) *QueryProductsRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryProductsRequest) SetPageNum(v int) *QueryProductsRequest {
	s.PageNum = &v
	return s
}

func (s *QueryProductsRequest) SetPageSize(v int) *QueryProductsRequest {
	s.PageSize = &v
	return s
}

type QueryProductsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品列表
	Products []*Product `json:"products,omitempty" xml:"products,omitempty" require:"true" type:"Repeated"`
	// 当前页码
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 记录总数
	TotalCount *int `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryProductsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProductsResponse) GoString() string {
	return s.String()
}

func (s *QueryProductsResponse) SetReqMsgId(v string) *QueryProductsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProductsResponse) SetResultCode(v string) *QueryProductsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProductsResponse) SetResultMsg(v string) *QueryProductsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProductsResponse) SetProducts(v []*Product) *QueryProductsResponse {
	s.Products = v
	return s
}

func (s *QueryProductsResponse) SetPageNum(v int) *QueryProductsResponse {
	s.PageNum = &v
	return s
}

func (s *QueryProductsResponse) SetPageSize(v int) *QueryProductsResponse {
	s.PageSize = &v
	return s
}

func (s *QueryProductsResponse) SetTotalCount(v int) *QueryProductsResponse {
	s.TotalCount = &v
	return s
}

type QueryEndpointsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 网络类型, classic, vpc
	Network *string `json:"network,omitempty" xml:"network,omitempty" require:"true"`
	// 当前页数
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小, 考虑到数据量并不多, 建议设置分页足够大(就10几个), 比如100, 一次性拿走所有数据
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 租户名
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 工作区名称, 如果不填, 则返回全部workspace的信息
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
}

func (s QueryEndpointsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEndpointsRequest) GoString() string {
	return s.String()
}

func (s *QueryEndpointsRequest) SetAuthToken(v string) *QueryEndpointsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEndpointsRequest) SetProductInstanceId(v string) *QueryEndpointsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEndpointsRequest) SetNetwork(v string) *QueryEndpointsRequest {
	s.Network = &v
	return s
}

func (s *QueryEndpointsRequest) SetPageNum(v int64) *QueryEndpointsRequest {
	s.PageNum = &v
	return s
}

func (s *QueryEndpointsRequest) SetPageSize(v int64) *QueryEndpointsRequest {
	s.PageSize = &v
	return s
}

func (s *QueryEndpointsRequest) SetTenant(v string) *QueryEndpointsRequest {
	s.Tenant = &v
	return s
}

func (s *QueryEndpointsRequest) SetWorkspace(v string) *QueryEndpointsRequest {
	s.Workspace = &v
	return s
}

type QueryEndpointsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// endpoint信息
	Endpoints []*AksEndpoint `json:"endpoints,omitempty" xml:"endpoints,omitempty" require:"true" type:"Repeated"`
	// 当前页数
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryEndpointsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEndpointsResponse) GoString() string {
	return s.String()
}

func (s *QueryEndpointsResponse) SetReqMsgId(v string) *QueryEndpointsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEndpointsResponse) SetResultCode(v string) *QueryEndpointsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEndpointsResponse) SetResultMsg(v string) *QueryEndpointsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEndpointsResponse) SetEndpoints(v []*AksEndpoint) *QueryEndpointsResponse {
	s.Endpoints = v
	return s
}

func (s *QueryEndpointsResponse) SetPageNum(v int64) *QueryEndpointsResponse {
	s.PageNum = &v
	return s
}

func (s *QueryEndpointsResponse) SetPageSize(v int64) *QueryEndpointsResponse {
	s.PageSize = &v
	return s
}

func (s *QueryEndpointsResponse) SetTotalCount(v int64) *QueryEndpointsResponse {
	s.TotalCount = &v
	return s
}

type ScaleoutClustersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据中心
	DataCenter *string `json:"data_center,omitempty" xml:"data_center,omitempty" require:"true"`
	// 生效 Domain
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// 生效 instanceId，如果是需要全局生效使用 ALL_INSTANCE_ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 网络类型，无特殊需求填写 CLASSIC
	NetworkType *string `json:"network_type,omitempty" xml:"network_type,omitempty" require:"true"`
	// 产品名称
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 扩容 IP
	ServiceIp *string `json:"service_ip,omitempty" xml:"service_ip,omitempty" require:"true"`
	// 生效端口
	ServicePort *int64 `json:"service_port,omitempty" xml:"service_port,omitempty" require:"true"`
}

func (s ScaleoutClustersRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleoutClustersRequest) GoString() string {
	return s.String()
}

func (s *ScaleoutClustersRequest) SetAuthToken(v string) *ScaleoutClustersRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleoutClustersRequest) SetProductInstanceId(v string) *ScaleoutClustersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleoutClustersRequest) SetDataCenter(v string) *ScaleoutClustersRequest {
	s.DataCenter = &v
	return s
}

func (s *ScaleoutClustersRequest) SetDomain(v string) *ScaleoutClustersRequest {
	s.Domain = &v
	return s
}

func (s *ScaleoutClustersRequest) SetInstanceId(v string) *ScaleoutClustersRequest {
	s.InstanceId = &v
	return s
}

func (s *ScaleoutClustersRequest) SetNetworkType(v string) *ScaleoutClustersRequest {
	s.NetworkType = &v
	return s
}

func (s *ScaleoutClustersRequest) SetProduct(v string) *ScaleoutClustersRequest {
	s.Product = &v
	return s
}

func (s *ScaleoutClustersRequest) SetServiceIp(v string) *ScaleoutClustersRequest {
	s.ServiceIp = &v
	return s
}

func (s *ScaleoutClustersRequest) SetServicePort(v int64) *ScaleoutClustersRequest {
	s.ServicePort = &v
	return s
}

type ScaleoutClustersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ScaleoutClustersResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleoutClustersResponse) GoString() string {
	return s.String()
}

func (s *ScaleoutClustersResponse) SetReqMsgId(v string) *ScaleoutClustersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleoutClustersResponse) SetResultCode(v string) *ScaleoutClustersResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleoutClustersResponse) SetResultMsg(v string) *ScaleoutClustersResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleoutClustersResponse) SetResult(v bool) *ScaleoutClustersResponse {
	s.Result = &v
	return s
}

type ScaleinClusterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据中心
	DataCenter *string `json:"data_center,omitempty" xml:"data_center,omitempty" require:"true"`
	// 生效 domain
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// 生效实例 ID，全部生效则为 ALL_INSTANCE_ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 网络类型，无特殊情况填写 CLASSIC
	NetworkType *string `json:"network_type,omitempty" xml:"network_type,omitempty" require:"true"`
	// 产品名称
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 缩容 IP
	ServiceIp *string `json:"service_ip,omitempty" xml:"service_ip,omitempty" require:"true"`
	// 生效端口
	ServicePort *int64 `json:"service_port,omitempty" xml:"service_port,omitempty" require:"true"`
}

func (s ScaleinClusterRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleinClusterRequest) GoString() string {
	return s.String()
}

func (s *ScaleinClusterRequest) SetAuthToken(v string) *ScaleinClusterRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleinClusterRequest) SetProductInstanceId(v string) *ScaleinClusterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleinClusterRequest) SetDataCenter(v string) *ScaleinClusterRequest {
	s.DataCenter = &v
	return s
}

func (s *ScaleinClusterRequest) SetDomain(v string) *ScaleinClusterRequest {
	s.Domain = &v
	return s
}

func (s *ScaleinClusterRequest) SetInstanceId(v string) *ScaleinClusterRequest {
	s.InstanceId = &v
	return s
}

func (s *ScaleinClusterRequest) SetNetworkType(v string) *ScaleinClusterRequest {
	s.NetworkType = &v
	return s
}

func (s *ScaleinClusterRequest) SetProduct(v string) *ScaleinClusterRequest {
	s.Product = &v
	return s
}

func (s *ScaleinClusterRequest) SetServiceIp(v string) *ScaleinClusterRequest {
	s.ServiceIp = &v
	return s
}

func (s *ScaleinClusterRequest) SetServicePort(v int64) *ScaleinClusterRequest {
	s.ServicePort = &v
	return s
}

type ScaleinClusterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ScaleinClusterResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleinClusterResponse) GoString() string {
	return s.String()
}

func (s *ScaleinClusterResponse) SetReqMsgId(v string) *ScaleinClusterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleinClusterResponse) SetResultCode(v string) *ScaleinClusterResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleinClusterResponse) SetResultMsg(v string) *ScaleinClusterResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleinClusterResponse) SetResult(v bool) *ScaleinClusterResponse {
	s.Result = &v
	return s
}

type SetClustersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 生效域名
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// 开启/关闭
	Enable *bool `json:"enable,omitempty" xml:"enable,omitempty" require:"true"`
	// 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 作用 IP
	ServiceIp *string `json:"service_ip,omitempty" xml:"service_ip,omitempty" require:"true"`
	// 网络类型，如果无特殊需求 CLASSIC
	NetworkType *string `json:"network_type,omitempty" xml:"network_type,omitempty" require:"true"`
	// 产品名称
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
}

func (s SetClustersRequest) String() string {
	return tea.Prettify(s)
}

func (s SetClustersRequest) GoString() string {
	return s.String()
}

func (s *SetClustersRequest) SetAuthToken(v string) *SetClustersRequest {
	s.AuthToken = &v
	return s
}

func (s *SetClustersRequest) SetProductInstanceId(v string) *SetClustersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetClustersRequest) SetDomain(v string) *SetClustersRequest {
	s.Domain = &v
	return s
}

func (s *SetClustersRequest) SetEnable(v bool) *SetClustersRequest {
	s.Enable = &v
	return s
}

func (s *SetClustersRequest) SetInstanceId(v string) *SetClustersRequest {
	s.InstanceId = &v
	return s
}

func (s *SetClustersRequest) SetServiceIp(v string) *SetClustersRequest {
	s.ServiceIp = &v
	return s
}

func (s *SetClustersRequest) SetNetworkType(v string) *SetClustersRequest {
	s.NetworkType = &v
	return s
}

func (s *SetClustersRequest) SetProduct(v string) *SetClustersRequest {
	s.Product = &v
	return s
}

type SetClustersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SetClustersResponse) String() string {
	return tea.Prettify(s)
}

func (s SetClustersResponse) GoString() string {
	return s.String()
}

func (s *SetClustersResponse) SetReqMsgId(v string) *SetClustersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetClustersResponse) SetResultCode(v string) *SetClustersResponse {
	s.ResultCode = &v
	return s
}

func (s *SetClustersResponse) SetResultMsg(v string) *SetClustersResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetClustersResponse) SetResult(v bool) *SetClustersResponse {
	s.Result = &v
	return s
}

type GetInstancesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 共享中间件实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 租户name
	MiddlewareTenant *string `json:"middleware_tenant,omitempty" xml:"middleware_tenant,omitempty"`
	// workspace name
	MiddlewareWorkspace *string `json:"middleware_workspace,omitempty" xml:"middleware_workspace,omitempty"`
}

func (s GetInstancesRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInstancesRequest) GoString() string {
	return s.String()
}

func (s *GetInstancesRequest) SetAuthToken(v string) *GetInstancesRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInstancesRequest) SetProductInstanceId(v string) *GetInstancesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInstancesRequest) SetInstanceId(v string) *GetInstancesRequest {
	s.InstanceId = &v
	return s
}

func (s *GetInstancesRequest) SetMiddlewareTenant(v string) *GetInstancesRequest {
	s.MiddlewareTenant = &v
	return s
}

func (s *GetInstancesRequest) SetMiddlewareWorkspace(v string) *GetInstancesRequest {
	s.MiddlewareWorkspace = &v
	return s
}

type GetInstancesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// instance id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
	MiddlewareTenant *string `json:"middleware_tenant,omitempty" xml:"middleware_tenant,omitempty"`
	// 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
	MiddlewareWorkspace *string `json:"middleware_workspace,omitempty" xml:"middleware_workspace,omitempty"`
}

func (s GetInstancesResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInstancesResponse) GoString() string {
	return s.String()
}

func (s *GetInstancesResponse) SetReqMsgId(v string) *GetInstancesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInstancesResponse) SetResultCode(v string) *GetInstancesResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInstancesResponse) SetResultMsg(v string) *GetInstancesResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInstancesResponse) SetInstanceId(v string) *GetInstancesResponse {
	s.InstanceId = &v
	return s
}

func (s *GetInstancesResponse) SetMiddlewareTenant(v string) *GetInstancesResponse {
	s.MiddlewareTenant = &v
	return s
}

func (s *GetInstancesResponse) SetMiddlewareWorkspace(v string) *GetInstancesResponse {
	s.MiddlewareWorkspace = &v
	return s
}

type CreateAccesskeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 该参数是一个instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 该字段为AK/SK的创建名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateAccesskeyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAccesskeyRequest) GoString() string {
	return s.String()
}

func (s *CreateAccesskeyRequest) SetAuthToken(v string) *CreateAccesskeyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAccesskeyRequest) SetProductInstanceId(v string) *CreateAccesskeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAccesskeyRequest) SetInstanceId(v string) *CreateAccesskeyRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateAccesskeyRequest) SetName(v string) *CreateAccesskeyRequest {
	s.Name = &v
	return s
}

type CreateAccesskeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// AccessKey对象
	Accesskey *AccessKey `json:"accesskey,omitempty" xml:"accesskey,omitempty"`
}

func (s CreateAccesskeyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAccesskeyResponse) GoString() string {
	return s.String()
}

func (s *CreateAccesskeyResponse) SetReqMsgId(v string) *CreateAccesskeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAccesskeyResponse) SetResultCode(v string) *CreateAccesskeyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAccesskeyResponse) SetResultMsg(v string) *CreateAccesskeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAccesskeyResponse) SetAccesskey(v *AccessKey) *CreateAccesskeyResponse {
	s.Accesskey = v
	return s
}

type GetAccesskeyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 该参数是一个instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	//
	// 该字段为AK/SK的创建名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s GetAccesskeyRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAccesskeyRequest) GoString() string {
	return s.String()
}

func (s *GetAccesskeyRequest) SetAuthToken(v string) *GetAccesskeyRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAccesskeyRequest) SetProductInstanceId(v string) *GetAccesskeyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAccesskeyRequest) SetInstanceId(v string) *GetAccesskeyRequest {
	s.InstanceId = &v
	return s
}

func (s *GetAccesskeyRequest) SetName(v string) *GetAccesskeyRequest {
	s.Name = &v
	return s
}

type GetAccesskeyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// AccessKey对象
	Accesskey *AccessKey `json:"accesskey,omitempty" xml:"accesskey,omitempty"`
}

func (s GetAccesskeyResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAccesskeyResponse) GoString() string {
	return s.String()
}

func (s *GetAccesskeyResponse) SetReqMsgId(v string) *GetAccesskeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAccesskeyResponse) SetResultCode(v string) *GetAccesskeyResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAccesskeyResponse) SetResultMsg(v string) *GetAccesskeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAccesskeyResponse) SetAccesskey(v *AccessKey) *GetAccesskeyResponse {
	s.Accesskey = v
	return s
}

type GetMiddlewareMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
}

func (s GetMiddlewareMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMiddlewareMetaRequest) GoString() string {
	return s.String()
}

func (s *GetMiddlewareMetaRequest) SetAuthToken(v string) *GetMiddlewareMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMiddlewareMetaRequest) SetProductInstanceId(v string) *GetMiddlewareMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetMiddlewareMetaRequest) SetTenantId(v string) *GetMiddlewareMetaRequest {
	s.TenantId = &v
	return s
}

func (s *GetMiddlewareMetaRequest) SetWorkspaceId(v string) *GetMiddlewareMetaRequest {
	s.WorkspaceId = &v
	return s
}

type GetMiddlewareMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 工作空间
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// acvip 连接地址
	AcvipEndpoint *string `json:"acvip_endpoint,omitempty" xml:"acvip_endpoint,omitempty"`
}

func (s GetMiddlewareMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMiddlewareMetaResponse) GoString() string {
	return s.String()
}

func (s *GetMiddlewareMetaResponse) SetReqMsgId(v string) *GetMiddlewareMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetResultCode(v string) *GetMiddlewareMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetResultMsg(v string) *GetMiddlewareMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetTenantId(v string) *GetMiddlewareMetaResponse {
	s.TenantId = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetWorkspaceId(v string) *GetMiddlewareMetaResponse {
	s.WorkspaceId = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetInstanceId(v string) *GetMiddlewareMetaResponse {
	s.InstanceId = &v
	return s
}

func (s *GetMiddlewareMetaResponse) SetAcvipEndpoint(v string) *GetMiddlewareMetaResponse {
	s.AcvipEndpoint = &v
	return s
}

type GetWorkspacegroupInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间组
	WorkspaceGroup *string `json:"workspace_group,omitempty" xml:"workspace_group,omitempty" require:"true"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 是否需要原始的instanceId
	NeedReal *bool `json:"need_real,omitempty" xml:"need_real,omitempty"`
	// workspace
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
}

func (s GetWorkspacegroupInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspacegroupInstanceRequest) GoString() string {
	return s.String()
}

func (s *GetWorkspacegroupInstanceRequest) SetAuthToken(v string) *GetWorkspacegroupInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetProductInstanceId(v string) *GetWorkspacegroupInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetTenantId(v string) *GetWorkspacegroupInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetWorkspaceGroup(v string) *GetWorkspacegroupInstanceRequest {
	s.WorkspaceGroup = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetClusterId(v string) *GetWorkspacegroupInstanceRequest {
	s.ClusterId = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetNeedReal(v bool) *GetWorkspacegroupInstanceRequest {
	s.NeedReal = &v
	return s
}

func (s *GetWorkspacegroupInstanceRequest) SetWorkspace(v string) *GetWorkspacegroupInstanceRequest {
	s.Workspace = &v
	return s
}

type GetWorkspacegroupInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// instanceId
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetWorkspacegroupInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspacegroupInstanceResponse) GoString() string {
	return s.String()
}

func (s *GetWorkspacegroupInstanceResponse) SetReqMsgId(v string) *GetWorkspacegroupInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetWorkspacegroupInstanceResponse) SetResultCode(v string) *GetWorkspacegroupInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetWorkspacegroupInstanceResponse) SetResultMsg(v string) *GetWorkspacegroupInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetWorkspacegroupInstanceResponse) SetData(v string) *GetWorkspacegroupInstanceResponse {
	s.Data = &v
	return s
}

type QueryMiddlewareClustermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// XXX
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// workspace_group
	WorkspaceGroup *string `json:"workspace_group,omitempty" xml:"workspace_group,omitempty" require:"true"`
}

func (s QueryMiddlewareClustermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMiddlewareClustermodeRequest) GoString() string {
	return s.String()
}

func (s *QueryMiddlewareClustermodeRequest) SetAuthToken(v string) *QueryMiddlewareClustermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMiddlewareClustermodeRequest) SetProductInstanceId(v string) *QueryMiddlewareClustermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMiddlewareClustermodeRequest) SetTenantId(v string) *QueryMiddlewareClustermodeRequest {
	s.TenantId = &v
	return s
}

func (s *QueryMiddlewareClustermodeRequest) SetWorkspaceGroup(v string) *QueryMiddlewareClustermodeRequest {
	s.WorkspaceGroup = &v
	return s
}

type QueryMiddlewareClustermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 集群模式
	Data *ClusterMode `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryMiddlewareClustermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMiddlewareClustermodeResponse) GoString() string {
	return s.String()
}

func (s *QueryMiddlewareClustermodeResponse) SetReqMsgId(v string) *QueryMiddlewareClustermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMiddlewareClustermodeResponse) SetResultCode(v string) *QueryMiddlewareClustermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMiddlewareClustermodeResponse) SetResultMsg(v string) *QueryMiddlewareClustermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMiddlewareClustermodeResponse) SetData(v *ClusterMode) *QueryMiddlewareClustermodeResponse {
	s.Data = v
	return s
}

type QueryMiddlewareClustersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryMiddlewareClustersRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMiddlewareClustersRequest) GoString() string {
	return s.String()
}

func (s *QueryMiddlewareClustersRequest) SetAuthToken(v string) *QueryMiddlewareClustersRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMiddlewareClustersRequest) SetProductInstanceId(v string) *QueryMiddlewareClustersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMiddlewareClustersRequest) SetTenantId(v string) *QueryMiddlewareClustersRequest {
	s.TenantId = &v
	return s
}

type QueryMiddlewareClustersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 集群列表
	Data []*MiddlewareCluster `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryMiddlewareClustersResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMiddlewareClustersResponse) GoString() string {
	return s.String()
}

func (s *QueryMiddlewareClustersResponse) SetReqMsgId(v string) *QueryMiddlewareClustersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMiddlewareClustersResponse) SetResultCode(v string) *QueryMiddlewareClustersResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMiddlewareClustersResponse) SetResultMsg(v string) *QueryMiddlewareClustersResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMiddlewareClustersResponse) SetData(v []*MiddlewareCluster) *QueryMiddlewareClustersResponse {
	s.Data = v
	return s
}

type BindMiddlewareInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间组
	WorkspaceGroup *string `json:"workspace_group,omitempty" xml:"workspace_group,omitempty" require:"true"`
	// region
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 工作空间，多个中间使用"," 隔开
	Workspaces *string `json:"workspaces,omitempty" xml:"workspaces,omitempty" require:"true"`
}

func (s BindMiddlewareInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s BindMiddlewareInstanceRequest) GoString() string {
	return s.String()
}

func (s *BindMiddlewareInstanceRequest) SetAuthToken(v string) *BindMiddlewareInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *BindMiddlewareInstanceRequest) SetProductInstanceId(v string) *BindMiddlewareInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindMiddlewareInstanceRequest) SetTenantId(v string) *BindMiddlewareInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *BindMiddlewareInstanceRequest) SetWorkspaceGroup(v string) *BindMiddlewareInstanceRequest {
	s.WorkspaceGroup = &v
	return s
}

func (s *BindMiddlewareInstanceRequest) SetClusterId(v string) *BindMiddlewareInstanceRequest {
	s.ClusterId = &v
	return s
}

func (s *BindMiddlewareInstanceRequest) SetWorkspaces(v string) *BindMiddlewareInstanceRequest {
	s.Workspaces = &v
	return s
}

type BindMiddlewareInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回绑定实例信息
	Data *BindInstance `json:"data,omitempty" xml:"data,omitempty"`
}

func (s BindMiddlewareInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s BindMiddlewareInstanceResponse) GoString() string {
	return s.String()
}

func (s *BindMiddlewareInstanceResponse) SetReqMsgId(v string) *BindMiddlewareInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindMiddlewareInstanceResponse) SetResultCode(v string) *BindMiddlewareInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *BindMiddlewareInstanceResponse) SetResultMsg(v string) *BindMiddlewareInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindMiddlewareInstanceResponse) SetData(v *BindInstance) *BindMiddlewareInstanceResponse {
	s.Data = v
	return s
}

type UnbindMiddlewareInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间
	WorkspaceGroup *string `json:"workspace_group,omitempty" xml:"workspace_group,omitempty" require:"true"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 工作空间，如果有多个则使用 "," 隔开
	Workspaces *string `json:"workspaces,omitempty" xml:"workspaces,omitempty" require:"true"`
}

func (s UnbindMiddlewareInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindMiddlewareInstanceRequest) GoString() string {
	return s.String()
}

func (s *UnbindMiddlewareInstanceRequest) SetAuthToken(v string) *UnbindMiddlewareInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindMiddlewareInstanceRequest) SetProductInstanceId(v string) *UnbindMiddlewareInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindMiddlewareInstanceRequest) SetTenantId(v string) *UnbindMiddlewareInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *UnbindMiddlewareInstanceRequest) SetWorkspaceGroup(v string) *UnbindMiddlewareInstanceRequest {
	s.WorkspaceGroup = &v
	return s
}

func (s *UnbindMiddlewareInstanceRequest) SetClusterId(v string) *UnbindMiddlewareInstanceRequest {
	s.ClusterId = &v
	return s
}

func (s *UnbindMiddlewareInstanceRequest) SetWorkspaces(v string) *UnbindMiddlewareInstanceRequest {
	s.Workspaces = &v
	return s
}

type UnbindMiddlewareInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UnbindMiddlewareInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindMiddlewareInstanceResponse) GoString() string {
	return s.String()
}

func (s *UnbindMiddlewareInstanceResponse) SetReqMsgId(v string) *UnbindMiddlewareInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindMiddlewareInstanceResponse) SetResultCode(v string) *UnbindMiddlewareInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindMiddlewareInstanceResponse) SetResultMsg(v string) *UnbindMiddlewareInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnbindMiddlewareInstanceResponse) SetData(v bool) *UnbindMiddlewareInstanceResponse {
	s.Data = &v
	return s
}

type PushLicenceMeterdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品Code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 规格
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty"`
	// 实例ID, 如果是SOFA产品，则表示SOFA的实例ID。
	// 如果不传则认为是当前环境的总使用量；
	// 如果传了则认为是特定instanceId内的使用量
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 原始计量数据，KV结构。
	// 每一对KV 对应一个计量项及其值；Key 为计量项Code，value为其具体的值。比如，某产品有TPS 和节点数两个计量项。
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 用量发生的时间
	GmtMeter *string `json:"gmt_meter,omitempty" xml:"gmt_meter,omitempty" require:"true"`
}

func (s PushLicenceMeterdataRequest) String() string {
	return tea.Prettify(s)
}

func (s PushLicenceMeterdataRequest) GoString() string {
	return s.String()
}

func (s *PushLicenceMeterdataRequest) SetAuthToken(v string) *PushLicenceMeterdataRequest {
	s.AuthToken = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetProductInstanceId(v string) *PushLicenceMeterdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetProductCode(v string) *PushLicenceMeterdataRequest {
	s.ProductCode = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetCommodityCode(v string) *PushLicenceMeterdataRequest {
	s.CommodityCode = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetSpecCode(v string) *PushLicenceMeterdataRequest {
	s.SpecCode = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetInstanceId(v string) *PushLicenceMeterdataRequest {
	s.InstanceId = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetUserId(v string) *PushLicenceMeterdataRequest {
	s.UserId = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetData(v string) *PushLicenceMeterdataRequest {
	s.Data = &v
	return s
}

func (s *PushLicenceMeterdataRequest) SetGmtMeter(v string) *PushLicenceMeterdataRequest {
	s.GmtMeter = &v
	return s
}

type PushLicenceMeterdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否推送成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 是否需要重发，success为false情况下才有意义
	NeedRetry *bool `json:"need_retry,omitempty" xml:"need_retry,omitempty"`
}

func (s PushLicenceMeterdataResponse) String() string {
	return tea.Prettify(s)
}

func (s PushLicenceMeterdataResponse) GoString() string {
	return s.String()
}

func (s *PushLicenceMeterdataResponse) SetReqMsgId(v string) *PushLicenceMeterdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushLicenceMeterdataResponse) SetResultCode(v string) *PushLicenceMeterdataResponse {
	s.ResultCode = &v
	return s
}

func (s *PushLicenceMeterdataResponse) SetResultMsg(v string) *PushLicenceMeterdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushLicenceMeterdataResponse) SetSuccess(v bool) *PushLicenceMeterdataResponse {
	s.Success = &v
	return s
}

func (s *PushLicenceMeterdataResponse) SetNeedRetry(v bool) *PushLicenceMeterdataResponse {
	s.NeedRetry = &v
	return s
}

type PagequeryLicenceMeterdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品Code，如果不传参数，默认是“SOFA”
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 传入商品Code，必填：mesh、mq、dtx 等
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// SOFA的实例ID。
	// 如果不传则查询总量（合并所有实例的数据）
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 计量开始时间，只支持整点时间
	MeterBegin *string `json:"meter_begin,omitempty" xml:"meter_begin,omitempty" require:"true"`
	// 计量结束时间，只支持整点时间（不包含）
	MeterEnd *string `json:"meter_end,omitempty" xml:"meter_end,omitempty" require:"true"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 每页显示条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryLicenceMeterdataRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryLicenceMeterdataRequest) GoString() string {
	return s.String()
}

func (s *PagequeryLicenceMeterdataRequest) SetAuthToken(v string) *PagequeryLicenceMeterdataRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetProductInstanceId(v string) *PagequeryLicenceMeterdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetProductCode(v string) *PagequeryLicenceMeterdataRequest {
	s.ProductCode = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetCommodityCode(v string) *PagequeryLicenceMeterdataRequest {
	s.CommodityCode = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetInstanceId(v string) *PagequeryLicenceMeterdataRequest {
	s.InstanceId = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetMeterBegin(v string) *PagequeryLicenceMeterdataRequest {
	s.MeterBegin = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetMeterEnd(v string) *PagequeryLicenceMeterdataRequest {
	s.MeterEnd = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetCurrentPage(v int64) *PagequeryLicenceMeterdataRequest {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryLicenceMeterdataRequest) SetPageSize(v int64) *PagequeryLicenceMeterdataRequest {
	s.PageSize = &v
	return s
}

type PagequeryLicenceMeterdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 总页数
	TotalPage *string `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 计量数据
	MeterDataList []*MeterDataModel `json:"meter_data_list,omitempty" xml:"meter_data_list,omitempty" type:"Repeated"`
}

func (s PagequeryLicenceMeterdataResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryLicenceMeterdataResponse) GoString() string {
	return s.String()
}

func (s *PagequeryLicenceMeterdataResponse) SetReqMsgId(v string) *PagequeryLicenceMeterdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetResultCode(v string) *PagequeryLicenceMeterdataResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetResultMsg(v string) *PagequeryLicenceMeterdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetSuccess(v bool) *PagequeryLicenceMeterdataResponse {
	s.Success = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetCurrentPage(v int64) *PagequeryLicenceMeterdataResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetTotalPage(v string) *PagequeryLicenceMeterdataResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryLicenceMeterdataResponse) SetMeterDataList(v []*MeterDataModel) *PagequeryLicenceMeterdataResponse {
	s.MeterDataList = v
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
				"sdk_version":      tea.String("1.2.0"),
				"_prod_code":       tea.String("osp"),
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
 * Description: 查询实例信息
 * Summary: 查询实例信息
 */
func (client *Client) QueryInstances(request *QueryInstancesRequest) (_result *QueryInstancesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInstancesResponse{}
	_body, _err := client.QueryInstancesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询实例信息
 * Summary: 查询实例信息
 */
func (client *Client) QueryInstancesEx(request *QueryInstancesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInstancesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInstancesResponse{}
	_body, _err := client.DoRequest(tea.String("2.0"), tea.String("sofa.osp.instances.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品信息
 * Summary: 查询产品信息
 */
func (client *Client) QueryProducts(request *QueryProductsRequest) (_result *QueryProductsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProductsResponse{}
	_body, _err := client.QueryProductsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品信息
 * Summary: 查询产品信息
 */
func (client *Client) QueryProductsEx(request *QueryProductsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProductsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProductsResponse{}
	_body, _err := client.DoRequest(tea.String("2.0"), tea.String("sofa.osp.products.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取共享中间件参数信息
 * Summary: 获取共享中间件参数信息
 */
func (client *Client) QueryEndpoints(request *QueryEndpointsRequest) (_result *QueryEndpointsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEndpointsResponse{}
	_body, _err := client.QueryEndpointsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取共享中间件参数信息
 * Summary: 获取共享中间件参数信息
 */
func (client *Client) QueryEndpointsEx(request *QueryEndpointsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEndpointsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEndpointsResponse{}
	_body, _err := client.DoRequest(tea.String("2.0"), tea.String("sofa.osp.endpoints.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对 domain 进行扩容操作
 * Summary: 扩容接口
 */
func (client *Client) ScaleoutClusters(request *ScaleoutClustersRequest) (_result *ScaleoutClustersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleoutClustersResponse{}
	_body, _err := client.ScaleoutClustersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对 domain 进行扩容操作
 * Summary: 扩容接口
 */
func (client *Client) ScaleoutClustersEx(request *ScaleoutClustersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleoutClustersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleoutClustersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.clusters.scaleout"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对 domain 进行缩容
 * Summary: 缩容接口
 */
func (client *Client) ScaleinCluster(request *ScaleinClusterRequest) (_result *ScaleinClusterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleinClusterResponse{}
	_body, _err := client.ScaleinClusterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对 domain 进行缩容
 * Summary: 缩容接口
 */
func (client *Client) ScaleinClusterEx(request *ScaleinClusterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleinClusterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleinClusterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.cluster.scalein"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置节点是否生效（上下线）
 * Summary: 设置节点是否生效（上下线）
 */
func (client *Client) SetClusters(request *SetClustersRequest) (_result *SetClustersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetClustersResponse{}
	_body, _err := client.SetClustersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置节点是否生效（上下线）
 * Summary: 设置节点是否生效（上下线）
 */
func (client *Client) SetClustersEx(request *SetClustersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetClustersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetClustersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.clusters.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据instanceId获取对应的tenant和workspace的信息
 * Summary: 获取instance详情
 */
func (client *Client) GetInstances(request *GetInstancesRequest) (_result *GetInstancesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInstancesResponse{}
	_body, _err := client.GetInstancesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据instanceId获取对应的tenant和workspace的信息
 * Summary: 获取instance详情
 */
func (client *Client) GetInstancesEx(request *GetInstancesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInstancesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInstancesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.instances.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
 * Summary: 创建AK/SK的接口
 */
func (client *Client) CreateAccesskey(request *CreateAccesskeyRequest) (_result *CreateAccesskeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAccesskeyResponse{}
	_body, _err := client.CreateAccesskeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
 * Summary: 创建AK/SK的接口
 */
func (client *Client) CreateAccesskeyEx(request *CreateAccesskeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAccesskeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAccesskeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.accesskey.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据 instanceId 和 name获取AK/SK的接口
 * Summary: 获取AK/SK的接口
 */
func (client *Client) GetAccesskey(request *GetAccesskeyRequest) (_result *GetAccesskeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAccesskeyResponse{}
	_body, _err := client.GetAccesskeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据 instanceId 和 name获取AK/SK的接口
 * Summary: 获取AK/SK的接口
 */
func (client *Client) GetAccesskeyEx(request *GetAccesskeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAccesskeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAccesskeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.accesskey.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 中间件元数据获取
 * Summary: 中间件元数据获取
 */
func (client *Client) GetMiddlewareMeta(request *GetMiddlewareMetaRequest) (_result *GetMiddlewareMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMiddlewareMetaResponse{}
	_body, _err := client.GetMiddlewareMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 中间件元数据获取
 * Summary: 中间件元数据获取
 */
func (client *Client) GetMiddlewareMetaEx(request *GetMiddlewareMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMiddlewareMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMiddlewareMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.middleware.meta.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据workspaceGroup查询instanceId
 * Summary: 查询instanceId
 */
func (client *Client) GetWorkspacegroupInstance(request *GetWorkspacegroupInstanceRequest) (_result *GetWorkspacegroupInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetWorkspacegroupInstanceResponse{}
	_body, _err := client.GetWorkspacegroupInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据workspaceGroup查询instanceId
 * Summary: 查询instanceId
 */
func (client *Client) GetWorkspacegroupInstanceEx(request *GetWorkspacegroupInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetWorkspacegroupInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetWorkspacegroupInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.workspacegroup.instance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询中间件集群模式
 * Summary: 查询中间件集群模式
 */
func (client *Client) QueryMiddlewareClustermode(request *QueryMiddlewareClustermodeRequest) (_result *QueryMiddlewareClustermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMiddlewareClustermodeResponse{}
	_body, _err := client.QueryMiddlewareClustermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询中间件集群模式
 * Summary: 查询中间件集群模式
 */
func (client *Client) QueryMiddlewareClustermodeEx(request *QueryMiddlewareClustermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMiddlewareClustermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMiddlewareClustermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.middleware.clustermode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询中间件集群列表
 * Summary: 查询中间件集群列表
 */
func (client *Client) QueryMiddlewareClusters(request *QueryMiddlewareClustersRequest) (_result *QueryMiddlewareClustersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMiddlewareClustersResponse{}
	_body, _err := client.QueryMiddlewareClustersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询中间件集群列表
 * Summary: 查询中间件集群列表
 */
func (client *Client) QueryMiddlewareClustersEx(request *QueryMiddlewareClustersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMiddlewareClustersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMiddlewareClustersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.middleware.clusters.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定中间件列表
 * Summary: 绑定中间件列表
 */
func (client *Client) BindMiddlewareInstance(request *BindMiddlewareInstanceRequest) (_result *BindMiddlewareInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindMiddlewareInstanceResponse{}
	_body, _err := client.BindMiddlewareInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定中间件列表
 * Summary: 绑定中间件列表
 */
func (client *Client) BindMiddlewareInstanceEx(request *BindMiddlewareInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindMiddlewareInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindMiddlewareInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.middleware.instance.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: paas 解绑中间件
 * Summary: 解绑中间件实例
 */
func (client *Client) UnbindMiddlewareInstance(request *UnbindMiddlewareInstanceRequest) (_result *UnbindMiddlewareInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindMiddlewareInstanceResponse{}
	_body, _err := client.UnbindMiddlewareInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: paas 解绑中间件
 * Summary: 解绑中间件实例
 */
func (client *Client) UnbindMiddlewareInstanceEx(request *UnbindMiddlewareInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindMiddlewareInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindMiddlewareInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.middleware.instance.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: licence 实时计量数据推送
 * Summary: licence 实时计量数据推送
 */
func (client *Client) PushLicenceMeterdata(request *PushLicenceMeterdataRequest) (_result *PushLicenceMeterdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushLicenceMeterdataResponse{}
	_body, _err := client.PushLicenceMeterdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: licence 实时计量数据推送
 * Summary: licence 实时计量数据推送
 */
func (client *Client) PushLicenceMeterdataEx(request *PushLicenceMeterdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushLicenceMeterdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushLicenceMeterdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.licence.meterdata.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询 license 的计量数据
 * Summary: 分页查询 license 的计量数据
 */
func (client *Client) PagequeryLicenceMeterdata(request *PagequeryLicenceMeterdataRequest) (_result *PagequeryLicenceMeterdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryLicenceMeterdataResponse{}
	_body, _err := client.PagequeryLicenceMeterdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询 license 的计量数据
 * Summary: 分页查询 license 的计量数据
 */
func (client *Client) PagequeryLicenceMeterdataEx(request *PagequeryLicenceMeterdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryLicenceMeterdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryLicenceMeterdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.osp.licence.meterdata.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
