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

type InitFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	//
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	//
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitFaceauthRequest) SetAuthToken(v string) *InitFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceauthRequest) SetProductInstanceId(v string) *InitFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceauthRequest) SetBizId(v string) *InitFaceauthRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceauthRequest) SetExternParam(v string) *InitFaceauthRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceauthRequest) SetIdentityParam(v string) *InitFaceauthRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceauthRequest) SetMetainfo(v string) *InitFaceauthRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceauthRequest) SetOperationType(v string) *InitFaceauthRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceauthRequest) SetRefImg(v string) *InitFaceauthRequest {
	s.RefImg = &v
	return s
}

type InitFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	//
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitFaceauthResponse) SetReqMsgId(v string) *InitFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceauthResponse) SetResultCode(v string) *InitFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceauthResponse) SetResultMsg(v string) *InitFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceauthResponse) SetExternInfo(v string) *InitFaceauthResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitFaceauthResponse) SetResultCodeSub(v string) *InitFaceauthResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceauthResponse) SetResultMsgSub(v string) *InitFaceauthResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitFaceauthResponse) SetZimId(v string) *InitFaceauthResponse {
	s.ZimId = &v
	return s
}

type QueryFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单据号，用于核对和排查
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// zimId，用于查询认证结果
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s QueryFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthRequest) SetAuthToken(v string) *QueryFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthRequest) SetProductInstanceId(v string) *QueryFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthRequest) SetBizId(v string) *QueryFaceauthRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceauthRequest) SetExternParam(v string) *QueryFaceauthRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFaceauthRequest) SetZimId(v string) *QueryFaceauthRequest {
	s.ZimId = &v
	return s
}

type QueryFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthResponse) SetReqMsgId(v string) *QueryFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthResponse) SetResultCode(v string) *QueryFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthResponse) SetResultMsg(v string) *QueryFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthResponse) SetExternInfo(v string) *QueryFaceauthResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryFaceauthResponse) SetResultCodeSub(v string) *QueryFaceauthResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthResponse) SetResultMsgSub(v string) *QueryFaceauthResponse {
	s.ResultMsgSub = &v
	return s
}

type InitFaceplusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务唯一单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 身份，需要公钥加密
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 客户端采集
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty" require:"true"`
	// 外部参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitFaceplusRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFaceplusRequest) GoString() string {
	return s.String()
}

func (s *InitFaceplusRequest) SetAuthToken(v string) *InitFaceplusRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFaceplusRequest) SetProductInstanceId(v string) *InitFaceplusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFaceplusRequest) SetBizId(v string) *InitFaceplusRequest {
	s.BizId = &v
	return s
}

func (s *InitFaceplusRequest) SetIdentityParam(v string) *InitFaceplusRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitFaceplusRequest) SetMetainfo(v string) *InitFaceplusRequest {
	s.Metainfo = &v
	return s
}

func (s *InitFaceplusRequest) SetExternParam(v string) *InitFaceplusRequest {
	s.ExternParam = &v
	return s
}

func (s *InitFaceplusRequest) SetOperationType(v string) *InitFaceplusRequest {
	s.OperationType = &v
	return s
}

func (s *InitFaceplusRequest) SetRefImg(v string) *InitFaceplusRequest {
	s.RefImg = &v
	return s
}

type InitFaceplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证会话唯一标识
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	//
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 外部参数
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s InitFaceplusResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFaceplusResponse) GoString() string {
	return s.String()
}

func (s *InitFaceplusResponse) SetReqMsgId(v string) *InitFaceplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFaceplusResponse) SetResultCode(v string) *InitFaceplusResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFaceplusResponse) SetResultMsg(v string) *InitFaceplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFaceplusResponse) SetZimId(v string) *InitFaceplusResponse {
	s.ZimId = &v
	return s
}

func (s *InitFaceplusResponse) SetResultCodeSub(v string) *InitFaceplusResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitFaceplusResponse) SetResultMsgSub(v string) *InitFaceplusResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitFaceplusResponse) SetExternInfo(v string) *InitFaceplusResponse {
	s.ExternInfo = &v
	return s
}

type QueryFaceplusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证会话唯一标识
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 唯一单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 外部参数
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryFaceplusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceplusRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceplusRequest) SetAuthToken(v string) *QueryFaceplusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceplusRequest) SetProductInstanceId(v string) *QueryFaceplusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceplusRequest) SetZimId(v string) *QueryFaceplusRequest {
	s.ZimId = &v
	return s
}

func (s *QueryFaceplusRequest) SetBizId(v string) *QueryFaceplusRequest {
	s.BizId = &v
	return s
}

func (s *QueryFaceplusRequest) SetExternParam(v string) *QueryFaceplusRequest {
	s.ExternParam = &v
	return s
}

type QueryFaceplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// 结果信息
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 外部参数
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryFaceplusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceplusResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceplusResponse) SetReqMsgId(v string) *QueryFaceplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceplusResponse) SetResultCode(v string) *QueryFaceplusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceplusResponse) SetResultMsg(v string) *QueryFaceplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceplusResponse) SetResultCodeSub(v string) *QueryFaceplusResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceplusResponse) SetResultMsgSub(v string) *QueryFaceplusResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *QueryFaceplusResponse) SetExternInfo(v string) *QueryFaceplusResponse {
	s.ExternInfo = &v
	return s
}

type QueryFaceauthFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// zoloz认证会话主键
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryFaceauthFileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFileRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFileRequest) SetAuthToken(v string) *QueryFaceauthFileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetProductInstanceId(v string) *QueryFaceauthFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetZimId(v string) *QueryFaceauthFileRequest {
	s.ZimId = &v
	return s
}

func (s *QueryFaceauthFileRequest) SetExternParam(v string) *QueryFaceauthFileRequest {
	s.ExternParam = &v
	return s
}

type QueryFaceauthFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 结果码
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryFaceauthFileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceauthFileResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceauthFileResponse) SetReqMsgId(v string) *QueryFaceauthFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultCode(v string) *QueryFaceauthFileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultMsg(v string) *QueryFaceauthFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetExternInfo(v string) *QueryFaceauthFileResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultCodeSub(v string) *QueryFaceauthFileResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryFaceauthFileResponse) SetResultMsgSub(v string) *QueryFaceauthFileResponse {
	s.ResultMsgSub = &v
	return s
}

type CertifyServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty" require:"true"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 计费规则码
	ChargeCode *string `json:"charge_code,omitempty" xml:"charge_code,omitempty" require:"true"`
	// 待认证图片，默认base64格式
	AuthImg *string `json:"auth_img,omitempty" xml:"auth_img,omitempty" require:"true"`
	// 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
	AuthImgType *string `json:"auth_img_type,omitempty" xml:"auth_img_type,omitempty"`
	// 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s CertifyServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyServermodeRequest) GoString() string {
	return s.String()
}

func (s *CertifyServermodeRequest) SetAuthToken(v string) *CertifyServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyServermodeRequest) SetProductInstanceId(v string) *CertifyServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyServermodeRequest) SetBizId(v string) *CertifyServermodeRequest {
	s.BizId = &v
	return s
}

func (s *CertifyServermodeRequest) SetExternParam(v string) *CertifyServermodeRequest {
	s.ExternParam = &v
	return s
}

func (s *CertifyServermodeRequest) SetIdentityParam(v string) *CertifyServermodeRequest {
	s.IdentityParam = &v
	return s
}

func (s *CertifyServermodeRequest) SetChargeCode(v string) *CertifyServermodeRequest {
	s.ChargeCode = &v
	return s
}

func (s *CertifyServermodeRequest) SetAuthImg(v string) *CertifyServermodeRequest {
	s.AuthImg = &v
	return s
}

func (s *CertifyServermodeRequest) SetAuthImgType(v string) *CertifyServermodeRequest {
	s.AuthImgType = &v
	return s
}

func (s *CertifyServermodeRequest) SetOperationType(v string) *CertifyServermodeRequest {
	s.OperationType = &v
	return s
}

func (s *CertifyServermodeRequest) SetRefImg(v string) *CertifyServermodeRequest {
	s.RefImg = &v
	return s
}

type CertifyServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s CertifyServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyServermodeResponse) GoString() string {
	return s.String()
}

