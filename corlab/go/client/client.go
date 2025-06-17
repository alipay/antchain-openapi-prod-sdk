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

// 产品对应模版字段
type TemplateContext struct {
	// 模版header头
	HeadName *string `json:"head_name,omitempty" xml:"head_name,omitempty" require:"true"`
	// 字段描述
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 是否为必填:REQUIRED,ONE_OF
	RequireType *string `json:"require_type,omitempty" xml:"require_type,omitempty" require:"true"`
}

func (s TemplateContext) String() string {
	return tea.Prettify(s)
}

func (s TemplateContext) GoString() string {
	return s.String()
}

func (s *TemplateContext) SetHeadName(v string) *TemplateContext {
	s.HeadName = &v
	return s
}

func (s *TemplateContext) SetRemark(v string) *TemplateContext {
	s.Remark = &v
	return s
}

func (s *TemplateContext) SetRequireType(v string) *TemplateContext {
	s.RequireType = &v
	return s
}

// 产品信息
type ProductContext struct {
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 模版code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 模版内容,数组
	TemplateContext []*TemplateContext `json:"template_context,omitempty" xml:"template_context,omitempty" require:"true" type:"Repeated"`
	// 产品模型结果字段
	ScoreFields []*string `json:"score_fields,omitempty" xml:"score_fields,omitempty" require:"true" type:"Repeated"`
}

func (s ProductContext) String() string {
	return tea.Prettify(s)
}

func (s ProductContext) GoString() string {
	return s.String()
}

func (s *ProductContext) SetProductCode(v string) *ProductContext {
	s.ProductCode = &v
	return s
}

func (s *ProductContext) SetTemplateCode(v string) *ProductContext {
	s.TemplateCode = &v
	return s
}

func (s *ProductContext) SetTemplateContext(v []*TemplateContext) *ProductContext {
	s.TemplateContext = v
	return s
}

func (s *ProductContext) SetScoreFields(v []*string) *ProductContext {
	s.ScoreFields = v
	return s
}

// corlab任务查询结果信息
type ResultContext struct {
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 结果文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 结果文件下载地址
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
}

func (s ResultContext) String() string {
	return tea.Prettify(s)
}

func (s ResultContext) GoString() string {
	return s.String()
}

func (s *ResultContext) SetProductCode(v string) *ResultContext {
	s.ProductCode = &v
	return s
}

func (s *ResultContext) SetFileName(v string) *ResultContext {
	s.FileName = &v
	return s
}

func (s *ResultContext) SetFileUrl(v string) *ResultContext {
	s.FileUrl = &v
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

type RecognizeModelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部业务唯一标识id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务域
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty" require:"true"`
	// 模型状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 待计算的模型uuid
	ModelUuid *string `json:"model_uuid,omitempty" xml:"model_uuid,omitempty" require:"true"`
	// map的映射的json字符串
	InputContext *string `json:"input_context,omitempty" xml:"input_context,omitempty" require:"true"`
}

func (s RecognizeModelRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeModelRequest) GoString() string {
	return s.String()
}

func (s *RecognizeModelRequest) SetAuthToken(v string) *RecognizeModelRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeModelRequest) SetProductInstanceId(v string) *RecognizeModelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeModelRequest) SetBizId(v string) *RecognizeModelRequest {
	s.BizId = &v
	return s
}

func (s *RecognizeModelRequest) SetDomainCode(v string) *RecognizeModelRequest {
	s.DomainCode = &v
	return s
}

func (s *RecognizeModelRequest) SetStatus(v string) *RecognizeModelRequest {
	s.Status = &v
	return s
}

func (s *RecognizeModelRequest) SetModelUuid(v string) *RecognizeModelRequest {
	s.ModelUuid = &v
	return s
}

func (s *RecognizeModelRequest) SetInputContext(v string) *RecognizeModelRequest {
	s.InputContext = &v
	return s
}

type RecognizeModelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作成功结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 业务码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 数据对象结构体字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RecognizeModelResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeModelResponse) GoString() string {
	return s.String()
}

func (s *RecognizeModelResponse) SetReqMsgId(v string) *RecognizeModelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeModelResponse) SetResultCode(v string) *RecognizeModelResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeModelResponse) SetResultMsg(v string) *RecognizeModelResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeModelResponse) SetSuccess(v bool) *RecognizeModelResponse {
	s.Success = &v
	return s
}

func (s *RecognizeModelResponse) SetResponseCode(v string) *RecognizeModelResponse {
	s.ResponseCode = &v
	return s
}

func (s *RecognizeModelResponse) SetData(v string) *RecognizeModelResponse {
	s.Data = &v
	return s
}

type AddModelTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 回执单号
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 模型名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 模型文件的路径
	ModelFileOssPath *string `json:"model_file_oss_path,omitempty" xml:"model_file_oss_path,omitempty" require:"true"`
	// 验证文件的oss路径
	ValidateFileOssPath *string `json:"validate_file_oss_path,omitempty" xml:"validate_file_oss_path,omitempty" require:"true"`
	// 模型输出参数名称
	ModelOutputLableName *string `json:"model_output_lable_name,omitempty" xml:"model_output_lable_name,omitempty" require:"true"`
	// 验证文件的输出列名
	CsvOutputLableName *string `json:"csv_output_lable_name,omitempty" xml:"csv_output_lable_name,omitempty" require:"true"`
	// 验签字段
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty" require:"true"`
}

func (s AddModelTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s AddModelTaskRequest) GoString() string {
	return s.String()
}

func (s *AddModelTaskRequest) SetAuthToken(v string) *AddModelTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *AddModelTaskRequest) SetProductInstanceId(v string) *AddModelTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddModelTaskRequest) SetCustomerId(v string) *AddModelTaskRequest {
	s.CustomerId = &v
	return s
}

func (s *AddModelTaskRequest) SetReceiptNo(v string) *AddModelTaskRequest {
	s.ReceiptNo = &v
	return s
}

func (s *AddModelTaskRequest) SetModelName(v string) *AddModelTaskRequest {
	s.ModelName = &v
	return s
}

func (s *AddModelTaskRequest) SetModelFileOssPath(v string) *AddModelTaskRequest {
	s.ModelFileOssPath = &v
	return s
}

func (s *AddModelTaskRequest) SetValidateFileOssPath(v string) *AddModelTaskRequest {
	s.ValidateFileOssPath = &v
	return s
}

func (s *AddModelTaskRequest) SetModelOutputLableName(v string) *AddModelTaskRequest {
	s.ModelOutputLableName = &v
	return s
}

func (s *AddModelTaskRequest) SetCsvOutputLableName(v string) *AddModelTaskRequest {
	s.CsvOutputLableName = &v
	return s
}

func (s *AddModelTaskRequest) SetSignInfo(v string) *AddModelTaskRequest {
	s.SignInfo = &v
	return s
}

type AddModelTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 执行的状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 错误信息
	ErrorInfo *string `json:"error_info,omitempty" xml:"error_info,omitempty"`
}

func (s AddModelTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s AddModelTaskResponse) GoString() string {
	return s.String()
}

func (s *AddModelTaskResponse) SetReqMsgId(v string) *AddModelTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddModelTaskResponse) SetResultCode(v string) *AddModelTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *AddModelTaskResponse) SetResultMsg(v string) *AddModelTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddModelTaskResponse) SetTaskId(v string) *AddModelTaskResponse {
	s.TaskId = &v
	return s
}

func (s *AddModelTaskResponse) SetStatus(v string) *AddModelTaskResponse {
	s.Status = &v
	return s
}

func (s *AddModelTaskResponse) SetErrorInfo(v string) *AddModelTaskResponse {
	s.ErrorInfo = &v
	return s
}

type CreateModelbackTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件唯一ID
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 创建任务时回溯的产品
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" require:"true" type:"Repeated"`
	// 样本记录名，不传为file_id
	SampleFileName *string `json:"sample_file_name,omitempty" xml:"sample_file_name,omitempty"`
	// 目前只支持MD5,SHA_256两种加密方式
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
	// 客户方唯一code
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty" require:"true"`
}

func (s CreateModelbackTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateModelbackTaskRequest) GoString() string {
	return s.String()
}

func (s *CreateModelbackTaskRequest) SetAuthToken(v string) *CreateModelbackTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetProductInstanceId(v string) *CreateModelbackTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetFileObject(v io.Reader) *CreateModelbackTaskRequest {
	s.FileObject = v
	return s
}

func (s *CreateModelbackTaskRequest) SetFileObjectName(v string) *CreateModelbackTaskRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetFileId(v string) *CreateModelbackTaskRequest {
	s.FileId = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetProductCodes(v []*string) *CreateModelbackTaskRequest {
	s.ProductCodes = v
	return s
}

func (s *CreateModelbackTaskRequest) SetSampleFileName(v string) *CreateModelbackTaskRequest {
	s.SampleFileName = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetKeyType(v string) *CreateModelbackTaskRequest {
	s.KeyType = &v
	return s
}

func (s *CreateModelbackTaskRequest) SetUniqueCode(v string) *CreateModelbackTaskRequest {
	s.UniqueCode = &v
	return s
}

type CreateModelbackTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务唯一标识
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 任务状态：SUCCESS/RUNNING/FAIL
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateModelbackTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateModelbackTaskResponse) GoString() string {
	return s.String()
}

func (s *CreateModelbackTaskResponse) SetReqMsgId(v string) *CreateModelbackTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateModelbackTaskResponse) SetResultCode(v string) *CreateModelbackTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateModelbackTaskResponse) SetResultMsg(v string) *CreateModelbackTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateModelbackTaskResponse) SetBizCode(v string) *CreateModelbackTaskResponse {
	s.BizCode = &v
	return s
}

func (s *CreateModelbackTaskResponse) SetStatus(v string) *CreateModelbackTaskResponse {
	s.Status = &v
	return s
}

type QueryModelbackTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 根据任务唯一id查询
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
}

func (s QueryModelbackTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelbackTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryModelbackTaskRequest) SetAuthToken(v string) *QueryModelbackTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelbackTaskRequest) SetProductInstanceId(v string) *QueryModelbackTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelbackTaskRequest) SetBizCode(v string) *QueryModelbackTaskRequest {
	s.BizCode = &v
	return s
}

type QueryModelbackTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务唯一id
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 任务对应产品结果信息
	ResultContexts []*ResultContext `json:"result_contexts,omitempty" xml:"result_contexts,omitempty" type:"Repeated"`
	// 任务完成时间
	FinishTime *string `json:"finish_time,omitempty" xml:"finish_time,omitempty"`
}

func (s QueryModelbackTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelbackTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryModelbackTaskResponse) SetReqMsgId(v string) *QueryModelbackTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelbackTaskResponse) SetResultCode(v string) *QueryModelbackTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelbackTaskResponse) SetResultMsg(v string) *QueryModelbackTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelbackTaskResponse) SetBizCode(v string) *QueryModelbackTaskResponse {
	s.BizCode = &v
	return s
}

func (s *QueryModelbackTaskResponse) SetStatus(v string) *QueryModelbackTaskResponse {
	s.Status = &v
	return s
}

func (s *QueryModelbackTaskResponse) SetResultContexts(v []*ResultContext) *QueryModelbackTaskResponse {
	s.ResultContexts = v
	return s
}

func (s *QueryModelbackTaskResponse) SetFinishTime(v string) *QueryModelbackTaskResponse {
	s.FinishTime = &v
	return s
}

type QueryModelbackProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品码，数组形式
	ProductCodes []*string `json:"product_codes,omitempty" xml:"product_codes,omitempty" type:"Repeated"`
}

func (s QueryModelbackProductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelbackProductRequest) GoString() string {
	return s.String()
}

func (s *QueryModelbackProductRequest) SetAuthToken(v string) *QueryModelbackProductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelbackProductRequest) SetProductInstanceId(v string) *QueryModelbackProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelbackProductRequest) SetProductCodes(v []*string) *QueryModelbackProductRequest {
	s.ProductCodes = v
	return s
}

type QueryModelbackProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品模版信息
	ProductContext []*ProductContext `json:"product_context,omitempty" xml:"product_context,omitempty" type:"Repeated"`
}

func (s QueryModelbackProductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelbackProductResponse) GoString() string {
	return s.String()
}

func (s *QueryModelbackProductResponse) SetReqMsgId(v string) *QueryModelbackProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelbackProductResponse) SetResultCode(v string) *QueryModelbackProductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelbackProductResponse) SetResultMsg(v string) *QueryModelbackProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelbackProductResponse) SetProductContext(v []*ProductContext) *QueryModelbackProductResponse {
	s.ProductContext = v
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
				"sdk_version":      tea.String("1.0.16"),
				"_prod_code":       tea.String("CORLAB"),
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
 * Description: 单次模型预测
 * Summary: 模型预测
 */
func (client *Client) RecognizeModel(request *RecognizeModelRequest) (_result *RecognizeModelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeModelResponse{}
	_body, _err := client.RecognizeModelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单次模型预测
 * Summary: 模型预测
 */
func (client *Client) RecognizeModelEx(request *RecognizeModelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeModelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeModelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.corlab.model.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模型投产任务新增
 * Summary: 模型投产任务新增
 */
func (client *Client) AddModelTask(request *AddModelTaskRequest) (_result *AddModelTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddModelTaskResponse{}
	_body, _err := client.AddModelTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模型投产任务新增
 * Summary: 模型投产任务新增
 */
func (client *Client) AddModelTaskEx(request *AddModelTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddModelTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddModelTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.corlab.model.task.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: corlab模型回溯任务创建
 * Summary: corlab模型回溯任务创建
 */
func (client *Client) CreateModelbackTask(request *CreateModelbackTaskRequest) (_result *CreateModelbackTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateModelbackTaskResponse{}
	_body, _err := client.CreateModelbackTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: corlab模型回溯任务创建
 * Summary: corlab模型回溯任务创建
 */
func (client *Client) CreateModelbackTaskEx(request *CreateModelbackTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateModelbackTaskResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antdigital.corlab.modelback.task.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createModelbackTaskResponse := &CreateModelbackTaskResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createModelbackTaskResponse
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
	_result = &CreateModelbackTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.corlab.modelback.task.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: corlab模型回溯任务查询
 * Summary: corlab模型回溯任务查询
 */
func (client *Client) QueryModelbackTask(request *QueryModelbackTaskRequest) (_result *QueryModelbackTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelbackTaskResponse{}
	_body, _err := client.QueryModelbackTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: corlab模型回溯任务查询
 * Summary: corlab模型回溯任务查询
 */
func (client *Client) QueryModelbackTaskEx(request *QueryModelbackTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelbackTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelbackTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.corlab.modelback.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: corlab产品以及产品模版查询
 * Summary: corlab产品以及产品模版查询
 */
func (client *Client) QueryModelbackProduct(request *QueryModelbackProductRequest) (_result *QueryModelbackProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelbackProductResponse{}
	_body, _err := client.QueryModelbackProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: corlab产品以及产品模版查询
 * Summary: corlab产品以及产品模版查询
 */
func (client *Client) QueryModelbackProductEx(request *QueryModelbackProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelbackProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelbackProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.corlab.modelback.product.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
