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

// 进行中事务数统计
type Ongoing struct {
	// 进行中分支事务数
	ActionNum *int64 `json:"action_num,omitempty" xml:"action_num,omitempty" require:"true"`
	// 进行中事务数
	ActivityNum *int64 `json:"activity_num,omitempty" xml:"activity_num,omitempty" require:"true"`
}

func (s Ongoing) String() string {
	return tea.Prettify(s)
}

func (s Ongoing) GoString() string {
	return s.String()
}

func (s *Ongoing) SetActionNum(v int64) *Ongoing {
	s.ActionNum = &v
	return s
}

func (s *Ongoing) SetActivityNum(v int64) *Ongoing {
	s.ActivityNum = &v
	return s
}

// 当天事务数统计
type Today struct {
	// 当天分支事务数
	ActionNum *int64 `json:"action_num,omitempty" xml:"action_num,omitempty" require:"true"`
	// 当天事务数
	ActivityNum *int64 `json:"activity_num,omitempty" xml:"activity_num,omitempty" require:"true"`
}

func (s Today) String() string {
	return tea.Prettify(s)
}

func (s Today) GoString() string {
	return s.String()
}

func (s *Today) SetActionNum(v int64) *Today {
	s.ActionNum = &v
	return s
}

func (s *Today) SetActivityNum(v int64) *Today {
	s.ActivityNum = &v
	return s
}

// 异常事务数
type ExceptionStats struct {
	// 异常事务数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
}

func (s ExceptionStats) String() string {
	return tea.Prettify(s)
}

func (s ExceptionStats) GoString() string {
	return s.String()
}

func (s *ExceptionStats) SetTotal(v int64) *ExceptionStats {
	s.Total = &v
	return s
}

// 页面展示的发起方数据源信息
type ActivityDsVO struct {
	// 9
	ActionTableIndexEnd *int64 `json:"action_table_index_end,omitempty" xml:"action_table_index_end,omitempty" require:"true"`
	// 0
	ActionTableIndexStart *int64 `json:"action_table_index_start,omitempty" xml:"action_table_index_start,omitempty" require:"true"`
	// .
	ActionTableNameFormat *string `json:"action_table_name_format,omitempty" xml:"action_table_name_format,omitempty" require:"true"`
	// activity_table_index_end
	ActivityTableIndexEnd *int64 `json:"activity_table_index_end,omitempty" xml:"activity_table_index_end,omitempty" require:"true"`
	// a
	ActivityTableIndexStart *int64 `json:"activity_table_index_start,omitempty" xml:"activity_table_index_start,omitempty" require:"true"`
	// 主事务表
	ActivityTableNameFormat *string `json:"activity_table_name_format,omitempty" xml:"activity_table_name_format,omitempty" require:"true"`
	// DB最小连接数
	DbConnectMin *int64 `json:"db_connect_min,omitempty" xml:"db_connect_min,omitempty" require:"true"`
	// DB最大连接数
	DbConnMax *int64 `json:"db_conn_max,omitempty" xml:"db_conn_max,omitempty" require:"true"`
	// 数据库类型
	DbType *int64 `json:"db_type,omitempty" xml:"db_type,omitempty" require:"true"`
	// 统一数据源索引结束值
	DsIndexEnd *int64 `json:"ds_index_end,omitempty" xml:"ds_index_end,omitempty" require:"true"`
	// 统一数据源索引起始值
	DsIndexStart *int64 `json:"ds_index_start,omitempty" xml:"ds_index_start,omitempty" require:"true"`
	// 统一数据源
	DsNameFormat *string `json:"ds_name_format,omitempty" xml:"ds_name_format,omitempty" require:"true"`
	// 唯一id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 部署模式
	// true：rzone部署，false：gzone部署
	IsLdc *bool `json:"is_ldc,omitempty" xml:"is_ldc,omitempty" require:"true"`
	// true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
	IsLocalDs *bool `json:"is_local_ds,omitempty" xml:"is_local_ds,omitempty" require:"true"`
	// gzone部署，国际IPAY站点使用
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty" require:"true"`
	// .
	TaskNameFormat *string `json:"task_name_format,omitempty" xml:"task_name_format,omitempty" require:"true"`
	// .
	TaskIndexStart *int64 `json:"task_index_start,omitempty" xml:"task_index_start,omitempty"`
	// .
	TaskIndexEnd *int64 `json:"task_index_end,omitempty" xml:"task_index_end,omitempty"`
}

func (s ActivityDsVO) String() string {
	return tea.Prettify(s)
}

func (s ActivityDsVO) GoString() string {
	return s.String()
}

func (s *ActivityDsVO) SetActionTableIndexEnd(v int64) *ActivityDsVO {
	s.ActionTableIndexEnd = &v
	return s
}

func (s *ActivityDsVO) SetActionTableIndexStart(v int64) *ActivityDsVO {
	s.ActionTableIndexStart = &v
	return s
}

func (s *ActivityDsVO) SetActionTableNameFormat(v string) *ActivityDsVO {
	s.ActionTableNameFormat = &v
	return s
}

func (s *ActivityDsVO) SetActivityTableIndexEnd(v int64) *ActivityDsVO {
	s.ActivityTableIndexEnd = &v
	return s
}

func (s *ActivityDsVO) SetActivityTableIndexStart(v int64) *ActivityDsVO {
	s.ActivityTableIndexStart = &v
	return s
}

func (s *ActivityDsVO) SetActivityTableNameFormat(v string) *ActivityDsVO {
	s.ActivityTableNameFormat = &v
	return s
}

func (s *ActivityDsVO) SetDbConnectMin(v int64) *ActivityDsVO {
	s.DbConnectMin = &v
	return s
}

func (s *ActivityDsVO) SetDbConnMax(v int64) *ActivityDsVO {
	s.DbConnMax = &v
	return s
}

func (s *ActivityDsVO) SetDbType(v int64) *ActivityDsVO {
	s.DbType = &v
	return s
}

func (s *ActivityDsVO) SetDsIndexEnd(v int64) *ActivityDsVO {
	s.DsIndexEnd = &v
	return s
}

func (s *ActivityDsVO) SetDsIndexStart(v int64) *ActivityDsVO {
	s.DsIndexStart = &v
	return s
}

func (s *ActivityDsVO) SetDsNameFormat(v string) *ActivityDsVO {
	s.DsNameFormat = &v
	return s
}

func (s *ActivityDsVO) SetId(v int64) *ActivityDsVO {
	s.Id = &v
	return s
}

func (s *ActivityDsVO) SetIsLdc(v bool) *ActivityDsVO {
	s.IsLdc = &v
	return s
}

func (s *ActivityDsVO) SetIsLocalDs(v bool) *ActivityDsVO {
	s.IsLocalDs = &v
	return s
}

func (s *ActivityDsVO) SetZone(v string) *ActivityDsVO {
	s.Zone = &v
	return s
}

func (s *ActivityDsVO) SetTaskNameFormat(v string) *ActivityDsVO {
	s.TaskNameFormat = &v
	return s
}

func (s *ActivityDsVO) SetTaskIndexStart(v int64) *ActivityDsVO {
	s.TaskIndexStart = &v
	return s
}

func (s *ActivityDsVO) SetTaskIndexEnd(v int64) *ActivityDsVO {
	s.TaskIndexEnd = &v
	return s
}

// TransactionNode
type TransactionNode struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// start_time
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// end_time
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// role
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// label
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// is_end
	IsEnd *bool `json:"is_end,omitempty" xml:"is_end,omitempty" require:"true"`
}

func (s TransactionNode) String() string {
	return tea.Prettify(s)
}

func (s TransactionNode) GoString() string {
	return s.String()
}

func (s *TransactionNode) SetId(v int64) *TransactionNode {
	s.Id = &v
	return s
}

func (s *TransactionNode) SetStartTime(v string) *TransactionNode {
	s.StartTime = &v
	return s
}

func (s *TransactionNode) SetEndTime(v string) *TransactionNode {
	s.EndTime = &v
	return s
}

func (s *TransactionNode) SetRole(v string) *TransactionNode {
	s.Role = &v
	return s
}

func (s *TransactionNode) SetName(v string) *TransactionNode {
	s.Name = &v
	return s
}

func (s *TransactionNode) SetLabel(v string) *TransactionNode {
	s.Label = &v
	return s
}

func (s *TransactionNode) SetIsEnd(v bool) *TransactionNode {
	s.IsEnd = &v
	return s
}

// 事务统计信息
type Stats struct {
	// 异常事务数
	Exception *ExceptionStats `json:"exception,omitempty" xml:"exception,omitempty" require:"true"`
	// 进行中事务数统计
	Ongoing *Ongoing `json:"ongoing,omitempty" xml:"ongoing,omitempty" require:"true"`
	// 当天事务数统计
	Today *Today `json:"today,omitempty" xml:"today,omitempty" require:"true"`
}

func (s Stats) String() string {
	return tea.Prettify(s)
}

func (s Stats) GoString() string {
	return s.String()
}

func (s *Stats) SetException(v *ExceptionStats) *Stats {
	s.Exception = v
	return s
}

func (s *Stats) SetOngoing(v *Ongoing) *Stats {
	s.Ongoing = v
	return s
}

func (s *Stats) SetToday(v *Today) *Stats {
	s.Today = v
	return s
}

// 应用列表，发起方 view object
type AppRecoveryVO struct {
	// app
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 客户端模式
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty" require:"true"`
	// 数据源数组
	DsArray []*ActivityDsVO `json:"ds_array,omitempty" xml:"ds_array,omitempty" require:"true" type:"Repeated"`
	// 唯一id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 是否异步化
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty" require:"true"`
	// 数据源配置是否在dds中
	IsDds *bool `json:"is_dds,omitempty" xml:"is_dds,omitempty" require:"true"`
	// 压测
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 是否混合模式
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty" require:"true"`
	// 单条恢复数
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty" require:"true"`
	// 恢复任务线程数
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty" require:"true"`
	// 是否被使用
	Used *bool `json:"used,omitempty" xml:"used,omitempty" require:"true"`
}

func (s AppRecoveryVO) String() string {
	return tea.Prettify(s)
}

func (s AppRecoveryVO) GoString() string {
	return s.String()
}

func (s *AppRecoveryVO) SetAppName(v string) *AppRecoveryVO {
	s.AppName = &v
	return s
}

func (s *AppRecoveryVO) SetClientVersion(v string) *AppRecoveryVO {
	s.ClientVersion = &v
	return s
}

func (s *AppRecoveryVO) SetDsArray(v []*ActivityDsVO) *AppRecoveryVO {
	s.DsArray = v
	return s
}

func (s *AppRecoveryVO) SetId(v int64) *AppRecoveryVO {
	s.Id = &v
	return s
}

func (s *AppRecoveryVO) SetIsAsyn(v bool) *AppRecoveryVO {
	s.IsAsyn = &v
	return s
}

func (s *AppRecoveryVO) SetIsDds(v bool) *AppRecoveryVO {
	s.IsDds = &v
	return s
}

func (s *AppRecoveryVO) SetIsLoadTest(v bool) *AppRecoveryVO {
	s.IsLoadTest = &v
	return s
}

func (s *AppRecoveryVO) SetIsMix(v bool) *AppRecoveryVO {
	s.IsMix = &v
	return s
}

func (s *AppRecoveryVO) SetRecoveryLimit(v int64) *AppRecoveryVO {
	s.RecoveryLimit = &v
	return s
}

func (s *AppRecoveryVO) SetRecoveryThreadNum(v int64) *AppRecoveryVO {
	s.RecoveryThreadNum = &v
	return s
}

func (s *AppRecoveryVO) SetUsed(v bool) *AppRecoveryVO {
	s.Used = &v
	return s
}

// 联调记录中的发起方信息
type DebugInitiator struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 数据源名
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty" require:"true"`
	// 主事务记录表
	ActivityTableName *string `json:"activity_table_name,omitempty" xml:"activity_table_name,omitempty" require:"true"`
}

func (s DebugInitiator) String() string {
	return tea.Prettify(s)
}

func (s DebugInitiator) GoString() string {
	return s.String()
}

func (s *DebugInitiator) SetAppName(v string) *DebugInitiator {
	s.AppName = &v
	return s
}

func (s *DebugInitiator) SetDsName(v string) *DebugInitiator {
	s.DsName = &v
	return s
}

func (s *DebugInitiator) SetActivityTableName(v string) *DebugInitiator {
	s.ActivityTableName = &v
	return s
}

// 应用信息
type AppInfo struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 创建人
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 应用owner
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s AppInfo) String() string {
	return tea.Prettify(s)
}

func (s AppInfo) GoString() string {
	return s.String()
}

func (s *AppInfo) SetAppName(v string) *AppInfo {
	s.AppName = &v
	return s
}

func (s *AppInfo) SetCreator(v string) *AppInfo {
	s.Creator = &v
	return s
}

func (s *AppInfo) SetGmtCreate(v string) *AppInfo {
	s.GmtCreate = &v
	return s
}

func (s *AppInfo) SetGmtModified(v string) *AppInfo {
	s.GmtModified = &v
	return s
}

func (s *AppInfo) SetOwner(v string) *AppInfo {
	s.Owner = &v
	return s
}

func (s *AppInfo) SetInstanceId(v string) *AppInfo {
	s.InstanceId = &v
	return s
}

// 主事务趋势图
type ActivityTrend struct {
	// 时间点
	Time *int64 `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 成功数
	Success *int64 `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 回滚数
	Rollback *int64 `json:"rollback,omitempty" xml:"rollback,omitempty" require:"true"`
}

func (s ActivityTrend) String() string {
	return tea.Prettify(s)
}

func (s ActivityTrend) GoString() string {
	return s.String()
}

func (s *ActivityTrend) SetTime(v int64) *ActivityTrend {
	s.Time = &v
	return s
}

func (s *ActivityTrend) SetTotal(v int64) *ActivityTrend {
	s.Total = &v
	return s
}

func (s *ActivityTrend) SetSuccess(v int64) *ActivityTrend {
	s.Success = &v
	return s
}

func (s *ActivityTrend) SetRollback(v int64) *ActivityTrend {
	s.Rollback = &v
	return s
}

// 参与者信息
type Participator struct {
	// 参与者名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 类全名，包括完整包名
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty"`
	// 提交方法名称
	CommitMethodName *string `json:"commit_method_name,omitempty" xml:"commit_method_name,omitempty"`
	// 提交方法参数
	CommitMethodParamsType *int64 `json:"commit_method_params_type,omitempty" xml:"commit_method_params_type,omitempty"`
	// 弹性key
	ElasticKey *string `json:"elastic_key,omitempty" xml:"elastic_key,omitempty"`
	// 弹性路由规则（Groovy脚本）
	ElasticRouteRule *string `json:"elastic_route_rule,omitempty" xml:"elastic_route_rule,omitempty"`
	// 记录id，更新必传
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// rpc是否ldc调用
	IsZoneRoute *bool `json:"is_zone_route,omitempty" xml:"is_zone_route,omitempty"`
	// 回滚方法名称
	RollbackMethodName *string `json:"rollback_method_name,omitempty" xml:"rollback_method_name,omitempty"`
	// 回滚方法的参数类型
	RollbackMethodParamsType *int64 `json:"rollback_method_params_type,omitempty" xml:"rollback_method_params_type,omitempty"`
	// rpc接口测试地址
	TestUrl *string `json:"test_url,omitempty" xml:"test_url,omitempty"`
	// rpc uniqueId
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// 是否被使用
	Used *bool `json:"used,omitempty" xml:"used,omitempty"`
	// rpc协议，ws或tr
	WsTr *string `json:"ws_tr,omitempty" xml:"ws_tr,omitempty"`
}

func (s Participator) String() string {
	return tea.Prettify(s)
}

func (s Participator) GoString() string {
	return s.String()
}

func (s *Participator) SetActionName(v string) *Participator {
	s.ActionName = &v
	return s
}

func (s *Participator) SetAppName(v string) *Participator {
	s.AppName = &v
	return s
}

func (s *Participator) SetClassName(v string) *Participator {
	s.ClassName = &v
	return s
}

func (s *Participator) SetCommitMethodName(v string) *Participator {
	s.CommitMethodName = &v
	return s
}

func (s *Participator) SetCommitMethodParamsType(v int64) *Participator {
	s.CommitMethodParamsType = &v
	return s
}

func (s *Participator) SetElasticKey(v string) *Participator {
	s.ElasticKey = &v
	return s
}

func (s *Participator) SetElasticRouteRule(v string) *Participator {
	s.ElasticRouteRule = &v
	return s
}

func (s *Participator) SetId(v int64) *Participator {
	s.Id = &v
	return s
}

func (s *Participator) SetInstanceId(v string) *Participator {
	s.InstanceId = &v
	return s
}

func (s *Participator) SetIsZoneRoute(v bool) *Participator {
	s.IsZoneRoute = &v
	return s
}

func (s *Participator) SetRollbackMethodName(v string) *Participator {
	s.RollbackMethodName = &v
	return s
}

func (s *Participator) SetRollbackMethodParamsType(v int64) *Participator {
	s.RollbackMethodParamsType = &v
	return s
}

func (s *Participator) SetTestUrl(v string) *Participator {
	s.TestUrl = &v
	return s
}

func (s *Participator) SetUniqueId(v string) *Participator {
	s.UniqueId = &v
	return s
}

func (s *Participator) SetUsed(v bool) *Participator {
	s.Used = &v
	return s
}

func (s *Participator) SetWsTr(v string) *Participator {
	s.WsTr = &v
	return s
}

// 发起方数据源
type InitiatorDatasource struct {
	// 分支事务表索引结束点
	ActionTableIndexEnd *int64 `json:"action_table_index_end,omitempty" xml:"action_table_index_end,omitempty"`
	// 分支事务表索引起始点
	ActionTableIndexStart *int64 `json:"action_table_index_start,omitempty" xml:"action_table_index_start,omitempty"`
	// 分支事务表模板
	ActionTableNameFormat *string `json:"action_table_name_format,omitempty" xml:"action_table_name_format,omitempty"`
	// 主事务表索引结束点
	ActivityTableIndexEnd *int64 `json:"activity_table_index_end,omitempty" xml:"activity_table_index_end,omitempty"`
	// 主事务表索引起始点
	ActivityTableIndexStart *int64 `json:"activity_table_index_start,omitempty" xml:"activity_table_index_start,omitempty"`
	// 主事务表模板
	ActivityTableNameFormat *string `json:"activity_table_name_format,omitempty" xml:"activity_table_name_format,omitempty"`
	// DB最小连接数
	DbConnectMin *int64 `json:"db_connect_min,omitempty" xml:"db_connect_min,omitempty" require:"true"`
	// DB最大连接数
	DbConnMax *int64 `json:"db_conn_max,omitempty" xml:"db_conn_max,omitempty" require:"true"`
	// 数据库类型
	DbType *int64 `json:"db_type,omitempty" xml:"db_type,omitempty" require:"true"`
	// 数据源索引结束点
	DsIndexEnd *int64 `json:"ds_index_end,omitempty" xml:"ds_index_end,omitempty"`
	// 数据源索引起始点
	DsIndexStart *int64 `json:"ds_index_start,omitempty" xml:"ds_index_start,omitempty"`
	// 数据源名字
	DsNameFormat *string `json:"ds_name_format,omitempty" xml:"ds_name_format,omitempty"`
	// 唯一键，更新时需要
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// true：rzone部署，false：gzone部署
	IsLdc *bool `json:"is_ldc,omitempty" xml:"is_ldc,omitempty" require:"true"`
	// true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
	IsLocalDs *bool `json:"is_local_ds,omitempty" xml:"is_local_ds,omitempty" require:"true"`
	// gzone部署，国际IPAY站点使用
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty" require:"true"`
}

func (s InitiatorDatasource) String() string {
	return tea.Prettify(s)
}

func (s InitiatorDatasource) GoString() string {
	return s.String()
}

func (s *InitiatorDatasource) SetActionTableIndexEnd(v int64) *InitiatorDatasource {
	s.ActionTableIndexEnd = &v
	return s
}

func (s *InitiatorDatasource) SetActionTableIndexStart(v int64) *InitiatorDatasource {
	s.ActionTableIndexStart = &v
	return s
}

func (s *InitiatorDatasource) SetActionTableNameFormat(v string) *InitiatorDatasource {
	s.ActionTableNameFormat = &v
	return s
}

func (s *InitiatorDatasource) SetActivityTableIndexEnd(v int64) *InitiatorDatasource {
	s.ActivityTableIndexEnd = &v
	return s
}

func (s *InitiatorDatasource) SetActivityTableIndexStart(v int64) *InitiatorDatasource {
	s.ActivityTableIndexStart = &v
	return s
}

func (s *InitiatorDatasource) SetActivityTableNameFormat(v string) *InitiatorDatasource {
	s.ActivityTableNameFormat = &v
	return s
}

func (s *InitiatorDatasource) SetDbConnectMin(v int64) *InitiatorDatasource {
	s.DbConnectMin = &v
	return s
}

func (s *InitiatorDatasource) SetDbConnMax(v int64) *InitiatorDatasource {
	s.DbConnMax = &v
	return s
}

func (s *InitiatorDatasource) SetDbType(v int64) *InitiatorDatasource {
	s.DbType = &v
	return s
}

func (s *InitiatorDatasource) SetDsIndexEnd(v int64) *InitiatorDatasource {
	s.DsIndexEnd = &v
	return s
}

func (s *InitiatorDatasource) SetDsIndexStart(v int64) *InitiatorDatasource {
	s.DsIndexStart = &v
	return s
}

func (s *InitiatorDatasource) SetDsNameFormat(v string) *InitiatorDatasource {
	s.DsNameFormat = &v
	return s
}

func (s *InitiatorDatasource) SetId(v int64) *InitiatorDatasource {
	s.Id = &v
	return s
}

func (s *InitiatorDatasource) SetInstanceId(v string) *InitiatorDatasource {
	s.InstanceId = &v
	return s
}

func (s *InitiatorDatasource) SetIsLdc(v bool) *InitiatorDatasource {
	s.IsLdc = &v
	return s
}

func (s *InitiatorDatasource) SetIsLocalDs(v bool) *InitiatorDatasource {
	s.IsLocalDs = &v
	return s
}

func (s *InitiatorDatasource) SetZone(v string) *InitiatorDatasource {
	s.Zone = &v
	return s
}

// 分库分表规则
type SplitRule struct {
	// db_split_rule
	DbSplitRule *int64 `json:"db_split_rule,omitempty" xml:"db_split_rule,omitempty" require:"true"`
	// db_split_template
	DbSplitTemplate *string `json:"db_split_template,omitempty" xml:"db_split_template,omitempty"`
	// table_split_rule
	TableSplitRule *int64 `json:"table_split_rule,omitempty" xml:"table_split_rule,omitempty" require:"true"`
	// table_split_template
	TableSplitTemplate *string `json:"table_split_template,omitempty" xml:"table_split_template,omitempty"`
}

func (s SplitRule) String() string {
	return tea.Prettify(s)
}

func (s SplitRule) GoString() string {
	return s.String()
}

func (s *SplitRule) SetDbSplitRule(v int64) *SplitRule {
	s.DbSplitRule = &v
	return s
}

func (s *SplitRule) SetDbSplitTemplate(v string) *SplitRule {
	s.DbSplitTemplate = &v
	return s
}

func (s *SplitRule) SetTableSplitRule(v int64) *SplitRule {
	s.TableSplitRule = &v
	return s
}

func (s *SplitRule) SetTableSplitTemplate(v string) *SplitRule {
	s.TableSplitTemplate = &v
	return s
}

// 事务详情
type TransactionInfo struct {
	// Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// 业务码
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 业务id
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发起方ip
	InitiatorIp *string `json:"initiator_ip,omitempty" xml:"initiator_ip,omitempty" require:"true"`
	// 发起方名称
	InitiatorName *string `json:"initiator_name,omitempty" xml:"initiator_name,omitempty" require:"true"`
	// 最近修改时间
	ModifyTime *string `json:"modify_time,omitempty" xml:"modify_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 参与者id列表
	ParticipatorIds []*string `json:"participator_ids,omitempty" xml:"participator_ids,omitempty" require:"true" type:"Repeated"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 事务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s TransactionInfo) String() string {
	return tea.Prettify(s)
}

func (s TransactionInfo) GoString() string {
	return s.String()
}

func (s *TransactionInfo) SetActionMode(v int64) *TransactionInfo {
	s.ActionMode = &v
	return s
}

func (s *TransactionInfo) SetBizType(v string) *TransactionInfo {
	s.BizType = &v
	return s
}

func (s *TransactionInfo) SetBusinessId(v string) *TransactionInfo {
	s.BusinessId = &v
	return s
}

func (s *TransactionInfo) SetEndTime(v string) *TransactionInfo {
	s.EndTime = &v
	return s
}

func (s *TransactionInfo) SetInitiatorIp(v string) *TransactionInfo {
	s.InitiatorIp = &v
	return s
}

func (s *TransactionInfo) SetInitiatorName(v string) *TransactionInfo {
	s.InitiatorName = &v
	return s
}

func (s *TransactionInfo) SetModifyTime(v string) *TransactionInfo {
	s.ModifyTime = &v
	return s
}

func (s *TransactionInfo) SetParticipatorIds(v []*string) *TransactionInfo {
	s.ParticipatorIds = v
	return s
}

func (s *TransactionInfo) SetStartTime(v string) *TransactionInfo {
	s.StartTime = &v
	return s
}

func (s *TransactionInfo) SetStatus(v string) *TransactionInfo {
	s.Status = &v
	return s
}

func (s *TransactionInfo) SetTxId(v string) *TransactionInfo {
	s.TxId = &v
	return s
}

// 联调记录中的参与者信息
type DebugParticipator struct {
	// 主事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// 分支事务id
	ActionId *string `json:"action_id,omitempty" xml:"action_id,omitempty" require:"true"`
	// 参与者名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 1：提交，2：回滚
	ActionType *int64 `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// 主事务上下文
	ActivityContext *string `json:"activity_context,omitempty" xml:"activity_context,omitempty" require:"true"`
	// 分支事务上下文
	ActionContext *string `json:"action_context,omitempty" xml:"action_context,omitempty" require:"true"`
}

func (s DebugParticipator) String() string {
	return tea.Prettify(s)
}

func (s DebugParticipator) GoString() string {
	return s.String()
}

func (s *DebugParticipator) SetTxId(v string) *DebugParticipator {
	s.TxId = &v
	return s
}

func (s *DebugParticipator) SetActionId(v string) *DebugParticipator {
	s.ActionId = &v
	return s
}

func (s *DebugParticipator) SetActionName(v string) *DebugParticipator {
	s.ActionName = &v
	return s
}

func (s *DebugParticipator) SetActionType(v int64) *DebugParticipator {
	s.ActionType = &v
	return s
}

func (s *DebugParticipator) SetActivityContext(v string) *DebugParticipator {
	s.ActivityContext = &v
	return s
}

func (s *DebugParticipator) SetActionContext(v string) *DebugParticipator {
	s.ActionContext = &v
	return s
}

// 分支事务数趋势图
type ActionTrend struct {
	// 时间点
	Time *int64 `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 成功数
	Success *int64 `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 回滚数
	Rollback *int64 `json:"rollback,omitempty" xml:"rollback,omitempty" require:"true"`
}

func (s ActionTrend) String() string {
	return tea.Prettify(s)
}

func (s ActionTrend) GoString() string {
	return s.String()
}

func (s *ActionTrend) SetTime(v int64) *ActionTrend {
	s.Time = &v
	return s
}

func (s *ActionTrend) SetTotal(v int64) *ActionTrend {
	s.Total = &v
	return s
}

func (s *ActionTrend) SetSuccess(v int64) *ActionTrend {
	s.Success = &v
	return s
}

func (s *ActionTrend) SetRollback(v int64) *ActionTrend {
	s.Rollback = &v
	return s
}

// 异常事务数趋势图
type ExceptionTrend struct {
	// 时间点
	Time *int64 `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 异常事务数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
}

func (s ExceptionTrend) String() string {
	return tea.Prettify(s)
}

func (s ExceptionTrend) GoString() string {
	return s.String()
}

