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

type QueryFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 认证材料（如人脸图像）的哈希
	MaterialHash *string `json:"material_hash,omitempty" xml:"material_hash,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
}

func (s QueryFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *QueryFacevrfServerRequest) SetAuthToken(v string) *QueryFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetProductInstanceId(v string) *QueryFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetCertifyId(v string) *QueryFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetExternParam(v string) *QueryFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetMaterialHash(v string) *QueryFacevrfServerRequest {
	s.MaterialHash = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetOuterOrderNo(v string) *QueryFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryFacevrfServerRequest) SetSceneId(v string) *QueryFacevrfServerRequest {
	s.SceneId = &v
	return s
}

type QueryFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的主体信息，一般的认证场景返回为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 认证主体附件信息，一般的认证场景都是返回空
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
	// 认证材料哈希是否匹配
	MaterialMatched *string `json:"material_matched,omitempty" xml:"material_matched,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s QueryFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *QueryFacevrfServerResponse) SetReqMsgId(v string) *QueryFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetResultCode(v string) *QueryFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetResultMsg(v string) *QueryFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetIdentityInfo(v string) *QueryFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetMaterialInfo(v string) *QueryFacevrfServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetMaterialMatched(v string) *QueryFacevrfServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetPassed(v string) *QueryFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryFacevrfServerResponse) SetReason(v string) *QueryFacevrfServerResponse {
	s.Reason = &v
	return s
}

type CreateFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证模式码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// h5认证完成后，服务端回调此地址通知商户认证结果
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// callbackUrl回调时是否需要重试，默认false(不需要重试)
	CallbackNeedRetry *bool `json:"callback_need_retry,omitempty" xml:"callback_need_retry,omitempty"`
}

func (s CreateFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *CreateFacevrfServerRequest) SetAuthToken(v string) *CreateFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetProductInstanceId(v string) *CreateFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetBizCode(v string) *CreateFacevrfServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCallbackUrl(v string) *CreateFacevrfServerRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertName(v string) *CreateFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertNo(v string) *CreateFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCertType(v string) *CreateFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetExternParam(v string) *CreateFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetFacialPictureRef(v string) *CreateFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetIdentityType(v string) *CreateFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetMetaInfo(v string) *CreateFacevrfServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetOuterOrderNo(v string) *CreateFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetReturnUrl(v string) *CreateFacevrfServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetSceneId(v string) *CreateFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserId(v string) *CreateFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserIp(v string) *CreateFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetUserMobile(v string) *CreateFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

func (s *CreateFacevrfServerRequest) SetCallbackNeedRetry(v bool) *CreateFacevrfServerRequest {
	s.CallbackNeedRetry = &v
	return s
}

type CreateFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *CreateFacevrfServerResponse) SetReqMsgId(v string) *CreateFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetResultCode(v string) *CreateFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetResultMsg(v string) *CreateFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetCertifyId(v string) *CreateFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateFacevrfServerResponse) SetCertifyUrl(v string) *CreateFacevrfServerResponse {
	s.CertifyUrl = &v
	return s
}

type ExecFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号（或其哈希值）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 待认证的人脸图像，base64编码格式
	FacialPictureAuth *string `json:"facial_picture_auth,omitempty" xml:"facial_picture_auth,omitempty" require:"true"`
}

func (s ExecFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServerRequest) SetAuthToken(v string) *ExecFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetProductInstanceId(v string) *ExecFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertName(v string) *ExecFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertNo(v string) *ExecFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetCertType(v string) *ExecFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetExternParam(v string) *ExecFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetFacialPictureRef(v string) *ExecFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetIdentityType(v string) *ExecFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetOuterOrderNo(v string) *ExecFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetSceneId(v string) *ExecFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserId(v string) *ExecFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserIp(v string) *ExecFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetUserMobile(v string) *ExecFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

func (s *ExecFacevrfServerRequest) SetFacialPictureAuth(v string) *ExecFacevrfServerRequest {
	s.FacialPictureAuth = &v
	return s
}

type ExecFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s ExecFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *ExecFacevrfServerResponse) SetReqMsgId(v string) *ExecFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetResultCode(v string) *ExecFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetResultMsg(v string) *ExecFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetCertifyId(v string) *ExecFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetPassed(v string) *ExecFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *ExecFacevrfServerResponse) SetReason(v string) *ExecFacevrfServerResponse {
	s.Reason = &v
	return s
}

type GetFacevrfEvidenceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 某次刷脸的certifyId
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
}

func (s GetFacevrfEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFacevrfEvidenceRequest) GoString() string {
	return s.String()
}

func (s *GetFacevrfEvidenceRequest) SetAuthToken(v string) *GetFacevrfEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFacevrfEvidenceRequest) SetProductInstanceId(v string) *GetFacevrfEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFacevrfEvidenceRequest) SetCertifyId(v string) *GetFacevrfEvidenceRequest {
	s.CertifyId = &v
	return s
}

type GetFacevrfEvidenceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 刷脸的certifyId，原样返回
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
	OnchainId *string `json:"onchain_id,omitempty" xml:"onchain_id,omitempty"`
	// 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
	OnchainStatus *string `json:"onchain_status,omitempty" xml:"onchain_status,omitempty"`
	// pdf存证是否已经过期，不支持超过6个月的存证获取
	PdfExpired *bool `json:"pdf_expired,omitempty" xml:"pdf_expired,omitempty"`
	// 存证pdf文件内容的base64
	PdfContent *string `json:"pdf_content,omitempty" xml:"pdf_content,omitempty"`
}

func (s GetFacevrfEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFacevrfEvidenceResponse) GoString() string {
	return s.String()
}

func (s *GetFacevrfEvidenceResponse) SetReqMsgId(v string) *GetFacevrfEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetResultCode(v string) *GetFacevrfEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetResultMsg(v string) *GetFacevrfEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetCertifyId(v string) *GetFacevrfEvidenceResponse {
	s.CertifyId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetOnchainId(v string) *GetFacevrfEvidenceResponse {
	s.OnchainId = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetOnchainStatus(v string) *GetFacevrfEvidenceResponse {
	s.OnchainStatus = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetPdfExpired(v bool) *GetFacevrfEvidenceResponse {
	s.PdfExpired = &v
	return s
}

func (s *GetFacevrfEvidenceResponse) SetPdfContent(v string) *GetFacevrfEvidenceResponse {
	s.PdfContent = &v
	return s
}

type CheckIndividualidTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckIndividualidTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidTwometaRequest) SetAuthToken(v string) *CheckIndividualidTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetProductInstanceId(v string) *CheckIndividualidTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetOuterOrderNo(v string) *CheckIndividualidTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetCertName(v string) *CheckIndividualidTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetCertNo(v string) *CheckIndividualidTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidTwometaRequest) SetExternParam(v string) *CheckIndividualidTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckIndividualidTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功  false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidTwometaResponse) SetReqMsgId(v string) *CheckIndividualidTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetResultCode(v string) *CheckIndividualidTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetResultMsg(v string) *CheckIndividualidTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetMatch(v string) *CheckIndividualidTwometaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidTwometaResponse) SetExternInfo(v string) *CheckIndividualidTwometaResponse {
	s.ExternInfo = &v
	return s
}

type CheckIndividualidThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckIndividualidThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidThreemetaRequest) SetAuthToken(v string) *CheckIndividualidThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetProductInstanceId(v string) *CheckIndividualidThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetOuterOrderNo(v string) *CheckIndividualidThreemetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetCertName(v string) *CheckIndividualidThreemetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetCertNo(v string) *CheckIndividualidThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetMobile(v string) *CheckIndividualidThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckIndividualidThreemetaRequest) SetExternParam(v string) *CheckIndividualidThreemetaRequest {
	s.ExternParam = &v
	return s
}

type CheckIndividualidThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidThreemetaResponse) SetReqMsgId(v string) *CheckIndividualidThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetResultCode(v string) *CheckIndividualidThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetResultMsg(v string) *CheckIndividualidThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetMatch(v string) *CheckIndividualidThreemetaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidThreemetaResponse) SetExternInfo(v string) *CheckIndividualidThreemetaResponse {
	s.ExternInfo = &v
	return s
}

type CheckIndividualidFourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	//
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckIndividualidFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidFourmetaRequest) GoString() string {
	return s.String()
}

func (s *CheckIndividualidFourmetaRequest) SetAuthToken(v string) *CheckIndividualidFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetProductInstanceId(v string) *CheckIndividualidFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetOuterOrderNo(v string) *CheckIndividualidFourmetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetCertName(v string) *CheckIndividualidFourmetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetCertNo(v string) *CheckIndividualidFourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetMobile(v string) *CheckIndividualidFourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetBankCard(v string) *CheckIndividualidFourmetaRequest {
	s.BankCard = &v
	return s
}

func (s *CheckIndividualidFourmetaRequest) SetExternParam(v string) *CheckIndividualidFourmetaRequest {
	s.ExternParam = &v
	return s
}

type CheckIndividualidFourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	//
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	//
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckIndividualidFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckIndividualidFourmetaResponse) GoString() string {
	return s.String()
}

func (s *CheckIndividualidFourmetaResponse) SetReqMsgId(v string) *CheckIndividualidFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetResultCode(v string) *CheckIndividualidFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetResultMsg(v string) *CheckIndividualidFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetMatch(v string) *CheckIndividualidFourmetaResponse {
	s.Match = &v
	return s
}

func (s *CheckIndividualidFourmetaResponse) SetExternInfo(v string) *CheckIndividualidFourmetaResponse {
	s.ExternInfo = &v
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
				"sdk_version":      tea.String("1.1.8"),
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
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFacevrfServer(request *QueryFacevrfServerRequest) (_result *QueryFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFacevrfServerResponse{}
	_body, _err := client.QueryFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryFacevrfServerEx(request *QueryFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
 * Summary: 认证创建
 */
func (client *Client) CreateFacevrfServer(request *CreateFacevrfServerRequest) (_result *CreateFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFacevrfServerResponse{}
	_body, _err := client.CreateFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
 * Summary: 认证创建
 */
func (client *Client) CreateFacevrfServerEx(request *CreateFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对
 */
func (client *Client) ExecFacevrfServer(request *ExecFacevrfServerRequest) (_result *ExecFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecFacevrfServerResponse{}
	_body, _err := client.ExecFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
 * Summary: 纯服务端比对
 */
func (client *Client) ExecFacevrfServerEx(request *ExecFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
 * Summary: 商户获取司法链上刷脸存证和统一证据ID
 */
func (client *Client) GetFacevrfEvidence(request *GetFacevrfEvidenceRequest) (_result *GetFacevrfEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFacevrfEvidenceResponse{}
	_body, _err := client.GetFacevrfEvidenceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
 * Summary: 商户获取司法链上刷脸存证和统一证据ID
 */
func (client *Client) GetFacevrfEvidenceEx(request *GetFacevrfEvidenceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFacevrfEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFacevrfEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.evidence.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人二要素认证
 * Summary: 个人二要素认证
 */
func (client *Client) CheckIndividualidTwometa(request *CheckIndividualidTwometaRequest) (_result *CheckIndividualidTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidTwometaResponse{}
	_body, _err := client.CheckIndividualidTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人二要素认证
 * Summary: 个人二要素认证
 */
func (client *Client) CheckIndividualidTwometaEx(request *CheckIndividualidTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人三要素认证
 * Summary: 个人三要素认证
 */
func (client *Client) CheckIndividualidThreemeta(request *CheckIndividualidThreemetaRequest) (_result *CheckIndividualidThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidThreemetaResponse{}
	_body, _err := client.CheckIndividualidThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人三要素认证
 * Summary: 个人三要素认证
 */
func (client *Client) CheckIndividualidThreemetaEx(request *CheckIndividualidThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人四要素认证
 * Summary: 个人四要素认证
 */
func (client *Client) CheckIndividualidFourmeta(request *CheckIndividualidFourmetaRequest) (_result *CheckIndividualidFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckIndividualidFourmetaResponse{}
	_body, _err := client.CheckIndividualidFourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人四要素认证
 * Summary: 个人四要素认证
 */
func (client *Client) CheckIndividualidFourmetaEx(request *CheckIndividualidFourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckIndividualidFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckIndividualidFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.individualid.fourmeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
