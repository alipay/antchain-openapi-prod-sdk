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

type InitAntchainEkycFaceauthWebsdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 比对源照片oss方式中转
	RefImgOssObj *string `json:"ref_img_oss_obj,omitempty" xml:"ref_img_oss_obj,omitempty"`
}

func (s InitAntchainEkycFaceauthWebsdkRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycFaceauthWebsdkRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetAuthToken(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetProductInstanceId(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetBizId(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.BizId = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetExternParam(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.ExternParam = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetIdentityParam(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetMetainfo(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.Metainfo = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetOperationType(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.OperationType = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetRefImg(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.RefImg = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkRequest) SetRefImgOssObj(v string) *InitAntchainEkycFaceauthWebsdkRequest {
	s.RefImgOssObj = &v
	return s
}

type InitAntchainEkycFaceauthWebsdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s InitAntchainEkycFaceauthWebsdkResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycFaceauthWebsdkResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetReqMsgId(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetResultCode(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetResultMsg(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetZimId(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ZimId = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetExternInfo(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetResultCodeSub(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitAntchainEkycFaceauthWebsdkResponse) SetResultMsgSub(v string) *InitAntchainEkycFaceauthWebsdkResponse {
	s.ResultMsgSub = &v
	return s
}

type InitAntchainEkycSingleZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境参数
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty" require:"true"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s InitAntchainEkycSingleZimRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycSingleZimRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycSingleZimRequest) SetAuthToken(v string) *InitAntchainEkycSingleZimRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainEkycSingleZimRequest) SetProductInstanceId(v string) *InitAntchainEkycSingleZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainEkycSingleZimRequest) SetMetaInfo(v string) *InitAntchainEkycSingleZimRequest {
	s.MetaInfo = &v
	return s
}

func (s *InitAntchainEkycSingleZimRequest) SetZimId(v string) *InitAntchainEkycSingleZimRequest {
	s.ZimId = &v
	return s
}

type InitAntchainEkycSingleZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 协议
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 返回码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
}

func (s InitAntchainEkycSingleZimResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycSingleZimResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycSingleZimResponse) SetReqMsgId(v string) *InitAntchainEkycSingleZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetResultCode(v string) *InitAntchainEkycSingleZimResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetResultMsg(v string) *InitAntchainEkycSingleZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetExtParams(v string) *InitAntchainEkycSingleZimResponse {
	s.ExtParams = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetProtocol(v string) *InitAntchainEkycSingleZimResponse {
	s.Protocol = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetRetCode(v string) *InitAntchainEkycSingleZimResponse {
	s.RetCode = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetRetCodeSub(v string) *InitAntchainEkycSingleZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *InitAntchainEkycSingleZimResponse) SetRetMessageSub(v string) *InitAntchainEkycSingleZimResponse {
	s.RetMessageSub = &v
	return s
}

type VerifyAntchainEkycSingleZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 人脸业务参数
	ZimData *string `json:"zim_data,omitempty" xml:"zim_data,omitempty" require:"true"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// zim_data可通过oss方式中转
	ZimDataOssObj *string `json:"zim_data_oss_obj,omitempty" xml:"zim_data_oss_obj,omitempty"`
}

func (s VerifyAntchainEkycSingleZimRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainEkycSingleZimRequest) GoString() string {
	return s.String()
}

func (s *VerifyAntchainEkycSingleZimRequest) SetAuthToken(v string) *VerifyAntchainEkycSingleZimRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimRequest) SetProductInstanceId(v string) *VerifyAntchainEkycSingleZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimRequest) SetExternParam(v string) *VerifyAntchainEkycSingleZimRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimRequest) SetZimData(v string) *VerifyAntchainEkycSingleZimRequest {
	s.ZimData = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimRequest) SetZimId(v string) *VerifyAntchainEkycSingleZimRequest {
	s.ZimId = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimRequest) SetZimDataOssObj(v string) *VerifyAntchainEkycSingleZimRequest {
	s.ZimDataOssObj = &v
	return s
}

type VerifyAntchainEkycSingleZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 产品返回明细码
	ProductRetCode *string `json:"product_ret_code,omitempty" xml:"product_ret_code,omitempty"`
	// 验证返回明细码
	ValidationRetCode *string `json:"validation_ret_code,omitempty" xml:"validation_ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
}

func (s VerifyAntchainEkycSingleZimResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainEkycSingleZimResponse) GoString() string {
	return s.String()
}

func (s *VerifyAntchainEkycSingleZimResponse) SetReqMsgId(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetResultCode(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetResultMsg(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetExtParams(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ExtParams = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetProductRetCode(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ProductRetCode = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetValidationRetCode(v string) *VerifyAntchainEkycSingleZimResponse {
	s.ValidationRetCode = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetRetCodeSub(v string) *VerifyAntchainEkycSingleZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *VerifyAntchainEkycSingleZimResponse) SetRetMessageSub(v string) *VerifyAntchainEkycSingleZimResponse {
	s.RetMessageSub = &v
	return s
}

type InitAntchainEkycMultiZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 环境参数
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty" require:"true"`
	// 实人认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
}

func (s InitAntchainEkycMultiZimRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycMultiZimRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycMultiZimRequest) SetAuthToken(v string) *InitAntchainEkycMultiZimRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainEkycMultiZimRequest) SetProductInstanceId(v string) *InitAntchainEkycMultiZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainEkycMultiZimRequest) SetMetaInfo(v string) *InitAntchainEkycMultiZimRequest {
	s.MetaInfo = &v
	return s
}

func (s *InitAntchainEkycMultiZimRequest) SetCertifyId(v string) *InitAntchainEkycMultiZimRequest {
	s.CertifyId = &v
	return s
}

func (s *InitAntchainEkycMultiZimRequest) SetProductType(v string) *InitAntchainEkycMultiZimRequest {
	s.ProductType = &v
	return s
}

type InitAntchainEkycMultiZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 协议
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 返回码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
}

func (s InitAntchainEkycMultiZimResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycMultiZimResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycMultiZimResponse) SetReqMsgId(v string) *InitAntchainEkycMultiZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetResultCode(v string) *InitAntchainEkycMultiZimResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetResultMsg(v string) *InitAntchainEkycMultiZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetExtParams(v string) *InitAntchainEkycMultiZimResponse {
	s.ExtParams = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetProtocol(v string) *InitAntchainEkycMultiZimResponse {
	s.Protocol = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetRetCode(v string) *InitAntchainEkycMultiZimResponse {
	s.RetCode = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetRetCodeSub(v string) *InitAntchainEkycMultiZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *InitAntchainEkycMultiZimResponse) SetRetMessageSub(v string) *InitAntchainEkycMultiZimResponse {
	s.RetMessageSub = &v
	return s
}

type VerifyAntchainEkycMultiZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 人脸业务参数
	ZimData *string `json:"zim_data,omitempty" xml:"zim_data,omitempty" require:"true"`
	// 实人认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// zim_data可通过oss方式中转
	ZimDataOssObj *string `json:"zim_data_oss_obj,omitempty" xml:"zim_data_oss_obj,omitempty"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty"`
}

func (s VerifyAntchainEkycMultiZimRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainEkycMultiZimRequest) GoString() string {
	return s.String()
}

func (s *VerifyAntchainEkycMultiZimRequest) SetAuthToken(v string) *VerifyAntchainEkycMultiZimRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetProductInstanceId(v string) *VerifyAntchainEkycMultiZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetExternParam(v string) *VerifyAntchainEkycMultiZimRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetZimData(v string) *VerifyAntchainEkycMultiZimRequest {
	s.ZimData = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetCertifyId(v string) *VerifyAntchainEkycMultiZimRequest {
	s.CertifyId = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetZimDataOssObj(v string) *VerifyAntchainEkycMultiZimRequest {
	s.ZimDataOssObj = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimRequest) SetProductType(v string) *VerifyAntchainEkycMultiZimRequest {
	s.ProductType = &v
	return s
}

type VerifyAntchainEkycMultiZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 产品返回明细码
	ProductRetCode *string `json:"product_ret_code,omitempty" xml:"product_ret_code,omitempty"`
	// 验证返回明细码
	ValidationRetCode *string `json:"validation_ret_code,omitempty" xml:"validation_ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
}

func (s VerifyAntchainEkycMultiZimResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainEkycMultiZimResponse) GoString() string {
	return s.String()
}

func (s *VerifyAntchainEkycMultiZimResponse) SetReqMsgId(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetResultCode(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetResultMsg(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetExtParams(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ExtParams = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetProductRetCode(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ProductRetCode = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetValidationRetCode(v string) *VerifyAntchainEkycMultiZimResponse {
	s.ValidationRetCode = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetRetCodeSub(v string) *VerifyAntchainEkycMultiZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *VerifyAntchainEkycMultiZimResponse) SetRetMessageSub(v string) *VerifyAntchainEkycMultiZimResponse {
	s.RetMessageSub = &v
	return s
}

type ConfirmAntchainEkycMultiZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s ConfirmAntchainEkycMultiZimRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainEkycMultiZimRequest) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainEkycMultiZimRequest) SetAuthToken(v string) *ConfirmAntchainEkycMultiZimRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimRequest) SetProductInstanceId(v string) *ConfirmAntchainEkycMultiZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimRequest) SetCertifyId(v string) *ConfirmAntchainEkycMultiZimRequest {
	s.CertifyId = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimRequest) SetExternParam(v string) *ConfirmAntchainEkycMultiZimRequest {
	s.ExternParam = &v
	return s
}

type ConfirmAntchainEkycMultiZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
}

func (s ConfirmAntchainEkycMultiZimResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainEkycMultiZimResponse) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetReqMsgId(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetResultCode(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetResultMsg(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetExtParams(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.ExtParams = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetRetCodeSub(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *ConfirmAntchainEkycMultiZimResponse) SetRetMessageSub(v string) *ConfirmAntchainEkycMultiZimResponse {
	s.RetMessageSub = &v
	return s
}

type InitAntchainEkycVerificationWebsdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
}

func (s InitAntchainEkycVerificationWebsdkRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycVerificationWebsdkRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetAuthToken(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetProductInstanceId(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetBizId(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.BizId = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetSceneId(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.SceneId = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetExternParam(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.ExternParam = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetIdentityParam(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkRequest) SetMetainfo(v string) *InitAntchainEkycVerificationWebsdkRequest {
	s.Metainfo = &v
	return s
}

type InitAntchainEkycVerificationWebsdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s InitAntchainEkycVerificationWebsdkResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycVerificationWebsdkResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetReqMsgId(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetResultCode(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetResultMsg(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetCertifyId(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.CertifyId = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetExternInfo(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetResultCodeSub(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitAntchainEkycVerificationWebsdkResponse) SetResultMsgSub(v string) *InitAntchainEkycVerificationWebsdkResponse {
	s.ResultMsgSub = &v
	return s
}

type InitAntchainEkycVerificationNativeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
}

func (s InitAntchainEkycVerificationNativeRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycVerificationNativeRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycVerificationNativeRequest) SetAuthToken(v string) *InitAntchainEkycVerificationNativeRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetProductInstanceId(v string) *InitAntchainEkycVerificationNativeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetBizId(v string) *InitAntchainEkycVerificationNativeRequest {
	s.BizId = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetSceneId(v string) *InitAntchainEkycVerificationNativeRequest {
	s.SceneId = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetExternParam(v string) *InitAntchainEkycVerificationNativeRequest {
	s.ExternParam = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetIdentityParam(v string) *InitAntchainEkycVerificationNativeRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeRequest) SetMetainfo(v string) *InitAntchainEkycVerificationNativeRequest {
	s.Metainfo = &v
	return s
}

type InitAntchainEkycVerificationNativeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s InitAntchainEkycVerificationNativeResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainEkycVerificationNativeResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainEkycVerificationNativeResponse) SetReqMsgId(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetResultCode(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetResultMsg(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetCertifyId(v string) *InitAntchainEkycVerificationNativeResponse {
	s.CertifyId = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetExternInfo(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetResultCodeSub(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitAntchainEkycVerificationNativeResponse) SetResultMsgSub(v string) *InitAntchainEkycVerificationNativeResponse {
	s.ResultMsgSub = &v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ak_5511b931fbd04feba92b64ebc082aac0"),
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
 * Description: Web实人认证初始化
 * Summary: Web实人认证初始化
 */
func (client *Client) InitAntchainEkycFaceauthWebsdk(request *InitAntchainEkycFaceauthWebsdkRequest) (_result *InitAntchainEkycFaceauthWebsdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainEkycFaceauthWebsdkResponse{}
	_body, _err := client.InitAntchainEkycFaceauthWebsdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Web实人认证初始化
 * Summary: Web实人认证初始化
 */
func (client *Client) InitAntchainEkycFaceauthWebsdkEx(request *InitAntchainEkycFaceauthWebsdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainEkycFaceauthWebsdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainEkycFaceauthWebsdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.faceauth.websdk.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端单产品初始化接口
 * Summary: 客户端单产品初始化
 */
func (client *Client) InitAntchainEkycSingleZim(request *InitAntchainEkycSingleZimRequest) (_result *InitAntchainEkycSingleZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainEkycSingleZimResponse{}
	_body, _err := client.InitAntchainEkycSingleZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端单产品初始化接口
 * Summary: 客户端单产品初始化
 */
func (client *Client) InitAntchainEkycSingleZimEx(request *InitAntchainEkycSingleZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainEkycSingleZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainEkycSingleZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.single.zim.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端单产品认证接口
 * Summary: 客户端单产品认证
 */
func (client *Client) VerifyAntchainEkycSingleZim(request *VerifyAntchainEkycSingleZimRequest) (_result *VerifyAntchainEkycSingleZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAntchainEkycSingleZimResponse{}
	_body, _err := client.VerifyAntchainEkycSingleZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端单产品认证接口
 * Summary: 客户端单产品认证
 */
func (client *Client) VerifyAntchainEkycSingleZimEx(request *VerifyAntchainEkycSingleZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAntchainEkycSingleZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAntchainEkycSingleZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.single.zim.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端多产品初始化接口
 * Summary: 客户端多产品初始化
 */
func (client *Client) InitAntchainEkycMultiZim(request *InitAntchainEkycMultiZimRequest) (_result *InitAntchainEkycMultiZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainEkycMultiZimResponse{}
	_body, _err := client.InitAntchainEkycMultiZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端多产品初始化接口
 * Summary: 客户端多产品初始化
 */
func (client *Client) InitAntchainEkycMultiZimEx(request *InitAntchainEkycMultiZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainEkycMultiZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainEkycMultiZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.multi.zim.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端多产品认证接口
 * Summary: 客户端多产品认证
 */
func (client *Client) VerifyAntchainEkycMultiZim(request *VerifyAntchainEkycMultiZimRequest) (_result *VerifyAntchainEkycMultiZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAntchainEkycMultiZimResponse{}
	_body, _err := client.VerifyAntchainEkycMultiZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端多产品认证接口
 * Summary: 客户端多产品认证
 */
func (client *Client) VerifyAntchainEkycMultiZimEx(request *VerifyAntchainEkycMultiZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAntchainEkycMultiZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAntchainEkycMultiZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.multi.zim.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端多产品确认接口
 * Summary: 客户端多产品确认
 */
func (client *Client) ConfirmAntchainEkycMultiZim(request *ConfirmAntchainEkycMultiZimRequest) (_result *ConfirmAntchainEkycMultiZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmAntchainEkycMultiZimResponse{}
	_body, _err := client.ConfirmAntchainEkycMultiZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端多产品确认接口
 * Summary: 客户端多产品确认
 */
func (client *Client) ConfirmAntchainEkycMultiZimEx(request *ConfirmAntchainEkycMultiZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmAntchainEkycMultiZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmAntchainEkycMultiZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.multi.zim.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: WebEkyc服务端初始化接口
 * Summary: WebEkyc服务端初始化
 */
func (client *Client) InitAntchainEkycVerificationWebsdk(request *InitAntchainEkycVerificationWebsdkRequest) (_result *InitAntchainEkycVerificationWebsdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainEkycVerificationWebsdkResponse{}
	_body, _err := client.InitAntchainEkycVerificationWebsdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: WebEkyc服务端初始化接口
 * Summary: WebEkyc服务端初始化
 */
func (client *Client) InitAntchainEkycVerificationWebsdkEx(request *InitAntchainEkycVerificationWebsdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainEkycVerificationWebsdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainEkycVerificationWebsdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.verification.websdk.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: NativeEkyc服务端初始化接口
 * Summary: NativeEkyc服务端初始化
 */
func (client *Client) InitAntchainEkycVerificationNative(request *InitAntchainEkycVerificationNativeRequest) (_result *InitAntchainEkycVerificationNativeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainEkycVerificationNativeResponse{}
	_body, _err := client.InitAntchainEkycVerificationNativeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: NativeEkyc服务端初始化接口
 * Summary: NativeEkyc服务端初始化
 */
func (client *Client) InitAntchainEkycVerificationNativeEx(request *InitAntchainEkycVerificationNativeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainEkycVerificationNativeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainEkycVerificationNativeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ekyc.verification.native.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
