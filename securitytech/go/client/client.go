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

// CctSubCheckLabel
type CctSubCheckLabel struct {
	// sub_label
	SubLabel *string `json:"sub_label,omitempty" xml:"sub_label,omitempty" require:"true"`
	// rate
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s CctSubCheckLabel) String() string {
	return tea.Prettify(s)
}

func (s CctSubCheckLabel) GoString() string {
	return s.String()
}

func (s *CctSubCheckLabel) SetSubLabel(v string) *CctSubCheckLabel {
	s.SubLabel = &v
	return s
}

func (s *CctSubCheckLabel) SetRate(v int64) *CctSubCheckLabel {
	s.Rate = &v
	return s
}

// 人脸盾结果
type FaceShieldResult struct {
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty" require:"true"`
	// 风险等级，-1参数异常，0无风险，1-3表示低、中、高
	RiskLevel *int64 `json:"risk_level,omitempty" xml:"risk_level,omitempty" require:"true"`
	// 风险描述，对风险等级的补充
	RiskDesc *string `json:"risk_desc,omitempty" xml:"risk_desc,omitempty" require:"true"`
	// 处理的建议，如PAAS
	SugAction *string `json:"sug_action,omitempty" xml:"sug_action,omitempty" require:"true"`
}

func (s FaceShieldResult) String() string {
	return tea.Prettify(s)
}

func (s FaceShieldResult) GoString() string {
	return s.String()
}

func (s *FaceShieldResult) SetApdidToken(v string) *FaceShieldResult {
	s.ApdidToken = &v
	return s
}

func (s *FaceShieldResult) SetRiskLevel(v int64) *FaceShieldResult {
	s.RiskLevel = &v
	return s
}

func (s *FaceShieldResult) SetRiskDesc(v string) *FaceShieldResult {
	s.RiskDesc = &v
	return s
}

func (s *FaceShieldResult) SetSugAction(v string) *FaceShieldResult {
	s.SugAction = &v
	return s
}

// 内容安全请求体datamap
type CctDataMap struct {
	// text
	Text []*string `json:"text,omitempty" xml:"text,omitempty" type:"Repeated"`
	// PICTURE
	Picture []*string `json:"picture,omitempty" xml:"picture,omitempty" type:"Repeated"`
}

func (s CctDataMap) String() string {
	return tea.Prettify(s)
}

func (s CctDataMap) GoString() string {
	return s.String()
}

func (s *CctDataMap) SetText(v []*string) *CctDataMap {
	s.Text = v
	return s
}

func (s *CctDataMap) SetPicture(v []*string) *CctDataMap {
	s.Picture = v
	return s
}

// 保单信息
type InsureInfo struct {
	// 保单时间
	ModifyTime *string `json:"modify_time,omitempty" xml:"modify_time,omitempty" require:"true"`
	// 蚂蚁L5产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 保险产品code
	InsureProduct *string `json:"insure_product,omitempty" xml:"insure_product,omitempty" require:"true"`
	// 保险产品价格
	InsurePrice *string `json:"insure_price,omitempty" xml:"insure_price,omitempty" require:"true"`
	// 保险品种
	InsureType *string `json:"insure_type,omitempty" xml:"insure_type,omitempty" require:"true"`
	// 付款方式
	PayType *string `json:"pay_type,omitempty" xml:"pay_type,omitempty" require:"true"`
	// 保险期数
	InsurePeriod *string `json:"insure_period,omitempty" xml:"insure_period,omitempty" require:"true"`
	// 保单状态
	PolicyStatus *string `json:"policy_status,omitempty" xml:"policy_status,omitempty" require:"true"`
	// 操作类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 保司信用代码
	InsureCompCreditNo *string `json:"insure_comp_credit_no,omitempty" xml:"insure_comp_credit_no,omitempty" require:"true"`
}

func (s InsureInfo) String() string {
	return tea.Prettify(s)
}

func (s InsureInfo) GoString() string {
	return s.String()
}

func (s *InsureInfo) SetModifyTime(v string) *InsureInfo {
	s.ModifyTime = &v
	return s
}

func (s *InsureInfo) SetProductCode(v string) *InsureInfo {
	s.ProductCode = &v
	return s
}

func (s *InsureInfo) SetInsureProduct(v string) *InsureInfo {
	s.InsureProduct = &v
	return s
}

func (s *InsureInfo) SetInsurePrice(v string) *InsureInfo {
	s.InsurePrice = &v
	return s
}

func (s *InsureInfo) SetInsureType(v string) *InsureInfo {
	s.InsureType = &v
	return s
}

func (s *InsureInfo) SetPayType(v string) *InsureInfo {
	s.PayType = &v
	return s
}

func (s *InsureInfo) SetInsurePeriod(v string) *InsureInfo {
	s.InsurePeriod = &v
	return s
}

func (s *InsureInfo) SetPolicyStatus(v string) *InsureInfo {
	s.PolicyStatus = &v
	return s
}

func (s *InsureInfo) SetOperateType(v string) *InsureInfo {
	s.OperateType = &v
	return s
}

