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

// 键值对，兼容map用
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// 核身产品
type GwValidateProduct struct {
	// 核审产品码，支持多种核身产品。
	// ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品渲染方式：H5、NATIVE 或 PC
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身产品参数，因网关限制，暂只支持Map<String,String>
	ProductParams []*NameValuePair `json:"product_params,omitempty" xml:"product_params,omitempty" type:"Repeated"`
}

func (s GwValidateProduct) String() string {
	return tea.Prettify(s)
}

func (s GwValidateProduct) GoString() string {
	return s.String()
}

func (s *GwValidateProduct) SetProductCode(v string) *GwValidateProduct {
	s.ProductCode = &v
	return s
}

func (s *GwValidateProduct) SetGroup(v string) *GwValidateProduct {
	s.Group = &v
	return s
}

func (s *GwValidateProduct) SetProductParams(v []*NameValuePair) *GwValidateProduct {
	s.ProductParams = v
	return s
}

// 客户认证结果
type CustomerAuthResult struct {
	// 账户ID
	AccId *string `json:"acc_id,omitempty" xml:"acc_id,omitempty"`
	// 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 客户did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 验证状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 开业时间
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty" require:"true"`
	// 认证结果，是否通过
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
	// 业务ID
	DisReqMsgId *string `json:"dis_req_msg_id,omitempty" xml:"dis_req_msg_id,omitempty"`
}

func (s CustomerAuthResult) String() string {
	return tea.Prettify(s)
}

func (s CustomerAuthResult) GoString() string {
	return s.String()
}

func (s *CustomerAuthResult) SetAccId(v string) *CustomerAuthResult {
	s.AccId = &v
	return s
}

func (s *CustomerAuthResult) SetCode(v string) *CustomerAuthResult {
	s.Code = &v
	return s
}

func (s *CustomerAuthResult) SetCustomerId(v string) *CustomerAuthResult {
	s.CustomerId = &v
	return s
}

func (s *CustomerAuthResult) SetDid(v string) *CustomerAuthResult {
	s.Did = &v
	return s
}

func (s *CustomerAuthResult) SetEnterpriseStatus(v string) *CustomerAuthResult {
	s.EnterpriseStatus = &v
	return s
}

func (s *CustomerAuthResult) SetOpenTime(v string) *CustomerAuthResult {
	s.OpenTime = &v
	return s
}

func (s *CustomerAuthResult) SetPass(v bool) *CustomerAuthResult {
	s.Pass = &v
	return s
}

func (s *CustomerAuthResult) SetDisReqMsgId(v string) *CustomerAuthResult {
	s.DisReqMsgId = &v
	return s
}

// 键值对，兼容map用
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

// 核身渲染结果
type GwVerifyViewResult struct {
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 核身分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 返回结果
	ResponseParams []*NameValuePair `json:"response_params,omitempty" xml:"response_params,omitempty" require:"true" type:"Repeated"`
	// 核身渲染是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 返回信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GwVerifyViewResult) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyViewResult) GoString() string {
	return s.String()
}

func (s *GwVerifyViewResult) SetVerifyId(v string) *GwVerifyViewResult {
	s.VerifyId = &v
	return s
}

func (s *GwVerifyViewResult) SetProductCode(v string) *GwVerifyViewResult {
	s.ProductCode = &v
	return s
}

func (s *GwVerifyViewResult) SetGroup(v string) *GwVerifyViewResult {
	s.Group = &v
	return s
}

func (s *GwVerifyViewResult) SetResponseParams(v []*NameValuePair) *GwVerifyViewResult {
	s.ResponseParams = v
	return s
}

func (s *GwVerifyViewResult) SetSuccess(v bool) *GwVerifyViewResult {
	s.Success = &v
	return s
}

func (s *GwVerifyViewResult) SetResultCode(v string) *GwVerifyViewResult {
	s.ResultCode = &v
	return s
}

func (s *GwVerifyViewResult) SetResultMsg(v string) *GwVerifyViewResult {
	s.ResultMsg = &v
	return s
}

// 核审场景
type GwVerifyScene struct {
	// 调用方系统名
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 业务方产品
	BizProduct *string `json:"biz_product,omitempty" xml:"biz_product,omitempty" require:"true"`
	// 业务产品节点
	BizProdNode *string `json:"biz_prod_node,omitempty" xml:"biz_prod_node,omitempty" require:"true"`
	// 业务接入渠道
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty" require:"true"`
	// 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
	Language *string `json:"language,omitempty" xml:"language,omitempty" require:"true"`
}

func (s GwVerifyScene) String() string {
	return tea.Prettify(s)
}

func (s GwVerifyScene) GoString() string {
	return s.String()
}

func (s *GwVerifyScene) SetSystemName(v string) *GwVerifyScene {
	s.SystemName = &v
	return s
}