func (s *CertifyServermodeResponse) SetReqMsgId(v string) *CertifyServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyServermodeResponse) SetResultCode(v string) *CertifyServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyServermodeResponse) SetResultMsg(v string) *CertifyServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyServermodeResponse) SetExternInfo(v string) *CertifyServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *CertifyServermodeResponse) SetResultCodeSub(v string) *CertifyServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *CertifyServermodeResponse) SetResultMsgSub(v string) *CertifyServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type InitCertifyrecordRealpersonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 计费规则码
	ChargeCode *string `json:"charge_code,omitempty" xml:"charge_code,omitempty" require:"true"`
	//
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 用户身份信息
	IdentityParam *string `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitCertifyrecordRealpersonRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCertifyrecordRealpersonRequest) GoString() string {
	return s.String()
}

func (s *InitCertifyrecordRealpersonRequest) SetAuthToken(v string) *InitCertifyrecordRealpersonRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetProductInstanceId(v string) *InitCertifyrecordRealpersonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetBizId(v string) *InitCertifyrecordRealpersonRequest {
	s.BizId = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetChargeCode(v string) *InitCertifyrecordRealpersonRequest {
	s.ChargeCode = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetExternParam(v string) *InitCertifyrecordRealpersonRequest {
	s.ExternParam = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetIdentityParam(v string) *InitCertifyrecordRealpersonRequest {
	s.IdentityParam = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetMetainfo(v string) *InitCertifyrecordRealpersonRequest {
	s.Metainfo = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetOperationType(v string) *InitCertifyrecordRealpersonRequest {
	s.OperationType = &v
	return s
}

func (s *InitCertifyrecordRealpersonRequest) SetRefImg(v string) *InitCertifyrecordRealpersonRequest {
	s.RefImg = &v
	return s
}

type InitCertifyrecordRealpersonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 认证单据号
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证h5 url
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s InitCertifyrecordRealpersonResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCertifyrecordRealpersonResponse) GoString() string {
	return s.String()
}

func (s *InitCertifyrecordRealpersonResponse) SetReqMsgId(v string) *InitCertifyrecordRealpersonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetResultCode(v string) *InitCertifyrecordRealpersonResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetResultMsg(v string) *InitCertifyrecordRealpersonResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetExternInfo(v string) *InitCertifyrecordRealpersonResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetResultCodeSub(v string) *InitCertifyrecordRealpersonResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetResultMsgSub(v string) *InitCertifyrecordRealpersonResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetCertifyId(v string) *InitCertifyrecordRealpersonResponse {
	s.CertifyId = &v
	return s
}

func (s *InitCertifyrecordRealpersonResponse) SetCertifyUrl(v string) *InitCertifyrecordRealpersonResponse {
	s.CertifyUrl = &v
	return s
}

type InitCertifyrecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 计费规则码
	ChargeCode *string `json:"charge_code,omitempty" xml:"charge_code,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// metainfo环境参数
	Metainfo *string `json:"metainfo,omitempty" xml:"metainfo,omitempty"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
}

func (s InitCertifyrecordRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCertifyrecordRequest) GoString() string {
	return s.String()
}

func (s *InitCertifyrecordRequest) SetAuthToken(v string) *InitCertifyrecordRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCertifyrecordRequest) SetProductInstanceId(v string) *InitCertifyrecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCertifyrecordRequest) SetBizId(v string) *InitCertifyrecordRequest {
	s.BizId = &v
	return s
}

func (s *InitCertifyrecordRequest) SetChargeCode(v string) *InitCertifyrecordRequest {
	s.ChargeCode = &v
	return s
}

func (s *InitCertifyrecordRequest) SetExternParam(v string) *InitCertifyrecordRequest {
	s.ExternParam = &v
	return s
}

func (s *InitCertifyrecordRequest) SetMetainfo(v string) *InitCertifyrecordRequest {
	s.Metainfo = &v
	return s
}

func (s *InitCertifyrecordRequest) SetOperationType(v string) *InitCertifyrecordRequest {
	s.OperationType = &v
	return s
}

func (s *InitCertifyrecordRequest) SetRefImg(v string) *InitCertifyrecordRequest {
	s.RefImg = &v
	return s
}

type InitCertifyrecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 认证单据号
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证h5 url
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s InitCertifyrecordResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCertifyrecordResponse) GoString() string {
	return s.String()
}

func (s *InitCertifyrecordResponse) SetReqMsgId(v string) *InitCertifyrecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCertifyrecordResponse) SetResultCode(v string) *InitCertifyrecordResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCertifyrecordResponse) SetResultMsg(v string) *InitCertifyrecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCertifyrecordResponse) SetExternInfo(v string) *InitCertifyrecordResponse {
	s.ExternInfo = &v
	return s
}

func (s *InitCertifyrecordResponse) SetResultCodeSub(v string) *InitCertifyrecordResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *InitCertifyrecordResponse) SetResultMsgSub(v string) *InitCertifyrecordResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *InitCertifyrecordResponse) SetCertifyId(v string) *InitCertifyrecordResponse {
	s.CertifyId = &v
	return s
}

func (s *InitCertifyrecordResponse) SetCertifyUrl(v string) *InitCertifyrecordResponse {
	s.CertifyUrl = &v
	return s
}

type QueryCertifyrecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// certifyId，用于查询认证结果
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
}

func (s QueryCertifyrecordRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCertifyrecordRequest) GoString() string {
	return s.String()
}

func (s *QueryCertifyrecordRequest) SetAuthToken(v string) *QueryCertifyrecordRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCertifyrecordRequest) SetProductInstanceId(v string) *QueryCertifyrecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCertifyrecordRequest) SetExternParam(v string) *QueryCertifyrecordRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryCertifyrecordRequest) SetCertifyId(v string) *QueryCertifyrecordRequest {
	s.CertifyId = &v
	return s
}

type QueryCertifyrecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s QueryCertifyrecordResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCertifyrecordResponse) GoString() string {
	return s.String()
}

func (s *QueryCertifyrecordResponse) SetReqMsgId(v string) *QueryCertifyrecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCertifyrecordResponse) SetResultCode(v string) *QueryCertifyrecordResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCertifyrecordResponse) SetResultMsg(v string) *QueryCertifyrecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCertifyrecordResponse) SetExternInfo(v string) *QueryCertifyrecordResponse {
	s.ExternInfo = &v
	return s
}

func (s *QueryCertifyrecordResponse) SetResultCodeSub(v string) *QueryCertifyrecordResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *QueryCertifyrecordResponse) SetResultMsgSub(v string) *QueryCertifyrecordResponse {
	s.ResultMsgSub = &v
	return s
}

type UploadOcrServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 操作类型
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 计费规则码
	ChargeCode *string `json:"charge_code,omitempty" xml:"charge_code,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 对称密钥加密的ocr内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 非对称密钥加密后的对称密钥
	ContentSig *string `json:"content_sig,omitempty" xml:"content_sig,omitempty" require:"true"`
}