func (s *InsureInfo) SetInsureCompCreditNo(v string) *InsureInfo {
	s.InsureCompCreditNo = &v
	return s
}

// 内容安全response
type CctDetectCheckLabel struct {
	// label
	Label *string `json:"label,omitempty" xml:"label,omitempty" require:"true"`
	// rate
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// subLabels
	SubLabels []*CctSubCheckLabel `json:"sub_labels,omitempty" xml:"sub_labels,omitempty" require:"true" type:"Repeated"`
	// details
	Details *string `json:"details,omitempty" xml:"details,omitempty" require:"true"`
}

func (s CctDetectCheckLabel) String() string {
	return tea.Prettify(s)
}

func (s CctDetectCheckLabel) GoString() string {
	return s.String()
}

func (s *CctDetectCheckLabel) SetLabel(v string) *CctDetectCheckLabel {
	s.Label = &v
	return s
}

func (s *CctDetectCheckLabel) SetRate(v int64) *CctDetectCheckLabel {
	s.Rate = &v
	return s
}

func (s *CctDetectCheckLabel) SetSubLabels(v []*CctSubCheckLabel) *CctDetectCheckLabel {
	s.SubLabels = v
	return s
}

func (s *CctDetectCheckLabel) SetDetails(v string) *CctDetectCheckLabel {
	s.Details = &v
	return s
}

type RunGeneralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求数据，json格式
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 要调用的具体的服务名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s RunGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s RunGeneralRequest) GoString() string {
	return s.String()
}

func (s *RunGeneralRequest) SetAuthToken(v string) *RunGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *RunGeneralRequest) SetProductInstanceId(v string) *RunGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunGeneralRequest) SetRequest(v string) *RunGeneralRequest {
	s.Request = &v
	return s
}

func (s *RunGeneralRequest) SetServiceName(v string) *RunGeneralRequest {
	s.ServiceName = &v
	return s
}

func (s *RunGeneralRequest) SetExtInfo(v string) *RunGeneralRequest {
	s.ExtInfo = &v
	return s
}

type RunGeneralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务响应数据，json格式
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s RunGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s RunGeneralResponse) GoString() string {
	return s.String()
}

func (s *RunGeneralResponse) SetReqMsgId(v string) *RunGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunGeneralResponse) SetResultCode(v string) *RunGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *RunGeneralResponse) SetResultMsg(v string) *RunGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunGeneralResponse) SetResponse(v string) *RunGeneralResponse {
	s.Response = &v
	return s
}

type ExecEkytInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保险信息list的jsonStr
	InsureInfoListStr *string `json:"insure_info_list_str,omitempty" xml:"insure_info_list_str,omitempty" require:"true"`
	// 对insure_info_list_str的签名
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ExecEkytInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecEkytInsureRequest) GoString() string {
	return s.String()
}

func (s *ExecEkytInsureRequest) SetAuthToken(v string) *ExecEkytInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecEkytInsureRequest) SetProductInstanceId(v string) *ExecEkytInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecEkytInsureRequest) SetInsureInfoListStr(v string) *ExecEkytInsureRequest {
	s.InsureInfoListStr = &v
	return s
}

func (s *ExecEkytInsureRequest) SetSignature(v string) *ExecEkytInsureRequest {
	s.Signature = &v
	return s
}

type ExecEkytInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 投保结果list的jsonStr
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecEkytInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecEkytInsureResponse) GoString() string {
	return s.String()
}

func (s *ExecEkytInsureResponse) SetReqMsgId(v string) *ExecEkytInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecEkytInsureResponse) SetResultCode(v string) *ExecEkytInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecEkytInsureResponse) SetResultMsg(v string) *ExecEkytInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecEkytInsureResponse) SetSuccess(v bool) *ExecEkytInsureResponse {
	s.Success = &v
	return s
}

func (s *ExecEkytInsureResponse) SetData(v string) *ExecEkytInsureResponse {
	s.Data = &v
	return s
}

type CreateBssecpicRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 客户名
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty" require:"true"`
	// 操作系统
	OsType *string `json:"os_type,omitempty" xml:"os_type,omitempty" require:"true"`
	// 包名
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 签名信息
	CertSign *string `json:"cert_sign,omitempty" xml:"cert_sign,omitempty"`
	// 签名秘钥内容
	AppKeyData *string `json:"app_key_data,omitempty" xml:"app_key_data,omitempty"`
	// 加密秘钥内容
	SecurityData *string `json:"security_data,omitempty" xml:"security_data,omitempty"`
	// 自定义秘钥内容
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 白盒秘钥内容
	WhiteBoxData *string `json:"white_box_data,omitempty" xml:"white_box_data,omitempty"`
}

func (s CreateBssecpicRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBssecpicRequest) GoString() string {
	return s.String()
}

func (s *CreateBssecpicRequest) SetAuthToken(v string) *CreateBssecpicRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBssecpicRequest) SetProductInstanceId(v string) *CreateBssecpicRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBssecpicRequest) SetAppName(v string) *CreateBssecpicRequest {
	s.AppName = &v
	return s
}

