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

// 区块信息
type BlockInfo struct {
	// 区块链唯一性标识
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 区块哈希
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty" require:"true"`
	// 上一个区块的hash
	ParentHash *string `json:"parent_hash,omitempty" xml:"parent_hash,omitempty" require:"true"`
	// 块高
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
	// 出块时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 业务数据
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty" require:"true"`
	// 包含交易数
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty" require:"true"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// size
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s BlockInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockInfo) GoString() string {
	return s.String()
}

func (s *BlockInfo) SetBizId(v string) *BlockInfo {
	s.BizId = &v
	return s
}

func (s *BlockInfo) SetBlockHash(v string) *BlockInfo {
	s.BlockHash = &v
	return s
}

func (s *BlockInfo) SetParentHash(v string) *BlockInfo {
	s.ParentHash = &v
	return s
}

func (s *BlockInfo) SetHeight(v int64) *BlockInfo {
	s.Height = &v
	return s
}

func (s *BlockInfo) SetTimestamp(v int64) *BlockInfo {
	s.Timestamp = &v
	return s
}

func (s *BlockInfo) SetBizData(v string) *BlockInfo {
	s.BizData = &v
	return s
}

func (s *BlockInfo) SetTransactionSize(v int64) *BlockInfo {
	s.TransactionSize = &v
	return s
}

func (s *BlockInfo) SetVersion(v string) *BlockInfo {
	s.Version = &v
	return s
}

func (s *BlockInfo) SetSize(v int64) *BlockInfo {
	s.Size = &v
	return s
}

// 机构（可以为银行或地区）
type Institution struct {
	// 人行联行号/行政地区编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 银行全称/行政地区名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s Institution) String() string {
	return tea.Prettify(s)
}

func (s Institution) GoString() string {
	return s.String()
}

func (s *Institution) SetCode(v string) *Institution {
	s.Code = &v
	return s
}

func (s *Institution) SetName(v string) *Institution {
	s.Name = &v
	return s
}

// 侵权结果
type AntiPiracyResultObject struct {
	// 侵权主体
	InfrHost *string `json:"infr_host,omitempty" xml:"infr_host,omitempty"`
	// 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
	InfrTime *int64 `json:"infr_time,omitempty" xml:"infr_time,omitempty"`
	// 侵权标题
	InfrTitle *string `json:"infr_title,omitempty" xml:"infr_title,omitempty"`
	// 侵权网址
	InfrUrl *string `json:"infr_url,omitempty" xml:"infr_url,omitempty"`
	// 默认值：VIDEO
	ProductionType *string `json:"production_type,omitempty" xml:"production_type,omitempty"`
	// 相似度
	Similarity *string `json:"similarity,omitempty" xml:"similarity,omitempty"`
}

func (s AntiPiracyResultObject) String() string {
	return tea.Prettify(s)
}

func (s AntiPiracyResultObject) GoString() string {
	return s.String()
}

func (s *AntiPiracyResultObject) SetInfrHost(v string) *AntiPiracyResultObject {
	s.InfrHost = &v
	return s
}

func (s *AntiPiracyResultObject) SetInfrTime(v int64) *AntiPiracyResultObject {
	s.InfrTime = &v
	return s
}

func (s *AntiPiracyResultObject) SetInfrTitle(v string) *AntiPiracyResultObject {
	s.InfrTitle = &v
	return s
}

func (s *AntiPiracyResultObject) SetInfrUrl(v string) *AntiPiracyResultObject {
	s.InfrUrl = &v
	return s
}

func (s *AntiPiracyResultObject) SetProductionType(v string) *AntiPiracyResultObject {
	s.ProductionType = &v
	return s
}

func (s *AntiPiracyResultObject) SetSimilarity(v string) *AntiPiracyResultObject {
	s.Similarity = &v
	return s
}

// 命中结果详情
type HitDetectItems struct {
	// RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
	DetectTypeCode *string `json:"detect_type_code,omitempty" xml:"detect_type_code,omitempty"`
	// 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
	HitDetectResource *string `json:"hit_detect_resource,omitempty" xml:"hit_detect_resource,omitempty"`
	// 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
	HitContent *string `json:"hit_content,omitempty" xml:"hit_content,omitempty"`
	// 级别
	DetectResourceLevel *string `json:"detect_resource_level,omitempty" xml:"detect_resource_level,omitempty"`
}

func (s HitDetectItems) String() string {
	return tea.Prettify(s)
}

func (s HitDetectItems) GoString() string {
	return s.String()
}

func (s *HitDetectItems) SetDetectTypeCode(v string) *HitDetectItems {
	s.DetectTypeCode = &v
	return s
}

func (s *HitDetectItems) SetHitDetectResource(v string) *HitDetectItems {
	s.HitDetectResource = &v
	return s
}

func (s *HitDetectItems) SetHitContent(v string) *HitDetectItems {
	s.HitContent = &v
	return s
}

func (s *HitDetectItems) SetDetectResourceLevel(v string) *HitDetectItems {
	s.DetectResourceLevel = &v
	return s
}

// 用于内部业务统计的信息，外部商户请忽略
type BizInfo struct {
	// BPWZPFCN
	ClientTenent *string `json:"client_tenent,omitempty" xml:"client_tenent,omitempty"`
	// 业务代码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 内部产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s BizInfo) String() string {
	return tea.Prettify(s)
}

func (s BizInfo) GoString() string {
	return s.String()
}

func (s *BizInfo) SetClientTenent(v string) *BizInfo {
	s.ClientTenent = &v
	return s
}

func (s *BizInfo) SetCode(v string) *BizInfo {
	s.Code = &v
	return s
}

func (s *BizInfo) SetProductCode(v string) *BizInfo {
	s.ProductCode = &v
	return s
}

// 携带自己定义的服务类型
type DidDocServicesInfo struct {
	// 服务的扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务： DidAuthService， 有且只能有一个，并且id必须为didauth-1； VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 服务的可访问地址
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty" require:"true"`
	// 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s DidDocServicesInfo) String() string {
	return tea.Prettify(s)
}

func (s DidDocServicesInfo) GoString() string {
	return s.String()
}

func (s *DidDocServicesInfo) SetExtension(v string) *DidDocServicesInfo {
	s.Extension = &v
	return s
}

func (s *DidDocServicesInfo) SetId(v string) *DidDocServicesInfo {
	s.Id = &v
	return s
}

func (s *DidDocServicesInfo) SetServiceEndpoint(v string) *DidDocServicesInfo {
	s.ServiceEndpoint = &v
	return s
}

func (s *DidDocServicesInfo) SetType(v string) *DidDocServicesInfo {
	s.Type = &v
	return s
}

type UpdateBmpbrowserPrivilegeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// bizid
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 取消查看权限的支付宝电话号码集合
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true"`
}

func (s UpdateBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *UpdateBmpbrowserPrivilegeRequest) SetAuthToken(v string) *UpdateBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *UpdateBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeRequest) SetBizid(v string) *UpdateBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeRequest) SetPhoneNumbers(v string) *UpdateBmpbrowserPrivilegeRequest {
	s.PhoneNumbers = &v
	return s
}

type UpdateBmpbrowserPrivilegeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量更新权限成功与否
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s UpdateBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *UpdateBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *UpdateBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeResponse) SetResultCode(v string) *UpdateBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeResponse) SetResultMsg(v string) *UpdateBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBmpbrowserPrivilegeResponse) SetStatus(v int64) *UpdateBmpbrowserPrivilegeResponse {
	s.Status = &v
	return s
}

type QueryIndividualidInternalmaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 被核验人身份证号码后四位
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 被核验人姓名的一部分
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryIndividualidInternalmaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalmaskRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalmaskRequest) SetAuthToken(v string) *QueryIndividualidInternalmaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidInternalmaskRequest) SetProductInstanceId(v string) *QueryIndividualidInternalmaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidInternalmaskRequest) SetBizInfo(v *BizInfo) *QueryIndividualidInternalmaskRequest {
	s.BizInfo = v
	return s
}

func (s *QueryIndividualidInternalmaskRequest) SetCertNo(v string) *QueryIndividualidInternalmaskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryIndividualidInternalmaskRequest) SetMobile(v string) *QueryIndividualidInternalmaskRequest {
	s.Mobile = &v
	return s
}

func (s *QueryIndividualidInternalmaskRequest) SetName(v string) *QueryIndividualidInternalmaskRequest {
	s.Name = &v
	return s
}

type QueryIndividualidInternalmaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryIndividualidInternalmaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalmaskResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalmaskResponse) SetReqMsgId(v string) *QueryIndividualidInternalmaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidInternalmaskResponse) SetResultCode(v string) *QueryIndividualidInternalmaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidInternalmaskResponse) SetResultMsg(v string) *QueryIndividualidInternalmaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidInternalmaskResponse) SetAccepted(v bool) *QueryIndividualidInternalmaskResponse {
	s.Accepted = &v
	return s
}

func (s *QueryIndividualidInternalmaskResponse) SetVerifyUrl(v string) *QueryIndividualidInternalmaskResponse {
	s.VerifyUrl = &v
	return s
}

type QueryEnterpriseidInternalfourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
}

func (s QueryEnterpriseidInternalfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternalfourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetAuthToken(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetProductInstanceId(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetBizInfo(v *BizInfo) *QueryEnterpriseidInternalfourmetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetEpCertName(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetEpCertNo(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetEpCertType(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.EpCertType = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetLegalPersonCertName(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaRequest) SetLegalPersonCertNo(v string) *QueryEnterpriseidInternalfourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type QueryEnterpriseidInternalfourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseidInternalfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternalfourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetReqMsgId(v string) *QueryEnterpriseidInternalfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetResultCode(v string) *QueryEnterpriseidInternalfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetResultMsg(v string) *QueryEnterpriseidInternalfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetEnterpriseStatus(v string) *QueryEnterpriseidInternalfourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetOpenTime(v string) *QueryEnterpriseidInternalfourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEnterpriseidInternalfourmetaResponse) SetPassed(v bool) *QueryEnterpriseidInternalfourmetaResponse {
	s.Passed = &v
	return s
}

type QueryEnterpriseidInternalthreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 证件类型
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
}

func (s QueryEnterpriseidInternalthreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternalthreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetAuthToken(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetProductInstanceId(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetBizInfo(v *BizInfo) *QueryEnterpriseidInternalthreemetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetEpCertName(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetEpCertNo(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetEpCertType(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.EpCertType = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaRequest) SetLegalPersonCertName(v string) *QueryEnterpriseidInternalthreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type QueryEnterpriseidInternalthreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseidInternalthreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternalthreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetReqMsgId(v string) *QueryEnterpriseidInternalthreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetResultCode(v string) *QueryEnterpriseidInternalthreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetResultMsg(v string) *QueryEnterpriseidInternalthreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetEnterpriseStatus(v string) *QueryEnterpriseidInternalthreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetOpenTime(v string) *QueryEnterpriseidInternalthreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEnterpriseidInternalthreemetaResponse) SetPassed(v bool) *QueryEnterpriseidInternalthreemetaResponse {
	s.Passed = &v
	return s
}

type QueryEnterpriseidInternaltwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
}

func (s QueryEnterpriseidInternaltwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternaltwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetAuthToken(v string) *QueryEnterpriseidInternaltwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetProductInstanceId(v string) *QueryEnterpriseidInternaltwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetBizInfo(v *BizInfo) *QueryEnterpriseidInternaltwometaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetEpCertName(v string) *QueryEnterpriseidInternaltwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetEpCertNo(v string) *QueryEnterpriseidInternaltwometaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaRequest) SetEpCertType(v string) *QueryEnterpriseidInternaltwometaRequest {
	s.EpCertType = &v
	return s
}

type QueryEnterpriseidInternaltwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseidInternaltwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidInternaltwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetReqMsgId(v string) *QueryEnterpriseidInternaltwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetResultCode(v string) *QueryEnterpriseidInternaltwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetResultMsg(v string) *QueryEnterpriseidInternaltwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetEnterpriseStatus(v string) *QueryEnterpriseidInternaltwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetOpenTime(v string) *QueryEnterpriseidInternaltwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEnterpriseidInternaltwometaResponse) SetPassed(v bool) *QueryEnterpriseidInternaltwometaResponse {
	s.Passed = &v
	return s
}

type InitEnterpriseidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号（目前只支持身份证号）
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
}

func (s InitEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitEnterpriseidFaceauthRequest) SetAuthToken(v string) *InitEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *InitEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetEpCertName(v string) *InitEnterpriseidFaceauthRequest {
	s.EpCertName = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetEpCertNo(v string) *InitEnterpriseidFaceauthRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetEpCertType(v string) *InitEnterpriseidFaceauthRequest {
	s.EpCertType = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetLegalPersonCertName(v string) *InitEnterpriseidFaceauthRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitEnterpriseidFaceauthRequest) SetLegalPersonCertNo(v string) *InitEnterpriseidFaceauthRequest {
	s.LegalPersonCertNo = &v
	return s
}

type InitEnterpriseidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitEnterpriseidFaceauthResponse) SetReqMsgId(v string) *InitEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEnterpriseidFaceauthResponse) SetResultCode(v string) *InitEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEnterpriseidFaceauthResponse) SetResultMsg(v string) *InitEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEnterpriseidFaceauthResponse) SetBizNo(v string) *InitEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

type QueryEnterpriseidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidFaceauthRequest) SetAuthToken(v string) *QueryEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *QueryEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseidFaceauthRequest) SetBizNo(v string) *QueryEnterpriseidFaceauthRequest {
	s.BizNo = &v
	return s
}

type QueryEnterpriseidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证失败错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证失败原因信息
	FailedMessage *string `json:"failed_message,omitempty" xml:"failed_message,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidFaceauthResponse) SetReqMsgId(v string) *QueryEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetResultCode(v string) *QueryEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetResultMsg(v string) *QueryEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetBizNo(v string) *QueryEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetFailedCode(v string) *QueryEnterpriseidFaceauthResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetFailedMessage(v string) *QueryEnterpriseidFaceauthResponse {
	s.FailedMessage = &v
	return s
}

func (s *QueryEnterpriseidFaceauthResponse) SetPassed(v bool) *QueryEnterpriseidFaceauthResponse {
	s.Passed = &v
	return s
}

type QueryIndividualidInternalfourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被核验人银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryIndividualidInternalfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalfourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalfourmetaRequest) SetAuthToken(v string) *QueryIndividualidInternalfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetProductInstanceId(v string) *QueryIndividualidInternalfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetBankCardNo(v string) *QueryIndividualidInternalfourmetaRequest {
	s.BankCardNo = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetBizInfo(v *BizInfo) *QueryIndividualidInternalfourmetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetCertNo(v string) *QueryIndividualidInternalfourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetMobile(v string) *QueryIndividualidInternalfourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaRequest) SetName(v string) *QueryIndividualidInternalfourmetaRequest {
	s.Name = &v
	return s
}

type QueryIndividualidInternalfourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryIndividualidInternalfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalfourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalfourmetaResponse) SetReqMsgId(v string) *QueryIndividualidInternalfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaResponse) SetResultCode(v string) *QueryIndividualidInternalfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaResponse) SetResultMsg(v string) *QueryIndividualidInternalfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaResponse) SetAccepted(v bool) *QueryIndividualidInternalfourmetaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryIndividualidInternalfourmetaResponse) SetVerifyUrl(v string) *QueryIndividualidInternalfourmetaResponse {
	s.VerifyUrl = &v
	return s
}

type QueryIndividualidInternalthreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryIndividualidInternalthreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalthreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalthreemetaRequest) SetAuthToken(v string) *QueryIndividualidInternalthreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaRequest) SetProductInstanceId(v string) *QueryIndividualidInternalthreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaRequest) SetBizInfo(v *BizInfo) *QueryIndividualidInternalthreemetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryIndividualidInternalthreemetaRequest) SetCertNo(v string) *QueryIndividualidInternalthreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaRequest) SetMobile(v string) *QueryIndividualidInternalthreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaRequest) SetName(v string) *QueryIndividualidInternalthreemetaRequest {
	s.Name = &v
	return s
}

type QueryIndividualidInternalthreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryIndividualidInternalthreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternalthreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternalthreemetaResponse) SetReqMsgId(v string) *QueryIndividualidInternalthreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaResponse) SetResultCode(v string) *QueryIndividualidInternalthreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaResponse) SetResultMsg(v string) *QueryIndividualidInternalthreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaResponse) SetAccepted(v bool) *QueryIndividualidInternalthreemetaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryIndividualidInternalthreemetaResponse) SetVerifyUrl(v string) *QueryIndividualidInternalthreemetaResponse {
	s.VerifyUrl = &v
	return s
}

type QueryIndividualidInternaltwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryIndividualidInternaltwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternaltwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternaltwometaRequest) SetAuthToken(v string) *QueryIndividualidInternaltwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidInternaltwometaRequest) SetProductInstanceId(v string) *QueryIndividualidInternaltwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidInternaltwometaRequest) SetBizInfo(v *BizInfo) *QueryIndividualidInternaltwometaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryIndividualidInternaltwometaRequest) SetCertNo(v string) *QueryIndividualidInternaltwometaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryIndividualidInternaltwometaRequest) SetName(v string) *QueryIndividualidInternaltwometaRequest {
	s.Name = &v
	return s
}

type QueryIndividualidInternaltwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryIndividualidInternaltwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidInternaltwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidInternaltwometaResponse) SetReqMsgId(v string) *QueryIndividualidInternaltwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidInternaltwometaResponse) SetResultCode(v string) *QueryIndividualidInternaltwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidInternaltwometaResponse) SetResultMsg(v string) *QueryIndividualidInternaltwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidInternaltwometaResponse) SetAccepted(v bool) *QueryIndividualidInternaltwometaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryIndividualidInternaltwometaResponse) SetVerifyUrl(v string) *QueryIndividualidInternaltwometaResponse {
	s.VerifyUrl = &v
	return s
}

type CreateBaicorpInternalevaluationasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 内部的业务代码
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 回调参数
	CallbackParam *string `json:"callback_param,omitempty" xml:"callback_param,omitempty"`
	// 业务自定义id，便于识别返回数据对应关系
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
	// 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待评估内容类型
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
}

func (s CreateBaicorpInternalevaluationasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaicorpInternalevaluationasyncRequest) GoString() string {
	return s.String()
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetAuthToken(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetProductInstanceId(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetBizId(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.BizId = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetBizInfo(v *BizInfo) *CreateBaicorpInternalevaluationasyncRequest {
	s.BizInfo = v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetCallback(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.Callback = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetCallbackParam(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.CallbackParam = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetCustomId(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.CustomId = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetEntityData(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.EntityData = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetEntityType(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.EntityType = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncRequest) SetEntityUrl(v string) *CreateBaicorpInternalevaluationasyncRequest {
	s.EntityUrl = &v
	return s
}

type CreateBaicorpInternalevaluationasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容质量分
	ContentScore *string `json:"content_score,omitempty" xml:"content_score,omitempty"`
	// 质量分描述
	ContentScoreDesc *string `json:"content_score_desc,omitempty" xml:"content_score_desc,omitempty"`
	// 业务自定义id
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 导致重复的原因
	RepeatReason *string `json:"repeat_reason,omitempty" xml:"repeat_reason,omitempty"`
	// 是否重复
	RepeatResult *bool `json:"repeat_result,omitempty" xml:"repeat_result,omitempty"`
	// 风险识别结果
	RiskResult *string `json:"risk_result,omitempty" xml:"risk_result,omitempty"`
	// 风险识别结果描述
	RiskResultDesc *string `json:"risk_result_desc,omitempty" xml:"risk_result_desc,omitempty"`
	// 监测任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateBaicorpInternalevaluationasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaicorpInternalevaluationasyncResponse) GoString() string {
	return s.String()
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetReqMsgId(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetResultCode(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetResultMsg(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetContentScore(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.ContentScore = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetContentScoreDesc(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.ContentScoreDesc = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetCustomId(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.CustomId = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetRepeatReason(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.RepeatReason = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetRepeatResult(v bool) *CreateBaicorpInternalevaluationasyncResponse {
	s.RepeatResult = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetRiskResult(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.RiskResult = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetRiskResultDesc(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.RiskResultDesc = &v
	return s
}

func (s *CreateBaicorpInternalevaluationasyncResponse) SetTaskId(v string) *CreateBaicorpInternalevaluationasyncResponse {
	s.TaskId = &v
	return s
}

type CreateBaicorpInternalmonitorasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 用于内部业务统计的信息
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 监测传播时间，单位暂定天
	BroadcastTime *int64 `json:"broadcast_time,omitempty" xml:"broadcast_time,omitempty"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 待检测内容RAW数据
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待监测内容类型
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
	// 监测输入的多个关键词
	KeyWords []*string `json:"key_words,omitempty" xml:"key_words,omitempty" require:"true" type:"Repeated"`
	// 匹配时长，单位秒
	MatchedDuration *int64 `json:"matched_duration,omitempty" xml:"matched_duration,omitempty"`
	// 监测时长，单位为天
	MonitorDuration *int64 `json:"monitor_duration,omitempty" xml:"monitor_duration,omitempty"`
	// 监测频次，单位暂定天
	MonitorFrequency *int64 `json:"monitor_frequency,omitempty" xml:"monitor_frequency,omitempty" require:"true"`
	// 监测范围
	MonitorScope []*string `json:"monitor_scope,omitempty" xml:"monitor_scope,omitempty" type:"Repeated"`
	// 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
	NotifyUrl *string `json:"notify_url,omitempty" xml:"notify_url,omitempty"`
	// provider id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty"`
	// 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
	StartDate *int64 `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 业务方任务id，业务方保证唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateBaicorpInternalmonitorasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaicorpInternalmonitorasyncRequest) GoString() string {
	return s.String()
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetAuthToken(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetProductInstanceId(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetBizId(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.BizId = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetBizInfo(v *BizInfo) *CreateBaicorpInternalmonitorasyncRequest {
	s.BizInfo = v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetBroadcastTime(v int64) *CreateBaicorpInternalmonitorasyncRequest {
	s.BroadcastTime = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetCustomId(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.CustomId = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetEntityData(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.EntityData = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetEntityType(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.EntityType = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetEntityUrl(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.EntityUrl = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetKeyWords(v []*string) *CreateBaicorpInternalmonitorasyncRequest {
	s.KeyWords = v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetMatchedDuration(v int64) *CreateBaicorpInternalmonitorasyncRequest {
	s.MatchedDuration = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetMonitorDuration(v int64) *CreateBaicorpInternalmonitorasyncRequest {
	s.MonitorDuration = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetMonitorFrequency(v int64) *CreateBaicorpInternalmonitorasyncRequest {
	s.MonitorFrequency = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetMonitorScope(v []*string) *CreateBaicorpInternalmonitorasyncRequest {
	s.MonitorScope = v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetNotifyUrl(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.NotifyUrl = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetProviderId(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.ProviderId = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetStartDate(v int64) *CreateBaicorpInternalmonitorasyncRequest {
	s.StartDate = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncRequest) SetTaskId(v string) *CreateBaicorpInternalmonitorasyncRequest {
	s.TaskId = &v
	return s
}

type CreateBaicorpInternalmonitorasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测时长，单位为天
	MonitorDuration *int64 `json:"monitor_duration,omitempty" xml:"monitor_duration,omitempty"`
	// 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
	StartDate *int64 `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 业务方任务id，业务方保证唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateBaicorpInternalmonitorasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaicorpInternalmonitorasyncResponse) GoString() string {
	return s.String()
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetReqMsgId(v string) *CreateBaicorpInternalmonitorasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetResultCode(v string) *CreateBaicorpInternalmonitorasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetResultMsg(v string) *CreateBaicorpInternalmonitorasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetMonitorDuration(v int64) *CreateBaicorpInternalmonitorasyncResponse {
	s.MonitorDuration = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetStartDate(v int64) *CreateBaicorpInternalmonitorasyncResponse {
	s.StartDate = &v
	return s
}

func (s *CreateBaicorpInternalmonitorasyncResponse) SetTaskId(v string) *CreateBaicorpInternalmonitorasyncResponse {
	s.TaskId = &v
	return s
}

type QueryBaicorpInternalevaluationasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// bizinfo
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
	// 监测任务Id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryBaicorpInternalevaluationasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalevaluationasyncRequest) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetAuthToken(v string) *QueryBaicorpInternalevaluationasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetProductInstanceId(v string) *QueryBaicorpInternalevaluationasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetBizId(v string) *QueryBaicorpInternalevaluationasyncRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetBizInfo(v *BizInfo) *QueryBaicorpInternalevaluationasyncRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetCustomId(v string) *QueryBaicorpInternalevaluationasyncRequest {
	s.CustomId = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncRequest) SetTaskId(v string) *QueryBaicorpInternalevaluationasyncRequest {
	s.TaskId = &v
	return s
}

type QueryBaicorpInternalevaluationasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务自定义id
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 风险识别结果
	RiskResult *string `json:"risk_result,omitempty" xml:"risk_result,omitempty"`
	// 风险识别结果描述
	RiskResultDesc *string `json:"risk_result_desc,omitempty" xml:"risk_result_desc,omitempty"`
	// 监测任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryBaicorpInternalevaluationasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalevaluationasyncResponse) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetReqMsgId(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetResultCode(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetResultMsg(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetCustomId(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.CustomId = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetRiskResult(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.RiskResult = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetRiskResultDesc(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.RiskResultDesc = &v
	return s
}

func (s *QueryBaicorpInternalevaluationasyncResponse) SetTaskId(v string) *QueryBaicorpInternalevaluationasyncResponse {
	s.TaskId = &v
	return s
}

type QueryBaicorpInternalmonitorasyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 业务方任务id，业务方保证唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryBaicorpInternalmonitorasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalmonitorasyncRequest) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalmonitorasyncRequest) SetAuthToken(v string) *QueryBaicorpInternalmonitorasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncRequest) SetProductInstanceId(v string) *QueryBaicorpInternalmonitorasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncRequest) SetBizId(v string) *QueryBaicorpInternalmonitorasyncRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncRequest) SetTaskId(v string) *QueryBaicorpInternalmonitorasyncRequest {
	s.TaskId = &v
	return s
}

type QueryBaicorpInternalmonitorasyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据
	Data []*AntiPiracyResultObject `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 如果字段status == "failed"，该字段保存相关错误信息
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty"`
	// success 数据入库成功，后续处于被检测状态；
	// continue 数据处于被检测状态，data 字段包含监测结果
	// failed 任务失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryBaicorpInternalmonitorasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalmonitorasyncResponse) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetReqMsgId(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetResultCode(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetResultMsg(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetData(v []*AntiPiracyResultObject) *QueryBaicorpInternalmonitorasyncResponse {
	s.Data = v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetErrMsg(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.ErrMsg = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetStatus(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.Status = &v
	return s
}

func (s *QueryBaicorpInternalmonitorasyncResponse) SetTaskId(v string) *QueryBaicorpInternalmonitorasyncResponse {
	s.TaskId = &v
	return s
}

type CertifyEnterpriseidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证完成后回跳地址
	//
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseidFaceauthRequest) SetAuthToken(v string) *CertifyEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *CertifyEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthRequest) SetBizNo(v string) *CertifyEnterpriseidFaceauthRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthRequest) SetCallbackUrl(v string) *CertifyEnterpriseidFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthRequest) SetRedirectUrl(v string) *CertifyEnterpriseidFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyEnterpriseidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	//
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证url
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseidFaceauthResponse) SetReqMsgId(v string) *CertifyEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthResponse) SetResultCode(v string) *CertifyEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthResponse) SetResultMsg(v string) *CertifyEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthResponse) SetBizNo(v string) *CertifyEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthResponse) SetVerifyUrl(v string) *CertifyEnterpriseidFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type InitIndividualidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证
	// 默认为FACE
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
}

func (s InitIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitIndividualidFaceauthRequest) SetAuthToken(v string) *InitIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIndividualidFaceauthRequest) SetProductInstanceId(v string) *InitIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIndividualidFaceauthRequest) SetCertName(v string) *InitIndividualidFaceauthRequest {
	s.CertName = &v
	return s
}

func (s *InitIndividualidFaceauthRequest) SetCertNo(v string) *InitIndividualidFaceauthRequest {
	s.CertNo = &v
	return s
}

func (s *InitIndividualidFaceauthRequest) SetBizCode(v string) *InitIndividualidFaceauthRequest {
	s.BizCode = &v
	return s
}

type InitIndividualidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitIndividualidFaceauthResponse) SetReqMsgId(v string) *InitIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIndividualidFaceauthResponse) SetResultCode(v string) *InitIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIndividualidFaceauthResponse) SetResultMsg(v string) *InitIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIndividualidFaceauthResponse) SetCertifyId(v string) *InitIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

type CertifyIndividualidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 认证完成后回跳地址
	//
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyIndividualidFaceauthRequest) SetAuthToken(v string) *CertifyIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyIndividualidFaceauthRequest) SetProductInstanceId(v string) *CertifyIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyIndividualidFaceauthRequest) SetCallbackUrl(v string) *CertifyIndividualidFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyIndividualidFaceauthRequest) SetCertifyId(v string) *CertifyIndividualidFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyIndividualidFaceauthRequest) SetRedirectUrl(v string) *CertifyIndividualidFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyIndividualidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyIndividualidFaceauthResponse) SetReqMsgId(v string) *CertifyIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyIndividualidFaceauthResponse) SetResultCode(v string) *CertifyIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyIndividualidFaceauthResponse) SetResultMsg(v string) *CertifyIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyIndividualidFaceauthResponse) SetCertifyId(v string) *CertifyIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyIndividualidFaceauthResponse) SetVerifyUrl(v string) *CertifyIndividualidFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type QueryIndividualidFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
}

func (s QueryIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidFaceauthRequest) SetAuthToken(v string) *QueryIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidFaceauthRequest) SetProductInstanceId(v string) *QueryIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidFaceauthRequest) SetCertifyId(v string) *QueryIndividualidFaceauthRequest {
	s.CertifyId = &v
	return s
}

type QueryIndividualidFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	//
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 用户是否完成刷脸
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty"`
}

func (s QueryIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidFaceauthResponse) SetReqMsgId(v string) *QueryIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidFaceauthResponse) SetResultCode(v string) *QueryIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidFaceauthResponse) SetResultMsg(v string) *QueryIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidFaceauthResponse) SetCertifyId(v string) *QueryIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryIndividualidFaceauthResponse) SetPassed(v bool) *QueryIndividualidFaceauthResponse {
	s.Passed = &v
	return s
}

func (s *QueryIndividualidFaceauthResponse) SetFinished(v bool) *QueryIndividualidFaceauthResponse {
	s.Finished = &v
	return s
}

type GetDataserviceBlockchainheightRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链的唯一性标示
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
}

func (s GetDataserviceBlockchainheightRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceBlockchainheightRequest) GoString() string {
	return s.String()
}

func (s *GetDataserviceBlockchainheightRequest) SetAuthToken(v string) *GetDataserviceBlockchainheightRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDataserviceBlockchainheightRequest) SetProductInstanceId(v string) *GetDataserviceBlockchainheightRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDataserviceBlockchainheightRequest) SetBizid(v string) *GetDataserviceBlockchainheightRequest {
	s.Bizid = &v
	return s
}

type GetDataserviceBlockchainheightResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链块高
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetDataserviceBlockchainheightResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceBlockchainheightResponse) GoString() string {
	return s.String()
}

func (s *GetDataserviceBlockchainheightResponse) SetReqMsgId(v string) *GetDataserviceBlockchainheightResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDataserviceBlockchainheightResponse) SetResultCode(v string) *GetDataserviceBlockchainheightResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDataserviceBlockchainheightResponse) SetResultMsg(v string) *GetDataserviceBlockchainheightResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDataserviceBlockchainheightResponse) SetData(v int64) *GetDataserviceBlockchainheightResponse {
	s.Data = &v
	return s
}

type GetDataserviceTransactioncountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链唯一性标示
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
}

func (s GetDataserviceTransactioncountRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceTransactioncountRequest) GoString() string {
	return s.String()
}

func (s *GetDataserviceTransactioncountRequest) SetAuthToken(v string) *GetDataserviceTransactioncountRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDataserviceTransactioncountRequest) SetProductInstanceId(v string) *GetDataserviceTransactioncountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDataserviceTransactioncountRequest) SetBizid(v string) *GetDataserviceTransactioncountRequest {
	s.Bizid = &v
	return s
}

type GetDataserviceTransactioncountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易总数
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetDataserviceTransactioncountResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceTransactioncountResponse) GoString() string {
	return s.String()
}

func (s *GetDataserviceTransactioncountResponse) SetReqMsgId(v string) *GetDataserviceTransactioncountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDataserviceTransactioncountResponse) SetResultCode(v string) *GetDataserviceTransactioncountResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDataserviceTransactioncountResponse) SetResultMsg(v string) *GetDataserviceTransactioncountResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDataserviceTransactioncountResponse) SetData(v int64) *GetDataserviceTransactioncountResponse {
	s.Data = &v
	return s
}

type GetDataserviceTransactioninfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链唯一性标识
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
}

func (s GetDataserviceTransactioninfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceTransactioninfoRequest) GoString() string {
	return s.String()
}

func (s *GetDataserviceTransactioninfoRequest) SetAuthToken(v string) *GetDataserviceTransactioninfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDataserviceTransactioninfoRequest) SetProductInstanceId(v string) *GetDataserviceTransactioninfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDataserviceTransactioninfoRequest) SetBizid(v string) *GetDataserviceTransactioninfoRequest {
	s.Bizid = &v
	return s
}

func (s *GetDataserviceTransactioninfoRequest) SetHash(v string) *GetDataserviceTransactioninfoRequest {
	s.Hash = &v
	return s
}

type GetDataserviceTransactioninfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链唯一性标识
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// category
	Category *int64 `json:"category,omitempty" xml:"category,omitempty"`
	// 交易发起时间
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 交易发起方哈希
	FromHash *string `json:"from_hash,omitempty" xml:"from_hash,omitempty"`
	// 交易哈希
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
	// 块高
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 交易接收方哈希
	ToHash *string `json:"to_hash,omitempty" xml:"to_hash,omitempty"`
	// 交易类型
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
}

func (s GetDataserviceTransactioninfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDataserviceTransactioninfoResponse) GoString() string {
	return s.String()
}

func (s *GetDataserviceTransactioninfoResponse) SetReqMsgId(v string) *GetDataserviceTransactioninfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetResultCode(v string) *GetDataserviceTransactioninfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetResultMsg(v string) *GetDataserviceTransactioninfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetBizid(v string) *GetDataserviceTransactioninfoResponse {
	s.Bizid = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetCategory(v int64) *GetDataserviceTransactioninfoResponse {
	s.Category = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetCreateTime(v int64) *GetDataserviceTransactioninfoResponse {
	s.CreateTime = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetFromHash(v string) *GetDataserviceTransactioninfoResponse {
	s.FromHash = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetHash(v string) *GetDataserviceTransactioninfoResponse {
	s.Hash = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetHeight(v int64) *GetDataserviceTransactioninfoResponse {
	s.Height = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetToHash(v string) *GetDataserviceTransactioninfoResponse {
	s.ToHash = &v
	return s
}

func (s *GetDataserviceTransactioninfoResponse) SetType(v int64) *GetDataserviceTransactioninfoResponse {
	s.Type = &v
	return s
}

type ListDataserviceLastblocksRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链唯一性标识
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 区块个数
	Size *int64 `json:"size,omitempty" xml:"size,omitempty" require:"true"`
}

func (s ListDataserviceLastblocksRequest) String() string {
	return tea.Prettify(s)
}

func (s ListDataserviceLastblocksRequest) GoString() string {
	return s.String()
}

func (s *ListDataserviceLastblocksRequest) SetAuthToken(v string) *ListDataserviceLastblocksRequest {
	s.AuthToken = &v
	return s
}

func (s *ListDataserviceLastblocksRequest) SetProductInstanceId(v string) *ListDataserviceLastblocksRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListDataserviceLastblocksRequest) SetBizid(v string) *ListDataserviceLastblocksRequest {
	s.Bizid = &v
	return s
}

func (s *ListDataserviceLastblocksRequest) SetSize(v int64) *ListDataserviceLastblocksRequest {
	s.Size = &v
	return s
}

type ListDataserviceLastblocksResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块信息
	LastBlockList []*BlockInfo `json:"last_block_list,omitempty" xml:"last_block_list,omitempty" type:"Repeated"`
}

func (s ListDataserviceLastblocksResponse) String() string {
	return tea.Prettify(s)
}

func (s ListDataserviceLastblocksResponse) GoString() string {
	return s.String()
}

func (s *ListDataserviceLastblocksResponse) SetReqMsgId(v string) *ListDataserviceLastblocksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListDataserviceLastblocksResponse) SetResultCode(v string) *ListDataserviceLastblocksResponse {
	s.ResultCode = &v
	return s
}

func (s *ListDataserviceLastblocksResponse) SetResultMsg(v string) *ListDataserviceLastblocksResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListDataserviceLastblocksResponse) SetLastBlockList(v []*BlockInfo) *ListDataserviceLastblocksResponse {
	s.LastBlockList = v
	return s
}

type GetTasAttestationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 摘要算法默认，（sha256或者sm3 默认sm3）
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
	CertReq *bool `json:"cert_req,omitempty" xml:"cert_req,omitempty"`
	// 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
	Compress *bool `json:"compress,omitempty" xml:"compress,omitempty"`
	// 事物hash(支持sha256或sm3摘要算法),长度64个字符。
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty" require:"true"`
}

