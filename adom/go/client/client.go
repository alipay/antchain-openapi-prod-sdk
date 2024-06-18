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

type UploadAppmarketOcrfileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所购商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s UploadAppmarketOcrfileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAppmarketOcrfileRequest) GoString() string {
	return s.String()
}

func (s *UploadAppmarketOcrfileRequest) SetAuthToken(v string) *UploadAppmarketOcrfileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAppmarketOcrfileRequest) SetInstanceId(v string) *UploadAppmarketOcrfileRequest {
	s.InstanceId = &v
	return s
}

func (s *UploadAppmarketOcrfileRequest) SetFileName(v string) *UploadAppmarketOcrfileRequest {
	s.FileName = &v
	return s
}

type UploadAppmarketOcrfileResponse struct {
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

func (s UploadAppmarketOcrfileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAppmarketOcrfileResponse) GoString() string {
	return s.String()
}

func (s *UploadAppmarketOcrfileResponse) SetReqMsgId(v string) *UploadAppmarketOcrfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAppmarketOcrfileResponse) SetResultCode(v string) *UploadAppmarketOcrfileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAppmarketOcrfileResponse) SetResultMsg(v string) *UploadAppmarketOcrfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAppmarketOcrfileResponse) SetUploadUrl(v string) *UploadAppmarketOcrfileResponse {
	s.UploadUrl = &v
	return s
}

func (s *UploadAppmarketOcrfileResponse) SetFileKey(v string) *UploadAppmarketOcrfileResponse {
	s.FileKey = &v
	return s
}

type ExecAppmarketBusinesslicenseocrRequest struct {
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

func (s ExecAppmarketBusinesslicenseocrRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAppmarketBusinesslicenseocrRequest) GoString() string {
	return s.String()
}

func (s *ExecAppmarketBusinesslicenseocrRequest) SetAuthToken(v string) *ExecAppmarketBusinesslicenseocrRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrRequest) SetInstanceId(v string) *ExecAppmarketBusinesslicenseocrRequest {
	s.InstanceId = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrRequest) SetFileKey(v string) *ExecAppmarketBusinesslicenseocrRequest {
	s.FileKey = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrRequest) SetFileUrl(v string) *ExecAppmarketBusinesslicenseocrRequest {
	s.FileUrl = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrRequest) SetExt(v string) *ExecAppmarketBusinesslicenseocrRequest {
	s.Ext = &v
	return s
}

