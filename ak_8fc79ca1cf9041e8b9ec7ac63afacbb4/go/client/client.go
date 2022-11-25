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

type UpdateDemoCjtestCjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试参数
	Var1 *string `json:"var1,omitempty" xml:"var1,omitempty" require:"true"`
	// 测试参数2
	Var2 *string `json:"var2,omitempty" xml:"var2,omitempty" require:"true"`
	// 被授权机构did
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
}

func (s UpdateDemoCjtestCjRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDemoCjtestCjRequest) GoString() string {
	return s.String()
}

func (s *UpdateDemoCjtestCjRequest) SetAuthToken(v string) *UpdateDemoCjtestCjRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetProductInstanceId(v string) *UpdateDemoCjtestCjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetVar1(v string) *UpdateDemoCjtestCjRequest {
	s.Var1 = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetVar2(v string) *UpdateDemoCjtestCjRequest {
	s.Var2 = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetSubject(v string) *UpdateDemoCjtestCjRequest {
	s.Subject = &v
	return s
}

type UpdateDemoCjtestCjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回参数1
	Return1 *string `json:"return1,omitempty" xml:"return1,omitempty"`
}

func (s UpdateDemoCjtestCjResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDemoCjtestCjResponse) GoString() string {
	return s.String()
}

func (s *UpdateDemoCjtestCjResponse) SetReqMsgId(v string) *UpdateDemoCjtestCjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetResultCode(v string) *UpdateDemoCjtestCjResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetResultMsg(v string) *UpdateDemoCjtestCjResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetReturn1(v string) *UpdateDemoCjtestCjResponse {
	s.Return1 = &v
	return s
}

type UploadDemoCjtestSourceFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadDemoCjtestSourceFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDemoCjtestSourceFileRequest) GoString() string {
	return s.String()
}

func (s *UploadDemoCjtestSourceFileRequest) SetAuthToken(v string) *UploadDemoCjtestSourceFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetProductInstanceId(v string) *UploadDemoCjtestSourceFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileObject(v io.Reader) *UploadDemoCjtestSourceFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileObjectName(v string) *UploadDemoCjtestSourceFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileId(v string) *UploadDemoCjtestSourceFileRequest {
	s.FileId = &v
	return s
}

type UploadDemoCjtestSourceFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Res *string `json:"res,omitempty" xml:"res,omitempty"`
}

func (s UploadDemoCjtestSourceFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDemoCjtestSourceFileResponse) GoString() string {
	return s.String()
}

func (s *UploadDemoCjtestSourceFileResponse) SetReqMsgId(v string) *UploadDemoCjtestSourceFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetResultCode(v string) *UploadDemoCjtestSourceFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetResultMsg(v string) *UploadDemoCjtestSourceFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetRes(v string) *UploadDemoCjtestSourceFileResponse {
	s.Res = &v
	return s
}

type ResetDemoComCnCcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// orderid
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s ResetDemoComCnCcRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoComCnCcRequest) GoString() string {
	return s.String()
}

func (s *ResetDemoComCnCcRequest) SetAuthToken(v string) *ResetDemoComCnCcRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetDemoComCnCcRequest) SetProductInstanceId(v string) *ResetDemoComCnCcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetDemoComCnCcRequest) SetOrderId(v string) *ResetDemoComCnCcRequest {
	s.OrderId = &v
	return s
}

type ResetDemoComCnCcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s ResetDemoComCnCcResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoComCnCcResponse) GoString() string {
	return s.String()
}

func (s *ResetDemoComCnCcResponse) SetReqMsgId(v string) *ResetDemoComCnCcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetResultCode(v string) *ResetDemoComCnCcResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetResultMsg(v string) *ResetDemoComCnCcResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetOrderId(v string) *ResetDemoComCnCcResponse {
	s.OrderId = &v
	return s
}

type ImportDemoComCnTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ImportDemoComCnTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoComCnTestRequest) GoString() string {
	return s.String()
}

