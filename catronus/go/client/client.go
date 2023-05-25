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

// fixpath
type FixPath struct {
	// 路径
	Path *string `json:"path,omitempty" xml:"path,omitempty"`
	// 值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s FixPath) String() string {
	return tea.Prettify(s)
}

func (s FixPath) GoString() string {
	return s.String()
}

func (s *FixPath) SetPath(v string) *FixPath {
	s.Path = &v
	return s
}

func (s *FixPath) SetValue(v string) *FixPath {
	s.Value = &v
	return s
}

// 路径
type Path struct {
	// fixpath
	FixPath *FixPath `json:"fix_path,omitempty" xml:"fix_path,omitempty"`
	// shibai lujing
	FailedPath *string `json:"failed_path,omitempty" xml:"failed_path,omitempty"`
}

func (s Path) String() string {
	return tea.Prettify(s)
}

func (s Path) GoString() string {
	return s.String()
}

func (s *Path) SetFixPath(v *FixPath) *Path {
	s.FixPath = v
	return s
}

func (s *Path) SetFailedPath(v string) *Path {
	s.FailedPath = &v
	return s
}

// rule
type Rule struct {
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// path
	Paths []*Path `json:"paths,omitempty" xml:"paths,omitempty" type:"Repeated"`
}

func (s Rule) String() string {
	return tea.Prettify(s)
}

func (s Rule) GoString() string {
	return s.String()
}

func (s *Rule) SetName(v string) *Rule {
	s.Name = &v
	return s
}

func (s *Rule) SetStatus(v string) *Rule {
	s.Status = &v
	return s
}

func (s *Rule) SetPaths(v []*Path) *Rule {
	s.Paths = v
	return s
}

// 基线扫描框架
type Framework struct {
	// 策略id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 框架名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 是否启用
	Enable *bool `json:"enable,omitempty" xml:"enable,omitempty"`
	// 描述
	Describe *string `json:"describe,omitempty" xml:"describe,omitempty"`
}

func (s Framework) String() string {
	return tea.Prettify(s)
}

func (s Framework) GoString() string {
	return s.String()
}

func (s *Framework) SetId(v string) *Framework {
	s.Id = &v
	return s
}

func (s *Framework) SetName(v string) *Framework {
	s.Name = &v
	return s
}

func (s *Framework) SetEnable(v bool) *Framework {
	s.Enable = &v
	return s
}

func (s *Framework) SetDescribe(v string) *Framework {
	s.Describe = &v
	return s
}

// cronjob
type Cronjob struct {
	// crontab格式表述的cronjob
	Crontab *string `json:"crontab,omitempty" xml:"crontab,omitempty"`
}

func (s Cronjob) String() string {
	return tea.Prettify(s)
}

func (s Cronjob) GoString() string {
	return s.String()
}

func (s *Cronjob) SetCrontab(v string) *Cronjob {
	s.Crontab = &v
	return s
}

// 基线策略
type BaselineStrategy struct {
	// 框架列表
	Frameworks []*Framework `json:"frameworks,omitempty" xml:"frameworks,omitempty" type:"Repeated"`
	// cronjob
	Cronjob *Cronjob `json:"cronjob,omitempty" xml:"cronjob,omitempty"`
	// 额外配置
	Extended *string `json:"extended,omitempty" xml:"extended,omitempty"`
}

func (s BaselineStrategy) String() string {
	return tea.Prettify(s)
}

func (s BaselineStrategy) GoString() string {
	return s.String()
}

func (s *BaselineStrategy) SetFrameworks(v []*Framework) *BaselineStrategy {
	s.Frameworks = v
	return s
}

func (s *BaselineStrategy) SetCronjob(v *Cronjob) *BaselineStrategy {
	s.Cronjob = v
	return s
}

func (s *BaselineStrategy) SetExtended(v string) *BaselineStrategy {
	s.Extended = &v
	return s
}

// 运行时相关策略
type RuntimeStrategy struct {
	// 安全webshell配置
	Webshell *bool `json:"webshell,omitempty" xml:"webshell,omitempty"`
	// 提权保护配置
	Privilege *bool `json:"privilege,omitempty" xml:"privilege,omitempty"`
	// 是否打开
	Enable *bool `json:"enable,omitempty" xml:"enable,omitempty"`
}

func (s RuntimeStrategy) String() string {
	return tea.Prettify(s)
}

func (s RuntimeStrategy) GoString() string {
	return s.String()
}

func (s *RuntimeStrategy) SetWebshell(v bool) *RuntimeStrategy {
	s.Webshell = &v
	return s
}

func (s *RuntimeStrategy) SetPrivilege(v bool) *RuntimeStrategy {
	s.Privilege = &v
	return s
}

func (s *RuntimeStrategy) SetEnable(v bool) *RuntimeStrategy {
	s.Enable = &v
	return s
}

// 安全组件简报
type ClusterSecurityComponentBrief struct {
	// 风险项数量
	Cnt *int64 `json:"cnt,omitempty" xml:"cnt,omitempty"`
	// 组件名称
	Component *string `json:"component,omitempty" xml:"component,omitempty"`
	// 描述
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ClusterSecurityComponentBrief) String() string {
	return tea.Prettify(s)
}

func (s ClusterSecurityComponentBrief) GoString() string {
	return s.String()
}

func (s *ClusterSecurityComponentBrief) SetCnt(v int64) *ClusterSecurityComponentBrief {
	s.Cnt = &v
	return s
}

func (s *ClusterSecurityComponentBrief) SetComponent(v string) *ClusterSecurityComponentBrief {
	s.Component = &v
	return s
}

func (s *ClusterSecurityComponentBrief) SetContent(v string) *ClusterSecurityComponentBrief {
	s.Content = &v
	return s
}

func (s *ClusterSecurityComponentBrief) SetDate(v string) *ClusterSecurityComponentBrief {
	s.Date = &v
	return s
}

// control
type Control struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// rule
	Rules []*Rule `json:"rules,omitempty" xml:"rules,omitempty" type:"Repeated"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s Control) String() string {
	return tea.Prettify(s)
}

func (s Control) GoString() string {
	return s.String()
}

func (s *Control) SetId(v string) *Control {
	s.Id = &v
	return s
}

func (s *Control) SetRules(v []*Rule) *Control {
	s.Rules = v
	return s
}

func (s *Control) SetName(v string) *Control {
	s.Name = &v
	return s
}

// 镜像相关策略
type ImageStrategy struct {
	// 准入
	Access *bool `json:"access,omitempty" xml:"access,omitempty"`
	// 巡检
	Cronjob *Cronjob `json:"cronjob,omitempty" xml:"cronjob,omitempty"`
}

func (s ImageStrategy) String() string {
	return tea.Prettify(s)
}

func (s ImageStrategy) GoString() string {
	return s.String()
}

func (s *ImageStrategy) SetAccess(v bool) *ImageStrategy {
	s.Access = &v
	return s
}

func (s *ImageStrategy) SetCronjob(v *Cronjob) *ImageStrategy {
	s.Cronjob = v
	return s
}

// 蚂蚁扫描镜像
type AntScanImage struct {
	// 镜像名称
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
	// app名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
}

func (s AntScanImage) String() string {
	return tea.Prettify(s)
}

func (s AntScanImage) GoString() string {
	return s.String()
}

func (s *AntScanImage) SetImage(v string) *AntScanImage {
	s.Image = &v
	return s
}

func (s *AntScanImage) SetAppName(v string) *AntScanImage {
	s.AppName = &v
	return s
}

// 策略
type Strategy struct {
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty" require:"true"`
	// 策略名
	StrategyName *string `json:"strategy_name,omitempty" xml:"strategy_name,omitempty"`
	// 镜像相关策略内容
	Image *ImageStrategy `json:"image,omitempty" xml:"image,omitempty"`
	// 基线相关策略
	Baseline *BaselineStrategy `json:"baseline,omitempty" xml:"baseline,omitempty"`
	// 运行时策略
	Runtime *RuntimeStrategy `json:"runtime,omitempty" xml:"runtime,omitempty"`
}

func (s Strategy) String() string {
	return tea.Prettify(s)
}

func (s Strategy) GoString() string {
	return s.String()
}

func (s *Strategy) SetStrategyId(v string) *Strategy {
	s.StrategyId = &v
	return s
}

func (s *Strategy) SetStrategyName(v string) *Strategy {
	s.StrategyName = &v
	return s
}

func (s *Strategy) SetImage(v *ImageStrategy) *Strategy {
	s.Image = v
	return s
}

func (s *Strategy) SetBaseline(v *BaselineStrategy) *Strategy {
	s.Baseline = v
	return s
}

func (s *Strategy) SetRuntime(v *RuntimeStrategy) *Strategy {
	s.Runtime = v
	return s
}

// 仓库
type Repository struct {
	// 仓库ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 仓库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 仓库Tag数
	TagsCount *string `json:"tags_count,omitempty" xml:"tags_count,omitempty" require:"true"`
}

func (s Repository) String() string {
	return tea.Prettify(s)
}

func (s Repository) GoString() string {
	return s.String()
}

func (s *Repository) SetId(v string) *Repository {
	s.Id = &v
	return s
}

func (s *Repository) SetName(v string) *Repository {
	s.Name = &v
	return s
}

func (s *Repository) SetProjectId(v string) *Repository {
	s.ProjectId = &v
	return s
}

func (s *Repository) SetTagsCount(v string) *Repository {
	s.TagsCount = &v
	return s
}

// 仓库项目
type RepoProject struct {
	// project id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 项目名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s RepoProject) String() string {
	return tea.Prettify(s)
}

func (s RepoProject) GoString() string {
	return s.String()
}

func (s *RepoProject) SetId(v string) *RepoProject {
	s.Id = &v
	return s
}

func (s *RepoProject) SetName(v string) *RepoProject {
	s.Name = &v
	return s
}

// 风险操作审计
type RiskTaskAudit struct {
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty" require:"true"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty" require:"true"`
}

func (s RiskTaskAudit) String() string {
	return tea.Prettify(s)
}

func (s RiskTaskAudit) GoString() string {
	return s.String()
}

func (s *RiskTaskAudit) SetOperator(v string) *RiskTaskAudit {
	s.Operator = &v
	return s
}

func (s *RiskTaskAudit) SetOperationType(v string) *RiskTaskAudit {
	s.OperationType = &v
	return s
}

func (s *RiskTaskAudit) SetRiskTaskId(v string) *RiskTaskAudit {
	s.RiskTaskId = &v
	return s
}

func (s *RiskTaskAudit) SetComment(v string) *RiskTaskAudit {
	s.Comment = &v
	return s
}

// 集群
type Cluster struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 集群名称
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty" require:"true"`
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 纳管状态（imported已纳管/unimported未纳管）
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 导入方式
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 白名单
	NamespaceWhitelist []*string `json:"namespace_whitelist,omitempty" xml:"namespace_whitelist,omitempty" require:"true" type:"Repeated"`
}

func (s Cluster) String() string {
	return tea.Prettify(s)
}

func (s Cluster) GoString() string {
	return s.String()
}

func (s *Cluster) SetId(v string) *Cluster {
	s.Id = &v
	return s
}

func (s *Cluster) SetClusterName(v string) *Cluster {
	s.ClusterName = &v
	return s
}

func (s *Cluster) SetEnv(v string) *Cluster {
	s.Env = &v
	return s
}

func (s *Cluster) SetStatus(v string) *Cluster {
	s.Status = &v
	return s
}

func (s *Cluster) SetSource(v string) *Cluster {
	s.Source = &v
	return s
}

func (s *Cluster) SetNamespaceWhitelist(v []*string) *Cluster {
	s.NamespaceWhitelist = v
	return s
}

// 扫描结果
type ScanResult struct {
	// 安全组件名
	Component *string `json:"component,omitempty" xml:"component,omitempty" require:"true"`
	// 结果
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s ScanResult) String() string {
	return tea.Prettify(s)
}

func (s ScanResult) GoString() string {
	return s.String()
}

func (s *ScanResult) SetComponent(v string) *ScanResult {
	s.Component = &v
	return s
}

func (s *ScanResult) SetResult(v string) *ScanResult {
	s.Result = &v
	return s
}

// 蚂蚁扫描镜像列表
type AntScanImageList struct {
	// 镜像镜像扫描
	List []*AntScanImage `json:"list,omitempty" xml:"list,omitempty" require:"true" type:"Repeated"`
}

func (s AntScanImageList) String() string {
	return tea.Prettify(s)
}

func (s AntScanImageList) GoString() string {
	return s.String()
}

func (s *AntScanImageList) SetList(v []*AntScanImage) *AntScanImageList {
	s.List = v
	return s
}

// 风险解决方案
type RiskSolution struct {
	// 风险解决方案ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 风险名称
	RiskName *string `json:"risk_name,omitempty" xml:"risk_name,omitempty" require:"true"`
	// 来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 修复类型
	FixType *string `json:"fix_type,omitempty" xml:"fix_type,omitempty" require:"true"`
	// 风险描述
	RiskDescription *string `json:"risk_description,omitempty" xml:"risk_description,omitempty" require:"true"`
	// 风险解决方案
	SolutionPlan *string `json:"solution_plan,omitempty" xml:"solution_plan,omitempty" require:"true"`
	// 应急解决方案
	EmergencyPlan *string `json:"emergency_plan,omitempty" xml:"emergency_plan,omitempty" require:"true"`
	// 负责人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
}

func (s RiskSolution) String() string {
	return tea.Prettify(s)
}

func (s RiskSolution) GoString() string {
	return s.String()
}

func (s *RiskSolution) SetId(v string) *RiskSolution {
	s.Id = &v
	return s
}

func (s *RiskSolution) SetName(v string) *RiskSolution {
	s.Name = &v
	return s
}

func (s *RiskSolution) SetRiskName(v string) *RiskSolution {
	s.RiskName = &v
	return s
}

func (s *RiskSolution) SetSource(v string) *RiskSolution {
	s.Source = &v
	return s
}

func (s *RiskSolution) SetFixType(v string) *RiskSolution {
	s.FixType = &v
	return s
}

func (s *RiskSolution) SetRiskDescription(v string) *RiskSolution {
	s.RiskDescription = &v
	return s
}

func (s *RiskSolution) SetSolutionPlan(v string) *RiskSolution {
	s.SolutionPlan = &v
	return s
}

func (s *RiskSolution) SetEmergencyPlan(v string) *RiskSolution {
	s.EmergencyPlan = &v
	return s
}

func (s *RiskSolution) SetOwner(v string) *RiskSolution {
	s.Owner = &v
	return s
}

// 基线扫描结果
type BaselineScanResult struct {
	// 类型
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty" require:"true"`
	// 资源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty"`
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 紧急control
	Criticals []*Control `json:"criticals,omitempty" xml:"criticals,omitempty" type:"Repeated"`
	// 高危control
	Highs []*Control `json:"highs,omitempty" xml:"highs,omitempty" type:"Repeated"`
	// 中危controls
	Mids []*Control `json:"mids,omitempty" xml:"mids,omitempty" type:"Repeated"`
	// 低危controls
	Lows []*Control `json:"lows,omitempty" xml:"lows,omitempty" type:"Repeated"`
	// 资源内容
	Object *string `json:"object,omitempty" xml:"object,omitempty"`
}

func (s BaselineScanResult) String() string {
	return tea.Prettify(s)
}

func (s BaselineScanResult) GoString() string {
	return s.String()
}

func (s *BaselineScanResult) SetKind(v string) *BaselineScanResult {
	s.Kind = &v
	return s
}

func (s *BaselineScanResult) SetName(v string) *BaselineScanResult {
	s.Name = &v
	return s
}

func (s *BaselineScanResult) SetNamespace(v string) *BaselineScanResult {
	s.Namespace = &v
	return s
}

func (s *BaselineScanResult) SetResourceId(v string) *BaselineScanResult {
	s.ResourceId = &v
	return s
}

func (s *BaselineScanResult) SetCriticals(v []*Control) *BaselineScanResult {
	s.Criticals = v
	return s
}

func (s *BaselineScanResult) SetHighs(v []*Control) *BaselineScanResult {
	s.Highs = v
	return s
}

func (s *BaselineScanResult) SetMids(v []*Control) *BaselineScanResult {
	s.Mids = v
	return s
}

func (s *BaselineScanResult) SetLows(v []*Control) *BaselineScanResult {
	s.Lows = v
	return s
}

func (s *BaselineScanResult) SetObject(v string) *BaselineScanResult {
	s.Object = &v
	return s
}

