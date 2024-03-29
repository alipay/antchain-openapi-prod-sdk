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

type QueryAntcloudAdomAppmarketPrivacyresultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 执行记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty" require:"true"`
}

func (s QueryAntcloudAdomAppmarketPrivacyresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudAdomAppmarketPrivacyresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultRequest) SetAuthToken(v string) *QueryAntcloudAdomAppmarketPrivacyresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultRequest) SetInstanceId(v string) *QueryAntcloudAdomAppmarketPrivacyresultRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultRequest) SetRecordId(v string) *QueryAntcloudAdomAppmarketPrivacyresultRequest {
	s.RecordId = &v
	return s
}

type QueryAntcloudAdomAppmarketPrivacyresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 隐私计算模型执行状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 结果文件路径
	ResultUrl *string `json:"result_url,omitempty" xml:"result_url,omitempty"`
	// 失败的原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
	// 结构化出参
	StructOutput *string `json:"struct_output,omitempty" xml:"struct_output,omitempty"`
}

func (s QueryAntcloudAdomAppmarketPrivacyresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudAdomAppmarketPrivacyresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetReqMsgId(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetResultCode(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetResultMsg(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetStatus(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.Status = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetResultUrl(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.ResultUrl = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetFailedReason(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.FailedReason = &v
	return s
}

func (s *QueryAntcloudAdomAppmarketPrivacyresultResponse) SetStructOutput(v string) *QueryAntcloudAdomAppmarketPrivacyresultResponse {
	s.StructOutput = &v
	return s
}

type UploadAntcloudAdomAppmarketFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所购商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件标识，用作文件名
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadAntcloudAdomAppmarketFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudAdomAppmarketFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAntcloudAdomAppmarketFileRequest) SetAuthToken(v string) *UploadAntcloudAdomAppmarketFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketFileRequest) SetInstanceId(v string) *UploadAntcloudAdomAppmarketFileRequest {
	s.InstanceId = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketFileRequest) SetFileId(v string) *UploadAntcloudAdomAppmarketFileRequest {
	s.FileId = &v
	return s
}

type UploadAntcloudAdomAppmarketFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件上传url
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s UploadAntcloudAdomAppmarketFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudAdomAppmarketFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAntcloudAdomAppmarketFileResponse) SetReqMsgId(v string) *UploadAntcloudAdomAppmarketFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketFileResponse) SetResultCode(v string) *UploadAntcloudAdomAppmarketFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketFileResponse) SetResultMsg(v string) *UploadAntcloudAdomAppmarketFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketFileResponse) SetUploadUrl(v string) *UploadAntcloudAdomAppmarketFileResponse {
	s.UploadUrl = &v
	return s
}

type ExecAntcloudAdomAppmarketPrivacymodelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件标识，文件上传时的入参
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 结构化入参
	StructInput *string `json:"struct_input,omitempty" xml:"struct_input,omitempty"`
}

func (s ExecAntcloudAdomAppmarketPrivacymodelRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudAdomAppmarketPrivacymodelRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelRequest) SetAuthToken(v string) *ExecAntcloudAdomAppmarketPrivacymodelRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelRequest) SetInstanceId(v string) *ExecAntcloudAdomAppmarketPrivacymodelRequest {
	s.InstanceId = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelRequest) SetFileId(v string) *ExecAntcloudAdomAppmarketPrivacymodelRequest {
	s.FileId = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelRequest) SetStructInput(v string) *ExecAntcloudAdomAppmarketPrivacymodelRequest {
	s.StructInput = &v
	return s
}

type ExecAntcloudAdomAppmarketPrivacymodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 结果文件url
	ResultUrl *string `json:"result_url,omitempty" xml:"result_url,omitempty"`
	// 执行失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
	// 结构化出参
	StructOutput *string `json:"struct_output,omitempty" xml:"struct_output,omitempty"`
}

func (s ExecAntcloudAdomAppmarketPrivacymodelResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudAdomAppmarketPrivacymodelResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetReqMsgId(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetResultCode(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetResultMsg(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetStatus(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.Status = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetResultUrl(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.ResultUrl = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetFailedReason(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.FailedReason = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketPrivacymodelResponse) SetStructOutput(v string) *ExecAntcloudAdomAppmarketPrivacymodelResponse {
	s.StructOutput = &v
	return s
}

type UploadAntcloudAdomAppmarketOcrfileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所购商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s UploadAntcloudAdomAppmarketOcrfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudAdomAppmarketOcrfileRequest) GoString() string {
	return s.String()
}

func (s *UploadAntcloudAdomAppmarketOcrfileRequest) SetAuthToken(v string) *UploadAntcloudAdomAppmarketOcrfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileRequest) SetInstanceId(v string) *UploadAntcloudAdomAppmarketOcrfileRequest {
	s.InstanceId = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileRequest) SetFileName(v string) *UploadAntcloudAdomAppmarketOcrfileRequest {
	s.FileName = &v
	return s
}

type UploadAntcloudAdomAppmarketOcrfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件上传url
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
}

func (s UploadAntcloudAdomAppmarketOcrfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntcloudAdomAppmarketOcrfileResponse) GoString() string {
	return s.String()
}

func (s *UploadAntcloudAdomAppmarketOcrfileResponse) SetReqMsgId(v string) *UploadAntcloudAdomAppmarketOcrfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileResponse) SetResultCode(v string) *UploadAntcloudAdomAppmarketOcrfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileResponse) SetResultMsg(v string) *UploadAntcloudAdomAppmarketOcrfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileResponse) SetUploadUrl(v string) *UploadAntcloudAdomAppmarketOcrfileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadAntcloudAdomAppmarketOcrfileResponse) SetFileKey(v string) *UploadAntcloudAdomAppmarketOcrfileResponse {
	s.FileKey = &v
	return s
}

