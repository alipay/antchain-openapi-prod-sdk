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

// 资源池信息
type ResourcePool struct {
	// 资源池名称, Local站点下唯一
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true"`
	// 支持的资源类型
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// 资源池访问信息
	AccessInfo *string `json:"access_info,omitempty" xml:"access_info,omitempty" require:"true"`
	// 所属cloud的id
	CloudId *string `json:"cloud_id,omitempty" xml:"cloud_id,omitempty" require:"true"`
}

func (s ResourcePool) String() string {
	return tea.Prettify(s)
}

func (s ResourcePool) GoString() string {
	return s.String()
}

func (s *ResourcePool) SetName(v string) *ResourcePool {
	s.Name = &v
	return s
}

func (s *ResourcePool) SetProvider(v string) *ResourcePool {
	s.Provider = &v
	return s
}

func (s *ResourcePool) SetResourceType(v string) *ResourcePool {
	s.ResourceType = &v
	return s
}

func (s *ResourcePool) SetAccessInfo(v string) *ResourcePool {
	s.AccessInfo = &v
	return s
}

func (s *ResourcePool) SetCloudId(v string) *ResourcePool {
	s.CloudId = &v
	return s
}

// 地域
type Region struct {
	// 地域标识（与阿里云identity对齐）
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 地域的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// region的id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// 显示的名字，可重复
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 所在城市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 是否金区：FINANCIAL， NON_FINANCIAL
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
}

func (s Region) String() string {
	return tea.Prettify(s)
}

func (s Region) GoString() string {
	return s.String()
}

func (s *Region) SetIdentity(v string) *Region {
	s.Identity = &v
	return s
}

func (s *Region) SetName(v string) *Region {
	s.Name = &v
	return s
}

func (s *Region) SetRegionId(v string) *Region {
	s.RegionId = &v
	return s
}

func (s *Region) SetDisplayName(v string) *Region {
	s.DisplayName = &v
	return s
}

func (s *Region) SetCity(v string) *Region {
	s.City = &v
	return s
}

func (s *Region) SetTag(v string) *Region {
	s.Tag = &v
	return s
}

// 巡检使用的pod信息
type PodInfo struct {
	// podname
	PodName *string `json:"pod_name,omitempty" xml:"pod_name,omitempty" require:"true"`
	// 容器name
	ContainerName *string `json:"container_name,omitempty" xml:"container_name,omitempty" require:"true"`
	// ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty" require:"true"`
	// host ip
	HostIp *string `json:"host_ip,omitempty" xml:"host_ip,omitempty" require:"true"`
	// hostname
	HostName *string `json:"host_name,omitempty" xml:"host_name,omitempty"`
	// cpu
	Cpu *string `json:"cpu,omitempty" xml:"cpu,omitempty"`
	// 内存
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 产品码--应用名
	ProductApp *string `json:"product_app,omitempty" xml:"product_app,omitempty"`
	// 租户信息
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 环境信息
	//
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
}

func (s PodInfo) String() string {
	return tea.Prettify(s)
}

func (s PodInfo) GoString() string {
	return s.String()
}

func (s *PodInfo) SetPodName(v string) *PodInfo {
	s.PodName = &v
	return s
}

func (s *PodInfo) SetContainerName(v string) *PodInfo {
	s.ContainerName = &v
	return s
}

func (s *PodInfo) SetIp(v string) *PodInfo {
	s.Ip = &v
	return s
}

func (s *PodInfo) SetHostIp(v string) *PodInfo {
	s.HostIp = &v
	return s
}

func (s *PodInfo) SetHostName(v string) *PodInfo {
	s.HostName = &v
	return s
}

func (s *PodInfo) SetCpu(v string) *PodInfo {
	s.Cpu = &v
	return s
}

func (s *PodInfo) SetMemory(v string) *PodInfo {
	s.Memory = &v
	return s
}

func (s *PodInfo) SetStatus(v string) *PodInfo {
	s.Status = &v
	return s
}

func (s *PodInfo) SetProductApp(v string) *PodInfo {
	s.ProductApp = &v
	return s
}

func (s *PodInfo) SetTenantId(v string) *PodInfo {
	s.TenantId = &v
	return s
}

func (s *PodInfo) SetEnvId(v string) *PodInfo {
	s.EnvId = &v
	return s
}

// 机房
type Zone struct {
	// 机房的标识（与阿里云对齐）
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 机房的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 地域的id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// 机房内关联的资源池列表
	ResourcePools []*ResourcePool `json:"resource_pools,omitempty" xml:"resource_pools,omitempty" require:"true" type:"Repeated"`
	// 机房的id
	ZoneId *string `json:"zone_id,omitempty" xml:"zone_id,omitempty" require:"true"`
	// 显示的名字
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
}

func (s Zone) String() string {
	return tea.Prettify(s)
}

func (s Zone) GoString() string {
	return s.String()
}

func (s *Zone) SetIdentity(v string) *Zone {
	s.Identity = &v
	return s
}

func (s *Zone) SetName(v string) *Zone {
	s.Name = &v
	return s
}

func (s *Zone) SetRegionId(v string) *Zone {
	s.RegionId = &v
	return s
}

func (s *Zone) SetResourcePools(v []*ResourcePool) *Zone {
	s.ResourcePools = v
	return s
}

func (s *Zone) SetZoneId(v string) *Zone {
	s.ZoneId = &v
	return s
}

func (s *Zone) SetDisplayName(v string) *Zone {
	s.DisplayName = &v
	return s
}

// 单元（逻辑机房）
type Cell struct {
	// LDC下cellGroup的ID
	CellGroupId *string `json:"cell_group_id,omitempty" xml:"cell_group_id,omitempty"`
	// 单元的id
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// LDC的蓝绿着色
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// LDC的默认权重
	DefaultWeight *int64 `json:"default_weight,omitempty" xml:"default_weight,omitempty"`
	// LDC下是否灰度
	Gray *bool `json:"gray,omitempty" xml:"gray,omitempty"`
	// 单元的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 所在地域的id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// LDC的GRCZone类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 工作空间id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
	// 所属机房的id
	ZoneId *string `json:"zone_id,omitempty" xml:"zone_id,omitempty" require:"true"`
	// 显示的名字
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
}

func (s Cell) String() string {
	return tea.Prettify(s)
}

func (s Cell) GoString() string {
	return s.String()
}

func (s *Cell) SetCellGroupId(v string) *Cell {
	s.CellGroupId = &v
	return s
}

func (s *Cell) SetCellId(v string) *Cell {
	s.CellId = &v
	return s
}

func (s *Cell) SetColor(v string) *Cell {
	s.Color = &v
	return s
}

func (s *Cell) SetDefaultWeight(v int64) *Cell {
	s.DefaultWeight = &v
	return s
}

func (s *Cell) SetGray(v bool) *Cell {
	s.Gray = &v
	return s
}

func (s *Cell) SetName(v string) *Cell {
	s.Name = &v
	return s
}

func (s *Cell) SetRegionId(v string) *Cell {
	s.RegionId = &v
	return s
}

func (s *Cell) SetType(v string) *Cell {
	s.Type = &v
	return s
}

func (s *Cell) SetWorkspaceId(v string) *Cell {
	s.WorkspaceId = &v
	return s
}

func (s *Cell) SetZoneId(v string) *Cell {
	s.ZoneId = &v
	return s
}

func (s *Cell) SetDisplayName(v string) *Cell {
	s.DisplayName = &v
	return s
}

// 工作空间
type Workspace struct {
	// 包含的单元（逻辑机房）
	Cells []*Cell `json:"cells,omitempty" xml:"cells,omitempty" require:"true" type:"Repeated"`
	// 显示的名字
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// workspace的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 所属地域
	Region *Region `json:"region,omitempty" xml:"region,omitempty" require:"true"`
	// 工作空间的id
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
	// 机房列表
	Zones []*Zone `json:"zones,omitempty" xml:"zones,omitempty" require:"true" type:"Repeated"`
}

func (s Workspace) String() string {
	return tea.Prettify(s)
}

func (s Workspace) GoString() string {
	return s.String()
}

func (s *Workspace) SetCells(v []*Cell) *Workspace {
	s.Cells = v
	return s
}

func (s *Workspace) SetDisplayName(v string) *Workspace {
	s.DisplayName = &v
	return s
}

func (s *Workspace) SetName(v string) *Workspace {
	s.Name = &v
	return s
}

func (s *Workspace) SetRegion(v *Region) *Workspace {
	s.Region = v
	return s
}

func (s *Workspace) SetWorkspaceId(v string) *Workspace {
	s.WorkspaceId = &v
	return s
}

func (s *Workspace) SetZones(v []*Zone) *Workspace {
	s.Zones = v
	return s
}

// 云
type Cloud struct {
	// 云的ID
	CloudId *string `json:"cloud_id,omitempty" xml:"cloud_id,omitempty" require:"true"`
	// 云的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s Cloud) String() string {
	return tea.Prettify(s)
}

func (s Cloud) GoString() string {
	return s.String()
}

func (s *Cloud) SetCloudId(v string) *Cloud {
	s.CloudId = &v
	return s
}

func (s *Cloud) SetName(v string) *Cloud {
	s.Name = &v
	return s
}

// 巡检app信息
type AppInfo struct {
	// 集群里面该app的namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// pod信息列表
	PodList []*PodInfo `json:"pod_list,omitempty" xml:"pod_list,omitempty" require:"true" type:"Repeated"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// ap version
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// 应用类型
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
}

func (s AppInfo) String() string {
	return tea.Prettify(s)
}

func (s AppInfo) GoString() string {
	return s.String()
}

func (s *AppInfo) SetNamespace(v string) *AppInfo {
	s.Namespace = &v
	return s
}

func (s *AppInfo) SetPodList(v []*PodInfo) *AppInfo {
	s.PodList = v
	return s
}

func (s *AppInfo) SetAppName(v string) *AppInfo {
	s.AppName = &v
	return s
}

func (s *AppInfo) SetAppVersion(v string) *AppInfo {
	s.AppVersion = &v
	return s
}

func (s *AppInfo) SetAppType(v string) *AppInfo {
	s.AppType = &v
	return s
}

// LDC下的CellGroup
type CellGroup struct {
	// cellGroup的id
	CellGroupId *string `json:"cell_group_id,omitempty" xml:"cell_group_id,omitempty" require:"true"`
	// 默认gzone cell的id
	DefaultGzone *string `json:"default_gzone,omitempty" xml:"default_gzone,omitempty"`
	// 是否弹性
	Elastic *bool `json:"elastic,omitempty" xml:"elastic,omitempty"`
	// cellGroup的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 暂时不知道啥意思
	NormalDrstat *string `json:"normal_drstat,omitempty" xml:"normal_drstat,omitempty"`
	// 暂时不知道啥意思
	PressDrstat *string `json:"press_drstat,omitempty" xml:"press_drstat,omitempty"`
	// LDC下cellGroup的类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 显示的名字
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
}

func (s CellGroup) String() string {
	return tea.Prettify(s)
}

func (s CellGroup) GoString() string {
	return s.String()
}

func (s *CellGroup) SetCellGroupId(v string) *CellGroup {
	s.CellGroupId = &v
	return s
}

func (s *CellGroup) SetDefaultGzone(v string) *CellGroup {
	s.DefaultGzone = &v
	return s
}

func (s *CellGroup) SetElastic(v bool) *CellGroup {
	s.Elastic = &v
	return s
}

func (s *CellGroup) SetName(v string) *CellGroup {
	s.Name = &v
	return s
}

func (s *CellGroup) SetNormalDrstat(v string) *CellGroup {
	s.NormalDrstat = &v
	return s
}

func (s *CellGroup) SetPressDrstat(v string) *CellGroup {
	s.PressDrstat = &v
	return s
}

func (s *CellGroup) SetType(v string) *CellGroup {
	s.Type = &v
	return s
}

func (s *CellGroup) SetDisplayName(v string) *CellGroup {
	s.DisplayName = &v
	return s
}

// 参数对象
type ParamData struct {
	// 参数key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 参数值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
	// 类型, 对应Data的paramGroup
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 安全级别，脱敏用
	SecurityLevel *string `json:"security_level,omitempty" xml:"security_level,omitempty"`
}

func (s ParamData) String() string {
	return tea.Prettify(s)
}

func (s ParamData) GoString() string {
	return s.String()
}

func (s *ParamData) SetKey(v string) *ParamData {
	s.Key = &v
	return s
}

func (s *ParamData) SetValue(v string) *ParamData {
	s.Value = &v
	return s
}

func (s *ParamData) SetType(v string) *ParamData {
	s.Type = &v
	return s
}

func (s *ParamData) SetSecurityLevel(v string) *ParamData {
	s.SecurityLevel = &v
	return s
}

// 租户
type Tenant struct {
	// 租户名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 租户id
	TanentId *string `json:"tanent_id,omitempty" xml:"tanent_id,omitempty"`
}

func (s Tenant) String() string {
	return tea.Prettify(s)
}

func (s Tenant) GoString() string {
	return s.String()
}

func (s *Tenant) SetName(v string) *Tenant {
	s.Name = &v
	return s
}

func (s *Tenant) SetTanentId(v string) *Tenant {
	s.TanentId = &v
	return s
}

// 容器信息。
type Container struct {
	// 应用版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty"`
	// cpu核数，单位C。
	Cpu *int64 `json:"cpu,omitempty" xml:"cpu,omitempty"`
	// 宿主机ip。
	HostIp *string `json:"host_ip,omitempty" xml:"host_ip,omitempty"`
	// 宿主机名称。
	HostName *string `json:"host_name,omitempty" xml:"host_name,omitempty"`
	// 容器id。
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 容器镜像。
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
	// 容器ip。
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 内存大小，单位M。
	Memory *int64 `json:"memory,omitempty" xml:"memory,omitempty"`
	// 容器名称。
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 容器所在的pod。
	Pod *string `json:"pod,omitempty" xml:"pod,omitempty"`
	// 资源所属的资源池的唯一标识。
	ResourcePoolId *string `json:"resource_pool_id,omitempty" xml:"resource_pool_id,omitempty"`
	// 容器状态。
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
}

func (s Container) String() string {
	return tea.Prettify(s)
}

func (s Container) GoString() string {
	return s.String()
}

func (s *Container) SetAppVersion(v string) *Container {
	s.AppVersion = &v
	return s
}

func (s *Container) SetCpu(v int64) *Container {
	s.Cpu = &v
	return s
}

func (s *Container) SetHostIp(v string) *Container {
	s.HostIp = &v
	return s
}

func (s *Container) SetHostName(v string) *Container {
	s.HostName = &v
	return s
}

func (s *Container) SetId(v string) *Container {
	s.Id = &v
	return s
}

func (s *Container) SetImage(v string) *Container {
	s.Image = &v
	return s
}

func (s *Container) SetIp(v string) *Container {
	s.Ip = &v
	return s
}

func (s *Container) SetMemory(v int64) *Container {
	s.Memory = &v
	return s
}

func (s *Container) SetName(v string) *Container {
	s.Name = &v
	return s
}

func (s *Container) SetPod(v string) *Container {
	s.Pod = &v
	return s
}

func (s *Container) SetResourcePoolId(v string) *Container {
	s.ResourcePoolId = &v
	return s
}

func (s *Container) SetStatus(v string) *Container {
	s.Status = &v
	return s
}

func (s *Container) SetAppName(v string) *Container {
	s.AppName = &v
	return s
}

// OpenAPI定义
type OpenAPI struct {
	// API方法
	Method *string `json:"method,omitempty" xml:"method,omitempty" require:"true"`
	// API版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s OpenAPI) String() string {
	return tea.Prettify(s)
}

func (s OpenAPI) GoString() string {
	return s.String()
}

func (s *OpenAPI) SetMethod(v string) *OpenAPI {
	s.Method = &v
	return s
}

func (s *OpenAPI) SetVersion(v string) *OpenAPI {
	s.Version = &v
	return s
}

// 包含应用启动参数的应用对象
type AppParamData struct {
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 应用启动参数
	AppParams []*ParamData `json:"app_params,omitempty" xml:"app_params,omitempty" require:"true" type:"Repeated"`
}

func (s AppParamData) String() string {
	return tea.Prettify(s)
}

func (s AppParamData) GoString() string {
	return s.String()
}

func (s *AppParamData) SetProdCode(v string) *AppParamData {
	s.ProdCode = &v
	return s
}

func (s *AppParamData) SetAppName(v string) *AppParamData {
	s.AppName = &v
	return s
}

func (s *AppParamData) SetAppParams(v []*ParamData) *AppParamData {
	s.AppParams = v
	return s
}

// 容器状态
type ContainerInfo struct {
	// 容器日志
	Log *string `json:"log,omitempty" xml:"log,omitempty" require:"true"`
	// 容器节点状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	UtcEnd *string `json:"utc_end,omitempty" xml:"utc_end,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 开始时间
	UtcStart *string `json:"utc_start,omitempty" xml:"utc_start,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ContainerInfo) String() string {
	return tea.Prettify(s)
}

func (s ContainerInfo) GoString() string {
	return s.String()
}

func (s *ContainerInfo) SetLog(v string) *ContainerInfo {
	s.Log = &v
	return s
}

func (s *ContainerInfo) SetStatus(v string) *ContainerInfo {
	s.Status = &v
	return s
}

func (s *ContainerInfo) SetUtcCreate(v string) *ContainerInfo {
	s.UtcCreate = &v
	return s
}

func (s *ContainerInfo) SetUtcEnd(v string) *ContainerInfo {
	s.UtcEnd = &v
	return s
}

func (s *ContainerInfo) SetUtcModified(v string) *ContainerInfo {
	s.UtcModified = &v
	return s
}

func (s *ContainerInfo) SetUtcStart(v string) *ContainerInfo {
	s.UtcStart = &v
	return s
}

// 巡检查询产品详情
type ProdInfo struct {
	// 应用实例信息
	AppInfos []*AppInfo `json:"app_infos,omitempty" xml:"app_infos,omitempty" require:"true" type:"Repeated"`
	// 产品名
	ProdName *string `json:"prod_name,omitempty" xml:"prod_name,omitempty" require:"true"`
	// prod version
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty" require:"true"`
}

func (s ProdInfo) String() string {
	return tea.Prettify(s)
}

func (s ProdInfo) GoString() string {
	return s.String()
}

func (s *ProdInfo) SetAppInfos(v []*AppInfo) *ProdInfo {
	s.AppInfos = v
	return s
}

func (s *ProdInfo) SetProdName(v string) *ProdInfo {
	s.ProdName = &v
	return s
}

func (s *ProdInfo) SetProdVersion(v string) *ProdInfo {
	s.ProdVersion = &v
	return s
}

// 应用SRE信息，云游资产使用。
type Admin struct {
	// 应用SRE邮箱，云游资产使用。
	AdminEmail *string `json:"admin_email,omitempty" xml:"admin_email,omitempty"`
	// 应用SRE登陆名，云游资产使用。
	AdminLoginName *string `json:"admin_login_name,omitempty" xml:"admin_login_name,omitempty"`
	// 应用SRE昵称，云游资产使用
	AdminNickName *string `json:"admin_nick_name,omitempty" xml:"admin_nick_name,omitempty"`
	// 应用SRE真实名称，云游资产使用
	AdminRealName *string `json:"admin_real_name,omitempty" xml:"admin_real_name,omitempty"`
	// 应用SRE员工号，云游资产使用
	AdminStaffNo *string `json:"admin_staff_no,omitempty" xml:"admin_staff_no,omitempty"`
}

func (s Admin) String() string {
	return tea.Prettify(s)
}

func (s Admin) GoString() string {
	return s.String()
}

func (s *Admin) SetAdminEmail(v string) *Admin {
	s.AdminEmail = &v
	return s
}

func (s *Admin) SetAdminLoginName(v string) *Admin {
	s.AdminLoginName = &v
	return s
}

func (s *Admin) SetAdminNickName(v string) *Admin {
	s.AdminNickName = &v
	return s
}

func (s *Admin) SetAdminRealName(v string) *Admin {
	s.AdminRealName = &v
	return s
}

func (s *Admin) SetAdminStaffNo(v string) *Admin {
	s.AdminStaffNo = &v
	return s
}

// 应用PreviewTask
type AppPreviewTask struct {
	// app name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 是否需要部署
	NeedDeploy *bool `json:"need_deploy,omitempty" xml:"need_deploy,omitempty" require:"true"`
}

func (s AppPreviewTask) String() string {
	return tea.Prettify(s)
}

func (s AppPreviewTask) GoString() string {
	return s.String()
}

func (s *AppPreviewTask) SetAppName(v string) *AppPreviewTask {
	s.AppName = &v
	return s
}

func (s *AppPreviewTask) SetNeedDeploy(v bool) *AppPreviewTask {
	s.NeedDeploy = &v
	return s
}

// 测试用例详情
type AutoTestCase struct {
	// 测试应用本身的名字
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 测试应用本身的版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// case的级别
	CaseLevel *string `json:"case_level,omitempty" xml:"case_level,omitempty" require:"true"`
	// case的名字
	CaseName *string `json:"case_name,omitempty" xml:"case_name,omitempty" require:"true"`
	// case的状态
	CaseStatus *string `json:"case_status,omitempty" xml:"case_status,omitempty" require:"true"`
	// case的类型
	CaseType *string `json:"case_type,omitempty" xml:"case_type,omitempty" require:"true"`
	// case的类
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty" require:"true"`
	// 详情
	Detail *string `json:"detail,omitempty" xml:"detail,omitempty"`
	// case运行的时间，单位毫秒
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty" require:"true"`
	// case的id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 测试方法名
	MethodName *string `json:"method_name,omitempty" xml:"method_name,omitempty" require:"true"`
}

func (s AutoTestCase) String() string {
	return tea.Prettify(s)
}

func (s AutoTestCase) GoString() string {
	return s.String()
}

func (s *AutoTestCase) SetAppName(v string) *AutoTestCase {
	s.AppName = &v
	return s
}

func (s *AutoTestCase) SetAppVersion(v string) *AutoTestCase {
	s.AppVersion = &v
	return s
}

func (s *AutoTestCase) SetCaseLevel(v string) *AutoTestCase {
	s.CaseLevel = &v
	return s
}

func (s *AutoTestCase) SetCaseName(v string) *AutoTestCase {
	s.CaseName = &v
	return s
}

func (s *AutoTestCase) SetCaseStatus(v string) *AutoTestCase {
	s.CaseStatus = &v
	return s
}

func (s *AutoTestCase) SetCaseType(v string) *AutoTestCase {
	s.CaseType = &v
	return s
}

func (s *AutoTestCase) SetClassName(v string) *AutoTestCase {
	s.ClassName = &v
	return s
}

func (s *AutoTestCase) SetDetail(v string) *AutoTestCase {
	s.Detail = &v
	return s
}

func (s *AutoTestCase) SetDuration(v int64) *AutoTestCase {
	s.Duration = &v
	return s
}

func (s *AutoTestCase) SetId(v string) *AutoTestCase {
	s.Id = &v
	return s
}

func (s *AutoTestCase) SetMethodName(v string) *AutoTestCase {
	s.MethodName = &v
	return s
}

// 数据库实例。
type Database struct {
	// acgotonecore_db_-4784849131397729849。
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 数据库访问端口。
	Port *int64 `json:"port,omitempty" xml:"port,omitempty"`
	// 数据库类型。MYSQL  |  OCEANBASE。
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty"`
	// 实例id。
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 资源池id。
	ResourcePoolId *string `json:"resource_pool_id,omitempty" xml:"resource_pool_id,omitempty"`
	// 数据库访问地址。
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s Database) String() string {
	return tea.Prettify(s)
}

func (s Database) GoString() string {
	return s.String()
}

func (s *Database) SetName(v string) *Database {
	s.Name = &v
	return s
}

func (s *Database) SetPort(v int64) *Database {
	s.Port = &v
	return s
}

func (s *Database) SetProvider(v string) *Database {
	s.Provider = &v
	return s
}

func (s *Database) SetResourceId(v string) *Database {
	s.ResourceId = &v
	return s
}

func (s *Database) SetResourcePoolId(v string) *Database {
	s.ResourcePoolId = &v
	return s
}

func (s *Database) SetUrl(v string) *Database {
	s.Url = &v
	return s
}

// 应用服务实例详情。
type AppServiceInfo struct {
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 应用版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty"`
	// 所属单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 容器列表。
	Containers []*Container `json:"containers,omitempty" xml:"containers,omitempty" type:"Repeated"`
	// 部署单元名称，产品实例下唯一。
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 应用服务实例唯一标识。
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 所属产品分组唯一标识。
	ProductGroupIdentity *string `json:"product_group_identity,omitempty" xml:"product_group_identity,omitempty"`
	// 所属产品分组名称。
	ProductGroupName *string `json:"product_group_name,omitempty" xml:"product_group_name,omitempty"`
	// 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s AppServiceInfo) String() string {
	return tea.Prettify(s)
}

func (s AppServiceInfo) GoString() string {
	return s.String()
}

func (s *AppServiceInfo) SetAppName(v string) *AppServiceInfo {
	s.AppName = &v
	return s
}

func (s *AppServiceInfo) SetAppVersion(v string) *AppServiceInfo {
	s.AppVersion = &v
	return s
}

func (s *AppServiceInfo) SetCellId(v string) *AppServiceInfo {
	s.CellId = &v
	return s
}

func (s *AppServiceInfo) SetContainers(v []*Container) *AppServiceInfo {
	s.Containers = v
	return s
}

func (s *AppServiceInfo) SetDeployUnit(v string) *AppServiceInfo {
	s.DeployUnit = &v
	return s
}

func (s *AppServiceInfo) SetEnvId(v string) *AppServiceInfo {
	s.EnvId = &v
	return s
}

func (s *AppServiceInfo) SetId(v string) *AppServiceInfo {
	s.Id = &v
	return s
}

func (s *AppServiceInfo) SetProductCode(v string) *AppServiceInfo {
	s.ProductCode = &v
	return s
}

func (s *AppServiceInfo) SetProductGroupIdentity(v string) *AppServiceInfo {
	s.ProductGroupIdentity = &v
	return s
}

func (s *AppServiceInfo) SetProductGroupName(v string) *AppServiceInfo {
	s.ProductGroupName = &v
	return s
}

func (s *AppServiceInfo) SetStatus(v string) *AppServiceInfo {
	s.Status = &v
	return s
}

// 云游环境信息。
type Env struct {
	// cellGroup的列表
	CellGroups []*CellGroup `json:"cell_groups,omitempty" xml:"cell_groups,omitempty" require:"true" type:"Repeated"`
	// 云信息
	Cloud *Cloud `json:"cloud,omitempty" xml:"cloud,omitempty" require:"true"`
	// 关联的ake集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 环境名
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// 环境的id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// （已废弃）环境唯一标识。
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 是否ldc环境
	Ldc *bool `json:"ldc,omitempty" xml:"ldc,omitempty" require:"true"`
	// 环境名称。
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// （已废弃）环境底座iaas技术栈。
	Stack *string `json:"stack,omitempty" xml:"stack,omitempty"`
	// 租户信息
	Tenant *Tenant `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 工作空间列表
	Workspaces []*Workspace `json:"workspaces,omitempty" xml:"workspaces,omitempty" require:"true" type:"Repeated"`
	// （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// 环境类型
	EnvType *string `json:"env_type,omitempty" xml:"env_type,omitempty" require:"true"`
}

func (s Env) String() string {
	return tea.Prettify(s)
}

func (s Env) GoString() string {
	return s.String()
}

func (s *Env) SetCellGroups(v []*CellGroup) *Env {
	s.CellGroups = v
	return s
}

func (s *Env) SetCloud(v *Cloud) *Env {
	s.Cloud = v
	return s
}

func (s *Env) SetClusterId(v string) *Env {
	s.ClusterId = &v
	return s
}

func (s *Env) SetDisplayName(v string) *Env {
	s.DisplayName = &v
	return s
}

func (s *Env) SetEnvId(v string) *Env {
	s.EnvId = &v
	return s
}

func (s *Env) SetId(v string) *Env {
	s.Id = &v
	return s
}

func (s *Env) SetLdc(v bool) *Env {
	s.Ldc = &v
	return s
}

func (s *Env) SetName(v string) *Env {
	s.Name = &v
	return s
}

func (s *Env) SetStack(v string) *Env {
	s.Stack = &v
	return s
}

func (s *Env) SetTenant(v *Tenant) *Env {
	s.Tenant = v
	return s
}

func (s *Env) SetWorkspaces(v []*Workspace) *Env {
	s.Workspaces = v
	return s
}

func (s *Env) SetWorkspaceId(v string) *Env {
	s.WorkspaceId = &v
	return s
}

func (s *Env) SetEnvType(v string) *Env {
	s.EnvType = &v
	return s
}

// 负载均衡后端服务器。
type BackendServer struct {
	// 容器id。
	ContainerId *string `json:"container_id,omitempty" xml:"container_id,omitempty"`
	// 容器所在的资源池id。
	ContainerResourcePoolId *string `json:"container_resource_pool_id,omitempty" xml:"container_resource_pool_id,omitempty"`
	// 资源池id。
	LbResourcePoolId *string `json:"lb_resource_pool_id,omitempty" xml:"lb_resource_pool_id,omitempty"`
	// 负载均衡实例id。
	LoadBalancerId *string `json:"load_balancer_id,omitempty" xml:"load_balancer_id,omitempty"`
	// 权重。
	Weight *int64 `json:"weight,omitempty" xml:"weight,omitempty"`
}

func (s BackendServer) String() string {
	return tea.Prettify(s)
}

func (s BackendServer) GoString() string {
	return s.String()
}

func (s *BackendServer) SetContainerId(v string) *BackendServer {
	s.ContainerId = &v
	return s
}

func (s *BackendServer) SetContainerResourcePoolId(v string) *BackendServer {
	s.ContainerResourcePoolId = &v
	return s
}

func (s *BackendServer) SetLbResourcePoolId(v string) *BackendServer {
	s.LbResourcePoolId = &v
	return s
}

func (s *BackendServer) SetLoadBalancerId(v string) *BackendServer {
	s.LoadBalancerId = &v
	return s
}

func (s *BackendServer) SetWeight(v int64) *BackendServer {
	s.Weight = &v
	return s
}

// 监听器。
type Listener struct {
	// 后端端口。
	BackendServerPort *int64 `json:"backend_server_port,omitempty" xml:"backend_server_port,omitempty"`
	// 前端端口。
	ListenerPort *int64 `json:"listener_port,omitempty" xml:"listener_port,omitempty"`
	// 负载均衡实例id。
	LoadBalancerId *string `json:"load_balancer_id,omitempty" xml:"load_balancer_id,omitempty"`
	// 监听器协议。HTTP/HTTPS/TCP
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 资源池id。
	ResourcePoolId *string `json:"resource_pool_id,omitempty" xml:"resource_pool_id,omitempty"`
}

func (s Listener) String() string {
	return tea.Prettify(s)
}

func (s Listener) GoString() string {
	return s.String()
}

func (s *Listener) SetBackendServerPort(v int64) *Listener {
	s.BackendServerPort = &v
	return s
}

func (s *Listener) SetListenerPort(v int64) *Listener {
	s.ListenerPort = &v
	return s
}

func (s *Listener) SetLoadBalancerId(v string) *Listener {
	s.LoadBalancerId = &v
	return s
}

func (s *Listener) SetProtocol(v string) *Listener {
	s.Protocol = &v
	return s
}

func (s *Listener) SetResourcePoolId(v string) *Listener {
	s.ResourcePoolId = &v
	return s
}

// 应用Owner信息
type Owner struct {
	// 应用Owner邮箱，云游资产使用。
	OwnerEmail *string `json:"owner_email,omitempty" xml:"owner_email,omitempty"`
	// 应用Owner登陆名，云游资产使用。
	OwnerLoginName *string `json:"owner_login_name,omitempty" xml:"owner_login_name,omitempty"`
	// 应用Owner昵称，云游资产使用。
	OwnerNickName *string `json:"owner_nick_name,omitempty" xml:"owner_nick_name,omitempty"`
	// 应用Owner真实名称，云游资产使用。
	OwnerRealName *string `json:"owner_real_name,omitempty" xml:"owner_real_name,omitempty"`
	// 应用Owner员工号，云游资产使用。
	OwnerStaffNo *string `json:"owner_staff_no,omitempty" xml:"owner_staff_no,omitempty"`
}

func (s Owner) String() string {
	return tea.Prettify(s)
}

func (s Owner) GoString() string {
	return s.String()
}

func (s *Owner) SetOwnerEmail(v string) *Owner {
	s.OwnerEmail = &v
	return s
}

func (s *Owner) SetOwnerLoginName(v string) *Owner {
	s.OwnerLoginName = &v
	return s
}

func (s *Owner) SetOwnerNickName(v string) *Owner {
	s.OwnerNickName = &v
	return s
}

func (s *Owner) SetOwnerRealName(v string) *Owner {
	s.OwnerRealName = &v
	return s
}

func (s *Owner) SetOwnerStaffNo(v string) *Owner {
	s.OwnerStaffNo = &v
	return s
}

// 发布单
type OpsPlan struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 环境Id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 解决方案Id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
	// 发布单类型
	OpsType *string `json:"ops_type,omitempty" xml:"ops_type,omitempty" require:"true"`
	// 发布单类型
	PlanType *string `json:"plan_type,omitempty" xml:"plan_type,omitempty" require:"true"`
	// 创建人id
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建人名称
	CreatorName *string `json:"creator_name,omitempty" xml:"creator_name,omitempty" require:"true"`
	// 发布单状态
	OpsPlanStatus *string `json:"ops_plan_status,omitempty" xml:"ops_plan_status,omitempty" require:"true"`
	// 创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" require:"true"`
}

func (s OpsPlan) String() string {
	return tea.Prettify(s)
}

func (s OpsPlan) GoString() string {
	return s.String()
}

func (s *OpsPlan) SetId(v string) *OpsPlan {
	s.Id = &v
	return s
}

func (s *OpsPlan) SetName(v string) *OpsPlan {
	s.Name = &v
	return s
}

func (s *OpsPlan) SetEnvId(v string) *OpsPlan {
	s.EnvId = &v
	return s
}

func (s *OpsPlan) SetSolutionId(v string) *OpsPlan {
	s.SolutionId = &v
	return s
}

func (s *OpsPlan) SetOpsType(v string) *OpsPlan {
	s.OpsType = &v
	return s
}

func (s *OpsPlan) SetPlanType(v string) *OpsPlan {
	s.PlanType = &v
	return s
}

func (s *OpsPlan) SetCreator(v string) *OpsPlan {
	s.Creator = &v
	return s
}

func (s *OpsPlan) SetCreatorName(v string) *OpsPlan {
	s.CreatorName = &v
	return s
}

func (s *OpsPlan) SetOpsPlanStatus(v string) *OpsPlan {
	s.OpsPlanStatus = &v
	return s
}

func (s *OpsPlan) SetUtcCreate(v string) *OpsPlan {
	s.UtcCreate = &v
	return s
}

func (s *OpsPlan) SetUtcModified(v string) *OpsPlan {
	s.UtcModified = &v
	return s
}

// 系统参数
type SystemParameterInfo struct {
	// 参数名
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 参数值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 环境Id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 参数描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 记录id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s SystemParameterInfo) String() string {
	return tea.Prettify(s)
}

func (s SystemParameterInfo) GoString() string {
	return s.String()
}

func (s *SystemParameterInfo) SetType(v string) *SystemParameterInfo {
	s.Type = &v
	return s
}

func (s *SystemParameterInfo) SetValue(v string) *SystemParameterInfo {
	s.Value = &v
	return s
}

func (s *SystemParameterInfo) SetEnvId(v string) *SystemParameterInfo {
	s.EnvId = &v
	return s
}

func (s *SystemParameterInfo) SetDescription(v string) *SystemParameterInfo {
	s.Description = &v
	return s
}

func (s *SystemParameterInfo) SetId(v string) *SystemParameterInfo {
	s.Id = &v
	return s
}

// 云游应用元数据
type Application struct {
	// 应用英文名
	ApplicationName *string `json:"application_name,omitempty" xml:"application_name,omitempty"`
	// 应用所属的产品的产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s Application) String() string {
	return tea.Prettify(s)
}

func (s Application) GoString() string {
	return s.String()
}

func (s *Application) SetApplicationName(v string) *Application {
	s.ApplicationName = &v
	return s
}

func (s *Application) SetProductCode(v string) *Application {
	s.ProductCode = &v
	return s
}

// 部署单元实例信息
type UnitInstanceInfo struct {
	// 部署单元内服务实例列表
	AppServices []*AppServiceInfo `json:"app_services,omitempty" xml:"app_services,omitempty" require:"true" type:"Repeated"`
}

func (s UnitInstanceInfo) String() string {
	return tea.Prettify(s)
}

func (s UnitInstanceInfo) GoString() string {
	return s.String()
}

func (s *UnitInstanceInfo) SetAppServices(v []*AppServiceInfo) *UnitInstanceInfo {
	s.AppServices = v
	return s
}

// 单元内的资源
type UnitResource struct {
	// 资源地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 环境标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 资源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 资源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 资源端口
	Port *int64 `json:"port,omitempty" xml:"port,omitempty"`
	// 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// zone标识
	ZoneId *string `json:"zone_id,omitempty" xml:"zone_id,omitempty" require:"true"`
}