// 镜像仓库
type ImageRepo struct {
	// repo ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 镜像仓库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 镜像仓库域名
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 状态
	Status *bool `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 上次连接时间
	LastConnectTime *string `json:"last_connect_time,omitempty" xml:"last_connect_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ImageRepo) String() string {
	return tea.Prettify(s)
}

func (s ImageRepo) GoString() string {
	return s.String()
}

func (s *ImageRepo) SetId(v string) *ImageRepo {
	s.Id = &v
	return s
}

func (s *ImageRepo) SetName(v string) *ImageRepo {
	s.Name = &v
	return s
}

func (s *ImageRepo) SetDomain(v string) *ImageRepo {
	s.Domain = &v
	return s
}

func (s *ImageRepo) SetUserName(v string) *ImageRepo {
	s.UserName = &v
	return s
}

func (s *ImageRepo) SetPassword(v string) *ImageRepo {
	s.Password = &v
	return s
}

func (s *ImageRepo) SetStatus(v bool) *ImageRepo {
	s.Status = &v
	return s
}

func (s *ImageRepo) SetCreateTime(v string) *ImageRepo {
	s.CreateTime = &v
	return s
}

func (s *ImageRepo) SetLastConnectTime(v string) *ImageRepo {
	s.LastConnectTime = &v
	return s
}

// 仓库扫描策略
type RepoScanStrategy struct {
	// 策略ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 仓库列表
	Projects []*string `json:"projects,omitempty" xml:"projects,omitempty" require:"true" type:"Repeated"`
	// 仓库列表
	Repositories []*string `json:"repositories,omitempty" xml:"repositories,omitempty" require:"true" type:"Repeated"`
	// 扫描开始时间
	ImageBeginTime *string `json:"image_begin_time,omitempty" xml:"image_begin_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 定时扫描任务
	Crontab *string `json:"crontab,omitempty" xml:"crontab,omitempty" require:"true"`
	// 下个日期
	NextDate *string `json:"next_date,omitempty" xml:"next_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 策略状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
}

func (s RepoScanStrategy) String() string {
	return tea.Prettify(s)
}

func (s RepoScanStrategy) GoString() string {
	return s.String()
}

func (s *RepoScanStrategy) SetId(v string) *RepoScanStrategy {
	s.Id = &v
	return s
}

func (s *RepoScanStrategy) SetRepoId(v string) *RepoScanStrategy {
	s.RepoId = &v
	return s
}

func (s *RepoScanStrategy) SetProjects(v []*string) *RepoScanStrategy {
	s.Projects = v
	return s
}

func (s *RepoScanStrategy) SetRepositories(v []*string) *RepoScanStrategy {
	s.Repositories = v
	return s
}

func (s *RepoScanStrategy) SetImageBeginTime(v string) *RepoScanStrategy {
	s.ImageBeginTime = &v
	return s
}

func (s *RepoScanStrategy) SetCrontab(v string) *RepoScanStrategy {
	s.Crontab = &v
	return s
}

func (s *RepoScanStrategy) SetNextDate(v string) *RepoScanStrategy {
	s.NextDate = &v
	return s
}

func (s *RepoScanStrategy) SetState(v string) *RepoScanStrategy {
	s.State = &v
	return s
}

// 集群安全简报
type ClusterSecurityBrief struct {
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty" require:"true"`
	// 防护状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 最后一次安全扫描时间
	LastScan *string `json:"last_scan,omitempty" xml:"last_scan,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 风险数量
	RiskCnt *int64 `json:"risk_cnt,omitempty" xml:"risk_cnt,omitempty" require:"true"`
	// 风险简报
	Brief []*ClusterSecurityComponentBrief `json:"brief,omitempty" xml:"brief,omitempty" require:"true" type:"Repeated"`
	// 扫描id
	ScanId *string `json:"scan_id,omitempty" xml:"scan_id,omitempty"`
}

func (s ClusterSecurityBrief) String() string {
	return tea.Prettify(s)
}

func (s ClusterSecurityBrief) GoString() string {
	return s.String()
}

func (s *ClusterSecurityBrief) SetClusterId(v string) *ClusterSecurityBrief {
	s.ClusterId = &v
	return s
}

func (s *ClusterSecurityBrief) SetClusterName(v string) *ClusterSecurityBrief {
	s.ClusterName = &v
	return s
}

func (s *ClusterSecurityBrief) SetStatus(v string) *ClusterSecurityBrief {
	s.Status = &v
	return s
}

func (s *ClusterSecurityBrief) SetLastScan(v string) *ClusterSecurityBrief {
	s.LastScan = &v
	return s
}

func (s *ClusterSecurityBrief) SetRiskCnt(v int64) *ClusterSecurityBrief {
	s.RiskCnt = &v
	return s
}

func (s *ClusterSecurityBrief) SetBrief(v []*ClusterSecurityComponentBrief) *ClusterSecurityBrief {
	s.Brief = v
	return s
}

func (s *ClusterSecurityBrief) SetScanId(v string) *ClusterSecurityBrief {
	s.ScanId = &v
	return s
}

// 镜像
type Image struct {
	// 镜像Ref
	ImageRef *string `json:"image_ref,omitempty" xml:"image_ref,omitempty" require:"true"`
	// 镜像标签
	ImageTag *string `json:"image_tag,omitempty" xml:"image_tag,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// 扫描状态
	ScanStatus *string `json:"scan_status,omitempty" xml:"scan_status,omitempty" require:"true"`
	// 镜像漏洞
	ImageVul *int64 `json:"image_vul,omitempty" xml:"image_vul,omitempty" require:"true"`
	// 镜像风险漏洞
	ImageRiskVul *int64 `json:"image_risk_vul,omitempty" xml:"image_risk_vul,omitempty" require:"true"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s Image) String() string {
	return tea.Prettify(s)
}

func (s Image) GoString() string {
	return s.String()
}

func (s *Image) SetImageRef(v string) *Image {
	s.ImageRef = &v
	return s
}

func (s *Image) SetImageTag(v string) *Image {
	s.ImageTag = &v
	return s
}

func (s *Image) SetAppName(v string) *Image {
	s.AppName = &v
	return s
}

func (s *Image) SetScanStatus(v string) *Image {
	s.ScanStatus = &v
	return s
}

func (s *Image) SetImageVul(v int64) *Image {
	s.ImageVul = &v
	return s
}

func (s *Image) SetImageRiskVul(v int64) *Image {
	s.ImageRiskVul = &v
	return s
}

func (s *Image) SetStartTime(v string) *Image {
	s.StartTime = &v
	return s
}

func (s *Image) SetEndTime(v string) *Image {
	s.EndTime = &v
	return s
}

// 风险详情
type Risk struct {
	// 风险ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 风险名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 类型
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 等级
	Priority *string `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 风险唯一标识
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
}

func (s Risk) String() string {
	return tea.Prettify(s)
}

func (s Risk) GoString() string {
	return s.String()
}

func (s *Risk) SetId(v string) *Risk {
	s.Id = &v
	return s
}

func (s *Risk) SetName(v string) *Risk {
	s.Name = &v
	return s
}

func (s *Risk) SetSource(v string) *Risk {
	s.Source = &v
	return s
}

func (s *Risk) SetPriority(v string) *Risk {
	s.Priority = &v
	return s
}

func (s *Risk) SetIdentity(v string) *Risk {
	s.Identity = &v
	return s
}

// 标签
type Label struct {
	// 标签key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 标签value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Label) String() string {
	return tea.Prettify(s)
}

func (s Label) GoString() string {
	return s.String()
}

func (s *Label) SetKey(v string) *Label {
	s.Key = &v
	return s
}

func (s *Label) SetValue(v string) *Label {
	s.Value = &v
	return s
}

// 风险任务/工单
type RiskTask struct {
	// ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 风险名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 优先级
	Priority *string `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 当前状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 风险类型
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 负责人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 到期时间
	DeadlineTime *string `json:"deadline_time,omitempty" xml:"deadline_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建时间
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 响应阶段
	RespondPhase *string `json:"respond_phase,omitempty" xml:"respond_phase,omitempty" require:"true"`
	// 风险关注者
	Followers []*string `json:"followers,omitempty" xml:"followers,omitempty" require:"true" type:"Repeated"`
	// 安全工程师
	SecOwner *string `json:"sec_owner,omitempty" xml:"sec_owner,omitempty" require:"true"`
	// 到期天数
	DaysLeft *int64 `json:"days_left,omitempty" xml:"days_left,omitempty" require:"true"`
	// 风险ID
	RiskId *string `json:"risk_id,omitempty" xml:"risk_id,omitempty" require:"true"`
}

func (s RiskTask) String() string {
	return tea.Prettify(s)
}

func (s RiskTask) GoString() string {
	return s.String()
}

func (s *RiskTask) SetId(v string) *RiskTask {
	s.Id = &v
	return s
}

func (s *RiskTask) SetDisplayName(v string) *RiskTask {
	s.DisplayName = &v
	return s
}

func (s *RiskTask) SetPriority(v string) *RiskTask {
	s.Priority = &v
	return s
}

func (s *RiskTask) SetState(v string) *RiskTask {
	s.State = &v
	return s
}

func (s *RiskTask) SetRiskType(v string) *RiskTask {
	s.RiskType = &v
	return s
}

func (s *RiskTask) SetOwner(v string) *RiskTask {
	s.Owner = &v
	return s
}

func (s *RiskTask) SetDeadlineTime(v string) *RiskTask {
	s.DeadlineTime = &v
	return s
}

func (s *RiskTask) SetCreatedTime(v string) *RiskTask {
	s.CreatedTime = &v
	return s
}

func (s *RiskTask) SetRespondPhase(v string) *RiskTask {
	s.RespondPhase = &v
	return s
}

func (s *RiskTask) SetFollowers(v []*string) *RiskTask {
	s.Followers = v
	return s
}

func (s *RiskTask) SetSecOwner(v string) *RiskTask {
	s.SecOwner = &v
	return s
}

func (s *RiskTask) SetDaysLeft(v int64) *RiskTask {
	s.DaysLeft = &v
	return s
}

func (s *RiskTask) SetRiskId(v string) *RiskTask {
	s.RiskId = &v
	return s
}

type CreateRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 风险来源，image/benchmark/runtime
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 风险唯一标识
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 风险等级
	Priority *string `json:"priority,omitempty" xml:"priority,omitempty"`
	// 风险任务显示名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 响应阶段，默认是日常阶段
	RespondPhase *string `json:"respond_phase,omitempty" xml:"respond_phase,omitempty"`
	// 风险责任人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 安全责任人
	SecOwner *string `json:"sec_owner,omitempty" xml:"sec_owner,omitempty" require:"true"`
	// 风险关注者
	Followers []*string `json:"followers,omitempty" xml:"followers,omitempty" require:"true" type:"Repeated"`
	// 到期时间
	DeadlineTime *string `json:"deadline_time,omitempty" xml:"deadline_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 环境标识ID
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty" require:"true"`
}

func (s CreateRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateRiskTaskRequest) SetAuthToken(v string) *CreateRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRiskTaskRequest) SetName(v string) *CreateRiskTaskRequest {
	s.Name = &v
	return s
}

func (s *CreateRiskTaskRequest) SetSource(v string) *CreateRiskTaskRequest {
	s.Source = &v
	return s
}

func (s *CreateRiskTaskRequest) SetIdentity(v string) *CreateRiskTaskRequest {
	s.Identity = &v
	return s
}

func (s *CreateRiskTaskRequest) SetPriority(v string) *CreateRiskTaskRequest {
	s.Priority = &v
	return s
}

func (s *CreateRiskTaskRequest) SetDisplayName(v string) *CreateRiskTaskRequest {
	s.DisplayName = &v
	return s
}

func (s *CreateRiskTaskRequest) SetRespondPhase(v string) *CreateRiskTaskRequest {
	s.RespondPhase = &v
	return s
}

func (s *CreateRiskTaskRequest) SetOwner(v string) *CreateRiskTaskRequest {
	s.Owner = &v
	return s
}

func (s *CreateRiskTaskRequest) SetSecOwner(v string) *CreateRiskTaskRequest {
	s.SecOwner = &v
	return s
}

func (s *CreateRiskTaskRequest) SetFollowers(v []*string) *CreateRiskTaskRequest {
	s.Followers = v
	return s
}

func (s *CreateRiskTaskRequest) SetDeadlineTime(v string) *CreateRiskTaskRequest {
	s.DeadlineTime = &v
	return s
}

func (s *CreateRiskTaskRequest) SetEnvId(v string) *CreateRiskTaskRequest {
	s.EnvId = &v
	return s
}

type CreateRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险任务ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty"`
}

func (s CreateRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateRiskTaskResponse) SetReqMsgId(v string) *CreateRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRiskTaskResponse) SetResultCode(v string) *CreateRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRiskTaskResponse) SetResultMsg(v string) *CreateRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRiskTaskResponse) SetRiskTaskId(v string) *CreateRiskTaskResponse {
	s.RiskTaskId = &v
	return s
}

type QueryRiskTasksRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 当前页数
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 风险ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty"`
	// 风险名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// 风险等级
	Priority *string `json:"priority,omitempty" xml:"priority,omitempty"`
	// 风险类型
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty"`
	// 风险状态
	RiskTaskState *string `json:"risk_task_state,omitempty" xml:"risk_task_state,omitempty"`
	// FROM时间点， 按照时间范围搜索的开始时间点
	CreationTimeFrom *string `json:"creation_time_from,omitempty" xml:"creation_time_from,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// to时间点， 按照时间范围搜索的结束时间点
	//
	CreationTimeTo *string `json:"creation_time_to,omitempty" xml:"creation_time_to,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryRiskTasksRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskTasksRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskTasksRequest) SetAuthToken(v string) *QueryRiskTasksRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskTasksRequest) SetPage(v int64) *QueryRiskTasksRequest {
	s.Page = &v
	return s
}

func (s *QueryRiskTasksRequest) SetPageSize(v int64) *QueryRiskTasksRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRiskTasksRequest) SetRiskTaskId(v string) *QueryRiskTasksRequest {
	s.RiskTaskId = &v
	return s
}

func (s *QueryRiskTasksRequest) SetDisplayName(v string) *QueryRiskTasksRequest {
	s.DisplayName = &v
	return s
}

func (s *QueryRiskTasksRequest) SetPriority(v string) *QueryRiskTasksRequest {
	s.Priority = &v
	return s
}

func (s *QueryRiskTasksRequest) SetRiskType(v string) *QueryRiskTasksRequest {
	s.RiskType = &v
	return s
}

func (s *QueryRiskTasksRequest) SetRiskTaskState(v string) *QueryRiskTasksRequest {
	s.RiskTaskState = &v
	return s
}

func (s *QueryRiskTasksRequest) SetCreationTimeFrom(v string) *QueryRiskTasksRequest {
	s.CreationTimeFrom = &v
	return s
}

func (s *QueryRiskTasksRequest) SetCreationTimeTo(v string) *QueryRiskTasksRequest {
	s.CreationTimeTo = &v
	return s
}

type QueryRiskTasksResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险任务列表
	RiskTasks []*RiskTask `json:"risk_tasks,omitempty" xml:"risk_tasks,omitempty" type:"Repeated"`
	// 总条目数
	TotalSize *int64 `json:"total_size,omitempty" xml:"total_size,omitempty"`
}

func (s QueryRiskTasksResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskTasksResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskTasksResponse) SetReqMsgId(v string) *QueryRiskTasksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskTasksResponse) SetResultCode(v string) *QueryRiskTasksResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskTasksResponse) SetResultMsg(v string) *QueryRiskTasksResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskTasksResponse) SetRiskTasks(v []*RiskTask) *QueryRiskTasksResponse {
	s.RiskTasks = v
	return s
}

func (s *QueryRiskTasksResponse) SetTotalSize(v int64) *QueryRiskTasksResponse {
	s.TotalSize = &v
	return s
}

type GetRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
}

func (s GetRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *GetRiskTaskRequest) SetAuthToken(v string) *GetRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRiskTaskRequest) SetRiskTaskId(v string) *GetRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

type GetRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险共担详情
	RiskTask *RiskTask `json:"risk_task,omitempty" xml:"risk_task,omitempty"`
}

func (s GetRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *GetRiskTaskResponse) SetReqMsgId(v string) *GetRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRiskTaskResponse) SetResultCode(v string) *GetRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRiskTaskResponse) SetResultMsg(v string) *GetRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRiskTaskResponse) SetRiskTask(v *RiskTask) *GetRiskTaskResponse {
	s.RiskTask = v
	return s
}

type UpdateRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险共担ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 风险工单状态
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 风险责任人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 安全责任人
	SecOwner *string `json:"sec_owner,omitempty" xml:"sec_owner,omitempty"`
	// 风险关注人员列表
	Followers []*string `json:"followers,omitempty" xml:"followers,omitempty" type:"Repeated"`
	// 风险解决方案ID
	RiskSolutionId *string `json:"risk_solution_id,omitempty" xml:"risk_solution_id,omitempty"`
}

func (s UpdateRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *UpdateRiskTaskRequest) SetAuthToken(v string) *UpdateRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRiskTaskRequest) SetRiskTaskId(v string) *UpdateRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *UpdateRiskTaskRequest) SetState(v string) *UpdateRiskTaskRequest {
	s.State = &v
	return s
}

func (s *UpdateRiskTaskRequest) SetOwner(v string) *UpdateRiskTaskRequest {
	s.Owner = &v
	return s
}

func (s *UpdateRiskTaskRequest) SetSecOwner(v string) *UpdateRiskTaskRequest {
	s.SecOwner = &v
	return s
}

func (s *UpdateRiskTaskRequest) SetFollowers(v []*string) *UpdateRiskTaskRequest {
	s.Followers = v
	return s
}

func (s *UpdateRiskTaskRequest) SetRiskSolutionId(v string) *UpdateRiskTaskRequest {
	s.RiskSolutionId = &v
	return s
}

type UpdateRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *UpdateRiskTaskResponse) SetReqMsgId(v string) *UpdateRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRiskTaskResponse) SetResultCode(v string) *UpdateRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRiskTaskResponse) SetResultMsg(v string) *UpdateRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRiskTaskResponse) SetRiskTaskId(v string) *UpdateRiskTaskResponse {
	s.RiskTaskId = &v
	return s
}

func (s *UpdateRiskTaskResponse) SetSuccess(v bool) *UpdateRiskTaskResponse {
	s.Success = &v
	return s
}

type ConfirmRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s ConfirmRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRiskTaskRequest) SetAuthToken(v string) *ConfirmRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmRiskTaskRequest) SetRiskTaskId(v string) *ConfirmRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *ConfirmRiskTaskRequest) SetComment(v string) *ConfirmRiskTaskRequest {
	s.Comment = &v
	return s
}

type ConfirmRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是够成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ConfirmRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRiskTaskResponse) SetReqMsgId(v string) *ConfirmRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmRiskTaskResponse) SetResultCode(v string) *ConfirmRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmRiskTaskResponse) SetResultMsg(v string) *ConfirmRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmRiskTaskResponse) SetSuccess(v bool) *ConfirmRiskTaskResponse {
	s.Success = &v
	return s
}

type CancelRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 评论，理由
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s CancelRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *CancelRiskTaskRequest) SetAuthToken(v string) *CancelRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelRiskTaskRequest) SetRiskTaskId(v string) *CancelRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *CancelRiskTaskRequest) SetComment(v string) *CancelRiskTaskRequest {
	s.Comment = &v
	return s
}

type CancelRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CancelRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *CancelRiskTaskResponse) SetReqMsgId(v string) *CancelRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelRiskTaskResponse) SetResultCode(v string) *CancelRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelRiskTaskResponse) SetResultMsg(v string) *CancelRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelRiskTaskResponse) SetSuccess(v bool) *CancelRiskTaskResponse {
	s.Success = &v
	return s
}

type RefuseRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s RefuseRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *RefuseRiskTaskRequest) SetAuthToken(v string) *RefuseRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseRiskTaskRequest) SetRiskTaskId(v string) *RefuseRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *RefuseRiskTaskRequest) SetComment(v string) *RefuseRiskTaskRequest {
	s.Comment = &v
	return s
}

type RefuseRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s RefuseRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *RefuseRiskTaskResponse) SetReqMsgId(v string) *RefuseRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseRiskTaskResponse) SetResultCode(v string) *RefuseRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseRiskTaskResponse) SetResultMsg(v string) *RefuseRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *RefuseRiskTaskResponse) SetSuccess(v bool) *RefuseRiskTaskResponse {
	s.Success = &v
	return s
}

type VerifyRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s VerifyRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *VerifyRiskTaskRequest) SetAuthToken(v string) *VerifyRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyRiskTaskRequest) SetRiskTaskId(v string) *VerifyRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *VerifyRiskTaskRequest) SetComment(v string) *VerifyRiskTaskRequest {
	s.Comment = &v
	return s
}

type VerifyRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功与否
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s VerifyRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *VerifyRiskTaskResponse) SetReqMsgId(v string) *VerifyRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyRiskTaskResponse) SetResultCode(v string) *VerifyRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyRiskTaskResponse) SetResultMsg(v string) *VerifyRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyRiskTaskResponse) SetSuccess(v bool) *VerifyRiskTaskResponse {
	s.Success = &v
	return s
}

type SendRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 责任人
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s SendRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SendRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *SendRiskTaskRequest) SetAuthToken(v string) *SendRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SendRiskTaskRequest) SetRiskTaskId(v string) *SendRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *SendRiskTaskRequest) SetOwner(v string) *SendRiskTaskRequest {
	s.Owner = &v
	return s
}

func (s *SendRiskTaskRequest) SetComment(v string) *SendRiskTaskRequest {
	s.Comment = &v
	return s
}

type SendRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SendRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SendRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *SendRiskTaskResponse) SetReqMsgId(v string) *SendRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendRiskTaskResponse) SetResultCode(v string) *SendRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SendRiskTaskResponse) SetResultMsg(v string) *SendRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendRiskTaskResponse) SetSuccess(v bool) *SendRiskTaskResponse {
	s.Success = &v
	return s
}

type CloseRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 描述，评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s CloseRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *CloseRiskTaskRequest) SetAuthToken(v string) *CloseRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseRiskTaskRequest) SetRiskTaskId(v string) *CloseRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *CloseRiskTaskRequest) SetComment(v string) *CloseRiskTaskRequest {
	s.Comment = &v
	return s
}

type CloseRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CloseRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *CloseRiskTaskResponse) SetReqMsgId(v string) *CloseRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseRiskTaskResponse) SetResultCode(v string) *CloseRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseRiskTaskResponse) SetResultMsg(v string) *CloseRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloseRiskTaskResponse) SetSuccess(v bool) *CloseRiskTaskResponse {
	s.Success = &v
	return s
}

type GetRiskStatisticsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetRiskStatisticsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRiskStatisticsRequest) GoString() string {
	return s.String()
}

func (s *GetRiskStatisticsRequest) SetAuthToken(v string) *GetRiskStatisticsRequest {
	s.AuthToken = &v
	return s
}

type GetRiskStatisticsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险总数
	TotalRiskTasksCount *int64 `json:"total_risk_tasks_count,omitempty" xml:"total_risk_tasks_count,omitempty"`
	// 未修复风险数
	UnfixedRiskTasksCount *int64 `json:"unfixed_risk_tasks_count,omitempty" xml:"unfixed_risk_tasks_count,omitempty"`
	// 未响应风险数
	UnconfirmedRisksTasksCount *int64 `json:"unconfirmed_risks_tasks_count,omitempty" xml:"unconfirmed_risks_tasks_count,omitempty"`
	// 镜像漏洞风险数
	ImageRiskTasksCount *int64 `json:"image_risk_tasks_count,omitempty" xml:"image_risk_tasks_count,omitempty"`
	// 基线风险数
	BenchmarkRiskTasksCount *int64 `json:"benchmark_risk_tasks_count,omitempty" xml:"benchmark_risk_tasks_count,omitempty"`
	// 运行时风险数
	RuntimeRiskTasksCount *int64 `json:"runtime_risk_tasks_count,omitempty" xml:"runtime_risk_tasks_count,omitempty"`
}

func (s GetRiskStatisticsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRiskStatisticsResponse) GoString() string {
	return s.String()
}

func (s *GetRiskStatisticsResponse) SetReqMsgId(v string) *GetRiskStatisticsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetResultCode(v string) *GetRiskStatisticsResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetResultMsg(v string) *GetRiskStatisticsResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetTotalRiskTasksCount(v int64) *GetRiskStatisticsResponse {
	s.TotalRiskTasksCount = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetUnfixedRiskTasksCount(v int64) *GetRiskStatisticsResponse {
	s.UnfixedRiskTasksCount = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetUnconfirmedRisksTasksCount(v int64) *GetRiskStatisticsResponse {
	s.UnconfirmedRisksTasksCount = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetImageRiskTasksCount(v int64) *GetRiskStatisticsResponse {
	s.ImageRiskTasksCount = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetBenchmarkRiskTasksCount(v int64) *GetRiskStatisticsResponse {
	s.BenchmarkRiskTasksCount = &v
	return s
}

func (s *GetRiskStatisticsResponse) SetRuntimeRiskTasksCount(v int64) *GetRiskStatisticsResponse {
	s.RuntimeRiskTasksCount = &v
	return s
}

type QueryRiskAuditsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险工单ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
}

func (s QueryRiskAuditsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskAuditsRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskAuditsRequest) SetAuthToken(v string) *QueryRiskAuditsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskAuditsRequest) SetRiskTaskId(v string) *QueryRiskAuditsRequest {
	s.RiskTaskId = &v
	return s
}

type QueryRiskAuditsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险任务审计
	RiskTaskAudits []*RiskTaskAudit `json:"risk_task_audits,omitempty" xml:"risk_task_audits,omitempty" type:"Repeated"`
}

func (s QueryRiskAuditsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskAuditsResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskAuditsResponse) SetReqMsgId(v string) *QueryRiskAuditsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskAuditsResponse) SetResultCode(v string) *QueryRiskAuditsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskAuditsResponse) SetResultMsg(v string) *QueryRiskAuditsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskAuditsResponse) SetRiskTaskAudits(v []*RiskTaskAudit) *QueryRiskAuditsResponse {
	s.RiskTaskAudits = v
	return s
}

type CreateRiskSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 关联风险ID
	RiskId *string `json:"risk_id,omitempty" xml:"risk_id,omitempty" require:"true"`
	// 解决方案来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 修复类型
	FixType *string `json:"fix_type,omitempty" xml:"fix_type,omitempty" require:"true"`
	// 风险描述
	RiskDescription *string `json:"risk_description,omitempty" xml:"risk_description,omitempty" require:"true"`
	// 风险解决方案
	SolutionPlan *string `json:"solution_plan,omitempty" xml:"solution_plan,omitempty" require:"true"`
	// 应急解决方案
	EmergencyPlan *string `json:"emergency_plan,omitempty" xml:"emergency_plan,omitempty" require:"true"`
}

func (s CreateRiskSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRiskSolutionRequest) GoString() string {
	return s.String()
}

func (s *CreateRiskSolutionRequest) SetAuthToken(v string) *CreateRiskSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetName(v string) *CreateRiskSolutionRequest {
	s.Name = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetRiskId(v string) *CreateRiskSolutionRequest {
	s.RiskId = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetSource(v string) *CreateRiskSolutionRequest {
	s.Source = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetFixType(v string) *CreateRiskSolutionRequest {
	s.FixType = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetRiskDescription(v string) *CreateRiskSolutionRequest {
	s.RiskDescription = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetSolutionPlan(v string) *CreateRiskSolutionRequest {
	s.SolutionPlan = &v
	return s
}

func (s *CreateRiskSolutionRequest) SetEmergencyPlan(v string) *CreateRiskSolutionRequest {
	s.EmergencyPlan = &v
	return s
}

type CreateRiskSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险解决方案ID
	RiskSolutionId *string `json:"risk_solution_id,omitempty" xml:"risk_solution_id,omitempty"`
}

func (s CreateRiskSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRiskSolutionResponse) GoString() string {
	return s.String()
}

func (s *CreateRiskSolutionResponse) SetReqMsgId(v string) *CreateRiskSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRiskSolutionResponse) SetResultCode(v string) *CreateRiskSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRiskSolutionResponse) SetResultMsg(v string) *CreateRiskSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRiskSolutionResponse) SetRiskSolutionId(v string) *CreateRiskSolutionResponse {
	s.RiskSolutionId = &v
	return s
}

type QueryRiskSolutionsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险解决方案名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 风险ID
	RiskId *string `json:"risk_id,omitempty" xml:"risk_id,omitempty"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryRiskSolutionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskSolutionsRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskSolutionsRequest) SetAuthToken(v string) *QueryRiskSolutionsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskSolutionsRequest) SetName(v string) *QueryRiskSolutionsRequest {
	s.Name = &v
	return s
}

func (s *QueryRiskSolutionsRequest) SetRiskId(v string) *QueryRiskSolutionsRequest {
	s.RiskId = &v
	return s
}

func (s *QueryRiskSolutionsRequest) SetPage(v int64) *QueryRiskSolutionsRequest {
	s.Page = &v
	return s
}

func (s *QueryRiskSolutionsRequest) SetPageSize(v int64) *QueryRiskSolutionsRequest {
	s.PageSize = &v
	return s
}

type QueryRiskSolutionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险解决方案列表
	RiskSolutions []*RiskSolution `json:"risk_solutions,omitempty" xml:"risk_solutions,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryRiskSolutionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskSolutionsResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskSolutionsResponse) SetReqMsgId(v string) *QueryRiskSolutionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskSolutionsResponse) SetResultCode(v string) *QueryRiskSolutionsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskSolutionsResponse) SetResultMsg(v string) *QueryRiskSolutionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskSolutionsResponse) SetRiskSolutions(v []*RiskSolution) *QueryRiskSolutionsResponse {
	s.RiskSolutions = v
	return s
}

func (s *QueryRiskSolutionsResponse) SetTotalCount(v int64) *QueryRiskSolutionsResponse {
	s.TotalCount = &v
	return s
}

type GetRiskSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
	RiskSolutionId *string `json:"risk_solution_id,omitempty" xml:"risk_solution_id,omitempty"`
	// 风险ID，risk_id和risk_solution_id至少有一个非空
	RiskId *string `json:"risk_id,omitempty" xml:"risk_id,omitempty"`
}

func (s GetRiskSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRiskSolutionRequest) GoString() string {
	return s.String()
}

func (s *GetRiskSolutionRequest) SetAuthToken(v string) *GetRiskSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRiskSolutionRequest) SetRiskSolutionId(v string) *GetRiskSolutionRequest {
	s.RiskSolutionId = &v
	return s
}

func (s *GetRiskSolutionRequest) SetRiskId(v string) *GetRiskSolutionRequest {
	s.RiskId = &v
	return s
}

type GetRiskSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险解决方案
	RiskSolution *RiskSolution `json:"risk_solution,omitempty" xml:"risk_solution,omitempty"`
}

func (s GetRiskSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRiskSolutionResponse) GoString() string {
	return s.String()
}

func (s *GetRiskSolutionResponse) SetReqMsgId(v string) *GetRiskSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRiskSolutionResponse) SetResultCode(v string) *GetRiskSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRiskSolutionResponse) SetResultMsg(v string) *GetRiskSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRiskSolutionResponse) SetRiskSolution(v *RiskSolution) *GetRiskSolutionResponse {
	s.RiskSolution = v
	return s
}

type UpdateRiskSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险解决方案ID
	RiskSolutionId *string `json:"risk_solution_id,omitempty" xml:"risk_solution_id,omitempty" require:"true"`
	// 解决方案类型
	FixType *string `json:"fix_type,omitempty" xml:"fix_type,omitempty"`
	// 风险描述
	RiskDescription *string `json:"risk_description,omitempty" xml:"risk_description,omitempty"`
	// 风险解决方案
	SolutionPlan *string `json:"solution_plan,omitempty" xml:"solution_plan,omitempty"`
	// 应急解决方案
	EmergencyPlan *string `json:"emergency_plan,omitempty" xml:"emergency_plan,omitempty"`
}

func (s UpdateRiskSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRiskSolutionRequest) GoString() string {
	return s.String()
}

func (s *UpdateRiskSolutionRequest) SetAuthToken(v string) *UpdateRiskSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRiskSolutionRequest) SetRiskSolutionId(v string) *UpdateRiskSolutionRequest {
	s.RiskSolutionId = &v
	return s
}

func (s *UpdateRiskSolutionRequest) SetFixType(v string) *UpdateRiskSolutionRequest {
	s.FixType = &v
	return s
}

func (s *UpdateRiskSolutionRequest) SetRiskDescription(v string) *UpdateRiskSolutionRequest {
	s.RiskDescription = &v
	return s
}

func (s *UpdateRiskSolutionRequest) SetSolutionPlan(v string) *UpdateRiskSolutionRequest {
	s.SolutionPlan = &v
	return s
}