func (s GetTasAttestationRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTasAttestationRequest) GoString() string {
	return s.String()
}

func (s *GetTasAttestationRequest) SetAuthToken(v string) *GetTasAttestationRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTasAttestationRequest) SetProductInstanceId(v string) *GetTasAttestationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTasAttestationRequest) SetAlgorithm(v string) *GetTasAttestationRequest {
	s.Algorithm = &v
	return s
}

func (s *GetTasAttestationRequest) SetCertReq(v bool) *GetTasAttestationRequest {
	s.CertReq = &v
	return s
}

func (s *GetTasAttestationRequest) SetCompress(v bool) *GetTasAttestationRequest {
	s.Compress = &v
	return s
}

func (s *GetTasAttestationRequest) SetRid(v string) *GetTasAttestationRequest {
	s.Rid = &v
	return s
}

type GetTasAttestationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
}

func (s GetTasAttestationResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTasAttestationResponse) GoString() string {
	return s.String()
}

func (s *GetTasAttestationResponse) SetReqMsgId(v string) *GetTasAttestationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTasAttestationResponse) SetResultCode(v string) *GetTasAttestationResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTasAttestationResponse) SetResultMsg(v string) *GetTasAttestationResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTasAttestationResponse) SetCtsr(v string) *GetTasAttestationResponse {
	s.Ctsr = &v
	return s
}

func (s *GetTasAttestationResponse) SetSn(v string) *GetTasAttestationResponse {
	s.Sn = &v
	return s
}

func (s *GetTasAttestationResponse) SetTs(v string) *GetTasAttestationResponse {
	s.Ts = &v
	return s
}

type VerifyTasCtsrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间凭证接口返回的ctsr参数
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty" require:"true"`
}

func (s VerifyTasCtsrRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyTasCtsrRequest) GoString() string {
	return s.String()
}

func (s *VerifyTasCtsrRequest) SetAuthToken(v string) *VerifyTasCtsrRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyTasCtsrRequest) SetProductInstanceId(v string) *VerifyTasCtsrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyTasCtsrRequest) SetCtsr(v string) *VerifyTasCtsrRequest {
	s.Ctsr = &v
	return s
}

type VerifyTasCtsrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 应用名
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// 公司名
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 事务步骤的描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 请求时间凭证时传入的事物hash
	HashValue *string `json:"hash_value,omitempty" xml:"hash_value,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
}

func (s VerifyTasCtsrResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyTasCtsrResponse) GoString() string {
	return s.String()
}

func (s *VerifyTasCtsrResponse) SetReqMsgId(v string) *VerifyTasCtsrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetResultCode(v string) *VerifyTasCtsrResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetResultMsg(v string) *VerifyTasCtsrResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetAppName(v string) *VerifyTasCtsrResponse {
	s.AppName = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetCompanyName(v string) *VerifyTasCtsrResponse {
	s.CompanyName = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetDesc(v string) *VerifyTasCtsrResponse {
	s.Desc = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetHashValue(v string) *VerifyTasCtsrResponse {
	s.HashValue = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetSn(v string) *VerifyTasCtsrResponse {
	s.Sn = &v
	return s
}

func (s *VerifyTasCtsrResponse) SetTs(v string) *VerifyTasCtsrResponse {
	s.Ts = &v
	return s
}

type GetTasCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty" require:"true"`
}

func (s GetTasCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTasCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetTasCertificateRequest) SetAuthToken(v string) *GetTasCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTasCertificateRequest) SetProductInstanceId(v string) *GetTasCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTasCertificateRequest) SetSn(v string) *GetTasCertificateRequest {
	s.Sn = &v
	return s
}

type GetTasCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下载pdf格式证书的临时url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetTasCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTasCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetTasCertificateResponse) SetReqMsgId(v string) *GetTasCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTasCertificateResponse) SetResultCode(v string) *GetTasCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTasCertificateResponse) SetResultMsg(v string) *GetTasCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTasCertificateResponse) SetUrl(v string) *GetTasCertificateResponse {
	s.Url = &v
	return s
}

type GetTasTransactionattestationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 事物hash(支持sha256或sm3摘要算法)
	// 长度64个字符。
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty" require:"true"`
	// 摘要算法默认，（sha256或者sm3 默认sm3）
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
	Compress *bool `json:"compress,omitempty" xml:"compress,omitempty"`
	// tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
	CertReq *bool `json:"cert_req,omitempty" xml:"cert_req,omitempty"`
	// 事务id，允许大小写数字且小于十位的字符串
	TransId *string `json:"trans_id,omitempty" xml:"trans_id,omitempty" require:"true"`
	// 对事务的描述，长度小于20位
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s GetTasTransactionattestationRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTasTransactionattestationRequest) GoString() string {
	return s.String()
}

func (s *GetTasTransactionattestationRequest) SetAuthToken(v string) *GetTasTransactionattestationRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetProductInstanceId(v string) *GetTasTransactionattestationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetRid(v string) *GetTasTransactionattestationRequest {
	s.Rid = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetAlgorithm(v string) *GetTasTransactionattestationRequest {
	s.Algorithm = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetCompress(v bool) *GetTasTransactionattestationRequest {
	s.Compress = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetCertReq(v bool) *GetTasTransactionattestationRequest {
	s.CertReq = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetTransId(v string) *GetTasTransactionattestationRequest {
	s.TransId = &v
	return s
}

func (s *GetTasTransactionattestationRequest) SetDesc(v string) *GetTasTransactionattestationRequest {
	s.Desc = &v
	return s
}

type GetTasTransactionattestationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
	// 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
}

func (s GetTasTransactionattestationResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTasTransactionattestationResponse) GoString() string {
	return s.String()
}

func (s *GetTasTransactionattestationResponse) SetReqMsgId(v string) *GetTasTransactionattestationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTasTransactionattestationResponse) SetResultCode(v string) *GetTasTransactionattestationResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTasTransactionattestationResponse) SetResultMsg(v string) *GetTasTransactionattestationResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTasTransactionattestationResponse) SetSn(v string) *GetTasTransactionattestationResponse {
	s.Sn = &v
	return s
}

func (s *GetTasTransactionattestationResponse) SetCtsr(v string) *GetTasTransactionattestationResponse {
	s.Ctsr = &v
	return s
}

func (s *GetTasTransactionattestationResponse) SetTs(v string) *GetTasTransactionattestationResponse {
	s.Ts = &v
	return s
}

type QueryEverifyFourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 某某有限公司
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
}

func (s QueryEverifyFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyFourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyFourmetaRequest) SetAuthToken(v string) *QueryEverifyFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyFourmetaRequest) SetProductInstanceId(v string) *QueryEverifyFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyFourmetaRequest) SetEpCertName(v string) *QueryEverifyFourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyFourmetaRequest) SetEpCertNo(v string) *QueryEverifyFourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEverifyFourmetaRequest) SetLegalPersonCertName(v string) *QueryEverifyFourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryEverifyFourmetaRequest) SetLegalPersonCertNo(v string) *QueryEverifyFourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type QueryEverifyFourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功
	// 1:企业信息有误
	// 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 企业经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEverifyFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyFourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyFourmetaResponse) SetReqMsgId(v string) *QueryEverifyFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetResultCode(v string) *QueryEverifyFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetResultMsg(v string) *QueryEverifyFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetCode(v string) *QueryEverifyFourmetaResponse {
	s.Code = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetEnterpriseStatus(v string) *QueryEverifyFourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetOpenTime(v string) *QueryEverifyFourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyFourmetaResponse) SetPassed(v bool) *QueryEverifyFourmetaResponse {
	s.Passed = &v
	return s
}

type QueryEverifyThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
}

func (s QueryEverifyThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyThreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyThreemetaRequest) SetAuthToken(v string) *QueryEverifyThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyThreemetaRequest) SetProductInstanceId(v string) *QueryEverifyThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyThreemetaRequest) SetEpCertName(v string) *QueryEverifyThreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyThreemetaRequest) SetEpCertNo(v string) *QueryEverifyThreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEverifyThreemetaRequest) SetLegalPersonCertName(v string) *QueryEverifyThreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type QueryEverifyThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功
	// 1:企业信息有误
	// 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEverifyThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyThreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyThreemetaResponse) SetReqMsgId(v string) *QueryEverifyThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetResultCode(v string) *QueryEverifyThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetResultMsg(v string) *QueryEverifyThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetCode(v string) *QueryEverifyThreemetaResponse {
	s.Code = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetEnterpriseStatus(v string) *QueryEverifyThreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetOpenTime(v string) *QueryEverifyThreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyThreemetaResponse) SetPassed(v bool) *QueryEverifyThreemetaResponse {
	s.Passed = &v
	return s
}

type QueryEverifyTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
}

func (s QueryEverifyTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyTwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyTwometaRequest) SetAuthToken(v string) *QueryEverifyTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyTwometaRequest) SetProductInstanceId(v string) *QueryEverifyTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyTwometaRequest) SetEpCertName(v string) *QueryEverifyTwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyTwometaRequest) SetEpCertNo(v string) *QueryEverifyTwometaRequest {
	s.EpCertNo = &v
	return s
}

type QueryEverifyTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 0:核验成功
	// 1:企业信息有误
	// 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s QueryEverifyTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyTwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyTwometaResponse) SetReqMsgId(v string) *QueryEverifyTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetResultCode(v string) *QueryEverifyTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetResultMsg(v string) *QueryEverifyTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetEnterpriseStatus(v string) *QueryEverifyTwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetOpenTime(v string) *QueryEverifyTwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetPassed(v bool) *QueryEverifyTwometaResponse {
	s.Passed = &v
	return s
}

func (s *QueryEverifyTwometaResponse) SetCode(v string) *QueryEverifyTwometaResponse {
	s.Code = &v
	return s
}

type QueryBaicorpInternalsearchlibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账户ID，账户粒度ID。
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 商户ID，即平台用户ID。
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	//  内容ID
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
	// 待检测内容的raw data，这期暂不使用
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
	EntityDesc *string `json:"entity_desc,omitempty" xml:"entity_desc,omitempty"`
	// 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 1、待检测内容oss url（后续可以扩展为非oss的文件url）
	// 2、假如使用AK访问，此处填写fileid。
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty" require:"true"`
	// 时间戳
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
}

func (s QueryBaicorpInternalsearchlibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalsearchlibraryRequest) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetAuthToken(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetProductInstanceId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetAccountId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.AccountId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetBizId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetCompanyId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetContentId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.ContentId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetCustomId(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.CustomId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetEntityData(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.EntityData = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetEntityDesc(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.EntityDesc = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetEntityType(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.EntityType = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetEntityUrl(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.EntityUrl = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryRequest) SetTimestamp(v string) *QueryBaicorpInternalsearchlibraryRequest {
	s.Timestamp = &v
	return s
}

type QueryBaicorpInternalsearchlibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NoucelId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 采用的模型以及版本说明
	ModelInfo *string `json:"model_info,omitempty" xml:"model_info,omitempty"`
	// 重复列表，json list格式
	RepeatInfo *string `json:"repeat_info,omitempty" xml:"repeat_info,omitempty"`
	// 相似度信息列表，json list格式
	SimilarityInfo *string `json:"similarity_info,omitempty" xml:"similarity_info,omitempty"`
}

func (s QueryBaicorpInternalsearchlibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaicorpInternalsearchlibraryResponse) GoString() string {
	return s.String()
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetReqMsgId(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetResultCode(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetResultMsg(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetCustomId(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.CustomId = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetModelInfo(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.ModelInfo = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetRepeatInfo(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.RepeatInfo = &v
	return s
}

func (s *QueryBaicorpInternalsearchlibraryResponse) SetSimilarityInfo(v string) *QueryBaicorpInternalsearchlibraryResponse {
	s.SimilarityInfo = &v
	return s
}

type UpdateBaicorpInternalsearchlibraryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 账户ID，账户粒度ID。
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 产品ID，[BANQUAN, PAIPAI]
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 商户ID，即平台用户ID。
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 内容ID
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	//
	// 基于安全考虑，填充NonceId。
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
	// 待检测内容的raw data，这期暂不使用
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty" require:"true"`
	// 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串。
	EntityDesc *string `json:"entity_desc,omitempty" xml:"entity_desc,omitempty" require:"true"`
	// 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty" require:"true"`
	// 1.待检测内容oss url（后续可以扩展为非oss的文件url）。
	// 2.假如使用AK访问，此处填写fileid。
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty" require:"true"`
}

func (s UpdateBaicorpInternalsearchlibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaicorpInternalsearchlibraryRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetAuthToken(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetProductInstanceId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetAccountId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.AccountId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetBizId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.BizId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetCompanyId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.CompanyId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetContentId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.ContentId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetCustomId(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.CustomId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetEntityData(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.EntityData = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetEntityDesc(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.EntityDesc = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetEntityType(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.EntityType = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryRequest) SetEntityUrl(v string) *UpdateBaicorpInternalsearchlibraryRequest {
	s.EntityUrl = &v
	return s
}

type UpdateBaicorpInternalsearchlibraryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NounceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 更新是否成功
	UpdateResult *string `json:"update_result,omitempty" xml:"update_result,omitempty"`
	// 更新描述、更新失败原因
	UpdateDesc *string `json:"update_desc,omitempty" xml:"update_desc,omitempty"`
}

func (s UpdateBaicorpInternalsearchlibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaicorpInternalsearchlibraryResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetReqMsgId(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetResultCode(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetResultMsg(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetCustomId(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.CustomId = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetUpdateResult(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.UpdateResult = &v
	return s
}

func (s *UpdateBaicorpInternalsearchlibraryResponse) SetUpdateDesc(v string) *UpdateBaicorpInternalsearchlibraryResponse {
	s.UpdateDesc = &v
	return s
}

type QueryEpayauthRootbankRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支持全称，或部分名称 如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" require:"true"`
}

func (s QueryEpayauthRootbankRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthRootbankRequest) GoString() string {
	return s.String()
}

func (s *QueryEpayauthRootbankRequest) SetAuthToken(v string) *QueryEpayauthRootbankRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEpayauthRootbankRequest) SetProductInstanceId(v string) *QueryEpayauthRootbankRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEpayauthRootbankRequest) SetBankName(v string) *QueryEpayauthRootbankRequest {
	s.BankName = &v
	return s
}

type QueryEpayauthRootbankResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行列表
	BankDetails []*Institution `json:"bank_details,omitempty" xml:"bank_details,omitempty" type:"Repeated"`
}

func (s QueryEpayauthRootbankResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthRootbankResponse) GoString() string {
	return s.String()
}

func (s *QueryEpayauthRootbankResponse) SetReqMsgId(v string) *QueryEpayauthRootbankResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEpayauthRootbankResponse) SetResultCode(v string) *QueryEpayauthRootbankResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEpayauthRootbankResponse) SetResultMsg(v string) *QueryEpayauthRootbankResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEpayauthRootbankResponse) SetBankDetails(v []*Institution) *QueryEpayauthRootbankResponse {
	s.BankDetails = v
	return s
}

type QueryYdapplyprotEcapplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s QueryYdapplyprotEcapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdapplyprotEcapplyRequest) GoString() string {
	return s.String()
}

func (s *QueryYdapplyprotEcapplyRequest) SetAuthToken(v string) *QueryYdapplyprotEcapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdapplyprotEcapplyRequest) SetProductInstanceId(v string) *QueryYdapplyprotEcapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdapplyprotEcapplyRequest) SetCertNo(v string) *QueryYdapplyprotEcapplyRequest {
	s.CertNo = &v
	return s
}

func (s *QueryYdapplyprotEcapplyRequest) SetMobile(v string) *QueryYdapplyprotEcapplyRequest {
	s.Mobile = &v
	return s
}

func (s *QueryYdapplyprotEcapplyRequest) SetUserName(v string) *QueryYdapplyprotEcapplyRequest {
	s.UserName = &v
	return s
}

type QueryYdapplyprotEcapplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdapplyprotEcapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdapplyprotEcapplyResponse) GoString() string {
	return s.String()
}

func (s *QueryYdapplyprotEcapplyResponse) SetReqMsgId(v string) *QueryYdapplyprotEcapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetResultCode(v string) *QueryYdapplyprotEcapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetResultMsg(v string) *QueryYdapplyprotEcapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetPassed(v bool) *QueryYdapplyprotEcapplyResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetScore(v string) *QueryYdapplyprotEcapplyResponse {
	s.Score = &v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetStrategies(v []*string) *QueryYdapplyprotEcapplyResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdapplyprotEcapplyResponse) SetDecision(v string) *QueryYdapplyprotEcapplyResponse {
	s.Decision = &v
	return s
}

type QueryYdpacprotEcpacRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
}

func (s QueryYdpacprotEcpacRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdpacprotEcpacRequest) GoString() string {
	return s.String()
}

func (s *QueryYdpacprotEcpacRequest) SetAuthToken(v string) *QueryYdpacprotEcpacRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdpacprotEcpacRequest) SetProductInstanceId(v string) *QueryYdpacprotEcpacRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdpacprotEcpacRequest) SetMobile(v string) *QueryYdpacprotEcpacRequest {
	s.Mobile = &v
	return s
}

type QueryYdpacprotEcpacResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdpacprotEcpacResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdpacprotEcpacResponse) GoString() string {
	return s.String()
}

func (s *QueryYdpacprotEcpacResponse) SetReqMsgId(v string) *QueryYdpacprotEcpacResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetResultCode(v string) *QueryYdpacprotEcpacResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetResultMsg(v string) *QueryYdpacprotEcpacResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetPassed(v bool) *QueryYdpacprotEcpacResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetScore(v string) *QueryYdpacprotEcpacResponse {
	s.Score = &v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetStrategies(v []*string) *QueryYdpacprotEcpacResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdpacprotEcpacResponse) SetDecision(v string) *QueryYdpacprotEcpacResponse {
	s.Decision = &v
	return s
}

type QueryYdauthprotTwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验用户的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s QueryYdauthprotTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotTwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotTwometaRequest) SetAuthToken(v string) *QueryYdauthprotTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdauthprotTwometaRequest) SetProductInstanceId(v string) *QueryYdauthprotTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdauthprotTwometaRequest) SetCertNo(v string) *QueryYdauthprotTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryYdauthprotTwometaRequest) SetUserName(v string) *QueryYdauthprotTwometaRequest {
	s.UserName = &v
	return s
}

type QueryYdauthprotTwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdauthprotTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotTwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotTwometaResponse) SetReqMsgId(v string) *QueryYdauthprotTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetResultCode(v string) *QueryYdauthprotTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetResultMsg(v string) *QueryYdauthprotTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetPassed(v bool) *QueryYdauthprotTwometaResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetScore(v string) *QueryYdauthprotTwometaResponse {
	s.Score = &v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetStrategies(v []*string) *QueryYdauthprotTwometaResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdauthprotTwometaResponse) SetDecision(v string) *QueryYdauthprotTwometaResponse {
	s.Decision = &v
	return s
}

type QueryYdauthprotThreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验用户的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 被核验用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s QueryYdauthprotThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotThreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotThreemetaRequest) SetAuthToken(v string) *QueryYdauthprotThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdauthprotThreemetaRequest) SetProductInstanceId(v string) *QueryYdauthprotThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdauthprotThreemetaRequest) SetCertNo(v string) *QueryYdauthprotThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryYdauthprotThreemetaRequest) SetMobile(v string) *QueryYdauthprotThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryYdauthprotThreemetaRequest) SetUserName(v string) *QueryYdauthprotThreemetaRequest {
	s.UserName = &v
	return s
}

type QueryYdauthprotThreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdauthprotThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotThreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotThreemetaResponse) SetReqMsgId(v string) *QueryYdauthprotThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetResultCode(v string) *QueryYdauthprotThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetResultMsg(v string) *QueryYdauthprotThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetPassed(v bool) *QueryYdauthprotThreemetaResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetScore(v string) *QueryYdauthprotThreemetaResponse {
	s.Score = &v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetStrategies(v []*string) *QueryYdauthprotThreemetaResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdauthprotThreemetaResponse) SetDecision(v string) *QueryYdauthprotThreemetaResponse {
	s.Decision = &v
	return s
}

type QueryYdauthprotFourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被核验用户的银行卡号
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 被核验用户的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 被核验用户的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
}

func (s QueryYdauthprotFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotFourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotFourmetaRequest) SetAuthToken(v string) *QueryYdauthprotFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdauthprotFourmetaRequest) SetProductInstanceId(v string) *QueryYdauthprotFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdauthprotFourmetaRequest) SetCardNo(v string) *QueryYdauthprotFourmetaRequest {
	s.CardNo = &v
	return s
}

func (s *QueryYdauthprotFourmetaRequest) SetCertNo(v string) *QueryYdauthprotFourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryYdauthprotFourmetaRequest) SetMobile(v string) *QueryYdauthprotFourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryYdauthprotFourmetaRequest) SetUserName(v string) *QueryYdauthprotFourmetaRequest {
	s.UserName = &v
	return s
}

type QueryYdauthprotFourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdauthprotFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdauthprotFourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryYdauthprotFourmetaResponse) SetReqMsgId(v string) *QueryYdauthprotFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetResultCode(v string) *QueryYdauthprotFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetResultMsg(v string) *QueryYdauthprotFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetPassed(v bool) *QueryYdauthprotFourmetaResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetScore(v string) *QueryYdauthprotFourmetaResponse {
	s.Score = &v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetStrategies(v []*string) *QueryYdauthprotFourmetaResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdauthprotFourmetaResponse) SetDecision(v string) *QueryYdauthprotFourmetaResponse {
	s.Decision = &v
	return s
}

type QueryYdmktprotEcmarketcampaignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
}

func (s QueryYdmktprotEcmarketcampaignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdmktprotEcmarketcampaignRequest) GoString() string {
	return s.String()
}

func (s *QueryYdmktprotEcmarketcampaignRequest) SetAuthToken(v string) *QueryYdmktprotEcmarketcampaignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignRequest) SetProductInstanceId(v string) *QueryYdmktprotEcmarketcampaignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignRequest) SetMobile(v string) *QueryYdmktprotEcmarketcampaignRequest {
	s.Mobile = &v
	return s
}

type QueryYdmktprotEcmarketcampaignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdmktprotEcmarketcampaignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdmktprotEcmarketcampaignResponse) GoString() string {
	return s.String()
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetReqMsgId(v string) *QueryYdmktprotEcmarketcampaignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetResultCode(v string) *QueryYdmktprotEcmarketcampaignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetResultMsg(v string) *QueryYdmktprotEcmarketcampaignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetPassed(v bool) *QueryYdmktprotEcmarketcampaignResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetScore(v string) *QueryYdmktprotEcmarketcampaignResponse {
	s.Score = &v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetStrategies(v []*string) *QueryYdmktprotEcmarketcampaignResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdmktprotEcmarketcampaignResponse) SetDecision(v string) *QueryYdmktprotEcmarketcampaignResponse {
	s.Decision = &v
	return s
}

type QueryYdregprotEcregisterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
}

func (s QueryYdregprotEcregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryYdregprotEcregisterRequest) GoString() string {
	return s.String()
}

func (s *QueryYdregprotEcregisterRequest) SetAuthToken(v string) *QueryYdregprotEcregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryYdregprotEcregisterRequest) SetProductInstanceId(v string) *QueryYdregprotEcregisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryYdregprotEcregisterRequest) SetMobile(v string) *QueryYdregprotEcregisterRequest {
	s.Mobile = &v
	return s
}

type QueryYdregprotEcregisterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否核验通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
}

func (s QueryYdregprotEcregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryYdregprotEcregisterResponse) GoString() string {
	return s.String()
}

func (s *QueryYdregprotEcregisterResponse) SetReqMsgId(v string) *QueryYdregprotEcregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetResultCode(v string) *QueryYdregprotEcregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetResultMsg(v string) *QueryYdregprotEcregisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetPassed(v bool) *QueryYdregprotEcregisterResponse {
	s.Passed = &v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetScore(v string) *QueryYdregprotEcregisterResponse {
	s.Score = &v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetStrategies(v []*string) *QueryYdregprotEcregisterResponse {
	s.Strategies = v
	return s
}

func (s *QueryYdregprotEcregisterResponse) SetDecision(v string) *QueryYdregprotEcregisterResponse {
	s.Decision = &v
	return s
}

type QueryEpayauthBranchbankRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 银行名称，支持全称，或部分名称
	// bank_name和district_code至少有一个不为空
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 行政地区编码
	// bank_name和district_code至少有一个不为空
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 总行联行号
	RootBankCode *string `json:"root_bank_code,omitempty" xml:"root_bank_code,omitempty" require:"true"`
}

func (s QueryEpayauthBranchbankRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthBranchbankRequest) GoString() string {
	return s.String()
}

func (s *QueryEpayauthBranchbankRequest) SetAuthToken(v string) *QueryEpayauthBranchbankRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEpayauthBranchbankRequest) SetProductInstanceId(v string) *QueryEpayauthBranchbankRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEpayauthBranchbankRequest) SetBankName(v string) *QueryEpayauthBranchbankRequest {
	s.BankName = &v
	return s
}

func (s *QueryEpayauthBranchbankRequest) SetDistrictCode(v string) *QueryEpayauthBranchbankRequest {
	s.DistrictCode = &v
	return s
}

func (s *QueryEpayauthBranchbankRequest) SetRootBankCode(v string) *QueryEpayauthBranchbankRequest {
	s.RootBankCode = &v
	return s
}

type QueryEpayauthBranchbankResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Institution列表
	BankDetails []*Institution `json:"bank_details,omitempty" xml:"bank_details,omitempty" type:"Repeated"`
}

func (s QueryEpayauthBranchbankResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthBranchbankResponse) GoString() string {
	return s.String()
}

func (s *QueryEpayauthBranchbankResponse) SetReqMsgId(v string) *QueryEpayauthBranchbankResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEpayauthBranchbankResponse) SetResultCode(v string) *QueryEpayauthBranchbankResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEpayauthBranchbankResponse) SetResultMsg(v string) *QueryEpayauthBranchbankResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEpayauthBranchbankResponse) SetBankDetails(v []*Institution) *QueryEpayauthBranchbankResponse {
	s.BankDetails = v
	return s
}

type QueryEpayauthDistrictRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty" require:"true"`
}

func (s QueryEpayauthDistrictRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthDistrictRequest) GoString() string {
	return s.String()
}

func (s *QueryEpayauthDistrictRequest) SetAuthToken(v string) *QueryEpayauthDistrictRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEpayauthDistrictRequest) SetProductInstanceId(v string) *QueryEpayauthDistrictRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEpayauthDistrictRequest) SetParentCode(v string) *QueryEpayauthDistrictRequest {
	s.ParentCode = &v
	return s
}

type QueryEpayauthDistrictResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// District列表
	DistrictDetails []*Institution `json:"district_details,omitempty" xml:"district_details,omitempty" type:"Repeated"`
}

func (s QueryEpayauthDistrictResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthDistrictResponse) GoString() string {
	return s.String()
}

func (s *QueryEpayauthDistrictResponse) SetReqMsgId(v string) *QueryEpayauthDistrictResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEpayauthDistrictResponse) SetResultCode(v string) *QueryEpayauthDistrictResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEpayauthDistrictResponse) SetResultMsg(v string) *QueryEpayauthDistrictResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEpayauthDistrictResponse) SetDistrictDetails(v []*Institution) *QueryEpayauthDistrictResponse {
	s.DistrictDetails = v
	return s
}

type InitEpayauthVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 待认证银行卡号
	//
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 人行联行号
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty" require:"true"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 手机号码 用于接收打款验证通知短信
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s InitEpayauthVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEpayauthVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitEpayauthVerifyRequest) SetAuthToken(v string) *InitEpayauthVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetProductInstanceId(v string) *InitEpayauthVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetBankCardNo(v string) *InitEpayauthVerifyRequest {
	s.BankCardNo = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetBankCode(v string) *InitEpayauthVerifyRequest {
	s.BankCode = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetCallbackUrl(v string) *InitEpayauthVerifyRequest {
	s.CallbackUrl = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetEpCertName(v string) *InitEpayauthVerifyRequest {
	s.EpCertName = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetEpCertNo(v string) *InitEpayauthVerifyRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetLegalPersonCertName(v string) *InitEpayauthVerifyRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetLegalPersonCertNo(v string) *InitEpayauthVerifyRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *InitEpayauthVerifyRequest) SetMobile(v string) *InitEpayauthVerifyRequest {
	s.Mobile = &v
	return s
}

type InitEpayauthVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 2017070610120520200000000051240001626725
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
}

func (s InitEpayauthVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEpayauthVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitEpayauthVerifyResponse) SetReqMsgId(v string) *InitEpayauthVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEpayauthVerifyResponse) SetResultCode(v string) *InitEpayauthVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEpayauthVerifyResponse) SetResultMsg(v string) *InitEpayauthVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEpayauthVerifyResponse) SetVerifyId(v string) *InitEpayauthVerifyResponse {
	s.VerifyId = &v
	return s
}

type QueryEpayauthVerifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 打款金额，只支持两位小数点的正数，单位：元
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 支付币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 打款验证ID 打款验证受理后生成的一个唯一标识
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty" require:"true"`
}

func (s QueryEpayauthVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthVerifyRequest) GoString() string {
	return s.String()
}

func (s *QueryEpayauthVerifyRequest) SetAuthToken(v string) *QueryEpayauthVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEpayauthVerifyRequest) SetProductInstanceId(v string) *QueryEpayauthVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEpayauthVerifyRequest) SetAmount(v string) *QueryEpayauthVerifyRequest {
	s.Amount = &v
	return s
}

func (s *QueryEpayauthVerifyRequest) SetCurrency(v string) *QueryEpayauthVerifyRequest {
	s.Currency = &v
	return s
}

func (s *QueryEpayauthVerifyRequest) SetVerifyId(v string) *QueryEpayauthVerifyRequest {
	s.VerifyId = &v
	return s
}

type QueryEpayauthVerifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验证是否成功
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty"`
}

func (s QueryEpayauthVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEpayauthVerifyResponse) GoString() string {
	return s.String()
}

func (s *QueryEpayauthVerifyResponse) SetReqMsgId(v string) *QueryEpayauthVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEpayauthVerifyResponse) SetResultCode(v string) *QueryEpayauthVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEpayauthVerifyResponse) SetResultMsg(v string) *QueryEpayauthVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEpayauthVerifyResponse) SetValid(v bool) *QueryEpayauthVerifyResponse {
	s.Valid = &v
	return s
}

type QueryBmpbrowserTransactionqrcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 蚂蚁区块链的唯一链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 链上合约id
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 蚂蚁区块链的链上交易hash值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty" require:"true"`
}

func (s QueryBmpbrowserTransactionqrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBmpbrowserTransactionqrcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryBmpbrowserTransactionqrcodeRequest) SetAuthToken(v string) *QueryBmpbrowserTransactionqrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeRequest) SetProductInstanceId(v string) *QueryBmpbrowserTransactionqrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeRequest) SetBizid(v string) *QueryBmpbrowserTransactionqrcodeRequest {
	s.Bizid = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeRequest) SetContractId(v string) *QueryBmpbrowserTransactionqrcodeRequest {
	s.ContractId = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeRequest) SetHash(v string) *QueryBmpbrowserTransactionqrcodeRequest {
	s.Hash = &v
	return s
}

type QueryBmpbrowserTransactionqrcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易二维码二进制内容的Base64编码
	QrCodeDownloadUrl *string `json:"qr_code_download_url,omitempty" xml:"qr_code_download_url,omitempty"`
}

func (s QueryBmpbrowserTransactionqrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBmpbrowserTransactionqrcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryBmpbrowserTransactionqrcodeResponse) SetReqMsgId(v string) *QueryBmpbrowserTransactionqrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeResponse) SetResultCode(v string) *QueryBmpbrowserTransactionqrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeResponse) SetResultMsg(v string) *QueryBmpbrowserTransactionqrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBmpbrowserTransactionqrcodeResponse) SetQrCodeDownloadUrl(v string) *QueryBmpbrowserTransactionqrcodeResponse {
	s.QrCodeDownloadUrl = &v
	return s
}

type AddBmpbrowserPrivilegeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 蚂蚁区块链的唯一链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 授权查看权限的支付宝电话号码集合
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true"`
}

func (s AddBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *AddBmpbrowserPrivilegeRequest) SetAuthToken(v string) *AddBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *AddBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBmpbrowserPrivilegeRequest) SetBizid(v string) *AddBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *AddBmpbrowserPrivilegeRequest) SetPhoneNumbers(v string) *AddBmpbrowserPrivilegeRequest {
	s.PhoneNumbers = &v
	return s
}

type AddBmpbrowserPrivilegeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量添加权限成功与否
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s AddBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *AddBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *AddBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBmpbrowserPrivilegeResponse) SetResultCode(v string) *AddBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBmpbrowserPrivilegeResponse) SetResultMsg(v string) *AddBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBmpbrowserPrivilegeResponse) SetStatus(v int64) *AddBmpbrowserPrivilegeResponse {
	s.Status = &v
	return s
}

type QueryIdcocrIdcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证图片base64编码内容
	ImageContent *string `json:"image_content,omitempty" xml:"image_content,omitempty" require:"true"`
	// face: 身份证正面
	// back: 身份证反面
	Side *string `json:"side,omitempty" xml:"side,omitempty" require:"true"`
}

func (s QueryIdcocrIdcardRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIdcocrIdcardRequest) GoString() string {
	return s.String()
}

func (s *QueryIdcocrIdcardRequest) SetAuthToken(v string) *QueryIdcocrIdcardRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIdcocrIdcardRequest) SetProductInstanceId(v string) *QueryIdcocrIdcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIdcocrIdcardRequest) SetImageContent(v string) *QueryIdcocrIdcardRequest {
	s.ImageContent = &v
	return s
}

func (s *QueryIdcocrIdcardRequest) SetSide(v string) *QueryIdcocrIdcardRequest {
	s.Side = &v
	return s
}

type QueryIdcocrIdcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 出生年月日
	Birth *string `json:"birth,omitempty" xml:"birth,omitempty"`
	// 信息抽取失败后详细错误原因
	ErrorContent *string `json:"error_content,omitempty" xml:"error_content,omitempty"`
	// 身份证号码
	Num *string `json:"num,omitempty" xml:"num,omitempty"`
	// 性别：男/女
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
	// 解析成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 有效期截止时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 公安局分案
	Issue *string `json:"issue,omitempty" xml:"issue,omitempty"`
	// 有效期开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 民族
	Nationality *string `json:"nationality,omitempty" xml:"nationality,omitempty"`
}

func (s QueryIdcocrIdcardResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIdcocrIdcardResponse) GoString() string {
	return s.String()
}

