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

// 音频元数据
type AudioMeta struct {
	// 采样率
	SampleFreq *int64 `json:"sample_freq,omitempty" xml:"sample_freq,omitempty"`
	// 音频道数
	ChannelsNum *int64 `json:"channels_num,omitempty" xml:"channels_num,omitempty"`
	// 音频数据采样点所占位数
	Bits *int64 `json:"bits,omitempty" xml:"bits,omitempty"`
	// 语音信道分离标识
	Channel *int64 `json:"channel,omitempty" xml:"channel,omitempty"`
}

func (s AudioMeta) String() string {
	return tea.Prettify(s)
}

func (s AudioMeta) GoString() string {
	return s.String()
}

func (s *AudioMeta) SetSampleFreq(v int64) *AudioMeta {
	s.SampleFreq = &v
	return s
}

func (s *AudioMeta) SetChannelsNum(v int64) *AudioMeta {
	s.ChannelsNum = &v
	return s
}

func (s *AudioMeta) SetBits(v int64) *AudioMeta {
	s.Bits = &v
	return s
}

func (s *AudioMeta) SetChannel(v int64) *AudioMeta {
	s.Channel = &v
	return s
}

// 音频文件
type Audio struct {
	// 音频文件名称（单次请求保持唯一）
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 待认证的音频文件，base64编码格式
	RawData *string `json:"raw_data,omitempty" xml:"raw_data,omitempty"`
	// 音频文件OSS地址
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
}

func (s Audio) String() string {
	return tea.Prettify(s)
}

func (s Audio) GoString() string {
	return s.String()
}

func (s *Audio) SetToken(v string) *Audio {
	s.Token = &v
	return s
}

func (s *Audio) SetRawData(v string) *Audio {
	s.RawData = &v
	return s
}

