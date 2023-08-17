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

// MapObject
type MapObject struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s MapObject) String() string {
	return tea.Prettify(s)
}

func (s MapObject) GoString() string {
	return s.String()
}

func (s *MapObject) SetKey(v string) *MapObject {
	s.Key = &v
	return s
}

func (s *MapObject) SetValue(v string) *MapObject {
	s.Value = &v
	return s
}

// TaskTemplateOptionConfig
type TaskTemplateOptionConfig struct {
	// defaultresult
	Defaultresult *string `json:"defaultresult,omitempty" xml:"defaultresult,omitempty" require:"true"`
	// rule
	Rule *string `json:"rule,omitempty" xml:"rule,omitempty"`
	// 预制选项，针对填空题的输入题目
	Preoptions []*string `json:"preoptions,omitempty" xml:"preoptions,omitempty" type:"Repeated"`
}

func (s TaskTemplateOptionConfig) String() string {
	return tea.Prettify(s)
}

func (s TaskTemplateOptionConfig) GoString() string {
	return s.String()
}

func (s *TaskTemplateOptionConfig) SetDefaultresult(v string) *TaskTemplateOptionConfig {
	s.Defaultresult = &v
	return s
}

func (s *TaskTemplateOptionConfig) SetRule(v string) *TaskTemplateOptionConfig {
	s.Rule = &v
	return s
}

func (s *TaskTemplateOptionConfig) SetPreoptions(v []*string) *TaskTemplateOptionConfig {
	s.Preoptions = v
	return s
}

// Groups
type Groups struct {
	// groupid
	Groupid *string `json:"groupid,omitempty" xml:"groupid,omitempty"`
	// groupname
	Groupname *string `json:"groupname,omitempty" xml:"groupname,omitempty"`
}

func (s Groups) String() string {
	return tea.Prettify(s)
}

func (s Groups) GoString() string {
	return s.String()
}

func (s *Groups) SetGroupid(v string) *Groups {
	s.Groupid = &v
	return s
}

func (s *Groups) SetGroupname(v string) *Groups {
	s.Groupname = &v
	return s
}

// 模板选项配置映射
type TemplateOptionMap struct {
	// Map<String, TaskTemplateOptionConfig> templateOptionMap中的key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// TaskTemplateOptionConfig
	Value *TaskTemplateOptionConfig `json:"value,omitempty" xml:"value,omitempty"`
}

func (s TemplateOptionMap) String() string {
	return tea.Prettify(s)
}

func (s TemplateOptionMap) GoString() string {
	return s.String()
}

func (s *TemplateOptionMap) SetKey(v string) *TemplateOptionMap {
	s.Key = &v
	return s
}

func (s *TemplateOptionMap) SetValue(v *TaskTemplateOptionConfig) *TemplateOptionMap {
	s.Value = v
	return s
}

// Exif
type Exif struct {
	// exif
	Exif []*MapObject `json:"exif,omitempty" xml:"exif,omitempty" require:"true" type:"Repeated"`
}

func (s Exif) String() string {
	return tea.Prettify(s)
}

func (s Exif) GoString() string {
	return s.String()
}

func (s *Exif) SetExif(v []*MapObject) *Exif {
	s.Exif = v
	return s
}

// 添加用户至租户
type User struct {
	// 接入标注系统的用户ID
	Accountno *string `json:"accountno,omitempty" xml:"accountno,omitempty"`
	// 用户名称
	Username *string `json:"username,omitempty" xml:"username,omitempty"`
	// 用户来源
	Accountsource *string `json:"accountsource,omitempty" xml:"accountsource,omitempty"`
	// UserId
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty"`
}

func (s User) String() string {
	return tea.Prettify(s)
}

func (s User) GoString() string {
	return s.String()
}

func (s *User) SetAccountno(v string) *User {
	s.Accountno = &v
	return s
}

func (s *User) SetUsername(v string) *User {
	s.Username = &v
	return s
}

func (s *User) SetAccountsource(v string) *User {
	s.Accountsource = &v
	return s
}

func (s *User) SetUserid(v string) *User {
	s.Userid = &v
	return s
}

// 任务管理员列表
type Admins struct {
	// 管理员列表
	Users []*User `json:"users,omitempty" xml:"users,omitempty" type:"Repeated"`
	// 组ID
	Groups []*Groups `json:"groups,omitempty" xml:"groups,omitempty" type:"Repeated"`
}

func (s Admins) String() string {
	return tea.Prettify(s)
}

func (s Admins) GoString() string {
	return s.String()
}

func (s *Admins) SetUsers(v []*User) *Admins {
	s.Users = v
	return s
}

func (s *Admins) SetGroups(v []*Groups) *Admins {
	s.Groups = v
	return s
}

// DownloadMarkResult
type DownloadMarkResult struct {
	// TaskId
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
	// RunInstId
	Runinstid *string `json:"runinstid,omitempty" xml:"runinstid,omitempty"`
	// msgid
	Msgid *string `json:"msgid,omitempty" xml:"msgid,omitempty"`
}

