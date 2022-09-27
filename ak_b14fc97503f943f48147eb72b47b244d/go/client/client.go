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

// 授权列表键值对
type AuthorizeRecordsPairs struct {
	// 授权业务
	AuthBusinessCode *string `json:"auth_business_code,omitempty" xml:"auth_business_code,omitempty" require:"true"`
	// 授权密钥
	AuthBusinessSecret *string `json:"auth_business_secret,omitempty" xml:"auth_business_secret,omitempty" require:"true"`
}

func (s AuthorizeRecordsPairs) String() string {
	return tea.Prettify(s)
}

func (s AuthorizeRecordsPairs) GoString() string {
	return s.String()
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessCode(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessCode = &v
	return s
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessSecret(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessSecret = &v
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

// 查询功能所用集合
type QueryMap struct {
	// 查询枚举：QueryTypeEnum
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 查询参数
	Value []*NameValuePair `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s QueryMap) String() string {
	return tea.Prettify(s)
}

func (s QueryMap) GoString() string {
	return s.String()
}

func (s *QueryMap) SetName(v string) *QueryMap {
	s.Name = &v
	return s
}

func (s *QueryMap) SetValue(v []*NameValuePair) *QueryMap {
	s.Value = v
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

type AuthAntchainBbpCustomerRequest struct {
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
	//
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
	// 客户支付宝ID，如有则填。
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 个人姓名，用于个人认证
	PersonName *string `json:"person_name,omitempty" xml:"person_name,omitempty"`
	// 个人证件号码
	PersonCertNo *string `json:"person_cert_no,omitempty" xml:"person_cert_no,omitempty"`
	// 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	PersonCertType *string `json:"person_cert_type,omitempty" xml:"person_cert_type,omitempty"`
	// 扩展信息
	ExtensionInfo []*NameValuePair `json:"extension_info,omitempty" xml:"extension_info,omitempty" type:"Repeated"`
}

func (s AuthAntchainBbpCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainBbpCustomerRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainBbpCustomerRequest) SetAuthToken(v string) *AuthAntchainBbpCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetProductInstanceId(v string) *AuthAntchainBbpCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetBizCode(v string) *AuthAntchainBbpCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetEpCertName(v string) *AuthAntchainBbpCustomerRequest {
	s.EpCertName = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetEpCertNo(v string) *AuthAntchainBbpCustomerRequest {
	s.EpCertNo = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetEpCertNoType(v string) *AuthAntchainBbpCustomerRequest {
	s.EpCertNoType = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetLegalPersonCertName(v string) *AuthAntchainBbpCustomerRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetLegalPersonCertNo(v string) *AuthAntchainBbpCustomerRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetLegalPersonCertNoType(v string) *AuthAntchainBbpCustomerRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetOwnerName(v string) *AuthAntchainBbpCustomerRequest {
	s.OwnerName = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetOwnerUid(v string) *AuthAntchainBbpCustomerRequest {
	s.OwnerUid = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetBizId(v string) *AuthAntchainBbpCustomerRequest {
	s.BizId = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetChannel(v string) *AuthAntchainBbpCustomerRequest {
	s.Channel = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetCertifyEnum(v string) *AuthAntchainBbpCustomerRequest {
	s.CertifyEnum = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetAlipayUid(v string) *AuthAntchainBbpCustomerRequest {
	s.AlipayUid = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetPersonName(v string) *AuthAntchainBbpCustomerRequest {
	s.PersonName = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetPersonCertNo(v string) *AuthAntchainBbpCustomerRequest {
	s.PersonCertNo = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetPersonCertType(v string) *AuthAntchainBbpCustomerRequest {
	s.PersonCertType = &v
	return s
}

func (s *AuthAntchainBbpCustomerRequest) SetExtensionInfo(v []*NameValuePair) *AuthAntchainBbpCustomerRequest {
	s.ExtensionInfo = v
	return s
}

type AuthAntchainBbpCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户认证结果
	Result *CustomerAuthResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s AuthAntchainBbpCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainBbpCustomerResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainBbpCustomerResponse) SetReqMsgId(v string) *AuthAntchainBbpCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainBbpCustomerResponse) SetResultCode(v string) *AuthAntchainBbpCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainBbpCustomerResponse) SetResultMsg(v string) *AuthAntchainBbpCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainBbpCustomerResponse) SetResult(v *CustomerAuthResult) *AuthAntchainBbpCustomerResponse {
	s.Result = v
	return s
}

type CreateAntchainBbpCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务渠道，需提前申请产品码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 客户类型：ENTERPRISE-企业, PERSON-个人
	//
	CustomerType *string `json:"customer_type,omitempty" xml:"customer_type,omitempty" require:"true"`
	// 客户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 客户证件号码，企业/个人均可
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名
	//
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 法人证件号码
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
	LegalPersonCertNoType *string `json:"legal_person_cert_no_type,omitempty" xml:"legal_person_cert_no_type,omitempty" require:"true"`
	// 是否需要先认证再注册，默认不认证。
	IsAuth *bool `json:"is_auth,omitempty" xml:"is_auth,omitempty" require:"true"`
	// 业务角色： 买方，卖方，机构，合作伙伴
	BusinessRole *string `json:"business_role,omitempty" xml:"business_role,omitempty"`
	// 客户支付宝ID，如有则填。
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
}

func (s CreateAntchainBbpCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainBbpCustomerRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainBbpCustomerRequest) SetAuthToken(v string) *CreateAntchainBbpCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetProductInstanceId(v string) *CreateAntchainBbpCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetBizCode(v string) *CreateAntchainBbpCustomerRequest {
	s.BizCode = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetCustomerType(v string) *CreateAntchainBbpCustomerRequest {
	s.CustomerType = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetName(v string) *CreateAntchainBbpCustomerRequest {
	s.Name = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetCertNo(v string) *CreateAntchainBbpCustomerRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetCertType(v string) *CreateAntchainBbpCustomerRequest {
	s.CertType = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetLegalPersonCertName(v string) *CreateAntchainBbpCustomerRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetLegalPersonCertNo(v string) *CreateAntchainBbpCustomerRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetLegalPersonCertNoType(v string) *CreateAntchainBbpCustomerRequest {
	s.LegalPersonCertNoType = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetIsAuth(v bool) *CreateAntchainBbpCustomerRequest {
	s.IsAuth = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetBusinessRole(v string) *CreateAntchainBbpCustomerRequest {
	s.BusinessRole = &v
	return s
}

func (s *CreateAntchainBbpCustomerRequest) SetAlipayUid(v string) *CreateAntchainBbpCustomerRequest {
	s.AlipayUid = &v
	return s
}

type CreateAntchainBbpCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统一客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 统一账户ID
	AccId *string `json:"acc_id,omitempty" xml:"acc_id,omitempty"`
	// 客户认证结果
	AuthFourElementsResponse *CustomerAuthResult `json:"auth_four_elements_response,omitempty" xml:"auth_four_elements_response,omitempty"`
}

func (s CreateAntchainBbpCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainBbpCustomerResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainBbpCustomerResponse) SetReqMsgId(v string) *CreateAntchainBbpCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainBbpCustomerResponse) SetResultCode(v string) *CreateAntchainBbpCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainBbpCustomerResponse) SetResultMsg(v string) *CreateAntchainBbpCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainBbpCustomerResponse) SetCustomerId(v string) *CreateAntchainBbpCustomerResponse {
	s.CustomerId = &v
	return s
}

func (s *CreateAntchainBbpCustomerResponse) SetAccId(v string) *CreateAntchainBbpCustomerResponse {
	s.AccId = &v
	return s
}

func (s *CreateAntchainBbpCustomerResponse) SetAuthFourElementsResponse(v *CustomerAuthResult) *CreateAntchainBbpCustomerResponse {
	s.AuthFourElementsResponse = v
	return s
}

type QueryAntchainBbpCustomerRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询内容
	ConditionMap []*QueryMap `json:"condition_map,omitempty" xml:"condition_map,omitempty" require:"true" type:"Repeated"`
}

func (s QueryAntchainBbpCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainBbpCustomerRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainBbpCustomerRequest) SetAuthToken(v string) *QueryAntchainBbpCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainBbpCustomerRequest) SetProductInstanceId(v string) *QueryAntchainBbpCustomerRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainBbpCustomerRequest) SetConditionMap(v []*QueryMap) *QueryAntchainBbpCustomerRequest {
	s.ConditionMap = v
	return s
}

type QueryAntchainBbpCustomerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	Result []*NameValuePair `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s QueryAntchainBbpCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainBbpCustomerResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainBbpCustomerResponse) SetReqMsgId(v string) *QueryAntchainBbpCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainBbpCustomerResponse) SetResultCode(v string) *QueryAntchainBbpCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainBbpCustomerResponse) SetResultMsg(v string) *QueryAntchainBbpCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainBbpCustomerResponse) SetResult(v []*NameValuePair) *QueryAntchainBbpCustomerResponse {
	s.Result = v
	return s
}

type MatchAntchainBbpDidAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码(YYX)
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 支付宝uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty" require:"true"`
	// 分布式id ，双向check
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 链id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 链账户
	ChainAccount *string `json:"chain_account,omitempty" xml:"chain_account,omitempty" require:"true"`
	// 托管情况下包含
	KmsKeyId *string `json:"kms_key_id,omitempty" xml:"kms_key_id,omitempty"`
}

func (s MatchAntchainBbpDidAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchAntchainBbpDidAccountRequest) GoString() string {
	return s.String()
}

func (s *MatchAntchainBbpDidAccountRequest) SetAuthToken(v string) *MatchAntchainBbpDidAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetProductInstanceId(v string) *MatchAntchainBbpDidAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetBizCode(v string) *MatchAntchainBbpDidAccountRequest {
	s.BizCode = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetUid(v string) *MatchAntchainBbpDidAccountRequest {
	s.Uid = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetDid(v string) *MatchAntchainBbpDidAccountRequest {
	s.Did = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetChainId(v string) *MatchAntchainBbpDidAccountRequest {
	s.ChainId = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetChainAccount(v string) *MatchAntchainBbpDidAccountRequest {
	s.ChainAccount = &v
	return s
}

func (s *MatchAntchainBbpDidAccountRequest) SetKmsKeyId(v string) *MatchAntchainBbpDidAccountRequest {
	s.KmsKeyId = &v
	return s
}

type MatchAntchainBbpDidAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s MatchAntchainBbpDidAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchAntchainBbpDidAccountResponse) GoString() string {
	return s.String()
}

func (s *MatchAntchainBbpDidAccountResponse) SetReqMsgId(v string) *MatchAntchainBbpDidAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchAntchainBbpDidAccountResponse) SetResultCode(v string) *MatchAntchainBbpDidAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchAntchainBbpDidAccountResponse) SetResultMsg(v string) *MatchAntchainBbpDidAccountResponse {
	s.ResultMsg = &v
	return s
}

type OperateAntchainBbpInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 保单加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdpartSku *string `json:"thirdpart_sku,omitempty" xml:"thirdpart_sku,omitempty" require:"true"`
	// 保险公司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty"`
	// 来源uid，此处指天猫id
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty"`
	// 订单来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 投保人
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 投保人类型  自然人/公司
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 投保人电话号码
	UserPhonenumber *string `json:"user_phonenumber,omitempty" xml:"user_phonenumber,omitempty"`
	// 投保人证件号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 拓展信息
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
	// 保单生效时间（毫秒值）
	PolicyEffectTime *int64 `json:"policy_effect_time,omitempty" xml:"policy_effect_time,omitempty" require:"true"`
	// 保单失效时间（毫秒值）
	PolicyInvalidTime *int64 `json:"policy_invalid_time,omitempty" xml:"policy_invalid_time,omitempty" require:"true"`
	// 订单总金额 BigDecimal
	PolicyTotalAmount *int64 `json:"policy_total_amount,omitempty" xml:"policy_total_amount,omitempty" require:"true"`
	// 订单总期数（一次性付款用1）
	PolicyTotalStage *int64 `json:"policy_total_stage,omitempty" xml:"policy_total_stage,omitempty" require:"true"`
	// 保费支付日期（毫秒值）
	PolicyPayDate *int64 `json:"policy_pay_date,omitempty" xml:"policy_pay_date,omitempty" require:"true"`
	// 已支付保费期数（1代表1期）
	PolicyPaidStage *int64 `json:"policy_paid_stage,omitempty" xml:"policy_paid_stage,omitempty"`
	// 每一期保费金额BigDecimal
	PolicyStageAverAmount *int64 `json:"policy_stage_aver_amount,omitempty" xml:"policy_stage_aver_amount,omitempty"`
	// 订单时间（毫秒值）
	OrderTime *int64 `json:"order_time,omitempty" xml:"order_time,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 赔付单号(对于赔付操作来说是必填项)
	ClaimOrderNo *string `json:"claim_order_no,omitempty" xml:"claim_order_no,omitempty"`
	// 理赔申请时间 理赔操作必填
	ClaimApplyTime *int64 `json:"claim_apply_time,omitempty" xml:"claim_apply_time,omitempty"`
	// 理赔赔付时间 理赔操作必填
	ClaimPayTime *int64 `json:"claim_pay_time,omitempty" xml:"claim_pay_time,omitempty"`
	// 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
	ClaimApplyAmount *int64 `json:"claim_apply_amount,omitempty" xml:"claim_apply_amount,omitempty"`
	// 理赔金额BigDecimal，理赔操作必填
	ClaimAmount *int64 `json:"claim_amount,omitempty" xml:"claim_amount,omitempty"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
}

