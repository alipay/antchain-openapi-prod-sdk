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

// 区块链信息
type BlockchainInfoDTO struct {
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易时间戳
	TxTime *int64 `json:"tx_time,omitempty" xml:"tx_time,omitempty" require:"true"`
}

func (s BlockchainInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s BlockchainInfoDTO) GoString() string {
	return s.String()
}

func (s *BlockchainInfoDTO) SetTxHash(v string) *BlockchainInfoDTO {
	s.TxHash = &v
	return s
}

func (s *BlockchainInfoDTO) SetTxTime(v int64) *BlockchainInfoDTO {
	s.TxTime = &v
	return s
}

// 商品信息
type GoodsDTO struct {
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 商品模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 商品内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 二维码地址
	QrCode *string `json:"qr_code,omitempty" xml:"qr_code,omitempty" require:"true"`
	// 区块链信息
	BlockchainInfo *BlockchainInfoDTO `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty" require:"true"`
}

func (s GoodsDTO) String() string {
	return tea.Prettify(s)
}

func (s GoodsDTO) GoString() string {
	return s.String()
}

func (s *GoodsDTO) SetGoodsId(v string) *GoodsDTO {
	s.GoodsId = &v
	return s
}

func (s *GoodsDTO) SetTemplateId(v string) *GoodsDTO {
	s.TemplateId = &v
	return s
}

func (s *GoodsDTO) SetContent(v string) *GoodsDTO {
	s.Content = &v
	return s
}

func (s *GoodsDTO) SetQrCode(v string) *GoodsDTO {
	s.QrCode = &v
	return s
}

func (s *GoodsDTO) SetBlockchainInfo(v *BlockchainInfoDTO) *GoodsDTO {
	s.BlockchainInfo = v
	return s
}

// 溯源信息
type TraceInfoDTO struct {
	// 操作描述
	OperateTypeDesc *string `json:"operate_type_desc,omitempty" xml:"operate_type_desc,omitempty" require:"true"`
	// 操作时间，时间戳
	OperateTime *int64 `json:"operate_time,omitempty" xml:"operate_time,omitempty" require:"true"`
	// 操作人id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作人名称
	OperatorName *string `json:"operator_name,omitempty" xml:"operator_name,omitempty" require:"true"`
	// 操作内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s TraceInfoDTO) String() string {
	return tea.Prettify(s)
}

func (s TraceInfoDTO) GoString() string {
	return s.String()
}

func (s *TraceInfoDTO) SetOperateTypeDesc(v string) *TraceInfoDTO {
	s.OperateTypeDesc = &v
	return s
}

func (s *TraceInfoDTO) SetOperateTime(v int64) *TraceInfoDTO {
	s.OperateTime = &v
	return s
}

func (s *TraceInfoDTO) SetOperatorId(v string) *TraceInfoDTO {
	s.OperatorId = &v
	return s
}

func (s *TraceInfoDTO) SetOperatorName(v string) *TraceInfoDTO {
	s.OperatorName = &v
	return s
}

func (s *TraceInfoDTO) SetContent(v string) *TraceInfoDTO {
	s.Content = &v
	return s
}

// 商品模板
type GoodsTemplateDTO struct {
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品模板描述
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s GoodsTemplateDTO) String() string {
	return tea.Prettify(s)
}

func (s GoodsTemplateDTO) GoString() string {
	return s.String()
}

func (s *GoodsTemplateDTO) SetTemplateId(v string) *GoodsTemplateDTO {
	s.TemplateId = &v
	return s
}

func (s *GoodsTemplateDTO) SetName(v string) *GoodsTemplateDTO {
	s.Name = &v
	return s
}

func (s *GoodsTemplateDTO) SetContent(v string) *GoodsTemplateDTO {
	s.Content = &v
	return s
}

type CreateLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
	SceneType *string `json:"scene_type,omitempty" xml:"scene_type,omitempty" require:"true"`
	// 联盟名称
	LeagueName *string `json:"league_name,omitempty" xml:"league_name,omitempty" require:"true"`
	// 黄酒集市
	SceneDesc *string `json:"scene_desc,omitempty" xml:"scene_desc,omitempty"`
}

func (s CreateLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueRequest) GoString() string {
	return s.String()
}

func (s *CreateLeagueRequest) SetAuthToken(v string) *CreateLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateLeagueRequest) SetProductInstanceId(v string) *CreateLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateLeagueRequest) SetSceneType(v string) *CreateLeagueRequest {
	s.SceneType = &v
	return s
}

func (s *CreateLeagueRequest) SetLeagueName(v string) *CreateLeagueRequest {
	s.LeagueName = &v
	return s
}

func (s *CreateLeagueRequest) SetSceneDesc(v string) *CreateLeagueRequest {
	s.SceneDesc = &v
	return s
}

type CreateLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty"`
}

func (s CreateLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateLeagueResponse) GoString() string {
	return s.String()
}