func (s *ImportDemoComCnTestRequest) SetAuthToken(v string) *ImportDemoComCnTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetProductInstanceId(v string) *ImportDemoComCnTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileObject(v io.Reader) *ImportDemoComCnTestRequest {
	s.FileObject = v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileObjectName(v string) *ImportDemoComCnTestRequest {
	s.FileObjectName = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileId(v string) *ImportDemoComCnTestRequest {
	s.FileId = &v
	return s
}

type ImportDemoComCnTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportDemoComCnTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoComCnTestResponse) GoString() string {
	return s.String()
}

func (s *ImportDemoComCnTestResponse) SetReqMsgId(v string) *ImportDemoComCnTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDemoComCnTestResponse) SetResultCode(v string) *ImportDemoComCnTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDemoComCnTestResponse) SetResultMsg(v string) *ImportDemoComCnTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoGatewayCheckEchotenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoGatewayCheckEchotenRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotenRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotenRequest) SetAuthToken(v string) *QueryDemoGatewayCheckEchotenRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenRequest) SetProductInstanceId(v string) *QueryDemoGatewayCheckEchotenRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoGatewayCheckEchotenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 222
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryDemoGatewayCheckEchotenResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotenResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetReqMsgId(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetResultCode(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetResultMsg(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetStatus(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.Status = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetMsg(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.Msg = &v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
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

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
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
	UploadHeaders []*NameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
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

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*NameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("ak_8fc79ca1cf9041e8b9ec7ac63afacbb4"),
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
 * Description: 测试网关评审能力
 * Summary: 评审测试
 */
func (client *Client) UpdateDemoCjtestCj(request *UpdateDemoCjtestCjRequest) (_result *UpdateDemoCjtestCjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDemoCjtestCjResponse{}
	_body, _err := client.UpdateDemoCjtestCjEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试网关评审能力
 * Summary: 评审测试
 */
func (client *Client) UpdateDemoCjtestCjEx(request *UpdateDemoCjtestCjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDemoCjtestCjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDemoCjtestCjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件测试
 * Summary: 文件测试
 */
func (client *Client) UploadDemoCjtestSourceFile(request *UploadDemoCjtestSourceFileRequest) (_result *UploadDemoCjtestSourceFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadDemoCjtestSourceFileResponse{}
	_body, _err := client.UploadDemoCjtestSourceFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件测试
 * Summary: 文件测试
 */
func (client *Client) UploadDemoCjtestSourceFileEx(request *UploadDemoCjtestSourceFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadDemoCjtestSourceFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.cjtest.source.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadDemoCjtestSourceFileResponse := &UploadDemoCjtestSourceFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadDemoCjtestSourceFileResponse
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
	_result = &UploadDemoCjtestSourceFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.source.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试api描述
 * Summary: api简介
 */
func (client *Client) ResetDemoComCnCc(request *ResetDemoComCnCcRequest) (_result *ResetDemoComCnCcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetDemoComCnCcResponse{}
	_body, _err := client.ResetDemoComCnCcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试api描述
 * Summary: api简介
 */
func (client *Client) ResetDemoComCnCcEx(request *ResetDemoComCnCcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetDemoComCnCcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetDemoComCnCcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.cc.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长捷,qiujianglong.qjl
 * Summary: api简介
 */
func (client *Client) ImportDemoComCnTest(request *ImportDemoComCnTestRequest) (_result *ImportDemoComCnTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDemoComCnTestResponse{}
	_body, _err := client.ImportDemoComCnTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长捷,qiujianglong.qjl
 * Summary: api简介
 */
func (client *Client) ImportDemoComCnTestEx(request *ImportDemoComCnTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDemoComCnTestResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.com.cn.test.import"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			importDemoComCnTestResponse := &ImportDemoComCnTestResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = importDemoComCnTestResponse
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
	_result = &ImportDemoComCnTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.test.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 10  测测aa
 * Summary: 10s
 */
func (client *Client) QueryDemoGatewayCheckEchoten(request *QueryDemoGatewayCheckEchotenRequest) (_result *QueryDemoGatewayCheckEchotenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGatewayCheckEchotenResponse{}
	_body, _err := client.QueryDemoGatewayCheckEchotenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 10  测测aa
 * Summary: 10s
 */
func (client *Client) QueryDemoGatewayCheckEchotenEx(request *QueryDemoGatewayCheckEchotenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGatewayCheckEchotenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGatewayCheckEchotenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echoten.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