func (s *UpdateRiskSolutionRequest) SetEmergencyPlan(v string) *UpdateRiskSolutionRequest {
	s.EmergencyPlan = &v
	return s
}

type UpdateRiskSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//  更新是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRiskSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRiskSolutionResponse) GoString() string {
	return s.String()
}

func (s *UpdateRiskSolutionResponse) SetReqMsgId(v string) *UpdateRiskSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRiskSolutionResponse) SetResultCode(v string) *UpdateRiskSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRiskSolutionResponse) SetResultMsg(v string) *UpdateRiskSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRiskSolutionResponse) SetSuccess(v bool) *UpdateRiskSolutionResponse {
	s.Success = &v
	return s
}

type DeleteRiskSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险解决方案ID
	RiskSolutionId *string `json:"risk_solution_id,omitempty" xml:"risk_solution_id,omitempty" require:"true"`
}

func (s DeleteRiskSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRiskSolutionRequest) GoString() string {
	return s.String()
}

func (s *DeleteRiskSolutionRequest) SetAuthToken(v string) *DeleteRiskSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRiskSolutionRequest) SetRiskSolutionId(v string) *DeleteRiskSolutionRequest {
	s.RiskSolutionId = &v
	return s
}

type DeleteRiskSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteRiskSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRiskSolutionResponse) GoString() string {
	return s.String()
}

func (s *DeleteRiskSolutionResponse) SetReqMsgId(v string) *DeleteRiskSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRiskSolutionResponse) SetResultCode(v string) *DeleteRiskSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRiskSolutionResponse) SetResultMsg(v string) *DeleteRiskSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteRiskSolutionResponse) SetSuccess(v bool) *DeleteRiskSolutionResponse {
	s.Success = &v
	return s
}

type ImportClusterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 集群名称
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty" require:"true"`
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 导入方式（手工manual/自动auto）
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 命名空间白名单
	NamespaceWhitelist []*string `json:"namespace_whitelist,omitempty" xml:"namespace_whitelist,omitempty" type:"Repeated"`
}

func (s ImportClusterRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportClusterRequest) GoString() string {
	return s.String()
}

func (s *ImportClusterRequest) SetAuthToken(v string) *ImportClusterRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportClusterRequest) SetClusterId(v string) *ImportClusterRequest {
	s.ClusterId = &v
	return s
}

func (s *ImportClusterRequest) SetClusterName(v string) *ImportClusterRequest {
	s.ClusterName = &v
	return s
}

func (s *ImportClusterRequest) SetEnv(v string) *ImportClusterRequest {
	s.Env = &v
	return s
}

func (s *ImportClusterRequest) SetSource(v string) *ImportClusterRequest {
	s.Source = &v
	return s
}

func (s *ImportClusterRequest) SetNamespaceWhitelist(v []*string) *ImportClusterRequest {
	s.NamespaceWhitelist = v
	return s
}

type ImportClusterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 被纳管的集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
}

func (s ImportClusterResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportClusterResponse) GoString() string {
	return s.String()
}

func (s *ImportClusterResponse) SetReqMsgId(v string) *ImportClusterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportClusterResponse) SetResultCode(v string) *ImportClusterResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportClusterResponse) SetResultMsg(v string) *ImportClusterResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportClusterResponse) SetClusterId(v string) *ImportClusterResponse {
	s.ClusterId = &v
	return s
}

type AddClusterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty" require:"true"`
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 必为manual
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 命名空间白名单
	NamespaceWhitelist []*string `json:"namespace_whitelist,omitempty" xml:"namespace_whitelist,omitempty" require:"true" type:"Repeated"`
	// 新增集群kubeconfig
	Kubeconfig *string `json:"kubeconfig,omitempty" xml:"kubeconfig,omitempty" require:"true"`
}

func (s AddClusterRequest) String() string {
	return tea.Prettify(s)
}

func (s AddClusterRequest) GoString() string {
	return s.String()
}

func (s *AddClusterRequest) SetAuthToken(v string) *AddClusterRequest {
	s.AuthToken = &v
	return s
}

func (s *AddClusterRequest) SetClusterName(v string) *AddClusterRequest {
	s.ClusterName = &v
	return s
}

func (s *AddClusterRequest) SetEnv(v string) *AddClusterRequest {
	s.Env = &v
	return s
}

func (s *AddClusterRequest) SetSource(v string) *AddClusterRequest {
	s.Source = &v
	return s
}

func (s *AddClusterRequest) SetNamespaceWhitelist(v []*string) *AddClusterRequest {
	s.NamespaceWhitelist = v
	return s
}

func (s *AddClusterRequest) SetKubeconfig(v string) *AddClusterRequest {
	s.Kubeconfig = &v
	return s
}

type AddClusterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	// 被纳管的集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
}

func (s AddClusterResponse) String() string {
	return tea.Prettify(s)
}

func (s AddClusterResponse) GoString() string {
	return s.String()
}

func (s *AddClusterResponse) SetReqMsgId(v string) *AddClusterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddClusterResponse) SetResultCode(v string) *AddClusterResponse {
	s.ResultCode = &v
	return s
}

func (s *AddClusterResponse) SetResultMsg(v string) *AddClusterResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddClusterResponse) SetClusterId(v string) *AddClusterResponse {
	s.ClusterId = &v
	return s
}

type QueryClusterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// 来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryClusterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterRequest) SetAuthToken(v string) *QueryClusterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterRequest) SetClusterId(v string) *QueryClusterRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryClusterRequest) SetClusterName(v string) *QueryClusterRequest {
	s.ClusterName = &v
	return s
}

func (s *QueryClusterRequest) SetSource(v string) *QueryClusterRequest {
	s.Source = &v
	return s
}

func (s *QueryClusterRequest) SetStatus(v string) *QueryClusterRequest {
	s.Status = &v
	return s
}

func (s *QueryClusterRequest) SetEnv(v string) *QueryClusterRequest {
	s.Env = &v
	return s
}

func (s *QueryClusterRequest) SetPage(v int64) *QueryClusterRequest {
	s.Page = &v
	return s
}

func (s *QueryClusterRequest) SetPageSize(v int64) *QueryClusterRequest {
	s.PageSize = &v
	return s
}

type QueryClusterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数
	TotalCnt *int64 `json:"total_cnt,omitempty" xml:"total_cnt,omitempty"`
	// 集群信息
	Clusters []*Cluster `json:"clusters,omitempty" xml:"clusters,omitempty" type:"Repeated"`
}

func (s QueryClusterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterResponse) SetReqMsgId(v string) *QueryClusterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterResponse) SetResultCode(v string) *QueryClusterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterResponse) SetResultMsg(v string) *QueryClusterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterResponse) SetTotalCnt(v int64) *QueryClusterResponse {
	s.TotalCnt = &v
	return s
}

func (s *QueryClusterResponse) SetClusters(v []*Cluster) *QueryClusterResponse {
	s.Clusters = v
	return s
}

type QueryClusterNamespaceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
}

func (s QueryClusterNamespaceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterNamespaceRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterNamespaceRequest) SetAuthToken(v string) *QueryClusterNamespaceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterNamespaceRequest) SetClusterId(v string) *QueryClusterNamespaceRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryClusterNamespaceRequest) SetClusterName(v string) *QueryClusterNamespaceRequest {
	s.ClusterName = &v
	return s
}

type QueryClusterNamespaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 命名空间列表
	Namespaces []*string `json:"namespaces,omitempty" xml:"namespaces,omitempty" type:"Repeated"`
}

func (s QueryClusterNamespaceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterNamespaceResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterNamespaceResponse) SetReqMsgId(v string) *QueryClusterNamespaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterNamespaceResponse) SetResultCode(v string) *QueryClusterNamespaceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterNamespaceResponse) SetResultMsg(v string) *QueryClusterNamespaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterNamespaceResponse) SetNamespaces(v []*string) *QueryClusterNamespaceResponse {
	s.Namespaces = v
	return s
}

type ReclaimClusterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
}

func (s ReclaimClusterRequest) String() string {
	return tea.Prettify(s)
}

func (s ReclaimClusterRequest) GoString() string {
	return s.String()
}

func (s *ReclaimClusterRequest) SetAuthToken(v string) *ReclaimClusterRequest {
	s.AuthToken = &v
	return s
}

func (s *ReclaimClusterRequest) SetClusterId(v string) *ReclaimClusterRequest {
	s.ClusterId = &v
	return s
}

type ReclaimClusterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 被解绑的集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 被解绑的集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
}

func (s ReclaimClusterResponse) String() string {
	return tea.Prettify(s)
}

func (s ReclaimClusterResponse) GoString() string {
	return s.String()
}

func (s *ReclaimClusterResponse) SetReqMsgId(v string) *ReclaimClusterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReclaimClusterResponse) SetResultCode(v string) *ReclaimClusterResponse {
	s.ResultCode = &v
	return s
}

func (s *ReclaimClusterResponse) SetResultMsg(v string) *ReclaimClusterResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReclaimClusterResponse) SetClusterId(v string) *ReclaimClusterResponse {
	s.ClusterId = &v
	return s
}

func (s *ReclaimClusterResponse) SetClusterName(v string) *ReclaimClusterResponse {
	s.ClusterName = &v
	return s
}

type QueryClusterBriefRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 集群名
	ClusterName *string `json:"cluster_name,omitempty" xml:"cluster_name,omitempty"`
	// 分野
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryClusterBriefRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterBriefRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterBriefRequest) SetAuthToken(v string) *QueryClusterBriefRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterBriefRequest) SetClusterId(v string) *QueryClusterBriefRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryClusterBriefRequest) SetClusterName(v string) *QueryClusterBriefRequest {
	s.ClusterName = &v
	return s
}

func (s *QueryClusterBriefRequest) SetPage(v int64) *QueryClusterBriefRequest {
	s.Page = &v
	return s
}

func (s *QueryClusterBriefRequest) SetPageSize(v int64) *QueryClusterBriefRequest {
	s.PageSize = &v
	return s
}

type QueryClusterBriefResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 安全简报
	Brief []*ClusterSecurityBrief `json:"brief,omitempty" xml:"brief,omitempty" type:"Repeated"`
}

func (s QueryClusterBriefResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterBriefResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterBriefResponse) SetReqMsgId(v string) *QueryClusterBriefResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterBriefResponse) SetResultCode(v string) *QueryClusterBriefResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterBriefResponse) SetResultMsg(v string) *QueryClusterBriefResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterBriefResponse) SetBrief(v []*ClusterSecurityBrief) *QueryClusterBriefResponse {
	s.Brief = v
	return s
}

type GetStrategyDefaultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetStrategyDefaultRequest) String() string {
	return tea.Prettify(s)
}

func (s GetStrategyDefaultRequest) GoString() string {
	return s.String()
}

func (s *GetStrategyDefaultRequest) SetAuthToken(v string) *GetStrategyDefaultRequest {
	s.AuthToken = &v
	return s
}

type GetStrategyDefaultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s GetStrategyDefaultResponse) String() string {
	return tea.Prettify(s)
}

func (s GetStrategyDefaultResponse) GoString() string {
	return s.String()
}

func (s *GetStrategyDefaultResponse) SetReqMsgId(v string) *GetStrategyDefaultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetStrategyDefaultResponse) SetResultCode(v string) *GetStrategyDefaultResponse {
	s.ResultCode = &v
	return s
}

func (s *GetStrategyDefaultResponse) SetResultMsg(v string) *GetStrategyDefaultResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetStrategyDefaultResponse) SetContent(v string) *GetStrategyDefaultResponse {
	s.Content = &v
	return s
}

type AddStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// 策略内容
	Content *Strategy `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 绑定的集群id
	ClusterId []*string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" type:"Repeated"`
}

func (s AddStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s AddStrategyRequest) GoString() string {
	return s.String()
}

func (s *AddStrategyRequest) SetAuthToken(v string) *AddStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *AddStrategyRequest) SetStrategyId(v string) *AddStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *AddStrategyRequest) SetContent(v *Strategy) *AddStrategyRequest {
	s.Content = v
	return s
}

func (s *AddStrategyRequest) SetClusterId(v []*string) *AddStrategyRequest {
	s.ClusterId = v
	return s
}

type AddStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
}

func (s AddStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s AddStrategyResponse) GoString() string {
	return s.String()
}

func (s *AddStrategyResponse) SetReqMsgId(v string) *AddStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddStrategyResponse) SetResultCode(v string) *AddStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *AddStrategyResponse) SetResultMsg(v string) *AddStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddStrategyResponse) SetStrategyId(v string) *AddStrategyResponse {
	s.StrategyId = &v
	return s
}

type BindStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty" require:"true"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
}

func (s BindStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s BindStrategyRequest) GoString() string {
	return s.String()
}

func (s *BindStrategyRequest) SetAuthToken(v string) *BindStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *BindStrategyRequest) SetStrategyId(v string) *BindStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *BindStrategyRequest) SetClusterId(v string) *BindStrategyRequest {
	s.ClusterId = &v
	return s
}

type BindStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s BindStrategyResponse) GoString() string {
	return s.String()
}

func (s *BindStrategyResponse) SetReqMsgId(v string) *BindStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindStrategyResponse) SetResultCode(v string) *BindStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *BindStrategyResponse) SetResultMsg(v string) *BindStrategyResponse {
	s.ResultMsg = &v
	return s
}

type QueryRisksRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 风险名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryRisksRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRisksRequest) GoString() string {
	return s.String()
}

func (s *QueryRisksRequest) SetAuthToken(v string) *QueryRisksRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRisksRequest) SetPage(v int64) *QueryRisksRequest {
	s.Page = &v
	return s
}

func (s *QueryRisksRequest) SetPageSize(v int64) *QueryRisksRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRisksRequest) SetName(v string) *QueryRisksRequest {
	s.Name = &v
	return s
}

type QueryRisksResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险列表
	Risks []*Risk `json:"risks,omitempty" xml:"risks,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryRisksResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRisksResponse) GoString() string {
	return s.String()
}

func (s *QueryRisksResponse) SetReqMsgId(v string) *QueryRisksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRisksResponse) SetResultCode(v string) *QueryRisksResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRisksResponse) SetResultMsg(v string) *QueryRisksResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRisksResponse) SetRisks(v []*Risk) *QueryRisksResponse {
	s.Risks = v
	return s
}

func (s *QueryRisksResponse) SetTotalCount(v int64) *QueryRisksResponse {
	s.TotalCount = &v
	return s
}

type UpdateStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty" require:"true"`
	// 策略内容
	Content *Strategy `json:"content,omitempty" xml:"content,omitempty" require:"true"`
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

func (s *UpdateStrategyRequest) SetStrategyId(v string) *UpdateStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *UpdateStrategyRequest) SetContent(v *Strategy) *UpdateStrategyRequest {
	s.Content = v
	return s
}

type UpdateStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
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

func (s *UpdateStrategyResponse) SetStrategyId(v string) *UpdateStrategyResponse {
	s.StrategyId = &v
	return s
}

type QueryStrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略id
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 分页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryStrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStrategyRequest) GoString() string {
	return s.String()
}

func (s *QueryStrategyRequest) SetAuthToken(v string) *QueryStrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStrategyRequest) SetStrategyId(v string) *QueryStrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *QueryStrategyRequest) SetClusterId(v string) *QueryStrategyRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryStrategyRequest) SetPage(v int64) *QueryStrategyRequest {
	s.Page = &v
	return s
}

func (s *QueryStrategyRequest) SetPageSize(v int64) *QueryStrategyRequest {
	s.PageSize = &v
	return s
}

type QueryStrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略数组
	Strategy []*Strategy `json:"strategy,omitempty" xml:"strategy,omitempty" type:"Repeated"`
}

func (s QueryStrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStrategyResponse) GoString() string {
	return s.String()
}

func (s *QueryStrategyResponse) SetReqMsgId(v string) *QueryStrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStrategyResponse) SetResultCode(v string) *QueryStrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStrategyResponse) SetResultMsg(v string) *QueryStrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStrategyResponse) SetStrategy(v []*Strategy) *QueryStrategyResponse {
	s.Strategy = v
	return s
}

type ScaleRiskTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 风险任务ID
	RiskTaskId *string `json:"risk_task_id,omitempty" xml:"risk_task_id,omitempty" require:"true"`
	// 延期时间
	DeadlineTime *string `json:"deadline_time,omitempty" xml:"deadline_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// comment描述
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty"`
}

