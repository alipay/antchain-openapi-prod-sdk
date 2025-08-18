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

// 狗
type Dog struct {
	// 名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"32" minLength:"2"`
	// 年龄
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true" maximum:"100" minimum:"0"`
	// 是否已领养
	IsAdopted *bool `json:"is_adopted,omitempty" xml:"is_adopted,omitempty" require:"true"`
	// 领养时间
	AdoptedDate *string `json:"adopted_date,omitempty" xml:"adopted_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 标记
	Marks []*string `json:"marks,omitempty" xml:"marks,omitempty" type:"Repeated"`
}

func (s Dog) String() string {
	return tea.Prettify(s)
}

func (s Dog) GoString() string {
	return s.String()
}

func (s *Dog) SetName(v string) *Dog {
	s.Name = &v
	return s
}

func (s *Dog) SetAge(v int64) *Dog {
	s.Age = &v
	return s
}

func (s *Dog) SetIsAdopted(v bool) *Dog {
	s.IsAdopted = &v
	return s
}

func (s *Dog) SetAdoptedDate(v string) *Dog {
	s.AdoptedDate = &v
	return s
}

func (s *Dog) SetMarks(v []*string) *Dog {
	s.Marks = v
	return s
}

// 狗狗之家
type DogHome struct {
	// 狗狗成员
	DogMembers []*Dog `json:"dog_members,omitempty" xml:"dog_members,omitempty" require:"true" type:"Repeated"`
	// 狗狗头目
	Leader *Dog `json:"leader,omitempty" xml:"leader,omitempty" require:"true"`
}

func (s DogHome) String() string {
	return tea.Prettify(s)
}

func (s DogHome) GoString() string {
	return s.String()
}

func (s *DogHome) SetDogMembers(v []*Dog) *DogHome {
	s.DogMembers = v
	return s
}

func (s *DogHome) SetLeader(v *Dog) *DogHome {
	s.Leader = v
	return s
}

// aone  返回结构
type ResultList struct {
	// 返回结果
	Result *DogHome `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s ResultList) String() string {
	return tea.Prettify(s)
}

func (s ResultList) GoString() string {
	return s.String()
}

func (s *ResultList) SetResult(v *DogHome) *ResultList {
	s.Result = v
	return s
}

// InitPack
type InitPack struct {
	// 2022-11-07 14:48
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// wanyi
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
}

func (s InitPack) String() string {
	return tea.Prettify(s)
}

func (s InitPack) GoString() string {
	return s.String()
}

func (s *InitPack) SetTime(v string) *InitPack {
	s.Time = &v
	return s
}

func (s *InitPack) SetOperator(v string) *InitPack {
	s.Operator = &v
	return s
}

func (s *InitPack) SetCount(v int64) *InitPack {
	s.Count = &v
	return s
}

type SaveAoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建者的工号
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// versionIds
	VersionIds []*int64 `json:"version_ids,omitempty" xml:"version_ids,omitempty" require:"true" type:"Repeated"`
	// assignedTo
	AssignedTo *string `json:"assigned_to,omitempty" xml:"assigned_to,omitempty" require:"true"`
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

func (s *SaveAoneRequest) SetProductInstanceId(v string) *SaveAoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveAoneRequest) SetAuthor(v string) *SaveAoneRequest {
	s.Author = &v
	return s
}

func (s *SaveAoneRequest) SetVersionIds(v []*int64) *SaveAoneRequest {
	s.VersionIds = v
	return s
}

func (s *SaveAoneRequest) SetAssignedTo(v string) *SaveAoneRequest {
	s.AssignedTo = &v
	return s
}

type SaveAoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结构体
	Result *ResultList `json:"result,omitempty" xml:"result,omitempty"`
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

func (s *SaveAoneResponse) SetResult(v *ResultList) *SaveAoneResponse {
	s.Result = v
	return s
}

type GetAgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数组结构体
	Dog []*Dog `json:"dog,omitempty" xml:"dog,omitempty" type:"Repeated"`
	// 狗狗的id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 结构体
	Home *DogHome `json:"home,omitempty" xml:"home,omitempty" require:"true"`
	// alipay
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s GetAgeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAgeRequest) GoString() string {
	return s.String()
}

func (s *GetAgeRequest) SetAuthToken(v string) *GetAgeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAgeRequest) SetProductInstanceId(v string) *GetAgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAgeRequest) SetDog(v []*Dog) *GetAgeRequest {
	s.Dog = v
	return s
}

func (s *GetAgeRequest) SetId(v int64) *GetAgeRequest {
	s.Id = &v
	return s
}

func (s *GetAgeRequest) SetHome(v *DogHome) *GetAgeRequest {
	s.Home = v
	return s
}

func (s *GetAgeRequest) SetFileId(v string) *GetAgeRequest {
	s.FileId = &v
	return s
}

func (s *GetAgeRequest) SetTest(v string) *GetAgeRequest {
	s.Test = &v
	return s
}

type GetAgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 年龄
	Age *int64 `json:"age,omitempty" xml:"age,omitempty"`
}

func (s GetAgeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAgeResponse) GoString() string {
	return s.String()
}

func (s *GetAgeResponse) SetReqMsgId(v string) *GetAgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAgeResponse) SetResultCode(v string) *GetAgeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAgeResponse) SetResultMsg(v string) *GetAgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAgeResponse) SetAge(v int64) *GetAgeResponse {
	s.Age = &v
	return s
}

type QueryEmebdTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 示例
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryEmebdTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEmebdTestRequest) GoString() string {
	return s.String()
}

func (s *QueryEmebdTestRequest) SetAuthToken(v string) *QueryEmebdTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEmebdTestRequest) SetProductInstanceId(v string) *QueryEmebdTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEmebdTestRequest) SetTimeout(v string) *QueryEmebdTestRequest {
	s.Timeout = &v
	return s
}

type QueryEmebdTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryEmebdTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEmebdTestResponse) GoString() string {
	return s.String()
}

func (s *QueryEmebdTestResponse) SetReqMsgId(v string) *QueryEmebdTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEmebdTestResponse) SetResultCode(v string) *QueryEmebdTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEmebdTestResponse) SetResultMsg(v string) *QueryEmebdTestResponse {
	s.ResultMsg = &v
	return s
}

type CreateWorkbenchTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s CreateWorkbenchTestRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkbenchTestRequest) GoString() string {
	return s.String()
}

func (s *CreateWorkbenchTestRequest) SetAuthToken(v string) *CreateWorkbenchTestRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWorkbenchTestRequest) SetProductInstanceId(v string) *CreateWorkbenchTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWorkbenchTestRequest) SetTimeout(v string) *CreateWorkbenchTestRequest {
	s.Timeout = &v
	return s
}

type CreateWorkbenchTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s CreateWorkbenchTestResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkbenchTestResponse) GoString() string {
	return s.String()
}

func (s *CreateWorkbenchTestResponse) SetReqMsgId(v string) *CreateWorkbenchTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWorkbenchTestResponse) SetResultCode(v string) *CreateWorkbenchTestResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWorkbenchTestResponse) SetResultMsg(v string) *CreateWorkbenchTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWorkbenchTestResponse) SetStauts(v string) *CreateWorkbenchTestResponse {
	s.Stauts = &v
	return s
}

func (s *CreateWorkbenchTestResponse) SetMsg(v string) *CreateWorkbenchTestResponse {
	s.Msg = &v
	return s
}

type QueryAaaBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAaaBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaBbbRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaBbbRequest) SetAuthToken(v string) *QueryAaaBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaBbbRequest) SetProductInstanceId(v string) *QueryAaaBbbRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAaaBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaBbbResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaBbbResponse) SetReqMsgId(v string) *QueryAaaBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaBbbResponse) SetResultCode(v string) *QueryAaaBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaBbbResponse) SetResultMsg(v string) *QueryAaaBbbResponse {
	s.ResultMsg = &v
	return s
}

type QueryWorkbenchTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 2022-11-07 14:46
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// call for back
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// wanyi
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s QueryWorkbenchTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWorkbenchTestRequest) GoString() string {
	return s.String()
}

func (s *QueryWorkbenchTestRequest) SetAuthToken(v string) *QueryWorkbenchTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetProductInstanceId(v string) *QueryWorkbenchTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetTimeout(v string) *QueryWorkbenchTestRequest {
	s.Timeout = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetCount(v int64) *QueryWorkbenchTestRequest {
	s.Count = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetTime(v string) *QueryWorkbenchTestRequest {
	s.Time = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetDesc(v string) *QueryWorkbenchTestRequest {
	s.Desc = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetOperator(v string) *QueryWorkbenchTestRequest {
	s.Operator = &v
	return s
}

type QueryWorkbenchTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// copy
	InitDesc *string `json:"init_desc,omitempty" xml:"init_desc,omitempty"`
	// 组合返回请求结果
	InitPack *InitPack `json:"init_pack,omitempty" xml:"init_pack,omitempty"`
}

func (s QueryWorkbenchTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWorkbenchTestResponse) GoString() string {
	return s.String()
}

func (s *QueryWorkbenchTestResponse) SetReqMsgId(v string) *QueryWorkbenchTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetResultCode(v string) *QueryWorkbenchTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetResultMsg(v string) *QueryWorkbenchTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetStauts(v string) *QueryWorkbenchTestResponse {
	s.Stauts = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetMsg(v string) *QueryWorkbenchTestResponse {
	s.Msg = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetInitDesc(v string) *QueryWorkbenchTestResponse {
	s.InitDesc = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetInitPack(v *InitPack) *QueryWorkbenchTestResponse {
	s.InitPack = v
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
				"sdk_version":      tea.String("1.0.9"),
				"_prod_code":       tea.String("DOG"),
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
 * Description: save form to aone
 * Summary: save form to aone
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
 * Description: save form to aone
 * Summary: save form to aone
 */
func (client *Client) SaveAoneEx(request *SaveAoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.aone.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 该接口用于获取狗狗的年龄A
 * Summary: 获取狗狗的年龄
 */
func (client *Client) GetAge(request *GetAgeRequest) (_result *GetAgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAgeResponse{}
	_body, _err := client.GetAgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口用于获取狗狗的年龄A
 * Summary: 获取狗狗的年龄
 */
func (client *Client) GetAgeEx(request *GetAgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.age.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 近端网关测试接口
 * Summary: 近端网关测试接口
 */
func (client *Client) QueryEmebdTest(request *QueryEmebdTestRequest) (_result *QueryEmebdTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEmebdTestResponse{}
	_body, _err := client.QueryEmebdTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 近端网关测试接口
 * Summary: 近端网关测试接口
 */
func (client *Client) QueryEmebdTestEx(request *QueryEmebdTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEmebdTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEmebdTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.emebd.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) CreateWorkbenchTest(request *CreateWorkbenchTestRequest) (_result *CreateWorkbenchTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWorkbenchTestResponse{}
	_body, _err := client.CreateWorkbenchTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) CreateWorkbenchTestEx(request *CreateWorkbenchTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWorkbenchTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWorkbenchTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.workbench.test.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryAaaBbb(request *QueryAaaBbbRequest) (_result *QueryAaaBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaBbbResponse{}
	_body, _err := client.QueryAaaBbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryAaaBbbEx(request *QueryAaaBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.aaa.bbb.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryWorkbenchTest(request *QueryWorkbenchTestRequest) (_result *QueryWorkbenchTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWorkbenchTestResponse{}
	_body, _err := client.QueryWorkbenchTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryWorkbenchTestEx(request *QueryWorkbenchTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWorkbenchTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWorkbenchTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.workbench.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
