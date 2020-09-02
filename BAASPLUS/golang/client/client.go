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

// 区块信息
type BlockInfo struct {
	// 业务数据
	BizData *string `json:"biz_data,omitempty" xml:"biz_data,omitempty"`
	// 区块链唯一性标识
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 区块哈希
	BlockHash *string `json:"block_hash,omitempty" xml:"block_hash,omitempty"`
	// 块高
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
	// 上一个区块的hash
	ParentHash *string `json:"parent_hash,omitempty" xml:"parent_hash,omitempty"`
	// size
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
	// 出块时间
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// 包含交易数
	TransactionSize *int64 `json:"transaction_size,omitempty" xml:"transaction_size,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s BlockInfo) String() string {
	return tea.Prettify(s)
}

func (s BlockInfo) GoString() string {
	return s.String()
}

func (s *BlockInfo) SetBizData(v string) *BlockInfo {
	s.BizData = &v
	return s
}

func (s *BlockInfo) SetBizId(v string) *BlockInfo {
	s.BizId = &v
	return s
}

func (s *BlockInfo) SetBlockHash(v string) *BlockInfo {
	s.BlockHash = &v
	return s
}

func (s *BlockInfo) SetHeight(v int64) *BlockInfo {
	s.Height = &v
	return s
}

func (s *BlockInfo) SetParentHash(v string) *BlockInfo {
	s.ParentHash = &v
	return s
}

func (s *BlockInfo) SetSize(v int64) *BlockInfo {
	s.Size = &v
	return s
}

func (s *BlockInfo) SetTimestamp(v int64) *BlockInfo {
	s.Timestamp = &v
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

// 机构（可以为银行或地区）
type Institution struct {
	// 人行联行号/行政地区编码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 银行全称/行政地区名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
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
	// 级别
	DetectResourceLevel *string `json:"detect_resource_level,omitempty" xml:"detect_resource_level,omitempty"`
	// RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
	DetectTypeCode *string `json:"detect_type_code,omitempty" xml:"detect_type_code,omitempty"`
	// 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
	HitContent *string `json:"hit_content,omitempty" xml:"hit_content,omitempty"`
	// 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
	HitDetectResource *string `json:"hit_detect_resource,omitempty" xml:"hit_detect_resource,omitempty"`
}

func (s HitDetectItems) String() string {
	return tea.Prettify(s)
}

func (s HitDetectItems) GoString() string {
	return s.String()
}

func (s *HitDetectItems) SetDetectResourceLevel(v string) *HitDetectItems {
	s.DetectResourceLevel = &v
	return s
}

func (s *HitDetectItems) SetDetectTypeCode(v string) *HitDetectItems {
	s.DetectTypeCode = &v
	return s
}

func (s *HitDetectItems) SetHitContent(v string) *HitDetectItems {
	s.HitContent = &v
	return s
}

func (s *HitDetectItems) SetHitDetectResource(v string) *HitDetectItems {
	s.HitDetectResource = &v
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
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 服务的可访问地址
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty"`
	// 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
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

type QueryBaasPlusIndividualidInternalmaskRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 被核验人身份证号码后四位
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被核验人姓名的一部分
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalmaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalmaskRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetRegionName(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetCertNo(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetMobile(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskRequest) SetName(v string) *QueryBaasPlusIndividualidInternalmaskRequest {
	s.Name = &v
	return s
}

type QueryBaasPlusIndividualidInternalmaskResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalmaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalmaskResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalmaskResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidInternalmaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskResponse) SetResultCode(v string) *QueryBaasPlusIndividualidInternalmaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidInternalmaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskResponse) SetAccepted(v bool) *QueryBaasPlusIndividualidInternalmaskResponse {
	s.Accepted = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalmaskResponse) SetVerifyUrl(v string) *QueryBaasPlusIndividualidInternalmaskResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusEnterpriseidInternalfourmetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternalfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternalfourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetAuthToken(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetProductInstanceId(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetRegionName(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetEpCertName(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetEpCertNo(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetEpCertType(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.EpCertType = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaRequest) SetLegalPersonCertNo(v string) *QueryBaasPlusEnterpriseidInternalfourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type QueryBaasPlusEnterpriseidInternalfourmetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternalfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternalfourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetReqMsgId(v string) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetResultCode(v string) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetResultMsg(v string) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetOpenTime(v string) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalfourmetaResponse) SetPassed(v bool) *QueryBaasPlusEnterpriseidInternalfourmetaResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEnterpriseidInternalthreemetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 证件类型
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternalthreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternalthreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetAuthToken(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetProductInstanceId(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetRegionName(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetEpCertName(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetEpCertNo(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetEpCertType(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.EpCertType = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEnterpriseidInternalthreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type QueryBaasPlusEnterpriseidInternalthreemetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternalthreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternalthreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetReqMsgId(v string) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetResultCode(v string) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetResultMsg(v string) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetOpenTime(v string) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternalthreemetaResponse) SetPassed(v bool) *QueryBaasPlusEnterpriseidInternalthreemetaResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEnterpriseidInternaltwometaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternaltwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternaltwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetAuthToken(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetProductInstanceId(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetRegionName(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetEpCertName(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetEpCertNo(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaRequest) SetEpCertType(v string) *QueryBaasPlusEnterpriseidInternaltwometaRequest {
	s.EpCertType = &v
	return s
}

type QueryBaasPlusEnterpriseidInternaltwometaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 经营状态
	EnterpriseStatus *string `json:"enterprise_status,omitempty" xml:"enterprise_status,omitempty"`
	// 营业期限
	OpenTime *string `json:"open_time,omitempty" xml:"open_time,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusEnterpriseidInternaltwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidInternaltwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetReqMsgId(v string) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetResultCode(v string) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetResultMsg(v string) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetOpenTime(v string) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidInternaltwometaResponse) SetPassed(v bool) *QueryBaasPlusEnterpriseidInternaltwometaResponse {
	s.Passed = &v
	return s
}

type InitBaasPlusEnterpriseidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号（目前只支持身份证号）
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s InitBaasPlusEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetAuthToken(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetRegionName(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetEpCertName(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.EpCertName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetEpCertNo(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetEpCertType(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.EpCertType = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetLegalPersonCertName(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthRequest) SetLegalPersonCertNo(v string) *InitBaasPlusEnterpriseidFaceauthRequest {
	s.LegalPersonCertNo = &v
	return s
}

type InitBaasPlusEnterpriseidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitBaasPlusEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEnterpriseidFaceauthResponse) SetReqMsgId(v string) *InitBaasPlusEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthResponse) SetResultCode(v string) *InitBaasPlusEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthResponse) SetResultMsg(v string) *InitBaasPlusEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthResponse) SetBizNo(v string) *InitBaasPlusEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

type QueryBaasPlusEnterpriseidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s QueryBaasPlusEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidFaceauthRequest) SetAuthToken(v string) *QueryBaasPlusEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *QueryBaasPlusEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthRequest) SetRegionName(v string) *QueryBaasPlusEnterpriseidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthRequest) SetBizNo(v string) *QueryBaasPlusEnterpriseidFaceauthRequest {
	s.BizNo = &v
	return s
}

type QueryBaasPlusEnterpriseidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证失败错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证失败原因信息
	FailedMessage *string `json:"failed_message,omitempty" xml:"failed_message,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetReqMsgId(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetResultCode(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetResultMsg(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetBizNo(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetFailedCode(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetFailedMessage(v string) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.FailedMessage = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthResponse) SetPassed(v bool) *QueryBaasPlusEnterpriseidFaceauthResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusIndividualidInternalfourmetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被核验人银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalfourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetRegionName(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetBankCardNo(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.BankCardNo = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetCertNo(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetMobile(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaRequest) SetName(v string) *QueryBaasPlusIndividualidInternalfourmetaRequest {
	s.Name = &v
	return s
}

type QueryBaasPlusIndividualidInternalfourmetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalfourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalfourmetaResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidInternalfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaResponse) SetResultCode(v string) *QueryBaasPlusIndividualidInternalfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidInternalfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaResponse) SetAccepted(v bool) *QueryBaasPlusIndividualidInternalfourmetaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalfourmetaResponse) SetVerifyUrl(v string) *QueryBaasPlusIndividualidInternalfourmetaResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusIndividualidInternalthreemetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验人手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalthreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalthreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetRegionName(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetCertNo(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetMobile(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaRequest) SetName(v string) *QueryBaasPlusIndividualidInternalthreemetaRequest {
	s.Name = &v
	return s
}

type QueryBaasPlusIndividualidInternalthreemetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryBaasPlusIndividualidInternalthreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternalthreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternalthreemetaResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidInternalthreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaResponse) SetResultCode(v string) *QueryBaasPlusIndividualidInternalthreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidInternalthreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaResponse) SetAccepted(v bool) *QueryBaasPlusIndividualidInternalthreemetaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternalthreemetaResponse) SetVerifyUrl(v string) *QueryBaasPlusIndividualidInternalthreemetaResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusIndividualidInternaltwometaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用于内部统计的参数，外部用户请忽略
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 被核验人身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryBaasPlusIndividualidInternaltwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternaltwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetRegionName(v string) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetCertNo(v string) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaRequest) SetName(v string) *QueryBaasPlusIndividualidInternaltwometaRequest {
	s.Name = &v
	return s
}

type QueryBaasPlusIndividualidInternaltwometaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否通过
	Accepted *bool `json:"accepted,omitempty" xml:"accepted,omitempty"`
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryBaasPlusIndividualidInternaltwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidInternaltwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidInternaltwometaResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidInternaltwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaResponse) SetResultCode(v string) *QueryBaasPlusIndividualidInternaltwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidInternaltwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaResponse) SetAccepted(v bool) *QueryBaasPlusIndividualidInternaltwometaResponse {
	s.Accepted = &v
	return s
}

func (s *QueryBaasPlusIndividualidInternaltwometaResponse) SetVerifyUrl(v string) *QueryBaasPlusIndividualidInternaltwometaResponse {
	s.VerifyUrl = &v
	return s
}

type CreateBaasPlusBaicorpInternalevaluationasyncRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 场景ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 内部的业务代码
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
	Callback *string `json:"callback,omitempty" xml:"callback,omitempty"`
	// 回调参数
	CallbackParam *string `json:"callback_param,omitempty" xml:"callback_param,omitempty"`
	// 业务自定义id，便于识别返回数据对应关系
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待评估内容类型
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty"`
	// 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
}

func (s CreateBaasPlusBaicorpInternalevaluationasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusBaicorpInternalevaluationasyncRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetAuthToken(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetProductInstanceId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetRegionName(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetBizId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.BizId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetBizInfo(v *BizInfo) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.BizInfo = v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetCallback(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.Callback = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetCallbackParam(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.CallbackParam = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetCustomId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.CustomId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetEntityData(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.EntityData = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetEntityType(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.EntityType = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncRequest) SetEntityUrl(v string) *CreateBaasPlusBaicorpInternalevaluationasyncRequest {
	s.EntityUrl = &v
	return s
}

type CreateBaasPlusBaicorpInternalevaluationasyncResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s CreateBaasPlusBaicorpInternalevaluationasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusBaicorpInternalevaluationasyncResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetReqMsgId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetResultCode(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetResultMsg(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetContentScore(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ContentScore = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetContentScoreDesc(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ContentScoreDesc = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetCustomId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.CustomId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetRepeatReason(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RepeatReason = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetRepeatResult(v bool) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RepeatResult = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetRiskResult(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RiskResult = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetRiskResultDesc(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RiskResultDesc = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalevaluationasyncResponse) SetTaskId(v string) *CreateBaasPlusBaicorpInternalevaluationasyncResponse {
	s.TaskId = &v
	return s
}

type CreateBaasPlusBaicorpInternalmonitorasyncRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 场景id
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 用于内部业务统计的信息
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 监测传播时间，单位暂定天
	BroadcastTime *int64 `json:"broadcast_time,omitempty" xml:"broadcast_time,omitempty"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 待检测内容RAW数据
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待监测内容类型
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty"`
	// 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
	// 监测输入的多个关键词
	KeyWords []*string `json:"key_words,omitempty" xml:"key_words,omitempty" type:"Repeated"`
	// 匹配时长，单位秒
	MatchedDuration *int64 `json:"matched_duration,omitempty" xml:"matched_duration,omitempty"`
	// 监测时长，单位为天
	MonitorDuration *int64 `json:"monitor_duration,omitempty" xml:"monitor_duration,omitempty"`
	// 监测频次，单位暂定天
	MonitorFrequency *int64 `json:"monitor_frequency,omitempty" xml:"monitor_frequency,omitempty"`
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

func (s CreateBaasPlusBaicorpInternalmonitorasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusBaicorpInternalmonitorasyncRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetAuthToken(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetProductInstanceId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetRegionName(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetBizId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.BizId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetBizInfo(v *BizInfo) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.BizInfo = v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetBroadcastTime(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.BroadcastTime = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetCustomId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.CustomId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetEntityData(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.EntityData = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetEntityType(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.EntityType = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetEntityUrl(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.EntityUrl = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetKeyWords(v []*string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.KeyWords = v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetMatchedDuration(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.MatchedDuration = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetMonitorDuration(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.MonitorDuration = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetMonitorFrequency(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.MonitorFrequency = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetMonitorScope(v []*string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.MonitorScope = v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetNotifyUrl(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.NotifyUrl = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetProviderId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.ProviderId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetStartDate(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.StartDate = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncRequest) SetTaskId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncRequest {
	s.TaskId = &v
	return s
}

type CreateBaasPlusBaicorpInternalmonitorasyncResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 检测时长，单位为天
	MonitorDuration *int64 `json:"monitor_duration,omitempty" xml:"monitor_duration,omitempty"`
	// 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
	StartDate *int64 `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 业务方任务id，业务方保证唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateBaasPlusBaicorpInternalmonitorasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusBaicorpInternalmonitorasyncResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetReqMsgId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetResultCode(v string) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetResultMsg(v string) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetMonitorDuration(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.MonitorDuration = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetStartDate(v int64) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.StartDate = &v
	return s
}

func (s *CreateBaasPlusBaicorpInternalmonitorasyncResponse) SetTaskId(v string) *CreateBaasPlusBaicorpInternalmonitorasyncResponse {
	s.TaskId = &v
	return s
}

type QueryBaasPlusBaicorpInternalevaluationasyncRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// bizinfo
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 监测任务Id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryBaasPlusBaicorpInternalevaluationasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalevaluationasyncRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetAuthToken(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetProductInstanceId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetRegionName(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetBizId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetCustomId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.CustomId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncRequest) SetTaskId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncRequest {
	s.TaskId = &v
	return s
}

type QueryBaasPlusBaicorpInternalevaluationasyncResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务自定义id
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 风险识别结果
	RiskResult *string `json:"risk_result,omitempty" xml:"risk_result,omitempty"`
	// 风险识别结果描述
	RiskResultDesc *string `json:"risk_result_desc,omitempty" xml:"risk_result_desc,omitempty"`
	// 监测任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryBaasPlusBaicorpInternalevaluationasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalevaluationasyncResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetReqMsgId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetResultCode(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetResultMsg(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetCustomId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.CustomId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetRiskResult(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RiskResult = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetRiskResultDesc(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.RiskResultDesc = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalevaluationasyncResponse) SetTaskId(v string) *QueryBaasPlusBaicorpInternalevaluationasyncResponse {
	s.TaskId = &v
	return s
}

type QueryBaasPlusBaicorpInternalmonitorasyncRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务方产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 业务方任务id，业务方保证唯一
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryBaasPlusBaicorpInternalmonitorasyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalmonitorasyncRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncRequest) SetAuthToken(v string) *QueryBaasPlusBaicorpInternalmonitorasyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncRequest) SetProductInstanceId(v string) *QueryBaasPlusBaicorpInternalmonitorasyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncRequest) SetRegionName(v string) *QueryBaasPlusBaicorpInternalmonitorasyncRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncRequest) SetBizId(v string) *QueryBaasPlusBaicorpInternalmonitorasyncRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncRequest) SetTaskId(v string) *QueryBaasPlusBaicorpInternalmonitorasyncRequest {
	s.TaskId = &v
	return s
}

type QueryBaasPlusBaicorpInternalmonitorasyncResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusBaicorpInternalmonitorasyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalmonitorasyncResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetReqMsgId(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetResultCode(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetResultMsg(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetData(v []*AntiPiracyResultObject) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.Data = v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetErrMsg(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.ErrMsg = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetStatus(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.Status = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalmonitorasyncResponse) SetTaskId(v string) *QueryBaasPlusBaicorpInternalmonitorasyncResponse {
	s.TaskId = &v
	return s
}

type CertifyBaasPlusEnterpriseidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证完成后回跳地址
	//
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyBaasPlusEnterpriseidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusEnterpriseidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetAuthToken(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetProductInstanceId(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetRegionName(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetBizNo(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetCallbackUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthRequest) SetRedirectUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyBaasPlusEnterpriseidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	//
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证url
	//
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyBaasPlusEnterpriseidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusEnterpriseidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusEnterpriseidFaceauthResponse) SetReqMsgId(v string) *CertifyBaasPlusEnterpriseidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthResponse) SetResultCode(v string) *CertifyBaasPlusEnterpriseidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthResponse) SetResultMsg(v string) *CertifyBaasPlusEnterpriseidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthResponse) SetBizNo(v string) *CertifyBaasPlusEnterpriseidFaceauthResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthResponse) SetVerifyUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type InitBaasPlusIndividualidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证
	// 默认为FACE
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
}

func (s InitBaasPlusIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetAuthToken(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetProductInstanceId(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetRegionName(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetBizCode(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.BizCode = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetCertName(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.CertName = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthRequest) SetCertNo(v string) *InitBaasPlusIndividualidFaceauthRequest {
	s.CertNo = &v
	return s
}

type InitBaasPlusIndividualidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitBaasPlusIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidFaceauthResponse) SetReqMsgId(v string) *InitBaasPlusIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthResponse) SetResultCode(v string) *InitBaasPlusIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthResponse) SetResultMsg(v string) *InitBaasPlusIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthResponse) SetCertifyId(v string) *InitBaasPlusIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

type CertifyBaasPlusIndividualidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证完成后回跳地址
	//
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyBaasPlusIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetAuthToken(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetProductInstanceId(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetRegionName(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetCallbackUrl(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetCertifyId(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthRequest) SetRedirectUrl(v string) *CertifyBaasPlusIndividualidFaceauthRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyBaasPlusIndividualidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyBaasPlusIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusIndividualidFaceauthResponse) SetReqMsgId(v string) *CertifyBaasPlusIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthResponse) SetResultCode(v string) *CertifyBaasPlusIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthResponse) SetResultMsg(v string) *CertifyBaasPlusIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthResponse) SetCertifyId(v string) *CertifyBaasPlusIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthResponse) SetVerifyUrl(v string) *CertifyBaasPlusIndividualidFaceauthResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusIndividualidFaceauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s QueryBaasPlusIndividualidFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidFaceauthRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthRequest) SetRegionName(v string) *QueryBaasPlusIndividualidFaceauthRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthRequest) SetCertifyId(v string) *QueryBaasPlusIndividualidFaceauthRequest {
	s.CertifyId = &v
	return s
}

type QueryBaasPlusIndividualidFaceauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	//
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 用户是否完成刷脸
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusIndividualidFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetResultCode(v string) *QueryBaasPlusIndividualidFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetCertifyId(v string) *QueryBaasPlusIndividualidFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetFinished(v bool) *QueryBaasPlusIndividualidFaceauthResponse {
	s.Finished = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthResponse) SetPassed(v bool) *QueryBaasPlusIndividualidFaceauthResponse {
	s.Passed = &v
	return s
}

type GetBaasPlusDataserviceBlockchainheightRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链的唯一性标示
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
}

func (s GetBaasPlusDataserviceBlockchainheightRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceBlockchainheightRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceBlockchainheightRequest) SetAuthToken(v string) *GetBaasPlusDataserviceBlockchainheightRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightRequest) SetProductInstanceId(v string) *GetBaasPlusDataserviceBlockchainheightRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightRequest) SetRegionName(v string) *GetBaasPlusDataserviceBlockchainheightRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightRequest) SetBizid(v string) *GetBaasPlusDataserviceBlockchainheightRequest {
	s.Bizid = &v
	return s
}

type GetBaasPlusDataserviceBlockchainheightResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块链块高
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetBaasPlusDataserviceBlockchainheightResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceBlockchainheightResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceBlockchainheightResponse) SetReqMsgId(v string) *GetBaasPlusDataserviceBlockchainheightResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightResponse) SetResultCode(v string) *GetBaasPlusDataserviceBlockchainheightResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightResponse) SetResultMsg(v string) *GetBaasPlusDataserviceBlockchainheightResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusDataserviceBlockchainheightResponse) SetData(v int64) *GetBaasPlusDataserviceBlockchainheightResponse {
	s.Data = &v
	return s
}

type GetBaasPlusDataserviceTransactioncountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链唯一性标示
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
}

func (s GetBaasPlusDataserviceTransactioncountRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceTransactioncountRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceTransactioncountRequest) SetAuthToken(v string) *GetBaasPlusDataserviceTransactioncountRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountRequest) SetProductInstanceId(v string) *GetBaasPlusDataserviceTransactioncountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountRequest) SetRegionName(v string) *GetBaasPlusDataserviceTransactioncountRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountRequest) SetBizid(v string) *GetBaasPlusDataserviceTransactioncountRequest {
	s.Bizid = &v
	return s
}

type GetBaasPlusDataserviceTransactioncountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易总数
	Data *int64 `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetBaasPlusDataserviceTransactioncountResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceTransactioncountResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceTransactioncountResponse) SetReqMsgId(v string) *GetBaasPlusDataserviceTransactioncountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountResponse) SetResultCode(v string) *GetBaasPlusDataserviceTransactioncountResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountResponse) SetResultMsg(v string) *GetBaasPlusDataserviceTransactioncountResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioncountResponse) SetData(v int64) *GetBaasPlusDataserviceTransactioncountResponse {
	s.Data = &v
	return s
}

type GetBaasPlusDataserviceTransactioninfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链唯一性标识
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 交易hash
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s GetBaasPlusDataserviceTransactioninfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceTransactioninfoRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceTransactioninfoRequest) SetAuthToken(v string) *GetBaasPlusDataserviceTransactioninfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoRequest) SetProductInstanceId(v string) *GetBaasPlusDataserviceTransactioninfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoRequest) SetRegionName(v string) *GetBaasPlusDataserviceTransactioninfoRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoRequest) SetBizid(v string) *GetBaasPlusDataserviceTransactioninfoRequest {
	s.Bizid = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoRequest) SetHash(v string) *GetBaasPlusDataserviceTransactioninfoRequest {
	s.Hash = &v
	return s
}

type GetBaasPlusDataserviceTransactioninfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s GetBaasPlusDataserviceTransactioninfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusDataserviceTransactioninfoResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetReqMsgId(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetResultCode(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetResultMsg(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetBizid(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.Bizid = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetCategory(v int64) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.Category = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetCreateTime(v int64) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.CreateTime = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetFromHash(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.FromHash = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetHash(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.Hash = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetHeight(v int64) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.Height = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetToHash(v string) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.ToHash = &v
	return s
}

func (s *GetBaasPlusDataserviceTransactioninfoResponse) SetType(v int64) *GetBaasPlusDataserviceTransactioninfoResponse {
	s.Type = &v
	return s
}

type ListBaasPlusDataserviceLastblocksRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 区块链唯一性标识
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 区块个数
	Size *int64 `json:"size,omitempty" xml:"size,omitempty"`
}

func (s ListBaasPlusDataserviceLastblocksRequest) String() string {
	return tea.Prettify(s)
}

func (s ListBaasPlusDataserviceLastblocksRequest) GoString() string {
	return s.String()
}

func (s *ListBaasPlusDataserviceLastblocksRequest) SetAuthToken(v string) *ListBaasPlusDataserviceLastblocksRequest {
	s.AuthToken = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksRequest) SetProductInstanceId(v string) *ListBaasPlusDataserviceLastblocksRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksRequest) SetRegionName(v string) *ListBaasPlusDataserviceLastblocksRequest {
	s.RegionName = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksRequest) SetBizid(v string) *ListBaasPlusDataserviceLastblocksRequest {
	s.Bizid = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksRequest) SetSize(v int64) *ListBaasPlusDataserviceLastblocksRequest {
	s.Size = &v
	return s
}

type ListBaasPlusDataserviceLastblocksResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 区块信息
	LastBlockList []*BlockInfo `json:"last_block_list,omitempty" xml:"last_block_list,omitempty" type:"Repeated"`
}

func (s ListBaasPlusDataserviceLastblocksResponse) String() string {
	return tea.Prettify(s)
}

func (s ListBaasPlusDataserviceLastblocksResponse) GoString() string {
	return s.String()
}

func (s *ListBaasPlusDataserviceLastblocksResponse) SetReqMsgId(v string) *ListBaasPlusDataserviceLastblocksResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksResponse) SetResultCode(v string) *ListBaasPlusDataserviceLastblocksResponse {
	s.ResultCode = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksResponse) SetResultMsg(v string) *ListBaasPlusDataserviceLastblocksResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListBaasPlusDataserviceLastblocksResponse) SetLastBlockList(v []*BlockInfo) *ListBaasPlusDataserviceLastblocksResponse {
	s.LastBlockList = v
	return s
}

type GetBaasPlusTasAttestationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 摘要算法默认，（sha256或者sm3 默认sm3）
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
	CertReq *bool `json:"cert_req,omitempty" xml:"cert_req,omitempty"`
	// 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
	Compress *bool `json:"compress,omitempty" xml:"compress,omitempty"`
	// 事物hash(支持sha256或sm3摘要算法),长度64个字符。
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
}

func (s GetBaasPlusTasAttestationRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasAttestationRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasAttestationRequest) SetAuthToken(v string) *GetBaasPlusTasAttestationRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetProductInstanceId(v string) *GetBaasPlusTasAttestationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetRegionName(v string) *GetBaasPlusTasAttestationRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetAlgorithm(v string) *GetBaasPlusTasAttestationRequest {
	s.Algorithm = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetCertReq(v bool) *GetBaasPlusTasAttestationRequest {
	s.CertReq = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetCompress(v bool) *GetBaasPlusTasAttestationRequest {
	s.Compress = &v
	return s
}

func (s *GetBaasPlusTasAttestationRequest) SetRid(v string) *GetBaasPlusTasAttestationRequest {
	s.Rid = &v
	return s
}

type GetBaasPlusTasAttestationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
}

func (s GetBaasPlusTasAttestationResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasAttestationResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasAttestationResponse) SetReqMsgId(v string) *GetBaasPlusTasAttestationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusTasAttestationResponse) SetResultCode(v string) *GetBaasPlusTasAttestationResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusTasAttestationResponse) SetResultMsg(v string) *GetBaasPlusTasAttestationResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusTasAttestationResponse) SetCtsr(v string) *GetBaasPlusTasAttestationResponse {
	s.Ctsr = &v
	return s
}

func (s *GetBaasPlusTasAttestationResponse) SetSn(v string) *GetBaasPlusTasAttestationResponse {
	s.Sn = &v
	return s
}

func (s *GetBaasPlusTasAttestationResponse) SetTs(v string) *GetBaasPlusTasAttestationResponse {
	s.Ts = &v
	return s
}

type VerifyBaasPlusTasCtsrRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 请求时间凭证接口返回的ctsr参数
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
}

func (s VerifyBaasPlusTasCtsrRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyBaasPlusTasCtsrRequest) GoString() string {
	return s.String()
}

func (s *VerifyBaasPlusTasCtsrRequest) SetAuthToken(v string) *VerifyBaasPlusTasCtsrRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrRequest) SetProductInstanceId(v string) *VerifyBaasPlusTasCtsrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrRequest) SetRegionName(v string) *VerifyBaasPlusTasCtsrRequest {
	s.RegionName = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrRequest) SetCtsr(v string) *VerifyBaasPlusTasCtsrRequest {
	s.Ctsr = &v
	return s
}

type VerifyBaasPlusTasCtsrResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s VerifyBaasPlusTasCtsrResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyBaasPlusTasCtsrResponse) GoString() string {
	return s.String()
}

func (s *VerifyBaasPlusTasCtsrResponse) SetReqMsgId(v string) *VerifyBaasPlusTasCtsrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetResultCode(v string) *VerifyBaasPlusTasCtsrResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetResultMsg(v string) *VerifyBaasPlusTasCtsrResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetAppName(v string) *VerifyBaasPlusTasCtsrResponse {
	s.AppName = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetCompanyName(v string) *VerifyBaasPlusTasCtsrResponse {
	s.CompanyName = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetDesc(v string) *VerifyBaasPlusTasCtsrResponse {
	s.Desc = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetHashValue(v string) *VerifyBaasPlusTasCtsrResponse {
	s.HashValue = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetSn(v string) *VerifyBaasPlusTasCtsrResponse {
	s.Sn = &v
	return s
}

func (s *VerifyBaasPlusTasCtsrResponse) SetTs(v string) *VerifyBaasPlusTasCtsrResponse {
	s.Ts = &v
	return s
}

type GetBaasPlusTasCertificateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
}

func (s GetBaasPlusTasCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasCertificateRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasCertificateRequest) SetAuthToken(v string) *GetBaasPlusTasCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusTasCertificateRequest) SetProductInstanceId(v string) *GetBaasPlusTasCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusTasCertificateRequest) SetRegionName(v string) *GetBaasPlusTasCertificateRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusTasCertificateRequest) SetSn(v string) *GetBaasPlusTasCertificateRequest {
	s.Sn = &v
	return s
}

type GetBaasPlusTasCertificateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 下载pdf格式证书的临时url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetBaasPlusTasCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasCertificateResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasCertificateResponse) SetReqMsgId(v string) *GetBaasPlusTasCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusTasCertificateResponse) SetResultCode(v string) *GetBaasPlusTasCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusTasCertificateResponse) SetResultMsg(v string) *GetBaasPlusTasCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusTasCertificateResponse) SetUrl(v string) *GetBaasPlusTasCertificateResponse {
	s.Url = &v
	return s
}

type GetBaasPlusTasTransactionattestationRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 摘要算法默认，（sha256或者sm3 默认sm3）
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
	CertReq *bool `json:"cert_req,omitempty" xml:"cert_req,omitempty"`
	// 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
	Compress *bool `json:"compress,omitempty" xml:"compress,omitempty"`
	// 对事务的描述，长度小于20位
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 事物hash(支持sha256或sm3摘要算法)
	// 长度64个字符。
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// 事务id，允许大小写数字且小于十位的字符串
	TransId *string `json:"trans_id,omitempty" xml:"trans_id,omitempty"`
}

func (s GetBaasPlusTasTransactionattestationRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasTransactionattestationRequest) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetAuthToken(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetProductInstanceId(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetRegionName(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.RegionName = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetAlgorithm(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.Algorithm = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetCertReq(v bool) *GetBaasPlusTasTransactionattestationRequest {
	s.CertReq = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetCompress(v bool) *GetBaasPlusTasTransactionattestationRequest {
	s.Compress = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetDesc(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.Desc = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetRid(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.Rid = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationRequest) SetTransId(v string) *GetBaasPlusTasTransactionattestationRequest {
	s.TransId = &v
	return s
}

type GetBaasPlusTasTransactionattestationResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 精简后的时间戳完整编码（在校验时需要提交）
	Ctsr *string `json:"ctsr,omitempty" xml:"ctsr,omitempty"`
	// serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
	Ts *string `json:"ts,omitempty" xml:"ts,omitempty"`
}

func (s GetBaasPlusTasTransactionattestationResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBaasPlusTasTransactionattestationResponse) GoString() string {
	return s.String()
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetReqMsgId(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetResultCode(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetResultMsg(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetCtsr(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.Ctsr = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetSn(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.Sn = &v
	return s
}

func (s *GetBaasPlusTasTransactionattestationResponse) SetTs(v string) *GetBaasPlusTasTransactionattestationResponse {
	s.Ts = &v
	return s
}

type QueryBaasPlusEverifyFourmetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 某某有限公司
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s QueryBaasPlusEverifyFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyFourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetAuthToken(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetRegionName(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetEpCertName(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaRequest) SetLegalPersonCertNo(v string) *QueryBaasPlusEverifyFourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

type QueryBaasPlusEverifyFourmetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyFourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetResultCode(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetResultMsg(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetCode(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetOpenTime(v string) *QueryBaasPlusEverifyFourmetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetaResponse) SetPassed(v bool) *QueryBaasPlusEverifyFourmetaResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEverifyThreemetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
}

func (s QueryBaasPlusEverifyThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyThreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetAuthToken(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetRegionName(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetEpCertName(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEverifyThreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

type QueryBaasPlusEverifyThreemetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyThreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetResultCode(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetResultMsg(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetCode(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetOpenTime(v string) *QueryBaasPlusEverifyThreemetaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetaResponse) SetPassed(v bool) *QueryBaasPlusEverifyThreemetaResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEverifyTwometaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
}

func (s QueryBaasPlusEverifyTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyTwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyTwometaRequest) SetAuthToken(v string) *QueryBaasPlusEverifyTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaRequest) SetRegionName(v string) *QueryBaasPlusEverifyTwometaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaRequest) SetEpCertName(v string) *QueryBaasPlusEverifyTwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyTwometaRequest {
	s.EpCertNo = &v
	return s
}

type QueryBaasPlusEverifyTwometaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyTwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetResultCode(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetResultMsg(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetCode(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetOpenTime(v string) *QueryBaasPlusEverifyTwometaResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometaResponse) SetPassed(v bool) *QueryBaasPlusEverifyTwometaResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusBaicorpInternalsearchlibraryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账户ID，账户粒度ID。
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 产品ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 商户ID，即平台用户ID。
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	//  内容ID
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	// 基于安全考虑，填充NonceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 待检测内容的raw data，这期暂不使用
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
	EntityDesc *string `json:"entity_desc,omitempty" xml:"entity_desc,omitempty"`
	// 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty"`
	// 1、待检测内容oss url（后续可以扩展为非oss的文件url）
	// 2、假如使用AK访问，此处填写fileid。
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
	// 时间戳
	Timestamp *string `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
}

func (s QueryBaasPlusBaicorpInternalsearchlibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalsearchlibraryRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetAuthToken(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetProductInstanceId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetRegionName(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetAccountId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.AccountId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetBizId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.BizId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetCompanyId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetContentId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.ContentId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetCustomId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.CustomId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityData(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityData = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityDesc(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityDesc = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityType(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityType = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityUrl(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityUrl = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryRequest) SetTimestamp(v string) *QueryBaasPlusBaicorpInternalsearchlibraryRequest {
	s.Timestamp = &v
	return s
}

type QueryBaasPlusBaicorpInternalsearchlibraryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NoucelId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 采用的模型以及版本说明
	ModelInfo *string `json:"model_info,omitempty" xml:"model_info,omitempty"`
	// 重复列表，json list格式
	RepeatInfo *string `json:"repeat_info,omitempty" xml:"repeat_info,omitempty"`
	// 相似度信息列表，json list格式
	SimilarityInfo *string `json:"similarity_info,omitempty" xml:"similarity_info,omitempty"`
}

func (s QueryBaasPlusBaicorpInternalsearchlibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBaicorpInternalsearchlibraryResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetReqMsgId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetResultCode(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetResultMsg(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetCustomId(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.CustomId = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetModelInfo(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ModelInfo = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetRepeatInfo(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.RepeatInfo = &v
	return s
}

func (s *QueryBaasPlusBaicorpInternalsearchlibraryResponse) SetSimilarityInfo(v string) *QueryBaasPlusBaicorpInternalsearchlibraryResponse {
	s.SimilarityInfo = &v
	return s
}

type UpdateBaasPlusBaicorpInternalsearchlibraryRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 账户ID，账户粒度ID。
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 产品ID，[BANQUAN, PAIPAI]
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 商户ID，即平台用户ID。
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 内容ID
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty"`
	//
	// 基于安全考虑，填充NonceId。
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 待检测内容的raw data，这期暂不使用
	EntityData *string `json:"entity_data,omitempty" xml:"entity_data,omitempty"`
	// 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串。
	EntityDesc *string `json:"entity_desc,omitempty" xml:"entity_desc,omitempty"`
	// 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
	EntityType *string `json:"entity_type,omitempty" xml:"entity_type,omitempty"`
	// 1.待检测内容oss url（后续可以扩展为非oss的文件url）。
	// 2.假如使用AK访问，此处填写fileid。
	EntityUrl *string `json:"entity_url,omitempty" xml:"entity_url,omitempty"`
}

func (s UpdateBaasPlusBaicorpInternalsearchlibraryRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusBaicorpInternalsearchlibraryRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetAuthToken(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetProductInstanceId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetRegionName(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetAccountId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.AccountId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetBizId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.BizId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetCompanyId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.CompanyId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetContentId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.ContentId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetCustomId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.CustomId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityData(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityData = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityDesc(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityDesc = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityType(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityType = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) SetEntityUrl(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryRequest {
	s.EntityUrl = &v
	return s
}

type UpdateBaasPlusBaicorpInternalsearchlibraryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// NounceId
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty"`
	// 更新描述、更新失败原因
	UpdateDesc *string `json:"update_desc,omitempty" xml:"update_desc,omitempty"`
	// 更新是否成功
	UpdateResult *string `json:"update_result,omitempty" xml:"update_result,omitempty"`
}

func (s UpdateBaasPlusBaicorpInternalsearchlibraryResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusBaicorpInternalsearchlibraryResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetReqMsgId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetResultCode(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetResultMsg(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetCustomId(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.CustomId = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetUpdateDesc(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.UpdateDesc = &v
	return s
}

func (s *UpdateBaasPlusBaicorpInternalsearchlibraryResponse) SetUpdateResult(v string) *UpdateBaasPlusBaicorpInternalsearchlibraryResponse {
	s.UpdateResult = &v
	return s
}

type QueryBaasPlusEpayauthRootbankRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 支持全称，或部分名称 如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
}

func (s QueryBaasPlusEpayauthRootbankRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthRootbankRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthRootbankRequest) SetAuthToken(v string) *QueryBaasPlusEpayauthRootbankRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankRequest) SetProductInstanceId(v string) *QueryBaasPlusEpayauthRootbankRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankRequest) SetRegionName(v string) *QueryBaasPlusEpayauthRootbankRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankRequest) SetBankName(v string) *QueryBaasPlusEpayauthRootbankRequest {
	s.BankName = &v
	return s
}

type QueryBaasPlusEpayauthRootbankResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 银行列表
	BankDetails []*Institution `json:"bank_details,omitempty" xml:"bank_details,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusEpayauthRootbankResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthRootbankResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthRootbankResponse) SetReqMsgId(v string) *QueryBaasPlusEpayauthRootbankResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankResponse) SetResultCode(v string) *QueryBaasPlusEpayauthRootbankResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankResponse) SetResultMsg(v string) *QueryBaasPlusEpayauthRootbankResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEpayauthRootbankResponse) SetBankDetails(v []*Institution) *QueryBaasPlusEpayauthRootbankResponse {
	s.BankDetails = v
	return s
}

type QueryBaasPlusYdapplyprotEcapplyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 用户手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s QueryBaasPlusYdapplyprotEcapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdapplyprotEcapplyRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetAuthToken(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetProductInstanceId(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetRegionName(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetCertNo(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetMobile(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyRequest) SetUserName(v string) *QueryBaasPlusYdapplyprotEcapplyRequest {
	s.UserName = &v
	return s
}

type QueryBaasPlusYdapplyprotEcapplyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdapplyprotEcapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdapplyprotEcapplyResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetReqMsgId(v string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetResultCode(v string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetResultMsg(v string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetDecision(v string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetPassed(v bool) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetScore(v string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdapplyprotEcapplyResponse) SetStrategies(v []*string) *QueryBaasPlusYdapplyprotEcapplyResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdpacprotEcpacRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s QueryBaasPlusYdpacprotEcpacRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdpacprotEcpacRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdpacprotEcpacRequest) SetAuthToken(v string) *QueryBaasPlusYdpacprotEcpacRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacRequest) SetProductInstanceId(v string) *QueryBaasPlusYdpacprotEcpacRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacRequest) SetRegionName(v string) *QueryBaasPlusYdpacprotEcpacRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacRequest) SetMobile(v string) *QueryBaasPlusYdpacprotEcpacRequest {
	s.Mobile = &v
	return s
}

type QueryBaasPlusYdpacprotEcpacResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 认证是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 模型分数
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdpacprotEcpacResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdpacprotEcpacResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetReqMsgId(v string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetResultCode(v string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetResultMsg(v string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetDecision(v string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetPassed(v bool) *QueryBaasPlusYdpacprotEcpacResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetScore(v string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdpacprotEcpacResponse) SetStrategies(v []*string) *QueryBaasPlusYdpacprotEcpacResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdauthprotTwometaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验用户的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s QueryBaasPlusYdauthprotTwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotTwometaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotTwometaRequest) SetAuthToken(v string) *QueryBaasPlusYdauthprotTwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaRequest) SetProductInstanceId(v string) *QueryBaasPlusYdauthprotTwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaRequest) SetRegionName(v string) *QueryBaasPlusYdauthprotTwometaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaRequest) SetCertNo(v string) *QueryBaasPlusYdauthprotTwometaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaRequest) SetUserName(v string) *QueryBaasPlusYdauthprotTwometaRequest {
	s.UserName = &v
	return s
}

type QueryBaasPlusYdauthprotTwometaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdauthprotTwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotTwometaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetReqMsgId(v string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetResultCode(v string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetResultMsg(v string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetDecision(v string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetPassed(v bool) *QueryBaasPlusYdauthprotTwometaResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetScore(v string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdauthprotTwometaResponse) SetStrategies(v []*string) *QueryBaasPlusYdauthprotTwometaResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdauthprotThreemetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验用户的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被核验用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s QueryBaasPlusYdauthprotThreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotThreemetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetAuthToken(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetProductInstanceId(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetRegionName(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetCertNo(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetMobile(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaRequest) SetUserName(v string) *QueryBaasPlusYdauthprotThreemetaRequest {
	s.UserName = &v
	return s
}

type QueryBaasPlusYdauthprotThreemetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdauthprotThreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotThreemetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetReqMsgId(v string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetResultCode(v string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetResultMsg(v string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetDecision(v string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetPassed(v bool) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetScore(v string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdauthprotThreemetaResponse) SetStrategies(v []*string) *QueryBaasPlusYdauthprotThreemetaResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdauthprotFourmetaRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 被核验用户的银行卡号
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty"`
	// 被核验用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 被核验用户的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 被核验用户的姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
}

func (s QueryBaasPlusYdauthprotFourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotFourmetaRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetAuthToken(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetProductInstanceId(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetRegionName(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetCardNo(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.CardNo = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetCertNo(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetMobile(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaRequest) SetUserName(v string) *QueryBaasPlusYdauthprotFourmetaRequest {
	s.UserName = &v
	return s
}

type QueryBaasPlusYdauthprotFourmetaResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdauthprotFourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdauthprotFourmetaResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetReqMsgId(v string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetResultCode(v string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetResultMsg(v string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetDecision(v string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetPassed(v bool) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetScore(v string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdauthprotFourmetaResponse) SetStrategies(v []*string) *QueryBaasPlusYdauthprotFourmetaResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdmktprotEcmarketcampaignRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s QueryBaasPlusYdmktprotEcmarketcampaignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdmktprotEcmarketcampaignRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignRequest) SetAuthToken(v string) *QueryBaasPlusYdmktprotEcmarketcampaignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignRequest) SetProductInstanceId(v string) *QueryBaasPlusYdmktprotEcmarketcampaignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignRequest) SetRegionName(v string) *QueryBaasPlusYdmktprotEcmarketcampaignRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignRequest) SetMobile(v string) *QueryBaasPlusYdmktprotEcmarketcampaignRequest {
	s.Mobile = &v
	return s
}

type QueryBaasPlusYdmktprotEcmarketcampaignResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 核验是否通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdmktprotEcmarketcampaignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdmktprotEcmarketcampaignResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetReqMsgId(v string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetResultCode(v string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetResultMsg(v string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetDecision(v string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetPassed(v bool) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetScore(v string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdmktprotEcmarketcampaignResponse) SetStrategies(v []*string) *QueryBaasPlusYdmktprotEcmarketcampaignResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusYdregprotEcregisterRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s QueryBaasPlusYdregprotEcregisterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdregprotEcregisterRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdregprotEcregisterRequest) SetAuthToken(v string) *QueryBaasPlusYdregprotEcregisterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterRequest) SetProductInstanceId(v string) *QueryBaasPlusYdregprotEcregisterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterRequest) SetRegionName(v string) *QueryBaasPlusYdregprotEcregisterRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterRequest) SetMobile(v string) *QueryBaasPlusYdregprotEcregisterRequest {
	s.Mobile = &v
	return s
}

type QueryBaasPlusYdregprotEcregisterResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 是否核验通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
	// 风险分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 命中的策略列表
	Strategies []*string `json:"strategies,omitempty" xml:"strategies,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusYdregprotEcregisterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusYdregprotEcregisterResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetReqMsgId(v string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetResultCode(v string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetResultMsg(v string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetDecision(v string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.Decision = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetPassed(v bool) *QueryBaasPlusYdregprotEcregisterResponse {
	s.Passed = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetScore(v string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.Score = &v
	return s
}

func (s *QueryBaasPlusYdregprotEcregisterResponse) SetStrategies(v []*string) *QueryBaasPlusYdregprotEcregisterResponse {
	s.Strategies = v
	return s
}

type QueryBaasPlusEpayauthBranchbankRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 银行名称，支持全称，或部分名称
	// bank_name和district_code至少有一个不为空
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 行政地区编码
	// bank_name和district_code至少有一个不为空
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 总行联行号
	RootBankCode *string `json:"root_bank_code,omitempty" xml:"root_bank_code,omitempty"`
}

func (s QueryBaasPlusEpayauthBranchbankRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthBranchbankRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetAuthToken(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetProductInstanceId(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetRegionName(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetBankName(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.BankName = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetDistrictCode(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.DistrictCode = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankRequest) SetRootBankCode(v string) *QueryBaasPlusEpayauthBranchbankRequest {
	s.RootBankCode = &v
	return s
}

type QueryBaasPlusEpayauthBranchbankResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Institution列表
	BankDetails []*Institution `json:"bank_details,omitempty" xml:"bank_details,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusEpayauthBranchbankResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthBranchbankResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthBranchbankResponse) SetReqMsgId(v string) *QueryBaasPlusEpayauthBranchbankResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankResponse) SetResultCode(v string) *QueryBaasPlusEpayauthBranchbankResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankResponse) SetResultMsg(v string) *QueryBaasPlusEpayauthBranchbankResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEpayauthBranchbankResponse) SetBankDetails(v []*Institution) *QueryBaasPlusEpayauthBranchbankResponse {
	s.BankDetails = v
	return s
}

type QueryBaasPlusEpayauthDistrictRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty"`
}

func (s QueryBaasPlusEpayauthDistrictRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthDistrictRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthDistrictRequest) SetAuthToken(v string) *QueryBaasPlusEpayauthDistrictRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictRequest) SetProductInstanceId(v string) *QueryBaasPlusEpayauthDistrictRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictRequest) SetRegionName(v string) *QueryBaasPlusEpayauthDistrictRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictRequest) SetParentCode(v string) *QueryBaasPlusEpayauthDistrictRequest {
	s.ParentCode = &v
	return s
}

type QueryBaasPlusEpayauthDistrictResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// District列表
	DistrictDetails []*Institution `json:"district_details,omitempty" xml:"district_details,omitempty" type:"Repeated"`
}

func (s QueryBaasPlusEpayauthDistrictResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthDistrictResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthDistrictResponse) SetReqMsgId(v string) *QueryBaasPlusEpayauthDistrictResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictResponse) SetResultCode(v string) *QueryBaasPlusEpayauthDistrictResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictResponse) SetResultMsg(v string) *QueryBaasPlusEpayauthDistrictResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEpayauthDistrictResponse) SetDistrictDetails(v []*Institution) *QueryBaasPlusEpayauthDistrictResponse {
	s.DistrictDetails = v
	return s
}

type InitBaasPlusEpayauthVerifyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 待认证银行卡号
	//
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty"`
	// 人行联行号
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
	// 手机号码 用于接收打款验证通知短信
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
}

func (s InitBaasPlusEpayauthVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEpayauthVerifyRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetAuthToken(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetProductInstanceId(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetRegionName(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetBankCardNo(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.BankCardNo = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetBankCode(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.BankCode = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetCallbackUrl(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.CallbackUrl = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetEpCertName(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.EpCertName = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetEpCertNo(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetLegalPersonCertName(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetLegalPersonCertNo(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyRequest) SetMobile(v string) *InitBaasPlusEpayauthVerifyRequest {
	s.Mobile = &v
	return s
}

type InitBaasPlusEpayauthVerifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 2017070610120520200000000051240001626725
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
}

func (s InitBaasPlusEpayauthVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEpayauthVerifyResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEpayauthVerifyResponse) SetReqMsgId(v string) *InitBaasPlusEpayauthVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyResponse) SetResultCode(v string) *InitBaasPlusEpayauthVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyResponse) SetResultMsg(v string) *InitBaasPlusEpayauthVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusEpayauthVerifyResponse) SetVerifyId(v string) *InitBaasPlusEpayauthVerifyResponse {
	s.VerifyId = &v
	return s
}

type QueryBaasPlusEpayauthVerifyRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 打款金额，只支持两位小数点的正数，单位：元
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 支付币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 打款验证ID 打款验证受理后生成的一个唯一标识
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
}

func (s QueryBaasPlusEpayauthVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthVerifyRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetAuthToken(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetProductInstanceId(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetRegionName(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetAmount(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.Amount = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetCurrency(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.Currency = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyRequest) SetVerifyId(v string) *QueryBaasPlusEpayauthVerifyRequest {
	s.VerifyId = &v
	return s
}

type QueryBaasPlusEpayauthVerifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 验证是否成功
	Valid *bool `json:"valid,omitempty" xml:"valid,omitempty"`
}

func (s QueryBaasPlusEpayauthVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEpayauthVerifyResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEpayauthVerifyResponse) SetReqMsgId(v string) *QueryBaasPlusEpayauthVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyResponse) SetResultCode(v string) *QueryBaasPlusEpayauthVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyResponse) SetResultMsg(v string) *QueryBaasPlusEpayauthVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEpayauthVerifyResponse) SetValid(v bool) *QueryBaasPlusEpayauthVerifyResponse {
	s.Valid = &v
	return s
}

type QueryBaasPlusBmpbrowserTransactionqrcodeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 蚂蚁区块链的唯一链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 链上合约id
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 蚂蚁区块链的链上交易hash值
	Hash *string `json:"hash,omitempty" xml:"hash,omitempty"`
}

func (s QueryBaasPlusBmpbrowserTransactionqrcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBmpbrowserTransactionqrcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetAuthToken(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetProductInstanceId(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetRegionName(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetBizid(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.Bizid = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetContractId(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.ContractId = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) SetHash(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeRequest {
	s.Hash = &v
	return s
}

type QueryBaasPlusBmpbrowserTransactionqrcodeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易二维码二进制内容的Base64编码
	QrCodeDownloadUrl *string `json:"qr_code_download_url,omitempty" xml:"qr_code_download_url,omitempty"`
}

func (s QueryBaasPlusBmpbrowserTransactionqrcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBmpbrowserTransactionqrcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeResponse) SetReqMsgId(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeResponse) SetResultCode(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeResponse) SetResultMsg(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserTransactionqrcodeResponse) SetQrCodeDownloadUrl(v string) *QueryBaasPlusBmpbrowserTransactionqrcodeResponse {
	s.QrCodeDownloadUrl = &v
	return s
}

type AddBaasPlusBmpbrowserPrivilegeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 蚂蚁区块链的唯一链id
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 授权查看权限的支付宝电话号码集合
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty"`
}

func (s AddBaasPlusBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *AddBaasPlusBmpbrowserPrivilegeRequest) SetAuthToken(v string) *AddBaasPlusBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *AddBaasPlusBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeRequest) SetRegionName(v string) *AddBaasPlusBmpbrowserPrivilegeRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeRequest) SetBizid(v string) *AddBaasPlusBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeRequest) SetPhoneNumbers(v string) *AddBaasPlusBmpbrowserPrivilegeRequest {
	s.PhoneNumbers = &v
	return s
}

type AddBaasPlusBmpbrowserPrivilegeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量添加权限成功与否
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s AddBaasPlusBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *AddBaasPlusBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *AddBaasPlusBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeResponse) SetResultCode(v string) *AddBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeResponse) SetResultMsg(v string) *AddBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasPlusBmpbrowserPrivilegeResponse) SetStatus(v int64) *AddBaasPlusBmpbrowserPrivilegeResponse {
	s.Status = &v
	return s
}

type QueryBaasPlusIdcocrIdcardRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 身份证图片base64编码内容
	ImageContent *string `json:"image_content,omitempty" xml:"image_content,omitempty"`
	// face: 身份证正面
	// back: 身份证反面
	Side *string `json:"side,omitempty" xml:"side,omitempty"`
}

func (s QueryBaasPlusIdcocrIdcardRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIdcocrIdcardRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIdcocrIdcardRequest) SetAuthToken(v string) *QueryBaasPlusIdcocrIdcardRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardRequest) SetProductInstanceId(v string) *QueryBaasPlusIdcocrIdcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardRequest) SetRegionName(v string) *QueryBaasPlusIdcocrIdcardRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardRequest) SetImageContent(v string) *QueryBaasPlusIdcocrIdcardRequest {
	s.ImageContent = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardRequest) SetSide(v string) *QueryBaasPlusIdcocrIdcardRequest {
	s.Side = &v
	return s
}

type QueryBaasPlusIdcocrIdcardResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 出生年月日
	Birth *string `json:"birth,omitempty" xml:"birth,omitempty"`
	// 有效期截止时间
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty"`
	// 信息抽取失败后详细错误原因
	ErrorContent *string `json:"error_content,omitempty" xml:"error_content,omitempty"`
	// 公安局分案
	Issue *string `json:"issue,omitempty" xml:"issue,omitempty"`
	// 民族
	Nationality *string `json:"nationality,omitempty" xml:"nationality,omitempty"`
	// 身份证号码
	Num *string `json:"num,omitempty" xml:"num,omitempty"`
	// 性别：男/女
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
	// 有效期开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty"`
	// 解析成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryBaasPlusIdcocrIdcardResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIdcocrIdcardResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetReqMsgId(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetResultCode(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetResultMsg(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetAddress(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Address = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetBirth(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Birth = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetEndDate(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.EndDate = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetErrorContent(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.ErrorContent = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetIssue(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Issue = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetNationality(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Nationality = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetNum(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Num = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetSex(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.Sex = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetStartDate(v string) *QueryBaasPlusIdcocrIdcardResponse {
	s.StartDate = &v
	return s
}

func (s *QueryBaasPlusIdcocrIdcardResponse) SetSuccess(v bool) *QueryBaasPlusIdcocrIdcardResponse {
	s.Success = &v
	return s
}

type InitBaasPlusCaCertificateRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务唯一性uuid，用于后续的证书查询
	BizUuid *string `json:"biz_uuid,omitempty" xml:"biz_uuid,omitempty"`
	// 证书请求(CSR)
	Command *string `json:"command,omitempty" xml:"command,omitempty"`
	// 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
	// 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
	ConfigId *string `json:"config_id,omitempty" xml:"config_id,omitempty"`
}

func (s InitBaasPlusCaCertificateRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusCaCertificateRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusCaCertificateRequest) SetAuthToken(v string) *InitBaasPlusCaCertificateRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusCaCertificateRequest) SetProductInstanceId(v string) *InitBaasPlusCaCertificateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusCaCertificateRequest) SetRegionName(v string) *InitBaasPlusCaCertificateRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusCaCertificateRequest) SetBizUuid(v string) *InitBaasPlusCaCertificateRequest {
	s.BizUuid = &v
	return s
}

func (s *InitBaasPlusCaCertificateRequest) SetCommand(v string) *InitBaasPlusCaCertificateRequest {
	s.Command = &v
	return s
}

func (s *InitBaasPlusCaCertificateRequest) SetConfigId(v string) *InitBaasPlusCaCertificateRequest {
	s.ConfigId = &v
	return s
}

type InitBaasPlusCaCertificateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证书序列号
	CertSn *string `json:"cert_sn,omitempty" xml:"cert_sn,omitempty"`
	// 证书内容
	P10 *string `json:"p10,omitempty" xml:"p10,omitempty"`
}

func (s InitBaasPlusCaCertificateResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusCaCertificateResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusCaCertificateResponse) SetReqMsgId(v string) *InitBaasPlusCaCertificateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusCaCertificateResponse) SetResultCode(v string) *InitBaasPlusCaCertificateResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusCaCertificateResponse) SetResultMsg(v string) *InitBaasPlusCaCertificateResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusCaCertificateResponse) SetCertSn(v string) *InitBaasPlusCaCertificateResponse {
	s.CertSn = &v
	return s
}

func (s *InitBaasPlusCaCertificateResponse) SetP10(v string) *InitBaasPlusCaCertificateResponse {
	s.P10 = &v
	return s
}

type InitBaasPlusContentriskInternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 用户id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 进行识别的音频地址
	AudioUrls *string `json:"audio_urls,omitempty" xml:"audio_urls,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 待校验连接
	LinkUrls *string `json:"link_urls,omitempty" xml:"link_urls,omitempty"`
	// 图片连接
	PictureUrls *string `json:"picture_urls,omitempty" xml:"picture_urls,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// 待校验文本
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 进行识别的视频地址
	VideoUrls *string `json:"video_urls,omitempty" xml:"video_urls,omitempty"`
}

func (s InitBaasPlusContentriskInternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusContentriskInternalRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusContentriskInternalRequest) SetAuthToken(v string) *InitBaasPlusContentriskInternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetProductInstanceId(v string) *InitBaasPlusContentriskInternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetRegionName(v string) *InitBaasPlusContentriskInternalRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetAccountId(v string) *InitBaasPlusContentriskInternalRequest {
	s.AccountId = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetAudioUrls(v string) *InitBaasPlusContentriskInternalRequest {
	s.AudioUrls = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetBizInfo(v *BizInfo) *InitBaasPlusContentriskInternalRequest {
	s.BizInfo = v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetLinkUrls(v string) *InitBaasPlusContentriskInternalRequest {
	s.LinkUrls = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetPictureUrls(v string) *InitBaasPlusContentriskInternalRequest {
	s.PictureUrls = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetSceneCode(v string) *InitBaasPlusContentriskInternalRequest {
	s.SceneCode = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetText(v string) *InitBaasPlusContentriskInternalRequest {
	s.Text = &v
	return s
}

func (s *InitBaasPlusContentriskInternalRequest) SetVideoUrls(v string) *InitBaasPlusContentriskInternalRequest {
	s.VideoUrls = &v
	return s
}

type InitBaasPlusContentriskInternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s InitBaasPlusContentriskInternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusContentriskInternalResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusContentriskInternalResponse) SetReqMsgId(v string) *InitBaasPlusContentriskInternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetResultCode(v string) *InitBaasPlusContentriskInternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetResultMsg(v string) *InitBaasPlusContentriskInternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetAppSceneDataId(v string) *InitBaasPlusContentriskInternalResponse {
	s.AppSceneDataId = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetEventId(v string) *InitBaasPlusContentriskInternalResponse {
	s.EventId = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetHitDetectItems(v []*HitDetectItems) *InitBaasPlusContentriskInternalResponse {
	s.HitDetectItems = v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetNeedQuery(v string) *InitBaasPlusContentriskInternalResponse {
	s.NeedQuery = &v
	return s
}

func (s *InitBaasPlusContentriskInternalResponse) SetResultAction(v string) *InitBaasPlusContentriskInternalResponse {
	s.ResultAction = &v
	return s
}

type QueryBaasPlusContentriskInternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内容业务ID，用于进行异步识别结果的索引查询
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	// 内部参数
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 内容检测事件id，根据此id查询异步检测结果
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
}

func (s QueryBaasPlusContentriskInternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusContentriskInternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusContentriskInternalRequest) SetAuthToken(v string) *QueryBaasPlusContentriskInternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetProductInstanceId(v string) *QueryBaasPlusContentriskInternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetRegionName(v string) *QueryBaasPlusContentriskInternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetAppSceneDataId(v string) *QueryBaasPlusContentriskInternalRequest {
	s.AppSceneDataId = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusContentriskInternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetEventId(v string) *QueryBaasPlusContentriskInternalRequest {
	s.EventId = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalRequest) SetSceneCode(v string) *QueryBaasPlusContentriskInternalRequest {
	s.SceneCode = &v
	return s
}

type QueryBaasPlusContentriskInternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 命中结果详情
	HitDetectItems []*HitDetectItems `json:"hit_detect_items,omitempty" xml:"hit_detect_items,omitempty" type:"Repeated"`
	// PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
}

func (s QueryBaasPlusContentriskInternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusContentriskInternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusContentriskInternalResponse) SetReqMsgId(v string) *QueryBaasPlusContentriskInternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalResponse) SetResultCode(v string) *QueryBaasPlusContentriskInternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalResponse) SetResultMsg(v string) *QueryBaasPlusContentriskInternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusContentriskInternalResponse) SetHitDetectItems(v []*HitDetectItems) *QueryBaasPlusContentriskInternalResponse {
	s.HitDetectItems = v
	return s
}

func (s *QueryBaasPlusContentriskInternalResponse) SetResultAction(v string) *QueryBaasPlusContentriskInternalResponse {
	s.ResultAction = &v
	return s
}

type InitBaasPlusIndividualidImageauthRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// Base64编码的人脸正面照片
	EncodedFacialPictureFront *string `json:"encoded_facial_picture_front,omitempty" xml:"encoded_facial_picture_front,omitempty"`
}

func (s InitBaasPlusIndividualidImageauthRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidImageauthRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetAuthToken(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetProductInstanceId(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetRegionName(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetCertName(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.CertName = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetCertNo(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.CertNo = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthRequest) SetEncodedFacialPictureFront(v string) *InitBaasPlusIndividualidImageauthRequest {
	s.EncodedFacialPictureFront = &v
	return s
}

type InitBaasPlusIndividualidImageauthResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证是否成功
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s InitBaasPlusIndividualidImageauthResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidImageauthResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidImageauthResponse) SetReqMsgId(v string) *InitBaasPlusIndividualidImageauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthResponse) SetResultCode(v string) *InitBaasPlusIndividualidImageauthResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthResponse) SetResultMsg(v string) *InitBaasPlusIndividualidImageauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthResponse) SetCertifyId(v string) *InitBaasPlusIndividualidImageauthResponse {
	s.CertifyId = &v
	return s
}

func (s *InitBaasPlusIndividualidImageauthResponse) SetPassed(v bool) *InitBaasPlusIndividualidImageauthResponse {
	s.Passed = &v
	return s
}

type AddBaasPlusIotcseAccountRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s AddBaasPlusIotcseAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusIotcseAccountRequest) GoString() string {
	return s.String()
}

func (s *AddBaasPlusIotcseAccountRequest) SetAuthToken(v string) *AddBaasPlusIotcseAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasPlusIotcseAccountRequest) SetProductInstanceId(v string) *AddBaasPlusIotcseAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasPlusIotcseAccountRequest) SetRegionName(v string) *AddBaasPlusIotcseAccountRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasPlusIotcseAccountRequest) SetBizContent(v string) *AddBaasPlusIotcseAccountRequest {
	s.BizContent = &v
	return s
}

type AddBaasPlusIotcseAccountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s AddBaasPlusIotcseAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusIotcseAccountResponse) GoString() string {
	return s.String()
}

func (s *AddBaasPlusIotcseAccountResponse) SetReqMsgId(v string) *AddBaasPlusIotcseAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasPlusIotcseAccountResponse) SetResultCode(v string) *AddBaasPlusIotcseAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasPlusIotcseAccountResponse) SetResultMsg(v string) *AddBaasPlusIotcseAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasPlusIotcseAccountResponse) SetRawResponse(v string) *AddBaasPlusIotcseAccountResponse {
	s.RawResponse = &v
	return s
}

type SaveBaasPlusIotcseEvidenceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s SaveBaasPlusIotcseEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveBaasPlusIotcseEvidenceRequest) GoString() string {
	return s.String()
}

func (s *SaveBaasPlusIotcseEvidenceRequest) SetAuthToken(v string) *SaveBaasPlusIotcseEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceRequest) SetProductInstanceId(v string) *SaveBaasPlusIotcseEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceRequest) SetRegionName(v string) *SaveBaasPlusIotcseEvidenceRequest {
	s.RegionName = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceRequest) SetBizContent(v string) *SaveBaasPlusIotcseEvidenceRequest {
	s.BizContent = &v
	return s
}

type SaveBaasPlusIotcseEvidenceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s SaveBaasPlusIotcseEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveBaasPlusIotcseEvidenceResponse) GoString() string {
	return s.String()
}

func (s *SaveBaasPlusIotcseEvidenceResponse) SetReqMsgId(v string) *SaveBaasPlusIotcseEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceResponse) SetResultCode(v string) *SaveBaasPlusIotcseEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceResponse) SetResultMsg(v string) *SaveBaasPlusIotcseEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveBaasPlusIotcseEvidenceResponse) SetRawResponse(v string) *SaveBaasPlusIotcseEvidenceResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseEvidenceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseEvidenceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseEvidenceRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseEvidenceRequest) SetAuthToken(v string) *QueryBaasPlusIotcseEvidenceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseEvidenceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceRequest) SetRegionName(v string) *QueryBaasPlusIotcseEvidenceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceRequest) SetBizContent(v string) *QueryBaasPlusIotcseEvidenceRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseEvidenceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseEvidenceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseEvidenceResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseEvidenceResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseEvidenceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceResponse) SetResultCode(v string) *QueryBaasPlusIotcseEvidenceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceResponse) SetResultMsg(v string) *QueryBaasPlusIotcseEvidenceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidenceResponse) SetRawResponse(v string) *QueryBaasPlusIotcseEvidenceResponse {
	s.RawResponse = &v
	return s
}

type CreateBaasPlusDidCorporatedidagentRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 扩展字段
	// { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
	Indexs []*string `json:"indexs,omitempty" xml:"indexs,omitempty" type:"Repeated"`
	// 企业名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 携带自己定义的服务类型
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
}

func (s CreateBaasPlusDidCorporatedidagentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusDidCorporatedidagentRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetAuthToken(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetProductInstanceId(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetRegionName(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.RegionName = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetExtensionInfo(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetIndexs(v []*string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.Indexs = v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetOwnerName(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetOwnerUid(v string) *CreateBaasPlusDidCorporatedidagentRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentRequest) SetServices(v []*DidDocServicesInfo) *CreateBaasPlusDidCorporatedidagentRequest {
	s.Services = v
	return s
}

type CreateBaasPlusDidCorporatedidagentResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s CreateBaasPlusDidCorporatedidagentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasPlusDidCorporatedidagentResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasPlusDidCorporatedidagentResponse) SetReqMsgId(v string) *CreateBaasPlusDidCorporatedidagentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentResponse) SetResultCode(v string) *CreateBaasPlusDidCorporatedidagentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentResponse) SetResultMsg(v string) *CreateBaasPlusDidCorporatedidagentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasPlusDidCorporatedidagentResponse) SetDid(v string) *CreateBaasPlusDidCorporatedidagentResponse {
	s.Did = &v
	return s
}

type InitBaasPlusIndividualidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证 默认为FACE
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
}

func (s InitBaasPlusIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetAuthToken(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetRegionName(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetBizCode(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.BizCode = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetCertName(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.CertName = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalRequest) SetCertNo(v string) *InitBaasPlusIndividualidFaceauthinternalRequest {
	s.CertNo = &v
	return s
}

type InitBaasPlusIndividualidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s InitBaasPlusIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *InitBaasPlusIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalResponse) SetResultCode(v string) *InitBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalResponse) SetResultMsg(v string) *InitBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusIndividualidFaceauthinternalResponse) SetCertifyId(v string) *InitBaasPlusIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

type CertifyBaasPlusIndividualidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 回调通知地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// 认证的唯一性id
	//
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证完成后回跳地址
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyBaasPlusIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetAuthToken(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetRegionName(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetCallbackUrl(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetCertifyId(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.CertifyId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalRequest) SetRedirectUrl(v string) *CertifyBaasPlusIndividualidFaceauthinternalRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyBaasPlusIndividualidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyBaasPlusIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *CertifyBaasPlusIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalResponse) SetResultCode(v string) *CertifyBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalResponse) SetResultMsg(v string) *CertifyBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalResponse) SetCertifyId(v string) *CertifyBaasPlusIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

func (s *CertifyBaasPlusIndividualidFaceauthinternalResponse) SetVerifyUrl(v string) *CertifyBaasPlusIndividualidFaceauthinternalResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusIndividualidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
}

func (s QueryBaasPlusIndividualidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidFaceauthinternalRequest) SetAuthToken(v string) *QueryBaasPlusIndividualidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalRequest) SetProductInstanceId(v string) *QueryBaasPlusIndividualidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalRequest) SetRegionName(v string) *QueryBaasPlusIndividualidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusIndividualidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalRequest) SetCertifyId(v string) *QueryBaasPlusIndividualidFaceauthinternalRequest {
	s.CertifyId = &v
	return s
}

type QueryBaasPlusIndividualidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性id
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 用户是否完成刷脸
	Finished *bool `json:"finished,omitempty" xml:"finished,omitempty"`
	// 是否认证通过
	Passed *bool `json:"passed,omitempty" xml:"passed,omitempty"`
}

func (s QueryBaasPlusIndividualidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIndividualidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetReqMsgId(v string) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetResultCode(v string) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetResultMsg(v string) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetCertifyId(v string) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.CertifyId = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetFinished(v bool) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.Finished = &v
	return s
}

func (s *QueryBaasPlusIndividualidFaceauthinternalResponse) SetPassed(v bool) *QueryBaasPlusIndividualidFaceauthinternalResponse {
	s.Passed = &v
	return s
}

type InitBaasPlusEnterpriseidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty"`
	// 企业法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号（目前只支持身份证号）
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s InitBaasPlusEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetRegionName(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetEpCertName(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.EpCertName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetEpCertNo(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetEpCertType(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.EpCertType = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetLegalPersonCertName(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalRequest) SetLegalPersonCertNo(v string) *InitBaasPlusEnterpriseidFaceauthinternalRequest {
	s.LegalPersonCertNo = &v
	return s
}

type InitBaasPlusEnterpriseidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的业务唯一性标示
	//
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s InitBaasPlusEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBaasPlusEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *InitBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *InitBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *InitBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitBaasPlusEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *InitBaasPlusEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

type CertifyBaasPlusEnterpriseidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 回调通知地址
	//
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	// https://www.example.com/redircet
	RedirectUrl *string `json:"redirect_url,omitempty" xml:"redirect_url,omitempty"`
}

func (s CertifyBaasPlusEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetRegionName(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetBizNo(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.BizNo = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetCallbackUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.CallbackUrl = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) SetRedirectUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalRequest {
	s.RedirectUrl = &v
	return s
}

type CertifyBaasPlusEnterpriseidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 认证url
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s CertifyBaasPlusEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s CertifyBaasPlusEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

func (s *CertifyBaasPlusEnterpriseidFaceauthinternalResponse) SetVerifyUrl(v string) *CertifyBaasPlusEnterpriseidFaceauthinternalResponse {
	s.VerifyUrl = &v
	return s
}

type QueryBaasPlusEverifyTwometainternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
}

func (s QueryBaasPlusEverifyTwometainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyTwometainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetAuthToken(v string) *QueryBaasPlusEverifyTwometainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyTwometainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetRegionName(v string) *QueryBaasPlusEverifyTwometainternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEverifyTwometainternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetEpCertName(v string) *QueryBaasPlusEverifyTwometainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyTwometainternalRequest {
	s.EpCertNo = &v
	return s
}

type QueryBaasPlusEverifyTwometainternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyTwometainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyTwometainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetResultCode(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetResultMsg(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetCode(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetOpenTime(v string) *QueryBaasPlusEverifyTwometainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyTwometainternalResponse) SetPassed(v bool) *QueryBaasPlusEverifyTwometainternalResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEverifyThreemetainternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
}

func (s QueryBaasPlusEverifyThreemetainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyThreemetainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetAuthToken(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetRegionName(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetEpCertName(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEverifyThreemetainternalRequest {
	s.LegalPersonCertName = &v
	return s
}

type QueryBaasPlusEverifyThreemetainternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyThreemetainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyThreemetainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetResultCode(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetResultMsg(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetCode(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetOpenTime(v string) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyThreemetainternalResponse) SetPassed(v bool) *QueryBaasPlusEverifyThreemetainternalResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEverifyFourmetainternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 法人姓名
	//
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty"`
	// 企业法人身份证号码
	//
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty"`
}

func (s QueryBaasPlusEverifyFourmetainternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyFourmetainternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetAuthToken(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetProductInstanceId(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetRegionName(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetEpCertName(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.EpCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetEpCertNo(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.EpCertNo = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetLegalPersonCertName(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalRequest) SetLegalPersonCertNo(v string) *QueryBaasPlusEverifyFourmetainternalRequest {
	s.LegalPersonCertNo = &v
	return s
}

type QueryBaasPlusEverifyFourmetainternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEverifyFourmetainternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEverifyFourmetainternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetReqMsgId(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetResultCode(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetResultMsg(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetCode(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.Code = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetEnterpriseStatus(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.EnterpriseStatus = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetOpenTime(v string) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.OpenTime = &v
	return s
}

func (s *QueryBaasPlusEverifyFourmetainternalResponse) SetPassed(v bool) *QueryBaasPlusEverifyFourmetainternalResponse {
	s.Passed = &v
	return s
}

type QueryBaasPlusEnterpriseidFaceauthinternalRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 内部字段
	BizInfo *BizInfo `json:"biz_info,omitempty" xml:"biz_info,omitempty"`
	// 认证的唯一性标示
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
}

func (s QueryBaasPlusEnterpriseidFaceauthinternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidFaceauthinternalRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalRequest) SetAuthToken(v string) *QueryBaasPlusEnterpriseidFaceauthinternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalRequest) SetProductInstanceId(v string) *QueryBaasPlusEnterpriseidFaceauthinternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalRequest) SetRegionName(v string) *QueryBaasPlusEnterpriseidFaceauthinternalRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalRequest) SetBizInfo(v *BizInfo) *QueryBaasPlusEnterpriseidFaceauthinternalRequest {
	s.BizInfo = v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalRequest) SetBizNo(v string) *QueryBaasPlusEnterpriseidFaceauthinternalRequest {
	s.BizNo = &v
	return s
}

type QueryBaasPlusEnterpriseidFaceauthinternalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusEnterpriseidFaceauthinternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusEnterpriseidFaceauthinternalResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetReqMsgId(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetResultCode(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetResultMsg(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetBizNo(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.BizNo = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetFailedCode(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.FailedCode = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetFailedMessage(v string) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.FailedMessage = &v
	return s
}

func (s *QueryBaasPlusEnterpriseidFaceauthinternalResponse) SetPassed(v bool) *QueryBaasPlusEnterpriseidFaceauthinternalResponse {
	s.Passed = &v
	return s
}

type AddBaasPlusIotcseThingsdidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 序列化的json string
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s AddBaasPlusIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *AddBaasPlusIotcseThingsdidRequest) SetAuthToken(v string) *AddBaasPlusIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidRequest) SetProductInstanceId(v string) *AddBaasPlusIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidRequest) SetRegionName(v string) *AddBaasPlusIotcseThingsdidRequest {
	s.RegionName = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidRequest) SetBizContent(v string) *AddBaasPlusIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type AddBaasPlusIotcseThingsdidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s AddBaasPlusIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBaasPlusIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *AddBaasPlusIotcseThingsdidResponse) SetReqMsgId(v string) *AddBaasPlusIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidResponse) SetResultCode(v string) *AddBaasPlusIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidResponse) SetResultMsg(v string) *AddBaasPlusIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddBaasPlusIotcseThingsdidResponse) SetRawResponse(v string) *AddBaasPlusIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type UpdateBaasPlusIotcseThingsdidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s UpdateBaasPlusIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseThingsdidRequest) SetAuthToken(v string) *UpdateBaasPlusIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidRequest) SetProductInstanceId(v string) *UpdateBaasPlusIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidRequest) SetRegionName(v string) *UpdateBaasPlusIotcseThingsdidRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidRequest) SetBizContent(v string) *UpdateBaasPlusIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type UpdateBaasPlusIotcseThingsdidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateBaasPlusIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseThingsdidResponse) SetReqMsgId(v string) *UpdateBaasPlusIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidResponse) SetResultCode(v string) *UpdateBaasPlusIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidResponse) SetResultMsg(v string) *UpdateBaasPlusIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasPlusIotcseThingsdidResponse) SetRawResponse(v string) *UpdateBaasPlusIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseThingsdidRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseThingsdidRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseThingsdidRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseThingsdidRequest) SetAuthToken(v string) *QueryBaasPlusIotcseThingsdidRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseThingsdidRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidRequest) SetRegionName(v string) *QueryBaasPlusIotcseThingsdidRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidRequest) SetBizContent(v string) *QueryBaasPlusIotcseThingsdidRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseThingsdidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseThingsdidResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseThingsdidResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseThingsdidResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseThingsdidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidResponse) SetResultCode(v string) *QueryBaasPlusIotcseThingsdidResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidResponse) SetResultMsg(v string) *QueryBaasPlusIotcseThingsdidResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseThingsdidResponse) SetRawResponse(v string) *QueryBaasPlusIotcseThingsdidResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseAsyncprocessRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// {"key":"value"}
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseAsyncprocessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseAsyncprocessRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseAsyncprocessRequest) SetAuthToken(v string) *QueryBaasPlusIotcseAsyncprocessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseAsyncprocessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessRequest) SetRegionName(v string) *QueryBaasPlusIotcseAsyncprocessRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessRequest) SetBizContent(v string) *QueryBaasPlusIotcseAsyncprocessRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseAsyncprocessResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseAsyncprocessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseAsyncprocessResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseAsyncprocessResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseAsyncprocessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessResponse) SetResultCode(v string) *QueryBaasPlusIotcseAsyncprocessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessResponse) SetResultMsg(v string) *QueryBaasPlusIotcseAsyncprocessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseAsyncprocessResponse) SetRawResponse(v string) *QueryBaasPlusIotcseAsyncprocessResponse {
	s.RawResponse = &v
	return s
}

type ExecBaasPlusIotcseGroupRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s ExecBaasPlusIotcseGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecBaasPlusIotcseGroupRequest) GoString() string {
	return s.String()
}

func (s *ExecBaasPlusIotcseGroupRequest) SetAuthToken(v string) *ExecBaasPlusIotcseGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupRequest) SetProductInstanceId(v string) *ExecBaasPlusIotcseGroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupRequest) SetRegionName(v string) *ExecBaasPlusIotcseGroupRequest {
	s.RegionName = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupRequest) SetBizContent(v string) *ExecBaasPlusIotcseGroupRequest {
	s.BizContent = &v
	return s
}

type ExecBaasPlusIotcseGroupResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s ExecBaasPlusIotcseGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecBaasPlusIotcseGroupResponse) GoString() string {
	return s.String()
}

func (s *ExecBaasPlusIotcseGroupResponse) SetReqMsgId(v string) *ExecBaasPlusIotcseGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupResponse) SetResultCode(v string) *ExecBaasPlusIotcseGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupResponse) SetResultMsg(v string) *ExecBaasPlusIotcseGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecBaasPlusIotcseGroupResponse) SetRawResponse(v string) *ExecBaasPlusIotcseGroupResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseGroupdeviceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseGroupdeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseGroupdeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseGroupdeviceRequest) SetAuthToken(v string) *QueryBaasPlusIotcseGroupdeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseGroupdeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceRequest) SetRegionName(v string) *QueryBaasPlusIotcseGroupdeviceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceRequest) SetBizContent(v string) *QueryBaasPlusIotcseGroupdeviceRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseGroupdeviceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseGroupdeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseGroupdeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseGroupdeviceResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseGroupdeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceResponse) SetResultCode(v string) *QueryBaasPlusIotcseGroupdeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceResponse) SetResultMsg(v string) *QueryBaasPlusIotcseGroupdeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseGroupdeviceResponse) SetRawResponse(v string) *QueryBaasPlusIotcseGroupdeviceResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseDevicegroupRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseDevicegroupRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseDevicegroupRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseDevicegroupRequest) SetAuthToken(v string) *QueryBaasPlusIotcseDevicegroupRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseDevicegroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupRequest) SetRegionName(v string) *QueryBaasPlusIotcseDevicegroupRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupRequest) SetBizContent(v string) *QueryBaasPlusIotcseDevicegroupRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseDevicegroupResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseDevicegroupResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseDevicegroupResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseDevicegroupResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseDevicegroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupResponse) SetResultCode(v string) *QueryBaasPlusIotcseDevicegroupResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupResponse) SetResultMsg(v string) *QueryBaasPlusIotcseDevicegroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicegroupResponse) SetRawResponse(v string) *QueryBaasPlusIotcseDevicegroupResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseTenantdeviceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseTenantdeviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseTenantdeviceRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseTenantdeviceRequest) SetAuthToken(v string) *QueryBaasPlusIotcseTenantdeviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseTenantdeviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceRequest) SetRegionName(v string) *QueryBaasPlusIotcseTenantdeviceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceRequest) SetBizContent(v string) *QueryBaasPlusIotcseTenantdeviceRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseTenantdeviceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseTenantdeviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseTenantdeviceResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseTenantdeviceResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseTenantdeviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceResponse) SetResultCode(v string) *QueryBaasPlusIotcseTenantdeviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceResponse) SetResultMsg(v string) *QueryBaasPlusIotcseTenantdeviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseTenantdeviceResponse) SetRawResponse(v string) *QueryBaasPlusIotcseTenantdeviceResponse {
	s.RawResponse = &v
	return s
}