func (s ScaleRiskTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s ScaleRiskTaskRequest) GoString() string {
	return s.String()
}

func (s *ScaleRiskTaskRequest) SetAuthToken(v string) *ScaleRiskTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *ScaleRiskTaskRequest) SetRiskTaskId(v string) *ScaleRiskTaskRequest {
	s.RiskTaskId = &v
	return s
}

func (s *ScaleRiskTaskRequest) SetDeadlineTime(v string) *ScaleRiskTaskRequest {
	s.DeadlineTime = &v
	return s
}

func (s *ScaleRiskTaskRequest) SetComment(v string) *ScaleRiskTaskRequest {
	s.Comment = &v
	return s
}

type ScaleRiskTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ScaleRiskTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s ScaleRiskTaskResponse) GoString() string {
	return s.String()
}

func (s *ScaleRiskTaskResponse) SetReqMsgId(v string) *ScaleRiskTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ScaleRiskTaskResponse) SetResultCode(v string) *ScaleRiskTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *ScaleRiskTaskResponse) SetResultMsg(v string) *ScaleRiskTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ScaleRiskTaskResponse) SetSuccess(v bool) *ScaleRiskTaskResponse {
	s.Success = &v
	return s
}

type ListClusterImagesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 目标命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty"`
	// 工作负载类型
	WorkloadTypes []*string `json:"workload_types,omitempty" xml:"workload_types,omitempty" type:"Repeated"`
	// 标签列表
	Labels []*Label `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
}

func (s ListClusterImagesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListClusterImagesRequest) GoString() string {
	return s.String()
}

func (s *ListClusterImagesRequest) SetAuthToken(v string) *ListClusterImagesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListClusterImagesRequest) SetClusterId(v string) *ListClusterImagesRequest {
	s.ClusterId = &v
	return s
}

func (s *ListClusterImagesRequest) SetNamespace(v string) *ListClusterImagesRequest {
	s.Namespace = &v
	return s
}

func (s *ListClusterImagesRequest) SetWorkloadTypes(v []*string) *ListClusterImagesRequest {
	s.WorkloadTypes = v
	return s
}

func (s *ListClusterImagesRequest) SetLabels(v []*Label) *ListClusterImagesRequest {
	s.Labels = v
	return s
}

type ListClusterImagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 镜像列表
	Images *string `json:"images,omitempty" xml:"images,omitempty"`
}

func (s ListClusterImagesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListClusterImagesResponse) GoString() string {
	return s.String()
}

func (s *ListClusterImagesResponse) SetReqMsgId(v string) *ListClusterImagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListClusterImagesResponse) SetResultCode(v string) *ListClusterImagesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListClusterImagesResponse) SetResultMsg(v string) *ListClusterImagesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListClusterImagesResponse) SetImages(v string) *ListClusterImagesResponse {
	s.Images = &v
	return s
}

type StartClusterQuickscanRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
}

func (s StartClusterQuickscanRequest) String() string {
	return tea.Prettify(s)
}

func (s StartClusterQuickscanRequest) GoString() string {
	return s.String()
}

func (s *StartClusterQuickscanRequest) SetAuthToken(v string) *StartClusterQuickscanRequest {
	s.AuthToken = &v
	return s
}

func (s *StartClusterQuickscanRequest) SetClusterId(v string) *StartClusterQuickscanRequest {
	s.ClusterId = &v
	return s
}

type StartClusterQuickscanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 扫描id
	ScanId *string `json:"scan_id,omitempty" xml:"scan_id,omitempty"`
}

func (s StartClusterQuickscanResponse) String() string {
	return tea.Prettify(s)
}

func (s StartClusterQuickscanResponse) GoString() string {
	return s.String()
}

func (s *StartClusterQuickscanResponse) SetReqMsgId(v string) *StartClusterQuickscanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartClusterQuickscanResponse) SetResultCode(v string) *StartClusterQuickscanResponse {
	s.ResultCode = &v
	return s
}

func (s *StartClusterQuickscanResponse) SetResultMsg(v string) *StartClusterQuickscanResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartClusterQuickscanResponse) SetClusterId(v string) *StartClusterQuickscanResponse {
	s.ClusterId = &v
	return s
}

func (s *StartClusterQuickscanResponse) SetScanId(v string) *StartClusterQuickscanResponse {
	s.ScanId = &v
	return s
}

type QueryClusterScanRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	// 扫描id
	ScanId *string `json:"scan_id,omitempty" xml:"scan_id,omitempty"`
}

func (s QueryClusterScanRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterScanRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterScanRequest) SetAuthToken(v string) *QueryClusterScanRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterScanRequest) SetClusterId(v string) *QueryClusterScanRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryClusterScanRequest) SetScanId(v string) *QueryClusterScanRequest {
	s.ScanId = &v
	return s
}

type QueryClusterScanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	Result []*ScanResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 扫描id
	ScanId *string `json:"scan_id,omitempty" xml:"scan_id,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
}

func (s QueryClusterScanResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterScanResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterScanResponse) SetReqMsgId(v string) *QueryClusterScanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterScanResponse) SetResultCode(v string) *QueryClusterScanResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterScanResponse) SetResultMsg(v string) *QueryClusterScanResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterScanResponse) SetResult(v []*ScanResult) *QueryClusterScanResponse {
	s.Result = v
	return s
}

func (s *QueryClusterScanResponse) SetScanId(v string) *QueryClusterScanResponse {
	s.ScanId = &v
	return s
}

func (s *QueryClusterScanResponse) SetClusterId(v string) *QueryClusterScanResponse {
	s.ClusterId = &v
	return s
}

type CreateRuntimePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 运行时策略yaml文件内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s CreateRuntimePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRuntimePolicyRequest) GoString() string {
	return s.String()
}

func (s *CreateRuntimePolicyRequest) SetAuthToken(v string) *CreateRuntimePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRuntimePolicyRequest) SetClusterId(v string) *CreateRuntimePolicyRequest {
	s.ClusterId = &v
	return s
}

func (s *CreateRuntimePolicyRequest) SetNamespace(v string) *CreateRuntimePolicyRequest {
	s.Namespace = &v
	return s
}

func (s *CreateRuntimePolicyRequest) SetName(v string) *CreateRuntimePolicyRequest {
	s.Name = &v
	return s
}

func (s *CreateRuntimePolicyRequest) SetContent(v string) *CreateRuntimePolicyRequest {
	s.Content = &v
	return s
}

type CreateRuntimePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRuntimePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRuntimePolicyResponse) GoString() string {
	return s.String()
}

func (s *CreateRuntimePolicyResponse) SetReqMsgId(v string) *CreateRuntimePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRuntimePolicyResponse) SetResultCode(v string) *CreateRuntimePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRuntimePolicyResponse) SetResultMsg(v string) *CreateRuntimePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRuntimePolicyResponse) SetSuccess(v bool) *CreateRuntimePolicyResponse {
	s.Success = &v
	return s
}

type ListRuntimePoliciesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 标签选择
	LabelSelectors []*Label `json:"label_selectors,omitempty" xml:"label_selectors,omitempty" type:"Repeated"`
}

func (s ListRuntimePoliciesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimePoliciesRequest) GoString() string {
	return s.String()
}

func (s *ListRuntimePoliciesRequest) SetAuthToken(v string) *ListRuntimePoliciesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRuntimePoliciesRequest) SetClusterId(v string) *ListRuntimePoliciesRequest {
	s.ClusterId = &v
	return s
}

func (s *ListRuntimePoliciesRequest) SetNamespace(v string) *ListRuntimePoliciesRequest {
	s.Namespace = &v
	return s
}

func (s *ListRuntimePoliciesRequest) SetLabelSelectors(v []*Label) *ListRuntimePoliciesRequest {
	s.LabelSelectors = v
	return s
}

type ListRuntimePoliciesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略列表
	PolicyList []*string `json:"policy_list,omitempty" xml:"policy_list,omitempty" type:"Repeated"`
}

func (s ListRuntimePoliciesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimePoliciesResponse) GoString() string {
	return s.String()
}

func (s *ListRuntimePoliciesResponse) SetReqMsgId(v string) *ListRuntimePoliciesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRuntimePoliciesResponse) SetResultCode(v string) *ListRuntimePoliciesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRuntimePoliciesResponse) SetResultMsg(v string) *ListRuntimePoliciesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRuntimePoliciesResponse) SetPolicyList(v []*string) *ListRuntimePoliciesResponse {
	s.PolicyList = v
	return s
}

type UpdateRuntimePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s UpdateRuntimePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRuntimePolicyRequest) GoString() string {
	return s.String()
}

func (s *UpdateRuntimePolicyRequest) SetAuthToken(v string) *UpdateRuntimePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRuntimePolicyRequest) SetClusterId(v string) *UpdateRuntimePolicyRequest {
	s.ClusterId = &v
	return s
}

func (s *UpdateRuntimePolicyRequest) SetNamespace(v string) *UpdateRuntimePolicyRequest {
	s.Namespace = &v
	return s
}

func (s *UpdateRuntimePolicyRequest) SetName(v string) *UpdateRuntimePolicyRequest {
	s.Name = &v
	return s
}

func (s *UpdateRuntimePolicyRequest) SetContent(v string) *UpdateRuntimePolicyRequest {
	s.Content = &v
	return s
}

type UpdateRuntimePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRuntimePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRuntimePolicyResponse) GoString() string {
	return s.String()
}

func (s *UpdateRuntimePolicyResponse) SetReqMsgId(v string) *UpdateRuntimePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRuntimePolicyResponse) SetResultCode(v string) *UpdateRuntimePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRuntimePolicyResponse) SetResultMsg(v string) *UpdateRuntimePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRuntimePolicyResponse) SetSuccess(v bool) *UpdateRuntimePolicyResponse {
	s.Success = &v
	return s
}

type DeleteRuntimePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 运行时策略命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 运行时策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s DeleteRuntimePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRuntimePolicyRequest) GoString() string {
	return s.String()
}

func (s *DeleteRuntimePolicyRequest) SetAuthToken(v string) *DeleteRuntimePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRuntimePolicyRequest) SetClusterId(v string) *DeleteRuntimePolicyRequest {
	s.ClusterId = &v
	return s
}

func (s *DeleteRuntimePolicyRequest) SetNamespace(v string) *DeleteRuntimePolicyRequest {
	s.Namespace = &v
	return s
}

func (s *DeleteRuntimePolicyRequest) SetName(v string) *DeleteRuntimePolicyRequest {
	s.Name = &v
	return s
}

type DeleteRuntimePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteRuntimePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRuntimePolicyResponse) GoString() string {
	return s.String()
}

func (s *DeleteRuntimePolicyResponse) SetReqMsgId(v string) *DeleteRuntimePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRuntimePolicyResponse) SetResultCode(v string) *DeleteRuntimePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRuntimePolicyResponse) SetResultMsg(v string) *DeleteRuntimePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteRuntimePolicyResponse) SetSuccess(v bool) *DeleteRuntimePolicyResponse {
	s.Success = &v
	return s
}

type ListRuntimepolicyPodsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 策略名称
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty" require:"true"`
}

func (s ListRuntimepolicyPodsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimepolicyPodsRequest) GoString() string {
	return s.String()
}

func (s *ListRuntimepolicyPodsRequest) SetAuthToken(v string) *ListRuntimepolicyPodsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRuntimepolicyPodsRequest) SetClusterId(v string) *ListRuntimepolicyPodsRequest {
	s.ClusterId = &v
	return s
}

func (s *ListRuntimepolicyPodsRequest) SetNamespace(v string) *ListRuntimepolicyPodsRequest {
	s.Namespace = &v
	return s
}

func (s *ListRuntimepolicyPodsRequest) SetPolicyName(v string) *ListRuntimepolicyPodsRequest {
	s.PolicyName = &v
	return s
}

type ListRuntimepolicyPodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// pod列表
	Pods []*string `json:"pods,omitempty" xml:"pods,omitempty" type:"Repeated"`
}

func (s ListRuntimepolicyPodsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimepolicyPodsResponse) GoString() string {
	return s.String()
}

func (s *ListRuntimepolicyPodsResponse) SetReqMsgId(v string) *ListRuntimepolicyPodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRuntimepolicyPodsResponse) SetResultCode(v string) *ListRuntimepolicyPodsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRuntimepolicyPodsResponse) SetResultMsg(v string) *ListRuntimepolicyPodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRuntimepolicyPodsResponse) SetPods(v []*string) *ListRuntimepolicyPodsResponse {
	s.Pods = v
	return s
}

type ListRuntimepolicyNodesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ListRuntimepolicyNodesRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimepolicyNodesRequest) GoString() string {
	return s.String()
}

func (s *ListRuntimepolicyNodesRequest) SetAuthToken(v string) *ListRuntimepolicyNodesRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRuntimepolicyNodesRequest) SetClusterId(v string) *ListRuntimepolicyNodesRequest {
	s.ClusterId = &v
	return s
}

func (s *ListRuntimepolicyNodesRequest) SetNamespace(v string) *ListRuntimepolicyNodesRequest {
	s.Namespace = &v
	return s
}

func (s *ListRuntimepolicyNodesRequest) SetName(v string) *ListRuntimepolicyNodesRequest {
	s.Name = &v
	return s
}

type ListRuntimepolicyNodesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 节点列表
	Nodes []*string `json:"nodes,omitempty" xml:"nodes,omitempty" type:"Repeated"`
}

func (s ListRuntimepolicyNodesResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRuntimepolicyNodesResponse) GoString() string {
	return s.String()
}

func (s *ListRuntimepolicyNodesResponse) SetReqMsgId(v string) *ListRuntimepolicyNodesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRuntimepolicyNodesResponse) SetResultCode(v string) *ListRuntimepolicyNodesResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRuntimepolicyNodesResponse) SetResultMsg(v string) *ListRuntimepolicyNodesResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRuntimepolicyNodesResponse) SetNodes(v []*string) *ListRuntimepolicyNodesResponse {
	s.Nodes = v
	return s
}

type GetRuntimePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群ID
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s GetRuntimePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRuntimePolicyRequest) GoString() string {
	return s.String()
}

func (s *GetRuntimePolicyRequest) SetAuthToken(v string) *GetRuntimePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRuntimePolicyRequest) SetClusterId(v string) *GetRuntimePolicyRequest {
	s.ClusterId = &v
	return s
}

func (s *GetRuntimePolicyRequest) SetNamespace(v string) *GetRuntimePolicyRequest {
	s.Namespace = &v
	return s
}

func (s *GetRuntimePolicyRequest) SetName(v string) *GetRuntimePolicyRequest {
	s.Name = &v
	return s
}

type GetRuntimePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 策略详情
	Policy *string `json:"policy,omitempty" xml:"policy,omitempty"`
}

func (s GetRuntimePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRuntimePolicyResponse) GoString() string {
	return s.String()
}

func (s *GetRuntimePolicyResponse) SetReqMsgId(v string) *GetRuntimePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRuntimePolicyResponse) SetResultCode(v string) *GetRuntimePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRuntimePolicyResponse) SetResultMsg(v string) *GetRuntimePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRuntimePolicyResponse) SetPolicy(v string) *GetRuntimePolicyResponse {
	s.Policy = &v
	return s
}

type QueryClusterBaselineRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 扫描id，不填默认最近一次
	ScanId *string `json:"scan_id,omitempty" xml:"scan_id,omitempty"`
	// 页码
	Page *int64 `json:"page,omitempty" xml:"page,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryClusterBaselineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterBaselineRequest) GoString() string {
	return s.String()
}

func (s *QueryClusterBaselineRequest) SetAuthToken(v string) *QueryClusterBaselineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryClusterBaselineRequest) SetClusterId(v string) *QueryClusterBaselineRequest {
	s.ClusterId = &v
	return s
}

func (s *QueryClusterBaselineRequest) SetScanId(v string) *QueryClusterBaselineRequest {
	s.ScanId = &v
	return s
}

func (s *QueryClusterBaselineRequest) SetPage(v int64) *QueryClusterBaselineRequest {
	s.Page = &v
	return s
}

func (s *QueryClusterBaselineRequest) SetPageSize(v int64) *QueryClusterBaselineRequest {
	s.PageSize = &v
	return s
}

type QueryClusterBaselineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扫描结果
	Result []*BaselineScanResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 结果条目总数
	TotalCnt *int64 `json:"total_cnt,omitempty" xml:"total_cnt,omitempty"`
}

func (s QueryClusterBaselineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryClusterBaselineResponse) GoString() string {
	return s.String()
}

func (s *QueryClusterBaselineResponse) SetReqMsgId(v string) *QueryClusterBaselineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryClusterBaselineResponse) SetResultCode(v string) *QueryClusterBaselineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryClusterBaselineResponse) SetResultMsg(v string) *QueryClusterBaselineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryClusterBaselineResponse) SetResult(v []*BaselineScanResult) *QueryClusterBaselineResponse {
	s.Result = v
	return s
}

func (s *QueryClusterBaselineResponse) SetTotalCnt(v int64) *QueryClusterBaselineResponse {
	s.TotalCnt = &v
	return s
}

type SubmitImagesReposcanRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 镜像仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 项目列表
	Projects []*string `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
	// 仓库列表
	Repositories []*string `json:"repositories,omitempty" xml:"repositories,omitempty" type:"Repeated"`
	// 镜像起始时间
	ImageBeginTime *string `json:"image_begin_time,omitempty" xml:"image_begin_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 并发扫描数
	ConcurrentCount *int64 `json:"concurrent_count,omitempty" xml:"concurrent_count,omitempty"`
	// 扫描轮询间隔，单位s
	PollInterval *int64 `json:"poll_interval,omitempty" xml:"poll_interval,omitempty"`
}

func (s SubmitImagesReposcanRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitImagesReposcanRequest) GoString() string {
	return s.String()
}

func (s *SubmitImagesReposcanRequest) SetAuthToken(v string) *SubmitImagesReposcanRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitImagesReposcanRequest) SetRepoId(v string) *SubmitImagesReposcanRequest {
	s.RepoId = &v
	return s
}

func (s *SubmitImagesReposcanRequest) SetProjects(v []*string) *SubmitImagesReposcanRequest {
	s.Projects = v
	return s
}

func (s *SubmitImagesReposcanRequest) SetRepositories(v []*string) *SubmitImagesReposcanRequest {
	s.Repositories = v
	return s
}

func (s *SubmitImagesReposcanRequest) SetImageBeginTime(v string) *SubmitImagesReposcanRequest {
	s.ImageBeginTime = &v
	return s
}

func (s *SubmitImagesReposcanRequest) SetConcurrentCount(v int64) *SubmitImagesReposcanRequest {
	s.ConcurrentCount = &v
	return s
}

func (s *SubmitImagesReposcanRequest) SetPollInterval(v int64) *SubmitImagesReposcanRequest {
	s.PollInterval = &v
	return s
}

type SubmitImagesReposcanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SubmitImagesReposcanResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitImagesReposcanResponse) GoString() string {
	return s.String()
}

func (s *SubmitImagesReposcanResponse) SetReqMsgId(v string) *SubmitImagesReposcanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitImagesReposcanResponse) SetResultCode(v string) *SubmitImagesReposcanResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitImagesReposcanResponse) SetResultMsg(v string) *SubmitImagesReposcanResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitImagesReposcanResponse) SetSuccess(v bool) *SubmitImagesReposcanResponse {
	s.Success = &v
	return s
}

type CreateImageRepoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 镜像仓库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 镜像仓库类型
	RepoType *string `json:"repo_type,omitempty" xml:"repo_type,omitempty" require:"true"`
	// hub域名
	Domain *string `json:"domain,omitempty" xml:"domain,omitempty" require:"true"`
	// API endpoint
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty" require:"true"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 仓库密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
}

func (s CreateImageRepoRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateImageRepoRequest) GoString() string {
	return s.String()
}

func (s *CreateImageRepoRequest) SetAuthToken(v string) *CreateImageRepoRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateImageRepoRequest) SetName(v string) *CreateImageRepoRequest {
	s.Name = &v
	return s
}

func (s *CreateImageRepoRequest) SetRepoType(v string) *CreateImageRepoRequest {
	s.RepoType = &v
	return s
}

func (s *CreateImageRepoRequest) SetDomain(v string) *CreateImageRepoRequest {
	s.Domain = &v
	return s
}

func (s *CreateImageRepoRequest) SetEndpoint(v string) *CreateImageRepoRequest {
	s.Endpoint = &v
	return s
}

func (s *CreateImageRepoRequest) SetUserName(v string) *CreateImageRepoRequest {
	s.UserName = &v
	return s
}

func (s *CreateImageRepoRequest) SetPassword(v string) *CreateImageRepoRequest {
	s.Password = &v
	return s
}

type CreateImageRepoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty"`
}

func (s CreateImageRepoResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateImageRepoResponse) GoString() string {
	return s.String()
}

func (s *CreateImageRepoResponse) SetReqMsgId(v string) *CreateImageRepoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateImageRepoResponse) SetResultCode(v string) *CreateImageRepoResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateImageRepoResponse) SetResultMsg(v string) *CreateImageRepoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateImageRepoResponse) SetRepoId(v string) *CreateImageRepoResponse {
	s.RepoId = &v
	return s
}

type QueryImageReposRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryImageReposRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImageReposRequest) GoString() string {
	return s.String()
}

func (s *QueryImageReposRequest) SetAuthToken(v string) *QueryImageReposRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryImageReposRequest) SetName(v string) *QueryImageReposRequest {
	s.Name = &v
	return s
}

func (s *QueryImageReposRequest) SetPage(v int64) *QueryImageReposRequest {
	s.Page = &v
	return s
}

func (s *QueryImageReposRequest) SetPageSize(v int64) *QueryImageReposRequest {
	s.PageSize = &v
	return s
}

type QueryImageReposResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 镜像仓库列表
	Repos []*ImageRepo `json:"repos,omitempty" xml:"repos,omitempty" type:"Repeated"`
}

func (s QueryImageReposResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImageReposResponse) GoString() string {
	return s.String()
}

func (s *QueryImageReposResponse) SetReqMsgId(v string) *QueryImageReposResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryImageReposResponse) SetResultCode(v string) *QueryImageReposResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryImageReposResponse) SetResultMsg(v string) *QueryImageReposResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryImageReposResponse) SetRepos(v []*ImageRepo) *QueryImageReposResponse {
	s.Repos = v
	return s
}

type DeleteImageRepoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 镜像仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
}

func (s DeleteImageRepoRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageRepoRequest) GoString() string {
	return s.String()
}

func (s *DeleteImageRepoRequest) SetAuthToken(v string) *DeleteImageRepoRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteImageRepoRequest) SetRepoId(v string) *DeleteImageRepoRequest {
	s.RepoId = &v
	return s
}

type DeleteImageRepoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功与否
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteImageRepoResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageRepoResponse) GoString() string {
	return s.String()
}

func (s *DeleteImageRepoResponse) SetReqMsgId(v string) *DeleteImageRepoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteImageRepoResponse) SetResultCode(v string) *DeleteImageRepoResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteImageRepoResponse) SetResultMsg(v string) *DeleteImageRepoResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteImageRepoResponse) SetSuccess(v bool) *DeleteImageRepoResponse {
	s.Success = &v
	return s
}

type GetImageRiskdetailurlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 镜像地址
	Image *string `json:"image,omitempty" xml:"image,omitempty" require:"true"`
	// 应用名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
}

func (s GetImageRiskdetailurlRequest) String() string {
	return tea.Prettify(s)
}

func (s GetImageRiskdetailurlRequest) GoString() string {
	return s.String()
}

func (s *GetImageRiskdetailurlRequest) SetAuthToken(v string) *GetImageRiskdetailurlRequest {
	s.AuthToken = &v
	return s
}

func (s *GetImageRiskdetailurlRequest) SetImage(v string) *GetImageRiskdetailurlRequest {
	s.Image = &v
	return s
}

func (s *GetImageRiskdetailurlRequest) SetAppName(v string) *GetImageRiskdetailurlRequest {
	s.AppName = &v
	return s
}

type GetImageRiskdetailurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 镜像漏洞详情展示地址
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetImageRiskdetailurlResponse) String() string {
	return tea.Prettify(s)
}

func (s GetImageRiskdetailurlResponse) GoString() string {
	return s.String()
}

func (s *GetImageRiskdetailurlResponse) SetReqMsgId(v string) *GetImageRiskdetailurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetImageRiskdetailurlResponse) SetResultCode(v string) *GetImageRiskdetailurlResponse {
	s.ResultCode = &v
	return s
}

func (s *GetImageRiskdetailurlResponse) SetResultMsg(v string) *GetImageRiskdetailurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetImageRiskdetailurlResponse) SetUrl(v string) *GetImageRiskdetailurlResponse {
	s.Url = &v
	return s
}

type CreateImageReposcanstrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	//  项目列表
	Projects []*string `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
	// 仓库列表
	Repositories []*string `json:"repositories,omitempty" xml:"repositories,omitempty" type:"Repeated"`
	// 镜像开始时间
	ImageBeginTime *string `json:"image_begin_time,omitempty" xml:"image_begin_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 定时crontab
	Crontab *string `json:"crontab,omitempty" xml:"crontab,omitempty" require:"true"`
}

func (s CreateImageReposcanstrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateImageReposcanstrategyRequest) GoString() string {
	return s.String()
}

func (s *CreateImageReposcanstrategyRequest) SetAuthToken(v string) *CreateImageReposcanstrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateImageReposcanstrategyRequest) SetRepoId(v string) *CreateImageReposcanstrategyRequest {
	s.RepoId = &v
	return s
}

func (s *CreateImageReposcanstrategyRequest) SetProjects(v []*string) *CreateImageReposcanstrategyRequest {
	s.Projects = v
	return s
}

func (s *CreateImageReposcanstrategyRequest) SetRepositories(v []*string) *CreateImageReposcanstrategyRequest {
	s.Repositories = v
	return s
}

func (s *CreateImageReposcanstrategyRequest) SetImageBeginTime(v string) *CreateImageReposcanstrategyRequest {
	s.ImageBeginTime = &v
	return s
}

func (s *CreateImageReposcanstrategyRequest) SetCrontab(v string) *CreateImageReposcanstrategyRequest {
	s.Crontab = &v
	return s
}

type CreateImageReposcanstrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 定时任务ID
	CronjobId *string `json:"cronjob_id,omitempty" xml:"cronjob_id,omitempty"`
}

func (s CreateImageReposcanstrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateImageReposcanstrategyResponse) GoString() string {
	return s.String()
}

func (s *CreateImageReposcanstrategyResponse) SetReqMsgId(v string) *CreateImageReposcanstrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateImageReposcanstrategyResponse) SetResultCode(v string) *CreateImageReposcanstrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateImageReposcanstrategyResponse) SetResultMsg(v string) *CreateImageReposcanstrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateImageReposcanstrategyResponse) SetCronjobId(v string) *CreateImageReposcanstrategyResponse {
	s.CronjobId = &v
	return s
}

type QueryImagerepoProjectsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 仓库名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
}

func (s QueryImagerepoProjectsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImagerepoProjectsRequest) GoString() string {
	return s.String()
}

func (s *QueryImagerepoProjectsRequest) SetAuthToken(v string) *QueryImagerepoProjectsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryImagerepoProjectsRequest) SetRepoId(v string) *QueryImagerepoProjectsRequest {
	s.RepoId = &v
	return s
}

func (s *QueryImagerepoProjectsRequest) SetPage(v int64) *QueryImagerepoProjectsRequest {
	s.Page = &v
	return s
}

func (s *QueryImagerepoProjectsRequest) SetPageSize(v int64) *QueryImagerepoProjectsRequest {
	s.PageSize = &v
	return s
}

func (s *QueryImagerepoProjectsRequest) SetProjectName(v string) *QueryImagerepoProjectsRequest {
	s.ProjectName = &v
	return s
}

type QueryImagerepoProjectsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目列表
	Projects []*RepoProject `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
}

func (s QueryImagerepoProjectsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImagerepoProjectsResponse) GoString() string {
	return s.String()
}

func (s *QueryImagerepoProjectsResponse) SetReqMsgId(v string) *QueryImagerepoProjectsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryImagerepoProjectsResponse) SetResultCode(v string) *QueryImagerepoProjectsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryImagerepoProjectsResponse) SetResultMsg(v string) *QueryImagerepoProjectsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryImagerepoProjectsResponse) SetProjects(v []*RepoProject) *QueryImagerepoProjectsResponse {
	s.Projects = v
	return s
}

type QueryImagerepoRepositoriesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 仓库名称
	RepositoryName *string `json:"repository_name,omitempty" xml:"repository_name,omitempty"`
}

func (s QueryImagerepoRepositoriesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImagerepoRepositoriesRequest) GoString() string {
	return s.String()
}

func (s *QueryImagerepoRepositoriesRequest) SetAuthToken(v string) *QueryImagerepoRepositoriesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryImagerepoRepositoriesRequest) SetRepoId(v string) *QueryImagerepoRepositoriesRequest {
	s.RepoId = &v
	return s
}

func (s *QueryImagerepoRepositoriesRequest) SetProjectId(v string) *QueryImagerepoRepositoriesRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryImagerepoRepositoriesRequest) SetPage(v int64) *QueryImagerepoRepositoriesRequest {
	s.Page = &v
	return s
}

func (s *QueryImagerepoRepositoriesRequest) SetPageSize(v int64) *QueryImagerepoRepositoriesRequest {
	s.PageSize = &v
	return s
}

func (s *QueryImagerepoRepositoriesRequest) SetRepositoryName(v string) *QueryImagerepoRepositoriesRequest {
	s.RepositoryName = &v
	return s
}

type QueryImagerepoRepositoriesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 仓库列表
	Repositories []*Repository `json:"repositories,omitempty" xml:"repositories,omitempty" type:"Repeated"`
}

func (s QueryImagerepoRepositoriesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImagerepoRepositoriesResponse) GoString() string {
	return s.String()
}

func (s *QueryImagerepoRepositoriesResponse) SetReqMsgId(v string) *QueryImagerepoRepositoriesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryImagerepoRepositoriesResponse) SetResultCode(v string) *QueryImagerepoRepositoriesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryImagerepoRepositoriesResponse) SetResultMsg(v string) *QueryImagerepoRepositoriesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryImagerepoRepositoriesResponse) SetRepositories(v []*Repository) *QueryImagerepoRepositoriesResponse {
	s.Repositories = v
	return s
}

type UpdateImageRepoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 用户名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty"`
	// 仓库名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s UpdateImageRepoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateImageRepoRequest) GoString() string {
	return s.String()
}

func (s *UpdateImageRepoRequest) SetAuthToken(v string) *UpdateImageRepoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateImageRepoRequest) SetRepoId(v string) *UpdateImageRepoRequest {
	s.RepoId = &v
	return s
}

func (s *UpdateImageRepoRequest) SetUserName(v string) *UpdateImageRepoRequest {
	s.UserName = &v
	return s
}

func (s *UpdateImageRepoRequest) SetPassword(v string) *UpdateImageRepoRequest {
	s.Password = &v
	return s
}

func (s *UpdateImageRepoRequest) SetName(v string) *UpdateImageRepoRequest {
	s.Name = &v
	return s
}

type UpdateImageRepoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateImageRepoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateImageRepoResponse) GoString() string {
	return s.String()
}

func (s *UpdateImageRepoResponse) SetReqMsgId(v string) *UpdateImageRepoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateImageRepoResponse) SetResultCode(v string) *UpdateImageRepoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateImageRepoResponse) SetResultMsg(v string) *UpdateImageRepoResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateImageRepoResponse) SetSuccess(v bool) *UpdateImageRepoResponse {
	s.Success = &v
	return s
}

type GetImageRepoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// repo ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
}

func (s GetImageRepoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetImageRepoRequest) GoString() string {
	return s.String()
}

func (s *GetImageRepoRequest) SetAuthToken(v string) *GetImageRepoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetImageRepoRequest) SetRepoId(v string) *GetImageRepoRequest {
	s.RepoId = &v
	return s
}

type GetImageRepoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 镜像仓库详情
	ImageRepo *ImageRepo `json:"image_repo,omitempty" xml:"image_repo,omitempty"`
}

func (s GetImageRepoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetImageRepoResponse) GoString() string {
	return s.String()
}

func (s *GetImageRepoResponse) SetReqMsgId(v string) *GetImageRepoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetImageRepoResponse) SetResultCode(v string) *GetImageRepoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetImageRepoResponse) SetResultMsg(v string) *GetImageRepoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetImageRepoResponse) SetImageRepo(v *ImageRepo) *GetImageRepoResponse {
	s.ImageRepo = v
	return s
}

type VerifyImageRepoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// repo_id
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
}

func (s VerifyImageRepoRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyImageRepoRequest) GoString() string {
	return s.String()
}