func (s *Audio) SetAudioUrl(v string) *Audio {
	s.AudioUrl = &v
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
	// cert_name、cert_no两个字段的传入模式。0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
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
	// 活体检测的类型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
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

func (s *CreateFacevrfServerRequest) SetEncType(v string) *CreateFacevrfServerRequest {
	s.EncType = &v
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

func (s *CreateFacevrfServerRequest) SetModel(v string) *CreateFacevrfServerRequest {
	s.Model = &v
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
	// cert_name、cert_no两个字段的传入模式0：明文1：密文
	EncType *string `json:"enc_type,omitempty" xml:"enc_type,omitempty"`
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

func (s *ExecFacevrfServerRequest) SetEncType(v string) *ExecFacevrfServerRequest {
	s.EncType = &v
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
	// 认证主体附件信息，包含共计类型等
	MaterialInfo *string `json:"material_info,omitempty" xml:"material_info,omitempty"`
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

func (s *ExecFacevrfServerResponse) SetMaterialInfo(v string) *ExecFacevrfServerResponse {
	s.MaterialInfo = &v
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
	// 认证子类型
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
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

func (s *CheckIndividualidTwometaRequest) SetScene(v string) *CheckIndividualidTwometaRequest {
	s.Scene = &v
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

type CheckRouteThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 使用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 三要素的加密方式，NONE/MD5/SHA256
	ReqEncType *string `json:"req_enc_type,omitempty" xml:"req_enc_type,omitempty"`
	// map结果的json数据格式，预留字段
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckRouteThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteThreemetaRequest) GoString() string {
	return s.String()
}

func (s *CheckRouteThreemetaRequest) SetAuthToken(v string) *CheckRouteThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetProductInstanceId(v string) *CheckRouteThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetOuterOrderNo(v string) *CheckRouteThreemetaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetCertName(v string) *CheckRouteThreemetaRequest {
	s.CertName = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetCertNo(v string) *CheckRouteThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetMobile(v string) *CheckRouteThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetScene(v string) *CheckRouteThreemetaRequest {
	s.Scene = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetReqEncType(v string) *CheckRouteThreemetaRequest {
	s.ReqEncType = &v
	return s
}

func (s *CheckRouteThreemetaRequest) SetExternParam(v string) *CheckRouteThreemetaRequest {
	s.ExternParam = &v
	return s
}

type CheckRouteThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckRouteThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteThreemetaResponse) GoString() string {
	return s.String()
}

func (s *CheckRouteThreemetaResponse) SetReqMsgId(v string) *CheckRouteThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetResultCode(v string) *CheckRouteThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetResultMsg(v string) *CheckRouteThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetMatch(v string) *CheckRouteThreemetaResponse {
	s.Match = &v
	return s
}

func (s *CheckRouteThreemetaResponse) SetExternInfo(v string) *CheckRouteThreemetaResponse {
	s.ExternInfo = &v
	return s
}

type CreateVoiceprintServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 音频文件流
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 音频元数据
	AudioMeta *AudioMeta `json:"audio_meta,omitempty" xml:"audio_meta,omitempty" require:"true"`
	// 音频文件集合
	Audios []*Audio `json:"audios,omitempty" xml:"audios,omitempty" require:"true" type:"Repeated"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CreateVoiceprintServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateVoiceprintServermodeRequest) GoString() string {
	return s.String()
}

func (s *CreateVoiceprintServermodeRequest) SetAuthToken(v string) *CreateVoiceprintServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetProductInstanceId(v string) *CreateVoiceprintServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetOuterOrderNo(v string) *CreateVoiceprintServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetUserId(v string) *CreateVoiceprintServermodeRequest {
	s.UserId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileObject(v io.Reader) *CreateVoiceprintServermodeRequest {
	s.FileObject = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileObjectName(v string) *CreateVoiceprintServermodeRequest {
	s.FileObjectName = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetFileId(v string) *CreateVoiceprintServermodeRequest {
	s.FileId = &v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetAudioMeta(v *AudioMeta) *CreateVoiceprintServermodeRequest {
	s.AudioMeta = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetAudios(v []*Audio) *CreateVoiceprintServermodeRequest {
	s.Audios = v
	return s
}

func (s *CreateVoiceprintServermodeRequest) SetExternParam(v string) *CreateVoiceprintServermodeRequest {
	s.ExternParam = &v
	return s
}

type CreateVoiceprintServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s CreateVoiceprintServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateVoiceprintServermodeResponse) GoString() string {
	return s.String()
}

func (s *CreateVoiceprintServermodeResponse) SetReqMsgId(v string) *CreateVoiceprintServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultCode(v string) *CreateVoiceprintServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultMsg(v string) *CreateVoiceprintServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetExternInfo(v string) *CreateVoiceprintServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultCodeSub(v string) *CreateVoiceprintServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *CreateVoiceprintServermodeResponse) SetResultMsgSub(v string) *CreateVoiceprintServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type VerifyVoiceprintServermodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 商户自定义的用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 音频文件，base64编码格式
	//
	AudioAuth *string `json:"audio_auth,omitempty" xml:"audio_auth,omitempty"`
	// 音频文件OSS地址
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
	// 音频元数据
	AudioMeta *AudioMeta `json:"audio_meta,omitempty" xml:"audio_meta,omitempty" require:"true"`
	// 预留扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s VerifyVoiceprintServermodeRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyVoiceprintServermodeRequest) GoString() string {
	return s.String()
}

func (s *VerifyVoiceprintServermodeRequest) SetAuthToken(v string) *VerifyVoiceprintServermodeRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetProductInstanceId(v string) *VerifyVoiceprintServermodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetOuterOrderNo(v string) *VerifyVoiceprintServermodeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetUserId(v string) *VerifyVoiceprintServermodeRequest {
	s.UserId = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioAuth(v string) *VerifyVoiceprintServermodeRequest {
	s.AudioAuth = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioUrl(v string) *VerifyVoiceprintServermodeRequest {
	s.AudioUrl = &v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetAudioMeta(v *AudioMeta) *VerifyVoiceprintServermodeRequest {
	s.AudioMeta = v
	return s
}

func (s *VerifyVoiceprintServermodeRequest) SetExternParam(v string) *VerifyVoiceprintServermodeRequest {
	s.ExternParam = &v
	return s
}

type VerifyVoiceprintServermodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 声纹认证唯一ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 扩展信息，预留字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
	// 产品结果明细，不影响决策
	ResultCodeSub *string `json:"result_code_sub,omitempty" xml:"result_code_sub,omitempty"`
	// result_code_sub对应的文案
	ResultMsgSub *string `json:"result_msg_sub,omitempty" xml:"result_msg_sub,omitempty"`
}

func (s VerifyVoiceprintServermodeResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyVoiceprintServermodeResponse) GoString() string {
	return s.String()
}

func (s *VerifyVoiceprintServermodeResponse) SetReqMsgId(v string) *VerifyVoiceprintServermodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultCode(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultMsg(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetCertifyId(v string) *VerifyVoiceprintServermodeResponse {
	s.CertifyId = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetExternInfo(v string) *VerifyVoiceprintServermodeResponse {
	s.ExternInfo = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultCodeSub(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultCodeSub = &v
	return s
}

func (s *VerifyVoiceprintServermodeResponse) SetResultMsgSub(v string) *VerifyVoiceprintServermodeResponse {
	s.ResultMsgSub = &v
	return s
}

type CheckRouteTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 使用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// map结果的json数据格式，预留字段
	//
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckRouteTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteTwometaRequest) GoString() string {
	return s.String()
}

func (s *CheckRouteTwometaRequest) SetAuthToken(v string) *CheckRouteTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetProductInstanceId(v string) *CheckRouteTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetOuterOrderNo(v string) *CheckRouteTwometaRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetCertName(v string) *CheckRouteTwometaRequest {
	s.CertName = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetCertNo(v string) *CheckRouteTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetScene(v string) *CheckRouteTwometaRequest {
	s.Scene = &v
	return s
}

func (s *CheckRouteTwometaRequest) SetExternParam(v string) *CheckRouteTwometaRequest {
	s.ExternParam = &v
	return s
}

type CheckRouteTwometaResponse struct {
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

func (s CheckRouteTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckRouteTwometaResponse) GoString() string {
	return s.String()
}

func (s *CheckRouteTwometaResponse) SetReqMsgId(v string) *CheckRouteTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetResultCode(v string) *CheckRouteTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetResultMsg(v string) *CheckRouteTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetMatch(v string) *CheckRouteTwometaResponse {
	s.Match = &v
	return s
}

func (s *CheckRouteTwometaResponse) SetExternInfo(v string) *CheckRouteTwometaResponse {
	s.ExternInfo = &v
	return s
}

type QueryMobileRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 设备身份临时标识
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// 接口使用场景，不同场景下接口返回字段集合会有差异，可缺省
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
}

func (s QueryMobileRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMobileRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryMobileRiskRequest) SetAuthToken(v string) *QueryMobileRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMobileRiskRequest) SetProductInstanceId(v string) *QueryMobileRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMobileRiskRequest) SetOuterOrderNo(v string) *QueryMobileRiskRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryMobileRiskRequest) SetApdidToken(v string) *QueryMobileRiskRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryMobileRiskRequest) SetScene(v string) *QueryMobileRiskRequest {
	s.Scene = &v
	return s
}

type QueryMobileRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备相关数据，默认只返回apdid，由Map<String,String>序列化
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
	// 设备风险标签，由Map<String,String>序列化
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
}

func (s QueryMobileRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMobileRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryMobileRiskResponse) SetReqMsgId(v string) *QueryMobileRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMobileRiskResponse) SetResultCode(v string) *QueryMobileRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMobileRiskResponse) SetResultMsg(v string) *QueryMobileRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMobileRiskResponse) SetDeviceInfo(v string) *QueryMobileRiskResponse {
	s.DeviceInfo = &v
	return s
}

func (s *QueryMobileRiskResponse) SetRiskInfo(v string) *QueryMobileRiskResponse {
	s.RiskInfo = &v
	return s
}

type DetailFacevrfServerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实人认证唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 预留扩展业务参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s DetailFacevrfServerRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailFacevrfServerRequest) GoString() string {
	return s.String()
}

func (s *DetailFacevrfServerRequest) SetAuthToken(v string) *DetailFacevrfServerRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetProductInstanceId(v string) *DetailFacevrfServerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetCertifyId(v string) *DetailFacevrfServerRequest {
	s.CertifyId = &v
	return s
}

func (s *DetailFacevrfServerRequest) SetExternParam(v string) *DetailFacevrfServerRequest {
	s.ExternParam = &v
	return s
}

type DetailFacevrfServerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// PASS：认证通过
	// FAIL：认证不通过
	// NO_RECODE：无认证记录
	// PROCESSING：认证中
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 认证人信息，包括姓名和身份证号，不加密
	// state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
	IdentityInfo *string `json:"identity_info,omitempty" xml:"identity_info,omitempty"`
	// 预留扩展结果
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s DetailFacevrfServerResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailFacevrfServerResponse) GoString() string {
	return s.String()
}

func (s *DetailFacevrfServerResponse) SetReqMsgId(v string) *DetailFacevrfServerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetResultCode(v string) *DetailFacevrfServerResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetResultMsg(v string) *DetailFacevrfServerResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetState(v string) *DetailFacevrfServerResponse {
	s.State = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetIdentityInfo(v string) *DetailFacevrfServerResponse {
	s.IdentityInfo = &v
	return s
}

func (s *DetailFacevrfServerResponse) SetExternInfo(v string) *DetailFacevrfServerResponse {
	s.ExternInfo = &v
	return s
}

type CheckAnticheatPersonalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求id
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 主体姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 主体身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 受雇企业
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 组织机构代码
	CompanyNo *string `json:"company_no,omitempty" xml:"company_no,omitempty"`
	// 扩展字段，json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckAnticheatPersonalRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAnticheatPersonalRequest) GoString() string {
	return s.String()
}

func (s *CheckAnticheatPersonalRequest) SetAuthToken(v string) *CheckAnticheatPersonalRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetProductInstanceId(v string) *CheckAnticheatPersonalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetOuterOrderNo(v string) *CheckAnticheatPersonalRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCertName(v string) *CheckAnticheatPersonalRequest {
	s.CertName = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCertNo(v string) *CheckAnticheatPersonalRequest {
	s.CertNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCompanyName(v string) *CheckAnticheatPersonalRequest {
	s.CompanyName = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetCompanyNo(v string) *CheckAnticheatPersonalRequest {
	s.CompanyNo = &v
	return s
}

func (s *CheckAnticheatPersonalRequest) SetExternParam(v string) *CheckAnticheatPersonalRequest {
	s.ExternParam = &v
	return s
}

type CheckAnticheatPersonalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险等级文字描述
	RiskLevelDesc *string `json:"risk_level_desc,omitempty" xml:"risk_level_desc,omitempty"`
	// 扩展信息
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckAnticheatPersonalResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAnticheatPersonalResponse) GoString() string {
	return s.String()
}

func (s *CheckAnticheatPersonalResponse) SetReqMsgId(v string) *CheckAnticheatPersonalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetResultCode(v string) *CheckAnticheatPersonalResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetResultMsg(v string) *CheckAnticheatPersonalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetRiskLevel(v string) *CheckAnticheatPersonalResponse {
	s.RiskLevel = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetRiskLevelDesc(v string) *CheckAnticheatPersonalResponse {
	s.RiskLevelDesc = &v
	return s
}

func (s *CheckAnticheatPersonalResponse) SetExternInfo(v string) *CheckAnticheatPersonalResponse {
	s.ExternInfo = &v
	return s
}

type CheckTwometaHashRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
	CertNoHash *string `json:"cert_no_hash,omitempty" xml:"cert_no_hash,omitempty" require:"true"`
	// hash后的姓名，不区分大小写，使用的hash类型参考hash_type
	CertNameHash *string `json:"cert_name_hash,omitempty" xml:"cert_name_hash,omitempty" require:"true"`
	// 本次核验id
	OuterOrderId *string `json:"outer_order_id,omitempty" xml:"outer_order_id,omitempty" require:"true"`
	// 支持的hash类型
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// json格式的扩展字段
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckTwometaHashRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckTwometaHashRequest) GoString() string {
	return s.String()
}

func (s *CheckTwometaHashRequest) SetAuthToken(v string) *CheckTwometaHashRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckTwometaHashRequest) SetProductInstanceId(v string) *CheckTwometaHashRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckTwometaHashRequest) SetCertNoHash(v string) *CheckTwometaHashRequest {
	s.CertNoHash = &v
	return s
}

func (s *CheckTwometaHashRequest) SetCertNameHash(v string) *CheckTwometaHashRequest {
	s.CertNameHash = &v
	return s
}

func (s *CheckTwometaHashRequest) SetOuterOrderId(v string) *CheckTwometaHashRequest {
	s.OuterOrderId = &v
	return s
}

func (s *CheckTwometaHashRequest) SetHashType(v string) *CheckTwometaHashRequest {
	s.HashType = &v
	return s
}

func (s *CheckTwometaHashRequest) SetExternInfo(v string) *CheckTwometaHashRequest {
	s.ExternInfo = &v
	return s
}

type CheckTwometaHashResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CheckTwometaHashResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckTwometaHashResponse) GoString() string {
	return s.String()
}

func (s *CheckTwometaHashResponse) SetReqMsgId(v string) *CheckTwometaHashResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckTwometaHashResponse) SetResultCode(v string) *CheckTwometaHashResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckTwometaHashResponse) SetResultMsg(v string) *CheckTwometaHashResponse {
	s.ResultMsg = &v
	return s
}

type QueryThreemetaOnlinetimeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求id
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号码
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty" require:"true"`
	// 扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryThreemetaOnlinetimeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaOnlinetimeRequest) GoString() string {
	return s.String()
}

func (s *QueryThreemetaOnlinetimeRequest) SetAuthToken(v string) *QueryThreemetaOnlinetimeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetProductInstanceId(v string) *QueryThreemetaOnlinetimeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetOuterOrderNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetCertName(v string) *QueryThreemetaOnlinetimeRequest {
	s.CertName = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetCertNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.CertNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetPhoneNo(v string) *QueryThreemetaOnlinetimeRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryThreemetaOnlinetimeRequest) SetExternParam(v string) *QueryThreemetaOnlinetimeRequest {
	s.ExternParam = &v
	return s
}

type QueryThreemetaOnlinetimeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 在网时长标准码，规则：
	// 1: [0,3)表示在⽹时⻓是 0~3 个⽉
	// 2: [3,6)表示在⽹时⻓是 3~6 个⽉
	// 3: [6,12)表示在⽹时⻓是 6~12 个⽉
	// 4: [12,24)表示在⽹时⻓是 12~24 ⽉
	// 5: [24,+)表示在⽹时⻓是 24个⽉及以上
	LengthCode *string `json:"length_code,omitempty" xml:"length_code,omitempty"`
	// 扩展信息，json格式
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryThreemetaOnlinetimeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaOnlinetimeResponse) GoString() string {
	return s.String()
}

func (s *QueryThreemetaOnlinetimeResponse) SetReqMsgId(v string) *QueryThreemetaOnlinetimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetResultCode(v string) *QueryThreemetaOnlinetimeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetResultMsg(v string) *QueryThreemetaOnlinetimeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetLengthCode(v string) *QueryThreemetaOnlinetimeResponse {
	s.LengthCode = &v
	return s
}

func (s *QueryThreemetaOnlinetimeResponse) SetExternInfo(v string) *QueryThreemetaOnlinetimeResponse {
	s.ExternInfo = &v
	return s
}

type InitFacevrfZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务参数
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 商户
	Merchant *string `json:"merchant,omitempty" xml:"merchant,omitempty"`
	// 环境参数
	MetaInfo *string `json:"meta_info,omitempty" xml:"meta_info,omitempty" require:"true"`
	// 产品节点
	ProduceNode *string `json:"produce_node,omitempty" xml:"produce_node,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 实人认证id
	//
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
	// 身份信息参数
	//
	ZimPrincipal *string `json:"zim_principal,omitempty" xml:"zim_principal,omitempty"`
}

func (s InitFacevrfZimRequest) String() string {
	return tea.Prettify(s)
}

func (s InitFacevrfZimRequest) GoString() string {
	return s.String()
}

func (s *InitFacevrfZimRequest) SetAuthToken(v string) *InitFacevrfZimRequest {
	s.AuthToken = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProductInstanceId(v string) *InitFacevrfZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitFacevrfZimRequest) SetBizData(v string) *InitFacevrfZimRequest {
	s.BizData = &v
	return s
}

func (s *InitFacevrfZimRequest) SetChannel(v string) *InitFacevrfZimRequest {
	s.Channel = &v
	return s
}

func (s *InitFacevrfZimRequest) SetMerchant(v string) *InitFacevrfZimRequest {
	s.Merchant = &v
	return s
}

func (s *InitFacevrfZimRequest) SetMetaInfo(v string) *InitFacevrfZimRequest {
	s.MetaInfo = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProduceNode(v string) *InitFacevrfZimRequest {
	s.ProduceNode = &v
	return s
}

func (s *InitFacevrfZimRequest) SetProductName(v string) *InitFacevrfZimRequest {
	s.ProductName = &v
	return s
}

func (s *InitFacevrfZimRequest) SetZimId(v string) *InitFacevrfZimRequest {
	s.ZimId = &v
	return s
}

func (s *InitFacevrfZimRequest) SetZimPrincipal(v string) *InitFacevrfZimRequest {
	s.ZimPrincipal = &v
	return s
}

type InitFacevrfZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	//
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// 描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 协议
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// 返回码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 实人认证id
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty"`
}

func (s InitFacevrfZimResponse) String() string {
	return tea.Prettify(s)
}

func (s InitFacevrfZimResponse) GoString() string {
	return s.String()
}

func (s *InitFacevrfZimResponse) SetReqMsgId(v string) *InitFacevrfZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitFacevrfZimResponse) SetResultCode(v string) *InitFacevrfZimResponse {
	s.ResultCode = &v
	return s
}

func (s *InitFacevrfZimResponse) SetResultMsg(v string) *InitFacevrfZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitFacevrfZimResponse) SetExtParams(v string) *InitFacevrfZimResponse {
	s.ExtParams = &v
	return s
}

func (s *InitFacevrfZimResponse) SetMessage(v string) *InitFacevrfZimResponse {
	s.Message = &v
	return s
}

func (s *InitFacevrfZimResponse) SetProtocol(v string) *InitFacevrfZimResponse {
	s.Protocol = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetCode(v string) *InitFacevrfZimResponse {
	s.RetCode = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetCodeSub(v string) *InitFacevrfZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *InitFacevrfZimResponse) SetRetMessageSub(v string) *InitFacevrfZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *InitFacevrfZimResponse) SetZimId(v string) *InitFacevrfZimResponse {
	s.ZimId = &v
	return s
}

type VerifyFacevrfZimRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息,Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
	// 人脸业务参数
	ZimData *string `json:"zim_data,omitempty" xml:"zim_data,omitempty" require:"true"`
	// 7501f6c2dd57e06fe0d4202d3aaab58e
	ZimId *string `json:"zim_id,omitempty" xml:"zim_id,omitempty" require:"true"`
}

