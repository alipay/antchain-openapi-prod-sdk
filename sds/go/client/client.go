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

// 批处理结果
type BatchResult struct {
	// 业务号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true" maxLength:"64"`
	// 业务号类型
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"32"`
	// 结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 结果码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
}

func (s BatchResult) String() string {
	return tea.Prettify(s)
}

func (s BatchResult) GoString() string {
	return s.String()
}

func (s *BatchResult) SetBizNo(v string) *BatchResult {
	s.BizNo = &v
	return s
}

func (s *BatchResult) SetBizNoType(v string) *BatchResult {
	s.BizNoType = &v
	return s
}

func (s *BatchResult) SetResult(v string) *BatchResult {
	s.Result = &v
	return s
}

func (s *BatchResult) SetResultCode(v string) *BatchResult {
	s.ResultCode = &v
	return s
}

// 任务详细结果包含任务的统计数据信息
type TaskDetailResult struct {
	// 总数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 成功数量
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数量
	FailCount *int64 `json:"fail_count,omitempty" xml:"fail_count,omitempty"`
	// 处理中数量
	ProcessingCount *int64 `json:"processing_count,omitempty" xml:"processing_count,omitempty"`
	// 当状态为无效时，显示具体的错误信息
	ErrorInfo *string `json:"error_info,omitempty" xml:"error_info,omitempty"`
}

func (s TaskDetailResult) String() string {
	return tea.Prettify(s)
}

func (s TaskDetailResult) GoString() string {
	return s.String()
}

func (s *TaskDetailResult) SetTotalCount(v int64) *TaskDetailResult {
	s.TotalCount = &v
	return s
}

func (s *TaskDetailResult) SetSuccessCount(v int64) *TaskDetailResult {
	s.SuccessCount = &v
	return s
}

func (s *TaskDetailResult) SetFailCount(v int64) *TaskDetailResult {
	s.FailCount = &v
	return s
}

func (s *TaskDetailResult) SetProcessingCount(v int64) *TaskDetailResult {
	s.ProcessingCount = &v
	return s
}

func (s *TaskDetailResult) SetErrorInfo(v string) *TaskDetailResult {
	s.ErrorInfo = &v
	return s
}

// 地址，包含省、市、区(县)
type Address struct {
	// 市级
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true" maxLength:"6" minLength:"6"`
	// 区、县级
	District *string `json:"district,omitempty" xml:"district,omitempty" maxLength:"6" minLength:"6"`
}

func (s Address) String() string {
	return tea.Prettify(s)
}

func (s Address) GoString() string {
	return s.String()
}

func (s *Address) SetCity(v string) *Address {
	s.City = &v
	return s
}

func (s *Address) SetDistrict(v string) *Address {
	s.District = &v
	return s
}

// 业务号条件
type BizNoCondition struct {
	// 枚举
	// CITY 城市
	// BLOCK 区县
	// AGE 年龄
	Dimension *string `json:"dimension,omitempty" xml:"dimension,omitempty" require:"true"`
	// 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
	// CITY:区划码
	// BLOCK:区划码（底包暂不支持）
	// AGE:30+、40+、50+（底包暂不支持
	ValueScope []*string `json:"value_scope,omitempty" xml:"value_scope,omitempty" require:"true" type:"Repeated"`
}

func (s BizNoCondition) String() string {
	return tea.Prettify(s)
}

func (s BizNoCondition) GoString() string {
	return s.String()
}

func (s *BizNoCondition) SetDimension(v string) *BizNoCondition {
	s.Dimension = &v
	return s
}

func (s *BizNoCondition) SetValueScope(v []*string) *BizNoCondition {
	s.ValueScope = v
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

type JudgeCrowdPrefermentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 业务号类型：1-手机号，2-支付宝用户id
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true"`
	// 加密方式：0-不加密，1-SHA1，2-MD5
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// json结构，可以传递自定义参数
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty" maxLength:"512"`
}

func (s JudgeCrowdPrefermentRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeCrowdPrefermentRequest) GoString() string {
	return s.String()
}