func (s UploadOcrServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadOcrServermodeRequest) GoString() string {
	return s.String()
}

func (s *UploadOcrServermodeRequest) SetAuthToken(v string) *UploadOcrServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetProductInstanceId(v string) *UploadOcrServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetBizId(v string) *UploadOcrServermodeRequest {
	s.BizId = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetOperationType(v string) *UploadOcrServermodeRequest {
	s.OperationType = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetChargeCode(v string) *UploadOcrServermodeRequest {
	s.ChargeCode = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetExternParam(v string) *UploadOcrServermodeRequest {
	s.ExternParam = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetContent(v string) *UploadOcrServermodeRequest {
	s.Content = &v
	return s
}

func (s *UploadOcrServermodeRequest) SetContentSig(v string) *UploadOcrServermodeRequest {
	s.ContentSig = &v
	return s
}

type UploadOcrServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
	// 认证单据号
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s UploadOcrServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadOcrServermodeResponse) GoString() string {
	return s.String()
}

func (s *UploadOcrServermodeResponse) SetReqMsgId(v string) *UploadOcrServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetResultCode(v string) *UploadOcrServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetResultMsg(v string) *UploadOcrServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetExternInfo(v string) *UploadOcrServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetResultCodeSub(v string) *UploadOcrServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetResultMsgSub(v string) *UploadOcrServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

func (s *UploadOcrServermodeResponse) SetCertifyId(v string) *UploadOcrServermodeResponse {
	s.CertifyId = &v
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
				"sdk_version":      tea.String("1.1.15"),
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
 * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: 实人认证初始化
 */
func (client *Client) InitFaceauth(request *InitFaceauthRequest) (_result *InitFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceauthResponse{}
	_body, _err := client.InitFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
 * Summary: 实人认证初始化
 */
func (client *Client) InitFaceauthEx(request *InitFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
 * Summary: 实人认证查询
 */
func (client *Client) QueryFaceauth(request *QueryFaceauthRequest) (_result *QueryFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthResponse{}
	_body, _err := client.QueryFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
 * Summary: 实人认证查询
 */
func (client *Client) QueryFaceauthEx(request *QueryFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端初始化
 * Summary: 人脸双因子认证服务端初始化
 */
func (client *Client) InitFaceplus(request *InitFaceplusRequest) (_result *InitFaceplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFaceplusResponse{}
	_body, _err := client.InitFaceplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端初始化
 * Summary: 人脸双因子认证服务端初始化
 */
func (client *Client) InitFaceplusEx(request *InitFaceplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFaceplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFaceplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.faceplus.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端查询
 * Summary: 人脸双因子认证服务端查询
 */
func (client *Client) QueryFaceplus(request *QueryFaceplusRequest) (_result *QueryFaceplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceplusResponse{}
	_body, _err := client.QueryFaceplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 人脸双因子认证服务端查询
 * Summary: 人脸双因子认证服务端查询
 */
func (client *Client) QueryFaceplusEx(request *QueryFaceplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.faceplus.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
 * Summary: 获取认证资料
 */
func (client *Client) QueryFaceauthFile(request *QueryFaceauthFileRequest) (_result *QueryFaceauthFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceauthFileResponse{}
	_body, _err := client.QueryFaceauthFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
 * Summary: 获取认证资料
 */
func (client *Client) QueryFaceauthFileEx(request *QueryFaceauthFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceauthFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceauthFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.faceauth.file.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
 * Summary: 实人认证核验源服务
 */
func (client *Client) CertifyServermode(request *CertifyServermodeRequest) (_result *CertifyServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyServermodeResponse{}
	_body, _err := client.CertifyServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
 * Summary: 实人认证核验源服务
 */
func (client *Client) CertifyServermodeEx(request *CertifyServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyServermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.servermode.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
 * Summary: 实人认证单据初始化服务
 */
func (client *Client) InitCertifyrecordRealperson(request *InitCertifyrecordRealpersonRequest) (_result *InitCertifyrecordRealpersonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCertifyrecordRealpersonResponse{}
	_body, _err := client.InitCertifyrecordRealpersonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
 * Summary: 实人认证单据初始化服务
 */
func (client *Client) InitCertifyrecordRealpersonEx(request *InitCertifyrecordRealpersonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCertifyrecordRealpersonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCertifyrecordRealpersonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.certifyrecord.realperson.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
 * Summary: 认证单据初始化服务(无身份)
 */
func (client *Client) InitCertifyrecord(request *InitCertifyrecordRequest) (_result *InitCertifyrecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCertifyrecordResponse{}
	_body, _err := client.InitCertifyrecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
 * Summary: 认证单据初始化服务(无身份)
 */
func (client *Client) InitCertifyrecordEx(request *InitCertifyrecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCertifyrecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCertifyrecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.certifyrecord.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
 * Summary: 实人认证查询(certifyId)
 */
func (client *Client) QueryCertifyrecord(request *QueryCertifyrecordRequest) (_result *QueryCertifyrecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCertifyrecordResponse{}
	_body, _err := client.QueryCertifyrecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
 * Summary: 实人认证查询(certifyId)
 */
func (client *Client) QueryCertifyrecordEx(request *QueryCertifyrecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCertifyrecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCertifyrecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.certifyrecord.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
 * Summary: OCR数据上传接口
 */
func (client *Client) UploadOcrServermode(request *UploadOcrServermodeRequest) (_result *UploadOcrServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadOcrServermodeResponse{}
	_body, _err := client.UploadOcrServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
 * Summary: OCR数据上传接口
 */
func (client *Client) UploadOcrServermodeEx(request *UploadOcrServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadOcrServermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadOcrServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antfin.mpaasfaceverify.ocr.servermode.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
