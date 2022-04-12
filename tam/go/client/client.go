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

// 附件上传
type UploadRequest struct {
	// 文件流/文件地址
	Stream *string `json:"stream,omitempty" xml:"stream,omitempty" require:"true"`
	// 文件名称
	Filename *string `json:"filename,omitempty" xml:"filename,omitempty" require:"true"`
	// 内外工号
	User *string `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 附件的关联对象类型
	TargetType *string `json:"target_type,omitempty" xml:"target_type,omitempty" require:"true"`
	// 附件的关联对象ID
	TargetId *int64 `json:"target_id,omitempty" xml:"target_id,omitempty" require:"true"`
}

func (s UploadRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadRequest) GoString() string {
	return s.String()
}

func (s *UploadRequest) SetStream(v string) *UploadRequest {
	s.Stream = &v
	return s
}

func (s *UploadRequest) SetFilename(v string) *UploadRequest {
	s.Filename = &v
	return s
}

func (s *UploadRequest) SetUser(v string) *UploadRequest {
	s.User = &v
	return s
}

func (s *UploadRequest) SetTargetType(v string) *UploadRequest {
	s.TargetType = &v
	return s
}

func (s *UploadRequest) SetTargetId(v int64) *UploadRequest {
	s.TargetId = &v
	return s
}

// 返回结果
type ResultMap struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ResultMap) String() string {
	return tea.Prettify(s)
}

func (s ResultMap) GoString() string {
	return s.String()
}

func (s *ResultMap) SetName(v string) *ResultMap {
	s.Name = &v
	return s
}

func (s *ResultMap) SetValue(v string) *ResultMap {
	s.Value = &v
	return s
}

// ACES系统接收的项目信息
type AcesProject struct {
	// 项目id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 客户名称
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 产品线
	ProjectLine *string `json:"project_line,omitempty" xml:"project_line,omitempty"`
	// 业务线
	WorkLine *string `json:"work_line,omitempty" xml:"work_line,omitempty"`
	// 业务分类
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 项目大阶段
	ProjectBigStage *string `json:"project_big_stage,omitempty" xml:"project_big_stage,omitempty"`
	// 转维状态
	OpStatus *string `json:"op_status,omitempty" xml:"op_status,omitempty"`
	// 交付阶段
	Deliver *string `json:"deliver,omitempty" xml:"deliver,omitempty"`
	// 是否售后
	AfterSale *bool `json:"after_sale,omitempty" xml:"after_sale,omitempty"`
}

func (s AcesProject) String() string {
	return tea.Prettify(s)
}

func (s AcesProject) GoString() string {
	return s.String()
}

func (s *AcesProject) SetProjectId(v string) *AcesProject {
	s.ProjectId = &v
	return s
}

func (s *AcesProject) SetProjectName(v string) *AcesProject {
	s.ProjectName = &v
	return s
}

func (s *AcesProject) SetCustomerId(v string) *AcesProject {
	s.CustomerId = &v
	return s
}

func (s *AcesProject) SetCustomerName(v string) *AcesProject {
	s.CustomerName = &v
	return s
}

func (s *AcesProject) SetProjectLine(v string) *AcesProject {
	s.ProjectLine = &v
	return s
}

func (s *AcesProject) SetWorkLine(v string) *AcesProject {
	s.WorkLine = &v
	return s
}

func (s *AcesProject) SetBizType(v string) *AcesProject {
	s.BizType = &v
	return s
}

func (s *AcesProject) SetProjectBigStage(v string) *AcesProject {
	s.ProjectBigStage = &v
	return s
}

func (s *AcesProject) SetOpStatus(v string) *AcesProject {
	s.OpStatus = &v
	return s
}

func (s *AcesProject) SetDeliver(v string) *AcesProject {
	s.Deliver = &v
	return s
}

func (s *AcesProject) SetAfterSale(v bool) *AcesProject {
	s.AfterSale = &v
	return s
}

// 文件集合
type UploadRequestArray struct {
	// 文件数据
	UploadArray *UploadRequest `json:"upload_array,omitempty" xml:"upload_array,omitempty" require:"true"`
}

func (s UploadRequestArray) String() string {
	return tea.Prettify(s)
}

func (s UploadRequestArray) GoString() string {
	return s.String()
}

func (s *UploadRequestArray) SetUploadArray(v *UploadRequest) *UploadRequestArray {
	s.UploadArray = v
	return s
}

// 返回结构
type ResultData struct {
	// data
	Data *ResultMap `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s ResultData) String() string {
	return tea.Prettify(s)
}

func (s ResultData) GoString() string {
	return s.String()
}

func (s *ResultData) SetData(v *ResultMap) *ResultData {
	s.Data = v
	return s
}