func (s VerifyFacevrfZimRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFacevrfZimRequest) GoString() string {
	return s.String()
}

func (s *VerifyFacevrfZimRequest) SetAuthToken(v string) *VerifyFacevrfZimRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetProductInstanceId(v string) *VerifyFacevrfZimRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetExternParam(v string) *VerifyFacevrfZimRequest {
	s.ExternParam = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetZimData(v string) *VerifyFacevrfZimRequest {
	s.ZimData = &v
	return s
}

func (s *VerifyFacevrfZimRequest) SetZimId(v string) *VerifyFacevrfZimRequest {
	s.ZimId = &v
	return s
}

type VerifyFacevrfZimResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预留扩展结果
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	// ""
	HasNext *string `json:"has_next,omitempty" xml:"has_next,omitempty"`
	// ""
	NextProtocol *string `json:"next_protocol,omitempty" xml:"next_protocol,omitempty"`
	// 产品返回明细码
	ProductRetCode *string `json:"product_ret_code,omitempty" xml:"product_ret_code,omitempty"`
	// 明细返回码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 明细返回码对应的文案
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 验证返回明细码
	ValidationRetCode *string `json:"validation_ret_code,omitempty" xml:"validation_ret_code,omitempty"`
}

func (s VerifyFacevrfZimResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFacevrfZimResponse) GoString() string {
	return s.String()
}