func (s *ExceptionTrend) SetTime(v int64) *ExceptionTrend {
	s.Time = &v
	return s
}

func (s *ExceptionTrend) SetTotal(v int64) *ExceptionTrend {
	s.Total = &v
	return s
}

// 事务详情 参与者信息
type TransactionsParticipator struct {
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// method_name
	MethodName *string `json:"method_name,omitempty" xml:"method_name,omitempty" require:"true"`
	// method_type
	MethodType *string `json:"method_type,omitempty" xml:"method_type,omitempty" require:"true"`
	// rsDesc
	RsDesc *string `json:"rs_desc,omitempty" xml:"rs_desc,omitempty" require:"true"`
	// rs_type
	RsType *string `json:"rs_type,omitempty" xml:"rs_type,omitempty" require:"true"`
}

func (s TransactionsParticipator) String() string {
	return tea.Prettify(s)
}

func (s TransactionsParticipator) GoString() string {
	return s.String()
}

func (s *TransactionsParticipator) SetAppName(v string) *TransactionsParticipator {
	s.AppName = &v
	return s
}

func (s *TransactionsParticipator) SetId(v string) *TransactionsParticipator {
	s.Id = &v
	return s
}

func (s *TransactionsParticipator) SetMethodName(v string) *TransactionsParticipator {
	s.MethodName = &v
	return s
}

func (s *TransactionsParticipator) SetMethodType(v string) *TransactionsParticipator {
	s.MethodType = &v
	return s
}

func (s *TransactionsParticipator) SetRsDesc(v string) *TransactionsParticipator {
	s.RsDesc = &v
	return s
}

func (s *TransactionsParticipator) SetRsType(v string) *TransactionsParticipator {
	s.RsType = &v
	return s
}

// TransactionEdge
type TransactionEdge struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// source
	Source *int64 `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// target
	Target *int64 `json:"target,omitempty" xml:"target,omitempty" require:"true"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// isError
	IsError *bool `json:"is_error,omitempty" xml:"is_error,omitempty" require:"true"`
	// error_message
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
}

func (s TransactionEdge) String() string {
	return tea.Prettify(s)
}

func (s TransactionEdge) GoString() string {
	return s.String()
}

func (s *TransactionEdge) SetId(v int64) *TransactionEdge {
	s.Id = &v
	return s
}

func (s *TransactionEdge) SetSource(v int64) *TransactionEdge {
	s.Source = &v
	return s
}

func (s *TransactionEdge) SetTarget(v int64) *TransactionEdge {
	s.Target = &v
	return s
}

func (s *TransactionEdge) SetType(v string) *TransactionEdge {
	s.Type = &v
	return s
}

func (s *TransactionEdge) SetContent(v string) *TransactionEdge {
	s.Content = &v
	return s
}

func (s *TransactionEdge) SetIsError(v bool) *TransactionEdge {
	s.IsError = &v
	return s
}

func (s *TransactionEdge) SetErrorMessage(v string) *TransactionEdge {
	s.ErrorMessage = &v
	return s
}

// 环境信息
type EnvInfo struct {
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 是否公有云环境
	IsPublicCloud *bool `json:"is_public_cloud,omitempty" xml:"is_public_cloud,omitempty" require:"true"`
	// 租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// server / client
	RecoveryMode *string `json:"recovery_mode,omitempty" xml:"recovery_mode,omitempty" require:"true"`
}

func (s EnvInfo) String() string {
	return tea.Prettify(s)
}

func (s EnvInfo) GoString() string {
	return s.String()
}

func (s *EnvInfo) SetEnv(v string) *EnvInfo {
	s.Env = &v
	return s
}

func (s *EnvInfo) SetIsPublicCloud(v bool) *EnvInfo {
	s.IsPublicCloud = &v
	return s
}

func (s *EnvInfo) SetTenant(v string) *EnvInfo {
	s.Tenant = &v
	return s
}

func (s *EnvInfo) SetRecoveryMode(v string) *EnvInfo {
	s.RecoveryMode = &v
	return s
}

// 发起方数据源存储实体
type RecoveryDsDTO struct {
	// 分支事务表索引结束点
	ActionTableIndexEnd *int64 `json:"action_table_index_end,omitempty" xml:"action_table_index_end,omitempty"`
	// 分支事务表索引起始点
	//
	ActionTableIndexStart *int64 `json:"action_table_index_start,omitempty" xml:"action_table_index_start,omitempty"`
	// 分支事务表模板
	//
	ActionTableNameFormat *string `json:"action_table_name_format,omitempty" xml:"action_table_name_format,omitempty"`
	// 主事务表索引结束点
	ActivityTableIndexEnd *int64 `json:"activity_table_index_end,omitempty" xml:"activity_table_index_end,omitempty"`
	// 主事务表索引起始点
	//
	ActivityTableIndexStart *int64 `json:"activity_table_index_start,omitempty" xml:"activity_table_index_start,omitempty"`
	// 主事务表模板
	ActivityTableNameFormat *string `json:"activity_table_name_format,omitempty" xml:"activity_table_name_format,omitempty"`
	// DB最小连接数
	//
	DbConnectMin *int64 `json:"db_connect_min,omitempty" xml:"db_connect_min,omitempty"`
	// DB最大连接数
	DbConnMax *int64 `json:"db_conn_max,omitempty" xml:"db_conn_max,omitempty"`
	// 数据库类型
	//
	DbType *int64 `json:"db_type,omitempty" xml:"db_type,omitempty"`
	// 数据源索引结束点
	//
	DsIndexEnd *int64 `json:"ds_index_end,omitempty" xml:"ds_index_end,omitempty"`
	// 数据源索引起始点
	//
	DsIndexStart *int64 `json:"ds_index_start,omitempty" xml:"ds_index_start,omitempty"`
	// 数据源名字
	DsNameFormat *string `json:"ds_name_format,omitempty" xml:"ds_name_format,omitempty"`
	// 发起方组groupid
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
	// 主键id 更新时传一下
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// true：rzone部署，false：gzone部署
	IsLdc *bool `json:"is_ldc,omitempty" xml:"is_ldc,omitempty"`
	// true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
	IsLocalDs *bool `json:"is_local_ds,omitempty" xml:"is_local_ds,omitempty"`
	// gzone部署，国际IPAY站点使用
	Zone *string `json:"zone,omitempty" xml:"zone,omitempty"`
	// 恢复任务名称模板
	TaskNameFormat *string `json:"task_name_format,omitempty" xml:"task_name_format,omitempty"`
	// 恢复任务起始索引
	TaskIndexStart *int64 `json:"task_index_start,omitempty" xml:"task_index_start,omitempty"`
	// 恢复任务结束索引
	TaskIndexEnd *int64 `json:"task_index_end,omitempty" xml:"task_index_end,omitempty"`
}

func (s RecoveryDsDTO) String() string {
	return tea.Prettify(s)
}

func (s RecoveryDsDTO) GoString() string {
	return s.String()
}

func (s *RecoveryDsDTO) SetActionTableIndexEnd(v int64) *RecoveryDsDTO {
	s.ActionTableIndexEnd = &v
	return s
}

func (s *RecoveryDsDTO) SetActionTableIndexStart(v int64) *RecoveryDsDTO {
	s.ActionTableIndexStart = &v
	return s
}

func (s *RecoveryDsDTO) SetActionTableNameFormat(v string) *RecoveryDsDTO {
	s.ActionTableNameFormat = &v
	return s
}

func (s *RecoveryDsDTO) SetActivityTableIndexEnd(v int64) *RecoveryDsDTO {
	s.ActivityTableIndexEnd = &v
	return s
}

func (s *RecoveryDsDTO) SetActivityTableIndexStart(v int64) *RecoveryDsDTO {
	s.ActivityTableIndexStart = &v
	return s
}

func (s *RecoveryDsDTO) SetActivityTableNameFormat(v string) *RecoveryDsDTO {
	s.ActivityTableNameFormat = &v
	return s
}

func (s *RecoveryDsDTO) SetDbConnectMin(v int64) *RecoveryDsDTO {
	s.DbConnectMin = &v
	return s
}

func (s *RecoveryDsDTO) SetDbConnMax(v int64) *RecoveryDsDTO {
	s.DbConnMax = &v
	return s
}

func (s *RecoveryDsDTO) SetDbType(v int64) *RecoveryDsDTO {
	s.DbType = &v
	return s
}

func (s *RecoveryDsDTO) SetDsIndexEnd(v int64) *RecoveryDsDTO {
	s.DsIndexEnd = &v
	return s
}

func (s *RecoveryDsDTO) SetDsIndexStart(v int64) *RecoveryDsDTO {
	s.DsIndexStart = &v
	return s
}

func (s *RecoveryDsDTO) SetDsNameFormat(v string) *RecoveryDsDTO {
	s.DsNameFormat = &v
	return s
}

func (s *RecoveryDsDTO) SetGroupId(v string) *RecoveryDsDTO {
	s.GroupId = &v
	return s
}

func (s *RecoveryDsDTO) SetId(v int64) *RecoveryDsDTO {
	s.Id = &v
	return s
}

func (s *RecoveryDsDTO) SetIsLdc(v bool) *RecoveryDsDTO {
	s.IsLdc = &v
	return s
}

func (s *RecoveryDsDTO) SetIsLocalDs(v bool) *RecoveryDsDTO {
	s.IsLocalDs = &v
	return s
}

func (s *RecoveryDsDTO) SetZone(v string) *RecoveryDsDTO {
	s.Zone = &v
	return s
}

func (s *RecoveryDsDTO) SetTaskNameFormat(v string) *RecoveryDsDTO {
	s.TaskNameFormat = &v
	return s
}

func (s *RecoveryDsDTO) SetTaskIndexStart(v int64) *RecoveryDsDTO {
	s.TaskIndexStart = &v
	return s
}

func (s *RecoveryDsDTO) SetTaskIndexEnd(v int64) *RecoveryDsDTO {
	s.TaskIndexEnd = &v
	return s
}

// Instance信息
type InstanceDTO struct {
	// instance id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
}

func (s InstanceDTO) String() string {
	return tea.Prettify(s)
}

func (s InstanceDTO) GoString() string {
	return s.String()
}

func (s *InstanceDTO) SetInstanceId(v string) *InstanceDTO {
	s.InstanceId = &v
	return s
}

func (s *InstanceDTO) SetTenantId(v string) *InstanceDTO {
	s.TenantId = &v
	return s
}

func (s *InstanceDTO) SetWorkspaceId(v string) *InstanceDTO {
	s.WorkspaceId = &v
	return s
}

// 切换动作
type SwitchoverAction struct {
	// 目标单元
	DestCell *string `json:"dest_cell,omitempty" xml:"dest_cell,omitempty"`
	// 来源单元
	SourceCell *string `json:"source_cell,omitempty" xml:"source_cell,omitempty"`
}

func (s SwitchoverAction) String() string {
	return tea.Prettify(s)
}

func (s SwitchoverAction) GoString() string {
	return s.String()
}

func (s *SwitchoverAction) SetDestCell(v string) *SwitchoverAction {
	s.DestCell = &v
	return s
}

func (s *SwitchoverAction) SetSourceCell(v string) *SwitchoverAction {
	s.SourceCell = &v
	return s
}

// 事务趋势图
type Trend struct {
	// 分支事务数趋势图
	ActionTrend []*ActionTrend `json:"action_trend,omitempty" xml:"action_trend,omitempty" require:"true" type:"Repeated"`
	// 主事务数趋势图
	ActivityTrend []*ActivityTrend `json:"activity_trend,omitempty" xml:"activity_trend,omitempty" require:"true" type:"Repeated"`
	// 事务失败数趋势图
	ExceptionTrend []*ExceptionTrend `json:"exception_trend,omitempty" xml:"exception_trend,omitempty" require:"true" type:"Repeated"`
}

func (s Trend) String() string {
	return tea.Prettify(s)
}

func (s Trend) GoString() string {
	return s.String()
}

func (s *Trend) SetActionTrend(v []*ActionTrend) *Trend {
	s.ActionTrend = v
	return s
}

func (s *Trend) SetActivityTrend(v []*ActivityTrend) *Trend {
	s.ActivityTrend = v
	return s
}

func (s *Trend) SetExceptionTrend(v []*ExceptionTrend) *Trend {
	s.ExceptionTrend = v
	return s
}

// 应用列表 应用信息
type AppInfoVO struct {
	// 参与者数组
	ActionArray []*Participator `json:"action_array,omitempty" xml:"action_array,omitempty" require:"true" type:"Repeated"`
	// 10
	ActionCount *int64 `json:"action_count,omitempty" xml:"action_count,omitempty" require:"true"`
	// 10
	ActivityCount *int64 `json:"activity_count,omitempty" xml:"activity_count,omitempty" require:"true"`
	// 1 同库 2 异库
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// app
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 分库规则
	DbRuleName *string `json:"db_rule_name,omitempty" xml:"db_rule_name,omitempty" require:"true"`
	// 分库规则
	DbRuleTemplate *string `json:"db_rule_template,omitempty" xml:"db_rule_template,omitempty" require:"true"`
	// 一句话描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 唯一id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 1
	RecoveryArray []*AppRecoveryVO `json:"recovery_array,omitempty" xml:"recovery_array,omitempty" require:"true" type:"Repeated"`
	// 分表类型
	TableRuleName *string `json:"table_rule_name,omitempty" xml:"table_rule_name,omitempty" require:"true"`
	// 分表规则
	TableRuleTemplate *string `json:"table_rule_template,omitempty" xml:"table_rule_template,omitempty" require:"true"`
	// 是否被使用
	Used *bool `json:"used,omitempty" xml:"used,omitempty" require:"true"`
	// 1 单库单表 2 分库分表
	SpliteMode *int64 `json:"splite_mode,omitempty" xml:"splite_mode,omitempty" require:"true"`
}

func (s AppInfoVO) String() string {
	return tea.Prettify(s)
}

func (s AppInfoVO) GoString() string {
	return s.String()
}

func (s *AppInfoVO) SetActionArray(v []*Participator) *AppInfoVO {
	s.ActionArray = v
	return s
}

func (s *AppInfoVO) SetActionCount(v int64) *AppInfoVO {
	s.ActionCount = &v
	return s
}

func (s *AppInfoVO) SetActivityCount(v int64) *AppInfoVO {
	s.ActivityCount = &v
	return s
}

func (s *AppInfoVO) SetActivityMode(v int64) *AppInfoVO {
	s.ActivityMode = &v
	return s
}

func (s *AppInfoVO) SetAppName(v string) *AppInfoVO {
	s.AppName = &v
	return s
}

func (s *AppInfoVO) SetDbRuleName(v string) *AppInfoVO {
	s.DbRuleName = &v
	return s
}

func (s *AppInfoVO) SetDbRuleTemplate(v string) *AppInfoVO {
	s.DbRuleTemplate = &v
	return s
}

func (s *AppInfoVO) SetDesc(v string) *AppInfoVO {
	s.Desc = &v
	return s
}

func (s *AppInfoVO) SetId(v int64) *AppInfoVO {
	s.Id = &v
	return s
}

func (s *AppInfoVO) SetRecoveryArray(v []*AppRecoveryVO) *AppInfoVO {
	s.RecoveryArray = v
	return s
}

func (s *AppInfoVO) SetTableRuleName(v string) *AppInfoVO {
	s.TableRuleName = &v
	return s
}

func (s *AppInfoVO) SetTableRuleTemplate(v string) *AppInfoVO {
	s.TableRuleTemplate = &v
	return s
}

func (s *AppInfoVO) SetUsed(v bool) *AppInfoVO {
	s.Used = &v
	return s
}

func (s *AppInfoVO) SetSpliteMode(v int64) *AppInfoVO {
	s.SpliteMode = &v
	return s
}

// DsName & DsNameFormat
type DsNameInfo struct {
	// ds_name
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty" require:"true"`
	// ds_name_format
	DsNameFormat *string `json:"ds_name_format,omitempty" xml:"ds_name_format,omitempty" require:"true"`
}

func (s DsNameInfo) String() string {
	return tea.Prettify(s)
}

func (s DsNameInfo) GoString() string {
	return s.String()
}

func (s *DsNameInfo) SetDsName(v string) *DsNameInfo {
	s.DsName = &v
	return s
}

func (s *DsNameInfo) SetDsNameFormat(v string) *DsNameInfo {
	s.DsNameFormat = &v
	return s
}

// 批量添加发起方 DO
type RecoveryDTO struct {
	// 客户端版本
	//
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty"`
	// 发起方组编号
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty"`
	// 主键id，更新时需要
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 是否异步化
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty"`
	// 是否压测任务
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty"`
	// 是否混合模式
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty"`
	// 恢复条数/分/表
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty"`
	// 恢复线程数
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty"`
}

func (s RecoveryDTO) String() string {
	return tea.Prettify(s)
}

func (s RecoveryDTO) GoString() string {
	return s.String()
}

func (s *RecoveryDTO) SetClientVersion(v string) *RecoveryDTO {
	s.ClientVersion = &v
	return s
}

func (s *RecoveryDTO) SetGroupId(v string) *RecoveryDTO {
	s.GroupId = &v
	return s
}

func (s *RecoveryDTO) SetId(v int64) *RecoveryDTO {
	s.Id = &v
	return s
}

func (s *RecoveryDTO) SetIsAsyn(v bool) *RecoveryDTO {
	s.IsAsyn = &v
	return s
}

func (s *RecoveryDTO) SetIsLoadTest(v bool) *RecoveryDTO {
	s.IsLoadTest = &v
	return s
}

func (s *RecoveryDTO) SetIsMix(v bool) *RecoveryDTO {
	s.IsMix = &v
	return s
}

func (s *RecoveryDTO) SetRecoveryLimit(v int64) *RecoveryDTO {
	s.RecoveryLimit = &v
	return s
}

func (s *RecoveryDTO) SetRecoveryThreadNum(v int64) *RecoveryDTO {
	s.RecoveryThreadNum = &v
	return s
}

// k:v
type Pair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Pair) String() string {
	return tea.Prettify(s)
}

func (s Pair) GoString() string {
	return s.String()
}

func (s *Pair) SetKey(v string) *Pair {
	s.Key = &v
	return s
}

func (s *Pair) SetValue(v string) *Pair {
	s.Value = &v
	return s
}

// app and action view object
type AppActionVO struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 参与者名称数组
	ActionArray []*string `json:"action_array,omitempty" xml:"action_array,omitempty" require:"true" type:"Repeated"`
}

func (s AppActionVO) String() string {
	return tea.Prettify(s)
}

func (s AppActionVO) GoString() string {
	return s.String()
}

func (s *AppActionVO) SetAppName(v string) *AppActionVO {
	s.AppName = &v
	return s
}

func (s *AppActionVO) SetActionArray(v []*string) *AppActionVO {
	s.ActionArray = v
	return s
}

// 发起方信息
type Initiator struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 客户端版本
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty" require:"true"`
	// 记录id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 是否异步化
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty" require:"true"`
	// 是否压测任务
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 是否混合模式
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty" require:"true"`
	// 发起方数据源
	RecoveryDatasources []*InitiatorDatasource `json:"recovery_datasources,omitempty" xml:"recovery_datasources,omitempty" require:"true" type:"Repeated"`
	// 恢复条数/分/表
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty"`
	// 恢复线程数
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty"`
}

func (s Initiator) String() string {
	return tea.Prettify(s)
}

func (s Initiator) GoString() string {
	return s.String()
}

func (s *Initiator) SetAppName(v string) *Initiator {
	s.AppName = &v
	return s
}

func (s *Initiator) SetClientVersion(v string) *Initiator {
	s.ClientVersion = &v
	return s
}

func (s *Initiator) SetId(v int64) *Initiator {
	s.Id = &v
	return s
}

func (s *Initiator) SetInstanceId(v string) *Initiator {
	s.InstanceId = &v
	return s
}

func (s *Initiator) SetIsAsyn(v bool) *Initiator {
	s.IsAsyn = &v
	return s
}

func (s *Initiator) SetIsLoadTest(v bool) *Initiator {
	s.IsLoadTest = &v
	return s
}

func (s *Initiator) SetIsMix(v bool) *Initiator {
	s.IsMix = &v
	return s
}

func (s *Initiator) SetRecoveryDatasources(v []*InitiatorDatasource) *Initiator {
	s.RecoveryDatasources = v
	return s
}

func (s *Initiator) SetRecoveryLimit(v int64) *Initiator {
	s.RecoveryLimit = &v
	return s
}

func (s *Initiator) SetRecoveryThreadNum(v int64) *Initiator {
	s.RecoveryThreadNum = &v
	return s
}

// 发起方appinfo
type TrasactionAppInfo struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// recovery_id
	RecoveryId *int64 `json:"recovery_id,omitempty" xml:"recovery_id,omitempty" require:"true"`
}

func (s TrasactionAppInfo) String() string {
	return tea.Prettify(s)
}

func (s TrasactionAppInfo) GoString() string {
	return s.String()
}

func (s *TrasactionAppInfo) SetAppName(v string) *TrasactionAppInfo {
	s.AppName = &v
	return s
}

func (s *TrasactionAppInfo) SetRecoveryId(v int64) *TrasactionAppInfo {
	s.RecoveryId = &v
	return s
}

// app信息及统计信息
type AppStats struct {
	// app name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 异常数
	ExceptionTotal *int64 `json:"exception_total,omitempty" xml:"exception_total,omitempty"`
	// 时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发起方
	Initiator []*string `json:"initiator,omitempty" xml:"initiator,omitempty" type:"Repeated"`
	// 参与者
	Participator []*string `json:"participator,omitempty" xml:"participator,omitempty" type:"Repeated"`
	// 今日事务总数
	TodayTotal *int64 `json:"today_total,omitempty" xml:"today_total,omitempty"`
	// Saga模式返回3，其它模式不返回
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// 字段ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
}

func (s AppStats) String() string {
	return tea.Prettify(s)
}

func (s AppStats) GoString() string {
	return s.String()
}

func (s *AppStats) SetAppName(v string) *AppStats {
	s.AppName = &v
	return s
}

func (s *AppStats) SetExceptionTotal(v int64) *AppStats {
	s.ExceptionTotal = &v
	return s
}

func (s *AppStats) SetGmtCreate(v string) *AppStats {
	s.GmtCreate = &v
	return s
}

func (s *AppStats) SetInitiator(v []*string) *AppStats {
	s.Initiator = v
	return s
}

func (s *AppStats) SetParticipator(v []*string) *AppStats {
	s.Participator = v
	return s
}

func (s *AppStats) SetTodayTotal(v int64) *AppStats {
	s.TodayTotal = &v
	return s
}

func (s *AppStats) SetActionMode(v int64) *AppStats {
	s.ActionMode = &v
	return s
}

func (s *AppStats) SetId(v int64) *AppStats {
	s.Id = &v
	return s
}

// 悬挂事务恢复详情
type Correction struct {
	// 分支事务上下文
	ActionContext *string `json:"action_context,omitempty" xml:"action_context,omitempty" require:"true"`
	// 参与者名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 1：提交，2：回滚
	ActionType *int64 `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// 主事务上下文
	ActivityContext *string `json:"activity_context,omitempty" xml:"activity_context,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 记录id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 0 已提交  4 已执行
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 是否同步主账务；0、不同步，1、同步
	SyncAcctrans *int64 `json:"sync_acctrans,omitempty" xml:"sync_acctrans,omitempty" require:"true"`
	// 是否同步统一支付；0、不同步，1同步
	SyncPaycore *int64 `json:"sync_paycore,omitempty" xml:"sync_paycore,omitempty" require:"true"`
	// tracer上下文
	TracerContext *string `json:"tracer_context,omitempty" xml:"tracer_context,omitempty"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s Correction) String() string {
	return tea.Prettify(s)
}

func (s Correction) GoString() string {
	return s.String()
}

func (s *Correction) SetActionContext(v string) *Correction {
	s.ActionContext = &v
	return s
}

func (s *Correction) SetActionName(v string) *Correction {
	s.ActionName = &v
	return s
}

func (s *Correction) SetActionType(v int64) *Correction {
	s.ActionType = &v
	return s
}

func (s *Correction) SetActivityContext(v string) *Correction {
	s.ActivityContext = &v
	return s
}

func (s *Correction) SetAppName(v string) *Correction {
	s.AppName = &v
	return s
}

func (s *Correction) SetGmtCreate(v string) *Correction {
	s.GmtCreate = &v
	return s
}

func (s *Correction) SetId(v int64) *Correction {
	s.Id = &v
	return s
}

func (s *Correction) SetOperator(v string) *Correction {
	s.Operator = &v
	return s
}

func (s *Correction) SetState(v string) *Correction {
	s.State = &v
	return s
}

func (s *Correction) SetSyncAcctrans(v int64) *Correction {
	s.SyncAcctrans = &v
	return s
}

func (s *Correction) SetSyncPaycore(v int64) *Correction {
	s.SyncPaycore = &v
	return s
}

func (s *Correction) SetTracerContext(v string) *Correction {
	s.TracerContext = &v
	return s
}

func (s *Correction) SetTxId(v string) *Correction {
	s.TxId = &v
	return s
}

// 异库模式应用事务信息
type AsynDbTxInfo struct {
	// action_mode
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// activity_mode
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// desc
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// role
	Role *int64 `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// split_rule
	SplitRule *SplitRule `json:"split_rule,omitempty" xml:"split_rule,omitempty"`
}

func (s AsynDbTxInfo) String() string {
	return tea.Prettify(s)
}

func (s AsynDbTxInfo) GoString() string {
	return s.String()
}

func (s *AsynDbTxInfo) SetActionMode(v int64) *AsynDbTxInfo {
	s.ActionMode = &v
	return s
}

func (s *AsynDbTxInfo) SetActivityMode(v int64) *AsynDbTxInfo {
	s.ActivityMode = &v
	return s
}

func (s *AsynDbTxInfo) SetAppName(v string) *AsynDbTxInfo {
	s.AppName = &v
	return s
}

func (s *AsynDbTxInfo) SetBizType(v string) *AsynDbTxInfo {
	s.BizType = &v
	return s
}

func (s *AsynDbTxInfo) SetDesc(v string) *AsynDbTxInfo {
	s.Desc = &v
	return s
}

func (s *AsynDbTxInfo) SetInstanceId(v string) *AsynDbTxInfo {
	s.InstanceId = &v
	return s
}

func (s *AsynDbTxInfo) SetRole(v int64) *AsynDbTxInfo {
	s.Role = &v
	return s
}

func (s *AsynDbTxInfo) SetSplitRule(v *SplitRule) *AsynDbTxInfo {
	s.SplitRule = v
	return s
}

// 参与者信息
type ActionInfo struct {
	// action_mode
	ActionMode *string `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// action_name
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// commit
	Commit *string `json:"commit,omitempty" xml:"commit,omitempty" require:"true"`
	// rollback
	Rollback *string `json:"rollback,omitempty" xml:"rollback,omitempty" require:"true"`
	// ws_tr
	WsTr *string `json:"ws_tr,omitempty" xml:"ws_tr,omitempty" require:"true"`
}

func (s ActionInfo) String() string {
	return tea.Prettify(s)
}

func (s ActionInfo) GoString() string {
	return s.String()
}

func (s *ActionInfo) SetActionMode(v string) *ActionInfo {
	s.ActionMode = &v
	return s
}

func (s *ActionInfo) SetActionName(v string) *ActionInfo {
	s.ActionName = &v
	return s
}

func (s *ActionInfo) SetAppName(v string) *ActionInfo {
	s.AppName = &v
	return s
}

func (s *ActionInfo) SetCommit(v string) *ActionInfo {
	s.Commit = &v
	return s
}

func (s *ActionInfo) SetRollback(v string) *ActionInfo {
	s.Rollback = &v
	return s
}

func (s *ActionInfo) SetWsTr(v string) *ActionInfo {
	s.WsTr = &v
	return s
}

// 排序
type OrderByParams struct {
	// 排序字段
	OrderName *string `json:"order_name,omitempty" xml:"order_name,omitempty" require:"true"`
	// asc 正序  desc 倒序
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
}

func (s OrderByParams) String() string {
	return tea.Prettify(s)
}

func (s OrderByParams) GoString() string {
	return s.String()
}

func (s *OrderByParams) SetOrderName(v string) *OrderByParams {
	s.OrderName = &v
	return s
}

func (s *OrderByParams) SetOrderType(v string) *OrderByParams {
	s.OrderType = &v
	return s
}

// 联调记录，包括发起方联调和参与者联调
type DebugRecord struct {
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 1：发起方联调，2：参与者联调
	DebugType *int64 `json:"debug_type,omitempty" xml:"debug_type,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true"`
	// 记录id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 发起方信息
	Initiator *DebugInitiator `json:"initiator,omitempty" xml:"initiator,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 执行人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 参与者信息
	Participator *DebugParticipator `json:"participator,omitempty" xml:"participator,omitempty" require:"true"`
	// 状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 联调结果信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
}

