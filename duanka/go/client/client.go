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

// 查询结果
type QueryResult struct {
	// 工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty" require:"true"`
	// 花名
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 域账号
	LoginAccount *string `json:"login_account,omitempty" xml:"login_account,omitempty" require:"true"`
	// 企业邮箱
	BuMail *string `json:"bu_mail,omitempty" xml:"bu_mail,omitempty" require:"true"`
	// 人员类型
	EmpType *string `json:"emp_type,omitempty" xml:"emp_type,omitempty" require:"true"`
}

func (s QueryResult) String() string {
	return tea.Prettify(s)
}

func (s QueryResult) GoString() string {
	return s.String()
}

func (s *QueryResult) SetWorkNo(v string) *QueryResult {
	s.WorkNo = &v
	return s
}

func (s *QueryResult) SetNickName(v string) *QueryResult {
	s.NickName = &v
	return s
}

func (s *QueryResult) SetName(v string) *QueryResult {
	s.Name = &v
	return s
}

func (s *QueryResult) SetLoginAccount(v string) *QueryResult {
	s.LoginAccount = &v
	return s
}

func (s *QueryResult) SetBuMail(v string) *QueryResult {
	s.BuMail = &v
	return s
}

func (s *QueryResult) SetEmpType(v string) *QueryResult {
	s.EmpType = &v
	return s
}

// Zhx ir 结果
type ZhxIrResultStruct struct {
	// 日合计交易金额指数
	AmtIndexV *string `json:"amt_index_v,omitempty" xml:"amt_index_v,omitempty"`
	// 日合计交易笔数指标
	TransNumIndexV *string `json:"trans_num_index_v,omitempty" xml:"trans_num_index_v,omitempty"`
	// 日合计交易人数指数
	UserNumIndexV *string `json:"user_num_index_v,omitempty" xml:"user_num_index_v,omitempty"`
	// 时间
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty"`
	// 城市等级
	CityLevel *string `json:"city_level,omitempty" xml:"city_level,omitempty"`
}

func (s ZhxIrResultStruct) String() string {
	return tea.Prettify(s)
}

func (s ZhxIrResultStruct) GoString() string {
	return s.String()
}

func (s *ZhxIrResultStruct) SetAmtIndexV(v string) *ZhxIrResultStruct {
	s.AmtIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetTransNumIndexV(v string) *ZhxIrResultStruct {
	s.TransNumIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetUserNumIndexV(v string) *ZhxIrResultStruct {
	s.UserNumIndexV = &v
	return s
}

func (s *ZhxIrResultStruct) SetDt(v string) *ZhxIrResultStruct {
	s.Dt = &v
	return s
}

func (s *ZhxIrResultStruct) SetCityLevel(v string) *ZhxIrResultStruct {
	s.CityLevel = &v
	return s
}

// 用户信息查询结果
type UserInfoResult struct {
	// hr主数据接口调用结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 调用信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 查询结果
	QueryResultList []*QueryResult `json:"query_result_list,omitempty" xml:"query_result_list,omitempty" require:"true" type:"Repeated"`
}

func (s UserInfoResult) String() string {
	return tea.Prettify(s)
}

func (s UserInfoResult) GoString() string {
	return s.String()
}

func (s *UserInfoResult) SetSuccess(v bool) *UserInfoResult {
	s.Success = &v
	return s
}

func (s *UserInfoResult) SetMessage(v string) *UserInfoResult {
	s.Message = &v
	return s
}

func (s *UserInfoResult) SetErrorCode(v string) *UserInfoResult {
	s.ErrorCode = &v
	return s
}

func (s *UserInfoResult) SetQueryResultList(v []*QueryResult) *UserInfoResult {
	s.QueryResultList = v
	return s
}

// 模型结果
type ModelResult struct {
	// 分数
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
}

func (s ModelResult) String() string {
	return tea.Prettify(s)
}

func (s ModelResult) GoString() string {
	return s.String()
}

func (s *ModelResult) SetScore(v string) *ModelResult {
	s.Score = &v
	return s
}

func (s *ModelResult) SetModelId(v string) *ModelResult {
	s.ModelId = &v
	return s
}

type QueryDuankaEvaluationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求流水ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 用户关联订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
	ModelList *string `json:"model_list,omitempty" xml:"model_list,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型：
	// "ID_NO"： 身份证号,
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// 加密类型(目前只支持SHA256):
	// "MD5"：MD5（32位小写）,
	// "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 用户授权模版编号
	AuthTemplateNo *string `json:"auth_template_no,omitempty" xml:"auth_template_no,omitempty" require:"true"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
	RequestTime *string `json:"request_time,omitempty" xml:"request_time,omitempty" require:"true"`
}

func (s QueryDuankaEvaluationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDuankaEvaluationRequest) GoString() string {
	return s.String()
}

func (s *QueryDuankaEvaluationRequest) SetAuthToken(v string) *QueryDuankaEvaluationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetRequestId(v string) *QueryDuankaEvaluationRequest {
	s.RequestId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetOrderId(v string) *QueryDuankaEvaluationRequest {
	s.OrderId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetModelList(v string) *QueryDuankaEvaluationRequest {
	s.ModelList = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetUserId(v string) *QueryDuankaEvaluationRequest {
	s.UserId = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetUserIdType(v string) *QueryDuankaEvaluationRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetEncryptType(v string) *QueryDuankaEvaluationRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetAuthTemplateNo(v string) *QueryDuankaEvaluationRequest {
	s.AuthTemplateNo = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetAuthNo(v string) *QueryDuankaEvaluationRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryDuankaEvaluationRequest) SetRequestTime(v string) *QueryDuankaEvaluationRequest {
	s.RequestTime = &v
	return s
}

type QueryDuankaEvaluationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型结果，数组返回
	Result []*ModelResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 请求流水ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryDuankaEvaluationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDuankaEvaluationResponse) GoString() string {
	return s.String()
}

func (s *QueryDuankaEvaluationResponse) SetReqMsgId(v string) *QueryDuankaEvaluationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResultCode(v string) *QueryDuankaEvaluationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResultMsg(v string) *QueryDuankaEvaluationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetResult(v []*ModelResult) *QueryDuankaEvaluationResponse {
	s.Result = v
	return s
}

func (s *QueryDuankaEvaluationResponse) SetRequestId(v string) *QueryDuankaEvaluationResponse {
	s.RequestId = &v
	return s
}

type QueryHrUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 花名列表
	NickNameList []*string `json:"nick_name_list,omitempty" xml:"nick_name_list,omitempty" type:"Repeated"`
	// 域账户列表
	LoginAccountList []*string `json:"login_account_list,omitempty" xml:"login_account_list,omitempty" type:"Repeated"`
}

func (s QueryHrUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryHrUserRequest) GoString() string {
	return s.String()
}

func (s *QueryHrUserRequest) SetAuthToken(v string) *QueryHrUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryHrUserRequest) SetNickNameList(v []*string) *QueryHrUserRequest {
	s.NickNameList = v
	return s
}

func (s *QueryHrUserRequest) SetLoginAccountList(v []*string) *QueryHrUserRequest {
	s.LoginAccountList = v
	return s
}

type QueryHrUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询用户信息结果
	UserInfoResult *UserInfoResult `json:"user_info_result,omitempty" xml:"user_info_result,omitempty"`
}

func (s QueryHrUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryHrUserResponse) GoString() string {
	return s.String()
}

func (s *QueryHrUserResponse) SetReqMsgId(v string) *QueryHrUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryHrUserResponse) SetResultCode(v string) *QueryHrUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryHrUserResponse) SetResultMsg(v string) *QueryHrUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryHrUserResponse) SetUserInfoResult(v *UserInfoResult) *QueryHrUserResponse {
	s.UserInfoResult = v
	return s
}

type QuerySkyholdResRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务biz_code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 查询key
	KeyId *string `json:"key_id,omitempty" xml:"key_id,omitempty" require:"true"`
	// 渠道code
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
}

func (s QuerySkyholdResRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySkyholdResRequest) GoString() string {
	return s.String()
}

func (s *QuerySkyholdResRequest) SetAuthToken(v string) *QuerySkyholdResRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySkyholdResRequest) SetBizCode(v string) *QuerySkyholdResRequest {
	s.BizCode = &v
	return s
}

func (s *QuerySkyholdResRequest) SetKeyId(v string) *QuerySkyholdResRequest {
	s.KeyId = &v
	return s
}

func (s *QuerySkyholdResRequest) SetChannelCode(v string) *QuerySkyholdResRequest {
	s.ChannelCode = &v
	return s
}

type QuerySkyholdResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	JsonRes *string `json:"json_res,omitempty" xml:"json_res,omitempty"`
}

func (s QuerySkyholdResResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySkyholdResResponse) GoString() string {
	return s.String()
}

func (s *QuerySkyholdResResponse) SetReqMsgId(v string) *QuerySkyholdResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySkyholdResResponse) SetResultCode(v string) *QuerySkyholdResResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySkyholdResResponse) SetResultMsg(v string) *QuerySkyholdResResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySkyholdResResponse) SetJsonRes(v string) *QuerySkyholdResResponse {
	s.JsonRes = &v
	return s
}

type QueryCommonScoreRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	EncryptType *string `json:"encrypt_type,omitempty" xml:"encrypt_type,omitempty" require:"true"`
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// encrypt_type类型的散列后的操作，默认为空不加密。
	// 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING
	// 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。
	// 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdHashEncrypt *string `json:"user_id_hash_encrypt,omitempty" xml:"user_id_hash_encrypt,omitempty"`
}

func (s QueryCommonScoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCommonScoreRequest) GoString() string {
	return s.String()
}

func (s *QueryCommonScoreRequest) SetAuthToken(v string) *QueryCommonScoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCommonScoreRequest) SetAuthNo(v string) *QueryCommonScoreRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryCommonScoreRequest) SetModelId(v string) *QueryCommonScoreRequest {
	s.ModelId = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserId(v string) *QueryCommonScoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserIdType(v string) *QueryCommonScoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryCommonScoreRequest) SetEncryptType(v string) *QueryCommonScoreRequest {
	s.EncryptType = &v
	return s
}