type UpdateBaasPlusIotcseDevicestatusRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s UpdateBaasPlusIotcseDevicestatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseDevicestatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseDevicestatusRequest) SetAuthToken(v string) *UpdateBaasPlusIotcseDevicestatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusRequest) SetProductInstanceId(v string) *UpdateBaasPlusIotcseDevicestatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusRequest) SetRegionName(v string) *UpdateBaasPlusIotcseDevicestatusRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusRequest) SetBizContent(v string) *UpdateBaasPlusIotcseDevicestatusRequest {
	s.BizContent = &v
	return s
}

type UpdateBaasPlusIotcseDevicestatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateBaasPlusIotcseDevicestatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseDevicestatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseDevicestatusResponse) SetReqMsgId(v string) *UpdateBaasPlusIotcseDevicestatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusResponse) SetResultCode(v string) *UpdateBaasPlusIotcseDevicestatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusResponse) SetResultMsg(v string) *UpdateBaasPlusIotcseDevicestatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicestatusResponse) SetRawResponse(v string) *UpdateBaasPlusIotcseDevicestatusResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseDevicemodelRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseDevicemodelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseDevicemodelRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseDevicemodelRequest) SetAuthToken(v string) *QueryBaasPlusIotcseDevicemodelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseDevicemodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelRequest) SetRegionName(v string) *QueryBaasPlusIotcseDevicemodelRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelRequest) SetBizContent(v string) *QueryBaasPlusIotcseDevicemodelRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseDevicemodelResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseDevicemodelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseDevicemodelResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseDevicemodelResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseDevicemodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelResponse) SetResultCode(v string) *QueryBaasPlusIotcseDevicemodelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelResponse) SetResultMsg(v string) *QueryBaasPlusIotcseDevicemodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseDevicemodelResponse) SetRawResponse(v string) *QueryBaasPlusIotcseDevicemodelResponse {
	s.RawResponse = &v
	return s
}

type UpdateBaasPlusIotcseDevicespaceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s UpdateBaasPlusIotcseDevicespaceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseDevicespaceRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseDevicespaceRequest) SetAuthToken(v string) *UpdateBaasPlusIotcseDevicespaceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceRequest) SetProductInstanceId(v string) *UpdateBaasPlusIotcseDevicespaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceRequest) SetRegionName(v string) *UpdateBaasPlusIotcseDevicespaceRequest {
	s.RegionName = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceRequest) SetBizContent(v string) *UpdateBaasPlusIotcseDevicespaceRequest {
	s.BizContent = &v
	return s
}

type UpdateBaasPlusIotcseDevicespaceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s UpdateBaasPlusIotcseDevicespaceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasPlusIotcseDevicespaceResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasPlusIotcseDevicespaceResponse) SetReqMsgId(v string) *UpdateBaasPlusIotcseDevicespaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceResponse) SetResultCode(v string) *UpdateBaasPlusIotcseDevicespaceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceResponse) SetResultMsg(v string) *UpdateBaasPlusIotcseDevicespaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasPlusIotcseDevicespaceResponse) SetRawResponse(v string) *UpdateBaasPlusIotcseDevicespaceResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusIotcseEvidencebatchRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 暂无
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
}

func (s QueryBaasPlusIotcseEvidencebatchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseEvidencebatchRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseEvidencebatchRequest) SetAuthToken(v string) *QueryBaasPlusIotcseEvidencebatchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchRequest) SetProductInstanceId(v string) *QueryBaasPlusIotcseEvidencebatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchRequest) SetRegionName(v string) *QueryBaasPlusIotcseEvidencebatchRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchRequest) SetBizContent(v string) *QueryBaasPlusIotcseEvidencebatchRequest {
	s.BizContent = &v
	return s
}

type QueryBaasPlusIotcseEvidencebatchResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 暂无
	RawResponse *string `json:"raw_response,omitempty" xml:"raw_response,omitempty"`
}

func (s QueryBaasPlusIotcseEvidencebatchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusIotcseEvidencebatchResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusIotcseEvidencebatchResponse) SetReqMsgId(v string) *QueryBaasPlusIotcseEvidencebatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchResponse) SetResultCode(v string) *QueryBaasPlusIotcseEvidencebatchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchResponse) SetResultMsg(v string) *QueryBaasPlusIotcseEvidencebatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusIotcseEvidencebatchResponse) SetRawResponse(v string) *QueryBaasPlusIotcseEvidencebatchResponse {
	s.RawResponse = &v
	return s
}