func (s *VerifyImageRepoRequest) SetAuthToken(v string) *VerifyImageRepoRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyImageRepoRequest) SetRepoId(v string) *VerifyImageRepoRequest {
	s.RepoId = &v
	return s
}

type VerifyImageRepoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty"`
	// 状态
	State *bool `json:"state,omitempty" xml:"state,omitempty"`
}

func (s VerifyImageRepoResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyImageRepoResponse) GoString() string {
	return s.String()
}

func (s *VerifyImageRepoResponse) SetReqMsgId(v string) *VerifyImageRepoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyImageRepoResponse) SetResultCode(v string) *VerifyImageRepoResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyImageRepoResponse) SetResultMsg(v string) *VerifyImageRepoResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyImageRepoResponse) SetRepoId(v string) *VerifyImageRepoResponse {
	s.RepoId = &v
	return s
}

func (s *VerifyImageRepoResponse) SetState(v bool) *VerifyImageRepoResponse {
	s.State = &v
	return s
}

type QueryImageReposcanstrategiesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 仓库ID
	RepoId *string `json:"repo_id,omitempty" xml:"repo_id,omitempty" require:"true"`
	// 当前页
	Page *int64 `json:"page,omitempty" xml:"page,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryImageReposcanstrategiesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryImageReposcanstrategiesRequest) GoString() string {
	return s.String()
}

func (s *QueryImageReposcanstrategiesRequest) SetAuthToken(v string) *QueryImageReposcanstrategiesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryImageReposcanstrategiesRequest) SetRepoId(v string) *QueryImageReposcanstrategiesRequest {
	s.RepoId = &v
	return s
}

func (s *QueryImageReposcanstrategiesRequest) SetPage(v int64) *QueryImageReposcanstrategiesRequest {
	s.Page = &v
	return s
}

func (s *QueryImageReposcanstrategiesRequest) SetPageSize(v int64) *QueryImageReposcanstrategiesRequest {
	s.PageSize = &v
	return s
}

type QueryImageReposcanstrategiesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 镜像扫描策略
	RepoStrategies []*RepoScanStrategy `json:"repo_strategies,omitempty" xml:"repo_strategies,omitempty" type:"Repeated"`
}

func (s QueryImageReposcanstrategiesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryImageReposcanstrategiesResponse) GoString() string {
	return s.String()
}

func (s *QueryImageReposcanstrategiesResponse) SetReqMsgId(v string) *QueryImageReposcanstrategiesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryImageReposcanstrategiesResponse) SetResultCode(v string) *QueryImageReposcanstrategiesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryImageReposcanstrategiesResponse) SetResultMsg(v string) *QueryImageReposcanstrategiesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryImageReposcanstrategiesResponse) SetRepoStrategies(v []*RepoScanStrategy) *QueryImageReposcanstrategiesResponse {
	s.RepoStrategies = v
	return s
}

type DeleteImageReposcanstrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略ID
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty" require:"true"`
}

func (s DeleteImageReposcanstrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageReposcanstrategyRequest) GoString() string {
	return s.String()
}

func (s *DeleteImageReposcanstrategyRequest) SetAuthToken(v string) *DeleteImageReposcanstrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteImageReposcanstrategyRequest) SetStrategyId(v string) *DeleteImageReposcanstrategyRequest {
	s.StrategyId = &v
	return s
}

type DeleteImageReposcanstrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteImageReposcanstrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageReposcanstrategyResponse) GoString() string {
	return s.String()
}

func (s *DeleteImageReposcanstrategyResponse) SetReqMsgId(v string) *DeleteImageReposcanstrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteImageReposcanstrategyResponse) SetResultCode(v string) *DeleteImageReposcanstrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteImageReposcanstrategyResponse) SetResultMsg(v string) *DeleteImageReposcanstrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteImageReposcanstrategyResponse) SetSuccess(v bool) *DeleteImageReposcanstrategyResponse {
	s.Success = &v
	return s
}

type UpdateImageReposcanstrategyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 策略ID
	StrategyId *string `json:"strategy_id,omitempty" xml:"strategy_id,omitempty" require:"true"`
	// 项目列表
	Projects []*string `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
	// 仓库列表
	Repositories []*string `json:"repositories,omitempty" xml:"repositories,omitempty" type:"Repeated"`
	// 镜像开始时间
	ImageBeginTime *string `json:"image_begin_time,omitempty" xml:"image_begin_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 定时描述
	Crontab *string `json:"crontab,omitempty" xml:"crontab,omitempty"`
}

func (s UpdateImageReposcanstrategyRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateImageReposcanstrategyRequest) GoString() string {
	return s.String()
}

func (s *UpdateImageReposcanstrategyRequest) SetAuthToken(v string) *UpdateImageReposcanstrategyRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateImageReposcanstrategyRequest) SetStrategyId(v string) *UpdateImageReposcanstrategyRequest {
	s.StrategyId = &v
	return s
}

func (s *UpdateImageReposcanstrategyRequest) SetProjects(v []*string) *UpdateImageReposcanstrategyRequest {
	s.Projects = v
	return s
}

func (s *UpdateImageReposcanstrategyRequest) SetRepositories(v []*string) *UpdateImageReposcanstrategyRequest {
	s.Repositories = v
	return s
}

func (s *UpdateImageReposcanstrategyRequest) SetImageBeginTime(v string) *UpdateImageReposcanstrategyRequest {
	s.ImageBeginTime = &v
	return s
}

func (s *UpdateImageReposcanstrategyRequest) SetCrontab(v string) *UpdateImageReposcanstrategyRequest {
	s.Crontab = &v
	return s
}

type UpdateImageReposcanstrategyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateImageReposcanstrategyResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateImageReposcanstrategyResponse) GoString() string {
	return s.String()
}

func (s *UpdateImageReposcanstrategyResponse) SetReqMsgId(v string) *UpdateImageReposcanstrategyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateImageReposcanstrategyResponse) SetResultCode(v string) *UpdateImageReposcanstrategyResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateImageReposcanstrategyResponse) SetResultMsg(v string) *UpdateImageReposcanstrategyResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateImageReposcanstrategyResponse) SetSuccess(v bool) *UpdateImageReposcanstrategyResponse {
	s.Success = &v
	return s
}

type SkipClusterBaselineRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 集群id
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty" require:"true"`
	// 资源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 资源命名空间
	Namespace *string `json:"namespace,omitempty" xml:"namespace,omitempty"`
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 资源类型
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty"`
}

func (s SkipClusterBaselineRequest) String() string {
	return tea.Prettify(s)
}

func (s SkipClusterBaselineRequest) GoString() string {
	return s.String()
}

func (s *SkipClusterBaselineRequest) SetAuthToken(v string) *SkipClusterBaselineRequest {
	s.AuthToken = &v
	return s
}

func (s *SkipClusterBaselineRequest) SetClusterId(v string) *SkipClusterBaselineRequest {
	s.ClusterId = &v
	return s
}

func (s *SkipClusterBaselineRequest) SetName(v string) *SkipClusterBaselineRequest {
	s.Name = &v
	return s
}

func (s *SkipClusterBaselineRequest) SetNamespace(v string) *SkipClusterBaselineRequest {
	s.Namespace = &v
	return s
}

func (s *SkipClusterBaselineRequest) SetResourceId(v string) *SkipClusterBaselineRequest {
	s.ResourceId = &v
	return s
}

func (s *SkipClusterBaselineRequest) SetKind(v string) *SkipClusterBaselineRequest {
	s.Kind = &v
	return s
}

type SkipClusterBaselineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资源id
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
}

func (s SkipClusterBaselineResponse) String() string {
	return tea.Prettify(s)
}

func (s SkipClusterBaselineResponse) GoString() string {
	return s.String()
}

func (s *SkipClusterBaselineResponse) SetReqMsgId(v string) *SkipClusterBaselineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SkipClusterBaselineResponse) SetResultCode(v string) *SkipClusterBaselineResponse {
	s.ResultCode = &v
	return s
}

func (s *SkipClusterBaselineResponse) SetResultMsg(v string) *SkipClusterBaselineResponse {
	s.ResultMsg = &v
	return s
}