func (s DebugRecord) String() string {
	return tea.Prettify(s)
}

func (s DebugRecord) GoString() string {
	return s.String()
}

func (s *DebugRecord) SetAppName(v string) *DebugRecord {
	s.AppName = &v
	return s
}

func (s *DebugRecord) SetDebugType(v int64) *DebugRecord {
	s.DebugType = &v
	return s
}

func (s *DebugRecord) SetGmtCreate(v string) *DebugRecord {
	s.GmtCreate = &v
	return s
}

func (s *DebugRecord) SetGmtModified(v string) *DebugRecord {
	s.GmtModified = &v
	return s
}

func (s *DebugRecord) SetId(v int64) *DebugRecord {
	s.Id = &v
	return s
}

func (s *DebugRecord) SetInitiator(v *DebugInitiator) *DebugRecord {
	s.Initiator = v
	return s
}

func (s *DebugRecord) SetInstanceId(v string) *DebugRecord {
	s.InstanceId = &v
	return s
}

func (s *DebugRecord) SetOperator(v string) *DebugRecord {
	s.Operator = &v
	return s
}

func (s *DebugRecord) SetParticipator(v *DebugParticipator) *DebugRecord {
	s.Participator = v
	return s
}

func (s *DebugRecord) SetState(v string) *DebugRecord {
	s.State = &v
	return s
}

func (s *DebugRecord) SetMsg(v string) *DebugRecord {
	s.Msg = &v
	return s
}

// 分表规则
type TableSplitRule struct {
	// 分表规则名
	RuleName *string `json:"rule_name,omitempty" xml:"rule_name,omitempty" require:"true"`
	// 格式模板
	RuleTemplate *string `json:"rule_template,omitempty" xml:"rule_template,omitempty" require:"true"`
}

func (s TableSplitRule) String() string {
	return tea.Prettify(s)
}

func (s TableSplitRule) GoString() string {
	return s.String()
}

func (s *TableSplitRule) SetRuleName(v string) *TableSplitRule {
	s.RuleName = &v
	return s
}

func (s *TableSplitRule) SetRuleTemplate(v string) *TableSplitRule {
	s.RuleTemplate = &v
	return s
}

// 白名单信息
type WhiteListInfo struct {
	// app_ame
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 机房选择：0非弹机房，1弹性机房；
	IsElastic *int64 `json:"is_elastic,omitempty" xml:"is_elastic,omitempty" require:"true"`
	// 0正常流量，1影子流量；
	IsLoadTest *int64 `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 数据源名称
	LogicalDsName *string `json:"logical_ds_name,omitempty" xml:"logical_ds_name,omitempty" require:"true"`
	// business_type
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
}

func (s WhiteListInfo) String() string {
	return tea.Prettify(s)
}

func (s WhiteListInfo) GoString() string {
	return s.String()
}

func (s *WhiteListInfo) SetAppName(v string) *WhiteListInfo {
	s.AppName = &v
	return s
}

func (s *WhiteListInfo) SetGmtCreate(v string) *WhiteListInfo {
	s.GmtCreate = &v
	return s
}

func (s *WhiteListInfo) SetId(v int64) *WhiteListInfo {
	s.Id = &v
	return s
}

func (s *WhiteListInfo) SetInstanceId(v string) *WhiteListInfo {
	s.InstanceId = &v
	return s
}

func (s *WhiteListInfo) SetIsElastic(v int64) *WhiteListInfo {
	s.IsElastic = &v
	return s
}

func (s *WhiteListInfo) SetIsLoadTest(v int64) *WhiteListInfo {
	s.IsLoadTest = &v
	return s
}

func (s *WhiteListInfo) SetLogicalDsName(v string) *WhiteListInfo {
	s.LogicalDsName = &v
	return s
}

func (s *WhiteListInfo) SetBusinessType(v string) *WhiteListInfo {
	s.BusinessType = &v
	return s
}

// 全局统计数据
type GlobalStats struct {
	// 异常事务数
	Exception *int64 `json:"exception,omitempty" xml:"exception,omitempty" require:"true"`
	// 进行中事务数
	Activity *int64 `json:"activity,omitempty" xml:"activity,omitempty" require:"true"`
	// 当天事务数
	Today *int64 `json:"today,omitempty" xml:"today,omitempty" require:"true"`
	// connection
	Connection *int64 `json:"connection,omitempty" xml:"connection,omitempty"`
}

func (s GlobalStats) String() string {
	return tea.Prettify(s)
}

func (s GlobalStats) GoString() string {
	return s.String()
}

func (s *GlobalStats) SetException(v int64) *GlobalStats {
	s.Exception = &v
	return s
}

func (s *GlobalStats) SetActivity(v int64) *GlobalStats {
	s.Activity = &v
	return s
}

func (s *GlobalStats) SetToday(v int64) *GlobalStats {
	s.Today = &v
	return s
}

func (s *GlobalStats) SetConnection(v int64) *GlobalStats {
	s.Connection = &v
	return s
}

// 组合对象，事务详情和参与者详情
type TransactionParticipators struct {
	// 参与者详情列表
	Participators []*TransactionsParticipator `json:"participators,omitempty" xml:"participators,omitempty" require:"true" type:"Repeated"`
	// 事务详情
	TransactionInfo *TransactionInfo `json:"transaction_info,omitempty" xml:"transaction_info,omitempty" require:"true"`
}

func (s TransactionParticipators) String() string {
	return tea.Prettify(s)
}

func (s TransactionParticipators) GoString() string {
	return s.String()
}

func (s *TransactionParticipators) SetParticipators(v []*TransactionsParticipator) *TransactionParticipators {
	s.Participators = v
	return s
}

func (s *TransactionParticipators) SetTransactionInfo(v *TransactionInfo) *TransactionParticipators {
	s.TransactionInfo = v
	return s
}

// app简要信息
type AppTxInfo struct {
	// appInfo
	AppInfo *AppInfo `json:"app_info,omitempty" xml:"app_info,omitempty" require:"true"`
	// Stats
	Stats *Stats `json:"stats,omitempty" xml:"stats,omitempty" require:"true"`
}

func (s AppTxInfo) String() string {
	return tea.Prettify(s)
}

func (s AppTxInfo) GoString() string {
	return s.String()
}

func (s *AppTxInfo) SetAppInfo(v *AppInfo) *AppTxInfo {
	s.AppInfo = v
	return s
}

func (s *AppTxInfo) SetStats(v *Stats) *AppTxInfo {
	s.Stats = v
	return s
}

// TransactionChartInfo
type TransactionChartInfo struct {
	// a
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// cost
	Cost *int64 `json:"cost,omitempty" xml:"cost,omitempty" require:"true"`
	// edges
	Edges []*TransactionEdge `json:"edges,omitempty" xml:"edges,omitempty" require:"true" type:"Repeated"`
	// end_time
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// last_handle_time
	LastHandleTime *string `json:"last_handle_time,omitempty" xml:"last_handle_time,omitempty"`
	// lowerLineCount
	LowerLineCount *int64 `json:"lower_line_count,omitempty" xml:"lower_line_count,omitempty" require:"true"`
	// nodes
	Nodes []*TransactionNode `json:"nodes,omitempty" xml:"nodes,omitempty" require:"true" type:"Repeated"`
	// participatorNum
	ParticipatorNum *int64 `json:"participator_num,omitempty" xml:"participator_num,omitempty" require:"true"`
	// starter_ip
	StarterIp *string `json:"starter_ip,omitempty" xml:"starter_ip,omitempty" require:"true"`
	// starterName
	StarterName *string `json:"starter_name,omitempty" xml:"starter_name,omitempty" require:"true"`
	// start_time
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// state
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// txid
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// upper_line_count
	UpperLineCount *int64 `json:"upper_line_count,omitempty" xml:"upper_line_count,omitempty" require:"true"`
	// action_mode
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
}

func (s TransactionChartInfo) String() string {
	return tea.Prettify(s)
}

func (s TransactionChartInfo) GoString() string {
	return s.String()
}

func (s *TransactionChartInfo) SetBizId(v string) *TransactionChartInfo {
	s.BizId = &v
	return s
}

func (s *TransactionChartInfo) SetBizType(v string) *TransactionChartInfo {
	s.BizType = &v
	return s
}

func (s *TransactionChartInfo) SetCost(v int64) *TransactionChartInfo {
	s.Cost = &v
	return s
}

func (s *TransactionChartInfo) SetEdges(v []*TransactionEdge) *TransactionChartInfo {
	s.Edges = v
	return s
}

func (s *TransactionChartInfo) SetEndTime(v string) *TransactionChartInfo {
	s.EndTime = &v
	return s
}

func (s *TransactionChartInfo) SetLastHandleTime(v string) *TransactionChartInfo {
	s.LastHandleTime = &v
	return s
}

func (s *TransactionChartInfo) SetLowerLineCount(v int64) *TransactionChartInfo {
	s.LowerLineCount = &v
	return s
}

func (s *TransactionChartInfo) SetNodes(v []*TransactionNode) *TransactionChartInfo {
	s.Nodes = v
	return s
}

func (s *TransactionChartInfo) SetParticipatorNum(v int64) *TransactionChartInfo {
	s.ParticipatorNum = &v
	return s
}

func (s *TransactionChartInfo) SetStarterIp(v string) *TransactionChartInfo {
	s.StarterIp = &v
	return s
}

func (s *TransactionChartInfo) SetStarterName(v string) *TransactionChartInfo {
	s.StarterName = &v
	return s
}

func (s *TransactionChartInfo) SetStartTime(v string) *TransactionChartInfo {
	s.StartTime = &v
	return s
}

func (s *TransactionChartInfo) SetState(v string) *TransactionChartInfo {
	s.State = &v
	return s
}

func (s *TransactionChartInfo) SetTxId(v string) *TransactionChartInfo {
	s.TxId = &v
	return s
}

func (s *TransactionChartInfo) SetUpperLineCount(v int64) *TransactionChartInfo {
	s.UpperLineCount = &v
	return s
}

func (s *TransactionChartInfo) SetActionMode(v int64) *TransactionChartInfo {
	s.ActionMode = &v
	return s
}

type CreateAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1：同库模式，事务记录表在业务侧；
	// 2：异库模式。
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 应用描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 分库分表规则
	SplitRule *SplitRule `json:"split_rule,omitempty" xml:"split_rule,omitempty"`
}

func (s CreateAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsRequest) GoString() string {
	return s.String()
}

func (s *CreateAppsRequest) SetAuthToken(v string) *CreateAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppsRequest) SetProductInstanceId(v string) *CreateAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppsRequest) SetActivityMode(v int64) *CreateAppsRequest {
	s.ActivityMode = &v
	return s
}

func (s *CreateAppsRequest) SetAppName(v string) *CreateAppsRequest {
	s.AppName = &v
	return s
}

func (s *CreateAppsRequest) SetDesc(v string) *CreateAppsRequest {
	s.Desc = &v
	return s
}

func (s *CreateAppsRequest) SetInstanceId(v string) *CreateAppsRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateAppsRequest) SetSplitRule(v *SplitRule) *CreateAppsRequest {
	s.SplitRule = v
	return s
}

type CreateAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsResponse) GoString() string {
	return s.String()
}

func (s *CreateAppsResponse) SetReqMsgId(v string) *CreateAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppsResponse) SetResultCode(v string) *CreateAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppsResponse) SetResultMsg(v string) *CreateAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAppsResponse) SetMsg(v string) *CreateAppsResponse {
	s.Msg = &v
	return s
}

func (s *CreateAppsResponse) SetSuccess(v bool) *CreateAppsResponse {
	s.Success = &v
	return s
}

type CreateRecoveryInitiatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// action_mode
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// activity_mode
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 业务码
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// Client 版本
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty" require:"true"`
	// 应用描述
	//
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 是否异步化
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty" require:"true"`
	// 是否压测任务
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 是否混合模式
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty" require:"true"`
	// 发起方数据源
	RecoveryDatasources []*InitiatorDatasource `json:"recovery_datasources,omitempty" xml:"recovery_datasources,omitempty" require:"true" type:"Repeated"`
	// 恢复条数/分/表
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty" require:"true"`
	// 恢复线程数
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty" require:"true"`
	// SINGLE：单库单表 SPLIT：分库分表
	//
	SplitMode *string `json:"split_mode,omitempty" xml:"split_mode,omitempty"`
	// 分库分表规则
	//
	SplitRule *SplitRule `json:"split_rule,omitempty" xml:"split_rule,omitempty"`
}

func (s CreateRecoveryInitiatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryInitiatorsRequest) GoString() string {
	return s.String()
}

func (s *CreateRecoveryInitiatorsRequest) SetAuthToken(v string) *CreateRecoveryInitiatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetProductInstanceId(v string) *CreateRecoveryInitiatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetActionMode(v int64) *CreateRecoveryInitiatorsRequest {
	s.ActionMode = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetActivityMode(v int64) *CreateRecoveryInitiatorsRequest {
	s.ActivityMode = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetAppName(v string) *CreateRecoveryInitiatorsRequest {
	s.AppName = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetBizType(v string) *CreateRecoveryInitiatorsRequest {
	s.BizType = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetClientVersion(v string) *CreateRecoveryInitiatorsRequest {
	s.ClientVersion = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetDesc(v string) *CreateRecoveryInitiatorsRequest {
	s.Desc = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetInstanceId(v string) *CreateRecoveryInitiatorsRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetIsAsyn(v bool) *CreateRecoveryInitiatorsRequest {
	s.IsAsyn = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetIsLoadTest(v bool) *CreateRecoveryInitiatorsRequest {
	s.IsLoadTest = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetIsMix(v bool) *CreateRecoveryInitiatorsRequest {
	s.IsMix = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetRecoveryDatasources(v []*InitiatorDatasource) *CreateRecoveryInitiatorsRequest {
	s.RecoveryDatasources = v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetRecoveryLimit(v int64) *CreateRecoveryInitiatorsRequest {
	s.RecoveryLimit = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetRecoveryThreadNum(v int64) *CreateRecoveryInitiatorsRequest {
	s.RecoveryThreadNum = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetSplitMode(v string) *CreateRecoveryInitiatorsRequest {
	s.SplitMode = &v
	return s
}

func (s *CreateRecoveryInitiatorsRequest) SetSplitRule(v *SplitRule) *CreateRecoveryInitiatorsRequest {
	s.SplitRule = v
	return s
}

type CreateRecoveryInitiatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的结果文本
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 返回结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRecoveryInitiatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryInitiatorsResponse) GoString() string {
	return s.String()
}

func (s *CreateRecoveryInitiatorsResponse) SetReqMsgId(v string) *CreateRecoveryInitiatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRecoveryInitiatorsResponse) SetResultCode(v string) *CreateRecoveryInitiatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRecoveryInitiatorsResponse) SetResultMsg(v string) *CreateRecoveryInitiatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRecoveryInitiatorsResponse) SetMsg(v string) *CreateRecoveryInitiatorsResponse {
	s.Msg = &v
	return s
}

func (s *CreateRecoveryInitiatorsResponse) SetSuccess(v bool) *CreateRecoveryInitiatorsResponse {
	s.Success = &v
	return s
}

type CountAppsStatsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
}

func (s CountAppsStatsRequest) String() string {
	return tea.Prettify(s)
}

func (s CountAppsStatsRequest) GoString() string {
	return s.String()
}

func (s *CountAppsStatsRequest) SetAuthToken(v string) *CountAppsStatsRequest {
	s.AuthToken = &v
	return s
}

func (s *CountAppsStatsRequest) SetProductInstanceId(v string) *CountAppsStatsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountAppsStatsRequest) SetBizType(v string) *CountAppsStatsRequest {
	s.BizType = &v
	return s
}

func (s *CountAppsStatsRequest) SetInstanceId(v string) *CountAppsStatsRequest {
	s.InstanceId = &v
	return s
}

func (s *CountAppsStatsRequest) SetAppName(v string) *CountAppsStatsRequest {
	s.AppName = &v
	return s
}

type CountAppsStatsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用统计信息
	Data *AppTxInfo `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CountAppsStatsResponse) String() string {
	return tea.Prettify(s)
}

func (s CountAppsStatsResponse) GoString() string {
	return s.String()
}

func (s *CountAppsStatsResponse) SetReqMsgId(v string) *CountAppsStatsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountAppsStatsResponse) SetResultCode(v string) *CountAppsStatsResponse {
	s.ResultCode = &v
	return s
}

func (s *CountAppsStatsResponse) SetResultMsg(v string) *CountAppsStatsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountAppsStatsResponse) SetData(v *AppTxInfo) *CountAppsStatsResponse {
	s.Data = v
	return s
}

func (s *CountAppsStatsResponse) SetSuccess(v bool) *CountAppsStatsResponse {
	s.Success = &v
	return s
}

type ListAppsBiztypesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ListAppsBiztypesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppsBiztypesRequest) GoString() string {
	return s.String()
}

func (s *ListAppsBiztypesRequest) SetAuthToken(v string) *ListAppsBiztypesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppsBiztypesRequest) SetProductInstanceId(v string) *ListAppsBiztypesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAppsBiztypesRequest) SetInstanceId(v string) *ListAppsBiztypesRequest {
	s.InstanceId = &v
	return s
}

type ListAppsBiztypesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// bizType列表
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListAppsBiztypesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppsBiztypesResponse) GoString() string {
	return s.String()
}

func (s *ListAppsBiztypesResponse) SetReqMsgId(v string) *ListAppsBiztypesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppsBiztypesResponse) SetResultCode(v string) *ListAppsBiztypesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppsBiztypesResponse) SetResultMsg(v string) *ListAppsBiztypesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppsBiztypesResponse) SetData(v []*string) *ListAppsBiztypesResponse {
	s.Data = v
	return s
}

func (s *ListAppsBiztypesResponse) SetSuccess(v bool) *ListAppsBiztypesResponse {
	s.Success = &v
	return s
}

type ExportAppsConfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 类型（发起方/参与者）
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s ExportAppsConfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportAppsConfigsRequest) GoString() string {
	return s.String()
}

func (s *ExportAppsConfigsRequest) SetAuthToken(v string) *ExportAppsConfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportAppsConfigsRequest) SetProductInstanceId(v string) *ExportAppsConfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportAppsConfigsRequest) SetAppName(v string) *ExportAppsConfigsRequest {
	s.AppName = &v
	return s
}

func (s *ExportAppsConfigsRequest) SetInstanceId(v string) *ExportAppsConfigsRequest {
	s.InstanceId = &v
	return s
}

func (s *ExportAppsConfigsRequest) SetType(v string) *ExportAppsConfigsRequest {
	s.Type = &v
	return s
}

type ExportAppsConfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口返回文件URL
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 导出配置信息，json
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
}

func (s ExportAppsConfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportAppsConfigsResponse) GoString() string {
	return s.String()
}

func (s *ExportAppsConfigsResponse) SetReqMsgId(v string) *ExportAppsConfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportAppsConfigsResponse) SetResultCode(v string) *ExportAppsConfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportAppsConfigsResponse) SetResultMsg(v string) *ExportAppsConfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportAppsConfigsResponse) SetSuccess(v bool) *ExportAppsConfigsResponse {
	s.Success = &v
	return s
}

func (s *ExportAppsConfigsResponse) SetUrl(v string) *ExportAppsConfigsResponse {
	s.Url = &v
	return s
}

func (s *ExportAppsConfigsResponse) SetContext(v string) *ExportAppsConfigsResponse {
	s.Context = &v
	return s
}

type AllAppsAppnamesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s AllAppsAppnamesRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAppsAppnamesRequest) GoString() string {
	return s.String()
}

func (s *AllAppsAppnamesRequest) SetAuthToken(v string) *AllAppsAppnamesRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAppsAppnamesRequest) SetProductInstanceId(v string) *AllAppsAppnamesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAppsAppnamesRequest) SetInstanceId(v string) *AllAppsAppnamesRequest {
	s.InstanceId = &v
	return s
}

type AllAppsAppnamesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// appname列表
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AllAppsAppnamesResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAppsAppnamesResponse) GoString() string {
	return s.String()
}

func (s *AllAppsAppnamesResponse) SetReqMsgId(v string) *AllAppsAppnamesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAppsAppnamesResponse) SetResultCode(v string) *AllAppsAppnamesResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAppsAppnamesResponse) SetResultMsg(v string) *AllAppsAppnamesResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAppsAppnamesResponse) SetData(v []*string) *AllAppsAppnamesResponse {
	s.Data = v
	return s
}

func (s *AllAppsAppnamesResponse) SetSuccess(v bool) *AllAppsAppnamesResponse {
	s.Success = &v
	return s
}

type ListAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// bizType查询条件
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 单页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// initiator|participator  app_name作为发起者还是参与者
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s ListAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppsRequest) GoString() string {
	return s.String()
}

func (s *ListAppsRequest) SetAuthToken(v string) *ListAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppsRequest) SetProductInstanceId(v string) *ListAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAppsRequest) SetAppName(v string) *ListAppsRequest {
	s.AppName = &v
	return s
}

func (s *ListAppsRequest) SetBizType(v string) *ListAppsRequest {
	s.BizType = &v
	return s
}

func (s *ListAppsRequest) SetCurrentPage(v int64) *ListAppsRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListAppsRequest) SetInstanceId(v string) *ListAppsRequest {
	s.InstanceId = &v
	return s
}

func (s *ListAppsRequest) SetPageSize(v int64) *ListAppsRequest {
	s.PageSize = &v
	return s
}

func (s *ListAppsRequest) SetType(v string) *ListAppsRequest {
	s.Type = &v
	return s
}

type ListAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 应用列表
	Data []*AppStats `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 单页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppsResponse) GoString() string {
	return s.String()
}

func (s *ListAppsResponse) SetReqMsgId(v string) *ListAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppsResponse) SetResultCode(v string) *ListAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppsResponse) SetResultMsg(v string) *ListAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppsResponse) SetCurrentPage(v int64) *ListAppsResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListAppsResponse) SetData(v []*AppStats) *ListAppsResponse {
	s.Data = v
	return s
}

func (s *ListAppsResponse) SetPageSize(v int64) *ListAppsResponse {
	s.PageSize = &v
	return s
}

func (s *ListAppsResponse) SetSuccess(v bool) *ListAppsResponse {
	s.Success = &v
	return s
}

func (s *ListAppsResponse) SetTotal(v int64) *ListAppsResponse {
	s.Total = &v
	return s
}

type GetRecoveryParticipatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetRecoveryParticipatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRecoveryParticipatorsRequest) GoString() string {
	return s.String()
}

func (s *GetRecoveryParticipatorsRequest) SetAuthToken(v string) *GetRecoveryParticipatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRecoveryParticipatorsRequest) SetProductInstanceId(v string) *GetRecoveryParticipatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRecoveryParticipatorsRequest) SetBizType(v string) *GetRecoveryParticipatorsRequest {
	s.BizType = &v
	return s
}

func (s *GetRecoveryParticipatorsRequest) SetId(v int64) *GetRecoveryParticipatorsRequest {
	s.Id = &v
	return s
}

func (s *GetRecoveryParticipatorsRequest) SetInstanceId(v string) *GetRecoveryParticipatorsRequest {
	s.InstanceId = &v
	return s
}

type GetRecoveryParticipatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// action_name
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 关联关系表的id，用于更新
	BizTypeId *int64 `json:"biz_type_id,omitempty" xml:"biz_type_id,omitempty"`
	// class_name
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty"`
	// commit_method_name
	CommitMethodName *string `json:"commit_method_name,omitempty" xml:"commit_method_name,omitempty"`
	// commit_method_params_type
	CommitMethodParamsType *int64 `json:"commit_method_params_type,omitempty" xml:"commit_method_params_type,omitempty"`
	// elastic_key
	ElasticKey *string `json:"elastic_key,omitempty" xml:"elastic_key,omitempty"`
	// elastic_route_rule
	ElasticRouteRule *string `json:"elastic_route_rule,omitempty" xml:"elastic_route_rule,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// is_zone_route
	IsZoneRoute *bool `json:"is_zone_route,omitempty" xml:"is_zone_route,omitempty"`
	// rollback_method_name
	RollbackMethodName *string `json:"rollback_method_name,omitempty" xml:"rollback_method_name,omitempty"`
	// rollback_method_params_type
	RollbackMethodParamsType *int64 `json:"rollback_method_params_type,omitempty" xml:"rollback_method_params_type,omitempty"`
	// test_url
	TestUrl *string `json:"test_url,omitempty" xml:"test_url,omitempty"`
	// unique_id
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// ws_tr
	WsTr *string `json:"ws_tr,omitempty" xml:"ws_tr,omitempty"`
}

func (s GetRecoveryParticipatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRecoveryParticipatorsResponse) GoString() string {
	return s.String()
}

func (s *GetRecoveryParticipatorsResponse) SetReqMsgId(v string) *GetRecoveryParticipatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetResultCode(v string) *GetRecoveryParticipatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetResultMsg(v string) *GetRecoveryParticipatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetActionName(v string) *GetRecoveryParticipatorsResponse {
	s.ActionName = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetAppName(v string) *GetRecoveryParticipatorsResponse {
	s.AppName = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetBizType(v string) *GetRecoveryParticipatorsResponse {
	s.BizType = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetBizTypeId(v int64) *GetRecoveryParticipatorsResponse {
	s.BizTypeId = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetClassName(v string) *GetRecoveryParticipatorsResponse {
	s.ClassName = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetCommitMethodName(v string) *GetRecoveryParticipatorsResponse {
	s.CommitMethodName = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetCommitMethodParamsType(v int64) *GetRecoveryParticipatorsResponse {
	s.CommitMethodParamsType = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetElasticKey(v string) *GetRecoveryParticipatorsResponse {
	s.ElasticKey = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetElasticRouteRule(v string) *GetRecoveryParticipatorsResponse {
	s.ElasticRouteRule = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetId(v int64) *GetRecoveryParticipatorsResponse {
	s.Id = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetInstanceId(v string) *GetRecoveryParticipatorsResponse {
	s.InstanceId = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetIsZoneRoute(v bool) *GetRecoveryParticipatorsResponse {
	s.IsZoneRoute = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetRollbackMethodName(v string) *GetRecoveryParticipatorsResponse {
	s.RollbackMethodName = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetRollbackMethodParamsType(v int64) *GetRecoveryParticipatorsResponse {
	s.RollbackMethodParamsType = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetTestUrl(v string) *GetRecoveryParticipatorsResponse {
	s.TestUrl = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetUniqueId(v string) *GetRecoveryParticipatorsResponse {
	s.UniqueId = &v
	return s
}

func (s *GetRecoveryParticipatorsResponse) SetWsTr(v string) *GetRecoveryParticipatorsResponse {
	s.WsTr = &v
	return s
}

type ImportAppsConfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 上传文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// initiator|participator
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 导入的内容，严格的json
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
}

func (s ImportAppsConfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAppsConfigsRequest) GoString() string {
	return s.String()
}

func (s *ImportAppsConfigsRequest) SetAuthToken(v string) *ImportAppsConfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetProductInstanceId(v string) *ImportAppsConfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetAppName(v string) *ImportAppsConfigsRequest {
	s.AppName = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetFileName(v string) *ImportAppsConfigsRequest {
	s.FileName = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetInstanceId(v string) *ImportAppsConfigsRequest {
	s.InstanceId = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetType(v string) *ImportAppsConfigsRequest {
	s.Type = &v
	return s
}

func (s *ImportAppsConfigsRequest) SetContext(v string) *ImportAppsConfigsRequest {
	s.Context = &v
	return s
}

type ImportAppsConfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 上传成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportAppsConfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAppsConfigsResponse) GoString() string {
	return s.String()
}

func (s *ImportAppsConfigsResponse) SetReqMsgId(v string) *ImportAppsConfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAppsConfigsResponse) SetResultCode(v string) *ImportAppsConfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAppsConfigsResponse) SetResultMsg(v string) *ImportAppsConfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAppsConfigsResponse) SetMsg(v string) *ImportAppsConfigsResponse {
	s.Msg = &v
	return s
}

func (s *ImportAppsConfigsResponse) SetSuccess(v bool) *ImportAppsConfigsResponse {
	s.Success = &v
	return s
}

type GetUploadUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件类型，对应folder
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetUploadUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetUploadUrlRequest) GoString() string {
	return s.String()
}

func (s *GetUploadUrlRequest) SetAuthToken(v string) *GetUploadUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetUploadUrlRequest) SetProductInstanceId(v string) *GetUploadUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetUploadUrlRequest) SetInstanceId(v string) *GetUploadUrlRequest {
	s.InstanceId = &v
	return s
}

func (s *GetUploadUrlRequest) SetAppName(v string) *GetUploadUrlRequest {
	s.AppName = &v
	return s
}

func (s *GetUploadUrlRequest) SetFileName(v string) *GetUploadUrlRequest {
	s.FileName = &v
	return s
}

func (s *GetUploadUrlRequest) SetType(v string) *GetUploadUrlRequest {
	s.Type = &v
	return s
}

type GetUploadUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件URL
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetUploadUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetUploadUrlResponse) GoString() string {
	return s.String()
}

func (s *GetUploadUrlResponse) SetReqMsgId(v string) *GetUploadUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetUploadUrlResponse) SetResultCode(v string) *GetUploadUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetUploadUrlResponse) SetResultMsg(v string) *GetUploadUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetUploadUrlResponse) SetUrl(v string) *GetUploadUrlResponse {
	s.Url = &v
	return s
}

func (s *GetUploadUrlResponse) SetSuccess(v bool) *GetUploadUrlResponse {
	s.Success = &v
	return s
}

type QueryAppsBiztypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// saga状态机定义id
	StatemachineId *string `json:"statemachine_id,omitempty" xml:"statemachine_id,omitempty"`
}

func (s QueryAppsBiztypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAppsBiztypeRequest) GoString() string {
	return s.String()
}

func (s *QueryAppsBiztypeRequest) SetAuthToken(v string) *QueryAppsBiztypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAppsBiztypeRequest) SetProductInstanceId(v string) *QueryAppsBiztypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAppsBiztypeRequest) SetAppName(v string) *QueryAppsBiztypeRequest {
	s.AppName = &v
	return s
}

func (s *QueryAppsBiztypeRequest) SetBizType(v string) *QueryAppsBiztypeRequest {
	s.BizType = &v
	return s
}

func (s *QueryAppsBiztypeRequest) SetInstanceId(v string) *QueryAppsBiztypeRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryAppsBiztypeRequest) SetStatemachineId(v string) *QueryAppsBiztypeRequest {
	s.StatemachineId = &v
	return s
}

type QueryAppsBiztypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异库模式更新信息
	AsynInfo *AsynDbTxInfo `json:"asyn_info,omitempty" xml:"asyn_info,omitempty"`
	// Saga状态机的json定义
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// initiator
	Initiator *Initiator `json:"initiator,omitempty" xml:"initiator,omitempty"`
	// participators
	Participators []*Participator `json:"participators,omitempty" xml:"participators,omitempty" type:"Repeated"`
}

func (s QueryAppsBiztypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAppsBiztypeResponse) GoString() string {
	return s.String()
}

func (s *QueryAppsBiztypeResponse) SetReqMsgId(v string) *QueryAppsBiztypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAppsBiztypeResponse) SetResultCode(v string) *QueryAppsBiztypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAppsBiztypeResponse) SetResultMsg(v string) *QueryAppsBiztypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAppsBiztypeResponse) SetAsynInfo(v *AsynDbTxInfo) *QueryAppsBiztypeResponse {
	s.AsynInfo = v
	return s
}

func (s *QueryAppsBiztypeResponse) SetContent(v string) *QueryAppsBiztypeResponse {
	s.Content = &v
	return s
}

func (s *QueryAppsBiztypeResponse) SetInitiator(v *Initiator) *QueryAppsBiztypeResponse {
	s.Initiator = v
	return s
}

func (s *QueryAppsBiztypeResponse) SetParticipators(v []*Participator) *QueryAppsBiztypeResponse {
	s.Participators = v
	return s
}

type ListAppsRecoverydsnameRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ListAppsRecoverydsnameRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppsRecoverydsnameRequest) GoString() string {
	return s.String()
}

func (s *ListAppsRecoverydsnameRequest) SetAuthToken(v string) *ListAppsRecoverydsnameRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppsRecoverydsnameRequest) SetProductInstanceId(v string) *ListAppsRecoverydsnameRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAppsRecoverydsnameRequest) SetAppName(v string) *ListAppsRecoverydsnameRequest {
	s.AppName = &v
	return s
}

func (s *ListAppsRecoverydsnameRequest) SetInstanceId(v string) *ListAppsRecoverydsnameRequest {
	s.InstanceId = &v
	return s
}

type ListAppsRecoverydsnameResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源列表
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListAppsRecoverydsnameResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppsRecoverydsnameResponse) GoString() string {
	return s.String()
}

func (s *ListAppsRecoverydsnameResponse) SetReqMsgId(v string) *ListAppsRecoverydsnameResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppsRecoverydsnameResponse) SetResultCode(v string) *ListAppsRecoverydsnameResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppsRecoverydsnameResponse) SetResultMsg(v string) *ListAppsRecoverydsnameResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppsRecoverydsnameResponse) SetData(v []*string) *ListAppsRecoverydsnameResponse {
	s.Data = v
	return s
}

func (s *ListAppsRecoverydsnameResponse) SetSuccess(v bool) *ListAppsRecoverydsnameResponse {
	s.Success = &v
	return s
}

type GetAppsBiztypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 000001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// saga状态机定义id
	StatemachineId *string `json:"statemachine_id,omitempty" xml:"statemachine_id,omitempty"`
}

func (s GetAppsBiztypeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAppsBiztypeRequest) GoString() string {
	return s.String()
}

func (s *GetAppsBiztypeRequest) SetAuthToken(v string) *GetAppsBiztypeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAppsBiztypeRequest) SetProductInstanceId(v string) *GetAppsBiztypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAppsBiztypeRequest) SetAppName(v string) *GetAppsBiztypeRequest {
	s.AppName = &v
	return s
}

func (s *GetAppsBiztypeRequest) SetBizType(v string) *GetAppsBiztypeRequest {
	s.BizType = &v
	return s
}

func (s *GetAppsBiztypeRequest) SetInstanceId(v string) *GetAppsBiztypeRequest {
	s.InstanceId = &v
	return s
}

func (s *GetAppsBiztypeRequest) SetStatemachineId(v string) *GetAppsBiztypeRequest {
	s.StatemachineId = &v
	return s
}

type GetAppsBiztypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 参与者信息
	Data []*ActionInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// Saga状态机的json定义
	StatemachineJson *string `json:"statemachine_json,omitempty" xml:"statemachine_json,omitempty"`
}

func (s GetAppsBiztypeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAppsBiztypeResponse) GoString() string {
	return s.String()
}

func (s *GetAppsBiztypeResponse) SetReqMsgId(v string) *GetAppsBiztypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAppsBiztypeResponse) SetResultCode(v string) *GetAppsBiztypeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAppsBiztypeResponse) SetResultMsg(v string) *GetAppsBiztypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAppsBiztypeResponse) SetAppName(v string) *GetAppsBiztypeResponse {
	s.AppName = &v
	return s
}

func (s *GetAppsBiztypeResponse) SetData(v []*ActionInfo) *GetAppsBiztypeResponse {
	s.Data = v
	return s
}

func (s *GetAppsBiztypeResponse) SetStatemachineJson(v string) *GetAppsBiztypeResponse {
	s.StatemachineJson = &v
	return s
}

type UpdateAppsBiztypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// client_version
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty" require:"true"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// is_asyn
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty" require:"true"`
	// is_load_test
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// is_mix
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty" require:"true"`
	// participators
	Participators []*Participator `json:"participators,omitempty" xml:"participators,omitempty" require:"true" type:"Repeated"`
	// recovery_datasources
	RecoveryDatasources []*InitiatorDatasource `json:"recovery_datasources,omitempty" xml:"recovery_datasources,omitempty" require:"true" type:"Repeated"`
	// recovery_limit
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty" require:"true"`
	// recovery_thread_num
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty" require:"true"`
}

func (s UpdateAppsBiztypeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppsBiztypeRequest) GoString() string {
	return s.String()
}

func (s *UpdateAppsBiztypeRequest) SetAuthToken(v string) *UpdateAppsBiztypeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetProductInstanceId(v string) *UpdateAppsBiztypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetAppName(v string) *UpdateAppsBiztypeRequest {
	s.AppName = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetBizType(v string) *UpdateAppsBiztypeRequest {
	s.BizType = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetClientVersion(v string) *UpdateAppsBiztypeRequest {
	s.ClientVersion = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetId(v int64) *UpdateAppsBiztypeRequest {
	s.Id = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetInstanceId(v string) *UpdateAppsBiztypeRequest {
	s.InstanceId = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetIsAsyn(v bool) *UpdateAppsBiztypeRequest {
	s.IsAsyn = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetIsLoadTest(v bool) *UpdateAppsBiztypeRequest {
	s.IsLoadTest = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetIsMix(v bool) *UpdateAppsBiztypeRequest {
	s.IsMix = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetParticipators(v []*Participator) *UpdateAppsBiztypeRequest {
	s.Participators = v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetRecoveryDatasources(v []*InitiatorDatasource) *UpdateAppsBiztypeRequest {
	s.RecoveryDatasources = v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetRecoveryLimit(v int64) *UpdateAppsBiztypeRequest {
	s.RecoveryLimit = &v
	return s
}

func (s *UpdateAppsBiztypeRequest) SetRecoveryThreadNum(v int64) *UpdateAppsBiztypeRequest {
	s.RecoveryThreadNum = &v
	return s
}

type UpdateAppsBiztypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateAppsBiztypeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAppsBiztypeResponse) GoString() string {
	return s.String()
}

func (s *UpdateAppsBiztypeResponse) SetReqMsgId(v string) *UpdateAppsBiztypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAppsBiztypeResponse) SetResultCode(v string) *UpdateAppsBiztypeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAppsBiztypeResponse) SetResultMsg(v string) *UpdateAppsBiztypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAppsBiztypeResponse) SetSuccess(v bool) *UpdateAppsBiztypeResponse {
	s.Success = &v
	return s
}

type CreateAppsConfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 发起方配置
	Initiator *Initiator `json:"initiator,omitempty" xml:"initiator,omitempty"`
	// 参与者列表
	Participators []*Participator `json:"participators,omitempty" xml:"participators,omitempty" type:"Repeated"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 应用的描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 1：同库模式，事务记录表在业务侧； 2：异库模式。
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// 分表分表规则
	ShardingRule *SplitRule `json:"sharding_rule,omitempty" xml:"sharding_rule,omitempty"`
}

func (s CreateAppsConfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsConfigsRequest) GoString() string {
	return s.String()
}

func (s *CreateAppsConfigsRequest) SetAuthToken(v string) *CreateAppsConfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetProductInstanceId(v string) *CreateAppsConfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetInitiator(v *Initiator) *CreateAppsConfigsRequest {
	s.Initiator = v
	return s
}

func (s *CreateAppsConfigsRequest) SetParticipators(v []*Participator) *CreateAppsConfigsRequest {
	s.Participators = v
	return s
}

func (s *CreateAppsConfigsRequest) SetAppName(v string) *CreateAppsConfigsRequest {
	s.AppName = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetDesc(v string) *CreateAppsConfigsRequest {
	s.Desc = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetInstanceId(v string) *CreateAppsConfigsRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetActivityMode(v int64) *CreateAppsConfigsRequest {
	s.ActivityMode = &v
	return s
}

func (s *CreateAppsConfigsRequest) SetShardingRule(v *SplitRule) *CreateAppsConfigsRequest {
	s.ShardingRule = v
	return s
}

type CreateAppsConfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回的结果文本
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s CreateAppsConfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsConfigsResponse) GoString() string {
	return s.String()
}

func (s *CreateAppsConfigsResponse) SetReqMsgId(v string) *CreateAppsConfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppsConfigsResponse) SetResultCode(v string) *CreateAppsConfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppsConfigsResponse) SetResultMsg(v string) *CreateAppsConfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAppsConfigsResponse) SetSuccess(v bool) *CreateAppsConfigsResponse {
	s.Success = &v
	return s
}

func (s *CreateAppsConfigsResponse) SetMsg(v string) *CreateAppsConfigsResponse {
	s.Msg = &v
	return s
}

type ImportAppsNewconfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 导入的内容，严格的json
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
}

func (s ImportAppsNewconfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAppsNewconfigsRequest) GoString() string {
	return s.String()
}

func (s *ImportAppsNewconfigsRequest) SetAuthToken(v string) *ImportAppsNewconfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAppsNewconfigsRequest) SetProductInstanceId(v string) *ImportAppsNewconfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAppsNewconfigsRequest) SetInstanceId(v string) *ImportAppsNewconfigsRequest {
	s.InstanceId = &v
	return s
}

func (s *ImportAppsNewconfigsRequest) SetContext(v string) *ImportAppsNewconfigsRequest {
	s.Context = &v
	return s
}

type ImportAppsNewconfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 上传成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportAppsNewconfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAppsNewconfigsResponse) GoString() string {
	return s.String()
}

func (s *ImportAppsNewconfigsResponse) SetReqMsgId(v string) *ImportAppsNewconfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAppsNewconfigsResponse) SetResultCode(v string) *ImportAppsNewconfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAppsNewconfigsResponse) SetResultMsg(v string) *ImportAppsNewconfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAppsNewconfigsResponse) SetMsg(v string) *ImportAppsNewconfigsResponse {
	s.Msg = &v
	return s
}

func (s *ImportAppsNewconfigsResponse) SetSuccess(v bool) *ImportAppsNewconfigsResponse {
	s.Success = &v
	return s
}

type ExportAppsNewconfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ExportAppsNewconfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportAppsNewconfigsRequest) GoString() string {
	return s.String()
}

func (s *ExportAppsNewconfigsRequest) SetAuthToken(v string) *ExportAppsNewconfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportAppsNewconfigsRequest) SetProductInstanceId(v string) *ExportAppsNewconfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportAppsNewconfigsRequest) SetAppName(v string) *ExportAppsNewconfigsRequest {
	s.AppName = &v
	return s
}

func (s *ExportAppsNewconfigsRequest) SetInstanceId(v string) *ExportAppsNewconfigsRequest {
	s.InstanceId = &v
	return s
}

type ExportAppsNewconfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 导出配置信息，json
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口返回文件URL
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s ExportAppsNewconfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportAppsNewconfigsResponse) GoString() string {
	return s.String()
}

func (s *ExportAppsNewconfigsResponse) SetReqMsgId(v string) *ExportAppsNewconfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportAppsNewconfigsResponse) SetResultCode(v string) *ExportAppsNewconfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportAppsNewconfigsResponse) SetResultMsg(v string) *ExportAppsNewconfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportAppsNewconfigsResponse) SetContext(v string) *ExportAppsNewconfigsResponse {
	s.Context = &v
	return s
}

func (s *ExportAppsNewconfigsResponse) SetSuccess(v bool) *ExportAppsNewconfigsResponse {
	s.Success = &v
	return s
}

func (s *ExportAppsNewconfigsResponse) SetUrl(v string) *ExportAppsNewconfigsResponse {
	s.Url = &v
	return s
}

type ImportTxConfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 导入的内容，严格的json
	Context *string `json:"context,omitempty" xml:"context,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ImportTxConfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTxConfigsRequest) GoString() string {
	return s.String()
}

func (s *ImportTxConfigsRequest) SetAuthToken(v string) *ImportTxConfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTxConfigsRequest) SetProductInstanceId(v string) *ImportTxConfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTxConfigsRequest) SetContext(v string) *ImportTxConfigsRequest {
	s.Context = &v
	return s
}

func (s *ImportTxConfigsRequest) SetInstanceId(v string) *ImportTxConfigsRequest {
	s.InstanceId = &v
	return s
}

type ImportTxConfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 上传成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportTxConfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTxConfigsResponse) GoString() string {
	return s.String()
}

func (s *ImportTxConfigsResponse) SetReqMsgId(v string) *ImportTxConfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTxConfigsResponse) SetResultCode(v string) *ImportTxConfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTxConfigsResponse) SetResultMsg(v string) *ImportTxConfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportTxConfigsResponse) SetMsg(v string) *ImportTxConfigsResponse {
	s.Msg = &v
	return s
}

func (s *ImportTxConfigsResponse) SetSuccess(v bool) *ImportTxConfigsResponse {
	s.Success = &v
	return s
}

type ExportTxConfigsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// id 列表
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
}

func (s ExportTxConfigsRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportTxConfigsRequest) GoString() string {
	return s.String()
}

func (s *ExportTxConfigsRequest) SetAuthToken(v string) *ExportTxConfigsRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportTxConfigsRequest) SetProductInstanceId(v string) *ExportTxConfigsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportTxConfigsRequest) SetAppName(v string) *ExportTxConfigsRequest {
	s.AppName = &v
	return s
}

func (s *ExportTxConfigsRequest) SetInstanceId(v string) *ExportTxConfigsRequest {
	s.InstanceId = &v
	return s
}

func (s *ExportTxConfigsRequest) SetBizType(v string) *ExportTxConfigsRequest {
	s.BizType = &v
	return s
}

type ExportTxConfigsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 导出配置信息，json
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口返回文件URL
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s ExportTxConfigsResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportTxConfigsResponse) GoString() string {
	return s.String()
}

func (s *ExportTxConfigsResponse) SetReqMsgId(v string) *ExportTxConfigsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportTxConfigsResponse) SetResultCode(v string) *ExportTxConfigsResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportTxConfigsResponse) SetResultMsg(v string) *ExportTxConfigsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportTxConfigsResponse) SetContext(v string) *ExportTxConfigsResponse {
	s.Context = &v
	return s
}

func (s *ExportTxConfigsResponse) SetSuccess(v bool) *ExportTxConfigsResponse {
	s.Success = &v
	return s
}

func (s *ExportTxConfigsResponse) SetUrl(v string) *ExportTxConfigsResponse {
	s.Url = &v
	return s
}

type ListNewAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支持模糊查询
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 1
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 000001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListNewAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListNewAppsRequest) GoString() string {
	return s.String()
}

func (s *ListNewAppsRequest) SetAuthToken(v string) *ListNewAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListNewAppsRequest) SetProductInstanceId(v string) *ListNewAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListNewAppsRequest) SetAppName(v string) *ListNewAppsRequest {
	s.AppName = &v
	return s
}

func (s *ListNewAppsRequest) SetCurrentPage(v int64) *ListNewAppsRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListNewAppsRequest) SetInstanceId(v string) *ListNewAppsRequest {
	s.InstanceId = &v
	return s
}

func (s *ListNewAppsRequest) SetPageSize(v int64) *ListNewAppsRequest {
	s.PageSize = &v
	return s
}

type ListNewAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// .
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// app
	Data []*AppInfoVO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 10
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListNewAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListNewAppsResponse) GoString() string {
	return s.String()
}

func (s *ListNewAppsResponse) SetReqMsgId(v string) *ListNewAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListNewAppsResponse) SetResultCode(v string) *ListNewAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListNewAppsResponse) SetResultMsg(v string) *ListNewAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListNewAppsResponse) SetCurrentPage(v int64) *ListNewAppsResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListNewAppsResponse) SetData(v []*AppInfoVO) *ListNewAppsResponse {
	s.Data = v
	return s
}

func (s *ListNewAppsResponse) SetPageSize(v int64) *ListNewAppsResponse {
	s.PageSize = &v
	return s
}

func (s *ListNewAppsResponse) SetTotal(v int64) *ListNewAppsResponse {
	s.Total = &v
	return s
}

type QueryAppsDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用id
	AppId *int64 `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// instance
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s QueryAppsDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAppsDetailRequest) GoString() string {
	return s.String()
}

func (s *QueryAppsDetailRequest) SetAuthToken(v string) *QueryAppsDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAppsDetailRequest) SetProductInstanceId(v string) *QueryAppsDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAppsDetailRequest) SetAppId(v int64) *QueryAppsDetailRequest {
	s.AppId = &v
	return s
}

func (s *QueryAppsDetailRequest) SetInstanceId(v string) *QueryAppsDetailRequest {
	s.InstanceId = &v
	return s
}

type QueryAppsDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用信息
	Data *AppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAppsDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAppsDetailResponse) GoString() string {
	return s.String()
}

func (s *QueryAppsDetailResponse) SetReqMsgId(v string) *QueryAppsDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAppsDetailResponse) SetResultCode(v string) *QueryAppsDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAppsDetailResponse) SetResultMsg(v string) *QueryAppsDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAppsDetailResponse) SetData(v *AppInfoVO) *QueryAppsDetailResponse {
	s.Data = v
	return s
}

type DeleteAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	AppId *int64 `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 000001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s DeleteAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsRequest) GoString() string {
	return s.String()
}

func (s *DeleteAppsRequest) SetAuthToken(v string) *DeleteAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAppsRequest) SetProductInstanceId(v string) *DeleteAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAppsRequest) SetAppId(v int64) *DeleteAppsRequest {
	s.AppId = &v
	return s
}

func (s *DeleteAppsRequest) SetInstanceId(v string) *DeleteAppsRequest {
	s.InstanceId = &v
	return s
}

type DeleteAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsResponse) GoString() string {
	return s.String()
}

func (s *DeleteAppsResponse) SetReqMsgId(v string) *DeleteAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAppsResponse) SetResultCode(v string) *DeleteAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAppsResponse) SetResultMsg(v string) *DeleteAppsResponse {
	s.ResultMsg = &v
	return s
}

type DeleteAppsRecoveryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 000001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 发起方id
	RecoveryId *int64 `json:"recovery_id,omitempty" xml:"recovery_id,omitempty" require:"true"`
}

func (s DeleteAppsRecoveryRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsRecoveryRequest) GoString() string {
	return s.String()
}

func (s *DeleteAppsRecoveryRequest) SetAuthToken(v string) *DeleteAppsRecoveryRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAppsRecoveryRequest) SetProductInstanceId(v string) *DeleteAppsRecoveryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAppsRecoveryRequest) SetInstanceId(v string) *DeleteAppsRecoveryRequest {
	s.InstanceId = &v
	return s
}

func (s *DeleteAppsRecoveryRequest) SetRecoveryId(v int64) *DeleteAppsRecoveryRequest {
	s.RecoveryId = &v
	return s
}

type DeleteAppsRecoveryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAppsRecoveryResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsRecoveryResponse) GoString() string {
	return s.String()
}

func (s *DeleteAppsRecoveryResponse) SetReqMsgId(v string) *DeleteAppsRecoveryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAppsRecoveryResponse) SetResultCode(v string) *DeleteAppsRecoveryResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAppsRecoveryResponse) SetResultMsg(v string) *DeleteAppsRecoveryResponse {
	s.ResultMsg = &v
	return s
}

type DeleteAppsActionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参与者id
	ActionId *int64 `json:"action_id,omitempty" xml:"action_id,omitempty" require:"true"`
	// 00001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s DeleteAppsActionRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsActionRequest) GoString() string {
	return s.String()
}

func (s *DeleteAppsActionRequest) SetAuthToken(v string) *DeleteAppsActionRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAppsActionRequest) SetProductInstanceId(v string) *DeleteAppsActionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAppsActionRequest) SetActionId(v int64) *DeleteAppsActionRequest {
	s.ActionId = &v
	return s
}

func (s *DeleteAppsActionRequest) SetInstanceId(v string) *DeleteAppsActionRequest {
	s.InstanceId = &v
	return s
}

type DeleteAppsActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAppsActionResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsActionResponse) GoString() string {
	return s.String()
}

func (s *DeleteAppsActionResponse) SetReqMsgId(v string) *DeleteAppsActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAppsActionResponse) SetResultCode(v string) *DeleteAppsActionResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAppsActionResponse) SetResultMsg(v string) *DeleteAppsActionResponse {
	s.ResultMsg = &v
	return s
}

type BatchcreateAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参与者数组
	ActionArray []*Participator `json:"action_array,omitempty" xml:"action_array,omitempty" type:"Repeated"`
	// 1 同库； 2 异库
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty"`
	// app
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// Hash
	DbRuleName *string `json:"db_rule_name,omitempty" xml:"db_rule_name,omitempty"`
	// xxx
	DbRuleTemplete *string `json:"db_rule_templete,omitempty" xml:"db_rule_templete,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 编辑时传
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 发起方信息
	RecoveryArray []*RecoveryDTO `json:"recovery_array,omitempty" xml:"recovery_array,omitempty" type:"Repeated"`
	// 数据源数组
	RecoveryDsArray []*RecoveryDsDTO `json:"recovery_ds_array,omitempty" xml:"recovery_ds_array,omitempty" type:"Repeated"`
	// hash
	TableRuleName *string `json:"table_rule_name,omitempty" xml:"table_rule_name,omitempty"`
	// xxx
	TableRuleTemplete *string `json:"table_rule_templete,omitempty" xml:"table_rule_templete,omitempty"`
}

func (s BatchcreateAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateAppsRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateAppsRequest) SetAuthToken(v string) *BatchcreateAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateAppsRequest) SetProductInstanceId(v string) *BatchcreateAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateAppsRequest) SetActionArray(v []*Participator) *BatchcreateAppsRequest {
	s.ActionArray = v
	return s
}

func (s *BatchcreateAppsRequest) SetActivityMode(v int64) *BatchcreateAppsRequest {
	s.ActivityMode = &v
	return s
}

func (s *BatchcreateAppsRequest) SetAppName(v string) *BatchcreateAppsRequest {
	s.AppName = &v
	return s
}

func (s *BatchcreateAppsRequest) SetDbRuleName(v string) *BatchcreateAppsRequest {
	s.DbRuleName = &v
	return s
}

func (s *BatchcreateAppsRequest) SetDbRuleTemplete(v string) *BatchcreateAppsRequest {
	s.DbRuleTemplete = &v
	return s
}

func (s *BatchcreateAppsRequest) SetDesc(v string) *BatchcreateAppsRequest {
	s.Desc = &v
	return s
}

func (s *BatchcreateAppsRequest) SetId(v int64) *BatchcreateAppsRequest {
	s.Id = &v
	return s
}

func (s *BatchcreateAppsRequest) SetInstanceId(v string) *BatchcreateAppsRequest {
	s.InstanceId = &v
	return s
}

func (s *BatchcreateAppsRequest) SetRecoveryArray(v []*RecoveryDTO) *BatchcreateAppsRequest {
	s.RecoveryArray = v
	return s
}

func (s *BatchcreateAppsRequest) SetRecoveryDsArray(v []*RecoveryDsDTO) *BatchcreateAppsRequest {
	s.RecoveryDsArray = v
	return s
}

func (s *BatchcreateAppsRequest) SetTableRuleName(v string) *BatchcreateAppsRequest {
	s.TableRuleName = &v
	return s
}

func (s *BatchcreateAppsRequest) SetTableRuleTemplete(v string) *BatchcreateAppsRequest {
	s.TableRuleTemplete = &v
	return s
}

type BatchcreateAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 编辑后的应用信息
	Data *AppInfoVO `json:"data,omitempty" xml:"data,omitempty"`
}

func (s BatchcreateAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateAppsResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateAppsResponse) SetReqMsgId(v string) *BatchcreateAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateAppsResponse) SetResultCode(v string) *BatchcreateAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateAppsResponse) SetResultMsg(v string) *BatchcreateAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateAppsResponse) SetData(v *AppInfoVO) *BatchcreateAppsResponse {
	s.Data = v
	return s
}

type CreateAppsRecoveryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 000001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 发起方信息
	Recovery *RecoveryDTO `json:"recovery,omitempty" xml:"recovery,omitempty" require:"true"`
	// 数据源信息
	RecoveryDsArray []*RecoveryDsDTO `json:"recovery_ds_array,omitempty" xml:"recovery_ds_array,omitempty" require:"true" type:"Repeated"`
}

func (s CreateAppsRecoveryRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsRecoveryRequest) GoString() string {
	return s.String()
}

func (s *CreateAppsRecoveryRequest) SetAuthToken(v string) *CreateAppsRecoveryRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppsRecoveryRequest) SetProductInstanceId(v string) *CreateAppsRecoveryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppsRecoveryRequest) SetAppName(v string) *CreateAppsRecoveryRequest {
	s.AppName = &v
	return s
}

func (s *CreateAppsRecoveryRequest) SetInstanceId(v string) *CreateAppsRecoveryRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateAppsRecoveryRequest) SetRecovery(v *RecoveryDTO) *CreateAppsRecoveryRequest {
	s.Recovery = v
	return s
}

func (s *CreateAppsRecoveryRequest) SetRecoveryDsArray(v []*RecoveryDsDTO) *CreateAppsRecoveryRequest {
	s.RecoveryDsArray = v
	return s
}

type CreateAppsRecoveryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAppsRecoveryResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsRecoveryResponse) GoString() string {
	return s.String()
}

func (s *CreateAppsRecoveryResponse) SetReqMsgId(v string) *CreateAppsRecoveryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppsRecoveryResponse) SetResultCode(v string) *CreateAppsRecoveryResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppsRecoveryResponse) SetResultMsg(v string) *CreateAppsRecoveryResponse {
	s.ResultMsg = &v
	return s
}

type CreateAppsActionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参与者名称
	//
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 类全名，包括完整包名
	//
	ClassName *string `json:"class_name,omitempty" xml:"class_name,omitempty" require:"true"`
	// 提交方法名称
	//
	CommitMethodName *string `json:"commit_method_name,omitempty" xml:"commit_method_name,omitempty" require:"true"`
	// 提交方法参数
	//
	CommitMethodParamsType *int64 `json:"commit_method_params_type,omitempty" xml:"commit_method_params_type,omitempty" require:"true"`
	// 弹性key
	//
	ElasticKey *string `json:"elastic_key,omitempty" xml:"elastic_key,omitempty"`
	// 弹性路由规则（Groovy脚本）
	//
	ElasticRouteRule *string `json:"elastic_route_rule,omitempty" xml:"elastic_route_rule,omitempty"`
	// 更新时需要
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 00001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// rpc是否ldc调用
	//
	IsZoneRoute *bool `json:"is_zone_route,omitempty" xml:"is_zone_route,omitempty" require:"true"`
	// 回滚方法名称
	//
	RollbackMethodName *string `json:"rollback_method_name,omitempty" xml:"rollback_method_name,omitempty" require:"true"`
	// 回滚方法的参数类型
	//
	RollbackMethodParamsType *int64 `json:"rollback_method_params_type,omitempty" xml:"rollback_method_params_type,omitempty" require:"true"`
	// rpc接口测试地址
	//
	TestUrl *string `json:"test_url,omitempty" xml:"test_url,omitempty"`
	// rpc uniqueId
	//
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
	// rpc协议，ws或tr
	//
	WsTr *string `json:"ws_tr,omitempty" xml:"ws_tr,omitempty" require:"true"`
}

func (s CreateAppsActionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsActionRequest) GoString() string {
	return s.String()
}

func (s *CreateAppsActionRequest) SetAuthToken(v string) *CreateAppsActionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAppsActionRequest) SetProductInstanceId(v string) *CreateAppsActionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAppsActionRequest) SetActionName(v string) *CreateAppsActionRequest {
	s.ActionName = &v
	return s
}

func (s *CreateAppsActionRequest) SetAppName(v string) *CreateAppsActionRequest {
	s.AppName = &v
	return s
}

func (s *CreateAppsActionRequest) SetClassName(v string) *CreateAppsActionRequest {
	s.ClassName = &v
	return s
}

func (s *CreateAppsActionRequest) SetCommitMethodName(v string) *CreateAppsActionRequest {
	s.CommitMethodName = &v
	return s
}

func (s *CreateAppsActionRequest) SetCommitMethodParamsType(v int64) *CreateAppsActionRequest {
	s.CommitMethodParamsType = &v
	return s
}

func (s *CreateAppsActionRequest) SetElasticKey(v string) *CreateAppsActionRequest {
	s.ElasticKey = &v
	return s
}

func (s *CreateAppsActionRequest) SetElasticRouteRule(v string) *CreateAppsActionRequest {
	s.ElasticRouteRule = &v
	return s
}

func (s *CreateAppsActionRequest) SetId(v int64) *CreateAppsActionRequest {
	s.Id = &v
	return s
}

func (s *CreateAppsActionRequest) SetInstanceId(v string) *CreateAppsActionRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateAppsActionRequest) SetIsZoneRoute(v bool) *CreateAppsActionRequest {
	s.IsZoneRoute = &v
	return s
}

func (s *CreateAppsActionRequest) SetRollbackMethodName(v string) *CreateAppsActionRequest {
	s.RollbackMethodName = &v
	return s
}

func (s *CreateAppsActionRequest) SetRollbackMethodParamsType(v int64) *CreateAppsActionRequest {
	s.RollbackMethodParamsType = &v
	return s
}

func (s *CreateAppsActionRequest) SetTestUrl(v string) *CreateAppsActionRequest {
	s.TestUrl = &v
	return s
}

func (s *CreateAppsActionRequest) SetUniqueId(v string) *CreateAppsActionRequest {
	s.UniqueId = &v
	return s
}

func (s *CreateAppsActionRequest) SetWsTr(v string) *CreateAppsActionRequest {
	s.WsTr = &v
	return s
}

type CreateAppsActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAppsActionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAppsActionResponse) GoString() string {
	return s.String()
}

func (s *CreateAppsActionResponse) SetReqMsgId(v string) *CreateAppsActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAppsActionResponse) SetResultCode(v string) *CreateAppsActionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAppsActionResponse) SetResultMsg(v string) *CreateAppsActionResponse {
	s.ResultMsg = &v
	return s
}

type CreateBiztypeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参与者名称数组
	ActionArray []*string `json:"action_array,omitempty" xml:"action_array,omitempty" require:"true" type:"Repeated"`
	// app
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biztype
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 一句话描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 00001
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// add  /  modify
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
}

func (s CreateBiztypeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBiztypeRelationRequest) GoString() string {
	return s.String()
}

func (s *CreateBiztypeRelationRequest) SetAuthToken(v string) *CreateBiztypeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetProductInstanceId(v string) *CreateBiztypeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetActionArray(v []*string) *CreateBiztypeRelationRequest {
	s.ActionArray = v
	return s
}

func (s *CreateBiztypeRelationRequest) SetAppName(v string) *CreateBiztypeRelationRequest {
	s.AppName = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetBizType(v string) *CreateBiztypeRelationRequest {
	s.BizType = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetDesc(v string) *CreateBiztypeRelationRequest {
	s.Desc = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetInstanceId(v string) *CreateBiztypeRelationRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateBiztypeRelationRequest) SetState(v string) *CreateBiztypeRelationRequest {
	s.State = &v
	return s
}

type CreateBiztypeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateBiztypeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBiztypeRelationResponse) GoString() string {
	return s.String()
}

func (s *CreateBiztypeRelationResponse) SetReqMsgId(v string) *CreateBiztypeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBiztypeRelationResponse) SetResultCode(v string) *CreateBiztypeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBiztypeRelationResponse) SetResultMsg(v string) *CreateBiztypeRelationResponse {
	s.ResultMsg = &v
	return s
}

type DeleteAppsBiztypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instanceid
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
}

func (s DeleteAppsBiztypeRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsBiztypeRequest) GoString() string {
	return s.String()
}

func (s *DeleteAppsBiztypeRequest) SetAuthToken(v string) *DeleteAppsBiztypeRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAppsBiztypeRequest) SetProductInstanceId(v string) *DeleteAppsBiztypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAppsBiztypeRequest) SetInstanceId(v string) *DeleteAppsBiztypeRequest {
	s.InstanceId = &v
	return s
}

func (s *DeleteAppsBiztypeRequest) SetBizType(v string) *DeleteAppsBiztypeRequest {
	s.BizType = &v
	return s
}

type DeleteAppsBiztypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteAppsBiztypeResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAppsBiztypeResponse) GoString() string {
	return s.String()
}

func (s *DeleteAppsBiztypeResponse) SetReqMsgId(v string) *DeleteAppsBiztypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAppsBiztypeResponse) SetResultCode(v string) *DeleteAppsBiztypeResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAppsBiztypeResponse) SetResultMsg(v string) *DeleteAppsBiztypeResponse {
	s.ResultMsg = &v
	return s
}

type QueryBiztypeRelationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s QueryBiztypeRelationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBiztypeRelationRequest) GoString() string {
	return s.String()
}

func (s *QueryBiztypeRelationRequest) SetAuthToken(v string) *QueryBiztypeRelationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBiztypeRelationRequest) SetProductInstanceId(v string) *QueryBiztypeRelationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBiztypeRelationRequest) SetBizType(v string) *QueryBiztypeRelationRequest {
	s.BizType = &v
	return s
}

func (s *QueryBiztypeRelationRequest) SetInstanceId(v string) *QueryBiztypeRelationRequest {
	s.InstanceId = &v
	return s
}

type QueryBiztypeRelationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参与者信息
	AppAction []*AppActionVO `json:"app_action,omitempty" xml:"app_action,omitempty" type:"Repeated"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s QueryBiztypeRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBiztypeRelationResponse) GoString() string {
	return s.String()
}

func (s *QueryBiztypeRelationResponse) SetReqMsgId(v string) *QueryBiztypeRelationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBiztypeRelationResponse) SetResultCode(v string) *QueryBiztypeRelationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBiztypeRelationResponse) SetResultMsg(v string) *QueryBiztypeRelationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBiztypeRelationResponse) SetAppAction(v []*AppActionVO) *QueryBiztypeRelationResponse {
	s.AppAction = v
	return s
}

func (s *QueryBiztypeRelationResponse) SetAppName(v string) *QueryBiztypeRelationResponse {
	s.AppName = &v
	return s
}

func (s *QueryBiztypeRelationResponse) SetBizType(v string) *QueryBiztypeRelationResponse {
	s.BizType = &v
	return s
}

func (s *QueryBiztypeRelationResponse) SetDesc(v string) *QueryBiztypeRelationResponse {
	s.Desc = &v
	return s
}

type DeleteTransactionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s DeleteTransactionsRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteTransactionsRequest) GoString() string {
	return s.String()
}

func (s *DeleteTransactionsRequest) SetAuthToken(v string) *DeleteTransactionsRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteTransactionsRequest) SetProductInstanceId(v string) *DeleteTransactionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteTransactionsRequest) SetInstanceId(v string) *DeleteTransactionsRequest {
	s.InstanceId = &v
	return s
}

func (s *DeleteTransactionsRequest) SetTxId(v string) *DeleteTransactionsRequest {
	s.TxId = &v
	return s
}

type DeleteTransactionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteTransactionsResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteTransactionsResponse) GoString() string {
	return s.String()
}

func (s *DeleteTransactionsResponse) SetReqMsgId(v string) *DeleteTransactionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteTransactionsResponse) SetResultCode(v string) *DeleteTransactionsResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteTransactionsResponse) SetResultMsg(v string) *DeleteTransactionsResponse {
	s.ResultMsg = &v
	return s
}

type CreateRecoveryConfigurationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// actionMode取值：1代表TCC模式，2是FMT模式
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty"`
	// activityMode取值：1是同库模式，2是异库模式，3是Saga模式
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 业务码
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 应用描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 环境的唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 如果修改biztype，要穿老的bizType
	OldBiztype *string `json:"old_biztype,omitempty" xml:"old_biztype,omitempty"`
	// role取值：1是发起方，2是参与者
	Role *int64 `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// split_rule
	SplitRule *SplitRule `json:"split_rule,omitempty" xml:"split_rule,omitempty"`
	// Saga状态机的json定义
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s CreateRecoveryConfigurationRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryConfigurationRequest) GoString() string {
	return s.String()
}

func (s *CreateRecoveryConfigurationRequest) SetAuthToken(v string) *CreateRecoveryConfigurationRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetProductInstanceId(v string) *CreateRecoveryConfigurationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetActionMode(v int64) *CreateRecoveryConfigurationRequest {
	s.ActionMode = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetActivityMode(v int64) *CreateRecoveryConfigurationRequest {
	s.ActivityMode = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetAppName(v string) *CreateRecoveryConfigurationRequest {
	s.AppName = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetBizType(v string) *CreateRecoveryConfigurationRequest {
	s.BizType = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetDesc(v string) *CreateRecoveryConfigurationRequest {
	s.Desc = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetInstanceId(v string) *CreateRecoveryConfigurationRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetOldBiztype(v string) *CreateRecoveryConfigurationRequest {
	s.OldBiztype = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetRole(v int64) *CreateRecoveryConfigurationRequest {
	s.Role = &v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetSplitRule(v *SplitRule) *CreateRecoveryConfigurationRequest {
	s.SplitRule = v
	return s
}

func (s *CreateRecoveryConfigurationRequest) SetContent(v string) *CreateRecoveryConfigurationRequest {
	s.Content = &v
	return s
}

type CreateRecoveryConfigurationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口结果信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRecoveryConfigurationResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryConfigurationResponse) GoString() string {
	return s.String()
}

func (s *CreateRecoveryConfigurationResponse) SetReqMsgId(v string) *CreateRecoveryConfigurationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRecoveryConfigurationResponse) SetResultCode(v string) *CreateRecoveryConfigurationResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRecoveryConfigurationResponse) SetResultMsg(v string) *CreateRecoveryConfigurationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRecoveryConfigurationResponse) SetMsg(v string) *CreateRecoveryConfigurationResponse {
	s.Msg = &v
	return s
}

func (s *CreateRecoveryConfigurationResponse) SetSuccess(v bool) *CreateRecoveryConfigurationResponse {
	s.Success = &v
	return s
}

type GetGlobalEnvRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetGlobalEnvRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGlobalEnvRequest) GoString() string {
	return s.String()
}

func (s *GetGlobalEnvRequest) SetAuthToken(v string) *GetGlobalEnvRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGlobalEnvRequest) SetProductInstanceId(v string) *GetGlobalEnvRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGlobalEnvRequest) SetInstanceId(v string) *GetGlobalEnvRequest {
	s.InstanceId = &v
	return s
}

type GetGlobalEnvResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 环境信息
	Data *EnvInfo `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetGlobalEnvResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGlobalEnvResponse) GoString() string {
	return s.String()
}

func (s *GetGlobalEnvResponse) SetReqMsgId(v string) *GetGlobalEnvResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGlobalEnvResponse) SetResultCode(v string) *GetGlobalEnvResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGlobalEnvResponse) SetResultMsg(v string) *GetGlobalEnvResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGlobalEnvResponse) SetData(v *EnvInfo) *GetGlobalEnvResponse {
	s.Data = v
	return s
}

func (s *GetGlobalEnvResponse) SetSuccess(v bool) *GetGlobalEnvResponse {
	s.Success = &v
	return s
}

type GetMiddlewareInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 工作空间
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
}

func (s GetMiddlewareInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMiddlewareInstanceRequest) GoString() string {
	return s.String()
}

func (s *GetMiddlewareInstanceRequest) SetAuthToken(v string) *GetMiddlewareInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMiddlewareInstanceRequest) SetProductInstanceId(v string) *GetMiddlewareInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetMiddlewareInstanceRequest) SetTenantId(v string) *GetMiddlewareInstanceRequest {
	s.TenantId = &v
	return s
}

func (s *GetMiddlewareInstanceRequest) SetWorkspaceId(v string) *GetMiddlewareInstanceRequest {
	s.WorkspaceId = &v
	return s
}

type GetMiddlewareInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// instance id
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetMiddlewareInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMiddlewareInstanceResponse) GoString() string {
	return s.String()
}

func (s *GetMiddlewareInstanceResponse) SetReqMsgId(v string) *GetMiddlewareInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMiddlewareInstanceResponse) SetResultCode(v string) *GetMiddlewareInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMiddlewareInstanceResponse) SetResultMsg(v string) *GetMiddlewareInstanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMiddlewareInstanceResponse) SetData(v string) *GetMiddlewareInstanceResponse {
	s.Data = &v
	return s
}

func (s *GetMiddlewareInstanceResponse) SetSuccess(v bool) *GetMiddlewareInstanceResponse {
	s.Success = &v
	return s
}

type AllZoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// env
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// tenant
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
}

func (s AllZoneRequest) String() string {
	return tea.Prettify(s)
}

func (s AllZoneRequest) GoString() string {
	return s.String()
}

func (s *AllZoneRequest) SetAuthToken(v string) *AllZoneRequest {
	s.AuthToken = &v
	return s
}

func (s *AllZoneRequest) SetProductInstanceId(v string) *AllZoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllZoneRequest) SetInstanceId(v string) *AllZoneRequest {
	s.InstanceId = &v
	return s
}

func (s *AllZoneRequest) SetEnv(v string) *AllZoneRequest {
	s.Env = &v
	return s
}

func (s *AllZoneRequest) SetTenantName(v string) *AllZoneRequest {
	s.TenantName = &v
	return s
}

type AllZoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// zones
	Zones []*string `json:"zones,omitempty" xml:"zones,omitempty" type:"Repeated"`
}

func (s AllZoneResponse) String() string {
	return tea.Prettify(s)
}

func (s AllZoneResponse) GoString() string {
	return s.String()
}

func (s *AllZoneResponse) SetReqMsgId(v string) *AllZoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllZoneResponse) SetResultCode(v string) *AllZoneResponse {
	s.ResultCode = &v
	return s
}

func (s *AllZoneResponse) SetResultMsg(v string) *AllZoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllZoneResponse) SetZones(v []*string) *AllZoneResponse {
	s.Zones = v
	return s
}

type UpdateRecoveryInitiatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// action_mode
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty" require:"true"`
	// 1同库，2异库
	ActivityMode *int64 `json:"activity_mode,omitempty" xml:"activity_mode,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 关联关系表的id，用于更新
	BizTypeId *int64 `json:"biz_type_id,omitempty" xml:"biz_type_id,omitempty" require:"true"`
	// Client 版本
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty" require:"true"`
	// 记录id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 是否异步化
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty" require:"true"`
	// 是否压测任务
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 是否混合模式
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty" require:"true"`
	// 发起方数据源
	RecoveryDatasources []*InitiatorDatasource `json:"recovery_datasources,omitempty" xml:"recovery_datasources,omitempty" require:"true" type:"Repeated"`
	// 恢复条数/分/表
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty" require:"true"`
	// 恢复线程数
	RecoveryThreadNum *int64 `json:"recovery_thread_num,omitempty" xml:"recovery_thread_num,omitempty" require:"true"`
}

func (s UpdateRecoveryInitiatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecoveryInitiatorsRequest) GoString() string {
	return s.String()
}

func (s *UpdateRecoveryInitiatorsRequest) SetAuthToken(v string) *UpdateRecoveryInitiatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetProductInstanceId(v string) *UpdateRecoveryInitiatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetActionMode(v int64) *UpdateRecoveryInitiatorsRequest {
	s.ActionMode = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetActivityMode(v int64) *UpdateRecoveryInitiatorsRequest {
	s.ActivityMode = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetAppName(v string) *UpdateRecoveryInitiatorsRequest {
	s.AppName = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetBizType(v string) *UpdateRecoveryInitiatorsRequest {
	s.BizType = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetBizTypeId(v int64) *UpdateRecoveryInitiatorsRequest {
	s.BizTypeId = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetClientVersion(v string) *UpdateRecoveryInitiatorsRequest {
	s.ClientVersion = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetId(v int64) *UpdateRecoveryInitiatorsRequest {
	s.Id = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetInstanceId(v string) *UpdateRecoveryInitiatorsRequest {
	s.InstanceId = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetIsAsyn(v bool) *UpdateRecoveryInitiatorsRequest {
	s.IsAsyn = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetIsLoadTest(v bool) *UpdateRecoveryInitiatorsRequest {
	s.IsLoadTest = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetIsMix(v bool) *UpdateRecoveryInitiatorsRequest {
	s.IsMix = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetRecoveryDatasources(v []*InitiatorDatasource) *UpdateRecoveryInitiatorsRequest {
	s.RecoveryDatasources = v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetRecoveryLimit(v int64) *UpdateRecoveryInitiatorsRequest {
	s.RecoveryLimit = &v
	return s
}

func (s *UpdateRecoveryInitiatorsRequest) SetRecoveryThreadNum(v int64) *UpdateRecoveryInitiatorsRequest {
	s.RecoveryThreadNum = &v
	return s
}

type UpdateRecoveryInitiatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRecoveryInitiatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecoveryInitiatorsResponse) GoString() string {
	return s.String()
}

func (s *UpdateRecoveryInitiatorsResponse) SetReqMsgId(v string) *UpdateRecoveryInitiatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRecoveryInitiatorsResponse) SetResultCode(v string) *UpdateRecoveryInitiatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRecoveryInitiatorsResponse) SetResultMsg(v string) *UpdateRecoveryInitiatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRecoveryInitiatorsResponse) SetMsg(v string) *UpdateRecoveryInitiatorsResponse {
	s.Msg = &v
	return s
}

func (s *UpdateRecoveryInitiatorsResponse) SetSuccess(v bool) *UpdateRecoveryInitiatorsResponse {
	s.Success = &v
	return s
}

type ListBiztypesInitiatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ListBiztypesInitiatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListBiztypesInitiatorsRequest) GoString() string {
	return s.String()
}

func (s *ListBiztypesInitiatorsRequest) SetAuthToken(v string) *ListBiztypesInitiatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListBiztypesInitiatorsRequest) SetProductInstanceId(v string) *ListBiztypesInitiatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListBiztypesInitiatorsRequest) SetAppName(v string) *ListBiztypesInitiatorsRequest {
	s.AppName = &v
	return s
}

func (s *ListBiztypesInitiatorsRequest) SetInstanceId(v string) *ListBiztypesInitiatorsRequest {
	s.InstanceId = &v
	return s
}

type ListBiztypesInitiatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发起方列表
	Data []*Initiator `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListBiztypesInitiatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListBiztypesInitiatorsResponse) GoString() string {
	return s.String()
}

func (s *ListBiztypesInitiatorsResponse) SetReqMsgId(v string) *ListBiztypesInitiatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListBiztypesInitiatorsResponse) SetResultCode(v string) *ListBiztypesInitiatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListBiztypesInitiatorsResponse) SetResultMsg(v string) *ListBiztypesInitiatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListBiztypesInitiatorsResponse) SetData(v []*Initiator) *ListBiztypesInitiatorsResponse {
	s.Data = v
	return s
}

func (s *ListBiztypesInitiatorsResponse) SetSuccess(v bool) *ListBiztypesInitiatorsResponse {
	s.Success = &v
	return s
}

type AllInitiatorsDatasourcesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s AllInitiatorsDatasourcesRequest) String() string {
	return tea.Prettify(s)
}

func (s AllInitiatorsDatasourcesRequest) GoString() string {
	return s.String()
}

func (s *AllInitiatorsDatasourcesRequest) SetAuthToken(v string) *AllInitiatorsDatasourcesRequest {
	s.AuthToken = &v
	return s
}

func (s *AllInitiatorsDatasourcesRequest) SetProductInstanceId(v string) *AllInitiatorsDatasourcesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllInitiatorsDatasourcesRequest) SetAppName(v string) *AllInitiatorsDatasourcesRequest {
	s.AppName = &v
	return s
}

func (s *AllInitiatorsDatasourcesRequest) SetInstanceId(v string) *AllInitiatorsDatasourcesRequest {
	s.InstanceId = &v
	return s
}

type AllInitiatorsDatasourcesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源名列表
	Data []*DsNameInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AllInitiatorsDatasourcesResponse) String() string {
	return tea.Prettify(s)
}

func (s AllInitiatorsDatasourcesResponse) GoString() string {
	return s.String()
}

func (s *AllInitiatorsDatasourcesResponse) SetReqMsgId(v string) *AllInitiatorsDatasourcesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllInitiatorsDatasourcesResponse) SetResultCode(v string) *AllInitiatorsDatasourcesResponse {
	s.ResultCode = &v
	return s
}

func (s *AllInitiatorsDatasourcesResponse) SetResultMsg(v string) *AllInitiatorsDatasourcesResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllInitiatorsDatasourcesResponse) SetData(v []*DsNameInfo) *AllInitiatorsDatasourcesResponse {
	s.Data = v
	return s
}

func (s *AllInitiatorsDatasourcesResponse) SetSuccess(v bool) *AllInitiatorsDatasourcesResponse {
	s.Success = &v
	return s
}

type AllInitiatorsTablesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 数据源名
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s AllInitiatorsTablesRequest) String() string {
	return tea.Prettify(s)
}

func (s AllInitiatorsTablesRequest) GoString() string {
	return s.String()
}

func (s *AllInitiatorsTablesRequest) SetAuthToken(v string) *AllInitiatorsTablesRequest {
	s.AuthToken = &v
	return s
}

func (s *AllInitiatorsTablesRequest) SetProductInstanceId(v string) *AllInitiatorsTablesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllInitiatorsTablesRequest) SetAppName(v string) *AllInitiatorsTablesRequest {
	s.AppName = &v
	return s
}

func (s *AllInitiatorsTablesRequest) SetDsName(v string) *AllInitiatorsTablesRequest {
	s.DsName = &v
	return s
}

func (s *AllInitiatorsTablesRequest) SetInstanceId(v string) *AllInitiatorsTablesRequest {
	s.InstanceId = &v
	return s
}

type AllInitiatorsTablesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 表名列表
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AllInitiatorsTablesResponse) String() string {
	return tea.Prettify(s)
}

func (s AllInitiatorsTablesResponse) GoString() string {
	return s.String()
}

func (s *AllInitiatorsTablesResponse) SetReqMsgId(v string) *AllInitiatorsTablesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllInitiatorsTablesResponse) SetResultCode(v string) *AllInitiatorsTablesResponse {
	s.ResultCode = &v
	return s
}

func (s *AllInitiatorsTablesResponse) SetResultMsg(v string) *AllInitiatorsTablesResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllInitiatorsTablesResponse) SetData(v []*string) *AllInitiatorsTablesResponse {
	s.Data = v
	return s
}

func (s *AllInitiatorsTablesResponse) SetSuccess(v bool) *AllInitiatorsTablesResponse {
	s.Success = &v
	return s
}

type DebugInitiatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主事务记录表
	ActivityTableName *string `json:"activity_table_name,omitempty" xml:"activity_table_name,omitempty" require:"true"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 数据源名称
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 记录id
	RecoveryId *int64 `json:"recovery_id,omitempty" xml:"recovery_id,omitempty" require:"true"`
}

func (s DebugInitiatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s DebugInitiatorsRequest) GoString() string {
	return s.String()
}

func (s *DebugInitiatorsRequest) SetAuthToken(v string) *DebugInitiatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *DebugInitiatorsRequest) SetProductInstanceId(v string) *DebugInitiatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DebugInitiatorsRequest) SetActivityTableName(v string) *DebugInitiatorsRequest {
	s.ActivityTableName = &v
	return s
}

func (s *DebugInitiatorsRequest) SetAppName(v string) *DebugInitiatorsRequest {
	s.AppName = &v
	return s
}

func (s *DebugInitiatorsRequest) SetDsName(v string) *DebugInitiatorsRequest {
	s.DsName = &v
	return s
}

func (s *DebugInitiatorsRequest) SetInstanceId(v string) *DebugInitiatorsRequest {
	s.InstanceId = &v
	return s
}

func (s *DebugInitiatorsRequest) SetRecoveryId(v int64) *DebugInitiatorsRequest {
	s.RecoveryId = &v
	return s
}

type DebugInitiatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DebugInitiatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s DebugInitiatorsResponse) GoString() string {
	return s.String()
}

func (s *DebugInitiatorsResponse) SetReqMsgId(v string) *DebugInitiatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DebugInitiatorsResponse) SetResultCode(v string) *DebugInitiatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *DebugInitiatorsResponse) SetResultMsg(v string) *DebugInitiatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DebugInitiatorsResponse) SetMsg(v string) *DebugInitiatorsResponse {
	s.Msg = &v
	return s
}