func (s *JudgeCrowdPrefermentRequest) SetAuthToken(v string) *JudgeCrowdPrefermentRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetProductInstanceId(v string) *JudgeCrowdPrefermentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetBizNo(v string) *JudgeCrowdPrefermentRequest {
	s.BizNo = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetBizNoType(v string) *JudgeCrowdPrefermentRequest {
	s.BizNoType = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetEncryptType(v string) *JudgeCrowdPrefermentRequest {
	s.EncryptType = &v
	return s
}

func (s *JudgeCrowdPrefermentRequest) SetProperties(v string) *JudgeCrowdPrefermentRequest {
	s.Properties = &v
	return s
}

type JudgeCrowdPrefermentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否优待群体：YES-是，NO-否
	IsPreferment *string `json:"is_preferment,omitempty" xml:"is_preferment,omitempty"`
}

func (s JudgeCrowdPrefermentResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeCrowdPrefermentResponse) GoString() string {
	return s.String()
}

func (s *JudgeCrowdPrefermentResponse) SetReqMsgId(v string) *JudgeCrowdPrefermentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetResultCode(v string) *JudgeCrowdPrefermentResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetResultMsg(v string) *JudgeCrowdPrefermentResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeCrowdPrefermentResponse) SetIsPreferment(v string) *JudgeCrowdPrefermentResponse {
	s.IsPreferment = &v
	return s
}

type SubmitScenedataTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 约定的场景枚举
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"32"`
	// 枚举
	// PHONE_SHA1
	// PHONE_MD5
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"32"`
	// 适配客户的来源
	// 可能是客户的任务/AK
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty" maxLength:"32"`
	// 业务号预期条件
	ExpectCondition []*BizNoCondition `json:"expect_condition,omitempty" xml:"expect_condition,omitempty" type:"Repeated"`
}

func (s SubmitScenedataTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitScenedataTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitScenedataTaskRequest) SetAuthToken(v string) *SubmitScenedataTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetProductInstanceId(v string) *SubmitScenedataTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetScene(v string) *SubmitScenedataTaskRequest {
	s.Scene = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetBizNoType(v string) *SubmitScenedataTaskRequest {
	s.BizNoType = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetSourceMark(v string) *SubmitScenedataTaskRequest {
	s.SourceMark = &v
	return s
}

func (s *SubmitScenedataTaskRequest) SetExpectCondition(v []*BizNoCondition) *SubmitScenedataTaskRequest {
	s.ExpectCondition = v
	return s
}

type SubmitScenedataTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建任务成功后，返回批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty"`
}

func (s SubmitScenedataTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitScenedataTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitScenedataTaskResponse) SetReqMsgId(v string) *SubmitScenedataTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetResultCode(v string) *SubmitScenedataTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetResultMsg(v string) *SubmitScenedataTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitScenedataTaskResponse) SetBatchNo(v string) *SubmitScenedataTaskResponse {
	s.BatchNo = &v
	return s
}

type UploadScenedataFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true" maxLength:"64"`
	// 文件参数
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadScenedataFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadScenedataFileRequest) GoString() string {
	return s.String()
}

func (s *UploadScenedataFileRequest) SetAuthToken(v string) *UploadScenedataFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadScenedataFileRequest) SetProductInstanceId(v string) *UploadScenedataFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadScenedataFileRequest) SetBatchNo(v string) *UploadScenedataFileRequest {
	s.BatchNo = &v
	return s
}

func (s *UploadScenedataFileRequest) SetFileObject(v io.Reader) *UploadScenedataFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadScenedataFileRequest) SetFileObjectName(v string) *UploadScenedataFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadScenedataFileRequest) SetFileId(v string) *UploadScenedataFileRequest {
	s.FileId = &v
	return s
}

type UploadScenedataFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// batchNo对应的任务状态，上传后，返回RECEIVED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UploadScenedataFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadScenedataFileResponse) GoString() string {
	return s.String()
}

func (s *UploadScenedataFileResponse) SetReqMsgId(v string) *UploadScenedataFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadScenedataFileResponse) SetResultCode(v string) *UploadScenedataFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadScenedataFileResponse) SetResultMsg(v string) *UploadScenedataFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadScenedataFileResponse) SetStatus(v string) *UploadScenedataFileResponse {
	s.Status = &v
	return s
}

type BatchqueryScenedataTaskresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true" maxLength:"64"`
	// 游标，上一次的最后一条
	Cursor *string `json:"cursor,omitempty" xml:"cursor,omitempty" maxLength:"256"`
	// 本次同步数量
	SyncNum *int64 `json:"sync_num,omitempty" xml:"sync_num,omitempty" maximum:"100"`
}

func (s BatchqueryScenedataTaskresultRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryScenedataTaskresultRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryScenedataTaskresultRequest) SetAuthToken(v string) *BatchqueryScenedataTaskresultRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetProductInstanceId(v string) *BatchqueryScenedataTaskresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetBatchNo(v string) *BatchqueryScenedataTaskresultRequest {
	s.BatchNo = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetCursor(v string) *BatchqueryScenedataTaskresultRequest {
	s.Cursor = &v
	return s
}

func (s *BatchqueryScenedataTaskresultRequest) SetSyncNum(v int64) *BatchqueryScenedataTaskresultRequest {
	s.SyncNum = &v
	return s
}

type BatchqueryScenedataTaskresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0-未开始
	// 1-可继续
	// 2-结束
	SyncStatus *string `json:"sync_status,omitempty" xml:"sync_status,omitempty"`
	// 本次的最后一个游标，保存起来下一次使用
	LastCursor *string `json:"last_cursor,omitempty" xml:"last_cursor,omitempty"`
	// 结果列表
	ResultList []*BatchResult `json:"result_list,omitempty" xml:"result_list,omitempty" type:"Repeated"`
}

func (s BatchqueryScenedataTaskresultResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryScenedataTaskresultResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryScenedataTaskresultResponse) SetReqMsgId(v string) *BatchqueryScenedataTaskresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultCode(v string) *BatchqueryScenedataTaskresultResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultMsg(v string) *BatchqueryScenedataTaskresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetSyncStatus(v string) *BatchqueryScenedataTaskresultResponse {
	s.SyncStatus = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetLastCursor(v string) *BatchqueryScenedataTaskresultResponse {
	s.LastCursor = &v
	return s
}

func (s *BatchqueryScenedataTaskresultResponse) SetResultList(v []*BatchResult) *BatchqueryScenedataTaskresultResponse {
	s.ResultList = v
	return s
}

type QueryScenedataOnlineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号，根据biz_no_type修改类型
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true" maxLength:"256"`
	// 业务号类型
	BizNoType *string `json:"biz_no_type,omitempty" xml:"biz_no_type,omitempty" require:"true" maxLength:"64"`
	// 场景，根据此参数路由适配到不同数据源
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true" maxLength:"32"`
	// 来源标识
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty" maxLength:"32"`
	// 条件，目前只支持IN的逻辑
	Condition *BizNoCondition `json:"condition,omitempty" xml:"condition,omitempty"`
}

func (s QueryScenedataOnlineRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataOnlineRequest) GoString() string {
	return s.String()
}

func (s *QueryScenedataOnlineRequest) SetAuthToken(v string) *QueryScenedataOnlineRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetProductInstanceId(v string) *QueryScenedataOnlineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetBizNo(v string) *QueryScenedataOnlineRequest {
	s.BizNo = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetBizNoType(v string) *QueryScenedataOnlineRequest {
	s.BizNoType = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetScene(v string) *QueryScenedataOnlineRequest {
	s.Scene = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetSourceMark(v string) *QueryScenedataOnlineRequest {
	s.SourceMark = &v
	return s
}

func (s *QueryScenedataOnlineRequest) SetCondition(v *BizNoCondition) *QueryScenedataOnlineRequest {
	s.Condition = v
	return s
}

type QueryScenedataOnlineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果字段，可以是Y/程度值/自定义加密串
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryScenedataOnlineResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataOnlineResponse) GoString() string {
	return s.String()
}

func (s *QueryScenedataOnlineResponse) SetReqMsgId(v string) *QueryScenedataOnlineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResultCode(v string) *QueryScenedataOnlineResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResultMsg(v string) *QueryScenedataOnlineResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScenedataOnlineResponse) SetResult(v string) *QueryScenedataOnlineResponse {
	s.Result = &v
	return s
}

type QueryScenedataTaskinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
}

func (s QueryScenedataTaskinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataTaskinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryScenedataTaskinfoRequest) SetAuthToken(v string) *QueryScenedataTaskinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryScenedataTaskinfoRequest) SetProductInstanceId(v string) *QueryScenedataTaskinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryScenedataTaskinfoRequest) SetBatchNo(v string) *QueryScenedataTaskinfoRequest {
	s.BatchNo = &v
	return s
}

type QueryScenedataTaskinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// -1-无效，0-待处理，1-处理中，2-处理完成
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
	// 业务日期
	BizDate *string `json:"biz_date,omitempty" xml:"biz_date,omitempty"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 任务类型
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty"`
	// 批次所属租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 来源标识
	SourceMark *string `json:"source_mark,omitempty" xml:"source_mark,omitempty"`
	// 任务创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 批次统计结果信息
	Result *TaskDetailResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryScenedataTaskinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryScenedataTaskinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryScenedataTaskinfoResponse) SetReqMsgId(v string) *QueryScenedataTaskinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResultCode(v string) *QueryScenedataTaskinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResultMsg(v string) *QueryScenedataTaskinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTaskStatus(v string) *QueryScenedataTaskinfoResponse {
	s.TaskStatus = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetBizDate(v string) *QueryScenedataTaskinfoResponse {
	s.BizDate = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetScene(v string) *QueryScenedataTaskinfoResponse {
	s.Scene = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTaskType(v string) *QueryScenedataTaskinfoResponse {
	s.TaskType = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetTenantId(v string) *QueryScenedataTaskinfoResponse {
	s.TenantId = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetSourceMark(v string) *QueryScenedataTaskinfoResponse {
	s.SourceMark = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetCreateTime(v string) *QueryScenedataTaskinfoResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryScenedataTaskinfoResponse) SetResult(v *TaskDetailResult) *QueryScenedataTaskinfoResponse {
	s.Result = v
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
				"sdk_version":      tea.String("1.4.1"),
				"_prod_code":       tea.String("SDS"),
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
 * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
 * Summary: 优待人群判断
 */
func (client *Client) JudgeCrowdPreferment(request *JudgeCrowdPrefermentRequest) (_result *JudgeCrowdPrefermentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeCrowdPrefermentResponse{}
	_body, _err := client.JudgeCrowdPrefermentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
 * Summary: 优待人群判断
 */
func (client *Client) JudgeCrowdPrefermentEx(request *JudgeCrowdPrefermentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeCrowdPrefermentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeCrowdPrefermentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.crowd.preferment.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
 * Summary: 场景数据批处理任务提交
 */
func (client *Client) SubmitScenedataTask(request *SubmitScenedataTaskRequest) (_result *SubmitScenedataTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitScenedataTaskResponse{}
	_body, _err := client.SubmitScenedataTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
 * Summary: 场景数据批处理任务提交
 */
func (client *Client) SubmitScenedataTaskEx(request *SubmitScenedataTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitScenedataTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitScenedataTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.task.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批次数据文件上传
 * Summary: 批次数据文件上传
 */
func (client *Client) UploadScenedataFile(request *UploadScenedataFileRequest) (_result *UploadScenedataFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadScenedataFileResponse{}
	_body, _err := client.UploadScenedataFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批次数据文件上传
 * Summary: 批次数据文件上传
 */
func (client *Client) UploadScenedataFileEx(request *UploadScenedataFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadScenedataFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.sds.scenedata.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadScenedataFileResponse := &UploadScenedataFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadScenedataFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadScenedataFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
 * Summary: 场景数据任务结果批量查询
 */
func (client *Client) BatchqueryScenedataTaskresult(request *BatchqueryScenedataTaskresultRequest) (_result *BatchqueryScenedataTaskresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryScenedataTaskresultResponse{}
	_body, _err := client.BatchqueryScenedataTaskresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
 * Summary: 场景数据任务结果批量查询
 */
func (client *Client) BatchqueryScenedataTaskresultEx(request *BatchqueryScenedataTaskresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryScenedataTaskresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryScenedataTaskresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskresult.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 场景数据在线查询，仅支持单条匹配
 * Summary: 场景数据在线查询
 */
func (client *Client) QueryScenedataOnline(request *QueryScenedataOnlineRequest) (_result *QueryScenedataOnlineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScenedataOnlineResponse{}
	_body, _err := client.QueryScenedataOnlineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 场景数据在线查询，仅支持单条匹配
 * Summary: 场景数据在线查询
 */
func (client *Client) QueryScenedataOnlineEx(request *QueryScenedataOnlineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScenedataOnlineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScenedataOnlineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.online.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 批次任务信息查询
 */
func (client *Client) QueryScenedataTaskinfo(request *QueryScenedataTaskinfoRequest) (_result *QueryScenedataTaskinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryScenedataTaskinfoResponse{}
	_body, _err := client.QueryScenedataTaskinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过批次号查询任务详细信息
 * Summary: 批次任务信息查询
 */
func (client *Client) QueryScenedataTaskinfoEx(request *QueryScenedataTaskinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryScenedataTaskinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryScenedataTaskinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.sds.scenedata.taskinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