type ExecAppmarketBusinesslicenseocrResponse struct {
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

func (s ExecAppmarketBusinesslicenseocrResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAppmarketBusinesslicenseocrResponse) GoString() string {
	return s.String()
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetReqMsgId(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetResultCode(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetResultMsg(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetAddress(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Address = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetBusiness(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Business = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetCaptial(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Captial = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetEstablishDate(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.EstablishDate = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetName(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Name = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetPerson(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Person = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetRegNum(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.RegNum = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetStamp(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Stamp = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetType(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Type = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetValidPeriod(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.ValidPeriod = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetTitle(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Title = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetDate(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Date = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetNum(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Num = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetInvestors(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Investors = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetFormation(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Formation = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetDateOfRegistration(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.DateOfRegistration = &v
	return s
}

func (s *ExecAppmarketBusinesslicenseocrResponse) SetOperators(v string) *ExecAppmarketBusinesslicenseocrResponse {
	s.Operators = &v
	return s
}

type QueryAppmarketPrivacyresultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 执行记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty" require:"true"`
}

func (s QueryAppmarketPrivacyresultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAppmarketPrivacyresultRequest) GoString() string {
	return s.String()
}

func (s *QueryAppmarketPrivacyresultRequest) SetAuthToken(v string) *QueryAppmarketPrivacyresultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAppmarketPrivacyresultRequest) SetInstanceId(v string) *QueryAppmarketPrivacyresultRequest {
	s.InstanceId = &v
	return s
}

func (s *QueryAppmarketPrivacyresultRequest) SetRecordId(v string) *QueryAppmarketPrivacyresultRequest {
	s.RecordId = &v
	return s
}

type QueryAppmarketPrivacyresultResponse struct {
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

func (s QueryAppmarketPrivacyresultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAppmarketPrivacyresultResponse) GoString() string {
	return s.String()
}

func (s *QueryAppmarketPrivacyresultResponse) SetReqMsgId(v string) *QueryAppmarketPrivacyresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetResultCode(v string) *QueryAppmarketPrivacyresultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetResultMsg(v string) *QueryAppmarketPrivacyresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetStatus(v string) *QueryAppmarketPrivacyresultResponse {
	s.Status = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetResultUrl(v string) *QueryAppmarketPrivacyresultResponse {
	s.ResultUrl = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetFailedReason(v string) *QueryAppmarketPrivacyresultResponse {
	s.FailedReason = &v
	return s
}

func (s *QueryAppmarketPrivacyresultResponse) SetStructOutput(v string) *QueryAppmarketPrivacyresultResponse {
	s.StructOutput = &v
	return s
}

type UploadAppmarketFileRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 所购商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件标识，用作文件名
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadAppmarketFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAppmarketFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAppmarketFileRequest) SetAuthToken(v string) *UploadAppmarketFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAppmarketFileRequest) SetInstanceId(v string) *UploadAppmarketFileRequest {
	s.InstanceId = &v
	return s
}

func (s *UploadAppmarketFileRequest) SetFileId(v string) *UploadAppmarketFileRequest {
	s.FileId = &v
	return s
}

type UploadAppmarketFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件上传url
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s UploadAppmarketFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAppmarketFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAppmarketFileResponse) SetReqMsgId(v string) *UploadAppmarketFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAppmarketFileResponse) SetResultCode(v string) *UploadAppmarketFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAppmarketFileResponse) SetResultMsg(v string) *UploadAppmarketFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAppmarketFileResponse) SetUploadUrl(v string) *UploadAppmarketFileResponse {
	s.UploadUrl = &v
	return s
}

type ExecAppmarketPrivacymodelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件标识，文件上传时的入参
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 结构化入参
	StructInput *string `json:"struct_input,omitempty" xml:"struct_input,omitempty"`
}

func (s ExecAppmarketPrivacymodelRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAppmarketPrivacymodelRequest) GoString() string {
	return s.String()
}

func (s *ExecAppmarketPrivacymodelRequest) SetAuthToken(v string) *ExecAppmarketPrivacymodelRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAppmarketPrivacymodelRequest) SetInstanceId(v string) *ExecAppmarketPrivacymodelRequest {
	s.InstanceId = &v
	return s
}

func (s *ExecAppmarketPrivacymodelRequest) SetFileId(v string) *ExecAppmarketPrivacymodelRequest {
	s.FileId = &v
	return s
}

func (s *ExecAppmarketPrivacymodelRequest) SetStructInput(v string) *ExecAppmarketPrivacymodelRequest {
	s.StructInput = &v
	return s
}

type ExecAppmarketPrivacymodelResponse struct {
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

func (s ExecAppmarketPrivacymodelResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAppmarketPrivacymodelResponse) GoString() string {
	return s.String()
}

func (s *ExecAppmarketPrivacymodelResponse) SetReqMsgId(v string) *ExecAppmarketPrivacymodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetResultCode(v string) *ExecAppmarketPrivacymodelResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetResultMsg(v string) *ExecAppmarketPrivacymodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetStatus(v string) *ExecAppmarketPrivacymodelResponse {
	s.Status = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetResultUrl(v string) *ExecAppmarketPrivacymodelResponse {
	s.ResultUrl = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetFailedReason(v string) *ExecAppmarketPrivacymodelResponse {
	s.FailedReason = &v
	return s
}

func (s *ExecAppmarketPrivacymodelResponse) SetStructOutput(v string) *ExecAppmarketPrivacymodelResponse {
	s.StructOutput = &v
	return s
}

type SubmitAppmarketPrivacymodelRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商品实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 文件名称
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 结构化入参
	StructInput *string `json:"struct_input,omitempty" xml:"struct_input,omitempty"`
}

func (s SubmitAppmarketPrivacymodelRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAppmarketPrivacymodelRequest) GoString() string {
	return s.String()
}

func (s *SubmitAppmarketPrivacymodelRequest) SetAuthToken(v string) *SubmitAppmarketPrivacymodelRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelRequest) SetInstanceId(v string) *SubmitAppmarketPrivacymodelRequest {
	s.InstanceId = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelRequest) SetFileId(v string) *SubmitAppmarketPrivacymodelRequest {
	s.FileId = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelRequest) SetStructInput(v string) *SubmitAppmarketPrivacymodelRequest {
	s.StructInput = &v
	return s
}

type SubmitAppmarketPrivacymodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 异步提交执行记录id
	RecordId *string `json:"record_id,omitempty" xml:"record_id,omitempty"`
}

func (s SubmitAppmarketPrivacymodelResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAppmarketPrivacymodelResponse) GoString() string {
	return s.String()
}

func (s *SubmitAppmarketPrivacymodelResponse) SetReqMsgId(v string) *SubmitAppmarketPrivacymodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelResponse) SetResultCode(v string) *SubmitAppmarketPrivacymodelResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelResponse) SetResultMsg(v string) *SubmitAppmarketPrivacymodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAppmarketPrivacymodelResponse) SetRecordId(v string) *SubmitAppmarketPrivacymodelResponse {
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
				"sdk_version":      tea.String("1.1.6"),
				"_prod_code":       tea.String("ADOM"),
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
 * Description: 应用开放市场OCR服务-文件上传
 * Summary: 应用开放市场OCR服务-文件上传
 */
func (client *Client) UploadAppmarketOcrfile(request *UploadAppmarketOcrfileRequest) (_result *UploadAppmarketOcrfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAppmarketOcrfileResponse{}
	_body, _err := client.UploadAppmarketOcrfileEx(request, headers, runtime)
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
func (client *Client) UploadAppmarketOcrfileEx(request *UploadAppmarketOcrfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAppmarketOcrfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAppmarketOcrfileResponse{}
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
func (client *Client) ExecAppmarketBusinesslicenseocr(request *ExecAppmarketBusinesslicenseocrRequest) (_result *ExecAppmarketBusinesslicenseocrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAppmarketBusinesslicenseocrResponse{}
	_body, _err := client.ExecAppmarketBusinesslicenseocrEx(request, headers, runtime)
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
func (client *Client) ExecAppmarketBusinesslicenseocrEx(request *ExecAppmarketBusinesslicenseocrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAppmarketBusinesslicenseocrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAppmarketBusinesslicenseocrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.businesslicenseocr.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 应用开放市场隐私模型运行时链路-结果查询
 * Summary: 应用开放市场隐私模型运行时链路-结果查询
 */
func (client *Client) QueryAppmarketPrivacyresult(request *QueryAppmarketPrivacyresultRequest) (_result *QueryAppmarketPrivacyresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAppmarketPrivacyresultResponse{}
	_body, _err := client.QueryAppmarketPrivacyresultEx(request, headers, runtime)
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
func (client *Client) QueryAppmarketPrivacyresultEx(request *QueryAppmarketPrivacyresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAppmarketPrivacyresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAppmarketPrivacyresultResponse{}
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
func (client *Client) UploadAppmarketFile(request *UploadAppmarketFileRequest) (_result *UploadAppmarketFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAppmarketFileResponse{}
	_body, _err := client.UploadAppmarketFileEx(request, headers, runtime)
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
func (client *Client) UploadAppmarketFileEx(request *UploadAppmarketFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAppmarketFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAppmarketFileResponse{}
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
func (client *Client) ExecAppmarketPrivacymodel(request *ExecAppmarketPrivacymodelRequest) (_result *ExecAppmarketPrivacymodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAppmarketPrivacymodelResponse{}
	_body, _err := client.ExecAppmarketPrivacymodelEx(request, headers, runtime)
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
func (client *Client) ExecAppmarketPrivacymodelEx(request *ExecAppmarketPrivacymodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAppmarketPrivacymodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAppmarketPrivacymodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.privacymodel.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SubmitAppmarketPrivacymodel(request *SubmitAppmarketPrivacymodelRequest) (_result *SubmitAppmarketPrivacymodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAppmarketPrivacymodelResponse{}
	_body, _err := client.SubmitAppmarketPrivacymodelEx(request, headers, runtime)
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
func (client *Client) SubmitAppmarketPrivacymodelEx(request *SubmitAppmarketPrivacymodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAppmarketPrivacymodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAppmarketPrivacymodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.adom.appmarket.privacymodel.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