func (s OperateAntchainBbpInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainBbpInsuranceRequest) GoString() string {
	return s.String()
}

func (s *OperateAntchainBbpInsuranceRequest) SetAuthToken(v string) *OperateAntchainBbpInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetProductInstanceId(v string) *OperateAntchainBbpInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetMechanismCode(v string) *OperateAntchainBbpInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyEncryptionContext(v string) *OperateAntchainBbpInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetThirdpartSku(v string) *OperateAntchainBbpInsuranceRequest {
	s.ThirdpartSku = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetMechanismName(v string) *OperateAntchainBbpInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetInsuranceType(v string) *OperateAntchainBbpInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetSourceUid(v string) *OperateAntchainBbpInsuranceRequest {
	s.SourceUid = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetSource(v string) *OperateAntchainBbpInsuranceRequest {
	s.Source = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserName(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserName = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserType(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserType = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserPhonenumber(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserPhonenumber = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserCertNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserCertNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetExtend(v string) *OperateAntchainBbpInsuranceRequest {
	s.Extend = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyEffectTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyEffectTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyInvalidTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyInvalidTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyTotalAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyTotalAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyTotalStage(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyTotalStage = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyPayDate(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyPayDate = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyPaidStage(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyPaidStage = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyStageAverAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyStageAverAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetOrderTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.OrderTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetOperation(v string) *OperateAntchainBbpInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimOrderNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.ClaimOrderNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimApplyTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimApplyTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimPayTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimPayTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimApplyAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimApplyAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *OperateAntchainBbpInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

type OperateAntchainBbpInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateAntchainBbpInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainBbpInsuranceResponse) GoString() string {
	return s.String()
}

func (s *OperateAntchainBbpInsuranceResponse) SetReqMsgId(v string) *OperateAntchainBbpInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateAntchainBbpInsuranceResponse) SetResultCode(v string) *OperateAntchainBbpInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateAntchainBbpInsuranceResponse) SetResultMsg(v string) *OperateAntchainBbpInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type SyncAntchainBbpInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 理赔加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdpartSku *string `json:"thirdpart_sku,omitempty" xml:"thirdpart_sku,omitempty" require:"true"`
	// 保司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 赔付单号
	ClaimOrderNo *string `json:"claim_order_no,omitempty" xml:"claim_order_no,omitempty" require:"true"`
	// 理赔申请时间（毫秒值）
	ClaimApplyTime *int64 `json:"claim_apply_time,omitempty" xml:"claim_apply_time,omitempty" require:"true"`
	// 理赔赔付时间（毫秒值）
	ClaimPayTime *string `json:"claim_pay_time,omitempty" xml:"claim_pay_time,omitempty" require:"true"`
	// 理赔申请金额，单位元，保留小数点两位BigDecimal
	ClaimApplyAmount *int64 `json:"claim_apply_amount,omitempty" xml:"claim_apply_amount,omitempty" require:"true"`
	// 理赔金额
	ClaimAmount *int64 `json:"claim_amount,omitempty" xml:"claim_amount,omitempty" require:"true"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
}

func (s SyncAntchainBbpInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainBbpInsuranceRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainBbpInsuranceRequest) SetAuthToken(v string) *SyncAntchainBbpInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetProductInstanceId(v string) *SyncAntchainBbpInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetMechanismCode(v string) *SyncAntchainBbpInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetPolicyEncryptionContext(v string) *SyncAntchainBbpInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetPolicyNo(v string) *SyncAntchainBbpInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetThirdpartSku(v string) *SyncAntchainBbpInsuranceRequest {
	s.ThirdpartSku = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetMechanismName(v string) *SyncAntchainBbpInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetInsuranceType(v string) *SyncAntchainBbpInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetOperation(v string) *SyncAntchainBbpInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetClaimOrderNo(v string) *SyncAntchainBbpInsuranceRequest {
	s.ClaimOrderNo = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetClaimApplyTime(v int64) *SyncAntchainBbpInsuranceRequest {
	s.ClaimApplyTime = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetClaimPayTime(v string) *SyncAntchainBbpInsuranceRequest {
	s.ClaimPayTime = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetClaimApplyAmount(v int64) *SyncAntchainBbpInsuranceRequest {
	s.ClaimApplyAmount = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetClaimAmount(v int64) *SyncAntchainBbpInsuranceRequest {
	s.ClaimAmount = &v
	return s
}

func (s *SyncAntchainBbpInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *SyncAntchainBbpInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

type SyncAntchainBbpInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncAntchainBbpInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainBbpInsuranceResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainBbpInsuranceResponse) SetReqMsgId(v string) *SyncAntchainBbpInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainBbpInsuranceResponse) SetResultCode(v string) *SyncAntchainBbpInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainBbpInsuranceResponse) SetResultMsg(v string) *SyncAntchainBbpInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type UploadAntchainBbpInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 保单加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdpartSku *string `json:"thirdpart_sku,omitempty" xml:"thirdpart_sku,omitempty" require:"true"`
	// 保司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty"`
	// 来源uid，此处指天猫id
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty"`
	// 订单来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 投保人
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 投保人类型  自然人/公司
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 投保人电话号码
	UserPhonenumber *string `json:"user_phonenumber,omitempty" xml:"user_phonenumber,omitempty"`
	// 投保人证件号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 拓展信息
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
	// 保单生效时间（毫秒值）
	PolicyEffectTime *int64 `json:"policy_effect_time,omitempty" xml:"policy_effect_time,omitempty" require:"true"`
	// 保单失效时间
	PolicyInvalidTime *int64 `json:"policy_invalid_time,omitempty" xml:"policy_invalid_time,omitempty" require:"true"`
	// 订单总金额BigDecimal
	PolicyTotalAmount *int64 `json:"policy_total_amount,omitempty" xml:"policy_total_amount,omitempty" require:"true"`
	// 订单总期数（一次性付款用1）
	PolicyTotalStage *int64 `json:"policy_total_stage,omitempty" xml:"policy_total_stage,omitempty" require:"true"`
	// 保费支付日期（毫秒值）
	PolicyPayDate *int64 `json:"policy_pay_date,omitempty" xml:"policy_pay_date,omitempty" require:"true"`
	// 已支付保费期数
	PolicyPaidStage *int64 `json:"policy_paid_stage,omitempty" xml:"policy_paid_stage,omitempty"`
	// 每一期保费金额BigDecimal
	PolicyStageAverAmount *int64 `json:"policy_stage_aver_amount,omitempty" xml:"policy_stage_aver_amount,omitempty"`
	// 订单时间（毫秒值）
	OrderTime *int64 `json:"order_time,omitempty" xml:"order_time,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 赔付单号 理赔操作必填
	ClaimOrderNo *string `json:"claim_order_no,omitempty" xml:"claim_order_no,omitempty"`
	// 理赔申请时间（毫秒值） 理赔操作必填
	ClaimApplyTime *int64 `json:"claim_apply_time,omitempty" xml:"claim_apply_time,omitempty"`
	// 理赔赔付时间（毫秒值） 理赔操作必填
	ClaimPayTime *int64 `json:"claim_pay_time,omitempty" xml:"claim_pay_time,omitempty"`
	// 理赔申请金额，单位元，保留小数点两位 BigDecimal	理赔操作必填
	ClaimApplyAmount *string `json:"claim_apply_amount,omitempty" xml:"claim_apply_amount,omitempty"`
	// 理赔金额 BigDecimal	理赔操作必填
	ClaimAmount *string `json:"claim_amount,omitempty" xml:"claim_amount,omitempty"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
}

func (s UploadAntchainBbpInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainBbpInsuranceRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainBbpInsuranceRequest) SetAuthToken(v string) *UploadAntchainBbpInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetProductInstanceId(v string) *UploadAntchainBbpInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetMechanismCode(v string) *UploadAntchainBbpInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyEncryptionContext(v string) *UploadAntchainBbpInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyNo(v string) *UploadAntchainBbpInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetThirdpartSku(v string) *UploadAntchainBbpInsuranceRequest {
	s.ThirdpartSku = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetMechanismName(v string) *UploadAntchainBbpInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetInsuranceType(v string) *UploadAntchainBbpInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetSourceUid(v string) *UploadAntchainBbpInsuranceRequest {
	s.SourceUid = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetSource(v string) *UploadAntchainBbpInsuranceRequest {
	s.Source = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetUserName(v string) *UploadAntchainBbpInsuranceRequest {
	s.UserName = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetUserType(v string) *UploadAntchainBbpInsuranceRequest {
	s.UserType = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetUserPhonenumber(v string) *UploadAntchainBbpInsuranceRequest {
	s.UserPhonenumber = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetUserCertNo(v string) *UploadAntchainBbpInsuranceRequest {
	s.UserCertNo = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetExtend(v string) *UploadAntchainBbpInsuranceRequest {
	s.Extend = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyEffectTime(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyEffectTime = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyInvalidTime(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyInvalidTime = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyTotalAmount(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyTotalAmount = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyTotalStage(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyTotalStage = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyPayDate(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyPayDate = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyPaidStage(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyPaidStage = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetPolicyStageAverAmount(v int64) *UploadAntchainBbpInsuranceRequest {
	s.PolicyStageAverAmount = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetOrderTime(v int64) *UploadAntchainBbpInsuranceRequest {
	s.OrderTime = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetOperation(v string) *UploadAntchainBbpInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetClaimOrderNo(v string) *UploadAntchainBbpInsuranceRequest {
	s.ClaimOrderNo = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetClaimApplyTime(v int64) *UploadAntchainBbpInsuranceRequest {
	s.ClaimApplyTime = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetClaimPayTime(v int64) *UploadAntchainBbpInsuranceRequest {
	s.ClaimPayTime = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetClaimApplyAmount(v string) *UploadAntchainBbpInsuranceRequest {
	s.ClaimApplyAmount = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetClaimAmount(v string) *UploadAntchainBbpInsuranceRequest {
	s.ClaimAmount = &v
	return s
}

func (s *UploadAntchainBbpInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *UploadAntchainBbpInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

type UploadAntchainBbpInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadAntchainBbpInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainBbpInsuranceResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainBbpInsuranceResponse) SetReqMsgId(v string) *UploadAntchainBbpInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainBbpInsuranceResponse) SetResultCode(v string) *UploadAntchainBbpInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainBbpInsuranceResponse) SetResultMsg(v string) *UploadAntchainBbpInsuranceResponse {
	s.ResultMsg = &v
	return s
}

type InitAntchainBbpInsuranceUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 三方Id，此处为天猫id
	ThirdPartId *string `json:"third_part_id,omitempty" xml:"third_part_id,omitempty" require:"true"`
	// 来源渠道，TIANMAO（天猫）
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 埋点信息，JSON格式字符串
	Burieds *string `json:"burieds,omitempty" xml:"burieds,omitempty"`
}

func (s InitAntchainBbpInsuranceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpInsuranceUserRequest) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpInsuranceUserRequest) SetAuthToken(v string) *InitAntchainBbpInsuranceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserRequest) SetProductInstanceId(v string) *InitAntchainBbpInsuranceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserRequest) SetBusinessCode(v string) *InitAntchainBbpInsuranceUserRequest {
	s.BusinessCode = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserRequest) SetThirdPartId(v string) *InitAntchainBbpInsuranceUserRequest {
	s.ThirdPartId = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserRequest) SetChannel(v string) *InitAntchainBbpInsuranceUserRequest {
	s.Channel = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserRequest) SetBurieds(v string) *InitAntchainBbpInsuranceUserRequest {
	s.Burieds = &v
	return s
}

type InitAntchainBbpInsuranceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitAntchainBbpInsuranceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s InitAntchainBbpInsuranceUserResponse) GoString() string {
	return s.String()
}

func (s *InitAntchainBbpInsuranceUserResponse) SetReqMsgId(v string) *InitAntchainBbpInsuranceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserResponse) SetResultCode(v string) *InitAntchainBbpInsuranceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *InitAntchainBbpInsuranceUserResponse) SetResultMsg(v string) *InitAntchainBbpInsuranceUserResponse {
	s.ResultMsg = &v
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

type BindDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BindDemoAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccRequest) SetAuthToken(v string) *BindDemoAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetProductInstanceId(v string) *BindDemoAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetData(v string) *BindDemoAaaBbbCccRequest {
	s.Data = &v
	return s
}

type BindDemoAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccResponse) SetReqMsgId(v string) *BindDemoAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultCode(v string) *BindDemoAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultMsg(v string) *BindDemoAaaBbbCccResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_b14fc97503f943f48147eb72b47b244d"),
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
 * Description: 对企业/个人进行身份认证
 * Summary: 统一客户认证接口
 */
func (client *Client) AuthAntchainBbpCustomer(request *AuthAntchainBbpCustomerRequest) (_result *AuthAntchainBbpCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainBbpCustomerResponse{}
	_body, _err := client.AuthAntchainBbpCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对企业/个人进行身份认证
 * Summary: 统一客户认证接口
 */
func (client *Client) AuthAntchainBbpCustomerEx(request *AuthAntchainBbpCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainBbpCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainBbpCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智科统一客户注册
 * Summary: 统一客户注册接口
 */
func (client *Client) CreateAntchainBbpCustomer(request *CreateAntchainBbpCustomerRequest) (_result *CreateAntchainBbpCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainBbpCustomerResponse{}
	_body, _err := client.CreateAntchainBbpCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智科统一客户注册
 * Summary: 统一客户注册接口
 */
func (client *Client) CreateAntchainBbpCustomerEx(request *CreateAntchainBbpCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainBbpCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainBbpCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户信息查询
 * Summary: 客户信息查询
 */
func (client *Client) QueryAntchainBbpCustomer(request *QueryAntchainBbpCustomerRequest) (_result *QueryAntchainBbpCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainBbpCustomerResponse{}
	_body, _err := client.QueryAntchainBbpCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户信息查询
 * Summary: 客户信息查询
 */
func (client *Client) QueryAntchainBbpCustomerEx(request *QueryAntchainBbpCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainBbpCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainBbpCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.customer.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 身份关联链上账户
 * Summary: 身份关联链上账户
 */
func (client *Client) MatchAntchainBbpDidAccount(request *MatchAntchainBbpDidAccountRequest) (_result *MatchAntchainBbpDidAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchAntchainBbpDidAccountResponse{}
	_body, _err := client.MatchAntchainBbpDidAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 身份关联链上账户
 * Summary: 身份关联链上账户
 */
func (client *Client) MatchAntchainBbpDidAccountEx(request *MatchAntchainBbpDidAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchAntchainBbpDidAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchAntchainBbpDidAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.did.account.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateAntchainBbpInsurance(request *OperateAntchainBbpInsuranceRequest) (_result *OperateAntchainBbpInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateAntchainBbpInsuranceResponse{}
	_body, _err := client.OperateAntchainBbpInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateAntchainBbpInsuranceEx(request *OperateAntchainBbpInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateAntchainBbpInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateAntchainBbpInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险理赔受理信息同步到蚂蚁链
 * Summary: 理赔受理上链
 */
func (client *Client) SyncAntchainBbpInsurance(request *SyncAntchainBbpInsuranceRequest) (_result *SyncAntchainBbpInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainBbpInsuranceResponse{}
	_body, _err := client.SyncAntchainBbpInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险理赔受理信息同步到蚂蚁链
 * Summary: 理赔受理上链
 */
func (client *Client) SyncAntchainBbpInsuranceEx(request *SyncAntchainBbpInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainBbpInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainBbpInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上传保单附件至阿里云OSS
 * Summary: 上传保单附件
 */
func (client *Client) UploadAntchainBbpInsurance(request *UploadAntchainBbpInsuranceRequest) (_result *UploadAntchainBbpInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainBbpInsuranceResponse{}
	_body, _err := client.UploadAntchainBbpInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上传保单附件至阿里云OSS
 * Summary: 上传保单附件
 */
func (client *Client) UploadAntchainBbpInsuranceEx(request *UploadAntchainBbpInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainBbpInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAntchainBbpInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 记录用户登录保司小程序信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitAntchainBbpInsuranceUser(request *InitAntchainBbpInsuranceUserRequest) (_result *InitAntchainBbpInsuranceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitAntchainBbpInsuranceUserResponse{}
	_body, _err := client.InitAntchainBbpInsuranceUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 记录用户登录保司小程序信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitAntchainBbpInsuranceUserEx(request *InitAntchainBbpInsuranceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitAntchainBbpInsuranceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitAntchainBbpInsuranceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.user.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindDemoAaaBbbCcc(request *BindDemoAaaBbbCccRequest) (_result *BindDemoAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.BindDemoAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindDemoAaaBbbCccEx(request *BindDemoAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