func (s *CreateLeagueResponse) SetReqMsgId(v string) *CreateLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateLeagueResponse) SetResultCode(v string) *CreateLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateLeagueResponse) SetResultMsg(v string) *CreateLeagueResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateLeagueResponse) SetLeagueId(v string) *CreateLeagueResponse {
	s.LeagueId = &v
	return s
}

type CancelLeagueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
}

func (s CancelLeagueRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelLeagueRequest) GoString() string {
	return s.String()
}

func (s *CancelLeagueRequest) SetAuthToken(v string) *CancelLeagueRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelLeagueRequest) SetProductInstanceId(v string) *CancelLeagueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelLeagueRequest) SetLeagueId(v string) *CancelLeagueRequest {
	s.LeagueId = &v
	return s
}

type CancelLeagueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelLeagueResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelLeagueResponse) GoString() string {
	return s.String()
}

func (s *CancelLeagueResponse) SetReqMsgId(v string) *CancelLeagueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelLeagueResponse) SetResultCode(v string) *CancelLeagueResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelLeagueResponse) SetResultMsg(v string) *CancelLeagueResponse {
	s.ResultMsg = &v
	return s
}

type CreateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户昵称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s CreateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserRequest) GoString() string {
	return s.String()
}

func (s *CreateUserRequest) SetAuthToken(v string) *CreateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserRequest) SetProductInstanceId(v string) *CreateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserRequest) SetUserName(v string) *CreateUserRequest {
	s.UserName = &v
	return s
}

func (s *CreateUserRequest) SetLeagueId(v string) *CreateUserRequest {
	s.LeagueId = &v
	return s
}

func (s *CreateUserRequest) SetCertName(v string) *CreateUserRequest {
	s.CertName = &v
	return s
}

func (s *CreateUserRequest) SetCertNo(v string) *CreateUserRequest {
	s.CertNo = &v
	return s
}

func (s *CreateUserRequest) SetPhone(v string) *CreateUserRequest {
	s.Phone = &v
	return s
}

func (s *CreateUserRequest) SetEmail(v string) *CreateUserRequest {
	s.Email = &v
	return s
}

type CreateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CreateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserResponse) GoString() string {
	return s.String()
}

func (s *CreateUserResponse) SetReqMsgId(v string) *CreateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserResponse) SetResultCode(v string) *CreateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserResponse) SetResultMsg(v string) *CreateUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUserResponse) SetUserId(v string) *CreateUserResponse {
	s.UserId = &v
	return s
}

type UpdateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户昵称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s UpdateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserRequest) GoString() string {
	return s.String()
}

func (s *UpdateUserRequest) SetAuthToken(v string) *UpdateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUserRequest) SetProductInstanceId(v string) *UpdateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUserRequest) SetUserId(v string) *UpdateUserRequest {
	s.UserId = &v
	return s
}

func (s *UpdateUserRequest) SetUserName(v string) *UpdateUserRequest {
	s.UserName = &v
	return s
}

func (s *UpdateUserRequest) SetCertName(v string) *UpdateUserRequest {
	s.CertName = &v
	return s
}

func (s *UpdateUserRequest) SetCertNo(v string) *UpdateUserRequest {
	s.CertNo = &v
	return s
}

func (s *UpdateUserRequest) SetPhone(v string) *UpdateUserRequest {
	s.Phone = &v
	return s
}

func (s *UpdateUserRequest) SetEmail(v string) *UpdateUserRequest {
	s.Email = &v
	return s
}

type UpdateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserResponse) GoString() string {
	return s.String()
}

func (s *UpdateUserResponse) SetReqMsgId(v string) *UpdateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUserResponse) SetResultCode(v string) *UpdateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUserResponse) SetResultMsg(v string) *UpdateUserResponse {
	s.ResultMsg = &v
	return s
}

type BindUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 支付宝：ALIPAY
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
	// 开放平台用户id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
}

func (s BindUserRequest) String() string {
	return tea.Prettify(s)
}

func (s BindUserRequest) GoString() string {
	return s.String()
}

func (s *BindUserRequest) SetAuthToken(v string) *BindUserRequest {
	s.AuthToken = &v
	return s
}

func (s *BindUserRequest) SetProductInstanceId(v string) *BindUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindUserRequest) SetUserId(v string) *BindUserRequest {
	s.UserId = &v
	return s
}

func (s *BindUserRequest) SetPlatform(v string) *BindUserRequest {
	s.Platform = &v
	return s
}

func (s *BindUserRequest) SetOpenId(v string) *BindUserRequest {
	s.OpenId = &v
	return s
}

type BindUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindUserResponse) String() string {
	return tea.Prettify(s)
}

func (s BindUserResponse) GoString() string {
	return s.String()
}

func (s *BindUserResponse) SetReqMsgId(v string) *BindUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindUserResponse) SetResultCode(v string) *BindUserResponse {
	s.ResultCode = &v
	return s
}