// 返回值
type ResultArray struct {
	// 数组
	ResultArray []*string `json:"result_array,omitempty" xml:"result_array,omitempty" require:"true" type:"Repeated"`
}

func (s ResultArray) String() string {
	return tea.Prettify(s)
}

func (s ResultArray) GoString() string {
	return s.String()
}

func (s *ResultArray) SetResultArray(v []*string) *ResultArray {
	s.ResultArray = v
	return s
}

type QueryCustomRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 分页页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 分页长度，最大不超过50
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"50" minimum:"10"`
	// 项目id，非必填；可通过项目id查询单个项目
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s QueryCustomRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomRequest) SetAuthToken(v string) *QueryCustomRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomRequest) SetPageNo(v int64) *QueryCustomRequest {
	s.PageNo = &v
	return s
}

func (s *QueryCustomRequest) SetPageSize(v int64) *QueryCustomRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCustomRequest) SetProjectId(v string) *QueryCustomRequest {
	s.ProjectId = &v
	return s
}

type QueryCustomResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用结果是否成功标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 项目数组
	Data []*AcesProject `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 项目总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryCustomResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomResponse) SetReqMsgId(v string) *QueryCustomResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomResponse) SetResultCode(v string) *QueryCustomResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomResponse) SetResultMsg(v string) *QueryCustomResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomResponse) SetSuccess(v bool) *QueryCustomResponse {
	s.Success = &v
	return s
}

func (s *QueryCustomResponse) SetData(v []*AcesProject) *QueryCustomResponse {
	s.Data = v
	return s
}

func (s *QueryCustomResponse) SetTotal(v int64) *QueryCustomResponse {
	s.Total = &v
	return s
}

type SaveAoneRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品线
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 问题类型
	IssueType *string `json:"issue_type,omitempty" xml:"issue_type,omitempty" require:"true"`
	// 期望日期
	ExpectedAt *string `json:"expected_at,omitempty" xml:"expected_at,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建者的工号
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 解决者/指派者的工号
	AssignedTo *string `json:"assigned_to,omitempty" xml:"assigned_to,omitempty" require:"true"`
	// 标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 跟踪者的工号
	WatcherUsers []*string `json:"watcher_users,omitempty" xml:"watcher_users,omitempty" require:"true" type:"Repeated"`
	// 优先级
	PriorityId *int64 `json:"priority_id,omitempty" xml:"priority_id,omitempty" require:"true"`
}

func (s SaveAoneRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneRequest) GoString() string {
	return s.String()
}

func (s *SaveAoneRequest) SetAuthToken(v string) *SaveAoneRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveAoneRequest) SetProductLine(v string) *SaveAoneRequest {
	s.ProductLine = &v
	return s
}

func (s *SaveAoneRequest) SetProductName(v string) *SaveAoneRequest {
	s.ProductName = &v
	return s
}

func (s *SaveAoneRequest) SetIssueType(v string) *SaveAoneRequest {
	s.IssueType = &v
	return s
}

func (s *SaveAoneRequest) SetExpectedAt(v string) *SaveAoneRequest {
	s.ExpectedAt = &v
	return s
}

func (s *SaveAoneRequest) SetAuthor(v string) *SaveAoneRequest {
	s.Author = &v
	return s
}

func (s *SaveAoneRequest) SetAssignedTo(v string) *SaveAoneRequest {
	s.AssignedTo = &v
	return s
}

func (s *SaveAoneRequest) SetSubject(v string) *SaveAoneRequest {
	s.Subject = &v
	return s
}

func (s *SaveAoneRequest) SetDescription(v string) *SaveAoneRequest {
	s.Description = &v
	return s
}

func (s *SaveAoneRequest) SetWatcherUsers(v []*string) *SaveAoneRequest {
	s.WatcherUsers = v
	return s
}

func (s *SaveAoneRequest) SetPriorityId(v int64) *SaveAoneRequest {
	s.PriorityId = &v
	return s
}

type SaveAoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SaveAoneResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneResponse) GoString() string {
	return s.String()
}

func (s *SaveAoneResponse) SetReqMsgId(v string) *SaveAoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveAoneResponse) SetResultCode(v string) *SaveAoneResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveAoneResponse) SetResultMsg(v string) *SaveAoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveAoneResponse) SetResult(v string) *SaveAoneResponse {
	s.Result = &v
	return s
}

type QueryAoneRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 项目id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s QueryAoneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAoneRequest) GoString() string {
	return s.String()
}

func (s *QueryAoneRequest) SetAuthToken(v string) *QueryAoneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAoneRequest) SetId(v int64) *QueryAoneRequest {
	s.Id = &v
	return s
}

type QueryAoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAoneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAoneResponse) GoString() string {
	return s.String()
}

func (s *QueryAoneResponse) SetReqMsgId(v string) *QueryAoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAoneResponse) SetResultCode(v string) *QueryAoneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAoneResponse) SetResultMsg(v string) *QueryAoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAoneResponse) SetData(v string) *QueryAoneResponse {
	s.Data = &v
	return s
}

type SaveAoneNeedsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品线
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 问题类型
	IssueType *string `json:"issue_type,omitempty" xml:"issue_type,omitempty" require:"true"`
	// 期望日期
	ExpectedAt *string `json:"expected_at,omitempty" xml:"expected_at,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建者的工号
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 解决者/指派者的工号
	AssignedTo *string `json:"assigned_to,omitempty" xml:"assigned_to,omitempty" require:"true"`
	// 标题
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 跟踪者的工号
	WatcherUsers []*string `json:"watcher_users,omitempty" xml:"watcher_users,omitempty" require:"true" type:"Repeated"`
	// 优先级
	PriorityId *int64 `json:"priority_id,omitempty" xml:"priority_id,omitempty" require:"true"`
	// 上传文件集合
	Uploadlist *UploadRequestArray `json:"uploadlist,omitempty" xml:"uploadlist,omitempty"`
}

