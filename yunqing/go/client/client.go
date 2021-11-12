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
	// 应用服务实例id。
	AppServiceId *string `json:"app_service_id,omitempty" xml:"app_service_id,omitempty" require:"true"`
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

func (s *UninstallProdinstanceAppserviceRequest) SetAppServiceId(v string) *UninstallProdinstanceAppserviceRequest {
	s.AppServiceId = &v
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
	// com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
	BoxData *string `json:"box_data,omitempty" xml:"box_data,omitempty" require:"true"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// 工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty" require:"true"`
	// 花名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
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

func (s *ImportSolutioninstanceRequest) SetWorkNo(v string) *ImportSolutioninstanceRequest {
	s.WorkNo = &v
	return s
}

func (s *ImportSolutioninstanceRequest) SetName(v string) *ImportSolutioninstanceRequest {
	s.Name = &v
	return s
}

type ImportSolutioninstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type CheckSolutioninstanceImportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
	// com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
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
	// 单元实例ID
	UnitInstanceId *string `json:"unit_instance_id,omitempty" xml:"unit_instance_id,omitempty" require:"true"`
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

type QuerySolutionPreviewtaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案id
	SolutionId *string `json:"solution_id,omitempty" xml:"solution_id,omitempty" require:"true"`
}

func (s QuerySolutionPreviewtaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionPreviewtaskRequest) GoString() string {
	return s.String()
}

func (s *QuerySolutionPreviewtaskRequest) SetAuthToken(v string) *QuerySolutionPreviewtaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySolutionPreviewtaskRequest) SetProductInstanceId(v string) *QuerySolutionPreviewtaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySolutionPreviewtaskRequest) SetSolutionId(v string) *QuerySolutionPreviewtaskRequest {
	s.SolutionId = &v
	return s
}

type QuerySolutionPreviewtaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品预览任务查询
	ProdPreviewTasks []*ProdPreviewTasks `json:"prod_preview_tasks,omitempty" xml:"prod_preview_tasks,omitempty" type:"Repeated"`
}

func (s QuerySolutionPreviewtaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySolutionPreviewtaskResponse) GoString() string {
	return s.String()
}

func (s *QuerySolutionPreviewtaskResponse) SetReqMsgId(v string) *QuerySolutionPreviewtaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySolutionPreviewtaskResponse) SetResultCode(v string) *QuerySolutionPreviewtaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySolutionPreviewtaskResponse) SetResultMsg(v string) *QuerySolutionPreviewtaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySolutionPreviewtaskResponse) SetProdPreviewTasks(v []*ProdPreviewTasks) *QuerySolutionPreviewtaskResponse {
	s.ProdPreviewTasks = v
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
				"sdk_version":      tea.String("3.12.4"),
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
 * Description: 卸载应用服务实例。
 * Summary: 卸载应用服务实例。
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
 * Description: 卸载应用服务实例。
 * Summary: 卸载应用服务实例。
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
 * Description: 解决方案应用previewtask查询
 * Summary: 解决方案应用previewtask查询
 */
func (client *Client) QuerySolutionPreviewtask(request *QuerySolutionPreviewtaskRequest) (_result *QuerySolutionPreviewtaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySolutionPreviewtaskResponse{}
	_body, _err := client.QuerySolutionPreviewtaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解决方案应用previewtask查询
 * Summary: 解决方案应用previewtask查询
 */
func (client *Client) QuerySolutionPreviewtaskEx(request *QuerySolutionPreviewtaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySolutionPreviewtaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySolutionPreviewtaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("yunyou.yunqing.solution.previewtask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