func (s DownloadMarkResult) String() string {
	return tea.Prettify(s)
}

func (s DownloadMarkResult) GoString() string {
	return s.String()
}

func (s *DownloadMarkResult) SetTaskid(v string) *DownloadMarkResult {
	s.Taskid = &v
	return s
}

func (s *DownloadMarkResult) SetRuninstid(v string) *DownloadMarkResult {
	s.Runinstid = &v
	return s
}

func (s *DownloadMarkResult) SetMsgid(v string) *DownloadMarkResult {
	s.Msgid = &v
	return s
}

// 标注工作流，私有化项目只用到 标注MARK、质检CHECK 这两个节点
type ITagTaskWorkflowConfig struct {
	// 标注阶段
	Nodename *string `json:"nodename,omitempty" xml:"nodename,omitempty"`
	// 标注人员列表
	Users []*User `json:"users,omitempty" xml:"users,omitempty" type:"Repeated"`
	// 分组
	Groups []*Groups `json:"groups,omitempty" xml:"groups,omitempty" type:"Repeated"`
	// 扩展参数，例如质检抽样的比例，0~100 %
	Exif *Exif `json:"exif,omitempty" xml:"exif,omitempty"`
}

func (s ITagTaskWorkflowConfig) String() string {
	return tea.Prettify(s)
}

func (s ITagTaskWorkflowConfig) GoString() string {
	return s.String()
}

func (s *ITagTaskWorkflowConfig) SetNodename(v string) *ITagTaskWorkflowConfig {
	s.Nodename = &v
	return s
}

func (s *ITagTaskWorkflowConfig) SetUsers(v []*User) *ITagTaskWorkflowConfig {
	s.Users = v
	return s
}

func (s *ITagTaskWorkflowConfig) SetGroups(v []*Groups) *ITagTaskWorkflowConfig {
	s.Groups = v
	return s
}

func (s *ITagTaskWorkflowConfig) SetExif(v *Exif) *ITagTaskWorkflowConfig {
	s.Exif = v
	return s
}

// 模板的可定制部分
type TaskTemplateConfig struct {
	// templateoptionmap
	Templateoptionmap *TemplateOptionMap `json:"templateoptionmap,omitempty" xml:"templateoptionmap,omitempty" require:"true"`
}

func (s TaskTemplateConfig) String() string {
	return tea.Prettify(s)
}

func (s TaskTemplateConfig) GoString() string {
	return s.String()
}

func (s *TaskTemplateConfig) SetTemplateoptionmap(v *TemplateOptionMap) *TaskTemplateConfig {
	s.Templateoptionmap = v
	return s
}

// 任务使用的数据集
type DatasetProxyRelations struct {
	// 来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// iTAG数据集的ID
	Datasetid *string `json:"datasetid,omitempty" xml:"datasetid,omitempty"`
	// 标注类型
	Datasettype *string `json:"datasettype,omitempty" xml:"datasettype,omitempty"`
	// SourceBizId
	Sourcebizid *string `json:"sourcebizid,omitempty" xml:"sourcebizid,omitempty"`
}

func (s DatasetProxyRelations) String() string {
	return tea.Prettify(s)
}

func (s DatasetProxyRelations) GoString() string {
	return s.String()
}

func (s *DatasetProxyRelations) SetSource(v string) *DatasetProxyRelations {
	s.Source = &v
	return s
}

func (s *DatasetProxyRelations) SetDatasetid(v string) *DatasetProxyRelations {
	s.Datasetid = &v
	return s
}

func (s *DatasetProxyRelations) SetDatasettype(v string) *DatasetProxyRelations {
	s.Datasettype = &v
	return s
}

func (s *DatasetProxyRelations) SetSourcebizid(v string) *DatasetProxyRelations {
	s.Sourcebizid = &v
	return s
}

// ProcessResult
type ProcessResult struct {
	// Node
	Node *string `json:"node,omitempty" xml:"node,omitempty"`
	// totalitem
	Totalitem *int64 `json:"totalitem,omitempty" xml:"totalitem,omitempty"`
	// finisheditem
	Finisheditem *int64 `json:"finisheditem,omitempty" xml:"finisheditem,omitempty"`
	// TotalSubTask
	Totalsubtask *int64 `json:"totalsubtask,omitempty" xml:"totalsubtask,omitempty"`
	// FinishedSubTask
	Finishedsubtask *int64 `json:"finishedsubtask,omitempty" xml:"finishedsubtask,omitempty"`
}

func (s ProcessResult) String() string {
	return tea.Prettify(s)
}

func (s ProcessResult) GoString() string {
	return s.String()
}

func (s *ProcessResult) SetNode(v string) *ProcessResult {
	s.Node = &v
	return s
}