func (s *SkipClusterBaselineResponse) SetResourceId(v string) *SkipClusterBaselineResponse {
	s.ResourceId = &v
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
				"sdk_version":      tea.String("1.0.80"),
				"_prod_code":       tea.String("CATRONUS"),
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
 * Description: 创建风险工单/任务
 * Summary: 创建风险工单/任务
 */
func (client *Client) CreateRiskTask(request *CreateRiskTaskRequest) (_result *CreateRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRiskTaskResponse{}
	_body, _err := client.CreateRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建风险工单/任务
 * Summary: 创建风险工单/任务
 */
func (client *Client) CreateRiskTaskEx(request *CreateRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询风险任务列表
 * Summary: 查询风险任务列表
 */
func (client *Client) QueryRiskTasks(request *QueryRiskTasksRequest) (_result *QueryRiskTasksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskTasksResponse{}
	_body, _err := client.QueryRiskTasksEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风险任务列表
 * Summary: 查询风险任务列表
 */
func (client *Client) QueryRiskTasksEx(request *QueryRiskTasksRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskTasksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskTasksResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.tasks.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取风险更单详情
 * Summary: 获取风险更单详情
 */
func (client *Client) GetRiskTask(request *GetRiskTaskRequest) (_result *GetRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRiskTaskResponse{}
	_body, _err := client.GetRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取风险更单详情
 * Summary: 获取风险更单详情
 */
func (client *Client) GetRiskTaskEx(request *GetRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
 * Summary: 更新风险工单
 */
func (client *Client) UpdateRiskTask(request *UpdateRiskTaskRequest) (_result *UpdateRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRiskTaskResponse{}
	_body, _err := client.UpdateRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
 * Summary: 更新风险工单
 */
func (client *Client) UpdateRiskTaskEx(request *UpdateRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认风险工单
 * Summary: 确认风险工单
 */
func (client *Client) ConfirmRiskTask(request *ConfirmRiskTaskRequest) (_result *ConfirmRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmRiskTaskResponse{}
	_body, _err := client.ConfirmRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认风险工单
 * Summary: 确认风险工单
 */
func (client *Client) ConfirmRiskTaskEx(request *ConfirmRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 撤销风险工单
 * Summary: 撤销风险工单
 */
func (client *Client) CancelRiskTask(request *CancelRiskTaskRequest) (_result *CancelRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelRiskTaskResponse{}
	_body, _err := client.CancelRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 撤销风险工单
 * Summary: 撤销风险工单
 */
func (client *Client) CancelRiskTaskEx(request *CancelRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 驳回风险工单
 * Summary: 驳回风险工单
 */
func (client *Client) RefuseRiskTask(request *RefuseRiskTaskRequest) (_result *RefuseRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseRiskTaskResponse{}
	_body, _err := client.RefuseRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 驳回风险工单
 * Summary: 驳回风险工单
 */
func (client *Client) RefuseRiskTaskEx(request *RefuseRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认风险工单修复
 * Summary: 确认风险工单修复
 */
func (client *Client) VerifyRiskTask(request *VerifyRiskTaskRequest) (_result *VerifyRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyRiskTaskResponse{}
	_body, _err := client.VerifyRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认风险工单修复
 * Summary: 确认风险工单修复
 */
func (client *Client) VerifyRiskTaskEx(request *VerifyRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 转派工单负责人
 * Summary: 转派工单负责人
 */
func (client *Client) SendRiskTask(request *SendRiskTaskRequest) (_result *SendRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendRiskTaskResponse{}
	_body, _err := client.SendRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 转派工单负责人
 * Summary: 转派工单负责人
 */
func (client *Client) SendRiskTaskEx(request *SendRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 确认风险工单修复，待安全Owner确认
 * Summary: 确认风险工单修复
 */
func (client *Client) CloseRiskTask(request *CloseRiskTaskRequest) (_result *CloseRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseRiskTaskResponse{}
	_body, _err := client.CloseRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 确认风险工单修复，待安全Owner确认
 * Summary: 确认风险工单修复
 */
func (client *Client) CloseRiskTaskEx(request *CloseRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取个人风险项统计
 * Summary: 获取个人风险项统计
 */
func (client *Client) GetRiskStatistics(request *GetRiskStatisticsRequest) (_result *GetRiskStatisticsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRiskStatisticsResponse{}
	_body, _err := client.GetRiskStatisticsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取个人风险项统计
 * Summary: 获取个人风险项统计
 */
func (client *Client) GetRiskStatisticsEx(request *GetRiskStatisticsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRiskStatisticsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRiskStatisticsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.statistics.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询风险日志审计
 * Summary: 查询风险日志审计
 */
func (client *Client) QueryRiskAudits(request *QueryRiskAuditsRequest) (_result *QueryRiskAuditsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskAuditsResponse{}
	_body, _err := client.QueryRiskAuditsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风险日志审计
 * Summary: 查询风险日志审计
 */
func (client *Client) QueryRiskAuditsEx(request *QueryRiskAuditsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskAuditsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskAuditsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.audits.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建风险解决方案
 * Summary: 创建风险解决方案
 */
func (client *Client) CreateRiskSolution(request *CreateRiskSolutionRequest) (_result *CreateRiskSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRiskSolutionResponse{}
	_body, _err := client.CreateRiskSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建风险解决方案
 * Summary: 创建风险解决方案
 */
func (client *Client) CreateRiskSolutionEx(request *CreateRiskSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRiskSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRiskSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.solution.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询风险解决方案列表
 * Summary: 查询风险解决方案
 */
func (client *Client) QueryRiskSolutions(request *QueryRiskSolutionsRequest) (_result *QueryRiskSolutionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskSolutionsResponse{}
	_body, _err := client.QueryRiskSolutionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风险解决方案列表
 * Summary: 查询风险解决方案
 */
func (client *Client) QueryRiskSolutionsEx(request *QueryRiskSolutionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskSolutionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskSolutionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.solutions.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取风险解决方案详情
 * Summary: 获取风险解决方案
 */
func (client *Client) GetRiskSolution(request *GetRiskSolutionRequest) (_result *GetRiskSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRiskSolutionResponse{}
	_body, _err := client.GetRiskSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取风险解决方案详情
 * Summary: 获取风险解决方案
 */
func (client *Client) GetRiskSolutionEx(request *GetRiskSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRiskSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRiskSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.solution.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新风险解决方案
 * Summary: 更新风险解决方案
 */
func (client *Client) UpdateRiskSolution(request *UpdateRiskSolutionRequest) (_result *UpdateRiskSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRiskSolutionResponse{}
	_body, _err := client.UpdateRiskSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新风险解决方案
 * Summary: 更新风险解决方案
 */
func (client *Client) UpdateRiskSolutionEx(request *UpdateRiskSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRiskSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRiskSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.solution.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除风险解决方案
 * Summary: 删除风险解决方案
 */
func (client *Client) DeleteRiskSolution(request *DeleteRiskSolutionRequest) (_result *DeleteRiskSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRiskSolutionResponse{}
	_body, _err := client.DeleteRiskSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除风险解决方案
 * Summary: 删除风险解决方案
 */
func (client *Client) DeleteRiskSolutionEx(request *DeleteRiskSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRiskSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRiskSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.solution.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纳管目标k8s集群
 * Summary: 导入（纳管）集群
 */
func (client *Client) ImportCluster(request *ImportClusterRequest) (_result *ImportClusterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportClusterResponse{}
	_body, _err := client.ImportClusterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纳管目标k8s集群
 * Summary: 导入（纳管）集群
 */
func (client *Client) ImportClusterEx(request *ImportClusterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportClusterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportClusterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 手动新增集群
 * Summary: 手动新增集群
 */
func (client *Client) AddCluster(request *AddClusterRequest) (_result *AddClusterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddClusterResponse{}
	_body, _err := client.AddClusterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 手动新增集群
 * Summary: 手动新增集群
 */
func (client *Client) AddClusterEx(request *AddClusterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddClusterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddClusterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询集群
 * Summary: 查询集群
 */
func (client *Client) QueryCluster(request *QueryClusterRequest) (_result *QueryClusterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterResponse{}
	_body, _err := client.QueryClusterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询集群
 * Summary: 查询集群
 */
func (client *Client) QueryClusterEx(request *QueryClusterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询集群namespace
 * Summary: 查询集群namespace
 */
func (client *Client) QueryClusterNamespace(request *QueryClusterNamespaceRequest) (_result *QueryClusterNamespaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterNamespaceResponse{}
	_body, _err := client.QueryClusterNamespaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询集群namespace
 * Summary: 查询集群namespace
 */
func (client *Client) QueryClusterNamespaceEx(request *QueryClusterNamespaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterNamespaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterNamespaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.namespace.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解绑集群
 * Summary: 解绑集群
 */
func (client *Client) ReclaimCluster(request *ReclaimClusterRequest) (_result *ReclaimClusterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReclaimClusterResponse{}
	_body, _err := client.ReclaimClusterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解绑集群
 * Summary: 解绑集群
 */
func (client *Client) ReclaimClusterEx(request *ReclaimClusterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReclaimClusterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReclaimClusterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.reclaim"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取集群安全简报列表
 * Summary: 获取集群安全简报列表
 */
func (client *Client) QueryClusterBrief(request *QueryClusterBriefRequest) (_result *QueryClusterBriefResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterBriefResponse{}
	_body, _err := client.QueryClusterBriefEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取集群安全简报列表
 * Summary: 获取集群安全简报列表
 */
func (client *Client) QueryClusterBriefEx(request *QueryClusterBriefRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterBriefResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterBriefResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.brief.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取默认策略
 * Summary: 获取默认策略
 */
func (client *Client) GetStrategyDefault(request *GetStrategyDefaultRequest) (_result *GetStrategyDefaultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetStrategyDefaultResponse{}
	_body, _err := client.GetStrategyDefaultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取默认策略
 * Summary: 获取默认策略
 */
func (client *Client) GetStrategyDefaultEx(request *GetStrategyDefaultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetStrategyDefaultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetStrategyDefaultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.strategy.default.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置安全策略
 * Summary: 设置安全策略
 */
func (client *Client) AddStrategy(request *AddStrategyRequest) (_result *AddStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddStrategyResponse{}
	_body, _err := client.AddStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设置安全策略
 * Summary: 设置安全策略
 */
func (client *Client) AddStrategyEx(request *AddStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.strategy.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定集群
 * Summary: 绑定集群
 */
func (client *Client) BindStrategy(request *BindStrategyRequest) (_result *BindStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindStrategyResponse{}
	_body, _err := client.BindStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定集群
 * Summary: 绑定集群
 */
func (client *Client) BindStrategyEx(request *BindStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.strategy.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险列表
 * Summary: 风险列表
 */
func (client *Client) QueryRisks(request *QueryRisksRequest) (_result *QueryRisksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRisksResponse{}
	_body, _err := client.QueryRisksEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险列表
 * Summary: 风险列表
 */
func (client *Client) QueryRisksEx(request *QueryRisksRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRisksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRisksResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risks.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新策略
 * Summary: 更新策略
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
 * Description: 更新策略
 * Summary: 更新策略
 */
func (client *Client) UpdateStrategyEx(request *UpdateStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.strategy.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 拉策略列表
 * Summary: 拉策略列表
 */
func (client *Client) QueryStrategy(request *QueryStrategyRequest) (_result *QueryStrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStrategyResponse{}
	_body, _err := client.QueryStrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 拉策略列表
 * Summary: 拉策略列表
 */
func (client *Client) QueryStrategyEx(request *QueryStrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.strategy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险任务延期
 * Summary: 风险任务延期
 */
func (client *Client) ScaleRiskTask(request *ScaleRiskTaskRequest) (_result *ScaleRiskTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ScaleRiskTaskResponse{}
	_body, _err := client.ScaleRiskTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险任务延期
 * Summary: 风险任务延期
 */
func (client *Client) ScaleRiskTaskEx(request *ScaleRiskTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ScaleRiskTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ScaleRiskTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.risk.task.scale"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询集群镜像列表
 * Summary: 查询集群镜像列表
 */
func (client *Client) ListClusterImages(request *ListClusterImagesRequest) (_result *ListClusterImagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListClusterImagesResponse{}
	_body, _err := client.ListClusterImagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询集群镜像列表
 * Summary: 查询集群镜像列表
 */
func (client *Client) ListClusterImagesEx(request *ListClusterImagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListClusterImagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListClusterImagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.images.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 主动触发快速扫描
 * Summary: 主动触发快速扫描
 */
func (client *Client) StartClusterQuickscan(request *StartClusterQuickscanRequest) (_result *StartClusterQuickscanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartClusterQuickscanResponse{}
	_body, _err := client.StartClusterQuickscanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 主动触发快速扫描
 * Summary: 主动触发快速扫描
 */
func (client *Client) StartClusterQuickscanEx(request *StartClusterQuickscanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartClusterQuickscanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartClusterQuickscanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.quickscan.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询扫描结果
 * Summary: 查询扫描结果
 */
func (client *Client) QueryClusterScan(request *QueryClusterScanRequest) (_result *QueryClusterScanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterScanResponse{}
	_body, _err := client.QueryClusterScanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询扫描结果
 * Summary: 查询扫描结果
 */
func (client *Client) QueryClusterScanEx(request *QueryClusterScanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterScanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterScanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.scan.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建运行时策略
 * Summary: 创建运行时策略
 */
func (client *Client) CreateRuntimePolicy(request *CreateRuntimePolicyRequest) (_result *CreateRuntimePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRuntimePolicyResponse{}
	_body, _err := client.CreateRuntimePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建运行时策略
 * Summary: 创建运行时策略
 */
func (client *Client) CreateRuntimePolicyEx(request *CreateRuntimePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRuntimePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRuntimePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtime.policy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询运行时策略列表
 * Summary: 查询运行时策略列表
 */
func (client *Client) ListRuntimePolicies(request *ListRuntimePoliciesRequest) (_result *ListRuntimePoliciesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRuntimePoliciesResponse{}
	_body, _err := client.ListRuntimePoliciesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询运行时策略列表
 * Summary: 查询运行时策略列表
 */
func (client *Client) ListRuntimePoliciesEx(request *ListRuntimePoliciesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRuntimePoliciesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRuntimePoliciesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtime.policies.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新运行时策略
 * Summary: 更新运行时策略
 */
func (client *Client) UpdateRuntimePolicy(request *UpdateRuntimePolicyRequest) (_result *UpdateRuntimePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRuntimePolicyResponse{}
	_body, _err := client.UpdateRuntimePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新运行时策略
 * Summary: 更新运行时策略
 */
func (client *Client) UpdateRuntimePolicyEx(request *UpdateRuntimePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRuntimePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRuntimePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtime.policy.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除运行时策略
 * Summary: 删除运行时策略
 */
func (client *Client) DeleteRuntimePolicy(request *DeleteRuntimePolicyRequest) (_result *DeleteRuntimePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRuntimePolicyResponse{}
	_body, _err := client.DeleteRuntimePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除运行时策略
 * Summary: 删除运行时策略
 */
func (client *Client) DeleteRuntimePolicyEx(request *DeleteRuntimePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRuntimePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRuntimePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtime.policy.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取运行时策略目标Pods
 * Summary: 获取运行时策略Pods
 */
func (client *Client) ListRuntimepolicyPods(request *ListRuntimepolicyPodsRequest) (_result *ListRuntimepolicyPodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRuntimepolicyPodsResponse{}
	_body, _err := client.ListRuntimepolicyPodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取运行时策略目标Pods
 * Summary: 获取运行时策略Pods
 */
func (client *Client) ListRuntimepolicyPodsEx(request *ListRuntimepolicyPodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRuntimepolicyPodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRuntimepolicyPodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtimepolicy.pods.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取运行时策略Nodes
 * Summary: 获取运行时策略Nodes
 */
func (client *Client) ListRuntimepolicyNodes(request *ListRuntimepolicyNodesRequest) (_result *ListRuntimepolicyNodesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRuntimepolicyNodesResponse{}
	_body, _err := client.ListRuntimepolicyNodesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取运行时策略Nodes
 * Summary: 获取运行时策略Nodes
 */
func (client *Client) ListRuntimepolicyNodesEx(request *ListRuntimepolicyNodesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRuntimepolicyNodesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRuntimepolicyNodesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtimepolicy.nodes.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取运行时策略详情
 * Summary: 获取运行时策略详情
 */
func (client *Client) GetRuntimePolicy(request *GetRuntimePolicyRequest) (_result *GetRuntimePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRuntimePolicyResponse{}
	_body, _err := client.GetRuntimePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取运行时策略详情
 * Summary: 获取运行时策略详情
 */
func (client *Client) GetRuntimePolicyEx(request *GetRuntimePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRuntimePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRuntimePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.runtime.policy.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基线扫描结果查询
 * Summary: 基线扫描结果查询
 */
func (client *Client) QueryClusterBaseline(request *QueryClusterBaselineRequest) (_result *QueryClusterBaselineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryClusterBaselineResponse{}
	_body, _err := client.QueryClusterBaselineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基线扫描结果查询
 * Summary: 基线扫描结果查询
 */
func (client *Client) QueryClusterBaselineEx(request *QueryClusterBaselineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryClusterBaselineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryClusterBaselineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.baseline.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交镜像扫描触发任务
 * Summary: 提交镜像扫描触发任务
 */
func (client *Client) SubmitImagesReposcan(request *SubmitImagesReposcanRequest) (_result *SubmitImagesReposcanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitImagesReposcanResponse{}
	_body, _err := client.SubmitImagesReposcanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交镜像扫描触发任务
 * Summary: 提交镜像扫描触发任务
 */
func (client *Client) SubmitImagesReposcanEx(request *SubmitImagesReposcanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitImagesReposcanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitImagesReposcanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.images.reposcan.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建镜像仓库
 * Summary: 创建镜像仓库
 */
func (client *Client) CreateImageRepo(request *CreateImageRepoRequest) (_result *CreateImageRepoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateImageRepoResponse{}
	_body, _err := client.CreateImageRepoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建镜像仓库
 * Summary: 创建镜像仓库
 */
func (client *Client) CreateImageRepoEx(request *CreateImageRepoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateImageRepoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateImageRepoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repo.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询镜像仓库列表
 * Summary: 查询镜像仓库列表
 */
func (client *Client) QueryImageRepos(request *QueryImageReposRequest) (_result *QueryImageReposResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryImageReposResponse{}
	_body, _err := client.QueryImageReposEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询镜像仓库列表
 * Summary: 查询镜像仓库列表
 */
func (client *Client) QueryImageReposEx(request *QueryImageReposRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryImageReposResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImageReposResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repos.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除镜像仓库
 * Summary: 删除镜像仓库
 */
func (client *Client) DeleteImageRepo(request *DeleteImageRepoRequest) (_result *DeleteImageRepoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteImageRepoResponse{}
	_body, _err := client.DeleteImageRepoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除镜像仓库
 * Summary: 删除镜像仓库
 */
func (client *Client) DeleteImageRepoEx(request *DeleteImageRepoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteImageRepoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteImageRepoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repo.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取镜像漏洞详情地址
 * Summary: 获取镜像漏洞详情地址
 */
func (client *Client) GetImageRiskdetailurl(request *GetImageRiskdetailurlRequest) (_result *GetImageRiskdetailurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetImageRiskdetailurlResponse{}
	_body, _err := client.GetImageRiskdetailurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取镜像漏洞详情地址
 * Summary: 获取镜像漏洞详情地址
 */
func (client *Client) GetImageRiskdetailurlEx(request *GetImageRiskdetailurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetImageRiskdetailurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetImageRiskdetailurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.riskdetailurl.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建镜像仓库扫描策略
 * Summary: 创建镜像仓库扫描策略
 */
func (client *Client) CreateImageReposcanstrategy(request *CreateImageReposcanstrategyRequest) (_result *CreateImageReposcanstrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateImageReposcanstrategyResponse{}
	_body, _err := client.CreateImageReposcanstrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建镜像仓库扫描策略
 * Summary: 创建镜像仓库扫描策略
 */
func (client *Client) CreateImageReposcanstrategyEx(request *CreateImageReposcanstrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateImageReposcanstrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateImageReposcanstrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.reposcanstrategy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询仓库项目列表
 * Summary: 查询仓库项目列表
 */
func (client *Client) QueryImagerepoProjects(request *QueryImagerepoProjectsRequest) (_result *QueryImagerepoProjectsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryImagerepoProjectsResponse{}
	_body, _err := client.QueryImagerepoProjectsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询仓库项目列表
 * Summary: 查询仓库项目列表
 */
func (client *Client) QueryImagerepoProjectsEx(request *QueryImagerepoProjectsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryImagerepoProjectsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImagerepoProjectsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.imagerepo.projects.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询仓库列表
 * Summary: 查询仓库列表
 */
func (client *Client) QueryImagerepoRepositories(request *QueryImagerepoRepositoriesRequest) (_result *QueryImagerepoRepositoriesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryImagerepoRepositoriesResponse{}
	_body, _err := client.QueryImagerepoRepositoriesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询仓库列表
 * Summary: 查询仓库列表
 */
func (client *Client) QueryImagerepoRepositoriesEx(request *QueryImagerepoRepositoriesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryImagerepoRepositoriesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImagerepoRepositoriesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.imagerepo.repositories.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新镜像仓库
 * Summary: 更新镜像仓库
 */
func (client *Client) UpdateImageRepo(request *UpdateImageRepoRequest) (_result *UpdateImageRepoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateImageRepoResponse{}
	_body, _err := client.UpdateImageRepoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新镜像仓库
 * Summary: 更新镜像仓库
 */
func (client *Client) UpdateImageRepoEx(request *UpdateImageRepoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateImageRepoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateImageRepoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repo.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取镜像仓库详情
 * Summary: 获取镜像仓库详情
 */
func (client *Client) GetImageRepo(request *GetImageRepoRequest) (_result *GetImageRepoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetImageRepoResponse{}
	_body, _err := client.GetImageRepoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取镜像仓库详情
 * Summary: 获取镜像仓库详情
 */
func (client *Client) GetImageRepoEx(request *GetImageRepoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetImageRepoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetImageRepoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验仓库配置
 * Summary: 校验仓库配置
 */
func (client *Client) VerifyImageRepo(request *VerifyImageRepoRequest) (_result *VerifyImageRepoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyImageRepoResponse{}
	_body, _err := client.VerifyImageRepoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验仓库配置
 * Summary: 校验仓库配置
 */
func (client *Client) VerifyImageRepoEx(request *VerifyImageRepoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyImageRepoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyImageRepoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.repo.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询镜像扫描策略
 * Summary: 查询镜像扫描策略
 */
func (client *Client) QueryImageReposcanstrategies(request *QueryImageReposcanstrategiesRequest) (_result *QueryImageReposcanstrategiesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryImageReposcanstrategiesResponse{}
	_body, _err := client.QueryImageReposcanstrategiesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询镜像扫描策略
 * Summary: 查询镜像扫描策略
 */
func (client *Client) QueryImageReposcanstrategiesEx(request *QueryImageReposcanstrategiesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryImageReposcanstrategiesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryImageReposcanstrategiesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.reposcanstrategies.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除镜像扫描策略
 * Summary: 删除镜像扫描策略
 */
func (client *Client) DeleteImageReposcanstrategy(request *DeleteImageReposcanstrategyRequest) (_result *DeleteImageReposcanstrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteImageReposcanstrategyResponse{}
	_body, _err := client.DeleteImageReposcanstrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除镜像扫描策略
 * Summary: 删除镜像扫描策略
 */
func (client *Client) DeleteImageReposcanstrategyEx(request *DeleteImageReposcanstrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteImageReposcanstrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteImageReposcanstrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.reposcanstrategy.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新镜像仓库扫描策略
 * Summary: 更新镜像仓库扫描策略
 */
func (client *Client) UpdateImageReposcanstrategy(request *UpdateImageReposcanstrategyRequest) (_result *UpdateImageReposcanstrategyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateImageReposcanstrategyResponse{}
	_body, _err := client.UpdateImageReposcanstrategyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新镜像仓库扫描策略
 * Summary: 更新镜像仓库扫描策略
 */
func (client *Client) UpdateImageReposcanstrategyEx(request *UpdateImageReposcanstrategyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateImageReposcanstrategyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateImageReposcanstrategyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.image.reposcanstrategy.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 忽略某个baseline风险
 * Summary: 忽略某个baseline风险
 */
func (client *Client) SkipClusterBaseline(request *SkipClusterBaselineRequest) (_result *SkipClusterBaselineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SkipClusterBaselineResponse{}
	_body, _err := client.SkipClusterBaselineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 忽略某个baseline风险
 * Summary: 忽略某个baseline风险
 */
func (client *Client) SkipClusterBaselineEx(request *SkipClusterBaselineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SkipClusterBaselineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SkipClusterBaselineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.catronus.cluster.baseline.skip"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