func (s UnitResource) String() string {
	return tea.Prettify(s)
}

func (s UnitResource) GoString() string {
	return s.String()
}

func (s *UnitResource) SetAddress(v string) *UnitResource {
	s.Address = &v
	return s
}

func (s *UnitResource) SetEnvId(v string) *UnitResource {
	s.EnvId = &v
	return s
}

func (s *UnitResource) SetId(v string) *UnitResource {
	s.Id = &v
	return s
}

func (s *UnitResource) SetName(v string) *UnitResource {
	s.Name = &v
	return s
}

func (s *UnitResource) SetPort(v int64) *UnitResource {
	s.Port = &v
	return s
}

func (s *UnitResource) SetResourceType(v string) *UnitResource {
	s.ResourceType = &v
	return s
}

func (s *UnitResource) SetZoneId(v string) *UnitResource {
	s.ZoneId = &v
	return s
}

// 装箱数据
type BoxData struct {
	// 装箱数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 装箱的json数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 装箱数据版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s BoxData) String() string {
	return tea.Prettify(s)
}

func (s BoxData) GoString() string {
	return s.String()
}

func (s *BoxData) SetType(v string) *BoxData {
	s.Type = &v
	return s
}

func (s *BoxData) SetData(v string) *BoxData {
	s.Data = &v
	return s
}

func (s *BoxData) SetVersion(v string) *BoxData {
	s.Version = &v
	return s
}

// 自动化测试的节点日志
type AutoTestLog struct {
	// 日志id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 日志内容
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 节点执行的动作
	NodeAction *string `json:"node_action,omitempty" xml:"node_action,omitempty" require:"true"`
	// 节点id
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点所处的阶段
	Stage *string `json:"stage,omitempty" xml:"stage,omitempty" require:"true"`
	// 创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" require:"true"`
	// 修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" require:"true"`
}

func (s AutoTestLog) String() string {
	return tea.Prettify(s)
}

func (s AutoTestLog) GoString() string {
	return s.String()
}

func (s *AutoTestLog) SetId(v string) *AutoTestLog {
	s.Id = &v
	return s
}

func (s *AutoTestLog) SetMessage(v string) *AutoTestLog {
	s.Message = &v
	return s
}

func (s *AutoTestLog) SetNodeAction(v string) *AutoTestLog {
	s.NodeAction = &v
	return s
}

func (s *AutoTestLog) SetNodeId(v string) *AutoTestLog {
	s.NodeId = &v
	return s
}

func (s *AutoTestLog) SetStage(v string) *AutoTestLog {
	s.Stage = &v
	return s
}

func (s *AutoTestLog) SetUtcCreate(v string) *AutoTestLog {
	s.UtcCreate = &v
	return s
}

func (s *AutoTestLog) SetUtcModified(v string) *AutoTestLog {
	s.UtcModified = &v
	return s
}

// 集群pod信息
type ClusterInfo struct {
	// 产品信息
	ProdInfos []*ProdInfo `json:"prod_infos,omitempty" xml:"prod_infos,omitempty" require:"true" type:"Repeated"`
}

func (s ClusterInfo) String() string {
	return tea.Prettify(s)
}

func (s ClusterInfo) GoString() string {
	return s.String()
}

func (s *ClusterInfo) SetProdInfos(v []*ProdInfo) *ClusterInfo {
	s.ProdInfos = v
	return s
}

// 产品预览任务
type ProdPreviewTasks struct {
	// 应用是否需要部署
	AppPreviewTasks []*AppPreviewTask `json:"app_preview_tasks,omitempty" xml:"app_preview_tasks,omitempty" require:"true" type:"Repeated"`
}

func (s ProdPreviewTasks) String() string {
	return tea.Prettify(s)
}

func (s ProdPreviewTasks) GoString() string {
	return s.String()
}

func (s *ProdPreviewTasks) SetAppPreviewTasks(v []*AppPreviewTask) *ProdPreviewTasks {
	s.AppPreviewTasks = v
	return s
}

// 产品实例。
type ProductInstance struct {
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 产品实例所在的环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 产品版本。
	ProductVersion *string `json:"product_version,omitempty" xml:"product_version,omitempty"`
	// 产品基线状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 产品创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 产品修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 产品拓扑id
	DeployTopologyIdentity *string `json:"deploy_topology_identity,omitempty" xml:"deploy_topology_identity,omitempty"`
	// 部署规格id
	DeploySpecIdentity *string `json:"deploy_spec_identity,omitempty" xml:"deploy_spec_identity,omitempty"`
}

func (s ProductInstance) String() string {
	return tea.Prettify(s)
}

func (s ProductInstance) GoString() string {
	return s.String()
}

func (s *ProductInstance) SetCellId(v string) *ProductInstance {
	s.CellId = &v
	return s
}

func (s *ProductInstance) SetEnvId(v string) *ProductInstance {
	s.EnvId = &v
	return s
}

func (s *ProductInstance) SetProductCode(v string) *ProductInstance {
	s.ProductCode = &v
	return s
}

func (s *ProductInstance) SetProductVersion(v string) *ProductInstance {
	s.ProductVersion = &v
	return s
}

func (s *ProductInstance) SetStatus(v string) *ProductInstance {
	s.Status = &v
	return s
}

func (s *ProductInstance) SetUtcCreate(v string) *ProductInstance {
	s.UtcCreate = &v
	return s
}

func (s *ProductInstance) SetUtcModified(v string) *ProductInstance {
	s.UtcModified = &v
	return s
}

func (s *ProductInstance) SetDeployTopologyIdentity(v string) *ProductInstance {
	s.DeployTopologyIdentity = &v
	return s
}

func (s *ProductInstance) SetDeploySpecIdentity(v string) *ProductInstance {
	s.DeploySpecIdentity = &v
	return s
}

// 节点执行日志
type NodeExecutionLog struct {
	// 当前节点的动作
	NodeAction *string `json:"node_action,omitempty" xml:"node_action,omitempty" require:"true"`
	// 当前节点的执行日志信息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s NodeExecutionLog) String() string {
	return tea.Prettify(s)
}

func (s NodeExecutionLog) GoString() string {
	return s.String()
}

func (s *NodeExecutionLog) SetNodeAction(v string) *NodeExecutionLog {
	s.NodeAction = &v
	return s
}

func (s *NodeExecutionLog) SetMessage(v string) *NodeExecutionLog {
	s.Message = &v
	return s
}

// 负载均衡实例。
type LoadBalancer struct {
	// 地址类型。INTRANET/INTERNET/OFFICE
	AddressType *string `json:"address_type,omitempty" xml:"address_type,omitempty"`
	// 后端服务器列表。
	BackendServers []*BackendServer `json:"backend_servers,omitempty" xml:"backend_servers,omitempty" type:"Repeated"`
	// 实例域名。
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty"`
	// 监听器列表。
	Listeners []*Listener `json:"listeners,omitempty" xml:"listeners,omitempty" type:"Repeated"`
	// 实例名称。
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 类型。SLB/ALB。
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty"`
	// 实例id。
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 资源池id。
	ResourcePoolId *string `json:"resource_pool_id,omitempty" xml:"resource_pool_id,omitempty"`
	// vip地址。
	Vip *string `json:"vip,omitempty" xml:"vip,omitempty"`
}

func (s LoadBalancer) String() string {
	return tea.Prettify(s)
}

func (s LoadBalancer) GoString() string {
	return s.String()
}

func (s *LoadBalancer) SetAddressType(v string) *LoadBalancer {
	s.AddressType = &v
	return s
}

func (s *LoadBalancer) SetBackendServers(v []*BackendServer) *LoadBalancer {
	s.BackendServers = v
	return s
}

func (s *LoadBalancer) SetDomain(v string) *LoadBalancer {
	s.Domain = &v
	return s
}

func (s *LoadBalancer) SetListeners(v []*Listener) *LoadBalancer {
	s.Listeners = v
	return s
}

func (s *LoadBalancer) SetName(v string) *LoadBalancer {
	s.Name = &v
	return s
}

func (s *LoadBalancer) SetProvider(v string) *LoadBalancer {
	s.Provider = &v
	return s
}

func (s *LoadBalancer) SetResourceId(v string) *LoadBalancer {
	s.ResourceId = &v
	return s
}

func (s *LoadBalancer) SetResourcePoolId(v string) *LoadBalancer {
	s.ResourcePoolId = &v
	return s
}

func (s *LoadBalancer) SetVip(v string) *LoadBalancer {
	s.Vip = &v
	return s
}

// 自动化测试工单中的产品
type AutoTestProduct struct {
	// 部署单元id
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用启动参数数据
	AppParamData []*AppParamData `json:"app_param_data,omitempty" xml:"app_param_data,omitempty" type:"Repeated"`
}

func (s AutoTestProduct) String() string {
	return tea.Prettify(s)
}

func (s AutoTestProduct) GoString() string {
	return s.String()
}

func (s *AutoTestProduct) SetDeployUnit(v string) *AutoTestProduct {
	s.DeployUnit = &v
	return s
}

func (s *AutoTestProduct) SetProdCode(v string) *AutoTestProduct {
	s.ProdCode = &v
	return s
}

func (s *AutoTestProduct) SetAppParamData(v []*AppParamData) *AutoTestProduct {
	s.AppParamData = v
	return s
}

// （已废弃，请使用AppServiceInfo）一个环境中部署的应用服务信息。
type AppService struct {
	// 应用英文名。
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 应用版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 部署单元名称，产品实例下唯一。
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty"`
	// 部署域。
	DeployZone *string `json:"deploy_zone,omitempty" xml:"deploy_zone,omitempty"`
	// 环境唯一标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 应用服务实例唯一标识。
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 应用所属的产品的产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 应用类型：BUSINESS | JOB | CONTROLLER
	AppType *string `json:"app_type,omitempty" xml:"app_type,omitempty"`
	// 应用显示名称，云游资产使用
	AppDisplayName *string `json:"app_display_name,omitempty" xml:"app_display_name,omitempty"`
	// 应用等级，云游资产使用
	AppLevel *string `json:"app_level,omitempty" xml:"app_level,omitempty"`
	// 租户信息，云游资产使用。
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 产品码--应用名
	ProductApp *string `json:"product_app,omitempty" xml:"product_app,omitempty"`
	// 产品Owner
	Owner *Owner `json:"owner,omitempty" xml:"owner,omitempty"`
	// 应用SRE信息
	Admin *Admin `json:"admin,omitempty" xml:"admin,omitempty"`
	// 副本数
	ExpectReplica *int64 `json:"expect_replica,omitempty" xml:"expect_replica,omitempty"`
	// 镜像
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
	// 2G
	Cpu *int64 `json:"cpu,omitempty" xml:"cpu,omitempty"`
	// 内存资源
	Memory *int64 `json:"memory,omitempty" xml:"memory,omitempty"`
}

func (s AppService) String() string {
	return tea.Prettify(s)
}

func (s AppService) GoString() string {
	return s.String()
}

func (s *AppService) SetAppName(v string) *AppService {
	s.AppName = &v
	return s
}

func (s *AppService) SetAppVersion(v string) *AppService {
	s.AppVersion = &v
	return s
}

func (s *AppService) SetCellId(v string) *AppService {
	s.CellId = &v
	return s
}

func (s *AppService) SetDeployUnit(v string) *AppService {
	s.DeployUnit = &v
	return s
}

func (s *AppService) SetDeployZone(v string) *AppService {
	s.DeployZone = &v
	return s
}

func (s *AppService) SetEnvId(v string) *AppService {
	s.EnvId = &v
	return s
}

func (s *AppService) SetId(v string) *AppService {
	s.Id = &v
	return s
}

func (s *AppService) SetProductCode(v string) *AppService {
	s.ProductCode = &v
	return s
}

func (s *AppService) SetStatus(v string) *AppService {
	s.Status = &v
	return s
}

func (s *AppService) SetAppType(v string) *AppService {
	s.AppType = &v
	return s
}

func (s *AppService) SetAppDisplayName(v string) *AppService {
	s.AppDisplayName = &v
	return s
}

func (s *AppService) SetAppLevel(v string) *AppService {
	s.AppLevel = &v
	return s
}

func (s *AppService) SetTenantId(v string) *AppService {
	s.TenantId = &v
	return s
}

func (s *AppService) SetProductApp(v string) *AppService {
	s.ProductApp = &v
	return s
}

func (s *AppService) SetOwner(v *Owner) *AppService {
	s.Owner = v
	return s
}

func (s *AppService) SetAdmin(v *Admin) *AppService {
	s.Admin = v
	return s
}

func (s *AppService) SetExpectReplica(v int64) *AppService {
	s.ExpectReplica = &v
	return s
}

func (s *AppService) SetImage(v string) *AppService {
	s.Image = &v
	return s
}

func (s *AppService) SetCpu(v int64) *AppService {
	s.Cpu = &v
	return s
}

func (s *AppService) SetMemory(v int64) *AppService {
	s.Memory = &v
	return s
}

// 回滚快照
type DeploymentUnitSnapshotOP struct {
	// 环境ID
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty"`
	// 关联的解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty"`
	// 快照关联的发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
	// 快照版本, 根据日期生成
	SnapshotVersion *string `json:"snapshot_version,omitempty" xml:"snapshot_version,omitempty"`
	// 快照创建时间
	SnapshotTime *string `json:"snapshot_time,omitempty" xml:"snapshot_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 部署单元实例唯一标识
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty"`
	// 部署单元唯一标识
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty"`
	// 部署拓扑
	DeployTopologyIdentity *string `json:"deploy_topology_identity,omitempty" xml:"deploy_topology_identity,omitempty"`
	// 应用回滚快照
	AppSnapshot []*string `json:"app_snapshot,omitempty" xml:"app_snapshot,omitempty" type:"Repeated"`
}

func (s DeploymentUnitSnapshotOP) String() string {
	return tea.Prettify(s)
}

func (s DeploymentUnitSnapshotOP) GoString() string {
	return s.String()
}