func (s *CreateBssecpicRequest) SetClientName(v string) *CreateBssecpicRequest {
	s.ClientName = &v
	return s
}

func (s *CreateBssecpicRequest) SetOsType(v string) *CreateBssecpicRequest {
	s.OsType = &v
	return s
}

func (s *CreateBssecpicRequest) SetPackageName(v string) *CreateBssecpicRequest {
	s.PackageName = &v
	return s
}

func (s *CreateBssecpicRequest) SetCertSign(v string) *CreateBssecpicRequest {
	s.CertSign = &v
	return s
}

func (s *CreateBssecpicRequest) SetAppKeyData(v string) *CreateBssecpicRequest {
	s.AppKeyData = &v
	return s
}

func (s *CreateBssecpicRequest) SetSecurityData(v string) *CreateBssecpicRequest {
	s.SecurityData = &v
	return s
}

func (s *CreateBssecpicRequest) SetExtraData(v string) *CreateBssecpicRequest {
	s.ExtraData = &v
	return s
}

func (s *CreateBssecpicRequest) SetWhiteBoxData(v string) *CreateBssecpicRequest {
	s.WhiteBoxData = &v
	return s
}

type CreateBssecpicResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 返回文件的内容base64
	BodyBase64 *string `json:"body_base64,omitempty" xml:"body_base64,omitempty"`
}

func (s CreateBssecpicResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBssecpicResponse) GoString() string {
	return s.String()
}

func (s *CreateBssecpicResponse) SetReqMsgId(v string) *CreateBssecpicResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBssecpicResponse) SetResultCode(v string) *CreateBssecpicResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBssecpicResponse) SetResultMsg(v string) *CreateBssecpicResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBssecpicResponse) SetSuccess(v bool) *CreateBssecpicResponse {
	s.Success = &v
	return s
}

func (s *CreateBssecpicResponse) SetFileName(v string) *CreateBssecpicResponse {
	s.FileName = &v
	return s
}

func (s *CreateBssecpicResponse) SetBodyBase64(v string) *CreateBssecpicResponse {
	s.BodyBase64 = &v
	return s
}

type CreateBlueshieldSecuritypictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 客户名
	ClientName *string `json:"client_name,omitempty" xml:"client_name,omitempty" require:"true"`
	// 操作系统
	OsType *string `json:"os_type,omitempty" xml:"os_type,omitempty" require:"true"`
	// 包名
	PackageName *string `json:"package_name,omitempty" xml:"package_name,omitempty" require:"true"`
	// 签名信息
	CertSign *string `json:"cert_sign,omitempty" xml:"cert_sign,omitempty"`
	// 签名秘钥内容
	AppKeyData *string `json:"app_key_data,omitempty" xml:"app_key_data,omitempty"`
	// 加密秘钥内容
	SecurityData *string `json:"security_data,omitempty" xml:"security_data,omitempty"`
	// 自定义秘钥内容
	ExtraData *string `json:"extra_data,omitempty" xml:"extra_data,omitempty"`
	// 白盒秘钥内容
	WhiteBoxData *string `json:"white_box_data,omitempty" xml:"white_box_data,omitempty"`
	// raas产品码列表
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// 直接透传的二级租户，可选
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
}

func (s CreateBlueshieldSecuritypictureRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBlueshieldSecuritypictureRequest) GoString() string {
	return s.String()
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAuthToken(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetProductInstanceId(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAppName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AppName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetClientName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ClientName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetOsType(v string) *CreateBlueshieldSecuritypictureRequest {
	s.OsType = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetPackageName(v string) *CreateBlueshieldSecuritypictureRequest {
	s.PackageName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetCertSign(v string) *CreateBlueshieldSecuritypictureRequest {
	s.CertSign = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetAppKeyData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.AppKeyData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetSecurityData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.SecurityData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetExtraData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.ExtraData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetWhiteBoxData(v string) *CreateBlueshieldSecuritypictureRequest {
	s.WhiteBoxData = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetRaasProducts(v string) *CreateBlueshieldSecuritypictureRequest {
	s.RaasProducts = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureRequest) SetRaasSecondTenant(v string) *CreateBlueshieldSecuritypictureRequest {
	s.RaasSecondTenant = &v
	return s
}

type CreateBlueshieldSecuritypictureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 生成的图片文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// body base 64
	BodyBase64 *string `json:"body_base64,omitempty" xml:"body_base64,omitempty"`
}

func (s CreateBlueshieldSecuritypictureResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBlueshieldSecuritypictureResponse) GoString() string {
	return s.String()
}

func (s *CreateBlueshieldSecuritypictureResponse) SetReqMsgId(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetResultCode(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetResultMsg(v string) *CreateBlueshieldSecuritypictureResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetSuccess(v bool) *CreateBlueshieldSecuritypictureResponse {
	s.Success = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetFileName(v string) *CreateBlueshieldSecuritypictureResponse {
	s.FileName = &v
	return s
}

func (s *CreateBlueshieldSecuritypictureResponse) SetBodyBase64(v string) *CreateBlueshieldSecuritypictureResponse {
	s.BodyBase64 = &v
	return s
}

type QueryFaceshieldNativeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id，标识客户来源
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// 切面数据（JSON，详见下方）
	// {
	// 	"sessionId": "zimId"	//人脸的bizID
	//   "rId": "rId"	//在获取活体方法人脸下发的bisToken
	//   "keyInfoHash": "keyInfoHash"	//关键信息hash
	//   "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
	//   "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
	// }
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
	// 否（和切面二选一即可）
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty"`
	// 签名因子（和切面二选一即可）
	SignFactor *string `json:"sign_factor,omitempty" xml:"sign_factor,omitempty"`
	// RaaS租户
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// raas二级租户
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
}

func (s QueryFaceshieldNativeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldNativeRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldNativeRequest) SetAuthToken(v string) *QueryFaceshieldNativeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetProductInstanceId(v string) *QueryFaceshieldNativeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetClientId(v string) *QueryFaceshieldNativeRequest {
	s.ClientId = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetApdidToken(v string) *QueryFaceshieldNativeRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetAopData(v string) *QueryFaceshieldNativeRequest {
	s.AopData = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetSignature(v string) *QueryFaceshieldNativeRequest {
	s.Signature = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetSignFactor(v string) *QueryFaceshieldNativeRequest {
	s.SignFactor = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetRaasProducts(v string) *QueryFaceshieldNativeRequest {
	s.RaasProducts = &v
	return s
}

func (s *QueryFaceshieldNativeRequest) SetRaasSecondTenant(v string) *QueryFaceshieldNativeRequest {
	s.RaasSecondTenant = &v
	return s
}

type QueryFaceshieldNativeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true成功，false失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求码，200成功，其他失败，具体见错误码
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误时的返回信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求时传入的，若没有传，则系统自动生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// apdidToken	String	设备token
	// riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
	// riskDesc	String	风险描述，对风险等级的补充
	// sugAction	String	处理的建议，如PAAS
	Data *FaceShieldResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFaceshieldNativeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldNativeResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldNativeResponse) SetReqMsgId(v string) *QueryFaceshieldNativeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetResultCode(v string) *QueryFaceshieldNativeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetResultMsg(v string) *QueryFaceshieldNativeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetSuccess(v bool) *QueryFaceshieldNativeResponse {
	s.Success = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetCode(v int64) *QueryFaceshieldNativeResponse {
	s.Code = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetMessage(v string) *QueryFaceshieldNativeResponse {
	s.Message = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetRequestId(v string) *QueryFaceshieldNativeResponse {
	s.RequestId = &v
	return s
}

func (s *QueryFaceshieldNativeResponse) SetData(v *FaceShieldResult) *QueryFaceshieldNativeResponse {
	s.Data = v
	return s
}

type QueryFaceshieldWebRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户id，标识客户来源
	ClientId *string `json:"client_id,omitempty" xml:"client_id,omitempty" require:"true"`
	// 设备token
	ApdidToken *string `json:"apdid_token,omitempty" xml:"apdid_token,omitempty"`
	// 切面数据（JSON，详见下方）
	AopData *string `json:"aop_data,omitempty" xml:"aop_data,omitempty"`
	// RaaS租户
	//
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
	// raas二级租户
	//
	RaasSecondTenant *string `json:"raas_second_tenant,omitempty" xml:"raas_second_tenant,omitempty"`
}

func (s QueryFaceshieldWebRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldWebRequest) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldWebRequest) SetAuthToken(v string) *QueryFaceshieldWebRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetProductInstanceId(v string) *QueryFaceshieldWebRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetClientId(v string) *QueryFaceshieldWebRequest {
	s.ClientId = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetApdidToken(v string) *QueryFaceshieldWebRequest {
	s.ApdidToken = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetAopData(v string) *QueryFaceshieldWebRequest {
	s.AopData = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetRaasProducts(v string) *QueryFaceshieldWebRequest {
	s.RaasProducts = &v
	return s
}

func (s *QueryFaceshieldWebRequest) SetRaasSecondTenant(v string) *QueryFaceshieldWebRequest {
	s.RaasSecondTenant = &v
	return s
}

type QueryFaceshieldWebResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true成功，false失败
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求码，200成功，其他失败，具体见错误码
	//
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 错误时的返回信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求时传入的，若没有传，则系统自动生成
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
	Data *FaceShieldResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFaceshieldWebResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFaceshieldWebResponse) GoString() string {
	return s.String()
}

func (s *QueryFaceshieldWebResponse) SetReqMsgId(v string) *QueryFaceshieldWebResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetResultCode(v string) *QueryFaceshieldWebResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetResultMsg(v string) *QueryFaceshieldWebResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetSuccess(v bool) *QueryFaceshieldWebResponse {
	s.Success = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetCode(v int64) *QueryFaceshieldWebResponse {
	s.Code = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetMessage(v string) *QueryFaceshieldWebResponse {
	s.Message = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetRequestId(v string) *QueryFaceshieldWebResponse {
	s.RequestId = &v
	return s
}

func (s *QueryFaceshieldWebResponse) SetData(v *FaceShieldResult) *QueryFaceshieldWebResponse {
	s.Data = v
	return s
}

type InitIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产商code
	CorpCode *string `json:"corp_code,omitempty" xml:"corp_code,omitempty" require:"true"`
	// 设备类型
	DeviceType *string `json:"device_type,omitempty" xml:"device_type,omitempty" require:"true"`
	// 设备信息
	DeviceInfo *string `json:"device_info,omitempty" xml:"device_info,omitempty" require:"true"`
}

func (s InitIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *InitIifaaDeviceRequest) SetAuthToken(v string) *InitIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetProductInstanceId(v string) *InitIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetCorpCode(v string) *InitIifaaDeviceRequest {
	s.CorpCode = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetDeviceType(v string) *InitIifaaDeviceRequest {
	s.DeviceType = &v
	return s
}

func (s *InitIifaaDeviceRequest) SetDeviceInfo(v string) *InitIifaaDeviceRequest {
	s.DeviceInfo = &v
	return s
}

type InitIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s InitIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *InitIifaaDeviceResponse) SetReqMsgId(v string) *InitIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetResultCode(v string) *InitIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetResultMsg(v string) *InitIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIifaaDeviceResponse) SetData(v string) *InitIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RecognizeIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备唯一ID
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
}

func (s RecognizeIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *RecognizeIifaaDeviceRequest) SetAuthToken(v string) *RecognizeIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeIifaaDeviceRequest) SetProductInstanceId(v string) *RecognizeIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeIifaaDeviceRequest) SetTuid(v string) *RecognizeIifaaDeviceRequest {
	s.Tuid = &v
	return s
}

type RecognizeIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据内容
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RecognizeIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *RecognizeIifaaDeviceResponse) SetReqMsgId(v string) *RecognizeIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetResultCode(v string) *RecognizeIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetResultMsg(v string) *RecognizeIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeIifaaDeviceResponse) SetData(v string) *RecognizeIifaaDeviceResponse {
	s.Data = &v
	return s
}

type VerifyIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待验证的数据
	CipherText *string `json:"cipher_text,omitempty" xml:"cipher_text,omitempty" require:"true"`
}

func (s VerifyIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *VerifyIifaaDeviceRequest) SetAuthToken(v string) *VerifyIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyIifaaDeviceRequest) SetProductInstanceId(v string) *VerifyIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyIifaaDeviceRequest) SetCipherText(v string) *VerifyIifaaDeviceRequest {
	s.CipherText = &v
	return s
}

type VerifyIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验证结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *VerifyIifaaDeviceResponse) SetReqMsgId(v string) *VerifyIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetResultCode(v string) *VerifyIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetResultMsg(v string) *VerifyIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyIifaaDeviceResponse) SetData(v string) *VerifyIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RegisterIifaaCorpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产商code
	CorpCode *string `json:"corp_code,omitempty" xml:"corp_code,omitempty" require:"true"`
	// 产商名称
	CorpName *string `json:"corp_name,omitempty" xml:"corp_name,omitempty" require:"true"`
	// 产商签约code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s RegisterIifaaCorpRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterIifaaCorpRequest) GoString() string {
	return s.String()
}

func (s *RegisterIifaaCorpRequest) SetAuthToken(v string) *RegisterIifaaCorpRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetProductInstanceId(v string) *RegisterIifaaCorpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetCorpCode(v string) *RegisterIifaaCorpRequest {
	s.CorpCode = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetCorpName(v string) *RegisterIifaaCorpRequest {
	s.CorpName = &v
	return s
}

func (s *RegisterIifaaCorpRequest) SetProductCode(v string) *RegisterIifaaCorpRequest {
	s.ProductCode = &v
	return s
}

type RegisterIifaaCorpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产商注册结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RegisterIifaaCorpResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterIifaaCorpResponse) GoString() string {
	return s.String()
}

func (s *RegisterIifaaCorpResponse) SetReqMsgId(v string) *RegisterIifaaCorpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetResultCode(v string) *RegisterIifaaCorpResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetResultMsg(v string) *RegisterIifaaCorpResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterIifaaCorpResponse) SetData(v string) *RegisterIifaaCorpResponse {
	s.Data = &v
	return s
}

type DeprecateIifaaDeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 设备唯一ID
	Tuid *string `json:"tuid,omitempty" xml:"tuid,omitempty" require:"true"`
}

func (s DeprecateIifaaDeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeprecateIifaaDeviceRequest) GoString() string {
	return s.String()
}

func (s *DeprecateIifaaDeviceRequest) SetAuthToken(v string) *DeprecateIifaaDeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeprecateIifaaDeviceRequest) SetProductInstanceId(v string) *DeprecateIifaaDeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeprecateIifaaDeviceRequest) SetTuid(v string) *DeprecateIifaaDeviceRequest {
	s.Tuid = &v
	return s
}

type DeprecateIifaaDeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 设备擦除结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DeprecateIifaaDeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeprecateIifaaDeviceResponse) GoString() string {
	return s.String()
}

func (s *DeprecateIifaaDeviceResponse) SetReqMsgId(v string) *DeprecateIifaaDeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetResultCode(v string) *DeprecateIifaaDeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetResultMsg(v string) *DeprecateIifaaDeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeprecateIifaaDeviceResponse) SetData(v string) *DeprecateIifaaDeviceResponse {
	s.Data = &v
	return s
}

type RunXhunterSpiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// XHUNTER_ISV_STANDARD
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// json
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// raas_products
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
}

func (s RunXhunterSpiRequest) String() string {
	return tea.Prettify(s)
}

func (s RunXhunterSpiRequest) GoString() string {
	return s.String()
}

func (s *RunXhunterSpiRequest) SetAuthToken(v string) *RunXhunterSpiRequest {
	s.AuthToken = &v
	return s
}

func (s *RunXhunterSpiRequest) SetProductInstanceId(v string) *RunXhunterSpiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunXhunterSpiRequest) SetRequest(v string) *RunXhunterSpiRequest {
	s.Request = &v
	return s
}

func (s *RunXhunterSpiRequest) SetServiceName(v string) *RunXhunterSpiRequest {
	s.ServiceName = &v
	return s
}