type ExecAntcloudAdomAppmarketBusinesslicenseocrRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件key
	FileKey *string `json:"file_key,omitempty" xml:"file_key,omitempty"`
	// 文件url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// 扩展信息
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) SetAuthToken(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) SetInstanceId(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest {
	s.InstanceId = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) SetFileKey(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest {
	s.FileKey = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) SetFileUrl(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest {
	s.FileUrl = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) SetExt(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest {
	s.Ext = &v
	return s
}

type ExecAntcloudAdomAppmarketBusinesslicenseocrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 经营范围
	Business *string `json:"business,omitempty" xml:"business,omitempty"`
	// 注册资本
	Captial *string `json:"captial,omitempty" xml:"captial,omitempty"`
	// 企业成立日期
	EstablishDate *string `json:"establish_date,omitempty" xml:"establish_date,omitempty"`
	// 名称，控股股东名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 法定代表人
	Person *string `json:"person,omitempty" xml:"person,omitempty"`
	// 统一社会信用代码，控股股东证件号码
	RegNum *string `json:"reg_num,omitempty" xml:"reg_num,omitempty"`
	// 印章
	Stamp *string `json:"stamp,omitempty" xml:"stamp,omitempty"`
	// 类型，如：有限责任公司(自然人独资)
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 营业期限，营业执照有效期，控股股东证件有效期
	ValidPeriod *string `json:"valid_period,omitempty" xml:"valid_period,omitempty"`
	// 标题，如"营业执照"
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 颁发日期
	Date *string `json:"date,omitempty" xml:"date,omitempty"`
	// 编号
	Num *string `json:"num,omitempty" xml:"num,omitempty"`
	// 投资人
	Investors *string `json:"investors,omitempty" xml:"investors,omitempty"`
	// 组成形式
	Formation *string `json:"formation,omitempty" xml:"formation,omitempty"`
	// 注册日期
	DateOfRegistration *string `json:"date_of_registration,omitempty" xml:"date_of_registration,omitempty"`
	// 经营者
	Operators *string `json:"operators,omitempty" xml:"operators,omitempty"`
}

func (s ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetReqMsgId(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetResultCode(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetResultMsg(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetAddress(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Address = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetBusiness(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Business = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetCaptial(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Captial = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetEstablishDate(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.EstablishDate = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetName(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Name = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetPerson(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Person = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetRegNum(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.RegNum = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetStamp(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Stamp = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetType(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Type = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetValidPeriod(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.ValidPeriod = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetTitle(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Title = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetDate(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Date = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetNum(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Num = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetInvestors(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Investors = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetFormation(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Formation = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetDateOfRegistration(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.DateOfRegistration = &v
	return s
}

func (s *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse) SetOperators(v string) *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse {
	s.Operators = &v
	return s
}

type SubmitAntcloudAdomAppmarketPrivacymodelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件名称
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 结构化入参
	StructInput *string `json:"struct_input,omitempty" xml:"struct_input,omitempty"`
}

func (s SubmitAntcloudAdomAppmarketPrivacymodelRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntcloudAdomAppmarketPrivacymodelRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelRequest) SetAuthToken(v string) *SubmitAntcloudAdomAppmarketPrivacymodelRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelRequest) SetInstanceId(v string) *SubmitAntcloudAdomAppmarketPrivacymodelRequest {
	s.InstanceId = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelRequest) SetFileId(v string) *SubmitAntcloudAdomAppmarketPrivacymodelRequest {
	s.FileId = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelRequest) SetStructInput(v string) *SubmitAntcloudAdomAppmarketPrivacymodelRequest {
	s.StructInput = &v
	return s
}

type SubmitAntcloudAdomAppmarketPrivacymodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异步提交执行记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty"`
}

func (s SubmitAntcloudAdomAppmarketPrivacymodelResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntcloudAdomAppmarketPrivacymodelResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelResponse) SetReqMsgId(v string) *SubmitAntcloudAdomAppmarketPrivacymodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelResponse) SetResultCode(v string) *SubmitAntcloudAdomAppmarketPrivacymodelResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelResponse) SetResultMsg(v string) *SubmitAntcloudAdomAppmarketPrivacymodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntcloudAdomAppmarketPrivacymodelResponse) SetRecordId(v string) *SubmitAntcloudAdomAppmarketPrivacymodelResponse {
	s.RecordId = &v
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
				"sdk_version":      tea.String("1.1.0"),
				"_prod_code":       tea.String("ak_31dc9f55b9684fe29acc7c0125a5d7a2"),
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
 * Description: 应用开放市场隐私模型运行时链路-结果查询
 * Summary: 应用开放市场隐私模型运行时链路-结果查询
 */
func (client *Client) QueryAntcloudAdomAppmarketPrivacyresult(request *QueryAntcloudAdomAppmarketPrivacyresultRequest) (_result *QueryAntcloudAdomAppmarketPrivacyresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudAdomAppmarketPrivacyresultResponse{}
	_body, _err := client.QueryAntcloudAdomAppmarketPrivacyresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-结果查询
 * Summary: 应用开放市场隐私模型运行时链路-结果查询
 */
func (client *Client) QueryAntcloudAdomAppmarketPrivacyresultEx(request *QueryAntcloudAdomAppmarketPrivacyresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudAdomAppmarketPrivacyresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudAdomAppmarketPrivacyresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.privacyresult.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-文件上传
 * Summary: 应用开放市场隐私模型运行时链路-文件上传
 */
func (client *Client) UploadAntcloudAdomAppmarketFile(request *UploadAntcloudAdomAppmarketFileRequest) (_result *UploadAntcloudAdomAppmarketFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntcloudAdomAppmarketFileResponse{}
	_body, _err := client.UploadAntcloudAdomAppmarketFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-文件上传
 * Summary: 应用开放市场隐私模型运行时链路-文件上传
 */
func (client *Client) UploadAntcloudAdomAppmarketFileEx(request *UploadAntcloudAdomAppmarketFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntcloudAdomAppmarketFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntcloudAdomAppmarketFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-同步执行
 * Summary: 应用开放市场隐私模型运行时链路-同步执行
 */
func (client *Client) ExecAntcloudAdomAppmarketPrivacymodel(request *ExecAntcloudAdomAppmarketPrivacymodelRequest) (_result *ExecAntcloudAdomAppmarketPrivacymodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudAdomAppmarketPrivacymodelResponse{}
	_body, _err := client.ExecAntcloudAdomAppmarketPrivacymodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-同步执行
 * Summary: 应用开放市场隐私模型运行时链路-同步执行
 */
func (client *Client) ExecAntcloudAdomAppmarketPrivacymodelEx(request *ExecAntcloudAdomAppmarketPrivacymodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudAdomAppmarketPrivacymodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudAdomAppmarketPrivacymodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.privacymodel.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场OCR服务-文件上传
 * Summary: 应用开放市场OCR服务-文件上传
 */
func (client *Client) UploadAntcloudAdomAppmarketOcrfile(request *UploadAntcloudAdomAppmarketOcrfileRequest) (_result *UploadAntcloudAdomAppmarketOcrfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntcloudAdomAppmarketOcrfileResponse{}
	_body, _err := client.UploadAntcloudAdomAppmarketOcrfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场OCR服务-文件上传
 * Summary: 应用开放市场OCR服务-文件上传
 */
func (client *Client) UploadAntcloudAdomAppmarketOcrfileEx(request *UploadAntcloudAdomAppmarketOcrfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntcloudAdomAppmarketOcrfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntcloudAdomAppmarketOcrfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.ocrfile.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场OCR服务-营业执照识别
 * Summary: 应用开放市场OCR服务-营业执照识别
 */
func (client *Client) ExecAntcloudAdomAppmarketBusinesslicenseocr(request *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest) (_result *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudAdomAppmarketBusinesslicenseocrResponse{}
	_body, _err := client.ExecAntcloudAdomAppmarketBusinesslicenseocrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场OCR服务-营业执照识别
 * Summary: 应用开放市场OCR服务-营业执照识别
 */
func (client *Client) ExecAntcloudAdomAppmarketBusinesslicenseocrEx(request *ExecAntcloudAdomAppmarketBusinesslicenseocrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudAdomAppmarketBusinesslicenseocrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudAdomAppmarketBusinesslicenseocrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.businesslicenseocr.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-提交执行
 * Summary: 应用开放市场隐私模型运行时链路-提交执行
 */
func (client *Client) SubmitAntcloudAdomAppmarketPrivacymodel(request *SubmitAntcloudAdomAppmarketPrivacymodelRequest) (_result *SubmitAntcloudAdomAppmarketPrivacymodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntcloudAdomAppmarketPrivacymodelResponse{}
	_body, _err := client.SubmitAntcloudAdomAppmarketPrivacymodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-提交执行
 * Summary: 应用开放市场隐私模型运行时链路-提交执行
 */
func (client *Client) SubmitAntcloudAdomAppmarketPrivacymodelEx(request *SubmitAntcloudAdomAppmarketPrivacymodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntcloudAdomAppmarketPrivacymodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntcloudAdomAppmarketPrivacymodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.privacymodel.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