func (s *DeploymentUnitSnapshotOP) SetEnvId(v string) *DeploymentUnitSnapshotOP {
	s.EnvId = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetProdCode(v string) *DeploymentUnitSnapshotOP {
	s.ProdCode = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetProdVersion(v string) *DeploymentUnitSnapshotOP {
	s.ProdVersion = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetSolutionId(v string) *DeploymentUnitSnapshotOP {
	s.SolutionId = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetOpsPlanId(v string) *DeploymentUnitSnapshotOP {
	s.OpsPlanId = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetSnapshotVersion(v string) *DeploymentUnitSnapshotOP {
	s.SnapshotVersion = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetSnapshotTime(v string) *DeploymentUnitSnapshotOP {
	s.SnapshotTime = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetDeploymentUnitInstanceIdentity(v string) *DeploymentUnitSnapshotOP {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetDeploymentUnitIdentity(v string) *DeploymentUnitSnapshotOP {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetDeployTopologyIdentity(v string) *DeploymentUnitSnapshotOP {
	s.DeployTopologyIdentity = &v
	return s
}

func (s *DeploymentUnitSnapshotOP) SetAppSnapshot(v []*string) *DeploymentUnitSnapshotOP {
	s.AppSnapshot = v
	return s
}

// 解决方案检查项
type CheckPoint struct {
	// 检查结果
	CheckResult *string `json:"check_result,omitempty" xml:"check_result,omitempty" require:"true"`
	// 检查点, 例如参数检查
	CheckPoint *string `json:"check_point,omitempty" xml:"check_point,omitempty" require:"true"`
	// 非法原因
	InvalidReason *string `json:"invalid_reason,omitempty" xml:"invalid_reason,omitempty"`
}

func (s CheckPoint) String() string {
	return tea.Prettify(s)
}

func (s CheckPoint) GoString() string {
	return s.String()
}

func (s *CheckPoint) SetCheckResult(v string) *CheckPoint {
	s.CheckResult = &v
	return s
}

func (s *CheckPoint) SetCheckPoint(v string) *CheckPoint {
	s.CheckPoint = &v
	return s
}

func (s *CheckPoint) SetInvalidReason(v string) *CheckPoint {
	s.InvalidReason = &v
	return s
}

// 用户删除
type UserAuth struct {
	// 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
	Condition *string `json:"condition,omitempty" xml:"condition,omitempty" require:"true"`
	// YUNYOU_LOCAL_AUTH_KEY
	ConditionKey *string `json:"condition_key,omitempty" xml:"condition_key,omitempty" require:"true"`
	// 用户昵称, 如果是域内, 就是花名
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 是否为负责人
	Primary *bool `json:"primary,omitempty" xml:"primary,omitempty" require:"true"`
	// 用户姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// PROCESS_ENGINEER: 全局运维工程师
	// PROD_PROCESS_ENGINEER: 产品运维工程师
	// DELIVERY_ENGINEER: 交付工程师
	// ENV_MANAGER: 环境管理员
	// LOCAL_OBSERVER: 观察者
	// AKE_PROCESS_ENGINEER: AKE运维工程师
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
	SourceId *string `json:"source_id,omitempty" xml:"source_id,omitempty"`
	// 授权状态,
	// WAIT_REGIST: 等待用户注册
	// ACTIVE: 授权已经生效
	// DELETED: 授权已经删除
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用户ID, 该值为IAM上的User.ID属性
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s UserAuth) String() string {
	return tea.Prettify(s)
}

func (s UserAuth) GoString() string {
	return s.String()
}

func (s *UserAuth) SetCondition(v string) *UserAuth {
	s.Condition = &v
	return s
}

func (s *UserAuth) SetConditionKey(v string) *UserAuth {
	s.ConditionKey = &v
	return s
}

func (s *UserAuth) SetNickName(v string) *UserAuth {
	s.NickName = &v
	return s
}

func (s *UserAuth) SetPrimary(v bool) *UserAuth {
	s.Primary = &v
	return s
}

func (s *UserAuth) SetRealName(v string) *UserAuth {
	s.RealName = &v
	return s
}

func (s *UserAuth) SetRole(v string) *UserAuth {
	s.Role = &v
	return s
}

func (s *UserAuth) SetSourceId(v string) *UserAuth {
	s.SourceId = &v
	return s
}

func (s *UserAuth) SetStatus(v string) *UserAuth {
	s.Status = &v
	return s
}

func (s *UserAuth) SetUserId(v string) *UserAuth {
	s.UserId = &v
	return s
}

// 解决方案
type SolutionInstance struct {
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
	// 环境ID
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 解决方案的名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 解决方案的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s SolutionInstance) String() string {
	return tea.Prettify(s)
}

func (s SolutionInstance) GoString() string {
	return s.String()
}

func (s *SolutionInstance) SetSolutionId(v string) *SolutionInstance {
	s.SolutionId = &v
	return s
}

func (s *SolutionInstance) SetEnvId(v string) *SolutionInstance {
	s.EnvId = &v
	return s
}

func (s *SolutionInstance) SetName(v string) *SolutionInstance {
	s.Name = &v
	return s
}

func (s *SolutionInstance) SetStatus(v string) *SolutionInstance {
	s.Status = &v
	return s
}

// 测试用例是否可执行
type AutoTestAvailableProdOption struct {
	// 是否可执行测试用例
	IsRunnable *bool `json:"is_runnable,omitempty" xml:"is_runnable,omitempty" require:"true"`
	// 不能执行自动化测试用例的原因
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 部署单元唯一标识（元数据）
	//
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
	// 部署单元实例唯一标识
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
}

func (s AutoTestAvailableProdOption) String() string {
	return tea.Prettify(s)
}

func (s AutoTestAvailableProdOption) GoString() string {
	return s.String()
}

func (s *AutoTestAvailableProdOption) SetIsRunnable(v bool) *AutoTestAvailableProdOption {
	s.IsRunnable = &v
	return s
}

func (s *AutoTestAvailableProdOption) SetMessage(v string) *AutoTestAvailableProdOption {
	s.Message = &v
	return s
}

func (s *AutoTestAvailableProdOption) SetDeploymentUnitIdentity(v string) *AutoTestAvailableProdOption {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *AutoTestAvailableProdOption) SetIdentity(v string) *AutoTestAvailableProdOption {
	s.Identity = &v
	return s
}

func (s *AutoTestAvailableProdOption) SetProdCode(v string) *AutoTestAvailableProdOption {
	s.ProdCode = &v
	return s
}

// 云游系统信息
type System struct {
	// 系统的代码commit
	CommitId *string `json:"commit_id,omitempty" xml:"commit_id,omitempty" require:"true"`
	// 管理的环境列表
	Envs []*Env `json:"envs,omitempty" xml:"envs,omitempty" require:"true" type:"Repeated"`
	// 支持的OpenAPI列表
	OpenApis []*OpenAPI `json:"open_apis,omitempty" xml:"open_apis,omitempty" require:"true" type:"Repeated"`
	// 云游的产品版本号, 该值可能为空
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s System) String() string {
	return tea.Prettify(s)
}

func (s System) GoString() string {
	return s.String()
}

func (s *System) SetCommitId(v string) *System {
	s.CommitId = &v
	return s
}

func (s *System) SetEnvs(v []*Env) *System {
	s.Envs = v
	return s
}

func (s *System) SetOpenApis(v []*OpenAPI) *System {
	s.OpenApis = v
	return s
}

func (s *System) SetVersion(v string) *System {
	s.Version = &v
	return s
}

// 产品测试结果
type AutoTestProdResult struct {
	// 测试用例
	Cases []*AutoTestCase `json:"cases,omitempty" xml:"cases,omitempty" require:"true" type:"Repeated"`
	// 容器信息
	Containers []*ContainerInfo `json:"containers,omitempty" xml:"containers,omitempty" require:"true" type:"Repeated"`
	// 部署单元id
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品测试状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 测试创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	UtcEnd *string `json:"utc_end,omitempty" xml:"utc_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 测试修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 测试开始时间
	UtcStart *string `json:"utc_start,omitempty" xml:"utc_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 单元的id
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
}

func (s AutoTestProdResult) String() string {
	return tea.Prettify(s)
}

func (s AutoTestProdResult) GoString() string {
	return s.String()
}

func (s *AutoTestProdResult) SetCases(v []*AutoTestCase) *AutoTestProdResult {
	s.Cases = v
	return s
}

func (s *AutoTestProdResult) SetContainers(v []*ContainerInfo) *AutoTestProdResult {
	s.Containers = v
	return s
}

func (s *AutoTestProdResult) SetDeployUnit(v string) *AutoTestProdResult {
	s.DeployUnit = &v
	return s
}

func (s *AutoTestProdResult) SetProdCode(v string) *AutoTestProdResult {
	s.ProdCode = &v
	return s
}

func (s *AutoTestProdResult) SetStatus(v string) *AutoTestProdResult {
	s.Status = &v
	return s
}

func (s *AutoTestProdResult) SetUtcCreate(v string) *AutoTestProdResult {
	s.UtcCreate = &v
	return s
}

func (s *AutoTestProdResult) SetUtcEnd(v string) *AutoTestProdResult {
	s.UtcEnd = &v
	return s
}

func (s *AutoTestProdResult) SetUtcModified(v string) *AutoTestProdResult {
	s.UtcModified = &v
	return s
}

func (s *AutoTestProdResult) SetUtcStart(v string) *AutoTestProdResult {
	s.UtcStart = &v
	return s
}

func (s *AutoTestProdResult) SetCellId(v string) *AutoTestProdResult {
	s.CellId = &v
	return s
}

// 部署单元。
type DeployUnit struct {
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 部署单元id，产品实例下唯一。
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 部署单元名称。
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
	UnitIg *string `json:"unit_ig,omitempty" xml:"unit_ig,omitempty" require:"true"`
}

func (s DeployUnit) String() string {
	return tea.Prettify(s)
}

func (s DeployUnit) GoString() string {
	return s.String()
}

func (s *DeployUnit) SetCellId(v string) *DeployUnit {
	s.CellId = &v
	return s
}

func (s *DeployUnit) SetEnvId(v string) *DeployUnit {
	s.EnvId = &v
	return s
}

func (s *DeployUnit) SetIdentity(v string) *DeployUnit {
	s.Identity = &v
	return s
}

func (s *DeployUnit) SetName(v string) *DeployUnit {
	s.Name = &v
	return s
}

func (s *DeployUnit) SetProductCode(v string) *DeployUnit {
	s.ProductCode = &v
	return s
}

func (s *DeployUnit) SetUnitIg(v string) *DeployUnit {
	s.UnitIg = &v
	return s
}

// 数据库schema
type Schema struct {
	// schema所属的数据库实例信息。
	Database *Database `json:"database,omitempty" xml:"database,omitempty"`
	// schema名称。
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 资源所属的资源池id。
	ResourcePoolId *string `json:"resource_pool_id,omitempty" xml:"resource_pool_id,omitempty"`
}

func (s Schema) String() string {
	return tea.Prettify(s)
}

func (s Schema) GoString() string {
	return s.String()
}

func (s *Schema) SetDatabase(v *Database) *Schema {
	s.Database = v
	return s
}

func (s *Schema) SetName(v string) *Schema {
	s.Name = &v
	return s
}

func (s *Schema) SetResourcePoolId(v string) *Schema {
	s.ResourcePoolId = &v
	return s
}

// http配置
type HTTP struct {
	// 检查path
	Path *string `json:"path,omitempty" xml:"path,omitempty" require:"true"`
	// http schema
	Scheme *string `json:"scheme,omitempty" xml:"scheme,omitempty" require:"true"`
	// port
	Port *int64 `json:"port,omitempty" xml:"port,omitempty" require:"true"`
}

func (s HTTP) String() string {
	return tea.Prettify(s)
}

func (s HTTP) GoString() string {
	return s.String()
}

func (s *HTTP) SetPath(v string) *HTTP {
	s.Path = &v
	return s
}

func (s *HTTP) SetScheme(v string) *HTTP {
	s.Scheme = &v
	return s
}

func (s *HTTP) SetPort(v int64) *HTTP {
	s.Port = &v
	return s
}

// 宿主机挂载配置，比如：挂载路径、目录还是文件
type HostPathVolumeSource struct {
	// 宿主机挂载的路径
	Path *string `json:"path,omitempty" xml:"path,omitempty" require:"true"`
	//   挂载的类型：  FILE("File"),
	//     DIRECTORY("Directory");
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s HostPathVolumeSource) String() string {
	return tea.Prettify(s)
}

func (s HostPathVolumeSource) GoString() string {
	return s.String()
}

func (s *HostPathVolumeSource) SetPath(v string) *HostPathVolumeSource {
	s.Path = &v
	return s
}

func (s *HostPathVolumeSource) SetType(v string) *HostPathVolumeSource {
	s.Type = &v
	return s
}

// 持久化存储数据卷配置
type PersistentVolumeSource struct {
	//     READWRITEONCE("ReadWriteOnce"),
	//     READONLYMANY("ReadOnlyMany"),
	//     READWRITEMANY("ReadWriteMany");
	AccessModes []*string `json:"access_modes,omitempty" xml:"access_modes,omitempty" require:"true" type:"Repeated"`
}

func (s PersistentVolumeSource) String() string {
	return tea.Prettify(s)
}

func (s PersistentVolumeSource) GoString() string {
	return s.String()
}

func (s *PersistentVolumeSource) SetAccessModes(v []*string) *PersistentVolumeSource {
	s.AccessModes = v
	return s
}

// 探针配置Exec
type Exec struct {
	// args
	Args []*string `json:"args,omitempty" xml:"args,omitempty" require:"true" type:"Repeated"`
	// cmd
	Cmd *string `json:"cmd,omitempty" xml:"cmd,omitempty" require:"true"`
}

func (s Exec) String() string {
	return tea.Prettify(s)
}

func (s Exec) GoString() string {
	return s.String()
}

func (s *Exec) SetArgs(v []*string) *Exec {
	s.Args = v
	return s
}

func (s *Exec) SetCmd(v string) *Exec {
	s.Cmd = &v
	return s
}

// 检测配置
type TCP struct {
	// tcp port
	Port *int64 `json:"port,omitempty" xml:"port,omitempty" require:"true"`
}

func (s TCP) String() string {
	return tea.Prettify(s)
}

func (s TCP) GoString() string {
	return s.String()
}

func (s *TCP) SetPort(v int64) *TCP {
	s.Port = &v
	return s
}

// 应用数据卷配置项，主要涉及：挂载路径、是否只读、挂载传递方式
type MountOptions struct {
	// 容器内挂载路径
	MountPath *string `json:"mount_path,omitempty" xml:"mount_path,omitempty" require:"true"`
	// 是否只读，默认false
	ReadOnly *string `json:"read_only,omitempty" xml:"read_only,omitempty" require:"true"`
	// 挂载传递策略：    NONE("None"),
	//     HOSTTOCONTAINER("HostToContainer"),
	//     BIDIRECTIONAL("Bidirectional");
	//
	MountPropagation *string `json:"mount_propagation,omitempty" xml:"mount_propagation,omitempty" require:"true"`
}

func (s MountOptions) String() string {
	return tea.Prettify(s)
}

func (s MountOptions) GoString() string {
	return s.String()
}

func (s *MountOptions) SetMountPath(v string) *MountOptions {
	s.MountPath = &v
	return s
}

func (s *MountOptions) SetReadOnly(v string) *MountOptions {
	s.ReadOnly = &v
	return s
}

func (s *MountOptions) SetMountPropagation(v string) *MountOptions {
	s.MountPropagation = &v
	return s
}

// 探针配置
type ProbeConfig struct {
	// 超时时间，单位s
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// exec
	Exec *Exec `json:"exec,omitempty" xml:"exec,omitempty"`
	// http
	Http *HTTP `json:"http,omitempty" xml:"http,omitempty"`
	// tcp
	Tcp *TCP `json:"tcp,omitempty" xml:"tcp,omitempty"`
}

func (s ProbeConfig) String() string {
	return tea.Prettify(s)
}

func (s ProbeConfig) GoString() string {
	return s.String()
}

func (s *ProbeConfig) SetTimeout(v string) *ProbeConfig {
	s.Timeout = &v
	return s
}

func (s *ProbeConfig) SetExec(v *Exec) *ProbeConfig {
	s.Exec = v
	return s
}

func (s *ProbeConfig) SetHttp(v *HTTP) *ProbeConfig {
	s.Http = v
	return s
}

func (s *ProbeConfig) SetTcp(v *TCP) *ProbeConfig {
	s.Tcp = v
	return s
}

// 灰度发布策略
type GrayRelease struct {
	// 需要更新到的副本数，比如：应用A有10个副本，本次更新updated_replicas=5，则会更新前5个
	UpdatedReplicas *int64 `json:"updated_replicas,omitempty" xml:"updated_replicas,omitempty"`
	//     发布策略：TWO_GROUP("TWO_GROUP", "分两组"),
	//     ALL_ONE("ALL_ONE", "共分一组"),
	//     EACH_ONE("EACH_ONE", "每台一组"),
	//     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐"),
	//     CUSTOMIZE("CUSTOMIZE", "自定义分组")
	ReleaseStrategy *string `json:"release_strategy,omitempty" xml:"release_strategy,omitempty" require:"true"`
}

func (s GrayRelease) String() string {
	return tea.Prettify(s)
}

func (s GrayRelease) GoString() string {
	return s.String()
}

func (s *GrayRelease) SetUpdatedReplicas(v int64) *GrayRelease {
	s.UpdatedReplicas = &v
	return s
}

func (s *GrayRelease) SetReleaseStrategy(v string) *GrayRelease {
	s.ReleaseStrategy = &v
	return s
}

// 数据卷挂载方式，比如：宿主机挂载、PV持久化存储挂载
type VolumeSource struct {
	// 宿主机模式配置
	HostPath *HostPathVolumeSource `json:"host_path,omitempty" xml:"host_path,omitempty"`
	// 和Host二选一
	PersistentVolume *PersistentVolumeSource `json:"persistent_volume,omitempty" xml:"persistent_volume,omitempty"`
}

func (s VolumeSource) String() string {
	return tea.Prettify(s)
}

func (s VolumeSource) GoString() string {
	return s.String()
}

func (s *VolumeSource) SetHostPath(v *HostPathVolumeSource) *VolumeSource {
	s.HostPath = v
	return s
}

func (s *VolumeSource) SetPersistentVolume(v *PersistentVolumeSource) *VolumeSource {
	s.PersistentVolume = v
	return s
}

// 数据库变更
type SQLMigration struct {
	// 变更名称
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 产品升级变更sql
	Upgrade *string `json:"upgrade,omitempty" xml:"upgrade,omitempty" require:"true"`
	// 回滚变更sql
	Downgrade *string `json:"downgrade,omitempty" xml:"downgrade,omitempty"`
}

func (s SQLMigration) String() string {
	return tea.Prettify(s)
}

func (s SQLMigration) GoString() string {
	return s.String()
}

func (s *SQLMigration) SetKey(v string) *SQLMigration {
	s.Key = &v
	return s
}

func (s *SQLMigration) SetUpgrade(v string) *SQLMigration {
	s.Upgrade = &v
	return s
}

func (s *SQLMigration) SetDowngrade(v string) *SQLMigration {
	s.Downgrade = &v
	return s
}

// AAP 应用亲和性配置
type AffinityConfig struct {
	// 尽量满足的应用列表
	Preferred []*string `json:"preferred,omitempty" xml:"preferred,omitempty" type:"Repeated"`
	// 必须满足的应用列表
	Required []*string `json:"required,omitempty" xml:"required,omitempty" type:"Repeated"`
}

func (s AffinityConfig) String() string {
	return tea.Prettify(s)
}

func (s AffinityConfig) GoString() string {
	return s.String()
}

func (s *AffinityConfig) SetPreferred(v []*string) *AffinityConfig {
	s.Preferred = v
	return s
}

func (s *AffinityConfig) SetRequired(v []*string) *AffinityConfig {
	s.Required = v
	return s
}

// 数据卷规格
type VolumeSpec struct {
	// 数据卷名称
	VolumeName *string `json:"volume_name,omitempty" xml:"volume_name,omitempty" require:"true"`
	// 数据卷容量，单位为G
	Capacity *string `json:"capacity,omitempty" xml:"capacity,omitempty" require:"true"`
}

func (s VolumeSpec) String() string {
	return tea.Prettify(s)
}

func (s VolumeSpec) GoString() string {
	return s.String()
}

func (s *VolumeSpec) SetVolumeName(v string) *VolumeSpec {
	s.VolumeName = &v
	return s
}

func (s *VolumeSpec) SetCapacity(v string) *VolumeSpec {
	s.Capacity = &v
	return s
}

// 参数模版
type ParameterTemplate struct {
	// template模板值
	Template *string `json:"template,omitempty" xml:"template,omitempty" require:"true"`
	// target 模版对象
	Target *string `json:"target,omitempty" xml:"target,omitempty"`
}

func (s ParameterTemplate) String() string {
	return tea.Prettify(s)
}

func (s ParameterTemplate) GoString() string {
	return s.String()
}

func (s *ParameterTemplate) SetTemplate(v string) *ParameterTemplate {
	s.Template = &v
	return s
}

func (s *ParameterTemplate) SetTarget(v string) *ParameterTemplate {
	s.Target = &v
	return s
}

// 产品实例元数据
type ProductInstanceMeta struct {
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品Code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 实例名称，同一个ns下不可重复
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ProductInstanceMeta) String() string {
	return tea.Prettify(s)
}

func (s ProductInstanceMeta) GoString() string {
	return s.String()
}

func (s *ProductInstanceMeta) SetNamespace(v string) *ProductInstanceMeta {
	s.Namespace = &v
	return s
}

func (s *ProductInstanceMeta) SetProdCode(v string) *ProductInstanceMeta {
	s.ProdCode = &v
	return s
}

func (s *ProductInstanceMeta) SetName(v string) *ProductInstanceMeta {
	s.Name = &v
	return s
}

// 参数
type Parameter struct {
	// 参数默认值
	Default *string `json:"default,omitempty" xml:"default,omitempty" require:"true"`
	// 参数key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	//  参数描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 参数类型        MANUAL("manual"),
	//         CONSTANT("constant"),
	//         EXPRESSION("expression");
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty" require:"true"`
	// 是否必须
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 参数模版
	Parameters []*ParameterTemplate `json:"parameters,omitempty" xml:"parameters,omitempty" require:"true" type:"Repeated"`
	//         STRING("string"),
	//         SECRET("secret"),
	//         INT("int"),
	//         FLOAT("float"),
	//         ANY("any");
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s Parameter) String() string {
	return tea.Prettify(s)
}

func (s Parameter) GoString() string {
	return s.String()
}

func (s *Parameter) SetDefault(v string) *Parameter {
	s.Default = &v
	return s
}

func (s *Parameter) SetKey(v string) *Parameter {
	s.Key = &v
	return s
}

func (s *Parameter) SetDescription(v string) *Parameter {
	s.Description = &v
	return s
}

func (s *Parameter) SetKind(v string) *Parameter {
	s.Kind = &v
	return s
}

func (s *Parameter) SetRequired(v bool) *Parameter {
	s.Required = &v
	return s
}

func (s *Parameter) SetParameters(v []*ParameterTemplate) *Parameter {
	s.Parameters = v
	return s
}

func (s *Parameter) SetType(v string) *Parameter {
	s.Type = &v
	return s
}

// 持久化存储配置
type PersistentVolumeConfig struct {
	// 挂载名称
	VolumeName *string `json:"volume_name,omitempty" xml:"volume_name,omitempty" require:"true"`
	//     挂载的获取名称，默认：ReadWriteOnce。READWRITEONCE("ReadWriteOnce"),
	//     READONLYMANY("ReadOnlyMany"),
	//     READWRITEMANY("ReadWriteMany");
	AccessModes []*string `json:"access_modes,omitempty" xml:"access_modes,omitempty" type:"Repeated"`
	// 存储类
	StorageClass *string `json:"storage_class,omitempty" xml:"storage_class,omitempty"`
	// 是否使用匿名卷，，默认false
	UseEmptyDir *bool `json:"use_empty_dir,omitempty" xml:"use_empty_dir,omitempty" require:"true"`
}

func (s PersistentVolumeConfig) String() string {
	return tea.Prettify(s)
}

func (s PersistentVolumeConfig) GoString() string {
	return s.String()
}

func (s *PersistentVolumeConfig) SetVolumeName(v string) *PersistentVolumeConfig {
	s.VolumeName = &v
	return s
}

func (s *PersistentVolumeConfig) SetAccessModes(v []*string) *PersistentVolumeConfig {
	s.AccessModes = v
	return s
}

func (s *PersistentVolumeConfig) SetStorageClass(v string) *PersistentVolumeConfig {
	s.StorageClass = &v
	return s
}

func (s *PersistentVolumeConfig) SetUseEmptyDir(v bool) *PersistentVolumeConfig {
	s.UseEmptyDir = &v
	return s
}

// AAP应用数据卷元数据
type Volume struct {
	// 数据卷名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	//  可挂载的配置
	VolumeSource *VolumeSource `json:"volume_source,omitempty" xml:"volume_source,omitempty" require:"true"`
	// 数据卷配置
	MountOptions *MountOptions `json:"mount_options,omitempty" xml:"mount_options,omitempty" require:"true"`
}

func (s Volume) String() string {
	return tea.Prettify(s)
}

func (s Volume) GoString() string {
	return s.String()
}

func (s *Volume) SetName(v string) *Volume {
	s.Name = &v
	return s
}

func (s *Volume) SetVolumeSource(v *VolumeSource) *Volume {
	s.VolumeSource = v
	return s
}

func (s *Volume) SetMountOptions(v *MountOptions) *Volume {
	s.MountOptions = v
	return s
}

// 应用部署拓扑约束，比如：亲和性、反亲和性、sidecar等
type TopologyConstraints struct {
	// 亲和性配置
	Affinity *AffinityConfig `json:"affinity,omitempty" xml:"affinity,omitempty"`
	// 反亲和性配置
	AntiAffinity *AffinityConfig `json:"anti_affinity,omitempty" xml:"anti_affinity,omitempty"`
	// sidecar应用列表
	Sidecars []*string `json:"sidecars,omitempty" xml:"sidecars,omitempty" type:"Repeated"`
}

func (s TopologyConstraints) String() string {
	return tea.Prettify(s)
}

func (s TopologyConstraints) GoString() string {
	return s.String()
}

func (s *TopologyConstraints) SetAffinity(v *AffinityConfig) *TopologyConstraints {
	s.Affinity = v
	return s
}

func (s *TopologyConstraints) SetAntiAffinity(v *AffinityConfig) *TopologyConstraints {
	s.AntiAffinity = v
	return s
}

func (s *TopologyConstraints) SetSidecars(v []*string) *TopologyConstraints {
	s.Sidecars = v
	return s
}

// 资源规格
type ResourceSpec struct {
	// cpu规格
	Cpu *string `json:"cpu,omitempty" xml:"cpu,omitempty" require:"true"`
	// gpu规格
	Gpu *string `json:"gpu,omitempty" xml:"gpu,omitempty"`
	// memory
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty" require:"true"`
	// 规格名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 应用副本数
	Replicas *int64 `json:"replicas,omitempty" xml:"replicas,omitempty" require:"true"`
	// 数据卷规格
	Volumes []*VolumeSpec `json:"volumes,omitempty" xml:"volumes,omitempty" require:"true" type:"Repeated"`
}

func (s ResourceSpec) String() string {
	return tea.Prettify(s)
}

func (s ResourceSpec) GoString() string {
	return s.String()
}

func (s *ResourceSpec) SetCpu(v string) *ResourceSpec {
	s.Cpu = &v
	return s
}

func (s *ResourceSpec) SetGpu(v string) *ResourceSpec {
	s.Gpu = &v
	return s
}

func (s *ResourceSpec) SetMemory(v string) *ResourceSpec {
	s.Memory = &v
	return s
}

func (s *ResourceSpec) SetName(v string) *ResourceSpec {
	s.Name = &v
	return s
}

func (s *ResourceSpec) SetReplicas(v int64) *ResourceSpec {
	s.Replicas = &v
	return s
}

func (s *ResourceSpec) SetVolumes(v []*VolumeSpec) *ResourceSpec {
	s.Volumes = v
	return s
}

// 底座配置
type CloudStackConfig struct {
	// 阿里云accessKey获取
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty" require:"true"`
	// 云游加密后的accessKeySecret
	EncryptedAccessKeySecret *string `json:"encrypted_access_key_secret,omitempty" xml:"encrypted_access_key_secret,omitempty" require:"true"`
	// 底座所在的region
	Region *string `json:"region,omitempty" xml:"region,omitempty" require:"true"`
	// 底座可用区
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty" require:"true"`
	// 底座类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s CloudStackConfig) String() string {
	return tea.Prettify(s)
}

func (s CloudStackConfig) GoString() string {
	return s.String()
}

func (s *CloudStackConfig) SetAccessKey(v string) *CloudStackConfig {
	s.AccessKey = &v
	return s
}

func (s *CloudStackConfig) SetEncryptedAccessKeySecret(v string) *CloudStackConfig {
	s.EncryptedAccessKeySecret = &v
	return s
}

func (s *CloudStackConfig) SetRegion(v string) *CloudStackConfig {
	s.Region = &v
	return s
}

func (s *CloudStackConfig) SetZone(v string) *CloudStackConfig {
	s.Zone = &v
	return s
}

func (s *CloudStackConfig) SetType(v string) *CloudStackConfig {
	s.Type = &v
	return s
}

// 应用生命周期
type Lifecycle struct {
	// 存活探针
	Liveness *ProbeConfig `json:"liveness,omitempty" xml:"liveness,omitempty"`
	// readiness
	Readiness *ProbeConfig `json:"readiness,omitempty" xml:"readiness,omitempty"`
	// preStop
	PreStop *ProbeConfig `json:"pre_stop,omitempty" xml:"pre_stop,omitempty"`
	// postStart
	PostStart *ProbeConfig `json:"post_start,omitempty" xml:"post_start,omitempty"`
	// startUp
	StartUp *ProbeConfig `json:"start_up,omitempty" xml:"start_up,omitempty"`
	// entrypoint
	Entrypoint *ProbeConfig `json:"entrypoint,omitempty" xml:"entrypoint,omitempty"`
}

func (s Lifecycle) String() string {
	return tea.Prettify(s)
}

func (s Lifecycle) GoString() string {
	return s.String()
}

func (s *Lifecycle) SetLiveness(v *ProbeConfig) *Lifecycle {
	s.Liveness = v
	return s
}

func (s *Lifecycle) SetReadiness(v *ProbeConfig) *Lifecycle {
	s.Readiness = v
	return s
}

func (s *Lifecycle) SetPreStop(v *ProbeConfig) *Lifecycle {
	s.PreStop = v
	return s
}

func (s *Lifecycle) SetPostStart(v *ProbeConfig) *Lifecycle {
	s.PostStart = v
	return s
}

func (s *Lifecycle) SetStartUp(v *ProbeConfig) *Lifecycle {
	s.StartUp = v
	return s
}

func (s *Lifecycle) SetEntrypoint(v *ProbeConfig) *Lifecycle {
	s.Entrypoint = v
	return s
}

// AAP 应用实例环境变量值
type AppEnv struct {
	// 应用部署时用于渲染的值，渲染为value
	RenderValue *string `json:"render_value,omitempty" xml:"render_value,omitempty" require:"true"`
	// 参数的值，部署的时候会被render_value的渲染结果覆盖
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 参数的key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
}

func (s AppEnv) String() string {
	return tea.Prettify(s)
}

func (s AppEnv) GoString() string {
	return s.String()
}

func (s *AppEnv) SetRenderValue(v string) *AppEnv {
	s.RenderValue = &v
	return s
}

func (s *AppEnv) SetValue(v string) *AppEnv {
	s.Value = &v
	return s
}

func (s *AppEnv) SetKey(v string) *AppEnv {
	s.Key = &v
	return s
}

// 数据库schema
type DatabaseSchema struct {
	// 数据库方言
	Dialect *string `json:"dialect,omitempty" xml:"dialect,omitempty" require:"true"`
	// 数据库schema名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 拓扑名称
	TopoCode *string `json:"topo_code,omitempty" xml:"topo_code,omitempty" require:"true"`
	// schema数据库变更
	SqlMigrations []*SQLMigration `json:"sql_migrations,omitempty" xml:"sql_migrations,omitempty" require:"true" type:"Repeated"`
}

func (s DatabaseSchema) String() string {
	return tea.Prettify(s)
}

func (s DatabaseSchema) GoString() string {
	return s.String()
}

func (s *DatabaseSchema) SetDialect(v string) *DatabaseSchema {
	s.Dialect = &v
	return s
}

func (s *DatabaseSchema) SetName(v string) *DatabaseSchema {
	s.Name = &v
	return s
}

func (s *DatabaseSchema) SetTopoCode(v string) *DatabaseSchema {
	s.TopoCode = &v
	return s
}

func (s *DatabaseSchema) SetSqlMigrations(v []*SQLMigration) *DatabaseSchema {
	s.SqlMigrations = v
	return s
}

// 应用镜像
type ApplicationImage struct {
	// 架构:amd64，arm64
	Arch *string `json:"arch,omitempty" xml:"arch,omitempty" require:"true"`
	// 镜像名称
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
}

func (s ApplicationImage) String() string {
	return tea.Prettify(s)
}

func (s ApplicationImage) GoString() string {
	return s.String()
}

func (s *ApplicationImage) SetArch(v string) *ApplicationImage {
	s.Arch = &v
	return s
}

func (s *ApplicationImage) SetImage(v string) *ApplicationImage {
	s.Image = &v
	return s
}

// 应用服务规格配置
type ApplicationServiceSpec struct {
	// 服务域名
	Domain []*string `json:"domain,omitempty" xml:"domain,omitempty" type:"Repeated"`
	// 服务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 服务端口
	Port *int64 `json:"port,omitempty" xml:"port,omitempty" require:"true"`
	// 服务协议，http，tcp
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty" require:"true"`
}

func (s ApplicationServiceSpec) String() string {
	return tea.Prettify(s)
}

func (s ApplicationServiceSpec) GoString() string {
	return s.String()
}

func (s *ApplicationServiceSpec) SetDomain(v []*string) *ApplicationServiceSpec {
	s.Domain = v
	return s
}

func (s *ApplicationServiceSpec) SetName(v string) *ApplicationServiceSpec {
	s.Name = &v
	return s
}

func (s *ApplicationServiceSpec) SetPort(v int64) *ApplicationServiceSpec {
	s.Port = &v
	return s
}

func (s *ApplicationServiceSpec) SetProtocol(v string) *ApplicationServiceSpec {
	s.Protocol = &v
	return s
}

// 应用发布配置
type AppDeployInitOption struct {
	// 应用name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品内应用的依赖关系，决定应用的执行顺序
	ReleaseOrder *int64 `json:"release_order,omitempty" xml:"release_order,omitempty" require:"true"`
	// 分组策略：
	//     TWO_GROUP("TWO_GROUP", "分两组"),
	//     ALL_ONE("ALL_ONE", "共分一组"),
	//     EACH_ONE("EACH_ONE", "每台一组"),
	//     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐")
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty" require:"true"`
	// 分组是否需要手动确认，默认false
	NeedConfirm *bool `json:"need_confirm,omitempty" xml:"need_confirm,omitempty" require:"true"`
}

func (s AppDeployInitOption) String() string {
	return tea.Prettify(s)
}

func (s AppDeployInitOption) GoString() string {
	return s.String()
}

func (s *AppDeployInitOption) SetName(v string) *AppDeployInitOption {
	s.Name = &v
	return s
}

func (s *AppDeployInitOption) SetReleaseOrder(v int64) *AppDeployInitOption {
	s.ReleaseOrder = &v
	return s
}

func (s *AppDeployInitOption) SetGroupStrategy(v string) *AppDeployInitOption {
	s.GroupStrategy = &v
	return s
}

func (s *AppDeployInitOption) SetNeedConfirm(v bool) *AppDeployInitOption {
	s.NeedConfirm = &v
	return s
}

// 运维配置
type OpsSpec struct {
	// 需要下线的pod列表
	OfflinePod []*string `json:"offline_pod,omitempty" xml:"offline_pod,omitempty" type:"Repeated"`
	// 发布灰度策略
	GrayRelease *GrayRelease `json:"gray_release,omitempty" xml:"gray_release,omitempty"`
}

func (s OpsSpec) String() string {
	return tea.Prettify(s)
}

func (s OpsSpec) GoString() string {
	return s.String()
}

func (s *OpsSpec) SetOfflinePod(v []*string) *OpsSpec {
	s.OfflinePod = v
	return s
}

func (s *OpsSpec) SetGrayRelease(v *GrayRelease) *OpsSpec {
	s.GrayRelease = v
	return s
}

// 产品元信息
type ProductMeta struct {
	// 产品code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品标签
	Labels []*string `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// 产品版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 所属产品集
	Group *string `json:"group,omitempty" xml:"group,omitempty"`
}

func (s ProductMeta) String() string {
	return tea.Prettify(s)
}

func (s ProductMeta) GoString() string {
	return s.String()
}

func (s *ProductMeta) SetCode(v string) *ProductMeta {
	s.Code = &v
	return s
}

func (s *ProductMeta) SetName(v string) *ProductMeta {
	s.Name = &v
	return s
}

func (s *ProductMeta) SetLabels(v []*string) *ProductMeta {
	s.Labels = v
	return s
}

func (s *ProductMeta) SetVersion(v string) *ProductMeta {
	s.Version = &v
	return s
}

func (s *ProductMeta) SetGroup(v string) *ProductMeta {
	s.Group = &v
	return s
}

// 云游站点基本信息
type EnvInfo struct {
	// 站点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 站点展示名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// IAM租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 站点类型：DEV、PROD、SIT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 站点环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 云环境站点类型
	CloudStack *string `json:"cloud_stack,omitempty" xml:"cloud_stack,omitempty" require:"true"`
	// 客户名
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 站点客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 站点资源前缀，云环境名称
	CloudName *string `json:"cloud_name,omitempty" xml:"cloud_name,omitempty" require:"true"`
	// global云环境id
	CloudId *string `json:"cloud_id,omitempty" xml:"cloud_id,omitempty" require:"true"`
	// global云环境中文名称
	RealCloudName *string `json:"real_cloud_name,omitempty" xml:"real_cloud_name,omitempty" require:"true"`
	// rdb资源池名称
	RdbPoolName *string `json:"rdb_pool_name,omitempty" xml:"rdb_pool_name,omitempty" require:"true"`
	// 容器资源池ID
	ContainerPoolName *string `json:"container_pool_name,omitempty" xml:"container_pool_name,omitempty" require:"true"`
	// lb资源池名称
	LbPoolName *string `json:"lb_pool_name,omitempty" xml:"lb_pool_name,omitempty" require:"true"`
	// 对象资源池名称
	StoragePoolName *string `json:"storage_pool_name,omitempty" xml:"storage_pool_name,omitempty"`
	// ecs资源池名称
	EcsPoolName *string `json:"ecs_pool_name,omitempty" xml:"ecs_pool_name,omitempty" require:"true"`
	// vpc资源池名称
	VpcPoolName *string `json:"vpc_pool_name,omitempty" xml:"vpc_pool_name,omitempty" require:"true"`
	// dns资源池名称
	DnsPoolName *string `json:"dns_pool_name,omitempty" xml:"dns_pool_name,omitempty" require:"true"`
	// keystone资源池名称
	KeystonePoolName *string `json:"keystone_pool_name,omitempty" xml:"keystone_pool_name,omitempty" require:"true"`
	// 底座配置
	CloudStackConfig *CloudStackConfig `json:"cloud_stack_config,omitempty" xml:"cloud_stack_config,omitempty" require:"true"`
}

func (s EnvInfo) String() string {
	return tea.Prettify(s)
}

func (s EnvInfo) GoString() string {
	return s.String()
}

func (s *EnvInfo) SetName(v string) *EnvInfo {
	s.Name = &v
	return s
}

func (s *EnvInfo) SetDisplayName(v string) *EnvInfo {
	s.DisplayName = &v
	return s
}

func (s *EnvInfo) SetTenantId(v string) *EnvInfo {
	s.TenantId = &v
	return s
}

func (s *EnvInfo) SetType(v string) *EnvInfo {
	s.Type = &v
	return s
}

func (s *EnvInfo) SetEnvId(v string) *EnvInfo {
	s.EnvId = &v
	return s
}

func (s *EnvInfo) SetCloudStack(v string) *EnvInfo {
	s.CloudStack = &v
	return s
}

func (s *EnvInfo) SetCustomerName(v string) *EnvInfo {
	s.CustomerName = &v
	return s
}

func (s *EnvInfo) SetCustomerId(v string) *EnvInfo {
	s.CustomerId = &v
	return s
}

func (s *EnvInfo) SetCloudName(v string) *EnvInfo {
	s.CloudName = &v
	return s
}

func (s *EnvInfo) SetCloudId(v string) *EnvInfo {
	s.CloudId = &v
	return s
}

func (s *EnvInfo) SetRealCloudName(v string) *EnvInfo {
	s.RealCloudName = &v
	return s
}

func (s *EnvInfo) SetRdbPoolName(v string) *EnvInfo {
	s.RdbPoolName = &v
	return s
}

func (s *EnvInfo) SetContainerPoolName(v string) *EnvInfo {
	s.ContainerPoolName = &v
	return s
}

func (s *EnvInfo) SetLbPoolName(v string) *EnvInfo {
	s.LbPoolName = &v
	return s
}

func (s *EnvInfo) SetStoragePoolName(v string) *EnvInfo {
	s.StoragePoolName = &v
	return s
}

func (s *EnvInfo) SetEcsPoolName(v string) *EnvInfo {
	s.EcsPoolName = &v
	return s
}

func (s *EnvInfo) SetVpcPoolName(v string) *EnvInfo {
	s.VpcPoolName = &v
	return s
}

func (s *EnvInfo) SetDnsPoolName(v string) *EnvInfo {
	s.DnsPoolName = &v
	return s
}

func (s *EnvInfo) SetKeystonePoolName(v string) *EnvInfo {
	s.KeystonePoolName = &v
	return s
}

func (s *EnvInfo) SetCloudStackConfig(v *CloudStackConfig) *EnvInfo {
	s.CloudStackConfig = v
	return s
}

// lb实例监听器
type LbListener struct {
	// lb监听器协议：HTTP、TCP
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty" require:"true"`
	// 监听器端口
	ListenerPort *int64 `json:"listener_port,omitempty" xml:"listener_port,omitempty" require:"true"`
	// 监听器后端端口
	BackendServerPort *int64 `json:"backend_server_port,omitempty" xml:"backend_server_port,omitempty" require:"true"`
	// 后端转发端口
	BackendServerForwardPort *int64 `json:"backend_server_forward_port,omitempty" xml:"backend_server_forward_port,omitempty" require:"true"`
	// 健康检查开关
	HealthMonitor *bool `json:"health_monitor,omitempty" xml:"health_monitor,omitempty" require:"true"`
	// 健康检查端口
	HealthCheckPort *int64 `json:"health_check_port,omitempty" xml:"health_check_port,omitempty" require:"true"`
	// 健康检查阈值
	HealthCheckThreadhold *int64 `json:"health_check_threadhold,omitempty" xml:"health_check_threadhold,omitempty" require:"true"`
	// 健康检查uri
	HealthCheckUri *string `json:"health_check_uri,omitempty" xml:"health_check_uri,omitempty"`
	// 健康检查间隔
	HealthCheckInterval *int64 `json:"health_check_interval,omitempty" xml:"health_check_interval,omitempty" require:"true"`
	// 健康检查http方法
	HttpMethod *string `json:"http_method,omitempty" xml:"http_method,omitempty" require:"true"`
	// 健康检查期望返回的http code
	ExpectCodes *string `json:"expect_codes,omitempty" xml:"expect_codes,omitempty"`
}

func (s LbListener) String() string {
	return tea.Prettify(s)
}

func (s LbListener) GoString() string {
	return s.String()
}

func (s *LbListener) SetProtocol(v string) *LbListener {
	s.Protocol = &v
	return s
}

func (s *LbListener) SetListenerPort(v int64) *LbListener {
	s.ListenerPort = &v
	return s
}

func (s *LbListener) SetBackendServerPort(v int64) *LbListener {
	s.BackendServerPort = &v
	return s
}

func (s *LbListener) SetBackendServerForwardPort(v int64) *LbListener {
	s.BackendServerForwardPort = &v
	return s
}

func (s *LbListener) SetHealthMonitor(v bool) *LbListener {
	s.HealthMonitor = &v
	return s
}

func (s *LbListener) SetHealthCheckPort(v int64) *LbListener {
	s.HealthCheckPort = &v
	return s
}

func (s *LbListener) SetHealthCheckThreadhold(v int64) *LbListener {
	s.HealthCheckThreadhold = &v
	return s
}

func (s *LbListener) SetHealthCheckUri(v string) *LbListener {
	s.HealthCheckUri = &v
	return s
}

func (s *LbListener) SetHealthCheckInterval(v int64) *LbListener {
	s.HealthCheckInterval = &v
	return s
}

func (s *LbListener) SetHttpMethod(v string) *LbListener {
	s.HttpMethod = &v
	return s
}

func (s *LbListener) SetExpectCodes(v string) *LbListener {
	s.ExpectCodes = &v
	return s
}

// 产品部署单元实例信息
type DeploymentUnitInstance struct {
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty" require:"true"`
	// 部署单元实例id
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
	// 部署单元实例状态：ACTIVE、FAILED、UPGRADING
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 部署拓扑标识
	DeployTopologyIdentity *string `json:"deploy_topology_identity,omitempty" xml:"deploy_topology_identity,omitempty" require:"true"`
	// 部署规格标识id
	DeploySpecIdentity *string `json:"deploy_spec_identity,omitempty" xml:"deploy_spec_identity,omitempty" require:"true"`
	// 部署单元部署在哪个zone
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty"`
	// 逻辑部署单元实例id
	LogicalInstanceId *string `json:"logical_instance_id,omitempty" xml:"logical_instance_id,omitempty"`
}

func (s DeploymentUnitInstance) String() string {
	return tea.Prettify(s)
}

func (s DeploymentUnitInstance) GoString() string {
	return s.String()
}

func (s *DeploymentUnitInstance) SetEnvId(v string) *DeploymentUnitInstance {
	s.EnvId = &v
	return s
}

func (s *DeploymentUnitInstance) SetProdCode(v string) *DeploymentUnitInstance {
	s.ProdCode = &v
	return s
}

func (s *DeploymentUnitInstance) SetProdVersion(v string) *DeploymentUnitInstance {
	s.ProdVersion = &v
	return s
}

func (s *DeploymentUnitInstance) SetIdentity(v string) *DeploymentUnitInstance {
	s.Identity = &v
	return s
}

func (s *DeploymentUnitInstance) SetDeploymentUnitIdentity(v string) *DeploymentUnitInstance {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *DeploymentUnitInstance) SetStatus(v string) *DeploymentUnitInstance {
	s.Status = &v
	return s
}

func (s *DeploymentUnitInstance) SetDeployTopologyIdentity(v string) *DeploymentUnitInstance {
	s.DeployTopologyIdentity = &v
	return s
}

func (s *DeploymentUnitInstance) SetDeploySpecIdentity(v string) *DeploymentUnitInstance {
	s.DeploySpecIdentity = &v
	return s
}

func (s *DeploymentUnitInstance) SetZone(v string) *DeploymentUnitInstance {
	s.Zone = &v
	return s
}

func (s *DeploymentUnitInstance) SetLogicalInstanceId(v string) *DeploymentUnitInstance {
	s.LogicalInstanceId = &v
	return s
}

// lb基线实例
type LbInstance struct {
	// lb资源池
	ResourcePoolName *string `json:"resource_pool_name,omitempty" xml:"resource_pool_name,omitempty" require:"true"`
	// lb资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// lb资源实例名称
	ResourceName *string `json:"resource_name,omitempty" xml:"resource_name,omitempty" require:"true"`
	// lb路由信息：prodCode_appName
	LbRouterName *string `json:"lb_router_name,omitempty" xml:"lb_router_name,omitempty" require:"true"`
	// lb的vip
	Vip *string `json:"vip,omitempty" xml:"vip,omitempty" require:"true"`
	// lb绑定的域名
	DomainName *string `json:"domain_name,omitempty" xml:"domain_name,omitempty" require:"true"`
	// lb地址类型：INTENET公网，INTRANET内网
	AddressType *string `json:"address_type,omitempty" xml:"address_type,omitempty" require:"true"`
	// lb带宽
	Bandwidth *string `json:"bandwidth,omitempty" xml:"bandwidth,omitempty" require:"true"`
	// 是否是anytunnel lb
	AnyTunnel *bool `json:"any_tunnel,omitempty" xml:"any_tunnel,omitempty" require:"true"`
	// 是否是办公网
	OfficialOnly *bool `json:"official_only,omitempty" xml:"official_only,omitempty" require:"true"`
	// lb类型：SLB、ALB
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true"`
	// lb状态，ACTIVE，FAILED
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
}

func (s LbInstance) String() string {
	return tea.Prettify(s)
}

func (s LbInstance) GoString() string {
	return s.String()
}

func (s *LbInstance) SetResourcePoolName(v string) *LbInstance {
	s.ResourcePoolName = &v
	return s
}

func (s *LbInstance) SetResourceId(v string) *LbInstance {
	s.ResourceId = &v
	return s
}

func (s *LbInstance) SetResourceName(v string) *LbInstance {
	s.ResourceName = &v
	return s
}

func (s *LbInstance) SetLbRouterName(v string) *LbInstance {
	s.LbRouterName = &v
	return s
}

func (s *LbInstance) SetVip(v string) *LbInstance {
	s.Vip = &v
	return s
}

func (s *LbInstance) SetDomainName(v string) *LbInstance {
	s.DomainName = &v
	return s
}

func (s *LbInstance) SetAddressType(v string) *LbInstance {
	s.AddressType = &v
	return s
}

func (s *LbInstance) SetBandwidth(v string) *LbInstance {
	s.Bandwidth = &v
	return s
}

func (s *LbInstance) SetAnyTunnel(v bool) *LbInstance {
	s.AnyTunnel = &v
	return s
}

func (s *LbInstance) SetOfficialOnly(v bool) *LbInstance {
	s.OfficialOnly = &v
	return s
}

func (s *LbInstance) SetProvider(v string) *LbInstance {
	s.Provider = &v
	return s
}

func (s *LbInstance) SetStatus(v string) *LbInstance {
	s.Status = &v
	return s
}

func (s *LbInstance) SetDeploymentUnitInstanceIdentity(v string) *LbInstance {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *LbInstance) SetDeploymentUnitIdentity(v string) *LbInstance {
	s.DeploymentUnitIdentity = &v
	return s
}

// 资源基线实例元信息
type ResourceInstance struct {
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// zz-rdb
	ResourcePoolName *string `json:"resource_pool_name,omitempty" xml:"resource_pool_name,omitempty" require:"true"`
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 资源类型：LB、SERVER、RDB
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
	// 区域id
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty"`
	// 可用区id
	ZoneId *string `json:"zone_id,omitempty" xml:"zone_id,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty" require:"true"`
}

func (s ResourceInstance) String() string {
	return tea.Prettify(s)
}

func (s ResourceInstance) GoString() string {
	return s.String()
}

func (s *ResourceInstance) SetEnvId(v string) *ResourceInstance {
	s.EnvId = &v
	return s
}

func (s *ResourceInstance) SetProdCode(v string) *ResourceInstance {
	s.ProdCode = &v
	return s
}

func (s *ResourceInstance) SetResourcePoolName(v string) *ResourceInstance {
	s.ResourcePoolName = &v
	return s
}

func (s *ResourceInstance) SetResourceId(v string) *ResourceInstance {
	s.ResourceId = &v
	return s
}

func (s *ResourceInstance) SetResourceType(v string) *ResourceInstance {
	s.ResourceType = &v
	return s
}

func (s *ResourceInstance) SetRegionId(v string) *ResourceInstance {
	s.RegionId = &v
	return s
}

func (s *ResourceInstance) SetZoneId(v string) *ResourceInstance {
	s.ZoneId = &v
	return s
}

func (s *ResourceInstance) SetDeploymentUnitIdentity(v string) *ResourceInstance {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *ResourceInstance) SetDeploymentUnitInstanceIdentity(v string) *ResourceInstance {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

// AAP 应用实例
type ApplicationInstance struct {
	// 应用实例的名字，一般为应用code的小写字母
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 应用版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// 应用实例的命名空间，一般：站点code-prodCode小写
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 一般为空，系统自动填充默认值
	StorageClass *string `json:"storage_class,omitempty" xml:"storage_class,omitempty"`
	// 应用部署的拓扑约束，一般为：亲和性、反亲和性、sidecar等
	TopologyConstraints *TopologyConstraints `json:"topology_constraints,omitempty" xml:"topology_constraints,omitempty"`
	// 健康检查、hook配置
	Lifecycle *Lifecycle `json:"lifecycle,omitempty" xml:"lifecycle,omitempty"`
	// 应用的环境变量
	AppEnvs []*AppEnv `json:"app_envs,omitempty" xml:"app_envs,omitempty" type:"Repeated"`
	// 依赖的应用名列表
	ApplicationDependencies []*string `json:"application_dependencies,omitempty" xml:"application_dependencies,omitempty" type:"Repeated"`
	// 应用的规格
	ResourceSpec *ResourceSpec `json:"resource_spec,omitempty" xml:"resource_spec,omitempty" require:"true"`
	// 持久化存储，可为空数组
	PersistentVolumeConfigs []*PersistentVolumeConfig `json:"persistent_volume_configs,omitempty" xml:"persistent_volume_configs,omitempty" require:"true" type:"Repeated"`
	// 运维策略
	OpsSpec *OpsSpec `json:"ops_spec,omitempty" xml:"ops_spec,omitempty" require:"true"`
	// OrderedReady:顺序更新，Parallel：并行更新
	PodManagementPolicy *string `json:"pod_management_policy,omitempty" xml:"pod_management_policy,omitempty" require:"true"`
	// 镜像
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
}

func (s ApplicationInstance) String() string {
	return tea.Prettify(s)
}

func (s ApplicationInstance) GoString() string {
	return s.String()
}

func (s *ApplicationInstance) SetName(v string) *ApplicationInstance {
	s.Name = &v
	return s
}

func (s *ApplicationInstance) SetAppVersion(v string) *ApplicationInstance {
	s.AppVersion = &v
	return s
}

func (s *ApplicationInstance) SetNamespace(v string) *ApplicationInstance {
	s.Namespace = &v
	return s
}

func (s *ApplicationInstance) SetStorageClass(v string) *ApplicationInstance {
	s.StorageClass = &v
	return s
}

func (s *ApplicationInstance) SetTopologyConstraints(v *TopologyConstraints) *ApplicationInstance {
	s.TopologyConstraints = v
	return s
}

func (s *ApplicationInstance) SetLifecycle(v *Lifecycle) *ApplicationInstance {
	s.Lifecycle = v
	return s
}

func (s *ApplicationInstance) SetAppEnvs(v []*AppEnv) *ApplicationInstance {
	s.AppEnvs = v
	return s
}

func (s *ApplicationInstance) SetApplicationDependencies(v []*string) *ApplicationInstance {
	s.ApplicationDependencies = v
	return s
}

func (s *ApplicationInstance) SetResourceSpec(v *ResourceSpec) *ApplicationInstance {
	s.ResourceSpec = v
	return s
}

func (s *ApplicationInstance) SetPersistentVolumeConfigs(v []*PersistentVolumeConfig) *ApplicationInstance {
	s.PersistentVolumeConfigs = v
	return s
}

func (s *ApplicationInstance) SetOpsSpec(v *OpsSpec) *ApplicationInstance {
	s.OpsSpec = v
	return s
}

func (s *ApplicationInstance) SetPodManagementPolicy(v string) *ApplicationInstance {
	s.PodManagementPolicy = &v
	return s
}

func (s *ApplicationInstance) SetImage(v string) *ApplicationInstance {
	s.Image = &v
	return s
}

// 容器基线实例信息
type ContainerInstance struct {
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 容器名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 容器挂载的阿里云anytunnel的资源id
	AnytunnelResourceId *string `json:"anytunnel_resource_id,omitempty" xml:"anytunnel_resource_id,omitempty"`
	// 容器对应的index
	Index *string `json:"index,omitempty" xml:"index,omitempty" require:"true"`
	// 容器ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 集群节点ip
	HostIp *string `json:"host_ip,omitempty" xml:"host_ip,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 应用镜像名
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
	// cpu
	Cpu *string `json:"cpu,omitempty" xml:"cpu,omitempty" require:"true"`
	// 内存大小
	Memory *string `json:"memory,omitempty" xml:"memory,omitempty" require:"true"`
	// 容器挂载的阿里云anytunnelIp
	AnytunnelServiceIp *string `json:"anytunnel_service_ip,omitempty" xml:"anytunnel_service_ip,omitempty"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
}

func (s ContainerInstance) String() string {
	return tea.Prettify(s)
}

func (s ContainerInstance) GoString() string {
	return s.String()
}

func (s *ContainerInstance) SetResourceId(v string) *ContainerInstance {
	s.ResourceId = &v
	return s
}

func (s *ContainerInstance) SetName(v string) *ContainerInstance {
	s.Name = &v
	return s
}

func (s *ContainerInstance) SetAnytunnelResourceId(v string) *ContainerInstance {
	s.AnytunnelResourceId = &v
	return s
}

func (s *ContainerInstance) SetIndex(v string) *ContainerInstance {
	s.Index = &v
	return s
}

func (s *ContainerInstance) SetIp(v string) *ContainerInstance {
	s.Ip = &v
	return s
}

func (s *ContainerInstance) SetHostIp(v string) *ContainerInstance {
	s.HostIp = &v
	return s
}

func (s *ContainerInstance) SetProdCode(v string) *ContainerInstance {
	s.ProdCode = &v
	return s
}

func (s *ContainerInstance) SetAppName(v string) *ContainerInstance {
	s.AppName = &v
	return s
}

func (s *ContainerInstance) SetImage(v string) *ContainerInstance {
	s.Image = &v
	return s
}

func (s *ContainerInstance) SetCpu(v string) *ContainerInstance {
	s.Cpu = &v
	return s
}

func (s *ContainerInstance) SetMemory(v string) *ContainerInstance {
	s.Memory = &v
	return s
}

func (s *ContainerInstance) SetAnytunnelServiceIp(v string) *ContainerInstance {
	s.AnytunnelServiceIp = &v
	return s
}

func (s *ContainerInstance) SetDeploymentUnitInstanceIdentity(v string) *ContainerInstance {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *ContainerInstance) SetDeploymentUnitIdentity(v string) *ContainerInstance {
	s.DeploymentUnitIdentity = &v
	return s
}

// 应用元数据
type ApplicationMeta struct {
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 应用code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 应用版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 所属产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 应用之间的依赖
	Dependencies []*string `json:"dependencies,omitempty" xml:"dependencies,omitempty" type:"Repeated"`
	// 应用类型    STANDARD("standard"),
	//     JOB("job"),
	//     SIDECAR("sidecar"),
	//     DAEMON("daemon");
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty" require:"true"`
}

func (s ApplicationMeta) String() string {
	return tea.Prettify(s)
}

func (s ApplicationMeta) GoString() string {
	return s.String()
}

func (s *ApplicationMeta) SetName(v string) *ApplicationMeta {
	s.Name = &v
	return s
}

func (s *ApplicationMeta) SetCode(v string) *ApplicationMeta {
	s.Code = &v
	return s
}

func (s *ApplicationMeta) SetVersion(v string) *ApplicationMeta {
	s.Version = &v
	return s
}

func (s *ApplicationMeta) SetProductCode(v string) *ApplicationMeta {
	s.ProductCode = &v
	return s
}

func (s *ApplicationMeta) SetDependencies(v []*string) *ApplicationMeta {
	s.Dependencies = v
	return s
}

func (s *ApplicationMeta) SetKind(v string) *ApplicationMeta {
	s.Kind = &v
	return s
}

//  应用基线数据
type AppInstance struct {
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 应用版本
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty" require:"true"`
	// 应用镜像名
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
	// 应用基线状态：ACTIVE、FAILED、UPGRADING
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty"`
	// 应用期望实例数
	ExpectReplica *string `json:"expect_replica,omitempty" xml:"expect_replica,omitempty" require:"true"`
}

func (s AppInstance) String() string {
	return tea.Prettify(s)
}

func (s AppInstance) GoString() string {
	return s.String()
}

func (s *AppInstance) SetEnvId(v string) *AppInstance {
	s.EnvId = &v
	return s
}

func (s *AppInstance) SetProdCode(v string) *AppInstance {
	s.ProdCode = &v
	return s
}

func (s *AppInstance) SetAppName(v string) *AppInstance {
	s.AppName = &v
	return s
}

func (s *AppInstance) SetAppVersion(v string) *AppInstance {
	s.AppVersion = &v
	return s
}

func (s *AppInstance) SetImage(v string) *AppInstance {
	s.Image = &v
	return s
}

func (s *AppInstance) SetStatus(v string) *AppInstance {
	s.Status = &v
	return s
}

func (s *AppInstance) SetDeploymentUnitIdentity(v string) *AppInstance {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *AppInstance) SetDeploymentUnitInstanceIdentity(v string) *AppInstance {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *AppInstance) SetExpectReplica(v string) *AppInstance {
	s.ExpectReplica = &v
	return s
}

// 站点信息
type SiteInfo struct {
	// 站点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 站点code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s SiteInfo) String() string {
	return tea.Prettify(s)
}

func (s SiteInfo) GoString() string {
	return s.String()
}

func (s *SiteInfo) SetName(v string) *SiteInfo {
	s.Name = &v
	return s
}

func (s *SiteInfo) SetCode(v string) *SiteInfo {
	s.Code = &v
	return s
}

// lb后端服务器
type LbBackendServer struct {
	// 应用容器名称
	ContainerName *string `json:"container_name,omitempty" xml:"container_name,omitempty" require:"true"`
	// lb backendServer权值
	Weight *int64 `json:"weight,omitempty" xml:"weight,omitempty" require:"true"`
	// lb和backendServer关系
	RelationType *string `json:"relation_type,omitempty" xml:"relation_type,omitempty" require:"true"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s LbBackendServer) String() string {
	return tea.Prettify(s)
}

func (s LbBackendServer) GoString() string {
	return s.String()
}

func (s *LbBackendServer) SetContainerName(v string) *LbBackendServer {
	s.ContainerName = &v
	return s
}

func (s *LbBackendServer) SetWeight(v int64) *LbBackendServer {
	s.Weight = &v
	return s
}

func (s *LbBackendServer) SetRelationType(v string) *LbBackendServer {
	s.RelationType = &v
	return s
}

func (s *LbBackendServer) SetEnvId(v string) *LbBackendServer {
	s.EnvId = &v
	return s
}

// 产品部署初始化配置
type ProductDeployInitOption struct {
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品实例名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 多个产品实例时，本产品的发布顺序
	ReleaseOrder *int64 `json:"release_order,omitempty" xml:"release_order,omitempty" require:"true"`
	// 产品内应用分部署配置
	Apps []*AppDeployInitOption `json:"apps,omitempty" xml:"apps,omitempty" require:"true" type:"Repeated"`
}

func (s ProductDeployInitOption) String() string {
	return tea.Prettify(s)
}

func (s ProductDeployInitOption) GoString() string {
	return s.String()
}

func (s *ProductDeployInitOption) SetNamespace(v string) *ProductDeployInitOption {
	s.Namespace = &v
	return s
}

func (s *ProductDeployInitOption) SetName(v string) *ProductDeployInitOption {
	s.Name = &v
	return s
}

func (s *ProductDeployInitOption) SetProdCode(v string) *ProductDeployInitOption {
	s.ProdCode = &v
	return s
}

func (s *ProductDeployInitOption) SetSiteCode(v string) *ProductDeployInitOption {
	s.SiteCode = &v
	return s
}

func (s *ProductDeployInitOption) SetReleaseOrder(v int64) *ProductDeployInitOption {
	s.ReleaseOrder = &v
	return s
}

func (s *ProductDeployInitOption) SetApps(v []*AppDeployInitOption) *ProductDeployInitOption {
	s.Apps = v
	return s
}

// 产品部署初始化请求
type ProductDeployInitOptionRequest struct {
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 需要部署的产品实例元数据
	ProductInstances []*ProductInstanceMeta `json:"product_instances,omitempty" xml:"product_instances,omitempty" require:"true" type:"Repeated"`
}

func (s ProductDeployInitOptionRequest) String() string {
	return tea.Prettify(s)
}

func (s ProductDeployInitOptionRequest) GoString() string {
	return s.String()
}

func (s *ProductDeployInitOptionRequest) SetSiteCode(v string) *ProductDeployInitOptionRequest {
	s.SiteCode = &v
	return s
}

func (s *ProductDeployInitOptionRequest) SetProductInstances(v []*ProductInstanceMeta) *ProductDeployInitOptionRequest {
	s.ProductInstances = v
	return s
}

// 产品元信息
type Product struct {
	// 数据库变更
	Database []*DatabaseSchema `json:"database,omitempty" xml:"database,omitempty" require:"true" type:"Repeated"`
	// 产品元信息
	Meta *ProductMeta `json:"meta,omitempty" xml:"meta,omitempty" require:"true"`
	// 产品共享参数
	Parameters []*Parameter `json:"parameters,omitempty" xml:"parameters,omitempty" type:"Repeated"`
}

func (s Product) String() string {
	return tea.Prettify(s)
}

func (s Product) GoString() string {
	return s.String()
}

func (s *Product) SetDatabase(v []*DatabaseSchema) *Product {
	s.Database = v
	return s
}

func (s *Product) SetMeta(v *ProductMeta) *Product {
	s.Meta = v
	return s
}

func (s *Product) SetParameters(v []*Parameter) *Product {
	s.Parameters = v
	return s
}

// 产品基线元信息
type ProdMetaInfo struct {
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty" require:"true"`
	// 产品部署拓扑标识id
	DeployTopologyIdentity *string `json:"deploy_topology_identity,omitempty" xml:"deploy_topology_identity,omitempty" require:"true"`
	// 产品部署规格标识id
	DeploySpecIdentity *string `json:"deploy_spec_identity,omitempty" xml:"deploy_spec_identity,omitempty" require:"true"`
	// 产品基线状态：AVTIVE、FAILED、UPGRADING
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s ProdMetaInfo) String() string {
	return tea.Prettify(s)
}

func (s ProdMetaInfo) GoString() string {
	return s.String()
}

func (s *ProdMetaInfo) SetEnvId(v string) *ProdMetaInfo {
	s.EnvId = &v
	return s
}

func (s *ProdMetaInfo) SetProdCode(v string) *ProdMetaInfo {
	s.ProdCode = &v
	return s
}

func (s *ProdMetaInfo) SetProdVersion(v string) *ProdMetaInfo {
	s.ProdVersion = &v
	return s
}

func (s *ProdMetaInfo) SetDeployTopologyIdentity(v string) *ProdMetaInfo {
	s.DeployTopologyIdentity = &v
	return s
}

func (s *ProdMetaInfo) SetDeploySpecIdentity(v string) *ProdMetaInfo {
	s.DeploySpecIdentity = &v
	return s
}

func (s *ProdMetaInfo) SetStatus(v string) *ProdMetaInfo {
	s.Status = &v
	return s
}

type CreateAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 执行运维操作的目标应用列表。
	AppServiceIds []*string `json:"app_service_ids,omitempty" xml:"app_service_ids,omitempty" type:"Repeated"`
	// 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
	ContainerIds []*string `json:"container_ids,omitempty" xml:"container_ids,omitempty" type:"Repeated"`
	// 目标环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
	OpsAction *string `json:"ops_action,omitempty" xml:"ops_action,omitempty" require:"true"`
	// 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
	OpsDimension *string `json:"ops_dimension,omitempty" xml:"ops_dimension,omitempty" require:"true"`
	// 要执行运维操作的应用服务实例所在的单元。
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 操作人ID
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
	// 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty"`
}

func (s CreateAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppopsRequest) GoString() string {
	return s.String()
}

func (s *CreateAppopsRequest) SetAuthToken(v string) *CreateAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppopsRequest) SetProductInstanceId(v string) *CreateAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppopsRequest) SetAppServiceIds(v []*string) *CreateAppopsRequest {
	s.AppServiceIds = v
	return s
}

func (s *CreateAppopsRequest) SetContainerIds(v []*string) *CreateAppopsRequest {
	s.ContainerIds = v
	return s
}

func (s *CreateAppopsRequest) SetEnvId(v string) *CreateAppopsRequest {
	s.EnvId = &v
	return s
}

func (s *CreateAppopsRequest) SetOpsAction(v string) *CreateAppopsRequest {
	s.OpsAction = &v
	return s
}

func (s *CreateAppopsRequest) SetOpsDimension(v string) *CreateAppopsRequest {
	s.OpsDimension = &v
	return s
}

func (s *CreateAppopsRequest) SetCellId(v string) *CreateAppopsRequest {
	s.CellId = &v
	return s
}

func (s *CreateAppopsRequest) SetSubmitterId(v string) *CreateAppopsRequest {
	s.SubmitterId = &v
	return s
}

func (s *CreateAppopsRequest) SetSubmitterName(v string) *CreateAppopsRequest {
	s.SubmitterName = &v
	return s
}

func (s *CreateAppopsRequest) SetGroupStrategy(v string) *CreateAppopsRequest {
	s.GroupStrategy = &v
	return s
}

type CreateAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppopsResponse) GoString() string {
	return s.String()
}

func (s *CreateAppopsResponse) SetReqMsgId(v string) *CreateAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppopsResponse) SetResultCode(v string) *CreateAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppopsResponse) SetResultMsg(v string) *CreateAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAppopsResponse) SetOpsPlanId(v string) *CreateAppopsResponse {
	s.OpsPlanId = &v
	return s
}

type GetAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s GetAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAppopsRequest) GoString() string {
	return s.String()
}

func (s *GetAppopsRequest) SetAuthToken(v string) *GetAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAppopsRequest) SetProductInstanceId(v string) *GetAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAppopsRequest) SetOpsPlanId(v string) *GetAppopsRequest {
	s.OpsPlanId = &v
	return s
}

type GetAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行失败的节点
	FailedNodes []*NodeExecutionLog `json:"failed_nodes,omitempty" xml:"failed_nodes,omitempty" type:"Repeated"`
	// 运维单执行日志。
	Log *string `json:"log,omitempty" xml:"log,omitempty"`
	// 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAppopsResponse) GoString() string {
	return s.String()
}

func (s *GetAppopsResponse) SetReqMsgId(v string) *GetAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAppopsResponse) SetResultCode(v string) *GetAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAppopsResponse) SetResultMsg(v string) *GetAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAppopsResponse) SetFailedNodes(v []*NodeExecutionLog) *GetAppopsResponse {
	s.FailedNodes = v
	return s
}

func (s *GetAppopsResponse) SetLog(v string) *GetAppopsResponse {
	s.Log = &v
	return s
}

func (s *GetAppopsResponse) SetStatus(v string) *GetAppopsResponse {
	s.Status = &v
	return s
}

type RetryAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s RetryAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryAppopsRequest) GoString() string {
	return s.String()
}

func (s *RetryAppopsRequest) SetAuthToken(v string) *RetryAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryAppopsRequest) SetProductInstanceId(v string) *RetryAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryAppopsRequest) SetOpsPlanId(v string) *RetryAppopsRequest {
	s.OpsPlanId = &v
	return s
}

type RetryAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryAppopsResponse) GoString() string {
	return s.String()
}

func (s *RetryAppopsResponse) SetReqMsgId(v string) *RetryAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryAppopsResponse) SetResultCode(v string) *RetryAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryAppopsResponse) SetResultMsg(v string) *RetryAppopsResponse {
	s.ResultMsg = &v
	return s
}

type CancelAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
	// 操作人id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s CancelAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAppopsRequest) GoString() string {
	return s.String()
}

func (s *CancelAppopsRequest) SetAuthToken(v string) *CancelAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAppopsRequest) SetProductInstanceId(v string) *CancelAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAppopsRequest) SetOpsPlanId(v string) *CancelAppopsRequest {
	s.OpsPlanId = &v
	return s
}

func (s *CancelAppopsRequest) SetSubmitterId(v string) *CancelAppopsRequest {
	s.SubmitterId = &v
	return s
}

func (s *CancelAppopsRequest) SetSubmitterName(v string) *CancelAppopsRequest {
	s.SubmitterName = &v
	return s
}

type CancelAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAppopsResponse) GoString() string {
	return s.String()
}

func (s *CancelAppopsResponse) SetReqMsgId(v string) *CancelAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAppopsResponse) SetResultCode(v string) *CancelAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAppopsResponse) SetResultMsg(v string) *CancelAppopsResponse {
	s.ResultMsg = &v
	return s
}

type ScaleProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用服务实例唯一标识。
	AppServiceId *string `json:"app_service_id,omitempty" xml:"app_service_id,omitempty" require:"true"`
	// 集群容器目标数量。如果target_num>当前集群num，则扩容target_num-num个容器；如果target_num<当前集群num，则随机缩容target_num-num个容器。
	TargetNum *int64 `json:"target_num,omitempty" xml:"target_num,omitempty" require:"true"`
}

func (s ScaleProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *ScaleProdinstanceAppserviceRequest) SetAuthToken(v string) *ScaleProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleProdinstanceAppserviceRequest) SetProductInstanceId(v string) *ScaleProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleProdinstanceAppserviceRequest) SetAppServiceId(v string) *ScaleProdinstanceAppserviceRequest {
	s.AppServiceId = &v
	return s
}

func (s *ScaleProdinstanceAppserviceRequest) SetTargetNum(v int64) *ScaleProdinstanceAppserviceRequest {
	s.TargetNum = &v
	return s
}

type ScaleProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ScaleProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *ScaleProdinstanceAppserviceResponse) SetReqMsgId(v string) *ScaleProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleProdinstanceAppserviceResponse) SetResultCode(v string) *ScaleProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleProdinstanceAppserviceResponse) SetResultMsg(v string) *ScaleProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleProdinstanceAppserviceResponse) SetOpsPlanId(v string) *ScaleProdinstanceAppserviceResponse {
	s.OpsPlanId = &v
	return s
}

type ListEnvRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListEnvRequest) String() string {
	return tea.Prettify(s)
}

func (s ListEnvRequest) GoString() string {
	return s.String()
}

func (s *ListEnvRequest) SetAuthToken(v string) *ListEnvRequest {
	s.AuthToken = &v
	return s
}

func (s *ListEnvRequest) SetProductInstanceId(v string) *ListEnvRequest {
	s.ProductInstanceId = &v
	return s
}

type ListEnvResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 环境列表。
	Envs []*Env `json:"envs,omitempty" xml:"envs,omitempty" type:"Repeated"`
}

func (s ListEnvResponse) String() string {
	return tea.Prettify(s)
}

func (s ListEnvResponse) GoString() string {
	return s.String()
}

func (s *ListEnvResponse) SetReqMsgId(v string) *ListEnvResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListEnvResponse) SetResultCode(v string) *ListEnvResponse {
	s.ResultCode = &v
	return s
}

func (s *ListEnvResponse) SetResultMsg(v string) *ListEnvResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListEnvResponse) SetEnvs(v []*Env) *ListEnvResponse {
	s.Envs = v
	return s
}

type GetProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用服务实例id。
	AppServiceId *string `json:"app_service_id,omitempty" xml:"app_service_id,omitempty" require:"true"`
}

func (s GetProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *GetProdinstanceAppserviceRequest) SetAuthToken(v string) *GetProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetProdinstanceAppserviceRequest) SetProductInstanceId(v string) *GetProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetProdinstanceAppserviceRequest) SetAppServiceId(v string) *GetProdinstanceAppserviceRequest {
	s.AppServiceId = &v
	return s
}

type GetProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用名。
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 应用版本。
	AppVersion *string `json:"app_version,omitempty" xml:"app_version,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 容器列表。
	Containers []*Container `json:"containers,omitempty" xml:"containers,omitempty" type:"Repeated"`
	// 部署单元。
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty"`
	// 部署域。
	DeployZone *string `json:"deploy_zone,omitempty" xml:"deploy_zone,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 负载均衡列表。
	LoadBalancers []*LoadBalancer `json:"load_balancers,omitempty" xml:"load_balancers,omitempty" type:"Repeated"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 数据库列表。
	Schemas []*Schema `json:"schemas,omitempty" xml:"schemas,omitempty" type:"Repeated"`
	// app service id，该openapi 的入参
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s GetProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *GetProdinstanceAppserviceResponse) SetReqMsgId(v string) *GetProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetResultCode(v string) *GetProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetResultMsg(v string) *GetProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetAppName(v string) *GetProdinstanceAppserviceResponse {
	s.AppName = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetAppVersion(v string) *GetProdinstanceAppserviceResponse {
	s.AppVersion = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetCellId(v string) *GetProdinstanceAppserviceResponse {
	s.CellId = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetContainers(v []*Container) *GetProdinstanceAppserviceResponse {
	s.Containers = v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetDeployUnit(v string) *GetProdinstanceAppserviceResponse {
	s.DeployUnit = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetDeployZone(v string) *GetProdinstanceAppserviceResponse {
	s.DeployZone = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetEnvId(v string) *GetProdinstanceAppserviceResponse {
	s.EnvId = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetLoadBalancers(v []*LoadBalancer) *GetProdinstanceAppserviceResponse {
	s.LoadBalancers = v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetProductCode(v string) *GetProdinstanceAppserviceResponse {
	s.ProductCode = &v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetSchemas(v []*Schema) *GetProdinstanceAppserviceResponse {
	s.Schemas = v
	return s
}

func (s *GetProdinstanceAppserviceResponse) SetId(v string) *GetProdinstanceAppserviceResponse {
	s.Id = &v
	return s
}

type QueryProdinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 当前页码。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小。默认值为10，最大值100。
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s QueryProdinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProdinstanceRequest) GoString() string {
	return s.String()
}

func (s *QueryProdinstanceRequest) SetAuthToken(v string) *QueryProdinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProdinstanceRequest) SetProductInstanceId(v string) *QueryProdinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProdinstanceRequest) SetCellId(v string) *QueryProdinstanceRequest {
	s.CellId = &v
	return s
}

func (s *QueryProdinstanceRequest) SetEnvId(v string) *QueryProdinstanceRequest {
	s.EnvId = &v
	return s
}

func (s *QueryProdinstanceRequest) SetPageNum(v int64) *QueryProdinstanceRequest {
	s.PageNum = &v
	return s
}

func (s *QueryProdinstanceRequest) SetPageSize(v int64) *QueryProdinstanceRequest {
	s.PageSize = &v
	return s
}

func (s *QueryProdinstanceRequest) SetProductCode(v string) *QueryProdinstanceRequest {
	s.ProductCode = &v
	return s
}

type QueryProdinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小。
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 产品实例列表。
	ProductInstances []*ProductInstance `json:"product_instances,omitempty" xml:"product_instances,omitempty" type:"Repeated"`
	// 总数。
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryProdinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProdinstanceResponse) GoString() string {
	return s.String()
}

func (s *QueryProdinstanceResponse) SetReqMsgId(v string) *QueryProdinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProdinstanceResponse) SetResultCode(v string) *QueryProdinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProdinstanceResponse) SetResultMsg(v string) *QueryProdinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProdinstanceResponse) SetPageNum(v int64) *QueryProdinstanceResponse {
	s.PageNum = &v
	return s
}

func (s *QueryProdinstanceResponse) SetPageSize(v int64) *QueryProdinstanceResponse {
	s.PageSize = &v
	return s
}

func (s *QueryProdinstanceResponse) SetProductInstances(v []*ProductInstance) *QueryProdinstanceResponse {
	s.ProductInstances = v
	return s
}

func (s *QueryProdinstanceResponse) SetTotalCount(v int64) *QueryProdinstanceResponse {
	s.TotalCount = &v
	return s
}

type UninstallProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 操作人Id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s UninstallProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s UninstallProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *UninstallProdinstanceAppserviceRequest) SetAuthToken(v string) *UninstallProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *UninstallProdinstanceAppserviceRequest) SetProductInstanceId(v string) *UninstallProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UninstallProdinstanceAppserviceRequest) SetEnvId(v string) *UninstallProdinstanceAppserviceRequest {
	s.EnvId = &v
	return s
}

func (s *UninstallProdinstanceAppserviceRequest) SetProductCode(v string) *UninstallProdinstanceAppserviceRequest {
	s.ProductCode = &v
	return s
}

func (s *UninstallProdinstanceAppserviceRequest) SetSubmitterId(v string) *UninstallProdinstanceAppserviceRequest {
	s.SubmitterId = &v
	return s
}

func (s *UninstallProdinstanceAppserviceRequest) SetSubmitterName(v string) *UninstallProdinstanceAppserviceRequest {
	s.SubmitterName = &v
	return s
}

type UninstallProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s UninstallProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s UninstallProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *UninstallProdinstanceAppserviceResponse) SetReqMsgId(v string) *UninstallProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UninstallProdinstanceAppserviceResponse) SetResultCode(v string) *UninstallProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *UninstallProdinstanceAppserviceResponse) SetResultMsg(v string) *UninstallProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UninstallProdinstanceAppserviceResponse) SetOpsPlanId(v string) *UninstallProdinstanceAppserviceResponse {
	s.OpsPlanId = &v
	return s
}

type CreateProdinstanceDeployunitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 云游内产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 执行部署单元实例id
	UnitId *string `json:"unit_id,omitempty" xml:"unit_id,omitempty" require:"true"`
	// 部署单元名称
	UnitName *string `json:"unit_name,omitempty" xml:"unit_name,omitempty" require:"true"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 逻辑部署单元实例id
	LogicalInstanceId *string `json:"logical_instance_id,omitempty" xml:"logical_instance_id,omitempty" require:"true"`
	// 操作人id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s CreateProdinstanceDeployunitRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProdinstanceDeployunitRequest) GoString() string {
	return s.String()
}

func (s *CreateProdinstanceDeployunitRequest) SetAuthToken(v string) *CreateProdinstanceDeployunitRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetProductInstanceId(v string) *CreateProdinstanceDeployunitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetEnvId(v string) *CreateProdinstanceDeployunitRequest {
	s.EnvId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetProductCode(v string) *CreateProdinstanceDeployunitRequest {
	s.ProductCode = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetUnitId(v string) *CreateProdinstanceDeployunitRequest {
	s.UnitId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetUnitName(v string) *CreateProdinstanceDeployunitRequest {
	s.UnitName = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetCellId(v string) *CreateProdinstanceDeployunitRequest {
	s.CellId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetLogicalInstanceId(v string) *CreateProdinstanceDeployunitRequest {
	s.LogicalInstanceId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetSubmitterId(v string) *CreateProdinstanceDeployunitRequest {
	s.SubmitterId = &v
	return s
}

func (s *CreateProdinstanceDeployunitRequest) SetSubmitterName(v string) *CreateProdinstanceDeployunitRequest {
	s.SubmitterName = &v
	return s
}

type CreateProdinstanceDeployunitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单ID
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateProdinstanceDeployunitResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProdinstanceDeployunitResponse) GoString() string {
	return s.String()
}

func (s *CreateProdinstanceDeployunitResponse) SetReqMsgId(v string) *CreateProdinstanceDeployunitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProdinstanceDeployunitResponse) SetResultCode(v string) *CreateProdinstanceDeployunitResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProdinstanceDeployunitResponse) SetResultMsg(v string) *CreateProdinstanceDeployunitResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProdinstanceDeployunitResponse) SetOpsPlanId(v string) *CreateProdinstanceDeployunitResponse {
	s.OpsPlanId = &v
	return s
}

type QueryUnitinstanceCreationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单ID
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s QueryUnitinstanceCreationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUnitinstanceCreationRequest) GoString() string {
	return s.String()
}

func (s *QueryUnitinstanceCreationRequest) SetAuthToken(v string) *QueryUnitinstanceCreationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUnitinstanceCreationRequest) SetProductInstanceId(v string) *QueryUnitinstanceCreationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUnitinstanceCreationRequest) SetOpsPlanId(v string) *QueryUnitinstanceCreationRequest {
	s.OpsPlanId = &v
	return s
}

type QueryUnitinstanceCreationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryUnitinstanceCreationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUnitinstanceCreationResponse) GoString() string {
	return s.String()
}

func (s *QueryUnitinstanceCreationResponse) SetReqMsgId(v string) *QueryUnitinstanceCreationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUnitinstanceCreationResponse) SetResultCode(v string) *QueryUnitinstanceCreationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUnitinstanceCreationResponse) SetResultMsg(v string) *QueryUnitinstanceCreationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUnitinstanceCreationResponse) SetStatus(v string) *QueryUnitinstanceCreationResponse {
	s.Status = &v
	return s
}

type GetUnitDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 单元实例标识
	UnitInstanceIdentity *string `json:"unit_instance_identity,omitempty" xml:"unit_instance_identity,omitempty" require:"true"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
}

func (s GetUnitDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s GetUnitDetailRequest) GoString() string {
	return s.String()
}

func (s *GetUnitDetailRequest) SetAuthToken(v string) *GetUnitDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *GetUnitDetailRequest) SetProductInstanceId(v string) *GetUnitDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetUnitDetailRequest) SetEnvId(v string) *GetUnitDetailRequest {
	s.EnvId = &v
	return s
}

func (s *GetUnitDetailRequest) SetProductCode(v string) *GetUnitDetailRequest {
	s.ProductCode = &v
	return s
}

func (s *GetUnitDetailRequest) SetUnitInstanceIdentity(v string) *GetUnitDetailRequest {
	s.UnitInstanceIdentity = &v
	return s
}

func (s *GetUnitDetailRequest) SetCellId(v string) *GetUnitDetailRequest {
	s.CellId = &v
	return s
}

type GetUnitDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 单元内资源列表
	Resources []*UnitResource `json:"resources,omitempty" xml:"resources,omitempty" type:"Repeated"`
	// 单元状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetUnitDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s GetUnitDetailResponse) GoString() string {
	return s.String()
}

func (s *GetUnitDetailResponse) SetReqMsgId(v string) *GetUnitDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetUnitDetailResponse) SetResultCode(v string) *GetUnitDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *GetUnitDetailResponse) SetResultMsg(v string) *GetUnitDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetUnitDetailResponse) SetResources(v []*UnitResource) *GetUnitDetailResponse {
	s.Resources = v
	return s
}

func (s *GetUnitDetailResponse) SetStatus(v string) *GetUnitDetailResponse {
	s.Status = &v
	return s
}

type QueryProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 部署单元。
	DeployUnit *string `json:"deploy_unit,omitempty" xml:"deploy_unit,omitempty"`
	// 部署域。当前版本暂不支持。
	DeployZone *string `json:"deploy_zone,omitempty" xml:"deploy_zone,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 当前页码，默认为1。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认10，最大100。
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 产品分组。如果入参设置了产品码，则默认忽略产品分组。
	ProductGroup *string `json:"product_group,omitempty" xml:"product_group,omitempty"`
	// 产品码--应用名
	ProductApp *string `json:"product_app,omitempty" xml:"product_app,omitempty"`
	// 租户信息当前值为mock
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *QueryProdinstanceAppserviceRequest) SetAuthToken(v string) *QueryProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetProductInstanceId(v string) *QueryProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetAppName(v string) *QueryProdinstanceAppserviceRequest {
	s.AppName = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetCellId(v string) *QueryProdinstanceAppserviceRequest {
	s.CellId = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetDeployUnit(v string) *QueryProdinstanceAppserviceRequest {
	s.DeployUnit = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetDeployZone(v string) *QueryProdinstanceAppserviceRequest {
	s.DeployZone = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetEnvId(v string) *QueryProdinstanceAppserviceRequest {
	s.EnvId = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetPageNum(v int64) *QueryProdinstanceAppserviceRequest {
	s.PageNum = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetPageSize(v int64) *QueryProdinstanceAppserviceRequest {
	s.PageSize = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetProductCode(v string) *QueryProdinstanceAppserviceRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetProductGroup(v string) *QueryProdinstanceAppserviceRequest {
	s.ProductGroup = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetProductApp(v string) *QueryProdinstanceAppserviceRequest {
	s.ProductApp = &v
	return s
}

func (s *QueryProdinstanceAppserviceRequest) SetTenantId(v string) *QueryProdinstanceAppserviceRequest {
	s.TenantId = &v
	return s
}

type QueryProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用服务实例列表。
	AppServices []*AppService `json:"app_services,omitempty" xml:"app_services,omitempty" type:"Repeated"`
	// 当前页码。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小。
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 服务实例总数。
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *QueryProdinstanceAppserviceResponse) SetReqMsgId(v string) *QueryProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetResultCode(v string) *QueryProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetResultMsg(v string) *QueryProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetAppServices(v []*AppService) *QueryProdinstanceAppserviceResponse {
	s.AppServices = v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetPageNum(v int64) *QueryProdinstanceAppserviceResponse {
	s.PageNum = &v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetPageSize(v int64) *QueryProdinstanceAppserviceResponse {
	s.PageSize = &v
	return s
}

func (s *QueryProdinstanceAppserviceResponse) SetTotalCount(v int64) *QueryProdinstanceAppserviceResponse {
	s.TotalCount = &v
	return s
}

type GetProdinstanceDeployunitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 环境唯一标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 用户传入部署单元标识
	UnitId *string `json:"unit_id,omitempty" xml:"unit_id,omitempty"`
	// 单元实例ID
	UnitInstanceId *string `json:"unit_instance_id,omitempty" xml:"unit_instance_id,omitempty" require:"true"`
}

func (s GetProdinstanceDeployunitRequest) String() string {
	return tea.Prettify(s)
}

func (s GetProdinstanceDeployunitRequest) GoString() string {
	return s.String()
}

func (s *GetProdinstanceDeployunitRequest) SetAuthToken(v string) *GetProdinstanceDeployunitRequest {
	s.AuthToken = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetProductInstanceId(v string) *GetProdinstanceDeployunitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetCellId(v string) *GetProdinstanceDeployunitRequest {
	s.CellId = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetEnvId(v string) *GetProdinstanceDeployunitRequest {
	s.EnvId = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetProductCode(v string) *GetProdinstanceDeployunitRequest {
	s.ProductCode = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetUnitId(v string) *GetProdinstanceDeployunitRequest {
	s.UnitId = &v
	return s
}

func (s *GetProdinstanceDeployunitRequest) SetUnitInstanceId(v string) *GetProdinstanceDeployunitRequest {
	s.UnitInstanceId = &v
	return s
}

type GetProdinstanceDeployunitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// app实例列表
	AppServices []*AppServiceInfo `json:"app_services,omitempty" xml:"app_services,omitempty" type:"Repeated"`
}

func (s GetProdinstanceDeployunitResponse) String() string {
	return tea.Prettify(s)
}

func (s GetProdinstanceDeployunitResponse) GoString() string {
	return s.String()
}

func (s *GetProdinstanceDeployunitResponse) SetReqMsgId(v string) *GetProdinstanceDeployunitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetProdinstanceDeployunitResponse) SetResultCode(v string) *GetProdinstanceDeployunitResponse {
	s.ResultCode = &v
	return s
}

func (s *GetProdinstanceDeployunitResponse) SetResultMsg(v string) *GetProdinstanceDeployunitResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetProdinstanceDeployunitResponse) SetAppServices(v []*AppServiceInfo) *GetProdinstanceDeployunitResponse {
	s.AppServices = v
	return s
}

type ListProdinstanceDeployunitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码。
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
}

func (s ListProdinstanceDeployunitRequest) String() string {
	return tea.Prettify(s)
}

func (s ListProdinstanceDeployunitRequest) GoString() string {
	return s.String()
}

func (s *ListProdinstanceDeployunitRequest) SetAuthToken(v string) *ListProdinstanceDeployunitRequest {
	s.AuthToken = &v
	return s
}

func (s *ListProdinstanceDeployunitRequest) SetProductInstanceId(v string) *ListProdinstanceDeployunitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListProdinstanceDeployunitRequest) SetEnvId(v string) *ListProdinstanceDeployunitRequest {
	s.EnvId = &v
	return s
}

func (s *ListProdinstanceDeployunitRequest) SetProductCode(v string) *ListProdinstanceDeployunitRequest {
	s.ProductCode = &v
	return s
}

func (s *ListProdinstanceDeployunitRequest) SetCellId(v string) *ListProdinstanceDeployunitRequest {
	s.CellId = &v
	return s
}

type ListProdinstanceDeployunitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 部署单元列表。
	DeployUnits []*DeployUnit `json:"deploy_units,omitempty" xml:"deploy_units,omitempty" type:"Repeated"`
}

func (s ListProdinstanceDeployunitResponse) String() string {
	return tea.Prettify(s)
}

func (s ListProdinstanceDeployunitResponse) GoString() string {
	return s.String()
}

func (s *ListProdinstanceDeployunitResponse) SetReqMsgId(v string) *ListProdinstanceDeployunitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListProdinstanceDeployunitResponse) SetResultCode(v string) *ListProdinstanceDeployunitResponse {
	s.ResultCode = &v
	return s
}

func (s *ListProdinstanceDeployunitResponse) SetResultMsg(v string) *ListProdinstanceDeployunitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListProdinstanceDeployunitResponse) SetDeployUnits(v []*DeployUnit) *ListProdinstanceDeployunitResponse {
	s.DeployUnits = v
	return s
}

type ScaleoutProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用服务实例唯一标识。
	AppServiceId *string `json:"app_service_id,omitempty" xml:"app_service_id,omitempty" require:"true"`
	// 集群容器目标数量。target_num需要大于当前集群容器数量，扩容（target_num-当前集群容器数量）个容器。
	TargetNum *int64 `json:"target_num,omitempty" xml:"target_num,omitempty" require:"true"`
	// 操作人
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
	// 容器分组策略，默认SYSTEM_RECOMMENDATION
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty"`
}

func (s ScaleoutProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleoutProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetAuthToken(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetProductInstanceId(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetAppServiceId(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.AppServiceId = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetTargetNum(v int64) *ScaleoutProdinstanceAppserviceRequest {
	s.TargetNum = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetSubmitterId(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.SubmitterId = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetSubmitterName(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.SubmitterName = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceRequest) SetGroupStrategy(v string) *ScaleoutProdinstanceAppserviceRequest {
	s.GroupStrategy = &v
	return s
}

type ScaleoutProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ScaleoutProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleoutProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *ScaleoutProdinstanceAppserviceResponse) SetReqMsgId(v string) *ScaleoutProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceResponse) SetResultCode(v string) *ScaleoutProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceResponse) SetResultMsg(v string) *ScaleoutProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleoutProdinstanceAppserviceResponse) SetOpsPlanId(v string) *ScaleoutProdinstanceAppserviceResponse {
	s.OpsPlanId = &v
	return s
}

type QueryAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 条件前缀, 一般传入环境ID
	ConditionPrefix *string `json:"condition_prefix,omitempty" xml:"condition_prefix,omitempty"`
	// 授权状态
	Statuses []*string `json:"statuses,omitempty" xml:"statuses,omitempty" require:"true" type:"Repeated"`
}

func (s QueryAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthRequest) GoString() string {
	return s.String()
}

func (s *QueryAuthRequest) SetAuthToken(v string) *QueryAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAuthRequest) SetProductInstanceId(v string) *QueryAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAuthRequest) SetConditionPrefix(v string) *QueryAuthRequest {
	s.ConditionPrefix = &v
	return s
}

func (s *QueryAuthRequest) SetStatuses(v []*string) *QueryAuthRequest {
	s.Statuses = v
	return s
}

type QueryAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户授权
	Data []*UserAuth `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAuthResponse) GoString() string {
	return s.String()
}

func (s *QueryAuthResponse) SetReqMsgId(v string) *QueryAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAuthResponse) SetResultCode(v string) *QueryAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAuthResponse) SetResultMsg(v string) *QueryAuthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAuthResponse) SetData(v []*UserAuth) *QueryAuthResponse {
	s.Data = v
	return s
}

type ImportAuthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权的条件
	Condition *string `json:"condition,omitempty" xml:"condition,omitempty" require:"true"`
	// 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
	ConditionKey *string `json:"condition_key,omitempty" xml:"condition_key,omitempty" require:"true"`
	// 是否被删除授权
	Deleted *bool `json:"deleted,omitempty" xml:"deleted,omitempty" require:"true"`
	// 授权的MD5
	Md5 *string `json:"md5,omitempty" xml:"md5,omitempty" require:"true"`
	// 昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 是否为负责人
	Primary *bool `json:"primary,omitempty" xml:"primary,omitempty" require:"true"`
	// 用户真名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 角色
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 用户的域账号
	SourceId *string `json:"source_id,omitempty" xml:"source_id,omitempty" require:"true"`
	// 工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty"`
}

func (s ImportAuthRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAuthRequest) GoString() string {
	return s.String()
}

func (s *ImportAuthRequest) SetAuthToken(v string) *ImportAuthRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAuthRequest) SetProductInstanceId(v string) *ImportAuthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAuthRequest) SetCondition(v string) *ImportAuthRequest {
	s.Condition = &v
	return s
}

func (s *ImportAuthRequest) SetConditionKey(v string) *ImportAuthRequest {
	s.ConditionKey = &v
	return s
}

