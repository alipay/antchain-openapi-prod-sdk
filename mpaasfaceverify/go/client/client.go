// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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
	// 待认证图片，默认base64格式
	AuthImg *string `json:"auth_img,omitempty" xml:"auth_img,omitempty" require:"true"`
	// 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
	AuthImgType *string `json:"auth_img_type,omitempty" xml:"auth_img_type,omitempty"`
	// 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
	OperationType *string `json:"operation_type,omitempty" xml:"operation_type,omitempty"`
	// 比对源图片
	RefImg *string `json:"ref_img,omitempty" xml:"ref_img,omitempty"`
	// 文件传输支持
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
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

func (s *CertifyServermodeRequest) SetFileObject(v io.Reader) *CertifyServermodeRequest {
	s.FileObject = v
	return s
}

func (s *CertifyServermodeRequest) SetFileObjectName(v string) *CertifyServermodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *CertifyServermodeRequest) SetFileId(v string) *CertifyServermodeRequest {
	s.FileId = &v
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
				"sdk_version":      tea.String("1.1.4"),
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
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antfin.mpaasfaceverify.servermode.certify"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			certifyServermodeResponse := &CertifyServermodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = certifyServermodeResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

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
