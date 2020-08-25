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

type QueryDiRealpersonFacevrfServerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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

func (s QueryDiRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDiRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetAuthToken(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetProductInstanceId(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetRegionName(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.RegionName = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetCertifyId(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetExternParam(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetMaterialHash(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.MaterialHash = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerRequest) SetSceneId(v string) *QueryDiRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

type QueryDiRealpersonFacevrfServerResponse struct {
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

func (s QueryDiRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDiRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetReqMsgId(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetResultCode(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetResultMsg(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetIdentityInfo(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetMaterialInfo(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.MaterialInfo = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetMaterialMatched(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.MaterialMatched = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetPassed(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *QueryDiRealpersonFacevrfServerResponse) SetReason(v string) *QueryDiRealpersonFacevrfServerResponse {
	s.Reason = &v
	return s
}

type CreateDiRealpersonFacevrfServerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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

func (s CreateDiRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDiRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetAuthToken(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetProductInstanceId(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetRegionName(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.RegionName = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetBizCode(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetCertName(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetCertNo(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetCertType(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetExternParam(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetFacialPictureRef(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetIdentityType(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetMetaInfo(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.MetaInfo = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetReturnUrl(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetSceneId(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetUserId(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetUserIp(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerRequest) SetUserMobile(v string) *CreateDiRealpersonFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

type CreateDiRealpersonFacevrfServerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证地址。只在特定场景返回。
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s CreateDiRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDiRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *CreateDiRealpersonFacevrfServerResponse) SetReqMsgId(v string) *CreateDiRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerResponse) SetResultCode(v string) *CreateDiRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerResponse) SetResultMsg(v string) *CreateDiRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerResponse) SetCertifyId(v string) *CreateDiRealpersonFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *CreateDiRealpersonFacevrfServerResponse) SetCertifyUrl(v string) *CreateDiRealpersonFacevrfServerResponse {
	s.CertifyUrl = &v
	return s
}

type ExecDiRealpersonFacevrfServerRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
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

func (s ExecDiRealpersonFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecDiRealpersonFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetAuthToken(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetProductInstanceId(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetRegionName(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.RegionName = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetCertName(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.CertName = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetCertNo(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.CertNo = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetCertType(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.CertType = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetExternParam(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetFacialPictureAuth(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.FacialPictureAuth = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetFacialPictureRef(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.FacialPictureRef = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetIdentityType(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.IdentityType = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetOuterOrderNo(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetSceneId(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.SceneId = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetUserId(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.UserId = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetUserIp(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.UserIp = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerRequest) SetUserMobile(v string) *ExecDiRealpersonFacevrfServerRequest {
	s.UserMobile = &v
	return s
}

type ExecDiRealpersonFacevrfServerResponse struct {
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

func (s ExecDiRealpersonFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecDiRealpersonFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetReqMsgId(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetResultCode(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetResultMsg(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetCertifyId(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.CertifyId = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetPassed(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.Passed = &v
	return s
}

func (s *ExecDiRealpersonFacevrfServerResponse) SetReason(v string) *ExecDiRealpersonFacevrfServerResponse {
	s.Reason = &v
	return s
}

type GetDiRealpersonFacevrfEvidenceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 某次刷脸的certifyId
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s GetDiRealpersonFacevrfEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDiRealpersonFacevrfEvidenceRequest) GoString() string {
	return s.String()
}

func (s *GetDiRealpersonFacevrfEvidenceRequest) SetAuthToken(v string) *GetDiRealpersonFacevrfEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceRequest) SetProductInstanceId(v string) *GetDiRealpersonFacevrfEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceRequest) SetRegionName(v string) *GetDiRealpersonFacevrfEvidenceRequest {
	s.RegionName = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceRequest) SetCertifyId(v string) *GetDiRealpersonFacevrfEvidenceRequest {
	s.CertifyId = &v
	return s
}

type GetDiRealpersonFacevrfEvidenceResponse struct {
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

func (s GetDiRealpersonFacevrfEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDiRealpersonFacevrfEvidenceResponse) GoString() string {
	return s.String()
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetReqMsgId(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetResultCode(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetResultMsg(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetCertifyId(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.CertifyId = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetOnchainId(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.OnchainId = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetOnchainStatus(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.OnchainStatus = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetPdfContent(v string) *GetDiRealpersonFacevrfEvidenceResponse {
	s.PdfContent = &v
	return s
}

func (s *GetDiRealpersonFacevrfEvidenceResponse) SetPdfExpired(v bool) *GetDiRealpersonFacevrfEvidenceResponse {
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
				"sdkVersion":     tea.String("Tea-SDK-20200825"),
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
func (client *Client) QueryDiRealpersonFacevrfServer(request *QueryDiRealpersonFacevrfServerRequest) (_result *QueryDiRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryDiRealpersonFacevrfServerResponse{}
	_body, _err := client.QueryDiRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) QueryDiRealpersonFacevrfServerEx(request *QueryDiRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *QueryDiRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDiRealpersonFacevrfServerResponse{}
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
func (client *Client) CreateDiRealpersonFacevrfServer(request *CreateDiRealpersonFacevrfServerRequest) (_result *CreateDiRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateDiRealpersonFacevrfServerResponse{}
	_body, _err := client.CreateDiRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) CreateDiRealpersonFacevrfServerEx(request *CreateDiRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *CreateDiRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDiRealpersonFacevrfServerResponse{}
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
func (client *Client) ExecDiRealpersonFacevrfServer(request *ExecDiRealpersonFacevrfServerRequest) (_result *ExecDiRealpersonFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecDiRealpersonFacevrfServerResponse{}
	_body, _err := client.ExecDiRealpersonFacevrfServerEx(request, runtime)
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
func (client *Client) ExecDiRealpersonFacevrfServerEx(request *ExecDiRealpersonFacevrfServerRequest, runtime *util.RuntimeOptions) (_result *ExecDiRealpersonFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecDiRealpersonFacevrfServerResponse{}
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
func (client *Client) GetDiRealpersonFacevrfEvidence(request *GetDiRealpersonFacevrfEvidenceRequest) (_result *GetDiRealpersonFacevrfEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetDiRealpersonFacevrfEvidenceResponse{}
	_body, _err := client.GetDiRealpersonFacevrfEvidenceEx(request, runtime)
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
func (client *Client) GetDiRealpersonFacevrfEvidenceEx(request *GetDiRealpersonFacevrfEvidenceRequest, runtime *util.RuntimeOptions) (_result *GetDiRealpersonFacevrfEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDiRealpersonFacevrfEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.evidence.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