func (s *ImportAuthRequest) SetDeleted(v bool) *ImportAuthRequest {
	s.Deleted = &v
	return s
}

func (s *ImportAuthRequest) SetMd5(v string) *ImportAuthRequest {
	s.Md5 = &v
	return s
}

func (s *ImportAuthRequest) SetNickName(v string) *ImportAuthRequest {
	s.NickName = &v
	return s
}

func (s *ImportAuthRequest) SetPrimary(v bool) *ImportAuthRequest {
	s.Primary = &v
	return s
}

func (s *ImportAuthRequest) SetRealName(v string) *ImportAuthRequest {
	s.RealName = &v
	return s
}

func (s *ImportAuthRequest) SetRole(v string) *ImportAuthRequest {
	s.Role = &v
	return s
}

func (s *ImportAuthRequest) SetSourceId(v string) *ImportAuthRequest {
	s.SourceId = &v
	return s
}

func (s *ImportAuthRequest) SetWorkNo(v string) *ImportAuthRequest {
	s.WorkNo = &v
	return s
}

type ImportAuthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportAuthResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAuthResponse) GoString() string {
	return s.String()
}

func (s *ImportAuthResponse) SetReqMsgId(v string) *ImportAuthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAuthResponse) SetResultCode(v string) *ImportAuthResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAuthResponse) SetResultMsg(v string) *ImportAuthResponse {
	s.ResultMsg = &v
	return s
}

type GetSystemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetSystemRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSystemRequest) GoString() string {
	return s.String()
}

func (s *GetSystemRequest) SetAuthToken(v string) *GetSystemRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSystemRequest) SetProductInstanceId(v string) *GetSystemRequest {
	s.ProductInstanceId = &v
	return s
}

type GetSystemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *System `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetSystemResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSystemResponse) GoString() string {
	return s.String()
}

func (s *GetSystemResponse) SetReqMsgId(v string) *GetSystemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSystemResponse) SetResultCode(v string) *GetSystemResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSystemResponse) SetResultMsg(v string) *GetSystemResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSystemResponse) SetData(v *System) *GetSystemResponse {
	s.Data = v
	return s
}

type ScaleinProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用服务实例唯一标识。
	AppServiceId *string `json:"app_service_id,omitempty" xml:"app_service_id,omitempty" require:"true"`
	// 执行运维操作的目标容器列表。
	ContainerIds []*string `json:"container_ids,omitempty" xml:"container_ids,omitempty" require:"true" type:"Repeated"`
	// 操作人id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s ScaleinProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleinProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *ScaleinProdinstanceAppserviceRequest) SetAuthToken(v string) *ScaleinProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceRequest) SetProductInstanceId(v string) *ScaleinProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceRequest) SetAppServiceId(v string) *ScaleinProdinstanceAppserviceRequest {
	s.AppServiceId = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceRequest) SetContainerIds(v []*string) *ScaleinProdinstanceAppserviceRequest {
	s.ContainerIds = v
	return s
}

func (s *ScaleinProdinstanceAppserviceRequest) SetSubmitterId(v string) *ScaleinProdinstanceAppserviceRequest {
	s.SubmitterId = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceRequest) SetSubmitterName(v string) *ScaleinProdinstanceAppserviceRequest {
	s.SubmitterName = &v
	return s
}

type ScaleinProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id。
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ScaleinProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleinProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *ScaleinProdinstanceAppserviceResponse) SetReqMsgId(v string) *ScaleinProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceResponse) SetResultCode(v string) *ScaleinProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceResponse) SetResultMsg(v string) *ScaleinProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleinProdinstanceAppserviceResponse) SetOpsPlanId(v string) *ScaleinProdinstanceAppserviceResponse {
	s.OpsPlanId = &v
	return s
}

type AllProdinstanceAppserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
	// 环境唯一标识。
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
}

func (s AllProdinstanceAppserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s AllProdinstanceAppserviceRequest) GoString() string {
	return s.String()
}

func (s *AllProdinstanceAppserviceRequest) SetAuthToken(v string) *AllProdinstanceAppserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *AllProdinstanceAppserviceRequest) SetProductInstanceId(v string) *AllProdinstanceAppserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllProdinstanceAppserviceRequest) SetCellId(v string) *AllProdinstanceAppserviceRequest {
	s.CellId = &v
	return s
}

func (s *AllProdinstanceAppserviceRequest) SetEnvId(v string) *AllProdinstanceAppserviceRequest {
	s.EnvId = &v
	return s
}

type AllProdinstanceAppserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用服务实例详情列表。
	AppServiceInfos []*AppServiceInfo `json:"app_service_infos,omitempty" xml:"app_service_infos,omitempty" type:"Repeated"`
}

func (s AllProdinstanceAppserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s AllProdinstanceAppserviceResponse) GoString() string {
	return s.String()
}

func (s *AllProdinstanceAppserviceResponse) SetReqMsgId(v string) *AllProdinstanceAppserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllProdinstanceAppserviceResponse) SetResultCode(v string) *AllProdinstanceAppserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *AllProdinstanceAppserviceResponse) SetResultMsg(v string) *AllProdinstanceAppserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllProdinstanceAppserviceResponse) SetAppServiceInfos(v []*AppServiceInfo) *AllProdinstanceAppserviceResponse {
	s.AppServiceInfos = v
	return s
}

type CreateAutotestopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 测试单名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 需要测试的产品
	Products []*AutoTestProduct `json:"products,omitempty" xml:"products,omitempty" require:"true" type:"Repeated"`
	// 单元的id
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
	//
	//
	AutoTestType *string `json:"auto_test_type,omitempty" xml:"auto_test_type,omitempty"`
}

func (s CreateAutotestopsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAutotestopsRequest) GoString() string {
	return s.String()
}

func (s *CreateAutotestopsRequest) SetAuthToken(v string) *CreateAutotestopsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAutotestopsRequest) SetProductInstanceId(v string) *CreateAutotestopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAutotestopsRequest) SetEnvId(v string) *CreateAutotestopsRequest {
	s.EnvId = &v
	return s
}

func (s *CreateAutotestopsRequest) SetName(v string) *CreateAutotestopsRequest {
	s.Name = &v
	return s
}

func (s *CreateAutotestopsRequest) SetProducts(v []*AutoTestProduct) *CreateAutotestopsRequest {
	s.Products = v
	return s
}

func (s *CreateAutotestopsRequest) SetCellId(v string) *CreateAutotestopsRequest {
	s.CellId = &v
	return s
}

func (s *CreateAutotestopsRequest) SetAutoTestType(v string) *CreateAutotestopsRequest {
	s.AutoTestType = &v
	return s
}

type CreateAutotestopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试单的id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateAutotestopsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAutotestopsResponse) GoString() string {
	return s.String()
}

func (s *CreateAutotestopsResponse) SetReqMsgId(v string) *CreateAutotestopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAutotestopsResponse) SetResultCode(v string) *CreateAutotestopsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAutotestopsResponse) SetResultMsg(v string) *CreateAutotestopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAutotestopsResponse) SetOpsPlanId(v string) *CreateAutotestopsResponse {
	s.OpsPlanId = &v
	return s
}

type GetAutotestopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s GetAutotestopsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAutotestopsRequest) GoString() string {
	return s.String()
}

func (s *GetAutotestopsRequest) SetAuthToken(v string) *GetAutotestopsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAutotestopsRequest) SetProductInstanceId(v string) *GetAutotestopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAutotestopsRequest) SetOpsPlanId(v string) *GetAutotestopsRequest {
	s.OpsPlanId = &v
	return s
}

type GetAutotestopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 所属环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 测试单名字
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 测试单的id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
	// 产品测试结果
	ProdTestResult []*AutoTestProdResult `json:"prod_test_result,omitempty" xml:"prod_test_result,omitempty" type:"Repeated"`
	// 当前状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 测试单创建时间
	UtcCreate *string `json:"utc_create,omitempty" xml:"utc_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 测试单结束时间
	UtcEnd *string `json:"utc_end,omitempty" xml:"utc_end,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 测试单修改时间
	UtcModified *string `json:"utc_modified,omitempty" xml:"utc_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 测试单开始时间
	UtcStart *string `json:"utc_start,omitempty" xml:"utc_start,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s GetAutotestopsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAutotestopsResponse) GoString() string {
	return s.String()
}

func (s *GetAutotestopsResponse) SetReqMsgId(v string) *GetAutotestopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAutotestopsResponse) SetResultCode(v string) *GetAutotestopsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAutotestopsResponse) SetResultMsg(v string) *GetAutotestopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAutotestopsResponse) SetEnvId(v string) *GetAutotestopsResponse {
	s.EnvId = &v
	return s
}

func (s *GetAutotestopsResponse) SetName(v string) *GetAutotestopsResponse {
	s.Name = &v
	return s
}

func (s *GetAutotestopsResponse) SetOpsPlanId(v string) *GetAutotestopsResponse {
	s.OpsPlanId = &v
	return s
}

func (s *GetAutotestopsResponse) SetProdTestResult(v []*AutoTestProdResult) *GetAutotestopsResponse {
	s.ProdTestResult = v
	return s
}

func (s *GetAutotestopsResponse) SetStatus(v string) *GetAutotestopsResponse {
	s.Status = &v
	return s
}

func (s *GetAutotestopsResponse) SetUtcCreate(v string) *GetAutotestopsResponse {
	s.UtcCreate = &v
	return s
}

func (s *GetAutotestopsResponse) SetUtcEnd(v string) *GetAutotestopsResponse {
	s.UtcEnd = &v
	return s
}

func (s *GetAutotestopsResponse) SetUtcModified(v string) *GetAutotestopsResponse {
	s.UtcModified = &v
	return s
}

func (s *GetAutotestopsResponse) SetUtcStart(v string) *GetAutotestopsResponse {
	s.UtcStart = &v
	return s
}

type ExportBaselineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 单元id
	// 当cell_id为null时，回流资源池等公共信息。
	// 当cell_id不为null时，回流单元内的prod instance
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty"`
}

func (s ExportBaselineRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportBaselineRequest) GoString() string {
	return s.String()
}

func (s *ExportBaselineRequest) SetAuthToken(v string) *ExportBaselineRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportBaselineRequest) SetProductInstanceId(v string) *ExportBaselineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportBaselineRequest) SetEnvId(v string) *ExportBaselineRequest {
	s.EnvId = &v
	return s
}

func (s *ExportBaselineRequest) SetCellId(v string) *ExportBaselineRequest {
	s.CellId = &v
	return s
}

type ExportBaselineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回流数据箱
	Datas []*BoxData `json:"datas,omitempty" xml:"datas,omitempty" type:"Repeated"`
	// 基线导出固定为BACK_FLOW
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 回流数据版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s ExportBaselineResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportBaselineResponse) GoString() string {
	return s.String()
}

func (s *ExportBaselineResponse) SetReqMsgId(v string) *ExportBaselineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportBaselineResponse) SetResultCode(v string) *ExportBaselineResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportBaselineResponse) SetResultMsg(v string) *ExportBaselineResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportBaselineResponse) SetDatas(v []*BoxData) *ExportBaselineResponse {
	s.Datas = v
	return s
}

func (s *ExportBaselineResponse) SetType(v string) *ExportBaselineResponse {
	s.Type = &v
	return s
}

func (s *ExportBaselineResponse) SetVersion(v string) *ExportBaselineResponse {
	s.Version = &v
	return s
}

type CreateAppdeployRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用码
	Apps []*string `json:"apps,omitempty" xml:"apps,omitempty" require:"true" type:"Repeated"`
	// 将要发布的单元id
	CellIds []*string `json:"cell_ids,omitempty" xml:"cell_ids,omitempty" require:"true" type:"Repeated"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
	// 是否强制重发
	Force *bool `json:"force,omitempty" xml:"force,omitempty" require:"true"`
	// 是否需要手动的确认
	NeedBeta *bool `json:"need_beta,omitempty" xml:"need_beta,omitempty"`
	// TWO_GROUP分两组ALL_ONE共分一组无灰生产禁用EACH_ONE每台一组SYSTEM_RECOMMENDATION系统推荐
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty"`
	// 操作人ID
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
	// 是否由云游自动确认资源规划，默认false；
	// 云游自动确认规划可能不符合预期，请谨慎使用
	AutoConfirmPlan *bool `json:"auto_confirm_plan,omitempty" xml:"auto_confirm_plan,omitempty"`
}

func (s CreateAppdeployRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppdeployRequest) GoString() string {
	return s.String()
}

func (s *CreateAppdeployRequest) SetAuthToken(v string) *CreateAppdeployRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppdeployRequest) SetProductInstanceId(v string) *CreateAppdeployRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppdeployRequest) SetApps(v []*string) *CreateAppdeployRequest {
	s.Apps = v
	return s
}

func (s *CreateAppdeployRequest) SetCellIds(v []*string) *CreateAppdeployRequest {
	s.CellIds = v
	return s
}

func (s *CreateAppdeployRequest) SetProdCode(v string) *CreateAppdeployRequest {
	s.ProdCode = &v
	return s
}

func (s *CreateAppdeployRequest) SetSolutionId(v string) *CreateAppdeployRequest {
	s.SolutionId = &v
	return s
}

func (s *CreateAppdeployRequest) SetForce(v bool) *CreateAppdeployRequest {
	s.Force = &v
	return s
}

func (s *CreateAppdeployRequest) SetNeedBeta(v bool) *CreateAppdeployRequest {
	s.NeedBeta = &v
	return s
}

func (s *CreateAppdeployRequest) SetGroupStrategy(v string) *CreateAppdeployRequest {
	s.GroupStrategy = &v
	return s
}

func (s *CreateAppdeployRequest) SetSubmitterId(v string) *CreateAppdeployRequest {
	s.SubmitterId = &v
	return s
}

func (s *CreateAppdeployRequest) SetSubmitterName(v string) *CreateAppdeployRequest {
	s.SubmitterName = &v
	return s
}

func (s *CreateAppdeployRequest) SetAutoConfirmPlan(v bool) *CreateAppdeployRequest {
	s.AutoConfirmPlan = &v
	return s
}

type CreateAppdeployResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateAppdeployResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppdeployResponse) GoString() string {
	return s.String()
}

func (s *CreateAppdeployResponse) SetReqMsgId(v string) *CreateAppdeployResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppdeployResponse) SetResultCode(v string) *CreateAppdeployResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppdeployResponse) SetResultMsg(v string) *CreateAppdeployResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAppdeployResponse) SetOpsPlanId(v string) *CreateAppdeployResponse {
	s.OpsPlanId = &v
	return s
}

type QuerySolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 当前页码，默认为1。
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认10，最大100。
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QuerySolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *QuerySolutioninstanceRequest) SetAuthToken(v string) *QuerySolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySolutioninstanceRequest) SetProductInstanceId(v string) *QuerySolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySolutioninstanceRequest) SetEnvId(v string) *QuerySolutioninstanceRequest {
	s.EnvId = &v
	return s
}

func (s *QuerySolutioninstanceRequest) SetPageNum(v int64) *QuerySolutioninstanceRequest {
	s.PageNum = &v
	return s
}

func (s *QuerySolutioninstanceRequest) SetPageSize(v int64) *QuerySolutioninstanceRequest {
	s.PageSize = &v
	return s
}

type QuerySolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 解决方案
	SolutionInstances []*SolutionInstance `json:"solution_instances,omitempty" xml:"solution_instances,omitempty" type:"Repeated"`
	// 当前页码。
	//
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小。
	//
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 服务实例总数。
	//
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QuerySolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *QuerySolutioninstanceResponse) SetReqMsgId(v string) *QuerySolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySolutioninstanceResponse) SetResultCode(v string) *QuerySolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySolutioninstanceResponse) SetResultMsg(v string) *QuerySolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySolutioninstanceResponse) SetSolutionInstances(v []*SolutionInstance) *QuerySolutioninstanceResponse {
	s.SolutionInstances = v
	return s
}

func (s *QuerySolutioninstanceResponse) SetPageNum(v int64) *QuerySolutioninstanceResponse {
	s.PageNum = &v
	return s
}

func (s *QuerySolutioninstanceResponse) SetPageSize(v int64) *QuerySolutioninstanceResponse {
	s.PageSize = &v
	return s
}

func (s *QuerySolutioninstanceResponse) SetTotalCount(v int64) *QuerySolutioninstanceResponse {
	s.TotalCount = &v
	return s
}

type ImportSolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案序列化后的结果
	BoxData *string `json:"box_data,omitempty" xml:"box_data,omitempty" require:"true"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 操作人ID
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
	// 操作人名称
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s ImportSolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportSolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *ImportSolutioninstanceRequest) SetAuthToken(v string) *ImportSolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetProductInstanceId(v string) *ImportSolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetBoxData(v string) *ImportSolutioninstanceRequest {
	s.BoxData = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetEnvId(v string) *ImportSolutioninstanceRequest {
	s.EnvId = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetSubmitterId(v string) *ImportSolutioninstanceRequest {
	s.SubmitterId = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetSubmitterName(v string) *ImportSolutioninstanceRequest {
	s.SubmitterName = &v
	return s
}

type ImportSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ImportSolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportSolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *ImportSolutioninstanceResponse) SetReqMsgId(v string) *ImportSolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportSolutioninstanceResponse) SetResultCode(v string) *ImportSolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportSolutioninstanceResponse) SetResultMsg(v string) *ImportSolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportSolutioninstanceResponse) SetOpsPlanId(v string) *ImportSolutioninstanceResponse {
	s.OpsPlanId = &v
	return s
}

type CheckSolutioninstanceImportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 解决方案文件序列化后的结果
	BoxData *string `json:"box_data,omitempty" xml:"box_data,omitempty" require:"true"`
}

func (s CheckSolutioninstanceImportRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSolutioninstanceImportRequest) GoString() string {
	return s.String()
}

func (s *CheckSolutioninstanceImportRequest) SetAuthToken(v string) *CheckSolutioninstanceImportRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSolutioninstanceImportRequest) SetProductInstanceId(v string) *CheckSolutioninstanceImportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSolutioninstanceImportRequest) SetEnvId(v string) *CheckSolutioninstanceImportRequest {
	s.EnvId = &v
	return s
}

func (s *CheckSolutioninstanceImportRequest) SetBoxData(v string) *CheckSolutioninstanceImportRequest {
	s.BoxData = &v
	return s
}

type CheckSolutioninstanceImportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否可以导入此解决方案
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty"`
}

func (s CheckSolutioninstanceImportResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSolutioninstanceImportResponse) GoString() string {
	return s.String()
}

func (s *CheckSolutioninstanceImportResponse) SetReqMsgId(v string) *CheckSolutioninstanceImportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSolutioninstanceImportResponse) SetResultCode(v string) *CheckSolutioninstanceImportResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSolutioninstanceImportResponse) SetResultMsg(v string) *CheckSolutioninstanceImportResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSolutioninstanceImportResponse) SetEnabled(v bool) *CheckSolutioninstanceImportResponse {
	s.Enabled = &v
	return s
}

type DescribeSolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s DescribeSolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeSolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *DescribeSolutioninstanceRequest) SetAuthToken(v string) *DescribeSolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeSolutioninstanceRequest) SetProductInstanceId(v string) *DescribeSolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DescribeSolutioninstanceRequest) SetSolutionId(v string) *DescribeSolutioninstanceRequest {
	s.SolutionId = &v
	return s
}

type DescribeSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支持的api列表
	SupportedActions []*OpenAPI `json:"supported_actions,omitempty" xml:"supported_actions,omitempty" type:"Repeated"`
}

func (s DescribeSolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeSolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *DescribeSolutioninstanceResponse) SetReqMsgId(v string) *DescribeSolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeSolutioninstanceResponse) SetResultCode(v string) *DescribeSolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeSolutioninstanceResponse) SetResultMsg(v string) *DescribeSolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeSolutioninstanceResponse) SetSupportedActions(v []*OpenAPI) *DescribeSolutioninstanceResponse {
	s.SupportedActions = v
	return s
}

type DeprecateSolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s DeprecateSolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeprecateSolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *DeprecateSolutioninstanceRequest) SetAuthToken(v string) *DeprecateSolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeprecateSolutioninstanceRequest) SetProductInstanceId(v string) *DeprecateSolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeprecateSolutioninstanceRequest) SetSolutionId(v string) *DeprecateSolutioninstanceRequest {
	s.SolutionId = &v
	return s
}

type DeprecateSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeprecateSolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeprecateSolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *DeprecateSolutioninstanceResponse) SetReqMsgId(v string) *DeprecateSolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeprecateSolutioninstanceResponse) SetResultCode(v string) *DeprecateSolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeprecateSolutioninstanceResponse) SetResultMsg(v string) *DeprecateSolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

type FinishSolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s FinishSolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishSolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *FinishSolutioninstanceRequest) SetAuthToken(v string) *FinishSolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishSolutioninstanceRequest) SetProductInstanceId(v string) *FinishSolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishSolutioninstanceRequest) SetSolutionId(v string) *FinishSolutioninstanceRequest {
	s.SolutionId = &v
	return s
}

type FinishSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishSolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishSolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *FinishSolutioninstanceResponse) SetReqMsgId(v string) *FinishSolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishSolutioninstanceResponse) SetResultCode(v string) *FinishSolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishSolutioninstanceResponse) SetResultMsg(v string) *FinishSolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

type ReopenSolutioninstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s ReopenSolutioninstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ReopenSolutioninstanceRequest) GoString() string {
	return s.String()
}

func (s *ReopenSolutioninstanceRequest) SetAuthToken(v string) *ReopenSolutioninstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ReopenSolutioninstanceRequest) SetProductInstanceId(v string) *ReopenSolutioninstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReopenSolutioninstanceRequest) SetSolutionId(v string) *ReopenSolutioninstanceRequest {
	s.SolutionId = &v
	return s
}

type ReopenSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReopenSolutioninstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ReopenSolutioninstanceResponse) GoString() string {
	return s.String()
}

func (s *ReopenSolutioninstanceResponse) SetReqMsgId(v string) *ReopenSolutioninstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReopenSolutioninstanceResponse) SetResultCode(v string) *ReopenSolutioninstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ReopenSolutioninstanceResponse) SetResultMsg(v string) *ReopenSolutioninstanceResponse {
	s.ResultMsg = &v
	return s
}

type ImportEnvMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
	BoxData *string `json:"box_data,omitempty" xml:"box_data,omitempty" require:"true"`
}

func (s ImportEnvMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportEnvMetaRequest) GoString() string {
	return s.String()
}

func (s *ImportEnvMetaRequest) SetAuthToken(v string) *ImportEnvMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportEnvMetaRequest) SetProductInstanceId(v string) *ImportEnvMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportEnvMetaRequest) SetBoxData(v string) *ImportEnvMetaRequest {
	s.BoxData = &v
	return s
}

type ImportEnvMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportEnvMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportEnvMetaResponse) GoString() string {
	return s.String()
}

func (s *ImportEnvMetaResponse) SetReqMsgId(v string) *ImportEnvMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportEnvMetaResponse) SetResultCode(v string) *ImportEnvMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportEnvMetaResponse) SetResultMsg(v string) *ImportEnvMetaResponse {
	s.ResultMsg = &v
	return s
}

type ImportProdMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
	BoxData *string `json:"box_data,omitempty" xml:"box_data,omitempty" require:"true"`
}

func (s ImportProdMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportProdMetaRequest) GoString() string {
	return s.String()
}

func (s *ImportProdMetaRequest) SetAuthToken(v string) *ImportProdMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportProdMetaRequest) SetProductInstanceId(v string) *ImportProdMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportProdMetaRequest) SetBoxData(v string) *ImportProdMetaRequest {
	s.BoxData = &v
	return s
}

type ImportProdMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportProdMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportProdMetaResponse) GoString() string {
	return s.String()
}

func (s *ImportProdMetaResponse) SetReqMsgId(v string) *ImportProdMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportProdMetaResponse) SetResultCode(v string) *ImportProdMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportProdMetaResponse) SetResultMsg(v string) *ImportProdMetaResponse {
	s.ResultMsg = &v
	return s
}

type UninstallProdinstanceDeployunitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 单元ID
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 环境唯一标识
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 部署单元实例标识
	UnitInstanceId *string `json:"unit_instance_id,omitempty" xml:"unit_instance_id,omitempty" require:"true"`
	// 操作人ID
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s UninstallProdinstanceDeployunitRequest) String() string {
	return tea.Prettify(s)
}

func (s UninstallProdinstanceDeployunitRequest) GoString() string {
	return s.String()
}

func (s *UninstallProdinstanceDeployunitRequest) SetAuthToken(v string) *UninstallProdinstanceDeployunitRequest {
	s.AuthToken = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetProductInstanceId(v string) *UninstallProdinstanceDeployunitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetCellId(v string) *UninstallProdinstanceDeployunitRequest {
	s.CellId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetEnvId(v string) *UninstallProdinstanceDeployunitRequest {
	s.EnvId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetProductCode(v string) *UninstallProdinstanceDeployunitRequest {
	s.ProductCode = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetUnitInstanceId(v string) *UninstallProdinstanceDeployunitRequest {
	s.UnitInstanceId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetSubmitterId(v string) *UninstallProdinstanceDeployunitRequest {
	s.SubmitterId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitRequest) SetSubmitterName(v string) *UninstallProdinstanceDeployunitRequest {
	s.SubmitterName = &v
	return s
}

type UninstallProdinstanceDeployunitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单ID
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s UninstallProdinstanceDeployunitResponse) String() string {
	return tea.Prettify(s)
}

func (s UninstallProdinstanceDeployunitResponse) GoString() string {
	return s.String()
}

func (s *UninstallProdinstanceDeployunitResponse) SetReqMsgId(v string) *UninstallProdinstanceDeployunitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UninstallProdinstanceDeployunitResponse) SetResultCode(v string) *UninstallProdinstanceDeployunitResponse {
	s.ResultCode = &v
	return s
}

func (s *UninstallProdinstanceDeployunitResponse) SetResultMsg(v string) *UninstallProdinstanceDeployunitResponse {
	s.ResultMsg = &v
	return s
}

func (s *UninstallProdinstanceDeployunitResponse) SetOpsPlanId(v string) *UninstallProdinstanceDeployunitResponse {
	s.OpsPlanId = &v
	return s
}

type QueryClusterPodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s QueryClusterPodsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterPodsRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterPodsRequest) SetAuthToken(v string) *QueryClusterPodsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterPodsRequest) SetProductInstanceId(v string) *QueryClusterPodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryClusterPodsRequest) SetEnvId(v string) *QueryClusterPodsRequest {
	s.EnvId = &v
	return s
}

type QueryClusterPodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 集群内部详情
	ClusterInfo *ClusterInfo `json:"cluster_info,omitempty" xml:"cluster_info,omitempty"`
}

func (s QueryClusterPodsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterPodsResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterPodsResponse) SetReqMsgId(v string) *QueryClusterPodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterPodsResponse) SetResultCode(v string) *QueryClusterPodsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterPodsResponse) SetResultMsg(v string) *QueryClusterPodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterPodsResponse) SetClusterInfo(v *ClusterInfo) *QueryClusterPodsResponse {
	s.ClusterInfo = v
	return s
}

type QueryClusterKubeconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境变量
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s QueryClusterKubeconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterKubeconfigRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterKubeconfigRequest) SetAuthToken(v string) *QueryClusterKubeconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterKubeconfigRequest) SetProductInstanceId(v string) *QueryClusterKubeconfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryClusterKubeconfigRequest) SetEnvId(v string) *QueryClusterKubeconfigRequest {
	s.EnvId = &v
	return s
}

type QueryClusterKubeconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// kube_config
	KubeConfig *string `json:"kube_config,omitempty" xml:"kube_config,omitempty"`
}

func (s QueryClusterKubeconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterKubeconfigResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterKubeconfigResponse) SetReqMsgId(v string) *QueryClusterKubeconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterKubeconfigResponse) SetResultCode(v string) *QueryClusterKubeconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterKubeconfigResponse) SetResultMsg(v string) *QueryClusterKubeconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterKubeconfigResponse) SetKubeConfig(v string) *QueryClusterKubeconfigResponse {
	s.KubeConfig = &v
	return s
}

type EnableDynamicslbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// envid
	Envid *string `json:"envid,omitempty" xml:"envid,omitempty" require:"true"`
	// 部署单元id
	Unitinstanceid *string `json:"unitinstanceid,omitempty" xml:"unitinstanceid,omitempty" require:"true"`
	// prodCode
	Prodcode *string `json:"prodcode,omitempty" xml:"prodcode,omitempty" require:"true"`
	// appname
	Appname *string `json:"appname,omitempty" xml:"appname,omitempty" require:"true"`
	// protocol
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty" require:"true"`
	// 端口号
	Port *int64 `json:"port,omitempty" xml:"port,omitempty" require:"true"`
	// 目标端口号
	Targetport *int64 `json:"targetport,omitempty" xml:"targetport,omitempty" require:"true"`
	// 区间[-1 , 5120]
	Bandwidth *int64 `json:"bandwidth,omitempty" xml:"bandwidth,omitempty" require:"true"`
	// SLB名称
	Loadbalancername *string `json:"loadbalancername,omitempty" xml:"loadbalancername,omitempty" require:"true"`
}

func (s EnableDynamicslbRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableDynamicslbRequest) GoString() string {
	return s.String()
}

func (s *EnableDynamicslbRequest) SetAuthToken(v string) *EnableDynamicslbRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableDynamicslbRequest) SetProductInstanceId(v string) *EnableDynamicslbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EnableDynamicslbRequest) SetEnvid(v string) *EnableDynamicslbRequest {
	s.Envid = &v
	return s
}

func (s *EnableDynamicslbRequest) SetUnitinstanceid(v string) *EnableDynamicslbRequest {
	s.Unitinstanceid = &v
	return s
}

func (s *EnableDynamicslbRequest) SetProdcode(v string) *EnableDynamicslbRequest {
	s.Prodcode = &v
	return s
}

func (s *EnableDynamicslbRequest) SetAppname(v string) *EnableDynamicslbRequest {
	s.Appname = &v
	return s
}

func (s *EnableDynamicslbRequest) SetProtocol(v string) *EnableDynamicslbRequest {
	s.Protocol = &v
	return s
}

func (s *EnableDynamicslbRequest) SetPort(v int64) *EnableDynamicslbRequest {
	s.Port = &v
	return s
}

func (s *EnableDynamicslbRequest) SetTargetport(v int64) *EnableDynamicslbRequest {
	s.Targetport = &v
	return s
}

func (s *EnableDynamicslbRequest) SetBandwidth(v int64) *EnableDynamicslbRequest {
	s.Bandwidth = &v
	return s
}

func (s *EnableDynamicslbRequest) SetLoadbalancername(v string) *EnableDynamicslbRequest {
	s.Loadbalancername = &v
	return s
}

type EnableDynamicslbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// slb创建结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 生成的slb公网地址
	Publicslbip *string `json:"publicslbip,omitempty" xml:"publicslbip,omitempty"`
}

func (s EnableDynamicslbResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableDynamicslbResponse) GoString() string {
	return s.String()
}

func (s *EnableDynamicslbResponse) SetReqMsgId(v string) *EnableDynamicslbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableDynamicslbResponse) SetResultCode(v string) *EnableDynamicslbResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableDynamicslbResponse) SetResultMsg(v string) *EnableDynamicslbResponse {
	s.ResultMsg = &v
	return s
}

func (s *EnableDynamicslbResponse) SetSuccess(v bool) *EnableDynamicslbResponse {
	s.Success = &v
	return s
}

func (s *EnableDynamicslbResponse) SetPublicslbip(v string) *EnableDynamicslbResponse {
	s.Publicslbip = &v
	return s
}

type DisableDynamicslbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// envid
	Envid *string `json:"envid,omitempty" xml:"envid,omitempty" require:"true"`
	// 部署单元id
	Unitinstanceid *string `json:"unitinstanceid,omitempty" xml:"unitinstanceid,omitempty" require:"true"`
	// prodcode
	Prodcode *string `json:"prodcode,omitempty" xml:"prodcode,omitempty" require:"true"`
	// appname
	Appname *string `json:"appname,omitempty" xml:"appname,omitempty" require:"true"`
}

func (s DisableDynamicslbRequest) String() string {
	return tea.Prettify(s)
}

func (s DisableDynamicslbRequest) GoString() string {
	return s.String()
}

func (s *DisableDynamicslbRequest) SetAuthToken(v string) *DisableDynamicslbRequest {
	s.AuthToken = &v
	return s
}

func (s *DisableDynamicslbRequest) SetProductInstanceId(v string) *DisableDynamicslbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DisableDynamicslbRequest) SetEnvid(v string) *DisableDynamicslbRequest {
	s.Envid = &v
	return s
}

func (s *DisableDynamicslbRequest) SetUnitinstanceid(v string) *DisableDynamicslbRequest {
	s.Unitinstanceid = &v
	return s
}

func (s *DisableDynamicslbRequest) SetProdcode(v string) *DisableDynamicslbRequest {
	s.Prodcode = &v
	return s
}

func (s *DisableDynamicslbRequest) SetAppname(v string) *DisableDynamicslbRequest {
	s.Appname = &v
	return s
}

type DisableDynamicslbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DisableDynamicslbResponse) String() string {
	return tea.Prettify(s)
}

func (s DisableDynamicslbResponse) GoString() string {
	return s.String()
}

func (s *DisableDynamicslbResponse) SetReqMsgId(v string) *DisableDynamicslbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DisableDynamicslbResponse) SetResultCode(v string) *DisableDynamicslbResponse {
	s.ResultCode = &v
	return s
}

func (s *DisableDynamicslbResponse) SetResultMsg(v string) *DisableDynamicslbResponse {
	s.ResultMsg = &v
	return s
}

type ExecClusterDnsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名列表
	AppNames []*string `json:"app_names,omitempty" xml:"app_names,omitempty" require:"true" type:"Repeated"`
	// dns域名的绑定/解绑
	OpsAction *string `json:"ops_action,omitempty" xml:"ops_action,omitempty" require:"true"`
	// 需要调用的adns所对应环境。
	// 例如A、B环境，A环境宕机了，此时需要调用B机房的adns进行A机房的环境域名解绑操作。
	// 如果不填，默认与env_id一致。
	OperationEnvId *string `json:"operation_env_id,omitempty" xml:"operation_env_id,omitempty"`
}

func (s ExecClusterDnsRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecClusterDnsRequest) GoString() string {
	return s.String()
}

func (s *ExecClusterDnsRequest) SetAuthToken(v string) *ExecClusterDnsRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecClusterDnsRequest) SetProductInstanceId(v string) *ExecClusterDnsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecClusterDnsRequest) SetEnvId(v string) *ExecClusterDnsRequest {
	s.EnvId = &v
	return s
}

func (s *ExecClusterDnsRequest) SetProdCode(v string) *ExecClusterDnsRequest {
	s.ProdCode = &v
	return s
}

func (s *ExecClusterDnsRequest) SetAppNames(v []*string) *ExecClusterDnsRequest {
	s.AppNames = v
	return s
}

func (s *ExecClusterDnsRequest) SetOpsAction(v string) *ExecClusterDnsRequest {
	s.OpsAction = &v
	return s
}

func (s *ExecClusterDnsRequest) SetOperationEnvId(v string) *ExecClusterDnsRequest {
	s.OperationEnvId = &v
	return s
}

type ExecClusterDnsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ExecClusterDnsResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecClusterDnsResponse) GoString() string {
	return s.String()
}

func (s *ExecClusterDnsResponse) SetReqMsgId(v string) *ExecClusterDnsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecClusterDnsResponse) SetResultCode(v string) *ExecClusterDnsResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecClusterDnsResponse) SetResultMsg(v string) *ExecClusterDnsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecClusterDnsResponse) SetOpsPlanId(v string) *ExecClusterDnsResponse {
	s.OpsPlanId = &v
	return s
}

type OfflineClusterContainerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// pod名字
	PodName *string `json:"pod_name,omitempty" xml:"pod_name,omitempty" require:"true"`
}

func (s OfflineClusterContainerRequest) String() string {
	return tea.Prettify(s)
}

func (s OfflineClusterContainerRequest) GoString() string {
	return s.String()
}

func (s *OfflineClusterContainerRequest) SetAuthToken(v string) *OfflineClusterContainerRequest {
	s.AuthToken = &v
	return s
}

func (s *OfflineClusterContainerRequest) SetProductInstanceId(v string) *OfflineClusterContainerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OfflineClusterContainerRequest) SetEnvId(v string) *OfflineClusterContainerRequest {
	s.EnvId = &v
	return s
}

func (s *OfflineClusterContainerRequest) SetProdCode(v string) *OfflineClusterContainerRequest {
	s.ProdCode = &v
	return s
}

func (s *OfflineClusterContainerRequest) SetAppName(v string) *OfflineClusterContainerRequest {
	s.AppName = &v
	return s
}

func (s *OfflineClusterContainerRequest) SetPodName(v string) *OfflineClusterContainerRequest {
	s.PodName = &v
	return s
}

type OfflineClusterContainerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s OfflineClusterContainerResponse) String() string {
	return tea.Prettify(s)
}

func (s OfflineClusterContainerResponse) GoString() string {
	return s.String()
}