type QueryBaasPlusBlocrBusinesslicenseRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件二进制内容 + base64
	ImageRaw *string `json:"image_raw,omitempty" xml:"image_raw,omitempty"`
	// 图片下载url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 服务调用来源(需要咨询服务提供方)
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s QueryBaasPlusBlocrBusinesslicenseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBlocrBusinesslicenseRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetAuthToken(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetProductInstanceId(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetRegionName(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetImageRaw(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.ImageRaw = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetImageUrl(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.ImageUrl = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetSource(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.Source = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseRequest) SetTraceId(v string) *QueryBaasPlusBlocrBusinesslicenseRequest {
	s.TraceId = &v
	return s
}

type QueryBaasPlusBlocrBusinesslicenseResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusBlocrBusinesslicenseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBlocrBusinesslicenseResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetReqMsgId(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetResultCode(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetResultMsg(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetAlgoMsg(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.AlgoMsg = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetAlgoRet(v int64) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.AlgoRet = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetMessage(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.Message = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetResult(v string) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.Result = &v
	return s
}

func (s *QueryBaasPlusBlocrBusinesslicenseResponse) SetRet(v int64) *QueryBaasPlusBlocrBusinesslicenseResponse {
	s.Ret = &v
	return s
}

type QueryBaasPlusInvoicesocrVatinvoiceRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty"`
	// 文件二进制内容 + base64
	ImageRaw *string `json:"image_raw,omitempty" xml:"image_raw,omitempty"`
	// 图片下载url
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 服务调用来源(需要咨询服务提供方)
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s QueryBaasPlusInvoicesocrVatinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusInvoicesocrVatinvoiceRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetAuthToken(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetProductInstanceId(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetRegionName(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetFileType(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.FileType = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetImageRaw(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.ImageRaw = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetImageUrl(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.ImageUrl = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetSource(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.Source = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceRequest) SetTraceId(v string) *QueryBaasPlusInvoicesocrVatinvoiceRequest {
	s.TraceId = &v
	return s
}

type QueryBaasPlusInvoicesocrVatinvoiceResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryBaasPlusInvoicesocrVatinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusInvoicesocrVatinvoiceResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetReqMsgId(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetResultCode(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetResultMsg(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetAlgoMsg(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.AlgoMsg = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetAlgoRet(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.AlgoRet = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetMessage(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.Message = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetResult(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.Result = &v
	return s
}

func (s *QueryBaasPlusInvoicesocrVatinvoiceResponse) SetRet(v string) *QueryBaasPlusInvoicesocrVatinvoiceResponse {
	s.Ret = &v
	return s
}

type QueryBaasPlusBmpbrowserPrivilegeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 蚂蚁区块链的唯一链id
	//
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 查看权限的支付宝电话号码
	//
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
}

func (s QueryBaasPlusBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBmpbrowserPrivilegeRequest) SetAuthToken(v string) *QueryBaasPlusBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *QueryBaasPlusBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeRequest) SetRegionName(v string) *QueryBaasPlusBmpbrowserPrivilegeRequest {
	s.RegionName = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeRequest) SetBizid(v string) *QueryBaasPlusBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeRequest) SetPhoneNumber(v string) *QueryBaasPlusBmpbrowserPrivilegeRequest {
	s.PhoneNumber = &v
	return s
}

type QueryBaasPlusBmpbrowserPrivilegeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权限成功与否
	//
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryBaasPlusBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasPlusBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasPlusBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *QueryBaasPlusBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeResponse) SetResultCode(v string) *QueryBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeResponse) SetResultMsg(v string) *QueryBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasPlusBmpbrowserPrivilegeResponse) SetStatus(v int64) *QueryBaasPlusBmpbrowserPrivilegeResponse {
	s.Status = &v
	return s
}

type CancelBaasPlusBmpbrowserPrivilegeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 蚂蚁区块链的唯一链id
	//
	Bizid *string `json:"bizid,omitempty" xml:"bizid,omitempty"`
	// 取消查看权限的支付宝电话号码集合
	//
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty"`
}

func (s CancelBaasPlusBmpbrowserPrivilegeRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelBaasPlusBmpbrowserPrivilegeRequest) GoString() string {
	return s.String()
}

func (s *CancelBaasPlusBmpbrowserPrivilegeRequest) SetAuthToken(v string) *CancelBaasPlusBmpbrowserPrivilegeRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeRequest) SetProductInstanceId(v string) *CancelBaasPlusBmpbrowserPrivilegeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeRequest) SetRegionName(v string) *CancelBaasPlusBmpbrowserPrivilegeRequest {
	s.RegionName = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeRequest) SetBizid(v string) *CancelBaasPlusBmpbrowserPrivilegeRequest {
	s.Bizid = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeRequest) SetPhoneNumbers(v string) *CancelBaasPlusBmpbrowserPrivilegeRequest {
	s.PhoneNumbers = &v
	return s
}

type CancelBaasPlusBmpbrowserPrivilegeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量取消权限成功与否
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CancelBaasPlusBmpbrowserPrivilegeResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelBaasPlusBmpbrowserPrivilegeResponse) GoString() string {
	return s.String()
}

func (s *CancelBaasPlusBmpbrowserPrivilegeResponse) SetReqMsgId(v string) *CancelBaasPlusBmpbrowserPrivilegeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeResponse) SetResultCode(v string) *CancelBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeResponse) SetResultMsg(v string) *CancelBaasPlusBmpbrowserPrivilegeResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelBaasPlusBmpbrowserPrivilegeResponse) SetStatus(v int64) *CancelBaasPlusBmpbrowserPrivilegeResponse {
	s.Status = &v
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
				"sdkVersion":     tea.String("Tea-SDK-20200902"),
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
 * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
 * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
 */
func (client *Client) QueryBaasPlusIndividualidInternalmask(request *QueryBaasPlusIndividualidInternalmaskRequest) (_result *QueryBaasPlusIndividualidInternalmaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidInternalmaskResponse{}
	_body, _err := client.QueryBaasPlusIndividualidInternalmaskEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternalmaskEx(request *QueryBaasPlusIndividualidInternalmaskRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidInternalmaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidInternalmaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalmask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternalfourmeta(request *QueryBaasPlusEnterpriseidInternalfourmetaRequest) (_result *QueryBaasPlusEnterpriseidInternalfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEnterpriseidInternalfourmetaResponse{}
	_body, _err := client.QueryBaasPlusEnterpriseidInternalfourmetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternalfourmetaEx(request *QueryBaasPlusEnterpriseidInternalfourmetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEnterpriseidInternalfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEnterpriseidInternalfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internalfourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternalthreemeta(request *QueryBaasPlusEnterpriseidInternalthreemetaRequest) (_result *QueryBaasPlusEnterpriseidInternalthreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEnterpriseidInternalthreemetaResponse{}
	_body, _err := client.QueryBaasPlusEnterpriseidInternalthreemetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternalthreemetaEx(request *QueryBaasPlusEnterpriseidInternalthreemetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEnterpriseidInternalthreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEnterpriseidInternalthreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internalthreemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternaltwometa(request *QueryBaasPlusEnterpriseidInternaltwometaRequest) (_result *QueryBaasPlusEnterpriseidInternaltwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEnterpriseidInternaltwometaResponse{}
	_body, _err := client.QueryBaasPlusEnterpriseidInternaltwometaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidInternaltwometaEx(request *QueryBaasPlusEnterpriseidInternaltwometaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEnterpriseidInternaltwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEnterpriseidInternaltwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.internaltwometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusEnterpriseidFaceauth(request *InitBaasPlusEnterpriseidFaceauthRequest) (_result *InitBaasPlusEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.InitBaasPlusEnterpriseidFaceauthEx(request, runtime)
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
func (client *Client) InitBaasPlusEnterpriseidFaceauthEx(request *InitBaasPlusEnterpriseidFaceauthRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidFaceauth(request *QueryBaasPlusEnterpriseidFaceauthRequest) (_result *QueryBaasPlusEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.QueryBaasPlusEnterpriseidFaceauthEx(request, runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidFaceauthEx(request *QueryBaasPlusEnterpriseidFaceauthRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternalfourmeta(request *QueryBaasPlusIndividualidInternalfourmetaRequest) (_result *QueryBaasPlusIndividualidInternalfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidInternalfourmetaResponse{}
	_body, _err := client.QueryBaasPlusIndividualidInternalfourmetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternalfourmetaEx(request *QueryBaasPlusIndividualidInternalfourmetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidInternalfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidInternalfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalfourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternalthreemeta(request *QueryBaasPlusIndividualidInternalthreemetaRequest) (_result *QueryBaasPlusIndividualidInternalthreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidInternalthreemetaResponse{}
	_body, _err := client.QueryBaasPlusIndividualidInternalthreemetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternalthreemetaEx(request *QueryBaasPlusIndividualidInternalthreemetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidInternalthreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidInternalthreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internalthreemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternaltwometa(request *QueryBaasPlusIndividualidInternaltwometaRequest) (_result *QueryBaasPlusIndividualidInternaltwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidInternaltwometaResponse{}
	_body, _err := client.QueryBaasPlusIndividualidInternaltwometaEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidInternaltwometaEx(request *QueryBaasPlusIndividualidInternaltwometaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidInternaltwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidInternaltwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.internaltwometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateBaasPlusBaicorpInternalevaluationasync(request *CreateBaasPlusBaicorpInternalevaluationasyncRequest) (_result *CreateBaasPlusBaicorpInternalevaluationasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasPlusBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.CreateBaasPlusBaicorpInternalevaluationasyncEx(request, runtime)
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
func (client *Client) CreateBaasPlusBaicorpInternalevaluationasyncEx(request *CreateBaasPlusBaicorpInternalevaluationasyncRequest, runtime *util.RuntimeOptions) (_result *CreateBaasPlusBaicorpInternalevaluationasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasPlusBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalevaluationasync.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateBaasPlusBaicorpInternalmonitorasync(request *CreateBaasPlusBaicorpInternalmonitorasyncRequest) (_result *CreateBaasPlusBaicorpInternalmonitorasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasPlusBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.CreateBaasPlusBaicorpInternalmonitorasyncEx(request, runtime)
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
func (client *Client) CreateBaasPlusBaicorpInternalmonitorasyncEx(request *CreateBaasPlusBaicorpInternalmonitorasyncRequest, runtime *util.RuntimeOptions) (_result *CreateBaasPlusBaicorpInternalmonitorasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasPlusBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalmonitorasync.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalevaluationasync(request *QueryBaasPlusBaicorpInternalevaluationasyncRequest) (_result *QueryBaasPlusBaicorpInternalevaluationasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.QueryBaasPlusBaicorpInternalevaluationasyncEx(request, runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalevaluationasyncEx(request *QueryBaasPlusBaicorpInternalevaluationasyncRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBaicorpInternalevaluationasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBaicorpInternalevaluationasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalevaluationasync.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalmonitorasync(request *QueryBaasPlusBaicorpInternalmonitorasyncRequest) (_result *QueryBaasPlusBaicorpInternalmonitorasyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.QueryBaasPlusBaicorpInternalmonitorasyncEx(request, runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalmonitorasyncEx(request *QueryBaasPlusBaicorpInternalmonitorasyncRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBaicorpInternalmonitorasyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBaicorpInternalmonitorasyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalmonitorasync.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyBaasPlusEnterpriseidFaceauth(request *CertifyBaasPlusEnterpriseidFaceauthRequest) (_result *CertifyBaasPlusEnterpriseidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.CertifyBaasPlusEnterpriseidFaceauthEx(request, runtime)
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
func (client *Client) CertifyBaasPlusEnterpriseidFaceauthEx(request *CertifyBaasPlusEnterpriseidFaceauthRequest, runtime *util.RuntimeOptions) (_result *CertifyBaasPlusEnterpriseidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyBaasPlusEnterpriseidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusIndividualidFaceauth(request *InitBaasPlusIndividualidFaceauthRequest) (_result *InitBaasPlusIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.InitBaasPlusIndividualidFaceauthEx(request, runtime)
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
func (client *Client) InitBaasPlusIndividualidFaceauthEx(request *InitBaasPlusIndividualidFaceauthRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyBaasPlusIndividualidFaceauth(request *CertifyBaasPlusIndividualidFaceauthRequest) (_result *CertifyBaasPlusIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.CertifyBaasPlusIndividualidFaceauthEx(request, runtime)
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
func (client *Client) CertifyBaasPlusIndividualidFaceauthEx(request *CertifyBaasPlusIndividualidFaceauthRequest, runtime *util.RuntimeOptions) (_result *CertifyBaasPlusIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIndividualidFaceauth(request *QueryBaasPlusIndividualidFaceauthRequest) (_result *QueryBaasPlusIndividualidFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.QueryBaasPlusIndividualidFaceauthEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidFaceauthEx(request *QueryBaasPlusIndividualidFaceauthRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusDataserviceBlockchainheight(request *GetBaasPlusDataserviceBlockchainheightRequest) (_result *GetBaasPlusDataserviceBlockchainheightResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusDataserviceBlockchainheightResponse{}
	_body, _err := client.GetBaasPlusDataserviceBlockchainheightEx(request, runtime)
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
func (client *Client) GetBaasPlusDataserviceBlockchainheightEx(request *GetBaasPlusDataserviceBlockchainheightRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusDataserviceBlockchainheightResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusDataserviceBlockchainheightResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.blockchainheight.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusDataserviceTransactioncount(request *GetBaasPlusDataserviceTransactioncountRequest) (_result *GetBaasPlusDataserviceTransactioncountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusDataserviceTransactioncountResponse{}
	_body, _err := client.GetBaasPlusDataserviceTransactioncountEx(request, runtime)
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
func (client *Client) GetBaasPlusDataserviceTransactioncountEx(request *GetBaasPlusDataserviceTransactioncountRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusDataserviceTransactioncountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusDataserviceTransactioncountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.transactioncount.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusDataserviceTransactioninfo(request *GetBaasPlusDataserviceTransactioninfoRequest) (_result *GetBaasPlusDataserviceTransactioninfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusDataserviceTransactioninfoResponse{}
	_body, _err := client.GetBaasPlusDataserviceTransactioninfoEx(request, runtime)
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
func (client *Client) GetBaasPlusDataserviceTransactioninfoEx(request *GetBaasPlusDataserviceTransactioninfoRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusDataserviceTransactioninfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusDataserviceTransactioninfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.transactioninfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ListBaasPlusDataserviceLastblocks(request *ListBaasPlusDataserviceLastblocksRequest) (_result *ListBaasPlusDataserviceLastblocksResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ListBaasPlusDataserviceLastblocksResponse{}
	_body, _err := client.ListBaasPlusDataserviceLastblocksEx(request, runtime)
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
func (client *Client) ListBaasPlusDataserviceLastblocksEx(request *ListBaasPlusDataserviceLastblocksRequest, runtime *util.RuntimeOptions) (_result *ListBaasPlusDataserviceLastblocksResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListBaasPlusDataserviceLastblocksResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.dataservice.lastblocks.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusTasAttestation(request *GetBaasPlusTasAttestationRequest) (_result *GetBaasPlusTasAttestationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusTasAttestationResponse{}
	_body, _err := client.GetBaasPlusTasAttestationEx(request, runtime)
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
func (client *Client) GetBaasPlusTasAttestationEx(request *GetBaasPlusTasAttestationRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusTasAttestationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusTasAttestationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.attestation.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) VerifyBaasPlusTasCtsr(request *VerifyBaasPlusTasCtsrRequest) (_result *VerifyBaasPlusTasCtsrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &VerifyBaasPlusTasCtsrResponse{}
	_body, _err := client.VerifyBaasPlusTasCtsrEx(request, runtime)
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
func (client *Client) VerifyBaasPlusTasCtsrEx(request *VerifyBaasPlusTasCtsrRequest, runtime *util.RuntimeOptions) (_result *VerifyBaasPlusTasCtsrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyBaasPlusTasCtsrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.ctsr.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusTasCertificate(request *GetBaasPlusTasCertificateRequest) (_result *GetBaasPlusTasCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusTasCertificateResponse{}
	_body, _err := client.GetBaasPlusTasCertificateEx(request, runtime)
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
func (client *Client) GetBaasPlusTasCertificateEx(request *GetBaasPlusTasCertificateRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusTasCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusTasCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.certificate.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetBaasPlusTasTransactionattestation(request *GetBaasPlusTasTransactionattestationRequest) (_result *GetBaasPlusTasTransactionattestationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetBaasPlusTasTransactionattestationResponse{}
	_body, _err := client.GetBaasPlusTasTransactionattestationEx(request, runtime)
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
func (client *Client) GetBaasPlusTasTransactionattestationEx(request *GetBaasPlusTasTransactionattestationRequest, runtime *util.RuntimeOptions) (_result *GetBaasPlusTasTransactionattestationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBaasPlusTasTransactionattestationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.tas.transactionattestation.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyFourmeta(request *QueryBaasPlusEverifyFourmetaRequest) (_result *QueryBaasPlusEverifyFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyFourmetaResponse{}
	_body, _err := client.QueryBaasPlusEverifyFourmetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyFourmetaEx(request *QueryBaasPlusEverifyFourmetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.fourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyThreemeta(request *QueryBaasPlusEverifyThreemetaRequest) (_result *QueryBaasPlusEverifyThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyThreemetaResponse{}
	_body, _err := client.QueryBaasPlusEverifyThreemetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyThreemetaEx(request *QueryBaasPlusEverifyThreemetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.threemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyTwometa(request *QueryBaasPlusEverifyTwometaRequest) (_result *QueryBaasPlusEverifyTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyTwometaResponse{}
	_body, _err := client.QueryBaasPlusEverifyTwometaEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyTwometaEx(request *QueryBaasPlusEverifyTwometaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.twometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalsearchlibrary(request *QueryBaasPlusBaicorpInternalsearchlibraryRequest) (_result *QueryBaasPlusBaicorpInternalsearchlibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.QueryBaasPlusBaicorpInternalsearchlibraryEx(request, runtime)
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
func (client *Client) QueryBaasPlusBaicorpInternalsearchlibraryEx(request *QueryBaasPlusBaicorpInternalsearchlibraryRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBaicorpInternalsearchlibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalsearchlibrary.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBaasPlusBaicorpInternalsearchlibrary(request *UpdateBaasPlusBaicorpInternalsearchlibraryRequest) (_result *UpdateBaasPlusBaicorpInternalsearchlibraryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasPlusBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.UpdateBaasPlusBaicorpInternalsearchlibraryEx(request, runtime)
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
func (client *Client) UpdateBaasPlusBaicorpInternalsearchlibraryEx(request *UpdateBaasPlusBaicorpInternalsearchlibraryRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasPlusBaicorpInternalsearchlibraryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasPlusBaicorpInternalsearchlibraryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.baicorp.internalsearchlibrary.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEpayauthRootbank(request *QueryBaasPlusEpayauthRootbankRequest) (_result *QueryBaasPlusEpayauthRootbankResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEpayauthRootbankResponse{}
	_body, _err := client.QueryBaasPlusEpayauthRootbankEx(request, runtime)
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
func (client *Client) QueryBaasPlusEpayauthRootbankEx(request *QueryBaasPlusEpayauthRootbankRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEpayauthRootbankResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEpayauthRootbankResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.rootbank.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdapplyprotEcapply(request *QueryBaasPlusYdapplyprotEcapplyRequest) (_result *QueryBaasPlusYdapplyprotEcapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdapplyprotEcapplyResponse{}
	_body, _err := client.QueryBaasPlusYdapplyprotEcapplyEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdapplyprotEcapplyEx(request *QueryBaasPlusYdapplyprotEcapplyRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdapplyprotEcapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdapplyprotEcapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydapplyprot.ecapply.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdpacprotEcpac(request *QueryBaasPlusYdpacprotEcpacRequest) (_result *QueryBaasPlusYdpacprotEcpacResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdpacprotEcpacResponse{}
	_body, _err := client.QueryBaasPlusYdpacprotEcpacEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdpacprotEcpacEx(request *QueryBaasPlusYdpacprotEcpacRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdpacprotEcpacResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdpacprotEcpacResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydpacprot.ecpac.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdauthprotTwometa(request *QueryBaasPlusYdauthprotTwometaRequest) (_result *QueryBaasPlusYdauthprotTwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdauthprotTwometaResponse{}
	_body, _err := client.QueryBaasPlusYdauthprotTwometaEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdauthprotTwometaEx(request *QueryBaasPlusYdauthprotTwometaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdauthprotTwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdauthprotTwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.twometa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdauthprotThreemeta(request *QueryBaasPlusYdauthprotThreemetaRequest) (_result *QueryBaasPlusYdauthprotThreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdauthprotThreemetaResponse{}
	_body, _err := client.QueryBaasPlusYdauthprotThreemetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdauthprotThreemetaEx(request *QueryBaasPlusYdauthprotThreemetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdauthprotThreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdauthprotThreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.threemeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdauthprotFourmeta(request *QueryBaasPlusYdauthprotFourmetaRequest) (_result *QueryBaasPlusYdauthprotFourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdauthprotFourmetaResponse{}
	_body, _err := client.QueryBaasPlusYdauthprotFourmetaEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdauthprotFourmetaEx(request *QueryBaasPlusYdauthprotFourmetaRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdauthprotFourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdauthprotFourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydauthprot.fourmeta.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdmktprotEcmarketcampaign(request *QueryBaasPlusYdmktprotEcmarketcampaignRequest) (_result *QueryBaasPlusYdmktprotEcmarketcampaignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdmktprotEcmarketcampaignResponse{}
	_body, _err := client.QueryBaasPlusYdmktprotEcmarketcampaignEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdmktprotEcmarketcampaignEx(request *QueryBaasPlusYdmktprotEcmarketcampaignRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdmktprotEcmarketcampaignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdmktprotEcmarketcampaignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydmktprot.ecmarketcampaign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusYdregprotEcregister(request *QueryBaasPlusYdregprotEcregisterRequest) (_result *QueryBaasPlusYdregprotEcregisterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusYdregprotEcregisterResponse{}
	_body, _err := client.QueryBaasPlusYdregprotEcregisterEx(request, runtime)
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
func (client *Client) QueryBaasPlusYdregprotEcregisterEx(request *QueryBaasPlusYdregprotEcregisterRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusYdregprotEcregisterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusYdregprotEcregisterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ydregprot.ecregister.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEpayauthBranchbank(request *QueryBaasPlusEpayauthBranchbankRequest) (_result *QueryBaasPlusEpayauthBranchbankResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEpayauthBranchbankResponse{}
	_body, _err := client.QueryBaasPlusEpayauthBranchbankEx(request, runtime)
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
func (client *Client) QueryBaasPlusEpayauthBranchbankEx(request *QueryBaasPlusEpayauthBranchbankRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEpayauthBranchbankResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEpayauthBranchbankResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.branchbank.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEpayauthDistrict(request *QueryBaasPlusEpayauthDistrictRequest) (_result *QueryBaasPlusEpayauthDistrictResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEpayauthDistrictResponse{}
	_body, _err := client.QueryBaasPlusEpayauthDistrictEx(request, runtime)
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
func (client *Client) QueryBaasPlusEpayauthDistrictEx(request *QueryBaasPlusEpayauthDistrictRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEpayauthDistrictResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEpayauthDistrictResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.district.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusEpayauthVerify(request *InitBaasPlusEpayauthVerifyRequest) (_result *InitBaasPlusEpayauthVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusEpayauthVerifyResponse{}
	_body, _err := client.InitBaasPlusEpayauthVerifyEx(request, runtime)
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
func (client *Client) InitBaasPlusEpayauthVerifyEx(request *InitBaasPlusEpayauthVerifyRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusEpayauthVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusEpayauthVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.verify.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEpayauthVerify(request *QueryBaasPlusEpayauthVerifyRequest) (_result *QueryBaasPlusEpayauthVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEpayauthVerifyResponse{}
	_body, _err := client.QueryBaasPlusEpayauthVerifyEx(request, runtime)
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
func (client *Client) QueryBaasPlusEpayauthVerifyEx(request *QueryBaasPlusEpayauthVerifyRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEpayauthVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEpayauthVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.epayauth.verify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBmpbrowserTransactionqrcode(request *QueryBaasPlusBmpbrowserTransactionqrcodeRequest) (_result *QueryBaasPlusBmpbrowserTransactionqrcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBmpbrowserTransactionqrcodeResponse{}
	_body, _err := client.QueryBaasPlusBmpbrowserTransactionqrcodeEx(request, runtime)
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
func (client *Client) QueryBaasPlusBmpbrowserTransactionqrcodeEx(request *QueryBaasPlusBmpbrowserTransactionqrcodeRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBmpbrowserTransactionqrcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBmpbrowserTransactionqrcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.transactionqrcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddBaasPlusBmpbrowserPrivilege(request *AddBaasPlusBmpbrowserPrivilegeRequest) (_result *AddBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.AddBaasPlusBmpbrowserPrivilegeEx(request, runtime)
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
func (client *Client) AddBaasPlusBmpbrowserPrivilegeEx(request *AddBaasPlusBmpbrowserPrivilegeRequest, runtime *util.RuntimeOptions) (_result *AddBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIdcocrIdcard(request *QueryBaasPlusIdcocrIdcardRequest) (_result *QueryBaasPlusIdcocrIdcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIdcocrIdcardResponse{}
	_body, _err := client.QueryBaasPlusIdcocrIdcardEx(request, runtime)
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
func (client *Client) QueryBaasPlusIdcocrIdcardEx(request *QueryBaasPlusIdcocrIdcardRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIdcocrIdcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIdcocrIdcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.idcocr.idcard.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusCaCertificate(request *InitBaasPlusCaCertificateRequest) (_result *InitBaasPlusCaCertificateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusCaCertificateResponse{}
	_body, _err := client.InitBaasPlusCaCertificateEx(request, runtime)
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
func (client *Client) InitBaasPlusCaCertificateEx(request *InitBaasPlusCaCertificateRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusCaCertificateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusCaCertificateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.ca.certificate.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusContentriskInternal(request *InitBaasPlusContentriskInternalRequest) (_result *InitBaasPlusContentriskInternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusContentriskInternalResponse{}
	_body, _err := client.InitBaasPlusContentriskInternalEx(request, runtime)
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
func (client *Client) InitBaasPlusContentriskInternalEx(request *InitBaasPlusContentriskInternalRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusContentriskInternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusContentriskInternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.contentrisk.internal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusContentriskInternal(request *QueryBaasPlusContentriskInternalRequest) (_result *QueryBaasPlusContentriskInternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusContentriskInternalResponse{}
	_body, _err := client.QueryBaasPlusContentriskInternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusContentriskInternalEx(request *QueryBaasPlusContentriskInternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusContentriskInternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusContentriskInternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.contentrisk.internal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusIndividualidImageauth(request *InitBaasPlusIndividualidImageauthRequest) (_result *InitBaasPlusIndividualidImageauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusIndividualidImageauthResponse{}
	_body, _err := client.InitBaasPlusIndividualidImageauthEx(request, runtime)
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
func (client *Client) InitBaasPlusIndividualidImageauthEx(request *InitBaasPlusIndividualidImageauthRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusIndividualidImageauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusIndividualidImageauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.imageauth.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddBaasPlusIotcseAccount(request *AddBaasPlusIotcseAccountRequest) (_result *AddBaasPlusIotcseAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasPlusIotcseAccountResponse{}
	_body, _err := client.AddBaasPlusIotcseAccountEx(request, runtime)
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
func (client *Client) AddBaasPlusIotcseAccountEx(request *AddBaasPlusIotcseAccountRequest, runtime *util.RuntimeOptions) (_result *AddBaasPlusIotcseAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasPlusIotcseAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.account.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SaveBaasPlusIotcseEvidence(request *SaveBaasPlusIotcseEvidenceRequest) (_result *SaveBaasPlusIotcseEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SaveBaasPlusIotcseEvidenceResponse{}
	_body, _err := client.SaveBaasPlusIotcseEvidenceEx(request, runtime)
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
func (client *Client) SaveBaasPlusIotcseEvidenceEx(request *SaveBaasPlusIotcseEvidenceRequest, runtime *util.RuntimeOptions) (_result *SaveBaasPlusIotcseEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveBaasPlusIotcseEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidence.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseEvidence(request *QueryBaasPlusIotcseEvidenceRequest) (_result *QueryBaasPlusIotcseEvidenceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseEvidenceResponse{}
	_body, _err := client.QueryBaasPlusIotcseEvidenceEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseEvidenceEx(request *QueryBaasPlusIotcseEvidenceRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseEvidenceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseEvidenceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidence.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CreateBaasPlusDidCorporatedidagent(request *CreateBaasPlusDidCorporatedidagentRequest) (_result *CreateBaasPlusDidCorporatedidagentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateBaasPlusDidCorporatedidagentResponse{}
	_body, _err := client.CreateBaasPlusDidCorporatedidagentEx(request, runtime)
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
func (client *Client) CreateBaasPlusDidCorporatedidagentEx(request *CreateBaasPlusDidCorporatedidagentRequest, runtime *util.RuntimeOptions) (_result *CreateBaasPlusDidCorporatedidagentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasPlusDidCorporatedidagentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.did.corporatedidagent.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusIndividualidFaceauthinternal(request *InitBaasPlusIndividualidFaceauthinternalRequest) (_result *InitBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.InitBaasPlusIndividualidFaceauthinternalEx(request, runtime)
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
func (client *Client) InitBaasPlusIndividualidFaceauthinternalEx(request *InitBaasPlusIndividualidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyBaasPlusIndividualidFaceauthinternal(request *CertifyBaasPlusIndividualidFaceauthinternalRequest) (_result *CertifyBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.CertifyBaasPlusIndividualidFaceauthinternalEx(request, runtime)
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
func (client *Client) CertifyBaasPlusIndividualidFaceauthinternalEx(request *CertifyBaasPlusIndividualidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *CertifyBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIndividualidFaceauthinternal(request *QueryBaasPlusIndividualidFaceauthinternalRequest) (_result *QueryBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.QueryBaasPlusIndividualidFaceauthinternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusIndividualidFaceauthinternalEx(request *QueryBaasPlusIndividualidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIndividualidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIndividualidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.individualid.faceauthinternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) InitBaasPlusEnterpriseidFaceauthinternal(request *InitBaasPlusEnterpriseidFaceauthinternalRequest) (_result *InitBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &InitBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.InitBaasPlusEnterpriseidFaceauthinternalEx(request, runtime)
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
func (client *Client) InitBaasPlusEnterpriseidFaceauthinternalEx(request *InitBaasPlusEnterpriseidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *InitBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CertifyBaasPlusEnterpriseidFaceauthinternal(request *CertifyBaasPlusEnterpriseidFaceauthinternalRequest) (_result *CertifyBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CertifyBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.CertifyBaasPlusEnterpriseidFaceauthinternalEx(request, runtime)
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
func (client *Client) CertifyBaasPlusEnterpriseidFaceauthinternalEx(request *CertifyBaasPlusEnterpriseidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *CertifyBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CertifyBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.certify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyTwometainternal(request *QueryBaasPlusEverifyTwometainternalRequest) (_result *QueryBaasPlusEverifyTwometainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyTwometainternalResponse{}
	_body, _err := client.QueryBaasPlusEverifyTwometainternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyTwometainternalEx(request *QueryBaasPlusEverifyTwometainternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyTwometainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyTwometainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.twometainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyThreemetainternal(request *QueryBaasPlusEverifyThreemetainternalRequest) (_result *QueryBaasPlusEverifyThreemetainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyThreemetainternalResponse{}
	_body, _err := client.QueryBaasPlusEverifyThreemetainternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyThreemetainternalEx(request *QueryBaasPlusEverifyThreemetainternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyThreemetainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyThreemetainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.threemetainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEverifyFourmetainternal(request *QueryBaasPlusEverifyFourmetainternalRequest) (_result *QueryBaasPlusEverifyFourmetainternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEverifyFourmetainternalResponse{}
	_body, _err := client.QueryBaasPlusEverifyFourmetainternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusEverifyFourmetainternalEx(request *QueryBaasPlusEverifyFourmetainternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEverifyFourmetainternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEverifyFourmetainternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.everify.fourmetainternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidFaceauthinternal(request *QueryBaasPlusEnterpriseidFaceauthinternalRequest) (_result *QueryBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.QueryBaasPlusEnterpriseidFaceauthinternalEx(request, runtime)
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
func (client *Client) QueryBaasPlusEnterpriseidFaceauthinternalEx(request *QueryBaasPlusEnterpriseidFaceauthinternalRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusEnterpriseidFaceauthinternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusEnterpriseidFaceauthinternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.enterpriseid.faceauthinternal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddBaasPlusIotcseThingsdid(request *AddBaasPlusIotcseThingsdidRequest) (_result *AddBaasPlusIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.AddBaasPlusIotcseThingsdidEx(request, runtime)
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
func (client *Client) AddBaasPlusIotcseThingsdidEx(request *AddBaasPlusIotcseThingsdidRequest, runtime *util.RuntimeOptions) (_result *AddBaasPlusIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBaasPlusIotcseThingsdid(request *UpdateBaasPlusIotcseThingsdidRequest) (_result *UpdateBaasPlusIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.UpdateBaasPlusIotcseThingsdidEx(request, runtime)
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
func (client *Client) UpdateBaasPlusIotcseThingsdidEx(request *UpdateBaasPlusIotcseThingsdidRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasPlusIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseThingsdid(request *QueryBaasPlusIotcseThingsdidRequest) (_result *QueryBaasPlusIotcseThingsdidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.QueryBaasPlusIotcseThingsdidEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseThingsdidEx(request *QueryBaasPlusIotcseThingsdidRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseThingsdidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseThingsdidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.thingsdid.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseAsyncprocess(request *QueryBaasPlusIotcseAsyncprocessRequest) (_result *QueryBaasPlusIotcseAsyncprocessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseAsyncprocessResponse{}
	_body, _err := client.QueryBaasPlusIotcseAsyncprocessEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseAsyncprocessEx(request *QueryBaasPlusIotcseAsyncprocessRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseAsyncprocessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseAsyncprocessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.asyncprocess.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecBaasPlusIotcseGroup(request *ExecBaasPlusIotcseGroupRequest) (_result *ExecBaasPlusIotcseGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecBaasPlusIotcseGroupResponse{}
	_body, _err := client.ExecBaasPlusIotcseGroupEx(request, runtime)
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
func (client *Client) ExecBaasPlusIotcseGroupEx(request *ExecBaasPlusIotcseGroupRequest, runtime *util.RuntimeOptions) (_result *ExecBaasPlusIotcseGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecBaasPlusIotcseGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.group.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseGroupdevice(request *QueryBaasPlusIotcseGroupdeviceRequest) (_result *QueryBaasPlusIotcseGroupdeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseGroupdeviceResponse{}
	_body, _err := client.QueryBaasPlusIotcseGroupdeviceEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseGroupdeviceEx(request *QueryBaasPlusIotcseGroupdeviceRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseGroupdeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseGroupdeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.groupdevice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseDevicegroup(request *QueryBaasPlusIotcseDevicegroupRequest) (_result *QueryBaasPlusIotcseDevicegroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseDevicegroupResponse{}
	_body, _err := client.QueryBaasPlusIotcseDevicegroupEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseDevicegroupEx(request *QueryBaasPlusIotcseDevicegroupRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseDevicegroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseDevicegroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicegroup.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseTenantdevice(request *QueryBaasPlusIotcseTenantdeviceRequest) (_result *QueryBaasPlusIotcseTenantdeviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseTenantdeviceResponse{}
	_body, _err := client.QueryBaasPlusIotcseTenantdeviceEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseTenantdeviceEx(request *QueryBaasPlusIotcseTenantdeviceRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseTenantdeviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseTenantdeviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.tenantdevice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBaasPlusIotcseDevicestatus(request *UpdateBaasPlusIotcseDevicestatusRequest) (_result *UpdateBaasPlusIotcseDevicestatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasPlusIotcseDevicestatusResponse{}
	_body, _err := client.UpdateBaasPlusIotcseDevicestatusEx(request, runtime)
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
func (client *Client) UpdateBaasPlusIotcseDevicestatusEx(request *UpdateBaasPlusIotcseDevicestatusRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasPlusIotcseDevicestatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasPlusIotcseDevicestatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicestatus.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseDevicemodel(request *QueryBaasPlusIotcseDevicemodelRequest) (_result *QueryBaasPlusIotcseDevicemodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseDevicemodelResponse{}
	_body, _err := client.QueryBaasPlusIotcseDevicemodelEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseDevicemodelEx(request *QueryBaasPlusIotcseDevicemodelRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseDevicemodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseDevicemodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicemodel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) UpdateBaasPlusIotcseDevicespace(request *UpdateBaasPlusIotcseDevicespaceRequest) (_result *UpdateBaasPlusIotcseDevicespaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &UpdateBaasPlusIotcseDevicespaceResponse{}
	_body, _err := client.UpdateBaasPlusIotcseDevicespaceEx(request, runtime)
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
func (client *Client) UpdateBaasPlusIotcseDevicespaceEx(request *UpdateBaasPlusIotcseDevicespaceRequest, runtime *util.RuntimeOptions) (_result *UpdateBaasPlusIotcseDevicespaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasPlusIotcseDevicespaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.devicespace.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusIotcseEvidencebatch(request *QueryBaasPlusIotcseEvidencebatchRequest) (_result *QueryBaasPlusIotcseEvidencebatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusIotcseEvidencebatchResponse{}
	_body, _err := client.QueryBaasPlusIotcseEvidencebatchEx(request, runtime)
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
func (client *Client) QueryBaasPlusIotcseEvidencebatchEx(request *QueryBaasPlusIotcseEvidencebatchRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusIotcseEvidencebatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusIotcseEvidencebatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.iotcse.evidencebatch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBlocrBusinesslicense(request *QueryBaasPlusBlocrBusinesslicenseRequest) (_result *QueryBaasPlusBlocrBusinesslicenseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBlocrBusinesslicenseResponse{}
	_body, _err := client.QueryBaasPlusBlocrBusinesslicenseEx(request, runtime)
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
func (client *Client) QueryBaasPlusBlocrBusinesslicenseEx(request *QueryBaasPlusBlocrBusinesslicenseRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBlocrBusinesslicenseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBlocrBusinesslicenseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.blocr.businesslicense.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusInvoicesocrVatinvoice(request *QueryBaasPlusInvoicesocrVatinvoiceRequest) (_result *QueryBaasPlusInvoicesocrVatinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusInvoicesocrVatinvoiceResponse{}
	_body, _err := client.QueryBaasPlusInvoicesocrVatinvoiceEx(request, runtime)
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
func (client *Client) QueryBaasPlusInvoicesocrVatinvoiceEx(request *QueryBaasPlusInvoicesocrVatinvoiceRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusInvoicesocrVatinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusInvoicesocrVatinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.invoicesocr.vatinvoice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryBaasPlusBmpbrowserPrivilege(request *QueryBaasPlusBmpbrowserPrivilegeRequest) (_result *QueryBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.QueryBaasPlusBmpbrowserPrivilegeEx(request, runtime)
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
func (client *Client) QueryBaasPlusBmpbrowserPrivilegeEx(request *QueryBaasPlusBmpbrowserPrivilegeRequest, runtime *util.RuntimeOptions) (_result *QueryBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) CancelBaasPlusBmpbrowserPrivilege(request *CancelBaasPlusBmpbrowserPrivilegeRequest) (_result *CancelBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CancelBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.CancelBaasPlusBmpbrowserPrivilegeEx(request, runtime)
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
func (client *Client) CancelBaasPlusBmpbrowserPrivilegeEx(request *CancelBaasPlusBmpbrowserPrivilegeRequest, runtime *util.RuntimeOptions) (_result *CancelBaasPlusBmpbrowserPrivilegeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelBaasPlusBmpbrowserPrivilegeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.plus.bmpbrowser.privilege.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