func (s *GwVerifyScene) SetBizProduct(v string) *GwVerifyScene {
	s.BizProduct = &v
	return s
}

func (s *GwVerifyScene) SetBizProdNode(v string) *GwVerifyScene {
	s.BizProdNode = &v
	return s
}

func (s *GwVerifyScene) SetAccessChannel(v string) *GwVerifyScene {
	s.AccessChannel = &v
	return s
}

func (s *GwVerifyScene) SetLanguage(v string) *GwVerifyScene {
	s.Language = &v
	return s
}

type InitAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
	VerifyScene *GwVerifyScene `json:"verify_scene,omitempty" xml:"verify_scene,omitempty" require:"true"`
	// 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 调用方传入，存放业务扩展参数（callback参数也写入此）
	ExternParams []*NameValuePair `json:"extern_params,omitempty" xml:"extern_params,omitempty" type:"Repeated"`
	// 调用方传入，指定核身完成后的回调类型
	CallbackEnum *string `json:"callback_enum,omitempty" xml:"callback_enum,omitempty"`
	// 核身产品列表
	ValidateFlows []*GwValidateProduct `json:"validate_flows,omitempty" xml:"validate_flows,omitempty" require:"true" type:"Repeated"`
	// 核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// 核身请求地址url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
	// 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
	// 可用产品集合
	ValidProd []*GwValidateProduct `json:"valid_prod,omitempty" xml:"valid_prod,omitempty" type:"Repeated"`
}