func (s *OfflineClusterContainerResponse) SetReqMsgId(v string) *OfflineClusterContainerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OfflineClusterContainerResponse) SetResultCode(v string) *OfflineClusterContainerResponse {
	s.ResultCode = &v
	return s
}

func (s *OfflineClusterContainerResponse) SetResultMsg(v string) *OfflineClusterContainerResponse {
	s.ResultMsg = &v
	return s
}

func (s *OfflineClusterContainerResponse) SetOpsPlanId(v string) *OfflineClusterContainerResponse {
	s.OpsPlanId = &v
	return s
}

type OnlineClusterContainerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// pod name
	PodName *string `json:"pod_name,omitempty" xml:"pod_name,omitempty" require:"true"`
}

func (s OnlineClusterContainerRequest) String() string {
	return tea.Prettify(s)
}

func (s OnlineClusterContainerRequest) GoString() string {
	return s.String()
}

func (s *OnlineClusterContainerRequest) SetAuthToken(v string) *OnlineClusterContainerRequest {
	s.AuthToken = &v
	return s
}

func (s *OnlineClusterContainerRequest) SetProductInstanceId(v string) *OnlineClusterContainerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OnlineClusterContainerRequest) SetEnvId(v string) *OnlineClusterContainerRequest {
	s.EnvId = &v
	return s
}

func (s *OnlineClusterContainerRequest) SetProdCode(v string) *OnlineClusterContainerRequest {
	s.ProdCode = &v
	return s
}

func (s *OnlineClusterContainerRequest) SetAppName(v string) *OnlineClusterContainerRequest {
	s.AppName = &v
	return s
}

func (s *OnlineClusterContainerRequest) SetPodName(v string) *OnlineClusterContainerRequest {
	s.PodName = &v
	return s
}

type OnlineClusterContainerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s OnlineClusterContainerResponse) String() string {
	return tea.Prettify(s)
}

func (s OnlineClusterContainerResponse) GoString() string {
	return s.String()
}

func (s *OnlineClusterContainerResponse) SetReqMsgId(v string) *OnlineClusterContainerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OnlineClusterContainerResponse) SetResultCode(v string) *OnlineClusterContainerResponse {
	s.ResultCode = &v
	return s
}

func (s *OnlineClusterContainerResponse) SetResultMsg(v string) *OnlineClusterContainerResponse {
	s.ResultMsg = &v
	return s
}

func (s *OnlineClusterContainerResponse) SetOpsPlanId(v string) *OnlineClusterContainerResponse {
	s.OpsPlanId = &v
	return s
}

type QueryAppparamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s QueryAppparamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAppparamRequest) GoString() string {
	return s.String()
}

func (s *QueryAppparamRequest) SetAuthToken(v string) *QueryAppparamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAppparamRequest) SetProductInstanceId(v string) *QueryAppparamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAppparamRequest) SetProdCode(v string) *QueryAppparamRequest {
	s.ProdCode = &v
	return s
}

func (s *QueryAppparamRequest) SetAppName(v string) *QueryAppparamRequest {
	s.AppName = &v
	return s
}

func (s *QueryAppparamRequest) SetEnvId(v string) *QueryAppparamRequest {
	s.EnvId = &v
	return s
}

type QueryAppparamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 启动参数的key-value列表
	AppParams []*ParamData `json:"app_params,omitempty" xml:"app_params,omitempty" type:"Repeated"`
}

func (s QueryAppparamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAppparamResponse) GoString() string {
	return s.String()
}

func (s *QueryAppparamResponse) SetReqMsgId(v string) *QueryAppparamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAppparamResponse) SetResultCode(v string) *QueryAppparamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAppparamResponse) SetResultMsg(v string) *QueryAppparamResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAppparamResponse) SetEnvId(v string) *QueryAppparamResponse {
	s.EnvId = &v
	return s
}

func (s *QueryAppparamResponse) SetProdCode(v string) *QueryAppparamResponse {
	s.ProdCode = &v
	return s
}

func (s *QueryAppparamResponse) SetAppName(v string) *QueryAppparamResponse {
	s.AppName = &v
	return s
}

func (s *QueryAppparamResponse) SetAppParams(v []*ParamData) *QueryAppparamResponse {
	s.AppParams = v
	return s
}

type PagequerySolutionOpsplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案Id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
	// 环境Id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 当前页
	CurrentPage *string `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 分页大小
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// RELEASE
	PlanType *string `json:"plan_type,omitempty" xml:"plan_type,omitempty" require:"true"`
	// FAILED
	OpsPlanStatus *string `json:"ops_plan_status,omitempty" xml:"ops_plan_status,omitempty" require:"true"`
}

func (s PagequerySolutionOpsplanRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequerySolutionOpsplanRequest) GoString() string {
	return s.String()
}

func (s *PagequerySolutionOpsplanRequest) SetAuthToken(v string) *PagequerySolutionOpsplanRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetProductInstanceId(v string) *PagequerySolutionOpsplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetSolutionId(v string) *PagequerySolutionOpsplanRequest {
	s.SolutionId = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetEnvId(v string) *PagequerySolutionOpsplanRequest {
	s.EnvId = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetCurrentPage(v string) *PagequerySolutionOpsplanRequest {
	s.CurrentPage = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetPageSize(v string) *PagequerySolutionOpsplanRequest {
	s.PageSize = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetPlanType(v string) *PagequerySolutionOpsplanRequest {
	s.PlanType = &v
	return s
}

func (s *PagequerySolutionOpsplanRequest) SetOpsPlanStatus(v string) *PagequerySolutionOpsplanRequest {
	s.OpsPlanStatus = &v
	return s
}

type PagequerySolutionOpsplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单列表
	OpsPlans []*OpsPlan `json:"ops_plans,omitempty" xml:"ops_plans,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s PagequerySolutionOpsplanResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequerySolutionOpsplanResponse) GoString() string {
	return s.String()
}

func (s *PagequerySolutionOpsplanResponse) SetReqMsgId(v string) *PagequerySolutionOpsplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetResultCode(v string) *PagequerySolutionOpsplanResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetResultMsg(v string) *PagequerySolutionOpsplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetOpsPlans(v []*OpsPlan) *PagequerySolutionOpsplanResponse {
	s.OpsPlans = v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetTotalCount(v int64) *PagequerySolutionOpsplanResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetPageSize(v int64) *PagequerySolutionOpsplanResponse {
	s.PageSize = &v
	return s
}

func (s *PagequerySolutionOpsplanResponse) SetCurrentPage(v int64) *PagequerySolutionOpsplanResponse {
	s.CurrentPage = &v
	return s
}

type ConfirmSolutionPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案Id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s ConfirmSolutionPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSolutionPlanRequest) GoString() string {
	return s.String()
}

func (s *ConfirmSolutionPlanRequest) SetAuthToken(v string) *ConfirmSolutionPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmSolutionPlanRequest) SetProductInstanceId(v string) *ConfirmSolutionPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmSolutionPlanRequest) SetSolutionId(v string) *ConfirmSolutionPlanRequest {
	s.SolutionId = &v
	return s
}

type ConfirmSolutionPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmSolutionPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSolutionPlanResponse) GoString() string {
	return s.String()
}

func (s *ConfirmSolutionPlanResponse) SetReqMsgId(v string) *ConfirmSolutionPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmSolutionPlanResponse) SetResultCode(v string) *ConfirmSolutionPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmSolutionPlanResponse) SetResultMsg(v string) *ConfirmSolutionPlanResponse {
	s.ResultMsg = &v
	return s
}

type GetSolutionPlanstatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s GetSolutionPlanstatusRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSolutionPlanstatusRequest) GoString() string {
	return s.String()
}

func (s *GetSolutionPlanstatusRequest) SetAuthToken(v string) *GetSolutionPlanstatusRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSolutionPlanstatusRequest) SetProductInstanceId(v string) *GetSolutionPlanstatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSolutionPlanstatusRequest) SetSolutionId(v string) *GetSolutionPlanstatusRequest {
	s.SolutionId = &v
	return s
}

type GetSolutionPlanstatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否完成规划
	AllPlanConfirmed *bool `json:"all_plan_confirmed,omitempty" xml:"all_plan_confirmed,omitempty"`
	// sidecar规划状态
	SidecarPlanStatus *string `json:"sidecar_plan_status,omitempty" xml:"sidecar_plan_status,omitempty"`
	// 持久化存储规划状态
	PersistentVolumePlanStatus *string `json:"persistent_volume_plan_status,omitempty" xml:"persistent_volume_plan_status,omitempty"`
	// 数据库规划状态
	//
	DbPlanStatus *string `json:"db_plan_status,omitempty" xml:"db_plan_status,omitempty"`
	// 负载均衡规划
	LbPlanStatus *string `json:"lb_plan_status,omitempty" xml:"lb_plan_status,omitempty"`
	// 应用配置规划状态
	AppDeploySpecStatus *string `json:"app_deploy_spec_status,omitempty" xml:"app_deploy_spec_status,omitempty"`
	// 解决方案检查项结果
	CheckPoint []*CheckPoint `json:"check_point,omitempty" xml:"check_point,omitempty" type:"Repeated"`
}

func (s GetSolutionPlanstatusResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSolutionPlanstatusResponse) GoString() string {
	return s.String()
}

func (s *GetSolutionPlanstatusResponse) SetReqMsgId(v string) *GetSolutionPlanstatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetResultCode(v string) *GetSolutionPlanstatusResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetResultMsg(v string) *GetSolutionPlanstatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetAllPlanConfirmed(v bool) *GetSolutionPlanstatusResponse {
	s.AllPlanConfirmed = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetSidecarPlanStatus(v string) *GetSolutionPlanstatusResponse {
	s.SidecarPlanStatus = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetPersistentVolumePlanStatus(v string) *GetSolutionPlanstatusResponse {
	s.PersistentVolumePlanStatus = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetDbPlanStatus(v string) *GetSolutionPlanstatusResponse {
	s.DbPlanStatus = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetLbPlanStatus(v string) *GetSolutionPlanstatusResponse {
	s.LbPlanStatus = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetAppDeploySpecStatus(v string) *GetSolutionPlanstatusResponse {
	s.AppDeploySpecStatus = &v
	return s
}

func (s *GetSolutionPlanstatusResponse) SetCheckPoint(v []*CheckPoint) *GetSolutionPlanstatusResponse {
	s.CheckPoint = v
	return s
}

type PagequeryProditerationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty"`
}

func (s PagequeryProditerationRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProditerationRequest) GoString() string {
	return s.String()
}

func (s *PagequeryProditerationRequest) SetAuthToken(v string) *PagequeryProditerationRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryProditerationRequest) SetProductInstanceId(v string) *PagequeryProditerationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryProditerationRequest) SetProdCode(v string) *PagequeryProditerationRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryProditerationRequest) SetProdVersion(v string) *PagequeryProditerationRequest {
	s.ProdVersion = &v
	return s
}

type PagequeryProditerationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PagequeryProditerationResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProditerationResponse) GoString() string {
	return s.String()
}

func (s *PagequeryProditerationResponse) SetReqMsgId(v string) *PagequeryProditerationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryProditerationResponse) SetResultCode(v string) *PagequeryProditerationResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryProditerationResponse) SetResultMsg(v string) *PagequeryProditerationResponse {
	s.ResultMsg = &v
	return s
}

type CreateProdinstanceDeployunitbatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 部署单元名称
	DeploymentUnitName *string `json:"deployment_unit_name,omitempty" xml:"deployment_unit_name,omitempty" require:"true"`
	// 部署单元实例id列表
	UnitInstanceIds []*string `json:"unit_instance_ids,omitempty" xml:"unit_instance_ids,omitempty" require:"true" type:"Repeated"`
	// 逻辑部署单元实例id
	LogicalInstanceId *string `json:"logical_instance_id,omitempty" xml:"logical_instance_id,omitempty" require:"true"`
	// 集群中哪个zone，公有云场景使用，专有云不需要部署
	CellId *string `json:"cell_id,omitempty" xml:"cell_id,omitempty" require:"true"`
	// 操作人id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s CreateProdinstanceDeployunitbatchRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProdinstanceDeployunitbatchRequest) GoString() string {
	return s.String()
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetAuthToken(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetProductInstanceId(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetEnvId(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.EnvId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetProdCode(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.ProdCode = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetDeploymentUnitName(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.DeploymentUnitName = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetUnitInstanceIds(v []*string) *CreateProdinstanceDeployunitbatchRequest {
	s.UnitInstanceIds = v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetLogicalInstanceId(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.LogicalInstanceId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetCellId(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.CellId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetSubmitterId(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.SubmitterId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchRequest) SetSubmitterName(v string) *CreateProdinstanceDeployunitbatchRequest {
	s.SubmitterName = &v
	return s
}

type CreateProdinstanceDeployunitbatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateProdinstanceDeployunitbatchResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProdinstanceDeployunitbatchResponse) GoString() string {
	return s.String()
}

func (s *CreateProdinstanceDeployunitbatchResponse) SetReqMsgId(v string) *CreateProdinstanceDeployunitbatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchResponse) SetResultCode(v string) *CreateProdinstanceDeployunitbatchResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchResponse) SetResultMsg(v string) *CreateProdinstanceDeployunitbatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProdinstanceDeployunitbatchResponse) SetOpsPlanId(v string) *CreateProdinstanceDeployunitbatchResponse {
	s.OpsPlanId = &v
	return s
}

type RollbackOpsAppRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 需要回滚的快照版本
	ProdSnapshotVersion *string `json:"prod_snapshot_version,omitempty" xml:"prod_snapshot_version,omitempty" require:"true"`
	// 部署单元ID
	UnitInstanceId *string `json:"unit_instance_id,omitempty" xml:"unit_instance_id,omitempty" require:"true"`
	// 操作人Id
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
	//
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
	// 分组策略，默认使用SYSTEM_RECOMMENDATION
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty"`
}

func (s RollbackOpsAppRequest) String() string {
	return tea.Prettify(s)
}

func (s RollbackOpsAppRequest) GoString() string {
	return s.String()
}

func (s *RollbackOpsAppRequest) SetAuthToken(v string) *RollbackOpsAppRequest {
	s.AuthToken = &v
	return s
}

func (s *RollbackOpsAppRequest) SetProductInstanceId(v string) *RollbackOpsAppRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RollbackOpsAppRequest) SetOpsPlanId(v string) *RollbackOpsAppRequest {
	s.OpsPlanId = &v
	return s
}

func (s *RollbackOpsAppRequest) SetProdCode(v string) *RollbackOpsAppRequest {
	s.ProdCode = &v
	return s
}

func (s *RollbackOpsAppRequest) SetAppName(v string) *RollbackOpsAppRequest {
	s.AppName = &v
	return s
}

func (s *RollbackOpsAppRequest) SetProdSnapshotVersion(v string) *RollbackOpsAppRequest {
	s.ProdSnapshotVersion = &v
	return s
}

func (s *RollbackOpsAppRequest) SetUnitInstanceId(v string) *RollbackOpsAppRequest {
	s.UnitInstanceId = &v
	return s
}

func (s *RollbackOpsAppRequest) SetSubmitterId(v string) *RollbackOpsAppRequest {
	s.SubmitterId = &v
	return s
}

func (s *RollbackOpsAppRequest) SetSubmitterName(v string) *RollbackOpsAppRequest {
	s.SubmitterName = &v
	return s
}

func (s *RollbackOpsAppRequest) SetGroupStrategy(v string) *RollbackOpsAppRequest {
	s.GroupStrategy = &v
	return s
}

type RollbackOpsAppResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回滚任务发布单
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s RollbackOpsAppResponse) String() string {
	return tea.Prettify(s)
}

func (s RollbackOpsAppResponse) GoString() string {
	return s.String()
}

func (s *RollbackOpsAppResponse) SetReqMsgId(v string) *RollbackOpsAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RollbackOpsAppResponse) SetResultCode(v string) *RollbackOpsAppResponse {
	s.ResultCode = &v
	return s
}

func (s *RollbackOpsAppResponse) SetResultMsg(v string) *RollbackOpsAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *RollbackOpsAppResponse) SetOpsPlanId(v string) *RollbackOpsAppResponse {
	s.OpsPlanId = &v
	return s
}

type RollbackOpsProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要回滚的解决方案ID
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 需要回滚的快照版本
	ProdSnapshotVersion *string `json:"prod_snapshot_version,omitempty" xml:"prod_snapshot_version,omitempty" require:"true"`
	// 分组策略
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty"`
	// 部署单元ID
	UnitInstanceId *string `json:"unit_instance_id,omitempty" xml:"unit_instance_id,omitempty" require:"true"`
	// 操作人ID
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
	// 操作人名称（花名或者真名）
	SubmitterName *string `json:"submitter_name,omitempty" xml:"submitter_name,omitempty"`
}

func (s RollbackOpsProductRequest) String() string {
	return tea.Prettify(s)
}

func (s RollbackOpsProductRequest) GoString() string {
	return s.String()
}

func (s *RollbackOpsProductRequest) SetAuthToken(v string) *RollbackOpsProductRequest {
	s.AuthToken = &v
	return s
}

func (s *RollbackOpsProductRequest) SetProductInstanceId(v string) *RollbackOpsProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RollbackOpsProductRequest) SetSolutionId(v string) *RollbackOpsProductRequest {
	s.SolutionId = &v
	return s
}

func (s *RollbackOpsProductRequest) SetProdCode(v string) *RollbackOpsProductRequest {
	s.ProdCode = &v
	return s
}

func (s *RollbackOpsProductRequest) SetProdSnapshotVersion(v string) *RollbackOpsProductRequest {
	s.ProdSnapshotVersion = &v
	return s
}

func (s *RollbackOpsProductRequest) SetGroupStrategy(v string) *RollbackOpsProductRequest {
	s.GroupStrategy = &v
	return s
}

func (s *RollbackOpsProductRequest) SetUnitInstanceId(v string) *RollbackOpsProductRequest {
	s.UnitInstanceId = &v
	return s
}

func (s *RollbackOpsProductRequest) SetSubmitterId(v string) *RollbackOpsProductRequest {
	s.SubmitterId = &v
	return s
}

func (s *RollbackOpsProductRequest) SetSubmitterName(v string) *RollbackOpsProductRequest {
	s.SubmitterName = &v
	return s
}

type RollbackOpsProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回滚发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s RollbackOpsProductResponse) String() string {
	return tea.Prettify(s)
}

func (s RollbackOpsProductResponse) GoString() string {
	return s.String()
}

func (s *RollbackOpsProductResponse) SetReqMsgId(v string) *RollbackOpsProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RollbackOpsProductResponse) SetResultCode(v string) *RollbackOpsProductResponse {
	s.ResultCode = &v
	return s
}

func (s *RollbackOpsProductResponse) SetResultMsg(v string) *RollbackOpsProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *RollbackOpsProductResponse) SetOpsPlanId(v string) *RollbackOpsProductResponse {
	s.OpsPlanId = &v
	return s
}

type QueryClusterNativepodRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码--应用名
	ProductApp *string `json:"product_app,omitempty" xml:"product_app,omitempty"`
	// 租户信息
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryClusterNativepodRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterNativepodRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterNativepodRequest) SetAuthToken(v string) *QueryClusterNativepodRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterNativepodRequest) SetProductInstanceId(v string) *QueryClusterNativepodRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryClusterNativepodRequest) SetEnvId(v string) *QueryClusterNativepodRequest {
	s.EnvId = &v
	return s
}

func (s *QueryClusterNativepodRequest) SetProductApp(v string) *QueryClusterNativepodRequest {
	s.ProductApp = &v
	return s
}

func (s *QueryClusterNativepodRequest) SetTenantId(v string) *QueryClusterNativepodRequest {
	s.TenantId = &v
	return s
}

type QueryClusterNativepodResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Pod信息
	PodInfos []*PodInfo `json:"pod_infos,omitempty" xml:"pod_infos,omitempty" type:"Repeated"`
}

func (s QueryClusterNativepodResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterNativepodResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterNativepodResponse) SetReqMsgId(v string) *QueryClusterNativepodResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterNativepodResponse) SetResultCode(v string) *QueryClusterNativepodResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterNativepodResponse) SetResultMsg(v string) *QueryClusterNativepodResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterNativepodResponse) SetPodInfos(v []*PodInfo) *QueryClusterNativepodResponse {
	s.PodInfos = v
	return s
}

type PagequeryBaselineAppcontainersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境ID
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名数组，没传则查询改产品下的所有参数
	Apps []*string `json:"apps,omitempty" xml:"apps,omitempty" type:"Repeated"`
	// 部署单元实例id。默认值为default
	DeploymentUnitInstanceIdentities []*string `json:"deployment_unit_instance_identities,omitempty" xml:"deployment_unit_instance_identities,omitempty" type:"Repeated"`
	// 页大小，默认每页12
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 第几页，默认返回第一页
	//
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s PagequeryBaselineAppcontainersRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryBaselineAppcontainersRequest) GoString() string {
	return s.String()
}

func (s *PagequeryBaselineAppcontainersRequest) SetAuthToken(v string) *PagequeryBaselineAppcontainersRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetProductInstanceId(v string) *PagequeryBaselineAppcontainersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetEnvId(v string) *PagequeryBaselineAppcontainersRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetProdCode(v string) *PagequeryBaselineAppcontainersRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetApps(v []*string) *PagequeryBaselineAppcontainersRequest {
	s.Apps = v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetDeploymentUnitInstanceIdentities(v []*string) *PagequeryBaselineAppcontainersRequest {
	s.DeploymentUnitInstanceIdentities = v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetPageSize(v int64) *PagequeryBaselineAppcontainersRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryBaselineAppcontainersRequest) SetCurrentPage(v int64) *PagequeryBaselineAppcontainersRequest {
	s.CurrentPage = &v
	return s
}

type PagequeryBaselineAppcontainersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询中的总数目
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 基线应用容器列表
	Containers []*Container `json:"containers,omitempty" xml:"containers,omitempty" type:"Repeated"`
}

func (s PagequeryBaselineAppcontainersResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryBaselineAppcontainersResponse) GoString() string {
	return s.String()
}

func (s *PagequeryBaselineAppcontainersResponse) SetReqMsgId(v string) *PagequeryBaselineAppcontainersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetResultCode(v string) *PagequeryBaselineAppcontainersResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetResultMsg(v string) *PagequeryBaselineAppcontainersResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetTotalCount(v int64) *PagequeryBaselineAppcontainersResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetPageSize(v int64) *PagequeryBaselineAppcontainersResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetCurrentPage(v int64) *PagequeryBaselineAppcontainersResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryBaselineAppcontainersResponse) SetContainers(v []*Container) *PagequeryBaselineAppcontainersResponse {
	s.Containers = v
	return s
}

type PagequeryRollbackSnapshotversionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境Id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 每页大小，默认12
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页码。默认第一页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s PagequeryRollbackSnapshotversionRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryRollbackSnapshotversionRequest) GoString() string {
	return s.String()
}

func (s *PagequeryRollbackSnapshotversionRequest) SetAuthToken(v string) *PagequeryRollbackSnapshotversionRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionRequest) SetProductInstanceId(v string) *PagequeryRollbackSnapshotversionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionRequest) SetEnvId(v string) *PagequeryRollbackSnapshotversionRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionRequest) SetProdCode(v string) *PagequeryRollbackSnapshotversionRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionRequest) SetPageSize(v int64) *PagequeryRollbackSnapshotversionRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionRequest) SetCurrentPage(v int64) *PagequeryRollbackSnapshotversionRequest {
	s.CurrentPage = &v
	return s
}

type PagequeryRollbackSnapshotversionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 共有多少天记录
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 快照版本
	DeploymentUnitSnapshots []*DeploymentUnitSnapshotOP `json:"deployment_unit_snapshots,omitempty" xml:"deployment_unit_snapshots,omitempty" type:"Repeated"`
}

func (s PagequeryRollbackSnapshotversionResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryRollbackSnapshotversionResponse) GoString() string {
	return s.String()
}

func (s *PagequeryRollbackSnapshotversionResponse) SetReqMsgId(v string) *PagequeryRollbackSnapshotversionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetResultCode(v string) *PagequeryRollbackSnapshotversionResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetResultMsg(v string) *PagequeryRollbackSnapshotversionResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetPageSize(v int64) *PagequeryRollbackSnapshotversionResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetCurrentPage(v int64) *PagequeryRollbackSnapshotversionResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetTotalCount(v int64) *PagequeryRollbackSnapshotversionResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryRollbackSnapshotversionResponse) SetDeploymentUnitSnapshots(v []*DeploymentUnitSnapshotOP) *PagequeryRollbackSnapshotversionResponse {
	s.DeploymentUnitSnapshots = v
	return s
}

type EnableProdAutotestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCodes []*string `json:"prod_codes,omitempty" xml:"prod_codes,omitempty" type:"Repeated"`
	// READY("READY", "准备执行"), DEPLOYING("DEPLOYING", "部署中, 首次部署时的状态"),  UPGRADING("UPGRADING", "升级中, 首次部署时的状态"),      ROLL_BACKING("ROLL_BACKING", "回滚中, 包括产品回滚和应用回滚"),      ACTIVE("ACTIVE", "可用"),      FAILED("FAILED", "失败"),ROLLBACKED("ROLLBACKED", "已回滚"),APP_ROLLBACKED("APP_ROLLBACKED", "应用回滚")
	ProdStatus []*string `json:"prod_status,omitempty" xml:"prod_status,omitempty" type:"Repeated"`
}

func (s EnableProdAutotestRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableProdAutotestRequest) GoString() string {
	return s.String()
}

func (s *EnableProdAutotestRequest) SetAuthToken(v string) *EnableProdAutotestRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableProdAutotestRequest) SetProductInstanceId(v string) *EnableProdAutotestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EnableProdAutotestRequest) SetEnvId(v string) *EnableProdAutotestRequest {
	s.EnvId = &v
	return s
}

func (s *EnableProdAutotestRequest) SetProdCodes(v []*string) *EnableProdAutotestRequest {
	s.ProdCodes = v
	return s
}

func (s *EnableProdAutotestRequest) SetProdStatus(v []*string) *EnableProdAutotestRequest {
	s.ProdStatus = v
	return s
}

type EnableProdAutotestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否可执行测试用例结果
	Options []*AutoTestAvailableProdOption `json:"options,omitempty" xml:"options,omitempty" type:"Repeated"`
}

func (s EnableProdAutotestResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableProdAutotestResponse) GoString() string {
	return s.String()
}

func (s *EnableProdAutotestResponse) SetReqMsgId(v string) *EnableProdAutotestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableProdAutotestResponse) SetResultCode(v string) *EnableProdAutotestResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableProdAutotestResponse) SetResultMsg(v string) *EnableProdAutotestResponse {
	s.ResultMsg = &v
	return s
}

func (s *EnableProdAutotestResponse) SetOptions(v []*AutoTestAvailableProdOption) *EnableProdAutotestResponse {
	s.Options = v
	return s
}

type QuerySystemParameterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境ids
	EnvIds *string `json:"env_ids,omitempty" xml:"env_ids,omitempty" require:"true"`
	// 参数名s
	Types *string `json:"types,omitempty" xml:"types,omitempty"`
}

func (s QuerySystemParameterRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySystemParameterRequest) GoString() string {
	return s.String()
}

func (s *QuerySystemParameterRequest) SetAuthToken(v string) *QuerySystemParameterRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySystemParameterRequest) SetProductInstanceId(v string) *QuerySystemParameterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySystemParameterRequest) SetEnvIds(v string) *QuerySystemParameterRequest {
	s.EnvIds = &v
	return s
}

func (s *QuerySystemParameterRequest) SetTypes(v string) *QuerySystemParameterRequest {
	s.Types = &v
	return s
}

type QuerySystemParameterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 系统参数值
	SystemParameters []*SystemParameterInfo `json:"system_parameters,omitempty" xml:"system_parameters,omitempty" type:"Repeated"`
}

func (s QuerySystemParameterResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySystemParameterResponse) GoString() string {
	return s.String()
}

func (s *QuerySystemParameterResponse) SetReqMsgId(v string) *QuerySystemParameterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySystemParameterResponse) SetResultCode(v string) *QuerySystemParameterResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySystemParameterResponse) SetResultMsg(v string) *QuerySystemParameterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySystemParameterResponse) SetSystemParameters(v []*SystemParameterInfo) *QuerySystemParameterResponse {
	s.SystemParameters = v
	return s
}

type QueryOpsplanNodetreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
	// 发布单节点树根节点id
	SubTreeNodeRootId *string `json:"sub_tree_node_root_id,omitempty" xml:"sub_tree_node_root_id,omitempty"`
}

func (s QueryOpsplanNodetreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOpsplanNodetreeRequest) GoString() string {
	return s.String()
}

func (s *QueryOpsplanNodetreeRequest) SetAuthToken(v string) *QueryOpsplanNodetreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOpsplanNodetreeRequest) SetProductInstanceId(v string) *QueryOpsplanNodetreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOpsplanNodetreeRequest) SetOpsPlanId(v string) *QueryOpsplanNodetreeRequest {
	s.OpsPlanId = &v
	return s
}

func (s *QueryOpsplanNodetreeRequest) SetSubTreeNodeRootId(v string) *QueryOpsplanNodetreeRequest {
	s.SubTreeNodeRootId = &v
	return s
}

type QueryOpsplanNodetreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单节点树，为json string
	NodeTree *string `json:"node_tree,omitempty" xml:"node_tree,omitempty"`
}

func (s QueryOpsplanNodetreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOpsplanNodetreeResponse) GoString() string {
	return s.String()
}

func (s *QueryOpsplanNodetreeResponse) SetReqMsgId(v string) *QueryOpsplanNodetreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOpsplanNodetreeResponse) SetResultCode(v string) *QueryOpsplanNodetreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOpsplanNodetreeResponse) SetResultMsg(v string) *QueryOpsplanNodetreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOpsplanNodetreeResponse) SetNodeTree(v string) *QueryOpsplanNodetreeResponse {
	s.NodeTree = &v
	return s
}

type ListAapSitesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ListAapSitesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAapSitesRequest) GoString() string {
	return s.String()
}

func (s *ListAapSitesRequest) SetAuthToken(v string) *ListAapSitesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAapSitesRequest) SetProductInstanceId(v string) *ListAapSitesRequest {
	s.ProductInstanceId = &v
	return s
}

type ListAapSitesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// site list
	Sites []*SiteInfo `json:"sites,omitempty" xml:"sites,omitempty" type:"Repeated"`
}

func (s ListAapSitesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAapSitesResponse) GoString() string {
	return s.String()
}

func (s *ListAapSitesResponse) SetReqMsgId(v string) *ListAapSitesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAapSitesResponse) SetResultCode(v string) *ListAapSitesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAapSitesResponse) SetResultMsg(v string) *ListAapSitesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAapSitesResponse) SetSites(v []*SiteInfo) *ListAapSitesResponse {
	s.Sites = v
	return s
}

type ImportAapMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// yaml的string格式
	MetaContext *string `json:"meta_context,omitempty" xml:"meta_context,omitempty" require:"true"`
}

func (s ImportAapMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAapMetaRequest) GoString() string {
	return s.String()
}

func (s *ImportAapMetaRequest) SetAuthToken(v string) *ImportAapMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAapMetaRequest) SetProductInstanceId(v string) *ImportAapMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAapMetaRequest) SetMetaContext(v string) *ImportAapMetaRequest {
	s.MetaContext = &v
	return s
}

type ImportAapMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否上传成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportAapMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAapMetaResponse) GoString() string {
	return s.String()
}

func (s *ImportAapMetaResponse) SetReqMsgId(v string) *ImportAapMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAapMetaResponse) SetResultCode(v string) *ImportAapMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAapMetaResponse) SetResultMsg(v string) *ImportAapMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAapMetaResponse) SetSuccess(v bool) *ImportAapMetaResponse {
	s.Success = &v
	return s
}

type InitAapProductinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 命名空间，命名格式：siteCode-prodCode （小写）
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品实例名称，推荐产品code的小写字母
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty" require:"true"`
	// 产品部署的拓扑名称，部署时会根据该信息进行部署
	TopologyCode *string `json:"topology_code,omitempty" xml:"topology_code,omitempty" require:"true"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
}

func (s InitAapProductinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAapProductinstanceRequest) GoString() string {
	return s.String()
}

func (s *InitAapProductinstanceRequest) SetAuthToken(v string) *InitAapProductinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetProductInstanceId(v string) *InitAapProductinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetNamespace(v string) *InitAapProductinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetName(v string) *InitAapProductinstanceRequest {
	s.Name = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetProdCode(v string) *InitAapProductinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetProdVersion(v string) *InitAapProductinstanceRequest {
	s.ProdVersion = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetTopologyCode(v string) *InitAapProductinstanceRequest {
	s.TopologyCode = &v
	return s
}

func (s *InitAapProductinstanceRequest) SetSiteCode(v string) *InitAapProductinstanceRequest {
	s.SiteCode = &v
	return s
}

type InitAapProductinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitAapProductinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAapProductinstanceResponse) GoString() string {
	return s.String()
}

func (s *InitAapProductinstanceResponse) SetReqMsgId(v string) *InitAapProductinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAapProductinstanceResponse) SetResultCode(v string) *InitAapProductinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAapProductinstanceResponse) SetResultMsg(v string) *InitAapProductinstanceResponse {
	s.ResultMsg = &v
	return s
}

type InitAapReleaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要升级的产品实例
	ProductDeployInitOptionRequest *ProductDeployInitOptionRequest `json:"product_deploy_init_option_request,omitempty" xml:"product_deploy_init_option_request,omitempty" require:"true"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty"`
}

func (s InitAapReleaseRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAapReleaseRequest) GoString() string {
	return s.String()
}

func (s *InitAapReleaseRequest) SetAuthToken(v string) *InitAapReleaseRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAapReleaseRequest) SetProductInstanceId(v string) *InitAapReleaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAapReleaseRequest) SetProductDeployInitOptionRequest(v *ProductDeployInitOptionRequest) *InitAapReleaseRequest {
	s.ProductDeployInitOptionRequest = v
	return s
}

func (s *InitAapReleaseRequest) SetSiteCode(v string) *InitAapReleaseRequest {
	s.SiteCode = &v
	return s
}

type InitAapReleaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 初始化的结果，可用此调用发布接口
	DeployInitOptions []*ProductDeployInitOption `json:"deploy_init_options,omitempty" xml:"deploy_init_options,omitempty" type:"Repeated"`
}

func (s InitAapReleaseResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAapReleaseResponse) GoString() string {
	return s.String()
}

func (s *InitAapReleaseResponse) SetReqMsgId(v string) *InitAapReleaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAapReleaseResponse) SetResultCode(v string) *InitAapReleaseResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAapReleaseResponse) SetResultMsg(v string) *InitAapReleaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAapReleaseResponse) SetDeployInitOptions(v []*ProductDeployInitOption) *InitAapReleaseResponse {
	s.DeployInitOptions = v
	return s
}

type DeployAapProductinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 产品部署参数
	ProductDeployInitOptions []*ProductDeployInitOption `json:"product_deploy_init_options,omitempty" xml:"product_deploy_init_options,omitempty" require:"true" type:"Repeated"`
}

func (s DeployAapProductinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeployAapProductinstanceRequest) GoString() string {
	return s.String()
}

func (s *DeployAapProductinstanceRequest) SetAuthToken(v string) *DeployAapProductinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeployAapProductinstanceRequest) SetProductInstanceId(v string) *DeployAapProductinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeployAapProductinstanceRequest) SetSiteCode(v string) *DeployAapProductinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *DeployAapProductinstanceRequest) SetProductDeployInitOptions(v []*ProductDeployInitOption) *DeployAapProductinstanceRequest {
	s.ProductDeployInitOptions = v
	return s
}

type DeployAapProductinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	ReleasePlanId *string `json:"release_plan_id,omitempty" xml:"release_plan_id,omitempty"`
}

func (s DeployAapProductinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeployAapProductinstanceResponse) GoString() string {
	return s.String()
}

func (s *DeployAapProductinstanceResponse) SetReqMsgId(v string) *DeployAapProductinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeployAapProductinstanceResponse) SetResultCode(v string) *DeployAapProductinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeployAapProductinstanceResponse) SetResultMsg(v string) *DeployAapProductinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeployAapProductinstanceResponse) SetReleasePlanId(v string) *DeployAapProductinstanceResponse {
	s.ReleasePlanId = &v
	return s
}

type GetAapReleaseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	ReleasePlanId *string `json:"release_plan_id,omitempty" xml:"release_plan_id,omitempty" require:"true"`
}

func (s GetAapReleaseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAapReleaseRequest) GoString() string {
	return s.String()
}

func (s *GetAapReleaseRequest) SetAuthToken(v string) *GetAapReleaseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAapReleaseRequest) SetProductInstanceId(v string) *GetAapReleaseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAapReleaseRequest) SetReleasePlanId(v string) *GetAapReleaseRequest {
	s.ReleasePlanId = &v
	return s
}

type GetAapReleaseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单状态:
	//     TOBE_DEPLOY("TOBE_DEPLOY","待执行","待执行"),
	//     EXECUTING("EXECUTING","执行中","执行中"),
	//     SUCCESS("SUCCESS","完成","完成"),
	//     CANCELED("CANCELED","已取消","已取消"),
	//     FAILED("FAILED","失败","失败"),
	//     WAITING_CONFIRM("WAITING_CONFIRM","待确认","待确认");
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetAapReleaseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAapReleaseResponse) GoString() string {
	return s.String()
}

func (s *GetAapReleaseResponse) SetReqMsgId(v string) *GetAapReleaseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAapReleaseResponse) SetResultCode(v string) *GetAapReleaseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAapReleaseResponse) SetResultMsg(v string) *GetAapReleaseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAapReleaseResponse) SetStatus(v string) *GetAapReleaseResponse {
	s.Status = &v
	return s
}

type UpdateAapApplicationinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 应用实例
	ApplicationInstance *ApplicationInstance `json:"application_instance,omitempty" xml:"application_instance,omitempty" require:"true"`
}

func (s UpdateAapApplicationinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAapApplicationinstanceRequest) GoString() string {
	return s.String()
}

func (s *UpdateAapApplicationinstanceRequest) SetAuthToken(v string) *UpdateAapApplicationinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAapApplicationinstanceRequest) SetProductInstanceId(v string) *UpdateAapApplicationinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAapApplicationinstanceRequest) SetSiteCode(v string) *UpdateAapApplicationinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *UpdateAapApplicationinstanceRequest) SetApplicationInstance(v *ApplicationInstance) *UpdateAapApplicationinstanceRequest {
	s.ApplicationInstance = v
	return s
}

type UpdateAapApplicationinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateAapApplicationinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAapApplicationinstanceResponse) GoString() string {
	return s.String()
}

func (s *UpdateAapApplicationinstanceResponse) SetReqMsgId(v string) *UpdateAapApplicationinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAapApplicationinstanceResponse) SetResultCode(v string) *UpdateAapApplicationinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAapApplicationinstanceResponse) SetResultMsg(v string) *UpdateAapApplicationinstanceResponse {
	s.ResultMsg = &v
	return s
}

type QueryAapApplicationinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// sitecode
	//
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品实例name
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
	// app name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
}

func (s QueryAapApplicationinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAapApplicationinstanceRequest) GoString() string {
	return s.String()
}

func (s *QueryAapApplicationinstanceRequest) SetAuthToken(v string) *QueryAapApplicationinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetProductInstanceId(v string) *QueryAapApplicationinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetSiteCode(v string) *QueryAapApplicationinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetNamespace(v string) *QueryAapApplicationinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetProdCode(v string) *QueryAapApplicationinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetProductInstanceName(v string) *QueryAapApplicationinstanceRequest {
	s.ProductInstanceName = &v
	return s
}

func (s *QueryAapApplicationinstanceRequest) SetAppName(v string) *QueryAapApplicationinstanceRequest {
	s.AppName = &v
	return s
}

type QueryAapApplicationinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// siteCode
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty"`
	// 应用实例
	ApplicationInstance *ApplicationInstance `json:"application_instance,omitempty" xml:"application_instance,omitempty"`
}

func (s QueryAapApplicationinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAapApplicationinstanceResponse) GoString() string {
	return s.String()
}

func (s *QueryAapApplicationinstanceResponse) SetReqMsgId(v string) *QueryAapApplicationinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAapApplicationinstanceResponse) SetResultCode(v string) *QueryAapApplicationinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAapApplicationinstanceResponse) SetResultMsg(v string) *QueryAapApplicationinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAapApplicationinstanceResponse) SetSiteCode(v string) *QueryAapApplicationinstanceResponse {
	s.SiteCode = &v
	return s
}

func (s *QueryAapApplicationinstanceResponse) SetApplicationInstance(v *ApplicationInstance) *QueryAapApplicationinstanceResponse {
	s.ApplicationInstance = v
	return s
}

type SetAapApplicationinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 规格修改
	ResourceSpec *ResourceSpec `json:"resource_spec,omitempty" xml:"resource_spec,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品实例名称
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
}

func (s SetAapApplicationinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAapApplicationinstanceRequest) GoString() string {
	return s.String()
}

func (s *SetAapApplicationinstanceRequest) SetAuthToken(v string) *SetAapApplicationinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetProductInstanceId(v string) *SetAapApplicationinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetResourceSpec(v *ResourceSpec) *SetAapApplicationinstanceRequest {
	s.ResourceSpec = v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetNamespace(v string) *SetAapApplicationinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetProductInstanceName(v string) *SetAapApplicationinstanceRequest {
	s.ProductInstanceName = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetProdCode(v string) *SetAapApplicationinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetAppCode(v string) *SetAapApplicationinstanceRequest {
	s.AppCode = &v
	return s
}

func (s *SetAapApplicationinstanceRequest) SetSiteCode(v string) *SetAapApplicationinstanceRequest {
	s.SiteCode = &v
	return s
}

type SetAapApplicationinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否修改成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SetAapApplicationinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAapApplicationinstanceResponse) GoString() string {
	return s.String()
}

func (s *SetAapApplicationinstanceResponse) SetReqMsgId(v string) *SetAapApplicationinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAapApplicationinstanceResponse) SetResultCode(v string) *SetAapApplicationinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAapApplicationinstanceResponse) SetResultMsg(v string) *SetAapApplicationinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetAapApplicationinstanceResponse) SetSuccess(v bool) *SetAapApplicationinstanceResponse {
	s.Success = &v
	return s
}

type SetAapImagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用镜像，默认使用amd64
	Images *ApplicationImage `json:"images,omitempty" xml:"images,omitempty" require:"true"`
	// namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// siteCode
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品实例名称
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
	// 应用code
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
}

func (s SetAapImagesRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAapImagesRequest) GoString() string {
	return s.String()
}

func (s *SetAapImagesRequest) SetAuthToken(v string) *SetAapImagesRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAapImagesRequest) SetProductInstanceId(v string) *SetAapImagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAapImagesRequest) SetImages(v *ApplicationImage) *SetAapImagesRequest {
	s.Images = v
	return s
}

func (s *SetAapImagesRequest) SetNamespace(v string) *SetAapImagesRequest {
	s.Namespace = &v
	return s
}

func (s *SetAapImagesRequest) SetSiteCode(v string) *SetAapImagesRequest {
	s.SiteCode = &v
	return s
}

func (s *SetAapImagesRequest) SetProdCode(v string) *SetAapImagesRequest {
	s.ProdCode = &v
	return s
}

func (s *SetAapImagesRequest) SetProductInstanceName(v string) *SetAapImagesRequest {
	s.ProductInstanceName = &v
	return s
}

func (s *SetAapImagesRequest) SetAppCode(v string) *SetAapImagesRequest {
	s.AppCode = &v
	return s
}

type SetAapImagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否修改成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SetAapImagesResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAapImagesResponse) GoString() string {
	return s.String()
}

func (s *SetAapImagesResponse) SetReqMsgId(v string) *SetAapImagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAapImagesResponse) SetResultCode(v string) *SetAapImagesResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAapImagesResponse) SetResultMsg(v string) *SetAapImagesResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetAapImagesResponse) SetSuccess(v bool) *SetAapImagesResponse {
	s.Success = &v
	return s
}

type QueryAapProductinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// site_code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// name space
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品实例name
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
}

func (s QueryAapProductinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAapProductinstanceRequest) GoString() string {
	return s.String()
}

func (s *QueryAapProductinstanceRequest) SetAuthToken(v string) *QueryAapProductinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAapProductinstanceRequest) SetProductInstanceId(v string) *QueryAapProductinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAapProductinstanceRequest) SetSiteCode(v string) *QueryAapProductinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *QueryAapProductinstanceRequest) SetNamespace(v string) *QueryAapProductinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *QueryAapProductinstanceRequest) SetProdCode(v string) *QueryAapProductinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *QueryAapProductinstanceRequest) SetProductInstanceName(v string) *QueryAapProductinstanceRequest {
	s.ProductInstanceName = &v
	return s
}

type QueryAapProductinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty"`
	// prod code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 产品实例名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 产品版本
	ProdVersion *string `json:"prod_version,omitempty" xml:"prod_version,omitempty"`
	// 拓扑code
	TopologyCode *string `json:"topology_code,omitempty" xml:"topology_code,omitempty"`
	// 拓扑名称
	TopologyName *string `json:"topology_name,omitempty" xml:"topology_name,omitempty"`
	// 产品实例状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 应用实例列表
	AppInstances []*ApplicationMeta `json:"app_instances,omitempty" xml:"app_instances,omitempty" type:"Repeated"`
}

func (s QueryAapProductinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAapProductinstanceResponse) GoString() string {
	return s.String()
}

func (s *QueryAapProductinstanceResponse) SetReqMsgId(v string) *QueryAapProductinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetResultCode(v string) *QueryAapProductinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetResultMsg(v string) *QueryAapProductinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetNamespace(v string) *QueryAapProductinstanceResponse {
	s.Namespace = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetProdCode(v string) *QueryAapProductinstanceResponse {
	s.ProdCode = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetName(v string) *QueryAapProductinstanceResponse {
	s.Name = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetProdVersion(v string) *QueryAapProductinstanceResponse {
	s.ProdVersion = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetTopologyCode(v string) *QueryAapProductinstanceResponse {
	s.TopologyCode = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetTopologyName(v string) *QueryAapProductinstanceResponse {
	s.TopologyName = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetStatus(v string) *QueryAapProductinstanceResponse {
	s.Status = &v
	return s
}

func (s *QueryAapProductinstanceResponse) SetAppInstances(v []*ApplicationMeta) *QueryAapProductinstanceResponse {
	s.AppInstances = v
	return s
}

type DetailAapApplicationinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// site code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// prod code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品实例名称
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
	// 应用code
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
}

func (s DetailAapApplicationinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailAapApplicationinstanceRequest) GoString() string {
	return s.String()
}

func (s *DetailAapApplicationinstanceRequest) SetAuthToken(v string) *DetailAapApplicationinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetProductInstanceId(v string) *DetailAapApplicationinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetSiteCode(v string) *DetailAapApplicationinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetNamespace(v string) *DetailAapApplicationinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetProdCode(v string) *DetailAapApplicationinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetProductInstanceName(v string) *DetailAapApplicationinstanceRequest {
	s.ProductInstanceName = &v
	return s
}

func (s *DetailAapApplicationinstanceRequest) SetAppCode(v string) *DetailAapApplicationinstanceRequest {
	s.AppCode = &v
	return s
}

type DetailAapApplicationinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 镜像
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
	// 副本数
	Replicas *int64 `json:"replicas,omitempty" xml:"replicas,omitempty"`
	// 容器详情
	PodInstances []*ContainerInstance `json:"pod_instances,omitempty" xml:"pod_instances,omitempty" type:"Repeated"`
	// 应用版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s DetailAapApplicationinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailAapApplicationinstanceResponse) GoString() string {
	return s.String()
}

func (s *DetailAapApplicationinstanceResponse) SetReqMsgId(v string) *DetailAapApplicationinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetResultCode(v string) *DetailAapApplicationinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetResultMsg(v string) *DetailAapApplicationinstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetName(v string) *DetailAapApplicationinstanceResponse {
	s.Name = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetImage(v string) *DetailAapApplicationinstanceResponse {
	s.Image = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetReplicas(v int64) *DetailAapApplicationinstanceResponse {
	s.Replicas = &v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetPodInstances(v []*ContainerInstance) *DetailAapApplicationinstanceResponse {
	s.PodInstances = v
	return s
}

func (s *DetailAapApplicationinstanceResponse) SetVersion(v string) *DetailAapApplicationinstanceResponse {
	s.Version = &v
	return s
}

type SetAapParametersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// site code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// namespace
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// prod code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// product_instance_name
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
	// 应用code
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 更新的应用参数
	AppEnvs []*AppEnv `json:"app_envs,omitempty" xml:"app_envs,omitempty" require:"true" type:"Repeated"`
}

func (s SetAapParametersRequest) String() string {
	return tea.Prettify(s)
}

func (s SetAapParametersRequest) GoString() string {
	return s.String()
}

func (s *SetAapParametersRequest) SetAuthToken(v string) *SetAapParametersRequest {
	s.AuthToken = &v
	return s
}

func (s *SetAapParametersRequest) SetProductInstanceId(v string) *SetAapParametersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetAapParametersRequest) SetSiteCode(v string) *SetAapParametersRequest {
	s.SiteCode = &v
	return s
}

func (s *SetAapParametersRequest) SetNamespace(v string) *SetAapParametersRequest {
	s.Namespace = &v
	return s
}

func (s *SetAapParametersRequest) SetProdCode(v string) *SetAapParametersRequest {
	s.ProdCode = &v
	return s
}

func (s *SetAapParametersRequest) SetProductInstanceName(v string) *SetAapParametersRequest {
	s.ProductInstanceName = &v
	return s
}

func (s *SetAapParametersRequest) SetAppCode(v string) *SetAapParametersRequest {
	s.AppCode = &v
	return s
}

func (s *SetAapParametersRequest) SetAppEnvs(v []*AppEnv) *SetAapParametersRequest {
	s.AppEnvs = v
	return s
}

type SetAapParametersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SetAapParametersResponse) String() string {
	return tea.Prettify(s)
}

func (s SetAapParametersResponse) GoString() string {
	return s.String()
}

func (s *SetAapParametersResponse) SetReqMsgId(v string) *SetAapParametersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetAapParametersResponse) SetResultCode(v string) *SetAapParametersResponse {
	s.ResultCode = &v
	return s
}

func (s *SetAapParametersResponse) SetResultMsg(v string) *SetAapParametersResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetAapParametersResponse) SetSuccess(v bool) *SetAapParametersResponse {
	s.Success = &v
	return s
}

type DeleteAapProductinstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 站点code
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty" require:"true"`
	// 产品实例所属命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 产品实例code
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 产品实例名称
	ProductInstanceName *string `json:"product_instance_name,omitempty" xml:"product_instance_name,omitempty" require:"true"`
}

func (s DeleteAapProductinstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAapProductinstanceRequest) GoString() string {
	return s.String()
}

func (s *DeleteAapProductinstanceRequest) SetAuthToken(v string) *DeleteAapProductinstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAapProductinstanceRequest) SetProductInstanceId(v string) *DeleteAapProductinstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAapProductinstanceRequest) SetSiteCode(v string) *DeleteAapProductinstanceRequest {
	s.SiteCode = &v
	return s
}

func (s *DeleteAapProductinstanceRequest) SetNamespace(v string) *DeleteAapProductinstanceRequest {
	s.Namespace = &v
	return s
}

func (s *DeleteAapProductinstanceRequest) SetProdCode(v string) *DeleteAapProductinstanceRequest {
	s.ProdCode = &v
	return s
}

func (s *DeleteAapProductinstanceRequest) SetProductInstanceName(v string) *DeleteAapProductinstanceRequest {
	s.ProductInstanceName = &v
	return s
}

type DeleteAapProductinstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAapProductinstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAapProductinstanceResponse) GoString() string {
	return s.String()
}

func (s *DeleteAapProductinstanceResponse) SetReqMsgId(v string) *DeleteAapProductinstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAapProductinstanceResponse) SetResultCode(v string) *DeleteAapProductinstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAapProductinstanceResponse) SetResultMsg(v string) *DeleteAapProductinstanceResponse {
	s.ResultMsg = &v
	return s
}

type CreateEnvRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境初始化参数配置
	EnvConfigInfo *string `json:"env_config_info,omitempty" xml:"env_config_info,omitempty" require:"true"`
}

func (s CreateEnvRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateEnvRequest) GoString() string {
	return s.String()
}

func (s *CreateEnvRequest) SetAuthToken(v string) *CreateEnvRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateEnvRequest) SetProductInstanceId(v string) *CreateEnvRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateEnvRequest) SetEnvConfigInfo(v string) *CreateEnvRequest {
	s.EnvConfigInfo = &v
	return s
}

type CreateEnvResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 环境ID
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
}

func (s CreateEnvResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateEnvResponse) GoString() string {
	return s.String()
}

func (s *CreateEnvResponse) SetReqMsgId(v string) *CreateEnvResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateEnvResponse) SetResultCode(v string) *CreateEnvResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateEnvResponse) SetResultMsg(v string) *CreateEnvResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateEnvResponse) SetEnvId(v string) *CreateEnvResponse {
	s.EnvId = &v
	return s
}

type AllEnvsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s AllEnvsRequest) String() string {
	return tea.Prettify(s)
}

func (s AllEnvsRequest) GoString() string {
	return s.String()
}

func (s *AllEnvsRequest) SetAuthToken(v string) *AllEnvsRequest {
	s.AuthToken = &v
	return s
}

func (s *AllEnvsRequest) SetProductInstanceId(v string) *AllEnvsRequest {
	s.ProductInstanceId = &v
	return s
}

type AllEnvsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 环境基本信息列表
	Envs []*EnvInfo `json:"envs,omitempty" xml:"envs,omitempty" type:"Repeated"`
}

func (s AllEnvsResponse) String() string {
	return tea.Prettify(s)
}

func (s AllEnvsResponse) GoString() string {
	return s.String()
}

func (s *AllEnvsResponse) SetReqMsgId(v string) *AllEnvsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllEnvsResponse) SetResultCode(v string) *AllEnvsResponse {
	s.ResultCode = &v
	return s
}

func (s *AllEnvsResponse) SetResultMsg(v string) *AllEnvsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllEnvsResponse) SetEnvs(v []*EnvInfo) *AllEnvsResponse {
	s.Envs = v
	return s
}

type PagequeryProdsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s PagequeryProdsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryProdsRequest) SetAuthToken(v string) *PagequeryProdsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryProdsRequest) SetProductInstanceId(v string) *PagequeryProdsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryProdsRequest) SetEnvId(v string) *PagequeryProdsRequest {
	s.EnvId = &v
	return s
}

type PagequeryProdsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品基线元信息
	ProdMetaInfos []*ProdMetaInfo `json:"prod_meta_infos,omitempty" xml:"prod_meta_infos,omitempty" type:"Repeated"`
	// 1
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPages *int64 `json:"total_pages,omitempty" xml:"total_pages,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s PagequeryProdsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryProdsResponse) SetReqMsgId(v string) *PagequeryProdsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryProdsResponse) SetResultCode(v string) *PagequeryProdsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryProdsResponse) SetResultMsg(v string) *PagequeryProdsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryProdsResponse) SetProdMetaInfos(v []*ProdMetaInfo) *PagequeryProdsResponse {
	s.ProdMetaInfos = v
	return s
}

func (s *PagequeryProdsResponse) SetCurrentPage(v int64) *PagequeryProdsResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryProdsResponse) SetPageSize(v int64) *PagequeryProdsResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryProdsResponse) SetTotalPages(v int64) *PagequeryProdsResponse {
	s.TotalPages = &v
	return s
}

func (s *PagequeryProdsResponse) SetTotalCount(v int64) *PagequeryProdsResponse {
	s.TotalCount = &v
	return s
}

type PagequeryProdsResourcesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 资源类型：LB、SERVER、RDB
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty" require:"true"`
}

func (s PagequeryProdsResourcesRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsResourcesRequest) GoString() string {
	return s.String()
}

func (s *PagequeryProdsResourcesRequest) SetAuthToken(v string) *PagequeryProdsResourcesRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryProdsResourcesRequest) SetProductInstanceId(v string) *PagequeryProdsResourcesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryProdsResourcesRequest) SetEnvId(v string) *PagequeryProdsResourcesRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryProdsResourcesRequest) SetProdCode(v string) *PagequeryProdsResourcesRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryProdsResourcesRequest) SetResourceType(v string) *PagequeryProdsResourcesRequest {
	s.ResourceType = &v
	return s
}

type PagequeryProdsResourcesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 资源基线实例信息列表
	Data []*ResourceInstance `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryProdsResourcesResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsResourcesResponse) GoString() string {
	return s.String()
}

func (s *PagequeryProdsResourcesResponse) SetReqMsgId(v string) *PagequeryProdsResourcesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetResultCode(v string) *PagequeryProdsResourcesResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetResultMsg(v string) *PagequeryProdsResourcesResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetCurrentPage(v int64) *PagequeryProdsResourcesResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetPageSize(v int64) *PagequeryProdsResourcesResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetTotalCount(v int64) *PagequeryProdsResourcesResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetTotalPage(v int64) *PagequeryProdsResourcesResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryProdsResourcesResponse) SetData(v []*ResourceInstance) *PagequeryProdsResourcesResponse {
	s.Data = v
	return s
}

type PagequeryResourceinstancesContainersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty"`
	// 部署单元实例标识id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty"`
}

func (s PagequeryResourceinstancesContainersRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryResourceinstancesContainersRequest) GoString() string {
	return s.String()
}

func (s *PagequeryResourceinstancesContainersRequest) SetAuthToken(v string) *PagequeryResourceinstancesContainersRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetProductInstanceId(v string) *PagequeryResourceinstancesContainersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetEnvId(v string) *PagequeryResourceinstancesContainersRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetProdCode(v string) *PagequeryResourceinstancesContainersRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetAppName(v string) *PagequeryResourceinstancesContainersRequest {
	s.AppName = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetDeploymentUnitIdentity(v string) *PagequeryResourceinstancesContainersRequest {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *PagequeryResourceinstancesContainersRequest) SetDeploymentUnitInstanceIdentity(v string) *PagequeryResourceinstancesContainersRequest {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

type PagequeryResourceinstancesContainersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 容器基线信息
	Data []*ContainerInstance `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryResourceinstancesContainersResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryResourceinstancesContainersResponse) GoString() string {
	return s.String()
}

func (s *PagequeryResourceinstancesContainersResponse) SetReqMsgId(v string) *PagequeryResourceinstancesContainersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetResultCode(v string) *PagequeryResourceinstancesContainersResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetResultMsg(v string) *PagequeryResourceinstancesContainersResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetCurrentPage(v int64) *PagequeryResourceinstancesContainersResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetPageSize(v int64) *PagequeryResourceinstancesContainersResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetTotalPage(v int64) *PagequeryResourceinstancesContainersResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetTotalCount(v int64) *PagequeryResourceinstancesContainersResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryResourceinstancesContainersResponse) SetData(v []*ContainerInstance) *PagequeryResourceinstancesContainersResponse {
	s.Data = v
	return s
}

type PagequeryProdsAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty"`
}

func (s PagequeryProdsAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsAppsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryProdsAppsRequest) SetAuthToken(v string) *PagequeryProdsAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryProdsAppsRequest) SetProductInstanceId(v string) *PagequeryProdsAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryProdsAppsRequest) SetEnvId(v string) *PagequeryProdsAppsRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryProdsAppsRequest) SetProdCode(v string) *PagequeryProdsAppsRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryProdsAppsRequest) SetDeploymentUnitIdentity(v string) *PagequeryProdsAppsRequest {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *PagequeryProdsAppsRequest) SetDeploymentUnitInstanceIdentity(v string) *PagequeryProdsAppsRequest {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

type PagequeryProdsAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页面id
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 应用基线总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 应用基线
	Data []*AppInstance `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s PagequeryProdsAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryProdsAppsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryProdsAppsResponse) SetReqMsgId(v string) *PagequeryProdsAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetResultCode(v string) *PagequeryProdsAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetResultMsg(v string) *PagequeryProdsAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetCurrentPage(v int64) *PagequeryProdsAppsResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetPageSize(v int64) *PagequeryProdsAppsResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetTotalCount(v int64) *PagequeryProdsAppsResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetTotalPage(v int64) *PagequeryProdsAppsResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryProdsAppsResponse) SetData(v []*AppInstance) *PagequeryProdsAppsResponse {
	s.Data = v
	return s
}

type QueryProdsDeploymentunitsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
}

func (s QueryProdsDeploymentunitsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProdsDeploymentunitsRequest) GoString() string {
	return s.String()
}

func (s *QueryProdsDeploymentunitsRequest) SetAuthToken(v string) *QueryProdsDeploymentunitsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProdsDeploymentunitsRequest) SetProductInstanceId(v string) *QueryProdsDeploymentunitsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProdsDeploymentunitsRequest) SetEnvId(v string) *QueryProdsDeploymentunitsRequest {
	s.EnvId = &v
	return s
}

func (s *QueryProdsDeploymentunitsRequest) SetProdCode(v string) *QueryProdsDeploymentunitsRequest {
	s.ProdCode = &v
	return s
}

type QueryProdsDeploymentunitsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品部署单元实例信息
	Data []*DeploymentUnitInstance `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryProdsDeploymentunitsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProdsDeploymentunitsResponse) GoString() string {
	return s.String()
}

func (s *QueryProdsDeploymentunitsResponse) SetReqMsgId(v string) *QueryProdsDeploymentunitsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProdsDeploymentunitsResponse) SetResultCode(v string) *QueryProdsDeploymentunitsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProdsDeploymentunitsResponse) SetResultMsg(v string) *QueryProdsDeploymentunitsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProdsDeploymentunitsResponse) SetData(v []*DeploymentUnitInstance) *QueryProdsDeploymentunitsResponse {
	s.Data = v
	return s
}

type PagequeryResourceinstancesLbsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty"`
}

func (s PagequeryResourceinstancesLbsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryResourceinstancesLbsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryResourceinstancesLbsRequest) SetAuthToken(v string) *PagequeryResourceinstancesLbsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetProductInstanceId(v string) *PagequeryResourceinstancesLbsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetEnvId(v string) *PagequeryResourceinstancesLbsRequest {
	s.EnvId = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetProdCode(v string) *PagequeryResourceinstancesLbsRequest {
	s.ProdCode = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetAppName(v string) *PagequeryResourceinstancesLbsRequest {
	s.AppName = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetDeploymentUnitIdentity(v string) *PagequeryResourceinstancesLbsRequest {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *PagequeryResourceinstancesLbsRequest) SetDeploymentUnitInstanceIdentity(v string) *PagequeryResourceinstancesLbsRequest {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

type PagequeryResourceinstancesLbsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页面index
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 产品应用所属的lb实例
	LbInstances []*LbInstance `json:"lb_instances,omitempty" xml:"lb_instances,omitempty" type:"Repeated"`
}

func (s PagequeryResourceinstancesLbsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryResourceinstancesLbsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryResourceinstancesLbsResponse) SetReqMsgId(v string) *PagequeryResourceinstancesLbsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetResultCode(v string) *PagequeryResourceinstancesLbsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetResultMsg(v string) *PagequeryResourceinstancesLbsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetCurrentPage(v int64) *PagequeryResourceinstancesLbsResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetPageSize(v int64) *PagequeryResourceinstancesLbsResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetTotalCount(v int64) *PagequeryResourceinstancesLbsResponse {
	s.TotalCount = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetTotalPage(v int64) *PagequeryResourceinstancesLbsResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryResourceinstancesLbsResponse) SetLbInstances(v []*LbInstance) *PagequeryResourceinstancesLbsResponse {
	s.LbInstances = v
	return s
}

type CreateProdsAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty" require:"true"`
	// 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启
	//
	OpsAction *string `json:"ops_action,omitempty" xml:"ops_action,omitempty" require:"true"`
	// 容器名称列表
	//
	ContainerNames []*string `json:"container_names,omitempty" xml:"container_names,omitempty" require:"true" type:"Repeated"`
	// 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
	GroupStrategy *string `json:"group_strategy,omitempty" xml:"group_strategy,omitempty" require:"true"`
}

func (s CreateProdsAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProdsAppopsRequest) GoString() string {
	return s.String()
}

func (s *CreateProdsAppopsRequest) SetAuthToken(v string) *CreateProdsAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetProductInstanceId(v string) *CreateProdsAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetEnvId(v string) *CreateProdsAppopsRequest {
	s.EnvId = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetProdCode(v string) *CreateProdsAppopsRequest {
	s.ProdCode = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetAppName(v string) *CreateProdsAppopsRequest {
	s.AppName = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetDeploymentUnitIdentity(v string) *CreateProdsAppopsRequest {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetDeploymentUnitInstanceIdentity(v string) *CreateProdsAppopsRequest {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetOpsAction(v string) *CreateProdsAppopsRequest {
	s.OpsAction = &v
	return s
}

func (s *CreateProdsAppopsRequest) SetContainerNames(v []*string) *CreateProdsAppopsRequest {
	s.ContainerNames = v
	return s
}

func (s *CreateProdsAppopsRequest) SetGroupStrategy(v string) *CreateProdsAppopsRequest {
	s.GroupStrategy = &v
	return s
}

type CreateProdsAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s CreateProdsAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProdsAppopsResponse) GoString() string {
	return s.String()
}

func (s *CreateProdsAppopsResponse) SetReqMsgId(v string) *CreateProdsAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProdsAppopsResponse) SetResultCode(v string) *CreateProdsAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProdsAppopsResponse) SetResultMsg(v string) *CreateProdsAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateProdsAppopsResponse) SetOpsPlanId(v string) *CreateProdsAppopsResponse {
	s.OpsPlanId = &v
	return s
}

type GetProdsAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s GetProdsAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetProdsAppopsRequest) GoString() string {
	return s.String()
}

func (s *GetProdsAppopsRequest) SetAuthToken(v string) *GetProdsAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetProdsAppopsRequest) SetProductInstanceId(v string) *GetProdsAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetProdsAppopsRequest) SetOpsPlanId(v string) *GetProdsAppopsRequest {
	s.OpsPlanId = &v
	return s
}

type GetProdsAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 失败节点详情
	//
	FailedNodes []*NodeExecutionLog `json:"failed_nodes,omitempty" xml:"failed_nodes,omitempty" type:"Repeated"`
}

func (s GetProdsAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetProdsAppopsResponse) GoString() string {
	return s.String()
}

func (s *GetProdsAppopsResponse) SetReqMsgId(v string) *GetProdsAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetProdsAppopsResponse) SetResultCode(v string) *GetProdsAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetProdsAppopsResponse) SetResultMsg(v string) *GetProdsAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetProdsAppopsResponse) SetStatus(v string) *GetProdsAppopsResponse {
	s.Status = &v
	return s
}

func (s *GetProdsAppopsResponse) SetFailedNodes(v []*NodeExecutionLog) *GetProdsAppopsResponse {
	s.FailedNodes = v
	return s
}

type CancelProdsAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s CancelProdsAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelProdsAppopsRequest) GoString() string {
	return s.String()
}

func (s *CancelProdsAppopsRequest) SetAuthToken(v string) *CancelProdsAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelProdsAppopsRequest) SetProductInstanceId(v string) *CancelProdsAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelProdsAppopsRequest) SetOpsPlanId(v string) *CancelProdsAppopsRequest {
	s.OpsPlanId = &v
	return s
}

type CancelProdsAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否操作成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CancelProdsAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelProdsAppopsResponse) GoString() string {
	return s.String()
}

func (s *CancelProdsAppopsResponse) SetReqMsgId(v string) *CancelProdsAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelProdsAppopsResponse) SetResultCode(v string) *CancelProdsAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelProdsAppopsResponse) SetResultMsg(v string) *CancelProdsAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelProdsAppopsResponse) SetSuccess(v bool) *CancelProdsAppopsResponse {
	s.Success = &v
	return s
}

type RetryProdsAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发布单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty" require:"true"`
}

func (s RetryProdsAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryProdsAppopsRequest) GoString() string {
	return s.String()
}

func (s *RetryProdsAppopsRequest) SetAuthToken(v string) *RetryProdsAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryProdsAppopsRequest) SetProductInstanceId(v string) *RetryProdsAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryProdsAppopsRequest) SetOpsPlanId(v string) *RetryProdsAppopsRequest {
	s.OpsPlanId = &v
	return s
}

type RetryProdsAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s RetryProdsAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryProdsAppopsResponse) GoString() string {
	return s.String()
}

func (s *RetryProdsAppopsResponse) SetReqMsgId(v string) *RetryProdsAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryProdsAppopsResponse) SetResultCode(v string) *RetryProdsAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryProdsAppopsResponse) SetResultMsg(v string) *RetryProdsAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *RetryProdsAppopsResponse) SetSuccess(v bool) *RetryProdsAppopsResponse {
	s.Success = &v
	return s
}

type ScaleinProdsAppopsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 部署单元标识id
	DeploymentUnitIdentity *string `json:"deployment_unit_identity,omitempty" xml:"deployment_unit_identity,omitempty" require:"true"`
	// 部署单元实例id
	DeploymentUnitInstanceIdentity *string `json:"deployment_unit_instance_identity,omitempty" xml:"deployment_unit_instance_identity,omitempty" require:"true"`
	// 应用期望副本数
	ExpectReplica *int64 `json:"expect_replica,omitempty" xml:"expect_replica,omitempty" require:"true"`
}

func (s ScaleinProdsAppopsRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleinProdsAppopsRequest) GoString() string {
	return s.String()
}