func (s *RunXhunterSpiRequest) SetExtInfo(v string) *RunXhunterSpiRequest {
	s.ExtInfo = &v
	return s
}

func (s *RunXhunterSpiRequest) SetRaasProducts(v string) *RunXhunterSpiRequest {
	s.RaasProducts = &v
	return s
}

type RunXhunterSpiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// response
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s RunXhunterSpiResponse) String() string {
	return tea.Prettify(s)
}

func (s RunXhunterSpiResponse) GoString() string {
	return s.String()
}

func (s *RunXhunterSpiResponse) SetReqMsgId(v string) *RunXhunterSpiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResultCode(v string) *RunXhunterSpiResponse {
	s.ResultCode = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResultMsg(v string) *RunXhunterSpiResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunXhunterSpiResponse) SetResponse(v string) *RunXhunterSpiResponse {
	s.Response = &v
	return s
}

type ExecIifaaInsureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保险信息list的jsonStr
	InsureInfoListStr *string `json:"insure_info_list_str,omitempty" xml:"insure_info_list_str,omitempty" require:"true"`
	// 对insure_info_list_str的签名，使用十六进制字符串编码
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s ExecIifaaInsureRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecIifaaInsureRequest) GoString() string {
	return s.String()
}

func (s *ExecIifaaInsureRequest) SetAuthToken(v string) *ExecIifaaInsureRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetProductInstanceId(v string) *ExecIifaaInsureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetInsureInfoListStr(v string) *ExecIifaaInsureRequest {
	s.InsureInfoListStr = &v
	return s
}

func (s *ExecIifaaInsureRequest) SetSignature(v string) *ExecIifaaInsureRequest {
	s.Signature = &v
	return s
}

type ExecIifaaInsureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 投保结果list的jsonStr
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ExecIifaaInsureResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecIifaaInsureResponse) GoString() string {
	return s.String()
}

func (s *ExecIifaaInsureResponse) SetReqMsgId(v string) *ExecIifaaInsureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetResultCode(v string) *ExecIifaaInsureResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetResultMsg(v string) *ExecIifaaInsureResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecIifaaInsureResponse) SetData(v string) *ExecIifaaInsureResponse {
	s.Data = &v
	return s
}

type QueryCctPictureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// InfoSecAnalyzeSyncContent json
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// RaaS产品码
	RaasProducts *string `json:"raas_products,omitempty" xml:"raas_products,omitempty" require:"true"`
}

func (s QueryCctPictureRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCctPictureRequest) GoString() string {
	return s.String()
}

func (s *QueryCctPictureRequest) SetAuthToken(v string) *QueryCctPictureRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCctPictureRequest) SetProductInstanceId(v string) *QueryCctPictureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCctPictureRequest) SetRequest(v string) *QueryCctPictureRequest {
	s.Request = &v
	return s
}

func (s *QueryCctPictureRequest) SetRaasProducts(v string) *QueryCctPictureRequest {
	s.RaasProducts = &v
	return s
}

type QueryCctPictureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// InfoSecAnalyzeSyncContent json
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s QueryCctPictureResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCctPictureResponse) GoString() string {
	return s.String()
}

func (s *QueryCctPictureResponse) SetReqMsgId(v string) *QueryCctPictureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCctPictureResponse) SetResultCode(v string) *QueryCctPictureResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCctPictureResponse) SetResultMsg(v string) *QueryCctPictureResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCctPictureResponse) SetResponse(v string) *QueryCctPictureResponse {
	s.Response = &v
	return s
}

type RecognizeCctAnalyzeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// channel
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// content_type
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// user_id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// data_map
	DataMap *CctDataMap `json:"data_map,omitempty" xml:"data_map,omitempty" require:"true"`
}

func (s RecognizeCctAnalyzeRequest) String() string {
	return tea.Prettify(s)
}

func (s RecognizeCctAnalyzeRequest) GoString() string {
	return s.String()
}

func (s *RecognizeCctAnalyzeRequest) SetAuthToken(v string) *RecognizeCctAnalyzeRequest {
	s.AuthToken = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetProductInstanceId(v string) *RecognizeCctAnalyzeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetChannel(v string) *RecognizeCctAnalyzeRequest {
	s.Channel = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetContentType(v string) *RecognizeCctAnalyzeRequest {
	s.ContentType = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetUserId(v string) *RecognizeCctAnalyzeRequest {
	s.UserId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetRequestId(v string) *RecognizeCctAnalyzeRequest {
	s.RequestId = &v
	return s
}

func (s *RecognizeCctAnalyzeRequest) SetDataMap(v *CctDataMap) *RecognizeCctAnalyzeRequest {
	s.DataMap = v
	return s
}

type RecognizeCctAnalyzeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// biz_request_id
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty"`
	// suggestion
	Suggestion *string `json:"suggestion,omitempty" xml:"suggestion,omitempty"`
	// detect_labels
	DetectLabels []*CctDetectCheckLabel `json:"detect_labels,omitempty" xml:"detect_labels,omitempty" type:"Repeated"`
}

func (s RecognizeCctAnalyzeResponse) String() string {
	return tea.Prettify(s)
}

func (s RecognizeCctAnalyzeResponse) GoString() string {
	return s.String()
}

func (s *RecognizeCctAnalyzeResponse) SetReqMsgId(v string) *RecognizeCctAnalyzeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetResultCode(v string) *RecognizeCctAnalyzeResponse {
	s.ResultCode = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetResultMsg(v string) *RecognizeCctAnalyzeResponse {
	s.ResultMsg = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetBizRequestId(v string) *RecognizeCctAnalyzeResponse {
	s.BizRequestId = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetSuggestion(v string) *RecognizeCctAnalyzeResponse {
	s.Suggestion = &v
	return s
}

func (s *RecognizeCctAnalyzeResponse) SetDetectLabels(v []*CctDetectCheckLabel) *RecognizeCctAnalyzeResponse {
	s.DetectLabels = v
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
				"sdk_version":      tea.String("1.1.12"),
				"_prod_code":       tea.String("SECURITYTECH"),
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
 * Description: 安全科技网关通用运行接口
 * Summary: 安全科技网关通用运行接口
 */
func (client *Client) RunGeneral(request *RunGeneralRequest) (_result *RunGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunGeneralResponse{}
	_body, _err := client.RunGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 安全科技网关通用运行接口
 * Summary: 安全科技网关通用运行接口
 */
func (client *Client) RunGeneralEx(request *RunGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.general.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租赁住房保险产品，开放接口
调用方：上海远点网络科技有限公司
 * Summary: 租赁住房保险产品，接口开放给租房平台
*/
func (client *Client) ExecEkytInsure(request *ExecEkytInsureRequest) (_result *ExecEkytInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecEkytInsureResponse{}
	_body, _err := client.ExecEkytInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租赁住房保险产品，开放接口
调用方：上海远点网络科技有限公司
 * Summary: 租赁住房保险产品，接口开放给租房平台
*/
func (client *Client) ExecEkytInsureEx(request *ExecEkytInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecEkytInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecEkytInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.insure.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBssecpic(request *CreateBssecpicRequest) (_result *CreateBssecpicResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBssecpicResponse{}
	_body, _err := client.CreateBssecpicEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBssecpicEx(request *CreateBssecpicRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBssecpicResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBssecpicResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.bssecpic.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBlueshieldSecuritypicture(request *CreateBlueshieldSecuritypictureRequest) (_result *CreateBlueshieldSecuritypictureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBlueshieldSecuritypictureResponse{}
	_body, _err := client.CreateBlueshieldSecuritypictureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 蓝盾安全图片生成
 * Summary: 蓝盾安全图片生成
 */
func (client *Client) CreateBlueshieldSecuritypictureEx(request *CreateBlueshieldSecuritypictureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBlueshieldSecuritypictureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBlueshieldSecuritypictureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.blueshield.securitypicture.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Native查询
 * Summary: 人脸盾Native查询
 */
func (client *Client) QueryFaceshieldNative(request *QueryFaceshieldNativeRequest) (_result *QueryFaceshieldNativeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceshieldNativeResponse{}
	_body, _err := client.QueryFaceshieldNativeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Native查询
 * Summary: 人脸盾Native查询
 */
func (client *Client) QueryFaceshieldNativeEx(request *QueryFaceshieldNativeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceshieldNativeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceshieldNativeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.faceshield.native.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Web查询
 * Summary: 人脸盾Web查询
 */
func (client *Client) QueryFaceshieldWeb(request *QueryFaceshieldWebRequest) (_result *QueryFaceshieldWebResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFaceshieldWebResponse{}
	_body, _err := client.QueryFaceshieldWebEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终端安全人脸盾Web查询
 * Summary: 人脸盾Web查询
 */
func (client *Client) QueryFaceshieldWebEx(request *QueryFaceshieldWebRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFaceshieldWebResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFaceshieldWebResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.faceshield.web.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设备激活
 * Summary: 可信设备认证设备初始化，设备激活
 */
func (client *Client) InitIifaaDevice(request *InitIifaaDeviceRequest) (_result *InitIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIifaaDeviceResponse{}
	_body, _err := client.InitIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 设备激活
 * Summary: 可信设备认证设备初始化，设备激活
 */
func (client *Client) InitIifaaDeviceEx(request *InitIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证风险咨询，获取预认证数据
 * Summary: 可信设备认证风险咨询，获取预认证数据
 */
func (client *Client) RecognizeIifaaDevice(request *RecognizeIifaaDeviceRequest) (_result *RecognizeIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeIifaaDeviceResponse{}
	_body, _err := client.RecognizeIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证风险咨询，获取预认证数据
 * Summary: 可信设备认证风险咨询，获取预认证数据
 */
func (client *Client) RecognizeIifaaDeviceEx(request *RecognizeIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，设备验证
 * Summary: 可信设备认证，设备验证
 */
func (client *Client) VerifyIifaaDevice(request *VerifyIifaaDeviceRequest) (_result *VerifyIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyIifaaDeviceResponse{}
	_body, _err := client.VerifyIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，设备验证
 * Summary: 可信设备认证，设备验证
 */
func (client *Client) VerifyIifaaDeviceEx(request *VerifyIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，产商注册
 * Summary: 可信设备认证，产商注册
 */
func (client *Client) RegisterIifaaCorp(request *RegisterIifaaCorpRequest) (_result *RegisterIifaaCorpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterIifaaCorpResponse{}
	_body, _err := client.RegisterIifaaCorpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，产商注册
 * Summary: 可信设备认证，产商注册
 */
func (client *Client) RegisterIifaaCorpEx(request *RegisterIifaaCorpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterIifaaCorpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterIifaaCorpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.corp.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信设备认证，擦除设备信息
 * Summary: 可信设备认证，擦除设备信息
 */
func (client *Client) DeprecateIifaaDevice(request *DeprecateIifaaDeviceRequest) (_result *DeprecateIifaaDeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeprecateIifaaDeviceResponse{}
	_body, _err := client.DeprecateIifaaDeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信设备认证，擦除设备信息
 * Summary: 可信设备认证，擦除设备信息
 */
func (client *Client) DeprecateIifaaDeviceEx(request *DeprecateIifaaDeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeprecateIifaaDeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeprecateIifaaDeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.device.deprecate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 巡检商业化
 * Summary: 巡检商业化
 */
func (client *Client) RunXhunterSpi(request *RunXhunterSpiRequest) (_result *RunXhunterSpiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunXhunterSpiResponse{}
	_body, _err := client.RunXhunterSpiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 巡检商业化
 * Summary: 巡检商业化
 */
func (client *Client) RunXhunterSpiEx(request *RunXhunterSpiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunXhunterSpiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunXhunterSpiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.xhunter.spi.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租凭住房保险产品，接口开放给租房平台
 * Summary: 租凭住房保险产品，接口开放给租房平台
 */
func (client *Client) ExecIifaaInsure(request *ExecIifaaInsureRequest) (_result *ExecIifaaInsureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecIifaaInsureResponse{}
	_body, _err := client.ExecIifaaInsureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租凭住房保险产品，接口开放给租房平台
 * Summary: 租凭住房保险产品，接口开放给租房平台
 */
func (client *Client) ExecIifaaInsureEx(request *ExecIifaaInsureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecIifaaInsureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecIifaaInsureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.iifaa.insure.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容安全图片同步检测
 * Summary: 内容安全图片同步检测
 */
func (client *Client) QueryCctPicture(request *QueryCctPictureRequest) (_result *QueryCctPictureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCctPictureResponse{}
	_body, _err := client.QueryCctPictureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容安全图片同步检测
 * Summary: 内容安全图片同步检测
 */
func (client *Client) QueryCctPictureEx(request *QueryCctPictureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCctPictureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCctPictureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.cct.picture.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容安全主站同步检测
 * Summary: 内容安全主站同步检测
 */
func (client *Client) RecognizeCctAnalyze(request *RecognizeCctAnalyzeRequest) (_result *RecognizeCctAnalyzeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RecognizeCctAnalyzeResponse{}
	_body, _err := client.RecognizeCctAnalyzeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容安全主站同步检测
 * Summary: 内容安全主站同步检测
 */
func (client *Client) RecognizeCctAnalyzeEx(request *RecognizeCctAnalyzeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RecognizeCctAnalyzeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RecognizeCctAnalyzeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.cct.analyze.recognize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