func (s *BindUserResponse) SetResultMsg(v string) *BindUserResponse {
	s.ResultMsg = &v
	return s
}

type UnbindUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 支付宝：ALIPAY
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
}

func (s UnbindUserRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindUserRequest) GoString() string {
	return s.String()
}

func (s *UnbindUserRequest) SetAuthToken(v string) *UnbindUserRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindUserRequest) SetProductInstanceId(v string) *UnbindUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindUserRequest) SetUserId(v string) *UnbindUserRequest {
	s.UserId = &v
	return s
}

func (s *UnbindUserRequest) SetPlatform(v string) *UnbindUserRequest {
	s.Platform = &v
	return s
}

type UnbindUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindUserResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindUserResponse) GoString() string {
	return s.String()
}

func (s *UnbindUserResponse) SetReqMsgId(v string) *UnbindUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindUserResponse) SetResultCode(v string) *UnbindUserResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindUserResponse) SetResultMsg(v string) *UnbindUserResponse {
	s.ResultMsg = &v
	return s
}

type CreateGoodstemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品定义描述，格式如示例
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 联盟id
	LeagueId *string `json:"league_id,omitempty" xml:"league_id,omitempty" require:"true"`
}

func (s CreateGoodstemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodstemplateRequest) GoString() string {
	return s.String()
}

func (s *CreateGoodstemplateRequest) SetAuthToken(v string) *CreateGoodstemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGoodstemplateRequest) SetProductInstanceId(v string) *CreateGoodstemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateGoodstemplateRequest) SetName(v string) *CreateGoodstemplateRequest {
	s.Name = &v
	return s
}

func (s *CreateGoodstemplateRequest) SetContent(v string) *CreateGoodstemplateRequest {
	s.Content = &v
	return s
}

func (s *CreateGoodstemplateRequest) SetLeagueId(v string) *CreateGoodstemplateRequest {
	s.LeagueId = &v
	return s
}

type CreateGoodstemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
}

func (s CreateGoodstemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodstemplateResponse) GoString() string {
	return s.String()
}

func (s *CreateGoodstemplateResponse) SetReqMsgId(v string) *CreateGoodstemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGoodstemplateResponse) SetResultCode(v string) *CreateGoodstemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGoodstemplateResponse) SetResultMsg(v string) *CreateGoodstemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateGoodstemplateResponse) SetTemplateId(v string) *CreateGoodstemplateResponse {
	s.TemplateId = &v
	return s
}

type UpdateGoodstemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 商品定义描述，格式如示例
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s UpdateGoodstemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodstemplateRequest) GoString() string {
	return s.String()
}

func (s *UpdateGoodstemplateRequest) SetAuthToken(v string) *UpdateGoodstemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGoodstemplateRequest) SetProductInstanceId(v string) *UpdateGoodstemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGoodstemplateRequest) SetTemplateId(v string) *UpdateGoodstemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *UpdateGoodstemplateRequest) SetContent(v string) *UpdateGoodstemplateRequest {
	s.Content = &v
	return s
}

type UpdateGoodstemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateGoodstemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodstemplateResponse) GoString() string {
	return s.String()
}

func (s *UpdateGoodstemplateResponse) SetReqMsgId(v string) *UpdateGoodstemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGoodstemplateResponse) SetResultCode(v string) *UpdateGoodstemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGoodstemplateResponse) SetResultMsg(v string) *UpdateGoodstemplateResponse {
	s.ResultMsg = &v
	return s
}

type CancelGoodstemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s CancelGoodstemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelGoodstemplateRequest) GoString() string {
	return s.String()
}

func (s *CancelGoodstemplateRequest) SetAuthToken(v string) *CancelGoodstemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelGoodstemplateRequest) SetProductInstanceId(v string) *CancelGoodstemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelGoodstemplateRequest) SetTemplateId(v string) *CancelGoodstemplateRequest {
	s.TemplateId = &v
	return s
}

type CancelGoodstemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelGoodstemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelGoodstemplateResponse) GoString() string {
	return s.String()
}

func (s *CancelGoodstemplateResponse) SetReqMsgId(v string) *CancelGoodstemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelGoodstemplateResponse) SetResultCode(v string) *CancelGoodstemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelGoodstemplateResponse) SetResultMsg(v string) *CancelGoodstemplateResponse {
	s.ResultMsg = &v
	return s
}

type QueryGoodstemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品模板id，如果传入这个字段，返回的列表只有一条数据
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 当前页数
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页大小，最大为20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"20" minimum:"1"`
}

func (s QueryGoodstemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodstemplateRequest) GoString() string {
	return s.String()
}

func (s *QueryGoodstemplateRequest) SetAuthToken(v string) *QueryGoodstemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGoodstemplateRequest) SetProductInstanceId(v string) *QueryGoodstemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGoodstemplateRequest) SetTemplateId(v string) *QueryGoodstemplateRequest {
	s.TemplateId = &v
	return s
}

func (s *QueryGoodstemplateRequest) SetCurrentPage(v int64) *QueryGoodstemplateRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryGoodstemplateRequest) SetPageSize(v int64) *QueryGoodstemplateRequest {
	s.PageSize = &v
	return s
}

type QueryGoodstemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品模板列表
	GoodstemplateList []*GoodsTemplateDTO `json:"goodstemplate_list,omitempty" xml:"goodstemplate_list,omitempty" type:"Repeated"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 当前页数
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s QueryGoodstemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodstemplateResponse) GoString() string {
	return s.String()
}

func (s *QueryGoodstemplateResponse) SetReqMsgId(v string) *QueryGoodstemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGoodstemplateResponse) SetResultCode(v string) *QueryGoodstemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGoodstemplateResponse) SetResultMsg(v string) *QueryGoodstemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGoodstemplateResponse) SetGoodstemplateList(v []*GoodsTemplateDTO) *QueryGoodstemplateResponse {
	s.GoodstemplateList = v
	return s
}

func (s *QueryGoodstemplateResponse) SetTotalPage(v int64) *QueryGoodstemplateResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryGoodstemplateResponse) SetCurrentPage(v int64) *QueryGoodstemplateResponse {
	s.CurrentPage = &v
	return s
}

type CreateGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 商品信息
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s CreateGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodsRequest) GoString() string {
	return s.String()
}

func (s *CreateGoodsRequest) SetAuthToken(v string) *CreateGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGoodsRequest) SetProductInstanceId(v string) *CreateGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateGoodsRequest) SetTemplateId(v string) *CreateGoodsRequest {
	s.TemplateId = &v
	return s
}

func (s *CreateGoodsRequest) SetUserId(v string) *CreateGoodsRequest {
	s.UserId = &v
	return s
}

func (s *CreateGoodsRequest) SetContent(v string) *CreateGoodsRequest {
	s.Content = &v
	return s
}

type CreateGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty"`
}

func (s CreateGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodsResponse) GoString() string {
	return s.String()
}

func (s *CreateGoodsResponse) SetReqMsgId(v string) *CreateGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGoodsResponse) SetResultCode(v string) *CreateGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGoodsResponse) SetResultMsg(v string) *CreateGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateGoodsResponse) SetGoodsId(v string) *CreateGoodsResponse {
	s.GoodsId = &v
	return s
}

type UpdateGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 商品详情
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s UpdateGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodsRequest) GoString() string {
	return s.String()
}

func (s *UpdateGoodsRequest) SetAuthToken(v string) *UpdateGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGoodsRequest) SetProductInstanceId(v string) *UpdateGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGoodsRequest) SetGoodsId(v string) *UpdateGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *UpdateGoodsRequest) SetContent(v string) *UpdateGoodsRequest {
	s.Content = &v
	return s
}

type UpdateGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链交易信息
	BlockchainInfo *BlockchainInfoDTO `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
}

func (s UpdateGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGoodsResponse) GoString() string {
	return s.String()
}

func (s *UpdateGoodsResponse) SetReqMsgId(v string) *UpdateGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGoodsResponse) SetResultCode(v string) *UpdateGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGoodsResponse) SetResultMsg(v string) *UpdateGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateGoodsResponse) SetBlockchainInfo(v *BlockchainInfoDTO) *UpdateGoodsResponse {
	s.BlockchainInfo = v
	return s
}

type SendGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 接收人用户id
	TransfereeId *string `json:"transferee_id,omitempty" xml:"transferee_id,omitempty" require:"true"`
	// 转让金额，单位分
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
}

func (s SendGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s SendGoodsRequest) GoString() string {
	return s.String()
}

func (s *SendGoodsRequest) SetAuthToken(v string) *SendGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *SendGoodsRequest) SetProductInstanceId(v string) *SendGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendGoodsRequest) SetGoodsId(v string) *SendGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *SendGoodsRequest) SetTransfereeId(v string) *SendGoodsRequest {
	s.TransfereeId = &v
	return s
}

func (s *SendGoodsRequest) SetAmount(v int64) *SendGoodsRequest {
	s.Amount = &v
	return s
}

type SendGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链交易信息
	BlockchainInfo *BlockchainInfoDTO `json:"blockchain_info,omitempty" xml:"blockchain_info,omitempty"`
}

func (s SendGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s SendGoodsResponse) GoString() string {
	return s.String()
}

func (s *SendGoodsResponse) SetReqMsgId(v string) *SendGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendGoodsResponse) SetResultCode(v string) *SendGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *SendGoodsResponse) SetResultMsg(v string) *SendGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendGoodsResponse) SetBlockchainInfo(v *BlockchainInfoDTO) *SendGoodsResponse {
	s.BlockchainInfo = v
	return s
}

type QueryGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
	TraceType *string `json:"trace_type,omitempty" xml:"trace_type,omitempty"`
	// 当前页（默认为1）
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小（默认为10）
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsRequest) GoString() string {
	return s.String()
}

func (s *QueryGoodsRequest) SetAuthToken(v string) *QueryGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGoodsRequest) SetProductInstanceId(v string) *QueryGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGoodsRequest) SetGoodsId(v string) *QueryGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *QueryGoodsRequest) SetTraceType(v string) *QueryGoodsRequest {
	s.TraceType = &v
	return s
}

func (s *QueryGoodsRequest) SetCurrentPage(v int64) *QueryGoodsRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryGoodsRequest) SetPageSize(v int64) *QueryGoodsRequest {
	s.PageSize = &v
	return s
}

type QueryGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品信息
	Goods *GoodsDTO `json:"goods,omitempty" xml:"goods,omitempty"`
	// 溯源信息列表
	TraceInfoList []*TraceInfoDTO `json:"trace_info_list,omitempty" xml:"trace_info_list,omitempty" type:"Repeated"`
	// 流转信息列表
	RoamTraceList []*TraceInfoDTO `json:"roam_trace_list,omitempty" xml:"roam_trace_list,omitempty" type:"Repeated"`
}

func (s QueryGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGoodsResponse) GoString() string {
	return s.String()
}

func (s *QueryGoodsResponse) SetReqMsgId(v string) *QueryGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGoodsResponse) SetResultCode(v string) *QueryGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGoodsResponse) SetResultMsg(v string) *QueryGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGoodsResponse) SetGoods(v *GoodsDTO) *QueryGoodsResponse {
	s.Goods = v
	return s
}

func (s *QueryGoodsResponse) SetTraceInfoList(v []*TraceInfoDTO) *QueryGoodsResponse {
	s.TraceInfoList = v
	return s
}

func (s *QueryGoodsResponse) SetRoamTraceList(v []*TraceInfoDTO) *QueryGoodsResponse {
	s.RoamTraceList = v
	return s
}

type PagequeryGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 每页大小，最大20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true" maximum:"20" minimum:"1"`
	// 数据范围类型：ALL_ASSET，所有物证；EFFECTIVE_ASSET，已生效物证；INVALID_ASSET，已失效物证。
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s PagequeryGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryGoodsRequest) GoString() string {
	return s.String()
}

func (s *PagequeryGoodsRequest) SetAuthToken(v string) *PagequeryGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryGoodsRequest) SetProductInstanceId(v string) *PagequeryGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryGoodsRequest) SetUserId(v string) *PagequeryGoodsRequest {
	s.UserId = &v
	return s
}

func (s *PagequeryGoodsRequest) SetCurrentPage(v int64) *PagequeryGoodsRequest {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryGoodsRequest) SetPageSize(v int64) *PagequeryGoodsRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryGoodsRequest) SetType(v string) *PagequeryGoodsRequest {
	s.Type = &v
	return s
}

type PagequeryGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 商品列表
	GoodsList []*GoodsDTO `json:"goods_list,omitempty" xml:"goods_list,omitempty" type:"Repeated"`
}

func (s PagequeryGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryGoodsResponse) GoString() string {
	return s.String()
}

func (s *PagequeryGoodsResponse) SetReqMsgId(v string) *PagequeryGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryGoodsResponse) SetResultCode(v string) *PagequeryGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryGoodsResponse) SetResultMsg(v string) *PagequeryGoodsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryGoodsResponse) SetCurrentPage(v int64) *PagequeryGoodsResponse {
	s.CurrentPage = &v
	return s
}

func (s *PagequeryGoodsResponse) SetTotalPage(v int64) *PagequeryGoodsResponse {
	s.TotalPage = &v
	return s
}

func (s *PagequeryGoodsResponse) SetGoodsList(v []*GoodsDTO) *PagequeryGoodsResponse {
	s.GoodsList = v
	return s
}

type CreateGoodsOperateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 操作内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s CreateGoodsOperateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodsOperateRequest) GoString() string {
	return s.String()
}

func (s *CreateGoodsOperateRequest) SetAuthToken(v string) *CreateGoodsOperateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGoodsOperateRequest) SetProductInstanceId(v string) *CreateGoodsOperateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateGoodsOperateRequest) SetGoodsId(v string) *CreateGoodsOperateRequest {
	s.GoodsId = &v
	return s
}

func (s *CreateGoodsOperateRequest) SetContent(v string) *CreateGoodsOperateRequest {
	s.Content = &v
	return s
}

type CreateGoodsOperateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateGoodsOperateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGoodsOperateResponse) GoString() string {
	return s.String()
}

func (s *CreateGoodsOperateResponse) SetReqMsgId(v string) *CreateGoodsOperateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGoodsOperateResponse) SetResultCode(v string) *CreateGoodsOperateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGoodsOperateResponse) SetResultMsg(v string) *CreateGoodsOperateResponse {
	s.ResultMsg = &v
	return s
}

type CancelGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品核销
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
}

func (s CancelGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelGoodsRequest) GoString() string {
	return s.String()
}

func (s *CancelGoodsRequest) SetAuthToken(v string) *CancelGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelGoodsRequest) SetProductInstanceId(v string) *CancelGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelGoodsRequest) SetGoodsId(v string) *CancelGoodsRequest {
	s.GoodsId = &v
	return s
}

type CancelGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelGoodsResponse) GoString() string {
	return s.String()
}

func (s *CancelGoodsResponse) SetReqMsgId(v string) *CancelGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelGoodsResponse) SetResultCode(v string) *CancelGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelGoodsResponse) SetResultMsg(v string) *CancelGoodsResponse {
	s.ResultMsg = &v
	return s
}

type DisableGoodsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品id
	GoodsId *string `json:"goods_id,omitempty" xml:"goods_id,omitempty" require:"true"`
	// 异常状态描述
	StatusDesc *string `json:"status_desc,omitempty" xml:"status_desc,omitempty" require:"true"`
}

func (s DisableGoodsRequest) String() string {
	return tea.Prettify(s)
}

func (s DisableGoodsRequest) GoString() string {
	return s.String()
}

func (s *DisableGoodsRequest) SetAuthToken(v string) *DisableGoodsRequest {
	s.AuthToken = &v
	return s
}

func (s *DisableGoodsRequest) SetProductInstanceId(v string) *DisableGoodsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DisableGoodsRequest) SetGoodsId(v string) *DisableGoodsRequest {
	s.GoodsId = &v
	return s
}

func (s *DisableGoodsRequest) SetStatusDesc(v string) *DisableGoodsRequest {
	s.StatusDesc = &v
	return s
}

type DisableGoodsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DisableGoodsResponse) String() string {
	return tea.Prettify(s)
}

func (s DisableGoodsResponse) GoString() string {
	return s.String()
}

func (s *DisableGoodsResponse) SetReqMsgId(v string) *DisableGoodsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DisableGoodsResponse) SetResultCode(v string) *DisableGoodsResponse {
	s.ResultCode = &v
	return s
}

func (s *DisableGoodsResponse) SetResultMsg(v string) *DisableGoodsResponse {
	s.ResultMsg = &v
	return s
}

type GetHealthcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证号，使用蚂蚁侧提供的RSA公钥加密
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 设备编码
	DeviceCode *string `json:"device_code,omitempty" xml:"device_code,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 是否需要健康码信息，不传默认不需要
	// 1：需要
	// 0：不需要
	Health *int64 `json:"health,omitempty" xml:"health,omitempty"`
	// 是否需要疫苗信息
	// 1：需要，0：不需要，不传默认不需要
	Vaccination *int64 `json:"vaccination,omitempty" xml:"vaccination,omitempty"`
	// 是否需要核酸信息：
	// 1.需要，0：不需要，不传默认不需要
	NucleicAcid *int64 `json:"nucleic_acid,omitempty" xml:"nucleic_acid,omitempty"`
	// 是否需要行程码：
	// 1.需要，0：不需要，不传默认不需要
	Travel *int64 `json:"travel,omitempty" xml:"travel,omitempty"`
}

func (s GetHealthcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetHealthcodeRequest) GoString() string {
	return s.String()
}

func (s *GetHealthcodeRequest) SetAuthToken(v string) *GetHealthcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetHealthcodeRequest) SetProductInstanceId(v string) *GetHealthcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetHealthcodeRequest) SetCertNo(v string) *GetHealthcodeRequest {
	s.CertNo = &v
	return s
}

func (s *GetHealthcodeRequest) SetDeviceCode(v string) *GetHealthcodeRequest {
	s.DeviceCode = &v
	return s
}

func (s *GetHealthcodeRequest) SetName(v string) *GetHealthcodeRequest {
	s.Name = &v
	return s
}

func (s *GetHealthcodeRequest) SetHealth(v int64) *GetHealthcodeRequest {
	s.Health = &v
	return s
}

func (s *GetHealthcodeRequest) SetVaccination(v int64) *GetHealthcodeRequest {
	s.Vaccination = &v
	return s
}

func (s *GetHealthcodeRequest) SetNucleicAcid(v int64) *GetHealthcodeRequest {
	s.NucleicAcid = &v
	return s
}

func (s *GetHealthcodeRequest) SetTravel(v int64) *GetHealthcodeRequest {
	s.Travel = &v
	return s
}

type GetHealthcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1：绿色 2：黄色 3：红色
	HealthCode *string `json:"health_code,omitempty" xml:"health_code,omitempty"`
	// 健康码失败原因
	HealthFactor *string `json:"health_factor,omitempty" xml:"health_factor,omitempty"`
	// 行程码信息
	// 1:没去过疫情区，绿码;
	// 2:去过疫情区，红码;
	// 3:其他，黄码;
	// 0:行程信息不全;
	// -1查询失败;
	TravelCode *string `json:"travel_code,omitempty" xml:"travel_code,omitempty"`
	// 检测类型
	ReportType *string `json:"report_type,omitempty" xml:"report_type,omitempty"`
	// 检测结果
	ReportResult *string `json:"report_result,omitempty" xml:"report_result,omitempty"`
	// 检测机构
	ReportOrganization *string `json:"report_organization,omitempty" xml:"report_organization,omitempty"`
	// 检测时间
	ReportTime *string `json:"report_time,omitempty" xml:"report_time,omitempty"`
	// 疫苗接种信息：
	// 0查询失败 1未接种 2已接种一针 3完成接种
	VaccinationCode *string `json:"vaccination_code,omitempty" xml:"vaccination_code,omitempty"`
}

func (s GetHealthcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetHealthcodeResponse) GoString() string {
	return s.String()
}

func (s *GetHealthcodeResponse) SetReqMsgId(v string) *GetHealthcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetHealthcodeResponse) SetResultCode(v string) *GetHealthcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetHealthcodeResponse) SetResultMsg(v string) *GetHealthcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetHealthcodeResponse) SetHealthCode(v string) *GetHealthcodeResponse {
	s.HealthCode = &v
	return s
}

func (s *GetHealthcodeResponse) SetHealthFactor(v string) *GetHealthcodeResponse {
	s.HealthFactor = &v
	return s
}

func (s *GetHealthcodeResponse) SetTravelCode(v string) *GetHealthcodeResponse {
	s.TravelCode = &v
	return s
}

func (s *GetHealthcodeResponse) SetReportType(v string) *GetHealthcodeResponse {
	s.ReportType = &v
	return s
}

func (s *GetHealthcodeResponse) SetReportResult(v string) *GetHealthcodeResponse {
	s.ReportResult = &v
	return s
}

func (s *GetHealthcodeResponse) SetReportOrganization(v string) *GetHealthcodeResponse {
	s.ReportOrganization = &v
	return s
}

func (s *GetHealthcodeResponse) SetReportTime(v string) *GetHealthcodeResponse {
	s.ReportTime = &v
	return s
}

func (s *GetHealthcodeResponse) SetVaccinationCode(v string) *GetHealthcodeResponse {
	s.VaccinationCode = &v
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
				"sdk_version":      tea.String("1.0.4"),
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
 * Description: 创建联盟
 * Summary: 创建联盟
 */
func (client *Client) CreateLeague(request *CreateLeagueRequest) (_result *CreateLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateLeagueResponse{}
	_body, _err := client.CreateLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建联盟
 * Summary: 创建联盟
 */
func (client *Client) CreateLeagueEx(request *CreateLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.league.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注销联盟
 * Summary: 注销联盟
 */
func (client *Client) CancelLeague(request *CancelLeagueRequest) (_result *CancelLeagueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelLeagueResponse{}
	_body, _err := client.CancelLeagueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注销联盟
 * Summary: 注销联盟
 */
func (client *Client) CancelLeagueEx(request *CancelLeagueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelLeagueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelLeagueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.league.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建用户
 * Summary: 创建用户
 */
func (client *Client) CreateUser(request *CreateUserRequest) (_result *CreateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserResponse{}
	_body, _err := client.CreateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建用户
 * Summary: 创建用户
 */
func (client *Client) CreateUserEx(request *CreateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新用户
 * Summary: 更新用户
 */
func (client *Client) UpdateUser(request *UpdateUserRequest) (_result *UpdateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUserResponse{}
	_body, _err := client.UpdateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新用户
 * Summary: 更新用户
 */
func (client *Client) UpdateUserEx(request *UpdateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.user.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 渠道用户绑定
 * Summary: 渠道用户绑定
 */
func (client *Client) BindUser(request *BindUserRequest) (_result *BindUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindUserResponse{}
	_body, _err := client.BindUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 渠道用户绑定
 * Summary: 渠道用户绑定
 */
func (client *Client) BindUserEx(request *BindUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.user.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 渠道用户解绑
 * Summary: 渠道用户解绑
 */
func (client *Client) UnbindUser(request *UnbindUserRequest) (_result *UnbindUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindUserResponse{}
	_body, _err := client.UnbindUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 渠道用户解绑
 * Summary: 渠道用户解绑
 */
func (client *Client) UnbindUserEx(request *UnbindUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.user.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品模版定义
 * Summary: 链上商品模版定义
 */
func (client *Client) CreateGoodstemplate(request *CreateGoodstemplateRequest) (_result *CreateGoodstemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGoodstemplateResponse{}
	_body, _err := client.CreateGoodstemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品模版定义
 * Summary: 链上商品模版定义
 */
func (client *Client) CreateGoodstemplateEx(request *CreateGoodstemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGoodstemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGoodstemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goodstemplate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品模版更新
 * Summary: 链上商品模版更新
 */
func (client *Client) UpdateGoodstemplate(request *UpdateGoodstemplateRequest) (_result *UpdateGoodstemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGoodstemplateResponse{}
	_body, _err := client.UpdateGoodstemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品模版更新
 * Summary: 链上商品模版更新
 */
func (client *Client) UpdateGoodstemplateEx(request *UpdateGoodstemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGoodstemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGoodstemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goodstemplate.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品模版注销
 * Summary: 链上商品模版注销
 */
func (client *Client) CancelGoodstemplate(request *CancelGoodstemplateRequest) (_result *CancelGoodstemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelGoodstemplateResponse{}
	_body, _err := client.CancelGoodstemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品模版注销
 * Summary: 链上商品模版注销
 */
func (client *Client) CancelGoodstemplateEx(request *CancelGoodstemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelGoodstemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelGoodstemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goodstemplate.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品模版查询
 * Summary: 链上商品模版查询
 */
func (client *Client) QueryGoodstemplate(request *QueryGoodstemplateRequest) (_result *QueryGoodstemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGoodstemplateResponse{}
	_body, _err := client.QueryGoodstemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品模版查询
 * Summary: 链上商品模版查询
 */
func (client *Client) QueryGoodstemplateEx(request *QueryGoodstemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGoodstemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGoodstemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goodstemplate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品发行
 * Summary: 链上商品发行
 */
func (client *Client) CreateGoods(request *CreateGoodsRequest) (_result *CreateGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGoodsResponse{}
	_body, _err := client.CreateGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品发行
 * Summary: 链上商品发行
 */
func (client *Client) CreateGoodsEx(request *CreateGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品更新
 * Summary: 链上商品更新
 */
func (client *Client) UpdateGoods(request *UpdateGoodsRequest) (_result *UpdateGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGoodsResponse{}
	_body, _err := client.UpdateGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品更新
 * Summary: 链上商品更新
 */
func (client *Client) UpdateGoodsEx(request *UpdateGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品转增
 * Summary: 链上商品转增
 */
func (client *Client) SendGoods(request *SendGoodsRequest) (_result *SendGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendGoodsResponse{}
	_body, _err := client.SendGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品转增
 * Summary: 链上商品转增
 */
func (client *Client) SendGoodsEx(request *SendGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品详情查询
 * Summary: 链上商品详情查询
 */
func (client *Client) QueryGoods(request *QueryGoodsRequest) (_result *QueryGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGoodsResponse{}
	_body, _err := client.QueryGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品详情查询
 * Summary: 链上商品详情查询
 */
func (client *Client) QueryGoodsEx(request *QueryGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上商品列表查询
 * Summary: 链上商品列表查询
 */
func (client *Client) PagequeryGoods(request *PagequeryGoodsRequest) (_result *PagequeryGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryGoodsResponse{}
	_body, _err := client.PagequeryGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上商品列表查询
 * Summary: 链上商品列表查询
 */
func (client *Client) PagequeryGoodsEx(request *PagequeryGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自定义链上商品操作节点
 * Summary: 自定义链上商品操作节点
 */
func (client *Client) CreateGoodsOperate(request *CreateGoodsOperateRequest) (_result *CreateGoodsOperateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGoodsOperateResponse{}
	_body, _err := client.CreateGoodsOperateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自定义链上商品操作节点
 * Summary: 自定义链上商品操作节点
 */
func (client *Client) CreateGoodsOperateEx(request *CreateGoodsOperateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGoodsOperateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGoodsOperateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.operate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品交收核销
 * Summary: 商品交收核销
 */
func (client *Client) CancelGoods(request *CancelGoodsRequest) (_result *CancelGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelGoodsResponse{}
	_body, _err := client.CancelGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品交收核销
 * Summary: 商品交收核销
 */
func (client *Client) CancelGoodsEx(request *CancelGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商品异常处置
 * Summary: 商品异常处置
 */
func (client *Client) DisableGoods(request *DisableGoodsRequest) (_result *DisableGoodsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DisableGoodsResponse{}
	_body, _err := client.DisableGoodsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商品异常处置
 * Summary: 商品异常处置
 */
func (client *Client) DisableGoodsEx(request *DisableGoodsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DisableGoodsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DisableGoodsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.goods.disable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取健康码、核酸、疫苗、行程码等信息
 * Summary: 获取健康码、核酸、疫苗、行程码等信息
 */
func (client *Client) GetHealthcode(request *GetHealthcodeRequest) (_result *GetHealthcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetHealthcodeResponse{}
	_body, _err := client.GetHealthcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取健康码、核酸、疫苗、行程码等信息
 * Summary: 获取健康码、核酸、疫苗、行程码等信息
 */
func (client *Client) GetHealthcodeEx(request *GetHealthcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetHealthcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetHealthcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.goodschain.healthcode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