func (s *VerifyFacevrfZimResponse) SetReqMsgId(v string) *VerifyFacevrfZimResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetResultCode(v string) *VerifyFacevrfZimResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetResultMsg(v string) *VerifyFacevrfZimResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetExtParams(v string) *VerifyFacevrfZimResponse {
	s.ExtParams = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetHasNext(v string) *VerifyFacevrfZimResponse {
	s.HasNext = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetNextProtocol(v string) *VerifyFacevrfZimResponse {
	s.NextProtocol = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetProductRetCode(v string) *VerifyFacevrfZimResponse {
	s.ProductRetCode = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetRetCodeSub(v string) *VerifyFacevrfZimResponse {
	s.RetCodeSub = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetRetMessageSub(v string) *VerifyFacevrfZimResponse {
	s.RetMessageSub = &v
	return s
}

func (s *VerifyFacevrfZimResponse) SetValidationRetCode(v string) *VerifyFacevrfZimResponse {
	s.ValidationRetCode = &v
	return s
}

type RecognizeDocIndividualcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 长度不超过32位的0-9A-Za-z字符串。
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
	OcrType *string `json:"ocr_type,omitempty" xml:"ocr_type,omitempty" require:"true"`
	// 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；URL（暂不支持）
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 传入的图片的具体内容，需要与data_type的选择保持一致。
	DataContent *string `json:"data_content,omitempty" xml:"data_content,omitempty" require:"true"`
	// 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	ReqEncType *string `json:"req_enc_type,omitempty" xml:"req_enc_type,omitempty"`
	// 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
	RespEncType *string `json:"resp_enc_type,omitempty" xml:"resp_enc_type,omitempty"`
	// 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
	EncToken *string `json:"enc_token,omitempty" xml:"enc_token,omitempty"`
	// 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
	RiskInfoType *string `json:"risk_info_type,omitempty" xml:"risk_info_type,omitempty"`
	// 扩展信息JSON串。
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s RecognizeDocIndividualcardRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeDocIndividualcardRequest) GoString() string {
	return s.String()
}

func (s *RecognizeDocIndividualcardRequest) SetAuthToken(v string) *RecognizeDocIndividualcardRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetProductInstanceId(v string) *RecognizeDocIndividualcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetOutOrderNo(v string) *RecognizeDocIndividualcardRequest {
	s.OutOrderNo = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetOcrType(v string) *RecognizeDocIndividualcardRequest {
	s.OcrType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetDataType(v string) *RecognizeDocIndividualcardRequest {
	s.DataType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetDataContent(v string) *RecognizeDocIndividualcardRequest {
	s.DataContent = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetReqEncType(v string) *RecognizeDocIndividualcardRequest {
	s.ReqEncType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetRespEncType(v string) *RecognizeDocIndividualcardRequest {
	s.RespEncType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetEncToken(v string) *RecognizeDocIndividualcardRequest {
	s.EncToken = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetRiskInfoType(v string) *RecognizeDocIndividualcardRequest {
	s.RiskInfoType = &v
	return s
}

func (s *RecognizeDocIndividualcardRequest) SetExternParam(v string) *RecognizeDocIndividualcardRequest {
	s.ExternParam = &v
	return s
}

type RecognizeDocIndividualcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果码
	RetCode *string `json:"ret_code,omitempty" xml:"ret_code,omitempty"`
	// 错误码
	RetCodeSub *string `json:"ret_code_sub,omitempty" xml:"ret_code_sub,omitempty"`
	// 错误信息
	RetMessageSub *string `json:"ret_message_sub,omitempty" xml:"ret_message_sub,omitempty"`
	// 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
	OcrInfo *string `json:"ocr_info,omitempty" xml:"ocr_info,omitempty"`
	// 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
	// 如果不启用防伪，则不返回该字段。
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 扩展信息JSON串。
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s RecognizeDocIndividualcardResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeDocIndividualcardResponse) GoString() string {
	return s.String()
}

func (s *RecognizeDocIndividualcardResponse) SetReqMsgId(v string) *RecognizeDocIndividualcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetResultCode(v string) *RecognizeDocIndividualcardResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetResultMsg(v string) *RecognizeDocIndividualcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetCode(v string) *RecognizeDocIndividualcardResponse {
	s.RetCode = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetCodeSub(v string) *RecognizeDocIndividualcardResponse {
	s.RetCodeSub = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRetMessageSub(v string) *RecognizeDocIndividualcardResponse {
	s.RetMessageSub = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetOcrInfo(v string) *RecognizeDocIndividualcardResponse {
	s.OcrInfo = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetRiskInfo(v string) *RecognizeDocIndividualcardResponse {
	s.RiskInfo = &v
	return s
}

func (s *RecognizeDocIndividualcardResponse) SetExtInfo(v string) *RecognizeDocIndividualcardResponse {
	s.ExtInfo = &v
	return s
}

type CheckThreemetaBankcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// 扩展信息，Map的json格式
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s CheckThreemetaBankcardRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckThreemetaBankcardRequest) GoString() string {
	return s.String()
}

func (s *CheckThreemetaBankcardRequest) SetAuthToken(v string) *CheckThreemetaBankcardRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetProductInstanceId(v string) *CheckThreemetaBankcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetOuterOrderNo(v string) *CheckThreemetaBankcardRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetCertName(v string) *CheckThreemetaBankcardRequest {
	s.CertName = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetCertNo(v string) *CheckThreemetaBankcardRequest {
	s.CertNo = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetBankCard(v string) *CheckThreemetaBankcardRequest {
	s.BankCard = &v
	return s
}

func (s *CheckThreemetaBankcardRequest) SetExternParam(v string) *CheckThreemetaBankcardRequest {
	s.ExternParam = &v
	return s
}

type CheckThreemetaBankcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true:匹配成功 false：匹配失败
	Match *string `json:"match,omitempty" xml:"match,omitempty"`
	// 扩展信息，Map的json格式。
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s CheckThreemetaBankcardResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckThreemetaBankcardResponse) GoString() string {
	return s.String()
}

func (s *CheckThreemetaBankcardResponse) SetReqMsgId(v string) *CheckThreemetaBankcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetResultCode(v string) *CheckThreemetaBankcardResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetResultMsg(v string) *CheckThreemetaBankcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetMatch(v string) *CheckThreemetaBankcardResponse {
	s.Match = &v
	return s
}

func (s *CheckThreemetaBankcardResponse) SetExternInfo(v string) *CheckThreemetaBankcardResponse {
	s.ExternInfo = &v
	return s
}

type QueryDeepsecRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区分不同应用
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty" require:"true"`
	// app_key
	AppKey *string `json:"app_key,omitempty" xml:"app_key,omitempty"`
	// 业务数据集合，包括业务数据如zimId，Map<String,String>
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty" require:"true"`
	// 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
	RiskData *string `json:"risk_data,omitempty" xml:"risk_data,omitempty" require:"true"`
}

func (s QueryDeepsecRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryDeepsecRiskRequest) SetAuthToken(v string) *QueryDeepsecRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetProductInstanceId(v string) *QueryDeepsecRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetAppName(v string) *QueryDeepsecRiskRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetAppKey(v string) *QueryDeepsecRiskRequest {
	s.AppKey = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetBizData(v string) *QueryDeepsecRiskRequest {
	s.BizData = &v
	return s
}

func (s *QueryDeepsecRiskRequest) SetRiskData(v string) *QueryDeepsecRiskRequest {
	s.RiskData = &v
	return s
}

type QueryDeepsecRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 业务返回码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// message	返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 设备风险标签
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 设备染色风险标签
	DcRisk *string `json:"dc_risk,omitempty" xml:"dc_risk,omitempty"`
	// 业务风险标签
	BizRisk *string `json:"biz_risk,omitempty" xml:"biz_risk,omitempty"`
	// 设备元数据
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
}

func (s QueryDeepsecRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryDeepsecRiskResponse) SetReqMsgId(v string) *QueryDeepsecRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetResultCode(v string) *QueryDeepsecRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetResultMsg(v string) *QueryDeepsecRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetSuccess(v bool) *QueryDeepsecRiskResponse {
	s.Success = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetCode(v string) *QueryDeepsecRiskResponse {
	s.Code = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetMessage(v string) *QueryDeepsecRiskResponse {
	s.Message = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetRiskInfo(v string) *QueryDeepsecRiskResponse {
	s.RiskInfo = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetDcRisk(v string) *QueryDeepsecRiskResponse {
	s.DcRisk = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetBizRisk(v string) *QueryDeepsecRiskResponse {
	s.BizRisk = &v
	return s
}

func (s *QueryDeepsecRiskResponse) SetDeviceInfo(v string) *QueryDeepsecRiskResponse {
	s.DeviceInfo = &v
	return s
}

type QueryDeepsecTsbmrqRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用来源
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 环境id
	EnvId *string `json:"env_id,omitempty" xml:"env_id,omitempty"`
	// request id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 商户id
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 应用来源名称, 也被用作渠道名称
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 是否测试流量, 测试流量会在处理过程中有特殊处理
	TestFlow *bool `json:"test_flow,omitempty" xml:"test_flow,omitempty"`
	// apdidToken
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
}

func (s QueryDeepsecTsbmrqRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecTsbmrqRequest) GoString() string {
	return s.String()
}

func (s *QueryDeepsecTsbmrqRequest) SetAuthToken(v string) *QueryDeepsecTsbmrqRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetProductInstanceId(v string) *QueryDeepsecTsbmrqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetAppId(v string) *QueryDeepsecTsbmrqRequest {
	s.AppId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetEnvId(v string) *QueryDeepsecTsbmrqRequest {
	s.EnvId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetRequestId(v string) *QueryDeepsecTsbmrqRequest {
	s.RequestId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetTenantId(v string) *QueryDeepsecTsbmrqRequest {
	s.TenantId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetMerchantId(v string) *QueryDeepsecTsbmrqRequest {
	s.MerchantId = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetAppName(v string) *QueryDeepsecTsbmrqRequest {
	s.AppName = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetTestFlow(v bool) *QueryDeepsecTsbmrqRequest {
	s.TestFlow = &v
	return s
}

func (s *QueryDeepsecTsbmrqRequest) SetApdidToken(v string) *QueryDeepsecTsbmrqRequest {
	s.ApdidToken = &v
	return s
}

type QueryDeepsecTsbmrqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备信息
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty"`
	// 风险信息标签
	RiskInfo *string `json:"risk_info,omitempty" xml:"risk_info,omitempty"`
	// 业务message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryDeepsecTsbmrqResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepsecTsbmrqResponse) GoString() string {
	return s.String()
}

func (s *QueryDeepsecTsbmrqResponse) SetReqMsgId(v string) *QueryDeepsecTsbmrqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetResultCode(v string) *QueryDeepsecTsbmrqResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetResultMsg(v string) *QueryDeepsecTsbmrqResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetDeviceInfo(v string) *QueryDeepsecTsbmrqResponse {
	s.DeviceInfo = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetRiskInfo(v string) *QueryDeepsecTsbmrqResponse {
	s.RiskInfo = &v
	return s
}

func (s *QueryDeepsecTsbmrqResponse) SetMessage(v string) *QueryDeepsecTsbmrqResponse {
	s.Message = &v
	return s
}

type QueryThreemetaPhonereuseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 运营商类型
	Carrier *string `json:"carrier,omitempty" xml:"carrier,omitempty"`
	// 扩展参数
	ExternParam *string `json:"extern_param,omitempty" xml:"extern_param,omitempty"`
}

func (s QueryThreemetaPhonereuseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaPhonereuseRequest) GoString() string {
	return s.String()
}

func (s *QueryThreemetaPhonereuseRequest) SetAuthToken(v string) *QueryThreemetaPhonereuseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetProductInstanceId(v string) *QueryThreemetaPhonereuseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetOuterOrderNo(v string) *QueryThreemetaPhonereuseRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetMobile(v string) *QueryThreemetaPhonereuseRequest {
	s.Mobile = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetDate(v string) *QueryThreemetaPhonereuseRequest {
	s.Date = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetCarrier(v string) *QueryThreemetaPhonereuseRequest {
	s.Carrier = &v
	return s
}

func (s *QueryThreemetaPhonereuseRequest) SetExternParam(v string) *QueryThreemetaPhonereuseRequest {
	s.ExternParam = &v
	return s
}

type QueryThreemetaPhonereuseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否二次放号
	PhoneReuse *string `json:"phone_reuse,omitempty" xml:"phone_reuse,omitempty"`
	// 扩展参数
	ExternInfo *string `json:"extern_info,omitempty" xml:"extern_info,omitempty"`
}

func (s QueryThreemetaPhonereuseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryThreemetaPhonereuseResponse) GoString() string {
	return s.String()
}

func (s *QueryThreemetaPhonereuseResponse) SetReqMsgId(v string) *QueryThreemetaPhonereuseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetResultCode(v string) *QueryThreemetaPhonereuseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetResultMsg(v string) *QueryThreemetaPhonereuseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetPhoneReuse(v string) *QueryThreemetaPhonereuseResponse {
	s.PhoneReuse = &v
	return s
}

func (s *QueryThreemetaPhonereuseResponse) SetExternInfo(v string) *QueryThreemetaPhonereuseResponse {
	s.ExternInfo = &v
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
				"sdk_version":      tea.String("1.12.0"),
				"_prod_code":       tea.String("REALPERSON"),
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

/**
 * Description: 个人三要素认证（场景路由）
 * Summary: 个人三要素认证（场景路由）
 */
func (client *Client) CheckRouteThreemeta(request *CheckRouteThreemetaRequest) (_result *CheckRouteThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckRouteThreemetaResponse{}
	_body, _err := client.CheckRouteThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人三要素认证（场景路由）
 * Summary: 个人三要素认证（场景路由）
 */
func (client *Client) CheckRouteThreemetaEx(request *CheckRouteThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckRouteThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckRouteThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.route.threemeta.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端声纹注册
 * Summary: 纯服务端声纹注册
 */
func (client *Client) CreateVoiceprintServermode(request *CreateVoiceprintServermodeRequest) (_result *CreateVoiceprintServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateVoiceprintServermodeResponse{}
	_body, _err := client.CreateVoiceprintServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端声纹注册
 * Summary: 纯服务端声纹注册
 */
func (client *Client) CreateVoiceprintServermodeEx(request *CreateVoiceprintServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateVoiceprintServermodeResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("di.realperson.voiceprint.servermode.create"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			createVoiceprintServermodeResponse := &CreateVoiceprintServermodeResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = createVoiceprintServermodeResponse
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
	_result = &CreateVoiceprintServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.voiceprint.servermode.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 纯服务端声纹比对
 * Summary: 纯服务端声纹比对
 */
func (client *Client) VerifyVoiceprintServermode(request *VerifyVoiceprintServermodeRequest) (_result *VerifyVoiceprintServermodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyVoiceprintServermodeResponse{}
	_body, _err := client.VerifyVoiceprintServermodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 纯服务端声纹比对
 * Summary: 纯服务端声纹比对
 */
func (client *Client) VerifyVoiceprintServermodeEx(request *VerifyVoiceprintServermodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyVoiceprintServermodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyVoiceprintServermodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.voiceprint.servermode.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人二要素认证（场景路由）
 * Summary: 个人二要素认证（场景路由）
 */
func (client *Client) CheckRouteTwometa(request *CheckRouteTwometaRequest) (_result *CheckRouteTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckRouteTwometaResponse{}
	_body, _err := client.CheckRouteTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人二要素认证（场景路由）
 * Summary: 个人二要素认证（场景路由）
 */
func (client *Client) CheckRouteTwometaEx(request *CheckRouteTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckRouteTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckRouteTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.route.twometa.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
 * Summary: 移动风险设备查询
 */
func (client *Client) QueryMobileRisk(request *QueryMobileRiskRequest) (_result *QueryMobileRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMobileRiskResponse{}
	_body, _err := client.QueryMobileRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
 * Summary: 移动风险设备查询
 */
func (client *Client) QueryMobileRiskEx(request *QueryMobileRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMobileRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMobileRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.mobile.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
 * Summary: 查询认证人、认证时间等相关信息
 */
func (client *Client) DetailFacevrfServer(request *DetailFacevrfServerRequest) (_result *DetailFacevrfServerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailFacevrfServerResponse{}
	_body, _err := client.DetailFacevrfServerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
 * Summary: 查询认证人、认证时间等相关信息
 */
func (client *Client) DetailFacevrfServerEx(request *DetailFacevrfServerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailFacevrfServerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailFacevrfServerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.server.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
 * Summary: 个人反欺诈风险校验
 */
func (client *Client) CheckAnticheatPersonal(request *CheckAnticheatPersonalRequest) (_result *CheckAnticheatPersonalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAnticheatPersonalResponse{}
	_body, _err := client.CheckAnticheatPersonalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
 * Summary: 个人反欺诈风险校验
 */
func (client *Client) CheckAnticheatPersonalEx(request *CheckAnticheatPersonalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAnticheatPersonalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAnticheatPersonalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.anticheat.personal.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 二要素支持hash主体信息
 * Summary: 个人二要素核验支持hash的主体信息
 */
func (client *Client) CheckTwometaHash(request *CheckTwometaHashRequest) (_result *CheckTwometaHashResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckTwometaHashResponse{}
	_body, _err := client.CheckTwometaHashEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 二要素支持hash主体信息
 * Summary: 个人二要素核验支持hash的主体信息
 */
func (client *Client) CheckTwometaHashEx(request *CheckTwometaHashRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckTwometaHashResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckTwometaHashResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.twometa.hash.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对接运营商等数据源查询手机号码的在网时长
 * Summary: 三要素在网时长查询接口
 */
func (client *Client) QueryThreemetaOnlinetime(request *QueryThreemetaOnlinetimeRequest) (_result *QueryThreemetaOnlinetimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThreemetaOnlinetimeResponse{}
	_body, _err := client.QueryThreemetaOnlinetimeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对接运营商等数据源查询手机号码的在网时长
 * Summary: 三要素在网时长查询接口
 */
func (client *Client) QueryThreemetaOnlinetimeEx(request *QueryThreemetaOnlinetimeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThreemetaOnlinetimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThreemetaOnlinetimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.onlinetime.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端初始化认证(OEM专用)
 * Summary: 客户端初始化认证(OEM专用)
 */
func (client *Client) InitFacevrfZim(request *InitFacevrfZimRequest) (_result *InitFacevrfZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitFacevrfZimResponse{}
	_body, _err := client.InitFacevrfZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端初始化认证(OEM专用)
 * Summary: 客户端初始化认证(OEM专用)
 */
func (client *Client) InitFacevrfZimEx(request *InitFacevrfZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitFacevrfZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitFacevrfZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.zim.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户端人脸验证(OEM专用)
 * Summary: 客户端人脸验证(OEM专用)
 */
func (client *Client) VerifyFacevrfZim(request *VerifyFacevrfZimRequest) (_result *VerifyFacevrfZimResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFacevrfZimResponse{}
	_body, _err := client.VerifyFacevrfZimEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户端人脸验证(OEM专用)
 * Summary: 客户端人脸验证(OEM专用)
 */
func (client *Client) VerifyFacevrfZimEx(request *VerifyFacevrfZimRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFacevrfZimResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFacevrfZimResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.facevrf.zim.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 卡证OCR
 * Summary: 卡证OCR
 */
func (client *Client) RecognizeDocIndividualcard(request *RecognizeDocIndividualcardRequest) (_result *RecognizeDocIndividualcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeDocIndividualcardResponse{}
	_body, _err := client.RecognizeDocIndividualcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 卡证OCR
 * Summary: 卡证OCR
 */
func (client *Client) RecognizeDocIndividualcardEx(request *RecognizeDocIndividualcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeDocIndividualcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeDocIndividualcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.doc.individualcard.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人银行卡三要素
 * Summary: 个人银行卡三要素
 */
func (client *Client) CheckThreemetaBankcard(request *CheckThreemetaBankcardRequest) (_result *CheckThreemetaBankcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckThreemetaBankcardResponse{}
	_body, _err := client.CheckThreemetaBankcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人银行卡三要素
 * Summary: 个人银行卡三要素
 */
func (client *Client) CheckThreemetaBankcardEx(request *CheckThreemetaBankcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckThreemetaBankcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckThreemetaBankcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.bankcard.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: deepsec终端安全风险标签查询
 * Summary: deepsec终端安全风险标签查询
 */
func (client *Client) QueryDeepsecRisk(request *QueryDeepsecRiskRequest) (_result *QueryDeepsecRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeepsecRiskResponse{}
	_body, _err := client.QueryDeepsecRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: deepsec终端安全风险标签查询
 * Summary: deepsec终端安全风险标签查询
 */
func (client *Client) QueryDeepsecRiskEx(request *QueryDeepsecRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeepsecRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeepsecRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.deepsec.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: deepsec终端安全api，用于apdid查询
 * Summary: tsbmrq设备id查询入口
 */
func (client *Client) QueryDeepsecTsbmrq(request *QueryDeepsecTsbmrqRequest) (_result *QueryDeepsecTsbmrqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeepsecTsbmrqResponse{}
	_body, _err := client.QueryDeepsecTsbmrqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: deepsec终端安全api，用于apdid查询
 * Summary: tsbmrq设备id查询入口
 */
func (client *Client) QueryDeepsecTsbmrqEx(request *QueryDeepsecTsbmrqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeepsecTsbmrqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeepsecTsbmrqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.deepsec.tsbmrq.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人运营商二次放号
 * Summary: 个人运营商二次放号
 */
func (client *Client) QueryThreemetaPhonereuse(request *QueryThreemetaPhonereuseRequest) (_result *QueryThreemetaPhonereuseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryThreemetaPhonereuseResponse{}
	_body, _err := client.QueryThreemetaPhonereuseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人运营商二次放号
 * Summary: 个人运营商二次放号
 */
func (client *Client) QueryThreemetaPhonereuseEx(request *QueryThreemetaPhonereuseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryThreemetaPhonereuseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryThreemetaPhonereuseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("di.realperson.threemeta.phonereuse.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