func (s *DebugInitiatorsResponse) SetSuccess(v bool) *DebugInitiatorsResponse {
	s.Success = &v
	return s
}

type GetRecoveryInitiatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetRecoveryInitiatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRecoveryInitiatorsRequest) GoString() string {
	return s.String()
}

func (s *GetRecoveryInitiatorsRequest) SetAuthToken(v string) *GetRecoveryInitiatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRecoveryInitiatorsRequest) SetProductInstanceId(v string) *GetRecoveryInitiatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRecoveryInitiatorsRequest) SetBizType(v string) *GetRecoveryInitiatorsRequest {
	s.BizType = &v
	return s
}

func (s *GetRecoveryInitiatorsRequest) SetInstanceId(v string) *GetRecoveryInitiatorsRequest {
	s.InstanceId = &v
	return s
}

type GetRecoveryInitiatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 关联关系表的id，用于更新
	BizTypeId *int64 `json:"biz_type_id,omitempty" xml:"biz_type_id,omitempty"`
	// client_version
	ClientVersion *string `json:"client_version,omitempty" xml:"client_version,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// is_asyn
	IsAsyn *bool `json:"is_asyn,omitempty" xml:"is_asyn,omitempty"`
	// is_load_test
	IsLoadTest *bool `json:"is_load_test,omitempty" xml:"is_load_test,omitempty"`
	// is_mix
	IsMix *bool `json:"is_mix,omitempty" xml:"is_mix,omitempty"`
	// recovery_datasources
	RecoveryDatasources []*InitiatorDatasource `json:"recovery_datasources,omitempty" xml:"recovery_datasources,omitempty" type:"Repeated"`
	// recovery_limit
	RecoveryLimit *int64 `json:"recovery_limit,omitempty" xml:"recovery_limit,omitempty"`
	// thread_num
	ThreadNum *int64 `json:"thread_num,omitempty" xml:"thread_num,omitempty"`
}

func (s GetRecoveryInitiatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRecoveryInitiatorsResponse) GoString() string {
	return s.String()
}

func (s *GetRecoveryInitiatorsResponse) SetReqMsgId(v string) *GetRecoveryInitiatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetResultCode(v string) *GetRecoveryInitiatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetResultMsg(v string) *GetRecoveryInitiatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetAppName(v string) *GetRecoveryInitiatorsResponse {
	s.AppName = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetBizType(v string) *GetRecoveryInitiatorsResponse {
	s.BizType = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetBizTypeId(v int64) *GetRecoveryInitiatorsResponse {
	s.BizTypeId = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetClientVersion(v string) *GetRecoveryInitiatorsResponse {
	s.ClientVersion = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetId(v int64) *GetRecoveryInitiatorsResponse {
	s.Id = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetInstanceId(v string) *GetRecoveryInitiatorsResponse {
	s.InstanceId = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetIsAsyn(v bool) *GetRecoveryInitiatorsResponse {
	s.IsAsyn = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetIsLoadTest(v bool) *GetRecoveryInitiatorsResponse {
	s.IsLoadTest = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetIsMix(v bool) *GetRecoveryInitiatorsResponse {
	s.IsMix = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetRecoveryDatasources(v []*InitiatorDatasource) *GetRecoveryInitiatorsResponse {
	s.RecoveryDatasources = v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetRecoveryLimit(v int64) *GetRecoveryInitiatorsResponse {
	s.RecoveryLimit = &v
	return s
}

func (s *GetRecoveryInitiatorsResponse) SetThreadNum(v int64) *GetRecoveryInitiatorsResponse {
	s.ThreadNum = &v
	return s
}

type CreateRecoveryParticipatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批量新增action
	Actions []*Participator `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 默认TCC
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty" require:"true"`
}

func (s CreateRecoveryParticipatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryParticipatorsRequest) GoString() string {
	return s.String()
}

func (s *CreateRecoveryParticipatorsRequest) SetAuthToken(v string) *CreateRecoveryParticipatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRecoveryParticipatorsRequest) SetProductInstanceId(v string) *CreateRecoveryParticipatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRecoveryParticipatorsRequest) SetActions(v []*Participator) *CreateRecoveryParticipatorsRequest {
	s.Actions = v
	return s
}

func (s *CreateRecoveryParticipatorsRequest) SetBizType(v string) *CreateRecoveryParticipatorsRequest {
	s.BizType = &v
	return s
}

func (s *CreateRecoveryParticipatorsRequest) SetActionMode(v int64) *CreateRecoveryParticipatorsRequest {
	s.ActionMode = &v
	return s
}

type CreateRecoveryParticipatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRecoveryParticipatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRecoveryParticipatorsResponse) GoString() string {
	return s.String()
}

func (s *CreateRecoveryParticipatorsResponse) SetReqMsgId(v string) *CreateRecoveryParticipatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRecoveryParticipatorsResponse) SetResultCode(v string) *CreateRecoveryParticipatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRecoveryParticipatorsResponse) SetResultMsg(v string) *CreateRecoveryParticipatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRecoveryParticipatorsResponse) SetMsg(v string) *CreateRecoveryParticipatorsResponse {
	s.Msg = &v
	return s
}

func (s *CreateRecoveryParticipatorsResponse) SetSuccess(v bool) *CreateRecoveryParticipatorsResponse {
	s.Success = &v
	return s
}

type UpdateRecoveryParticipatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// actions
	Actions []*Participator `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 默认1：TCC
	ActionMode *int64 `json:"action_mode,omitempty" xml:"action_mode,omitempty" require:"true"`
}

func (s UpdateRecoveryParticipatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecoveryParticipatorsRequest) GoString() string {
	return s.String()
}

func (s *UpdateRecoveryParticipatorsRequest) SetAuthToken(v string) *UpdateRecoveryParticipatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRecoveryParticipatorsRequest) SetProductInstanceId(v string) *UpdateRecoveryParticipatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateRecoveryParticipatorsRequest) SetActions(v []*Participator) *UpdateRecoveryParticipatorsRequest {
	s.Actions = v
	return s
}

func (s *UpdateRecoveryParticipatorsRequest) SetBizType(v string) *UpdateRecoveryParticipatorsRequest {
	s.BizType = &v
	return s
}

func (s *UpdateRecoveryParticipatorsRequest) SetActionMode(v int64) *UpdateRecoveryParticipatorsRequest {
	s.ActionMode = &v
	return s
}

type UpdateRecoveryParticipatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRecoveryParticipatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRecoveryParticipatorsResponse) GoString() string {
	return s.String()
}

func (s *UpdateRecoveryParticipatorsResponse) SetReqMsgId(v string) *UpdateRecoveryParticipatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRecoveryParticipatorsResponse) SetResultCode(v string) *UpdateRecoveryParticipatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRecoveryParticipatorsResponse) SetResultMsg(v string) *UpdateRecoveryParticipatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRecoveryParticipatorsResponse) SetMsg(v string) *UpdateRecoveryParticipatorsResponse {
	s.Msg = &v
	return s
}

func (s *UpdateRecoveryParticipatorsResponse) SetSuccess(v bool) *UpdateRecoveryParticipatorsResponse {
	s.Success = &v
	return s
}

type ListBiztypesParticipatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ListBiztypesParticipatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListBiztypesParticipatorsRequest) GoString() string {
	return s.String()
}

func (s *ListBiztypesParticipatorsRequest) SetAuthToken(v string) *ListBiztypesParticipatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListBiztypesParticipatorsRequest) SetProductInstanceId(v string) *ListBiztypesParticipatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListBiztypesParticipatorsRequest) SetAppName(v string) *ListBiztypesParticipatorsRequest {
	s.AppName = &v
	return s
}

func (s *ListBiztypesParticipatorsRequest) SetInstanceId(v string) *ListBiztypesParticipatorsRequest {
	s.InstanceId = &v
	return s
}

type ListBiztypesParticipatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参与者列表
	Data []*Participator `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListBiztypesParticipatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListBiztypesParticipatorsResponse) GoString() string {
	return s.String()
}

func (s *ListBiztypesParticipatorsResponse) SetReqMsgId(v string) *ListBiztypesParticipatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListBiztypesParticipatorsResponse) SetResultCode(v string) *ListBiztypesParticipatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListBiztypesParticipatorsResponse) SetResultMsg(v string) *ListBiztypesParticipatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListBiztypesParticipatorsResponse) SetData(v []*Participator) *ListBiztypesParticipatorsResponse {
	s.Data = v
	return s
}

func (s *ListBiztypesParticipatorsResponse) SetSuccess(v bool) *ListBiztypesParticipatorsResponse {
	s.Success = &v
	return s
}

type AllParticipatorsActionamesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s AllParticipatorsActionamesRequest) String() string {
	return tea.Prettify(s)
}

func (s AllParticipatorsActionamesRequest) GoString() string {
	return s.String()
}

func (s *AllParticipatorsActionamesRequest) SetAuthToken(v string) *AllParticipatorsActionamesRequest {
	s.AuthToken = &v
	return s
}

func (s *AllParticipatorsActionamesRequest) SetProductInstanceId(v string) *AllParticipatorsActionamesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllParticipatorsActionamesRequest) SetAppName(v string) *AllParticipatorsActionamesRequest {
	s.AppName = &v
	return s
}

func (s *AllParticipatorsActionamesRequest) SetInstanceId(v string) *AllParticipatorsActionamesRequest {
	s.InstanceId = &v
	return s
}

type AllParticipatorsActionamesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参与者名称列表
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AllParticipatorsActionamesResponse) String() string {
	return tea.Prettify(s)
}

func (s AllParticipatorsActionamesResponse) GoString() string {
	return s.String()
}

func (s *AllParticipatorsActionamesResponse) SetReqMsgId(v string) *AllParticipatorsActionamesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllParticipatorsActionamesResponse) SetResultCode(v string) *AllParticipatorsActionamesResponse {
	s.ResultCode = &v
	return s
}

func (s *AllParticipatorsActionamesResponse) SetResultMsg(v string) *AllParticipatorsActionamesResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllParticipatorsActionamesResponse) SetData(v []*string) *AllParticipatorsActionamesResponse {
	s.Data = v
	return s
}

func (s *AllParticipatorsActionamesResponse) SetSuccess(v bool) *AllParticipatorsActionamesResponse {
	s.Success = &v
	return s
}

type DebugParticipatorsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分支事务上下文
	ActionContext *string `json:"action_context,omitempty" xml:"action_context,omitempty" require:"true"`
	// 分支事务id
	ActionId *string `json:"action_id,omitempty" xml:"action_id,omitempty" require:"true"`
	// 参与者名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 操作类型，提交或回滚
	ActionType *int64 `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// 主事务上下文
	ActivityContext *string `json:"activity_context,omitempty" xml:"activity_context,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 主事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s DebugParticipatorsRequest) String() string {
	return tea.Prettify(s)
}

func (s DebugParticipatorsRequest) GoString() string {
	return s.String()
}

func (s *DebugParticipatorsRequest) SetAuthToken(v string) *DebugParticipatorsRequest {
	s.AuthToken = &v
	return s
}

func (s *DebugParticipatorsRequest) SetProductInstanceId(v string) *DebugParticipatorsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DebugParticipatorsRequest) SetActionContext(v string) *DebugParticipatorsRequest {
	s.ActionContext = &v
	return s
}

func (s *DebugParticipatorsRequest) SetActionId(v string) *DebugParticipatorsRequest {
	s.ActionId = &v
	return s
}

func (s *DebugParticipatorsRequest) SetActionName(v string) *DebugParticipatorsRequest {
	s.ActionName = &v
	return s
}

func (s *DebugParticipatorsRequest) SetActionType(v int64) *DebugParticipatorsRequest {
	s.ActionType = &v
	return s
}

func (s *DebugParticipatorsRequest) SetActivityContext(v string) *DebugParticipatorsRequest {
	s.ActivityContext = &v
	return s
}

func (s *DebugParticipatorsRequest) SetInstanceId(v string) *DebugParticipatorsRequest {
	s.InstanceId = &v
	return s
}

func (s *DebugParticipatorsRequest) SetTxId(v string) *DebugParticipatorsRequest {
	s.TxId = &v
	return s
}

type DebugParticipatorsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DebugParticipatorsResponse) String() string {
	return tea.Prettify(s)
}

func (s DebugParticipatorsResponse) GoString() string {
	return s.String()
}

func (s *DebugParticipatorsResponse) SetReqMsgId(v string) *DebugParticipatorsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DebugParticipatorsResponse) SetResultCode(v string) *DebugParticipatorsResponse {
	s.ResultCode = &v
	return s
}

func (s *DebugParticipatorsResponse) SetResultMsg(v string) *DebugParticipatorsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DebugParticipatorsResponse) SetMsg(v string) *DebugParticipatorsResponse {
	s.Msg = &v
	return s
}

func (s *DebugParticipatorsResponse) SetSuccess(v bool) *DebugParticipatorsResponse {
	s.Success = &v
	return s
}

type QueryActionParamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// env
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// tenant
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true"`
}

func (s QueryActionParamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryActionParamRequest) GoString() string {
	return s.String()
}

func (s *QueryActionParamRequest) SetAuthToken(v string) *QueryActionParamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryActionParamRequest) SetProductInstanceId(v string) *QueryActionParamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryActionParamRequest) SetEnv(v string) *QueryActionParamRequest {
	s.Env = &v
	return s
}

func (s *QueryActionParamRequest) SetInstanceId(v string) *QueryActionParamRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryActionParamRequest) SetTenantName(v string) *QueryActionParamRequest {
	s.TenantName = &v
	return s
}

type QueryActionParamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 参数列表
	Params []*Pair `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
}

func (s QueryActionParamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryActionParamResponse) GoString() string {
	return s.String()
}

func (s *QueryActionParamResponse) SetReqMsgId(v string) *QueryActionParamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryActionParamResponse) SetResultCode(v string) *QueryActionParamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryActionParamResponse) SetResultMsg(v string) *QueryActionParamResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryActionParamResponse) SetParams(v []*Pair) *QueryActionParamResponse {
	s.Params = v
	return s
}

type ExecuteSwitchoverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	DestCell          *string `json:"dest_cell,omitempty" xml:"dest_cell,omitempty" require:"true"`
	InstanceId        *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	SourceCell        *string `json:"source_cell,omitempty" xml:"source_cell,omitempty" require:"true"`
}

func (s ExecuteSwitchoverRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecuteSwitchoverRequest) GoString() string {
	return s.String()
}

func (s *ExecuteSwitchoverRequest) SetAuthToken(v string) *ExecuteSwitchoverRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecuteSwitchoverRequest) SetProductInstanceId(v string) *ExecuteSwitchoverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecuteSwitchoverRequest) SetDestCell(v string) *ExecuteSwitchoverRequest {
	s.DestCell = &v
	return s
}

func (s *ExecuteSwitchoverRequest) SetInstanceId(v string) *ExecuteSwitchoverRequest {
	s.InstanceId = &v
	return s
}

func (s *ExecuteSwitchoverRequest) SetSourceCell(v string) *ExecuteSwitchoverRequest {
	s.SourceCell = &v
	return s
}

type ExecuteSwitchoverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否达到预期切换状态
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s ExecuteSwitchoverResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecuteSwitchoverResponse) GoString() string {
	return s.String()
}

func (s *ExecuteSwitchoverResponse) SetReqMsgId(v string) *ExecuteSwitchoverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecuteSwitchoverResponse) SetResultCode(v string) *ExecuteSwitchoverResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecuteSwitchoverResponse) SetResultMsg(v string) *ExecuteSwitchoverResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecuteSwitchoverResponse) SetSuccess(v bool) *ExecuteSwitchoverResponse {
	s.Success = &v
	return s
}

type CancelSwitchoverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	DestCell          *string `json:"dest_cell,omitempty" xml:"dest_cell,omitempty" require:"true"`
	InstanceId        *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	SourceCell        *string `json:"source_cell,omitempty" xml:"source_cell,omitempty" require:"true"`
}

func (s CancelSwitchoverRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelSwitchoverRequest) GoString() string {
	return s.String()
}

func (s *CancelSwitchoverRequest) SetAuthToken(v string) *CancelSwitchoverRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelSwitchoverRequest) SetProductInstanceId(v string) *CancelSwitchoverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelSwitchoverRequest) SetDestCell(v string) *CancelSwitchoverRequest {
	s.DestCell = &v
	return s
}

func (s *CancelSwitchoverRequest) SetInstanceId(v string) *CancelSwitchoverRequest {
	s.InstanceId = &v
	return s
}

func (s *CancelSwitchoverRequest) SetSourceCell(v string) *CancelSwitchoverRequest {
	s.SourceCell = &v
	return s
}

type CancelSwitchoverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求执行是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s CancelSwitchoverResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelSwitchoverResponse) GoString() string {
	return s.String()
}

func (s *CancelSwitchoverResponse) SetReqMsgId(v string) *CancelSwitchoverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelSwitchoverResponse) SetResultCode(v string) *CancelSwitchoverResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelSwitchoverResponse) SetResultMsg(v string) *CancelSwitchoverResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelSwitchoverResponse) SetSuccess(v bool) *CancelSwitchoverResponse {
	s.Success = &v
	return s
}

type QuerySwitchoverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	InstanceId        *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s QuerySwitchoverRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySwitchoverRequest) GoString() string {
	return s.String()
}

func (s *QuerySwitchoverRequest) SetAuthToken(v string) *QuerySwitchoverRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySwitchoverRequest) SetProductInstanceId(v string) *QuerySwitchoverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySwitchoverRequest) SetInstanceId(v string) *QuerySwitchoverRequest {
	s.InstanceId = &v
	return s
}

type QuerySwitchoverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 单元切换状态列表
	Actions []*SwitchoverAction `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
}

func (s QuerySwitchoverResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySwitchoverResponse) GoString() string {
	return s.String()
}

func (s *QuerySwitchoverResponse) SetReqMsgId(v string) *QuerySwitchoverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySwitchoverResponse) SetResultCode(v string) *QuerySwitchoverResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySwitchoverResponse) SetResultMsg(v string) *QuerySwitchoverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySwitchoverResponse) SetActions(v []*SwitchoverAction) *QuerySwitchoverResponse {
	s.Actions = v
	return s
}

type CountBiztypesTrendsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// biz_type
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s CountBiztypesTrendsRequest) String() string {
	return tea.Prettify(s)
}

func (s CountBiztypesTrendsRequest) GoString() string {
	return s.String()
}

func (s *CountBiztypesTrendsRequest) SetAuthToken(v string) *CountBiztypesTrendsRequest {
	s.AuthToken = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetProductInstanceId(v string) *CountBiztypesTrendsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetAppName(v string) *CountBiztypesTrendsRequest {
	s.AppName = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetBizType(v string) *CountBiztypesTrendsRequest {
	s.BizType = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetEndTime(v string) *CountBiztypesTrendsRequest {
	s.EndTime = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetInstanceId(v string) *CountBiztypesTrendsRequest {
	s.InstanceId = &v
	return s
}

func (s *CountBiztypesTrendsRequest) SetStartTime(v string) *CountBiztypesTrendsRequest {
	s.StartTime = &v
	return s
}

type CountBiztypesTrendsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 趋势图
	Data *Trend `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CountBiztypesTrendsResponse) String() string {
	return tea.Prettify(s)
}

func (s CountBiztypesTrendsResponse) GoString() string {
	return s.String()
}

func (s *CountBiztypesTrendsResponse) SetReqMsgId(v string) *CountBiztypesTrendsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountBiztypesTrendsResponse) SetResultCode(v string) *CountBiztypesTrendsResponse {
	s.ResultCode = &v
	return s
}

func (s *CountBiztypesTrendsResponse) SetResultMsg(v string) *CountBiztypesTrendsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountBiztypesTrendsResponse) SetData(v *Trend) *CountBiztypesTrendsResponse {
	s.Data = v
	return s
}

func (s *CountBiztypesTrendsResponse) SetSuccess(v bool) *CountBiztypesTrendsResponse {
	s.Success = &v
	return s
}

type GetGlobalStatsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 站内：租户+环境；站外：instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetGlobalStatsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGlobalStatsRequest) GoString() string {
	return s.String()
}

func (s *GetGlobalStatsRequest) SetAuthToken(v string) *GetGlobalStatsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGlobalStatsRequest) SetProductInstanceId(v string) *GetGlobalStatsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetGlobalStatsRequest) SetInstanceId(v string) *GetGlobalStatsRequest {
	s.InstanceId = &v
	return s
}

type GetGlobalStatsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 全局统计数
	Data *GlobalStats `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetGlobalStatsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGlobalStatsResponse) GoString() string {
	return s.String()
}

func (s *GetGlobalStatsResponse) SetReqMsgId(v string) *GetGlobalStatsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGlobalStatsResponse) SetResultCode(v string) *GetGlobalStatsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGlobalStatsResponse) SetResultMsg(v string) *GetGlobalStatsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGlobalStatsResponse) SetData(v *GlobalStats) *GetGlobalStatsResponse {
	s.Data = v
	return s
}

func (s *GetGlobalStatsResponse) SetSuccess(v bool) *GetGlobalStatsResponse {
	s.Success = &v
	return s
}

type ListTransactionDebugsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前分页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// id  desc
	OrderBy []*OrderByParams `json:"order_by,omitempty" xml:"order_by,omitempty" type:"Repeated"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// appname
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 1.进行中 4.成功
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 1.发起方 2.参与者
	DebugType *string `json:"debug_type,omitempty" xml:"debug_type,omitempty"`
}

func (s ListTransactionDebugsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionDebugsRequest) GoString() string {
	return s.String()
}

func (s *ListTransactionDebugsRequest) SetAuthToken(v string) *ListTransactionDebugsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetProductInstanceId(v string) *ListTransactionDebugsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetCurrentPage(v int64) *ListTransactionDebugsRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetInstanceId(v string) *ListTransactionDebugsRequest {
	s.InstanceId = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetOrderBy(v []*OrderByParams) *ListTransactionDebugsRequest {
	s.OrderBy = v
	return s
}

func (s *ListTransactionDebugsRequest) SetPageSize(v int64) *ListTransactionDebugsRequest {
	s.PageSize = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetAppName(v string) *ListTransactionDebugsRequest {
	s.AppName = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetState(v string) *ListTransactionDebugsRequest {
	s.State = &v
	return s
}

func (s *ListTransactionDebugsRequest) SetDebugType(v string) *ListTransactionDebugsRequest {
	s.DebugType = &v
	return s
}

type ListTransactionDebugsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 联调记录分页数据
	Data []*DebugRecord `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListTransactionDebugsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionDebugsResponse) GoString() string {
	return s.String()
}

func (s *ListTransactionDebugsResponse) SetReqMsgId(v string) *ListTransactionDebugsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetResultCode(v string) *ListTransactionDebugsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetResultMsg(v string) *ListTransactionDebugsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetCurrentPage(v int64) *ListTransactionDebugsResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetData(v []*DebugRecord) *ListTransactionDebugsResponse {
	s.Data = v
	return s
}

func (s *ListTransactionDebugsResponse) SetPageSize(v int64) *ListTransactionDebugsResponse {
	s.PageSize = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetSuccess(v bool) *ListTransactionDebugsResponse {
	s.Success = &v
	return s
}

func (s *ListTransactionDebugsResponse) SetTotal(v int64) *ListTransactionDebugsResponse {
	s.Total = &v
	return s
}

type GetTransactionsDebugsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 记录id
	DebugId *int64 `json:"debug_id,omitempty" xml:"debug_id,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetTransactionsDebugsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsDebugsRequest) GoString() string {
	return s.String()
}

func (s *GetTransactionsDebugsRequest) SetAuthToken(v string) *GetTransactionsDebugsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransactionsDebugsRequest) SetProductInstanceId(v string) *GetTransactionsDebugsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransactionsDebugsRequest) SetDebugId(v int64) *GetTransactionsDebugsRequest {
	s.DebugId = &v
	return s
}

func (s *GetTransactionsDebugsRequest) SetInstanceId(v string) *GetTransactionsDebugsRequest {
	s.InstanceId = &v
	return s
}

type GetTransactionsDebugsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 单个联调记录详情
	Data *DebugRecord `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetTransactionsDebugsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsDebugsResponse) GoString() string {
	return s.String()
}

func (s *GetTransactionsDebugsResponse) SetReqMsgId(v string) *GetTransactionsDebugsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransactionsDebugsResponse) SetResultCode(v string) *GetTransactionsDebugsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransactionsDebugsResponse) SetResultMsg(v string) *GetTransactionsDebugsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransactionsDebugsResponse) SetData(v *DebugRecord) *GetTransactionsDebugsResponse {
	s.Data = v
	return s
}

func (s *GetTransactionsDebugsResponse) SetSuccess(v bool) *GetTransactionsDebugsResponse {
	s.Success = &v
	return s
}

type QueryTransactionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 业务码
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
	// 当前分页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 结束时间
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 开始时间
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 事务状态  默认传 all， 其他可选状态 Activity 、 Exception 、 Finish
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty"`
}

func (s QueryTransactionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTransactionsRequest) GoString() string {
	return s.String()
}

func (s *QueryTransactionsRequest) SetAuthToken(v string) *QueryTransactionsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTransactionsRequest) SetProductInstanceId(v string) *QueryTransactionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTransactionsRequest) SetAppName(v string) *QueryTransactionsRequest {
	s.AppName = &v
	return s
}

func (s *QueryTransactionsRequest) SetBizId(v string) *QueryTransactionsRequest {
	s.BizId = &v
	return s
}

func (s *QueryTransactionsRequest) SetBusinessType(v string) *QueryTransactionsRequest {
	s.BusinessType = &v
	return s
}

func (s *QueryTransactionsRequest) SetCurrentPage(v int64) *QueryTransactionsRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryTransactionsRequest) SetEndTime(v int64) *QueryTransactionsRequest {
	s.EndTime = &v
	return s
}

func (s *QueryTransactionsRequest) SetInstanceId(v string) *QueryTransactionsRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryTransactionsRequest) SetPageSize(v int64) *QueryTransactionsRequest {
	s.PageSize = &v
	return s
}

func (s *QueryTransactionsRequest) SetStartTime(v int64) *QueryTransactionsRequest {
	s.StartTime = &v
	return s
}

func (s *QueryTransactionsRequest) SetState(v string) *QueryTransactionsRequest {
	s.State = &v
	return s
}

func (s *QueryTransactionsRequest) SetTxId(v string) *QueryTransactionsRequest {
	s.TxId = &v
	return s
}

type QueryTransactionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 事务列表
	Data []*TransactionInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryTransactionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTransactionsResponse) GoString() string {
	return s.String()
}

func (s *QueryTransactionsResponse) SetReqMsgId(v string) *QueryTransactionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTransactionsResponse) SetResultCode(v string) *QueryTransactionsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTransactionsResponse) SetResultMsg(v string) *QueryTransactionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTransactionsResponse) SetCurrentPage(v int64) *QueryTransactionsResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryTransactionsResponse) SetData(v []*TransactionInfo) *QueryTransactionsResponse {
	s.Data = v
	return s
}

func (s *QueryTransactionsResponse) SetPageSize(v int64) *QueryTransactionsResponse {
	s.PageSize = &v
	return s
}

func (s *QueryTransactionsResponse) SetSuccess(v bool) *QueryTransactionsResponse {
	s.Success = &v
	return s
}

func (s *QueryTransactionsResponse) SetTotal(v int64) *QueryTransactionsResponse {
	s.Total = &v
	return s
}

type GetTransactionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s GetTransactionsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsRequest) GoString() string {
	return s.String()
}