func (s *QueryIdcocrIdcardResponse) SetReqMsgId(v string) *QueryIdcocrIdcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetResultCode(v string) *QueryIdcocrIdcardResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetResultMsg(v string) *QueryIdcocrIdcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetAddress(v string) *QueryIdcocrIdcardResponse {
	s.Address = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetBirth(v string) *QueryIdcocrIdcardResponse {
	s.Birth = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetErrorContent(v string) *QueryIdcocrIdcardResponse {
	s.ErrorContent = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetNum(v string) *QueryIdcocrIdcardResponse {
	s.Num = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetSex(v string) *QueryIdcocrIdcardResponse {
	s.Sex = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetSuccess(v bool) *QueryIdcocrIdcardResponse {
	s.Success = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetEndDate(v string) *QueryIdcocrIdcardResponse {
	s.EndDate = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetIssue(v string) *QueryIdcocrIdcardResponse {
	s.Issue = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetStartDate(v string) *QueryIdcocrIdcardResponse {
	s.StartDate = &v
	return s
}

func (s *QueryIdcocrIdcardResponse) SetNationality(v string) *QueryIdcocrIdcardResponse {
	s.Nationality = &v
	return s
}

type InitCaCertificateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务唯一性uuid，用于后续的证书查询
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty" require:"true"`
	// 证书请求(CSR)
	Command *string `json:"command,omitempty" xml:"command,omitempty" require:"true"`
	// 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
	// 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
	ConfigId *string `json:"config_id,omitempty" xml:"config_id,omitempty" require:"true"`
}

func (s InitCaCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCaCertificateRequest) GoString() string {
	return s.String()
}

func (s *InitCaCertificateRequest) SetAuthToken(v string) *InitCaCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCaCertificateRequest) SetProductInstanceId(v string) *InitCaCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCaCertificateRequest) SetBizUuid(v string) *InitCaCertificateRequest {
	s.BizUuid = &v
	return s
}

func (s *InitCaCertificateRequest) SetCommand(v string) *InitCaCertificateRequest {
	s.Command = &v
	return s
}

func (s *InitCaCertificateRequest) SetConfigId(v string) *InitCaCertificateRequest {
	s.ConfigId = &v
	return s
}

type InitCaCertificateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书序列号
	CertSn *string `json:"cert_sn,omitempty" xml:"cert_sn,omitempty"`
	// 证书内容
	P10 *string `json:"p10,omitempty" xml:"p10,omitempty"`
}

func (s InitCaCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCaCertificateResponse) GoString() string {
	return s.String()
}

func (s *InitCaCertificateResponse) SetReqMsgId(v string) *InitCaCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCaCertificateResponse) SetResultCode(v string) *InitCaCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCaCertificateResponse) SetResultMsg(v string) *InitCaCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitCaCertificateResponse) SetCertSn(v string) *InitCaCertificateResponse {
	s.CertSn = &v
	return s
}

func (s *InitCaCertificateResponse) SetP10(v string) *InitCaCertificateResponse {
	s.P10 = &v
	return s
}

type InitContentriskInternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 进行识别的音频地址
	AudioUrls *string `json:"audio_urls,omitempty" xml:"audio_urls,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 待校验连接
	LinkUrls *string `json:"link_urls,omitempty" xml:"link_urls,omitempty"`
	// 图片连接
	PictureUrls *string `json:"picture_urls,omitempty" xml:"picture_urls,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 待校验文本
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 进行识别的视频地址
	VideoUrls *string `json:"video_urls,omitempty" xml:"video_urls,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s InitContentriskInternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitContentriskInternalRequest) GoString() string {
	return s.String()
}

func (s *InitContentriskInternalRequest) SetAuthToken(v string) *InitContentriskInternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitContentriskInternalRequest) SetProductInstanceId(v string) *InitContentriskInternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitContentriskInternalRequest) SetAudioUrls(v string) *InitContentriskInternalRequest {
	s.AudioUrls = &v
	return s
}

func (s *InitContentriskInternalRequest) SetBizInfo(v *BizInfo) *InitContentriskInternalRequest {
	s.BizInfo = v
	return s
}

func (s *InitContentriskInternalRequest) SetLinkUrls(v string) *InitContentriskInternalRequest {
	s.LinkUrls = &v
	return s
}

func (s *InitContentriskInternalRequest) SetPictureUrls(v string) *InitContentriskInternalRequest {
	s.PictureUrls = &v
	return s
}

func (s *InitContentriskInternalRequest) SetSceneCode(v string) *InitContentriskInternalRequest {
	s.SceneCode = &v
	return s
}

func (s *InitContentriskInternalRequest) SetText(v string) *InitContentriskInternalRequest {
	s.Text = &v
	return s
}

func (s *InitContentriskInternalRequest) SetVideoUrls(v string) *InitContentriskInternalRequest {
	s.VideoUrls = &v
	return s
}

func (s *InitContentriskInternalRequest) SetAccountId(v string) *InitContentriskInternalRequest {
	s.AccountId = &v
	return s
}

type InitContentriskInternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内容ID，用于查询异步识别结果时作为查询ID
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	// 内容安全同步检测返回的事件id，用于异步获取检测结果
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 命中结果详情
	HitDetectItems []*HitDetectItems `json:"hit_detect_items,omitempty" xml:"hit_detect_items,omitempty" type:"Repeated"`
	// 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
	NeedQuery *string `json:"need_query,omitempty" xml:"need_query,omitempty"`
	// PASSED("数据识别通过，可以在网站上正常显示")
	//
	// REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
	//
	// CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")
	//
	// DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")
	//
	// REPLACE("替换部分词为 ***")
	//
	// WARNING("提示数据，表示内容存在可疑，提示用户操作")
	//
	// RECOVER("恢复数据，将误判断的内容，恢复回来")
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
}

func (s InitContentriskInternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitContentriskInternalResponse) GoString() string {
	return s.String()
}

func (s *InitContentriskInternalResponse) SetReqMsgId(v string) *InitContentriskInternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitContentriskInternalResponse) SetResultCode(v string) *InitContentriskInternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitContentriskInternalResponse) SetResultMsg(v string) *InitContentriskInternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitContentriskInternalResponse) SetAppSceneDataId(v string) *InitContentriskInternalResponse {
	s.AppSceneDataId = &v
	return s
}

func (s *InitContentriskInternalResponse) SetEventId(v string) *InitContentriskInternalResponse {
	s.EventId = &v
	return s
}

func (s *InitContentriskInternalResponse) SetHitDetectItems(v []*HitDetectItems) *InitContentriskInternalResponse {
	s.HitDetectItems = v
	return s
}

func (s *InitContentriskInternalResponse) SetNeedQuery(v string) *InitContentriskInternalResponse {
	s.NeedQuery = &v
	return s
}

func (s *InitContentriskInternalResponse) SetResultAction(v string) *InitContentriskInternalResponse {
	s.ResultAction = &v
	return s
}

type QueryContentriskInternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 内容业务ID，用于进行异步识别结果的索引查询
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty" require:"true"`
	// 内部参数
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 内容检测事件id，根据此id查询异步检测结果
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
}

func (s QueryContentriskInternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContentriskInternalRequest) GoString() string {
	return s.String()
}

func (s *QueryContentriskInternalRequest) SetAuthToken(v string) *QueryContentriskInternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryContentriskInternalRequest) SetProductInstanceId(v string) *QueryContentriskInternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryContentriskInternalRequest) SetSceneCode(v string) *QueryContentriskInternalRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryContentriskInternalRequest) SetAppSceneDataId(v string) *QueryContentriskInternalRequest {
	s.AppSceneDataId = &v
	return s
}

func (s *QueryContentriskInternalRequest) SetBizInfo(v *BizInfo) *QueryContentriskInternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryContentriskInternalRequest) SetEventId(v string) *QueryContentriskInternalRequest {
	s.EventId = &v
	return s
}

type QueryContentriskInternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 命中结果详情
	HitDetectItems []*HitDetectItems `json:"hit_detect_items,omitempty" xml:"hit_detect_items,omitempty" type:"Repeated"`
	// PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
}

func (s QueryContentriskInternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContentriskInternalResponse) GoString() string {
	return s.String()
}

func (s *QueryContentriskInternalResponse) SetReqMsgId(v string) *QueryContentriskInternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryContentriskInternalResponse) SetResultCode(v string) *QueryContentriskInternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryContentriskInternalResponse) SetResultMsg(v string) *QueryContentriskInternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryContentriskInternalResponse) SetHitDetectItems(v []*HitDetectItems) *QueryContentriskInternalResponse {
	s.HitDetectItems = v
	return s
}

func (s *QueryContentriskInternalResponse) SetResultAction(v string) *QueryContentriskInternalResponse {
	s.ResultAction = &v
	return s
}

type InitIndividualidImageauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// Base64编码的人脸正面照片
	EncodedFacialPictureFront *string `json:"encoded_facial_picture_front,omitempty" xml:"encoded_facial_picture_front,omitempty" require:"true"`
}

func (s InitIndividualidImageauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidImageauthRequest) GoString() string {
	return s.String()
}

func (s *InitIndividualidImageauthRequest) SetAuthToken(v string) *InitIndividualidImageauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIndividualidImageauthRequest) SetProductInstanceId(v string) *InitIndividualidImageauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIndividualidImageauthRequest) SetCertName(v string) *InitIndividualidImageauthRequest {
	s.CertName = &v
	return s
}

func (s *InitIndividualidImageauthRequest) SetCertNo(v string) *InitIndividualidImageauthRequest {
	s.CertNo = &v
	return s
}

func (s *InitIndividualidImageauthRequest) SetEncodedFacialPictureFront(v string) *InitIndividualidImageauthRequest {
	s.EncodedFacialPictureFront = &v
	return s
}

type InitIndividualidImageauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证是否成功
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s InitIndividualidImageauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidImageauthResponse) GoString() string {
	return s.String()
}

func (s *InitIndividualidImageauthResponse) SetReqMsgId(v string) *InitIndividualidImageauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIndividualidImageauthResponse) SetResultCode(v string) *InitIndividualidImageauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIndividualidImageauthResponse) SetResultMsg(v string) *InitIndividualidImageauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIndividualidImageauthResponse) SetCertifyId(v string) *InitIndividualidImageauthResponse {
	s.CertifyId = &v
	return s
}

func (s *InitIndividualidImageauthResponse) SetPassed(v bool) *InitIndividualidImageauthResponse {
	s.Passed = &v
	return s
}

type AddIotcseAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s AddIotcseAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s AddIotcseAccountRequest) GoString() string {
	return s.String()
}

func (s *AddIotcseAccountRequest) SetAuthToken(v string) *AddIotcseAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *AddIotcseAccountRequest) SetProductInstanceId(v string) *AddIotcseAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddIotcseAccountRequest) SetBizContent(v string) *AddIotcseAccountRequest {
	s.BizContent = &v
	return s
}

type AddIotcseAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s AddIotcseAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s AddIotcseAccountResponse) GoString() string {
	return s.String()
}

func (s *AddIotcseAccountResponse) SetReqMsgId(v string) *AddIotcseAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddIotcseAccountResponse) SetResultCode(v string) *AddIotcseAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *AddIotcseAccountResponse) SetResultMsg(v string) *AddIotcseAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddIotcseAccountResponse) SetRawResponse(v string) *AddIotcseAccountResponse {
	s.RawResponse = &v
	return s
}

type SaveIotcseEvidenceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SaveIotcseEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveIotcseEvidenceRequest) GoString() string {
	return s.String()
}

func (s *SaveIotcseEvidenceRequest) SetAuthToken(v string) *SaveIotcseEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveIotcseEvidenceRequest) SetProductInstanceId(v string) *SaveIotcseEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveIotcseEvidenceRequest) SetBizContent(v string) *SaveIotcseEvidenceRequest {
	s.BizContent = &v
	return s
}

type SaveIotcseEvidenceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s SaveIotcseEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveIotcseEvidenceResponse) GoString() string {
	return s.String()
}

func (s *SaveIotcseEvidenceResponse) SetReqMsgId(v string) *SaveIotcseEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveIotcseEvidenceResponse) SetResultCode(v string) *SaveIotcseEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveIotcseEvidenceResponse) SetResultMsg(v string) *SaveIotcseEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveIotcseEvidenceResponse) SetRawResponse(v string) *SaveIotcseEvidenceResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseEvidenceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseEvidenceRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseEvidenceRequest) SetAuthToken(v string) *QueryIotcseEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseEvidenceRequest) SetProductInstanceId(v string) *QueryIotcseEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseEvidenceRequest) SetBizContent(v string) *QueryIotcseEvidenceRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseEvidenceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseEvidenceResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseEvidenceResponse) SetReqMsgId(v string) *QueryIotcseEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseEvidenceResponse) SetResultCode(v string) *QueryIotcseEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseEvidenceResponse) SetResultMsg(v string) *QueryIotcseEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseEvidenceResponse) SetRawResponse(v string) *QueryIotcseEvidenceResponse {
	s.RawResponse = &v
	return s
}

type CreateDidCorporatedidagentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展字段
	// { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty" require:"true"`
	// 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
	Indexs []*string `json:"indexs,omitempty" xml:"indexs,omitempty" type:"Repeated"`
	// 企业名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 携带自己定义的服务类型
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
}

func (s CreateDidCorporatedidagentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDidCorporatedidagentRequest) GoString() string {
	return s.String()
}

func (s *CreateDidCorporatedidagentRequest) SetAuthToken(v string) *CreateDidCorporatedidagentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetProductInstanceId(v string) *CreateDidCorporatedidagentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetExtensionInfo(v string) *CreateDidCorporatedidagentRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetIndexs(v []*string) *CreateDidCorporatedidagentRequest {
	s.Indexs = v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetOwnerName(v string) *CreateDidCorporatedidagentRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetOwnerUid(v string) *CreateDidCorporatedidagentRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateDidCorporatedidagentRequest) SetServices(v []*DidDocServicesInfo) *CreateDidCorporatedidagentRequest {
	s.Services = v
	return s
}

type CreateDidCorporatedidagentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateDidCorporatedidagentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDidCorporatedidagentResponse) GoString() string {
	return s.String()
}

func (s *CreateDidCorporatedidagentResponse) SetReqMsgId(v string) *CreateDidCorporatedidagentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDidCorporatedidagentResponse) SetResultCode(v string) *CreateDidCorporatedidagentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDidCorporatedidagentResponse) SetResultMsg(v string) *CreateDidCorporatedidagentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDidCorporatedidagentResponse) SetDid(v string) *CreateDidCorporatedidagentResponse {
	s.Did = &v
	return s
}

type InitIndividualidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证 默认为FACE
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s InitIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *InitIndividualidFaceauthinternalRequest) SetAuthToken(v string) *InitIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *InitIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitIndividualidFaceauthinternalRequest) SetBizCode(v string) *InitIndividualidFaceauthinternalRequest {
	s.BizCode = &v
	return s
}

func (s *InitIndividualidFaceauthinternalRequest) SetCertName(v string) *InitIndividualidFaceauthinternalRequest {
	s.CertName = &v
	return s
}

func (s *InitIndividualidFaceauthinternalRequest) SetCertNo(v string) *InitIndividualidFaceauthinternalRequest {
	s.CertNo = &v
	return s
}

func (s *InitIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *InitIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

type InitIndividualidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *InitIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *InitIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitIndividualidFaceauthinternalResponse) SetResultCode(v string) *InitIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitIndividualidFaceauthinternalResponse) SetResultMsg(v string) *InitIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitIndividualidFaceauthinternalResponse) SetCertifyId(v string) *InitIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

type CertifyIndividualidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证的唯一性id
	//
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 认证完成后回跳地址
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s CertifyIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetAuthToken(v string) *CertifyIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *CertifyIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetCallbackUrl(v string) *CertifyIndividualidFaceauthinternalRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetCertifyId(v string) *CertifyIndividualidFaceauthinternalRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetRedirectUrl(v string) *CertifyIndividualidFaceauthinternalRequest {
	s.RedirectUrl = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *CertifyIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

type CertifyIndividualidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *CertifyIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *CertifyIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalResponse) SetResultCode(v string) *CertifyIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalResponse) SetResultMsg(v string) *CertifyIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalResponse) SetCertifyId(v string) *CertifyIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyIndividualidFaceauthinternalResponse) SetVerifyUrl(v string) *CertifyIndividualidFaceauthinternalResponse {
	s.VerifyUrl = &v
	return s
}

type QueryIndividualidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
}

func (s QueryIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualidFaceauthinternalRequest) SetAuthToken(v string) *QueryIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *QueryIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *QueryIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryIndividualidFaceauthinternalRequest) SetCertifyId(v string) *QueryIndividualidFaceauthinternalRequest {
	s.CertifyId = &v
	return s
}

type QueryIndividualidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 用户是否完成刷脸
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty"`
}

func (s QueryIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *QueryIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalResponse) SetResultCode(v string) *QueryIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalResponse) SetResultMsg(v string) *QueryIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalResponse) SetCertifyId(v string) *QueryIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalResponse) SetPassed(v bool) *QueryIndividualidFaceauthinternalResponse {
	s.Passed = &v
	return s
}

func (s *QueryIndividualidFaceauthinternalResponse) SetFinished(v bool) *QueryIndividualidFaceauthinternalResponse {
	s.Finished = &v
	return s
}

type InitEnterpriseidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号（目前只支持身份证号）
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s InitEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetEpCertName(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.EpCertName = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetEpCertNo(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetEpCertType(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.EpCertType = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetLegalPersonCertName(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetLegalPersonCertNo(v string) *InitEnterpriseidFaceauthinternalRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *InitEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

type InitEnterpriseidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	//
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *InitEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *InitEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *InitEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *InitEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *InitEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

type CertifyEnterpriseidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 回调通知地址
	//
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// https://www.example.com/redircet
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *CertifyEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *CertifyEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *CertifyEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetBizNo(v string) *CertifyEnterpriseidFaceauthinternalRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetCallbackUrl(v string) *CertifyEnterpriseidFaceauthinternalRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalRequest) SetRedirectUrl(v string) *CertifyEnterpriseidFaceauthinternalRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyEnterpriseidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *CertifyEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *CertifyEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *CertifyEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *CertifyEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *CertifyEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyEnterpriseidFaceauthinternalResponse) SetVerifyUrl(v string) *CertifyEnterpriseidFaceauthinternalResponse {
	s.VerifyUrl = &v
	return s
}

type QueryEverifyTwometainternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s QueryEverifyTwometainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyTwometainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyTwometainternalRequest) SetAuthToken(v string) *QueryEverifyTwometainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyTwometainternalRequest) SetProductInstanceId(v string) *QueryEverifyTwometainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyTwometainternalRequest) SetEpCertName(v string) *QueryEverifyTwometainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyTwometainternalRequest) SetEpCertNo(v string) *QueryEverifyTwometainternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEverifyTwometainternalRequest) SetBizInfo(v *BizInfo) *QueryEverifyTwometainternalRequest {
	s.BizInfo = v
	return s
}

type QueryEverifyTwometainternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 经营状态
	//
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	//
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEverifyTwometainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyTwometainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyTwometainternalResponse) SetReqMsgId(v string) *QueryEverifyTwometainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetResultCode(v string) *QueryEverifyTwometainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetResultMsg(v string) *QueryEverifyTwometainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetCode(v string) *QueryEverifyTwometainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetEnterpriseStatus(v string) *QueryEverifyTwometainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetOpenTime(v string) *QueryEverifyTwometainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyTwometainternalResponse) SetPassed(v bool) *QueryEverifyTwometainternalResponse {
	s.Passed = &v
	return s
}

type QueryEverifyThreemetainternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s QueryEverifyThreemetainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyThreemetainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyThreemetainternalRequest) SetAuthToken(v string) *QueryEverifyThreemetainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyThreemetainternalRequest) SetProductInstanceId(v string) *QueryEverifyThreemetainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyThreemetainternalRequest) SetEpCertName(v string) *QueryEverifyThreemetainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyThreemetainternalRequest) SetEpCertNo(v string) *QueryEverifyThreemetainternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEverifyThreemetainternalRequest) SetLegalPersonCertName(v string) *QueryEverifyThreemetainternalRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryEverifyThreemetainternalRequest) SetBizInfo(v *BizInfo) *QueryEverifyThreemetainternalRequest {
	s.BizInfo = v
	return s
}

type QueryEverifyThreemetainternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 经营状态
	//
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	//
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	//
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEverifyThreemetainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyThreemetainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyThreemetainternalResponse) SetReqMsgId(v string) *QueryEverifyThreemetainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetResultCode(v string) *QueryEverifyThreemetainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetResultMsg(v string) *QueryEverifyThreemetainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetCode(v string) *QueryEverifyThreemetainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetEnterpriseStatus(v string) *QueryEverifyThreemetainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetOpenTime(v string) *QueryEverifyThreemetainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyThreemetainternalResponse) SetPassed(v bool) *QueryEverifyThreemetainternalResponse {
	s.Passed = &v
	return s
}

type QueryEverifyFourmetainternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 法人姓名
	//
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 企业法人身份证号码
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s QueryEverifyFourmetainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyFourmetainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryEverifyFourmetainternalRequest) SetAuthToken(v string) *QueryEverifyFourmetainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetProductInstanceId(v string) *QueryEverifyFourmetainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetEpCertName(v string) *QueryEverifyFourmetainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetEpCertNo(v string) *QueryEverifyFourmetainternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetLegalPersonCertName(v string) *QueryEverifyFourmetainternalRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetLegalPersonCertNo(v string) *QueryEverifyFourmetainternalRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *QueryEverifyFourmetainternalRequest) SetBizInfo(v *BizInfo) *QueryEverifyFourmetainternalRequest {
	s.BizInfo = v
	return s
}

type QueryEverifyFourmetainternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0:核验成功 1:企业信息有误 2:企业非正常营业
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 企业经营状态
	//
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	//
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	//
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEverifyFourmetainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEverifyFourmetainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryEverifyFourmetainternalResponse) SetReqMsgId(v string) *QueryEverifyFourmetainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetResultCode(v string) *QueryEverifyFourmetainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetResultMsg(v string) *QueryEverifyFourmetainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetCode(v string) *QueryEverifyFourmetainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetEnterpriseStatus(v string) *QueryEverifyFourmetainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetOpenTime(v string) *QueryEverifyFourmetainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryEverifyFourmetainternalResponse) SetPassed(v bool) *QueryEverifyFourmetainternalResponse {
	s.Passed = &v
	return s
}

type QueryEnterpriseidFaceauthinternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty" require:"true"`
}

func (s QueryEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *QueryEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *QueryEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalRequest) SetBizNo(v string) *QueryEnterpriseidFaceauthinternalRequest {
	s.BizNo = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *QueryEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

type QueryEnterpriseidFaceauthinternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证失败错误码
	//
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证失败原因信息
	//
	FailedMessage *string `json:"failed_message,omitempty" xml:"failed_message,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetFailedCode(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetFailedMessage(v string) *QueryEnterpriseidFaceauthinternalResponse {
	s.FailedMessage = &v
	return s
}

func (s *QueryEnterpriseidFaceauthinternalResponse) SetPassed(v bool) *QueryEnterpriseidFaceauthinternalResponse {
	s.Passed = &v
	return s
}

type AddIotcseThingsdidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s AddIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s AddIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *AddIotcseThingsdidRequest) SetAuthToken(v string) *AddIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *AddIotcseThingsdidRequest) SetProductInstanceId(v string) *AddIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddIotcseThingsdidRequest) SetBizContent(v string) *AddIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type AddIotcseThingsdidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s AddIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s AddIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *AddIotcseThingsdidResponse) SetReqMsgId(v string) *AddIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddIotcseThingsdidResponse) SetResultCode(v string) *AddIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *AddIotcseThingsdidResponse) SetResultMsg(v string) *AddIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddIotcseThingsdidResponse) SetRawResponse(v string) *AddIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type UpdateIotcseThingsdidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s UpdateIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *UpdateIotcseThingsdidRequest) SetAuthToken(v string) *UpdateIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateIotcseThingsdidRequest) SetProductInstanceId(v string) *UpdateIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateIotcseThingsdidRequest) SetBizContent(v string) *UpdateIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type UpdateIotcseThingsdidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *UpdateIotcseThingsdidResponse) SetReqMsgId(v string) *UpdateIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateIotcseThingsdidResponse) SetResultCode(v string) *UpdateIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateIotcseThingsdidResponse) SetResultMsg(v string) *UpdateIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateIotcseThingsdidResponse) SetRawResponse(v string) *UpdateIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseThingsdidRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseThingsdidRequest) SetAuthToken(v string) *QueryIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseThingsdidRequest) SetProductInstanceId(v string) *QueryIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseThingsdidRequest) SetBizContent(v string) *QueryIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseThingsdidResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseThingsdidResponse) SetReqMsgId(v string) *QueryIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseThingsdidResponse) SetResultCode(v string) *QueryIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseThingsdidResponse) SetResultMsg(v string) *QueryIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseThingsdidResponse) SetRawResponse(v string) *QueryIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseAsyncprocessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"key":"value"}
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseAsyncprocessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseAsyncprocessRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseAsyncprocessRequest) SetAuthToken(v string) *QueryIotcseAsyncprocessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseAsyncprocessRequest) SetProductInstanceId(v string) *QueryIotcseAsyncprocessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseAsyncprocessRequest) SetBizContent(v string) *QueryIotcseAsyncprocessRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseAsyncprocessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseAsyncprocessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseAsyncprocessResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseAsyncprocessResponse) SetReqMsgId(v string) *QueryIotcseAsyncprocessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseAsyncprocessResponse) SetResultCode(v string) *QueryIotcseAsyncprocessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseAsyncprocessResponse) SetResultMsg(v string) *QueryIotcseAsyncprocessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseAsyncprocessResponse) SetRawResponse(v string) *QueryIotcseAsyncprocessResponse {
	s.RawResponse = &v
	return s
}

type ExecIotcseGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecIotcseGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecIotcseGroupRequest) GoString() string {
	return s.String()
}

func (s *ExecIotcseGroupRequest) SetAuthToken(v string) *ExecIotcseGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecIotcseGroupRequest) SetProductInstanceId(v string) *ExecIotcseGroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecIotcseGroupRequest) SetBizContent(v string) *ExecIotcseGroupRequest {
	s.BizContent = &v
	return s
}

type ExecIotcseGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s ExecIotcseGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecIotcseGroupResponse) GoString() string {
	return s.String()
}

func (s *ExecIotcseGroupResponse) SetReqMsgId(v string) *ExecIotcseGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecIotcseGroupResponse) SetResultCode(v string) *ExecIotcseGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecIotcseGroupResponse) SetResultMsg(v string) *ExecIotcseGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecIotcseGroupResponse) SetRawResponse(v string) *ExecIotcseGroupResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseGroupdeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseGroupdeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseGroupdeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseGroupdeviceRequest) SetAuthToken(v string) *QueryIotcseGroupdeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseGroupdeviceRequest) SetProductInstanceId(v string) *QueryIotcseGroupdeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseGroupdeviceRequest) SetBizContent(v string) *QueryIotcseGroupdeviceRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseGroupdeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseGroupdeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseGroupdeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseGroupdeviceResponse) SetReqMsgId(v string) *QueryIotcseGroupdeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseGroupdeviceResponse) SetResultCode(v string) *QueryIotcseGroupdeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseGroupdeviceResponse) SetResultMsg(v string) *QueryIotcseGroupdeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseGroupdeviceResponse) SetRawResponse(v string) *QueryIotcseGroupdeviceResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseDevicegroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseDevicegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseDevicegroupRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseDevicegroupRequest) SetAuthToken(v string) *QueryIotcseDevicegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseDevicegroupRequest) SetProductInstanceId(v string) *QueryIotcseDevicegroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseDevicegroupRequest) SetBizContent(v string) *QueryIotcseDevicegroupRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseDevicegroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseDevicegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseDevicegroupResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseDevicegroupResponse) SetReqMsgId(v string) *QueryIotcseDevicegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseDevicegroupResponse) SetResultCode(v string) *QueryIotcseDevicegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseDevicegroupResponse) SetResultMsg(v string) *QueryIotcseDevicegroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseDevicegroupResponse) SetRawResponse(v string) *QueryIotcseDevicegroupResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseTenantdeviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseTenantdeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseTenantdeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseTenantdeviceRequest) SetAuthToken(v string) *QueryIotcseTenantdeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseTenantdeviceRequest) SetProductInstanceId(v string) *QueryIotcseTenantdeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseTenantdeviceRequest) SetBizContent(v string) *QueryIotcseTenantdeviceRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseTenantdeviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseTenantdeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseTenantdeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseTenantdeviceResponse) SetReqMsgId(v string) *QueryIotcseTenantdeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseTenantdeviceResponse) SetResultCode(v string) *QueryIotcseTenantdeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseTenantdeviceResponse) SetResultMsg(v string) *QueryIotcseTenantdeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseTenantdeviceResponse) SetRawResponse(v string) *QueryIotcseTenantdeviceResponse {
	s.RawResponse = &v
	return s
}

type UpdateIotcseDevicestatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s UpdateIotcseDevicestatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseDevicestatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateIotcseDevicestatusRequest) SetAuthToken(v string) *UpdateIotcseDevicestatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateIotcseDevicestatusRequest) SetProductInstanceId(v string) *UpdateIotcseDevicestatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateIotcseDevicestatusRequest) SetBizContent(v string) *UpdateIotcseDevicestatusRequest {
	s.BizContent = &v
	return s
}

type UpdateIotcseDevicestatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateIotcseDevicestatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseDevicestatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateIotcseDevicestatusResponse) SetReqMsgId(v string) *UpdateIotcseDevicestatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateIotcseDevicestatusResponse) SetResultCode(v string) *UpdateIotcseDevicestatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateIotcseDevicestatusResponse) SetResultMsg(v string) *UpdateIotcseDevicestatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateIotcseDevicestatusResponse) SetRawResponse(v string) *UpdateIotcseDevicestatusResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseDevicemodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseDevicemodelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseDevicemodelRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseDevicemodelRequest) SetAuthToken(v string) *QueryIotcseDevicemodelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseDevicemodelRequest) SetProductInstanceId(v string) *QueryIotcseDevicemodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseDevicemodelRequest) SetBizContent(v string) *QueryIotcseDevicemodelRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseDevicemodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseDevicemodelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseDevicemodelResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseDevicemodelResponse) SetReqMsgId(v string) *QueryIotcseDevicemodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseDevicemodelResponse) SetResultCode(v string) *QueryIotcseDevicemodelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseDevicemodelResponse) SetResultMsg(v string) *QueryIotcseDevicemodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseDevicemodelResponse) SetRawResponse(v string) *QueryIotcseDevicemodelResponse {
	s.RawResponse = &v
	return s
}

type UpdateIotcseDevicespaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s UpdateIotcseDevicespaceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseDevicespaceRequest) GoString() string {
	return s.String()
}

func (s *UpdateIotcseDevicespaceRequest) SetAuthToken(v string) *UpdateIotcseDevicespaceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateIotcseDevicespaceRequest) SetProductInstanceId(v string) *UpdateIotcseDevicespaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateIotcseDevicespaceRequest) SetBizContent(v string) *UpdateIotcseDevicespaceRequest {
	s.BizContent = &v
	return s
}

type UpdateIotcseDevicespaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateIotcseDevicespaceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateIotcseDevicespaceResponse) GoString() string {
	return s.String()
}

func (s *UpdateIotcseDevicespaceResponse) SetReqMsgId(v string) *UpdateIotcseDevicespaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateIotcseDevicespaceResponse) SetResultCode(v string) *UpdateIotcseDevicespaceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateIotcseDevicespaceResponse) SetResultMsg(v string) *UpdateIotcseDevicespaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateIotcseDevicespaceResponse) SetRawResponse(v string) *UpdateIotcseDevicespaceResponse {
	s.RawResponse = &v
	return s
}

type QueryIotcseEvidencebatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIotcseEvidencebatchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseEvidencebatchRequest) GoString() string {
	return s.String()
}

func (s *QueryIotcseEvidencebatchRequest) SetAuthToken(v string) *QueryIotcseEvidencebatchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIotcseEvidencebatchRequest) SetProductInstanceId(v string) *QueryIotcseEvidencebatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIotcseEvidencebatchRequest) SetBizContent(v string) *QueryIotcseEvidencebatchRequest {
	s.BizContent = &v
	return s
}

type QueryIotcseEvidencebatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryIotcseEvidencebatchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIotcseEvidencebatchResponse) GoString() string {
	return s.String()
}

func (s *QueryIotcseEvidencebatchResponse) SetReqMsgId(v string) *QueryIotcseEvidencebatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIotcseEvidencebatchResponse) SetResultCode(v string) *QueryIotcseEvidencebatchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIotcseEvidencebatchResponse) SetResultMsg(v string) *QueryIotcseEvidencebatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIotcseEvidencebatchResponse) SetRawResponse(v string) *QueryIotcseEvidencebatchResponse {
	s.RawResponse = &v
	return s
}

type QueryBlocrBusinesslicenseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件二进制内容 + base64
	ImageRaw *string `json:"image_raw,omitempty" xml:"image_raw,omitempty"`
	// 图片下载url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 服务调用来源(需要咨询服务提供方)
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
}

func (s QueryBlocrBusinesslicenseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBlocrBusinesslicenseRequest) GoString() string {
	return s.String()
}

func (s *QueryBlocrBusinesslicenseRequest) SetAuthToken(v string) *QueryBlocrBusinesslicenseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBlocrBusinesslicenseRequest) SetProductInstanceId(v string) *QueryBlocrBusinesslicenseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBlocrBusinesslicenseRequest) SetImageRaw(v string) *QueryBlocrBusinesslicenseRequest {
	s.ImageRaw = &v
	return s
}

func (s *QueryBlocrBusinesslicenseRequest) SetImageUrl(v string) *QueryBlocrBusinesslicenseRequest {
	s.ImageUrl = &v
	return s
}

func (s *QueryBlocrBusinesslicenseRequest) SetSource(v string) *QueryBlocrBusinesslicenseRequest {
	s.Source = &v
	return s
}

func (s *QueryBlocrBusinesslicenseRequest) SetTraceId(v string) *QueryBlocrBusinesslicenseRequest {
	s.TraceId = &v
	return s
}

type QueryBlocrBusinesslicenseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 算法错误信息
	AlgoMsg *string `json:"algo_msg,omitempty" xml:"algo_msg,omitempty"`
	// 算法异常错误码
	AlgoRet *int64 `json:"algo_ret,omitempty" xml:"algo_ret,omitempty"`
	// 框架错误信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 算法结果,JSON String
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 框架inference服务错误码，0为正常
	Ret *int64 `json:"ret,omitempty" xml:"ret,omitempty"`
}

func (s QueryBlocrBusinesslicenseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlocrBusinesslicenseResponse) GoString() string {
	return s.String()
}

func (s *QueryBlocrBusinesslicenseResponse) SetReqMsgId(v string) *QueryBlocrBusinesslicenseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetResultCode(v string) *QueryBlocrBusinesslicenseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetResultMsg(v string) *QueryBlocrBusinesslicenseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetAlgoMsg(v string) *QueryBlocrBusinesslicenseResponse {
	s.AlgoMsg = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetAlgoRet(v int64) *QueryBlocrBusinesslicenseResponse {
	s.AlgoRet = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetMessage(v string) *QueryBlocrBusinesslicenseResponse {
	s.Message = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetResult(v string) *QueryBlocrBusinesslicenseResponse {
	s.Result = &v
	return s
}

func (s *QueryBlocrBusinesslicenseResponse) SetRet(v int64) *QueryBlocrBusinesslicenseResponse {
	s.Ret = &v
	return s
}

type QueryInvoicesocrVatinvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件二进制内容 + base64
	ImageRaw *string `json:"image_raw,omitempty" xml:"image_raw,omitempty"`
	// 图片下载url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 服务调用来源(需要咨询服务提供方)
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
}

func (s QueryInvoicesocrVatinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInvoicesocrVatinvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetAuthToken(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetProductInstanceId(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetImageRaw(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.ImageRaw = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetImageUrl(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.ImageUrl = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetSource(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.Source = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetTraceId(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.TraceId = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceRequest) SetFileType(v string) *QueryInvoicesocrVatinvoiceRequest {
	s.FileType = &v
	return s
}

type QueryInvoicesocrVatinvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 算法错误信息
	AlgoMsg *string `json:"algo_msg,omitempty" xml:"algo_msg,omitempty"`
	// 算法异常错误码
	//
	AlgoRet *string `json:"algo_ret,omitempty" xml:"algo_ret,omitempty"`
	// 框架错误信息
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 算法结果,JSON String
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 框架inference服务错误码，0为正常
	Ret *string `json:"ret,omitempty" xml:"ret,omitempty"`
}

func (s QueryInvoicesocrVatinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInvoicesocrVatinvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetReqMsgId(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetResultCode(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetResultMsg(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetAlgoMsg(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.AlgoMsg = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetAlgoRet(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.AlgoRet = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetMessage(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.Message = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetResult(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.Result = &v
	return s
}

func (s *QueryInvoicesocrVatinvoiceResponse) SetRet(v string) *QueryInvoicesocrVatinvoiceResponse {
	s.Ret = &v
	return s
}

type QueryBmpbrowserPrivilegeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 蚂蚁区块链的唯一链id
	//
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 查看权限的支付宝电话号码
	//
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
}

func (s QueryBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *QueryBmpbrowserPrivilegeRequest) SetAuthToken(v string) *QueryBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *QueryBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeRequest) SetBizid(v string) *QueryBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeRequest) SetPhoneNumber(v string) *QueryBmpbrowserPrivilegeRequest {
	s.PhoneNumber = &v
	return s
}

type QueryBmpbrowserPrivilegeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权限成功与否
	//
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *QueryBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *QueryBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeResponse) SetResultCode(v string) *QueryBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeResponse) SetResultMsg(v string) *QueryBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBmpbrowserPrivilegeResponse) SetStatus(v int64) *QueryBmpbrowserPrivilegeResponse {
	s.Status = &v
	return s
}

type CancelBmpbrowserPrivilegeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 蚂蚁区块链的唯一链id
	//
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty" require:"true"`
	// 取消查看权限的支付宝电话号码集合
	//
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true"`
}

func (s CancelBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *CancelBmpbrowserPrivilegeRequest) SetAuthToken(v string) *CancelBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *CancelBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeRequest) SetBizid(v string) *CancelBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeRequest) SetPhoneNumbers(v string) *CancelBmpbrowserPrivilegeRequest {
	s.PhoneNumbers = &v
	return s
}

type CancelBmpbrowserPrivilegeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量取消权限成功与否
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CancelBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *CancelBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *CancelBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeResponse) SetResultCode(v string) *CancelBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeResponse) SetResultMsg(v string) *CancelBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelBmpbrowserPrivilegeResponse) SetStatus(v int64) *CancelBmpbrowserPrivilegeResponse {
	s.Status = &v
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
				"sdk_version":      tea.String("1.1.2"),
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
 * Description: 链上交易移动端权限修改
 * Summary: 链上交易移动端权限修改
 */
func (client *Client) UpdateBmpbrowserPrivilege(request *UpdateBmpbrowserPrivilegeRequest) (_result *UpdateBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBmpbrowserPrivilegeResponse{}
	_body, _err := client.UpdateBmpbrowserPrivilegeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上交易移动端权限修改
 * Summary: 链上交易移动端权限修改
 */
func (client *Client) UpdateBmpbrowserPrivilegeEx(request *UpdateBmpbrowserPrivilegeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
 * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalmask(request *QueryIndividualidInternalmaskRequest) (_result *QueryIndividualidInternalmaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidInternalmaskResponse{}
	_body, _err := client.QueryIndividualidInternalmaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
 * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalmaskEx(request *QueryIndividualidInternalmaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidInternalmaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidInternalmaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalmask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternalfourmeta(request *QueryEnterpriseidInternalfourmetaRequest) (_result *QueryEnterpriseidInternalfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseidInternalfourmetaResponse{}
	_body, _err := client.QueryEnterpriseidInternalfourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternalfourmetaEx(request *QueryEnterpriseidInternalfourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseidInternalfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseidInternalfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internalfourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternalthreemeta(request *QueryEnterpriseidInternalthreemetaRequest) (_result *QueryEnterpriseidInternalthreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseidInternalthreemetaResponse{}
	_body, _err := client.QueryEnterpriseidInternalthreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternalthreemetaEx(request *QueryEnterpriseidInternalthreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseidInternalthreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseidInternalthreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internalthreemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternaltwometa(request *QueryEnterpriseidInternaltwometaRequest) (_result *QueryEnterpriseidInternaltwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseidInternaltwometaResponse{}
	_body, _err := client.QueryEnterpriseidInternaltwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素（数据来自数据枢纽）
 */
func (client *Client) QueryEnterpriseidInternaltwometaEx(request *QueryEnterpriseidInternaltwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseidInternaltwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseidInternaltwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internaltwometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证初始化
 * Summary: 企业认证四要素-法人实人认证初始化
 */
func (client *Client) InitEnterpriseidFaceauth(request *InitEnterpriseidFaceauthRequest) (_result *InitEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEnterpriseidFaceauthResponse{}
	_body, _err := client.InitEnterpriseidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证初始化
 * Summary: 企业认证四要素-法人实人认证初始化
 */
func (client *Client) InitEnterpriseidFaceauthEx(request *InitEnterpriseidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业认证四要素—法人实人认证结果
 * Summary: 查询企业认证四要素—法人实人认证结果
 */
func (client *Client) QueryEnterpriseidFaceauth(request *QueryEnterpriseidFaceauthRequest) (_result *QueryEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseidFaceauthResponse{}
	_body, _err := client.QueryEnterpriseidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业认证四要素—法人实人认证结果
 * Summary: 查询企业认证四要素—法人实人认证结果
 */
func (client *Client) QueryEnterpriseidFaceauthEx(request *QueryEnterpriseidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实名认证四要素
 * Summary: 个人实名认证四要素（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalfourmeta(request *QueryIndividualidInternalfourmetaRequest) (_result *QueryIndividualidInternalfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidInternalfourmetaResponse{}
	_body, _err := client.QueryIndividualidInternalfourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实名认证四要素
 * Summary: 个人实名认证四要素（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalfourmetaEx(request *QueryIndividualidInternalfourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidInternalfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidInternalfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalfourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实名认证三要素
 * Summary: 个人实名认证三要素（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalthreemeta(request *QueryIndividualidInternalthreemetaRequest) (_result *QueryIndividualidInternalthreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidInternalthreemetaResponse{}
	_body, _err := client.QueryIndividualidInternalthreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实名认证三要素
 * Summary: 个人实名认证三要素（数据来自蚁盾）
 */
func (client *Client) QueryIndividualidInternalthreemetaEx(request *QueryIndividualidInternalthreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidInternalthreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidInternalthreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalthreemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实名认证二要素
 * Summary: 个人实名认证二要素
 */
func (client *Client) QueryIndividualidInternaltwometa(request *QueryIndividualidInternaltwometaRequest) (_result *QueryIndividualidInternaltwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidInternaltwometaResponse{}
	_body, _err := client.QueryIndividualidInternaltwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实名认证二要素
 * Summary: 个人实名认证二要素
 */
func (client *Client) QueryIndividualidInternaltwometaEx(request *QueryIndividualidInternaltwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidInternaltwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidInternaltwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internaltwometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发起内容评估（BAI），仅内部调用
 * Summary: 发起内容评估
 */
func (client *Client) CreateBaicorpInternalevaluationasync(request *CreateBaicorpInternalevaluationasyncRequest) (_result *CreateBaicorpInternalevaluationasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.CreateBaicorpInternalevaluationasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发起内容评估（BAI），仅内部调用
 * Summary: 发起内容评估
 */
func (client *Client) CreateBaicorpInternalevaluationasyncEx(request *CreateBaicorpInternalevaluationasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaicorpInternalevaluationasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalevaluationasync.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交内容监测任务
 * Summary: 提交内容监测任务接口
 */
func (client *Client) CreateBaicorpInternalmonitorasync(request *CreateBaicorpInternalmonitorasyncRequest) (_result *CreateBaicorpInternalmonitorasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.CreateBaicorpInternalmonitorasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交内容监测任务
 * Summary: 提交内容监测任务接口
 */
func (client *Client) CreateBaicorpInternalmonitorasyncEx(request *CreateBaicorpInternalmonitorasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaicorpInternalmonitorasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalmonitorasync.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询内容评估结果
 * Summary: 查询内容评估结果
 */
func (client *Client) QueryBaicorpInternalevaluationasync(request *QueryBaicorpInternalevaluationasyncRequest) (_result *QueryBaicorpInternalevaluationasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.QueryBaicorpInternalevaluationasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询内容评估结果
 * Summary: 查询内容评估结果
 */
func (client *Client) QueryBaicorpInternalevaluationasyncEx(request *QueryBaicorpInternalevaluationasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaicorpInternalevaluationasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalevaluationasync.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询内容监测任务结果
 * Summary: 查询内容监测任务结果
 */
func (client *Client) QueryBaicorpInternalmonitorasync(request *QueryBaicorpInternalmonitorasyncRequest) (_result *QueryBaicorpInternalmonitorasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.QueryBaicorpInternalmonitorasyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询内容监测任务结果
 * Summary: 查询内容监测任务结果
 */
func (client *Client) QueryBaicorpInternalmonitorasyncEx(request *QueryBaicorpInternalmonitorasyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaicorpInternalmonitorasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalmonitorasync.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证开始
 * Summary: 企业认证四要素-法人实人认证开始
 */
func (client *Client) CertifyEnterpriseidFaceauth(request *CertifyEnterpriseidFaceauthRequest) (_result *CertifyEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyEnterpriseidFaceauthResponse{}
	_body, _err := client.CertifyEnterpriseidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证开始
 * Summary: 企业认证四要素-法人实人认证开始
 */
func (client *Client) CertifyEnterpriseidFaceauthEx(request *CertifyEnterpriseidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——认证初始化
 * Summary: 个人实人刷脸认证-认证初始化
 */
func (client *Client) InitIndividualidFaceauth(request *InitIndividualidFaceauthRequest) (_result *InitIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIndividualidFaceauthResponse{}
	_body, _err := client.InitIndividualidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——认证初始化
 * Summary: 个人实人刷脸认证-认证初始化
 */
func (client *Client) InitIndividualidFaceauthEx(request *InitIndividualidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——认证开始
 * Summary: 个人实人刷脸认证-认证开始
 */
func (client *Client) CertifyIndividualidFaceauth(request *CertifyIndividualidFaceauthRequest) (_result *CertifyIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyIndividualidFaceauthResponse{}
	_body, _err := client.CertifyIndividualidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——认证开始
 * Summary: 个人实人刷脸认证-认证开始
 */
func (client *Client) CertifyIndividualidFaceauthEx(request *CertifyIndividualidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——查询认证结果
 * Summary: 个人实人刷脸认证-查询认证结果
 */
func (client *Client) QueryIndividualidFaceauth(request *QueryIndividualidFaceauthRequest) (_result *QueryIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidFaceauthResponse{}
	_body, _err := client.QueryIndividualidFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证——查询认证结果
 * Summary: 个人实人刷脸认证-查询认证结果
 */
func (client *Client) QueryIndividualidFaceauthEx(request *QueryIndividualidFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取区块链当前块高
 * Summary: 区块链数据服务-获取区块链当前块高
 */
func (client *Client) GetDataserviceBlockchainheight(request *GetDataserviceBlockchainheightRequest) (_result *GetDataserviceBlockchainheightResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDataserviceBlockchainheightResponse{}
	_body, _err := client.GetDataserviceBlockchainheightEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取区块链当前块高
 * Summary: 区块链数据服务-获取区块链当前块高
 */
func (client *Client) GetDataserviceBlockchainheightEx(request *GetDataserviceBlockchainheightRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDataserviceBlockchainheightResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDataserviceBlockchainheightResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.blockchainheight.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取链交易总数
 * Summary: 区块链数据服务-获取链交易总数
 */
func (client *Client) GetDataserviceTransactioncount(request *GetDataserviceTransactioncountRequest) (_result *GetDataserviceTransactioncountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDataserviceTransactioncountResponse{}
	_body, _err := client.GetDataserviceTransactioncountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取链交易总数
 * Summary: 区块链数据服务-获取链交易总数
 */
func (client *Client) GetDataserviceTransactioncountEx(request *GetDataserviceTransactioncountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDataserviceTransactioncountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDataserviceTransactioncountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.transactioncount.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据交易hash获取交易详情
 * Summary: 区块链数据服务-获取交易详情
 */
func (client *Client) GetDataserviceTransactioninfo(request *GetDataserviceTransactioninfoRequest) (_result *GetDataserviceTransactioninfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDataserviceTransactioninfoResponse{}
	_body, _err := client.GetDataserviceTransactioninfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据交易hash获取交易详情
 * Summary: 区块链数据服务-获取交易详情
 */
func (client *Client) GetDataserviceTransactioninfoEx(request *GetDataserviceTransactioninfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDataserviceTransactioninfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDataserviceTransactioninfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.transactioninfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取链最近n条块信息
 * Summary: 区块链数据服务-获取链最近n条块信息
 */
func (client *Client) ListDataserviceLastblocks(request *ListDataserviceLastblocksRequest) (_result *ListDataserviceLastblocksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListDataserviceLastblocksResponse{}
	_body, _err := client.ListDataserviceLastblocksEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取链最近n条块信息
 * Summary: 区块链数据服务-获取链最近n条块信息
 */
func (client *Client) ListDataserviceLastblocksEx(request *ListDataserviceLastblocksRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListDataserviceLastblocksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListDataserviceLastblocksResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.lastblocks.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信时间服务——获取时间凭证
 * Summary: 可信时间凭证服务-获取时间凭证
 */
func (client *Client) GetTasAttestation(request *GetTasAttestationRequest) (_result *GetTasAttestationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTasAttestationResponse{}
	_body, _err := client.GetTasAttestationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信时间服务——获取时间凭证
 * Summary: 可信时间凭证服务-获取时间凭证
 */
func (client *Client) GetTasAttestationEx(request *GetTasAttestationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTasAttestationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTasAttestationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.attestation.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信时间 ——校验时间凭证接口
 * Summary: 可信时间凭证服务-校验时间凭证接口
 */
func (client *Client) VerifyTasCtsr(request *VerifyTasCtsrRequest) (_result *VerifyTasCtsrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyTasCtsrResponse{}
	_body, _err := client.VerifyTasCtsrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信时间 ——校验时间凭证接口
 * Summary: 可信时间凭证服务-校验时间凭证接口
 */
func (client *Client) VerifyTasCtsrEx(request *VerifyTasCtsrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyTasCtsrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyTasCtsrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.ctsr.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过sn下载时间凭证证书（pdf格式）
 * Summary: 可信时间凭证服务-下载时间凭证证书
 */
func (client *Client) GetTasCertificate(request *GetTasCertificateRequest) (_result *GetTasCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTasCertificateResponse{}
	_body, _err := client.GetTasCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过sn下载时间凭证证书（pdf格式）
 * Summary: 可信时间凭证服务-下载时间凭证证书
 */
func (client *Client) GetTasCertificateEx(request *GetTasCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTasCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTasCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信时间——获取带事务的时间凭证
 * Summary: 可信时间——获取带事务的时间凭证
 */
func (client *Client) GetTasTransactionattestation(request *GetTasTransactionattestationRequest) (_result *GetTasTransactionattestationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTasTransactionattestationResponse{}
	_body, _err := client.GetTasTransactionattestationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信时间——获取带事务的时间凭证
 * Summary: 可信时间——获取带事务的时间凭证
 */
func (client *Client) GetTasTransactionattestationEx(request *GetTasTransactionattestationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTasTransactionattestationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTasTransactionattestationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.transactionattestation.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素
 */
func (client *Client) QueryEverifyFourmeta(request *QueryEverifyFourmetaRequest) (_result *QueryEverifyFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyFourmetaResponse{}
	_body, _err := client.QueryEverifyFourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素
 */
func (client *Client) QueryEverifyFourmetaEx(request *QueryEverifyFourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.fourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素
 */
func (client *Client) QueryEverifyThreemeta(request *QueryEverifyThreemetaRequest) (_result *QueryEverifyThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyThreemetaResponse{}
	_body, _err := client.QueryEverifyThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素
 */
func (client *Client) QueryEverifyThreemetaEx(request *QueryEverifyThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.threemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素
 */
func (client *Client) QueryEverifyTwometa(request *QueryEverifyTwometaRequest) (_result *QueryEverifyTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyTwometaResponse{}
	_body, _err := client.QueryEverifyTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素
 */
func (client *Client) QueryEverifyTwometaEx(request *QueryEverifyTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.twometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容搜索查询接口
 * Summary: 内容搜索查询接口
 */
func (client *Client) QueryBaicorpInternalsearchlibrary(request *QueryBaicorpInternalsearchlibraryRequest) (_result *QueryBaicorpInternalsearchlibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.QueryBaicorpInternalsearchlibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容搜索查询接口
 * Summary: 内容搜索查询接口
 */
func (client *Client) QueryBaicorpInternalsearchlibraryEx(request *QueryBaicorpInternalsearchlibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaicorpInternalsearchlibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalsearchlibrary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新检索
 * Summary: 更新检索
 */
func (client *Client) UpdateBaicorpInternalsearchlibrary(request *UpdateBaicorpInternalsearchlibraryRequest) (_result *UpdateBaicorpInternalsearchlibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.UpdateBaicorpInternalsearchlibraryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新检索
 * Summary: 更新检索
 */
func (client *Client) UpdateBaicorpInternalsearchlibraryEx(request *UpdateBaicorpInternalsearchlibraryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBaicorpInternalsearchlibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalsearchlibrary.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对公打款-总行查询
 * Summary: 对公打款-总行查询
 */
func (client *Client) QueryEpayauthRootbank(request *QueryEpayauthRootbankRequest) (_result *QueryEpayauthRootbankResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEpayauthRootbankResponse{}
	_body, _err := client.QueryEpayauthRootbankEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对公打款-总行查询
 * Summary: 对公打款-总行查询
 */
func (client *Client) QueryEpayauthRootbankEx(request *QueryEpayauthRootbankRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEpayauthRootbankResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEpayauthRootbankResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.rootbank.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
 * Summary: 业务申请保护
 */
func (client *Client) QueryYdapplyprotEcapply(request *QueryYdapplyprotEcapplyRequest) (_result *QueryYdapplyprotEcapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdapplyprotEcapplyResponse{}
	_body, _err := client.QueryYdapplyprotEcapplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
 * Summary: 业务申请保护
 */
func (client *Client) QueryYdapplyprotEcapplyEx(request *QueryYdapplyprotEcapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdapplyprotEcapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdapplyprotEcapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydapplyprot.ecapply.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
 * Summary: 先享后付保护
 */
func (client *Client) QueryYdpacprotEcpac(request *QueryYdpacprotEcpacRequest) (_result *QueryYdpacprotEcpacResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdpacprotEcpacResponse{}
	_body, _err := client.QueryYdpacprotEcpacEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
 * Summary: 先享后付保护
 */
func (client *Client) QueryYdpacprotEcpacEx(request *QueryYdpacprotEcpacRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdpacprotEcpacResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdpacprotEcpacResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydpacprot.ecpac.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotTwometa(request *QueryYdauthprotTwometaRequest) (_result *QueryYdauthprotTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdauthprotTwometaResponse{}
	_body, _err := client.QueryYdauthprotTwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotTwometaEx(request *QueryYdauthprotTwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdauthprotTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdauthprotTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.twometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotThreemeta(request *QueryYdauthprotThreemetaRequest) (_result *QueryYdauthprotThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdauthprotThreemetaResponse{}
	_body, _err := client.QueryYdauthprotThreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotThreemetaEx(request *QueryYdauthprotThreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdauthprotThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdauthprotThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.threemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotFourmeta(request *QueryYdauthprotFourmetaRequest) (_result *QueryYdauthprotFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdauthprotFourmetaResponse{}
	_body, _err := client.QueryYdauthprotFourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
 * Summary: 身份认证保护
 */
func (client *Client) QueryYdauthprotFourmetaEx(request *QueryYdauthprotFourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdauthprotFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdauthprotFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.fourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销保护
 * Summary: 营销保护
 */
func (client *Client) QueryYdmktprotEcmarketcampaign(request *QueryYdmktprotEcmarketcampaignRequest) (_result *QueryYdmktprotEcmarketcampaignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdmktprotEcmarketcampaignResponse{}
	_body, _err := client.QueryYdmktprotEcmarketcampaignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销保护
 * Summary: 营销保护
 */
func (client *Client) QueryYdmktprotEcmarketcampaignEx(request *QueryYdmktprotEcmarketcampaignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdmktprotEcmarketcampaignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdmktprotEcmarketcampaignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydmktprot.ecmarketcampaign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册保护
 * Summary: 注册保护
 */
func (client *Client) QueryYdregprotEcregister(request *QueryYdregprotEcregisterRequest) (_result *QueryYdregprotEcregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryYdregprotEcregisterResponse{}
	_body, _err := client.QueryYdregprotEcregisterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册保护
 * Summary: 注册保护
 */
func (client *Client) QueryYdregprotEcregisterEx(request *QueryYdregprotEcregisterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryYdregprotEcregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryYdregprotEcregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydregprot.ecregister.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
 * Summary: 支行查询
 */
func (client *Client) QueryEpayauthBranchbank(request *QueryEpayauthBranchbankRequest) (_result *QueryEpayauthBranchbankResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEpayauthBranchbankResponse{}
	_body, _err := client.QueryEpayauthBranchbankEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
 * Summary: 支行查询
 */
func (client *Client) QueryEpayauthBranchbankEx(request *QueryEpayauthBranchbankRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEpayauthBranchbankResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEpayauthBranchbankResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.branchbank.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
 * Summary: 行政地区编码查询
 */
func (client *Client) QueryEpayauthDistrict(request *QueryEpayauthDistrictRequest) (_result *QueryEpayauthDistrictResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEpayauthDistrictResponse{}
	_body, _err := client.QueryEpayauthDistrictEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
 * Summary: 行政地区编码查询
 */
func (client *Client) QueryEpayauthDistrictEx(request *QueryEpayauthDistrictRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEpayauthDistrictResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEpayauthDistrictResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.district.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
 * Summary: 发起打款验证申请
 */
func (client *Client) InitEpayauthVerify(request *InitEpayauthVerifyRequest) (_result *InitEpayauthVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEpayauthVerifyResponse{}
	_body, _err := client.InitEpayauthVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
 * Summary: 发起打款验证申请
 */
func (client *Client) InitEpayauthVerifyEx(request *InitEpayauthVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEpayauthVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEpayauthVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
 * Summary: 打款验证金额校验
 */
func (client *Client) QueryEpayauthVerify(request *QueryEpayauthVerifyRequest) (_result *QueryEpayauthVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEpayauthVerifyResponse{}
	_body, _err := client.QueryEpayauthVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
 * Summary: 打款验证金额校验
 */
func (client *Client) QueryEpayauthVerifyEx(request *QueryEpayauthVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEpayauthVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEpayauthVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.verify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
 * Summary: 链上交易二维码生成
 */
func (client *Client) QueryBmpbrowserTransactionqrcode(request *QueryBmpbrowserTransactionqrcodeRequest) (_result *QueryBmpbrowserTransactionqrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBmpbrowserTransactionqrcodeResponse{}
	_body, _err := client.QueryBmpbrowserTransactionqrcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
 * Summary: 链上交易二维码生成
 */
func (client *Client) QueryBmpbrowserTransactionqrcodeEx(request *QueryBmpbrowserTransactionqrcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBmpbrowserTransactionqrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBmpbrowserTransactionqrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.transactionqrcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
 * Summary: 批量开通 链上交易移动端查看权限
 */
func (client *Client) AddBmpbrowserPrivilege(request *AddBmpbrowserPrivilegeRequest) (_result *AddBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddBmpbrowserPrivilegeResponse{}
	_body, _err := client.AddBmpbrowserPrivilegeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
 * Summary: 批量开通 链上交易移动端查看权限
 */
func (client *Client) AddBmpbrowserPrivilegeEx(request *AddBmpbrowserPrivilegeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 身份证信息识别
 * Summary: 身份证信息识别
 */
func (client *Client) QueryIdcocrIdcard(request *QueryIdcocrIdcardRequest) (_result *QueryIdcocrIdcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIdcocrIdcardResponse{}
	_body, _err := client.QueryIdcocrIdcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 身份证信息识别
 * Summary: 身份证信息识别
 */
func (client *Client) QueryIdcocrIdcardEx(request *QueryIdcocrIdcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIdcocrIdcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIdcocrIdcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.idcocr.idcard.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请证书
 * Summary: 申请证书
 */
func (client *Client) InitCaCertificate(request *InitCaCertificateRequest) (_result *InitCaCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCaCertificateResponse{}
	_body, _err := client.InitCaCertificateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请证书
 * Summary: 申请证书
 */
func (client *Client) InitCaCertificateEx(request *InitCaCertificateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCaCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCaCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ca.certificate.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
 * Summary: 内容风险识别接口服务
 */
func (client *Client) InitContentriskInternal(request *InitContentriskInternalRequest) (_result *InitContentriskInternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitContentriskInternalResponse{}
	_body, _err := client.InitContentriskInternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
 * Summary: 内容风险识别接口服务
 */
func (client *Client) InitContentriskInternalEx(request *InitContentriskInternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitContentriskInternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitContentriskInternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.contentrisk.internal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
 * Summary: 内容风险识别结果查询接口服务
 */
func (client *Client) QueryContentriskInternal(request *QueryContentriskInternalRequest) (_result *QueryContentriskInternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryContentriskInternalResponse{}
	_body, _err := client.QueryContentriskInternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
 * Summary: 内容风险识别结果查询接口服务
 */
func (client *Client) QueryContentriskInternalEx(request *QueryContentriskInternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryContentriskInternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContentriskInternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.contentrisk.internal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人认证服务端比对-认证开始
 * Summary: 个人实人认证服务端比对-认证开始
 */
func (client *Client) InitIndividualidImageauth(request *InitIndividualidImageauthRequest) (_result *InitIndividualidImageauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIndividualidImageauthResponse{}
	_body, _err := client.InitIndividualidImageauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人认证服务端比对-认证开始
 * Summary: 个人实人认证服务端比对-认证开始
 */
func (client *Client) InitIndividualidImageauthEx(request *InitIndividualidImageauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIndividualidImageauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIndividualidImageauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.imageauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 访问账户生成
 * Summary: 访问账户生成
 */
func (client *Client) AddIotcseAccount(request *AddIotcseAccountRequest) (_result *AddIotcseAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddIotcseAccountResponse{}
	_body, _err := client.AddIotcseAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 访问账户生成
 * Summary: 访问账户生成
 */
func (client *Client) AddIotcseAccountEx(request *AddIotcseAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddIotcseAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddIotcseAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.account.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 存证上链
 * Summary: 存证上链
 */
func (client *Client) SaveIotcseEvidence(request *SaveIotcseEvidenceRequest) (_result *SaveIotcseEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveIotcseEvidenceResponse{}
	_body, _err := client.SaveIotcseEvidenceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 存证上链
 * Summary: 存证上链
 */
func (client *Client) SaveIotcseEvidenceEx(request *SaveIotcseEvidenceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveIotcseEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveIotcseEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidence.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 存证上链查询
 * Summary: 存证上链查询
 */
func (client *Client) QueryIotcseEvidence(request *QueryIotcseEvidenceRequest) (_result *QueryIotcseEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseEvidenceResponse{}
	_body, _err := client.QueryIotcseEvidenceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 存证上链查询
 * Summary: 存证上链查询
 */
func (client *Client) QueryIotcseEvidenceEx(request *QueryIotcseEvidenceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidence.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代理创建企业did
 * Summary: 代理创建企业did
 */
func (client *Client) CreateDidCorporatedidagent(request *CreateDidCorporatedidagentRequest) (_result *CreateDidCorporatedidagentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDidCorporatedidagentResponse{}
	_body, _err := client.CreateDidCorporatedidagentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代理创建企业did
 * Summary: 代理创建企业did
 */
func (client *Client) CreateDidCorporatedidagentEx(request *CreateDidCorporatedidagentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDidCorporatedidagentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDidCorporatedidagentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.did.corporatedidagent.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-认证初始化
 * Summary: 个人实人刷脸认证-认证初始化
 */
func (client *Client) InitIndividualidFaceauthinternal(request *InitIndividualidFaceauthinternalRequest) (_result *InitIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitIndividualidFaceauthinternalResponse{}
	_body, _err := client.InitIndividualidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-认证初始化
 * Summary: 个人实人刷脸认证-认证初始化
 */
func (client *Client) InitIndividualidFaceauthinternalEx(request *InitIndividualidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-认证开始
 * Summary: 个人实人刷脸认证-认证开始
 */
func (client *Client) CertifyIndividualidFaceauthinternal(request *CertifyIndividualidFaceauthinternalRequest) (_result *CertifyIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyIndividualidFaceauthinternalResponse{}
	_body, _err := client.CertifyIndividualidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-认证开始
 * Summary: 个人实人刷脸认证-认证开始
 */
func (client *Client) CertifyIndividualidFaceauthinternalEx(request *CertifyIndividualidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-查询认证结果
 * Summary: 个人实人刷脸认证-查询认证结果
 */
func (client *Client) QueryIndividualidFaceauthinternal(request *QueryIndividualidFaceauthinternalRequest) (_result *QueryIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualidFaceauthinternalResponse{}
	_body, _err := client.QueryIndividualidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人实人刷脸认证-查询认证结果
 * Summary: 个人实人刷脸认证-查询认证结果
 */
func (client *Client) QueryIndividualidFaceauthinternalEx(request *QueryIndividualidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证初始化
 * Summary: 企业认证四要素-法人实人认证初始化
 */
func (client *Client) InitEnterpriseidFaceauthinternal(request *InitEnterpriseidFaceauthinternalRequest) (_result *InitEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.InitEnterpriseidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证初始化
 * Summary: 企业认证四要素-法人实人认证初始化
 */
func (client *Client) InitEnterpriseidFaceauthinternalEx(request *InitEnterpriseidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证开始
 * Summary: 企业认证四要素-法人实人认证开始
 */
func (client *Client) CertifyEnterpriseidFaceauthinternal(request *CertifyEnterpriseidFaceauthinternalRequest) (_result *CertifyEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CertifyEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.CertifyEnterpriseidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素-法人实人认证开始
 * Summary: 企业认证四要素-法人实人认证开始
 */
func (client *Client) CertifyEnterpriseidFaceauthinternalEx(request *CertifyEnterpriseidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CertifyEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素
 */
func (client *Client) QueryEverifyTwometainternal(request *QueryEverifyTwometainternalRequest) (_result *QueryEverifyTwometainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyTwometainternalResponse{}
	_body, _err := client.QueryEverifyTwometainternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证二要素
 * Summary: 企业认证二要素
 */
func (client *Client) QueryEverifyTwometainternalEx(request *QueryEverifyTwometainternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyTwometainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyTwometainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.twometainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素
 */
func (client *Client) QueryEverifyThreemetainternal(request *QueryEverifyThreemetainternalRequest) (_result *QueryEverifyThreemetainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyThreemetainternalResponse{}
	_body, _err := client.QueryEverifyThreemetainternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证三要素
 * Summary: 企业认证三要素
 */
func (client *Client) QueryEverifyThreemetainternalEx(request *QueryEverifyThreemetainternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyThreemetainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyThreemetainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.threemetainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素
 */
func (client *Client) QueryEverifyFourmetainternal(request *QueryEverifyFourmetainternalRequest) (_result *QueryEverifyFourmetainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEverifyFourmetainternalResponse{}
	_body, _err := client.QueryEverifyFourmetainternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证四要素
 * Summary: 企业认证四要素
 */
func (client *Client) QueryEverifyFourmetainternalEx(request *QueryEverifyFourmetainternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEverifyFourmetainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEverifyFourmetainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.fourmetainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业认证四要素—法人实人认证结果
 * Summary: 查询企业认证四要素—法人实人认证结果
 */
func (client *Client) QueryEnterpriseidFaceauthinternal(request *QueryEnterpriseidFaceauthinternalRequest) (_result *QueryEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.QueryEnterpriseidFaceauthinternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业认证四要素—法人实人认证结果
 * Summary: 查询企业认证四要素—法人实人认证结果
 */
func (client *Client) QueryEnterpriseidFaceauthinternalEx(request *QueryEnterpriseidFaceauthinternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份注册
 * Summary: 物联网区块链身份注册
 */
func (client *Client) AddIotcseThingsdid(request *AddIotcseThingsdidRequest) (_result *AddIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddIotcseThingsdidResponse{}
	_body, _err := client.AddIotcseThingsdidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份注册
 * Summary: 物联网区块链身份注册
 */
func (client *Client) AddIotcseThingsdidEx(request *AddIotcseThingsdidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份更新
 * Summary: 物联网区块链身份更新
 */
func (client *Client) UpdateIotcseThingsdid(request *UpdateIotcseThingsdidRequest) (_result *UpdateIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateIotcseThingsdidResponse{}
	_body, _err := client.UpdateIotcseThingsdidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份更新
 * Summary: 物联网区块链身份更新
 */
func (client *Client) UpdateIotcseThingsdidEx(request *UpdateIotcseThingsdidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份查询
 * Summary: 物联网区块链身份查询
 */
func (client *Client) QueryIotcseThingsdid(request *QueryIotcseThingsdidRequest) (_result *QueryIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseThingsdidResponse{}
	_body, _err := client.QueryIotcseThingsdidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份查询
 * Summary: 物联网区块链身份查询
 */
func (client *Client) QueryIotcseThingsdidEx(request *QueryIotcseThingsdidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 异步轮询请求
智能合约执行完后异步轮询
 * Summary: 异步轮询请求
*/
func (client *Client) QueryIotcseAsyncprocess(request *QueryIotcseAsyncprocessRequest) (_result *QueryIotcseAsyncprocessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseAsyncprocessResponse{}
	_body, _err := client.QueryIotcseAsyncprocessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 异步轮询请求
智能合约执行完后异步轮询
 * Summary: 异步轮询请求
*/
func (client *Client) QueryIotcseAsyncprocessEx(request *QueryIotcseAsyncprocessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseAsyncprocessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseAsyncprocessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.asyncprocess.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份分组
 * Summary: 物联网区块链身份分组
 */
func (client *Client) ExecIotcseGroup(request *ExecIotcseGroupRequest) (_result *ExecIotcseGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecIotcseGroupResponse{}
	_body, _err := client.ExecIotcseGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份分组
 * Summary: 物联网区块链身份分组
 */
func (client *Client) ExecIotcseGroupEx(request *ExecIotcseGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecIotcseGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecIotcseGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.group.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链分组设备查询
 * Summary: 物联网区块链分组设备查询
 */
func (client *Client) QueryIotcseGroupdevice(request *QueryIotcseGroupdeviceRequest) (_result *QueryIotcseGroupdeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseGroupdeviceResponse{}
	_body, _err := client.QueryIotcseGroupdeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链分组设备查询
 * Summary: 物联网区块链分组设备查询
 */
func (client *Client) QueryIotcseGroupdeviceEx(request *QueryIotcseGroupdeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseGroupdeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseGroupdeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.groupdevice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备分组查询
 * Summary: 物联网区块链身份设备分组查询
 */
func (client *Client) QueryIotcseDevicegroup(request *QueryIotcseDevicegroupRequest) (_result *QueryIotcseDevicegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseDevicegroupResponse{}
	_body, _err := client.QueryIotcseDevicegroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备分组查询
 * Summary: 物联网区块链身份设备分组查询
 */
func (client *Client) QueryIotcseDevicegroupEx(request *QueryIotcseDevicegroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseDevicegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseDevicegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicegroup.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份租户设备查询
 * Summary: 物联网区块链身份租户设备查询
 */
func (client *Client) QueryIotcseTenantdevice(request *QueryIotcseTenantdeviceRequest) (_result *QueryIotcseTenantdeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseTenantdeviceResponse{}
	_body, _err := client.QueryIotcseTenantdeviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份租户设备查询
 * Summary: 物联网区块链身份租户设备查询
 */
func (client *Client) QueryIotcseTenantdeviceEx(request *QueryIotcseTenantdeviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseTenantdeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseTenantdeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.tenantdevice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备状态更新
 * Summary: 物联网区块链身份设备状态更新
 */
func (client *Client) UpdateIotcseDevicestatus(request *UpdateIotcseDevicestatusRequest) (_result *UpdateIotcseDevicestatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateIotcseDevicestatusResponse{}
	_body, _err := client.UpdateIotcseDevicestatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备状态更新
 * Summary: 物联网区块链身份设备状态更新
 */
func (client *Client) UpdateIotcseDevicestatusEx(request *UpdateIotcseDevicestatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateIotcseDevicestatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateIotcseDevicestatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicestatus.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备物模型查询
 * Summary: 物联网区块链身份设备物模型查询
 */
func (client *Client) QueryIotcseDevicemodel(request *QueryIotcseDevicemodelRequest) (_result *QueryIotcseDevicemodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseDevicemodelResponse{}
	_body, _err := client.QueryIotcseDevicemodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备物模型查询
 * Summary: 物联网区块链身份设备物模型查询
 */
func (client *Client) QueryIotcseDevicemodelEx(request *QueryIotcseDevicemodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseDevicemodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseDevicemodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicemodel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备空间关联
 * Summary: 物联网区块链身份设备空间关联
 */
func (client *Client) UpdateIotcseDevicespace(request *UpdateIotcseDevicespaceRequest) (_result *UpdateIotcseDevicespaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateIotcseDevicespaceResponse{}
	_body, _err := client.UpdateIotcseDevicespaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份设备空间关联
 * Summary: 物联网区块链身份设备空间关联
 */
func (client *Client) UpdateIotcseDevicespaceEx(request *UpdateIotcseDevicespaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateIotcseDevicespaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateIotcseDevicespaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicespace.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 物联网区块链身份批量存证数据读取
 * Summary: 物联网区块链身份批量存证数据读取
 */
func (client *Client) QueryIotcseEvidencebatch(request *QueryIotcseEvidencebatchRequest) (_result *QueryIotcseEvidencebatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIotcseEvidencebatchResponse{}
	_body, _err := client.QueryIotcseEvidencebatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 物联网区块链身份批量存证数据读取
 * Summary: 物联网区块链身份批量存证数据读取
 */
func (client *Client) QueryIotcseEvidencebatchEx(request *QueryIotcseEvidencebatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIotcseEvidencebatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIotcseEvidencebatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidencebatch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI认知服务营业执照ocr服务
 * Summary: AI认知服务营业执照ocr服务
 */
func (client *Client) QueryBlocrBusinesslicense(request *QueryBlocrBusinesslicenseRequest) (_result *QueryBlocrBusinesslicenseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBlocrBusinesslicenseResponse{}
	_body, _err := client.QueryBlocrBusinesslicenseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI认知服务营业执照ocr服务
 * Summary: AI认知服务营业执照ocr服务
 */
func (client *Client) QueryBlocrBusinesslicenseEx(request *QueryBlocrBusinesslicenseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBlocrBusinesslicenseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBlocrBusinesslicenseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.blocr.businesslicense.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AI认知服务增值税发票ocr识别
 * Summary: AI认知服务增值税发票ocr识别
 */
func (client *Client) QueryInvoicesocrVatinvoice(request *QueryInvoicesocrVatinvoiceRequest) (_result *QueryInvoicesocrVatinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInvoicesocrVatinvoiceResponse{}
	_body, _err := client.QueryInvoicesocrVatinvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AI认知服务增值税发票ocr识别
 * Summary: AI认知服务增值税发票ocr识别
 */
func (client *Client) QueryInvoicesocrVatinvoiceEx(request *QueryInvoicesocrVatinvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInvoicesocrVatinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInvoicesocrVatinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.invoicesocr.vatinvoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户链上交易移动端查看权限
 * Summary: 查询用户链上交易移动端查看权限
 */
func (client *Client) QueryBmpbrowserPrivilege(request *QueryBmpbrowserPrivilegeRequest) (_result *QueryBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBmpbrowserPrivilegeResponse{}
	_body, _err := client.QueryBmpbrowserPrivilegeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户链上交易移动端查看权限
 * Summary: 查询用户链上交易移动端查看权限
 */
func (client *Client) QueryBmpbrowserPrivilegeEx(request *QueryBmpbrowserPrivilegeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量取消 链上交易移动端查看权限
 * Summary: 批量取消 链上交易移动端查看权限
 */
func (client *Client) CancelBmpbrowserPrivilege(request *CancelBmpbrowserPrivilegeRequest) (_result *CancelBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelBmpbrowserPrivilegeResponse{}
	_body, _err := client.CancelBmpbrowserPrivilegeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量取消 链上交易移动端查看权限
 * Summary: 批量取消 链上交易移动端查看权限
 */
func (client *Client) CancelBmpbrowserPrivilegeEx(request *CancelBmpbrowserPrivilegeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