func (s *ScaleinProdsAppopsRequest) SetAuthToken(v string) *ScaleinProdsAppopsRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetProductInstanceId(v string) *ScaleinProdsAppopsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetEnvId(v string) *ScaleinProdsAppopsRequest {
	s.EnvId = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetProdCode(v string) *ScaleinProdsAppopsRequest {
	s.ProdCode = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetAppName(v string) *ScaleinProdsAppopsRequest {
	s.AppName = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetDeploymentUnitIdentity(v string) *ScaleinProdsAppopsRequest {
	s.DeploymentUnitIdentity = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetDeploymentUnitInstanceIdentity(v string) *ScaleinProdsAppopsRequest {
	s.DeploymentUnitInstanceIdentity = &v
	return s
}

func (s *ScaleinProdsAppopsRequest) SetExpectReplica(v int64) *ScaleinProdsAppopsRequest {
	s.ExpectReplica = &v
	return s
}

type ScaleinProdsAppopsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 运维单id
	OpsPlanId *string `json:"ops_plan_id,omitempty" xml:"ops_plan_id,omitempty"`
}

func (s ScaleinProdsAppopsResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleinProdsAppopsResponse) GoString() string {
	return s.String()
}

func (s *ScaleinProdsAppopsResponse) SetReqMsgId(v string) *ScaleinProdsAppopsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleinProdsAppopsResponse) SetResultCode(v string) *ScaleinProdsAppopsResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleinProdsAppopsResponse) SetResultMsg(v string) *ScaleinProdsAppopsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleinProdsAppopsResponse) SetOpsPlanId(v string) *ScaleinProdsAppopsResponse {
	s.OpsPlanId = &v
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
				"sdk_version":      tea.String("4.0.6"),
				"_prod_code":       tea.String("YUNQING"),
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
 * Description: 创建一个运维单。
 * Summary: 创建一个运维单。
 */
func (client *Client) CreateAppops(request *CreateAppopsRequest) (_result *CreateAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppopsResponse{}
	_body, _err := client.CreateAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建一个运维单。
 * Summary: 创建一个运维单。
 */
func (client *Client) CreateAppopsEx(request *CreateAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appops.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询一个运维单详情。
 * Summary: 查询一个运维单详情。
 */
func (client *Client) GetAppops(request *GetAppopsRequest) (_result *GetAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAppopsResponse{}
	_body, _err := client.GetAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询一个运维单详情。
 * Summary: 查询一个运维单详情。
 */
func (client *Client) GetAppopsEx(request *GetAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appops.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
 * Summary: 重试一个运维单。
 */
func (client *Client) RetryAppops(request *RetryAppopsRequest) (_result *RetryAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryAppopsResponse{}
	_body, _err := client.RetryAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
 * Summary: 重试一个运维单。
 */
func (client *Client) RetryAppopsEx(request *RetryAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appops.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消一个发布单。
 * Summary: 取消一个发布单。
 */
func (client *Client) CancelAppops(request *CancelAppopsRequest) (_result *CancelAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAppopsResponse{}
	_body, _err := client.CancelAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消一个发布单。
 * Summary: 取消一个发布单。
 */
func (client *Client) CancelAppopsEx(request *CancelAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appops.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 变更应用服务实例集群大小。
 * Summary: 已废弃，勿用！！！
 */
func (client *Client) ScaleProdinstanceAppservice(request *ScaleProdinstanceAppserviceRequest) (_result *ScaleProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleProdinstanceAppserviceResponse{}
	_body, _err := client.ScaleProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 变更应用服务实例集群大小。
 * Summary: 已废弃，勿用！！！
 */
func (client *Client) ScaleProdinstanceAppserviceEx(request *ScaleProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.scale"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取环境列表。
 * Summary: 获取环境列表。
 */
func (client *Client) ListEnv(request *ListEnvRequest) (_result *ListEnvResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListEnvResponse{}
	_body, _err := client.ListEnvEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取环境列表。
 * Summary: 获取环境列表。
 */
func (client *Client) ListEnvEx(request *ListEnvRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListEnvResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListEnvResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.env.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取应用服务实例详情信息。
 * Summary: 获取应用服务实例详情信息。
 */
func (client *Client) GetProdinstanceAppservice(request *GetProdinstanceAppserviceRequest) (_result *GetProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetProdinstanceAppserviceResponse{}
	_body, _err := client.GetProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取应用服务实例详情信息。
 * Summary: 获取应用服务实例详情信息。
 */
func (client *Client) GetProdinstanceAppserviceEx(request *GetProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品实例。
 * Summary: 查询产品实例。
 */
func (client *Client) QueryProdinstance(request *QueryProdinstanceRequest) (_result *QueryProdinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProdinstanceResponse{}
	_body, _err := client.QueryProdinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品实例。
 * Summary: 查询产品实例。
 */
func (client *Client) QueryProdinstanceEx(request *QueryProdinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProdinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProdinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 卸载基线产品实例
 * Summary: 卸载基线产品实例
 */
func (client *Client) UninstallProdinstanceAppservice(request *UninstallProdinstanceAppserviceRequest) (_result *UninstallProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UninstallProdinstanceAppserviceResponse{}
	_body, _err := client.UninstallProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 卸载基线产品实例
 * Summary: 卸载基线产品实例
 */
func (client *Client) UninstallProdinstanceAppserviceEx(request *UninstallProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UninstallProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UninstallProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.uninstall"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建部署单元实例
 * Summary: 创建部署单元实例
 */
func (client *Client) CreateProdinstanceDeployunit(request *CreateProdinstanceDeployunitRequest) (_result *CreateProdinstanceDeployunitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProdinstanceDeployunitResponse{}
	_body, _err := client.CreateProdinstanceDeployunitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建部署单元实例
 * Summary: 创建部署单元实例
 */
func (client *Client) CreateProdinstanceDeployunitEx(request *CreateProdinstanceDeployunitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProdinstanceDeployunitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProdinstanceDeployunitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.deployunit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询部署单元实例创建状态
 * Summary: 废弃，勿用！！！
 */
func (client *Client) QueryUnitinstanceCreation(request *QueryUnitinstanceCreationRequest) (_result *QueryUnitinstanceCreationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUnitinstanceCreationResponse{}
	_body, _err := client.QueryUnitinstanceCreationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询部署单元实例创建状态
 * Summary: 废弃，勿用！！！
 */
func (client *Client) QueryUnitinstanceCreationEx(request *QueryUnitinstanceCreationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUnitinstanceCreationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUnitinstanceCreationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.unitinstance.creation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取部署单元详情
 * Summary: 废弃，勿用！！！
 */
func (client *Client) GetUnitDetail(request *GetUnitDetailRequest) (_result *GetUnitDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetUnitDetailResponse{}
	_body, _err := client.GetUnitDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取部署单元详情
 * Summary: 废弃，勿用！！！
 */
func (client *Client) GetUnitDetailEx(request *GetUnitDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetUnitDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetUnitDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.unit.detail.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询应用服务实例信息。
 * Summary: 查询应用服务实例信息。
 */
func (client *Client) QueryProdinstanceAppservice(request *QueryProdinstanceAppserviceRequest) (_result *QueryProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProdinstanceAppserviceResponse{}
	_body, _err := client.QueryProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询应用服务实例信息。
 * Summary: 查询应用服务实例信息。
 */
func (client *Client) QueryProdinstanceAppserviceEx(request *QueryProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单元实例信息
 * Summary: 获取单元实例信息
 */
func (client *Client) GetProdinstanceDeployunit(request *GetProdinstanceDeployunitRequest) (_result *GetProdinstanceDeployunitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetProdinstanceDeployunitResponse{}
	_body, _err := client.GetProdinstanceDeployunitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单元实例信息
 * Summary: 获取单元实例信息
 */
func (client *Client) GetProdinstanceDeployunitEx(request *GetProdinstanceDeployunitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetProdinstanceDeployunitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetProdinstanceDeployunitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.deployunit.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取产品实例下的部署单元列表。
 * Summary: 获取产品实例下的部署单元列表
 */
func (client *Client) ListProdinstanceDeployunit(request *ListProdinstanceDeployunitRequest) (_result *ListProdinstanceDeployunitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListProdinstanceDeployunitResponse{}
	_body, _err := client.ListProdinstanceDeployunitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取产品实例下的部署单元列表。
 * Summary: 获取产品实例下的部署单元列表
 */
func (client *Client) ListProdinstanceDeployunitEx(request *ListProdinstanceDeployunitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListProdinstanceDeployunitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListProdinstanceDeployunitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.deployunit.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 指定应用服务扩容。
 * Summary: 指定应用服务扩容。
 */
func (client *Client) ScaleoutProdinstanceAppservice(request *ScaleoutProdinstanceAppserviceRequest) (_result *ScaleoutProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleoutProdinstanceAppserviceResponse{}
	_body, _err := client.ScaleoutProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 指定应用服务扩容。
 * Summary: 指定应用服务扩容。
 */
func (client *Client) ScaleoutProdinstanceAppserviceEx(request *ScaleoutProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleoutProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleoutProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.scaleout"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户授权信息
 * Summary: 查询用户授权信息
 */
func (client *Client) QueryAuth(request *QueryAuthRequest) (_result *QueryAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAuthResponse{}
	_body, _err := client.QueryAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户授权信息
 * Summary: 查询用户授权信息
 */
func (client *Client) QueryAuthEx(request *QueryAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.auth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入用户授权
 * Summary: 导入用户授权
 */
func (client *Client) ImportAuth(request *ImportAuthRequest) (_result *ImportAuthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAuthResponse{}
	_body, _err := client.ImportAuthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入用户授权
 * Summary: 导入用户授权
 */
func (client *Client) ImportAuthEx(request *ImportAuthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAuthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAuthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.auth.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 系统信息
 * Summary: 获取Local系统信息
 */
func (client *Client) GetSystem(request *GetSystemRequest) (_result *GetSystemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSystemResponse{}
	_body, _err := client.GetSystemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 系统信息
 * Summary: 获取Local系统信息
 */
func (client *Client) GetSystemEx(request *GetSystemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSystemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSystemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.system.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用服务缩容。
 * Summary: 应用服务缩容。
 */
func (client *Client) ScaleinProdinstanceAppservice(request *ScaleinProdinstanceAppserviceRequest) (_result *ScaleinProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleinProdinstanceAppserviceResponse{}
	_body, _err := client.ScaleinProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用服务缩容。
 * Summary: 应用服务缩容。
 */
func (client *Client) ScaleinProdinstanceAppserviceEx(request *ScaleinProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleinProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleinProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.scalein"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
 * Summary: 查询一个环境内的全部应用服务实例信息。
 */
func (client *Client) AllProdinstanceAppservice(request *AllProdinstanceAppserviceRequest) (_result *AllProdinstanceAppserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllProdinstanceAppserviceResponse{}
	_body, _err := client.AllProdinstanceAppserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
 * Summary: 查询一个环境内的全部应用服务实例信息。
 */
func (client *Client) AllProdinstanceAppserviceEx(request *AllProdinstanceAppserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllProdinstanceAppserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllProdinstanceAppserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.appservice.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 输入产品码，自动创建一个测试单，并开始执行
 * Summary: 创建一个自动巡检测试单
 */
func (client *Client) CreateAutotestops(request *CreateAutotestopsRequest) (_result *CreateAutotestopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAutotestopsResponse{}
	_body, _err := client.CreateAutotestopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 输入产品码，自动创建一个测试单，并开始执行
 * Summary: 创建一个自动巡检测试单
 */
func (client *Client) CreateAutotestopsEx(request *CreateAutotestopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAutotestopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAutotestopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.autotestops.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取测试单状态和case
 * Summary: 获取测试单详情
 */
func (client *Client) GetAutotestops(request *GetAutotestopsRequest) (_result *GetAutotestopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAutotestopsResponse{}
	_body, _err := client.GetAutotestopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取测试单状态和case
 * Summary: 获取测试单详情
 */
func (client *Client) GetAutotestopsEx(request *GetAutotestopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAutotestopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAutotestopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.autotestops.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基线数据回流
 * Summary: 基线数据回流
 */
func (client *Client) ExportBaseline(request *ExportBaselineRequest) (_result *ExportBaselineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportBaselineResponse{}
	_body, _err := client.ExportBaselineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基线数据回流
 * Summary: 基线数据回流
 */
func (client *Client) ExportBaselineEx(request *ExportBaselineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportBaselineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportBaselineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.baseline.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建一个发布单
 * Summary: 创建一个发布单
 */
func (client *Client) CreateAppdeploy(request *CreateAppdeployRequest) (_result *CreateAppdeployResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppdeployResponse{}
	_body, _err := client.CreateAppdeployEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建一个发布单
 * Summary: 创建一个发布单
 */
func (client *Client) CreateAppdeployEx(request *CreateAppdeployRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppdeployResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppdeployResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appdeploy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询环境中的解决方案实例
 * Summary: 查询环境中的解决方案实例
 */
func (client *Client) QuerySolutioninstance(request *QuerySolutioninstanceRequest) (_result *QuerySolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySolutioninstanceResponse{}
	_body, _err := client.QuerySolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询环境中的解决方案实例
 * Summary: 查询环境中的解决方案实例
 */
func (client *Client) QuerySolutioninstanceEx(request *QuerySolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入解决方案
 * Summary: 导入解决方案
 */
func (client *Client) ImportSolutioninstance(request *ImportSolutioninstanceRequest) (_result *ImportSolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportSolutioninstanceResponse{}
	_body, _err := client.ImportSolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入解决方案
 * Summary: 导入解决方案
 */
func (client *Client) ImportSolutioninstanceEx(request *ImportSolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportSolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportSolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 检查解决方案是否可以导入
 * Summary: 检查解决方案是否可以导入
 */
func (client *Client) CheckSolutioninstanceImport(request *CheckSolutioninstanceImportRequest) (_result *CheckSolutioninstanceImportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSolutioninstanceImportResponse{}
	_body, _err := client.CheckSolutioninstanceImportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检查解决方案是否可以导入
 * Summary: 检查解决方案是否可以导入
 */
func (client *Client) CheckSolutioninstanceImportEx(request *CheckSolutioninstanceImportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSolutioninstanceImportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSolutioninstanceImportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.import.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 返回解决方案支持的操作列表
 * Summary: 返回解决方案支持的操作列表
 */
func (client *Client) DescribeSolutioninstance(request *DescribeSolutioninstanceRequest) (_result *DescribeSolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeSolutioninstanceResponse{}
	_body, _err := client.DescribeSolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 返回解决方案支持的操作列表
 * Summary: 返回解决方案支持的操作列表
 */
func (client *Client) DescribeSolutioninstanceEx(request *DescribeSolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeSolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeSolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 废弃一个解决方案
 * Summary: 废弃一个解决方案
 */
func (client *Client) DeprecateSolutioninstance(request *DeprecateSolutioninstanceRequest) (_result *DeprecateSolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeprecateSolutioninstanceResponse{}
	_body, _err := client.DeprecateSolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 废弃一个解决方案
 * Summary: 废弃一个解决方案
 */
func (client *Client) DeprecateSolutioninstanceEx(request *DeprecateSolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeprecateSolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeprecateSolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.deprecate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 完成一个解决方案
 * Summary: 完成一个解决方案
 */
func (client *Client) FinishSolutioninstance(request *FinishSolutioninstanceRequest) (_result *FinishSolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishSolutioninstanceResponse{}
	_body, _err := client.FinishSolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 完成一个解决方案
 * Summary: 完成一个解决方案
 */
func (client *Client) FinishSolutioninstanceEx(request *FinishSolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishSolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishSolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: reopen一个解决方案
 * Summary: reopen一个解决方案
 */
func (client *Client) ReopenSolutioninstance(request *ReopenSolutioninstanceRequest) (_result *ReopenSolutioninstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReopenSolutioninstanceResponse{}
	_body, _err := client.ReopenSolutioninstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: reopen一个解决方案
 * Summary: reopen一个解决方案
 */
func (client *Client) ReopenSolutioninstanceEx(request *ReopenSolutioninstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReopenSolutioninstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReopenSolutioninstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solutioninstance.reopen"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入一个云架构
 * Summary: 导入一个云架构
 */
func (client *Client) ImportEnvMeta(request *ImportEnvMetaRequest) (_result *ImportEnvMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportEnvMetaResponse{}
	_body, _err := client.ImportEnvMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入一个云架构
 * Summary: 导入一个云架构
 */
func (client *Client) ImportEnvMetaEx(request *ImportEnvMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportEnvMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportEnvMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.env.meta.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导入产品元数据
 * Summary: 导入产品元数据
 */
func (client *Client) ImportProdMeta(request *ImportProdMetaRequest) (_result *ImportProdMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportProdMetaResponse{}
	_body, _err := client.ImportProdMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导入产品元数据
 * Summary: 导入产品元数据
 */
func (client *Client) ImportProdMetaEx(request *ImportProdMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportProdMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportProdMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prod.meta.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 卸载部署单元实例
 * Summary: 卸载部署单元实例
 */
func (client *Client) UninstallProdinstanceDeployunit(request *UninstallProdinstanceDeployunitRequest) (_result *UninstallProdinstanceDeployunitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UninstallProdinstanceDeployunitResponse{}
	_body, _err := client.UninstallProdinstanceDeployunitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 卸载部署单元实例
 * Summary: 卸载部署单元实例
 */
func (client *Client) UninstallProdinstanceDeployunitEx(request *UninstallProdinstanceDeployunitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UninstallProdinstanceDeployunitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UninstallProdinstanceDeployunitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.deployunit.uninstall"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 集群内部pod信息查询，巡检使用
 * Summary: 集群内部pod信息查询，巡检使用
 */
func (client *Client) QueryClusterPods(request *QueryClusterPodsRequest) (_result *QueryClusterPodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterPodsResponse{}
	_body, _err := client.QueryClusterPodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 集群内部pod信息查询，巡检使用
 * Summary: 集群内部pod信息查询，巡检使用
 */
func (client *Client) QueryClusterPodsEx(request *QueryClusterPodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterPodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterPodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.pods.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 集群内部kubeconfig查询巡检使用
 * Summary: 集群内部kubeconfig查询巡检使用
 */
func (client *Client) QueryClusterKubeconfig(request *QueryClusterKubeconfigRequest) (_result *QueryClusterKubeconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterKubeconfigResponse{}
	_body, _err := client.QueryClusterKubeconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 集群内部kubeconfig查询巡检使用
 * Summary: 集群内部kubeconfig查询巡检使用
 */
func (client *Client) QueryClusterKubeconfigEx(request *QueryClusterKubeconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterKubeconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterKubeconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.kubeconfig.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 【ODP虚商迁移】公有云支持创建公网SLB
https://aone.alipay.com/req/33161543?from=ak&
 * Summary: 生成公网访问的slb
*/
func (client *Client) EnableDynamicslb(request *EnableDynamicslbRequest) (_result *EnableDynamicslbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableDynamicslbResponse{}
	_body, _err := client.EnableDynamicslbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 【ODP虚商迁移】公有云支持创建公网SLB
https://aone.alipay.com/req/33161543?from=ak&
 * Summary: 生成公网访问的slb
*/
func (client *Client) EnableDynamicslbEx(request *EnableDynamicslbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableDynamicslbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableDynamicslbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.dynamicslb.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移除公网SLB
【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
 * Summary: 移除公网访问的slb
*/
func (client *Client) DisableDynamicslb(request *DisableDynamicslbRequest) (_result *DisableDynamicslbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DisableDynamicslbResponse{}
	_body, _err := client.DisableDynamicslbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移除公网SLB
【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
 * Summary: 移除公网访问的slb
*/
func (client *Client) DisableDynamicslbEx(request *DisableDynamicslbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DisableDynamicslbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DisableDynamicslbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.dynamicslb.disable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云游环境下应用dns的上下线
 * Summary: 云游环境下应用dns的上下线
 */
func (client *Client) ExecClusterDns(request *ExecClusterDnsRequest) (_result *ExecClusterDnsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecClusterDnsResponse{}
	_body, _err := client.ExecClusterDnsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云游环境下应用dns的上下线
 * Summary: 云游环境下应用dns的上下线
 */
func (client *Client) ExecClusterDnsEx(request *ExecClusterDnsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecClusterDnsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecClusterDnsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.dns.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云游环境下应用容器的下线
 * Summary: 云游环境下应用容器的下线
 */
func (client *Client) OfflineClusterContainer(request *OfflineClusterContainerRequest) (_result *OfflineClusterContainerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OfflineClusterContainerResponse{}
	_body, _err := client.OfflineClusterContainerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云游环境下应用容器的下线
 * Summary: 云游环境下应用容器的下线
 */
func (client *Client) OfflineClusterContainerEx(request *OfflineClusterContainerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OfflineClusterContainerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OfflineClusterContainerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.container.offline"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云游环境下应用容器的上线
 * Summary: 云游环境下应用容器的上线
 */
func (client *Client) OnlineClusterContainer(request *OnlineClusterContainerRequest) (_result *OnlineClusterContainerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OnlineClusterContainerResponse{}
	_body, _err := client.OnlineClusterContainerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云游环境下应用容器的上线
 * Summary: 云游环境下应用容器的上线
 */
func (client *Client) OnlineClusterContainerEx(request *OnlineClusterContainerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OnlineClusterContainerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OnlineClusterContainerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.container.online"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询应用启动参数
 * Summary: 查询应用启动参数
 */
func (client *Client) QueryAppparam(request *QueryAppparamRequest) (_result *QueryAppparamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAppparamResponse{}
	_body, _err := client.QueryAppparamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询应用启动参数
 * Summary: 查询应用启动参数
 */
func (client *Client) QueryAppparamEx(request *QueryAppparamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAppparamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAppparamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.appparam.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询产品解决方案的所有发布单
 * Summary: 查询产品解决方案的所有发布单
 */
func (client *Client) PagequerySolutionOpsplan(request *PagequerySolutionOpsplanRequest) (_result *PagequerySolutionOpsplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequerySolutionOpsplanResponse{}
	_body, _err := client.PagequerySolutionOpsplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询产品解决方案的所有发布单
 * Summary: 查询产品解决方案的所有发布单
 */
func (client *Client) PagequerySolutionOpsplanEx(request *PagequerySolutionOpsplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequerySolutionOpsplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequerySolutionOpsplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solution.opsplan.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认解决方案的各种规划
 * Summary: 确认解决方案规划
 */
func (client *Client) ConfirmSolutionPlan(request *ConfirmSolutionPlanRequest) (_result *ConfirmSolutionPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmSolutionPlanResponse{}
	_body, _err := client.ConfirmSolutionPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认解决方案的各种规划
 * Summary: 确认解决方案规划
 */
func (client *Client) ConfirmSolutionPlanEx(request *ConfirmSolutionPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmSolutionPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmSolutionPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solution.plan.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解决方案是否完成规划
 * Summary: 解决方案是否完成规划
 */
func (client *Client) GetSolutionPlanstatus(request *GetSolutionPlanstatusRequest) (_result *GetSolutionPlanstatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSolutionPlanstatusResponse{}
	_body, _err := client.GetSolutionPlanstatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解决方案是否完成规划
 * Summary: 解决方案是否完成规划
 */
func (client *Client) GetSolutionPlanstatusEx(request *GetSolutionPlanstatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSolutionPlanstatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSolutionPlanstatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solution.planstatus.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询迭代详情
 * Summary: 分页查询迭代详情
 */
func (client *Client) PagequeryProditeration(request *PagequeryProditerationRequest) (_result *PagequeryProditerationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryProditerationResponse{}
	_body, _err := client.PagequeryProditerationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询迭代详情
 * Summary: 分页查询迭代详情
 */
func (client *Client) PagequeryProditerationEx(request *PagequeryProditerationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryProditerationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryProditerationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.proditeration.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 部署单元批量创建
 * Summary: 部署单元批量创建
 */
func (client *Client) CreateProdinstanceDeployunitbatch(request *CreateProdinstanceDeployunitbatchRequest) (_result *CreateProdinstanceDeployunitbatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProdinstanceDeployunitbatchResponse{}
	_body, _err := client.CreateProdinstanceDeployunitbatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 部署单元批量创建
 * Summary: 部署单元批量创建
 */
func (client *Client) CreateProdinstanceDeployunitbatchEx(request *CreateProdinstanceDeployunitbatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProdinstanceDeployunitbatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProdinstanceDeployunitbatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prodinstance.deployunitbatch.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布单应用回滚
 * Summary: 发布单应用回滚
 */
func (client *Client) RollbackOpsApp(request *RollbackOpsAppRequest) (_result *RollbackOpsAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RollbackOpsAppResponse{}
	_body, _err := client.RollbackOpsAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布单应用回滚
 * Summary: 发布单应用回滚
 */
func (client *Client) RollbackOpsAppEx(request *RollbackOpsAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RollbackOpsAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RollbackOpsAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.ops.app.rollback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布单产品回滚
 * Summary: 发布单产品回滚
 */
func (client *Client) RollbackOpsProduct(request *RollbackOpsProductRequest) (_result *RollbackOpsProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RollbackOpsProductResponse{}
	_body, _err := client.RollbackOpsProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布单产品回滚
 * Summary: 发布单产品回滚
 */
func (client *Client) RollbackOpsProductEx(request *RollbackOpsProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RollbackOpsProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RollbackOpsProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.ops.product.rollback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 直接查询集群的pod信息，不是查询云游的基线！
 * Summary: 查询集群pod信息
 */
func (client *Client) QueryClusterNativepod(request *QueryClusterNativepodRequest) (_result *QueryClusterNativepodResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterNativepodResponse{}
	_body, _err := client.QueryClusterNativepodEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 直接查询集群的pod信息，不是查询云游的基线！
 * Summary: 查询集群pod信息
 */
func (client *Client) QueryClusterNativepodEx(request *QueryClusterNativepodRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterNativepodResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterNativepodResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.cluster.nativepod.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询基线应用容器
 * Summary: 查询基线应用容器
 */
func (client *Client) PagequeryBaselineAppcontainers(request *PagequeryBaselineAppcontainersRequest) (_result *PagequeryBaselineAppcontainersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryBaselineAppcontainersResponse{}
	_body, _err := client.PagequeryBaselineAppcontainersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询基线应用容器
 * Summary: 查询基线应用容器
 */
func (client *Client) PagequeryBaselineAppcontainersEx(request *PagequeryBaselineAppcontainersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryBaselineAppcontainersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryBaselineAppcontainersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.baseline.appcontainers.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 回滚快照查询
 * Summary: 回滚快照查询
 */
func (client *Client) PagequeryRollbackSnapshotversion(request *PagequeryRollbackSnapshotversionRequest) (_result *PagequeryRollbackSnapshotversionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryRollbackSnapshotversionResponse{}
	_body, _err := client.PagequeryRollbackSnapshotversionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 回滚快照查询
 * Summary: 回滚快照查询
 */
func (client *Client) PagequeryRollbackSnapshotversionEx(request *PagequeryRollbackSnapshotversionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryRollbackSnapshotversionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryRollbackSnapshotversionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.rollback.snapshotversion.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品是否可创建测试单
 * Summary: 产品是否可创建测试单
 */
func (client *Client) EnableProdAutotest(request *EnableProdAutotestRequest) (_result *EnableProdAutotestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableProdAutotestResponse{}
	_body, _err := client.EnableProdAutotestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品是否可创建测试单
 * Summary: 产品是否可创建测试单
 */
func (client *Client) EnableProdAutotestEx(request *EnableProdAutotestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableProdAutotestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableProdAutotestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prod.autotest.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 系统参数查询
 * Summary: 系统参数查询
 */
func (client *Client) QuerySystemParameter(request *QuerySystemParameterRequest) (_result *QuerySystemParameterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySystemParameterResponse{}
	_body, _err := client.QuerySystemParameterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 系统参数查询
 * Summary: 系统参数查询
 */
func (client *Client) QuerySystemParameterEx(request *QuerySystemParameterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySystemParameterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySystemParameterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.system.parameter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询发布单详情
发布单详情的任务树是嵌套结构，OP目前不支持定义此类型的结构体
故本接口返回了json string，调用方需要自己构造
 * Summary: 查询发布单详情
*/
func (client *Client) QueryOpsplanNodetree(request *QueryOpsplanNodetreeRequest) (_result *QueryOpsplanNodetreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOpsplanNodetreeResponse{}
	_body, _err := client.QueryOpsplanNodetreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询发布单详情
发布单详情的任务树是嵌套结构，OP目前不支持定义此类型的结构体
故本接口返回了json string，调用方需要自己构造
 * Summary: 查询发布单详情
*/
func (client *Client) QueryOpsplanNodetreeEx(request *QueryOpsplanNodetreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOpsplanNodetreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOpsplanNodetreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.opsplan.nodetree.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 站点信息list
 * Summary: 站点信息list
 */
func (client *Client) ListAapSites(request *ListAapSitesRequest) (_result *ListAapSitesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAapSitesResponse{}
	_body, _err := client.ListAapSitesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 站点信息list
 * Summary: 站点信息list
 */
func (client *Client) ListAapSitesEx(request *ListAapSitesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAapSitesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAapSitesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.sites.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AAP 元数据导入，包含：产品、应用、拓扑信息 。https://yuque.antfin-inc.com/tpaas/ednkxs/izdpx9s4at32mwbi?singleDoc# 《AAP：用户自定义产品接入》
 * Summary: AAP 元数据导入
 */
func (client *Client) ImportAapMeta(request *ImportAapMetaRequest) (_result *ImportAapMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAapMetaResponse{}
	_body, _err := client.ImportAapMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AAP 元数据导入，包含：产品、应用、拓扑信息 。https://yuque.antfin-inc.com/tpaas/ednkxs/izdpx9s4at32mwbi?singleDoc# 《AAP：用户自定义产品接入》
 * Summary: AAP 元数据导入
 */
func (client *Client) ImportAapMetaEx(request *ImportAapMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAapMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAapMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.meta.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AAP 产品实例初始化
 * Summary: AAP 产品实例初始化
 */
func (client *Client) InitAapProductinstance(request *InitAapProductinstanceRequest) (_result *InitAapProductinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAapProductinstanceResponse{}
	_body, _err := client.InitAapProductinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AAP 产品实例初始化
 * Summary: AAP 产品实例初始化
 */
func (client *Client) InitAapProductinstanceEx(request *InitAapProductinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAapProductinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAapProductinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.productinstance.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品实例发布初始化
 * Summary: 产品实例发布初始化
 */
func (client *Client) InitAapRelease(request *InitAapReleaseRequest) (_result *InitAapReleaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAapReleaseResponse{}
	_body, _err := client.InitAapReleaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品实例发布初始化
 * Summary: 产品实例发布初始化
 */
func (client *Client) InitAapReleaseEx(request *InitAapReleaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAapReleaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAapReleaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.release.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品实例部署
 * Summary: 产品实例部署
 */
func (client *Client) DeployAapProductinstance(request *DeployAapProductinstanceRequest) (_result *DeployAapProductinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeployAapProductinstanceResponse{}
	_body, _err := client.DeployAapProductinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品实例部署
 * Summary: 产品实例部署
 */
func (client *Client) DeployAapProductinstanceEx(request *DeployAapProductinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeployAapProductinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeployAapProductinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.productinstance.deploy"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布单状态查询
 * Summary: 发布单
 */
func (client *Client) GetAapRelease(request *GetAapReleaseRequest) (_result *GetAapReleaseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAapReleaseResponse{}
	_body, _err := client.GetAapReleaseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布单状态查询
 * Summary: 发布单
 */
func (client *Client) GetAapReleaseEx(request *GetAapReleaseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAapReleaseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAapReleaseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.release.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用实例更新，比如：规格、镜像、参数等
 * Summary: 应用实例更新
 */
func (client *Client) UpdateAapApplicationinstance(request *UpdateAapApplicationinstanceRequest) (_result *UpdateAapApplicationinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAapApplicationinstanceResponse{}
	_body, _err := client.UpdateAapApplicationinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用实例更新，比如：规格、镜像、参数等
 * Summary: 应用实例更新
 */
func (client *Client) UpdateAapApplicationinstanceEx(request *UpdateAapApplicationinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAapApplicationinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAapApplicationinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.applicationinstance.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用实例查询
 * Summary: 应用实例查询
 */
func (client *Client) QueryAapApplicationinstance(request *QueryAapApplicationinstanceRequest) (_result *QueryAapApplicationinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAapApplicationinstanceResponse{}
	_body, _err := client.QueryAapApplicationinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用实例查询
 * Summary: 应用实例查询
 */
func (client *Client) QueryAapApplicationinstanceEx(request *QueryAapApplicationinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAapApplicationinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAapApplicationinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.applicationinstance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用规格配置修改
 * Summary: 应用规格配置修改
 */
func (client *Client) SetAapApplicationinstance(request *SetAapApplicationinstanceRequest) (_result *SetAapApplicationinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetAapApplicationinstanceResponse{}
	_body, _err := client.SetAapApplicationinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用规格配置修改
 * Summary: 应用规格配置修改
 */
func (client *Client) SetAapApplicationinstanceEx(request *SetAapApplicationinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetAapApplicationinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAapApplicationinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.applicationinstance.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用镜像修改
 * Summary: 应用镜像修改
 */
func (client *Client) SetAapImages(request *SetAapImagesRequest) (_result *SetAapImagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetAapImagesResponse{}
	_body, _err := client.SetAapImagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用镜像修改
 * Summary: 应用镜像修改
 */
func (client *Client) SetAapImagesEx(request *SetAapImagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetAapImagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAapImagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.images.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品实例查询
 * Summary: 产品实例查询
 */
func (client *Client) QueryAapProductinstance(request *QueryAapProductinstanceRequest) (_result *QueryAapProductinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAapProductinstanceResponse{}
	_body, _err := client.QueryAapProductinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品实例查询
 * Summary: 产品实例查询
 */
func (client *Client) QueryAapProductinstanceEx(request *QueryAapProductinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAapProductinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAapProductinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.productinstance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用实例详情查询
 * Summary: 应用实例详情查询
 */
func (client *Client) DetailAapApplicationinstance(request *DetailAapApplicationinstanceRequest) (_result *DetailAapApplicationinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailAapApplicationinstanceResponse{}
	_body, _err := client.DetailAapApplicationinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用实例详情查询
 * Summary: 应用实例详情查询
 */
func (client *Client) DetailAapApplicationinstanceEx(request *DetailAapApplicationinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailAapApplicationinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailAapApplicationinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.applicationinstance.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用参数更新
 * Summary: 应用参数更新
 */
func (client *Client) SetAapParameters(request *SetAapParametersRequest) (_result *SetAapParametersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetAapParametersResponse{}
	_body, _err := client.SetAapParametersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用参数更新
 * Summary: 应用参数更新
 */
func (client *Client) SetAapParametersEx(request *SetAapParametersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetAapParametersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetAapParametersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.parameters.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品实例卸载
 * Summary: 产品实例卸载
 */
func (client *Client) DeleteAapProductinstance(request *DeleteAapProductinstanceRequest) (_result *DeleteAapProductinstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAapProductinstanceResponse{}
	_body, _err := client.DeleteAapProductinstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品实例卸载
 * Summary: 产品实例卸载
 */
func (client *Client) DeleteAapProductinstanceEx(request *DeleteAapProductinstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAapProductinstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAapProductinstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.aap.productinstance.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 初始化云游local环境
 * Summary: 初始化云游local环境
 */
func (client *Client) CreateEnv(request *CreateEnvRequest) (_result *CreateEnvResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateEnvResponse{}
	_body, _err := client.CreateEnvEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 初始化云游local环境
 * Summary: 初始化云游local环境
 */
func (client *Client) CreateEnvEx(request *CreateEnvRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateEnvResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateEnvResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.env.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 云游纳管的所有环境基本信息查询
 * Summary: 云游纳管的所有环境基本信息查询
 */
func (client *Client) AllEnvs(request *AllEnvsRequest) (_result *AllEnvsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllEnvsResponse{}
	_body, _err := client.AllEnvsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 云游纳管的所有环境基本信息查询
 * Summary: 云游纳管的所有环境基本信息查询
 */
func (client *Client) AllEnvsEx(request *AllEnvsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllEnvsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllEnvsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.envs.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品基线基本信息分页查询
 * Summary: 产品基线基本信息分页查询
 */
func (client *Client) PagequeryProds(request *PagequeryProdsRequest) (_result *PagequeryProdsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryProdsResponse{}
	_body, _err := client.PagequeryProdsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品基线基本信息分页查询
 * Summary: 产品基线基本信息分页查询
 */
func (client *Client) PagequeryProdsEx(request *PagequeryProdsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryProdsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryProdsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品基线资源元数据查询
 * Summary: 产品基线资源元数据查询
 */
func (client *Client) PagequeryProdsResources(request *PagequeryProdsResourcesRequest) (_result *PagequeryProdsResourcesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryProdsResourcesResponse{}
	_body, _err := client.PagequeryProdsResourcesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品基线资源元数据查询
 * Summary: 产品基线资源元数据查询
 */
func (client *Client) PagequeryProdsResourcesEx(request *PagequeryProdsResourcesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryProdsResourcesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryProdsResourcesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.resources.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品基线容器实例详情分页查询
 * Summary: 产品基线容器实例详情查询
 */
func (client *Client) PagequeryResourceinstancesContainers(request *PagequeryResourceinstancesContainersRequest) (_result *PagequeryResourceinstancesContainersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryResourceinstancesContainersResponse{}
	_body, _err := client.PagequeryResourceinstancesContainersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品基线容器实例详情分页查询
 * Summary: 产品基线容器实例详情查询
 */
func (client *Client) PagequeryResourceinstancesContainersEx(request *PagequeryResourceinstancesContainersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryResourceinstancesContainersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryResourceinstancesContainersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.resourceinstances.containers.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品所属应用基线元数据分页查询
 * Summary: 产品所属应用基线元数据分页查询
 */
func (client *Client) PagequeryProdsApps(request *PagequeryProdsAppsRequest) (_result *PagequeryProdsAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryProdsAppsResponse{}
	_body, _err := client.PagequeryProdsAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品所属应用基线元数据分页查询
 * Summary: 产品所属应用基线元数据分页查询
 */
func (client *Client) PagequeryProdsAppsEx(request *PagequeryProdsAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryProdsAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryProdsAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.apps.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品部署单元实例列表查询
 * Summary: 产品部署单元实例列表查询
 */
func (client *Client) QueryProdsDeploymentunits(request *QueryProdsDeploymentunitsRequest) (_result *QueryProdsDeploymentunitsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProdsDeploymentunitsResponse{}
	_body, _err := client.QueryProdsDeploymentunitsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品部署单元实例列表查询
 * Summary: 产品部署单元实例列表查询
 */
func (client *Client) QueryProdsDeploymentunitsEx(request *QueryProdsDeploymentunitsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProdsDeploymentunitsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProdsDeploymentunitsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.deploymentunits.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品基线应用所属lb资源分页查询
 * Summary: 产品基线应用所属lb资源分页查询
 */
func (client *Client) PagequeryResourceinstancesLbs(request *PagequeryResourceinstancesLbsRequest) (_result *PagequeryResourceinstancesLbsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryResourceinstancesLbsResponse{}
	_body, _err := client.PagequeryResourceinstancesLbsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品基线应用所属lb资源分页查询
 * Summary: 产品基线应用所属lb资源分页查询
 */
func (client *Client) PagequeryResourceinstancesLbsEx(request *PagequeryResourceinstancesLbsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryResourceinstancesLbsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryResourceinstancesLbsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.resourceinstances.lbs.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品所属应用运维发布单创建
 * Summary: 产品所属应用运维发布单创建
 */
func (client *Client) CreateProdsAppops(request *CreateProdsAppopsRequest) (_result *CreateProdsAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProdsAppopsResponse{}
	_body, _err := client.CreateProdsAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品所属应用运维发布单创建
 * Summary: 产品所属应用运维发布单创建
 */
func (client *Client) CreateProdsAppopsEx(request *CreateProdsAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProdsAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProdsAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.appops.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 运维发布单查询
 * Summary: 运维发布单查询
 */
func (client *Client) GetProdsAppops(request *GetProdsAppopsRequest) (_result *GetProdsAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetProdsAppopsResponse{}
	_body, _err := client.GetProdsAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 运维发布单查询
 * Summary: 运维发布单查询
 */
func (client *Client) GetProdsAppopsEx(request *GetProdsAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetProdsAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetProdsAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.appops.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布单取消
 * Summary: 发布单取消
 */
func (client *Client) CancelProdsAppops(request *CancelProdsAppopsRequest) (_result *CancelProdsAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelProdsAppopsResponse{}
	_body, _err := client.CancelProdsAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布单取消
 * Summary: 发布单取消
 */
func (client *Client) CancelProdsAppopsEx(request *CancelProdsAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelProdsAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelProdsAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.appops.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布单重试
 * Summary: 发布单重试
 */
func (client *Client) RetryProdsAppops(request *RetryProdsAppopsRequest) (_result *RetryProdsAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryProdsAppopsResponse{}
	_body, _err := client.RetryProdsAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布单重试
 * Summary: 发布单重试
 */
func (client *Client) RetryProdsAppopsEx(request *RetryProdsAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryProdsAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryProdsAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.appops.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用缩容
 * Summary: 应用缩容
 */
func (client *Client) ScaleinProdsAppops(request *ScaleinProdsAppopsRequest) (_result *ScaleinProdsAppopsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleinProdsAppopsResponse{}
	_body, _err := client.ScaleinProdsAppopsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用缩容
 * Summary: 应用缩容
 */
func (client *Client) ScaleinProdsAppopsEx(request *ScaleinProdsAppopsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleinProdsAppopsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleinProdsAppopsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.prods.appops.scalein"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