func (s *GetTransactionsRequest) SetAuthToken(v string) *GetTransactionsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransactionsRequest) SetProductInstanceId(v string) *GetTransactionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransactionsRequest) SetInstanceId(v string) *GetTransactionsRequest {
	s.InstanceId = &v
	return s
}

func (s *GetTransactionsRequest) SetTxId(v string) *GetTransactionsRequest {
	s.TxId = &v
	return s
}

type GetTransactionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回对象
	Data *TransactionParticipators `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetTransactionsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsResponse) GoString() string {
	return s.String()
}

func (s *GetTransactionsResponse) SetReqMsgId(v string) *GetTransactionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransactionsResponse) SetResultCode(v string) *GetTransactionsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransactionsResponse) SetResultMsg(v string) *GetTransactionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransactionsResponse) SetData(v *TransactionParticipators) *GetTransactionsResponse {
	s.Data = v
	return s
}

func (s *GetTransactionsResponse) SetSuccess(v bool) *GetTransactionsResponse {
	s.Success = &v
	return s
}

type CreateTransactionsCorrectionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分支事务上下文
	ActionContext *string `json:"action_context,omitempty" xml:"action_context,omitempty" require:"true"`
	// PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 操作类型；1、提交，2、回滚
	ActionType *int64 `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
	// 主事务上下文
	ActivityContext *string `json:"activity_context,omitempty" xml:"activity_context,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 1：提交，2：回滚
	IsCommit *int64 `json:"is_commit,omitempty" xml:"is_commit,omitempty" require:"true"`
	// 是否同步主账务；0、不同步，1、同步
	SyncAcctrans *int64 `json:"sync_acctrans,omitempty" xml:"sync_acctrans,omitempty" require:"true"`
	// 是否同步统一支付；0、不同步，1同步
	SyncPaycore *int64 `json:"sync_paycore,omitempty" xml:"sync_paycore,omitempty" require:"true"`
	// 事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
	// tracer上下文
	TracerContext *string `json:"tracer_context,omitempty" xml:"tracer_context,omitempty"`
}

func (s CreateTransactionsCorrectionsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTransactionsCorrectionsRequest) GoString() string {
	return s.String()
}

func (s *CreateTransactionsCorrectionsRequest) SetAuthToken(v string) *CreateTransactionsCorrectionsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetProductInstanceId(v string) *CreateTransactionsCorrectionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetActionContext(v string) *CreateTransactionsCorrectionsRequest {
	s.ActionContext = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetActionName(v string) *CreateTransactionsCorrectionsRequest {
	s.ActionName = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetActionType(v int64) *CreateTransactionsCorrectionsRequest {
	s.ActionType = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetActivityContext(v string) *CreateTransactionsCorrectionsRequest {
	s.ActivityContext = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetInstanceId(v string) *CreateTransactionsCorrectionsRequest {
	s.InstanceId = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetIsCommit(v int64) *CreateTransactionsCorrectionsRequest {
	s.IsCommit = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetSyncAcctrans(v int64) *CreateTransactionsCorrectionsRequest {
	s.SyncAcctrans = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetSyncPaycore(v int64) *CreateTransactionsCorrectionsRequest {
	s.SyncPaycore = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetTxId(v string) *CreateTransactionsCorrectionsRequest {
	s.TxId = &v
	return s
}

func (s *CreateTransactionsCorrectionsRequest) SetTracerContext(v string) *CreateTransactionsCorrectionsRequest {
	s.TracerContext = &v
	return s
}

type CreateTransactionsCorrectionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口结果信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateTransactionsCorrectionsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTransactionsCorrectionsResponse) GoString() string {
	return s.String()
}

func (s *CreateTransactionsCorrectionsResponse) SetReqMsgId(v string) *CreateTransactionsCorrectionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTransactionsCorrectionsResponse) SetResultCode(v string) *CreateTransactionsCorrectionsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTransactionsCorrectionsResponse) SetResultMsg(v string) *CreateTransactionsCorrectionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTransactionsCorrectionsResponse) SetMsg(v string) *CreateTransactionsCorrectionsResponse {
	s.Msg = &v
	return s
}

func (s *CreateTransactionsCorrectionsResponse) SetSuccess(v bool) *CreateTransactionsCorrectionsResponse {
	s.Success = &v
	return s
}

type GetTransactionsCorrectionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 记录id
	CorrectionId *int64 `json:"correction_id,omitempty" xml:"correction_id,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s GetTransactionsCorrectionsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsCorrectionsRequest) GoString() string {
	return s.String()
}

func (s *GetTransactionsCorrectionsRequest) SetAuthToken(v string) *GetTransactionsCorrectionsRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransactionsCorrectionsRequest) SetProductInstanceId(v string) *GetTransactionsCorrectionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransactionsCorrectionsRequest) SetCorrectionId(v int64) *GetTransactionsCorrectionsRequest {
	s.CorrectionId = &v
	return s
}

func (s *GetTransactionsCorrectionsRequest) SetInstanceId(v string) *GetTransactionsCorrectionsRequest {
	s.InstanceId = &v
	return s
}

type GetTransactionsCorrectionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事务悬挂恢复详情
	Data *Correction `json:"data,omitempty" xml:"data,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s GetTransactionsCorrectionsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionsCorrectionsResponse) GoString() string {
	return s.String()
}

func (s *GetTransactionsCorrectionsResponse) SetReqMsgId(v string) *GetTransactionsCorrectionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransactionsCorrectionsResponse) SetResultCode(v string) *GetTransactionsCorrectionsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransactionsCorrectionsResponse) SetResultMsg(v string) *GetTransactionsCorrectionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransactionsCorrectionsResponse) SetData(v *Correction) *GetTransactionsCorrectionsResponse {
	s.Data = v
	return s
}

func (s *GetTransactionsCorrectionsResponse) SetSuccess(v bool) *GetTransactionsCorrectionsResponse {
	s.Success = &v
	return s
}

type ExecTransactionsCorrectionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 执行事务订正 id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ExecTransactionsCorrectionsRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecTransactionsCorrectionsRequest) GoString() string {
	return s.String()
}

func (s *ExecTransactionsCorrectionsRequest) SetAuthToken(v string) *ExecTransactionsCorrectionsRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecTransactionsCorrectionsRequest) SetProductInstanceId(v string) *ExecTransactionsCorrectionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecTransactionsCorrectionsRequest) SetId(v int64) *ExecTransactionsCorrectionsRequest {
	s.Id = &v
	return s
}

func (s *ExecTransactionsCorrectionsRequest) SetInstanceId(v string) *ExecTransactionsCorrectionsRequest {
	s.InstanceId = &v
	return s
}

type ExecTransactionsCorrectionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecTransactionsCorrectionsResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecTransactionsCorrectionsResponse) GoString() string {
	return s.String()
}

func (s *ExecTransactionsCorrectionsResponse) SetReqMsgId(v string) *ExecTransactionsCorrectionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecTransactionsCorrectionsResponse) SetResultCode(v string) *ExecTransactionsCorrectionsResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecTransactionsCorrectionsResponse) SetResultMsg(v string) *ExecTransactionsCorrectionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecTransactionsCorrectionsResponse) SetMsg(v string) *ExecTransactionsCorrectionsResponse {
	s.Msg = &v
	return s
}

func (s *ExecTransactionsCorrectionsResponse) SetSuccess(v bool) *ExecTransactionsCorrectionsResponse {
	s.Success = &v
	return s
}

type ListTransactionCorrectionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aaa
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty"`
	// current_page
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// instanceId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// id desc
	OrderBy []*OrderByParams `json:"order_by,omitempty" xml:"order_by,omitempty" type:"Repeated"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 0 已提交 4 成功
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
}

func (s ListTransactionCorrectionsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionCorrectionsRequest) GoString() string {
	return s.String()
}

func (s *ListTransactionCorrectionsRequest) SetAuthToken(v string) *ListTransactionCorrectionsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetProductInstanceId(v string) *ListTransactionCorrectionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetActionType(v string) *ListTransactionCorrectionsRequest {
	s.ActionType = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetCurrentPage(v int64) *ListTransactionCorrectionsRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetInstanceId(v string) *ListTransactionCorrectionsRequest {
	s.InstanceId = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetOrderBy(v []*OrderByParams) *ListTransactionCorrectionsRequest {
	s.OrderBy = v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetPageSize(v int64) *ListTransactionCorrectionsRequest {
	s.PageSize = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetState(v string) *ListTransactionCorrectionsRequest {
	s.State = &v
	return s
}

func (s *ListTransactionCorrectionsRequest) SetAppName(v string) *ListTransactionCorrectionsRequest {
	s.AppName = &v
	return s
}

type ListTransactionCorrectionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// a
	Data []*Correction `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 1
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListTransactionCorrectionsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionCorrectionsResponse) GoString() string {
	return s.String()
}

func (s *ListTransactionCorrectionsResponse) SetReqMsgId(v string) *ListTransactionCorrectionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetResultCode(v string) *ListTransactionCorrectionsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetResultMsg(v string) *ListTransactionCorrectionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetCurrentPage(v int64) *ListTransactionCorrectionsResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetData(v []*Correction) *ListTransactionCorrectionsResponse {
	s.Data = v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetPageSize(v int64) *ListTransactionCorrectionsResponse {
	s.PageSize = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetSuccess(v bool) *ListTransactionCorrectionsResponse {
	s.Success = &v
	return s
}

func (s *ListTransactionCorrectionsResponse) SetTotal(v int64) *ListTransactionCorrectionsResponse {
	s.Total = &v
	return s
}

type ListTransactionAppsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s ListTransactionAppsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionAppsRequest) GoString() string {
	return s.String()
}

func (s *ListTransactionAppsRequest) SetAuthToken(v string) *ListTransactionAppsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTransactionAppsRequest) SetProductInstanceId(v string) *ListTransactionAppsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTransactionAppsRequest) SetInstanceId(v string) *ListTransactionAppsRequest {
	s.InstanceId = &v
	return s
}

type ListTransactionAppsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// apps
	Apps []*TrasactionAppInfo `json:"apps,omitempty" xml:"apps,omitempty" type:"Repeated"`
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListTransactionAppsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTransactionAppsResponse) GoString() string {
	return s.String()
}

func (s *ListTransactionAppsResponse) SetReqMsgId(v string) *ListTransactionAppsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTransactionAppsResponse) SetResultCode(v string) *ListTransactionAppsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTransactionAppsResponse) SetResultMsg(v string) *ListTransactionAppsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListTransactionAppsResponse) SetApps(v []*TrasactionAppInfo) *ListTransactionAppsResponse {
	s.Apps = v
	return s
}

func (s *ListTransactionAppsResponse) SetSuccess(v bool) *ListTransactionAppsResponse {
	s.Success = &v
	return s
}

type GetTransactionChartRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aaaa
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// aaa
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s GetTransactionChartRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionChartRequest) GoString() string {
	return s.String()
}

func (s *GetTransactionChartRequest) SetAuthToken(v string) *GetTransactionChartRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransactionChartRequest) SetProductInstanceId(v string) *GetTransactionChartRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransactionChartRequest) SetInstanceId(v string) *GetTransactionChartRequest {
	s.InstanceId = &v
	return s
}

func (s *GetTransactionChartRequest) SetTxId(v string) *GetTransactionChartRequest {
	s.TxId = &v
	return s
}

type GetTransactionChartResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// a
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// a
	Data *TransactionChartInfo `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetTransactionChartResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionChartResponse) GoString() string {
	return s.String()
}

func (s *GetTransactionChartResponse) SetReqMsgId(v string) *GetTransactionChartResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransactionChartResponse) SetResultCode(v string) *GetTransactionChartResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransactionChartResponse) SetResultMsg(v string) *GetTransactionChartResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransactionChartResponse) SetSuccess(v bool) *GetTransactionChartResponse {
	s.Success = &v
	return s
}

func (s *GetTransactionChartResponse) SetData(v *TransactionChartInfo) *GetTransactionChartResponse {
	s.Data = v
	return s
}

type GetTransactionSagaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 主事务id
	TxId *string `json:"tx_id,omitempty" xml:"tx_id,omitempty" require:"true"`
}

func (s GetTransactionSagaRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionSagaRequest) GoString() string {
	return s.String()
}

func (s *GetTransactionSagaRequest) SetAuthToken(v string) *GetTransactionSagaRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTransactionSagaRequest) SetProductInstanceId(v string) *GetTransactionSagaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTransactionSagaRequest) SetInstanceId(v string) *GetTransactionSagaRequest {
	s.InstanceId = &v
	return s
}

func (s *GetTransactionSagaRequest) SetTxId(v string) *GetTransactionSagaRequest {
	s.TxId = &v
	return s
}

type GetTransactionSagaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态机执行记录json
	StatemachineInstJson *string `json:"statemachine_inst_json,omitempty" xml:"statemachine_inst_json,omitempty"`
}

func (s GetTransactionSagaResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTransactionSagaResponse) GoString() string {
	return s.String()
}

func (s *GetTransactionSagaResponse) SetReqMsgId(v string) *GetTransactionSagaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTransactionSagaResponse) SetResultCode(v string) *GetTransactionSagaResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTransactionSagaResponse) SetResultMsg(v string) *GetTransactionSagaResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTransactionSagaResponse) SetStatemachineInstJson(v string) *GetTransactionSagaResponse {
	s.StatemachineInstJson = &v
	return s
}

type ListWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名筛选
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 环境唯一标识
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 排序数组
	OrderBy []*OrderByParams `json:"order_by,omitempty" xml:"order_by,omitempty" type:"Repeated"`
}

func (s ListWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s ListWhitelistRequest) GoString() string {
	return s.String()
}

func (s *ListWhitelistRequest) SetAuthToken(v string) *ListWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *ListWhitelistRequest) SetProductInstanceId(v string) *ListWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListWhitelistRequest) SetAppName(v string) *ListWhitelistRequest {
	s.AppName = &v
	return s
}

func (s *ListWhitelistRequest) SetCurrentPage(v int64) *ListWhitelistRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListWhitelistRequest) SetInstanceId(v string) *ListWhitelistRequest {
	s.InstanceId = &v
	return s
}

func (s *ListWhitelistRequest) SetPageSize(v int64) *ListWhitelistRequest {
	s.PageSize = &v
	return s
}

func (s *ListWhitelistRequest) SetOrderBy(v []*OrderByParams) *ListWhitelistRequest {
	s.OrderBy = v
	return s
}

type ListWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// data
	Data []*WhiteListInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 接口返回码
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s ListWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s ListWhitelistResponse) GoString() string {
	return s.String()
}

func (s *ListWhitelistResponse) SetReqMsgId(v string) *ListWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListWhitelistResponse) SetResultCode(v string) *ListWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *ListWhitelistResponse) SetResultMsg(v string) *ListWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListWhitelistResponse) SetCurrentPage(v int64) *ListWhitelistResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListWhitelistResponse) SetData(v []*WhiteListInfo) *ListWhitelistResponse {
	s.Data = v
	return s
}

func (s *ListWhitelistResponse) SetPageSize(v int64) *ListWhitelistResponse {
	s.PageSize = &v
	return s
}

func (s *ListWhitelistResponse) SetSuccess(v bool) *ListWhitelistResponse {
	s.Success = &v
	return s
}

func (s *ListWhitelistResponse) SetTotal(v int64) *ListWhitelistResponse {
	s.Total = &v
	return s
}

type UpdateWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 0非弹机房，1弹性机房；
	IsElastic *int64 `json:"is_elastic,omitempty" xml:"is_elastic,omitempty" require:"true"`
	// 0正常流量，1影子流量；
	IsLoadTest *int64 `json:"is_load_test,omitempty" xml:"is_load_test,omitempty" require:"true"`
	// 数据源名称
	LogicalDsName *string `json:"logical_ds_name,omitempty" xml:"logical_ds_name,omitempty" require:"true"`
	// business_type
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty" require:"true"`
}

func (s UpdateWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateWhitelistRequest) GoString() string {
	return s.String()
}

func (s *UpdateWhitelistRequest) SetAuthToken(v string) *UpdateWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateWhitelistRequest) SetProductInstanceId(v string) *UpdateWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateWhitelistRequest) SetAppName(v string) *UpdateWhitelistRequest {
	s.AppName = &v
	return s
}

func (s *UpdateWhitelistRequest) SetId(v int64) *UpdateWhitelistRequest {
	s.Id = &v
	return s
}

func (s *UpdateWhitelistRequest) SetInstanceId(v string) *UpdateWhitelistRequest {
	s.InstanceId = &v
	return s
}

func (s *UpdateWhitelistRequest) SetIsElastic(v int64) *UpdateWhitelistRequest {
	s.IsElastic = &v
	return s
}

func (s *UpdateWhitelistRequest) SetIsLoadTest(v int64) *UpdateWhitelistRequest {
	s.IsLoadTest = &v
	return s
}

func (s *UpdateWhitelistRequest) SetLogicalDsName(v string) *UpdateWhitelistRequest {
	s.LogicalDsName = &v
	return s
}

func (s *UpdateWhitelistRequest) SetBusinessType(v string) *UpdateWhitelistRequest {
	s.BusinessType = &v
	return s
}

type UpdateWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateWhitelistResponse) GoString() string {
	return s.String()
}

func (s *UpdateWhitelistResponse) SetReqMsgId(v string) *UpdateWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateWhitelistResponse) SetResultCode(v string) *UpdateWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateWhitelistResponse) SetResultMsg(v string) *UpdateWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateWhitelistResponse) SetMsg(v string) *UpdateWhitelistResponse {
	s.Msg = &v
	return s
}

func (s *UpdateWhitelistResponse) SetSuccess(v bool) *UpdateWhitelistResponse {
	s.Success = &v
	return s
}

type AddWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 0非弹机房，1弹性机房；
	IsElastic *int64 `json:"is_elastic,omitempty" xml:"is_elastic,omitempty" require:"true"`
	// 数据源名称
	LogicalDsName *string `json:"logical_ds_name,omitempty" xml:"logical_ds_name,omitempty" require:"true"`
	// 业务类型
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty"`
}

func (s AddWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s AddWhitelistRequest) GoString() string {
	return s.String()
}

func (s *AddWhitelistRequest) SetAuthToken(v string) *AddWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *AddWhitelistRequest) SetProductInstanceId(v string) *AddWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddWhitelistRequest) SetAppName(v string) *AddWhitelistRequest {
	s.AppName = &v
	return s
}

func (s *AddWhitelistRequest) SetInstanceId(v string) *AddWhitelistRequest {
	s.InstanceId = &v
	return s
}

func (s *AddWhitelistRequest) SetIsElastic(v int64) *AddWhitelistRequest {
	s.IsElastic = &v
	return s
}

func (s *AddWhitelistRequest) SetLogicalDsName(v string) *AddWhitelistRequest {
	s.LogicalDsName = &v
	return s
}

func (s *AddWhitelistRequest) SetBusinessType(v string) *AddWhitelistRequest {
	s.BusinessType = &v
	return s
}

type AddWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 新增白名单成功
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s AddWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s AddWhitelistResponse) GoString() string {
	return s.String()
}

func (s *AddWhitelistResponse) SetReqMsgId(v string) *AddWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddWhitelistResponse) SetResultCode(v string) *AddWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *AddWhitelistResponse) SetResultMsg(v string) *AddWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddWhitelistResponse) SetMsg(v string) *AddWhitelistResponse {
	s.Msg = &v
	return s
}

func (s *AddWhitelistResponse) SetSuccess(v bool) *AddWhitelistResponse {
	s.Success = &v
	return s
}

type PushWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// ref _id
	RefId *int64 `json:"ref_id,omitempty" xml:"ref_id,omitempty" require:"true"`
	// 1按照服务器推送 2按照集群推送
	Type *int64 `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
	PushTarget []*string `json:"push_target,omitempty" xml:"push_target,omitempty" require:"true" type:"Repeated"`
}

func (s PushWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s PushWhitelistRequest) GoString() string {
	return s.String()
}

func (s *PushWhitelistRequest) SetAuthToken(v string) *PushWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *PushWhitelistRequest) SetProductInstanceId(v string) *PushWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushWhitelistRequest) SetInstanceId(v string) *PushWhitelistRequest {
	s.InstanceId = &v
	return s
}

func (s *PushWhitelistRequest) SetRefId(v int64) *PushWhitelistRequest {
	s.RefId = &v
	return s
}

func (s *PushWhitelistRequest) SetType(v int64) *PushWhitelistRequest {
	s.Type = &v
	return s
}

func (s *PushWhitelistRequest) SetPushTarget(v []*string) *PushWhitelistRequest {
	s.PushTarget = v
	return s
}

type PushWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 容灾推送到{Master|Failover}成功
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s PushWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s PushWhitelistResponse) GoString() string {
	return s.String()
}

func (s *PushWhitelistResponse) SetReqMsgId(v string) *PushWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushWhitelistResponse) SetResultCode(v string) *PushWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *PushWhitelistResponse) SetResultMsg(v string) *PushWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushWhitelistResponse) SetMsg(v string) *PushWhitelistResponse {
	s.Msg = &v
	return s
}

func (s *PushWhitelistResponse) SetSuccess(v bool) *PushWhitelistResponse {
	s.Success = &v
	return s
}

type DeleteWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// instance_id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
}

func (s DeleteWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteWhitelistRequest) GoString() string {
	return s.String()
}

func (s *DeleteWhitelistRequest) SetAuthToken(v string) *DeleteWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteWhitelistRequest) SetProductInstanceId(v string) *DeleteWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteWhitelistRequest) SetId(v int64) *DeleteWhitelistRequest {
	s.Id = &v
	return s
}

func (s *DeleteWhitelistRequest) SetInstanceId(v string) *DeleteWhitelistRequest {
	s.InstanceId = &v
	return s
}

type DeleteWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除成功
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteWhitelistResponse) GoString() string {
	return s.String()
}

func (s *DeleteWhitelistResponse) SetReqMsgId(v string) *DeleteWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteWhitelistResponse) SetResultCode(v string) *DeleteWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteWhitelistResponse) SetResultMsg(v string) *DeleteWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteWhitelistResponse) SetMsg(v string) *DeleteWhitelistResponse {
	s.Msg = &v
	return s
}

func (s *DeleteWhitelistResponse) SetSuccess(v bool) *DeleteWhitelistResponse {
	s.Success = &v
	return s
}

type ListWhitelistZonesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aaaaa
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// app
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// ds
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty" require:"true"`
}

func (s ListWhitelistZonesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListWhitelistZonesRequest) GoString() string {
	return s.String()
}

func (s *ListWhitelistZonesRequest) SetAuthToken(v string) *ListWhitelistZonesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListWhitelistZonesRequest) SetProductInstanceId(v string) *ListWhitelistZonesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListWhitelistZonesRequest) SetInstanceId(v string) *ListWhitelistZonesRequest {
	s.InstanceId = &v
	return s
}

func (s *ListWhitelistZonesRequest) SetAppName(v string) *ListWhitelistZonesRequest {
	s.AppName = &v
	return s
}

func (s *ListWhitelistZonesRequest) SetDsName(v string) *ListWhitelistZonesRequest {
	s.DsName = &v
	return s
}

type ListWhitelistZonesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListWhitelistZonesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListWhitelistZonesResponse) GoString() string {
	return s.String()
}

func (s *ListWhitelistZonesResponse) SetReqMsgId(v string) *ListWhitelistZonesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListWhitelistZonesResponse) SetResultCode(v string) *ListWhitelistZonesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListWhitelistZonesResponse) SetResultMsg(v string) *ListWhitelistZonesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListWhitelistZonesResponse) SetData(v []*string) *ListWhitelistZonesResponse {
	s.Data = v
	return s
}