func (s SaveAoneNeedsRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneNeedsRequest) GoString() string {
	return s.String()
}

func (s *SaveAoneNeedsRequest) SetAuthToken(v string) *SaveAoneNeedsRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetProductLine(v string) *SaveAoneNeedsRequest {
	s.ProductLine = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetProductName(v string) *SaveAoneNeedsRequest {
	s.ProductName = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetIssueType(v string) *SaveAoneNeedsRequest {
	s.IssueType = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetExpectedAt(v string) *SaveAoneNeedsRequest {
	s.ExpectedAt = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetAuthor(v string) *SaveAoneNeedsRequest {
	s.Author = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetAssignedTo(v string) *SaveAoneNeedsRequest {
	s.AssignedTo = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetSubject(v string) *SaveAoneNeedsRequest {
	s.Subject = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetDescription(v string) *SaveAoneNeedsRequest {
	s.Description = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetWatcherUsers(v []*string) *SaveAoneNeedsRequest {
	s.WatcherUsers = v
	return s
}

func (s *SaveAoneNeedsRequest) SetPriorityId(v int64) *SaveAoneNeedsRequest {
	s.PriorityId = &v
	return s
}

func (s *SaveAoneNeedsRequest) SetUploadlist(v *UploadRequestArray) *SaveAoneNeedsRequest {
	s.Uploadlist = v
	return s
}

type SaveAoneNeedsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s SaveAoneNeedsResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveAoneNeedsResponse) GoString() string {
	return s.String()
}

func (s *SaveAoneNeedsResponse) SetReqMsgId(v string) *SaveAoneNeedsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveAoneNeedsResponse) SetResultCode(v string) *SaveAoneNeedsResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveAoneNeedsResponse) SetResultMsg(v string) *SaveAoneNeedsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveAoneNeedsResponse) SetResult(v string) *SaveAoneNeedsResponse {
	s.Result = &v
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
				"sdk_version":      tea.String("1.0.18"),
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
 * Description: 查询售后中心项目信息
 * Summary: 查询售后中心项目信息
 */
func (client *Client) QueryCustom(request *QueryCustomRequest) (_result *QueryCustomResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomResponse{}
	_body, _err := client.QueryCustomEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询售后中心项目信息
 * Summary: 查询售后中心项目信息
 */
func (client *Client) QueryCustomEx(request *QueryCustomRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.custom.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交到aone
 * Summary: 提交到aone
 */
func (client *Client) SaveAone(request *SaveAoneRequest) (_result *SaveAoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveAoneResponse{}
	_body, _err := client.SaveAoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交到aone
 * Summary: 提交到aone
 */
func (client *Client) SaveAoneEx(request *SaveAoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.aone.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询aone详情
 * Summary: 查询aone详情
 */
func (client *Client) QueryAone(request *QueryAoneRequest) (_result *QueryAoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAoneResponse{}
	_body, _err := client.QueryAoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询aone详情
 * Summary: 查询aone详情
 */
func (client *Client) QueryAoneEx(request *QueryAoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.aone.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交客户项目需求
 * Summary: 提交项目需求
 */
func (client *Client) SaveAoneNeeds(request *SaveAoneNeedsRequest) (_result *SaveAoneNeedsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveAoneNeedsResponse{}
	_body, _err := client.SaveAoneNeedsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交客户项目需求
 * Summary: 提交项目需求
 */
func (client *Client) SaveAoneNeedsEx(request *SaveAoneNeedsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAoneNeedsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAoneNeedsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.tam.aone.needs.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
