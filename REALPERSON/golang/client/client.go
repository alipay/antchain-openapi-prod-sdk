// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	alipayutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
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

type QueryIRealpersonFacevrfServerRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 认证材料（如人脸图像）的哈希
	MaterialHash *string `json:"material_hash,omitempty" xml:"material_hash,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
}

func (s QueryIRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *QueryIRealpersonFacevrfServerRequest) SetAuthToken(v string) *QueryIRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerRequest) SetCertifyId(v string) *QueryIRealpersonFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerRequest) SetExternParam(v string) *QueryIRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerRequest) SetMaterialHash(v string) *QueryIRealpersonFacevrfServerRequest {
	s.MaterialHash = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *QueryIRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerRequest) SetSceneId(v string) *QueryIRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

type QueryIRealpersonFacevrfServerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryIRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *QueryIRealpersonFacevrfServerResponse) SetReqMsgId(v string) *QueryIRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetResultCode(v string) *QueryIRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetResultMsg(v string) *QueryIRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetIdentityInfo(v string) *QueryIRealpersonFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetMaterialInfo(v string) *QueryIRealpersonFacevrfServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetMaterialMatched(v string) *QueryIRealpersonFacevrfServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetPassed(v string) *QueryIRealpersonFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryIRealpersonFacevrfServerResponse) SetReason(v string) *QueryIRealpersonFacevrfServerResponse {
	s.Reason = &v
	return s
}

type CreateIRealpersonFacevrfServerRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 认证模式码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty"`
	// metainfo 环境参数，需要通过客户端 SDK 获取
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty"`
	// 外部唯一标识。用于定位。
	// 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty"`
	// 回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
}

func (s CreateIRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateIRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *CreateIRealpersonFacevrfServerRequest) SetAuthToken(v string) *CreateIRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetBizCode(v string) *CreateIRealpersonFacevrfServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetCertName(v string) *CreateIRealpersonFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetCertNo(v string) *CreateIRealpersonFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetCertType(v string) *CreateIRealpersonFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetExternParam(v string) *CreateIRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetFacialPictureRef(v string) *CreateIRealpersonFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetIdentityType(v string) *CreateIRealpersonFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetMetaInfo(v string) *CreateIRealpersonFacevrfServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *CreateIRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetReturnUrl(v string) *CreateIRealpersonFacevrfServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetSceneId(v string) *CreateIRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetUserId(v string) *CreateIRealpersonFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetUserIp(v string) *CreateIRealpersonFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerRequest) SetUserMobile(v string) *CreateIRealpersonFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

type CreateIRealpersonFacevrfServerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateIRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateIRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *CreateIRealpersonFacevrfServerResponse) SetReqMsgId(v string) *CreateIRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerResponse) SetResultCode(v string) *CreateIRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerResponse) SetResultMsg(v string) *CreateIRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerResponse) SetCertifyId(v string) *CreateIRealpersonFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateIRealpersonFacevrfServerResponse) SetCertifyUrl(v string) *CreateIRealpersonFacevrfServerResponse {
	s.CertifyUrl = &v
	return s
}

type ExecIRealpersonFacevrfServerRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型，如身份证
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 待认证的人脸图像，base64编码格式
	FacialPictureAuth *string `json:"facial_picture_auth,omitempty" xml:"facial_picture_auth,omitempty"`
	// 自定义比对源人脸图像，base64编码格式
	FacialPictureRef *string `json:"facial_picture_ref,omitempty" xml:"facial_picture_ref,omitempty"`
	// 身份信息来源类型，如证件
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户的IP
	UserIp *string `json:"user_ip,omitempty" xml:"user_ip,omitempty"`
	// 用户的手机号（或其哈希值）
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
}

func (s ExecIRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecIRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *ExecIRealpersonFacevrfServerRequest) SetAuthToken(v string) *ExecIRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetCertName(v string) *ExecIRealpersonFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetCertNo(v string) *ExecIRealpersonFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetCertType(v string) *ExecIRealpersonFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetExternParam(v string) *ExecIRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetFacialPictureAuth(v string) *ExecIRealpersonFacevrfServerRequest {
	s.FacialPictureAuth = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetFacialPictureRef(v string) *ExecIRealpersonFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetIdentityType(v string) *ExecIRealpersonFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *ExecIRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetSceneId(v string) *ExecIRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetUserId(v string) *ExecIRealpersonFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetUserIp(v string) *ExecIRealpersonFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerRequest) SetUserMobile(v string) *ExecIRealpersonFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

type ExecIRealpersonFacevrfServerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否通过，通过为T，不通过为F
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	// 业务失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
}

func (s ExecIRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecIRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *ExecIRealpersonFacevrfServerResponse) SetReqMsgId(v string) *ExecIRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerResponse) SetResultCode(v string) *ExecIRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerResponse) SetResultMsg(v string) *ExecIRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerResponse) SetCertifyId(v string) *ExecIRealpersonFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerResponse) SetPassed(v string) *ExecIRealpersonFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *ExecIRealpersonFacevrfServerResponse) SetReason(v string) *ExecIRealpersonFacevrfServerResponse {
	s.Reason = &v
	return s
}

type GetIRealpersonFacevrfEvidenceRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 某次刷脸的certifyId
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s GetIRealpersonFacevrfEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetIRealpersonFacevrfEvidenceRequest) GoString() string {
	return s.String()
}

func (s *GetIRealpersonFacevrfEvidenceRequest) SetAuthToken(v string) *GetIRealpersonFacevrfEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceRequest) SetCertifyId(v string) *GetIRealpersonFacevrfEvidenceRequest {
	s.CertifyId = &v
	return s
}

type GetIRealpersonFacevrfEvidenceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 刷脸的certifyId，原样返回
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
	OnchainId *string `json:"onchain_id,omitempty" xml:"onchain_id,omitempty"`
	// 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
	OnchainStatus *string `json:"onchain_status,omitempty" xml:"onchain_status,omitempty"`
	// 存证pdf文件内容的base64
	PdfContent *string `json:"pdf_content,omitempty" xml:"pdf_content,omitempty"`
	// pdf存证是否已经过期，不支持超过6个月的存证获取
	PdfExpired *bool `json:"pdf_expired,omitempty" xml:"pdf_expired,omitempty"`
}

func (s GetIRealpersonFacevrfEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetIRealpersonFacevrfEvidenceResponse) GoString() string {
	return s.String()
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetReqMsgId(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetResultCode(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetResultMsg(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetCertifyId(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.CertifyId = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetOnchainId(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.OnchainId = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetOnchainStatus(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.OnchainStatus = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetPdfContent(v string) *GetIRealpersonFacevrfEvidenceResponse {
	s.PdfContent = &v
	return s
}

func (s *GetIRealpersonFacevrfEvidenceResponse) SetPdfExpired(v bool) *GetIRealpersonFacevrfEvidenceResponse {
	s.PdfExpired = &v
	return s
}

type Client struct {
	Endpoint        *string
	RegionId        *string
	AccessKeyId     *string
	AccessKeySecret *string
	Protocol        *string
	UserAgent       *string
	ReadTimeout     *int
	ConnectTimeout  *int
	HttpProxy       *string
	HttpsProxy      *string
	Socks5Proxy     *string
	Socks5NetWork   *string
	NoProxy         *string
	MaxIdleConns    *int
	SecurityToken   *string
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
	client.ReadTimeout = config.ReadTimeout
	client.ConnectTimeout = config.ConnectTimeout
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = config.MaxIdleConns
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":      "retry",
		"readTimeout":    tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout": tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":      tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":     tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":        tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":   tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
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
				"method":         action,
				"version":        version,
				"sign_type":      tea.String("HmacSHA1"),
				"req_time":       alipayutil.GetTimestamp(),
				"req_msg_id":     util.GetNonce(),
				"access_key":     client.AccessKeyId,
				"charset":        tea.String("UTF-8"),
				"baseSdkVersion": tea.String("Tea-SDK"),
				"sdkVersion":     tea.String("Tea-SDK-20200824"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = map[string]*string{
				"host":       client.Endpoint,
				"user-agent": client.GetUserAgent(),
			}
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = alipayutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			obj, _err := util.ReadAsJSON(response_.Body)
			if _err != nil {
				return _result, _err
			}

			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
			if tea.BoolValue(alipayutil.HasError(res)) {
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
 * Get user agent
 * @return user agent
 */
func (client *Client) GetUserAgent() (_result *string) {
	userAgent := tea.String("TeaClient/1.0.0")
	_body := util.GetUserAgent(userAgent)
	_result = _body
	return _result
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 认证查询
 */
func (client *Client) QueryIRealpersonFacevrfServer(request *QueryIRealpersonFacevrfServerRequest) (_result *QueryIRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryIRealpersonFacevrfServerResponse{}
	_body, _err := client.QueryIRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) QueryIRealpersonFacevrfServerEx(request *QueryIRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *QueryIRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIRealpersonFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateIRealpersonFacevrfServer(request *CreateIRealpersonFacevrfServerRequest) (_result *CreateIRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateIRealpersonFacevrfServerResponse{}
	_body, _err := client.CreateIRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) CreateIRealpersonFacevrfServerEx(request *CreateIRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *CreateIRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateIRealpersonFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecIRealpersonFacevrfServer(request *ExecIRealpersonFacevrfServerRequest) (_result *ExecIRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecIRealpersonFacevrfServerResponse{}
	_body, _err := client.ExecIRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) ExecIRealpersonFacevrfServerEx(request *ExecIRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *ExecIRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecIRealpersonFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetIRealpersonFacevrfEvidence(request *GetIRealpersonFacevrfEvidenceRequest) (_result *GetIRealpersonFacevrfEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetIRealpersonFacevrfEvidenceResponse{}
	_body, _err := client.GetIRealpersonFacevrfEvidenceEx(request, runtime)
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
func (client *Client) GetIRealpersonFacevrfEvidenceEx(request *GetIRealpersonFacevrfEvidenceRequest, runtime *util.RuntimeOptions) (_result *GetIRealpersonFacevrfEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetIRealpersonFacevrfEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.evidence.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