func (s *ProcessResult) SetTotalitem(v int64) *ProcessResult {
	s.Totalitem = &v
	return s
}

func (s *ProcessResult) SetFinisheditem(v int64) *ProcessResult {
	s.Finisheditem = &v
	return s
}

func (s *ProcessResult) SetTotalsubtask(v int64) *ProcessResult {
	s.Totalsubtask = &v
	return s
}

func (s *ProcessResult) SetFinishedsubtask(v int64) *ProcessResult {
	s.Finishedsubtask = &v
	return s
}

// 轮询导出进度中的RunRet
type RunRet struct {
	// taskid
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
	// subtaskdistdt
	Subtaskdistdt *string `json:"subtaskdistdt,omitempty" xml:"subtaskdistdt,omitempty"`
	// requestid
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// taskname
	Taskname *string `json:"taskname,omitempty" xml:"taskname,omitempty"`
	// msgsenddt
	Msgsenddt *string `json:"msgsenddt,omitempty" xml:"msgsenddt,omitempty"`
	// msgid
	Msgid *string `json:"msgid,omitempty" xml:"msgid,omitempty"`
	// resultlink
	Resultlink *string `json:"resultlink,omitempty" xml:"resultlink,omitempty"`
}

func (s RunRet) String() string {
	return tea.Prettify(s)
}

func (s RunRet) GoString() string {
	return s.String()
}

func (s *RunRet) SetTaskid(v string) *RunRet {
	s.Taskid = &v
	return s
}

func (s *RunRet) SetSubtaskdistdt(v string) *RunRet {
	s.Subtaskdistdt = &v
	return s
}

func (s *RunRet) SetRequestid(v string) *RunRet {
	s.Requestid = &v
	return s
}

func (s *RunRet) SetTaskname(v string) *RunRet {
	s.Taskname = &v
	return s
}

func (s *RunRet) SetMsgsenddt(v string) *RunRet {
	s.Msgsenddt = &v
	return s
}

func (s *RunRet) SetMsgid(v string) *RunRet {
	s.Msgid = &v
	return s
}

func (s *RunRet) SetResultlink(v string) *RunRet {
	s.Resultlink = &v
	return s
}

// 防止客户端因bug而瞬间重复创建多个相同的任务
type BizInfo struct {
	// 业务码
	Bizcode *string `json:"bizcode,omitempty" xml:"bizcode,omitempty"`
	// 可使用时间戳来防止重复
	Bizno *int64 `json:"bizno,omitempty" xml:"bizno,omitempty"`
}

func (s BizInfo) String() string {
	return tea.Prettify(s)
}

func (s BizInfo) GoString() string {
	return s.String()
}

func (s *BizInfo) SetBizcode(v string) *BizInfo {
	s.Bizcode = &v
	return s
}

func (s *BizInfo) SetBizno(v int64) *BizInfo {
	s.Bizno = &v
	return s
}

// AssignConfig
type AssignConfig struct {
	// AVG_SIZE
	Assigntype *string `json:"assigntype,omitempty" xml:"assigntype,omitempty" require:"true"`
	// AssignSubTaskCount
	Assignsubtaskcount *int64 `json:"assignsubtaskcount,omitempty" xml:"assignsubtaskcount,omitempty"`
}

func (s AssignConfig) String() string {
	return tea.Prettify(s)
}

func (s AssignConfig) GoString() string {
	return s.String()
}

func (s *AssignConfig) SetAssigntype(v string) *AssignConfig {
	s.Assigntype = &v
	return s
}

func (s *AssignConfig) SetAssignsubtaskcount(v int64) *AssignConfig {
	s.Assignsubtaskcount = &v
	return s
}

type AuthItagAntitagAcmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 第三方平台用户ID
	Accountno *string `json:"accountno,omitempty" xml:"accountno,omitempty" require:"true"`
	// 用户来源
	Accountsource *string `json:"accountsource,omitempty" xml:"accountsource,omitempty" require:"true"`
}

func (s AuthItagAntitagAcmRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthItagAntitagAcmRequest) GoString() string {
	return s.String()
}

func (s *AuthItagAntitagAcmRequest) SetAuthToken(v string) *AuthItagAntitagAcmRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthItagAntitagAcmRequest) SetProductInstanceId(v string) *AuthItagAntitagAcmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthItagAntitagAcmRequest) SetAccountno(v string) *AuthItagAntitagAcmRequest {
	s.Accountno = &v
	return s
}

func (s *AuthItagAntitagAcmRequest) SetAccountsource(v string) *AuthItagAntitagAcmRequest {
	s.Accountsource = &v
	return s
}

type AuthItagAntitagAcmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息ID
	Reqmsgid *string `json:"reqmsgid,omitempty" xml:"reqmsgid,omitempty"`
	// 结果码
	Resultcode *string `json:"resultcode,omitempty" xml:"resultcode,omitempty"`
	// 结果消息
	Resultmsg *string `json:"resultmsg,omitempty" xml:"resultmsg,omitempty"`
	// 授权码
	Accesstoken *string `json:"accesstoken,omitempty" xml:"accesstoken,omitempty"`
}

func (s AuthItagAntitagAcmResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthItagAntitagAcmResponse) GoString() string {
	return s.String()
}

func (s *AuthItagAntitagAcmResponse) SetReqMsgId(v string) *AuthItagAntitagAcmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetResultCode(v string) *AuthItagAntitagAcmResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetResultMsg(v string) *AuthItagAntitagAcmResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetReqmsgid(v string) *AuthItagAntitagAcmResponse {
	s.Reqmsgid = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetResultcode(v string) *AuthItagAntitagAcmResponse {
	s.Resultcode = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetResultmsg(v string) *AuthItagAntitagAcmResponse {
	s.Resultmsg = &v
	return s
}

func (s *AuthItagAntitagAcmResponse) SetAccesstoken(v string) *AuthItagAntitagAcmResponse {
	s.Accesstoken = &v
	return s
}

type CreateItagAntitagTaskRequestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// taskname
	Taskname *string `json:"taskname,omitempty" xml:"taskname,omitempty"`
	// templateid
	Templateid *string `json:"templateid,omitempty" xml:"templateid,omitempty"`
	// projectid
	Projectid *string `json:"projectid,omitempty" xml:"projectid,omitempty"`
	// AssignConfig
	Assignconfig *AssignConfig `json:"assignconfig,omitempty" xml:"assignconfig,omitempty"`
	// TaskWorkFlow
	Taskworkflow *ITagTaskWorkflowConfig `json:"taskworkflow,omitempty" xml:"taskworkflow,omitempty"`
	// admins
	Admins []*Admins `json:"admins,omitempty" xml:"admins,omitempty" type:"Repeated"`
	// datasetproxyrelations
	Datasetproxyrelations []*DatasetProxyRelations `json:"datasetproxyrelations,omitempty" xml:"datasetproxyrelations,omitempty" type:"Repeated"`
	// bizinfo
	Bizinfo *BizInfo `json:"bizinfo,omitempty" xml:"bizinfo,omitempty"`
	// tasktemplateconfig
	Tasktemplateconfig *TaskTemplateConfig `json:"tasktemplateconfig,omitempty" xml:"tasktemplateconfig,omitempty"`
	// Exif
	Exif *Exif `json:"exif,omitempty" xml:"exif,omitempty"`
	// tntinstid
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty"`
}

func (s CreateItagAntitagTaskRequestRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateItagAntitagTaskRequestRequest) GoString() string {
	return s.String()
}

func (s *CreateItagAntitagTaskRequestRequest) SetAuthToken(v string) *CreateItagAntitagTaskRequestRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetProductInstanceId(v string) *CreateItagAntitagTaskRequestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetTaskname(v string) *CreateItagAntitagTaskRequestRequest {
	s.Taskname = &v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetTemplateid(v string) *CreateItagAntitagTaskRequestRequest {
	s.Templateid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetProjectid(v string) *CreateItagAntitagTaskRequestRequest {
	s.Projectid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetAssignconfig(v *AssignConfig) *CreateItagAntitagTaskRequestRequest {
	s.Assignconfig = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetTaskworkflow(v *ITagTaskWorkflowConfig) *CreateItagAntitagTaskRequestRequest {
	s.Taskworkflow = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetAdmins(v []*Admins) *CreateItagAntitagTaskRequestRequest {
	s.Admins = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetDatasetproxyrelations(v []*DatasetProxyRelations) *CreateItagAntitagTaskRequestRequest {
	s.Datasetproxyrelations = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetBizinfo(v *BizInfo) *CreateItagAntitagTaskRequestRequest {
	s.Bizinfo = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetTasktemplateconfig(v *TaskTemplateConfig) *CreateItagAntitagTaskRequestRequest {
	s.Tasktemplateconfig = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetExif(v *Exif) *CreateItagAntitagTaskRequestRequest {
	s.Exif = v
	return s
}

func (s *CreateItagAntitagTaskRequestRequest) SetTntinstid(v string) *CreateItagAntitagTaskRequestRequest {
	s.Tntinstid = &v
	return s
}

type CreateItagAntitagTaskRequestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// taskId
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
	// flowrunid
	Flowrunid *string `json:"flowrunid,omitempty" xml:"flowrunid,omitempty"`
	// msgid
	Msgid *string `json:"msgid,omitempty" xml:"msgid,omitempty"`
	// slavemsgid
	Slavemsgid *string `json:"slavemsgid,omitempty" xml:"slavemsgid,omitempty"`
	// reftaskid
	Reftaskid *string `json:"reftaskid,omitempty" xml:"reftaskid,omitempty"`
}

func (s CreateItagAntitagTaskRequestResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateItagAntitagTaskRequestResponse) GoString() string {
	return s.String()
}

func (s *CreateItagAntitagTaskRequestResponse) SetReqMsgId(v string) *CreateItagAntitagTaskRequestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetResultCode(v string) *CreateItagAntitagTaskRequestResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetResultMsg(v string) *CreateItagAntitagTaskRequestResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetTaskid(v string) *CreateItagAntitagTaskRequestResponse {
	s.Taskid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetFlowrunid(v string) *CreateItagAntitagTaskRequestResponse {
	s.Flowrunid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetMsgid(v string) *CreateItagAntitagTaskRequestResponse {
	s.Msgid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetSlavemsgid(v string) *CreateItagAntitagTaskRequestResponse {
	s.Slavemsgid = &v
	return s
}

func (s *CreateItagAntitagTaskRequestResponse) SetReftaskid(v string) *CreateItagAntitagTaskRequestResponse {
	s.Reftaskid = &v
	return s
}

type ExportItagAntitagTaskDownloadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// iTAG租户id
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty"`
	// TaskId
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
	// Encode
	Encode *string `json:"encode,omitempty" xml:"encode,omitempty"`
}

func (s ExportItagAntitagTaskDownloadRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportItagAntitagTaskDownloadRequest) GoString() string {
	return s.String()
}

func (s *ExportItagAntitagTaskDownloadRequest) SetAuthToken(v string) *ExportItagAntitagTaskDownloadRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadRequest) SetProductInstanceId(v string) *ExportItagAntitagTaskDownloadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadRequest) SetTntinstid(v string) *ExportItagAntitagTaskDownloadRequest {
	s.Tntinstid = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadRequest) SetTaskid(v string) *ExportItagAntitagTaskDownloadRequest {
	s.Taskid = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadRequest) SetEncode(v string) *ExportItagAntitagTaskDownloadRequest {
	s.Encode = &v
	return s
}

type ExportItagAntitagTaskDownloadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// RequestId
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// Succ
	Succ *string `json:"succ,omitempty" xml:"succ,omitempty"`
	// Code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// Msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// errinfo
	Errinfo *string `json:"errinfo,omitempty" xml:"errinfo,omitempty"`
	// result
	Result *DownloadMarkResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s ExportItagAntitagTaskDownloadResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportItagAntitagTaskDownloadResponse) GoString() string {
	return s.String()
}

func (s *ExportItagAntitagTaskDownloadResponse) SetReqMsgId(v string) *ExportItagAntitagTaskDownloadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetResultCode(v string) *ExportItagAntitagTaskDownloadResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetResultMsg(v string) *ExportItagAntitagTaskDownloadResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetRequestid(v string) *ExportItagAntitagTaskDownloadResponse {
	s.Requestid = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetSucc(v string) *ExportItagAntitagTaskDownloadResponse {
	s.Succ = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetCode(v string) *ExportItagAntitagTaskDownloadResponse {
	s.Code = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetMsg(v string) *ExportItagAntitagTaskDownloadResponse {
	s.Msg = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetErrinfo(v string) *ExportItagAntitagTaskDownloadResponse {
	s.Errinfo = &v
	return s
}

func (s *ExportItagAntitagTaskDownloadResponse) SetResult(v *DownloadMarkResult) *ExportItagAntitagTaskDownloadResponse {
	s.Result = v
	return s
}

type QueryItagAntitagTaskDownloadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// iTAG租户ID
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty"`
	// runinstid
	Runinstid *string `json:"runinstid,omitempty" xml:"runinstid,omitempty"`
	// 任务ID
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
}

func (s QueryItagAntitagTaskDownloadRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryItagAntitagTaskDownloadRequest) GoString() string {
	return s.String()
}

func (s *QueryItagAntitagTaskDownloadRequest) SetAuthToken(v string) *QueryItagAntitagTaskDownloadRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadRequest) SetProductInstanceId(v string) *QueryItagAntitagTaskDownloadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadRequest) SetTntinstid(v string) *QueryItagAntitagTaskDownloadRequest {
	s.Tntinstid = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadRequest) SetRuninstid(v string) *QueryItagAntitagTaskDownloadRequest {
	s.Runinstid = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadRequest) SetTaskid(v string) *QueryItagAntitagTaskDownloadRequest {
	s.Taskid = &v
	return s
}

type QueryItagAntitagTaskDownloadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// requestid
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// succ
	Succ *string `json:"succ,omitempty" xml:"succ,omitempty"`
	// errinfo
	Errinfo *string `json:"errinfo,omitempty" xml:"errinfo,omitempty"`
	// runret
	Runret *RunRet `json:"runret,omitempty" xml:"runret,omitempty"`
}

func (s QueryItagAntitagTaskDownloadResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryItagAntitagTaskDownloadResponse) GoString() string {
	return s.String()
}

func (s *QueryItagAntitagTaskDownloadResponse) SetReqMsgId(v string) *QueryItagAntitagTaskDownloadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetResultCode(v string) *QueryItagAntitagTaskDownloadResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetResultMsg(v string) *QueryItagAntitagTaskDownloadResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetRequestid(v string) *QueryItagAntitagTaskDownloadResponse {
	s.Requestid = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetCode(v string) *QueryItagAntitagTaskDownloadResponse {
	s.Code = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetMsg(v string) *QueryItagAntitagTaskDownloadResponse {
	s.Msg = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetSucc(v string) *QueryItagAntitagTaskDownloadResponse {
	s.Succ = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetErrinfo(v string) *QueryItagAntitagTaskDownloadResponse {
	s.Errinfo = &v
	return s
}

func (s *QueryItagAntitagTaskDownloadResponse) SetRunret(v *RunRet) *QueryItagAntitagTaskDownloadResponse {
	s.Runret = v
	return s
}

type QueryItagAntitagTaskProcessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// TntInstId
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty"`
	// taskid
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
}

func (s QueryItagAntitagTaskProcessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryItagAntitagTaskProcessRequest) GoString() string {
	return s.String()
}

func (s *QueryItagAntitagTaskProcessRequest) SetAuthToken(v string) *QueryItagAntitagTaskProcessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryItagAntitagTaskProcessRequest) SetProductInstanceId(v string) *QueryItagAntitagTaskProcessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryItagAntitagTaskProcessRequest) SetTntinstid(v string) *QueryItagAntitagTaskProcessRequest {
	s.Tntinstid = &v
	return s
}

func (s *QueryItagAntitagTaskProcessRequest) SetTaskid(v string) *QueryItagAntitagTaskProcessRequest {
	s.Taskid = &v
	return s
}

type QueryItagAntitagTaskProcessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// requestid
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// Code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// Msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// succ
	Succ *string `json:"succ,omitempty" xml:"succ,omitempty"`
	// ProcessResult
	Result *ProcessResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryItagAntitagTaskProcessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryItagAntitagTaskProcessResponse) GoString() string {
	return s.String()
}

func (s *QueryItagAntitagTaskProcessResponse) SetReqMsgId(v string) *QueryItagAntitagTaskProcessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetResultCode(v string) *QueryItagAntitagTaskProcessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetResultMsg(v string) *QueryItagAntitagTaskProcessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetRequestid(v string) *QueryItagAntitagTaskProcessResponse {
	s.Requestid = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetCode(v string) *QueryItagAntitagTaskProcessResponse {
	s.Code = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetMsg(v string) *QueryItagAntitagTaskProcessResponse {
	s.Msg = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetSucc(v string) *QueryItagAntitagTaskProcessResponse {
	s.Succ = &v
	return s
}

func (s *QueryItagAntitagTaskProcessResponse) SetResult(v *ProcessResult) *QueryItagAntitagTaskProcessResponse {
	s.Result = v
	return s
}

type RegisterItagAntitagUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 第三方系统用户账号ID
	Accountno *string `json:"accountno,omitempty" xml:"accountno,omitempty" require:"true"`
	// 用户来源
	Accountsource *string `json:"accountsource,omitempty" xml:"accountsource,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 电话
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
}

func (s RegisterItagAntitagUserRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterItagAntitagUserRequest) GoString() string {
	return s.String()
}

func (s *RegisterItagAntitagUserRequest) SetAuthToken(v string) *RegisterItagAntitagUserRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetProductInstanceId(v string) *RegisterItagAntitagUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetName(v string) *RegisterItagAntitagUserRequest {
	s.Name = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetAccountno(v string) *RegisterItagAntitagUserRequest {
	s.Accountno = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetAccountsource(v string) *RegisterItagAntitagUserRequest {
	s.Accountsource = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetEmail(v string) *RegisterItagAntitagUserRequest {
	s.Email = &v
	return s
}

func (s *RegisterItagAntitagUserRequest) SetPhone(v string) *RegisterItagAntitagUserRequest {
	s.Phone = &v
	return s
}

type RegisterItagAntitagUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求ID
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// 结果码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	Errmsg *string `json:"errmsg,omitempty" xml:"errmsg,omitempty"`
	// 结果消息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 标注平台userid
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 结果
	Succ *bool `json:"succ,omitempty" xml:"succ,omitempty"`
}

func (s RegisterItagAntitagUserResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterItagAntitagUserResponse) GoString() string {
	return s.String()
}

func (s *RegisterItagAntitagUserResponse) SetReqMsgId(v string) *RegisterItagAntitagUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetResultCode(v string) *RegisterItagAntitagUserResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetResultMsg(v string) *RegisterItagAntitagUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetRequestid(v string) *RegisterItagAntitagUserResponse {
	s.Requestid = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetCode(v int64) *RegisterItagAntitagUserResponse {
	s.Code = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetErrmsg(v string) *RegisterItagAntitagUserResponse {
	s.Errmsg = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetMsg(v string) *RegisterItagAntitagUserResponse {
	s.Msg = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetResult(v string) *RegisterItagAntitagUserResponse {
	s.Result = &v
	return s
}

func (s *RegisterItagAntitagUserResponse) SetSucc(v bool) *RegisterItagAntitagUserResponse {
	s.Succ = &v
	return s
}

type AddItagAntitagUserTntRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 标注平台的租户ID
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty" require:"true"`
	// 第三方账号
	Accountno *string `json:"accountno,omitempty" xml:"accountno,omitempty" require:"true"`
	// 用户来源
	Accountsource *string `json:"accountsource,omitempty" xml:"accountsource,omitempty" require:"true"`
	// 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
}

func (s AddItagAntitagUserTntRequest) String() string {
	return tea.Prettify(s)
}

func (s AddItagAntitagUserTntRequest) GoString() string {
	return s.String()
}

func (s *AddItagAntitagUserTntRequest) SetAuthToken(v string) *AddItagAntitagUserTntRequest {
	s.AuthToken = &v
	return s
}

func (s *AddItagAntitagUserTntRequest) SetProductInstanceId(v string) *AddItagAntitagUserTntRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddItagAntitagUserTntRequest) SetTntinstid(v string) *AddItagAntitagUserTntRequest {
	s.Tntinstid = &v
	return s
}

func (s *AddItagAntitagUserTntRequest) SetAccountno(v string) *AddItagAntitagUserTntRequest {
	s.Accountno = &v
	return s
}

func (s *AddItagAntitagUserTntRequest) SetAccountsource(v string) *AddItagAntitagUserTntRequest {
	s.Accountsource = &v
	return s
}

func (s *AddItagAntitagUserTntRequest) SetRole(v string) *AddItagAntitagUserTntRequest {
	s.Role = &v
	return s
}

type AddItagAntitagUserTntResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// TntInstId
	Tntinstid *string `json:"tntinstid,omitempty" xml:"tntinstid,omitempty"`
	// 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 用户信息
	Result *User `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AddItagAntitagUserTntResponse) String() string {
	return tea.Prettify(s)
}

func (s AddItagAntitagUserTntResponse) GoString() string {
	return s.String()
}

func (s *AddItagAntitagUserTntResponse) SetReqMsgId(v string) *AddItagAntitagUserTntResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddItagAntitagUserTntResponse) SetResultCode(v string) *AddItagAntitagUserTntResponse {
	s.ResultCode = &v
	return s
}

func (s *AddItagAntitagUserTntResponse) SetResultMsg(v string) *AddItagAntitagUserTntResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddItagAntitagUserTntResponse) SetTntinstid(v string) *AddItagAntitagUserTntResponse {
	s.Tntinstid = &v
	return s
}

func (s *AddItagAntitagUserTntResponse) SetRole(v string) *AddItagAntitagUserTntResponse {
	s.Role = &v
	return s
}

func (s *AddItagAntitagUserTntResponse) SetResult(v *User) *AddItagAntitagUserTntResponse {
	s.Result = v
	return s
}

type CreateItagAntitagTaskJsonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建任务参数，格式为JSON
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
}

func (s CreateItagAntitagTaskJsonRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateItagAntitagTaskJsonRequest) GoString() string {
	return s.String()
}

func (s *CreateItagAntitagTaskJsonRequest) SetAuthToken(v string) *CreateItagAntitagTaskJsonRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateItagAntitagTaskJsonRequest) SetProductInstanceId(v string) *CreateItagAntitagTaskJsonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateItagAntitagTaskJsonRequest) SetParams(v string) *CreateItagAntitagTaskJsonRequest {
	s.Params = &v
	return s
}

type CreateItagAntitagTaskJsonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 消息体
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 请求ID
	Requestid *string `json:"requestid,omitempty" xml:"requestid,omitempty"`
	// 成功标识
	Succ *string `json:"succ,omitempty" xml:"succ,omitempty"`
	// 任务ID
	Taskid *string `json:"taskid,omitempty" xml:"taskid,omitempty"`
}

func (s CreateItagAntitagTaskJsonResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateItagAntitagTaskJsonResponse) GoString() string {
	return s.String()
}

func (s *CreateItagAntitagTaskJsonResponse) SetReqMsgId(v string) *CreateItagAntitagTaskJsonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetResultCode(v string) *CreateItagAntitagTaskJsonResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetResultMsg(v string) *CreateItagAntitagTaskJsonResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetCode(v string) *CreateItagAntitagTaskJsonResponse {
	s.Code = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetMsg(v string) *CreateItagAntitagTaskJsonResponse {
	s.Msg = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetRequestid(v string) *CreateItagAntitagTaskJsonResponse {
	s.Requestid = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetSucc(v string) *CreateItagAntitagTaskJsonResponse {
	s.Succ = &v
	return s
}

func (s *CreateItagAntitagTaskJsonResponse) SetTaskid(v string) *CreateItagAntitagTaskJsonResponse {
	s.Taskid = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_bc907d13969a4eb68852866122b96ffd"),
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
 * Description: 通过标注平台ID获取Token
 * Summary: 获取Token
 */
func (client *Client) AuthItagAntitagAcm(request *AuthItagAntitagAcmRequest) (_result *AuthItagAntitagAcmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthItagAntitagAcmResponse{}
	_body, _err := client.AuthItagAntitagAcmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过标注平台ID获取Token
 * Summary: 获取Token
 */
func (client *Client) AuthItagAntitagAcmEx(request *AuthItagAntitagAcmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthItagAntitagAcmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthItagAntitagAcmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.acm.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建标注任务
 * Summary: 创建标注任务
 */
func (client *Client) CreateItagAntitagTaskRequest(request *CreateItagAntitagTaskRequestRequest) (_result *CreateItagAntitagTaskRequestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateItagAntitagTaskRequestResponse{}
	_body, _err := client.CreateItagAntitagTaskRequestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建标注任务
 * Summary: 创建标注任务
 */
func (client *Client) CreateItagAntitagTaskRequestEx(request *CreateItagAntitagTaskRequestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateItagAntitagTaskRequestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateItagAntitagTaskRequestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.task.request.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 触发数据导出
 * Summary: 触发数据导出
 */
func (client *Client) ExportItagAntitagTaskDownload(request *ExportItagAntitagTaskDownloadRequest) (_result *ExportItagAntitagTaskDownloadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportItagAntitagTaskDownloadResponse{}
	_body, _err := client.ExportItagAntitagTaskDownloadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 触发数据导出
 * Summary: 触发数据导出
 */
func (client *Client) ExportItagAntitagTaskDownloadEx(request *ExportItagAntitagTaskDownloadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportItagAntitagTaskDownloadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportItagAntitagTaskDownloadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.task.download.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 轮询导出进度
 * Summary: 轮询导出进度
 */
func (client *Client) QueryItagAntitagTaskDownload(request *QueryItagAntitagTaskDownloadRequest) (_result *QueryItagAntitagTaskDownloadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryItagAntitagTaskDownloadResponse{}
	_body, _err := client.QueryItagAntitagTaskDownloadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 轮询导出进度
 * Summary: 轮询导出进度
 */
func (client *Client) QueryItagAntitagTaskDownloadEx(request *QueryItagAntitagTaskDownloadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryItagAntitagTaskDownloadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryItagAntitagTaskDownloadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.task.download.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 任务进度查询
 * Summary: 任务进度查询
 */
func (client *Client) QueryItagAntitagTaskProcess(request *QueryItagAntitagTaskProcessRequest) (_result *QueryItagAntitagTaskProcessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryItagAntitagTaskProcessResponse{}
	_body, _err := client.QueryItagAntitagTaskProcessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 任务进度查询
 * Summary: 任务进度查询
 */
func (client *Client) QueryItagAntitagTaskProcessEx(request *QueryItagAntitagTaskProcessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryItagAntitagTaskProcessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryItagAntitagTaskProcessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.task.process.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册用户到标注平台
 * Summary: 注册用户
 */
func (client *Client) RegisterItagAntitagUser(request *RegisterItagAntitagUserRequest) (_result *RegisterItagAntitagUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterItagAntitagUserResponse{}
	_body, _err := client.RegisterItagAntitagUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册用户到标注平台
 * Summary: 注册用户
 */
func (client *Client) RegisterItagAntitagUserEx(request *RegisterItagAntitagUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterItagAntitagUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterItagAntitagUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.user.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加用户到指定租户
 * Summary: 新用户到租户
 */
func (client *Client) AddItagAntitagUserTnt(request *AddItagAntitagUserTntRequest) (_result *AddItagAntitagUserTntResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddItagAntitagUserTntResponse{}
	_body, _err := client.AddItagAntitagUserTntEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加用户到指定租户
 * Summary: 新用户到租户
 */
func (client *Client) AddItagAntitagUserTntEx(request *AddItagAntitagUserTntRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddItagAntitagUserTntResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddItagAntitagUserTntResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.user.tnt.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过json方式创建任务
 * Summary: 创建标注任务json
 */
func (client *Client) CreateItagAntitagTaskJson(request *CreateItagAntitagTaskJsonRequest) (_result *CreateItagAntitagTaskJsonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateItagAntitagTaskJsonResponse{}
	_body, _err := client.CreateItagAntitagTaskJsonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过json方式创建任务
 * Summary: 创建标注任务json
 */
func (client *Client) CreateItagAntitagTaskJsonEx(request *CreateItagAntitagTaskJsonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateItagAntitagTaskJsonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateItagAntitagTaskJsonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("itag.antitag.task.json.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