func (s InitAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpVerifyRequest) SetAuthToken(v string) *InitAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetProductInstanceId(v string) *InitAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetVerifyScene(v *GwVerifyScene) *InitAntchainBbpVerifyRequest {
	s.VerifyScene = v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetBizId(v string) *InitAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetExternParams(v []*NameValuePair) *InitAntchainBbpVerifyRequest {
	s.ExternParams = v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetCallbackEnum(v string) *InitAntchainBbpVerifyRequest {
	s.CallbackEnum = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetValidateFlows(v []*GwValidateProduct) *InitAntchainBbpVerifyRequest {
	s.ValidateFlows = v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetVerifyId(v string) *InitAntchainBbpVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetVerifyUrl(v string) *InitAntchainBbpVerifyRequest {
	s.VerifyUrl = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetVerifyStatus(v string) *InitAntchainBbpVerifyRequest {
	s.VerifyStatus = &v
	return s
}

func (s *InitAntchainBbpVerifyRequest) SetValidProd(v []*GwValidateProduct) *InitAntchainBbpVerifyRequest {
	s.ValidProd = v
	return s
}

type InitAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// 核身请求地址url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
	// 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
	VerifyStatus *string `json:"verify_status,omitempty" xml:"verify_status,omitempty"`
	// 可用产品集合
	ValidProd []*GwValidateProduct `json:"valid_prod,omitempty" xml:"valid_prod,omitempty" type:"Repeated"`
}

func (s InitAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpVerifyResponse) SetReqMsgId(v string) *InitAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetResultCode(v string) *InitAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetResultMsg(v string) *InitAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyId(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyId = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyUrl(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyUrl = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetVerifyStatus(v string) *InitAntchainBbpVerifyResponse {
	s.VerifyStatus = &v
	return s
}

func (s *InitAntchainBbpVerifyResponse) SetValidProd(v []*GwValidateProduct) *InitAntchainBbpVerifyResponse {
	s.ValidProd = v
	return s
}

type StartAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 核身渲染结果
	Result []*GwVerifyViewResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s StartAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s StartAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *StartAntchainBbpVerifyRequest) SetAuthToken(v string) *StartAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetProductInstanceId(v string) *StartAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetVerifyId(v string) *StartAntchainBbpVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetGroup(v string) *StartAntchainBbpVerifyRequest {
	s.Group = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetProductAction(v string) *StartAntchainBbpVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetBizId(v string) *StartAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

func (s *StartAntchainBbpVerifyRequest) SetResult(v []*GwVerifyViewResult) *StartAntchainBbpVerifyRequest {
	s.Result = v
	return s
}

type StartAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身渲染结果
	Result []*GwVerifyViewResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s StartAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s StartAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *StartAntchainBbpVerifyResponse) SetReqMsgId(v string) *StartAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResultCode(v string) *StartAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResultMsg(v string) *StartAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartAntchainBbpVerifyResponse) SetResult(v []*GwVerifyViewResult) *StartAntchainBbpVerifyResponse {
	s.Result = v
	return s
}

type CheckAntchainBbpVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 核身上下文id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
	// 核身模块分组
	Group *string `json:"group,omitempty" xml:"group,omitempty" require:"true"`
	// 核身动作：view-渲染，verify-校验，repeat-重新发送
	ProductAction *string `json:"product_action,omitempty" xml:"product_action,omitempty" require:"true"`
	// 业务id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 核身产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckAntchainBbpVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAntchainBbpVerifyRequest) GoString() string {
	return s.String()
}

func (s *CheckAntchainBbpVerifyRequest) SetAuthToken(v string) *CheckAntchainBbpVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductInstanceId(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetVerifyId(v string) *CheckAntchainBbpVerifyRequest {
	s.VerifyId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetGroup(v string) *CheckAntchainBbpVerifyRequest {
	s.Group = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductAction(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductAction = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetBizId(v string) *CheckAntchainBbpVerifyRequest {
	s.BizId = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetProductCode(v string) *CheckAntchainBbpVerifyRequest {
	s.ProductCode = &v
	return s
}

func (s *CheckAntchainBbpVerifyRequest) SetStatus(v string) *CheckAntchainBbpVerifyRequest {
	s.Status = &v
	return s
}

type CheckAntchainBbpVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CheckAntchainBbpVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAntchainBbpVerifyResponse) GoString() string {
	return s.String()
}

func (s *CheckAntchainBbpVerifyResponse) SetReqMsgId(v string) *CheckAntchainBbpVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetResultCode(v string) *CheckAntchainBbpVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetResultMsg(v string) *CheckAntchainBbpVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAntchainBbpVerifyResponse) SetStatus(v string) *CheckAntchainBbpVerifyResponse {
	s.Status = &v
	return s
}

type RunAntchainSaasMarketServiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方传入，幂等用。
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// saas产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 服务code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 子服务code
	SubServiceCode *string `json:"sub_service_code,omitempty" xml:"sub_service_code,omitempty"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
	// 业务参数，map格式
	Params []*KeyValuePair `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
	// 服务调用结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s RunAntchainSaasMarketServiceRequest) String() string {
	return tea.Prettify(s)
}

func (s RunAntchainSaasMarketServiceRequest) GoString() string {
	return s.String()
}

func (s *RunAntchainSaasMarketServiceRequest) SetAuthToken(v string) *RunAntchainSaasMarketServiceRequest {
	s.AuthToken = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetProductInstanceId(v string) *RunAntchainSaasMarketServiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetBizId(v string) *RunAntchainSaasMarketServiceRequest {
	s.BizId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetProductCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.ProductCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetServiceCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.ServiceCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetSubServiceCode(v string) *RunAntchainSaasMarketServiceRequest {
	s.SubServiceCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetServiceVersion(v string) *RunAntchainSaasMarketServiceRequest {
	s.ServiceVersion = &v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetParams(v []*KeyValuePair) *RunAntchainSaasMarketServiceRequest {
	s.Params = v
	return s
}

func (s *RunAntchainSaasMarketServiceRequest) SetResultData(v []*KeyValuePair) *RunAntchainSaasMarketServiceRequest {
	s.ResultData = v
	return s
}

type RunAntchainSaasMarketServiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务调用结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s RunAntchainSaasMarketServiceResponse) String() string {
	return tea.Prettify(s)
}

func (s RunAntchainSaasMarketServiceResponse) GoString() string {
	return s.String()
}

func (s *RunAntchainSaasMarketServiceResponse) SetReqMsgId(v string) *RunAntchainSaasMarketServiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultCode(v string) *RunAntchainSaasMarketServiceResponse {
	s.ResultCode = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultMsg(v string) *RunAntchainSaasMarketServiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunAntchainSaasMarketServiceResponse) SetResultData(v []*KeyValuePair) *RunAntchainSaasMarketServiceResponse {
	s.ResultData = v
	return s
}

type QueryAntchainSaasMarketSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案code
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
	// 查询结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s QueryAntchainSaasMarketSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasMarketSolutionRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetAuthToken(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetProductInstanceId(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetSolutionCode(v string) *QueryAntchainSaasMarketSolutionRequest {
	s.SolutionCode = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionRequest) SetResultData(v []*KeyValuePair) *QueryAntchainSaasMarketSolutionRequest {
	s.ResultData = v
	return s
}

type QueryAntchainSaasMarketSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s QueryAntchainSaasMarketSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasMarketSolutionResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetReqMsgId(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultCode(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultMsg(v string) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainSaasMarketSolutionResponse) SetResultData(v []*KeyValuePair) *QueryAntchainSaasMarketSolutionResponse {
	s.ResultData = v
	return s
}

type VerifyAntchainBbpMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 预留业务code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号码
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	EpCertNoType *string `json:"ep_cert_no_type,omitempty" xml:"ep_cert_no_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty"`
	// 系统名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 系统租户ID
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 业务唯一ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务渠道，需提前申请产品码
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 认证类型：ENTERPRISE-企业, PERSON-个人
	CertifyEnum *string `json:"certify_enum,omitempty" xml:"certify_enum,omitempty" require:"true"`
	// 客户支付宝ID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 个人姓名，用于个人认证
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人证件号码
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
	// 扩展信息
	ExtensionInfo *NameValuePair `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 要素认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyAntchainBbpMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainBbpMetaRequest) GoString() string {
	return s.String()
}

func (s *VerifyAntchainBbpMetaRequest) SetAuthToken(v string) *VerifyAntchainBbpMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetProductInstanceId(v string) *VerifyAntchainBbpMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetBizCode(v string) *VerifyAntchainBbpMetaRequest {
	s.BizCode = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertName(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetEpCertNoType(v string) *VerifyAntchainBbpMetaRequest {
	s.EpCertNoType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertName(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetLegalPersonCertNoType(v string) *VerifyAntchainBbpMetaRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetOwnerName(v string) *VerifyAntchainBbpMetaRequest {
	s.OwnerName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetOwnerUid(v string) *VerifyAntchainBbpMetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetBizId(v string) *VerifyAntchainBbpMetaRequest {
	s.BizId = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetChannel(v string) *VerifyAntchainBbpMetaRequest {
	s.Channel = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetCertifyEnum(v string) *VerifyAntchainBbpMetaRequest {
	s.CertifyEnum = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetAlipayUid(v string) *VerifyAntchainBbpMetaRequest {
	s.AlipayUid = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonName(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonName = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonCertNo(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonCertNo = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetPersonCertType(v string) *VerifyAntchainBbpMetaRequest {
	s.PersonCertType = &v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetExtensionInfo(v *NameValuePair) *VerifyAntchainBbpMetaRequest {
	s.ExtensionInfo = v
	return s
}

func (s *VerifyAntchainBbpMetaRequest) SetResult(v *CustomerAuthResult) *VerifyAntchainBbpMetaRequest {
	s.Result = v
	return s
}

type VerifyAntchainBbpMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 要素认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyAntchainBbpMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAntchainBbpMetaResponse) GoString() string {
	return s.String()
}

func (s *VerifyAntchainBbpMetaResponse) SetReqMsgId(v string) *VerifyAntchainBbpMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResultCode(v string) *VerifyAntchainBbpMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResultMsg(v string) *VerifyAntchainBbpMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAntchainBbpMetaResponse) SetResult(v *CustomerAuthResult) *VerifyAntchainBbpMetaResponse {
	s.Result = v
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
				"sdk_version":      tea.String("1.0.3"),
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
 * Description: 核身初始化接口
 * Summary: 核身初始化接口
 */
func (client *Client) InitAntchainBbpVerify(request *InitAntchainBbpVerifyRequest) (_result *InitAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainBbpVerifyResponse{}
	_body, _err := client.InitAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身初始化接口
 * Summary: 核身初始化接口
 */
func (client *Client) InitAntchainBbpVerifyEx(request *InitAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartAntchainBbpVerify(request *StartAntchainBbpVerifyRequest) (_result *StartAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartAntchainBbpVerifyResponse{}
	_body, _err := client.StartAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身产品渲染接口
 * Summary: 核身产品渲染接口
 */
func (client *Client) StartAntchainBbpVerifyEx(request *StartAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckAntchainBbpVerify(request *CheckAntchainBbpVerifyRequest) (_result *CheckAntchainBbpVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAntchainBbpVerifyResponse{}
	_body, _err := client.CheckAntchainBbpVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核身结果查询
 * Summary: 核身结果查询
 */
func (client *Client) CheckAntchainBbpVerifyEx(request *CheckAntchainBbpVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAntchainBbpVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAntchainBbpVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.verify.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunAntchainSaasMarketService(request *RunAntchainSaasMarketServiceRequest) (_result *RunAntchainSaasMarketServiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunAntchainSaasMarketServiceResponse{}
	_body, _err := client.RunAntchainSaasMarketServiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunAntchainSaasMarketServiceEx(request *RunAntchainSaasMarketServiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunAntchainSaasMarketServiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunAntchainSaasMarketServiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.service.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryAntchainSaasMarketSolution(request *QueryAntchainSaasMarketSolutionRequest) (_result *QueryAntchainSaasMarketSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainSaasMarketSolutionResponse{}
	_body, _err := client.QueryAntchainSaasMarketSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryAntchainSaasMarketSolutionEx(request *QueryAntchainSaasMarketSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainSaasMarketSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainSaasMarketSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.solution.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyAntchainBbpMeta(request *VerifyAntchainBbpMetaRequest) (_result *VerifyAntchainBbpMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAntchainBbpMetaResponse{}
	_body, _err := client.VerifyAntchainBbpMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对企业身份进行认证
 * Summary: 企业四要素认证
 */
func (client *Client) VerifyAntchainBbpMetaEx(request *VerifyAntchainBbpMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAntchainBbpMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAntchainBbpMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.meta.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