func (s *ListWhitelistZonesResponse) SetSuccess(v bool) *ListWhitelistZonesResponse {
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
				"sdk_version":      tea.String("1.0.166"),
				"_prod_code":       tea.String("DTX"),
				"_prod_channel":    tea.String("undefined"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("prodapigw-sofastack.cloud.alipay.com")),
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
 * Description: 创建应用
 * Summary: 创建应用
 */
func (client *Client) CreateApps(request *CreateAppsRequest) (_result *CreateAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppsResponse{}
	_body, _err := client.CreateAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建应用
 * Summary: 创建应用
 */
func (client *Client) CreateAppsEx(request *CreateAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起方接入，新增发起方配置
 * Summary: 发起方接入
 */
func (client *Client) CreateRecoveryInitiators(request *CreateRecoveryInitiatorsRequest) (_result *CreateRecoveryInitiatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRecoveryInitiatorsResponse{}
	_body, _err := client.CreateRecoveryInitiatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起方接入，新增发起方配置
 * Summary: 发起方接入
 */
func (client *Client) CreateRecoveryInitiatorsEx(request *CreateRecoveryInitiatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRecoveryInitiatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRecoveryInitiatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.initiators.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据app获取事务概览统计
 * Summary: 获取bizType事务概览统计
 */
func (client *Client) CountAppsStats(request *CountAppsStatsRequest) (_result *CountAppsStatsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountAppsStatsResponse{}
	_body, _err := client.CountAppsStatsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据app获取事务概览统计
 * Summary: 获取bizType事务概览统计
 */
func (client *Client) CountAppsStatsEx(request *CountAppsStatsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountAppsStatsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountAppsStatsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.stats.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取bizType列表
 * Summary: 获取bizType列表
 */
func (client *Client) ListAppsBiztypes(request *ListAppsBiztypesRequest) (_result *ListAppsBiztypesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppsBiztypesResponse{}
	_body, _err := client.ListAppsBiztypesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取bizType列表
 * Summary: 获取bizType列表
 */
func (client *Client) ListAppsBiztypesEx(request *ListAppsBiztypesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppsBiztypesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppsBiztypesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.biztypes.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: app+发起方/参与者 导出配置
 * Summary: 导出配置
 */
func (client *Client) ExportAppsConfigs(request *ExportAppsConfigsRequest) (_result *ExportAppsConfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportAppsConfigsResponse{}
	_body, _err := client.ExportAppsConfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: app+发起方/参与者 导出配置
 * Summary: 导出配置
 */
func (client *Client) ExportAppsConfigsEx(request *ExportAppsConfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportAppsConfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportAppsConfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.configs.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取应用名（app_name）列表
 * Summary: 获取应用名（app_name）列表
 */
func (client *Client) AllAppsAppnames(request *AllAppsAppnamesRequest) (_result *AllAppsAppnamesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAppsAppnamesResponse{}
	_body, _err := client.AllAppsAppnamesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取应用名（app_name）列表
 * Summary: 获取应用名（app_name）列表
 */
func (client *Client) AllAppsAppnamesEx(request *AllAppsAppnamesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAppsAppnamesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAppsAppnamesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.appnames.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用事务列表，分页
 * Summary: 应用事务列表
 */
func (client *Client) ListApps(request *ListAppsRequest) (_result *ListAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppsResponse{}
	_body, _err := client.ListAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用事务列表，分页
 * Summary: 应用事务列表
 */
func (client *Client) ListAppsEx(request *ListAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个参与者详情
 * Summary: 单个参与者详情
 */
func (client *Client) GetRecoveryParticipators(request *GetRecoveryParticipatorsRequest) (_result *GetRecoveryParticipatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRecoveryParticipatorsResponse{}
	_body, _err := client.GetRecoveryParticipatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个参与者详情
 * Summary: 单个参与者详情
 */
func (client *Client) GetRecoveryParticipatorsEx(request *GetRecoveryParticipatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRecoveryParticipatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRecoveryParticipatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.participators.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导出配置中需要有app、类型信息（发起方/参与者）
 * Summary: 导入配置
 */
func (client *Client) ImportAppsConfigs(request *ImportAppsConfigsRequest) (_result *ImportAppsConfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAppsConfigsResponse{}
	_body, _err := client.ImportAppsConfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导出配置中需要有app、类型信息（发起方/参与者）
 * Summary: 导入配置
 */
func (client *Client) ImportAppsConfigsEx(request *ImportAppsConfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAppsConfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAppsConfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.configs.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取上传文件URL
 * Summary: 获取上传文件URL
 */
func (client *Client) GetUploadUrl(request *GetUploadUrlRequest) (_result *GetUploadUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetUploadUrlResponse{}
	_body, _err := client.GetUploadUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取上传文件URL
 * Summary: 获取上传文件URL
 */
func (client *Client) GetUploadUrlEx(request *GetUploadUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetUploadUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetUploadUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.upload.url.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
 * Summary: 查询bizType的调用关系
 */
func (client *Client) QueryAppsBiztype(request *QueryAppsBiztypeRequest) (_result *QueryAppsBiztypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAppsBiztypeResponse{}
	_body, _err := client.QueryAppsBiztypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
 * Summary: 查询bizType的调用关系
 */
func (client *Client) QueryAppsBiztypeEx(request *QueryAppsBiztypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAppsBiztypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAppsBiztypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.biztype.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建发起者获取数据源
 * Summary: 创建发起者获取数据源
 */
func (client *Client) ListAppsRecoverydsname(request *ListAppsRecoverydsnameRequest) (_result *ListAppsRecoverydsnameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppsRecoverydsnameResponse{}
	_body, _err := client.ListAppsRecoverydsnameEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建发起者获取数据源
 * Summary: 创建发起者获取数据源
 */
func (client *Client) ListAppsRecoverydsnameEx(request *ListAppsRecoverydsnameRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppsRecoverydsnameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppsRecoverydsnameResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.recoverydsname.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个biztype的关联关系，Saga则是状态机json定义
 * Summary: 单个biztype的关联关系
 */
func (client *Client) GetAppsBiztype(request *GetAppsBiztypeRequest) (_result *GetAppsBiztypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAppsBiztypeResponse{}
	_body, _err := client.GetAppsBiztypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个biztype的关联关系，Saga则是状态机json定义
 * Summary: 单个biztype的关联关系
 */
func (client *Client) GetAppsBiztypeEx(request *GetAppsBiztypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAppsBiztypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAppsBiztypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.biztype.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事务更新
 * Summary: 事务更新
 */
func (client *Client) UpdateAppsBiztype(request *UpdateAppsBiztypeRequest) (_result *UpdateAppsBiztypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAppsBiztypeResponse{}
	_body, _err := client.UpdateAppsBiztypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事务更新
 * Summary: 事务更新
 */
func (client *Client) UpdateAppsBiztypeEx(request *UpdateAppsBiztypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAppsBiztypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAppsBiztypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.biztype.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增应用配置（包括发起方和参与者）
 * Summary: 新增应用配置（包括发起方和参与者）
 */
func (client *Client) CreateAppsConfigs(request *CreateAppsConfigsRequest) (_result *CreateAppsConfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppsConfigsResponse{}
	_body, _err := client.CreateAppsConfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增应用配置（包括发起方和参与者）
 * Summary: 新增应用配置（包括发起方和参与者）
 */
func (client *Client) CreateAppsConfigsEx(request *CreateAppsConfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppsConfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppsConfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.configs.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事务配置-导入配置
 * Summary: 应用配置-导入配置
 */
func (client *Client) ImportAppsNewconfigs(request *ImportAppsNewconfigsRequest) (_result *ImportAppsNewconfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAppsNewconfigsResponse{}
	_body, _err := client.ImportAppsNewconfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事务配置-导入配置
 * Summary: 应用配置-导入配置
 */
func (client *Client) ImportAppsNewconfigsEx(request *ImportAppsNewconfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAppsNewconfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAppsNewconfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.newconfigs.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: app+发起方/参与者 导出配置
 * Summary: 应用配置-导出配置
 */
func (client *Client) ExportAppsNewconfigs(request *ExportAppsNewconfigsRequest) (_result *ExportAppsNewconfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportAppsNewconfigsResponse{}
	_body, _err := client.ExportAppsNewconfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: app+发起方/参与者 导出配置
 * Summary: 应用配置-导出配置
 */
func (client *Client) ExportAppsNewconfigsEx(request *ExportAppsNewconfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportAppsNewconfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportAppsNewconfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.newconfigs.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 导出配置中需要有事务信息
 * Summary: 事务配置-导入配置
 */
func (client *Client) ImportTxConfigs(request *ImportTxConfigsRequest) (_result *ImportTxConfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTxConfigsResponse{}
	_body, _err := client.ImportTxConfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 导出配置中需要有事务信息
 * Summary: 事务配置-导入配置
 */
func (client *Client) ImportTxConfigsEx(request *ImportTxConfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTxConfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTxConfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.tx.configs.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事务导出配置
 * Summary: 事务配置-导出配置
 */
func (client *Client) ExportTxConfigs(request *ExportTxConfigsRequest) (_result *ExportTxConfigsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportTxConfigsResponse{}
	_body, _err := client.ExportTxConfigsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事务导出配置
 * Summary: 事务配置-导出配置
 */
func (client *Client) ExportTxConfigsEx(request *ExportTxConfigsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportTxConfigsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportTxConfigsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.tx.configs.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 管控台1.1 应用配置列表
 * Summary: 应用配置列表
 */
func (client *Client) ListNewApps(request *ListNewAppsRequest) (_result *ListNewAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListNewAppsResponse{}
	_body, _err := client.ListNewAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 管控台1.1 应用配置列表
 * Summary: 应用配置列表
 */
func (client *Client) ListNewAppsEx(request *ListNewAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListNewAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListNewAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.new.apps.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新应用详情界面
 * Summary: 应用详情
 */
func (client *Client) QueryAppsDetail(request *QueryAppsDetailRequest) (_result *QueryAppsDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAppsDetailResponse{}
	_body, _err := client.QueryAppsDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新应用详情界面
 * Summary: 应用详情
 */
func (client *Client) QueryAppsDetailEx(request *QueryAppsDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAppsDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAppsDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 。
 * Summary: 应用删除
 */
func (client *Client) DeleteApps(request *DeleteAppsRequest) (_result *DeleteAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAppsResponse{}
	_body, _err := client.DeleteAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 。
 * Summary: 应用删除
 */
func (client *Client) DeleteAppsEx(request *DeleteAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起方删除
 * Summary: 发起方删除
 */
func (client *Client) DeleteAppsRecovery(request *DeleteAppsRecoveryRequest) (_result *DeleteAppsRecoveryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAppsRecoveryResponse{}
	_body, _err := client.DeleteAppsRecoveryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起方删除
 * Summary: 发起方删除
 */
func (client *Client) DeleteAppsRecoveryEx(request *DeleteAppsRecoveryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAppsRecoveryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAppsRecoveryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.recovery.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 参与者删除
 * Summary: 参与者删除
 */
func (client *Client) DeleteAppsAction(request *DeleteAppsActionRequest) (_result *DeleteAppsActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAppsActionResponse{}
	_body, _err := client.DeleteAppsActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 参与者删除
 * Summary: 参与者删除
 */
func (client *Client) DeleteAppsActionEx(request *DeleteAppsActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAppsActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAppsActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.action.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量新增 app下的发起方、参与者
 * Summary: 批量新增 app下的发起方、参与者
 */
func (client *Client) BatchcreateApps(request *BatchcreateAppsRequest) (_result *BatchcreateAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateAppsResponse{}
	_body, _err := client.BatchcreateAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量新增 app下的发起方、参与者
 * Summary: 批量新增 app下的发起方、参与者
 */
func (client *Client) BatchcreateAppsEx(request *BatchcreateAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个发起方新增/编辑
 * Summary: 单个发起方新增/编辑
 */
func (client *Client) CreateAppsRecovery(request *CreateAppsRecoveryRequest) (_result *CreateAppsRecoveryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppsRecoveryResponse{}
	_body, _err := client.CreateAppsRecoveryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个发起方新增/编辑
 * Summary: 单个发起方新增/编辑
 */
func (client *Client) CreateAppsRecoveryEx(request *CreateAppsRecoveryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppsRecoveryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppsRecoveryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.recovery.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 参与者新增/编辑
 * Summary: 参与者新增/编辑
 */
func (client *Client) CreateAppsAction(request *CreateAppsActionRequest) (_result *CreateAppsActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAppsActionResponse{}
	_body, _err := client.CreateAppsActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 参与者新增/编辑
 * Summary: 参与者新增/编辑
 */
func (client *Client) CreateAppsActionEx(request *CreateAppsActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAppsActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAppsActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.action.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新建/编辑事务关联关系
 * Summary: 新建/编辑事务关联关系
 */
func (client *Client) CreateBiztypeRelation(request *CreateBiztypeRelationRequest) (_result *CreateBiztypeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBiztypeRelationResponse{}
	_body, _err := client.CreateBiztypeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新建/编辑事务关联关系
 * Summary: 新建/编辑事务关联关系
 */
func (client *Client) CreateBiztypeRelationEx(request *CreateBiztypeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBiztypeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBiztypeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.biztype.relation.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除biztype关联关系
 * Summary: 删除biztype关联关系
 */
func (client *Client) DeleteAppsBiztype(request *DeleteAppsBiztypeRequest) (_result *DeleteAppsBiztypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAppsBiztypeResponse{}
	_body, _err := client.DeleteAppsBiztypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除biztype关联关系
 * Summary: 删除biztype关联关系
 */
func (client *Client) DeleteAppsBiztypeEx(request *DeleteAppsBiztypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAppsBiztypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAppsBiztypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.apps.biztype.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询biztype与发起方，参与者的关联关系
 * Summary: 查询biztype关联关系
 */
func (client *Client) QueryBiztypeRelation(request *QueryBiztypeRelationRequest) (_result *QueryBiztypeRelationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBiztypeRelationResponse{}
	_body, _err := client.QueryBiztypeRelationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询biztype与发起方，参与者的关联关系
 * Summary: 查询biztype关联关系
 */
func (client *Client) QueryBiztypeRelationEx(request *QueryBiztypeRelationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBiztypeRelationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBiztypeRelationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.biztype.relation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据txid，删除进行中的事务
 * Summary: 删除进行中的事务
 */
func (client *Client) DeleteTransactions(request *DeleteTransactionsRequest) (_result *DeleteTransactionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteTransactionsResponse{}
	_body, _err := client.DeleteTransactionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据txid，删除进行中的事务
 * Summary: 删除进行中的事务
 */
func (client *Client) DeleteTransactionsEx(request *DeleteTransactionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteTransactionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteTransactionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异库模式下， 发起方和参与者的配置信息。
role取值：1是发起方，2是参与者；
activityMode取值：1是同库模式，2是异库模式；
actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
 * Summary: 异库接入（包括发起方和参与者）
*/
func (client *Client) CreateRecoveryConfiguration(request *CreateRecoveryConfigurationRequest) (_result *CreateRecoveryConfigurationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRecoveryConfigurationResponse{}
	_body, _err := client.CreateRecoveryConfigurationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异库模式下， 发起方和参与者的配置信息。
role取值：1是发起方，2是参与者；
activityMode取值：1是同库模式，2是异库模式；
actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
 * Summary: 异库接入（包括发起方和参与者）
*/
func (client *Client) CreateRecoveryConfigurationEx(request *CreateRecoveryConfigurationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRecoveryConfigurationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRecoveryConfigurationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.configuration.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取当前环境信息，例如租户和环境
 * Summary: 获取当前环境
 */
func (client *Client) GetGlobalEnv(request *GetGlobalEnvRequest) (_result *GetGlobalEnvResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGlobalEnvResponse{}
	_body, _err := client.GetGlobalEnvEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取当前环境信息，例如租户和环境
 * Summary: 获取当前环境
 */
func (client *Client) GetGlobalEnvEx(request *GetGlobalEnvRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGlobalEnvResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGlobalEnvResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.global.env.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取instanceId
 * Summary: 获取instanceId
 */
func (client *Client) GetMiddlewareInstance(request *GetMiddlewareInstanceRequest) (_result *GetMiddlewareInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMiddlewareInstanceResponse{}
	_body, _err := client.GetMiddlewareInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取instanceId
 * Summary: 获取instanceId
 */
func (client *Client) GetMiddlewareInstanceEx(request *GetMiddlewareInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMiddlewareInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMiddlewareInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.middleware.instance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取zone信息
 * Summary: 获取zone信息
 */
func (client *Client) AllZone(request *AllZoneRequest) (_result *AllZoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllZoneResponse{}
	_body, _err := client.AllZoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取zone信息
 * Summary: 获取zone信息
 */
func (client *Client) AllZoneEx(request *AllZoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllZoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllZoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.zone.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起方接入配置的修改
 * Summary: 发起方编辑
 */
func (client *Client) UpdateRecoveryInitiators(request *UpdateRecoveryInitiatorsRequest) (_result *UpdateRecoveryInitiatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRecoveryInitiatorsResponse{}
	_body, _err := client.UpdateRecoveryInitiatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起方接入配置的修改
 * Summary: 发起方编辑
 */
func (client *Client) UpdateRecoveryInitiatorsEx(request *UpdateRecoveryInitiatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRecoveryInitiatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRecoveryInitiatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.initiators.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用作为参与者查询所有发起者
 * Summary: 应用作为参与者查询所有发起者
 */
func (client *Client) ListBiztypesInitiators(request *ListBiztypesInitiatorsRequest) (_result *ListBiztypesInitiatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListBiztypesInitiatorsResponse{}
	_body, _err := client.ListBiztypesInitiatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用作为参与者查询所有发起者
 * Summary: 应用作为参与者查询所有发起者
 */
func (client *Client) ListBiztypesInitiatorsEx(request *ListBiztypesInitiatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListBiztypesInitiatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListBiztypesInitiatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.biztypes.initiators.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据app获取数据源列表
 * Summary: 根据app获取数据源列表
 */
func (client *Client) AllInitiatorsDatasources(request *AllInitiatorsDatasourcesRequest) (_result *AllInitiatorsDatasourcesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllInitiatorsDatasourcesResponse{}
	_body, _err := client.AllInitiatorsDatasourcesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据app获取数据源列表
 * Summary: 根据app获取数据源列表
 */
func (client *Client) AllInitiatorsDatasourcesEx(request *AllInitiatorsDatasourcesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllInitiatorsDatasourcesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllInitiatorsDatasourcesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.initiators.datasources.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据app+dsName获取所有表
 * Summary: 根据app+dsName获取所有表
 */
func (client *Client) AllInitiatorsTables(request *AllInitiatorsTablesRequest) (_result *AllInitiatorsTablesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllInitiatorsTablesResponse{}
	_body, _err := client.AllInitiatorsTablesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据app+dsName获取所有表
 * Summary: 根据app+dsName获取所有表
 */
func (client *Client) AllInitiatorsTablesEx(request *AllInitiatorsTablesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllInitiatorsTablesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllInitiatorsTablesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.initiators.tables.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起方联调
 * Summary: 发起方联调
 */
func (client *Client) DebugInitiators(request *DebugInitiatorsRequest) (_result *DebugInitiatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DebugInitiatorsResponse{}
	_body, _err := client.DebugInitiatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起方联调
 * Summary: 发起方联调
 */
func (client *Client) DebugInitiatorsEx(request *DebugInitiatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DebugInitiatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DebugInitiatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.initiators.debug"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个发起方详情
 * Summary: 单个发起方详情
 */
func (client *Client) GetRecoveryInitiators(request *GetRecoveryInitiatorsRequest) (_result *GetRecoveryInitiatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRecoveryInitiatorsResponse{}
	_body, _err := client.GetRecoveryInitiatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个发起方详情
 * Summary: 单个发起方详情
 */
func (client *Client) GetRecoveryInitiatorsEx(request *GetRecoveryInitiatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRecoveryInitiatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRecoveryInitiatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.initiators.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 参与者接入，录入参与者信息
 * Summary: 参与者接入
 */
func (client *Client) CreateRecoveryParticipators(request *CreateRecoveryParticipatorsRequest) (_result *CreateRecoveryParticipatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRecoveryParticipatorsResponse{}
	_body, _err := client.CreateRecoveryParticipatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 参与者接入，录入参与者信息
 * Summary: 参与者接入
 */
func (client *Client) CreateRecoveryParticipatorsEx(request *CreateRecoveryParticipatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRecoveryParticipatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRecoveryParticipatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.participators.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新参与者配置信息
 * Summary: 参与者编辑
 */
func (client *Client) UpdateRecoveryParticipators(request *UpdateRecoveryParticipatorsRequest) (_result *UpdateRecoveryParticipatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRecoveryParticipatorsResponse{}
	_body, _err := client.UpdateRecoveryParticipatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新参与者配置信息
 * Summary: 参与者编辑
 */
func (client *Client) UpdateRecoveryParticipatorsEx(request *UpdateRecoveryParticipatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRecoveryParticipatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRecoveryParticipatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.recovery.participators.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  应用作为发起者查询所有参与者
 * Summary:  应用作为发起者查询所有参与者
 */
func (client *Client) ListBiztypesParticipators(request *ListBiztypesParticipatorsRequest) (_result *ListBiztypesParticipatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListBiztypesParticipatorsResponse{}
	_body, _err := client.ListBiztypesParticipatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  应用作为发起者查询所有参与者
 * Summary:  应用作为发起者查询所有参与者
 */
func (client *Client) ListBiztypesParticipatorsEx(request *ListBiztypesParticipatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListBiztypesParticipatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListBiztypesParticipatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.biztypes.participators.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据app获取所有的参与者名称
 * Summary: 根据app获取所有的参与者名称
 */
func (client *Client) AllParticipatorsActionames(request *AllParticipatorsActionamesRequest) (_result *AllParticipatorsActionamesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllParticipatorsActionamesResponse{}
	_body, _err := client.AllParticipatorsActionamesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据app获取所有的参与者名称
 * Summary: 根据app获取所有的参与者名称
 */
func (client *Client) AllParticipatorsActionamesEx(request *AllParticipatorsActionamesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllParticipatorsActionamesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllParticipatorsActionamesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.participators.actionames.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 参与者联调
 * Summary: 参与者联调
 */
func (client *Client) DebugParticipators(request *DebugParticipatorsRequest) (_result *DebugParticipatorsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DebugParticipatorsResponse{}
	_body, _err := client.DebugParticipatorsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 参与者联调
 * Summary: 参与者联调
 */
func (client *Client) DebugParticipatorsEx(request *DebugParticipatorsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DebugParticipatorsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DebugParticipatorsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.participators.debug"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交回滚方法参数
 * Summary: 获取action的调用参数
 */
func (client *Client) QueryActionParam(request *QueryActionParamRequest) (_result *QueryActionParamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryActionParamResponse{}
	_body, _err := client.QueryActionParamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交回滚方法参数
 * Summary: 获取action的调用参数
 */
func (client *Client) QueryActionParamEx(request *QueryActionParamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryActionParamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryActionParamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.action.param.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分布式事务-执行单元切换
 * Summary: 分布式事务执行单元切换
 */
func (client *Client) ExecuteSwitchover(request *ExecuteSwitchoverRequest) (_result *ExecuteSwitchoverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecuteSwitchoverResponse{}
	_body, _err := client.ExecuteSwitchoverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分布式事务-执行单元切换
 * Summary: 分布式事务执行单元切换
 */
func (client *Client) ExecuteSwitchoverEx(request *ExecuteSwitchoverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecuteSwitchoverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecuteSwitchoverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.switchover.execute"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分布式事务-取消单元切换
 * Summary: 分布式事务取消单元切换
 */
func (client *Client) CancelSwitchover(request *CancelSwitchoverRequest) (_result *CancelSwitchoverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelSwitchoverResponse{}
	_body, _err := client.CancelSwitchoverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分布式事务-取消单元切换
 * Summary: 分布式事务取消单元切换
 */
func (client *Client) CancelSwitchoverEx(request *CancelSwitchoverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelSwitchoverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelSwitchoverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.switchover.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分布式事务-查询单元切换状态
 * Summary: 查询分布式事务单元切换状态
 */
func (client *Client) QuerySwitchover(request *QuerySwitchoverRequest) (_result *QuerySwitchoverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySwitchoverResponse{}
	_body, _err := client.QuerySwitchoverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分布式事务-查询单元切换状态
 * Summary: 查询分布式事务单元切换状态
 */
func (client *Client) QuerySwitchoverEx(request *QuerySwitchoverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySwitchoverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySwitchoverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.switchover.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
 * Summary: 事务趋势图
 */
func (client *Client) CountBiztypesTrends(request *CountBiztypesTrendsRequest) (_result *CountBiztypesTrendsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountBiztypesTrendsResponse{}
	_body, _err := client.CountBiztypesTrendsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
 * Summary: 事务趋势图
 */
func (client *Client) CountBiztypesTrendsEx(request *CountBiztypesTrendsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountBiztypesTrendsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountBiztypesTrendsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.biztypes.trends.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
 * Summary: 事务概览统计接口
 */
func (client *Client) GetGlobalStats(request *GetGlobalStatsRequest) (_result *GetGlobalStatsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGlobalStatsResponse{}
	_body, _err := client.GetGlobalStatsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
 * Summary: 事务概览统计接口
 */
func (client *Client) GetGlobalStatsEx(request *GetGlobalStatsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGlobalStatsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGlobalStatsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.global.stats.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 联调历史列表
 * Summary: 联调历史列表
 */
func (client *Client) ListTransactionDebugs(request *ListTransactionDebugsRequest) (_result *ListTransactionDebugsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListTransactionDebugsResponse{}
	_body, _err := client.ListTransactionDebugsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 联调历史列表
 * Summary: 联调历史列表
 */
func (client *Client) ListTransactionDebugsEx(request *ListTransactionDebugsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListTransactionDebugsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTransactionDebugsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transaction.debugs.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个联调记录详情
 * Summary: 单个联调记录详情
 */
func (client *Client) GetTransactionsDebugs(request *GetTransactionsDebugsRequest) (_result *GetTransactionsDebugsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransactionsDebugsResponse{}
	_body, _err := client.GetTransactionsDebugsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个联调记录详情
 * Summary: 单个联调记录详情
 */
func (client *Client) GetTransactionsDebugsEx(request *GetTransactionsDebugsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransactionsDebugsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransactionsDebugsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.debugs.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事务高级查询
 * Summary: 事务高级查询
 */
func (client *Client) QueryTransactions(request *QueryTransactionsRequest) (_result *QueryTransactionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTransactionsResponse{}
	_body, _err := client.QueryTransactionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事务高级查询
 * Summary: 事务高级查询
 */
func (client *Client) QueryTransactionsEx(request *QueryTransactionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTransactionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTransactionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个事务详情
 * Summary: 单个事务详情
 */
func (client *Client) GetTransactions(request *GetTransactionsRequest) (_result *GetTransactionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransactionsResponse{}
	_body, _err := client.GetTransactionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个事务详情
 * Summary: 单个事务详情
 */
func (client *Client) GetTransactionsEx(request *GetTransactionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransactionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransactionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 悬挂事务恢复
 * Summary: 创建事务恢复
 */
func (client *Client) CreateTransactionsCorrections(request *CreateTransactionsCorrectionsRequest) (_result *CreateTransactionsCorrectionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTransactionsCorrectionsResponse{}
	_body, _err := client.CreateTransactionsCorrectionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 悬挂事务恢复
 * Summary: 创建事务恢复
 */
func (client *Client) CreateTransactionsCorrectionsEx(request *CreateTransactionsCorrectionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTransactionsCorrectionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTransactionsCorrectionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.corrections.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单个事务恢复详情
 * Summary: 单个事务恢复详情
 */
func (client *Client) GetTransactionsCorrections(request *GetTransactionsCorrectionsRequest) (_result *GetTransactionsCorrectionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransactionsCorrectionsResponse{}
	_body, _err := client.GetTransactionsCorrectionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单个事务恢复详情
 * Summary: 单个事务恢复详情
 */
func (client *Client) GetTransactionsCorrectionsEx(request *GetTransactionsCorrectionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransactionsCorrectionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransactionsCorrectionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.corrections.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 执行事务订正
 * Summary: 执行事务订正
 */
func (client *Client) ExecTransactionsCorrections(request *ExecTransactionsCorrectionsRequest) (_result *ExecTransactionsCorrectionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecTransactionsCorrectionsResponse{}
	_body, _err := client.ExecTransactionsCorrectionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 执行事务订正
 * Summary: 执行事务订正
 */
func (client *Client) ExecTransactionsCorrectionsEx(request *ExecTransactionsCorrectionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecTransactionsCorrectionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecTransactionsCorrectionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transactions.corrections.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事务订正列表
 * Summary: 事务订正列表
 */
func (client *Client) ListTransactionCorrections(request *ListTransactionCorrectionsRequest) (_result *ListTransactionCorrectionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListTransactionCorrectionsResponse{}
	_body, _err := client.ListTransactionCorrectionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事务订正列表
 * Summary: 事务订正列表
 */
func (client *Client) ListTransactionCorrectionsEx(request *ListTransactionCorrectionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListTransactionCorrectionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTransactionCorrectionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transaction.corrections.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起方app列表
 * Summary: 发起方app列表
 */
func (client *Client) ListTransactionApps(request *ListTransactionAppsRequest) (_result *ListTransactionAppsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListTransactionAppsResponse{}
	_body, _err := client.ListTransactionAppsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起方app列表
 * Summary: 发起方app列表
 */
func (client *Client) ListTransactionAppsEx(request *ListTransactionAppsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListTransactionAppsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTransactionAppsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transaction.apps.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对特定图，组装的特定数据结构 接口
 * Summary: 事务详情
 */
func (client *Client) GetTransactionChart(request *GetTransactionChartRequest) (_result *GetTransactionChartResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransactionChartResponse{}
	_body, _err := client.GetTransactionChartEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对特定图，组装的特定数据结构 接口
 * Summary: 事务详情
 */
func (client *Client) GetTransactionChartEx(request *GetTransactionChartRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransactionChartResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransactionChartResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transaction.chart.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取Saga状态机事务执行记录，返回状态图json
 * Summary: 获取Saga状态机事务执行记录json
 */
func (client *Client) GetTransactionSaga(request *GetTransactionSagaRequest) (_result *GetTransactionSagaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTransactionSagaResponse{}
	_body, _err := client.GetTransactionSagaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取Saga状态机事务执行记录，返回状态图json
 * Summary: 获取Saga状态机事务执行记录json
 */
func (client *Client) GetTransactionSagaEx(request *GetTransactionSagaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTransactionSagaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTransactionSagaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.transaction.saga.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 白名单列表
 * Summary: 白名单列表
 */
func (client *Client) ListWhitelist(request *ListWhitelistRequest) (_result *ListWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListWhitelistResponse{}
	_body, _err := client.ListWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 白名单列表
 * Summary: 白名单列表
 */
func (client *Client) ListWhitelistEx(request *ListWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 白名单更新
 * Summary: 白名单更新
 */
func (client *Client) UpdateWhitelist(request *UpdateWhitelistRequest) (_result *UpdateWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateWhitelistResponse{}
	_body, _err := client.UpdateWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 白名单更新
 * Summary: 白名单更新
 */
func (client *Client) UpdateWhitelistEx(request *UpdateWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 白名单添加
 * Summary: 白名单添加
 */
func (client *Client) AddWhitelist(request *AddWhitelistRequest) (_result *AddWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddWhitelistResponse{}
	_body, _err := client.AddWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 白名单添加
 * Summary: 白名单添加
 */
func (client *Client) AddWhitelistEx(request *AddWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: xts failover容灾推送
 * Summary: 容灾推送
 */
func (client *Client) PushWhitelist(request *PushWhitelistRequest) (_result *PushWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushWhitelistResponse{}
	_body, _err := client.PushWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: xts failover容灾推送
 * Summary: 容灾推送
 */
func (client *Client) PushWhitelistEx(request *PushWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除白名单
 * Summary: 删除白名单
 */
func (client *Client) DeleteWhitelist(request *DeleteWhitelistRequest) (_result *DeleteWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteWhitelistResponse{}
	_body, _err := client.DeleteWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除白名单
 * Summary: 删除白名单
 */
func (client *Client) DeleteWhitelistEx(request *DeleteWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 弹性位配置列表
 * Summary: 弹性位配置列表
 */
func (client *Client) ListWhitelistZones(request *ListWhitelistZonesRequest) (_result *ListWhitelistZonesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListWhitelistZonesResponse{}
	_body, _err := client.ListWhitelistZonesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 弹性位配置列表
 * Summary: 弹性位配置列表
 */
func (client *Client) ListWhitelistZonesEx(request *ListWhitelistZonesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListWhitelistZonesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListWhitelistZonesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("sofa.dtx.whitelist.zones.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