func (s *QueryCommonScoreRequest) SetCustomerCode(v string) *QueryCommonScoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryCommonScoreRequest) SetTransNo(v string) *QueryCommonScoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryCommonScoreRequest) SetUserIdHashEncrypt(v string) *QueryCommonScoreRequest {
	s.UserIdHashEncrypt = &v
	return s
}

type QueryCommonScoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryCommonScoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCommonScoreResponse) GoString() string {
	return s.String()
}

func (s *QueryCommonScoreResponse) SetReqMsgId(v string) *QueryCommonScoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCommonScoreResponse) SetResultCode(v string) *QueryCommonScoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCommonScoreResponse) SetResultMsg(v string) *QueryCommonScoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCommonScoreResponse) SetScore(v string) *QueryCommonScoreResponse {
	s.Score = &v
	return s
}

func (s *QueryCommonScoreResponse) SetTransNo(v string) *QueryCommonScoreResponse {
	s.TransNo = &v
	return s
}

type QueryIrBrandRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 品牌MD5的 32位小写
	Brandmd5 *string `json:"brandmd5,omitempty" xml:"brandmd5,omitempty" require:"true"`
	// 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
	BeginDate *string `json:"begin_date,omitempty" xml:"begin_date,omitempty" require:"true"`
	// 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s QueryIrBrandRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIrBrandRequest) GoString() string {
	return s.String()
}

func (s *QueryIrBrandRequest) SetAuthToken(v string) *QueryIrBrandRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIrBrandRequest) SetBrandmd5(v string) *QueryIrBrandRequest {
	s.Brandmd5 = &v
	return s
}

func (s *QueryIrBrandRequest) SetBeginDate(v string) *QueryIrBrandRequest {
	s.BeginDate = &v
	return s
}

func (s *QueryIrBrandRequest) SetEndDate(v string) *QueryIrBrandRequest {
	s.EndDate = &v
	return s
}

func (s *QueryIrBrandRequest) SetScene(v string) *QueryIrBrandRequest {
	s.Scene = &v
	return s
}

type QueryIrBrandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	DataList []*ZhxIrResultStruct `json:"data_list,omitempty" xml:"data_list,omitempty" type:"Repeated"`
}

func (s QueryIrBrandResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIrBrandResponse) GoString() string {
	return s.String()
}

func (s *QueryIrBrandResponse) SetReqMsgId(v string) *QueryIrBrandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIrBrandResponse) SetResultCode(v string) *QueryIrBrandResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIrBrandResponse) SetResultMsg(v string) *QueryIrBrandResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIrBrandResponse) SetDataList(v []*ZhxIrResultStruct) *QueryIrBrandResponse {
	s.DataList = v
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
				"sdk_version":      tea.String("1.0.6"),
				"_prod_code":       tea.String("DUANKA"),
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
 * Description: 查询断卡结果
 * Summary: 查询断卡结果
 */
func (client *Client) QueryDuankaEvaluation(request *QueryDuankaEvaluationRequest) (_result *QueryDuankaEvaluationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDuankaEvaluationResponse{}
	_body, _err := client.QueryDuankaEvaluationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询断卡结果
 * Summary: 查询断卡结果
 */
func (client *Client) QueryDuankaEvaluationEx(request *QueryDuankaEvaluationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDuankaEvaluationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDuankaEvaluationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.duanka.evaluation.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: hr主数据用户信息查询接口
 * Summary: hr主数据用户信息查询接口
 */
func (client *Client) QueryHrUser(request *QueryHrUserRequest) (_result *QueryHrUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryHrUserResponse{}
	_body, _err := client.QueryHrUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: hr主数据用户信息查询接口
 * Summary: hr主数据用户信息查询接口
 */
func (client *Client) QueryHrUserEx(request *QueryHrUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryHrUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryHrUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.hr.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天擎数据接口查询
 * Summary: 天擎数据接口查询
 */
func (client *Client) QuerySkyholdRes(request *QuerySkyholdResRequest) (_result *QuerySkyholdResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySkyholdResResponse{}
	_body, _err := client.QuerySkyholdResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天擎数据接口查询
 * Summary: 天擎数据接口查询
 */
func (client *Client) QuerySkyholdResEx(request *QuerySkyholdResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySkyholdResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySkyholdResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.skyhold.res.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryCommonScore(request *QueryCommonScoreRequest) (_result *QueryCommonScoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCommonScoreResponse{}
	_body, _err := client.QueryCommonScoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryCommonScoreEx(request *QueryCommonScoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCommonScoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCommonScoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.common.score.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 品牌研究数据查询
 * Summary: 品牌研究数据查询
 */
func (client *Client) QueryIrBrand(request *QueryIrBrandRequest) (_result *QueryIrBrandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIrBrandResponse{}
	_body, _err := client.QueryIrBrandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 品牌研究数据查询
 * Summary: 品牌研究数据查询
 */
func (client *Client) QueryIrBrandEx(request *QueryIrBrandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIrBrandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIrBrandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.duanka.ir.brand.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
